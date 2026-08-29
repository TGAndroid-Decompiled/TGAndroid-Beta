package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class fk implements Runnable {
    public final int f28420a = 1;
    public final TLObject f28421b;
    public final int f28422c;
    public final long d;
    public final long f28423e;
    public final boolean f28424f;
    public final TLRPC.TL_error h;
    public final Object f28425n;
    public final Object f28426r;
    public final Object f28427s;
    public final Object v;
    public final Object f28428w;
    public final Object f28429x;

    public fk(nh.d dVar, TLObject tLObject, int i10, long j10, org.telegram.ui.ActionBar.f3 f3Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f28425n = dVar;
        this.f28421b = tLObject;
        this.f28422c = i10;
        this.d = j10;
        this.f28426r = f3Var;
        this.f28427s = starrefprogram;
        this.f28423e = j11;
        this.f28424f = z10;
        this.v = context;
        this.f28428w = c6Var;
        this.f28429x = user;
        this.h = tL_error;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fk.run():void");
    }

    public fk(ik ikVar, int i10, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.f28425n = ikVar;
        this.f28422c = i10;
        this.h = tL_error;
        this.f28421b = tLObject;
        this.f28426r = accountInstance;
        this.f28424f = z10;
        this.f28427s = str;
        this.v = arrayList;
        this.d = j10;
        this.f28423e = j11;
        this.f28428w = arrayList2;
        this.f28429x = arrayList3;
    }
}
