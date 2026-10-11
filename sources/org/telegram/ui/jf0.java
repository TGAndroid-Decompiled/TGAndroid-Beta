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
public final class jf0 extends org.telegram.ui.Components.zw0 {
    public final vg0 E;
    public final org.telegram.ui.Components.be0 f39026a;
    public final EditTextBoldCursor f39027b;
    public final TextView f39028c;
    public final org.telegram.ui.Components.fa0 d;
    public final TextView f39029e;
    public final org.telegram.ui.Components.ma0 f39030f;
    public final org.telegram.ui.Components.hk0 h;
    public Bundle f39031n;
    public boolean f39032r;
    public String f39033s;
    public String v;
    public String f39034w;
    public String f39035x;
    public GoogleSignInAccount f39036y;

    public jf0(org.telegram.ui.vg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jf0.<init>(org.telegram.ui.vg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f43023h0;
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
        if (this.f39032r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39036y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39027b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39033s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39034w);
        bundle.putString("phoneHash", this.f39035x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39036y;
        vg0 vg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (vg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39034w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39035x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39036y.f6449c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39036y = null;
            i11 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39032r = true;
            vg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (vg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39034w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39035x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new hf0(this, 0), vg0.f43010t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39031n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39027b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39027b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39031n;
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
        EditTextBoldCursor editTextBoldCursor = this.f39027b;
        editTextBoldCursor.setText("");
        this.f39031n = bundle;
        this.f39033s = bundle.getString("phone");
        this.v = this.f39031n.getString("ephone");
        this.f39034w = this.f39031n.getString("phoneFormated");
        this.f39035x = this.f39031n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39030f.setVisibility(i10);
        this.f39029e.setVisibility(i10);
        vg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f39028c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.fa0 fa0Var = this.d;
        fa0Var.setTextColor(x02);
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        this.f39027b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f39029e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f39030f.a();
        this.f39026a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.be0 be0Var = this.f39026a;
        vg0 vg0Var = this.E;
        if (vg0Var.getParentActivity() == null) {
            return;
        }
        try {
            be0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39027b.requestFocus();
        vg0.U0(vg0Var, be0Var, true);
        postDelayed(new hf0(this, 1), 300L);
    }
}
