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
public final class kg0 extends org.telegram.ui.ActionBar.o2 {
    public jg0 f38911a;
    public org.telegram.ui.Components.lm0 f38912b;
    public int f38913c;
    public int d;
    public int e;
    public int f38914f;
    public int h;
    public int f38915n;
    public int f38916r;
    public int f38917s;
    public int v;

    public static void V(org.telegram.ui.kg0 r8, org.telegram.ui.ActionBar.c2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kg0.V(org.telegram.ui.kg0, org.telegram.ui.ActionBar.c2):void");
    }

    public static void W(kg0 kg0Var, int i10) {
        Integer num = null;
        if (i10 == kg0Var.f38913c) {
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
                kg0Var.presentFragment(new hg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                kg0Var.showDialog(new sg.j0(7, kg0Var.currentAccount, kg0Var.getParentActivity(), kg0Var, null));
            }
        } else if (i10 == kg0Var.d) {
            kg0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == kg0Var.e) {
            kg0Var.presentFragment(new c7());
        } else if (i10 == kg0Var.f38914f) {
            kg0Var.presentFragment(new g(3));
        } else if (i10 == kg0Var.h) {
            kg0Var.showDialog(org.telegram.ui.Components.d5.T(kg0Var, null));
        } else if (i10 == kg0Var.f38916r && kg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(kg0Var.getParentActivity(), 3, null);
            c2Var.r(500L);
            int i13 = kg0Var.currentAccount;
            f80 f80Var = new f80(28, kg0Var, c2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                f80Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new vg1(i13, f80Var, 2));
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21405p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
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
        this.f38911a = new jg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f38912b = lm0Var;
        lm0Var.setVerticalScrollBarEnabled(false);
        this.f38912b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f38912b, w7.z5.e(-1, -1, 51));
        this.f38912b.setAdapter(this.f38911a);
        this.f38912b.setOnItemClickListener(new ig0(this));
        this.f38912b.t1();
        this.actionBar.setAdaptiveBackground(this.f38912b);
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
            this.f38913c = i10;
        } else {
            this.f38913c = -1;
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
        this.f38914f = i12 + 1;
        this.h = i12 + 2;
        this.f38915n = i12 + 3;
        this.f38916r = i12 + 4;
        this.v = i12 + 6;
        this.f38917s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        jg0 jg0Var = this.f38911a;
        if (jg0Var != null) {
            jg0Var.l();
        }
    }
}
