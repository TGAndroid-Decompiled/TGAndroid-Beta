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
public final class eh0 extends org.telegram.ui.ActionBar.m2 {
    public dh0 f35573a;
    public org.telegram.ui.Components.mm0 f35574b;
    public int f35575c;
    public int d;
    public int e;
    public int f35576f;
    public int h;
    public int f35577n;
    public int f35578r;
    public int f35579s;
    public int v;

    public static void V(org.telegram.ui.eh0 r8, org.telegram.ui.ActionBar.a2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eh0.V(org.telegram.ui.eh0, org.telegram.ui.ActionBar.a2):void");
    }

    public static void W(eh0 eh0Var, int i10) {
        Integer num = null;
        if (i10 == eh0Var.f35575c) {
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
                eh0Var.presentFragment(new bh0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                eh0Var.showDialog(new sg.j0(7, eh0Var.currentAccount, eh0Var.getParentActivity(), eh0Var, null));
            }
        } else if (i10 == eh0Var.d) {
            eh0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == eh0Var.e) {
            eh0Var.presentFragment(new d7());
        } else if (i10 == eh0Var.f35576f) {
            eh0Var.presentFragment(new h(3));
        } else if (i10 == eh0Var.h) {
            eh0Var.showDialog(org.telegram.ui.Components.g5.T(eh0Var, null));
        } else if (i10 == eh0Var.f35578r && eh0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(eh0Var.getParentActivity(), 3, null);
            a2Var.q(500L);
            int i13 = eh0Var.currentAccount;
            wc0 wc0Var = new wc0(15, eh0Var, a2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                wc0Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new li1(i13, wc0Var, 2));
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
        this.f35573a = new dh0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35574b = mm0Var;
        mm0Var.setVerticalScrollBarEnabled(false);
        this.f35574b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f35574b, w7.a6.e(-1, -1, 51));
        this.f35574b.setAdapter(this.f35573a);
        this.f35574b.setOnItemClickListener(new ch0(this));
        this.f35574b.p1();
        this.actionBar.setAdaptiveBackground(this.f35574b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        int i10 = org.telegram.ui.ActionBar.g6.f19863b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35574b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20064m6));
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
            this.f35575c = i10;
        } else {
            this.f35575c = -1;
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
        this.f35576f = i12 + 1;
        this.h = i12 + 2;
        this.f35577n = i12 + 3;
        this.f35578r = i12 + 4;
        this.v = i12 + 6;
        this.f35579s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        dh0 dh0Var = this.f35573a;
        if (dh0Var != null) {
            dh0Var.l();
        }
    }
}
