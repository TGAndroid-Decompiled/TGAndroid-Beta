package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
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
public final class gl extends qi implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public byte[] E;
    public float E0;
    public boolean F;
    public float F0;
    public boolean G;
    public float G0;
    public boolean H;
    public boolean H0;
    public Activity I;
    public boolean I0;
    public int J;
    public boolean J0;
    public final dl K;
    public boolean K0;
    public final LinearLayout L;
    public ai.j L0;
    public final FrameLayout M;
    public TL_wallet.walletTransaction M0;
    public final TextView N;
    public org.telegram.ui.Wallet.u5 N0;
    public final org.telegram.ui.Wallet.h8 O;
    public org.telegram.ui.Wallet.v8 O0;
    public final EditTextBoldCursor P;
    public boolean P0;
    public final r6 Q;
    public org.telegram.ui.ActionBar.b2 Q0;
    public final TextView R;
    public boolean R0;
    public final ea0 S;
    public DecimalFormat S0;
    public final TextView T;
    public final TextView U;
    public final SpannableString V;
    public boolean W;
    public boolean f26768a0;
    public float f26769b0;
    public ValueAnimator f26770c0;
    public long f26771d0;
    public boolean f26772e0;
    public org.telegram.ui.Wallet.m f26773f0;
    public final FrameLayout f26774g0;
    public final FrameLayout f26775h0;
    public o1.k f26776i0;
    public float f26777j0;
    public float f26778k0;
    public final ci.d f26779l0;
    public boolean m0;
    public final int f26780n;
    public final SpannableString f26781n0;
    public final SpannableString f26782o0;
    public String f26783p0;
    public boolean f26784q0;
    public final TLRPC.User f26785r;
    public boolean f26786r0;
    public final FrameLayout f26787s;
    public int f26788s0;
    public DecimalFormat f26789t0;
    public final int[] f26790u0;
    public final org.telegram.ui.Wallet.m7 v;
    public boolean f26791v0;
    public final org.telegram.ui.ActionBar.v0 f26792w;
    public float f26793w0;
    public final org.telegram.ui.ActionBar.v0 f26794x;
    public float f26795x0;
    public String f26796y;
    public boolean f26797y0;
    public boolean f26798z0;

    public gl(yi yiVar, Context context, int i10, TLRPC.User user, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, yiVar);
        this.f26771d0 = -1L;
        this.f26777j0 = 1.0f;
        this.f26778k0 = 1.0f;
        this.f26784q0 = true;
        this.f26788s0 = 6;
        this.f26790u0 = new int[2];
        this.f26780n = i10;
        this.f26785r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f26787s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, w7.x5.e(-1, -1, 55));
        org.telegram.ui.ActionBar.v0 a2 = this.f30173b.f33211a1.o().a(31, R.drawable.ic_ab_other);
        this.f26792w = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, this.f30172a), false, e6Var);
        this.f26794x = v0Var;
        v0Var.setIcon(R.drawable.ic_ab_other);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.f30172a), 1, -1));
        v0Var.setOnClickListener(new org.telegram.ui.Cells.sa(this, e6Var, i10, 6));
        org.telegram.ui.Wallet.m7 m7Var = new org.telegram.ui.Wallet.m7(context, new ea(19, this, user), new ea(20, this, e6Var), e6Var);
        this.v = m7Var;
        m7Var.a(this.f26796y, user);
        addView(m7Var, w7.x5.a(64.0f, 6.0f, 0.0f, 6.0f, 0.0f, -2, 49));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, w7.x5.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.K = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, w7.x5.e(-1, -2, 17));
        org.telegram.ui.Wallet.h8 h8Var = new org.telegram.ui.Wallet.h8(context, e6Var);
        this.O = h8Var;
        h8Var.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
                        return;
                }
            }
        });
        linearLayout.addView(h8Var, w7.x5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = h8Var.getEditText();
        this.P = editText;
        editText.setFilters(new InputFilter[]{new vk(0, this)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new wk(this, 0));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new e1(this, 1));
        editText.addTextChangedListener(new el(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.f26781n0 = spannableString;
        er erVar = new er(R.drawable.wallet_currency_exchange, 0);
        erVar.setAlpha(0.72f);
        spannableString.setSpan(erVar, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.f26782o0 = spannableString2;
        er erVar2 = new er(R.drawable.wallet_gram_small, 0);
        erVar2.recolorDrawable = false;
        spannableString2.setSpan(erVar2, 0, spannableString2.length(), 33);
        r6 r6Var = new r6(context, false, true, true, true, true);
        this.Q = r6Var;
        r6Var.f30364c.m(0.35f, 320L, 3.5f, hs.h);
        r6Var.setScaleProperty(0.35f);
        r6Var.setText(U(org.telegram.ui.Wallet.k0.v(i10), 0L));
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f30172a);
        int i11 = org.telegram.ui.ActionBar.i6.f21199z6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.v(w02, org.telegram.ui.ActionBar.i6.w0(i11, this.f30172a)));
        r6Var.setTextSize(AndroidUtilities.dp(14.0f));
        r6Var.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        r6Var.setGravity(17);
        r6Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        r6Var.setAllowCancel(true);
        r6Var.setSizeableBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.m1(0.08f, org.telegram.ui.ActionBar.i6.w0(i11, this.f30172a))));
        linearLayout.addView(r6Var, w7.x5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.z5.a(r6Var);
        r6Var.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.M = frameLayout3;
        linearLayout.addView(frameLayout3, w7.x5.q(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.L = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, w7.x5.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.N = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f30172a));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.WalletTapToSetAmount));
        frameLayout3.addView(textView, w7.x5.a(28.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 49));
        w7.z5.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
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
        this.R0 = false;
        TextView textView2 = new TextView(context);
        this.R = textView2;
        org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        f5Var.f20619x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = f5Var.f20601c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i12 = org.telegram.ui.ActionBar.i6.kl;
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(i12, this.f30172a));
        f5Var.f20618w = Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(i12, this.f30172a));
        textView2.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        textView2.setBackground(f5Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f30172a));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, w7.x5.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
                        return;
                }
            }
        });
        w7.z5.b(textView2, 0.02f, 1.2f);
        ea0 ea0Var = new ea0(context, e6Var);
        this.S = ea0Var;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, this.f30172a));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f30172a));
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setGravity(17);
        ea0Var.setTypeface(AndroidUtilities.bold());
        ea0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        e0(false);
        linearLayout2.addView(ea0Var, w7.x5.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26774g0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f26775h0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, w7.x5.d(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.T = textView3;
        org.telegram.messenger.bi.o(i11, this.f30172a, textView3, 1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, w7.x5.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.U = textView4;
        org.telegram.messenger.bi.o(i11, this.f30172a, textView4, 1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, w7.x5.a(-2.0f, 0.0f, 24.0f, 0.0f, 0.0f, -1, 55));
        SpannableString spannableString3 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.V = spannableString3;
        spannableString3.setSpan(new ja0(AndroidUtilities.dp(80.0f), textView4), 0, spannableString3.length(), 33);
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        this.f26779l0 = f7;
        f7.setText(LocaleController.getString(R.string.WalletSendGrams));
        f7.setEnabled(false);
        f7.setOnClickListener(new View.OnClickListener(this) {
            public final gl f31520b;

            {
                this.f31520b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f31520b.c0();
                        return;
                    case 1:
                        this.f31520b.Z();
                        return;
                    case 2:
                        gl.N(this.f31520b);
                        return;
                    case 3:
                        this.f31520b.c0();
                        return;
                    case 4:
                        this.f31520b.c0();
                        return;
                    case 5:
                        this.f31520b.c0();
                        return;
                    default:
                        gl.P(this.f31520b);
                        return;
                }
            }
        });
        frameLayout5.addView(f7, w7.x5.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, w7.x5.a(92.0f, 0.0f, 0.0f, 0.0f, 70.0f, -1, 87));
        m0(false, false);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.walletUpdate);
        h0();
        this.F = true;
        org.telegram.ui.Wallet.k0.v(i10).W(user, new yk(this, 0));
    }

    public static void N(org.telegram.ui.Components.gl r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gl.N(org.telegram.ui.Components.gl):void");
    }

    public static void P(gl glVar) {
        String V;
        EditTextBoldCursor editTextBoldCursor = glVar.P;
        BigDecimal currencyPerGram = glVar.getCurrencyPerGram();
        if (!glVar.f26786r0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = glVar.getGramNanoAmount();
        glVar.f26786r0 = !glVar.f26786r0;
        glVar.O.d(org.telegram.ui.Wallet.k0.v(glVar.f26780n), glVar.f26786r0);
        if (gramNanoAmount <= 0) {
            V = "";
        } else if (glVar.f26786r0) {
            V = glVar.S(gramNanoAmount, currencyPerGram);
        } else {
            V = V(gramNanoAmount);
        }
        editTextBoldCursor.setText(V);
        editTextBoldCursor.setSelection(V.length());
    }

    public static CharSequence Q(gl glVar, CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(spanned.subSequence(0, i12).toString());
        sb2.append((Object) charSequence.subSequence(i10, i11));
        sb2.append((Object) spanned.subSequence(i13, spanned.length()));
        String sb3 = sb2.toString();
        int i14 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (glVar.f26786r0) {
            BigDecimal currencyPerGram = glVar.getCurrencyPerGram();
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

    public static String V(long j3) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j3).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
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
        return W(this.f26774g0);
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
        if (TextUtils.equals(org.telegram.ui.Wallet.k0.v(this.f26780n).h.g(), "USD")) {
            return 2;
        }
        return 0;
    }

    private BigDecimal getCurrencyPerGram() {
        int i10 = this.f26780n;
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.v(i10).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(i10).config.tonUsdRate.get();
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal a02 = a0(this.P.getText().toString());
        if (this.f26786r0) {
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
        if (this.S0 == null) {
            this.S0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        if (gramNanoAmount > 0) {
            return this.S0.format(BigDecimal.valueOf(gramNanoAmount, 9));
        }
        return "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        org.telegram.ui.Wallet.f fVar = org.telegram.ui.Wallet.k0.v(this.f26780n).h;
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
        this.f26769b0 = f7;
        TextView textView = this.U;
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
    public final void B() {
        R();
        f0();
    }

    @Override
    public final void C(int i10, int i11) {
        boolean z10;
        int dp;
        int i12;
        int dp2;
        yi yiVar = this.f30173b;
        if (yiVar.f33275u1.R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26791v0 = z10;
        this.f30176f = z10;
        if (z10) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(70.0f);
        }
        int round = Math.round(AndroidUtilities.dp(32.0f) * this.f26769b0) + AndroidUtilities.dp(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26774g0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = dp;
        if (this.f26791v0) {
            i12 = AndroidUtilities.dp(56.0f);
            yiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    yiVar.setAllowNestedScroll(true);
                }
            }
            i12 = (i11 / 5) * 2;
            yiVar.setAllowNestedScroll(true);
        }
        int b10 = org.telegram.messenger.q.b(1.0f, i12, 0) + AndroidUtilities.statusBarHeight;
        FrameLayout frameLayout = this.f26787s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != b10) {
            layoutParams2.topMargin = b10;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int y3 = org.telegram.messenger.q.y(4.0f, b10 - AndroidUtilities.statusBarHeight, 0);
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) m7Var.getLayoutParams();
        if (this.f26791v0) {
            dp2 = AndroidUtilities.dp(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        } else {
            dp2 = y3 - AndroidUtilities.dp(4.0f);
        }
        int max = Math.max(0, dp2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            m7Var.setLayoutParams(layoutParams3);
        }
        i0();
    }

    @Override
    public final void G(qi qiVar) {
        Activity findActivity;
        R();
        if (this.I == null && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (Math.min(point.x, point.y) < AndroidUtilities.dp(700.0f) && (findActivity = AndroidUtilities.findActivity(getContext())) != null) {
                try {
                    this.J = findActivity.getRequestedOrientation();
                    findActivity.setRequestedOrientation(1);
                    this.I = findActivity;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        this.I0 = false;
        this.K0 = false;
        EditTextBoldCursor editTextBoldCursor = this.P;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.J0 = false;
        this.f26797y0 = false;
        this.H0 = false;
        float f7 = 0.0f;
        this.K.setTranslationY(0.0f);
        this.f26774g0.setTranslationY(0.0f);
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        m7Var.setTranslationY(0.0f);
        m7Var.setAlpha(1.0f);
        this.A0 = false;
        yi yiVar = this.f30173b;
        yiVar.f33211a1.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        yiVar.f33211a1.setDrawGlassTitle(false);
        this.f26792w.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        org.telegram.ui.Wallet.h8 h8Var = this.O;
        if (h8Var.getDiamondView().f34667f == null) {
            f7 = 1.0f;
        }
        this.f26778k0 = f7;
        this.f26777j0 = f7;
        k0();
        if (this.f26777j0 < 1.0f) {
            h8Var.getDiamondView().l(new al(this, 3));
        }
    }

    @Override
    public final void I() {
        this.I0 = true;
        post(new al(this, 4));
    }

    @Override
    public final boolean M() {
        return !this.K0;
    }

    public final void R() {
        this.O.getDiamondView().l(null);
        o1.k kVar = this.f26776i0;
        if (kVar != null) {
            kVar.c();
        }
        this.f26777j0 = 1.0f;
        k0();
    }

    public final String S(long j3, BigDecimal bigDecimal) {
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
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

    public final SpannableStringBuilder U(org.telegram.ui.Wallet.k0 k0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.l(j3, false));
        d0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f26781n0);
    }

    public final float W(View view) {
        float f7 = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f7 += view.getY() - view2.getScrollY();
            view = view2;
        }
        int[] iArr = this.f26790u0;
        view.getLocationOnScreen(iArr);
        return ((f7 + iArr[1]) + this.f26793w0) - this.f30173b.f33289y0;
    }

    public final float X(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (W(view) - this.f26775h0.getTranslationY());
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void Y() {
        if (!this.H && !TextUtils.isEmpty(this.f26796y)) {
            org.telegram.ui.Wallet.m mVar = this.f26773f0;
            byte[] bArr = null;
            if (mVar != null) {
                mVar.run();
                this.f26773f0 = null;
            }
            this.f26771d0 = -1L;
            h0();
            org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(this.f26780n);
            if (this.f26772e0) {
                String str = this.f26796y;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.f26783p0;
                if (this.f26784q0) {
                    bArr = getPublicKey();
                }
                this.f26773f0 = v.h(str, max, str2, bArr, new yk(this, 1));
            }
        }
    }

    public final void Z() {
        if (!this.H && !this.K0 && this.L0 == null && this.Q0 == null) {
            c0();
            ai.j jVar = new ai.j(this, SystemClock.uptimeMillis() + 1500, 22);
            this.L0 = jVar;
            post(jVar);
        }
    }

    public final void b0() {
        if (this.I0 && !this.f26797y0 && !this.H0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.K.getHeight() > 0 && this.f26774g0.getHeight() > 0) {
            this.B0 = getBottomYOnScreen();
            this.C0 = W(this.v);
            this.A0 = true;
        }
    }

    public final void c0() {
        if (!this.H && !this.K0) {
            yi yiVar = this.f30173b;
            if (!yiVar.isDismissed()) {
                if (!this.I0) {
                    this.J0 = true;
                    return;
                }
                this.J0 = false;
                EditTextBoldCursor editTextBoldCursor = this.P;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                yiVar.w1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new al(this, 1), 220L);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            boolean z10 = this.f26772e0;
            g0();
            if (z10 != this.f26772e0) {
                Y();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.f30173b.f33211a1.getAlpha();
        j0();
        if (this.f26776i0 != null || this.f26777j0 < 1.0f) {
            k0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void e0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        ea0 ea0Var = this.S;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new er(R.drawable.settings_arrow, 0).setOverrideColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, this.f30172a)).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ci.ac(this, 6), length, spannableStringBuilder.length(), 33);
            ea0Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = ea0Var.animate();
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
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(hs.h).start();
    }

    public final void f0() {
        if (this.K0 && !this.H) {
            this.J0 = false;
            EditTextBoldCursor editTextBoldCursor = this.P;
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
        int i10 = this.f26780n;
        org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i10);
        long t10 = v.t();
        long gramNanoAmount = getGramNanoAmount();
        long j3 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        int i11 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.P;
        if (i11 > 0 && gramNanoAmount < j3) {
            if (this.f26786r0) {
                V = S(j3, getCurrencyPerGram());
            } else {
                V = V(j3);
            }
            editTextBoldCursor.setText(V);
            editTextBoldCursor.setSelection(V.length());
            int i12 = -this.f26788s0;
            this.f26788s0 = i12;
            AndroidUtilities.shakeViewSpring(editTextBoldCursor, i12);
            return;
        }
        boolean z13 = false;
        if (WalletEngine2.isValidAddress(this.f26796y) && gramNanoAmount <= t10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > t10) {
            z11 = true;
        } else {
            z11 = false;
        }
        e0(z11);
        String gramsText = getGramsText();
        if (this.f26796y == null && this.F) {
            z12 = true;
        } else {
            z12 = false;
        }
        ci.d dVar = this.f26779l0;
        dVar.setLoading(z12);
        if (TextUtils.isEmpty(gramsText)) {
            formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
        } else {
            formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, org.telegram.ui.Wallet.k0.k("Grams", gramsText, R.string.Grams_other));
        }
        dVar.g(formatSpannable, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z14 = !isEmpty;
        if (!isEmpty && z10 && !this.G) {
            z13 = true;
        }
        dVar.setEnabled(z13);
        m0(z14, this.I0);
        h0();
        this.O.d(org.telegram.ui.Wallet.k0.v(i10), this.f26786r0);
        if (this.f26786r0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f26782o0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.f26789t0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.f26789t0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.f26789t0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            d0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            U = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.f26781n0);
        } else {
            U = U(v, gramNanoAmount);
        }
        this.Q.setText(U);
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.f26787s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return AndroidUtilities.dp(13.0f) + Math.max(0, top - (AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight));
    }

    @Override
    public int getCustomBackground() {
        return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f30172a);
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26787s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.E == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.E;
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
        int i10 = this.f26780n;
        org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i10);
        this.T.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, org.telegram.ui.Wallet.k0.q(v.t(), true)));
        long j3 = MessagesController.getInstance(i10).config.walletTransferMinNanos.get();
        if (!v.C() && v.t() >= j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26772e0 = z10;
        boolean z12 = this.f26768a0 | (!TextUtils.isEmpty(this.P.getText()));
        this.f26768a0 = z12;
        if (this.f26772e0 && z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.W != z11) {
            this.W = z11;
            ValueAnimator valueAnimator = this.f26770c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26770c0 = null;
            }
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.I0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f26769b0, f7);
                this.f26770c0 = ofFloat;
                ofFloat.setDuration(320L);
                this.f26770c0.setInterpolator(hs.h);
                this.f26770c0.addUpdateListener(new m6(this, 11));
                this.f26770c0.start();
            } else {
                setFeeVisibilityProgress(f7);
            }
        }
        long j10 = this.f26771d0;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TextView textView = this.U;
        if (i11 >= 0) {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, org.telegram.ui.Wallet.k0.q(j10, false)));
        } else {
            textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.V));
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
        LinearLayout linearLayout = this.L;
        if (linearLayout != null && (textView = this.N) != null) {
            if (getGramNanoAmount() <= 0 && this.R.getVisibility() != 0 && !this.f26791v0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.R0) {
                this.R0 = z10;
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
                    public final gl f25431b;

                    {
                        this.f25431b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f25431b.L;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout2.setVisibility(i10);
                                return;
                            default:
                                TextView textView2 = this.f25431b.N;
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
                hs hsVar = hs.h;
                duration.setInterpolator(hsVar).start();
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
                    public final gl f25431b;

                    {
                        this.f25431b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout2 = this.f25431b.L;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout2.setVisibility(i10);
                                return;
                            default:
                                TextView textView2 = this.f25431b.N;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView2.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(hsVar).start();
            }
        }
    }

    @Override
    public final boolean j() {
        if (this.f30173b.f33275u1.R() <= AndroidUtilities.dp(20.0f)) {
            return false;
        }
        this.J0 = false;
        ai.j jVar = this.L0;
        if (jVar != null) {
            removeCallbacks(jVar);
            this.L0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.P;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        return true;
    }

    public final void j0() {
        float f7;
        View view = this.K;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.f26774g0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.f26787s;
                float W = W(view2);
                org.telegram.ui.Wallet.m7 m7Var = this.v;
                if (m7Var.getVisibility() == 0) {
                    f7 = Math.max(W, (m7Var.getScaleY() * (m7Var.getContentBottom() - m7Var.getPivotY())) + m7Var.getPivotY() + W(m7Var));
                } else {
                    f7 = W;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((W + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, X(this.T)), X(this.U)), X(this.f26779l0)) - f7);
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
        float max = Math.max(this.f26778k0, Math.max(0.0f, Math.min(1.0f, this.f26777j0)));
        this.f26778k0 = max;
        float f7 = 1.0f - max;
        float f10 = this.f26777j0;
        if (this.f26776i0 == null && f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Wallet.h8 h8Var = this.O;
        h8Var.e(f10, max, z10);
        h8Var.setTranslationY((1.0f - this.f26777j0) * (((this.K.getHeight() / 2.0f) - h8Var.getTop()) - (h8Var.getHeight() / 2.0f)));
        float f11 = this.f26778k0;
        r6 r6Var = this.Q;
        r6Var.setAlpha(f11);
        r6Var.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f12 = this.f26778k0;
        FrameLayout frameLayout = this.M;
        frameLayout.setAlpha(f12);
        frameLayout.setTranslationY(AndroidUtilities.dp(16.0f) * f7);
        float f13 = this.f26778k0;
        FrameLayout frameLayout2 = this.f26775h0;
        frameLayout2.setAlpha(f13);
        frameLayout2.setTranslationY(AndroidUtilities.dp(24.0f) * f7);
    }

    public final void l0() {
        float f7;
        if (this.f26797y0 && this.K.getHeight() > 0) {
            FrameLayout frameLayout = this.f26774g0;
            if (frameLayout.getHeight() > 0) {
                if (this.f26798z0) {
                    f7 = this.f26795x0;
                } else {
                    f7 = 1.0f - this.f26795x0;
                }
                float f10 = this.F0;
                float y3 = com.google.android.gms.internal.vision.e2.y(this.G0, f10, f7, f10);
                float f11 = this.D0;
                float y10 = com.google.android.gms.internal.vision.e2.y(this.E0, f11, f7, f11);
                frameLayout.setTranslationY(y3 - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                org.telegram.ui.Wallet.m7 m7Var = this.v;
                m7Var.setTranslationY(y10 - (W(m7Var) - m7Var.getTranslationY()));
                j0();
            }
        }
    }

    @Override
    public final void m(float f7, float f10) {
        this.f26793w0 = f7;
        this.f26795x0 = f10;
        l0();
    }

    public final void m0(boolean z10, boolean z11) {
        float f7;
        if (z11 && this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        ci.d dVar = this.f26779l0;
        dVar.animate().cancel();
        TextView textView = this.T;
        textView.animate().cancel();
        TextView textView2 = this.U;
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
        hs hsVar = hs.h;
        duration.setInterpolator(hsVar).withEndAction(new al(this, 5)).start();
        textView.animate().translationY(f10).setDuration(320L).setInterpolator(hsVar).start();
        textView2.animate().translationY(f10).setDuration(320L).setInterpolator(hsVar).start();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H0) {
            this.H0 = false;
            this.K.setTranslationY(0.0f);
            this.f26774g0.setTranslationY(0.0f);
            this.v.setTranslationY(0.0f);
            b0();
        } else if (this.f26797y0) {
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

    @Override
    public final void p() {
        if (this.H) {
            return;
        }
        this.H = true;
        R();
        org.telegram.ui.Wallet.u5 u5Var = this.N0;
        if (u5Var != null) {
            AnimatorSet animatorSet = u5Var.f35516m;
            if (!u5Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    u5Var.a(false);
                }
            }
            this.N0 = null;
        }
        org.telegram.ui.Wallet.v8 v8Var = this.O0;
        if (v8Var != null) {
            AnimatorSet animatorSet2 = v8Var.f35570m;
            if (!v8Var.f35576s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    v8Var.b();
                }
            }
            this.O0 = null;
        }
        ValueAnimator valueAnimator = this.f26770c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26770c0 = null;
        }
        Activity activity = this.I;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.J);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.I = null;
        }
        this.L.animate().cancel();
        this.N.animate().cancel();
        this.S.animate().cancel();
        this.f26779l0.animate().cancel();
        this.T.animate().cancel();
        this.U.animate().cancel();
        ai.j jVar = this.L0;
        if (jVar != null) {
            removeCallbacks(jVar);
            this.L0 = null;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.Q0;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        org.telegram.ui.Wallet.m mVar = this.f26773f0;
        if (mVar != null) {
            mVar.run();
            this.f26773f0 = null;
        }
        NotificationCenter.getInstance(this.f26780n).removeObserver(this, NotificationCenter.walletUpdate);
        this.f30173b.f33211a1.o().removeView(this.f26792w);
        AndroidUtilities.hideKeyboard(this.P);
    }

    public void setSendTransitionProgress(float f7) {
        this.v.setAlpha(1.0f - f7);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
    }

    @Override
    public final void u() {
        R();
        Activity activity = this.I;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.J);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.I = null;
        }
        this.f30173b.f33211a1.setDrawGlassTitle(true);
        this.I0 = false;
        this.J0 = false;
        ai.j jVar = this.L0;
        if (jVar != null) {
            removeCallbacks(jVar);
            this.L0 = null;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.Q0;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        this.f26792w.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.P;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void w(int i10) {
        if (i10 == 2) {
            org.telegram.ui.Wallet.z4.u0(getContext(), this.f26780n, this.f30172a);
        } else if (i10 == 3) {
            Z();
        }
    }

    @Override
    public final void y() {
        if (!this.f26797y0) {
            return;
        }
        this.f26797y0 = false;
        float bottomYOnScreen = getBottomYOnScreen();
        FrameLayout frameLayout = this.f26774g0;
        frameLayout.setTranslationY(this.G0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        m7Var.setTranslationY(this.E0 - (W(m7Var) - m7Var.getTranslationY()));
        this.H0 = true;
        requestLayout();
    }

    @Override
    public final void z(int i10, boolean z10) {
        float f7;
        float bottomYOnScreen;
        float W;
        this.f26797y0 = true;
        this.H0 = false;
        this.f26798z0 = z10;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.f26795x0 = f7;
        if (this.A0) {
            bottomYOnScreen = this.B0;
        } else {
            bottomYOnScreen = getBottomYOnScreen();
        }
        this.F0 = bottomYOnScreen;
        boolean z11 = this.A0;
        org.telegram.ui.Wallet.m7 m7Var = this.v;
        if (z11) {
            W = this.C0;
        } else {
            W = W(m7Var);
        }
        this.D0 = W;
        this.G0 = getBottomYOnScreen() - this.f26774g0.getTranslationY();
        this.E0 = W(m7Var) - m7Var.getTranslationY();
        l0();
    }
}
