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
public final class gg0 extends org.telegram.ui.ActionBar.n2 {
    public fg0 f37320a;
    public org.telegram.ui.Components.jm0 f37321b;
    public int f37322c;
    public int d;
    public int e;
    public int f37323f;
    public int h;
    public int f37324n;
    public int f37325r;
    public int f37326s;
    public int v;

    public static void V(org.telegram.ui.gg0 r8, org.telegram.ui.ActionBar.b2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gg0.V(org.telegram.ui.gg0, org.telegram.ui.ActionBar.b2):void");
    }

    public static void W(gg0 gg0Var, int i10) {
        Integer num = null;
        if (i10 == gg0Var.f37322c) {
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
                gg0Var.presentFragment(new dg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                gg0Var.showDialog(new sg.k0(7, gg0Var.currentAccount, gg0Var.getParentActivity(), gg0Var, null));
            }
        } else if (i10 == gg0Var.d) {
            gg0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == gg0Var.e) {
            gg0Var.presentFragment(new c7());
        } else if (i10 == gg0Var.f37323f) {
            gg0Var.presentFragment(new h(3));
        } else if (i10 == gg0Var.h) {
            gg0Var.showDialog(org.telegram.ui.Components.f5.T(gg0Var, null));
        } else if (i10 == gg0Var.f37325r && gg0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(gg0Var.getParentActivity(), 3, null);
            b2Var.r(500L);
            int i13 = gg0Var.currentAccount;
            z70 z70Var = new z70(28, gg0Var, b2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                z70Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.j(i13, z70Var, 1));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 9));
        this.f37320a = new fg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20936a7, false));
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f37321b = jm0Var;
        jm0Var.setVerticalScrollBarEnabled(false);
        this.f37321b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37321b, w7.z5.e(-1, -1, 51));
        this.f37321b.setAdapter(this.f37320a);
        this.f37321b.setOnItemClickListener(new eg0(this));
        this.f37321b.p1();
        this.actionBar.setAdaptiveBackground(this.f37321b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.c9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20994d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21083i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21115k0, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        int i10 = org.telegram.ui.ActionBar.h6.f20956b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21215p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21399z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37321b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21157m6));
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
            this.f37322c = i10;
        } else {
            this.f37322c = -1;
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
        this.f37323f = i12 + 1;
        this.h = i12 + 2;
        this.f37324n = i12 + 3;
        this.f37325r = i12 + 4;
        this.v = i12 + 6;
        this.f37326s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg0 fg0Var = this.f37320a;
        if (fg0Var != null) {
            fg0Var.l();
        }
    }
}
