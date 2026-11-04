package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class nt0 implements org.telegram.messenger.ir, kr {
    public final ProfileActivity f48124a;
    public final TLRPC.User f48125b;

    public nt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f48124a = profileActivity;
        this.f48125b = user;
    }

    @Override
    public void a() {
        ProfileActivity.b0(this.f48124a, this.f48125b);
    }

    @Override
    public void o(boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        RectF rectF = ProfileActivity.T6;
        ProfileActivity profileActivity = this.f48124a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                d2Var = (org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack);
            } else {
                d2Var = null;
            }
            if (d2Var instanceof wm) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(profileActivity.f41780i1), this.f48125b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
