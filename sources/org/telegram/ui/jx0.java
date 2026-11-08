package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class jx0 extends org.telegram.ui.Components.m61 {
    public boolean f47048a;
    public final org.telegram.ui.Components.yp0 f47049b;

    public jx0(org.telegram.ui.Components.yp0 yp0Var) {
        this.f47049b = yp0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.yp0 yp0Var = this.f47049b;
        ru0 ru0Var = yp0Var.f47348w;
        org.telegram.ui.Components.u61 u61Var = yp0Var.f47341b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
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
        int f10 = f(u61Var.getCurrentPosition());
        di.m6 m6Var = yp0Var.f47342c;
        m6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = m6Var.h;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            di.r6 r6Var = (di.r6) obj2;
            hashMap.put(Integer.valueOf(r6Var.f9701a), r6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i7 < size3) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            di.r6 r6Var2 = (di.r6) hashMap.get(num2);
            if (r6Var2 != null) {
                arrayList4.add(r6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i12 = i(f10);
            u61Var.e(0.0f, i12, i12);
        }
        org.telegram.messenger.g0.r(ru0Var);
        org.telegram.messenger.g0.i3(ru0Var, 1000L);
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 0) {
            return false;
        }
        if (this.f47048a && i7 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        return new View(this.f47049b.getContext());
    }

    @Override
    public final int e() {
        return this.f47049b.f47342c.h.size() + 1 + (this.f47048a ? 1 : 0);
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f47048a && i7 == e() - 1) {
            return -1;
        }
        return ((di.r6) this.f47049b.f47342c.h.get(i7 - 1)).f9701a;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.id.M0(2131744789, null);
        }
        if (this.f47048a && i7 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131744810, null));
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232560, 0);
            wpVar.G = 0.8f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((di.r6) this.f47049b.f47342c.h.get(i7 - 1)).f9702b;
    }

    @Override
    public final int h(int i7) {
        if (this.f47048a && i7 == e() - 1) {
            return -1;
        }
        return i7;
    }

    public final int i(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int c10 = this.f47049b.f47342c.c(i7);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
