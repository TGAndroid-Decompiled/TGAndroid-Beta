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
    public org.telegram.ui.Components.c71 f33857a;
    public int addPasskeyRow;
    public final ArrayList f33858b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f33858b = arrayList;
    }

    public static void S(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.yc.a0(passkeysActivity).c0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.X(passkey);
        }
    }

    public static void T(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f33858b.remove(passkey);
        passkeysActivity.f33857a.f25250f3.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f20248id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new jg(passkeysActivity, i10, passkey, 2));
    }

    public static void U(PasskeysActivity passkeysActivity, org.telegram.ui.Components.g61 g61Var, View view) {
        if (g61Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new ql0(passkeysActivity, 1));
        } else if (g61Var.G != null) {
            passkeysActivity.Y(view);
        }
    }

    public static void W(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.d6 d6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f33858b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        Z(i10, parentActivity, d6Var, z10);
    }

    public static void Z(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 i11 = org.telegram.messenger.bi.i(1, context, d6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = e7;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        e7.addView((View) imageView, w7.z5.t(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.i6.f20930j5;
        TextView b10 = w7.d6.b(context, 18.0f, i12, true, d6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        e7.addView(b10, w7.z5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.d6.b(context, 14.0f, i12, false, d6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        e7.addView(b11, w7.z5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        yh.r rVar = new yh.r(context, 1, d6Var);
        rVar.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        e7.addView(rVar, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.r rVar2 = new yh.r(context, 1, d6Var);
        rVar2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        e7.addView(rVar2, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.r rVar3 = new yh.r(context, 1, d6Var);
        rVar3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        e7.addView(rVar3, w7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        f7.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        f7.setOnClickListener(new ai.t7(f7, context, i10, i11, 4));
        if (z10) {
            e7.addView(f7, w7.z5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void X(TL_account.Passkey passkey) {
        org.telegram.ui.Components.u61 u61Var;
        this.f33858b.add(passkey);
        org.telegram.ui.Components.c71 c71Var = this.f33857a;
        if (c71Var != null && (u61Var = c71Var.f25250f3) != null) {
            u61Var.N(true);
        }
        org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f30345j = 5000;
        M.k(true);
    }

    public final void Y(View view) {
        ArrayList arrayList;
        int i10;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        sl0 sl0Var = (sl0) viewParent;
        String str = sl0Var.f40534r;
        int i11 = 0;
        while (true) {
            arrayList = this.f33858b;
            if (i11 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f20247id)) {
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
            org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(this, sl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.q21(this, passkey, str, i10, 7), true);
            H.W(this.f33857a.W0(sl0Var, false));
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
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(this, new ql0(this, 0), new jl0(this, 1), null);
        this.f33857a = c71Var;
        c71Var.s1();
        org.telegram.ui.Components.c71 c71Var2 = this.f33857a;
        c71Var2.f25250f3.f31313r = false;
        frameLayout.addView(c71Var2, w7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f33857a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f33857a.setPadding(0, 0, 0, i13);
        this.f33857a.setClipToPadding(false);
    }
}
