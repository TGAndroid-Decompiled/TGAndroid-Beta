package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import di.pb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bz;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.bx;
public class u2 extends z implements fi.v6, org.telegram.ui.ActionBar.c6 {
    public boolean A0;
    public boolean A1;
    public StaticLayout A2;
    public boolean A3;
    public boolean A4;
    public boolean B0;
    public boolean B1;
    public boolean B2;
    public boolean B3;
    public ValueAnimator B4;
    public boolean C0;
    public float C1;
    public float C2;
    public boolean C3;
    public long C4;
    public float D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public ih.c E0;
    public float E1;
    public boolean E2;
    public int E3;
    public final bx E4;
    public boolean F;
    public int F0;
    public boolean F1;
    public Paint F2;
    public int F3;
    public StaticLayout F4;
    public boolean G;
    public final int G0;
    public final lc G1;
    public Paint G2;
    public float G3;
    public int G4;
    public c7 H;
    public p2 H0;
    public final Paint H1;
    public boolean H2;
    public boolean H3;
    public int H4;
    public int I;
    public long I0;
    public final RectF I1;
    public int I2;
    public boolean I3;
    public int I4;
    public int J;
    public String J0;
    public wy0 J1;
    public int J2;
    public int J3;
    public final r2 J4;
    public int K;
    public int K0;
    public boolean K1;
    public int K2;
    public LayerDrawable K3;
    public final org.telegram.ui.ActionBar.i6 K4;
    public int L;
    public long L0;
    public hi.c7 L1;
    public int L2;
    public int L3;
    public int L4;
    public final int M;
    public String M0;
    public boolean M1;
    public int M2;
    public boolean M3;
    public int M4;
    public final int N;
    public int N0;
    public int N1;
    public int N2;
    public int N3;
    public int N4;
    public TLRPC.TL_forumTopic O;
    public boolean O0;
    public int O1;
    public StaticLayout O2;
    public int O3;
    public t2 O4;
    public boolean P;
    public boolean P0;
    public String P1;
    public int P2;
    public int P3;
    public GradientDrawable P4;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public boolean R0;
    public nh0 R1;
    public boolean R2;
    public int R3;
    public int R4;
    public boolean S;
    public int S0;
    public int S1;
    public boolean S2;
    public boolean S3;
    public Paint S4;
    public Paint T;
    public int T0;
    public boolean T1;
    public boolean T2;
    public final te.a T3;
    public ug.a1 T4;
    public Paint U;
    public boolean U0;
    public Paint U1;
    public int U2;
    public ValueAnimator U3;
    public Drawable U4;
    public float V;
    public int V0;
    public final boolean[] V1;
    public int V2;
    public ValueAnimator V3;
    public int V4;
    public boolean W;
    public int W0;
    public final ImageReceiver[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public int X0;
    public final boolean[] X1;
    public int X2;
    public float X3;
    public Drawable X4;
    public boolean Y0;
    public final boolean[] Y1;
    public int Y2;
    public StaticLayout Y3;
    public ColorFilter[] Y4;
    public int Z0;
    public final ImageReceiver Z1;
    public int Z2;
    public StaticLayout Z3;
    public int[] Z4;
    public boolean f31972a0;
    public boolean f31973a1;
    public ld0 f31974a2;
    public int f31975a3;
    public StaticLayout f31976a4;
    public Runnable f31977a5;
    public TextPaint f31978b0;
    public boolean f31979b1;
    public final org.telegram.ui.Components.a9 f31980b2;
    public int f31981b3;
    public StaticLayout f31982b4;
    public Paint f31983c0;
    public boolean f31984c1;
    public boolean f31985c2;
    public int f31986c3;
    public boolean f31987c4;
    public tc f31988d0;
    public float f31989d1;
    public float d2;
    public int f31990d3;
    public boolean f31991d4;
    public q2 f31992e0;
    public boolean f31993e1;
    public final c5.c f31994e2;
    public int f31995e3;
    public boolean f31996e4;
    public boolean f31997f;
    public boolean f31998f0;
    public boolean f31999f1;
    public yg0 f32000f2;
    public StaticLayout f32001f3;
    public int f32002f4;
    public boolean f32003g0;
    public fj f32004g1;
    public TLRPC.User f32005g2;
    public StaticLayout f32006g3;
    public int f32007g4;
    public final boolean h;
    public boolean f32008h0;
    public ArrayList f32009h1;
    public TLRPC.Chat f32010h2;
    public int f32011h3;
    public int f32012h4;
    public Drawable[] f32013i0;
    public boolean f32014i1;
    public TLRPC.EncryptedChat f32015i2;
    public StaticLayout f32016i3;
    public int f32017i4;
    public float f32018j0;
    public CharSequence f32019j1;
    public CharSequence f32020j2;
    public final Stack j3;
    public StaticLayout f32021j4;
    public boolean f32022k0;
    public int f32023k1;
    public int f32024k2;
    public final ArrayList f32025k3;
    public boolean f32026k4;
    public boolean f32027l0;
    public int l1;
    public boolean f32028l2;
    public final Stack f32029l3;
    public boolean f32030l4;
    public int m0;
    public int f32031m1;
    public TLRPC.DraftMessage f32032m2;
    public final ArrayList f32033m3;
    public boolean f32034m4;
    public float f32035n;
    public float f32036n0;
    public boolean n1;
    public final org.telegram.ui.Components.c6 f32037n2;
    public org.telegram.ui.Components.t5 f32038n3;
    public final bi.o3 f32039n4;
    public k01 f32040o0;
    public boolean f32041o1;
    public boolean f32042o2;
    public org.telegram.ui.Components.t5 f32043o3;
    public final org.telegram.ui.Components.m5 o4;
    public Paint f32044p0;
    public float f32045p1;
    public final org.telegram.ui.Components.c6 f32046p2;
    public org.telegram.ui.Components.t5 f32047p3;
    public final org.telegram.ui.Components.m5 f32048p4;
    public Paint f32049q0;
    public float f32050q1;
    public long f32051q2;
    public org.telegram.ui.Components.t5 f32052q3;
    public int f32053q4;
    public boolean f32054r;
    public boolean f32055r0;
    public float f32056r1;
    public hi.h3 f32057r2;
    public int f32058r3;
    public boolean f32059r4;
    public nh0 f32060s;
    public boolean f32061s0;
    public float f32062s1;
    public final boolean f32063s2;
    public int f32064s3;
    public final RectF f32065s4;
    public boolean f32066t0;
    public int f32067t1;
    public boolean f32068t2;
    public StaticLayout f32069t3;
    public jg.j f32070t4;
    public ab.c0 f32071u0;
    public float f32072u1;
    public boolean f32073u2;
    public boolean f32074u3;
    public Path f32075u4;
    public final n2 f32076v0;
    public int f32077v1;
    public boolean f32078v2;
    public int f32079v3;
    public RectF f32080v4;
    public int f32081w;
    public Path f32082w0;
    public int f32083w1;
    public boolean f32084w2;
    public int f32085w3;
    public int f32086w4;
    public boolean f32087x;
    public xh.f f32088x0;
    public float f32089x1;
    public boolean f32090x2;
    public boolean f32091x3;
    public int f32092x4;
    public boolean f32093y;
    public boolean f32094y0;
    public boolean f32095y1;
    public int f32096y2;
    public float f32097y3;
    public int f32098y4;
    public boolean f32099z0;
    public nh0 f32100z1;
    public int f32101z2;
    public boolean f32102z3;
    public float f32103z4;

    public u2(Context context, boolean z10) {
        this(null, context, z10, i10.f24637t0, null);
    }

    public static SpannableStringBuilder R(int i7, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return spannableStringBuilder;
                    }
                    spannableStringBuilder.append(charSequence);
                    return spannableStringBuilder;
                }
                spannableStringBuilder.append(charSequence2).append((CharSequence) ": ").append(charSequence);
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) "\u2068").append(charSequence).append((CharSequence) "\u2069");
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(charSequence2).append((CharSequence) ": \u2068").append(charSequence).append((CharSequence) "\u2069");
        return spannableStringBuilder;
    }

    private fj getCaptionMessage() {
        CharSequence charSequence;
        if (this.f32009h1 == null) {
            fj fjVar = this.f32004g1;
            if (fjVar == null || fjVar.f24131z == null) {
                return null;
            }
            return fjVar;
        }
        int i7 = 0;
        fj fjVar2 = null;
        for (int i10 = 0; i10 < this.f32009h1.size(); i10++) {
            fj fjVar3 = (fj) this.f32009h1.get(i10);
            if (fjVar3 != null && (charSequence = fjVar3.f24131z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i7++;
                }
                fjVar2 = fjVar3;
            }
        }
        if (i7 > 1) {
            return null;
        }
        return fjVar2;
    }

    private int getCollapsedHeight() {
        int i7;
        int i10;
        boolean z10 = this.f32063s2;
        if (!z10 && !bz.f23312p1) {
            i7 = this.K;
        } else {
            i7 = this.L;
        }
        int L = org.telegram.messenger.g0.L(i7) + 1;
        if (this.R) {
            L += org.telegram.messenger.g0.L(20.0f);
        }
        if (V() && ((!z10 && !bz.f23312p1) || Z())) {
            if (Z()) {
                i10 = this.N;
            } else {
                i10 = this.M;
            }
            return org.telegram.messenger.g0.L(i10) + L;
        }
        return L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.K4);
        if (this.R4 != w02 || this.S4 == null) {
            this.R4 = w02;
            if (this.S4 == null) {
                this.S4 = new Paint(1);
            }
            this.S4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.S4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.H3) {
            if (W()) {
                return org.telegram.ui.ActionBar.n6.J0;
            }
            return org.telegram.ui.ActionBar.n6.K0;
        }
        return org.telegram.ui.ActionBar.n6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.O;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f28544id;
    }

    public final void A() {
        TLRPC.Message message;
        fj fjVar = this.f32004g1;
        if (fjVar != null && (message = fjVar.f24073k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.Y0) {
                org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.G0);
                long j3 = this.I0;
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                f10.s(j3, ig.b.c(chatTheme), chatTheme, false);
            }
        }
    }

    public final void B() {
        boolean z10;
        float f10;
        TLRPC.Chat chat = this.f32010h2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32084w2 = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f32056r1 = f10;
    }

    public final void D() {
        float f10;
        TLRPC.User c22;
        if (this.f32005g2 != null && (c22 = mp.u1(this.G0).c2(Long.valueOf(this.f32005g2.f28641id))) != null) {
            this.f32005g2 = c22;
        }
        if (a0()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f32050q1 = f10;
    }

    public final void E() {
        boolean z10;
        float f10;
        hi.h3 h3Var;
        if (this.m0 > 0 && !this.f32084w2 && !a0() && (((h3Var = this.f32057r2) == null || !h3Var.f37189a.f32938q) && !this.f32076v0.f11915w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32090x2 = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f32036n0 = f10;
    }

    public final int F() {
        float f10;
        if (Z() && !this.f32022k0 && !this.f31997f) {
            if (!this.f32063s2 && !bz.f23312p1) {
                f10 = 91.0f;
            } else {
                f10 = 86.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f32068t2) {
                L++;
            }
            if (V()) {
                return org.telegram.messenger.g0.L(this.N) + L;
            }
            return L;
        }
        return getCollapsedHeight();
    }

    public final void H(int i7, int i10) {
        this.f32103z4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(220L);
        this.B4.setInterpolator(kr.f36858f);
        this.f32092x4 = i7;
        this.f32086w4 = i10;
        this.B4.addUpdateListener(new k2(this, 2));
        this.B4.addListener(new o2(this, 2));
        this.A4 = true;
        this.B4.start();
    }

    public final boolean I(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.I(android.graphics.Canvas):boolean");
    }

    public final void L(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 != 0 || z13) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z10) {
                z.t(this.W2, this.X2, org.telegram.ui.ActionBar.n6.X0);
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.n6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.n6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.n6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.n6.X0.draw(canvas);
                if (i10 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.n6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z12) {
                if (z11) {
                    z.t(this.Y2, this.X2, org.telegram.ui.ActionBar.n6.W0);
                    if (z13) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.n6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.n6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.n6.W0.setAlpha((int) (f10 * 255.0f));
                    }
                    if (!z13 && i7 != 0) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.n6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.n6.W0.getBounds().centerY());
                        int i11 = (int) (255.0f * f10);
                        org.telegram.ui.ActionBar.n6.W0.setAlpha(i11);
                        org.telegram.ui.ActionBar.n6.V0.setAlpha(i11);
                    }
                    org.telegram.ui.ActionBar.n6.W0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f10) * org.telegram.messenger.g0.L(4.0f), 0.0f);
                    }
                    z.t(this.U2, this.X2, org.telegram.ui.ActionBar.n6.V0);
                    org.telegram.ui.ActionBar.n6.V0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.n6.W0.setAlpha(255);
                    }
                    if (!z13 && i7 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.n6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.n6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                z.t(this.V2, this.X2, org.telegram.ui.ActionBar.n6.T0);
                int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i12 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.n6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.n6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.n6.T0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.n6.T0.draw(canvas);
                if (i12 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.n6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void M(Canvas canvas, boolean z10, int i7, int i10, int i11, float f10, boolean z11) {
        boolean z12;
        float f11;
        float f12;
        Paint paint;
        boolean z13;
        RectF rectF;
        float f13;
        float interpolation;
        int i12;
        int L;
        int i13;
        RectF rectF2;
        int i14;
        int i15;
        int x02;
        if (!Z() && !Y()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ((this.H3 && this.M3) || this.W3 != 1.0f) {
            if (this.T0 == 0 && !this.U0) {
                f11 = 1.0f - this.W3;
            } else {
                f11 = this.W3;
            }
            int i16 = 255;
            if (z11) {
                if (this.U == null) {
                    Paint paint2 = new Paint();
                    this.U = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.U.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    this.U.setStrokeJoin(Paint.Join.ROUND);
                    this.U.setStrokeCap(Paint.Cap.ROUND);
                }
                f12 = 1.0f;
                this.U.setColor(i0.a.f(Color.alpha(x02) / 255.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false), i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s9, false), 255)));
            } else {
                f12 = 1.0f;
            }
            if (this.Q && this.O.read_inbox_max_id == 0) {
                if (this.T == null) {
                    this.T = new Paint();
                }
                paint = this.T;
                if (z10) {
                    i14 = org.telegram.ui.ActionBar.n6.Vk;
                } else {
                    i14 = org.telegram.ui.ActionBar.n6.Uk;
                }
                int w02 = org.telegram.ui.ActionBar.n6.w0(i14, this.K4);
                paint.setColor(w02);
                org.telegram.ui.ActionBar.n6.M0.setColor(w02);
                if (z10) {
                    i15 = 30;
                } else {
                    i15 = 40;
                }
                i16 = i15;
                z13 = true;
            } else {
                if (!z10 && this.K0 == 0) {
                    paint = org.telegram.ui.ActionBar.n6.f29799w0;
                } else {
                    paint = org.telegram.ui.ActionBar.n6.f29837y0;
                }
                z13 = false;
            }
            StaticLayout staticLayout = this.Z3;
            RectF rectF3 = this.f32065s4;
            if (staticLayout != null && this.T0 != 0) {
                paint.setAlpha((int) ((f12 - this.f32097y3) * i16));
                org.telegram.ui.ActionBar.n6.M0.setAlpha((int) ((f12 - this.f32097y3) * 255.0f));
                float f14 = f11 * 2.0f;
                if (f14 > f12) {
                    f13 = f12;
                } else {
                    f13 = f14;
                }
                float f15 = f12 - f13;
                float f16 = (i11 * f15) + (i10 * f13);
                float f17 = i7;
                rectF3.set(f16, f17, (this.Q3 * f15) + (this.P3 * f13) + f16 + org.telegram.messenger.g0.L(12.666f), org.telegram.messenger.g0.L(20.666f) + i7);
                if (f11 <= 0.5f) {
                    interpolation = kr.f36859g.getInterpolation(f14);
                } else {
                    interpolation = kr.f36860i.getInterpolation(f12 - ((f11 - 0.5f) * 2.0f));
                }
                float f18 = (interpolation * 0.1f) + f12;
                canvas.save();
                float f19 = f18 * f10;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                if (z12) {
                    if (this.f32075u4 == null || (rectF2 = this.f32080v4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f32080v4;
                        if (rectF4 == null) {
                            this.f32080v4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f32075u4 == null) {
                            this.f32075u4 = new Path();
                        }
                        c8.ka.a(this.f32075u4, this.f32080v4, org.telegram.messenger.g0.L(10.33f));
                    }
                    canvas.drawPath(this.f32075u4, paint);
                    if (z11) {
                        canvas.drawPath(this.f32075u4, this.U);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.U);
                    }
                }
                if (this.f31976a4 != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.N(6.333f) + f16, org.telegram.messenger.g0.N(3.0f) + f17);
                    this.f31976a4.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.n6.M0.getAlpha();
                float f20 = alpha;
                org.telegram.ui.ActionBar.n6.M0.setAlpha((int) (f20 * f13));
                if (this.f31982b4 != null) {
                    canvas.save();
                    float N = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.S3) {
                        i13 = org.telegram.messenger.g0.L(17.0f);
                    } else {
                        i13 = -org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N, org.telegram.messenger.g0.N(3.0f) + (i13 * f15) + f17);
                    this.f31982b4.draw(canvas);
                    canvas.restore();
                } else if (this.Y3 != null) {
                    canvas.save();
                    float N2 = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.S3) {
                        i12 = org.telegram.messenger.g0.L(17.0f);
                    } else {
                        i12 = -org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N2, org.telegram.messenger.g0.N(3.0f) + (i12 * f15) + f17);
                    this.Y3.draw(canvas);
                    canvas.restore();
                }
                if (this.Z3 != null) {
                    org.telegram.ui.ActionBar.n6.M0.setAlpha((int) (f20 * f15));
                    canvas.save();
                    float N3 = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.S3) {
                        L = -org.telegram.messenger.g0.L(17.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N3, org.telegram.messenger.g0.N(3.0f) + (L * f13) + f17);
                    this.Z3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.n6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.T0 != 0) {
                    staticLayout = this.Y3;
                }
                paint.setAlpha((int) ((f12 - this.f32097y3) * i16));
                org.telegram.ui.ActionBar.n6.M0.setAlpha((int) ((f12 - this.f32097y3) * 255.0f));
                float f21 = i7;
                rectF3.set(i10, f21, org.telegram.messenger.g0.L(12.666f) + this.P3 + i10, org.telegram.messenger.g0.L(20.666f) + i7);
                int save = canvas.save();
                if (f10 != f12) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (f11 != f12) {
                    canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
                }
                if (z12) {
                    if (this.f32075u4 == null || (rectF = this.f32080v4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f32080v4;
                        if (rectF5 == null) {
                            this.f32080v4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f32075u4 == null) {
                            this.f32075u4 = new Path();
                        }
                        c8.ka.a(this.f32075u4, this.f32080v4, org.telegram.messenger.g0.L(10.33f));
                    }
                    canvas.drawPath(this.f32075u4, paint);
                    if (z11) {
                        canvas.drawPath(this.f32075u4, this.U);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.U);
                    }
                }
                if (staticLayout != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(6.333f) + i10, org.telegram.messenger.g0.N(3.0f) + f21);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restoreToCount(save);
            }
            if (z13) {
                org.telegram.ui.ActionBar.n6.M0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.W8, false));
            }
        }
    }

    public boolean O() {
        return false;
    }

    public final java.lang.CharSequence P() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.P():java.lang.CharSequence");
    }

    public final java.lang.CharSequence Q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.Q():java.lang.CharSequence");
    }

    public final CharSequence S() {
        if (this.O4 == null) {
            this.O4 = new t2(this);
        }
        t2.a(this.O4, this.G0, this.f32004g1, this.f32010h2);
        this.O4.getClass();
        t2 t2Var = this.O4;
        this.N4 = t2Var.f31918c;
        this.f32003g0 = t2Var.d;
        return t2Var.f31921g;
    }

    public final ColorFilter T(int i7, int i10) {
        if (this.Y4 == null) {
            this.Z4 = new int[4];
            this.Y4 = new ColorFilter[4];
        }
        if (i10 != this.Z4[i7] || this.Y4[i7] == null) {
            ColorFilter[] colorFilterArr = this.Y4;
            this.Z4[i7] = i10;
            colorFilterArr[i7] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.Y4[i7];
    }

    public final SpannableStringBuilder U(int i7, CharSequence charSequence, String str, boolean z10) {
        CharSequence charSequence2;
        CharSequence N2;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String G;
        int size2;
        String N0;
        boolean z11;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        fj captionMessage = getCaptionMessage();
        fj fjVar = this.f32004g1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (fjVar != null) {
            charSequence2 = fjVar.v;
        } else {
            charSequence2 = null;
        }
        this.f31998f0 = true;
        if (!TextUtils.isEmpty(str)) {
            return R(i7, str, charSequence);
        }
        fj fjVar2 = this.f32004g1;
        TLRPC.Message message2 = fjVar2.f24073k;
        int i10 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = fjVar2.f24119w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                charSequence5 = fjVar2.v;
            }
            if (fj.E4(fjVar2)) {
                valueOf = R(i7, charSequence5, charSequence);
                if (this.f32004g1.f24067i2[0] instanceof qg.a) {
                    int i11 = this.G0;
                    TLRPC.TL_forumTopic f10 = mp.u1(i11).f25864t7.f(-fj.B0(this.f32004g1.f24073k), fj.b2(i11, this.f32004g1.f24073k, true, false));
                    if (f10 != null) {
                        ((qg.a) this.f32004g1.f24067i2[0]).b(f10.icon_color);
                    }
                }
            } else {
                this.f31998f0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                x(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.f24131z) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.W) {
                str2 = "";
            } else if (fj.L4(captionMessage.f24073k)) {
                str2 = "📹 ";
            } else if (fj.R4(captionMessage.f24073k)) {
                str2 = "🎤 ";
            } else if (captionMessage.I3()) {
                str2 = "🎧 ";
            } else if (fj.S3(captionMessage.f24073k)) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.r2() && !TextUtils.isEmpty(captionMessage.f24073k.message)) {
                CharSequence charSequence7 = captionMessage.f24040c2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 47);
                if (this.f31972a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.f31978b0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.f31978b0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.f24035b2) {
                    charSequence7 = org.telegram.messenger.g0.Q(charSequence7, (String) captionMessage.f24030a2.get(0), measuredWidth, this.f31978b0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.U5();
            ri.g(captionMessage.f24073k.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.f24073k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.f31978b0;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                ri.a(fontMetricsInt, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.g0.N2(spannableString));
            if (z10) {
                append = x(append);
            }
            return R(i7, append, charSequence);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.i6 i6Var = this.K4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z11 = fj.O2(this.f32004g1.f24073k.rich_message.blocks.get(0));
                } else {
                    z11 = false;
                }
                SpannableStringBuilder R = R(i7, this.f32004g1.v, charSequence);
                if (z11 && !Z()) {
                    try {
                        i00 i00Var = new i00(org.telegram.ui.ActionBar.n6.f29674p9, i6Var);
                        if (this.f31972a0) {
                            i10 = charSequence.length() + 2;
                        }
                        R.setSpan(i00Var, i10, R.length(), 33);
                        return R;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                return R;
            } else if (message2.media != null && !fjVar2.F3()) {
                this.f31978b0 = org.telegram.ui.ActionBar.n6.H0[this.F0];
                int i12 = org.telegram.ui.ActionBar.n6.f29654o9;
                fj fjVar3 = this.f32004g1;
                TLRPC.MessageMedia messageMedia = fjVar3.f24073k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        ri.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2, -1);
                        ri.a(org.telegram.ui.ActionBar.n6.F0[this.F0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                        charSequence3 = oh.a.a(2131231055, spannableString2, true);
                    } else {
                        charSequence3 = oh.a.a(2131231055, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        ri.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3, -1);
                        ri.a(org.telegram.ui.ActionBar.n6.F0[this.F0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                        charSequence3 = oh.a.a(2131231049, spannableString3, true);
                    } else {
                        charSequence3 = oh.a.a(2131231049, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = oh.a.a(2131231050, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (fjVar3.D == 14) {
                    charSequence3 = p5.c.l("🎧 \u2068", fjVar3.w1(true), " - ", this.f32004g1.y1(true), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.T1) {
                        if (size3 > 1) {
                            N0 = gd.G(size3, "Media", new Object[0]);
                        } else {
                            N0 = gd.N0(2131753930, null);
                        }
                    } else if (size3 > 1) {
                        N0 = gd.G(size3, "Photos", new Object[0]);
                    } else {
                        N0 = gd.N0(2131753945, null);
                    }
                    charSequence3 = pb.T0(gd.a0(null, null, 2131753946, N0));
                    i12 = org.telegram.ui.ActionBar.n6.f29674p9;
                } else if (this.S1 > 1) {
                    if (this.T1) {
                        ArrayList arrayList2 = this.f32009h1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        G = gd.G(size2, "Media", new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f32009h1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        G = gd.G(size, "Photos", new Object[0]);
                    }
                    charSequence3 = G;
                    i12 = org.telegram.ui.ActionBar.n6.f29674p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i12 = org.telegram.ui.ActionBar.n6.f29674p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z10) {
                    charSequence3 = x(charSequence3);
                }
                SpannableStringBuilder R2 = R(i7, charSequence3, charSequence);
                if (!Z()) {
                    try {
                        i00 i00Var2 = new i00(i12, i6Var);
                        if (this.f31972a0) {
                            i10 = charSequence.length() + 2;
                        }
                        R2.setSpan(i00Var2, i10, R2.length(), 33);
                        return R2;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                return R2;
            } else {
                fj fjVar4 = this.f32004g1;
                String str3 = fjVar4.f24073k.message;
                if (str3 != null) {
                    if (fjVar4.r2()) {
                        CharSequence charSequence9 = this.f32004g1.f24040c2;
                        N2 = str3;
                        if (charSequence9 != null) {
                            N2 = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 33);
                        if (this.f31972a0) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.f31978b0.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.f31978b0.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            N2 = org.telegram.messenger.g0.Q(N2, (String) this.f32004g1.f24030a2.get(0), measuredWidth2, this.f31978b0);
                        }
                    } else {
                        int length2 = str3.length();
                        CharSequence charSequence10 = str3;
                        if (length2 > 150) {
                            charSequence10 = str3.subSequence(0, 150);
                        }
                        N2 = org.telegram.messenger.g0.N2(charSequence10);
                    }
                    ?? spannableString4 = new SpannableString(N2);
                    fj fjVar5 = this.f32004g1;
                    if (fjVar5 != null) {
                        fjVar5.U5();
                    }
                    fj fjVar6 = this.f32004g1;
                    Pattern pattern = ri.U1;
                    ri.g(fjVar6.f24073k.entities, fjVar6.v, spannableString4, 264);
                    fj fjVar7 = this.f32004g1;
                    if (fjVar7 != null && (message = fjVar7.f24073k) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.f31978b0;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        ri.a(fontMetricsInt, spannableString4, arrayList4);
                    }
                    if (z10) {
                        spannableString4 = x(spannableString4);
                    }
                    return R(i7, spannableString4, charSequence);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean V() {
        ab.c0 c0Var = this.f32071u0;
        if (c0Var != null && !((ArrayList) c0Var.d).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (org.telegram.messenger.v3.Y(this.f32010h2)) {
            return !this.f31999f1;
        }
        if (this.Q) {
            return this.f31979b1;
        }
        TLRPC.Chat chat = this.f32010h2;
        if (chat != null && chat.forum && this.O == null) {
            if (!this.f31993e1) {
                return true;
            }
            return false;
        }
        return this.f31973a1;
    }

    public final boolean X() {
        if (this.K0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if (this.K0 != 0) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        TLRPC.Chat chat;
        if (!X() && !this.Q0 && (chat = this.f32010h2) != null) {
            if (!chat.forum) {
                if (org.telegram.messenger.v3.p0(chat)) {
                    if (!org.telegram.messenger.v3.A(this.G0, this.f32010h2, 24)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (!this.Q) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean a0() {
        TLRPC.User user;
        if (!Z() && !this.f32076v0.f11915w && (user = this.f32005g2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i7 = this.G0;
            if (userStatus == null || userStatus.expires > 0 || !mp.u1(i7).f25689a0.containsKey(Long.valueOf(this.f32005g2.f28641id))) {
                TLRPC.UserStatus userStatus2 = this.f32005g2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29545i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29509g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29654o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29563j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29583k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29581k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29454d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29436c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29636n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29619m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29601l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29527h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29865z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ck));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Dk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Vk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.W8));
    }

    public final boolean b0(float f10) {
        if (!gd.f24314a0) {
            if (f10 >= 0.0f && f10 < org.telegram.messenger.g0.L(60.0f)) {
                return true;
            }
            return false;
        } else if (f10 >= getMeasuredWidth() - org.telegram.messenger.g0.L(60.0f) && f10 < getMeasuredWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public final void c0(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.f32102z3 == z10) {
            if (!getIsPinned()) {
                this.f32102z3 = false;
                return;
            }
            return;
        }
        this.f32102z3 = z10;
        float f10 = 1.0f;
        if (z11) {
            if (z10) {
                f10 = 0.0f;
            }
            this.f32097y3 = f10;
        } else {
            if (!z10) {
                f10 = 0.0f;
            }
            this.f32097y3 = f10;
        }
        invalidate();
    }

    public final void d0() {
        float f10;
        boolean z10 = bz.f23315q1;
        this.n1 = z10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.E1 = f10;
        this.f31980b2.f33432o = f10;
        this.f32072u1 = 0.0f;
        this.f32095y1 = false;
        if (!getIsPinned() || !this.f32102z3) {
            f11 = 0.0f;
        }
        this.f32097y3 = f11;
        this.f32091x3 = true;
        this.f32045p1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.m5 m5Var = this.o4;
        if (m5Var != null && this.f32091x3) {
            m5Var.a();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f32048p4;
        if (m5Var2 != null && this.f32091x3) {
            m5Var2.a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.Q && !this.G && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f32076v0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(boolean z10, boolean z11) {
        hi.h3 h3Var = this.f32057r2;
        if (h3Var == null && !z10) {
            return;
        }
        if (h3Var == null) {
            hi.h3 h3Var2 = new hi.h3(this, getContext(), this.K4, 1);
            this.f32057r2 = h3Var2;
            h3Var2.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
            this.f32057r2.setDrawUnchecked(false);
            this.f32057r2.setDrawBackgroundAsArc(3);
            addView(this.f32057r2);
        }
        this.f32057r2.a(z10, z11);
        E();
    }

    public final void f0(long j3, fj fjVar, int i7, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        if (this.I0 != j3) {
            this.f32098y4 = -1;
        }
        this.I0 = j3;
        this.C4 = System.currentTimeMillis();
        this.f32004g1 = fjVar;
        this.f32078v2 = z10;
        this.O0 = false;
        this.S0 = i7;
        if (fjVar != null) {
            int i11 = fjVar.f24073k.edit_date;
        }
        this.T0 = 0;
        this.U0 = false;
        if (fjVar != null) {
            i10 = fjVar.e1();
        } else {
            i10 = 0;
        }
        this.f32031m1 = i10;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        if (fjVar != null && fjVar.F4()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.Y0 = z12;
        fj fjVar2 = this.f32004g1;
        if (fjVar2 != null) {
            this.Z0 = fjVar2.f24073k.send_state;
        }
        k0(0, z11);
    }

    public final void g0(TLRPC.Dialog dialog, int i7, int i10) {
        boolean z10;
        if (this.I0 != dialog.f28496id) {
            ValueAnimator valueAnimator = this.B4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.B4.cancel();
            }
            this.A4 = false;
            this.f32098y4 = -1;
        }
        this.I0 = dialog.f28496id;
        this.C4 = System.currentTimeMillis();
        boolean z11 = true;
        this.O0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.L0 = dialog.community_id;
        } else {
            this.L0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.K0 = ((TLRPC.TL_dialogFolder) dialog).folder.f28543id;
            yg0 yg0Var = this.f32000f2;
            if (yg0Var != null) {
                yg0Var.H = this;
                yg0Var.i();
            }
        } else {
            this.K0 = 0;
        }
        this.f32023k1 = i7;
        if (i7 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Runnable runnable = this.f31977a5;
        if (runnable == null) {
            z11 = false;
        }
        if (z10 != z11) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.f31977a5 = null;
            } else if (z10) {
                this.f31977a5 = ks.f(this.G0).h(this, ks.f25241k3, new m2(this, 0));
            }
        }
        if (this.f32071u0 == null) {
            this.f32071u0 = new ab.c0(this);
        }
        this.l1 = i10;
        this.f32031m1 = 0;
        if (k0(0, false)) {
            requestLayout();
        }
        D();
        B();
        A();
        E();
    }

    public float getClipProgress() {
        return this.f32072u1;
    }

    public int getCurrentDialogFolderId() {
        return this.K0;
    }

    public long getDialogId() {
        return this.I0;
    }

    public boolean getHasUnread() {
        if (this.T0 == 0 && !this.U0) {
            return false;
        }
        return true;
    }

    public boolean getIsMuted() {
        return this.f31973a1;
    }

    public boolean getIsPinned() {
        if (!this.B3 && !this.C3) {
            return false;
        }
        return true;
    }

    public fj getMessage() {
        return this.f32004g1;
    }

    public int getMessageId() {
        return this.f32031m1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f32051q2;
    }

    @Override
    public float getTranslationX() {
        return this.f32089x1;
    }

    public final void h0(TLRPC.TL_forumTopic tL_forumTopic, long j3, fj fjVar, boolean z10, boolean z11) {
        boolean z12;
        yg0 yg0Var;
        this.O = tL_forumTopic;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.Q = z12;
        if (this.I0 != j3) {
            this.f32098y4 = -1;
        }
        Drawable drawable = fjVar.f24067i2[0];
        if (drawable instanceof qg.a) {
            ((qg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.I0 = j3;
        this.C4 = System.currentTimeMillis();
        this.f32004g1 = fjVar;
        this.O0 = false;
        this.f32008h0 = z10;
        this.S0 = fjVar.f24073k.date;
        this.U0 = false;
        this.f32031m1 = fjVar.e1();
        this.Y0 = fjVar.F4();
        fj fjVar2 = this.f32004g1;
        if (fjVar2 != null) {
            this.Z0 = fjVar2.f24073k.send_state;
        }
        if (!z11) {
            this.f32098y4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f32009h1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
        if (tL_forumTopic2 != null && tL_forumTopic2.f28544id == 1 && (yg0Var = this.f32000f2) != null) {
            yg0Var.H = this;
            yg0Var.i();
        }
        k0(0, z11);
    }

    public final void i0(int i7, fj fjVar) {
        boolean z10;
        boolean z11;
        int i10;
        String str;
        float f10;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = fjVar.f24093p0;
        TLObject tLObject = fjVar.f24086n0;
        if (fjVar.y4()) {
            TL_stories.StoryItem storyItem = fjVar.f24073k.media.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    arrayList = document.thumbs;
                    tLObject = document;
                } else {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null) {
                        arrayList = photo.sizes;
                        tLObject = photo;
                    }
                }
            } else {
                return;
            }
        }
        TLRPC.PhotoSize Q = org.telegram.messenger.w7.Q(arrayList);
        TLRPC.PhotoSize photoSize = null;
        if (Q == null) {
            Q = org.telegram.messenger.w7.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, true);
        if (Q != w10) {
            photoSize = w10;
        }
        if (photoSize == null || !org.telegram.messenger.a6.q(this.G0).d(fjVar)) {
            photoSize = Q;
        }
        if (Q != null) {
            if (!this.T1 && !fj.L4(fjVar.f24073k) && !fjVar.h4()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.T1 = z10;
            int i11 = this.S1;
            if (i11 < 3) {
                this.S1 = i11 + 1;
                if ((fj.L4(fjVar.f24073k) || fjVar.h4()) && !fjVar.t2()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.X1[i7] = z11;
                this.Y1[i7] = fjVar.t2();
                if (fjVar.D == 1 && photoSize != null) {
                    i10 = photoSize.size;
                } else {
                    i10 = 0;
                }
                if (fjVar.t2()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.W1;
                imageReceiverArr[i7].s0(fc.f(photoSize, tLObject), str, fc.f(Q, tLObject), str, null, i10, null, fjVar, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i7];
                if (fjVar.h4()) {
                    f10 = 18.0f;
                } else {
                    f10 = 2.0f;
                }
                imageReceiver.K0(org.telegram.messenger.g0.L(f10));
                this.W = false;
            }
        }
    }

    @Override
    public final void invalidate() {
        if (fi.f9.f11955x1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f32100z1 && drawable != org.telegram.ui.ActionBar.n6.f29762u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    public final void j0() {
        yg0 yg0Var = this.f32000f2;
        if (yg0Var != null) {
            if (this.Q) {
                yg0Var.K = org.telegram.messenger.g0.L(24.0f);
                this.f32000f2.L = org.telegram.messenger.g0.L(24.0f);
                this.f32000f2.M = 0.0f;
            } else {
                n2 n2Var = this.f32076v0;
                RectF rectF = n2Var.F;
                RectF rectF2 = n2Var.F;
                yg0Var.K = rectF.centerY();
                this.f32000f2.L = rectF2.centerX();
                this.f32000f2.M = rectF2.width() / 2.0f;
                if (!mp.u1(this.G0).R1().h.isEmpty()) {
                    this.f32000f2.M -= org.telegram.messenger.g0.N(3.5f);
                }
                yg0 yg0Var2 = this.f32000f2;
                this.Z1.q();
                yg0Var2.getClass();
            }
            yg0 yg0Var3 = this.f32000f2;
            if (!yg0Var3.E && yg0Var3.I != null) {
                AnimatorSet animatorSet = yg0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    yg0Var3.B.cancel();
                }
                yg0Var3.E = true;
                yg0Var3.F = true;
                yg0Var3.D = 0.0f;
                yg0Var3.I.getTranslationY();
                org.telegram.messenger.g0.L(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xg0(yg0Var3, 5));
                ofFloat.setInterpolator(kr.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new xg0(yg0Var3, 6));
                kr krVar = kr.f36861j;
                ofFloat2.setInterpolator(krVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new xg0(yg0Var3, 7));
                ofFloat3.setInterpolator(krVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                yg0Var3.B = animatorSet2;
                animatorSet2.addListener(new p60(yg0Var3, 11));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                yg0Var3.B.playTogether(ofFloat, animatorSet3);
                yg0Var3.B.start();
            }
        }
    }

    public final boolean k0(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.k0(int, boolean):boolean");
    }

    public final void l0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.l0():void");
    }

    public final void m0(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f31977a5 != null && this.f32005g2 != null) {
            requirementToContact = mp.u1(this.G0).P2(this.f32005g2.f28641id);
        } else {
            requirementToContact = null;
        }
        boolean z12 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.f32042o2 == z12 && this.f32051q2 == org.telegram.messenger.n5.k(requirementToContact)) {
            return;
        }
        this.f32042o2 = z12;
        this.f32051q2 = org.telegram.messenger.n5.k(requirementToContact);
        if (!z10) {
            this.f32037n2.f(this.f32042o2, true);
            if (this.f32051q2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32046p2.f(z11, true);
        }
        invalidate();
    }

    public final void n0() {
        StaticLayout staticLayout;
        int i7;
        if (this.S1 > 0) {
            if (Z()) {
                staticLayout = this.f32016i3;
            } else {
                staticLayout = this.f32001f3;
            }
            if (Z()) {
                i7 = this.f31990d3;
            } else {
                i7 = this.f31986c3;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        s2[] s2VarArr = (s2[]) ((Spanned) text).getSpans(0, text.length(), s2.class);
                        boolean[] zArr = this.V1;
                        if (s2VarArr != null && s2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(s2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f32094y0 && !this.f32099z0) {
                                ceil += org.telegram.messenger.g0.L(3.0f);
                            }
                            for (int i10 = 0; i10 < this.S1; i10++) {
                                this.W1[i10].L0 = i7 + ceil + org.telegram.messenger.g0.L((this.M4 + 2) * i10);
                                zArr[i10] = true;
                            }
                            return;
                        }
                        for (int i11 = 0; i11 < 3; i11++) {
                            zArr[i11] = false;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Z1.Q();
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i7 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i7].Q();
            i7++;
        }
        d0();
        this.f32038n3 = org.telegram.ui.Components.x5.update(0, this, this.f32038n3, this.f32001f3);
        this.f32043o3 = org.telegram.ui.Components.x5.update(0, this, this.f32043o3, this.f32069t3);
        this.f32047p3 = org.telegram.ui.Components.x5.update(0, this, this.f32047p3, this.f32016i3);
        this.f32052q3 = org.telegram.ui.Components.x5.update(0, this, this.f32052q3, this.A2);
        org.telegram.ui.Components.m5 m5Var = this.o4;
        if (m5Var != null) {
            m5Var.a();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f32048p4;
        if (m5Var2 != null) {
            m5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f10;
        super.onDetachedFromWindow();
        this.f32095y1 = false;
        this.B1 = false;
        this.C1 = 0.0f;
        this.f32091x3 = false;
        if (getIsPinned() && this.f32102z3) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f32097y3 = f10;
        this.Z1.S();
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i7 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i7].S();
            i7++;
        }
        nh0 nh0Var = this.f32100z1;
        if (nh0Var != null) {
            nh0Var.stop();
            this.f32100z1.T(true, 0.0f);
            this.f32100z1.setCallback(null);
            this.f32100z1 = null;
            this.A1 = false;
        }
        jg.j jVar = this.f32070t4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.I0));
        }
        org.telegram.ui.Components.m5 m5Var = this.o4;
        if (m5Var != null) {
            m5Var.b();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f32048p4;
        if (m5Var2 != null) {
            m5Var2.b();
        }
        org.telegram.ui.Components.x5.release(this, this.f32038n3);
        org.telegram.ui.Components.x5.release(this, this.f32043o3);
        org.telegram.ui.Components.x5.release(this, this.f32047p3);
        org.telegram.ui.Components.x5.release(this, this.f32052q3);
        this.f32076v0.g();
        this.f31988d0 = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        yg0 yg0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Y() && (yg0Var = this.f32000f2) != null && bz.f23315q1 && yg0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!Y() && this.E4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296262, gd.N0(2131754940, null)));
            }
        }
        hi.h3 h3Var = this.f32057r2;
        if (h3Var != null && h3Var.f37189a.f32938q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32018j0 == 0.0f && !this.Q && !this.G && this.f32076v0.a(this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int L;
        int i15;
        if (this.I0 != 0 || this.H0 != null) {
            bi.o3 o3Var = this.f32039n4;
            if (o3Var != null) {
                o3Var.layout(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f32057r2 != null) {
                int i16 = this.J;
                boolean z11 = this.f32063s2;
                if (!z11 && !bz.f23312p1) {
                    i13 = 27;
                } else {
                    i13 = 29;
                }
                int L2 = org.telegram.messenger.g0.L(i16 - i13);
                if (this.f32027l0) {
                    i15 = org.telegram.messenger.g0.L(8.0f);
                    L = (getMeasuredHeight() - this.f32057r2.getMeasuredHeight()) >> 1;
                } else {
                    if (gd.f24314a0) {
                        L2 = (i11 - i7) - L2;
                    }
                    float f10 = this.V;
                    if (!z11 && !bz.f23312p1) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    int i17 = L2;
                    L = org.telegram.messenger.g0.L(f10 + i14);
                    i15 = i17;
                }
                hi.h3 h3Var = this.f32057r2;
                h3Var.layout(i15, L, h3Var.getMeasuredWidth() + i15, this.f32057r2.getMeasuredHeight() + L);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.L4 && !this.B0) {
                return;
            }
            this.B0 = false;
            this.L4 = measuredWidth;
            try {
                z();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        bi.o3 o3Var = this.f32039n4;
        if (o3Var != null) {
            o3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        }
        hi.h3 h3Var = this.f32057r2;
        if (h3Var != null) {
            h3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        if (this.Q) {
            int size = View.MeasureSpec.getSize(i7);
            boolean z10 = this.f32063s2;
            if (!z10 && !bz.f23312p1) {
                i11 = this.K;
            } else {
                i11 = this.L;
            }
            if (V() && ((!z10 && !bz.f23312p1) || Z())) {
                if (Z()) {
                    i12 = this.N;
                } else {
                    i12 = this.M;
                }
            } else {
                i12 = 0;
            }
            setMeasuredDimension(size, org.telegram.messenger.g0.L(i11 + i12) + (this.f32068t2 ? 1 : 0));
            this.R = false;
            if (this.Q && !V()) {
                z();
                if (this.S) {
                    this.R = true;
                    z();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), F());
        this.f32077v1 = 0;
        this.f32083w1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        fj captionMessage;
        TLRPC.User c22;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.M0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.K0 == 1) {
            c0.u(null, 2131754133, sb2, ". ");
        } else {
            if (this.f32015i2 != null) {
                c0.u(null, 2131754776, sb2, ". ");
            }
            if (this.Q && this.O != null) {
                c0.u(null, 2131754745, sb2, ". ");
                sb2.append(this.O.title);
                sb2.append(". ");
            } else {
                TLRPC.User user = this.f32005g2;
                if (user != null) {
                    if (n10.A(user)) {
                        sb2.append(gd.N0(2131746070, null));
                    } else if (n10.t(this.f32005g2)) {
                        sb2.append(gd.N0(2131754249, null));
                    } else {
                        if (this.f32005g2.bot) {
                            c0.u(null, 2131753153, sb2, ". ");
                        }
                        TLRPC.User user2 = this.f32005g2;
                        if (user2.self) {
                            sb2.append(gd.N0(2131745705, null));
                        } else {
                            sb2.append(org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f32010h2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(gd.N0(2131754904, null));
                        } else {
                            sb2.append(gd.N0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.f32010h2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f32026k4) {
            c0.u(null, 2131754738, sb2, ". ");
        }
        if (this.f31973a1) {
            c0.u(null, 2131754828, sb2, ". ");
        }
        if (a0()) {
            c0.u(null, 2131754740, sb2, ". ");
        }
        int i7 = this.T0;
        if (i7 > 0) {
            sb2.append(gd.G(i7, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i10 = this.V0;
        if (i10 > 0) {
            sb2.append(gd.G(i10, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.W0 > 0) {
            c0.u(null, 2131754840, sb2, ". ");
        }
        fj fjVar = this.f32004g1;
        if (fjVar != null && this.K0 == 0) {
            int i11 = this.S0;
            if (i11 == 0) {
                i11 = fjVar.f24073k.date;
            }
            String s5 = gd.s(i11, true);
            if (this.f32004g1.N3()) {
                sb2.append(gd.a0("AccDescrSentDate", null, 2131754764, s5));
            } else {
                sb2.append(gd.a0("AccDescrReceivedDate", null, 2131754788, s5));
            }
            sb2.append(". ");
            if (this.f32010h2 != null && !this.f32004g1.N3() && this.f32004g1.p3() && this.f32004g1.f24073k.action == null && (c22 = mp.u1(this.G0).c2(Long.valueOf(this.f32004g1.f24073k.from_id.user_id))) != null) {
                sb2.append(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                sb2.append(". ");
            }
            if (this.f32015i2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f32004g1.v);
                if (!this.f32004g1.F3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.f24131z)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.f24131z);
                }
                StaticLayout staticLayout = this.f32001f3;
                if (staticLayout == null) {
                    length = -1;
                } else {
                    length = staticLayout.getText().length();
                }
                if (length > 0) {
                    int length2 = sb3.length();
                    int indexOf = sb3.indexOf("\n", length);
                    if (indexOf < length2 && indexOf >= 0) {
                        length2 = indexOf;
                    }
                    int indexOf2 = sb3.indexOf("\t", length);
                    if (indexOf2 < length2 && indexOf2 >= 0) {
                        length2 = indexOf2;
                    }
                    int indexOf3 = sb3.indexOf(" ", length);
                    if (indexOf3 < length2 && indexOf3 >= 0) {
                        length2 = indexOf3;
                    }
                    sb2.append(sb3.substring(0, length2));
                } else {
                    sb2.append((CharSequence) sb3);
                }
            }
            accessibilityEvent.setContentDescription(sb2);
            setContentDescription(sb2);
            return;
        }
        accessibilityEvent.setContentDescription(sb2);
        setContentDescription(sb2);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        bx bxVar;
        if (i7 == 2131296262 && (bxVar = this.E4) != null) {
            bxVar.b5(this);
            return true;
        }
        return super.performAccessibilityAction(i7, bundle);
    }

    @Override
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(yg0 yg0Var) {
        this.f32000f2 = yg0Var;
    }

    public void setBottomClip(int i7) {
        this.f32083w1 = i7;
    }

    public void setClipProgress(float f10) {
        this.f32072u1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j3) {
        this.I0 = j3;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.J0, str)) {
            this.J0 = str;
            z();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.J0 = str;
    }

    public void setDialog(p2 p2Var) {
        this.H0 = p2Var;
        this.f32031m1 = 0;
        k0(0, true);
        D();
        B();
        A();
        E();
    }

    public void setDialogCellDelegate(q2 q2Var) {
        this.f31992e0 = q2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.f32059r4 != z10) {
            invalidate();
        }
        this.f32059r4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f32022k0 = z10;
    }

    public void setMoving(boolean z10) {
        this.f32054r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        if (this.J1 == null) {
            this.J1 = new wy0(gd.N0(2131753008, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.F1 = z10;
        this.G1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.C3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            z();
        }
        invalidate();
    }

    public void setPreloader(jg.j jVar) {
        this.f32070t4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.f32018j0 != f10) {
            this.f32018j0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.f32095y1 = z10;
    }

    public void setTitleOverride(String str) {
        this.M0 = str;
    }

    public void setTopClip(int i7) {
        this.f32077v1 = i7;
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 == this.f32089x1) {
            return;
        }
        this.f32089x1 = f10;
        nh0 nh0Var = this.f32100z1;
        boolean z10 = true;
        if (nh0Var != null && f10 == 0.0f) {
            nh0Var.T(true, 0.0f);
            this.A1 = false;
            this.n1 = bz.f23315q1;
            this.C1 = 0.0f;
            this.f32095y1 = false;
        }
        float f11 = this.f32089x1;
        if (f11 != 0.0f) {
            this.f32095y1 = true;
        } else {
            this.D1 = 0.0f;
            this.C1 = 0.0f;
            this.B1 = false;
        }
        if (this.f32095y1 && !this.f32087x) {
            boolean z11 = this.B1;
            if (Math.abs(f11) < getMeasuredWidth() * 0.45f) {
                z10 = false;
            }
            this.B1 = z10;
            if (z11 != z10 && this.n1 == bz.f23315q1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            if (z10) {
                invalidate();
            }
        }
    }

    @Override
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.I0 != 0 || this.H0 != null) {
                    k0(0, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final CharSequence x(CharSequence charSequence) {
        if (this.S1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new s2(org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.z():void");
    }

    public u2(bx bxVar, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = true;
        this.f32093y = true;
        int i10 = 0;
        this.E = false;
        this.I = 11;
        this.J = 72;
        this.K = 70;
        this.L = 76;
        this.M = 3;
        this.N = 11;
        this.V = 42.0f;
        n2 n2Var = new n2(this);
        this.f32076v0 = n2Var;
        this.A0 = true;
        this.D0 = 0.0f;
        this.f31993e1 = false;
        this.f31999f1 = false;
        this.G1 = new lc(this);
        this.H1 = new Paint(1);
        this.I1 = new RectF();
        this.M1 = false;
        this.V1 = new boolean[3];
        this.W1 = new ImageReceiver[3];
        this.X1 = new boolean[3];
        this.Y1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Z1 = imageReceiver;
        this.f31980b2 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f31994e2 = new c5.c(2);
        kr krVar = kr.h;
        this.f32037n2 = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.f32046p2 = new org.telegram.ui.Components.c6(this, 0L, 350L, krVar);
        this.j3 = new Stack();
        this.f32025k3 = new ArrayList();
        this.f32029l3 = new Stack();
        this.f32033m3 = new ArrayList();
        this.M3 = true;
        this.T3 = new te.a(this, krVar, 320L);
        this.W3 = 1.0f;
        this.X3 = 1.0f;
        this.f32065s4 = new RectF();
        this.f32098y4 = -1;
        this.I4 = -1;
        this.J4 = new r2(this);
        n2Var.I = true;
        this.K4 = i6Var;
        this.E4 = bxVar;
        org.telegram.ui.ActionBar.n6.T(context);
        this.E = false;
        this.F = false;
        imageReceiver.K0(org.telegram.messenger.g0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.W1[i10];
                imageReceiver2.f22772y = true;
                imageReceiver2.K0(org.telegram.messenger.g0.L(2.0f));
                this.W1[i10].A1 = true;
                i10++;
            } else {
                this.f32063s2 = z10;
                this.G0 = i7;
                bi.o3 o3Var = new bi.o3(13, context, this);
                this.f32039n4 = o3Var;
                addView(o3Var);
                this.o4 = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(22.0f), o3Var);
                this.f32048p4 = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(17.0f), this);
                this.Z1.A1 = true;
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (fi.f9.f11955x1) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
