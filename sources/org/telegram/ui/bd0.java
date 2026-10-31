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
public final class bd0 extends org.telegram.ui.Components.zu0 {
    public boolean D;
    public int E;
    public int F;
    public final hf0 G;
    public final org.telegram.ui.Components.ec0[] f36176a;
    public final EditTextBoldCursor[] f36177b;
    public final TextView f36178c;
    public final TextView d;
    public final TextView e;
    public final ImageView f36179f;
    public String h;
    public String f36180n;
    public String f36181r;
    public TL_account.Password f36182s;
    public Bundle f36183w;
    public boolean f36184x;
    public final int f36185y;

    public bd0(hf0 hf0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        this.G = hf0Var;
        this.f36185y = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f36177b = new EditTextBoldCursor[i11];
        this.f36176a = new org.telegram.ui.Components.ec0[i11];
        TextView textView = new TextView(context);
        this.f36178c = textView;
        float f7 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        float f10 = 2.0f;
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(org.telegram.messenger.cd.L0(2131745539, null));
        if (org.telegram.messenger.i0.O1()) {
            i12 = 16;
        } else {
            i12 = 72;
        }
        addView(textView, w7.b6.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView2, w7.b6.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f36177b.length) {
            org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
            this.f36176a[i15] = ec0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = 2131747225;
                } else {
                    i13 = 2131747223;
                }
            } else {
                i13 = 2131747458;
            }
            ec0Var.setText(org.telegram.messenger.cd.L0(i13, null));
            this.f36177b[i15] = new EditTextBoldCursor(context);
            this.f36177b[i15].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.f36177b[i15].setCursorWidth(1.5f);
            this.f36177b[i15].setImeOptions(268435461);
            this.f36177b[i15].setTextSize(1, f7);
            this.f36177b[i15].setMaxLines(1);
            this.f36177b[i15].setBackground(null);
            int L = org.telegram.messenger.i0.L(16.0f);
            this.f36177b[i15].setPadding(L, L, L, L);
            if (i10 == 0) {
                this.f36177b[i15].setInputType(129);
                this.f36177b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f36177b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f36177b[i15];
            if (org.telegram.messenger.cd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f36177b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f11 = f10;
            editTextBoldCursor2.addTextChangedListener(new jg.f3(this, z10));
            this.f36177b[i15].setOnFocusChangeListener(new od(ec0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f36177b[i15], w7.b6.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f36179f = imageView;
                imageView.setImageResource(2131232223);
                org.telegram.messenger.i0.Y3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final bd0 f43819b;

                    {
                        this.f43819b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                bd0 bd0Var = this.f43819b;
                                ImageView imageView2 = bd0Var.f36179f;
                                EditTextBoldCursor[] editTextBoldCursorArr = bd0Var.f36177b;
                                bd0Var.D = !bd0Var.D;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (bd0Var.D) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(bd0Var.D));
                                if (bd0Var.D) {
                                    i16 = org.telegram.ui.ActionBar.t6.f21076l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.t6.H6;
                                }
                                org.telegram.ui.ActionBar.a7.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                bd0 bd0Var2 = this.f43819b;
                                if (bd0Var2.f36185y == 0) {
                                    bd0Var2.n(null, null);
                                    return;
                                } else {
                                    bd0Var2.n(bd0Var2.f36180n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.b6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                ec0Var.addView(linearLayout, w7.b6.c(-2.0f, -1));
            } else {
                ec0Var.addView(this.f36177b[i15], w7.b6.c(-2.0f, -1));
            }
            ec0Var.e(this.f36177b[i15]);
            addView(ec0Var, w7.b6.t(-1, -2, 1, 16, 16, 16, 0));
            this.f36177b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    bd0 bd0Var = bd0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = bd0Var.f36177b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        bd0Var.h(null);
                        return true;
                    }
                    bd0Var.getClass();
                    return false;
                }
            });
            i15++;
            f10 = f11;
            f7 = 18.0f;
        }
        float f12 = f10;
        if (i10 == 0) {
            this.d.setText(org.telegram.messenger.cd.L0(2131747224, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            this.d.setText(org.telegram.messenger.cd.L0(2131747456, "PasswordHintTextLogin"));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(org.telegram.messenger.i0.L(f12), 1.0f);
        textView3.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        textView3.setText(org.telegram.messenger.cd.L0(2131742842, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.b6.r(-1, -1, 80));
        li.k.i(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final bd0 f43819b;

            {
                this.f43819b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        bd0 bd0Var = this.f43819b;
                        ImageView imageView2 = bd0Var.f36179f;
                        EditTextBoldCursor[] editTextBoldCursorArr = bd0Var.f36177b;
                        bd0Var.D = !bd0Var.D;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (bd0Var.D) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(bd0Var.D));
                        if (bd0Var.D) {
                            i16 = org.telegram.ui.ActionBar.t6.f21076l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.t6.H6;
                        }
                        org.telegram.ui.ActionBar.a7.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        bd0 bd0Var2 = this.f43819b;
                        if (bd0Var2.f36185y == 0) {
                            bd0Var2.n(null, null);
                            return;
                        } else {
                            bd0Var2.n(bd0Var2.f36180n, null);
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
        this.G.s1(true, true);
        this.f36183w = null;
        this.f36184x = false;
        return true;
    }

    @Override
    public final void d() {
        this.f36184x = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748283, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.f36184x) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f36177b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            hf0 hf0Var = this.G;
            if (length == 0) {
                if (hf0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.i0.E3(editTextBoldCursorArr[0]);
                }
            } else if (this.f36185y == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (hf0Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    org.telegram.messenger.i0.E3(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.f36181r);
                hf0Var.C1(10, true, bundle, false);
            } else {
                this.f36184x = true;
                hf0Var.v1(0, true);
                n(this.f36180n, obj);
            }
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new zy(this, 21), hf0.f37917y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f36185y);
        this.f36183w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.f36183w != null) {
            bundle.putBundle("recoveryview_params" + this.f36185y, this.f36183w);
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
            editTextBoldCursorArr = this.f36177b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.f36183w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.f36183w.getString("password");
        this.f36181r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f36182s = TLdeserialize;
            TwoStepVerificationActivity.q0(TLdeserialize);
        }
        this.f36180n = this.f36183w.getString("new_password");
        hf0.Z0(this.G, editTextBoldCursorArr[0]);
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
            passwordinputsettings.new_algo = this.f36182s.new_algo;
        }
        Utilities.e.c(new w50(this, str, str2, tL_auth_recoverPassword, 7));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f36178c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f36177b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l6, false));
        }
        for (org.telegram.ui.Components.ec0 ec0Var : this.f36176a) {
            ec0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        ImageView imageView = this.f36179f;
        if (imageView != null) {
            if (this.D) {
                i10 = org.telegram.ui.ActionBar.t6.f21076l6;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            hf0.k1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.t6.f21020i6);
            hf0.l1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
