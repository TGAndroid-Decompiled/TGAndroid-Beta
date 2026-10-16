package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class pf1 implements View.OnClickListener {
    public final kg1 f38916a;

    public pf1(kg1 kg1Var) {
        this.f38916a = kg1Var;
    }

    @Override
    public final void onClick(View view) {
        kg1 kg1Var = this.f38916a;
        if (kg1Var.M == 1) {
            org.telegram.ui.Components.g5.i0(kg1Var, -kg1Var.f37380a, null, kg1Var.g(), null, false, kg1Var.J, new za(this, 5), kg1Var.getResourceProvider());
            return;
        }
        kg1Var.getMessagesController().addUserToChat(kg1Var.f37380a, kg1Var.getUserConfig().getCurrentUser(), 0, null, kg1Var, false, new if1(kg1Var, 2), new jf1(kg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        kg1Var.O0(false);
    }
}
