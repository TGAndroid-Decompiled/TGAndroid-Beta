package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qb0 extends org.telegram.ui.Components.vt0 {
    public boolean E;
    public int F;
    public int G;
    public final xd0 H;
    public final org.telegram.ui.Components.gb0[] f48835a;
    public final EditTextBoldCursor[] f48836b;
    public final TextView f48837c;
    public final TextView d;
    public final TextView f48838e;
    public final ImageView f48839f;
    public String h;
    public String f48840n;
    public String f48841r;
    public TL_account.Password f48842s;
    public Bundle f48843w;
    public boolean f48844x;
    public final int f48845y;

    public qb0(xd0 xd0Var, Context context, int i3) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        this.H = xd0Var;
        this.f48845y = i3;
        setOrientation(1);
        if (i3 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.f48836b = new EditTextBoldCursor[i10];
        this.f48835a = new org.telegram.ui.Components.gb0[i10];
        TextView textView = new TextView(context);
        this.f48837c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        float f11 = 2.0f;
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(org.telegram.messenger.bd.M0(2131745532, null));
        if (org.telegram.messenger.g0.O1()) {
            i11 = 16;
        } else {
            i11 = 72;
        }
        addView(textView, b8.mf.t(-2, -2, 1, 8, i11, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, b8.mf.t(-2, -2, 1, 8, 6, 8, 16));
        final int i14 = 0;
        while (i14 < this.f48836b.length) {
            org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
            this.f48835a[i14] = gb0Var;
            if (i3 == 0) {
                if (i14 == 0) {
                    i12 = 2131747218;
                } else {
                    i12 = 2131747216;
                }
            } else {
                i12 = 2131747450;
            }
            gb0Var.setText(org.telegram.messenger.bd.M0(i12, null));
            this.f48836b[i14] = new EditTextBoldCursor(context);
            this.f48836b[i14].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f48836b[i14].setCursorWidth(1.5f);
            this.f48836b[i14].setImeOptions(268435461);
            this.f48836b[i14].setTextSize(1, f10);
            this.f48836b[i14].setMaxLines(1);
            this.f48836b[i14].setBackground(null);
            int L = org.telegram.messenger.g0.L(16.0f);
            this.f48836b[i14].setPadding(L, L, L, L);
            if (i3 == 0) {
                this.f48836b[i14].setInputType(129);
                this.f48836b[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f48836b[i14].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f48836b[i14];
            if (org.telegram.messenger.bd.f21784a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            editTextBoldCursor.setGravity(i13);
            EditTextBoldCursor editTextBoldCursor2 = this.f48836b[i14];
            if (i14 == 0 && i3 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = f11;
            editTextBoldCursor2.addTextChangedListener(new ai.w3(this, z10));
            this.f48836b[i14].setOnFocusChangeListener(new ed(gb0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f48836b[i14], b8.mf.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f48839f = imageView;
                imageView.setImageResource(2131232224);
                org.telegram.messenger.g0.Z3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final qb0 f47932b;

                    {
                        this.f47932b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i15;
                        int i16;
                        switch (r2) {
                            case 0:
                                qb0 qb0Var = this.f47932b;
                                ImageView imageView2 = qb0Var.f48839f;
                                EditTextBoldCursor[] editTextBoldCursorArr = qb0Var.f48836b;
                                qb0Var.E = !qb0Var.E;
                                for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                                    int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                                    if (qb0Var.E) {
                                        i16 = 144;
                                    } else {
                                        i16 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i16 | 1);
                                    editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(qb0Var.E));
                                if (qb0Var.E) {
                                    i15 = org.telegram.ui.ActionBar.k6.f28026l6;
                                } else {
                                    i15 = org.telegram.ui.ActionBar.k6.H6;
                                }
                                org.telegram.ui.ActionBar.r6.t(imageView2, i15, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                qb0 qb0Var2 = this.f47932b;
                                if (qb0Var2.f48845y == 0) {
                                    qb0Var2.n(null, null);
                                    return;
                                } else {
                                    qb0Var2.n(qb0Var2.f48840n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, b8.mf.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                gb0Var.addView(linearLayout, b8.mf.c(-2.0f, -1));
            } else {
                gb0Var.addView(this.f48836b[i14], b8.mf.c(-2.0f, -1));
            }
            gb0Var.e(this.f48836b[i14]);
            addView(gb0Var, b8.mf.t(-1, -2, 1, 16, 16, 16, 0));
            this.f48836b[i14].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                    qb0 qb0Var = qb0.this;
                    if (i14 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = qb0Var.f48836b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i15 == 5) {
                        qb0Var.h(null);
                        return true;
                    }
                    qb0Var.getClass();
                    return false;
                }
            });
            i14++;
            f11 = f12;
            f10 = 18.0f;
        }
        float f13 = f11;
        if (i3 == 0) {
            this.d.setText(org.telegram.messenger.bd.M0(2131747217, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            this.d.setText(org.telegram.messenger.bd.M0(2131747448, "PasswordHintTextLogin"));
        }
        TextView textView3 = new TextView(context);
        this.f48838e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(f13), 1.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView3.setText(org.telegram.messenger.bd.M0(2131742827, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, b8.mf.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, b8.mf.r(-1, -1, 80));
        k4.j.k(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final qb0 f47932b;

            {
                this.f47932b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15;
                int i16;
                switch (r2) {
                    case 0:
                        qb0 qb0Var = this.f47932b;
                        ImageView imageView2 = qb0Var.f48839f;
                        EditTextBoldCursor[] editTextBoldCursorArr = qb0Var.f48836b;
                        qb0Var.E = !qb0Var.E;
                        for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                            int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                            if (qb0Var.E) {
                                i16 = 144;
                            } else {
                                i16 = 128;
                            }
                            editTextBoldCursor3.setInputType(i16 | 1);
                            editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(qb0Var.E));
                        if (qb0Var.E) {
                            i15 = org.telegram.ui.ActionBar.k6.f28026l6;
                        } else {
                            i15 = org.telegram.ui.ActionBar.k6.H6;
                        }
                        org.telegram.ui.ActionBar.r6.t(imageView2, i15, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        qb0 qb0Var2 = this.f47932b;
                        if (qb0Var2.f48845y == 0) {
                            qb0Var2.n(null, null);
                            return;
                        } else {
                            qb0Var2.n(qb0Var2.f48840n, null);
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
        this.H.t1(true, true);
        this.f48843w = null;
        this.f48844x = false;
        return true;
    }

    @Override
    public final void d() {
        this.f48844x = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131748274, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.f48844x) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f48836b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            xd0 xd0Var = this.H;
            if (length == 0) {
                if (xd0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.F3(editTextBoldCursorArr[0]);
                }
            } else if (this.f48845y == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (xd0Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    org.telegram.messenger.g0.F3(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.f48841r);
                xd0Var.D1(10, true, bundle, false);
            } else {
                this.f48844x = true;
                xd0Var.w1(0, true);
                n(this.f48840n, obj);
            }
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new fz(this, 20), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f48845y);
        this.f48843w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.f48843w != null) {
            bundle.putBundle("recoveryview_params" + this.f48845y, this.f48843w);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            editTextBoldCursorArr = this.f48836b;
            if (i3 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i3].setText("");
            i3++;
        }
        this.f48843w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.f48843w.getString("password");
        this.f48841r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f48842s = TLdeserialize;
            TwoStepVerificationActivity.r0(TLdeserialize);
        }
        this.f48840n = this.f48843w.getString("new_password");
        xd0.a1(this.H, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    public final void n(String str, String str2) {
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
            passwordinputsettings.new_algo = this.f48842s.new_algo;
        }
        Utilities.f21387e.c(new org.telegram.ui.Components.v60(this, str, str2, tL_auth_recoverPassword, 23));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i3;
        this.f48837c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f48836b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28026l6, false));
        }
        for (org.telegram.ui.Components.gb0 gb0Var : this.f48835a) {
            gb0Var.f();
        }
        this.f48838e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false));
        ImageView imageView = this.f48839f;
        if (imageView != null) {
            if (this.E) {
                i3 = org.telegram.ui.ActionBar.k6.f28026l6;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            xd0.l1(imageView, x02, this.F, PorterDuff.Mode.SRC_ATOP);
            this.F = x02;
            int themedColor = this.H.getThemedColor(org.telegram.ui.ActionBar.k6.f27972i6);
            xd0.m1(imageView, themedColor, this.G);
            this.G = themedColor;
        }
    }
}
