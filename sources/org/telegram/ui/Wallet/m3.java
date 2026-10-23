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
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.kg;
public final class m3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final j3 I;
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
    public final org.telegram.ui.Cells.v0 f34804a;
    public float f34805a0;
    public final org.telegram.ui.ActionBar.g6 f34806b;
    public o1.k f34807b0;
    public float f34809c0;
    public k3 f34810d0;
    public boolean e;
    public long f34811e0;
    public boolean f34813f0;
    public boolean f34815g0;
    public boolean f34816h0;
    public final Drawable f34817i;
    public boolean f34818i0;
    public ValueAnimator f34820j0;
    public final y5 f34821k;
    public kg f34822k0;
    public final yj0 f34823l;
    public TLRPC.TL_messageActionGramTransfer f34824l0;
    public l3 f34825m;
    public boolean m0;
    public boolean f34826n;
    public i11 f34827n0;
    public boolean f34828o;
    public i11 f34829o0;
    public float f34830p;
    public i11 f34831p0;
    public float f34832q;
    public i11 f34833q0;
    public float f34834r;
    public boolean f34835r0;
    public float f34836s;
    public org.telegram.ui.Cells.o0 f34837s0;
    public float f34838t;
    public int f34839t0;
    public final ki.y5 f34841u0;
    public long v;
    public int f34842v0;
    public final org.telegram.ui.Components.f6 f34844w0;
    public final h3 f34846x0;
    public float f34847y;
    public boolean f34848y0;
    public float f34849z;
    public final ArrayList f34808c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34812f = new RectF();
    public final RectF f34814g = new RectF();
    public final Path h = new Path();
    public final Path f34819j = new Path();
    public final l9 f34840u = new l9();
    public final Rect f34843w = new Rect();
    public int f34845x = -1;
    public float C = 1.0f;

    public m3(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34805a0 = 1.0f;
        new Matrix();
        this.f34839t0 = -10624001;
        this.f34841u0 = new ki.y5(this, 3);
        this.f34842v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f34846x0 = new h3(this, 0);
        this.f34804a = v0Var;
        this.f34806b = g6Var;
        this.f34817i = v0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = v0Var.getContext();
        if (y5.G == null) {
            y5.G = new y5(context.getApplicationContext());
        }
        this.f34821k = y5.G;
        yj0 yj0Var = new yj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34823l = yj0Var;
        yj0Var.R(v0Var);
        yj0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new la(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        m mVar = new m(v0Var, 6);
        bs bsVar = bs.h;
        this.Q = new org.telegram.ui.Components.f6(1.0f, mVar, 0L, 180L, bsVar);
        this.K = new org.telegram.ui.Components.f6(new m(v0Var, 6), 320L, bsVar, 0);
        this.J = new org.telegram.ui.Components.f6(new m(v0Var, 6), 320L, bsVar, 0);
        j3 j3Var = new j3(v0Var, v0Var);
        this.I = j3Var;
        j3Var.f50787x = -1;
        yh.j1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.k6.o1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        yc ycVar = new yc(v0Var);
        this.Y = ycVar;
        ycVar.f32870f = new i3(this, 0);
        this.f34844w0 = new org.telegram.ui.Components.f6(1.0f, new m(v0Var, 6), 0L, 400L, bsVar);
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
            kVar.f17622u = lVar;
            this.F.e(0.001f);
            this.F.b(new g3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.f34804a;
        if (v0Var.isShown()) {
            AndroidUtilities.vibrateCursor(v0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34805a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f17622u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f17612a = -3.0f;
        kVar3.b(new g3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34809c0);
        yc ycVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f34809c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.f34805a0), com.google.android.gms.internal.play_billing.k3.B(this.f34809c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.f34805a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34810d0 != null) {
            return;
        }
        k3 k3Var = new k3(this, this.f34806b);
        this.f34810d0 = k3Var;
        k3Var.g(4969977, org.telegram.ui.ActionBar.k6.o1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.k6.o1(0.75f, -11807239));
        this.f34810d0.f25297x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        k3 k3Var2 = this.f34810d0;
        k3Var2.f25294t = 2.0f;
        k3Var2.f25298y = this.h;
        k3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34820j0;
        if (valueAnimator != null) {
            this.f34820j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.f6 f6Var = this.K;
            if (f6Var.f26183i) {
                this.M = false;
                this.N = 0L;
            }
            f6Var.d(1.0f, true);
            this.f34838t = 0.0f;
            this.f34840u.f34788a.clear();
            kg kgVar = this.f34822k0;
            this.f34822k0 = null;
            this.f34804a.invalidate();
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
            if (this.f34816h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34834r;
            float f12 = this.f34836s;
            this.f34834r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34836s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34834r;
            float f14 = this.f34838t;
            this.f34834r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34838t = f15;
            if (f15 < 0.001f) {
                this.f34838t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34821k.f35453y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34834r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34816h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l3 l3Var = this.f34825m;
        if (l3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            l3Var.setAlpha(f7);
        }
        this.f34804a.invalidate();
    }

    public final void j() {
        this.f34845x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.f34804a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(bs.h);
        this.G.addUpdateListener(new ja(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34821k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34845x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.f34804a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34845x = -1;
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
        this.f34838t = 0.0f;
        this.f34836s = 0.0f;
        this.f34834r = 0.0f;
        this.f34840u.f34788a.clear();
        l3 l3Var = this.f34825m;
        if (l3Var != null) {
            l3Var.setScaleX(1.0f);
            this.f34825m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34807b0;
        if (kVar != null) {
            kVar.c();
            this.f34807b0 = null;
        }
        this.f34809c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.f34804a;
        v0Var.invalidate();
        if (v0Var.getParent() instanceof View) {
            ((View) v0Var.getParent()).invalidate();
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
        org.telegram.ui.Cells.v0 v0Var = this.f34804a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34816h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34805a0 = 1.0f;
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34823l.stop();
            this.H = false;
        }
        this.f34815g0 = z10;
        this.f34824l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34818i0 = z13;
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
        if (this.f34816h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34838t = 18.0f;
            this.f34840u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.f34816h0) {
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
        this.f34816h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            k3 k3Var = this.f34810d0;
            k3Var.getClass();
            k3Var.v = Math.max(0L, 0L);
            if (this.f34810d0.d() || this.f34810d0.c()) {
                k3 k3Var2 = this.f34810d0;
                k3Var2.f25279b = -1L;
                k3Var2.f25280c = -1L;
            }
            v0Var.invalidate();
        } else {
            k3 k3Var3 = this.f34810d0;
            if (k3Var3 != null && this.f34811e0 == 0 && !k3Var3.d() && !this.f34810d0.c()) {
                this.f34810d0.a();
                v0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21421q7, this.f34806b);
        } else if (z10) {
            i11 = -15352320;
        } else {
            i11 = -11814402;
        }
        this.f34848y0 = z14;
        int i12 = this.U;
        if (i12 == 0) {
            this.V = i11;
            this.U = i11;
            this.T = i11;
        } else if (i11 != i12) {
            this.T = this.V;
            this.U = i11;
            this.J.d(0.0f, true);
            v0Var.invalidate();
        }
        if (z14) {
            string = LocaleController.getString(R.string.WalletTransferStatusFailed);
        } else if (z10) {
            string = LocaleController.getString(R.string.WalletTransferStatusSent);
        } else {
            string = LocaleController.getString(R.string.WalletTransferStatusReceived);
        }
        j3 j3Var = this.I;
        if (z15) {
            j3Var.f(10, string, true);
        } else {
            j3Var.g(10, string);
        }
        SpannableStringBuilder p5 = l0.p(l0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.k("Grams", p5, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        ki.y5 y5Var = this.f34841u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34827n0 = new i11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = x5.f(x5.d(str3.toUpperCase(locale)));
        i11 i11Var = new i11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        i11Var.n(2);
        this.f34829o0 = i11Var;
        i11Var.r(f7);
        if (TextUtils.isEmpty(str)) {
            this.f34831p0 = null;
        } else {
            i11 i11Var2 = new i11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34831p0 = i11Var2;
            i11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34831p0.f27162a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34808c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34833q0 = null;
            return;
        }
        i11 i11Var3 = new i11("", 12.0f, null);
        i11Var3.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        i11Var3.a();
        i11Var3.q(AndroidUtilities.dp(184.0f));
        this.f34833q0 = i11Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f29754a |= 256;
            spannableStringBuilder2.setSpan(new r11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34833q0.r(spannableStringBuilder2);
            wh.g.c(v0Var, this.f34833q0.f27163b, stack, arrayList);
            n(this.e);
            return;
        }
        i11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, i11Var3.f27162a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f34808c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34830p = f7;
        this.f34832q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34825m == null) {
            return;
        }
        if (this.f34845x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34821k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34845x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        l3 l3Var = this.f34825m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34816h0 && this.f34834r == 0.0f && this.f34836s == 0.0f && this.f34838t == 0.0f) {
            z11 = false;
        }
        l3Var.f47628r = f7;
        l3Var.f47629s = f10;
        l3Var.v = z11;
        l3Var.f47630w = z10;
    }

    public final void q() {
        if (this.f34816h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
