package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class es0 implements Runnable {
    public final int f26126a;
    public final dw0 f26127b;
    public final TLRPC.TL_error f26128c;
    public final int d;
    public final int f26129e;
    public final TLObject f26130f;

    public es0(dw0 dw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26126a = i12;
        this.f26127b = dw0Var;
        this.f26128c = tL_error;
        this.d = i10;
        this.f26129e = i11;
        this.f26130f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26126a) {
            case 0:
                dw0 dw0Var = this.f26127b;
                NotificationCenter.getInstance(dw0Var.f25735v1.getCurrentAccount()).doOnIdle(new es0(dw0Var, this.f26128c, this.d, this.f26129e, this.f26130f, 1));
                return;
            default:
                dw0 dw0Var2 = this.f26127b;
                sv0[] sv0VarArr = dw0Var2.f25731t1;
                if (this.f26128c == null) {
                    int i10 = this.f26129e;
                    sv0 sv0Var = sv0VarArr[i10];
                    if (this.d == sv0Var.f30880p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26130f;
                        sv0Var.f30870e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f25030c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f25029b = tL_searchResultPosition.offset;
                                obj.f25028a = LocaleController.formatYearMont(i13, true);
                                sv0VarArr[i10].f30870e.add(obj);
                            }
                        }
                        Collections.sort(sv0VarArr[i10].f30870e, new org.telegram.ui.ff(17));
                        sv0 sv0Var2 = sv0VarArr[i10];
                        sv0Var2.f30871f[0] = tL_messages_searchResultsPositions.count;
                        sv0Var2.h = true;
                        if (!sv0Var2.f30870e.isEmpty()) {
                            while (true) {
                                wu0[] wu0VarArr = dw0Var2.f25711k0;
                                if (i11 < wu0VarArr.length) {
                                    wu0 wu0Var = wu0VarArr[i11];
                                    if (wu0Var.F == i10) {
                                        wu0Var.f32739b = true;
                                        dw0Var2.o1(wu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        dw0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
