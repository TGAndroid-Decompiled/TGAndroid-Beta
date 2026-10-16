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
public final class dh0 extends org.telegram.ui.ActionBar.m2 {
    public ch0 f35018a;
    public org.telegram.ui.Components.mm0 f35019b;
    public int f35020c;
    public int d;
    public int e;
    public int f35021f;
    public int h;
    public int f35022n;
    public int f35023r;
    public int f35024s;
    public int v;

    public static void V(org.telegram.ui.dh0 r8, org.telegram.ui.ActionBar.a2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dh0.V(org.telegram.ui.dh0, org.telegram.ui.ActionBar.a2):void");
    }

    public static void W(dh0 dh0Var, int i10) {
        Integer num = null;
        if (i10 == dh0Var.f35020c) {
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
                dh0Var.presentFragment(new ah0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                dh0Var.showDialog(new sg.j0(7, dh0Var.currentAccount, dh0Var.getParentActivity(), dh0Var, null));
            }
        } else if (i10 == dh0Var.d) {
            dh0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == dh0Var.e) {
            dh0Var.presentFragment(new d7());
        } else if (i10 == dh0Var.f35021f) {
            dh0Var.presentFragment(new h(3));
        } else if (i10 == dh0Var.h) {
            dh0Var.showDialog(org.telegram.ui.Components.g5.T(dh0Var, null));
        } else if (i10 == dh0Var.f35023r && dh0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(dh0Var.getParentActivity(), 3, null);
            a2Var.q(500L);
            int i13 = dh0Var.currentAccount;
            se0 se0Var = new se0(10, dh0Var, a2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                se0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.i(i13, se0Var, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 8));
        this.f35018a = new ch0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35019b = mm0Var;
        mm0Var.setVerticalScrollBarEnabled(false);
        this.f35019b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35019b, w7.z5.e(-1, -1, 51));
        this.f35019b.setAdapter(this.f35018a);
        this.f35019b.setOnItemClickListener(new bh0(this));
        this.f35019b.p1();
        this.actionBar.setAdaptiveBackground(this.f35019b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        int i10 = org.telegram.ui.ActionBar.g6.f19563b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19822p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20005z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35019b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19764m6));
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
            this.f35020c = i10;
        } else {
            this.f35020c = -1;
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
        this.f35021f = i12 + 1;
        this.h = i12 + 2;
        this.f35022n = i12 + 3;
        this.f35023r = i12 + 4;
        this.v = i12 + 6;
        this.f35024s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ch0 ch0Var = this.f35018a;
        if (ch0Var != null) {
            ch0Var.l();
        }
    }
}
