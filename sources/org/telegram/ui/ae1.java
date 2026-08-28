package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ae1 implements View.OnClickListener {
    public final we1 f36468a;

    public ae1(we1 we1Var) {
        this.f36468a = we1Var;
    }

    @Override
    public final void onClick(View view) {
        we1 we1Var = this.f36468a;
        if (we1Var.I == 1) {
            org.telegram.ui.Components.y4.j0(we1Var, -we1Var.f43741a, null, we1Var.g(), null, false, we1Var.F, new qa(this, 5), we1Var.getResourceProvider());
            return;
        }
        we1Var.getMessagesController().addUserToChat(we1Var.f43741a, we1Var.getUserConfig().getCurrentUser(), 0, null, we1Var, false, new td1(we1Var, 2), new ud1(we1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        we1Var.O0(false);
    }
}
