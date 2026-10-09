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
    public final org.telegram.ui.Components.zd0 f39262a;
    public final EditTextBoldCursor f39263b;
    public final TextView f39264c;
    public final org.telegram.ui.Components.ea0 d;
    public final TextView f39265e;
    public final org.telegram.ui.Components.la0 f39266f;
    public final org.telegram.ui.Components.fk0 h;
    public Bundle f39267n;
    public boolean f39268r;
    public String f39269s;
    public String v;
    public String f39270w;
    public String f39271x;
    public GoogleSignInAccount f39272y;

    public kf0(org.telegram.ui.wg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kf0.<init>(org.telegram.ui.wg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f43584h0;
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
        if (this.f39268r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39272y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39263b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39269s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39270w);
        bundle.putString("phoneHash", this.f39271x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39272y;
        wg0 wg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (wg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39270w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39271x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39272y.f6450c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39272y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ba(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39268r = true;
            wg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (wg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39270w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39271x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ba(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new if0(this, 0), wg0.f43571t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39267n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39263b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39263b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39267n;
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
        EditTextBoldCursor editTextBoldCursor = this.f39263b;
        editTextBoldCursor.setText("");
        this.f39267n = bundle;
        this.f39269s = bundle.getString("phone");
        this.v = this.f39267n.getString("ephone");
        this.f39270w = this.f39267n.getString("phoneFormated");
        this.f39271x = this.f39267n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39266f.setVisibility(i10);
        this.f39265e.setVisibility(i10);
        wg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        this.f39264c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false);
        org.telegram.ui.Components.ea0 ea0Var = this.d;
        ea0Var.setTextColor(x02);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.gc, false));
        this.f39263b.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.f39265e.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f39266f.a();
        this.f39262a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.zd0 zd0Var = this.f39262a;
        wg0 wg0Var = this.E;
        if (wg0Var.getParentActivity() == null) {
            return;
        }
        try {
            zd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39263b.requestFocus();
        wg0.U0(wg0Var, zd0Var, true);
        postDelayed(new if0(this, 1), 300L);
    }
}
