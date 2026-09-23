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
public final class gf0 extends org.telegram.ui.Components.uv0 {
    public final rg0 E;
    public final org.telegram.ui.Components.yc0 f33546a;
    public final EditTextBoldCursor f33547b;
    public final TextView f33548c;
    public final org.telegram.ui.Components.d90 d;
    public final TextView e;
    public final org.telegram.ui.Components.k90 f33549f;
    public final org.telegram.ui.Components.bj0 h;
    public Bundle f33550n;
    public boolean f33551r;
    public String f33552s;
    public String v;
    public String f33553w;
    public String f33554x;
    public GoogleSignInAccount f33555y;

    public gf0(org.telegram.ui.rg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gf0.<init>(org.telegram.ui.rg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f36829h0;
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
        if (this.f33551r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f33555y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f33547b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f33552s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f33553w);
        bundle.putString("phoneHash", this.f33554x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f33555y;
        rg0 rg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (rg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f33553w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f33554x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f33555y.f5937c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f33555y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f33551r = true;
            rg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (rg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f33553w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f33554x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ef0(this, 0), rg0.f36817t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f33550n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f33547b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f33547b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f33550n;
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
        EditTextBoldCursor editTextBoldCursor = this.f33547b;
        editTextBoldCursor.setText("");
        this.f33550n = bundle;
        this.f33552s = bundle.getString("phone");
        this.v = this.f33550n.getString("ephone");
        this.f33553w = this.f33550n.getString("phoneFormated");
        this.f33554x = this.f33550n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f33549f.setVisibility(i10);
        this.e.setVisibility(i10);
        rg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f33548c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.d90 d90Var = this.d;
        d90Var.setTextColor(w02);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        this.f33547b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f33549f.a();
        this.f33546a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.yc0 yc0Var = this.f33546a;
        rg0 rg0Var = this.E;
        if (rg0Var.getParentActivity() == null) {
            return;
        }
        try {
            yc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f33547b.requestFocus();
        rg0.U0(rg0Var, yc0Var, true);
        postDelayed(new ef0(this, 1), 300L);
    }
}
