package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qc0 extends org.telegram.ui.Components.vt0 {
    public GoogleSignInAccount E;
    public final xd0 F;
    public final org.telegram.ui.Components.gb0 f48849a;
    public final EditTextBoldCursor f48850b;
    public final TextView f48851c;
    public final org.telegram.ui.Components.s70 d;
    public final TextView f48852e;
    public final org.telegram.ui.Components.z70 f48853f;
    public final org.telegram.ui.Components.fh0 h;
    public Bundle f48854n;
    public boolean f48855r;
    public String f48856s;
    public String f48857w;
    public String f48858x;
    public String f48859y;

    public qc0(org.telegram.ui.xd0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qc0.<init>(org.telegram.ui.xd0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.F.f51959i0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131754441, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i3;
        int i10;
        if (this.f48855r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6506c;
        } else {
            obj = this.f48850b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f48856s);
        bundle.putString("ephone", this.f48857w);
        bundle.putString("phoneFormated", this.f48858x);
        bundle.putString("phoneHash", this.f48859y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.E;
        xd0 xd0Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (xd0Var.G == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f48858x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f48859y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.f6505b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new y9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f48855r = true;
            xd0Var.w1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (xd0Var.G == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f48858x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f48859y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
            ConnectionsManager.getInstance(i3).sendRequest(sendverifyemailcode, new y9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new pc0(this, 0), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f48854n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f48850b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f48850b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f48854n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i3;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f48850b;
        editTextBoldCursor.setText("");
        this.f48854n = bundle;
        this.f48856s = bundle.getString("phone");
        this.f48857w = this.f48854n.getString("ephone");
        this.f48858x = this.f48854n.getString("phoneFormated");
        this.f48859y = this.f48854n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.lt.f24103b.hasServices()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f48853f.setVisibility(i3);
        this.f48852e.setVisibility(i3);
        xd0.a1(this.F, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.gb0 gb0Var = this.f48849a;
        xd0 xd0Var = this.F;
        if (xd0Var.getParentActivity() == null) {
            return;
        }
        try {
            gb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f48850b.requestFocus();
        xd0.b1(xd0Var, gb0Var, true);
        postDelayed(new pc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.f48851c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.s70 s70Var = this.d;
        s70Var.setTextColor(x02);
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        this.f48850b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f48852e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        this.f48853f.updateColors();
        this.f48849a.invalidate();
    }
}
