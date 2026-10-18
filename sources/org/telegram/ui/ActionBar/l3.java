package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l3 extends j1.b {
    public static final int f21562r = 0;
    public final RectF f21563o;
    public final Rect f21564p;
    public final n3 f21565q;

    public l3(n3 n3Var, n3 n3Var2) {
        super(n3Var2);
        this.f21565q = n3Var;
        this.f21563o = new RectF();
        this.f21564p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        k3 c10;
        n3 n3Var = this.f21565q;
        if (n3Var.f21617b) {
            ArrayList<m3> tabs = n3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = n3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f21563o;
                n3Var.d(rectF, c11);
                Rect bounds = c10.f21535l.getBounds();
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
        n3 n3Var = this.f21565q;
        if (n3Var.f21617b) {
            ArrayList<m3> tabs = n3Var.getTabs();
            if (tabs.isEmpty() || n3Var.c(tabs.get(0)) == null) {
                return;
            }
            arrayList.add(1);
            arrayList.add(2);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        if (i11 == 16) {
            n3 n3Var = this.f21565q;
            ArrayList<m3> tabs = n3Var.getTabs();
            if (!tabs.isEmpty()) {
                m3 m3Var = tabs.get(0);
                if (i10 == 1) {
                    n3Var.b();
                    return true;
                } else if (i10 == 2) {
                    n3Var.g(m3Var, new ci.e(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        m3 m3Var;
        String str;
        String str2;
        n3 n3Var = this.f21565q;
        ArrayList<m3> tabs = n3Var.getTabs();
        k3 k3Var = null;
        if (tabs.isEmpty()) {
            m3Var = null;
        } else {
            m3Var = tabs.get(0);
        }
        if (m3Var != null) {
            k3Var = n3Var.c(m3Var);
        }
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f45909c);
        String str3 = "";
        Rect rect = this.f21564p;
        if (k3Var == null) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.j("");
            cVar.p(false);
            return;
        }
        float c10 = k3Var.c();
        RectF rectF = this.f21563o;
        n3Var.d(rectF, c10);
        if (m3Var.b() != null) {
            str3 = m3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = k3Var.f21535l.getBounds();
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
