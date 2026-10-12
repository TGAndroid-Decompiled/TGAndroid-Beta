package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class mf1 implements View.OnClickListener {
    public final hg1 f40033a;

    public mf1(hg1 hg1Var) {
        this.f40033a = hg1Var;
    }

    @Override
    public final void onClick(View view) {
        hg1 hg1Var = this.f40033a;
        if (hg1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(hg1Var, -hg1Var.f38376a, null, hg1Var.g(), null, false, hg1Var.J, new ya(this, 5), hg1Var.getResourceProvider());
            return;
        }
        hg1Var.getMessagesController().addUserToChat(hg1Var.f38376a, hg1Var.getUserConfig().getCurrentUser(), 0, null, hg1Var, false, new ff1(hg1Var, 2), new gf1(hg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        hg1Var.O0(false);
    }
}
