package org.telegram.ui;
public final class h81 extends org.telegram.ui.ActionBar.j {
    public final int f34164a;
    public final Object f34165b;

    public h81(Object obj, int i10) {
        this.f34164a = i10;
        this.f34165b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f34164a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.f34165b).finishFragment();
                    return;
                }
                return;
            case 1:
                a91 a91Var = (a91) this.f34165b;
                if (i10 == -1) {
                    a91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    a91Var.m0(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((ra1) this.f34165b).finishFragment();
                    return;
                }
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f34165b;
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
                ud1 ud1Var = (ud1) this.f34165b;
                if (i10 == -1) {
                    ud1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ud1.Y(ud1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((le1) this.f34165b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((cg1) this.f34165b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f34165b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f34165b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f34165b;
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
                    ((rg.x0) this.f34165b).dismiss();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((xh.j4) this.f34165b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.f34165b).finishFragment();
                    return;
                }
                return;
            default:
                zg.r rVar = (zg.r) this.f34165b;
                if (i10 == -1 && !rVar.X(true)) {
                    rVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
