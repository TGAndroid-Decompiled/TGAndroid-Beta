package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class bx0 extends org.telegram.ui.Components.f61 {
    public boolean f44165a;
    public final org.telegram.ui.Components.yp0 f44166b;

    public bx0(org.telegram.ui.Components.yp0 yp0Var) {
        this.f44166b = yp0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.yp0 yp0Var = this.f44166b;
        pu0 pu0Var = yp0Var.f44474w;
        org.telegram.ui.Components.m61 m61Var = yp0Var.f44467b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f10 = f(m61Var.getCurrentPosition());
        ei.n6 n6Var = yp0Var.f44468c;
        n6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = n6Var.h;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            ei.s6 s6Var = (ei.s6) obj2;
            hashMap.put(Integer.valueOf(s6Var.f11008a), s6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ei.s6 s6Var2 = (ei.s6) hashMap.get(num2);
            if (s6Var2 != null) {
                arrayList4.add(s6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i12 = i(f10);
            m61Var.e(0.0f, i12, i12);
        }
        org.telegram.messenger.g0.r(pu0Var);
        org.telegram.messenger.g0.i3(pu0Var, 1000L);
    }

    @Override
    public final boolean c(int i3) {
        if (i3 == 0) {
            return false;
        }
        if (this.f44165a && i3 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i3) {
        if (i3 == -1) {
            return null;
        }
        return new View(this.f44166b.getContext());
    }

    @Override
    public final int e() {
        return this.f44166b.f44468c.h.size() + 1 + (this.f44165a ? 1 : 0);
    }

    @Override
    public final int f(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.f44165a && i3 == e() - 1) {
            return -1;
        }
        return ((ei.s6) this.f44166b.f44468c.h.get(i3 - 1)).f11008a;
    }

    @Override
    public final CharSequence g(int i3) {
        if (i3 == 0) {
            return org.telegram.messenger.bd.M0(2131744796, null);
        }
        if (this.f44165a && i3 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131744817, null));
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232558, 0);
            wpVar.H = 0.8f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((ei.s6) this.f44166b.f44468c.h.get(i3 - 1)).f11009b;
    }

    @Override
    public final int h(int i3) {
        if (this.f44165a && i3 == e() - 1) {
            return -1;
        }
        return i3;
    }

    public final int i(int i3) {
        if (i3 == 0) {
            return 0;
        }
        int c2 = this.f44166b.f44468c.c(i3);
        if (c2 == -1) {
            return -1;
        }
        return c2 + 1;
    }

    @Override
    public final void b(View view, int i3, int i10) {
    }
}
