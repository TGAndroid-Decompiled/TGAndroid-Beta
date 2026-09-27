package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fy0 implements MessagesStorage.BooleanCallback, os {
    public final ProfileActivity f33655a;
    public final TLRPC.User f33656b;

    public fy0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f33655a = profileActivity;
        this.f33656b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f33655a, this.f33656b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ProfileActivity profileActivity = this.f33655a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) org.telegram.ui.Cells.c1.i(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof xn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f31586i1), this.f33656b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
