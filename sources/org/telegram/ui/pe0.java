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
public final class pe0 extends org.telegram.ui.Components.tw0 {
    public final ah0 E;
    public final org.telegram.ui.Components.yd0[] f38894a;
    public final EditTextBoldCursor[] f38895b;
    public final TextView f38896c;
    public final TextView d;
    public final TextView e;
    public final ImageView f38897f;
    public String h;
    public String f38898n;
    public String f38899r;
    public TL_account.Password f38900s;
    public Bundle v;
    public boolean f38901w;
    public final int f38902x;
    public boolean f38903y;

    public pe0(ah0 ah0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f7;
        this.E = ah0Var;
        this.f38902x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f38895b = new EditTextBoldCursor[i11];
        this.f38894a = new org.telegram.ui.Components.yd0[i11];
        TextView textView = new TextView(context);
        this.f38896c = textView;
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
        addView(textView, w7.z5.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f38895b.length) {
            org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(context, null);
            this.f38894a[i15] = yd0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            yd0Var.setText(LocaleController.getString(i13));
            this.f38895b[i15] = new EditTextBoldCursor(context);
            this.f38895b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f38895b[i15].setCursorWidth(1.5f);
            this.f38895b[i15].setImeOptions(268435461);
            this.f38895b[i15].setTextSize(1, f10);
            this.f38895b[i15].setMaxLines(1);
            this.f38895b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f38895b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f38895b[i15].setInputType(129);
                this.f38895b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f38895b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f38895b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f38895b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new oe0(this, z10));
            this.f38895b[i15].setOnFocusChangeListener(new vd(yd0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f38895b[i15], w7.z5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f38897f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                f7 = f11;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final pe0 f37725b;

                    {
                        this.f37725b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                pe0 pe0Var = this.f37725b;
                                ImageView imageView2 = pe0Var.f38897f;
                                EditTextBoldCursor[] editTextBoldCursorArr = pe0Var.f38895b;
                                pe0Var.f38903y = !pe0Var.f38903y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (pe0Var.f38903y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(pe0Var.f38903y));
                                if (pe0Var.f38903y) {
                                    i16 = org.telegram.ui.ActionBar.g6.f19745l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.g6.H6;
                                }
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                                return;
                            default:
                                pe0 pe0Var2 = this.f37725b;
                                if (pe0Var2.f38902x == 0) {
                                    pe0Var2.o(null, null);
                                    return;
                                } else {
                                    pe0Var2.o(pe0Var2.f38898n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                yd0Var.addView(linearLayout, w7.z5.d(-2.0f, -1));
            } else {
                f7 = f11;
                yd0Var.addView(this.f38895b[i15], w7.z5.d(-2.0f, -1));
            }
            yd0Var.e(this.f38895b[i15]);
            addView(yd0Var, w7.z5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f38895b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    pe0 pe0Var = pe0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = pe0Var.f38895b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        pe0Var.h(null);
                        return true;
                    }
                    pe0Var.getClass();
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
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(f12), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 32.0f, -1, 80));
        addView(frameLayout, w7.z5.q(-1, -1, 80));
        m.h3.p(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final pe0 f37725b;

            {
                this.f37725b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f37725b;
                        ImageView imageView2 = pe0Var.f38897f;
                        EditTextBoldCursor[] editTextBoldCursorArr = pe0Var.f38895b;
                        pe0Var.f38903y = !pe0Var.f38903y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (pe0Var.f38903y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(pe0Var.f38903y));
                        if (pe0Var.f38903y) {
                            i16 = org.telegram.ui.ActionBar.g6.f19745l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.g6.H6;
                        }
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
                        return;
                    default:
                        pe0 pe0Var2 = this.f37725b;
                        if (pe0Var2.f38902x == 0) {
                            pe0Var2.o(null, null);
                            return;
                        } else {
                            pe0Var2.o(pe0Var2.f38898n, null);
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
        this.f38901w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f38901w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f38901w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f38895b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            ah0 ah0Var = this.E;
            if (length == 0) {
                if (ah0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f38902x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (ah0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f38899r);
                ah0Var.u1(10, true, bundle, false);
            } else {
                this.f38901w = true;
                ah0Var.n1(0, true);
                o(this.f38898n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new zz(this, 19), ah0.f33904t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f38902x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f38902x, this.v);
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
            editTextBoldCursorArr = this.f38895b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f38899r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f38900s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f38898n = this.v.getString("new_password");
        ah0.T0(this.E, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f38896c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f38895b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19745l6, false));
        }
        for (org.telegram.ui.Components.yd0 yd0Var : this.f38894a) {
            yd0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        ImageView imageView = this.f38897f;
        if (imageView != null) {
            if (this.f38903y) {
                i10 = org.telegram.ui.ActionBar.g6.f19745l6;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.H6;
            }
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
            imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(this.E.getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 1, -1));
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
            passwordinputsettings.new_algo = this.f38900s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.ey0(this, str, str2, tL_auth_recoverPassword, 16));
    }
}
