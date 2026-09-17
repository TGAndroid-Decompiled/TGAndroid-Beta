package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b21 extends org.telegram.ui.Components.b81 {
    public boolean f32036a;
    public final org.telegram.ui.Components.ur0 f32037b;

    public b21(org.telegram.ui.Components.ur0 ur0Var) {
        this.f32037b = ur0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ur0 ur0Var = this.f32037b;
        g01 g01Var = ur0Var.G;
        org.telegram.ui.Components.i81 i81Var = ur0Var.f32645n;
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
        int f7 = f(i81Var.getCurrentPosition());
        ai.x8 x8Var = ur0Var.f32646r;
        x8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = x8Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            ai.e9 e9Var = (ai.e9) obj2;
            hashMap.put(Integer.valueOf(e9Var.f773a), e9Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ai.e9 e9Var2 = (ai.e9) hashMap.get(num2);
            if (e9Var2 != null) {
                arrayList4.add(e9Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            i81Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(g01Var);
        AndroidUtilities.runOnUIThread(g01Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f32036a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f32037b.getContext());
    }

    @Override
    public final int e() {
        return this.f32037b.f32646r.h.size() + 1 + (this.f32036a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f32036a && i10 == e() - 1) {
            return -1;
        }
        return ((ai.e9) this.f32037b.f32646r.h.get(i10 - 1)).f773a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f32036a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.poll_add_plus, 0);
            oqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((ai.e9) this.f32037b.f32646r.h.get(i10 - 1)).f774b;
    }

    @Override
    public final int h(int i10) {
        if (this.f32036a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f32037b.f32646r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
