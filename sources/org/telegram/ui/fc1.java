package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class fc1 extends org.telegram.ui.Components.yk0 {

    public final Context f38071c;
    public final ArrayList d;

    public fc1(Context context) {
        this.f38071c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2();
        k2Var.f24561a = LocaleController.getString(R.string.ThemePreviewDialog1);
        k2Var.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage1);
        k2Var.f24563c = 0;
        k2Var.d = 0;
        k2Var.f24564e = true;
        k2Var.f24565f = false;
        k2Var.f24566g = 0;
        k2Var.h = iCurrentTimeMillis;
        k2Var.f24567i = false;
        k2Var.f24568j = false;
        k2Var.f24569k = 2;
        arrayList.add(k2Var);
        org.telegram.ui.Cells.k2 k2Var2 = new org.telegram.ui.Cells.k2();
        k2Var2.f24561a = LocaleController.getString(R.string.ThemePreviewDialog2);
        k2Var2.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage2);
        k2Var2.f24563c = 1;
        k2Var2.d = 2;
        k2Var2.f24564e = false;
        k2Var2.f24565f = false;
        k2Var2.f24566g = 0;
        k2Var2.h = iCurrentTimeMillis - 3600;
        k2Var2.f24567i = false;
        k2Var2.f24568j = false;
        k2Var2.f24569k = -1;
        arrayList.add(k2Var2);
        org.telegram.ui.Cells.k2 k2Var3 = new org.telegram.ui.Cells.k2();
        k2Var3.f24561a = LocaleController.getString(R.string.ThemePreviewDialog3);
        k2Var3.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage3);
        k2Var3.f24563c = 2;
        k2Var3.d = 3;
        k2Var3.f24564e = false;
        k2Var3.f24565f = true;
        k2Var3.f24566g = 0;
        k2Var3.h = iCurrentTimeMillis - 7200;
        k2Var3.f24567i = false;
        k2Var3.f24568j = true;
        k2Var3.f24569k = -1;
        arrayList.add(k2Var3);
        org.telegram.ui.Cells.k2 k2Var4 = new org.telegram.ui.Cells.k2();
        k2Var4.f24561a = LocaleController.getString(R.string.ThemePreviewDialog4);
        k2Var4.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage4);
        k2Var4.f24563c = 3;
        k2Var4.d = 0;
        k2Var4.f24564e = false;
        k2Var4.f24565f = false;
        k2Var4.f24566g = 2;
        k2Var4.h = iCurrentTimeMillis - 10800;
        k2Var4.f24567i = false;
        k2Var4.f24568j = false;
        k2Var4.f24569k = -1;
        arrayList.add(k2Var4);
        org.telegram.ui.Cells.k2 k2Var5 = new org.telegram.ui.Cells.k2();
        k2Var5.f24561a = LocaleController.getString(R.string.ThemePreviewDialog5);
        k2Var5.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage5);
        k2Var5.f24563c = 4;
        k2Var5.d = 0;
        k2Var5.f24564e = false;
        k2Var5.f24565f = false;
        k2Var5.f24566g = 1;
        k2Var5.h = iCurrentTimeMillis - 14400;
        k2Var5.f24567i = false;
        k2Var5.f24568j = false;
        k2Var5.f24569k = 2;
        arrayList.add(k2Var5);
        org.telegram.ui.Cells.k2 k2Var6 = new org.telegram.ui.Cells.k2();
        k2Var6.f24561a = LocaleController.getString(R.string.ThemePreviewDialog6);
        k2Var6.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage6);
        k2Var6.f24563c = 5;
        k2Var6.d = 0;
        k2Var6.f24564e = false;
        k2Var6.f24565f = false;
        k2Var6.f24566g = 0;
        k2Var6.h = iCurrentTimeMillis - 18000;
        k2Var6.f24567i = false;
        k2Var6.f24568j = false;
        k2Var6.f24569k = -1;
        arrayList.add(k2Var6);
        org.telegram.ui.Cells.k2 k2Var7 = new org.telegram.ui.Cells.k2();
        k2Var7.f24561a = LocaleController.getString(R.string.ThemePreviewDialog7);
        k2Var7.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage7);
        k2Var7.f24563c = 6;
        k2Var7.d = 0;
        k2Var7.f24564e = false;
        k2Var7.f24565f = false;
        k2Var7.f24566g = 0;
        k2Var7.h = iCurrentTimeMillis - 21600;
        k2Var7.f24567i = true;
        k2Var7.f24568j = false;
        k2Var7.f24569k = -1;
        arrayList.add(k2Var7);
        org.telegram.ui.Cells.k2 k2Var8 = new org.telegram.ui.Cells.k2();
        k2Var8.f24561a = LocaleController.getString(R.string.ThemePreviewDialog8);
        k2Var8.f24562b = LocaleController.getString(R.string.ThemePreviewDialogMessage8);
        k2Var8.f24563c = 0;
        k2Var8.d = 0;
        k2Var8.f24564e = false;
        k2Var8.f24565f = false;
        k2Var8.f24566g = 0;
        k2Var8.h = iCurrentTimeMillis - 25200;
        k2Var8.f24567i = true;
        k2Var8.f24568j = false;
        k2Var8.f24569k = -1;
        arrayList.add(k2Var8);
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 1;
    }

    @Override
    public final int h() {
        return this.d.size();
    }

    @Override
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 0) {
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) o1Var.f5789a;
            ArrayList arrayList = this.d;
            p2Var.f24907o2 = i10 != arrayList.size() - 1;
            p2Var.setDialog((org.telegram.ui.Cells.k2) arrayList.get(i10));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f38071c;
        View p2Var = i10 == 0 ? new org.telegram.ui.Cells.p2(context, false) : new org.telegram.ui.Cells.p4(context);
        p2Var.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(p2Var);
    }
}
