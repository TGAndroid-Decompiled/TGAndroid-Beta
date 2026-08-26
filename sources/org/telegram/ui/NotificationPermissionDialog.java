package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;

public final class NotificationPermissionDialog extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public final CounterView counterView;
    public final RLottieImageView rLottieImageView;
    public Utilities.Callback whenGranted;

    public final class CounterView extends View {
        public final AnimatedFloat alpha;
        public ValueAnimator countAnimator;
        public float countScale;
        public final Paint fillPaint;
        public int lastCount;
        public final Paint strokePaint;
        public final AnimatedTextView.AnimatedTextDrawable textDrawable;

        public CounterView(Activity activity) {
            super(activity);
            Paint paint = new Paint(1);
            this.fillPaint = paint;
            Paint paint2 = new Paint(1);
            this.strokePaint = paint2;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.alpha = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
            this.textDrawable = animatedTextDrawable;
            this.countScale = 1.0f;
            paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            paint2.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(AndroidUtilities.dp(4.0f));
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.moveAmplitude = 0.35f;
            animatedTextDrawable.animateDuration = 200L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(AndroidUtilities.dp(0.24f));
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.3f));
            int color = Theme.getColor(null, Theme.key_featuredStickers_buttonText, false);
            textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            animatedTextDrawable.overrideFullWidth = AndroidUtilities.dp(64.0f);
            animatedTextDrawable.gravity = 1;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f = this.alpha.set(this.lastCount > 0 ? 1.0f : 0.0f, false);
            canvas.save();
            float f2 = this.countScale * f;
            canvas.scale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
            float fDpf2 = AndroidUtilities.dpf2(12.66f) + animatedTextDrawable.getCurrentWidth();
            float fDpf3 = AndroidUtilities.dpf2(20.3f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - fDpf2) / 2.0f, (getHeight() - fDpf3) / 2.0f, (getWidth() + fDpf2) / 2.0f, (getHeight() + fDpf3) / 2.0f);
            Paint paint = this.strokePaint;
            int i = (int) (f * 255.0f);
            paint.setAlpha(i);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint);
            Paint paint2 = this.fillPaint;
            paint2.setAlpha(i);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), paint2);
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
            animatedTextDrawable.setBounds(0, 0, getWidth(), getHeight());
            animatedTextDrawable.draw(canvas);
            canvas.restore();
            canvas.restore();
        }

        public final boolean setCount(int i) {
            int i2 = this.lastCount;
            boolean z = false;
            if (i2 != i) {
                z = i2 < i;
                this.lastCount = i;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
                String str = "";
                if (i > 0) {
                    str = "" + this.lastCount;
                }
                animatedTextDrawable.setText(str, true, true);
                if (z) {
                    ValueAnimator valueAnimator = this.countAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.countAnimator = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.countAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 18));
                    this.countAnimator.addListener(new PhotoViewer$41$1(this, 20));
                    this.countAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                    this.countAnimator.setDuration(200L);
                    this.countAnimator.start();
                }
            }
            return z;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.textDrawable || super.verifyDrawable(drawable);
        }
    }

    public NotificationPermissionDialog(Activity activity, boolean z, Utilities.Callback callback) {
        super(activity, null, false, false);
        final int i = 0;
        this.whenGranted = callback;
        final int i2 = 1;
        LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        this.rLottieImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setAnimation(R.raw.silent_unmute, 46, 46, null);
        rLottieImageView.playAnimation();
        int iDp = AndroidUtilities.dp(72.0f);
        int i3 = Theme.key_featuredStickers_addButton;
        rLottieImageView.setBackground(Theme.createCircleDrawable(iDp, Theme.getColor(null, i3, false)));
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(72, 72, 17));
        CounterView counterView = new CounterView(activity);
        this.counterView = counterView;
        frameLayout.addView(counterView, LayoutHelper.createFrame(64, 32.0f, 49, 29.0f, 16.0f, 0.0f, 0.0f));
        counterView.setCount(0);
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final NotificationPermissionDialog f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        RLottieImageView rLottieImageView2 = this.f$0.rLottieImageView;
                        if (!rLottieImageView2.isPlaying()) {
                            rLottieImageView2.setProgress(0.0f);
                            rLottieImageView2.playAnimation();
                        }
                        break;
                    default:
                        NotificationPermissionDialog notificationPermissionDialog = this.f$0;
                        Utilities.Callback callback2 = notificationPermissionDialog.whenGranted;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            notificationPermissionDialog.whenGranted = null;
                        }
                        notificationPermissionDialog.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-1, 110));
        TextView textView = new TextView(activity);
        int i4 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i4, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        textView.setPadding(zzlm.m(30.0f, R.string.NotificationsPermissionAlertTitle, textView), 0, AndroidUtilities.dp(30.0f), 0);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(Theme.getColor(null, i4, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setPadding(zzlm.m(30.0f, R.string.NotificationsPermissionAlertSubtitle, textView2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(21.0f));
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(activity, R.drawable.msg_message_s, LocaleController.getString(R.string.NotificationsPermissionAlert1)), LayoutHelper.createLinear(-1, -2));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(activity, R.drawable.msg_members_list2, LocaleController.getString(R.string.NotificationsPermissionAlert2)), LayoutHelper.createLinear(-1, -2));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(activity, R.drawable.msg_customize_s, LocaleController.getString(R.string.NotificationsPermissionAlert3)), LayoutHelper.createLinear(-1, -2));
        setCustomView(linearLayoutM);
        fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
        TextView textView3 = new TextView(activity);
        textView3.setText(LocaleController.getString(z ? R.string.NotificationsPermissionSettings : R.string.NotificationsPermissionContinue));
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        int color = Theme.getColor(null, i3, false);
        textView3.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, color, Theme.AdaptiveRipple.calcRippleColor(color)));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final NotificationPermissionDialog f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        RLottieImageView rLottieImageView2 = this.f$0.rLottieImageView;
                        if (!rLottieImageView2.isPlaying()) {
                            rLottieImageView2.setProgress(0.0f);
                            rLottieImageView2.playAnimation();
                        }
                        break;
                    default:
                        NotificationPermissionDialog notificationPermissionDialog = this.f$0;
                        Utilities.Callback callback2 = notificationPermissionDialog.whenGranted;
                        if (callback2 != null) {
                            callback2.run(Boolean.TRUE);
                            notificationPermissionDialog.whenGranted = null;
                        }
                        notificationPermissionDialog.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        });
        linearLayoutM.addView(textView3, LayoutHelper.createLinear(14.0f, 14.0f, 14.0f, 10.0f, -1, 48));
        while (i < 4) {
            try {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
            i++;
        }
    }

    public static void askLater() {
        long j = MessagesController.getGlobalMainSettings().getLong("askNotificationsDuration", 86400000L);
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        long j2 = 259200000;
        if (j >= 259200000) {
            j2 = 604800000;
            if (j >= 604800000) {
                j2 = 2592000000L;
            }
        }
        MessagesController.getGlobalMainSettings().edit().putLong("askNotificationsAfter", jCurrentTimeMillis).putLong("askNotificationsDuration", j2).apply();
    }

    public static boolean shouldAsk(Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return false;
        }
        long j = MessagesController.getGlobalMainSettings().getLong("askNotificationsAfter", -1L);
        if (j != -2) {
            return j < 0 || System.currentTimeMillis() >= j;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) >= 0) {
                int mainUnreadCount = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i3);
                    if (messagesStorage != null) {
                        mainUnreadCount = messagesStorage.getMainUnreadCount() + mainUnreadCount;
                    }
                }
                if (this.counterView.setCount(mainUnreadCount)) {
                    RLottieImageView rLottieImageView = this.rLottieImageView;
                    if (rLottieImageView.isPlaying()) {
                        return;
                    }
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                }
            }
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        Utilities.Callback callback = this.whenGranted;
        if (callback != null) {
            callback.run(Boolean.FALSE);
            this.whenGranted = null;
            askLater();
        }
        for (int i = 0; i < 4; i++) {
            try {
                NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.updateInterfaces);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        System.currentTimeMillis();
    }
}
