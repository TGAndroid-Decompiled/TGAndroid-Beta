package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b91 extends org.telegram.ui.ActionBar.k {
    public final int f31197a;
    public final Object f31198b;

    public b91(Object obj, int i10) {
        this.f31197a = i10;
        this.f31198b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f31197a) {
            case 0:
                k91 k91Var = (k91) this.f31198b;
                if (i10 == -1) {
                    k91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    k91Var.l0(new org.telegram.ui.ActionBar.p2(null));
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((fb1) this.f31198b).finishFragment();
                    return;
                }
                return;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.f31198b;
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
                fe1 fe1Var = (fe1) this.f31198b;
                if (i10 == -1) {
                    fe1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    fe1.Y(fe1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((xe1) this.f31198b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((og1) this.f31198b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f31198b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f31198b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f31198b;
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
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.f31198b;
                if (i10 == -1) {
                    if (org.telegram.ui.web.h1.Y(h1Var).s()) {
                        org.telegram.ui.web.h1.Z(h1Var).r();
                        h1Var.f37946s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) h1Var.f25171a, (e2.h) new gg.g0(28));
                        return;
                    }
                    h1Var.finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((qg.a1) this.f31198b).dismiss();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((wh.h4) this.f31198b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((xh.h) this.f31198b).finishFragment();
                    return;
                }
                return;
            default:
                yg.s sVar = (yg.s) this.f31198b;
                if (i10 == -1 && !sVar.X(true)) {
                    sVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
