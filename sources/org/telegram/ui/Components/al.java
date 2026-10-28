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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class al extends li implements NotificationCenter.NotificationCenterDelegate {
    public float A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final org.telegram.ui.ActionBar.l5 E;
    public float E0;
    public zq F;
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
    public final xk N;
    public boolean N0;
    public final LinearLayout O;
    public bi.r3 O0;
    public final FrameLayout P;
    public TL_wallet.walletTransaction P0;
    public final TextView Q;
    public org.telegram.ui.Wallet.e6 Q0;
    public final org.telegram.ui.Wallet.h9 R;
    public org.telegram.ui.Wallet.v9 R0;
    public final EditTextBoldCursor S;
    public boolean S0;
    public final s6 T;
    public org.telegram.ui.ActionBar.e2 T0;
    public final TextView U;
    public boolean U0;
    public final aa0 V;
    public DecimalFormat V0;
    public final TextView W;
    public final TextView f26576a0;
    public final SpannableString f26577b0;
    public boolean f26578c0;
    public boolean f26579d0;
    public float f26580e0;
    public ValueAnimator f26581f0;
    public long f26582g0;
    public boolean f26583h0;
    public org.telegram.ui.Wallet.m f26584i0;
    public final FrameLayout f26585j0;
    public final FrameLayout f26586k0;
    public o1.j f26587l0;
    public float m0;
    public final int f26588n;
    public float f26589n0;
    public final fi.d f26590o0;
    public boolean f26591p0;
    public final SpannableString f26592q0;
    public final TLRPC.User f26593r;
    public final SpannableString f26594r0;
    public final FrameLayout f26595s;
    public String f26596s0;
    public boolean f26597t0;
    public boolean f26598u0;
    public final org.telegram.ui.Wallet.k8 v;
    public int f26599v0;
    public final org.telegram.ui.ActionBar.w0 f26600w;
    public DecimalFormat f26601w0;
    public final org.telegram.ui.ActionBar.w0 f26602x;
    public final int[] f26603x0;
    public final ShapeDrawable f26604y;
    public boolean f26605y0;
    public float f26606z0;

    public al(ti tiVar, Context context, int i10, TLRPC.User user, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, tiVar);
        this.f26582g0 = -1L;
        this.m0 = 1.0f;
        this.f26589n0 = 1.0f;
        this.f26597t0 = true;
        this.f26599v0 = 6;
        this.f26603x0 = new int[2];
        this.f26588n = i10;
        this.f26593r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26595s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, kb1.i(-1, -1, 55));
        org.telegram.ui.ActionBar.w0 a2 = this.f30254b.f32974a1.l().a(31, R.drawable.ic_ab_other);
        this.f26600w = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.f30253a), false, u6Var);
        this.f26602x = w0Var;
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i11, this.f30253a), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        w0Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(w0Var, g02, null, N, u6Var);
        w0Var.setOnClickListener(new bi.pa(this, u6Var, i10, 8));
        org.telegram.ui.Wallet.k8 k8Var = new org.telegram.ui.Wallet.k8(context, new org.telegram.ui.kp(24, this, user), new org.telegram.ui.kp(25, this, u6Var), u6Var);
        this.v = k8Var;
        k8Var.a(this.G, user);
        addView(k8Var, kb1.h(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, kb1.i(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.N = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, kb1.i(-1, -2, 17));
        org.telegram.ui.Wallet.h9 h9Var = new org.telegram.ui.Wallet.h9(context, u6Var);
        this.R = h9Var;
        h9Var.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
                        return;
                }
            }
        });
        linearLayout.addView(h9Var, kb1.x(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = h9Var.getEditText();
        this.S = editText;
        editText.setFilters(new InputFilter[]{new qk(0, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new rk(this, 0));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new d1(this, 1));
        editText.addTextChangedListener(new yk(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.f26592q0 = spannableString;
        zq zqVar = new zq(R.drawable.wallet_currency_exchange, 0);
        zqVar.setAlpha(0.72f);
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.f26594r0 = spannableString2;
        zq zqVar2 = new zq(R.drawable.wallet_gram_small, 0);
        zqVar2.recolorDrawable = false;
        spannableString2.setSpan(zqVar2, 0, spannableString2.length(), 33);
        s6 s6Var = new s6(context, false, true, true, true, true);
        this.T = s6Var;
        s6Var.f32490c.m(0.35f, 320L, 3.5f, ds.h);
        s6Var.setScaleProperty(0.35f);
        s6Var.setText(U(org.telegram.ui.Wallet.l0.x(i10), 0L));
        int i12 = org.telegram.ui.ActionBar.y6.f23357d6;
        int i13 = org.telegram.ui.ActionBar.y6.f23768z6;
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i12, i13);
        org.telegram.ui.ActionBar.f7.n(s6Var, q5.f22486a, q5.f22487b, 4, 0.0f, u6Var);
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        s6Var.setGravity(17);
        s6Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        s6Var.setAllowCancel(true);
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, org.telegram.ui.ActionBar.y6.w0(i13, this.f30253a)));
        this.f26604y = c02;
        s6Var.setSizeableBackground(c02);
        linearLayout.addView(s6Var, kb1.x(-2, 28, 49, 0, 8, 0, 0));
        kb1.b(s6Var);
        s6Var.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        linearLayout.addView(frameLayout3, kb1.u(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.O = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, kb1.i(-2, -2, 49));
        TextView textView = new TextView(context);
        this.Q = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i13, u6Var);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.WalletTapToSetAmount));
        frameLayout3.addView(textView, kb1.h(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        kb1.b(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
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
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(0, true, false, null);
        this.E = l5Var;
        l5Var.f22852x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = l5Var.f22835c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i14 = org.telegram.ui.ActionBar.y6.kl;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i14, this.f30253a));
        l5Var.f22851w = Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(i14, this.f30253a));
        textView2.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        textView2.setBackground(l5Var);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, i13, u6Var);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, kb1.x(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
                        return;
                }
            }
        });
        kb1.c(textView2, 0.02f, 1.2f);
        aa0 aa0Var = new aa0(context, u6Var);
        this.V = aa0Var;
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.f23599q7, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.Oh, u6Var);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setGravity(17);
        aa0Var.setTypeface(AndroidUtilities.bold());
        aa0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        e0(false);
        linearLayout2.addView(aa0Var, kb1.x(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26585j0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f26586k0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, kb1.g(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.W = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i13, u6Var);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, kb1.i(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.f26576a0 = textView4;
        org.telegram.ui.ActionBar.f7.V(textView4, i13, u6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, kb1.h(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.f26577b0 = spannableString3;
        spannableString3.setSpan(new fa0(AndroidUtilities.dp(80.0f), textView4), 0, spannableString3.length(), 33);
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        this.f26590o0 = f7;
        f7.setText(LocaleController.getString(R.string.WalletSendGrams));
        f7.setEnabled(false);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final al f31635b;

            {
                this.f31635b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31635b.c0();
                        return;
                    case 1:
                        this.f31635b.Z();
                        return;
                    case 2:
                        al.N(this.f31635b);
                        return;
                    case 3:
                        this.f31635b.c0();
                        return;
                    case 4:
                        this.f31635b.c0();
                        return;
                    case 5:
                        this.f31635b.c0();
                        return;
                    default:
                        al.P(this.f31635b);
                        return;
                }
            }
        });
        frameLayout5.addView(f7, kb1.i(-1, 48, 87));
        frameLayout.addView(frameLayout4, kb1.h(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        m0(false, false);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.walletUpdate);
        h0();
        this.I = true;
        org.telegram.ui.Wallet.l0.x(i10).a0(user, new tk(this, 0));
    }

    public static void N(org.telegram.ui.Components.al r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.al.N(org.telegram.ui.Components.al):void");
    }

    public static void P(al alVar) {
        String V;
        EditTextBoldCursor editTextBoldCursor = alVar.S;
        BigDecimal currencyPerGram = alVar.getCurrencyPerGram();
        if (!alVar.f26598u0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = alVar.getGramNanoAmount();
        alVar.f26598u0 = !alVar.f26598u0;
        alVar.R.d(org.telegram.ui.Wallet.l0.x(alVar.f26588n), alVar.f26598u0);
        if (gramNanoAmount <= 0) {
            V = "";
        } else if (alVar.f26598u0) {
            V = alVar.S(gramNanoAmount, currencyPerGram);
        } else {
            V = V(gramNanoAmount);
        }
        editTextBoldCursor.setText(V);
        editTextBoldCursor.setSelection(V.length());
    }

    public static CharSequence Q(al alVar, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i12).toString());
        sb2.append((Object) charSequence.subSequence(i10, i11));
        sb2.append((Object) spanned.subSequence(i13, spanned.length()));
        String sb3 = sb2.toString();
        int i14 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (alVar.f26598u0) {
            BigDecimal currencyPerGram = alVar.getCurrencyPerGram();
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
        return W(this.f26585j0);
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
        if (TextUtils.equals(org.telegram.ui.Wallet.l0.x(this.f26588n).h.g(), "USD")) {
            return 2;
        }
        return 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i10 = this.f26588n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.l0.x(i10).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(i10).config.tonUsdRate.get();
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal a02 = a0(this.S.getText().toString());
        if (this.f26598u0) {
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
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.l0.x(this.f26588n).h;
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
        this.f26580e0 = f7;
        TextView textView = this.f26576a0;
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
        int dp;
        int i12;
        int dp2;
        ti tiVar = this.f30254b;
        if (tiVar.f33037u1.Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26605y0 = z10;
        this.f30256f = z10;
        if (z10) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(70.0f);
        }
        int round = Math.round(AndroidUtilities.dp(32.0f) * this.f26580e0) + AndroidUtilities.dp(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26585j0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = dp;
        if (this.f26605y0) {
            i12 = AndroidUtilities.dp(56.0f);
            tiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    tiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            tiVar.setAllowNestedScroll(true);
        }
        int c10 = org.telegram.messenger.t.c(1.0f, i12, 0) + AndroidUtilities.statusBarHeight;
        FrameLayout frameLayout = this.f26595s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != c10) {
            layoutParams2.topMargin = c10;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int z11 = org.telegram.messenger.t.z(4.0f, c10 - AndroidUtilities.statusBarHeight, 0);
        org.telegram.ui.Wallet.k8 k8Var = this.v;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) k8Var.getLayoutParams();
        if (this.f26605y0) {
            dp2 = AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            dp2 = z11 - AndroidUtilities.dp(4.0f);
        }
        int max = Math.max(0, dp2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            k8Var.setLayoutParams(layoutParams3);
        }
        i0();
    }

    @Override
    public final void G(li liVar) {
        Activity findActivity;
        R();
        if (this.L == null && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (Math.min(point.x, point.y) < AndroidUtilities.dp(700.0f) && (findActivity = AndroidUtilities.findActivity(getContext())) != null) {
                try {
                    this.M = findActivity.getRequestedOrientation();
                    findActivity.setRequestedOrientation(1);
                    this.L = findActivity;
                } catch (Exception e) {
                    FileLog.e(e);
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
        this.f26585j0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.k8 k8Var = this.v;
        k8Var.setTranslationY(0.0f);
        k8Var.setAlpha(1.0f);
        this.D0 = false;
        ti tiVar = this.f30254b;
        tiVar.f32974a1.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        tiVar.f32974a1.setDrawGlassTitle(false);
        this.f26600w.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        org.telegram.ui.Wallet.h9 h9Var = this.R;
        if (h9Var.getDiamondView().f36981f == null) {
            f7 = 1.0f;
        }
        this.f26589n0 = f7;
        this.m0 = f7;
        k0();
        if (this.m0 < 1.0f) {
            h9Var.getDiamondView().l(new uk(this, 3));
        }
    }

    @Override
    public final void H() {
        this.L0 = true;
        post(new uk(this, 4));
    }

    @Override
    public final boolean M() {
        return !this.N0;
    }

    public final void R() {
        this.R.getDiamondView().l(null);
        o1.j jVar = this.f26587l0;
        if (jVar != null) {
            jVar.c();
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

    public final SpannableStringBuilder U(org.telegram.ui.Wallet.l0 l0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.m(j10, false));
        d0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f26592q0);
    }

    public final float W(View view) {
        float f7 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f7 += view.getY() - view2.getScrollY();
            view = view2;
        }
        int[] iArr = this.f26603x0;
        view.getLocationOnScreen(iArr);
        return ((f7 + iArr[1]) + this.f26606z0) - this.f30254b.f33051y0;
    }

    public final float X(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (W(view) - this.f26586k0.getTranslationY());
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void Y() {
        if (!this.K && !TextUtils.isEmpty(this.G)) {
            org.telegram.ui.Wallet.m mVar = this.f26584i0;
            byte[] bArr = null;
            if (mVar != null) {
                mVar.run();
                this.f26584i0 = null;
            }
            this.f26582g0 = -1L;
            h0();
            org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(this.f26588n);
            if (this.f26583h0) {
                String str = this.G;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.f26596s0;
                if (this.f26597t0) {
                    bArr = getPublicKey();
                }
                this.f26584i0 = x9.i(str, max, str2, bArr, new tk(this, 1));
            }
        }
    }

    public final void Z() {
        if (!this.K && !this.N0 && this.O0 == null && this.T0 == null) {
            c0();
            bi.r3 r3Var = new bi.r3(this, SystemClock.uptimeMillis() + 1500, 24);
            this.O0 = r3Var;
            post(r3Var);
        }
    }

    public final void b0() {
        if (this.L0 && !this.B0 && !this.K0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.N.getHeight() > 0 && this.f26585j0.getHeight() > 0) {
            this.E0 = getBottomYOnScreen();
            this.F0 = W(this.v);
            this.D0 = true;
        }
    }

    public final void c0() {
        if (!this.K && !this.N0) {
            ti tiVar = this.f30254b;
            if (!tiVar.isDismissed()) {
                if (!this.L0) {
                    this.M0 = true;
                    return;
                }
                this.M0 = false;
                EditTextBoldCursor editTextBoldCursor = this.S;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                tiVar.z1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new uk(this, 1), 220L);
            }
        }
    }

    @Override
    public final void d() {
        try {
            org.telegram.ui.ActionBar.w0 w0Var = this.f26602x;
            org.telegram.ui.ActionBar.u6 u6Var = this.f30253a;
            if (w0Var != null) {
                w0Var.setIconColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            }
            ShapeDrawable shapeDrawable = this.f26604y;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.o1(0.08f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23768z6, u6Var)), shapeDrawable);
                s6 s6Var = this.T;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
            }
            org.telegram.ui.ActionBar.l5 l5Var = this.E;
            if (l5Var != null) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.kl, u6Var);
                l5Var.f22835c.setColor(w02);
                l5Var.f22851w = Integer.valueOf(w02);
                TextView textView = this.U;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            zq zqVar = this.F;
            if (zqVar != null) {
                zqVar.setOverrideColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
                aa0 aa0Var = this.V;
                if (aa0Var != null) {
                    aa0Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            boolean z10 = this.f26583h0;
            g0();
            if (z10 != this.f26583h0) {
                Y();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.f30254b.f32974a1.getAlpha();
        j0();
        if (this.f26587l0 != null || this.m0 < 1.0f) {
            k0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void e0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        aa0 aa0Var = this.V;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            zq translate = new zq(R.drawable.settings_arrow, 0).setOverrideColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.f30253a)).translate(0.0f, AndroidUtilities.dpf2(0.66f));
            this.F = translate;
            spannableStringBuilder.setSpan(translate, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new fi.hb(this, 6), length, spannableStringBuilder.length(), 33);
            aa0Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = aa0Var.animate();
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
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(ds.h).start();
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
        CharSequence formatSpannable;
        SpannableStringBuilder U;
        String V;
        i0();
        int i10 = this.f26588n;
        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i10);
        long v = x9.v();
        long gramNanoAmount = getGramNanoAmount();
        long j10 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        int i11 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.S;
        if (i11 > 0 && gramNanoAmount < j10) {
            if (this.f26598u0) {
                V = S(j10, getCurrencyPerGram());
            } else {
                V = V(j10);
            }
            editTextBoldCursor.setText(V);
            editTextBoldCursor.setSelection(V.length());
            int i12 = -this.f26599v0;
            this.f26599v0 = i12;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i12);
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
        fi.d dVar = this.f26590o0;
        dVar.setLoading(z12);
        if (TextUtils.isEmpty(gramsText)) {
            formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
        } else {
            formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, org.telegram.ui.Wallet.l0.l("Grams", gramsText, R.string.Grams_other));
        }
        dVar.i(formatSpannable, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z14 = !isEmpty;
        if (!isEmpty && z10 && !this.J) {
            z13 = true;
        }
        dVar.setEnabled(z13);
        m0(z14, this.L0);
        h0();
        this.R.d(org.telegram.ui.Wallet.l0.x(i10), this.f26598u0);
        if (this.f26598u0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f26594r0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.f26601w0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.f26601w0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.f26601w0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            d0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            U = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f26592q0);
        } else {
            U = U(x9, gramNanoAmount);
        }
        this.T.setText(U);
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.f26595s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return AndroidUtilities.dp(13.0f) + Math.max(0, top - (AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight));
    }

    @Override
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f30253a);
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26595s.getLayoutParams();
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
        int i10 = this.f26588n;
        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i10);
        this.W.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, org.telegram.ui.Wallet.l0.l("Grams", org.telegram.ui.Wallet.l0.p(x9.v(), true), R.string.Grams_other)));
        long j10 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        if (!x9.F() && x9.v() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26583h0 = z10;
        boolean z12 = this.f26579d0 | (!TextUtils.isEmpty(this.S.getText()));
        this.f26579d0 = z12;
        if (this.f26583h0 && z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26578c0 != z11) {
            this.f26578c0 = z11;
            ValueAnimator valueAnimator = this.f26581f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26581f0 = null;
            }
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.L0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26580e0, f7);
                this.f26581f0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f26581f0.setInterpolator(ds.h);
                this.f26581f0.addUpdateListener(new n6(this, 12));
                this.f26581f0.start();
            } else {
                setFeeVisibilityProgress(f7);
            }
        }
        long j11 = this.f26582g0;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        TextView textView = this.f26576a0;
        if (i11 >= 0) {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, org.telegram.ui.Wallet.l0.s(j11, false)));
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.f26577b0));
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
            if (getGramNanoAmount() <= 0 && this.U.getVisibility() != 0 && !this.f26605y0) {
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
                    public final al f34536b;

                    {
                        this.f34536b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f34536b.O;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout2.setVisibility(i10);
                                return;
                            default:
                                TextView textView2 = this.f34536b.Q;
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
                ds dsVar = ds.h;
                duration.setInterpolator(dsVar).start();
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
                    public final al f34536b;

                    {
                        this.f34536b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f34536b.O;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout2.setVisibility(i10);
                                return;
                            default:
                                TextView textView2 = this.f34536b.Q;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView2.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(dsVar).start();
            }
        }
    }

    @Override
    public final boolean j() {
        if (this.f30254b.f33037u1.Q() <= AndroidUtilities.dp(20.0f)) {
            return false;
        }
        this.M0 = false;
        bi.r3 r3Var = this.O0;
        if (r3Var != null) {
            removeCallbacks(r3Var);
            this.O0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.S;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        return true;
    }

    public final void j0() {
        float f7;
        View view = this.N;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.f26585j0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.f26595s;
                float W = W(view2);
                org.telegram.ui.Wallet.k8 k8Var = this.v;
                if (k8Var.getVisibility() == 0) {
                    f7 = Math.max(W, (k8Var.getScaleY() * (k8Var.getContentBottom() - k8Var.getPivotY())) + k8Var.getPivotY() + W(k8Var));
                } else {
                    f7 = W;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((W + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, X(this.W)), X(this.f26576a0)), X(this.f26590o0)) - f7);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(AndroidUtilities.dp(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
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
        float max = Math.max(this.f26589n0, Math.max(0.0f, Math.min(1.0f, this.m0)));
        this.f26589n0 = max;
        float f7 = 1.0f - max;
        float f10 = this.m0;
        if (this.f26587l0 == null && f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Wallet.h9 h9Var = this.R;
        h9Var.e(f10, max, z10);
        h9Var.setTranslationY((1.0f - this.m0) * (((this.N.getHeight() / 2.0f) - h9Var.getTop()) - (h9Var.getHeight() / 2.0f)));
        float f11 = this.f26589n0;
        s6 s6Var = this.T;
        s6Var.setAlpha(f11);
        s6Var.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f12 = this.f26589n0;
        FrameLayout frameLayout = this.P;
        frameLayout.setAlpha(f12);
        frameLayout.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f13 = this.f26589n0;
        FrameLayout frameLayout2 = this.f26586k0;
        frameLayout2.setAlpha(f13);
        frameLayout2.setTranslationY(AndroidUtilities.dp(24.0f) * f7);
    }

    public final void l0() {
        float f7;
        if (this.B0 && this.N.getHeight() > 0) {
            FrameLayout frameLayout = this.f26585j0;
            if (frameLayout.getHeight() > 0) {
                if (this.C0) {
                    f7 = this.A0;
                } else {
                    f7 = 1.0f - this.A0;
                }
                float f10 = this.I0;
                float z10 = c3.h0.z(this.J0, f10, f7, f10);
                float f11 = this.G0;
                float z11 = c3.h0.z(this.H0, f11, f7, f11);
                frameLayout.setTranslationY(z10 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                org.telegram.ui.Wallet.k8 k8Var = this.v;
                k8Var.setTranslationY(z11 - (W(k8Var) - k8Var.getTranslationY()));
                j0();
            }
        }
    }

    @Override
    public final void m(float f7, float f10) {
        this.f26606z0 = f7;
        this.A0 = f10;
        l0();
    }

    public final void m0(boolean z10, boolean z11) {
        float f7;
        if (z11 && this.f26591p0 == z10) {
            return;
        }
        this.f26591p0 = z10;
        fi.d dVar = this.f26590o0;
        dVar.animate().cancel();
        TextView textView = this.W;
        textView.animate().cancel();
        TextView textView2 = this.f26576a0;
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
            f10 = AndroidUtilities.dp(60.0f);
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
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).withEndAction(new uk(this, 5)).start();
        textView.animate().translationY(f10).setDuration(320L).setInterpolator(dsVar).start();
        textView2.animate().translationY(f10).setDuration(320L).setInterpolator(dsVar).start();
    }

    @Override
    public final void o() {
        if (this.K) {
            return;
        }
        this.K = true;
        R();
        org.telegram.ui.Wallet.e6 e6Var = this.Q0;
        if (e6Var != null) {
            AnimatorSet animatorSet = e6Var.f36533m;
            if (!e6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e6Var.a(false);
                }
            }
            this.Q0 = null;
        }
        org.telegram.ui.Wallet.v9 v9Var = this.R0;
        if (v9Var != null) {
            AnimatorSet animatorSet2 = v9Var.f37420m;
            if (!v9Var.f37426s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    v9Var.b();
                }
            }
            this.R0 = null;
        }
        ValueAnimator valueAnimator = this.f26581f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26581f0 = null;
        }
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.L = null;
        }
        this.O.animate().cancel();
        this.Q.animate().cancel();
        this.V.animate().cancel();
        this.f26590o0.animate().cancel();
        this.W.animate().cancel();
        this.f26576a0.animate().cancel();
        bi.r3 r3Var = this.O0;
        if (r3Var != null) {
            removeCallbacks(r3Var);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.T0;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        org.telegram.ui.Wallet.m mVar = this.f26584i0;
        if (mVar != null) {
            mVar.run();
            this.f26584i0 = null;
        }
        NotificationCenter.getInstance(this.f26588n).removeObserver(this, NotificationCenter.walletUpdate);
        this.f30254b.f32974a1.l().removeView(this.f26600w);
        AndroidUtilities.hideKeyboard(this.S);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K0) {
            this.K0 = false;
            this.N.setTranslationY(0.0f);
            this.f26585j0.setTranslationY(0.0f);
            this.v.setTranslationY(0.0f);
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
        this.v.setAlpha(1.0f - f7);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30254b.getSheetContainer().invalidate();
    }

    @Override
    public final void t() {
        R();
        Activity activity = this.L;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.M);
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.L = null;
        }
        this.f30254b.f32974a1.setDrawGlassTitle(true);
        this.L0 = false;
        this.M0 = false;
        bi.r3 r3Var = this.O0;
        if (r3Var != null) {
            removeCallbacks(r3Var);
            this.O0 = null;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.T0;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        this.f26600w.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.S;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void v(int i10) {
        if (i10 == 2) {
            org.telegram.ui.Wallet.m5.F0(getContext(), this.f26588n, this.f30253a);
        } else if (i10 == 3) {
            Z();
        }
    }

    @Override
    public final void x() {
        if (!this.B0) {
            return;
        }
        this.B0 = false;
        float bottomYOnScreen = getBottomYOnScreen();
        FrameLayout frameLayout = this.f26585j0;
        frameLayout.setTranslationY(this.J0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.k8 k8Var = this.v;
        k8Var.setTranslationY(this.H0 - (W(k8Var) - k8Var.getTranslationY()));
        this.K0 = true;
        requestLayout();
    }

    @Override
    public final void y(int i10, boolean z10) {
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
        org.telegram.ui.Wallet.k8 k8Var = this.v;
        if (z11) {
            W = this.F0;
        } else {
            W = W(k8Var);
        }
        this.G0 = W;
        this.J0 = getBottomYOnScreen() - this.f26585j0.getTranslationY();
        this.H0 = W(k8Var) - k8Var.getTranslationY();
        l0();
    }
}
