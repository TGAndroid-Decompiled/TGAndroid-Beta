package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class dk implements Runnable {
    public final int f24296a = 0;
    public final TLObject f24297b;
    public final int f24298c;
    public final long d;
    public final long e;
    public final boolean f24299f;
    public final TLRPC.TL_error h;
    public final Object f24300n;
    public final Object f24301r;
    public final Object f24302s;
    public final Object v;
    public final Object f24303w;
    public final Object f24304x;

    public dk(gk gkVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z4, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f24300n = gkVar;
        this.f24298c = i10;
        this.h = tL_error;
        this.f24297b = tLObject;
        this.f24301r = accountInstance;
        this.f24299f = z4;
        this.f24302s = str;
        this.v = arrayList;
        this.d = j10;
        this.e = j11;
        this.f24303w = arrayList2;
        this.f24304x = arrayList3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dk.run():void");
    }

    public dk(ph.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.g3 g3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f24300n = dVar;
        this.f24297b = tLObject;
        this.f24298c = i10;
        this.d = j10;
        this.f24301r = g3Var;
        this.f24302s = starrefprogram;
        this.e = j11;
        this.f24299f = z4;
        this.v = context;
        this.f24303w = f6Var;
        this.f24304x = user;
        this.h = tL_error;
    }
}
