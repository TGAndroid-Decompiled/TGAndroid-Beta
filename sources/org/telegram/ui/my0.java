package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class my0 implements View.OnClickListener {
    public final int f35076a;
    public final ProfileActivity f35077b;

    public my0(ProfileActivity profileActivity, int i10) {
        this.f35076a = i10;
        this.f35077b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f35076a;
        ProfileActivity profileActivity = this.f35077b;
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
                bundle.putLong("chat_id", profileActivity.f30389f1);
                bundle.putLong("user_id", profileActivity.f30381e1);
                profileActivity.presentFragment(new k31(bundle));
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
                        if (p2Var instanceof wy) {
                            wy wyVar = (wy) p2Var;
                            qx qxVar = wyVar.F3;
                            if (qxVar != null) {
                                org.telegram.ui.ActionBar.p2 fragment = qxVar.getFragment();
                                if ((fragment instanceof ig1) && (-((ig1) fragment).f33681a) == profileActivity.a()) {
                                    wyVar.F3.a();
                                }
                            }
                        } else if (p2Var instanceof eo) {
                            if (((eo) p2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if (p2Var instanceof ig1) {
                            if ((-((ig1) p2Var).f33681a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if ((p2Var instanceof ProfileActivity) && p2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) p2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f30462q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f30389f1);
                HashSet hashSet = ig1.f33680n1;
                profileActivity.presentFragment(ig1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
