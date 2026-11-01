package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.dd;
public final class g3 extends j1.b {
    public static final int f20339r = 0;
    public final RectF f20340o;
    public final Rect f20341p;
    public final i3 f20342q;

    public g3(i3 i3Var, i3 i3Var2) {
        super(i3Var2);
        this.f20342q = i3Var;
        this.f20340o = new RectF();
        this.f20341p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        f3 c10;
        i3 i3Var = this.f20342q;
        if (i3Var.f20394b) {
            ArrayList<h3> tabs = i3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = i3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f20340o;
                i3Var.d(rectF, c11);
                Rect bounds = c10.f20307l.getBounds();
                if (!bounds.isEmpty() && bounds.contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()))) {
                    return 2;
                }
                if (rectF.contains(f7, f10)) {
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
        i3 i3Var = this.f20342q;
        if (i3Var.f20394b) {
            ArrayList<h3> tabs = i3Var.getTabs();
            if (tabs.isEmpty() || i3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            i3 i3Var = this.f20342q;
            ArrayList<h3> tabs = i3Var.getTabs();
            if (!tabs.isEmpty()) {
                h3 h3Var = tabs.get(0);
                if (i10 == 1) {
                    i3Var.b();
                    return true;
                } else if (i10 == 2) {
                    i3Var.g(h3Var, new ag.z0(6));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        h3 h3Var;
        f3 c10;
        String str;
        String str2;
        i3 i3Var = this.f20342q;
        ArrayList<h3> tabs = i3Var.getTabs();
        if (tabs.isEmpty()) {
            h3Var = null;
        } else {
            h3Var = tabs.get(0);
        }
        if (h3Var == null) {
            c10 = null;
        } else {
            c10 = i3Var.c(h3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f47855c);
        String str3 = "";
        Rect rect = this.f20341p;
        if (c10 == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c11 = c10.c();
        RectF rectF = this.f20340o;
        i3Var.d(rectF, c11);
        if (h3Var.b() != null) {
            str3 = h3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = c10.f20307l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            cVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = dd.L0(2131752041, null);
            } else {
                str2 = dd.L0(2131752041, null) + ", " + str3;
            }
            cVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        cVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = dd.L0(2131747833, null);
        } else {
            str = dd.L0(2131747833, null) + ", " + str3;
        }
        cVar.j(str);
    }
}
