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
public class al0 {
    public final int f22684a;
    public int f22685b;
    public boolean f22686c;
    public boolean d;
    public final Object e;
    public final Object f22687f;
    public Object f22688g;
    public Object h;
    public Object f22689i;
    public final Object f22690j;
    public Object f22691k;

    public al0(xl0 xl0Var, s4.c0 c0Var) {
        this.f22684a = 0;
        this.f22690j = new SparseArray();
        this.f22691k = new HashMap();
        this.e = xl0Var;
        this.f22687f = c0Var;
    }

    public final void a() {
        switch (this.f22684a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f22688g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                xl0 xl0Var = (xl0) this.e;
                xl0Var.setVerticalScrollBarEnabled(true);
                xl0Var.X1 = false;
                s4.h0 adapter = xl0Var.getAdapter();
                if (adapter instanceof yk0) {
                    ((yk0) adapter).E();
                }
                this.f22688g = null;
                int childCount = xl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = xl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                }
                return;
            default:
                p4.q qVar = (p4.q) this.e;
                if (!this.f22686c && !this.d) {
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
        c0.k kVar;
        p4.v vVar = (p4.v) this.f22687f;
        int i10 = this.f22685b;
        WeakReference weakReference = (WeakReference) this.f22690j;
        p4.x.b();
        if (!this.f22686c && !this.d) {
            p4.e eVar = (p4.e) weakReference.get();
            if (eVar != null && eVar.f40822g == this && ((kVar = (c0.k) this.f22691k) == null || !kVar.isCancelled())) {
                this.f22686c = true;
                eVar.f40822g = null;
                p4.e eVar2 = (p4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f40819b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f40818a.obtainMessage(263, vVar);
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
                    p4.b bVar = eVar3.f40818a;
                    p4.v vVar2 = (p4.v) this.f22688g;
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
                    eVar3.f40819b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f22689i;
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
        yk0 yk0Var;
        s4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f22691k;
        SparseArray sparseArray = (SparseArray) this.f22690j;
        s4.c0 c0Var = (s4.c0) this.f22687f;
        xl0 xl0Var = (xl0) this.e;
        if (!xl0Var.X1) {
            if (xl0Var.getItemAnimator() != null) {
                if (z11) {
                    s4.m0 itemAnimator = xl0Var.getItemAnimator();
                    vk0 vk0Var = new vk0(this, i10, i11, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f43039b.add(vk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (xl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f22685b == -1) {
                c0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = xl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f22685b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                xl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                s4.h0 adapter = xl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = xl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(s4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f43009b && !this.f22686c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f22686c) {
                            int b10 = ((s4.p0) childAt.getLayoutParams()).f43065a.b();
                            if (b10 < 0) {
                                h0Var = adapter;
                                i12++;
                                adapter = h0Var;
                            } else {
                                h0Var = adapter;
                                j3 = adapter.i(b10);
                            }
                        } else {
                            h0Var = adapter;
                            j3 = ((s4.p0) childAt.getLayoutParams()).f43065a.e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = h0Var;
                }
                s4.h0 h0Var2 = adapter;
                xl0Var.B0();
                xl0Var.o0();
                ra.a aVar = xl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f42461b = 0;
                of.e eVar = xl0Var.f2832b;
                s4.h0 h0Var3 = xl0Var.f2858w;
                eVar.d(h0Var3, h0Var3);
                xl0Var.f2855t0.f43120f = true;
                xl0Var.e.S();
                eVar.l();
                if (h0Var2 instanceof yk0) {
                    yk0Var = (yk0) h0Var2;
                } else {
                    yk0Var = null;
                }
                yk0 yk0Var2 = yk0Var;
                c0Var.i1(i10, i11, z10);
                if (h0Var2 != null) {
                    h0Var2.l();
                }
                xl0Var.B0();
                xl0Var.setVerticalScrollBarEnabled(false);
                w7.z5 z5Var = (w7.z5) this.f22689i;
                if (z5Var != null) {
                    z5Var.c();
                }
                xl0Var.X1 = true;
                if (yk0Var2 != null) {
                    yk0Var2.f30655c = true;
                    yk0Var2.d = false;
                    yk0Var2.e.clear();
                    yk0Var2.f30656f.clear();
                }
                xl0Var.addOnLayoutChangeListener(new xk0(this, h0Var2, arrayList, z12, yk0Var2));
                return;
            }
            c0Var.i1(i10, i11, z10);
        }
    }

    public void d(w7.z5 z5Var) {
        this.f22689i = z5Var;
    }

    public al0(p4.e eVar, p4.v vVar, p4.q qVar, int i10, p4.v vVar2, Collection collection) {
        this.f22684a = 1;
        this.f22691k = null;
        this.f22686c = false;
        this.d = false;
        this.f22690j = new WeakReference(eVar);
        this.f22688g = vVar;
        this.e = qVar;
        this.f22685b = i10;
        this.f22687f = eVar.d;
        this.h = vVar2;
        this.f22689i = collection != null ? new ArrayList(collection) : null;
        eVar.f40818a.postDelayed(new org.telegram.ui.web.q0(this, 9), 15000L);
    }
}
