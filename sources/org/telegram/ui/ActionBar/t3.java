package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t3 extends j1.b {
    public final Rect f22291o;
    public final x3 f22292p;

    public t3(x3 x3Var, x3 x3Var2) {
        super(x3Var2);
        this.f22292p = x3Var;
        this.f22291o = new Rect();
    }

    @Override
    public final int g(float f10, float f11) {
        x3 x3Var = this.f22292p;
        ArrayList arrayList = x3Var.O;
        if (x3Var.S >= 0.5f) {
            org.telegram.ui.Cells.z zVar = x3Var.f22417f0;
            if (zVar != null && zVar.getBounds().contains((int) f10, (int) f11)) {
                return 1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                w3 w3Var = (w3) arrayList.get(size);
                float f12 = w3Var.f22382i;
                RectF rectF = w3Var.f22376a;
                if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                    Rect bounds = w3Var.d.f22075k.getBounds();
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
        x3 x3Var = this.f22292p;
        ArrayList arrayList2 = x3Var.O;
        if (x3Var.S >= 0.5f) {
            org.telegram.ui.Cells.z zVar = x3Var.f22417f0;
            if (zVar != null && !zVar.getBounds().isEmpty()) {
                arrayList.add(1);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                w3 w3Var = (w3) arrayList2.get(i10);
                if (Math.abs(w3Var.f22382i) < 0.4f && !w3Var.f22376a.isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 1000));
                    l3 l3Var = w3Var.d;
                    if (l3Var != null && !l3Var.f22075k.getBounds().isEmpty()) {
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
        x3 x3Var = this.f22292p;
        ArrayList arrayList = x3Var.O;
        if (i11 == 16) {
            if (i10 == 1) {
                o3 o3Var = x3Var.f22407a;
                if (o3Var != null) {
                    o3Var.f();
                }
                x3Var.a(false);
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
                w3 w3Var = (w3) arrayList.get(i12);
                if (z4) {
                    o3 o3Var2 = x3Var.f22407a;
                    if (o3Var2 != null) {
                        o3Var2.g(w3Var.f22378c, new lh.a1(12, this, w3Var));
                        return true;
                    }
                } else if (x3Var.f22407a != null) {
                    x3Var.a(false);
                    w3Var.getClass();
                    x3Var.f22407a.e(w3Var.f22378c);
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
        x3 x3Var = this.f22292p;
        ArrayList arrayList = x3Var.O;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.f46874c);
        Rect rect = this.f22291o;
        if (i10 == 1) {
            org.telegram.ui.Cells.z zVar = x3Var.f22417f0;
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
            w3 w3Var = (w3) arrayList.get(i11);
            n3 n3Var = w3Var.f22378c;
            RectF rectF = w3Var.f22376a;
            if (n3Var != null && n3Var.b() != null) {
                str = w3Var.f22378c.b();
            } else {
                str = "";
            }
            if (z4) {
                Rect bounds = w3Var.d.f22075k.getBounds();
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
