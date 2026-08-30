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
public final class df0 extends org.telegram.ui.Components.vv0 {
    public final ng0 B;
    public final org.telegram.ui.Components.ad0 f33620a;
    public final EditTextBoldCursor f33621b;
    public final TextView f33622c;
    public final org.telegram.ui.Components.e90 d;
    public final TextView e;
    public final org.telegram.ui.Components.l90 f33623f;
    public final org.telegram.ui.Components.jj0 h;
    public Bundle f33624n;
    public boolean f33625r;
    public String f33626s;
    public String v;
    public String f33627w;
    public String f33628x;
    public GoogleSignInAccount f33629y;

    public df0(org.telegram.ui.ng0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.df0.<init>(org.telegram.ui.ng0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.B.f36629e0;
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
        if (this.f33625r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f33629y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f33621b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f33626s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f33627w);
        bundle.putString("phoneHash", this.f33628x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f33629y;
        ng0 ng0Var = this.B;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ng0Var.C == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f33627w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f33628x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f33629y.f2650c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f33629y = null;
            i11 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f33625r = true;
            ng0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ng0Var.C == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f33627w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f33628x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new bf0(this, 0), ng0.f36621q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f33624n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f33621b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f33621b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f33624n;
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
        EditTextBoldCursor editTextBoldCursor = this.f33621b;
        editTextBoldCursor.setText("");
        this.f33624n = bundle;
        this.f33626s = bundle.getString("phone");
        this.v = this.f33624n.getString("ephone");
        this.f33627w = this.f33624n.getString("phoneFormated");
        this.f33628x = this.f33624n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f33623f.setVisibility(i10);
        this.e.setVisibility(i10);
        ng0.T0(this.B, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f33622c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.e90 e90Var = this.d;
        e90Var.setTextColor(w02);
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19966gc, false));
        this.f33621b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false));
        this.f33623f.a();
        this.f33620a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.ad0 ad0Var = this.f33620a;
        ng0 ng0Var = this.B;
        if (ng0Var.getParentActivity() == null) {
            return;
        }
        try {
            ad0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f33621b.requestFocus();
        ng0.U0(ng0Var, ad0Var, true);
        postDelayed(new bf0(this, 1), 300L);
    }
}
