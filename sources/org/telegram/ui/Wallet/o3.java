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
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.eh0;
public final class o3 extends Dialog {
    public static final int X = 0;
    public final RectF E;
    public final ui.b F;
    public final dh.c G;
    public Bitmap H;
    public i0.c I;
    public float J;
    public float K;
    public boolean L;
    public final h6.m M;
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
    public final org.telegram.ui.ActionBar.e2 f44223a;
    public final if0 f44224b;
    public final boolean f44225c;
    public final boolean d;
    public final boolean f44226e;
    public final RectF f44227f;
    public final m3 h;
    public final n3 f44228n;
    public final h6 f44229r;
    public final c8 f44230s;
    public final eh0 f44231w;
    public final TextView f44232x;
    public final Paint f44233y;

    public o3(final org.telegram.ui.ActionBar.e2 e2Var, if0 if0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(e2Var.getParentActivity(), 2131755352);
        String a02;
        RectF rectF = new RectF();
        this.f44227f = rectF;
        this.f44233y = new Paint(3);
        this.E = new RectF();
        ui.b bVar = new ui.b();
        this.F = bVar;
        this.I = i0.c.f15573e;
        this.M = new h6.m(29);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.f44223a = e2Var;
        this.f44224b = if0Var;
        boolean z10 = user != null && user.f28200id == m10.i(e2Var.getCurrentAccount()).e();
        this.f44226e = z10;
        boolean z11 = (user == null || z10 || !((org.telegram.messenger.h0) np.s1(e2Var.getCurrentAccount()).f25448y7.f25852j0.f14544b).f24006c) ? false : true;
        this.f44225c = z11;
        this.d = (user == null || z10 || z11) ? false : true;
        int[] iArr = new int[2];
        if0Var.getLocationOnScreen(iArr);
        rectF.set(if0Var.f33563w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.g0.S(getWindow());
        m3 m3Var = new m3(this, getContext());
        this.h = m3Var;
        n3 n3Var = new n3(this, getContext());
        this.f44228n = n3Var;
        n3Var.setAlpha(0.0f);
        m3Var.addView(n3Var, c8.ja.c(-1.0f, -1));
        m3Var.setClipChildren(false);
        m3Var.setClipToPadding(false);
        m3Var.setOnClickListener(new g3(this, 0));
        b3 b3Var = new b3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(m3Var, b3Var);
        h6 h6Var = new h6(getContext());
        this.f44229r = h6Var;
        h6Var.setDiamondOnCard(true);
        int currentAccount = e2Var.getCurrentAccount();
        String p10 = q10.p(user);
        Locale locale = Locale.ROOT;
        h6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            h6Var.setCardNumber(h6.d(cardVar.address.toUpperCase(locale)));
        }
        h6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = l0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            h6Var.P.c(m10, false, true);
        }
        h6Var.setCardOnClickListener(new View.OnClickListener(this) {
            public final o3 f44064b;

            {
                this.f44064b = this;
            }

            @Override
            public final void onClick(View view) {
                g gVar;
                switch (r4) {
                    case 0:
                        o3 o3Var = this.f44064b;
                        if (!o3Var.S) {
                            boolean z12 = o3Var.f44226e;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (z12) {
                                y5.J0(e2Var2.getCurrentAccount(), o3Var.getContext(), e2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = o3Var.getContext();
                                int currentAccount2 = e2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!o3Var.f44225c) {
                                    gVar = null;
                                } else {
                                    gVar = new g(o3Var, e2Var2, cardVar2, 10);
                                }
                                y5.K0(context, currentAccount2, str, false, gVar, e2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f44064b;
                        if (!o3Var2.S) {
                            boolean z13 = o3Var2.f44226e;
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            if (z13) {
                                o3Var2.V = new l3(0, e2Var3);
                            } else if (o3Var2.d) {
                                o3Var2.V = new l3(1, e2Var3);
                            } else if (o3Var2.f44225c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    o3Var2.V = new j3(e2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            o3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        h6Var.setOnClickListener(new bi.o(24));
        h6Var.setAlpha(0.0f);
        m3Var.addView(h6Var, c8.ja.c(-2.0f, -2));
        c8 c8Var = new c8(e2Var, h6Var, null, cardVar);
        this.f44230s = c8Var;
        m3Var.addView(c8Var, c8.ja.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(m3Var);
        cVar.f8095i = m3Var;
        eh0 eh0Var = new eh0(getContext());
        this.f44231w = eh0Var;
        fh.g c10 = cVar.c(eh0Var, new gh.b(org.telegram.ui.ActionBar.j6.f28849d6, e2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        eh0Var.setBackground(c10);
        c8.na.b(eh0Var, 0.02f, 1.2f);
        hi.d dVar = new hi.d(getContext(), e2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = hd.M0(z10 ? 2131743061 : z11 ? 2131743017 : 2131749276, null);
        if (!z11) {
            dVar.i(M0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            eq eqVar = new eq(2131231956, 0);
            eqVar.c(org.telegram.messenger.g0.L(20.0f));
            eqVar.f34419y = -1;
            append.setSpan(eqVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        eh0Var.addView(dVar, c8.ja.e(-2, -1, 17));
        eh0Var.setContentDescription(M0);
        eh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f44064b;

            {
                this.f44064b = this;
            }

            @Override
            public final void onClick(View view) {
                g gVar;
                switch (r4) {
                    case 0:
                        o3 o3Var = this.f44064b;
                        if (!o3Var.S) {
                            boolean z12 = o3Var.f44226e;
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            if (z12) {
                                y5.J0(e2Var2.getCurrentAccount(), o3Var.getContext(), e2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = o3Var.getContext();
                                int currentAccount2 = e2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!o3Var.f44225c) {
                                    gVar = null;
                                } else {
                                    gVar = new g(o3Var, e2Var2, cardVar2, 10);
                                }
                                y5.K0(context, currentAccount2, str, false, gVar, e2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f44064b;
                        if (!o3Var2.S) {
                            boolean z13 = o3Var2.f44226e;
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            if (z13) {
                                o3Var2.V = new l3(0, e2Var3);
                            } else if (o3Var2.d) {
                                o3Var2.V = new l3(1, e2Var3);
                            } else if (o3Var2.f44225c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    o3Var2.V = new j3(e2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            o3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        eh0Var.setAlpha(0.0f);
        eh0Var.setVisibility(c() ? 0 : 8);
        m3Var.addView(eh0Var, c8.ja.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f44232x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(hd.M0(2131743043, null));
        } else if (user != null) {
            String j3 = q10.j(user, true);
            if (new BigDecimal(l0.p(cardVar.balance, false)).signum() == 0) {
                a02 = hd.a0(null, null, 2131743045, j3);
            } else {
                a02 = hd.a0(null, null, 2131743046, j3, l0.l("Grams", h6.e(cardVar.balance).toString(), 2131749507).toString().replace(' ', (char) 160));
            }
            textView.setText(hi.l3.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        m3Var.addView(textView, c8.ja.e(-2, -2, 49));
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
        h6 h6Var = this.f44229r;
        h6Var.getClass();
        h6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        if (i7 == 0) {
            j3 = 650;
        } else {
            j3 = 380;
        }
        ofFloat.setDuration(j3);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new h3(this, 1));
        this.P.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 6));
        this.P.start();
    }

    public final void b() {
        if (!this.T) {
            this.T = true;
            this.f44229r.setLayerType(0, null);
            this.f44224b.setEjectProgress(0.0f);
            super.dismiss();
            this.f44230s.p();
            this.F.a(null);
            this.H = null;
            if (this.V != null && this.f44223a.getParentActivity() != null) {
                Runnable runnable = this.V;
                this.V = null;
                org.telegram.messenger.g0.h3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f44225c && !this.d && !this.f44226e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        boolean q10 = org.telegram.ui.ActionBar.j6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.f44232x;
        if (bitmap != null && !bitmap.isRecycled()) {
            m3 m3Var = this.h;
            if (m3Var.getWidth() > 0 && m3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) m3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) m3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q10) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.41f, i7));
    }

    @Override
    public final void dismiss() {
        if (!this.T && !this.S) {
            this.S = true;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f44231w.setEnabled(false);
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
        float interpolation = er.f34421g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = er.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        h6 h6Var = this.f44229r;
        float width = h6Var.getWidth();
        float height = h6Var.getHeight();
        RectF rectF = this.f44227f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f12 = centerY - iArr[1];
        float f13 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f14 = width / 2.0f;
        float f15 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, h6Var.getLeft() + f14, f10);
        float T13 = org.telegram.messenger.g0.T1((f13 * interpolation) + (f12 - (f13 / 2.0f)), h6Var.getTop() + f15, f10);
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
        h6Var.setPivotX(T14);
        h6Var.setPivotY(T15);
        h6Var.setScaleX(T1);
        h6Var.setScaleY(T1);
        h6Var.setRotation(f17);
        h6Var.setRotationX(35.0f * f16);
        h6Var.setTranslationX((((cos * f20) - (sin * f21)) * T1) + ((T12 - h6Var.getLeft()) - T14));
        h6Var.setTranslationY(org.telegram.ui.Cells.y0.f(cos, f21, sin * f20, T1, (T13 - h6Var.getTop()) - T15));
        if (this.J > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        h6Var.setAlpha(f11);
        h6Var.setUseGyroscope(this.R * interpolation2);
        float f22 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f12 * f22);
        this.f44224b.setEjectProgress(interpolation);
        this.f44228n.setAlpha(this.J);
        this.f44230s.setAlpha(interpolation2);
        eh0 eh0Var = this.f44231w;
        eh0Var.setAlpha(interpolation2);
        TextView textView = this.f44232x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f22);
        eh0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f22);
        eh0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        eh0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        m3 m3Var = this.h;
        setContentView(m3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        m3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(m3Var, !org.telegram.ui.ActionBar.j6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.j6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        ok0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.y.c(this.h);
    }
}
