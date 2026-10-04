package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr0 implements Runnable {
    public final int f29731a;
    public final pv0 f29732b;
    public final TLRPC.TL_error f29733c;
    public final int d;
    public final int f29734e;
    public final TLObject f29735f;

    public pr0(pv0 pv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f29731a = i12;
        this.f29732b = pv0Var;
        this.f29733c = tL_error;
        this.d = i10;
        this.f29734e = i11;
        this.f29735f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29731a) {
            case 0:
                pv0 pv0Var = this.f29732b;
                NotificationCenter.getInstance(pv0Var.f29801v1.getCurrentAccount()).doOnIdle(new pr0(pv0Var, this.f29733c, this.d, this.f29734e, this.f29735f, 1));
                return;
            default:
                pv0 pv0Var2 = this.f29732b;
                ev0[] ev0VarArr = pv0Var2.f29797t1;
                if (this.f29733c == null) {
                    int i10 = this.f29734e;
                    ev0 ev0Var = ev0VarArr[i10];
                    if (this.d == ev0Var.f26152p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f29735f;
                        ev0Var.f26142e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f29066c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f29065b = tL_searchResultPosition.offset;
                                obj.f29064a = LocaleController.formatYearMont(i13, true);
                                ev0VarArr[i10].f26142e.add(obj);
                            }
                        }
                        Collections.sort(ev0VarArr[i10].f26142e, new org.telegram.ui.ff(17));
                        ev0 ev0Var2 = ev0VarArr[i10];
                        ev0Var2.f26143f[0] = tL_messages_searchResultsPositions.count;
                        ev0Var2.h = true;
                        if (!ev0Var2.f26142e.isEmpty()) {
                            while (true) {
                                iu0[] iu0VarArr = pv0Var2.f29777k0;
                                if (i11 < iu0VarArr.length) {
                                    iu0 iu0Var = iu0VarArr[i11];
                                    if (iu0Var.F == i10) {
                                        iu0Var.f27497b = true;
                                        pv0Var2.o1(iu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        pv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
