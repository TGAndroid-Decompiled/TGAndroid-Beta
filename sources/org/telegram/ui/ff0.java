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
public final class ff0 extends org.telegram.ui.Components.vv0 {
    public final pg0 B;
    public final org.telegram.ui.Components.bd0 f34064a;
    public final EditTextBoldCursor f34065b;
    public final TextView f34066c;
    public final org.telegram.ui.Components.f90 d;
    public final TextView e;
    public final org.telegram.ui.Components.m90 f34067f;
    public final org.telegram.ui.Components.jj0 h;
    public Bundle f34068n;
    public boolean f34069r;
    public String f34070s;
    public String v;
    public String f34071w;
    public String f34072x;
    public GoogleSignInAccount f34073y;

    public ff0(org.telegram.ui.pg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff0.<init>(org.telegram.ui.pg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.B.f37133e0;
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
        if (this.f34069r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f34073y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f34065b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f34070s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f34071w);
        bundle.putString("phoneHash", this.f34072x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f34073y;
        pg0 pg0Var = this.B;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (pg0Var.C == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f34071w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f34072x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f34073y.f2633c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f34073y = null;
            i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new da(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f34069r = true;
            pg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (pg0Var.C == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f34071w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f34072x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new da(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new df0(this, 0), pg0.f37125q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f34068n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f34065b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f34065b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f34068n;
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
        EditTextBoldCursor editTextBoldCursor = this.f34065b;
        editTextBoldCursor.setText("");
        this.f34068n = bundle;
        this.f34070s = bundle.getString("phone");
        this.v = this.f34068n.getString("ephone");
        this.f34071w = this.f34068n.getString("phoneFormated");
        this.f34072x = this.f34068n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f34067f.setVisibility(i10);
        this.e.setVisibility(i10);
        pg0.T0(this.B, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f34066c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.f90 f90Var = this.d;
        f90Var.setTextColor(w02);
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19941gc, false));
        this.f34065b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
        this.f34067f.a();
        this.f34064a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.bd0 bd0Var = this.f34064a;
        pg0 pg0Var = this.B;
        if (pg0Var.getParentActivity() == null) {
            return;
        }
        try {
            bd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f34065b.requestFocus();
        pg0.U0(pg0Var, bd0Var, true);
        postDelayed(new df0(this, 1), 300L);
    }
}
