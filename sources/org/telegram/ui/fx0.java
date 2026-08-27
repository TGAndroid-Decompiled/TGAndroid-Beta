package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class fx0 implements View.OnClickListener {

    public final int f38223a;

    public final ProfileActivity f38224b;

    public fx0(ProfileActivity profileActivity, int i10) {
        this.f38223a = i10;
        this.f38224b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f38223a;
        ProfileActivity profileActivity = this.f38224b;
        switch (i10) {
            case 0:
                ProfileActivity.i0(profileActivity);
                break;
            case 1:
                if (profileActivity.v.getTag() == null) {
                    profileActivity.u4();
                    break;
                }
                break;
            case 2:
                profileActivity.finishPreviewFragment();
                break;
            case 3:
                profileActivity.R4();
                break;
            case 4:
                ProfileActivity.g0(profileActivity);
                break;
            case 5:
                ProfileActivity.a0(profileActivity);
                break;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f35929b1);
                bundle.putLong("user_id", profileActivity.f35923a1);
                profileActivity.presentFragment(new y11(bundle));
                break;
            case 7:
                ProfileActivity.h0(profileActivity);
                break;
            case 8:
                profileActivity.Q4();
                break;
            case 9:
                profileActivity.Q4();
                break;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (n2Var instanceof gy) {
                            gy gyVar = (gy) n2Var;
                            bx bxVar = gyVar.B3;
                            if (bxVar != null) {
                                org.telegram.ui.ActionBar.n2 fragment = bxVar.getFragment();
                                if ((fragment instanceof we1) && (-((we1) fragment).f43719a) == profileActivity.a()) {
                                    gyVar.B3.a();
                                }
                            }
                        } else if (n2Var instanceof rn) {
                            if (((rn) n2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if (n2Var instanceof we1) {
                            if ((-((we1) n2Var).f43719a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if ((n2Var instanceof ProfileActivity) && n2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) n2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f36007m1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.F1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f35929b1);
                HashSet hashSet = we1.f43718j1;
                profileActivity.presentFragment(we1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                break;
            case 11:
                profileActivity.t4(view);
                break;
            default:
                profileActivity.t4(view);
                break;
        }
    }
}
