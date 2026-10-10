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
    public org.telegram.ui.Components.l71 f33898a;
    public int addPasskeyRow;
    public final ArrayList f33899b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f33899b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.ad.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f33899b.remove(passkey);
        passkeysActivity.f33898a.W2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f20248id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new kg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.q61 q61Var, View view) {
        if (q61Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new ul0(passkeysActivity, 1));
        } else if (q61Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.e6 e6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f33899b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        a0(i10, parentActivity, e6Var, z10);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, e6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = e7;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        e7.addView((View) imageView, w7.x5.t(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.i6.f20909j5;
        TextView b10 = w7.b6.b(context, 18.0f, i12, true, e6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        e7.addView(b10, w7.x5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i12, false, e6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        e7.addView(b11, w7.x5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        yh.r rVar = new yh.r(context, 1, e6Var);
        rVar.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        e7.addView(rVar, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.r rVar2 = new yh.r(context, 1, e6Var);
        rVar2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        e7.addView(rVar2, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.r rVar3 = new yh.r(context, 1, e6Var);
        rVar3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        e7.addView(rVar3, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        f7.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        f7.setOnClickListener(new ai.u7(f7, context, i10, i11, 4));
        if (z10) {
            e7.addView(f7, w7.x5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.d71 d71Var;
        this.f33899b.add(passkey);
        org.telegram.ui.Components.l71 l71Var = this.f33898a;
        if (l71Var != null && (d71Var = l71Var.W2) != null) {
            d71Var.N(true);
        }
        org.telegram.ui.Components.tc M = org.telegram.ui.Components.ad.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f31096j = 5000;
        M.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        wl0 wl0Var = (wl0) viewParent;
        String str = wl0Var.f43756r;
        int i10 = 0;
        while (true) {
            arrayList = this.f33899b;
            if (i10 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i10)).f20247id)) {
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
            org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(this, wl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.r21(this, passkey, str, i11, 8), true);
            H.W(this.f33898a.V0(wl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20745a7, false));
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(this, new ul0(this, 0), new gu(this, 29), null);
        this.f33898a = l71Var;
        l71Var.p1();
        org.telegram.ui.Components.l71 l71Var2 = this.f33898a;
        l71Var2.W2.f25587r = false;
        frameLayout.addView(l71Var2, w7.x5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f33898a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33898a.setPadding(0, 0, 0, i13);
        this.f33898a.setClipToPadding(false);
    }
}
