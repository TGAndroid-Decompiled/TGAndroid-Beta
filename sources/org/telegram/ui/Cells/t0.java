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
import di.mb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.messenger.yi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g71;
import org.telegram.ui.ij;
import org.telegram.ui.ol;
import org.telegram.ui.pf;
import org.telegram.ui.uf;
public class t0 extends z implements org.telegram.messenger.x5, is, p4 {
    public static final HashMap f31445t2;
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
    public di.e6 I0;
    public TLRPC.Document I1;
    public final ImageReceiver J;
    public org.telegram.ui.Wallet.c4 J0;
    public TLRPC.VideoSize J1;
    public Drawable K;
    public boolean K0;
    public final RadialProgress2 K1;
    public Path L;
    public float L0;
    public int L1;
    public final org.telegram.ui.Components.t8 M;
    public float M0;
    public boolean M1;
    public StaticLayout N;
    public float N0;
    public RectF N1;
    public int O;
    public final RectF O0;
    public final ca O1;
    public int P;
    public mw0 P0;
    public boolean P1;
    public StaticLayout Q;
    public gj Q0;
    public ColorMatrixColorFilter Q1;
    public int R;
    public int R0;
    public CornerPathEffect R1;
    public int S;
    public CharSequence S0;
    public Path S1;
    public int T;
    public bi.e2 T0;
    public oy0 T1;
    public int U;
    public int U0;
    public final View U1;
    public int V;
    public int V0;
    public final Path V1;
    public int W;
    public Paint W0;
    public final ug.r1 W1;
    public TextPaint X0;
    public int X1;
    public final ArrayList Y0;
    public final ArrayList Y1;
    public final ArrayList Z0;
    public f5.v Z1;
    public boolean f31446a0;
    public final Path f31447a1;
    public boolean f31448a2;
    public boolean f31449b0;
    public int f31450b1;
    public int f31451b2;
    public RadialProgressView f31452c0;
    public int f31453c1;
    public float f31454c2;
    public float f31455d0;
    public final RectF f31456d1;
    public final Paint d2;
    public final fi.h7 f31457e0;
    public boolean f31458e1;
    public boolean f31459e2;
    public int f31460f;
    public boolean f31461f0;
    public boolean f31462f1;
    public View.OnClickListener f31463f2;
    public boolean f31464g0;
    public q0 f31465g1;
    public int f31466g2;
    public int h;
    public boolean f31467h0;
    public final org.telegram.ui.ActionBar.e6 f31468h1;
    public final Path f31469h2;
    public boolean f31470i0;
    public int f31471i1;
    public final float[] f31472i2;
    public boolean f31473j0;
    public int f31474j1;
    public final float[] f31475j2;
    public int f31476k0;
    public StaticLayout f31477k1;
    public final Path f31478k2;
    public boolean f31479l0;
    public Paint l1;
    public final int[] f31480l2;
    public int m0;
    public oy0 f31481m1;
    public int f31482m2;
    public final dc f31483n;
    public boolean f31484n0;
    public StaticLayout n1;
    public SpannableStringBuilder f31485n2;
    public i01 f31486o0;
    public boolean f31487o1;
    public boolean f31488o2;
    public final RectF f31489p0;
    public boolean f31490p1;
    public Runnable f31491p2;
    public final ArrayList f31492q0;
    public int f31493q1;
    public PorterDuffColorFilter f31494q2;
    public d80 f31495r;
    public final Stack f31496r0;
    public final org.telegram.ui.Components.u5 f31497r1;
    public int f31498r2;
    public final boolean f31499s;
    public org.telegram.ui.Components.l5 f31500s0;
    public h6.m f31501s1;
    public final s0 f31502s2;
    public TextPaint f31503t0;
    public r0 f31504t1;
    public float f31505u0;
    public int f31506u1;
    public float f31507v0;
    public int f31508v1;
    public View f31509w;
    public int f31510w0;
    public int f31511w1;
    public final int f31512x;
    public boolean f31513x0;
    public oy0 f31514x1;
    public URLSpan f31515y;
    public gc f31516y0;
    public StaticLayout f31517y1;
    public float f31518z0;
    public boolean f31519z1;

    static {
        HashMap hashMap = new HashMap();
        f31445t2 = hashMap;
        i5.c.s(1, hashMap, "1⃣", 3, "2⃣");
        i5.c.s(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public t0(Context context) {
        this(context, null, false);
    }

    public static SpannableStringBuilder F(String str) {
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

    public static float b0(StaticLayout staticLayout) {
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
        ug.r1 r1Var = this.W1;
        if (z10 == r1Var.f58310g) {
            return;
        }
        r1Var.f58310g = z10;
        if (z10) {
            r1Var.R = System.currentTimeMillis();
            return;
        }
        for (int i7 = 0; i7 < r1Var.f58316n.size(); i7++) {
            ug.q1 q1Var = (ug.q1) r1Var.f58316n.get(i7);
            q1Var.f58274a = (System.currentTimeMillis() - r1Var.R) + q1Var.f58274a;
        }
        invalidate();
    }

    public final void B(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i7, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        int a10;
        CharSequence charSequence4 = charSequence2;
        int L = i10 - org.telegram.messenger.g0.L(16.0f);
        gj gjVar = this.Q0;
        if (gjVar != null && gjVar.D == 30) {
            L -= org.telegram.messenger.g0.L(16.0f);
        }
        int i12 = L;
        if (charSequence != null) {
            gj gjVar2 = this.Q0;
            TextPaint textPaint = this.F1;
            if (gjVar2 != null && gjVar2.D == 30) {
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
            } else {
                textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new y31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
            r42 = 0;
            this.f31477k1 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.f31477k1 = null;
        }
        this.n1 = null;
        if (spannableStringBuilder != null) {
            oy0 oy0Var = new oy0(spannableStringBuilder, 10.0f, null);
            this.f31481m1 = oy0Var;
            oy0Var.f38103a.linkColor = -1;
        } else {
            this.f31481m1 = null;
        }
        gj gjVar3 = this.Q0;
        TextPaint textPaint2 = this.G1;
        if (gjVar3 != null && gjVar3.D == 35) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.3f));
        } else if (gjVar3 != null && (Z() || (i11 = this.Q0.D) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        } else {
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        }
        int L2 = i12 - org.telegram.messenger.g0.L(12.0f);
        gj gjVar4 = this.Q0;
        if (gjVar4 != null && gjVar4.D == 22 && gj.B0(gjVar4.f23817k) >= 0 && (a10 = hi.l3.a(charSequence4, textPaint2)) < L2 && a10 > L2 / 5.0f) {
            L2 = a10;
        }
        boolean z12 = true;
        if (charSequence4 == null) {
            r0 r0Var = this.f31504t1;
            if (r0Var != null) {
                org.telegram.ui.Components.p5.release((t0) r0Var.f31329i, (org.telegram.ui.Components.l5) r0Var.h);
                this.f31504t1 = null;
            }
            this.f31490p1 = r42;
        } else {
            if (this.f31504t1 == null) {
                this.f31504t1 = new r0(this);
            }
            try {
                charSequence4 = org.telegram.messenger.j6.m(charSequence4, textPaint2.getFontMetricsInt(), r42, null, r42);
            } catch (Exception unused) {
            }
            this.f31504t1.a(charSequence4, textPaint2, L2);
            if (z10 && ((StaticLayout) this.f31504t1.f31327f).getLineCount() > 3) {
                this.f31490p1 = !this.f31487o1;
                this.f31493q1 = ((StaticLayout) this.f31504t1.f31327f).getLineBottom(2);
                this.f31514x1 = new oy0(hd.M0(2131750265, null), textPaint2.getTextSize() / org.telegram.messenger.g0.f23608p, org.telegram.messenger.g0.o());
                int lineBottom = ((StaticLayout) this.f31504t1.f31327f).getLineBottom(2);
                this.f31508v1 = lineBottom;
                this.f31511w1 = lineBottom - ((StaticLayout) this.f31504t1.f31327f).getLineTop(2);
                this.f31506u1 = (int) ((StaticLayout) this.f31504t1.f31327f).getLineRight(2);
            } else {
                this.f31490p1 = r42;
                this.f31497r1.f(true, true);
                this.f31493q1 = r42;
            }
            if (this.f31490p1) {
                int lineEnd = ((StaticLayout) this.f31504t1.f31327f).getLineEnd(2) - 1;
                r0 r0Var2 = this.f31504t1;
                if (lineEnd >= 0) {
                    charSequence4 = charSequence4.subSequence(r42, lineEnd);
                }
                r0Var2.a(charSequence4, textPaint2, L2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new y31(org.telegram.messenger.g0.o()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.f31517y1 = staticLayout;
            if (!z11 || this.f31490p1) {
                z12 = r42;
            }
            this.f31519z1 = z12;
            this.E1 = b0(staticLayout);
        } else {
            this.f31517y1 = null;
            this.f31519z1 = r42;
            this.E1 = 0.0f;
        }
        if (str != null) {
            if (this.R1 == null) {
                this.R1 = new CornerPathEffect(org.telegram.messenger.g0.L(5.0f));
            }
            if (this.S1 == null) {
                Path path = new Path();
                this.S1 = path;
                bi.l2.d(path, 1.35f, r42);
            }
            oy0 oy0Var2 = new oy0(str, i7, org.telegram.messenger.g0.o());
            this.T1 = oy0Var2;
            oy0Var2.f38116p = org.telegram.messenger.g0.L(62.0f);
            return;
        }
        this.S1 = null;
        this.T1 = null;
    }

    public final void D(int i7, CharSequence charSequence) {
        TextPaint textPaint;
        CharSequence charSequence2;
        Layout.Alignment alignment;
        boolean z10;
        int width;
        q0 q0Var;
        TLRPC.Message message;
        gj gjVar;
        int i10;
        float f10;
        int L = i7 - org.telegram.messenger.g0.L(30.0f);
        if (this.f31473j0) {
            L -= org.telegram.messenger.g0.L(64.0f);
        }
        if (Y()) {
            if (this.f31473j0) {
                f10 = 28.0f;
            } else {
                f10 = 82.0f;
            }
            L = Math.min(L - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(272.0f));
        }
        if (L >= 0) {
            int i11 = this.f31466g2;
            if (i11 > 0) {
                L = Math.min(i11, L);
            }
            int i12 = L;
            this.f31458e1 = true;
            if (!Y() && ((gjVar = this.Q0) == null || ((i10 = gjVar.D) != 34 && i10 != 35))) {
                if (gjVar != null && gjVar.f23851s2) {
                    textPaint = (TextPaint) R("paintChatActionText2");
                } else {
                    textPaint = (TextPaint) R("paintChatActionText");
                }
            } else {
                textPaint = (TextPaint) R("paintChatActionText3");
            }
            textPaint.linkColor = textPaint.getColor();
            if (Y()) {
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
            if (Y()) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            TextPaint textPaint2 = textPaint;
            CharSequence charSequence3 = charSequence2;
            this.N = new StaticLayout(charSequence2, textPaint2, i12, alignment2, 1.0f, 0.0f, false);
            this.Q = null;
            gj gjVar2 = this.Q0;
            if (gjVar2 != null && (message = gjVar2.f23817k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                    TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                    if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                        this.Q = new StaticLayout(org.telegram.messenger.j6.n(org.telegram.messenger.g0.X2(hd.M0(2131744366, null)), textPaint2.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint2, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                    }
                }
            }
            if (this.f31499s && (q0Var = this.f31465g1) != null && !q0Var.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31500s0 = org.telegram.ui.Components.p5.update(0, this, z10, this.f31500s0, this.N);
            this.P = 0;
            this.O = 0;
            this.R = 0;
            StaticLayout staticLayout = this.Q;
            if (staticLayout != null) {
                int height = staticLayout.getHeight();
                this.R = height;
                this.R = org.telegram.messenger.g0.L(12.0f) + height;
            }
            gj gjVar3 = this.Q0;
            if (gjVar3 == null || !gjVar3.f23816j2) {
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
                this.T = org.telegram.messenger.k5.C(11.0f, this.R, L2);
            }
            if (Y()) {
                width = this.O;
            } else {
                width = this.N.getWidth();
            }
            this.U = (i7 - width) / 2;
            this.V = (i7 - i12) / 2;
            Stack stack = this.f31496r0;
            ArrayList arrayList = this.f31492q0;
            stack.addAll(arrayList);
            arrayList.clear();
            if (charSequence3 instanceof Spannable) {
                StaticLayout staticLayout2 = this.N;
                int i14 = this.S;
                xh.f.a(this, staticLayout2, i14, i14 + this.O, (Spannable) charSequence3, stack, arrayList, null);
            }
        }
    }

    public final void H(Canvas canvas, boolean z10) {
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
        org.telegram.ui.Wallet.c4 c4Var;
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
        if (!t0Var2.f31499s || ((!t0Var2.T() || z10) && (t0Var2.T() || !z10))) {
            Paint R = t0Var2.R("paintChatActionBackground");
            Paint R2 = t0Var2.R("paintChatActionBackgroundDarken");
            t0Var2.f31503t0 = (TextPaint) t0Var2.R("paintChatActionText");
            int i24 = t0Var2.U0;
            org.telegram.ui.ActionBar.e6 e6Var4 = t0Var2.f31468h1;
            if (i24 >= 0) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(i24, e6Var4);
                if (t0Var2.W0 == null) {
                    Paint paint6 = new Paint(1);
                    t0Var2.W0 = paint6;
                    paint6.setColor(w02);
                    TextPaint textPaint = new TextPaint(1);
                    t0Var2.X0 = textPaint;
                    textPaint.setTypeface(org.telegram.messenger.g0.o());
                    t0Var2.X0.setTextSize(org.telegram.messenger.g0.L(Math.max(16, gz.W0) - 2));
                    t0Var2.X0.setColor(org.telegram.ui.ActionBar.j6.w0(t0Var2.V0, e6Var4));
                }
                R = t0Var2.W0;
                t0Var2.f31503t0 = t0Var2.X0;
            }
            boolean z11 = t0Var2.f31458e1;
            Path path = t0Var2.f31447a1;
            if (z11) {
                t0Var2.f31458e1 = false;
                t0Var2.f31450b1 = t0Var2.getWidth();
                t0Var2.f31453c1 = 0;
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
                    i25 = com.google.android.gms.internal.vision.e2.f(ceil, i25, 1, arrayList3);
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
                    rectF = t0Var2.f31456d1;
                    if (i32 >= lineCount) {
                        break;
                    }
                    int i33 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i32)).intValue();
                    int lineBottom = t0Var2.N.getLineBottom(i32);
                    int i34 = i33 - 1;
                    if (i32 < i34) {
                        paint5 = R2;
                        i19 = ((Integer) arrayList3.get(i32 + 1)).intValue();
                    } else {
                        paint5 = R2;
                        i19 = 0;
                    }
                    int i35 = lineBottom - i31;
                    if (i32 == 0 || intValue2 > i30) {
                        i35 = org.telegram.messenger.g0.L(3.0f) + i35;
                    }
                    if (i32 == i34 || intValue2 > i19) {
                        i35 = org.telegram.messenger.g0.L(3.0f) + i35;
                    }
                    Paint paint7 = R;
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
                    R2 = paint5;
                    R = paint7;
                    e6Var4 = e6Var3;
                    arrayList3 = arrayList2;
                }
                paint = R;
                paint2 = R2;
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
                if (t0Var.Y() && !t0Var.Z()) {
                    rectF.left = (f20 - (t0Var.O / 2.0f)) - org.telegram.messenger.g0.L(17.0f);
                    rectF.top = L5;
                    rectF.right = (t0Var.O / 2.0f) + f20 + org.telegram.messenger.g0.L(17.0f);
                    rectF.bottom = org.telegram.messenger.g0.L(28.0f) + L5 + t0Var.P + t0Var.R;
                    path.reset();
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = R;
                paint2 = R2;
                e6Var = e6Var4;
                f10 = 8.0f;
                f11 = 6.0f;
                f12 = 4.0f;
                f13 = 2.0f;
                t0Var = t0Var2;
            }
            if (!t0Var.f31513x0) {
                t0Var.f31510w0 = ((ViewGroup) t0Var.getParent()).getMeasuredHeight();
            }
            if (e6Var != null) {
                e6Var2 = e6Var;
                e6Var2.b(t0Var.f31507v0, t0Var.f31505u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.f31510w0);
            } else {
                e6Var2 = e6Var;
                org.telegram.ui.ActionBar.j6.r(t0Var.f31507v0, t0Var.f31505u0 + org.telegram.messenger.g0.L(f12), t0Var.getMeasuredWidth(), t0Var.f31510w0);
            }
            boolean z12 = t0Var instanceof ij;
            if (z12 && !org.telegram.ui.ActionBar.j6.i1(e6Var2)) {
                f14 = 0.75f;
            } else {
                f14 = 1.0f;
            }
            if (!z10 || (t0Var.getAlpha() == 1.0f && !z12)) {
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
                paint4.setAlpha((int) (t0Var.getAlpha() * i7 * f14));
                paint3 = paint2;
                paint3.setAlpha((int) (t0Var.getAlpha() * i10 * f14));
            }
            gj gjVar = t0Var.Q0;
            Paint paint8 = t0Var.d2;
            if (gjVar == null || !gjVar.f23816j2) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (t0Var.T() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (t0Var.f31454c2 > 0.0f) {
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
            if (t0Var.V()) {
                int width = t0Var.getWidth();
                t0Var.J0.getClass();
                float L8 = (width - org.telegram.messenger.g0.L(206.0f)) / f13;
                float walletActionTop = t0Var.getWalletActionTop();
                t0Var.J0.getClass();
                float L9 = org.telegram.messenger.g0.L(206.0f) + L8;
                if (t0Var.J0.f43601q0 == null) {
                    L2 = org.telegram.messenger.g0.L(140.0f);
                    f15 = 140.0f;
                    f16 = 20.0f;
                } else {
                    f15 = 140.0f;
                    f16 = 20.0f;
                    L2 = org.telegram.messenger.g0.L(150.0f) + ((int) Math.ceil(c4Var.f43601q0.i()));
                }
                RectF rectF2 = t0Var.O0;
                rectF2.set(L8, walletActionTop, L9, L2 + walletActionTop);
                canvas2.save();
                t0Var.J0.c(canvas2, L8, walletActionTop);
                canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                if (t0Var.T() && paint3.getAlpha() > 0) {
                    canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                }
                f17 = 0.0f;
                if (t0Var.f31454c2 > 0.0f) {
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
            gj gjVar2 = t0Var.Q0;
            if (t0Var.U()) {
                float L10 = t0Var.I0.T.f57087f + org.telegram.messenger.g0.L(f10);
                float width2 = (t0Var.getWidth() - L10) / f13;
                if (t0Var.I0.f8482p) {
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
                if (t0Var.T()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.P0 != null) {
                float L11 = org.telegram.messenger.g0.L(174.0f);
                mw0 mw0Var = t0Var.P0;
                mw0Var.getClass();
                int L12 = org.telegram.messenger.g0.L(f15) + ((int) mw0Var.f37394f.i());
                if (mw0Var.f37396i) {
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
                if (t0Var.T()) {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint3);
                }
            } else if (t0Var.X(gjVar2)) {
                float width4 = (t0Var.getWidth() - t0Var.f31474j1) / f13;
                float f28 = t0Var.T + t0Var.P;
                if (t0Var.Z()) {
                    float L13 = f28 + org.telegram.messenger.g0.L(f12);
                    org.telegram.messenger.g0.P.set(width4, L13, t0Var.f31474j1 + width4, t0Var.f31460f + L13);
                } else {
                    float L14 = f28 + org.telegram.messenger.g0.L(12.0f);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f29 = t0Var.f31474j1;
                    rectF4.set(width4, L14, width4 + f29, f29 + L14 + t0Var.L1);
                }
                if (gjVar2 != null && gjVar2.D == 18 && !t0Var.f31490p1 && (r0Var = t0Var.f31504t1) != null && t0Var.f31493q1 > 0) {
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    rectF5.bottom = com.google.android.gms.internal.vision.e2.t(1.0f, t0Var.f31497r1.f39903c, ((StaticLayout) r0Var.f31327f).getHeight() - t0Var.f31493q1, rectF5.bottom);
                }
                if (t0Var.N1 == null) {
                    t0Var.N1 = new RectF();
                }
                t0Var.N1.set(org.telegram.messenger.g0.P);
                if (gjVar2 != null && (((i11 = gjVar2.D) == 33 || i11 == 35) && t0Var.Z1 != null)) {
                    float[] fArr = t0Var.f31472i2;
                    Arrays.fill(fArr, org.telegram.messenger.g0.L(16.0f));
                    float L15 = org.telegram.messenger.g0.L(f11);
                    fArr[7] = L15;
                    fArr[6] = L15;
                    fArr[5] = L15;
                    fArr[4] = L15;
                    Path path2 = t0Var.f31469h2;
                    path2.rewind();
                    path2.addRoundRect(t0Var.N1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (t0Var.T()) {
                        canvas2.drawPath(path2, paint3);
                    }
                } else {
                    canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint4);
                    if (t0Var.T()) {
                        canvas2.drawRoundRect(t0Var.N1, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), paint3);
                    }
                }
            }
            if (i7 >= 0) {
                paint4.setAlpha(i7);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void J(Canvas canvas) {
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
        canvas2.translate(this.f31476k0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.U, this.T);
        StaticLayout staticLayout = this.N;
        org.telegram.ui.Components.l5 l5Var = this.f31500s0;
        if (staticLayout != null) {
            colorFilter = P(staticLayout.getPaint().getColor());
        } else {
            colorFilter = null;
        }
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas2, staticLayout, l5Var, 0.0f, this.f31492q0, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
        canvas2.restore();
        float f14 = 4.0f;
        if (U()) {
            canvas2.save();
            di.e6 e6Var = this.I0;
            float width = (getWidth() - e6Var.T.f57087f) / 2.0f;
            if (e6Var.f8482p) {
                L = org.telegram.messenger.g0.L(4.0f);
            } else {
                L = org.telegram.messenger.g0.L(16.0f) + this.T + this.P;
            }
            canvas2.translate(width, L);
            this.I0.c(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        i01 i01Var = this.f31486o0;
        org.telegram.ui.ActionBar.e6 e6Var2 = this.f31468h1;
        if (i01Var != null) {
            float alpha = getAlpha();
            if (e6Var2 != null) {
                e6Var2.b(this.f31507v0, this.f31505u0 + 0.0f, getMeasuredWidth(), this.f31510w0);
            } else {
                org.telegram.ui.ActionBar.j6.r(this.f31507v0, this.f31505u0 + 0.0f, getMeasuredWidth(), this.f31510w0);
            }
            this.f31486o0.c(canvas, getWidth(), this.f31476k0, 0.0f, 1.0f, alpha, this.f31484n0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.Y1;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (e6Var2 != null) {
                e6Var2.b(this.f31507v0, this.f31505u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f31510w0);
            } else {
                org.telegram.ui.ActionBar.j6.r(this.f31507v0, this.f31505u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f31510w0);
            }
            float width2 = (getWidth() - this.f31474j1) / 2.0f;
            float L2 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + this.T + this.P + this.f31460f;
            float L3 = (this.f31474j1 - org.telegram.messenger.g0.L(4.0f)) / 2.0f;
            int i12 = 0;
            while (i12 < arrayList.size()) {
                c0 c0Var = (c0) arrayList.get(i12);
                float a10 = c0Var.a();
                float L4 = ((org.telegram.messenger.g0.L(f14) + L3) * i12) + width2;
                float f15 = L4 + L3;
                RectF rectF = this.f31456d1;
                rectF.set(L4, L2, f15, c0Var.f30066f + L2);
                canvas2.save();
                if (a10 != 1.0f) {
                    f10 = f14;
                    canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
                } else {
                    f10 = f14;
                }
                float[] fArr = this.f31475j2;
                Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, gz.Y0)));
                if ((c0Var.f30067g & 9) == 9) {
                    float L5 = org.telegram.messenger.g0.L(gz.Y0);
                    fArr[7] = L5;
                    fArr[6] = L5;
                }
                if ((c0Var.f30067g & 10) == 10) {
                    float L6 = org.telegram.messenger.g0.L(gz.Y0);
                    fArr[5] = L6;
                    fArr[4] = L6;
                }
                Path path = this.f31478k2;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas2.drawPath(path, R("paintChatActionBackground"));
                if (T()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.f28919h2);
                }
                canvas2.save();
                canvas2.clipPath(path);
                y yVar = c0Var.f30078s;
                if (yVar != null) {
                    int i13 = (int) L2;
                    yVar.setBounds((int) L4, i13, (int) f15, c0Var.f30066f + i13);
                    c0Var.f30078s.setAlpha(255);
                    c0Var.f30078s.draw(canvas2);
                }
                canvas2.restore();
                canvas2.save();
                if (c0Var.f30079t != null) {
                    i7 = org.telegram.messenger.g0.L(26.0f);
                } else {
                    i7 = 0;
                }
                float k10 = c0Var.h.k();
                if (c0Var.f30079t != null) {
                    i10 = org.telegram.messenger.g0.L(f10);
                } else {
                    i10 = 0;
                }
                float f16 = i7;
                float A = com.google.android.gms.internal.vision.e2.A(L3 - (k10 + i10), f16, f13, L4);
                Drawable drawable = c0Var.f30079t;
                if (drawable != null) {
                    int i14 = (int) A;
                    f11 = f13;
                    drawable.setBounds(i14, (int) (((c0Var.f30066f - org.telegram.messenger.g0.L(24.0f)) / f13) + L2), org.telegram.messenger.g0.L(24.0f) + i14, org.telegram.messenger.g0.L(24.0f) + ((int) (((c0Var.f30066f - org.telegram.messenger.g0.L(24.0f)) / f11) + L2)));
                    Drawable drawable2 = c0Var.f30079t;
                    if (c0Var.f30072m) {
                        i11 = 128;
                    } else {
                        i11 = 255;
                    }
                    drawable2.setAlpha(i11);
                    c0Var.f30079t.draw(canvas2);
                    A += f16;
                } else {
                    f11 = f13;
                }
                c0Var.h.f38116p = Math.max(1, (((int) L3) - org.telegram.messenger.g0.L(15.0f)) - i7);
                oy0 oy0Var = c0Var.h;
                float L7 = (org.telegram.messenger.g0.L(40.0f) / f11) + L2;
                if (c0Var.f30072m) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                oy0Var.f(canvas2, A, L7, f12);
                canvas2.restore();
                canvas2.restore();
                i12++;
                f14 = f10;
                f13 = f11;
            }
        }
    }

    public final void K(Canvas canvas, boolean z10) {
        if (this.f31499s) {
            if (!T() || z10) {
                if (!T() && z10) {
                    return;
                }
            } else {
                return;
            }
        }
        L(canvas, z10, null);
    }

    public final void L(Canvas canvas, boolean z10, Integer num) {
        float f10;
        Canvas canvas2;
        float f11 = 1.0f;
        if (z10) {
            f10 = getAlpha();
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f31468h1;
            if (e6Var != null) {
                e6Var.b(this.f31507v0, this.f31505u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f31510w0);
            } else {
                org.telegram.ui.ActionBar.j6.r(this.f31507v0, this.f31505u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f31510w0);
            }
            gj gjVar = this.Q0;
            if (gjVar != null && gjVar.O5()) {
                ch.q0 q0Var = this.F0;
                q0Var.getClass();
                q0Var.f5191a = 1.0f;
                int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i7 < 0) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f10 * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                s0 s0Var = this.f31502s2;
                if (s0Var.f31384b) {
                    f11 = s0Var.f31385c;
                }
                q0Var.d(canvas2, f11, num);
                if (i7 < 0) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void M(ol olVar, Canvas canvas, int i7, Integer num, float f10) {
        ch.q0 q0Var = this.F0;
        q0Var.getClass();
        org.telegram.ui.ActionBar.e6 e6Var = this.f31468h1;
        if (e6Var != null) {
            e6Var.b(this.f31507v0, this.f31505u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f31510w0);
        } else {
            org.telegram.ui.ActionBar.j6.r(this.f31507v0, this.f31505u0 + org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), this.f31510w0);
        }
        q0Var.A = f10;
        q0Var.f(olVar, canvas, i7, num);
    }

    @Override
    public final void N(String str) {
        TLRPC.PhotoSize photoSize;
        gj gjVar = this.Q0;
        if (gjVar != null && gjVar.D == 11) {
            int size = gjVar.f23837p0.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    photoSize = (TLRPC.PhotoSize) gjVar.f23837p0.get(i7);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        break;
                    }
                    i7++;
                } else {
                    photoSize = null;
                    break;
                }
            }
            this.J.r0(this.f31516y0, "g", gc.f(photoSize, gjVar.f23830n0), "50_50_b", this.M, 0L, null, gjVar, 1);
            org.telegram.messenger.z5.q(this.I).v(this);
        }
    }

    public final ColorFilter P(int i7) {
        if (i7 != this.f31498r2 || this.f31494q2 == null) {
            this.f31498r2 = i7;
            this.f31494q2 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        return this.f31494q2;
    }

    public final int Q(gj gjVar) {
        int i7;
        int i10 = this.f31471i1;
        int i11 = gjVar.D;
        if (i11 == 37) {
            i10 = org.telegram.messenger.g0.L(52.0f);
        } else if (i11 == 21 || Z()) {
            i10 = org.telegram.messenger.g0.L(78.0f);
        }
        if (!Y() && (i7 = gjVar.D) != 34 && i7 != 35) {
            return i10;
        }
        return 0;
    }

    public Paint R(String str) {
        Paint paint;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31468h1;
        if (e6Var != null) {
            paint = e6Var.d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return org.telegram.ui.ActionBar.j6.V0(str);
    }

    public final float S(gj gjVar) {
        np s12;
        String str;
        if (gjVar != null) {
            try {
                if (gjVar.D == 22 && (str = (s12 = np.s1(this.I)).R2) != null && TextUtils.equals(gjVar.f23817k.action.wallpaper.uploadingImage, str)) {
                    return s12.S2.f28467r;
                }
                return 1.0f;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return 1.0f;
            }
        }
        return 1.0f;
    }

    public final boolean T() {
        if (this.W0 == null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f31468h1;
            if (e6Var != null) {
                if (e6Var.g()) {
                    return true;
                }
                return false;
            } else if (org.telegram.ui.ActionBar.j6.d1()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean U() {
        di.e6 e6Var = this.I0;
        if (e6Var != null && e6Var.Q != null) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        TLRPC.Message message;
        gj gjVar = this.Q0;
        if (gjVar != null && (message = gjVar.f23817k) != null && (message.action instanceof TLRPC.TL_messageActionGramTransfer)) {
            return true;
        }
        return false;
    }

    public final void W() {
        q0 q0Var = this.f31465g1;
        if (q0Var != null && q0Var.g()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean X(gj gjVar) {
        if (gjVar != null) {
            int i7 = gjVar.D;
            if (i7 == 30 || i7 == 18 || i7 == 25 || Z()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Y() {
        TLRPC.Message message;
        gj gjVar = this.Q0;
        if (gjVar != null && (message = gjVar.f23817k) != null && (message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        gj gjVar;
        int i7;
        if (!U() && this.P0 == null && (i7 = (gjVar = this.Q0).D) != 31 && i7 != 37 && i7 != 33 && i7 != 35 && i7 != 34 && i7 != 21 && i7 != 22 && !gjVar.z4()) {
            TLRPC.Message message = this.Q0.f23817k;
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

    @Override
    public final boolean a() {
        return false;
    }

    public final boolean a0() {
        gj gjVar = this.Q0;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23817k;
            TLRPC.MessageAction messageAction = message.action;
            if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
                return q10.B(np.s1(this.I).a2(Long.valueOf(this.Q0.f23817k.from_id.user_id)));
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        q0 q0Var = this.f31465g1;
        if (q0Var != null) {
            q0Var.x0(this, reactionCount, z10, f10, f11);
        }
    }

    public final void c0(CharacterStyle characterStyle) {
        if (this.f31465g1 != null && (characterStyle instanceof URLSpan)) {
            String url = ((URLSpan) characterStyle).getURL();
            if (url.startsWith("task")) {
                this.f31465g1.v(this, this.Q0.N1(), Integer.parseInt(url.substring(5)));
                return;
            }
            if (url.startsWith("topic")) {
                URLSpan uRLSpan = this.f31515y;
                if (uRLSpan instanceof f41) {
                    TLObject tLObject = ((f41) uRLSpan).f34519c;
                    if (tLObject instanceof TLRPC.TL_forumTopic) {
                        qg.c.m(this.f31465g1.F(), -this.f31465g1.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("invite")) {
                URLSpan uRLSpan2 = this.f31515y;
                if (uRLSpan2 instanceof f41) {
                    TLObject tLObject2 = ((f41) uRLSpan2).f34519c;
                    if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                        this.f31465g1.M((TLRPC.TL_chatInviteExported) tLObject2);
                        return;
                    }
                    return;
                }
            }
            if (url.startsWith("game")) {
                this.f31465g1.n(this, this.Q0.N1());
            } else if (url.startsWith("http")) {
                vf.c.t(getContext(), url);
            } else {
                this.f31465g1.b0(Long.parseLong(url));
            }
        }
    }

    public final void d0() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        gj gjVar = this.Q0;
        TLRPC.MessageAction messageAction = gjVar.f23817k.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (gjVar != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !a0()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.Q0.f23817k.action).slug;
        }
        if (this.f31465g1 != null) {
            org.telegram.messenger.g0.h3(new ki.n(this, tL_premiumGiftOption, str, 24));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        if (i7 == ns.f25532m1) {
            setSpoilersSuppressed(false);
        } else if (i7 == ns.f25514i4) {
            invalidate();
        } else if (i7 == ns.l1) {
            setSpoilersSuppressed(true);
        } else if (i7 != ns.W2 && i7 != ns.F3 && i7 != ns.X2) {
            if (i7 == ns.f25607y0) {
                if (Objects.equals(objArr[0], m10.i(this.I).f24941c0) && (gjVar = this.Q0) != null) {
                    h0(gjVar, true);
                }
            } else if (i7 == ns.f25467a4 && V()) {
                this.f31485n2 = null;
                this.W = 0;
                requestLayout();
                invalidate();
            }
        } else {
            gj gjVar2 = this.Q0;
            if (gjVar2 != null) {
                h0(gjVar2, true);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.U1) {
            float a10 = this.f31483n.a(0.02f);
            canvas.save();
            canvas.scale(a10, a10, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e0() {
        TLRPC.Message message;
        gj gjVar = this.Q0;
        if (gjVar != null && (message = gjVar.f23817k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
            fi.h7 h7Var = this.f31457e0;
            if (z10) {
                Context context = getContext();
                TLRPC.Message message2 = this.Q0.f23817k;
                int i7 = message2.date;
                TLRPC.Peer peer = message2.from_id;
                TLRPC.Peer peer2 = message2.peer_id;
                TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
                org.telegram.ui.ActionBar.e6 e6Var = h7Var.J;
                TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
                starsTransaction.title = null;
                starsTransaction.description = null;
                starsTransaction.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
                starsTransaction.peer = tL_starsTransactionPeer;
                tL_starsTransactionPeer.peer = peer;
                starsTransaction.date = i7;
                starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
                starsTransaction.f28282id = tL_messageActionGiftStars.transaction_id;
                starsTransaction.gift = true;
                starsTransaction.sent_by = peer;
                starsTransaction.received_by = peer2;
                mb.k1(context, false, 0L, this.I, starsTransaction, e6Var);
            } else if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
                Context context2 = getContext();
                TLRPC.Message message3 = this.Q0.f23817k;
                int i10 = message3.date;
                TLRPC.Peer peer3 = message3.from_id;
                TLRPC.Peer peer4 = message3.peer_id;
                TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
                org.telegram.ui.ActionBar.e6 e6Var2 = h7Var.J;
                TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
                starsTransaction2.title = null;
                starsTransaction2.description = null;
                starsTransaction2.photo = null;
                TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
                starsTransaction2.peer = tL_starsTransactionPeer2;
                tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
                starsTransaction2.date = i10;
                starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
                starsTransaction2.f28282id = tL_messageActionPrizeStars.transaction_id;
                starsTransaction2.gift = true;
                starsTransaction2.flags |= 8192;
                starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
                starsTransaction2.sent_by = peer3;
                starsTransaction2.received_by = peer4;
                mb.k1(context2, false, 0L, this.I, starsTransaction2, e6Var2);
            } else if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
                Context context3 = getContext();
                TLRPC.Message message4 = this.Q0.f23817k;
                int i11 = message4.date;
                TLRPC.Peer peer5 = message4.from_id;
                TLRPC.Peer peer6 = message4.peer_id;
                TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
                org.telegram.ui.ActionBar.e6 e6Var3 = h7Var.J;
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
                starsTransaction3.f28282id = tL_messageActionGiftTon.transaction_id;
                starsTransaction3.gift = true;
                starsTransaction3.sent_by = peer5;
                starsTransaction3.received_by = peer6;
                mb.k1(context3, false, 0L, this.I, starsTransaction3, e6Var3);
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                if (!((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                    di.c6 c6Var = new di.c6(getContext(), this.I, gj.B0(this.Q0.f23817k), this.f31468h1, null);
                    c6Var.j2(this.Q0, null);
                    c6Var.show();
                }
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                if (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        org.telegram.messenger.k5.n(null, 2131743880, cc.a0(T), 2131624021, 36);
                        return;
                    }
                    return;
                }
                di.c6 c6Var2 = new di.c6(getContext(), this.I, gj.B0(this.Q0.f23817k), this.f31468h1, null);
                c6Var2.j2(this.Q0, null);
                c6Var2.show();
            } else if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                    TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        di.c6 c6Var3 = new di.c6(getContext(), this.I, gj.B0(this.Q0.f23817k), this.f31468h1, null);
                        c6Var3.i2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                        c6Var3.show();
                    }
                }
            }
        }
    }

    public final boolean f0(float f10, float f11, uf ufVar) {
        if (V() && !this.Q0.P3() && !this.Q0.f23817k.premiumEffectWasPlayed) {
            float y10 = getY() + getPaddingTop() + getWalletActionTop();
            if (y10 >= f10 && y10 + org.telegram.messenger.g0.L(140.0f) <= f11) {
                org.telegram.ui.Wallet.c4 c4Var = this.J0;
                ch0 ch0Var = c4Var.f43591l;
                if (c4Var.f43586i0 && c4Var.f43588j0 == null) {
                    c4Var.f43586i0 = false;
                    c4Var.f43590k0 = ufVar;
                    c4Var.K.e(true, 0.0f);
                    c4Var.M = false;
                    c4Var.N = 0L;
                    c4Var.b();
                    c4Var.g();
                    c4Var.f43606t = 18.0f;
                    c4Var.f43608u.f();
                    ch0Var.T(true, 0.0f);
                    ch0Var.start();
                    c4Var.H = true;
                    float f12 = c4Var.R;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    c4Var.f43588j0 = ofFloat;
                    ofFloat.setDuration(2400L);
                    c4Var.f43588j0.setInterpolator(er.h);
                    c4Var.f43588j0.addUpdateListener(new pf(c4Var, f12, 5));
                    c4Var.f43588j0.addListener(new g71(c4Var, 6));
                    c4Var.f43588j0.start();
                    c4Var.f43571a.invalidate();
                    this.Q0.f23817k.premiumEffectWasPlayed = true;
                    vr.a0(this.I).X1(gj.B0(this.Q0.f23817k), this.Q0.f23817k);
                    return true;
                }
            }
        }
        return false;
    }

    public final void g0(int i7, boolean z10, boolean z11) {
        String u10;
        int i10 = this.R0;
        if (i10 != i7 && i10 / 3600 != i7 / 3600) {
            if (z10) {
                if (i7 == 2147483646) {
                    u10 = hd.M0(2131748492, "MessageScheduledUntilOnline");
                } else {
                    u10 = hd.a0("MessageScheduledOn", null, 2131748528, hd.u(i7, false));
                }
            } else {
                u10 = hd.u(i7, false);
            }
            this.R0 = i7;
            CharSequence charSequence = this.S0;
            if (charSequence == null || !TextUtils.equals(u10, charSequence)) {
                this.S0 = u10;
                this.f31485n2 = null;
                k0(z11);
            }
        }
    }

    public ImageReceiver getAvatarImage() {
        return null;
    }

    @Override
    public int getBoundsLeft() {
        if (U()) {
            int width = ((int) (getWidth() - (this.I0.T.f57087f + org.telegram.messenger.g0.L(8.0f)))) / 2;
            if (this.I0.f8482p) {
                return width;
            }
            return Math.min(this.f31450b1, width);
        } else if (X(this.Q0)) {
            return i5.c.e(getWidth(), this.f31474j1, 2, this.f31476k0 / 2);
        } else {
            int i7 = this.f31450b1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i7 = Math.min((int) imageReceiver.L0, i7);
            }
            return (this.f31476k0 / 2) + i7;
        }
    }

    @Override
    public int getBoundsRight() {
        int i7;
        int i10;
        if (U()) {
            int L = ((int) ((this.I0.T.f57087f + org.telegram.messenger.g0.L(8.0f)) + getWidth())) / 2;
            if (this.I0.f8482p) {
                return L;
            }
            return Math.max(this.f31453c1, L);
        }
        if (X(this.Q0)) {
            i7 = this.f31476k0 / 2;
            i10 = (getWidth() + this.f31474j1) / 2;
        } else {
            i7 = this.f31453c1;
            ImageReceiver imageReceiver = this.J;
            if (imageReceiver != null && imageReceiver.R0) {
                i7 = Math.max((int) imageReceiver.y(), i7);
            }
            i10 = this.f31476k0 / 2;
        }
        return i10 + i7;
    }

    @Override
    public float getCheckBoxTranslation() {
        return 0.0f;
    }

    public yi getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.R0;
    }

    public q0 getDelegate() {
        return this.f31465g1;
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
    public gj getMessageObject() {
        return this.Q0;
    }

    @Override
    public int getObserverTag() {
        return this.f31512x;
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

    public s0 getTransitionParams() {
        return this.f31502s2;
    }

    public float getWalletSlidingOffset() {
        return this.N0;
    }

    public final void h0(org.telegram.messenger.gj r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t0.h0(org.telegram.messenger.gj, boolean):void");
    }

    public final void i0(int i7, int i10) {
        this.U0 = i7;
        this.V0 = i10;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        View view = this.f31509w;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.f31491p2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f31488o2 || getParent() == null) {
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

    public final void j0(float f10, int i7) {
        this.f31513x0 = true;
        this.f31510w0 = i7;
        this.f31505u0 = f10;
        this.f31507v0 = 0.0f;
    }

    public final void k0(boolean z10) {
        if (getMeasuredWidth() != 0) {
            D(getMeasuredWidth(), this.S0);
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
        this.f31459e2 = true;
        this.J.P();
        setStarsPaused(false);
        if (this.f31499s && (q0Var = this.f31465g1) != null && !q0Var.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31500s0 = org.telegram.ui.Components.p5.update(0, this, z10, this.f31500s0, this.N);
        r0 r0Var = this.f31504t1;
        if (r0Var != null) {
            r0Var.h = org.telegram.ui.Components.p5.update(0, (View) ((t0) r0Var.f31329i), false, (org.telegram.ui.Components.l5) r0Var.h, (StaticLayout) r0Var.f31327f);
        }
        int i7 = this.I;
        ns.f(i7).c(this, ns.W2);
        ns.f(i7).c(this, ns.X2);
        ns.f(i7).c(this, ns.F3);
        ns.f(i7).c(this, ns.f25607y0);
        ns.f(i7).c(this, ns.f25467a4);
        ns.e().c(this, ns.f25514i4);
        gj gjVar = this.Q0;
        if (gjVar != null && gjVar.D == 21) {
            h0(gjVar, true);
        }
        di.e6 e6Var = this.I0;
        if (e6Var != null) {
            e6Var.a();
        }
        ch.q0 q0Var2 = this.F0;
        ArrayList arrayList = q0Var2.f5207s;
        q0Var2.D = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ch.n0) arrayList.get(i10)).a();
        }
        i01 i01Var = this.f31486o0;
        if (i01Var != null) {
            i01Var.a();
        }
        mw0 mw0Var = this.P0;
        if (mw0Var != null) {
            mw0Var.d.R(mw0Var.f37391b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31459e2 = false;
        int i7 = this.I;
        org.telegram.messenger.z5.q(i7).v(this);
        this.J.R();
        setStarsPaused(true);
        this.D0 = false;
        org.telegram.ui.Components.p5.release(this, this.f31500s0);
        r0 r0Var = this.f31504t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.f31329i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        ns.f(i7).n(this, ns.W2);
        ns.f(i7).n(this, ns.X2);
        ns.f(i7).n(this, ns.F3);
        ns.f(i7).n(this, ns.f25607y0);
        ns.f(i7).n(this, ns.f25467a4);
        ns.e().n(this, ns.f25514i4);
        this.f31457e0.g();
        this.f31502s2.f31383a = false;
        di.e6 e6Var = this.I0;
        if (e6Var != null) {
            e6Var.S = false;
            e6Var.d.R();
            e6Var.f8472e.b();
            bi.g1 g1Var = e6Var.f8490y;
            g1Var.d.R();
            org.telegram.ui.Components.p5.release((View) null, g1Var.f3539q);
            g1Var.f3539q = null;
        }
        this.F0.p();
        i01 i01Var = this.f31486o0;
        if (i01Var != null) {
            i01Var.b();
        }
        mw0 mw0Var = this.P0;
        if (mw0Var != null) {
            mw0Var.d.R(null);
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
        gj gjVar = this.Q0;
        if (TextUtils.isEmpty(this.S0) && gjVar == null) {
            return;
        }
        if (this.f31485n2 == null) {
            if (!TextUtils.isEmpty(this.S0)) {
                charSequence = this.S0;
            } else {
                charSequence = gjVar.v;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new h(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.f31485n2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.f31485n2.toString());
        } else {
            accessibilityNodeInfo.setText(this.f31485n2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Wallet.b4 b4Var;
        RectF rectF = this.f31489p0;
        this.U1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        org.telegram.ui.Wallet.c4 c4Var = this.J0;
        if (c4Var == null) {
            b4Var = null;
        } else {
            b4Var = c4Var.f43593m;
        }
        if (b4Var != null) {
            b4Var.layout(0, 0, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f));
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
        q0 q0Var = this.f31465g1;
        if (q0Var != null) {
            return q0Var.p0(this, this.f31518z0, this.A0);
        }
        return false;
    }

    public void setCustomText(CharSequence charSequence) {
        this.S0 = charSequence;
        if (charSequence != null) {
            k0(false);
        }
    }

    public void setDelegate(q0 q0Var) {
        this.f31465g1 = q0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.f31462f1 == z10) {
            return;
        }
        this.f31462f1 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f31491p2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.f31509w = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.f31488o2 = z10;
    }

    public void setMessageObject(gj gjVar) {
        h0(gjVar, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.f31463f2 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i7) {
        this.f31466g2 = i7;
    }

    public void setScrimReaction(Integer num) {
        this.F0.f5213z = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.f31484n0 != z10) {
            this.f31484n0 = z10;
            W();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        this.K0 = z10;
        org.telegram.ui.Wallet.c4 c4Var = this.J0;
        if (c4Var != null) {
            c4Var.n(z10);
        }
        ArrayList arrayList = this.f31492q0;
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
        RectF rectF = this.f31456d1;
        this.f31450b1 = (int) Math.min(this.f31450b1, rectF.left);
        this.f31453c1 = (int) Math.max(this.f31453c1, rectF.right);
    }

    public final boolean y(float f10, int i7) {
        ch.q0 q0Var = this.F0;
        if (!q0Var.H) {
            return false;
        }
        float y10 = getY() + q0Var.f5193c;
        if (y10 <= f10 || (y10 + q0Var.f5201m) - org.telegram.messenger.g0.L(16.0f) >= i7) {
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
        int L = this.f31474j1 - org.telegram.messenger.g0.L(16.0f);
        TextPaint textPaint = this.F1;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        TextPaint textPaint2 = this.G1;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.Q0.f23817k.action;
        int i7 = tL_messageActionGiftCode.months;
        TLRPC.Chat M02 = np.s1(this.I).M0(Long.valueOf(-org.telegram.messenger.m5.o(tL_messageActionGiftCode.boost_peer)));
        if (M02 == null) {
            str = null;
        } else {
            str = M02.title;
        }
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
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
        if (z10) {
            if (tL_messageActionGiftCode.unclaimed) {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753166, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.k5.p(null, null, 2131753175, new Object[]{G}, spannableStringBuilder);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753307, str)));
                spannableStringBuilder.append((CharSequence) "\n\n");
                org.telegram.messenger.k5.p(null, null, 2131753308, new Object[]{G}, spannableStringBuilder);
            }
        } else {
            if (str == null) {
                a02 = hd.M0(2131753310, null);
            } else {
                a02 = hd.a0("BoostingReceivedGiftFrom", null, 2131753311, str);
            }
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
            spannableStringBuilder.append((CharSequence) "\n\n");
            org.telegram.messenger.k5.p(null, null, 2131753312, new Object[]{G}, spannableStringBuilder);
        }
        String M03 = hd.M0(2131753309, "BoostingReceivedGiftOpenBtn");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        valueOf.setSpan(new y31(org.telegram.messenger.g0.o()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f31477k1 = new StaticLayout(valueOf, textPaint, L, alignment, 1.1f, 0.0f, false);
        this.n1 = null;
        this.f31481m1 = null;
        r0 r0Var = this.f31504t1;
        if (r0Var != null) {
            org.telegram.ui.Components.p5.release((t0) r0Var.f31329i, (org.telegram.ui.Components.l5) r0Var.h);
        }
        r0 r0Var2 = new r0(this);
        this.f31504t1 = r0Var2;
        r0Var2.a(spannableStringBuilder, textPaint2, L);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(M03);
        valueOf2.setSpan(new y31(org.telegram.messenger.g0.o()), 0, valueOf2.length(), 33);
        this.f31490p1 = false;
        this.f31493q1 = 0;
        this.f31514x1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) R("paintChatActionText"), L, alignment, 1.0f, 0.0f, false);
        this.f31517y1 = staticLayout;
        this.f31519z1 = true;
        this.E1 = b0(staticLayout);
    }

    public t0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f31483n = new dc(this);
        int i7 = m10.f24934t0;
        this.I = i7;
        fi.h7 h7Var = new fi.h7(null, false);
        this.f31457e0 = h7Var;
        this.f31484n0 = true;
        this.f31489p0 = new RectF();
        this.f31492q0 = new ArrayList();
        this.f31496r0 = new Stack();
        this.F0 = new ch.q0(this);
        this.O0 = new RectF();
        this.U0 = -1;
        this.V0 = -1;
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f31447a1 = new Path();
        this.f31456d1 = new RectF();
        this.f31458e1 = true;
        this.f31462f1 = false;
        this.f31487o1 = false;
        this.f31490p1 = false;
        this.f31497r1 = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.f31519z1 = true;
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
        this.f31451b2 = -1;
        this.d2 = new Paint(1);
        this.f31469h2 = new Path();
        this.f31472i2 = new float[8];
        this.f31475j2 = new float[8];
        this.f31478k2 = new Path();
        this.f31480l2 = new int[]{16842910, 16842919};
        this.f31502s2 = new s0(this);
        h7Var.f11778a = false;
        this.f31499s = z10;
        this.f31468h1 = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.J = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.f23613u / 2);
        this.M = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f31512x = org.telegram.messenger.z5.q(i7).k();
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.U1 = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.1f, -16777216), 7, org.telegram.messenger.g0.L(16.0f)));
        view.setVisibility(8);
        addView(view);
        ug.r1 r1Var = new ug.r1(10);
        this.W1 = r1Var;
        r1Var.O = 100;
        r1Var.J = false;
        r1Var.M = true;
        r1Var.G = false;
        r1Var.K = true;
        r1Var.H = true;
        r1Var.f58320r = 1;
        r1Var.f58324w = 0.98f;
        r1Var.v = 0.98f;
        r1Var.f58323u = 0.98f;
        r1Var.f58310g = false;
        r1Var.f58317o = 0.0f;
        r1Var.f58325x = 750L;
        r1Var.f58326y = 750;
        r1Var.c();
    }

    @Override
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.f31509w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f31488o2 || getParent() == null) {
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
        View view = this.f31509w;
        if (view != null) {
            view.invalidate();
        }
        if (!this.f31488o2 || getParent() == null) {
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
    public final void i(long j3, long j10) {
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
