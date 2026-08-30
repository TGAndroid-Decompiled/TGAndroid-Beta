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
public final class de0 extends org.telegram.ui.Components.vv0 {
    public final ng0 B;
    public final org.telegram.ui.Components.ad0[] f33604a;
    public final EditTextBoldCursor[] f33605b;
    public final TextView f33606c;
    public final TextView d;
    public final TextView e;
    public final ImageView f33607f;
    public String h;
    public String f33608n;
    public String f33609r;
    public TL_account.Password f33610s;
    public Bundle v;
    public boolean f33611w;
    public final int f33612x;
    public boolean f33613y;

    public de0(ng0 ng0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        this.B = ng0Var;
        this.f33612x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f33605b = new EditTextBoldCursor[i11];
        this.f33604a = new org.telegram.ui.Components.ad0[i11];
        TextView textView = new TextView(context);
        this.f33606c = textView;
        float f10 = 18.0f;
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
        addView(textView, k7.b6.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, k7.b6.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f33605b.length) {
            org.telegram.ui.Components.ad0 ad0Var = new org.telegram.ui.Components.ad0(context, null);
            this.f33604a[i15] = ad0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            ad0Var.setText(LocaleController.getString(i13));
            this.f33605b[i15] = new EditTextBoldCursor(context);
            this.f33605b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f33605b[i15].setCursorWidth(1.5f);
            this.f33605b[i15].setImeOptions(268435461);
            this.f33605b[i15].setTextSize(1, f10);
            this.f33605b[i15].setMaxLines(1);
            this.f33605b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f33605b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f33605b[i15].setInputType(129);
                this.f33605b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f33605b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f33605b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f33605b[i15];
            if (i15 == 0 && i10 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new dg.a4(this, z4));
            this.f33605b[i15].setOnFocusChangeListener(new qd(ad0Var, 3));
            if (z4) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f33605b[i15], k7.b6.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f33607f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final de0 f32559b;

                    {
                        this.f32559b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                de0 de0Var = this.f32559b;
                                ImageView imageView2 = de0Var.f33607f;
                                EditTextBoldCursor[] editTextBoldCursorArr = de0Var.f33605b;
                                de0Var.f33613y = !de0Var.f33613y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (de0Var.f33613y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(de0Var.f33613y));
                                if (de0Var.f33613y) {
                                    i16 = org.telegram.ui.ActionBar.j6.f20049l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.j6.H6;
                                }
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                                return;
                            default:
                                de0 de0Var2 = this.f32559b;
                                if (de0Var2.f33612x == 0) {
                                    de0Var2.o(null, null);
                                    return;
                                } else {
                                    de0Var2.o(de0Var2.f33608n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, k7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                ad0Var.addView(linearLayout, k7.b6.c(-2.0f, -1));
            } else {
                ad0Var.addView(this.f33605b[i15], k7.b6.c(-2.0f, -1));
            }
            ad0Var.e(this.f33605b[i15]);
            addView(ad0Var, k7.b6.t(-1, -2, 1, 16, 16, 16, 0));
            this.f33605b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    de0 de0Var = de0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = de0Var.f33605b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        de0Var.h(null);
                        return true;
                    }
                    de0Var.getClass();
                    return false;
                }
            });
            i15++;
            f10 = 18.0f;
        }
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, k7.b6.q(-1, -1, 80));
        n7.qa.N0(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final de0 f32559b;

            {
                this.f32559b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        de0 de0Var = this.f32559b;
                        ImageView imageView2 = de0Var.f33607f;
                        EditTextBoldCursor[] editTextBoldCursorArr = de0Var.f33605b;
                        de0Var.f33613y = !de0Var.f33613y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (de0Var.f33613y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(de0Var.f33613y));
                        if (de0Var.f33613y) {
                            i16 = org.telegram.ui.ActionBar.j6.f20049l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.j6.H6;
                        }
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                        return;
                    default:
                        de0 de0Var2 = this.f32559b;
                        if (de0Var2.f33612x == 0) {
                            de0Var2.o(null, null);
                            return;
                        } else {
                            de0Var2.o(de0Var2.f33608n, null);
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
    public final boolean c(boolean z4) {
        this.B.k1(true, true);
        this.v = null;
        this.f33611w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f33611w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f33611w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f33605b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            ng0 ng0Var = this.B;
            if (length == 0) {
                if (ng0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f33612x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (ng0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f33609r);
                ng0Var.u1(10, true, bundle, false);
            } else {
                this.f33611w = true;
                ng0Var.n1(0, true);
                o(this.f33608n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new c10(this, 18), ng0.f36621q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f33612x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f33612x, this.v);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            editTextBoldCursorArr = this.f33605b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f33609r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f33610s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f33608n = this.v.getString("new_password");
        ng0.T0(this.B, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f33606c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f33605b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20049l6, false));
        }
        for (org.telegram.ui.Components.ad0 ad0Var : this.f33604a) {
            ad0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false));
        ImageView imageView = this.f33607f;
        if (imageView != null) {
            if (this.f33613y) {
                i10 = org.telegram.ui.ActionBar.j6.f20049l6;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.H6;
            }
            imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(this.B.getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6), 1, -1));
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
            passwordinputsettings.new_algo = this.f33610s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new a30(this, str, str2, tL_auth_recoverPassword, 9));
    }
}
