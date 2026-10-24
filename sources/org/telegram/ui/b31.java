package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
public final class b31 extends org.telegram.ui.ActionBar.j {
    public final int f35907a;
    public final Object f35908b;

    public b31(Object obj, int i10) {
        this.f35907a = i10;
        this.f35908b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f35907a) {
            case 0:
                if (i10 == -1) {
                    ((d31) this.f35908b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f35908b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f35908b).e(true, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.f35908b).finishFragment();
                    return;
                }
                return;
            case 4:
                b81 b81Var = (b81) this.f35908b;
                if (i10 == -1) {
                    if (b81Var.M) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", b81Var.getUserConfig().getClientUserId());
                        bundle.putBoolean("immediate", true);
                        b81Var.presentFragment(new zh.n0(bundle));
                        return;
                    }
                    b81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    b81Var.n0(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((t91) this.f35908b).finishFragment();
                    return;
                }
                return;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.f35908b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 7:
                tc1 tc1Var = (tc1) this.f35908b;
                if (i10 == -1) {
                    tc1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    tc1.Y(tc1Var);
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((ld1) this.f35908b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((df1) this.f35908b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35908b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 11:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f35908b;
                if (i10 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    userInfoActivity.c0(true);
                    return;
                } else {
                    return;
                }
            case 12:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f35908b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) this.f35908b;
                if (i10 == -1) {
                    j9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = j9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) j9Var).currentAccount;
                    org.telegram.ui.Wallet.o5.E0(parentActivity, i11, j9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    j9Var.p0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((sg.y0) this.f35908b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((yh.g4) this.f35908b).finishFragment();
                    return;
                }
                return;
        }
    }
}
