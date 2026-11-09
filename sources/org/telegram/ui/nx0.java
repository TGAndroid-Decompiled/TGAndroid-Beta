package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class nx0 extends org.telegram.ui.Components.n61 {
    public boolean f48246a;
    public final org.telegram.ui.Components.zp0 f48247b;

    public nx0(org.telegram.ui.Components.zp0 zp0Var) {
        this.f48247b = zp0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.zp0 zp0Var = this.f48247b;
        tu0 tu0Var = zp0Var.f48553w;
        org.telegram.ui.Components.v61 v61Var = zp0Var.f48546b;
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
        int f10 = f(v61Var.getCurrentPosition());
        di.n6 n6Var = zp0Var.f48547c;
        n6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = n6Var.h;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            di.s6 s6Var = (di.s6) obj2;
            hashMap.put(Integer.valueOf(s6Var.f9732a), s6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i7 < size3) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            di.s6 s6Var2 = (di.s6) hashMap.get(num2);
            if (s6Var2 != null) {
                arrayList4.add(s6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i12 = i(f10);
            v61Var.e(0.0f, i12, i12);
        }
        org.telegram.messenger.g0.r(tu0Var);
        org.telegram.messenger.g0.i3(tu0Var, 1000L);
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 0) {
            return false;
        }
        if (this.f48246a && i7 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        return new View(this.f48247b.getContext());
    }

    @Override
    public final int e() {
        return this.f48247b.f48547c.h.size() + 1 + (this.f48246a ? 1 : 0);
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f48246a && i7 == e() - 1) {
            return -1;
        }
        return ((di.s6) this.f48247b.f48547c.h.get(i7 - 1)).f9732a;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.id.M0(2131744786, null);
        }
        if (this.f48246a && i7 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131744807, null));
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131232560, 0);
            wpVar.G = 0.8f;
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((di.s6) this.f48247b.f48547c.h.get(i7 - 1)).f9733b;
    }

    @Override
    public final int h(int i7) {
        if (this.f48246a && i7 == e() - 1) {
            return -1;
        }
        return i7;
    }

    public final int i(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int c10 = this.f48247b.f48547c.c(i7);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
