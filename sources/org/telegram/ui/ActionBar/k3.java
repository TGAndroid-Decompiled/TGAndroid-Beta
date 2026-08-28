package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k3 extends j1.b {
    public static final int f23606r = 0;
    public final RectF f23607o;
    public final Rect f23608p;
    public final m3 f23609q;

    public k3(m3 m3Var, m3 m3Var2) {
        super(m3Var2);
        this.f23609q = m3Var;
        this.f23607o = new RectF();
        this.f23608p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        j3 c10;
        m3 m3Var = this.f23609q;
        if (m3Var.f23658b) {
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = m3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f23607o;
                m3Var.d(rectF, c11);
                Rect bounds = c10.f23535k.getBounds();
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
        m3 m3Var = this.f23609q;
        if (m3Var.f23658b) {
            ArrayList<l3> tabs = m3Var.getTabs();
            if (tabs.isEmpty() || m3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i9, int i10) {
        if (i10 == 16) {
            m3 m3Var = this.f23609q;
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty()) {
                l3 l3Var = tabs.get(0);
                if (i9 == 1) {
                    m3Var.b();
                    return true;
                } else if (i9 == 2) {
                    m3Var.g(l3Var, new bg.k(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i9, s0.d dVar) {
        l3 l3Var;
        String str;
        String str2;
        m3 m3Var = this.f23609q;
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
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f47285c);
        String str3 = "";
        Rect rect = this.f23608p;
        if (j3Var == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c10 = j3Var.c();
        RectF rectF = this.f23607o;
        m3Var.d(rectF, c10);
        if (l3Var.b() != null) {
            str3 = l3Var.b();
        }
        if (i9 == 2) {
            Rect bounds = j3Var.f23535k.getBounds();
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
