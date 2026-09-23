package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ey0 implements MessagesStorage.BooleanCallback, ms {
    public final ProfileActivity f33043a;
    public final TLRPC.User f33044b;

    public ey0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f33043a = profileActivity;
        this.f33044b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f33043a, this.f33044b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f33043a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.q3.g(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof xn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f31269i1), this.f33044b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
