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
public final class jg0 extends org.telegram.ui.ActionBar.r2 {
    public ig0 f40627a;
    public org.telegram.ui.Components.mm0 f40628b;
    public int f40629c;
    public int d;
    public int e;
    public int f40630f;
    public int h;
    public int f40631n;
    public int f40632r;
    public int f40633s;
    public int v;

    public static void V(org.telegram.ui.jg0 r8, org.telegram.ui.ActionBar.e2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jg0.V(org.telegram.ui.jg0, org.telegram.ui.ActionBar.e2):void");
    }

    public static void X(jg0 jg0Var, int i10) {
        Integer num = null;
        if (i10 == jg0Var.f40629c) {
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
                jg0Var.presentFragment(new gg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                jg0Var.showDialog(new tg.j0(7, jg0Var.currentAccount, jg0Var.getParentActivity(), jg0Var, null));
            }
        } else if (i10 == jg0Var.d) {
            jg0Var.presentFragment(PasscodeActivity.l0());
        } else if (i10 == jg0Var.e) {
            jg0Var.presentFragment(new c7());
        } else if (i10 == jg0Var.f40630f) {
            jg0Var.presentFragment(new g(3));
        } else if (i10 == jg0Var.h) {
            jg0Var.showDialog(org.telegram.ui.Components.g5.T(jg0Var, null));
        } else if (i10 == jg0Var.f40632r && jg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(jg0Var.getParentActivity(), 3, null);
            e2Var.r(500L);
            int i13 = jg0Var.currentAccount;
            wb0 wb0Var = new wb0(15, jg0Var, e2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                wb0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new wg1(i13, wb0Var));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23520m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23767z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23581p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 11));
        this.f40627a = new ig0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f40628b = mm0Var;
        mm0Var.setVerticalScrollBarEnabled(false);
        this.f40628b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f40628b, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        this.f40628b.setAdapter(this.f40627a);
        this.f40628b.setOnItemClickListener(new hg0(this));
        this.f40628b.u1();
        this.f40628b.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f40628b;
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
            this.f40629c = i10;
        } else {
            this.f40629c = -1;
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
        this.f40630f = i12 + 1;
        this.h = i12 + 2;
        this.f40631n = i12 + 3;
        this.f40632r = i12 + 4;
        this.v = i12 + 6;
        this.f40633s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ig0 ig0Var = this.f40627a;
        if (ig0Var != null) {
            ig0Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
