package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class be0 extends org.telegram.ui.Components.ev0 {

    public final EditTextBoldCursor f36793a;

    public final TextView f36794b;

    public final TextView f36795c;
    public final TextView d;

    public final org.telegram.ui.Components.ri0 f36796e;

    public Bundle f36797f;
    public boolean h;

    public TL_account.Password f36798n;

    public String f36799r;

    public String f36800s;
    public String v;

    public String f36801w;

    public final org.telegram.ui.Components.jc0 f36802x;

    public final ig0 f36803y;

    public be0(ig0 ig0Var, Context context) {
        int i10;
        super(context);
        this.f36803y = ig0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f36796e = ri0Var;
        ri0Var.f(R.raw.tsv_setup_intro, 120, 120, null);
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
        this.d = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.YourPasswordHeader));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f36794b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
        addView(textView2, h7.z5.t(-2, -2, 1, 12, 8, 12, 0));
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
        this.f36802x = jc0Var;
        jc0Var.setText(LocaleController.getString(R.string.EnterPassword));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36793a = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int iDp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(iDp, iDp, iDp, iDp);
        editTextBoldCursor.setInputType(129);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setGravity(LocaleController.isRTL ? 5 : 3);
        editTextBoldCursor.setOnFocusChangeListener(new ld(this, 4));
        jc0Var.e(editTextBoldCursor);
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new fa(this, 5));
        addView(jc0Var, h7.z5.t(-1, -2, 1, 16, 32, 16, 0));
        TextView textView3 = new TextView(context);
        this.f36795c = textView3;
        textView3.setGravity(19);
        textView3.setText(LocaleController.getString(R.string.ForgotPassword));
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(textView3, h7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout2, h7.z5.q(-1, -1, 80));
        i6.q2(textView3);
        textView3.setOnClickListener(new u70(7, this, context));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.h = false;
        this.f36803y.k1(true, true);
        this.f36797f = null;
        return true;
    }

    @Override
    public final void d() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        if (this.h || this.f36798n == null) {
            return;
        }
        String string = this.f36793a.getText().toString();
        if (string.length() != 0) {
            this.h = true;
            this.f36803y.n1(0, true);
            Utilities.globalQueue.postRunnable(new a30(25, this, string));
        } else {
            ig0 ig0Var = this.f36803y;
            if (ig0Var.getParentActivity() == null) {
                return;
            }
            ig0.U0(ig0Var, this.f36802x, true);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new r00(this, 19), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f36797f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.f36793a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String string = this.f36793a.getText().toString();
        if (string.length() != 0) {
            bundle.putString("passview_code", string);
        }
        Bundle bundle2 = this.f36797f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        boolean zIsEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.f36793a;
        if (zIsEmpty) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f36797f = bundle;
        String string = bundle.getString("password");
        this.f36799r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            this.f36798n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.f36800s = bundle.getString("phoneFormated");
        this.v = bundle.getString("phoneHash");
        this.f36801w = bundle.getString("code");
        TL_account.Password password = this.f36798n;
        if (password == null || TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint((CharSequence) null);
        } else {
            editTextBoldCursor.setHint(this.f36798n.hint);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f36794b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f36793a;
        editTextBoldCursor.setTextColor(iW0);
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
        this.f36795c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f36802x.f();
    }
}
