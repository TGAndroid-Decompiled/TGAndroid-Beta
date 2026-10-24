package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xr0 implements Runnable {
    public final int f32689a;
    public final wv0 f32690b;
    public final TLRPC.TL_error f32691c;
    public final int d;
    public final int e;
    public final TLObject f32692f;

    public xr0(wv0 wv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f32689a = i12;
        this.f32690b = wv0Var;
        this.f32691c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f32692f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32689a) {
            case 0:
                wv0 wv0Var = this.f32690b;
                NotificationCenter.getInstance(wv0Var.f32410v1.getCurrentAccount()).doOnIdle(new xr0(wv0Var, this.f32691c, this.d, this.e, this.f32692f, 1));
                return;
            default:
                wv0 wv0Var2 = this.f32690b;
                lv0[] lv0VarArr = wv0Var2.f32406t1;
                if (this.f32691c == null) {
                    int i10 = this.e;
                    lv0 lv0Var = lv0VarArr[i10];
                    if (this.d == lv0Var.f28451p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f32692f;
                        lv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f31228c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f31227b = tL_searchResultPosition.offset;
                                obj.f31226a = LocaleController.formatYearMont(i13, true);
                                lv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(lv0VarArr[i10].e, new org.telegram.ui.ActionBar.l4(24));
                        lv0 lv0Var2 = lv0VarArr[i10];
                        lv0Var2.f28442f[0] = tL_messages_searchResultsPositions.count;
                        lv0Var2.h = true;
                        if (!lv0Var2.e.isEmpty()) {
                            while (true) {
                                pu0[] pu0VarArr = wv0Var2.f32386k0;
                                if (i11 < pu0VarArr.length) {
                                    pu0 pu0Var = pu0VarArr[i11];
                                    if (pu0Var.F == i10) {
                                        pu0Var.f29673b = true;
                                        wv0Var2.s1(pu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        wv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
