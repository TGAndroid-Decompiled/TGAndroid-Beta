package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ex0 implements View.OnClickListener {
    public final int f38038a;
    public final ProfileActivity f38039b;

    public ex0(ProfileActivity profileActivity, int i9) {
        this.f38038a = i9;
        this.f38039b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f38038a;
        ProfileActivity profileActivity = this.f38039b;
        switch (i9) {
            case 0:
                ProfileActivity.h0(profileActivity);
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
                ProfileActivity.f0(profileActivity);
                return;
            case 5:
                ProfileActivity.Z(profileActivity);
                return;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f35926b1);
                bundle.putLong("user_id", profileActivity.f35920a1);
                profileActivity.presentFragment(new z11(bundle));
                return;
            case 7:
                ProfileActivity.g0(profileActivity);
                return;
            case 8:
                profileActivity.Q4();
                return;
            case 9:
                profileActivity.Q4();
                return;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (o2Var instanceof dy) {
                            dy dyVar = (dy) o2Var;
                            yw ywVar = dyVar.B3;
                            if (ywVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = ywVar.getFragment();
                                if ((fragment instanceof we1) && (-((we1) fragment).f43741a) == profileActivity.a()) {
                                    dyVar.B3.a();
                                }
                            }
                        } else if (o2Var instanceof qn) {
                            if (((qn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i10--;
                            }
                        } else if (o2Var instanceof we1) {
                            if ((-((we1) o2Var).f43741a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i10--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f36004m1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.F1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f35926b1);
                HashSet hashSet = we1.f43740j1;
                profileActivity.presentFragment(we1.D0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
