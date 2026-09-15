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
public final class me0 extends org.telegram.ui.Components.uv0 {
    public final wg0 E;
    public final org.telegram.ui.Components.yc0[] f35720a;
    public final EditTextBoldCursor[] f35721b;
    public final TextView f35722c;
    public final TextView d;
    public final TextView e;
    public final ImageView f35723f;
    public String h;
    public String f35724n;
    public String f35725r;
    public TL_account.Password f35726s;
    public Bundle v;
    public boolean f35727w;
    public final int f35728x;
    public boolean f35729y;

    public me0(wg0 wg0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        this.E = wg0Var;
        this.f35728x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f35721b = new EditTextBoldCursor[i11];
        this.f35720a = new org.telegram.ui.Components.yc0[i11];
        TextView textView = new TextView(context);
        this.f35722c = textView;
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
        addView(textView, w7.x5.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.x5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f35721b.length) {
            org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context, null);
            this.f35720a[i15] = yc0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            yc0Var.setText(LocaleController.getString(i13));
            this.f35721b[i15] = new EditTextBoldCursor(context);
            this.f35721b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f35721b[i15].setCursorWidth(1.5f);
            this.f35721b[i15].setImeOptions(268435461);
            this.f35721b[i15].setTextSize(1, f7);
            this.f35721b[i15].setMaxLines(1);
            this.f35721b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f35721b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f35721b[i15].setInputType(129);
                this.f35721b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f35721b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f35721b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f35721b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new le0(this, z10));
            this.f35721b[i15].setOnFocusChangeListener(new od(yc0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f35721b[i15], w7.x5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f35723f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final me0 f34654b;

                    {
                        this.f34654b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                me0 me0Var = this.f34654b;
                                ImageView imageView2 = me0Var.f35723f;
                                EditTextBoldCursor[] editTextBoldCursorArr = me0Var.f35721b;
                                me0Var.f35729y = !me0Var.f35729y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (me0Var.f35729y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(me0Var.f35729y));
                                if (me0Var.f35729y) {
                                    i16 = org.telegram.ui.ActionBar.i6.f18982l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.i6.H6;
                                }
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                                return;
                            default:
                                me0 me0Var2 = this.f34654b;
                                if (me0Var2.f35728x == 0) {
                                    me0Var2.o(null, null);
                                    return;
                                } else {
                                    me0Var2.o(me0Var2.f35724n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                yc0Var.addView(linearLayout, w7.x5.c(-2.0f, -1));
            } else {
                yc0Var.addView(this.f35721b[i15], w7.x5.c(-2.0f, -1));
            }
            yc0Var.e(this.f35721b[i15]);
            addView(yc0Var, w7.x5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f35721b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    me0 me0Var = me0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = me0Var.f35721b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        me0Var.h(null);
                        return true;
                    }
                    me0Var.getClass();
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
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.x5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.x5.q(-1, -1, 80));
        n7.a1.j(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final me0 f34654b;

            {
                this.f34654b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        me0 me0Var = this.f34654b;
                        ImageView imageView2 = me0Var.f35723f;
                        EditTextBoldCursor[] editTextBoldCursorArr = me0Var.f35721b;
                        me0Var.f35729y = !me0Var.f35729y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (me0Var.f35729y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(me0Var.f35729y));
                        if (me0Var.f35729y) {
                            i16 = org.telegram.ui.ActionBar.i6.f18982l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.i6.H6;
                        }
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                        return;
                    default:
                        me0 me0Var2 = this.f34654b;
                        if (me0Var2.f35728x == 0) {
                            me0Var2.o(null, null);
                            return;
                        } else {
                            me0Var2.o(me0Var2.f35724n, null);
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
        this.f35727w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f35727w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f35727w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f35721b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            wg0 wg0Var = this.E;
            if (length == 0) {
                if (wg0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f35728x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (wg0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f35725r);
                wg0Var.u1(10, true, bundle, false);
            } else {
                this.f35727w = true;
                wg0Var.n1(0, true);
                o(this.f35724n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new g10(this, 18), wg0.f39192t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f35728x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f35728x, this.v);
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
            editTextBoldCursorArr = this.f35721b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f35725r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f35726s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f35724n = this.v.getString("new_password");
        wg0.T0(this.E, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f35722c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f35721b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18982l6, false));
        }
        for (org.telegram.ui.Components.yc0 yc0Var : this.f35720a) {
            yc0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        ImageView imageView = this.f35723f;
        if (imageView != null) {
            if (this.f35729y) {
                i10 = org.telegram.ui.ActionBar.i6.f18982l6;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.H6;
            }
            imageView.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
            imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(this.E.getThemedColor(org.telegram.ui.ActionBar.i6.f18926i6), 1, -1));
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
            passwordinputsettings.new_algo = this.f35726s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.jn0(this, str, str2, tL_auth_recoverPassword, 18));
    }
}
