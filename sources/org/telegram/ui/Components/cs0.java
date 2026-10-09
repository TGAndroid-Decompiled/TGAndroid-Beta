package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cs0 implements Runnable {
    public final int f25499a;
    public final bw0 f25500b;
    public final TLRPC.TL_error f25501c;
    public final int d;
    public final int f25502e;
    public final TLObject f25503f;

    public cs0(bw0 bw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f25499a = i12;
        this.f25500b = bw0Var;
        this.f25501c = tL_error;
        this.d = i10;
        this.f25502e = i11;
        this.f25503f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25499a) {
            case 0:
                bw0 bw0Var = this.f25500b;
                NotificationCenter.getInstance(bw0Var.f25166v1.getCurrentAccount()).doOnIdle(new cs0(bw0Var, this.f25501c, this.d, this.f25502e, this.f25503f, 1));
                return;
            default:
                bw0 bw0Var2 = this.f25500b;
                qv0[] qv0VarArr = bw0Var2.f25162t1;
                if (this.f25501c == null) {
                    int i10 = this.f25502e;
                    qv0 qv0Var = qv0VarArr[i10];
                    if (this.d == qv0Var.f30287p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f25503f;
                        qv0Var.f30277e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f33662c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f33661b = tL_searchResultPosition.offset;
                                obj.f33660a = LocaleController.formatYearMont(i13, true);
                                qv0VarArr[i10].f30277e.add(obj);
                            }
                        }
                        Collections.sort(qv0VarArr[i10].f30277e, new org.telegram.ui.gf(17));
                        qv0 qv0Var2 = qv0VarArr[i10];
                        qv0Var2.f30278f[0] = tL_messages_searchResultsPositions.count;
                        qv0Var2.h = true;
                        if (!qv0Var2.f30277e.isEmpty()) {
                            while (true) {
                                uu0[] uu0VarArr = bw0Var2.f25142k0;
                                if (i11 < uu0VarArr.length) {
                                    uu0 uu0Var = uu0VarArr[i11];
                                    if (uu0Var.F == i10) {
                                        uu0Var.f31620b = true;
                                        bw0Var2.o1(uu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        bw0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
