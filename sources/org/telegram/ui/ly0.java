package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ly0 implements MessagesStorage.BooleanCallback, rs {
    public final ProfileActivity f35467a;
    public final TLRPC.User f35468b;

    public ly0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f35467a = profileActivity;
        this.f35468b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f35467a, this.f35468b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f35467a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) t8.b.h(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof zn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f31542i1), this.f35468b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
