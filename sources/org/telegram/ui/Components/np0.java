package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class np0 implements Runnable {
    public final int f37935a;
    public final jt0 f37936b;
    public final TLRPC.TL_error f37937c;
    public final int d;
    public final int f37938e;
    public final TLObject f37939f;

    public np0(jt0 jt0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f37935a = i11;
        this.f37936b = jt0Var;
        this.f37937c = tL_error;
        this.d = i7;
        this.f37938e = i10;
        this.f37939f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37935a) {
            case 0:
                jt0 jt0Var = this.f37936b;
                org.telegram.messenger.ks.f(jt0Var.f36689y1.getCurrentAccount()).d(new np0(jt0Var, this.f37937c, this.d, this.f37938e, this.f37939f, 1));
                return;
            default:
                jt0 jt0Var2 = this.f37936b;
                ys0[] ys0VarArr = jt0Var2.f36683w1;
                if (this.f37937c == null) {
                    int i7 = this.f37938e;
                    ys0 ys0Var = ys0VarArr[i7];
                    if (this.d == ys0Var.f42534p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f37939f;
                        ys0Var.f42524e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f36606c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f36605b = tL_searchResultPosition.offset;
                                obj.f36604a = org.telegram.messenger.gd.e0(i12, true);
                                ys0VarArr[i7].f42524e.add(obj);
                            }
                        }
                        Collections.sort(ys0VarArr[i7].f42524e, new org.telegram.ui.pe(16));
                        ys0 ys0Var2 = ys0VarArr[i7];
                        ys0Var2.f42525f[0] = tL_messages_searchResultsPositions.count;
                        ys0Var2.h = true;
                        if (!ys0Var2.f42524e.isEmpty()) {
                            while (true) {
                                ds0[] ds0VarArr = jt0Var2.f36656n0;
                                if (i10 < ds0VarArr.length) {
                                    ds0 ds0Var = ds0VarArr[i10];
                                    if (ds0Var.F == i7) {
                                        ds0Var.f34562b = true;
                                        jt0Var2.F1(ds0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        jt0Var2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
