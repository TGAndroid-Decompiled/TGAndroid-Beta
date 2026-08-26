package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;

public final class VoipCoverEmoji {
    public int diffX;
    public ValueAnimator diffXAnimator;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    public int fromRandomX;
    public int fromRandomY;
    public boolean isShown;
    public final VoIpCoverView parent;
    public int posX;
    public int posY;
    public ValueAnimator positionAnimator;
    public int randomX;
    public int randomY;
    public final int size;
    public int toRandomX;
    public int toRandomY;
    public int width;
    public int alpha = 0;
    public float scale = 0.0f;

    public VoipCoverEmoji(TLRPC.User user, VoIpCoverView voIpCoverView, int i) {
        this.parent = voIpCoverView;
        this.size = i;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        long profileEmojiId = UserObject.getProfileEmojiId(user);
        if (!zIsEnabled || profileEmojiId == 0) {
            return;
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(voIpCoverView, false, i, 13);
        this.emoji = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.set(profileEmojiId, false);
        swapAnimatedEmojiDrawable.setColor(-16777216);
        swapAnimatedEmojiDrawable.setAlpha(this.alpha);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.positionAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(12, this, voIpCoverView));
        this.fromRandomX = AndroidUtilities.dp(12.0f) + this.toRandomX;
        this.fromRandomY = AndroidUtilities.dp(12.0f) + this.toRandomY;
        this.toRandomX = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.toRandomY = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
        this.positionAnimator.setInterpolator(new LinearInterpolator());
        this.positionAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator, boolean z) {
                VoipCoverEmoji voipCoverEmoji = VoipCoverEmoji.this;
                voipCoverEmoji.fromRandomX = voipCoverEmoji.toRandomX;
                voipCoverEmoji.fromRandomY = voipCoverEmoji.toRandomY;
                voipCoverEmoji.toRandomX = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
                voipCoverEmoji.toRandomY = AndroidUtilities.dp(12.0f) + Utilities.random.nextInt(AndroidUtilities.dp(16.0f));
                ValueAnimator valueAnimator = voipCoverEmoji.positionAnimator;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
        });
        this.positionAnimator.setDuration(2000L);
    }

    public final void onDraw(Canvas canvas) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable == null) {
            return;
        }
        canvas.save();
        float f = this.scale;
        canvas.scale(f, f, this.width / 2.0f, AndroidUtilities.dp(300.0f));
        canvas.translate(this.posX - this.diffX, this.posY);
        int i = this.randomX;
        int i2 = this.randomY;
        int i3 = this.size;
        swapAnimatedEmojiDrawable.setBounds(i, i2, i + i3, i3 + i2);
        swapAnimatedEmojiDrawable.setAlpha(this.alpha);
        swapAnimatedEmojiDrawable.draw(canvas);
        canvas.restore();
    }

    public final void setPosition(int i, int i2) {
        int i3 = 0;
        int i4 = 1;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (swapAnimatedEmojiDrawable == null) {
            return;
        }
        this.posX = i;
        this.posY = i2;
        this.parent.invalidate();
        if (this.isShown) {
            return;
        }
        if (swapAnimatedEmojiDrawable.getDrawable() instanceof AnimatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) swapAnimatedEmojiDrawable.getDrawable();
            if (animatedEmojiDrawable.getImageReceiver() == null || !animatedEmojiDrawable.getImageReceiver().hasImageLoaded()) {
                return;
            }
        }
        this.isShown = true;
        this.diffX = this.posX > this.width / 2 ? AndroidUtilities.dp(12) : -AndroidUtilities.dp(12);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new CubicBezierInterpolator(0.34d, 1.36d, 0.64d, 1.0d));
        valueAnimatorOfFloat.addUpdateListener(new VoipCoverEmoji$$ExternalSyntheticLambda1(this, i3));
        long j = 350;
        valueAnimatorOfFloat.setDuration(j);
        long j2 = 180;
        valueAnimatorOfFloat.setStartDelay(j2);
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255, 255);
        valueAnimatorOfInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
        valueAnimatorOfInt.addUpdateListener(new VoipCoverEmoji$$ExternalSyntheticLambda1(this, i4));
        valueAnimatorOfInt.setStartDelay(j2);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.start();
    }
}
