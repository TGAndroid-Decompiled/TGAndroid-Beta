package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ap0 implements Runnable {
    public final int f31966a;
    public final ws0 f31967b;
    public final TLRPC.TL_error f31968c;
    public final int d;
    public final int f31969e;
    public final TLObject f31970f;

    public ap0(ws0 ws0Var, TLRPC.TL_error tL_error, int i3, int i10, TLObject tLObject, int i11) {
        this.f31966a = i11;
        this.f31967b = ws0Var;
        this.f31968c = tL_error;
        this.d = i3;
        this.f31969e = i10;
        this.f31970f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31966a) {
            case 0:
                ws0 ws0Var = this.f31967b;
                org.telegram.messenger.hs.f(ws0Var.f40142y1.getCurrentAccount()).d(new ap0(ws0Var, this.f31968c, this.d, this.f31969e, this.f31970f, 1));
                return;
            default:
                ws0 ws0Var2 = this.f31967b;
                ls0[] ls0VarArr = ws0Var2.f40136w1;
                if (this.f31968c == null) {
                    int i3 = this.f31969e;
                    ls0 ls0Var = ls0VarArr[i3];
                    if (this.d == ls0Var.f35867p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f31970f;
                        ls0Var.f35857e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f40062c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f40061b = tL_searchResultPosition.offset;
                                obj.f40060a = org.telegram.messenger.bd.e0(i12, true);
                                ls0VarArr[i3].f35857e.add(obj);
                            }
                        }
                        Collections.sort(ls0VarArr[i3].f35857e, new d80(7));
                        ls0 ls0Var2 = ls0VarArr[i3];
                        ls0Var2.f35858f[0] = tL_messages_searchResultsPositions.count;
                        ls0Var2.h = true;
                        if (!ls0Var2.f35857e.isEmpty()) {
                            while (true) {
                                rr0[] rr0VarArr = ws0Var2.f40108n0;
                                if (i10 < rr0VarArr.length) {
                                    rr0 rr0Var = rr0VarArr[i10];
                                    if (rr0Var.F == i3) {
                                        rr0Var.f37783b = true;
                                        ws0Var2.D1(rr0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        ws0Var2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
