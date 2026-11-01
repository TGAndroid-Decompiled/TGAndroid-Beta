package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class tj implements Runnable {
    public final int f30663a = 0;
    public final TLObject f30664b;
    public final int f30665c;
    public final long d;
    public final long e;
    public final boolean f30666f;
    public final TLRPC.TL_error h;
    public final Object f30667n;
    public final Object f30668r;
    public final Object f30669s;
    public final Object f30670w;
    public final Object f30671x;
    public final Object f30672y;

    public tj(wj wjVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f30667n = wjVar;
        this.f30665c = i10;
        this.h = tL_error;
        this.f30664b = tLObject;
        this.f30668r = cVar;
        this.f30666f = z10;
        this.f30669s = str;
        this.f30670w = arrayList;
        this.d = j10;
        this.e = j11;
        this.f30671x = arrayList2;
        this.f30672y = arrayList3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tj.run():void");
    }

    public tj(vh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.z2 z2Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, org.telegram.ui.ActionBar.p6 p6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f30667n = dVar;
        this.f30664b = tLObject;
        this.f30665c = i10;
        this.d = j10;
        this.f30668r = z2Var;
        this.f30669s = starrefprogram;
        this.e = j11;
        this.f30666f = z10;
        this.f30670w = context;
        this.f30671x = p6Var;
        this.f30672y = user;
        this.h = tL_error;
    }
}
