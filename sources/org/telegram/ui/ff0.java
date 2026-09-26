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
public final class ff0 extends org.telegram.ui.Components.gw0 {
    public final qg0 E;
    public final org.telegram.ui.Components.kd0 f33655a;
    public final EditTextBoldCursor f33656b;
    public final TextView f33657c;
    public final org.telegram.ui.Components.o90 d;
    public final TextView e;
    public final org.telegram.ui.Components.v90 f33658f;
    public final org.telegram.ui.Components.mj0 h;
    public Bundle f33659n;
    public boolean f33660r;
    public String f33661s;
    public String v;
    public String f33662w;
    public String f33663x;
    public GoogleSignInAccount f33664y;

    public ff0(org.telegram.ui.qg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.<init>(org.telegram.ui.qg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f36895h0;
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
        if (this.f33660r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f33664y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f33656b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f33661s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f33662w);
        bundle.putString("phoneHash", this.f33663x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f33664y;
        qg0 qg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (qg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f33662w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f33663x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f33664y.f5937c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f33664y = null;
            i11 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f33660r = true;
            qg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (qg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f33662w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f33663x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new df0(this, 0), qg0.f36883t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f33659n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f33656b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f33656b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f33659n;
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
        EditTextBoldCursor editTextBoldCursor = this.f33656b;
        editTextBoldCursor.setText("");
        this.f33659n = bundle;
        this.f33661s = bundle.getString("phone");
        this.v = this.f33659n.getString("ephone");
        this.f33662w = this.f33659n.getString("phoneFormated");
        this.f33663x = this.f33659n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f33658f.setVisibility(i10);
        this.e.setVisibility(i10);
        qg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f33657c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.o90 o90Var = this.d;
        o90Var.setTextColor(w02);
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        this.f33656b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f33658f.a();
        this.f33655a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.kd0 kd0Var = this.f33655a;
        qg0 qg0Var = this.E;
        if (qg0Var.getParentActivity() == null) {
            return;
        }
        try {
            kd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f33656b.requestFocus();
        qg0.U0(qg0Var, kd0Var, true);
        postDelayed(new df0(this, 1), 300L);
    }
}
