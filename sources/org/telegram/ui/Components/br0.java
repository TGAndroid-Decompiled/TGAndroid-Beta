package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br0 implements Runnable {
    public final int f25704a;
    public final zu0 f25705b;
    public final TLRPC.TL_error f25706c;
    public final int d;
    public final int f25707e;
    public final TLObject f25708f;

    public br0(zu0 zu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f25704a = i12;
        this.f25705b = zu0Var;
        this.f25706c = tL_error;
        this.d = i10;
        this.f25707e = i11;
        this.f25708f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25704a) {
            case 0:
                zu0 zu0Var = this.f25705b;
                NotificationCenter.getInstance(zu0Var.f34004s1.getCurrentAccount()).doOnIdle(new br0(zu0Var, this.f25706c, this.d, this.f25707e, this.f25708f, 1));
                return;
            default:
                zu0 zu0Var2 = this.f25705b;
                ou0[] ou0VarArr = zu0Var2.f33998q1;
                if (this.f25706c == null) {
                    int i10 = this.f25707e;
                    ou0 ou0Var = ou0VarArr[i10];
                    if (this.d == ou0Var.f29864p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f25708f;
                        ou0Var.f29854e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f32848c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f32847b = tL_searchResultPosition.offset;
                                obj.f32846a = LocaleController.formatYearMont(i13, true);
                                ou0VarArr[i10].f29854e.add(obj);
                            }
                        }
                        Collections.sort(ou0VarArr[i10].f29854e, new oh.k0(28));
                        ou0 ou0Var2 = ou0VarArr[i10];
                        ou0Var2.f29855f[0] = tL_messages_searchResultsPositions.count;
                        ou0Var2.h = true;
                        if (!ou0Var2.f29854e.isEmpty()) {
                            while (true) {
                                rt0[] rt0VarArr = zu0Var2.f33980h0;
                                if (i11 < rt0VarArr.length) {
                                    rt0 rt0Var = rt0VarArr[i11];
                                    if (rt0Var.C == i10) {
                                        rt0Var.f30845b = true;
                                        zu0Var2.o1(rt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        zu0Var2.E.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
