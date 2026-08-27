package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;

public final class be1 implements View.OnClickListener {

    public final we1 f36804a;

    public be1(we1 we1Var) {
        this.f36804a = we1Var;
    }

    @Override
    public final void onClick(View view) {
        we1 we1Var = this.f36804a;
        if (we1Var.I == 1) {
            org.telegram.ui.Components.y4.j0(we1Var, -we1Var.f43719a, null, we1Var.g(), null, false, we1Var.F, new ra(this, 5), we1Var.getResourceProvider());
            return;
        }
        we1Var.getMessagesController().addUserToChat(we1Var.f43719a, we1Var.getUserConfig().getCurrentUser(), 0, null, we1Var, false, new ud1(we1Var, 2), new vd1(we1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        we1Var.O0(false);
    }
}
