package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import c8.oa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dj0;
public class l5 implements u4 {
    public final int f29200a;
    public int f29201b;
    public boolean f29202c;
    public boolean d;
    public final Object f29203e;
    public final Object f29204f;
    public Object h;
    public Object f29205n;
    public Object f29206r;
    public final Object f29207s;
    public Object f29208w;

    public l5(k5 k5Var, ri.a aVar, i6 i6Var) {
        this.f29200a = 0;
        this.f29201b = 0;
        this.f29207s = new int[2];
        this.f29208w = new Rect();
        this.f29203e = k5Var;
        this.f29204f = aVar;
        this.h = i6Var;
        this.f29205n = c8.i0.m(i6Var);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b(r0 r0Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.f29206r).getWidth(), ((View) this.f29206r).getHeight());
        return true;
    }

    public void c() {
        switch (this.f29200a) {
            case 1:
                ValueAnimator valueAnimator = (ValueAnimator) this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ck0 ck0Var = (ck0) this.f29203e;
                ck0Var.setVerticalScrollBarEnabled(true);
                ck0Var.W1 = false;
                v4.i0 adapter = ck0Var.getAdapter();
                if (adapter instanceof dj0) {
                    ((dj0) adapter).E();
                }
                this.h = null;
                int childCount = ck0Var.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = ck0Var.getChildAt(i7);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(false, false);
                    }
                }
                return;
            default:
                s4.q qVar = (s4.q) this.f29203e;
                if (!this.f29202c && !this.d) {
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
        int[] iArr = (int[]) this.f29207s;
        Rect rect = (Rect) this.f29208w;
        View view = (View) this.f29206r;
        if (view != null && !this.d) {
            view.getLocationOnScreen(iArr);
            ((View) this.f29206r).getWindowVisibleDisplayFrame(rect);
            if (rect.height() > 0) {
                i7 = rect.centerY();
            } else {
                i7 = org.telegram.messenger.g0.f24121q.y / 2;
            }
            if ((((View) this.f29206r).getHeight() / 2) + iArr[1] > i7) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public fh.g g(k5 k5Var) {
        fh.g c10 = ((ri.a) this.f29204f).d.c(k5Var, null, false);
        c10.p((gh.e) this.f29205n);
        n10.s(c10, org.telegram.messenger.g0.L(21.0f), 6.0f);
        return c10;
    }

    @Override
    public int getButtonsGlassBackgroundColor() {
        gh.e eVar = (gh.e) this.f29205n;
        return eVar.a(eVar.f13628e);
    }

    @Override
    public gh.a getButtonsGlassColorProvider() {
        return (gh.e) this.f29205n;
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
        return (gh.e) this.f29205n;
    }

    @Override
    public View getMenuHostView() {
        return (View) this.f29206r;
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
        return (View) this.f29206r;
    }

    @Override
    public k5 getOpenMenuOverlay() {
        if (this.f29202c) {
            return (k5) this.f29203e;
        }
        return null;
    }

    @Override
    public void h(k5 k5Var, r0 r0Var) {
        boolean z10;
        if (k5Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29202c != z10) {
            this.f29202c = z10;
            if (z10) {
                this.f29201b = ((View) this.f29206r).getVisibility();
                ((View) this.f29206r).setVisibility(4);
            } else if (((View) this.f29206r).getVisibility() == 4) {
                ((View) this.f29206r).setVisibility(this.f29201b);
            }
        }
    }

    public void i() {
        c0.l lVar;
        s4.v vVar = (s4.v) this.f29204f;
        int i7 = this.f29201b;
        WeakReference weakReference = (WeakReference) this.f29207s;
        s4.x.b();
        if (!this.f29202c && !this.d) {
            s4.e eVar = (s4.e) weakReference.get();
            if (eVar != null && eVar.f56932g == this && ((lVar = (c0.l) this.f29208w) == null || !lVar.isCancelled())) {
                this.f29202c = true;
                eVar.f56932g = null;
                s4.e eVar2 = (s4.e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f56928b;
                    if (eVar2.d == vVar) {
                        Message obtainMessage = eVar2.f56927a.obtainMessage(263, vVar);
                        obtainMessage.arg1 = i7;
                        obtainMessage.sendToTarget();
                        s4.q qVar = eVar2.f56930e;
                        if (qVar != null) {
                            qVar.h(i7);
                            eVar2.f56930e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s4.q qVar2 : hashMap.values()) {
                                qVar2.h(i7);
                                qVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f56930e = null;
                    }
                }
                s4.e eVar3 = (s4.e) weakReference.get();
                if (eVar3 != null) {
                    s4.b bVar = eVar3.f56927a;
                    s4.v vVar2 = (s4.v) this.h;
                    eVar3.d = vVar2;
                    eVar3.f56930e = (s4.q) this.f29203e;
                    s4.v vVar3 = (s4.v) this.f29205n;
                    if (vVar3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(vVar, vVar2));
                        obtainMessage2.arg1 = i7;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(vVar3, vVar2));
                        obtainMessage3.arg1 = i7;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f56928b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f29206r;
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
        dj0 dj0Var;
        v4.i0 i0Var;
        long j3;
        HashMap hashMap = (HashMap) this.f29208w;
        SparseArray sparseArray = (SparseArray) this.f29207s;
        v4.c0 c0Var = (v4.c0) this.f29204f;
        ck0 ck0Var = (ck0) this.f29203e;
        if (!ck0Var.W1) {
            if (ck0Var.getItemAnimator() != null) {
                if (z11) {
                    v4.n0 itemAnimator = ck0Var.getItemAnimator();
                    aj0 aj0Var = new aj0(this, i7, i10, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        k(i7, i10, z10, false);
                    } else {
                        itemAnimator.f59194b.add(aj0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (ck0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f29201b == -1) {
                c0Var.i1(i7, i10, z10);
                return;
            }
            int childCount = ck0Var.getChildCount();
            if (childCount != 0 && ck0Var.getVisibility() == 0 && mp.g1().getBoolean("view_animations", true)) {
                if (this.f29201b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ck0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                v4.i0 adapter = ck0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = ck0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    c0Var.getClass();
                    sparseArray.put(v4.p0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f59159b && !this.f29202c)) {
                        i0Var = adapter;
                    } else {
                        if (this.f29202c) {
                            int b10 = ((v4.q0) childAt.getLayoutParams()).f59222a.b();
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
                            j3 = ((v4.q0) childAt.getLayoutParams()).f59222a.f59125e;
                        }
                        hashMap.put(Long.valueOf(j3), childAt);
                    }
                    if (childAt instanceof org.telegram.ui.Cells.p4) {
                        ((org.telegram.ui.Cells.p4) childAt).c(true, true);
                    }
                    i11++;
                    adapter = i0Var;
                }
                v4.i0 i0Var2 = adapter;
                ck0Var.C0();
                ck0Var.p0();
                ug.n0 n0Var = ck0Var.d;
                n0Var.l((ArrayList) n0Var.d);
                n0Var.l((ArrayList) n0Var.f58781e);
                n0Var.f58779b = 0;
                v4.x0 x0Var = ck0Var.f2790b;
                v4.i0 i0Var3 = ck0Var.f2819x;
                x0Var.d(i0Var3, i0Var3);
                ck0Var.f2816v0.f59089f = true;
                ck0Var.f2795e.E();
                x0Var.l();
                if (i0Var2 instanceof dj0) {
                    dj0Var = (dj0) i0Var2;
                } else {
                    dj0Var = null;
                }
                dj0 dj0Var2 = dj0Var;
                c0Var.i1(i7, i10, z10);
                if (i0Var2 != null) {
                    i0Var2.f();
                }
                ck0Var.C0();
                ck0Var.setVerticalScrollBarEnabled(false);
                oa oaVar = (oa) this.f29206r;
                if (oaVar != null) {
                    oaVar.c();
                }
                ck0Var.W1 = true;
                if (dj0Var2 != null) {
                    dj0Var2.f34449c = true;
                    dj0Var2.d = false;
                    dj0Var2.f34450e.clear();
                    dj0Var2.f34451f.clear();
                }
                ck0Var.addOnLayoutChangeListener(new cj0(this, i0Var2, arrayList, z12, dj0Var2));
                return;
            }
            c0Var.i1(i7, i10, z10);
        }
    }

    public void l(oa oaVar) {
        this.f29206r = oaVar;
    }

    @Override
    public void setMenuGlassFrostedProgress(float f10) {
        ui.d dVar = ((ri.a) this.f29204f).f56617e;
        if (dVar != null) {
            dVar.j(f10);
        }
    }

    public l5(ck0 ck0Var, v4.c0 c0Var) {
        this.f29200a = 1;
        this.f29207s = new SparseArray();
        this.f29208w = new HashMap();
        this.f29203e = ck0Var;
        this.f29204f = c0Var;
    }

    public l5(s4.e eVar, s4.v vVar, s4.q qVar, int i7, s4.v vVar2, Collection collection) {
        this.f29200a = 2;
        this.f29208w = null;
        this.f29202c = false;
        this.d = false;
        this.f29207s = new WeakReference(eVar);
        this.h = vVar;
        this.f29203e = qVar;
        this.f29201b = i7;
        this.f29204f = eVar.d;
        this.f29205n = vVar2;
        this.f29206r = collection != null ? new ArrayList(collection) : null;
        eVar.f56927a.postDelayed(new org.telegram.ui.web.z0(this, 10), 15000L);
    }
}
