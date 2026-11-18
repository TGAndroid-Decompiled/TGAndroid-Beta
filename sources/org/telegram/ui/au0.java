package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class au0 implements View.OnClickListener {
    public final int f45666a;
    public final ProfileActivity f45667b;

    public au0(ProfileActivity profileActivity, int i7) {
        this.f45666a = i7;
        this.f45667b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f45666a;
        ProfileActivity profileActivity = this.f45667b;
        switch (i7) {
            case 0:
                ProfileActivity.k0(profileActivity);
                return;
            case 1:
                if (profileActivity.f43635s.getTag() == null) {
                    profileActivity.L4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.o5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f43665w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.w3(profileActivity, profileActivity.f43532d0, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43540e1)), profileActivity.f43665w2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.m0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f43548f1);
                bundle.putLong("user_id", profileActivity.f43540e1);
                profileActivity.presentFragment(new ci.j0(bundle));
                return;
            case 7:
                ProfileActivity.n0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.n5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.n5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.Z6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (h2Var instanceof cx) {
                            cx cxVar = (cx) h2Var;
                            xv xvVar = cxVar.H3;
                            if (xvVar != null) {
                                org.telegram.ui.ActionBar.h2 fragment = xvVar.getFragment();
                                if ((fragment instanceof y91) && (-((y91) fragment).f54050a) == profileActivity.a()) {
                                    cxVar.H3.a();
                                }
                            }
                        } else if (h2Var instanceof bn) {
                            if (((bn) h2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(h2Var, false);
                                i10--;
                            }
                        } else if (h2Var instanceof y91) {
                            if ((-((y91) h2Var).f54050a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(h2Var, false);
                                i10--;
                            }
                        } else if ((h2Var instanceof ProfileActivity) && h2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) h2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f43621q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(h2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f43548f1);
                HashSet hashSet = y91.f54049s1;
                profileActivity.presentFragment(y91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.K4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.K4(view);
                return;
        }
    }
}
