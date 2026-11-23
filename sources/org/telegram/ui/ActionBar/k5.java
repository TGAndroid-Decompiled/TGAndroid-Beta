package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import c8.ra;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fj0;
public class k5 implements t4 {
    public final int f29151a;
    public int f29152b;
    public boolean f29153c;
    public boolean d;
    public final Object f29154e;
    public final Object f29155f;
    public Object h;
    public Object f29156n;
    public Object f29157r;
    public final Object f29158s;
    public Object f29159w;

    public k5(j5 j5Var, ri.a aVar, h6 h6Var) {
        this.f29151a = 0;
        this.f29152b = 0;
        this.f29158s = new int[2];
        this.f29159w = new Rect();
        this.f29154e = j5Var;
        this.f29155f = aVar;
        this.h = h6Var;
        this.f29156n = c8.j0.m(h6Var);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b(q0 q0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.f29157r).getWidth(), ((View) this.f29157r).getHeight());
        return true;
    }

    public void c() {
        switch (this.f29151a) {
            case 1:
                ValueAnimator valueAnimator = (ValueAnimator) this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ek0 ek0Var = (ek0) this.f29154e;
                ek0Var.setVerticalScrollBarEnabled(true);
                ek0Var.W1 = false;
                v4.h0 adapter = ek0Var.getAdapter();
                if (adapter instanceof fj0) {
                    ((fj0) adapter).E();
                }
                this.h = null;
                int childCount = ek0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ek0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.q4) {
                        ((org.telegram.ui.Cells.q4) childAt).c(false, false);
                    }
                }
                return;
            default:
                s4.q qVar = (s4.q) this.f29154e;
                if (!this.f29153c && !this.d) {
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

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f() {
        int i7;
        int[] iArr = (int[]) this.f29158s;
        Rect rect = (Rect) this.f29159w;
        View view = (View) this.f29157r;
        if (view != null && !this.d) {
            view.getLocationOnScreen(iArr);
            ((View) this.f29157r).getWindowVisibleDisplayFrame(rect);
            if (rect.height() > 0) {
                i7 = rect.centerY();
            } else {
                i7 = org.telegram.messenger.g0.f24010q.y / 2;
            }
            if ((((View) this.f29157r).getHeight() / 2) + iArr[1] > i7) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public fh.g g(j5 j5Var) {
        fh.g c10 = ((ri.a) this.f29155f).d.c(j5Var, null, false);
        c10.p((gh.e) this.f29156n);
        o10.s(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f29156n;
        return eVar.a(eVar.f13620e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f29156n;
    }

    @Override
    public int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public gh.a getMenuGlassColorProvider() {
        return (gh.e) this.f29156n;
    }

    @Override
    public View getMenuHostView() {
        return (View) this.f29157r;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public h6 getMenuResourcesProvider() {
        return (h6) this.h;
    }

    @Override
    public int getMenuRise() {
        return 0;
    }

    @Override
    public View getMenuView() {
        return (View) this.f29157r;
    }

    @Override
    public j5 getOpenMenuOverlay() {
        if (this.f29153c) {
            return (j5) this.f29154e;
        }
        return null;
    }

    @Override
    public void h(j5 j5Var, q0 q0Var) {
        boolean z10;
        if (j5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29153c != z10) {
            this.f29153c = z10;
            if (z10) {
                this.f29152b = ((View) this.f29157r).getVisibility();
                ((View) this.f29157r).setVisibility(4);
            } else if (((View) this.f29157r).getVisibility() == 4) {
                ((View) this.f29157r).setVisibility(this.f29152b);
            }
        }
    }

    public void i() {
        c0.l lVar;
        s4.v vVar = (s4.v) this.f29155f;
        int i7 = this.f29152b;
        WeakReference weakReference = (WeakReference) this.f29158s;
        s4.x.b();
        if (!this.f29153c && !this.d) {
            s4.e eVar = (s4.e) weakReference.get();
            if (eVar != null && eVar.f56942g == this && ((lVar = (c0.l) this.f29159w) == null || !lVar.isCancelled())) {
                this.f29153c = true;
                eVar.f56942g = null;
                s4.e eVar2 = (s4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f56938b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f56937a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i7;
                        obtainMessage.sendToTarget();
                        s4.q qVar = eVar2.f56940e;
                        if (qVar != null) {
                            qVar.h(i7);
                            eVar2.f56940e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s4.q qVar2 : hashMap.values()) {
                                qVar2.h(i7);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f56940e = null;
                    }
                }
                s4.e eVar3 = (s4.e) weakReference.get();
                if (eVar3 != null) {
                    s4.b bVar = eVar3.f56937a;
                    s4.v vVar2 = (s4.v) this.h;
                    eVar3.d = vVar2;
                    eVar3.f56940e = (s4.q) this.f29154e;
                    s4.v vVar3 = (s4.v) this.f29156n;
                    if (vVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
                        obtainMessage2.arg1 = i7;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
                        obtainMessage3.arg1 = i7;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f56938b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f29157r;
                    if (arrayList != null) {
                        eVar3.d.n(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            c();
        }
    }

    public void j(int i7, int i10, boolean z10) {
        k(i7, i10, z10, false);
    }

    public void k(int i7, int i10, boolean z10, boolean z11) {
        boolean z12;
        fj0 fj0Var;
        v4.h0 h0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f29159w;
        SparseArray sparseArray = (SparseArray) this.f29158s;
        v4.b0 b0Var = (v4.b0) this.f29155f;
        ek0 ek0Var = (ek0) this.f29154e;
        if (!ek0Var.W1) {
            if (ek0Var.getItemAnimator() != null) {
                if (z11) {
                    v4.m0 itemAnimator = ek0Var.getItemAnimator();
                    cj0 cj0Var = new cj0(this, i7, i10, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        k(i7, i10, z10, false);
                    } else {
                        itemAnimator.f59182b.add(cj0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (ek0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f29152b == -1) {
                b0Var.i1(i7, i10, z10);
                return;
            }
            int childCount = ek0Var.getChildCount();
            if (childCount != 0 && ek0Var.getVisibility() == 0 && np.g1().getBoolean("view_animations", true)) {
                if (this.f29152b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ek0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                v4.h0 adapter = ek0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = ek0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    b0Var.getClass();
                    sparseArray.put(v4.o0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f59146b && !this.f29153c)) {
                        h0Var = adapter;
                    } else {
                        if (this.f29153c) {
                            int b10 = ((v4.p0) childAt.getLayoutParams()).f59212a.b();
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
                            j3 = ((v4.p0) childAt.getLayoutParams()).f59212a.f59114e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q4) {
                        ((org.telegram.ui.Cells.q4) childAt).c(true, true);
                    }
                    i11++;
                    adapter = h0Var;
                }
                v4.h0 h0Var2 = adapter;
                ek0Var.C0();
                ek0Var.p0();
                ug.m0 m0Var = ek0Var.d;
                m0Var.l((ArrayList) m0Var.d);
                m0Var.l((ArrayList) m0Var.f58784e);
                m0Var.f58782b = 0;
                v4.w0 w0Var = ek0Var.f2761b;
                v4.h0 h0Var3 = ek0Var.f2790x;
                w0Var.d(h0Var3, h0Var3);
                ek0Var.f2787v0.f59079f = true;
                ek0Var.f2766e.E();
                w0Var.l();
                if (h0Var2 instanceof fj0) {
                    fj0Var = (fj0) h0Var2;
                } else {
                    fj0Var = null;
                }
                fj0 fj0Var2 = fj0Var;
                b0Var.i1(i7, i10, z10);
                if (h0Var2 != null) {
                    h0Var2.f();
                }
                ek0Var.C0();
                ek0Var.setVerticalScrollBarEnabled(false);
                ra raVar = (ra) this.f29157r;
                if (raVar != null) {
                    raVar.c();
                }
                ek0Var.W1 = true;
                if (fj0Var2 != null) {
                    fj0Var2.f35222c = true;
                    fj0Var2.d = false;
                    fj0Var2.f35223e.clear();
                    fj0Var2.f35224f.clear();
                }
                ek0Var.addOnLayoutChangeListener(new ej0(this, h0Var2, arrayList, z12, fj0Var2));
                return;
            }
            b0Var.i1(i7, i10, z10);
        }
    }

    public void l(ra raVar) {
        this.f29157r = raVar;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((ri.a) this.f29155f).f56627e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public k5(ek0 ek0Var, v4.b0 b0Var) {
        this.f29151a = 1;
        this.f29158s = new SparseArray();
        this.f29159w = new HashMap();
        this.f29154e = ek0Var;
        this.f29155f = b0Var;
    }

    public k5(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.f29151a = 2;
        this.f29159w = null;
        this.f29153c = false;
        this.d = false;
        this.f29158s = new WeakReference(eVar);
        this.h = vVar;
        this.f29154e = qVar;
        this.f29152b = i7;
        this.f29155f = eVar.d;
        this.f29156n = vVar2;
        this.f29157r = collection != null ? new ArrayList(collection) : null;
        eVar.f56937a.postDelayed(new org.telegram.ui.web.i1(this, 9), 15000L);
    }
}
