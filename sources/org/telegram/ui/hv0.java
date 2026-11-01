package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class hv0 implements View.OnClickListener {
    public final int f37874a;
    public final ProfileActivity f37875b;

    public hv0(ProfileActivity profileActivity, int i10) {
        this.f37874a = i10;
        this.f37875b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f37874a;
        ProfileActivity profileActivity = this.f37875b;
        switch (i10) {
            case 0:
                ProfileActivity.l0(profileActivity);
                return;
            case 1:
                if (profileActivity.f33905s.getTag() == null) {
                    profileActivity.I4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.S6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.l5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f33922u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.p3(profileActivity, profileActivity.f33795c0, profileActivity.getMessagesController().Z1(Long.valueOf(profileActivity.f33803d1)), profileActivity.f33922u2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.n0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f33810e1);
                bundle.putLong("user_id", profileActivity.f33803d1);
                profileActivity.presentFragment(new qh.i0(bundle));
                return;
            case 7:
                ProfileActivity.o0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.S6;
                profileActivity.k5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.S6;
                profileActivity.k5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.S6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (k2Var instanceof zx) {
                            zx zxVar = (zx) k2Var;
                            ww wwVar = zxVar.F3;
                            if (wwVar != null) {
                                org.telegram.ui.ActionBar.k2 fragment = wwVar.getFragment();
                                if ((fragment instanceof nb1) && (-((nb1) fragment).f39797a) == profileActivity.a()) {
                                    zxVar.F3.a();
                                }
                            }
                        } else if (k2Var instanceof un) {
                            if (((un) k2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        } else if (k2Var instanceof nb1) {
                            if ((-((nb1) k2Var).f39797a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        } else if ((k2Var instanceof ProfileActivity) && k2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) k2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f33886p1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(k2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.I1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f33810e1);
                HashSet hashSet = nb1.f39796q1;
                profileActivity.presentFragment(nb1.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.H4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.H4(view);
                return;
        }
    }
}
