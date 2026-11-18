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
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.hh0;
public final class w3 extends Dialog {
    public static final int X = 0;
    public final RectF E;
    public final ui.b F;
    public final dh.c G;
    public Bitmap H;
    public i0.b I;
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
    public final org.telegram.ui.ActionBar.h2 f45200a;
    public final sf0 f45201b;
    public final boolean f45202c;
    public final boolean d;
    public final boolean f45203e;
    public final RectF f45204f;
    public final u3 h;
    public final v3 f45205n;
    public final x6 f45206r;
    public final r8 f45207s;
    public final hh0 f45208w;
    public final TextView f45209x;
    public final Paint f45210y;

    public w3(final org.telegram.ui.ActionBar.h2 h2Var, sf0 sf0Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(h2Var.getParentActivity(), 2131755352);
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i7;
        int i10;
        String a02;
        RectF rectF = new RectF();
        this.f45204f = rectF;
        this.f45210y = new Paint(3);
        this.E = new RectF();
        ui.b bVar = new ui.b();
        this.F = bVar;
        this.I = i0.b.f15891e;
        this.M = new h6.m(29);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.f45200a = h2Var;
        this.f45201b = sf0Var;
        if (user != null && user.f28554id == j10.i(h2Var.getCurrentAccount()).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45203e = z10;
        if (user != null && !z10 && ((org.telegram.messenger.h0) mp.u1(h2Var.getCurrentAccount()).A7.f26161p0.f14001b).f24339c) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45202c = z11;
        if (user != null && !z10 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        sf0Var.getLocationOnScreen(new int[2]);
        rectF.set(sf0Var.f37473w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.g0.S(getWindow());
        u3 u3Var = new u3(this, getContext());
        this.h = u3Var;
        v3 v3Var = new v3(this, getContext());
        this.f45205n = v3Var;
        v3Var.setAlpha(0.0f);
        u3Var.addView(v3Var, c8.ma.c(-1.0f, -1));
        u3Var.setClipChildren(false);
        u3Var.setClipToPadding(false);
        u3Var.setOnClickListener(new o3(this, 0));
        h3 h3Var = new h3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(u3Var, h3Var);
        x6 x6Var = new x6(getContext());
        this.f45206r = x6Var;
        x6Var.setDiamondOnCard(true);
        int currentAccount = h2Var.getCurrentAccount();
        String q10 = o10.q(user);
        Locale locale = Locale.ROOT;
        x6Var.setCardHolder(q10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            x6Var.setCardNumber(x6.d(cardVar.address.toUpperCase(locale)));
        }
        x6Var.j(currentAccount, cardVar.balance);
        CharSequence r10 = u0.D(currentAccount).r(cardVar.balance, false);
        if (!TextUtils.isEmpty(r10)) {
            x6Var.P.c(r10, false, true);
        }
        x6Var.setCardOnClickListener(new View.OnClickListener(this) {
            public final w3 f44983b;

            {
                this.f44983b = this;
            }

            @Override
            public final void onClick(View view) {
                p pVar;
                switch (r4) {
                    case 0:
                        w3 w3Var = this.f44983b;
                        if (!w3Var.S) {
                            boolean z13 = w3Var.f45203e;
                            org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                            if (z13) {
                                n6.N0(h2Var2.getCurrentAccount(), w3Var.getContext(), h2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = w3Var.getContext();
                                int currentAccount2 = h2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!w3Var.f45202c) {
                                    pVar = null;
                                } else {
                                    pVar = new p(w3Var, h2Var2, cardVar2, 10);
                                }
                                n6.O0(context, currentAccount2, str, false, pVar, h2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w3 w3Var2 = this.f44983b;
                        if (!w3Var2.S) {
                            boolean z14 = w3Var2.f45203e;
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var;
                            if (z14) {
                                w3Var2.V = new t3(0, h2Var3);
                            } else if (w3Var2.d) {
                                w3Var2.V = new t3(1, h2Var3);
                            } else if (w3Var2.f45202c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    w3Var2.V = new r3(h2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            w3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        x6Var.setOnClickListener(new bi.o(26));
        x6Var.setAlpha(0.0f);
        u3Var.addView(x6Var, c8.ma.c(-2.0f, -2));
        r8 r8Var = new r8(h2Var, x6Var, null, cardVar);
        this.f45207s = r8Var;
        u3Var.addView(r8Var, c8.ma.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new jh.k(u3Var);
        cVar.f8380i = u3Var;
        hh0 hh0Var = new hh0(getContext());
        this.f45208w = hh0Var;
        fh.g c10 = cVar.c(hh0Var, new gh.b(org.telegram.ui.ActionBar.n6.f29396d6, h2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        hh0Var.setBackground(c10);
        c8.ra.b(hh0Var, 0.02f, 1.2f);
        hi.d dVar = new hi.d(getContext(), h2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        if (z10) {
            i7 = 2131742803;
        } else if (z11) {
            i7 = 2131742759;
        } else {
            i7 = 2131749084;
        }
        CharSequence M0 = gd.M0(i7, null);
        if (!z11) {
            dVar.i(M0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            lq lqVar = new lq(2131231957, 0);
            lqVar.c(org.telegram.messenger.g0.L(20.0f));
            lqVar.f37202y = -1;
            append.setSpan(lqVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        hh0Var.addView(dVar, c8.ma.e(-2, -1, 17));
        hh0Var.setContentDescription(M0);
        hh0Var.setOnClickListener(new View.OnClickListener(this) {
            public final w3 f44983b;

            {
                this.f44983b = this;
            }

            @Override
            public final void onClick(View view) {
                p pVar;
                switch (r4) {
                    case 0:
                        w3 w3Var = this.f44983b;
                        if (!w3Var.S) {
                            boolean z13 = w3Var.f45203e;
                            org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                            if (z13) {
                                n6.N0(h2Var2.getCurrentAccount(), w3Var.getContext(), h2Var2.getResourceProvider());
                                return;
                            }
                            TL_wallet.card cardVar2 = cardVar;
                            if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = w3Var.getContext();
                                int currentAccount2 = h2Var2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!w3Var.f45202c) {
                                    pVar = null;
                                } else {
                                    pVar = new p(w3Var, h2Var2, cardVar2, 10);
                                }
                                n6.O0(context, currentAccount2, str, false, pVar, h2Var2.getResourceProvider());
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w3 w3Var2 = this.f44983b;
                        if (!w3Var2.S) {
                            boolean z14 = w3Var2.f45203e;
                            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var;
                            if (z14) {
                                w3Var2.V = new t3(0, h2Var3);
                            } else if (w3Var2.d) {
                                w3Var2.V = new t3(1, h2Var3);
                            } else if (w3Var2.f45202c) {
                                TL_wallet.card cardVar3 = cardVar;
                                if (!TextUtils.isEmpty(cardVar3.address)) {
                                    w3Var2.V = new r3(h2Var3, cardVar3, 1);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                            w3Var2.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        hh0Var.setAlpha(0.0f);
        if (c()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hh0Var.setVisibility(i10);
        u3Var.addView(hh0Var, c8.ma.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f45209x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(gd.M0(2131742785, null));
        } else if (user != null) {
            String k10 = o10.k(user, true);
            if (new BigDecimal(u0.u(cardVar.balance, false)).signum() == 0) {
                a02 = gd.a0(null, null, 2131742787, k10);
            } else {
                a02 = gd.a0(null, null, 2131742788, k10, u0.q("Grams", x6.e(cardVar.balance).toString(), 2131749315).toString().replace(' ', (char) 160));
            }
            textView.setText(hi.m3.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        u3Var.addView(textView, c8.ma.e(-2, -2, 49));
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
        x6 x6Var = this.f45206r;
        x6Var.getClass();
        x6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        if (i7 == 0) {
            j3 = 650;
        } else {
            j3 = 380;
        }
        ofFloat.setDuration(j3);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new p3(this, 1));
        this.P.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 7));
        this.P.start();
    }

    public final void b() {
        if (!this.T) {
            this.T = true;
            this.f45206r.setLayerType(0, null);
            this.f45201b.setEjectProgress(0.0f);
            super.dismiss();
            this.f45207s.p();
            this.F.a(null);
            this.H = null;
            if (this.V != null && this.f45200a.getParentActivity() != null) {
                Runnable runnable = this.V;
                this.V = null;
                org.telegram.messenger.g0.g3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f45202c && !this.d && !this.f45203e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        boolean q10 = org.telegram.ui.ActionBar.n6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.f45209x;
        if (bitmap != null && !bitmap.isRecycled()) {
            u3 u3Var = this.h;
            if (u3Var.getWidth() > 0 && u3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) u3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) u3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
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
            this.f45208w.setEnabled(false);
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
        float interpolation = lr.f37209g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = lr.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        x6 x6Var = this.f45206r;
        float width = x6Var.getWidth();
        float height = x6Var.getHeight();
        RectF rectF = this.f45204f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f12 = centerY - iArr[1];
        float f13 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f14 = width / 2.0f;
        float f15 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, x6Var.getLeft() + f14, f10);
        float T13 = org.telegram.messenger.g0.T1((f13 * interpolation) + (f12 - (f13 / 2.0f)), x6Var.getTop() + f15, f10);
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
        x6Var.setPivotX(T14);
        x6Var.setPivotY(T15);
        x6Var.setScaleX(T1);
        x6Var.setScaleY(T1);
        x6Var.setRotation(f17);
        x6Var.setRotationX(35.0f * f16);
        x6Var.setTranslationX((((cos * f20) - (sin * f21)) * T1) + ((T12 - x6Var.getLeft()) - T14));
        x6Var.setTranslationY(org.telegram.ui.Cells.c0.g(cos, f21, sin * f20, T1, (T13 - x6Var.getTop()) - T15));
        if (this.J > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        x6Var.setAlpha(f11);
        x6Var.setUseGyroscope(this.R * interpolation2);
        float f22 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f12 * f22);
        this.f45201b.setEjectProgress(interpolation);
        this.f45205n.setAlpha(this.J);
        this.f45207s.setAlpha(interpolation2);
        hh0 hh0Var = this.f45208w;
        hh0Var.setAlpha(interpolation2);
        TextView textView = this.f45209x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f22);
        hh0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f22);
        hh0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        hh0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        u3 u3Var = this.h;
        setContentView(u3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        u3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.n3(u3Var, !org.telegram.ui.ActionBar.n6.I.q());
        org.telegram.messenger.g0.r3(window, !org.telegram.ui.ActionBar.n6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        wk0.d(new e(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.y.c(this.h);
    }
}
