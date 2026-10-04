package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jd1 extends org.telegram.ui.Components.yl0 {
    public final Context f37656c;
    public final ArrayList d;

    public jd1(Context context) {
        this.f37656c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2();
        n2Var.f22508a = LocaleController.getString(R.string.ThemePreviewDialog1);
        n2Var.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        n2Var.f22510c = 0;
        n2Var.d = 0;
        n2Var.f22511e = true;
        n2Var.f22512f = false;
        n2Var.f22513g = 0;
        n2Var.h = currentTimeMillis;
        n2Var.f22514i = false;
        n2Var.f22515j = false;
        n2Var.f22516k = 2;
        arrayList.add(n2Var);
        org.telegram.ui.Cells.n2 n2Var2 = new org.telegram.ui.Cells.n2();
        n2Var2.f22508a = LocaleController.getString(R.string.ThemePreviewDialog2);
        n2Var2.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        n2Var2.f22510c = 1;
        n2Var2.d = 2;
        n2Var2.f22511e = false;
        n2Var2.f22512f = false;
        n2Var2.f22513g = 0;
        n2Var2.h = currentTimeMillis - 3600;
        n2Var2.f22514i = false;
        n2Var2.f22515j = false;
        n2Var2.f22516k = -1;
        arrayList.add(n2Var2);
        org.telegram.ui.Cells.n2 n2Var3 = new org.telegram.ui.Cells.n2();
        n2Var3.f22508a = LocaleController.getString(R.string.ThemePreviewDialog3);
        n2Var3.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        n2Var3.f22510c = 2;
        n2Var3.d = 3;
        n2Var3.f22511e = false;
        n2Var3.f22512f = true;
        n2Var3.f22513g = 0;
        n2Var3.h = currentTimeMillis - 7200;
        n2Var3.f22514i = false;
        n2Var3.f22515j = true;
        n2Var3.f22516k = -1;
        arrayList.add(n2Var3);
        org.telegram.ui.Cells.n2 n2Var4 = new org.telegram.ui.Cells.n2();
        n2Var4.f22508a = LocaleController.getString(R.string.ThemePreviewDialog4);
        n2Var4.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        n2Var4.f22510c = 3;
        n2Var4.d = 0;
        n2Var4.f22511e = false;
        n2Var4.f22512f = false;
        n2Var4.f22513g = 2;
        n2Var4.h = currentTimeMillis - 10800;
        n2Var4.f22514i = false;
        n2Var4.f22515j = false;
        n2Var4.f22516k = -1;
        arrayList.add(n2Var4);
        org.telegram.ui.Cells.n2 n2Var5 = new org.telegram.ui.Cells.n2();
        n2Var5.f22508a = LocaleController.getString(R.string.ThemePreviewDialog5);
        n2Var5.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        n2Var5.f22510c = 4;
        n2Var5.d = 0;
        n2Var5.f22511e = false;
        n2Var5.f22512f = false;
        n2Var5.f22513g = 1;
        n2Var5.h = currentTimeMillis - 14400;
        n2Var5.f22514i = false;
        n2Var5.f22515j = false;
        n2Var5.f22516k = 2;
        arrayList.add(n2Var5);
        org.telegram.ui.Cells.n2 n2Var6 = new org.telegram.ui.Cells.n2();
        n2Var6.f22508a = LocaleController.getString(R.string.ThemePreviewDialog6);
        n2Var6.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        n2Var6.f22510c = 5;
        n2Var6.d = 0;
        n2Var6.f22511e = false;
        n2Var6.f22512f = false;
        n2Var6.f22513g = 0;
        n2Var6.h = currentTimeMillis - 18000;
        n2Var6.f22514i = false;
        n2Var6.f22515j = false;
        n2Var6.f22516k = -1;
        arrayList.add(n2Var6);
        org.telegram.ui.Cells.n2 n2Var7 = new org.telegram.ui.Cells.n2();
        n2Var7.f22508a = LocaleController.getString(R.string.ThemePreviewDialog7);
        n2Var7.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        n2Var7.f22510c = 6;
        n2Var7.d = 0;
        n2Var7.f22511e = false;
        n2Var7.f22512f = false;
        n2Var7.f22513g = 0;
        n2Var7.h = currentTimeMillis - 21600;
        n2Var7.f22514i = true;
        n2Var7.f22515j = false;
        n2Var7.f22516k = -1;
        arrayList.add(n2Var7);
        org.telegram.ui.Cells.n2 n2Var8 = new org.telegram.ui.Cells.n2();
        n2Var8.f22508a = LocaleController.getString(R.string.ThemePreviewDialog8);
        n2Var8.f22509b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        n2Var8.f22510c = 0;
        n2Var8.d = 0;
        n2Var8.f22511e = false;
        n2Var8.f22512f = false;
        n2Var8.f22513g = 0;
        n2Var8.h = currentTimeMillis - 25200;
        n2Var8.f22514i = true;
        n2Var8.f22515j = false;
        n2Var8.f22516k = -1;
        arrayList.add(n2Var8);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46528f != 1) {
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
        if (c1Var.f46528f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) c1Var.f46524a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            s2Var.f22861s2 = z10;
            s2Var.setDialog((org.telegram.ui.Cells.n2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View s4Var;
        Context context = this.f37656c;
        if (i10 == 0) {
            s4Var = new org.telegram.ui.Cells.s2(context, false);
        } else {
            s4Var = new org.telegram.ui.Cells.s4(context);
        }
        s4Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(s4Var);
    }
}
