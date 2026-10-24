package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.kg;
public final class m3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final j3 I;
    public final org.telegram.ui.Components.d6 J;
    public final org.telegram.ui.Components.d6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.d6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final wc Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.v0 f34806a;
    public float f34807a0;
    public final org.telegram.ui.ActionBar.g6 f34808b;
    public o1.k f34809b0;
    public float f34811c0;
    public k3 f34812d0;
    public boolean e;
    public long f34813e0;
    public boolean f34815f0;
    public boolean f34817g0;
    public boolean f34818h0;
    public final Drawable f34819i;
    public boolean f34820i0;
    public ValueAnimator f34822j0;
    public final y5 f34823k;
    public kg f34824k0;
    public final xj0 f34825l;
    public TLRPC.TL_messageActionGramTransfer f34826l0;
    public l3 f34827m;
    public boolean m0;
    public boolean f34828n;
    public h11 f34829n0;
    public boolean f34830o;
    public h11 f34831o0;
    public float f34832p;
    public h11 f34833p0;
    public float f34834q;
    public h11 f34835q0;
    public float f34836r;
    public boolean f34837r0;
    public float f34838s;
    public org.telegram.ui.Cells.o0 f34839s0;
    public float f34840t;
    public int f34841t0;
    public final ki.y5 f34843u0;
    public long v;
    public int f34844v0;
    public final org.telegram.ui.Components.d6 f34846w0;
    public final h3 f34848x0;
    public float f34849y;
    public boolean f34850y0;
    public float f34851z;
    public final ArrayList f34810c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34814f = new RectF();
    public final RectF f34816g = new RectF();
    public final Path h = new Path();
    public final Path f34821j = new Path();
    public final l9 f34842u = new l9();
    public final Rect f34845w = new Rect();
    public int f34847x = -1;
    public float C = 1.0f;

    public m3(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34807a0 = 1.0f;
        new Matrix();
        this.f34841t0 = -10624001;
        this.f34843u0 = new ki.y5(this, 3);
        this.f34844v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f34848x0 = new h3(this, 0);
        this.f34806a = v0Var;
        this.f34808b = g6Var;
        this.f34819i = v0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = v0Var.getContext();
        if (y5.G == null) {
            y5.G = new y5(context.getApplicationContext());
        }
        this.f34823k = y5.G;
        xj0 xj0Var = new xj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34825l = xj0Var;
        xj0Var.R(v0Var);
        xj0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new ja(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        m mVar = new m(v0Var, 6);
        zr zrVar = zr.h;
        this.Q = new org.telegram.ui.Components.d6(1.0f, mVar, 0L, 180L, zrVar);
        this.K = new org.telegram.ui.Components.d6(new m(v0Var, 6), 320L, zrVar, 0);
        this.J = new org.telegram.ui.Components.d6(new m(v0Var, 6), 320L, zrVar, 0);
        j3 j3Var = new j3(v0Var, v0Var);
        this.I = j3Var;
        j3Var.f50786x = -1;
        yh.j1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.k6.o1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        wc wcVar = new wc(v0Var);
        this.Y = wcVar;
        wcVar.f32183f = new i3(this, 0);
        this.f34846w0 = new org.telegram.ui.Components.d6(1.0f, new m(v0Var, 6), 0L, 400L, zrVar);
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
            kVar.f17622u = lVar;
            this.F.e(0.001f);
            this.F.b(new g3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.f34806a;
        if (v0Var.isShown()) {
            AndroidUtilities.vibrateCursor(v0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34807a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f17622u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f17612a = -3.0f;
        kVar3.b(new g3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34811c0);
        wc wcVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f34811c0, 0.012f, 1.0f, wcVar.a(0.025f) * this.f34807a0), com.google.android.gms.internal.play_billing.k3.B(this.f34811c0, 0.04f, 1.0f, wcVar.a(0.025f) * this.f34807a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34812d0 != null) {
            return;
        }
        k3 k3Var = new k3(this, this.f34808b);
        this.f34812d0 = k3Var;
        k3Var.g(4969977, org.telegram.ui.ActionBar.k6.o1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.k6.o1(0.75f, -11807239));
        this.f34812d0.f24703x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        k3 k3Var2 = this.f34812d0;
        k3Var2.f24700t = 2.0f;
        k3Var2.f24704y = this.h;
        k3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34822j0;
        if (valueAnimator != null) {
            this.f34822j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.d6 d6Var = this.K;
            if (d6Var.f25571i) {
                this.M = false;
                this.N = 0L;
            }
            d6Var.d(1.0f, true);
            this.f34840t = 0.0f;
            this.f34842u.f34790a.clear();
            kg kgVar = this.f34824k0;
            this.f34824k0 = null;
            this.f34806a.invalidate();
            if (kgVar != null) {
                AndroidUtilities.runOnUIThread(kgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f34818h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34836r;
            float f12 = this.f34838s;
            this.f34836r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34838s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34836r;
            float f14 = this.f34840t;
            this.f34836r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34840t = f15;
            if (f15 < 0.001f) {
                this.f34840t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34823k.f35455y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34836r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34818h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l3 l3Var = this.f34827m;
        if (l3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            l3Var.setAlpha(f7);
        }
        this.f34806a.invalidate();
    }

    public final void j() {
        this.f34847x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.f34806a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(zr.h);
        this.G.addUpdateListener(new ei.ja(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34823k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34847x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.f34806a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34847x = -1;
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
        this.f34840t = 0.0f;
        this.f34838s = 0.0f;
        this.f34836r = 0.0f;
        this.f34842u.f34790a.clear();
        l3 l3Var = this.f34827m;
        if (l3Var != null) {
            l3Var.setScaleX(1.0f);
            this.f34827m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34809b0;
        if (kVar != null) {
            kVar.c();
            this.f34809b0 = null;
        }
        this.f34811c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.f34806a;
        v0Var.invalidate();
        if (v0Var.getParent() instanceof View) {
            ((View) v0Var.getParent()).invalidate();
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
        org.telegram.ui.Cells.v0 v0Var = this.f34806a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34818h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34807a0 = 1.0f;
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34825l.stop();
            this.H = false;
        }
        this.f34817g0 = z10;
        this.f34826l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34820i0 = z13;
        org.telegram.ui.Components.d6 d6Var = this.K;
        if (z13) {
            d6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            d6Var.d(1.0f, true);
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
        if (this.f34818h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34840t = 18.0f;
            this.f34842u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.f34818h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            d6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            d6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f34818h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            k3 k3Var = this.f34812d0;
            k3Var.getClass();
            k3Var.v = Math.max(0L, 0L);
            if (this.f34812d0.d() || this.f34812d0.c()) {
                k3 k3Var2 = this.f34812d0;
                k3Var2.f24685b = -1L;
                k3Var2.f24686c = -1L;
            }
            v0Var.invalidate();
        } else {
            k3 k3Var3 = this.f34812d0;
            if (k3Var3 != null && this.f34813e0 == 0 && !k3Var3.d() && !this.f34812d0.c()) {
                this.f34812d0.a();
                v0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21422q7, this.f34808b);
        } else if (z10) {
            i11 = -15352320;
        } else {
            i11 = -11814402;
        }
        this.f34850y0 = z14;
        int i12 = this.U;
        if (i12 == 0) {
            this.V = i11;
            this.U = i11;
            this.T = i11;
        } else if (i11 != i12) {
            this.T = this.V;
            this.U = i11;
            this.J.d(0.0f, true);
            v0Var.invalidate();
        }
        if (z14) {
            string = LocaleController.getString(R.string.WalletTransferStatusFailed);
        } else if (z10) {
            string = LocaleController.getString(R.string.WalletTransferStatusSent);
        } else {
            string = LocaleController.getString(R.string.WalletTransferStatusReceived);
        }
        j3 j3Var = this.I;
        if (z15) {
            j3Var.f(10, string, true);
        } else {
            j3Var.g(10, string);
        }
        SpannableStringBuilder p5 = l0.p(l0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) p5.getSpans(0, p5.length(), RelativeSizeSpan.class)) {
            p5.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        p5.insert(0, (CharSequence) str2);
        int indexOf = p5.toString().indexOf(46);
        if (indexOf >= 0) {
            p5.setSpan(new RelativeSizeSpan(0.75f), indexOf, p5.length(), 33);
        }
        Object obj = new Object();
        p5.setSpan(obj, 0, p5.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.k("Grams", p5, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        ki.y5 y5Var = this.f34843u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34829n0 = new h11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = x5.f(x5.d(str3.toUpperCase(locale)));
        h11 h11Var = new h11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        h11Var.n(2);
        this.f34831o0 = h11Var;
        h11Var.r(f7);
        if (TextUtils.isEmpty(str)) {
            this.f34833p0 = null;
        } else {
            h11 h11Var2 = new h11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34833p0 = h11Var2;
            h11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34833p0.f26841a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34810c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34835q0 = null;
            return;
        }
        h11 h11Var3 = new h11("", 12.0f, null);
        h11Var3.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h11Var3.a();
        h11Var3.q(AndroidUtilities.dp(184.0f));
        this.f34835q0 = h11Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f29448a |= 256;
            spannableStringBuilder2.setSpan(new q11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34835q0.r(spannableStringBuilder2);
            wh.g.c(v0Var, this.f34835q0.f26842b, stack, arrayList);
            n(this.e);
            return;
        }
        h11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, h11Var3.f26841a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f34810c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34832p = f7;
        this.f34834q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34827m == null) {
            return;
        }
        if (this.f34847x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34823k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34847x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        l3 l3Var = this.f34827m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34818h0 && this.f34836r == 0.0f && this.f34838s == 0.0f && this.f34840t == 0.0f) {
            z11 = false;
        }
        l3Var.f47627r = f7;
        l3Var.f47628s = f10;
        l3Var.v = z11;
        l3Var.f47629w = z10;
    }

    public final void q() {
        if (this.f34818h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
