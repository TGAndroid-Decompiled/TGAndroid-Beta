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
public class PasskeysActivity extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.h71 f32183a;
    public int addPasskeyRow;
    public final ArrayList f32184b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f32184b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.zc.a0(passkeysActivity).e0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f32184b.remove(passkey);
        passkeysActivity.f32183a.W2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f19420id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new pg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.l61 l61Var, View view) {
        if (l61Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new am0(passkeysActivity, 1));
        } else if (l61Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.c6 c6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f32184b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        a0(i10, parentActivity, c6Var, z10);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        org.telegram.ui.ActionBar.e3 i11 = org.telegram.messenger.yh.i(1, context, c6Var, false);
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = e;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        e.addView((View) imageView, w7.a6.t(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.g6.f20007j5;
        TextView b10 = w7.e6.b(context, 18.0f, i12, true, c6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        e.addView(b10, w7.a6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.e6.b(context, 14.0f, i12, false, c6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        e.addView(b11, w7.a6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        zh.s sVar = new zh.s(context, 1, c6Var);
        sVar.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        e.addView(sVar, w7.a6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        zh.s sVar2 = new zh.s(context, 1, c6Var);
        sVar2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        e.addView(sVar2, w7.a6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        zh.s sVar3 = new zh.s(context, 1, c6Var);
        sVar3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        e.addView(sVar3, w7.a6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.d f7 = org.telegram.messenger.yh.f(24, context, c6Var, true);
        f7.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        f7.setOnClickListener(new bi.f7(f7, context, i10, i11, 4));
        if (z10) {
            e.addView(f7, w7.a6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.z61 z61Var;
        this.f32184b.add(passkey);
        org.telegram.ui.Components.h71 h71Var = this.f32183a;
        if (h71Var != null && (z61Var = h71Var.W2) != null) {
            z61Var.N(true);
        }
        org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f29102j = 5000;
        M.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        cm0 cm0Var = (cm0) viewParent;
        String str = cm0Var.f34972r;
        int i10 = 0;
        while (true) {
            arrayList = this.f32184b;
            if (i10 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i10)).f19419id)) {
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
            org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, cm0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.m21(this, passkey, str, i11, 8), true);
            H.W(this.f32183a.V0(cm0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        org.telegram.ui.Components.h71 h71Var = new org.telegram.ui.Components.h71(this, new am0(this, 0), new mu(this, 29), null);
        this.f32183a = h71Var;
        h71Var.p1();
        org.telegram.ui.Components.h71 h71Var2 = this.f32183a;
        h71Var2.W2.f31780r = false;
        frameLayout.addView(h71Var2, w7.a6.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f32183a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f32183a.setPadding(0, 0, 0, i13);
        this.f32183a.setClipToPadding(false);
    }
}
