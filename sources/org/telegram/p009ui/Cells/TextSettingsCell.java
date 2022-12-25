package org.telegram.p009ui.Cells;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.AnimatedTextView;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RLottieImageView;

public class TextSettingsCell extends FrameLayout {
    private boolean canDisable;
    private int changeProgressStartDelay;
    private boolean drawLoading;
    private float drawLoadingProgress;
    private ImageView imageView;
    private boolean incrementLoadingProgress;
    private float loadingProgress;
    private int loadingSize;
    private boolean measureDelay;
    private boolean needDivider;
    private int padding;
    Paint paint;
    private Theme.ResourcesProvider resourcesProvider;
    private TextView textView;
    private BackupImageView valueBackupImageView;
    private ImageView valueImageView;
    private AnimatedTextView valueTextView;

    public TextSettingsCell(Context context) {
        this(context, 21);
    }

    public TextSettingsCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, 21, resourcesProvider);
    }

    public TextSettingsCell(Context context, int i) {
        this(context, i, null);
    }

    public TextSettingsCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        this.padding = i;
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText", resourcesProvider));
        float f = i;
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, !LocaleController.isRTL);
        this.valueTextView = animatedTextView;
        animatedTextView.setAnimationProperties(0.55f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.valueTextView.setTextSize(AndroidUtilities.m35dp(16.0f));
        this.valueTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        this.valueTextView.setTextColor(Theme.getColor("windowBackgroundWhiteValueText", resourcesProvider));
        addView(this.valueTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
        this.imageView.setVisibility(8);
        addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.valueImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.valueImageView.setVisibility(4);
        this.valueImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayIcon"), PorterDuff.Mode.MULTIPLY));
        addView(this.valueImageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.m35dp(50.0f) + (this.needDivider ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.m35dp(34.0f);
        int i3 = measuredWidth / 2;
        if (this.valueImageView.getVisibility() == 0) {
            this.valueImageView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        if (this.imageView.getVisibility() == 0) {
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
        }
        BackupImageView backupImageView = this.valueBackupImageView;
        if (backupImageView != null) {
            backupImageView.measure(View.MeasureSpec.makeMeasureSpec(backupImageView.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.valueBackupImageView.getLayoutParams().width, 1073741824));
        }
        if (this.valueTextView.getVisibility() == 0) {
            this.valueTextView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - this.valueTextView.getMeasuredWidth()) - AndroidUtilities.m35dp(8.0f);
            if (this.valueImageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.valueImageView.getLayoutParams();
                if (LocaleController.isRTL) {
                    marginLayoutParams.leftMargin = AndroidUtilities.m35dp(this.padding + 4) + this.valueTextView.getMeasuredWidth();
                } else {
                    marginLayoutParams.rightMargin = AndroidUtilities.m35dp(this.padding + 4) + this.valueTextView.getMeasuredWidth();
                }
            }
        }
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.measureDelay || getParent() == null) {
            return;
        }
        this.changeProgressStartDelay = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    public TextView getTextView() {
        return this.textView;
    }

    public void setCanDisable(boolean z) {
        this.canDisable = z;
    }

    public AnimatedTextView getValueTextView() {
        return this.valueTextView;
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.valueTextView.setTextColor(i);
    }

    public void setText(CharSequence charSequence, boolean z) {
        this.textView.setText(charSequence);
        this.valueTextView.setVisibility(4);
        this.valueImageView.setVisibility(4);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        setTextAndValue(charSequence, charSequence2, false, z);
    }

    public void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.textView.setText(charSequence);
        this.valueImageView.setVisibility(4);
        if (charSequence2 != null) {
            this.valueTextView.setText(charSequence2, z);
            this.valueTextView.setVisibility(0);
        } else {
            this.valueTextView.setVisibility(4);
        }
        this.needDivider = z2;
        setWillNotDraw(!z2);
        requestLayout();
    }

    public void setIcon(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.textView.getLayoutParams();
        if (i == 0) {
            this.imageView.setVisibility(8);
            if (LocaleController.isRTL) {
                marginLayoutParams.rightMargin = AndroidUtilities.m35dp(this.padding);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.m35dp(this.padding);
                return;
            }
        }
        this.imageView.setImageResource(i);
        this.imageView.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.m35dp(71.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.m35dp(71.0f);
        }
    }

    public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
        setEnabled(z);
        if (arrayList != null) {
            TextView textView = this.textView;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.5f;
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", fArr));
            if (this.valueTextView.getVisibility() == 0) {
                AnimatedTextView animatedTextView = this.valueTextView;
                float[] fArr2 = new float[1];
                fArr2[0] = z ? 1.0f : 0.5f;
                arrayList.add(ObjectAnimator.ofFloat(animatedTextView, "alpha", fArr2));
            }
            if (this.valueImageView.getVisibility() == 0) {
                ImageView imageView = this.valueImageView;
                float[] fArr3 = new float[1];
                fArr3[0] = z ? 1.0f : 0.5f;
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", fArr3));
                return;
            }
            return;
        }
        this.textView.setAlpha(z ? 1.0f : 0.5f);
        if (this.valueTextView.getVisibility() == 0) {
            this.valueTextView.setAlpha(z ? 1.0f : 0.5f);
        }
        if (this.valueImageView.getVisibility() == 0) {
            this.valueImageView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = 0.5f;
        this.textView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
        if (this.valueTextView.getVisibility() == 0) {
            this.valueTextView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
        }
        if (this.valueImageView.getVisibility() == 0) {
            this.valueImageView.setAlpha((z || !this.canDisable) ? 1.0f : 1.0f);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
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
            rectF.set((getMeasuredWidth() - AndroidUtilities.m35dp(this.padding)) - AndroidUtilities.m35dp(this.loadingSize), measuredHeight - AndroidUtilities.m35dp(3.0f), getMeasuredWidth() - AndroidUtilities.m35dp(this.padding), measuredHeight + AndroidUtilities.m35dp(3.0f));
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(3.0f), this.paint);
            invalidate();
        }
        this.valueTextView.setAlpha(1.0f - this.drawLoadingProgress);
        super.dispatchDraw(canvas);
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m35dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.m35dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.textView.getText());
        AnimatedTextView animatedTextView = this.valueTextView;
        if (animatedTextView == null || animatedTextView.getVisibility() != 0) {
            str = BuildConfig.APP_CENTER_HASH;
        } else {
            str = "\n" + ((Object) this.valueTextView.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    public void setDrawLoading(boolean z, int i, boolean z2) {
        this.drawLoading = z;
        this.loadingSize = i;
        if (!z2) {
            this.drawLoadingProgress = z ? 1.0f : 0.0f;
        } else {
            this.measureDelay = true;
        }
        invalidate();
    }

    public BackupImageView getValueBackupImageView() {
        if (this.valueBackupImageView == null) {
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.valueBackupImageView = backupImageView;
            int i = (LocaleController.isRTL ? 3 : 5) | 16;
            int i2 = this.padding;
            addView(backupImageView, LayoutHelper.createFrame(24, 24.0f, i, i2, 0.0f, i2, 0.0f));
        }
        return this.valueBackupImageView;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BackupImageView backupImageView = this.valueBackupImageView;
        if (backupImageView == null || backupImageView.getImageReceiver() == null || !(this.valueBackupImageView.getImageReceiver().getDrawable() instanceof AnimatedEmojiDrawable)) {
            return;
        }
        ((AnimatedEmojiDrawable) this.valueBackupImageView.getImageReceiver().getDrawable()).removeView(this);
    }

    public void updateRTL() {
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        removeView(this.textView);
        TextView textView = this.textView;
        int i = (LocaleController.isRTL ? 5 : 3) | 48;
        int i2 = this.padding;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, i, i2, 0.0f, i2, 0.0f));
        this.valueTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        removeView(this.valueTextView);
        AnimatedTextView animatedTextView = this.valueTextView;
        int i3 = (LocaleController.isRTL ? 3 : 5) | 48;
        int i4 = this.padding;
        addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, i3, i4, 0.0f, i4, 0.0f));
        removeView(this.imageView);
        addView(this.imageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        removeView(this.valueImageView);
        ImageView imageView = this.valueImageView;
        int i5 = LocaleController.isRTL ? 3 : 5;
        int i6 = this.padding;
        addView(imageView, LayoutHelper.createFrame(-2, -2.0f, i5 | 16, i6, 0.0f, i6, 0.0f));
    }
}
