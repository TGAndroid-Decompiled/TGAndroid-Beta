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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.xf;
public final class b4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public r1.g F;
    public ValueAnimator G;
    public boolean H;
    public final y3 I;
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
    public final org.telegram.ui.Cells.t0 f42222a;
    public float f42223a0;
    public final org.telegram.ui.ActionBar.g6 f42224b;
    public r1.g f42225b0;
    public float f42227c0;
    public z3 f42228d0;
    public boolean f42229e;
    public long f42230e0;
    public boolean f42232f0;
    public boolean f42234g0;
    public boolean f42235h0;
    public final Drawable f42236i;
    public boolean f42237i0;
    public ValueAnimator f42239j0;
    public final g6 f42240k;
    public xf f42241k0;
    public final ah0 f42242l;
    public TLRPC.TL_messageActionGramTransfer f42243l0;
    public a4 f42244m;
    public boolean m0;
    public boolean f42245n;
    public ny0 f42246n0;
    public boolean f42247o;
    public ny0 f42248o0;
    public float f42249p;
    public ny0 f42250p0;
    public float f42251q;
    public ny0 f42252q0;
    public float f42253r;
    public boolean f42254r0;
    public float f42255s;
    public org.telegram.ui.Cells.m0 f42256s0;
    public float f42257t;
    public int f42258t0;
    public final li.w5 f42260u0;
    public long v;
    public int f42261v0;
    public final org.telegram.ui.Components.w5 f42263w0;
    public final w3 f42265x0;
    public float f42266y;
    public boolean f42267y0;
    public float f42268z;
    public final ArrayList f42226c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f42231f = new RectF();
    public final RectF f42233g = new RectF();
    public final Path h = new Path();
    public final Path f42238j = new Path();
    public final n9 f42259u = new n9();
    public final Rect f42262w = new Rect();
    public int f42264x = -1;
    public float C = 1.0f;

    public b4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f42223a0 = 1.0f;
        new Matrix();
        this.f42258t0 = -10624001;
        this.f42260u0 = new li.w5(this, 4);
        this.f42261v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f42265x0 = new Object();
        this.f42222a = t0Var;
        this.f42224b = g6Var;
        this.f42236i = t0Var.getResources().getDrawable(2131232805).mutate();
        Context context = t0Var.getContext();
        if (g6.G == null) {
            g6.G = new g6(context.getApplicationContext());
        }
        this.f42240k = g6.G;
        ah0 ah0Var = new ah0(2131624356, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f42242l = ah0Var;
        ah0Var.R(t0Var);
        ah0Var.K(0);
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
        y3 y3Var = new y3(t0Var, t0Var);
        this.I = y3Var;
        y3Var.f60226y = -1;
        zh.b1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.l6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ic icVar = new ic(t0Var);
        this.Y = icVar;
        icVar.f34700f = new x3(this, 0);
        this.f42263w0 = new org.telegram.ui.Components.w5(1.0f, new l(t0Var, 6), 0L, 400L, xqVar);
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
            gVar.f54280m = hVar;
            this.F.f(0.001f);
            this.F.b(new v3(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.t0 t0Var = this.f42222a;
        if (t0Var.isShown()) {
            org.telegram.messenger.g0.c4(t0Var);
        }
        r1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        r1.g gVar2 = new r1.g(new r1.f(this.f42223a0));
        this.Z = gVar2;
        r1.h hVar = new r1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f54280m = hVar;
        this.Z.f(0.001f);
        r1.g gVar3 = this.Z;
        gVar3.f54270a = -3.0f;
        gVar3.b(new v3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f42227c0);
        ic icVar = this.Y;
        canvas.scale(com.google.android.recaptcha.internal.a.B(this.f42227c0, 0.012f, 1.0f, icVar.a(0.025f) * this.f42223a0), com.google.android.recaptcha.internal.a.C(this.f42227c0, 0.04f, 1.0f, icVar.a(0.025f) * this.f42223a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f42228d0 != null) {
            return;
        }
        z3 z3Var = new z3(this, this.f42224b);
        this.f42228d0 = z3Var;
        z3Var.g(4969977, org.telegram.ui.ActionBar.l6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.l6.r1(0.75f, -11807239));
        this.f42228d0.f32186x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        z3 z3Var2 = this.f42228d0;
        z3Var2.f32183t = 2.0f;
        z3Var2.f32187y = this.h;
        z3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f42239j0;
        if (valueAnimator != null) {
            this.f42239j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.w5 w5Var = this.K;
            if (w5Var.f39914i) {
                this.M = false;
                this.N = 0L;
            }
            w5Var.e(true, 1.0f);
            this.f42257t = 0.0f;
            this.f42259u.f42909a.clear();
            xf xfVar = this.f42241k0;
            this.f42241k0 = null;
            this.f42222a.invalidate();
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
            if (this.f42235h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f42253r;
            float f13 = this.f42255s;
            this.f42253r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f42255s = com.google.android.recaptcha.internal.a.z(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f42253r;
            float f15 = this.f42257t;
            this.f42253r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f42257t = f16;
            if (f16 < 0.001f) {
                this.f42257t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f42240k.D * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f42253r;
    }

    public final void i(boolean z9) {
        float f10 = 0.0f;
        if (z9) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f42235h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z9;
        a4 a4Var = this.f42244m;
        if (a4Var != null) {
            if (!z9) {
                f10 = 1.0f;
            }
            a4Var.setAlpha(f10);
        }
        this.f42222a.invalidate();
    }

    public final void j() {
        this.f42264x = -1;
        org.telegram.ui.Cells.t0 t0Var = this.f42222a;
        if (t0Var.getParent() != null) {
            t0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(xq.h);
        this.G.addUpdateListener(new fi.k9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f42240k.E * 0.14f), 6.283185307179586d), 4));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f42264x != -1) {
            org.telegram.ui.Cells.t0 t0Var = this.f42222a;
            if (t0Var.getParent() != null) {
                t0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f42264x = -1;
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
        this.f42257t = 0.0f;
        this.f42255s = 0.0f;
        this.f42253r = 0.0f;
        this.f42259u.f42909a.clear();
        a4 a4Var = this.f42244m;
        if (a4Var != null) {
            a4Var.setScaleX(1.0f);
            this.f42244m.setScaleY(1.0f);
        }
    }

    public final void l() {
        r1.g gVar = this.f42225b0;
        if (gVar != null) {
            gVar.d();
            this.f42225b0 = null;
        }
        this.f42227c0 = 0.0f;
        org.telegram.ui.Cells.t0 t0Var = this.f42222a;
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
        org.telegram.ui.Cells.t0 t0Var = this.f42222a;
        if (z10) {
            f();
            this.M = false;
            this.N = 0L;
            this.f42235h0 = false;
            k();
            r1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f42223a0 = 1.0f;
            t0Var.invalidate();
            if (t0Var.getParent() instanceof View) {
                ((View) t0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f42242l.stop();
            this.H = false;
        }
        this.f42234g0 = z9;
        this.f42243l0 = tL_messageActionGramTransfer;
        if (!z9 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f42237i0 = z12;
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
        if (this.f42235h0 && z9 && i7 == 0) {
            b();
            g();
            this.f42257t = 18.0f;
            this.f42259u.f();
            t0Var.invalidate();
        }
        if (z14) {
            if (!this.f42235h0) {
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
        this.f42235h0 = z14;
        if (z14) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z14) {
            e();
            z3 z3Var = this.f42228d0;
            z3Var.getClass();
            z3Var.v = Math.max(0L, 0L);
            if (this.f42228d0.d() || this.f42228d0.c()) {
                z3 z3Var2 = this.f42228d0;
                z3Var2.f32167b = -1L;
                z3Var2.f32168c = -1L;
            }
            t0Var.invalidate();
        } else {
            z3 z3Var3 = this.f42228d0;
            if (z3Var3 != null && this.f42230e0 == 0 && !z3Var3.d() && !this.f42228d0.c()) {
                this.f42228d0.a();
                t0Var.invalidate();
            }
        }
        if (z13) {
            i10 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28106q7, this.f42224b);
        } else if (z9) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f42267y0 = z13;
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
            M0 = id.M0(2131742979, null);
        } else if (z9) {
            M0 = id.M0(2131742977, null);
        } else {
            M0 = id.M0(2131742978, null);
        }
        y3 y3Var = this.I;
        if (z14) {
            y3Var.f(10, M0, true);
        } else {
            y3Var.g(10, M0);
        }
        SpannableStringBuilder q10 = l0.q(l0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.l("Grams", q10, 2131749507));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        li.w5 w5Var2 = this.f42260u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(w5Var2), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f42246n0 = new ny0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = f6.f(f6.d(str3.toUpperCase(locale)));
        ny0 ny0Var = new ny0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        ny0Var.m(2);
        this.f42248o0 = ny0Var;
        ny0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f42250p0 = null;
        } else {
            ny0 ny0Var2 = new ny0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f42250p0 = ny0Var2;
            ny0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f42250p0.f36539a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f42226c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f42252q0 = null;
            return;
        }
        ny0 ny0Var3 = new ny0("", 12.0f, null);
        ny0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ny0Var3.a();
        ny0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f42252q0 = ny0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f39836a |= 256;
            spannableStringBuilder2.setSpan(new wy0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f42252q0.q(spannableStringBuilder2);
            xh.f.c(t0Var, this.f42252q0.f36540b, stack, arrayList);
            n(this.f42229e);
            return;
        }
        ny0Var3.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer.comment, ny0Var3.f36539a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z9) {
        this.f42229e = z9;
        ArrayList arrayList = this.f42226c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f42249p = f10;
        this.f42251q = f11;
    }

    public final void p() {
        boolean z9;
        if (this.f42244m == null) {
            return;
        }
        if (this.f42264x == -1 && !this.D) {
            this.A = g();
            this.B = this.f42240k.E * 0.14f;
        }
        boolean z10 = true;
        if (this.f42264x == -1 && !this.D && this.C <= 1.001f) {
            z9 = false;
        } else {
            z9 = true;
        }
        a4 a4Var = this.f42244m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z9 && !this.f42235h0 && this.f42253r == 0.0f && this.f42255s == 0.0f && this.f42257t == 0.0f) {
            z10 = false;
        }
        a4Var.f57508r = f10;
        a4Var.f57509s = f11;
        a4Var.f57510w = z10;
        a4Var.f57511x = z9;
    }

    public final void q() {
        if (this.f42235h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
