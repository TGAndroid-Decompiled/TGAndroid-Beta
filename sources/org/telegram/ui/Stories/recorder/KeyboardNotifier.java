package org.telegram.ui.Stories.recorder;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda13;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda28;

public class KeyboardNotifier {
    public boolean awaitingKeyboard;
    public boolean ignoring;
    public int keyboardHeight;
    public int lastKeyboardHeight;
    public final Utilities.Callback listener;
    public boolean mMinusNavBar;
    public boolean mUseInsets;
    public final LaunchActivity$$ExternalSyntheticLambda28 onGlobalLayoutListener;
    public final ItemOptions$$ExternalSyntheticLambda13 onLayoutChangeListener;
    public View realRootView;
    public final Rect rect = new Rect();
    public final View rootView;

    public KeyboardNotifier(final View view, final boolean z, Utilities.Callback callback) {
        ItemOptions$$ExternalSyntheticLambda13 itemOptions$$ExternalSyntheticLambda13 = new ItemOptions$$ExternalSyntheticLambda13(this, 3);
        this.onLayoutChangeListener = itemOptions$$ExternalSyntheticLambda13;
        LaunchActivity$$ExternalSyntheticLambda28 launchActivity$$ExternalSyntheticLambda28 = new LaunchActivity$$ExternalSyntheticLambda28(this, 2);
        this.onGlobalLayoutListener = launchActivity$$ExternalSyntheticLambda28;
        this.rootView = view;
        this.listener = callback;
        this.realRootView = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(launchActivity$$ExternalSyntheticLambda28);
            view.addOnLayoutChangeListener(itemOptions$$ExternalSyntheticLambda13);
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public final void onViewAttachedToWindow(View view2) {
                boolean z2 = z;
                KeyboardNotifier keyboardNotifier = KeyboardNotifier.this;
                if (z2) {
                    keyboardNotifier.realRootView = view2.getRootView();
                }
                View view3 = view;
                view3.getViewTreeObserver().addOnGlobalLayoutListener(keyboardNotifier.onGlobalLayoutListener);
                view3.addOnLayoutChangeListener(keyboardNotifier.onLayoutChangeListener);
            }

            @Override
            public final void onViewDetachedFromWindow(View view2) {
                View view3 = view;
                ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                KeyboardNotifier keyboardNotifier = KeyboardNotifier.this;
                viewTreeObserver.removeOnGlobalLayoutListener(keyboardNotifier.onGlobalLayoutListener);
                view3.removeOnLayoutChangeListener(keyboardNotifier.onLayoutChangeListener);
            }
        });
    }

    public final void fire() {
        if (this.awaitingKeyboard) {
            if (this.keyboardHeight < AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                return;
            } else {
                this.awaitingKeyboard = false;
            }
        }
        Utilities.Callback callback = this.listener;
        if (callback != null) {
            callback.run(Integer.valueOf(this.keyboardHeight));
        }
    }

    public final boolean keyboardVisible() {
        return this.keyboardHeight > AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight || this.awaitingKeyboard;
    }

    public final void update() {
        if (this.ignoring) {
            return;
        }
        boolean z = this.mUseInsets;
        View view = this.rootView;
        if (z) {
            View view2 = this.realRootView;
            if (view2 != null) {
                view = view2;
            }
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
            this.keyboardHeight = rootWindowInsets != null ? rootWindowInsets.mImpl.getInsets(8).bottom : 0;
        } else {
            Rect rect = this.rect;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.realRootView;
            if (view3 != null) {
                view = view3;
            }
            this.keyboardHeight = view.getHeight() - rect.bottom;
        }
        if (this.mMinusNavBar) {
            this.keyboardHeight = Math.max(0, this.keyboardHeight - AndroidUtilities.navigationBarHeight);
        }
        int i = this.lastKeyboardHeight;
        int i2 = this.keyboardHeight;
        boolean z2 = i != i2;
        this.lastKeyboardHeight = i2;
        if (z2) {
            fire();
        }
    }
}
