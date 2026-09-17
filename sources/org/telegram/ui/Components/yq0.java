package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yq0 implements Runnable {
    public final int f30302a;
    public final zu0 f30303b;
    public final TLRPC.TL_error f30304c;
    public final int d;
    public final int e;
    public final TLObject f30305f;

    public yq0(zu0 zu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f30302a = i12;
        this.f30303b = zu0Var;
        this.f30304c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f30305f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f30302a) {
            case 0:
                zu0 zu0Var = this.f30303b;
                NotificationCenter.getInstance(zu0Var.f30656v1.getCurrentAccount()).doOnIdle(new yq0(zu0Var, this.f30304c, this.d, this.e, this.f30305f, 1));
                return;
            default:
                zu0 zu0Var2 = this.f30303b;
                ou0[] ou0VarArr = zu0Var2.f30652t1;
                if (this.f30304c == null) {
                    int i10 = this.e;
                    ou0 ou0Var = ou0VarArr[i10];
                    if (this.d == ou0Var.f26861p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f30305f;
                        ou0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f29988c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f29987b = tL_searchResultPosition.offset;
                                obj.f29986a = LocaleController.formatYearMont(i13, true);
                                ou0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(ou0VarArr[i10].e, new org.telegram.ui.ff(17));
                        ou0 ou0Var2 = ou0VarArr[i10];
                        ou0Var2.f26852f[0] = tL_messages_searchResultsPositions.count;
                        ou0Var2.h = true;
                        if (!ou0Var2.e.isEmpty()) {
                            while (true) {
                                st0[] st0VarArr = zu0Var2.f30632k0;
                                if (i11 < st0VarArr.length) {
                                    st0 st0Var = st0VarArr[i11];
                                    if (st0Var.F == i10) {
                                        st0Var.f27918b = true;
                                        zu0Var2.o1(st0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        zu0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
