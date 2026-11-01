package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq0 implements Runnable {
    public final int f24473a;
    public final au0 f24474b;
    public final TLRPC.TL_error f24475c;
    public final int d;
    public final int e;
    public final TLObject f24476f;

    public aq0(au0 au0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f24473a = i12;
        this.f24474b = au0Var;
        this.f24475c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f24476f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24473a) {
            case 0:
                au0 au0Var = this.f24474b;
                org.telegram.messenger.at.f(au0Var.f24568x1.getCurrentAccount()).d(new aq0(au0Var, this.f24475c, this.d, this.e, this.f24476f, 1));
                return;
            default:
                au0 au0Var2 = this.f24474b;
                pt0[] pt0VarArr = au0Var2.f24562v1;
                if (this.f24475c == null) {
                    int i10 = this.e;
                    pt0 pt0Var = pt0VarArr[i10];
                    if (this.d == pt0Var.f29544p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f24476f;
                        pt0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f32903c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f32902b = tL_searchResultPosition.offset;
                                obj.f32901a = org.telegram.messenger.dd.e0(i13, true);
                                pt0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(pt0VarArr[i10].e, new org.telegram.ui.f6(19));
                        pt0 pt0Var2 = pt0VarArr[i10];
                        pt0Var2.f29535f[0] = tL_messages_searchResultsPositions.count;
                        pt0Var2.h = true;
                        if (!pt0Var2.e.isEmpty()) {
                            while (true) {
                                ts0[] ts0VarArr = au0Var2.m0;
                                if (i11 < ts0VarArr.length) {
                                    ts0 ts0Var = ts0VarArr[i11];
                                    if (ts0Var.E == i10) {
                                        ts0Var.f30716b = true;
                                        au0Var2.B1(ts0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        au0Var2.J.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
