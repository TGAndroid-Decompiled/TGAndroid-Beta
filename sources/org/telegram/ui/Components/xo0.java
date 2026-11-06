package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo0 implements Runnable {
    public final int f40326a;
    public final xs0 f40327b;
    public final TLRPC.TL_error f40328c;
    public final int d;
    public final int f40329e;
    public final TLObject f40330f;

    public xo0(xs0 xs0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f40326a = i11;
        this.f40327b = xs0Var;
        this.f40328c = tL_error;
        this.d = i7;
        this.f40329e = i10;
        this.f40330f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40326a) {
            case 0:
                xs0 xs0Var = this.f40327b;
                org.telegram.messenger.qs.f(xs0Var.f40440x1.getCurrentAccount()).d(new xo0(xs0Var, this.f40328c, this.d, this.f40329e, this.f40330f, 1));
                return;
            default:
                xs0 xs0Var2 = this.f40327b;
                ms0[] ms0VarArr = xs0Var2.f40434v1;
                if (this.f40328c == null) {
                    int i7 = this.f40329e;
                    ms0 ms0Var = ms0VarArr[i7];
                    if (this.d == ms0Var.f36076p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f40330f;
                        ms0Var.f36066e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f40364c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f40363b = tL_searchResultPosition.offset;
                                obj.f40362a = org.telegram.messenger.hd.e0(i12, true);
                                ms0VarArr[i7].f36066e.add(obj);
                            }
                        }
                        Collections.sort(ms0VarArr[i7].f36066e, new org.telegram.ui.oe(17));
                        ms0 ms0Var2 = ms0VarArr[i7];
                        ms0Var2.f36067f[0] = tL_messages_searchResultsPositions.count;
                        ms0Var2.h = true;
                        if (!ms0Var2.f36066e.isEmpty()) {
                            while (true) {
                                sr0[] sr0VarArr = xs0Var2.m0;
                                if (i10 < sr0VarArr.length) {
                                    sr0 sr0Var = sr0VarArr[i10];
                                    if (sr0Var.E == i7) {
                                        sr0Var.f38106b = true;
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
