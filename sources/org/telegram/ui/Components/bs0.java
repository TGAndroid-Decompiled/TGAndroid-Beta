package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bs0 implements Runnable {
    public final int f26903a;
    public final bw0 f26904b;
    public final TLRPC.TL_error f26905c;
    public final int d;
    public final int e;
    public final TLObject f26906f;

    public bs0(bw0 bw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26903a = i12;
        this.f26904b = bw0Var;
        this.f26905c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f26906f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26903a) {
            case 0:
                bw0 bw0Var = this.f26904b;
                NotificationCenter.getInstance(bw0Var.f26992x1.getCurrentAccount()).doOnIdle(new bs0(bw0Var, this.f26905c, this.d, this.e, this.f26906f, 1));
                return;
            default:
                bw0 bw0Var2 = this.f26904b;
                qv0[] qv0VarArr = bw0Var2.f26986v1;
                if (this.f26905c == null) {
                    int i10 = this.e;
                    qv0 qv0Var = qv0VarArr[i10];
                    if (this.d == qv0Var.f32045p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26906f;
                        qv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f26672c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f26671b = tL_searchResultPosition.offset;
                                obj.f26670a = LocaleController.formatYearMont(i13, true);
                                qv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(qv0VarArr[i10].e, new org.telegram.ui.ActionBar.n4(24));
                        qv0 qv0Var2 = qv0VarArr[i10];
                        qv0Var2.f32036f[0] = tL_messages_searchResultsPositions.count;
                        qv0Var2.h = true;
                        if (!qv0Var2.e.isEmpty()) {
                            while (true) {
                                uu0[] uu0VarArr = bw0Var2.m0;
                                if (i11 < uu0VarArr.length) {
                                    uu0 uu0Var = uu0VarArr[i11];
                                    if (uu0Var.E == i10) {
                                        uu0Var.f33465b = true;
                                        bw0Var2.z1(uu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        bw0Var2.J.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
