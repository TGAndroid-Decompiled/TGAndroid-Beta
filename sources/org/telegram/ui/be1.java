package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class be1 implements View.OnClickListener {
    public final xe1 f36058a;

    public be1(xe1 xe1Var) {
        this.f36058a = xe1Var;
    }

    @Override
    public final void onClick(View view) {
        xe1 xe1Var = this.f36058a;
        if (xe1Var.M == 1) {
            org.telegram.ui.Components.d5.i0(xe1Var, -xe1Var.f43545a, null, xe1Var.g(), null, false, xe1Var.J, new va(this, 5), xe1Var.getResourceProvider());
            return;
        }
        xe1Var.getMessagesController().addUserToChat(xe1Var.f43545a, xe1Var.getUserConfig().getCurrentUser(), 0, null, xe1Var, false, new ud1(xe1Var, 2), new vd1(xe1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        xe1Var.N0(false);
    }
}
