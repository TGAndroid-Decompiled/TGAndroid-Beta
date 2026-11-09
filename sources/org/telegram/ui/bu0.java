package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class bu0 implements View.OnClickListener {
    public final int f44140a;
    public final ProfileActivity f44141b;

    public bu0(ProfileActivity profileActivity, int i7) {
        this.f44140a = i7;
        this.f44141b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f44140a;
        ProfileActivity profileActivity = this.f44141b;
        switch (i7) {
            case 0:
                ProfileActivity.k0(profileActivity);
                return;
            case 1:
                if (profileActivity.f41825s.getTag() == null) {
                    profileActivity.L4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.V6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.V6;
                profileActivity.o5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f41840u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.n3(profileActivity, profileActivity.f41715c0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41723d1)), profileActivity.f41840u2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.m0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.V6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f41730e1);
                bundle.putLong("user_id", profileActivity.f41723d1);
                profileActivity.presentFragment(new ai.s0(bundle));
                return;
            case 7:
                ProfileActivity.n0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.V6;
                profileActivity.n5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.V6;
                profileActivity.n5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.V6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (f2Var instanceof yw) {
                            yw ywVar = (yw) f2Var;
                            uv uvVar = ywVar.G3;
                            if (uvVar != null) {
                                org.telegram.ui.ActionBar.f2 fragment = uvVar.getFragment();
                                if ((fragment instanceof y91) && (-((y91) fragment).f52013a) == profileActivity.a()) {
                                    ywVar.G3.a();
                                }
                            }
                        } else if (f2Var instanceof cn) {
                            if (((cn) f2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if (f2Var instanceof y91) {
                            if ((-((y91) f2Var).f52013a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if ((f2Var instanceof ProfileActivity) && f2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) f2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f41804p1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.I1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f41730e1);
                HashSet hashSet = y91.f52012q1;
                profileActivity.presentFragment(y91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.V6;
                profileActivity.K4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.V6;
                profileActivity.K4(view);
                return;
        }
    }
}
