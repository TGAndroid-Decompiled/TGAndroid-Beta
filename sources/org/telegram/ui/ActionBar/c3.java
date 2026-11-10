package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.id;
public final class c3 extends k1.b {
    public static final int f27362r = 0;
    public final RectF f27363o;
    public final Rect f27364p;
    public final e3 f27365q;

    public c3(e3 e3Var, e3 e3Var2) {
        super(e3Var2);
        this.f27365q = e3Var;
        this.f27363o = new RectF();
        this.f27364p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        b3 c10;
        e3 e3Var = this.f27365q;
        if (e3Var.f27433b) {
            ArrayList<d3> tabs = e3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = e3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f27363o;
                e3Var.d(rectF, c11);
                Rect bounds = c10.f27336l.getBounds();
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
        e3 e3Var = this.f27365q;
        if (e3Var.f27433b) {
            ArrayList<d3> tabs = e3Var.getTabs();
            if (tabs.isEmpty() || e3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            e3 e3Var = this.f27365q;
            ArrayList<d3> tabs = e3Var.getTabs();
            if (!tabs.isEmpty()) {
                d3 d3Var = tabs.get(0);
                if (i7 == 1) {
                    e3Var.b();
                    return true;
                } else if (i7 == 2) {
                    e3Var.g(d3Var, new di.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        d3 d3Var;
        b3 c10;
        String str;
        String str2;
        e3 e3Var = this.f27365q;
        ArrayList<d3> tabs = e3Var.getTabs();
        if (tabs.isEmpty()) {
            d3Var = null;
        } else {
            d3Var = tabs.get(0);
        }
        if (d3Var == null) {
            c10 = null;
        } else {
            c10 = e3Var.c(d3Var);
        }
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f54605c);
        String str3 = "";
        Rect rect = this.f27364p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.f27363o;
        e3Var.d(rectF, c11);
        if (d3Var.b() != null) {
            str3 = d3Var.b();
        }
        if (i7 == 2) {
            Rect bounds = c10.f27336l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            dVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = id.M0(2131752041, null);
            } else {
                str2 = id.M0(2131752041, null) + ", " + str3;
            }
            dVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        dVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = id.M0(2131747817, null);
        } else {
            str = id.M0(2131747817, null) + ", " + str3;
        }
        dVar.j(str);
    }
}
