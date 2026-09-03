package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class fk implements Runnable {
    public final int f26927a = 0;
    public final TLObject f26928b;
    public final int f26929c;
    public final long d;
    public final long f26930e;
    public final boolean f26931f;
    public final TLRPC.TL_error h;
    public final Object f26932n;
    public final Object f26933r;
    public final Object f26934s;
    public final Object v;
    public final Object f26935w;
    public final Object f26936x;

    public fk(ik ikVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z4, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f26932n = ikVar;
        this.f26929c = i10;
        this.h = tL_error;
        this.f26928b = tLObject;
        this.f26933r = accountInstance;
        this.f26931f = z4;
        this.f26934s = str;
        this.v = arrayList;
        this.d = j10;
        this.f26930e = j11;
        this.f26935w = arrayList2;
        this.f26936x = arrayList3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk.run():void");
    }

    public fk(qh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.h3 h3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z4, Context context, org.telegram.ui.ActionBar.g6 g6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f26932n = dVar;
        this.f26928b = tLObject;
        this.f26929c = i10;
        this.d = j10;
        this.f26933r = h3Var;
        this.f26934s = starrefprogram;
        this.f26930e = j11;
        this.f26931f = z4;
        this.v = context;
        this.f26935w = g6Var;
        this.f26936x = user;
        this.h = tL_error;
    }
}
