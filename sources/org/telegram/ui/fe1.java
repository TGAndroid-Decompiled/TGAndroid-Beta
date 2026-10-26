package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class fe1 implements View.OnClickListener {
    public final af1 f39353a;

    public fe1(af1 af1Var) {
        this.f39353a = af1Var;
    }

    @Override
    public final void onClick(View view) {
        af1 af1Var = this.f39353a;
        if (af1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(af1Var, -af1Var.f37734a, null, af1Var.g(), null, false, af1Var.J, new wa(this, 5), af1Var.getResourceProvider());
            return;
        }
        af1Var.getMessagesController().addUserToChat(af1Var.f37734a, af1Var.getUserConfig().getCurrentUser(), 0, null, af1Var, false, new yd1(af1Var, 2), new zd1(af1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        af1Var.O0(false);
    }
}
