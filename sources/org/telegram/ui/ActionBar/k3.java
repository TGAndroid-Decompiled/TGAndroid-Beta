package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class k3 extends j1.b {

    public static final int f23607r = 0;

    public final RectF f23608o;

    public final Rect f23609p;

    public final m3 f23610q;

    public k3(m3 m3Var, m3 m3Var2) {
        super(m3Var2);
        this.f23610q = m3Var;
        this.f23608o = new RectF();
        this.f23609p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        j3 j3VarC;
        m3 m3Var = this.f23610q;
        if (!m3Var.f23658b) {
            return -1;
        }
        ArrayList<l3> tabs = m3Var.getTabs();
        if (tabs.isEmpty() || (j3VarC = m3Var.c(tabs.get(0))) == null) {
            return -1;
        }
        float fC = j3VarC.c();
        RectF rectF = this.f23608o;
        m3Var.d(rectF, fC);
        Rect bounds = j3VarC.f23536k.getBounds();
        if (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()))) {
            return rectF.contains(f10, f11) ? 1 : -1;
        }
        return 2;
    }

    @Override
    public final void h(ArrayList arrayList) {
        m3 m3Var = this.f23610q;
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
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            m3 m3Var = this.f23610q;
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty()) {
                l3 l3Var = tabs.get(0);
                if (i10 == 1) {
                    m3Var.b();
                    return true;
                }
                if (i10 == 2) {
                    m3Var.g(l3Var, new cg.h(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        String string;
        String string2;
        m3 m3Var = this.f23610q;
        ArrayList<l3> tabs = m3Var.getTabs();
        l3 l3Var = tabs.isEmpty() ? null : tabs.get(0);
        j3 j3VarC = l3Var != null ? m3Var.c(l3Var) : null;
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f47649c);
        Rect rect = this.f23609p;
        if (j3VarC == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float fC = j3VarC.c();
        RectF rectF = this.f23608o;
        m3Var.d(rectF, fC);
        String strB = l3Var.b() != null ? l3Var.b() : "";
        if (i10 != 2) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(strB)) {
                string = LocaleController.getString(R.string.Open);
            } else {
                string = LocaleController.getString(R.string.Open) + ", " + strB;
            }
            cVar.j(string);
            return;
        }
        Rect bounds = j3VarC.f23536k.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(strB)) {
            string2 = LocaleController.getString(R.string.Close);
        } else {
            string2 = LocaleController.getString(R.string.Close) + ", " + strB;
        }
        cVar.j(string2);
    }
}
