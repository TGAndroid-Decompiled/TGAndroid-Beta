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
public final class if0 extends org.telegram.ui.Components.hw0 {
    public final tg0 E;
    public final org.telegram.ui.Components.jd0 f34462a;
    public final EditTextBoldCursor f34463b;
    public final TextView f34464c;
    public final org.telegram.ui.Components.p90 d;
    public final TextView e;
    public final org.telegram.ui.Components.w90 f34465f;
    public final org.telegram.ui.Components.nj0 h;
    public Bundle f34466n;
    public boolean f34467r;
    public String f34468s;
    public String v;
    public String f34469w;
    public String f34470x;
    public GoogleSignInAccount f34471y;

    public if0(org.telegram.ui.tg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.if0.<init>(org.telegram.ui.tg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f37795h0;
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
        if (this.f34467r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f34471y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f34463b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f34468s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f34469w);
        bundle.putString("phoneHash", this.f34470x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f34471y;
        tg0 tg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (tg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f34469w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f34470x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f34471y.f5938c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f34471y = null;
            i11 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new da(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f34467r = true;
            tg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (tg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f34469w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f34470x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new da(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new gf0(this, 0), tg0.f37783t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f34466n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f34463b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34463b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f34466n;
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
        EditTextBoldCursor editTextBoldCursor = this.f34463b;
        editTextBoldCursor.setText("");
        this.f34466n = bundle;
        this.f34468s = bundle.getString("phone");
        this.v = this.f34466n.getString("ephone");
        this.f34469w = this.f34466n.getString("phoneFormated");
        this.f34470x = this.f34466n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f34465f.setVisibility(i10);
        this.e.setVisibility(i10);
        tg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f34464c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.p90 p90Var = this.d;
        p90Var.setTextColor(w02);
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f34463b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f34465f.a();
        this.f34462a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.jd0 jd0Var = this.f34462a;
        tg0 tg0Var = this.E;
        if (tg0Var.getParentActivity() == null) {
            return;
        }
        try {
            jd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f34463b.requestFocus();
        tg0.U0(tg0Var, jd0Var, true);
        postDelayed(new gf0(this, 1), 300L);
    }
}
