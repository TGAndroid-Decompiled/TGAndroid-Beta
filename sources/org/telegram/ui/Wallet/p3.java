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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.bg0;
import org.telegram.ui.qv0;
public final class p3 extends Dialog {
    public static final int W = 0;
    public final RectF D;
    public final hi.b E;
    public final tg.b F;
    public Bitmap G;
    public i0.c H;
    public float I;
    public float J;
    public boolean K;
    public final li.k L;
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
    public final org.telegram.ui.ActionBar.k2 f35016a;
    public final ig0 f35017b;
    public final boolean f35018c;
    public final boolean d;
    public final boolean e;
    public final RectF f35019f;
    public final n3 h;
    public final o3 f35020n;
    public final l6 f35021r;
    public final h8 f35022s;
    public final bg0 f35023w;
    public final TextView f35024x;
    public final Paint f35025y;

    public p3(org.telegram.ui.ActionBar.k2 k2Var, ig0 ig0Var, TLRPC.User user, TL_wallet.card cardVar) {
        super(k2Var.getParentActivity(), 2131755352);
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        String a02;
        RectF rectF = new RectF();
        this.f35019f = rectF;
        this.f35025y = new Paint(3);
        this.D = new RectF();
        hi.b bVar = new hi.b();
        this.E = bVar;
        this.H = i0.c.e;
        this.L = new li.k(23);
        this.M = new RectF();
        this.N = new RectF();
        this.V = new int[2];
        this.f35016a = k2Var;
        this.f35017b = ig0Var;
        if (user != null && user.f19943id == e20.i(k2Var.getCurrentAccount()).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (user != null && !z10 && ((org.telegram.messenger.j0) wp.r1(k2Var.getCurrentAccount()).f19300y7.f18033j0.f11588b).f16393c) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35018c = z11;
        if (user != null && !z10 && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = z12;
        ig0Var.getLocationOnScreen(new int[2]);
        rectF.set(ig0Var.f25125w);
        rectF.offset(iArr[0], iArr[1]);
        org.telegram.messenger.i0.S(getWindow());
        n3 n3Var = new n3(this, getContext());
        this.h = n3Var;
        o3 o3Var = new o3(this, getContext());
        this.f35020n = o3Var;
        o3Var.setAlpha(0.0f);
        n3Var.addView(o3Var, w7.b6.c(-1.0f, -1));
        n3Var.setClipChildren(false);
        n3Var.setClipToPadding(false);
        n3Var.setOnClickListener(new j3(this, 0));
        e3 e3Var = new e3(this, 1);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(n3Var, e3Var);
        l6 l6Var = new l6(getContext());
        this.f35021r = l6Var;
        l6Var.setDiamondOnCard(true);
        int currentAccount = k2Var.getCurrentAccount();
        String p5 = i20.p(user);
        Locale locale = Locale.ROOT;
        l6Var.setCardHolder(p5.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            l6Var.setCardNumber(l6.d(cardVar.address.toUpperCase(locale)));
        }
        l6Var.j(currentAccount, cardVar.balance);
        CharSequence m10 = k0.x(currentAccount).m(cardVar.balance, false);
        if (!TextUtils.isEmpty(m10)) {
            l6Var.O.c(m10, false, true);
        }
        l6Var.setCardOnClickListener(new qv0(12, this, k2Var));
        l6Var.setOnClickListener(new bh.c(19));
        l6Var.setAlpha(0.0f);
        n3Var.addView(l6Var, w7.b6.c(-2.0f, -2));
        h8 h8Var = new h8(k2Var, l6Var, null, cardVar);
        this.f35022s = h8Var;
        n3Var.addView(h8Var, w7.b6.c(-1.0f, -1));
        tg.b bVar2 = new tg.b(bVar, bVar, bVar);
        this.F = bVar2;
        bVar2.h = new zg.h(n3Var);
        bVar2.f48713i = n3Var;
        bg0 bg0Var = new bg0(getContext());
        this.f35023w = bg0Var;
        vg.f c10 = bVar2.c(bg0Var, new wg.b(org.telegram.ui.ActionBar.t6.f20930d6, k2Var.getResourceProvider()), false);
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(22.0f));
        bg0Var.setBackground(c10);
        w7.e6.b(bg0Var, 0.02f, 1.2f);
        vh.d dVar = new vh.d(getContext(), k2Var.getResourceProvider(), true);
        dVar.setUseWrapContent(true);
        dVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        dVar.setRoundRadius(19);
        if (z10) {
            i10 = 2131743087;
        } else if (z11) {
            i10 = 2131743043;
        } else {
            i10 = 2131749285;
        }
        CharSequence L0 = dd.L0(i10, null);
        if (!z11) {
            dVar.i(L0, false, true);
            i11 = -1;
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(L0);
            dq dqVar = new dq(2131231955, 0);
            dqVar.c(org.telegram.messenger.i0.L(20.0f));
            i11 = -1;
            dqVar.f25572y = -1;
            append.setSpan(dqVar, 0, 1, 33);
            dVar.i(append, false, true);
        }
        dVar.setStateListAnimator(null);
        bg0Var.addView(dVar, w7.b6.e(-2, i11, 17));
        bg0Var.setContentDescription(L0);
        bg0Var.setOnClickListener(new j1(this, k2Var, cardVar, 1));
        bg0Var.setAlpha(0.0f);
        if (c()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        bg0Var.setVisibility(i12);
        n3Var.addView(bg0Var, w7.b6.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.f35024x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.i0.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z10) {
            textView.setText(dd.L0(2131743069, null));
        } else if (user != null) {
            String j10 = i20.j(user, true);
            if (new BigDecimal(k0.p(cardVar.balance, false)).signum() == 0) {
                a02 = dd.a0(null, null, 2131743071, j10);
            } else {
                a02 = dd.a0(null, null, 2131743072, j10, k0.l("Grams", l6.e(cardVar.balance).toString(), 2131749516).toString().replace(' ', (char) 160));
            }
            textView.setText(vh.p2.b(a02, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        n3Var.addView(textView, w7.b6.e(-2, -2, 49));
    }

    public final void a(float f7) {
        boolean z10;
        long j10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 == 0 && this.T) {
            return;
        }
        if (i10 == 0) {
            this.T = true;
        }
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        l6 l6Var = this.f35021r;
        l6Var.getClass();
        l6Var.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, f7);
        this.O = ofFloat;
        if (i10 == 0) {
            j10 = 650;
        } else {
            j10 = 380;
        }
        ofFloat.setDuration(j10);
        this.O.setInterpolator(new LinearInterpolator());
        this.O.addUpdateListener(new m3(this, 0));
        this.O.addListener(new org.telegram.ui.ActionBar.v0(this, f7, 6));
        this.O.start();
    }

    public final void b() {
        if (!this.S) {
            this.S = true;
            this.f35021r.setLayerType(0, null);
            this.f35017b.setEjectProgress(0.0f);
            super.dismiss();
            this.f35022s.p();
            this.E.a(null);
            this.G = null;
            if (this.U != null && this.f35016a.getParentActivity() != null) {
                Runnable runnable = this.U;
                this.U = null;
                org.telegram.messenger.i0.g3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.f35018c && !this.d && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        Bitmap bitmap = this.G;
        TextView textView = this.f35024x;
        if (bitmap != null && !bitmap.isRecycled()) {
            n3 n3Var = this.h;
            if (n3Var.getWidth() > 0 && n3Var.getHeight() > 0) {
                q6 = org.telegram.messenger.i0.B(this.G.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) n3Var.getWidth())) * ((float) this.G.getWidth())), this.G.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) n3Var.getHeight())) * ((float) this.G.getHeight())), this.G.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (q6) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.41f, i10));
    }

    @Override
    public final void dismiss() {
        if (!this.S && !this.R) {
            this.R = true;
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f35023w.setEnabled(false);
            if (this.h.isAttachedToWindow() && this.I != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    public final void e() {
        float f7;
        float f10;
        float interpolation = gr.f26524g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.I / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.I - 0.3f) / 0.7f));
        float interpolation2 = gr.h.getInterpolation(max);
        if (this.K) {
            float sqrt = ((float) Math.sqrt(0.4375d)) * 10.0f;
            double d = max * sqrt;
            f7 = 1.0f - ((((7.5f / sqrt) * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f7 = interpolation2;
        }
        l6 l6Var = this.f35021r;
        float width = l6Var.getWidth();
        float height = l6Var.getHeight();
        RectF rectF = this.f35019f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float T1 = org.telegram.messenger.i0.T1(max2, 1.0f, f7);
        float centerY = rectF.centerY();
        int[] iArr = this.V;
        float f11 = centerY - iArr[1];
        float f12 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f13 = width / 2.0f;
        float f14 = height / 2.0f;
        float T12 = org.telegram.messenger.i0.T1(centerX, l6Var.getLeft() + f13, f7);
        float T13 = org.telegram.messenger.i0.T1((f12 * interpolation) + (f11 - (f12 / 2.0f)), l6Var.getTop() + f14, f7);
        float f15 = 1.0f - f7;
        float f16 = (-90.0f) * f15;
        double d10 = f16;
        float cos = (float) Math.cos(Math.toRadians(d10));
        float sin = (float) Math.sin(Math.toRadians(d10));
        float f17 = centerX - T12;
        float f18 = f11 - T13;
        float f19 = sin * f18;
        float f20 = f18 * cos;
        float T14 = org.telegram.messenger.i0.T1(((f19 + (cos * f17)) / T1) + f13, f13, interpolation2);
        float T15 = org.telegram.messenger.i0.T1(((f20 + ((-sin) * f17)) / T1) + f14, f14, interpolation2);
        float f21 = T14 - f13;
        float f22 = T15 - f14;
        l6Var.setPivotX(T14);
        l6Var.setPivotY(T15);
        l6Var.setScaleX(T1);
        l6Var.setScaleY(T1);
        l6Var.setRotation(f16);
        l6Var.setRotationX(35.0f * f15);
        l6Var.setTranslationX((((cos * f21) - (sin * f22)) * T1) + ((T12 - l6Var.getLeft()) - T14));
        l6Var.setTranslationY((((cos * f22) + (sin * f21)) * T1) + ((T13 - l6Var.getTop()) - T15));
        if (this.I > 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        l6Var.setAlpha(f10);
        l6Var.setUseGyroscope(this.Q * interpolation2);
        float f23 = 1.0f - interpolation2;
        this.J = Math.max(0.0f, f11 * f23);
        this.f35017b.setEjectProgress(interpolation);
        this.f35020n.setAlpha(this.I);
        this.f35022s.setAlpha(interpolation2);
        bg0 bg0Var = this.f35023w;
        bg0Var.setAlpha(interpolation2);
        TextView textView = this.f35024x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * f23);
        bg0Var.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f23);
        bg0Var.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, interpolation2));
        bg0Var.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        n3 n3Var = this.h;
        setContentView(n3Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        n3Var.setSystemUiVisibility(1792);
        org.telegram.messenger.i0.n3(n3Var, !org.telegram.ui.ActionBar.t6.I.q());
        org.telegram.messenger.i0.r3(window, !org.telegram.ui.ActionBar.t6.I.q());
    }

    @Override
    public final void show() {
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        ol0.d(new d(this, 6));
        super.show();
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.x.c(this.h);
    }
}
