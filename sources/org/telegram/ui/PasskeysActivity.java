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
public class PasskeysActivity extends org.telegram.ui.ActionBar.k2 {
    public org.telegram.ui.Components.u51 f33427a;
    public int addPasskeyRow;
    public final ArrayList f33428b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f33428b = arrayList;
    }

    public static void Y(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131747648, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131747649, null);
                    i0.a.w(null, 2131747847, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.cc.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            org.telegram.messenger.vp.r1(passkeysActivity.currentAccount).h4(0L, "SETUP_PASSKEY");
            passkeysActivity.c0(passkey);
        }
    }

    public static void Z(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f33428b.remove(passkey);
        passkeysActivity.f33427a.f30819f3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f20000id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new a3.b(1), new ng(passkeysActivity, i10, passkey, 2));
    }

    public static void a0(PasskeysActivity passkeysActivity, org.telegram.ui.Components.a51 a51Var, View view) {
        if (a51Var.d == -1) {
            org.telegram.messenger.au.b(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), new sj0(passkeysActivity, 1));
        } else if (a51Var.G != null) {
            passkeysActivity.d0(view);
        }
    }

    public static void b0(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.p6 p6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f33428b.size() + 1 > ((org.telegram.messenger.l0) passkeysActivity.getMessagesController().f18957y7.f17859z.f10700a).f16658c) {
            z10 = false;
        }
        e0(i10, parentActivity, p6Var, z10);
    }

    public static void e0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        k10.N = f7;
        ?? imageView = new ImageView(context);
        imageView.f(2131624111, org.telegram.messenger.i0.L(115.0f), org.telegram.messenger.i0.L(115.0f), null);
        imageView.d();
        f7.addView((View) imageView, w7.b6.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        TextView b10 = w7.g6.b(context, 18.0f, i11, true, p6Var);
        org.telegram.messenger.m5.l(b10, 17, null, 2131747652);
        f7.addView(b10, w7.b6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.g6.b(context, 14.0f, i11, false, p6Var);
        org.telegram.messenger.m5.l(b11, 17, null, 2131747653);
        f7.addView(b11, w7.b6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        rh.v vVar = new rh.v(1, context, p6Var);
        vVar.a(2131232032, org.telegram.messenger.cd.L0(2131747659, null), org.telegram.messenger.cd.L0(2131747660, null));
        f7.addView(vVar, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        rh.v vVar2 = new rh.v(1, context, p6Var);
        vVar2.a(2131231792, org.telegram.messenger.cd.L0(2131747657, null), org.telegram.messenger.cd.L0(2131747658, null));
        f7.addView(vVar2, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        rh.v vVar3 = new rh.v(1, context, p6Var);
        vVar3.a(2131231859, org.telegram.messenger.cd.L0(2131747655, null), org.telegram.messenger.cd.L0(2131747656, null));
        f7.addView(vVar3, w7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        vh.d i12 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        i12.i(org.telegram.messenger.cd.L0(2131747654, null), false, true);
        i12.setOnClickListener(new ya(i12, context, i10, k10, 3));
        if (z10) {
            f7.addView(i12, w7.b6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        k10.O();
        k10.show();
    }

    public final void c0(TL_account.Passkey passkey) {
        org.telegram.ui.Components.p51 p51Var;
        this.f33428b.add(passkey);
        org.telegram.ui.Components.u51 u51Var = this.f33427a;
        if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
            p51Var.O(true);
        }
        org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(this).I(2131624110, org.telegram.messenger.cd.L0(2131747664, null), org.telegram.messenger.cd.a0(null, null, 2131747665, passkey.name));
        I.f32135j = 5000;
        I.k(true);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131747667, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new sj0(this, 0), new tj0(this, 0), null);
        this.f33427a = u51Var;
        u51Var.r1();
        this.f33427a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.u51 u51Var2 = this.f33427a;
        u51Var2.f30819f3.f29295r = false;
        frameLayout.addView(u51Var2, w7.b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        vj0 vj0Var = (vj0) viewParent;
        String str = vj0Var.f42762w;
        int i10 = 0;
        while (true) {
            arrayList = this.f33428b;
            if (i10 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i10)).f19999id)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        int i11 = i10;
        if (i11 >= 0 && i11 < arrayList.size()) {
            org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(this, vj0Var);
            H.c(2131232107, org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.Components.c11(this, (TL_account.Passkey) arrayList.get(i11), str, i11, 7), true);
            H.W(this.f33427a.U0(vj0Var, false));
            H.Z();
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33427a;
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
