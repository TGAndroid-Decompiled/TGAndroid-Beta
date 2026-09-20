package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class jy0 implements View.OnClickListener {
    public final int f35005a;
    public final ProfileActivity f35006b;

    public jy0(ProfileActivity profileActivity, int i10) {
        this.f35005a = i10;
        this.f35006b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f35005a;
        ProfileActivity profileActivity = this.f35006b;
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
                bundle.putLong("chat_id", profileActivity.f31561f1);
                bundle.putLong("user_id", profileActivity.f31553e1);
                profileActivity.presentFragment(new f31(bundle));
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
                        if (n2Var instanceof uy) {
                            uy uyVar = (uy) n2Var;
                            ox oxVar = uyVar.F3;
                            if (oxVar != null) {
                                org.telegram.ui.ActionBar.n2 fragment = oxVar.getFragment();
                                if ((fragment instanceof fg1) && (-((fg1) fragment).f33596a) == profileActivity.a()) {
                                    uyVar.F3.a();
                                }
                            }
                        } else if (n2Var instanceof zn) {
                            if (((zn) n2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if (n2Var instanceof fg1) {
                            if ((-((fg1) n2Var).f33596a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if ((n2Var instanceof ProfileActivity) && n2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) n2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f31634q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f31561f1);
                HashSet hashSet = fg1.f33595n1;
                profileActivity.presentFragment(fg1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
