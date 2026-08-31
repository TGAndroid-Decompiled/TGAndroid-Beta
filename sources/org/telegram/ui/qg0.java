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
public final class qg0 extends org.telegram.ui.ActionBar.p2 {
    public pg0 f40472a;
    public org.telegram.ui.Components.tl0 f40473b;
    public int f40474c;
    public int d;
    public int f40475e;
    public int f40476f;
    public int h;
    public int f40477n;
    public int f40478r;
    public int f40479s;
    public int v;

    public static void U(qg0 qg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == qg0Var.f40474c) {
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
                qg0Var.presentFragment(new og0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                qg0Var.showDialog(new fg.v0(7, qg0Var.currentAccount, qg0Var.getParentActivity(), qg0Var, null));
            }
        } else if (i10 == qg0Var.d) {
            qg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == qg0Var.f40475e) {
            qg0Var.presentFragment(new b7());
        } else if (i10 == qg0Var.f40476f) {
            qg0Var.presentFragment(new i(3));
        } else if (i10 == qg0Var.h) {
            qg0Var.showDialog(org.telegram.ui.Components.z4.U(qg0Var, null));
        } else if (i10 == qg0Var.f40478r && qg0Var.getParentActivity() != null) {
            Activity parentActivity = qg0Var.getParentActivity();
            int i13 = qg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new d4.b(i13, 6));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            }
            qg0Var.showDialog(d2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 23));
        this.f40472a = new pg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f40473b = tl0Var;
        tl0Var.setVerticalScrollBarEnabled(false);
        this.f40473b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f40473b, k7.c6.e(-1, -1, 51));
        this.f40473b.setAdapter(this.f40472a);
        this.f40473b.setOnItemClickListener(new gu(this, 21));
        this.f40473b.p1();
        this.actionBar.setAdaptiveBackground(this.f40473b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        int i10 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21876p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40473b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
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
            this.f40474c = i10;
        } else {
            this.f40474c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f40475e = i12;
        this.f40476f = i12 + 1;
        this.h = i12 + 2;
        this.f40477n = i12 + 3;
        this.f40478r = i12 + 4;
        this.v = i12 + 6;
        this.f40479s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        pg0 pg0Var = this.f40472a;
        if (pg0Var != null) {
            pg0Var.l();
        }
    }
}
