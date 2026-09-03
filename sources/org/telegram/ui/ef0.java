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
public final class ef0 extends org.telegram.ui.Components.vv0 {
    public final og0 B;
    public final org.telegram.ui.Components.cd0 f36474a;
    public final EditTextBoldCursor f36475b;
    public final TextView f36476c;
    public final org.telegram.ui.Components.g90 d;
    public final TextView f36477e;
    public final org.telegram.ui.Components.n90 f36478f;
    public final org.telegram.ui.Components.kj0 h;
    public Bundle f36479n;
    public boolean f36480r;
    public String f36481s;
    public String v;
    public String f36482w;
    public String f36483x;
    public GoogleSignInAccount f36484y;

    public ef0(org.telegram.ui.og0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ef0.<init>(org.telegram.ui.og0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.B.f39718e0;
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
        if (this.f36480r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f36484y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f36475b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f36481s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f36482w);
        bundle.putString("phoneHash", this.f36483x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f36484y;
        og0 og0Var = this.B;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (og0Var.C == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f36482w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f36483x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f36484y.f2571c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f36484y = null;
            i11 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f36480r = true;
            og0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (og0Var.C == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f36482w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f36483x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new cf0(this, 0), og0.f39709q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f36479n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f36475b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36475b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f36479n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        int i10;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f36475b;
        editTextBoldCursor.setText("");
        this.f36479n = bundle;
        this.f36481s = bundle.getString("phone");
        this.v = this.f36479n.getString("ephone");
        this.f36482w = this.f36479n.getString("phoneFormated");
        this.f36483x = this.f36479n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f36478f.setVisibility(i10);
        this.f36477e.setVisibility(i10);
        og0.T0(this.B, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f36476c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.g90 g90Var = this.d;
        g90Var.setTextColor(w02);
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21722gc, false));
        this.f36475b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f36477e.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21896q6, false));
        this.f36478f.a();
        this.f36474a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.cd0 cd0Var = this.f36474a;
        og0 og0Var = this.B;
        if (og0Var.getParentActivity() == null) {
            return;
        }
        try {
            cd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f36475b.requestFocus();
        og0.U0(og0Var, cd0Var, true);
        postDelayed(new cf0(this, 1), 300L);
    }
}
