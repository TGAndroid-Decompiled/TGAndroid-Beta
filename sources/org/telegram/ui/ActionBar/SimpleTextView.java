package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
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
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

public class SimpleTextView extends View {
    private boolean buildFullLayout;
    private boolean canHideRightDrawable;
    private int currentScrollDelay;
    private Paint fadePaint;
    private Paint fadePaintBack;
    private Layout firstLineLayout;
    private float fullAlpha;
    private Layout fullLayout;
    private int fullLayoutAdditionalWidth;
    private float fullLayoutLeftCharactersOffset;
    private int fullLayoutLeftOffset;
    private long lastUpdateTime;
    private int lastWidth;
    private Layout layout;
    private Drawable leftDrawable;
    private int leftDrawableTopPadding;
    private boolean maybeClick;
    private int minWidth;
    private int minusWidth;
    private int offsetX;
    private int offsetY;
    private Layout partLayout;
    private Drawable replacedDrawable;
    private String replacedText;
    private int replacingDrawableTextIndex;
    private float replacingDrawableTextOffset;
    private Drawable rightDrawable;
    private boolean rightDrawableHidden;
    private View.OnClickListener rightDrawableOnClickListener;
    private int rightDrawableTopPadding;
    public int rightDrawableX;
    public int rightDrawableY;
    private boolean scrollNonFitText;
    private float scrollingOffset;
    private CharSequence text;
    private boolean textDoesNotFit;
    private int textHeight;
    private int textWidth;
    private int totalWidth;
    private float touchDownX;
    private float touchDownY;
    private boolean usaAlphaForEmoji;
    private boolean wasLayout;
    private Drawable wrapBackgroundDrawable;
    private int gravity = 51;
    private int maxLines = 1;
    private float rightDrawableScale = 1.0f;
    private int drawablePadding = AndroidUtilities.dp(4.0f);
    private int fullTextMaxLines = 3;
    private List<SpoilerEffect> spoilers = new ArrayList();
    private Stack<SpoilerEffect> spoilersPool = new Stack<>();
    private Path path = new Path();
    private TextPaint textPaint = new TextPaint(1);

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public SimpleTextView(Context context) {
        super(context);
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

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.wasLayout = false;
    }

    public void setTextSize(int i) {
        float dp = AndroidUtilities.dp(i);
        if (dp != this.textPaint.getTextSize()) {
            this.textPaint.setTextSize(dp);
            if (!recreateLayoutMaybe()) {
                invalidate();
            }
        }
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
        if (this.scrollNonFitText != z) {
            this.scrollNonFitText = z;
            if (z) {
                this.fadePaint = new Paint();
                this.fadePaint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.fadePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.fadePaintBack = new Paint();
                this.fadePaintBack.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                this.fadePaintBack.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            requestLayout();
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
        int i = 0;
        if (drawable != null) {
            i = 0 + drawable.getIntrinsicWidth() + this.drawablePadding;
        }
        Drawable drawable2 = this.rightDrawable;
        return drawable2 != null ? i + ((int) (drawable2.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding : i;
    }

    public Paint getPaint() {
        return this.textPaint;
    }

    private void calcOffset(int i) {
        if (this.layout.getLineCount() > 0) {
            this.textWidth = (int) Math.ceil(this.layout.getLineWidth(0));
            Layout layout = this.fullLayout;
            boolean z = true;
            if (layout != null) {
                this.textHeight = layout.getLineBottom(layout.getLineCount() - 1);
            } else if (this.maxLines <= 1 || this.layout.getLineCount() <= 0) {
                this.textHeight = this.layout.getLineBottom(0);
            } else {
                Layout layout2 = this.layout;
                this.textHeight = layout2.getLineBottom(layout2.getLineCount() - 1);
            }
            int i2 = this.gravity;
            if ((i2 & 7) == 1) {
                this.offsetX = ((i - this.textWidth) / 2) - ((int) this.layout.getLineLeft(0));
            } else if ((i2 & 7) == 3) {
                Layout layout3 = this.firstLineLayout;
                if (layout3 != null) {
                    this.offsetX = -((int) layout3.getLineLeft(0));
                } else {
                    this.offsetX = -((int) this.layout.getLineLeft(0));
                }
            } else if (this.layout.getLineLeft(0) == 0.0f) {
                Layout layout4 = this.firstLineLayout;
                if (layout4 != null) {
                    this.offsetX = (int) (i - layout4.getLineWidth(0));
                } else {
                    this.offsetX = i - this.textWidth;
                }
            } else {
                this.offsetX = -AndroidUtilities.dp(8.0f);
            }
            this.offsetX += getPaddingLeft();
            if (this.textWidth <= i) {
                z = false;
            }
            this.textDoesNotFit = z;
            Layout layout5 = this.fullLayout;
            if (layout5 != null && this.fullLayoutAdditionalWidth > 0) {
                this.fullLayoutLeftCharactersOffset = layout5.getPrimaryHorizontal(0) - this.firstLineLayout.getPrimaryHorizontal(0);
            }
        }
        int i3 = this.replacingDrawableTextIndex;
        if (i3 >= 0) {
            this.replacingDrawableTextOffset = this.layout.getPrimaryHorizontal(i3);
        } else {
            this.replacingDrawableTextOffset = 0.0f;
        }
    }

    public boolean createLayout(int i) {
        Drawable drawable;
        int i2;
        CharSequence charSequence = this.text;
        this.replacingDrawableTextIndex = -1;
        this.rightDrawableHidden = false;
        if (charSequence != null) {
            try {
                Drawable drawable2 = this.leftDrawable;
                int intrinsicWidth = drawable2 != null ? (i - drawable2.getIntrinsicWidth()) - this.drawablePadding : i;
                if (this.rightDrawable != null) {
                    i2 = (int) (drawable.getIntrinsicWidth() * this.rightDrawableScale);
                    intrinsicWidth = (intrinsicWidth - i2) - this.drawablePadding;
                } else {
                    i2 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence;
                if (this.replacedText != null) {
                    spannableStringBuilder = charSequence;
                    if (this.replacedDrawable != null) {
                        int indexOf = charSequence.toString().indexOf(this.replacedText);
                        this.replacingDrawableTextIndex = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
                            DialogCell.FixedWidthSpan fixedWidthSpan = new DialogCell.FixedWidthSpan(this.replacedDrawable.getIntrinsicWidth());
                            int i3 = this.replacingDrawableTextIndex;
                            valueOf.setSpan(fixedWidthSpan, i3, this.replacedText.length() + i3, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            intrinsicWidth = (intrinsicWidth - this.replacedDrawable.getIntrinsicWidth()) - this.drawablePadding;
                            spannableStringBuilder = charSequence;
                        }
                    }
                }
                if (this.canHideRightDrawable && i2 != 0 && !spannableStringBuilder.equals(TextUtils.ellipsize(spannableStringBuilder, this.textPaint, intrinsicWidth, TextUtils.TruncateAt.END))) {
                    this.rightDrawableHidden = true;
                    intrinsicWidth = intrinsicWidth + i2 + this.drawablePadding;
                }
                if (this.buildFullLayout) {
                    CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, this.textPaint, intrinsicWidth, TextUtils.TruncateAt.END);
                    if (!ellipsize.equals(spannableStringBuilder)) {
                        StaticLayout createStaticLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), this.textPaint, intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, intrinsicWidth, this.fullTextMaxLines, false);
                        this.fullLayout = createStaticLayout;
                        if (createStaticLayout != null) {
                            int lineEnd = createStaticLayout.getLineEnd(0);
                            int lineStart = this.fullLayout.getLineStart(1);
                            CharSequence subSequence = spannableStringBuilder.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(spannableStringBuilder);
                            valueOf2.setSpan(new EmptyStubSpan(), 0, lineStart, 0);
                            String subSequence2 = lineEnd < ellipsize.length() ? ellipsize.subSequence(lineEnd, ellipsize.length()) : "…";
                            this.firstLineLayout = new StaticLayout(ellipsize, 0, ellipsize.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, subSequence.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.layout = staticLayout;
                            String str = subSequence2;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) subSequence2);
                            }
                            CharSequence charSequence2 = str;
                            this.partLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            int length = valueOf2.length();
                            TextPaint textPaint = this.textPaint;
                            int i4 = this.fullLayoutAdditionalWidth;
                            this.fullLayout = StaticLayoutEx.createStaticLayout(valueOf2, 0, length, textPaint, AndroidUtilities.dp(8.0f) + intrinsicWidth + i4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, intrinsicWidth + i4, this.fullTextMaxLines, false);
                        }
                    } else {
                        this.layout = new StaticLayout(ellipsize, 0, ellipsize.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.fullLayout = null;
                        this.partLayout = null;
                        this.firstLineLayout = null;
                    }
                } else if (this.maxLines > 1) {
                    this.layout = StaticLayoutEx.createStaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), this.textPaint, intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, intrinsicWidth, this.maxLines, false);
                } else {
                    CharSequence charSequence3 = spannableStringBuilder;
                    if (!this.scrollNonFitText) {
                        charSequence3 = TextUtils.ellipsize(spannableStringBuilder, this.textPaint, intrinsicWidth, TextUtils.TruncateAt.END);
                    }
                    CharSequence charSequence4 = charSequence3;
                    this.layout = new StaticLayout(charSequence4, 0, charSequence4.length(), this.textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + intrinsicWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.spoilersPool.addAll(this.spoilers);
                this.spoilers.clear();
                Layout layout = this.layout;
                if (layout != null && (layout.getText() instanceof Spannable)) {
                    SpoilerEffect.addSpoilers(this, this.layout, this.spoilersPool, this.spoilers);
                }
                calcOffset(intrinsicWidth);
            } catch (Exception unused) {
            }
        } else {
            this.layout = null;
            this.textWidth = 0;
            this.textHeight = 0;
        }
        invalidate();
        return true;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.lastWidth;
        int i4 = AndroidUtilities.displaySize.x;
        if (i3 != i4) {
            this.lastWidth = i4;
            this.scrollingOffset = 0.0f;
            this.currentScrollDelay = 500;
        }
        createLayout(((size - getPaddingLeft()) - getPaddingRight()) - this.minusWidth);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = this.textHeight;
        }
        setMeasuredDimension(size, size2);
        if ((this.gravity & 112) == 16) {
            this.offsetY = ((getMeasuredHeight() - this.textHeight) / 2) + getPaddingTop();
        } else {
            this.offsetY = getPaddingTop();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.wasLayout = true;
    }

    public int getTextWidth() {
        return this.textWidth;
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
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.leftDrawable = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            if (!recreateLayoutMaybe()) {
                invalidate();
            }
        }
    }

    public void replaceTextWithDrawable(Drawable drawable, String str) {
        Drawable drawable2 = this.replacedDrawable;
        if (drawable2 != drawable) {
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
    }

    public void setMinusWidth(int i) {
        if (i != this.minusWidth) {
            this.minusWidth = i;
            if (!recreateLayoutMaybe()) {
                invalidate();
            }
        }
    }

    public Drawable getRightDrawable() {
        return this.rightDrawable;
    }

    public void setRightDrawable(Drawable drawable) {
        Drawable drawable2 = this.rightDrawable;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.rightDrawable = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            if (!recreateLayoutMaybe()) {
                invalidate();
            }
        }
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
        this.scrollingOffset = 0.0f;
        this.currentScrollDelay = 500;
        recreateLayoutMaybe();
        return true;
    }

    public void setDrawablePadding(int i) {
        if (this.drawablePadding != i) {
            this.drawablePadding = i;
            if (!recreateLayoutMaybe()) {
                invalidate();
            }
        }
    }

    private boolean recreateLayoutMaybe() {
        if (!this.wasLayout || getMeasuredHeight() == 0 || this.buildFullLayout) {
            requestLayout();
            return true;
        }
        boolean createLayout = createLayout(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.minusWidth);
        if ((this.gravity & 112) == 16) {
            this.offsetY = ((getMeasuredHeight() - this.textHeight) / 2) + getPaddingTop();
        } else {
            this.offsetY = getPaddingTop();
        }
        return createLayout;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.text;
        return charSequence == null ? "" : charSequence;
    }

    public int getLineCount() {
        Layout layout = this.layout;
        int i = 0;
        if (layout != null) {
            i = 0 + layout.getLineCount();
        }
        Layout layout2 = this.fullLayout;
        return layout2 != null ? i + layout2.getLineCount() : i;
    }

    public int getTextStartX() {
        int i = 0;
        if (this.layout == null) {
            return 0;
        }
        Drawable drawable = this.leftDrawable;
        if (drawable != null && (this.gravity & 7) == 3) {
            i = 0 + this.drawablePadding + drawable.getIntrinsicWidth();
        }
        Drawable drawable2 = this.replacedDrawable;
        if (drawable2 != null && this.replacingDrawableTextIndex < 0 && (this.gravity & 7) == 3) {
            i += this.drawablePadding + drawable2.getIntrinsicWidth();
        }
        return ((int) getX()) + this.offsetX + i;
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

    @Override
    public void onDraw(Canvas canvas) {
        int i;
        Drawable drawable;
        float f;
        int i2;
        int i3;
        int i4;
        int i5;
        super.onDraw(canvas);
        boolean z = this.scrollNonFitText && (this.textDoesNotFit || this.scrollingOffset != 0.0f);
        int i6 = Integer.MIN_VALUE;
        if (z) {
            i6 = canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        }
        this.totalWidth = this.textWidth;
        Drawable drawable2 = this.leftDrawable;
        if (drawable2 != null) {
            int i7 = (int) (-this.scrollingOffset);
            int i8 = this.gravity;
            if ((i8 & 7) == 1) {
                i7 += this.offsetX;
            }
            if ((i8 & 112) == 16) {
                i5 = ((getMeasuredHeight() - this.leftDrawable.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
            } else {
                i5 = this.leftDrawableTopPadding + ((this.textHeight - drawable2.getIntrinsicHeight()) / 2);
            }
            Drawable drawable3 = this.leftDrawable;
            drawable3.setBounds(i7, i5, drawable3.getIntrinsicWidth() + i7, this.leftDrawable.getIntrinsicHeight() + i5);
            this.leftDrawable.draw(canvas);
            int i9 = this.gravity;
            i = ((i9 & 7) == 3 || (i9 & 7) == 1) ? this.drawablePadding + this.leftDrawable.getIntrinsicWidth() + 0 : 0;
            this.totalWidth += this.drawablePadding + this.leftDrawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        Drawable drawable4 = this.replacedDrawable;
        if (!(drawable4 == null || this.replacedText == null)) {
            int i10 = (int) ((-this.scrollingOffset) + this.replacingDrawableTextOffset);
            int i11 = this.gravity;
            if ((i11 & 7) == 1) {
                i10 += this.offsetX;
            }
            if ((i11 & 112) == 16) {
                i4 = (getMeasuredHeight() - this.replacedDrawable.getIntrinsicHeight()) / 2;
                i3 = this.leftDrawableTopPadding;
            } else {
                i4 = (this.textHeight - drawable4.getIntrinsicHeight()) / 2;
                i3 = this.leftDrawableTopPadding;
            }
            int i12 = i4 + i3;
            Drawable drawable5 = this.replacedDrawable;
            drawable5.setBounds(i10, i12, drawable5.getIntrinsicWidth() + i10, this.replacedDrawable.getIntrinsicHeight() + i12);
            this.replacedDrawable.draw(canvas);
            if (this.replacingDrawableTextIndex < 0) {
                int i13 = this.gravity;
                if ((i13 & 7) == 3 || (i13 & 7) == 1) {
                    i += this.drawablePadding + this.replacedDrawable.getIntrinsicWidth();
                }
                this.totalWidth += this.drawablePadding + this.replacedDrawable.getIntrinsicWidth();
            }
        }
        if (this.rightDrawable != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f) {
            int i14 = this.textWidth + i + this.drawablePadding + ((int) (-this.scrollingOffset));
            int i15 = this.gravity;
            if ((i15 & 7) == 1) {
                i2 = this.offsetX;
            } else {
                if ((i15 & 7) == 5) {
                    i2 = this.offsetX;
                }
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
                int i16 = ((this.textHeight - intrinsicHeight) / 2) + this.rightDrawableTopPadding;
                this.rightDrawable.setBounds(i14, i16, i14 + intrinsicWidth, i16 + intrinsicHeight);
                this.rightDrawableX = i14 + (intrinsicWidth >> 1);
                this.rightDrawableY = i16 + (intrinsicHeight >> 1);
                this.rightDrawable.draw(canvas);
                this.totalWidth += this.drawablePadding + intrinsicWidth;
            }
            i14 += i2;
            int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * this.rightDrawableScale);
            int intrinsicHeight2 = (int) (this.rightDrawable.getIntrinsicHeight() * this.rightDrawableScale);
            int i162 = ((this.textHeight - intrinsicHeight2) / 2) + this.rightDrawableTopPadding;
            this.rightDrawable.setBounds(i14, i162, i14 + intrinsicWidth2, i162 + intrinsicHeight2);
            this.rightDrawableX = i14 + (intrinsicWidth2 >> 1);
            this.rightDrawableY = i162 + (intrinsicHeight2 >> 1);
            this.rightDrawable.draw(canvas);
            this.totalWidth += this.drawablePadding + intrinsicWidth2;
        }
        int dp = this.totalWidth + AndroidUtilities.dp(16.0f);
        float f2 = this.scrollingOffset;
        if (f2 != 0.0f) {
            Drawable drawable6 = this.leftDrawable;
            if (drawable6 != null) {
                int i17 = ((int) (-f2)) + dp;
                int intrinsicHeight3 = ((this.textHeight - drawable6.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
                Drawable drawable7 = this.leftDrawable;
                drawable7.setBounds(i17, intrinsicHeight3, drawable7.getIntrinsicWidth() + i17, this.leftDrawable.getIntrinsicHeight() + intrinsicHeight3);
                this.leftDrawable.draw(canvas);
            }
            Drawable drawable8 = this.rightDrawable;
            if (drawable8 != null) {
                int i18 = this.textWidth + i + this.drawablePadding + ((int) (-this.scrollingOffset)) + dp;
                int intrinsicHeight4 = ((this.textHeight - drawable8.getIntrinsicHeight()) / 2) + this.rightDrawableTopPadding;
                Drawable drawable9 = this.rightDrawable;
                drawable9.setBounds(i18, intrinsicHeight4, drawable9.getIntrinsicWidth() + i18, this.rightDrawable.getIntrinsicHeight() + intrinsicHeight4);
                this.rightDrawable.draw(canvas);
            }
        }
        if (this.layout != null) {
            Emoji.emojiDrawingUseAlpha = this.usaAlphaForEmoji;
            if (this.wrapBackgroundDrawable != null) {
                int i19 = this.textWidth;
                int i20 = ((int) ((this.offsetX + i) - this.scrollingOffset)) + (i19 / 2);
                int max = Math.max(i19 + getPaddingLeft() + getPaddingRight(), this.minWidth);
                int i21 = i20 - (max / 2);
                this.wrapBackgroundDrawable.setBounds(i21, 0, max + i21, getMeasuredHeight());
                this.wrapBackgroundDrawable.draw(canvas);
            }
            if (!(this.offsetX + i == 0 && this.offsetY == 0 && this.scrollingOffset == 0.0f)) {
                canvas.save();
                canvas.translate((this.offsetX + i) - this.scrollingOffset, this.offsetY);
            }
            drawLayout(canvas);
            if (this.partLayout != null && this.fullAlpha < 1.0f) {
                int alpha = this.textPaint.getAlpha();
                this.textPaint.setAlpha((int) ((1.0f - this.fullAlpha) * 255.0f));
                canvas.save();
                if (this.partLayout.getText().length() == 1) {
                    f = AndroidUtilities.dp(this.fullTextMaxLines == 1 ? 0.5f : 4.0f);
                } else {
                    f = 0.0f;
                }
                if (this.layout.getLineLeft(0) != 0.0f) {
                    canvas.translate((-this.layout.getLineWidth(0)) + f, 0.0f);
                } else {
                    canvas.translate(this.layout.getLineWidth(0) - f, 0.0f);
                }
                float f3 = this.fullAlpha;
                canvas.translate(((-this.fullLayoutLeftOffset) * f3) + (this.fullLayoutLeftCharactersOffset * f3), 0.0f);
                this.partLayout.draw(canvas);
                canvas.restore();
                this.textPaint.setAlpha(alpha);
            }
            if (this.fullLayout != null && this.fullAlpha > 0.0f) {
                int alpha2 = this.textPaint.getAlpha();
                this.textPaint.setAlpha((int) (this.fullAlpha * 255.0f));
                float f4 = this.fullAlpha;
                float f5 = this.fullLayoutLeftCharactersOffset;
                canvas.translate((((-this.fullLayoutLeftOffset) * f4) + (f4 * f5)) - f5, 0.0f);
                this.fullLayout.draw(canvas);
                this.textPaint.setAlpha(alpha2);
            }
            if (this.scrollingOffset != 0.0f) {
                canvas.translate(dp, 0.0f);
                drawLayout(canvas);
            }
            if (!(this.offsetX + i == 0 && this.offsetY == 0 && this.scrollingOffset == 0.0f)) {
                canvas.restore();
            }
            if (z) {
                if (this.scrollingOffset < AndroidUtilities.dp(10.0f)) {
                    this.fadePaint.setAlpha((int) ((this.scrollingOffset / AndroidUtilities.dp(10.0f)) * 255.0f));
                } else if (this.scrollingOffset > (this.totalWidth + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(10.0f)) {
                    this.fadePaint.setAlpha((int) ((1.0f - ((this.scrollingOffset - ((this.totalWidth + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(10.0f))) / AndroidUtilities.dp(10.0f))) * 255.0f));
                } else {
                    this.fadePaint.setAlpha(255);
                }
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.fadePaint);
                canvas.save();
                canvas.translate(getMeasuredWidth() - AndroidUtilities.dp(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(6.0f), getMeasuredHeight(), this.fadePaintBack);
                canvas.restore();
            }
            updateScrollAnimation();
            Emoji.emojiDrawingUseAlpha = true;
        }
        if (z) {
            canvas.restoreToCount(i6);
        }
    }

    private void drawLayout(Canvas canvas) {
        if (this.fullAlpha <= 0.0f || this.fullLayoutLeftOffset == 0) {
            canvas.save();
            clipOutSpoilers(canvas);
            this.layout.draw(canvas);
            canvas.restore();
            drawSpoilers(canvas);
            return;
        }
        canvas.save();
        float f = this.fullAlpha;
        canvas.translate(((-this.fullLayoutLeftOffset) * f) + (this.fullLayoutLeftCharactersOffset * f), 0.0f);
        canvas.save();
        clipOutSpoilers(canvas);
        this.layout.draw(canvas);
        canvas.restore();
        drawSpoilers(canvas);
        canvas.restore();
    }

    private void clipOutSpoilers(Canvas canvas) {
        this.path.rewind();
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            Rect bounds = spoilerEffect.getBounds();
            this.path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(this.path, Region.Op.DIFFERENCE);
    }

    private void drawSpoilers(Canvas canvas) {
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            spoilerEffect.draw(canvas);
        }
    }

    private void updateScrollAnimation() {
        if (!this.scrollNonFitText) {
            return;
        }
        if (this.textDoesNotFit || this.scrollingOffset != 0.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            int i = this.currentScrollDelay;
            if (i > 0) {
                this.currentScrollDelay = (int) (i - j);
            } else {
                int dp = this.totalWidth + AndroidUtilities.dp(16.0f);
                float f = 50.0f;
                if (this.scrollingOffset < AndroidUtilities.dp(100.0f)) {
                    f = ((this.scrollingOffset / AndroidUtilities.dp(100.0f)) * 20.0f) + 30.0f;
                } else if (this.scrollingOffset >= dp - AndroidUtilities.dp(100.0f)) {
                    f = 50.0f - (((this.scrollingOffset - (dp - AndroidUtilities.dp(100.0f))) / AndroidUtilities.dp(100.0f)) * 20.0f);
                }
                float dp2 = this.scrollingOffset + ((((float) j) / 1000.0f) * AndroidUtilities.dp(f));
                this.scrollingOffset = dp2;
                this.lastUpdateTime = elapsedRealtime;
                if (dp2 > dp) {
                    this.scrollingOffset = 0.0f;
                    this.currentScrollDelay = 500;
                }
            }
            invalidate();
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
        Drawable drawable4 = this.replacedDrawable;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
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
        if (this.fullLayoutAdditionalWidth != i || this.fullLayoutLeftOffset != i2) {
            this.fullLayoutAdditionalWidth = i;
            this.fullLayoutLeftOffset = i2;
            createLayout(getMeasuredWidth() - this.minusWidth);
        }
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

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.rightDrawableOnClickListener == null || this.rightDrawable == null)) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.rightDrawableX - AndroidUtilities.dp(16.0f), this.rightDrawableY - AndroidUtilities.dp(16.0f), this.rightDrawableX + AndroidUtilities.dp(16.0f), this.rightDrawableY + AndroidUtilities.dp(16.0f));
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.maybeClick = true;
                this.touchDownX = motionEvent.getX();
                this.touchDownY = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() != 2 || !this.maybeClick) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (this.maybeClick && motionEvent.getAction() == 1) {
                        this.rightDrawableOnClickListener.onClick(this);
                    }
                    this.maybeClick = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (Math.abs(motionEvent.getX() - this.touchDownX) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.touchDownY) >= AndroidUtilities.touchSlop) {
                this.maybeClick = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.maybeClick;
    }
}
