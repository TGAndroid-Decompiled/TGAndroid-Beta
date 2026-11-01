package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fv0 implements org.telegram.messenger.as, ms {
    public final ProfileActivity f37240a;
    public final TLRPC.User f37241b;

    public fv0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f37240a = profileActivity;
        this.f37241b = user;
    }

    @Override
    public void a() {
        ProfileActivity.b0(this.f37240a, this.f37241b);
    }

    @Override
    public void i(boolean z10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.f37240a;
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
        profileActivity.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(profileActivity.f33832h1), this.f37241b, profileActivity.D2, Boolean.valueOf(z10));
    }
}
