package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o81 extends org.telegram.ui.ActionBar.j {
    public final int f36207a;
    public final Object f36208b;

    public o81(Object obj, int i10) {
        this.f36207a = i10;
        this.f36208b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f36207a) {
            case 0:
                if (i10 == -1) {
                    ((SessionsActivity) this.f36208b).finishFragment();
                    return;
                }
                return;
            case 1:
                i91 i91Var = (i91) this.f36208b;
                if (i10 == -1) {
                    i91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    i91Var.l0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 2:
                if (i10 == -1) {
                    ((bb1) this.f36208b).finishFragment();
                    return;
                }
                return;
            case 3:
                StickersActivity stickersActivity = (StickersActivity) this.f36208b;
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
                ce1 ce1Var = (ce1) this.f36208b;
                if (i10 == -1) {
                    ce1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ce1.Y(ce1Var);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((ue1) this.f36208b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((lg1) this.f36208b).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f36208b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f36208b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f36208b;
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
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) this.f36208b;
                if (i10 == -1) {
                    if (org.telegram.ui.web.i1.Y(i1Var).s()) {
                        org.telegram.ui.web.i1.Z(i1Var).r();
                        i1Var.v.clear();
                        AndroidUtilities.forEachViews((RecyclerView) i1Var.f26598a, (e2.h) new org.telegram.ui.web.m(1));
                        return;
                    }
                    i1Var.finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((rg.x0) this.f36208b).dismiss();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((xh.i4) this.f36208b).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((yh.g) this.f36208b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f36208b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
