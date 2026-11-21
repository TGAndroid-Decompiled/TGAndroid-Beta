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
    public final org.telegram.ui.Cells.v0 f44555a;
    public float f44556a0;
    public final org.telegram.ui.ActionBar.h6 f44557b;
    public r1.g f44558b0;
    public float f44560c0;
    public k4 f44561d0;
    public boolean f44562e;
    public long f44563e0;
    public boolean f44565f0;
    public boolean f44567g0;
    public boolean f44568h0;
    public final Drawable f44569i;
    public boolean f44570i0;
    public ValueAnimator f44572j0;
    public final y6 f44573k;
    public vf f44574k0;
    public final oh0 f44575l;
    public TLRPC.TL_messageActionGramTransfer f44576l0;
    public l4 f44577m;
    public boolean m0;
    public boolean f44578n;
    public xy0 f44579n0;
    public boolean f44580o;
    public xy0 f44581o0;
    public float f44582p;
    public xy0 f44583p0;
    public float f44584q;
    public xy0 f44585q0;
    public float f44586r;
    public boolean f44587r0;
    public float f44588s;
    public org.telegram.ui.Cells.n0 f44589s0;
    public float f44590t;
    public int f44591t0;
    public final oi.w5 f44593u0;
    public long v;
    public int f44594v0;
    public final org.telegram.ui.Components.d6 f44596w0;
    public final h4 f44598x0;
    public float f44599y;
    public boolean f44600y0;
    public float f44601z;
    public final ArrayList f44559c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f44564f = new RectF();
    public final RectF f44566g = new RectF();
    public final Path h = new Path();
    public final Path f44571j = new Path();
    public final fa f44592u = new fa();
    public final Rect f44595w = new Rect();
    public int f44597x = -1;
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
        this.f44556a0 = 1.0f;
        new Matrix();
        this.f44591t0 = -10624001;
        this.f44593u0 = new oi.w5(this, 4);
        this.f44594v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f44598x0 = new Object();
        this.f44555a = v0Var;
        this.f44557b = h6Var;
        this.f44569i = v0Var.getResources().getDrawable(2131232808).mutate();
        Context context = v0Var.getContext();
        if (y6.H == null) {
            y6.H = new y6(context.getApplicationContext());
        }
        this.f44573k = y6.H;
        oh0 oh0Var = new oh0(2131624357, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f44575l = oh0Var;
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
        j4Var.f3744y = -1;
        bi.j3.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.m6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        mc mcVar = new mc(v0Var);
        this.Y = mcVar;
        mcVar.f37477f = new i4(this, 0);
        this.f44596w0 = new org.telegram.ui.Components.d6(1.0f, new m(v0Var, 5), 0L, 400L, nrVar);
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
            gVar.f56364m = hVar;
            this.F.f(0.001f);
            this.F.b(new g4(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.f44555a;
        if (v0Var.isShown()) {
            org.telegram.messenger.g0.a4(v0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f44556a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f56364m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f56354a = -3.0f;
        gVar3.b(new g4(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f44560c0);
        mc mcVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.B(this.f44560c0, 0.012f, 1.0f, mcVar.a(0.025f) * this.f44556a0), com.google.android.gms.internal.vision.e2.C(this.f44560c0, 0.04f, 1.0f, mcVar.a(0.025f) * this.f44556a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f44561d0 != null) {
            return;
        }
        k4 k4Var = new k4(this, this.f44557b);
        this.f44561d0 = k4Var;
        k4Var.g(4969977, org.telegram.ui.ActionBar.m6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.m6.r1(0.75f, -11807239));
        this.f44561d0.f38839x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        k4 k4Var2 = this.f44561d0;
        k4Var2.f38836t = 2.0f;
        k4Var2.f38840y = this.h;
        k4Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f44572j0;
        if (valueAnimator != null) {
            this.f44572j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.d6 d6Var = this.K;
            if (d6Var.f34395i) {
                this.M = false;
                this.N = 0L;
            }
            d6Var.e(true, 1.0f);
            this.f44590t = 0.0f;
            this.f44592u.f44269a.clear();
            vf vfVar = this.f44574k0;
            this.f44574k0 = null;
            this.f44555a.invalidate();
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
            if (this.f44568h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f44586r;
            float f13 = this.f44588s;
            this.f44586r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f44588s = com.google.android.gms.internal.vision.e2.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f44586r;
            float f15 = this.f44590t;
            this.f44586r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f44590t = f16;
            if (f16 < 0.001f) {
                this.f44590t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f44573k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f44586r;
    }

    public final void i(boolean z10) {
        float f10 = 0.0f;
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f44568h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l4 l4Var = this.f44577m;
        if (l4Var != null) {
            if (!z10) {
                f10 = 1.0f;
            }
            l4Var.setAlpha(f10);
        }
        this.f44555a.invalidate();
    }

    public final void j() {
        this.f44597x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.f44555a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(nr.h);
        this.G.addUpdateListener(new hi.i9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f44573k.F * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f44597x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.f44555a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f44597x = -1;
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
        this.f44590t = 0.0f;
        this.f44588s = 0.0f;
        this.f44586r = 0.0f;
        this.f44592u.f44269a.clear();
        l4 l4Var = this.f44577m;
        if (l4Var != null) {
            l4Var.setScaleX(1.0f);
            this.f44577m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f44558b0;
        if (gVar != null) {
            gVar.d();
            this.f44558b0 = null;
        }
        this.f44560c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.f44555a;
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
        org.telegram.ui.Cells.v0 v0Var = this.f44555a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f44568h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f44556a0 = 1.0f;
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f44575l.stop();
            this.H = false;
        }
        this.f44567g0 = z10;
        this.f44576l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f44570i0 = z13;
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
        if (this.f44568h0 && z10 && i7 == 0) {
            b();
            g();
            this.f44590t = 18.0f;
            this.f44592u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.f44568h0) {
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
        this.f44568h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            k4 k4Var = this.f44561d0;
            k4Var.getClass();
            k4Var.v = Math.max(0L, 0L);
            if (this.f44561d0.d() || this.f44561d0.c()) {
                k4 k4Var2 = this.f44561d0;
                k4Var2.f38820b = -1L;
                k4Var2.f38821c = -1L;
            }
            v0Var.invalidate();
        } else {
            k4 k4Var3 = this.f44561d0;
            if (k4Var3 != null && this.f44563e0 == 0 && !k4Var3.d() && !this.f44561d0.c()) {
                this.f44561d0.a();
                v0Var.invalidate();
            }
        }
        if (z14) {
            i10 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29619q7, this.f44557b);
        } else if (z10) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f44600y0 = z14;
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
            N0 = gd.N0(2131742715, null);
        } else if (z10) {
            N0 = gd.N0(2131742713, null);
        } else {
            N0 = gd.N0(2131742714, null);
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
        oi.w5 w5Var = this.f44593u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f44579n0 = new xy0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = x6.f(x6.d(str3.toUpperCase(locale)));
        xy0 xy0Var = new xy0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        xy0Var.m(2);
        this.f44581o0 = xy0Var;
        xy0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f44583p0 = null;
        } else {
            xy0 xy0Var2 = new xy0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f44583p0 = xy0Var2;
            xy0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f44583p0.f42252a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f44559c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f44585q0 = null;
            return;
        }
        xy0 xy0Var3 = new xy0("", 12.0f, null);
        xy0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var3.a();
        xy0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f44585q0 = xy0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f35335a |= 256;
            spannableStringBuilder2.setSpan(new gz0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f44585q0.q(spannableStringBuilder2);
            xh.f.c(v0Var, this.f44585q0.f42253b, stack, arrayList);
            n(this.f44562e);
            return;
        }
        xy0Var3.q(org.telegram.messenger.j6.m(tL_messageActionGramTransfer.comment, xy0Var3.f42252a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z10) {
        this.f44562e = z10;
        ArrayList arrayList = this.f44559c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f44582p = f10;
        this.f44584q = f11;
    }

    public final void p() {
        boolean z10;
        if (this.f44577m == null) {
            return;
        }
        if (this.f44597x == -1 && !this.D) {
            this.A = g();
            this.B = this.f44573k.F * 0.14f;
        }
        boolean z11 = true;
        if (this.f44597x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        l4 l4Var = this.f44577m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z10 && !this.f44568h0 && this.f44586r == 0.0f && this.f44588s == 0.0f && this.f44590t == 0.0f) {
            z11 = false;
        }
        l4Var.f59586r = f10;
        l4Var.f59587s = f11;
        l4Var.f59588w = z11;
        l4Var.f59589x = z10;
    }

    public final void q() {
        if (this.f44568h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
