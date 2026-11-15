package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
public final class a3 extends k1.b {
    public static final int f28399r = 0;
    public final RectF f28400o;
    public final Rect f28401p;
    public final c3 f28402q;

    public a3(c3 c3Var, c3 c3Var2) {
        super(c3Var2);
        this.f28402q = c3Var;
        this.f28400o = new RectF();
        this.f28401p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        z2 c10;
        c3 c3Var = this.f28402q;
        if (c3Var.f28481b) {
            ArrayList<b3> tabs = c3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = c3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f28400o;
                c3Var.d(rectF, c11);
                Rect bounds = c10.f29922l.getBounds();
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
        c3 c3Var = this.f28402q;
        if (c3Var.f28481b) {
            ArrayList<b3> tabs = c3Var.getTabs();
            if (tabs.isEmpty() || c3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        if (i10 == 16) {
            c3 c3Var = this.f28402q;
            ArrayList<b3> tabs = c3Var.getTabs();
            if (!tabs.isEmpty()) {
                b3 b3Var = tabs.get(0);
                if (i7 == 1) {
                    c3Var.b();
                    return true;
                } else if (i7 == 2) {
                    c3Var.g(b3Var, new fi.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        b3 b3Var;
        z2 c10;
        String str;
        String str2;
        c3 c3Var = this.f28402q;
        ArrayList<b3> tabs = c3Var.getTabs();
        if (tabs.isEmpty()) {
            b3Var = null;
        } else {
            b3Var = tabs.get(0);
        }
        if (b3Var == null) {
            c10 = null;
        } else {
            c10 = c3Var.c(b3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f56159c);
        String str3 = "";
        Rect rect = this.f28401p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.f28400o;
        c3Var.d(rectF, c11);
        if (b3Var.b() != null) {
            str3 = b3Var.b();
        }
        if (i7 == 2) {
            Rect bounds = c10.f29922l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            cVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = hd.M0(2131752041, null);
            } else {
                str2 = hd.M0(2131752041, null) + ", " + str3;
            }
            cVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        cVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = hd.M0(2131747817, null);
        } else {
            str = hd.M0(2131747817, null) + ", " + str3;
        }
        cVar.j(str);
    }
}
