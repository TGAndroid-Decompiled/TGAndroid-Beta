package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fk0;
import org.telegram.ui.sq0;
public final class o3 extends Dialog {
    public static final int W = 0;
    public final RectF D;
    public final ri.b E;
    public final dh.c F;
    public Bitmap G;
    public i0.b H;
    public float I;
    public float J;
    public boolean K;
    public final h6.m L;
    public final RectF M;
    public final RectF N;
    public ValueAnimator O;
    public ValueAnimator P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Runnable U;
    public final int[] V;
    public final org.telegram.ui.ActionBar.f2 f42942a;
    public final ff0 f42943b;
    public final boolean f42944c;
    public final boolean d;
    public final boolean f42945e;
    public final RectF f42946f;
    public final m3 h;
    public final n3 f42947n;
    public final g6 f42948r;
    public final b8 f42949s;
    public final sq0 f42950w;
    public final TextView f42951x;
    public final Paint f42952y;

    public o3(org.telegram.ui.ActionBar.f2 f2Var, ff0 ff0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(f2Var.getParentActivity(), 2131755352);
        String a02;
        RectF rectF = new RectF();
        this.f42946f = rectF;
        this.f42952y = new Paint(3);
        this.D = new RectF();
        ri.b bVar = new ri.b();
        this.E = bVar;
        this.H = i0.b.f15119e;
        this.L = new h6.m(28);
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.f42942a = f2Var;
        this.f42943b = ff0Var;
        boolean z9 = user != null && user.f27105id == p10.i(f2Var.getCurrentAccount()).e();
        this.f42945e = z9;
        boolean z10 = (user == null || z9 || !((org.telegram.messenger.h0) qp.s1(f2Var.getCurrentAccount()).f24942x7.f24446j0.f13889b).f22780c) ? false : true;
        this.f42944c = z10;
        this.d = (user == null || z9 || z10) ? false : true;
        int[] iArr = new int[2];
        ff0Var.getLocationOnScreen(iArr);
        rectF.set(ff0Var.f40982w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.g0.S(getWindow());
        m3 m3Var = new m3(this, getContext());
        this.h = m3Var;
        n3 n3Var = new n3(this, getContext());
        this.f42947n = n3Var;
        n3Var.setAlpha(0.0f);
        m3Var.addView(n3Var, c8.ha.c(-1.0f, -1));
        m3Var.setClipChildren(false);
        m3Var.setClipToPadding(false);
        m3Var.setOnClickListener(new i3(this, 0));
        d3 d3Var = new d3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54191a;
        r0.a0.i(m3Var, d3Var);
        g6 g6Var = new g6(getContext());
        this.f42948r = g6Var;
        g6Var.setDiamondOnCard(true);
        int currentAccount = f2Var.getCurrentAccount();
        String p10 = t10.p(user);
        Locale locale = Locale.ROOT;
        g6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            g6Var.setCardNumber(g6.d(cardVar.address.toUpperCase(locale)));
        }
        g6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = m0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            g6Var.O.c(m10, false, true);
        }
        g6Var.setCardOnClickListener(new fk0(18, this, f2Var));
        g6Var.setOnClickListener(new bi.l1(21));
        g6Var.setAlpha(0.0f);
        m3Var.addView(g6Var, c8.ha.c(-2.0f, -2));
        b8 b8Var = new b8(f2Var, g6Var, null, cardVar);
        this.f42949s = b8Var;
        m3Var.addView(b8Var, c8.ha.c(-1.0f, -1));
        dh.c cVar = new dh.c(bVar, bVar, bVar);
        this.F = cVar;
        cVar.h = new jh.k(m3Var);
        cVar.f8708i = m3Var;
        sq0 sq0Var = new sq0(getContext());
        this.f42950w = sq0Var;
        fh.g c10 = cVar.c(sq0Var, new gh.b(org.telegram.ui.ActionBar.k6.f27852d6, f2Var.getResourceProvider()), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        sq0Var.setBackground(c10);
        c8.ka.b(sq0Var, 0.02f, 1.2f);
        fi.d dVar = new fi.d(getContext(), f2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        CharSequence M0 = id.M0(z9 ? 2131743064 : z10 ? 2131743020 : 2131749277, null);
        if (!z10) {
            dVar.i(M0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            wp wpVar = new wp(2131231956, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            wpVar.f40024y = -1;
            append.setSpan(wpVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        sq0Var.addView(dVar, c8.ha.e(-2, -1, 17));
        sq0Var.setContentDescription(M0);
        sq0Var.setOnClickListener(new j1(this, f2Var, cardVar, 1));
        sq0Var.setAlpha(0.0f);
        sq0Var.setVisibility(c() ? 0 : 8);
        m3Var.addView(sq0Var, c8.ha.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f42951x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z9) {
            textView.setText(id.M0(2131743046, null));
        } else if (user != null) {
            String j3 = t10.j(user, true);
            if (new BigDecimal(m0.p(cardVar.balance, false)).signum() == 0) {
                a02 = id.a0(null, null, 2131743048, j3);
            } else {
                a02 = id.a0(null, null, 2131743049, j3, m0.l("Grams", g6.e(cardVar.balance).toString(), 2131749508).toString().replace(' ', (char) 160));
            }
            textView.setText(fi.m3.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        m3Var.addView(textView, c8.ha.e(-2, -2, 49));
    }

    public final void a(float f10) {
        boolean z9;
        long j3;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i7 == 0 && this.T) {
            return;
        }
        if (i7 == 0) {
            this.T = true;
        }
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.K = z9;
        g6 g6Var = this.f42948r;
        g6Var.getClass();
        g6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f10);
        this.O = ofFloat;
        if (i7 == 0) {
            j3 = 650;
        } else {
            j3 = 380;
        }
        ofFloat.setDuration(j3);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new l3(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.t0(this, f10, 6));
        this.O.start();
    }

    public final void b() {
        if (!this.S) {
            this.S = true;
            this.f42948r.setLayerType(0, null);
            this.f42943b.setEjectProgress(0.0f);
            super.dismiss();
            this.f42949s.p();
            this.E.a(null);
            this.G = null;
            if (this.U != null && this.f42942a.getParentActivity() != null) {
                Runnable runnable = this.U;
                this.U = null;
                org.telegram.messenger.g0.h3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f42944c && !this.d && !this.f42945e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.f42951x;
        if (bitmap != null && !bitmap.isRecycled()) {
            m3 m3Var = this.h;
            if (m3Var.getWidth() > 0 && m3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) m3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) m3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q10) {
            i7 = -1;
        } else {
            i7 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.41f, i7));
    }

    @Override
    public final void dismiss() {
        if (!this.S && !this.R) {
            this.R = true;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42950w.setEnabled(false);
            if (this.h.isAttachedToWindow() && this.I != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    public final void e() {
        float f10;
        float f11;
        float interpolation = xq.f40367g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = xq.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        g6 g6Var = this.f42948r;
        float width = g6Var.getWidth();
        float height = g6Var.getHeight();
        RectF rectF = this.f42946f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f12 = centerY - iArr[1];
        float f13 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f14 = width / 2.0f;
        float f15 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, g6Var.getLeft() + f14, f10);
        float T13 = org.telegram.messenger.g0.T1((f13 * interpolation) + (f12 - (f13 / 2.0f)), g6Var.getTop() + f15, f10);
        float f16 = 1.0f - f10;
        float f17 = (-90.0f) * f16;
        double d2 = f17;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f18 = centerX - T12;
        float f19 = f12 - T13;
        float f20 = sin * f19;
        float f21 = f19 * cos;
        float T14 = org.telegram.messenger.g0.T1(((f20 + (cos * f18)) / T1) + f14, f14, interpolation2);
        float T15 = org.telegram.messenger.g0.T1(((f21 + ((-sin) * f18)) / T1) + f15, f15, interpolation2);
        float f22 = T14 - f14;
        float f23 = T15 - f15;
        g6Var.setPivotX(T14);
        g6Var.setPivotY(T15);
        g6Var.setScaleX(T1);
        g6Var.setScaleY(T1);
        g6Var.setRotation(f17);
        g6Var.setRotationX(35.0f * f16);
        g6Var.setTranslationX((((cos * f22) - (sin * f23)) * T1) + ((T12 - g6Var.getLeft()) - T14));
        g6Var.setTranslationY((((cos * f23) + (sin * f22)) * T1) + ((T13 - g6Var.getTop()) - T15));
        if (this.I > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        g6Var.setAlpha(f11);
        g6Var.setUseGyroscope(this.Q * interpolation2);
        float f24 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f12 * f24);
        this.f42943b.setEjectProgress(interpolation);
        this.f42947n.setAlpha(this.I);
        this.f42949s.setAlpha(interpolation2);
        sq0 sq0Var = this.f42950w;
        sq0Var.setAlpha(interpolation2);
        TextView textView = this.f42951x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f24);
        sq0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f24);
        sq0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        sq0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
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
        org.telegram.messenger.g0.o3(m3Var, !org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        jk0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f54191a;
        r0.y.c(this.h);
    }
}
