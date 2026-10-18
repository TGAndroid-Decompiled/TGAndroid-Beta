package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
public final class a31 extends org.telegram.ui.ActionBar.j {
    public final int f35255a;
    public final Object f35256b;

    public a31(Object obj, int i10) {
        this.f35255a = i10;
        this.f35256b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f35255a) {
            case 0:
                if (i10 == -1) {
                    ((c31) this.f35256b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f35256b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f35256b).e(true, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.f35256b).finishFragment();
                    return;
                }
                return;
            case 4:
                z71 z71Var = (z71) this.f35256b;
                if (i10 == -1) {
                    if (z71Var.M) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", z71Var.getUserConfig().getClientUserId());
                        bundle.putBoolean("immediate", true);
                        z71Var.presentFragment(new zh.f0(bundle));
                        return;
                    }
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
                    ((r91) this.f35256b).finishFragment();
                    return;
                }
                return;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.f35256b;
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
                qc1 qc1Var = (qc1) this.f35256b;
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
                    ((id1) this.f35256b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((ze1) this.f35256b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f35256b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f35256b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f35256b;
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
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f35256b;
                if (i10 == -1) {
                    i9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = i9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) i9Var).currentAccount;
                    org.telegram.ui.Wallet.n5.D0(parentActivity, i11, i9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    i9Var.o0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((sg.y0) this.f35256b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((yh.g4) this.f35256b).finishFragment();
                    return;
                }
                return;
        }
    }
}
