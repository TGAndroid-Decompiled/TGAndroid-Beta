package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p11 extends org.telegram.ui.Components.d81 {
    public boolean f39853a;
    public final org.telegram.ui.Components.sr0 f39854b;

    public p11(org.telegram.ui.Components.sr0 sr0Var) {
        this.f39854b = sr0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.sr0 sr0Var = this.f39854b;
        sz0 sz0Var = sr0Var.D;
        org.telegram.ui.Components.k81 k81Var = sr0Var.f40297n;
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
        int f10 = f(k81Var.getCurrentPosition());
        oh.h6 h6Var = sr0Var.f40298r;
        h6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = h6Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            oh.m6 m6Var = (oh.m6) obj2;
            hashMap.put(Integer.valueOf(m6Var.f17441a), m6Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            oh.m6 m6Var2 = (oh.m6) hashMap.get(num2);
            if (m6Var2 != null) {
                arrayList4.add(m6Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f10 >= 0) {
            int i13 = i(f10);
            k81Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(sz0Var);
        AndroidUtilities.runOnUIThread(sz0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f39853a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f39854b.getContext());
    }

    @Override
    public final int e() {
        return this.f39854b.f40298r.h.size() + 1 + (this.f39853a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f39853a && i10 == e() - 1) {
            return -1;
        }
        return ((oh.m6) this.f39854b.f40298r.h.get(i10 - 1)).f17441a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f39853a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.poll_add_plus, 0);
            oqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((oh.m6) this.f39854b.f40298r.h.get(i10 - 1)).f17442b;
    }

    @Override
    public final int h(int i10) {
        if (this.f39853a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c3 = this.f39854b.f40298r.c(i10);
        if (c3 == -1) {
            return -1;
        }
        return c3 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
