package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class if1 implements View.OnClickListener {
    public final dg1 f34665a;

    public if1(dg1 dg1Var) {
        this.f34665a = dg1Var;
    }

    @Override
    public final void onClick(View view) {
        dg1 dg1Var = this.f34665a;
        if (dg1Var.M == 1) {
            org.telegram.ui.Components.c5.j0(dg1Var, -dg1Var.f33012a, null, dg1Var.g(), null, false, dg1Var.J, new ua(this, 5), dg1Var.getResourceProvider());
            return;
        }
        dg1Var.getMessagesController().addUserToChat(dg1Var.f33012a, dg1Var.getUserConfig().getCurrentUser(), 0, null, dg1Var, false, new bf1(dg1Var, 2), new cf1(dg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        dg1Var.O0(false);
    }
}
