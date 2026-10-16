package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oy0 implements View.OnClickListener {
    public final int f38767a;
    public final ProfileActivity f38768b;

    public oy0(ProfileActivity profileActivity, int i10) {
        this.f38767a = i10;
        this.f38768b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38767a;
        ProfileActivity profileActivity = this.f38768b;
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
                bundle.putLong("chat_id", profileActivity.f32269f1);
                bundle.putLong("user_id", profileActivity.f32261e1);
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
                            sx sxVar = yyVar.G3;
                            if (sxVar != null) {
                                org.telegram.ui.ActionBar.m2 fragment = sxVar.getFragment();
                                if ((fragment instanceof kg1) && (-((kg1) fragment).f37380a) == profileActivity.a()) {
                                    yyVar.G3.a();
                                }
                            }
                        } else if (m2Var instanceof fo) {
                            if (((fo) m2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if (m2Var instanceof kg1) {
                            if ((-((kg1) m2Var).f37380a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if ((m2Var instanceof ProfileActivity) && m2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) m2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f32343q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f32269f1);
                HashSet hashSet = kg1.f37379n1;
                profileActivity.presentFragment(kg1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
