package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar0 implements Runnable {
    public final int f25354a;
    public final yu0 f25355b;
    public final TLRPC.TL_error f25356c;
    public final int d;
    public final int f25357e;
    public final TLObject f25358f;

    public ar0(yu0 yu0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f25354a = i12;
        this.f25355b = yu0Var;
        this.f25356c = tL_error;
        this.d = i10;
        this.f25357e = i11;
        this.f25358f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25354a) {
            case 0:
                yu0 yu0Var = this.f25355b;
                NotificationCenter.getInstance(yu0Var.f33649s1.getCurrentAccount()).doOnIdle(new ar0(yu0Var, this.f25356c, this.d, this.f25357e, this.f25358f, 1));
                return;
            default:
                yu0 yu0Var2 = this.f25355b;
                nu0[] nu0VarArr = yu0Var2.f33643q1;
                if (this.f25356c == null) {
                    int i10 = this.f25357e;
                    nu0 nu0Var = nu0VarArr[i10];
                    if (this.d == nu0Var.f29593p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f25358f;
                        nu0Var.f29583e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f32540c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f32539b = tL_searchResultPosition.offset;
                                obj.f32538a = LocaleController.formatYearMont(i13, true);
                                nu0VarArr[i10].f29583e.add(obj);
                            }
                        }
                        Collections.sort(nu0VarArr[i10].f29583e, new oh.k0(28));
                        nu0 nu0Var2 = nu0VarArr[i10];
                        nu0Var2.f29584f[0] = tL_messages_searchResultsPositions.count;
                        nu0Var2.h = true;
                        if (!nu0Var2.f29583e.isEmpty()) {
                            while (true) {
                                qt0[] qt0VarArr = yu0Var2.f33625h0;
                                if (i11 < qt0VarArr.length) {
                                    qt0 qt0Var = qt0VarArr[i11];
                                    if (qt0Var.C == i10) {
                                        qt0Var.f30517b = true;
                                        yu0Var2.o1(qt0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        yu0Var2.E.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
