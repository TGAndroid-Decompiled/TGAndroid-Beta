package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class pt0 implements View.OnClickListener {
    public final int f48666a;
    public final ProfileActivity f48667b;

    public pt0(ProfileActivity profileActivity, int i3) {
        this.f48666a = i3;
        this.f48667b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f48666a;
        ProfileActivity profileActivity = this.f48667b;
        switch (i3) {
            case 0:
                ProfileActivity.l0(profileActivity);
                return;
            case 1:
                if (profileActivity.f41845s.getTag() == null) {
                    profileActivity.I4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.T6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.T6;
                profileActivity.l5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f41868v2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.n3(profileActivity, profileActivity.f41742d0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41751e1)), profileActivity.f41868v2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.n0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.T6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f41759f1);
                bundle.putLong("user_id", profileActivity.f41751e1);
                profileActivity.presentFragment(new bi.j0(bundle));
                return;
            case 7:
                ProfileActivity.o0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.T6;
                profileActivity.k5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.T6;
                profileActivity.k5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.T6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (d2Var instanceof uw) {
                            uw uwVar = (uw) d2Var;
                            pv pvVar = uwVar.G3;
                            if (pvVar != null) {
                                org.telegram.ui.ActionBar.d2 fragment = pvVar.getFragment();
                                if ((fragment instanceof m91) && (-((m91) fragment).f47575a) == profileActivity.a()) {
                                    uwVar.G3.a();
                                }
                            }
                        } else if (d2Var instanceof wm) {
                            if (((wm) d2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(d2Var, false);
                                i10--;
                            }
                        } else if (d2Var instanceof m91) {
                            if ((-((m91) d2Var).f47575a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(d2Var, false);
                                i10--;
                            }
                        } else if ((d2Var instanceof ProfileActivity) && d2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) d2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f41832q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(d2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f41759f1);
                HashSet hashSet = m91.f47574r1;
                profileActivity.presentFragment(m91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.T6;
                profileActivity.H4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.T6;
                profileActivity.H4(view);
                return;
        }
    }
}
