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
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.vf;
public final class n4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final k4 I;
    public final org.telegram.ui.Components.c6 J;
    public final org.telegram.ui.Components.c6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.c6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final lc Y;
    public r1.g Z;
    public final org.telegram.ui.Cells.v0 f44695a;
    public float f44696a0;
    public final org.telegram.ui.ActionBar.i6 f44697b;
    public r1.g f44698b0;
    public float f44700c0;
    public l4 f44701d0;
    public boolean f44702e;
    public long f44703e0;
    public boolean f44705f0;
    public boolean f44707g0;
    public boolean f44708h0;
    public final Drawable f44709i;
    public boolean f44710i0;
    public ValueAnimator f44712j0;
    public final z6 f44713k;
    public vf f44714k0;
    public final nh0 f44715l;
    public TLRPC.TL_messageActionGramTransfer f44716l0;
    public m4 f44717m;
    public boolean m0;
    public boolean f44718n;
    public wy0 f44719n0;
    public boolean f44720o;
    public wy0 f44721o0;
    public float f44722p;
    public wy0 f44723p0;
    public float f44724q;
    public wy0 f44725q0;
    public float f44726r;
    public boolean f44727r0;
    public float f44728s;
    public org.telegram.ui.Cells.n0 f44729s0;
    public float f44730t;
    public int f44731t0;
    public final oi.w5 f44733u0;
    public long v;
    public int f44734v0;
    public final org.telegram.ui.Components.c6 f44736w0;
    public final i4 f44738x0;
    public float f44739y;
    public boolean f44740y0;
    public float f44741z;
    public final ArrayList f44699c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f44704f = new RectF();
    public final RectF f44706g = new RectF();
    public final Path h = new Path();
    public final Path f44711j = new Path();
    public final ga f44732u = new ga();
    public final Rect f44735w = new Rect();
    public int f44737x = -1;
    public float C = 1.0f;

    public n4(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f44696a0 = 1.0f;
        new Matrix();
        this.f44731t0 = -10624001;
        this.f44733u0 = new oi.w5(this, 4);
        this.f44734v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f44738x0 = new Object();
        this.f44695a = v0Var;
        this.f44697b = i6Var;
        this.f44709i = v0Var.getResources().getDrawable(2131232811).mutate();
        Context context = v0Var.getContext();
        if (z6.H == null) {
            z6.H = new z6(context.getApplicationContext());
        }
        this.f44713k = z6.H;
        nh0 nh0Var = new nh0(2131624357, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f44715l = nh0Var;
        nh0Var.R(v0Var);
        nh0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.da(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        m mVar = new m(v0Var, 5);
        kr krVar = kr.h;
        this.Q = new org.telegram.ui.Components.c6(1.0f, mVar, 0L, 180L, krVar);
        this.K = new org.telegram.ui.Components.c6(new m(v0Var, 5), 320L, krVar, 0);
        this.J = new org.telegram.ui.Components.c6(new m(v0Var, 5), 320L, krVar, 0);
        k4 k4Var = new k4(v0Var, v0Var);
        this.I = k4Var;
        k4Var.f3800y = -1;
        bi.l3.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.n6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        lc lcVar = new lc(v0Var);
        this.Y = lcVar;
        lcVar.f37107f = new j4(this, 0);
        this.f44736w0 = new org.telegram.ui.Components.c6(1.0f, new m(v0Var, 5), 0L, 400L, krVar);
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
            gVar.f56446m = hVar;
            this.F.f(0.001f);
            this.F.b(new h4(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.f44695a;
        if (v0Var.isShown()) {
            org.telegram.messenger.g0.a4(v0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f44696a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f56446m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f56436a = -3.0f;
        gVar3.b(new h4(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f44700c0);
        lc lcVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.B(this.f44700c0, 0.012f, 1.0f, lcVar.a(0.025f) * this.f44696a0), com.google.android.gms.internal.vision.e2.C(this.f44700c0, 0.04f, 1.0f, lcVar.a(0.025f) * this.f44696a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f44701d0 != null) {
            return;
        }
        l4 l4Var = new l4(this, this.f44697b);
        this.f44701d0 = l4Var;
        l4Var.g(4969977, org.telegram.ui.ActionBar.n6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.n6.r1(0.75f, -11807239));
        this.f44701d0.f37729x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        l4 l4Var2 = this.f44701d0;
        l4Var2.f37726t = 2.0f;
        l4Var2.f37730y = this.h;
        l4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f44712j0;
        if (valueAnimator != null) {
            this.f44712j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.c6 c6Var = this.K;
            if (c6Var.f33935i) {
                this.M = false;
                this.N = 0L;
            }
            c6Var.e(true, 1.0f);
            this.f44730t = 0.0f;
            this.f44732u.f44404a.clear();
            vf vfVar = this.f44714k0;
            this.f44714k0 = null;
            this.f44695a.invalidate();
            if (vfVar != null) {
                org.telegram.messenger.g0.h3(vfVar, 1L);
            }
        }
    }

    public final float g() {
        float f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.v;
        if (j3 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j3)) / 1000.0f);
            if (this.f44708h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f44726r;
            float f13 = this.f44728s;
            this.f44726r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f44728s = com.google.android.gms.internal.vision.e2.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f44726r;
            float f15 = this.f44730t;
            this.f44726r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f44730t = f16;
            if (f16 < 0.001f) {
                this.f44730t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f44713k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f44726r;
    }

    public final void i(boolean z10) {
        float f10 = 0.0f;
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f44708h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        m4 m4Var = this.f44717m;
        if (m4Var != null) {
            if (!z10) {
                f10 = 1.0f;
            }
            m4Var.setAlpha(f10);
        }
        this.f44695a.invalidate();
    }

    public final void j() {
        this.f44737x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.f44695a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(kr.h);
        this.G.addUpdateListener(new hi.da(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f44713k.F * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f44737x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.f44695a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f44737x = -1;
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
        this.f44730t = 0.0f;
        this.f44728s = 0.0f;
        this.f44726r = 0.0f;
        this.f44732u.f44404a.clear();
        m4 m4Var = this.f44717m;
        if (m4Var != null) {
            m4Var.setScaleX(1.0f);
            this.f44717m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f44698b0;
        if (gVar != null) {
            gVar.d();
            this.f44698b0 = null;
        }
        this.f44700c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.f44695a;
        v0Var.invalidate();
        if (v0Var.getParent() instanceof View) {
            ((View) v0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i7, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        int i10;
        String N0;
        String str2;
        org.telegram.ui.Cells.v0 v0Var = this.f44695a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f44708h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f44696a0 = 1.0f;
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f44715l.stop();
            this.H = false;
        }
        this.f44707g0 = z10;
        this.f44716l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f44710i0 = z13;
        org.telegram.ui.Components.c6 c6Var = this.K;
        if (z13) {
            c6Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            c6Var.e(true, 1.0f);
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
        if (this.f44708h0 && z10 && i7 == 0) {
            b();
            g();
            this.f44730t = 18.0f;
            this.f44732u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.f44708h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            c6Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            c6Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f44708h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            l4 l4Var = this.f44701d0;
            l4Var.getClass();
            l4Var.v = Math.max(0L, 0L);
            if (this.f44701d0.d() || this.f44701d0.c()) {
                l4 l4Var2 = this.f44701d0;
                l4Var2.f37710b = -1L;
                l4Var2.f37711c = -1L;
            }
            v0Var.invalidate();
        } else {
            l4 l4Var3 = this.f44701d0;
            if (l4Var3 != null && this.f44703e0 == 0 && !l4Var3.d() && !this.f44701d0.c()) {
                this.f44701d0.a();
                v0Var.invalidate();
            }
        }
        if (z14) {
            i10 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29692q7, this.f44697b);
        } else if (z10) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f44740y0 = z14;
        int i11 = this.U;
        if (i11 == 0) {
            this.V = i10;
            this.U = i10;
            this.T = i10;
        } else if (i10 != i11) {
            this.T = this.V;
            this.U = i10;
            this.J.e(true, 0.0f);
            v0Var.invalidate();
        }
        if (z14) {
            N0 = gd.N0(2131742708, null);
        } else if (z10) {
            N0 = gd.N0(2131742706, null);
        } else {
            N0 = gd.N0(2131742707, null);
        }
        k4 k4Var = this.I;
        if (z15) {
            k4Var.g(10, N0, true);
        } else {
            k4Var.h(10, N0);
        }
        SpannableStringBuilder v = v0.v(v0.t(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) v.getSpans(0, v.length(), RelativeSizeSpan.class)) {
            v.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        v.insert(0, (CharSequence) str2);
        int indexOf = v.toString().indexOf(46);
        if (indexOf >= 0) {
            v.setSpan(new RelativeSizeSpan(0.75f), indexOf, v.length(), 33);
        }
        Object obj = new Object();
        v.setSpan(obj, 0, v.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(v0.q("Grams", v, 2131749314));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        oi.w5 w5Var = this.f44733u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f44719n0 = new wy0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = y6.f(y6.d(str3.toUpperCase(locale)));
        wy0 wy0Var = new wy0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        wy0Var.m(2);
        this.f44721o0 = wy0Var;
        wy0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f44723p0 = null;
        } else {
            wy0 wy0Var2 = new wy0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f44723p0 = wy0Var2;
            wy0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f44723p0.f41761a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f44699c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f44725q0 = null;
            return;
        }
        wy0 wy0Var3 = new wy0("", 12.0f, null);
        wy0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        wy0Var3.a();
        wy0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f44725q0 = wy0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f34924a |= 256;
            spannableStringBuilder2.setSpan(new fz0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f44725q0.q(spannableStringBuilder2);
            xh.f.c(v0Var, this.f44725q0.f41762b, stack, arrayList);
            n(this.f44702e);
            return;
        }
        wy0Var3.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer.comment, wy0Var3.f41761a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z10) {
        this.f44702e = z10;
        ArrayList arrayList = this.f44699c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f44722p = f10;
        this.f44724q = f11;
    }

    public final void p() {
        boolean z10;
        if (this.f44717m == null) {
            return;
        }
        if (this.f44737x == -1 && !this.D) {
            this.A = g();
            this.B = this.f44713k.F * 0.14f;
        }
        boolean z11 = true;
        if (this.f44737x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        m4 m4Var = this.f44717m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z10 && !this.f44708h0 && this.f44726r == 0.0f && this.f44728s == 0.0f && this.f44730t == 0.0f) {
            z11 = false;
        }
        m4Var.f59675r = f10;
        m4Var.f59676s = f11;
        m4Var.f59677w = z11;
        m4Var.f59678x = z10;
    }

    public final void q() {
        if (this.f44708h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
