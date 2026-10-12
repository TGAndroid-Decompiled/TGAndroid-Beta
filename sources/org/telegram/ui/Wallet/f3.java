package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import ci.ya;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.r11;
import org.telegram.ui.wg;
public final class f3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final c3 I;
    public final org.telegram.ui.Components.g6 J;
    public final org.telegram.ui.Components.g6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.g6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final ad Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.w0 f34707a;
    public float f34708a0;
    public final org.telegram.ui.ActionBar.c6 f34709b;
    public o1.k f34710b0;
    public float f34712c0;
    public d3 f34713d0;
    public boolean f34714e;
    public long f34715e0;
    public boolean f34717f0;
    public boolean f34719g0;
    public boolean f34720h0;
    public final Drawable f34721i;
    public boolean f34722i0;
    public ValueAnimator f34724j0;
    public final o5 f34725k;
    public wg f34726k0;
    public final fk0 f34727l;
    public TLRPC.TL_messageActionGramTransfer f34728l0;
    public e3 f34729m;
    public boolean m0;
    public boolean f34730n;
    public r11 f34731n0;
    public boolean f34732o;
    public r11 f34733o0;
    public float f34734p;
    public r11 f34735p0;
    public float f34736q;
    public r11 f34737q0;
    public float f34738r;
    public boolean f34739r0;
    public float f34740s;
    public org.telegram.ui.Cells.p0 f34741s0;
    public float f34742t;
    public long v;
    public float f34746y;
    public float f34747z;
    public final ArrayList f34711c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34716f = new RectF();
    public final RectF f34718g = new RectF();
    public final Path h = new Path();
    public final Path f34723j = new Path();
    public final n8 f34743u = new n8();
    public final Rect f34744w = new Rect();
    public int f34745x = -1;
    public float C = 1.0f;

    public f3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34708a0 = 1.0f;
        this.f34707a = w0Var;
        this.f34709b = c6Var;
        this.f34721i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (o5.G == null) {
            o5.G = new o5(context.getApplicationContext());
        }
        this.f34725k = o5.G;
        fk0 fk0Var = new fk0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34727l = fk0Var;
        fk0Var.R(w0Var);
        fk0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new na(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        n nVar = new n(w0Var, 5);
        js jsVar = js.h;
        this.Q = new org.telegram.ui.Components.g6(1.0f, nVar, 0L, 180L, jsVar);
        this.K = new org.telegram.ui.Components.g6(new n(w0Var, 5), 320L, jsVar, 0);
        this.J = new org.telegram.ui.Components.g6(new n(w0Var, 5), 320L, jsVar, 0);
        c3 c3Var = new c3(w0Var, w0Var);
        this.I = c3Var;
        c3Var.f51576x = -1;
        xh.l1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.h6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ad adVar = new ad(w0Var);
        this.Y = adVar;
        adVar.f24285f = new b3(this, 0);
    }

    public static int h() {
        return AndroidUtilities.dp(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.k kVar = new o1.k(new o1.j(this.C));
            this.F = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f16691u = lVar;
            this.F.e(0.001f);
            this.F.b(new a3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.f34707a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34708a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f16691u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f16680a = -3.0f;
        kVar3.b(new a3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34712c0);
        ad adVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.A(this.f34712c0, 0.012f, 1.0f, adVar.a(0.025f) * this.f34708a0), com.google.android.gms.internal.vision.e2.B(this.f34712c0, 0.04f, 1.0f, adVar.a(0.025f) * this.f34708a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.f3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34713d0 != null) {
            return;
        }
        d3 d3Var = new d3(this, this.f34709b);
        this.f34713d0 = d3Var;
        d3Var.g(4969977, org.telegram.ui.ActionBar.h6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.h6.m1(0.75f, -11807239));
        this.f34713d0.f28481x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        d3 d3Var2 = this.f34713d0;
        d3Var2.f28478t = 2.0f;
        d3Var2.f28482y = this.h;
        d3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34724j0;
        if (valueAnimator != null) {
            this.f34724j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.g6 g6Var = this.K;
            if (g6Var.f26305i) {
                this.M = false;
                this.N = 0L;
            }
            g6Var.d(1.0f, true);
            this.f34742t = 0.0f;
            this.f34743u.f35140a.clear();
            wg wgVar = this.f34726k0;
            this.f34726k0 = null;
            this.f34707a.invalidate();
            if (wgVar != null) {
                AndroidUtilities.runOnUIThread(wgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.v;
        if (j3 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j3)) / 1000.0f);
            if (this.f34720h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34738r;
            float f12 = this.f34740s;
            this.f34738r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34740s = com.google.android.gms.internal.vision.e2.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34738r;
            float f14 = this.f34742t;
            this.f34738r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34742t = f15;
            if (f15 < 0.001f) {
                this.f34742t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34725k.f35176y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34738r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34720h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        e3 e3Var = this.f34729m;
        if (e3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            e3Var.setAlpha(f7);
        }
        this.f34707a.invalidate();
    }

    public final void j() {
        this.f34745x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f34707a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(js.h);
        this.G.addUpdateListener(new ya(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34725k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34745x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f34707a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34745x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        o1.k kVar = this.F;
        if (kVar != null) {
            kVar.c();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.f34742t = 0.0f;
        this.f34740s = 0.0f;
        this.f34738r = 0.0f;
        this.f34743u.f35140a.clear();
        e3 e3Var = this.f34729m;
        if (e3Var != null) {
            e3Var.setScaleX(1.0f);
            this.f34729m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34710b0;
        if (kVar != null) {
            kVar.c();
            this.f34710b0 = null;
        }
        this.f34712c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.f34707a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        int i11;
        String string;
        String str2;
        org.telegram.ui.Cells.w0 w0Var = this.f34707a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34720h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34708a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34727l.stop();
            this.H = false;
        }
        this.f34719g0 = z10;
        this.f34728l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34722i0 = z13;
        org.telegram.ui.Components.g6 g6Var = this.K;
        if (z13) {
            g6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            g6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        if (z10 && i10 == 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10 && i10 == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (this.f34720h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34742t = 18.0f;
            this.f34743u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f34720h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            g6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            g6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f34720h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            d3 d3Var = this.f34713d0;
            d3Var.getClass();
            d3Var.v = Math.max(0L, 0L);
            if (this.f34713d0.d() || this.f34713d0.c()) {
                d3 d3Var2 = this.f34713d0;
                d3Var2.f28462b = -1L;
                d3Var2.f28463c = -1L;
            }
            w0Var.invalidate();
        } else {
            d3 d3Var3 = this.f34713d0;
            if (d3Var3 != null && this.f34715e0 == 0 && !d3Var3.d() && !this.f34713d0.c()) {
                this.f34713d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20800q7, this.f34709b);
        } else if (z10) {
            i11 = -15352320;
        } else {
            i11 = -11814402;
        }
        int i12 = this.U;
        if (i12 == 0) {
            this.V = i11;
            this.U = i11;
            this.T = i11;
        } else if (i11 != i12) {
            this.T = this.V;
            this.U = i11;
            this.J.d(0.0f, true);
            w0Var.invalidate();
        }
        if (z14) {
            string = LocaleController.getString(R.string.WalletTransferStatusFailed);
        } else if (z10) {
            string = LocaleController.getString(R.string.WalletTransferStatusSent);
        } else {
            string = LocaleController.getString(R.string.WalletTransferStatusReceived);
        }
        c3 c3Var = this.I;
        if (z15) {
            c3Var.f(10, string, true);
        } else {
            r11 r11Var = c3Var.f51569c;
            if (r11Var == null) {
                c3Var.f(10, string, true);
            } else if (!TextUtils.equals(r11Var.k(), string)) {
                c3Var.d = c3Var.f51569c;
                c3Var.f51569c = new r11(string, 10, AndroidUtilities.bold());
                c3Var.f51570e.d(0.0f, true);
                c3Var.invalidateSelf();
            }
        }
        SpannableStringBuilder o9 = l0.o(l0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) o9.getSpans(0, o9.length(), RelativeSizeSpan.class)) {
            o9.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        o9.insert(0, (CharSequence) str2);
        int indexOf = o9.toString().indexOf(46);
        if (indexOf >= 0) {
            o9.setSpan(new RelativeSizeSpan(0.75f), indexOf, o9.length(), 33);
        }
        Object obj = new Object();
        o9.setSpan(obj, 0, o9.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.k("Grams", o9, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34731n0 = new r11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String d = k5.d(k5.b(str3.toUpperCase(locale)));
        r11 r11Var2 = new r11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        r11Var2.n(2);
        this.f34733o0 = r11Var2;
        r11Var2.r(d);
        if (TextUtils.isEmpty(str)) {
            this.f34735p0 = null;
        } else {
            r11 r11Var3 = new r11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34735p0 = r11Var3;
            r11Var3.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34735p0.f29987a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34711c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34737q0 = null;
            return;
        }
        r11 r11Var4 = new r11("", 12.0f, null);
        r11Var4.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r11Var4.a();
        r11Var4.q(AndroidUtilities.dp(184.0f));
        this.f34737q0 = r11Var4;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f33255a |= 256;
            spannableStringBuilder2.setSpan(new a21(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34737q0.r(spannableStringBuilder2);
            vh.g.c(w0Var, this.f34737q0.f29988b, stack, arrayList);
            n(this.f34714e);
            return;
        }
        r11Var4.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, r11Var4.f29987a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.f34714e = z10;
        ArrayList arrayList = this.f34711c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34734p = f7;
        this.f34736q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34729m == null) {
            return;
        }
        if (this.f34745x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34725k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34745x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        e3 e3Var = this.f34729m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34720h0 && this.f34738r == 0.0f && this.f34740s == 0.0f && this.f34742t == 0.0f) {
            z11 = false;
        }
        e3Var.f48396n = f7;
        e3Var.f48397r = f10;
        e3Var.f48398s = z11;
        e3Var.v = z10;
    }

    public final void q() {
        if (this.f34720h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
