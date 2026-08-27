package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class ed1 extends org.telegram.ui.ActionBar.j {

    public final int f37735a;

    public final org.telegram.ui.ActionBar.n2 f37736b;

    public ed1(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37735a = i10;
        this.f37736b = n2Var;
    }

    @Override
    public final void b(int i10) {
        switch (this.f37735a) {
            case 0:
                if (i10 == -1) {
                    ((ld1) this.f37736b).finishFragment();
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((cf1) this.f37736b).finishFragment();
                }
                break;
            case 2:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f37736b;
                    if (twoStepVerificationActivity.T < 0) {
                        twoStepVerificationActivity.finishFragment();
                    } else {
                        twoStepVerificationActivity.x0();
                    }
                }
                break;
            case 3:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.c0(true);
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                }
                break;
            case 4:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f37736b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                }
                break;
            case 5:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.f37736b;
                if (i10 == -1) {
                    if (!((org.telegram.ui.ActionBar.n2) d1Var).actionBar.t()) {
                        d1Var.finishFragment();
                    } else {
                        ((org.telegram.ui.ActionBar.n2) d1Var).actionBar.s();
                        d1Var.f43810s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) d1Var.f28261a, (d5.d) new j4.w0(15));
                    }
                }
                break;
            case 6:
                qf.e eVar = (qf.e) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        eVar.X();
                    }
                } else if (eVar.onBackPressed(true)) {
                    eVar.finishFragment();
                }
                break;
            case 7:
                qf.m mVar = (qf.m) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        mVar.h0();
                    }
                } else if (mVar.onBackPressed(true)) {
                    mVar.finishFragment();
                }
                break;
            case 8:
                qf.m0 m0Var = (qf.m0) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        m0Var.a0();
                    }
                } else if (m0Var.onBackPressed(true)) {
                    m0Var.finishFragment();
                }
                break;
            case 9:
                qf.o0 o0Var = (qf.o0) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        o0Var.X();
                    }
                } else if (o0Var.onBackPressed(true)) {
                    o0Var.finishFragment();
                }
                break;
            case 10:
                qf.w0 w0Var = (qf.w0) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        w0Var.W();
                    }
                } else if (w0Var.onBackPressed(true)) {
                    w0Var.finishFragment();
                }
                break;
            case 11:
                qf.y0 y0Var = (qf.y0) this.f37736b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        y0Var.d0();
                    }
                } else if (y0Var.onBackPressed(true)) {
                    y0Var.finishFragment();
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((qf.a1) this.f37736b).finishFragment();
                }
                break;
            default:
                if (i10 == -1) {
                    ((qf.s1) this.f37736b).finishFragment();
                }
                break;
        }
    }
}
