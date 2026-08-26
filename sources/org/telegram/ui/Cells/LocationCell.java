package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;

public final class LocationCell extends FrameLayout {
    public static FlickerLoadingView globalGradientView;
    public final AnimatedTextView addressTextView;
    public boolean allowTextAnimation;
    public final ShapeDrawable circleDrawable;
    public float enterAlpha;
    public ValueAnimator enterAnimator;
    public final BackupImageView imageView;
    public CharSequence lastCompleteTitle;
    public String lastEmoji;
    public String lastTitle;
    public final AnimatedTextView nameTextView;
    public boolean needDivider;
    public final Theme.ResourcesProvider resourcesProvider;

    public LocationCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.enterAlpha = 0.0f;
        this.resourcesProvider = resourcesProvider;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        ShapeDrawable shapeDrawableCreateCircleDrawable = Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), -1);
        this.circleDrawable = shapeDrawableCreateCircleDrawable;
        backupImageView.setBackground(shapeDrawableCreateCircleDrawable);
        backupImageView.setSize(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(42, 42.0f, (z ? 5 : 3) | 48, z ? 0.0f : 15.0f, 11.0f, z ? 15.0f : 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true);
        this.nameTextView = animatedTextView;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextView.setAnimationProperties(0.4f, 0L, 350L, cubicBezierInterpolator);
        animatedTextView.setScaleProperty(0.6f);
        animatedTextView.setTextSize(AndroidUtilities.dp(16.0f));
        animatedTextView.setEllipsizeByGradient(true);
        animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        animatedTextView.getDrawable().setOverrideFullWidth(AndroidUtilities.displaySize.x);
        NotificationCenter.listenEmojiLoading(animatedTextView);
        boolean z2 = LocaleController.isRTL;
        addView(animatedTextView, LayoutHelper.createFrame(-1, 22.0f, (z2 ? 5 : 3) | 48, z2 ? 16 : 73, 10.0f, z2 ? 73 : 16, 0.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
        this.addressTextView = animatedTextView2;
        animatedTextView2.setScaleProperty(0.6f);
        animatedTextView2.setAnimationProperties(0.4f, 0L, 350L, cubicBezierInterpolator);
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView2.setEllipsizeByGradient(true);
        animatedTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        animatedTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z3 = LocaleController.isRTL;
        addView(animatedTextView2, LayoutHelper.createFrame(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 16 : 73, 35.0f, z3 ? 73 : 16, 0.0f));
        backupImageView.setAlpha(this.enterAlpha);
        animatedTextView.setAlpha(this.enterAlpha);
        animatedTextView2.setAlpha(this.enterAlpha);
    }

    public static int getColorForIndex(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return -1351584;
        }
        if (i2 == 1) {
            return -868277;
        }
        if (i2 == 2) {
            return -12214795;
        }
        if (i2 == 3) {
            return -13187226;
        }
        if (i2 != 4) {
            return i2 != 5 ? -1285237 : -12338729;
        }
        return -7900675;
    }

    public BackupImageView getImageView() {
        return this.imageView;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        FlickerLoadingView flickerLoadingView = globalGradientView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (flickerLoadingView == null) {
            FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(getContext(), resourcesProvider);
            globalGradientView = flickerLoadingView2;
            flickerLoadingView2.setIsSingleCell(true);
        }
        globalGradientView.setParentSize(getMeasuredWidth(), getMeasuredHeight(), AndroidUtilities.dp(56.0f) * (-(getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0)));
        globalGradientView.setViewType(4);
        globalGradientView.updateColors();
        globalGradientView.updateGradient();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.enterAlpha) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), OKLCH.m$2(56.0f, getMeasuredHeight(), 2));
        globalGradientView.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.needDivider) {
            Paint paint = resourcesProvider == null ? null : resourcesProvider.getPaint("paintDivider");
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(72.0f) : getWidth(), getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z) {
        this.allowTextAnimation = z;
    }

    public final void setLocation(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i, boolean z, boolean z2) {
        StringBuilder sb;
        String str;
        String string;
        String str2;
        CharSequence charSequenceReplaceEmoji;
        this.needDivider = z;
        AnimatedTextView animatedTextView = this.nameTextView;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.lastEmoji, tL_messageMediaVenue.emoji) && TextUtils.equals(this.lastTitle, tL_messageMediaVenue.title)) {
                charSequenceReplaceEmoji = this.lastCompleteTitle;
            } else {
                charSequenceReplaceEmoji = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequenceReplaceEmoji = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequenceReplaceEmoji), animatedTextView.getPaint().getFontMetricsInt(), false);
                }
                this.lastEmoji = tL_messageMediaVenue.emoji;
                this.lastTitle = tL_messageMediaVenue.title;
                this.lastCompleteTitle = charSequenceReplaceEmoji;
            }
            animatedTextView.setText(charSequenceReplaceEmoji, this.allowTextAnimation && !LocaleController.isRTL && z2);
        }
        AnimatedTextView animatedTextView2 = this.addressTextView;
        if (tL_messageMediaVenue != null) {
            animatedTextView2.setText(tL_messageMediaVenue.address, this.allowTextAnimation && !LocaleController.isRTL && z2);
        }
        int colorForIndex = getColorForIndex(i);
        BackupImageView backupImageView = this.imageView;
        if (tL_messageMediaVenue != null && (str2 = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str2) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable drawableMutate = getResources().getDrawable(R.drawable.pin).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_location_sendLocationIcon, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), 0), drawableMutate);
                combinedDrawable.setCustomSize(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
                combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                backupImageView.setImageDrawable(combinedDrawable);
            } else {
                backupImageView.setImage(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.circleDrawable.getPaint().setColor(colorForIndex);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.enterAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z3 = tL_messageMediaVenue == null;
        final float f = this.enterAlpha;
        final float f2 = z3 ? 0.0f : 1.0f;
        final long jAbs = (long) (Math.abs(f - f2) * 150.0f);
        this.enterAnimator = ValueAnimator.ofFloat(f, f2);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.enterAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LocationCell locationCell = this.f$0;
                locationCell.getClass();
                float fElapsedRealtime = SystemClock.elapsedRealtime() - jElapsedRealtime;
                long j = jAbs;
                float fLerp = AndroidUtilities.lerp(f, f2, j > 0 ? Math.min(Math.max(fElapsedRealtime / j, 0.0f), 1.0f) : 1.0f);
                locationCell.enterAlpha = fLerp;
                locationCell.imageView.setAlpha(fLerp);
                locationCell.nameTextView.setAlpha(locationCell.enterAlpha);
                locationCell.addressTextView.setAlpha(locationCell.enterAlpha);
                locationCell.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.enterAnimator;
        if (z3) {
            jAbs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(jAbs);
        this.enterAnimator.start();
        backupImageView.setAlpha(f);
        animatedTextView.setAlpha(f);
        animatedTextView2.setAlpha(f);
        if (tL_messageMediaVenue == null) {
            try {
                try {
                    if (TextUtils.isEmpty(null)) {
                        setContentDescription(null);
                    } else {
                        sb = new StringBuilder();
                        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
                            sb.append(tL_messageMediaVenue.title);
                        }
                        if (TextUtils.isEmpty(null) || tL_messageMediaVenue == null) {
                            str = null;
                        } else {
                            str = tL_messageMediaVenue.address;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append((CharSequence) str);
                        }
                        if (sb.length() > 0) {
                            string = sb.toString();
                        } else {
                            string = null;
                        }
                        setContentDescription(string);
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                setContentDescription(null);
            }
        } else {
            sb = new StringBuilder();
            if (tL_messageMediaVenue != null) {
                sb.append(tL_messageMediaVenue.title);
            }
            if (TextUtils.isEmpty(null)) {
                str = null;
            } else {
                str = tL_messageMediaVenue.address;
            }
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append((CharSequence) str);
            }
            if (sb.length() > 0) {
                string = sb.toString();
            } else {
                string = null;
            }
            setContentDescription(string);
        }
        invalidate();
    }
}
