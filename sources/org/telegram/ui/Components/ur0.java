package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ur0 implements Runnable {
    public final int f31048a;
    public final tv0 f31049b;
    public final TLRPC.TL_error f31050c;
    public final int d;
    public final int e;
    public final TLObject f31051f;

    public ur0(tv0 tv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f31048a = i12;
        this.f31049b = tv0Var;
        this.f31050c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f31051f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31048a) {
            case 0:
                tv0 tv0Var = this.f31049b;
                NotificationCenter.getInstance(tv0Var.f30732v1.getCurrentAccount()).doOnIdle(new ur0(tv0Var, this.f31050c, this.d, this.e, this.f31051f, 1));
                return;
            default:
                tv0 tv0Var2 = this.f31049b;
                iv0[] iv0VarArr = tv0Var2.f30728t1;
                if (this.f31050c == null) {
                    int i10 = this.e;
                    iv0 iv0Var = iv0VarArr[i10];
                    if (this.d == iv0Var.f27373p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f31051f;
                        iv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f30052c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f30051b = tL_searchResultPosition.offset;
                                obj.f30050a = LocaleController.formatYearMont(i13, true);
                                iv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(iv0VarArr[i10].e, new org.telegram.ui.ActionBar.i4(24));
                        iv0 iv0Var2 = iv0VarArr[i10];
                        iv0Var2.f27364f[0] = tL_messages_searchResultsPositions.count;
                        iv0Var2.h = true;
                        if (!iv0Var2.e.isEmpty()) {
                            while (true) {
                                mu0[] mu0VarArr = tv0Var2.f30708k0;
                                if (i11 < mu0VarArr.length) {
                                    mu0 mu0Var = mu0VarArr[i11];
                                    if (mu0Var.F == i10) {
                                        mu0Var.f28605b = true;
                                        tv0Var2.q1(mu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        tv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
