package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ay0 implements View.OnClickListener {
    public final int f32256a;
    public final ProfileActivity f32257b;

    public ay0(ProfileActivity profileActivity, int i10) {
        this.f32256a = i10;
        this.f32257b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f32256a;
        ProfileActivity profileActivity = this.f32257b;
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
                bundle.putLong("chat_id", profileActivity.f31563f1);
                bundle.putLong("user_id", profileActivity.f31555e1);
                profileActivity.presentFragment(new w21(bundle));
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
                        if (m2Var instanceof qy) {
                            qy qyVar = (qy) m2Var;
                            kx kxVar = qyVar.F3;
                            if (kxVar != null) {
                                org.telegram.ui.ActionBar.m2 fragment = kxVar.getFragment();
                                if ((fragment instanceof wf1) && (-((wf1) fragment).f39308a) == profileActivity.a()) {
                                    qyVar.F3.a();
                                }
                            }
                        } else if (m2Var instanceof wn) {
                            if (((wn) m2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if (m2Var instanceof wf1) {
                            if ((-((wf1) m2Var).f39308a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        } else if ((m2Var instanceof ProfileActivity) && m2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) m2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f31636q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(m2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f31563f1);
                HashSet hashSet = wf1.f39307n1;
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
