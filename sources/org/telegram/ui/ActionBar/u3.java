package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u3 extends j1.b {
    public final Rect f19579o;
    public final y3 f19580p;

    public u3(y3 y3Var, y3 y3Var2) {
        super(y3Var2);
        this.f19580p = y3Var;
        this.f19579o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        y3 y3Var = this.f19580p;
        ArrayList arrayList = y3Var.R;
        if (y3Var.V >= 0.5f) {
            org.telegram.ui.Cells.z zVar = y3Var.f19716i0;
            if (zVar != null && zVar.getBounds().contains((int) f7, (int) f10)) {
                return 1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                x3 x3Var = (x3) arrayList.get(size);
                float f11 = x3Var.f19681i;
                RectF rectF = x3Var.f19676a;
                if (Math.abs(f11) < 0.4f && rectF.contains(f7, f10)) {
                    Rect bounds = x3Var.d.f19407k.getBounds();
                    if (!bounds.isEmpty() && bounds.contains((int) (f7 - rectF.left), (int) ((f10 - rectF.top) - AndroidUtilities.dp(24.0f)))) {
                        return size + 2000;
                    }
                    return size + 1000;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        y3 y3Var = this.f19580p;
        ArrayList arrayList2 = y3Var.R;
        if (y3Var.V >= 0.5f) {
            org.telegram.ui.Cells.z zVar = y3Var.f19716i0;
            if (zVar != null && !zVar.getBounds().isEmpty()) {
                arrayList.add(1);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                x3 x3Var = (x3) arrayList2.get(i10);
                if (Math.abs(x3Var.f19681i) < 0.4f && !x3Var.f19676a.isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 1000));
                    m3 m3Var = x3Var.d;
                    if (m3Var != null && !m3Var.f19407k.getBounds().isEmpty()) {
                        arrayList.add(Integer.valueOf(i10 + 2000));
                    }
                }
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z10;
        y3 y3Var = this.f19580p;
        ArrayList arrayList = y3Var.R;
        if (i11 == 16) {
            if (i10 == 1) {
                p3 p3Var = y3Var.f19704a;
                if (p3Var != null) {
                    p3Var.f();
                }
                y3Var.a(false);
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
                x3 x3Var = (x3) arrayList.get(i12);
                if (z10) {
                    p3 p3Var2 = y3Var.f19704a;
                    if (p3Var2 != null) {
                        p3Var2.g(x3Var.f19678c, new ci.m2(25, this, x3Var));
                        return true;
                    }
                } else if (y3Var.f19704a != null) {
                    y3Var.a(false);
                    x3Var.getClass();
                    y3Var.f19704a.e(x3Var.f19678c);
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
        String str;
        String str2;
        String str3;
        y3 y3Var = this.f19580p;
        ArrayList arrayList = y3Var.R;
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f42640c);
        Rect rect = this.f19579o;
        if (i10 == 1) {
            org.telegram.ui.Cells.z zVar = y3Var.f19716i0;
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
        } else if (i10 >= 1000) {
            i11 = i10 - 1000;
            z10 = false;
        } else {
            rect.set(0, 0, 1, 1);
            cVar.h(rect);
            cVar.p(false);
            return;
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            x3 x3Var = (x3) arrayList.get(i11);
            o3 o3Var = x3Var.f19678c;
            RectF rectF = x3Var.f19676a;
            if (o3Var != null && o3Var.b() != null) {
                str = x3Var.f19678c.b();
            } else {
                str = "";
            }
            if (z10) {
                Rect bounds = x3Var.d.f19407k.getBounds();
                rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.bottom));
                cVar.h(rect);
                if (TextUtils.isEmpty(str)) {
                    str3 = LocaleController.getString(R.string.Close);
                } else {
                    str3 = LocaleController.getString(R.string.Close) + ", " + str;
                }
                cVar.j(str3);
                return;
            }
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(rect);
            if (TextUtils.isEmpty(str)) {
                str2 = LocaleController.getString(R.string.Open);
            } else {
                str2 = LocaleController.getString(R.string.Open) + ", " + str;
            }
            cVar.j(str2);
            return;
        }
        rect.set(0, 0, 1, 1);
        cVar.h(rect);
        cVar.p(false);
    }
}
