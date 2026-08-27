package org.telegram.ui;

import android.content.Context;
import android.view.View;
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

    public org.telegram.ui.Components.k51 f35579a;
    public int addPasskeyRow;

    public final ArrayList f35580b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f35580b = arrayList;
    }

    public static void U(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str == null) {
            if (passkey != null) {
                MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
                passkeysActivity.Y(passkey);
                return;
            }
            return;
        }
        if ("CANCELLED".equalsIgnoreCase(str)) {
            return;
        }
        if (!"EMPTY".equalsIgnoreCase(str)) {
            org.telegram.ui.Components.mc.a0(passkeysActivity).c0(str, true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PasskeyNoOptionsText);
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f35580b.remove(passkey);
        passkeysActivity.f35579a.U2.N(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f22586id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new org.telegram.messenger.a(), new bg(passkeysActivity, i10, passkey, 2));
    }

    public static void W(PasskeysActivity passkeysActivity, org.telegram.ui.Components.n41 n41Var, View view) {
        if (n41Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new cl0(passkeysActivity, 1));
        } else if (n41Var.G != null) {
            passkeysActivity.Z(view);
        }
    }

    public static void X(PasskeysActivity passkeysActivity) {
        a0(passkeysActivity.currentAccount, passkeysActivity.getParentActivity(), passkeysActivity.resourceProvider, passkeysActivity.f35580b.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get());
    }

    public static void a0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e3VarO.customView = linearLayoutG;
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        ri0Var.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        ri0Var.d();
        linearLayoutG.addView(ri0Var, h7.z5.t(115, 115, 17, 0, 0, 0, 9));
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        TextView textViewB = h7.d6.b(context, 18.0f, i11, true, c6Var);
        textViewB.setGravity(17);
        textViewB.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        linearLayoutG.addView(textViewB, h7.z5.k(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView textViewB2 = h7.d6.b(context, 14.0f, i11, false, c6Var);
        textViewB2.setGravity(17);
        textViewB2.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        linearLayoutG.addView(textViewB2, h7.z5.k(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        hh.f0 f0Var = new hh.f0(context, 1, c6Var);
        f0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        linearLayoutG.addView(f0Var, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hh.f0 f0Var2 = new hh.f0(context, 1, c6Var);
        f0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        linearLayoutG.addView(f0Var2, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        hh.f0 f0Var3 = new hh.f0(context, 1, c6Var);
        f0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        linearLayoutG.addView(f0Var3, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        dVarG.g(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        dVarG.setOnClickListener(new jh.l5(dVarG, context, i10, e3VarO, 4));
        if (z10) {
            linearLayoutG.addView(dVarG, h7.z5.k(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        e3VarO.fixNavigationBar();
        e3VarO.show();
    }

    public final void Y(TL_account.Passkey passkey) {
        org.telegram.ui.Components.b51 b51Var;
        this.f35580b.add(passkey);
        org.telegram.ui.Components.k51 k51Var = this.f35579a;
        if (k51Var != null && (b51Var = k51Var.U2) != null) {
            b51Var.N(true);
        }
        org.telegram.ui.Components.ec ecVarM = org.telegram.ui.Components.mc.a0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        ecVarM.f28020j = 5000;
        ecVarM.k(true);
    }

    public final void Z(View view) {
        ArrayList arrayList;
        int i10;
        boolean z10 = view instanceof ImageView;
        View parent = view;
        if (z10) {
            parent = view.getParent();
        }
        fl0 fl0Var = (fl0) parent;
        String str = fl0Var.f38163r;
        int i11 = 0;
        while (true) {
            arrayList = this.f35580b;
            if (i11 >= arrayList.size()) {
                i10 = -1;
                break;
            } else {
                if (str.equals(((TL_account.Passkey) arrayList.get(i11)).f22585id)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        TL_account.Passkey passkey = (TL_account.Passkey) arrayList.get(i10);
        org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(this, fl0Var);
        b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new xs(this, passkey, str, i10, 6), true);
        b70VarH.W(this.f35579a.V0(fl0Var, false));
        b70VarH.Z();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(this, new cl0(this, 0), new dl0(this, 0), null);
        this.f35579a = k51Var;
        k51Var.p1();
        org.telegram.ui.Components.k51 k51Var2 = this.f35579a;
        k51Var2.U2.f26942r = false;
        frameLayout.addView(k51Var2, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f35579a);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35579a.setPadding(0, 0, 0, i13);
        this.f35579a.setClipToPadding(false);
    }
}
