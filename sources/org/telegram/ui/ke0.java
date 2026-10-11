package org.telegram.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ke0 extends org.telegram.ui.Components.yw0 {
    public final vg0 E;
    public final org.telegram.ui.Components.ae0[] f39344a;
    public final EditTextBoldCursor[] f39345b;
    public final TextView f39346c;
    public final TextView d;
    public final TextView f39347e;
    public final ImageView f39348f;
    public String h;
    public String f39349n;
    public String f39350r;
    public TL_account.Password f39351s;
    public Bundle v;
    public boolean f39352w;
    public final int f39353x;
    public boolean f39354y;

    public ke0(vg0 vg0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f7;
        this.E = vg0Var;
        this.f39353x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f39345b = new EditTextBoldCursor[i11];
        this.f39344a = new org.telegram.ui.Components.ae0[i11];
        TextView textView = new TextView(context);
        this.f39346c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        float f11 = 2.0f;
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        if (AndroidUtilities.isSmallScreen()) {
            i12 = 16;
        } else {
            i12 = 72;
        }
        addView(textView, w7.x5.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.x5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f39345b.length) {
            org.telegram.ui.Components.ae0 ae0Var = new org.telegram.ui.Components.ae0(context, null);
            this.f39344a[i15] = ae0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            ae0Var.setText(LocaleController.getString(i13));
            this.f39345b[i15] = new EditTextBoldCursor(context);
            this.f39345b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f39345b[i15].setCursorWidth(1.5f);
            this.f39345b[i15].setImeOptions(268435461);
            this.f39345b[i15].setTextSize(1, f10);
            this.f39345b[i15].setMaxLines(1);
            this.f39345b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f39345b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f39345b[i15].setInputType(129);
                this.f39345b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f39345b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f39345b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f39345b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new je0(this, z10));
            this.f39345b[i15].setOnFocusChangeListener(new od(ae0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f39345b[i15], w7.x5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f39348f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                f7 = f11;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ke0 f38094b;

                    {
                        this.f38094b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                ke0 ke0Var = this.f38094b;
                                ImageView imageView2 = ke0Var.f39348f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ke0Var.f39345b;
                                ke0Var.f39354y = !ke0Var.f39354y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (ke0Var.f39354y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ke0Var.f39354y));
                                if (ke0Var.f39354y) {
                                    i16 = org.telegram.ui.ActionBar.h6.f20968l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.h6.H6;
                                }
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                                return;
                            default:
                                ke0 ke0Var2 = this.f38094b;
                                if (ke0Var2.f39353x == 0) {
                                    ke0Var2.o(null, null);
                                    return;
                                } else {
                                    ke0Var2.o(ke0Var2.f39349n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                ae0Var.addView(linearLayout, w7.x5.d(-2.0f, -1));
            } else {
                f7 = f11;
                ae0Var.addView(this.f39345b[i15], w7.x5.d(-2.0f, -1));
            }
            ae0Var.e(this.f39345b[i15]);
            addView(ae0Var, w7.x5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f39345b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    ke0 ke0Var = ke0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ke0Var.f39345b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        ke0Var.h(null);
                        return true;
                    }
                    ke0Var.getClass();
                    return false;
                }
            });
            i15++;
            f11 = f7;
            f10 = 18.0f;
        }
        float f12 = f11;
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.f39347e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(f12), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 32.0f, -1, 80));
        addView(frameLayout, w7.x5.q(-1, -1, 80));
        la.h.n(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ke0 f38094b;

            {
                this.f38094b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        ke0 ke0Var = this.f38094b;
                        ImageView imageView2 = ke0Var.f39348f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ke0Var.f39345b;
                        ke0Var.f39354y = !ke0Var.f39354y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (ke0Var.f39354y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ke0Var.f39354y));
                        if (ke0Var.f39354y) {
                            i16 = org.telegram.ui.ActionBar.h6.f20968l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.h6.H6;
                        }
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                        return;
                    default:
                        ke0 ke0Var2 = this.f38094b;
                        if (ke0Var2.f39353x == 0) {
                            ke0Var2.o(null, null);
                            return;
                        } else {
                            ke0Var2.o(ke0Var2.f39349n, null);
                            return;
                        }
                }
            }
        });
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.E.k1(true, true);
        this.v = null;
        this.f39352w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39352w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f39352w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f39345b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            vg0 vg0Var = this.E;
            if (length == 0) {
                if (vg0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f39353x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (vg0Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.f39350r);
                vg0Var.u1(10, true, bundle, false);
            } else {
                this.f39352w = true;
                vg0Var.n1(0, true);
                o(this.f39349n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new tz(this, 19), vg0.f43044t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f39353x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f39353x, this.v);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            editTextBoldCursorArr = this.f39345b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f39350r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f39351s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f39349n = this.v.getString("new_password");
        vg0.T0(this.E, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f39346c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f39345b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20968l6, false));
        }
        for (org.telegram.ui.Components.ae0 ae0Var : this.f39344a) {
            ae0Var.f();
        }
        this.f39347e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        ImageView imageView = this.f39348f;
        if (imageView != null) {
            if (this.f39354y) {
                i10 = org.telegram.ui.ActionBar.h6.f20968l6;
            } else {
                i10 = org.telegram.ui.ActionBar.h6.H6;
            }
            imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
            imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(this.E.getThemedColor(org.telegram.ui.ActionBar.h6.f20913i6), 1, -1));
        }
    }

    public final void o(String str, String str2) {
        String str3;
        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
        tL_auth_recoverPassword.code = this.h;
        if (!TextUtils.isEmpty(str)) {
            tL_auth_recoverPassword.flags |= 1;
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            passwordinputsettings.flags |= 1;
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            passwordinputsettings.hint = str3;
            passwordinputsettings.new_algo = this.f39351s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.po0(this, str, str2, tL_auth_recoverPassword, 18));
    }
}
