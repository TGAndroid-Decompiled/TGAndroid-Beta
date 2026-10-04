package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fy0 implements MessagesStorage.BooleanCallback, ps {
    public final ProfileActivity f36429a;
    public final TLRPC.User f36430b;

    public fy0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f36429a = profileActivity;
        this.f36430b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f36429a, this.f36430b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ProfileActivity profileActivity = this.f36429a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                n2Var = (org.telegram.ui.ActionBar.n2) t8.b.h(2, fragmentStack);
            } else {
                n2Var = null;
            }
            if (n2Var instanceof yn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f34263i1), this.f36430b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
