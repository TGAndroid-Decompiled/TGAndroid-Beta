package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class df1 implements View.OnClickListener {
    public final yf1 f35765a;

    public df1(yf1 yf1Var) {
        this.f35765a = yf1Var;
    }

    @Override
    public final void onClick(View view) {
        yf1 yf1Var = this.f35765a;
        if (yf1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(yf1Var, -yf1Var.f43170a, null, yf1Var.g(), null, false, yf1Var.J, new wa(this, 5), yf1Var.getResourceProvider());
            return;
        }
        yf1Var.getMessagesController().addUserToChat(yf1Var.f43170a, yf1Var.getUserConfig().getCurrentUser(), 0, null, yf1Var, false, new we1(yf1Var, 2), new xe1(yf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        yf1Var.O0(false);
    }
}
