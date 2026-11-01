package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import vh.o7;
import vh.o8;
public final class m3 extends j1.b {
    public final int f20583o = 0;
    public final Rect f20584p;
    public final View f20585q;

    public m3(q3 q3Var, q3 q3Var2) {
        super(q3Var2);
        this.f20585q = q3Var;
        this.f20584p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        switch (this.f20583o) {
            case 0:
                q3 q3Var = (q3) this.f20585q;
                ArrayList arrayList = q3Var.R;
                if (q3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = q3Var.f20674i0;
                    if (yVar != null && yVar.getBounds().contains((int) f7, (int) f10)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        p3 p3Var = (p3) arrayList.get(size);
                        float f11 = p3Var.f20642i;
                        RectF rectF = p3Var.f20637a;
                        if (Math.abs(f11) < 0.4f && rectF.contains(f7, f10)) {
                            Rect bounds = p3Var.d.f20307l.getBounds();
                            if (!bounds.isEmpty() && bounds.contains((int) (f7 - rectF.left), (int) ((f10 - rectF.top) - org.telegram.messenger.i0.L(24.0f)))) {
                                return size + 2000;
                            }
                            return size + 1000;
                        }
                    }
                }
                return -1;
            default:
                vh.r4 r4Var = (vh.r4) this.f20585q;
                if (Math.abs(f7 - r4Var.f51849k0) <= org.telegram.messenger.i0.L(30.0f) && Math.abs(f10 - r4Var.f51848j0) <= org.telegram.messenger.i0.L(30.0f) && !r4Var.b() && !r4Var.f51861u0) {
                    return 0;
                }
                if (Math.abs(f7 - r4Var.f51850l0) <= org.telegram.messenger.i0.L(30.0f) && Math.abs(f10 - r4Var.f51848j0) <= org.telegram.messenger.i0.L(30.0f) && !r4Var.b() && !r4Var.f51861u0) {
                    return 2;
                }
                if (Math.abs(f7 - r4Var.f51847i0) <= org.telegram.messenger.i0.L(60.0f) && Math.abs(f10 - r4Var.f51848j0) <= org.telegram.messenger.i0.L(60.0f)) {
                    return 1;
                }
                return Integer.MIN_VALUE;
        }
    }

    @Override
    public final void h(ArrayList arrayList) {
        switch (this.f20583o) {
            case 0:
                q3 q3Var = (q3) this.f20585q;
                ArrayList arrayList2 = q3Var.R;
                if (q3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = q3Var.f20674i0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        p3 p3Var = (p3) arrayList2.get(i10);
                        if (Math.abs(p3Var.f20642i) < 0.4f && !p3Var.f20637a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i10 + 1000));
                            f3 f3Var = p3Var.d;
                            if (f3Var != null && !f3Var.f20307l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i10 + 2000));
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                vh.r4 r4Var = (vh.r4) this.f20585q;
                if (!r4Var.b() && !r4Var.f51861u0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!r4Var.b() && !r4Var.f51861u0) {
                    arrayList.add(2);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z10;
        int i13 = this.f20583o;
        View view = this.f20585q;
        switch (i13) {
            case 0:
                q3 q3Var = (q3) view;
                ArrayList arrayList = q3Var.R;
                if (i11 != 16) {
                    return false;
                }
                if (i10 == 1) {
                    i3 i3Var = q3Var.f20662a;
                    if (i3Var != null) {
                        i3Var.f();
                    }
                    q3Var.a(false);
                } else {
                    if (i10 >= 2000) {
                        i12 = i10 - 2000;
                        z10 = true;
                    } else if (i10 < 1000) {
                        return false;
                    } else {
                        i12 = i10 - 1000;
                        z10 = false;
                    }
                    if (i12 < 0 || i12 >= arrayList.size()) {
                        return false;
                    }
                    p3 p3Var = (p3) arrayList.get(i12);
                    if (z10) {
                        i3 i3Var2 = q3Var.f20662a;
                        if (i3Var2 != null) {
                            i3Var2.g(p3Var.f20639c, new ag.e0(10, this, p3Var));
                        }
                    } else if (q3Var.f20662a != null) {
                        q3Var.a(false);
                        p3Var.getClass();
                        q3Var.f20662a.e(p3Var.f20639c);
                    }
                }
                return true;
            default:
                vh.r4 r4Var = (vh.r4) view;
                if (r4Var.f51835a == null || r4Var.f51861u0 || i11 != 16) {
                    return false;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2 || r4Var.b()) {
                            return false;
                        }
                        r4Var.d(180.0f);
                        ((o7) r4Var.f51835a).b();
                    } else if (r4Var.b()) {
                        ((o7) r4Var.f51835a).a();
                    } else if (r4Var.f51857r0) {
                        r4Var.f51857r0 = false;
                        r4Var.f51869z0 = false;
                        r4Var.f51862v0 = SystemClock.elapsedRealtime();
                        r4Var.f51861u0 = true;
                        ((o7) r4Var.f51835a).e(false);
                        r4Var.invalidate();
                    } else if (r4Var.f51853o0) {
                        if (o8.c(((o7) r4Var.f51835a).f51618a)) {
                            r4Var.R = 0L;
                            r4Var.Q = System.currentTimeMillis();
                            r4Var.A0 = false;
                            ((o7) r4Var.f51835a).f(new vh.d0(this, 11), false);
                        }
                    } else {
                        ((o7) r4Var.f51835a).d();
                    }
                } else if (r4Var.b()) {
                    return false;
                } else {
                    if (r4Var.f51857r0 && r4Var.A0) {
                        r4Var.f51869z0 = false;
                        r4Var.G0.e(true, 1.0f);
                        vh.o2 o2Var = ((o7) r4Var.f51835a).f51618a.T0;
                        o2Var.f51607a.t(dd.L0(2131744680, null), true, true);
                        o2Var.invalidate();
                        r4Var.invalidate();
                    } else {
                        ((o7) r4Var.f51835a).c();
                    }
                }
                return true;
        }
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        int i11;
        boolean z10;
        String str;
        String str2;
        String L0;
        String L02;
        int i12 = this.f20583o;
        String str3 = "";
        View view = this.f20585q;
        Rect rect = this.f20584p;
        boolean z11 = true;
        switch (i12) {
            case 0:
                q3 q3Var = (q3) view;
                ArrayList arrayList = q3Var.R;
                cVar.i("android.widget.Button");
                cVar.b(s0.b.f47855c);
                if (i10 == 1) {
                    org.telegram.ui.Cells.y yVar = q3Var.f20674i0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(dd.L0(2131753099, null));
                    return;
                }
                if (i10 >= 2000) {
                    i11 = i10 - 2000;
                    z10 = true;
                } else if (i10 >= 1000) {
                    i11 = i10 - 1000;
                    z10 = false;
                } else {
                    rect.set(0, 0, 1, 1);
                    cVar.h(rect);
                    cVar.p(false);
                    return;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    p3 p3Var = (p3) arrayList.get(i11);
                    h3 h3Var = p3Var.f20639c;
                    RectF rectF = p3Var.f20637a;
                    if (h3Var != null && h3Var.b() != null) {
                        str3 = p3Var.f20639c.b();
                    }
                    if (z10) {
                        Rect bounds = p3Var.d.f20307l.getBounds();
                        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.i0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.i0.L(24.0f) + bounds.bottom));
                        cVar.h(rect);
                        if (TextUtils.isEmpty(str3)) {
                            str2 = dd.L0(2131752041, null);
                        } else {
                            str2 = dd.L0(2131752041, null) + ", " + str3;
                        }
                        cVar.j(str2);
                        return;
                    }
                    rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    cVar.h(rect);
                    if (TextUtils.isEmpty(str3)) {
                        str = dd.L0(2131747833, null);
                    } else {
                        str = dd.L0(2131747833, null) + ", " + str3;
                    }
                    cVar.j(str);
                    return;
                }
                rect.set(0, 0, 1, 1);
                cVar.h(rect);
                cVar.p(false);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47861a;
                vh.r4 r4Var = (vh.r4) view;
                cVar.i("android.widget.Button");
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            rect.set(0, 0, 1, 1);
                            cVar.h(rect);
                            cVar.p(false);
                            cVar.j("");
                            return;
                        }
                        int L = org.telegram.messenger.i0.L(22.0f);
                        float f7 = r4Var.f51850l0;
                        float f10 = L;
                        float f11 = r4Var.f51848j0;
                        rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                        cVar.h(rect);
                        cVar.j(dd.L0(2131754752, null));
                        if (r4Var.f51861u0 || r4Var.b()) {
                            z11 = false;
                        }
                        accessibilityNodeInfo.setEnabled(z11);
                        if (z11) {
                            cVar.b(s0.b.f47855c);
                            return;
                        }
                        return;
                    }
                    int L2 = org.telegram.messenger.i0.L(40.0f);
                    float f12 = r4Var.f51847i0;
                    float f13 = L2;
                    float f14 = r4Var.f51848j0;
                    rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
                    cVar.h(rect);
                    if (r4Var.b()) {
                        L02 = dd.L0(2131745657, null);
                    } else if (r4Var.f51857r0) {
                        L02 = dd.L0(2131754754, null);
                    } else if (r4Var.f51853o0) {
                        L02 = dd.L0(2131754758, null);
                    } else {
                        L02 = dd.L0(2131754747, null);
                    }
                    cVar.j(L02);
                    accessibilityNodeInfo.setEnabled(!r4Var.f51861u0);
                    if (!r4Var.f51861u0) {
                        cVar.b(s0.b.f47855c);
                        return;
                    }
                    return;
                }
                int L3 = org.telegram.messenger.i0.L(22.0f);
                float f15 = r4Var.f51849k0;
                float f16 = L3;
                float f17 = r4Var.f51848j0;
                rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
                cVar.h(rect);
                if (r4Var.f51857r0 && r4Var.A0) {
                    L0 = dd.L0(2131754846, null);
                } else {
                    L0 = dd.L0(2131754912, null);
                }
                cVar.j(L0);
                if (r4Var.f51861u0 || r4Var.b()) {
                    z11 = false;
                }
                accessibilityNodeInfo.setEnabled(z11);
                if (z11) {
                    cVar.b(s0.b.f47855c);
                    return;
                }
                return;
        }
    }

    public m3(vh.r4 r4Var, vh.r4 r4Var2) {
        super(r4Var2);
        this.f20585q = r4Var;
        this.f20584p = new Rect();
    }
}
