package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ds0 implements Runnable {
    public final int f25866a;
    public final cw0 f25867b;
    public final TLRPC.TL_error f25868c;
    public final int d;
    public final int f25869e;
    public final TLObject f25870f;

    public ds0(cw0 cw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f25866a = i12;
        this.f25867b = cw0Var;
        this.f25868c = tL_error;
        this.d = i10;
        this.f25869e = i11;
        this.f25870f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25866a) {
            case 0:
                cw0 cw0Var = this.f25867b;
                NotificationCenter.getInstance(cw0Var.f25536v1.getCurrentAccount()).doOnIdle(new ds0(cw0Var, this.f25868c, this.d, this.f25869e, this.f25870f, 1));
                return;
            default:
                cw0 cw0Var2 = this.f25867b;
                rv0[] rv0VarArr = cw0Var2.f25532t1;
                if (this.f25868c == null) {
                    int i10 = this.f25869e;
                    rv0 rv0Var = rv0VarArr[i10];
                    if (this.d == rv0Var.f30650p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f25870f;
                        rv0Var.f30640e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f24692c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f24691b = tL_searchResultPosition.offset;
                                obj.f24690a = LocaleController.formatYearMont(i13, true);
                                rv0VarArr[i10].f30640e.add(obj);
                            }
                        }
                        Collections.sort(rv0VarArr[i10].f30640e, new org.telegram.ui.ff(17));
                        rv0 rv0Var2 = rv0VarArr[i10];
                        rv0Var2.f30641f[0] = tL_messages_searchResultsPositions.count;
                        rv0Var2.h = true;
                        if (!rv0Var2.f30640e.isEmpty()) {
                            while (true) {
                                vu0[] vu0VarArr = cw0Var2.f25512k0;
                                if (i11 < vu0VarArr.length) {
                                    vu0 vu0Var = vu0VarArr[i11];
                                    if (vu0Var.F == i10) {
                                        vu0Var.f32551b = true;
                                        cw0Var2.o1(vu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        cw0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
