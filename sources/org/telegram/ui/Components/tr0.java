package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tr0 implements Runnable {
    public final int f30701a;
    public final sv0 f30702b;
    public final TLRPC.TL_error f30703c;
    public final int d;
    public final int e;
    public final TLObject f30704f;

    public tr0(sv0 sv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f30701a = i12;
        this.f30702b = sv0Var;
        this.f30703c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f30704f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f30701a) {
            case 0:
                sv0 sv0Var = this.f30702b;
                NotificationCenter.getInstance(sv0Var.f30388v1.getCurrentAccount()).doOnIdle(new tr0(sv0Var, this.f30703c, this.d, this.e, this.f30704f, 1));
                return;
            default:
                sv0 sv0Var2 = this.f30702b;
                hv0[] hv0VarArr = sv0Var2.f30384t1;
                if (this.f30703c == null) {
                    int i10 = this.e;
                    hv0 hv0Var = hv0VarArr[i10];
                    if (this.d == hv0Var.f26954p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f30704f;
                        hv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f29755c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f29754b = tL_searchResultPosition.offset;
                                obj.f29753a = LocaleController.formatYearMont(i13, true);
                                hv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(hv0VarArr[i10].e, new org.telegram.ui.ActionBar.i4(24));
                        hv0 hv0Var2 = hv0VarArr[i10];
                        hv0Var2.f26945f[0] = tL_messages_searchResultsPositions.count;
                        hv0Var2.h = true;
                        if (!hv0Var2.e.isEmpty()) {
                            while (true) {
                                lu0[] lu0VarArr = sv0Var2.f30364k0;
                                if (i11 < lu0VarArr.length) {
                                    lu0 lu0Var = lu0VarArr[i11];
                                    if (lu0Var.F == i10) {
                                        lu0Var.f28328b = true;
                                        sv0Var2.q1(lu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        sv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
