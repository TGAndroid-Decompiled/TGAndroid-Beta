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
    public org.telegram.ui.Components.h61 f34217a;
    public int addPasskeyRow;
    public final ArrayList f34218b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f34218b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    l.d.C(R.string.OK, alertDialog$Builder, null);
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
        passkeysActivity.f34218b.remove(passkey);
        passkeysActivity.f34217a.V2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f21051id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new eg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.h51 h51Var, View view) {
        if (h51Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new jl0(passkeysActivity, 1));
        } else if (h51Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.g6 g6Var = passkeysActivity.resourceProvider;
        boolean z4 = true;
        if (passkeysActivity.f34218b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z4 = false;
        }
        a0(i10, parentActivity, g6Var, z4);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        o10.customView = f10;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, k7.c6.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
        TextView b10 = k7.g6.b(context, 18.0f, i11, true, g6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        f10.addView(b10, k7.c6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = k7.g6.b(context, 14.0f, i11, false, g6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        f10.addView(b11, k7.c6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        mh.d0 d0Var = new mh.d0(context, 1, g6Var);
        d0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        f10.addView(d0Var, k7.c6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        mh.d0 d0Var2 = new mh.d0(context, 1, g6Var);
        d0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        f10.addView(d0Var2, k7.c6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        mh.d0 d0Var3 = new mh.d0(context, 1, g6Var);
        d0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        f10.addView(d0Var3, k7.c6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        p10.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        p10.setOnClickListener(new oh.o5(p10, context, i10, o10, 4));
        if (z4) {
            f10.addView(p10, k7.c6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        o10.fixNavigationBar();
        o10.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.w51 w51Var;
        this.f34218b.add(passkey);
        org.telegram.ui.Components.h61 h61Var = this.f34217a;
        if (h61Var != null && (w51Var = h61Var.V2) != null) {
            w51Var.N(true);
        }
        org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f27778j = 5000;
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
        String str = nl0Var.f39400r;
        int i11 = 0;
        while (true) {
            arrayList = this.f34218b;
            if (i11 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f21050id)) {
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
            org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, nl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new dt(this, passkey, str, i10, 6), true);
            H.W(this.f34217a.U0(nl0Var, false));
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(this, new jl0(this, 0), new kl0(this, 0), null);
        this.f34217a = h61Var;
        h61Var.o1();
        org.telegram.ui.Components.h61 h61Var2 = this.f34217a;
        h61Var2.V2.f32651r = false;
        frameLayout.addView(h61Var2, k7.c6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f34217a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34217a.setPadding(0, 0, 0, i13);
        this.f34217a.setClipToPadding(false);
    }
}
