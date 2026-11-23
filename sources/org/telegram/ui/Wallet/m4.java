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
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.vf;
public final class m4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final j4 I;
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
    public final mc Y;
    public r1.g Z;
    public final org.telegram.ui.Cells.v0 f44525a;
    public float f44526a0;
    public final org.telegram.ui.ActionBar.h6 f44527b;
    public r1.g f44528b0;
    public float f44530c0;
    public k4 f44531d0;
    public boolean f44532e;
    public long f44533e0;
    public boolean f44535f0;
    public boolean f44537g0;
    public boolean f44538h0;
    public final Drawable f44539i;
    public boolean f44540i0;
    public ValueAnimator f44542j0;
    public final y6 f44543k;
    public vf f44544k0;
    public final oh0 f44545l;
    public TLRPC.TL_messageActionGramTransfer f44546l0;
    public l4 f44547m;
    public boolean m0;
    public boolean f44548n;
    public xy0 f44549n0;
    public boolean f44550o;
    public xy0 f44551o0;
    public float f44552p;
    public xy0 f44553p0;
    public float f44554q;
    public xy0 f44555q0;
    public float f44556r;
    public boolean f44557r0;
    public float f44558s;
    public org.telegram.ui.Cells.n0 f44559s0;
    public float f44560t;
    public int f44561t0;
    public final oi.v5 f44563u0;
    public long v;
    public int f44564v0;
    public final org.telegram.ui.Components.d6 f44566w0;
    public final h4 f44568x0;
    public float f44569y;
    public boolean f44570y0;
    public float f44571z;
    public final ArrayList f44529c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f44534f = new RectF();
    public final RectF f44536g = new RectF();
    public final Path h = new Path();
    public final Path f44541j = new Path();
    public final fa f44562u = new fa();
    public final Rect f44565w = new Rect();
    public int f44567x = -1;
    public float C = 1.0f;

    public m4(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f44526a0 = 1.0f;
        new Matrix();
        this.f44561t0 = -10624001;
        this.f44563u0 = new oi.v5(this, 4);
        this.f44564v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f44568x0 = new Object();
        this.f44525a = v0Var;
        this.f44527b = h6Var;
        this.f44539i = v0Var.getResources().getDrawable(2131232808).mutate();
        Context context = v0Var.getContext();
        if (y6.H == null) {
            y6.H = new y6(context.getApplicationContext());
        }
        this.f44543k = y6.H;
        oh0 oh0Var = new oh0(2131624357, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f44545l = oh0Var;
        oh0Var.R(v0Var);
        oh0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.ea(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        m mVar = new m(v0Var, 5);
        nr nrVar = nr.h;
        this.Q = new org.telegram.ui.Components.d6(1.0f, mVar, 0L, 180L, nrVar);
        this.K = new org.telegram.ui.Components.d6(new m(v0Var, 5), 320L, nrVar, 0);
        this.J = new org.telegram.ui.Components.d6(new m(v0Var, 5), 320L, nrVar, 0);
        j4 j4Var = new j4(v0Var, v0Var);
        this.I = j4Var;
        j4Var.f3800y = -1;
        bi.l3.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.m6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        mc mcVar = new mc(v0Var);
        this.Y = mcVar;
        mcVar.f37435f = new i4(this, 0);
        this.f44566w0 = new org.telegram.ui.Components.d6(1.0f, new m(v0Var, 5), 0L, 400L, nrVar);
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
            gVar.f56333m = hVar;
            this.F.f(0.001f);
            this.F.b(new g4(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.f44525a;
        if (v0Var.isShown()) {
            org.telegram.messenger.g0.a4(v0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f44526a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f56333m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f56323a = -3.0f;
        gVar3.b(new g4(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f44530c0);
        mc mcVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.B(this.f44530c0, 0.012f, 1.0f, mcVar.a(0.025f) * this.f44526a0), com.google.android.gms.internal.vision.e2.C(this.f44530c0, 0.04f, 1.0f, mcVar.a(0.025f) * this.f44526a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f44531d0 != null) {
            return;
        }
        k4 k4Var = new k4(this, this.f44527b);
        this.f44531d0 = k4Var;
        k4Var.g(4969977, org.telegram.ui.ActionBar.m6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.m6.r1(0.75f, -11807239));
        this.f44531d0.f38786x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        k4 k4Var2 = this.f44531d0;
        k4Var2.f38783t = 2.0f;
        k4Var2.f38787y = this.h;
        k4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f44542j0;
        if (valueAnimator != null) {
            this.f44542j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.d6 d6Var = this.K;
            if (d6Var.f34353i) {
                this.M = false;
                this.N = 0L;
            }
            d6Var.e(true, 1.0f);
            this.f44560t = 0.0f;
            this.f44562u.f44239a.clear();
            vf vfVar = this.f44544k0;
            this.f44544k0 = null;
            this.f44525a.invalidate();
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
            if (this.f44538h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f44556r;
            float f13 = this.f44558s;
            this.f44556r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f44558s = com.google.android.gms.internal.vision.e2.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f44556r;
            float f15 = this.f44560t;
            this.f44556r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f44560t = f16;
            if (f16 < 0.001f) {
                this.f44560t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f44543k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f44556r;
    }

    public final void i(boolean z10) {
        float f10 = 0.0f;
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f44538h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l4 l4Var = this.f44547m;
        if (l4Var != null) {
            if (!z10) {
                f10 = 1.0f;
            }
            l4Var.setAlpha(f10);
        }
        this.f44525a.invalidate();
    }

    public final void j() {
        this.f44567x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.f44525a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(nr.h);
        this.G.addUpdateListener(new hi.j9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f44543k.F * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f44567x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.f44525a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f44567x = -1;
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
        this.f44560t = 0.0f;
        this.f44558s = 0.0f;
        this.f44556r = 0.0f;
        this.f44562u.f44239a.clear();
        l4 l4Var = this.f44547m;
        if (l4Var != null) {
            l4Var.setScaleX(1.0f);
            this.f44547m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f44528b0;
        if (gVar != null) {
            gVar.d();
            this.f44528b0 = null;
        }
        this.f44530c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.f44525a;
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
        org.telegram.ui.Cells.v0 v0Var = this.f44525a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f44538h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f44526a0 = 1.0f;
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f44545l.stop();
            this.H = false;
        }
        this.f44537g0 = z10;
        this.f44546l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f44540i0 = z13;
        org.telegram.ui.Components.d6 d6Var = this.K;
        if (z13) {
            d6Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            d6Var.e(true, 1.0f);
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
        if (this.f44538h0 && z10 && i7 == 0) {
            b();
            g();
            this.f44560t = 18.0f;
            this.f44562u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.f44538h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            d6Var.e(true, 0.0f);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            d6Var.e(true, 1.0f);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f44538h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            k4 k4Var = this.f44531d0;
            k4Var.getClass();
            k4Var.v = Math.max(0L, 0L);
            if (this.f44531d0.d() || this.f44531d0.c()) {
                k4 k4Var2 = this.f44531d0;
                k4Var2.f38767b = -1L;
                k4Var2.f38768c = -1L;
            }
            v0Var.invalidate();
        } else {
            k4 k4Var3 = this.f44531d0;
            if (k4Var3 != null && this.f44533e0 == 0 && !k4Var3.d() && !this.f44531d0.c()) {
                this.f44531d0.a();
                v0Var.invalidate();
            }
        }
        if (z14) {
            i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29588q7, this.f44527b);
        } else if (z10) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f44570y0 = z14;
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
            N0 = hd.N0(2131742715, null);
        } else if (z10) {
            N0 = hd.N0(2131742713, null);
        } else {
            N0 = hd.N0(2131742714, null);
        }
        j4 j4Var = this.I;
        if (z15) {
            j4Var.g(10, N0, true);
        } else {
            j4Var.h(10, N0);
        }
        SpannableStringBuilder v = u0.v(u0.t(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u0.q("Grams", v, 2131749314));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        oi.v5 v5Var = this.f44563u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(v5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(v5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f44549n0 = new xy0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = x6.f(x6.d(str3.toUpperCase(locale)));
        xy0 xy0Var = new xy0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        xy0Var.m(2);
        this.f44551o0 = xy0Var;
        xy0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f44553p0 = null;
        } else {
            xy0 xy0Var2 = new xy0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f44553p0 = xy0Var2;
            xy0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f44553p0.f42222a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f44529c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f44555q0 = null;
            return;
        }
        xy0 xy0Var3 = new xy0("", 12.0f, null);
        xy0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var3.a();
        xy0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f44555q0 = xy0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f35299a |= 256;
            spannableStringBuilder2.setSpan(new gz0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f44555q0.q(spannableStringBuilder2);
            xh.f.c(v0Var, this.f44555q0.f42223b, stack, arrayList);
            n(this.f44532e);
            return;
        }
        xy0Var3.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer.comment, xy0Var3.f42222a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z10) {
        this.f44532e = z10;
        ArrayList arrayList = this.f44529c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f44552p = f10;
        this.f44554q = f11;
    }

    public final void p() {
        boolean z10;
        if (this.f44547m == null) {
            return;
        }
        if (this.f44567x == -1 && !this.D) {
            this.A = g();
            this.B = this.f44543k.F * 0.14f;
        }
        boolean z11 = true;
        if (this.f44567x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        l4 l4Var = this.f44547m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z10 && !this.f44538h0 && this.f44556r == 0.0f && this.f44558s == 0.0f && this.f44560t == 0.0f) {
            z11 = false;
        }
        l4Var.f59555r = f10;
        l4Var.f59556s = f11;
        l4Var.f59557w = z11;
        l4Var.f59558x = z10;
    }

    public final void q() {
        if (this.f44538h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
