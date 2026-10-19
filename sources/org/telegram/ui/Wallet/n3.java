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
import ei.ja;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.kg;
public final class n3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final k3 I;
    public final org.telegram.ui.Components.f6 J;
    public final org.telegram.ui.Components.f6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.f6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final yc Y;
    public o1.k Z;
    public final org.telegram.ui.Cells.w0 f34548a;
    public float f34549a0;
    public final org.telegram.ui.ActionBar.d6 f34550b;
    public o1.k f34551b0;
    public float f34553c0;
    public l3 f34554d0;
    public boolean e;
    public long f34555e0;
    public boolean f34557f0;
    public boolean f34559g0;
    public boolean f34560h0;
    public final Drawable f34561i;
    public boolean f34562i0;
    public ValueAnimator f34564j0;
    public final y5 f34565k;
    public kg f34566k0;
    public final uj0 f34567l;
    public TLRPC.TL_messageActionGramTransfer f34568l0;
    public m3 f34569m;
    public boolean m0;
    public boolean f34570n;
    public e11 f34571n0;
    public boolean f34572o;
    public e11 f34573o0;
    public float f34574p;
    public e11 f34575p0;
    public float f34576q;
    public e11 f34577q0;
    public float f34578r;
    public boolean f34579r0;
    public float f34580s;
    public org.telegram.ui.Cells.p0 f34581s0;
    public float f34582t;
    public int f34583t0;
    public final ki.y5 f34585u0;
    public long v;
    public int f34586v0;
    public final org.telegram.ui.Components.f6 f34588w0;
    public final i3 f34590x0;
    public float f34591y;
    public float f34592z;
    public final ArrayList f34552c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34556f = new RectF();
    public final RectF f34558g = new RectF();
    public final Path h = new Path();
    public final Path f34563j = new Path();
    public final k9 f34584u = new k9();
    public final Rect f34587w = new Rect();
    public int f34589x = -1;
    public float C = 1.0f;

    public n3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34549a0 = 1.0f;
        new Matrix();
        this.f34583t0 = -10624001;
        this.f34585u0 = new ki.y5(this, 3);
        this.f34586v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f34590x0 = new i3(this, 0);
        this.f34548a = w0Var;
        this.f34550b = d6Var;
        this.f34561i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (y5.G == null) {
            y5.G = new y5(context.getApplicationContext());
        }
        this.f34565k = y5.G;
        uj0 uj0Var = new uj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34567l = uj0Var;
        uj0Var.R(w0Var);
        uj0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new la(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        n nVar = new n(w0Var, 6);
        bs bsVar = bs.h;
        this.Q = new org.telegram.ui.Components.f6(1.0f, nVar, 0L, 180L, bsVar);
        this.K = new org.telegram.ui.Components.f6(new n(w0Var, 6), 320L, bsVar, 0);
        this.J = new org.telegram.ui.Components.f6(new n(w0Var, 6), 320L, bsVar, 0);
        k3 k3Var = new k3(w0Var, w0Var);
        this.I = k3Var;
        k3Var.f50326x = -1;
        yh.j1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.h6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        yc ycVar = new yc(w0Var);
        this.Y = ycVar;
        ycVar.f32596f = new j3(this, 0);
        this.f34588w0 = new org.telegram.ui.Components.f6(1.0f, new n(w0Var, 6), 0L, 400L, bsVar);
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
            kVar.f17559u = lVar;
            this.F.e(0.001f);
            this.F.b(new h3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.f34548a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34549a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f17559u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f17549a = -3.0f;
        kVar3.b(new h3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34553c0);
        yc ycVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f34553c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.f34549a0), com.google.android.gms.internal.play_billing.k3.B(this.f34553c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.f34549a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34554d0 != null) {
            return;
        }
        l3 l3Var = new l3(this, this.f34550b);
        this.f34554d0 = l3Var;
        l3Var.g(4969977, org.telegram.ui.ActionBar.h6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.h6.m1(0.75f, -11807239));
        this.f34554d0.f24891x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        l3 l3Var2 = this.f34554d0;
        l3Var2.f24888t = 2.0f;
        l3Var2.f24892y = this.h;
        l3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34564j0;
        if (valueAnimator != null) {
            this.f34564j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.f6 f6Var = this.K;
            if (f6Var.f26111i) {
                this.M = false;
                this.N = 0L;
            }
            f6Var.d(1.0f, true);
            this.f34582t = 0.0f;
            this.f34584u.f34435a.clear();
            kg kgVar = this.f34566k0;
            this.f34566k0 = null;
            this.f34548a.invalidate();
            if (kgVar != null) {
                AndroidUtilities.runOnUIThread(kgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f34560h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34578r;
            float f12 = this.f34580s;
            this.f34578r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34580s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34578r;
            float f14 = this.f34582t;
            this.f34578r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34582t = f15;
            if (f15 < 0.001f) {
                this.f34582t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34565k.f35144y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34578r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34560h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        m3 m3Var = this.f34569m;
        if (m3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            m3Var.setAlpha(f7);
        }
        this.f34548a.invalidate();
    }

    public final void j() {
        this.f34589x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f34548a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(bs.h);
        this.G.addUpdateListener(new ja(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34565k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34589x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f34548a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34589x = -1;
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
        this.f34582t = 0.0f;
        this.f34580s = 0.0f;
        this.f34578r = 0.0f;
        this.f34584u.f34435a.clear();
        m3 m3Var = this.f34569m;
        if (m3Var != null) {
            m3Var.setScaleX(1.0f);
            this.f34569m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34551b0;
        if (kVar != null) {
            kVar.c();
            this.f34551b0 = null;
        }
        this.f34553c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.f34548a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
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
        org.telegram.ui.Cells.w0 w0Var = this.f34548a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34560h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34549a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34567l.stop();
            this.H = false;
        }
        this.f34559g0 = z10;
        this.f34568l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34562i0 = z13;
        org.telegram.ui.Components.f6 f6Var = this.K;
        if (z13) {
            f6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            f6Var.d(1.0f, true);
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
        if (this.f34560h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34582t = 18.0f;
            this.f34584u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f34560h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            f6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            f6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f34560h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            l3 l3Var = this.f34554d0;
            l3Var.getClass();
            l3Var.v = Math.max(0L, 0L);
            if (this.f34554d0.d() || this.f34554d0.c()) {
                l3 l3Var2 = this.f34554d0;
                l3Var2.f24873b = -1L;
                l3Var2.f24874c = -1L;
            }
            w0Var.invalidate();
        } else {
            l3 l3Var3 = this.f34554d0;
            if (l3Var3 != null && this.f34555e0 == 0 && !l3Var3.d() && !this.f34554d0.c()) {
                this.f34554d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21225q7, this.f34550b);
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
        k3 k3Var = this.I;
        if (z15) {
            k3Var.f(10, string, true);
        } else {
            k3Var.g(10, string);
        }
        SpannableStringBuilder p5 = m0.p(m0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) p5.getSpans(0, p5.length(), RelativeSizeSpan.class)) {
            p5.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        p5.insert(0, (CharSequence) str2);
        int indexOf = p5.toString().indexOf(46);
        if (indexOf >= 0) {
            p5.setSpan(new RelativeSizeSpan(0.75f), indexOf, p5.length(), 33);
        }
        Object obj = new Object();
        p5.setSpan(obj, 0, p5.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m0.k("Grams", p5, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        ki.y5 y5Var = this.f34585u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34571n0 = new e11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = x5.f(x5.d(str3.toUpperCase(locale)));
        e11 e11Var = new e11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        e11Var.n(2);
        this.f34573o0 = e11Var;
        e11Var.r(f7);
        if (TextUtils.isEmpty(str)) {
            this.f34575p0 = null;
        } else {
            e11 e11Var2 = new e11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34575p0 = e11Var2;
            e11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34575p0.f25726a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34552c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34577q0 = null;
            return;
        }
        e11 e11Var3 = new e11("", 12.0f, null);
        e11Var3.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        e11Var3.a();
        e11Var3.q(AndroidUtilities.dp(184.0f));
        this.f34577q0 = e11Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f28357a |= 256;
            spannableStringBuilder2.setSpan(new n11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34577q0.r(spannableStringBuilder2);
            wh.g.c(w0Var, this.f34577q0.f25727b, stack, arrayList);
            n(this.e);
            return;
        }
        e11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, e11Var3.f25726a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f34552c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34574p = f7;
        this.f34576q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34569m == null) {
            return;
        }
        if (this.f34589x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34565k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34589x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        m3 m3Var = this.f34569m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34560h0 && this.f34578r == 0.0f && this.f34580s == 0.0f && this.f34582t == 0.0f) {
            z11 = false;
        }
        m3Var.f47184r = f7;
        m3Var.f47185s = f10;
        m3Var.v = z11;
        m3Var.f47186w = z10;
    }

    public final void q() {
        if (this.f34560h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
