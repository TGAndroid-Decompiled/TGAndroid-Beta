package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nx0 implements MessagesStorage.BooleanCallback, es {
    public final ProfileActivity f39706a;
    public final TLRPC.User f39707b;

    public nx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f39706a = profileActivity;
        this.f39707b = user;
    }

    @Override
    public void c() {
        ProfileActivity.d0(this.f39706a, this.f39707b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f39706a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof qn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.O1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f33652j1), this.f39707b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
