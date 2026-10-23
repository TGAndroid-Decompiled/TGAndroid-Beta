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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.vj0;
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
    public final org.telegram.ui.Cells.w0 f34559a;
    public float f34560a0;
    public final org.telegram.ui.ActionBar.d6 f34561b;
    public o1.k f34562b0;
    public float f34564c0;
    public l3 f34565d0;
    public boolean e;
    public long f34566e0;
    public boolean f34568f0;
    public boolean f34570g0;
    public boolean f34571h0;
    public final Drawable f34572i;
    public boolean f34573i0;
    public ValueAnimator f34575j0;
    public final y5 f34576k;
    public kg f34577k0;
    public final vj0 f34578l;
    public TLRPC.TL_messageActionGramTransfer f34579l0;
    public m3 f34580m;
    public boolean m0;
    public boolean f34581n;
    public f11 f34582n0;
    public boolean f34583o;
    public f11 f34584o0;
    public float f34585p;
    public f11 f34586p0;
    public float f34587q;
    public f11 f34588q0;
    public float f34589r;
    public boolean f34590r0;
    public float f34591s;
    public org.telegram.ui.Cells.p0 f34592s0;
    public float f34593t;
    public int f34594t0;
    public final ki.y5 f34596u0;
    public long v;
    public int f34597v0;
    public final org.telegram.ui.Components.f6 f34599w0;
    public final i3 f34601x0;
    public float f34602y;
    public float f34603z;
    public final ArrayList f34563c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34567f = new RectF();
    public final RectF f34569g = new RectF();
    public final Path h = new Path();
    public final Path f34574j = new Path();
    public final k9 f34595u = new k9();
    public final Rect f34598w = new Rect();
    public int f34600x = -1;
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
        this.f34560a0 = 1.0f;
        new Matrix();
        this.f34594t0 = -10624001;
        this.f34596u0 = new ki.y5(this, 3);
        this.f34597v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f34601x0 = new i3(this, 0);
        this.f34559a = w0Var;
        this.f34561b = d6Var;
        this.f34572i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (y5.G == null) {
            y5.G = new y5(context.getApplicationContext());
        }
        this.f34576k = y5.G;
        vj0 vj0Var = new vj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34578l = vj0Var;
        vj0Var.R(w0Var);
        vj0Var.K(0);
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
        k3Var.f50335x = -1;
        yh.j1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.h6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        yc ycVar = new yc(w0Var);
        this.Y = ycVar;
        ycVar.f32634f = new j3(this, 0);
        this.f34599w0 = new org.telegram.ui.Components.f6(1.0f, new n(w0Var, 6), 0L, 400L, bsVar);
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
        org.telegram.ui.Cells.w0 w0Var = this.f34559a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34560a0));
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
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34564c0);
        yc ycVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f34564c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.f34560a0), com.google.android.gms.internal.play_billing.k3.B(this.f34564c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.f34560a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34565d0 != null) {
            return;
        }
        l3 l3Var = new l3(this, this.f34561b);
        this.f34565d0 = l3Var;
        l3Var.g(4969977, org.telegram.ui.ActionBar.h6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.h6.m1(0.75f, -11807239));
        this.f34565d0.f24880x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        l3 l3Var2 = this.f34565d0;
        l3Var2.f24877t = 2.0f;
        l3Var2.f24881y = this.h;
        l3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34575j0;
        if (valueAnimator != null) {
            this.f34575j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.f6 f6Var = this.K;
            if (f6Var.f26093i) {
                this.M = false;
                this.N = 0L;
            }
            f6Var.d(1.0f, true);
            this.f34593t = 0.0f;
            this.f34595u.f34446a.clear();
            kg kgVar = this.f34577k0;
            this.f34577k0 = null;
            this.f34559a.invalidate();
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
            if (this.f34571h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34589r;
            float f12 = this.f34591s;
            this.f34589r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34591s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34589r;
            float f14 = this.f34593t;
            this.f34589r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34593t = f15;
            if (f15 < 0.001f) {
                this.f34593t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34576k.f35155y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34589r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34571h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        m3 m3Var = this.f34580m;
        if (m3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            m3Var.setAlpha(f7);
        }
        this.f34559a.invalidate();
    }

    public final void j() {
        this.f34600x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f34559a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(bs.h);
        this.G.addUpdateListener(new ja(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34576k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34600x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f34559a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34600x = -1;
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
        this.f34593t = 0.0f;
        this.f34591s = 0.0f;
        this.f34589r = 0.0f;
        this.f34595u.f34446a.clear();
        m3 m3Var = this.f34580m;
        if (m3Var != null) {
            m3Var.setScaleX(1.0f);
            this.f34580m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34562b0;
        if (kVar != null) {
            kVar.c();
            this.f34562b0 = null;
        }
        this.f34564c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.f34559a;
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
        org.telegram.ui.Cells.w0 w0Var = this.f34559a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34571h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34560a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34578l.stop();
            this.H = false;
        }
        this.f34570g0 = z10;
        this.f34579l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34573i0 = z13;
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
        if (this.f34571h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34593t = 18.0f;
            this.f34595u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f34571h0) {
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
        this.f34571h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            l3 l3Var = this.f34565d0;
            l3Var.getClass();
            l3Var.v = Math.max(0L, 0L);
            if (this.f34565d0.d() || this.f34565d0.c()) {
                l3 l3Var2 = this.f34565d0;
                l3Var2.f24862b = -1L;
                l3Var2.f24863c = -1L;
            }
            w0Var.invalidate();
        } else {
            l3 l3Var3 = this.f34565d0;
            if (l3Var3 != null && this.f34566e0 == 0 && !l3Var3.d() && !this.f34565d0.c()) {
                this.f34565d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, this.f34561b);
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
        ki.y5 y5Var = this.f34596u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34582n0 = new f11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = x5.f(x5.d(str3.toUpperCase(locale)));
        f11 f11Var = new f11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        f11Var.n(2);
        this.f34584o0 = f11Var;
        f11Var.r(f7);
        if (TextUtils.isEmpty(str)) {
            this.f34586p0 = null;
        } else {
            f11 f11Var2 = new f11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34586p0 = f11Var2;
            f11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34586p0.f26023a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34563c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34588q0 = null;
            return;
        }
        f11 f11Var3 = new f11("", 12.0f, null);
        f11Var3.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        f11Var3.a();
        f11Var3.q(AndroidUtilities.dp(184.0f));
        this.f34588q0 = f11Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f28654a |= 256;
            spannableStringBuilder2.setSpan(new o11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34588q0.r(spannableStringBuilder2);
            wh.g.c(w0Var, this.f34588q0.f26024b, stack, arrayList);
            n(this.e);
            return;
        }
        f11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, f11Var3.f26023a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f34563c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34585p = f7;
        this.f34587q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34580m == null) {
            return;
        }
        if (this.f34600x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34576k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34600x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        m3 m3Var = this.f34580m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34571h0 && this.f34589r == 0.0f && this.f34591s == 0.0f && this.f34593t == 0.0f) {
            z11 = false;
        }
        m3Var.f47193r = f7;
        m3Var.f47194s = f10;
        m3Var.v = z11;
        m3Var.f47195w = z10;
    }

    public final void q() {
        if (this.f34571h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
