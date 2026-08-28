package org.telegram.ui.Components;

import java.util.Collections;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gq0 implements Runnable {
    public final int f28839a;
    public final eu0 f28840b;
    public final TLRPC.TL_error f28841c;
    public final int d;
    public final int f28842e;
    public final TLObject f28843f;

    public gq0(eu0 eu0Var, TLRPC.TL_error tL_error, int i9, int i10, TLObject tLObject, int i11) {
        this.f28839a = i11;
        this.f28840b = eu0Var;
        this.f28841c = tL_error;
        this.d = i9;
        this.f28842e = i10;
        this.f28843f = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28839a) {
            case 0:
                eu0 eu0Var = this.f28840b;
                NotificationCenter.getInstance(eu0Var.f28160r1.getCurrentAccount()).doOnIdle(new gq0(eu0Var, this.f28841c, this.d, this.f28842e, this.f28843f, 1));
                return;
            default:
                eu0 eu0Var2 = this.f28840b;
                tt0[] tt0VarArr = eu0Var2.f28155p1;
                if (this.f28841c == null) {
                    int i9 = this.f28842e;
                    tt0 tt0Var = tt0VarArr[i9];
                    if (this.d == tt0Var.f32801p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f28843f;
                        tt0Var.f32791e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i10 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i11);
                            int i12 = tL_searchResultPosition.date;
                            if (i12 != 0) {
                                ?? obj = new Object();
                                obj.f27567c = i12;
                                obj.d = tL_searchResultPosition.msg_id;
                                obj.f27566b = tL_searchResultPosition.offset;
                                obj.f27565a = LocaleController.formatYearMont(i12, true);
                                tt0VarArr[i9].f32791e.add(obj);
                            }
                        }
                        Collections.sort(tt0VarArr[i9].f32791e, new jn0(3));
                        tt0 tt0Var2 = tt0VarArr[i9];
                        tt0Var2.f32792f[0] = tL_messages_searchResultsPositions.count;
                        tt0Var2.h = true;
                        if (!tt0Var2.f32791e.isEmpty()) {
                            while (true) {
                                xs0[] xs0VarArr = eu0Var2.f28137g0;
                                if (i10 < xs0VarArr.length) {
                                    xs0 xs0Var = xs0VarArr[i10];
                                    if (xs0Var.B == i9) {
                                        xs0Var.f34756b = true;
                                        eu0Var2.o1(xs0Var, true);
                                    }
                                    i10++;
                                }
                            }
                        }
                        eu0Var2.D.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
