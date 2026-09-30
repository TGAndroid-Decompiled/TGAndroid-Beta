package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr0 implements Runnable {
    public final int f26772a;
    public final mv0 f26773b;
    public final TLRPC.TL_error f26774c;
    public final int d;
    public final int e;
    public final TLObject f26775f;

    public nr0(mv0 mv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26772a = i12;
        this.f26773b = mv0Var;
        this.f26774c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f26775f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26772a) {
            case 0:
                mv0 mv0Var = this.f26773b;
                NotificationCenter.getInstance(mv0Var.f26449v1.getCurrentAccount()).doOnIdle(new nr0(mv0Var, this.f26774c, this.d, this.e, this.f26775f, 1));
                return;
            default:
                mv0 mv0Var2 = this.f26773b;
                bv0[] bv0VarArr = mv0Var2.f26445t1;
                if (this.f26774c == null) {
                    int i10 = this.e;
                    bv0 bv0Var = bv0VarArr[i10];
                    if (this.d == bv0Var.f23027p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26775f;
                        bv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f25828c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f25827b = tL_searchResultPosition.offset;
                                obj.f25826a = LocaleController.formatYearMont(i13, true);
                                bv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(bv0VarArr[i10].e, new org.telegram.ui.cf(17));
                        bv0 bv0Var2 = bv0VarArr[i10];
                        bv0Var2.f23018f[0] = tL_messages_searchResultsPositions.count;
                        bv0Var2.h = true;
                        if (!bv0Var2.e.isEmpty()) {
                            while (true) {
                                fu0[] fu0VarArr = mv0Var2.f26425k0;
                                if (i11 < fu0VarArr.length) {
                                    fu0 fu0Var = fu0VarArr[i11];
                                    if (fu0Var.F == i10) {
                                        fu0Var.f24352b = true;
                                        mv0Var2.o1(fu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        mv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
