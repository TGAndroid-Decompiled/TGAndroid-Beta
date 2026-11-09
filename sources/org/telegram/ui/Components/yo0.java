package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yo0 implements Runnable {
    public final int f40784a;
    public final zs0 f40785b;
    public final TLRPC.TL_error f40786c;
    public final int d;
    public final int f40787e;
    public final TLObject f40788f;

    public yo0(zs0 zs0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f40784a = i11;
        this.f40785b = zs0Var;
        this.f40786c = tL_error;
        this.d = i7;
        this.f40787e = i10;
        this.f40788f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40784a) {
            case 0:
                zs0 zs0Var = this.f40785b;
                org.telegram.messenger.qs.f(zs0Var.f41127x1.getCurrentAccount()).d(new yo0(zs0Var, this.f40786c, this.d, this.f40787e, this.f40788f, 1));
                return;
            default:
                zs0 zs0Var2 = this.f40785b;
                os0[] os0VarArr = zs0Var2.f41121v1;
                if (this.f40786c == null) {
                    int i7 = this.f40787e;
                    os0 os0Var = os0VarArr[i7];
                    if (this.d == os0Var.f36791p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f40788f;
                        os0Var.f36781e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f41051c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f41050b = tL_searchResultPosition.offset;
                                obj.f41049a = org.telegram.messenger.id.e0(i12, true);
                                os0VarArr[i7].f36781e.add(obj);
                            }
                        }
                        Collections.sort(os0VarArr[i7].f36781e, new org.telegram.ui.oe(17));
                        os0 os0Var2 = os0VarArr[i7];
                        os0Var2.f36782f[0] = tL_messages_searchResultsPositions.count;
                        os0Var2.h = true;
                        if (!os0Var2.f36781e.isEmpty()) {
                            while (true) {
                                ur0[] ur0VarArr = zs0Var2.m0;
                                if (i10 < ur0VarArr.length) {
                                    ur0 ur0Var = ur0VarArr[i10];
                                    if (ur0Var.E == i7) {
                                        ur0Var.f38788b = true;
                                        zs0Var2.F1(ur0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        zs0Var2.J.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
