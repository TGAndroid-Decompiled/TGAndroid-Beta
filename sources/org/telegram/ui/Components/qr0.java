package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qr0 implements Runnable {
    public final int f30189a;
    public final qv0 f30190b;
    public final TLRPC.TL_error f30191c;
    public final int d;
    public final int f30192e;
    public final TLObject f30193f;

    public qr0(qv0 qv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f30189a = i12;
        this.f30190b = qv0Var;
        this.f30191c = tL_error;
        this.d = i10;
        this.f30192e = i11;
        this.f30193f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f30189a) {
            case 0:
                qv0 qv0Var = this.f30190b;
                NotificationCenter.getInstance(qv0Var.f30263v1.getCurrentAccount()).doOnIdle(new qr0(qv0Var, this.f30191c, this.d, this.f30192e, this.f30193f, 1));
                return;
            default:
                qv0 qv0Var2 = this.f30190b;
                fv0[] fv0VarArr = qv0Var2.f30259t1;
                if (this.f30191c == null) {
                    int i10 = this.f30192e;
                    fv0 fv0Var = fv0VarArr[i10];
                    if (this.d == fv0Var.f26604p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f30193f;
                        fv0Var.f26594e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f29552c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f29551b = tL_searchResultPosition.offset;
                                obj.f29550a = LocaleController.formatYearMont(i13, true);
                                fv0VarArr[i10].f26594e.add(obj);
                            }
                        }
                        Collections.sort(fv0VarArr[i10].f26594e, new org.telegram.ui.ff(17));
                        fv0 fv0Var2 = fv0VarArr[i10];
                        fv0Var2.f26595f[0] = tL_messages_searchResultsPositions.count;
                        fv0Var2.h = true;
                        if (!fv0Var2.f26594e.isEmpty()) {
                            while (true) {
                                ju0[] ju0VarArr = qv0Var2.f30239k0;
                                if (i11 < ju0VarArr.length) {
                                    ju0 ju0Var = ju0VarArr[i11];
                                    if (ju0Var.F == i10) {
                                        ju0Var.f27972b = true;
                                        qv0Var2.o1(ju0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        qv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
