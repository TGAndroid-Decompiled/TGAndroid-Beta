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
public final class kk extends uh implements org.telegram.messenger.vs {
    public float A0;
    public boolean B0;
    public boolean C0;
    public final ShapeDrawable D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.c5 E;
    public float E0;
    public dq F;
    public float F0;
    public String G;
    public float G0;
    public byte[] H;
    public float H0;
    public boolean I;
    public float I0;
    public boolean J;
    public float J0;
    public boolean K;
    public boolean K0;
    public Activity L;
    public boolean L0;
    public int M;
    public boolean M0;
    public final hk N;
    public boolean N0;
    public final LinearLayout O;
    public bi.e O0;
    public final FrameLayout P;
    public TL_wallet.walletTransaction P0;
    public final TextView Q;
    public org.telegram.ui.Wallet.s6 Q0;
    public final org.telegram.ui.Wallet.q9 R;
    public org.telegram.ui.Wallet.fa R0;
    public final EditTextBoldCursor S;
    public boolean S0;
    public final f6 T;
    public org.telegram.ui.ActionBar.x1 T0;
    public final TextView U;
    public boolean U0;
    public final p80 V;
    public DecimalFormat V0;
    public final TextView W;
    public final TextView f27860a0;
    public final SpannableString f27861b0;
    public boolean f27862c0;
    public boolean f27863d0;
    public float f27864e0;
    public ValueAnimator f27865f0;
    public long f27866g0;
    public boolean f27867h0;
    public org.telegram.ui.Wallet.l f27868i0;
    public final FrameLayout f27869j0;
    public final FrameLayout f27870k0;
    public o1.j f27871l0;
    public float m0;
    public final int f27872n;
    public float f27873n0;
    public final vh.d f27874o0;
    public boolean f27875p0;
    public final SpannableString f27876q0;
    public final TLRPC.User f27877r;
    public final SpannableString f27878r0;
    public final FrameLayout f27879s;
    public String f27880s0;
    public boolean f27881t0;
    public boolean f27882u0;
    public int f27883v0;
    public final org.telegram.ui.Wallet.w8 f27884w;
    public DecimalFormat f27885w0;
    public final org.telegram.ui.ActionBar.t0 f27886x;
    public final int[] f27887x0;
    public final org.telegram.ui.ActionBar.t0 f27888y;
    public boolean f27889y0;
    public float f27890z0;

    public kk(bi biVar, Context context, int i10, TLRPC.User user, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, biVar);
        this.f27866g0 = -1L;
        this.m0 = 1.0f;
        this.f27873n0 = 1.0f;
        this.f27881t0 = true;
        this.f27883v0 = 6;
        this.f27887x0 = new int[2];
        this.f27872n = i10;
        this.f27877r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27879s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.b6.e(-1, -1, 55));
        org.telegram.ui.ActionBar.t0 a2 = this.f30964b.R2.p().a(31, 2131231245);
        this.f27886x = a2;
        a2.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        a2.e(2, 2131232043, org.telegram.messenger.dd.L0(2131743163, null));
        a2.e(3, 2131231777, org.telegram.messenger.dd.L0(2131743231, null));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f30963a), false, p6Var);
        this.f27888y = t0Var;
        t0Var.setIcon(2131231245);
        t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, this.f30963a), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        t0Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(t0Var, h02, null, N, p6Var);
        t0Var.setOnClickListener(new jg.w1(this, p6Var, i10, 8));
        org.telegram.ui.Wallet.w8 w8Var = new org.telegram.ui.Wallet.w8(context, new cd(15, this, user), new cd(16, this, p6Var), p6Var);
        this.f27884w = w8Var;
        w8Var.a(this.G, user);
        addView(w8Var, w7.b6.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, w7.b6.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, w7.b6.e(-1, -2, 17));
        org.telegram.ui.Wallet.q9 q9Var = new org.telegram.ui.Wallet.q9(context, p6Var);
        this.R = q9Var;
        q9Var.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
                        return;
                }
            }
        });
        linearLayout.addView(q9Var, w7.b6.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = q9Var.getEditText();
        this.S = editText;
        editText.setFilters(new InputFilter[]{new ak(0, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new bk(this, 0));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new t0(this, 1));
        editText.addTextChangedListener(new ik(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.f27876q0 = spannableString;
        dq dqVar = new dq(2131232812, 0);
        dqVar.f25571x = 0.72f;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.f27878r0 = spannableString2;
        dq dqVar2 = new dq(2131232816, 0);
        dqVar2.d = false;
        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
        f6 f6Var = new f6(context, false, true, true, true, true);
        this.T = f6Var;
        f6Var.f26082c.m(0.35f, 320L, 3.5f, gr.h);
        f6Var.setScaleProperty(0.35f);
        f6Var.setText(U(org.telegram.ui.Wallet.k0.x(i10), 0L));
        int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
        int i13 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i12, i13);
        org.telegram.ui.ActionBar.a7.n(f6Var, q6.f21453a, q6.f21454b, 4, 0.0f, p6Var);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        f6Var.setGravity(17);
        f6Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        f6Var.setAllowCancel(true);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.r1(0.08f, org.telegram.ui.ActionBar.t6.w0(i13, this.f30963a)));
        this.D = d02;
        f6Var.setSizeableBackground(d02);
        linearLayout.addView(f6Var, w7.b6.t(-2, 28, 49, 0, 8, 0, 0));
        w7.e6.a(f6Var);
        f6Var.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        linearLayout.addView(frameLayout3, w7.b6.r(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.O = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, w7.b6.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.Q = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i13, p6Var);
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        org.telegram.messenger.m5.l(textView, 17, null, 2131743033);
        frameLayout3.addView(textView, w7.b6.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.e6.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
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
        this.U0 = false;
        TextView textView2 = new TextView(context);
        this.U = textView2;
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, true, false, null);
        this.E = c5Var;
        c5Var.f20230x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = c5Var.f20213c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.i0.N(0.5f)));
        int i14 = org.telegram.ui.ActionBar.t6.Yl;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i14, this.f30963a));
        c5Var.f20229w = Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i14, this.f30963a));
        textView2.setPadding(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(8.0f));
        textView2.setBackground(c5Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView2, i13, p6Var);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, w7.b6.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
                        return;
                }
            }
        });
        w7.e6.b(textView2, 0.02f, 1.2f);
        p80 p80Var = new p80(context, p6Var);
        this.V = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21171q7, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Ci, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        p80Var.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        e0(false);
        linearLayout2.addView(p80Var, w7.b6.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f27869j0 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f27870k0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, w7.b6.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.W = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i13, p6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, w7.b6.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.f27860a0 = textView4;
        org.telegram.ui.ActionBar.a7.V(textView4, i13, p6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, w7.b6.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(org.telegram.messenger.dd.L0(2131748789, null));
        this.f27861b0 = spannableString3;
        spannableString3.setSpan(new u80(org.telegram.messenger.i0.L(80.0f), textView4), 0, spannableString3.length(), 33);
        vh.d i15 = org.telegram.messenger.a30.i(24, context, p6Var, true);
        this.f27874o0 = i15;
        i15.setText(org.telegram.messenger.dd.L0(2131743046, null));
        i15.setEnabled(false);
        i15.setOnClickListener(new View.OnClickListener(this) {
            public final kk f33173b;

            {
                this.f33173b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33173b.c0();
                        return;
                    case 1:
                        this.f33173b.Z();
                        return;
                    case 2:
                        kk.N(this.f33173b);
                        return;
                    case 3:
                        this.f33173b.c0();
                        return;
                    case 4:
                        this.f33173b.c0();
                        return;
                    case 5:
                        this.f33173b.c0();
                        return;
                    default:
                        kk.P(this.f33173b);
                        return;
                }
            }
        });
        frameLayout5.addView(i15, w7.b6.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, w7.b6.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        m0(false, false);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14678a4);
        h0();
        this.I = true;
        org.telegram.ui.Wallet.k0.x(i10).a0(user, new dk(this, 0));
    }

    public static void N(kk kkVar) {
        boolean z10;
        ?? r42;
        byte[] bArr;
        String V;
        EditTextBoldCursor editTextBoldCursor = kkVar.S;
        int i10 = kkVar.f27872n;
        vh.d dVar = kkVar.f27874o0;
        if (dVar.f51070c0 && !dVar.Q) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
            long gramNanoAmount = kkVar.getGramNanoAmount();
            long v = x10.v();
            if (WalletEngine2.isValidAddress(kkVar.G) && gramNanoAmount > 0) {
                long j10 = org.telegram.messenger.wp.r1(i10).f19300y7.f18037l0.f17366a.f17238c;
                if (gramNanoAmount < j10) {
                    if (kkVar.f27882u0) {
                        V = kkVar.S(j10, kkVar.getCurrencyPerGram());
                    } else {
                        V = V(j10);
                    }
                    editTextBoldCursor.setText(V);
                    editTextBoldCursor.setSelection(V.length());
                    int i11 = -kkVar.f27883v0;
                    kkVar.f27883v0 = i11;
                    org.telegram.messenger.i0.F3(i11, editTextBoldCursor, null);
                } else if (gramNanoAmount > v) {
                    org.telegram.messenger.t2.APP_ERROR.a();
                    p80 p80Var = kkVar.V;
                    int i12 = -kkVar.f27883v0;
                    kkVar.f27883v0 = i12;
                    org.telegram.messenger.i0.F3(i12, p80Var, null);
                } else {
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
                    long M1 = r12.M1(kkVar.f27877r.f19943id);
                    org.telegram.messenger.s0 s0Var = r12.f19300y7;
                    if (((org.telegram.messenger.j0) s0Var.f18035k0.f11588b).f16393c && M1 > 0 && (gramNanoAmount / 1.0E9d) * ((org.telegram.messenger.k0) s0Var.f18036l.f13481b).f16536a < (M1 / 1000.0d) * r12.f19111d6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kkVar.S0 = z10;
                    dVar.setLoading(true);
                    kkVar.N0 = true;
                    kkVar.M0 = false;
                    bi.e eVar = kkVar.O0;
                    if (eVar != null) {
                        kkVar.removeCallbacks(eVar);
                        r42 = 0;
                        kkVar.O0 = null;
                    } else {
                        r42 = 0;
                    }
                    kkVar.P0 = r42;
                    TLRPC.User user = kkVar.f27877r;
                    String str = kkVar.G;
                    String str2 = kkVar.f27880s0;
                    if (kkVar.f27881t0) {
                        bArr = kkVar.getPublicKey();
                    } else {
                        bArr = r42;
                    }
                    x10.d0(user, str, gramNanoAmount, str2, bArr, null, null, new org.telegram.messenger.r20(kkVar) {
                        public final kk f26181b;

                        {
                            this.f26181b = kkVar;
                        }

                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str3 = (String) obj;
                                    kk kkVar2 = this.f26181b;
                                    vh.d dVar2 = kkVar2.f27874o0;
                                    bi biVar = kkVar2.f30964b;
                                    if (!kkVar2.K && !biVar.I) {
                                        if ("PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                            dVar2.setLoading(false);
                                            kkVar2.N0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            biVar.dismiss();
                                            return;
                                        } else {
                                            dVar2.setLoading(false);
                                            kkVar2.N0 = false;
                                            cc.X().e0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    this.f26181b.P0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, new org.telegram.messenger.r20(kkVar) {
                        public final kk f26181b;

                        {
                            this.f26181b = kkVar;
                        }

                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str3 = (String) obj;
                                    kk kkVar2 = this.f26181b;
                                    vh.d dVar2 = kkVar2.f27874o0;
                                    bi biVar = kkVar2.f30964b;
                                    if (!kkVar2.K && !biVar.I) {
                                        if ("PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                            dVar2.setLoading(false);
                                            kkVar2.N0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            biVar.dismiss();
                                            return;
                                        } else {
                                            dVar2.setLoading(false);
                                            kkVar2.N0 = false;
                                            cc.X().e0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    this.f26181b.P0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, null);
                }
            }
        }
    }

    public static void P(kk kkVar) {
        String V;
        EditTextBoldCursor editTextBoldCursor = kkVar.S;
        BigDecimal currencyPerGram = kkVar.getCurrencyPerGram();
        if (!kkVar.f27882u0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = kkVar.getGramNanoAmount();
        kkVar.f27882u0 = !kkVar.f27882u0;
        kkVar.R.d(org.telegram.ui.Wallet.k0.x(kkVar.f27872n), kkVar.f27882u0);
        if (gramNanoAmount <= 0) {
            V = "";
        } else if (kkVar.f27882u0) {
            V = kkVar.S(gramNanoAmount, currencyPerGram);
        } else {
            V = V(gramNanoAmount);
        }
        editTextBoldCursor.setText(V);
        editTextBoldCursor.setSelection(V.length());
    }

    public static CharSequence Q(kk kkVar, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i12).toString());
        sb2.append((Object) charSequence.subSequence(i10, i11));
        sb2.append((Object) spanned.subSequence(i13, spanned.length()));
        String sb3 = sb2.toString();
        int i14 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (kkVar.f27882u0) {
            BigDecimal currencyPerGram = kkVar.getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i14 = T(currencyPerGram);
        }
        int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
        if (max >= 0 && (sb3.length() - max) - 1 > i14) {
            return spanned.subSequence(i12, i13);
        }
        if (a0(sb3).compareTo(valueOf) > 0) {
            return spanned.subSequence(i12, i13);
        }
        if (i10 != i11) {
            boolean z10 = false;
            for (int i15 = 0; i15 < sb3.length(); i15++) {
                char charAt = sb3.charAt(i15);
                if (charAt == '.' || charAt == ',') {
                    if (z10) {
                        return spanned.subSequence(i12, i13);
                    }
                    z10 = true;
                }
            }
            if (i12 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                return "0" + ((Object) charSequence.subSequence(i10, i11));
            } else if (sb3.startsWith("00")) {
                return spanned.subSequence(i12, i13);
            } else {
                return null;
            }
        }
        return null;
    }

    public static int T(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i10 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static String V(long j10) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal a0(String str) {
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

    public static void d0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
        int i12 = i10 + 1;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11) {
                if (spannableStringBuilder.charAt(i12) == c10 && Character.isDigit(spannableStringBuilder.charAt(i12 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                    int i14 = i13;
                    while (i14 < i11 && Character.isDigit(spannableStringBuilder.charAt(i14))) {
                        i14++;
                    }
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i13, i14, 33);
                    return;
                }
                i12 = i13;
            } else {
                return;
            }
        }
    }

    private float getBottomYOnScreen() {
        return W(this.f27869j0);
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
        if (TextUtils.equals(org.telegram.ui.Wallet.k0.x(this.f27872n).h.g(), "USD")) {
            return 2;
        }
        return 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i10 = this.f27872n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.x(i10).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.k0) org.telegram.messenger.wp.r1(i10).f19300y7.f18036l.f13481b).f16536a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal a02 = a0(this.S.getText().toString());
        if (this.f27882u0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            if (currencyPerGram.signum() <= 0) {
                return 0L;
            }
            a02 = a02.divide(currencyPerGram, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = a02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    private String getGramsText() {
        long gramNanoAmount = getGramNanoAmount();
        if (this.V0 == null) {
            this.V0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        if (gramNanoAmount > 0) {
            return this.V0.format(BigDecimal.valueOf(gramNanoAmount, 9));
        }
        return "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.x(this.f27872n).h;
        TL_wallet.currencyRates f7 = fVar.f();
        if (f7 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f7.rates;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i10);
            i10++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public void setFeeVisibilityProgress(float f7) {
        int i10;
        this.f27864e0 = f7;
        TextView textView = this.f27860a0;
        textView.setAlpha(f7);
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        requestLayout();
    }

    @Override
    public final void A() {
        R();
        f0();
    }

    @Override
    public final void B(int i10, int i11) {
        boolean z10;
        int L;
        int i12;
        int L2;
        bi biVar = this.f30964b;
        if (biVar.f24786l3.Q() > org.telegram.messenger.i0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27889y0 = z10;
        this.f30966f = z10;
        if (z10) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(70.0f);
        }
        int round = Math.round(org.telegram.messenger.i0.L(32.0f) * this.f27864e0) + org.telegram.messenger.i0.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27869j0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.f27889y0) {
            i12 = org.telegram.messenger.i0.L(56.0f);
            biVar.f21611q0 = false;
        } else {
            if (!org.telegram.messenger.i0.Q1()) {
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    biVar.f21611q0 = true;
                }
            }
            i12 = (i11 / 5) * 2;
            biVar.f21611q0 = true;
        }
        int d = i0.a.d(1.0f, i12, 0) + org.telegram.messenger.i0.f16166m;
        FrameLayout frameLayout = this.f27879s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != d) {
            layoutParams2.topMargin = d;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.m5.b(4.0f, d - org.telegram.messenger.i0.f16166m, 0);
        org.telegram.ui.Wallet.w8 w8Var = this.f27884w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) w8Var.getLayoutParams();
        if (this.f27889y0) {
            L2 = org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        } else {
            L2 = b10 - org.telegram.messenger.i0.L(4.0f);
        }
        int max = Math.max(0, L2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            w8Var.setLayoutParams(layoutParams3);
        }
        i0();
    }

    @Override
    public final void G(uh uhVar) {
        Activity W;
        R();
        if (this.L == null && !org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.f16172q;
            if (Math.min(point.x, point.y) < org.telegram.messenger.i0.L(700.0f) && (W = org.telegram.messenger.i0.W(getContext())) != null) {
                try {
                    this.M = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.L = W;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
        this.L0 = false;
        this.N0 = false;
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.M0 = false;
        this.B0 = false;
        this.K0 = false;
        float f7 = 0.0f;
        this.N.setTranslationY(0.0f);
        this.f27869j0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.w8 w8Var = this.f27884w;
        w8Var.setTranslationY(0.0f);
        w8Var.setAlpha(1.0f);
        this.D0 = false;
        bi biVar = this.f30964b;
        biVar.R2.setTitle(org.telegram.messenger.dd.L0(2131743042, null));
        biVar.R2.setDrawGlassTitle(false);
        this.f27886x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        org.telegram.ui.Wallet.q9 q9Var = this.R;
        if (q9Var.getDiamondView().f34199f == null) {
            f7 = 1.0f;
        }
        this.f27873n0 = f7;
        this.m0 = f7;
        k0();
        if (this.m0 < 1.0f) {
            q9Var.getDiamondView().l(new ek(this, 3));
        }
    }

    @Override
    public final void H() {
        this.L0 = true;
        post(new ek(this, 4));
    }

    @Override
    public final boolean M() {
        return !this.N0;
    }

    public final void R() {
        this.R.getDiamondView().l(null);
        o1.j jVar = this.f27871l0;
        if (jVar != null) {
            jVar.d();
        }
        this.m0 = 1.0f;
        k0();
    }

    public final String S(long j10, BigDecimal bigDecimal) {
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int T = T(bigDecimal);
        if (scale.scale() > T) {
            scale = scale.setScale(T, RoundingMode.DOWN);
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

    public final SpannableStringBuilder U(org.telegram.ui.Wallet.k0 k0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
        d0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f27876q0);
    }

    public final float W(View view) {
        float f7 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f7 += view.getY() - view2.getScrollY();
            view = view2;
        }
        int[] iArr = this.f27887x0;
        view.getLocationOnScreen(iArr);
        return ((f7 + iArr[1]) + this.f27890z0) - this.f30964b.f24800p2;
    }

    public final float X(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (W(view) - this.f27870k0.getTranslationY());
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void Y() {
        if (!this.K && !TextUtils.isEmpty(this.G)) {
            org.telegram.ui.Wallet.l lVar = this.f27868i0;
            byte[] bArr = null;
            if (lVar != null) {
                lVar.run();
                this.f27868i0 = null;
            }
            this.f27866g0 = -1L;
            h0();
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(this.f27872n);
            if (this.f27867h0) {
                String str = this.G;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.f27880s0;
                if (this.f27881t0) {
                    bArr = getPublicKey();
                }
                this.f27868i0 = x10.i(str, max, str2, bArr, new dk(this, 1));
            }
        }
    }

    public final void Z() {
        if (!this.K && !this.N0 && this.O0 == null && this.T0 == null) {
            c0();
            bi.e eVar = new bi.e(this, SystemClock.uptimeMillis() + 1500, 11);
            this.O0 = eVar;
            post(eVar);
        }
    }

    public final void b0() {
        if (this.L0 && !this.B0 && !this.K0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.N.getHeight() > 0 && this.f27869j0.getHeight() > 0) {
            this.E0 = getBottomYOnScreen();
            this.F0 = W(this.f27884w);
            this.D0 = true;
        }
    }

    public final void c0() {
        if (!this.K && !this.N0) {
            bi biVar = this.f30964b;
            if (!biVar.I) {
                if (!this.L0) {
                    this.M0 = true;
                    return;
                }
                this.M0 = false;
                EditTextBoldCursor editTextBoldCursor = this.S;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                biVar.g1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new ek(this, 1), 220L);
            }
        }
    }

    @Override
    public final void d() {
        try {
            org.telegram.ui.ActionBar.t0 t0Var = this.f27888y;
            org.telegram.ui.ActionBar.p6 p6Var = this.f30963a;
            if (t0Var != null) {
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            }
            ShapeDrawable shapeDrawable = this.D;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.r1(0.08f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21331z6, p6Var)), shapeDrawable);
                f6 f6Var = this.T;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.c5 c5Var = this.E;
            if (c5Var != null) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Yl, p6Var);
                c5Var.f20213c.setColor(w02);
                c5Var.f20229w = Integer.valueOf(w02);
                TextView textView = this.U;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            dq dqVar = this.F;
            if (dqVar != null) {
                dqVar.f25572y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
                p80 p80Var = this.V;
                if (p80Var != null) {
                    p80Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14678a4) {
            boolean z10 = this.f27867h0;
            g0();
            if (z10 != this.f27867h0) {
                Y();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.f30964b.R2.getAlpha();
        j0();
        if (this.f27871l0 != null || this.m0 < 1.0f) {
            k0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void e0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        p80 p80Var = this.V;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131743110, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131743163, null));
            spannableStringBuilder.append((CharSequence) " >");
            dq dqVar = new dq(2131232694, 0);
            dqVar.f25572y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f30963a);
            float N = org.telegram.messenger.i0.N(0.66f);
            dqVar.f25568r = 0.0f;
            dqVar.f25569s = N;
            this.F = dqVar;
            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new dh.a(this, 7), length, spannableStringBuilder.length(), 33);
            p80Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = p80Var.animate();
        float f11 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f7);
        if (!z10) {
            f11 = 0.6f;
        }
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(gr.h).start();
    }

    public final void f0() {
        if (this.N0 && !this.K) {
            this.M0 = false;
            EditTextBoldCursor editTextBoldCursor = this.S;
            editTextBoldCursor.setShowSoftInputOnFocus(false);
            editTextBoldCursor.setFocusable(false);
            editTextBoldCursor.clearFocus();
            setFocusableInTouchMode(true);
            requestFocus();
        }
    }

    public final void g0() {
        boolean z10;
        boolean z11;
        boolean z12;
        CharSequence V;
        SpannableStringBuilder U;
        String V2;
        i0();
        int i10 = this.f27872n;
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
        long v = x10.v();
        long gramNanoAmount = getGramNanoAmount();
        long j10 = org.telegram.messenger.wp.r1(i10).f19300y7.f18037l0.f17366a.f17238c;
        int i11 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.S;
        if (i11 > 0 && gramNanoAmount < j10) {
            if (this.f27882u0) {
                V2 = S(j10, getCurrencyPerGram());
            } else {
                V2 = V(j10);
            }
            editTextBoldCursor.setText(V2);
            editTextBoldCursor.setSelection(V2.length());
            int i12 = -this.f27883v0;
            this.f27883v0 = i12;
            org.telegram.messenger.i0.F3(i12, editTextBoldCursor, null);
            return;
        }
        boolean z13 = false;
        if (WalletEngine2.isValidAddress(this.G) && gramNanoAmount <= v) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > v) {
            z11 = true;
        } else {
            z11 = false;
        }
        e0(z11);
        String gramsText = getGramsText();
        if (this.G == null && this.I) {
            z12 = true;
        } else {
            z12 = false;
        }
        vh.d dVar = this.f27874o0;
        dVar.setLoading(z12);
        if (TextUtils.isEmpty(gramsText)) {
            V = org.telegram.messenger.dd.L0(2131743046, null);
        } else {
            V = org.telegram.messenger.dd.V(null, null, 2131743047, org.telegram.ui.Wallet.k0.l("Grams", gramsText, 2131749516));
        }
        dVar.i(V, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z14 = !isEmpty;
        if (!isEmpty && z10 && !this.J) {
            z13 = true;
        }
        dVar.setEnabled(z13);
        m0(z14, this.L0);
        h0();
        this.R.d(org.telegram.ui.Wallet.k0.x(i10), this.f27882u0);
        if (this.f27882u0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f27878r0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.f27885w0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.f27885w0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.f27885w0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            d0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.dd.L0(2131749525, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            U = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f27876q0);
        } else {
            U = U(x10, gramNanoAmount);
        }
        this.T.setText(U);
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.f27879s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return org.telegram.messenger.i0.L(13.0f) + Math.max(0, top - (org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.f16166m));
    }

    @Override
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f30963a);
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27879s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.H == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.H;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final void h0() {
        boolean z10;
        boolean z11;
        float f7;
        int i10 = this.f27872n;
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
        this.W.setText(org.telegram.messenger.dd.V(null, null, 2131743211, org.telegram.ui.Wallet.k0.l("Grams", org.telegram.ui.Wallet.k0.p(x10.v(), true), 2131749516)));
        long j10 = org.telegram.messenger.wp.r1(i10).f19300y7.f18037l0.f17366a.f17238c;
        if (!x10.F() && x10.v() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27867h0 = z10;
        boolean z12 = this.f27863d0 | (!TextUtils.isEmpty(this.S.getText()));
        this.f27863d0 = z12;
        if (this.f27867h0 && z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f27862c0 != z11) {
            this.f27862c0 = z11;
            ValueAnimator valueAnimator = this.f27865f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f27865f0 = null;
            }
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.L0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f27864e0, f7);
                this.f27865f0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f27865f0.setInterpolator(gr.h);
                this.f27865f0.addUpdateListener(new a6(this, 11));
                this.f27865f0.start();
            } else {
                setFeeVisibilityProgress(f7);
            }
        }
        long j11 = this.f27866g0;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        TextView textView = this.f27860a0;
        if (i11 >= 0) {
            textView.setText(org.telegram.messenger.dd.V(null, null, 2131743098, org.telegram.ui.Wallet.k0.s(j11, false)));
        } else {
            textView.setText(org.telegram.messenger.dd.V(null, null, 2131743098, this.f27861b0));
        }
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0() {
        TextView textView;
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        LinearLayout linearLayout = this.O;
        if (linearLayout != null && (textView = this.Q) != null) {
            if (getGramNanoAmount() <= 0 && this.U.getVisibility() != 0 && !this.f27889y0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.U0) {
                this.U0 = z10;
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                ViewPropertyAnimator animate = linearLayout.animate();
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f7);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f11).withEndAction(new Runnable(this) {
                    public final kk f26469b;

                    {
                        this.f26469b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f26469b.O;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout2.setVisibility(i10);
                                return;
                            default:
                                TextView textView2 = this.f26469b.Q;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView2.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = textView.animate();
                if (!z10) {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f13);
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.8f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
                if (z10) {
                    f14 = 0.8f;
                }
                scaleX2.scaleY(f14).withEndAction(new Runnable(this) {
                    public final kk f26469b;

                    {
                        this.f26469b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f26469b.O;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout2.setVisibility(i10);
                                return;
                            default:
                                TextView textView2 = this.f26469b.Q;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView2.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(grVar).start();
            }
        }
    }

    @Override
    public final boolean j() {
        if (this.f30964b.f24786l3.Q() <= org.telegram.messenger.i0.L(20.0f)) {
            return false;
        }
        this.M0 = false;
        bi.e eVar = this.O0;
        if (eVar != null) {
            removeCallbacks(eVar);
            this.O0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.clearFocus();
        org.telegram.messenger.i0.v1(editTextBoldCursor);
        return true;
    }

    public final void j0() {
        float f7;
        View view = this.N;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.f27869j0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.f27879s;
                float W = W(view2);
                org.telegram.ui.Wallet.w8 w8Var = this.f27884w;
                if (w8Var.getVisibility() == 0) {
                    f7 = Math.max(W, (w8Var.getScaleY() * (w8Var.getContentBottom() - w8Var.getPivotY())) + w8Var.getPivotY() + W(w8Var));
                } else {
                    f7 = W;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((W + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, X(this.W)), X(this.f27860a0)), X(this.f27874o0)) - f7);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.i0.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                view.setScaleX(min);
                view.setScaleY(min);
                float f10 = (max / 2.0f) + f7;
                view.setTranslationY(f10 - ((view.getHeight() / 2.0f) + (W(view) - view.getTranslationY())));
            }
        }
    }

    public final void k0() {
        boolean z10;
        float max = Math.max(this.f27873n0, Math.max(0.0f, Math.min(1.0f, this.m0)));
        this.f27873n0 = max;
        float f7 = 1.0f - max;
        float f10 = this.m0;
        if (this.f27871l0 == null && f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Wallet.q9 q9Var = this.R;
        q9Var.e(f10, max, z10);
        q9Var.setTranslationY((1.0f - this.m0) * (((this.N.getHeight() / 2.0f) - q9Var.getTop()) - (q9Var.getHeight() / 2.0f)));
        float f11 = this.f27873n0;
        f6 f6Var = this.T;
        f6Var.setAlpha(f11);
        f6Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f7);
        float f12 = this.f27873n0;
        FrameLayout frameLayout = this.P;
        frameLayout.setAlpha(f12);
        frameLayout.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f7);
        float f13 = this.f27873n0;
        FrameLayout frameLayout2 = this.f27870k0;
        frameLayout2.setAlpha(f13);
        frameLayout2.setTranslationY(org.telegram.messenger.i0.L(24.0f) * f7);
    }

    public final void l0() {
        float f7;
        if (this.B0 && this.N.getHeight() > 0) {
            FrameLayout frameLayout = this.f27869j0;
            if (frameLayout.getHeight() > 0) {
                if (this.C0) {
                    f7 = this.A0;
                } else {
                    f7 = 1.0f - this.A0;
                }
                float f10 = this.I0;
                float z10 = c3.i0.z(this.J0, f10, f7, f10);
                float f11 = this.G0;
                float z11 = c3.i0.z(this.H0, f11, f7, f11);
                frameLayout.setTranslationY(z10 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                org.telegram.ui.Wallet.w8 w8Var = this.f27884w;
                w8Var.setTranslationY(z11 - (W(w8Var) - w8Var.getTranslationY()));
                j0();
            }
        }
    }

    @Override
    public final void m(float f7, float f10) {
        this.f27890z0 = f7;
        this.A0 = f10;
        l0();
    }

    public final void m0(boolean z10, boolean z11) {
        float f7;
        if (z11 && this.f27875p0 == z10) {
            return;
        }
        this.f27875p0 = z10;
        vh.d dVar = this.f27874o0;
        dVar.animate().cancel();
        TextView textView = this.W;
        textView.animate().cancel();
        TextView textView2 = this.f27860a0;
        textView2.animate().cancel();
        float f10 = 0.0f;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (!z10) {
            f11 = 0.8f;
        }
        if (!z10) {
            f10 = org.telegram.messenger.i0.L(60.0f);
        }
        int i10 = 0;
        if (!z11) {
            if (!z10) {
                i10 = 4;
            }
            dVar.setVisibility(i10);
            dVar.setAlpha(f7);
            dVar.setScaleX(f11);
            dVar.setScaleY(f11);
            textView.setTranslationY(f10);
            textView2.setTranslationY(f10);
            return;
        }
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar.animate().alpha(f7).scaleX(f11).scaleY(f11).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).withEndAction(new ek(this, 5)).start();
        textView.animate().translationY(f10).setDuration(320L).setInterpolator(grVar).start();
        textView2.animate().translationY(f10).setDuration(320L).setInterpolator(grVar).start();
    }

    @Override
    public final void o() {
        if (this.K) {
            return;
        }
        this.K = true;
        R();
        org.telegram.ui.Wallet.s6 s6Var = this.Q0;
        if (s6Var != null) {
            AnimatorSet animatorSet = s6Var.f35197m;
            if (!s6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    s6Var.a(false);
                }
            }
            this.Q0 = null;
        }
        org.telegram.ui.Wallet.fa faVar = this.R0;
        if (faVar != null) {
            AnimatorSet animatorSet2 = faVar.f34519m;
            if (!faVar.f34525s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    faVar.b();
                }
            }
            this.R0 = null;
        }
        ValueAnimator valueAnimator = this.f27865f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f27865f0 = null;
        }
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.L = null;
        }
        this.O.animate().cancel();
        this.Q.animate().cancel();
        this.V.animate().cancel();
        this.f27874o0.animate().cancel();
        this.W.animate().cancel();
        this.f27860a0.animate().cancel();
        bi.e eVar = this.O0;
        if (eVar != null) {
            removeCallbacks(eVar);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.T0;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        org.telegram.ui.Wallet.l lVar = this.f27868i0;
        if (lVar != null) {
            lVar.run();
            this.f27868i0 = null;
        }
        org.telegram.messenger.at.f(this.f27872n).n(this, org.telegram.messenger.at.f14678a4);
        this.f30964b.R2.p().removeView(this.f27886x);
        org.telegram.messenger.i0.v1(this.S);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K0) {
            this.K0 = false;
            this.N.setTranslationY(0.0f);
            this.f27869j0.setTranslationY(0.0f);
            this.f27884w.setTranslationY(0.0f);
            b0();
        } else if (this.B0) {
            l0();
        }
        j0();
    }

    @Override
    public final void onWindowFocusChanged(boolean z10) {
        if (!z10) {
            f0();
        }
        super.onWindowFocusChanged(z10);
    }

    public void setSendTransitionProgress(float f7) {
        this.f27884w.setAlpha(1.0f - f7);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30964b.f21587b.invalidate();
    }

    @Override
    public final void t() {
        R();
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.L = null;
        }
        this.f30964b.R2.setDrawGlassTitle(true);
        this.L0 = false;
        this.M0 = false;
        bi.e eVar = this.O0;
        if (eVar != null) {
            removeCallbacks(eVar);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.T0;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        this.f27886x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.S;
        org.telegram.messenger.i0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void w(int i10) {
        if (i10 == 2) {
            org.telegram.ui.Wallet.b6.J0(this.f27872n, getContext(), this.f30963a);
        } else if (i10 == 3) {
            Z();
        }
    }

    @Override
    public final void y() {
        if (!this.B0) {
            return;
        }
        this.B0 = false;
        float bottomYOnScreen = getBottomYOnScreen();
        FrameLayout frameLayout = this.f27869j0;
        frameLayout.setTranslationY(this.J0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.w8 w8Var = this.f27884w;
        w8Var.setTranslationY(this.H0 - (W(w8Var) - w8Var.getTranslationY()));
        this.K0 = true;
        requestLayout();
    }

    @Override
    public final void z(int i10, boolean z10) {
        float f7;
        float bottomYOnScreen;
        float W;
        this.B0 = true;
        this.K0 = false;
        this.C0 = z10;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.A0 = f7;
        if (this.D0) {
            bottomYOnScreen = this.E0;
        } else {
            bottomYOnScreen = getBottomYOnScreen();
        }
        this.I0 = bottomYOnScreen;
        boolean z11 = this.D0;
        org.telegram.ui.Wallet.w8 w8Var = this.f27884w;
        if (z11) {
            W = this.F0;
        } else {
            W = W(w8Var);
        }
        this.G0 = W;
        this.J0 = getBottomYOnScreen() - this.f27869j0.getTranslationY();
        this.H0 = W(w8Var) - w8Var.getTranslationY();
        l0();
    }
}
