package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq0 implements Runnable {
    public final int f32674a;
    public final xu0 f32675b;
    public final TLRPC.TL_error f32676c;
    public final int d;
    public final int f32677e;
    public final TLObject f32678f;

    public xq0(xu0 xu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f32674a = i12;
        this.f32675b = xu0Var;
        this.f32676c = tL_error;
        this.d = i10;
        this.f32677e = i11;
        this.f32678f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32674a) {
            case 0:
                xu0 xu0Var = this.f32675b;
                NotificationCenter.getInstance(xu0Var.f32753v1.getCurrentAccount()).doOnIdle(new xq0(xu0Var, this.f32676c, this.d, this.f32677e, this.f32678f, 1));
                return;
            default:
                xu0 xu0Var2 = this.f32675b;
                mu0[] mu0VarArr = xu0Var2.f32749t1;
                if (this.f32676c == null) {
                    int i10 = this.f32677e;
                    mu0 mu0Var = mu0VarArr[i10];
                    if (this.d == mu0Var.f28556p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f32678f;
                        mu0Var.f28546e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f32007c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f32006b = tL_searchResultPosition.offset;
                                obj.f32005a = LocaleController.formatYearMont(i13, true);
                                mu0VarArr[i10].f28546e.add(obj);
                            }
                        }
                        Collections.sort(mu0VarArr[i10].f28546e, new org.telegram.ui.f6(19));
                        mu0 mu0Var2 = mu0VarArr[i10];
                        mu0Var2.f28547f[0] = tL_messages_searchResultsPositions.count;
                        mu0Var2.h = true;
                        if (!mu0Var2.f28546e.isEmpty()) {
                            while (true) {
                                qt0[] qt0VarArr = xu0Var2.f32729k0;
                                if (i11 < qt0VarArr.length) {
                                    qt0 qt0Var = qt0VarArr[i11];
                                    if (qt0Var.F == i10) {
                                        qt0Var.f29843b = true;
                                        xu0Var2.o1(qt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        xu0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
