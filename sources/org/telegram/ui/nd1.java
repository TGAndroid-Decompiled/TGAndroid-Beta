package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nd1 extends org.telegram.ui.Components.kl0 {
    public final Context f35957c;
    public final ArrayList d;

    public nd1(Context context) {
        this.f35957c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.m2 m2Var = new org.telegram.ui.Cells.m2();
        m2Var.f20411a = LocaleController.getString(R.string.ThemePreviewDialog1);
        m2Var.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        m2Var.f20413c = 0;
        m2Var.d = 0;
        m2Var.e = true;
        m2Var.f20414f = false;
        m2Var.f20415g = 0;
        m2Var.h = currentTimeMillis;
        m2Var.f20416i = false;
        m2Var.f20417j = false;
        m2Var.f20418k = 2;
        arrayList.add(m2Var);
        org.telegram.ui.Cells.m2 m2Var2 = new org.telegram.ui.Cells.m2();
        m2Var2.f20411a = LocaleController.getString(R.string.ThemePreviewDialog2);
        m2Var2.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        m2Var2.f20413c = 1;
        m2Var2.d = 2;
        m2Var2.e = false;
        m2Var2.f20414f = false;
        m2Var2.f20415g = 0;
        m2Var2.h = currentTimeMillis - 3600;
        m2Var2.f20416i = false;
        m2Var2.f20417j = false;
        m2Var2.f20418k = -1;
        arrayList.add(m2Var2);
        org.telegram.ui.Cells.m2 m2Var3 = new org.telegram.ui.Cells.m2();
        m2Var3.f20411a = LocaleController.getString(R.string.ThemePreviewDialog3);
        m2Var3.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        m2Var3.f20413c = 2;
        m2Var3.d = 3;
        m2Var3.e = false;
        m2Var3.f20414f = true;
        m2Var3.f20415g = 0;
        m2Var3.h = currentTimeMillis - 7200;
        m2Var3.f20416i = false;
        m2Var3.f20417j = true;
        m2Var3.f20418k = -1;
        arrayList.add(m2Var3);
        org.telegram.ui.Cells.m2 m2Var4 = new org.telegram.ui.Cells.m2();
        m2Var4.f20411a = LocaleController.getString(R.string.ThemePreviewDialog4);
        m2Var4.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        m2Var4.f20413c = 3;
        m2Var4.d = 0;
        m2Var4.e = false;
        m2Var4.f20414f = false;
        m2Var4.f20415g = 2;
        m2Var4.h = currentTimeMillis - 10800;
        m2Var4.f20416i = false;
        m2Var4.f20417j = false;
        m2Var4.f20418k = -1;
        arrayList.add(m2Var4);
        org.telegram.ui.Cells.m2 m2Var5 = new org.telegram.ui.Cells.m2();
        m2Var5.f20411a = LocaleController.getString(R.string.ThemePreviewDialog5);
        m2Var5.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        m2Var5.f20413c = 4;
        m2Var5.d = 0;
        m2Var5.e = false;
        m2Var5.f20414f = false;
        m2Var5.f20415g = 1;
        m2Var5.h = currentTimeMillis - 14400;
        m2Var5.f20416i = false;
        m2Var5.f20417j = false;
        m2Var5.f20418k = 2;
        arrayList.add(m2Var5);
        org.telegram.ui.Cells.m2 m2Var6 = new org.telegram.ui.Cells.m2();
        m2Var6.f20411a = LocaleController.getString(R.string.ThemePreviewDialog6);
        m2Var6.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        m2Var6.f20413c = 5;
        m2Var6.d = 0;
        m2Var6.e = false;
        m2Var6.f20414f = false;
        m2Var6.f20415g = 0;
        m2Var6.h = currentTimeMillis - 18000;
        m2Var6.f20416i = false;
        m2Var6.f20417j = false;
        m2Var6.f20418k = -1;
        arrayList.add(m2Var6);
        org.telegram.ui.Cells.m2 m2Var7 = new org.telegram.ui.Cells.m2();
        m2Var7.f20411a = LocaleController.getString(R.string.ThemePreviewDialog7);
        m2Var7.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        m2Var7.f20413c = 6;
        m2Var7.d = 0;
        m2Var7.e = false;
        m2Var7.f20414f = false;
        m2Var7.f20415g = 0;
        m2Var7.h = currentTimeMillis - 21600;
        m2Var7.f20416i = true;
        m2Var7.f20417j = false;
        m2Var7.f20418k = -1;
        arrayList.add(m2Var7);
        org.telegram.ui.Cells.m2 m2Var8 = new org.telegram.ui.Cells.m2();
        m2Var8.f20411a = LocaleController.getString(R.string.ThemePreviewDialog8);
        m2Var8.f20412b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        m2Var8.f20413c = 0;
        m2Var8.d = 0;
        m2Var8.e = false;
        m2Var8.f20414f = false;
        m2Var8.f20415g = 0;
        m2Var8.h = currentTimeMillis - 25200;
        m2Var8.f20416i = true;
        m2Var8.f20417j = false;
        m2Var8.f20418k = -1;
        arrayList.add(m2Var8);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f != 1) {
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
        if (c1Var.f42678f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) c1Var.f42675a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            r2Var.f20750s2 = z10;
            r2Var.setDialog((org.telegram.ui.Cells.m2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View r4Var;
        Context context = this.f35957c;
        if (i10 == 0) {
            r4Var = new org.telegram.ui.Cells.r2(context, false);
        } else {
            r4Var = new org.telegram.ui.Cells.r4(context);
        }
        r4Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(r4Var);
    }
}
