package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class he1 implements View.OnClickListener {
    public final cf1 f39869a;

    public he1(cf1 cf1Var) {
        this.f39869a = cf1Var;
    }

    @Override
    public final void onClick(View view) {
        cf1 cf1Var = this.f39869a;
        if (cf1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(cf1Var, -cf1Var.f38288a, null, cf1Var.g(), null, false, cf1Var.J, new wa(this, 5), cf1Var.getResourceProvider());
            return;
        }
        cf1Var.getMessagesController().addUserToChat(cf1Var.f38288a, cf1Var.getUserConfig().getCurrentUser(), 0, null, cf1Var, false, new ae1(cf1Var, 2), new be1(cf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        cf1Var.O0(false);
    }
}
