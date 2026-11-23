package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class mx0 extends org.telegram.ui.Components.b71 {
    public boolean f50027a;
    public final org.telegram.ui.Components.jq0 f50028b;

    public mx0(org.telegram.ui.Components.jq0 jq0Var) {
        this.f50028b = jq0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.jq0 jq0Var = this.f50028b;
        ru0 ru0Var = jq0Var.f50355w;
        org.telegram.ui.Components.i71 i71Var = jq0Var.f50348b;
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
        int f10 = f(i71Var.getCurrentPosition());
        fi.d6 d6Var = jq0Var.f50349c;
        d6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = d6Var.h;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            fi.i6 i6Var = (fi.i6) obj2;
            hashMap.put(Integer.valueOf(i6Var.f12144a), i6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i7 < size3) {
            Object obj3 = arrayList2.get(i7);
            i7++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            fi.i6 i6Var2 = (fi.i6) hashMap.get(num2);
            if (i6Var2 != null) {
                arrayList4.add(i6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i12 = i(f10);
            i71Var.f(0.0f, i12, i12);
        }
        org.telegram.messenger.g0.r(ru0Var);
        org.telegram.messenger.g0.h3(ru0Var, 1000L);
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 0) {
            return false;
        }
        if (this.f50027a && i7 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        return new View(this.f50028b.getContext());
    }

    @Override
    public final int e() {
        return this.f50028b.f50349c.h.size() + 1 + (this.f50027a ? 1 : 0);
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f50027a && i7 == e() - 1) {
            return -1;
        }
        return ((fi.i6) this.f50028b.f50349c.h.get(i7 - 1)).f12144a;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.hd.N0(2131744543, null);
        }
        if (this.f50027a && i7 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131744564, null));
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131232562, 0);
            nqVar.H = 0.8f;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((fi.i6) this.f50028b.f50349c.h.get(i7 - 1)).f12145b;
    }

    @Override
    public final int h(int i7) {
        if (this.f50027a && i7 == e() - 1) {
            return -1;
        }
        return i7;
    }

    public final int i(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int c10 = this.f50028b.f50349c.c(i7);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
