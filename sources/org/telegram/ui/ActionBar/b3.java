package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
public final class b3 extends k1.b {
    public static final int f27336r = 0;
    public final RectF f27337o;
    public final Rect f27338p;
    public final d3 f27339q;

    public b3(d3 d3Var, d3 d3Var2) {
        super(d3Var2);
        this.f27339q = d3Var;
        this.f27337o = new RectF();
        this.f27338p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        a3 c10;
        d3 d3Var = this.f27339q;
        if (d3Var.f27425b) {
            ArrayList<c3> tabs = d3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = d3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f27337o;
                d3Var.d(rectF, c11);
                Rect bounds = c10.f27311l.getBounds();
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
        d3 d3Var = this.f27339q;
        if (d3Var.f27425b) {
            ArrayList<c3> tabs = d3Var.getTabs();
            if (tabs.isEmpty() || d3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            d3 d3Var = this.f27339q;
            ArrayList<c3> tabs = d3Var.getTabs();
            if (!tabs.isEmpty()) {
                c3 c3Var = tabs.get(0);
                if (i7 == 1) {
                    d3Var.b();
                    return true;
                } else if (i7 == 2) {
                    d3Var.g(c3Var, new di.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        c3 c3Var;
        a3 c10;
        String str;
        String str2;
        d3 d3Var = this.f27339q;
        ArrayList<c3> tabs = d3Var.getTabs();
        if (tabs.isEmpty()) {
            c3Var = null;
        } else {
            c3Var = tabs.get(0);
        }
        if (c3Var == null) {
            c10 = null;
        } else {
            c10 = d3Var.c(c3Var);
        }
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f54502c);
        String str3 = "";
        Rect rect = this.f27338p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.f27337o;
        d3Var.d(rectF, c11);
        if (c3Var.b() != null) {
            str3 = c3Var.b();
        }
        if (i7 == 2) {
            Rect bounds = c10.f27311l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            dVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = hd.M0(2131752041, null);
            } else {
                str2 = hd.M0(2131752041, null) + ", " + str3;
            }
            dVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        dVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = hd.M0(2131747816, null);
        } else {
            str = hd.M0(2131747816, null) + ", " + str3;
        }
        dVar.j(str);
    }
}
