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
public class PasskeysActivity extends org.telegram.ui.ActionBar.d2 {
    public org.telegram.ui.Components.l41 f41365a;
    public int addPasskeyRow;
    public final ArrayList f41366b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f41366b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131747640, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131747641, null);
                    k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.fc.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            org.telegram.messenger.hp.s1(passkeysActivity.currentAccount).k4(0L, "SETUP_PASSKEY");
            passkeysActivity.d0(passkey);
        }
    }

    public static void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i3) {
        passkeysActivity.f41366b.remove(passkey);
        passkeysActivity.f41365a.f35594g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f27209id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new c3.b(1), new wf(passkeysActivity, i3, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.r31 r31Var, View view) {
        if (r31Var.d == -1) {
            org.telegram.messenger.gt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new ii0(passkeysActivity, 1));
        } else if (r31Var.G != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i3 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.e6 e6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f41366b.size() + 1 > ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().f23167x7.f24680z.f13798b).f23620c) {
            z10 = false;
        }
        f0(i3, parentActivity, e6Var, z10);
    }

    public static void f0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        l10.O = f10;
        ?? imageView = new ImageView(context);
        imageView.f(2131624113, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, b8.mf.t(115, 115, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        TextView b10 = b8.rf.b(context, 18.0f, i10, true, e6Var);
        org.telegram.messenger.k5.m(b10, 17, null, 2131747644);
        f10.addView(b10, b8.mf.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = b8.rf.b(context, 14.0f, i10, false, e6Var);
        org.telegram.messenger.k5.m(b11, 17, null, 2131747645);
        f10.addView(b11, b8.mf.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        ci.l0 l0Var = new ci.l0(1, context, e6Var);
        l0Var.a(2131232033, org.telegram.messenger.bd.M0(2131747651, null), org.telegram.messenger.bd.M0(2131747652, null));
        f10.addView(l0Var, b8.mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ci.l0 l0Var2 = new ci.l0(1, context, e6Var);
        l0Var2.a(2131231793, org.telegram.messenger.bd.M0(2131747649, null), org.telegram.messenger.bd.M0(2131747650, null));
        f10.addView(l0Var2, b8.mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ci.l0 l0Var3 = new ci.l0(1, context, e6Var);
        l0Var3.a(2131231860, org.telegram.messenger.bd.M0(2131747647, null), org.telegram.messenger.bd.M0(2131747648, null));
        f10.addView(l0Var3, b8.mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.i(org.telegram.messenger.bd.M0(2131747646, null), false, true);
        h.setOnClickListener(new ei.t5(h, context, i3, l10, 4));
        if (z10) {
            f10.addView(h, b8.mf.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        l10.N();
        l10.show();
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747659, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(this, new ii0(this, 0), new ci0(this, 1), null);
        this.f41365a = l41Var;
        l41Var.r1();
        this.f41365a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.l41 l41Var2 = this.f41365a;
        l41Var2.f35594g3.f33698r = false;
        frameLayout.addView(l41Var2, b8.mf.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.f41 f41Var;
        this.f41366b.add(passkey);
        org.telegram.ui.Components.l41 l41Var = this.f41365a;
        if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(true);
        }
        org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(this).I(2131624112, org.telegram.messenger.bd.M0(2131747656, null), org.telegram.messenger.bd.a0(null, null, 2131747657, passkey.name));
        I.f31792j = 5000;
        I.k(true);
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        ki0 ki0Var = (ki0) viewParent;
        String str = ki0Var.f46959w;
        int i3 = 0;
        while (true) {
            arrayList = this.f41366b;
            if (i3 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i3)).f27208id)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        int i10 = i3;
        if (i10 >= 0 && i10 < arrayList.size()) {
            org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(this, ki0Var);
            H.c(2131232108, org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.zo0(this, (TL_account.Passkey) arrayList.get(i10), str, i10, 13), true);
            H.W(this.f41365a.U0(ki0Var, false));
            H.Z();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41365a;
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
