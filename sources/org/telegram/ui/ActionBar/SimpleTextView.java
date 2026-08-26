package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
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
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.StaticLayoutEx;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.ProfileActivity;

public class SimpleTextView extends View implements Drawable.Callback {
    public boolean attachedToWindow;
    public boolean buildFullLayout;
    public boolean canHideRightDrawable;
    public int currentScrollDelay;
    public int drawablePadding;
    public boolean ellipsizeByGradient;
    public boolean ellipsizeByGradientLeft;
    public int ellipsizeByGradientWidthDp;
    public int emojiCacheType;
    public AnimatedEmojiSpan.EmojiGroupedSpans emojiStack;
    public PorterDuffColorFilter emojiStackColorFilter;
    public Paint fadeEllpsizePaint;
    public int fadeEllpsizePaintWidth;
    public Paint fadePaint;
    public Paint fadePaintBack;
    public StaticLayout firstLineLayout;
    public Boolean forceEllipsizeByGradientLeft;
    public float fullAlpha;
    public StaticLayout fullLayout;
    public int fullLayoutAdditionalWidth;
    public float fullLayoutLeftCharactersOffset;
    public int fullLayoutLeftOffset;
    public int fullTextMaxLines;
    public int gravity;
    public long lastUpdateTime;
    public int lastWidth;
    public StaticLayout layout;
    public float layoutX;
    public float layoutY;
    public Drawable leftDrawable;
    public boolean leftDrawableOutside;
    public int leftDrawableTopPadding;
    public Layout.Alignment mAlignment;
    public int maxLines;
    public boolean maybeClick;
    public int minWidth;
    public int minusWidth;
    public int offsetX;
    public int offsetY;
    public int paddingRight;
    public StaticLayout partLayout;
    public final Path path;
    public StatusDrawable replacedDrawable;
    public String replacedText;
    public int replacingDrawableTextIndex;
    public float replacingDrawableTextOffset;
    public Drawable rightDrawable;
    public Drawable rightDrawable2;
    public boolean rightDrawableHidden;
    public boolean rightDrawableInside;
    public View.OnClickListener rightDrawableOnClickListener;
    public boolean rightDrawableOutside;
    public float rightDrawableScale;
    public int rightDrawableTopPadding;
    public int rightDrawableX;
    public int rightDrawableY;
    public boolean scrollNonFitText;
    public float scrollingOffset;
    public final ArrayList spoilers;
    public final Stack spoilersPool;
    public CharSequence text;
    public boolean textDoesNotFit;
    public int textHeight;
    public final TextPaint textPaint;
    public int textWidth;
    public int totalWidth;
    public float touchDownX;
    public float touchDownY;
    public boolean wasLayout;
    public boolean widthWrapContent;
    public Drawable wrapBackgroundDrawable;

    public interface PressableDrawable {
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

    private Layout.Alignment getAlignment() {
        return this.mAlignment;
    }

    public final void calcOffset(int i) {
        int intrinsicWidth;
        StaticLayout staticLayout = this.layout;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.textWidth = (int) Math.max(Math.ceil(this.layout.getLineWidth(0)), Math.ceil(this.layout.getLineRight(0) - this.layout.getLineLeft(0)));
            StaticLayout staticLayout2 = this.fullLayout;
            if (staticLayout2 != null) {
                this.textHeight = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.maxLines <= 1 || this.layout.getLineCount() <= 0) {
                this.textHeight = this.layout.getLineBottom(0);
            } else {
                StaticLayout staticLayout3 = this.layout;
                this.textHeight = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            }
            int i2 = this.gravity & 7;
            if (i2 == 1) {
                this.offsetX = ((i - this.textWidth) / 2) - ((int) this.layout.getLineLeft(0));
            } else if (i2 == 3) {
                StaticLayout staticLayout4 = this.firstLineLayout;
                if (staticLayout4 != null) {
                    this.offsetX = -((int) staticLayout4.getLineLeft(0));
                } else {
                    this.offsetX = -((int) this.layout.getLineLeft(0));
                }
            } else if (this.layout.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.firstLineLayout;
                if (staticLayout5 != null) {
                    this.offsetX = (int) (i - staticLayout5.getLineWidth(0));
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
            StaticLayout staticLayout6 = this.fullLayout;
            if (staticLayout6 != null && this.fullLayoutAdditionalWidth > 0) {
                this.fullLayoutLeftCharactersOffset = staticLayout6.getPrimaryHorizontal(0) - this.firstLineLayout.getPrimaryHorizontal(0);
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
        ArrayList arrayList = this.spoilers;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.path;
        path.rewind();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Rect bounds = ((SpoilerEffect) arrayList.get(i)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            i = i2;
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void createLayout(int i) {
        int intrinsicWidth;
        int intrinsicWidth2;
        int i2;
        int i3;
        CharSequence charSequence = this.text;
        this.replacingDrawableTextIndex = -1;
        boolean z = false;
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
                        int i4 = this.replacingDrawableTextIndex;
                        spannableStringBuilderValueOf.setSpan(fixedWidthSpan, i4, this.replacedText.length() + i4, 0);
                        charSequence2 = spannableStringBuilderValueOf;
                    } else {
                        charSequence2 = charSequence;
                        intrinsicWidth = (intrinsicWidth - this.replacedDrawable.getIntrinsicWidth()) - this.drawablePadding;
                        charSequence2 = charSequence;
                    }
                }
                charSequence2 = charSequence;
                CharSequence charSequence3 = charSequence2;
                boolean z2 = this.canHideRightDrawable;
                TextPaint textPaint = this.textPaint;
                if (z2 && intrinsicWidth2 != 0 && !this.rightDrawableOutside && !charSequence3.equals(TextUtils.ellipsize(charSequence3, textPaint, intrinsicWidth, TextUtils.TruncateAt.END))) {
                    this.rightDrawableHidden = true;
                    intrinsicWidth = intrinsicWidth + intrinsicWidth2 + this.drawablePadding;
                }
                int i5 = intrinsicWidth;
                if (this.buildFullLayout) {
                    CharSequence charSequenceEllipsize = !this.ellipsizeByGradient ? TextUtils.ellipsize(charSequence3, textPaint, i5, TextUtils.TruncateAt.END) : charSequence3;
                    if (this.ellipsizeByGradient || charSequenceEllipsize.equals(charSequence3)) {
                        i3 = i5;
                        CharSequence charSequence4 = charSequenceEllipsize;
                        this.layout = new StaticLayout(charSequence4, 0, charSequence4.length(), textPaint, (this.scrollNonFitText || this.ellipsizeByGradient) ? AndroidUtilities.dp(2000.0f) : i3 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                        this.fullLayout = null;
                        this.partLayout = null;
                        this.firstLineLayout = null;
                    } else {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout staticLayoutCreateStaticLayout = StaticLayoutEx.createStaticLayout(charSequence3, textPaint, i5, alignment, 0.0f, false, truncateAt, i5, this.fullTextMaxLines, false);
                        i3 = i5;
                        this.fullLayout = staticLayoutCreateStaticLayout;
                        if (staticLayoutCreateStaticLayout != null) {
                            int lineEnd = staticLayoutCreateStaticLayout.getLineEnd(0);
                            int lineStart = this.fullLayout.getLineStart(1);
                            CharSequence charSequenceSubSequence = charSequence3.subSequence(0, lineEnd);
                            SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(charSequence3);
                            spannableStringBuilderValueOf2.setSpan(new CountrySelectActivity.AnonymousClass5(z), 0, lineStart, 0);
                            CharSequence charSequenceSubSequence2 = lineEnd < charSequenceEllipsize.length() ? charSequenceEllipsize.subSequence(lineEnd, charSequenceEllipsize.length()) : "…";
                            this.firstLineLayout = new StaticLayout(charSequenceEllipsize, 0, charSequenceEllipsize.length(), textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : i3 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            StaticLayout staticLayout = new StaticLayout(charSequenceSubSequence, 0, charSequenceSubSequence.length(), textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : i3 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.layout = staticLayout;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                charSequenceSubSequence2 = "\u200f" + ((Object) charSequenceSubSequence2);
                            }
                            CharSequence charSequence5 = charSequenceSubSequence2;
                            this.partLayout = new StaticLayout(charSequence5, 0, charSequence5.length(), textPaint, this.scrollNonFitText ? AndroidUtilities.dp(2000.0f) : i3 + AndroidUtilities.dp(8.0f), getAlignment(), 1.0f, 0.0f, false);
                            this.fullLayout = StaticLayoutEx.createStaticLayout(spannableStringBuilderValueOf2, textPaint, i3 + AndroidUtilities.dp(8.0f) + this.fullLayoutAdditionalWidth, getAlignment(), 0.0f, false, truncateAt, i3 + this.fullLayoutAdditionalWidth, this.fullTextMaxLines, false);
                        }
                    }
                    i2 = i3;
                } else if (this.maxLines > 1) {
                    StaticLayout staticLayoutCreateStaticLayout2 = StaticLayoutEx.createStaticLayout(charSequence3, textPaint, i5, getAlignment(), 0.0f, false, TextUtils.TruncateAt.END, i5, this.maxLines, false);
                    i2 = i5;
                    this.layout = staticLayoutCreateStaticLayout2;
                } else {
                    i2 = i5;
                    CharSequence charSequenceEllipsize2 = (this.scrollNonFitText || this.ellipsizeByGradient) ? charSequence3 : TextUtils.ellipsize(charSequence3, textPaint, i2, TextUtils.TruncateAt.END);
                    this.layout = new StaticLayout(charSequenceEllipsize2, 0, charSequenceEllipsize2.length(), textPaint, (this.scrollNonFitText || this.ellipsizeByGradient) ? AndroidUtilities.dp(2000.0f) : AndroidUtilities.dp(8.0f) + i2, getAlignment(), 1.0f, 0.0f, false);
                }
                Stack stack = this.spoilersPool;
                ArrayList arrayList = this.spoilers;
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.layout;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    SpoilerEffect.addSpoilers(this, this.layout, -2, -2, stack, arrayList);
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
    }

    public final void drawLayout(Canvas canvas) {
        float f = this.fullAlpha;
        int i = 0;
        ArrayList arrayList = this.spoilers;
        if (f <= 0.0f || this.fullLayoutLeftOffset == 0) {
            canvas.save();
            clipOutSpoilers(canvas);
            AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.emojiStack;
            if (emojiGroupedSpans != null) {
                emojiGroupedSpans.clearPositions();
            }
            this.layout.draw(canvas);
            canvas.restore();
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiStackColorFilter);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((SpoilerEffect) obj).draw(canvas);
            }
            return;
        }
        canvas.save();
        float f2 = -this.fullLayoutLeftOffset;
        float f3 = this.fullAlpha;
        canvas.translate((this.fullLayoutLeftCharactersOffset * f3) + (f2 * f3), 0.0f);
        float f4 = this.layoutX;
        float f5 = -this.fullLayoutLeftOffset;
        float f6 = this.fullAlpha;
        this.layoutX = OKLCH.m(this.fullLayoutLeftCharactersOffset, f6, f5 * f6, f4);
        canvas.save();
        clipOutSpoilers(canvas);
        AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans2 = this.emojiStack;
        if (emojiGroupedSpans2 != null) {
            emojiGroupedSpans2.clearPositions();
        }
        this.layout.draw(canvas);
        canvas.restore();
        AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emojiStack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiStackColorFilter);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((SpoilerEffect) obj2).draw(canvas);
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
        StaticLayout staticLayout = this.layout;
        int lineCount = staticLayout != null ? staticLayout.getLineCount() : 0;
        StaticLayout staticLayout2 = this.fullLayout;
        return staticLayout2 != null ? staticLayout2.getLineCount() + lineCount : lineCount;
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
        StatusDrawable statusDrawable = this.replacedDrawable;
        if (statusDrawable != null && this.replacingDrawableTextIndex < 0 && (this.gravity & 7) == 3) {
            intrinsicWidth += statusDrawable.getIntrinsicWidth() + this.drawablePadding;
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
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
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
        StatusDrawable statusDrawable = this.replacedDrawable;
        if (drawable == statusDrawable) {
            invalidate(statusDrawable.getBounds());
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
        float f4;
        boolean z;
        float fM;
        int iM4;
        int i4;
        int iM5;
        int i5;
        float fDp;
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
        StatusDrawable statusDrawable = this.replacedDrawable;
        if (statusDrawable != null && this.replacedText != null) {
            int i13 = (int) ((-this.scrollingOffset) + this.replacingDrawableTextOffset);
            int i14 = this.gravity;
            if ((i14 & 7) == 1) {
                i13 += this.offsetX;
            }
            if ((i14 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.replacedDrawable.getIntrinsicHeight()) / 2) + this.leftDrawableTopPadding;
            } else {
                intrinsicHeight2 = this.leftDrawableTopPadding + ((this.textHeight - statusDrawable.getIntrinsicHeight()) / 2);
            }
            StatusDrawable statusDrawable2 = this.replacedDrawable;
            statusDrawable2.setBounds(i13, intrinsicHeight2, statusDrawable2.getIntrinsicWidth() + i13, this.replacedDrawable.getIntrinsicHeight() + intrinsicHeight2);
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
        Drawable drawable3 = this.rightDrawable;
        if (drawable3 == null || this.rightDrawableHidden || this.rightDrawableScale <= 0.0f || this.rightDrawableOutside || this.rightDrawableInside) {
            f = 0.0f;
        } else {
            int i17 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset));
            int i18 = this.gravity & 7;
            if (i18 == 1 || i18 == 5) {
                i17 += this.offsetX;
            }
            int intrinsicWidth2 = (int) (drawable3.getIntrinsicWidth() * this.rightDrawableScale);
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
            Drawable drawable4 = this.rightDrawable;
            if (drawable4 != null) {
                intrinsicWidth3 += ((int) (drawable4.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
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
                Drawable drawable5 = this.leftDrawable;
                drawable5.setBounds(i22, intrinsicHeight, drawable5.getIntrinsicWidth() + i22, this.leftDrawable.getIntrinsicHeight() + intrinsicHeight);
                this.leftDrawable.draw(canvas);
            }
            Drawable drawable6 = this.rightDrawable;
            if (drawable6 == null || this.rightDrawableOutside) {
                f2 = 16.0f;
            } else {
                int intrinsicWidth5 = (int) (drawable6.getIntrinsicWidth() * this.rightDrawableScale);
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
            Drawable drawable7 = this.rightDrawable2;
            if (drawable7 != null && !this.rightDrawableOutside) {
                int intrinsicWidth6 = (int) (drawable7.getIntrinsicWidth() * this.rightDrawableScale);
                int intrinsicHeight7 = (int) (this.rightDrawable2.getIntrinsicHeight() * this.rightDrawableScale);
                int intrinsicWidth7 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset)) + iDp;
                Drawable drawable8 = this.rightDrawable;
                if (drawable8 != null) {
                    intrinsicWidth7 += ((int) (drawable8.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
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
                Drawable drawable9 = this.rightDrawable;
                canvas.clipRect(i16, 0, maxTextWidth - AndroidUtilities.dp((drawable9 == null || (drawable9 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) || !this.rightDrawableOutside) ? 0.0f : 2.0f), getMeasuredHeight());
            }
            Emoji.emojiDrawingUseAlpha = false;
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
            StaticLayout staticLayout = this.partLayout;
            TextPaint textPaint = this.textPaint;
            if (staticLayout == null || this.fullAlpha >= 1.0f) {
                f3 = 0.0f;
            } else {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.fullAlpha) * 255.0f));
                canvas.save();
                if (this.partLayout.getText().length() == 1) {
                    fDp = AndroidUtilities.dp(this.fullTextMaxLines == 1 ? 0.5f : 4.0f);
                } else {
                    fDp = 0.0f;
                }
                if (this.layout.getLineLeft(0) != f) {
                    canvas.translate((-this.layout.getLineWidth(0)) + fDp, 0.0f);
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                    canvas.translate(this.layout.getLineWidth(0) - fDp, 0.0f);
                }
                float f6 = -this.fullLayoutLeftOffset;
                float f7 = this.fullAlpha;
                canvas.translate((this.fullLayoutLeftCharactersOffset * f7) + (f6 * f7), f3);
                this.partLayout.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.fullLayout == null || this.fullAlpha <= f3) {
                f4 = 0.0f;
            } else {
                int alpha2 = textPaint.getAlpha();
                textPaint.setAlpha((int) (this.fullAlpha * 255.0f));
                float f8 = -this.fullLayoutLeftOffset;
                float f9 = this.fullAlpha;
                float f10 = this.fullLayoutLeftCharactersOffset;
                float f11 = ((f9 * f10) + (f8 * f9)) - f10;
                f4 = 0.0f;
                canvas.translate(f11, 0.0f);
                this.fullLayout.draw(canvas);
                textPaint.setAlpha(alpha2);
            }
            if (this.scrollingOffset != f4) {
                canvas.translate(iDp, f4);
                drawLayout(canvas);
            }
            if (this.offsetX + i16 != 0 || this.offsetY != 0 || this.scrollingOffset != f4) {
                canvas.restore();
            }
            Drawable drawable10 = this.rightDrawable;
            if (drawable10 != null && !this.rightDrawableHidden && this.rightDrawableScale > 0.0f && !this.rightDrawableOutside && this.rightDrawableInside) {
                int i30 = this.textWidth + i16 + this.drawablePadding + ((int) (-this.scrollingOffset));
                int i31 = this.gravity & 7;
                if (i31 == 1 || i31 == 5) {
                    i30 += this.offsetX;
                }
                int intrinsicWidth8 = (int) (drawable10.getIntrinsicWidth() * this.rightDrawableScale);
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
                Drawable drawable11 = this.rightDrawable;
                if (drawable11 != null) {
                    intrinsicWidth9 += ((int) (drawable11.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
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
                    Drawable drawable12 = this.rightDrawable;
                    canvas.translate(maxTextWidth2 - AndroidUtilities.dp((drawable12 == null || (drawable12 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) || !this.rightDrawableOutside) ? 0.0f : 2.0f), 0.0f);
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
                        fM = zzjd.m(this.scrollingOffset, AndroidUtilities.dp(100.0f), 20.0f, 30.0f);
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
        Drawable drawable13 = this.leftDrawable;
        if (drawable13 != null && this.leftDrawableOutside) {
            int intrinsicWidth11 = drawable13.getIntrinsicWidth();
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
            float f12 = this.scrollingOffset;
            int iMin = Math.min(i37 + (f12 == 0.0f ? -iDp : (int) (-f12)) + iDp, (getMaxTextWidth() - this.paddingRight) + this.drawablePadding);
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
        float f13 = this.scrollingOffset;
        int iMin2 = Math.min(i39 + (f13 == 0.0f ? -iDp : (int) (-f13)) + iDp, (getMaxTextWidth() - this.paddingRight) + this.drawablePadding);
        Drawable drawable14 = this.rightDrawable;
        if (drawable14 != null) {
            iMin2 += ((int) (drawable14.getIntrinsicWidth() * this.rightDrawableScale)) + this.drawablePadding;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                    ((ProfileActivity.ShowDrawable) ((PressableDrawable) obj)).bounce.setPressed(true);
                }
            } else if (motionEvent.getAction() == 2 && this.maybeClick) {
                if (Math.abs(motionEvent.getX() - this.touchDownX) >= AndroidUtilities.touchSlop || Math.abs(motionEvent.getY() - this.touchDownY) >= AndroidUtilities.touchSlop) {
                    this.maybeClick = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Object obj2 = this.rightDrawable;
                    if (obj2 instanceof PressableDrawable) {
                        ((ProfileActivity.ShowDrawable) ((PressableDrawable) obj2)).bounce.setPressed(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.maybeClick && motionEvent.getAction() == 1) {
                    this.rightDrawableOnClickListener.onClick(this);
                    Object obj3 = this.rightDrawable;
                    if (obj3 instanceof PressableDrawable) {
                        ((ProfileActivity.ShowDrawable) ((PressableDrawable) obj3)).bounce.setPressed(false);
                    }
                }
                this.maybeClick = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent) || this.maybeClick;
    }

    public final void recreateLayoutMaybe() {
        if (!this.wasLayout || getMeasuredHeight() == 0 || this.buildFullLayout) {
            requestLayout();
            return;
        }
        createLayout(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.minusWidth);
        if ((this.gravity & 112) == 16) {
            this.offsetY = (getMeasuredHeight() - this.textHeight) / 2;
        } else {
            this.offsetY = getPaddingTop();
        }
    }

    public final void replaceTextWithDrawable(StatusDrawable statusDrawable, String str) {
        StatusDrawable statusDrawable2 = this.replacedDrawable;
        if (statusDrawable2 == statusDrawable) {
            return;
        }
        if (statusDrawable2 != null) {
            statusDrawable2.setCallback(null);
        }
        this.replacedDrawable = statusDrawable;
        if (statusDrawable != null) {
            statusDrawable.setCallback(this);
        }
        recreateLayoutMaybe();
        this.replacedText = str;
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
        recreateLayoutMaybe();
    }

    public void setEllipsizeByGradient(int i) {
        if (!this.scrollNonFitText) {
            this.ellipsizeByGradient = true;
            this.forceEllipsizeByGradientLeft = null;
            updateFadePaints();
            checkUi_layerType();
        }
        this.ellipsizeByGradientWidthDp = i;
        updateFadePaints();
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

    public final void setFullLayoutAdditionalWidth(int i, int i2) {
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
        recreateLayoutMaybe();
    }

    public void setRightDrawable(int i) {
        setRightDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
    }

    public final boolean setRightDrawable2(Drawable drawable) {
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
        recreateLayoutMaybe();
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
        TextPaint textPaint = this.textPaint;
        if (f == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f);
        recreateLayoutMaybe();
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
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.rightDrawable || drawable == this.rightDrawable2 || drawable == this.leftDrawable || super.verifyDrawable(drawable);
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
        recreateLayoutMaybe();
    }

    public final boolean setRightDrawable(Drawable drawable) {
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
        recreateLayoutMaybe();
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

    public void setEllipsizeByGradient(boolean z) {
        if (this.scrollNonFitText == z) {
            return;
        }
        this.ellipsizeByGradient = z;
        this.forceEllipsizeByGradientLeft = null;
        updateFadePaints();
        checkUi_layerType();
    }
}
