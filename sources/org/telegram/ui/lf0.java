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
public final class lf0 extends org.telegram.ui.Components.fw0 {
    public final xg0 E;
    public final org.telegram.ui.Components.hd0 f34697a;
    public final EditTextBoldCursor f34698b;
    public final TextView f34699c;
    public final org.telegram.ui.Components.m90 d;
    public final TextView e;
    public final org.telegram.ui.Components.t90 f34700f;
    public final org.telegram.ui.Components.kj0 h;
    public Bundle f34701n;
    public boolean f34702r;
    public String f34703s;
    public String v;
    public String f34704w;
    public String f34705x;
    public GoogleSignInAccount f34706y;

    public lf0(org.telegram.ui.xg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf0.<init>(org.telegram.ui.xg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f38728h0;
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
        if (this.f34702r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f34706y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f34698b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f34703s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f34704w);
        bundle.putString("phoneHash", this.f34705x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f34706y;
        xg0 xg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (xg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f34704w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f34705x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f34706y.f4728c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f34706y = null;
            i11 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f34702r = true;
            xg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (xg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f34704w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f34705x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new jf0(this, 0), xg0.f38716t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f34701n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f34698b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34698b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f34701n;
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
        EditTextBoldCursor editTextBoldCursor = this.f34698b;
        editTextBoldCursor.setText("");
        this.f34701n = bundle;
        this.f34703s = bundle.getString("phone");
        this.v = this.f34701n.getString("ephone");
        this.f34704w = this.f34701n.getString("phoneFormated");
        this.f34705x = this.f34701n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f34700f.setVisibility(i10);
        this.e.setVisibility(i10);
        xg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f34699c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.m90 m90Var = this.d;
        m90Var.setTextColor(w02);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        this.f34698b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f34700f.a();
        this.f34697a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.hd0 hd0Var = this.f34697a;
        xg0 xg0Var = this.E;
        if (xg0Var.getParentActivity() == null) {
            return;
        }
        try {
            hd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f34698b.requestFocus();
        xg0.U0(xg0Var, hd0Var, true);
        postDelayed(new jf0(this, 1), 300L);
    }
}
