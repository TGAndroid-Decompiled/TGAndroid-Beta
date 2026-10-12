package org.telegram.ui;

import android.app.Activity;
public final class f51 extends org.telegram.ui.ActionBar.j {
    public final int f37640a;
    public final Object f37641b;

    public f51(Object obj, int i10) {
        this.f37640a = i10;
        this.f37641b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f37640a) {
            case 0:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f37641b).e(true, false);
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SessionsActivity) this.f37641b).finishFragment();
                    return;
                }
                return;
            case 2:
                k91 k91Var = (k91) this.f37641b;
                if (i10 == -1) {
                    k91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    k91Var.l0(new org.telegram.ui.ActionBar.m2(null));
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((db1) this.f37641b).finishFragment();
                    return;
                }
                return;
            case 4:
                StickersActivity stickersActivity = (StickersActivity) this.f37641b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 5:
                ee1 ee1Var = (ee1) this.f37641b;
                if (i10 == -1) {
                    ee1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ee1.Y(ee1Var);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((we1) this.f37641b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((ng1) this.f37641b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37641b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 9:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f37641b;
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
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37641b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 11:
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) this.f37641b;
                if (i10 == -1) {
                    l8Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = l8Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) l8Var).currentAccount;
                    org.telegram.ui.Wallet.c5.u0(parentActivity, i11, l8Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    l8Var.o0();
                    return;
                } else {
                    return;
                }
            case 12:
                if (i10 == -1) {
                    ((rg.y0) this.f37641b).dismiss();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((xh.h4) this.f37641b).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((yh.g) this.f37641b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f37641b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
