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
public final class hk extends th implements org.telegram.messenger.cs {
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ShapeDrawable E;
    public boolean E0;
    public final org.telegram.ui.ActionBar.t4 F;
    public float F0;
    public wp G;
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
    public final ek O;
    public boolean O0;
    public final LinearLayout P;
    public ci.e3 P0;
    public final FrameLayout Q;
    public TL_wallet.walletTransaction Q0;
    public final TextView R;
    public org.telegram.ui.Wallet.m6 R0;
    public final org.telegram.ui.Wallet.l9 S;
    public org.telegram.ui.Wallet.aa S0;
    public final EditTextBoldCursor T;
    public boolean T0;
    public final h6 U;
    public org.telegram.ui.ActionBar.s1 U0;
    public final TextView V;
    public boolean V0;
    public final s70 W;
    public DecimalFormat W0;
    public final TextView f34404a0;
    public final TextView f34405b0;
    public final SpannableString f34406c0;
    public boolean f34407d0;
    public boolean f34408e0;
    public float f34409f0;
    public ValueAnimator f34410g0;
    public long f34411h0;
    public boolean f34412i0;
    public org.telegram.ui.Wallet.l f34413j0;
    public final FrameLayout f34414k0;
    public final FrameLayout f34415l0;
    public q1.g m0;
    public final int f34416n;
    public float f34417n0;
    public float f34418o0;
    public final gi.d f34419p0;
    public boolean f34420q0;
    public final TLRPC.User f34421r;
    public final SpannableString f34422r0;
    public final FrameLayout f34423s;
    public final SpannableString f34424s0;
    public String f34425t0;
    public boolean f34426u0;
    public boolean f34427v0;
    public final org.telegram.ui.Wallet.q8 f34428w;
    public int f34429w0;
    public final org.telegram.ui.ActionBar.q0 f34430x;
    public DecimalFormat f34431x0;
    public final org.telegram.ui.ActionBar.q0 f34432y;
    public final int[] f34433y0;
    public boolean f34434z0;

    public hk(bi biVar, Context context, int i3, TLRPC.User user, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, biVar);
        this.f34411h0 = -1L;
        this.f34417n0 = 1.0f;
        this.f34418o0 = 1.0f;
        this.f34426u0 = true;
        this.f34429w0 = 6;
        this.f34433y0 = new int[2];
        this.f34416n = i3;
        this.f34421r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34423s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, b8.mf.e(-1, -1, 55));
        org.telegram.ui.ActionBar.q0 a10 = this.f38416b.S2.q().a(31, 2131231244);
        this.f34430x = a10;
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        a10.e(2, 2131232044, org.telegram.messenger.bd.M0(2131743147, null));
        a10.e(3, 2131231778, org.telegram.messenger.bd.M0(2131743215, null));
        a10.setVisibility(8);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f38415a), false, e6Var);
        this.f34432y = q0Var;
        q0Var.setIcon(2131231244);
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, this.f38415a), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        q0Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(q0Var, h02, null, N, e6Var);
        q0Var.setOnClickListener(new ai.h3(this, e6Var, i3, 10));
        org.telegram.ui.Wallet.q8 q8Var = new org.telegram.ui.Wallet.q8(context, new org.telegram.ui.lo(26, this, user), new org.telegram.ui.lo(27, this, e6Var), e6Var);
        this.f34428w = q8Var;
        q8Var.a(this.H, user);
        addView(q8Var, b8.mf.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, b8.mf.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, b8.mf.e(-1, -2, 17));
        org.telegram.ui.Wallet.l9 l9Var = new org.telegram.ui.Wallet.l9(context, e6Var);
        this.S = l9Var;
        l9Var.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
                        return;
                }
            }
        });
        linearLayout.addView(l9Var, b8.mf.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = l9Var.getEditText();
        this.T = editText;
        editText.setFilters(new InputFilter[]{new xj(0, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new yj(this, 0));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new s0(this, 1));
        editText.addTextChangedListener(new fk(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.f34422r0 = spannableString;
        wp wpVar = new wp(2131232812, 0);
        wpVar.f40048x = 0.72f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.f34424s0 = spannableString2;
        wp wpVar2 = new wp(2131232816, 0);
        wpVar2.d = false;
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        h6 h6Var = new h6(context, false, true, true, true, true);
        this.U = h6Var;
        h6Var.f34307c.m(0.35f, 320L, 3.5f, xq.h);
        h6Var.setScaleProperty(0.35f);
        h6Var.setText(V(org.telegram.ui.Wallet.k0.x(i3), 0L));
        int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
        int i12 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i11, i12);
        org.telegram.ui.ActionBar.r6.n(h6Var, q10.f28359a, q10.f28360b, 4, 0.0f, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        h6Var.setGravity(17);
        h6Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        h6Var.setAllowCancel(true);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(i12, this.f38415a)));
        this.E = d02;
        h6Var.setSizeableBackground(d02);
        linearLayout.addView(h6Var, b8.mf.t(-2, 28, 49, 0, 8, 0, 0));
        b8.pf.a(h6Var);
        h6Var.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        linearLayout.addView(frameLayout3, b8.mf.r(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.P = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, b8.mf.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i12, e6Var);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        org.telegram.messenger.k5.m(textView, 17, null, 2131743017);
        frameLayout3.addView(textView, b8.mf.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        b8.pf.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
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
        org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        this.F = t4Var;
        t4Var.f28653x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t4Var.f28635c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i13 = org.telegram.ui.ActionBar.k6.Yl;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i13, this.f38415a));
        t4Var.f28652w = Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, this.f38415a));
        textView2.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setBackground(t4Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i12, e6Var);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, b8.mf.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
                        return;
                }
            }
        });
        b8.pf.b(textView2, 0.02f, 1.2f);
        s70 s70Var = new s70(context, e6Var);
        this.W = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28122q7, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Ci, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(17);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        s70Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        g0(false);
        linearLayout2.addView(s70Var, b8.mf.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34414k0 = frameLayout4;
        frameLayout4.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f34415l0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, b8.mf.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.f34404a0 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i12, e6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, b8.mf.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.f34405b0 = textView4;
        org.telegram.ui.ActionBar.r6.V(textView4, i12, e6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, b8.mf.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(org.telegram.messenger.bd.M0(2131748787, null));
        this.f34406c0 = spannableString3;
        spannableString3.setSpan(new x70(org.telegram.messenger.g0.L(80.0f), textView4), 0, spannableString3.length(), 33);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f34419p0 = h;
        h.setText(org.telegram.messenger.bd.M0(2131743030, null));
        h.setEnabled(false);
        h.setOnClickListener(new View.OnClickListener(this) {
            public final hk f40020b;

            {
                this.f40020b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f40020b.e0();
                        return;
                    case 1:
                        this.f40020b.b0();
                        return;
                    case 2:
                        hk.O(this.f40020b);
                        return;
                    case 3:
                        this.f40020b.e0();
                        return;
                    case 4:
                        this.f40020b.e0();
                        return;
                    case 5:
                        this.f40020b.e0();
                        return;
                    default:
                        hk.Q(this.f40020b);
                        return;
                }
            }
        });
        frameLayout5.addView(h, b8.mf.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, b8.mf.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        o0(false, false);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23200a4);
        j0();
        this.J = true;
        org.telegram.ui.Wallet.k0.x(i3).a0(user, new ak(this, 0));
    }

    public static void O(hk hkVar) {
        boolean z10;
        ?? r42;
        byte[] bArr;
        String W;
        EditTextBoldCursor editTextBoldCursor = hkVar.T;
        int i3 = hkVar.f34416n;
        gi.d dVar = hkVar.f34419p0;
        if (dVar.f12517d0 && !dVar.R) {
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i3);
            long gramNanoAmount = hkVar.getGramNanoAmount();
            long v = x10.v();
            if (WalletEngine2.isValidAddress(hkVar.H) && gramNanoAmount > 0) {
                long j10 = ((org.telegram.messenger.l0) org.telegram.messenger.hp.s1(i3).f23167x7.f24666l0.f13688b).f23921c;
                if (gramNanoAmount < j10) {
                    if (hkVar.f34427v0) {
                        W = hkVar.T(j10, hkVar.getCurrencyPerGram());
                    } else {
                        W = W(j10);
                    }
                    editTextBoldCursor.setText(W);
                    editTextBoldCursor.setSelection(W.length());
                    int i10 = -hkVar.f34429w0;
                    hkVar.f34429w0 = i10;
                    org.telegram.messenger.g0.G3(i10, editTextBoldCursor, null);
                } else if (gramNanoAmount > v) {
                    org.telegram.messenger.p2.APP_ERROR.a();
                    s70 s70Var = hkVar.W;
                    int i11 = -hkVar.f34429w0;
                    hkVar.f34429w0 = i11;
                    org.telegram.messenger.g0.G3(i11, s70Var, null);
                } else {
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
                    long N1 = s12.N1(hkVar.f34421r.f27150id);
                    org.telegram.messenger.p0 p0Var = s12.f23167x7;
                    if (((org.telegram.messenger.h0) p0Var.f24664k0.f13688b).f22814c && N1 > 0 && (gramNanoAmount / 1.0E9d) * ((org.telegram.messenger.i0) p0Var.f24665l.f14429b).f23413a < (N1 / 1000.0d) * s12.f22979c6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hkVar.T0 = z10;
                    dVar.setLoading(true);
                    hkVar.O0 = true;
                    hkVar.N0 = false;
                    ci.e3 e3Var = hkVar.P0;
                    if (e3Var != null) {
                        hkVar.removeCallbacks(e3Var);
                        r42 = 0;
                        hkVar.P0 = null;
                    } else {
                        r42 = 0;
                    }
                    hkVar.Q0 = r42;
                    TLRPC.User user = hkVar.f34421r;
                    String str = hkVar.H;
                    String str2 = hkVar.f34425t0;
                    if (hkVar.f34426u0) {
                        bArr = hkVar.getPublicKey();
                    } else {
                        bArr = r42;
                    }
                    x10.d0(user, str, gramNanoAmount, str2, bArr, null, null, new org.telegram.messenger.u10(hkVar) {
                        public final hk f32758b;

                        {
                            this.f32758b = hkVar;
                        }

                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str3 = (String) obj;
                                    hk hkVar2 = this.f32758b;
                                    gi.d dVar2 = hkVar2.f34419p0;
                                    bi biVar = hkVar2.f38416b;
                                    if (!hkVar2.L && !biVar.J) {
                                        if ("PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                            dVar2.setLoading(false);
                                            hkVar2.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            biVar.dismiss();
                                            return;
                                        } else {
                                            dVar2.setLoading(false);
                                            hkVar2.O0 = false;
                                            fc.X().e0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    this.f32758b.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, new org.telegram.messenger.u10(hkVar) {
                        public final hk f32758b;

                        {
                            this.f32758b = hkVar;
                        }

                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    String str3 = (String) obj;
                                    hk hkVar2 = this.f32758b;
                                    gi.d dVar2 = hkVar2.f34419p0;
                                    bi biVar = hkVar2.f38416b;
                                    if (!hkVar2.L && !biVar.J) {
                                        if ("PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                            dVar2.setLoading(false);
                                            hkVar2.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            biVar.dismiss();
                                            return;
                                        } else {
                                            dVar2.setLoading(false);
                                            hkVar2.O0 = false;
                                            fc.X().e0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    this.f32758b.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, null);
                }
            }
        }
    }

    public static void Q(hk hkVar) {
        String W;
        EditTextBoldCursor editTextBoldCursor = hkVar.T;
        BigDecimal currencyPerGram = hkVar.getCurrencyPerGram();
        if (!hkVar.f34427v0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = hkVar.getGramNanoAmount();
        hkVar.f34427v0 = !hkVar.f34427v0;
        hkVar.S.d(org.telegram.ui.Wallet.k0.x(hkVar.f34416n), hkVar.f34427v0);
        if (gramNanoAmount <= 0) {
            W = "";
        } else if (hkVar.f34427v0) {
            W = hkVar.T(gramNanoAmount, currencyPerGram);
        } else {
            W = W(gramNanoAmount);
        }
        editTextBoldCursor.setText(W);
        editTextBoldCursor.setSelection(W.length());
    }

    public static CharSequence R(hk hkVar, CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i11).toString());
        sb2.append((Object) charSequence.subSequence(i3, i10));
        sb2.append((Object) spanned.subSequence(i12, spanned.length()));
        String sb3 = sb2.toString();
        int i13 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (hkVar.f34427v0) {
            BigDecimal currencyPerGram = hkVar.getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i13 = U(currencyPerGram);
        }
        int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
        if (max >= 0 && (sb3.length() - max) - 1 > i13) {
            return spanned.subSequence(i11, i12);
        }
        if (c0(sb3).compareTo(valueOf) > 0) {
            return spanned.subSequence(i11, i12);
        }
        if (i3 != i10) {
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
                return "0" + ((Object) charSequence.subSequence(i3, i10));
            } else if (sb3.startsWith("00")) {
                return spanned.subSequence(i11, i12);
            } else {
                return null;
            }
        }
        return null;
    }

    public static int U(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i3 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i3++;
        }
        return i3;
    }

    public static String W(long j10) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
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

    public static void f0(SpannableStringBuilder spannableStringBuilder, int i3, int i10, char c2) {
        int i11 = i3 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10) {
                if (spannableStringBuilder.charAt(i11) == c2 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
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
        return X(this.f34414k0);
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
        if (TextUtils.equals(org.telegram.ui.Wallet.k0.x(this.f34416n).h.g(), "USD")) {
            return 2;
        }
        return 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i3 = this.f34416n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.x(i3).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) org.telegram.messenger.hp.s1(i3).f23167x7.f24665l.f14429b).f23413a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal c02 = c0(this.T.getText().toString());
        if (this.f34427v0) {
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
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.x(this.f34416n).h;
        TL_wallet.currencyRates f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i3);
            i3++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public void setFeeVisibilityProgress(float f10) {
        int i3;
        this.f34409f0 = f10;
        TextView textView = this.f34405b0;
        textView.setAlpha(f10);
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        requestLayout();
    }

    @Override
    public final void A() {
        S();
        h0();
    }

    @Override
    public final void B(int i3, int i10) {
        boolean z10;
        int L;
        int i11;
        int L2;
        bi biVar = this.f38416b;
        if (biVar.f32249m3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34434z0 = z10;
        this.f38419f = z10;
        if (z10) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(70.0f);
        }
        int round = Math.round(org.telegram.messenger.g0.L(32.0f) * this.f34409f0) + org.telegram.messenger.g0.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34414k0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.f34434z0) {
            i11 = org.telegram.messenger.g0.L(56.0f);
            biVar.f28614r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    biVar.f28614r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            biVar.f28614r0 = true;
        }
        int d = k2.p1.d(1.0f, i11, 0) + org.telegram.messenger.g0.f22602m;
        FrameLayout frameLayout = this.f34423s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != d) {
            layoutParams2.topMargin = d;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int b10 = org.telegram.messenger.k5.b(4.0f, d - org.telegram.messenger.g0.f22602m, 0);
        org.telegram.ui.Wallet.q8 q8Var = this.f34428w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) q8Var.getLayoutParams();
        if (this.f34434z0) {
            L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            L2 = b10 - org.telegram.messenger.g0.L(4.0f);
        }
        int max = Math.max(0, L2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            q8Var.setLayoutParams(layoutParams3);
        }
        k0();
    }

    @Override
    public final void H(th thVar) {
        Activity W;
        S();
        if (this.M == null && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22608q;
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
        this.f34414k0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.q8 q8Var = this.f34428w;
        q8Var.setTranslationY(0.0f);
        q8Var.setAlpha(1.0f);
        this.E0 = false;
        bi biVar = this.f38416b;
        biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131743026, null));
        biVar.S2.setDrawGlassTitle(false);
        this.f34430x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        a0();
        org.telegram.ui.Wallet.l9 l9Var = this.S;
        if (l9Var.getDiamondView().f43254f == null) {
            f10 = 1.0f;
        }
        this.f34418o0 = f10;
        this.f34417n0 = f10;
        m0();
        if (this.f34417n0 < 1.0f) {
            l9Var.getDiamondView().l(new bk(this, 3));
        }
    }

    @Override
    public final void I() {
        this.M0 = true;
        post(new bk(this, 4));
    }

    @Override
    public final boolean N() {
        return !this.O0;
    }

    public final void S() {
        this.S.getDiamondView().l(null);
        q1.g gVar = this.m0;
        if (gVar != null) {
            gVar.d();
        }
        this.f34417n0 = 1.0f;
        m0();
    }

    public final String T(long j10, BigDecimal bigDecimal) {
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int U = U(bigDecimal);
        if (scale.scale() > U) {
            scale = scale.setScale(U, RoundingMode.DOWN);
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

    public final SpannableStringBuilder V(org.telegram.ui.Wallet.k0 k0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
        f0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f34422r0);
    }

    public final float X(View view) {
        float f10 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f10 += view.getY() - view2.getScrollY();
            view = view2;
        }
        int[] iArr = this.f34433y0;
        view.getLocationOnScreen(iArr);
        return ((f10 + iArr[1]) + this.A0) - this.f38416b.f32263q2;
    }

    public final float Z(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (X(view) - this.f34415l0.getTranslationY());
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void a0() {
        if (!this.L && !TextUtils.isEmpty(this.H)) {
            org.telegram.ui.Wallet.l lVar = this.f34413j0;
            byte[] bArr = null;
            if (lVar != null) {
                lVar.run();
                this.f34413j0 = null;
            }
            this.f34411h0 = -1L;
            j0();
            org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(this.f34416n);
            if (this.f34412i0) {
                String str = this.H;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.f34425t0;
                if (this.f34426u0) {
                    bArr = getPublicKey();
                }
                this.f34413j0 = x10.i(str, max, str2, bArr, new ak(this, 1));
            }
        }
    }

    public final void b0() {
        if (!this.L && !this.O0 && this.P0 == null && this.U0 == null) {
            e0();
            ci.e3 e3Var = new ci.e3(this, SystemClock.uptimeMillis() + 1500, 22);
            this.P0 = e3Var;
            post(e3Var);
        }
    }

    @Override
    public final void d() {
        try {
            org.telegram.ui.ActionBar.q0 q0Var = this.f34432y;
            org.telegram.ui.ActionBar.e6 e6Var = this.f38415a;
            if (q0Var != null) {
                q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            }
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28290z6, e6Var)), shapeDrawable);
                h6 h6Var = this.U;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.t4 t4Var = this.F;
            if (t4Var != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Yl, e6Var);
                t4Var.f28635c.setColor(w02);
                t4Var.f28652w = Integer.valueOf(w02);
                TextView textView = this.V;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            wp wpVar = this.G;
            if (wpVar != null) {
                wpVar.f40049y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
                s70 s70Var = this.W;
                if (s70Var != null) {
                    s70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void d0() {
        if (this.M0 && !this.C0 && !this.L0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.O.getHeight() > 0 && this.f34414k0.getHeight() > 0) {
            this.F0 = getBottomYOnScreen();
            this.G0 = X(this.f34428w);
            this.E0 = true;
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23200a4) {
            boolean z10 = this.f34412i0;
            i0();
            if (z10 != this.f34412i0) {
                a0();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.f38416b.S2.getAlpha();
        l0();
        if (this.m0 != null || this.f34417n0 < 1.0f) {
            m0();
        }
        super.dispatchDraw(canvas);
        d0();
    }

    public final void e0() {
        if (!this.L && !this.O0) {
            bi biVar = this.f38416b;
            if (!biVar.J) {
                if (!this.M0) {
                    this.N0 = true;
                    return;
                }
                this.N0 = false;
                EditTextBoldCursor editTextBoldCursor = this.T;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                biVar.h1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new bk(this, 1), 220L);
            }
        }
    }

    public final void g0(boolean z10) {
        float f10;
        float f11 = 0.0f;
        s70 s70Var = this.W;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131743094, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131743147, null));
            spannableStringBuilder.append((CharSequence) " >");
            wp wpVar = new wp(2131232695, 0);
            wpVar.f40049y = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f38415a);
            float N = org.telegram.messenger.g0.N(0.66f);
            wpVar.f40045r = 0.0f;
            wpVar.f40046s = N;
            this.G = wpVar;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new gi.ka(this, 6), length, spannableStringBuilder.length(), 33);
            s70Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = s70Var.animate();
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
        scaleX.scaleY(f12).setDuration(320L).setInterpolator(xq.h).start();
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.f34423s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return org.telegram.messenger.g0.L(13.0f) + Math.max(0, top - (org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.f22602m));
    }

    @Override
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.f38415a);
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34423s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.I == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = this.I;
            if (i3 >= bArr.length) {
                return null;
            }
            if (bArr[i3] != 0) {
                return bArr;
            }
            i3++;
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
        SpannableStringBuilder V2;
        String W;
        k0();
        int i3 = this.f34416n;
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i3);
        long v = x10.v();
        long gramNanoAmount = getGramNanoAmount();
        long j10 = ((org.telegram.messenger.l0) org.telegram.messenger.hp.s1(i3).f23167x7.f24666l0.f13688b).f23921c;
        int i10 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.T;
        if (i10 > 0 && gramNanoAmount < j10) {
            if (this.f34427v0) {
                W = T(j10, getCurrencyPerGram());
            } else {
                W = W(j10);
            }
            editTextBoldCursor.setText(W);
            editTextBoldCursor.setSelection(W.length());
            int i11 = -this.f34429w0;
            this.f34429w0 = i11;
            org.telegram.messenger.g0.G3(i11, editTextBoldCursor, null);
            return;
        }
        boolean z13 = false;
        if (WalletEngine2.isValidAddress(this.H) && gramNanoAmount <= v) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > v) {
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
        gi.d dVar = this.f34419p0;
        dVar.setLoading(z12);
        if (TextUtils.isEmpty(gramsText)) {
            V = org.telegram.messenger.bd.M0(2131743030, null);
        } else {
            V = org.telegram.messenger.bd.V(null, null, 2131743031, org.telegram.ui.Wallet.k0.l("Grams", gramsText, 2131749515));
        }
        dVar.i(V, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z14 = !isEmpty;
        if (!isEmpty && z10 && !this.K) {
            z13 = true;
        }
        dVar.setEnabled(z13);
        o0(z14, this.M0);
        j0();
        this.S.d(org.telegram.ui.Wallet.k0.x(i3), this.f34427v0);
        if (this.f34427v0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f34424s0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.f34431x0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.f34431x0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.f34431x0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            f0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749524, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            V2 = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f34422r0);
        } else {
            V2 = V(x10, gramNanoAmount);
        }
        this.U.setText(V2);
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0() {
        boolean z10;
        boolean z11;
        float f10;
        int i3 = this.f34416n;
        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i3);
        this.f34404a0.setText(org.telegram.messenger.bd.V(null, null, 2131743195, org.telegram.ui.Wallet.k0.l("Grams", org.telegram.ui.Wallet.k0.p(x10.v(), true), 2131749515)));
        long j10 = ((org.telegram.messenger.l0) org.telegram.messenger.hp.s1(i3).f23167x7.f24666l0.f13688b).f23921c;
        if (!x10.F() && x10.v() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34412i0 = z10;
        boolean z12 = this.f34408e0 | (!TextUtils.isEmpty(this.T.getText()));
        this.f34408e0 = z12;
        if (this.f34412i0 && z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f34407d0 != z11) {
            this.f34407d0 = z11;
            ValueAnimator valueAnimator = this.f34410g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f34410g0 = null;
            }
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (this.M0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34409f0, f10);
                this.f34410g0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f34410g0.setInterpolator(xq.h);
                this.f34410g0.addUpdateListener(new c6(this, 11));
                this.f34410g0.start();
            } else {
                setFeeVisibilityProgress(f10);
            }
        }
        long j11 = this.f34411h0;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        TextView textView = this.f34405b0;
        if (i10 >= 0) {
            textView.setText(org.telegram.messenger.bd.V(null, null, 2131743082, org.telegram.ui.Wallet.k0.s(j11, false)));
        } else {
            textView.setText(org.telegram.messenger.bd.V(null, null, 2131743082, this.f34406c0));
        }
    }

    @Override
    public final boolean k() {
        if (this.f38416b.f32249m3.Q() <= org.telegram.messenger.g0.L(20.0f)) {
            return false;
        }
        this.N0 = false;
        ci.e3 e3Var = this.P0;
        if (e3Var != null) {
            removeCallbacks(e3Var);
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
            if (getGramNanoAmount() <= 0 && this.V.getVisibility() != 0 && !this.f34434z0) {
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
                    public final hk f33125b;

                    {
                        this.f33125b = this;
                    }

                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f33125b.P;
                                if (z10) {
                                    i3 = 0;
                                } else {
                                    i3 = 4;
                                }
                                linearLayout2.setVisibility(i3);
                                return;
                            default:
                                TextView textView2 = this.f33125b.R;
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
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
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
                    public final hk f33125b;

                    {
                        this.f33125b = this;
                    }

                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f33125b.P;
                                if (z10) {
                                    i3 = 0;
                                } else {
                                    i3 = 4;
                                }
                                linearLayout2.setVisibility(i3);
                                return;
                            default:
                                TextView textView2 = this.f33125b.R;
                                if (!z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView2.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(xqVar).start();
            }
        }
    }

    public final void l0() {
        float f10;
        View view = this.O;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.f34414k0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.f34423s;
                float X = X(view2);
                org.telegram.ui.Wallet.q8 q8Var = this.f34428w;
                if (q8Var.getVisibility() == 0) {
                    f10 = Math.max(X, (q8Var.getScaleY() * (q8Var.getContentBottom() - q8Var.getPivotY())) + q8Var.getPivotY() + X(q8Var));
                } else {
                    f10 = X;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((X + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, Z(this.f34404a0)), Z(this.f34405b0)), Z(this.f34419p0)) - f10);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(org.telegram.messenger.g0.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                view.setScaleX(min);
                view.setScaleY(min);
                float f11 = (max / 2.0f) + f10;
                view.setTranslationY(f11 - ((view.getHeight() / 2.0f) + (X(view) - view.getTranslationY())));
            }
        }
    }

    public final void m0() {
        boolean z10;
        float max = Math.max(this.f34418o0, Math.max(0.0f, Math.min(1.0f, this.f34417n0)));
        this.f34418o0 = max;
        float f10 = 1.0f - max;
        float f11 = this.f34417n0;
        if (this.m0 == null && f11 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Wallet.l9 l9Var = this.S;
        l9Var.e(f11, max, z10);
        l9Var.setTranslationY((1.0f - this.f34417n0) * (((this.O.getHeight() / 2.0f) - l9Var.getTop()) - (l9Var.getHeight() / 2.0f)));
        float f12 = this.f34418o0;
        h6 h6Var = this.U;
        h6Var.setAlpha(f12);
        h6Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f13 = this.f34418o0;
        FrameLayout frameLayout = this.Q;
        frameLayout.setAlpha(f13);
        frameLayout.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f10);
        float f14 = this.f34418o0;
        FrameLayout frameLayout2 = this.f34415l0;
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
            FrameLayout frameLayout = this.f34414k0;
            if (frameLayout.getHeight() > 0) {
                if (this.D0) {
                    f10 = this.B0;
                } else {
                    f10 = 1.0f - this.B0;
                }
                float f11 = this.J0;
                float y9 = com.google.android.recaptcha.internal.a.y(this.K0, f11, f10, f11);
                float f12 = this.H0;
                float y10 = com.google.android.recaptcha.internal.a.y(this.I0, f12, f10, f12);
                frameLayout.setTranslationY(y9 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                org.telegram.ui.Wallet.q8 q8Var = this.f34428w;
                q8Var.setTranslationY(y10 - (X(q8Var) - q8Var.getTranslationY()));
                l0();
            }
        }
    }

    public final void o0(boolean z10, boolean z11) {
        float f10;
        if (z11 && this.f34420q0 == z10) {
            return;
        }
        this.f34420q0 = z10;
        gi.d dVar = this.f34419p0;
        dVar.animate().cancel();
        TextView textView = this.f34404a0;
        textView.animate().cancel();
        TextView textView2 = this.f34405b0;
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
        int i3 = 0;
        if (!z11) {
            if (!z10) {
                i3 = 4;
            }
            dVar.setVisibility(i3);
            dVar.setAlpha(f10);
            dVar.setScaleX(f12);
            dVar.setScaleY(f12);
            textView.setTranslationY(f11);
            textView2.setTranslationY(f11);
            return;
        }
        dVar.setVisibility(0);
        ViewPropertyAnimator duration = dVar.animate().alpha(f10).scaleX(f12).scaleY(f12).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).withEndAction(new bk(this, 5)).start();
        textView.animate().translationY(f11).setDuration(320L).setInterpolator(xqVar).start();
        textView2.animate().translationY(f11).setDuration(320L).setInterpolator(xqVar).start();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.L0) {
            this.L0 = false;
            this.O.setTranslationY(0.0f);
            this.f34414k0.setTranslationY(0.0f);
            this.f34428w.setTranslationY(0.0f);
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
        S();
        org.telegram.ui.Wallet.m6 m6Var = this.R0;
        if (m6Var != null) {
            AnimatorSet animatorSet = m6Var.f42854m;
            if (!m6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    m6Var.a(false);
                }
            }
            this.R0 = null;
        }
        org.telegram.ui.Wallet.aa aaVar = this.S0;
        if (aaVar != null) {
            AnimatorSet animatorSet2 = aaVar.f42201m;
            if (!aaVar.f42207s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    aaVar.b();
                }
            }
            this.S0 = null;
        }
        ValueAnimator valueAnimator = this.f34410g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f34410g0 = null;
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
        this.f34419p0.animate().cancel();
        this.f34404a0.animate().cancel();
        this.f34405b0.animate().cancel();
        ci.e3 e3Var = this.P0;
        if (e3Var != null) {
            removeCallbacks(e3Var);
            this.P0 = null;
        }
        org.telegram.ui.ActionBar.s1 s1Var = this.U0;
        if (s1Var != null) {
            s1Var.dismiss();
        }
        org.telegram.ui.Wallet.l lVar = this.f34413j0;
        if (lVar != null) {
            lVar.run();
            this.f34413j0 = null;
        }
        org.telegram.messenger.hs.f(this.f34416n).n(this, org.telegram.messenger.hs.f23200a4);
        this.f38416b.S2.q().removeView(this.f34430x);
        org.telegram.messenger.g0.v1(this.T);
    }

    public void setSendTransitionProgress(float f10) {
        this.f34428w.setAlpha(1.0f - f10);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
    }

    @Override
    public final void u() {
        S();
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.M = null;
        }
        this.f38416b.S2.setDrawGlassTitle(true);
        this.M0 = false;
        this.N0 = false;
        ci.e3 e3Var = this.P0;
        if (e3Var != null) {
            removeCallbacks(e3Var);
            this.P0 = null;
        }
        org.telegram.ui.ActionBar.s1 s1Var = this.U0;
        if (s1Var != null) {
            s1Var.dismiss();
        }
        this.f34430x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.T;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void w(int i3) {
        if (i3 == 2) {
            org.telegram.ui.Wallet.w5.J0(this.f34416n, getContext(), this.f38415a);
        } else if (i3 == 3) {
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
        FrameLayout frameLayout = this.f34414k0;
        frameLayout.setTranslationY(this.K0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.q8 q8Var = this.f34428w;
        q8Var.setTranslationY(this.I0 - (X(q8Var) - q8Var.getTranslationY()));
        this.L0 = true;
        requestLayout();
    }

    @Override
    public final void z(int i3, boolean z10) {
        float f10;
        float bottomYOnScreen;
        float X;
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
        org.telegram.ui.Wallet.q8 q8Var = this.f34428w;
        if (z11) {
            X = this.G0;
        } else {
            X = X(q8Var);
        }
        this.H0 = X;
        this.K0 = getBottomYOnScreen() - this.f34414k0.getTranslationY();
        this.I0 = X(q8Var) - q8Var.getTranslationY();
        n0();
    }
}
