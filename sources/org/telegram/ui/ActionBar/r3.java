package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r3 extends j1.b {
    public final Rect f23772o;
    public final v3 f23773p;

    public r3(v3 v3Var, v3 v3Var2) {
        super(v3Var2);
        this.f23773p = v3Var;
        this.f23772o = new Rect();
    }

    @Override
    public final int g(float f9, float f10) {
        v3 v3Var = this.f23773p;
        ArrayList arrayList = v3Var.N;
        if (v3Var.R >= 0.5f) {
            org.telegram.ui.Cells.z zVar = v3Var.f23881e0;
            if (zVar != null && zVar.getBounds().contains((int) f9, (int) f10)) {
                return 1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                u3 u3Var = (u3) arrayList.get(size);
                float f11 = u3Var.f23840i;
                RectF rectF = u3Var.f23834a;
                if (Math.abs(f11) < 0.4f && rectF.contains(f9, f10)) {
                    Rect bounds = u3Var.d.f23559k.getBounds();
                    if (!bounds.isEmpty() && bounds.contains((int) (f9 - rectF.left), (int) ((f10 - rectF.top) - AndroidUtilities.dp(24.0f)))) {
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
        v3 v3Var = this.f23773p;
        ArrayList arrayList2 = v3Var.N;
        if (v3Var.R >= 0.5f) {
            org.telegram.ui.Cells.z zVar = v3Var.f23881e0;
            if (zVar != null && !zVar.getBounds().isEmpty()) {
                arrayList.add(1);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                u3 u3Var = (u3) arrayList2.get(i10);
                if (Math.abs(u3Var.f23840i) < 0.4f && !u3Var.f23834a.isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 1000));
                    j3 j3Var = u3Var.d;
                    if (j3Var != null && !j3Var.f23559k.getBounds().isEmpty()) {
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
        v3 v3Var = this.f23773p;
        ArrayList arrayList = v3Var.N;
        if (i11 == 16) {
            if (i10 == 1) {
                m3 m3Var = v3Var.f23873a;
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
                    m3 m3Var2 = v3Var.f23873a;
                    if (m3Var2 != null) {
                        m3Var2.g(u3Var.f23836c, new ih.b1(20, this, u3Var));
                        return true;
                    }
                } else if (v3Var.f23873a != null) {
                    v3Var.a(false);
                    u3Var.getClass();
                    v3Var.f23873a.e(u3Var.f23836c);
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
        v3 v3Var = this.f23773p;
        ArrayList arrayList = v3Var.N;
        cVar.i("android.widget.Button");
        cVar.b(s0.b.f47475c);
        Rect rect = this.f23772o;
        if (i10 == 1) {
            org.telegram.ui.Cells.z zVar = v3Var.f23881e0;
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
            u3 u3Var = (u3) arrayList.get(i11);
            l3 l3Var = u3Var.f23836c;
            RectF rectF = u3Var.f23834a;
            if (l3Var != null && l3Var.b() != null) {
                str = u3Var.f23836c.b();
            } else {
                str = "";
            }
            if (z10) {
                Rect bounds = u3Var.d.f23559k.getBounds();
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
