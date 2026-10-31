package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lh implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.hk0 {
    public final int f39236a;
    public final long f39237b;
    public final org.telegram.messenger.us f39238c;
    public final Object d;
    public final Object e;
    public final Object f39239f;

    public lh(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f39236a = i10;
        this.f39238c = (org.telegram.messenger.us) obj;
        this.d = callback;
        this.e = obj2;
        this.f39237b = j10;
        this.f39239f = obj3;
    }

    @Override
    public void b(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh.b(float, float, int, android.view.View):void");
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f39236a) {
            case 0:
                un.J0((un) this.f39238c, (TLRPC.TL_game) this.d, (org.telegram.messenger.jj) this.e, (String) this.f39239f, this.f39237b);
                return;
            default:
                org.telegram.ui.Components.o21 o21Var = (org.telegram.ui.Components.o21) this.f39238c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.messenger.rz rzVar = (org.telegram.messenger.rz) this.f39239f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f39237b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            o21Var.n(0L, false);
                        }
                    } else {
                        o21Var.f28958n0.addAll(hashSet);
                        o21Var.q();
                        org.telegram.ui.Components.cc.a0(o21Var.f28963y).U(org.telegram.messenger.cd.J0(hashSet.size(), "TopicsDeleted"), false, new ag.a3(o21Var, hashSet, arrayList, j10, 6), new org.telegram.ui.Components.gi0(o21Var, arrayList, rzVar, 15)).j();
                        x1Var.dismiss();
                        return;
                    }
                }
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    public lh(un unVar, TLRPC.TL_game tL_game, org.telegram.messenger.jj jjVar, String str, long j10) {
        this.f39236a = 0;
        this.f39238c = unVar;
        this.d = tL_game;
        this.e = jjVar;
        this.f39239f = str;
        this.f39237b = j10;
    }

    public lh(org.telegram.ui.Components.o21 o21Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.messenger.rz rzVar) {
        this.f39236a = 2;
        this.f39238c = o21Var;
        this.d = arrayList;
        this.f39237b = j10;
        this.e = hashSet;
        this.f39239f = rzVar;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
