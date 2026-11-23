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
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fj0;
public class l5 implements t4 {
    public final int f29283a;
    public int f29284b;
    public boolean f29285c;
    public boolean d;
    public final Object f29286e;
    public final Object f29287f;
    public Object h;
    public Object f29288n;
    public Object f29289r;
    public final Object f29290s;
    public Object f29291w;

    public l5(k5 k5Var, ri.a aVar, i6 i6Var) {
        this.f29283a = 0;
        this.f29284b = 0;
        this.f29290s = new int[2];
        this.f29291w = new Rect();
        this.f29286e = k5Var;
        this.f29287f = aVar;
        this.h = i6Var;
        this.f29288n = c8.j0.m(i6Var);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b(q0 q0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.f29289r).getWidth(), ((View) this.f29289r).getHeight());
        return true;
    }

    public void c() {
        switch (this.f29283a) {
            case 1:
                ValueAnimator valueAnimator = (ValueAnimator) this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ek0 ek0Var = (ek0) this.f29286e;
                ek0Var.setVerticalScrollBarEnabled(true);
                ek0Var.W1 = false;
                v4.i0 adapter = ek0Var.getAdapter();
                if (adapter instanceof fj0) {
                    ((fj0) adapter).E();
                }
                this.h = null;
                int childCount = ek0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ek0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.q4) {
                        ((org.telegram.ui.Cells.q4) childAt).b(false, false);
                    }
                }
                return;
            default:
                s4.q qVar = (s4.q) this.f29286e;
                if (!this.f29285c && !this.d) {
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
        int[] iArr = (int[]) this.f29290s;
        Rect rect = (Rect) this.f29291w;
        View view = (View) this.f29289r;
        if (view != null && !this.d) {
            view.getLocationOnScreen(iArr);
            ((View) this.f29289r).getWindowVisibleDisplayFrame(rect);
            if (rect.height() > 0) {
                i7 = rect.centerY();
            } else {
                i7 = org.telegram.messenger.g0.f24226q.y / 2;
            }
            if ((((View) this.f29289r).getHeight() / 2) + iArr[1] > i7) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public fh.g g(k5 k5Var) {
        fh.g c10 = ((ri.a) this.f29287f).d.c(k5Var, null, false);
        c10.p((gh.e) this.f29288n);
        m10.s(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f29288n;
        return eVar.a(eVar.f13620e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f29288n;
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
        return (gh.e) this.f29288n;
    }

    @Override
    public View getMenuHostView() {
        return (View) this.f29289r;
    }

    @Override
    public int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public i6 getMenuResourcesProvider() {
        return (i6) this.h;
    }

    @Override
    public int getMenuRise() {
        return 0;
    }

    @Override
    public View getMenuView() {
        return (View) this.f29289r;
    }

    @Override
    public k5 getOpenMenuOverlay() {
        if (this.f29285c) {
            return (k5) this.f29286e;
        }
        return null;
    }

    @Override
    public void h(k5 k5Var, q0 q0Var) {
        boolean z10;
        if (k5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29285c != z10) {
            this.f29285c = z10;
            if (z10) {
                this.f29284b = ((View) this.f29289r).getVisibility();
                ((View) this.f29289r).setVisibility(4);
            } else if (((View) this.f29289r).getVisibility() == 4) {
                ((View) this.f29289r).setVisibility(this.f29284b);
            }
        }
    }

    public void i() {
        c0.l lVar;
        s4.v vVar = (s4.v) this.f29287f;
        int i7 = this.f29284b;
        WeakReference weakReference = (WeakReference) this.f29290s;
        s4.x.b();
        if (!this.f29285c && !this.d) {
            s4.e eVar = (s4.e) weakReference.get();
            if (eVar != null && eVar.f57058g == this && ((lVar = (c0.l) this.f29291w) == null || !lVar.isCancelled())) {
                this.f29285c = true;
                eVar.f57058g = null;
                s4.e eVar2 = (s4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f57054b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f57053a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i7;
                        obtainMessage.sendToTarget();
                        s4.q qVar = eVar2.f57056e;
                        if (qVar != null) {
                            qVar.h(i7);
                            eVar2.f57056e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s4.q qVar2 : hashMap.values()) {
                                qVar2.h(i7);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f57056e = null;
                    }
                }
                s4.e eVar3 = (s4.e) weakReference.get();
                if (eVar3 != null) {
                    s4.b bVar = eVar3.f57053a;
                    s4.v vVar2 = (s4.v) this.h;
                    eVar3.d = vVar2;
                    eVar3.f57056e = (s4.q) this.f29286e;
                    s4.v vVar3 = (s4.v) this.f29288n;
                    if (vVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
                        obtainMessage2.arg1 = i7;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
                        obtainMessage3.arg1 = i7;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f57054b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f29289r;
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
        v4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f29291w;
        SparseArray sparseArray = (SparseArray) this.f29290s;
        v4.c0 c0Var = (v4.c0) this.f29287f;
        ek0 ek0Var = (ek0) this.f29286e;
        if (!ek0Var.W1) {
            if (ek0Var.getItemAnimator() != null) {
                if (z11) {
                    v4.n0 itemAnimator = ek0Var.getItemAnimator();
                    cj0 cj0Var = new cj0(this, i7, i10, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        k(i7, i10, z10, false);
                    } else {
                        itemAnimator.f59317b.add(cj0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (ek0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f29284b == -1) {
                c0Var.i1(i7, i10, z10);
                return;
            }
            int childCount = ek0Var.getChildCount();
            if (childCount != 0 && ek0Var.getVisibility() == 0 && mp.g1().getBoolean("view_animations", true)) {
                if (this.f29284b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ek0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                v4.i0 adapter = ek0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = ek0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(v4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f59281b && !this.f29285c)) {
                        i0Var = adapter;
                    } else {
                        if (this.f29285c) {
                            int b10 = ((v4.q0) childAt.getLayoutParams()).f59347a.b();
                            if (b10 < 0) {
                                i0Var = adapter;
                                i11++;
                                adapter = i0Var;
                            } else {
                                i0Var = adapter;
                                j3 = adapter.c(b10);
                            }
                        } else {
                            i0Var = adapter;
                            j3 = ((v4.q0) childAt.getLayoutParams()).f59347a.f59248e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q4) {
                        ((org.telegram.ui.Cells.q4) childAt).b(true, true);
                    }
                    i11++;
                    adapter = i0Var;
                }
                v4.i0 i0Var2 = adapter;
                ek0Var.C0();
                ek0Var.p0();
                ug.m0 m0Var = ek0Var.d;
                m0Var.l((ArrayList) m0Var.d);
                m0Var.l((ArrayList) m0Var.f58899e);
                m0Var.f58897b = 0;
                v4.x0 x0Var = ek0Var.f2762b;
                v4.i0 i0Var3 = ek0Var.f2791x;
                x0Var.d(i0Var3, i0Var3);
                ek0Var.f2788v0.f59214f = true;
                ek0Var.f2767e.K();
                x0Var.l();
                if (i0Var2 instanceof fj0) {
                    fj0Var = (fj0) i0Var2;
                } else {
                    fj0Var = null;
                }
                fj0 fj0Var2 = fj0Var;
                c0Var.i1(i7, i10, z10);
                if (i0Var2 != null) {
                    i0Var2.f();
                }
                ek0Var.C0();
                ek0Var.setVerticalScrollBarEnabled(false);
                ra raVar = (ra) this.f29289r;
                if (raVar != null) {
                    raVar.c();
                }
                ek0Var.W1 = true;
                if (fj0Var2 != null) {
                    fj0Var2.f35142c = true;
                    fj0Var2.d = false;
                    fj0Var2.f35143e.clear();
                    fj0Var2.f35144f.clear();
                }
                ek0Var.addOnLayoutChangeListener(new ej0(this, i0Var2, arrayList, z12, fj0Var2));
                return;
            }
            c0Var.i1(i7, i10, z10);
        }
    }

    public void l(ra raVar) {
        this.f29289r = raVar;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((ri.a) this.f29287f).f56740e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public l5(ek0 ek0Var, v4.c0 c0Var) {
        this.f29283a = 1;
        this.f29290s = new SparseArray();
        this.f29291w = new HashMap();
        this.f29286e = ek0Var;
        this.f29287f = c0Var;
    }

    public l5(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.f29283a = 2;
        this.f29291w = null;
        this.f29285c = false;
        this.d = false;
        this.f29290s = new WeakReference(eVar);
        this.h = vVar;
        this.f29286e = qVar;
        this.f29284b = i7;
        this.f29287f = eVar.d;
        this.f29288n = vVar2;
        this.f29289r = collection != null ? new ArrayList(collection) : null;
        eVar.f57053a.postDelayed(new org.telegram.ui.web.z0(this, 10), 15000L);
    }
}
