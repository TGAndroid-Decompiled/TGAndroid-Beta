package org.telegram.ui.Components;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cz0 implements Runnable {
    public final int f25290a;
    public final int f25291b;
    public final Object f25292c;
    public final Object d;
    public final Object e;

    public cz0(int i10, int i11, KeyEvent.Callback callback, Object obj, Object obj2) {
        this.f25290a = i11;
        this.d = callback;
        this.f25291b = i10;
        this.e = obj;
        this.f25292c = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cz0.run():void");
    }

    public cz0(int i10, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f25290a = 12;
        this.f25291b = i10;
        this.d = tL_error;
        this.e = n2Var;
        this.f25292c = tL_payments_assignPlayMarketTransaction;
    }

    public cz0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f25290a = i11;
        this.d = obj;
        this.e = obj2;
        this.f25291b = i10;
        this.f25292c = obj3;
    }

    public cz0(Object obj, Object obj2, int i10, Object obj3, int i11, boolean z10) {
        this.f25290a = i11;
        this.d = obj;
        this.f25292c = obj2;
        this.f25291b = i10;
        this.e = obj3;
    }

    public cz0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f25290a = i11;
        this.d = obj;
        this.e = obj2;
        this.f25292c = obj3;
        this.f25291b = i10;
    }

    public cz0(String str, int i10, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25290a = 4;
        this.e = str;
        this.f25291b = i10;
        this.d = f3Var;
        this.f25292c = d6Var;
    }

    public cz0(org.telegram.ui.ActionBar.n2 n2Var, Object obj, String str, int i10, int i11) {
        this.f25290a = i11;
        this.d = n2Var;
        this.f25292c = obj;
        this.e = str;
        this.f25291b = i10;
    }

    public cz0(im0 im0Var, int i10, ArrayList arrayList, ArrayList arrayList2, int i11) {
        this.f25290a = i11;
        this.d = im0Var;
        this.f25291b = i10;
        this.f25292c = arrayList;
        this.e = arrayList2;
    }
}
