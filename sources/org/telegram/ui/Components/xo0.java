package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo0 implements Runnable {
    public final int f40369a;
    public final ys0 f40370b;
    public final TLRPC.TL_error f40371c;
    public final int d;
    public final int f40372e;
    public final TLObject f40373f;

    public xo0(ys0 ys0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f40369a = i11;
        this.f40370b = ys0Var;
        this.f40371c = tL_error;
        this.d = i7;
        this.f40372e = i10;
        this.f40373f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40369a) {
            case 0:
                ys0 ys0Var = this.f40370b;
                org.telegram.messenger.qs.f(ys0Var.f40719x1.getCurrentAccount()).d(new xo0(ys0Var, this.f40371c, this.d, this.f40372e, this.f40373f, 1));
                return;
            default:
                ys0 ys0Var2 = this.f40370b;
                ns0[] ns0VarArr = ys0Var2.f40713v1;
                if (this.f40371c == null) {
                    int i7 = this.f40372e;
                    ns0 ns0Var = ns0VarArr[i7];
                    if (this.d == ns0Var.f36382p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f40373f;
                        ns0Var.f36372e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f40643c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f40642b = tL_searchResultPosition.offset;
                                obj.f40641a = org.telegram.messenger.id.e0(i12, true);
                                ns0VarArr[i7].f36372e.add(obj);
                            }
                        }
                        Collections.sort(ns0VarArr[i7].f36372e, new org.telegram.ui.pe(17));
                        ns0 ns0Var2 = ns0VarArr[i7];
                        ns0Var2.f36373f[0] = tL_messages_searchResultsPositions.count;
                        ns0Var2.h = true;
                        if (!ns0Var2.f36372e.isEmpty()) {
                            while (true) {
                                tr0[] tr0VarArr = ys0Var2.m0;
                                if (i10 < tr0VarArr.length) {
                                    tr0 tr0Var = tr0VarArr[i10];
                                    if (tr0Var.E == i7) {
                                        tr0Var.f38382b = true;
                                        ys0Var2.F1(tr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        ys0Var2.J.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
