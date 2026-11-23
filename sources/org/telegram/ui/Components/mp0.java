package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mp0 implements Runnable {
    public final int f37516a;
    public final it0 f37517b;
    public final TLRPC.TL_error f37518c;
    public final int d;
    public final int f37519e;
    public final TLObject f37520f;

    public mp0(it0 it0Var, TLRPC.TL_error tL_error, int i7, int i10, TLObject tLObject, int i11) {
        this.f37516a = i11;
        this.f37517b = it0Var;
        this.f37518c = tL_error;
        this.d = i7;
        this.f37519e = i10;
        this.f37520f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37516a) {
            case 0:
                it0 it0Var = this.f37517b;
                org.telegram.messenger.ks.f(it0Var.f36166y1.getCurrentAccount()).d(new mp0(it0Var, this.f37518c, this.d, this.f37519e, this.f37520f, 1));
                return;
            default:
                it0 it0Var2 = this.f37517b;
                xs0[] xs0VarArr = it0Var2.f36160w1;
                if (this.f37518c == null) {
                    int i7 = this.f37519e;
                    xs0 xs0Var = xs0VarArr[i7];
                    if (this.d == xs0Var.f42178p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f37520f;
                        xs0Var.f42168e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f36086c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f36085b = tL_searchResultPosition.offset;
                                obj.f36084a = org.telegram.messenger.gd.e0(i12, true);
                                xs0VarArr[i7].f42168e.add(obj);
                            }
                        }
                        Collections.sort(xs0VarArr[i7].f42168e, new org.telegram.ui.pe(16));
                        xs0 xs0Var2 = xs0VarArr[i7];
                        xs0Var2.f42169f[0] = tL_messages_searchResultsPositions.count;
                        xs0Var2.h = true;
                        if (!xs0Var2.f42168e.isEmpty()) {
                            while (true) {
                                ds0[] ds0VarArr = it0Var2.f36133n0;
                                if (i10 < ds0VarArr.length) {
                                    ds0 ds0Var = ds0VarArr[i10];
                                    if (ds0Var.F == i7) {
                                        ds0Var.f34442b = true;
                                        it0Var2.F1(ds0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        it0Var2.K.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
