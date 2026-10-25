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
    public final int f31594a;
    public int f31595b;
    public boolean f31596c;
    public boolean d;
    public final Object e;
    public final Object f31597f;
    public Object f31598g;
    public Object h;
    public Object f31599i;
    public final Object f31600j;
    public Object f31601k;

    public pl0(mm0 mm0Var, s4.c0 c0Var) {
        this.f31594a = 0;
        this.f31600j = new SparseArray();
        this.f31601k = new HashMap();
        this.e = mm0Var;
        this.f31597f = c0Var;
    }

    public final void a() {
        switch (this.f31594a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f31598g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                mm0 mm0Var = (mm0) this.e;
                mm0Var.setVerticalScrollBarEnabled(true);
                mm0Var.V1 = false;
                s4.h0 adapter = mm0Var.getAdapter();
                if (adapter instanceof nl0) {
                    ((nl0) adapter).E();
                }
                this.f31598g = null;
                int childCount = mm0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = mm0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) childAt).b(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f31596c && !this.d) {
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
        p4.v vVar = (p4.v) this.f31597f;
        int i10 = this.f31595b;
        WeakReference weakReference = (WeakReference) this.f31600j;
        p4.x.b();
        if (!this.f31596c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f46659g == this && ((lVar = (c0.l) this.f31601k) == null || !lVar.isCancelled())) {
                this.f31596c = true;
                eVar.f46659g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f46656b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f46655a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f46655a;
                    p4.v vVar2 = (p4.v) this.f31598g;
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
                    eVar3.f46656b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f31599i;
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
        s4.h0 h0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f31601k;
        SparseArray sparseArray = (SparseArray) this.f31600j;
        s4.c0 c0Var = (s4.c0) this.f31597f;
        mm0 mm0Var = (mm0) this.e;
        if (!mm0Var.V1) {
            if (mm0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = mm0Var.getItemAnimator();
                    jl0 jl0Var = new jl0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f47799b.add(jl0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (mm0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f31595b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = mm0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f31595b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                mm0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = mm0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = mm0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f47766b && !this.f31596c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f31596c) {
                            int b10 = ((s4.q0) childAt.getLayoutParams()).f47829a.b();
                            if (b10 < 0) {
                                h0Var = adapter;
                                i12++;
                                adapter = h0Var;
                            } else {
                                h0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            h0Var = adapter;
                            j10 = ((s4.q0) childAt.getLayoutParams()).f47829a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) childAt).b(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                mm0Var.C0();
                mm0Var.p0();
                s4.b bVar = mm0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.e);
                bVar.f47684b = 0;
                rf.e eVar = mm0Var.f3056b;
                s4.h0 h0Var3 = mm0Var.f3082w;
                eVar.d(h0Var3, h0Var3);
                mm0Var.f3080u0.f47694f = true;
                mm0Var.e.r();
                eVar.l();
                if (h0Var2 instanceof nl0) {
                    nl0Var = (nl0) h0Var2;
                } else {
                    nl0Var = null;
                }
                nl0 nl0Var2 = nl0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                mm0Var.C0();
                mm0Var.setVerticalScrollBarEnabled(false);
                gb1 gb1Var = (gb1) this.f31599i;
                if (gb1Var != null) {
                    gb1Var.Q();
                }
                mm0Var.V1 = true;
                if (nl0Var2 != null) {
                    nl0Var2.f31037c = true;
                    nl0Var2.d = false;
                    nl0Var2.e.clear();
                    nl0Var2.f31038f.clear();
                }
                mm0Var.addOnLayoutChangeListener(new ml0(this, h0Var2, arrayList, z12, nl0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void d(gb1 gb1Var) {
        this.f31599i = gb1Var;
    }

    public pl0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f31594a = 1;
        this.f31601k = null;
        this.f31596c = false;
        this.d = false;
        this.f31600j = new WeakReference(eVar);
        this.f31598g = vVar;
        this.e = qVar;
        this.f31595b = i10;
        this.f31597f = eVar.d;
        this.h = vVar2;
        this.f31599i = collection != null ? new ArrayList(collection) : null;
        eVar.f46655a.postDelayed(new org.telegram.ui.web.h1(this, 6), 15000L);
    }
}
