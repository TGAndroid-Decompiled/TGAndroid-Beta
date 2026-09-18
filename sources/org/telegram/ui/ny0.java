package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ny0 implements MessagesStorage.BooleanCallback, ts {
    public final ProfileActivity f36181a;
    public final TLRPC.User f36182b;

    public ny0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f36181a = profileActivity;
        this.f36182b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f36181a, this.f36182b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ProfileActivity profileActivity = this.f36181a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.p6.g(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof bo) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f31315i1), this.f36182b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
