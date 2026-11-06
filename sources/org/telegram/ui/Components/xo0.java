package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo0 implements Runnable {
    public final int f40291a;
    public final xs0 f40292b;
    public final TLRPC.TL_error f40293c;
    public final int d;
    public final int f40294e;
    public final TLObject f40295f;

    public xo0(xs0 xs0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f40291a = i11;
        this.f40292b = xs0Var;
        this.f40293c = tL_error;
        this.d = i7;
        this.f40294e = i10;
        this.f40295f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40291a) {
            case 0:
                xs0 xs0Var = this.f40292b;
                org.telegram.messenger.qs.f(xs0Var.f40405x1.getCurrentAccount()).d(new xo0(xs0Var, this.f40293c, this.d, this.f40294e, this.f40295f, 1));
                return;
            default:
                xs0 xs0Var2 = this.f40292b;
                ms0[] ms0VarArr = xs0Var2.f40399v1;
                if (this.f40293c == null) {
                    int i7 = this.f40294e;
                    ms0 ms0Var = ms0VarArr[i7];
                    if (this.d == ms0Var.f36122p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f40295f;
                        ms0Var.f36112e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f40329c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f40328b = tL_searchResultPosition.offset;
                                obj.f40327a = org.telegram.messenger.hd.e0(i12, true);
                                ms0VarArr[i7].f36112e.add(obj);
                            }
                        }
                        Collections.sort(ms0VarArr[i7].f36112e, new org.telegram.ui.oe(17));
                        ms0 ms0Var2 = ms0VarArr[i7];
                        ms0Var2.f36113f[0] = tL_messages_searchResultsPositions.count;
                        ms0Var2.h = true;
                        if (!ms0Var2.f36112e.isEmpty()) {
                            while (true) {
                                sr0[] sr0VarArr = xs0Var2.m0;
                                if (i10 < sr0VarArr.length) {
                                    sr0 sr0Var = sr0VarArr[i10];
                                    if (sr0Var.E == i7) {
                                        sr0Var.f38142b = true;
                                        xs0Var2.D1(sr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        xs0Var2.J.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
