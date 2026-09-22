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
public final class ah0 extends org.telegram.ui.ActionBar.n2 {
    public zg0 f32080a;
    public org.telegram.ui.Components.yl0 f32081b;
    public int f32082c;
    public int d;
    public int e;
    public int f32083f;
    public int h;
    public int f32084n;
    public int f32085r;
    public int f32086s;
    public int v;

    public static void U(ah0 ah0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == ah0Var.f32082c) {
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
                ah0Var.presentFragment(new yg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                ah0Var.showDialog(new rg.j0(7, ah0Var.currentAccount, ah0Var.getParentActivity(), ah0Var, null));
            }
        } else if (i10 == ah0Var.d) {
            ah0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == ah0Var.e) {
            ah0Var.presentFragment(new z6());
        } else if (i10 == ah0Var.f32083f) {
            ah0Var.presentFragment(new h(3));
        } else if (i10 == ah0Var.h) {
            ah0Var.showDialog(org.telegram.ui.Components.d5.U(ah0Var, null));
        } else if (i10 == ah0Var.f32085r && ah0Var.getParentActivity() != null) {
            Activity parentActivity = ah0Var.getParentActivity();
            int i13 = ah0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.v(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
            }
            ah0Var.showDialog(b2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 6));
        this.f32080a = new zg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f32081b = yl0Var;
        yl0Var.setVerticalScrollBarEnabled(false);
        this.f32081b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f32081b, w7.y5.e(-1, -1, 51));
        this.f32081b.setAdapter(this.f32080a);
        this.f32081b.setOnItemClickListener(new fu(this, 22));
        this.f32081b.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.yl0 getListViewForSimpleGlass() {
        return this.f32081b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 16, new Class[]{org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19109d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19387s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        int i10 = org.telegram.ui.ActionBar.j6.f19073b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19330p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19511z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32081b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19274m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
            this.f32082c = i10;
        } else {
            this.f32082c = -1;
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
        this.f32083f = i12 + 1;
        this.h = i12 + 2;
        this.f32084n = i12 + 3;
        this.f32085r = i12 + 4;
        this.v = i12 + 6;
        this.f32086s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zg0 zg0Var = this.f32080a;
        if (zg0Var != null) {
            zg0Var.l();
        }
    }
}
