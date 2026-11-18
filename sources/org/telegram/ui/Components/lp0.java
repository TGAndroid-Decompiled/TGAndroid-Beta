package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lp0 implements Runnable {
    public final int f37187a;
    public final gt0 f37188b;
    public final TLRPC.TL_error f37189c;
    public final int d;
    public final int f37190e;
    public final TLObject f37191f;

    public lp0(gt0 gt0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f37187a = i11;
        this.f37188b = gt0Var;
        this.f37189c = tL_error;
        this.d = i7;
        this.f37190e = i10;
        this.f37191f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37187a) {
            case 0:
                gt0 gt0Var = this.f37188b;
                org.telegram.messenger.ks.f(gt0Var.f35642y1.getCurrentAccount()).d(new lp0(gt0Var, this.f37189c, this.d, this.f37190e, this.f37191f, 1));
                return;
            default:
                gt0 gt0Var2 = this.f37188b;
                vs0[] vs0VarArr = gt0Var2.f35636w1;
                if (this.f37189c == null) {
                    int i7 = this.f37190e;
                    vs0 vs0Var = vs0VarArr[i7];
                    if (this.d == vs0Var.f41425p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f37191f;
                        vs0Var.f41415e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f35559c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f35558b = tL_searchResultPosition.offset;
                                obj.f35557a = org.telegram.messenger.gd.e0(i12, true);
                                vs0VarArr[i7].f41415e.add(obj);
                            }
                        }
                        Collections.sort(vs0VarArr[i7].f41415e, new org.telegram.ui.pe(16));
                        vs0 vs0Var2 = vs0VarArr[i7];
                        vs0Var2.f41416f[0] = tL_messages_searchResultsPositions.count;
                        vs0Var2.h = true;
                        if (!vs0Var2.f41415e.isEmpty()) {
                            while (true) {
                                bs0[] bs0VarArr = gt0Var2.f35609n0;
                                if (i10 < bs0VarArr.length) {
                                    bs0 bs0Var = bs0VarArr[i10];
                                    if (bs0Var.F == i7) {
                                        bs0Var.f33767b = true;
                                        gt0Var2.F1(bs0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        gt0Var2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
