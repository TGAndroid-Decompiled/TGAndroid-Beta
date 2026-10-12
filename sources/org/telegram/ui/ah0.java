package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ah0 extends org.telegram.ui.ActionBar.m2 {
    public zg0 f35802a;
    public org.telegram.ui.Components.wm0 f35803b;
    public int f35804c;
    public int d;
    public int f35805e;
    public int f35806f;
    public int h;
    public int f35807n;
    public int f35808r;
    public int f35809s;
    public int v;

    public static void V(org.telegram.ui.ah0 r8, org.telegram.ui.ActionBar.a2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ah0.V(org.telegram.ui.ah0, org.telegram.ui.ActionBar.a2):void");
    }

    public static void W(ah0 ah0Var, int i10) {
        Integer num = null;
        if (i10 == ah0Var.f35804c) {
            int i11 = 0;
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
                ah0Var.presentFragment(new xg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                ah0Var.showDialog(new rg.j0(7, ah0Var.currentAccount, ah0Var.getParentActivity(), ah0Var, null));
            }
        } else if (i10 == ah0Var.d) {
            ah0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == ah0Var.f35805e) {
            ah0Var.presentFragment(new b7());
        } else if (i10 == ah0Var.f35806f) {
            ah0Var.presentFragment(new h(3));
        } else if (i10 == ah0Var.h) {
            ah0Var.showDialog(org.telegram.ui.Components.g5.T(ah0Var, null));
        } else if (i10 == ah0Var.f35808r && ah0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ah0Var.getParentActivity(), 3, null);
            a2Var.q(500L);
            int i13 = ah0Var.currentAccount;
            og0 og0Var = new og0(1, ah0Var, a2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                og0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.i(i13, og0Var, 1));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 7));
        this.f35802a = new zg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20503a7, false));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f35803b = wm0Var;
        wm0Var.setVerticalScrollBarEnabled(false);
        this.f35803b.setLayoutManager(new s4.d0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35803b, w7.w5.e(-1, -1, 51));
        this.f35803b.setAdapter(this.f35802a);
        this.f35803b.setOnItemClickListener(new yg0(this));
        this.f35803b.p1();
        this.actionBar.setAdaptiveBackground(this.f35803b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20559d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20503a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20839s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20894v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20858t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        int i10 = org.telegram.ui.ActionBar.h6.f20523b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20780p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20963z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35803b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20724m6));
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
            this.f35804c = i10;
        } else {
            this.f35804c = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i11 = this.v;
            this.v = i11 + 1;
            this.d = i11;
        } else {
            this.d = -1;
        }
        int i12 = this.v;
        this.f35805e = i12;
        this.f35806f = i12 + 1;
        this.h = i12 + 2;
        this.f35807n = i12 + 3;
        this.f35808r = i12 + 4;
        this.v = i12 + 6;
        this.f35809s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zg0 zg0Var = this.f35802a;
        if (zg0Var != null) {
            zg0Var.l();
        }
    }
}
