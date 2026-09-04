package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq0 implements Runnable {
    public final int f32647a;
    public final xu0 f32648b;
    public final TLRPC.TL_error f32649c;
    public final int d;
    public final int f32650e;
    public final TLObject f32651f;

    public xq0(xu0 xu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f32647a = i12;
        this.f32648b = xu0Var;
        this.f32649c = tL_error;
        this.d = i10;
        this.f32650e = i11;
        this.f32651f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32647a) {
            case 0:
                xu0 xu0Var = this.f32648b;
                NotificationCenter.getInstance(xu0Var.f32726v1.getCurrentAccount()).doOnIdle(new xq0(xu0Var, this.f32649c, this.d, this.f32650e, this.f32651f, 1));
                return;
            default:
                xu0 xu0Var2 = this.f32648b;
                mu0[] mu0VarArr = xu0Var2.f32722t1;
                if (this.f32649c == null) {
                    int i10 = this.f32650e;
                    mu0 mu0Var = mu0VarArr[i10];
                    if (this.d == mu0Var.f28529p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f32651f;
                        mu0Var.f28519e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f31980c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f31979b = tL_searchResultPosition.offset;
                                obj.f31978a = LocaleController.formatYearMont(i13, true);
                                mu0VarArr[i10].f28519e.add(obj);
                            }
                        }
                        Collections.sort(mu0VarArr[i10].f28519e, new org.telegram.ui.f6(19));
                        mu0 mu0Var2 = mu0VarArr[i10];
                        mu0Var2.f28520f[0] = tL_messages_searchResultsPositions.count;
                        mu0Var2.h = true;
                        if (!mu0Var2.f28519e.isEmpty()) {
                            while (true) {
                                qt0[] qt0VarArr = xu0Var2.f32702k0;
                                if (i11 < qt0VarArr.length) {
                                    qt0 qt0Var = qt0VarArr[i11];
                                    if (qt0Var.F == i10) {
                                        qt0Var.f29816b = true;
                                        xu0Var2.o1(qt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        xu0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
