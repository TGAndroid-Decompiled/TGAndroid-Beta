package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import bi.dd;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.aj;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ol;
import org.telegram.ui.r81;
import org.telegram.ui.sf;
import org.telegram.ui.xf;
public class t0 extends z implements org.telegram.messenger.x5, ls, p4 {
    public static final HashMap f30291s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public xh.f D;
    public boolean D0;
    public float D1;
    public boolean E;
    public final ch.p0 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public bi.m7 H0;
    public TLRPC.Document H1;
    public final ImageReceiver I;
    public org.telegram.ui.Wallet.d4 I0;
    public TLRPC.VideoSize I1;
    public Drawable J;
    public boolean J0;
    public final RadialProgress2 J1;
    public Path K;
    public float K0;
    public int K1;
    public final org.telegram.ui.Components.w8 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final ca N1;
    public int O;
    public jw0 O0;
    public boolean O1;
    public StaticLayout P;
    public ij P0;
    public ColorMatrixColorFilter P1;
    public int Q;
    public int Q0;
    public CornerPathEffect Q1;
    public int R;
    public CharSequence R0;
    public Path R1;
    public int S;
    public zh.w0 S0;
    public my0 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final ug.p1 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public f5.u Y1;
    public final Path Z0;
    public boolean Z1;
    public boolean f30292a0;
    public int f30293a1;
    public int f30294a2;
    public RadialProgressView f30295b0;
    public int f30296b1;
    public float f30297b2;
    public float f30298c0;
    public final RectF f30299c1;
    public final Paint f30300c2;
    public final di.n7 f30301d0;
    public boolean f30302d1;
    public boolean d2;
    public boolean f30303e0;
    public boolean f30304e1;
    public View.OnClickListener f30305e2;
    public int f30306f;
    public boolean f30307f0;
    public q0 f30308f1;
    public int f30309f2;
    public boolean f30310g0;
    public final org.telegram.ui.ActionBar.f6 f30311g1;
    public final Path f30312g2;
    public int h;
    public boolean f30313h0;
    public int f30314h1;
    public final float[] f30315h2;
    public boolean f30316i0;
    public int f30317i1;
    public final float[] f30318i2;
    public int f30319j0;
    public StaticLayout f30320j1;
    public final Path f30321j2;
    public boolean f30322k0;
    public Paint f30323k1;
    public final int[] f30324k2;
    public int f30325l0;
    public my0 l1;
    public int f30326l2;
    public boolean m0;
    public StaticLayout f30327m1;
    public SpannableStringBuilder f30328m2;
    public final ic f30329n;
    public g01 f30330n0;
    public boolean n1;
    public boolean f30331n2;
    public final RectF f30332o0;
    public boolean f30333o1;
    public Runnable f30334o2;
    public final ArrayList f30335p0;
    public int f30336p1;
    public PorterDuffColorFilter f30337p2;
    public final Stack f30338q0;
    public final org.telegram.ui.Components.w5 f30339q1;
    public int f30340q2;
    public a80 f30341r;
    public org.telegram.ui.Components.n5 f30342r0;
    public h6.m f30343r1;
    public final s0 f30344r2;
    public final boolean f30345s;
    public TextPaint f30346s0;
    public r0 f30347s1;
    public float f30348t0;
    public int f30349t1;
    public float f30350u0;
    public int f30351u1;
    public int f30352v0;
    public int f30353v1;
    public View f30354w;
    public boolean f30355w0;
    public my0 f30356w1;
    public final int f30357x;
    public hc f30358x0;
    public StaticLayout f30359x1;
    public URLSpan f30360y;
    public float f30361y0;
    public boolean f30362y1;
    public float f30363z0;
    public TextPaint f30364z1;

    static {
        HashMap hashMap = new HashMap();
        f30291s2 = hashMap;
        jg.g.t(1, hashMap, "1⃣", 3, "2⃣");
        jg.g.t(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public t0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder D(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.J2(str, false, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(1.3f), 0.8f, 2131231195));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new r2(org.telegram.messenger.g0.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float Z(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i7 = 0; i7 < staticLayout.getLineCount(); i7++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i7));
            if (ceil > f10) {
                f10 = ceil;
            }
        }
        return f10;
    }

    private float getWalletActionTop() {
        return org.telegram.messenger.g0.L(11.0f) + this.S + this.O;
    }

    private void setStarsPaused(boolean z9) {
        ug.p1 p1Var = this.V1;
        if (z9 == p1Var.f56676g) {
            return;
        }
        p1Var.f56676g = z9;
        if (z9) {
            p1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < p1Var.f56682n.size(); i7++) {
            ug.o1 o1Var = (ug.o1) p1Var.f56682n.get(i7);
            o1Var.f56639a = (System.currentTimeMillis() - p1Var.R) + o1Var.f56639a;
        }
        invalidate();
    }

    public final void A(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z9, CharSequence charSequence3, int i7, String str, int i10, boolean z10) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        ij ijVar = this.P0;
        if (ijVar != null && ijVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            ij ijVar2 = this.P0;
            TextPaint textPaint = this.E1;
            if (ijVar2 != null && ijVar2.D == 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new u31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f30320j1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f30320j1 = null;
        }
        this.f30327m1 = null;
        if (spannableStringBuilder != null) {
            my0 my0Var = new my0(spannableStringBuilder, 10.0f, null);
            this.l1 = my0Var;
            my0Var.f36123a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        ij ijVar3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (ijVar3 != null && ijVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
        } else if (ijVar3 != null && (W() || (i11 = this.P0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        ij ijVar4 = this.P0;
        if (ijVar4 != null && ijVar4.D == 22 && ij.B0(ijVar4.f23244k) >= 0 && (a10 = fi.m3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        boolean z11 = true;
        if (charSequence4 == null) {
            r0 r0Var = this.f30347s1;
            if (r0Var != null) {
                org.telegram.ui.Components.r5.release((t0) r0Var.f30172i, (org.telegram.ui.Components.n5) r0Var.h);
                this.f30347s1 = null;
            }
            this.f30333o1 = r42;
        } else {
            if (this.f30347s1 == null) {
                this.f30347s1 = new r0(this);
            }
            try {
                charSequence4 = org.telegram.messenger.i6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.f30347s1.a(charSequence4, textPaint2, L2);
            if (z9 && ((StaticLayout) this.f30347s1.f30170f).getLineCount() > 3) {
                this.f30333o1 = !this.n1;
                this.f30336p1 = ((StaticLayout) this.f30347s1.f30170f).getLineBottom(2);
                this.f30356w1 = new my0(hd.M0(2131750264, null), textPaint2.getTextSize() / org.telegram.messenger.g0.f22543p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.f30347s1.f30170f).getLineBottom(2);
                this.f30351u1 = lineBottom;
                this.f30353v1 = lineBottom - ((StaticLayout) this.f30347s1.f30170f).getLineTop(2);
                this.f30349t1 = (int) ((StaticLayout) this.f30347s1.f30170f).getLineRight(2);
            } else {
                this.f30333o1 = r42;
                this.f30339q1.f(true, true);
                this.f30336p1 = r42;
            }
            if (this.f30333o1) {
                int lineEnd = ((StaticLayout) this.f30347s1.f30170f).getLineEnd(2) - 1;
                r0 r0Var2 = this.f30347s1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                r0Var2.a(charSequence4, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new u31(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) N("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f30359x1 = staticLayout;
            if (!z10 || this.f30333o1) {
                z11 = r42;
            }
            this.f30362y1 = z11;
            this.D1 = Z(staticLayout);
        } else {
            this.f30359x1 = null;
            this.f30362y1 = r42;
            this.D1 = 0.0f;
        }
        if (str != null) {
            if (this.Q1 == null) {
                this.Q1 = new CornerPathEffect(org.telegram.messenger.g0.L(5.0f));
            }
            if (this.R1 == null) {
                Path path = new Path();
                this.R1 = path;
                zh.c1.d(path, 1.35f, r42);
            }
            my0 my0Var2 = new my0(str, i7, org.telegram.messenger.g0.o());
            this.S1 = my0Var2;
            my0Var2.f36136p = org.telegram.messenger.g0.L(62.0f);
            return;
        }
        this.R1 = null;
        this.S1 = null;
    }

    public final void B(int i7, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z9;
        int width;
        q0 q0Var;
        TLRPC.Message message;
        ij ijVar;
        int i10;
        float f10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.f30316i0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (V()) {
            if (this.f30316i0) {
                f10 = 28.0f;
            } else {
                f10 = 82.0f;
            }
            L = Math.min(L - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(272.0f));
        }
        if (L >= 0) {
            int i11 = this.f30309f2;
            if (i11 > 0) {
                L = Math.min(i11, L);
            }
            int i12 = L;
            this.f30302d1 = true;
            if (!V() && ((ijVar = this.P0) == null || ((i10 = ijVar.D) != 34 && i10 != 35))) {
                if (ijVar != null && ijVar.f23268q2) {
                    textPaint = (TextPaint) N("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) N("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) N("paintChatActionText3");
            }
            textPaint.linkColor = textPaint.getColor();
            if (V()) {
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    for (org.telegram.messenger.f6 f6Var : (org.telegram.messenger.f6[]) spannable.getSpans(0, spannable.length(), org.telegram.messenger.f6.class)) {
                        spannable.removeSpan(f6Var);
                    }
                }
                charSequence2 = org.telegram.messenger.i6.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
            } else {
                charSequence2 = charSequence;
            }
            if (V()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            TextPaint textPaint2 = textPaint;
            CharSequence charSequence3 = charSequence2;
            this.M = new StaticLayout(charSequence2, textPaint2, i12, alignment2, 1.0f, 0.0f, false);
            this.P = null;
            ij ijVar2 = this.P0;
            if (ijVar2 != null && (message = ijVar2.f23244k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.P = new StaticLayout(org.telegram.messenger.i6.n(org.telegram.messenger.g0.X2(hd.M0(2131744367, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f30345s && (q0Var = this.f30308f1) != null && !q0Var.g()) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f30342r0 = org.telegram.ui.Components.r5.update(0, this, z9, this.f30342r0, this.M);
            this.O = 0;
            this.N = 0;
            this.Q = 0;
            StaticLayout staticLayout = this.P;
            if (staticLayout != null) {
                int height = staticLayout.getHeight();
                this.Q = height;
                this.Q = org.telegram.messenger.g0.L(12.0f) + height;
            }
            ij ijVar3 = this.P0;
            if (ijVar3 == null || !ijVar3.f23233h2) {
                try {
                    int lineCount = this.M.getLineCount();
                    for (int i13 = 0; i13 < lineCount; i13++) {
                        try {
                            float lineWidth = this.M.getLineWidth(i13);
                            float f11 = i12;
                            if (lineWidth > f11) {
                                lineWidth = f11;
                            }
                            this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i13)));
                            this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            this.R = (i7 - this.N) / 2;
            int L2 = org.telegram.messenger.g0.L(7.0f);
            this.S = L2;
            if (this.P != null) {
                this.S = org.telegram.messenger.k5.C(11.0f, this.Q, L2);
            }
            if (V()) {
                width = this.N;
            } else {
                width = this.M.getWidth();
            }
            this.T = (i7 - width) / 2;
            this.U = (i7 - i12) / 2;
            Stack stack = this.f30338q0;
            ArrayList arrayList = this.f30335p0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout2 = this.M;
                int i14 = this.R;
                xh.f.a(this, staticLayout2, i14, i14 + this.N, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void E(Canvas canvas, boolean z9) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        t0 t0Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        float f14;
        Paint paint3;
        Paint paint4;
        int i7;
        int i10;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        int i11;
        r0 r0Var;
        int i12;
        float L;
        org.telegram.ui.Wallet.d4 d4Var;
        int L2;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        int i14;
        int i15;
        float f18;
        int i16;
        int i17;
        int i18;
        Paint paint5;
        int i19;
        int i20;
        float f19;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i21;
        int i22;
        int i23;
        t0 t0Var2 = this;
        if (!t0Var2.f30345s || ((!t0Var2.Q() || z9) && (t0Var2.Q() || !z9))) {
            Paint N = t0Var2.N("paintChatActionBackground");
            Paint N2 = t0Var2.N("paintChatActionBackgroundDarken");
            t0Var2.f30346s0 = (TextPaint) t0Var2.N("paintChatActionText");
            int i24 = t0Var2.T0;
            org.telegram.ui.ActionBar.f6 f6Var4 = t0Var2.f30311g1;
            if (i24 >= 0) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(i24, f6Var4);
                if (t0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    t0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    t0Var2.W0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    t0Var2.W0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
                    t0Var2.W0.setColor(org.telegram.ui.ActionBar.k6.w0(t0Var2.U0, f6Var4));
                }
                N = t0Var2.V0;
                t0Var2.f30346s0 = t0Var2.W0;
            }
            boolean z10 = t0Var2.f30302d1;
            Path path = t0Var2.Z0;
            if (z10) {
                t0Var2.f30302d1 = false;
                t0Var2.f30293a1 = t0Var2.getWidth();
                t0Var2.f30296b1 = 0;
                ArrayList arrayList3 = t0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = t0Var2.M;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int L3 = org.telegram.messenger.g0.L(11.0f);
                f11 = 6.0f;
                int L4 = org.telegram.messenger.g0.L(8.0f);
                f10 = 8.0f;
                int i25 = 0;
                int i26 = 0;
                while (i25 < lineCount) {
                    int ceil = (int) Math.ceil(t0Var2.M.getLineWidth(i25));
                    if (i25 != 0 && (i23 = i26 - ceil) > 0 && i23 <= (L3 * 1.5f) + L4) {
                        ceil = i26;
                    }
                    i25 = com.google.android.recaptcha.internal.a.f(ceil, i25, 1, arrayList3);
                    i26 = ceil;
                }
                f12 = 4.0f;
                f13 = 2.0f;
                for (int i27 = lineCount - 2; i27 >= 0; i27--) {
                    int intValue = ((Integer) arrayList3.get(i27)).intValue();
                    int i28 = i26 - intValue;
                    if (i28 <= 0 || i28 > (L3 * 1.5f) + L4) {
                        i26 = intValue;
                    }
                    arrayList3.set(i27, Integer.valueOf(i26));
                }
                int L5 = org.telegram.messenger.g0.L(4.0f);
                int measuredWidth = t0Var2.getMeasuredWidth() / 2;
                int L6 = org.telegram.messenger.g0.L(3.0f);
                int L7 = org.telegram.messenger.g0.L(6.0f);
                int i29 = L3 - L6;
                ArrayList arrayList4 = t0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f20 = measuredWidth;
                path.moveTo(f20, L5);
                int i30 = i26;
                int i31 = 0;
                int i32 = 0;
                while (true) {
                    rectF = t0Var2.f30299c1;
                    if (i32 >= lineCount) {
                        break;
                    }
                    int i33 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i32)).intValue();
                    int lineBottom = t0Var2.M.getLineBottom(i32);
                    int i34 = i33 - 1;
                    if (i32 < i34) {
                        paint5 = N2;
                        i19 = ((Integer) arrayList3.get(i32 + 1)).intValue();
                    } else {
                        paint5 = N2;
                        i19 = 0;
                    }
                    int i35 = lineBottom - i31;
                    if (i32 == 0 || intValue2 > i30) {
                        i35 = org.telegram.messenger.g0.L(3.0f) + i35;
                    }
                    if (i32 == i34 || intValue2 > i19) {
                        i35 = org.telegram.messenger.g0.L(3.0f) + i35;
                    }
                    Paint paint7 = N;
                    float f21 = (intValue2 / 2.0f) + f20;
                    if (i32 != i34 && intValue2 < i19 && i32 != 0 && intValue2 < i30) {
                        i20 = L7;
                    } else {
                        i20 = L4;
                    }
                    if (i32 == 0 || intValue2 > i30) {
                        f19 = f21;
                        arrayList2 = arrayList3;
                        f6Var3 = f6Var4;
                        rectF.set((f19 - L6) - L3, L5, f19 + i29, (L3 * 2) + L5);
                        x();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f19 = f21;
                        if (intValue2 < i30) {
                            float f22 = f19 + i29;
                            f6Var3 = f6Var4;
                            arrayList2 = arrayList3;
                            rectF.set(f22, L5, (i20 * 2) + f22, i22 + L5);
                            x();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            f6Var3 = f6Var4;
                        }
                    }
                    L5 += i35;
                    if (i32 != i34 && intValue2 < i19) {
                        L5 -= org.telegram.messenger.g0.L(3.0f);
                        i35 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    if (i32 != 0 && intValue2 < i30) {
                        L5 -= org.telegram.messenger.g0.L(3.0f);
                        i35 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i35));
                    if (i32 != i34 && intValue2 <= i19) {
                        if (intValue2 < i19) {
                            float f23 = f19 + i29;
                            rectF.set(f23, L5 - i21, (i20 * 2) + f23, L5);
                            x();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f19 - L6) - L3, L5 - (L3 * 2), f19 + i29, L5);
                        x();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i32++;
                    t0Var2 = this;
                    i30 = intValue2;
                    i31 = lineBottom;
                    lineCount = i33;
                    N2 = paint5;
                    N = paint7;
                    f6Var4 = f6Var3;
                    arrayList3 = arrayList2;
                }
                paint = N;
                paint2 = N2;
                ArrayList arrayList5 = arrayList3;
                f6Var = f6Var4;
                int i36 = lineCount - 1;
                for (int i37 = i36; i37 >= 0; i37--) {
                    if (i37 != 0) {
                        arrayList = arrayList5;
                        i13 = ((Integer) arrayList.get(i37 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i13 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i37)).intValue();
                    if (i37 != i36) {
                        i14 = ((Integer) arrayList.get(i37 + 1)).intValue();
                    } else {
                        i14 = 0;
                    }
                    this.M.getLineBottom(i37);
                    float f24 = measuredWidth - (intValue3 / 2);
                    if (i37 != i36 && intValue3 < i14 && i37 != 0 && intValue3 < i13) {
                        i15 = L7;
                    } else {
                        i15 = L4;
                    }
                    if (i37 == i36 || intValue3 > i14) {
                        arrayList5 = arrayList;
                        f18 = f24;
                        i16 = i15;
                        rectF.set(f18 - i29, L5 - (L3 * 2), f18 + L6 + L3, L5);
                        x();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i14) {
                        float f25 = f24 - i29;
                        arrayList5 = arrayList;
                        f18 = f24;
                        i16 = i15;
                        rectF.set(f25 - (i15 * 2), L5 - i18, f25, L5);
                        x();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f18 = f24;
                        i16 = i15;
                    }
                    L5 -= ((Integer) arrayList4.get(i37)).intValue();
                    if (i37 != 0 && intValue3 <= i13) {
                        if (intValue3 < i13) {
                            float f26 = f18 - i29;
                            rectF.set(f26 - (i16 * 2), L5, f26, i17 + L5);
                            x();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f18 - i29, L5, f18 + L6 + L3, (L3 * 2) + L5);
                        x();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                t0Var = this;
                path.close();
                if (t0Var.V() && !t0Var.W()) {
                    rectF.left = (f20 - (t0Var.N / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L5;
                    rectF.right = (t0Var.N / 2.0f) + f20 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L5 + t0Var.O + t0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = N;
                paint2 = N2;
                f6Var = f6Var4;
                f10 = 8.0f;
                f11 = 6.0f;
                f12 = 4.0f;
                f13 = 2.0f;
                t0Var = t0Var2;
            }
            if (!t0Var.f30355w0) {
                t0Var.f30352v0 = ((ViewGroup) t0Var.getParent()).getMeasuredHeight();
            }
            if (f6Var != null) {
                f6Var2 = f6Var;
                f6Var2.b(t0Var.f30350u0, t0Var.f30348t0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.f30352v0);
            } else {
                f6Var2 = f6Var;
                org.telegram.ui.ActionBar.k6.r(t0Var.f30350u0, t0Var.f30348t0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.f30352v0);
            }
            boolean z11 = t0Var instanceof org.telegram.ui.ij;
            if (z11 && !org.telegram.ui.ActionBar.k6.i1(f6Var2)) {
                f14 = 0.75f;
            } else {
                f14 = 1.0f;
            }
            if (!z9 || (t0Var.getAlpha() == 1.0f && !z11)) {
                paint3 = paint2;
                paint4 = paint;
                if (z11) {
                    i7 = paint4.getAlpha();
                    i10 = paint3.getAlpha();
                    paint4.setAlpha((int) (i7 * f14));
                    paint3.setAlpha((int) (i10 * f14));
                } else {
                    i7 = -1;
                    i10 = -1;
                }
            } else {
                i7 = paint.getAlpha();
                i10 = paint2.getAlpha();
                paint4 = paint;
                paint4.setAlpha((int) (t0Var.getAlpha() * i7 * f14));
                paint3 = paint2;
                paint3.setAlpha((int) (t0Var.getAlpha() * i10 * f14));
            }
            ij ijVar = t0Var.P0;
            Paint paint8 = t0Var.f30300c2;
            if (ijVar == null || !ijVar.f23233h2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (t0Var.f30297b2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z9) {
                        paint8.setAlpha((int) (t0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (t0Var.S()) {
                int width = t0Var.getWidth();
                t0Var.I0.getClass();
                float L8 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = t0Var.getWalletActionTop();
                t0Var.I0.getClass();
                float L9 = org.telegram.messenger.g0.L(206.0f) + L8;
                if (t0Var.I0.f42367q0 == null) {
                    L2 = org.telegram.messenger.g0.L(140.0f);
                    f15 = 140.0f;
                    f16 = 20.0f;
                } else {
                    f15 = 140.0f;
                    f16 = 20.0f;
                    L2 = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(d4Var.f42367q0.i()));
                }
                RectF rectF2 = t0Var.N0;
                rectF2.set(L8, walletActionTop, L9, L2 + walletActionTop);
                canvas2.save();
                t0Var.I0.c(canvas2, L8, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                }
                f17 = 0.0f;
                if (t0Var.f30297b2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z9) {
                        paint8.setAlpha((int) (t0Var.getAlpha() * alpha2));
                    }
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint8);
                    paint8.setAlpha(alpha2);
                }
                canvas2.restore();
            } else {
                f15 = 140.0f;
                f16 = 20.0f;
                f17 = 0.0f;
            }
            ij ijVar2 = t0Var.P0;
            if (t0Var.R()) {
                float L10 = t0Var.H0.T.f55400f + org.telegram.messenger.g0.L(f10);
                float width2 = (t0Var.getWidth() - L10) / f13;
                if (t0Var.H0.f4344p) {
                    L = f17;
                } else {
                    L = org.telegram.messenger.g0.L(12.0f) + t0Var.S + t0Var.O;
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L, L10 + width2, t0Var.H0.P + L + org.telegram.messenger.g0.L(f10));
                if (t0Var.M1 == null) {
                    t0Var.M1 = new RectF();
                }
                t0Var.M1.set(rectF3);
                canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.O0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                jw0 jw0Var = t0Var.O0;
                jw0Var.getClass();
                int L12 = org.telegram.messenger.g0.L(f15) + ((int) jw0Var.f35088f.i());
                if (jw0Var.f35090i) {
                    i12 = org.telegram.messenger.g0.L(40.0f);
                } else {
                    i12 = 0;
                }
                float f27 = L12 + i12;
                float width3 = (t0Var.getWidth() - L11) / f13;
                if (t0Var.M1 == null) {
                    t0Var.M1 = new RectF();
                }
                t0Var.M1.set(width3, org.telegram.messenger.g0.L(f12), L11 + width3, org.telegram.messenger.g0.L(f12) + f27);
                canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.U(ijVar2)) {
                float width4 = (t0Var.getWidth() - t0Var.f30317i1) / f13;
                float f28 = t0Var.S + t0Var.O;
                if (t0Var.W()) {
                    float L13 = f28 + org.telegram.messenger.g0.L(f12);
                    org.telegram.messenger.g0.P.set(width4, L13, t0Var.f30317i1 + width4, t0Var.f30306f + L13);
                } else {
                    float L14 = f28 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f29 = t0Var.f30317i1;
                    rectF4.set(width4, L14, width4 + f29, f29 + L14 + t0Var.K1);
                }
                if (ijVar2 != null && ijVar2.D == 18 && !t0Var.f30333o1 && (r0Var = t0Var.f30347s1) != null && t0Var.f30336p1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.recaptcha.internal.a.v(1.0f, t0Var.f30339q1.f39855c, ((StaticLayout) r0Var.f30170f).getHeight() - t0Var.f30336p1, rectF5.bottom);
                }
                if (t0Var.M1 == null) {
                    t0Var.M1 = new RectF();
                }
                t0Var.M1.set(org.telegram.messenger.g0.P);
                if (ijVar2 != null && (((i11 = ijVar2.D) == 33 || i11 == 35) && t0Var.Y1 != null)) {
                    float[] fArr = t0Var.f30315h2;
                    Arrays.fill(fArr, org.telegram.messenger.g0.L(16.0f));
                    float L15 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L15;
                    fArr[6] = L15;
                    fArr[5] = L15;
                    fArr[4] = L15;
                    Path path2 = t0Var.f30312g2;
                    path2.rewind();
                    path2.addRoundRect(t0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (t0Var.Q()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                    if (t0Var.Q()) {
                        canvas2.drawRoundRect(t0Var.M1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                    }
                }
            }
            if (i7 >= 0) {
                paint4.setAlpha(i7);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void G(Canvas canvas) {
        ColorFilter colorFilter;
        float f10;
        int i7;
        int i10;
        float f11;
        float f12;
        int i11;
        float L;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f13 = 2.0f;
        canvas2.translate(this.f30319j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.n5 n5Var = this.f30342r0;
        if (staticLayout != null) {
            colorFilter = K(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, staticLayout, n5Var, 0.0f, this.f30335p0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f14 = 4.0f;
        if (R()) {
            canvas2.save();
            bi.m7 m7Var = this.H0;
            float width = (getWidth() - m7Var.T.f55400f) / 2.0f;
            if (m7Var.f4344p) {
                L = org.telegram.messenger.g0.L(4.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f) + this.S + this.O;
            }
            canvas2.translate(width, L);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        g01 g01Var = this.f30330n0;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30311g1;
        if (g01Var != null) {
            float alpha = getAlpha();
            if (f6Var != null) {
                f6Var.b(this.f30350u0, this.f30348t0 + 0.0f, getMeasuredWidth(), this.f30352v0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.f30350u0, this.f30348t0 + 0.0f, getMeasuredWidth(), this.f30352v0);
            }
            this.f30330n0.c(canvas, getWidth(), this.f30319j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (f6Var != null) {
                f6Var.b(this.f30350u0, this.f30348t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30352v0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.f30350u0, this.f30348t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30352v0);
            }
            float width2 = (getWidth() - this.f30317i1) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.S + this.O + this.f30306f;
            float L3 = (this.f30317i1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
            int i12 = 0;
            while (i12 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i12);
                float a10 = c0Var.a();
                float L4 = ((org.telegram.messenger.g0.L(f14) + L3) * i12) + width2;
                float f15 = L4 + L3;
                RectF rectF = this.f30299c1;
                rectF.set(L4, L2, f15, c0Var.f28952f + L2);
                canvas2.save();
                if (a10 != 1.0f) {
                    f10 = f14;
                    canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
                } else {
                    f10 = f14;
                }
                float[] fArr = this.f30318i2;
                Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, iz.Y0)));
                if ((c0Var.f28953g & 9) == 9) {
                    float L5 = org.telegram.messenger.g0.L(iz.Y0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((c0Var.f28953g & 10) == 10) {
                    float L6 = org.telegram.messenger.g0.L(iz.Y0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.f30321j2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, N("paintChatActionBackground"));
                if (Q()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.f27919h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                y yVar = c0Var.f28964s;
                if (yVar != null) {
                    int i13 = (int) L2;
                    yVar.setBounds((int) L4, i13, (int) f15, c0Var.f28952f + i13);
                    c0Var.f28964s.setAlpha(255);
                    c0Var.f28964s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (c0Var.f28965t != null) {
                    i7 = org.telegram.messenger.g0.L(26.0f);
                } else {
                    i7 = 0;
                }
                float k10 = c0Var.h.k();
                if (c0Var.f28965t != null) {
                    i10 = org.telegram.messenger.g0.L(f10);
                } else {
                    i10 = 0;
                }
                float f16 = i7;
                float A = com.google.android.recaptcha.internal.a.A(L3 - (k10 + i10), f16, f13, L4);
                Drawable drawable = c0Var.f28965t;
                if (drawable != null) {
                    int i14 = (int) A;
                    f11 = f13;
                    drawable.setBounds(i14, (int) (((c0Var.f28952f - org.telegram.messenger.g0.L(24.0f)) / f13) + L2), org.telegram.messenger.g0.L(24.0f) + i14, org.telegram.messenger.g0.L(24.0f) + ((int) (((c0Var.f28952f - org.telegram.messenger.g0.L(24.0f)) / f11) + L2)));
                    Drawable drawable2 = c0Var.f28965t;
                    if (c0Var.f28958m) {
                        i11 = 128;
                    } else {
                        i11 = 255;
                    }
                    drawable2.setAlpha(i11);
                    c0Var.f28965t.draw(canvas2);
                    A += f16;
                } else {
                    f11 = f13;
                }
                c0Var.h.f36136p = Math.max(1, (((int) L3) - org.telegram.messenger.g0.L(15.0f)) - i7);
                my0 my0Var = c0Var.h;
                float L7 = (org.telegram.messenger.g0.L(40.0f) / f11) + L2;
                if (c0Var.f28958m) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                my0Var.f(canvas2, A, L7, f12);
                canvas2.restore();
                canvas2.restore();
                i12++;
                f14 = f10;
                f13 = f11;
            }
        }
    }

    public final void H(Canvas canvas, boolean z9) {
        if (this.f30345s) {
            if (!Q() || z9) {
                if (!Q() && z9) {
                    return;
                }
            } else {
                return;
            }
        }
        I(canvas, z9, null);
    }

    public final void I(Canvas canvas, boolean z9, Integer num) {
        float f10;
        Canvas canvas2;
        float f11 = 1.0f;
        if (z9) {
            f10 = getAlpha();
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f30311g1;
            if (f6Var != null) {
                f6Var.b(this.f30350u0, this.f30348t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30352v0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.f30350u0, this.f30348t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30352v0);
            }
            ij ijVar = this.P0;
            if (ijVar != null && ijVar.P5()) {
                ch.p0 p0Var = this.E0;
                p0Var.getClass();
                p0Var.f6360a = 1.0f;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                s0 s0Var = this.f30344r2;
                if (s0Var.f30231b) {
                    f11 = s0Var.f30232c;
                }
                p0Var.d(canvas2, f11, num);
                if (i7 < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void J(ol olVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.p0 p0Var = this.E0;
        p0Var.getClass();
        org.telegram.ui.ActionBar.f6 f6Var = this.f30311g1;
        if (f6Var != null) {
            f6Var.b(this.f30350u0, this.f30348t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30352v0);
        } else {
            org.telegram.ui.ActionBar.k6.r(this.f30350u0, this.f30348t0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30352v0);
        }
        p0Var.A = f10;
        p0Var.f(olVar, canvas, i7, num);
    }

    public final ColorFilter K(int i7) {
        if (i7 != this.f30340q2 || this.f30337p2 == null) {
            this.f30340q2 = i7;
            this.f30337p2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.f30337p2;
    }

    public final int L(ij ijVar) {
        int i7;
        int i10 = this.f30314h1;
        int i11 = ijVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || W()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (!V() && (i7 = ijVar.D) != 34 && i7 != 35) {
            return i10;
        }
        return 0;
    }

    @Override
    public final void M(String str) {
        TLRPC.PhotoSize photoSize;
        ij ijVar = this.P0;
        if (ijVar != null && ijVar.D == 11) {
            int size = ijVar.f23255n0.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    photoSize = (TLRPC.PhotoSize) ijVar.f23255n0.get(i7);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i7++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.I.r0(this.f30358x0, "g", hc.f(photoSize, ijVar.f23249l0), "50_50_b", this.L, 0L, null, ijVar, 1);
            org.telegram.messenger.z5.q(this.H).v(this);
        }
    }

    public Paint N(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.f6 f6Var = this.f30311g1;
        if (f6Var != null) {
            paint = f6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final float P(ij ijVar) {
        qp s12;
        String str;
        if (ijVar != null) {
            try {
                if (ijVar.D == 22 && (str = (s12 = qp.s1(this.H)).Q2) != null && TextUtils.equals(ijVar.f23244k.action.wallpaper.uploadingImage, str)) {
                    return s12.R2.f27414r;
                }
                return 1.0f;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean Q() {
        if (this.V0 == null) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f30311g1;
            if (f6Var != null) {
                if (f6Var.g()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.k6.d1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean R() {
        bi.m7 m7Var = this.H0;
        if (m7Var != null && m7Var.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        TLRPC.Message message;
        ij ijVar = this.P0;
        if (ijVar != null && (message = ijVar.f23244k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void T() {
        q0 q0Var = this.f30308f1;
        if (q0Var != null && q0Var.g()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean U(ij ijVar) {
        if (ijVar != null) {
            int i7 = ijVar.D;
            if (i7 == 30 || i7 == 18 || i7 == 25 || W()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean V() {
        TLRPC.Message message;
        ij ijVar = this.P0;
        if (ijVar != null && (message = ijVar.f23244k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        ij ijVar;
        int i7;
        if (!R() && this.O0 == null && (i7 = (ijVar = this.P0).D) != 31 && i7 != 37 && i7 != 33 && i7 != 35 && i7 != 34 && i7 != 21 && i7 != 22 && !ijVar.A4()) {
            TLRPC.Message message = this.P0.f23244k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    if (!((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low && !((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean X() {
        ij ijVar = this.P0;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23244k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return t10.B(qp.s1(this.H).a2(Long.valueOf(this.P0.f23244k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    public final void a0(CharacterStyle characterStyle) {
        if (this.f30308f1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f30308f1.m(this, this.P0.O1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f30360y;
                if (uRLSpan instanceof b41) {
                    TLObject tLObject = ((b41) uRLSpan).f32014c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        qg.d.m(this.f30308f1.t(), -this.f30308f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f30360y;
                if (uRLSpan2 instanceof b41) {
                    TLObject tLObject2 = ((b41) uRLSpan2).f32014c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f30308f1.w((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f30308f1.i(this, this.P0.O1());
            } else if (url.startsWith("http")) {
                vf.c.t(getContext(), url);
            } else {
                this.f30308f1.E(Long.parseLong(url));
            }
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void b0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        ij ijVar = this.P0;
        TLRPC.MessageAction messageAction = ijVar.f23244k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (ijVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !X()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.f23244k.action).slug;
        }
        if (this.f30308f1 != null) {
            org.telegram.messenger.g0.h3(new l2.z0(this, tL_premiumGiftOption, str, 23));
        }
    }

    public final void c0() {
        TLRPC.Message message;
        ij ijVar = this.P0;
        if (ijVar != null && (message = ijVar.f23244k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z9 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            di.n7 n7Var = this.f30301d0;
            if (z9) {
                Context context = getContext();
                TLRPC.Message message2 = this.P0.f23244k;
                int i7 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.f6 f6Var = n7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i7;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f27184id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                dd.k1(context, false, 0L, this.H, starsTransaction, f6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.P0.f23244k;
                int i10 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.f6 f6Var2 = n7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i10;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f27184id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                dd.k1(context2, false, 0L, this.H, starsTransaction2, f6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.P0.f23244k;
                int i11 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.f6 f6Var3 = n7Var.J;
                TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
                starsTransaction3.title = null;
                starsTransaction3.description = null;
                starsTransaction3.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction3.peer = tL_starsTransactionPeer3;
                tL_starsTransactionPeer3.peer = peer5;
                starsTransaction3.date = i11;
                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                starsTransaction3.amount = tL_starsTonAmount;
                tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
                starsTransaction3.f27184id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                dd.k1(context3, false, 0L, this.H, starsTransaction3, f6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    bi.k7 k7Var = new bi.k7(getContext(), this.H, ij.B0(this.P0.f23244k), this.f30311g1, null);
                    k7Var.i2(this.P0, null);
                    k7Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.messenger.k5.o(null, 2131743881, org.telegram.ui.Components.hc.a0(T), 2131624020, 36);
                        return;
                    }
                    return;
                }
                bi.k7 k7Var2 = new bi.k7(getContext(), this.H, ij.B0(this.P0.f23244k), this.f30311g1, null);
                k7Var2.i2(this.P0, null);
                k7Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        bi.k7 k7Var3 = new bi.k7(getContext(), this.H, ij.B0(this.P0.f23244k), this.f30311g1, null);
                        k7Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        k7Var3.show();
                    }
                }
            }
        }
    }

    public final boolean d0(float f10, float f11, xf xfVar) {
        if (S() && !this.P0.Q3() && !this.P0.f23244k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.d4 d4Var = this.I0;
                zg0 zg0Var = d4Var.f42357l;
                if (d4Var.f42352i0 && d4Var.f42354j0 == null) {
                    d4Var.f42352i0 = false;
                    d4Var.f42356k0 = xfVar;
                    d4Var.K.e(true, 0.0f);
                    d4Var.M = false;
                    d4Var.N = 0L;
                    d4Var.b();
                    d4Var.g();
                    d4Var.f42372t = 18.0f;
                    d4Var.f42374u.f();
                    zg0Var.T(true, 0.0f);
                    zg0Var.start();
                    d4Var.H = true;
                    float f12 = d4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d4Var.f42354j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    d4Var.f42354j0.setInterpolator(xq.h);
                    d4Var.f42354j0.addUpdateListener(new sf(d4Var, f12, 5));
                    d4Var.f42354j0.addListener(new r81(d4Var, 5));
                    d4Var.f42354j0.start();
                    d4Var.f42337a.invalidate();
                    this.P0.f23244k.premiumEffectWasPlayed = true;
                    yr.a0(this.H).X1(ij.B0(this.P0.f23244k), this.P0.f23244k);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        if (i7 == qs.f25027m1) {
            setSpoilersSuppressed(false);
        } else if (i7 == qs.f25009i4) {
            invalidate();
        } else if (i7 == qs.l1) {
            setSpoilersSuppressed(true);
        } else if (i7 != qs.W2 && i7 != qs.F3 && i7 != qs.X2) {
            if (i7 == qs.f25102y0) {
                if (Objects.equals(objArr[0], p10.i(this.H).f24472b0) && (ijVar = this.P0) != null) {
                    g0(ijVar, true);
                }
            } else if (i7 == qs.f24962a4 && S()) {
                this.f30328m2 = null;
                this.V = 0;
                requestLayout();
                invalidate();
            }
        } else {
            ij ijVar2 = this.P0;
            if (ijVar2 != null) {
                g0(ijVar2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.T1) {
            float a10 = this.f30329n.a(0.02f);
            canvas.save();
            canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e(TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
        q0 q0Var = this.f30308f1;
        if (q0Var != null) {
            q0Var.t0(this, reactionCount, z9, f10, f11);
        }
    }

    public final void e0(int i7, boolean z9, boolean z10) {
        String u10;
        int i10 = this.Q0;
        if (i10 != i7 && i10 / 3600 != i7 / 3600) {
            if (z9) {
                if (i7 == 2147483646) {
                    u10 = hd.M0(2131748491, "MessageScheduledUntilOnline");
                } else {
                    u10 = hd.a0("MessageScheduledOn", null, 2131748527, hd.u(i7, false));
                }
            } else {
                u10 = hd.u(i7, false);
            }
            this.Q0 = i7;
            CharSequence charSequence = this.R0;
            if (charSequence == null || !TextUtils.equals(u10, charSequence)) {
                this.R0 = u10;
                this.f30328m2 = null;
                j0(z10);
            }
        }
    }

    public final void g0(org.telegram.messenger.ij r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.g0(org.telegram.messenger.ij, boolean):void");
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (R()) {
            int width = ((int) (getWidth() - (this.H0.T.f55400f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            if (this.H0.f4344p) {
                return width;
            }
            return Math.min(this.f30293a1, width);
        } else if (U(this.P0)) {
            return jg.g.D(getWidth(), this.f30317i1, 2, this.f30319j0 / 2);
        } else {
            int i7 = this.f30293a1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.Q0) {
                i7 = Math.min((int) imageReceiver.K0, i7);
            }
            return (this.f30319j0 / 2) + i7;
        }
    }

    @Override
    public int getBoundsRight() {
        int i7;
        int i10;
        if (R()) {
            int L = ((int) ((this.H0.T.f55400f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            if (this.H0.f4344p) {
                return L;
            }
            return Math.max(this.f30296b1, L);
        }
        if (U(this.P0)) {
            i7 = this.f30319j0 / 2;
            i10 = (getWidth() + this.f30317i1) / 2;
        } else {
            i7 = this.f30296b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.Q0) {
                i7 = Math.max((int) imageReceiver.y(), i7);
            }
            i10 = this.f30319j0 / 2;
        }
        return i10 + i7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public aj getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.Q0;
    }

    public q0 getDelegate() {
        return this.f30308f1;
    }

    @Override
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override
    public ij getMessageObject() {
        return this.P0;
    }

    @Override
    public int getObserverTag() {
        return this.f30357x;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public ch.p0 getReactionsLayout() {
        return this.E0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public s0 getTransitionParams() {
        return this.f30344r2;
    }

    public float getWalletSlidingOffset() {
        return this.M0;
    }

    public final void h0(int i7, int i10) {
        this.T0 = i7;
        this.U0 = i10;
    }

    public final void i0(float f10, int i7) {
        this.f30355w0 = true;
        this.f30352v0 = i7;
        this.f30348t0 = f10;
        this.f30350u0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f30354w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30334o2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f30331n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    public final void j0(boolean z9) {
        if (getMeasuredWidth() != 0) {
            B(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (!this.C0) {
            if (z9) {
                org.telegram.messenger.g0.h3(new m0(this, 5));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        v();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z9;
        q0 q0Var;
        super.onAttachedToWindow();
        this.d2 = true;
        this.I.P();
        setStarsPaused(false);
        if (this.f30345s && (q0Var = this.f30308f1) != null && !q0Var.g()) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f30342r0 = org.telegram.ui.Components.r5.update(0, this, z9, this.f30342r0, this.M);
        r0 r0Var = this.f30347s1;
        if (r0Var != null) {
            r0Var.h = org.telegram.ui.Components.r5.update(0, (View) ((t0) r0Var.f30172i), false, (org.telegram.ui.Components.n5) r0Var.h, (StaticLayout) r0Var.f30170f);
        }
        int i7 = this.H;
        qs.f(i7).c(this, qs.W2);
        qs.f(i7).c(this, qs.X2);
        qs.f(i7).c(this, qs.F3);
        qs.f(i7).c(this, qs.f25102y0);
        qs.f(i7).c(this, qs.f24962a4);
        qs.e().c(this, qs.f25009i4);
        ij ijVar = this.P0;
        if (ijVar != null && ijVar.D == 21) {
            g0(ijVar, true);
        }
        bi.m7 m7Var = this.H0;
        if (m7Var != null) {
            m7Var.a();
        }
        ch.p0 p0Var = this.E0;
        ArrayList arrayList = p0Var.f6376s;
        p0Var.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.m0) arrayList.get(i10)).a();
        }
        g01 g01Var = this.f30330n0;
        if (g01Var != null) {
            g01Var.a();
        }
        jw0 jw0Var = this.O0;
        if (jw0Var != null) {
            jw0Var.d.R(jw0Var.f35085b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d2 = false;
        int i7 = this.H;
        org.telegram.messenger.z5.q(i7).v(this);
        this.I.R();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.r5.release(this, this.f30342r0);
        r0 r0Var = this.f30347s1;
        if (r0Var != null) {
            org.telegram.ui.Components.r5.release((t0) r0Var.f30172i, (org.telegram.ui.Components.n5) r0Var.h);
        }
        qs.f(i7).n(this, qs.W2);
        qs.f(i7).n(this, qs.X2);
        qs.f(i7).n(this, qs.F3);
        qs.f(i7).n(this, qs.f25102y0);
        qs.f(i7).n(this, qs.f24962a4);
        qs.e().n(this, qs.f25009i4);
        this.f30301d0.g();
        this.f30344r2.f30230a = false;
        bi.m7 m7Var = this.H0;
        if (m7Var != null) {
            m7Var.S = false;
            m7Var.d.R();
            m7Var.f4334e.b();
            zh.j0 j0Var = m7Var.f4352y;
            j0Var.d.R();
            org.telegram.ui.Components.r5.release((View) null, j0Var.f60306q);
            j0Var.f60306q = null;
        }
        this.E0.p();
        g01 g01Var = this.f30330n0;
        if (g01Var != null) {
            g01Var.b();
        }
        jw0 jw0Var = this.O0;
        if (jw0Var != null) {
            jw0Var.d.R(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ij ijVar = this.P0;
        if (TextUtils.isEmpty(this.R0) && ijVar == null) {
            return;
        }
        if (this.f30328m2 == null) {
            if (!TextUtils.isEmpty(this.R0)) {
                charSequence = this.R0;
            } else {
                charSequence = ijVar.v;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.f30328m2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f30328m2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f30328m2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Wallet.c4 c4Var;
        RectF rectF = this.f30332o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        if (d4Var == null) {
            c4Var = null;
        } else {
            c4Var = d4Var.f42359m;
        }
        if (c4Var != null) {
            c4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean q() {
        q0 q0Var = this.f30308f1;
        if (q0Var != null) {
            return q0Var.r0(this, this.f30361y0, this.f30363z0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            j0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.f30308f1 = q0Var;
    }

    public void setInvalidateColors(boolean z9) {
        if (this.f30304e1 == z9) {
            return;
        }
        this.f30304e1 = z9;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f30334o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.f30354w = view;
    }

    public void setInvalidatesParent(boolean z9) {
        this.f30331n2 = z9;
    }

    public void setMessageObject(ij ijVar) {
        g0(ijVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f30305e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.f30309f2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.E0.f6382z = num;
    }

    public void setShowTopic(boolean z9) {
        if (this.m0 != z9) {
            this.m0 = z9;
            T();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z9) {
        this.J0 = z9;
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        if (d4Var != null) {
            d4Var.n(z9);
        }
        ArrayList arrayList = this.f30335p0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f10) {
        setTranslationX((getTranslationX() - this.M0) + f10);
        this.M0 = f10;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final boolean w(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.w(android.view.MotionEvent):boolean");
    }

    public final void x() {
        RectF rectF = this.f30299c1;
        this.f30293a1 = (int) Math.min(this.f30293a1, rectF.left);
        this.f30296b1 = (int) Math.max(this.f30296b1, rectF.right);
    }

    public final boolean y(float f10, int i7) {
        ch.p0 p0Var = this.E0;
        if (!p0Var.H) {
            return false;
        }
        float y10 = getY() + p0Var.f6362c;
        if (y10 <= f10 || (y10 + p0Var.f6370m) - org.telegram.messenger.g0.L(16.0f) >= i7) {
            return false;
        }
        return true;
    }

    public final void z() {
        String str;
        String M0;
        String G;
        SpannableStringBuilder spannableStringBuilder;
        String a02;
        int L = this.f30317i1 - org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        TextPaint textPaint2 = this.F1;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.P0.f23244k.action;
        int i7 = tL_messageActionGiftCode.months;
        TLRPC.Chat M02 = qp.s1(this.H).M0(Long.valueOf(-org.telegram.messenger.m5.o(tL_messageActionGiftCode.boost_peer)));
        if (M02 == null) {
            str = null;
        } else {
            str = M02.title;
        }
        boolean z9 = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            M0 = hd.M0(2131753176, "BoostingUnclaimedPrize");
        } else {
            M0 = hd.M0(2131753542, "BoostingCongratulations");
        }
        if (i7 == 12) {
            G = hd.G(1, "BoldYears", new Object[0]);
        } else {
            G = hd.G(i7, "BoldMonths", new Object[0]);
        }
        if (z9) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753166, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.k5.q(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753307, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.k5.q(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a02 = hd.M0(2131753310, null);
            } else {
                a02 = hd.a0("BoostingReceivedGiftFrom", null, 2131753311, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = hd.M0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new u31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f30320j1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.f30327m1 = null;
        this.l1 = null;
        r0 r0Var = this.f30347s1;
        if (r0Var != null) {
            org.telegram.ui.Components.r5.release((t0) r0Var.f30172i, (org.telegram.ui.Components.n5) r0Var.h);
        }
        r0 r0Var2 = new r0(this);
        this.f30347s1 = r0Var2;
        r0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new u31(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.f30333o1 = false;
        this.f30336p1 = 0;
        this.f30356w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) N("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.f30359x1 = staticLayout;
        this.f30362y1 = true;
        this.D1 = Z(staticLayout);
    }

    public t0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f30329n = new ic(this);
        int i7 = p10.f24467s0;
        this.H = i7;
        di.n7 n7Var = new di.n7(null, false);
        this.f30301d0 = n7Var;
        this.m0 = true;
        this.f30332o0 = new RectF();
        this.f30335p0 = new ArrayList();
        this.f30338q0 = new Stack();
        this.E0 = new ch.p0(this);
        this.N0 = new RectF();
        this.T0 = -1;
        this.U0 = -1;
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new Path();
        this.f30299c1 = new RectF();
        this.f30302d1 = true;
        this.f30304e1 = false;
        this.n1 = false;
        this.f30333o1 = false;
        this.f30339q1 = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.f30362y1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.E1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.F1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.G1 = textPaint3;
        this.J1 = new RadialProgress2(this, null);
        this.N1 = new ca(this, 2);
        this.U1 = new Path();
        this.X1 = new ArrayList();
        this.f30294a2 = -1;
        this.f30300c2 = new Paint(1);
        this.f30312g2 = new Path();
        this.f30315h2 = new float[8];
        this.f30318i2 = new float[8];
        this.f30321j2 = new Path();
        this.f30324k2 = new int[]{16842910, 16842919};
        this.f30344r2 = new s0(this);
        n7Var.f9408a = false;
        this.f30345s = z9;
        this.f30311g1 = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.f22548u / 2);
        this.L = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f30357x = org.telegram.messenger.z5.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.p1 p1Var = new ug.p1(10);
        this.V1 = p1Var;
        p1Var.O = 100;
        p1Var.J = false;
        p1Var.M = true;
        p1Var.G = false;
        p1Var.K = true;
        p1Var.H = true;
        p1Var.f56686r = 1;
        p1Var.f56690w = 0.98f;
        p1Var.v = 0.98f;
        p1Var.f56689u = 0.98f;
        p1Var.f56676g = false;
        p1Var.f56683o = 0.0f;
        p1Var.f56691x = 750L;
        p1Var.f56692y = 750;
        p1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.f30354w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f30331n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        View view = this.f30354w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f30331n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void C(boolean z9) {
    }

    @Override
    public final void c(boolean z9, boolean z10) {
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
