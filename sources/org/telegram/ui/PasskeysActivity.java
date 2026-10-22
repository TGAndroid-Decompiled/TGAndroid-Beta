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
public class PasskeysActivity extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.c71 f33239a;
    public int addPasskeyRow;
    public final ArrayList f33240b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f33240b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f20608a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.xc.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f33240b.remove(passkey);
        passkeysActivity.f33239a.W2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f20482id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new cg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.h61 h61Var, View view) {
        if (h61Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new dl0(passkeysActivity, 1));
        } else if (h61Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.d6 d6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f33240b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        a0(i10, parentActivity, d6Var, z10);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.ok.i(1, context, d6Var, false);
        LinearLayout e = org.telegram.messenger.ok.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = e;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        e.addView((View) imageView, w7.z5.t(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.h6.f21099j5;
        TextView b10 = w7.d6.b(context, 18.0f, i12, true, d6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        e.addView(b10, w7.z5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i12, false, d6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        e.addView(b11, w7.z5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        ai.n0 n0Var = new ai.n0(context, 1, d6Var);
        n0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        e.addView(n0Var, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ai.n0 n0Var2 = new ai.n0(context, 1, d6Var);
        n0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        e.addView(n0Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ai.n0 n0Var3 = new ai.n0(context, 1, d6Var);
        n0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        e.addView(n0Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ei.d f7 = org.telegram.messenger.ok.f(24, context, d6Var, true);
        f7.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        f7.setOnClickListener(new ci.d6(i10, 4, f7, context, i11));
        if (z10) {
            e.addView(f7, w7.z5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.u61 u61Var;
        this.f33240b.add(passkey);
        org.telegram.ui.Components.c71 c71Var = this.f33239a;
        if (c71Var != null && (u61Var = c71Var.W2) != null) {
            u61Var.N(true);
        }
        org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f29534j = 5000;
        M.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        fl0 fl0Var = (fl0) viewParent;
        String str = fl0Var.f37037r;
        int i10 = 0;
        while (true) {
            arrayList = this.f33240b;
            if (i10 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i10)).f20481id)) {
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
            TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i11);
            org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(this, fl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.cz0((org.telegram.ui.ActionBar.n2) this, (Object) passkey, str, i11, 9), true);
            H.W(this.f33239a.V0(fl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(this, new dl0(this, 0), new ut(this, 29), null);
        this.f33239a = c71Var;
        c71Var.p1();
        org.telegram.ui.Components.c71 c71Var2 = this.f33239a;
        c71Var2.W2.f30864r = false;
        frameLayout.addView(c71Var2, w7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f33239a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33239a.setPadding(0, 0, 0, i13);
        this.f33239a.setClipToPadding(false);
    }
}
