package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lr0 implements Runnable {
    public final int f26123a;
    public final lv0 f26124b;
    public final TLRPC.TL_error f26125c;
    public final int d;
    public final int e;
    public final TLObject f26126f;

    public lr0(lv0 lv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26123a = i12;
        this.f26124b = lv0Var;
        this.f26125c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f26126f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26123a) {
            case 0:
                lv0 lv0Var = this.f26124b;
                NotificationCenter.getInstance(lv0Var.f26212v1.getCurrentAccount()).doOnIdle(new lr0(lv0Var, this.f26125c, this.d, this.e, this.f26126f, 1));
                return;
            default:
                lv0 lv0Var2 = this.f26124b;
                av0[] av0VarArr = lv0Var2.f26208t1;
                if (this.f26125c == null) {
                    int i10 = this.e;
                    av0 av0Var = av0VarArr[i10];
                    if (this.d == av0Var.f22779p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26126f;
                        av0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f25547c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f25546b = tL_searchResultPosition.offset;
                                obj.f25545a = LocaleController.formatYearMont(i13, true);
                                av0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(av0VarArr[i10].e, new org.telegram.ui.ff(17));
                        av0 av0Var2 = av0VarArr[i10];
                        av0Var2.f22770f[0] = tL_messages_searchResultsPositions.count;
                        av0Var2.h = true;
                        if (!av0Var2.e.isEmpty()) {
                            while (true) {
                                eu0[] eu0VarArr = lv0Var2.f26188k0;
                                if (i11 < eu0VarArr.length) {
                                    eu0 eu0Var = eu0VarArr[i11];
                                    if (eu0Var.F == i10) {
                                        eu0Var.f24125b = true;
                                        lv0Var2.o1(eu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        lv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
