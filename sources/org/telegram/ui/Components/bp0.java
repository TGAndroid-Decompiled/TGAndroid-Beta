package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bp0 implements Runnable {
    public final int f33336a;
    public final ys0 f33337b;
    public final TLRPC.TL_error f33338c;
    public final int d;
    public final int f33339e;
    public final TLObject f33340f;

    public bp0(ys0 ys0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f33336a = i11;
        this.f33337b = ys0Var;
        this.f33338c = tL_error;
        this.d = i7;
        this.f33339e = i10;
        this.f33340f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33336a) {
            case 0:
                ys0 ys0Var = this.f33337b;
                org.telegram.messenger.ns.f(ys0Var.f42150y1.getCurrentAccount()).d(new bp0(ys0Var, this.f33338c, this.d, this.f33339e, this.f33340f, 1));
                return;
            default:
                ys0 ys0Var2 = this.f33337b;
                ns0[] ns0VarArr = ys0Var2.f42144w1;
                if (this.f33338c == null) {
                    int i7 = this.f33339e;
                    ns0 ns0Var = ns0VarArr[i7];
                    if (this.d == ns0Var.f37705p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f33340f;
                        ns0Var.f37695e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f42068c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f42067b = tL_searchResultPosition.offset;
                                obj.f42066a = org.telegram.messenger.hd.e0(i12, true);
                                ns0VarArr[i7].f37695e.add(obj);
                            }
                        }
                        Collections.sort(ns0VarArr[i7].f37695e, new org.telegram.ui.me(16));
                        ns0 ns0Var2 = ns0VarArr[i7];
                        ns0Var2.f37696f[0] = tL_messages_searchResultsPositions.count;
                        ns0Var2.h = true;
                        if (!ns0Var2.f37695e.isEmpty()) {
                            while (true) {
                                tr0[] tr0VarArr = ys0Var2.f42117n0;
                                if (i10 < tr0VarArr.length) {
                                    tr0 tr0Var = tr0VarArr[i10];
                                    if (tr0Var.F == i7) {
                                        tr0Var.f39791b = true;
                                        ys0Var2.F1(tr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        ys0Var2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
