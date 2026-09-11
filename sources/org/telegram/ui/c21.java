package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c21 extends org.telegram.ui.Components.a81 {
    public boolean f34982a;
    public final org.telegram.ui.Components.sr0 f34983b;

    public c21(org.telegram.ui.Components.sr0 sr0Var) {
        this.f34983b = sr0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.sr0 sr0Var = this.f34983b;
        f01 f01Var = sr0Var.G;
        org.telegram.ui.Components.h81 h81Var = sr0Var.f35626n;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2 && intValue != 0) {
                arrayList2.add(num);
            }
        }
        int f7 = f(h81Var.getCurrentPosition());
        bi.f8 f8Var = sr0Var.f35627r;
        f8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = f8Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            bi.m8 m8Var = (bi.m8) obj2;
            hashMap.put(Integer.valueOf(m8Var.f3321a), m8Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            bi.m8 m8Var2 = (bi.m8) hashMap.get(num2);
            if (m8Var2 != null) {
                arrayList4.add(m8Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            h81Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(f01Var);
        AndroidUtilities.runOnUIThread(f01Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f34982a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f34983b.getContext());
    }

    @Override
    public final int e() {
        return this.f34983b.f35627r.h.size() + 1 + (this.f34982a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f34982a && i10 == e() - 1) {
            return -1;
        }
        return ((bi.m8) this.f34983b.f35627r.h.get(i10 - 1)).f3321a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f34982a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.poll_add_plus, 0);
            nqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((bi.m8) this.f34983b.f35627r.h.get(i10 - 1)).f3322b;
    }

    @Override
    public final int h(int i10) {
        if (this.f34982a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f34983b.f35627r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
