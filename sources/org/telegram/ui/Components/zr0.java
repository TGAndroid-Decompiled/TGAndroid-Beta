package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zr0 implements Runnable {
    public final int f31975a;
    public final xv0 f31976b;
    public final TLRPC.TL_error f31977c;
    public final int d;
    public final int e;
    public final TLObject f31978f;

    public zr0(xv0 xv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f31975a = i12;
        this.f31976b = xv0Var;
        this.f31977c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f31978f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31975a) {
            case 0:
                xv0 xv0Var = this.f31976b;
                NotificationCenter.getInstance(xv0Var.f31388v1.getCurrentAccount()).doOnIdle(new zr0(xv0Var, this.f31977c, this.d, this.e, this.f31978f, 1));
                return;
            default:
                xv0 xv0Var2 = this.f31976b;
                mv0[] mv0VarArr = xv0Var2.f31384t1;
                if (this.f31977c == null) {
                    int i10 = this.e;
                    mv0 mv0Var = mv0VarArr[i10];
                    if (this.d == mv0Var.f27520p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f31978f;
                        mv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f30661c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f30660b = tL_searchResultPosition.offset;
                                obj.f30659a = LocaleController.formatYearMont(i13, true);
                                mv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(mv0VarArr[i10].e, new org.telegram.ui.ActionBar.l5(21));
                        mv0 mv0Var2 = mv0VarArr[i10];
                        mv0Var2.f27511f[0] = tL_messages_searchResultsPositions.count;
                        mv0Var2.h = true;
                        if (!mv0Var2.e.isEmpty()) {
                            while (true) {
                                qu0[] qu0VarArr = xv0Var2.f31364k0;
                                if (i11 < qu0VarArr.length) {
                                    qu0 qu0Var = qu0VarArr[i11];
                                    if (qu0Var.F == i10) {
                                        qu0Var.f28676b = true;
                                        xv0Var2.o1(qu0Var, true);
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
