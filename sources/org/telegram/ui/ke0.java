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
public final class ke0 extends org.telegram.ui.Components.qw0 {
    public final ug0 E;
    public final org.telegram.ui.Components.ld0[] f37947a;
    public final EditTextBoldCursor[] f37948b;
    public final TextView f37949c;
    public final TextView d;
    public final TextView f37950e;
    public final ImageView f37951f;
    public String h;
    public String f37952n;
    public String f37953r;
    public TL_account.Password f37954s;
    public Bundle v;
    public boolean f37955w;
    public final int f37956x;
    public boolean f37957y;

    public ke0(ug0 ug0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        this.E = ug0Var;
        this.f37956x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f37948b = new EditTextBoldCursor[i11];
        this.f37947a = new org.telegram.ui.Components.ld0[i11];
        TextView textView = new TextView(context);
        this.f37949c = textView;
        float f7 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        if (AndroidUtilities.isSmallScreen()) {
            i12 = 16;
        } else {
            i12 = 72;
        }
        addView(textView, w7.z5.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f37948b.length) {
            org.telegram.ui.Components.ld0 ld0Var = new org.telegram.ui.Components.ld0(context, null);
            this.f37947a[i15] = ld0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            ld0Var.setText(LocaleController.getString(i13));
            this.f37948b[i15] = new EditTextBoldCursor(context);
            this.f37948b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f37948b[i15].setCursorWidth(1.5f);
            this.f37948b[i15].setImeOptions(268435461);
            this.f37948b[i15].setTextSize(1, f7);
            this.f37948b[i15].setMaxLines(1);
            this.f37948b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f37948b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f37948b[i15].setInputType(129);
                this.f37948b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f37948b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f37948b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f37948b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new je0(this, z10));
            this.f37948b[i15].setOnFocusChangeListener(new rd(ld0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f37948b[i15], w7.z5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f37951f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ke0 f36603b;

                    {
                        this.f36603b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                ke0 ke0Var = this.f36603b;
                                ImageView imageView2 = ke0Var.f37951f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ke0Var.f37948b;
                                ke0Var.f37957y = !ke0Var.f37957y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (ke0Var.f37957y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ke0Var.f37957y));
                                if (ke0Var.f37957y) {
                                    i16 = org.telegram.ui.ActionBar.i6.f20964l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.i6.H6;
                                }
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                                return;
                            default:
                                ke0 ke0Var2 = this.f36603b;
                                if (ke0Var2.f37956x == 0) {
                                    ke0Var2.o(null, null);
                                    return;
                                } else {
                                    ke0Var2.o(ke0Var2.f37952n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                ld0Var.addView(linearLayout, w7.z5.c(-2.0f, -1));
            } else {
                ld0Var.addView(this.f37948b[i15], w7.z5.c(-2.0f, -1));
            }
            ld0Var.e(this.f37948b[i15]);
            addView(ld0Var, w7.z5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f37948b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    ke0 ke0Var = ke0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ke0Var.f37948b;
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
            f7 = 18.0f;
        }
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.f37950e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.z5.q(-1, -1, 80));
        n7.z0.n(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ke0 f36603b;

            {
                this.f36603b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        ke0 ke0Var = this.f36603b;
                        ImageView imageView2 = ke0Var.f37951f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ke0Var.f37948b;
                        ke0Var.f37957y = !ke0Var.f37957y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (ke0Var.f37957y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ke0Var.f37957y));
                        if (ke0Var.f37957y) {
                            i16 = org.telegram.ui.ActionBar.i6.f20964l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.i6.H6;
                        }
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                        return;
                    default:
                        ke0 ke0Var2 = this.f36603b;
                        if (ke0Var2.f37956x == 0) {
                            ke0Var2.o(null, null);
                            return;
                        } else {
                            ke0Var2.o(ke0Var2.f37952n, null);
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
        this.f37955w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f37955w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f37955w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f37948b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            ug0 ug0Var = this.E;
            if (length == 0) {
                if (ug0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f37956x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (ug0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f37953r);
                ug0Var.u1(10, true, bundle, false);
            } else {
                this.f37955w = true;
                ug0Var.n1(0, true);
                o(this.f37952n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new g10(this, 18), ug0.f41191t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f37956x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f37956x, this.v);
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
            editTextBoldCursorArr = this.f37948b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f37953r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f37954s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f37952n = this.v.getString("new_password");
        ug0.T0(this.E, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f37949c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f37948b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20964l6, false));
        }
        for (org.telegram.ui.Components.ld0 ld0Var : this.f37947a) {
            ld0Var.f();
        }
        this.f37950e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        ImageView imageView = this.f37951f;
        if (imageView != null) {
            if (this.f37957y) {
                i10 = org.telegram.ui.ActionBar.i6.f20964l6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.H6;
            }
            imageView.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(this.E.getThemedColor(org.telegram.ui.ActionBar.i6.f20908i6), 1, -1));
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
            passwordinputsettings.new_algo = this.f37954s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.bo0(this, str, str2, tL_auth_recoverPassword, 18));
    }
}
