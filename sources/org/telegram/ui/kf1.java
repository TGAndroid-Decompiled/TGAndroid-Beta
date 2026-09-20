package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class kf1 implements View.OnClickListener {
    public final fg1 f35173a;

    public kf1(fg1 fg1Var) {
        this.f35173a = fg1Var;
    }

    @Override
    public final void onClick(View view) {
        fg1 fg1Var = this.f35173a;
        if (fg1Var.M == 1) {
            org.telegram.ui.Components.d5.j0(fg1Var, -fg1Var.f33596a, null, fg1Var.g(), null, false, fg1Var.J, new va(this, 5), fg1Var.getResourceProvider());
            return;
        }
        fg1Var.getMessagesController().addUserToChat(fg1Var.f33596a, fg1Var.getUserConfig().getCurrentUser(), 0, null, fg1Var, false, new df1(fg1Var, 2), new ef1(fg1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        fg1Var.O0(false);
    }
}
