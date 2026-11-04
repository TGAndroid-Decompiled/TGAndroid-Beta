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
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.tf;
public final class b4 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public q1.g F;
    public ValueAnimator G;
    public boolean H;
    public final y3 I;
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
    public final gc Y;
    public q1.g Z;
    public final org.telegram.ui.Cells.t0 f42232a;
    public float f42233a0;
    public final org.telegram.ui.ActionBar.e6 f42234b;
    public q1.g f42235b0;
    public float f42237c0;
    public z3 f42238d0;
    public boolean f42239e;
    public long f42240e0;
    public boolean f42242f0;
    public boolean f42244g0;
    public boolean f42245h0;
    public final Drawable f42246i;
    public boolean f42247i0;
    public ValueAnimator f42249j0;
    public final g6 f42250k;
    public tf f42251k0;
    public final ch0 f42252l;
    public TLRPC.TL_messageActionGramTransfer f42253l0;
    public a4 f42254m;
    public boolean m0;
    public boolean f42255n;
    public ly0 f42256n0;
    public boolean f42257o;
    public ly0 f42258o0;
    public float f42259p;
    public ly0 f42260p0;
    public float f42261q;
    public ly0 f42262q0;
    public float f42263r;
    public boolean f42264r0;
    public float f42265s;
    public org.telegram.ui.Cells.m0 f42266s0;
    public float f42267t;
    public int f42268t0;
    public final mi.x5 f42270u0;
    public long v;
    public int f42271v0;
    public final org.telegram.ui.Components.u5 f42273w0;
    public final w3 f42275x0;
    public float f42276y;
    public boolean f42277y0;
    public float f42278z;
    public final ArrayList f42236c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f42241f = new RectF();
    public final RectF f42243g = new RectF();
    public final Path h = new Path();
    public final Path f42248j = new Path();
    public final o9 f42269u = new o9();
    public final Rect f42272w = new Rect();
    public int f42274x = -1;
    public float C = 1.0f;

    public b4(org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f42233a0 = 1.0f;
        new Matrix();
        this.f42268t0 = -10624001;
        this.f42270u0 = new mi.x5(this, 4);
        this.f42271v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f42275x0 = new Object();
        this.f42232a = t0Var;
        this.f42234b = e6Var;
        this.f42246i = t0Var.getResources().getDrawable(2131232803).mutate();
        Context context = t0Var.getContext();
        if (g6.H == null) {
            g6.H = new g6(context.getApplicationContext());
        }
        this.f42250k = g6.H;
        ch0 ch0Var = new ch0(2131624356, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), false, null);
        this.f42252l = ch0Var;
        ch0Var.R(t0Var);
        ch0Var.K(0);
        t0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.z9(2, this, t0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        l lVar = new l(t0Var, 6);
        xq xqVar = xq.h;
        this.Q = new org.telegram.ui.Components.u5(1.0f, lVar, 0L, 180L, xqVar);
        this.K = new org.telegram.ui.Components.u5(new l(t0Var, 6), 320L, xqVar, 0);
        this.J = new org.telegram.ui.Components.u5(new l(t0Var, 6), 320L, xqVar, 0);
        y3 y3Var = new y3(t0Var, t0Var);
        this.I = y3Var;
        y3Var.f986y = -1;
        ai.t2.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(4.0f));
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.k6.r1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-org.telegram.messenger.g0.L(10.0f), 0.0f, org.telegram.messenger.g0.L(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        gc gcVar = new gc(t0Var);
        this.Y = gcVar;
        gcVar.f34047f = new x3(this, 0);
        this.f42273w0 = new org.telegram.ui.Components.u5(1.0f, new l(t0Var, 6), 0L, 400L, xqVar);
    }

    public static int h() {
        return org.telegram.messenger.g0.L(206.0f);
    }

    public final void a(float f10) {
        if (this.F == null) {
            q1.g gVar = new q1.g(new q1.f(this.C));
            this.F = gVar;
            q1.h hVar = new q1.h(f10);
            hVar.a(0.55f);
            hVar.b(280.0f);
            gVar.f53653m = hVar;
            this.F.f(0.001f);
            this.F.b(new v3(this, 0));
        }
        this.F.c(f10);
    }

    public final void b() {
        org.telegram.ui.Cells.t0 t0Var = this.f42232a;
        if (t0Var.isShown()) {
            org.telegram.messenger.g0.c4(t0Var);
        }
        q1.g gVar = this.Z;
        if (gVar != null) {
            gVar.d();
        }
        q1.g gVar2 = new q1.g(new q1.f(this.f42233a0));
        this.Z = gVar2;
        q1.h hVar = new q1.h(1.0f);
        hVar.a(0.55f);
        hVar.b(280.0f);
        gVar2.f53653m = hVar;
        this.Z.f(0.001f);
        q1.g gVar3 = this.Z;
        gVar3.f53643a = -3.0f;
        gVar3.b(new v3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f10, float f11) {
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f) * this.f42237c0);
        gc gcVar = this.Y;
        canvas.scale(com.google.android.recaptcha.internal.a.A(this.f42237c0, 0.012f, 1.0f, gcVar.a(0.025f) * this.f42233a0), com.google.android.recaptcha.internal.a.B(this.f42237c0, 0.04f, 1.0f, gcVar.a(0.025f) * this.f42233a0), (org.telegram.messenger.g0.L(206.0f) / 2.0f) + f10, f11 + org.telegram.messenger.g0.L(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.b4.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f42238d0 != null) {
            return;
        }
        z3 z3Var = new z3(this, this.f42234b);
        this.f42238d0 = z3Var;
        z3Var.g(4969977, org.telegram.ui.ActionBar.k6.r1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.k6.r1(0.75f, -11807239));
        this.f42238d0.f39944x.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        z3 z3Var2 = this.f42238d0;
        z3Var2.f39941t = 2.0f;
        z3Var2.f39945y = this.h;
        z3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f42249j0;
        if (valueAnimator != null) {
            this.f42249j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.u5 u5Var = this.K;
            if (u5Var.f38649i) {
                this.M = false;
                this.N = 0L;
            }
            u5Var.e(true, 1.0f);
            this.f42267t = 0.0f;
            this.f42269u.f43025a.clear();
            tf tfVar = this.f42251k0;
            this.f42251k0 = null;
            this.f42232a.invalidate();
            if (tfVar != null) {
                org.telegram.messenger.g0.i3(tfVar, 1L);
            }
        }
    }

    public final float g() {
        float f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f42245h0) {
                f10 = 1.7883515f;
            } else {
                f10 = 0.0f;
            }
            float f11 = -min;
            float exp = (float) Math.exp(f11 / 0.2f);
            float f12 = (min * f10) + this.f42263r;
            float f13 = this.f42265s;
            this.f42263r = (((1.0f - exp) * ((f13 - f10) * 0.2f)) + f12) % 6.2831855f;
            this.f42265s = com.google.android.recaptcha.internal.a.y(f13, f10, exp, f10);
            float exp2 = (float) Math.exp(f11 / 0.75f);
            float f14 = this.f42263r;
            float f15 = this.f42267t;
            this.f42263r = (((1.0f - exp2) * (0.75f * f15)) + f14) % 6.2831855f;
            float f16 = f15 * exp2;
            this.f42267t = f16;
            if (f16 < 0.001f) {
                this.f42267t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f42250k.E * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f42263r;
    }

    public final void i(boolean z10) {
        float f10 = 0.0f;
        if (z10) {
            this.Q.e(true, 0.0f);
        } else if (this.E && this.f42245h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        a4 a4Var = this.f42254m;
        if (a4Var != null) {
            if (!z10) {
                f10 = 1.0f;
            }
            a4Var.setAlpha(f10);
        }
        this.f42232a.invalidate();
    }

    public final void j() {
        this.f42274x = -1;
        org.telegram.ui.Cells.t0 t0Var = this.f42232a;
        if (t0Var.getParent() != null) {
            t0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(xq.h);
        this.G.addUpdateListener(new gi.l9(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f42250k.F * 0.14f), 6.283185307179586d), 4));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.e(true, 1.0f);
        if (this.f42274x != -1) {
            org.telegram.ui.Cells.t0 t0Var = this.f42232a;
            if (t0Var.getParent() != null) {
                t0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f42274x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        q1.g gVar = this.F;
        if (gVar != null) {
            gVar.d();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.f42267t = 0.0f;
        this.f42265s = 0.0f;
        this.f42263r = 0.0f;
        this.f42269u.f43025a.clear();
        a4 a4Var = this.f42254m;
        if (a4Var != null) {
            a4Var.setScaleX(1.0f);
            this.f42254m.setScaleY(1.0f);
        }
    }

    public final void l() {
        q1.g gVar = this.f42235b0;
        if (gVar != null) {
            gVar.d();
            this.f42235b0 = null;
        }
        this.f42237c0 = 0.0f;
        org.telegram.ui.Cells.t0 t0Var = this.f42232a;
        t0Var.invalidate();
        if (t0Var.getParent() instanceof View) {
            ((View) t0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i3, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        int i10;
        String M0;
        String str2;
        org.telegram.ui.Cells.t0 t0Var = this.f42232a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f42245h0 = false;
            k();
            q1.g gVar = this.Z;
            if (gVar != null) {
                gVar.d();
                this.Z = null;
            }
            this.f42233a0 = 1.0f;
            t0Var.invalidate();
            if (t0Var.getParent() instanceof View) {
                ((View) t0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f42252l.stop();
            this.H = false;
        }
        this.f42244g0 = z10;
        this.f42253l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f42247i0 = z13;
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
        if (z10 && i3 == 2) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10 && i3 == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (this.f42245h0 && z10 && i3 == 0) {
            b();
            g();
            this.f42267t = 18.0f;
            this.f42269u.f();
            t0Var.invalidate();
        }
        if (z15) {
            if (!this.f42245h0) {
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
        this.f42245h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            z3 z3Var = this.f42238d0;
            z3Var.getClass();
            z3Var.v = Math.max(0L, 0L);
            if (this.f42238d0.d() || this.f42238d0.c()) {
                z3 z3Var2 = this.f42238d0;
                z3Var2.f39925b = -1L;
                z3Var2.f39926c = -1L;
            }
            t0Var.invalidate();
        } else {
            z3 z3Var3 = this.f42238d0;
            if (z3Var3 != null && this.f42240e0 == 0 && !z3Var3.d() && !this.f42238d0.c()) {
                this.f42238d0.a();
                t0Var.invalidate();
            }
        }
        if (z14) {
            i10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, this.f42234b);
        } else if (z10) {
            i10 = -15352320;
        } else {
            i10 = -11814402;
        }
        this.f42277y0 = z14;
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
            M0 = bd.M0(2131742989, null);
        } else if (z10) {
            M0 = bd.M0(2131742987, null);
        } else {
            M0 = bd.M0(2131742988, null);
        }
        y3 y3Var = this.I;
        if (z15) {
            y3Var.f(10, M0, true);
        } else {
            y3Var.g(10, M0);
        }
        SpannableStringBuilder q10 = k0.q(k0.o(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k0.l("Grams", q10, 2131749515));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        mi.x5 x5Var = this.f42270u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(x5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(x5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f42256n0 = new ly0(spannableStringBuilder, 16.0f, org.telegram.messenger.g0.o());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f10 = f6.f(f6.d(str3.toUpperCase(locale)));
        ly0 ly0Var = new ly0("", 9.3f, org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        ly0Var.m(2);
        this.f42258o0 = ly0Var;
        ly0Var.q(f10);
        if (TextUtils.isEmpty(str)) {
            this.f42260p0 = null;
        } else {
            ly0 ly0Var2 = new ly0("", 10.0f, Typeface.create(org.telegram.messenger.g0.o1("fonts/rmono.ttf"), 1));
            this.f42260p0 = ly0Var2;
            ly0Var2.q(TextUtils.ellipsize(org.telegram.messenger.g0.N2(str.toUpperCase(locale)), this.f42260p0.f35916a, org.telegram.messenger.g0.L(206.0f) - org.telegram.messenger.g0.L(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f42236c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f42262q0 = null;
            return;
        }
        ly0 ly0Var3 = new ly0("", 12.0f, null);
        ly0Var3.m(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var3.a();
        ly0Var3.p(org.telegram.messenger.g0.L(184.0f));
        this.f42262q0 = ly0Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i12 = 0; i12 < 25; i12++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f38578a |= 256;
            spannableStringBuilder2.setSpan(new uy0(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f42262q0.q(spannableStringBuilder2);
            yh.f.c(t0Var, this.f42262q0.f35917b, stack, arrayList);
            n(this.f42239e);
            return;
        }
        ly0Var3.q(org.telegram.messenger.i6.m(tL_messageActionGramTransfer.comment, ly0Var3.f35916a.getFontMetricsInt(), false, null, 0));
    }

    public final void n(boolean z10) {
        this.f42239e = z10;
        ArrayList arrayList = this.f42236c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((yh.f) obj).invalidateSelf();
        }
    }

    public final void o(float f10, float f11) {
        this.f42259p = f10;
        this.f42261q = f11;
    }

    public final void p() {
        boolean z10;
        if (this.f42254m == null) {
            return;
        }
        if (this.f42274x == -1 && !this.D) {
            this.A = g();
            this.B = this.f42250k.F * 0.14f;
        }
        boolean z11 = true;
        if (this.f42274x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        a4 a4Var = this.f42254m;
        float f10 = this.A;
        float f11 = this.B;
        if (!z10 && !this.f42245h0 && this.f42263r == 0.0f && this.f42265s == 0.0f && this.f42267t == 0.0f) {
            z11 = false;
        }
        a4Var.f57751r = f10;
        a4Var.f57752s = f11;
        a4Var.f57753w = z11;
        a4Var.f57754x = z10;
    }

    public final void q() {
        if (this.f42245h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
