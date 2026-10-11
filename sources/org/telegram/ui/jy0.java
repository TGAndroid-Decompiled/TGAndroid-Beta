package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jy0 implements MessagesStorage.BooleanCallback, os {
    public final ProfileActivity f39142a;
    public final TLRPC.User f39143b;

    public jy0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f39142a = profileActivity;
        this.f39143b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f39142a, this.f39143b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        ProfileActivity profileActivity = this.f39142a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                m2Var = (org.telegram.ui.ActionBar.m2) sc.v.h(2, fragmentStack);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof zn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f34300i1), this.f39143b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
