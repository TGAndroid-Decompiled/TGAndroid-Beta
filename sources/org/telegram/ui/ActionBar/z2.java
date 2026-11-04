package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
public final class z2 extends j1.b {
    public static final int f28884r = 0;
    public final RectF f28885o;
    public final Rect f28886p;
    public final b3 f28887q;

    public z2(b3 b3Var, b3 b3Var2) {
        super(b3Var2);
        this.f28887q = b3Var;
        this.f28885o = new RectF();
        this.f28886p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        y2 c2;
        b3 b3Var = this.f28887q;
        if (b3Var.f27400b) {
            ArrayList<a3> tabs = b3Var.getTabs();
            if (!tabs.isEmpty() && (c2 = b3Var.c(tabs.get(0))) != null) {
                float c10 = c2.c();
                RectF rectF = this.f28885o;
                b3Var.d(rectF, c10);
                Rect bounds = c2.f28834l.getBounds();
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
        b3 b3Var = this.f28887q;
        if (b3Var.f27400b) {
            ArrayList<a3> tabs = b3Var.getTabs();
            if (tabs.isEmpty() || b3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i3, int i10) {
        if (i10 == 16) {
            b3 b3Var = this.f28887q;
            ArrayList<a3> tabs = b3Var.getTabs();
            if (!tabs.isEmpty()) {
                a3 a3Var = tabs.get(0);
                if (i3 == 1) {
                    b3Var.b();
                    return true;
                } else if (i3 == 2) {
                    b3Var.g(a3Var, new ei.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i3, s0.d dVar) {
        a3 a3Var;
        y2 c2;
        String str;
        String str2;
        b3 b3Var = this.f28887q;
        ArrayList<a3> tabs = b3Var.getTabs();
        if (tabs.isEmpty()) {
            a3Var = null;
        } else {
            a3Var = tabs.get(0);
        }
        if (a3Var == null) {
            c2 = null;
        } else {
            c2 = b3Var.c(a3Var);
        }
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f54563c);
        String str3 = "";
        Rect rect = this.f28886p;
        if (c2 == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c10 = c2.c();
        RectF rectF = this.f28885o;
        b3Var.d(rectF, c10);
        if (a3Var.b() != null) {
            str3 = a3Var.b();
        }
        if (i3 == 2) {
            Rect bounds = c2.f28834l.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            dVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = bd.M0(2131752041, null);
            } else {
                str2 = bd.M0(2131752041, null) + ", " + str3;
            }
            dVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        dVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = bd.M0(2131747825, null);
        } else {
            str = bd.M0(2131747825, null) + ", " + str3;
        }
        dVar.j(str);
    }
}
