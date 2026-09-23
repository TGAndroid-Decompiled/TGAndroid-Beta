package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cy0 implements View.OnClickListener {
    public final int f32438a;
    public final ProfileActivity f32439b;

    public cy0(ProfileActivity profileActivity, int i10) {
        this.f32438a = i10;
        this.f32439b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f32438a;
        ProfileActivity profileActivity = this.f32439b;
        switch (i10) {
            case 0:
                ProfileActivity.i0(profileActivity);
                return;
            case 1:
                if (profileActivity.v.getTag() == null) {
                    profileActivity.u4();
                    return;
                }
                return;
            case 2:
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                profileActivity.R4();
                return;
            case 4:
                ProfileActivity.g0(profileActivity);
                return;
            case 5:
                ProfileActivity.a0(profileActivity);
                return;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f31248f1);
                bundle.putLong("user_id", profileActivity.f31240e1);
                profileActivity.presentFragment(new x21(bundle));
                return;
            case 7:
                ProfileActivity.h0(profileActivity);
                return;
            case 8:
                profileActivity.Q4();
                return;
            case 9:
                profileActivity.Q4();
                return;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (n2Var instanceof ry) {
                            ry ryVar = (ry) n2Var;
                            lx lxVar = ryVar.F3;
                            if (lxVar != null) {
                                org.telegram.ui.ActionBar.n2 fragment = lxVar.getFragment();
                                if ((fragment instanceof wf1) && (-((wf1) fragment).f38936a) == profileActivity.a()) {
                                    ryVar.F3.a();
                                }
                            }
                        } else if (n2Var instanceof xn) {
                            if (((xn) n2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if (n2Var instanceof wf1) {
                            if ((-((wf1) n2Var).f38936a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if ((n2Var instanceof ProfileActivity) && n2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) n2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f31321q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f31248f1);
                HashSet hashSet = wf1.f38935n1;
                profileActivity.presentFragment(wf1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                profileActivity.t4(view);
                return;
            default:
                profileActivity.t4(view);
                return;
        }
    }
}
