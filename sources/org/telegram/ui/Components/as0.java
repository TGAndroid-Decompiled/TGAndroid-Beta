package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class as0 implements Runnable {
    public final int f26610a;
    public final aw0 f26611b;
    public final TLRPC.TL_error f26612c;
    public final int d;
    public final int e;
    public final TLObject f26613f;

    public as0(aw0 aw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26610a = i12;
        this.f26611b = aw0Var;
        this.f26612c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f26613f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26610a) {
            case 0:
                aw0 aw0Var = this.f26611b;
                NotificationCenter.getInstance(aw0Var.f26702x1.getCurrentAccount()).doOnIdle(new as0(aw0Var, this.f26612c, this.d, this.e, this.f26613f, 1));
                return;
            default:
                aw0 aw0Var2 = this.f26611b;
                pv0[] pv0VarArr = aw0Var2.f26696v1;
                if (this.f26612c == null) {
                    int i10 = this.e;
                    pv0 pv0Var = pv0VarArr[i10];
                    if (this.d == pv0Var.f31716p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26613f;
                        pv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f35408c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f35407b = tL_searchResultPosition.offset;
                                obj.f35406a = LocaleController.formatYearMont(i13, true);
                                pv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(pv0VarArr[i10].e, new org.telegram.ui.ActionBar.n4(24));
                        pv0 pv0Var2 = pv0VarArr[i10];
                        pv0Var2.f31707f[0] = tL_messages_searchResultsPositions.count;
                        pv0Var2.h = true;
                        if (!pv0Var2.e.isEmpty()) {
                            while (true) {
                                tu0[] tu0VarArr = aw0Var2.m0;
                                if (i11 < tu0VarArr.length) {
                                    tu0 tu0Var = tu0VarArr[i11];
                                    if (tu0Var.E == i10) {
                                        tu0Var.f33154b = true;
                                        aw0Var2.z1(tu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        aw0Var2.J.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
