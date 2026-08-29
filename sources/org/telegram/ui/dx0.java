package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class dx0 implements View.OnClickListener {
    public final int f37647a;
    public final ProfileActivity f37648b;

    public dx0(ProfileActivity profileActivity, int i10) {
        this.f37647a = i10;
        this.f37648b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37647a;
        ProfileActivity profileActivity = this.f37648b;
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
                bundle.putLong("chat_id", profileActivity.f35993b1);
                bundle.putLong("user_id", profileActivity.f35986a1);
                profileActivity.presentFragment(new a21(bundle));
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
                        if (o2Var instanceof fy) {
                            fy fyVar = (fy) o2Var;
                            ax axVar = fyVar.B3;
                            if (axVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = axVar.getFragment();
                                if ((fragment instanceof ze1) && (-((ze1) fragment).f45155a) == profileActivity.a()) {
                                    fyVar.B3.a();
                                }
                            }
                        } else if (o2Var instanceof tn) {
                            if (((tn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        } else if (o2Var instanceof ze1) {
                            if ((-((ze1) o2Var).f45155a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f36069m1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(o2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.F1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f35993b1);
                HashSet hashSet = ze1.f45154j1;
                profileActivity.presentFragment(ze1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
