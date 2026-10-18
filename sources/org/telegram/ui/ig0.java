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
public final class ig0 extends org.telegram.ui.ActionBar.n2 {
    public hg0 f37895a;
    public org.telegram.ui.Components.im0 f37896b;
    public int f37897c;
    public int d;
    public int e;
    public int f37898f;
    public int h;
    public int f37899n;
    public int f37900r;
    public int f37901s;
    public int v;

    public static void V(org.telegram.ui.ig0 r8, org.telegram.ui.ActionBar.b2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig0.V(org.telegram.ui.ig0, org.telegram.ui.ActionBar.b2):void");
    }

    public static void W(ig0 ig0Var, int i10) {
        Integer num = null;
        if (i10 == ig0Var.f37897c) {
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
                ig0Var.presentFragment(new fg0(num.intValue()));
            } else if (!UserConfig.hasPremiumOnAccounts()) {
                ig0Var.showDialog(new sg.j0(7, ig0Var.currentAccount, ig0Var.getParentActivity(), ig0Var, null));
            }
        } else if (i10 == ig0Var.d) {
            ig0Var.presentFragment(PasscodeActivity.e0());
        } else if (i10 == ig0Var.e) {
            ig0Var.presentFragment(new c7());
        } else if (i10 == ig0Var.f37898f) {
            ig0Var.presentFragment(new h(3));
        } else if (i10 == ig0Var.h) {
            ig0Var.showDialog(org.telegram.ui.Components.f5.T(ig0Var, null));
        } else if (i10 == ig0Var.f37900r && ig0Var.getParentActivity() != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ig0Var.getParentActivity(), 3, null);
            b2Var.q(500L);
            int i13 = ig0Var.currentAccount;
            b80 b80Var = new b80(28, ig0Var, b2Var);
            if (!MessagesController.getInstance(i13).config.walletAvailable.get()) {
                b80Var.run();
            } else {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.j(i13, b80Var, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 9));
        this.f37895a = new hg0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f37896b = im0Var;
        im0Var.setVerticalScrollBarEnabled(false);
        this.f37896b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f37896b, w7.z5.e(-1, -1, 51));
        this.f37896b.setAdapter(this.f37895a);
        this.f37896b.setOnItemClickListener(new gg0(this));
        this.f37896b.p1();
        this.actionBar.setAdaptiveBackground(this.f37896b);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.c9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20935a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21272s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21082i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21114k0, null, null, org.telegram.ui.ActionBar.h6.f20994d7));
        int i10 = org.telegram.ui.ActionBar.h6.f20955b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21214p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21398z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37896b, 0, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21156m6));
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
            this.f37897c = i10;
        } else {
            this.f37897c = -1;
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
        this.f37898f = i12 + 1;
        this.h = i12 + 2;
        this.f37899n = i12 + 3;
        this.f37900r = i12 + 4;
        this.v = i12 + 6;
        this.f37901s = i12 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        hg0 hg0Var = this.f37895a;
        if (hg0Var != null) {
            hg0Var.l();
        }
    }
}
