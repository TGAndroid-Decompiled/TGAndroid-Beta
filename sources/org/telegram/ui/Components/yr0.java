package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yr0 implements Runnable {
    public final int f33029a;
    public final xv0 f33030b;
    public final TLRPC.TL_error f33031c;
    public final int d;
    public final int e;
    public final TLObject f33032f;

    public yr0(xv0 xv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f33029a = i12;
        this.f33030b = xv0Var;
        this.f33031c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f33032f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33029a) {
            case 0:
                xv0 xv0Var = this.f33030b;
                NotificationCenter.getInstance(xv0Var.f32711v1.getCurrentAccount()).doOnIdle(new yr0(xv0Var, this.f33031c, this.d, this.e, this.f33032f, 1));
                return;
            default:
                xv0 xv0Var2 = this.f33030b;
                mv0[] mv0VarArr = xv0Var2.f32707t1;
                if (this.f33031c == null) {
                    int i10 = this.e;
                    mv0 mv0Var = mv0VarArr[i10];
                    if (this.d == mv0Var.f28769p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f33032f;
                        mv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f32056c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f32055b = tL_searchResultPosition.offset;
                                obj.f32054a = LocaleController.formatYearMont(i13, true);
                                mv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(mv0VarArr[i10].e, new org.telegram.ui.ActionBar.l4(24));
                        mv0 mv0Var2 = mv0VarArr[i10];
                        mv0Var2.f28760f[0] = tL_messages_searchResultsPositions.count;
                        mv0Var2.h = true;
                        if (!mv0Var2.e.isEmpty()) {
                            while (true) {
                                qu0[] qu0VarArr = xv0Var2.f32687k0;
                                if (i11 < qu0VarArr.length) {
                                    qu0 qu0Var = qu0VarArr[i11];
                                    if (qu0Var.F == i10) {
                                        qu0Var.f30000b = true;
                                        xv0Var2.s1(qu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        xv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
