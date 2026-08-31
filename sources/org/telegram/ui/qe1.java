package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class qe1 implements View.OnClickListener {
    public final mf1 f40458a;

    public qe1(mf1 mf1Var) {
        this.f40458a = mf1Var;
    }

    @Override
    public final void onClick(View view) {
        mf1 mf1Var = this.f40458a;
        if (mf1Var.J == 1) {
            org.telegram.ui.Components.z4.j0(mf1Var, -mf1Var.f39102a, null, mf1Var.g(), null, false, mf1Var.G, new ta(this, 5), mf1Var.getResourceProvider());
            return;
        }
        mf1Var.getMessagesController().addUserToChat(mf1Var.f39102a, mf1Var.getUserConfig().getCurrentUser(), 0, null, mf1Var, false, new ke1(mf1Var, 2), new le1(mf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        mf1Var.O0(false);
    }
}
