package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gc1 extends org.telegram.ui.Components.vk0 {
    public final Context f38509c;
    public final ArrayList d;

    public gc1(Context context) {
        this.f38509c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.m2 m2Var = new org.telegram.ui.Cells.m2();
        m2Var.f24688a = LocaleController.getString(R.string.ThemePreviewDialog1);
        m2Var.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        m2Var.f24690c = 0;
        m2Var.d = 0;
        m2Var.f24691e = true;
        m2Var.f24692f = false;
        m2Var.f24693g = 0;
        m2Var.h = currentTimeMillis;
        m2Var.f24694i = false;
        m2Var.f24695j = false;
        m2Var.f24696k = 2;
        arrayList.add(m2Var);
        org.telegram.ui.Cells.m2 m2Var2 = new org.telegram.ui.Cells.m2();
        m2Var2.f24688a = LocaleController.getString(R.string.ThemePreviewDialog2);
        m2Var2.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        m2Var2.f24690c = 1;
        m2Var2.d = 2;
        m2Var2.f24691e = false;
        m2Var2.f24692f = false;
        m2Var2.f24693g = 0;
        m2Var2.h = currentTimeMillis - 3600;
        m2Var2.f24694i = false;
        m2Var2.f24695j = false;
        m2Var2.f24696k = -1;
        arrayList.add(m2Var2);
        org.telegram.ui.Cells.m2 m2Var3 = new org.telegram.ui.Cells.m2();
        m2Var3.f24688a = LocaleController.getString(R.string.ThemePreviewDialog3);
        m2Var3.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        m2Var3.f24690c = 2;
        m2Var3.d = 3;
        m2Var3.f24691e = false;
        m2Var3.f24692f = true;
        m2Var3.f24693g = 0;
        m2Var3.h = currentTimeMillis - 7200;
        m2Var3.f24694i = false;
        m2Var3.f24695j = true;
        m2Var3.f24696k = -1;
        arrayList.add(m2Var3);
        org.telegram.ui.Cells.m2 m2Var4 = new org.telegram.ui.Cells.m2();
        m2Var4.f24688a = LocaleController.getString(R.string.ThemePreviewDialog4);
        m2Var4.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        m2Var4.f24690c = 3;
        m2Var4.d = 0;
        m2Var4.f24691e = false;
        m2Var4.f24692f = false;
        m2Var4.f24693g = 2;
        m2Var4.h = currentTimeMillis - 10800;
        m2Var4.f24694i = false;
        m2Var4.f24695j = false;
        m2Var4.f24696k = -1;
        arrayList.add(m2Var4);
        org.telegram.ui.Cells.m2 m2Var5 = new org.telegram.ui.Cells.m2();
        m2Var5.f24688a = LocaleController.getString(R.string.ThemePreviewDialog5);
        m2Var5.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        m2Var5.f24690c = 4;
        m2Var5.d = 0;
        m2Var5.f24691e = false;
        m2Var5.f24692f = false;
        m2Var5.f24693g = 1;
        m2Var5.h = currentTimeMillis - 14400;
        m2Var5.f24694i = false;
        m2Var5.f24695j = false;
        m2Var5.f24696k = 2;
        arrayList.add(m2Var5);
        org.telegram.ui.Cells.m2 m2Var6 = new org.telegram.ui.Cells.m2();
        m2Var6.f24688a = LocaleController.getString(R.string.ThemePreviewDialog6);
        m2Var6.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        m2Var6.f24690c = 5;
        m2Var6.d = 0;
        m2Var6.f24691e = false;
        m2Var6.f24692f = false;
        m2Var6.f24693g = 0;
        m2Var6.h = currentTimeMillis - 18000;
        m2Var6.f24694i = false;
        m2Var6.f24695j = false;
        m2Var6.f24696k = -1;
        arrayList.add(m2Var6);
        org.telegram.ui.Cells.m2 m2Var7 = new org.telegram.ui.Cells.m2();
        m2Var7.f24688a = LocaleController.getString(R.string.ThemePreviewDialog7);
        m2Var7.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        m2Var7.f24690c = 6;
        m2Var7.d = 0;
        m2Var7.f24691e = false;
        m2Var7.f24692f = false;
        m2Var7.f24693g = 0;
        m2Var7.h = currentTimeMillis - 21600;
        m2Var7.f24694i = true;
        m2Var7.f24695j = false;
        m2Var7.f24696k = -1;
        arrayList.add(m2Var7);
        org.telegram.ui.Cells.m2 m2Var8 = new org.telegram.ui.Cells.m2();
        m2Var8.f24688a = LocaleController.getString(R.string.ThemePreviewDialog8);
        m2Var8.f24689b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        m2Var8.f24690c = 0;
        m2Var8.d = 0;
        m2Var8.f24691e = false;
        m2Var8.f24692f = false;
        m2Var8.f24693g = 0;
        m2Var8.h = currentTimeMillis - 25200;
        m2Var8.f24694i = true;
        m2Var8.f24695j = false;
        m2Var8.f24696k = -1;
        arrayList.add(m2Var8);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i9) {
        if (i9 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        if (q1Var.f5505f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) q1Var.f5501a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i9 == arrayList.size() - 1) {
                z10 = false;
            }
            r2Var.f25024o2 = z10;
            r2Var.setDialog((org.telegram.ui.Cells.m2) arrayList.get(i9));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View s4Var;
        Context context = this.f38509c;
        if (i9 == 0) {
            s4Var = new org.telegram.ui.Cells.r2(context, false);
        } else {
            s4Var = new org.telegram.ui.Cells.s4(context);
        }
        s4Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(s4Var);
    }
}
