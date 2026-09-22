package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq0 implements Runnable {
    public final int f30038a;
    public final yu0 f30039b;
    public final TLRPC.TL_error f30040c;
    public final int d;
    public final int e;
    public final TLObject f30041f;

    public xq0(yu0 yu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f30038a = i12;
        this.f30039b = yu0Var;
        this.f30040c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f30041f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f30038a) {
            case 0:
                yu0 yu0Var = this.f30039b;
                NotificationCenter.getInstance(yu0Var.f30389v1.getCurrentAccount()).doOnIdle(new xq0(yu0Var, this.f30040c, this.d, this.e, this.f30041f, 1));
                return;
            default:
                yu0 yu0Var2 = this.f30039b;
                nu0[] nu0VarArr = yu0Var2.f30385t1;
                if (this.f30040c == null) {
                    int i10 = this.e;
                    nu0 nu0Var = nu0VarArr[i10];
                    if (this.d == nu0Var.f26587p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f30041f;
                        nu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f29781c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f29780b = tL_searchResultPosition.offset;
                                obj.f29779a = LocaleController.formatYearMont(i13, true);
                                nu0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(nu0VarArr[i10].e, new org.telegram.ui.df(17));
                        nu0 nu0Var2 = nu0VarArr[i10];
                        nu0Var2.f26578f[0] = tL_messages_searchResultsPositions.count;
                        nu0Var2.h = true;
                        if (!nu0Var2.e.isEmpty()) {
                            while (true) {
                                rt0[] rt0VarArr = yu0Var2.f30365k0;
                                if (i11 < rt0VarArr.length) {
                                    rt0 rt0Var = rt0VarArr[i11];
                                    if (rt0Var.F == i10) {
                                        rt0Var.f27681b = true;
                                        yu0Var2.o1(rt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        yu0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
