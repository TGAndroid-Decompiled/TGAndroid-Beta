package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class lg0 extends org.telegram.ui.ActionBar.r2 {
    public kg0 f41143a;
    public org.telegram.ui.Components.nm0 f41144b;
    public int f41145c;
    public int d;
    public int e;
    public int f41146f;
    public int h;
    public int f41147n;
    public int f41148r;
    public int f41149s;
    public int v;

    public static void V(org.telegram.ui.lg0 r8, org.telegram.ui.ActionBar.e2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lg0.V(org.telegram.ui.lg0, org.telegram.ui.ActionBar.e2):void");
    }

    public static void X(lg0 lg0Var, int i10) {
        Integer num = null;
        if (i10 == lg0Var.f41145c) {
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
                lg0Var.presentFragment(new ig0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                lg0Var.showDialog(new tg.j0(7, lg0Var.currentAccount, lg0Var.getParentActivity(), lg0Var, null));
            }
        } else if (i10 == lg0Var.d) {
            lg0Var.presentFragment(PasscodeActivity.l0());
        } else if (i10 == lg0Var.e) {
            lg0Var.presentFragment(new c7());
        } else if (i10 == lg0Var.f41146f) {
            lg0Var.presentFragment(new g(3));
        } else if (i10 == lg0Var.h) {
            lg0Var.showDialog(org.telegram.ui.Components.g5.T(lg0Var, null));
        } else if (i10 == lg0Var.f41148r && lg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(lg0Var.getParentActivity(), 3, null);
            e2Var.r(500L);
            int i13 = lg0Var.currentAccount;
            kb0 kb0Var = new kb0(16, lg0Var, e2Var);
            org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                kb0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new yg1(i13, kb0Var));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23582p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 11));
        this.f41143a = new kg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f41144b = nm0Var;
        nm0Var.setVerticalScrollBarEnabled(false);
        this.f41144b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f41144b, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        this.f41144b.setAdapter(this.f41143a);
        this.f41144b.setOnItemClickListener(new jg0(this));
        this.f41144b.u1();
        this.f41144b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f41144b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
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
            this.f41145c = i10;
        } else {
            this.f41145c = -1;
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
        this.f41146f = i12 + 1;
        this.h = i12 + 2;
        this.f41147n = i12 + 3;
        this.f41148r = i12 + 4;
        this.v = i12 + 6;
        this.f41149s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        kg0 kg0Var = this.f41143a;
        if (kg0Var != null) {
            kg0Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
