package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class VoipCoverEmoji {
    private final boolean allowAnimations;
    private int diffX;
    private ValueAnimator diffXAnimator;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    private int fromRandomX;
    private int fromRandomY;
    private int height;
    private boolean isShown;
    private final View parent;
    private int posX;
    private int posY;
    private ValueAnimator positionAnimator;
    private int randomX;
    private int randomY;
    private final int size;
    private int toRandomX;
    private int toRandomY;
    private int width;
    private int alpha = 0;
    private float scale = 0.0f;

    public VoipCoverEmoji(TLRPC.User user, final View view, int i) {
        this.parent = view;
        this.size = i;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        this.allowAnimations = zIsEnabled;
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!zIsEnabled || profileEmojiId == 0) {
            return;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, false, i, 13);
        this.emoji = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.set(profileEmojiId, false);
        this.emoji.setColor(-16777216);
        this.emoji.setAlpha(this.alpha);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.positionAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoipCoverEmoji.m3011$r8$lambda$wHt6k9uscPhbPWg_LHAc3R59JM(this.f$0, view, valueAnimator);
            }
        });
        this.fromRandomX = this.toRandomX + AndroidUtilities.dp(12.0f);
        this.fromRandomY = this.toRandomY + AndroidUtilities.dp(12.0f);
        this.toRandomX = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
        this.toRandomY = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
        this.positionAnimator.setInterpolator(new LinearInterpolator());
        this.positionAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator, boolean z) {
                VoipCoverEmoji voipCoverEmoji = VoipCoverEmoji.this;
                voipCoverEmoji.fromRandomX = voipCoverEmoji.toRandomX;
                VoipCoverEmoji voipCoverEmoji2 = VoipCoverEmoji.this;
                voipCoverEmoji2.fromRandomY = voipCoverEmoji2.toRandomY;
                VoipCoverEmoji.this.toRandomX = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
                VoipCoverEmoji.this.toRandomY = Utilities.random.nextInt(AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(12.0f);
                if (VoipCoverEmoji.this.positionAnimator != null) {
                    VoipCoverEmoji.this.positionAnimator.start();
                }
            }
        });
        this.positionAnimator.setDuration(2000L);
    }

    public static void m3011$r8$lambda$wHt6k9uscPhbPWg_LHAc3R59JM(VoipCoverEmoji voipCoverEmoji, View view, ValueAnimator valueAnimator) {
        int i = voipCoverEmoji.fromRandomX;
        voipCoverEmoji.randomX = (int) (i + ((voipCoverEmoji.toRandomX - i) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        int i2 = voipCoverEmoji.fromRandomY;
        voipCoverEmoji.randomY = (int) (i2 + ((voipCoverEmoji.toRandomY - i2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        view.invalidate();
    }

    private void show() {
        if (this.isShown) {
            return;
        }
        if (this.emoji.getDrawable() instanceof AnimatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) this.emoji.getDrawable();
            if (animatedEmojiDrawable.getImageReceiver() == null || !animatedEmojiDrawable.getImageReceiver().hasImageLoaded()) {
                return;
            }
        }
        this.isShown = true;
        final int i = 12;
        this.diffX = this.posX > getCenterX() ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new CubicBezierInterpolator(0.34d, 1.36d, 0.64d, 1.0d));
        final int i2 = 350;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoipCoverEmoji.m3009$r8$lambda$miXq0gBKf7xgbCSyjE5Wab9Atg(this.f$0, i, i2, valueAnimator);
            }
        });
        long j = 350;
        valueAnimatorOfFloat.setDuration(j);
        long j2 = 180;
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 255);
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoipCoverEmoji.$r8$lambda$tO9teCpBJEIPQXwOBCOBKfQ3DjI(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfInt.setStartDelay(j2);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.start();
    }

    public static void m3009$r8$lambda$miXq0gBKf7xgbCSyjE5Wab9Atg(final VoipCoverEmoji voipCoverEmoji, int i, int i2, ValueAnimator valueAnimator) {
        voipCoverEmoji.getClass();
        voipCoverEmoji.scale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        voipCoverEmoji.parent.invalidate();
        if (voipCoverEmoji.scale <= 1.0f || voipCoverEmoji.diffXAnimator != null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(AndroidUtilities.dp(i), 0);
        voipCoverEmoji.diffXAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoipCoverEmoji.m3010$r8$lambda$vxSsdPi5ywC15U_CG3iukpYj5I(this.f$0, valueAnimator2);
            }
        });
        voipCoverEmoji.diffXAnimator.setDuration(((long) i2) - valueAnimator.getCurrentPlayTime());
        voipCoverEmoji.diffXAnimator.start();
    }

    public static void m3010$r8$lambda$vxSsdPi5ywC15U_CG3iukpYj5I(VoipCoverEmoji voipCoverEmoji, ValueAnimator valueAnimator) {
        voipCoverEmoji.getClass();
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (voipCoverEmoji.posX <= voipCoverEmoji.getCenterX()) {
            iIntValue = -iIntValue;
        }
        voipCoverEmoji.diffX = iIntValue;
        voipCoverEmoji.parent.invalidate();
    }

    public static void $r8$lambda$tO9teCpBJEIPQXwOBCOBKfQ3DjI(VoipCoverEmoji voipCoverEmoji, ValueAnimator valueAnimator) {
        voipCoverEmoji.getClass();
        voipCoverEmoji.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        voipCoverEmoji.parent.invalidate();
    }

    private int getCenterX() {
        return this.width / 2;
    }

    public void onLayout(int i, int i2) {
        this.width = i;
        this.height = i2;
        this.parent.invalidate();
    }

    public void setPosition(int i, int i2) {
        if (this.emoji == null) {
            return;
        }
        this.posX = i;
        this.posY = i2;
        this.parent.invalidate();
        show();
    }

    public void onDraw(Canvas canvas) {
        if (this.emoji == null) {
            return;
        }
        canvas.save();
        float f = this.scale;
        canvas.scale(f, f, this.width / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.posX - this.diffX, this.posY);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        int i = this.randomX;
        int i2 = this.randomY;
        int i3 = this.size;
        swapAnimatedEmojiDrawable.setBounds(i, i2, i + i3, i3 + i2);
        this.emoji.setAlpha(this.alpha);
        this.emoji.draw(canvas);
        canvas.restore();
    }

    public void onAttachedToWindow() {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable == null) {
            return;
        }
        swapAnimatedEmojiDrawable.attach();
        ValueAnimator valueAnimator = this.positionAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void onDetachedFromWindow() {
        if (this.emoji == null) {
            return;
        }
        ValueAnimator valueAnimator = this.positionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.positionAnimator = null;
        }
        this.emoji.detach();
    }
}
