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
public final class nf0 extends org.telegram.ui.Components.fw0 {
    public final yg0 E;
    public final org.telegram.ui.Components.hd0 f36007a;
    public final EditTextBoldCursor f36008b;
    public final TextView f36009c;
    public final org.telegram.ui.Components.k90 d;
    public final TextView e;
    public final org.telegram.ui.Components.r90 f36010f;
    public final org.telegram.ui.Components.kj0 h;
    public Bundle f36011n;
    public boolean f36012r;
    public String f36013s;
    public String v;
    public String f36014w;
    public String f36015x;
    public GoogleSignInAccount f36016y;

    public nf0(org.telegram.ui.yg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nf0.<init>(org.telegram.ui.yg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f39920h0;
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
        if (this.f36012r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f36016y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f36008b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f36013s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f36014w);
        bundle.putString("phoneHash", this.f36015x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f36016y;
        yg0 yg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (yg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f36014w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f36015x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f36016y.f5955c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f36016y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f36012r = true;
            yg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (yg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f36014w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f36015x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new lf0(this, 0), yg0.f39908t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f36011n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f36008b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36008b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f36011n;
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
        EditTextBoldCursor editTextBoldCursor = this.f36008b;
        editTextBoldCursor.setText("");
        this.f36011n = bundle;
        this.f36013s = bundle.getString("phone");
        this.v = this.f36011n.getString("ephone");
        this.f36014w = this.f36011n.getString("phoneFormated");
        this.f36015x = this.f36011n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f36010f.setVisibility(i10);
        this.e.setVisibility(i10);
        yg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f36009c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.k90 k90Var = this.d;
        k90Var.setTextColor(w02);
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        this.f36008b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f36010f.a();
        this.f36007a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.hd0 hd0Var = this.f36007a;
        yg0 yg0Var = this.E;
        if (yg0Var.getParentActivity() == null) {
            return;
        }
        try {
            hd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f36008b.requestFocus();
        yg0.U0(yg0Var, hd0Var, true);
        postDelayed(new lf0(this, 1), 300L);
    }
}
