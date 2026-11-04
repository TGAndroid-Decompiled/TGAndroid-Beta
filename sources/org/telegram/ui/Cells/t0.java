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
import ci.wb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.qr;
import org.telegram.messenger.ri;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ej;
import org.telegram.ui.i81;
import org.telegram.ui.kl;
import org.telegram.ui.of;
import org.telegram.ui.tf;
public class t0 extends z implements org.telegram.messenger.x5, cs, p4 {
    public static final HashMap f30369t2;
    public float A0;
    public TextPaint A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public float C1;
    public boolean D0;
    public StaticLayout D1;
    public yh.f E;
    public boolean E0;
    public float E1;
    public boolean F;
    public final dh.o0 F0;
    public final TextPaint F1;
    public boolean G;
    public float G0;
    public final TextPaint G1;
    public boolean H;
    public float H0;
    public final TextPaint H1;
    public final int I;
    public ci.n6 I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public org.telegram.ui.Wallet.b4 J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final org.telegram.ui.Components.u8 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final ca O1;
    public int P;
    public iw0 P0;
    public boolean P1;
    public StaticLayout Q;
    public zi Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public ai.m2 T0;
    public ly0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final vg.s1 W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public e5.u Z1;
    public boolean f30370a0;
    public final Path f30371a1;
    public boolean f30372a2;
    public boolean f30373b0;
    public int f30374b1;
    public int f30375b2;
    public RadialProgressView f30376c0;
    public int f30377c1;
    public float c2;
    public float f30378d0;
    public final RectF f30379d1;
    public final Paint f30380d2;
    public final ei.o7 f30381e0;
    public boolean f30382e1;
    public boolean f30383e2;
    public int f30384f;
    public boolean f30385f0;
    public boolean f30386f1;
    public View.OnClickListener f30387f2;
    public boolean f30388g0;
    public q0 f30389g1;
    public int f30390g2;
    public int h;
    public boolean f30391h0;
    public final org.telegram.ui.ActionBar.e6 f30392h1;
    public final Path f30393h2;
    public boolean f30394i0;
    public int f30395i1;
    public final float[] f30396i2;
    public boolean f30397j0;
    public int f30398j1;
    public final float[] f30399j2;
    public int f30400k0;
    public StaticLayout k1;
    public final Path f30401k2;
    public boolean f30402l0;
    public Paint f30403l1;
    public final int[] f30404l2;
    public int m0;
    public ly0 m1;
    public int f30405m2;
    public final gc f30406n;
    public boolean f30407n0;
    public StaticLayout f30408n1;
    public SpannableStringBuilder f30409n2;
    public f01 f30410o0;
    public boolean f30411o1;
    public boolean f30412o2;
    public final RectF f30413p0;
    public boolean f30414p1;
    public Runnable f30415p2;
    public final ArrayList f30416q0;
    public int f30417q1;
    public PorterDuffColorFilter f30418q2;
    public w70 f30419r;
    public final Stack f30420r0;
    public final org.telegram.ui.Components.u5 f30421r1;
    public int f30422r2;
    public final boolean f30423s;
    public org.telegram.ui.Components.l5 f30424s0;
    public k4.j f30425s1;
    public final s0 f30426s2;
    public TextPaint f30427t0;
    public r0 f30428t1;
    public float f30429u0;
    public int f30430u1;
    public float f30431v0;
    public int f30432v1;
    public View f30433w;
    public int f30434w0;
    public int f30435w1;
    public final int f30436x;
    public boolean f30437x0;
    public ly0 f30438x1;
    public URLSpan f30439y;
    public ac f30440y0;
    public StaticLayout f30441y1;
    public float f30442z0;
    public boolean f30443z1;

    static {
        HashMap hashMap = new HashMap();
        f30369t2 = hashMap;
        com.google.android.recaptcha.internal.a.w(1, hashMap, "1⃣", 3, "2⃣");
        com.google.android.recaptcha.internal.a.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public t0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder E(String str) {
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
        for (int i3 = 0; i3 < staticLayout.getLineCount(); i3++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i3));
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
        vg.s1 s1Var = this.W1;
        if (z10 == s1Var.f56834g) {
            return;
        }
        s1Var.f56834g = z10;
        if (z10) {
            s1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i3 = 0; i3 < s1Var.f56840n.size(); i3++) {
            vg.r1 r1Var = (vg.r1) s1Var.f56840n.get(i3);
            r1Var.f56810a = (System.currentTimeMillis() - s1Var.R) + r1Var.f56810a;
        }
        invalidate();
    }

    public final void A(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i3, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        zi ziVar = this.Q0;
        if (ziVar != null && ziVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            zi ziVar2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (ziVar2 != null && ziVar2.D == 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new o31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.k1 = null;
        }
        this.f30408n1 = null;
        if (spannableStringBuilder != null) {
            ly0 ly0Var = new ly0(spannableStringBuilder, 10.0f, null);
            this.m1 = ly0Var;
            ly0Var.f35916a.linkColor = -1;
        } else {
            this.m1 = null;
        }
        zi ziVar3 = this.Q0;
        TextPaint textPaint2 = this.G1;
        if (ziVar3 != null && ziVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
        } else if (ziVar3 != null && (W() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        zi ziVar4 = this.Q0;
        if (ziVar4 != null && ziVar4.D == 22 && zi.B0(ziVar4.f26868k) >= 0 && (a10 = gi.l3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            r0 r0Var = this.f30428t1;
            if (r0Var != null) {
                org.telegram.ui.Components.p5.release((t0) r0Var.f30253i, (org.telegram.ui.Components.l5) r0Var.h);
                this.f30428t1 = null;
            }
            this.f30414p1 = r42;
        } else {
            if (this.f30428t1 == null) {
                this.f30428t1 = new r0(this);
            }
            try {
                charSequence4 = org.telegram.messenger.i6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.f30428t1.a(charSequence4, textPaint2, L2);
            if (z10 && ((StaticLayout) this.f30428t1.f30251f).getLineCount() > 3) {
                this.f30414p1 = !this.f30411o1;
                this.f30417q1 = ((StaticLayout) this.f30428t1.f30251f).getLineBottom(2);
                this.f30438x1 = new ly0(bd.M0(2131750273, null), textPaint2.getTextSize() / org.telegram.messenger.g0.f22607p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.f30428t1.f30251f).getLineBottom(2);
                this.f30432v1 = lineBottom;
                this.f30435w1 = lineBottom - ((StaticLayout) this.f30428t1.f30251f).getLineTop(2);
                this.f30430u1 = (int) ((StaticLayout) this.f30428t1.f30251f).getLineRight(2);
            } else {
                this.f30414p1 = r42;
                this.f30421r1.f(true, true);
                this.f30417q1 = r42;
            }
            if (this.f30414p1) {
                int lineEnd = ((StaticLayout) this.f30428t1.f30251f).getLineEnd(2) - 1;
                r0 r0Var2 = this.f30428t1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                r0Var2.a(charSequence4, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new o31(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f30441y1 = staticLayout;
            if (!z11 || this.f30414p1) {
                z12 = r42;
            }
            this.f30443z1 = z12;
            this.E1 = Z(staticLayout);
        } else {
            this.f30441y1 = null;
            this.f30443z1 = r42;
            this.E1 = 0.0f;
        }
        if (str != null) {
            if (this.R1 == null) {
                this.R1 = new CornerPathEffect(org.telegram.messenger.g0.L(5.0f));
            }
            if (this.S1 == null) {
                Path path = new Path();
                this.S1 = path;
                ai.t2.d(path, 1.35f, r42);
            }
            ly0 ly0Var2 = new ly0(str, i3, org.telegram.messenger.g0.o());
            this.T1 = ly0Var2;
            ly0Var2.f35929p = org.telegram.messenger.g0.L(62.0f);
            return;
        }
        this.S1 = null;
        this.T1 = null;
    }

    public final void B(int i3, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z10;
        int width;
        q0 q0Var;
        TLRPC.Message message;
        zi ziVar;
        int i10;
        float f10;
        int L = i3 - org.telegram.messenger.g0.L(30.0f);
        if (this.f30397j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (V()) {
            if (this.f30397j0) {
                f10 = 28.0f;
            } else {
                f10 = 82.0f;
            }
            L = Math.min(L - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(272.0f));
        }
        if (L >= 0) {
            int i11 = this.f30390g2;
            if (i11 > 0) {
                L = Math.min(i11, L);
            }
            int i12 = L;
            this.f30382e1 = true;
            if (!V() && ((ziVar = this.Q0) == null || ((i10 = ziVar.D) != 34 && i10 != 35))) {
                if (ziVar != null && ziVar.f26892q2) {
                    textPaint = (TextPaint) O("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) O("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) O("paintChatActionText3");
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
            this.N = new StaticLayout(charSequence2, textPaint2, i12, alignment2, 1.0f, 0.0f, false);
            this.Q = null;
            zi ziVar2 = this.Q0;
            if (ziVar2 != null && (message = ziVar2.f26868k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.Q = new StaticLayout(org.telegram.messenger.i6.n(org.telegram.messenger.g0.X2(bd.M0(2131744376, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f30423s && (q0Var = this.f30389g1) != null && !q0Var.d()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30424s0 = org.telegram.ui.Components.p5.update(0, this, z10, this.f30424s0, this.N);
            this.P = 0;
            this.O = 0;
            this.R = 0;
            StaticLayout staticLayout = this.Q;
            if (staticLayout != null) {
                int height = staticLayout.getHeight();
                this.R = height;
                this.R = org.telegram.messenger.g0.L(12.0f) + height;
            }
            zi ziVar3 = this.Q0;
            if (ziVar3 == null || !ziVar3.f26857h2) {
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
            this.S = (i3 - this.O) / 2;
            int L2 = org.telegram.messenger.g0.L(7.0f);
            this.T = L2;
            if (this.Q != null) {
                this.T = org.telegram.messenger.k5.C(11.0f, this.R, L2);
            }
            if (V()) {
                width = this.O;
            } else {
                width = this.N.getWidth();
            }
            this.U = (i3 - width) / 2;
            this.V = (i3 - i12) / 2;
            Stack stack = this.f30420r0;
            ArrayList arrayList = this.f30416q0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout2 = this.N;
                int i14 = this.S;
                yh.f.a(this, staticLayout2, i14, i14 + this.O, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void G(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        t0 t0Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        float f14;
        Paint paint3;
        Paint paint4;
        int i3;
        int i10;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        int i11;
        r0 r0Var;
        int i12;
        float L;
        org.telegram.ui.Wallet.b4 b4Var;
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
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i21;
        int i22;
        int i23;
        t0 t0Var2 = this;
        if (!t0Var2.f30423s || ((!t0Var2.Q() || z10) && (t0Var2.Q() || !z10))) {
            Paint O = t0Var2.O("paintChatActionBackground");
            Paint O2 = t0Var2.O("paintChatActionBackgroundDarken");
            t0Var2.f30427t0 = (TextPaint) t0Var2.O("paintChatActionText");
            int i24 = t0Var2.U0;
            org.telegram.ui.ActionBar.e6 e6Var4 = t0Var2.f30392h1;
            if (i24 >= 0) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(i24, e6Var4);
                if (t0Var2.W0 == null) {
                    Paint paint6 = new Paint(1);
                    t0Var2.W0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    t0Var2.X0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    t0Var2.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
                    t0Var2.X0.setColor(org.telegram.ui.ActionBar.k6.w0(t0Var2.V0, e6Var4));
                }
                O = t0Var2.W0;
                t0Var2.f30427t0 = t0Var2.X0;
            }
            boolean z11 = t0Var2.f30382e1;
            Path path = t0Var2.f30371a1;
            if (z11) {
                t0Var2.f30382e1 = false;
                t0Var2.f30374b1 = t0Var2.getWidth();
                t0Var2.f30377c1 = 0;
                ArrayList arrayList3 = t0Var2.Y0;
                arrayList3.clear();
                StaticLayout staticLayout = t0Var2.N;
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
                    int ceil = (int) Math.ceil(t0Var2.N.getLineWidth(i25));
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
                ArrayList arrayList4 = t0Var2.Z0;
                arrayList4.clear();
                path.reset();
                float f20 = measuredWidth;
                path.moveTo(f20, L5);
                int i30 = i26;
                int i31 = 0;
                int i32 = 0;
                while (true) {
                    rectF = t0Var2.f30379d1;
                    if (i32 >= lineCount) {
                        break;
                    }
                    int i33 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i32)).intValue();
                    int lineBottom = t0Var2.N.getLineBottom(i32);
                    int i34 = i33 - 1;
                    if (i32 < i34) {
                        paint5 = O2;
                        i19 = ((Integer) arrayList3.get(i32 + 1)).intValue();
                    } else {
                        paint5 = O2;
                        i19 = 0;
                    }
                    int i35 = lineBottom - i31;
                    if (i32 == 0 || intValue2 > i30) {
                        i35 = org.telegram.messenger.g0.L(3.0f) + i35;
                    }
                    if (i32 == i34 || intValue2 > i19) {
                        i35 = org.telegram.messenger.g0.L(3.0f) + i35;
                    }
                    Paint paint7 = O;
                    float f21 = (intValue2 / 2.0f) + f20;
                    if (i32 != i34 && intValue2 < i19 && i32 != 0 && intValue2 < i30) {
                        i20 = L7;
                    } else {
                        i20 = L4;
                    }
                    if (i32 == 0 || intValue2 > i30) {
                        f19 = f21;
                        arrayList2 = arrayList3;
                        e6Var3 = e6Var4;
                        rectF.set((f19 - L6) - L3, L5, f19 + i29, (L3 * 2) + L5);
                        x();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f19 = f21;
                        if (intValue2 < i30) {
                            float f22 = f19 + i29;
                            e6Var3 = e6Var4;
                            arrayList2 = arrayList3;
                            rectF.set(f22, L5, (i20 * 2) + f22, i22 + L5);
                            x();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            e6Var3 = e6Var4;
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
                    O2 = paint5;
                    O = paint7;
                    e6Var4 = e6Var3;
                    arrayList3 = arrayList2;
                }
                paint = O;
                paint2 = O2;
                ArrayList arrayList5 = arrayList3;
                e6Var = e6Var4;
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
                    this.N.getLineBottom(i37);
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
                    rectF.left = (f20 - (t0Var.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L5;
                    rectF.right = (t0Var.O / 2.0f) + f20 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L5 + t0Var.P + t0Var.R;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = O;
                paint2 = O2;
                e6Var = e6Var4;
                f10 = 8.0f;
                f11 = 6.0f;
                f12 = 4.0f;
                f13 = 2.0f;
                t0Var = t0Var2;
            }
            if (!t0Var.f30437x0) {
                t0Var.f30434w0 = ((ViewGroup) t0Var.getParent()).getMeasuredHeight();
            }
            if (e6Var != null) {
                e6Var2 = e6Var;
                e6Var2.b(t0Var.f30431v0, t0Var.f30429u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.f30434w0);
            } else {
                e6Var2 = e6Var;
                org.telegram.ui.ActionBar.k6.r(t0Var.f30431v0, t0Var.f30429u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.f30434w0);
            }
            boolean z12 = t0Var instanceof ej;
            if (z12 && !org.telegram.ui.ActionBar.k6.i1(e6Var2)) {
                f14 = 0.75f;
            } else {
                f14 = 1.0f;
            }
            if (!z10 || (t0Var.getAlpha() == 1.0f && !z12)) {
                paint3 = paint2;
                paint4 = paint;
                if (z12) {
                    i3 = paint4.getAlpha();
                    i10 = paint3.getAlpha();
                    paint4.setAlpha((int) (i3 * f14));
                    paint3.setAlpha((int) (i10 * f14));
                } else {
                    i3 = -1;
                    i10 = -1;
                }
            } else {
                i3 = paint.getAlpha();
                i10 = paint2.getAlpha();
                paint4 = paint;
                paint4.setAlpha((int) (t0Var.getAlpha() * i3 * f14));
                paint3 = paint2;
                paint3.setAlpha((int) (t0Var.getAlpha() * i10 * f14));
            }
            zi ziVar = t0Var.Q0;
            Paint paint8 = t0Var.f30380d2;
            if (ziVar == null || !ziVar.f26857h2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (t0Var.c2 > 0.0f) {
                    int alpha = paint8.getAlpha();
                    if (z10) {
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
                t0Var.J0.getClass();
                float L8 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = t0Var.getWalletActionTop();
                t0Var.J0.getClass();
                float L9 = org.telegram.messenger.g0.L(206.0f) + L8;
                if (t0Var.J0.f42262q0 == null) {
                    L2 = org.telegram.messenger.g0.L(140.0f);
                    f15 = 140.0f;
                    f16 = 20.0f;
                } else {
                    f15 = 140.0f;
                    f16 = 20.0f;
                    L2 = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(b4Var.f42262q0.i()));
                }
                RectF rectF2 = t0Var.O0;
                rectF2.set(L8, walletActionTop, L9, L2 + walletActionTop);
                canvas2.save();
                t0Var.J0.c(canvas2, L8, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                if (t0Var.Q() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                }
                f17 = 0.0f;
                if (t0Var.c2 > 0.0f) {
                    int alpha2 = paint8.getAlpha();
                    if (z10) {
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
            zi ziVar2 = t0Var.Q0;
            if (t0Var.R()) {
                float L10 = t0Var.I0.T.f53846f + org.telegram.messenger.g0.L(f10);
                float width2 = (t0Var.getWidth() - L10) / f13;
                if (t0Var.I0.f5622p) {
                    L = f17;
                } else {
                    L = org.telegram.messenger.g0.L(12.0f) + t0Var.T + t0Var.P;
                }
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(width2, L, L10 + width2, t0Var.I0.P + L + org.telegram.messenger.g0.L(f10));
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(rectF3);
                canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.P0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                iw0 iw0Var = t0Var.P0;
                iw0Var.getClass();
                int L12 = org.telegram.messenger.g0.L(f15) + ((int) iw0Var.f34841f.i());
                if (iw0Var.f34843i) {
                    i12 = org.telegram.messenger.g0.L(40.0f);
                } else {
                    i12 = 0;
                }
                float f27 = L12 + i12;
                float width3 = (t0Var.getWidth() - L11) / f13;
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(width3, org.telegram.messenger.g0.L(f12), L11 + width3, org.telegram.messenger.g0.L(f12) + f27);
                canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint4);
                if (t0Var.Q()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.U(ziVar2)) {
                float width4 = (t0Var.getWidth() - t0Var.f30398j1) / f13;
                float f28 = t0Var.T + t0Var.P;
                if (t0Var.W()) {
                    float L13 = f28 + org.telegram.messenger.g0.L(f12);
                    org.telegram.messenger.g0.P.set(width4, L13, t0Var.f30398j1 + width4, t0Var.f30384f + L13);
                } else {
                    float L14 = f28 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f29 = t0Var.f30398j1;
                    rectF4.set(width4, L14, width4 + f29, f29 + L14 + t0Var.L1);
                }
                if (ziVar2 != null && ziVar2.D == 18 && !t0Var.f30414p1 && (r0Var = t0Var.f30428t1) != null && t0Var.f30417q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = a1.g.D(1.0f, t0Var.f30421r1.f38645c, ((StaticLayout) r0Var.f30251f).getHeight() - t0Var.f30417q1, rectF5.bottom);
                }
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(org.telegram.messenger.g0.P);
                if (ziVar2 != null && (((i11 = ziVar2.D) == 33 || i11 == 35) && t0Var.Z1 != null)) {
                    float[] fArr = t0Var.f30396i2;
                    Arrays.fill(fArr, org.telegram.messenger.g0.L(16.0f));
                    float L15 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L15;
                    fArr[6] = L15;
                    fArr[5] = L15;
                    fArr[4] = L15;
                    Path path2 = t0Var.f30393h2;
                    path2.rewind();
                    path2.addRoundRect(t0Var.N1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (t0Var.Q()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                    if (t0Var.Q()) {
                        canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                    }
                }
            }
            if (i3 >= 0) {
                paint4.setAlpha(i3);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void H(Canvas canvas) {
        ColorFilter colorFilter;
        float f10;
        int i3;
        int i10;
        float f11;
        float f12;
        int i11;
        float L;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f13 = 2.0f;
        canvas2.translate(this.f30400k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.l5 l5Var = this.f30424s0;
        if (staticLayout != null) {
            colorFilter = L(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, staticLayout, l5Var, 0.0f, this.f30416q0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f14 = 4.0f;
        if (R()) {
            canvas2.save();
            ci.n6 n6Var = this.I0;
            float width = (getWidth() - n6Var.T.f53846f) / 2.0f;
            if (n6Var.f5622p) {
                L = org.telegram.messenger.g0.L(4.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f) + this.T + this.P;
            }
            canvas2.translate(width, L);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        f01 f01Var = this.f30410o0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30392h1;
        if (f01Var != null) {
            float alpha = getAlpha();
            if (e6Var != null) {
                e6Var.b(this.f30431v0, this.f30429u0 + 0.0f, getMeasuredWidth(), this.f30434w0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.f30431v0, this.f30429u0 + 0.0f, getMeasuredWidth(), this.f30434w0);
            }
            this.f30410o0.c(canvas, getWidth(), this.f30400k0, 0.0f, 1.0f, alpha, this.f30407n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (e6Var != null) {
                e6Var.b(this.f30431v0, this.f30429u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30434w0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.f30431v0, this.f30429u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30434w0);
            }
            float width2 = (getWidth() - this.f30398j1) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f30384f;
            float L3 = (this.f30398j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
            int i12 = 0;
            while (i12 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i12);
                float a10 = c0Var.a();
                float L4 = ((org.telegram.messenger.g0.L(f14) + L3) * i12) + width2;
                float f15 = L4 + L3;
                RectF rectF = this.f30379d1;
                rectF.set(L4, L2, f15, c0Var.f29013f + L2);
                canvas2.save();
                if (a10 != 1.0f) {
                    f10 = f14;
                    canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
                } else {
                    f10 = f14;
                }
                float[] fArr = this.f30399j2;
                Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, az.Y0)));
                if ((c0Var.f29014g & 9) == 9) {
                    float L5 = org.telegram.messenger.g0.L(az.Y0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((c0Var.f29014g & 10) == 10) {
                    float L6 = org.telegram.messenger.g0.L(az.Y0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.f30401k2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, O("paintChatActionBackground"));
                if (Q()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.k6.f27951h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                y yVar = c0Var.f29025s;
                if (yVar != null) {
                    int i13 = (int) L2;
                    yVar.setBounds((int) L4, i13, (int) f15, c0Var.f29013f + i13);
                    c0Var.f29025s.setAlpha(255);
                    c0Var.f29025s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (c0Var.f29026t != null) {
                    i3 = org.telegram.messenger.g0.L(26.0f);
                } else {
                    i3 = 0;
                }
                float k10 = c0Var.h.k();
                if (c0Var.f29026t != null) {
                    i10 = org.telegram.messenger.g0.L(f10);
                } else {
                    i10 = 0;
                }
                float f16 = i3;
                float z10 = com.google.android.recaptcha.internal.a.z(L3 - (k10 + i10), f16, f13, L4);
                Drawable drawable = c0Var.f29026t;
                if (drawable != null) {
                    int i14 = (int) z10;
                    f11 = f13;
                    drawable.setBounds(i14, (int) (((c0Var.f29013f - org.telegram.messenger.g0.L(24.0f)) / f13) + L2), org.telegram.messenger.g0.L(24.0f) + i14, org.telegram.messenger.g0.L(24.0f) + ((int) (((c0Var.f29013f - org.telegram.messenger.g0.L(24.0f)) / f11) + L2)));
                    Drawable drawable2 = c0Var.f29026t;
                    if (c0Var.f29019m) {
                        i11 = 128;
                    } else {
                        i11 = 255;
                    }
                    drawable2.setAlpha(i11);
                    c0Var.f29026t.draw(canvas2);
                    z10 += f16;
                } else {
                    f11 = f13;
                }
                c0Var.h.f35929p = Math.max(1, (((int) L3) - org.telegram.messenger.g0.L(15.0f)) - i3);
                ly0 ly0Var = c0Var.h;
                float L7 = (org.telegram.messenger.g0.L(40.0f) / f11) + L2;
                if (c0Var.f29019m) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                ly0Var.f(canvas2, z10, L7, f12);
                canvas2.restore();
                canvas2.restore();
                i12++;
                f14 = f10;
                f13 = f11;
            }
        }
    }

    public final void I(Canvas canvas, boolean z10) {
        if (this.f30423s) {
            if (!Q() || z10) {
                if (!Q() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        J(canvas, z10, null);
    }

    public final void J(Canvas canvas, boolean z10, Integer num) {
        float f10;
        Canvas canvas2;
        float f11 = 1.0f;
        if (z10) {
            f10 = getAlpha();
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f30392h1;
            if (e6Var != null) {
                e6Var.b(this.f30431v0, this.f30429u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30434w0);
            } else {
                org.telegram.ui.ActionBar.k6.r(this.f30431v0, this.f30429u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30434w0);
            }
            zi ziVar = this.Q0;
            if (ziVar != null && ziVar.P5()) {
                dh.o0 o0Var = this.F0;
                o0Var.getClass();
                o0Var.f9112a = 1.0f;
                int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i3 < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                s0 s0Var = this.f30426s2;
                if (s0Var.f30308b) {
                    f11 = s0Var.f30309c;
                }
                o0Var.d(canvas2, f11, num);
                if (i3 < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void K(kl klVar, Canvas canvas, int i3, Integer num, float f10) {
        dh.o0 o0Var = this.F0;
        o0Var.getClass();
        org.telegram.ui.ActionBar.e6 e6Var = this.f30392h1;
        if (e6Var != null) {
            e6Var.b(this.f30431v0, this.f30429u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30434w0);
        } else {
            org.telegram.ui.ActionBar.k6.r(this.f30431v0, this.f30429u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f30434w0);
        }
        o0Var.A = f10;
        o0Var.f(klVar, canvas, i3, num);
    }

    public final ColorFilter L(int i3) {
        if (i3 != this.f30422r2 || this.f30418q2 == null) {
            this.f30422r2 = i3;
            this.f30418q2 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        return this.f30418q2;
    }

    @Override
    public final void M(String str) {
        TLRPC.PhotoSize photoSize;
        zi ziVar = this.Q0;
        if (ziVar != null && ziVar.D == 11) {
            int size = ziVar.f26878n0.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    photoSize = (TLRPC.PhotoSize) ziVar.f26878n0.get(i3);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i3++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.J.r0(this.f30440y0, "g", ac.f(photoSize, ziVar.f26872l0), "50_50_b", this.M, 0L, null, ziVar, 1);
            org.telegram.messenger.z5.q(this.I).v(this);
        }
    }

    public final int N(zi ziVar) {
        int i3;
        int i10 = this.f30395i1;
        int i11 = ziVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || W()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (!V() && (i3 = ziVar.D) != 34 && i3 != 35) {
            return i10;
        }
        return 0;
    }

    public Paint O(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30392h1;
        if (e6Var != null) {
            paint = e6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final float P(zi ziVar) {
        hp s12;
        String str;
        if (ziVar != null) {
            try {
                if (ziVar.D == 22 && (str = (s12 = hp.s1(this.I)).R2) != null && TextUtils.equals(ziVar.f26868k.action.wallpaper.uploadingImage, str)) {
                    return s12.S2.f27437r;
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
        if (this.W0 == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f30392h1;
            if (e6Var != null) {
                if (e6Var.g()) {
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
        ci.n6 n6Var = this.I0;
        if (n6Var != null && n6Var.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        TLRPC.Message message;
        zi ziVar = this.Q0;
        if (ziVar != null && (message = ziVar.f26868k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void T() {
        q0 q0Var = this.f30389g1;
        if (q0Var != null && q0Var.d()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean U(zi ziVar) {
        if (ziVar != null) {
            int i3 = ziVar.D;
            if (i3 == 30 || i3 == 18 || i3 == 25 || W()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean V() {
        TLRPC.Message message;
        zi ziVar = this.Q0;
        if (ziVar != null && (message = ziVar.f26868k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        zi ziVar;
        int i3;
        if (!R() && this.P0 == null && (i3 = (ziVar = this.Q0).D) != 31 && i3 != 37 && i3 != 33 && i3 != 35 && i3 != 34 && i3 != 21 && i3 != 22 && !ziVar.A4()) {
            TLRPC.Message message = this.Q0.f26868k;
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
        zi ziVar = this.Q0;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return l10.B(hp.s1(this.I).a2(Long.valueOf(this.Q0.f26868k.from_id.user_id)));
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
        if (this.f30389g1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f30389g1.t(this, this.Q0.O1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f30439y;
                if (uRLSpan instanceof v31) {
                    TLObject tLObject = ((v31) uRLSpan).f38987c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        rg.c.m(this.f30389g1.E(), -this.f30389g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f30439y;
                if (uRLSpan2 instanceof v31) {
                    TLObject tLObject2 = ((v31) uRLSpan2).f38987c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f30389g1.F((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f30389g1.h(this, this.Q0.O1());
            } else if (url.startsWith("http")) {
                sf.c.t(getContext(), url);
            } else {
                this.f30389g1.W(Long.parseLong(url));
            }
        }
    }

    public final void b0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        zi ziVar = this.Q0;
        TLRPC.MessageAction messageAction = ziVar.f26868k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (ziVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !X()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.f26868k.action).slug;
        }
        if (this.f30389g1 != null) {
            org.telegram.messenger.g0.h3(new lg.y((ViewGroup) this, (Object) tL_premiumGiftOption, str, 27));
        }
    }

    public final void c0() {
        TLRPC.Message message;
        zi ziVar = this.Q0;
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            ei.o7 o7Var = this.f30381e0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.Q0.f26868k;
                int i3 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.e6 e6Var = o7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i3;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f27232id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                wb.k1(context, false, 0L, this.I, starsTransaction, e6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.Q0.f26868k;
                int i10 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.e6 e6Var2 = o7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i10;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f27232id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                wb.k1(context2, false, 0L, this.I, starsTransaction2, e6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.Q0.f26868k;
                int i11 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.e6 e6Var3 = o7Var.J;
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
                starsTransaction3.f27232id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                wb.k1(context3, false, 0L, this.I, starsTransaction3, e6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    ci.l6 l6Var = new ci.l6(getContext(), this.I, zi.B0(this.Q0.f26868k), this.f30392h1, null);
                    l6Var.i2(this.Q0, null);
                    l6Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.messenger.k5.o(null, 2131743890, fc.a0(T), 2131624020, 36);
                        return;
                    }
                    return;
                }
                ci.l6 l6Var2 = new ci.l6(getContext(), this.I, zi.B0(this.Q0.f26868k), this.f30392h1, null);
                l6Var2.i2(this.Q0, null);
                l6Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ci.l6 l6Var3 = new ci.l6(getContext(), this.I, zi.B0(this.Q0.f26868k), this.f30392h1, null);
                        l6Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        l6Var3.show();
                    }
                }
            }
        }
    }

    public final boolean d0(float f10, float f11, tf tfVar) {
        if (S() && !this.Q0.Q3() && !this.Q0.f26868k.premiumEffectWasPlayed) {
            float y9 = getY() + getPaddingTop() + getWalletActionTop();
            if (y9 >= f10 && y9 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.b4 b4Var = this.J0;
                ch0 ch0Var = b4Var.f42252l;
                if (b4Var.f42247i0 && b4Var.f42249j0 == null) {
                    b4Var.f42247i0 = false;
                    b4Var.f42251k0 = tfVar;
                    b4Var.K.e(true, 0.0f);
                    b4Var.M = false;
                    b4Var.N = 0L;
                    b4Var.b();
                    b4Var.g();
                    b4Var.f42267t = 18.0f;
                    b4Var.f42269u.f();
                    ch0Var.T(true, 0.0f);
                    ch0Var.start();
                    b4Var.H = true;
                    float f12 = b4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    b4Var.f42249j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    b4Var.f42249j0.setInterpolator(xq.h);
                    b4Var.f42249j0.addUpdateListener(new of(b4Var, f12, 5));
                    b4Var.f42249j0.addListener(new i81(b4Var, 5));
                    b4Var.f42249j0.start();
                    b4Var.f42232a.invalidate();
                    this.Q0.f26868k.premiumEffectWasPlayed = true;
                    qr.a0(this.I).X1(zi.B0(this.Q0.f26868k), this.Q0.f26868k);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        if (i3 == hs.m1) {
            setSpoilersSuppressed(false);
        } else if (i3 == hs.f23246i4) {
            invalidate();
        } else if (i3 == hs.f23260l1) {
            setSpoilersSuppressed(true);
        } else if (i3 != hs.W2 && i3 != hs.F3 && i3 != hs.X2) {
            if (i3 == hs.f23340y0) {
                if (Objects.equals(objArr[0], h10.i(this.I).f22836c0) && (ziVar = this.Q0) != null) {
                    f0(ziVar, true);
                }
            } else if (i3 == hs.f23200a4 && S()) {
                this.f30409n2 = null;
                this.W = 0;
                requestLayout();
                invalidate();
            }
        } else {
            zi ziVar2 = this.Q0;
            if (ziVar2 != null) {
                f0(ziVar2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.U1) {
            float a10 = this.f30406n.a(0.02f);
            canvas.save();
            canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        q0 q0Var = this.f30389g1;
        if (q0Var != null) {
            q0Var.v0(this, reactionCount, z10, f10, f11);
        }
    }

    public final void e0(int i3, boolean z10, boolean z11) {
        String u10;
        int i10 = this.R0;
        if (i10 != i3 && i10 / 3600 != i3 / 3600) {
            if (z10) {
                if (i3 == 2147483646) {
                    u10 = bd.M0(2131748500, "MessageScheduledUntilOnline");
                } else {
                    u10 = bd.a0("MessageScheduledOn", null, 2131748536, bd.u(i3, false));
                }
            } else {
                u10 = bd.u(i3, false);
            }
            this.R0 = i3;
            CharSequence charSequence = this.S0;
            if (charSequence == null || !TextUtils.equals(u10, charSequence)) {
                this.S0 = u10;
                this.f30409n2 = null;
                i0(z11);
            }
        }
    }

    public final void f0(org.telegram.messenger.zi r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.f0(org.telegram.messenger.zi, boolean):void");
    }

    public final void g0(int i3, int i10) {
        this.U0 = i3;
        this.V0 = i10;
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (R()) {
            int width = ((int) (getWidth() - (this.I0.T.f53846f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            if (this.I0.f5622p) {
                return width;
            }
            return Math.min(this.f30374b1, width);
        } else if (U(this.Q0)) {
            return k2.p1.e(getWidth(), this.f30398j1, 2, this.f30400k0 / 2);
        } else {
            int i3 = this.f30374b1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i3 = Math.min((int) imageReceiver.L0, i3);
            }
            return (this.f30400k0 / 2) + i3;
        }
    }

    @Override
    public int getBoundsRight() {
        int i3;
        int i10;
        if (R()) {
            int L = ((int) ((this.I0.T.f53846f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            if (this.I0.f5622p) {
                return L;
            }
            return Math.max(this.f30377c1, L);
        }
        if (U(this.Q0)) {
            i3 = this.f30400k0 / 2;
            i10 = (getWidth() + this.f30398j1) / 2;
        } else {
            i3 = this.f30377c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i3 = Math.max((int) imageReceiver.y(), i3);
            }
            i10 = this.f30400k0 / 2;
        }
        return i10 + i3;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public ri getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public q0 getDelegate() {
        return this.f30389g1;
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
    public zi getMessageObject() {
        return this.Q0;
    }

    @Override
    public int getObserverTag() {
        return this.f30436x;
    }

    public ImageReceiver getPhotoImage() {
        return this.J;
    }

    public dh.o0 getReactionsLayout() {
        return this.F0;
    }

    @Override
    public float getSlidingOffsetX() {
        return 0.0f;
    }

    public s0 getTransitionParams() {
        return this.f30426s2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(float f10, int i3) {
        this.f30437x0 = true;
        this.f30434w0 = i3;
        this.f30429u0 = f10;
        this.f30431v0 = 0.0f;
    }

    public final void i0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            B(getMeasuredWidth(), this.S0);
            invalidate();
        }
        if (!this.D0) {
            if (z10) {
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
    public final void invalidate() {
        super.invalidate();
        View view = this.f30433w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f30415p2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f30412o2 || getParent() == null) {
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
        boolean z10;
        q0 q0Var;
        super.onAttachedToWindow();
        this.f30383e2 = true;
        this.J.P();
        setStarsPaused(false);
        if (this.f30423s && (q0Var = this.f30389g1) != null && !q0Var.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30424s0 = org.telegram.ui.Components.p5.update(0, this, z10, this.f30424s0, this.N);
        r0 r0Var = this.f30428t1;
        if (r0Var != null) {
            r0Var.h = org.telegram.ui.Components.p5.update(0, (View) ((t0) r0Var.f30253i), false, (org.telegram.ui.Components.l5) r0Var.h, (StaticLayout) r0Var.f30251f);
        }
        int i3 = this.I;
        hs.f(i3).c(this, hs.W2);
        hs.f(i3).c(this, hs.X2);
        hs.f(i3).c(this, hs.F3);
        hs.f(i3).c(this, hs.f23340y0);
        hs.f(i3).c(this, hs.f23200a4);
        hs.e().c(this, hs.f23246i4);
        zi ziVar = this.Q0;
        if (ziVar != null && ziVar.D == 21) {
            f0(ziVar, true);
        }
        ci.n6 n6Var = this.I0;
        if (n6Var != null) {
            n6Var.a();
        }
        dh.o0 o0Var = this.F0;
        ArrayList arrayList = o0Var.f9128s;
        o0Var.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((dh.l0) arrayList.get(i10)).a();
        }
        f01 f01Var = this.f30410o0;
        if (f01Var != null) {
            f01Var.a();
        }
        iw0 iw0Var = this.P0;
        if (iw0Var != null) {
            iw0Var.d.R(iw0Var.f34838b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30383e2 = false;
        int i3 = this.I;
        org.telegram.messenger.z5.q(i3).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.p5.release(this, this.f30424s0);
        r0 r0Var = this.f30428t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.f30253i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        hs.f(i3).n(this, hs.W2);
        hs.f(i3).n(this, hs.X2);
        hs.f(i3).n(this, hs.F3);
        hs.f(i3).n(this, hs.f23340y0);
        hs.f(i3).n(this, hs.f23200a4);
        hs.e().n(this, hs.f23246i4);
        this.f30381e0.g();
        this.f30426s2.f30307a = false;
        ci.n6 n6Var = this.I0;
        if (n6Var != null) {
            n6Var.S = false;
            n6Var.d.R();
            n6Var.f5612e.b();
            ai.j1 j1Var = n6Var.f5630y;
            j1Var.d.R();
            org.telegram.ui.Components.p5.release((View) null, j1Var.f743q);
            j1Var.f743q = null;
        }
        this.F0.p();
        f01 f01Var = this.f30410o0;
        if (f01Var != null) {
            f01Var.b();
        }
        iw0 iw0Var = this.P0;
        if (iw0Var != null) {
            iw0Var.d.R(null);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        CharacterStyle[] characterStyleArr;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zi ziVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && ziVar == null) {
            return;
        }
        if (this.f30409n2 == null) {
            if (!TextUtils.isEmpty(this.S0)) {
                charSequence = this.S0;
            } else {
                charSequence = ziVar.v;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.f30409n2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f30409n2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f30409n2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Wallet.a4 a4Var;
        RectF rectF = this.f30413p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.b4 b4Var = this.J0;
        if (b4Var == null) {
            a4Var = null;
        } else {
            a4Var = b4Var.f42254m;
        }
        if (a4Var != null) {
            a4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
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
        q0 q0Var = this.f30389g1;
        if (q0Var != null) {
            return q0Var.r0(this, this.f30442z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            i0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.f30389g1 = q0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f30386f1 == z10) {
            return;
        }
        this.f30386f1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f30415p2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.f30433w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f30412o2 = z10;
    }

    public void setMessageObject(zi ziVar) {
        f0(ziVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f30387f2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i3) {
        this.f30390g2 = i3;
    }

    public void setScrimReaction(Integer num) {
        this.F0.f9134z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.f30407n0 != z10) {
            this.f30407n0 = z10;
            T();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.K0 = z10;
        org.telegram.ui.Wallet.b4 b4Var = this.J0;
        if (b4Var != null) {
            b4Var.n(z10);
        }
        ArrayList arrayList = this.f30416q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((yh.f) obj).invalidateSelf();
        }
    }

    public void setWalletSlidingOffset(float f10) {
        setTranslationX((getTranslationX() - this.N0) + f10);
        this.N0 = f10;
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.K && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final boolean w(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.w(android.view.MotionEvent):boolean");
    }

    public final void x() {
        RectF rectF = this.f30379d1;
        this.f30374b1 = (int) Math.min(this.f30374b1, rectF.left);
        this.f30377c1 = (int) Math.max(this.f30377c1, rectF.right);
    }

    public final boolean y(float f10, int i3) {
        dh.o0 o0Var = this.F0;
        if (!o0Var.H) {
            return false;
        }
        float y9 = getY() + o0Var.f9114c;
        if (y9 <= f10 || (y9 + o0Var.f9122m) - org.telegram.messenger.g0.L(16.0f) >= i3) {
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
        int L = this.f30398j1 - org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.f26868k.action;
        int i3 = tL_messageActionGiftCode.months;
        TLRPC.Chat M02 = hp.s1(this.I).M0(Long.valueOf(-org.telegram.messenger.m5.o(tL_messageActionGiftCode.boost_peer)));
        if (M02 == null) {
            str = null;
        } else {
            str = M02.title;
        }
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        if (tL_messageActionGiftCode.unclaimed) {
            M0 = bd.M0(2131753176, "BoostingUnclaimedPrize");
        } else {
            M0 = bd.M0(2131753542, "BoostingCongratulations");
        }
        if (i3 == 12) {
            G = bd.G(1, "BoldYears", new Object[0]);
        } else {
            G = bd.G(i3, "BoldMonths", new Object[0]);
        }
        if (z10) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753166, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.k5.q(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753307, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.k5.q(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a02 = bd.M0(2131753310, null);
            } else {
                a02 = bd.a0("BoostingReceivedGiftFrom", null, 2131753311, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.q(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = bd.M0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new o31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.f30408n1 = null;
        this.m1 = null;
        r0 r0Var = this.f30428t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.f30253i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        r0 r0Var2 = new r0(this);
        this.f30428t1 = r0Var2;
        r0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.f30414p1 = false;
        this.f30417q1 = 0;
        this.f30438x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) O("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.f30441y1 = staticLayout;
        this.f30443z1 = true;
        this.E1 = Z(staticLayout);
    }

    public t0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f30406n = new gc(this);
        int i3 = h10.f22829t0;
        this.I = i3;
        ei.o7 o7Var = new ei.o7(null, false);
        this.f30381e0 = o7Var;
        this.f30407n0 = true;
        this.f30413p0 = new RectF();
        this.f30416q0 = new ArrayList();
        this.f30420r0 = new Stack();
        this.F0 = new dh.o0(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f30371a1 = new Path();
        this.f30379d1 = new RectF();
        this.f30382e1 = true;
        this.f30386f1 = false;
        this.f30411o1 = false;
        this.f30414p1 = false;
        this.f30421r1 = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.f30443z1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.F1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.G1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.H1 = textPaint3;
        this.K1 = new RadialProgress2(this, null);
        this.O1 = new ca(this, 2);
        this.V1 = new Path();
        this.Y1 = new ArrayList();
        this.f30375b2 = -1;
        this.f30380d2 = new Paint(1);
        this.f30393h2 = new Path();
        this.f30396i2 = new float[8];
        this.f30399j2 = new float[8];
        this.f30401k2 = new Path();
        this.f30404l2 = new int[]{16842910, 16842919};
        this.f30426s2 = new s0(this);
        o7Var.f10696a = false;
        this.f30423s = z10;
        this.f30392h1 = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.f22612u / 2);
        this.M = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f30436x = org.telegram.messenger.z5.q(i3).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        vg.s1 s1Var = new vg.s1(10);
        this.W1 = s1Var;
        s1Var.O = 100;
        s1Var.J = false;
        s1Var.M = true;
        s1Var.G = false;
        s1Var.K = true;
        s1Var.H = true;
        s1Var.f56844r = 1;
        s1Var.f56848w = 0.98f;
        s1Var.v = 0.98f;
        s1Var.f56847u = 0.98f;
        s1Var.f56834g = false;
        s1Var.f56841o = 0.0f;
        s1Var.f56849x = 750L;
        s1Var.f56850y = 750;
        s1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.f30433w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f30412o2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        View view = this.f30433w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f30412o2 || getParent() == null) {
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
    public final void o(long j10, long j11) {
    }
}
