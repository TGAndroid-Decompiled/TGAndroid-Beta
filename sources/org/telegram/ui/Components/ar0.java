package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar0 implements Runnable {
    public final int f23498a;
    public final yu0 f23499b;
    public final TLRPC.TL_error f23500c;
    public final int d;
    public final int e;
    public final TLObject f23501f;

    public ar0(yu0 yu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f23498a = i12;
        this.f23499b = yu0Var;
        this.f23500c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f23501f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f23498a) {
            case 0:
                yu0 yu0Var = this.f23499b;
                NotificationCenter.getInstance(yu0Var.f31144s1.getCurrentAccount()).doOnIdle(new ar0(yu0Var, this.f23500c, this.d, this.e, this.f23501f, 1));
                return;
            default:
                yu0 yu0Var2 = this.f23499b;
                nu0[] nu0VarArr = yu0Var2.f31138q1;
                if (this.f23500c == null) {
                    int i10 = this.e;
                    nu0 nu0Var = nu0VarArr[i10];
                    if (this.d == nu0Var.f27376p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f23501f;
                        nu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f30087c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f30086b = tL_searchResultPosition.offset;
                                obj.f30085a = LocaleController.formatYearMont(i13, true);
                                nu0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(nu0VarArr[i10].e, new nh.e4(28));
                        nu0 nu0Var2 = nu0VarArr[i10];
                        nu0Var2.f27367f[0] = tL_messages_searchResultsPositions.count;
                        nu0Var2.h = true;
                        if (!nu0Var2.e.isEmpty()) {
                            while (true) {
                                qt0[] qt0VarArr = yu0Var2.f31120h0;
                                if (i11 < qt0VarArr.length) {
                                    qt0 qt0Var = qt0VarArr[i11];
                                    if (qt0Var.C == i10) {
                                        qt0Var.f28238b = true;
                                        yu0Var2.o1(qt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        yu0Var2.E.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
