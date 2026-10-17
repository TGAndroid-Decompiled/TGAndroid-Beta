package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class px0 implements MessagesStorage.BooleanCallback, gs {
    public final ProfileActivity f40254a;
    public final TLRPC.User f40255b;

    public px0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f40254a = profileActivity;
        this.f40255b = user;
    }

    @Override
    public void c() {
        ProfileActivity.d0(this.f40254a, this.f40255b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f40254a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) r.c.e(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof sn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.O1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f33635j1), this.f40255b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
