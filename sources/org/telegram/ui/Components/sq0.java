package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq0 implements Runnable {
    public final int f32704a;
    public final qu0 f32705b;
    public final TLRPC.TL_error f32706c;
    public final int d;
    public final int f32707e;
    public final TLObject f32708f;

    public sq0(qu0 qu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f32704a = i12;
        this.f32705b = qu0Var;
        this.f32706c = tL_error;
        this.d = i10;
        this.f32707e = i11;
        this.f32708f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32704a) {
            case 0:
                qu0 qu0Var = this.f32705b;
                NotificationCenter.getInstance(qu0Var.f32093r1.getCurrentAccount()).doOnIdle(new sq0(qu0Var, this.f32706c, this.d, this.f32707e, this.f32708f, 1));
                return;
            default:
                qu0 qu0Var2 = this.f32705b;
                fu0[] fu0VarArr = qu0Var2.f32088p1;
                if (this.f32706c == null) {
                    int i10 = this.f32707e;
                    fu0 fu0Var = fu0VarArr[i10];
                    if (this.d == fu0Var.f28547p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f32708f;
                        fu0Var.f28537e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f31137c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f31136b = tL_searchResultPosition.offset;
                                obj.f31135a = LocaleController.formatYearMont(i13, true);
                                fu0VarArr[i10].f28537e.add(obj);
                            }
                        }
                        Collections.sort(fu0VarArr[i10].f28537e, new wp0(1));
                        fu0 fu0Var2 = fu0VarArr[i10];
                        fu0Var2.f28538f[0] = tL_messages_searchResultsPositions.count;
                        fu0Var2.h = true;
                        if (!fu0Var2.f28537e.isEmpty()) {
                            while (true) {
                                it0[] it0VarArr = qu0Var2.f32070g0;
                                if (i11 < it0VarArr.length) {
                                    it0 it0Var = it0VarArr[i11];
                                    if (it0Var.B == i10) {
                                        it0Var.f29464b = true;
                                        qu0Var2.o1(it0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        qu0Var2.D.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
