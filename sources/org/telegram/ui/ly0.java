package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ly0 implements MessagesStorage.BooleanCallback, rs {
    public final ProfileActivity f35560a;
    public final TLRPC.User f35561b;

    public ly0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f35560a = profileActivity;
        this.f35561b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f35560a, this.f35561b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f35560a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof bo) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f31295i1), this.f35561b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
