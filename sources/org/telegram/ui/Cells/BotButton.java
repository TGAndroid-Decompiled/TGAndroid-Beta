package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Text;

public class BotButton {
    public int angle;
    public TLRPC.KeyboardButton button;
    public BotInlineKeyboard.ButtonCustom buttonCustom;
    public int height;
    public Drawable iconDrawable;
    public final Runnable invalidateRunnable;
    public boolean isInviteButton;
    public boolean isLocked;
    public boolean isSeparator;
    public long lastUpdateTime;
    public LoadingDrawable loadingDrawable;
    public int positionFlags;
    public ValueAnimator pressAnimator;
    public float pressT;
    public boolean pressed;
    public float progressAlpha;
    public Drawable selectorDrawable;
    public Text title;
    public float width;
    public float x;
    public int y;

    public BotButton(Runnable runnable) {
        this.invalidateRunnable = runnable;
    }

    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (this.pressed != z) {
            this.pressed = z;
            this.invalidateRunnable.run();
            if (z && (valueAnimator = this.pressAnimator) != null) {
                valueAnimator.removeAllListeners();
                this.pressAnimator.cancel();
            }
            if (z) {
                return;
            }
            float f = this.pressT;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.pressAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BotButton.this.lambda$setPressed$0(valueAnimator2);
                    }
                });
                this.pressAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        BotButton.this.pressAnimator = null;
                    }
                });
                this.pressAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.pressAnimator.setDuration(350L);
                this.pressAnimator.start();
            }
        }
    }

    public void lambda$setPressed$0(ValueAnimator valueAnimator) {
        this.pressT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.invalidateRunnable.run();
    }

    public boolean hasPositionFlag(int i) {
        return (this.positionFlags & i) == i;
    }

    public float getPressScale() {
        if (this.pressed) {
            float f = this.pressT;
            if (f != 1.0f) {
                float min = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                this.pressT = min;
                this.pressT = Utilities.clamp(min, 1.0f, 0.0f);
                this.invalidateRunnable.run();
            }
        }
        return ((1.0f - this.pressT) * 0.04f) + 0.96f;
    }
}
