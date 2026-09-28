package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class bf1 implements View.OnClickListener {
    public final wf1 f32416a;

    public bf1(wf1 wf1Var) {
        this.f32416a = wf1Var;
    }

    @Override
    public final void onClick(View view) {
        wf1 wf1Var = this.f32416a;
        if (wf1Var.M == 1) {
            org.telegram.ui.Components.e5.j0(wf1Var, -wf1Var.f39309a, null, wf1Var.g(), null, false, wf1Var.J, new ua(this, 5), wf1Var.getResourceProvider());
            return;
        }
        wf1Var.getMessagesController().addUserToChat(wf1Var.f39309a, wf1Var.getUserConfig().getCurrentUser(), 0, null, wf1Var, false, new ue1(wf1Var, 2), new ve1(wf1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        wf1Var.O0(false);
    }
}
