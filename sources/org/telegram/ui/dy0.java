package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class dy0 implements View.OnClickListener {
    public final int f33064a;
    public final ProfileActivity f33065b;

    public dy0(ProfileActivity profileActivity, int i10) {
        this.f33064a = i10;
        this.f33065b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33064a;
        ProfileActivity profileActivity = this.f33065b;
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
                bundle.putLong("chat_id", profileActivity.f31565f1);
                bundle.putLong("user_id", profileActivity.f31557e1);
                profileActivity.presentFragment(new y21(bundle));
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
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (o2Var instanceof ty) {
                            ty tyVar = (ty) o2Var;
                            kx kxVar = tyVar.F3;
                            if (kxVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = kxVar.getFragment();
                                if ((fragment instanceof wf1) && (-((wf1) fragment).f39287a) == profileActivity.a()) {
                                    tyVar.F3.a();
                                }
                            }
                        } else if (o2Var instanceof xn) {
                            if (((xn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        } else if (o2Var instanceof wf1) {
                            if ((-((wf1) o2Var).f39287a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f31638q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f31565f1);
                HashSet hashSet = wf1.f39286n1;
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
