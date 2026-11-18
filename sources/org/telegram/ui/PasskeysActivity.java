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
public class PasskeysActivity extends org.telegram.ui.ActionBar.h2 {
    public org.telegram.ui.Components.e51 f43149a;
    public int addPasskeyRow;
    public final ArrayList f43150b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f43150b = arrayList;
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131747439, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131747440, null);
                    org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.lc.b0(passkeysActivity).f0(str, true);
            }
        } else if (passkey != null) {
            org.telegram.messenger.mp.u1(passkeysActivity.currentAccount).s4(0L, "SETUP_PASSKEY");
            passkeysActivity.d0(passkey);
        }
    }

    public static void a0(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i7) {
        passkeysActivity.f43150b.remove(passkey);
        passkeysActivity.f43149a.f34607g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f28613id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new d3.b(1), new xf(passkeysActivity, i7, passkey, 2));
    }

    public static void b0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.l41 l41Var, View view) {
        if (l41Var.d == -1) {
            org.telegram.messenger.jt.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new pi0(passkeysActivity, 1));
        } else if (l41Var.H != null) {
            passkeysActivity.e0(view);
        }
    }

    public static void c0(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i7 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.i6 i6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f43150b.size() + 1 > ((org.telegram.messenger.j0) passkeysActivity.getMessagesController().A7.E.f15539b).f24767c) {
            z10 = false;
        }
        f0(i7, parentActivity, i6Var, z10);
    }

    public static void f0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, i6Var, false);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        j3.O = g10;
        ?? imageView = new ImageView(context);
        imageView.f(2131624114, org.telegram.messenger.g0.L(115.0f), org.telegram.messenger.g0.L(115.0f), null);
        imageView.d();
        g10.addView((View) imageView, c8.ma.t(115, 115, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.n6.f29504j5;
        TextView b10 = c8.va.b(context, 18.0f, i10, true, i6Var);
        org.telegram.messenger.f3.k(b10, 17, null, 2131747443);
        g10.addView(b10, c8.ma.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = c8.va.b(context, 14.0f, i10, false, i6Var);
        org.telegram.messenger.f3.k(b11, 17, null, 2131747444);
        g10.addView(b11, c8.ma.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        di.h0 h0Var = new di.h0(1, context, i6Var);
        h0Var.a(2131232034, org.telegram.messenger.gd.M0(2131747450, null), org.telegram.messenger.gd.M0(2131747451, null));
        g10.addView(h0Var, c8.ma.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var2 = new di.h0(1, context, i6Var);
        h0Var2.a(2131231794, org.telegram.messenger.gd.M0(2131747448, null), org.telegram.messenger.gd.M0(2131747449, null));
        g10.addView(h0Var2, c8.ma.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.h0 h0Var3 = new di.h0(1, context, i6Var);
        h0Var3.a(2131231861, org.telegram.messenger.gd.M0(2131747446, null), org.telegram.messenger.gd.M0(2131747447, null));
        g10.addView(h0Var3, c8.ma.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        g11.i(org.telegram.messenger.gd.M0(2131747445, null), false, true);
        g11.setOnClickListener(new fi.j5(g11, context, i7, j3, 4));
        if (z10) {
            g10.addView(g11, c8.ma.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        j3.O();
        j3.show();
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747458, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(this, new pi0(this, 0), new qi0(this, 0), null);
        this.f43149a = e51Var;
        e51Var.r1();
        this.f43149a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.e51 e51Var2 = this.f43149a;
        e51Var2.f34607g3.f42809r = false;
        frameLayout.addView(e51Var2, c8.ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.z41 z41Var;
        this.f43150b.add(passkey);
        org.telegram.ui.Components.e51 e51Var = this.f43149a;
        if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(true);
        }
        org.telegram.ui.Components.gc I = org.telegram.ui.Components.lc.b0(this).I(2131624113, org.telegram.messenger.gd.M0(2131747455, null), org.telegram.messenger.gd.a0(null, null, 2131747456, passkey.name));
        I.f35461j = 5000;
        I.k(true);
    }

    public final void e0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        si0 si0Var = (si0) viewParent;
        String str = si0Var.f52008w;
        int i7 = 0;
        while (true) {
            arrayList = this.f43150b;
            if (i7 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i7)).f28612id)) {
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
            org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, si0Var);
            I.c(2131232110, org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.Components.kp0(this, (TL_account.Passkey) arrayList.get(i10), str, i10, 13), true);
            I.X(this.f43149a.U0(si0Var, false));
            I.a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43149a;
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
