package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mr0 implements Runnable {
    public final int f26537a;
    public final lv0 f26538b;
    public final TLRPC.TL_error f26539c;
    public final int d;
    public final int e;
    public final TLObject f26540f;

    public mr0(lv0 lv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26537a = i12;
        this.f26538b = lv0Var;
        this.f26539c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f26540f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26537a) {
            case 0:
                lv0 lv0Var = this.f26538b;
                NotificationCenter.getInstance(lv0Var.f26234v1.getCurrentAccount()).doOnIdle(new mr0(lv0Var, this.f26539c, this.d, this.e, this.f26540f, 1));
                return;
            default:
                lv0 lv0Var2 = this.f26538b;
                av0[] av0VarArr = lv0Var2.f26230t1;
                if (this.f26539c == null) {
                    int i10 = this.e;
                    av0 av0Var = av0VarArr[i10];
                    if (this.d == av0Var.f22756p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26540f;
                        av0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f25470c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f25469b = tL_searchResultPosition.offset;
                                obj.f25468a = LocaleController.formatYearMont(i13, true);
                                av0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(av0VarArr[i10].e, new org.telegram.ui.df(17));
                        av0 av0Var2 = av0VarArr[i10];
                        av0Var2.f22747f[0] = tL_messages_searchResultsPositions.count;
                        av0Var2.h = true;
                        if (!av0Var2.e.isEmpty()) {
                            while (true) {
                                eu0[] eu0VarArr = lv0Var2.f26210k0;
                                if (i11 < eu0VarArr.length) {
                                    eu0 eu0Var = eu0VarArr[i11];
                                    if (eu0Var.F == i10) {
                                        eu0Var.f24039b = true;
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
