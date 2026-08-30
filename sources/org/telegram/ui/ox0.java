package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ox0 implements View.OnClickListener {
    public final int f36997a;
    public final ProfileActivity f36998b;

    public ox0(ProfileActivity profileActivity, int i10) {
        this.f36997a = i10;
        this.f36998b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f36997a;
        ProfileActivity profileActivity = this.f36998b;
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
                bundle.putLong("chat_id", profileActivity.f32045c1);
                bundle.putLong("user_id", profileActivity.f32037b1);
                profileActivity.presentFragment(new m21(bundle));
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
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (p2Var instanceof oy) {
                            oy oyVar = (oy) p2Var;
                            jx jxVar = oyVar.C3;
                            if (jxVar != null) {
                                org.telegram.ui.ActionBar.p2 fragment = jxVar.getFragment();
                                if ((fragment instanceof kf1) && (-((kf1) fragment).f35668a) == profileActivity.a()) {
                                    oyVar.C3.a();
                                }
                            }
                        } else if (p2Var instanceof xn) {
                            if (((xn) p2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if (p2Var instanceof kf1) {
                            if ((-((kf1) p2Var).f35668a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if ((p2Var instanceof ProfileActivity) && p2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) p2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f32120n1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.G1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f32045c1);
                HashSet hashSet = kf1.f35667k1;
                profileActivity.presentFragment(kf1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
