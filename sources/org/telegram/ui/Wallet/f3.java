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
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.w11;
import org.telegram.ui.sg;
public final class f3 {
    public float A;
    public float B;
    public boolean D;
    public boolean E;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final c3 I;
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
    public final org.telegram.ui.Cells.w0 f34896a;
    public float f34897a0;
    public final org.telegram.ui.ActionBar.d6 f34898b;
    public o1.k f34899b0;
    public float f34901c0;
    public d3 f34902d0;
    public boolean f34903e;
    public long f34904e0;
    public boolean f34906f0;
    public boolean f34908g0;
    public boolean f34909h0;
    public final Drawable f34910i;
    public boolean f34911i0;
    public ValueAnimator f34913j0;
    public final n5 f34914k;
    public sg f34915k0;
    public final ek0 f34916l;
    public TLRPC.TL_messageActionGramTransfer f34917l0;
    public e3 f34918m;
    public boolean m0;
    public boolean f34919n;
    public n11 f34920n0;
    public boolean f34921o;
    public n11 f34922o0;
    public float f34923p;
    public n11 f34924p0;
    public float f34925q;
    public n11 f34926q0;
    public float f34927r;
    public boolean f34928r0;
    public float f34929s;
    public org.telegram.ui.Cells.p0 f34930s0;
    public float f34931t;
    public long v;
    public float f34935y;
    public float f34936z;
    public final ArrayList f34900c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34905f = new RectF();
    public final RectF f34907g = new RectF();
    public final Path h = new Path();
    public final Path f34912j = new Path();
    public final n8 f34932u = new n8();
    public final Rect f34933w = new Rect();
    public int f34934x = -1;
    public float C = 1.0f;

    public f3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34897a0 = 1.0f;
        this.f34896a = w0Var;
        this.f34898b = d6Var;
        this.f34910i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (n5.G == null) {
            n5.G = new n5(context.getApplicationContext());
        }
        this.f34914k = n5.G;
        ek0 ek0Var = new ek0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34916l = ek0Var;
        ek0Var.R(w0Var);
        ek0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new na(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        o oVar = new o(w0Var, 5);
        is isVar = is.h;
        this.Q = new org.telegram.ui.Components.g6(1.0f, oVar, 0L, 180L, isVar);
        this.K = new org.telegram.ui.Components.g6(new o(w0Var, 5), 320L, isVar, 0);
        this.J = new org.telegram.ui.Components.g6(new o(w0Var, 5), 320L, isVar, 0);
        c3 c3Var = new c3(w0Var, w0Var);
        this.I = c3Var;
        c3Var.f51462x = -1;
        xh.m1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.h6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        bd bdVar = new bd(w0Var);
        this.Y = bdVar;
        bdVar.f24911f = new b3(this, 0);
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
            kVar.f16988u = lVar;
            this.F.e(0.001f);
            this.F.b(new a3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.f34896a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34897a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f16988u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f16977a = -3.0f;
        kVar3.b(new a3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34901c0);
        bd bdVar = this.Y;
        canvas.scale(com.google.android.gms.internal.vision.e2.A(this.f34901c0, 0.012f, 1.0f, bdVar.a(0.025f) * this.f34897a0), com.google.android.gms.internal.vision.e2.B(this.f34901c0, 0.04f, 1.0f, bdVar.a(0.025f) * this.f34897a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.f3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.f34902d0 != null) {
            return;
        }
        d3 d3Var = new d3(this, this.f34898b);
        this.f34902d0 = d3Var;
        d3Var.g(4969977, org.telegram.ui.ActionBar.h6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.h6.m1(0.75f, -11807239));
        this.f34902d0.f27659x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        d3 d3Var2 = this.f34902d0;
        d3Var2.f27656t = 2.0f;
        d3Var2.f27660y = this.h;
        d3Var2.D = true;
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f34913j0;
        if (valueAnimator != null) {
            this.f34913j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.g6 g6Var = this.K;
            if (g6Var.f26617i) {
                this.M = false;
                this.N = 0L;
            }
            g6Var.d(1.0f, true);
            this.f34931t = 0.0f;
            this.f34932u.f35338a.clear();
            sg sgVar = this.f34915k0;
            this.f34915k0 = null;
            this.f34896a.invalidate();
            if (sgVar != null) {
                AndroidUtilities.runOnUIThread(sgVar, 1L);
            }
        }
    }

    public final float g() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = this.v;
        if (j3 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j3)) / 1000.0f);
            if (this.f34909h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34927r;
            float f12 = this.f34929s;
            this.f34927r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34929s = com.google.android.gms.internal.vision.e2.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34927r;
            float f14 = this.f34931t;
            this.f34927r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34931t = f15;
            if (f15 < 0.001f) {
                this.f34931t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34914k.f35332y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34927r;
    }

    public final void i(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34909h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        e3 e3Var = this.f34918m;
        if (e3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            e3Var.setAlpha(f7);
        }
        this.f34896a.invalidate();
    }

    public final void j() {
        this.f34934x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f34896a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(is.h);
        this.G.addUpdateListener(new ya(this, (float) Math.IEEEremainder(this.A - g(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34914k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void k() {
        i(false);
        this.Q.d(1.0f, true);
        if (this.f34934x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f34896a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34934x = -1;
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
        this.f34931t = 0.0f;
        this.f34929s = 0.0f;
        this.f34927r = 0.0f;
        this.f34932u.f35338a.clear();
        e3 e3Var = this.f34918m;
        if (e3Var != null) {
            e3Var.setScaleX(1.0f);
            this.f34918m.setScaleY(1.0f);
        }
    }

    public final void l() {
        o1.k kVar = this.f34899b0;
        if (kVar != null) {
            kVar.c();
            this.f34899b0 = null;
        }
        this.f34901c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.f34896a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void m(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        int i11;
        String string;
        String str2;
        org.telegram.ui.Cells.w0 w0Var = this.f34896a;
        if (z11) {
            f();
            this.M = false;
            this.N = 0L;
            this.f34909h0 = false;
            k();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34897a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            l();
            this.R = 0.0f;
            this.S = 0L;
            this.f34916l.stop();
            this.H = false;
        }
        this.f34908g0 = z10;
        this.f34917l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34911i0 = z13;
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
        if (this.f34909h0 && z10 && i10 == 0) {
            b();
            g();
            this.f34931t = 18.0f;
            this.f34932u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f34909h0) {
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
        this.f34909h0 = z15;
        if (z15) {
            j3 = SystemClock.elapsedRealtime();
        } else {
            j3 = 0;
        }
        this.S = j3;
        if (z15) {
            e();
            d3 d3Var = this.f34902d0;
            d3Var.getClass();
            d3Var.v = Math.max(0L, 0L);
            if (this.f34902d0.d() || this.f34902d0.c()) {
                d3 d3Var2 = this.f34902d0;
                d3Var2.f27640b = -1L;
                d3Var2.f27641c = -1L;
            }
            w0Var.invalidate();
        } else {
            d3 d3Var3 = this.f34902d0;
            if (d3Var3 != null && this.f34904e0 == 0 && !d3Var3.d() && !this.f34902d0.c()) {
                this.f34902d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21026q7, this.f34898b);
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
        c3 c3Var = this.I;
        if (z15) {
            c3Var.f(10, string, true);
        } else {
            n11 n11Var = c3Var.f51455c;
            if (n11Var == null) {
                c3Var.f(10, string, true);
            } else if (!TextUtils.equals(n11Var.k(), string)) {
                c3Var.d = c3Var.f51455c;
                c3Var.f51455c = new n11(string, 10, AndroidUtilities.bold());
                c3Var.f51456e.d(0.0f, true);
                c3Var.invalidateSelf();
            }
        }
        SpannableStringBuilder o9 = l0.o(l0.n(Math.abs(tL_messageActionGramTransfer.amount), false), 0.75f);
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l0.k("Grams", o9, R.string.Grams_other));
        int spanStart = spannableStringBuilder.getSpanStart(obj);
        int spanEnd = spannableStringBuilder.getSpanEnd(obj);
        spannableStringBuilder.removeSpan(obj);
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10624001), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34920n0 = new n11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String d = k5.d(k5.b(str3.toUpperCase(locale)));
        n11 n11Var2 = new n11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        n11Var2.n(2);
        this.f34922o0 = n11Var2;
        n11Var2.r(d);
        if (TextUtils.isEmpty(str)) {
            this.f34924p0 = null;
        } else {
            n11 n11Var3 = new n11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34924p0 = n11Var3;
            n11Var3.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34924p0.f28900a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34900c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34926q0 = null;
            return;
        }
        n11 n11Var4 = new n11("", 12.0f, null);
        n11Var4.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        n11Var4.a();
        n11Var4.q(AndroidUtilities.dp(184.0f));
        this.f34926q0 = n11Var4;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f31643a |= 256;
            spannableStringBuilder2.setSpan(new w11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34926q0.r(spannableStringBuilder2);
            vh.g.c(w0Var, this.f34926q0.f28901b, stack, arrayList);
            n(this.f34903e);
            return;
        }
        n11Var4.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, n11Var4.f28900a.getFontMetricsInt(), false));
    }

    public final void n(boolean z10) {
        this.f34903e = z10;
        ArrayList arrayList = this.f34900c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).invalidateSelf();
        }
    }

    public final void o(float f7, float f10) {
        this.f34923p = f7;
        this.f34925q = f10;
    }

    public final void p() {
        boolean z10;
        if (this.f34918m == null) {
            return;
        }
        if (this.f34934x == -1 && !this.D) {
            this.A = g();
            this.B = this.f34914k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34934x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        e3 e3Var = this.f34918m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34909h0 && this.f34927r == 0.0f && this.f34929s == 0.0f && this.f34931t == 0.0f) {
            z11 = false;
        }
        e3Var.f48247n = f7;
        e3Var.f48248r = f10;
        e3Var.f48249s = z11;
        e3Var.v = z10;
    }

    public final void q() {
        if (this.f34909h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }
}
