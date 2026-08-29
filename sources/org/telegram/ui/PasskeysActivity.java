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
    public org.telegram.ui.Components.u51 f35643a;
    public int addPasskeyRow;
    public final ArrayList f35644b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f35644b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    j7.l1.C(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.tc.a0(passkeysActivity).c0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Y(passkey);
        }
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f35644b.remove(passkey);
        passkeysActivity.f35643a.U2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f22598id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new yf(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.w41 w41Var, View view) {
        if (w41Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new yk0(passkeysActivity, 1));
        } else if (w41Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.c6 c6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f35644b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        a0(i10, parentActivity, c6Var, z10);
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        q6.customView = g10;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        g10.addView((View) imageView, i7.f6.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        TextView b10 = i7.j6.b(context, 18.0f, i11, true, c6Var);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        g10.addView(b10, i7.f6.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView b11 = i7.j6.b(context, 14.0f, i11, false, c6Var);
        b11.setGravity(17);
        b11.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        g10.addView(b11, i7.f6.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        jh.e0 e0Var = new jh.e0(context, 1, c6Var);
        e0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        g10.addView(e0Var, i7.f6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        jh.e0 e0Var2 = new jh.e0(context, 1, c6Var);
        e0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        g10.addView(e0Var2, i7.f6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        jh.e0 e0Var3 = new jh.e0(context, 1, c6Var);
        e0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        g10.addView(e0Var3, i7.f6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        o10.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        o10.setOnClickListener(new lh.n5(o10, context, i10, q6, 4));
        if (z10) {
            g10.addView(o10, i7.f6.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        q6.fixNavigationBar();
        q6.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.k51 k51Var;
        this.f35644b.add(passkey);
        org.telegram.ui.Components.u51 u51Var = this.f35643a;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
        }
        org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f30652j = 5000;
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
        cl0 cl0Var = (cl0) viewParent;
        String str = cl0Var.f37176r;
        int i11 = 0;
        while (true) {
            arrayList = this.f35644b;
            if (i11 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f22597id)) {
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
            org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, cl0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new vs(this, passkey, str, i10, 6), true);
            H.W(this.f35643a.V0(cl0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new yk0(this, 0), new zk0(this, 0), null);
        this.f35643a = u51Var;
        u51Var.p1();
        org.telegram.ui.Components.u51 u51Var2 = this.f35643a;
        u51Var2.U2.f29939r = false;
        frameLayout.addView(u51Var2, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f35643a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35643a.setPadding(0, 0, 0, i13);
        this.f35643a.setClipToPadding(false);
    }
}
