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
    public org.telegram.ui.Components.d61 f33506a;
    public int addPasskeyRow;
    public final ArrayList f33507b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f33507b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    i2.g.B(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.yc.a0(passkeysActivity).c0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f33507b.remove(passkey);
        passkeysActivity.f33506a.Y2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f20076id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new kg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.h51 h51Var, View view) {
        if (h51Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new ul0(passkeysActivity, 1));
        } else if (h51Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.f6 f6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f33507b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        a0(i10, parentActivity, f6Var, z10);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.vl.i(1, context, f6Var, false);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = f7;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f7.addView((View) imageView, w7.x5.t(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.j6.f20770j5;
        TextView b10 = w7.b6.b(context, 18.0f, i12, true, f6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        f7.addView(b10, w7.x5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i12, false, f6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        f7.addView(b11, w7.x5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        zh.r rVar = new zh.r(context, 1, f6Var);
        rVar.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        f7.addView(rVar, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        zh.r rVar2 = new zh.r(context, 1, f6Var);
        rVar2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        f7.addView(rVar2, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        zh.r rVar3 = new zh.r(context, 1, f6Var);
        rVar3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        f7.addView(rVar3, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        di.d g10 = org.telegram.messenger.vl.g(24, context, f6Var, true);
        g10.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        g10.setOnClickListener(new bi.b7(g10, context, i10, i11, 4));
        if (z10) {
            f7.addView(g10, w7.x5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.v51 v51Var;
        this.f33507b.add(passkey);
        org.telegram.ui.Components.d61 d61Var = this.f33506a;
        if (d61Var != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
        }
        org.telegram.ui.Components.qc M = org.telegram.ui.Components.yc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f29679j = 5000;
        M.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        int i10;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        xl0 xl0Var = (xl0) viewParent;
        String str = xl0Var.f42759r;
        int i11 = 0;
        while (true) {
            arrayList = this.f33507b;
            if (i11 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f20075id)) {
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
            org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, xl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.r11(this, passkey, str, i10, 7), true);
            H.W(this.f33506a.U0(xl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(this, new ul0(this, 0), new vl0(this, 0), null);
        this.f33506a = d61Var;
        d61Var.o1();
        org.telegram.ui.Components.d61 d61Var2 = this.f33506a;
        d61Var2.Y2.f31135r = false;
        frameLayout.addView(d61Var2, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f33506a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33506a.setPadding(0, 0, 0, i13);
        this.f33506a.setClipToPadding(false);
    }
}
