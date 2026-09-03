package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m3 extends j1.b {
    public static final int f22131r = 0;
    public final RectF f22132o;
    public final Rect f22133p;
    public final o3 f22134q;

    public m3(o3 o3Var, o3 o3Var2) {
        super(o3Var2);
        this.f22134q = o3Var;
        this.f22132o = new RectF();
        this.f22133p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        l3 c3;
        o3 o3Var = this.f22134q;
        if (o3Var.f22195b) {
            ArrayList<n3> tabs = o3Var.getTabs();
            if (!tabs.isEmpty() && (c3 = o3Var.c(tabs.get(0))) != null) {
                float c10 = c3.c();
                RectF rectF = this.f22132o;
                o3Var.d(rectF, c10);
                Rect bounds = c3.f22075k.getBounds();
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
        o3 o3Var = this.f22134q;
        if (o3Var.f22195b) {
            ArrayList<n3> tabs = o3Var.getTabs();
            if (tabs.isEmpty() || o3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            o3 o3Var = this.f22134q;
            ArrayList<n3> tabs = o3Var.getTabs();
            if (!tabs.isEmpty()) {
                n3 n3Var = tabs.get(0);
                if (i10 == 1) {
                    o3Var.b();
                    return true;
                } else if (i10 == 2) {
                    o3Var.g(n3Var, new hg.h(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        n3 n3Var;
        String str;
        String str2;
        o3 o3Var = this.f22134q;
        ArrayList<n3> tabs = o3Var.getTabs();
        l3 l3Var = null;
        if (tabs.isEmpty()) {
            n3Var = null;
        } else {
            n3Var = tabs.get(0);
        }
        if (n3Var != null) {
            l3Var = o3Var.c(n3Var);
        }
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f46874c);
        String str3 = "";
        Rect rect = this.f22133p;
        if (l3Var == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c3 = l3Var.c();
        RectF rectF = this.f22132o;
        o3Var.d(rectF, c3);
        if (n3Var.b() != null) {
            str3 = n3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = l3Var.f22075k.getBounds();
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
