package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g21 extends org.telegram.ui.Components.n81 {
    public boolean f32978a;
    public final org.telegram.ui.Components.cs0 f32979b;

    public g21(org.telegram.ui.Components.cs0 cs0Var) {
        this.f32979b = cs0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.cs0 cs0Var = this.f32979b;
        k01 k01Var = cs0Var.G;
        org.telegram.ui.Components.u81 u81Var = cs0Var.f33250n;
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
        int f7 = f(u81Var.getCurrentPosition());
        zh.w4 w4Var = cs0Var.f33251r;
        w4Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = w4Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            zh.b5 b5Var = (zh.b5) obj2;
            hashMap.put(Integer.valueOf(b5Var.f48308a), b5Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            zh.b5 b5Var2 = (zh.b5) hashMap.get(num2);
            if (b5Var2 != null) {
                arrayList4.add(b5Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            u81Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(k01Var);
        AndroidUtilities.runOnUIThread(k01Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f32978a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f32979b.getContext());
    }

    @Override
    public final int e() {
        return this.f32979b.f33251r.h.size() + 1 + (this.f32978a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f32978a && i10 == e() - 1) {
            return -1;
        }
        return ((zh.b5) this.f32979b.f33251r.h.get(i10 - 1)).f48308a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f32978a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.poll_add_plus, 0);
            uqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((zh.b5) this.f32979b.f33251r.h.get(i10 - 1)).f48309b;
    }

    @Override
    public final int h(int i10) {
        if (this.f32978a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f32979b.f33251r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
