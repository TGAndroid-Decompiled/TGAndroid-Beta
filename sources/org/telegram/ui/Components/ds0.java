package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ds0 implements Runnable {
    public final int f25788a;
    public final cw0 f25789b;
    public final TLRPC.TL_error f25790c;
    public final int d;
    public final int f25791e;
    public final TLObject f25792f;

    public ds0(cw0 cw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f25788a = i12;
        this.f25789b = cw0Var;
        this.f25790c = tL_error;
        this.d = i10;
        this.f25791e = i11;
        this.f25792f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25788a) {
            case 0:
                cw0 cw0Var = this.f25789b;
                NotificationCenter.getInstance(cw0Var.f25474v1.getCurrentAccount()).doOnIdle(new ds0(cw0Var, this.f25790c, this.d, this.f25791e, this.f25792f, 1));
                return;
            default:
                cw0 cw0Var2 = this.f25789b;
                rv0[] rv0VarArr = cw0Var2.f25470t1;
                if (this.f25790c == null) {
                    int i10 = this.f25791e;
                    rv0 rv0Var = rv0VarArr[i10];
                    if (this.d == rv0Var.f30591p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f25792f;
                        rv0Var.f30581e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f24650c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f24649b = tL_searchResultPosition.offset;
                                obj.f24648a = LocaleController.formatYearMont(i13, true);
                                rv0VarArr[i10].f30581e.add(obj);
                            }
                        }
                        Collections.sort(rv0VarArr[i10].f30581e, new org.telegram.ui.gf(17));
                        rv0 rv0Var2 = rv0VarArr[i10];
                        rv0Var2.f30582f[0] = tL_messages_searchResultsPositions.count;
                        rv0Var2.h = true;
                        if (!rv0Var2.f30581e.isEmpty()) {
                            while (true) {
                                vu0[] vu0VarArr = cw0Var2.f25450k0;
                                if (i11 < vu0VarArr.length) {
                                    vu0 vu0Var = vu0VarArr[i11];
                                    if (vu0Var.F == i10) {
                                        vu0Var.f32514b = true;
                                        cw0Var2.o1(vu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        cw0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
