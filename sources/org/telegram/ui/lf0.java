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
public final class lf0 extends org.telegram.ui.Components.tv0 {
    public final wg0 E;
    public final org.telegram.ui.Components.zc0 f38333a;
    public final EditTextBoldCursor f38334b;
    public final TextView f38335c;
    public final org.telegram.ui.Components.d90 d;
    public final TextView f38336e;
    public final org.telegram.ui.Components.k90 f38337f;
    public final org.telegram.ui.Components.aj0 h;
    public Bundle f38338n;
    public boolean f38339r;
    public String f38340s;
    public String v;
    public String f38341w;
    public String f38342x;
    public GoogleSignInAccount f38343y;

    public lf0(org.telegram.ui.wg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f42371h0;
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
        if (this.f38339r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f38343y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f38334b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f38340s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f38341w);
        bundle.putString("phoneHash", this.f38342x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f38343y;
        wg0 wg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (wg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f38341w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f38342x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f38343y.f4871c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f38343y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f38339r = true;
            wg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (wg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f38341w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f38342x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new jf0(this, 0), wg0.f42358t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f38338n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f38334b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f38334b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f38338n;
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
        EditTextBoldCursor editTextBoldCursor = this.f38334b;
        editTextBoldCursor.setText("");
        this.f38338n = bundle;
        this.f38340s = bundle.getString("phone");
        this.v = this.f38338n.getString("ephone");
        this.f38341w = this.f38338n.getString("phoneFormated");
        this.f38342x = this.f38338n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f38337f.setVisibility(i10);
        this.f38336e.setVisibility(i10);
        wg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f38335c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.d90 d90Var = this.d;
        d90Var.setTextColor(w02);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        this.f38334b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f38336e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f38337f.a();
        this.f38333a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.zc0 zc0Var = this.f38333a;
        wg0 wg0Var = this.E;
        if (wg0Var.getParentActivity() == null) {
            return;
        }
        try {
            zc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f38334b.requestFocus();
        wg0.U0(wg0Var, zc0Var, true);
        postDelayed(new jf0(this, 1), 300L);
    }
}
