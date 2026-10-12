package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oy0 implements View.OnClickListener {
    public final int f39062a;
    public final ProfileActivity f39063b;

    public oy0(ProfileActivity profileActivity, int i10) {
        this.f39062a = i10;
        this.f39063b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39062a;
        ProfileActivity profileActivity = this.f39063b;
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
                bundle.putLong("chat_id", profileActivity.f32567f1);
                bundle.putLong("user_id", profileActivity.f32559e1);
                profileActivity.presentFragment(new l31(bundle));
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
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (m2Var instanceof yy) {
                            yy yyVar = (yy) m2Var;
                            sx sxVar = yyVar.F3;
                            if (sxVar != null) {
                                org.telegram.ui.ActionBar.m2 fragment = sxVar.getFragment();
                                if ((fragment instanceof lg1) && (-((lg1) fragment).f37957a) == profileActivity.a()) {
                                    yyVar.F3.a();
                                }
                            }
                        } else if (m2Var instanceof fo) {
                            if (((fo) m2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if (m2Var instanceof lg1) {
                            if ((-((lg1) m2Var).f37957a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if ((m2Var instanceof ProfileActivity) && m2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) m2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f32641q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f32567f1);
                HashSet hashSet = lg1.f37956n1;
                profileActivity.presentFragment(lg1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
