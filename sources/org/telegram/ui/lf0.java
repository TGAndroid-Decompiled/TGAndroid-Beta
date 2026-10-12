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
public final class lf0 extends org.telegram.ui.Components.dx0 {
    public final xg0 E;
    public final org.telegram.ui.Components.de0 f39728a;
    public final EditTextBoldCursor f39729b;
    public final TextView f39730c;
    public final org.telegram.ui.Components.ia0 d;
    public final TextView f39731e;
    public final org.telegram.ui.Components.pa0 f39732f;
    public final org.telegram.ui.Components.ik0 h;
    public Bundle f39733n;
    public boolean f39734r;
    public String f39735s;
    public String v;
    public String f39736w;
    public String f39737x;
    public GoogleSignInAccount f39738y;

    public lf0(org.telegram.ui.xg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lf0.<init>(org.telegram.ui.xg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f43944h0;
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
        if (this.f39734r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f39738y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f39729b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f39735s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f39736w);
        bundle.putString("phoneHash", this.f39737x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f39738y;
        xg0 xg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (xg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f39736w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f39737x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f39738y.f6448c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f39738y = null;
            i11 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ea(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f39734r = true;
            xg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (xg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f39736w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f39737x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ea(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new jf0(this, 0), xg0.f43931t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f39733n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f39729b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f39729b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f39733n;
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
        EditTextBoldCursor editTextBoldCursor = this.f39729b;
        editTextBoldCursor.setText("");
        this.f39733n = bundle;
        this.f39735s = bundle.getString("phone");
        this.v = this.f39733n.getString("ephone");
        this.f39736w = this.f39733n.getString("phoneFormated");
        this.f39737x = this.f39733n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f39732f.setVisibility(i10);
        this.f39731e.setVisibility(i10);
        xg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f39730c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.ia0 ia0Var = this.d;
        ia0Var.setTextColor(x02);
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        this.f39729b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f39731e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f39732f.a();
        this.f39728a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.de0 de0Var = this.f39728a;
        xg0 xg0Var = this.E;
        if (xg0Var.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f39729b.requestFocus();
        xg0.U0(xg0Var, de0Var, true);
        postDelayed(new jf0(this, 1), 300L);
    }
}
