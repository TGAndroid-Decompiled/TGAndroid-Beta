package org.telegram.ui;

import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f11 extends org.telegram.ui.Components.u81 {
    public boolean f36763a;
    public final org.telegram.ui.Components.ns0 f36764b;

    public f11(org.telegram.ui.Components.ns0 ns0Var) {
        this.f36764b = ns0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        org.telegram.ui.Components.ns0 ns0Var = this.f36764b;
        sy0 sy0Var = ns0Var.G;
        org.telegram.ui.Components.b91 b91Var = ns0Var.f37108n;
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
        int f7 = f(b91Var.getCurrentPosition());
        ci.w6 w6Var = ns0Var.f37109r;
        w6Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = w6Var.h;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            ci.b7 b7Var = (ci.b7) obj2;
            hashMap.put(Integer.valueOf(b7Var.f5253a), b7Var);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            ci.b7 b7Var2 = (ci.b7) hashMap.get(num2);
            if (b7Var2 != null) {
                arrayList4.add(b7Var2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        if (f7 >= 0) {
            int i13 = i(f7);
            b91Var.e(0.0f, i13, i13);
        }
        AndroidUtilities.cancelRunOnUIThread(sy0Var);
        AndroidUtilities.runOnUIThread(sy0Var, 1000L);
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        if (this.f36763a && i10 == e() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new View(this.f36764b.getContext());
    }

    @Override
    public final int e() {
        return this.f36764b.f37109r.h.size() + 1 + (this.f36763a ? 1 : 0);
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f36763a && i10 == e() - 1) {
            return -1;
        }
        return ((ci.b7) this.f36764b.f37109r.h.get(i10 - 1)).f5253a;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.StoriesAlbumNameAllStories);
        }
        if (this.f36763a && i10 == e() - 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoriesAlbumAddAlbum));
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.poll_add_plus, 0);
            yqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            return spannableStringBuilder;
        }
        return ((ci.b7) this.f36764b.f37109r.h.get(i10 - 1)).f5254b;
    }

    @Override
    public final int h(int i10) {
        if (this.f36763a && i10 == e() - 1) {
            return -1;
        }
        return i10;
    }

    public final int i(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int c10 = this.f36764b.f37109r.c(i10);
        if (c10 == -1) {
            return -1;
        }
        return c10 + 1;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
