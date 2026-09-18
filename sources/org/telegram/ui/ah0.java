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
public final class ah0 extends org.telegram.ui.ActionBar.o2 {
    public zg0 f31863a;
    public org.telegram.ui.Components.ml0 f31864b;
    public int f31865c;
    public int d;
    public int e;
    public int f31866f;
    public int h;
    public int f31867n;
    public int f31868r;
    public int f31869s;
    public int v;

    public static void U(ah0 ah0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == ah0Var.f31865c) {
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
            ah0Var.presentFragment(new a7());
        } else if (i10 == ah0Var.f31866f) {
            ah0Var.presentFragment(new h(3));
        } else if (i10 == ah0Var.h) {
            ah0Var.showDialog(org.telegram.ui.Components.c5.U(ah0Var, null));
        } else if (i10 == ah0Var.f31868r && ah0Var.getParentActivity() != null) {
            Activity parentActivity = ah0Var.getParentActivity();
            int i13 = ah0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new i2.v(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
            }
            ah0Var.showDialog(c2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x70(this, 6));
        this.f31863a = new zg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f31864b = ml0Var;
        ml0Var.setVerticalScrollBarEnabled(false);
        this.f31864b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f31864b, w7.x5.e(-1, -1, 51));
        this.f31864b.setAdapter(this.f31863a);
        this.f31864b.setOnItemClickListener(new gu(this, 22));
        this.f31864b.q1();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
        return this.f31864b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18863d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18807a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19140s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19195v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19159t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18953i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18985k0, null, null, org.telegram.ui.ActionBar.j6.f18864d7));
        int i10 = org.telegram.ui.ActionBar.j6.f18827b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19083p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19264z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31864b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19028m6));
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
            this.f31865c = i10;
        } else {
            this.f31865c = -1;
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
        this.f31866f = i12 + 1;
        this.h = i12 + 2;
        this.f31867n = i12 + 3;
        this.f31868r = i12 + 4;
        this.v = i12 + 6;
        this.f31869s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zg0 zg0Var = this.f31863a;
        if (zg0Var != null) {
            zg0Var.l();
        }
    }
}
