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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class PasskeysActivity extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Components.g61 f31666a;
    public int addPasskeyRow;
    public final ArrayList f31667b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f31667b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    kf.k0.C(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.qc.a0(passkeysActivity).c0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f31667b.remove(passkey);
        passkeysActivity.f31666a.V2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f19363id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new gg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.i51 i51Var, View view) {
        if (i51Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new jl0(passkeysActivity, 1));
        } else if (i51Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.f6 f6Var = passkeysActivity.resourceProvider;
        boolean z4 = true;
        if (passkeysActivity.f31667b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z4 = false;
        }
        a0(i10, parentActivity, f6Var, z4);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        o10.customView = f10;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, k7.b6.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        TextView b10 = k7.f6.b(context, 18.0f, i11, true, f6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        f10.addView(b10, k7.b6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = k7.f6.b(context, 14.0f, i11, false, f6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        f10.addView(b11, k7.b6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        lh.e0 e0Var = new lh.e0(context, 1, f6Var);
        e0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        f10.addView(e0Var, k7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        lh.e0 e0Var2 = new lh.e0(context, 1, f6Var);
        e0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        f10.addView(e0Var2, k7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        lh.e0 e0Var3 = new lh.e0(context, 1, f6Var);
        e0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        f10.addView(e0Var3, k7.b6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        p10.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        p10.setOnClickListener(new nh.o5(p10, context, i10, o10, 4));
        if (z4) {
            f10.addView(p10, k7.b6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        o10.fixNavigationBar();
        o10.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.w51 w51Var;
        this.f31667b.add(passkey);
        org.telegram.ui.Components.g61 g61Var = this.f31666a;
        if (g61Var != null && (w51Var = g61Var.V2) != null) {
            w51Var.N(true);
        }
        org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f25671j = 5000;
        M.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        int i10;
        boolean z4 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z4) {
            viewParent = view.getParent();
        }
        nl0 nl0Var = (nl0) viewParent;
        String str = nl0Var.f36536r;
        int i11 = 0;
        while (true) {
            arrayList = this.f31667b;
            if (i11 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f19362id)) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && i10 < arrayList.size()) {
            TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i10);
            org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(this, nl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new et(this, passkey, str, i10, 6), true);
            H.W(this.f31666a.U0(nl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new jl0(this, 0), new kl0(this, 0), null);
        this.f31666a = g61Var;
        g61Var.o1();
        org.telegram.ui.Components.g61 g61Var2 = this.f31666a;
        g61Var2.V2.f30148r = false;
        frameLayout.addView(g61Var2, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f31666a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31666a.setPadding(0, 0, 0, i13);
        this.f31666a.setClipToPadding(false);
    }
}
