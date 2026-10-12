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
import android.view.View;
import di.xa;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.xg;
public final class d3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final a3 I;
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
    public final ad Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.x0 f33045a;
    public float f33046a0;
    public final org.telegram.ui.ActionBar.c6 f33047b;
    public o1.k f33048b0;
    public float f33050c0;
    public b3 f33051d0;
    public boolean e;
    public long f33052e0;
    public boolean f33054f0;
    public boolean f33056g0;
    public boolean f33057h0;
    public final Drawable f33058i;
    public boolean f33059i0;
    public ValueAnimator f33061j0;
    public final k5 f33062k;
    public xg f33063k0;
    public final yj0 f33064l;
    public TLRPC.TL_messageActionGramTransfer f33065l0;
    public c3 f33066m;
    public boolean m0;
    public boolean f33067n;
    public h11 f33068n0;
    public boolean f33069o;
    public h11 f33070o0;
    public float f33071p;
    public h11 f33072p0;
    public float f33073q;
    public h11 f33074q0;
    public float f33075r;
    public boolean f33076r0;
    public float f33077s;
    public org.telegram.ui.Cells.q0 f33078s0;
    public float f33079t;
    public long v;
    public float f33083y;
    public float f33084z;
    public final ArrayList f33049c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f33053f = new RectF();
    public final RectF f33055g = new RectF();
    public final Path h = new Path();
    public final Path f33060j = new Path();
    public final k8 f33080u = new k8();
    public final Rect f33081w = new Rect();
    public int f33082x = -1;
    public float C = 1.0f;

    public d3(org.telegram.ui.Cells.x0 x0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f33046a0 = 1.0f;
        this.f33045a = x0Var;
        this.f33047b = c6Var;
        this.f33058i = x0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = x0Var.getContext();
        if (k5.G == null) {
            k5.G = new k5(context.getApplicationContext());
        }
        this.f33062k = k5.G;
        yj0 yj0Var = new yj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f33064l = yj0Var;
        yj0Var.R(x0Var);
        yj0Var.K(0);
        x0Var.addOnAttachStateChangeListener(new na(2, this, x0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        m mVar = new m(x0Var, 5);
        es esVar = es.h;
        this.Q = new org.telegram.ui.Components.g6(1.0f, mVar, 0L, 180L, esVar);
        this.K = new org.telegram.ui.Components.g6(new m(x0Var, 5), 320L, esVar, 0);
        this.J = new org.telegram.ui.Components.g6(new m(x0Var, 5), 320L, esVar, 0);
        a3 a3Var = new a3(x0Var, x0Var);
        this.I = a3Var;
        a3Var.f48942x = -1;
        yh.k1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.g6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        ad adVar = new ad(x0Var);
        this.Y = adVar;
        adVar.f23520f = new z2(this, 0);
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
            kVar.f16468u = lVar;
            this.F.e(0.001f);
            this.F.b(new y2(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.x0 x0Var = this.f33045a;
        if (x0Var.isShown()) {
            AndroidUtilities.vibrateCursor(x0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f33046a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f16468u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f16458a = -3.0f;
        kVar3.b(new y2(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f33050c0);
        ad adVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f33050c0, 0.012f, 1.0f, adVar.a(0.025f) * this.f33046a0), com.google.android.gms.internal.play_billing.k3.B(this.f33050c0, 0.04f, 1.0f, adVar.a(0.025f) * this.f33046a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.d3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f33051d0 != null) {
            return;
        }
        b3 b3Var = new b3(this, this.f33047b);
        this.f33051d0 = b3Var;
        b3Var.g(4969977, org.telegram.ui.ActionBar.g6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.g6.m1(0.75f, -11807239));
        this.f33051d0.f25624x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        b3 b3Var2 = this.f33051d0;
        b3Var2.f25621t = 2.0f;
        b3Var2.f25625y = this.h;
        b3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f33061j0;
        if (valueAnimator != null) {
            this.f33061j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.g6 g6Var = this.K;
            if (g6Var.f25193i) {
                this.M = false;
                this.N = 0L;
            }
            g6Var.d(1.0f, true);
            this.f33079t = 0.0f;
            this.f33080u.f33408a.clear();
            xg xgVar = this.f33063k0;
            this.f33063k0 = null;
            this.f33045a.invalidate();
            if (xgVar != null) {
                AndroidUtilities.runOnUIThread(xgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f33057h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f33075r;
            float f12 = this.f33077s;
            this.f33075r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f33077s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f33075r;
            float f14 = this.f33079t;
            this.f33075r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f33079t = f15;
            if (f15 < 0.001f) {
                this.f33079t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f33062k.f33403y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f33075r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f33057h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        c3 c3Var = this.f33066m;
        if (c3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            c3Var.setAlpha(f7);
        }
        this.f33045a.invalidate();
    }

    public final void j() {
        this.f33082x = -1;
        org.telegram.ui.Cells.x0 x0Var = this.f33045a;
        if (x0Var.getParent() != null) {
            x0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(es.h);
        this.G.addUpdateListener(new xa(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f33062k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f33082x != -1) {
            org.telegram.ui.Cells.x0 x0Var = this.f33045a;
            if (x0Var.getParent() != null) {
                x0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f33082x = -1;
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
        this.f33079t = 0.0f;
        this.f33077s = 0.0f;
        this.f33075r = 0.0f;
        this.f33080u.f33408a.clear();
        c3 c3Var = this.f33066m;
        if (c3Var != null) {
            c3Var.setScaleX(1.0f);
            this.f33066m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f33048b0;
        if (kVar != null) {
            kVar.c();
            this.f33048b0 = null;
        }
        this.f33050c0 = 0.0f;
        org.telegram.ui.Cells.x0 x0Var = this.f33045a;
        x0Var.invalidate();
        if (x0Var.getParent() instanceof View) {
            ((View) x0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        int i11;
        String string;
        String str2;
        org.telegram.ui.Cells.x0 x0Var = this.f33045a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f33057h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f33046a0 = 1.0f;
            x0Var.invalidate();
            if (x0Var.getParent() instanceof View) {
                ((View) x0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f33064l.stop();
            this.H = false;
        }
        this.f33056g0 = z10;
        this.f33065l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f33059i0 = z13;
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
        if (this.f33057h0 && z10 && i10 == 0) {
            b();
            g();
            this.f33079t = 18.0f;
            this.f33080u.f();
            x0Var.invalidate();
        }
        if (z15) {
            if (!this.f33057h0) {
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
        this.f33057h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            b3 b3Var = this.f33051d0;
            b3Var.getClass();
            b3Var.v = Math.max(0L, 0L);
            if (this.f33051d0.d() || this.f33051d0.c()) {
                b3 b3Var2 = this.f33051d0;
                b3Var2.f25606b = -1L;
                b3Var2.f25607c = -1L;
            }
            x0Var.invalidate();
        } else {
            b3 b3Var3 = this.f33051d0;
            if (b3Var3 != null && this.f33052e0 == 0 && !b3Var3.d() && !this.f33051d0.c()) {
                this.f33051d0.a();
                x0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, this.f33047b);
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
            x0Var.invalidate();
        }
        if (z14) {
            string = LocaleController.getString(R.string.WalletTransferStatusFailed);
        } else if (z10) {
            string = LocaleController.getString(R.string.WalletTransferStatusSent);
        } else {
            string = LocaleController.getString(R.string.WalletTransferStatusReceived);
        }
        a3 a3Var = this.I;
        if (z15) {
            a3Var.f(10, string, true);
        } else {
            h11 h11Var = a3Var.f48936c;
            if (h11Var == null) {
                a3Var.f(10, string, true);
            } else if (!TextUtils.equals(h11Var.k(), string)) {
                a3Var.d = a3Var.f48936c;
                a3Var.f48936c = new h11(string, 10, AndroidUtilities.bold());
                a3Var.e.d(0.0f, true);
                a3Var.invalidateSelf();
            }
        }
        SpannableStringBuilder o10 = j0.o(j0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) o10.getSpans(0, o10.length(), RelativeSizeSpan.class)) {
            o10.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        o10.insert(0, (CharSequence) str2);
        int indexOf = o10.toString().indexOf(46);
        if (indexOf >= 0) {
            o10.setSpan(new RelativeSizeSpan(0.75f), indexOf, o10.length(), 33);
        }
        Object obj = new Object();
        o10.setSpan(obj, 0, o10.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j0.k("Grams", o10, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f33068n0 = new h11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String d = h5.d(h5.b(str3.toUpperCase(locale)));
        h11 h11Var2 = new h11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        h11Var2.n(2);
        this.f33070o0 = h11Var2;
        h11Var2.r(d);
        if (TextUtils.isEmpty(str)) {
            this.f33072p0 = null;
        } else {
            h11 h11Var3 = new h11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f33072p0 = h11Var3;
            h11Var3.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f33072p0.f25471a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f33049c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f33074q0 = null;
            return;
        }
        h11 h11Var4 = new h11("", 12.0f, null);
        h11Var4.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        h11Var4.a();
        h11Var4.q(AndroidUtilities.dp(184.0f));
        this.f33074q0 = h11Var4;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f28135a |= 256;
            spannableStringBuilder2.setSpan(new q11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f33074q0.r(spannableStringBuilder2);
            wh.g.c(x0Var, this.f33074q0.f25472b, stack, arrayList);
            n(this.e);
            return;
        }
        h11Var4.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, h11Var4.f25471a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f33049c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f33071p = f7;
        this.f33073q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f33066m == null) {
            return;
        }
        if (this.f33082x == -1 && !this.D) {
            this.A = g();
            this.B = this.f33062k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f33082x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        c3 c3Var = this.f33066m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f33057h0 && this.f33075r == 0.0f && this.f33077s == 0.0f && this.f33079t == 0.0f) {
            z11 = false;
        }
        c3Var.f45814n = f7;
        c3Var.f45815r = f10;
        c3Var.f45816s = z11;
        c3Var.v = z10;
    }

    public final void q() {
        if (this.f33057h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
