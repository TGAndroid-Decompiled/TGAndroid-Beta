package org.telegram.ui;

import android.app.Activity;
public final class p81 extends org.telegram.ui.ActionBar.j {
    public final int f40704a;
    public final Object f40705b;

    public p81(Object obj, int i10) {
        this.f40704a = i10;
        this.f40705b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f40704a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.f40705b).finishFragment();
                    return;
                }
                return;
            case 1:
                i91 i91Var = (i91) this.f40705b;
                if (i10 == -1) {
                    i91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    i91Var.l0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((bb1) this.f40705b).finishFragment();
                    return;
                }
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f40705b;
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
                ce1 ce1Var = (ce1) this.f40705b;
                if (i10 == -1) {
                    ce1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ce1.Y(ce1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((ue1) this.f40705b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((lg1) this.f40705b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40705b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f40705b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f40705b;
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
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f40705b;
                if (i10 == -1) {
                    j8Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = j8Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) j8Var).currentAccount;
                    org.telegram.ui.Wallet.a5.u0(parentActivity, i11, j8Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    j8Var.o0();
                    return;
                } else {
                    return;
                }
            case 11:
                if (i10 == -1) {
                    ((rg.y0) this.f40705b).dismiss();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((xh.i4) this.f40705b).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((yh.g) this.f40705b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f40705b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
