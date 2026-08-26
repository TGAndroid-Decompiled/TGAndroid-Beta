package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class ShareAlert$$ExternalSyntheticLambda12 implements OnApplyWindowInsetsListener, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final ShareAlert f$0;

    public ShareAlert$$ExternalSyntheticLambda12(ShareAlert shareAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = shareAlert;
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ShareAlert shareAlert = this.f$0;
        shareAlert.getClass();
        shareAlert.processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        if (!shareAlert.systemInsets.equals(insets)) {
            shareAlert.systemInsets = insets;
            shareAlert.container.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        switch (this.$r8$classId) {
            case 1:
                ShareAlert shareAlert = this.f$0;
                shareAlert.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = shareAlert.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
                    shareAlert.sendPopupWindow.dismiss(true);
                    break;
                }
                break;
            default:
                ShareAlert shareAlert2 = this.f$0;
                shareAlert2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow2 = shareAlert2.sendPopupWindow) != null && actionBarPopupWindow2.isShowing()) {
                    shareAlert2.sendPopupWindow.dismiss(true);
                    break;
                }
                break;
        }
    }
}
