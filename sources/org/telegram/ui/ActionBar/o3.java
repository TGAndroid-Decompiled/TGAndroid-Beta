package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o3 extends j1.b {
    public static final int f18517r = 0;
    public final RectF f18518o;
    public final Rect f18519p;
    public final q3 f18520q;

    public o3(q3 q3Var, q3 q3Var2) {
        super(q3Var2);
        this.f18520q = q3Var;
        this.f18518o = new RectF();
        this.f18519p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        n3 c10;
        q3 q3Var = this.f18520q;
        if (q3Var.f18575b) {
            ArrayList<p3> tabs = q3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = q3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f18518o;
                q3Var.d(rectF, c11);
                Rect bounds = c10.f18495k.getBounds();
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
        q3 q3Var = this.f18520q;
        if (q3Var.f18575b) {
            ArrayList<p3> tabs = q3Var.getTabs();
            if (tabs.isEmpty() || q3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            q3 q3Var = this.f18520q;
            ArrayList<p3> tabs = q3Var.getTabs();
            if (!tabs.isEmpty()) {
                p3 p3Var = tabs.get(0);
                if (i10 == 1) {
                    q3Var.b();
                    return true;
                } else if (i10 == 2) {
                    q3Var.g(p3Var, new l3(1));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        p3 p3Var;
        String str;
        String str2;
        q3 q3Var = this.f18520q;
        ArrayList<p3> tabs = q3Var.getTabs();
        n3 n3Var = null;
        if (tabs.isEmpty()) {
            p3Var = null;
        } else {
            p3Var = tabs.get(0);
        }
        if (p3Var != null) {
            n3Var = q3Var.c(p3Var);
        }
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f41553c);
        String str3 = "";
        Rect rect = this.f18519p;
        if (n3Var == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c10 = n3Var.c();
        RectF rectF = this.f18518o;
        q3Var.d(rectF, c10);
        if (p3Var.b() != null) {
            str3 = p3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = n3Var.f18495k.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            dVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = LocaleController.getString(R.string.Close);
            } else {
                str2 = LocaleController.getString(R.string.Close) + ", " + str3;
            }
            dVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        dVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = LocaleController.getString(R.string.Open);
        } else {
            str = LocaleController.getString(R.string.Open) + ", " + str3;
        }
        dVar.j(str);
    }
}
