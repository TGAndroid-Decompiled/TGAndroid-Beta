package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
public class ml0 {
    public final int f28546a;
    public int f28547b;
    public boolean f28548c;
    public boolean d;
    public final Object e;
    public final Object f28549f;
    public Object f28550g;
    public Object h;
    public Object f28551i;
    public final Object f28552j;
    public Object f28553k;

    public ml0(jm0 jm0Var, s4.b0 b0Var) {
        this.f28546a = 0;
        this.f28552j = new SparseArray();
        this.f28553k = new HashMap();
        this.e = jm0Var;
        this.f28549f = b0Var;
    }

    public final void a() {
        switch (this.f28546a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f28550g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                jm0 jm0Var = (jm0) this.e;
                jm0Var.setVerticalScrollBarEnabled(true);
                jm0Var.V1 = false;
                s4.g0 adapter = jm0Var.getAdapter();
                if (adapter instanceof kl0) {
                    ((kl0) adapter).E();
                }
                this.f28550g = null;
                int childCount = jm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = jm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f28548c && !this.d) {
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
        p4.v vVar = (p4.v) this.f28549f;
        int i10 = this.f28547b;
        WeakReference weakReference = (WeakReference) this.f28552j;
        p4.x.b();
        if (!this.f28548c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f44104g == this && ((lVar = (c0.l) this.f28553k) == null || !lVar.isCancelled())) {
                this.f28548c = true;
                eVar.f44104g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f44101b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f44100a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        p4.q qVar = eVar2.e;
                        if (qVar != null) {
                            qVar.h(i10);
                            eVar2.e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (p4.q qVar2 : hashMap.values()) {
                                qVar2.h(i10);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.e = null;
                    }
                }
                p4.e eVar3 = (p4.e) weakReference.get();
                if (eVar3 != null) {
                    p4.b bVar = eVar3.f44100a;
                    p4.v vVar2 = (p4.v) this.f28550g;
                    eVar3.d = vVar2;
                    eVar3.e = (p4.q) this.e;
                    p4.v vVar3 = (p4.v) this.h;
                    if (vVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
                        obtainMessage2.arg1 = i10;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
                        obtainMessage3.arg1 = i10;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f44101b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f28551i;
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

    public void c(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        kl0 kl0Var;
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f28553k;
        SparseArray sparseArray = (SparseArray) this.f28552j;
        s4.b0 b0Var = (s4.b0) this.f28549f;
        jm0 jm0Var = (jm0) this.e;
        if (!jm0Var.V1) {
            if (jm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.l0 itemAnimator = jm0Var.getItemAnimator();
                    hl0 hl0Var = new hl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f45998b.add(hl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (jm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f28547b == -1) {
                b0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = jm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f28547b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                jm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.g0 adapter = jm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = jm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(s4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f45966b && !this.f28548c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f28548c) {
                            int b10 = ((s4.o0) childAt.getLayoutParams()).f46024a.b();
                            if (b10 < 0) {
                                g0Var = adapter;
                                i12++;
                                adapter = g0Var;
                            } else {
                                g0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            g0Var = adapter;
                            j10 = ((s4.o0) childAt.getLayoutParams()).f46024a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).e(true, true);
                    }
                    i12++;
                    adapter = g0Var;
                }
                s4.g0 g0Var2 = adapter;
                jm0Var.B0();
                jm0Var.o0();
                s4.b bVar = jm0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.e);
                bVar.f45904b = 0;
                qf.e eVar = jm0Var.f3603b;
                s4.g0 g0Var3 = jm0Var.f3629w;
                eVar.d(g0Var3, g0Var3);
                jm0Var.f3627u0.f46079f = true;
                jm0Var.e.R();
                eVar.l();
                if (g0Var2 instanceof kl0) {
                    kl0Var = (kl0) g0Var2;
                } else {
                    kl0Var = null;
                }
                kl0 kl0Var2 = kl0Var;
                b0Var.i1(i10, i11, z10);
                if (g0Var2 != null) {
                    g0Var2.l();
                }
                jm0Var.B0();
                jm0Var.setVerticalScrollBarEnabled(false);
                w7.a6 a6Var = (w7.a6) this.f28551i;
                if (a6Var != null) {
                    a6Var.c();
                }
                jm0Var.V1 = true;
                if (kl0Var2 != null) {
                    kl0Var2.f27904c = true;
                    kl0Var2.d = false;
                    kl0Var2.e.clear();
                    kl0Var2.f27905f.clear();
                }
                jm0Var.addOnLayoutChangeListener(new jl0(this, g0Var2, arrayList, z12, kl0Var2));
                return;
            }
            b0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.a6 a6Var) {
        this.f28551i = a6Var;
    }

    public ml0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f28546a = 1;
        this.f28553k = null;
        this.f28548c = false;
        this.d = false;
        this.f28552j = new WeakReference(eVar);
        this.f28550g = vVar;
        this.e = qVar;
        this.f28547b = i10;
        this.f28549f = eVar.d;
        this.h = vVar2;
        this.f28551i = collection != null ? new ArrayList(collection) : null;
        eVar.f44100a.postDelayed(new org.telegram.ui.web.z1(this, 3), 15000L);
    }
}
