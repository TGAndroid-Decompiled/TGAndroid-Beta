package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pg0 extends org.telegram.ui.ActionBar.p2 {
    public og0 f37306a;
    public org.telegram.ui.Components.sl0 f37307b;
    public int f37308c;
    public int d;
    public int e;
    public int f37309f;
    public int h;
    public int f37310n;
    public int f37311r;
    public int f37312s;
    public int v;

    public static void U(pg0 pg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == pg0Var.f37308c) {
            for (int i12 = 3; i12 >= 0; i12--) {
                if (!UserConfig.getInstance(i12).isClientActivated()) {
                    i11++;
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i11--;
            }
            if (i11 > 0 && num != null) {
                pg0Var.presentFragment(new ng0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                pg0Var.showDialog(new eg.v0(7, pg0Var.currentAccount, pg0Var.getParentActivity(), pg0Var, null));
            }
        } else if (i10 == pg0Var.d) {
            pg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == pg0Var.e) {
            pg0Var.presentFragment(new b7());
        } else if (i10 == pg0Var.f37309f) {
            pg0Var.presentFragment(new i(3));
        } else if (i10 == pg0Var.h) {
            pg0Var.showDialog(org.telegram.ui.Components.z4.U(pg0Var, null));
        } else if (i10 == pg0Var.f37311r && pg0Var.getParentActivity() != null) {
            Activity parentActivity = pg0Var.getParentActivity();
            int i13 = pg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new d4.b(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            }
            pg0Var.showDialog(d2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 23));
        this.f37306a = new og0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f37307b = sl0Var;
        sl0Var.setVerticalScrollBarEnabled(false);
        this.f37307b.setLayoutManager(new f2.i0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37307b, k7.b6.e(-1, -1, 51));
        this.f37307b.setAdapter(this.f37306a);
        this.f37307b.setOnItemClickListener(new fu(this, 21));
        this.f37307b.p1();
        this.actionBar.setAdaptiveBackground(this.f37307b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i10 = org.telegram.ui.ActionBar.j6.f19871b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37307b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        return arrayList;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.v = 1;
        if (UserConfig.getActivatedAccountsCount() < 4) {
            int i10 = this.v;
            this.v = i10 + 1;
            this.f37308c = i10;
        } else {
            this.f37308c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.e = i12;
        this.f37309f = i12 + 1;
        this.h = i12 + 2;
        this.f37310n = i12 + 3;
        this.f37311r = i12 + 4;
        this.v = i12 + 6;
        this.f37312s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        og0 og0Var = this.f37306a;
        if (og0Var != null) {
            og0Var.l();
        }
    }
}
