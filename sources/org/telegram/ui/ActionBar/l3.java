package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l3 extends j1.b {
    public static final int f20421r = 0;
    public final RectF f20422o;
    public final Rect f20423p;
    public final n3 f20424q;

    public l3(n3 n3Var, n3 n3Var2) {
        super(n3Var2);
        this.f20424q = n3Var;
        this.f20422o = new RectF();
        this.f20423p = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        k3 c3;
        n3 n3Var = this.f20424q;
        if (n3Var.f20482b) {
            ArrayList<m3> tabs = n3Var.getTabs();
            if (!tabs.isEmpty() && (c3 = n3Var.c(tabs.get(0))) != null) {
                float c10 = c3.c();
                RectF rectF = this.f20422o;
                n3Var.d(rectF, c10);
                Rect bounds = c3.f20367k.getBounds();
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
        n3 n3Var = this.f20424q;
        if (n3Var.f20482b) {
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
            n3 n3Var = this.f20424q;
            ArrayList<m3> tabs = n3Var.getTabs();
            if (!tabs.isEmpty()) {
                m3 m3Var = tabs.get(0);
                if (i10 == 1) {
                    n3Var.b();
                    return true;
                } else if (i10 == 2) {
                    n3Var.g(m3Var, new gg.h(2));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.e eVar) {
        m3 m3Var;
        String str;
        String str2;
        n3 n3Var = this.f20424q;
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
        eVar.i("android.widget.Button");
        eVar.b(s0.c.f43897c);
        String str3 = "";
        Rect rect = this.f20423p;
        if (k3Var == null) {
            rect.set(0, 0, 1, 1);
            eVar.h(rect);
            eVar.j("");
            eVar.p(false);
            return;
        }
        float c3 = k3Var.c();
        RectF rectF = this.f20422o;
        n3Var.d(rectF, c3);
        if (m3Var.b() != null) {
            str3 = m3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = k3Var.f20367k.getBounds();
            rect.set((int) (rectF.left + bounds.left), (int) (rectF.centerY() + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.centerY() + bounds.bottom));
            eVar.h(rect);
            if (TextUtils.isEmpty(str3)) {
                str2 = LocaleController.getString(R.string.Close);
            } else {
                str2 = LocaleController.getString(R.string.Close) + ", " + str3;
            }
            eVar.j(str2);
            return;
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        eVar.h(rect);
        if (TextUtils.isEmpty(str3)) {
            str = LocaleController.getString(R.string.Open);
        } else {
            str = LocaleController.getString(R.string.Open) + ", " + str3;
        }
        eVar.j(str);
    }
}
