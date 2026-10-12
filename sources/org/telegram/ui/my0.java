package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class my0 implements MessagesStorage.BooleanCallback, ss {
    public final ProfileActivity f40151a;
    public final TLRPC.User f40152b;

    public my0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f40151a = profileActivity;
        this.f40152b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f40151a, this.f40152b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        ProfileActivity profileActivity = this.f40151a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                m2Var = (org.telegram.ui.ActionBar.m2) sc.v.h(2, fragmentStack);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof eo) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f34111i1), this.f40152b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
