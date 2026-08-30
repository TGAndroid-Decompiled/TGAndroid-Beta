package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class oe1 implements View.OnClickListener {
    public final kf1 f36886a;

    public oe1(kf1 kf1Var) {
        this.f36886a = kf1Var;
    }

    @Override
    public final void onClick(View view) {
        kf1 kf1Var = this.f36886a;
        if (kf1Var.J == 1) {
            org.telegram.ui.Components.z4.j0(kf1Var, -kf1Var.f35668a, null, kf1Var.g(), null, false, kf1Var.G, new ta(this, 5), kf1Var.getResourceProvider());
            return;
        }
        kf1Var.getMessagesController().addUserToChat(kf1Var.f35668a, kf1Var.getUserConfig().getCurrentUser(), 0, null, kf1Var, false, new he1(kf1Var, 2), new ie1(kf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        kf1Var.O0(false);
    }
}
