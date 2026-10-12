package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qf0 extends org.telegram.ui.Components.tw0 {
    public final bh0 E;
    public final org.telegram.ui.Components.yd0 f39427a;
    public final EditTextBoldCursor f39428b;
    public final TextView f39429c;
    public final org.telegram.ui.Components.da0 d;
    public final TextView e;
    public final org.telegram.ui.Components.ka0 f39430f;
    public final org.telegram.ui.Components.bk0 h;
    public Bundle f39431n;
    public boolean f39432r;
    public String f39433s;
    public String v;
    public String f39434w;
    public String f39435x;
    public GoogleSignInAccount f39436y;

    public qf0(org.telegram.ui.bh0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qf0.<init>(org.telegram.ui.bh0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f34554h0;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
    }

    @Override
    public final void h(String str) {
        String obj;
        int i10;
        int i11;
        if (this.f39432r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39436y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39428b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39433s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39434w);
        bundle.putString("phoneHash", this.f39435x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39436y;
        bh0 bh0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (bh0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39434w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39435x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39436y.f4817c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39436y = null;
            i11 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new fa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39432r = true;
            bh0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (bh0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39434w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39435x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new fa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new of0(this, 0), bh0.f34542t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39431n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39428b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39428b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39431n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f39428b;
        editTextBoldCursor.setText("");
        this.f39431n = bundle;
        this.f39433s = bundle.getString("phone");
        this.v = this.f39431n.getString("ephone");
        this.f39434w = this.f39431n.getString("phoneFormated");
        this.f39435x = this.f39431n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39430f.setVisibility(i10);
        this.e.setVisibility(i10);
        bh0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f39429c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false);
        org.telegram.ui.Components.da0 da0Var = this.d;
        da0Var.setTextColor(x02);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19960gc, false));
        this.f39428b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f39430f.a();
        this.f39427a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.yd0 yd0Var = this.f39427a;
        bh0 bh0Var = this.E;
        if (bh0Var.getParentActivity() == null) {
            return;
        }
        try {
            yd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39428b.requestFocus();
        bh0.U0(bh0Var, yd0Var, true);
        postDelayed(new of0(this, 1), 300L);
    }
}
