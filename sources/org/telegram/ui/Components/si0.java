package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class si0 {
    public final int f38079a;
    public int f38080b;
    public boolean f38081c;
    public boolean d;
    public final Object f38082e;
    public final Object f38083f;
    public Object f38084g;
    public Object h;
    public Object f38085i;
    public final Object f38086j;
    public Object f38087k;

    public si0(qj0 qj0Var, v4.b0 b0Var) {
        this.f38079a = 0;
        this.f38086j = new SparseArray();
        this.f38087k = new HashMap();
        this.f38082e = qj0Var;
        this.f38083f = b0Var;
    }

    public final void a() {
        switch (this.f38079a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f38084g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qj0 qj0Var = (qj0) this.f38082e;
                qj0Var.setVerticalScrollBarEnabled(true);
                qj0Var.V1 = false;
                v4.g0 adapter = qj0Var.getAdapter();
                if (adapter instanceof qi0) {
                    ((qi0) adapter).E();
                }
                this.f38084g = null;
                int childCount = qj0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = qj0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(false, false);
                    }
                }
                return;
            default:
                s4.q qVar = (s4.q) this.f38082e;
                if (!this.f38081c && !this.d) {
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
        s4.v vVar = (s4.v) this.f38083f;
        int i7 = this.f38080b;
        WeakReference weakReference = (WeakReference) this.f38086j;
        s4.x.b();
        if (!this.f38081c && !this.d) {
            s4.e eVar = (s4.e) weakReference.get();
            if (eVar != null && eVar.f54805g == this && ((lVar = (c0.l) this.f38087k) == null || !lVar.isCancelled())) {
                this.f38081c = true;
                eVar.f54805g = null;
                s4.e eVar2 = (s4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f54801b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f54800a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i7;
                        obtainMessage.sendToTarget();
                        s4.q qVar = eVar2.f54803e;
                        if (qVar != null) {
                            qVar.h(i7);
                            eVar2.f54803e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s4.q qVar2 : hashMap.values()) {
                                qVar2.h(i7);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f54803e = null;
                    }
                }
                s4.e eVar3 = (s4.e) weakReference.get();
                if (eVar3 != null) {
                    s4.b bVar = eVar3.f54800a;
                    s4.v vVar2 = (s4.v) this.f38084g;
                    eVar3.d = vVar2;
                    eVar3.f54803e = (s4.q) this.f38082e;
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
                    eVar3.f54801b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f38085i;
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
        qi0 qi0Var;
        v4.g0 g0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f38087k;
        SparseArray sparseArray = (SparseArray) this.f38086j;
        v4.b0 b0Var = (v4.b0) this.f38083f;
        qj0 qj0Var = (qj0) this.f38082e;
        if (!qj0Var.V1) {
            if (qj0Var.getItemAnimator() != null) {
                if (z10) {
                    v4.l0 itemAnimator = qj0Var.getItemAnimator();
                    ni0 ni0Var = new ni0(this, i7, i10, z9);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i7, i10, z9, false);
                    } else {
                        itemAnimator.f57127b.add(ni0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (qj0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f38080b == -1) {
                b0Var.i1(i7, i10, z9);
                return;
            }
            int childCount = qj0Var.getChildCount();
            if (childCount != 0 && qj0Var.getVisibility() == 0 && org.telegram.messenger.qp.e1().getBoolean("view_animations", true)) {
                if (this.f38080b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qj0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                v4.g0 adapter = qj0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = qj0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(v4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f57090b && !this.f38081c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f38081c) {
                            int b10 = ((v4.o0) childAt.getLayoutParams()).f57156a.b();
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
                            j3 = ((v4.o0) childAt.getLayoutParams()).f57156a.f57059e;
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
                qj0Var.C0();
                qj0Var.p0();
                ug.k0 k0Var = qj0Var.d;
                k0Var.l((ArrayList) k0Var.d);
                k0Var.l((ArrayList) k0Var.f56690e);
                k0Var.f56688b = 0;
                v4.v0 v0Var = qj0Var.f2842b;
                v4.g0 g0Var3 = qj0Var.f2871x;
                v0Var.d(g0Var3, g0Var3);
                qj0Var.f2867u0.f57014f = true;
                qj0Var.f2847e.G();
                v0Var.l();
                if (g0Var2 instanceof qi0) {
                    qi0Var = (qi0) g0Var2;
                } else {
                    qi0Var = null;
                }
                qi0 qi0Var2 = qi0Var;
                b0Var.i1(i7, i10, z9);
                if (g0Var2 != null) {
                    g0Var2.f();
                }
                qj0Var.C0();
                qj0Var.setVerticalScrollBarEnabled(false);
                c8.ja jaVar = (c8.ja) this.f38085i;
                if (jaVar != null) {
                    jaVar.c();
                }
                qj0Var.V1 = true;
                if (qi0Var2 != null) {
                    qi0Var2.f37343c = true;
                    qi0Var2.d = false;
                    qi0Var2.f37344e.clear();
                    qi0Var2.f37345f.clear();
                }
                qj0Var.addOnLayoutChangeListener(new pi0(this, g0Var2, arrayList, z11, qi0Var2));
                return;
            }
            b0Var.i1(i7, i10, z9);
        }
    }

    public void e(c8.ja jaVar) {
        this.f38085i = jaVar;
    }

    public si0(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.f38079a = 1;
        this.f38087k = null;
        this.f38081c = false;
        this.d = false;
        this.f38086j = new WeakReference(eVar);
        this.f38084g = vVar;
        this.f38082e = qVar;
        this.f38080b = i7;
        this.f38083f = eVar.d;
        this.h = vVar2;
        this.f38085i = collection != null ? new ArrayList(collection) : null;
        eVar.f54800a.postDelayed(new org.telegram.ui.ActionBar.o5(this, 25), 15000L);
    }
}
