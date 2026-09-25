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
public final class ff0 extends org.telegram.ui.Components.fw0 {
    public final qg0 E;
    public final org.telegram.ui.Components.jd0 f33657a;
    public final EditTextBoldCursor f33658b;
    public final TextView f33659c;
    public final org.telegram.ui.Components.n90 d;
    public final TextView e;
    public final org.telegram.ui.Components.u90 f33660f;
    public final org.telegram.ui.Components.lj0 h;
    public Bundle f33661n;
    public boolean f33662r;
    public String f33663s;
    public String v;
    public String f33664w;
    public String f33665x;
    public GoogleSignInAccount f33666y;

    public ff0(org.telegram.ui.qg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.<init>(org.telegram.ui.qg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f36897h0;
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
        if (this.f33662r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f33666y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f33658b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f33663s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f33664w);
        bundle.putString("phoneHash", this.f33665x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f33666y;
        qg0 qg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (qg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f33664w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f33665x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f33666y.f5937c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f33666y = null;
            i11 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f33662r = true;
            qg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (qg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f33664w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f33665x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new df0(this, 0), qg0.f36885t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f33661n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f33658b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f33658b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f33661n;
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
        EditTextBoldCursor editTextBoldCursor = this.f33658b;
        editTextBoldCursor.setText("");
        this.f33661n = bundle;
        this.f33663s = bundle.getString("phone");
        this.v = this.f33661n.getString("ephone");
        this.f33664w = this.f33661n.getString("phoneFormated");
        this.f33665x = this.f33661n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f33660f.setVisibility(i10);
        this.e.setVisibility(i10);
        qg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f33659c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.n90 n90Var = this.d;
        n90Var.setTextColor(w02);
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        this.f33658b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f33660f.a();
        this.f33657a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.jd0 jd0Var = this.f33657a;
        qg0 qg0Var = this.E;
        if (qg0Var.getParentActivity() == null) {
            return;
        }
        try {
            jd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f33658b.requestFocus();
        qg0.U0(qg0Var, jd0Var, true);
        postDelayed(new df0(this, 1), 300L);
    }
}
