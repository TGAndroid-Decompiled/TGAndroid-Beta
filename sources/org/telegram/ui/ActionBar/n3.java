package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n3 extends j1.b {
    public static final int f19431r = 0;
    public final RectF f19432o;
    public final Rect f19433p;
    public final p3 f19434q;

    public n3(p3 p3Var, p3 p3Var2) {
        super(p3Var2);
        this.f19434q = p3Var;
        this.f19432o = new RectF();
        this.f19433p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        m3 c10;
        p3 p3Var = this.f19434q;
        if (p3Var.f19489b) {
            ArrayList<o3> tabs = p3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = p3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f19432o;
                p3Var.d(rectF, c11);
                Rect bounds = c10.f19408k.getBounds();
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
        p3 p3Var = this.f19434q;
        if (p3Var.f19489b) {
            ArrayList<o3> tabs = p3Var.getTabs();
            if (tabs.isEmpty() || p3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            p3 p3Var = this.f19434q;
            ArrayList<o3> tabs = p3Var.getTabs();
            if (!tabs.isEmpty()) {
                o3 o3Var = tabs.get(0);
                if (i10 == 1) {
                    p3Var.b();
                    return true;
                } else if (i10 == 2) {
                    p3Var.g(o3Var, new k3(1));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        o3 o3Var;
        String str;
        String str2;
        p3 p3Var = this.f19434q;
        ArrayList<o3> tabs = p3Var.getTabs();
        m3 m3Var = null;
        if (tabs.isEmpty()) {
            o3Var = null;
        } else {
            o3Var = tabs.get(0);
        }
        if (o3Var != null) {
            m3Var = p3Var.c(o3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f42645c);
        String str3 = "";
        Rect rect = this.f19433p;
        if (m3Var == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c10 = m3Var.c();
        RectF rectF = this.f19432o;
        p3Var.d(rectF, c10);
        if (o3Var.b() != null) {
            str3 = o3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = m3Var.f19408k.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            cVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = LocaleController.getString(R.string.Close);
            } else {
                str2 = LocaleController.getString(R.string.Close) + ", " + str3;
            }
            cVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        cVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = LocaleController.getString(R.string.Open);
        } else {
            str = LocaleController.getString(R.string.Open) + ", " + str3;
        }
        cVar.j(str);
    }
}
