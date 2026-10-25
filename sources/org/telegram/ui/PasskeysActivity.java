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
public class PasskeysActivity extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Components.r71 f35600a;
    public int addPasskeyRow;
    public final ArrayList f35601b;

    public PasskeysActivity(ArrayList arrayList) {
        super(null);
        this.f35601b = arrayList;
    }

    public static void V(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str) {
        if (str != null) {
            if (!"CANCELLED".equalsIgnoreCase(str)) {
                if ("EMPTY".equalsIgnoreCase(str)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passkeysActivity.getParentActivity());
                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                    alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.PasskeyNoOptionsText);
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                org.telegram.ui.Components.wc.b0(passkeysActivity).f0(str, true);
            }
        } else if (passkey != null) {
            MessagesController.getInstance(passkeysActivity.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
            passkeysActivity.Z(passkey);
        }
    }

    public static void W(PasskeysActivity passkeysActivity, TL_account.Passkey passkey, String str, int i10) {
        passkeysActivity.f35601b.remove(passkey);
        passkeysActivity.f35600a.f32150g3.O(true);
        TL_account.deletePasskey deletepasskey = new TL_account.deletePasskey();
        deletepasskey.f22230id = str;
        ConnectionsManager.getInstance(passkeysActivity.currentAccount).sendRequestTyped(deletepasskey, new Object(), new lg(passkeysActivity, i10, passkey, 2));
    }

    public static void X(PasskeysActivity passkeysActivity, org.telegram.ui.Components.t61 t61Var, View view) {
        if (t61Var.d == -1) {
            PasskeysController.create(passkeysActivity.getParentActivity(), passkeysActivity.currentAccount, new ol0(passkeysActivity, 1));
        } else if (t61Var.G != null) {
            passkeysActivity.a0(view);
        }
    }

    public static void Y(PasskeysActivity passkeysActivity) {
        Activity parentActivity = passkeysActivity.getParentActivity();
        int i10 = passkeysActivity.currentAccount;
        org.telegram.ui.ActionBar.u6 u6Var = passkeysActivity.resourceProvider;
        boolean z10 = true;
        if (passkeysActivity.f35601b.size() + 1 > passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
            z10 = false;
        }
        b0(i10, parentActivity, u6Var, z10);
    }

    public static void b0(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        org.telegram.ui.ActionBar.k3 i11 = org.telegram.messenger.vh.i(1, context, u6Var, false);
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i11.customView = d;
        ?? imageView = new ImageView(context);
        imageView.f(R.raw.passkey, AndroidUtilities.dp(115.0f), AndroidUtilities.dp(115.0f), null);
        imageView.d();
        d.addView((View) imageView, org.telegram.ui.Components.gb1.x(115, 115, 17, 0, 0, 0, 9));
        int i12 = org.telegram.ui.ActionBar.y6.f23462j5;
        TextView L = org.telegram.ui.Components.gb1.L(context, 18.0f, i12, true, u6Var);
        L.setGravity(17);
        L.setText(LocaleController.getString(R.string.PasskeyFeatureTitle));
        d.addView(L, org.telegram.ui.Components.gb1.o(32.0f, 0.0f, 32.0f, 6.0f, -1, -2));
        TextView L2 = org.telegram.ui.Components.gb1.L(context, 14.0f, i12, false, u6Var);
        L2.setGravity(17);
        L2.setText(LocaleController.getString(R.string.PasskeyFeatureSubtitle));
        d.addView(L2, org.telegram.ui.Components.gb1.o(32.0f, 0.0f, 32.0f, 24.0f, -1, -2));
        bi.p0 p0Var = new bi.p0(context, 1, u6Var);
        p0Var.a(LocaleController.getString(R.string.PasskeyFeature1Title), LocaleController.getString(R.string.PasskeyFeature1Subtitle), R.drawable.msg2_permissions);
        d.addView(p0Var, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        bi.p0 p0Var2 = new bi.p0(context, 1, u6Var);
        p0Var2.a(LocaleController.getString(R.string.PasskeyFeature2Title), LocaleController.getString(R.string.PasskeyFeature2Subtitle), R.drawable.menu_face);
        d.addView(p0Var2, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        bi.p0 p0Var3 = new bi.p0(context, 1, u6Var);
        p0Var3.a(LocaleController.getString(R.string.PasskeyFeature3Title), LocaleController.getString(R.string.PasskeyFeature3Subtitle), R.drawable.menu_privacy);
        d.addView(p0Var3, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, 8.0f, -1, -2));
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        f7.i(LocaleController.getString(R.string.PasskeyFeatureButton), false, true);
        f7.setOnClickListener(new di.c6(f7, context, i10, i11, 4));
        if (z10) {
            d.addView(f7, org.telegram.ui.Components.gb1.o(0.0f, 16.0f, 0.0f, 8.0f, -1, 48));
        }
        i11.fixNavigationBar();
        i11.show();
    }

    public final void Z(TL_account.Passkey passkey) {
        org.telegram.ui.Components.j71 j71Var;
        this.f35601b.add(passkey);
        org.telegram.ui.Components.r71 r71Var = this.f35600a;
        if (r71Var != null && (j71Var = r71Var.f32150g3) != null) {
            j71Var.O(true);
        }
        org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(this).M(LocaleController.getString(R.string.PasskeyAddedTitle), LocaleController.formatString(R.string.PasskeyAddedText, passkey.name), R.raw.passcode_lock_close);
        M.f31887j = 5000;
        M.k(true);
    }

    public final void a0(View view) {
        ArrayList arrayList;
        boolean z10 = view instanceof ImageView;
        ViewParent viewParent = view;
        if (z10) {
            viewParent = view.getParent();
        }
        ql0 ql0Var = (ql0) viewParent;
        String str = ql0Var.v;
        int i10 = 0;
        while (true) {
            arrayList = this.f35601b;
            if (i10 < arrayList.size()) {
                if (str.equals(((TL_account.Passkey) arrayList.get(i10)).f22229id)) {
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
            org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, ql0Var);
            H.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.zr0(this, passkey, str, i11, 12), true);
            H.W(this.f35600a.V0(ql0Var, false));
            H.Z();
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Passkey));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 19));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(this, new ol0(this, 0), new hl0(this, 1), null);
        this.f35600a = r71Var;
        r71Var.u1();
        this.f35600a.setSectionsDrawBackground(true);
        org.telegram.ui.Components.r71 r71Var2 = this.f35600a;
        r71Var2.f32150g3.f29505r = false;
        frameLayout.addView(r71Var2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35600a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
