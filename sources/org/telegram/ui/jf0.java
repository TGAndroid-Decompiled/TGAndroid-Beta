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
public final class jf0 extends org.telegram.ui.Components.rw0 {
    public final ug0 E;
    public final org.telegram.ui.Components.ld0 f37685a;
    public final EditTextBoldCursor f37686b;
    public final TextView f37687c;
    public final org.telegram.ui.Components.q90 d;
    public final TextView f37688e;
    public final org.telegram.ui.Components.x90 f37689f;
    public final org.telegram.ui.Components.nj0 h;
    public Bundle f37690n;
    public boolean f37691r;
    public String f37692s;
    public String v;
    public String f37693w;
    public String f37694x;
    public GoogleSignInAccount f37695y;

    public jf0(org.telegram.ui.ug0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.<init>(org.telegram.ui.ug0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f41248h0;
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
        if (this.f37691r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f37695y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f37686b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f37692s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f37693w);
        bundle.putString("phoneHash", this.f37694x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f37695y;
        ug0 ug0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ug0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f37693w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f37694x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f37695y.f6398c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f37695y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ca(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f37691r = true;
            ug0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ug0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f37693w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f37694x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ca(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new hf0(this, 0), ug0.f41235t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f37690n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f37686b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37686b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f37690n;
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
        EditTextBoldCursor editTextBoldCursor = this.f37686b;
        editTextBoldCursor.setText("");
        this.f37690n = bundle;
        this.f37692s = bundle.getString("phone");
        this.v = this.f37690n.getString("ephone");
        this.f37693w = this.f37690n.getString("phoneFormated");
        this.f37694x = this.f37690n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f37689f.setVisibility(i10);
        this.f37688e.setVisibility(i10);
        ug0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f37687c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.q90 q90Var = this.d;
        q90Var.setTextColor(w02);
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f37686b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f37688e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f37689f.a();
        this.f37685a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.ld0 ld0Var = this.f37685a;
        ug0 ug0Var = this.E;
        if (ug0Var.getParentActivity() == null) {
            return;
        }
        try {
            ld0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f37686b.requestFocus();
        ug0.U0(ug0Var, ld0Var, true);
        postDelayed(new hf0(this, 1), 300L);
    }
}
