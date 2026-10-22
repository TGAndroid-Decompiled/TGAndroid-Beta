package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements Runnable {
    public final int f31860a;
    public final uv0 f31861b;
    public final TLRPC.TL_error f31862c;
    public final int d;
    public final int e;
    public final TLObject f31863f;

    public vr0(uv0 uv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f31860a = i12;
        this.f31861b = uv0Var;
        this.f31862c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f31863f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31860a) {
            case 0:
                uv0 uv0Var = this.f31861b;
                NotificationCenter.getInstance(uv0Var.f31074v1.getCurrentAccount()).doOnIdle(new vr0(uv0Var, this.f31862c, this.d, this.e, this.f31863f, 1));
                return;
            default:
                uv0 uv0Var2 = this.f31861b;
                jv0[] jv0VarArr = uv0Var2.f31070t1;
                if (this.f31862c == null) {
                    int i10 = this.e;
                    jv0 jv0Var = jv0VarArr[i10];
                    if (this.d == jv0Var.f27656p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f31863f;
                        jv0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f30365c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f30364b = tL_searchResultPosition.offset;
                                obj.f30363a = LocaleController.formatYearMont(i13, true);
                                jv0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(jv0VarArr[i10].e, new org.telegram.ui.ActionBar.i4(24));
                        jv0 jv0Var2 = jv0VarArr[i10];
                        jv0Var2.f27647f[0] = tL_messages_searchResultsPositions.count;
                        jv0Var2.h = true;
                        if (!jv0Var2.e.isEmpty()) {
                            while (true) {
                                nu0[] nu0VarArr = uv0Var2.f31050k0;
                                if (i11 < nu0VarArr.length) {
                                    nu0 nu0Var = nu0VarArr[i11];
                                    if (nu0Var.F == i10) {
                                        nu0Var.f28880b = true;
                                        uv0Var2.q1(nu0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        uv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
