package org.telegram.ui;
public final class h81 extends org.telegram.ui.ActionBar.j {
    public final int f36999a;
    public final Object f37000b;

    public h81(Object obj, int i10) {
        this.f36999a = i10;
        this.f37000b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f36999a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.f37000b).finishFragment();
                    return;
                }
                return;
            case 1:
                a91 a91Var = (a91) this.f37000b;
                if (i10 == -1) {
                    a91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    a91Var.k0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((va1) this.f37000b).finishFragment();
                    return;
                }
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f37000b;
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
                wd1 wd1Var = (wd1) this.f37000b;
                if (i10 == -1) {
                    wd1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    wd1.X(wd1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((ne1) this.f37000b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((eg1) this.f37000b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37000b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f37000b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37000b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.W();
                    return;
                } else {
                    return;
                }
            case 10:
                if (i10 == -1) {
                    ((rg.y0) this.f37000b).dismiss();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((xh.i4) this.f37000b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.f37000b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f37000b;
                if (i10 == -1 && !qVar.W(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
