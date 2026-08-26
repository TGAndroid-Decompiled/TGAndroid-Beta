package org.telegram.ui.Cells;

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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;

public final class TextSettingsCell extends FrameLayout {
    public boolean betterLayout;
    public boolean canDisable;
    public int changeProgressStartDelay;
    public boolean drawLoading;
    public float drawLoadingProgress;
    public final RLottieImageView imageView;
    public boolean incrementLoadingProgress;
    public float loadingProgress;
    public int loadingSize;
    public boolean measureDelay;
    public boolean needDivider;
    public final int padding;
    public Paint paint;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView;
    public BackupImageView valueBackupImageView;
    public final ImageView valueImageView;
    public final AnimatedTextView valueTextView;

    public TextSettingsCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.drawLoading || this.drawLoadingProgress != 0.0f) {
            if (this.paint == null) {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(Theme.getColor(Theme.key_dialogSearchBackground, this.resourcesProvider));
            }
            if (this.incrementLoadingProgress) {
                float f3 = this.loadingProgress + 0.016f;
                this.loadingProgress = f3;
                if (f3 > 1.0f) {
                    this.loadingProgress = 1.0f;
                    this.incrementLoadingProgress = false;
                }
            } else {
                float f4 = this.loadingProgress - 0.016f;
                this.loadingProgress = f4;
                if (f4 < 0.0f) {
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
                    float f5 = this.drawLoadingProgress;
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.10666667f;
                        this.drawLoadingProgress = f6;
                        if (f6 > 1.0f) {
                            this.drawLoadingProgress = 1.0f;
                        }
                    } else if (!z) {
                        f = this.drawLoadingProgress;
                        if (f != 0.0f) {
                            f2 = f - 0.10666667f;
                            this.drawLoadingProgress = f2;
                            if (f2 < 0.0f) {
                                this.drawLoadingProgress = 0.0f;
                            }
                        }
                    }
                } else if (!z) {
                    f = this.drawLoadingProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.10666667f;
                        this.drawLoadingProgress = f2;
                        if (f2 < 0.0f) {
                            this.drawLoadingProgress = 0.0f;
                        }
                    }
                }
            }
            this.paint.setAlpha((int) (((this.loadingProgress * 0.4f) + 0.6f) * this.drawLoadingProgress * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f7 = this.padding;
            rectF.set((measuredWidth - AndroidUtilities.dp(f7)) - AndroidUtilities.dp(this.loadingSize), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f7), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.paint);
            invalidate();
        }
        this.valueTextView.setAlpha(1.0f - this.drawLoadingProgress);
        super.dispatchDraw(canvas);
        if (this.needDivider) {
            int iDp = AndroidUtilities.dp(this.imageView.getVisibility() == 0 ? 58.0f : 20.0f);
            canvas.drawLine(LocaleController.isRTL ? 0.0f : iDp, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? iDp : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public TextView getTextView() {
        return this.textView;
    }

    public BackupImageView getValueBackupImageView() {
        if (this.valueBackupImageView == null) {
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.valueBackupImageView = backupImageView;
            int i = (LocaleController.isRTL ? 3 : 5) | 16;
            float f = this.padding - 4;
            addView(backupImageView, LayoutHelper.createFrame(24, 24.0f, i, f, 0.0f, f, 0.0f));
        }
        return this.valueBackupImageView;
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    public AnimatedTextView getValueTextView() {
        return this.valueTextView;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BackupImageView backupImageView = this.valueBackupImageView;
        if (backupImageView == null || backupImageView.getImageReceiver() == null || !(this.valueBackupImageView.getImageReceiver().getDrawable() instanceof AnimatedEmojiDrawable)) {
            return;
        }
        ((AnimatedEmojiDrawable) this.valueBackupImageView.getImageReceiver().getDrawable()).removeView(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.textView.getText());
        AnimatedTextView animatedTextView = this.valueTextView;
        if (animatedTextView == null || animatedTextView.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) animatedTextView.getText());
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.measureDelay || getParent() == null) {
            return;
        }
        this.changeProgressStartDelay = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(50.0f) + (this.needDivider ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int iM$1 = this.betterLayout ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.valueImageView;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(iM$1, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        RLottieImageView rLottieImageView = this.imageView;
        if (rLottieImageView.getVisibility() == 0) {
            rLottieImageView.measure(View.MeasureSpec.makeMeasureSpec(iM$1, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.betterLayout) {
                iM$1 = OKLCH.m$1(8.0f, rLottieImageView.getMeasuredWidth(), iM$1);
            }
        }
        BackupImageView backupImageView = this.valueBackupImageView;
        if (backupImageView != null) {
            backupImageView.measure(View.MeasureSpec.makeMeasureSpec(backupImageView.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.valueBackupImageView.getLayoutParams().width, 1073741824));
            if (this.betterLayout) {
                iM$1 = OKLCH.m$1(8.0f, this.valueBackupImageView.getMeasuredWidth(), iM$1);
            }
        }
        AnimatedTextView animatedTextView = this.valueTextView;
        if (animatedTextView.getVisibility() == 0) {
            animatedTextView.measure(View.MeasureSpec.makeMeasureSpec(iM$1, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = this.betterLayout ? OKLCH.m$1(8.0f, animatedTextView.getMeasuredWidth(), iM$1) : (measuredWidth - animatedTextView.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z = LocaleController.isRTL;
                int i3 = this.padding;
                if (z) {
                    marginLayoutParams.leftMargin = animatedTextView.getMeasuredWidth() + AndroidUtilities.dp(i3 + 4);
                } else {
                    marginLayoutParams.rightMargin = animatedTextView.getMeasuredWidth() + AndroidUtilities.dp(i3 + 4);
                }
            }
        }
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z) {
        this.betterLayout = z;
    }

    public void setCanDisable(boolean z) {
        this.canDisable = z;
    }

    public final void setEnabled(boolean z, ArrayList arrayList) {
        setEnabled(z);
        TextView textView = this.textView;
        ImageView imageView = this.valueImageView;
        AnimatedTextView animatedTextView = this.valueTextView;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z ? 1.0f : 0.5f));
            if (animatedTextView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(animatedTextView, "alpha", z ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z ? 1.0f : 0.5f);
        if (animatedTextView.getVisibility() == 0) {
            animatedTextView.setAlpha(z ? 1.0f : 0.5f);
        }
        if (imageView.getVisibility() == 0) {
            imageView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public void setIcon(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.textView.getLayoutParams();
        RLottieImageView rLottieImageView = this.imageView;
        if (i == 0) {
            rLottieImageView.setVisibility(8);
            boolean z = LocaleController.isRTL;
            int i2 = this.padding;
            if (z) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i2);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i2);
                return;
            }
        }
        rLottieImageView.setImageResource(i);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        rLottieImageView.setBackground(null);
        rLottieImageView.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public final void setText(CharSequence charSequence, boolean z) {
        this.textView.setText(charSequence);
        this.valueTextView.setVisibility(4);
        this.valueImageView.setVisibility(4);
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public final void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.textView.setText(charSequence);
        this.valueImageView.setVisibility(4);
        AnimatedTextView animatedTextView = this.valueTextView;
        if (charSequence2 != null) {
            animatedTextView.setText(charSequence2, z);
            animatedTextView.setVisibility(0);
        } else {
            animatedTextView.setVisibility(4);
        }
        this.needDivider = z2;
        setWillNotDraw(!z2);
        requestLayout();
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextValueColor(int i) {
        this.valueTextView.setTextColor(i);
    }

    public final void updateRTL() {
        TextView textView = this.textView;
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        removeView(textView);
        int i = (LocaleController.isRTL ? 5 : 3) | 48;
        float f = this.padding;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, i, f, 0.0f, f, 0.0f));
        AnimatedTextView animatedTextView = this.valueTextView;
        animatedTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        removeView(animatedTextView);
        addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f, 0.0f, f, 0.0f));
        View view = this.imageView;
        removeView(view);
        addView(view, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.valueImageView;
        removeView(view2);
        addView(view2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
    }

    public TextSettingsCell(Context context) {
        this(context, null, 0);
    }

    public TextSettingsCell(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.betterLayout = BuildVars.DEBUG_PRIVATE_VERSION;
        this.resourcesProvider = resourcesProvider;
        this.padding = 21;
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        float f = 21;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, !LocaleController.isRTL);
        this.valueTextView = animatedTextView;
        animatedTextView.setAnimationProperties(0.55f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextView.setTextSize(AndroidUtilities.dp(16.0f));
        animatedTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        float f2 = 17;
        addView(animatedTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f2, 0.0f, f2, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        int i2 = Theme.key_windowBackgroundWhiteGrayIcon;
        int color = Theme.getColor(i2, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        rLottieImageView.setVisibility(8);
        addView(rLottieImageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.valueImageView = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode));
        addView(imageView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f, 0.0f, f, 0.0f));
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = 1.0f;
        this.textView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
        AnimatedTextView animatedTextView = this.valueTextView;
        if (animatedTextView.getVisibility() == 0) {
            animatedTextView.setAlpha((z || !this.canDisable) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.valueImageView;
        if (imageView.getVisibility() == 0) {
            if (!z && this.canDisable) {
                f = 0.5f;
            }
            imageView.setAlpha(f);
        }
    }
}
