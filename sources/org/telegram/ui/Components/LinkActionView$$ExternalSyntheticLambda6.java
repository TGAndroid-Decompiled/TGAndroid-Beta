package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LinkActionView$$ExternalSyntheticLambda6 implements ActionBarPopupWindow.OnDispatchKeyEventListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final LinkActionView f$0;

    public LinkActionView$$ExternalSyntheticLambda6(LinkActionView linkActionView, int i) {
        this.$r8$classId = i;
        this.f$0 = linkActionView;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$revokeLink$10(alertDialog, i);
                break;
            default:
                this.f$0.lambda$new$3(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$new$8(keyEvent);
    }
}
