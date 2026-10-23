package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class ce1 implements View.OnClickListener {
    public final ye1 f36346a;

    public ce1(ye1 ye1Var) {
        this.f36346a = ye1Var;
    }

    @Override
    public final void onClick(View view) {
        ye1 ye1Var = this.f36346a;
        if (ye1Var.M == 1) {
            org.telegram.ui.Components.f5.j0(ye1Var, -ye1Var.f43792a, null, ye1Var.g(), null, false, ye1Var.J, new va(this, 5), ye1Var.getResourceProvider());
            return;
        }
        ye1Var.getMessagesController().addUserToChat(ye1Var.f43792a, ye1Var.getUserConfig().getCurrentUser(), 0, null, ye1Var, false, new vd1(ye1Var, 2), new wd1(ye1Var));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        ye1Var.N0(false);
    }
}
