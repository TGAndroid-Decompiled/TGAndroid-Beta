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
public final class kf0 extends org.telegram.ui.Components.xw0 {
    public final wg0 E;
    public final org.telegram.ui.Components.zd0 f39264a;
    public final EditTextBoldCursor f39265b;
    public final TextView f39266c;
    public final org.telegram.ui.Components.ea0 d;
    public final TextView f39267e;
    public final org.telegram.ui.Components.la0 f39268f;
    public final org.telegram.ui.Components.fk0 h;
    public Bundle f39269n;
    public boolean f39270r;
    public String f39271s;
    public String v;
    public String f39272w;
    public String f39273x;
    public GoogleSignInAccount f39274y;

    public kf0(org.telegram.ui.wg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f43586h0;
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
        if (this.f39270r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39274y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39265b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39271s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39272w);
        bundle.putString("phoneHash", this.f39273x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39274y;
        wg0 wg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (wg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39272w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39273x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39274y.f6450c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39274y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39270r = true;
            wg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (wg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39272w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39273x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new if0(this, 0), wg0.f43573t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39269n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39265b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39265b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39269n;
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
        EditTextBoldCursor editTextBoldCursor = this.f39265b;
        editTextBoldCursor.setText("");
        this.f39269n = bundle;
        this.f39271s = bundle.getString("phone");
        this.v = this.f39269n.getString("ephone");
        this.f39272w = this.f39269n.getString("phoneFormated");
        this.f39273x = this.f39269n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39268f.setVisibility(i10);
        this.f39267e.setVisibility(i10);
        wg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f39266c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.ea0 ea0Var = this.d;
        ea0Var.setTextColor(x02);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f39265b.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.f39267e.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f39268f.a();
        this.f39264a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.zd0 zd0Var = this.f39264a;
        wg0 wg0Var = this.E;
        if (wg0Var.getParentActivity() == null) {
            return;
        }
        try {
            zd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39265b.requestFocus();
        wg0.U0(wg0Var, zd0Var, true);
        postDelayed(new if0(this, 1), 300L);
    }
}
