package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lc1 extends org.telegram.ui.Components.lm0 {
    public final Context f41250c;
    public final ArrayList d;

    public lc1(Context context) {
        this.f41250c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2();
        k2Var.f24312a = LocaleController.getString(R.string.ThemePreviewDialog1);
        k2Var.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        k2Var.f24314c = 0;
        k2Var.d = 0;
        k2Var.e = true;
        k2Var.f24315f = false;
        k2Var.f24316g = 0;
        k2Var.h = currentTimeMillis;
        k2Var.f24317i = false;
        k2Var.f24318j = false;
        k2Var.f24319k = 2;
        arrayList.add(k2Var);
        org.telegram.ui.Cells.k2 k2Var2 = new org.telegram.ui.Cells.k2();
        k2Var2.f24312a = LocaleController.getString(R.string.ThemePreviewDialog2);
        k2Var2.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        k2Var2.f24314c = 1;
        k2Var2.d = 2;
        k2Var2.e = false;
        k2Var2.f24315f = false;
        k2Var2.f24316g = 0;
        k2Var2.h = currentTimeMillis - 3600;
        k2Var2.f24317i = false;
        k2Var2.f24318j = false;
        k2Var2.f24319k = -1;
        arrayList.add(k2Var2);
        org.telegram.ui.Cells.k2 k2Var3 = new org.telegram.ui.Cells.k2();
        k2Var3.f24312a = LocaleController.getString(R.string.ThemePreviewDialog3);
        k2Var3.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        k2Var3.f24314c = 2;
        k2Var3.d = 3;
        k2Var3.e = false;
        k2Var3.f24315f = true;
        k2Var3.f24316g = 0;
        k2Var3.h = currentTimeMillis - 7200;
        k2Var3.f24317i = false;
        k2Var3.f24318j = true;
        k2Var3.f24319k = -1;
        arrayList.add(k2Var3);
        org.telegram.ui.Cells.k2 k2Var4 = new org.telegram.ui.Cells.k2();
        k2Var4.f24312a = LocaleController.getString(R.string.ThemePreviewDialog4);
        k2Var4.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        k2Var4.f24314c = 3;
        k2Var4.d = 0;
        k2Var4.e = false;
        k2Var4.f24315f = false;
        k2Var4.f24316g = 2;
        k2Var4.h = currentTimeMillis - 10800;
        k2Var4.f24317i = false;
        k2Var4.f24318j = false;
        k2Var4.f24319k = -1;
        arrayList.add(k2Var4);
        org.telegram.ui.Cells.k2 k2Var5 = new org.telegram.ui.Cells.k2();
        k2Var5.f24312a = LocaleController.getString(R.string.ThemePreviewDialog5);
        k2Var5.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        k2Var5.f24314c = 4;
        k2Var5.d = 0;
        k2Var5.e = false;
        k2Var5.f24315f = false;
        k2Var5.f24316g = 1;
        k2Var5.h = currentTimeMillis - 14400;
        k2Var5.f24317i = false;
        k2Var5.f24318j = false;
        k2Var5.f24319k = 2;
        arrayList.add(k2Var5);
        org.telegram.ui.Cells.k2 k2Var6 = new org.telegram.ui.Cells.k2();
        k2Var6.f24312a = LocaleController.getString(R.string.ThemePreviewDialog6);
        k2Var6.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        k2Var6.f24314c = 5;
        k2Var6.d = 0;
        k2Var6.e = false;
        k2Var6.f24315f = false;
        k2Var6.f24316g = 0;
        k2Var6.h = currentTimeMillis - 18000;
        k2Var6.f24317i = false;
        k2Var6.f24318j = false;
        k2Var6.f24319k = -1;
        arrayList.add(k2Var6);
        org.telegram.ui.Cells.k2 k2Var7 = new org.telegram.ui.Cells.k2();
        k2Var7.f24312a = LocaleController.getString(R.string.ThemePreviewDialog7);
        k2Var7.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        k2Var7.f24314c = 6;
        k2Var7.d = 0;
        k2Var7.e = false;
        k2Var7.f24315f = false;
        k2Var7.f24316g = 0;
        k2Var7.h = currentTimeMillis - 21600;
        k2Var7.f24317i = true;
        k2Var7.f24318j = false;
        k2Var7.f24319k = -1;
        arrayList.add(k2Var7);
        org.telegram.ui.Cells.k2 k2Var8 = new org.telegram.ui.Cells.k2();
        k2Var8.f24312a = LocaleController.getString(R.string.ThemePreviewDialog8);
        k2Var8.f24313b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        k2Var8.f24314c = 0;
        k2Var8.d = 0;
        k2Var8.e = false;
        k2Var8.f24315f = false;
        k2Var8.f24316g = 0;
        k2Var8.h = currentTimeMillis - 25200;
        k2Var8.f24317i = true;
        k2Var8.f24318j = false;
        k2Var8.f24319k = -1;
        arrayList.add(k2Var8);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47741f != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        if (e1Var.f47741f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) e1Var.f47738a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            p2Var.f24721s2 = z10;
            p2Var.setDialog((org.telegram.ui.Cells.k2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View w4Var;
        Context context = this.f41250c;
        if (i10 == 0) {
            w4Var = new org.telegram.ui.Cells.p2(context, false);
        } else {
            w4Var = new org.telegram.ui.Cells.w4(context);
        }
        w4Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(w4Var);
    }
}
