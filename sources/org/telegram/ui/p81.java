package org.telegram.ui;
public final class p81 extends org.telegram.ui.ActionBar.j {
    public final int f39388a;
    public final Object f39389b;

    public p81(Object obj, int i10) {
        this.f39388a = i10;
        this.f39389b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f39388a) {
            case 0:
                y81 y81Var = (y81) this.f39389b;
                if (i10 == -1) {
                    y81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    y81Var.i0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((ta1) this.f39389b).finishFragment();
                    return;
                }
                return;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.f39389b;
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
                ud1 ud1Var = (ud1) this.f39389b;
                if (i10 == -1) {
                    ud1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ud1.X(ud1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((le1) this.f39389b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((cg1) this.f39389b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39389b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f39389b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f39389b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.W();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((rg.y0) this.f39389b).dismiss();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((xh.i4) this.f39389b).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((yh.h) this.f39389b).finishFragment();
                    return;
                }
                return;
            default:
                zg.o oVar = (zg.o) this.f39389b;
                if (i10 == -1 && !oVar.X(true)) {
                    oVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
