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
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.xf;
public final class c4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final z3 I;
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
    public final org.telegram.ui.Cells.t0 f42308a;
    public float f42309a0;
    public final org.telegram.ui.ActionBar.f6 f42310b;
    public r1.g f42311b0;
    public float f42313c0;
    public a4 f42314d0;
    public boolean f42315e;
    public long f42316e0;
    public boolean f42318f0;
    public boolean f42320g0;
    public boolean f42321h0;
    public final Drawable f42322i;
    public boolean f42323i0;
    public ValueAnimator f42325j0;
    public final h6 f42326k;
    public xf f42327k0;
    public final zg0 f42328l;
    public TLRPC.TL_messageActionGramTransfer f42329l0;
    public b4 f42330m;
    public boolean m0;
    public boolean f42331n;
    public my0 f42332n0;
    public boolean f42333o;
    public my0 f42334o0;
    public float f42335p;
    public my0 f42336p0;
    public float f42337q;
    public my0 f42338q0;
    public float f42339r;
    public boolean f42340r0;
    public float f42341s;
    public org.telegram.ui.Cells.m0 f42342s0;
    public float f42343t;
    public int f42344t0;
    public final li.w5 f42346u0;
    public long v;
    public int f42347v0;
    public final org.telegram.ui.Components.w5 f42349w0;
    public final x3 f42351x0;
    public float f42352y;
    public boolean f42353y0;
    public float f42354z;
    public final ArrayList f42312c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f42317f = new RectF();
    public final RectF f42319g = new RectF();
    public final Path h = new Path();
    public final Path f42324j = new Path();
    public final o9 f42345u = new o9();
    public final Rect f42348w = new Rect();
    public int f42350x = -1;
    public float C = 1.0f;

    public c4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f42309a0 = 1.0f;
        new Matrix();
        this.f42344t0 = -10624001;
        this.f42346u0 = new li.w5(this, 4);
        this.f42347v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f42351x0 = new Object();
        this.f42308a = t0Var;
        this.f42310b = f6Var;
        this.f42322i = t0Var.getResources().getDrawable(2131232805).mutate();
        Context context = t0Var.getContext();
        if (h6.G == null) {
            h6.G = new h6(context.getApplicationContext());
        }
        this.f42326k = h6.G;
        zg0 zg0Var = new zg0(2131624356, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f42328l = zg0Var;
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
        z3 z3Var = new z3(t0Var, t0Var);
        this.I = z3Var;
        z3Var.f60233y = -1;
        zh.b1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.k6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ic icVar = new ic(t0Var);
        this.Y = icVar;
        icVar.f34627f = new y3(this, 0);
        this.f42349w0 = new org.telegram.ui.Components.w5(1.0f, new l(t0Var, 6), 0L, 400L, xqVar);
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
            gVar.f54268m = hVar;
            this.F.f(0.001f);
            this.F.b(new w3(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.t0 t0Var = this.f42308a;
        if (t0Var.isShown()) {
            org.telegram.messenger.g0.c4(t0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f42309a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f54268m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f54258a = -3.0f;
        gVar3.b(new w3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f42313c0);
        ic icVar = this.Y;
        canvas.scale(com.google.android.recaptcha.internal.a.B(this.f42313c0, 0.012f, 1.0f, icVar.a(0.025f) * this.f42309a0), com.google.android.recaptcha.internal.a.C(this.f42313c0, 0.04f, 1.0f, icVar.a(0.025f) * this.f42309a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f42314d0 != null) {
            return;
        }
        a4 a4Var = new a4(this, this.f42310b);
        this.f42314d0 = a4Var;
        a4Var.g(4969977, org.telegram.ui.ActionBar.k6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.k6.r1(0.75f, -11807239));
        this.f42314d0.f31751x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        a4 a4Var2 = this.f42314d0;
        a4Var2.f31748t = 2.0f;
        a4Var2.f31752y = this.h;
        a4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f42325j0;
        if (valueAnimator != null) {
            this.f42325j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.w5 w5Var = this.K;
            if (w5Var.f39809i) {
                this.M = false;
                this.N = 0L;
            }
            w5Var.e(true, 1.0f);
            this.f42343t = 0.0f;
            this.f42345u.f42991a.clear();
            xf xfVar = this.f42327k0;
            this.f42327k0 = null;
            this.f42308a.invalidate();
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
            if (this.f42321h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f42339r;
            float f13 = this.f42341s;
            this.f42339r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f42341s = com.google.android.recaptcha.internal.a.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f42339r;
            float f15 = this.f42343t;
            this.f42339r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f42343t = f16;
            if (f16 < 0.001f) {
                this.f42343t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f42326k.D * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f42339r;
    }

    public final void i(boolean z9) {
        float f10 = 0.0f;
        if (z9) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f42321h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z9;
        b4 b4Var = this.f42330m;
        if (b4Var != null) {
            if (!z9) {
                f10 = 1.0f;
            }
            b4Var.setAlpha(f10);
        }
        this.f42308a.invalidate();
    }

    public final void j() {
        this.f42350x = -1;
        org.telegram.ui.Cells.t0 t0Var = this.f42308a;
        if (t0Var.getParent() != null) {
            t0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(xq.h);
        this.G.addUpdateListener(new fi.l9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f42326k.E * 0.14f), 6.283185307179586d), 4));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f42350x != -1) {
            org.telegram.ui.Cells.t0 t0Var = this.f42308a;
            if (t0Var.getParent() != null) {
                t0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f42350x = -1;
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
        this.f42343t = 0.0f;
        this.f42341s = 0.0f;
        this.f42339r = 0.0f;
        this.f42345u.f42991a.clear();
        b4 b4Var = this.f42330m;
        if (b4Var != null) {
            b4Var.setScaleX(1.0f);
            this.f42330m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f42311b0;
        if (gVar != null) {
            gVar.d();
            this.f42311b0 = null;
        }
        this.f42313c0 = 0.0f;
        org.telegram.ui.Cells.t0 t0Var = this.f42308a;
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
        org.telegram.ui.Cells.t0 t0Var = this.f42308a;
        if (z10) {
            f();
            this.M = false;
            this.N = 0L;
            this.f42321h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f42309a0 = 1.0f;
            t0Var.invalidate();
            if (t0Var.getParent() instanceof View) {
                ((View) t0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f42328l.stop();
            this.H = false;
        }
        this.f42320g0 = z9;
        this.f42329l0 = tL_messageActionGramTransfer;
        if (!z9 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f42323i0 = z12;
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
        if (this.f42321h0 && z9 && i7 == 0) {
            b();
            g();
            this.f42343t = 18.0f;
            this.f42345u.f();
            t0Var.invalidate();
        }
        if (z14) {
            if (!this.f42321h0) {
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
        this.f42321h0 = z14;
        if (z14) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z14) {
            e();
            a4 a4Var = this.f42314d0;
            a4Var.getClass();
            a4Var.v = Math.max(0L, 0L);
            if (this.f42314d0.d() || this.f42314d0.c()) {
                a4 a4Var2 = this.f42314d0;
                a4Var2.f31732b = -1L;
                a4Var2.f31733c = -1L;
            }
            t0Var.invalidate();
        } else {
            a4 a4Var3 = this.f42314d0;
            if (a4Var3 != null && this.f42316e0 == 0 && !a4Var3.d() && !this.f42314d0.c()) {
                this.f42314d0.a();
                t0Var.invalidate();
            }
        }
        if (z13) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28093q7, this.f42310b);
        } else if (z9) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f42353y0 = z13;
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
            M0 = id.M0(2131742982, null);
        } else if (z9) {
            M0 = id.M0(2131742980, null);
        } else {
            M0 = id.M0(2131742981, null);
        }
        z3 z3Var = this.I;
        if (z14) {
            z3Var.f(10, M0, true);
        } else {
            z3Var.g(10, M0);
        }
        SpannableStringBuilder q10 = m0.q(m0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m0.l("Grams", q10, 2131749508));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        li.w5 w5Var2 = this.f42346u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f42332n0 = new my0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = g6.f(g6.d(str3.toUpperCase(locale)));
        my0 my0Var = new my0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        my0Var.m(2);
        this.f42334o0 = my0Var;
        my0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f42336p0 = null;
        } else {
            my0 my0Var2 = new my0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f42336p0 = my0Var2;
            my0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f42336p0.f36145a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f42312c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f42338q0 = null;
            return;
        }
        my0 my0Var3 = new my0("", 12.0f, null);
        my0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        my0Var3.a();
        my0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f42338q0 = my0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f38779a |= 256;
            spannableStringBuilder2.setSpan(new vy0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f42338q0.q(spannableStringBuilder2);
            xh.f.c(t0Var, this.f42338q0.f36146b, stack, arrayList);
            n(this.f42315e);
            return;
        }
        my0Var3.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer.comment, my0Var3.f36145a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z9) {
        this.f42315e = z9;
        ArrayList arrayList = this.f42312c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f42335p = f10;
        this.f42337q = f11;
    }

    public final void p() {
        boolean z9;
        if (this.f42330m == null) {
            return;
        }
        if (this.f42350x == -1 && !this.D) {
            this.A = g();
            this.B = this.f42326k.E * 0.14f;
        }
        boolean z10 = true;
        if (this.f42350x == -1 && !this.D && this.C <= 1.001f) {
            z9 = false;
        } else {
            z9 = true;
        }
        b4 b4Var = this.f42330m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z9 && !this.f42321h0 && this.f42339r == 0.0f && this.f42341s == 0.0f && this.f42343t == 0.0f) {
            z10 = false;
        }
        b4Var.f57496r = f10;
        b4Var.f57497s = f11;
        b4Var.f57498w = z10;
        b4Var.f57499x = z9;
    }

    public final void q() {
        if (this.f42321h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
