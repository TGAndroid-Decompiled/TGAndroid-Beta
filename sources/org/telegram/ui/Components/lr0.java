package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lr0 implements Runnable {
    public final int f26151a;
    public final kv0 f26152b;
    public final TLRPC.TL_error f26153c;
    public final int d;
    public final int e;
    public final TLObject f26154f;

    public lr0(kv0 kv0Var, TLRPC.TL_error tL_error, int i10, int i11, TLObject tLObject, int i12) {
        this.f26151a = i12;
        this.f26152b = kv0Var;
        this.f26153c = tL_error;
        this.d = i10;
        this.e = i11;
        this.f26154f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f26151a) {
            case 0:
                kv0 kv0Var = this.f26152b;
                NotificationCenter.getInstance(kv0Var.f25866v1.getCurrentAccount()).doOnIdle(new lr0(kv0Var, this.f26153c, this.d, this.e, this.f26154f, 1));
                return;
            default:
                kv0 kv0Var2 = this.f26152b;
                zu0[] zu0VarArr = kv0Var2.f25862t1;
                if (this.f26153c == null) {
                    int i10 = this.e;
                    zu0 zu0Var = zu0VarArr[i10];
                    if (this.d == zu0Var.f30981p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f26154f;
                        zu0Var.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i11 = 0;
                        for (int i12 = 0; i12 < size; i12++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i12);
                            int i13 = tL_searchResultPosition.date;
                            if (i13 != 0) {
                                ?? obj = new Object();
                                obj.f25192c = i13;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f25191b = tL_searchResultPosition.offset;
                                obj.f25190a = LocaleController.formatYearMont(i13, true);
                                zu0VarArr[i10].e.add(obj);
                            }
                        }
                        Collections.sort(zu0VarArr[i10].e, new org.telegram.ui.cf(17));
                        zu0 zu0Var2 = zu0VarArr[i10];
                        zu0Var2.f30972f[0] = tL_messages_searchResultsPositions.count;
                        zu0Var2.h = true;
                        if (!zu0Var2.e.isEmpty()) {
                            while (true) {
                                du0[] du0VarArr = kv0Var2.f25842k0;
                                if (i11 < du0VarArr.length) {
                                    du0 du0Var = du0VarArr[i11];
                                    if (du0Var.F == i10) {
                                        du0Var.f23753b = true;
                                        kv0Var2.o1(du0Var, true);
                                    }
                                    i11++;
                                }
                            }
                        }
                        kv0Var2.H.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
