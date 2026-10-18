package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ec1 extends org.telegram.ui.Components.hm0 {
    public final Context f36463c;
    public final ArrayList d;

    public ec1(Context context) {
        this.f36463c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.m2 m2Var = new org.telegram.ui.Cells.m2();
        m2Var.f22561a = LocaleController.getString(R.string.ThemePreviewDialog1);
        m2Var.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        m2Var.f22563c = 0;
        m2Var.d = 0;
        m2Var.e = true;
        m2Var.f22564f = false;
        m2Var.f22565g = 0;
        m2Var.h = currentTimeMillis;
        m2Var.f22566i = false;
        m2Var.f22567j = false;
        m2Var.f22568k = 2;
        arrayList.add(m2Var);
        org.telegram.ui.Cells.m2 m2Var2 = new org.telegram.ui.Cells.m2();
        m2Var2.f22561a = LocaleController.getString(R.string.ThemePreviewDialog2);
        m2Var2.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        m2Var2.f22563c = 1;
        m2Var2.d = 2;
        m2Var2.e = false;
        m2Var2.f22564f = false;
        m2Var2.f22565g = 0;
        m2Var2.h = currentTimeMillis - 3600;
        m2Var2.f22566i = false;
        m2Var2.f22567j = false;
        m2Var2.f22568k = -1;
        arrayList.add(m2Var2);
        org.telegram.ui.Cells.m2 m2Var3 = new org.telegram.ui.Cells.m2();
        m2Var3.f22561a = LocaleController.getString(R.string.ThemePreviewDialog3);
        m2Var3.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        m2Var3.f22563c = 2;
        m2Var3.d = 3;
        m2Var3.e = false;
        m2Var3.f22564f = true;
        m2Var3.f22565g = 0;
        m2Var3.h = currentTimeMillis - 7200;
        m2Var3.f22566i = false;
        m2Var3.f22567j = true;
        m2Var3.f22568k = -1;
        arrayList.add(m2Var3);
        org.telegram.ui.Cells.m2 m2Var4 = new org.telegram.ui.Cells.m2();
        m2Var4.f22561a = LocaleController.getString(R.string.ThemePreviewDialog4);
        m2Var4.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        m2Var4.f22563c = 3;
        m2Var4.d = 0;
        m2Var4.e = false;
        m2Var4.f22564f = false;
        m2Var4.f22565g = 2;
        m2Var4.h = currentTimeMillis - 10800;
        m2Var4.f22566i = false;
        m2Var4.f22567j = false;
        m2Var4.f22568k = -1;
        arrayList.add(m2Var4);
        org.telegram.ui.Cells.m2 m2Var5 = new org.telegram.ui.Cells.m2();
        m2Var5.f22561a = LocaleController.getString(R.string.ThemePreviewDialog5);
        m2Var5.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        m2Var5.f22563c = 4;
        m2Var5.d = 0;
        m2Var5.e = false;
        m2Var5.f22564f = false;
        m2Var5.f22565g = 1;
        m2Var5.h = currentTimeMillis - 14400;
        m2Var5.f22566i = false;
        m2Var5.f22567j = false;
        m2Var5.f22568k = 2;
        arrayList.add(m2Var5);
        org.telegram.ui.Cells.m2 m2Var6 = new org.telegram.ui.Cells.m2();
        m2Var6.f22561a = LocaleController.getString(R.string.ThemePreviewDialog6);
        m2Var6.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        m2Var6.f22563c = 5;
        m2Var6.d = 0;
        m2Var6.e = false;
        m2Var6.f22564f = false;
        m2Var6.f22565g = 0;
        m2Var6.h = currentTimeMillis - 18000;
        m2Var6.f22566i = false;
        m2Var6.f22567j = false;
        m2Var6.f22568k = -1;
        arrayList.add(m2Var6);
        org.telegram.ui.Cells.m2 m2Var7 = new org.telegram.ui.Cells.m2();
        m2Var7.f22561a = LocaleController.getString(R.string.ThemePreviewDialog7);
        m2Var7.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        m2Var7.f22563c = 6;
        m2Var7.d = 0;
        m2Var7.e = false;
        m2Var7.f22564f = false;
        m2Var7.f22565g = 0;
        m2Var7.h = currentTimeMillis - 21600;
        m2Var7.f22566i = true;
        m2Var7.f22567j = false;
        m2Var7.f22568k = -1;
        arrayList.add(m2Var7);
        org.telegram.ui.Cells.m2 m2Var8 = new org.telegram.ui.Cells.m2();
        m2Var8.f22561a = LocaleController.getString(R.string.ThemePreviewDialog8);
        m2Var8.f22562b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        m2Var8.f22563c = 0;
        m2Var8.d = 0;
        m2Var8.e = false;
        m2Var8.f22564f = false;
        m2Var8.f22565g = 0;
        m2Var8.h = currentTimeMillis - 25200;
        m2Var8.f22566i = true;
        m2Var8.f22567j = false;
        m2Var8.f22568k = -1;
        arrayList.add(m2Var8);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45913f != 1) {
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
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f45913f == 0) {
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) b1Var.f45910a;
            ArrayList arrayList = this.d;
            boolean z10 = true;
            if (i10 == arrayList.size() - 1) {
                z10 = false;
            }
            r2Var.f22893s2 = z10;
            r2Var.setDialog((org.telegram.ui.Cells.m2) arrayList.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View r4Var;
        Context context = this.f36463c;
        if (i10 == 0) {
            r4Var = new org.telegram.ui.Cells.r2(context, false);
        } else {
            r4Var = new org.telegram.ui.Cells.r4(context);
        }
        r4Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(r4Var);
    }
}
