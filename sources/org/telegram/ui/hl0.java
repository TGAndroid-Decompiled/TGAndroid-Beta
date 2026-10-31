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
public final class hl0 extends org.telegram.ui.Components.zu0 implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public static final int R = 0;
    public int D;
    public int E;
    public double F;
    public double G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public final int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public final ll0 Q;
    public String f37985a;
    public String f37986b;
    public final LinearLayout f37987c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f37988f;
    public final ImageView h;
    public final ag.j3 f37989n;
    public final el0 f37990r;
    public final il0 f37991s;
    public Timer f37992w;
    public Timer f37993x;
    public final Object f37994y;

    public hl0(ll0 ll0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.Q = ll0Var;
        this.f37994y = new Object();
        this.D = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i18 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(textView, i18, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f37988f = textView2;
        int i19 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.messenger.m5.m(textView2, i19, null, 1, 18.0f);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            if (org.telegram.messenger.cd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (org.telegram.messenger.cd.X) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            addView(frameLayout, w7.b6.r(-2, -2, i15));
            ImageView e = org.telegram.messenger.z20.e(context, 2131232517);
            boolean z10 = org.telegram.messenger.cd.X;
            if (z10) {
                f7 = 2.0f;
                frameLayout.addView(e, w7.b6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (org.telegram.messenger.cd.X) {
                    i17 = 5;
                } else {
                    i17 = 3;
                }
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, i17, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f7 = 2.0f;
                if (z10) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, w7.b6.d(-1, -2.0f, i16, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e, w7.b6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f7 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, w7.b6.r(-2, -2, 49));
            if (i10 == 1) {
                ImageView e7 = org.telegram.messenger.z20.e(context, 2131232744);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.a7.t(e7, i19, null, mode);
                frameLayout2.addView(e7, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(2131232742);
                org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.P9, null, mode);
                frameLayout2.addView(imageView, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.cd.L0(2131745589, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(2131232743);
                org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.cd.L0(2131745583, null));
            }
            addView(textView2, w7.b6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, w7.b6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37987c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.r(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        ag.j3 j3Var = new ag.j3(context, 29);
        this.f37989n = j3Var;
        org.telegram.ui.ActionBar.a7.V(j3Var, i18, null);
        j3Var.setLineSpacing(org.telegram.messenger.i0.L(f7), 1.0f);
        if (i10 == 3) {
            j3Var.setTextSize(1, 14.0f);
            if (org.telegram.messenger.cd.X) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(j3Var, w7.b6.r(-2, -2, i12));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f38275a = paint;
            Paint paint2 = new Paint();
            view.f38276b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ui, false));
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vi, false));
            this.f37991s = view;
            if (org.telegram.messenger.cd.X) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            j3Var.setGravity(i13);
            addView((View) view, w7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            j3Var.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(10.0f));
            j3Var.setTextSize(1, 15.0f);
            j3Var.setGravity(49);
            addView(j3Var, w7.b6.r(-2, -2, 49));
        }
        el0 el0Var = new el0(context, 0);
        this.f37990r = el0Var;
        org.telegram.ui.ActionBar.a7.V(el0Var, org.telegram.ui.ActionBar.t6.q6, null);
        el0Var.setLineSpacing(org.telegram.messenger.i0.L(f7), 1.0f);
        el0Var.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(10.0f));
        el0Var.setTextSize(1, 15.0f);
        el0Var.setGravity(49);
        if (i10 == 1) {
            el0Var.setText(org.telegram.messenger.cd.L0(2131751444, null));
        } else {
            el0Var.setText(org.telegram.messenger.cd.L0(2131751450, null));
        }
        addView(el0Var, w7.b6.r(-2, -2, 49));
        el0Var.setOnClickListener(new f50(this, 17));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i10 < editTextBoldCursorArr.length) {
                sb2.append(af.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
                i10++;
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
        int i10;
        ll0 ll0Var = this.Q;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ll0Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131744841, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131744859, null), new cl0(this, 1));
            ll0Var.showDialog(x1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f37985a;
        tL_auth_cancelCode.phone_code_hash = this.f37986b;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ag.c3(20), 2);
        r();
        q();
        int i11 = this.L;
        if (i11 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19618g4);
        } else if (i11 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19624h4);
        }
        this.I = false;
        return true;
    }

    @Override
    public final void d() {
        this.J = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.I && (editTextBoldCursorArr = this.d) != null) {
            if (i10 == org.telegram.messenger.zs.f19618g4) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i10 == org.telegram.messenger.zs.f19624h4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.i0.x(this.N, str)) {
                    this.H = true;
                    this.d[0].setText(str);
                    this.H = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = this.L;
        if (i10 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19618g4);
        } else if (i10 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19624h4);
        }
        this.I = false;
        r();
        q();
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.i0.E3(this.f37987c);
            return;
        }
        this.J = true;
        int i11 = this.L;
        if (i11 == 2) {
            org.telegram.messenger.i0.D3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19618g4);
        } else if (i11 == 3) {
            org.telegram.messenger.i0.C3(false);
            org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19624h4);
        }
        this.I = false;
        ll0 ll0Var = this.Q;
        ll0Var.Q1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f37985a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f37986b;
        r();
        ll0Var.B1();
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new org.telegram.ui.Components.t20(28, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f37987c;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (length == 0 || this.d[length].length() != 0) {
                    this.d[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.d[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(this.d[length]);
                    return;
                }
            }
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (bundle != null) {
            this.I = true;
            int i18 = this.L;
            if (i18 == 2) {
                org.telegram.messenger.i0.D3(true);
                org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.f19618g4);
            } else if (i18 == 3) {
                org.telegram.messenger.i0.C3(true);
                org.telegram.messenger.zs.e().b(this, org.telegram.messenger.zs.f19624h4);
            }
            this.f37985a = bundle.getString("phone");
            this.f37986b = bundle.getString("phoneHash");
            int i19 = bundle.getInt("timeout");
            this.D = i19;
            this.P = i19;
            this.M = bundle.getInt("nextType");
            this.N = bundle.getString("pattern");
            int i20 = bundle.getInt("length");
            this.O = i20;
            if (i20 == 0) {
                this.O = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.O) {
                int i21 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i21 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i21].setText("");
                    i21++;
                }
            } else {
                this.d = new EditTextBoldCursor[this.O];
                for (final int i22 = 0; i22 < this.O; i22++) {
                    this.d[i22] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i22];
                    int i23 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i23, null);
                    org.telegram.ui.ActionBar.a7.w(this.d[i22], i23, null);
                    this.d[i22].setCursorSize(org.telegram.messenger.i0.L(20.0f));
                    this.d[i22].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(2131232681).mutate();
                    org.telegram.ui.ActionBar.a7.y(this, mutate, org.telegram.ui.ActionBar.t6.f21076l6, null, PorterDuff.Mode.MULTIPLY);
                    this.d[i22].setBackgroundDrawable(mutate);
                    this.d[i22].setImeOptions(268435461);
                    this.d[i22].setTextSize(1, 20.0f);
                    this.d[i22].setMaxLines(1);
                    this.d[i22].setTypeface(org.telegram.messenger.i0.o());
                    this.d[i22].setPadding(0, 0, 0, 0);
                    this.d[i22].setGravity(49);
                    if (i18 == 3) {
                        this.d[i22].setEnabled(false);
                        this.d[i22].setInputType(0);
                        this.d[i22].setVisibility(8);
                    } else {
                        this.d[i22].setInputType(3);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = this.d[i22];
                    if (i22 != this.O - 1) {
                        i10 = 7;
                    } else {
                        i10 = 0;
                    }
                    this.f37987c.addView(editTextBoldCursor2, w7.b6.t(34, 36, 1, 0, 0, i10, 0));
                    this.d[i22].addTextChangedListener(new fl0(this, i22));
                    this.d[i22].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i24, KeyEvent keyEvent) {
                            hl0 hl0Var = hl0.this;
                            if (i24 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = hl0Var.d;
                                int i25 = i22;
                                if (editTextBoldCursorArr3[i25].length() == 0 && i25 > 0) {
                                    int i26 = i25 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = hl0Var.d[i26];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    hl0Var.d[i26].requestFocus();
                                    hl0Var.d[i26].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            hl0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i22].setOnEditorActionListener(new ha(this, 9));
                }
            }
            il0 il0Var = this.f37991s;
            if (il0Var != null) {
                if (this.M != 0) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                il0Var.setVisibility(i17);
            }
            if (this.f37985a == null) {
                return;
            }
            String h = org.telegram.messenger.m5.h(new StringBuilder("+"), this.f37985a, af.b.c());
            if (i18 == 2) {
                charSequence = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentSmsCode", null, 2131745584, org.telegram.messenger.cd.a(h)));
            } else if (i18 == 3) {
                charSequence = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentCallCode", null, 2131745587, org.telegram.messenger.cd.a(h)));
            } else if (i18 == 4) {
                charSequence = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SentCallOnly", null, 2131745586, org.telegram.messenger.cd.a(h)));
            }
            this.e.setText(charSequence);
            if (i18 != 3) {
                org.telegram.messenger.i0.J3(this.d[0]);
                this.d[0].requestFocus();
            } else {
                org.telegram.messenger.i0.v1(this.d[0]);
            }
            r();
            q();
            this.F = System.currentTimeMillis();
            el0 el0Var = this.f37990r;
            ag.j3 j3Var = this.f37989n;
            if (i18 == 3) {
                int i24 = this.M;
                i11 = 2;
                if (i24 == 4 || i24 == 2) {
                    el0Var.setVisibility(8);
                    j3Var.setVisibility(0);
                    int i25 = this.M;
                    if (i25 == 4) {
                        j3Var.setText(org.telegram.messenger.cd.a0("CallText", null, 2131752601, 1, 0));
                    } else if (i25 == 2) {
                        j3Var.setText(org.telegram.messenger.cd.a0("SmsText", null, 2131745313, 1, 0));
                    }
                    p();
                    return;
                }
            } else {
                i11 = 2;
            }
            if (i18 == i11) {
                int i26 = this.M;
                i12 = 0;
                if (i26 == 4 || i26 == 3) {
                    Object[] objArr = new Object[i11];
                    objArr[0] = 2;
                    objArr[1] = 0;
                    j3Var.setText(org.telegram.messenger.cd.a0("CallText", null, 2131752601, objArr));
                    if (this.D < 1000) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    el0Var.setVisibility(i15);
                    if (this.D < 1000) {
                        i16 = 8;
                    } else {
                        i16 = 0;
                    }
                    j3Var.setVisibility(i16);
                    p();
                    return;
                }
            } else {
                i12 = 0;
            }
            if (i18 == 4 && this.M == 2) {
                Object[] objArr2 = new Object[2];
                objArr2[i12] = 2;
                objArr2[1] = 0;
                j3Var.setText(org.telegram.messenger.cd.a0("SmsText", null, 2131745313, objArr2));
                if (this.D < 1000) {
                    i13 = i12;
                } else {
                    i13 = 8;
                }
                el0Var.setVisibility(i13);
                if (this.D < 1000) {
                    i14 = 8;
                } else {
                    i14 = i12;
                }
                j3Var.setVisibility(i14);
                p();
                return;
            }
            j3Var.setVisibility(8);
            el0Var.setVisibility(8);
            o();
        }
    }

    public final void o() {
        if (this.f37993x != null) {
            return;
        }
        this.E = 15000;
        this.f37993x = new Timer();
        this.G = System.currentTimeMillis();
        this.f37993x.schedule(new e6.r(this, 4), 0L, 1000L);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.L != 3 && this.h != null) {
            int bottom = this.e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            el0 el0Var = this.f37990r;
            if (el0Var.getVisibility() == 0) {
                int measuredHeight2 = el0Var.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight2;
                el0Var.layout(el0Var.getLeft(), i14, el0Var.getRight(), measuredHeight2 + i14);
            } else {
                ag.j3 j3Var = this.f37989n;
                if (j3Var.getVisibility() == 0) {
                    int measuredHeight3 = j3Var.getMeasuredHeight();
                    i14 = (measuredHeight + bottom) - measuredHeight3;
                    j3Var.layout(j3Var.getLeft(), i14, j3Var.getRight(), measuredHeight3 + i14);
                } else {
                    i14 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f37987c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int u10 = i0.a.u(i14 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), u10, linearLayout.getRight(), measuredHeight4 + u10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.L != 3 && (imageView = this.h) != null) {
            int L = org.telegram.messenger.i0.L(35.0f) + this.e.getMeasuredHeight() + this.f37988f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int L2 = org.telegram.messenger.i0.L(80.0f);
            int L3 = org.telegram.messenger.i0.L(291.0f);
            ll0 ll0Var = this.Q;
            if (ll0Var.f39298s0 - L < L2) {
                setMeasuredDimension(getMeasuredWidth(), L + L2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(ll0Var.f39298s0, L3));
            }
        }
    }

    public final void p() {
        if (this.f37992w != null) {
            return;
        }
        Timer timer = new Timer();
        this.f37992w = timer;
        timer.schedule(new gl0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.f37994y) {
                Timer timer = this.f37993x;
                if (timer != null) {
                    timer.cancel();
                    this.f37993x = null;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.f37994y) {
                Timer timer = this.f37992w;
                if (timer != null) {
                    timer.cancel();
                    this.f37992w = null;
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void s() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f37985a);
        this.J = true;
        ll0 ll0Var = this.Q;
        ll0Var.B1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f37985a;
        tL_auth_resendCode.phone_code_hash = this.f37986b;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new aa(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null) {
                int i10 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
