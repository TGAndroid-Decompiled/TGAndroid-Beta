package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m3 extends j1.b {
    public static final int f21192r = 0;
    public final RectF f21193o;
    public final Rect f21194p;
    public final o3 f21195q;

    public m3(o3 o3Var, o3 o3Var2) {
        super(o3Var2);
        this.f21195q = o3Var;
        this.f21193o = new RectF();
        this.f21194p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        l3 c10;
        o3 o3Var = this.f21195q;
        if (o3Var.f21254b) {
            ArrayList<n3> tabs = o3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = o3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f21193o;
                o3Var.d(rectF, c11);
                Rect bounds = c10.f21154k.getBounds();
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
        o3 o3Var = this.f21195q;
        if (o3Var.f21254b) {
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
            o3 o3Var = this.f21195q;
            ArrayList<n3> tabs = o3Var.getTabs();
            if (!tabs.isEmpty()) {
                n3 n3Var = tabs.get(0);
                if (i10 == 1) {
                    o3Var.b();
                    return true;
                } else if (i10 == 2) {
                    o3Var.g(n3Var, new j3(1));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        n3 n3Var;
        String str;
        String str2;
        o3 o3Var = this.f21195q;
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
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f45678c);
        String str3 = "";
        Rect rect = this.f21194p;
        if (l3Var == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c10 = l3Var.c();
        RectF rectF = this.f21193o;
        o3Var.d(rectF, c10);
        if (n3Var.b() != null) {
            str3 = n3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = l3Var.f21154k.getBounds();
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
