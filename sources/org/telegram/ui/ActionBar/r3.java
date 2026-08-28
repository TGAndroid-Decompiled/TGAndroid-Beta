package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r3 extends j1.b {
    public final Rect f23749o;
    public final v3 f23750p;

    public r3(v3 v3Var, v3 v3Var2) {
        super(v3Var2);
        this.f23750p = v3Var;
        this.f23749o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        v3 v3Var = this.f23750p;
        ArrayList arrayList = v3Var.N;
        if (v3Var.R >= 0.5f) {
            org.telegram.ui.Cells.z zVar = v3Var.f23861e0;
            if (zVar != null && zVar.getBounds().contains((int) f10, (int) f11)) {
                return 1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                u3 u3Var = (u3) arrayList.get(size);
                float f12 = u3Var.f23822i;
                RectF rectF = u3Var.f23816a;
                if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                    Rect bounds = u3Var.d.f23535k.getBounds();
                    if (!bounds.isEmpty() && bounds.contains((int) (f10 - rectF.left), (int) ((f11 - rectF.top) - AndroidUtilities.dp(24.0f)))) {
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
        v3 v3Var = this.f23750p;
        ArrayList arrayList2 = v3Var.N;
        if (v3Var.R >= 0.5f) {
            org.telegram.ui.Cells.z zVar = v3Var.f23861e0;
            if (zVar != null && !zVar.getBounds().isEmpty()) {
                arrayList.add(1);
            }
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                u3 u3Var = (u3) arrayList2.get(i9);
                if (Math.abs(u3Var.f23822i) < 0.4f && !u3Var.f23816a.isEmpty()) {
                    arrayList.add(Integer.valueOf(i9 + 1000));
                    j3 j3Var = u3Var.d;
                    if (j3Var != null && !j3Var.f23535k.getBounds().isEmpty()) {
                        arrayList.add(Integer.valueOf(i9 + 2000));
                    }
                }
            }
        }
    }

    @Override
    public final boolean k(int i9, int i10) {
        int i11;
        boolean z10;
        v3 v3Var = this.f23750p;
        ArrayList arrayList = v3Var.N;
        if (i10 == 16) {
            if (i9 == 1) {
                m3 m3Var = v3Var.f23853a;
                if (m3Var != null) {
                    m3Var.f();
                }
                v3Var.a(false);
                return true;
            }
            if (i9 >= 2000) {
                i11 = i9 - 2000;
                z10 = true;
            } else if (i9 >= 1000) {
                i11 = i9 - 1000;
                z10 = false;
            }
            if (i11 >= 0 && i11 < arrayList.size()) {
                u3 u3Var = (u3) arrayList.get(i11);
                if (z10) {
                    m3 m3Var2 = v3Var.f23853a;
                    if (m3Var2 != null) {
                        m3Var2.g(u3Var.f23818c, new fh.f1(27, this, u3Var));
                        return true;
                    }
                } else if (v3Var.f23853a != null) {
                    v3Var.a(false);
                    u3Var.getClass();
                    v3Var.f23853a.e(u3Var.f23818c);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i9, s0.d dVar) {
        int i10;
        boolean z10;
        String str;
        String str2;
        String str3;
        v3 v3Var = this.f23750p;
        ArrayList arrayList = v3Var.N;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f47285c);
        Rect rect = this.f23749o;
        if (i9 == 1) {
            org.telegram.ui.Cells.z zVar = v3Var.f23861e0;
            if (zVar != null) {
                rect.set(zVar.getBounds());
            } else {
                rect.set(0, 0, 1, 1);
                dVar.p(false);
            }
            dVar.h(rect);
            dVar.j(LocaleController.getString(R.string.BotCloseAllTabs));
            return;
        }
        if (i9 >= 2000) {
            i10 = i9 - 2000;
            z10 = true;
        } else if (i9 >= 1000) {
            i10 = i9 - 1000;
            z10 = false;
        } else {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            return;
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            u3 u3Var = (u3) arrayList.get(i10);
            l3 l3Var = u3Var.f23818c;
            RectF rectF = u3Var.f23816a;
            if (l3Var != null && l3Var.b() != null) {
                str = u3Var.f23818c.b();
            } else {
                str = "";
            }
            if (z10) {
                Rect bounds = u3Var.d.f23535k.getBounds();
                rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + AndroidUtilities.dp(24.0f) + bounds.bottom));
                dVar.h(rect);
                if (TextUtils.isEmpty(str)) {
                    str3 = LocaleController.getString(R.string.Close);
                } else {
                    str3 = LocaleController.getString(R.string.Close) + ", " + str;
                }
                dVar.j(str3);
                return;
            }
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(rect);
            if (TextUtils.isEmpty(str)) {
                str2 = LocaleController.getString(R.string.Open);
            } else {
                str2 = LocaleController.getString(R.string.Open) + ", " + str;
            }
            dVar.j(str2);
            return;
        }
        rect.set(0, 0, 1, 1);
        dVar.h(rect);
        dVar.p(false);
    }
}
