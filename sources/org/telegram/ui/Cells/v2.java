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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.ay;
public class v2 extends z implements th.k5, org.telegram.ui.ActionBar.k6 {
    public boolean A0;
    public boolean A1;
    public boolean A2;
    public boolean A3;
    public ValueAnimator A4;
    public boolean B0;
    public float B1;
    public float B2;
    public boolean B3;
    public long B4;
    public float C0;
    public float C1;
    public boolean C2;
    public int C3;
    public int C4;
    public boolean D;
    public yg.c D0;
    public float D1;
    public boolean D2;
    public int D3;
    public final ay D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public StaticLayout E4;
    public boolean F;
    public final int F0;
    public final dc F1;
    public Paint F2;
    public float F3;
    public int F4;
    public g7 G;
    public q2 G0;
    public final Paint G1;
    public boolean G2;
    public boolean G3;
    public int G4;
    public int H;
    public long H0;
    public final RectF H1;
    public int H2;
    public boolean H3;
    public int H4;
    public int I;
    public String I0;
    public qz0 I1;
    public int I2;
    public int I3;
    public final s2 I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public LayerDrawable J3;
    public final org.telegram.ui.ActionBar.p6 J4;
    public int K;
    public long K0;
    public vh.m6 K1;
    public int K2;
    public int K3;
    public int K4;
    public final int L;
    public String L0;
    public boolean L1;
    public int L2;
    public boolean L3;
    public int L4;
    public final int M;
    public int M0;
    public int M1;
    public int M2;
    public int M3;
    public int M4;
    public TLRPC.TL_forumTopic N;
    public boolean N0;
    public int N1;
    public StaticLayout N2;
    public int N3;
    public u2 N4;
    public boolean O;
    public boolean O0;
    public String O1;
    public int O2;
    public int O3;
    public GradientDrawable O4;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public int P3;
    public int P4;
    public boolean Q;
    public boolean Q0;
    public bi0 Q1;
    public boolean Q2;
    public int Q3;
    public int Q4;
    public boolean R;
    public int R0;
    public int R1;
    public boolean R2;
    public boolean R3;
    public Paint R4;
    public Paint S;
    public int S0;
    public boolean S1;
    public boolean S2;
    public final fe.b S3;
    public kg.k1 S4;
    public Paint T;
    public boolean T0;
    public Paint T1;
    public int T2;
    public ValueAnimator T3;
    public Drawable T4;
    public float U;
    public int U0;
    public final boolean[] U1;
    public int U2;
    public ValueAnimator U3;
    public int U4;
    public boolean V;
    public int V0;
    public final ImageReceiver[] V1;
    public int V2;
    public float V3;
    public Drawable V4;
    public boolean W;
    public int W0;
    public final boolean[] W1;
    public int W2;
    public float W3;
    public Drawable W4;
    public boolean X0;
    public final boolean[] X1;
    public int X2;
    public StaticLayout X3;
    public ColorFilter[] X4;
    public int Y0;
    public final ImageReceiver Y1;
    public int Y2;
    public StaticLayout Y3;
    public int[] Y4;
    public boolean Z0;
    public wd0 Z1;
    public int Z2;
    public StaticLayout Z3;
    public Runnable Z4;
    public TextPaint f23173a0;
    public boolean f23174a1;
    public final org.telegram.ui.Components.r8 a2;
    public int f23175a3;
    public StaticLayout f23176a4;
    public Paint f23177b0;
    public boolean f23178b1;
    public boolean f23179b2;
    public int f23180b3;
    public boolean f23181b4;
    public jc f23182c0;
    public float f23183c1;
    public float f23184c2;
    public int f23185c3;
    public boolean f23186c4;
    public r2 f23187d0;
    public boolean f23188d1;
    public final p2 f23189d2;
    public int f23190d3;
    public boolean f23191d4;
    public boolean f23192e0;
    public boolean f23193e1;
    public mh0 f23194e2;
    public StaticLayout f23195e3;
    public int f23196e4;
    public boolean f23197f;
    public boolean f23198f0;
    public jj f23199f1;
    public TLRPC.User f23200f2;
    public StaticLayout f23201f3;
    public int f23202f4;
    public boolean f23203g0;
    public ArrayList f23204g1;
    public TLRPC.Chat f23205g2;
    public int f23206g3;
    public int f23207g4;
    public final boolean h;
    public Drawable[] f23208h0;
    public boolean f23209h1;
    public TLRPC.EncryptedChat f23210h2;
    public StaticLayout f23211h3;
    public int f23212h4;
    public float f23213i0;
    public CharSequence f23214i1;
    public CharSequence f23215i2;
    public final Stack f23216i3;
    public StaticLayout f23217i4;
    public boolean f23218j0;
    public int f23219j1;
    public int f23220j2;
    public final ArrayList f23221j3;
    public boolean f23222j4;
    public boolean f23223k0;
    public int f23224k1;
    public boolean f23225k2;
    public final Stack f23226k3;
    public boolean f23227k4;
    public int f23228l0;
    public int l1;
    public TLRPC.DraftMessage f23229l2;
    public final ArrayList f23230l3;
    public boolean l4;
    public float m0;
    public boolean f23231m1;
    public final org.telegram.ui.Components.t5 f23232m2;
    public org.telegram.ui.Components.k5 f23233m3;
    public final bi.t0 f23234m4;
    public float f23235n;
    public f11 f23236n0;
    public boolean f23237n1;
    public boolean f23238n2;
    public org.telegram.ui.Components.k5 f23239n3;
    public final org.telegram.ui.Components.d5 f23240n4;
    public Paint f23241o0;
    public float f23242o1;
    public final org.telegram.ui.Components.t5 f23243o2;
    public org.telegram.ui.Components.k5 f23244o3;
    public final org.telegram.ui.Components.d5 f23245o4;
    public Paint f23246p0;
    public float f23247p1;
    public long f23248p2;
    public org.telegram.ui.Components.k5 f23249p3;
    public int f23250p4;
    public boolean f23251q0;
    public float f23252q1;
    public n2 f23253q2;
    public int f23254q3;
    public boolean f23255q4;
    public boolean f23256r;
    public boolean f23257r0;
    public float f23258r1;
    public final boolean f23259r2;
    public int f23260r3;
    public final RectF f23261r4;
    public bi0 f23262s;
    public boolean f23263s0;
    public int f23264s1;
    public boolean f23265s2;
    public StaticLayout f23266s3;
    public zf.j f23267s4;
    public ji.f f23268t0;
    public float f23269t1;
    public boolean f23270t2;
    public boolean f23271t3;
    public Path f23272t4;
    public final m2 f23273u0;
    public int f23274u1;
    public boolean f23275u2;
    public int f23276u3;
    public RectF f23277u4;
    public Path f23278v0;
    public int f23279v1;
    public boolean f23280v2;
    public int f23281v3;
    public int f23282v4;
    public int f23283w;
    public nh.i f23284w0;
    public float f23285w1;
    public boolean f23286w2;
    public boolean f23287w3;
    public int f23288w4;
    public boolean f23289x;
    public boolean f23290x0;
    public boolean f23291x1;
    public int f23292x2;
    public float f23293x3;
    public int f23294x4;
    public boolean f23295y;
    public boolean f23296y0;
    public bi0 f23297y1;
    public int f23298y2;
    public boolean y3;
    public float f23299y4;
    public boolean f23300z0;
    public boolean f23301z1;
    public StaticLayout f23302z2;
    public boolean f23303z3;
    public boolean f23304z4;

    public v2(Context context, boolean z10) {
        this(null, context, z10, d20.f15147s0, null);
    }

    public static SpannableStringBuilder P(int i10, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
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

    private jj getCaptionMessage() {
        CharSequence charSequence;
        if (this.f23204g1 == null) {
            jj jjVar = this.f23199f1;
            if (jjVar == null || jjVar.f16394z == null) {
                return null;
            }
            return jjVar;
        }
        int i10 = 0;
        jj jjVar2 = null;
        for (int i11 = 0; i11 < this.f23204g1.size(); i11++) {
            jj jjVar3 = (jj) this.f23204g1.get(i11);
            if (jjVar3 != null && (charSequence = jjVar3.f16394z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i10++;
                }
                jjVar2 = jjVar3;
            }
        }
        if (i10 > 1) {
            return null;
        }
        return jjVar2;
    }

    private int getCollapsedHeight() {
        int i10;
        int i11;
        boolean z10 = this.f23259r2;
        if (!z10 && !tz.f18173p1) {
            i10 = this.J;
        } else {
            i10 = this.K;
        }
        int L = org.telegram.messenger.i0.L(i10) + 1;
        if (this.Q) {
            L += org.telegram.messenger.i0.L(20.0f);
        }
        if (T() && ((!z10 && !tz.f18173p1) || X())) {
            if (X()) {
                i11 = this.M;
            } else {
                i11 = this.L;
            }
            return org.telegram.messenger.i0.L(i11) + L;
        }
        return L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.J4);
        if (this.Q4 != w02 || this.R4 == null) {
            this.Q4 = w02;
            if (this.R4 == null) {
                this.R4 = new Paint(1);
            }
            this.R4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.R4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.G3) {
            if (U()) {
                return org.telegram.ui.ActionBar.t6.J0;
            }
            return org.telegram.ui.ActionBar.t6.K0;
        }
        return org.telegram.ui.ActionBar.t6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.N;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f19845id;
    }

    public final void A() {
        TLRPC.Message message;
        jj jjVar = this.f23199f1;
        if (jjVar != null && (message = jjVar.f16337k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.X0) {
                org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.F0);
                long j10 = this.H0;
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                f7.s(j10, yf.b.c(chatTheme), chatTheme, false);
            }
        }
    }

    public final void B() {
        boolean z10;
        float f7;
        TLRPC.Chat chat = this.f23205g2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23280v2 = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23252q1 = f7;
    }

    public final void D() {
        float f7;
        TLRPC.User Z1;
        if (this.f23200f2 != null && (Z1 = vp.r1(this.F0).Z1(Long.valueOf(this.f23200f2.f19942id))) != null) {
            this.f23200f2 = Z1;
        }
        if (Y()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23247p1 = f7;
    }

    public final void F() {
        boolean z10;
        float f7;
        n2 n2Var;
        if (this.f23228l0 > 0 && !this.f23280v2 && !Y() && (((n2Var = this.f23253q2) == null || !n2Var.f25836a.f23919q) && !this.f23273u0.f49483w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23286w2 = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.m0 = f7;
    }

    public final int G() {
        float f7;
        if (X() && !this.f23218j0 && !this.f23197f) {
            if (!this.f23259r2 && !tz.f18173p1) {
                f7 = 91.0f;
            } else {
                f7 = 86.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            if (this.f23265s2) {
                L++;
            }
            if (T()) {
                return org.telegram.messenger.i0.L(this.M) + L;
            }
            return L;
        }
        return getCollapsedHeight();
    }

    public final void H(int i10, int i11) {
        this.f23299y4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A4 = ofFloat;
        ofFloat.setDuration(220L);
        this.A4.setInterpolator(gr.f26495f);
        this.f23288w4 = i10;
        this.f23282v4 = i11;
        this.A4.addUpdateListener(new j2(this, 2));
        this.A4.addListener(new o2(this, 2));
        this.f23304z4 = true;
        this.A4.start();
    }

    public final boolean I(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.I(android.graphics.Canvas):boolean");
    }

    public final void J(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 != 0 || z13) {
            float f10 = (f7 * 0.5f) + 0.5f;
            if (z10) {
                z.t(this.V2, this.W2, org.telegram.ui.ActionBar.t6.X0);
                int i11 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.t6.X0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.t6.X0.draw(canvas);
                if (i11 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.t6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z12) {
                if (z11) {
                    z.t(this.X2, this.W2, org.telegram.ui.ActionBar.t6.W0);
                    if (z13) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.t6.W0.setAlpha((int) (f7 * 255.0f));
                    }
                    if (!z13 && i10 != 0) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                        int i12 = (int) (255.0f * f7);
                        org.telegram.ui.ActionBar.t6.W0.setAlpha(i12);
                        org.telegram.ui.ActionBar.t6.V0.setAlpha(i12);
                    }
                    org.telegram.ui.ActionBar.t6.W0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f7) * org.telegram.messenger.i0.L(4.0f), 0.0f);
                    }
                    z.t(this.T2, this.W2, org.telegram.ui.ActionBar.t6.V0);
                    org.telegram.ui.ActionBar.t6.V0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.t6.W0.setAlpha(255);
                    }
                    if (!z13 && i10 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.t6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.t6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                z.t(this.U2, this.W2, org.telegram.ui.ActionBar.t6.T0);
                int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i13 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.t6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.t6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.t6.T0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.t6.T0.draw(canvas);
                if (i13 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.t6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void K(Canvas canvas, boolean z10, int i10, int i11, int i12, float f7, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        Paint paint;
        boolean z13;
        RectF rectF;
        float f12;
        float interpolation;
        int i13;
        int L;
        int i14;
        RectF rectF2;
        int i15;
        int i16;
        int x02;
        if (!X() && !W()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ((this.G3 && this.L3) || this.V3 != 1.0f) {
            if (this.S0 == 0 && !this.T0) {
                f10 = 1.0f - this.V3;
            } else {
                f10 = this.V3;
            }
            int i17 = 255;
            if (z11) {
                if (this.T == null) {
                    Paint paint2 = new Paint();
                    this.T = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.T.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                    this.T.setStrokeJoin(Paint.Join.ROUND);
                    this.T.setStrokeCap(Paint.Cap.ROUND);
                }
                f11 = 1.0f;
                this.T.setColor(i0.b.f(Color.alpha(x02) / 255.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false), i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21207s9, false), 255)));
            } else {
                f11 = 1.0f;
            }
            if (this.P && this.N.read_inbox_max_id == 0) {
                if (this.S == null) {
                    this.S = new Paint();
                }
                paint = this.S;
                if (z10) {
                    i15 = org.telegram.ui.ActionBar.t6.Sk;
                } else {
                    i15 = org.telegram.ui.ActionBar.t6.Rk;
                }
                int w02 = org.telegram.ui.ActionBar.t6.w0(i15, this.J4);
                paint.setColor(w02);
                org.telegram.ui.ActionBar.t6.M0.setColor(w02);
                if (z10) {
                    i16 = 30;
                } else {
                    i16 = 40;
                }
                i17 = i16;
                z13 = true;
            } else {
                if (!z10 && this.J0 == 0) {
                    paint = org.telegram.ui.ActionBar.t6.f21271w0;
                } else {
                    paint = org.telegram.ui.ActionBar.t6.f21306y0;
                }
                z13 = false;
            }
            StaticLayout staticLayout = this.Y3;
            RectF rectF3 = this.f23261r4;
            if (staticLayout != null && this.S0 != 0) {
                paint.setAlpha((int) ((f11 - this.f23293x3) * i17));
                org.telegram.ui.ActionBar.t6.M0.setAlpha((int) ((f11 - this.f23293x3) * 255.0f));
                float f13 = f10 * 2.0f;
                if (f13 > f11) {
                    f12 = f11;
                } else {
                    f12 = f13;
                }
                float f14 = f11 - f12;
                float f15 = (i12 * f14) + (i11 * f12);
                float f16 = i10;
                rectF3.set(f15, f16, (this.P3 * f14) + (this.O3 * f12) + f15 + org.telegram.messenger.i0.L(12.666f), org.telegram.messenger.i0.L(20.666f) + i10);
                if (f10 <= 0.5f) {
                    interpolation = gr.f26496g.getInterpolation(f13);
                } else {
                    interpolation = gr.f26497i.getInterpolation(f11 - ((f10 - 0.5f) * 2.0f));
                }
                float f17 = (interpolation * 0.1f) + f11;
                canvas.save();
                float f18 = f17 * f7;
                canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
                if (z12) {
                    if (this.f23272t4 == null || (rectF2 = this.f23277u4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f23277u4;
                        if (rectF4 == null) {
                            this.f23277u4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f23272t4 == null) {
                            this.f23272t4 = new Path();
                        }
                        w7.z5.a(this.f23272t4, this.f23277u4, org.telegram.messenger.i0.L(10.33f));
                    }
                    canvas.drawPath(this.f23272t4, paint);
                    if (z11) {
                        canvas.drawPath(this.f23272t4, this.T);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), this.T);
                    }
                }
                if (this.Z3 != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.N(6.333f) + f15, org.telegram.messenger.i0.N(3.0f) + f16);
                    this.Z3.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.t6.M0.getAlpha();
                float f19 = alpha;
                org.telegram.ui.ActionBar.t6.M0.setAlpha((int) (f19 * f12));
                if (this.f23176a4 != null) {
                    canvas.save();
                    float N = org.telegram.messenger.i0.N(6.333f) + f15;
                    if (this.R3) {
                        i14 = org.telegram.messenger.i0.L(17.0f);
                    } else {
                        i14 = -org.telegram.messenger.i0.L(17.0f);
                    }
                    canvas.translate(N, org.telegram.messenger.i0.N(3.0f) + (i14 * f14) + f16);
                    this.f23176a4.draw(canvas);
                    canvas.restore();
                } else if (this.X3 != null) {
                    canvas.save();
                    float N2 = org.telegram.messenger.i0.N(6.333f) + f15;
                    if (this.R3) {
                        i13 = org.telegram.messenger.i0.L(17.0f);
                    } else {
                        i13 = -org.telegram.messenger.i0.L(17.0f);
                    }
                    canvas.translate(N2, org.telegram.messenger.i0.N(3.0f) + (i13 * f14) + f16);
                    this.X3.draw(canvas);
                    canvas.restore();
                }
                if (this.Y3 != null) {
                    org.telegram.ui.ActionBar.t6.M0.setAlpha((int) (f19 * f14));
                    canvas.save();
                    float N3 = org.telegram.messenger.i0.N(6.333f) + f15;
                    if (this.R3) {
                        L = -org.telegram.messenger.i0.L(17.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(17.0f);
                    }
                    canvas.translate(N3, org.telegram.messenger.i0.N(3.0f) + (L * f12) + f16);
                    this.Y3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.t6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.S0 != 0) {
                    staticLayout = this.X3;
                }
                paint.setAlpha((int) ((f11 - this.f23293x3) * i17));
                org.telegram.ui.ActionBar.t6.M0.setAlpha((int) ((f11 - this.f23293x3) * 255.0f));
                float f20 = i10;
                rectF3.set(i11, f20, org.telegram.messenger.i0.L(12.666f) + this.O3 + i11, org.telegram.messenger.i0.L(20.666f) + i10);
                int save = canvas.save();
                if (f7 != f11) {
                    canvas.scale(f7, f7, rectF3.centerX(), rectF3.centerY());
                }
                if (f10 != f11) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (z12) {
                    if (this.f23272t4 == null || (rectF = this.f23277u4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f23277u4;
                        if (rectF5 == null) {
                            this.f23277u4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f23272t4 == null) {
                            this.f23272t4 = new Path();
                        }
                        w7.z5.a(this.f23272t4, this.f23277u4, org.telegram.messenger.i0.L(10.33f));
                    }
                    canvas.drawPath(this.f23272t4, paint);
                    if (z11) {
                        canvas.drawPath(this.f23272t4, this.T);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(11.5f), org.telegram.messenger.i0.L(11.5f), this.T);
                    }
                }
                if (staticLayout != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(6.333f) + i11, org.telegram.messenger.i0.N(3.0f) + f20);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restoreToCount(save);
            }
            if (z13) {
                org.telegram.ui.ActionBar.t6.M0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.W8, false));
            }
        }
    }

    public boolean L() {
        return false;
    }

    public final java.lang.CharSequence N() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.N():java.lang.CharSequence");
    }

    public final java.lang.CharSequence O() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.O():java.lang.CharSequence");
    }

    public final CharSequence Q() {
        if (this.N4 == null) {
            this.N4 = new u2(this);
        }
        u2.a(this.N4, this.F0, this.f23199f1, this.f23205g2);
        this.N4.getClass();
        u2 u2Var = this.N4;
        this.M4 = u2Var.f23127c;
        this.f23198f0 = u2Var.d;
        return u2Var.f23129g;
    }

    public final ColorFilter R(int i10, int i11) {
        if (this.X4 == null) {
            this.Y4 = new int[4];
            this.X4 = new ColorFilter[4];
        }
        if (i11 != this.Y4[i10] || this.X4[i10] == null) {
            ColorFilter[] colorFilterArr = this.X4;
            this.Y4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.X4[i10];
    }

    public final SpannableStringBuilder S(int i10, CharSequence charSequence, String str, boolean z10) {
        CharSequence charSequence2;
        CharSequence M2;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String G;
        int size2;
        String L0;
        boolean z11;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        jj captionMessage = getCaptionMessage();
        jj jjVar = this.f23199f1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (jjVar != null) {
            charSequence2 = jjVar.v;
        } else {
            charSequence2 = null;
        }
        this.f23192e0 = true;
        if (!TextUtils.isEmpty(str)) {
            return P(i10, str, charSequence);
        }
        jj jjVar2 = this.f23199f1;
        TLRPC.Message message2 = jjVar2.f16337k;
        int i11 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = jjVar2.f16382w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                charSequence5 = jjVar2.v;
            }
            if (jj.E4(jjVar2)) {
                valueOf = P(i10, charSequence5, charSequence);
                if (this.f23199f1.f16324g2[0] instanceof gg.a) {
                    int i12 = this.F0;
                    TLRPC.TL_forumTopic f7 = vp.r1(i12).f18891r7.f(-jj.B0(this.f23199f1.f16337k), jj.c2(i12, this.f23199f1.f16337k, true, false));
                    if (f7 != null) {
                        ((gg.a) this.f23199f1.f16324g2[0]).b(f7.icon_color);
                    }
                }
            } else {
                this.f23192e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                y(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.f16394z) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.V) {
                str2 = "";
            } else if (jj.L4(captionMessage.f16337k)) {
                str2 = "📹 ";
            } else if (jj.R4(captionMessage.f16337k)) {
                str2 = "🎤 ";
            } else if (captionMessage.I3()) {
                str2 = "🎧 ";
            } else if (jj.S3(captionMessage.f16337k)) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.s2() && !TextUtils.isEmpty(captionMessage.f16337k.message)) {
                CharSequence charSequence7 = captionMessage.a2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 47);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.f23173a0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.f23173a0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.Z1) {
                    charSequence7 = org.telegram.messenger.i0.Q(charSequence7, (String) captionMessage.Y1.get(0), measuredWidth, this.f23173a0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.S5();
            ui.g(captionMessage.f16337k.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.f16337k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.f23173a0;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                ui.a(fontMetricsInt, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.i0.M2(spannableString));
            if (z10) {
                append = y(append);
            }
            return P(i10, append, charSequence);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.p6 p6Var = this.J4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z11 = jj.O2(this.f23199f1.f16337k.rich_message.blocks.get(0));
                } else {
                    z11 = false;
                }
                SpannableStringBuilder P = P(i10, this.f23199f1.v, charSequence);
                if (z11 && !X()) {
                    try {
                        l00 l00Var = new l00(org.telegram.ui.ActionBar.t6.p9, p6Var);
                        if (this.W) {
                            i11 = charSequence.length() + 2;
                        }
                        P.setSpan(l00Var, i11, P.length(), 33);
                        return P;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                return P;
            } else if (message2.media != null && !jjVar2.F3()) {
                this.f23173a0 = org.telegram.ui.ActionBar.t6.H0[this.E0];
                int i13 = org.telegram.ui.ActionBar.t6.f21137o9;
                jj jjVar3 = this.f23199f1;
                TLRPC.MessageMedia messageMedia = jjVar3.f16337k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2, -1);
                        ui.a(org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                        charSequence3 = eh.a.a(2131231053, spannableString2, true);
                    } else {
                        charSequence3 = eh.a.a(2131231053, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        ui.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3, -1);
                        ui.a(org.telegram.ui.ActionBar.t6.F0[this.E0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                        charSequence3 = eh.a.a(2131231047, spannableString3, true);
                    } else {
                        charSequence3 = eh.a.a(2131231047, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = eh.a.a(2131231048, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (jjVar3.D == 14) {
                    charSequence3 = f1.o("🎧 \u2068", jjVar3.x1(true), " - ", this.f23199f1.z1(true), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.S1) {
                        if (size3 > 1) {
                            L0 = cd.G(size3, "Media", new Object[0]);
                        } else {
                            L0 = cd.L0(2131753933, null);
                        }
                    } else if (size3 > 1) {
                        L0 = cd.G(size3, "Photos", new Object[0]);
                    } else {
                        L0 = cd.L0(2131753948, null);
                    }
                    charSequence3 = rh.h8.S0(cd.a0(null, null, 2131753949, L0));
                    i13 = org.telegram.ui.ActionBar.t6.p9;
                } else if (this.R1 > 1) {
                    if (this.S1) {
                        ArrayList arrayList2 = this.f23204g1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        G = cd.G(size2, "Media", new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f23204g1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        G = cd.G(size, "Photos", new Object[0]);
                    }
                    charSequence3 = G;
                    i13 = org.telegram.ui.ActionBar.t6.p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i13 = org.telegram.ui.ActionBar.t6.p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z10) {
                    charSequence3 = y(charSequence3);
                }
                SpannableStringBuilder P2 = P(i10, charSequence3, charSequence);
                if (!X()) {
                    try {
                        l00 l00Var2 = new l00(i13, p6Var);
                        if (this.W) {
                            i11 = charSequence.length() + 2;
                        }
                        P2.setSpan(l00Var2, i11, P2.length(), 33);
                        return P2;
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                return P2;
            } else {
                jj jjVar4 = this.f23199f1;
                String str3 = jjVar4.f16337k.message;
                if (str3 != null) {
                    if (jjVar4.s2()) {
                        CharSequence charSequence9 = this.f23199f1.a2;
                        M2 = str3;
                        if (charSequence9 != null) {
                            M2 = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(this.I + 33);
                        if (this.W) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.f23173a0.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.f23173a0.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            M2 = org.telegram.messenger.i0.Q(M2, (String) this.f23199f1.Y1.get(0), measuredWidth2, this.f23173a0);
                        }
                    } else {
                        int length2 = str3.length();
                        CharSequence charSequence10 = str3;
                        if (length2 > 150) {
                            charSequence10 = str3.subSequence(0, 150);
                        }
                        M2 = org.telegram.messenger.i0.M2(charSequence10);
                    }
                    ?? spannableString4 = new SpannableString(M2);
                    jj jjVar5 = this.f23199f1;
                    if (jjVar5 != null) {
                        jjVar5.S5();
                    }
                    jj jjVar6 = this.f23199f1;
                    Pattern pattern = ui.R1;
                    ui.g(jjVar6.f16337k.entities, jjVar6.v, spannableString4, 264);
                    jj jjVar7 = this.f23199f1;
                    if (jjVar7 != null && (message = jjVar7.f16337k) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.f23173a0;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        ui.a(fontMetricsInt, spannableString4, arrayList4);
                    }
                    if (z10) {
                        spannableString4 = y(spannableString4);
                    }
                    return P(i10, spannableString4, charSequence);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean T() {
        ji.f fVar = this.f23268t0;
        if (fVar != null && !((ArrayList) fVar.d).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (org.telegram.messenger.w3.Y(this.f23205g2)) {
            return !this.f23193e1;
        }
        if (this.P) {
            return this.f23174a1;
        }
        TLRPC.Chat chat = this.f23205g2;
        if (chat != null && chat.forum && this.N == null) {
            if (!this.f23188d1) {
                return true;
            }
            return false;
        }
        return this.Z0;
    }

    public final boolean V() {
        if (this.J0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (this.J0 != 0) {
            return true;
        }
        return false;
    }

    public boolean X() {
        TLRPC.Chat chat;
        if (!V() && !this.P0 && (chat = this.f23205g2) != null) {
            if (!chat.forum) {
                if (org.telegram.messenger.w3.p0(chat)) {
                    if (!org.telegram.messenger.w3.A(this.F0, this.f23205g2, 24)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (!this.P) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Y() {
        TLRPC.User user;
        if (!X() && !this.f23273u0.f49483w && (user = this.f23200f2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i10 = this.F0;
            if (userStatus == null || userStatus.expires > 0 || !vp.r1(i10).Z.containsKey(Long.valueOf(this.f23200f2.f19942id))) {
                TLRPC.UserStatus userStatus2 = this.f23200f2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(float f7) {
        if (!cd.X) {
            if (f7 >= 0.0f && f7 < org.telegram.messenger.i0.L(60.0f)) {
                return true;
            }
            return false;
        } else if (f7 >= getMeasuredWidth() - org.telegram.messenger.i0.L(60.0f) && f7 < getMeasuredWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public final void a0(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.y3 == z10) {
            if (!getIsPinned()) {
                this.y3 = false;
                return;
            }
            return;
        }
        this.y3 = z10;
        float f7 = 1.0f;
        if (z11) {
            if (z10) {
                f7 = 0.0f;
            }
            this.f23293x3 = f7;
        } else {
            if (!z10) {
                f7 = 0.0f;
            }
            this.f23293x3 = f7;
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21023i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20988g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21137o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21041j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21061k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21059k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20932d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20913c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21118n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21098m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21079l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21005h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ak));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.W8));
    }

    public final void b0() {
        float f7;
        boolean z10 = tz.f18176q1;
        this.f23231m1 = z10;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.D1 = f7;
        this.a2.f29870o = f7;
        this.f23269t1 = 0.0f;
        this.f23291x1 = false;
        if (!getIsPinned() || !this.y3) {
            f10 = 0.0f;
        }
        this.f23293x3 = f10;
        this.f23287w3 = true;
        this.f23242o1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.d5 d5Var = this.f23240n4;
        if (d5Var != null && this.f23287w3) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f23245o4;
        if (d5Var2 != null && this.f23287w3) {
            d5Var2.a();
        }
    }

    public final void c0(boolean z10, boolean z11) {
        n2 n2Var = this.f23253q2;
        if (n2Var == null && !z10) {
            return;
        }
        if (n2Var == null) {
            n2 n2Var2 = new n2(this, getContext(), this.J4, 0);
            this.f23253q2 = n2Var2;
            n2Var2.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
            this.f23253q2.setDrawUnchecked(false);
            this.f23253q2.setDrawBackgroundAsArc(3);
            addView(this.f23253q2);
        }
        this.f23253q2.a(z10, z11);
        F();
    }

    public final void d0(long j10, jj jjVar, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        if (this.H0 != j10) {
            this.f23294x4 = -1;
        }
        this.H0 = j10;
        this.B4 = System.currentTimeMillis();
        this.f23199f1 = jjVar;
        this.f23275u2 = z10;
        this.N0 = false;
        this.R0 = i10;
        if (jjVar != null) {
            int i12 = jjVar.f16337k.edit_date;
        }
        this.S0 = 0;
        this.T0 = false;
        if (jjVar != null) {
            i11 = jjVar.f1();
        } else {
            i11 = 0;
        }
        this.l1 = i11;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        if (jjVar != null && jjVar.F4()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.X0 = z12;
        jj jjVar2 = this.f23199f1;
        if (jjVar2 != null) {
            this.Y0 = jjVar2.f16337k.send_state;
        }
        i0(0, z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.P && !this.F && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f23273u0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(TLRPC.Dialog dialog, int i10, int i11) {
        boolean z10;
        if (this.H0 != dialog.f19797id) {
            ValueAnimator valueAnimator = this.A4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.A4.cancel();
            }
            this.f23304z4 = false;
            this.f23294x4 = -1;
        }
        this.H0 = dialog.f19797id;
        this.B4 = System.currentTimeMillis();
        boolean z11 = true;
        this.N0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.K0 = dialog.community_id;
        } else {
            this.K0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.J0 = ((TLRPC.TL_dialogFolder) dialog).folder.f19844id;
            mh0 mh0Var = this.f23194e2;
            if (mh0Var != null) {
                mh0Var.H = this;
                mh0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.f23219j1 = i10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Runnable runnable = this.Z4;
        if (runnable == null) {
            z11 = false;
        }
        if (z10 != z11) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.Z4 = null;
            } else if (z10) {
                this.Z4 = zs.f(this.F0).h(this, zs.f19629i3, new l2(this, 0));
            }
        }
        if (this.f23268t0 == null) {
            this.f23268t0 = new ji.f(this);
        }
        this.f23224k1 = i11;
        this.l1 = 0;
        if (i0(0, false)) {
            requestLayout();
        }
        D();
        B();
        A();
        F();
    }

    public final void f0(TLRPC.TL_forumTopic tL_forumTopic, long j10, jj jjVar, boolean z10, boolean z11) {
        boolean z12;
        mh0 mh0Var;
        this.N = tL_forumTopic;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.P = z12;
        if (this.H0 != j10) {
            this.f23294x4 = -1;
        }
        Drawable drawable = jjVar.f16324g2[0];
        if (drawable instanceof gg.a) {
            ((gg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j10;
        this.B4 = System.currentTimeMillis();
        this.f23199f1 = jjVar;
        this.N0 = false;
        this.f23203g0 = z10;
        this.R0 = jjVar.f16337k.date;
        this.T0 = false;
        this.l1 = jjVar.f1();
        this.X0 = jjVar.F4();
        jj jjVar2 = this.f23199f1;
        if (jjVar2 != null) {
            this.Y0 = jjVar2.f16337k.send_state;
        }
        if (!z11) {
            this.f23294x4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f23204g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.f19845id == 1 && (mh0Var = this.f23194e2) != null) {
            mh0Var.H = this;
            mh0Var.i();
        }
        i0(0, z11);
    }

    public final void g0(int i10, jj jjVar) {
        boolean z10;
        boolean z11;
        int i11;
        String str;
        float f7;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = jjVar.f16348n0;
        TLObject tLObject = jjVar.f16342l0;
        if (jjVar.y4()) {
            TL_stories.StoryItem storyItem = jjVar.f16337k.media.storyItem;
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
        TLRPC.PhotoSize R = org.telegram.messenger.b8.R(arrayList);
        TLRPC.PhotoSize photoSize = null;
        if (R == null) {
            R = org.telegram.messenger.b8.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.i0.Z0(false), false, null, true);
        if (R != w9) {
            photoSize = w9;
        }
        if (photoSize == null || !org.telegram.messenger.b6.q(this.F0).d(jjVar)) {
            photoSize = R;
        }
        if (R != null) {
            if (!this.S1 && !jj.L4(jjVar.f16337k) && !jjVar.h4()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.S1 = z10;
            int i12 = this.R1;
            if (i12 < 3) {
                this.R1 = i12 + 1;
                if ((jj.L4(jjVar.f16337k) || jjVar.h4()) && !jjVar.t2()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.W1[i10] = z11;
                this.X1[i10] = jjVar.t2();
                if (jjVar.D == 1 && photoSize != null) {
                    i11 = photoSize.size;
                } else {
                    i11 = 0;
                }
                if (jjVar.t2()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.V1;
                imageReceiverArr[i10].r0(ic.f(photoSize, tLObject), str, ic.f(R, tLObject), str, null, i11, null, jjVar, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i10];
                if (jjVar.h4()) {
                    f7 = 18.0f;
                } else {
                    f7 = 2.0f;
                }
                imageReceiver.J0(org.telegram.messenger.i0.L(f7));
                this.V = false;
            }
        }
    }

    public float getClipProgress() {
        return this.f23269t1;
    }

    public int getCurrentDialogFolderId() {
        return this.J0;
    }

    public long getDialogId() {
        return this.H0;
    }

    public boolean getHasUnread() {
        if (this.S0 == 0 && !this.T0) {
            return false;
        }
        return true;
    }

    public boolean getIsMuted() {
        return this.Z0;
    }

    public boolean getIsPinned() {
        if (!this.A3 && !this.B3) {
            return false;
        }
        return true;
    }

    public jj getMessage() {
        return this.f23199f1;
    }

    public int getMessageId() {
        return this.l1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f23248p2;
    }

    @Override
    public float getTranslationX() {
        return this.f23285w1;
    }

    public final void h0() {
        mh0 mh0Var = this.f23194e2;
        if (mh0Var != null) {
            if (this.P) {
                mh0Var.K = org.telegram.messenger.i0.L(24.0f);
                this.f23194e2.L = org.telegram.messenger.i0.L(24.0f);
                this.f23194e2.M = 0.0f;
            } else {
                m2 m2Var = this.f23273u0;
                RectF rectF = m2Var.F;
                RectF rectF2 = m2Var.F;
                mh0Var.K = rectF.centerY();
                this.f23194e2.L = rectF2.centerX();
                this.f23194e2.M = rectF2.width() / 2.0f;
                if (!vp.r1(this.F0).O1().h.isEmpty()) {
                    this.f23194e2.M -= org.telegram.messenger.i0.N(3.5f);
                }
                mh0 mh0Var2 = this.f23194e2;
                this.Y1.q();
                mh0Var2.getClass();
            }
            mh0 mh0Var3 = this.f23194e2;
            if (!mh0Var3.E && mh0Var3.I != null) {
                AnimatorSet animatorSet = mh0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mh0Var3.B.cancel();
                }
                mh0Var3.E = true;
                mh0Var3.F = true;
                mh0Var3.D = 0.0f;
                mh0Var3.I.getTranslationY();
                org.telegram.messenger.i0.L(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lh0(mh0Var3, 5));
                ofFloat.setInterpolator(gr.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new lh0(mh0Var3, 6));
                gr grVar = gr.f26498j;
                ofFloat2.setInterpolator(grVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new lh0(mh0Var3, 7));
                ofFloat3.setInterpolator(grVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                mh0Var3.B = animatorSet2;
                animatorSet2.addListener(new t60(mh0Var3, 11));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                mh0Var3.B.playTogether(ofFloat, animatorSet3);
                mh0Var3.B.start();
            }
        }
    }

    public final boolean i0(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.i0(int, boolean):boolean");
    }

    @Override
    public final void invalidate() {
        if (th.o7.f49287x1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f23297y1 && drawable != org.telegram.ui.ActionBar.t6.f21237u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    public final void j0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.j0():void");
    }

    public final void k0(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.Z4 != null && this.f23200f2 != null) {
            requirementToContact = vp.r1(this.F0).H2(this.f23200f2.f19942id);
        } else {
            requirementToContact = null;
        }
        boolean z12 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.f23238n2 == z12 && this.f23248p2 == org.telegram.messenger.o5.k(requirementToContact)) {
            return;
        }
        this.f23238n2 = z12;
        this.f23248p2 = org.telegram.messenger.o5.k(requirementToContact);
        if (!z10) {
            this.f23232m2.f(this.f23238n2, true);
            if (this.f23248p2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f23243o2.f(z11, true);
        }
        invalidate();
    }

    public final void l0() {
        StaticLayout staticLayout;
        int i10;
        if (this.R1 > 0) {
            if (X()) {
                staticLayout = this.f23211h3;
            } else {
                staticLayout = this.f23195e3;
            }
            if (X()) {
                i10 = this.f23185c3;
            } else {
                i10 = this.f23180b3;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        t2[] t2VarArr = (t2[]) ((Spanned) text).getSpans(0, text.length(), t2.class);
                        boolean[] zArr = this.U1;
                        if (t2VarArr != null && t2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(t2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f23290x0 && !this.f23296y0) {
                                ceil += org.telegram.messenger.i0.L(3.0f);
                            }
                            for (int i11 = 0; i11 < this.R1; i11++) {
                                this.V1[i11].K0 = i10 + ceil + org.telegram.messenger.i0.L((this.L4 + 2) * i11);
                                zArr[i11] = true;
                            }
                            return;
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            zArr[i12] = false;
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1.P();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].P();
            i10++;
        }
        b0();
        this.f23233m3 = org.telegram.ui.Components.o5.update(0, this, this.f23233m3, this.f23195e3);
        this.f23239n3 = org.telegram.ui.Components.o5.update(0, this, this.f23239n3, this.f23266s3);
        this.f23244o3 = org.telegram.ui.Components.o5.update(0, this, this.f23244o3, this.f23211h3);
        this.f23249p3 = org.telegram.ui.Components.o5.update(0, this, this.f23249p3, this.f23302z2);
        org.telegram.ui.Components.d5 d5Var = this.f23240n4;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f23245o4;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f7;
        super.onDetachedFromWindow();
        this.f23291x1 = false;
        this.A1 = false;
        this.B1 = 0.0f;
        this.f23287w3 = false;
        if (getIsPinned() && this.y3) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f23293x3 = f7;
        this.Y1.R();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].R();
            i10++;
        }
        bi0 bi0Var = this.f23297y1;
        if (bi0Var != null) {
            bi0Var.stop();
            this.f23297y1.T(true, 0.0f);
            this.f23297y1.setCallback(null);
            this.f23297y1 = null;
            this.f23301z1 = false;
        }
        zf.j jVar = this.f23267s4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.d5 d5Var = this.f23240n4;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f23245o4;
        if (d5Var2 != null) {
            d5Var2.b();
        }
        org.telegram.ui.Components.o5.release(this, this.f23233m3);
        org.telegram.ui.Components.o5.release(this, this.f23239n3);
        org.telegram.ui.Components.o5.release(this, this.f23244o3);
        org.telegram.ui.Components.o5.release(this, this.f23249p3);
        this.f23273u0.g();
        this.f23182c0 = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        mh0 mh0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (W() && (mh0Var = this.f23194e2) != null && tz.f18176q1 && mh0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!W() && this.D4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296262, cd.L0(2131754940, null)));
            }
        }
        n2 n2Var = this.f23253q2;
        if (n2Var != null && n2Var.f25836a.f23919q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23213i0 == 0.0f && !this.P && !this.F && this.f23273u0.a(this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int L;
        int i16;
        if (this.H0 != 0 || this.G0 != null) {
            bi.t0 t0Var = this.f23234m4;
            if (t0Var != null) {
                t0Var.layout(0, 0, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(22.0f));
            }
            if (this.f23253q2 != null) {
                int i17 = this.I;
                boolean z11 = this.f23259r2;
                if (!z11 && !tz.f18173p1) {
                    i14 = 27;
                } else {
                    i14 = 29;
                }
                int L2 = org.telegram.messenger.i0.L(i17 - i14);
                if (this.f23223k0) {
                    i16 = org.telegram.messenger.i0.L(8.0f);
                    L = (getMeasuredHeight() - this.f23253q2.getMeasuredHeight()) >> 1;
                } else {
                    if (cd.X) {
                        L2 = (i12 - i10) - L2;
                    }
                    float f7 = this.U;
                    if (!z11 && !tz.f18173p1) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    int i18 = L2;
                    L = org.telegram.messenger.i0.L(f7 + i15);
                    i16 = i18;
                }
                n2 n2Var = this.f23253q2;
                n2Var.layout(i16, L, n2Var.getMeasuredWidth() + i16, this.f23253q2.getMeasuredHeight() + L);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.K4 && !this.A0) {
                return;
            }
            this.A0 = false;
            this.K4 = measuredWidth;
            try {
                z();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        bi.t0 t0Var = this.f23234m4;
        if (t0Var != null) {
            t0Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), 1073741824));
        }
        n2 n2Var = this.f23253q2;
        if (n2Var != null) {
            n2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.f23259r2;
            if (!z10 && !tz.f18173p1) {
                i12 = this.J;
            } else {
                i12 = this.K;
            }
            if (T() && ((!z10 && !tz.f18173p1) || X())) {
                if (X()) {
                    i13 = this.M;
                } else {
                    i13 = this.L;
                }
            } else {
                i13 = 0;
            }
            setMeasuredDimension(size, org.telegram.messenger.i0.L(i12 + i13) + (this.f23265s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !T()) {
                z();
                if (this.R) {
                    this.Q = true;
                    z();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), G());
        this.f23274u1 = 0;
        this.f23279v1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        jj captionMessage;
        TLRPC.User Z1;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.L0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.J0 == 1) {
            z20.q(null, 2131754136, sb2, ". ");
        } else {
            if (this.f23210h2 != null) {
                z20.q(null, 2131754777, sb2, ". ");
            }
            if (this.P && this.N != null) {
                z20.q(null, 2131754746, sb2, ". ");
                sb2.append(this.N.title);
                sb2.append(". ");
            } else {
                TLRPC.User user = this.f23200f2;
                if (user != null) {
                    if (h20.z(user)) {
                        sb2.append(cd.L0(2131746281, null));
                    } else if (h20.s(this.f23200f2)) {
                        sb2.append(cd.L0(2131754252, null));
                    } else {
                        if (this.f23200f2.bot) {
                            z20.q(null, 2131753156, sb2, ". ");
                        }
                        TLRPC.User user2 = this.f23200f2;
                        if (user2.self) {
                            sb2.append(cd.L0(2131745918, null));
                        } else {
                            sb2.append(org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f23205g2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(cd.L0(2131754904, null));
                        } else {
                            sb2.append(cd.L0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.f23205g2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f23222j4) {
            z20.q(null, 2131754739, sb2, ". ");
        }
        if (this.Z0) {
            z20.q(null, 2131754829, sb2, ". ");
        }
        if (Y()) {
            z20.q(null, 2131754741, sb2, ". ");
        }
        int i10 = this.S0;
        if (i10 > 0) {
            sb2.append(cd.G(i10, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i11 = this.U0;
        if (i11 > 0) {
            sb2.append(cd.G(i11, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.V0 > 0) {
            z20.q(null, 2131754841, sb2, ". ");
        }
        jj jjVar = this.f23199f1;
        if (jjVar != null && this.J0 == 0) {
            int i12 = this.R0;
            if (i12 == 0) {
                i12 = jjVar.f16337k.date;
            }
            String s10 = cd.s(i12, true);
            if (this.f23199f1.N3()) {
                sb2.append(cd.a0("AccDescrSentDate", null, 2131754765, s10));
            } else {
                sb2.append(cd.a0("AccDescrReceivedDate", null, 2131754789, s10));
            }
            sb2.append(". ");
            if (this.f23205g2 != null && !this.f23199f1.N3() && this.f23199f1.p3() && this.f23199f1.f16337k.action == null && (Z1 = vp.r1(this.F0).Z1(Long.valueOf(this.f23199f1.f16337k.from_id.user_id))) != null) {
                sb2.append(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                sb2.append(". ");
            }
            if (this.f23210h2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f23199f1.v);
                if (!this.f23199f1.F3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.f16394z)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.f16394z);
                }
                StaticLayout staticLayout = this.f23195e3;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        ay ayVar;
        if (i10 == 2131296262 && (ayVar = this.D4) != null) {
            ayVar.S4(this);
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    @Override
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(mh0 mh0Var) {
        this.f23194e2 = mh0Var;
    }

    public void setBottomClip(int i10) {
        this.f23279v1 = i10;
    }

    public void setClipProgress(float f7) {
        this.f23269t1 = f7;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.H0 = j10;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.I0, str)) {
            this.I0 = str;
            z();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(q2 q2Var) {
        this.G0 = q2Var;
        this.l1 = 0;
        i0(0, true);
        D();
        B();
        A();
        F();
    }

    public void setDialogCellDelegate(r2 r2Var) {
        this.f23187d0 = r2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.f23255q4 != z10) {
            invalidate();
        }
        this.f23255q4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f23218j0 = z10;
    }

    public void setMoving(boolean z10) {
        this.f23256r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        if (this.I1 == null) {
            this.I1 = new qz0(cd.L0(2131753020, null), 14.0f, org.telegram.messenger.i0.o());
        }
        this.E1 = z10;
        this.F1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.B3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            z();
        }
        invalidate();
    }

    public void setPreloader(zf.j jVar) {
        this.f23267s4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f7) {
        if (this.f23213i0 != f7) {
            this.f23213i0 = f7;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.f23291x1 = z10;
    }

    public void setTitleOverride(String str) {
        this.L0 = str;
    }

    public void setTopClip(int i10) {
        this.f23274u1 = i10;
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 == this.f23285w1) {
            return;
        }
        this.f23285w1 = f7;
        bi0 bi0Var = this.f23297y1;
        boolean z10 = true;
        if (bi0Var != null && f7 == 0.0f) {
            bi0Var.T(true, 0.0f);
            this.f23301z1 = false;
            this.f23231m1 = tz.f18176q1;
            this.B1 = 0.0f;
            this.f23291x1 = false;
        }
        float f10 = this.f23285w1;
        if (f10 != 0.0f) {
            this.f23291x1 = true;
        } else {
            this.C1 = 0.0f;
            this.B1 = 0.0f;
            this.A1 = false;
        }
        if (this.f23291x1 && !this.f23289x) {
            boolean z11 = this.A1;
            if (Math.abs(f10) < getMeasuredWidth() * 0.45f) {
                z10 = false;
            }
            this.A1 = z10;
            if (z11 != z10 && this.f23231m1 == tz.f18176q1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.f23300z0 != z10) {
            this.f23300z0 = z10;
            if (z10) {
                invalidate();
            }
        }
    }

    @Override
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.H0 != 0 || this.G0 != null) {
                    i0(0, true);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final CharSequence y(CharSequence charSequence) {
        if (this.R1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new t2(org.telegram.messenger.i0.L(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void z() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.z():void");
    }

    public v2(ay ayVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = true;
        this.f23295y = true;
        int i11 = 0;
        this.D = false;
        this.H = 11;
        this.I = 72;
        this.J = 70;
        this.K = 76;
        this.L = 3;
        this.M = 11;
        this.U = 42.0f;
        m2 m2Var = new m2(this);
        this.f23273u0 = m2Var;
        this.f23300z0 = true;
        this.C0 = 0.0f;
        this.f23188d1 = false;
        this.f23193e1 = false;
        this.F1 = new dc(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.a2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f23189d2 = new p2(0);
        gr grVar = gr.h;
        this.f23232m2 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.f23243o2 = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.f23216i3 = new Stack();
        this.f23221j3 = new ArrayList();
        this.f23226k3 = new Stack();
        this.f23230l3 = new ArrayList();
        this.L3 = true;
        this.S3 = new fe.b(this, grVar, 320L);
        this.V3 = 1.0f;
        this.W3 = 1.0f;
        this.f23261r4 = new RectF();
        this.f23294x4 = -1;
        this.H4 = -1;
        this.I4 = new s2(this);
        m2Var.I = true;
        this.J4 = p6Var;
        this.D4 = ayVar;
        org.telegram.ui.ActionBar.t6.T(context);
        this.D = false;
        this.E = false;
        imageReceiver.J0(org.telegram.messenger.i0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i11 < imageReceiverArr.length) {
                imageReceiverArr[i11] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.V1[i11];
                imageReceiver2.f14420y = true;
                imageReceiver2.J0(org.telegram.messenger.i0.L(2.0f));
                this.V1[i11].f14424z1 = true;
                i11++;
            } else {
                this.f23259r2 = z10;
                this.F0 = i10;
                bi.t0 t0Var = new bi.t0(this, context, 7);
                this.f23234m4 = t0Var;
                addView(t0Var);
                this.f23240n4 = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(22.0f), t0Var);
                this.f23245o4 = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(17.0f), this);
                this.Y1.f14424z1 = true;
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (th.o7.f49287x1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
