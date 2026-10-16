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
import di.xa;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.xg;
public final class e3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final b3 I;
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
    public final org.telegram.ui.Cells.w0 f32822a;
    public float f32823a0;
    public final org.telegram.ui.ActionBar.c6 f32824b;
    public o1.k f32825b0;
    public float f32827c0;
    public c3 f32828d0;
    public boolean e;
    public long f32829e0;
    public boolean f32831f0;
    public boolean f32833g0;
    public boolean f32834h0;
    public final Drawable f32835i;
    public boolean f32836i0;
    public ValueAnimator f32838j0;
    public final m5 f32839k;
    public xg f32840k0;
    public final yj0 f32841l;
    public TLRPC.TL_messageActionGramTransfer f32842l0;
    public d3 f32843m;
    public boolean m0;
    public boolean f32844n;
    public i11 f32845n0;
    public boolean f32846o;
    public i11 f32847o0;
    public float f32848p;
    public i11 f32849p0;
    public float f32850q;
    public i11 f32851q0;
    public float f32852r;
    public boolean f32853r0;
    public float f32854s;
    public org.telegram.ui.Cells.p0 f32855s0;
    public float f32856t;
    public long v;
    public float f32860y;
    public float f32861z;
    public final ArrayList f32826c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f32830f = new RectF();
    public final RectF f32832g = new RectF();
    public final Path h = new Path();
    public final Path f32837j = new Path();
    public final l8 f32857u = new l8();
    public final Rect f32858w = new Rect();
    public int f32859x = -1;
    public float C = 1.0f;

    public e3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f32823a0 = 1.0f;
        this.f32822a = w0Var;
        this.f32824b = c6Var;
        this.f32835i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (m5.G == null) {
            m5.G = new m5(context.getApplicationContext());
        }
        this.f32839k = m5.G;
        yj0 yj0Var = new yj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f32841l = yj0Var;
        yj0Var.R(w0Var);
        yj0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new na(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        n nVar = new n(w0Var, 5);
        es esVar = es.h;
        this.Q = new org.telegram.ui.Components.g6(1.0f, nVar, 0L, 180L, esVar);
        this.K = new org.telegram.ui.Components.g6(new n(w0Var, 5), 320L, esVar, 0);
        this.J = new org.telegram.ui.Components.g6(new n(w0Var, 5), 320L, esVar, 0);
        b3 b3Var = new b3(w0Var, w0Var);
        this.I = b3Var;
        b3Var.f48941x = -1;
        yh.k1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.g6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ad adVar = new ad(w0Var);
        this.Y = adVar;
        adVar.f23199f = new a3(this, 0);
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
            kVar.f16161u = lVar;
            this.F.e(0.001f);
            this.F.b(new z2(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.f32822a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f32823a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f16161u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f16151a = -3.0f;
        kVar3.b(new z2(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f32827c0);
        ad adVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f32827c0, 0.012f, 1.0f, adVar.a(0.025f) * this.f32823a0), com.google.android.gms.internal.play_billing.k3.B(this.f32827c0, 0.04f, 1.0f, adVar.a(0.025f) * this.f32823a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.e3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f32828d0 != null) {
            return;
        }
        c3 c3Var = new c3(this, this.f32824b);
        this.f32828d0 = c3Var;
        c3Var.g(4969977, org.telegram.ui.ActionBar.g6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.g6.m1(0.75f, -11807239));
        this.f32828d0.f25266x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        c3 c3Var2 = this.f32828d0;
        c3Var2.f25263t = 2.0f;
        c3Var2.f25267y = this.h;
        c3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f32838j0;
        if (valueAnimator != null) {
            this.f32838j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.g6 g6Var = this.K;
            if (g6Var.f24888i) {
                this.M = false;
                this.N = 0L;
            }
            g6Var.d(1.0f, true);
            this.f32856t = 0.0f;
            this.f32857u.f33174a.clear();
            xg xgVar = this.f32840k0;
            this.f32840k0 = null;
            this.f32822a.invalidate();
            if (xgVar != null) {
                AndroidUtilities.runOnUIThread(xgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f32834h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f32852r;
            float f12 = this.f32854s;
            this.f32852r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f32854s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f32852r;
            float f14 = this.f32856t;
            this.f32852r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f32856t = f15;
            if (f15 < 0.001f) {
                this.f32856t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f32839k.f33209y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f32852r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f32834h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        d3 d3Var = this.f32843m;
        if (d3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            d3Var.setAlpha(f7);
        }
        this.f32822a.invalidate();
    }

    public final void j() {
        this.f32859x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f32822a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(es.h);
        this.G.addUpdateListener(new xa(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f32839k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f32859x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f32822a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f32859x = -1;
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
        this.f32856t = 0.0f;
        this.f32854s = 0.0f;
        this.f32852r = 0.0f;
        this.f32857u.f33174a.clear();
        d3 d3Var = this.f32843m;
        if (d3Var != null) {
            d3Var.setScaleX(1.0f);
            this.f32843m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f32825b0;
        if (kVar != null) {
            kVar.c();
            this.f32825b0 = null;
        }
        this.f32827c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.f32822a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        int i11;
        String string;
        String str2;
        org.telegram.ui.Cells.w0 w0Var = this.f32822a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f32834h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f32823a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f32841l.stop();
            this.H = false;
        }
        this.f32833g0 = z10;
        this.f32842l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f32836i0 = z13;
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
        if (this.f32834h0 && z10 && i10 == 0) {
            b();
            g();
            this.f32856t = 18.0f;
            this.f32857u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f32834h0) {
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
        this.f32834h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            c3 c3Var = this.f32828d0;
            c3Var.getClass();
            c3Var.v = Math.max(0L, 0L);
            if (this.f32828d0.d() || this.f32828d0.c()) {
                c3 c3Var2 = this.f32828d0;
                c3Var2.f25248b = -1L;
                c3Var2.f25249c = -1L;
            }
            w0Var.invalidate();
        } else {
            c3 c3Var3 = this.f32828d0;
            if (c3Var3 != null && this.f32829e0 == 0 && !c3Var3.d() && !this.f32828d0.c()) {
                this.f32828d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, this.f32824b);
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
        b3 b3Var = this.I;
        if (z15) {
            b3Var.f(10, string, true);
        } else {
            i11 i11Var = b3Var.f48935c;
            if (i11Var == null) {
                b3Var.f(10, string, true);
            } else if (!TextUtils.equals(i11Var.k(), string)) {
                b3Var.d = b3Var.f48935c;
                b3Var.f48935c = new i11(string, 10, AndroidUtilities.bold());
                b3Var.e.d(0.0f, true);
                b3Var.invalidateSelf();
            }
        }
        SpannableStringBuilder o10 = k0.o(k0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) o10.getSpans(0, o10.length(), RelativeSizeSpan.class)) {
            o10.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        o10.insert(0, (CharSequence) str2);
        int indexOf = o10.toString().indexOf(46);
        if (indexOf >= 0) {
            o10.setSpan(new RelativeSizeSpan(0.75f), indexOf, o10.length(), 33);
        }
        Object obj = new Object();
        o10.setSpan(obj, 0, o10.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k0.k("Grams", o10, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f32845n0 = new i11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String d = i5.d(i5.b(str3.toUpperCase(locale)));
        i11 i11Var2 = new i11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        i11Var2.n(2);
        this.f32847o0 = i11Var2;
        i11Var2.r(d);
        if (TextUtils.isEmpty(str)) {
            this.f32849p0 = null;
        } else {
            i11 i11Var3 = new i11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f32849p0 = i11Var3;
            i11Var3.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f32849p0.f25453a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f32826c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f32851q0 = null;
            return;
        }
        i11 i11Var4 = new i11("", 12.0f, null);
        i11Var4.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var4.a();
        i11Var4.q(AndroidUtilities.dp(184.0f));
        this.f32851q0 = i11Var4;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f28163a |= 256;
            spannableStringBuilder2.setSpan(new r11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f32851q0.r(spannableStringBuilder2);
            wh.g.c(w0Var, this.f32851q0.f25454b, stack, arrayList);
            n(this.e);
            return;
        }
        i11Var4.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, i11Var4.f25453a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f32826c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f32848p = f7;
        this.f32850q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f32843m == null) {
            return;
        }
        if (this.f32859x == -1 && !this.D) {
            this.A = g();
            this.B = this.f32839k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f32859x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        d3 d3Var = this.f32843m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f32834h0 && this.f32852r == 0.0f && this.f32854s == 0.0f && this.f32856t == 0.0f) {
            z11 = false;
        }
        d3Var.f45814n = f7;
        d3Var.f45815r = f10;
        d3Var.f45816s = z11;
        d3Var.v = z10;
    }

    public final void q() {
        if (this.f32834h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
