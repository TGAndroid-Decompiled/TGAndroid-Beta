package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class jf1 implements View.OnClickListener {
    public final eg1 f37765a;

    public jf1(eg1 eg1Var) {
        this.f37765a = eg1Var;
    }

    @Override
    public final void onClick(View view) {
        eg1 eg1Var = this.f37765a;
        if (eg1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(eg1Var, -eg1Var.f36025a, null, eg1Var.g(), null, false, eg1Var.J, new va(this, 5), eg1Var.getResourceProvider());
            return;
        }
        eg1Var.getMessagesController().addUserToChat(eg1Var.f36025a, eg1Var.getUserConfig().getCurrentUser(), 0, null, eg1Var, false, new cf1(eg1Var, 2), new df1(eg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        eg1Var.O0(false);
    }
}
