package org.telegram.ui;

import android.app.Activity;
public final class o81 extends org.telegram.ui.ActionBar.j {
    public final int f40480a;
    public final Object f40481b;

    public o81(Object obj, int i10) {
        this.f40480a = i10;
        this.f40481b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f40480a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.f40481b).finishFragment();
                    return;
                }
                return;
            case 1:
                h91 h91Var = (h91) this.f40481b;
                if (i10 == -1) {
                    h91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    h91Var.l0(new org.telegram.ui.ActionBar.m2(null));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((ab1) this.f40481b).finishFragment();
                    return;
                }
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f40481b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 4:
                be1 be1Var = (be1) this.f40481b;
                if (i10 == -1) {
                    be1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    be1.Y(be1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((te1) this.f40481b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((kg1) this.f40481b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40481b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 8:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f40481b;
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
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f40481b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 10:
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) this.f40481b;
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
            case 11:
                if (i10 == -1) {
                    ((rg.y0) this.f40481b).dismiss();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((xh.i4) this.f40481b).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((yh.g) this.f40481b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f40481b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
