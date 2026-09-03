package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bd1 extends org.telegram.ui.Components.ql0 {
    public final Context f32852c;
    public final ArrayList d;

    public bd1(Context context) {
        this.f32852c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.l2 l2Var = new org.telegram.ui.Cells.l2();
        l2Var.f21309a = LocaleController.getString(R.string.ThemePreviewDialog1);
        l2Var.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        l2Var.f21311c = 0;
        l2Var.d = 0;
        l2Var.e = true;
        l2Var.f21312f = false;
        l2Var.f21313g = 0;
        l2Var.h = currentTimeMillis;
        l2Var.f21314i = false;
        l2Var.f21315j = false;
        l2Var.f21316k = 2;
        arrayList.add(l2Var);
        org.telegram.ui.Cells.l2 l2Var2 = new org.telegram.ui.Cells.l2();
        l2Var2.f21309a = LocaleController.getString(R.string.ThemePreviewDialog2);
        l2Var2.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        l2Var2.f21311c = 1;
        l2Var2.d = 2;
        l2Var2.e = false;
        l2Var2.f21312f = false;
        l2Var2.f21313g = 0;
        l2Var2.h = currentTimeMillis - 3600;
        l2Var2.f21314i = false;
        l2Var2.f21315j = false;
        l2Var2.f21316k = -1;
        arrayList.add(l2Var2);
        org.telegram.ui.Cells.l2 l2Var3 = new org.telegram.ui.Cells.l2();
        l2Var3.f21309a = LocaleController.getString(R.string.ThemePreviewDialog3);
        l2Var3.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        l2Var3.f21311c = 2;
        l2Var3.d = 3;
        l2Var3.e = false;
        l2Var3.f21312f = true;
        l2Var3.f21313g = 0;
        l2Var3.h = currentTimeMillis - 7200;
        l2Var3.f21314i = false;
        l2Var3.f21315j = true;
        l2Var3.f21316k = -1;
        arrayList.add(l2Var3);
        org.telegram.ui.Cells.l2 l2Var4 = new org.telegram.ui.Cells.l2();
        l2Var4.f21309a = LocaleController.getString(R.string.ThemePreviewDialog4);
        l2Var4.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        l2Var4.f21311c = 3;
        l2Var4.d = 0;
        l2Var4.e = false;
        l2Var4.f21312f = false;
        l2Var4.f21313g = 2;
        l2Var4.h = currentTimeMillis - 10800;
        l2Var4.f21314i = false;
        l2Var4.f21315j = false;
        l2Var4.f21316k = -1;
        arrayList.add(l2Var4);
        org.telegram.ui.Cells.l2 l2Var5 = new org.telegram.ui.Cells.l2();
        l2Var5.f21309a = LocaleController.getString(R.string.ThemePreviewDialog5);
        l2Var5.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        l2Var5.f21311c = 4;
        l2Var5.d = 0;
        l2Var5.e = false;
        l2Var5.f21312f = false;
        l2Var5.f21313g = 1;
        l2Var5.h = currentTimeMillis - 14400;
        l2Var5.f21314i = false;
        l2Var5.f21315j = false;
        l2Var5.f21316k = 2;
        arrayList.add(l2Var5);
        org.telegram.ui.Cells.l2 l2Var6 = new org.telegram.ui.Cells.l2();
        l2Var6.f21309a = LocaleController.getString(R.string.ThemePreviewDialog6);
        l2Var6.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        l2Var6.f21311c = 5;
        l2Var6.d = 0;
        l2Var6.e = false;
        l2Var6.f21312f = false;
        l2Var6.f21313g = 0;
        l2Var6.h = currentTimeMillis - 18000;
        l2Var6.f21314i = false;
        l2Var6.f21315j = false;
        l2Var6.f21316k = -1;
        arrayList.add(l2Var6);
        org.telegram.ui.Cells.l2 l2Var7 = new org.telegram.ui.Cells.l2();
        l2Var7.f21309a = LocaleController.getString(R.string.ThemePreviewDialog7);
        l2Var7.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        l2Var7.f21311c = 6;
        l2Var7.d = 0;
        l2Var7.e = false;
        l2Var7.f21312f = false;
        l2Var7.f21313g = 0;
        l2Var7.h = currentTimeMillis - 21600;
        l2Var7.f21314i = true;
        l2Var7.f21315j = false;
        l2Var7.f21316k = -1;
        arrayList.add(l2Var7);
        org.telegram.ui.Cells.l2 l2Var8 = new org.telegram.ui.Cells.l2();
        l2Var8.f21309a = LocaleController.getString(R.string.ThemePreviewDialog8);
        l2Var8.f21310b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        l2Var8.f21311c = 0;
        l2Var8.d = 0;
        l2Var8.e = false;
        l2Var8.f21312f = false;
        l2Var8.f21313g = 0;
        l2Var8.h = currentTimeMillis - 25200;
        l2Var8.f21314i = true;
        l2Var8.f21315j = false;
        l2Var8.f21316k = -1;
        arrayList.add(l2Var8);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f != 1) {
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
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f5777f == 0) {
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) l1Var.f5774a;
            ArrayList arrayList = this.d;
            boolean z4 = true;
            if (i10 == arrayList.size() - 1) {
                z4 = false;
            }
            q2Var.f21628p2 = z4;
            q2Var.setDialog((org.telegram.ui.Cells.l2) arrayList.get(i10));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View r4Var;
        Context context = this.f32852c;
        if (i10 == 0) {
            r4Var = new org.telegram.ui.Cells.q2(context, false);
        } else {
            r4Var = new org.telegram.ui.Cells.r4(context);
        }
        r4Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(r4Var);
    }
}
