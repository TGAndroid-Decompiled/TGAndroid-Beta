package org.telegram.ui.Components.inset;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.VariableFloat;
import me.vkryl.android.animator.VariableRect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Components.inset.KeyboardState;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Components.inset.WindowInsetsInAppController;

public class WindowInsetsStateHolder implements WindowInsetsProvider, WindowInsetsInAppController, WindowAnimatedInsetsProvider.Listener {
    private int activeAnimations;
    private int animatedImeInset;
    private WindowAnimatedInsetsProvider animatedInsetsProvider;
    private View animatedInsetsProviderTarget;
    private int inAppKeyboardHeight;
    private int inAppKeyboardViewHeight;
    private final FactorAnimator insetsAnimator;
    private WindowInsetsCompat lastInsets;
    private final Runnable onUpdateListener;
    private final VariableFloat keyboardVisibility = new VariableFloat(0.0f);
    private final VariableRect insetsMaxRect = new VariableRect();
    private final VariableRect insetsImeRect = new VariableRect();
    private final KeyboardState keyboardState = new KeyboardState(new Utilities.Callback() {
        @Override
        public final void run(Object obj) {
            this.f$0.onKeyboardStateChanged((KeyboardState.State) obj);
        }
    });
    private int inAppKeyboardState = 1;
    private final Runnable closeInAppKeyboard = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$0();
        }
    };

    @Override
    public void requestInAppKeyboardHeightIncludeNavbar(int i) {
        WindowInsetsInAppController.CC.$default$requestInAppKeyboardHeightIncludeNavbar(this, i);
    }

    public WindowInsetsStateHolder(final Runnable runnable) {
        this.onUpdateListener = runnable;
        this.insetsAnimator = new FactorAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                WindowInsetsStateHolder.this.insetsMaxRect.applyAnimation(f);
                WindowInsetsStateHolder.this.insetsImeRect.applyAnimation(f);
                WindowInsetsStateHolder.this.keyboardVisibility.applyAnimation(f);
                runnable.run();
            }

            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                boolean z;
                boolean z2 = true;
                if ((WindowInsetsStateHolder.this.getAnimatedImeBottomInset() == 0.0f && WindowInsetsStateHolder.this.inAppKeyboardState == 2) || WindowInsetsStateHolder.this.inAppKeyboardState == 3) {
                    WindowInsetsStateHolder.this.inAppKeyboardState = 1;
                    z = true;
                } else {
                    z = false;
                }
                if (f != 1.0f || WindowInsetsStateHolder.this.inAppKeyboardViewHeight == WindowInsetsStateHolder.this.inAppKeyboardHeight) {
                    z2 = z;
                } else {
                    WindowInsetsStateHolder windowInsetsStateHolder = WindowInsetsStateHolder.this;
                    windowInsetsStateHolder.inAppKeyboardViewHeight = windowInsetsStateHolder.inAppKeyboardHeight;
                }
                if (z2) {
                    runnable.run();
                }
            }
        }, AdjustPanLayoutHelper.keyboardInterpolator, 250L);
    }

    public void onKeyboardStateChanged(KeyboardState.State state) {
        int i;
        if (state == KeyboardState.State.STATE_FULLY_VISIBLE && ((i = this.inAppKeyboardState) == 2 || i == 3)) {
            this.inAppKeyboardState = 1;
        }
        this.onUpdateListener.run();
    }

    public void setInsets(WindowInsetsCompat windowInsetsCompat) {
        setInsets(windowInsetsCompat, this.lastInsets != null);
    }

    private void setInsets(WindowInsetsCompat windowInsetsCompat, boolean z) {
        this.lastInsets = windowInsetsCompat;
        Insets insets = windowInsetsCompat != null ? windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()) : Insets.NONE;
        Insets insets2 = windowInsetsCompat != null ? windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()) : Insets.NONE;
        KeyboardState.State state = this.keyboardState.getState();
        KeyboardState.State keyboardVisibility = this.keyboardState.setKeyboardVisibility(insets2.bottom > 0, !z, false);
        int i = this.inAppKeyboardState;
        if (i == 2) {
            this.inAppKeyboardHeight = 0;
        }
        if (i == 3 && insets2.bottom > 0) {
            this.inAppKeyboardHeight = 0;
        }
        Insets insetsMax = Insets.max(insets2, Insets.of(0, 0, 0, this.inAppKeyboardHeight));
        Insets insetsMax2 = Insets.max(insets, insetsMax);
        if (z) {
            if (!this.keyboardVisibility.differs(insetsMax.bottom > 0 ? 1.0f : 0.0f) && !this.insetsMaxRect.differs(insetsMax2.left, insetsMax2.top, insetsMax2.right, insetsMax2.bottom) && !this.insetsImeRect.differs(insetsMax.left, insetsMax.top, insetsMax.right, insetsMax.bottom)) {
                if (state != keyboardVisibility) {
                    this.onUpdateListener.run();
                    return;
                }
                return;
            }
            this.insetsAnimator.cancel();
            this.keyboardVisibility.finishAnimation(false);
            this.insetsMaxRect.finishAnimation(false);
            this.insetsImeRect.finishAnimation(false);
            this.keyboardVisibility.setTo(insetsMax.bottom > 0 ? 1.0f : 0.0f);
            this.insetsMaxRect.setTo(insetsMax2.left, insetsMax2.top, insetsMax2.right, insetsMax2.bottom);
            this.insetsImeRect.setTo(insetsMax.left, insetsMax.top, insetsMax.right, insetsMax.bottom);
            this.insetsAnimator.forceFactor(0.0f);
            this.insetsAnimator.animateTo(1.0f);
            return;
        }
        this.insetsAnimator.cancel();
        this.keyboardVisibility.set(insetsMax.bottom > 0 ? 1.0f : 0.0f);
        this.insetsMaxRect.set(insetsMax2.left, insetsMax2.top, insetsMax2.right, insetsMax2.bottom);
        this.insetsImeRect.set(insetsMax.left, insetsMax.top, insetsMax.right, insetsMax.bottom);
        this.onUpdateListener.run();
    }

    @Override
    public boolean inAppViewIsVisible() {
        return this.inAppKeyboardState != 1;
    }

    @Override
    public int getInAppKeyboardRecommendedViewHeight() {
        return this.inAppKeyboardViewHeight;
    }

    @Override
    public int getCurrentNavigationBarInset() {
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        }
        return 0;
    }

    public Insets getInsets(int i) {
        WindowInsetsCompat windowInsetsCompat = this.lastInsets;
        return windowInsetsCompat != null ? windowInsetsCompat.getInsets(i) : Insets.NONE;
    }

    @Override
    public float getAnimatedMaxBottomInset() {
        if (this.animatedInsetsProvider != null && this.activeAnimations > 0) {
            return Math.max(this.animatedImeInset, this.insetsMaxRect.getBottom());
        }
        return this.insetsMaxRect.getBottom();
    }

    public int getCurrentMaxBottomInset() {
        if (this.animatedInsetsProvider != null && this.activeAnimations > 0) {
            return Math.max(this.animatedImeInset, Math.max(getInsets(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars()).bottom, this.inAppKeyboardHeight));
        }
        return Math.max(getInsets(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars()).bottom, this.inAppKeyboardHeight);
    }

    @Override
    public float getAnimatedImeBottomInset() {
        if (this.animatedInsetsProvider != null && this.activeAnimations > 0) {
            return Math.max(this.animatedImeInset, this.insetsImeRect.getBottom());
        }
        return this.insetsImeRect.getBottom();
    }

    public float getAnimatedKeyboardVisibility() {
        return this.keyboardVisibility.get();
    }

    @Override
    public void requestInAppKeyboardHeight(int i) {
        if (this.inAppKeyboardHeight == i && this.inAppKeyboardState == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.closeInAppKeyboard);
        this.inAppKeyboardViewHeight = Math.max(this.inAppKeyboardHeight, i);
        this.inAppKeyboardHeight = i;
        this.inAppKeyboardState = 0;
        setInsets(this.lastInsets);
    }

    public void lambda$new$0() {
        if (this.inAppKeyboardHeight != 0) {
            resetInAppKeyboardHeight(false);
        }
    }

    @Override
    public void resetInAppKeyboardHeight(boolean z) {
        if (this.inAppKeyboardHeight == 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.closeInAppKeyboard);
        this.inAppKeyboardState = z ? 3 : 2;
        setInsets(this.lastInsets);
        if (z) {
            AndroidUtilities.runOnUIThread(this.closeInAppKeyboard, 1000L);
        }
    }

    public void setupAnimatedInsetsProvider(WindowAnimatedInsetsProvider windowAnimatedInsetsProvider, View view) {
        this.animatedInsetsProvider = windowAnimatedInsetsProvider;
        this.animatedInsetsProviderTarget = view;
        windowAnimatedInsetsProvider.subscribeToWindowInsetsAnimation(this);
    }

    @Override
    public View getAnimatedInsetsTargetView() {
        return this.animatedInsetsProviderTarget;
    }

    @Override
    public void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.animatedImeInset = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        this.onUpdateListener.run();
    }

    @Override
    public void onAnimatedInsetsStarted() {
        this.activeAnimations++;
    }

    @Override
    public void onAnimatedInsetsFinished() {
        View view = this.animatedInsetsProviderTarget;
        if (view != null) {
            view.postOnAnimation(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAnimatedInsetsFinished$1();
                }
            });
        }
    }

    public void lambda$onAnimatedInsetsFinished$1() {
        this.activeAnimations--;
        setInsets(ViewCompat.getRootWindowInsets(this.animatedInsetsProviderTarget), false);
    }
}
