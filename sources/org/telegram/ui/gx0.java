package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gx0 implements MessagesStorage.BooleanCallback, hs {
    public final ProfileActivity f38617a;
    public final TLRPC.User f38618b;

    public gx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f38617a = profileActivity;
        this.f38618b = user;
    }

    @Override
    public void c() {
        ProfileActivity.i0(this.f38617a, this.f38618b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ProfileActivity profileActivity = this.f38617a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) j3.r0.k(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof qn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.J1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f35949e1), this.f38618b, profileActivity.A2, Boolean.valueOf(z10));
    }
}
