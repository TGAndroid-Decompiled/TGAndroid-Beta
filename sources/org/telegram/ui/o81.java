package org.telegram.ui;
public final class o81 extends org.telegram.ui.ActionBar.j {
    public final int f35711a;
    public final Object f35712b;

    public o81(Object obj, int i10) {
        this.f35711a = i10;
        this.f35712b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f35711a) {
            case 0:
                x81 x81Var = (x81) this.f35712b;
                if (i10 == -1) {
                    x81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    x81Var.l0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((ra1) this.f35712b).finishFragment();
                    return;
                }
                return;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.f35712b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 3:
                td1 td1Var = (td1) this.f35712b;
                if (i10 == -1) {
                    td1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    td1.Y(td1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((le1) this.f35712b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((cg1) this.f35712b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35712b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 7:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f35712b;
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
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f35712b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((rg.x0) this.f35712b).dismiss();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((xh.i4) this.f35712b).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((yh.g) this.f35712b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f35712b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
