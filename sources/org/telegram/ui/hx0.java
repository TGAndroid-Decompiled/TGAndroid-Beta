package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class hx0 implements MessagesStorage.BooleanCallback, is {

    public final ProfileActivity f38904a;

    public final TLRPC.User f38905b;

    public hx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f38904a = profileActivity;
        this.f38905b = user;
    }

    @Override
    public void c() {
        ProfileActivity.j0(this.f38904a, this.f38905b);
    }

    @Override
    public void run(boolean z10) {
        ProfileActivity profileActivity = this.f38904a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (org.telegram.ui.ActionBar.n2) i0.a.j(2, fragmentStack)) instanceof rn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.J1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f35952e1), this.f38905b, profileActivity.A2, Boolean.valueOf(z10));
    }
}
