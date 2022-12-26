package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.Switch;

public class TextCell extends FrameLayout {
    private int changeProgressStartDelay;
    private Switch checkBox;
    private boolean drawLoading;
    private float drawLoadingProgress;
    public int heightDp;
    public int imageLeft;
    public final RLottieImageView imageView;
    private boolean inDialogs;
    private boolean incrementLoadingProgress;
    private int leftPadding;
    private float loadingProgress;
    private int loadingSize;
    private boolean needDivider;
    private int offsetFromImage;
    Paint paint;
    private boolean prioritizeTitleOverValue;
    private Theme.ResourcesProvider resourcesProvider;
    private final SimpleTextView subtitleView;
    public final SimpleTextView textView;
    private ImageView valueImageView;
    public final AnimatedTextView valueTextView;

    public TextCell(Context context) {
        this(context, 23, false, false, null);
    }

    public TextCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 23, false, false, resourcesProvider);
    }

    public TextCell(Context context, int i, boolean z) {
        this(context, i, z, false, null);
    }

    public TextCell(Context context, int i, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.offsetFromImage = 71;
        this.heightDp = 48;
        this.imageLeft = 21;
        this.resourcesProvider = resourcesProvider;
        this.leftPadding = i;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(z ? "dialogTextBlack" : "windowBackgroundWhiteBlackText", resourcesProvider));
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setImportantForAccessibility(2);
        addView(simpleTextView, LayoutHelper.createFrame(-2, -1.0f));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.subtitleView = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(z ? "dialogTextGray" : "windowBackgroundWhiteGrayText", resourcesProvider));
        simpleTextView2.setTextSize(13);
        simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView2.setImportantForAccessibility(2);
        addView(simpleTextView2, LayoutHelper.createFrame(-2, -1.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.valueTextView = animatedTextView;
        animatedTextView.setTextColor(Theme.getColor(z ? "dialogTextBlue2" : "windowBackgroundWhiteValueText", resourcesProvider));
        animatedTextView.setPadding(0, AndroidUtilities.m35dp(18.0f), 0, AndroidUtilities.m35dp(18.0f));
        animatedTextView.setTextSize(AndroidUtilities.m35dp(16.0f));
        animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
        animatedTextView.setImportantForAccessibility(2);
        addView(animatedTextView);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(z ? "dialogIcon" : "windowBackgroundWhiteGrayIcon", resourcesProvider), PorterDuff.Mode.MULTIPLY));
        addView(rLottieImageView);
        ImageView imageView = new ImageView(context);
        this.valueImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(this.valueImageView);
        if (z2) {
            Switch r3 = new Switch(context, resourcesProvider);
            this.checkBox = r3;
            r3.setColors("switchTrack", "switchTrackChecked", "windowBackgroundWhite", "windowBackgroundWhite");
            addView(this.checkBox, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public boolean isChecked() {
        Switch r0 = this.checkBox;
        return r0 != null && r0.isChecked();
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    public void setIsInDialogs() {
        this.inDialogs = true;
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public RLottieImageView getImageView() {
        return this.imageView;
    }

    public AnimatedTextView getValueTextView() {
        return this.valueTextView;
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    public void setPrioritizeTitleOverValue(boolean z) {
        this.prioritizeTitleOverValue = z;
        requestLayout();
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int m35dp = AndroidUtilities.m35dp(this.heightDp);
        if (this.prioritizeTitleOverValue) {
            this.textView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(this.leftPadding + 71), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
            this.subtitleView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(this.leftPadding + 71), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.m35dp(this.leftPadding + 103)) - this.textView.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        } else {
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(this.leftPadding), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
            this.textView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.m35dp(this.leftPadding + 71)) - this.valueTextView.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
            this.subtitleView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.m35dp(this.leftPadding + 71)) - this.valueTextView.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        }
        if (this.imageView.getVisibility() == 0) {
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        }
        if (this.valueImageView.getVisibility() == 0) {
            this.valueImageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        }
        Switch r8 = this.checkBox;
        if (r8 != null) {
            r8.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, AndroidUtilities.m35dp(50.0f) + (this.needDivider ? 1 : 0));
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Switch r0 = this.checkBox;
        if (r0 != null) {
            r0.setEnabled(z);
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int m35dp;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        int textHeight = (i5 - this.valueTextView.getTextHeight()) / 2;
        int m35dp2 = LocaleController.isRTL ? AndroidUtilities.m35dp(this.leftPadding) : 0;
        if (this.prioritizeTitleOverValue && !LocaleController.isRTL) {
            m35dp2 = (i6 - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.m35dp(this.leftPadding);
        }
        AnimatedTextView animatedTextView = this.valueTextView;
        animatedTextView.layout(m35dp2, textHeight, animatedTextView.getMeasuredWidth() + m35dp2, this.valueTextView.getMeasuredHeight() + textHeight);
        if (LocaleController.isRTL) {
            m35dp = (getMeasuredWidth() - this.textView.getMeasuredWidth()) - AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        } else {
            m35dp = AndroidUtilities.m35dp(this.imageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        }
        if (this.subtitleView.getVisibility() == 0) {
            int textHeight2 = (((i5 - this.textView.getTextHeight()) - this.subtitleView.getTextHeight()) - AndroidUtilities.m35dp(2.0f)) / 2;
            SimpleTextView simpleTextView = this.textView;
            simpleTextView.layout(m35dp, textHeight2, simpleTextView.getMeasuredWidth() + m35dp, this.textView.getMeasuredHeight() + textHeight2);
            int textHeight3 = textHeight2 + this.textView.getTextHeight() + AndroidUtilities.m35dp(2.0f);
            SimpleTextView simpleTextView2 = this.subtitleView;
            simpleTextView2.layout(m35dp, textHeight3, simpleTextView2.getMeasuredWidth() + m35dp, this.subtitleView.getMeasuredHeight() + textHeight3);
        } else {
            int textHeight4 = (i5 - this.textView.getTextHeight()) / 2;
            SimpleTextView simpleTextView3 = this.textView;
            simpleTextView3.layout(m35dp, textHeight4, simpleTextView3.getMeasuredWidth() + m35dp, this.textView.getMeasuredHeight() + textHeight4);
        }
        if (this.imageView.getVisibility() == 0) {
            int m35dp3 = AndroidUtilities.m35dp(5.0f);
            int m35dp4 = !LocaleController.isRTL ? AndroidUtilities.m35dp(this.imageLeft) : (i6 - this.imageView.getMeasuredWidth()) - AndroidUtilities.m35dp(this.imageLeft);
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.layout(m35dp4, m35dp3, rLottieImageView.getMeasuredWidth() + m35dp4, this.imageView.getMeasuredHeight() + m35dp3);
        }
        if (this.valueImageView.getVisibility() == 0) {
            int measuredHeight = (i5 - this.valueImageView.getMeasuredHeight()) / 2;
            int m35dp5 = LocaleController.isRTL ? AndroidUtilities.m35dp(23.0f) : (i6 - this.valueImageView.getMeasuredWidth()) - AndroidUtilities.m35dp(23.0f);
            ImageView imageView = this.valueImageView;
            imageView.layout(m35dp5, measuredHeight, imageView.getMeasuredWidth() + m35dp5, this.valueImageView.getMeasuredHeight() + measuredHeight);
        }
        Switch r4 = this.checkBox;
        if (r4 == null || r4.getVisibility() != 0) {
            return;
        }
        int measuredHeight2 = (i5 - this.checkBox.getMeasuredHeight()) / 2;
        int m35dp6 = LocaleController.isRTL ? AndroidUtilities.m35dp(22.0f) : (i6 - this.checkBox.getMeasuredWidth()) - AndroidUtilities.m35dp(22.0f);
        Switch r5 = this.checkBox;
        r5.layout(m35dp6, measuredHeight2, r5.getMeasuredWidth() + m35dp6, this.checkBox.getMeasuredHeight() + measuredHeight2);
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setColors(String str, String str2) {
        this.textView.setTextColor(Theme.getColor(str2, this.resourcesProvider));
        this.textView.setTag(str2);
        if (str != null) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(str, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            this.imageView.setTag(str);
        }
    }

    public void setText(String str, boolean z) {
        this.imageLeft = 21;
        this.textView.setText(str);
        this.valueTextView.setText(null, false);
        this.imageView.setVisibility(8);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setTextAndIcon(String str, int i, boolean z) {
        this.imageLeft = 21;
        this.offsetFromImage = 71;
        this.textView.setText(str);
        this.valueTextView.setText(null, false);
        this.imageView.setImageResource(i);
        this.imageView.setVisibility(0);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.m35dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setTextAndIcon(String str, Drawable drawable, boolean z) {
        this.offsetFromImage = 68;
        this.imageLeft = 18;
        this.textView.setText(str);
        this.valueTextView.setText(null, false);
        this.imageView.setColorFilter((ColorFilter) null);
        if (drawable instanceof RLottieDrawable) {
            this.imageView.setAnimation((RLottieDrawable) drawable);
        } else {
            this.imageView.setImageDrawable(drawable);
        }
        this.imageView.setVisibility(0);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.m35dp(6.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setOffsetFromImage(int i) {
        this.offsetFromImage = i;
    }

    public void setImageLeft(int i) {
        this.imageLeft = i;
    }

    public void setTextAndValue(String str, String str2, boolean z, boolean z2) {
        this.imageLeft = 21;
        this.offsetFromImage = 71;
        this.textView.setText(str);
        this.valueTextView.setText(str2, z);
        this.valueTextView.setVisibility(0);
        this.imageView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r2 = this.checkBox;
        if (r2 != null) {
            r2.setVisibility(8);
        }
    }

    public void setTextAndValueAndIcon(String str, String str2, int i, boolean z) {
        setTextAndValueAndIcon(str, str2, false, i, z);
    }

    public void setTextAndValueAndIcon(String str, String str2, boolean z, int i, boolean z2) {
        this.imageLeft = 21;
        this.offsetFromImage = 71;
        this.textView.setText(str);
        this.valueTextView.setText(str2, z);
        this.valueTextView.setVisibility(0);
        this.valueImageView.setVisibility(8);
        this.imageView.setVisibility(0);
        this.imageView.setTranslationX(0.0f);
        this.imageView.setTranslationY(0.0f);
        this.imageView.setPadding(0, AndroidUtilities.m35dp(7.0f), 0, 0);
        this.imageView.setImageResource(i);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r2 = this.checkBox;
        if (r2 != null) {
            r2.setVisibility(8);
        }
    }

    public void setColorfulIcon(int i, int i2) {
        this.offsetFromImage = 65;
        this.imageView.setVisibility(0);
        this.imageView.setPadding(AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f));
        this.imageView.setTranslationX(AndroidUtilities.m35dp(-3.0f));
        this.imageView.setTranslationY(AndroidUtilities.m35dp(6.0f));
        this.imageView.setImageResource(i2);
        this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(8.0f), i));
    }

    public void setTextAndCheck(String str, boolean z, boolean z2) {
        this.imageLeft = 21;
        this.offsetFromImage = 71;
        this.textView.setText(str);
        this.imageView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        Switch r2 = this.checkBox;
        if (r2 != null) {
            r2.setVisibility(0);
            this.checkBox.setChecked(z, false);
        }
        this.needDivider = z2;
        setWillNotDraw(!z2);
    }

    public void setTextAndCheckAndIcon(String str, boolean z, int i, boolean z2) {
        this.imageLeft = 21;
        this.offsetFromImage = 71;
        this.textView.setText(str);
        this.valueTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        Switch r2 = this.checkBox;
        if (r2 != null) {
            r2.setVisibility(0);
            this.checkBox.setChecked(z, false);
        }
        this.imageView.setVisibility(0);
        this.imageView.setPadding(0, AndroidUtilities.m35dp(7.0f), 0, 0);
        this.imageView.setImageResource(i);
        this.needDivider = z2;
        setWillNotDraw(!z2);
    }

    public void setTextAndValueDrawable(String str, Drawable drawable, boolean z) {
        this.imageLeft = 21;
        this.offsetFromImage = 71;
        this.textView.setText(str);
        this.valueTextView.setText(null, false);
        this.valueImageView.setVisibility(0);
        this.valueImageView.setImageDrawable(drawable);
        this.valueTextView.setVisibility(8);
        this.imageView.setVisibility(8);
        this.imageView.setPadding(0, AndroidUtilities.m35dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        Switch r3 = this.checkBox;
        if (r3 != null) {
            r3.setVisibility(8);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float m35dp;
        int i;
        if (this.needDivider) {
            float f2 = 20.0f;
            if (LocaleController.isRTL) {
                m35dp = 0.0f;
            } else {
                if (this.imageView.getVisibility() == 0) {
                    f = this.inDialogs ? 72 : 68;
                } else {
                    f = 20.0f;
                }
                m35dp = AndroidUtilities.m35dp(f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (this.imageView.getVisibility() == 0) {
                    f2 = this.inDialogs ? 72 : 68;
                }
                i = AndroidUtilities.m35dp(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(m35dp, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.textView.getText();
        if (!TextUtils.isEmpty(text)) {
            CharSequence text2 = this.valueTextView.getText();
            if (!TextUtils.isEmpty(text2)) {
                accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
            } else {
                accessibilityNodeInfo.setText(text);
            }
        }
        accessibilityNodeInfo.addAction(16);
    }

    public void setNeedDivider(boolean z) {
        if (this.needDivider != z) {
            this.needDivider = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setDrawLoading(boolean z, int i, boolean z2) {
        this.drawLoading = z;
        this.loadingSize = i;
        if (!z2) {
            this.drawLoadingProgress = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.drawLoading || this.drawLoadingProgress != 0.0f) {
            if (this.paint == null) {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(Theme.getColor("dialogSearchBackground", this.resourcesProvider));
            }
            if (this.incrementLoadingProgress) {
                float f = this.loadingProgress + 0.016f;
                this.loadingProgress = f;
                if (f > 1.0f) {
                    this.loadingProgress = 1.0f;
                    this.incrementLoadingProgress = false;
                }
            } else {
                float f2 = this.loadingProgress - 0.016f;
                this.loadingProgress = f2;
                if (f2 < 0.0f) {
                    this.loadingProgress = 0.0f;
                    this.incrementLoadingProgress = true;
                }
            }
            int i = this.changeProgressStartDelay;
            if (i > 0) {
                this.changeProgressStartDelay = i - 15;
            } else {
                boolean z = this.drawLoading;
                if (z) {
                    float f3 = this.drawLoadingProgress;
                    if (f3 != 1.0f) {
                        float f4 = f3 + 0.10666667f;
                        this.drawLoadingProgress = f4;
                        if (f4 > 1.0f) {
                            this.drawLoadingProgress = 1.0f;
                        }
                    }
                }
                if (!z) {
                    float f5 = this.drawLoadingProgress;
                    if (f5 != 0.0f) {
                        float f6 = f5 - 0.10666667f;
                        this.drawLoadingProgress = f6;
                        if (f6 < 0.0f) {
                            this.drawLoadingProgress = 0.0f;
                        }
                    }
                }
            }
            this.paint.setAlpha((int) (((this.loadingProgress * 0.4f) + 0.6f) * this.drawLoadingProgress * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.m35dp(11.0f)) - AndroidUtilities.m35dp(this.loadingSize), measuredHeight - AndroidUtilities.m35dp(3.0f), getMeasuredWidth() - AndroidUtilities.m35dp(11.0f), measuredHeight + AndroidUtilities.m35dp(3.0f));
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(3.0f), this.paint);
            invalidate();
        }
        this.valueTextView.setAlpha(1.0f - this.drawLoadingProgress);
        super.dispatchDraw(canvas);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.subtitleView.setVisibility(0);
            this.subtitleView.setText(charSequence);
            return;
        }
        this.subtitleView.setVisibility(8);
    }
}
