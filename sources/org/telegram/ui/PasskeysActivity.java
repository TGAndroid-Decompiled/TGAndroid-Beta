package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class PasskeysActivity extends org.telegram.ui.ActionBar.e2 {
    public org.telegram.ui.Components.u41 f42704a;
    public int addPasskeyRow;
    public final ArrayList f42705b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f42705b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131747632, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131747633, null);
                    i5.c.C(null, 2131747831, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.cc.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            org.telegram.messenger.np.s1(passkeysActivity.currentAccount).k4(0L, "SETUP_PASSKEY");
            passkeysActivity.d0(passkey);
        }
    }

    public static void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i7) {
        passkeysActivity.f42705b.remove(passkey);
        passkeysActivity.f42704a.f39892g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f28259id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new d3.b(1), new vf(passkeysActivity, i7, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.b41 b41Var, View view) {
        if (b41Var.d == -1) {
            org.telegram.messenger.mt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new mi0(passkeysActivity, 1));
        } else if (b41Var.G != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i7 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.e6 e6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f42705b.size() + 1 > ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f25451y7.f25873z.f15881b).f24498c) {
            z10 = false;
        }
        f0(i7, parentActivity, e6Var, z10);
    }

    public static void f0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        k10.O = f10;
        ?? imageView = new ImageView(context);
        imageView.f(2131624114, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, c8.ja.t(115, 115, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        TextView b10 = c8.sa.b(context, 18.0f, i10, true, e6Var);
        org.telegram.messenger.k5.l(b10, 17, null, 2131747636);
        f10.addView(b10, c8.ja.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = c8.sa.b(context, 14.0f, i10, false, e6Var);
        org.telegram.messenger.k5.l(b11, 17, null, 2131747637);
        f10.addView(b11, c8.ja.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        di.h0 h0Var = new di.h0(1, context, e6Var);
        h0Var.a(2131232033, org.telegram.messenger.hd.M0(2131747643, null), org.telegram.messenger.hd.M0(2131747644, null));
        f10.addView(h0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var2 = new di.h0(1, context, e6Var);
        h0Var2.a(2131231793, org.telegram.messenger.hd.M0(2131747641, null), org.telegram.messenger.hd.M0(2131747642, null));
        f10.addView(h0Var2, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var3 = new di.h0(1, context, e6Var);
        h0Var3.a(2131231860, org.telegram.messenger.hd.M0(2131747639, null), org.telegram.messenger.hd.M0(2131747640, null));
        f10.addView(h0Var3, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        g10.i(org.telegram.messenger.hd.M0(2131747638, null), false, true);
        g10.setOnClickListener(new fi.l5(g10, context, i7, k10, 4));
        if (z10) {
            f10.addView(g10, c8.ja.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        k10.O();
        k10.show();
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747651, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(this, new mi0(this, 0), new ni0(this, 0), null);
        this.f42704a = u41Var;
        u41Var.r1();
        this.f42704a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.u41 u41Var2 = this.f42704a;
        u41Var2.f39892g3.f38199r = false;
        frameLayout.addView(u41Var2, c8.ja.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.p41 p41Var;
        this.f42705b.add(passkey);
        org.telegram.ui.Components.u41 u41Var = this.f42704a;
        if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
            p41Var.O(true);
        }
        org.telegram.ui.Components.xb I = org.telegram.ui.Components.cc.a0(this).I(2131624113, org.telegram.messenger.hd.M0(2131747648, null), org.telegram.messenger.hd.a0(null, null, 2131747649, passkey.name));
        I.f41635j = 5000;
        I.k(true);
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        pi0 pi0Var = (pi0) viewParent;
        String str = pi0Var.f50277w;
        int i7 = 0;
        while (true) {
            arrayList = this.f42705b;
            if (i7 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i7)).f28258id)) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        int i10 = i7;
        if (i10 >= 0 && i10 < arrayList.size()) {
            org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(this, pi0Var);
            H.c(2131232109, org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.Components.sp0(this, (TL_account.Passkey) arrayList.get(i10), str, i10, 12), true);
            H.W(this.f42704a.U0(pi0Var, false));
            H.Z();
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f42704a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
