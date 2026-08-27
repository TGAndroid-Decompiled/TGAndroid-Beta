package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class r3 extends j1.b {

    public final Rect f23750o;

    public final v3 f23751p;

    public r3(v3 v3Var, v3 v3Var2) {
        super(v3Var2);
        this.f23751p = v3Var;
        this.f23750o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        v3 v3Var = this.f23751p;
        ArrayList arrayList = v3Var.N;
        if (v3Var.R < 0.5f) {
            return -1;
        }
        org.telegram.ui.Cells.z zVar = v3Var.f23891e0;
        if (zVar != null && zVar.getBounds().contains((int) f10, (int) f11)) {
            return 1;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u3 u3Var = (u3) arrayList.get(size);
            float f12 = u3Var.f23833i;
            RectF rectF = u3Var.f23827a;
            if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                Rect bounds = u3Var.d.f23536k.getBounds();
                return (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) ((f11 - rectF.top) - ((float) AndroidUtilities.dp(24.0f))))) ? size + 1000 : size + 2000;
            }
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        v3 v3Var = this.f23751p;
        ArrayList arrayList2 = v3Var.N;
        if (v3Var.R < 0.5f) {
            return;
        }
        org.telegram.ui.Cells.z zVar = v3Var.f23891e0;
        if (zVar != null && !zVar.getBounds().isEmpty()) {
            arrayList.add(1);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            u3 u3Var = (u3) arrayList2.get(i10);
            if (Math.abs(u3Var.f23833i) < 0.4f && !u3Var.f23827a.isEmpty()) {
                arrayList.add(Integer.valueOf(i10 + 1000));
                j3 j3Var = u3Var.d;
                if (j3Var != null && !j3Var.f23536k.getBounds().isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 2000));
                }
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z10;
        v3 v3Var = this.f23751p;
        ArrayList arrayList = v3Var.N;
        if (i11 == 16) {
            if (i10 == 1) {
                m3 m3Var = v3Var.f23883a;
                if (m3Var != null) {
                    m3Var.f();
                }
                v3Var.a(false);
                return true;
            }
            if (i10 >= 2000) {
                i12 = i10 - 2000;
                z10 = true;
            } else if (i10 >= 1000) {
                i12 = i10 - 1000;
                z10 = false;
            }
            if (i12 >= 0 && i12 < arrayList.size()) {
                u3 u3Var = (u3) arrayList.get(i12);
                if (z10) {
                    m3 m3Var2 = v3Var.f23883a;
                    if (m3Var2 != null) {
                        m3Var2.g(u3Var.f23829c, new gh.d1(27, this, u3Var));
                        return true;
                    }
                } else if (v3Var.f23883a != null) {
                    v3Var.a(false);
                    u3Var.getClass();
                    v3Var.f23883a.e(u3Var.f23829c);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        int i11;
        boolean z10;
        String string;
        String string2;
        v3 v3Var = this.f23751p;
        ArrayList arrayList = v3Var.N;
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f47649c);
        Rect rect = this.f23750o;
        if (i10 == 1) {
            org.telegram.ui.Cells.z zVar = v3Var.f23891e0;
            if (zVar != null) {
                rect.set(zVar.getBounds());
            } else {
                rect.set(0, 0, 1, 1);
                cVar.p(false);
            }
            cVar.h(rect);
            cVar.j(LocaleController.getString(R.string.BotCloseAllTabs));
            return;
        }
        if (i10 >= 2000) {
            i11 = i10 - 2000;
            z10 = true;
        } else {
            if (i10 < 1000) {
                rect.set(0, 0, 1, 1);
                cVar.h(rect);
                cVar.p(false);
                return;
            }
            i11 = i10 - 1000;
            z10 = false;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.p(false);
            return;
        }
        u3 u3Var = (u3) arrayList.get(i11);
        l3 l3Var = u3Var.f23829c;
        RectF rectF = u3Var.f23827a;
        String strB = (l3Var == null || l3Var.b() == null) ? "" : u3Var.f23829c.b();
        if (!z10) {
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
        Rect bounds = u3Var.d.f23536k.getBounds();
        rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.bottom));
        cVar.h(rect);
        if (TextUtils.isEmpty(strB)) {
            string2 = LocaleController.getString(R.string.Close);
        } else {
            string2 = LocaleController.getString(R.string.Close) + ", " + strB;
        }
        cVar.j(string2);
    }
}
