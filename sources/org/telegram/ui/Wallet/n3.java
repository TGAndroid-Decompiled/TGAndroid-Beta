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
import b8.mf;
import b8.pf;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hb0;
import org.telegram.ui.yg0;
public final class n3 extends Dialog {
    public static final int X = 0;
    public final RectF E;
    public final si.b F;
    public final eh.c G;
    public Bitmap H;
    public i0.b I;
    public float J;
    public float K;
    public boolean L;
    public final k4.j M;
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
    public final org.telegram.ui.ActionBar.d2 f42913a;
    public final hf0 f42914b;
    public final boolean f42915c;
    public final boolean d;
    public final boolean f42916e;
    public final RectF f42917f;
    public final l3 h;
    public final m3 f42918n;
    public final f6 f42919r;
    public final b8 f42920s;
    public final yg0 f42921w;
    public final TextView f42922x;
    public final Paint f42923y;

    public n3(org.telegram.ui.ActionBar.d2 d2Var, hf0 hf0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(d2Var.getParentActivity(), 2131755352);
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i3;
        int i10;
        int i11;
        String a02;
        RectF rectF = new RectF();
        this.f42917f = rectF;
        this.f42923y = new Paint(3);
        this.E = new RectF();
        si.b bVar = new si.b();
        this.F = bVar;
        this.I = i0.b.f14494e;
        this.M = new k4.j(24);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.f42913a = d2Var;
        this.f42914b = hf0Var;
        if (user != null && user.f27150id == h10.i(d2Var.getCurrentAccount()).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42916e = z10;
        if (user != null && !z10 && ((org.telegram.messenger.h0) hp.s1(d2Var.getCurrentAccount()).f23167x7.f24662j0.f13688b).f22814c) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42915c = z11;
        if (user != null && !z10 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        hf0Var.getLocationOnScreen(new int[2]);
        rectF.set(hf0Var.f32713w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.g0.S(getWindow());
        l3 l3Var = new l3(this, getContext());
        this.h = l3Var;
        m3 m3Var = new m3(this, getContext());
        this.f42918n = m3Var;
        m3Var.setAlpha(0.0f);
        l3Var.addView(m3Var, mf.c(-1.0f, -1));
        l3Var.setClipChildren(false);
        l3Var.setClipToPadding(false);
        l3Var.setOnClickListener(new h3(this, 0));
        c3 c3Var = new c3(this, 1);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(l3Var, c3Var);
        f6 f6Var = new f6(getContext());
        this.f42919r = f6Var;
        f6Var.setDiamondOnCard(true);
        int currentAccount = d2Var.getCurrentAccount();
        String p10 = l10.p(user);
        Locale locale = Locale.ROOT;
        f6Var.setCardHolder(p10.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            f6Var.setCardNumber(f6.d(cardVar.address.toUpperCase(locale)));
        }
        f6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = k0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            f6Var.P.c(m10, false, true);
        }
        f6Var.setCardOnClickListener(new hb0(24, this, d2Var));
        f6Var.setOnClickListener(new ai.t(27));
        f6Var.setAlpha(0.0f);
        l3Var.addView(f6Var, mf.c(-2.0f, -2));
        b8 b8Var = new b8(d2Var, f6Var, null, cardVar);
        this.f42920s = b8Var;
        l3Var.addView(b8Var, mf.c(-1.0f, -1));
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.G = cVar;
        cVar.h = new kh.k(l3Var);
        cVar.f9986i = l3Var;
        yg0 yg0Var = new yg0(getContext());
        this.f42921w = yg0Var;
        gh.g c2 = cVar.c(yg0Var, new hh.b(org.telegram.ui.ActionBar.k6.f27878d6, d2Var.getResourceProvider()), false);
        c2.q(org.telegram.messenger.g0.L(8.0f));
        c2.r(org.telegram.messenger.g0.L(22.0f));
        yg0Var.setBackground(c2);
        pf.b(yg0Var, 0.02f, 1.2f);
        gi.d dVar = new gi.d(getContext(), d2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        if (z10) {
            i3 = 2131743071;
        } else if (z11) {
            i3 = 2131743027;
        } else {
            i3 = 2131749284;
        }
        CharSequence M0 = bd.M0(i3, null);
        if (!z11) {
            dVar.i(M0, false, true);
            i10 = -1;
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            wp wpVar = new wp(2131231956, 0);
            wpVar.c(org.telegram.messenger.g0.L(20.0f));
            i10 = -1;
            wpVar.f40049y = -1;
            append.setSpan(wpVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        yg0Var.addView(dVar, mf.e(-2, i10, 17));
        yg0Var.setContentDescription(M0);
        yg0Var.setOnClickListener(new h1(this, d2Var, cardVar, 1));
        yg0Var.setAlpha(0.0f);
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        yg0Var.setVisibility(i11);
        l3Var.addView(yg0Var, mf.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f42922x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(bd.M0(2131743053, null));
        } else if (user != null) {
            String j10 = l10.j(user, true);
            if (new BigDecimal(k0.p(cardVar.balance, false)).signum() == 0) {
                a02 = bd.a0(null, null, 2131743055, j10);
            } else {
                a02 = bd.a0(null, null, 2131743056, j10, k0.l("Grams", f6.e(cardVar.balance).toString(), 2131749515).toString().replace(' ', (char) 160));
            }
            textView.setText(gi.l3.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        l3Var.addView(textView, mf.e(-2, -2, 49));
    }

    public final void a(float f10) {
        boolean z10;
        long j10;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i3 == 0 && this.U) {
            return;
        }
        if (i3 == 0) {
            this.U = true;
        }
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = z10;
        f6 f6Var = this.f42919r;
        f6Var.getClass();
        f6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f10);
        this.P = ofFloat;
        if (i3 == 0) {
            j10 = 650;
        } else {
            j10 = 380;
        }
        ofFloat.setDuration(j10);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new k3(this, 0));
        this.P.addListener(new org.telegram.ui.ActionBar.s0(this, f10, 6));
        this.P.start();
    }

    public final void b() {
        if (!this.T) {
            this.T = true;
            this.f42919r.setLayerType(0, null);
            this.f42914b.setEjectProgress(0.0f);
            super.dismiss();
            this.f42920s.p();
            this.F.a(null);
            this.H = null;
            if (this.V != null && this.f42913a.getParentActivity() != null) {
                Runnable runnable = this.V;
                this.V = null;
                org.telegram.messenger.g0.h3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f42915c && !this.d && !this.f42916e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i3;
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        Bitmap bitmap = this.H;
        TextView textView = this.f42922x;
        if (bitmap != null && !bitmap.isRecycled()) {
            l3 l3Var = this.h;
            if (l3Var.getWidth() > 0 && l3Var.getHeight() > 0) {
                q10 = org.telegram.messenger.g0.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) l3Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) l3Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q10) {
            i3 = -1;
        } else {
            i3 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.41f, i3));
    }

    @Override
    public final void dismiss() {
        if (!this.T && !this.S) {
            this.S = true;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f42921w.setEnabled(false);
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
        float interpolation = xq.f40453g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = xq.h.getInterpolation(max);
        if (this.L) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f10 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f10 = interpolation2;
        }
        f6 f6Var = this.f42919r;
        float width = f6Var.getWidth();
        float height = f6Var.getHeight();
        RectF rectF = this.f42917f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.g0.T1(max2, 1.0f, f10);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f12 = centerY - iArr[1];
        float f13 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f14 = width / 2.0f;
        float f15 = height / 2.0f;
        float T12 = org.telegram.messenger.g0.T1(centerX, f6Var.getLeft() + f14, f10);
        float T13 = org.telegram.messenger.g0.T1((f13 * interpolation) + (f12 - (f13 / 2.0f)), f6Var.getTop() + f15, f10);
        float f16 = 1.0f - f10;
        float f17 = (-90.0f) * f16;
        double d10 = f17;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f18 = centerX - T12;
        float f19 = f12 - T13;
        float f20 = sin * f19;
        float f21 = f19 * cos;
        float T14 = org.telegram.messenger.g0.T1(((f20 + (cos * f18)) / T1) + f14, f14, interpolation2);
        float T15 = org.telegram.messenger.g0.T1(((f21 + ((-sin) * f18)) / T1) + f15, f15, interpolation2);
        float f22 = T14 - f14;
        float f23 = T15 - f15;
        f6Var.setPivotX(T14);
        f6Var.setPivotY(T15);
        f6Var.setScaleX(T1);
        f6Var.setScaleY(T1);
        f6Var.setRotation(f17);
        f6Var.setRotationX(35.0f * f16);
        f6Var.setTranslationX((((cos * f22) - (sin * f23)) * T1) + ((T12 - f6Var.getLeft()) - T14));
        f6Var.setTranslationY((((cos * f23) + (sin * f22)) * T1) + ((T13 - f6Var.getTop()) - T15));
        if (this.J > 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        f6Var.setAlpha(f11);
        f6Var.setUseGyroscope(this.R * interpolation2);
        float f24 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f12 * f24);
        this.f42914b.setEjectProgress(interpolation);
        this.f42918n.setAlpha(this.J);
        this.f42920s.setAlpha(interpolation2);
        yg0 yg0Var = this.f42921w;
        yg0Var.setAlpha(interpolation2);
        TextView textView = this.f42922x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * f24);
        yg0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f24);
        yg0Var.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        yg0Var.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        l3 l3Var = this.h;
        setContentView(l3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        l3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.g0.o3(l3Var, !org.telegram.ui.ActionBar.k6.I.q());
        org.telegram.messenger.g0.s3(window, !org.telegram.ui.ActionBar.k6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        nk0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.y.c(this.h);
    }
}
