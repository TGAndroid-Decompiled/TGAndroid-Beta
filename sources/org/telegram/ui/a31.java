package org.telegram.ui;

import android.app.Activity;
public final class a31 extends org.telegram.ui.ActionBar.j {
    public final int f35283a;
    public final Object f35284b;

    public a31(Object obj, int i10) {
        this.f35283a = i10;
        this.f35284b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f35283a) {
            case 0:
                if (i10 == -1) {
                    ((c31) this.f35284b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f35284b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f35284b).e(true, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.f35284b).finishFragment();
                    return;
                }
                return;
            case 4:
                z71 z71Var = (z71) this.f35284b;
                if (i10 == -1) {
                    z71Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    z71Var.l0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((r91) this.f35284b).finishFragment();
                    return;
                }
                return;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.f35284b;
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
                qc1 qc1Var = (qc1) this.f35284b;
                if (i10 == -1) {
                    qc1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    qc1.Y(qc1Var);
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((id1) this.f35284b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((ze1) this.f35284b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35284b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f35284b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f35284b;
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
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.f35284b;
                if (i10 == -1) {
                    l9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = l9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) l9Var).currentAccount;
                    org.telegram.ui.Wallet.l5.C0(parentActivity, i11, l9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    l9Var.o0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((sg.x0) this.f35284b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((yh.h4) this.f35284b).finishFragment();
                    return;
                }
                return;
        }
    }
}
