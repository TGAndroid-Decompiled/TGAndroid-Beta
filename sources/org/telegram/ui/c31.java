package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
public final class c31 extends org.telegram.ui.ActionBar.j {
    public final int f36238a;
    public final Object f36239b;

    public c31(Object obj, int i10) {
        this.f36238a = i10;
        this.f36239b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f36238a) {
            case 0:
                if (i10 == -1) {
                    ((e31) this.f36239b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f36239b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f36239b).e(true, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.f36239b).finishFragment();
                    return;
                }
                return;
            case 4:
                c81 c81Var = (c81) this.f36239b;
                if (i10 == -1) {
                    if (c81Var.M) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", c81Var.getUserConfig().getClientUserId());
                        bundle.putBoolean("immediate", true);
                        c81Var.presentFragment(new zh.n0(bundle));
                        return;
                    }
                    c81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    c81Var.n0(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((u91) this.f36239b).finishFragment();
                    return;
                }
                return;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.f36239b;
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
                uc1 uc1Var = (uc1) this.f36239b;
                if (i10 == -1) {
                    uc1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    uc1.Y(uc1Var);
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((md1) this.f36239b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((ef1) this.f36239b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36239b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f36239b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f36239b;
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
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) this.f36239b;
                if (i10 == -1) {
                    j9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = j9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) j9Var).currentAccount;
                    org.telegram.ui.Wallet.o5.E0(parentActivity, i11, j9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    j9Var.p0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((sg.y0) this.f36239b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((yh.g4) this.f36239b).finishFragment();
                    return;
                }
                return;
        }
    }
}
