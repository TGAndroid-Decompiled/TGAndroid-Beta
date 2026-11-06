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
public class PasskeysActivity extends org.telegram.ui.ActionBar.f2 {
    public org.telegram.ui.Components.q41 f41332a;
    public int addPasskeyRow;
    public final ArrayList f41333b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f41333b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131747631, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131747632, null);
                    jg.g.C(null, 2131747830, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.hc.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            org.telegram.messenger.qp.s1(passkeysActivity.currentAccount).k4(0L, "SETUP_PASSKEY");
            passkeysActivity.d0(passkey);
        }
    }

    public static void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i7) {
        passkeysActivity.f41333b.remove(passkey);
        passkeysActivity.f41332a.f37160f3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f27161id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new d3.b(1), new ag(passkeysActivity, i7, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.x31 x31Var, View view) {
        if (x31Var.d == -1) {
            org.telegram.messenger.pt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new ki0(passkeysActivity, 1));
        } else if (x31Var.G != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i7 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.f6 f6Var = passkeysActivity.resourceProvider;
        boolean z9 = true;
        if (passkeysActivity.f41333b.size() + 1 > ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f24935x7.f24461z.f13555b).f23439c) {
            z9 = false;
        }
        f0(i7, parentActivity, f6Var, z9);
    }

    public static void f0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        l10.N = f10;
        ?? imageView = new ImageView(context);
        imageView.f(2131624113, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, c8.ha.t(115, 115, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.k6.f27957j5;
        TextView b10 = c8.qa.b(context, 18.0f, i10, true, f6Var);
        org.telegram.messenger.k5.m(b10, 17, null, 2131747635);
        f10.addView(b10, c8.ha.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = c8.qa.b(context, 14.0f, i10, false, f6Var);
        org.telegram.messenger.k5.m(b11, 17, null, 2131747636);
        f10.addView(b11, c8.ha.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        bi.q0 q0Var = new bi.q0(1, context, f6Var);
        q0Var.a(2131232033, org.telegram.messenger.hd.M0(2131747642, null), org.telegram.messenger.hd.M0(2131747643, null));
        f10.addView(q0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        bi.q0 q0Var2 = new bi.q0(1, context, f6Var);
        q0Var2.a(2131231793, org.telegram.messenger.hd.M0(2131747640, null), org.telegram.messenger.hd.M0(2131747641, null));
        f10.addView(q0Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        bi.q0 q0Var3 = new bi.q0(1, context, f6Var);
        q0Var3.a(2131231860, org.telegram.messenger.hd.M0(2131747638, null), org.telegram.messenger.hd.M0(2131747639, null));
        f10.addView(q0Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.i(org.telegram.messenger.hd.M0(2131747637, null), false, true);
        h.setOnClickListener(new di.t5(h, context, i7, l10, 4));
        if (z9) {
            f10.addView(h, c8.ha.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        l10.N();
        l10.show();
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747650, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 21));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.q41 q41Var = new org.telegram.ui.Components.q41(this, new ki0(this, 0), new li0(this, 0), null);
        this.f41332a = q41Var;
        q41Var.r1();
        this.f41332a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.q41 q41Var2 = this.f41332a;
        q41Var2.f37160f3.f35510r = false;
        frameLayout.addView(q41Var2, c8.ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.l41 l41Var;
        this.f41333b.add(passkey);
        org.telegram.ui.Components.q41 q41Var = this.f41332a;
        if (q41Var != null && (l41Var = q41Var.f37160f3) != null) {
            l41Var.O(true);
        }
        org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(this).I(2131624112, org.telegram.messenger.hd.M0(2131747647, null), org.telegram.messenger.hd.a0(null, null, 2131747648, passkey.name));
        I.f32514j = 5000;
        I.k(true);
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z9 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z9) {
            viewParent = view.getParent();
        }
        ni0 ni0Var = (ni0) viewParent;
        String str = ni0Var.f48055w;
        int i7 = 0;
        while (true) {
            arrayList = this.f41333b;
            if (i7 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i7)).f27160id)) {
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
            org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(this, ni0Var);
            H.c(2131232108, org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.Components.pp0(this, (TL_account.Passkey) arrayList.get(i10), str, i10, 12), true);
            H.W(this.f41332a.U0(ni0Var, false));
            H.Z();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41332a;
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
