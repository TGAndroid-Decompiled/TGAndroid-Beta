package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class gv0 implements org.telegram.messenger.zr, ms {
    public final ProfileActivity f37654a;
    public final TLRPC.User f37655b;

    public gv0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f37654a = profileActivity;
        this.f37655b = user;
    }

    @Override
    public void a() {
        ProfileActivity.a0(this.f37654a, this.f37655b);
    }

    @Override
    public void i(boolean z10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.f37654a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                k2Var = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack);
            } else {
                k2Var = null;
            }
            if (k2Var instanceof un) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.M1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(profileActivity.f33825h1), this.f37655b, profileActivity.D2, Boolean.valueOf(z10));
    }
}
