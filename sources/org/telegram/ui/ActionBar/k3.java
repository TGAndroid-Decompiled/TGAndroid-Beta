package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k3 extends j1.b {
    public static final int f19585r = 0;
    public final RectF f19586o;
    public final Rect f19587p;
    public final m3 f19588q;

    public k3(m3 m3Var, m3 m3Var2) {
        super(m3Var2);
        this.f19588q = m3Var;
        this.f19586o = new RectF();
        this.f19587p = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        j3 c10;
        m3 m3Var = this.f19588q;
        if (m3Var.f19642b) {
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty() && (c10 = m3Var.c(tabs.get(0))) != null) {
                float c11 = c10.c();
                RectF rectF = this.f19586o;
                m3Var.d(rectF, c11);
                Rect bounds = c10.f19496k.getBounds();
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
        m3 m3Var = this.f19588q;
        if (m3Var.f19642b) {
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
            m3 m3Var = this.f19588q;
            ArrayList<l3> tabs = m3Var.getTabs();
            if (!tabs.isEmpty()) {
                l3 l3Var = tabs.get(0);
                if (i10 == 1) {
                    m3Var.b();
                    return true;
                } else if (i10 == 2) {
                    m3Var.g(l3Var, new ai.i(7));
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        l3 l3Var;
        String str;
        String str2;
        m3 m3Var = this.f19588q;
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
        dVar.b(s0.c.f42904c);
        String str3 = "";
        Rect rect = this.f19587p;
        if (j3Var == null) {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.j("");
            dVar.p(false);
            return;
        }
        float c10 = j3Var.c();
        RectF rectF = this.f19586o;
        m3Var.d(rectF, c10);
        if (l3Var.b() != null) {
            str3 = l3Var.b();
        }
        if (i10 == 2) {
            Rect bounds = j3Var.f19496k.getBounds();
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
