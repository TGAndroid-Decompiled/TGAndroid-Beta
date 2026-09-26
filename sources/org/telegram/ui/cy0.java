package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cy0 implements MessagesStorage.BooleanCallback, ls {
    public final ProfileActivity f32817a;
    public final TLRPC.User f32818b;

    public cy0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f32817a = profileActivity;
        this.f32818b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f32817a, this.f32818b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        ProfileActivity profileActivity = this.f32817a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                m2Var = (org.telegram.ui.ActionBar.m2) org.telegram.ui.Cells.c1.i(2, fragmentStack);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof wn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f31583i1), this.f32818b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
