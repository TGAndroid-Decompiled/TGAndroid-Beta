package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class wi0 {
    public final int f41353a;
    public int f41354b;
    public boolean f41355c;
    public boolean d;
    public final Object f41356e;
    public final Object f41357f;
    public Object f41358g;
    public Object h;
    public Object f41359i;
    public final Object f41360j;
    public Object f41361k;

    public wi0(uj0 uj0Var, v4.b0 b0Var) {
        this.f41353a = 0;
        this.f41360j = new SparseArray();
        this.f41361k = new HashMap();
        this.f41356e = uj0Var;
        this.f41357f = b0Var;
    }

    public final void a() {
        switch (this.f41353a) {
            case 0:
                ValueAnimator valueAnimator = (ValueAnimator) this.f41358g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                uj0 uj0Var = (uj0) this.f41356e;
                uj0Var.setVerticalScrollBarEnabled(true);
                uj0Var.W1 = false;
                v4.h0 adapter = uj0Var.getAdapter();
                if (adapter instanceof ui0) {
                    ((ui0) adapter).E();
                }
                this.f41358g = null;
                int childCount = uj0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = uj0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).b(false, false);
                    }
                }
                return;
            default:
                s4.q qVar = (s4.q) this.f41356e;
                if (!this.f41355c && !this.d) {
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
        s4.v vVar = (s4.v) this.f41357f;
        int i7 = this.f41354b;
        WeakReference weakReference = (WeakReference) this.f41360j;
        s4.x.b();
        if (!this.f41355c && !this.d) {
            s4.e eVar = (s4.e) weakReference.get();
            if (eVar != null && eVar.f56358g == this && ((lVar = (c0.l) this.f41361k) == null || !lVar.isCancelled())) {
                this.f41355c = true;
                eVar.f56358g = null;
                s4.e eVar2 = (s4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f56354b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f56353a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i7;
                        obtainMessage.sendToTarget();
                        s4.q qVar = eVar2.f56356e;
                        if (qVar != null) {
                            qVar.h(i7);
                            eVar2.f56356e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s4.q qVar2 : hashMap.values()) {
                                qVar2.h(i7);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f56356e = null;
                    }
                }
                s4.e eVar3 = (s4.e) weakReference.get();
                if (eVar3 != null) {
                    s4.b bVar = eVar3.f56353a;
                    s4.v vVar2 = (s4.v) this.f41358g;
                    eVar3.d = vVar2;
                    eVar3.f56356e = (s4.q) this.f41356e;
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
                    eVar3.f56354b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f41359i;
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

    public void c(int i7, int i10, boolean z10) {
        d(i7, i10, z10, false);
    }

    public void d(int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        ui0 ui0Var;
        v4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f41361k;
        SparseArray sparseArray = (SparseArray) this.f41360j;
        v4.b0 b0Var = (v4.b0) this.f41357f;
        uj0 uj0Var = (uj0) this.f41356e;
        if (!uj0Var.W1) {
            if (uj0Var.getItemAnimator() != null) {
                if (z11) {
                    v4.m0 itemAnimator = uj0Var.getItemAnimator();
                    ri0 ri0Var = new ri0(this, i7, i10, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        d(i7, i10, z10, false);
                    } else {
                        itemAnimator.f58607b.add(ri0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (uj0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f41354b == -1) {
                b0Var.i1(i7, i10, z10);
                return;
            }
            int childCount = uj0Var.getChildCount();
            if (childCount != 0 && uj0Var.getVisibility() == 0 && org.telegram.messenger.np.e1().getBoolean("view_animations", true)) {
                if (this.f41354b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                uj0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                v4.h0 adapter = uj0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = uj0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(v4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f58571b && !this.f41355c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f41355c) {
                            int b10 = ((v4.p0) childAt.getLayoutParams()).f58637a.b();
                            if (b10 < 0) {
                                h0Var = adapter;
                                i11++;
                                adapter = h0Var;
                            } else {
                                h0Var = adapter;
                                j3 = adapter.c(b10);
                            }
                        } else {
                            h0Var = adapter;
                            j3 = ((v4.p0) childAt.getLayoutParams()).f58637a.f58538e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).b(true, true);
                    }
                    i11++;
                    adapter = h0Var;
                }
                v4.h0 h0Var2 = adapter;
                uj0Var.C0();
                uj0Var.p0();
                ug.l0 l0Var = uj0Var.d;
                l0Var.l((ArrayList) l0Var.d);
                l0Var.l((ArrayList) l0Var.f58199e);
                l0Var.f58197b = 0;
                v4.w0 w0Var = uj0Var.f2796b;
                v4.h0 h0Var3 = uj0Var.f2825x;
                w0Var.d(h0Var3, h0Var3);
                uj0Var.f2822v0.f58504f = true;
                uj0Var.f2801e.E();
                w0Var.l();
                if (h0Var2 instanceof ui0) {
                    ui0Var = (ui0) h0Var2;
                } else {
                    ui0Var = null;
                }
                ui0 ui0Var2 = ui0Var;
                b0Var.i1(i7, i10, z10);
                if (h0Var2 != null) {
                    h0Var2.f();
                }
                uj0Var.C0();
                uj0Var.setVerticalScrollBarEnabled(false);
                c8.ma maVar = (c8.ma) this.f41359i;
                if (maVar != null) {
                    maVar.c();
                }
                uj0Var.W1 = true;
                if (ui0Var2 != null) {
                    ui0Var2.f40033c = true;
                    ui0Var2.d = false;
                    ui0Var2.f40034e.clear();
                    ui0Var2.f40035f.clear();
                }
                uj0Var.addOnLayoutChangeListener(new ti0(this, h0Var2, arrayList, z12, ui0Var2));
                return;
            }
            b0Var.i1(i7, i10, z10);
        }
    }

    public void e(c8.ma maVar) {
        this.f41359i = maVar;
    }

    public wi0(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.f41353a = 1;
        this.f41361k = null;
        this.f41355c = false;
        this.d = false;
        this.f41360j = new WeakReference(eVar);
        this.f41358g = vVar;
        this.f41356e = qVar;
        this.f41354b = i7;
        this.f41357f = eVar.d;
        this.h = vVar2;
        this.f41359i = collection != null ? new ArrayList(collection) : null;
        eVar.f56353a.postDelayed(new q2.d(this, 7), 15000L);
    }
}
