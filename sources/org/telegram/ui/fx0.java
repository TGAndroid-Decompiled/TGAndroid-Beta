package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fx0 implements MessagesStorage.BooleanCallback, gs {
    public final ProfileActivity f38249a;
    public final TLRPC.User f38250b;

    public fx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f38249a = profileActivity;
        this.f38250b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f38249a, this.f38250b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ProfileActivity profileActivity = this.f38249a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof tn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.J1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f36014e1), this.f38250b, profileActivity.A2, Boolean.valueOf(z10));
    }
}
