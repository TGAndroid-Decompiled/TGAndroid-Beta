package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Timer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class dk0 extends org.telegram.ui.Components.fu0 implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static final int S = 0;
    public int E;
    public int F;
    public double G;
    public double H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public final int M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public final hk0 R;
    public String f46929a;
    public String f46930b;
    public final LinearLayout f46931c;
    public EditTextBoldCursor[] d;
    public final TextView f46932e;
    public final TextView f46933f;
    public final ImageView h;
    public final nb0 f46934n;
    public final nb0 f46935r;
    public final ek0 f46936s;
    public Timer f46937w;
    public Timer f46938x;
    public final Object f46939y;

    public dk0(hk0 hk0Var, Context context, int i7) {
        super(context);
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.R = hk0Var;
        this.f46939y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f46932e = textView;
        int i17 = org.telegram.ui.ActionBar.n6.D6;
        org.telegram.ui.ActionBar.u6.U(textView, i17, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f46933f = textView2;
        int i18 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.messenger.f3.l(textView2, i18, null, 1, 18.0f);
        if (org.telegram.messenger.gd.f24213a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i7 == 3) {
            if (org.telegram.messenger.gd.f24213a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView.setGravity(i13 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (org.telegram.messenger.gd.f24213a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            addView(frameLayout, c8.ma.r(-2, -2, i14));
            ImageView e10 = org.telegram.messenger.n10.e(context, 2131232520);
            boolean z10 = org.telegram.messenger.gd.f24213a0;
            if (z10) {
                f10 = 2.0f;
                frameLayout.addView(e10, c8.ma.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (org.telegram.messenger.gd.f24213a0) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, i16, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f10 = 2.0f;
                if (z10) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, i15, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e10, c8.ma.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f10 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, c8.ma.r(-2, -2, 49));
            if (i7 == 1) {
                ImageView e11 = org.telegram.messenger.n10.e(context, 2131232749);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.u6.s(e11, i18, null, mode);
                frameLayout2.addView(e11, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(2131232747);
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.P9, null, mode);
                frameLayout2.addView(imageView, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.gd.M0(2131745377, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(2131232748);
                org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, c8.ma.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.gd.M0(2131745371, null));
            }
            addView(textView2, c8.ma.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, c8.ma.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46931c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ma.r(-2, 36, 1));
        if (i7 == 3) {
            linearLayout.setVisibility(8);
        }
        nb0 nb0Var = new nb0(context, 2);
        this.f46934n = nb0Var;
        org.telegram.ui.ActionBar.u6.U(nb0Var, i17, null);
        nb0Var.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        if (i7 == 3) {
            nb0Var.setTextSize(1, 14.0f);
            if (org.telegram.messenger.gd.f24213a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(nb0Var, c8.ma.r(-2, -2, i11));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f47248a = paint;
            Paint paint2 = new Paint();
            view.f47249b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xi, false));
            paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yi, false));
            this.f46936s = view;
            if (org.telegram.messenger.gd.f24213a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            nb0Var.setGravity(i12);
            addView((View) view, c8.ma.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            nb0Var.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
            nb0Var.setTextSize(1, 15.0f);
            nb0Var.setGravity(49);
            addView(nb0Var, c8.ma.r(-2, -2, 49));
        }
        nb0 nb0Var2 = new nb0(context, 3);
        this.f46935r = nb0Var2;
        org.telegram.ui.ActionBar.u6.U(nb0Var2, org.telegram.ui.ActionBar.n6.f29634q6, null);
        nb0Var2.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        nb0Var2.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
        nb0Var2.setTextSize(1, 15.0f);
        nb0Var2.setGravity(49);
        if (i7 == 1) {
            nb0Var2.setText(org.telegram.messenger.gd.M0(2131751432, null));
        } else {
            nb0Var2.setText(org.telegram.messenger.gd.M0(2131751438, null));
        }
        addView(nb0Var2, c8.ma.r(-2, -2, 49));
        nb0Var2.setOnClickListener(new j40(this, 17));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i7 < editTextBoldCursorArr.length) {
                sb2.append(pf.b.d(editTextBoldCursorArr[i7].getText().toString(), false));
                i7++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        int i7;
        hk0 hk0Var = this.R;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hk0Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131744588, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), null);
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131744606, null), new zj0(this, 1));
            hk0Var.showDialog(u1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f46929a;
        tL_auth_cancelCode.phone_code_hash = this.f46930b;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new fi.k5(25), 2);
        r();
        q();
        int i10 = this.M;
        if (i10 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25137j4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25143k4);
        }
        this.J = false;
        return true;
    }

    @Override
    public final void d() {
        this.K = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.J && (editTextBoldCursorArr = this.d) != null) {
            if (i7 == org.telegram.messenger.ks.f25137j4) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i7 == org.telegram.messenger.ks.f25143k4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.g0.x(this.O, str)) {
                    this.I = true;
                    this.d[0].setText(str);
                    this.I = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = this.M;
        if (i7 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25137j4);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25143k4);
        }
        this.J = false;
        r();
        q();
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.g0.D3(this.f46931c);
            return;
        }
        this.K = true;
        int i10 = this.M;
        if (i10 == 2) {
            org.telegram.messenger.g0.C3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25137j4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.B3(false);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25143k4);
        }
        this.J = false;
        hk0 hk0Var = this.R;
        hk0Var.R1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f46929a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f46930b;
        r();
        hk0Var.C1();
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(verifyphone, new e00(16, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f46931c;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (length == 0 || this.d[length].length() != 0) {
                    this.d[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.d[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.I3(this.d[length]);
                    return;
                }
            }
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (bundle != null) {
            this.J = true;
            int i17 = this.M;
            if (i17 == 2) {
                org.telegram.messenger.g0.C3(true);
                org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.f25137j4);
            } else if (i17 == 3) {
                org.telegram.messenger.g0.B3(true);
                org.telegram.messenger.ks.e().b(this, org.telegram.messenger.ks.f25143k4);
            }
            this.f46929a = bundle.getString("phone");
            this.f46930b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.E = i18;
            this.Q = i18;
            this.N = bundle.getInt("nextType");
            this.O = bundle.getString("pattern");
            int i19 = bundle.getInt("length");
            this.P = i19;
            if (i19 == 0) {
                this.P = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.P) {
                int i20 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i20 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i20].setText("");
                    i20++;
                }
            } else {
                this.d = new EditTextBoldCursor[this.P];
                for (final int i21 = 0; i21 < this.P; i21++) {
                    this.d[i21] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i21];
                    int i22 = org.telegram.ui.ActionBar.n6.G6;
                    org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i22, null);
                    org.telegram.ui.ActionBar.u6.v(this.d[i21], i22, null);
                    this.d[i21].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(2131232686).mutate();
                    org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.f29541l6, null, PorterDuff.Mode.MULTIPLY);
                    this.d[i21].setBackgroundDrawable(mutate);
                    this.d[i21].setImeOptions(268435461);
                    this.d[i21].setTextSize(1, 20.0f);
                    this.d[i21].setMaxLines(1);
                    this.d[i21].setTypeface(org.telegram.messenger.g0.o());
                    this.d[i21].setPadding(0, 0, 0, 0);
                    this.d[i21].setGravity(49);
                    if (i17 == 3) {
                        this.d[i21].setEnabled(false);
                        this.d[i21].setInputType(0);
                        this.d[i21].setVisibility(8);
                    } else {
                        this.d[i21].setInputType(3);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = this.d[i21];
                    if (i21 != this.P - 1) {
                        i7 = 7;
                    } else {
                        i7 = 0;
                    }
                    this.f46931c.addView(editTextBoldCursor2, c8.ma.t(34, 36, 1, 0, 0, i7, 0));
                    this.d[i21].addTextChangedListener(new bk0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            dk0 dk0Var = dk0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = dk0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = dk0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    dk0Var.d[i25].requestFocus();
                                    dk0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            dk0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new fa(this, 9));
                }
            }
            ek0 ek0Var = this.f46936s;
            if (ek0Var != null) {
                if (this.N != 0) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                ek0Var.setVisibility(i16);
            }
            if (this.f46929a == null) {
                return;
            }
            String h = org.telegram.messenger.n10.h(new StringBuilder("+"), this.f46929a, pf.b.c());
            if (i17 == 2) {
                charSequence = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SentSmsCode", null, 2131745372, org.telegram.messenger.gd.a(h)));
            } else if (i17 == 3) {
                charSequence = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SentCallCode", null, 2131745375, org.telegram.messenger.gd.a(h)));
            } else if (i17 == 4) {
                charSequence = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("SentCallOnly", null, 2131745374, org.telegram.messenger.gd.a(h)));
            }
            this.f46932e.setText(charSequence);
            if (i17 != 3) {
                org.telegram.messenger.g0.I3(this.d[0]);
                this.d[0].requestFocus();
            } else {
                org.telegram.messenger.g0.v1(this.d[0]);
            }
            r();
            q();
            this.G = System.currentTimeMillis();
            nb0 nb0Var = this.f46935r;
            nb0 nb0Var2 = this.f46934n;
            if (i17 == 3) {
                int i23 = this.N;
                i10 = 2;
                if (i23 == 4 || i23 == 2) {
                    nb0Var.setVisibility(8);
                    nb0Var2.setVisibility(0);
                    int i24 = this.N;
                    if (i24 == 4) {
                        nb0Var2.setText(org.telegram.messenger.gd.a0("CallText", null, 2131752590, 1, 0));
                    } else if (i24 == 2) {
                        nb0Var2.setText(org.telegram.messenger.gd.a0("SmsText", null, 2131745100, 1, 0));
                    }
                    p();
                    return;
                }
            } else {
                i10 = 2;
            }
            if (i17 == i10) {
                int i25 = this.N;
                i11 = 0;
                if (i25 == 4 || i25 == 3) {
                    Object[] objArr = new Object[i10];
                    objArr[0] = 2;
                    objArr[1] = 0;
                    nb0Var2.setText(org.telegram.messenger.gd.a0("CallText", null, 2131752590, objArr));
                    if (this.E < 1000) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    nb0Var.setVisibility(i14);
                    if (this.E < 1000) {
                        i15 = 8;
                    } else {
                        i15 = 0;
                    }
                    nb0Var2.setVisibility(i15);
                    p();
                    return;
                }
            } else {
                i11 = 0;
            }
            if (i17 == 4 && this.N == 2) {
                Object[] objArr2 = new Object[2];
                objArr2[i11] = 2;
                objArr2[1] = 0;
                nb0Var2.setText(org.telegram.messenger.gd.a0("SmsText", null, 2131745100, objArr2));
                if (this.E < 1000) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                nb0Var.setVisibility(i12);
                if (this.E < 1000) {
                    i13 = 8;
                } else {
                    i13 = i11;
                }
                nb0Var2.setVisibility(i13);
                p();
                return;
            }
            nb0Var2.setVisibility(8);
            nb0Var.setVisibility(8);
            o();
        }
    }

    public final void o() {
        if (this.f46938x != null) {
            return;
        }
        this.F = 15000;
        this.f46938x = new Timer();
        this.H = System.currentTimeMillis();
        this.f46938x.schedule(new h6.r(this, 4), 0L, 1000L);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.M != 3 && this.h != null) {
            int bottom = this.f46932e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            nb0 nb0Var = this.f46935r;
            if (nb0Var.getVisibility() == 0) {
                int measuredHeight2 = nb0Var.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight2;
                nb0Var.layout(nb0Var.getLeft(), i13, nb0Var.getRight(), measuredHeight2 + i13);
            } else {
                nb0 nb0Var2 = this.f46934n;
                if (nb0Var2.getVisibility() == 0) {
                    int measuredHeight3 = nb0Var2.getMeasuredHeight();
                    i13 = (measuredHeight + bottom) - measuredHeight3;
                    nb0Var2.layout(nb0Var2.getLeft(), i13, nb0Var2.getRight(), measuredHeight3 + i13);
                } else {
                    i13 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f46931c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int e10 = i5.c.e(i13 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), e10, linearLayout.getRight(), measuredHeight4 + e10);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        super.onMeasure(i7, i10);
        if (this.M != 3 && (imageView = this.h) != null) {
            int L = org.telegram.messenger.g0.L(35.0f) + this.f46932e.getMeasuredHeight() + this.f46933f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int L2 = org.telegram.messenger.g0.L(80.0f);
            int L3 = org.telegram.messenger.g0.L(291.0f);
            hk0 hk0Var = this.R;
            if (hk0Var.f48412t0 - L < L2) {
                setMeasuredDimension(getMeasuredWidth(), L + L2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(hk0Var.f48412t0, L3));
            }
        }
    }

    public final void p() {
        if (this.f46937w != null) {
            return;
        }
        Timer timer = new Timer();
        this.f46937w = timer;
        timer.schedule(new ck0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.f46939y) {
                Timer timer = this.f46938x;
                if (timer != null) {
                    timer.cancel();
                    this.f46938x = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.f46939y) {
                Timer timer = this.f46937w;
                if (timer != null) {
                    timer.cancel();
                    this.f46937w = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s() {
        int i7;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f46929a);
        this.K = true;
        hk0 hk0Var = this.R;
        hk0Var.C1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f46929a;
        tL_auth_resendCode.phone_code_hash = this.f46930b;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new z9(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null) {
                int i7 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
                        }
                        i7++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
