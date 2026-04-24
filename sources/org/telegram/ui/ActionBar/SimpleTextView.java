package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public class SimpleTextView extends View implements Drawable.Callback {
    private boolean attachedToWindow;
    private boolean buildFullLayout;
    private boolean canHideRightDrawable;
    private int currentScrollDelay;
    private int drawablePadding;
    private boolean ellipsizeByGradient;
    private boolean ellipsizeByGradientLeft;
    private int ellipsizeByGradientWidthDp;
    private int emojiCacheType;
    private AnimatedEmojiSpan.EmojiGroupedSpans emojiStack;
    private ColorFilter emojiStackColorFilter;
    private Paint fadeEllpsizePaint;
    private int fadeEllpsizePaintWidth;
    private Paint fadePaint;
    private Paint fadePaintBack;
    private Layout firstLineLayout;
    private Boolean forceEllipsizeByGradientLeft;
    private float fullAlpha;
    private Layout fullLayout;
    private int fullLayoutAdditionalWidth;
    private float fullLayoutLeftCharactersOffset;
    private int fullLayoutLeftOffset;
    private int fullTextMaxLines;
    private int gravity;
    private long lastUpdateTime;
    private int lastWidth;
    private Layout layout;
    private float layoutX;
    private float layoutY;
    private Drawable leftDrawable;
    private boolean leftDrawableOutside;
    private int leftDrawableTopPadding;
    private Layout.Alignment mAlignment;
    private int maxLines;
    private boolean maybeClick;
    private int minWidth;
    private int minusWidth;
    private int offsetX;
    private int offsetY;
    private int paddingRight;
    private Layout partLayout;
    private Path path;
    private Drawable replacedDrawable;
    private String replacedText;
    private int replacingDrawableTextIndex;
    private float replacingDrawableTextOffset;
    private Drawable rightDrawable;
    private Drawable rightDrawable2;
    private boolean rightDrawableHidden;
    private boolean rightDrawableInside;
    private View.OnClickListener rightDrawableOnClickListener;
    private boolean rightDrawableOutside;
    private float rightDrawableScale;
    private int rightDrawableTopPadding;
    public int rightDrawableX;
    public int rightDrawableY;
    private boolean scrollNonFitText;
    private float scrollingOffset;
    private List spoilers;
    private Stack spoilersPool;
    private CharSequence text;
    private boolean textDoesNotFit;
    private int textHeight;
    private TextPaint textPaint;
    private int textWidth;
    private int totalWidth;
    private float touchDownX;
    private float touchDownY;
    private boolean usaAlphaForEmoji;
    private boolean wasLayout;
    private boolean widthWrapContent;
    private Drawable wrapBackgroundDrawable;

    public interface PressableDrawable {
        void setPressed(boolean z);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setEmojiColor(int i) {
        this.emojiStackColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public SimpleTextView(Context context) {
        super(context);
        this.gravity = 51;
        this.maxLines = 1;
        this.rightDrawableScale = 1.0f;
        this.drawablePadding = AndroidUtilities.dp(4.0f);
        this.ellipsizeByGradientWidthDp = 16;
        this.fullTextMaxLines = 3;
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack();
        this.path = new Path();
        this.emojiCacheType = 0;
        this.mAlignment = Layout.Alignment.ALIGN_NORMAL;
        this.textPaint = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    public void setTextColor(int i) {
        this.textPaint.setColor(i);
        invalidate();
    }

    public void setLinkTextColor(int i) {
        this.textPaint.linkColor = i;
        invalidate();
    }

    public Layout getLayout() {
        return this.layout;
    }

    public float getLayoutX() {
        return this.layoutX;
    }

    public float getLayoutY() {
        return this.layoutY;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.emojiStack = AnimatedEmojiSpan.update(this.emojiCacheType, this, this.emojiStack, this.layout);
    }

    public void setEmojiCacheType(int i) {
        if (i != this.emojiCacheType) {
            AnimatedEmojiSpan.release(this, this.emojiStack);
            this.emojiCacheType = i;
            if (this.attachedToWindow) {
                this.emojiStack = AnimatedEmojiSpan.update(i, this, this.emojiStack, this.layout);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        AnimatedEmojiSpan.release(this, this.emojiStack);
        this.wasLayout = false;
    }

    public void setTextSize(int i) {
        float fDp = AndroidUtilities.dp(i);
        if (fDp == this.textPaint.getTextSize()) {
            return;
        }
        this.textPaint.setTextSize(fDp);
        if (recreateLayoutMaybe()) {
            return;
        }
        invalidate();
    }

    public void setBuildFullLayout(boolean z) {
        this.buildFullLayout = z;
    }

    public void setFullAlpha(float f) {
        this.fullAlpha = f;
        invalidate();
    }

    public float getFullAlpha() {
        return this.fullAlpha;
    }

    public void setScrollNonFitText(boolean z) {
        if (this.scrollNonFitText == z) {
            return;
        }
        this.scrollNonFitText = z;
        updateFadePaints();
        requestLayout();
        checkUi_layerType();
    }

    public void setEllipsizeByGradient(boolean z) {
        setEllipsizeByGradient(z, (Boolean) null);
    }

    public void setEllipsizeByGradient(int i) {
        setEllipsizeByGradient(i, (Boolean) null);
    }

    public void setEllipsizeByGradient(boolean z, Boolean bool) {
        if (this.scrollNonFitText == z) {
            return;
        }
        this.ellipsizeByGradient = z;
        this.forceEllipsizeByGradientLeft = bool;
        updateFadePaints();
        checkUi_layerType();
    }

    public void setEllipsizeByGradient(int i, Boolean bool) {
        setEllipsizeByGradient(true, bool);
        this.ellipsizeByGradientWidthDp = i;
        updateFadePaints();
    }

    public void setWidthWrapContent(boolean z) {
        this.widthWrapContent = z;
    }

    private void updateFadePaints() {
        if ((this.fadePaint == null || this.fadePaintBack == null) && this.scrollNonFitText) {
            Paint paint = new Paint();
            this.fadePaint = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.fadePaint;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.fadePaintBack = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.fadePaintBack.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.forceEllipsizeByGradientLeft;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (!(this.fadeEllpsizePaint != null && this.fadeEllpsizePaintWidth == AndroidUtilities.dp(this.ellipsizeByGradientWidthDp) && this.ellipsizeByGradientLeft == zBooleanValue) && this.ellipsizeByGradient) {
            if (this.fadeEllpsizePaint == null) {
                this.fadeEllpsizePaint = new Paint();
            }
            this.ellipsizeByGradientLeft = zBooleanValue;
            if (zBooleanValue) {
                Paint paint4 = this.fadeEllpsizePaint;
                int iDp = AndroidUtilities.dp(this.ellipsizeByGradientWidthDp);
                this.fadeEllpsizePaintWidth = iDp;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                Paint paint5 = this.fadeEllpsizePaint;
                int iDp2 = AndroidUtilities.dp(this.ellipsizeByGradientWidthDp);
                this.fadeEllpsizePaintWidth = iDp2;
                paint5.setShader(new LinearGradient(0.0f, 0.0f, iDp2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.fadeEllpsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    public void setMaxLines(int i) {
        this.maxLines = i;
    }

    public void setGravity(int i) {
        this.gravity = i;
    }

    public void setTypeface(Typeface typeface) {
        this.textPaint.setTypeface(typeface);
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.leftDrawable;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.drawablePadding : 0;
        if (this.rightDrawable != null) {
            intrinsicWidth += ((int) (r1.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
        }
        return this.rightDrawable2 != null ? intrinsicWidth + ((int) (r1.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding : intrinsicWidth;
    }

    public TextPaint getPaint() {
        return this.textPaint;
    }

    private void calcOffset(int i) {
        int intrinsicWidth;
        Layout layout = this.layout;
        if (layout == null) {
            return;
        }
        if (layout.getLineCount() > 0) {
            this.textWidth = (int) Math.max(Math.ceil(this.layout.getLineWidth(0)), Math.ceil(this.layout.getLineRight(0) - this.layout.getLineLeft(0)));
            Layout layout2 = this.fullLayout;
            if (layout2 != null) {
                this.textHeight = layout2.getLineBottom(layout2.getLineCount() - 1);
            } else if (this.maxLines > 1 && this.layout.getLineCount() > 0) {
                Layout layout3 = this.layout;
                this.textHeight = layout3.getLineBottom(layout3.getLineCount() - 1);
            } else {
                this.textHeight = this.layout.getLineBottom(0);
            }
            int i2 = this.gravity & 7;
            if (i2 == 1) {
                this.offsetX = ((i - this.textWidth) / 2) - ((int) this.layout.getLineLeft(0));
            } else if (i2 == 3) {
                Layout layout4 = this.firstLineLayout;
                if (layout4 != null) {
                    this.offsetX = -((int) layout4.getLineLeft(0));
                } else {
                    this.offsetX = -((int) this.layout.getLineLeft(0));
                }
            } else if (this.layout.getLineLeft(0) == 0.0f) {
                Layout layout5 = this.firstLineLayout;
                if (layout5 != null) {
                    this.offsetX = (int) (i - layout5.getLineWidth(0));
                } else {
                    this.offsetX = i - this.textWidth;
                }
            } else {
                this.offsetX = -AndroidUtilities.dp(8.0f);
            }
            this.offsetX += getPaddingLeft();
            if (this.rightDrawableInside) {
                intrinsicWidth = (this.rightDrawable == null || this.rightDrawableOutside) ? 0 : (int) (r0.getIntrinsicWidth() * this.rightDrawableScale);
                if (this.rightDrawable2 != null && !this.rightDrawableOutside) {
                    intrinsicWidth += (int) (r4.getIntrinsicWidth() * this.rightDrawableScale);
                }
            } else {
                intrinsicWidth = 0;
            }
            this.textDoesNotFit = this.textWidth + intrinsicWidth > i - this.paddingRight;
            checkUi_layerType();
            Layout layout6 = this.fullLayout;
            if (layout6 != null && this.fullLayoutAdditionalWidth > 0) {
                this.fullLayoutLeftCharactersOffset = layout6.getPrimaryHorizontal(0) - this.firstLineLayout.getPrimaryHorizontal(0);
            }
        }
        int i3 = this.replacingDrawableTextIndex;
        if (i3 >= 0) {
            this.replacingDrawableTextOffset = this.layout.getPrimaryHorizontal(i3);
        } else {
            this.replacingDrawableTextOffset = 0.0f;
        }
    }

    protected boolean createLayout(int i) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int i2;
        CharSequence charSequenceSubSequence;
        CharSequence charSequence = this.text;
        this.replacingDrawableTextIndex = -1;
        this.rightDrawableHidden = false;
        if (charSequence != null) {
            try {
                Drawable drawable = this.leftDrawable;
                if (drawable == null || this.leftDrawableOutside) {
                    intrinsicWidth = i;
                } else {
                    drawable.getIntrinsicWidth();
                    intrinsicWidth = (i - this.leftDrawable.getIntrinsicWidth()) - this.drawablePadding;
                }
                if (this.rightDrawableInside) {
                    intrinsicWidth2 = 0;
                } else {
                    if (this.rightDrawable == null || this.rightDrawableOutside) {
                        intrinsicWidth2 = 0;
                    } else {
                        intrinsicWidth2 = (int) (r3.getIntrinsicWidth() * this.rightDrawableScale);
                        intrinsicWidth = (intrinsicWidth - intrinsicWidth2) - this.drawablePadding;
                    }
                    if (this.rightDrawable2 != null && !this.rightDrawableOutside) {
                        intrinsicWidth2 += (int) (r4.getIntrinsicWidth() * this.rightDrawableScale);
                        intrinsicWidth = (intrinsicWidth - intrinsicWidth2) - this.drawablePadding;
                    }
                }
                CharSequence charSequence2 = charSequence;
                if (this.replacedText != null) {
                    charSequence2 = charSequence;
                    if (this.replacedDrawable != null) {
                        int iIndexOf = charSequence.toString().indexOf(this.replacedText);
                        this.replacingDrawableTextIndex = iIndexOf;
                        if (iIndexOf >= 0) {
                            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                            DialogCell.FixedWidthSpan fixedWidthSpan = new DialogCell.FixedWidthSpan(this.replacedDrawable.getIntrinsicWidth());
                            int i3 = this.replacingDrawableTextIndex;
                            spannableStringBuilderValueOf.setSpan(fixedWidthSpan, i3, this.replacedText.length() + i3, 0);
                            charSequence2 = spannableStringBuilderValueOf;
                        } else {
                            intrinsicWidth = (intrinsicWidth - this.replacedDrawable.getIntrinsicWidth()) - this.drawablePadding;
                            charSequence2 = charSequence;
                        }
                    }
                }
                if (this.canHideRightDrawable && intrinsicWidth2 != 0 && !this.rightDrawableOutside && !charSequence2.equals(TextUtils.ellipsize(charSequence2, this.textPaint, intrinsicWidth, TextUtils.TruncateAt.END))) {
                    this.rightDrawableHidden = true;
                    intrinsicWidth = intrinsicWidth + intrinsicWidth2 + this.drawablePadding;
                }
                int i4 = intrinsicWidth;
                if (this.buildFullLayout) {
                    CharSequence charSequenceEllipsize = !this.ellipsizeByGradient ? TextUtils.ellipsize(charSequence2, this.textPaint, i4, TextUtils.TruncateAt.END) : charSequence2;
                    if (!this.ellipsizeByGradient && !charSequenceEllipsize.equals(charSequence2)) {
                        TextPaint textPaint = this.textPaint;
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(charSequence2, textPaint, i4, alignment, 1.0f, 0.0f, false, truncateAt, i4, this.fullTextMaxLines, false);
                        this.fullLayout = staticLayoutCreateStaticLayout;
                        if (staticLayoutCreateStaticLayout != null) {
                            int lineEnd = staticLayoutCreateStaticLayout.getLineEnd(0);
                            int lineStart = this.fullLayout.getLineStart(1);
                            CharSequence charSequenceSubSequence2 = charSequence2.subSequence(0, lineEnd);
                            SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(charSequence2);
                            spannableStringBuilderValueOf2.setSpan(new EmptyStubSpan(), 0, lineStart, 0);
                            if (lineEnd < charSequenceEllipsize.length()) {
                                charSequenceSubSequence = charSequenceEllipsize.subSequence(lineEnd, charSequenceEllipsize.length());
                            } else {
                                charSequenceSubSequence = "…";
                            }
                            this.firstLineLayout = new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i4, getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(charSequenceSubSequence2, 0, charSequenceSubSequence2.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i4, getAlignment(), 1.0f, 0.0f, false);
                            this.layout = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                charSequenceSubSequence = "\u200f" + ((Object) charSequenceSubSequence);
                            }
                            CharSequence charSequence3 = charSequenceSubSequence;
                            this.partLayout = new StaticLayout(charSequence3, 0, charSequence3.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i4, getAlignment(), 1.0f, 0.0f, false);
                            this.fullLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilderValueOf2, this.textPaint, AndroidUtilities.dp(8.0f) + i4 + this.fullLayoutAdditionalWidth, getAlignment(), 1.0f, 0.0f, false, truncateAt, i4 + this.fullLayoutAdditionalWidth, this.fullTextMaxLines, false);
                        }
                    } else {
                        this.layout = new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), this.textPaint, (this.scrollNonFitText || this.ellipsizeByGradient) ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i4, getAlignment(), 1.0f, 0.0f, false);
                        this.fullLayout = null;
                        this.partLayout = null;
                        this.firstLineLayout = null;
                    }
                } else if (this.maxLines > 1) {
                    this.layout = StaticLayoutEx.createStaticLayout(charSequence2, this.textPaint, i4, getAlignment(), 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i4, this.maxLines, false);
                } else {
                    CharSequence charSequenceEllipsize2 = charSequence2;
                    if (!this.scrollNonFitText) {
                        charSequenceEllipsize2 = this.ellipsizeByGradient ? charSequence2 : TextUtils.ellipsize(charSequence2, this.textPaint, i4, TextUtils.TruncateAt.END);
                    }
                    CharSequence charSequence4 = charSequenceEllipsize2;
                    this.layout = new StaticLayout(charSequence4, 0, charSequence4.length(), this.textPaint, (this.scrollNonFitText || this.ellipsizeByGradient) ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i4, getAlignment(), 1.0f, 0.0f, false);
                }
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                Layout layout = this.layout;
                if (layout == null || !(layout.getText() instanceof Spannable)) {
                    i2 = i4;
                } else {
                    i2 = i4;
                    SpoilerEffect.addSpoilers(this, this.layout, -2, -2, this.spoilersPool, this.spoilers);
                }
                calcOffset(i2);
            } catch (Exception unused) {
            }
        } else {
            this.layout = null;
            this.textWidth = 0;
            this.textHeight = 0;
        }
        AnimatedEmojiSpan.release(this, this.emojiStack);
        if (this.attachedToWindow) {
            this.emojiStack = AnimatedEmojiSpan.update(this.emojiCacheType, this, this.emojiStack, this.layout);
        }
        invalidate();
        return true;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.mAlignment = alignment;
        requestLayout();
    }

    private Layout.Alignment getAlignment() {
        return this.mAlignment;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.lastWidth;
        int i4 = AndroidUtilities.displaySize.x;
        if (i3 != i4) {
            this.lastWidth = i4;
            this.scrollingOffset = 0.0f;
            this.currentScrollDelay = 500;
            checkUi_layerType();
        }
        int intrinsicWidth = 0;
        createLayout((((((size - getPaddingLeft()) - getPaddingRight()) - this.minusWidth) - ((!this.leftDrawableOutside || (drawable6 = this.leftDrawable) == null) ? 0 : drawable6.getIntrinsicWidth() + this.drawablePadding)) - ((!this.rightDrawableOutside || (drawable5 = this.rightDrawable) == null) ? 0 : drawable5.getIntrinsicWidth() + this.drawablePadding)) - ((!this.rightDrawableOutside || (drawable4 = this.rightDrawable2) == null) ? 0 : drawable4.getIntrinsicWidth() + this.drawablePadding));
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.textHeight;
        }
        if (this.widthWrapContent) {
            int paddingLeft = getPaddingLeft() + this.textWidth + getPaddingRight() + this.minusWidth + ((!this.leftDrawableOutside || (drawable3 = this.leftDrawable) == null) ? 0 : drawable3.getIntrinsicWidth() + this.drawablePadding) + ((!this.rightDrawableOutside || (drawable2 = this.rightDrawable) == null) ? 0 : drawable2.getIntrinsicWidth() + this.drawablePadding);
            if (this.rightDrawableOutside && (drawable = this.rightDrawable2) != null) {
                intrinsicWidth = drawable.getIntrinsicWidth() + this.drawablePadding;
            }
            size = Math.min(size, paddingLeft + intrinsicWidth);
        }
        setMeasuredDimension(size, size2);
        if ((this.gravity & 112) == 16) {
            this.offsetY = getPaddingTop() + ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.textHeight) / 2);
        } else {
            this.offsetY = getPaddingTop();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.wasLayout = true;
    }

    public int getTextWidth() {
        int i = this.textWidth;
        if (this.rightDrawableInside) {
            intrinsicWidth = (this.rightDrawable2 != null ? (int) (r3.getIntrinsicWidth() * this.rightDrawableScale) : 0) + (this.rightDrawable != null ? (int) (r1.getIntrinsicWidth() * this.rightDrawableScale) : 0);
        }
        return i + intrinsicWidth;
    }

    public int getRightDrawableWidth() {
        if (this.rightDrawable == null) {
            return 0;
        }
        return (int) (this.drawablePadding + (r0.getIntrinsicWidth() * this.rightDrawableScale));
    }

    public int getTextHeight() {
        return this.textHeight;
    }

    public void setLeftDrawableTopPadding(int i) {
        this.leftDrawableTopPadding = i;
    }

    public void setRightDrawableTopPadding(int i) {
        this.rightDrawableTopPadding = i;
    }

    public void setLeftDrawable(int i) {
        setLeftDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
    }

    public Drawable getLeftDrawable() {
        return this.leftDrawable;
    }

    public void setRightDrawable(int i) {
        setRightDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.maxLines > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.wrapBackgroundDrawable = drawable;
        }
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.wrapBackgroundDrawable;
        return drawable != null ? drawable : super.getBackground();
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.leftDrawable;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.leftDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (recreateLayoutMaybe()) {
            return;
        }
        invalidate();
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.rightDrawable || drawable == this.rightDrawable2 || drawable == this.leftDrawable || super.verifyDrawable(drawable);
    }

    public void replaceTextWithDrawable(Drawable drawable, String str) {
        Drawable drawable2 = this.replacedDrawable;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.replacedDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (!recreateLayoutMaybe()) {
            invalidate();
        }
        this.replacedText = str;
    }

    public void setMinusWidth(int i) {
        if (i == this.minusWidth) {
            return;
        }
        this.minusWidth = i;
        if (recreateLayoutMaybe()) {
            return;
        }
        invalidate();
    }

    public Drawable getRightDrawable() {
        return this.rightDrawable;
    }

    public boolean setRightDrawable(Drawable drawable) {
        Drawable drawable2 = this.rightDrawable;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.rightDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (recreateLayoutMaybe()) {
            return true;
        }
        invalidate();
        return true;
    }

    public boolean setRightDrawable2(Drawable drawable) {
        Drawable drawable2 = this.rightDrawable2;
        if (drawable2 == drawable) {
            return false;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.rightDrawable2 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (recreateLayoutMaybe()) {
            return true;
        }
        invalidate();
        return true;
    }

    public Drawable getRightDrawable2() {
        return this.rightDrawable2;
    }

    public void setRightDrawableScale(float f) {
        this.rightDrawableScale = f;
    }

    public void setSideDrawablesColor(int i) {
        Theme.setDrawableColor(this.rightDrawable, i);
        Theme.setDrawableColor(this.leftDrawable, i);
    }

    public boolean setText(CharSequence charSequence) {
        return setText(charSequence, false);
    }

    public boolean setText(CharSequence charSequence, boolean z) {
        CharSequence charSequence2 = this.text;
        if (charSequence2 == null && charSequence == null) {
            return false;
        }
        if (!z && charSequence2 != null && charSequence2.equals(charSequence)) {
            return false;
        }
        this.text = charSequence;
        this.currentScrollDelay = 500;
        recreateLayoutMaybe();
        return true;
    }

    public void resetScrolling() {
        this.scrollingOffset = 0.0f;
        checkUi_layerType();
    }

    public void copyScrolling(SimpleTextView simpleTextView) {
        this.scrollingOffset = simpleTextView.scrollingOffset;
        checkUi_layerType();
    }

    public void setDrawablePadding(int i) {
        if (this.drawablePadding == i) {
            return;
        }
        this.drawablePadding = i;
        if (recreateLayoutMaybe()) {
            return;
        }
        invalidate();
    }

    private boolean recreateLayoutMaybe() {
        if (this.wasLayout && getMeasuredHeight() != 0 && !this.buildFullLayout) {
            boolean zCreateLayout = createLayout(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.minusWidth);
            if ((this.gravity & 112) == 16) {
                this.offsetY = (getMeasuredHeight() - this.textHeight) / 2;
            } else {
                this.offsetY = getPaddingTop();
            }
            return zCreateLayout;
        }
        requestLayout();
        return true;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.text;
        return charSequence == null ? "" : charSequence;
    }

    public int getLineCount() {
        Layout layout = this.layout;
        int lineCount = layout != null ? layout.getLineCount() : 0;
        Layout layout2 = this.fullLayout;
        return layout2 != null ? lineCount + layout2.getLineCount() : lineCount;
    }

    public int getTextStartX() {
        int intrinsicWidth = 0;
        if (this.layout == null) {
            return 0;
        }
        Drawable drawable = this.leftDrawable;
        if (drawable != null && (this.gravity & 7) == 3) {
            intrinsicWidth = this.drawablePadding + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.replacedDrawable;
        if (drawable2 != null && this.replacingDrawableTextIndex < 0 && (this.gravity & 7) == 3) {
            intrinsicWidth += this.drawablePadding + drawable2.getIntrinsicWidth();
        }
        return ((int) getX()) + this.offsetX + intrinsicWidth;
    }

    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public int getTextStartY() {
        if (this.layout == null) {
            return 0;
        }
        return (int) getY();
    }

    public void setRightPadding(int i) {
        if (this.paddingRight != i) {
            this.paddingRight = i;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.minusWidth;
            Drawable drawable = this.leftDrawable;
            if (drawable != null && !this.leftDrawableOutside) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.drawablePadding;
            }
            int intrinsicWidth = 0;
            if (!this.rightDrawableInside) {
                if (this.rightDrawable != null && !this.rightDrawableOutside) {
                    intrinsicWidth = (int) (r0.getIntrinsicWidth() * this.rightDrawableScale);
                    maxTextWidth = (maxTextWidth - intrinsicWidth) - this.drawablePadding;
                }
                if (this.rightDrawable2 != null && !this.rightDrawableOutside) {
                    intrinsicWidth = (int) (r0.getIntrinsicWidth() * this.rightDrawableScale);
                    maxTextWidth = (maxTextWidth - intrinsicWidth) - this.drawablePadding;
                }
            }
            if (this.replacedText != null && this.replacedDrawable != null) {
                int iIndexOf = this.text.toString().indexOf(this.replacedText);
                this.replacingDrawableTextIndex = iIndexOf;
                if (iIndexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.replacedDrawable.getIntrinsicWidth()) - this.drawablePadding;
                }
            }
            if (this.canHideRightDrawable && intrinsicWidth != 0 && !this.rightDrawableOutside) {
                if (!this.text.equals(TextUtils.ellipsize(this.text, this.textPaint, maxTextWidth, TextUtils.TruncateAt.END))) {
                    this.rightDrawableHidden = true;
                    maxTextWidth = maxTextWidth + intrinsicWidth + this.drawablePadding;
                }
            }
            calcOffset(maxTextWidth);
            invalidate();
        }
    }

    private void checkUi_layerType() {
        int i = ((!this.scrollNonFitText || (!this.textDoesNotFit && this.scrollingOffset == 0.0f)) && !this.ellipsizeByGradient) ? 0 : 2;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int intrinsicWidth;
        int paddingTop;
        int i;
        int paddingTop2;
        int i2;
        int paddingTop3;
        int i3;
        int paddingTop4;
        int i4;
        int paddingTop5;
        float fDp;
        int paddingTop6;
        int i5;
        int paddingTop7;
        int i6;
        int paddingTop8;
        int i7;
        int paddingTop9;
        int i8;
        int paddingTop10;
        int i9;
        int intrinsicHeight;
        int paddingTop11;
        int i10;
        super.onDraw(canvas);
        this.layoutX = 0.0f;
        this.layoutY = 0.0f;
        boolean z = this.scrollNonFitText && (this.textDoesNotFit || this.scrollingOffset != 0.0f);
        this.totalWidth = this.textWidth;
        Drawable drawable = this.leftDrawable;
        if (drawable != null && !this.leftDrawableOutside) {
            int i11 = (int) (-this.scrollingOffset);
            int i12 = this.gravity;
            if ((i12 & 7) == 1) {
                i11 += this.offsetX;
            }
            if ((i12 & 112) == 16) {
                paddingTop11 = (getMeasuredHeight() - this.leftDrawable.getIntrinsicHeight()) / 2;
                i10 = this.leftDrawableTopPadding;
            } else {
                paddingTop11 = getPaddingTop() + ((this.textHeight - this.leftDrawable.getIntrinsicHeight()) / 2);
                i10 = this.leftDrawableTopPadding;
            }
            int i13 = paddingTop11 + i10;
            Drawable drawable2 = this.leftDrawable;
            drawable2.setBounds(i11, i13, drawable2.getIntrinsicWidth() + i11, this.leftDrawable.getIntrinsicHeight() + i13);
            this.leftDrawable.draw(canvas);
            int i14 = this.gravity & 7;
            intrinsicWidth = (i14 == 3 || i14 == 1) ? this.drawablePadding + this.leftDrawable.getIntrinsicWidth() : 0;
            this.totalWidth += this.drawablePadding + this.leftDrawable.getIntrinsicWidth();
        } else {
            intrinsicWidth = (!this.leftDrawableOutside || drawable == null) ? 0 : drawable.getIntrinsicWidth() + this.drawablePadding;
        }
        Drawable drawable3 = this.replacedDrawable;
        if (drawable3 != null && this.replacedText != null) {
            int i15 = (int) ((-this.scrollingOffset) + this.replacingDrawableTextOffset);
            int i16 = this.gravity;
            if ((i16 & 7) == 1) {
                i15 += this.offsetX;
            }
            if ((i16 & 112) == 16) {
                intrinsicHeight = ((getMeasuredHeight() - this.replacedDrawable.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
            } else {
                intrinsicHeight = this.leftDrawableTopPadding + ((this.textHeight - drawable3.getIntrinsicHeight()) / 2);
            }
            Drawable drawable4 = this.replacedDrawable;
            drawable4.setBounds(i15, intrinsicHeight, drawable4.getIntrinsicWidth() + i15, this.replacedDrawable.getIntrinsicHeight() + intrinsicHeight);
            this.replacedDrawable.draw(canvas);
            if (this.replacingDrawableTextIndex < 0) {
                int i17 = this.gravity & 7;
                if (i17 == 3 || i17 == 1) {
                    intrinsicWidth += this.drawablePadding + this.replacedDrawable.getIntrinsicWidth();
                }
                this.totalWidth += this.drawablePadding + this.replacedDrawable.getIntrinsicWidth();
            }
        }
        int i18 = intrinsicWidth;
        if (this.rightDrawable != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && !this.rightDrawableInside) {
            int i19 = this.textWidth + i18 + this.drawablePadding + ((int) (-this.scrollingOffset));
            int i20 = this.gravity & 7;
            if (i20 == 1 || i20 == 5) {
                i19 += this.offsetX;
            }
            int intrinsicWidth2 = (int) (r2.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight2 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
            if ((this.gravity & 112) == 16) {
                paddingTop10 = (getMeasuredHeight() - intrinsicHeight2) / 2;
                i9 = this.rightDrawableTopPadding;
            } else {
                paddingTop10 = getPaddingTop() + ((this.textHeight - intrinsicHeight2) / 2);
                i9 = this.rightDrawableTopPadding;
            }
            int i21 = paddingTop10 + i9;
            this.rightDrawable.setBounds(i19, i21, i19 + intrinsicWidth2, i21 + intrinsicHeight2);
            this.rightDrawableX = i19 + (intrinsicWidth2 >> 1);
            this.rightDrawableY = i21 + (intrinsicHeight2 >> 1);
            this.rightDrawable.draw(canvas);
            this.totalWidth += this.drawablePadding + intrinsicWidth2;
        }
        if (this.rightDrawable2 != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && !this.rightDrawableInside) {
            int intrinsicWidth3 = this.textWidth + i18 + this.drawablePadding + ((int) (-this.scrollingOffset));
            if (this.rightDrawable != null) {
                intrinsicWidth3 += ((int) (r4.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
            }
            int i22 = this.gravity & 7;
            if (i22 == 1 || i22 == 5) {
                intrinsicWidth3 += this.offsetX;
            }
            int intrinsicWidth4 = (int) (this.rightDrawable2.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight3 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
            if ((this.gravity & 112) == 16) {
                paddingTop9 = (getMeasuredHeight() - intrinsicHeight3) / 2;
                i8 = this.rightDrawableTopPadding;
            } else {
                paddingTop9 = getPaddingTop() + ((this.textHeight - intrinsicHeight3) / 2);
                i8 = this.rightDrawableTopPadding;
            }
            int i23 = paddingTop9 + i8;
            this.rightDrawable2.setBounds(intrinsicWidth3, i23, intrinsicWidth3 + intrinsicWidth4, intrinsicHeight3 + i23);
            this.rightDrawable2.draw(canvas);
            this.totalWidth += this.drawablePadding + intrinsicWidth4;
        }
        int iDp = this.totalWidth + AndroidUtilities.dp(16.0f);
        float f = this.scrollingOffset;
        if (f != 0.0f) {
            if (this.leftDrawable != null && !this.leftDrawableOutside) {
                int i24 = ((int) (-f)) + iDp;
                if ((this.gravity & 112) == 16) {
                    paddingTop8 = (getMeasuredHeight() - this.leftDrawable.getIntrinsicHeight()) / 2;
                    i7 = this.leftDrawableTopPadding;
                } else {
                    paddingTop8 = getPaddingTop() + ((this.textHeight - this.leftDrawable.getIntrinsicHeight()) / 2);
                    i7 = this.leftDrawableTopPadding;
                }
                int i25 = paddingTop8 + i7;
                Drawable drawable5 = this.leftDrawable;
                drawable5.setBounds(i24, i25, drawable5.getIntrinsicWidth() + i24, this.leftDrawable.getIntrinsicHeight() + i25);
                this.leftDrawable.draw(canvas);
            }
            if (this.rightDrawable != null && !this.rightDrawableOutside) {
                int intrinsicWidth5 = (int) (r2.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight4 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
                int i26 = this.textWidth + i18 + this.drawablePadding + ((int) (-this.scrollingOffset)) + iDp;
                if ((this.gravity & 112) == 16) {
                    paddingTop7 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                    i6 = this.rightDrawableTopPadding;
                } else {
                    paddingTop7 = getPaddingTop() + ((this.textHeight - intrinsicHeight4) / 2);
                    i6 = this.rightDrawableTopPadding;
                }
                int i27 = paddingTop7 + i6;
                this.rightDrawable.setBounds(i26, i27, i26 + intrinsicWidth5, i27 + intrinsicHeight4);
                this.rightDrawableX = i26 + (intrinsicWidth5 >> 1);
                this.rightDrawableY = i27 + (intrinsicHeight4 >> 1);
                this.rightDrawable.draw(canvas);
            }
            if (this.rightDrawable2 != null && !this.rightDrawableOutside) {
                int intrinsicWidth6 = (int) (r2.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight5 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
                int intrinsicWidth7 = this.textWidth + i18 + this.drawablePadding + ((int) (-this.scrollingOffset)) + iDp;
                if (this.rightDrawable != null) {
                    intrinsicWidth7 += ((int) (r5.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
                }
                if ((this.gravity & 112) == 16) {
                    paddingTop6 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                    i5 = this.rightDrawableTopPadding;
                } else {
                    paddingTop6 = getPaddingTop() + ((this.textHeight - intrinsicHeight5) / 2);
                    i5 = this.rightDrawableTopPadding;
                }
                int i28 = paddingTop6 + i5;
                this.rightDrawable2.setBounds(intrinsicWidth7, i28, intrinsicWidth6 + intrinsicWidth7, intrinsicHeight5 + i28);
                this.rightDrawable2.draw(canvas);
            }
        }
        if (this.layout != null) {
            if (this.leftDrawableOutside || this.rightDrawableOutside || this.ellipsizeByGradient || this.paddingRight > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.paddingRight;
                Drawable drawable6 = this.rightDrawable;
                canvas.clipRect(i18, 0, maxTextWidth - AndroidUtilities.dp((drawable6 == null || (drawable6 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) || !this.rightDrawableOutside) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = this.usaAlphaForEmoji;
            if (this.wrapBackgroundDrawable != null) {
                int i29 = (int) ((this.offsetX + i18) - this.scrollingOffset);
                int i30 = this.textWidth;
                int i31 = i29 + (i30 / 2);
                int iMax = Math.max(i30 + getPaddingLeft() + getPaddingRight(), this.minWidth);
                int i32 = i31 - (iMax / 2);
                this.wrapBackgroundDrawable.setBounds(i32, 0, iMax + i32, getMeasuredHeight());
                this.wrapBackgroundDrawable.draw(canvas);
            }
            if (this.offsetX + i18 != 0 || this.offsetY != 0 || this.scrollingOffset != 0.0f) {
                canvas.save();
                canvas.translate((this.offsetX + i18) - this.scrollingOffset, this.offsetY);
                this.layoutX += (this.offsetX + i18) - this.scrollingOffset;
                this.layoutY += this.offsetY;
            }
            drawLayout(canvas);
            if (this.partLayout != null && this.fullAlpha < 1.0f) {
                int alpha = this.textPaint.getAlpha();
                this.textPaint.setAlpha((int) ((1.0f - this.fullAlpha) * 255.0f));
                canvas.save();
                if (this.partLayout.getText().length() == 1) {
                    fDp = AndroidUtilities.dp(this.fullTextMaxLines == 1 ? 0.5f : 4.0f);
                } else {
                    fDp = 0.0f;
                }
                if (this.layout.getLineLeft(0) != 0.0f) {
                    canvas.translate((-this.layout.getLineWidth(0)) + fDp, 0.0f);
                } else {
                    canvas.translate(this.layout.getLineWidth(0) - fDp, 0.0f);
                }
                float f2 = -this.fullLayoutLeftOffset;
                float f3 = this.fullAlpha;
                canvas.translate((f2 * f3) + (this.fullLayoutLeftCharactersOffset * f3), 0.0f);
                this.partLayout.draw(canvas);
                canvas.restore();
                this.textPaint.setAlpha(alpha);
            }
            if (this.fullLayout != null && this.fullAlpha > 0.0f) {
                int alpha2 = this.textPaint.getAlpha();
                this.textPaint.setAlpha((int) (this.fullAlpha * 255.0f));
                float f4 = -this.fullLayoutLeftOffset;
                float f5 = this.fullAlpha;
                float f6 = this.fullLayoutLeftCharactersOffset;
                canvas.translate(((f4 * f5) + (f5 * f6)) - f6, 0.0f);
                this.fullLayout.draw(canvas);
                this.textPaint.setAlpha(alpha2);
            }
            if (this.scrollingOffset != 0.0f) {
                canvas.translate(iDp, 0.0f);
                drawLayout(canvas);
            }
            if (this.offsetX + i18 != 0 || this.offsetY != 0 || this.scrollingOffset != 0.0f) {
                canvas.restore();
            }
            if (this.rightDrawable != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && this.rightDrawableInside) {
                int i33 = this.textWidth + i18 + this.drawablePadding + ((int) (-this.scrollingOffset));
                int i34 = this.gravity & 7;
                if (i34 == 1 || i34 == 5) {
                    i33 += this.offsetX;
                }
                int intrinsicWidth8 = (int) (r2.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight6 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
                if ((this.gravity & 112) == 16) {
                    paddingTop5 = ((getMeasuredHeight() - intrinsicHeight6) / 2) + this.rightDrawableTopPadding;
                } else {
                    paddingTop5 = this.rightDrawableTopPadding + getPaddingTop() + ((this.textHeight - intrinsicHeight6) / 2);
                }
                this.rightDrawable.setBounds(i33, paddingTop5, i33 + intrinsicWidth8, paddingTop5 + intrinsicHeight6);
                this.rightDrawableX = i33 + (intrinsicWidth8 >> 1);
                this.rightDrawableY = paddingTop5 + (intrinsicHeight6 >> 1);
                this.rightDrawable.draw(canvas);
                this.totalWidth += this.drawablePadding + intrinsicWidth8;
            }
            if (this.rightDrawable2 != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && this.rightDrawableInside) {
                int intrinsicWidth9 = this.textWidth + i18 + this.drawablePadding + ((int) (-this.scrollingOffset));
                if (this.rightDrawable != null) {
                    intrinsicWidth9 += ((int) (r3.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
                }
                int i35 = this.gravity & 7;
                if (i35 == 1 || i35 == 5) {
                    intrinsicWidth9 += this.offsetX;
                }
                int intrinsicWidth10 = (int) (this.rightDrawable2.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight7 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
                if ((this.gravity & 112) == 16) {
                    paddingTop4 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i4 = this.rightDrawableTopPadding;
                } else {
                    paddingTop4 = getPaddingTop() + ((this.textHeight - intrinsicHeight7) / 2);
                    i4 = this.rightDrawableTopPadding;
                }
                int i36 = paddingTop4 + i4;
                this.rightDrawable2.setBounds(intrinsicWidth9, i36, intrinsicWidth9 + intrinsicWidth10, intrinsicHeight7 + i36);
                this.rightDrawable2.draw(canvas);
                this.totalWidth += this.drawablePadding + intrinsicWidth10;
            }
            if (z) {
                if (this.scrollingOffset < AndroidUtilities.dp(10.0f)) {
                    this.fadePaint.setAlpha((int) ((this.scrollingOffset / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else if (this.scrollingOffset > (this.totalWidth + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(10.0f)) {
                    this.fadePaint.setAlpha((int) ((1.0f - ((this.scrollingOffset - ((this.totalWidth + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(10.0f))) / AndroidUtilities.dp(10.0f))) * 255.0f));
                } else {
                    this.fadePaint.setAlpha(255);
                }
                canvas.drawRect(i18, 0.0f, AndroidUtilities.dp(6.0f) + i18, getMeasuredHeight(), this.fadePaint);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.paddingRight) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.fadePaintBack);
                canvas.restore();
            } else if (this.ellipsizeByGradient && this.textDoesNotFit && this.fadeEllpsizePaint != null) {
                canvas.save();
                updateFadePaints();
                if (!this.ellipsizeByGradientLeft) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.paddingRight) - this.fadeEllpsizePaintWidth;
                    Drawable drawable7 = this.rightDrawable;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable7 == null || (drawable7 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) || !this.rightDrawableOutside) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i18, 0.0f, this.fadeEllpsizePaintWidth, getMeasuredHeight(), this.fadeEllpsizePaint);
                canvas.restore();
            }
            updateScrollAnimation();
            Emoji.emojiDrawingUseAlpha = true;
            if (this.leftDrawableOutside || this.rightDrawableOutside || this.ellipsizeByGradient || this.paddingRight > 0) {
                canvas.restore();
            }
        }
        Drawable drawable8 = this.leftDrawable;
        if (drawable8 != null && this.leftDrawableOutside) {
            int intrinsicWidth11 = drawable8.getIntrinsicWidth();
            int intrinsicHeight8 = this.leftDrawable.getIntrinsicHeight();
            if ((this.gravity & 112) == 16) {
                paddingTop3 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                i3 = this.leftDrawableTopPadding;
            } else {
                paddingTop3 = getPaddingTop() + ((this.textHeight - intrinsicHeight8) / 2);
                i3 = this.leftDrawableTopPadding;
            }
            int i37 = paddingTop3 + i3;
            this.leftDrawable.setBounds(0, i37, intrinsicWidth11, intrinsicHeight8 + i37);
            this.leftDrawable.draw(canvas);
        }
        if (this.rightDrawable != null && this.rightDrawableOutside) {
            int i38 = this.textWidth + i18 + this.drawablePadding;
            float f7 = this.scrollingOffset;
            int iMin = Math.min(i38 + (f7 == 0.0f ? -iDp : (int) (-f7)) + iDp, (getMaxTextWidth() - this.paddingRight) + this.drawablePadding);
            int intrinsicWidth12 = (int) (this.rightDrawable.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight9 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
            if ((this.gravity & 112) == 16) {
                paddingTop2 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                i2 = this.rightDrawableTopPadding;
            } else {
                paddingTop2 = getPaddingTop() + ((this.textHeight - intrinsicHeight9) / 2);
                i2 = this.rightDrawableTopPadding;
            }
            int i39 = paddingTop2 + i2;
            this.rightDrawable.setBounds(iMin, i39, iMin + intrinsicWidth12, i39 + intrinsicHeight9);
            this.rightDrawableX = iMin + (intrinsicWidth12 >> 1);
            this.rightDrawableY = i39 + (intrinsicHeight9 >> 1);
            this.rightDrawable.draw(canvas);
        }
        if (this.rightDrawable2 == null || !this.rightDrawableOutside) {
            return;
        }
        int i40 = i18 + this.textWidth + this.drawablePadding;
        float f8 = this.scrollingOffset;
        int iMin2 = Math.min(i40 + (f8 == 0.0f ? -iDp : (int) (-f8)) + iDp, (getMaxTextWidth() - this.paddingRight) + this.drawablePadding);
        if (this.rightDrawable != null) {
            iMin2 += ((int) (r2.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
        }
        int intrinsicWidth13 = (int) (this.rightDrawable2.getIntrinsicWidth() * this.rightDrawableScale);
        int intrinsicHeight10 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
        if ((this.gravity & 112) == 16) {
            paddingTop = (getMeasuredHeight() - intrinsicHeight10) / 2;
            i = this.rightDrawableTopPadding;
        } else {
            paddingTop = getPaddingTop() + ((this.textHeight - intrinsicHeight10) / 2);
            i = this.rightDrawableTopPadding;
        }
        int i41 = paddingTop + i;
        this.rightDrawable2.setBounds(iMin2, i41, intrinsicWidth13 + iMin2, intrinsicHeight10 + i41);
        this.rightDrawable2.draw(canvas);
    }

    public int getRightDrawableX() {
        return this.rightDrawableX;
    }

    public int getRightDrawableY() {
        return this.rightDrawableY;
    }

    public int getMaxTextWidth() {
        Drawable drawable;
        Drawable drawable2;
        int intrinsicWidth = 0;
        int measuredWidth = getMeasuredWidth() - ((!this.rightDrawableOutside || (drawable2 = this.rightDrawable) == null) ? 0 : drawable2.getIntrinsicWidth() + this.drawablePadding);
        if (this.rightDrawableOutside && (drawable = this.rightDrawable2) != null) {
            intrinsicWidth = this.drawablePadding + drawable.getIntrinsicWidth();
        }
        return measuredWidth - intrinsicWidth;
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.leftDrawable == null && this.rightDrawable == null && this.rightDrawable2 == null) ? 0 : this.drawablePadding);
    }

    private void drawLayout(Canvas canvas) {
        if (this.fullAlpha > 0.0f && this.fullLayoutLeftOffset != 0) {
            canvas.save();
            float f = -this.fullLayoutLeftOffset;
            float f2 = this.fullAlpha;
            canvas.translate((f * f2) + (this.fullLayoutLeftCharactersOffset * f2), 0.0f);
            float f3 = this.layoutX;
            float f4 = -this.fullLayoutLeftOffset;
            float f5 = this.fullAlpha;
            this.layoutX = f3 + (f4 * f5) + (this.fullLayoutLeftCharactersOffset * f5);
            canvas.save();
            clipOutSpoilers(canvas);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.emojiStack;
            if (emojiGroupedSpans != null) {
                emojiGroupedSpans.clearPositions();
            }
            this.layout.draw(canvas);
            canvas.restore();
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiStackColorFilter);
            drawSpoilers(canvas);
            canvas.restore();
            return;
        }
        canvas.save();
        clipOutSpoilers(canvas);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.emojiStack;
        if (emojiGroupedSpans2 != null) {
            emojiGroupedSpans2.clearPositions();
        }
        this.layout.draw(canvas);
        canvas.restore();
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiStackColorFilter);
        drawSpoilers(canvas);
    }

    private void clipOutSpoilers(Canvas canvas) {
        if (this.spoilers.isEmpty()) {
            return;
        }
        this.path.rewind();
        Iterator it = this.spoilers.iterator();
        while (it.hasNext()) {
            Rect bounds = ((SpoilerEffect) it.next()).getBounds();
            this.path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(this.path, Region.Op.DIFFERENCE);
    }

    private void drawSpoilers(Canvas canvas) {
        Iterator it = this.spoilers.iterator();
        while (it.hasNext()) {
            ((SpoilerEffect) it.next()).draw(canvas);
        }
    }

    private void updateScrollAnimation() {
        float fDp;
        if (this.scrollNonFitText) {
            if (this.textDoesNotFit || this.scrollingOffset != 0.0f) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                int i = this.currentScrollDelay;
                if (i > 0) {
                    this.currentScrollDelay = (int) (i - j);
                } else {
                    int iDp = this.totalWidth + AndroidUtilities.dp(16.0f);
                    if (this.scrollingOffset < AndroidUtilities.dp(100.0f)) {
                        fDp = ((this.scrollingOffset / AndroidUtilities.dp(100.0f)) * 20.0f) + 30.0f;
                    } else {
                        fDp = this.scrollingOffset >= ((float) (iDp - AndroidUtilities.dp(100.0f))) ? 50.0f - (((this.scrollingOffset - (iDp - AndroidUtilities.dp(100.0f))) / AndroidUtilities.dp(100.0f)) * 20.0f) : 50.0f;
                    }
                    float fDp2 = this.scrollingOffset + ((j / 1000.0f) * AndroidUtilities.dp(fDp));
                    this.scrollingOffset = fDp2;
                    this.lastUpdateTime = jElapsedRealtime;
                    if (fDp2 > iDp) {
                        this.scrollingOffset = 0.0f;
                        this.currentScrollDelay = 500;
                    }
                    checkUi_layerType();
                }
                invalidate();
            }
        }
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.leftDrawable;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.rightDrawable;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.rightDrawable2;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        Drawable drawable5 = this.replacedDrawable;
        if (drawable == drawable5) {
            invalidate(drawable5.getBounds());
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.text);
    }

    public void setFullLayoutAdditionalWidth(int i, int i2) {
        if (this.fullLayoutAdditionalWidth == i && this.fullLayoutLeftOffset == i2) {
            return;
        }
        this.fullLayoutAdditionalWidth = i;
        this.fullLayoutLeftOffset = i2;
        createLayout(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.minusWidth);
    }

    public void setFullTextMaxLines(int i) {
        this.fullTextMaxLines = i;
    }

    public int getTextColor() {
        return this.textPaint.getColor();
    }

    public void setCanHideRightDrawable(boolean z) {
        this.canHideRightDrawable = z;
    }

    public void setRightDrawableOutside(boolean z) {
        this.rightDrawableOutside = z;
    }

    public void setLeftDrawableOutside(boolean z) {
        this.leftDrawableOutside = z;
    }

    public void setRightDrawableInside(boolean z) {
        this.rightDrawableInside = z;
    }

    public boolean getRightDrawableOutside() {
        return this.rightDrawableOutside;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.rightDrawableOnClickListener != null && this.rightDrawable != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.rightDrawableX - AndroidUtilities.dp(16.0f), this.rightDrawableY - AndroidUtilities.dp(16.0f), this.rightDrawableX + AndroidUtilities.dp(16.0f), this.rightDrawableY + AndroidUtilities.dp(16.0f));
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.maybeClick = true;
                this.touchDownX = motionEvent.getX();
                this.touchDownY = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Object obj = this.rightDrawable;
                if (obj instanceof PressableDrawable) {
                    ((PressableDrawable) obj).setPressed(true);
                }
            } else if (motionEvent.getAction() == 2 && this.maybeClick) {
                if (Math.abs(motionEvent.getX() - this.touchDownX) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.touchDownY) >= AndroidUtilities.touchSlop) {
                    this.maybeClick = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.rightDrawable;
                    if (obj2 instanceof PressableDrawable) {
                        ((PressableDrawable) obj2).setPressed(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.maybeClick && motionEvent.getAction() == 1) {
                    this.rightDrawableOnClickListener.onClick(this);
                    Object obj3 = this.rightDrawable;
                    if (obj3 instanceof PressableDrawable) {
                        ((PressableDrawable) obj3).setPressed(false);
                    }
                }
                this.maybeClick = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.maybeClick;
    }
}
