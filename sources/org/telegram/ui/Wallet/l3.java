package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.mg;
public final class l3 {
    public float A;
    public TL_stars.starGiftAttributeBackdrop A0;
    public float B;
    public final Paint B0;
    public final Paint C0;
    public boolean D;
    public final org.telegram.ui.Components.f6 D0;
    public boolean E;
    public final g3 E0;
    public o1.k F;
    public ValueAnimator G;
    public boolean H;
    public final i3 I;
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
    public final org.telegram.ui.Cells.w0 f34446a;
    public float f34447a0;
    public final org.telegram.ui.ActionBar.d6 f34448b;
    public o1.k f34449b0;
    public float f34451c0;
    public j3 f34452d0;
    public boolean e;
    public long f34453e0;
    public boolean f34455f0;
    public boolean f34457g0;
    public boolean f34458h0;
    public final Drawable f34459i;
    public boolean f34460i0;
    public ValueAnimator f34462j0;
    public final c6 f34463k;
    public mg f34464k0;
    public final uj0 f34465l;
    public TLRPC.TL_messageActionGramTransfer f34466l0;
    public k3 f34467m;
    public boolean m0;
    public boolean f34468n;
    public d11 f34469n0;
    public boolean f34470o;
    public d11 f34471o0;
    public float f34472p;
    public d11 f34473p0;
    public float f34474q;
    public d11 f34475q0;
    public float f34476r;
    public boolean f34477r0;
    public float f34478s;
    public org.telegram.ui.Cells.p0 f34479s0;
    public float f34480t;
    public final Matrix f34481t0;
    public int f34483u0;
    public long v;
    public final ki.y5 f34484v0;
    public int f34486w0;
    public long f34488x0;
    public float f34489y;
    public int f34490y0;
    public float f34491z;
    public TL_stars.starGiftAttributeBackdrop f34492z0;
    public final ArrayList f34450c = new ArrayList();
    public final Stack d = new Stack();
    public final RectF f34454f = new RectF();
    public final RectF f34456g = new RectF();
    public final Path h = new Path();
    public final Path f34461j = new Path();
    public final q9 f34482u = new q9();
    public final Rect f34485w = new Rect();
    public int f34487x = -1;
    public float C = 1.0f;

    public l3(org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.O = paint2;
        Path path = new Path();
        this.W = path;
        Paint paint3 = new Paint(1);
        this.X = paint3;
        this.f34447a0 = 1.0f;
        this.f34481t0 = new Matrix();
        this.f34483u0 = -10624001;
        this.f34484v0 = new ki.y5(this, 3);
        this.f34486w0 = -1;
        this.f34490y0 = -1;
        this.B0 = new Paint(1);
        this.C0 = new Paint(1);
        this.E0 = new g3(this, 0);
        this.f34446a = w0Var;
        this.f34448b = d6Var;
        this.f34459i = w0Var.getResources().getDrawable(R.drawable.wallet_action_card_gradient).mutate();
        Context context = w0Var.getContext();
        if (c6.G == null) {
            c6.G = new c6(context.getApplicationContext());
        }
        this.f34463k = c6.G;
        uj0 uj0Var = new uj0(R.raw.wallet_diamond_white, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
        this.f34465l = uj0Var;
        uj0Var.R(w0Var);
        uj0Var.K(0);
        w0Var.addOnAttachStateChangeListener(new org.telegram.ui.Components.la(2, this, w0Var));
        paint2.setColor(-10033409);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        n nVar = new n(w0Var, 7);
        bs bsVar = bs.h;
        this.Q = new org.telegram.ui.Components.f6(1.0f, nVar, 0L, 180L, bsVar);
        this.K = new org.telegram.ui.Components.f6(new n(w0Var, 7), 320L, bsVar, 0);
        this.J = new org.telegram.ui.Components.f6(new n(w0Var, 7), 320L, bsVar, 0);
        i3 i3Var = new i3(w0Var, w0Var);
        this.I = i3Var;
        i3Var.f50385x = -1;
        yh.k1.d(path, 1.0f, false);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(4.0f));
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{16777215, org.telegram.ui.ActionBar.h6.m1(0.35f, 16777215), 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        paint.setShader(new LinearGradient(-AndroidUtilities.dp(10.0f), 0.0f, AndroidUtilities.dp(10.0f), 0.0f, new int[]{16777215, -2130706433, 16777215}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        yc ycVar = new yc(w0Var);
        this.Y = ycVar;
        ycVar.f32611f = new h3(this, 0);
        this.D0 = new org.telegram.ui.Components.f6(1.0f, new n(w0Var, 7), 0L, 400L, bsVar);
    }

    public static TL_stars.starGiftAttributeBackdrop h(TLRPC.UserFull userFull) {
        TL_wallet.card cardVar;
        TL_wallet.nftItem nftitem;
        TL_stars.StarGift starGift;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        if (userFull != null && (cardVar = userFull.wallet_card) != null && (nftitem = cardVar.bg_nft_item) != null && (starGift = nftitem.gift) != null && (arrayList = starGift.attributes) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i10);
                i10++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeBackdrop) {
                    return (TL_stars.starGiftAttributeBackdrop) starGiftAttribute2;
                }
            }
        }
        return null;
    }

    public static int j() {
        return AndroidUtilities.dp(206.0f);
    }

    public final void a(float f7) {
        if (this.F == null) {
            o1.k kVar = new o1.k(new o1.j(this.C));
            this.F = kVar;
            o1.l lVar = new o1.l(f7);
            lVar.a(0.55f);
            lVar.b(280.0f);
            kVar.f17562u = lVar;
            this.F.e(0.001f);
            this.F.b(new f3(this, 0));
        }
        this.F.g(f7);
    }

    public final void b() {
        org.telegram.ui.Cells.w0 w0Var = this.f34446a;
        if (w0Var.isShown()) {
            AndroidUtilities.vibrateCursor(w0Var);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        o1.k kVar2 = new o1.k(new o1.j(this.f34447a0));
        this.Z = kVar2;
        o1.l lVar = new o1.l(1.0f);
        lVar.a(0.55f);
        lVar.b(280.0f);
        kVar2.f17562u = lVar;
        this.Z.e(0.001f);
        o1.k kVar3 = this.Z;
        kVar3.f17552a = -3.0f;
        kVar3.b(new f3(this, 2));
        this.Z.h();
    }

    public final void c(Canvas canvas, float f7, float f10) {
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f) * this.f34451c0);
        yc ycVar = this.Y;
        canvas.scale(com.google.android.gms.internal.play_billing.k3.A(this.f34451c0, 0.012f, 1.0f, ycVar.a(0.025f) * this.f34447a0), com.google.android.gms.internal.play_billing.k3.B(this.f34451c0, 0.04f, 1.0f, ycVar.a(0.025f) * this.f34447a0), (AndroidUtilities.dp(206.0f) / 2.0f) + f7, f10 + AndroidUtilities.dp(70.0f));
    }

    public final void d(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l3.d(android.graphics.Canvas):void");
    }

    public final void e(float f7, Canvas canvas, Paint paint) {
        Shader shader = paint.getShader();
        if (shader instanceof BitmapShader) {
            Matrix matrix = this.f34481t0;
            matrix.setTranslate(-48.0f, -48.0f);
            float f10 = (2.0f * f7) / 96.0f;
            matrix.postScale(f10, f10);
            shader.setLocalMatrix(matrix);
        }
        float f11 = -f7;
        canvas.drawRect(f11, f11, f7, f7, paint);
    }

    public final void f() {
        if (this.f34452d0 != null) {
            return;
        }
        j3 j3Var = new j3(this, this.f34448b);
        this.f34452d0 = j3Var;
        j3Var.g(4969977, org.telegram.ui.ActionBar.h6.m1(0.125f, -11807239), 4969977, org.telegram.ui.ActionBar.h6.m1(0.75f, -11807239));
        this.f34452d0.f24916x.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        j3 j3Var2 = this.f34452d0;
        j3Var2.f24913t = 2.0f;
        j3Var2.f24917y = this.h;
        j3Var2.D = true;
    }

    public final void g() {
        ValueAnimator valueAnimator = this.f34462j0;
        if (valueAnimator != null) {
            this.f34462j0 = null;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
            org.telegram.ui.Components.f6 f6Var = this.K;
            if (f6Var.f26103i) {
                this.M = false;
                this.N = 0L;
            }
            f6Var.d(1.0f, true);
            this.f34480t = 0.0f;
            this.f34482u.f34807a.clear();
            mg mgVar = this.f34464k0;
            this.f34464k0 = null;
            this.f34446a.invalidate();
            if (mgVar != null) {
                AndroidUtilities.runOnUIThread(mgVar, 1L);
            }
        }
    }

    public final float i() {
        float f7;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.v;
        if (j10 != 0) {
            float min = Math.min(0.1f, ((float) (uptimeMillis - j10)) / 1000.0f);
            if (this.f34458h0) {
                f7 = 1.7883515f;
            } else {
                f7 = 0.0f;
            }
            float f10 = -min;
            float exp = (float) Math.exp(f10 / 0.2f);
            float f11 = (min * f7) + this.f34476r;
            float f12 = this.f34478s;
            this.f34476r = (((1.0f - exp) * ((f12 - f7) * 0.2f)) + f11) % 6.2831855f;
            this.f34478s = com.google.android.gms.internal.play_billing.k3.y(f12, f7, exp, f7);
            float exp2 = (float) Math.exp(f10 / 0.75f);
            float f13 = this.f34476r;
            float f14 = this.f34480t;
            this.f34476r = (((1.0f - exp2) * (0.75f * f14)) + f13) % 6.2831855f;
            float f15 = f14 * exp2;
            this.f34480t = f15;
            if (f15 < 0.001f) {
                this.f34480t = 0.0f;
            }
        }
        this.v = uptimeMillis;
        return (this.f34463k.f34096y * 0.14f) + ((float) (((uptimeMillis / 1000.0d) * 0.5961171984672546d) % 6.283185307179586d)) + this.f34476r;
    }

    public final void k(boolean z10) {
        float f7 = 0.0f;
        if (z10) {
            this.Q.d(0.0f, true);
        } else if (this.E && this.f34458h0) {
            this.P = SystemClock.elapsedRealtime();
        }
        this.E = z10;
        k3 k3Var = this.f34467m;
        if (k3Var != null) {
            if (!z10) {
                f7 = 1.0f;
            }
            k3Var.setAlpha(f7);
        }
        this.f34446a.invalidate();
    }

    public final void l() {
        this.f34487x = -1;
        org.telegram.ui.Cells.w0 w0Var = this.f34446a;
        if (w0Var.getParent() != null) {
            w0Var.getParent().requestDisallowInterceptTouchEvent(false);
        }
        this.D = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.setDuration(350L);
        this.G.setInterpolator(bs.h);
        this.G.addUpdateListener(new ei.ja(this, (float) Math.IEEEremainder(this.A - i(), 6.283185307179586d), (float) Math.IEEEremainder(this.B - (this.f34463k.E * 0.14f), 6.283185307179586d), 5));
        this.G.start();
        a(1.0f);
    }

    public final void m() {
        k(false);
        this.Q.d(1.0f, true);
        if (this.f34487x != -1) {
            org.telegram.ui.Cells.w0 w0Var = this.f34446a;
            if (w0Var.getParent() != null) {
                w0Var.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f34487x = -1;
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
        this.f34480t = 0.0f;
        this.f34478s = 0.0f;
        this.f34476r = 0.0f;
        this.f34482u.f34807a.clear();
        k3 k3Var = this.f34467m;
        if (k3Var != null) {
            k3Var.setScaleX(1.0f);
            this.f34467m.setScaleY(1.0f);
        }
    }

    public final void n() {
        o1.k kVar = this.f34449b0;
        if (kVar != null) {
            kVar.c();
            this.f34449b0 = null;
        }
        this.f34451c0 = 0.0f;
        org.telegram.ui.Cells.w0 w0Var = this.f34446a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void o(boolean z10, TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer, String str, int i10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        int i11;
        String string;
        String str2;
        org.telegram.ui.Cells.w0 w0Var = this.f34446a;
        if (z11) {
            g();
            this.M = false;
            this.N = 0L;
            this.f34458h0 = false;
            m();
            o1.k kVar = this.Z;
            if (kVar != null) {
                kVar.c();
                this.Z = null;
            }
            this.f34447a0 = 1.0f;
            w0Var.invalidate();
            if (w0Var.getParent() instanceof View) {
                ((View) w0Var.getParent()).invalidate();
            }
            n();
            this.R = 0.0f;
            this.S = 0L;
            this.f34465l.stop();
            this.H = false;
        }
        this.f34457g0 = z10;
        this.f34466l0 = tL_messageActionGramTransfer;
        if (!z10 && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f34460i0 = z13;
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
        if (this.f34458h0 && z10 && i10 == 0) {
            b();
            i();
            this.f34480t = 18.0f;
            this.f34482u.f();
            w0Var.invalidate();
        }
        if (z15) {
            if (!this.f34458h0) {
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
        t();
        this.f34458h0 = z15;
        if (z15) {
            j10 = SystemClock.elapsedRealtime();
        } else {
            j10 = 0;
        }
        this.S = j10;
        if (z15) {
            f();
            j3 j3Var = this.f34452d0;
            j3Var.getClass();
            j3Var.v = Math.max(0L, 0L);
            if (this.f34452d0.d() || this.f34452d0.c()) {
                j3 j3Var2 = this.f34452d0;
                j3Var2.f24898b = -1L;
                j3Var2.f24899c = -1L;
            }
            w0Var.invalidate();
        } else {
            j3 j3Var3 = this.f34452d0;
            if (j3Var3 != null && this.f34453e0 == 0 && !j3Var3.d() && !this.f34452d0.c()) {
                this.f34452d0.a();
                w0Var.invalidate();
            }
        }
        if (z14) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21231q7, this.f34448b);
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
        i3 i3Var = this.I;
        if (z15) {
            i3Var.f(10, string, true);
        } else {
            i3Var.g(10, string);
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
        ki.y5 y5Var = this.f34484v0;
        if (spanStart > 0) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), 0, spanStart, 33);
        }
        if (spanEnd >= 0 && spanEnd < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(CharacterStyle.wrap(y5Var), spanEnd, spannableStringBuilder.length(), 33);
        }
        this.f34469n0 = new d11(spannableStringBuilder, 16.0f, AndroidUtilities.bold());
        String str3 = tL_messageActionGramTransfer.peer_address;
        Locale locale = Locale.US;
        String g10 = x5.g(x5.e(str3.toUpperCase(locale)));
        d11 d11Var = new d11("", 9.3f, AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        d11Var.n(2);
        this.f34471o0 = d11Var;
        d11Var.r(g10);
        if (TextUtils.isEmpty(str)) {
            this.f34473p0 = null;
        } else {
            d11 d11Var2 = new d11("", 10.0f, Typeface.create(AndroidUtilities.getTypeface("fonts/rmono.ttf"), 1));
            this.f34473p0 = d11Var2;
            d11Var2.r(TextUtils.ellipsize(AndroidUtilities.replaceNewLines(str.toUpperCase(locale)), this.f34473p0.f25442a, AndroidUtilities.dp(206.0f) - AndroidUtilities.dp(24.0f), TextUtils.TruncateAt.END));
        }
        Stack stack = this.d;
        ArrayList arrayList = this.f34450c;
        stack.addAll(arrayList);
        arrayList.clear();
        if (TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            this.f34475q0 = null;
            return;
        }
        d11 d11Var3 = new d11("", 12.0f, null);
        d11Var3.n(Integer.MAX_VALUE);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        d11Var3.a();
        d11Var3.q(AndroidUtilities.dp(184.0f));
        this.f34475q0 = d11Var3;
        if ((tL_messageActionGramTransfer.comment_encrypted || tL_messageActionGramTransfer.comment_encrypted_preparing) && !this.m0) {
            StringBuilder sb2 = new StringBuilder(25);
            for (int i13 = 0; i13 < 25; i13++) {
                sb2.append("a");
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            ?? obj2 = new Object();
            obj2.f28056a |= 256;
            spannableStringBuilder2.setSpan(new m11(obj2, 0), 0, spannableStringBuilder2.length(), 33);
            this.f34475q0.r(spannableStringBuilder2);
            wh.g.c(w0Var, this.f34475q0.f25443b, stack, arrayList);
            q(this.e);
            return;
        }
        d11Var3.r(Emoji.replaceEmoji(tL_messageActionGramTransfer.comment, d11Var3.f25442a.getFontMetricsInt(), false));
    }

    public final void p(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10) {
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f34492z0;
        Paint paint = this.C0;
        org.telegram.ui.Components.f6 f6Var = this.D0;
        BitmapShader bitmapShader = null;
        if (stargiftattributebackdrop2 == null || stargiftattributebackdrop == null ? stargiftattributebackdrop2 == stargiftattributebackdrop : !(stargiftattributebackdrop2.center_color != stargiftattributebackdrop.center_color || stargiftattributebackdrop2.edge_color != stargiftattributebackdrop.edge_color || stargiftattributebackdrop2.pattern_color != stargiftattributebackdrop.pattern_color || stargiftattributebackdrop2.text_color != stargiftattributebackdrop.text_color)) {
            if (!z10 && f6Var.f26100c < 1.0f) {
                this.A0 = null;
                paint.setShader(null);
                f6Var.d(1.0f, true);
                return;
            }
            return;
        }
        Paint paint2 = this.B0;
        if (z10) {
            this.A0 = stargiftattributebackdrop2;
            paint.setShader(paint2.getShader());
            f6Var.d(0.0f, true);
        } else {
            this.A0 = null;
            paint.setShader(null);
            f6Var.d(1.0f, true);
        }
        this.f34492z0 = stargiftattributebackdrop;
        if (stargiftattributebackdrop != null) {
            int l4 = n7.l(-16216082, stargiftattributebackdrop.center_color, stargiftattributebackdrop.edge_color);
            int l10 = n7.l(-15291399, stargiftattributebackdrop.center_color, stargiftattributebackdrop.edge_color);
            SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{l4, l10, l4, l10, l4}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                bitmapShader = sweepGradient;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(96, 96, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint3 = new Paint();
                paint3.setShader(sweepGradient);
                canvas.translate(48.0f, 48.0f);
                canvas.drawPaint(paint3);
                Utilities.stackBlurBitmap(createBitmap, 16);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
            }
        }
        paint2.setShader(bitmapShader);
        org.telegram.ui.Cells.w0 w0Var = this.f34446a;
        w0Var.invalidate();
        if (w0Var.getParent() instanceof View) {
            ((View) w0Var.getParent()).invalidate();
        }
    }

    public final void q(boolean z10) {
        this.e = z10;
        ArrayList arrayList = this.f34450c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.g) obj).invalidateSelf();
        }
    }

    public final void r(float f7, float f10) {
        this.f34472p = f7;
        this.f34474q = f10;
    }

    public final void s() {
        boolean z10;
        if (this.f34467m == null) {
            return;
        }
        if (this.f34487x == -1 && !this.D) {
            this.A = i();
            this.B = this.f34463k.E * 0.14f;
        }
        boolean z11 = true;
        if (this.f34487x == -1 && !this.D && this.C <= 1.001f) {
            z10 = false;
        } else {
            z10 = true;
        }
        k3 k3Var = this.f34467m;
        float f7 = this.A;
        float f10 = this.B;
        if (!z10 && !this.f34458h0 && this.f34476r == 0.0f && this.f34478s == 0.0f && this.f34480t == 0.0f) {
            z11 = false;
        }
        k3Var.f47230r = f7;
        k3Var.f47231s = f10;
        k3Var.v = z11;
        k3Var.f47232w = z10;
    }

    public final void t() {
        if (this.f34458h0 && this.S != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.R = (((((float) (elapsedRealtime - this.S)) * 360.0f) / 4000.0f) + this.R) % 360.0f;
            this.S = elapsedRealtime;
        }
    }

    public final void u() {
        int i10;
        if (this.f34446a.isAttachedToWindow() && this.f34488x0 != 0) {
            i10 = this.f34486w0;
        } else {
            i10 = -1;
        }
        int i11 = this.f34490y0;
        if (i10 != i11) {
            g3 g3Var = this.E0;
            if (i11 >= 0) {
                NotificationCenter.getInstance(i11).removeObserver(g3Var, NotificationCenter.userInfoDidLoad);
            }
            this.f34490y0 = i10;
            if (i10 >= 0) {
                NotificationCenter.getInstance(i10).addObserver(g3Var, NotificationCenter.userInfoDidLoad);
            }
        }
    }
}
