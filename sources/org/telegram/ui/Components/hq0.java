package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class hq0 implements Runnable {

    public final int f29083a;

    public final hu0 f29084b;

    public final TLRPC.TL_error f29085c;
    public final int d;

    public final int f29086e;

    public final TLObject f29087f;

    public hq0(hu0 hu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f29083a = i12;
        this.f29084b = hu0Var;
        this.f29085c = tL_error;
        this.d = i10;
        this.f29086e = i11;
        this.f29087f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29083a) {
            case 0:
                hu0 hu0Var = this.f29084b;
                NotificationCenter.getInstance(hu0Var.f29145r1.getCurrentAccount()).doOnIdle(new hq0(hu0Var, this.f29085c, this.d, this.f29086e, this.f29087f, 1));
                break;
            default:
                hu0 hu0Var2 = this.f29084b;
                wt0[] wt0VarArr = hu0Var2.f29140p1;
                if (this.f29085c == null) {
                    int i10 = this.f29086e;
                    wt0 wt0Var = wt0VarArr[i10];
                    if (this.d == wt0Var.f34338p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f29087f;
                        wt0Var.f34328e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                et0 et0Var = new et0();
                                et0Var.f28151c = i13;
                                et0Var.d = tL_searchResultPosition.msg_id;
                                et0Var.f28150b = tL_searchResultPosition.offset;
                                et0Var.f28149a = LocaleController.formatYearMont(i13, true);
                                wt0VarArr[i10].f34328e.add(et0Var);
                            }
                        }
                        Collections.sort(wt0VarArr[i10].f34328e, new lp0(1));
                        wt0 wt0Var2 = wt0VarArr[i10];
                        wt0Var2.f34329f[0] = tL_messages_searchResultsPositions.count;
                        wt0Var2.h = true;
                        if (!wt0Var2.f34328e.isEmpty()) {
                            while (true) {
                                zs0[] zs0VarArr = hu0Var2.f29122g0;
                                if (i11 < zs0VarArr.length) {
                                    zs0 zs0Var = zs0VarArr[i11];
                                    if (zs0Var.B == i10) {
                                        zs0Var.f35335b = true;
                                        hu0Var2.o1(zs0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        hu0Var2.D.l();
                        break;
                    }
                }
                break;
        }
    }
}
