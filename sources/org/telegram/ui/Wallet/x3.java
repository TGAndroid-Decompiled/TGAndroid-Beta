package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.gh0;
public final class x3 extends Dialog {
    public static final int X = 0;
    public final RectF E;
    public final ui.b F;
    public final dh.c G;
    public Bitmap H;
    public i0.b I;
    public float J;
    public float K;
    public boolean L;
    public final i61 M;
    public final RectF N;
    public final RectF O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.g2 f45372a;
    public final tf0 f45373b;
    public final boolean f45374c;
    public final boolean d;
    public final boolean f45375e;
    public final RectF f45376f;
    public final v3 h;
    public final w3 f45377n;
    public final y6 f45378r;
    public final s8 f45379s;
    public final gh0 f45380w;
    public final TextView f45381x;
    public final Paint f45382y;

    public x3(final org.telegram.ui.ActionBar.g2 g2Var, tf0 tf0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(g2Var.getParentActivity(), 2131755352);
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i7;
        int i10;
        String a02;
        RectF rectF = new RectF();
        this.f45376f = rectF;
        this.f45382y = new Paint(3);
        this.E = new RectF();
        ui.b bVar = new ui.b();
        this.F = bVar;
        this.I = i0.b.f15977e;
        this.M = new i61(1);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.f45372a = g2Var;
        this.f45373b = tf0Var;
        if (user != null && user.f28641id == i10.i(g2Var.getCurrentAccount()).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45375e = z10;
        if (user != null && !z10 && ((org.telegram.messenger.h0) mp.u1(g2Var.getCurrentAccount()).A7.f26254p0.f17372b).f24439c) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45374c = z11;
        if (user != null && !z10 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        tf0Var.getLocationOnScreen(new int[2]);
        rectF.set(tf0Var.f37792w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.g0.S(getWindow());
        v3 v3Var = new v3(this, getContext());
        this.h = v3Var;
        w3 w3Var = new w3(this, getContext());
        this.f45377n = w3Var;
        w3Var.setAlpha(0.0f);
        v3Var.addView(w3Var, c8.na.c(-1.0f, -1));
        v3Var.setClipChildren(false);
        v3Var.setClipToPadding(false);
        v3Var.setOnClickListener(new p3(this, 0));
        i3 i3Var = new i3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(v3Var, i3Var);
        y6 y6Var = new y6(getContext());
        this.f45378r = y6Var;
        y6Var.setDiamondOnCard(true);
        int currentAccount = g2Var.getCurrentAccount();
        String q10 = n10.q(user);
        Locale locale = Locale.ROOT;
        y6Var.setCardHolder(q10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            y6Var.setCardNumber(y6.d(cardVar.address.toUpperCase(locale)));
        }
        y6Var.j(currentAccount, cardVar.balance);
        CharSequence r10 = v0.D(currentAccount).r(cardVar.balance, false);
        if (!TextUtils.isEmpty(r10)) {
            y6Var.P.c(r10, false, true);
        }
        y6Var.setCardOnClickListener(new View.OnClickListener(this) {
            public final x3 f45155b;

            {
                this.f45155b = this;
            }

            @Override
            public final void onClick(View view) {
                p pVar;
                switch (r4) {
                    case 0:
                        x3 x3Var = this.f45155b;
                        if (!x3Var.S) {
                            boolean z13 = x3Var.f45375e;
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            if (z13) {
                                o6.N0(g2Var2.getCurrentAccount(), x3Var.getContext(), g2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = x3Var.getContext();
                                int currentAccount2 = g2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!x3Var.f45374c) {
                                    pVar = null;
                                } else {
                                    pVar = new p(x3Var, g2Var2, cardVar2, 10);
                                }
                                o6.O0(context, currentAccount2, str, false, pVar, g2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        x3 x3Var2 = this.f45155b;
                        if (!x3Var2.S) {
                            boolean z14 = x3Var2.f45375e;
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            if (z14) {
                                x3Var2.V = new u3(0, g2Var3);
                            } else if (x3Var2.d) {
                                x3Var2.V = new u3(1, g2Var3);
                            } else if (x3Var2.f45374c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    x3Var2.V = new s3(g2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            x3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        y6Var.setOnClickListener(new bi.o(26));
        y6Var.setAlpha(0.0f);
        v3Var.addView(y6Var, c8.na.c(-2.0f, -2));
        s8 s8Var = new s8(g2Var, y6Var, null, cardVar);
        this.f45379s = s8Var;
        v3Var.addView(s8Var, c8.na.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(v3Var);
        cVar.f8371i = v3Var;
        gh0 gh0Var = new gh0(getContext());
        this.f45380w = gh0Var;
        fh.g c10 = cVar.c(gh0Var, new gh.b(org.telegram.ui.ActionBar.n6.f29451d6, g2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        gh0Var.setBackground(c10);
        c8.sa.b(gh0Var, 0.02f, 1.2f);
        hi.e eVar = new hi.e(getContext(), g2Var.getResourceProvider(), true);
        eVar.setUseWrapContent(true);
        eVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        eVar.setRoundRadius(19);
        if (z10) {
            i7 = 2131742790;
        } else if (z11) {
            i7 = 2131742746;
        } else {
            i7 = 2131749083;
        }
        CharSequence N0 = gd.N0(i7, null);
        if (!z11) {
            eVar.i(N0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(N0);
            kq kqVar = new kq(2131231960, 0);
            kqVar.c(org.telegram.messenger.g0.L(20.0f));
            kqVar.f36857y = -1;
            append.setSpan(kqVar, 0, 1, 33);
            eVar.i(append, false, true);
        }
        eVar.setStateListAnimator(null);
        gh0Var.addView(eVar, c8.na.e(-2, -1, 17));
        gh0Var.setContentDescription(N0);
        gh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final x3 f45155b;

            {
                this.f45155b = this;
            }

            @Override
            public final void onClick(View view) {
                p pVar;
                switch (r4) {
                    case 0:
                        x3 x3Var = this.f45155b;
                        if (!x3Var.S) {
                            boolean z13 = x3Var.f45375e;
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            if (z13) {
                                o6.N0(g2Var2.getCurrentAccount(), x3Var.getContext(), g2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = x3Var.getContext();
                                int currentAccount2 = g2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!x3Var.f45374c) {
                                    pVar = null;
                                } else {
                                    pVar = new p(x3Var, g2Var2, cardVar2, 10);
                                }
                                o6.O0(context, currentAccount2, str, false, pVar, g2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        x3 x3Var2 = this.f45155b;
                        if (!x3Var2.S) {
                            boolean z14 = x3Var2.f45375e;
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            if (z14) {
                                x3Var2.V = new u3(0, g2Var3);
                            } else if (x3Var2.d) {
                                x3Var2.V = new u3(1, g2Var3);
                            } else if (x3Var2.f45374c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    x3Var2.V = new s3(g2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            x3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        gh0Var.setAlpha(0.0f);
        if (c()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gh0Var.setVisibility(i10);
        v3Var.addView(gh0Var, c8.na.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f45381x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(gd.N0(2131742772, null));
        } else if (user != null) {
            String k10 = n10.k(user, true);
            if (new BigDecimal(v0.u(cardVar.balance, false)).signum() == 0) {
                a02 = gd.a0(null, null, 2131742774, k10);
            } else {
                a02 = gd.a0(null, null, 2131742775, k10, v0.q("Grams", y6.e(cardVar.balance).toString(), 2131749314).toString().replace(' ', (char) 160));
            }
            textView.setText(hi.u3.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        v3Var.addView(textView, c8.na.e(-2, -2, 49));
    }

    public final void a(float f10) {
        boolean z10;
        long j3;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i7 == 0 && this.U) {
            return;
        }
        if (i7 == 0) {
            this.U = true;
        }
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        y6 y6Var = this.f45378r;
        y6Var.getClass();
        y6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        if (i7 == 0) {
            j3 = 650;
        } else {
            j3 = 380;
        }
        ofFloat.setDuration(j3);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new q3(this, 1));
        this.P.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 7));
        this.P.start();
    }

    public final void b() {
        if (!this.T) {
            this.T = true;
            this.f45378r.setLayerType(0, null);
            this.f45373b.setEjectProgress(0.0f);
            super.dismiss();
            this.f45379s.p();
            this.F.a(null);
            this.H = null;
            if (this.V != null && this.f45372a.getParentActivity() != null) {
                Runnable runnable = this.V;
                this.V = null;
                org.telegram.messenger.g0.g3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f45374c && !this.d && !this.f45375e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.f45381x;
        if (bitmap != null && !bitmap.isRecycled()) {
            v3 v3Var = this.h;
            if (v3Var.getWidth() > 0 && v3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) v3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) v3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q10) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.41f, i7));
    }

    @Override
    public final void dismiss() {
        if (!this.T && !this.S) {
            this.S = true;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f45380w.setEnabled(false);
            if (this.h.isAttachedToWindow() && this.J != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    public final void e() {
        float f10;
        float f11;
        float interpolation = kr.f36859g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = kr.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        y6 y6Var = this.f45378r;
        float width = y6Var.getWidth();
        float height = y6Var.getHeight();
        RectF rectF = this.f45376f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f12 = centerY - iArr[1];
        float f13 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f14 = width / 2.0f;
        float f15 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, y6Var.getLeft() + f14, f10);
        float T13 = org.telegram.messenger.g0.T1((f13 * interpolation) + (f12 - (f13 / 2.0f)), y6Var.getTop() + f15, f10);
        float f16 = 1.0f - f10;
        float f17 = (-90.0f) * f16;
        double d2 = f17;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f18 = centerX - T12;
        float f19 = f12 - T13;
        float T14 = org.telegram.messenger.g0.T1((((sin * f19) + (cos * f18)) / T1) + f14, f14, interpolation2);
        float T15 = org.telegram.messenger.g0.T1((((cos * f19) + ((-sin) * f18)) / T1) + f15, f15, interpolation2);
        float f20 = T14 - f14;
        float f21 = T15 - f15;
        y6Var.setPivotX(T14);
        y6Var.setPivotY(T15);
        y6Var.setScaleX(T1);
        y6Var.setScaleY(T1);
        y6Var.setRotation(f17);
        y6Var.setRotationX(35.0f * f16);
        y6Var.setTranslationX((((cos * f20) - (sin * f21)) * T1) + ((T12 - y6Var.getLeft()) - T14));
        y6Var.setTranslationY(org.telegram.ui.Cells.c0.g(cos, f21, sin * f20, T1, (T13 - y6Var.getTop()) - T15));
        if (this.J > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        y6Var.setAlpha(f11);
        y6Var.setUseGyroscope(this.R * interpolation2);
        float f22 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f12 * f22);
        this.f45373b.setEjectProgress(interpolation);
        this.f45377n.setAlpha(this.J);
        this.f45379s.setAlpha(interpolation2);
        gh0 gh0Var = this.f45380w;
        gh0Var.setAlpha(interpolation2);
        TextView textView = this.f45381x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f22);
        gh0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f22);
        gh0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        gh0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        v3 v3Var = this.h;
        setContentView(v3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        v3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.n3(v3Var, !org.telegram.ui.ActionBar.n6.I.q());
        org.telegram.messenger.g0.r3(window, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        yk0.d(new e(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.y.c(this.h);
    }
}
