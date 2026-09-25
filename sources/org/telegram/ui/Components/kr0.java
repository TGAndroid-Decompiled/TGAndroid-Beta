package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr0 implements Runnable {
    public final int f25860a;
    public final jv0 f25861b;
    public final TLRPC.TL_error f25862c;
    public final int d;
    public final int e;
    public final TLObject f25863f;

    public kr0(jv0 jv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f25860a = i12;
        this.f25861b = jv0Var;
        this.f25862c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f25863f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25860a) {
            case 0:
                jv0 jv0Var = this.f25861b;
                NotificationCenter.getInstance(jv0Var.f25560v1.getCurrentAccount()).doOnIdle(new kr0(jv0Var, this.f25862c, this.d, this.e, this.f25863f, 1));
                return;
            default:
                jv0 jv0Var2 = this.f25861b;
                yu0[] yu0VarArr = jv0Var2.f25556t1;
                if (this.f25862c == null) {
                    int i10 = this.e;
                    yu0 yu0Var = yu0VarArr[i10];
                    if (this.d == yu0Var.f30705p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f25863f;
                        yu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f24872c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f24871b = tL_searchResultPosition.offset;
                                obj.f24870a = LocaleController.formatYearMont(i13, true);
                                yu0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(yu0VarArr[i10].e, new org.telegram.ui.cf(17));
                        yu0 yu0Var2 = yu0VarArr[i10];
                        yu0Var2.f30696f[0] = tL_messages_searchResultsPositions.count;
                        yu0Var2.h = true;
                        if (!yu0Var2.e.isEmpty()) {
                            while (true) {
                                cu0[] cu0VarArr = jv0Var2.f25536k0;
                                if (i11 < cu0VarArr.length) {
                                    cu0 cu0Var = cu0VarArr[i11];
                                    if (cu0Var.F == i10) {
                                        cu0Var.f23396b = true;
                                        jv0Var2.o1(cu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        jv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
