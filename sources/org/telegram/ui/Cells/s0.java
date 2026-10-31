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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.x41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dk;
import org.telegram.ui.eg;
import org.telegram.ui.km;
import org.telegram.ui.lg;
import org.telegram.ui.ns0;
public class s0 extends z implements org.telegram.messenger.z5, us, r4 {
    public static final HashMap f22890s2;
    public float A0;
    public StaticLayout A1;
    public float B0;
    public float B1;
    public boolean C0;
    public StaticLayout C1;
    public nh.i D;
    public boolean D0;
    public float D1;
    public boolean E;
    public final sg.p0 E0;
    public final TextPaint E1;
    public boolean F;
    public float F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public final int H;
    public rh.g4 H0;
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
    public final org.telegram.ui.Components.r8 L;
    public float L0;
    public boolean L1;
    public StaticLayout M;
    public float M0;
    public RectF M1;
    public int N;
    public final RectF N0;
    public final ca N1;
    public int O;
    public nx0 O0;
    public boolean O1;
    public StaticLayout P;
    public jj P0;
    public ColorMatrixColorFilter P1;
    public int Q;
    public int Q0;
    public CornerPathEffect Q1;
    public int R;
    public CharSequence R0;
    public Path R1;
    public int S;
    public ph.z0 S0;
    public qz0 S1;
    public int T;
    public int T0;
    public final View T1;
    public int U;
    public int U0;
    public final Path U1;
    public int V;
    public Paint V0;
    public final kg.f2 V1;
    public boolean W;
    public TextPaint W0;
    public int W1;
    public final ArrayList X0;
    public final ArrayList X1;
    public final ArrayList Y0;
    public c5.x Y1;
    public final Path Z0;
    public boolean Z1;
    public boolean f22891a0;
    public int f22892a1;
    public int a2;
    public RadialProgressView f22893b0;
    public int f22894b1;
    public float f22895b2;
    public float f22896c0;
    public final RectF f22897c1;
    public final Paint f22898c2;
    public final th.t5 f22899d0;
    public boolean f22900d1;
    public boolean f22901d2;
    public boolean f22902e0;
    public boolean f22903e1;
    public View.OnClickListener f22904e2;
    public int f22905f;
    public boolean f22906f0;
    public q0 f22907f1;
    public int f22908f2;
    public boolean f22909g0;
    public final org.telegram.ui.ActionBar.p6 f22910g1;
    public final Path f22911g2;
    public int h;
    public boolean f22912h0;
    public int f22913h1;
    public final float[] f22914h2;
    public boolean f22915i0;
    public int f22916i1;
    public final float[] f22917i2;
    public int f22918j0;
    public StaticLayout f22919j1;
    public final Path f22920j2;
    public boolean f22921k0;
    public Paint f22922k1;
    public final int[] f22923k2;
    public int f22924l0;
    public qz0 l1;
    public int f22925l2;
    public boolean m0;
    public StaticLayout f22926m1;
    public SpannableStringBuilder f22927m2;
    public final dc f22928n;
    public l11 f22929n0;
    public boolean f22930n1;
    public boolean f22931n2;
    public final RectF f22932o0;
    public boolean f22933o1;
    public Runnable f22934o2;
    public final ArrayList f22935p0;
    public int f22936p1;
    public PorterDuffColorFilter f22937p2;
    public final Stack f22938q0;
    public final org.telegram.ui.Components.t5 f22939q1;
    public int f22940q2;
    public t80 f22941r;
    public org.telegram.ui.Components.k5 f22942r0;
    public li.k f22943r1;
    public final r0 f22944r2;
    public final boolean f22945s;
    public TextPaint f22946s0;
    public kg.o f22947s1;
    public float f22948t0;
    public int f22949t1;
    public float f22950u0;
    public int f22951u1;
    public int f22952v0;
    public int f22953v1;
    public View f22954w;
    public boolean f22955w0;
    public qz0 f22956w1;
    public final int f22957x;
    public ic f22958x0;
    public StaticLayout f22959x1;
    public URLSpan f22960y;
    public float f22961y0;
    public boolean f22962y1;
    public float f22963z0;
    public TextPaint f22964z1;

    static {
        HashMap hashMap = new HashMap();
        f22890s2 = hashMap;
        c3.i0.w(1, hashMap, "1⃣", 3, "2⃣");
        c3.i0.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public s0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder G(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.I2(str, false, org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(1.3f), 0.8f, 2131231195));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new t2(org.telegram.messenger.i0.L(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.w.j();
            spannableStringBuilder.setSpan(android.support.v4.media.session.w.g(org.telegram.messenger.i0.L(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static float Z(StaticLayout staticLayout) {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f7) {
                f7 = ceil;
            }
        }
        return f7;
    }

    private float getWalletActionTop() {
        return org.telegram.messenger.i0.L(11.0f) + this.S + this.O;
    }

    private void setStarsPaused(boolean z10) {
        kg.f2 f2Var = this.V1;
        if (z10 == f2Var.f11072g) {
            return;
        }
        f2Var.f11072g = z10;
        if (z10) {
            f2Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < f2Var.f11078n.size(); i10++) {
            kg.e2 e2Var = (kg.e2) f2Var.f11078n.get(i10);
            e2Var.f11044a = (System.currentTimeMillis() - f2Var.R) + e2Var.f11044a;
        }
        invalidate();
    }

    public final boolean A(float f7, int i10) {
        sg.p0 p0Var = this.E0;
        if (!p0Var.H) {
            return false;
        }
        float y3 = getY() + p0Var.f48440c;
        if (y3 <= f7 || (y3 + p0Var.f48447m) - org.telegram.messenger.i0.L(16.0f) >= i10) {
            return false;
        }
        return true;
    }

    public final void B() {
        String str;
        String L0;
        String G;
        SpannableStringBuilder spannableStringBuilder;
        String a02;
        int L = this.f22916i1 - org.telegram.messenger.i0.L(16.0f);
        TextPaint textPaint = this.E1;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        TextPaint textPaint2 = this.F1;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.P0.f16337k.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat L02 = vp.r1(this.H).L0(Long.valueOf(-org.telegram.messenger.o5.o(tL_messageActionGiftCode.boost_peer)));
        if (L02 == null) {
            str = null;
        } else {
            str = L02.title;
        }
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            L0 = cd.L0(2131753176, "BoostingUnclaimedPrize");
        } else {
            L0 = cd.L0(2131753542, "BoostingCongratulations");
        }
        if (i10 == 12) {
            G = cd.G(1, "BoldYears", new Object[0]);
        } else {
            G = cd.G(i10, "BoldMonths", new Object[0]);
        }
        if (z10) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753166, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.m5.p(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753307, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.m5.p(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a02 = cd.L0(2131753310, null);
            } else {
                a02 = cd.a0("BoostingReceivedGiftFrom", null, 2131753311, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(a02));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.m5.p(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        }
        String L03 = cd.L0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
        valueOf.setSpan(new x41(org.telegram.messenger.i0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f22919j1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.f22926m1 = null;
        this.l1 = null;
        kg.o oVar = this.f22947s1;
        if (oVar != null) {
            org.telegram.ui.Components.o5.release((s0) oVar.f11207i, (org.telegram.ui.Components.k5) oVar.h);
        }
        kg.o oVar2 = new kg.o(this);
        this.f22947s1 = oVar2;
        oVar2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(L03);
        valueOf2.setSpan(new x41(org.telegram.messenger.i0.o()), 0, valueOf2.length(), 33);
        this.f22933o1 = false;
        this.f22936p1 = 0;
        this.f22956w1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.f22959x1 = staticLayout;
        this.f22962y1 = true;
        this.D1 = Z(staticLayout);
    }

    public final void D(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        int a2;
        CharSequence charSequence4 = charSequence2;
        int L = i11 - org.telegram.messenger.i0.L(16.0f);
        jj jjVar = this.P0;
        if (jjVar != null && jjVar.D == 30) {
            L -= org.telegram.messenger.i0.L(16.0f);
        }
        int i13 = L;
        if (charSequence != null) {
            jj jjVar2 = this.P0;
            TextPaint textPaint = this.E1;
            if (jjVar2 != null && jjVar2.D == 30) {
                textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new x41(org.telegram.messenger.i0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f22919j1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f22919j1 = null;
        }
        this.f22926m1 = null;
        if (spannableStringBuilder != null) {
            qz0 qz0Var = new qz0(spannableStringBuilder, 10.0f, null);
            this.l1 = qz0Var;
            qz0Var.f29772a.linkColor = -1;
        } else {
            this.l1 = null;
        }
        jj jjVar3 = this.P0;
        TextPaint textPaint2 = this.F1;
        if (jjVar3 != null && jjVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.i0.L(14.3f));
        } else if (jjVar3 != null && (X() || (i12 = this.P0.D) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        }
        int L2 = i13 - org.telegram.messenger.i0.L(12.0f);
        jj jjVar4 = this.P0;
        if (jjVar4 != null && jjVar4.D == 22 && jj.B0(jjVar4.f16337k) >= 0 && (a2 = vh.p2.a(charSequence4, textPaint2)) < L2 && a2 > L2 / 5.0f) {
            L2 = a2;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            kg.o oVar = this.f22947s1;
            if (oVar != null) {
                org.telegram.ui.Components.o5.release((s0) oVar.f11207i, (org.telegram.ui.Components.k5) oVar.h);
                this.f22947s1 = null;
            }
            this.f22933o1 = r42;
        } else {
            if (this.f22947s1 == null) {
                this.f22947s1 = new kg.o(this);
            }
            try {
                charSequence4 = org.telegram.messenger.k6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.f22947s1.a(charSequence4, textPaint2, L2);
            if (z10 && ((StaticLayout) this.f22947s1.f11205f).getLineCount() > 3) {
                this.f22933o1 = !this.f22930n1;
                this.f22936p1 = ((StaticLayout) this.f22947s1.f11205f).getLineBottom(2);
                this.f22956w1 = new qz0(cd.L0(2131750274, null), textPaint2.getTextSize() / org.telegram.messenger.i0.f16025p, org.telegram.messenger.i0.o());
                int lineBottom = ((StaticLayout) this.f22947s1.f11205f).getLineBottom(2);
                this.f22951u1 = lineBottom;
                this.f22953v1 = lineBottom - ((StaticLayout) this.f22947s1.f11205f).getLineTop(2);
                this.f22949t1 = (int) ((StaticLayout) this.f22947s1.f11205f).getLineRight(2);
            } else {
                this.f22933o1 = r42;
                this.f22939q1.f(true, true);
                this.f22936p1 = r42;
            }
            if (this.f22933o1) {
                int lineEnd = ((StaticLayout) this.f22947s1.f11205f).getLineEnd(2) - 1;
                kg.o oVar2 = this.f22947s1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                oVar2.a(charSequence4, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new x41(org.telegram.messenger.i0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) P("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f22959x1 = staticLayout;
            if (!z11 || this.f22933o1) {
                z12 = r42;
            }
            this.f22962y1 = z12;
            this.D1 = Z(staticLayout);
        } else {
            this.f22959x1 = null;
            this.f22962y1 = r42;
            this.D1 = 0.0f;
        }
        if (str != null) {
            if (this.Q1 == null) {
                this.Q1 = new CornerPathEffect(org.telegram.messenger.i0.L(5.0f));
            }
            if (this.R1 == null) {
                Path path = new Path();
                this.R1 = path;
                ph.f1.d(path, 1.35f, r42);
            }
            qz0 qz0Var2 = new qz0(str, i10, org.telegram.messenger.i0.o());
            this.S1 = qz0Var2;
            qz0Var2.f29784p = org.telegram.messenger.i0.L(62.0f);
            return;
        }
        this.R1 = null;
        this.S1 = null;
    }

    public final void F(int i10, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z10;
        int width;
        q0 q0Var;
        TLRPC.Message message;
        jj jjVar;
        int i11;
        float f7;
        int L = i10 - org.telegram.messenger.i0.L(30.0f);
        if (this.f22915i0) {
            L -= org.telegram.messenger.i0.L(64.0f);
        }
        if (W()) {
            if (this.f22915i0) {
                f7 = 28.0f;
            } else {
                f7 = 82.0f;
            }
            L = Math.min(L - org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(272.0f));
        }
        if (L >= 0) {
            int i12 = this.f22908f2;
            if (i12 > 0) {
                L = Math.min(i12, L);
            }
            int i13 = L;
            this.f22900d1 = true;
            if (!W() && ((jjVar = this.P0) == null || ((i11 = jjVar.D) != 34 && i11 != 35))) {
                if (jjVar != null && jjVar.f16362q2) {
                    textPaint = (TextPaint) P("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) P("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) P("paintChatActionText3");
            }
            textPaint.linkColor = textPaint.getColor();
            if (W()) {
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    for (org.telegram.messenger.h6 h6Var : (org.telegram.messenger.h6[]) spannable.getSpans(0, spannable.length(), org.telegram.messenger.h6.class)) {
                        spannable.removeSpan(h6Var);
                    }
                }
                charSequence2 = org.telegram.messenger.k6.n(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
            } else {
                charSequence2 = charSequence;
            }
            if (W()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            TextPaint textPaint2 = textPaint;
            CharSequence charSequence3 = charSequence2;
            this.M = new StaticLayout(charSequence2, textPaint2, i13, alignment2, 1.0f, 0.0f, false);
            this.P = null;
            jj jjVar2 = this.P0;
            if (jjVar2 != null && (message = jjVar2.f16337k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.P = new StaticLayout(org.telegram.messenger.k6.n(org.telegram.messenger.i0.W2(cd.L0(2131744392, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f22945s && (q0Var = this.f22907f1) != null && !q0Var.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f22942r0 = org.telegram.ui.Components.o5.update(0, this, z10, this.f22942r0, this.M);
            this.O = 0;
            this.N = 0;
            this.Q = 0;
            StaticLayout staticLayout = this.P;
            if (staticLayout != null) {
                int height = staticLayout.getHeight();
                this.Q = height;
                this.Q = org.telegram.messenger.i0.L(12.0f) + height;
            }
            jj jjVar3 = this.P0;
            if (jjVar3 == null || !jjVar3.f16328h2) {
                try {
                    int lineCount = this.M.getLineCount();
                    for (int i14 = 0; i14 < lineCount; i14++) {
                        try {
                            float lineWidth = this.M.getLineWidth(i14);
                            float f10 = i13;
                            if (lineWidth > f10) {
                                lineWidth = f10;
                            }
                            this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i14)));
                            this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
            this.R = (i10 - this.N) / 2;
            int L2 = org.telegram.messenger.i0.L(7.0f);
            this.S = L2;
            if (this.P != null) {
                this.S = org.telegram.messenger.m5.C(11.0f, this.Q, L2);
            }
            if (W()) {
                width = this.N;
            } else {
                width = this.M.getWidth();
            }
            this.T = (i10 - width) / 2;
            this.U = (i10 - i13) / 2;
            Stack stack = this.f22938q0;
            ArrayList arrayList = this.f22935p0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout2 = this.M;
                int i15 = this.R;
                nh.i.a(this, staticLayout2, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void H(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.p6 p6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        s0 s0Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        float f13;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        int i12;
        kg.o oVar;
        int i13;
        float L;
        org.telegram.ui.Wallet.d4 d4Var;
        int L2;
        int lineCount;
        RectF rectF;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        float f17;
        int i17;
        int i18;
        int i19;
        Paint paint5;
        int i20;
        int i21;
        float f18;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        int i22;
        int i23;
        int i24;
        s0 s0Var2 = this;
        if (!s0Var2.f22945s || ((!s0Var2.R() || z10) && (s0Var2.R() || !z10))) {
            Paint P = s0Var2.P("paintChatActionBackground");
            Paint P2 = s0Var2.P("paintChatActionBackgroundDarken");
            s0Var2.f22946s0 = (TextPaint) s0Var2.P("paintChatActionText");
            int i25 = s0Var2.T0;
            org.telegram.ui.ActionBar.p6 p6Var4 = s0Var2.f22910g1;
            if (i25 >= 0) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(i25, p6Var4);
                if (s0Var2.V0 == null) {
                    Paint paint6 = new Paint(1);
                    s0Var2.V0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    s0Var2.W0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.i0.o());
                    s0Var2.W0.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
                    s0Var2.W0.setColor(org.telegram.ui.ActionBar.t6.w0(s0Var2.U0, p6Var4));
                }
                P = s0Var2.V0;
                s0Var2.f22946s0 = s0Var2.W0;
            }
            boolean z11 = s0Var2.f22900d1;
            Path path = s0Var2.Z0;
            if (z11) {
                s0Var2.f22900d1 = false;
                s0Var2.f22892a1 = s0Var2.getWidth();
                s0Var2.f22894b1 = 0;
                ArrayList arrayList3 = s0Var2.X0;
                arrayList3.clear();
                StaticLayout staticLayout = s0Var2.M;
                if (staticLayout == null) {
                    lineCount = 0;
                } else {
                    lineCount = staticLayout.getLineCount();
                }
                int L3 = org.telegram.messenger.i0.L(11.0f);
                f10 = 6.0f;
                int L4 = org.telegram.messenger.i0.L(8.0f);
                f7 = 8.0f;
                int i26 = 0;
                int i27 = 0;
                while (i26 < lineCount) {
                    int ceil = (int) Math.ceil(s0Var2.M.getLineWidth(i26));
                    if (i26 != 0 && (i24 = i27 - ceil) > 0 && i24 <= (L3 * 1.5f) + L4) {
                        ceil = i27;
                    }
                    i26 = c3.i0.j(ceil, i26, 1, arrayList3);
                    i27 = ceil;
                }
                f11 = 4.0f;
                f12 = 2.0f;
                for (int i28 = lineCount - 2; i28 >= 0; i28--) {
                    int intValue = ((Integer) arrayList3.get(i28)).intValue();
                    int i29 = i27 - intValue;
                    if (i29 <= 0 || i29 > (L3 * 1.5f) + L4) {
                        i27 = intValue;
                    }
                    arrayList3.set(i28, Integer.valueOf(i27));
                }
                int L5 = org.telegram.messenger.i0.L(4.0f);
                int measuredWidth = s0Var2.getMeasuredWidth() / 2;
                int L6 = org.telegram.messenger.i0.L(3.0f);
                int L7 = org.telegram.messenger.i0.L(6.0f);
                int i30 = L3 - L6;
                ArrayList arrayList4 = s0Var2.Y0;
                arrayList4.clear();
                path.reset();
                float f19 = measuredWidth;
                path.moveTo(f19, L5);
                int i31 = i27;
                int i32 = 0;
                int i33 = 0;
                while (true) {
                    rectF = s0Var2.f22897c1;
                    if (i33 >= lineCount) {
                        break;
                    }
                    int i34 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i33)).intValue();
                    int lineBottom = s0Var2.M.getLineBottom(i33);
                    int i35 = i34 - 1;
                    if (i33 < i35) {
                        paint5 = P2;
                        i20 = ((Integer) arrayList3.get(i33 + 1)).intValue();
                    } else {
                        paint5 = P2;
                        i20 = 0;
                    }
                    int i36 = lineBottom - i32;
                    if (i33 == 0 || intValue2 > i31) {
                        i36 = org.telegram.messenger.i0.L(3.0f) + i36;
                    }
                    if (i33 == i35 || intValue2 > i20) {
                        i36 = org.telegram.messenger.i0.L(3.0f) + i36;
                    }
                    Paint paint7 = P;
                    float f20 = (intValue2 / 2.0f) + f19;
                    if (i33 != i35 && intValue2 < i20 && i33 != 0 && intValue2 < i31) {
                        i21 = L7;
                    } else {
                        i21 = L4;
                    }
                    if (i33 == 0 || intValue2 > i31) {
                        f18 = f20;
                        arrayList2 = arrayList3;
                        p6Var3 = p6Var4;
                        rectF.set((f18 - L6) - L3, L5, f18 + i30, (L3 * 2) + L5);
                        z();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f18 = f20;
                        if (intValue2 < i31) {
                            float f21 = f18 + i30;
                            p6Var3 = p6Var4;
                            arrayList2 = arrayList3;
                            rectF.set(f21, L5, (i21 * 2) + f21, i23 + L5);
                            z();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            p6Var3 = p6Var4;
                        }
                    }
                    L5 += i36;
                    if (i33 != i35 && intValue2 < i20) {
                        L5 -= org.telegram.messenger.i0.L(3.0f);
                        i36 -= org.telegram.messenger.i0.L(3.0f);
                    }
                    if (i33 != 0 && intValue2 < i31) {
                        L5 -= org.telegram.messenger.i0.L(3.0f);
                        i36 -= org.telegram.messenger.i0.L(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i36));
                    if (i33 != i35 && intValue2 <= i20) {
                        if (intValue2 < i20) {
                            float f22 = f18 + i30;
                            rectF.set(f22, L5 - i22, (i21 * 2) + f22, L5);
                            z();
                            path.arcTo(rectF, 180.0f, -90.0f);
                        }
                    } else {
                        rectF.set((f18 - L6) - L3, L5 - (L3 * 2), f18 + i30, L5);
                        z();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    }
                    i33++;
                    s0Var2 = this;
                    i31 = intValue2;
                    i32 = lineBottom;
                    lineCount = i34;
                    P2 = paint5;
                    P = paint7;
                    p6Var4 = p6Var3;
                    arrayList3 = arrayList2;
                }
                paint = P;
                paint2 = P2;
                ArrayList arrayList5 = arrayList3;
                p6Var = p6Var4;
                int i37 = lineCount - 1;
                for (int i38 = i37; i38 >= 0; i38--) {
                    if (i38 != 0) {
                        arrayList = arrayList5;
                        i14 = ((Integer) arrayList.get(i38 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i14 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i38)).intValue();
                    if (i38 != i37) {
                        i15 = ((Integer) arrayList.get(i38 + 1)).intValue();
                    } else {
                        i15 = 0;
                    }
                    this.M.getLineBottom(i38);
                    float f23 = measuredWidth - (intValue3 / 2);
                    if (i38 != i37 && intValue3 < i15 && i38 != 0 && intValue3 < i14) {
                        i16 = L7;
                    } else {
                        i16 = L4;
                    }
                    if (i38 == i37 || intValue3 > i15) {
                        arrayList5 = arrayList;
                        f17 = f23;
                        i17 = i16;
                        rectF.set(f17 - i30, L5 - (L3 * 2), f17 + L6 + L3, L5);
                        z();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < i15) {
                        float f24 = f23 - i30;
                        arrayList5 = arrayList;
                        f17 = f23;
                        i17 = i16;
                        rectF.set(f24 - (i16 * 2), L5 - i19, f24, L5);
                        z();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f17 = f23;
                        i17 = i16;
                    }
                    L5 -= ((Integer) arrayList4.get(i38)).intValue();
                    if (i38 != 0 && intValue3 <= i14) {
                        if (intValue3 < i14) {
                            float f25 = f17 - i30;
                            rectF.set(f25 - (i17 * 2), L5, f25, i18 + L5);
                            z();
                            path.arcTo(rectF, 0.0f, -90.0f);
                        }
                    } else {
                        rectF.set(f17 - i30, L5, f17 + L6 + L3, (L3 * 2) + L5);
                        z();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    }
                }
                s0Var = this;
                path.close();
                if (s0Var.W() && !s0Var.X()) {
                    rectF.left = (f19 - (s0Var.N / 2.0f)) - org.telegram.messenger.i0.L(17.0f);
                    rectF.top = L5;
                    rectF.right = (s0Var.N / 2.0f) + f19 + org.telegram.messenger.i0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.i0.L(28.0f) + L5 + s0Var.O + s0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = P;
                paint2 = P2;
                p6Var = p6Var4;
                f7 = 8.0f;
                f10 = 6.0f;
                f11 = 4.0f;
                f12 = 2.0f;
                s0Var = s0Var2;
            }
            if (!s0Var.f22955w0) {
                s0Var.f22952v0 = ((ViewGroup) s0Var.getParent()).getMeasuredHeight();
            }
            if (p6Var != null) {
                p6Var2 = p6Var;
                p6Var2.b(s0Var.f22950u0, s0Var.f22948t0 + org.telegram.messenger.i0.L(f11), s0Var.getMeasuredWidth(), s0Var.f22952v0);
            } else {
                p6Var2 = p6Var;
                org.telegram.ui.ActionBar.t6.r(s0Var.f22950u0, s0Var.f22948t0 + org.telegram.messenger.i0.L(f11), s0Var.getMeasuredWidth(), s0Var.f22952v0);
            }
            boolean z12 = s0Var instanceof dk;
            if (z12 && !org.telegram.ui.ActionBar.t6.i1(p6Var2)) {
                f13 = 0.75f;
            } else {
                f13 = 1.0f;
            }
            if (!z10 || (s0Var.getAlpha() == 1.0f && !z12)) {
                paint3 = paint2;
                paint4 = paint;
                if (z12) {
                    i10 = paint4.getAlpha();
                    i11 = paint3.getAlpha();
                    paint4.setAlpha((int) (i10 * f13));
                    paint3.setAlpha((int) (i11 * f13));
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                paint4 = paint;
                paint4.setAlpha((int) (s0Var.getAlpha() * i10 * f13));
                paint3 = paint2;
                paint3.setAlpha((int) (s0Var.getAlpha() * i11 * f13));
            }
            jj jjVar = s0Var.P0;
            Paint paint8 = s0Var.f22898c2;
            if (jjVar == null || !jjVar.f16328h2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (s0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (s0Var.f22895b2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (s0Var.getAlpha() * alpha));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha);
                }
            } else {
                canvas2 = canvas;
            }
            if (s0Var.T()) {
                int width = s0Var.getWidth();
                s0Var.I0.getClass();
                float L8 = (width - org.telegram.messenger.i0.L(206.0f)) / f12;
                float walletActionTop = s0Var.getWalletActionTop();
                s0Var.I0.getClass();
                float L9 = org.telegram.messenger.i0.L(206.0f) + L8;
                if (s0Var.I0.f34406q0 == null) {
                    L2 = org.telegram.messenger.i0.L(140.0f);
                    f14 = 140.0f;
                    f15 = 20.0f;
                } else {
                    f14 = 140.0f;
                    f15 = 20.0f;
                    L2 = org.telegram.messenger.i0.L(150.0f) + ((int) Math.ceil(d4Var.f34406q0.i()));
                }
                RectF rectF2 = s0Var.N0;
                rectF2.set(L8, walletActionTop, L9, L2 + walletActionTop);
                canvas2.save();
                s0Var.I0.c(canvas2, L8, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint4);
                if (s0Var.R() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint3);
                }
                f16 = 0.0f;
                if (s0Var.f22895b2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (s0Var.getAlpha() * alpha2));
                    }
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint8);
                    paint8.setAlpha(alpha2);
                }
                canvas2.restore();
            } else {
                f14 = 140.0f;
                f15 = 20.0f;
                f16 = 0.0f;
            }
            jj jjVar2 = s0Var.P0;
            if (s0Var.S()) {
                float L10 = s0Var.H0.T.f7031f + org.telegram.messenger.i0.L(f7);
                float width2 = (s0Var.getWidth() - L10) / f12;
                if (s0Var.H0.f46965p) {
                    L = f16;
                } else {
                    L = org.telegram.messenger.i0.L(12.0f) + s0Var.S + s0Var.O;
                }
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(width2, L, L10 + width2, s0Var.H0.P + L + org.telegram.messenger.i0.L(f7));
                if (s0Var.M1 == null) {
                    s0Var.M1 = new RectF();
                }
                s0Var.M1.set(rectF3);
                canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint4);
                if (s0Var.R()) {
                    canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint3);
                }
            } else if (s0Var.O0 != null) {
                float L11 = org.telegram.messenger.i0.L(174.0f);
                nx0 nx0Var = s0Var.O0;
                nx0Var.getClass();
                int L12 = org.telegram.messenger.i0.L(f14) + ((int) nx0Var.f28907f.i());
                if (nx0Var.f28909i) {
                    i13 = org.telegram.messenger.i0.L(40.0f);
                } else {
                    i13 = 0;
                }
                float f26 = L12 + i13;
                float width3 = (s0Var.getWidth() - L11) / f12;
                if (s0Var.M1 == null) {
                    s0Var.M1 = new RectF();
                }
                s0Var.M1.set(width3, org.telegram.messenger.i0.L(f11), L11 + width3, org.telegram.messenger.i0.L(f11) + f26);
                canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint4);
                if (s0Var.R()) {
                    canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), paint3);
                }
            } else if (s0Var.V(jjVar2)) {
                float width4 = (s0Var.getWidth() - s0Var.f22916i1) / f12;
                float f27 = s0Var.S + s0Var.O;
                if (s0Var.X()) {
                    float L13 = f27 + org.telegram.messenger.i0.L(f11);
                    org.telegram.messenger.i0.P.set(width4, L13, s0Var.f22916i1 + width4, s0Var.f22905f + L13);
                } else {
                    float L14 = f27 + org.telegram.messenger.i0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    float f28 = s0Var.f22916i1;
                    rectF4.set(width4, L14, width4 + f28, f28 + L14 + s0Var.K1);
                }
                if (jjVar2 != null && jjVar2.D == 18 && !s0Var.f22933o1 && (oVar = s0Var.f22947s1) != null && s0Var.f22936p1 > 0) {
                    RectF rectF5 = org.telegram.messenger.i0.P;
                    rectF5.bottom = sc.e.z(1.0f, s0Var.f22939q1.f30445c, ((StaticLayout) oVar.f11205f).getHeight() - s0Var.f22936p1, rectF5.bottom);
                }
                if (s0Var.M1 == null) {
                    s0Var.M1 = new RectF();
                }
                s0Var.M1.set(org.telegram.messenger.i0.P);
                if (jjVar2 != null && (((i12 = jjVar2.D) == 33 || i12 == 35) && s0Var.Y1 != null)) {
                    float[] fArr = s0Var.f22914h2;
                    Arrays.fill(fArr, org.telegram.messenger.i0.L(16.0f));
                    float L15 = org.telegram.messenger.i0.L(f10);
                    fArr[7] = L15;
                    fArr[6] = L15;
                    fArr[5] = L15;
                    fArr[4] = L15;
                    Path path2 = s0Var.f22911g2;
                    path2.rewind();
                    path2.addRoundRect(s0Var.M1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (s0Var.R()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint4);
                    if (s0Var.R()) {
                        canvas2.drawRoundRect(s0Var.M1, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(f15), paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public final void I(Canvas canvas) {
        ColorFilter colorFilter;
        float f7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float L;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.f22918j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.k5 k5Var = this.f22942r0;
        if (staticLayout != null) {
            colorFilter = N(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, staticLayout, k5Var, 0.0f, this.f22935p0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f13 = 4.0f;
        if (S()) {
            canvas2.save();
            rh.g4 g4Var = this.H0;
            float width = (getWidth() - g4Var.T.f7031f) / 2.0f;
            if (g4Var.f46965p) {
                L = org.telegram.messenger.i0.L(4.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f) + this.S + this.O;
            }
            canvas2.translate(width, L);
            this.H0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        l11 l11Var = this.f22929n0;
        org.telegram.ui.ActionBar.p6 p6Var = this.f22910g1;
        if (l11Var != null) {
            float alpha = getAlpha();
            if (p6Var != null) {
                p6Var.b(this.f22950u0, this.f22948t0 + 0.0f, getMeasuredWidth(), this.f22952v0);
            } else {
                org.telegram.ui.ActionBar.t6.r(this.f22950u0, this.f22948t0 + 0.0f, getMeasuredWidth(), this.f22952v0);
            }
            this.f22929n0.c(canvas, getWidth(), this.f22918j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.X1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (p6Var != null) {
                p6Var.b(this.f22950u0, this.f22948t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.f22952v0);
            } else {
                org.telegram.ui.ActionBar.t6.r(this.f22950u0, this.f22948t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.f22952v0);
            }
            float width2 = (getWidth() - this.f22916i1) / 2.0f;
            float L2 = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(4.0f) + this.S + this.O + this.f22905f;
            float L3 = (this.f22916i1 - org.telegram.messenger.i0.L(4.0f)) / 2.0f;
            int i13 = 0;
            while (i13 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i13);
                float a2 = c0Var.a();
                float L4 = ((org.telegram.messenger.i0.L(f13) + L3) * i13) + width2;
                float f14 = L4 + L3;
                RectF rectF = this.f22897c1;
                rectF.set(L4, L2, f14, c0Var.f21756f + L2);
                canvas2.save();
                if (a2 != 1.0f) {
                    f7 = f13;
                    canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
                } else {
                    f7 = f13;
                }
                float[] fArr = this.f22917i2;
                Arrays.fill(fArr, org.telegram.messenger.i0.L(Math.min(6.75f, tz.Y0)));
                if ((c0Var.f21757g & 9) == 9) {
                    float L5 = org.telegram.messenger.i0.L(tz.Y0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((c0Var.f21757g & 10) == 10) {
                    float L6 = org.telegram.messenger.i0.L(tz.Y0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.f22920j2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, P("paintChatActionBackground"));
                if (R()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.t6.f20998h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                y yVar = c0Var.f21768s;
                if (yVar != null) {
                    int i14 = (int) L2;
                    yVar.setBounds((int) L4, i14, (int) f14, c0Var.f21756f + i14);
                    c0Var.f21768s.setAlpha(255);
                    c0Var.f21768s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (c0Var.f21769t != null) {
                    i10 = org.telegram.messenger.i0.L(26.0f);
                } else {
                    i10 = 0;
                }
                float k10 = c0Var.h.k();
                if (c0Var.f21769t != null) {
                    i11 = org.telegram.messenger.i0.L(f7);
                } else {
                    i11 = 0;
                }
                float f15 = i10;
                float B = c3.i0.B(L3 - (k10 + i11), f15, f12, L4);
                Drawable drawable = c0Var.f21769t;
                if (drawable != null) {
                    int i15 = (int) B;
                    f10 = f12;
                    drawable.setBounds(i15, (int) (((c0Var.f21756f - org.telegram.messenger.i0.L(24.0f)) / f12) + L2), org.telegram.messenger.i0.L(24.0f) + i15, org.telegram.messenger.i0.L(24.0f) + ((int) (((c0Var.f21756f - org.telegram.messenger.i0.L(24.0f)) / f10) + L2)));
                    Drawable drawable2 = c0Var.f21769t;
                    if (c0Var.f21762m) {
                        i12 = 128;
                    } else {
                        i12 = 255;
                    }
                    drawable2.setAlpha(i12);
                    c0Var.f21769t.draw(canvas2);
                    B += f15;
                } else {
                    f10 = f12;
                }
                c0Var.h.f29784p = Math.max(1, (((int) L3) - org.telegram.messenger.i0.L(15.0f)) - i10);
                qz0 qz0Var = c0Var.h;
                float L7 = (org.telegram.messenger.i0.L(40.0f) / f10) + L2;
                if (c0Var.f21762m) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                qz0Var.f(canvas2, B, L7, f11);
                canvas2.restore();
                canvas2.restore();
                i13++;
                f13 = f7;
                f12 = f10;
            }
        }
    }

    public final void J(Canvas canvas, boolean z10) {
        if (this.f22945s) {
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
        float f7;
        Canvas canvas2;
        float f10 = 1.0f;
        if (z10) {
            f7 = getAlpha();
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f22910g1;
            if (p6Var != null) {
                p6Var.b(this.f22950u0, this.f22948t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.f22952v0);
            } else {
                org.telegram.ui.ActionBar.t6.r(this.f22950u0, this.f22948t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.f22952v0);
            }
            jj jjVar = this.P0;
            if (jjVar != null && jjVar.N5()) {
                sg.p0 p0Var = this.E0;
                p0Var.getClass();
                p0Var.f48438a = 1.0f;
                int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f7 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                r0 r0Var = this.f22944r2;
                if (r0Var.f22862b) {
                    f10 = r0Var.f22863c;
                }
                p0Var.d(canvas2, f10, num);
                if (i10 < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void L(km kmVar, Canvas canvas, int i10, Integer num, float f7) {
        sg.p0 p0Var = this.E0;
        p0Var.getClass();
        org.telegram.ui.ActionBar.p6 p6Var = this.f22910g1;
        if (p6Var != null) {
            p6Var.b(this.f22950u0, this.f22948t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.f22952v0);
        } else {
            org.telegram.ui.ActionBar.t6.r(this.f22950u0, this.f22948t0 + org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), this.f22952v0);
        }
        p0Var.A = f7;
        p0Var.f(kmVar, canvas, i10, num);
    }

    @Override
    public final void M(String str) {
        TLRPC.PhotoSize photoSize;
        jj jjVar = this.P0;
        if (jjVar != null && jjVar.D == 11) {
            int size = jjVar.f16348n0.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    photoSize = (TLRPC.PhotoSize) jjVar.f16348n0.get(i10);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i10++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.I.r0(this.f22958x0, "g", ic.f(photoSize, jjVar.f16342l0), "50_50_b", this.L, 0L, null, jjVar, 1);
            org.telegram.messenger.b6.q(this.H).v(this);
        }
    }

    public final ColorFilter N(int i10) {
        if (i10 != this.f22940q2 || this.f22937p2 == null) {
            this.f22940q2 = i10;
            this.f22937p2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.f22937p2;
    }

    public final int O(jj jjVar) {
        int i10;
        int i11 = this.f22913h1;
        int i12 = jjVar.D;
        if (i12 == 37) {
            i11 = org.telegram.messenger.i0.L(52.0f);
        } else if (i12 == 21 || X()) {
            i11 = org.telegram.messenger.i0.L(78.0f);
        }
        if (!W() && (i10 = jjVar.D) != 34 && i10 != 35) {
            return i11;
        }
        return 0;
    }

    public Paint P(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.p6 p6Var = this.f22910g1;
        if (p6Var != null) {
            paint = p6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    public final float Q(jj jjVar) {
        vp r12;
        String str;
        if (jjVar != null) {
            try {
                if (jjVar.D == 22 && (str = (r12 = vp.r1(this.H)).Q2) != null && TextUtils.equals(jjVar.f16337k.action.wallpaper.uploadingImage, str)) {
                    return r12.R2.f20602r;
                }
                return 1.0f;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean R() {
        if (this.V0 == null) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f22910g1;
            if (p6Var != null) {
                if (p6Var.g()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.t6.d1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean S() {
        rh.g4 g4Var = this.H0;
        if (g4Var != null && g4Var.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        TLRPC.Message message;
        jj jjVar = this.P0;
        if (jjVar != null && (message = jjVar.f16337k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void U() {
        q0 q0Var = this.f22907f1;
        if (q0Var != null && q0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean V(jj jjVar) {
        if (jjVar != null) {
            int i10 = jjVar.D;
            if (i10 == 30 || i10 == 18 || i10 == 25 || X()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean W() {
        TLRPC.Message message;
        jj jjVar = this.P0;
        if (jjVar != null && (message = jjVar.f16337k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        jj jjVar;
        int i10;
        if (!S() && this.O0 == null && (i10 = (jjVar = this.P0).D) != 31 && i10 != 37 && i10 != 33 && i10 != 35 && i10 != 34 && i10 != 21 && i10 != 22 && !jjVar.z4()) {
            TLRPC.Message message = this.P0.f16337k;
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

    public final boolean Y() {
        jj jjVar = this.P0;
        if (jjVar != null) {
            TLRPC.Message message = jjVar.f16337k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return h20.B(vp.r1(this.H).Z1(Long.valueOf(this.P0.f16337k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a() {
        return false;
    }

    public final void a0(CharacterStyle characterStyle) {
        if (this.f22907f1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f22907f1.E(this, this.P0.O1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f22960y;
                if (uRLSpan instanceof e51) {
                    TLObject tLObject = ((e51) uRLSpan).f25691c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        gg.e.m(this.f22907f1.h0(), -this.f22907f1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f22960y;
                if (uRLSpan2 instanceof e51) {
                    TLObject tLObject2 = ((e51) uRLSpan2).f25691c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f22907f1.k0((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f22907f1.r(this, this.P0.O1());
            } else if (url.startsWith("http")) {
                gf.f.r(getContext(), url);
            } else {
                this.f22907f1.E0(Long.parseLong(url));
            }
        }
    }

    public final void b0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        jj jjVar = this.P0;
        TLRPC.MessageAction messageAction = jjVar.f16337k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (jjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !Y()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.P0.f16337k.action).slug;
        }
        if (this.f22907f1 != null) {
            org.telegram.messenger.i0.g3(new li.s(this, tL_premiumGiftOption, str, 23));
        }
    }

    public final void c0() {
        TLRPC.Message message;
        jj jjVar = this.P0;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            th.t5 t5Var = this.f22899d0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.P0.f16337k;
                int i10 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.p6 p6Var = t5Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i10;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f20023id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                rh.h8.j1(context, false, 0L, this.H, starsTransaction, p6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.P0.f16337k;
                int i11 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.p6 p6Var2 = t5Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i11;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f20023id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                rh.h8.j1(context2, false, 0L, this.H, starsTransaction2, p6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.P0.f16337k;
                int i12 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.p6 p6Var3 = t5Var.J;
                TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
                starsTransaction3.title = null;
                starsTransaction3.description = null;
                starsTransaction3.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction3.peer = tL_starsTransactionPeer3;
                tL_starsTransactionPeer3.peer = peer5;
                starsTransaction3.date = i12;
                TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
                starsTransaction3.amount = tL_starsTonAmount;
                tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
                starsTransaction3.f20023id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                rh.h8.j1(context3, false, 0L, this.H, starsTransaction3, p6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    rh.e4 e4Var = new rh.e4(getContext(), this.H, jj.B0(this.P0.f16337k), this.f22910g1, null);
                    e4Var.i2(this.P0, null);
                    e4Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.messenger.m5.n(null, 2131743905, cc.a0(T), 2131624020, 36);
                        return;
                    }
                    return;
                }
                rh.e4 e4Var2 = new rh.e4(getContext(), this.H, jj.B0(this.P0.f16337k), this.f22910g1, null);
                e4Var2.i2(this.P0, null);
                e4Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        rh.e4 e4Var3 = new rh.e4(getContext(), this.H, jj.B0(this.P0.f16337k), this.f22910g1, null);
                        e4Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        e4Var3.show();
                    }
                }
            }
        }
    }

    public final boolean d0(float f7, float f10, lg lgVar) {
        if (T() && !this.P0.P3() && !this.P0.f16337k.premiumEffectWasPlayed) {
            float y3 = getY() + getPaddingTop() + getWalletActionTop();
            if (y3 >= f7 && y3 + org.telegram.messenger.i0.L(140.0f) <= f10) {
                org.telegram.ui.Wallet.d4 d4Var = this.I0;
                bi0 bi0Var = d4Var.f34396l;
                if (d4Var.f34391i0 && d4Var.f34393j0 == null) {
                    d4Var.f34391i0 = false;
                    d4Var.f34395k0 = lgVar;
                    d4Var.K.e(true, 0.0f);
                    d4Var.M = false;
                    d4Var.N = 0L;
                    d4Var.b();
                    d4Var.g();
                    d4Var.f34411t = 18.0f;
                    d4Var.f34413u.f();
                    bi0Var.T(true, 0.0f);
                    bi0Var.start();
                    d4Var.H = true;
                    float f11 = d4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d4Var.f34393j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    d4Var.f34393j0.setInterpolator(gr.h);
                    d4Var.f34393j0.addUpdateListener(new eg(d4Var, f11, 5));
                    d4Var.f34393j0.addListener(new ns0(d4Var, 16));
                    d4Var.f34393j0.start();
                    d4Var.f34377a.invalidate();
                    this.P0.f16337k.premiumEffectWasPlayed = true;
                    hs.a0(this.H).X1(jj.B0(this.P0.f16337k), this.P0.f16337k);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jj jjVar;
        if (i10 == zs.f19648m1) {
            setSpoilersSuppressed(false);
        } else if (i10 == zs.f19630i4) {
            invalidate();
        } else if (i10 == zs.l1) {
            setSpoilersSuppressed(true);
        } else if (i10 != zs.W2 && i10 != zs.F3 && i10 != zs.X2) {
            if (i10 == zs.f19725y0) {
                if (Objects.equals(objArr[0], d20.i(this.H).f15152b0) && (jjVar = this.P0) != null) {
                    f0(jjVar, true);
                }
            } else if (i10 == zs.f19582a4 && T()) {
                this.f22927m2 = null;
                this.V = 0;
                requestLayout();
                invalidate();
            }
        } else {
            jj jjVar2 = this.P0;
            if (jjVar2 != null) {
                f0(jjVar2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.T1) {
            float a2 = this.f22928n.a(0.02f);
            canvas.save();
            canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        q0 q0Var = this.f22907f1;
        if (q0Var != null) {
            q0Var.M1(this, reactionCount, z10, f7, f10);
        }
    }

    public final void e0(int i10, boolean z10, boolean z11) {
        String u10;
        int i11 = this.Q0;
        if (i11 != i10 && i11 / 3600 != i10 / 3600) {
            if (z10) {
                if (i10 == 2147483646) {
                    u10 = cd.L0(2131748507, "MessageScheduledUntilOnline");
                } else {
                    u10 = cd.a0("MessageScheduledOn", null, 2131748543, cd.u(i10, false));
                }
            } else {
                u10 = cd.u(i10, false);
            }
            this.Q0 = i10;
            CharSequence charSequence = this.R0;
            if (charSequence == null || !TextUtils.equals(u10, charSequence)) {
                this.R0 = u10;
                this.f22927m2 = null;
                h0(z11);
            }
        }
    }

    public final void f0(org.telegram.messenger.jj r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s0.f0(org.telegram.messenger.jj, boolean):void");
    }

    @Override
    public final boolean g() {
        return false;
    }

    public final void g0(float f7, int i10) {
        this.f22955w0 = true;
        this.f22952v0 = i10;
        this.f22948t0 = f7;
        this.f22950u0 = 0.0f;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (S()) {
            int width = ((int) (getWidth() - (this.H0.T.f7031f + org.telegram.messenger.i0.L(8.0f)))) / 2;
            if (this.H0.f46965p) {
                return width;
            }
            return Math.min(this.f22892a1, width);
        } else if (V(this.P0)) {
            return i0.a.u(getWidth(), this.f22916i1, 2, this.f22918j0 / 2);
        } else {
            int i10 = this.f22892a1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.Q0) {
                i10 = Math.min((int) imageReceiver.K0, i10);
            }
            return (this.f22918j0 / 2) + i10;
        }
    }

    @Override
    public int getBoundsRight() {
        int i10;
        int i11;
        if (S()) {
            int L = ((int) ((this.H0.T.f7031f + org.telegram.messenger.i0.L(8.0f)) + getWidth())) / 2;
            if (this.H0.f46965p) {
                return L;
            }
            return Math.max(this.f22894b1, L);
        }
        if (V(this.P0)) {
            i10 = this.f22918j0 / 2;
            i11 = (getWidth() + this.f22916i1) / 2;
        } else {
            i10 = this.f22894b1;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.Q0) {
                i10 = Math.max((int) imageReceiver.y(), i10);
            }
            i11 = this.f22918j0 / 2;
        }
        return i11 + i10;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public bj getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.Q0;
    }

    public q0 getDelegate() {
        return this.f22907f1;
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
    public jj getMessageObject() {
        return this.P0;
    }

    @Override
    public int getObserverTag() {
        return this.f22957x;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public sg.p0 getReactionsLayout() {
        return this.E0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public r0 getTransitionParams() {
        return this.f22944r2;
    }

    public float getWalletSlidingOffset() {
        return this.M0;
    }

    public final void h0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            F(getMeasuredWidth(), this.R0);
            invalidate();
        }
        if (!this.C0) {
            if (z10) {
                org.telegram.messenger.i0.g3(new m0(this, 5));
                return;
            } else {
                requestLayout();
                return;
            }
        }
        x();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f22954w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f22934o2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f22931n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        q0 q0Var;
        super.onAttachedToWindow();
        this.f22901d2 = true;
        this.I.P();
        setStarsPaused(false);
        if (this.f22945s && (q0Var = this.f22907f1) != null && !q0Var.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22942r0 = org.telegram.ui.Components.o5.update(0, this, z10, this.f22942r0, this.M);
        kg.o oVar = this.f22947s1;
        if (oVar != null) {
            oVar.h = org.telegram.ui.Components.o5.update(0, (View) ((s0) oVar.f11207i), false, (org.telegram.ui.Components.k5) oVar.h, (StaticLayout) oVar.f11205f);
        }
        int i10 = this.H;
        zs.f(i10).c(this, zs.W2);
        zs.f(i10).c(this, zs.X2);
        zs.f(i10).c(this, zs.F3);
        zs.f(i10).c(this, zs.f19725y0);
        zs.f(i10).c(this, zs.f19582a4);
        zs.e().c(this, zs.f19630i4);
        jj jjVar = this.P0;
        if (jjVar != null && jjVar.D == 21) {
            f0(jjVar, true);
        }
        rh.g4 g4Var = this.H0;
        if (g4Var != null) {
            g4Var.a();
        }
        sg.p0 p0Var = this.E0;
        ArrayList arrayList = p0Var.f48453s;
        p0Var.D = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((sg.m0) arrayList.get(i11)).a();
        }
        l11 l11Var = this.f22929n0;
        if (l11Var != null) {
            l11Var.a();
        }
        nx0 nx0Var = this.O0;
        if (nx0Var != null) {
            nx0Var.d.R(nx0Var.f28905b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22901d2 = false;
        int i10 = this.H;
        org.telegram.messenger.b6.q(i10).v(this);
        this.I.R();
        setStarsPaused(true);
        this.C0 = false;
        org.telegram.ui.Components.o5.release(this, this.f22942r0);
        kg.o oVar = this.f22947s1;
        if (oVar != null) {
            org.telegram.ui.Components.o5.release((s0) oVar.f11207i, (org.telegram.ui.Components.k5) oVar.h);
        }
        zs.f(i10).n(this, zs.W2);
        zs.f(i10).n(this, zs.X2);
        zs.f(i10).n(this, zs.F3);
        zs.f(i10).n(this, zs.f19725y0);
        zs.f(i10).n(this, zs.f19582a4);
        zs.e().n(this, zs.f19630i4);
        this.f22899d0.g();
        this.f22944r2.f22861a = false;
        rh.g4 g4Var = this.H0;
        if (g4Var != null) {
            g4Var.S = false;
            g4Var.d.R();
            g4Var.e.b();
            ph.l0 l0Var = g4Var.f46973y;
            l0Var.d.R();
            org.telegram.ui.Components.o5.release((View) null, l0Var.f45188q);
            l0Var.f45188q = null;
        }
        this.E0.p();
        l11 l11Var = this.f22929n0;
        if (l11Var != null) {
            l11Var.b();
        }
        nx0 nx0Var = this.O0;
        if (nx0Var != null) {
            nx0Var.d.R(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        jj jjVar = this.P0;
        if (TextUtils.isEmpty(this.R0) && jjVar == null) {
            return;
        }
        if (this.f22927m2 == null) {
            if (!TextUtils.isEmpty(this.R0)) {
                charSequence = this.R0;
            } else {
                charSequence = jjVar.v;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.f22927m2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f22927m2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f22927m2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Wallet.c4 c4Var;
        RectF rectF = this.f22932o0;
        this.T1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        if (d4Var == null) {
            c4Var = null;
        } else {
            c4Var = d4Var.f34398m;
        }
        if (c4Var != null) {
            c4Var.layout(0, 0, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(42.0f));
        }
    }

    @Override
    public final void onMeasure(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s0.onMeasure(int, int):void");
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean r() {
        q0 q0Var = this.f22907f1;
        if (q0Var != null) {
            return q0Var.i1(this, this.f22961y0, this.f22963z0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.R0 = charSequence;
        if (charSequence != null) {
            h0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.f22907f1 = q0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f22903e1 == z10) {
            return;
        }
        this.f22903e1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f22934o2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.f22954w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f22931n2 = z10;
    }

    public void setMessageObject(jj jjVar) {
        f0(jjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f22904e2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.f22908f2 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.E0.f48459z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            U();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.J0 = z10;
        org.telegram.ui.Wallet.d4 d4Var = this.I0;
        if (d4Var != null) {
            d4Var.n(z10);
        }
        ArrayList arrayList = this.f22935p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((nh.i) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f7) {
        setTranslationX((getTranslationX() - this.M0) + f7);
        this.M0 = f7;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void x() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s0.x():void");
    }

    public final boolean y(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s0.y(android.view.MotionEvent):boolean");
    }

    public final void z() {
        RectF rectF = this.f22897c1;
        this.f22892a1 = (int) Math.min(this.f22892a1, rectF.left);
        this.f22894b1 = (int) Math.max(this.f22894b1, rectF.right);
    }

    public s0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f22928n = new dc(this);
        int i10 = d20.f15147s0;
        this.H = i10;
        th.t5 t5Var = new th.t5(null, false);
        this.f22899d0 = t5Var;
        this.m0 = true;
        this.f22932o0 = new RectF();
        this.f22935p0 = new ArrayList();
        this.f22938q0 = new Stack();
        this.E0 = new sg.p0(this);
        this.N0 = new RectF();
        this.T0 = -1;
        this.U0 = -1;
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new Path();
        this.f22897c1 = new RectF();
        this.f22900d1 = true;
        this.f22903e1 = false;
        this.f22930n1 = false;
        this.f22933o1 = false;
        this.f22939q1 = new org.telegram.ui.Components.t5(this, 0L, 320L, gr.h);
        this.f22962y1 = true;
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
        this.a2 = -1;
        this.f22898c2 = new Paint(1);
        this.f22911g2 = new Path();
        this.f22914h2 = new float[8];
        this.f22917i2 = new float[8];
        this.f22920j2 = new Path();
        this.f22923k2 = new int[]{16842910, 16842919};
        this.f22944r2 = new r0(this);
        t5Var.f49465a = false;
        this.f22945s = z10;
        this.f22910g1 = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.f16030u / 2);
        this.L = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f22957x = org.telegram.messenger.b6.q(i10).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.T1 = view;
        view.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.1f, -16777216), 7, org.telegram.messenger.i0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        kg.f2 f2Var = new kg.f2(10);
        this.V1 = f2Var;
        f2Var.O = 100;
        f2Var.J = false;
        f2Var.M = true;
        f2Var.G = false;
        f2Var.K = true;
        f2Var.H = true;
        f2Var.f11082r = 1;
        f2Var.f11086w = 0.98f;
        f2Var.v = 0.98f;
        f2Var.f11085u = 0.98f;
        f2Var.f11072g = false;
        f2Var.f11079o = 0.0f;
        f2Var.f11087x = 750L;
        f2Var.f11088y = 750;
        f2Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.f22954w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f22931n2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        View view = this.f22954w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f22931n2 || getParent() == null) {
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
    public final void b(boolean z10, boolean z11) {
    }

    @Override
    public final void i(long j10, long j11) {
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
