package org.telegram.ui.Cells;

import ai.jc;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.wy;
public class r2 extends a0 implements ai.r9, org.telegram.ui.ActionBar.a6 {
    public boolean A0;
    public boolean A1;
    public boolean A2;
    public boolean A3;
    public StaticLayout A4;
    public boolean B0;
    public float B1;
    public float B2;
    public boolean B3;
    public int B4;
    public float C0;
    public float C1;
    public boolean C2;
    public int C3;
    public int C4;
    public fi.a D0;
    public float D1;
    public boolean D2;
    public int D3;
    public int D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public final o2 E4;
    public boolean F;
    public final int F0;
    public final wc F1;
    public Paint F2;
    public float F3;
    public final org.telegram.ui.ActionBar.f6 F4;
    public e7 G;
    public m2 G0;
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
    public h01 I1;
    public int I2;
    public int I3;
    public int I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public int J3;
    public q2 J4;
    public int K;
    public long K0;
    public ai.y1 K1;
    public int K2;
    public int K3;
    public GradientDrawable K4;
    public final int L;
    public String L0;
    public boolean L1;
    public int L2;
    public int L3;
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
    public boolean N3;
    public Paint N4;
    public boolean O;
    public boolean O0;
    public String O1;
    public int O2;
    public final le.b O3;
    public rg.z0 O4;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public ValueAnimator P3;
    public Drawable P4;
    public boolean Q;
    public boolean Q0;
    public yi0 Q1;
    public boolean Q2;
    public ValueAnimator Q3;
    public int Q4;
    public boolean R;
    public int R0;
    public int R1;
    public boolean R2;
    public float R3;
    public Drawable R4;
    public Paint S;
    public int S0;
    public boolean S1;
    public boolean S2;
    public float S3;
    public Drawable S4;
    public Paint T;
    public boolean T0;
    public Paint T1;
    public int T2;
    public StaticLayout T3;
    public ColorFilter[] T4;
    public float U;
    public int U0;
    public final boolean[] U1;
    public int U2;
    public StaticLayout U3;
    public int[] U4;
    public boolean V;
    public int V0;
    public final ImageReceiver[] V1;
    public int V2;
    public StaticLayout V3;
    public Runnable V4;
    public boolean W;
    public int W0;
    public final boolean[] W1;
    public int W2;
    public StaticLayout W3;
    public boolean X0;
    public final boolean[] X1;
    public int X2;
    public boolean X3;
    public int Y0;
    public final ImageReceiver Y1;
    public int Y2;
    public boolean Y3;
    public boolean Z0;
    public qe0 Z1;
    public int Z2;
    public boolean Z3;
    public TextPaint f20669a0;
    public boolean f20670a1;
    public final org.telegram.ui.Components.f9 a2;
    public int f20671a3;
    public int f20672a4;
    public Paint f20673b0;
    public boolean f20674b1;
    public boolean f20675b2;
    public int f20676b3;
    public int f20677b4;
    public dd f20678c0;
    public float f20679c1;
    public float f20680c2;
    public int f20681c3;
    public int f20682c4;
    public n2 f20683d0;
    public boolean f20684d1;
    public final l2 f20685d2;
    public int f20686d3;
    public int f20687d4;
    public boolean f20688e0;
    public boolean f20689e1;
    public ji0 f20690e2;
    public StaticLayout f20691e3;
    public StaticLayout f20692e4;
    public boolean f20693f;
    public boolean f20694f0;
    public MessageObject f20695f1;
    public TLRPC.User f20696f2;
    public StaticLayout f20697f3;
    public boolean f20698f4;
    public boolean f20699g0;
    public ArrayList f20700g1;
    public TLRPC.Chat f20701g2;
    public int f20702g3;
    public boolean f20703g4;
    public final boolean h;
    public Drawable[] f20704h0;
    public boolean f20705h1;
    public TLRPC.EncryptedChat f20706h2;
    public StaticLayout f20707h3;
    public boolean f20708h4;
    public float f20709i0;
    public CharSequence f20710i1;
    public CharSequence f20711i2;
    public final Stack f20712i3;
    public final ci.eb f20713i4;
    public boolean f20714j0;
    public int f20715j1;
    public int f20716j2;
    public final ArrayList j3;
    public final org.telegram.ui.Components.m5 f20717j4;
    public boolean f20718k0;
    public int f20719k1;
    public boolean f20720k2;
    public final Stack f20721k3;
    public final org.telegram.ui.Components.m5 f20722k4;
    public int f20723l0;
    public int l1;
    public TLRPC.DraftMessage f20724l2;
    public final ArrayList f20725l3;
    public int l4;
    public float m0;
    public boolean f20726m1;
    public final org.telegram.ui.Components.c6 f20727m2;
    public org.telegram.ui.Components.t5 f20728m3;
    public boolean f20729m4;
    public float f20730n;
    public w11 f20731n0;
    public boolean f20732n1;
    public boolean f20733n2;
    public org.telegram.ui.Components.t5 f20734n3;
    public final RectF f20735n4;
    public Paint f20736o0;
    public float f20737o1;
    public final org.telegram.ui.Components.c6 f20738o2;
    public org.telegram.ui.Components.t5 f20739o3;
    public gg.j f20740o4;
    public Paint f20741p0;
    public float f20742p1;
    public long f20743p2;
    public org.telegram.ui.Components.t5 f20744p3;
    public Path f20745p4;
    public boolean f20746q0;
    public float f20747q1;
    public ci.q3 f20748q2;
    public int f20749q3;
    public RectF f20750q4;
    public boolean f20751r;
    public boolean f20752r0;
    public float f20753r1;
    public final boolean f20754r2;
    public int f20755r3;
    public int f20756r4;
    public yi0 f20757s;
    public boolean f20758s0;
    public int f20759s1;
    public boolean f20760s2;
    public StaticLayout f20761s3;
    public int f20762s4;
    public hs f20763t0;
    public float f20764t1;
    public boolean f20765t2;
    public boolean f20766t3;
    public int f20767t4;
    public final j2 f20768u0;
    public int f20769u1;
    public boolean f20770u2;
    public int f20771u3;
    public float f20772u4;
    public int v;
    public Path f20773v0;
    public int f20774v1;
    public boolean f20775v2;
    public int f20776v3;
    public boolean f20777v4;
    public boolean f20778w;
    public vh.h f20779w0;
    public float f20780w1;
    public boolean f20781w2;
    public boolean f20782w3;
    public ValueAnimator f20783w4;
    public boolean f20784x;
    public boolean f20785x0;
    public boolean f20786x1;
    public int f20787x2;
    public float f20788x3;
    public long f20789x4;
    public boolean f20790y;
    public boolean f20791y0;
    public yi0 f20792y1;
    public int f20793y2;
    public boolean y3;
    public int f20794y4;
    public boolean f20795z0;
    public boolean f20796z1;
    public StaticLayout f20797z2;
    public boolean f20798z3;
    public final wy f20799z4;

    public r2(Context context, boolean z10) {
        this(null, context, z10, UserConfig.selectedAccount, null);
    }

    public static SpannableStringBuilder I(CharSequence charSequence, CharSequence charSequence2, int i10) {
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
        if (this.f20700g1 == null) {
            MessageObject messageObject = this.f20695f1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f20700g1.size(); i11++) {
            MessageObject messageObject3 = (MessageObject) this.f20700g1.get(i11);
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
        boolean z10 = this.f20754r2;
        if (!z10 && !SharedConfig.useThreeLinesLayout) {
            i10 = this.J;
        } else {
            i10 = this.K;
        }
        int dp = AndroidUtilities.dp(i10) + 1;
        if (this.Q) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (M() && ((!z10 && !SharedConfig.useThreeLinesLayout) || Q())) {
            if (Q()) {
                i11 = this.M;
            } else {
                i11 = this.L;
            }
            return AndroidUtilities.dp(i11) + dp;
        }
        return dp;
    }

    private Paint getPaintReorderGradient() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, this.F4);
        if (this.M4 != v02 || this.N4 == null) {
            this.M4 = v02;
            if (this.N4 == null) {
                this.N4 = new Paint(1);
            }
            this.N4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.N4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.G3) {
            if (N()) {
                return org.telegram.ui.ActionBar.j6.J0;
            }
            return org.telegram.ui.ActionBar.j6.K0;
        }
        return org.telegram.ui.ActionBar.j6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.N;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f18173id;
    }

    public final boolean A(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.A(android.graphics.Canvas):boolean");
    }

    public final void B(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f7) {
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 != 0 || z13) {
            float f10 = (f7 * 0.5f) + 0.5f;
            if (z10) {
                a0.o(this.V2, this.W2, org.telegram.ui.ActionBar.j6.X0);
                int i11 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.j6.X0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.j6.X0.draw(canvas);
                if (i11 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.j6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z12) {
                if (z11) {
                    a0.o(this.X2, this.W2, org.telegram.ui.ActionBar.j6.W0);
                    if (z13) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.j6.W0.setAlpha((int) (f7 * 255.0f));
                    }
                    if (!z13 && i10 != 0) {
                        canvas.save();
                        canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                        int i12 = (int) (255.0f * f7);
                        org.telegram.ui.ActionBar.j6.W0.setAlpha(i12);
                        org.telegram.ui.ActionBar.j6.V0.setAlpha(i12);
                    }
                    org.telegram.ui.ActionBar.j6.W0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f7) * AndroidUtilities.dp(4.0f), 0.0f);
                    }
                    a0.o(this.T2, this.W2, org.telegram.ui.ActionBar.j6.V0);
                    org.telegram.ui.ActionBar.j6.V0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.j6.W0.setAlpha(255);
                    }
                    if (!z13 && i10 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.j6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.j6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.o(this.U2, this.W2, org.telegram.ui.ActionBar.j6.T0);
                int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                if (i13 != 0) {
                    canvas.save();
                    canvas.scale(f10, f10, org.telegram.ui.ActionBar.j6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.j6.T0.setAlpha((int) (f7 * 255.0f));
                }
                org.telegram.ui.ActionBar.j6.T0.draw(canvas);
                if (i13 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.j6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void E(Canvas canvas, boolean z10, int i10, int i11, int i12, float f7, boolean z11) {
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
        if ((this.G3 && this.H3) || this.R3 != 1.0f) {
            if (this.S0 == 0 && !this.T0) {
                f10 = 1.0f - this.R3;
            } else {
                f10 = this.R3;
            }
            int i16 = 255;
            if (z11) {
                if (this.T == null) {
                    Paint paint2 = new Paint();
                    this.T = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.T.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.T.setStrokeJoin(Paint.Join.ROUND);
                    this.T.setStrokeCap(Paint.Cap.ROUND);
                }
                f11 = 1.0f;
                this.T.setColor(i0.a.d(Color.alpha(w02) / 255.0f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false), i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19140s9, false), 255)));
            } else {
                f11 = 1.0f;
            }
            if (this.P && this.N.read_inbox_max_id == 0) {
                if (this.S == null) {
                    this.S = new Paint();
                }
                paint = this.S;
                if (z10) {
                    i15 = org.telegram.ui.ActionBar.j6.ek;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.dk;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i15, this.F4);
                paint.setColor(v02);
                org.telegram.ui.ActionBar.j6.M0.setColor(v02);
                if (z10) {
                    i16 = 30;
                } else {
                    i16 = 40;
                }
                z13 = true;
            } else {
                if (!z10 && this.J0 == 0) {
                    paint = org.telegram.ui.ActionBar.j6.f19204w0;
                } else {
                    paint = org.telegram.ui.ActionBar.j6.f19239y0;
                }
                z13 = false;
            }
            StaticLayout staticLayout = this.U3;
            RectF rectF3 = this.f20735n4;
            if (staticLayout != null && this.S0 != 0) {
                paint.setAlpha((int) ((f11 - this.f20788x3) * i16));
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((f11 - this.f20788x3) * 255.0f));
                float f13 = f10 * 2.0f;
                if (f13 > f11) {
                    f12 = 1.0f;
                } else {
                    f12 = f13;
                }
                float f14 = f11 - f12;
                float f15 = (i12 * f14) + (i11 * f12);
                float f16 = i10;
                rectF3.set(f15, f16, (this.L3 * f14) + (this.K3 * f12) + f15 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
                if (f10 <= 0.5f) {
                    interpolation = qr.f27381g.getInterpolation(f13);
                } else {
                    interpolation = qr.f27382i.getInterpolation(f11 - ((f10 - 0.5f) * 2.0f));
                }
                float f17 = (interpolation * 0.1f) + f11;
                canvas.save();
                float f18 = f17 * f7;
                canvas.scale(f18, f18, rectF3.centerX(), rectF3.centerY());
                if (z12) {
                    if (this.f20745p4 == null || (rectF2 = this.f20750q4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f20750q4;
                        if (rectF4 == null) {
                            this.f20750q4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f20745p4 == null) {
                            this.f20745p4 = new Path();
                        }
                        w7.j0.a(this.f20745p4, this.f20750q4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f20745p4, paint);
                    if (z11) {
                        canvas.drawPath(this.f20745p4, this.T);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.T);
                    }
                }
                if (this.V3 != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(6.333f) + f15, AndroidUtilities.dpf2(3.0f) + f16);
                    this.V3.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.j6.M0.getAlpha();
                float f19 = alpha;
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) (f19 * f12));
                if (this.W3 != null) {
                    canvas.save();
                    float dpf2 = AndroidUtilities.dpf2(6.333f) + f15;
                    if (this.N3) {
                        i14 = AndroidUtilities.dp(17.0f);
                    } else {
                        i14 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf2, AndroidUtilities.dpf2(3.0f) + (i14 * f14) + f16);
                    this.W3.draw(canvas);
                    canvas.restore();
                } else if (this.T3 != null) {
                    canvas.save();
                    float dpf22 = AndroidUtilities.dpf2(6.333f) + f15;
                    if (this.N3) {
                        i13 = AndroidUtilities.dp(17.0f);
                    } else {
                        i13 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf22, AndroidUtilities.dpf2(3.0f) + (i13 * f14) + f16);
                    this.T3.draw(canvas);
                    canvas.restore();
                }
                if (this.U3 != null) {
                    org.telegram.ui.ActionBar.j6.M0.setAlpha((int) (f19 * f14));
                    canvas.save();
                    float dpf23 = AndroidUtilities.dpf2(6.333f) + f15;
                    if (this.N3) {
                        dp = -AndroidUtilities.dp(17.0f);
                    } else {
                        dp = AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf23, AndroidUtilities.dpf2(3.0f) + (dp * f12) + f16);
                    this.U3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.j6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.S0 != 0) {
                    staticLayout = this.T3;
                }
                paint.setAlpha((int) ((f11 - this.f20788x3) * i16));
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((f11 - this.f20788x3) * 255.0f));
                float f20 = i10;
                rectF3.set(i11, f20, AndroidUtilities.dp(12.666f) + this.K3 + i11, AndroidUtilities.dp(20.666f) + i10);
                int save = canvas.save();
                if (f7 != f11) {
                    canvas.scale(f7, f7, rectF3.centerX(), rectF3.centerY());
                }
                if (f10 != f11) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (z12) {
                    if (this.f20745p4 == null || (rectF = this.f20750q4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f20750q4;
                        if (rectF5 == null) {
                            this.f20750q4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f20745p4 == null) {
                            this.f20745p4 = new Path();
                        }
                        w7.j0.a(this.f20745p4, this.f20750q4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f20745p4, paint);
                    if (z11) {
                        canvas.drawPath(this.f20745p4, this.T);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.T);
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
                org.telegram.ui.ActionBar.j6.M0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.W8, false));
            }
        }
    }

    public boolean F() {
        return false;
    }

    public final CharSequence G() {
        TLRPC.User user;
        String escape;
        int i10 = this.F0;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.J0);
        this.M0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = dialogs.get(i11);
            if (!messagesController.isHiddenByUndo(dialog.f18125id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f18125id)) {
                    TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(messagesController, dialog.f18125id);
                    if (m10 != null) {
                        user = messagesController.getUser(Long.valueOf(m10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f18125id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f18125id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f18125id));
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
                    spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, this.F4)), length, length2, 33);
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
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
    }

    public final CharSequence H() {
        TLRPC.User user;
        String escape;
        MessagesController messagesController = MessagesController.getInstance(this.F0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.H0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.f18125id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f18125id)) {
                    TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(messagesController, dialog.f18125id);
                    if (m10 != null) {
                        user = messagesController.getUser(Long.valueOf(m10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f18125id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f18125id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f18125id));
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
                    spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, this.F4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt(), false);
    }

    public final CharSequence J() {
        if (this.J4 == null) {
            this.J4 = new q2(this);
        }
        q2.a(this.J4, this.F0, this.f20695f1, this.f20701g2);
        this.J4.getClass();
        q2 q2Var = this.J4;
        this.I4 = q2Var.f20615c;
        this.f20694f0 = q2Var.d;
        return q2Var.f20617g;
    }

    public final ColorFilter K(int i10, int i11) {
        if (this.T4 == null) {
            this.U4 = new int[4];
            this.T4 = new ColorFilter[4];
        }
        if (i11 != this.U4[i10] || this.T4[i10] == null) {
            ColorFilter[] colorFilterArr = this.T4;
            this.U4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.T4[i10];
    }

    public final SpannableStringBuilder L(int i10, CharSequence charSequence, String str, boolean z10) {
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
        MessageObject messageObject = this.f20695f1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (messageObject != null) {
            charSequence2 = messageObject.messageText;
        } else {
            charSequence2 = null;
        }
        this.f20688e0 = true;
        if (!TextUtils.isEmpty(str)) {
            return I(str, charSequence, i10);
        }
        MessageObject messageObject2 = this.f20695f1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        int i11 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = I(charSequence5, charSequence, i10);
                if (this.f20695f1.topicIconDrawable[0] instanceof ng.a) {
                    int i12 = this.F0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i12).getTopicsController().findTopic(-this.f20695f1.getDialogId(), MessageObject.getTopicId(i12, this.f20695f1.messageOwner, true));
                    if (findTopic != null) {
                        ((ng.a) this.f20695f1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.f20688e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                s(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.caption) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.V) {
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
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.I + 47);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.f20669a0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.f20669a0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.f20669a0, 130);
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
                TextPaint textPaint = this.f20669a0;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, fontMetricsInt);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z10) {
                append = s(append);
            }
            return I(append, charSequence, i10);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.f6 f6Var = this.F4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z11 = MessageObject.isBlueBlock(this.f20695f1.messageOwner.rich_message.blocks.get(0));
                } else {
                    z11 = false;
                }
                SpannableStringBuilder I = I(this.f20695f1.messageText, charSequence, i10);
                if (z11 && !Q()) {
                    try {
                        e10 e10Var = new e10(org.telegram.ui.ActionBar.j6.f19084p9, f6Var);
                        if (this.W) {
                            i11 = charSequence.length() + 2;
                        }
                        I.setSpan(e10Var, i11, I.length(), 33);
                        return I;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return I;
            } else if (message2.media != null && !messageObject2.isMediaEmpty()) {
                this.f20669a0 = org.telegram.ui.ActionBar.j6.H0[this.E0];
                int i13 = org.telegram.ui.ActionBar.j6.o9;
                MessageObject messageObject3 = this.f20695f1;
                TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt());
                        charSequence3 = mh.a.a(R.drawable.dialog_media_poll_20, spannableString2, true);
                    } else {
                        charSequence3 = mh.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.j6.F0[this.E0].getFontMetricsInt());
                        charSequence3 = mh.a.a(R.drawable.dialog_media_checklist_20, spannableString3, true);
                    } else {
                        charSequence3 = mh.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = mh.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (messageObject3.type == 14) {
                    charSequence3 = p6.j("🎧 \u2068", messageObject3.getMusicAuthor(), " - ", this.f20695f1.getMusicTitle(), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.S1) {
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
                    charSequence3 = yh.y7.Q0(LocaleController.formatString(R.string.AttachPaidMedia, string));
                    i13 = org.telegram.ui.ActionBar.j6.f19084p9;
                } else if (this.R1 > 1) {
                    if (this.S1) {
                        ArrayList arrayList2 = this.f20700g1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Media", size2, new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f20700g1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Photos", size, new Object[0]);
                    }
                    charSequence3 = formatPluralString;
                    i13 = org.telegram.ui.ActionBar.j6.f19084p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i13 = org.telegram.ui.ActionBar.j6.f19084p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z10) {
                    charSequence3 = s(charSequence3);
                }
                SpannableStringBuilder I2 = I(charSequence3, charSequence, i10);
                if (!Q()) {
                    try {
                        e10 e10Var2 = new e10(i13, f6Var);
                        if (this.W) {
                            i11 = charSequence.length() + 2;
                        }
                        I2.setSpan(e10Var2, i11, I2.length(), 33);
                        return I2;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                return I2;
            } else {
                MessageObject messageObject4 = this.f20695f1;
                String str3 = messageObject4.messageOwner.message;
                if (str3 != null) {
                    if (messageObject4.hasHighlightedWords()) {
                        CharSequence charSequence9 = this.f20695f1.messageTrimmedToHighlight;
                        replaceNewLines = str3;
                        if (charSequence9 != null) {
                            replaceNewLines = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.I + 33);
                        if (this.W) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.f20669a0.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.f20669a0.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.f20695f1.highlightedWords.get(0), measuredWidth2, this.f20669a0, 130);
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
                    MessageObject messageObject5 = this.f20695f1;
                    if (messageObject5 != null) {
                        messageObject5.spoilLoginCode();
                    }
                    MediaDataController.addTextStyleRuns(this.f20695f1, (Spannable) spannableString4, 264);
                    MessageObject messageObject6 = this.f20695f1;
                    if (messageObject6 != null && (message = messageObject6.messageOwner) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.f20669a0;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        MediaDataController.addAnimatedEmojiSpans(arrayList4, spannableString4, fontMetricsInt);
                    }
                    if (z10) {
                        spannableString4 = s(spannableString4);
                    }
                    return I(spannableString4, charSequence, i10);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean M() {
        hs hsVar = this.f20763t0;
        if (hsVar != null && !hsVar.f24727c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if (ChatObject.isCommunity(this.f20701g2)) {
            return !this.f20689e1;
        }
        if (this.P) {
            return this.f20670a1;
        }
        TLRPC.Chat chat = this.f20701g2;
        if (chat != null && chat.forum && this.N == null) {
            if (!this.f20684d1) {
                return true;
            }
            return false;
        }
        return this.Z0;
    }

    public final boolean O() {
        if (this.J0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if (this.J0 != 0) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        TLRPC.Chat chat;
        if (!O() && !this.P0 && (chat = this.f20701g2) != null) {
            if ((chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.F0, this.f20701g2))) && !this.P) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean R() {
        TLRPC.User user;
        if (!Q() && !this.f20768u0.f668w && (user = this.f20696f2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i10 = this.F0;
            if (userStatus == null || userStatus.expires > 0 || !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.f20696f2.f18268id))) {
                TLRPC.UserStatus userStatus2 = this.f20696f2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean S(float f7) {
        if (!LocaleController.isRTL) {
            if (f7 >= 0.0f && f7 < AndroidUtilities.dp(60.0f)) {
                return true;
            }
            return false;
        } else if (f7 >= getMeasuredWidth() - AndroidUtilities.dp(60.0f) && f7 < getMeasuredWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public final void T(boolean z10, boolean z11) {
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
            this.f20788x3 = f7;
        } else {
            if (!z10) {
                f7 = 0.0f;
            }
            this.f20788x3 = f7;
        }
        invalidate();
    }

    public final void U() {
        float f7;
        boolean z10 = SharedConfig.archiveHidden;
        this.f20726m1 = z10;
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        this.D1 = f7;
        this.a2.f23835o = f7;
        this.f20764t1 = 0.0f;
        this.f20786x1 = false;
        this.f20788x3 = (getIsPinned() && this.y3) ? 0.0f : 0.0f;
        this.f20782w3 = true;
        this.f20737o1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.m5 m5Var = this.f20717j4;
        if (m5Var != null && this.f20782w3) {
            m5Var.a();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f20722k4;
        if (m5Var2 != null && this.f20782w3) {
            m5Var2.a();
        }
    }

    public final void V(boolean z10, boolean z11) {
        ci.q3 q3Var = this.f20748q2;
        if (q3Var == null && !z10) {
            return;
        }
        if (q3Var == null) {
            ci.q3 q3Var2 = new ci.q3(this, getContext(), this.F4, 1);
            this.f20748q2 = q3Var2;
            q3Var2.b(-1, org.telegram.ui.ActionBar.j6.f18862d6, org.telegram.ui.ActionBar.j6.f18991k7);
            this.f20748q2.setDrawUnchecked(false);
            this.f20748q2.setDrawBackgroundAsArc(3);
            addView(this.f20748q2);
        }
        this.f20748q2.a(z10, z11);
        x();
    }

    public final void W(long j3, MessageObject messageObject, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        if (this.H0 != j3) {
            this.f20767t4 = -1;
        }
        this.H0 = j3;
        this.f20789x4 = System.currentTimeMillis();
        this.f20695f1 = messageObject;
        this.f20770u2 = z10;
        this.N0 = false;
        this.R0 = i10;
        if (messageObject != null) {
            int i12 = messageObject.messageOwner.edit_date;
        }
        this.S0 = 0;
        this.T0 = false;
        if (messageObject != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        this.l1 = i11;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        if (messageObject != null && messageObject.isUnread()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.X0 = z12;
        MessageObject messageObject2 = this.f20695f1;
        if (messageObject2 != null) {
            this.Y0 = messageObject2.messageOwner.send_state;
        }
        b0(0, z11);
    }

    public final void X(TLRPC.Dialog dialog, int i10, int i11) {
        boolean z10;
        if (this.H0 != dialog.f18125id) {
            ValueAnimator valueAnimator = this.f20783w4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f20783w4.cancel();
            }
            this.f20777v4 = false;
            this.f20767t4 = -1;
        }
        this.H0 = dialog.f18125id;
        this.f20789x4 = System.currentTimeMillis();
        boolean z11 = true;
        this.N0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.K0 = dialog.community_id;
        } else {
            this.K0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.J0 = ((TLRPC.TL_dialogFolder) dialog).folder.f18172id;
            ji0 ji0Var = this.f20690e2;
            if (ji0Var != null) {
                ji0Var.H = this;
                ji0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.f20715j1 = i10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Runnable runnable = this.V4;
        if (runnable == null) {
            z11 = false;
        }
        if (z10 != z11) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.V4 = null;
            } else if (z10) {
                this.V4 = NotificationCenter.getInstance(this.F0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new i2(this, 0));
            }
        }
        if (this.f20763t0 == null) {
            this.f20763t0 = new hs(this);
        }
        this.f20719k1 = i11;
        this.l1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        w();
        v();
        u();
        x();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j3, MessageObject messageObject, boolean z10, boolean z11) {
        boolean z12;
        ji0 ji0Var;
        this.N = tL_forumTopic;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.P = z12;
        if (this.H0 != j3) {
            this.f20767t4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof ng.a) {
            ((ng.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j3;
        this.f20789x4 = System.currentTimeMillis();
        this.f20695f1 = messageObject;
        this.N0 = false;
        this.f20699g0 = z10;
        this.R0 = messageObject.messageOwner.date;
        this.T0 = false;
        this.l1 = messageObject.getId();
        this.X0 = messageObject.isUnread();
        MessageObject messageObject2 = this.f20695f1;
        if (messageObject2 != null) {
            this.Y0 = messageObject2.messageOwner.send_state;
        }
        if (!z11) {
            this.f20767t4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f20700g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.f18173id == 1 && (ji0Var = this.f20690e2) != null) {
            ji0Var.H = this;
            ji0Var.i();
        }
        b0(0, z11);
    }

    public final void Z(MessageObject messageObject, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        String str;
        float f7;
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
        if (photoSize == null || !DownloadController.getInstance(this.F0).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            if (!this.S1 && !messageObject.isVideo() && !messageObject.isRoundVideo()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.S1 = z10;
            int i12 = this.R1;
            if (i12 < 3) {
                this.R1 = i12 + 1;
                if ((messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.W1[i10] = z11;
                this.X1[i10] = messageObject.hasMediaSpoilers();
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
                ImageReceiver[] imageReceiverArr = this.V1;
                String str2 = str;
                imageReceiverArr[i10].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i11, null, messageObject, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i10];
                if (messageObject.isRoundVideo()) {
                    f7 = 18.0f;
                } else {
                    f7 = 2.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f7));
                this.V = false;
            }
        }
    }

    public final void a0() {
        ji0 ji0Var = this.f20690e2;
        if (ji0Var != null) {
            if (this.P) {
                ji0Var.K = AndroidUtilities.dp(24.0f);
                this.f20690e2.L = AndroidUtilities.dp(24.0f);
                this.f20690e2.M = 0.0f;
            } else {
                j2 j2Var = this.f20768u0;
                RectF rectF = j2Var.F;
                RectF rectF2 = j2Var.F;
                ji0Var.K = rectF.centerY();
                this.f20690e2.L = rectF2.centerX();
                this.f20690e2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.F0).getStoriesController().h.isEmpty()) {
                    this.f20690e2.M -= AndroidUtilities.dpf2(3.5f);
                }
                ji0 ji0Var2 = this.f20690e2;
                this.Y1.getBitmapWidth();
                ji0Var2.getClass();
            }
            ji0 ji0Var3 = this.f20690e2;
            if (!ji0Var3.E && ji0Var3.I != null) {
                AnimatorSet animatorSet = ji0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    ji0Var3.B.cancel();
                }
                ji0Var3.E = true;
                ji0Var3.F = true;
                ji0Var3.D = 0.0f;
                ji0Var3.I.getTranslationY();
                AndroidUtilities.dp(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hi0(ji0Var3, 5));
                ofFloat.setInterpolator(qr.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new hi0(ji0Var3, 6));
                qr qrVar = qr.f27383j;
                ofFloat2.setInterpolator(qrVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new hi0(ji0Var3, 7));
                ofFloat3.setInterpolator(qrVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ji0Var3.B = animatorSet2;
                animatorSet2.addListener(new jd0(ji0Var3, 5));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                ji0Var3.B.playTogether(ofFloat, animatorSet3);
                ji0Var3.B.start();
            }
        }
    }

    public final boolean b0(int r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.b0(int, boolean):boolean");
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.c0():void");
    }

    public final void d0(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.V4 != null && this.f20696f2 != null) {
            requirementToContact = MessagesController.getInstance(this.F0).isUserContactBlocked(this.f20696f2.f18268id);
        } else {
            requirementToContact = null;
        }
        if (this.f20733n2 == DialogObject.isPremiumBlocked(requirementToContact) && this.f20743p2 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.f20733n2 = DialogObject.isPremiumBlocked(requirementToContact);
        this.f20743p2 = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f20727m2.f(this.f20733n2, true);
            if (this.f20743p2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f20738o2.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.P && !this.F && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f20768u0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0() {
        StaticLayout staticLayout;
        int i10;
        if (this.R1 > 0) {
            if (Q()) {
                staticLayout = this.f20707h3;
            } else {
                staticLayout = this.f20691e3;
            }
            if (Q()) {
                i10 = this.f20681c3;
            } else {
                i10 = this.f20676b3;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        p2[] p2VarArr = (p2[]) ((Spanned) text).getSpans(0, text.length(), p2.class);
                        boolean[] zArr = this.U1;
                        if (p2VarArr != null && p2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(p2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f20785x0 && !this.f20791y0) {
                                ceil += AndroidUtilities.dp(3.0f);
                            }
                            for (int i11 = 0; i11 < this.R1; i11++) {
                                this.V1[i11].setImageX(i10 + ceil + AndroidUtilities.dp((this.H4 + 2) * i11));
                                zArr[i11] = true;
                            }
                            return;
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            zArr[i12] = false;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public float getClipProgress() {
        return this.f20764t1;
    }

    public int[] getColorKeys() {
        return null;
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

    public MessageObject getMessage() {
        return this.f20695f1;
    }

    public int getMessageId() {
        return this.l1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f20743p2;
    }

    @Override
    public float getTranslationX() {
        return this.f20780w1;
    }

    @Override
    public final void invalidate() {
        if (jc.f1064x1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f20792y1 && drawable != org.telegram.ui.ActionBar.j6.f19169u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
        U();
        this.f20728m3 = org.telegram.ui.Components.x5.update(0, this, this.f20728m3, this.f20691e3);
        this.f20734n3 = org.telegram.ui.Components.x5.update(0, this, this.f20734n3, this.f20761s3);
        this.f20739o3 = org.telegram.ui.Components.x5.update(0, this, this.f20739o3, this.f20707h3);
        this.f20744p3 = org.telegram.ui.Components.x5.update(0, this, this.f20744p3, this.f20797z2);
        org.telegram.ui.Components.m5 m5Var = this.f20717j4;
        if (m5Var != null) {
            m5Var.a();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f20722k4;
        if (m5Var2 != null) {
            m5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f7;
        super.onDetachedFromWindow();
        this.f20786x1 = false;
        this.A1 = false;
        this.B1 = 0.0f;
        this.f20782w3 = false;
        if (getIsPinned() && this.y3) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f20788x3 = f7;
        this.Y1.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onDetachedFromWindow();
            i10++;
        }
        yi0 yi0Var = this.f20792y1;
        if (yi0Var != null) {
            yi0Var.stop();
            this.f20792y1.S(0.0f, true);
            this.f20792y1.setCallback(null);
            this.f20792y1 = null;
            this.f20796z1 = false;
        }
        gg.j jVar = this.f20740o4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.m5 m5Var = this.f20717j4;
        if (m5Var != null) {
            m5Var.b();
        }
        org.telegram.ui.Components.m5 m5Var2 = this.f20722k4;
        if (m5Var2 != null) {
            m5Var2.b();
        }
        org.telegram.ui.Components.x5.release(this, this.f20728m3);
        org.telegram.ui.Components.x5.release(this, this.f20734n3);
        org.telegram.ui.Components.x5.release(this, this.f20739o3);
        org.telegram.ui.Components.x5.release(this, this.f20744p3);
        this.f20768u0.g();
        this.f20678c0 = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ji0 ji0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (ji0Var = this.f20690e2) != null && SharedConfig.archiveHidden && ji0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.f20799z4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        ci.q3 q3Var = this.f20748q2;
        if (q3Var != null && q3Var.f26508a.f21982q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20709i0 == 0.0f && !this.P && !this.F && this.f20768u0.a(motionEvent, this)) {
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
        if (this.H0 != 0 || this.G0 != null) {
            ci.eb ebVar = this.f20713i4;
            if (ebVar != null) {
                ebVar.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            }
            if (this.f20748q2 != null) {
                int i17 = this.I;
                boolean z11 = this.f20754r2;
                if (!z11 && !SharedConfig.useThreeLinesLayout) {
                    i14 = 27;
                } else {
                    i14 = 29;
                }
                int dp2 = AndroidUtilities.dp(i17 - i14);
                if (this.f20718k0) {
                    i16 = AndroidUtilities.dp(8.0f);
                    dp = (getMeasuredHeight() - this.f20748q2.getMeasuredHeight()) >> 1;
                } else {
                    if (LocaleController.isRTL) {
                        dp2 = (i12 - i10) - dp2;
                    }
                    float f7 = this.U;
                    if (!z11 && !SharedConfig.useThreeLinesLayout) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    int i18 = dp2;
                    dp = AndroidUtilities.dp(f7 + i15);
                    i16 = i18;
                }
                ci.q3 q3Var = this.f20748q2;
                q3Var.layout(i16, dp, q3Var.getMeasuredWidth() + i16, this.f20748q2.getMeasuredHeight() + dp);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.G4 && !this.A0) {
                return;
            }
            this.A0 = false;
            this.G4 = measuredWidth;
            try {
                t();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ci.eb ebVar = this.f20713i4;
        if (ebVar != null) {
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        }
        ci.q3 q3Var = this.f20748q2;
        if (q3Var != null) {
            q3Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z10 = this.f20754r2;
            if (!z10 && !SharedConfig.useThreeLinesLayout) {
                i12 = this.J;
            } else {
                i12 = this.K;
            }
            if (M() && ((!z10 && !SharedConfig.useThreeLinesLayout) || Q())) {
                if (Q()) {
                    i13 = this.M;
                } else {
                    i13 = this.L;
                }
            } else {
                i13 = 0;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(i12 + i13) + (this.f20760s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !M()) {
                t();
                if (this.R) {
                    this.Q = true;
                    t();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y());
        this.f20769u1 = 0;
        this.f20774v1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.L0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.J0 == 1) {
            wl.l(R.string.ArchivedChats, ". ", sb2);
        } else {
            if (this.f20706h2 != null) {
                wl.l(R.string.AccDescrSecretChat, ". ", sb2);
            }
            if (this.P && this.N != null) {
                wl.l(R.string.AccDescrTopic, ". ", sb2);
                sb2.append(this.N.title);
                sb2.append(". ");
            } else {
                TLRPC.User user2 = this.f20696f2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb2.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.f20696f2)) {
                        sb2.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.f20696f2.bot) {
                            wl.l(R.string.Bot, ". ", sb2);
                        }
                        TLRPC.User user3 = this.f20696f2;
                        if (user3.self) {
                            sb2.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb2.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f20701g2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb2.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb2.append(". ");
                        sb2.append(this.f20701g2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f20698f4) {
            wl.l(R.string.AccDescrVerified, ". ", sb2);
        }
        if (this.Z0) {
            wl.l(R.string.AccDescrNotificationsMuted, ". ", sb2);
        }
        if (R()) {
            wl.l(R.string.AccDescrUserOnline, ". ", sb2);
        }
        int i10 = this.S0;
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("NewMessages", i10, new Object[0]));
            sb2.append(". ");
        }
        int i11 = this.U0;
        if (i11 > 0) {
            sb2.append(LocaleController.formatPluralString("AccDescrMentionCount", i11, new Object[0]));
            sb2.append(". ");
        }
        if (this.V0 > 0) {
            wl.l(R.string.AccDescrMentionReaction, ". ", sb2);
        }
        MessageObject messageObject = this.f20695f1;
        if (messageObject != null && this.J0 == 0) {
            int i12 = this.R0;
            if (i12 == 0) {
                i12 = messageObject.messageOwner.date;
            }
            String formatDateAudio = LocaleController.formatDateAudio(i12, true);
            if (this.f20695f1.isOut()) {
                sb2.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
            } else {
                sb2.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
            }
            sb2.append(". ");
            if (this.f20701g2 != null && !this.f20695f1.isOut() && this.f20695f1.isFromUser() && this.f20695f1.messageOwner.action == null && (user = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f20695f1.messageOwner.from_id.user_id))) != null) {
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append(". ");
            }
            if (this.f20706h2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f20695f1.messageText);
                if (!this.f20695f1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.caption);
                }
                StaticLayout staticLayout = this.f20691e3;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        wy wyVar;
        if (i10 == R.id.acc_action_chat_preview && (wyVar = this.f20799z4) != null) {
            wyVar.H4(this);
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
        if (this.R1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new p2(AndroidUtilities.dp(((this.H4 + 2) * this.R1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void setArchivedPullAnimation(ji0 ji0Var) {
        this.f20690e2 = ji0Var;
    }

    public void setBottomClip(int i10) {
        this.f20774v1 = i10;
    }

    public void setClipProgress(float f7) {
        this.f20764t1 = f7;
        invalidate();
    }

    public void setCurrentDialogId(long j3) {
        this.H0 = j3;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.I0, str)) {
            this.I0 = str;
            t();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(m2 m2Var) {
        this.G0 = m2Var;
        this.l1 = 0;
        b0(0, true);
        w();
        v();
        u();
        x();
    }

    public void setDialogCellDelegate(n2 n2Var) {
        this.f20683d0 = n2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.f20729m4 != z10) {
            invalidate();
        }
        this.f20729m4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f20714j0 = z10;
    }

    public void setMoving(boolean z10) {
        this.f20751r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.E1 == z10) {
            return;
        }
        if (this.I1 == null) {
            this.I1 = new h01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.E1 = z10;
        this.F1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.B3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            t();
        }
        invalidate();
    }

    public void setPreloader(gg.j jVar) {
        this.f20740o4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f7) {
        if (this.f20709i0 != f7) {
            this.f20709i0 = f7;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.f20786x1 = z10;
    }

    public void setTitleOverride(String str) {
        this.L0 = str;
    }

    public void setTopClip(int i10) {
        this.f20769u1 = i10;
    }

    @Override
    public void setTranslationX(float f7) {
        if (f7 == this.f20780w1) {
            return;
        }
        this.f20780w1 = f7;
        yi0 yi0Var = this.f20792y1;
        boolean z10 = true;
        if (yi0Var != null && f7 == 0.0f) {
            yi0Var.S(0.0f, true);
            this.f20796z1 = false;
            this.f20726m1 = SharedConfig.archiveHidden;
            this.B1 = 0.0f;
            this.f20786x1 = false;
        }
        float f10 = this.f20780w1;
        if (f10 != 0.0f) {
            this.f20786x1 = true;
        } else {
            this.C1 = 0.0f;
            this.B1 = 0.0f;
            this.A1 = false;
        }
        if (this.f20786x1 && !this.f20778w) {
            boolean z11 = this.A1;
            if (Math.abs(f10) < getMeasuredWidth() * 0.45f) {
                z10 = false;
            }
            this.A1 = z10;
            if (z11 != z10 && this.f20726m1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.f20795z0 != z10) {
            this.f20795z0 = z10;
            if (z10) {
                invalidate();
            }
        }
    }

    public void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.t():void");
    }

    public final void u() {
        TLRPC.Message message;
        MessageObject messageObject = this.f20695f1;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.X0) {
                ChatThemeController.getInstance(this.F0).setDialogTheme(this.H0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
    }

    public final void v() {
        boolean z10;
        float f7;
        TLRPC.Chat chat = this.f20701g2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20775v2 = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f20747q1 = f7;
    }

    public final void w() {
        float f7;
        TLRPC.User user;
        if (this.f20696f2 != null && (user = MessagesController.getInstance(this.F0).getUser(Long.valueOf(this.f20696f2.f18268id))) != null) {
            this.f20696f2 = user;
        }
        if (R()) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f20742p1 = f7;
    }

    public final void x() {
        boolean z10;
        float f7;
        ci.q3 q3Var;
        if (this.f20723l0 > 0 && !this.f20775v2 && !R() && (((q3Var = this.f20748q2) == null || !q3Var.f26508a.f21982q) && !this.f20768u0.f668w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20781w2 = z10;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.m0 = f7;
    }

    public final int y() {
        float f7;
        if (Q() && !this.f20714j0 && !this.f20693f) {
            if (!this.f20754r2 && !SharedConfig.useThreeLinesLayout) {
                f7 = 91.0f;
            } else {
                f7 = 86.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            if (this.f20760s2) {
                dp++;
            }
            if (M()) {
                return AndroidUtilities.dp(this.M) + dp;
            }
            return dp;
        }
        return getCollapsedHeight();
    }

    public final void z(int i10, int i11) {
        this.f20772u4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f20783w4 = ofFloat;
        ofFloat.setDuration(220L);
        this.f20783w4.setInterpolator(qr.f27380f);
        this.f20762s4 = i10;
        this.f20756r4 = i11;
        this.f20783w4.addUpdateListener(new g2(this, 2));
        this.f20783w4.addListener(new k2(this, 2));
        this.f20777v4 = true;
        this.f20783w4.start();
    }

    public r2(wy wyVar, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f20784x = true;
        int i11 = 0;
        this.f20790y = false;
        this.H = 11;
        this.I = 72;
        this.J = 70;
        this.K = 76;
        this.L = 3;
        this.M = 11;
        this.U = 42.0f;
        j2 j2Var = new j2(this);
        this.f20768u0 = j2Var;
        this.f20795z0 = true;
        this.C0 = 0.0f;
        this.f20684d1 = false;
        this.f20689e1 = false;
        this.F1 = new wc(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.a2 = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        this.f20685d2 = new l2(0);
        qr qrVar = qr.h;
        this.f20727m2 = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
        this.f20738o2 = new org.telegram.ui.Components.c6(this, 0L, 350L, qrVar);
        this.f20712i3 = new Stack();
        this.j3 = new ArrayList();
        this.f20721k3 = new Stack();
        this.f20725l3 = new ArrayList();
        this.H3 = true;
        this.O3 = new le.b(this, qrVar, 320L);
        this.R3 = 1.0f;
        this.S3 = 1.0f;
        this.f20735n4 = new RectF();
        this.f20767t4 = -1;
        this.D4 = -1;
        this.E4 = new o2(this);
        j2Var.I = true;
        this.F4 = f6Var;
        this.f20799z4 = wyVar;
        org.telegram.ui.ActionBar.j6.R(context);
        this.f20790y = false;
        this.E = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i11 < imageReceiverArr.length) {
                imageReceiverArr[i11] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.V1[i11];
                imageReceiver2.ignoreNotifications = true;
                imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
                this.V1[i11].setAllowLoadingOnAttachedOnly(true);
                i11++;
            } else {
                this.f20754r2 = z10;
                this.F0 = i10;
                ci.eb ebVar = new ci.eb(this, context, 11);
                this.f20713i4 = ebVar;
                addView(ebVar);
                this.f20717j4 = new org.telegram.ui.Components.m5(AndroidUtilities.dp(22.0f), ebVar);
                this.f20722k4 = new org.telegram.ui.Components.m5(AndroidUtilities.dp(17.0f), this);
                this.Y1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (jc.f1064x1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override
    public final void e() {
    }
}
