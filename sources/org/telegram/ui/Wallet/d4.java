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
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.lg;
public final class d4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.j F;
    public ValueAnimator G;
    public boolean H;
    public final a4 I;
    public final org.telegram.ui.Components.t5 J;
    public final org.telegram.ui.Components.t5 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.t5 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final dc Y;
    public o1.j Z;
    public final org.telegram.ui.Cells.s0 f34377a;
    public float f34378a0;
    public final org.telegram.ui.ActionBar.p6 f34379b;
    public o1.j f34380b0;
    public float f34382c0;
    public b4 f34383d0;
    public boolean e;
    public long f34384e0;
    public boolean f34386f0;
    public boolean f34388g0;
    public boolean f34389h0;
    public final Drawable f34390i;
    public boolean f34391i0;
    public ValueAnimator f34393j0;
    public final m6 f34394k;
    public lg f34395k0;
    public final bi0 f34396l;
    public TLRPC.TL_messageActionGramTransfer f34397l0;
    public c4 f34398m;
    public boolean m0;
    public boolean f34399n;
    public qz0 f34400n0;
    public boolean f34401o;
    public qz0 f34402o0;
    public float f34403p;
    public qz0 f34404p0;
    public float f34405q;
    public qz0 f34406q0;
    public float f34407r;
    public boolean f34408r0;
    public float f34409s;
    public org.telegram.ui.Cells.m0 f34410s0;
    public float f34411t;
    public int f34412t0;
    public final bi.m6 f34414u0;
    public long v;
    public int f34415v0;
    public final org.telegram.ui.Components.t5 f34417w0;
    public final y3 f34419x0;
    public float f34420y;
    public boolean f34421y0;
    public float f34422z;
    public final ArrayList f34381c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34385f = new RectF();
    public final RectF f34387g = new RectF();
    public final Path h = new Path();
    public final Path f34392j = new Path();
    public final t9 f34413u = new t9();
    public final Rect f34416w = new Rect();
    public int f34418x = -1;
    public float C = 1.0f;

    public d4(org.telegram.ui.Cells.s0 s0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34378a0 = 1.0f;
        new Matrix();
        this.f34412t0 = -10624001;
        this.f34414u0 = new bi.m6(this, 4);
        this.f34415v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f34419x0 = new Object();
        this.f34377a = s0Var;
        this.f34379b = p6Var;
        this.f34390i = s0Var.getResources().getDrawable(2131232803).mutate();
        Context context = s0Var.getContext();
        if (m6.G == null) {
            m6.G = new m6(context.getApplicationContext());
        }
        this.f34394k = m6.G;
        bi0 bi0Var = new bi0(2131624354, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f), false, null);
        this.f34396l = bi0Var;
        bi0Var.R(s0Var);
        bi0Var.K(0);
        s0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.u9(2, this, s0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(1.0f));
        l lVar = new l(s0Var, 6);
        gr grVar = gr.h;
        this.Q = new org.telegram.ui.Components.t5(1.0f, lVar, 0L, 180L, grVar);
        this.K = new org.telegram.ui.Components.t5(new l(s0Var, 6), 320L, grVar, 0);
        this.J = new org.telegram.ui.Components.t5(new l(s0Var, 6), 320L, grVar, 0);
        a4 a4Var = new a4(s0Var, s0Var);
        this.I = a4Var;
        a4Var.f45041y = -1;
        ph.f1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.i0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.t6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.i0.L(10.0f), 0.0f, org.telegram.messenger.i0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        dc dcVar = new dc(s0Var);
        this.Y = dcVar;
        dcVar.f25388f = new z3(this, 0);
        this.f34417w0 = new org.telegram.ui.Components.t5(1.0f, new l(s0Var, 6), 0L, 400L, grVar);
    }

    public static int h() {
        return org.telegram.messenger.i0.L(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.j jVar = new o1.j(new o1.i(this.C));
            this.F = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f13957m = kVar;
            this.F.f(0.001f);
            this.F.b(new x3(this, 0));
        }
        this.F.c(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.s0 s0Var = this.f34377a;
        if (s0Var.isShown()) {
            org.telegram.messenger.i0.b4(s0Var);
        }
        o1.j jVar = this.Z;
        if (jVar != null) {
            jVar.d();
        }
        o1.j jVar2 = new o1.j(new o1.i(this.f34378a0));
        this.Z = jVar2;
        o1.k kVar = new o1.k(1.0f);
        kVar.a(0.55f);
        kVar.b(280.0f);
        jVar2.f13957m = kVar;
        this.Z.f(0.001f);
        o1.j jVar3 = this.Z;
        jVar3.f13948a = -3.0f;
        jVar3.b(new x3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, org.telegram.messenger.i0.L(4.0f) * this.f34382c0);
        dc dcVar = this.Y;
        canvas.scale(c3.i0.C(this.f34382c0, 0.012f, 1.0f, dcVar.a(0.025f) * this.f34378a0), c3.i0.D(this.f34382c0, 0.04f, 1.0f, dcVar.a(0.025f) * this.f34378a0), (org.telegram.messenger.i0.L(206.0f) / 2.0f) + f7, f10 + org.telegram.messenger.i0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34383d0 != null) {
            return;
        }
        b4 b4Var = new b4(this, this.f34379b);
        this.f34383d0 = b4Var;
        b4Var.g(4969977, org.telegram.ui.ActionBar.t6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.t6.r1(0.75f, -11807239));
        this.f34383d0.f30520x.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
        b4 b4Var2 = this.f34383d0;
        b4Var2.f30517t = 2.0f;
        b4Var2.f30521y = this.h;
        b4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34393j0;
        if (valueAnimator != null) {
            this.f34393j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.t5 t5Var = this.K;
            if (t5Var.f30448i) {
                this.M = false;
                this.N = 0L;
            }
            t5Var.e(true, 1.0f);
            this.f34411t = 0.0f;
            this.f34413u.f35253a.clear();
            lg lgVar = this.f34395k0;
            this.f34395k0 = null;
            this.f34377a.invalidate();
            if (lgVar != null) {
                org.telegram.messenger.i0.h3(lgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f34389h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34407r;
            float f12 = this.f34409s;
            this.f34407r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34409s = c3.i0.z(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34407r;
            float f14 = this.f34411t;
            this.f34407r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34411t = f15;
            if (f15 < 0.001f) {
                this.f34411t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34394k.D * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34407r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f34389h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        c4 c4Var = this.f34398m;
        if (c4Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            c4Var.setAlpha(f7);
        }
        this.f34377a.invalidate();
    }

    public final void j() {
        this.f34418x = -1;
        org.telegram.ui.Cells.s0 s0Var = this.f34377a;
        if (s0Var.getParent() != null) {
            s0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(gr.h);
        this.G.addUpdateListener(new fe.c(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34394k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f34418x != -1) {
            org.telegram.ui.Cells.s0 s0Var = this.f34377a;
            if (s0Var.getParent() != null) {
                s0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34418x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        o1.j jVar = this.F;
        if (jVar != null) {
            jVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.f34411t = 0.0f;
        this.f34409s = 0.0f;
        this.f34407r = 0.0f;
        this.f34413u.f35253a.clear();
        c4 c4Var = this.f34398m;
        if (c4Var != null) {
            c4Var.setScaleX(1.0f);
            this.f34398m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.j jVar = this.f34380b0;
        if (jVar != null) {
            jVar.d();
            this.f34380b0 = null;
        }
        this.f34382c0 = 0.0f;
        org.telegram.ui.Cells.s0 s0Var = this.f34377a;
        s0Var.invalidate();
        if (s0Var.getParent() instanceof View) {
            ((View) s0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        int i11;
        String L0;
        String str2;
        org.telegram.ui.Cells.s0 s0Var = this.f34377a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34389h0 = false;
            k();
            o1.j jVar = this.Z;
            if (jVar != null) {
                jVar.d();
                this.Z = null;
            }
            this.f34378a0 = 1.0f;
            s0Var.invalidate();
            if (s0Var.getParent() instanceof View) {
                ((View) s0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34396l.stop();
            this.H = false;
        }
        this.f34388g0 = z10;
        this.f34397l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34391i0 = z13;
        org.telegram.ui.Components.t5 t5Var = this.K;
        if (z13) {
            t5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            t5Var.e(true, 1.0f);
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
        if (this.f34389h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34411t = 18.0f;
            this.f34413u.f();
            s0Var.invalidate();
        }
        if (z15) {
            if (!this.f34389h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            t5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            t5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f34389h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            b4 b4Var = this.f34383d0;
            b4Var.getClass();
            b4Var.v = Math.max(0L, 0L);
            if (this.f34383d0.d() || this.f34383d0.c()) {
                b4 b4Var2 = this.f34383d0;
                b4Var2.f30502b = -1L;
                b4Var2.f30503c = -1L;
            }
            s0Var.invalidate();
        } else {
            b4 b4Var3 = this.f34383d0;
            if (b4Var3 != null && this.f34384e0 == 0 && !b4Var3.d() && !this.f34383d0.c()) {
                this.f34383d0.a();
                s0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21170q7, this.f34379b);
        } else if (z10) {
            i11 = -15352320;
        } else {
            i11 = -11814402;
        }
        this.f34421y0 = z14;
        int i12 = this.U;
        if (i12 == 0) {
            this.V = i11;
            this.U = i11;
            this.T = i11;
        } else if (i11 != i12) {
            this.T = this.V;
            this.U = i11;
            this.J.e(true, 0.0f);
            s0Var.invalidate();
        }
        if (z14) {
            L0 = cd.L0(2131743005, null);
        } else if (z10) {
            L0 = cd.L0(2131743003, null);
        } else {
            L0 = cd.L0(2131743004, null);
        }
        a4 a4Var = this.I;
        if (z15) {
            a4Var.f(10, L0, true);
        } else {
            a4Var.g(10, L0);
        }
        SpannableStringBuilder q6 = k0.q(k0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) q6.getSpans(0, q6.length(), RelativeSizeSpan.class)) {
            q6.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        q6.insert(0, (CharSequence) str2);
        int indexOf = q6.toString().indexOf(46);
        if (indexOf >= 0) {
            q6.setSpan(new RelativeSizeSpan(0.75f), indexOf, q6.length(), 33);
        }
        Object obj = new Object();
        q6.setSpan(obj, 0, q6.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k0.l("Grams", q6, 2131749516));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        bi.m6 m6Var = this.f34414u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(m6Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(m6Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34400n0 = new qz0(spannableStringBuilder, 16.0f, org.telegram.messenger.i0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = l6.f(l6.d(str3.toUpperCase(locale)));
        qz0 qz0Var = new qz0("", 9.3f, org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
        qz0Var.m(2);
        this.f34402o0 = qz0Var;
        qz0Var.q(f7);
        if (TextUtils.isEmpty(str)) {
            this.f34404p0 = null;
        } else {
            qz0 qz0Var2 = new qz0("", 10.0f, Typeface.create(org.telegram.messenger.i0.o1("fonts/rmono.ttf"), 1));
            this.f34404p0 = qz0Var2;
            qz0Var2.q(TextUtils.ellipsize(org.telegram.messenger.i0.M2(str.toUpperCase(locale)), this.f34404p0.f29772a, org.telegram.messenger.i0.L(206.0f) - org.telegram.messenger.i0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34381c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34406q0 = null;
            return;
        }
        qz0 qz0Var3 = new qz0("", 12.0f, null);
        qz0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var3.a();
        qz0Var3.p(org.telegram.messenger.i0.L(184.0f));
        this.f34406q0 = qz0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f32850a |= 256;
            spannableStringBuilder2.setSpan(new zz0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34406q0.q(spannableStringBuilder2);
            nh.i.c(s0Var, this.f34406q0.f29773b, stack, arrayList);
            n(this.e);
            return;
        }
        qz0Var3.q(org.telegram.messenger.k6.m(tL_messageActionGramTransfer.comment, qz0Var3.f29772a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f34381c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((nh.i) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34403p = f7;
        this.f34405q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34398m == null) {
            return;
        }
        if (this.f34418x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34394k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34418x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        c4 c4Var = this.f34398m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34389h0 && this.f34407r == 0.0f && this.f34409s == 0.0f && this.f34411t == 0.0f) {
            z11 = false;
        }
        c4Var.f12000r = f7;
        c4Var.f12001s = f10;
        c4Var.f12002w = z11;
        c4Var.f12003x = z10;
    }

    public final void q() {
        if (this.f34389h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
