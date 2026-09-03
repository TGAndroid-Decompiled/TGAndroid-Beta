package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s3 extends j1.b {
    public final Rect f20549o;
    public final w3 f20550p;

    public s3(w3 w3Var, w3 w3Var2) {
        super(w3Var2);
        this.f20550p = w3Var;
        this.f20549o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        w3 w3Var = this.f20550p;
        ArrayList arrayList = w3Var.O;
        if (w3Var.S >= 0.5f) {
            org.telegram.ui.Cells.z zVar = w3Var.f20663f0;
            if (zVar != null && zVar.getBounds().contains((int) f10, (int) f11)) {
                return 1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                v3 v3Var = (v3) arrayList.get(size);
                float f12 = v3Var.f20596i;
                RectF rectF = v3Var.f20591a;
                if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                    Rect bounds = v3Var.d.f20342k.getBounds();
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
        w3 w3Var = this.f20550p;
        ArrayList arrayList2 = w3Var.O;
        if (w3Var.S >= 0.5f) {
            org.telegram.ui.Cells.z zVar = w3Var.f20663f0;
            if (zVar != null && !zVar.getBounds().isEmpty()) {
                arrayList.add(1);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                v3 v3Var = (v3) arrayList2.get(i10);
                if (Math.abs(v3Var.f20596i) < 0.4f && !v3Var.f20591a.isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 1000));
                    k3 k3Var = v3Var.d;
                    if (k3Var != null && !k3Var.f20342k.getBounds().isEmpty()) {
                        arrayList.add(Integer.valueOf(i10 + 2000));
                    }
                }
            }
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z4;
        w3 w3Var = this.f20550p;
        ArrayList arrayList = w3Var.O;
        if (i11 == 16) {
            if (i10 == 1) {
                n3 n3Var = w3Var.f20654a;
                if (n3Var != null) {
                    n3Var.f();
                }
                w3Var.a(false);
                return true;
            }
            if (i10 >= 2000) {
                i12 = i10 - 2000;
                z4 = true;
            } else if (i10 >= 1000) {
                i12 = i10 - 1000;
                z4 = false;
            }
            if (i12 >= 0 && i12 < arrayList.size()) {
                v3 v3Var = (v3) arrayList.get(i12);
                if (z4) {
                    n3 n3Var2 = w3Var.f20654a;
                    if (n3Var2 != null) {
                        n3Var2.g(v3Var.f20593c, new kh.a1(12, this, v3Var));
                        return true;
                    }
                } else if (w3Var.f20654a != null) {
                    w3Var.a(false);
                    v3Var.getClass();
                    w3Var.f20654a.e(v3Var.f20593c);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        int i11;
        boolean z4;
        String str;
        String str2;
        String str3;
        w3 w3Var = this.f20550p;
        ArrayList arrayList = w3Var.O;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f43963c);
        Rect rect = this.f20549o;
        if (i10 == 1) {
            org.telegram.ui.Cells.z zVar = w3Var.f20663f0;
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
        if (i10 >= 2000) {
            i11 = i10 - 2000;
            z4 = true;
        } else if (i10 >= 1000) {
            i11 = i10 - 1000;
            z4 = false;
        } else {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            return;
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            v3 v3Var = (v3) arrayList.get(i11);
            m3 m3Var = v3Var.f20593c;
            RectF rectF = v3Var.f20591a;
            if (m3Var != null && m3Var.b() != null) {
                str = v3Var.f20593c.b();
            } else {
                str = "";
            }
            if (z4) {
                Rect bounds = v3Var.d.f20342k.getBounds();
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
