package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class me0 extends org.telegram.ui.Components.ev0 {

    public final od0 f40454a;

    public final TextView f40455b;

    public final TextView f40456c;
    public final eh.s d;

    public final org.telegram.ui.Components.ri0 f40457e;

    public Bundle f40458f;
    public String h;

    public boolean f40459n;

    public String f40460r;

    public String f40461s;
    public String v;

    public boolean f40462w;

    public final ke0 f40463x;

    public final ig0 f40464y;

    public me0(ig0 ig0Var, Context context) {
        int i10;
        super(context);
        this.f40464y = ig0Var;
        this.f40463x = new ke0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f40457e = ri0Var;
        ri0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ri0Var.setAutoRepeat(false);
        frameLayout.addView(ri0Var, h7.z5.e(120, 120, 1));
        if (AndroidUtilities.isSmallScreen()) {
            i10 = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
        }
        frameLayout.setVisibility(i10);
        addView(frameLayout, h7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f40455b = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.EnterCode));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f40456c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
        addView(textView2, h7.z5.t(-2, -2, 1, 12, 8, 12, 0));
        od0 od0Var = new od0(this, context, 1);
        this.f40454a = od0Var;
        od0Var.b(6, 1);
        for (wr wrVar : od0Var.f43279f) {
            wrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            wrVar.addTextChangedListener(new p0(this, 8));
            wrVar.setOnFocusChangeListener(new ld(this, 6));
        }
        addView(this.f40454a, h7.z5.t(-2, 42, 1, 0, 32, 0, 0));
        eh.s sVar = new eh.s(context, null, false);
        this.d = sVar;
        sVar.setGravity(17);
        sVar.setTextSize(1, 14.0f);
        sVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        sVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sVar.setMaxLines(2);
        sVar.setOnClickListener(new u50(this, 6));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(sVar, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout2, h7.z5.l(1.0f, -1, 0));
        i6.q2(sVar);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.f40464y.k1(true, true);
        this.f40458f = null;
        this.f40459n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f40459n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        if (this.f40459n) {
            return;
        }
        od0 od0Var = this.f40454a;
        od0Var.f43278e = true;
        for (wr wrVar : od0Var.f43279f) {
            wrVar.j(0.0f);
        }
        String code = od0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f40459n = true;
        ig0 ig0Var = this.f40464y;
        ig0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new v80(6, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ke0(this, 0), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f40458f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f40454a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40454a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f40458f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        od0 od0Var = this.f40454a;
        od0Var.setText("");
        this.f40458f = bundle;
        this.h = bundle.getString("password");
        this.f40460r = this.f40458f.getString("requestPhone");
        this.f40461s = this.f40458f.getString("phoneHash");
        this.v = this.f40458f.getString("phoneCode");
        String string = this.f40458f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
        int iIndexOf = string.indexOf(42);
        int iLastIndexOf = string.lastIndexOf(42);
        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
            org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
            xz0Var.f34734a |= 256;
            xz0Var.f34735b = iIndexOf;
            int i10 = iLastIndexOf + 1;
            xz0Var.f34736c = i10;
            spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), spannableStringBuilderValueOf));
        ig0.T0(this.f40464y, od0Var);
        od0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f40455b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.f40456c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f40454a.invalidate();
    }

    public final void o(boolean z10) {
        od0 od0Var = this.f40454a;
        if (this.f40464y.getParentActivity() == null) {
            return;
        }
        try {
            od0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (wr wrVar : od0Var.f43279f) {
                wrVar.setText("");
            }
        }
        for (wr wrVar2 : od0Var.f43279f) {
            wrVar2.i(1.0f);
        }
        od0Var.f43279f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(od0Var, new ke0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f40463x);
    }
}
