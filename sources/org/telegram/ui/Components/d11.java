package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.tl.TL_stories;
public final class d11 implements Runnable {
    public final int f25325a;
    public final int f25326b;
    public final Object f25327c;
    public final Object d;
    public final Object e;

    public d11(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.f25325a = i11;
        this.f25326b = i10;
        this.f25327c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        boolean z10;
        int i10;
        th.x4 x4Var = (th.x4) this.f25327c;
        ArrayList arrayList = (ArrayList) this.d;
        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) this.e;
        AbstractSet abstractSet = x4Var.f49652k;
        int i11 = x4Var.f49648f;
        AbstractSet abstractSet2 = x4Var.f49653l;
        x4Var.A = -1;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i12 = x4Var.e;
        sb2.append(i12);
        sb2.append("{");
        long j10 = x4Var.d;
        sb2.append(j10);
        sb2.append("} loaded {");
        sb2.append(th.e5.a(arrayList));
        a1.g.z("}", sb2);
        ArrayList arrayList2 = x4Var.f49649g;
        arrayList2.clear();
        arrayList2.addAll(tL_stories_stories.pinned_to_top);
        int i13 = x4Var.f49647c;
        org.telegram.messenger.wp.r1(i13).V3(tL_stories_stories.users, false);
        org.telegram.messenger.wp.r1(i13).P3(tL_stories_stories.chats, false);
        org.telegram.messenger.is.a0(i13).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
        x4Var.f49662u = false;
        x4Var.f49660s = tL_stories_stories.count;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            x4Var.t((org.telegram.messenger.kj) arrayList.get(i14), false);
        }
        if (abstractSet2.size() >= x4Var.f49660s) {
            z10 = true;
        } else {
            z10 = false;
        }
        x4Var.f49659r = z10;
        if (!z10) {
            if (i11 <= 0) {
                int i15 = this.f25326b;
                if (i15 == -1) {
                    if (!abstractSet2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(abstractSet2);
                        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                            Integer num = (Integer) arrayList3.get(i16);
                            int intValue = num.intValue();
                            if (!arrayList2.contains(num)) {
                                i10 = intValue;
                                break;
                            }
                        }
                    }
                    i10 = -1;
                    i15 = i10;
                }
                int n10 = x4Var.n();
                Iterator it = abstractSet.iterator();
                while (it.hasNext()) {
                    Integer num2 = (Integer) it.next();
                    int intValue2 = num2.intValue();
                    if (!abstractSet2.contains(num2) && intValue2 >= i15 && intValue2 <= n10) {
                        it.remove();
                        x4Var.u(intValue2, false);
                    }
                }
            }
        } else {
            Iterator it2 = abstractSet.iterator();
            while (it2.hasNext()) {
                Integer num3 = (Integer) it2.next();
                int intValue3 = num3.intValue();
                if (!abstractSet2.contains(num3)) {
                    it2.remove();
                    x4Var.u(intValue3, false);
                }
            }
        }
        x4Var.d(true);
        if (x4Var.f49659r) {
            if (th.x4.B == null) {
                th.x4.B = new HashMap();
            }
            th.x4.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i13), Integer.valueOf(i12), Long.valueOf(j10), Integer.valueOf(i11))), Long.valueOf(System.currentTimeMillis()));
        } else {
            x4Var.w();
        }
        x4Var.x();
    }

    private final void b() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        long j10;
        long j11;
        zf.z zVar = (zf.z) this.f25327c;
        ArrayList arrayList = (ArrayList) this.d;
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) this.e;
        ArrayList arrayList2 = zVar.K;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - zVar.f55715n0 < 300) {
            return;
        }
        zVar.f55715n0 = elapsedRealtime;
        int size = arrayList2.size();
        int size2 = arrayList.size();
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            i10 = 0;
        } else {
            i10 = size2 + size;
        }
        int min = Math.min(3, size2) + size;
        int b10 = zVar.b();
        boolean z12 = zVar.G0;
        if (z12) {
            i11 = min;
        } else {
            i11 = i10;
        }
        int i15 = this.f25326b;
        if (b10 > i11 + i15 + 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        s4.j jVar = zVar.f55710i0;
        if (jVar != null) {
            long j12 = 200;
            if (z10) {
                i12 = 3;
                z11 = z10;
                j10 = 45;
            } else {
                i12 = 3;
                z11 = z10;
                j10 = 200;
            }
            jVar.f47978c = j10;
            if (z11) {
                j12 = 80;
            }
            jVar.d = j12;
            if (z11) {
                j11 = 270;
            } else {
                j11 = 0;
            }
            jVar.f47984l = j11;
        } else {
            i12 = 3;
            z11 = z10;
        }
        zVar.G0 = !z12;
        z3Var.setRightTextMargin(16);
        if (zVar.G0) {
            i13 = 2131745357;
        } else {
            i13 = 2131745358;
        }
        String L0 = org.telegram.messenger.dd.L0(i13, null);
        boolean z13 = zVar.G0;
        org.telegram.ui.Cells.y3 y3Var = z3Var.f23640b;
        y3Var.c(L0, true, z13);
        y3Var.setVisibility(0);
        zVar.f55716o0 = null;
        View view = (View) z3Var.getParent();
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (!zVar.G0) {
                i14 = i15 + min;
            } else {
                i14 = i10 + i15;
            }
            int i16 = i14 + 1;
            int i17 = 0;
            while (true) {
                if (i17 >= recyclerView.getChildCount()) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i17);
                if (RecyclerView.R(childAt) == i16) {
                    zVar.f55716o0 = childAt;
                    break;
                }
                i17++;
            }
        }
        int i18 = i15 + min;
        int i19 = i18 + 1;
        int max = Math.max(0, size2 - i12);
        if (!zVar.G0) {
            zVar.g(i18);
            zVar.o(i19, max);
        } else {
            zVar.p(i19, max);
            if (z11) {
                org.telegram.messenger.i0.h3(new org.telegram.utils.twidget.v(zVar, i18, 10), 350L);
            } else {
                zVar.g(i18);
            }
        }
        xh.e3 e3Var = zVar.f55717p0;
        if (e3Var != null) {
            org.telegram.messenger.i0.r(e3Var);
        }
        if (z11) {
            zVar.m0 = true;
            xh.e3 e3Var2 = new xh.e3(4, zVar, view);
            zVar.f55717p0 = e3Var2;
            org.telegram.messenger.i0.h3(e3Var2, 400L);
            return;
        }
        zVar.m0 = false;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d11.run():void");
    }

    public d11(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f25325a = i11;
        this.f25327c = obj;
        this.f25326b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public d11(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f25325a = i11;
        this.f25327c = obj;
        this.d = obj2;
        this.f25326b = i10;
        this.e = obj3;
    }

    public d11(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f25325a = i11;
        this.f25327c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25326b = i10;
    }

    public d11(qh.x0 x0Var, Bitmap bitmap, int[] iArr, int i10) {
        this.f25325a = 17;
        this.f25327c = x0Var;
        this.e = bitmap;
        this.d = iArr;
        this.f25326b = i10;
    }
}
