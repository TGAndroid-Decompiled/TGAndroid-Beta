package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lh implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.ik0 {
    public final int f39273a;
    public final long f39274b;
    public final org.telegram.messenger.vs f39275c;
    public final Object d;
    public final Object e;
    public final Object f39276f;

    public lh(Object obj, KeyEvent.Callback callback, Object obj2, long j10, Object obj3, int i10) {
        this.f39273a = i10;
        this.f39275c = (org.telegram.messenger.vs) obj;
        this.d = callback;
        this.e = obj2;
        this.f39274b = j10;
        this.f39276f = obj3;
    }

    @Override
    public void b(final float r18, final float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh.b(float, float, int, android.view.View):void");
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f39273a) {
            case 0:
                un.v0((un) this.f39275c, (TLRPC.TL_game) this.d, (org.telegram.messenger.kj) this.e, (String) this.f39276f, this.f39274b);
                return;
            default:
                org.telegram.ui.Components.p21 p21Var = (org.telegram.ui.Components.p21) this.f39275c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.messenger.sz szVar = (org.telegram.messenger.sz) this.f39276f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j10 = this.f39274b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j10 == ((Integer) obj).intValue()) {
                            p21Var.n(0L, false);
                        }
                    } else {
                        p21Var.f29336k0.addAll(hashSet);
                        p21Var.q();
                        org.telegram.ui.Components.cc.a0(p21Var.f29339s).U(org.telegram.messenger.dd.J0(hashSet.size(), "TopicsDeleted"), false, new ag.a3(p21Var, hashSet, arrayList, j10, 6), new org.telegram.ui.Components.hi0(p21Var, arrayList, szVar, 16)).j();
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

    public lh(un unVar, TLRPC.TL_game tL_game, org.telegram.messenger.kj kjVar, String str, long j10) {
        this.f39273a = 0;
        this.f39275c = unVar;
        this.d = tL_game;
        this.e = kjVar;
        this.f39276f = str;
        this.f39274b = j10;
    }

    public lh(org.telegram.ui.Components.p21 p21Var, ArrayList arrayList, long j10, HashSet hashSet, org.telegram.messenger.sz szVar) {
        this.f39273a = 2;
        this.f39275c = p21Var;
        this.d = arrayList;
        this.f39274b = j10;
        this.e = hashSet;
        this.f39276f = szVar;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
