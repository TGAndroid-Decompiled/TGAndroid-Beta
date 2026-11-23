package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
public final class kx0 extends org.telegram.ui.Components.c71 {
    public boolean f49550a;
    public final org.telegram.ui.Components.iq0 f49551b;

    public kx0(org.telegram.ui.Components.iq0 iq0Var) {
        this.f49551b = iq0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.iq0 iq0Var = this.f49551b;
        qu0 qu0Var = iq0Var.f49877w;
        org.telegram.ui.Components.j71 j71Var = iq0Var.f49870b;
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
        int f10 = f(j71Var.getCurrentPosition());
        fi.d6 d6Var = iq0Var.f49871c;
        d6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = d6Var.h;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            fi.i6 i6Var = (fi.i6) obj2;
            hashMap.put(Integer.valueOf(i6Var.f12106a), i6Var);
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
            j71Var.f(0.0f, i12, i12);
        }
        org.telegram.messenger.g0.r(qu0Var);
        org.telegram.messenger.g0.h3(qu0Var, 1000L);
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 0) {
            return false;
        }
        if (this.f49550a && i7 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        return new View(this.f49551b.getContext());
    }

    @Override
    public final int e() {
        return this.f49551b.f49871c.h.size() + 1 + (this.f49550a ? 1 : 0);
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (this.f49550a && i7 == e() - 1) {
            return -1;
        }
        return ((fi.i6) this.f49551b.f49871c.h.get(i7 - 1)).f12106a;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.gd.N0(2131744545, null);
        }
        if (this.f49550a && i7 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131744566, null));
            org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(2131232565, 0);
            kqVar.H = 0.8f;
            spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((fi.i6) this.f49551b.f49871c.h.get(i7 - 1)).f12107b;
    }

    @Override
    public final int h(int i7) {
        if (this.f49550a && i7 == e() - 1) {
            return -1;
        }
        return i7;
    }

    public final int i(int i7) {
        if (i7 == 0) {
            return 0;
        }
        int c10 = this.f49551b.f49871c.c(i7);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
