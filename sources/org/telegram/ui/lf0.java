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
public final class lf0 extends org.telegram.ui.Components.uv0 {
    public final wg0 E;
    public final org.telegram.ui.Components.yc0 f35487a;
    public final EditTextBoldCursor f35488b;
    public final TextView f35489c;
    public final org.telegram.ui.Components.c90 d;
    public final TextView e;
    public final org.telegram.ui.Components.j90 f35490f;
    public final org.telegram.ui.Components.aj0 h;
    public Bundle f35491n;
    public boolean f35492r;
    public String f35493s;
    public String v;
    public String f35494w;
    public String f35495x;
    public GoogleSignInAccount f35496y;

    public lf0(org.telegram.ui.wg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f39204h0;
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
        if (this.f35492r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f35496y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f35488b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f35493s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f35494w);
        bundle.putString("phoneHash", this.f35495x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f35496y;
        wg0 wg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (wg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f35494w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f35495x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f35496y.f5949c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f35496y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f35492r = true;
            wg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (wg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f35494w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f35495x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new jf0(this, 0), wg0.f39192t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f35491n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f35488b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35488b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f35491n;
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
        EditTextBoldCursor editTextBoldCursor = this.f35488b;
        editTextBoldCursor.setText("");
        this.f35491n = bundle;
        this.f35493s = bundle.getString("phone");
        this.v = this.f35491n.getString("ephone");
        this.f35494w = this.f35491n.getString("phoneFormated");
        this.f35495x = this.f35491n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f35490f.setVisibility(i10);
        this.e.setVisibility(i10);
        wg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f35489c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.c90 c90Var = this.d;
        c90Var.setTextColor(w02);
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f35488b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f35490f.a();
        this.f35487a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.yc0 yc0Var = this.f35487a;
        wg0 wg0Var = this.E;
        if (wg0Var.getParentActivity() == null) {
            return;
        }
        try {
            yc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f35488b.requestFocus();
        wg0.U0(wg0Var, yc0Var, true);
        postDelayed(new jf0(this, 1), 300L);
    }
}
