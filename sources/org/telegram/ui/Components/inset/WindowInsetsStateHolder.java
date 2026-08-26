package org.telegram.ui.Components.inset;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.stripe.android.Stripe;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.VariableFloat;
import me.vkryl.android.animator.VariableRect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;

public final class WindowInsetsStateHolder implements WindowInsetsProvider, WindowInsetsInAppController, WindowAnimatedInsetsProvider.Listener {
    public int activeAnimations;
    public int animatedImeInset;
    public WindowAnimatedInsetsProvider animatedInsetsProvider;
    public View animatedInsetsProviderTarget;
    public int inAppKeyboardHeight;
    public int inAppKeyboardViewHeight;
    public final FactorAnimator insetsAnimator;
    public WindowInsetsCompat lastInsets;
    public boolean locked;
    public final Runnable onUpdateListener;
    public final VariableFloat keyboardVisibility = new VariableFloat(0.0f);
    public final VariableRect insetsMaxRect = new VariableRect();
    public final VariableRect insetsImeRect = new VariableRect();
    public final AnimationNotificationsLocker locker = new AnimationNotificationsLocker();
    public final KeyboardState keyboardState = new KeyboardState(new DialogCell$$ExternalSyntheticLambda6(this, 18));
    public int inAppKeyboardState = 1;
    public final WindowInsetsStateHolder$$ExternalSyntheticLambda1 closeInAppKeyboard = new WindowInsetsStateHolder$$ExternalSyntheticLambda1(this, 0);

    public WindowInsetsStateHolder(Runnable runnable) {
        this.onUpdateListener = runnable;
        this.insetsAnimator = new FactorAnimator(0, new Stripe(this, runnable, false, 20), AdjustPanLayoutHelper.keyboardInterpolator, 250L);
    }

    public final float getAnimatedImeBottomInset() {
        WindowAnimatedInsetsProvider windowAnimatedInsetsProvider = this.animatedInsetsProvider;
        VariableRect variableRect = this.insetsImeRect;
        return (windowAnimatedInsetsProvider == null || this.activeAnimations <= 0) ? variableRect.bottom.now : Math.max(this.animatedImeInset, variableRect.bottom.now);
    }

    @Override
    public final View getAnimatedInsetsTargetView() {
        return this.animatedInsetsProviderTarget;
    }

    public final float getAnimatedMaxBottomInset() {
        WindowAnimatedInsetsProvider windowAnimatedInsetsProvider = this.animatedInsetsProvider;
        VariableRect variableRect = this.insetsMaxRect;
        return (windowAnimatedInsetsProvider == null || this.activeAnimations <= 0) ? variableRect.bottom.now : Math.max(this.animatedImeInset, variableRect.bottom.now);
    }

    public final int getCurrentMaxBottomInset() {
        WindowAnimatedInsetsProvider windowAnimatedInsetsProvider = this.animatedInsetsProvider;
        Insets insets = Insets.NONE;
        if (windowAnimatedInsetsProvider == null || this.activeAnimations <= 0) {
            WindowInsetsCompat windowInsetsCompat = this.lastInsets;
            if (windowInsetsCompat != null) {
                insets = windowInsetsCompat.mImpl.getInsets(527);
            }
            return Math.max(insets.bottom, this.inAppKeyboardHeight);
        }
        int i = this.animatedImeInset;
        WindowInsetsCompat windowInsetsCompat2 = this.lastInsets;
        if (windowInsetsCompat2 != null) {
            insets = windowInsetsCompat2.mImpl.getInsets(527);
        }
        return Math.max(i, Math.max(insets.bottom, this.inAppKeyboardHeight));
    }

    @Override
    public final void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.animatedImeInset = windowInsetsCompat.mImpl.getInsets(8).bottom;
        this.onUpdateListener.run();
    }

    @Override
    public final void onAnimatedInsetsFinished() {
        View view = this.animatedInsetsProviderTarget;
        if (view != null) {
            view.postOnAnimation(new WindowInsetsStateHolder$$ExternalSyntheticLambda1(this, 1));
        }
    }

    @Override
    public final void onAnimatedInsetsStarted() {
        this.activeAnimations++;
    }

    public final void resetInAppKeyboardHeight(boolean z) {
        if (this.inAppKeyboardHeight == 0) {
            return;
        }
        WindowInsetsStateHolder$$ExternalSyntheticLambda1 windowInsetsStateHolder$$ExternalSyntheticLambda1 = this.closeInAppKeyboard;
        AndroidUtilities.cancelRunOnUIThread(windowInsetsStateHolder$$ExternalSyntheticLambda1);
        this.inAppKeyboardState = z ? 3 : 2;
        setInsets(this.lastInsets);
        if (z) {
            AndroidUtilities.runOnUIThread(windowInsetsStateHolder$$ExternalSyntheticLambda1, 1000L);
        }
    }

    public final void setInsets(WindowInsetsCompat windowInsetsCompat) {
        setInsets(windowInsetsCompat, this.lastInsets != null);
    }

    public final void setInsets(WindowInsetsCompat windowInsetsCompat, boolean z) {
        KeyboardState.State state;
        FactorAnimator factorAnimator;
        int i;
        FactorAnimator factorAnimator2;
        this.lastInsets = windowInsetsCompat;
        Insets insets = Insets.NONE;
        Insets insetsIgnoringVisibility = windowInsetsCompat != null ? windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(647) : insets;
        if (windowInsetsCompat != null) {
            insets = windowInsetsCompat.mImpl.getInsets(8);
        }
        KeyboardState keyboardState = this.keyboardState;
        KeyboardState.State state2 = keyboardState.state;
        boolean z2 = insets.bottom > 0;
        if (z) {
            state = z2 ? KeyboardState.State.STATE_ANIMATING_TO_FULLY_VISIBLE : KeyboardState.State.STATE_ANIMATING_TO_FULLY_HIDDEN;
        } else {
            state = z2 ? KeyboardState.State.STATE_FULLY_VISIBLE : KeyboardState.State.STATE_FULLY_HIDDEN;
        }
        if (state2 != state) {
            keyboardState.setState(state, false);
        }
        int i2 = this.inAppKeyboardState;
        if (i2 == 2) {
            this.inAppKeyboardHeight = 0;
        }
        if (i2 == 3 && insets.bottom > 0) {
            this.inAppKeyboardHeight = 0;
        }
        Insets insetsMax = Insets.max(insets, Insets.of(0, 0, 0, this.inAppKeyboardHeight));
        Insets insetsMax2 = Insets.max(insetsIgnoringVisibility, insetsMax);
        VariableFloat variableFloat = this.keyboardVisibility;
        Runnable runnable = this.onUpdateListener;
        VariableRect variableRect = this.insetsImeRect;
        VariableRect variableRect2 = this.insetsMaxRect;
        FactorAnimator factorAnimator3 = this.insetsAnimator;
        int i3 = insetsMax.right;
        int i4 = insetsMax.top;
        int i5 = insetsMax.left;
        int i6 = insetsMax.bottom;
        int i7 = insetsMax2.bottom;
        int i8 = insetsMax2.right;
        int i9 = insetsMax2.top;
        int i10 = insetsMax2.left;
        if (z) {
            if (variableFloat.differs(i6 > 0 ? 1.0f : 0.0f)) {
                i = i8;
                factorAnimator2 = factorAnimator3;
            } else {
                factorAnimator2 = factorAnimator3;
                i = i8;
                if (!variableRect2.differs(i10, i9, i8, i7) && !variableRect.differs(i5, i4, i3, i6)) {
                    if (state2 != state) {
                        runnable.run();
                    }
                    factorAnimator = factorAnimator2;
                }
            }
            factorAnimator2.cancel();
            variableFloat.finishAnimation(false);
            variableRect2.left.finishAnimation(false);
            VariableFloat variableFloat2 = variableRect2.top;
            variableFloat2.finishAnimation(false);
            VariableFloat variableFloat3 = variableRect2.right;
            variableFloat3.finishAnimation(false);
            VariableFloat variableFloat4 = variableRect2.bottom;
            variableFloat4.finishAnimation(false);
            variableRect.left.finishAnimation(false);
            VariableFloat variableFloat5 = variableRect.top;
            variableFloat5.finishAnimation(false);
            VariableFloat variableFloat6 = variableRect.right;
            variableFloat6.finishAnimation(false);
            VariableFloat variableFloat7 = variableRect.bottom;
            variableFloat7.finishAnimation(false);
            variableFloat.to = i6 > 0 ? 1.0f : 0.0f;
            variableRect2.left.to = i10;
            variableFloat2.to = i9;
            variableFloat3.to = i;
            variableFloat4.to = i7;
            variableRect.left.to = i5;
            variableFloat5.to = i4;
            variableFloat6.to = i3;
            variableFloat7.to = i6;
            factorAnimator = factorAnimator2;
            factorAnimator.forceFactor(0.0f);
            factorAnimator.animateTo(1.0f);
        } else {
            factorAnimator = factorAnimator3;
            factorAnimator.cancel();
            float f = i6 > 0 ? 1.0f : 0.0f;
            variableFloat.from = f;
            variableFloat.to = f;
            variableFloat.now = f;
            variableRect2.set(i10, i9, i8, i7);
            variableRect.set(i5, i4, i3, i6);
            runnable.run();
        }
        boolean z3 = factorAnimator.isAnimating;
        boolean z4 = this.locked;
        AnimationNotificationsLocker animationNotificationsLocker = this.locker;
        if (!z4 && z3) {
            this.locked = true;
            animationNotificationsLocker.lock();
        }
        if (!this.locked || z3) {
            return;
        }
        this.locked = false;
        animationNotificationsLocker.unlock();
    }
}
