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
public final class jf0 extends org.telegram.ui.Components.yw0 {
    public final vg0 E;
    public final org.telegram.ui.Components.ae0 f39060a;
    public final EditTextBoldCursor f39061b;
    public final TextView f39062c;
    public final org.telegram.ui.Components.ea0 d;
    public final TextView f39063e;
    public final org.telegram.ui.Components.la0 f39064f;
    public final org.telegram.ui.Components.gk0 h;
    public Bundle f39065n;
    public boolean f39066r;
    public String f39067s;
    public String v;
    public String f39068w;
    public String f39069x;
    public GoogleSignInAccount f39070y;

    public jf0(org.telegram.ui.vg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.<init>(org.telegram.ui.vg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f43057h0;
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
        if (this.f39066r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39070y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39061b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39067s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39068w);
        bundle.putString("phoneHash", this.f39069x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39070y;
        vg0 vg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (vg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39068w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39069x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39070y.f6449c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39070y = null;
            i11 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39066r = true;
            vg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (vg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39068w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39069x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new hf0(this, 0), vg0.f43044t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39065n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39061b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39061b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39065n;
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
        EditTextBoldCursor editTextBoldCursor = this.f39061b;
        editTextBoldCursor.setText("");
        this.f39065n = bundle;
        this.f39067s = bundle.getString("phone");
        this.v = this.f39065n.getString("ephone");
        this.f39068w = this.f39065n.getString("phoneFormated");
        this.f39069x = this.f39065n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39064f.setVisibility(i10);
        this.f39063e.setVisibility(i10);
        vg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f39062c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.ea0 ea0Var = this.d;
        ea0Var.setTextColor(x02);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        this.f39061b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f39063e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f39064f.a();
        this.f39060a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.ae0 ae0Var = this.f39060a;
        vg0 vg0Var = this.E;
        if (vg0Var.getParentActivity() == null) {
            return;
        }
        try {
            ae0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39061b.requestFocus();
        vg0.U0(vg0Var, ae0Var, true);
        postDelayed(new hf0(this, 1), 300L);
    }
}
