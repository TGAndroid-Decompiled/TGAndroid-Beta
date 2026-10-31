package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class tj implements Runnable {
    public final int f30583a = 0;
    public final TLObject f30584b;
    public final int f30585c;
    public final long d;
    public final long e;
    public final boolean f30586f;
    public final TLRPC.TL_error h;
    public final Object f30587n;
    public final Object f30588r;
    public final Object f30589s;
    public final Object f30590w;
    public final Object f30591x;
    public final Object f30592y;

    public tj(wj wjVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f30587n = wjVar;
        this.f30585c = i10;
        this.h = tL_error;
        this.f30584b = tLObject;
        this.f30588r = cVar;
        this.f30586f = z10;
        this.f30589s = str;
        this.f30590w = arrayList;
        this.d = j10;
        this.e = j11;
        this.f30591x = arrayList2;
        this.f30592y = arrayList3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tj.run():void");
    }

    public tj(vh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.z2 z2Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f30587n = dVar;
        this.f30584b = tLObject;
        this.f30585c = i10;
        this.d = j10;
        this.f30588r = z2Var;
        this.f30589s = starrefprogram;
        this.e = j11;
        this.f30586f = z10;
        this.f30590w = context;
        this.f30591x = p6Var;
        this.f30592y = user;
        this.h = tL_error;
    }
}
