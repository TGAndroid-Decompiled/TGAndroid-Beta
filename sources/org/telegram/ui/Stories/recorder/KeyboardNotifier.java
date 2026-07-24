package org.telegram.ui.Stories.recorder;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class KeyboardNotifier {
    private boolean awaitingKeyboard;
    public boolean ignoring;
    private int keyboardHeight;
    private int lastKeyboardHeight;
    private final Utilities.Callback listener;
    private boolean mMinusNavBar;
    private boolean mUseInsets;
    private final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private View realRootView;
    private final Rect rect;
    private final View rootView;

    public KeyboardNotifier(View view, Utilities.Callback callback) {
        this(view, false, callback);
    }

    public KeyboardNotifier(final View view, final boolean z, Utilities.Callback callback) {
        this.rect = new Rect();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f$0.lambda$new$0(view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.onLayoutChangeListener = onLayoutChangeListener;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                this.f$0.update();
            }
        };
        this.onGlobalLayoutListener = onGlobalLayoutListener;
        this.rootView = view;
        this.listener = callback;
        this.realRootView = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            view.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View view2) {
                if (z) {
                    KeyboardNotifier.this.realRootView = view2.getRootView();
                }
                view.getViewTreeObserver().addOnGlobalLayoutListener(KeyboardNotifier.this.onGlobalLayoutListener);
                view.addOnLayoutChangeListener(KeyboardNotifier.this.onLayoutChangeListener);
            }

            @Override
            public void onViewDetachedFromWindow(View view2) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(KeyboardNotifier.this.onGlobalLayoutListener);
                view.removeOnLayoutChangeListener(KeyboardNotifier.this.onLayoutChangeListener);
            }
        });
    }

    public KeyboardNotifier useInsets() {
        this.mUseInsets = true;
        return this;
    }

    public KeyboardNotifier useMinusNavbar() {
        this.mMinusNavBar = true;
        return this;
    }

    public void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        update();
    }

    public void update() {
        if (this.ignoring) {
            return;
        }
        if (this.mUseInsets) {
            View view = this.realRootView;
            if (view == null) {
                view = this.rootView;
            }
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
            this.keyboardHeight = rootWindowInsets != null ? rootWindowInsets.getInsets(WindowInsetsCompat.Type.ime()).bottom : 0;
        } else {
            this.rootView.getWindowVisibleDisplayFrame(this.rect);
            View view2 = this.realRootView;
            if (view2 == null) {
                view2 = this.rootView;
            }
            this.keyboardHeight = view2.getHeight() - this.rect.bottom;
        }
        if (this.mMinusNavBar) {
            this.keyboardHeight = Math.max(0, this.keyboardHeight - AndroidUtilities.navigationBarHeight);
        }
        int i = this.lastKeyboardHeight;
        int i2 = this.keyboardHeight;
        boolean z = i != i2;
        this.lastKeyboardHeight = i2;
        if (z) {
            fire();
        }
    }

    public int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public boolean keyboardVisible() {
        return this.keyboardHeight > AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(20.0f) || this.awaitingKeyboard;
    }

    public void ignore(boolean z) {
        this.ignoring = z;
        update();
    }

    public void fire() {
        if (this.awaitingKeyboard) {
            if (this.keyboardHeight < AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(20.0f)) {
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

    public void awaitKeyboard() {
        this.awaitingKeyboard = true;
    }
}
