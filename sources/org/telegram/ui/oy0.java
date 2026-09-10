package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oy0 implements MessagesStorage.BooleanCallback, ss {
    public final ProfileActivity f35644a;
    public final TLRPC.User f35645b;

    public oy0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f35644a = profileActivity;
        this.f35645b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f35644a, this.f35645b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.p2 p2Var;
        ProfileActivity profileActivity = this.f35644a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                p2Var = (org.telegram.ui.ActionBar.p2) org.telegram.ui.Cells.r6.g(2, fragmentStack);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof eo) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f30410i1), this.f35645b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
