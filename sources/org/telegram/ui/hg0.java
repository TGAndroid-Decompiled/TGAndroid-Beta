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
public final class hg0 extends org.telegram.ui.ActionBar.o2 {
    public gg0 f38899a;
    public org.telegram.ui.Components.jl0 f38900b;
    public int f38901c;
    public int d;
    public int f38902e;
    public int f38903f;
    public int h;
    public int f38904n;
    public int f38905r;
    public int f38906s;
    public int v;

    public static void U(hg0 hg0Var, int i10) {
        int i11 = 0;
        Integer num = null;
        if (i10 == hg0Var.f38901c) {
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
                hg0Var.presentFragment(new fg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                hg0Var.showDialog(new cg.v0(7, hg0Var.currentAccount, hg0Var.getParentActivity(), hg0Var, null));
            }
        } else if (i10 == hg0Var.d) {
            hg0Var.presentFragment(PasscodeActivity.b0());
        } else if (i10 == hg0Var.f38902e) {
            hg0Var.presentFragment(new x6());
        } else if (i10 == hg0Var.f38903f) {
            hg0Var.presentFragment(new i(3));
        } else if (i10 == hg0Var.h) {
            hg0Var.showDialog(org.telegram.ui.Components.c5.U(hg0Var, null));
        } else if (i10 == hg0Var.f38905r && hg0Var.getParentActivity() != null) {
            Activity parentActivity = hg0Var.getParentActivity();
            int i13 = hg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new j3.x(i13, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
            hg0Var.showDialog(c2Var);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 23));
        this.f38899a = new gg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f38900b = jl0Var;
        jl0Var.setVerticalScrollBarEnabled(false);
        this.f38900b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f38900b, i7.f6.e(-1, -1, 51));
        this.f38900b.setAdapter(this.f38899a);
        this.f38900b.setOnItemClickListener(new xt(this, 21));
        this.f38900b.p1();
        this.actionBar.setAdaptiveBackground(this.f38900b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        int i10 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23279p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38900b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23223m6));
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
            this.f38901c = i10;
        } else {
            this.f38901c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f38902e = i12;
        this.f38903f = i12 + 1;
        this.h = i12 + 2;
        this.f38904n = i12 + 3;
        this.f38905r = i12 + 4;
        this.v = i12 + 6;
        this.f38906s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        gg0 gg0Var = this.f38899a;
        if (gg0Var != null) {
            gg0Var.l();
        }
    }
}
