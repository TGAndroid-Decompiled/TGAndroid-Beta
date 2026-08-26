package org.telegram.ui.ActionBar;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;

public final class AlertDialog$$ExternalSyntheticLambda11 implements OnApplyWindowInsetsListener, ActionBarPopupWindow.OnDispatchKeyEventListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public AlertDialog$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.$r8$classId) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f$0;
                actionBarLayout.getClass();
                Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
                Insets defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, true);
                actionBarLayout.systemAndDisplayInsets = defaultWindowInsets;
                actionBarLayout.systemAndDisplayAndImeInsets = defaultWindowInsets2;
                actionBarLayout.lastWindowInsetsCompat = windowInsetsCompat;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.dispatchApplyWindowInsetsInternal(actionBarLayout.getChildAt(i), windowInsetsCompat);
                }
                return WindowInsetsCompat.CONSUMED;
            case 2:
                return ((BaseFragment) this.f$0).onInsetsInternal(view, windowInsetsCompat);
            case 3:
            case 5:
            default:
                return ((DrawerLayoutContainer) this.f$0).onApplyWindowInsets(windowInsetsCompat);
            case 4:
                Rect rect = new Rect();
                int i2 = Build.VERSION.SDK_INT;
                WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
                if (i2 >= 30) {
                    Insets insets = impl.getInsets(527);
                    rect.set(insets.left, insets.top, insets.right, insets.bottom);
                } else {
                    rect.set(impl.getStableInsets().left, impl.getStableInsets().top, impl.getStableInsets().right, impl.getStableInsets().bottom);
                }
                int i3 = rect.left;
                int i4 = rect.top;
                int i5 = rect.right;
                int i6 = rect.bottom + AndroidUtilities.navigationBarHeight;
                FrameLayout frameLayout = (FrameLayout) this.f$0;
                frameLayout.setPadding(i3, i4, i5, i6);
                frameLayout.requestLayout();
                return windowInsetsCompat;
            case 6:
                BottomSheetTabsOverlay bottomSheetTabsOverlay = (BottomSheetTabsOverlay) this.f$0;
                bottomSheetTabsOverlay.getClass();
                bottomSheetTabsOverlay.navigationBarInset = windowInsetsCompat.mImpl.getInsets(2).bottom;
                bottomSheetTabsOverlay.invalidate();
                return WindowInsetsCompat.CONSUMED;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        AlertDialog alertDialog2 = (AlertDialog) this.f$0;
        DialogInterface.OnCancelListener onCancelListener = alertDialog2.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(alertDialog2);
        }
        alertDialog2.dismiss();
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.f$0;
        actionBarMenuItem.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = actionBarMenuItem.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            actionBarMenuItem.popupWindow.dismiss(true);
        }
    }
}
