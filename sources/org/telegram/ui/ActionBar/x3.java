package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x3 extends j1.b {
    public final Rect f23244o;
    public final b4 f23245p;

    public x3(b4 b4Var, b4 b4Var2) {
        super(b4Var2);
        this.f23245p = b4Var;
        this.f23244o = new Rect();
    }

    @Override
    public final int g(float f7, float f10) {
        b4 b4Var = this.f23245p;
        ArrayList arrayList = b4Var.R;
        if (b4Var.V >= 0.5f) {
            org.telegram.ui.Cells.y yVar = b4Var.f22443i0;
            if (yVar != null && yVar.getBounds().contains((int) f7, (int) f10)) {
                return 1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a4 a4Var = (a4) arrayList.get(size);
                float f11 = a4Var.f22388i;
                RectF rectF = a4Var.f22383a;
                if (Math.abs(f11) < 0.4f && rectF.contains(f7, f10)) {
                    Rect bounds = a4Var.d.f22940l.getBounds();
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
        b4 b4Var = this.f23245p;
        ArrayList arrayList2 = b4Var.R;
        if (b4Var.V >= 0.5f) {
            org.telegram.ui.Cells.y yVar = b4Var.f22443i0;
            if (yVar != null && !yVar.getBounds().isEmpty()) {
                arrayList.add(1);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                a4 a4Var = (a4) arrayList2.get(i10);
                if (Math.abs(a4Var.f22388i) < 0.4f && !a4Var.f22383a.isEmpty()) {
                    arrayList.add(Integer.valueOf(i10 + 1000));
                    p3 p3Var = a4Var.d;
                    if (p3Var != null && !p3Var.f22940l.getBounds().isEmpty()) {
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
        b4 b4Var = this.f23245p;
        ArrayList arrayList = b4Var.R;
        if (i11 == 16) {
            if (i10 == 1) {
                s3 s3Var = b4Var.f22431a;
                if (s3Var != null) {
                    s3Var.f();
                }
                b4Var.a(false);
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
                a4 a4Var = (a4) arrayList.get(i12);
                if (z10) {
                    s3 s3Var2 = b4Var.f22431a;
                    if (s3Var2 != null) {
                        s3Var2.g(a4Var.f22385c, new li.s2(4, this, a4Var));
                        return true;
                    }
                } else if (b4Var.f22431a != null) {
                    b4Var.a(false);
                    a4Var.getClass();
                    b4Var.f22431a.e(a4Var.f22385c);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        int i11;
        boolean z10;
        String str;
        String str2;
        String str3;
        b4 b4Var = this.f23245p;
        ArrayList arrayList = b4Var.R;
        dVar.i("android.widget.Button");
        dVar.b(s0.c.e);
        Rect rect = this.f23244o;
        if (i10 == 1) {
            org.telegram.ui.Cells.y yVar = b4Var.f22443i0;
            if (yVar != null) {
                rect.set(yVar.getBounds());
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
            z10 = true;
        } else if (i10 >= 1000) {
            i11 = i10 - 1000;
            z10 = false;
        } else {
            rect.set(0, 0, 1, 1);
            dVar.h(rect);
            dVar.p(false);
            return;
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            a4 a4Var = (a4) arrayList.get(i11);
            r3 r3Var = a4Var.f22385c;
            RectF rectF = a4Var.f22383a;
            if (r3Var != null && r3Var.b() != null) {
                str = a4Var.f22385c.b();
            } else {
                str = "";
            }
            if (z10) {
                Rect bounds = a4Var.d.f22940l.getBounds();
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
