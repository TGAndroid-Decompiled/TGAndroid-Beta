package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ic1 extends org.telegram.ui.Components.il0 {
    public final Context f39206c;
    public final ArrayList d;

    public ic1(Context context) {
        this.f39206c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2();
        k2Var.f24582a = LocaleController.getString(R.string.ThemePreviewDialog1);
        k2Var.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        k2Var.f24584c = 0;
        k2Var.d = 0;
        k2Var.f24585e = true;
        k2Var.f24586f = false;
        k2Var.f24587g = 0;
        k2Var.h = currentTimeMillis;
        k2Var.f24588i = false;
        k2Var.f24589j = false;
        k2Var.f24590k = 2;
        arrayList.add(k2Var);
        org.telegram.ui.Cells.k2 k2Var2 = new org.telegram.ui.Cells.k2();
        k2Var2.f24582a = LocaleController.getString(R.string.ThemePreviewDialog2);
        k2Var2.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        k2Var2.f24584c = 1;
        k2Var2.d = 2;
        k2Var2.f24585e = false;
        k2Var2.f24586f = false;
        k2Var2.f24587g = 0;
        k2Var2.h = currentTimeMillis - 3600;
        k2Var2.f24588i = false;
        k2Var2.f24589j = false;
        k2Var2.f24590k = -1;
        arrayList.add(k2Var2);
        org.telegram.ui.Cells.k2 k2Var3 = new org.telegram.ui.Cells.k2();
        k2Var3.f24582a = LocaleController.getString(R.string.ThemePreviewDialog3);
        k2Var3.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        k2Var3.f24584c = 2;
        k2Var3.d = 3;
        k2Var3.f24585e = false;
        k2Var3.f24586f = true;
        k2Var3.f24587g = 0;
        k2Var3.h = currentTimeMillis - 7200;
        k2Var3.f24588i = false;
        k2Var3.f24589j = true;
        k2Var3.f24590k = -1;
        arrayList.add(k2Var3);
        org.telegram.ui.Cells.k2 k2Var4 = new org.telegram.ui.Cells.k2();
        k2Var4.f24582a = LocaleController.getString(R.string.ThemePreviewDialog4);
        k2Var4.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        k2Var4.f24584c = 3;
        k2Var4.d = 0;
        k2Var4.f24585e = false;
        k2Var4.f24586f = false;
        k2Var4.f24587g = 2;
        k2Var4.h = currentTimeMillis - 10800;
        k2Var4.f24588i = false;
        k2Var4.f24589j = false;
        k2Var4.f24590k = -1;
        arrayList.add(k2Var4);
        org.telegram.ui.Cells.k2 k2Var5 = new org.telegram.ui.Cells.k2();
        k2Var5.f24582a = LocaleController.getString(R.string.ThemePreviewDialog5);
        k2Var5.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        k2Var5.f24584c = 4;
        k2Var5.d = 0;
        k2Var5.f24585e = false;
        k2Var5.f24586f = false;
        k2Var5.f24587g = 1;
        k2Var5.h = currentTimeMillis - 14400;
        k2Var5.f24588i = false;
        k2Var5.f24589j = false;
        k2Var5.f24590k = 2;
        arrayList.add(k2Var5);
        org.telegram.ui.Cells.k2 k2Var6 = new org.telegram.ui.Cells.k2();
        k2Var6.f24582a = LocaleController.getString(R.string.ThemePreviewDialog6);
        k2Var6.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        k2Var6.f24584c = 5;
        k2Var6.d = 0;
        k2Var6.f24585e = false;
        k2Var6.f24586f = false;
        k2Var6.f24587g = 0;
        k2Var6.h = currentTimeMillis - 18000;
        k2Var6.f24588i = false;
        k2Var6.f24589j = false;
        k2Var6.f24590k = -1;
        arrayList.add(k2Var6);
        org.telegram.ui.Cells.k2 k2Var7 = new org.telegram.ui.Cells.k2();
        k2Var7.f24582a = LocaleController.getString(R.string.ThemePreviewDialog7);
        k2Var7.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        k2Var7.f24584c = 6;
        k2Var7.d = 0;
        k2Var7.f24585e = false;
        k2Var7.f24586f = false;
        k2Var7.f24587g = 0;
        k2Var7.h = currentTimeMillis - 21600;
        k2Var7.f24588i = true;
        k2Var7.f24589j = false;
        k2Var7.f24590k = -1;
        arrayList.add(k2Var7);
        org.telegram.ui.Cells.k2 k2Var8 = new org.telegram.ui.Cells.k2();
        k2Var8.f24582a = LocaleController.getString(R.string.ThemePreviewDialog8);
        k2Var8.f24583b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        k2Var8.f24584c = 0;
        k2Var8.d = 0;
        k2Var8.f24585e = false;
        k2Var8.f24586f = false;
        k2Var8.f24587g = 0;
        k2Var8.h = currentTimeMillis - 25200;
        k2Var8.f24588i = true;
        k2Var8.f24589j = false;
        k2Var8.f24590k = -1;
        arrayList.add(k2Var8);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f != 1) {
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
    public final void v(f2.n1 n1Var, int i10) {
        if (n1Var.f6436f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) n1Var.f6432a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            p2Var.f24898o2 = z10;
            p2Var.setDialog((org.telegram.ui.Cells.k2) arrayList.get(i10));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View q4Var;
        Context context = this.f39206c;
        if (i10 == 0) {
            q4Var = new org.telegram.ui.Cells.p2(context, false);
        } else {
            q4Var = new org.telegram.ui.Cells.q4(context);
        }
        q4Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(q4Var);
    }
}
