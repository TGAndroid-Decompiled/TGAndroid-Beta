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
import android.os.SystemClock;
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
import di.pb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.messenger.xi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jj;
import org.telegram.ui.k71;
import org.telegram.ui.pl;
import org.telegram.ui.rf;
import org.telegram.ui.vf;
public class v0 extends z implements org.telegram.messenger.y5, fs, q4 {
    public static final HashMap f32063y2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public xh.f E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final ch.q0 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public di.h6 I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public org.telegram.ui.Wallet.m4 J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final org.telegram.ui.Components.b9 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final ea O1;
    public int P;
    public tw0 P0;
    public boolean P1;
    public StaticLayout Q;
    public fj Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public bi.y2 T0;
    public vy0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final ug.t1 W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public b3.j Z1;
    public boolean f32064a0;
    public final Path f32065a1;
    public boolean f32066a2;
    public boolean f32067b0;
    public int f32068b1;
    public int f32069b2;
    public RadialProgressView f32070c0;
    public int f32071c1;
    public TLRPC.TL_messageActionStarGiftOnchainOffer f32072c2;
    public float f32073d0;
    public final RectF f32074d1;
    public boolean d2;
    public final fi.e7 f32075e0;
    public boolean f32076e1;
    public int f32077e2;
    public int f32078f;
    public boolean f32079f0;
    public boolean f32080f1;
    public boolean f32081f2;
    public boolean f32082g0;
    public s0 f32083g1;
    public bi.f3 f32084g2;
    public int h;
    public boolean f32085h0;
    public final org.telegram.ui.ActionBar.i6 f32086h1;
    public float f32087h2;
    public boolean f32088i0;
    public int f32089i1;
    public final Paint f32090i2;
    public boolean f32091j0;
    public int f32092j1;
    public boolean f32093j2;
    public int f32094k0;
    public StaticLayout f32095k1;
    public View.OnClickListener f32096k2;
    public boolean f32097l0;
    public Paint l1;
    public int f32098l2;
    public int m0;
    public vy0 f32099m1;
    public final Path f32100m2;
    public final mc f32101n;
    public boolean f32102n0;
    public StaticLayout n1;
    public final float[] f32103n2;
    public q01 f32104o0;
    public boolean f32105o1;
    public final float[] f32106o2;
    public final RectF f32107p0;
    public boolean f32108p1;
    public final Path f32109p2;
    public final ArrayList f32110q0;
    public int f32111q1;
    public final int[] f32112q2;
    public o80 f32113r;
    public final Stack f32114r0;
    public final org.telegram.ui.Components.c6 f32115r1;
    public int f32116r2;
    public final boolean f32117s;
    public org.telegram.ui.Components.t5 f32118s0;
    public h6.m f32119s1;
    public SpannableStringBuilder f32120s2;
    public TextPaint f32121t0;
    public t0 f32122t1;
    public boolean f32123t2;
    public float f32124u0;
    public int f32125u1;
    public Runnable f32126u2;
    public float f32127v0;
    public int f32128v1;
    public PorterDuffColorFilter f32129v2;
    public View f32130w;
    public int f32131w0;
    public int f32132w1;
    public int f32133w2;
    public final int f32134x;
    public boolean f32135x0;
    public vy0 f32136x1;
    public final u0 f32137x2;
    public URLSpan f32138y;
    public fc f32139y0;
    public StaticLayout f32140y1;
    public float f32141z0;
    public boolean f32142z1;

    static {
        HashMap hashMap = new HashMap();
        f32063y2 = hashMap;
        i5.c.u(1, hashMap, "1⃣", 3, "2⃣");
        i5.c.u(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder E(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.J2(str, false, org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(1.3f), 0.8f, 2131231195));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new s2(org.telegram.messenger.g0.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.g0.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float a0(StaticLayout staticLayout) {
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
        return org.telegram.messenger.g0.L(11.0f) + this.T + this.P;
    }

    private void setStarsPaused(boolean z10) {
        ug.t1 t1Var = this.W1;
        if (z10 == t1Var.f58898g) {
            return;
        }
        t1Var.f58898g = z10;
        if (z10) {
            t1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < t1Var.f58904n.size(); i7++) {
            ug.s1 s1Var = (ug.s1) t1Var.f58904n.get(i7);
            s1Var.f58871a = (System.currentTimeMillis() - t1Var.R) + s1Var.f58871a;
        }
        invalidate();
    }

    public final void A(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i7, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        fj fjVar = this.Q0;
        if (fjVar != null && fjVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            fj fjVar2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (fjVar2 != null && fjVar2.D == 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new i41(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f32095k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f32095k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            vy0 vy0Var = new vy0(spannableStringBuilder, 10.0f, null);
            this.f32099m1 = vy0Var;
            vy0Var.f41480a.linkColor = -1;
        } else {
            this.f32099m1 = null;
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.f32072c2;
        TextPaint textPaint2 = this.G1;
        if (tL_messageActionStarGiftOnchainOffer != null) {
            textPaint2.setTextSize(P("paintChatActionText").getTextSize());
        } else {
            fj fjVar3 = this.Q0;
            if (fjVar3 != null && fjVar3.D == 35) {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
            } else if (fjVar3 != null && (Y() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
            } else {
                textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            }
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        fj fjVar4 = this.Q0;
        if (fjVar4 != null && fjVar4.D == 22 && fj.B0(fjVar4.f23965k) >= 0 && (a10 = hi.m3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            t0 t0Var = this.f32122t1;
            if (t0Var != null) {
                org.telegram.ui.Components.x5.release((v0) t0Var.f31803i, (org.telegram.ui.Components.t5) t0Var.h);
                this.f32122t1 = null;
            }
            this.f32108p1 = r42;
        } else {
            if (this.f32122t1 == null) {
                this.f32122t1 = new t0(this);
            }
            try {
                charSequence4 = org.telegram.messenger.j6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.f32122t1.a(charSequence4, textPaint2, L2);
            if (z10 && ((StaticLayout) this.f32122t1.f31801f).getLineCount() > 3) {
                this.f32108p1 = !this.f32105o1;
                this.f32111q1 = ((StaticLayout) this.f32122t1.f31801f).getLineBottom(2);
                this.f32136x1 = new vy0(gd.M0(2131750249, null), textPaint2.getTextSize() / org.telegram.messenger.g0.f24117p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.f32122t1.f31801f).getLineBottom(2);
                this.f32128v1 = lineBottom;
                this.f32132w1 = lineBottom - ((StaticLayout) this.f32122t1.f31801f).getLineTop(2);
                this.f32125u1 = (int) ((StaticLayout) this.f32122t1.f31801f).getLineRight(2);
            } else {
                this.f32108p1 = r42;
                this.f32115r1.f(true, true);
                this.f32111q1 = r42;
            }
            if (this.f32108p1) {
                int lineEnd = ((StaticLayout) this.f32122t1.f31801f).getLineEnd(2) - 1;
                t0 t0Var2 = this.f32122t1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                t0Var2.a(charSequence4, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new i41(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f32140y1 = staticLayout;
            if (!z11 || this.f32108p1) {
                z12 = r42;
            }
            this.f32142z1 = z12;
            this.E1 = a0(staticLayout);
        } else {
            this.f32140y1 = null;
            this.f32142z1 = r42;
            this.E1 = 0.0f;
        }
        if (str != null) {
            if (this.R1 == null) {
                this.R1 = new CornerPathEffect(org.telegram.messenger.g0.L(5.0f));
            }
            if (this.S1 == null) {
                Path path = new Path();
                this.S1 = path;
                bi.f3.d(path, 1.35f, r42);
            }
            vy0 vy0Var2 = new vy0(str, i7, org.telegram.messenger.g0.o());
            this.T1 = vy0Var2;
            vy0Var2.f41493p = org.telegram.messenger.g0.L(62.0f);
            return;
        }
        this.S1 = null;
        this.T1 = null;
    }

    public final void B(int i7, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z10;
        int width;
        s0 s0Var;
        TLRPC.Message message;
        fj fjVar;
        int i10;
        float f10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.f32091j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (X()) {
            if (this.f32091j0) {
                f10 = 28.0f;
            } else {
                f10 = 82.0f;
            }
            L = Math.min(L - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(272.0f));
        }
        if (L >= 0) {
            int i11 = this.f32098l2;
            if (i11 > 0) {
                L = Math.min(i11, L);
            }
            int i12 = L;
            this.f32076e1 = true;
            if (!X() && ((fjVar = this.Q0) == null || ((i10 = fjVar.D) != 34 && i10 != 35))) {
                if (fjVar != null && fjVar.f23999s2) {
                    textPaint = (TextPaint) P("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) P("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) P("paintChatActionText3");
            }
            textPaint.linkColor = textPaint.getColor();
            if (X()) {
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    for (org.telegram.messenger.g6 g6Var : (org.telegram.messenger.g6[]) spannable.getSpans(0, spannable.length(), org.telegram.messenger.g6.class)) {
                        spannable.removeSpan(g6Var);
                    }
                }
                charSequence2 = org.telegram.messenger.j6.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
            } else {
                charSequence2 = charSequence;
            }
            if (X()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            TextPaint textPaint2 = textPaint;
            CharSequence charSequence3 = charSequence2;
            this.N = new StaticLayout(charSequence2, textPaint2, i12, alignment2, 1.0f, 0.0f, false);
            this.Q = null;
            fj fjVar2 = this.Q0;
            if (fjVar2 != null && (message = fjVar2.f23965k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.Q = new StaticLayout(org.telegram.messenger.j6.n(org.telegram.messenger.g0.W2(gd.M0(2131744131, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f32117s && (s0Var = this.f32083g1) != null && !s0Var.h()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32118s0 = org.telegram.ui.Components.x5.update(0, this, z10, this.f32118s0, this.N);
            this.P = 0;
            this.O = 0;
            this.R = 0;
            StaticLayout staticLayout = this.Q;
            if (staticLayout != null) {
                int height = staticLayout.getHeight();
                this.R = height;
                this.R = org.telegram.messenger.g0.L(12.0f) + height;
            }
            fj fjVar3 = this.Q0;
            if (fjVar3 == null || !fjVar3.f23964j2) {
                try {
                    int lineCount = this.N.getLineCount();
                    for (int i13 = 0; i13 < lineCount; i13++) {
                        try {
                            float lineWidth = this.N.getLineWidth(i13);
                            float f11 = i12;
                            if (lineWidth > f11) {
                                lineWidth = f11;
                            }
                            this.P = (int) Math.max(this.P, Math.ceil(this.N.getLineBottom(i13)));
                            this.O = (int) Math.max(this.O, Math.ceil(lineWidth));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            this.S = (i7 - this.O) / 2;
            int L2 = org.telegram.messenger.g0.L(7.0f);
            this.T = L2;
            if (this.Q != null) {
                this.T = org.telegram.messenger.f3.C(11.0f, this.R, L2);
            }
            if (X()) {
                width = this.O;
            } else {
                width = this.N.getWidth();
            }
            this.U = (i7 - width) / 2;
            this.V = (i7 - i12) / 2;
            Stack stack = this.f32114r0;
            ArrayList arrayList = this.f32110q0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout2 = this.N;
                int i14 = this.S;
                xh.f.a(this, staticLayout2, i14, i14 + this.O, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void F(Canvas canvas, boolean z10) {
        v0 v0Var;
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.i6 i6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        org.telegram.ui.ActionBar.i6 i6Var2;
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
        t0 t0Var;
        int i12;
        float L;
        org.telegram.ui.Wallet.m4 m4Var;
        int L2;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Paint paint5;
        int i19;
        int i20;
        float f18;
        StaticLayout staticLayout;
        ArrayList arrayList2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        v0 v0Var2 = this;
        if (!v0Var2.f32117s || ((!v0Var2.R() || z10) && (v0Var2.R() || !z10))) {
            Paint P = v0Var2.P("paintChatActionBackground");
            Paint P2 = v0Var2.P("paintChatActionBackgroundDarken");
            v0Var2.f32121t0 = (TextPaint) v0Var2.P("paintChatActionText");
            int i27 = v0Var2.U0;
            org.telegram.ui.ActionBar.i6 i6Var3 = v0Var2.f32086h1;
            if (i27 >= 0) {
                int w02 = org.telegram.ui.ActionBar.n6.w0(i27, i6Var3);
                if (v0Var2.W0 == null) {
                    Paint paint6 = new Paint(1);
                    v0Var2.W0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.X0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    v0Var2.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
                    v0Var2.X0.setColor(org.telegram.ui.ActionBar.n6.w0(v0Var2.V0, i6Var3));
                }
                P = v0Var2.W0;
                v0Var2.f32121t0 = v0Var2.X0;
            }
            boolean z11 = v0Var2.f32076e1;
            Path path = v0Var2.f32065a1;
            if (z11) {
                v0Var2.f32076e1 = false;
                v0Var2.f32068b1 = v0Var2.getWidth();
                v0Var2.f32071c1 = 0;
                StaticLayout staticLayout2 = v0Var2.N;
                int measuredWidth = v0Var2.getMeasuredWidth() / 2;
                int L3 = org.telegram.messenger.g0.L(4.0f);
                f11 = 6.0f;
                ArrayList arrayList3 = v0Var2.Y0;
                arrayList3.clear();
                if (staticLayout2 == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout2.getLineCount();
                }
                f12 = 8.0f;
                int L4 = org.telegram.messenger.g0.L(11.0f);
                f10 = 4.0f;
                int L5 = org.telegram.messenger.g0.L(8.0f);
                int i28 = 0;
                f13 = 2.0f;
                int i29 = 0;
                while (i28 < lineCount) {
                    org.telegram.ui.ActionBar.i6 i6Var4 = i6Var3;
                    int ceil = (int) Math.ceil(staticLayout2.getLineWidth(i28));
                    if (i28 != 0 && (i26 = i29 - ceil) > 0) {
                        i24 = ceil;
                        if (i26 <= (L4 * 1.5f) + L5) {
                            i25 = i29;
                            i28 = com.google.android.gms.internal.vision.e2.f(i25, i28, 1, arrayList3);
                            i29 = i25;
                            i6Var3 = i6Var4;
                        }
                    } else {
                        i24 = ceil;
                    }
                    i25 = i24;
                    i28 = com.google.android.gms.internal.vision.e2.f(i25, i28, 1, arrayList3);
                    i29 = i25;
                    i6Var3 = i6Var4;
                }
                i6Var = i6Var3;
                for (int i30 = lineCount - 2; i30 >= 0; i30--) {
                    int intValue = ((Integer) arrayList3.get(i30)).intValue();
                    int i31 = i29 - intValue;
                    if (i31 > 0) {
                        i23 = intValue;
                        if (i31 <= (L4 * 1.5f) + L5) {
                            arrayList3.set(i30, Integer.valueOf(i29));
                        }
                    } else {
                        i23 = intValue;
                    }
                    i29 = i23;
                    arrayList3.set(i30, Integer.valueOf(i29));
                }
                int L6 = org.telegram.messenger.g0.L(3.0f);
                int L7 = org.telegram.messenger.g0.L(6.0f);
                int i32 = L4 - L6;
                ArrayList arrayList4 = v0Var2.Z0;
                arrayList4.clear();
                path.reset();
                float f19 = measuredWidth;
                path.moveTo(f19, L3);
                int i33 = i29;
                int i34 = 0;
                int i35 = 0;
                while (true) {
                    rectF = v0Var2.f32074d1;
                    if (i35 >= lineCount) {
                        break;
                    }
                    int intValue2 = ((Integer) arrayList3.get(i35)).intValue();
                    int lineBottom = staticLayout2.getLineBottom(i35);
                    int i36 = lineCount;
                    int i37 = i36 - 1;
                    if (i35 < i37) {
                        paint5 = P2;
                        i19 = ((Integer) arrayList3.get(i35 + 1)).intValue();
                    } else {
                        paint5 = P2;
                        i19 = 0;
                    }
                    int i38 = lineBottom - i34;
                    if (i35 == 0 || intValue2 > i33) {
                        i38 = org.telegram.messenger.g0.L(3.0f) + i38;
                    }
                    if (i35 == i37 || intValue2 > i19) {
                        i38 = org.telegram.messenger.g0.L(3.0f) + i38;
                    }
                    Paint paint7 = P;
                    float f20 = (intValue2 / 2.0f) + f19;
                    if (i35 != i37 && intValue2 < i19 && i35 != 0 && intValue2 < i33) {
                        i20 = L7;
                    } else {
                        i20 = L5;
                    }
                    if (i35 == 0 || intValue2 > i33) {
                        f18 = f20;
                        staticLayout = staticLayout2;
                        arrayList2 = arrayList3;
                        rectF.set((f18 - L6) - L4, L3, f18 + i32, (L4 * 2) + L3);
                        x();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f18 = f20;
                        if (intValue2 < i33) {
                            float f21 = f18 + i32;
                            staticLayout = staticLayout2;
                            arrayList2 = arrayList3;
                            rectF.set(f21, L3, (i20 * 2) + f21, i22 + L3);
                            x();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            staticLayout = staticLayout2;
                            arrayList2 = arrayList3;
                        }
                    }
                    L3 += i38;
                    if (i35 != i37 && intValue2 < i19) {
                        L3 -= org.telegram.messenger.g0.L(3.0f);
                        i38 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    if (i35 != 0 && intValue2 < i33) {
                        L3 -= org.telegram.messenger.g0.L(3.0f);
                        i38 -= org.telegram.messenger.g0.L(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i38));
                    if (i35 != i37 && intValue2 <= i19) {
                        if (intValue2 < i19) {
                            float f22 = f18 + i32;
                            rectF.set(f22, L3 - i21, (i20 * 2) + f22, L3);
                            x();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f18 - L6) - L4, L3 - (L4 * 2), f18 + i32, L3);
                        x();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i35++;
                    v0Var2 = this;
                    i33 = intValue2;
                    i34 = lineBottom;
                    lineCount = i36;
                    P2 = paint5;
                    P = paint7;
                    staticLayout2 = staticLayout;
                    arrayList3 = arrayList2;
                }
                paint = P;
                paint2 = P2;
                StaticLayout staticLayout3 = staticLayout2;
                ArrayList arrayList5 = arrayList3;
                int i39 = lineCount - 1;
                int i40 = i39;
                while (i40 >= 0) {
                    if (i40 != 0) {
                        arrayList = arrayList5;
                        i13 = ((Integer) arrayList.get(i40 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i13 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i40)).intValue();
                    if (i40 != i39) {
                        i14 = ((Integer) arrayList.get(i40 + 1)).intValue();
                    } else {
                        i14 = 0;
                    }
                    StaticLayout staticLayout4 = staticLayout3;
                    staticLayout4.getLineBottom(i40);
                    float f23 = measuredWidth - (intValue3 / 2);
                    if (i40 != i39 && intValue3 < i14 && i40 != 0 && intValue3 < i13) {
                        i15 = L7;
                    } else {
                        i15 = L5;
                    }
                    if (i40 == i39 || intValue3 > i14) {
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i16 = i39;
                        rectF.set(f23 - i32, L3 - (L4 * 2), L6 + f23 + L4, L3);
                        x();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i14) {
                        float f24 = f23 - i32;
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i16 = i39;
                        rectF.set(f24 - (i15 * 2), L3 - i18, f24, L3);
                        x();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        staticLayout3 = staticLayout4;
                        i16 = i39;
                    }
                    L3 -= ((Integer) arrayList4.get(i40)).intValue();
                    if (i40 != 0 && intValue3 <= i13) {
                        if (intValue3 < i13) {
                            float f25 = f23 - i32;
                            rectF.set(f25 - (i15 * 2), L3, f25, i17 + L3);
                            x();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f23 - i32, L3, f23 + L6 + L4, (L4 * 2) + L3);
                        x();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                    i40--;
                    i39 = i16;
                }
                path.close();
                int measuredWidth2 = getMeasuredWidth() / 2;
                if (X() && !Y()) {
                    float f26 = measuredWidth2;
                    v0Var = this;
                    rectF.left = (f26 - (v0Var.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L3;
                    rectF.right = (v0Var.O / 2.0f) + f26 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L3 + v0Var.P + v0Var.R;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                } else {
                    v0Var = this;
                }
            } else {
                v0Var = v0Var2;
                paint = P;
                paint2 = P2;
                i6Var = i6Var3;
                f10 = 4.0f;
                f11 = 6.0f;
                f12 = 8.0f;
                f13 = 2.0f;
            }
            if (!v0Var.f32135x0) {
                v0Var.f32131w0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (i6Var != null) {
                i6Var2 = i6Var;
                i6Var2.e(v0Var.f32127v0, v0Var.f32124u0 + org.telegram.messenger.g0.L(f10), v0Var.getMeasuredWidth(), v0Var.f32131w0);
            } else {
                i6Var2 = i6Var;
                org.telegram.ui.ActionBar.n6.r(v0Var.f32127v0, v0Var.f32124u0 + org.telegram.messenger.g0.L(f10), v0Var.getMeasuredWidth(), v0Var.f32131w0);
            }
            boolean z12 = v0Var instanceof jj;
            if (z12 && !org.telegram.ui.ActionBar.n6.i1(i6Var2)) {
                f14 = 0.75f;
            } else {
                f14 = 1.0f;
            }
            if (!z10 || (v0Var.getAlpha() == 1.0f && !z12)) {
                paint3 = paint2;
                paint4 = paint;
                if (z12) {
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
                paint4.setAlpha((int) (v0Var.getAlpha() * i7 * f14));
                paint3 = paint2;
                paint3.setAlpha((int) (v0Var.getAlpha() * i10 * f14));
            }
            fj fjVar = v0Var.Q0;
            Paint paint8 = v0Var.f32090i2;
            if (fjVar == null || !fjVar.f23964j2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.f32087h2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (v0Var.T()) {
                int width = v0Var.getWidth();
                v0Var.J0.getClass();
                float L8 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = v0Var.getWalletActionTop();
                v0Var.J0.getClass();
                float L9 = org.telegram.messenger.g0.L(206.0f) + L8;
                if (v0Var.J0.f44545q0 == null) {
                    L2 = org.telegram.messenger.g0.L(140.0f);
                    f15 = 140.0f;
                    f16 = 20.0f;
                } else {
                    f15 = 140.0f;
                    f16 = 20.0f;
                    L2 = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(m4Var.f44545q0.i()));
                }
                RectF rectF2 = v0Var.O0;
                rectF2.set(L8, walletActionTop, L9, L2 + walletActionTop);
                canvas2.save();
                v0Var.J0.c(canvas2, L8, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                if (v0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                }
                f17 = 0.0f;
                if (v0Var.f32087h2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha2));
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
            fj fjVar2 = v0Var.Q0;
            if (v0Var.S()) {
                float L10 = v0Var.I0.T.f57663f + org.telegram.messenger.g0.L(f12);
                float width2 = (v0Var.getWidth() - L10) / f13;
                if (v0Var.I0.f8952p) {
                    L = f17;
                } else {
                    L = org.telegram.messenger.g0.L(12.0f) + v0Var.T + v0Var.P;
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L, L10 + width2, v0Var.I0.P + L + org.telegram.messenger.g0.L(f12));
                if (v0Var.N1 == null) {
                    v0Var.N1 = new RectF();
                }
                v0Var.N1.set(rectF3);
                canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (v0Var.R()) {
                    canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (v0Var.P0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                tw0 tw0Var = v0Var.P0;
                tw0Var.getClass();
                int L12 = org.telegram.messenger.g0.L(f15) + ((int) tw0Var.f40117f.i());
                if (tw0Var.f40119i) {
                    i12 = org.telegram.messenger.g0.L(40.0f);
                } else {
                    i12 = 0;
                }
                float f27 = L12 + i12;
                float width3 = (v0Var.getWidth() - L11) / f13;
                if (v0Var.N1 == null) {
                    v0Var.N1 = new RectF();
                }
                v0Var.N1.set(width3, org.telegram.messenger.g0.L(f10), L11 + width3, org.telegram.messenger.g0.L(f10) + f27);
                canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (v0Var.R()) {
                    canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (v0Var.W(fjVar2)) {
                float width4 = (v0Var.getWidth() - v0Var.f32092j1) / f13;
                float f28 = v0Var.T + v0Var.P;
                if (v0Var.Y()) {
                    float L13 = f28 + org.telegram.messenger.g0.L(f10);
                    org.telegram.messenger.g0.P.set(width4, L13, v0Var.f32092j1 + width4, v0Var.f32078f + L13);
                } else {
                    float L14 = f28 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f29 = v0Var.f32092j1;
                    rectF4.set(width4, L14, width4 + f29, f29 + L14 + v0Var.L1);
                }
                if (fjVar2 != null && fjVar2.D == 18 && !v0Var.f32108p1 && (t0Var = v0Var.f32122t1) != null && v0Var.f32111q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.gms.internal.vision.e2.t(1.0f, v0Var.f32115r1.f33892c, ((StaticLayout) t0Var.f31801f).getHeight() - v0Var.f32111q1, rectF5.bottom);
                }
                if (v0Var.N1 == null) {
                    v0Var.N1 = new RectF();
                }
                v0Var.N1.set(org.telegram.messenger.g0.P);
                if (fjVar2 != null && (((i11 = fjVar2.D) == 33 || i11 == 35) && v0Var.Z1 != null)) {
                    float[] fArr = v0Var.f32103n2;
                    Arrays.fill(fArr, org.telegram.messenger.g0.L(16.0f));
                    float L15 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L15;
                    fArr[6] = L15;
                    fArr[5] = L15;
                    fArr[4] = L15;
                    Path path2 = v0Var.f32100m2;
                    path2.rewind();
                    path2.addRoundRect(v0Var.N1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.R()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                    if (v0Var.R()) {
                        canvas2.drawRoundRect(v0Var.N1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
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
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.f32072c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.f32084g2 != null && (tL_messageActionStarGiftOnchainOffer.gift instanceof TL_stars.TL_starGiftUnique)) {
            ImageReceiver imageReceiver = this.J;
            float L = (imageReceiver.M0 - org.telegram.messenger.g0.L(10.0f)) - org.telegram.messenger.g0.L(1.7f);
            int L2 = (int) (((((imageReceiver.L0 + imageReceiver.N0) + org.telegram.messenger.g0.L(10.0f)) + org.telegram.messenger.g0.L(1.9805f)) + org.telegram.messenger.g0.L(48.0f)) - org.telegram.messenger.g0.L(40.800003f));
            int i7 = (int) L;
            this.f32084g2.setBounds(L2 - org.telegram.messenger.g0.L(39.0f), i7, L2, org.telegram.messenger.g0.L(42.6f) + i7);
            this.f32084g2.draw(canvas);
        }
    }

    public final void I(Canvas canvas) {
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
        canvas2.translate(this.f32094k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.t5 t5Var = this.f32118s0;
        if (staticLayout != null) {
            colorFilter = M(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas2, staticLayout, t5Var, 0.0f, this.f32110q0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f14 = 4.0f;
        if (S()) {
            canvas2.save();
            di.h6 h6Var = this.I0;
            float width = (getWidth() - h6Var.T.f57663f) / 2.0f;
            if (h6Var.f8952p) {
                L = org.telegram.messenger.g0.L(4.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f) + this.T + this.P;
            }
            canvas2.translate(width, L);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        q01 q01Var = this.f32104o0;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32086h1;
        if (q01Var != null) {
            float alpha = getAlpha();
            if (i6Var != null) {
                i6Var.e(this.f32127v0, this.f32124u0 + 0.0f, getMeasuredWidth(), this.f32131w0);
            } else {
                org.telegram.ui.ActionBar.n6.r(this.f32127v0, this.f32124u0 + 0.0f, getMeasuredWidth(), this.f32131w0);
            }
            this.f32104o0.c(canvas, getWidth(), this.f32094k0, 0.0f, 1.0f, alpha, this.f32102n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i6Var != null) {
                i6Var.e(this.f32127v0, this.f32124u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f32131w0);
            } else {
                org.telegram.ui.ActionBar.n6.r(this.f32127v0, this.f32124u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f32131w0);
            }
            float width2 = (getWidth() - this.f32092j1) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f32078f;
            float L3 = (this.f32092j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
            int i12 = 0;
            while (i12 < arrayList.size()) {
                d0 d0Var = (d0) arrayList.get(i12);
                float a10 = d0Var.a();
                float L4 = ((org.telegram.messenger.g0.L(f14) + L3) * i12) + width2;
                float f15 = L4 + L3;
                RectF rectF = this.f32074d1;
                rectF.set(L4, L2, f15, d0Var.f30502f + L2);
                canvas2.save();
                if (a10 != 1.0f) {
                    f10 = f14;
                    canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
                } else {
                    f10 = f14;
                }
                float[] fArr = this.f32106o2;
                Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, bz.Y0)));
                if ((d0Var.f30503g & 9) == 9) {
                    float L5 = org.telegram.messenger.g0.L(bz.Y0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((d0Var.f30503g & 10) == 10) {
                    float L6 = org.telegram.messenger.g0.L(bz.Y0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.f32109p2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, P("paintChatActionBackground"));
                if (R()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.n6.f29464h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                y yVar = d0Var.f30514s;
                if (yVar != null) {
                    int i13 = (int) L2;
                    yVar.setBounds((int) L4, i13, (int) f15, d0Var.f30502f + i13);
                    d0Var.f30514s.setAlpha(255);
                    d0Var.f30514s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (d0Var.f30515t != null) {
                    i7 = org.telegram.messenger.g0.L(26.0f);
                } else {
                    i7 = 0;
                }
                float k10 = d0Var.h.k();
                if (d0Var.f30515t != null) {
                    i10 = org.telegram.messenger.g0.L(f10);
                } else {
                    i10 = 0;
                }
                float f16 = i7;
                float A = com.google.android.gms.internal.vision.e2.A(L3 - (k10 + i10), f16, f13, L4);
                Drawable drawable = d0Var.f30515t;
                if (drawable != null) {
                    int i14 = (int) A;
                    f11 = f13;
                    drawable.setBounds(i14, (int) (((d0Var.f30502f - org.telegram.messenger.g0.L(24.0f)) / f13) + L2), org.telegram.messenger.g0.L(24.0f) + i14, org.telegram.messenger.g0.L(24.0f) + ((int) (((d0Var.f30502f - org.telegram.messenger.g0.L(24.0f)) / f11) + L2)));
                    Drawable drawable2 = d0Var.f30515t;
                    if (d0Var.f30508m) {
                        i11 = 128;
                    } else {
                        i11 = 255;
                    }
                    drawable2.setAlpha(i11);
                    d0Var.f30515t.draw(canvas2);
                    A += f16;
                } else {
                    f11 = f13;
                }
                d0Var.h.f41493p = Math.max(1, (((int) L3) - org.telegram.messenger.g0.L(15.0f)) - i7);
                vy0 vy0Var = d0Var.h;
                float L7 = (org.telegram.messenger.g0.L(40.0f) / f11) + L2;
                if (d0Var.f30508m) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                vy0Var.f(canvas2, A, L7, f12);
                canvas2.restore();
                canvas2.restore();
                i12++;
                f14 = f10;
                f13 = f11;
            }
        }
    }

    public final void J(Canvas canvas, boolean z10) {
        if (this.f32117s) {
            if (!R() || z10) {
                if (!R() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        K(canvas, z10, null);
    }

    public final void K(Canvas canvas, boolean z10, Integer num) {
        float f10;
        Canvas canvas2;
        float f11 = 1.0f;
        if (z10) {
            f10 = getAlpha();
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f32086h1;
            if (i6Var != null) {
                i6Var.e(this.f32127v0, this.f32124u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f32131w0);
            } else {
                org.telegram.ui.ActionBar.n6.r(this.f32127v0, this.f32124u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f32131w0);
            }
            fj fjVar = this.Q0;
            if (fjVar != null && fjVar.O5()) {
                ch.q0 q0Var = this.F0;
                q0Var.getClass();
                q0Var.f5479a = 1.0f;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                u0 u0Var = this.f32137x2;
                if (u0Var.f31868b) {
                    f11 = u0Var.f31869c;
                }
                q0Var.d(canvas2, f11, num);
                if (i7 < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void L(pl plVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.q0 q0Var = this.F0;
        q0Var.getClass();
        org.telegram.ui.ActionBar.i6 i6Var = this.f32086h1;
        if (i6Var != null) {
            i6Var.e(this.f32127v0, this.f32124u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f32131w0);
        } else {
            org.telegram.ui.ActionBar.n6.r(this.f32127v0, this.f32124u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f32131w0);
        }
        q0Var.A = f10;
        q0Var.f(plVar, canvas, i7, num);
    }

    public final ColorFilter M(int i7) {
        if (i7 != this.f32133w2 || this.f32129v2 == null) {
            this.f32133w2 = i7;
            this.f32129v2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.f32129v2;
    }

    @Override
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        fj fjVar = this.Q0;
        if (fjVar != null && fjVar.D == 11) {
            int size = fjVar.f23985p0.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    photoSize = (TLRPC.PhotoSize) fjVar.f23985p0.get(i7);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i7++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.J.r0(this.f32139y0, "g", fc.f(photoSize, fjVar.f23978n0), "50_50_b", this.M, 0L, null, fjVar, 1);
            org.telegram.messenger.a6.q(this.I).v(this);
        }
    }

    public final int O(fj fjVar) {
        int i7;
        int i10 = this.f32089i1;
        int i11 = fjVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || Y()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (!X() && (i7 = fjVar.D) != 34 && i7 != 35) {
            return i10;
        }
        return 0;
    }

    public Paint P(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.i6 i6Var = this.f32086h1;
        if (i6Var != null) {
            paint = i6Var.g(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.n6.V0(str);
    }

    public final float Q(fj fjVar) {
        mp u12;
        String str;
        if (fjVar != null) {
            try {
                if (fjVar.D == 22 && (str = (u12 = mp.u1(this.I)).T2) != null && TextUtils.equals(fjVar.f23965k.action.wallpaper.uploadingImage, str)) {
                    return u12.U2.f28912r;
                }
                return 1.0f;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean R() {
        if (this.W0 == null) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f32086h1;
            if (i6Var != null) {
                if (i6Var.j()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.n6.d1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean S() {
        di.h6 h6Var = this.I0;
        if (h6Var != null && h6Var.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        if (fjVar != null && (message = fjVar.f23965k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void U() {
        s0 s0Var = this.f32083g1;
        if (s0Var != null && s0Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean W(fj fjVar) {
        if (fjVar != null) {
            int i7 = fjVar.D;
            if (i7 == 30 || i7 == 18 || i7 == 25 || Y()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean X() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        if (fjVar != null && (message = fjVar.f23965k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        fj fjVar;
        int i7;
        if (!S() && this.P0 == null && (i7 = (fjVar = this.Q0).D) != 31 && i7 != 37 && i7 != 33 && i7 != 35 && i7 != 34 && i7 != 21 && i7 != 22 && !fjVar.z4()) {
            TLRPC.Message message = this.Q0.f23965k;
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

    public final boolean Z() {
        fj fjVar = this.Q0;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f23965k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return o10.C(mp.u1(this.I).c2(Long.valueOf(this.Q0.f23965k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean b0() {
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.f32072c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2) {
            long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
            Long l10 = (Long) bi.e4.f3543a.get(Long.valueOf(j3));
            if (l10 == null || l10.longValue() <= SystemClock.elapsedRealtime() || !bi.e4.f3544b.contains(Long.valueOf(j3))) {
                int i7 = this.I;
                if (bi.e4.k(i7, j3) || bi.e4.m(i7, j3)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final CharSequence c0(SpannableStringBuilder spannableStringBuilder, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        HashMap hashMap = bi.e4.f3543a;
        CharSequence charSequence = null;
        if (tL_messageActionStarGiftOnchainOffer.settled && !tL_messageActionStarGiftOnchainOffer.accepted) {
            charSequence = gd.M0(2131749559, null);
        } else if (!tL_messageActionStarGiftOnchainOffer.accepted && !tL_messageActionStarGiftOnchainOffer.declined) {
            if (tL_messageActionStarGiftOnchainOffer.cancelled) {
                charSequence = gd.M0(2131749558, null);
            } else if (tL_messageActionStarGiftOnchainOffer.cancelling) {
                charSequence = gd.M0(2131749563, null);
            } else {
                int max = Math.max(0, tL_messageActionStarGiftOnchainOffer.expires_at - ConnectionsManager.getInstance(this.I).getCurrentTime());
                charSequence = tL_messageActionStarGiftOnchainOffer.expired ? gd.M0(2131749561, null) : max == 0 ? gd.M0(2131749560, null) : org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749597, String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf(max / 3600), Integer.valueOf((max / 60) % 60), Integer.valueOf(max % 60))));
            }
        }
        if (charSequence == null) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        spannableStringBuilder2.append((CharSequence) "\n\n");
        spannableStringBuilder2.append(charSequence);
        return spannableStringBuilder2;
    }

    @Override
    public final void d(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        s0 s0Var = this.f32083g1;
        if (s0Var != null) {
            s0Var.x0(this, reactionCount, z10, f10, f11);
        }
    }

    public final void d0(CharacterStyle characterStyle) {
        if (this.f32083g1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f32083g1.u(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f32138y;
                if (uRLSpan instanceof p41) {
                    TLObject tLObject = ((p41) uRLSpan).f38271c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        qg.c.n(this.f32083g1.G(), -this.f32083g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f32138y;
                if (uRLSpan2 instanceof p41) {
                    TLObject tLObject2 = ((p41) uRLSpan2).f38271c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f32083g1.M((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f32083g1.n(this, this.Q0.N1());
            } else if (url.startsWith("http")) {
                vf.c.t(getContext(), url);
            } else {
                this.f32083g1.V(Long.parseLong(url));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fj fjVar;
        if (i7 == ks.f25150m1) {
            setSpoilersSuppressed(false);
        } else if (i7 != ks.f25148l4 && i7 != ks.L3) {
            if (i7 == ks.l1) {
                setSpoilersSuppressed(true);
            } else if (i7 != ks.Y2 && i7 != ks.H3 && i7 != ks.Z2) {
                if (i7 == ks.f25225y0) {
                    if (Objects.equals(objArr[0], j10.i(this.I).f24777c0) && (fjVar = this.Q0) != null) {
                        i0(fjVar, true);
                    }
                } else if (i7 == ks.f25102d4 && T()) {
                    this.f32120s2 = null;
                    this.W = 0;
                    requestLayout();
                    invalidate();
                }
            } else {
                fj fjVar2 = this.Q0;
                if (fjVar2 != null) {
                    i0(fjVar2, true);
                }
            }
        } else {
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.U1) {
            float a10 = this.f32101n.a(0.02f);
            canvas.save();
            canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        fj fjVar = this.Q0;
        TLRPC.MessageAction messageAction = fjVar.f23965k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (fjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Z()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.f23965k.action).slug;
        }
        if (this.f32083g1 != null) {
            org.telegram.messenger.g0.g3(new kg.i0(this, tL_premiumGiftOption, str, 27));
        }
    }

    public final void f0() {
        TLRPC.Message message;
        fj fjVar = this.Q0;
        if (fjVar != null && (message = fjVar.f23965k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            fi.e7 e7Var = this.f32075e0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.Q0.f23965k;
                int i7 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.i6 i6Var = e7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i7;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f28634id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                pb.l1(context, false, 0L, this.I, starsTransaction, i6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.Q0.f23965k;
                int i10 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.i6 i6Var2 = e7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i10;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f28634id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                pb.l1(context2, false, 0L, this.I, starsTransaction2, i6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.Q0.f23965k;
                int i11 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.i6 i6Var3 = e7Var.J;
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
                starsTransaction3.f28634id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                pb.l1(context3, false, 0L, this.I, starsTransaction3, i6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    di.f6 f6Var = new di.f6(getContext(), this.I, fj.B0(this.Q0.f23965k), this.f32086h1, null);
                    f6Var.v2(this.Q0, null);
                    f6Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.messenger.f3.n(null, 2131743643, lc.b0(T), 2131624021, 36);
                        return;
                    }
                    return;
                }
                di.f6 f6Var2 = new di.f6(getContext(), this.I, fj.B0(this.Q0.f23965k), this.f32086h1, null);
                f6Var2.v2(this.Q0, null);
                f6Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        di.f6 f6Var3 = new di.f6(getContext(), this.I, 0L, this.f32086h1, null);
                        f6Var3.u2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        f6Var3.show();
                    }
                }
            }
        }
    }

    public final boolean g0(float f10, float f11, vf vfVar) {
        if (T() && !this.Q0.P3() && !this.Q0.f23965k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.m4 m4Var = this.J0;
                mh0 mh0Var = m4Var.f44535l;
                if (m4Var.f44530i0 && m4Var.f44532j0 == null) {
                    m4Var.f44530i0 = false;
                    m4Var.f44534k0 = vfVar;
                    m4Var.K.e(true, 0.0f);
                    m4Var.M = false;
                    m4Var.N = 0L;
                    m4Var.b();
                    m4Var.g();
                    m4Var.f44550t = 18.0f;
                    m4Var.f44552u.f();
                    mh0Var.T(true, 0.0f);
                    mh0Var.start();
                    m4Var.H = true;
                    float f12 = m4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m4Var.f44532j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    m4Var.f44532j0.setInterpolator(lr.h);
                    m4Var.f44532j0.addUpdateListener(new rf(m4Var, f12, 7));
                    m4Var.f44532j0.addListener(new k71(m4Var, 6));
                    m4Var.f44532j0.start();
                    m4Var.f44515a.invalidate();
                    this.Q0.f23965k.premiumEffectWasPlayed = true;
                    tr.a0(this.I).X1(fj.B0(this.Q0.f23965k), this.Q0.f23965k);
                    return true;
                }
            }
        }
        return false;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (S()) {
            int width = ((int) (getWidth() - (this.I0.T.f57663f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            if (this.I0.f8952p) {
                return width;
            }
            return Math.min(this.f32068b1, width);
        } else if (W(this.Q0)) {
            return i5.c.e(getWidth(), this.f32092j1, 2, this.f32094k0 / 2);
        } else {
            int i7 = this.f32068b1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i7 = Math.min((int) imageReceiver.L0, i7);
            }
            return (this.f32094k0 / 2) + i7;
        }
    }

    @Override
    public int getBoundsRight() {
        int i7;
        int i10;
        if (S()) {
            int L = ((int) ((this.I0.T.f57663f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            if (this.I0.f8952p) {
                return L;
            }
            return Math.max(this.f32071c1, L);
        }
        if (W(this.Q0)) {
            i7 = this.f32094k0 / 2;
            i10 = (getWidth() + this.f32092j1) / 2;
        } else {
            i7 = this.f32071c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i7 = Math.max((int) imageReceiver.y(), i7);
            }
            i10 = this.f32094k0 / 2;
        }
        return i10 + i7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public xi getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public s0 getDelegate() {
        return this.f32083g1;
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
    public fj getMessageObject() {
        return this.Q0;
    }

    @Override
    public int getObserverTag() {
        return this.f32134x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public ch.q0 getReactionsLayout() {
        return this.F0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.f32137x2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(int i7, boolean z10, boolean z11) {
        String u10;
        int i10 = this.R0;
        if (i10 != i7 && i10 / 3600 != i7 / 3600) {
            if (z10) {
                if (i7 == 2147483646) {
                    u10 = gd.M0(2131748300, "MessageScheduledUntilOnline");
                } else {
                    u10 = gd.a0("MessageScheduledOn", null, 2131748336, gd.u(i7, false));
                }
            } else {
                u10 = gd.u(i7, false);
            }
            this.R0 = i7;
            CharSequence charSequence = this.S0;
            if (charSequence == null || !TextUtils.equals(u10, charSequence)) {
                this.S0 = u10;
                this.f32120s2 = null;
                n0(z11);
            }
        }
    }

    public final void i0(org.telegram.messenger.fj r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.i0(org.telegram.messenger.fj, boolean):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f32130w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f32126u2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f32123t2 || getParent() == null) {
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

    public final void j0(int i7, int i10) {
        this.U0 = i7;
        this.V0 = i10;
    }

    public final void k0(float f10, int i7) {
        this.f32135x0 = true;
        this.f32131w0 = i7;
        this.f32124u0 = f10;
        this.f32127v0 = 0.0f;
    }

    @Override
    public final boolean l() {
        return false;
    }

    public final void l0() {
        if (this.f32072c2 != null && this.d2 && this.Q0 != null) {
            boolean b02 = b0();
            boolean z10 = this.f32081f2;
            if (b02 != z10) {
                this.f32081f2 = !z10;
                final fj fjVar = this.Q0;
                post(new Runnable(this) {
                    public final v0 f31319b;

                    {
                        this.f31319b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var = this.f31319b;
                                fj fjVar2 = v0Var.Q0;
                                fj fjVar3 = fjVar;
                                if (fjVar2 == fjVar3) {
                                    v0Var.i0(fjVar3, true);
                                    v0Var.requestLayout();
                                    return;
                                }
                                return;
                            default:
                                v0 v0Var2 = this.f31319b;
                                fj fjVar4 = v0Var2.Q0;
                                fj fjVar5 = fjVar;
                                if (fjVar4 == fjVar5) {
                                    v0Var2.i0(fjVar5, true);
                                    v0Var2.requestLayout();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = this.f32072c2;
        if (tL_messageActionStarGiftOnchainOffer != null && this.d2 && this.Q0 != null && this.f32122t1 != null) {
            HashMap hashMap = bi.e4.f3543a;
            int i7 = tL_messageActionStarGiftOnchainOffer.expires_at;
            int i10 = this.I;
            int max = Math.max(0, i7 - ConnectionsManager.getInstance(i10).getCurrentTime());
            if (max <= 0) {
                if (this.f32077e2 != 0) {
                    this.f32077e2 = 0;
                    this.d2 = bi.e4.i(i10, this.f32072c2);
                    final fj fjVar2 = this.Q0;
                    post(new Runnable(this) {
                        public final v0 f31319b;

                        {
                            this.f31319b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    v0 v0Var = this.f31319b;
                                    fj fjVar22 = v0Var.Q0;
                                    fj fjVar3 = fjVar2;
                                    if (fjVar22 == fjVar3) {
                                        v0Var.i0(fjVar3, true);
                                        v0Var.requestLayout();
                                        return;
                                    }
                                    return;
                                default:
                                    v0 v0Var2 = this.f31319b;
                                    fj fjVar4 = v0Var2.Q0;
                                    fj fjVar5 = fjVar2;
                                    if (fjVar4 == fjVar5) {
                                        v0Var2.i0(fjVar5, true);
                                        v0Var2.requestLayout();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            if (max != this.f32077e2) {
                this.f32077e2 = max;
                this.f32122t1.a(c0(bi.e4.d(this.f32072c2), this.f32072c2), this.G1, this.f32122t1.d);
            }
            postInvalidateDelayed(1016 - (System.currentTimeMillis() % 1000));
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final void n0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            B(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (!this.D0) {
            if (z10) {
                org.telegram.messenger.g0.g3(new n0(this, 0));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        v();
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        s0 s0Var;
        super.onAttachedToWindow();
        this.f32093j2 = true;
        this.J.P();
        setStarsPaused(false);
        if (this.f32117s && (s0Var = this.f32083g1) != null && !s0Var.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32118s0 = org.telegram.ui.Components.x5.update(0, this, z10, this.f32118s0, this.N);
        t0 t0Var = this.f32122t1;
        if (t0Var != null) {
            t0Var.h = org.telegram.ui.Components.x5.update(0, (View) ((v0) t0Var.f31803i), false, (org.telegram.ui.Components.t5) t0Var.h, (StaticLayout) t0Var.f31801f);
        }
        int i7 = this.I;
        ks.f(i7).c(this, ks.Y2);
        ks.f(i7).c(this, ks.Z2);
        ks.f(i7).c(this, ks.H3);
        ks.f(i7).c(this, ks.f25225y0);
        ks.f(i7).c(this, ks.f25102d4);
        ks.e().c(this, ks.f25148l4);
        ks.e().c(this, ks.L3);
        fj fjVar = this.Q0;
        if (fjVar != null && fjVar.D == 21) {
            i0(fjVar, true);
        }
        di.h6 h6Var = this.I0;
        if (h6Var != null) {
            h6Var.a();
        }
        ch.q0 q0Var = this.F0;
        ArrayList arrayList = q0Var.f5495s;
        q0Var.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.n0) arrayList.get(i10)).a();
        }
        q01 q01Var = this.f32104o0;
        if (q01Var != null) {
            q01Var.a();
        }
        tw0 tw0Var = this.P0;
        if (tw0Var != null) {
            tw0Var.d.R(tw0Var.f40114b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32093j2 = false;
        int i7 = this.I;
        org.telegram.messenger.a6.q(i7).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.x5.release(this, this.f32118s0);
        t0 t0Var = this.f32122t1;
        if (t0Var != null) {
            org.telegram.ui.Components.x5.release((v0) t0Var.f31803i, (org.telegram.ui.Components.t5) t0Var.h);
        }
        ks.f(i7).n(this, ks.Y2);
        ks.f(i7).n(this, ks.Z2);
        ks.f(i7).n(this, ks.H3);
        ks.f(i7).n(this, ks.f25225y0);
        ks.f(i7).n(this, ks.f25102d4);
        ks.e().n(this, ks.f25148l4);
        ks.e().n(this, ks.L3);
        this.f32075e0.g();
        this.f32137x2.f31867a = false;
        di.h6 h6Var = this.I0;
        if (h6Var != null) {
            h6Var.S = false;
            h6Var.d.R();
            h6Var.f8942e.b();
            bi.h1 h1Var = h6Var.f8960y;
            h1Var.d.R();
            org.telegram.ui.Components.x5.release((View) null, h1Var.f3653q);
            h1Var.f3653q = null;
        }
        this.F0.p();
        q01 q01Var = this.f32104o0;
        if (q01Var != null) {
            q01Var.b();
        }
        tw0 tw0Var = this.P0;
        if (tw0Var != null) {
            tw0Var.d.R(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        fj fjVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && fjVar == null) {
            return;
        }
        if (this.f32120s2 == null) {
            if (!TextUtils.isEmpty(this.S0)) {
                charSequence = this.S0;
            } else {
                charSequence = fjVar.v;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.f32120s2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f32120s2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f32120s2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Wallet.l4 l4Var;
        RectF rectF = this.f32107p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.m4 m4Var = this.J0;
        if (m4Var == null) {
            l4Var = null;
        } else {
            l4Var = m4Var.f44537m;
        }
        if (l4Var != null) {
            l4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean q() {
        s0 s0Var = this.f32083g1;
        if (s0Var != null) {
            return s0Var.s0(this, this.f32141z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            n0(false);
        }
    }

    public void setDelegate(s0 s0Var) {
        this.f32083g1 = s0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f32080f1 == z10) {
            return;
        }
        this.f32080f1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f32126u2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.f32130w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f32123t2 = z10;
    }

    public void setMessageObject(fj fjVar) {
        i0(fjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f32096k2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.f32098l2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.F0.f5501z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.f32102n0 != z10) {
            this.f32102n0 = z10;
            U();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.K0 = z10;
        org.telegram.ui.Wallet.m4 m4Var = this.J0;
        if (m4Var != null) {
            m4Var.n(z10);
        }
        ArrayList arrayList = this.f32110q0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f10) {
        setTranslationX((getTranslationX() - this.N0) + f10);
        this.N0 = f10;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && drawable != this.f32113r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final boolean w(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v0.w(android.view.MotionEvent):boolean");
    }

    public final void x() {
        RectF rectF = this.f32074d1;
        this.f32068b1 = (int) Math.min(this.f32068b1, rectF.left);
        this.f32071c1 = (int) Math.max(this.f32071c1, rectF.right);
    }

    public final boolean y(float f10, int i7) {
        ch.q0 q0Var = this.F0;
        if (!q0Var.H) {
            return false;
        }
        float y10 = getY() + q0Var.f5481c;
        if (y10 <= f10 || (y10 + q0Var.f5489m) - org.telegram.messenger.g0.L(16.0f) >= i7) {
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
        int L = this.f32092j1 - org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.f23965k.action;
        int i7 = tL_messageActionGiftCode.months;
        TLRPC.Chat O0 = mp.u1(this.I).O0(Long.valueOf(-org.telegram.messenger.n5.o(tL_messageActionGiftCode.boost_peer)));
        if (O0 == null) {
            str = null;
        } else {
            str = O0.title;
        }
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            M0 = gd.M0(2131753174, "BoostingUnclaimedPrize");
        } else {
            M0 = gd.M0(2131753540, "BoostingCongratulations");
        }
        if (i7 == 12) {
            G = gd.G(1, "BoldYears", new Object[0]);
        } else {
            G = gd.G(i7, "BoldMonths", new Object[0]);
        }
        if (z10) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753164, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.f3.p(null, null, 2131753173, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753305, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.f3.p(null, null, 2131753306, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a02 = gd.M0(2131753308, null);
            } else {
                a02 = gd.a0("BoostingReceivedGiftFrom", null, 2131753309, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(a02));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.f3.p(null, null, 2131753310, new Object[]{G}, spannableStringBuilder);
        }
        String M02 = gd.M0(2131753307, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new i41(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f32095k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.f32099m1 = null;
        t0 t0Var = this.f32122t1;
        if (t0Var != null) {
            org.telegram.ui.Components.x5.release((v0) t0Var.f31803i, (org.telegram.ui.Components.t5) t0Var.h);
        }
        t0 t0Var2 = new t0(this);
        this.f32122t1 = t0Var2;
        t0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M02);
        valueOf2.setSpan(new i41(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.f32108p1 = false;
        this.f32111q1 = 0;
        this.f32136x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.f32140y1 = staticLayout;
        this.f32142z1 = true;
        this.E1 = a0(staticLayout);
    }

    public v0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f32101n = new mc(this);
        int i7 = j10.f24770t0;
        this.I = i7;
        fi.e7 e7Var = new fi.e7(null, false);
        this.f32075e0 = e7Var;
        this.f32102n0 = true;
        this.f32107p0 = new RectF();
        this.f32110q0 = new ArrayList();
        this.f32114r0 = new Stack();
        this.F0 = new ch.q0(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f32065a1 = new Path();
        this.f32074d1 = new RectF();
        this.f32076e1 = true;
        this.f32080f1 = false;
        this.f32105o1 = false;
        this.f32108p1 = false;
        this.f32115r1 = new org.telegram.ui.Components.c6(this, 0L, 320L, lr.h);
        this.f32142z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new ea(this, 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.f32069b2 = -1;
        this.f32077e2 = -1;
        this.f32090i2 = new Paint(1);
        this.f32100m2 = new Path();
        this.f32103n2 = new float[8];
        this.f32106o2 = new float[8];
        this.f32109p2 = new Path();
        this.f32112q2 = new int[]{16842910, 16842919};
        this.f32137x2 = new u0(this);
        e7Var.f11889a = false;
        this.f32117s = z10;
        this.f32086h1 = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.f24122u / 2);
        this.M = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f32134x = org.telegram.messenger.a6.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.t1 t1Var = new ug.t1(10);
        this.W1 = t1Var;
        t1Var.O = 100;
        t1Var.J = false;
        t1Var.M = true;
        t1Var.G = false;
        t1Var.K = true;
        t1Var.H = true;
        t1Var.f58908r = 1;
        t1Var.f58912w = 0.98f;
        t1Var.v = 0.98f;
        t1Var.f58911u = 0.98f;
        t1Var.f58898g = false;
        t1Var.f58905o = 0.0f;
        t1Var.f58913x = 750L;
        t1Var.f58914y = 750;
        t1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.f32130w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f32123t2 || getParent() == null) {
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
        View view = this.f32130w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f32123t2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void C(boolean z10) {
    }

    @Override
    public final void c(boolean z10, boolean z11) {
    }

    @Override
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
