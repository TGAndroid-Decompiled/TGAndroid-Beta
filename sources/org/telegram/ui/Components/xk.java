package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class xk extends li implements org.telegram.messenger.fs {
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ShapeDrawable E;
    public boolean E0;
    public final org.telegram.ui.ActionBar.u4 F;
    public float F0;
    public kq G;
    public float G0;
    public String H;
    public float H0;
    public byte[] I;
    public float I0;
    public boolean J;
    public float J0;
    public boolean K;
    public float K0;
    public boolean L;
    public boolean L0;
    public Activity M;
    public boolean M0;
    public int N;
    public boolean N0;
    public final uk O;
    public boolean O0;
    public final LinearLayout P;
    public bi.e4 P0;
    public final FrameLayout Q;
    public TL_wallet.walletTransaction Q0;
    public final TextView R;
    public org.telegram.ui.Wallet.f7 R0;
    public final org.telegram.ui.Wallet.da S;
    public org.telegram.ui.Wallet.sa S0;
    public final EditTextBoldCursor T;
    public boolean T0;
    public final n6 U;
    public org.telegram.ui.ActionBar.t1 U0;
    public final TextView V;
    public boolean V0;
    public final j80 W;
    public DecimalFormat W0;
    public final TextView f42059a0;
    public final TextView f42060b0;
    public final SpannableString f42061c0;
    public boolean f42062d0;
    public boolean f42063e0;
    public float f42064f0;
    public ValueAnimator f42065g0;
    public long f42066h0;
    public boolean f42067i0;
    public org.telegram.ui.Wallet.m f42068j0;
    public final FrameLayout f42069k0;
    public final FrameLayout f42070l0;
    public r1.g m0;
    public final int f42071n;
    public float f42072n0;
    public float f42073o0;
    public final hi.e f42074p0;
    public boolean f42075q0;
    public final TLRPC.User f42076r;
    public final SpannableString f42077r0;
    public final FrameLayout f42078s;
    public final SpannableString f42079s0;
    public String f42080t0;
    public boolean f42081u0;
    public boolean f42082v0;
    public final org.telegram.ui.Wallet.h9 f42083w;
    public int f42084w0;
    public final org.telegram.ui.ActionBar.q0 f42085x;
    public DecimalFormat f42086x0;
    public final org.telegram.ui.ActionBar.q0 f42087y;
    public final int[] f42088y0;
    public boolean f42089z0;

    public xk(ti tiVar, Context context, int i7, TLRPC.User user, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, tiVar);
        this.f42066h0 = -1L;
        this.f42072n0 = 1.0f;
        this.f42073o0 = 1.0f;
        this.f42081u0 = true;
        this.f42084w0 = 6;
        this.f42088y0 = new int[2];
        this.f42071n = i7;
        this.f42076r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42078s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, c8.na.e(-1, -1, 55));
        org.telegram.ui.ActionBar.q0 a10 = this.f37135b.V2.s().a(31, 2131231247);
        this.f42085x = a10;
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        a10.e(2, 2131232049, org.telegram.messenger.gd.N0(2131742886, null));
        a10.e(3, 2131231782, org.telegram.messenger.gd.N0(2131742954, null));
        a10.setVisibility(8);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.f37134a), false, i6Var);
        this.f42087y = q0Var;
        q0Var.setIcon(2131231247);
        q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, this.f37134a), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        q0Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(q0Var, h02, null, M, i6Var);
        q0Var.setOnClickListener(new bi.k5(this, i6Var, i7, 11));
        org.telegram.ui.Wallet.h9 h9Var = new org.telegram.ui.Wallet.h9(context, new xd(15, this, user), new xd(16, this, i6Var), i6Var);
        this.f42083w = h9Var;
        h9Var.a(this.H, user);
        addView(h9Var, c8.na.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, c8.na.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, c8.na.e(-1, -2, 17));
        org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(context, i6Var);
        this.S = daVar;
        daVar.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        linearLayout.addView(daVar, c8.na.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = daVar.getEditText();
        this.T = editText;
        editText.setFilters(new InputFilter[]{new nk(0, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new ok(this, 0));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new g(this, 2));
        editText.addTextChangedListener(new vk(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.f42077r0 = spannableString;
        kq kqVar = new kq(2131232820, 0);
        kqVar.f36856x = 0.72f;
        spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.f42079s0 = spannableString2;
        kq kqVar2 = new kq(2131232824, 0);
        kqVar2.d = false;
        spannableString2.setSpan(kqVar2, 0, spannableString2.length(), 33);
        n6 n6Var = new n6(context, false, true, true, true, true);
        this.U = n6Var;
        n6Var.f37682c.m(0.35f, 320L, 3.5f, kr.h);
        n6Var.setScaleProperty(0.35f);
        n6Var.setText(W(org.telegram.ui.Wallet.v0.D(i7), 0L));
        int i11 = org.telegram.ui.ActionBar.n6.f29451d6;
        int i12 = org.telegram.ui.ActionBar.n6.f29862z6;
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i11, i12);
        org.telegram.ui.ActionBar.u6.m(n6Var, p10.f30010a, p10.f30011b, 4, 0.0f, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        n6Var.setGravity(17);
        n6Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        n6Var.setAllowCancel(true);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.n6.r1(0.08f, org.telegram.ui.ActionBar.n6.w0(i12, this.f37134a)));
        this.E = d02;
        n6Var.setSizeableBackground(d02);
        linearLayout.addView(n6Var, c8.na.t(-2, 28, 49, 0, 8, 0, 0));
        c8.sa.a(n6Var);
        n6Var.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        linearLayout.addView(frameLayout3, c8.na.r(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.P = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, c8.na.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i12, i6Var);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        org.telegram.messenger.f3.k(textView, 17, null, 2131742736);
        frameLayout3.addView(textView, c8.na.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.sa.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        linearLayout2.setVisibility(4);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setScaleX(0.8f);
        linearLayout2.setScaleY(0.8f);
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        this.V0 = false;
        TextView textView2 = new TextView(context);
        this.V = textView2;
        org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, true, false, null);
        this.F = u4Var;
        u4Var.f30160x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = u4Var.f30142c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i13 = org.telegram.ui.ActionBar.n6.bm;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i13, this.f37134a));
        u4Var.f30159w = Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i13, this.f37134a));
        textView2.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setBackground(u4Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, i12, i6Var);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, c8.na.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        c8.sa.b(textView2, 0.02f, 1.2f);
        j80 j80Var = new j80(context, i6Var);
        this.W = j80Var;
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29692q7, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Fi, i6Var);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setGravity(17);
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        j80Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        g0(false);
        linearLayout2.addView(j80Var, c8.na.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f42069k0 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f42070l0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, c8.na.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.f42059a0 = textView3;
        org.telegram.ui.ActionBar.u6.U(textView3, i12, i6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, c8.na.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.f42060b0 = textView4;
        org.telegram.ui.ActionBar.u6.U(textView4, i12, i6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, c8.na.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(org.telegram.messenger.gd.N0(2131748586, null));
        this.f42061c0 = spannableString3;
        spannableString3.setSpan(new o80(org.telegram.messenger.g0.L(80.0f), textView4), 0, spannableString3.length(), 33);
        hi.e g10 = org.telegram.messenger.m10.g(24, context, i6Var, true);
        this.f42074p0 = g10;
        g10.setText(org.telegram.messenger.gd.N0(2131742749, null));
        g10.setEnabled(false);
        g10.setOnClickListener(new View.OnClickListener(this) {
            public final xk f37465b;

            {
                this.f37465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37465b.e0();
                        return;
                    case 1:
                        this.f37465b.b0();
                        return;
                    case 2:
                        xk.P(this.f37465b);
                        return;
                    case 3:
                        this.f37465b.e0();
                        return;
                    case 4:
                        this.f37465b.e0();
                        return;
                    case 5:
                        this.f37465b.e0();
                        return;
                    default:
                        xk.R(this.f37465b);
                        return;
                }
            }
        });
        frameLayout5.addView(g10, c8.na.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, c8.na.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        o0(false, false);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25201d4);
        j0();
        this.J = true;
        org.telegram.ui.Wallet.v0.D(i7).j0(user, new qk(this, 0));
    }

    public static void P(xk xkVar) {
        boolean z10;
        ?? r42;
        byte[] bArr;
        String X;
        EditTextBoldCursor editTextBoldCursor = xkVar.T;
        int i7 = xkVar.f42071n;
        hi.e eVar = xkVar.f42074p0;
        if (eVar.f14340e0 && !eVar.R) {
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i7);
            long gramNanoAmount = xkVar.getGramNanoAmount();
            long A = D.A();
            if (WalletEngine2.isValidAddress(xkVar.H) && gramNanoAmount > 0) {
                long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.mp.u1(i7).A7.f26258r0.f17372b).f25429c;
                if (gramNanoAmount < j3) {
                    if (xkVar.f42082v0) {
                        X = xkVar.U(j3, xkVar.getCurrencyPerGram());
                    } else {
                        X = X(j3);
                    }
                    editTextBoldCursor.setText(X);
                    editTextBoldCursor.setSelection(X.length());
                    int i10 = -xkVar.f42084w0;
                    xkVar.f42084w0 = i10;
                    org.telegram.messenger.g0.E3(i10, editTextBoldCursor, null);
                } else if (gramNanoAmount > A) {
                    org.telegram.messenger.q2.APP_ERROR.a();
                    j80 j80Var = xkVar.W;
                    int i11 = -xkVar.f42084w0;
                    xkVar.f42084w0 = i11;
                    org.telegram.messenger.g0.E3(i11, j80Var, null);
                } else {
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
                    long P1 = u12.P1(xkVar.f42076r.f28641id);
                    org.telegram.messenger.p0 p0Var = u12.A7;
                    if (((org.telegram.messenger.h0) p0Var.f26256q0.f17372b).f24439c && P1 > 0 && (gramNanoAmount / 1.0E9d) * ((org.telegram.messenger.i0) p0Var.f26246l.f13936b).f24630a < (P1 / 1000.0d) * u12.f25743f6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xkVar.T0 = z10;
                    eVar.setLoading(true);
                    xkVar.O0 = true;
                    xkVar.N0 = false;
                    bi.e4 e4Var = xkVar.P0;
                    if (e4Var != null) {
                        xkVar.removeCallbacks(e4Var);
                        r42 = 0;
                        xkVar.P0 = null;
                    } else {
                        r42 = 0;
                    }
                    xkVar.Q0 = r42;
                    TLRPC.User user = xkVar.f42076r;
                    String str = xkVar.H;
                    String str2 = xkVar.f42080t0;
                    if (xkVar.f42081u0) {
                        bArr = xkVar.getPublicKey();
                    } else {
                        bArr = r42;
                    }
                    D.m0(user, str, gramNanoAmount, str2, bArr, null, null, new org.telegram.messenger.w10(xkVar) {
                        public final xk f39630b;

                        {
                            this.f39630b = xkVar;
                        }

                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str3 = (String) obj;
                                    xk xkVar2 = this.f39630b;
                                    hi.e eVar2 = xkVar2.f42074p0;
                                    ti tiVar = xkVar2.f37135b;
                                    if (!xkVar2.L && !tiVar.J) {
                                        if (org.telegram.ui.Wallet.v0.L(str3)) {
                                            eVar2.setLoading(false);
                                            xkVar2.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            tiVar.dismiss();
                                            return;
                                        } else {
                                            eVar2.setLoading(false);
                                            xkVar2.O0 = false;
                                            kc.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    this.f39630b.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, new org.telegram.messenger.w10(xkVar) {
                        public final xk f39630b;

                        {
                            this.f39630b = xkVar;
                        }

                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str3 = (String) obj;
                                    xk xkVar2 = this.f39630b;
                                    hi.e eVar2 = xkVar2.f42074p0;
                                    ti tiVar = xkVar2.f37135b;
                                    if (!xkVar2.L && !tiVar.J) {
                                        if (org.telegram.ui.Wallet.v0.L(str3)) {
                                            eVar2.setLoading(false);
                                            xkVar2.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            tiVar.dismiss();
                                            return;
                                        } else {
                                            eVar2.setLoading(false);
                                            xkVar2.O0 = false;
                                            kc.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    this.f39630b.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    });
                }
            }
        }
    }

    public static void R(xk xkVar) {
        String X;
        EditTextBoldCursor editTextBoldCursor = xkVar.T;
        BigDecimal currencyPerGram = xkVar.getCurrencyPerGram();
        if (!xkVar.f42082v0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = xkVar.getGramNanoAmount();
        xkVar.f42082v0 = !xkVar.f42082v0;
        xkVar.S.d(org.telegram.ui.Wallet.v0.D(xkVar.f42071n), xkVar.f42082v0);
        if (gramNanoAmount <= 0) {
            X = "";
        } else if (xkVar.f42082v0) {
            X = xkVar.U(gramNanoAmount, currencyPerGram);
        } else {
            X = X(gramNanoAmount);
        }
        editTextBoldCursor.setText(X);
        editTextBoldCursor.setSelection(X.length());
    }

    public static CharSequence S(xk xkVar, CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i11).toString());
        sb2.append((Object) charSequence.subSequence(i7, i10));
        sb2.append((Object) spanned.subSequence(i12, spanned.length()));
        String sb3 = sb2.toString();
        int i13 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (xkVar.f42082v0) {
            BigDecimal currencyPerGram = xkVar.getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i13 = V(currencyPerGram);
        }
        int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
        if (max >= 0 && (sb3.length() - max) - 1 > i13) {
            return spanned.subSequence(i11, i12);
        }
        if (c0(sb3).compareTo(valueOf) > 0) {
            return spanned.subSequence(i11, i12);
        }
        if (i7 != i10) {
            boolean z10 = false;
            for (int i14 = 0; i14 < sb3.length(); i14++) {
                char charAt = sb3.charAt(i14);
                if (charAt == '.' || charAt == ',') {
                    if (z10) {
                        return spanned.subSequence(i11, i12);
                    }
                    z10 = true;
                }
            }
            if (i11 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                return "0" + ((Object) charSequence.subSequence(i7, i10));
            } else if (sb3.startsWith("00")) {
                return spanned.subSequence(i11, i12);
            } else {
                return null;
            }
        }
        return null;
    }

    public static int V(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i7 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i7++;
        }
        return i7;
    }

    public static String X(long j3) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j3).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal c0(String str) {
        if (TextUtils.isEmpty(str)) {
            return BigDecimal.ZERO;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str.replace(',', '.'));
            if (bigDecimal.signum() < 0) {
                return BigDecimal.ZERO;
            }
            return bigDecimal;
        } catch (NumberFormatException unused) {
            return BigDecimal.ZERO;
        }
    }

    public static void f0(SpannableStringBuilder spannableStringBuilder, int i7, int i10, char c10) {
        int i11 = i7 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10) {
                if (spannableStringBuilder.charAt(i11) == c10 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
                    int i13 = i12;
                    while (i13 < i10 && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                        i13++;
                    }
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i12, i13, 33);
                    return;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    private float getBottomYOnScreen() {
        return Y(this.f42069k0);
    }

    private char getCurrencyDecimalSeparator() {
        TL_wallet.currencyRate selectedCurrencyRate = getSelectedCurrencyRate();
        if (selectedCurrencyRate != null && !TextUtils.isEmpty(selectedCurrencyRate.decimalSeparator)) {
            return selectedCurrencyRate.decimalSeparator.charAt(0);
        }
        return '.';
    }

    private int getCurrencyFractionDigits() {
        TL_wallet.currencyRate selectedCurrencyRate = getSelectedCurrencyRate();
        if (selectedCurrencyRate != null) {
            return selectedCurrencyRate.exp;
        }
        if (TextUtils.equals(org.telegram.ui.Wallet.v0.D(this.f42071n).h.g(), "USD")) {
            return 2;
        }
        return 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i7 = this.f42071n;
        org.telegram.ui.Wallet.g gVar = org.telegram.ui.Wallet.v0.D(i7).h;
        gVar.f();
        double h = gVar.h();
        double d = ((org.telegram.messenger.i0) org.telegram.messenger.mp.u1(i7).A7.f26246l.f13936b).f24630a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal c02 = c0(this.T.getText().toString());
        if (this.f42082v0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            if (currencyPerGram.signum() <= 0) {
                return 0L;
            }
            c02 = c02.divide(currencyPerGram, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = c02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    private String getGramsText() {
        long gramNanoAmount = getGramNanoAmount();
        if (this.W0 == null) {
            this.W0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        if (gramNanoAmount > 0) {
            return this.W0.format(BigDecimal.valueOf(gramNanoAmount, 9));
        }
        return "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.g gVar = org.telegram.ui.Wallet.v0.D(this.f42071n).h;
        TL_wallet.currencyRates f10 = gVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i7);
            i7++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, gVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public void setFeeVisibilityProgress(float f10) {
        int i7;
        this.f42064f0 = f10;
        TextView textView = this.f42060b0;
        textView.setAlpha(f10);
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        textView.setVisibility(i7);
        requestLayout();
    }

    @Override
    public final void A() {
        T();
        h0();
    }

    @Override
    public final void B(int i7, int i10) {
        boolean z10;
        int L;
        int i11;
        int L2;
        ti tiVar = this.f37135b;
        if (tiVar.f40002p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42089z0 = z10;
        this.f37138f = z10;
        if (z10) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(70.0f);
        }
        int round = Math.round(org.telegram.messenger.g0.L(32.0f) * this.f42064f0) + org.telegram.messenger.g0.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42069k0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.f42089z0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
            tiVar.f30257r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    tiVar.f30257r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            tiVar.f30257r0 = true;
        }
        int d = i5.c.d(1.0f, i11, 0) + org.telegram.messenger.g0.f24220m;
        FrameLayout frameLayout = this.f42078s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != d) {
            layoutParams2.topMargin = d;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.f3.b(4.0f, d - org.telegram.messenger.g0.f24220m, 0);
        org.telegram.ui.Wallet.h9 h9Var = this.f42083w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h9Var.getLayoutParams();
        if (this.f42089z0) {
            L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            L2 = b10 - org.telegram.messenger.g0.L(4.0f);
        }
        int max = Math.max(0, L2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            h9Var.setLayoutParams(layoutParams3);
        }
        k0();
    }

    @Override
    public final void H(li liVar) {
        Activity W;
        T();
        if (this.M == null && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (Math.min(point.x, point.y) < org.telegram.messenger.g0.L(700.0f) && (W = org.telegram.messenger.g0.W(getContext())) != null) {
                try {
                    this.N = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.M = W;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        this.M0 = false;
        this.O0 = false;
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.N0 = false;
        this.C0 = false;
        this.L0 = false;
        float f10 = 0.0f;
        this.O.setTranslationY(0.0f);
        this.f42069k0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.h9 h9Var = this.f42083w;
        h9Var.setTranslationY(0.0f);
        h9Var.setAlpha(1.0f);
        this.E0 = false;
        ti tiVar = this.f37135b;
        tiVar.V2.setTitle(org.telegram.messenger.gd.N0(2131742745, null));
        tiVar.V2.setDrawGlassTitle(false);
        this.f42085x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        a0();
        org.telegram.ui.Wallet.da daVar = this.S;
        if (daVar.getDiamondView().f44761f == null) {
            f10 = 1.0f;
        }
        this.f42073o0 = f10;
        this.f42072n0 = f10;
        m0();
        if (this.f42072n0 < 1.0f) {
            daVar.getDiamondView().l(new rk(this, 3));
        }
    }

    @Override
    public final void I() {
        this.M0 = true;
        post(new rk(this, 4));
    }

    @Override
    public final boolean O() {
        return !this.O0;
    }

    public final void T() {
        this.S.getDiamondView().l(null);
        r1.g gVar = this.m0;
        if (gVar != null) {
            gVar.d();
        }
        this.f42072n0 = 1.0f;
        m0();
    }

    public final String U(long j3, BigDecimal bigDecimal) {
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int V = V(bigDecimal);
        if (scale.scale() > V) {
            scale = scale.setScale(V, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final SpannableStringBuilder W(org.telegram.ui.Wallet.v0 v0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(v0Var.r(j3, false));
        f0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f42077r0);
    }

    public final float Y(View view) {
        float f10 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f10 += view.getY() - view2.getScrollY();
            view = view2;
        }
        int[] iArr = this.f42088y0;
        view.getLocationOnScreen(iArr);
        return ((f10 + iArr[1]) + this.A0) - this.f37135b.f40017t2;
    }

    public final float Z(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (Y(view) - this.f42070l0.getTranslationY());
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void a0() {
        if (!this.L && !TextUtils.isEmpty(this.H)) {
            org.telegram.ui.Wallet.m mVar = this.f42068j0;
            byte[] bArr = null;
            if (mVar != null) {
                mVar.run();
                this.f42068j0 = null;
            }
            this.f42066h0 = -1L;
            j0();
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(this.f42071n);
            if (this.f42067i0) {
                String str = this.H;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.f42080t0;
                if (this.f42081u0) {
                    bArr = getPublicKey();
                }
                this.f42068j0 = D.m(str, max, str2, bArr, new qk(this, 1));
            }
        }
    }

    public final void b0() {
        if (!this.L && !this.O0 && this.P0 == null && this.U0 == null) {
            e0();
            bi.e4 e4Var = new bi.e4(this, SystemClock.uptimeMillis() + 1500, 23);
            this.P0 = e4Var;
            post(e4Var);
        }
    }

    @Override
    public final void d() {
        try {
            org.telegram.ui.ActionBar.q0 q0Var = this.f42087y;
            org.telegram.ui.ActionBar.i6 i6Var = this.f37134a;
            if (q0Var != null) {
                q0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            }
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.r1(0.08f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29862z6, i6Var)), shapeDrawable);
                n6 n6Var = this.U;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.u4 u4Var = this.F;
            if (u4Var != null) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.bm, i6Var);
                u4Var.f30142c.setColor(w02);
                u4Var.f30159w = Integer.valueOf(w02);
                TextView textView = this.V;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            kq kqVar = this.G;
            if (kqVar != null) {
                kqVar.f36857y = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var);
                j80 j80Var = this.W;
                if (j80Var != null) {
                    j80Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d0() {
        if (this.M0 && !this.C0 && !this.L0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.O.getHeight() > 0 && this.f42069k0.getHeight() > 0) {
            this.F0 = getBottomYOnScreen();
            this.G0 = Y(this.f42083w);
            this.E0 = true;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25201d4) {
            boolean z10 = this.f42067i0;
            i0();
            if (z10 != this.f42067i0) {
                a0();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.f37135b.V2.getAlpha();
        l0();
        if (this.m0 != null || this.f42072n0 < 1.0f) {
            m0();
        }
        super.dispatchDraw(canvas);
        d0();
    }

    public final void e0() {
        if (!this.L && !this.O0) {
            ti tiVar = this.f37135b;
            if (!tiVar.J) {
                if (!this.M0) {
                    this.N0 = true;
                    return;
                }
                this.N0 = false;
                EditTextBoldCursor editTextBoldCursor = this.T;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                tiVar.i1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new rk(this, 1), 220L);
            }
        }
    }

    public final void g0(boolean z10) {
        float f10;
        float f11 = 0.0f;
        j80 j80Var = this.W;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131742832, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131742886, null));
            spannableStringBuilder.append((CharSequence) " >");
            kq kqVar = new kq(2131232702, 0);
            kqVar.f36857y = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f37134a);
            float N = org.telegram.messenger.g0.N(0.66f);
            kqVar.f36853r = 0.0f;
            kqVar.f36854s = N;
            this.G = kqVar;
            spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hi.cb(this, 6), length, spannableStringBuilder.length(), 33);
            j80Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = j80Var.animate();
        float f12 = 1.0f;
        if (z10) {
            f11 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f11);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f12 = 0.6f;
        }
        scaleX.scaleY(f12).setDuration(320L).setInterpolator(kr.h).start();
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.f42078s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return org.telegram.messenger.g0.L(13.0f) + Math.max(0, top - (org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f24220m));
    }

    @Override
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.f37134a);
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42078s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.I == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr = this.I;
            if (i7 >= bArr.length) {
                return null;
            }
            if (bArr[i7] != 0) {
                return bArr;
            }
            i7++;
        }
    }

    public final void h0() {
        if (this.O0 && !this.L) {
            this.N0 = false;
            EditTextBoldCursor editTextBoldCursor = this.T;
            editTextBoldCursor.setShowSoftInputOnFocus(false);
            editTextBoldCursor.setFocusable(false);
            editTextBoldCursor.clearFocus();
            setFocusableInTouchMode(true);
            requestFocus();
        }
    }

    public final void i0() {
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence V;
        SpannableStringBuilder W;
        String X;
        k0();
        int i7 = this.f42071n;
        org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i7);
        long A = D.A();
        long gramNanoAmount = getGramNanoAmount();
        long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.mp.u1(i7).A7.f26258r0.f17372b).f25429c;
        int i10 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.T;
        if (i10 > 0 && gramNanoAmount < j3) {
            if (this.f42082v0) {
                X = U(j3, getCurrencyPerGram());
            } else {
                X = X(j3);
            }
            editTextBoldCursor.setText(X);
            editTextBoldCursor.setSelection(X.length());
            int i11 = -this.f42084w0;
            this.f42084w0 = i11;
            org.telegram.messenger.g0.E3(i11, editTextBoldCursor, null);
            return;
        }
        boolean z13 = false;
        if (WalletEngine2.isValidAddress(this.H) && gramNanoAmount <= A) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > A) {
            z11 = true;
        } else {
            z11 = false;
        }
        g0(z11);
        String gramsText = getGramsText();
        if (this.H == null && this.J) {
            z12 = true;
        } else {
            z12 = false;
        }
        hi.e eVar = this.f42074p0;
        eVar.setLoading(z12);
        if (TextUtils.isEmpty(gramsText)) {
            V = org.telegram.messenger.gd.N0(2131742749, null);
        } else {
            V = org.telegram.messenger.gd.V(null, null, 2131742750, org.telegram.ui.Wallet.v0.q("Grams", gramsText, 2131749314));
        }
        eVar.i(V, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z14 = !isEmpty;
        if (!isEmpty && z10 && !this.K) {
            z13 = true;
        }
        eVar.setEnabled(z13);
        o0(z14, this.M0);
        j0();
        this.S.d(org.telegram.ui.Wallet.v0.D(i7), this.f42082v0);
        if (this.f42082v0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f42079s0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.f42086x0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.f42086x0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.f42086x0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            f0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131749340, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            W = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f42077r0);
        } else {
            W = W(D, gramNanoAmount);
        }
        this.U.setText(W);
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0() {
        boolean z10;
        boolean z11;
        float f10;
        int i7 = this.f42071n;
        org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(i7);
        this.f42059a0.setText(org.telegram.messenger.gd.V(null, null, 2131742934, org.telegram.ui.Wallet.v0.q("Grams", org.telegram.ui.Wallet.v0.u(D.A(), true), 2131749314)));
        long j3 = ((org.telegram.messenger.l0) org.telegram.messenger.mp.u1(i7).A7.f26258r0.f17372b).f25429c;
        if (!D.M() && D.A() >= j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42067i0 = z10;
        boolean z12 = this.f42063e0 | (!TextUtils.isEmpty(this.T.getText()));
        this.f42063e0 = z12;
        if (this.f42067i0 && z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f42062d0 != z11) {
            this.f42062d0 = z11;
            ValueAnimator valueAnimator = this.f42065g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f42065g0 = null;
            }
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.M0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42064f0, f10);
                this.f42065g0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f42065g0.setInterpolator(kr.h);
                this.f42065g0.addUpdateListener(new w(this, 12));
                this.f42065g0.start();
            } else {
                setFeeVisibilityProgress(f10);
            }
        }
        long j10 = this.f42066h0;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TextView textView = this.f42060b0;
        if (i10 >= 0) {
            textView.setText(org.telegram.messenger.gd.V(null, null, 2131742820, org.telegram.ui.Wallet.v0.x(j10, false)));
        } else {
            textView.setText(org.telegram.messenger.gd.V(null, null, 2131742820, this.f42061c0));
        }
    }

    @Override
    public final boolean k() {
        if (this.f37135b.f40002p3.Q() <= org.telegram.messenger.g0.L(20.0f)) {
            return false;
        }
        this.N0 = false;
        bi.e4 e4Var = this.P0;
        if (e4Var != null) {
            removeCallbacks(e4Var);
            this.P0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        return true;
    }

    public final void k0() {
        TextView textView;
        final boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        LinearLayout linearLayout = this.P;
        if (linearLayout != null && (textView = this.R) != null) {
            if (getGramNanoAmount() <= 0 && this.V.getVisibility() != 0 && !this.f42089z0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.V0) {
                this.V0 = z10;
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                ViewPropertyAnimator animate = linearLayout.animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.8f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).withEndAction(new Runnable(this) {
                    public final xk f40056b;

                    {
                        this.f40056b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f40056b.P;
                                if (z10) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout2.setVisibility(i7);
                                return;
                            default:
                                TextView textView2 = this.f40056b.R;
                                if (!z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView2.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L);
                kr krVar = kr.h;
                duration.setInterpolator(krVar).start();
                ViewPropertyAnimator animate2 = textView.animate();
                if (!z10) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (!z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.8f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (z10) {
                    f15 = 0.8f;
                }
                scaleX2.scaleY(f15).withEndAction(new Runnable(this) {
                    public final xk f40056b;

                    {
                        this.f40056b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f40056b.P;
                                if (z10) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout2.setVisibility(i7);
                                return;
                            default:
                                TextView textView2 = this.f40056b.R;
                                if (!z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView2.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(krVar).start();
            }
        }
    }

    public final void l0() {
        float f10;
        View view = this.O;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.f42069k0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.f42078s;
                float Y = Y(view2);
                org.telegram.ui.Wallet.h9 h9Var = this.f42083w;
                if (h9Var.getVisibility() == 0) {
                    f10 = Math.max(Y, (h9Var.getScaleY() * (h9Var.getContentBottom() - h9Var.getPivotY())) + h9Var.getPivotY() + Y(h9Var));
                } else {
                    f10 = Y;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((Y + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, Z(this.f42059a0)), Z(this.f42060b0)), Z(this.f42074p0)) - f10);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                view.setScaleX(min);
                view.setScaleY(min);
                float f11 = (max / 2.0f) + f10;
                view.setTranslationY(f11 - ((view.getHeight() / 2.0f) + (Y(view) - view.getTranslationY())));
            }
        }
    }

    public final void m0() {
        boolean z10;
        float max = Math.max(this.f42073o0, Math.max(0.0f, Math.min(1.0f, this.f42072n0)));
        this.f42073o0 = max;
        float f10 = 1.0f - max;
        float f11 = this.f42072n0;
        if (this.m0 == null && f11 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Wallet.da daVar = this.S;
        daVar.e(f11, max, z10);
        daVar.setTranslationY((1.0f - this.f42072n0) * (((this.O.getHeight() / 2.0f) - daVar.getTop()) - (daVar.getHeight() / 2.0f)));
        float f12 = this.f42073o0;
        n6 n6Var = this.U;
        n6Var.setAlpha(f12);
        n6Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f13 = this.f42073o0;
        FrameLayout frameLayout = this.Q;
        frameLayout.setAlpha(f13);
        frameLayout.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f14 = this.f42073o0;
        FrameLayout frameLayout2 = this.f42070l0;
        frameLayout2.setAlpha(f14);
        frameLayout2.setTranslationY(org.telegram.messenger.g0.L(24.0f) * f10);
    }

    @Override
    public final void n(float f10, float f11) {
        this.A0 = f10;
        this.B0 = f11;
        n0();
    }

    public final void n0() {
        float f10;
        if (this.C0 && this.O.getHeight() > 0) {
            FrameLayout frameLayout = this.f42069k0;
            if (frameLayout.getHeight() > 0) {
                if (this.D0) {
                    f10 = this.B0;
                } else {
                    f10 = 1.0f - this.B0;
                }
                float f11 = this.J0;
                float z10 = com.google.android.gms.internal.vision.e2.z(this.K0, f11, f10, f11);
                float f12 = this.H0;
                float z11 = com.google.android.gms.internal.vision.e2.z(this.I0, f12, f10, f12);
                frameLayout.setTranslationY(z10 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                org.telegram.ui.Wallet.h9 h9Var = this.f42083w;
                h9Var.setTranslationY(z11 - (Y(h9Var) - h9Var.getTranslationY()));
                l0();
            }
        }
    }

    public final void o0(boolean z10, boolean z11) {
        float f10;
        if (z11 && this.f42075q0 == z10) {
            return;
        }
        this.f42075q0 = z10;
        hi.e eVar = this.f42074p0;
        eVar.animate().cancel();
        TextView textView = this.f42059a0;
        textView.animate().cancel();
        TextView textView2 = this.f42060b0;
        textView2.animate().cancel();
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            f12 = 0.8f;
        }
        if (!z10) {
            f11 = org.telegram.messenger.g0.L(60.0f);
        }
        int i7 = 0;
        if (!z11) {
            if (!z10) {
                i7 = 4;
            }
            eVar.setVisibility(i7);
            eVar.setAlpha(f10);
            eVar.setScaleX(f12);
            eVar.setScaleY(f12);
            textView.setTranslationY(f11);
            textView2.setTranslationY(f11);
            return;
        }
        eVar.setVisibility(0);
        ViewPropertyAnimator duration = eVar.animate().alpha(f10).scaleX(f12).scaleY(f12).setDuration(320L);
        kr krVar = kr.h;
        duration.setInterpolator(krVar).withEndAction(new rk(this, 5)).start();
        textView.animate().translationY(f11).setDuration(320L).setInterpolator(krVar).start();
        textView2.animate().translationY(f11).setDuration(320L).setInterpolator(krVar).start();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.L0) {
            this.L0 = false;
            this.O.setTranslationY(0.0f);
            this.f42069k0.setTranslationY(0.0f);
            this.f42083w.setTranslationY(0.0f);
            d0();
        } else if (this.C0) {
            n0();
        }
        l0();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        if (!z10) {
            h0();
        }
        super.onWindowFocusChanged(z10);
    }

    @Override
    public final void p() {
        if (this.L) {
            return;
        }
        this.L = true;
        T();
        org.telegram.ui.Wallet.f7 f7Var = this.R0;
        if (f7Var != null) {
            AnimatorSet animatorSet = f7Var.f44297m;
            if (!f7Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    f7Var.a(false);
                }
            }
            this.R0 = null;
        }
        org.telegram.ui.Wallet.sa saVar = this.S0;
        if (saVar != null) {
            AnimatorSet animatorSet2 = saVar.f45127m;
            if (!saVar.f45133s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    saVar.b();
                }
            }
            this.S0 = null;
        }
        ValueAnimator valueAnimator = this.f42065g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42065g0 = null;
        }
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.M = null;
        }
        this.P.animate().cancel();
        this.R.animate().cancel();
        this.W.animate().cancel();
        this.f42074p0.animate().cancel();
        this.f42059a0.animate().cancel();
        this.f42060b0.animate().cancel();
        bi.e4 e4Var = this.P0;
        if (e4Var != null) {
            removeCallbacks(e4Var);
            this.P0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.U0;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        org.telegram.ui.Wallet.m mVar = this.f42068j0;
        if (mVar != null) {
            mVar.run();
            this.f42068j0 = null;
        }
        org.telegram.messenger.ks.f(this.f42071n).n(this, org.telegram.messenger.ks.f25201d4);
        this.f37135b.V2.s().removeView(this.f42085x);
        org.telegram.messenger.g0.v1(this.T);
    }

    public void setSendTransitionProgress(float f10) {
        this.f42083w.setAlpha(1.0f - f10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
    }

    @Override
    public final void u() {
        T();
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.M = null;
        }
        this.f37135b.V2.setDrawGlassTitle(true);
        this.M0 = false;
        this.N0 = false;
        bi.e4 e4Var = this.P0;
        if (e4Var != null) {
            removeCallbacks(e4Var);
            this.P0 = null;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.U0;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        this.f42085x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.T;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void w(int i7) {
        if (i7 == 2) {
            org.telegram.ui.Wallet.o6.N0(this.f42071n, getContext(), this.f37134a);
        } else if (i7 == 3) {
            b0();
        }
    }

    @Override
    public final void y() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        float bottomYOnScreen = getBottomYOnScreen();
        FrameLayout frameLayout = this.f42069k0;
        frameLayout.setTranslationY(this.K0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.h9 h9Var = this.f42083w;
        h9Var.setTranslationY(this.I0 - (Y(h9Var) - h9Var.getTranslationY()));
        this.L0 = true;
        requestLayout();
    }

    @Override
    public final void z(int i7, boolean z10) {
        float f10;
        float bottomYOnScreen;
        float Y;
        this.C0 = true;
        this.L0 = false;
        this.D0 = z10;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.B0 = f10;
        if (this.E0) {
            bottomYOnScreen = this.F0;
        } else {
            bottomYOnScreen = getBottomYOnScreen();
        }
        this.J0 = bottomYOnScreen;
        boolean z11 = this.E0;
        org.telegram.ui.Wallet.h9 h9Var = this.f42083w;
        if (z11) {
            Y = this.G0;
        } else {
            Y = Y(h9Var);
        }
        this.H0 = Y;
        this.K0 = getBottomYOnScreen() - this.f42069k0.getTranslationY();
        this.I0 = Y(h9Var) - h9Var.getTranslationY();
        n0();
    }
}
