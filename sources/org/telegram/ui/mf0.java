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
public final class mf0 extends org.telegram.ui.Components.gw0 {
    public final xg0 E;
    public final org.telegram.ui.Components.id0 f35647a;
    public final EditTextBoldCursor f35648b;
    public final TextView f35649c;
    public final org.telegram.ui.Components.l90 d;
    public final TextView e;
    public final org.telegram.ui.Components.s90 f35650f;
    public final org.telegram.ui.Components.lj0 h;
    public Bundle f35651n;
    public boolean f35652r;
    public String f35653s;
    public String v;
    public String f35654w;
    public String f35655x;
    public GoogleSignInAccount f35656y;

    public mf0(org.telegram.ui.xg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mf0.<init>(org.telegram.ui.xg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f39472h0;
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
        if (this.f35652r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f35656y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f35648b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f35653s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f35654w);
        bundle.putString("phoneHash", this.f35655x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f35656y;
        xg0 xg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (xg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f35654w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f35655x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f35656y.f5954c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f35656y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f35652r = true;
            xg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (xg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f35654w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f35655x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new kf0(this, 0), xg0.f39460t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f35651n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f35648b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f35648b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f35651n;
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
        EditTextBoldCursor editTextBoldCursor = this.f35648b;
        editTextBoldCursor.setText("");
        this.f35651n = bundle;
        this.f35653s = bundle.getString("phone");
        this.v = this.f35651n.getString("ephone");
        this.f35654w = this.f35651n.getString("phoneFormated");
        this.f35655x = this.f35651n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f35650f.setVisibility(i10);
        this.e.setVisibility(i10);
        xg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f35649c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.l90 l90Var = this.d;
        l90Var.setTextColor(w02);
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        this.f35648b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f35650f.a();
        this.f35647a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.id0 id0Var = this.f35647a;
        xg0 xg0Var = this.E;
        if (xg0Var.getParentActivity() == null) {
            return;
        }
        try {
            id0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f35648b.requestFocus();
        xg0.U0(xg0Var, id0Var, true);
        postDelayed(new kf0(this, 1), 300L);
    }
}
