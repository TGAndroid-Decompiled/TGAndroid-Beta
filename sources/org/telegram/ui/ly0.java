package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ly0 implements MessagesStorage.BooleanCallback, rs {
    public final ProfileActivity f38515a;
    public final TLRPC.User f38516b;

    public ly0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f38515a = profileActivity;
        this.f38516b = user;
    }

    @Override
    public void c() {
        ProfileActivity.j0(this.f38515a, this.f38516b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f38515a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof co) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f33917i1), this.f38516b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
