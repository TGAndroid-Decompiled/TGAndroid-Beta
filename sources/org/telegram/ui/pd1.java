package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pd1 extends org.telegram.ui.Components.xl0 {
    public final Context f36572c;
    public final ArrayList d;

    public pd1(Context context) {
        this.f36572c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2();
        n2Var.f20694a = LocaleController.getString(R.string.ThemePreviewDialog1);
        n2Var.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        n2Var.f20696c = 0;
        n2Var.d = 0;
        n2Var.e = true;
        n2Var.f20697f = false;
        n2Var.f20698g = 0;
        n2Var.h = currentTimeMillis;
        n2Var.f20699i = false;
        n2Var.f20700j = false;
        n2Var.f20701k = 2;
        arrayList.add(n2Var);
        org.telegram.ui.Cells.n2 n2Var2 = new org.telegram.ui.Cells.n2();
        n2Var2.f20694a = LocaleController.getString(R.string.ThemePreviewDialog2);
        n2Var2.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        n2Var2.f20696c = 1;
        n2Var2.d = 2;
        n2Var2.e = false;
        n2Var2.f20697f = false;
        n2Var2.f20698g = 0;
        n2Var2.h = currentTimeMillis - 3600;
        n2Var2.f20699i = false;
        n2Var2.f20700j = false;
        n2Var2.f20701k = -1;
        arrayList.add(n2Var2);
        org.telegram.ui.Cells.n2 n2Var3 = new org.telegram.ui.Cells.n2();
        n2Var3.f20694a = LocaleController.getString(R.string.ThemePreviewDialog3);
        n2Var3.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        n2Var3.f20696c = 2;
        n2Var3.d = 3;
        n2Var3.e = false;
        n2Var3.f20697f = true;
        n2Var3.f20698g = 0;
        n2Var3.h = currentTimeMillis - 7200;
        n2Var3.f20699i = false;
        n2Var3.f20700j = true;
        n2Var3.f20701k = -1;
        arrayList.add(n2Var3);
        org.telegram.ui.Cells.n2 n2Var4 = new org.telegram.ui.Cells.n2();
        n2Var4.f20694a = LocaleController.getString(R.string.ThemePreviewDialog4);
        n2Var4.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        n2Var4.f20696c = 3;
        n2Var4.d = 0;
        n2Var4.e = false;
        n2Var4.f20697f = false;
        n2Var4.f20698g = 2;
        n2Var4.h = currentTimeMillis - 10800;
        n2Var4.f20699i = false;
        n2Var4.f20700j = false;
        n2Var4.f20701k = -1;
        arrayList.add(n2Var4);
        org.telegram.ui.Cells.n2 n2Var5 = new org.telegram.ui.Cells.n2();
        n2Var5.f20694a = LocaleController.getString(R.string.ThemePreviewDialog5);
        n2Var5.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        n2Var5.f20696c = 4;
        n2Var5.d = 0;
        n2Var5.e = false;
        n2Var5.f20697f = false;
        n2Var5.f20698g = 1;
        n2Var5.h = currentTimeMillis - 14400;
        n2Var5.f20699i = false;
        n2Var5.f20700j = false;
        n2Var5.f20701k = 2;
        arrayList.add(n2Var5);
        org.telegram.ui.Cells.n2 n2Var6 = new org.telegram.ui.Cells.n2();
        n2Var6.f20694a = LocaleController.getString(R.string.ThemePreviewDialog6);
        n2Var6.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        n2Var6.f20696c = 5;
        n2Var6.d = 0;
        n2Var6.e = false;
        n2Var6.f20697f = false;
        n2Var6.f20698g = 0;
        n2Var6.h = currentTimeMillis - 18000;
        n2Var6.f20699i = false;
        n2Var6.f20700j = false;
        n2Var6.f20701k = -1;
        arrayList.add(n2Var6);
        org.telegram.ui.Cells.n2 n2Var7 = new org.telegram.ui.Cells.n2();
        n2Var7.f20694a = LocaleController.getString(R.string.ThemePreviewDialog7);
        n2Var7.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        n2Var7.f20696c = 6;
        n2Var7.d = 0;
        n2Var7.e = false;
        n2Var7.f20697f = false;
        n2Var7.f20698g = 0;
        n2Var7.h = currentTimeMillis - 21600;
        n2Var7.f20699i = true;
        n2Var7.f20700j = false;
        n2Var7.f20701k = -1;
        arrayList.add(n2Var7);
        org.telegram.ui.Cells.n2 n2Var8 = new org.telegram.ui.Cells.n2();
        n2Var8.f20694a = LocaleController.getString(R.string.ThemePreviewDialog8);
        n2Var8.f20695b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        n2Var8.f20696c = 0;
        n2Var8.d = 0;
        n2Var8.e = false;
        n2Var8.f20697f = false;
        n2Var8.f20698g = 0;
        n2Var8.h = currentTimeMillis - 25200;
        n2Var8.f20699i = true;
        n2Var8.f20700j = false;
        n2Var8.f20701k = -1;
        arrayList.add(n2Var8);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42998f != 1) {
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
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f42998f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f42995a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            s2Var.f21030s2 = z10;
            s2Var.setDialog((org.telegram.ui.Cells.n2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View t4Var;
        Context context = this.f36572c;
        if (i10 == 0) {
            t4Var = new org.telegram.ui.Cells.s2(context, false);
        } else {
            t4Var = new org.telegram.ui.Cells.t4(context);
        }
        t4Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(t4Var);
    }
}
