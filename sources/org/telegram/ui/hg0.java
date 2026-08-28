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
    public gg0 f38778a;
    public org.telegram.ui.Components.wk0 f38779b;
    public int f38780c;
    public int d;
    public int f38781e;
    public int f38782f;
    public int h;
    public int f38783n;
    public int f38784r;
    public int f38785s;
    public int v;

    public static void T(hg0 hg0Var, int i9) {
        int i10 = 0;
        Integer num = null;
        if (i9 == hg0Var.f38780c) {
            for (int i11 = 3; i11 >= 0; i11--) {
                if (!UserConfig.getInstance(i11).isClientActivated()) {
                    i10++;
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i10--;
            }
            if (i10 > 0 && num != null) {
                hg0Var.presentFragment(new fg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                hg0Var.showDialog(new zf.j0(7, hg0Var.currentAccount, hg0Var.getParentActivity(), hg0Var, null));
            }
        } else if (i9 == hg0Var.d) {
            hg0Var.presentFragment(PasscodeActivity.a0());
        } else if (i9 == hg0Var.f38781e) {
            hg0Var.presentFragment(new y6());
        } else if (i9 == hg0Var.f38782f) {
            hg0Var.presentFragment(new h(3));
        } else if (i9 == hg0Var.h) {
            hg0Var.showDialog(org.telegram.ui.Components.y4.U(hg0Var, null));
        } else if (i9 == hg0Var.f38784r && hg0Var.getParentActivity() != null) {
            Activity parentActivity = hg0Var.getParentActivity();
            int i12 = hg0Var.currentAccount;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AreYouSureLogout);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.LogOut);
            alertDialog$Builder.k(LocaleController.getString(R.string.LogOut), new h3.x(i12, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
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
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 1));
        this.f38778a = new gg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f38779b = wk0Var;
        wk0Var.setVerticalScrollBarEnabled(false);
        this.f38779b.setLayoutManager(new f2.m0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f38779b, g7.e6.e(-1, -1, 51));
        this.f38779b.setAdapter(this.f38778a);
        this.f38779b.setOnItemClickListener(new wt(this, 21));
        this.f38779b.p1();
        this.actionBar.setAdaptiveBackground(this.f38779b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i9 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38779b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23162m6));
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
            int i9 = this.v;
            this.v = i9 + 1;
            this.f38780c = i9;
        } else {
            this.f38780c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i10 = this.v;
            this.v = i10 + 1;
            this.d = i10;
        } else {
            this.d = -1;
        }
        int i11 = this.v;
        this.f38781e = i11;
        this.f38782f = i11 + 1;
        this.h = i11 + 2;
        this.f38783n = i11 + 3;
        this.f38784r = i11 + 4;
        this.v = i11 + 6;
        this.f38785s = i11 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        gg0 gg0Var = this.f38778a;
        if (gg0Var != null) {
            gg0Var.l();
        }
    }
}
