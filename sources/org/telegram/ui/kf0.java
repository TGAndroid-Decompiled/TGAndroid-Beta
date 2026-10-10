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
public final class kf0 extends org.telegram.ui.Components.yw0 {
    public final wg0 E;
    public final org.telegram.ui.Components.ae0 f39308a;
    public final EditTextBoldCursor f39309b;
    public final TextView f39310c;
    public final org.telegram.ui.Components.fa0 d;
    public final TextView f39311e;
    public final org.telegram.ui.Components.ma0 f39312f;
    public final org.telegram.ui.Components.gk0 h;
    public Bundle f39313n;
    public boolean f39314r;
    public String f39315s;
    public String v;
    public String f39316w;
    public String f39317x;
    public GoogleSignInAccount f39318y;

    public kf0(org.telegram.ui.wg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f43630h0;
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
        if (this.f39314r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39318y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39309b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39315s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39316w);
        bundle.putString("phoneHash", this.f39317x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39318y;
        wg0 wg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (wg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39316w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39317x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39318y.f6450c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39318y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39314r = true;
            wg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (wg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39316w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39317x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new if0(this, 0), wg0.f43617t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39313n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39309b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39309b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39313n;
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
        EditTextBoldCursor editTextBoldCursor = this.f39309b;
        editTextBoldCursor.setText("");
        this.f39313n = bundle;
        this.f39315s = bundle.getString("phone");
        this.v = this.f39313n.getString("ephone");
        this.f39316w = this.f39313n.getString("phoneFormated");
        this.f39317x = this.f39313n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39312f.setVisibility(i10);
        this.f39311e.setVisibility(i10);
        wg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f39310c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.fa0 fa0Var = this.d;
        fa0Var.setTextColor(x02);
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f39309b.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.f39311e.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f39312f.a();
        this.f39308a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.ae0 ae0Var = this.f39308a;
        wg0 wg0Var = this.E;
        if (wg0Var.getParentActivity() == null) {
            return;
        }
        try {
            ae0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39309b.requestFocus();
        wg0.U0(wg0Var, ae0Var, true);
        postDelayed(new if0(this, 1), 300L);
    }
}
