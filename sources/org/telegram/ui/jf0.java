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
public final class jf0 extends org.telegram.ui.Components.qw0 {
    public final ug0 E;
    public final org.telegram.ui.Components.ld0 f37671a;
    public final EditTextBoldCursor f37672b;
    public final TextView f37673c;
    public final org.telegram.ui.Components.q90 d;
    public final TextView f37674e;
    public final org.telegram.ui.Components.x90 f37675f;
    public final org.telegram.ui.Components.nj0 h;
    public Bundle f37676n;
    public boolean f37677r;
    public String f37678s;
    public String v;
    public String f37679w;
    public String f37680x;
    public GoogleSignInAccount f37681y;

    public jf0(org.telegram.ui.ug0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.<init>(org.telegram.ui.ug0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f41204h0;
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
        if (this.f37677r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f37681y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f37672b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f37678s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f37679w);
        bundle.putString("phoneHash", this.f37680x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f37681y;
        ug0 ug0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ug0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f37679w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f37680x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f37681y.f6397c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f37681y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ca(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f37677r = true;
            ug0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ug0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f37679w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f37680x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ca(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new hf0(this, 0), ug0.f41191t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f37676n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f37672b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f37672b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f37676n;
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
        EditTextBoldCursor editTextBoldCursor = this.f37672b;
        editTextBoldCursor.setText("");
        this.f37676n = bundle;
        this.f37678s = bundle.getString("phone");
        this.v = this.f37676n.getString("ephone");
        this.f37679w = this.f37676n.getString("phoneFormated");
        this.f37680x = this.f37676n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f37675f.setVisibility(i10);
        this.f37674e.setVisibility(i10);
        ug0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f37673c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.q90 q90Var = this.d;
        q90Var.setTextColor(w02);
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f37672b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f37674e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f37675f.a();
        this.f37671a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.ld0 ld0Var = this.f37671a;
        ug0 ug0Var = this.E;
        if (ug0Var.getParentActivity() == null) {
            return;
        }
        try {
            ld0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f37672b.requestFocus();
        ug0.U0(ug0Var, ld0Var, true);
        postDelayed(new hf0(this, 1), 300L);
    }
}
