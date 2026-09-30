package org.telegram.ui;
public final class f81 extends org.telegram.ui.ActionBar.j {
    public final int f33580a;
    public final Object f33581b;

    public f81(Object obj, int i10) {
        this.f33580a = i10;
        this.f33581b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f33580a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.f33581b).finishFragment();
                    return;
                }
                return;
            case 1:
                z81 z81Var = (z81) this.f33581b;
                if (i10 == -1) {
                    z81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    z81Var.l0(new org.telegram.ui.ActionBar.m2(null));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((sa1) this.f33581b).finishFragment();
                    return;
                }
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f33581b;
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
                td1 td1Var = (td1) this.f33581b;
                if (i10 == -1) {
                    td1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    td1.Y(td1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((le1) this.f33581b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((cg1) this.f33581b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f33581b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f33581b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f33581b;
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
                if (i10 == -1) {
                    ((rg.x0) this.f33581b).dismiss();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((xh.i4) this.f33581b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.f33581b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f33581b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
