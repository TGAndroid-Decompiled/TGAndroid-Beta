package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class ri0 {
    public final int f37691a;
    public int f37692b;
    public boolean f37693c;
    public boolean d;
    public final Object f37694e;
    public final Object f37695f;
    public Object f37696g;
    public Object h;
    public Object f37697i;
    public final Object f37698j;
    public Object f37699k;

    public ri0(pj0 pj0Var, v4.b0 b0Var) {
        this.f37691a = 0;
        this.f37698j = new SparseArray();
        this.f37699k = new HashMap();
        this.f37694e = pj0Var;
        this.f37695f = b0Var;
    }

    public final void a() {
        switch (this.f37691a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f37696g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pj0 pj0Var = (pj0) this.f37694e;
                pj0Var.setVerticalScrollBarEnabled(true);
                pj0Var.V1 = false;
                v4.g0 adapter = pj0Var.getAdapter();
                if (adapter instanceof pi0) {
                    ((pi0) adapter).E();
                }
                this.f37696g = null;
                int childCount = pj0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = pj0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(false, false);
                    }
                }
                return;
            default:
                s4.q qVar = (s4.q) this.f37694e;
                if (!this.f37693c && !this.d) {
                    this.d = true;
                    if (qVar != null) {
                        qVar.h(0);
                        qVar.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void b() {
        c0.l lVar;
        s4.v vVar = (s4.v) this.f37695f;
        int i7 = this.f37692b;
        WeakReference weakReference = (WeakReference) this.f37698j;
        s4.x.b();
        if (!this.f37693c && !this.d) {
            s4.e eVar = (s4.e) weakReference.get();
            if (eVar != null && eVar.f54701g == this && ((lVar = (c0.l) this.f37699k) == null || !lVar.isCancelled())) {
                this.f37693c = true;
                eVar.f54701g = null;
                s4.e eVar2 = (s4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f54697b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f54696a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i7;
                        obtainMessage.sendToTarget();
                        s4.q qVar = eVar2.f54699e;
                        if (qVar != null) {
                            qVar.h(i7);
                            eVar2.f54699e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s4.q qVar2 : hashMap.values()) {
                                qVar2.h(i7);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f54699e = null;
                    }
                }
                s4.e eVar3 = (s4.e) weakReference.get();
                if (eVar3 != null) {
                    s4.b bVar = eVar3.f54696a;
                    s4.v vVar2 = (s4.v) this.f37696g;
                    eVar3.d = vVar2;
                    eVar3.f54699e = (s4.q) this.f37694e;
                    s4.v vVar3 = (s4.v) this.h;
                    if (vVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
                        obtainMessage2.arg1 = i7;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
                        obtainMessage3.arg1 = i7;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f54697b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f37697i;
                    if (arrayList != null) {
                        eVar3.d.n(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            a();
        }
    }

    public void c(int i7, int i10, boolean z9) {
        d(i7, i10, z9, false);
    }

    public void d(int i7, int i10, boolean z9, boolean z10) {
        boolean z11;
        pi0 pi0Var;
        v4.g0 g0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f37699k;
        SparseArray sparseArray = (SparseArray) this.f37698j;
        v4.b0 b0Var = (v4.b0) this.f37695f;
        pj0 pj0Var = (pj0) this.f37694e;
        if (!pj0Var.V1) {
            if (pj0Var.getItemAnimator() != null) {
                if (z10) {
                    v4.l0 itemAnimator = pj0Var.getItemAnimator();
                    mi0 mi0Var = new mi0(this, i7, i10, z9);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i7, i10, z9, false);
                    } else {
                        itemAnimator.f57023b.add(mi0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (pj0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f37692b == -1) {
                b0Var.i1(i7, i10, z9);
                return;
            }
            int childCount = pj0Var.getChildCount();
            if (childCount != 0 && pj0Var.getVisibility() == 0 && org.telegram.messenger.qp.e1().getBoolean("view_animations", true)) {
                if (this.f37692b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pj0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                v4.g0 adapter = pj0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = pj0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(v4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f56986b && !this.f37693c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f37693c) {
                            int b10 = ((v4.o0) childAt.getLayoutParams()).f57052a.b();
                            if (b10 < 0) {
                                g0Var = adapter;
                                i11++;
                                adapter = g0Var;
                            } else {
                                g0Var = adapter;
                                j3 = adapter.c(b10);
                            }
                        } else {
                            g0Var = adapter;
                            j3 = ((v4.o0) childAt.getLayoutParams()).f57052a.f56955e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(true, true);
                    }
                    i11++;
                    adapter = g0Var;
                }
                v4.g0 g0Var2 = adapter;
                pj0Var.C0();
                pj0Var.p0();
                ug.k0 k0Var = pj0Var.d;
                k0Var.l((ArrayList) k0Var.d);
                k0Var.l((ArrayList) k0Var.f56586e);
                k0Var.f56584b = 0;
                v4.v0 v0Var = pj0Var.f2842b;
                v4.g0 g0Var3 = pj0Var.f2871x;
                v0Var.d(g0Var3, g0Var3);
                pj0Var.f2867u0.f56910f = true;
                pj0Var.f2847e.G();
                v0Var.l();
                if (g0Var2 instanceof pi0) {
                    pi0Var = (pi0) g0Var2;
                } else {
                    pi0Var = null;
                }
                pi0 pi0Var2 = pi0Var;
                b0Var.i1(i7, i10, z9);
                if (g0Var2 != null) {
                    g0Var2.f();
                }
                pj0Var.C0();
                pj0Var.setVerticalScrollBarEnabled(false);
                c8.ja jaVar = (c8.ja) this.f37697i;
                if (jaVar != null) {
                    jaVar.c();
                }
                pj0Var.V1 = true;
                if (pi0Var2 != null) {
                    pi0Var2.f36903c = true;
                    pi0Var2.d = false;
                    pi0Var2.f36904e.clear();
                    pi0Var2.f36905f.clear();
                }
                pj0Var.addOnLayoutChangeListener(new oi0(this, g0Var2, arrayList, z11, pi0Var2));
                return;
            }
            b0Var.i1(i7, i10, z9);
        }
    }

    public void e(c8.ja jaVar) {
        this.f37697i = jaVar;
    }

    public ri0(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.f37691a = 1;
        this.f37699k = null;
        this.f37693c = false;
        this.d = false;
        this.f37698j = new WeakReference(eVar);
        this.f37696g = vVar;
        this.f37694e = qVar;
        this.f37692b = i7;
        this.f37695f = eVar.d;
        this.h = vVar2;
        this.f37697i = collection != null ? new ArrayList(collection) : null;
        eVar.f54696a.postDelayed(new org.telegram.ui.ActionBar.m5(this, 27), 15000L);
    }
}
