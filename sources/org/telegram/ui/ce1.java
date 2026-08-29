package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ce1 implements View.OnClickListener {
    public final ze1 f37090a;

    public ce1(ze1 ze1Var) {
        this.f37090a = ze1Var;
    }

    @Override
    public final void onClick(View view) {
        ze1 ze1Var = this.f37090a;
        if (ze1Var.I == 1) {
            org.telegram.ui.Components.c5.j0(ze1Var, -ze1Var.f45155a, null, ze1Var.g(), null, false, ze1Var.F, new pa(this, 5), ze1Var.getResourceProvider());
            return;
        }
        ze1Var.getMessagesController().addUserToChat(ze1Var.f45155a, ze1Var.getUserConfig().getCurrentUser(), 0, null, ze1Var, false, new vd1(ze1Var, 2), new wd1(ze1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        ze1Var.O0(false);
    }
}
