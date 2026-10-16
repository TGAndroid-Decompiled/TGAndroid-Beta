package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g21 extends org.telegram.ui.Components.d91 {
    public boolean f36040a;
    public final org.telegram.ui.Components.ss0 f36041b;

    public g21(org.telegram.ui.Components.ss0 ss0Var) {
        this.f36041b = ss0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ss0 ss0Var = this.f36041b;
        tz0 tz0Var = ss0Var.G;
        org.telegram.ui.Components.k91 k91Var = ss0Var.f36375n;
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
        int f7 = f(k91Var.getCurrentPosition());
        bi.i8 i8Var = ss0Var.f36376r;
        i8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = i8Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            bi.p8 p8Var = (bi.p8) obj2;
            hashMap.put(Integer.valueOf(p8Var.f3477a), p8Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            bi.p8 p8Var2 = (bi.p8) hashMap.get(num2);
            if (p8Var2 != null) {
                arrayList4.add(p8Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            k91Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(tz0Var);
        AndroidUtilities.runOnUIThread(tz0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f36040a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f36041b.getContext());
    }

    @Override
    public final int e() {
        return this.f36041b.f36376r.h.size() + 1 + (this.f36040a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f36040a && i10 == e() - 1) {
            return -1;
        }
        return ((bi.p8) this.f36041b.f36376r.h.get(i10 - 1)).f3477a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f36040a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.poll_add_plus, 0);
            brVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((bi.p8) this.f36041b.f36376r.h.get(i10 - 1)).f3478b;
    }

    @Override
    public final int h(int i10) {
        if (this.f36040a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f36041b.f36376r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
