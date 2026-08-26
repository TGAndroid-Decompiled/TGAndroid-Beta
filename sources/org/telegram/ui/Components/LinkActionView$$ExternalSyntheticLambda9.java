package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LinkActionView$$ExternalSyntheticLambda9 implements AlertDialog.OnButtonClickListener, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final int $r8$classId;
    public final LinkActionView f$0;

    public LinkActionView$$ExternalSyntheticLambda9(LinkActionView linkActionView, int i) {
        this.$r8$classId = i;
        this.f$0 = linkActionView;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                LinkActionView.Delegate delegate = this.f$0.delegate;
                if (delegate != null) {
                    delegate.removeLink();
                }
                break;
            default:
                LinkActionView.Delegate delegate2 = this.f$0.delegate;
                if (delegate2 != null) {
                    delegate2.revokeLink();
                }
                break;
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        LinkActionView linkActionView = this.f$0;
        linkActionView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && linkActionView.actionBarPopupWindow.isShowing()) {
            linkActionView.actionBarPopupWindow.dismiss(true);
        }
    }
}
