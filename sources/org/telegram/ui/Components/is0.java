package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class is0 implements Runnable {
    public final int f27270a;
    public final hw0 f27271b;
    public final TLRPC.TL_error f27272c;
    public final int d;
    public final int f27273e;
    public final TLObject f27274f;

    public is0(hw0 hw0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f27270a = i12;
        this.f27271b = hw0Var;
        this.f27272c = tL_error;
        this.d = i10;
        this.f27273e = i11;
        this.f27274f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27270a) {
            case 0:
                hw0 hw0Var = this.f27271b;
                NotificationCenter.getInstance(hw0Var.f26957v1.getCurrentAccount()).doOnIdle(new is0(hw0Var, this.f27272c, this.d, this.f27273e, this.f27274f, 1));
                return;
            default:
                hw0 hw0Var2 = this.f27271b;
                wv0[] wv0VarArr = hw0Var2.f26953t1;
                if (this.f27272c == null) {
                    int i10 = this.f27273e;
                    wv0 wv0Var = wv0VarArr[i10];
                    if (this.d == wv0Var.f32565p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f27274f;
                        wv0Var.f32555e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f26178c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f26177b = tL_searchResultPosition.offset;
                                obj.f26176a = LocaleController.formatYearMont(i13, true);
                                wv0VarArr[i10].f32555e.add(obj);
                            }
                        }
                        Collections.sort(wv0VarArr[i10].f32555e, new org.telegram.ui.lf(17));
                        wv0 wv0Var2 = wv0VarArr[i10];
                        wv0Var2.f32556f[0] = tL_messages_searchResultsPositions.count;
                        wv0Var2.h = true;
                        if (!wv0Var2.f32555e.isEmpty()) {
                            while (true) {
                                av0[] av0VarArr = hw0Var2.f26933k0;
                                if (i11 < av0VarArr.length) {
                                    av0 av0Var = av0VarArr[i11];
                                    if (av0Var.F == i10) {
                                        av0Var.f24483b = true;
                                        hw0Var2.o1(av0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        hw0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
