package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
public final class d3 extends k1.b {
    public static final int f28925r = 0;
    public final RectF f28926o;
    public final Rect f28927p;
    public final f3 f28928q;

    public d3(f3 f3Var, f3 f3Var2) {
        super(f3Var2);
        this.f28928q = f3Var;
        this.f28926o = new RectF();
        this.f28927p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        c3 c10;
        f3 f3Var = this.f28928q;
        if (f3Var.f29005b) {
            ArrayList<e3> tabs = f3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = f3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f28926o;
                f3Var.d(rectF, c11);
                Rect bounds = c10.f28892l.getBounds();
                if (!bounds.isEmpty() && bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
                    return 2;
                }
                if (rectF.contains(f10, f11)) {
                    return 1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        f3 f3Var = this.f28928q;
        if (f3Var.f29005b) {
            ArrayList<e3> tabs = f3Var.getTabs();
            if (tabs.isEmpty() || f3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            f3 f3Var = this.f28928q;
            ArrayList<e3> tabs = f3Var.getTabs();
            if (!tabs.isEmpty()) {
                e3 e3Var = tabs.get(0);
                if (i7 == 1) {
                    f3Var.b();
                    return true;
                } else if (i7 == 2) {
                    f3Var.g(e3Var, new fi.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        e3 e3Var;
        c3 c10;
        String str;
        String str2;
        f3 f3Var = this.f28928q;
        ArrayList<e3> tabs = f3Var.getTabs();
        if (tabs.isEmpty()) {
            e3Var = null;
        } else {
            e3Var = tabs.get(0);
        }
        if (e3Var == null) {
            c10 = null;
        } else {
            c10 = f3Var.c(e3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f56856c);
        String str3 = "";
        Rect rect = this.f28927p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.f28926o;
        f3Var.d(rectF, c11);
        if (e3Var.b() != null) {
            str3 = e3Var.b();
        }
        if (i7 == 2) {
            Rect bounds = c10.f28892l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            cVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = gd.N0(2131752029, null);
            } else {
                str2 = gd.N0(2131752029, null) + ", " + str3;
            }
            cVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        cVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = gd.N0(2131747623, null);
        } else {
            str = gd.N0(2131747623, null) + ", " + str3;
        }
        cVar.j(str);
    }
}
