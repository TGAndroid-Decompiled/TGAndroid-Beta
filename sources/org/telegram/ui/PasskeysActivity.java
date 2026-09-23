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
    public org.telegram.ui.Components.d61 f30865a;
    public int addPasskeyRow;
    public final ArrayList f30866b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f30866b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    hg.c.A(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.xc.a0(passkeysActivity).c0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f30866b.remove(passkey);
        passkeysActivity.f30865a.Y2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f18287id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new ig(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.h51 h51Var, View view) {
        if (h51Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new ml0(passkeysActivity, 1));
        } else if (h51Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.d6 d6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f30866b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        a0(i10, parentActivity, d6Var, z10);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.ul.j(1, context, d6Var, false);
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        j3.customView = f7;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        f7.addView((View) imageView, w7.x5.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
        TextView b10 = w7.b6.b(context, 18.0f, i11, true, d6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        f7.addView(b10, w7.x5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = w7.b6.b(context, 14.0f, i11, false, d6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        f7.addView(b11, w7.x5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        yh.r rVar = new yh.r(context, 1, d6Var);
        rVar.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        f7.addView(rVar, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.r rVar2 = new yh.r(context, 1, d6Var);
        rVar2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        f7.addView(rVar2, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        yh.r rVar3 = new yh.r(context, 1, d6Var);
        rVar3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        f7.addView(rVar3, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        ci.d g10 = org.telegram.messenger.ul.g(24, context, d6Var, true);
        g10.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        g10.setOnClickListener(new ai.t7(g10, context, i10, j3, 4));
        if (z10) {
            f7.addView(g10, w7.x5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        j3.fixNavigationBar();
        j3.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.v51 v51Var;
        this.f30866b.add(passkey);
        org.telegram.ui.Components.d61 d61Var = this.f30865a;
        if (d61Var != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
        }
        org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f27306j = 5000;
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
        pl0 pl0Var = (pl0) viewParent;
        String str = pl0Var.f36144r;
        int i11 = 0;
        while (true) {
            arrayList = this.f30866b;
            if (i11 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f18286id)) {
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
            org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, pl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.r11(this, passkey, str, i10, 7), true);
            H.W(this.f30865a.V0(pl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18733a7, false));
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(this, new ml0(this, 0), new nl0(this, 0), null);
        this.f30865a = d61Var;
        d61Var.p1();
        org.telegram.ui.Components.d61 d61Var2 = this.f30865a;
        d61Var2.Y2.f28662r = false;
        frameLayout.addView(d61Var2, w7.x5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f30865a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f30865a.setPadding(0, 0, 0, i13);
        this.f30865a.setClipToPadding(false);
    }
}
