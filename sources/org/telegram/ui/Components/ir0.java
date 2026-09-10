package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir0 implements Runnable {
    public final int f24068a;
    public final iv0 f24069b;
    public final TLRPC.TL_error f24070c;
    public final int d;
    public final int e;
    public final TLObject f24071f;

    public ir0(iv0 iv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f24068a = i12;
        this.f24069b = iv0Var;
        this.f24070c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f24071f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24068a) {
            case 0:
                iv0 iv0Var = this.f24069b;
                NotificationCenter.getInstance(iv0Var.f24131v1.getCurrentAccount()).doOnIdle(new ir0(iv0Var, this.f24070c, this.d, this.e, this.f24071f, 1));
                return;
            default:
                iv0 iv0Var2 = this.f24069b;
                xu0[] xu0VarArr = iv0Var2.f24127t1;
                if (this.f24070c == null) {
                    int i10 = this.e;
                    xu0 xu0Var = xu0VarArr[i10];
                    if (this.d == xu0Var.f29168p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f24071f;
                        xu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f23085c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f23084b = tL_searchResultPosition.offset;
                                obj.f23083a = LocaleController.formatYearMont(i13, true);
                                xu0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(xu0VarArr[i10].e, new m9(10));
                        xu0 xu0Var2 = xu0VarArr[i10];
                        xu0Var2.f29159f[0] = tL_messages_searchResultsPositions.count;
                        xu0Var2.h = true;
                        if (!xu0Var2.e.isEmpty()) {
                            while (true) {
                                au0[] au0VarArr = iv0Var2.f24107k0;
                                if (i11 < au0VarArr.length) {
                                    au0 au0Var = au0VarArr[i11];
                                    if (au0Var.F == i10) {
                                        au0Var.f21591b = true;
                                        iv0Var2.o1(au0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        iv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
