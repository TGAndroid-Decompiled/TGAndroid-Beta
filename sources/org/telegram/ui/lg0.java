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
public final class lg0 extends org.telegram.ui.ActionBar.o2 {
    public kg0 f39240a;
    public org.telegram.ui.Components.mm0 f39241b;
    public int f39242c;
    public int d;
    public int e;
    public int f39243f;
    public int h;
    public int f39244n;
    public int f39245r;
    public int f39246s;
    public int v;

    public static void V(org.telegram.ui.lg0 r8, org.telegram.ui.ActionBar.c2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lg0.V(org.telegram.ui.lg0, org.telegram.ui.ActionBar.c2):void");
    }

    public static void W(lg0 lg0Var, int i10) {
        Integer num = null;
        if (i10 == lg0Var.f39242c) {
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
                lg0Var.showDialog(new sg.j0(7, lg0Var.currentAccount, lg0Var.getParentActivity(), lg0Var, null));
            }
        } else if (i10 == lg0Var.d) {
            lg0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == lg0Var.e) {
            lg0Var.presentFragment(new c7());
        } else if (i10 == lg0Var.f39243f) {
            lg0Var.presentFragment(new g(3));
        } else if (i10 == lg0Var.h) {
            lg0Var.showDialog(org.telegram.ui.Components.f5.U(lg0Var, null));
        } else if (i10 == lg0Var.f39245r && lg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(lg0Var.getParentActivity(), 3, null);
            c2Var.r(500L);
            int i13 = lg0Var.currentAccount;
            f80 f80Var = new f80(28, lg0Var, c2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                f80Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new wg1(i13, f80Var, 2));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21346m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21588z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21145b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21404p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21183d6));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 9));
        this.f39240a = new kg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39241b = mm0Var;
        mm0Var.setVerticalScrollBarEnabled(false);
        this.f39241b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f39241b, w7.z5.e(-1, -1, 51));
        this.f39241b.setAdapter(this.f39240a);
        this.f39241b.setOnItemClickListener(new jg0(this));
        this.f39241b.t1();
        this.actionBar.setAdaptiveBackground(this.f39241b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
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
            this.f39242c = i10;
        } else {
            this.f39242c = -1;
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
        this.f39243f = i12 + 1;
        this.h = i12 + 2;
        this.f39244n = i12 + 3;
        this.f39245r = i12 + 4;
        this.v = i12 + 6;
        this.f39246s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        kg0 kg0Var = this.f39240a;
        if (kg0Var != null) {
            kg0Var.l();
        }
    }
}
