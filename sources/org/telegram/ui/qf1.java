package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class qf1 implements View.OnClickListener {
    public final lg1 f39437a;

    public qf1(lg1 lg1Var) {
        this.f39437a = lg1Var;
    }

    @Override
    public final void onClick(View view) {
        lg1 lg1Var = this.f39437a;
        if (lg1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(lg1Var, -lg1Var.f37957a, null, lg1Var.g(), null, false, lg1Var.J, new za(this, 5), lg1Var.getResourceProvider());
            return;
        }
        lg1Var.getMessagesController().addUserToChat(lg1Var.f37957a, lg1Var.getUserConfig().getCurrentUser(), 0, null, lg1Var, false, new jf1(lg1Var, 2), new kf1(lg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        lg1Var.O0(false);
    }
}
