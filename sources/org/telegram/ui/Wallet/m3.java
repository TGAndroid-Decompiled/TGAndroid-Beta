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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.jg;
public final class m3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.j F;
    public ValueAnimator G;
    public boolean H;
    public final j3 I;
    public final org.telegram.ui.Components.h6 J;
    public final org.telegram.ui.Components.h6 K;
    public final Paint L;
    public boolean M;
    public long N;
    public final Paint O;
    public long P;
    public final org.telegram.ui.Components.h6 Q;
    public float R;
    public long S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public final Paint X;
    public final xc Y;
    public o1.j Z;
    public final org.telegram.ui.Cells.v0 f36884a;
    public float f36885a0;
    public final org.telegram.ui.ActionBar.u6 f36886b;
    public o1.j f36887b0;
    public float f36889c0;
    public k3 f36890d0;
    public boolean e;
    public long f36891e0;
    public boolean f36893f0;
    public boolean f36895g0;
    public boolean f36896h0;
    public final Drawable f36897i;
    public boolean f36898i0;
    public ValueAnimator f36900j0;
    public final x5 f36901k;
    public jg f36902k0;
    public final xj0 f36903l;
    public TLRPC.TL_messageActionGramTransfer f36904l0;
    public l3 f36905m;
    public boolean m0;
    public boolean f36906n;
    public q11 f36907n0;
    public boolean f36908o;
    public q11 f36909o0;
    public float f36910p;
    public q11 f36911p0;
    public float f36912q;
    public q11 f36913q0;
    public float f36914r;
    public boolean f36915r0;
    public float f36916s;
    public org.telegram.ui.Cells.o0 f36917s0;
    public float f36918t;
    public int f36919t0;
    public final li.z5 f36921u0;
    public long v;
    public int f36922v0;
    public final org.telegram.ui.Components.h6 f36924w0;
    public final h3 f36926x0;
    public float f36927y;
    public boolean f36928y0;
    public float f36929z;
    public final ArrayList f36888c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f36892f = new RectF();
    public final RectF f36894g = new RectF();
    public final Path h = new Path();
    public final Path f36899j = new Path();
    public final k9 f36920u = new k9();
    public final Rect f36923w = new Rect();
    public int f36925x = -1;
    public float C = 1.0f;

    public m3(org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f36885a0 = 1.0f;
        new Matrix();
        this.f36919t0 = -10624001;
        this.f36921u0 = new li.z5(this, 3);
        this.f36922v0 = -1;
        new Paint(1);
        new Paint(1);
        this.f36926x0 = new h3(this, 0);
        this.f36884a = v0Var;
        this.f36886b = u6Var;
        this.f36897i = v0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = v0Var.getContext();
        if (x5.G == null) {
            x5.G = new x5(context.getApplicationContext());
        }
        this.f36901k = x5.G;
        xj0 xj0Var = new xj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f36903l = xj0Var;
        xj0Var.R(v0Var);
        xj0Var.K(0);
        v0Var.addOnAttachStateChangeListener(new na(2, this, v0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        m mVar = new m(v0Var, 6);
        ds dsVar = ds.h;
        this.Q = new org.telegram.ui.Components.h6(1.0f, mVar, 0L, 180L, dsVar);
        this.K = new org.telegram.ui.Components.h6(new m(v0Var, 6), 320L, dsVar, 0);
        this.J = new org.telegram.ui.Components.h6(new m(v0Var, 6), 320L, dsVar, 0);
        j3 j3Var = new j3(v0Var, v0Var);
        this.I = j3Var;
        j3Var.f53073x = -1;
        zh.j1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.y6.o1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        xc xcVar = new xc(v0Var);
        this.Y = xcVar;
        xcVar.f34685f = new i3(this, 0);
        this.f36924w0 = new org.telegram.ui.Components.h6(1.0f, new m(v0Var, 6), 0L, 400L, dsVar);
    }

    public static int h() {
        return AndroidUtilities.dp(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.j jVar = new o1.j(new ac.a(this.C));
            this.F = jVar;
            o1.k kVar = new o1.k(f7);
            kVar.a(0.55f);
            kVar.b(280.0f);
            jVar.f18969u = kVar;
            this.F.e(0.001f);
            this.F.b(new g3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.v0 v0Var = this.f36884a;
        if (v0Var.isShown()) {
            AndroidUtilities.vibrateCursor(v0Var);
        }
        o1.j jVar = this.Z;
        if (jVar != null) {
            jVar.c();
        }
        o1.j jVar2 = new o1.j(new ac.a(this.f36885a0));
        this.Z = jVar2;
        o1.k kVar = new o1.k(1.0f);
        kVar.a(0.55f);
        kVar.b(280.0f);
        jVar2.f18969u = kVar;
        this.Z.e(0.001f);
        o1.j jVar3 = this.Z;
        jVar3.f18960a = -3.0f;
        jVar3.b(new g3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f36889c0);
        xc xcVar = this.Y;
        canvas.scale(c3.h0.C(this.f36889c0, 0.012f, 1.0f, xcVar.a(0.025f) * this.f36885a0), c3.h0.D(this.f36889c0, 0.04f, 1.0f, xcVar.a(0.025f) * this.f36885a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.m3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f36890d0 != null) {
            return;
        }
        k3 k3Var = new k3(this, this.f36886b);
        this.f36890d0 = k3Var;
        k3Var.g(4969977, org.telegram.ui.ActionBar.y6.o1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.y6.o1(0.75f, -11807239));
        this.f36890d0.f27478x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        k3 k3Var2 = this.f36890d0;
        k3Var2.f27475t = 2.0f;
        k3Var2.f27479y = this.h;
        k3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f36900j0;
        if (valueAnimator != null) {
            this.f36900j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.h6 h6Var = this.K;
            if (h6Var.f28812i) {
                this.M = false;
                this.N = 0L;
            }
            h6Var.d(1.0f, true);
            this.f36918t = 0.0f;
            this.f36920u.f36798a.clear();
            jg jgVar = this.f36902k0;
            this.f36902k0 = null;
            this.f36884a.invalidate();
            if (jgVar != null) {
                AndroidUtilities.runOnUIThread(jgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f36896h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f36914r;
            float f12 = this.f36916s;
            this.f36914r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f36916s = c3.h0.z(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f36914r;
            float f14 = this.f36918t;
            this.f36914r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f36918t = f15;
            if (f15 < 0.001f) {
                this.f36918t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f36901k.f37475y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f36914r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f36896h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        l3 l3Var = this.f36905m;
        if (l3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            l3Var.setAlpha(f7);
        }
        this.f36884a.invalidate();
    }

    public final void j() {
        this.f36925x = -1;
        org.telegram.ui.Cells.v0 v0Var = this.f36884a;
        if (v0Var.getParent() != null) {
            v0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(ds.h);
        this.G.addUpdateListener(new fi.fa(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f36901k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f36925x != -1) {
            org.telegram.ui.Cells.v0 v0Var = this.f36884a;
            if (v0Var.getParent() != null) {
                v0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f36925x = -1;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        o1.j jVar = this.F;
        if (jVar != null) {
            jVar.c();
            this.F = null;
        }
        this.D = false;
        this.C = 1.0f;
        this.B = 0.0f;
        this.v = 0L;
        this.f36918t = 0.0f;
        this.f36916s = 0.0f;
        this.f36914r = 0.0f;
        this.f36920u.f36798a.clear();
        l3 l3Var = this.f36905m;
        if (l3Var != null) {
            l3Var.setScaleX(1.0f);
            this.f36905m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.j jVar = this.f36887b0;
        if (jVar != null) {
            jVar.c();
            this.f36887b0 = null;
        }
        this.f36889c0 = 0.0f;
        org.telegram.ui.Cells.v0 v0Var = this.f36884a;
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
        org.telegram.ui.Cells.v0 v0Var = this.f36884a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f36896h0 = false;
            k();
            o1.j jVar = this.Z;
            if (jVar != null) {
                jVar.c();
                this.Z = null;
            }
            this.f36885a0 = 1.0f;
            v0Var.invalidate();
            if (v0Var.getParent() instanceof View) {
                ((View) v0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f36903l.stop();
            this.H = false;
        }
        this.f36895g0 = z10;
        this.f36904l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f36898i0 = z13;
        org.telegram.ui.Components.h6 h6Var = this.K;
        if (z13) {
            h6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z11) {
            h6Var.d(1.0f, true);
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
        if (this.f36896h0 && z10 && i10 == 0) {
            b();
            g();
            this.f36918t = 18.0f;
            this.f36920u.f();
            v0Var.invalidate();
        }
        if (z15) {
            if (!this.f36896h0) {
                this.P = SystemClock.elapsedRealtime();
            }
            h6Var.d(0.0f, true);
            this.M = false;
            this.N = 0L;
        } else if (z14) {
            h6Var.d(1.0f, true);
            this.M = false;
            this.N = 0L;
        }
        q();
        this.f36896h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            e();
            k3 k3Var = this.f36890d0;
            k3Var.getClass();
            k3Var.v = Math.max(0L, 0L);
            if (this.f36890d0.d() || this.f36890d0.c()) {
                k3 k3Var2 = this.f36890d0;
                k3Var2.f27460b = -1L;
                k3Var2.f27461c = -1L;
            }
            v0Var.invalidate();
        } else {
            k3 k3Var3 = this.f36890d0;
            if (k3Var3 != null && this.f36891e0 == 0 && !k3Var3.d() && !this.f36890d0.c()) {
                this.f36890d0.a();
                v0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23596q7, this.f36886b);
        } else if (z10) {
            i11 = -15352320;
        } else {
            i11 = -11814402;
        }
        this.f36928y0 = z14;
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
        SpannableStringBuilder p10 = l0.p(l0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) p10.getSpans(0, p10.length(), RelativeSizeSpan.class)) {
            p10.removeSpan(relativeSizeSpan);
        }
        if (z10) {
            str2 = "–";
        } else {
            str2 = "+";
        }
        p10.insert(0, (CharSequence) str2);
        int indexOf = p10.toString().indexOf(46);
        if (indexOf >= 0) {
            p10.setSpan(new RelativeSizeSpan(0.75f), indexOf, p10.length(), 33);
        }
        Object obj = new Object();
        p10.setSpan(obj, 0, p10.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.k("Grams", p10, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        li.z5 z5Var = this.f36921u0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(z5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(z5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f36907n0 = new q11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String f7 = w5.f(w5.d(str3.toUpperCase(locale)));
        q11 q11Var = new q11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        q11Var.n(2);
        this.f36909o0 = q11Var;
        q11Var.r(f7);
        if (TextUtils.isEmpty(str)) {
            this.f36911p0 = null;
        } else {
            q11 q11Var2 = new q11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f36911p0 = q11Var2;
            q11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f36911p0.f31786a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f36888c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f36913q0 = null;
            return;
        }
        q11 q11Var3 = new q11("", 12.0f, null);
        q11Var3.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        q11Var3.a();
        q11Var3.q(AndroidUtilities.dp(184.0f));
        this.f36913q0 = q11Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f34904a |= 256;
            spannableStringBuilder2.setSpan(new z11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f36913q0.r(spannableStringBuilder2);
            xh.g.c(v0Var, this.f36913q0.f31787b, stack, arrayList);
            n(this.e);
            return;
        }
        q11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, q11Var3.f31786a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f36888c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((xh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f36910p = f7;
        this.f36912q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f36905m == null) {
            return;
        }
        if (this.f36925x == -1 && !this.D) {
            this.A = g();
            this.B = this.f36901k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f36925x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        l3 l3Var = this.f36905m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f36896h0 && this.f36914r == 0.0f && this.f36916s == 0.0f && this.f36918t == 0.0f) {
            z11 = false;
        }
        l3Var.f49892r = f7;
        l3Var.f49893s = f10;
        l3Var.v = z11;
        l3Var.f49894w = z10;
    }

    public final void q() {
        if (this.f36896h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
