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
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.xf;
public final class d4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final a4 I;
    public final org.telegram.ui.Components.w5 J;
    public final org.telegram.ui.Components.w5 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.w5 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final ic Y;
    public r1.g Z;
    public final org.telegram.ui.Cells.t0 f42337a;
    public float f42338a0;
    public final org.telegram.ui.ActionBar.f6 f42339b;
    public r1.g f42340b0;
    public float f42342c0;
    public b4 f42343d0;
    public boolean f42344e;
    public long f42345e0;
    public boolean f42347f0;
    public boolean f42349g0;
    public boolean f42350h0;
    public final Drawable f42351i;
    public boolean f42352i0;
    public ValueAnimator f42354j0;
    public final i6 f42355k;
    public xf f42356k0;
    public final zg0 f42357l;
    public TLRPC.TL_messageActionGramTransfer f42358l0;
    public c4 f42359m;
    public boolean m0;
    public boolean f42360n;
    public my0 f42361n0;
    public boolean f42362o;
    public my0 f42363o0;
    public float f42364p;
    public my0 f42365p0;
    public float f42366q;
    public my0 f42367q0;
    public float f42368r;
    public boolean f42369r0;
    public float f42370s;
    public org.telegram.ui.Cells.m0 f42371s0;
    public float f42372t;
    public int f42373t0;
    public final li.w5 f42375u0;
    public long v;
    public int f42376v0;
    public final org.telegram.ui.Components.w5 f42378w0;
    public final y3 f42380x0;
    public float f42381y;
    public boolean f42382y0;
    public float f42383z;
    public final ArrayList f42341c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f42346f = new RectF();
    public final RectF f42348g = new RectF();
    public final Path h = new Path();
    public final Path f42353j = new Path();
    public final p9 f42374u = new p9();
    public final Rect f42377w = new Rect();
    public int f42379x = -1;
    public float C = 1.0f;

    public d4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f42338a0 = 1.0f;
        new Matrix();
        this.f42373t0 = -10624001;
        this.f42375u0 = new li.w5(this, 4);
        this.f42376v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f42380x0 = new Object();
        this.f42337a = t0Var;
        this.f42339b = f6Var;
        this.f42351i = t0Var.getResources().getDrawable(2131232805).mutate();
        Context context = t0Var.getContext();
        if (i6.G == null) {
            i6.G = new i6(context.getApplicationContext());
        }
        this.f42355k = i6.G;
        zg0 zg0Var = new zg0(2131624356, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f42357l = zg0Var;
        zg0Var.R(t0Var);
        zg0Var.K(0);
        t0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.aa(2, this, t0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        l lVar = new l(t0Var, 6);
        xq xqVar = xq.h;
        this.Q = new org.telegram.ui.Components.w5(1.0f, lVar, 0L, 180L, xqVar);
        this.K = new org.telegram.ui.Components.w5(new l(t0Var, 6), 320L, xqVar, 0);
        this.J = new org.telegram.ui.Components.w5(new l(t0Var, 6), 320L, xqVar, 0);
        a4 a4Var = new a4(t0Var, t0Var);
        this.I = a4Var;
        a4Var.f60151y = -1;
        zh.c1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.k6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ic icVar = new ic(t0Var);
        this.Y = icVar;
        icVar.f34583f = new z3(this, 0);
        this.f42378w0 = new org.telegram.ui.Components.w5(1.0f, new l(t0Var, 6), 0L, 400L, xqVar);
    }

    public static int h() {
        return org.telegram.messenger.g0.L(206.0f);
    }

    public final void a(float f10) {
        if (this.F == null) {
            r1.g gVar = new r1.g(new r1.f(this.C));
            this.F = gVar;
            r1.h hVar = new r1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f54174m = hVar;
            this.F.f(0.001f);
            this.F.b(new x3(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.t0 t0Var = this.f42337a;
        if (t0Var.isShown()) {
            org.telegram.messenger.g0.c4(t0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f42338a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f54174m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f54164a = -3.0f;
        gVar3.b(new x3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f42342c0);
        ic icVar = this.Y;
        canvas.scale(com.google.android.recaptcha.internal.a.B(this.f42342c0, 0.012f, 1.0f, icVar.a(0.025f) * this.f42338a0), com.google.android.recaptcha.internal.a.C(this.f42342c0, 0.04f, 1.0f, icVar.a(0.025f) * this.f42338a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f42343d0 != null) {
            return;
        }
        b4 b4Var = new b4(this, this.f42339b);
        this.f42343d0 = b4Var;
        b4Var.g(4969977, org.telegram.ui.ActionBar.k6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.k6.r1(0.75f, -11807239));
        this.f42343d0.f31742x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        b4 b4Var2 = this.f42343d0;
        b4Var2.f31739t = 2.0f;
        b4Var2.f31743y = this.h;
        b4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f42354j0;
        if (valueAnimator != null) {
            this.f42354j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.w5 w5Var = this.K;
            if (w5Var.f39859i) {
                this.M = false;
                this.N = 0L;
            }
            w5Var.e(true, 1.0f);
            this.f42372t = 0.0f;
            this.f42374u.f43029a.clear();
            xf xfVar = this.f42356k0;
            this.f42356k0 = null;
            this.f42337a.invalidate();
            if (xfVar != null) {
                org.telegram.messenger.g0.i3(xfVar, 1L);
            }
        }
    }

    public final float g() {
        float f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.v;
        if (j3 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j3)) / 1000.0f);
            if (this.f42350h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f42368r;
            float f13 = this.f42370s;
            this.f42368r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f42370s = com.google.android.recaptcha.internal.a.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f42368r;
            float f15 = this.f42372t;
            this.f42368r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f42372t = f16;
            if (f16 < 0.001f) {
                this.f42372t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f42355k.D * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f42368r;
    }

    public final void i(boolean z9) {
        float f10 = 0.0f;
        if (z9) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f42350h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z9;
        c4 c4Var = this.f42359m;
        if (c4Var != null) {
            if (!z9) {
                f10 = 1.0f;
            }
            c4Var.setAlpha(f10);
        }
        this.f42337a.invalidate();
    }

    public final void j() {
        this.f42379x = -1;
        org.telegram.ui.Cells.t0 t0Var = this.f42337a;
        if (t0Var.getParent() != null) {
            t0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(xq.h);
        this.G.addUpdateListener(new fi.l9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f42355k.E * 0.14f), 6.283185307179586d), 4));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f42379x != -1) {
            org.telegram.ui.Cells.t0 t0Var = this.f42337a;
            if (t0Var.getParent() != null) {
                t0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f42379x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        r1.g gVar = this.F;
        if (gVar != null) {
            gVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.f42372t = 0.0f;
        this.f42370s = 0.0f;
        this.f42368r = 0.0f;
        this.f42374u.f43029a.clear();
        c4 c4Var = this.f42359m;
        if (c4Var != null) {
            c4Var.setScaleX(1.0f);
            this.f42359m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f42340b0;
        if (gVar != null) {
            gVar.d();
            this.f42340b0 = null;
        }
        this.f42342c0 = 0.0f;
        org.telegram.ui.Cells.t0 t0Var = this.f42337a;
        t0Var.invalidate();
        if (t0Var.getParent() instanceof View) {
            ((View) t0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z9, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i7, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        long j3;
        int i10;
        String M0;
        String str2;
        org.telegram.ui.Cells.t0 t0Var = this.f42337a;
        if (z10) {
            f();
            this.M = false;
            this.N = 0L;
            this.f42350h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f42338a0 = 1.0f;
            t0Var.invalidate();
            if (t0Var.getParent() instanceof View) {
                ((View) t0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f42357l.stop();
            this.H = false;
        }
        this.f42349g0 = z9;
        this.f42358l0 = tL_messageActionGramTransfer;
        if (!z9 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f42352i0 = z12;
        org.telegram.ui.Components.w5 w5Var = this.K;
        if (z12) {
            w5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z10) {
            w5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        if (z9 && i7 == 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z9 && i7 == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (this.f42350h0 && z9 && i7 == 0) {
            b();
            g();
            this.f42372t = 18.0f;
            this.f42374u.f();
            t0Var.invalidate();
        }
        if (z14) {
            if (!this.f42350h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            w5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z13) {
            w5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f42350h0 = z14;
        if (z14) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z14) {
            e();
            b4 b4Var = this.f42343d0;
            b4Var.getClass();
            b4Var.v = Math.max(0L, 0L);
            if (this.f42343d0.d() || this.f42343d0.c()) {
                b4 b4Var2 = this.f42343d0;
                b4Var2.f31723b = -1L;
                b4Var2.f31724c = -1L;
            }
            t0Var.invalidate();
        } else {
            b4 b4Var3 = this.f42343d0;
            if (b4Var3 != null && this.f42345e0 == 0 && !b4Var3.d() && !this.f42343d0.c()) {
                this.f42343d0.a();
                t0Var.invalidate();
            }
        }
        if (z13) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28090q7, this.f42339b);
        } else if (z9) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f42382y0 = z13;
        int i11 = this.U;
        if (i11 == 0) {
            this.V = i10;
            this.U = i10;
            this.T = i10;
        } else if (i10 != i11) {
            this.T = this.V;
            this.U = i10;
            this.J.e(true, 0.0f);
            t0Var.invalidate();
        }
        if (z13) {
            M0 = hd.M0(2131742980, null);
        } else if (z9) {
            M0 = hd.M0(2131742978, null);
        } else {
            M0 = hd.M0(2131742979, null);
        }
        a4 a4Var = this.I;
        if (z14) {
            a4Var.f(10, M0, true);
        } else {
            a4Var.g(10, M0);
        }
        SpannableStringBuilder q10 = n0.q(n0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) q10.getSpans(0, q10.length(), RelativeSizeSpan.class)) {
            q10.removeSpan(relativeSizeSpan);
        }
        if (z9) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        q10.insert(0, (CharSequence) str2);
        int indexOf = q10.toString().indexOf(46);
        if (indexOf >= 0) {
            q10.setSpan(new RelativeSizeSpan(0.75f), indexOf, q10.length(), 33);
        }
        Object obj = new Object();
        q10.setSpan(obj, 0, q10.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n0.l("Grams", q10, 2131749506));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        li.w5 w5Var2 = this.f42375u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f42361n0 = new my0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = h6.f(h6.d(str3.toUpperCase(locale)));
        my0 my0Var = new my0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        my0Var.m(2);
        this.f42363o0 = my0Var;
        my0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f42365p0 = null;
        } else {
            my0 my0Var2 = new my0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f42365p0 = my0Var2;
            my0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f42365p0.f36123a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f42341c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f42367q0 = null;
            return;
        }
        my0 my0Var3 = new my0("", 12.0f, null);
        my0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var3.a();
        my0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f42367q0 = my0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f38751a |= 256;
            spannableStringBuilder2.setSpan(new vy0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f42367q0.q(spannableStringBuilder2);
            xh.f.c(t0Var, this.f42367q0.f36124b, stack, arrayList);
            n(this.f42344e);
            return;
        }
        my0Var3.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer.comment, my0Var3.f36123a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z9) {
        this.f42344e = z9;
        ArrayList arrayList = this.f42341c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f42364p = f10;
        this.f42366q = f11;
    }

    public final void p() {
        boolean z9;
        if (this.f42359m == null) {
            return;
        }
        if (this.f42379x == -1 && !this.D) {
            this.A = g();
            this.B = this.f42355k.E * 0.14f;
        }
        boolean z10 = true;
        if (this.f42379x == -1 && !this.D && this.C <= 1.001f) {
            z9 = false;
        } else {
            z9 = true;
        }
        c4 c4Var = this.f42359m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z9 && !this.f42350h0 && this.f42368r == 0.0f && this.f42370s == 0.0f && this.f42372t == 0.0f) {
            z10 = false;
        }
        c4Var.f57403r = f10;
        c4Var.f57404s = f11;
        c4Var.f57405w = z10;
        c4Var.f57406x = z9;
    }

    public final void q() {
        if (this.f42350h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
