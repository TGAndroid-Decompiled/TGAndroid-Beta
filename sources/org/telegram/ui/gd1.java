package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gd1 extends org.telegram.ui.Components.wl0 {
    public final Context f33905c;
    public final ArrayList d;

    public gd1(Context context) {
        this.f33905c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2();
        n2Var.f20677a = LocaleController.getString(R.string.ThemePreviewDialog1);
        n2Var.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        n2Var.f20679c = 0;
        n2Var.d = 0;
        n2Var.e = true;
        n2Var.f20680f = false;
        n2Var.f20681g = 0;
        n2Var.h = currentTimeMillis;
        n2Var.f20682i = false;
        n2Var.f20683j = false;
        n2Var.f20684k = 2;
        arrayList.add(n2Var);
        org.telegram.ui.Cells.n2 n2Var2 = new org.telegram.ui.Cells.n2();
        n2Var2.f20677a = LocaleController.getString(R.string.ThemePreviewDialog2);
        n2Var2.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        n2Var2.f20679c = 1;
        n2Var2.d = 2;
        n2Var2.e = false;
        n2Var2.f20680f = false;
        n2Var2.f20681g = 0;
        n2Var2.h = currentTimeMillis - 3600;
        n2Var2.f20682i = false;
        n2Var2.f20683j = false;
        n2Var2.f20684k = -1;
        arrayList.add(n2Var2);
        org.telegram.ui.Cells.n2 n2Var3 = new org.telegram.ui.Cells.n2();
        n2Var3.f20677a = LocaleController.getString(R.string.ThemePreviewDialog3);
        n2Var3.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        n2Var3.f20679c = 2;
        n2Var3.d = 3;
        n2Var3.e = false;
        n2Var3.f20680f = true;
        n2Var3.f20681g = 0;
        n2Var3.h = currentTimeMillis - 7200;
        n2Var3.f20682i = false;
        n2Var3.f20683j = true;
        n2Var3.f20684k = -1;
        arrayList.add(n2Var3);
        org.telegram.ui.Cells.n2 n2Var4 = new org.telegram.ui.Cells.n2();
        n2Var4.f20677a = LocaleController.getString(R.string.ThemePreviewDialog4);
        n2Var4.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        n2Var4.f20679c = 3;
        n2Var4.d = 0;
        n2Var4.e = false;
        n2Var4.f20680f = false;
        n2Var4.f20681g = 2;
        n2Var4.h = currentTimeMillis - 10800;
        n2Var4.f20682i = false;
        n2Var4.f20683j = false;
        n2Var4.f20684k = -1;
        arrayList.add(n2Var4);
        org.telegram.ui.Cells.n2 n2Var5 = new org.telegram.ui.Cells.n2();
        n2Var5.f20677a = LocaleController.getString(R.string.ThemePreviewDialog5);
        n2Var5.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        n2Var5.f20679c = 4;
        n2Var5.d = 0;
        n2Var5.e = false;
        n2Var5.f20680f = false;
        n2Var5.f20681g = 1;
        n2Var5.h = currentTimeMillis - 14400;
        n2Var5.f20682i = false;
        n2Var5.f20683j = false;
        n2Var5.f20684k = 2;
        arrayList.add(n2Var5);
        org.telegram.ui.Cells.n2 n2Var6 = new org.telegram.ui.Cells.n2();
        n2Var6.f20677a = LocaleController.getString(R.string.ThemePreviewDialog6);
        n2Var6.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        n2Var6.f20679c = 5;
        n2Var6.d = 0;
        n2Var6.e = false;
        n2Var6.f20680f = false;
        n2Var6.f20681g = 0;
        n2Var6.h = currentTimeMillis - 18000;
        n2Var6.f20682i = false;
        n2Var6.f20683j = false;
        n2Var6.f20684k = -1;
        arrayList.add(n2Var6);
        org.telegram.ui.Cells.n2 n2Var7 = new org.telegram.ui.Cells.n2();
        n2Var7.f20677a = LocaleController.getString(R.string.ThemePreviewDialog7);
        n2Var7.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        n2Var7.f20679c = 6;
        n2Var7.d = 0;
        n2Var7.e = false;
        n2Var7.f20680f = false;
        n2Var7.f20681g = 0;
        n2Var7.h = currentTimeMillis - 21600;
        n2Var7.f20682i = true;
        n2Var7.f20683j = false;
        n2Var7.f20684k = -1;
        arrayList.add(n2Var7);
        org.telegram.ui.Cells.n2 n2Var8 = new org.telegram.ui.Cells.n2();
        n2Var8.f20677a = LocaleController.getString(R.string.ThemePreviewDialog8);
        n2Var8.f20678b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        n2Var8.f20679c = 0;
        n2Var8.d = 0;
        n2Var8.e = false;
        n2Var8.f20680f = false;
        n2Var8.f20681g = 0;
        n2Var8.h = currentTimeMillis - 25200;
        n2Var8.f20682i = true;
        n2Var8.f20683j = false;
        n2Var8.f20684k = -1;
        arrayList.add(n2Var8);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f != 1) {
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
        if (c1Var.f42962f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f42959a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            s2Var.f21012s2 = z10;
            s2Var.setDialog((org.telegram.ui.Cells.n2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View s4Var;
        Context context = this.f33905c;
        if (i10 == 0) {
            s4Var = new org.telegram.ui.Cells.s2(context, false);
        } else {
            s4Var = new org.telegram.ui.Cells.s4(context);
        }
        s4Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(s4Var);
    }
}
