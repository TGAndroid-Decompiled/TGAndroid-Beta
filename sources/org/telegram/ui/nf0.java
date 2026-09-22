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
public final class nf0 extends org.telegram.ui.Components.hw0 {
    public final yg0 E;
    public final org.telegram.ui.Components.kd0 f36028a;
    public final EditTextBoldCursor f36029b;
    public final TextView f36030c;
    public final org.telegram.ui.Components.n90 d;
    public final TextView e;
    public final org.telegram.ui.Components.u90 f36031f;
    public final org.telegram.ui.Components.nj0 h;
    public Bundle f36032n;
    public boolean f36033r;
    public String f36034s;
    public String v;
    public String f36035w;
    public String f36036x;
    public GoogleSignInAccount f36037y;

    public nf0(org.telegram.ui.yg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nf0.<init>(org.telegram.ui.yg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f39940h0;
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
        if (this.f36033r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f36037y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f36029b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f36034s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f36035w);
        bundle.putString("phoneHash", this.f36036x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f36037y;
        yg0 yg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (yg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f36035w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f36036x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f36037y.f5953c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f36037y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f36033r = true;
            yg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (yg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f36035w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f36036x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new lf0(this, 0), yg0.f39928t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f36032n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f36029b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f36029b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f36032n;
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
        EditTextBoldCursor editTextBoldCursor = this.f36029b;
        editTextBoldCursor.setText("");
        this.f36032n = bundle;
        this.f36034s = bundle.getString("phone");
        this.v = this.f36032n.getString("ephone");
        this.f36035w = this.f36032n.getString("phoneFormated");
        this.f36036x = this.f36032n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f36031f.setVisibility(i10);
        this.e.setVisibility(i10);
        yg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        this.f36030c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.n90 n90Var = this.d;
        n90Var.setTextColor(w02);
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        this.f36029b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.f36031f.a();
        this.f36028a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.kd0 kd0Var = this.f36028a;
        yg0 yg0Var = this.E;
        if (yg0Var.getParentActivity() == null) {
            return;
        }
        try {
            kd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f36029b.requestFocus();
        yg0.U0(yg0Var, kd0Var, true);
        postDelayed(new lf0(this, 1), 300L);
    }
}
