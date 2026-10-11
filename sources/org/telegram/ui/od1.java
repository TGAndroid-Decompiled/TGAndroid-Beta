package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class od1 extends org.telegram.ui.Components.qm0 {
    public final Context f40554c;
    public final ArrayList d;

    public od1(Context context) {
        this.f40554c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2();
        n2Var.f22528a = LocaleController.getString(R.string.ThemePreviewDialog1);
        n2Var.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        n2Var.f22530c = 0;
        n2Var.d = 0;
        n2Var.f22531e = true;
        n2Var.f22532f = false;
        n2Var.f22533g = 0;
        n2Var.h = currentTimeMillis;
        n2Var.f22534i = false;
        n2Var.f22535j = false;
        n2Var.f22536k = 2;
        arrayList.add(n2Var);
        org.telegram.ui.Cells.n2 n2Var2 = new org.telegram.ui.Cells.n2();
        n2Var2.f22528a = LocaleController.getString(R.string.ThemePreviewDialog2);
        n2Var2.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        n2Var2.f22530c = 1;
        n2Var2.d = 2;
        n2Var2.f22531e = false;
        n2Var2.f22532f = false;
        n2Var2.f22533g = 0;
        n2Var2.h = currentTimeMillis - 3600;
        n2Var2.f22534i = false;
        n2Var2.f22535j = false;
        n2Var2.f22536k = -1;
        arrayList.add(n2Var2);
        org.telegram.ui.Cells.n2 n2Var3 = new org.telegram.ui.Cells.n2();
        n2Var3.f22528a = LocaleController.getString(R.string.ThemePreviewDialog3);
        n2Var3.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        n2Var3.f22530c = 2;
        n2Var3.d = 3;
        n2Var3.f22531e = false;
        n2Var3.f22532f = true;
        n2Var3.f22533g = 0;
        n2Var3.h = currentTimeMillis - 7200;
        n2Var3.f22534i = false;
        n2Var3.f22535j = true;
        n2Var3.f22536k = -1;
        arrayList.add(n2Var3);
        org.telegram.ui.Cells.n2 n2Var4 = new org.telegram.ui.Cells.n2();
        n2Var4.f22528a = LocaleController.getString(R.string.ThemePreviewDialog4);
        n2Var4.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        n2Var4.f22530c = 3;
        n2Var4.d = 0;
        n2Var4.f22531e = false;
        n2Var4.f22532f = false;
        n2Var4.f22533g = 2;
        n2Var4.h = currentTimeMillis - 10800;
        n2Var4.f22534i = false;
        n2Var4.f22535j = false;
        n2Var4.f22536k = -1;
        arrayList.add(n2Var4);
        org.telegram.ui.Cells.n2 n2Var5 = new org.telegram.ui.Cells.n2();
        n2Var5.f22528a = LocaleController.getString(R.string.ThemePreviewDialog5);
        n2Var5.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        n2Var5.f22530c = 4;
        n2Var5.d = 0;
        n2Var5.f22531e = false;
        n2Var5.f22532f = false;
        n2Var5.f22533g = 1;
        n2Var5.h = currentTimeMillis - 14400;
        n2Var5.f22534i = false;
        n2Var5.f22535j = false;
        n2Var5.f22536k = 2;
        arrayList.add(n2Var5);
        org.telegram.ui.Cells.n2 n2Var6 = new org.telegram.ui.Cells.n2();
        n2Var6.f22528a = LocaleController.getString(R.string.ThemePreviewDialog6);
        n2Var6.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        n2Var6.f22530c = 5;
        n2Var6.d = 0;
        n2Var6.f22531e = false;
        n2Var6.f22532f = false;
        n2Var6.f22533g = 0;
        n2Var6.h = currentTimeMillis - 18000;
        n2Var6.f22534i = false;
        n2Var6.f22535j = false;
        n2Var6.f22536k = -1;
        arrayList.add(n2Var6);
        org.telegram.ui.Cells.n2 n2Var7 = new org.telegram.ui.Cells.n2();
        n2Var7.f22528a = LocaleController.getString(R.string.ThemePreviewDialog7);
        n2Var7.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        n2Var7.f22530c = 6;
        n2Var7.d = 0;
        n2Var7.f22531e = false;
        n2Var7.f22532f = false;
        n2Var7.f22533g = 0;
        n2Var7.h = currentTimeMillis - 21600;
        n2Var7.f22534i = true;
        n2Var7.f22535j = false;
        n2Var7.f22536k = -1;
        arrayList.add(n2Var7);
        org.telegram.ui.Cells.n2 n2Var8 = new org.telegram.ui.Cells.n2();
        n2Var8.f22528a = LocaleController.getString(R.string.ThemePreviewDialog8);
        n2Var8.f22529b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        n2Var8.f22530c = 0;
        n2Var8.d = 0;
        n2Var8.f22531e = false;
        n2Var8.f22532f = false;
        n2Var8.f22533g = 0;
        n2Var8.h = currentTimeMillis - 25200;
        n2Var8.f22534i = true;
        n2Var8.f22535j = false;
        n2Var8.f22536k = -1;
        arrayList.add(n2Var8);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47786f != 1) {
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
    public final void v(s4.d1 d1Var, int i10) {
        if (d1Var.f47786f == 0) {
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) d1Var.f47782a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            s2Var.f22885s2 = z10;
            s2Var.setDialog((org.telegram.ui.Cells.n2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View s4Var;
        Context context = this.f40554c;
        if (i10 == 0) {
            s4Var = new org.telegram.ui.Cells.s2(context, false);
        } else {
            s4Var = new org.telegram.ui.Cells.s4(context);
        }
        s4Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(s4Var);
    }
}
