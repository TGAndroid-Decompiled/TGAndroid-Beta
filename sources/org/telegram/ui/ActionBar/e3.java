package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
public final class e3 extends k1.b {
    public static final int f28888r = 0;
    public final RectF f28889o;
    public final Rect f28890p;
    public final g3 f28891q;

    public e3(g3 g3Var, g3 g3Var2) {
        super(g3Var2);
        this.f28891q = g3Var;
        this.f28889o = new RectF();
        this.f28890p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        d3 c10;
        g3 g3Var = this.f28891q;
        if (g3Var.f28962b) {
            ArrayList<f3> tabs = g3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = g3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f28889o;
                g3Var.d(rectF, c11);
                Rect bounds = c10.f28843l.getBounds();
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
        g3 g3Var = this.f28891q;
        if (g3Var.f28962b) {
            ArrayList<f3> tabs = g3Var.getTabs();
            if (tabs.isEmpty() || g3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            g3 g3Var = this.f28891q;
            ArrayList<f3> tabs = g3Var.getTabs();
            if (!tabs.isEmpty()) {
                f3 f3Var = tabs.get(0);
                if (i7 == 1) {
                    g3Var.b();
                    return true;
                } else if (i7 == 2) {
                    g3Var.g(f3Var, new fi.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        f3 f3Var;
        d3 c10;
        String str;
        String str2;
        g3 g3Var = this.f28891q;
        ArrayList<f3> tabs = g3Var.getTabs();
        if (tabs.isEmpty()) {
            f3Var = null;
        } else {
            f3Var = tabs.get(0);
        }
        if (f3Var == null) {
            c10 = null;
        } else {
            c10 = g3Var.c(f3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f56733c);
        String str3 = "";
        Rect rect = this.f28890p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.f28889o;
        g3Var.d(rectF, c11);
        if (f3Var.b() != null) {
            str3 = f3Var.b();
        }
        if (i7 == 2) {
            Rect bounds = c10.f28843l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            cVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = gd.M0(2131752030, null);
            } else {
                str2 = gd.M0(2131752030, null) + ", " + str3;
            }
            cVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        cVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = gd.M0(2131747624, null);
        } else {
            str = gd.M0(2131747624, null) + ", " + str3;
        }
        cVar.j(str);
    }
}
