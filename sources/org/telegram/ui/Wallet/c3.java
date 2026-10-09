package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
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
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import ci.ya;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.u11;
import org.telegram.ui.tg;
public final class c3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final z2 I;
    public final org.telegram.ui.Components.g6 J;
    public final org.telegram.ui.Components.g6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.g6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final bd Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.w0 f34708a;
    public float f34709a0;
    public final org.telegram.ui.ActionBar.e6 f34710b;
    public o1.k f34711b0;
    public float f34713c0;
    public a3 f34714d0;
    public boolean f34715e;
    public long f34716e0;
    public boolean f34718f0;
    public boolean f34720g0;
    public boolean f34721h0;
    public final Drawable f34722i;
    public boolean f34723i0;
    public ValueAnimator f34725j0;
    public final k5 f34726k;
    public tg f34727k0;
    public final ck0 f34728l;
    public TLRPC.TL_messageActionGramTransfer f34729l0;
    public b3 f34730m;
    public boolean m0;
    public boolean f34731n;
    public l11 f34732n0;
    public boolean f34733o;
    public l11 f34734o0;
    public float f34735p;
    public l11 f34736p0;
    public float f34737q;
    public l11 f34738q0;
    public float f34739r;
    public boolean f34740r0;
    public float f34741s;
    public org.telegram.ui.Cells.p0 f34742s0;
    public float f34743t;
    public long v;
    public float f34747y;
    public float f34748z;
    public final ArrayList f34712c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34717f = new RectF();
    public final RectF f34719g = new RectF();
    public final Path h = new Path();
    public final Path f34724j = new Path();
    public final k8 f34744u = new k8();
    public final Rect f34745w = new Rect();
    public int f34746x = -1;
    public float C = 1.0f;

    public c3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34709a0 = 1.0f;
        this.f34708a = w0Var;
        this.f34710b = e6Var;
        this.f34722i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (k5.G == null) {
            k5.G = new k5(context.getApplicationContext());
        }
        this.f34726k = k5.G;
        ck0 ck0Var = new ck0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34728l = ck0Var;
        ck0Var.R(w0Var);
        ck0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new oa(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        m mVar = new m(w0Var, 5);
        hs hsVar = hs.h;
        this.Q = new org.telegram.ui.Components.g6(1.0f, mVar, 0L, 180L, hsVar);
        this.K = new org.telegram.ui.Components.g6(new m(w0Var, 5), 320L, hsVar, 0);
        this.J = new org.telegram.ui.Components.g6(new m(w0Var, 5), 320L, hsVar, 0);
        z2 z2Var = new z2(w0Var, w0Var);
        this.I = z2Var;
        z2Var.f51373x = -1;
        xh.m1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.i6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.Y = new bd(w0Var);
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
            kVar.f16938u = lVar;
            this.F.e(0.001f);
            this.F.b(new y2(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.f34708a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34709a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f16938u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f16927a = -3.0f;
        kVar3.b(new y2(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34713c0);
        bd bdVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.A(this.f34713c0, 0.012f, 1.0f, bdVar.a(0.025f) * this.f34709a0), com.google.android.gms.internal.vision.e2.B(this.f34713c0, 0.04f, 1.0f, bdVar.a(0.025f) * this.f34709a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34714d0 != null) {
            return;
        }
        a3 a3Var = new a3(this, this.f34710b);
        this.f34714d0 = a3Var;
        a3Var.g(4969977, org.telegram.ui.ActionBar.i6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.i6.m1(0.75f, -11807239));
        this.f34714d0.f27340x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        a3 a3Var2 = this.f34714d0;
        a3Var2.f27337t = 2.0f;
        a3Var2.f27341y = this.h;
        a3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34725j0;
        if (valueAnimator != null) {
            this.f34725j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.g6 g6Var = this.K;
            if (g6Var.f26603i) {
                this.M = false;
                this.N = 0L;
            }
            g6Var.d(1.0f, true);
            this.f34743t = 0.0f;
            this.f34744u.f35147a.clear();
            tg tgVar = this.f34727k0;
            this.f34727k0 = null;
            this.f34708a.invalidate();
            if (tgVar != null) {
                AndroidUtilities.runOnUIThread(tgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.v;
        if (j3 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j3)) / 1000.0f);
            if (this.f34721h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34739r;
            float f12 = this.f34741s;
            this.f34739r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34741s = com.google.android.gms.internal.vision.e2.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34739r;
            float f14 = this.f34743t;
            this.f34739r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34743t = f15;
            if (f15 < 0.001f) {
                this.f34743t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34726k.f35141y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34739r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34721h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        b3 b3Var = this.f34730m;
        if (b3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            b3Var.setAlpha(f7);
        }
        this.f34708a.invalidate();
    }

    public final void j() {
        this.f34746x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f34708a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(hs.h);
        this.G.addUpdateListener(new ya(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34726k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34746x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f34708a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34746x = -1;
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
        this.f34743t = 0.0f;
        this.f34741s = 0.0f;
        this.f34739r = 0.0f;
        this.f34744u.f35147a.clear();
        b3 b3Var = this.f34730m;
        if (b3Var != null) {
            b3Var.setScaleX(1.0f);
            this.f34730m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34711b0;
        if (kVar != null) {
            kVar.c();
            this.f34711b0 = null;
        }
        this.f34713c0 = 0.0f;
        this.f34708a.invalidate();
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        int i11;
        String string;
        String str2;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34721h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34709a0 = 1.0f;
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34728l.stop();
            this.H = false;
        }
        this.f34720g0 = z10;
        this.f34729l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34723i0 = z13;
        org.telegram.ui.Components.g6 g6Var = this.K;
        if (z13) {
            g6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            g6Var.d(1.0f, true);
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
        boolean z16 = this.f34721h0;
        org.telegram.ui.Cells.w0 w0Var = this.f34708a;
        if (z16 && z10 && i10 == 0) {
            b();
            g();
            this.f34743t = 18.0f;
            this.f34744u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f34721h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            g6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            g6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f34721h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            a3 a3Var = this.f34714d0;
            a3Var.getClass();
            a3Var.v = Math.max(0L, 0L);
            if (this.f34714d0.d() || this.f34714d0.c()) {
                a3 a3Var2 = this.f34714d0;
                a3Var2.f27321b = -1L;
                a3Var2.f27322c = -1L;
            }
            w0Var.invalidate();
        } else {
            a3 a3Var3 = this.f34714d0;
            if (a3Var3 != null && this.f34716e0 == 0 && !a3Var3.d() && !this.f34714d0.c()) {
                this.f34714d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, this.f34710b);
        } else if (z10) {
            i11 = -15352320;
        } else {
            i11 = -11814402;
        }
        int i12 = this.U;
        if (i12 == 0) {
            this.V = i11;
            this.U = i11;
            this.T = i11;
        } else if (i11 != i12) {
            this.T = this.V;
            this.U = i11;
            this.J.d(0.0f, true);
            w0Var.invalidate();
        }
        if (z14) {
            string = LocaleController.getString(R.string.WalletTransferStatusFailed);
        } else if (z10) {
            string = LocaleController.getString(R.string.WalletTransferStatusSent);
        } else {
            string = LocaleController.getString(R.string.WalletTransferStatusReceived);
        }
        z2 z2Var = this.I;
        if (z15) {
            z2Var.f(10, string, true);
        } else {
            l11 l11Var = z2Var.f51366c;
            if (l11Var == null) {
                z2Var.f(10, string, true);
            } else if (!TextUtils.equals(l11Var.k(), string)) {
                z2Var.d = z2Var.f51366c;
                z2Var.f51366c = new l11(string, 10, AndroidUtilities.bold());
                z2Var.f51367e.d(0.0f, true);
                z2Var.invalidateSelf();
            }
        }
        SpannableStringBuilder o9 = k0.o(k0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) o9.getSpans(0, o9.length(), RelativeSizeSpan.class)) {
            o9.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        o9.insert(0, (CharSequence) str2);
        int indexOf = o9.toString().indexOf(46);
        if (indexOf >= 0) {
            o9.setSpan(new RelativeSizeSpan(0.75f), indexOf, o9.length(), 33);
        }
        Object obj = new Object();
        o9.setSpan(obj, 0, o9.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k0.k("Grams", o9, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34732n0 = new l11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String d = h5.d(h5.b(str3.toUpperCase(locale)));
        l11 l11Var2 = new l11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        l11Var2.n(2);
        this.f34734o0 = l11Var2;
        l11Var2.r(d);
        if (TextUtils.isEmpty(str)) {
            this.f34736p0 = null;
        } else {
            l11 l11Var3 = new l11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34736p0 = l11Var3;
            l11Var3.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34736p0.f28220a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34712c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34738q0 = null;
            return;
        }
        l11 l11Var4 = new l11("", 12.0f, null);
        l11Var4.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        l11Var4.a();
        l11Var4.q(AndroidUtilities.dp(184.0f));
        this.f34738q0 = l11Var4;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f30974a |= 256;
            spannableStringBuilder2.setSpan(new u11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34738q0.r(spannableStringBuilder2);
            vh.g.c(w0Var, this.f34738q0.f28221b, stack, arrayList);
            n(this.f34715e);
            return;
        }
        l11Var4.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, l11Var4.f28220a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.f34715e = z10;
        ArrayList arrayList = this.f34712c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34735p = f7;
        this.f34737q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34730m == null) {
            return;
        }
        if (this.f34746x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34726k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34746x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        b3 b3Var = this.f34730m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34721h0 && this.f34739r == 0.0f && this.f34741s == 0.0f && this.f34743t == 0.0f) {
            z11 = false;
        }
        b3Var.f48155n = f7;
        b3Var.f48156r = f10;
        b3Var.f48157s = z11;
        b3Var.v = z10;
    }

    public final void q() {
        if (this.f34721h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
