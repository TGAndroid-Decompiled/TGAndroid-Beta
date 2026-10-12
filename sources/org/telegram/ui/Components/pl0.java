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
public class pl0 {
    public final int f28359a;
    public int f28360b;
    public boolean f28361c;
    public boolean d;
    public final Object e;
    public final Object f28362f;
    public Object f28363g;
    public Object h;
    public Object f28364i;
    public final Object f28365j;
    public Object f28366k;

    public pl0(mm0 mm0Var, s4.b0 b0Var) {
        this.f28359a = 0;
        this.f28365j = new SparseArray();
        this.f28366k = new HashMap();
        this.e = mm0Var;
        this.f28362f = b0Var;
    }

    public final void a() {
        switch (this.f28359a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f28363g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mm0 mm0Var = (mm0) this.e;
                mm0Var.setVerticalScrollBarEnabled(true);
                mm0Var.V1 = false;
                s4.g0 adapter = mm0Var.getAdapter();
                if (adapter instanceof nl0) {
                    ((nl0) adapter).E();
                }
                this.f28363g = null;
                int childCount = mm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = mm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).e(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f28361c && !this.d) {
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
        p4.w wVar = (p4.w) this.f28362f;
        int i10 = this.f28360b;
        WeakReference weakReference = (WeakReference) this.f28365j;
        p4.y.b();
        if (!this.f28361c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f43012g == this && ((lVar = (c0.l) this.f28366k) == null || !lVar.isCancelled())) {
                this.f28361c = true;
                eVar.f43012g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f43009b;
                    if (eVar2.d == wVar) {
                        Message obtainMessage = eVar2.f43008a.obtainMessage(263, wVar);
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
                    p4.b bVar = eVar3.f43008a;
                    p4.w wVar2 = (p4.w) this.f28363g;
                    eVar3.d = wVar2;
                    eVar3.e = (p4.q) this.e;
                    p4.w wVar3 = (p4.w) this.h;
                    if (wVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(wVar, wVar2));
                        obtainMessage2.arg1 = i10;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(wVar3, wVar2));
                        obtainMessage3.arg1 = i10;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f43009b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f28364i;
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
        nl0 nl0Var;
        s4.g0 g0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f28366k;
        SparseArray sparseArray = (SparseArray) this.f28365j;
        s4.b0 b0Var = (s4.b0) this.f28362f;
        mm0 mm0Var = (mm0) this.e;
        if (!mm0Var.V1) {
            if (mm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.l0 itemAnimator = mm0Var.getItemAnimator();
                    kl0 kl0Var = new kl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f44916b.add(kl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (mm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f28360b == -1) {
                b0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = mm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f28360b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                mm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.g0 adapter = mm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = mm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(s4.n0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f44884b && !this.f28361c)) {
                        g0Var = adapter;
                    } else {
                        if (this.f28361c) {
                            int b10 = ((s4.o0) childAt.getLayoutParams()).f44942a.b();
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
                            j10 = ((s4.o0) childAt.getLayoutParams()).f44942a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).e(true, true);
                    }
                    i12++;
                    adapter = g0Var;
                }
                s4.g0 g0Var2 = adapter;
                mm0Var.B0();
                mm0Var.o0();
                s4.b bVar = mm0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.e);
                bVar.f44822b = 0;
                qf.e eVar = mm0Var.f1989b;
                s4.g0 g0Var3 = mm0Var.f2015w;
                eVar.d(g0Var3, g0Var3);
                mm0Var.f2013u0.f44997f = true;
                mm0Var.e.R();
                eVar.l();
                if (g0Var2 instanceof nl0) {
                    nl0Var = (nl0) g0Var2;
                } else {
                    nl0Var = null;
                }
                nl0 nl0Var2 = nl0Var;
                b0Var.i1(i10, i11, z10);
                if (g0Var2 != null) {
                    g0Var2.l();
                }
                mm0Var.B0();
                mm0Var.setVerticalScrollBarEnabled(false);
                w7.b6 b6Var = (w7.b6) this.f28364i;
                if (b6Var != null) {
                    b6Var.c();
                }
                mm0Var.V1 = true;
                if (nl0Var2 != null) {
                    nl0Var2.f27685c = true;
                    nl0Var2.d = false;
                    nl0Var2.e.clear();
                    nl0Var2.f27686f.clear();
                }
                mm0Var.addOnLayoutChangeListener(new ml0(this, g0Var2, arrayList, z12, nl0Var2));
                return;
            }
            b0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.b6 b6Var) {
        this.f28364i = b6Var;
    }

    public pl0(p4.e eVar, p4.w wVar, p4.q qVar, int i10, p4.w wVar2, Collection collection) {
        this.f28359a = 1;
        this.f28366k = null;
        this.f28361c = false;
        this.d = false;
        this.f28365j = new WeakReference(eVar);
        this.f28363g = wVar;
        this.e = qVar;
        this.f28360b = i10;
        this.f28362f = eVar.d;
        this.h = wVar2;
        this.f28364i = collection != null ? new ArrayList(collection) : null;
        eVar.f43008a.postDelayed(new org.telegram.ui.Components.voip.m2(this, 14), 15000L);
    }
}
