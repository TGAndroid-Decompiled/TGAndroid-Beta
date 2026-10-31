package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zp0 implements Runnable {
    public final int f33143a;
    public final zt0 f33144b;
    public final TLRPC.TL_error f33145c;
    public final int d;
    public final int e;
    public final TLObject f33146f;

    public zp0(zt0 zt0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f33143a = i12;
        this.f33144b = zt0Var;
        this.f33145c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f33146f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33143a) {
            case 0:
                zt0 zt0Var = this.f33144b;
                org.telegram.messenger.zs.f(zt0Var.f33240x1.getCurrentAccount()).d(new zp0(zt0Var, this.f33145c, this.d, this.e, this.f33146f, 1));
                return;
            default:
                zt0 zt0Var2 = this.f33144b;
                ot0[] ot0VarArr = zt0Var2.f33234v1;
                if (this.f33145c == null) {
                    int i10 = this.e;
                    ot0 ot0Var = ot0VarArr[i10];
                    if (this.d == ot0Var.f29189p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f33146f;
                        ot0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f32544c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f32543b = tL_searchResultPosition.offset;
                                obj.f32542a = org.telegram.messenger.cd.e0(i13, true);
                                ot0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(ot0VarArr[i10].e, new org.telegram.ui.f6(19));
                        ot0 ot0Var2 = ot0VarArr[i10];
                        ot0Var2.f29180f[0] = tL_messages_searchResultsPositions.count;
                        ot0Var2.h = true;
                        if (!ot0Var2.e.isEmpty()) {
                            while (true) {
                                ss0[] ss0VarArr = zt0Var2.m0;
                                if (i11 < ss0VarArr.length) {
                                    ss0 ss0Var = ss0VarArr[i11];
                                    if (ss0Var.E == i10) {
                                        ss0Var.f30349b = true;
                                        zt0Var2.A1(ss0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        zt0Var2.J.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
