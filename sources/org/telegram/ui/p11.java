package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
public final class p11 extends org.telegram.ui.ActionBar.j {
    public final int f42321a;
    public final Object f42322b;

    public p11(Object obj, int i10) {
        this.f42321a = i10;
        this.f42322b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f42321a) {
            case 0:
                if (i10 == -1) {
                    ((ProxyListActivity) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((g21) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((y21) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((g31) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f42322b).e(true, false);
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((SessionsActivity) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 7:
                d81 d81Var = (d81) this.f42322b;
                if (i10 == -1) {
                    if (d81Var.N) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", d81Var.getUserConfig().getClientUserId());
                        bundle.putBoolean("immediate", true);
                        d81Var.presentFragment(new ai.z0(bundle));
                        return;
                    }
                    d81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    d81Var.j0(new org.telegram.ui.ActionBar.r2(null));
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((w91) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 9:
                StickersActivity stickersActivity = (StickersActivity) this.f42322b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.e0(stickersActivity, i10);
                return;
            case 10:
                xc1 xc1Var = (xc1) this.f42322b;
                if (i10 == -1) {
                    xc1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    xc1.Z(xc1Var);
                    return;
                } else {
                    return;
                }
            case 11:
                if (i10 == -1) {
                    ((pd1) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((gf1) this.f42322b).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42322b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.y0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 14:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f42322b;
                if (i10 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    userInfoActivity.d0(true);
                    return;
                } else {
                    return;
                }
            case 15:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f42322b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.Y();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f42322b;
                if (i10 == -1) {
                    i9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = i9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.r2) i9Var).currentAccount;
                    org.telegram.ui.Wallet.m5.F0(parentActivity, i11, i9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    i9Var.q0();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i10 == -1) {
                    ((tg.y0) this.f42322b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((zh.h4) this.f42322b).finishFragment();
                    return;
                }
                return;
        }
    }
}
