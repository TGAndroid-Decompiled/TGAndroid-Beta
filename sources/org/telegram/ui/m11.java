package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m11 extends org.telegram.ui.Components.n91 {
    public boolean f41301a;
    public final org.telegram.ui.Components.at0 f41302b;

    public m11(org.telegram.ui.Components.at0 at0Var) {
        this.f41302b = at0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.at0 at0Var = this.f41302b;
        oy0 oy0Var = at0Var.v;
        org.telegram.ui.Components.u91 u91Var = at0Var.f41609b;
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
        int f7 = f(u91Var.getCurrentPosition());
        di.v6 v6Var = at0Var.f41610c;
        v6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = v6Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            di.a7 a7Var = (di.a7) obj2;
            hashMap.put(Integer.valueOf(a7Var.f8375a), a7Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            di.a7 a7Var2 = (di.a7) hashMap.get(num2);
            if (a7Var2 != null) {
                arrayList4.add(a7Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            u91Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(oy0Var);
        AndroidUtilities.runOnUIThread(oy0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f41301a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f41302b.getContext());
    }

    @Override
    public final int e() {
        return this.f41302b.f41610c.h.size() + 1 + (this.f41301a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f41301a && i10 == e() - 1) {
            return -1;
        }
        return ((di.a7) this.f41302b.f41610c.h.get(i10 - 1)).f8375a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f41301a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.poll_add_plus, 0);
            zqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((di.a7) this.f41302b.f41610c.h.get(i10 - 1)).f8376b;
    }

    @Override
    public final int h(int i10) {
        if (this.f41301a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f41302b.f41610c.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
