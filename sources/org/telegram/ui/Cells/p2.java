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
import android.os.Bundle;
import android.text.Spannable;
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
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.fy;
import org.telegram.ui.th;
public class p2 extends a0 implements lh.y6, org.telegram.ui.ActionBar.x5 {
    public boolean A;
    public int A0;
    public boolean A1;
    public Paint A2;
    public int A3;
    public final m2 A4;
    public boolean B;
    public final int B0;
    public final uc B1;
    public Paint B2;
    public float B3;
    public final org.telegram.ui.ActionBar.c6 B4;
    public b7 C;
    public k2 C0;
    public final Paint C1;
    public boolean C2;
    public boolean C3;
    public int C4;
    public int D;
    public long D0;
    public final RectF D1;
    public int D2;
    public boolean D3;
    public int D4;
    public int E;
    public String E0;
    public zz0 E1;
    public int E2;
    public int E3;
    public int E4;
    public int F;
    public int F0;
    public boolean F1;
    public int F2;
    public int F3;
    public o2 F4;
    public int G;
    public long G0;
    public nh.b0 G1;
    public int G2;
    public int G3;
    public GradientDrawable G4;
    public final int H;
    public String H0;
    public boolean H1;
    public int H2;
    public int H3;
    public int H4;
    public final int I;
    public int I0;
    public int I1;
    public int I2;
    public int I3;
    public int I4;
    public TLRPC.TL_forumTopic J;
    public boolean J0;
    public int J1;
    public StaticLayout J2;
    public boolean J3;
    public Paint J4;
    public boolean K;
    public boolean K0;
    public String K1;
    public int K2;
    public final vd.a K3;
    public cg.r1 K4;
    public boolean L;
    public boolean L0;
    public int L1;
    public boolean L2;
    public ValueAnimator L3;
    public Drawable L4;
    public boolean M;
    public boolean M0;
    public xi0 M1;
    public boolean M2;
    public ValueAnimator M3;
    public int M4;
    public boolean N;
    public int N0;
    public int N1;
    public boolean N2;
    public float N3;
    public Drawable N4;
    public Paint O;
    public int O0;
    public boolean O1;
    public boolean O2;
    public float O3;
    public Drawable O4;
    public Paint P;
    public boolean P0;
    public Paint P1;
    public int P2;
    public StaticLayout P3;
    public ColorFilter[] P4;
    public float Q;
    public int Q0;
    public final boolean[] Q1;
    public int Q2;
    public StaticLayout Q3;
    public int[] Q4;
    public boolean R;
    public int R0;
    public final ImageReceiver[] R1;
    public int R2;
    public StaticLayout R3;
    public Runnable R4;
    public boolean S;
    public int S0;
    public final boolean[] S1;
    public int S2;
    public StaticLayout S3;
    public TextPaint T;
    public boolean T0;
    public final boolean[] T1;
    public int T2;
    public boolean T3;
    public Paint U;
    public int U0;
    public final ImageReceiver U1;
    public int U2;
    public boolean U3;
    public ad V;
    public boolean V0;
    public le0 V1;
    public int V2;
    public boolean V3;
    public l2 W;
    public boolean W0;
    public final org.telegram.ui.Components.e9 W1;
    public int W2;
    public int W3;
    public boolean X0;
    public boolean X1;
    public int X2;
    public int X3;
    public float Y0;
    public float Y1;
    public int Y2;
    public int Y3;
    public boolean Z0;
    public final f2.a0 Z1;
    public int Z2;
    public int Z3;
    public boolean f24828a0;
    public boolean f24829a1;
    public ei0 a2;
    public StaticLayout f24830a3;
    public StaticLayout f24831a4;
    public boolean f24832b0;
    public MessageObject f24833b1;
    public TLRPC.User f24834b2;
    public StaticLayout f24835b3;
    public boolean f24836b4;
    public boolean f24837c0;
    public ArrayList f24838c1;
    public TLRPC.Chat f24839c2;
    public int c3;
    public boolean f24840c4;
    public Drawable[] f24841d0;
    public boolean f24842d1;
    public TLRPC.EncryptedChat f24843d2;
    public StaticLayout f24844d3;
    public boolean f24845d4;
    public float f24846e0;
    public CharSequence f24847e1;
    public CharSequence f24848e2;
    public final Stack f24849e3;
    public final cg.h0 f24850e4;
    public boolean f24851f;
    public boolean f24852f0;
    public int f24853f1;
    public int f24854f2;
    public final ArrayList f24855f3;
    public final org.telegram.ui.Components.n5 f24856f4;
    public boolean f24857g0;
    public int f24858g1;
    public boolean f24859g2;
    public final Stack f24860g3;
    public final org.telegram.ui.Components.n5 f24861g4;
    public final boolean h;
    public int f24862h0;
    public int f24863h1;
    public TLRPC.DraftMessage f24864h2;
    public final ArrayList f24865h3;
    public int f24866h4;
    public float f24867i0;
    public boolean f24868i1;
    public final org.telegram.ui.Components.d6 f24869i2;
    public org.telegram.ui.Components.u5 f24870i3;
    public boolean f24871i4;
    public m11 f24872j0;
    public boolean f24873j1;
    public boolean f24874j2;
    public org.telegram.ui.Components.u5 f24875j3;
    public final RectF f24876j4;
    public Paint f24877k0;
    public float f24878k1;
    public final org.telegram.ui.Components.d6 f24879k2;
    public org.telegram.ui.Components.u5 f24880k3;
    public rf.i f24881k4;
    public Paint f24882l0;
    public float l1;
    public long f24883l2;
    public org.telegram.ui.Components.u5 f24884l3;
    public Path f24885l4;
    public boolean m0;
    public float f24886m1;
    public nh.h3 f24887m2;
    public int f24888m3;
    public RectF f24889m4;
    public float f24890n;
    public boolean f24891n0;
    public float f24892n1;
    public final boolean f24893n2;
    public int f24894n3;
    public int f24895n4;
    public boolean f24896o0;
    public int f24897o1;
    public boolean f24898o2;
    public StaticLayout f24899o3;
    public int f24900o4;
    public cs f24901p0;
    public float f24902p1;
    public boolean f24903p2;
    public boolean f24904p3;
    public int f24905p4;
    public final i2 f24906q0;
    public int f24907q1;
    public boolean f24908q2;
    public int f24909q3;
    public float f24910q4;
    public boolean f24911r;
    public Path f24912r0;
    public int f24913r1;
    public boolean f24914r2;
    public int f24915r3;
    public boolean f24916r4;
    public xi0 f24917s;
    public gh.k f24918s0;
    public float f24919s1;
    public boolean f24920s2;
    public boolean f24921s3;
    public ValueAnimator f24922s4;
    public boolean f24923t0;
    public boolean f24924t1;
    public int f24925t2;
    public float f24926t3;
    public long f24927t4;
    public boolean f24928u0;
    public xi0 f24929u1;
    public int f24930u2;
    public boolean f24931u3;
    public int f24932u4;
    public int v;
    public boolean f24933v0;
    public boolean f24934v1;
    public StaticLayout f24935v2;
    public boolean f24936v3;
    public final fy f24937v4;
    public boolean f24938w;
    public boolean f24939w0;
    public boolean f24940w1;
    public boolean f24941w2;
    public boolean f24942w3;
    public StaticLayout f24943w4;
    public boolean f24944x;
    public boolean f24945x0;
    public float f24946x1;
    public float f24947x2;
    public boolean f24948x3;
    public int x4;
    public boolean f24949y;
    public float f24950y0;
    public float f24951y1;
    public boolean f24952y2;
    public int f24953y3;
    public int f24954y4;
    public qh.a f24955z0;
    public float f24956z1;
    public boolean f24957z2;
    public int f24958z3;
    public int f24959z4;

    public p2(Context context, boolean z10) {
        this(null, context, z10, UserConfig.selectedAccount, null);
    }

    public static SpannableStringBuilder H(CharSequence charSequence, CharSequence charSequence2, int i10) {
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

    private MessageObject getCaptionMessage() {
        CharSequence charSequence;
        if (this.f24838c1 == null) {
            MessageObject messageObject = this.f24833b1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24838c1.size(); i11++) {
            MessageObject messageObject3 = (MessageObject) this.f24838c1.get(i11);
            if (messageObject3 != null && (charSequence = messageObject3.caption) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i10++;
                }
                messageObject2 = messageObject3;
            }
        }
        if (i10 > 1) {
            return null;
        }
        return messageObject2;
    }

    private int getCollapsedHeight() {
        int i10;
        int i11;
        boolean z10 = this.f24893n2;
        if (!z10 && !SharedConfig.useThreeLinesLayout) {
            i10 = this.F;
        } else {
            i10 = this.G;
        }
        int dp = AndroidUtilities.dp(i10) + 1;
        if (this.M) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (L() && ((!z10 && !SharedConfig.useThreeLinesLayout) || Q())) {
            if (Q()) {
                i11 = this.I;
            } else {
                i11 = this.H;
            }
            return AndroidUtilities.dp(i11) + dp;
        }
        return dp;
    }

    private Paint getPaintReorderGradient() {
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.B4);
        if (this.I4 != v02 || this.J4 == null) {
            this.I4 = v02;
            if (this.J4 == null) {
                this.J4 = new Paint(1);
            }
            this.J4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.J4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.C3) {
            if (M()) {
                return org.telegram.ui.ActionBar.g6.J0;
            }
            return org.telegram.ui.ActionBar.g6.K0;
        }
        return org.telegram.ui.ActionBar.g6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.J;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f22444id;
    }

    public final void A(int i10, int i11) {
        this.f24910q4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f24922s4 = ofFloat;
        ofFloat.setDuration(220L);
        this.f24922s4.setInterpolator(jr.f29800f);
        this.f24900o4 = i10;
        this.f24895n4 = i11;
        this.f24922s4.addUpdateListener(new f2(this, 2));
        this.f24922s4.addListener(new j2(this, 2));
        this.f24916r4 = true;
        this.f24922s4.start();
    }

    public final boolean B(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.B(android.graphics.Canvas):boolean");
    }

    public final void C(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f9) {
        int i10 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i10 != 0 || z13) {
            float f10 = (f9 * 0.5f) + 0.5f;
            if (z10) {
                a0.o(this.R2, this.S2, org.telegram.ui.ActionBar.g6.X0);
                int i11 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.g6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.g6.X0.setAlpha((int) (f9 * 255.0f));
                }
                org.telegram.ui.ActionBar.g6.X0.draw(canvas);
                if (i11 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.g6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z12) {
                if (z11) {
                    a0.o(this.T2, this.S2, org.telegram.ui.ActionBar.g6.W0);
                    if (z13) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.g6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.g6.W0.setAlpha((int) (f9 * 255.0f));
                    }
                    if (!z13 && i10 != 0) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.g6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                        int i12 = (int) (255.0f * f9);
                        org.telegram.ui.ActionBar.g6.W0.setAlpha(i12);
                        org.telegram.ui.ActionBar.g6.V0.setAlpha(i12);
                    }
                    org.telegram.ui.ActionBar.g6.W0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f9) * AndroidUtilities.dp(4.0f), 0.0f);
                    }
                    a0.o(this.P2, this.S2, org.telegram.ui.ActionBar.g6.V0);
                    org.telegram.ui.ActionBar.g6.V0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.g6.W0.setAlpha(255);
                    }
                    if (!z13 && i10 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.g6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.g6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.o(this.Q2, this.S2, org.telegram.ui.ActionBar.g6.T0);
                int i13 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
                if (i13 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.g6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.g6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.g6.T0.setAlpha((int) (f9 * 255.0f));
                }
                org.telegram.ui.ActionBar.g6.T0.draw(canvas);
                if (i13 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.g6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void D(Canvas canvas, boolean z10, int i10, int i11, int i12, float f9, boolean z11) {
        boolean z12;
        float f10;
        float f11;
        Paint paint;
        boolean z13;
        RectF rectF;
        float f12;
        float interpolation;
        int i13;
        int dp;
        int i14;
        RectF rectF2;
        int i15;
        int w02;
        if (!Q() && !P()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ((this.C3 && this.D3) || this.N3 != 1.0f) {
            if (this.O0 == 0 && !this.P0) {
                f10 = 1.0f - this.N3;
            } else {
                f10 = this.N3;
            }
            int i16 = 255;
            if (z11) {
                if (this.P == null) {
                    Paint paint2 = new Paint();
                    this.P = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.P.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.P.setStrokeJoin(Paint.Join.ROUND);
                    this.P.setStrokeCap(Paint.Cap.ROUND);
                }
                f11 = 1.0f;
                this.P.setColor(i0.a.d(Color.alpha(w02) / 255.0f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23330s9, false), 255)));
            } else {
                f11 = 1.0f;
            }
            if (this.L && this.J.read_inbox_max_id == 0) {
                if (this.O == null) {
                    this.O = new Paint();
                }
                paint = this.O;
                if (z10) {
                    i15 = org.telegram.ui.ActionBar.g6.ek;
                } else {
                    i15 = org.telegram.ui.ActionBar.g6.dk;
                }
                int v02 = org.telegram.ui.ActionBar.g6.v0(i15, this.B4);
                paint.setColor(v02);
                org.telegram.ui.ActionBar.g6.M0.setColor(v02);
                if (z10) {
                    i16 = 30;
                } else {
                    i16 = 40;
                }
                z13 = true;
            } else {
                if (!z10 && this.F0 == 0) {
                    paint = org.telegram.ui.ActionBar.g6.f23395w0;
                } else {
                    paint = org.telegram.ui.ActionBar.g6.f23427y0;
                }
                z13 = false;
            }
            StaticLayout staticLayout = this.Q3;
            RectF rectF3 = this.f24876j4;
            if (staticLayout != null && this.O0 != 0) {
                paint.setAlpha((int) ((f11 - this.f24926t3) * i16));
                org.telegram.ui.ActionBar.g6.M0.setAlpha((int) ((f11 - this.f24926t3) * 255.0f));
                float f13 = f10 * 2.0f;
                if (f13 > f11) {
                    f12 = 1.0f;
                } else {
                    f12 = f13;
                }
                float f14 = f11 - f12;
                float f15 = (i12 * f14) + (i11 * f12);
                float f16 = i10;
                rectF3.set(f15, f16, (this.H3 * f14) + (this.G3 * f12) + f15 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
                if (f10 <= 0.5f) {
                    interpolation = jr.f29801g.getInterpolation(f13);
                } else {
                    interpolation = jr.f29802i.getInterpolation(f11 - ((f10 - 0.5f) * 2.0f));
                }
                float f17 = (interpolation * 0.1f) + f11;
                canvas.save();
                float f18 = f17 * f9;
                canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
                if (z12) {
                    if (this.f24885l4 == null || (rectF2 = this.f24889m4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f24889m4;
                        if (rectF4 == null) {
                            this.f24889m4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f24885l4 == null) {
                            this.f24885l4 = new Path();
                        }
                        i7.d6.a(this.f24885l4, this.f24889m4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f24885l4, paint);
                    if (z11) {
                        canvas.drawPath(this.f24885l4, this.P);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.P);
                    }
                }
                if (this.R3 != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(6.333f) + f15, AndroidUtilities.dpf2(3.0f) + f16);
                    this.R3.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.g6.M0.getAlpha();
                float f19 = alpha;
                org.telegram.ui.ActionBar.g6.M0.setAlpha((int) (f19 * f12));
                if (this.S3 != null) {
                    canvas.save();
                    float dpf2 = AndroidUtilities.dpf2(6.333f) + f15;
                    if (this.J3) {
                        i14 = AndroidUtilities.dp(17.0f);
                    } else {
                        i14 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf2, AndroidUtilities.dpf2(3.0f) + (i14 * f14) + f16);
                    this.S3.draw(canvas);
                    canvas.restore();
                } else if (this.P3 != null) {
                    canvas.save();
                    float dpf22 = AndroidUtilities.dpf2(6.333f) + f15;
                    if (this.J3) {
                        i13 = AndroidUtilities.dp(17.0f);
                    } else {
                        i13 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf22, AndroidUtilities.dpf2(3.0f) + (i13 * f14) + f16);
                    this.P3.draw(canvas);
                    canvas.restore();
                }
                if (this.Q3 != null) {
                    org.telegram.ui.ActionBar.g6.M0.setAlpha((int) (f19 * f14));
                    canvas.save();
                    float dpf23 = AndroidUtilities.dpf2(6.333f) + f15;
                    if (this.J3) {
                        dp = -AndroidUtilities.dp(17.0f);
                    } else {
                        dp = AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf23, AndroidUtilities.dpf2(3.0f) + (dp * f12) + f16);
                    this.Q3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.g6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.O0 != 0) {
                    staticLayout = this.P3;
                }
                paint.setAlpha((int) ((f11 - this.f24926t3) * i16));
                org.telegram.ui.ActionBar.g6.M0.setAlpha((int) ((f11 - this.f24926t3) * 255.0f));
                float f20 = i10;
                rectF3.set(i11, f20, AndroidUtilities.dp(12.666f) + this.G3 + i11, AndroidUtilities.dp(20.666f) + i10);
                int save = canvas.save();
                if (f9 != f11) {
                    canvas.scale(f9, f9, rectF3.centerX(), rectF3.centerY());
                }
                if (f10 != f11) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (z12) {
                    if (this.f24885l4 == null || (rectF = this.f24889m4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f24889m4;
                        if (rectF5 == null) {
                            this.f24889m4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f24885l4 == null) {
                            this.f24885l4 = new Path();
                        }
                        i7.d6.a(this.f24885l4, this.f24889m4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f24885l4, paint);
                    if (z11) {
                        canvas.drawPath(this.f24885l4, this.P);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.P);
                    }
                }
                if (staticLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(6.333f) + i11, AndroidUtilities.dpf2(3.0f) + f20);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restoreToCount(save);
            }
            if (z13) {
                org.telegram.ui.ActionBar.g6.M0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.W8, false));
            }
        }
    }

    public boolean E() {
        return false;
    }

    public final CharSequence F() {
        TLRPC.User user;
        String escape;
        int i10 = this.B0;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.F0);
        this.I0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = dialogs.get(i11);
            if (!messagesController.isHiddenByUndo(dialog.f22396id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f22396id)) {
                    TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(messagesController, dialog.f22396id);
                    if (p10 != null) {
                        user = messagesController.getUser(Long.valueOf(p10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f22396id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f22396id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f22396id));
                    user = null;
                }
                if (chat != null) {
                    escape = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else if (UserObject.isDeleted(user)) {
                    escape = LocaleController.getString(R.string.HiddenName);
                } else {
                    escape = AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = escape.length() + length;
                spannableStringBuilder.append((CharSequence) escape);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, this.B4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        if (MessagesController.getInstance(i10).storiesController.C(true) > 0) {
            int max = Math.max(1, MessagesController.getInstance(i10).storiesController.C(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Stories", max, new Object[0]));
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
    }

    public final CharSequence G() {
        TLRPC.User user;
        String escape;
        MessagesController messagesController = MessagesController.getInstance(this.B0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.D0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.f22396id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f22396id)) {
                    TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(messagesController, dialog.f22396id);
                    if (p10 != null) {
                        user = messagesController.getUser(Long.valueOf(p10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f22396id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f22396id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f22396id));
                    user = null;
                }
                if (chat != null) {
                    escape = chat.title.replace('\n', ' ');
                } else if (user == null) {
                    continue;
                } else if (UserObject.isDeleted(user)) {
                    escape = LocaleController.getString(R.string.HiddenName);
                } else {
                    escape = AndroidUtilities.escape(ContactsController.formatName(user.first_name, user.last_name).replace('\n', ' '));
                }
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                int length = spannableStringBuilder.length();
                int length2 = escape.length() + length;
                spannableStringBuilder.append((CharSequence) escape);
                if (dialog.unread_count > 0) {
                    spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Y8, this.B4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt(), false);
    }

    public final CharSequence I() {
        if (this.F4 == null) {
            this.F4 = new o2(this);
        }
        o2.a(this.F4, this.B0, this.f24833b1, this.f24839c2);
        this.F4.getClass();
        o2 o2Var = this.F4;
        this.E4 = o2Var.f24794c;
        this.f24832b0 = o2Var.d;
        return o2Var.f24797g;
    }

    public final ColorFilter J(int i10, int i11) {
        if (this.P4 == null) {
            this.Q4 = new int[4];
            this.P4 = new ColorFilter[4];
        }
        if (i11 != this.Q4[i10] || this.P4[i10] == null) {
            ColorFilter[] colorFilterArr = this.P4;
            this.Q4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.P4[i10];
    }

    public final SpannableStringBuilder K(int i10, CharSequence charSequence, String str, boolean z10) {
        CharSequence charSequence2;
        CharSequence replaceNewLines;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String formatPluralString;
        int size2;
        String string;
        boolean z11;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.f24833b1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (messageObject != null) {
            charSequence2 = messageObject.messageText;
        } else {
            charSequence2 = null;
        }
        this.f24828a0 = true;
        if (!TextUtils.isEmpty(str)) {
            return H(str, charSequence, i10);
        }
        MessageObject messageObject2 = this.f24833b1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        int i11 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.L)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = H(charSequence5, charSequence, i10);
                if (this.f24833b1.topicIconDrawable[0] instanceof yf.b) {
                    int i12 = this.B0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i12).getTopicsController().findTopic(-this.f24833b1.getDialogId(), MessageObject.getTopicId(i12, this.f24833b1.messageOwner, true));
                    if (findTopic != null) {
                        ((yf.b) this.f24833b1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.f24828a0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                s(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.caption) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.R) {
                str2 = "";
            } else if (captionMessage.isVideo()) {
                str2 = "📹 ";
            } else if (captionMessage.isVoice()) {
                str2 = "🎤 ";
            } else if (captionMessage.isMusic()) {
                str2 = "🎧 ";
            } else if (captionMessage.isPhoto()) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.hasHighlightedWords() && !TextUtils.isEmpty(captionMessage.messageOwner.message)) {
                CharSequence charSequence7 = captionMessage.messageTrimmedToHighlight;
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.E + 47);
                if (this.S) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.T.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.T.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.T, 130);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.spoilLoginCode();
            MediaDataController.addTextStyleRuns(captionMessage.messageOwner.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.messageOwner;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.T;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, fontMetricsInt);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z10) {
                append = s(append);
            }
            return H(append, charSequence, i10);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.c6 c6Var = this.B4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z11 = MessageObject.isBlueBlock(this.f24833b1.messageOwner.rich_message.blocks.get(0));
                } else {
                    z11 = false;
                }
                SpannableStringBuilder H = H(this.f24833b1.messageText, charSequence, i10);
                if (z11 && !Q()) {
                    try {
                        a10 a10Var = new a10(org.telegram.ui.ActionBar.g6.f23281p9, c6Var);
                        if (this.S) {
                            i11 = charSequence.length() + 2;
                        }
                        H.setSpan(a10Var, i11, H.length(), 33);
                        return H;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                return H;
            } else if (message2.media != null && !messageObject2.isMediaEmpty()) {
                this.T = org.telegram.ui.ActionBar.g6.H0[this.A0];
                int i13 = org.telegram.ui.ActionBar.g6.f23263o9;
                MessageObject messageObject3 = this.f24833b1;
                TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt());
                        charSequence3 = xg.a.a(R.drawable.dialog_media_poll_20, spannableString2, true);
                    } else {
                        charSequence3 = xg.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.g6.F0[this.A0].getFontMetricsInt());
                        charSequence3 = xg.a.a(R.drawable.dialog_media_checklist_20, spannableString3, true);
                    } else {
                        charSequence3 = xg.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = xg.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (messageObject3.type == 14) {
                    charSequence3 = th.j("🎧 \u2068", messageObject3.getMusicAuthor(), " - ", this.f24833b1.getMusicTitle(), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.O1) {
                        if (size3 > 1) {
                            string = LocaleController.formatPluralString("Media", size3, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.AttachVideo);
                        }
                    } else if (size3 > 1) {
                        string = LocaleController.formatPluralString("Photos", size3, new Object[0]);
                    } else {
                        string = LocaleController.getString(R.string.AttachPhoto);
                    }
                    charSequence3 = jh.ia.Q0(LocaleController.formatString(R.string.AttachPaidMedia, string));
                    i13 = org.telegram.ui.ActionBar.g6.f23281p9;
                } else if (this.N1 > 1) {
                    if (this.O1) {
                        ArrayList arrayList2 = this.f24838c1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Media", size2, new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f24838c1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Photos", size, new Object[0]);
                    }
                    charSequence3 = formatPluralString;
                    i13 = org.telegram.ui.ActionBar.g6.f23281p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i13 = org.telegram.ui.ActionBar.g6.f23281p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z10) {
                    charSequence3 = s(charSequence3);
                }
                SpannableStringBuilder H2 = H(charSequence3, charSequence, i10);
                if (!Q()) {
                    try {
                        a10 a10Var2 = new a10(i13, c6Var);
                        if (this.S) {
                            i11 = charSequence.length() + 2;
                        }
                        H2.setSpan(a10Var2, i11, H2.length(), 33);
                        return H2;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                return H2;
            } else {
                MessageObject messageObject4 = this.f24833b1;
                String str3 = messageObject4.messageOwner.message;
                if (str3 != null) {
                    if (messageObject4.hasHighlightedWords()) {
                        CharSequence charSequence9 = this.f24833b1.messageTrimmedToHighlight;
                        replaceNewLines = str3;
                        if (charSequence9 != null) {
                            replaceNewLines = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.E + 33);
                        if (this.S) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.T.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.T.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.f24833b1.highlightedWords.get(0), measuredWidth2, this.T, 130);
                        }
                    } else {
                        int length2 = str3.length();
                        CharSequence charSequence10 = str3;
                        if (length2 > 150) {
                            charSequence10 = str3.subSequence(0, 150);
                        }
                        replaceNewLines = AndroidUtilities.replaceNewLines(charSequence10);
                    }
                    ?? spannableString4 = new SpannableString(replaceNewLines);
                    MessageObject messageObject5 = this.f24833b1;
                    if (messageObject5 != null) {
                        messageObject5.spoilLoginCode();
                    }
                    MediaDataController.addTextStyleRuns(this.f24833b1, (Spannable) spannableString4, 264);
                    MessageObject messageObject6 = this.f24833b1;
                    if (messageObject6 != null && (message = messageObject6.messageOwner) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.T;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        MediaDataController.addAnimatedEmojiSpans(arrayList4, spannableString4, fontMetricsInt);
                    }
                    if (z10) {
                        spannableString4 = s(spannableString4);
                    }
                    return H(spannableString4, charSequence, i10);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean L() {
        cs csVar = this.f24901p0;
        if (csVar != null && !csVar.f27563c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if (ChatObject.isCommunity(this.f24839c2)) {
            return !this.f24829a1;
        }
        if (this.L) {
            return this.W0;
        }
        TLRPC.Chat chat = this.f24839c2;
        if (chat != null && chat.forum && this.J == null) {
            if (!this.Z0) {
                return true;
            }
            return false;
        }
        return this.V0;
    }

    public final boolean O() {
        if (this.F0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if (this.F0 != 0) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        TLRPC.Chat chat;
        if (!O() && !this.L0 && (chat = this.f24839c2) != null) {
            if ((chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.B0, this.f24839c2))) && !this.L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean R() {
        TLRPC.User user;
        if (!Q() && !this.f24906q0.f15684w && (user = this.f24834b2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i10 = this.B0;
            if (userStatus == null || userStatus.expires > 0 || !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.f24834b2.f22539id))) {
                TLRPC.UserStatus userStatus2 = this.f24834b2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean S(float f9) {
        if (!LocaleController.isRTL) {
            if (f9 >= 0.0f && f9 < AndroidUtilities.dp(60.0f)) {
                return true;
            }
            return false;
        } else if (f9 >= getMeasuredWidth() - AndroidUtilities.dp(60.0f) && f9 < getMeasuredWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public final void T(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.f24931u3 == z10) {
            if (!getIsPinned()) {
                this.f24931u3 = false;
                return;
            }
            return;
        }
        this.f24931u3 = z10;
        float f9 = 1.0f;
        if (z11) {
            if (z10) {
                f9 = 0.0f;
            }
            this.f24926t3 = f9;
        } else {
            if (!z10) {
                f9 = 0.0f;
            }
            this.f24926t3 = f9;
        }
        invalidate();
    }

    public final void U() {
        float f9;
        boolean z10 = SharedConfig.archiveHidden;
        this.f24868i1 = z10;
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        this.f24956z1 = f9;
        this.W1.f27963o = f9;
        this.f24902p1 = 0.0f;
        this.f24924t1 = false;
        this.f24926t3 = (getIsPinned() && this.f24931u3) ? 0.0f : 0.0f;
        this.f24921s3 = true;
        this.f24878k1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.n5 n5Var = this.f24856f4;
        if (n5Var != null && this.f24921s3) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24861g4;
        if (n5Var2 != null && this.f24921s3) {
            n5Var2.a();
        }
    }

    public final void V(boolean z10, boolean z11) {
        nh.h3 h3Var = this.f24887m2;
        if (h3Var == null && !z10) {
            return;
        }
        if (h3Var == null) {
            nh.h3 h3Var2 = new nh.h3(this, getContext(), this.B4, 1);
            this.f24887m2 = h3Var2;
            h3Var2.b(-1, org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.f23190k7);
            this.f24887m2.setDrawUnchecked(false);
            this.f24887m2.setDrawBackgroundAsArc(3);
            addView(this.f24887m2);
        }
        this.f24887m2.a(z10, z11);
        x();
    }

    public final void W(long j10, MessageObject messageObject, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        if (this.D0 != j10) {
            this.f24905p4 = -1;
        }
        this.D0 = j10;
        this.f24927t4 = System.currentTimeMillis();
        this.f24833b1 = messageObject;
        this.f24908q2 = z10;
        this.J0 = false;
        this.N0 = i10;
        if (messageObject != null) {
            int i12 = messageObject.messageOwner.edit_date;
        }
        this.O0 = 0;
        this.P0 = false;
        if (messageObject != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        this.f24863h1 = i11;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        if (messageObject != null && messageObject.isUnread()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.T0 = z12;
        MessageObject messageObject2 = this.f24833b1;
        if (messageObject2 != null) {
            this.U0 = messageObject2.messageOwner.send_state;
        }
        b0(0, z11);
    }

    public final void X(TLRPC.Dialog dialog, int i10, int i11) {
        boolean z10;
        if (this.D0 != dialog.f22396id) {
            ValueAnimator valueAnimator = this.f24922s4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f24922s4.cancel();
            }
            this.f24916r4 = false;
            this.f24905p4 = -1;
        }
        this.D0 = dialog.f22396id;
        this.f24927t4 = System.currentTimeMillis();
        boolean z11 = true;
        this.J0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.G0 = dialog.community_id;
        } else {
            this.G0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.F0 = ((TLRPC.TL_dialogFolder) dialog).folder.f22443id;
            ei0 ei0Var = this.a2;
            if (ei0Var != null) {
                ei0Var.H = this;
                ei0Var.i();
            }
        } else {
            this.F0 = 0;
        }
        this.f24853f1 = i10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Runnable runnable = this.R4;
        if (runnable == null) {
            z11 = false;
        }
        if (z10 != z11) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.R4 = null;
            } else if (z10) {
                this.R4 = NotificationCenter.getInstance(this.B0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new h2(this, 0));
            }
        }
        if (this.f24901p0 == null) {
            this.f24901p0 = new cs(this);
        }
        this.f24858g1 = i11;
        this.f24863h1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        w();
        v();
        u();
        x();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j10, MessageObject messageObject, boolean z10, boolean z11) {
        boolean z12;
        ei0 ei0Var;
        this.J = tL_forumTopic;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.L = z12;
        if (this.D0 != j10) {
            this.f24905p4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof yf.b) {
            ((yf.b) drawable).b(tL_forumTopic.icon_color);
        }
        this.D0 = j10;
        this.f24927t4 = System.currentTimeMillis();
        this.f24833b1 = messageObject;
        this.J0 = false;
        this.f24837c0 = z10;
        this.N0 = messageObject.messageOwner.date;
        this.P0 = false;
        this.f24863h1 = messageObject.getId();
        this.T0 = messageObject.isUnread();
        MessageObject messageObject2 = this.f24833b1;
        if (messageObject2 != null) {
            this.U0 = messageObject2.messageOwner.send_state;
        }
        if (!z11) {
            this.f24905p4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f24838c1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.J;
        if (tL_forumTopic2 != null && tL_forumTopic2.f22444id == 1 && (ei0Var = this.a2) != null) {
            ei0Var.H = this;
            ei0Var.i();
        }
        b0(0, z11);
    }

    public final void Z(MessageObject messageObject, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        String str;
        float f9;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        TLObject tLObject = messageObject.photoThumbsObject;
        if (messageObject.isStoryMedia()) {
            TL_stories.StoryItem storyItem = messageObject.messageOwner.media.storyItem;
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
        TLRPC.PhotoSize strippedPhotoSize = FileLoader.getStrippedPhotoSize(arrayList);
        if (strippedPhotoSize == null) {
            strippedPhotoSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 40);
        }
        TLRPC.PhotoSize photoSize = null;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize(), false, null, true);
        if (strippedPhotoSize != closestPhotoSizeWithSize) {
            photoSize = closestPhotoSizeWithSize;
        }
        if (photoSize == null || !DownloadController.getInstance(this.B0).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            if (!this.O1 && !messageObject.isVideo() && !messageObject.isRoundVideo()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.O1 = z10;
            int i12 = this.N1;
            if (i12 < 3) {
                this.N1 = i12 + 1;
                if ((messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.S1[i10] = z11;
                this.T1[i10] = messageObject.hasMediaSpoilers();
                if (messageObject.type == 1 && photoSize != null) {
                    i11 = photoSize.size;
                } else {
                    i11 = 0;
                }
                if (messageObject.hasMediaSpoilers()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.R1;
                String str2 = str;
                imageReceiverArr[i10].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i11, null, messageObject, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i10];
                if (messageObject.isRoundVideo()) {
                    f9 = 18.0f;
                } else {
                    f9 = 2.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f9));
                this.R = false;
            }
        }
    }

    public final void a0() {
        ei0 ei0Var = this.a2;
        if (ei0Var != null) {
            if (this.L) {
                ei0Var.K = AndroidUtilities.dp(24.0f);
                this.a2.L = AndroidUtilities.dp(24.0f);
                this.a2.M = 0.0f;
            } else {
                i2 i2Var = this.f24906q0;
                RectF rectF = i2Var.F;
                RectF rectF2 = i2Var.F;
                ei0Var.K = rectF.centerY();
                this.a2.L = rectF2.centerX();
                this.a2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.B0).getStoriesController().h.isEmpty()) {
                    this.a2.M -= AndroidUtilities.dpf2(3.5f);
                }
                ei0 ei0Var2 = this.a2;
                this.U1.getBitmapWidth();
                ei0Var2.getClass();
            }
            ei0 ei0Var3 = this.a2;
            if (!ei0Var3.E && ei0Var3.I != null) {
                AnimatorSet animatorSet = ei0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    ei0Var3.B.cancel();
                }
                ei0Var3.E = true;
                ei0Var3.F = true;
                ei0Var3.D = 0.0f;
                ei0Var3.I.getTranslationY();
                AndroidUtilities.dp(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ci0(ei0Var3, 5));
                ofFloat.setInterpolator(jr.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ci0(ei0Var3, 6));
                jr jrVar = jr.f29803j;
                ofFloat2.setInterpolator(jrVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new ci0(ei0Var3, 7));
                ofFloat3.setInterpolator(jrVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ei0Var3.B = animatorSet2;
                animatorSet2.addListener(new zz(ei0Var3, 13));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                ei0Var3.B.playTogether(ofFloat, animatorSet3);
                ei0Var3.B.start();
            }
        }
    }

    public final boolean b0(int r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.b0(int, boolean):boolean");
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.c0():void");
    }

    public final void d0(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.R4 != null && this.f24834b2 != null) {
            requirementToContact = MessagesController.getInstance(this.B0).isUserContactBlocked(this.f24834b2.f22539id);
        } else {
            requirementToContact = null;
        }
        if (this.f24874j2 == DialogObject.isPremiumBlocked(requirementToContact) && this.f24883l2 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.f24874j2 = DialogObject.isPremiumBlocked(requirementToContact);
        this.f24883l2 = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f24869i2.f(this.f24874j2, true);
            if (this.f24883l2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f24879k2.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.L && !this.B && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f24906q0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0() {
        StaticLayout staticLayout;
        int i10;
        if (this.N1 > 0) {
            if (Q()) {
                staticLayout = this.f24844d3;
            } else {
                staticLayout = this.f24830a3;
            }
            if (Q()) {
                i10 = this.Y2;
            } else {
                i10 = this.X2;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        n2[] n2VarArr = (n2[]) ((Spanned) text).getSpans(0, text.length(), n2.class);
                        boolean[] zArr = this.Q1;
                        if (n2VarArr != null && n2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(n2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f24923t0 && !this.f24928u0) {
                                ceil += AndroidUtilities.dp(3.0f);
                            }
                            for (int i11 = 0; i11 < this.N1; i11++) {
                                this.R1[i11].setImageX(i10 + ceil + AndroidUtilities.dp((this.D4 + 2) * i11));
                                zArr[i11] = true;
                            }
                            return;
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            zArr[i12] = false;
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public float getClipProgress() {
        return this.f24902p1;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentDialogFolderId() {
        return this.F0;
    }

    public long getDialogId() {
        return this.D0;
    }

    public boolean getHasUnread() {
        if (this.O0 == 0 && !this.P0) {
            return false;
        }
        return true;
    }

    public boolean getIsMuted() {
        return this.V0;
    }

    public boolean getIsPinned() {
        if (!this.f24942w3 && !this.f24948x3) {
            return false;
        }
        return true;
    }

    public MessageObject getMessage() {
        return this.f24833b1;
    }

    public int getMessageId() {
        return this.f24863h1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f24883l2;
    }

    @Override
    public float getTranslationX() {
        return this.f24919s1;
    }

    @Override
    public final void invalidate() {
        if (lh.i9.f15735t1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f24929u1 && drawable != org.telegram.ui.ActionBar.g6.f23360u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
        U();
        this.f24870i3 = org.telegram.ui.Components.y5.update(0, this, this.f24870i3, this.f24830a3);
        this.f24875j3 = org.telegram.ui.Components.y5.update(0, this, this.f24875j3, this.f24899o3);
        this.f24880k3 = org.telegram.ui.Components.y5.update(0, this, this.f24880k3, this.f24844d3);
        this.f24884l3 = org.telegram.ui.Components.y5.update(0, this, this.f24884l3, this.f24935v2);
        org.telegram.ui.Components.n5 n5Var = this.f24856f4;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24861g4;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f9;
        super.onDetachedFromWindow();
        this.f24924t1 = false;
        this.f24940w1 = false;
        this.f24946x1 = 0.0f;
        this.f24921s3 = false;
        if (getIsPinned() && this.f24931u3) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f24926t3 = f9;
        this.U1.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onDetachedFromWindow();
            i10++;
        }
        xi0 xi0Var = this.f24929u1;
        if (xi0Var != null) {
            xi0Var.stop();
            this.f24929u1.Q(0.0f, true);
            this.f24929u1.setCallback(null);
            this.f24929u1 = null;
            this.f24934v1 = false;
        }
        rf.i iVar = this.f24881k4;
        if (iVar != null) {
            iVar.d.remove(Long.valueOf(this.D0));
        }
        org.telegram.ui.Components.n5 n5Var = this.f24856f4;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24861g4;
        if (n5Var2 != null) {
            n5Var2.b();
        }
        org.telegram.ui.Components.y5.release(this, this.f24870i3);
        org.telegram.ui.Components.y5.release(this, this.f24875j3);
        org.telegram.ui.Components.y5.release(this, this.f24880k3);
        org.telegram.ui.Components.y5.release(this, this.f24884l3);
        this.f24906q0.g();
        this.V = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ei0 ei0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (ei0Var = this.a2) != null && SharedConfig.archiveHidden && ei0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.f24937v4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        nh.h3 h3Var = this.f24887m2;
        if (h3Var != null && h3Var.f29211a.f26324q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24846e0 == 0.0f && !this.L && !this.B && this.f24906q0.a(motionEvent, this)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int dp;
        int i16;
        if (this.D0 != 0 || this.C0 != null) {
            cg.h0 h0Var = this.f24850e4;
            if (h0Var != null) {
                h0Var.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            }
            if (this.f24887m2 != null) {
                int i17 = this.E;
                boolean z11 = this.f24893n2;
                if (!z11 && !SharedConfig.useThreeLinesLayout) {
                    i14 = 27;
                } else {
                    i14 = 29;
                }
                int dp2 = AndroidUtilities.dp(i17 - i14);
                if (this.f24857g0) {
                    i16 = AndroidUtilities.dp(8.0f);
                    dp = (getMeasuredHeight() - this.f24887m2.getMeasuredHeight()) >> 1;
                } else {
                    if (LocaleController.isRTL) {
                        dp2 = (i12 - i10) - dp2;
                    }
                    float f9 = this.Q;
                    if (!z11 && !SharedConfig.useThreeLinesLayout) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    int i18 = dp2;
                    dp = AndroidUtilities.dp(f9 + i15);
                    i16 = i18;
                }
                nh.h3 h3Var = this.f24887m2;
                h3Var.layout(i16, dp, h3Var.getMeasuredWidth() + i16, this.f24887m2.getMeasuredHeight() + dp);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.C4 && !this.f24939w0) {
                return;
            }
            this.f24939w0 = false;
            this.C4 = measuredWidth;
            try {
                t();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        cg.h0 h0Var = this.f24850e4;
        if (h0Var != null) {
            h0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        }
        nh.h3 h3Var = this.f24887m2;
        if (h3Var != null) {
            h3Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.L) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.f24893n2;
            if (!z10 && !SharedConfig.useThreeLinesLayout) {
                i12 = this.F;
            } else {
                i12 = this.G;
            }
            if (L() && ((!z10 && !SharedConfig.useThreeLinesLayout) || Q())) {
                if (Q()) {
                    i13 = this.I;
                } else {
                    i13 = this.H;
                }
            } else {
                i13 = 0;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(i12 + i13) + (this.f24898o2 ? 1 : 0));
            this.M = false;
            if (this.L && !L()) {
                t();
                if (this.N) {
                    this.M = true;
                    t();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y());
        this.f24907q1 = 0;
        this.f24913r1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.H0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.F0 == 1) {
            org.telegram.ui.b.j(R.string.ArchivedChats, ". ", sb2);
        } else {
            if (this.f24843d2 != null) {
                org.telegram.ui.b.j(R.string.AccDescrSecretChat, ". ", sb2);
            }
            if (this.L && this.J != null) {
                org.telegram.ui.b.j(R.string.AccDescrTopic, ". ", sb2);
                sb2.append(this.J.title);
                sb2.append(". ");
            } else {
                TLRPC.User user2 = this.f24834b2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb2.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.f24834b2)) {
                        sb2.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.f24834b2.bot) {
                            org.telegram.ui.b.j(R.string.Bot, ". ", sb2);
                        }
                        TLRPC.User user3 = this.f24834b2;
                        if (user3.self) {
                            sb2.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb2.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f24839c2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb2.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb2.append(". ");
                        sb2.append(this.f24839c2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f24836b4) {
            org.telegram.ui.b.j(R.string.AccDescrVerified, ". ", sb2);
        }
        if (this.V0) {
            org.telegram.ui.b.j(R.string.AccDescrNotificationsMuted, ". ", sb2);
        }
        if (R()) {
            org.telegram.ui.b.j(R.string.AccDescrUserOnline, ". ", sb2);
        }
        int i10 = this.O0;
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("NewMessages", i10, new Object[0]));
            sb2.append(". ");
        }
        int i11 = this.Q0;
        if (i11 > 0) {
            sb2.append(LocaleController.formatPluralString("AccDescrMentionCount", i11, new Object[0]));
            sb2.append(". ");
        }
        if (this.R0 > 0) {
            org.telegram.ui.b.j(R.string.AccDescrMentionReaction, ". ", sb2);
        }
        MessageObject messageObject = this.f24833b1;
        if (messageObject != null && this.F0 == 0) {
            int i12 = this.N0;
            if (i12 == 0) {
                i12 = messageObject.messageOwner.date;
            }
            String formatDateAudio = LocaleController.formatDateAudio(i12, true);
            if (this.f24833b1.isOut()) {
                sb2.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
            } else {
                sb2.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
            }
            sb2.append(". ");
            if (this.f24839c2 != null && !this.f24833b1.isOut() && this.f24833b1.isFromUser() && this.f24833b1.messageOwner.action == null && (user = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.f24833b1.messageOwner.from_id.user_id))) != null) {
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append(". ");
            }
            if (this.f24843d2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f24833b1.messageText);
                if (!this.f24833b1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.caption);
                }
                StaticLayout staticLayout = this.f24830a3;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        fy fyVar;
        if (i10 == R.id.acc_action_chat_preview && (fyVar = this.f24937v4) != null) {
            fyVar.H4(this);
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

    public final CharSequence s(CharSequence charSequence) {
        if (this.N1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new n2(AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void setArchivedPullAnimation(ei0 ei0Var) {
        this.a2 = ei0Var;
    }

    public void setBottomClip(int i10) {
        this.f24913r1 = i10;
    }

    public void setClipProgress(float f9) {
        this.f24902p1 = f9;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.D0 = j10;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.E0, str)) {
            this.E0 = str;
            t();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.E0 = str;
    }

    public void setDialog(k2 k2Var) {
        this.C0 = k2Var;
        this.f24863h1 = 0;
        b0(0, true);
        w();
        v();
        u();
        x();
    }

    public void setDialogCellDelegate(l2 l2Var) {
        this.W = l2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.f24871i4 != z10) {
            invalidate();
        }
        this.f24871i4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f24852f0 = z10;
    }

    public void setMoving(boolean z10) {
        this.f24911r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.A1 == z10) {
            return;
        }
        if (this.E1 == null) {
            this.E1 = new zz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.A1 = z10;
        this.B1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.f24948x3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            t();
        }
        invalidate();
    }

    public void setPreloader(rf.i iVar) {
        this.f24881k4 = iVar;
    }

    public void setRightFragmentOpenedProgress(float f9) {
        if (this.f24846e0 != f9) {
            this.f24846e0 = f9;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.f24924t1 = z10;
    }

    public void setTitleOverride(String str) {
        this.H0 = str;
    }

    public void setTopClip(int i10) {
        this.f24907q1 = i10;
    }

    @Override
    public void setTranslationX(float f9) {
        if (f9 == this.f24919s1) {
            return;
        }
        this.f24919s1 = f9;
        xi0 xi0Var = this.f24929u1;
        boolean z10 = true;
        if (xi0Var != null && f9 == 0.0f) {
            xi0Var.Q(0.0f, true);
            this.f24934v1 = false;
            this.f24868i1 = SharedConfig.archiveHidden;
            this.f24946x1 = 0.0f;
            this.f24924t1 = false;
        }
        float f10 = this.f24919s1;
        if (f10 != 0.0f) {
            this.f24924t1 = true;
        } else {
            this.f24951y1 = 0.0f;
            this.f24946x1 = 0.0f;
            this.f24940w1 = false;
        }
        if (this.f24924t1 && !this.f24938w) {
            boolean z11 = this.f24940w1;
            if (Math.abs(f10) < getMeasuredWidth() * 0.45f) {
                z10 = false;
            }
            this.f24940w1 = z10;
            if (z11 != z10 && this.f24868i1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.f24933v0 != z10) {
            this.f24933v0 = z10;
            if (z10) {
                invalidate();
            }
        }
    }

    public void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.p2.t():void");
    }

    public final void u() {
        TLRPC.Message message;
        MessageObject messageObject = this.f24833b1;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.T0) {
                ChatThemeController.getInstance(this.B0).setDialogTheme(this.D0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
    }

    public final void v() {
        boolean z10;
        float f9;
        TLRPC.Chat chat = this.f24839c2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24914r2 = z10;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f24886m1 = f9;
    }

    public final void w() {
        float f9;
        TLRPC.User user;
        if (this.f24834b2 != null && (user = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.f24834b2.f22539id))) != null) {
            this.f24834b2 = user;
        }
        if (R()) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.l1 = f9;
    }

    public final void x() {
        boolean z10;
        float f9;
        nh.h3 h3Var;
        if (this.f24862h0 > 0 && !this.f24914r2 && !R() && (((h3Var = this.f24887m2) == null || !h3Var.f29211a.f26324q) && !this.f24906q0.f15684w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24920s2 = z10;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.f24867i0 = f9;
    }

    public final int y() {
        float f9;
        if (Q() && !this.f24852f0 && !this.f24851f) {
            if (!this.f24893n2 && !SharedConfig.useThreeLinesLayout) {
                f9 = 91.0f;
            } else {
                f9 = 86.0f;
            }
            int dp = AndroidUtilities.dp(f9);
            if (this.f24898o2) {
                dp++;
            }
            if (L()) {
                return AndroidUtilities.dp(this.I) + dp;
            }
            return dp;
        }
        return getCollapsedHeight();
    }

    public p2(fy fyVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = true;
        this.f24944x = true;
        int i11 = 0;
        this.f24949y = false;
        this.D = 11;
        this.E = 72;
        this.F = 70;
        this.G = 76;
        this.H = 3;
        this.I = 11;
        this.Q = 42.0f;
        i2 i2Var = new i2(this);
        this.f24906q0 = i2Var;
        this.f24933v0 = true;
        this.f24950y0 = 0.0f;
        this.Z0 = false;
        this.f24829a1 = false;
        this.B1 = new uc(this);
        this.C1 = new Paint(1);
        this.D1 = new RectF();
        this.H1 = false;
        this.Q1 = new boolean[3];
        this.R1 = new ImageReceiver[3];
        this.S1 = new boolean[3];
        this.T1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U1 = imageReceiver;
        this.W1 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.Z1 = new f2.a0(5);
        jr jrVar = jr.h;
        this.f24869i2 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.f24879k2 = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.f24849e3 = new Stack();
        this.f24855f3 = new ArrayList();
        this.f24860g3 = new Stack();
        this.f24865h3 = new ArrayList();
        this.D3 = true;
        this.K3 = new vd.a(this, jrVar, 320L);
        this.N3 = 1.0f;
        this.O3 = 1.0f;
        this.f24876j4 = new RectF();
        this.f24905p4 = -1;
        this.f24959z4 = -1;
        this.A4 = new m2(this);
        i2Var.I = true;
        this.B4 = c6Var;
        this.f24937v4 = fyVar;
        org.telegram.ui.ActionBar.g6.R(context);
        this.f24949y = false;
        this.A = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i11 < imageReceiverArr.length) {
                imageReceiverArr[i11] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.R1[i11];
                imageReceiver2.ignoreNotifications = true;
                imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
                this.R1[i11].setAllowLoadingOnAttachedOnly(true);
                i11++;
            } else {
                this.f24893n2 = z10;
                this.B0 = i10;
                cg.h0 h0Var = new cg.h0(this, context, 8);
                this.f24850e4 = h0Var;
                addView(h0Var);
                this.f24856f4 = new org.telegram.ui.Components.n5(AndroidUtilities.dp(22.0f), h0Var);
                this.f24861g4 = new org.telegram.ui.Components.n5(AndroidUtilities.dp(17.0f), this);
                this.U1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (lh.i9.f15735t1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override
    public final void e() {
    }
}
