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
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public class SimpleTextView extends View implements Drawable.Callback {
    private static final int DIST_BETWEEN_SCROLLING_TEXT = 16;
    private static final int PIXELS_PER_SECOND = 50;
    private static final int PIXELS_PER_SECOND_SLOW = 30;
    private static final int SCROLL_DELAY_MS = 500;
    private static final int SCROLL_SLOWDOWN_PX = 100;
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
    private SpannableStringBuilder spannableStringBuilder;
    private List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
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

    public SimpleTextView(Context context) {
        super(context);
        this.gravity = 51;
        this.maxLines = 1;
        this.rightDrawableScale = 1.0f;
        this.drawablePadding = AndroidUtilities.dp(4.0f);
        this.ellipsizeByGradientWidthDp = 16;
        this.fullTextMaxLines = 3;
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.path = new Path();
        this.emojiCacheType = 0;
        this.mAlignment = Layout.Alignment.ALIGN_NORMAL;
        this.textPaint = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.mAlignment;
    }

    public final void calcOffset(int i) {
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
            } else if (this.maxLines <= 1 || this.layout.getLineCount() <= 0) {
                this.textHeight = this.layout.getLineBottom(0);
            } else {
                Layout layout3 = this.layout;
                this.textHeight = layout3.getLineBottom(layout3.getLineCount() - 1);
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
            this.offsetX = getPaddingLeft() + this.offsetX;
            if (this.rightDrawableInside) {
                Drawable drawable = this.rightDrawable;
                intrinsicWidth = (drawable == null || this.rightDrawableOutside) ? 0 : (int) (drawable.getIntrinsicWidth() * this.rightDrawableScale);
                Drawable drawable2 = this.rightDrawable2;
                if (drawable2 != null && !this.rightDrawableOutside) {
                    intrinsicWidth += (int) (drawable2.getIntrinsicWidth() * this.rightDrawableScale);
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

    public final void checkUi_layerType() {
        int i = ((!this.scrollNonFitText || (!this.textDoesNotFit && this.scrollingOffset == 0.0f)) && !this.ellipsizeByGradient) ? 0 : 2;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    public final void clipOutSpoilers(Canvas canvas) {
        if (this.spoilers.isEmpty()) {
            return;
        }
        this.path.rewind();
        Iterator<SpoilerEffect> it = this.spoilers.iterator();
        while (it.hasNext()) {
            Rect bounds = it.next().getBounds();
            this.path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(this.path, Region.Op.DIFFERENCE);
    }

    public void copyScrolling(SimpleTextView simpleTextView) {
        this.scrollingOffset = simpleTextView.scrollingOffset;
        checkUi_layerType();
    }

    public boolean createLayout(int i) {
        int intrinsicWidth;
        int intrinsicWidth2;
        CharSequence charSequenceEllipsize;
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
                    Drawable drawable2 = this.rightDrawable;
                    if (drawable2 == null || this.rightDrawableOutside) {
                        intrinsicWidth2 = 0;
                    } else {
                        intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.rightDrawableScale);
                        intrinsicWidth = (intrinsicWidth - intrinsicWidth2) - this.drawablePadding;
                    }
                    Drawable drawable3 = this.rightDrawable2;
                    if (drawable3 != null && !this.rightDrawableOutside) {
                        intrinsicWidth2 += (int) (drawable3.getIntrinsicWidth() * this.rightDrawableScale);
                        intrinsicWidth = (intrinsicWidth - intrinsicWidth2) - this.drawablePadding;
                    }
                }
                CharSequence charSequence2 = charSequence;
                if (this.replacedText != null && this.replacedDrawable != null) {
                    int iIndexOf = charSequence.toString().indexOf(this.replacedText);
                    this.replacingDrawableTextIndex = iIndexOf;
                    if (iIndexOf >= 0) {
                        charSequence2 = charSequence;
                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
                        DialogCell.FixedWidthSpan fixedWidthSpan = new DialogCell.FixedWidthSpan(this.replacedDrawable.getIntrinsicWidth());
                        int i2 = this.replacingDrawableTextIndex;
                        spannableStringBuilderValueOf.setSpan(fixedWidthSpan, i2, this.replacedText.length() + i2, 0);
                        charSequence2 = spannableStringBuilderValueOf;
                    } else {
                        charSequence2 = charSequence;
                        intrinsicWidth = (intrinsicWidth - this.replacedDrawable.getIntrinsicWidth()) - this.drawablePadding;
                        charSequence2 = charSequence;
                    }
                }
                charSequence2 = charSequence;
                CharSequence charSequence3 = charSequence2;
                if (this.canHideRightDrawable && intrinsicWidth2 != 0 && !this.rightDrawableOutside && !charSequence3.equals(TextUtils.ellipsize(charSequence3, this.textPaint, intrinsicWidth, TextUtils.TruncateAt.END))) {
                    this.rightDrawableHidden = true;
                    intrinsicWidth = intrinsicWidth + intrinsicWidth2 + this.drawablePadding;
                }
                int i3 = intrinsicWidth;
                if (this.buildFullLayout) {
                    CharSequence charSequenceEllipsize2 = !this.ellipsizeByGradient ? TextUtils.ellipsize(charSequence3, this.textPaint, i3, TextUtils.TruncateAt.END) : charSequence3;
                    if (this.ellipsizeByGradient || charSequenceEllipsize2.equals(charSequence3)) {
                        CharSequence charSequence4 = charSequenceEllipsize2;
                        this.layout = new StaticLayout(charSequence4, 0, charSequence4.length(), this.textPaint, (this.scrollNonFitText || this.ellipsizeByGradient) ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i3, getAlignment(), 1.0f, 0.0f, false);
                        this.fullLayout = null;
                        this.partLayout = null;
                        this.firstLineLayout = null;
                    } else {
                        TextPaint textPaint = this.textPaint;
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(charSequence3, textPaint, i3, alignment, 1.0f, 0.0f, false, truncateAt, i3, this.fullTextMaxLines, false);
                        this.fullLayout = staticLayoutCreateStaticLayout;
                        if (staticLayoutCreateStaticLayout != null) {
                            int lineEnd = staticLayoutCreateStaticLayout.getLineEnd(0);
                            int lineStart = this.fullLayout.getLineStart(1);
                            CharSequence charSequenceSubSequence = charSequence3.subSequence(0, lineEnd);
                            SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(charSequence3);
                            spannableStringBuilderValueOf2.setSpan(new EmptyStubSpan(), 0, lineStart, 0);
                            CharSequence charSequenceSubSequence2 = lineEnd < charSequenceEllipsize2.length() ? charSequenceEllipsize2.subSequence(lineEnd, charSequenceEllipsize2.length()) : "…";
                            this.firstLineLayout = new StaticLayout(charSequenceEllipsize2, 0, charSequenceEllipsize2.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i3, getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(charSequenceSubSequence, 0, charSequenceSubSequence.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i3, getAlignment(), 1.0f, 0.0f, false);
                            this.layout = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                charSequenceSubSequence2 = "\u200f" + ((Object) charSequenceSubSequence2);
                            }
                            CharSequence charSequence5 = charSequenceSubSequence2;
                            this.partLayout = new StaticLayout(charSequence5, 0, charSequence5.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i3, getAlignment(), 1.0f, 0.0f, false);
                            this.fullLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilderValueOf2, this.textPaint, AndroidUtilities.dp(8.0f) + i3 + this.fullLayoutAdditionalWidth, getAlignment(), 1.0f, 0.0f, false, truncateAt, i3 + this.fullLayoutAdditionalWidth, this.fullTextMaxLines, false);
                        }
                    }
                } else if (this.maxLines > 1) {
                    this.layout = StaticLayoutEx.createStaticLayout(charSequence3, this.textPaint, i3, getAlignment(), 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i3, this.maxLines, false);
                } else {
                    if (!this.scrollNonFitText) {
                        if (this.ellipsizeByGradient) {
                            charSequenceEllipsize = charSequence3;
                            charSequenceEllipsize = charSequence3;
                        } else {
                            charSequenceEllipsize = charSequence3;
                            charSequenceEllipsize = TextUtils.ellipsize(charSequence3, this.textPaint, i3, TextUtils.TruncateAt.END);
                        }
                    }
                    charSequenceEllipsize = charSequence3;
                    CharSequence charSequence6 = charSequenceEllipsize;
                    this.layout = new StaticLayout(charSequence6, 0, charSequence6.length(), this.textPaint, (this.scrollNonFitText || this.ellipsizeByGradient) ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i3, getAlignment(), 1.0f, 0.0f, false);
                }
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                Layout layout = this.layout;
                if (layout != null && (layout.getText() instanceof Spannable)) {
                    SpoilerEffect.addSpoilers(this, this.layout, -2, -2, this.spoilersPool, this.spoilers);
                }
                calcOffset(i3);
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

    public final void drawLayout(Canvas canvas) {
        if (this.fullAlpha <= 0.0f || this.fullLayoutLeftOffset == 0) {
            canvas.save();
            clipOutSpoilers(canvas);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.emojiStack;
            if (emojiGroupedSpans != null) {
                emojiGroupedSpans.clearPositions();
            }
            this.layout.draw(canvas);
            canvas.restore();
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiStackColorFilter);
            Iterator<SpoilerEffect> it = this.spoilers.iterator();
            while (it.hasNext()) {
                it.next().draw(canvas);
            }
            return;
        }
        canvas.save();
        float f = -this.fullLayoutLeftOffset;
        float f2 = this.fullAlpha;
        canvas.translate((this.fullLayoutLeftCharactersOffset * f2) + (f * f2), 0.0f);
        float f3 = this.layoutX;
        float f4 = -this.fullLayoutLeftOffset;
        float f5 = this.fullAlpha;
        this.layoutX = OKLCH.m(this.fullLayoutLeftCharactersOffset, f5, f4 * f5, f3);
        canvas.save();
        clipOutSpoilers(canvas);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.emojiStack;
        if (emojiGroupedSpans2 != null) {
            emojiGroupedSpans2.clearPositions();
        }
        this.layout.draw(canvas);
        canvas.restore();
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiStackColorFilter);
        Iterator<SpoilerEffect> it2 = this.spoilers.iterator();
        while (it2.hasNext()) {
            it2.next().draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.wrapBackgroundDrawable;
        return drawable != null ? drawable : super.getBackground();
    }

    public float getExactWidth() {
        return (getPaint().measureText(getText().toString()) + getSideDrawablesSize()) - ((this.leftDrawable == null && this.rightDrawable == null && this.rightDrawable2 == null) ? 0 : this.drawablePadding);
    }

    public float getExactWidthIncludeDrawables() {
        float exactWidth = getExactWidth();
        Drawable drawable = this.leftDrawable;
        float intrinsicWidth = exactWidth + (drawable != null ? drawable.getIntrinsicWidth() : 0);
        Drawable drawable2 = this.rightDrawable;
        float intrinsicWidth2 = intrinsicWidth + (drawable2 != null ? drawable2.getIntrinsicWidth() : 0);
        Drawable drawable3 = this.rightDrawable2;
        return intrinsicWidth2 + (drawable3 != null ? drawable3.getIntrinsicWidth() : 0);
    }

    public float getFullAlpha() {
        return this.fullAlpha;
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

    public Drawable getLeftDrawable() {
        return this.leftDrawable;
    }

    public int getLineCount() {
        Layout layout = this.layout;
        int lineCount = layout != null ? layout.getLineCount() : 0;
        Layout layout2 = this.fullLayout;
        return layout2 != null ? layout2.getLineCount() + lineCount : lineCount;
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

    public TextPaint getPaint() {
        return this.textPaint;
    }

    public Drawable getRightDrawable() {
        return this.rightDrawable;
    }

    public Drawable getRightDrawable2() {
        return this.rightDrawable2;
    }

    public boolean getRightDrawableOutside() {
        return this.rightDrawableOutside;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.rightDrawable;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.rightDrawableScale) + this.drawablePadding);
    }

    public int getRightDrawableX() {
        return this.rightDrawableX;
    }

    public int getRightDrawableY() {
        return this.rightDrawableY;
    }

    public int getSideDrawablesSize() {
        Drawable drawable = this.leftDrawable;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() + this.drawablePadding : 0;
        Drawable drawable2 = this.rightDrawable;
        if (drawable2 != null) {
            intrinsicWidth += ((int) (drawable2.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
        }
        Drawable drawable3 = this.rightDrawable2;
        return drawable3 != null ? ((int) (drawable3.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding + intrinsicWidth : intrinsicWidth;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.text;
        return charSequence == null ? "" : charSequence;
    }

    public int getTextColor() {
        return this.textPaint.getColor();
    }

    public int getTextHeight() {
        return this.textHeight;
    }

    public TextPaint getTextPaint() {
        return this.textPaint;
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
            intrinsicWidth += drawable2.getIntrinsicWidth() + this.drawablePadding;
        }
        return ((int) getX()) + this.offsetX + intrinsicWidth;
    }

    public int getTextStartY() {
        if (this.layout == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        int i = this.textWidth;
        int intrinsicWidth = 0;
        if (this.rightDrawableInside) {
            Drawable drawable = this.rightDrawable;
            int intrinsicWidth2 = drawable != null ? (int) (drawable.getIntrinsicWidth() * this.rightDrawableScale) : 0;
            Drawable drawable2 = this.rightDrawable2;
            intrinsicWidth = (drawable2 != null ? (int) (drawable2.getIntrinsicWidth() * this.rightDrawableScale) : 0) + intrinsicWidth2;
        }
        return i + intrinsicWidth;
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.emojiStack = AnimatedEmojiSpan.update(this.emojiCacheType, this, this.emojiStack, this.layout);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        AnimatedEmojiSpan.release(this, this.emojiStack);
        this.wasLayout = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int intrinsicWidth;
        float f;
        float f2;
        int iM;
        int i;
        int iM2;
        int i2;
        int iM3;
        int i3;
        float f3;
        boolean z;
        float fM;
        int iM4;
        int i4;
        int iM5;
        int i5;
        float fDp;
        float f4;
        int iM6;
        int i6;
        int iM7;
        int i7;
        int intrinsicHeight;
        int iM8;
        int i8;
        int iM9;
        int i9;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.layoutX = 0.0f;
        this.layoutY = 0.0f;
        boolean z2 = this.scrollNonFitText && (this.textDoesNotFit || this.scrollingOffset != 0.0f);
        this.totalWidth = this.textWidth;
        Drawable drawable = this.leftDrawable;
        if (drawable == null || this.leftDrawableOutside) {
            intrinsicWidth = (!this.leftDrawableOutside || drawable == null) ? 0 : this.drawablePadding + drawable.getIntrinsicWidth();
        } else {
            int i10 = (int) (-this.scrollingOffset);
            int i11 = this.gravity;
            if ((i11 & 7) == 1) {
                i10 += this.offsetX;
            }
            if ((i11 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.leftDrawable.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
            } else {
                intrinsicHeight3 = this.leftDrawableTopPadding + ((this.textHeight - this.leftDrawable.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable2 = this.leftDrawable;
            drawable2.setBounds(i10, intrinsicHeight3, drawable2.getIntrinsicWidth() + i10, this.leftDrawable.getIntrinsicHeight() + intrinsicHeight3);
            this.leftDrawable.draw(canvas);
            int i12 = this.gravity & 7;
            if (i12 == 3 || i12 == 1) {
                intrinsicWidth = this.leftDrawable.getIntrinsicWidth() + this.drawablePadding;
            } else {
                intrinsicWidth = 0;
            }
            this.totalWidth = this.leftDrawable.getIntrinsicWidth() + this.drawablePadding + this.totalWidth;
        }
        Drawable drawable3 = this.replacedDrawable;
        if (drawable3 != null && this.replacedText != null) {
            int i13 = (int) ((-this.scrollingOffset) + this.replacingDrawableTextOffset);
            int i14 = this.gravity;
            if ((i14 & 7) == 1) {
                i13 += this.offsetX;
            }
            if ((i14 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.replacedDrawable.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
            } else {
                intrinsicHeight2 = this.leftDrawableTopPadding + ((this.textHeight - drawable3.getIntrinsicHeight()) / 2);
            }
            Drawable drawable4 = this.replacedDrawable;
            drawable4.setBounds(i13, intrinsicHeight2, drawable4.getIntrinsicWidth() + i13, this.replacedDrawable.getIntrinsicHeight() + intrinsicHeight2);
            this.replacedDrawable.draw(canvas);
            if (this.replacingDrawableTextIndex < 0) {
                int i15 = this.gravity & 7;
                if (i15 == 3 || i15 == 1) {
                    intrinsicWidth += this.replacedDrawable.getIntrinsicWidth() + this.drawablePadding;
                }
                this.totalWidth = this.replacedDrawable.getIntrinsicWidth() + this.drawablePadding + this.totalWidth;
            }
        }
        int i16 = intrinsicWidth;
        Drawable drawable5 = this.rightDrawable;
        if (drawable5 == null || this.rightDrawableHidden || this.rightDrawableScale <= 0.0f || this.rightDrawableOutside || this.rightDrawableInside) {
            f = 0.0f;
        } else {
            int i17 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset));
            int i18 = this.gravity & 7;
            if (i18 == 1 || i18 == 5) {
                i17 += this.offsetX;
            }
            int intrinsicWidth2 = (int) (drawable5.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight4 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
            if ((this.gravity & 112) == 16) {
                iM9 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i9 = this.rightDrawableTopPadding;
            } else {
                iM9 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight4, 2, getPaddingTop());
                i9 = this.rightDrawableTopPadding;
            }
            int i19 = iM9 + i9;
            f = 0.0f;
            this.rightDrawable.setBounds(i17, i19, i17 + intrinsicWidth2, i19 + intrinsicHeight4);
            this.rightDrawableX = i17 + (intrinsicWidth2 >> 1);
            this.rightDrawableY = i19 + (intrinsicHeight4 >> 1);
            this.rightDrawable.draw(canvas);
            this.totalWidth = this.drawablePadding + intrinsicWidth2 + this.totalWidth;
        }
        if (this.rightDrawable2 != null && !this.rightDrawableHidden && this.rightDrawableScale > f && !this.rightDrawableOutside && !this.rightDrawableInside) {
            int intrinsicWidth3 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset));
            Drawable drawable6 = this.rightDrawable;
            if (drawable6 != null) {
                intrinsicWidth3 += ((int) (drawable6.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
            }
            int i20 = this.gravity & 7;
            if (i20 == 1 || i20 == 5) {
                intrinsicWidth3 += this.offsetX;
            }
            int intrinsicWidth4 = (int) (this.rightDrawable2.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight5 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
            if ((this.gravity & 112) == 16) {
                iM8 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i8 = this.rightDrawableTopPadding;
            } else {
                iM8 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight5, 2, getPaddingTop());
                i8 = this.rightDrawableTopPadding;
            }
            int i21 = iM8 + i8;
            this.rightDrawable2.setBounds(intrinsicWidth3, i21, intrinsicWidth3 + intrinsicWidth4, intrinsicHeight5 + i21);
            this.rightDrawable2.draw(canvas);
            this.totalWidth = this.drawablePadding + intrinsicWidth4 + this.totalWidth;
        }
        int iDp = AndroidUtilities.dp(16.0f) + this.totalWidth;
        float f5 = this.scrollingOffset;
        if (f5 != f) {
            if (this.leftDrawable != null && !this.leftDrawableOutside) {
                int i22 = ((int) (-f5)) + iDp;
                if ((this.gravity & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.leftDrawable.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
                } else {
                    intrinsicHeight = this.leftDrawableTopPadding + ((this.textHeight - this.leftDrawable.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable7 = this.leftDrawable;
                drawable7.setBounds(i22, intrinsicHeight, drawable7.getIntrinsicWidth() + i22, this.leftDrawable.getIntrinsicHeight() + intrinsicHeight);
                this.leftDrawable.draw(canvas);
            }
            Drawable drawable8 = this.rightDrawable;
            if (drawable8 == null || this.rightDrawableOutside) {
                f2 = 16.0f;
            } else {
                int intrinsicWidth5 = (int) (drawable8.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight6 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
                int i23 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset)) + iDp;
                if ((this.gravity & 112) == 16) {
                    iM7 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i7 = this.rightDrawableTopPadding;
                } else {
                    iM7 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight6, 2, getPaddingTop());
                    i7 = this.rightDrawableTopPadding;
                }
                int i24 = iM7 + i7;
                f2 = 16.0f;
                this.rightDrawable.setBounds(i23, i24, i23 + intrinsicWidth5, i24 + intrinsicHeight6);
                this.rightDrawableX = i23 + (intrinsicWidth5 >> 1);
                this.rightDrawableY = i24 + (intrinsicHeight6 >> 1);
                this.rightDrawable.draw(canvas);
            }
            Drawable drawable9 = this.rightDrawable2;
            if (drawable9 != null && !this.rightDrawableOutside) {
                int intrinsicWidth6 = (int) (drawable9.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight7 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
                int intrinsicWidth7 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset)) + iDp;
                Drawable drawable10 = this.rightDrawable;
                if (drawable10 != null) {
                    intrinsicWidth7 += ((int) (drawable10.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
                }
                if ((this.gravity & 112) == 16) {
                    iM6 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i6 = this.rightDrawableTopPadding;
                } else {
                    iM6 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight7, 2, getPaddingTop());
                    i6 = this.rightDrawableTopPadding;
                }
                int i25 = iM6 + i6;
                this.rightDrawable2.setBounds(intrinsicWidth7, i25, intrinsicWidth6 + intrinsicWidth7, intrinsicHeight7 + i25);
                this.rightDrawable2.draw(canvas);
            }
        } else {
            f2 = 16.0f;
        }
        if (this.layout != null) {
            if (this.leftDrawableOutside || this.rightDrawableOutside || this.ellipsizeByGradient || this.paddingRight > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.paddingRight;
                Drawable drawable11 = this.rightDrawable;
                canvas.clipRect(i16, 0, maxTextWidth - AndroidUtilities.dp((drawable11 == null || (drawable11 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) || !this.rightDrawableOutside) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = this.usaAlphaForEmoji;
            if (this.wrapBackgroundDrawable != null) {
                int i26 = (int) ((this.offsetX + i16) - this.scrollingOffset);
                int i27 = this.textWidth;
                int i28 = (i27 / 2) + i26;
                int iMax = Math.max(getPaddingRight() + getPaddingLeft() + i27, this.minWidth);
                int i29 = i28 - (iMax / 2);
                this.wrapBackgroundDrawable.setBounds(i29, 0, iMax + i29, getMeasuredHeight());
                this.wrapBackgroundDrawable.draw(canvas);
            }
            if (this.offsetX + i16 != 0 || this.offsetY != 0 || this.scrollingOffset != f) {
                canvas.save();
                canvas.translate((this.offsetX + i16) - this.scrollingOffset, this.offsetY);
                this.layoutX = ((this.offsetX + i16) - this.scrollingOffset) + this.layoutX;
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
                if (this.layout.getLineLeft(0) != f) {
                    f4 = 0.0f;
                    canvas.translate((-this.layout.getLineWidth(0)) + fDp, 0.0f);
                } else {
                    f4 = 0.0f;
                    canvas.translate(this.layout.getLineWidth(0) - fDp, 0.0f);
                }
                float f6 = -this.fullLayoutLeftOffset;
                float f7 = this.fullAlpha;
                canvas.translate((this.fullLayoutLeftCharactersOffset * f7) + (f6 * f7), f4);
                this.partLayout.draw(canvas);
                canvas.restore();
                this.textPaint.setAlpha(alpha);
            }
            if (this.fullLayout == null || this.fullAlpha <= 0.0f) {
                f3 = 0.0f;
            } else {
                int alpha2 = this.textPaint.getAlpha();
                this.textPaint.setAlpha((int) (this.fullAlpha * 255.0f));
                float f8 = -this.fullLayoutLeftOffset;
                float f9 = this.fullAlpha;
                float f10 = this.fullLayoutLeftCharactersOffset;
                f3 = 0.0f;
                canvas.translate(((f9 * f10) + (f8 * f9)) - f10, 0.0f);
                this.fullLayout.draw(canvas);
                this.textPaint.setAlpha(alpha2);
            }
            if (this.scrollingOffset != f3) {
                canvas.translate(iDp, f3);
                drawLayout(canvas);
            }
            if (this.offsetX + i16 != 0 || this.offsetY != 0 || this.scrollingOffset != f3) {
                canvas.restore();
            }
            Drawable drawable12 = this.rightDrawable;
            if (drawable12 != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && this.rightDrawableInside) {
                int i30 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset));
                int i31 = this.gravity & 7;
                if (i31 == 1 || i31 == 5) {
                    i30 += this.offsetX;
                }
                int intrinsicWidth8 = (int) (drawable12.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight8 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
                if ((this.gravity & 112) == 16) {
                    iM5 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i5 = this.rightDrawableTopPadding;
                } else {
                    iM5 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight8, 2, getPaddingTop());
                    i5 = this.rightDrawableTopPadding;
                }
                int i32 = iM5 + i5;
                this.rightDrawable.setBounds(i30, i32, i30 + intrinsicWidth8, i32 + intrinsicHeight8);
                this.rightDrawableX = i30 + (intrinsicWidth8 >> 1);
                this.rightDrawableY = i32 + (intrinsicHeight8 >> 1);
                this.rightDrawable.draw(canvas);
                this.totalWidth = this.drawablePadding + intrinsicWidth8 + this.totalWidth;
            }
            if (this.rightDrawable2 != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && this.rightDrawableInside) {
                int intrinsicWidth9 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset));
                Drawable drawable13 = this.rightDrawable;
                if (drawable13 != null) {
                    intrinsicWidth9 += ((int) (drawable13.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
                }
                int i33 = this.gravity & 7;
                if (i33 == 1 || i33 == 5) {
                    intrinsicWidth9 += this.offsetX;
                }
                int intrinsicWidth10 = (int) (this.rightDrawable2.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight9 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
                if ((this.gravity & 112) == 16) {
                    iM4 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i4 = this.rightDrawableTopPadding;
                } else {
                    iM4 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight9, 2, getPaddingTop());
                    i4 = this.rightDrawableTopPadding;
                }
                int i34 = iM4 + i4;
                this.rightDrawable2.setBounds(intrinsicWidth9, i34, intrinsicWidth9 + intrinsicWidth10, intrinsicHeight9 + i34);
                this.rightDrawable2.draw(canvas);
                this.totalWidth = this.drawablePadding + intrinsicWidth10 + this.totalWidth;
            }
            if (z2) {
                if (this.scrollingOffset < AndroidUtilities.dp(10.0f)) {
                    this.fadePaint.setAlpha((int) ((this.scrollingOffset / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else {
                    if (this.scrollingOffset > (AndroidUtilities.dp(f2) + this.totalWidth) - AndroidUtilities.dp(10.0f)) {
                        this.fadePaint.setAlpha((int) OKLCH.m$1(this.scrollingOffset - ((AndroidUtilities.dp(f2) + this.totalWidth) - AndroidUtilities.dp(10.0f)), AndroidUtilities.dp(10.0f), 1.0f, 255.0f));
                    } else {
                        this.fadePaint.setAlpha(255);
                    }
                }
                canvas.drawRect(i16, 0.0f, AndroidUtilities.dp(6.0f) + i16, getMeasuredHeight(), this.fadePaint);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.paddingRight) - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.fadePaintBack);
                canvas.restore();
            } else if (this.ellipsizeByGradient && this.textDoesNotFit && this.fadeEllpsizePaint != null) {
                canvas.save();
                updateFadePaints();
                if (!this.ellipsizeByGradientLeft) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.paddingRight) - this.fadeEllpsizePaintWidth;
                    Drawable drawable14 = this.rightDrawable;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable14 == null || (drawable14 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) || !this.rightDrawableOutside) ? 0.0f : 2.0f), 0.0f);
                }
                canvas.drawRect(i16, 0.0f, this.fadeEllpsizePaintWidth, getMeasuredHeight(), this.fadeEllpsizePaint);
                canvas.restore();
            }
            if (!this.scrollNonFitText || (!this.textDoesNotFit && this.scrollingOffset == 0.0f)) {
                z = true;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastUpdateTime;
                if (j > 17) {
                    j = 17;
                }
                int i35 = this.currentScrollDelay;
                if (i35 > 0) {
                    this.currentScrollDelay = (int) (((long) i35) - j);
                    z = true;
                } else {
                    int iDp2 = AndroidUtilities.dp(f2) + this.totalWidth;
                    if (this.scrollingOffset < AndroidUtilities.dp(100.0f)) {
                        fM = zzir.m(this.scrollingOffset, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
                        z = true;
                    } else {
                        z = true;
                        fM = this.scrollingOffset >= ((float) (iDp2 - AndroidUtilities.dp(100.0f))) ? TextureRenderer$$ExternalSyntheticOutline0.m(this.scrollingOffset - (iDp2 - AndroidUtilities.dp(100.0f)), AndroidUtilities.dp(100.0f), 20.0f, 50.0f) : 50.0f;
                    }
                    float fDp2 = ((j / 1000.0f) * AndroidUtilities.dp(fM)) + this.scrollingOffset;
                    this.scrollingOffset = fDp2;
                    this.lastUpdateTime = jElapsedRealtime;
                    if (fDp2 > iDp2) {
                        this.scrollingOffset = 0.0f;
                        this.currentScrollDelay = 500;
                    }
                    checkUi_layerType();
                }
                invalidate();
            }
            Emoji.emojiDrawingUseAlpha = z;
            if (this.leftDrawableOutside || this.rightDrawableOutside || this.ellipsizeByGradient || this.paddingRight > 0) {
                canvas.restore();
            }
        }
        Drawable drawable15 = this.leftDrawable;
        if (drawable15 != null && this.leftDrawableOutside) {
            int intrinsicWidth11 = drawable15.getIntrinsicWidth();
            int intrinsicHeight10 = this.leftDrawable.getIntrinsicHeight();
            if ((this.gravity & 112) == 16) {
                iM3 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i3 = this.leftDrawableTopPadding;
            } else {
                iM3 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight10, 2, getPaddingTop());
                i3 = this.leftDrawableTopPadding;
            }
            int i36 = iM3 + i3;
            this.leftDrawable.setBounds(0, i36, intrinsicWidth11, intrinsicHeight10 + i36);
            this.leftDrawable.draw(canvas);
        }
        if (this.rightDrawable != null && this.rightDrawableOutside) {
            int i37 = this.textWidth + i16 + this.drawablePadding;
            float f11 = this.scrollingOffset;
            int iMin = Math.min(i37 + (f11 == 0.0f ? -iDp : (int) (-f11)) + iDp, (getMaxTextWidth() - this.paddingRight) + this.drawablePadding);
            int intrinsicWidth12 = (int) (this.rightDrawable.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight11 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
            if ((this.gravity & 112) == 16) {
                iM2 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i2 = this.rightDrawableTopPadding;
            } else {
                iM2 = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight11, 2, getPaddingTop());
                i2 = this.rightDrawableTopPadding;
            }
            int i38 = iM2 + i2;
            this.rightDrawable.setBounds(iMin, i38, iMin + intrinsicWidth12, i38 + intrinsicHeight11);
            this.rightDrawableX = iMin + (intrinsicWidth12 >> 1);
            this.rightDrawableY = i38 + (intrinsicHeight11 >> 1);
            this.rightDrawable.draw(canvas);
        }
        if (this.rightDrawable2 == null || !this.rightDrawableOutside) {
            return;
        }
        int i39 = i16 + this.textWidth + this.drawablePadding;
        float f12 = this.scrollingOffset;
        int iMin2 = Math.min(i39 + (f12 == 0.0f ? -iDp : (int) (-f12)) + iDp, (getMaxTextWidth() - this.paddingRight) + this.drawablePadding);
        Drawable drawable16 = this.rightDrawable;
        if (drawable16 != null) {
            iMin2 += ((int) (drawable16.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
        }
        int intrinsicWidth13 = (int) (this.rightDrawable2.getIntrinsicWidth() * this.rightDrawableScale);
        int intrinsicHeight12 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
        if ((this.gravity & 112) == 16) {
            iM = (getMeasuredHeight() - intrinsicHeight12) / 2;
            i = this.rightDrawableTopPadding;
        } else {
            iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(this.textHeight, intrinsicHeight12, 2, getPaddingTop());
            i = this.rightDrawableTopPadding;
        }
        int i40 = iM + i;
        this.rightDrawable2.setBounds(iMin2, i40, intrinsicWidth13 + iMin2, intrinsicHeight12 + i40);
        this.rightDrawable2.draw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.text);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.wasLayout = true;
    }

    @Override
    public void onMeasure(int i, int i2) {
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
        createLayout((((((size - getPaddingLeft()) - getPaddingRight()) - this.minusWidth) - ((!this.leftDrawableOutside || (drawable6 = this.leftDrawable) == null) ? 0 : drawable6.getIntrinsicWidth() + this.drawablePadding)) - ((!this.rightDrawableOutside || (drawable5 = this.rightDrawable) == null) ? 0 : drawable5.getIntrinsicWidth() + this.drawablePadding)) - ((!this.rightDrawableOutside || (drawable4 = this.rightDrawable2) == null) ? 0 : drawable4.getIntrinsicWidth() + this.drawablePadding));
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.textHeight;
        }
        if (this.widthWrapContent) {
            size = Math.max(Math.min(size, getPaddingRight() + getPaddingLeft() + this.textWidth + this.minusWidth + ((!this.leftDrawableOutside || (drawable3 = this.leftDrawable) == null) ? 0 : drawable3.getIntrinsicWidth() + this.drawablePadding) + ((!this.rightDrawableOutside || (drawable2 = this.rightDrawable) == null) ? 0 : drawable2.getIntrinsicWidth() + this.drawablePadding) + ((!this.rightDrawableOutside || (drawable = this.rightDrawable2) == null) ? 0 : drawable.getIntrinsicWidth() + this.drawablePadding)), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.gravity & 112) == 16) {
            this.offsetY = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.textHeight, 2, getPaddingTop());
        } else {
            this.offsetY = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.rightDrawableOnClickListener != null && this.rightDrawable != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.rightDrawableX - AndroidUtilities.dp(16.0f), this.rightDrawableY - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f) + this.rightDrawableX, AndroidUtilities.dp(16.0f) + this.rightDrawableY);
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

    public final boolean recreateLayoutMaybe() {
        if (!this.wasLayout || getMeasuredHeight() == 0 || this.buildFullLayout) {
            requestLayout();
            return true;
        }
        boolean zCreateLayout = createLayout(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.minusWidth);
        if ((this.gravity & 112) == 16) {
            this.offsetY = (getMeasuredHeight() - this.textHeight) / 2;
            return zCreateLayout;
        }
        this.offsetY = getPaddingTop();
        return zCreateLayout;
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

    public void resetScrolling() {
        this.scrollingOffset = 0.0f;
        checkUi_layerType();
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.mAlignment = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.maxLines > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.wrapBackgroundDrawable = drawable;
        }
    }

    public void setBuildFullLayout(boolean z) {
        this.buildFullLayout = z;
    }

    public void setCanHideRightDrawable(boolean z) {
        this.canHideRightDrawable = z;
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

    public void setEllipsizeByGradient(boolean z) {
        setEllipsizeByGradient(z, (Boolean) null);
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

    public void setEmojiColor(int i) {
        this.emojiStackColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f) {
        this.fullAlpha = f;
        invalidate();
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

    public void setGravity(int i) {
        this.gravity = i;
    }

    public void setLeftDrawable(int i) {
        setLeftDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
    }

    public void setLeftDrawableOutside(boolean z) {
        this.leftDrawableOutside = z;
    }

    public void setLeftDrawableTopPadding(int i) {
        this.leftDrawableTopPadding = i;
    }

    public void setLinkTextColor(int i) {
        this.textPaint.linkColor = i;
        invalidate();
    }

    public void setMaxLines(int i) {
        this.maxLines = i;
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
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

    public void setRightDrawable(int i) {
        setRightDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
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

    public void setRightDrawableInside(boolean z) {
        this.rightDrawableInside = z;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
    }

    public void setRightDrawableOutside(boolean z) {
        this.rightDrawableOutside = z;
    }

    public void setRightDrawableScale(float f) {
        this.rightDrawableScale = f;
    }

    public void setRightDrawableTopPadding(int i) {
        this.rightDrawableTopPadding = i;
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
                Drawable drawable2 = this.rightDrawable;
                if (drawable2 != null && !this.rightDrawableOutside) {
                    intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * this.rightDrawableScale);
                    maxTextWidth = (maxTextWidth - intrinsicWidth) - this.drawablePadding;
                }
                Drawable drawable3 = this.rightDrawable2;
                if (drawable3 != null && !this.rightDrawableOutside) {
                    intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * this.rightDrawableScale);
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

    public void setScrollNonFitText(boolean z) {
        if (this.scrollNonFitText == z) {
            return;
        }
        this.scrollNonFitText = z;
        updateFadePaints();
        requestLayout();
        checkUi_layerType();
    }

    public void setSideDrawablesColor(int i) {
        Theme.setDrawableColor(i, this.rightDrawable);
        Theme.setDrawableColor(i, this.leftDrawable);
    }

    public boolean setText(CharSequence charSequence) {
        return setText(charSequence, false);
    }

    public void setTextColor(int i) {
        this.textPaint.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        setTextSizePx(AndroidUtilities.dp(i));
    }

    public void setTextSizePx(int i) {
        float f = i;
        if (f == this.textPaint.getTextSize()) {
            return;
        }
        this.textPaint.setTextSize(f);
        if (recreateLayoutMaybe()) {
            return;
        }
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.textPaint.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z) {
        this.widthWrapContent = z;
    }

    public final void updateFadePaints() {
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

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.rightDrawable || drawable == this.rightDrawable2 || drawable == this.leftDrawable || super.verifyDrawable(drawable);
    }

    public void setEllipsizeByGradient(int i) {
        setEllipsizeByGradient(i, (Boolean) null);
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
}
