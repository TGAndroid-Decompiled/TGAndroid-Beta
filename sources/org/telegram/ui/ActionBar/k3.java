package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k3 extends j1.b {
    public static final int f20472r = 0;
    public final RectF f20473o;
    public final Rect f20474p;
    public final m3 f20475q;

    public k3(m3 m3Var, m3 m3Var2) {
        super(m3Var2);
        this.f20475q = m3Var;
        this.f20473o = new RectF();
        this.f20474p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        j3 c10;
        m3 m3Var = this.f20475q;
        if (m3Var.f20527b) {
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = m3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f20473o;
                m3Var.d(rectF, c11);
                Rect bounds = c10.f20395l.getBounds();
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
        m3 m3Var = this.f20475q;
        if (m3Var.f20527b) {
            ArrayList<l3> tabs = m3Var.getTabs();
            if (tabs.isEmpty() || m3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            m3 m3Var = this.f20475q;
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty()) {
                l3 l3Var = tabs.get(0);
                if (i10 == 1) {
                    m3Var.b();
                    return true;
                } else if (i10 == 2) {
                    m3Var.g(l3Var, new bi.f(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        l3 l3Var;
        String str;
        String str2;
        m3 m3Var = this.f20475q;
        ArrayList<l3> tabs = m3Var.getTabs();
        j3 j3Var = null;
        if (tabs.isEmpty()) {
            l3Var = null;
        } else {
            l3Var = tabs.get(0);
        }
        if (l3Var != null) {
            j3Var = m3Var.c(l3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f44789c);
        String str3 = "";
        Rect rect = this.f20474p;
        if (j3Var == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c10 = j3Var.c();
        RectF rectF = this.f20473o;
        m3Var.d(rectF, c10);
        if (l3Var.b() != null) {
            str3 = l3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = j3Var.f20395l.getBounds();
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
