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
public class PasskeysActivity extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.i51 f35576a;
    public int addPasskeyRow;
    public final ArrayList f35577b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f35577b = arrayList;
    }

    public static void T(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.oc.a0(passkeysActivity).c0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.X(passkey);
        }
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i9) {
        passkeysActivity.f35577b.remove(passkey);
        passkeysActivity.f35576a.U2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f22586id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new ag(passkeysActivity, i9, passkey, 2));
    }

    public static void V(PasskeysActivity passkeysActivity, org.telegram.ui.Components.l41 l41Var, View view) {
        if (l41Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new cl0(passkeysActivity, 1));
        } else if (l41Var.G != null) {
            passkeysActivity.Y(view);
        }
    }

    public static void W(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i9 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.b6 b6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f35577b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        Z(i9, parentActivity, b6Var, z10);
    }

    public static void Z(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        j10.customView = f10;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f10.addView((View) imageView, g7.e6.t(115, 115, 17, 0, 0, 0, 9));
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        TextView b10 = g7.i6.b(context, 18.0f, i10, true, b6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        f10.addView(b10, g7.e6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = g7.i6.b(context, 14.0f, i10, false, b6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        f10.addView(b11, g7.e6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        gh.f0 f0Var = new gh.f0(context, 1, b6Var);
        f0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        f10.addView(f0Var, g7.e6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        gh.f0 f0Var2 = new gh.f0(context, 1, b6Var);
        f0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        f10.addView(f0Var2, g7.e6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        gh.f0 f0Var3 = new gh.f0(context, 1, b6Var);
        f0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        f10.addView(f0Var3, g7.e6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        kh.d i11 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        i11.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        i11.setOnClickListener(new ih.p5(i11, context, i9, j10, 4));
        if (z10) {
            f10.addView(i11, g7.e6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        j10.fixNavigationBar();
        j10.show();
    }

    public final void X(TL_account.Passkey passkey) {
        org.telegram.ui.Components.z41 z41Var;
        this.f35577b.add(passkey);
        org.telegram.ui.Components.i51 i51Var = this.f35576a;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
        org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f28737j = 5000;
        M.k(true);
    }

    public final void Y(View view) {
        ArrayList arrayList;
        int i9;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        fl0 fl0Var = (fl0) viewParent;
        String str = fl0Var.f38311r;
        int i10 = 0;
        while (true) {
            arrayList = this.f35577b;
            if (i10 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i10)).f22585id)) {
                    i9 = i10;
                    break;
                }
                i10++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0 && i9 < arrayList.size()) {
            TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i9);
            org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, fl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y01(this, passkey, str, i9, 7), true);
            H.W(this.f35576a.V0(fl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new cl0(this, 0), new dl0(this, 0), null);
        this.f35576a = i51Var;
        i51Var.p1();
        org.telegram.ui.Components.i51 i51Var2 = this.f35576a;
        i51Var2.U2.f35188r = false;
        frameLayout.addView(i51Var2, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f35576a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f35576a.setPadding(0, 0, 0, i12);
        this.f35576a.setClipToPadding(false);
    }
}
