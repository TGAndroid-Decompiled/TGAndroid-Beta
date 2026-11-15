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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.uf;
public final class c4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final z3 I;
    public final org.telegram.ui.Components.u5 J;
    public final org.telegram.ui.Components.u5 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.u5 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final dc Y;
    public r1.g Z;
    public final org.telegram.ui.Cells.t0 f43571a;
    public float f43572a0;
    public final org.telegram.ui.ActionBar.e6 f43573b;
    public r1.g f43574b0;
    public float f43576c0;
    public a4 f43577d0;
    public boolean f43578e;
    public long f43579e0;
    public boolean f43581f0;
    public boolean f43583g0;
    public boolean f43584h0;
    public final Drawable f43585i;
    public boolean f43586i0;
    public ValueAnimator f43588j0;
    public final i6 f43589k;
    public uf f43590k0;
    public final ch0 f43591l;
    public TLRPC.TL_messageActionGramTransfer f43592l0;
    public b4 f43593m;
    public boolean m0;
    public boolean f43594n;
    public oy0 f43595n0;
    public boolean f43596o;
    public oy0 f43597o0;
    public float f43598p;
    public oy0 f43599p0;
    public float f43600q;
    public oy0 f43601q0;
    public float f43602r;
    public boolean f43603r0;
    public float f43604s;
    public org.telegram.ui.Cells.m0 f43605s0;
    public float f43606t;
    public int f43607t0;
    public final oi.u5 f43609u0;
    public long v;
    public int f43610v0;
    public final org.telegram.ui.Components.u5 f43612w0;
    public final x3 f43614x0;
    public float f43615y;
    public boolean f43616y0;
    public float f43617z;
    public final ArrayList f43575c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f43580f = new RectF();
    public final RectF f43582g = new RectF();
    public final Path h = new Path();
    public final Path f43587j = new Path();
    public final r9 f43608u = new r9();
    public final Rect f43611w = new Rect();
    public int f43613x = -1;
    public float C = 1.0f;

    public c4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f43572a0 = 1.0f;
        new Matrix();
        this.f43607t0 = -10624001;
        this.f43609u0 = new oi.u5(this, 4);
        this.f43610v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f43614x0 = new Object();
        this.f43571a = t0Var;
        this.f43573b = e6Var;
        this.f43585i = t0Var.getResources().getDrawable(2131232806).mutate();
        Context context = t0Var.getContext();
        if (i6.H == null) {
            i6.H = new i6(context.getApplicationContext());
        }
        this.f43589k = i6.H;
        ch0 ch0Var = new ch0(2131624357, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f43591l = ch0Var;
        ch0Var.R(t0Var);
        ch0Var.K(0);
        t0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.w9(2, this, t0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        l lVar = new l(t0Var, 6);
        er erVar = er.h;
        this.Q = new org.telegram.ui.Components.u5(1.0f, lVar, 0L, 180L, erVar);
        this.K = new org.telegram.ui.Components.u5(new l(t0Var, 6), 320L, erVar, 0);
        this.J = new org.telegram.ui.Components.u5(new l(t0Var, 6), 320L, erVar, 0);
        z3 z3Var = new z3(t0Var, t0Var);
        this.I = z3Var;
        z3Var.f3669y = -1;
        bi.l2.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.j6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        dc dcVar = new dc(t0Var);
        this.Y = dcVar;
        dcVar.f33915f = new y3(this, 0);
        this.f43612w0 = new org.telegram.ui.Components.u5(1.0f, new l(t0Var, 6), 0L, 400L, erVar);
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
            gVar.f55748m = hVar;
            this.F.f(0.001f);
            this.F.b(new w3(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.t0 t0Var = this.f43571a;
        if (t0Var.isShown()) {
            org.telegram.messenger.g0.b4(t0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f43572a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f55748m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f55738a = -3.0f;
        gVar3.b(new w3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f43576c0);
        dc dcVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.B(this.f43576c0, 0.012f, 1.0f, dcVar.a(0.025f) * this.f43572a0), com.google.android.gms.internal.vision.e2.C(this.f43576c0, 0.04f, 1.0f, dcVar.a(0.025f) * this.f43572a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f43577d0 != null) {
            return;
        }
        a4 a4Var = new a4(this, this.f43573b);
        this.f43577d0 = a4Var;
        a4Var.g(4969977, org.telegram.ui.ActionBar.j6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.j6.r1(0.75f, -11807239));
        this.f43577d0.f33884x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        a4 a4Var2 = this.f43577d0;
        a4Var2.f33881t = 2.0f;
        a4Var2.f33885y = this.h;
        a4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f43588j0;
        if (valueAnimator != null) {
            this.f43588j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.u5 u5Var = this.K;
            if (u5Var.f39907i) {
                this.M = false;
                this.N = 0L;
            }
            u5Var.e(true, 1.0f);
            this.f43606t = 0.0f;
            this.f43608u.f44458a.clear();
            uf ufVar = this.f43590k0;
            this.f43590k0 = null;
            this.f43571a.invalidate();
            if (ufVar != null) {
                org.telegram.messenger.g0.i3(ufVar, 1L);
            }
        }
    }

    public final float g() {
        float f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.v;
        if (j3 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j3)) / 1000.0f);
            if (this.f43584h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f43602r;
            float f13 = this.f43604s;
            this.f43602r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f43604s = com.google.android.gms.internal.vision.e2.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f43602r;
            float f15 = this.f43606t;
            this.f43602r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f43606t = f16;
            if (f16 < 0.001f) {
                this.f43606t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f43589k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f43602r;
    }

    public final void i(boolean z10) {
        float f10 = 0.0f;
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f43584h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        b4 b4Var = this.f43593m;
        if (b4Var != null) {
            if (!z10) {
                f10 = 1.0f;
            }
            b4Var.setAlpha(f10);
        }
        this.f43571a.invalidate();
    }

    public final void j() {
        this.f43613x = -1;
        org.telegram.ui.Cells.t0 t0Var = this.f43571a;
        if (t0Var.getParent() != null) {
            t0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(er.h);
        this.G.addUpdateListener(new hi.i9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f43589k.F * 0.14f), 6.283185307179586d), 4));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f43613x != -1) {
            org.telegram.ui.Cells.t0 t0Var = this.f43571a;
            if (t0Var.getParent() != null) {
                t0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f43613x = -1;
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
        this.f43606t = 0.0f;
        this.f43604s = 0.0f;
        this.f43602r = 0.0f;
        this.f43608u.f44458a.clear();
        b4 b4Var = this.f43593m;
        if (b4Var != null) {
            b4Var.setScaleX(1.0f);
            this.f43593m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f43574b0;
        if (gVar != null) {
            gVar.d();
            this.f43574b0 = null;
        }
        this.f43576c0 = 0.0f;
        org.telegram.ui.Cells.t0 t0Var = this.f43571a;
        t0Var.invalidate();
        if (t0Var.getParent() instanceof View) {
            ((View) t0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i7, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        int i10;
        String M0;
        String str2;
        org.telegram.ui.Cells.t0 t0Var = this.f43571a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f43584h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f43572a0 = 1.0f;
            t0Var.invalidate();
            if (t0Var.getParent() instanceof View) {
                ((View) t0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f43591l.stop();
            this.H = false;
        }
        this.f43583g0 = z10;
        this.f43592l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f43586i0 = z13;
        org.telegram.ui.Components.u5 u5Var = this.K;
        if (z13) {
            u5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            u5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        this.m0 = false;
        if (z10 && i7 == 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10 && i7 == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (this.f43584h0 && z10 && i7 == 0) {
            b();
            g();
            this.f43606t = 18.0f;
            this.f43608u.f();
            t0Var.invalidate();
        }
        if (z15) {
            if (!this.f43584h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            u5Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            u5Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f43584h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            a4 a4Var = this.f43577d0;
            a4Var.getClass();
            a4Var.v = Math.max(0L, 0L);
            if (this.f43577d0.d() || this.f43577d0.c()) {
                a4 a4Var2 = this.f43577d0;
                a4Var2.f33865b = -1L;
                a4Var2.f33866c = -1L;
            }
            t0Var.invalidate();
        } else {
            a4 a4Var3 = this.f43577d0;
            if (a4Var3 != null && this.f43579e0 == 0 && !a4Var3.d() && !this.f43577d0.c()) {
                this.f43577d0.a();
                t0Var.invalidate();
            }
        }
        if (z14) {
            i10 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29090q7, this.f43573b);
        } else if (z10) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f43616y0 = z14;
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
        if (z14) {
            M0 = hd.M0(2131742979, null);
        } else if (z10) {
            M0 = hd.M0(2131742977, null);
        } else {
            M0 = hd.M0(2131742978, null);
        }
        z3 z3Var = this.I;
        if (z15) {
            z3Var.f(10, M0, true);
        } else {
            z3Var.g(10, M0);
        }
        SpannableStringBuilder q10 = l0.q(l0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) q10.getSpans(0, q10.length(), RelativeSizeSpan.class)) {
            q10.removeSpan(relativeSizeSpan);
        }
        if (z10) {
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.l("Grams", q10, 2131749507));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        oi.u5 u5Var2 = this.f43609u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(u5Var2), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(u5Var2), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f43595n0 = new oy0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = h6.f(h6.d(str3.toUpperCase(locale)));
        oy0 oy0Var = new oy0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        oy0Var.m(2);
        this.f43597o0 = oy0Var;
        oy0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f43599p0 = null;
        } else {
            oy0 oy0Var2 = new oy0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f43599p0 = oy0Var2;
            oy0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f43599p0.f38103a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f43575c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f43601q0 = null;
            return;
        }
        oy0 oy0Var3 = new oy0("", 12.0f, null);
        oy0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        oy0Var3.a();
        oy0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f43601q0 = oy0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f41484a |= 256;
            spannableStringBuilder2.setSpan(new xy0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f43601q0.q(spannableStringBuilder2);
            xh.f.c(t0Var, this.f43601q0.f38104b, stack, arrayList);
            n(this.f43578e);
            return;
        }
        oy0Var3.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer.comment, oy0Var3.f38103a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z10) {
        this.f43578e = z10;
        ArrayList arrayList = this.f43575c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f43598p = f10;
        this.f43600q = f11;
    }

    public final void p() {
        boolean z10;
        if (this.f43593m == null) {
            return;
        }
        if (this.f43613x == -1 && !this.D) {
            this.A = g();
            this.B = this.f43589k.F * 0.14f;
        }
        boolean z11 = true;
        if (this.f43613x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        b4 b4Var = this.f43593m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z10 && !this.f43584h0 && this.f43602r == 0.0f && this.f43604s == 0.0f && this.f43606t == 0.0f) {
            z11 = false;
        }
        b4Var.f58980r = f10;
        b4Var.f58981s = f11;
        b4Var.f58982w = z11;
        b4Var.f58983x = z10;
    }

    public final void q() {
        if (this.f43584h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
