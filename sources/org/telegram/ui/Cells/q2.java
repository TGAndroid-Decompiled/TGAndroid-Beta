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
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ai;
import org.telegram.ui.qy;
public class q2 extends a0 implements nh.z6, org.telegram.ui.ActionBar.a6 {
    public sh.a A0;
    public float A1;
    public boolean A2;
    public int A3;
    public int A4;
    public boolean B;
    public int B0;
    public boolean B1;
    public Paint B2;
    public int B3;
    public final n2 B4;
    public boolean C;
    public final int C0;
    public final rc C1;
    public Paint C2;
    public float C3;
    public final org.telegram.ui.ActionBar.f6 C4;
    public c7 D;
    public l2 D0;
    public final Paint D1;
    public boolean D2;
    public boolean D3;
    public int D4;
    public int E;
    public long E0;
    public final RectF E1;
    public int E2;
    public boolean E3;
    public int E4;
    public int F;
    public String F0;
    public k01 F1;
    public int F2;
    public int F3;
    public int F4;
    public int G;
    public int G0;
    public boolean G1;
    public int G2;
    public int G3;
    public p2 G4;
    public int H;
    public long H0;
    public org.telegram.ui.web.a1 H1;
    public int H2;
    public int H3;
    public GradientDrawable H4;
    public final int I;
    public String I0;
    public boolean I1;
    public int I2;
    public int I3;
    public int I4;
    public final int J;
    public int J0;
    public int J1;
    public int J2;
    public int J3;
    public int J4;
    public TLRPC.TL_forumTopic K;
    public boolean K0;
    public int K1;
    public StaticLayout K2;
    public boolean K3;
    public Paint K4;
    public boolean L;
    public boolean L0;
    public String L1;
    public int L2;
    public final xd.a L3;
    public eg.q1 L4;
    public boolean M;
    public boolean M0;
    public int M1;
    public boolean M2;
    public ValueAnimator M3;
    public Drawable M4;
    public boolean N;
    public boolean N0;
    public gj0 N1;
    public boolean N2;
    public ValueAnimator N3;
    public int N4;
    public boolean O;
    public int O0;
    public int O1;
    public boolean O2;
    public float O3;
    public Drawable O4;
    public Paint P;
    public int P0;
    public boolean P1;
    public boolean P2;
    public float P3;
    public Drawable P4;
    public Paint Q;
    public boolean Q0;
    public Paint Q1;
    public int Q2;
    public StaticLayout Q3;
    public ColorFilter[] Q4;
    public float R;
    public int R0;
    public final boolean[] R1;
    public int R2;
    public StaticLayout R3;
    public int[] R4;
    public boolean S;
    public int S0;
    public final ImageReceiver[] S1;
    public int S2;
    public StaticLayout S3;
    public Runnable S4;
    public boolean T;
    public int T0;
    public final boolean[] T1;
    public int T2;
    public StaticLayout T3;
    public TextPaint U;
    public boolean U0;
    public final boolean[] U1;
    public int U2;
    public boolean U3;
    public Paint V;
    public int V0;
    public final ImageReceiver V1;
    public int V2;
    public boolean V3;
    public xc W;
    public boolean W0;
    public ue0 W1;
    public int W2;
    public boolean W3;
    public boolean X0;
    public final org.telegram.ui.Components.z8 X1;
    public int X2;
    public int X3;
    public boolean Y0;
    public boolean Y1;
    public int Y2;
    public int Y3;
    public float Z0;
    public float Z1;
    public int Z2;
    public int Z3;
    public m2 f21553a0;
    public boolean f21554a1;
    public final f2.a0 a2;
    public int f21555a3;
    public int f21556a4;
    public boolean f21557b0;
    public boolean f21558b1;
    public qi0 f21559b2;
    public StaticLayout f21560b3;
    public StaticLayout f21561b4;
    public boolean f21562c0;
    public MessageObject f21563c1;
    public TLRPC.User f21564c2;
    public StaticLayout c3;
    public boolean f21565c4;
    public boolean f21566d0;
    public ArrayList f21567d1;
    public TLRPC.Chat f21568d2;
    public int f21569d3;
    public boolean f21570d4;
    public Drawable[] f21571e0;
    public boolean f21572e1;
    public TLRPC.EncryptedChat f21573e2;
    public StaticLayout f21574e3;
    public boolean f21575e4;
    public boolean f21576f;
    public float f21577f0;
    public CharSequence f21578f1;
    public CharSequence f21579f2;
    public final Stack f21580f3;
    public final eg.h0 f21581f4;
    public boolean f21582g0;
    public int f21583g1;
    public int f21584g2;
    public final ArrayList f21585g3;
    public final org.telegram.ui.Components.j5 f21586g4;
    public final boolean h;
    public boolean f21587h0;
    public int f21588h1;
    public boolean f21589h2;
    public final Stack f21590h3;
    public final org.telegram.ui.Components.j5 f21591h4;
    public int f21592i0;
    public int f21593i1;
    public TLRPC.DraftMessage f21594i2;
    public final ArrayList f21595i3;
    public int f21596i4;
    public float f21597j0;
    public boolean f21598j1;
    public final org.telegram.ui.Components.z5 f21599j2;
    public org.telegram.ui.Components.q5 f21600j3;
    public boolean f21601j4;
    public x11 f21602k0;
    public boolean f21603k1;
    public boolean f21604k2;
    public org.telegram.ui.Components.q5 f21605k3;
    public final RectF f21606k4;
    public Paint f21607l0;
    public float l1;
    public final org.telegram.ui.Components.z5 f21608l2;
    public org.telegram.ui.Components.q5 f21609l3;
    public tf.h f21610l4;
    public Paint m0;
    public float f21611m1;
    public long f21612m2;
    public org.telegram.ui.Components.q5 f21613m3;
    public Path f21614m4;
    public float f21615n;
    public boolean f21616n0;
    public float f21617n1;
    public j2 f21618n2;
    public int f21619n3;
    public RectF f21620n4;
    public boolean f21621o0;
    public float f21622o1;
    public final boolean f21623o2;
    public int f21624o3;
    public int f21625o4;
    public boolean f21626p0;
    public int f21627p1;
    public boolean f21628p2;
    public StaticLayout f21629p3;
    public int f21630p4;
    public fs f21631q0;
    public float f21632q1;
    public boolean f21633q2;
    public boolean f21634q3;
    public int f21635q4;
    public boolean f21636r;
    public final i2 f21637r0;
    public int f21638r1;
    public boolean f21639r2;
    public int f21640r3;
    public float f21641r4;
    public gj0 f21642s;
    public Path f21643s0;
    public int f21644s1;
    public boolean f21645s2;
    public int f21646s3;
    public boolean f21647s4;
    public ih.k f21648t0;
    public float f21649t1;
    public boolean f21650t2;
    public boolean f21651t3;
    public ValueAnimator f21652t4;
    public boolean f21653u0;
    public boolean f21654u1;
    public int f21655u2;
    public float f21656u3;
    public long f21657u4;
    public int v;
    public boolean f21658v0;
    public gj0 f21659v1;
    public int f21660v2;
    public boolean f21661v3;
    public int f21662v4;
    public boolean f21663w;
    public boolean f21664w0;
    public boolean f21665w1;
    public StaticLayout f21666w2;
    public boolean f21667w3;
    public final qy f21668w4;
    public boolean f21669x;
    public boolean f21670x0;
    public boolean f21671x1;
    public boolean f21672x2;
    public boolean f21673x3;
    public StaticLayout f21674x4;
    public boolean f21675y;
    public boolean f21676y0;
    public float f21677y1;
    public float f21678y2;
    public boolean f21679y3;
    public int f21680y4;
    public float f21681z0;
    public float f21682z1;
    public boolean f21683z2;
    public int f21684z3;
    public int z4;

    public q2(Context context, boolean z4) {
        this(null, context, z4, UserConfig.selectedAccount, null);
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
        if (this.f21567d1 == null) {
            MessageObject messageObject = this.f21563c1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f21567d1.size(); i11++) {
            MessageObject messageObject3 = (MessageObject) this.f21567d1.get(i11);
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
        boolean z4 = this.f21623o2;
        if (!z4 && !SharedConfig.useThreeLinesLayout) {
            i10 = this.G;
        } else {
            i10 = this.H;
        }
        int dp = AndroidUtilities.dp(i10) + 1;
        if (this.N) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (M() && ((!z4 && !SharedConfig.useThreeLinesLayout) || Q())) {
            if (Q()) {
                i11 = this.J;
            } else {
                i11 = this.I;
            }
            return AndroidUtilities.dp(i11) + dp;
        }
        return dp;
    }

    private Paint getPaintReorderGradient() {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, this.C4);
        if (this.J4 != v02 || this.K4 == null) {
            this.J4 = v02;
            if (this.K4 == null) {
                this.K4 = new Paint(1);
            }
            this.K4.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(24.0f), 0.0f, new int[]{0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.K4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.D3) {
            if (N()) {
                return org.telegram.ui.ActionBar.j6.J0;
            }
            return org.telegram.ui.ActionBar.j6.K0;
        }
        return org.telegram.ui.ActionBar.j6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.K;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f19211id;
    }

    public final void A(int i10, int i11) {
        this.f21641r4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f21652t4 = ofFloat;
        ofFloat.setDuration(220L);
        this.f21652t4.setInterpolator(mr.f27122f);
        this.f21630p4 = i10;
        this.f21625o4 = i11;
        this.f21652t4.addUpdateListener(new f2(this, 2));
        this.f21652t4.addListener(new k2(this, 2));
        this.f21647s4 = true;
        this.f21652t4.start();
    }

    public final boolean B(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.B(android.graphics.Canvas):boolean");
    }

    public final void C(Canvas canvas, boolean z4, boolean z10, boolean z11, boolean z12, float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 != 0 || z12) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z4) {
                a0.o(this.S2, this.T2, org.telegram.ui.ActionBar.j6.X0);
                int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i11 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.j6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.j6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.j6.X0.draw(canvas);
                if (i11 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.j6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z11) {
                if (z10) {
                    a0.o(this.U2, this.T2, org.telegram.ui.ActionBar.j6.W0);
                    if (z12) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.j6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.j6.W0.setAlpha((int) (f10 * 255.0f));
                    }
                    if (!z12 && i10 != 0) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.j6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                        int i12 = (int) (255.0f * f10);
                        org.telegram.ui.ActionBar.j6.W0.setAlpha(i12);
                        org.telegram.ui.ActionBar.j6.V0.setAlpha(i12);
                    }
                    org.telegram.ui.ActionBar.j6.W0.draw(canvas);
                    if (z12) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f10) * AndroidUtilities.dp(4.0f), 0.0f);
                    }
                    a0.o(this.Q2, this.T2, org.telegram.ui.ActionBar.j6.V0);
                    org.telegram.ui.ActionBar.j6.V0.draw(canvas);
                    if (z12) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.j6.W0.setAlpha(255);
                    }
                    if (!z12 && i10 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.j6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.j6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.o(this.R2, this.T2, org.telegram.ui.ActionBar.j6.T0);
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.j6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.j6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.j6.T0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.j6.T0.draw(canvas);
                if (i13 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.j6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void D(Canvas canvas, boolean z4, int i10, int i11, int i12, float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        Paint paint;
        boolean z12;
        RectF rectF;
        float f13;
        float interpolation;
        int i13;
        int dp;
        int i14;
        RectF rectF2;
        int i15;
        int w02;
        if (!Q() && !P()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((this.D3 && this.E3) || this.O3 != 1.0f) {
            if (this.P0 == 0 && !this.Q0) {
                f11 = 1.0f - this.O3;
            } else {
                f11 = this.O3;
            }
            int i16 = 255;
            if (z10) {
                if (this.Q == null) {
                    Paint paint2 = new Paint();
                    this.Q = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.Q.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.Q.setStrokeJoin(Paint.Join.ROUND);
                    this.Q.setStrokeCap(Paint.Cap.ROUND);
                }
                f12 = 1.0f;
                this.Q.setColor(i0.a.d(Color.alpha(w02) / 255.0f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false), i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s9, false), 255)));
            } else {
                f12 = 1.0f;
            }
            if (this.M && this.K.read_inbox_max_id == 0) {
                if (this.P == null) {
                    this.P = new Paint();
                }
                paint = this.P;
                if (z4) {
                    i15 = org.telegram.ui.ActionBar.j6.ek;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.dk;
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(i15, this.C4);
                paint.setColor(v02);
                org.telegram.ui.ActionBar.j6.M0.setColor(v02);
                if (z4) {
                    i16 = 30;
                } else {
                    i16 = 40;
                }
                z12 = true;
            } else {
                if (!z4 && this.G0 == 0) {
                    paint = org.telegram.ui.ActionBar.j6.f20213w0;
                } else {
                    paint = org.telegram.ui.ActionBar.j6.f20250y0;
                }
                z12 = false;
            }
            StaticLayout staticLayout = this.R3;
            RectF rectF3 = this.f21606k4;
            if (staticLayout != null && this.P0 != 0) {
                paint.setAlpha((int) ((f12 - this.f21656u3) * i16));
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((f12 - this.f21656u3) * 255.0f));
                float f14 = f11 * 2.0f;
                if (f14 > f12) {
                    f13 = 1.0f;
                } else {
                    f13 = f14;
                }
                float f15 = f12 - f13;
                float f16 = (i12 * f15) + (i11 * f13);
                float f17 = i10;
                rectF3.set(f16, f17, (this.I3 * f15) + (this.H3 * f13) + f16 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i10);
                if (f11 <= 0.5f) {
                    interpolation = mr.f27123g.getInterpolation(f14);
                } else {
                    interpolation = mr.f27124i.getInterpolation(f12 - ((f11 - 0.5f) * 2.0f));
                }
                float f18 = (interpolation * 0.1f) + f12;
                canvas.save();
                float f19 = f18 * f10;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                if (z11) {
                    if (this.f21614m4 == null || (rectF2 = this.f21620n4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f21620n4;
                        if (rectF4 == null) {
                            this.f21620n4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f21614m4 == null) {
                            this.f21614m4 = new Path();
                        }
                        k7.z5.a(this.f21614m4, this.f21620n4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f21614m4, paint);
                    if (z10) {
                        canvas.drawPath(this.f21614m4, this.Q);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z10) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.Q);
                    }
                }
                if (this.S3 != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + f17);
                    this.S3.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.j6.M0.getAlpha();
                float f20 = alpha;
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) (f20 * f13));
                if (this.T3 != null) {
                    canvas.save();
                    float dpf2 = AndroidUtilities.dpf2(6.333f) + f16;
                    if (this.K3) {
                        i14 = AndroidUtilities.dp(17.0f);
                    } else {
                        i14 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf2, AndroidUtilities.dpf2(3.0f) + (i14 * f15) + f17);
                    this.T3.draw(canvas);
                    canvas.restore();
                } else if (this.Q3 != null) {
                    canvas.save();
                    float dpf22 = AndroidUtilities.dpf2(6.333f) + f16;
                    if (this.K3) {
                        i13 = AndroidUtilities.dp(17.0f);
                    } else {
                        i13 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf22, AndroidUtilities.dpf2(3.0f) + (i13 * f15) + f17);
                    this.Q3.draw(canvas);
                    canvas.restore();
                }
                if (this.R3 != null) {
                    org.telegram.ui.ActionBar.j6.M0.setAlpha((int) (f20 * f15));
                    canvas.save();
                    float dpf23 = AndroidUtilities.dpf2(6.333f) + f16;
                    if (this.K3) {
                        dp = -AndroidUtilities.dp(17.0f);
                    } else {
                        dp = AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf23, AndroidUtilities.dpf2(3.0f) + (dp * f13) + f17);
                    this.R3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.j6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.P0 != 0) {
                    staticLayout = this.Q3;
                }
                paint.setAlpha((int) ((f12 - this.f21656u3) * i16));
                org.telegram.ui.ActionBar.j6.M0.setAlpha((int) ((f12 - this.f21656u3) * 255.0f));
                float f21 = i10;
                rectF3.set(i11, f21, AndroidUtilities.dp(12.666f) + this.H3 + i11, AndroidUtilities.dp(20.666f) + i10);
                int save = canvas.save();
                if (f10 != f12) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (f11 != f12) {
                    canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
                }
                if (z11) {
                    if (this.f21614m4 == null || (rectF = this.f21620n4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f21620n4;
                        if (rectF5 == null) {
                            this.f21620n4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f21614m4 == null) {
                            this.f21614m4 = new Path();
                        }
                        k7.z5.a(this.f21614m4, this.f21620n4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f21614m4, paint);
                    if (z10) {
                        canvas.drawPath(this.f21614m4, this.Q);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z10) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.Q);
                    }
                }
                if (staticLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(6.333f) + i11, AndroidUtilities.dpf2(3.0f) + f21);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restoreToCount(save);
            }
            if (z12) {
                org.telegram.ui.ActionBar.j6.M0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.W8, false));
            }
        }
    }

    public boolean E() {
        return false;
    }

    public final CharSequence F() {
        TLRPC.User user;
        String escape;
        int i10 = this.C0;
        MessagesController messagesController = MessagesController.getInstance(i10);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.G0);
        this.J0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = dialogs.get(i11);
            if (!messagesController.isHiddenByUndo(dialog.f19163id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f19163id)) {
                    TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(messagesController, dialog.f19163id);
                    if (n10 != null) {
                        user = messagesController.getUser(Long.valueOf(n10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f19163id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f19163id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f19163id));
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
                    spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, this.C4)), length, length2, 33);
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
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.F0[this.B0].getFontMetricsInt(), false);
    }

    public final CharSequence G() {
        TLRPC.User user;
        String escape;
        MessagesController messagesController = MessagesController.getInstance(this.C0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.E0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.f19163id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f19163id)) {
                    TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(messagesController, dialog.f19163id);
                    if (n10 != null) {
                        user = messagesController.getUser(Long.valueOf(n10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f19163id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f19163id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f19163id));
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
                    spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Y8, this.C4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.j6.F0[this.B0].getFontMetricsInt(), false);
    }

    public final CharSequence I() {
        if (this.G4 == null) {
            this.G4 = new p2(this);
        }
        p2.a(this.G4, this.C0, this.f21563c1, this.f21568d2);
        this.G4.getClass();
        p2 p2Var = this.G4;
        this.F4 = p2Var.f21501c;
        this.f21562c0 = p2Var.d;
        return p2Var.f21503g;
    }

    public final ColorFilter J(int i10, int i11) {
        if (this.Q4 == null) {
            this.R4 = new int[4];
            this.Q4 = new ColorFilter[4];
        }
        if (i11 != this.R4[i10] || this.Q4[i10] == null) {
            ColorFilter[] colorFilterArr = this.Q4;
            this.R4[i10] = i11;
            colorFilterArr[i10] = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        return this.Q4[i10];
    }

    public final SpannableStringBuilder K(int i10, CharSequence charSequence, String str, boolean z4) {
        CharSequence charSequence2;
        CharSequence replaceNewLines;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String formatPluralString;
        int size2;
        String string;
        boolean z10;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        MessageObject captionMessage = getCaptionMessage();
        MessageObject messageObject = this.f21563c1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (messageObject != null) {
            charSequence2 = messageObject.messageText;
        } else {
            charSequence2 = null;
        }
        this.f21557b0 = true;
        if (!TextUtils.isEmpty(str)) {
            return H(str, charSequence, i10);
        }
        MessageObject messageObject2 = this.f21563c1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        int i11 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.M)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = H(charSequence5, charSequence, i10);
                if (this.f21563c1.topicIconDrawable[0] instanceof ag.b) {
                    int i12 = this.C0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i12).getTopicsController().findTopic(-this.f21563c1.getDialogId(), MessageObject.getTopicId(i12, this.f21563c1.messageOwner, true));
                    if (findTopic != null) {
                        ((ag.b) this.f21563c1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.f21557b0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z4) {
                s(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.caption) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.S) {
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
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(this.F + 47);
                if (this.T) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.U.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.U.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.messageTrimmedToHighlightCut) {
                    charSequence7 = AndroidUtilities.ellipsizeCenterEnd(charSequence7, captionMessage.highlightedWords.get(0), measuredWidth, this.U, 130);
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
                TextPaint textPaint = this.U;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                MediaDataController.addAnimatedEmojiSpans(arrayList, spannableString, fontMetricsInt);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(AndroidUtilities.replaceNewLines(spannableString));
            if (z4) {
                append = s(append);
            }
            return H(append, charSequence, i10);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.f6 f6Var = this.C4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z10 = MessageObject.isBlueBlock(this.f21563c1.messageOwner.rich_message.blocks.get(0));
                } else {
                    z10 = false;
                }
                SpannableStringBuilder H = H(this.f21563c1.messageText, charSequence, i10);
                if (z10 && !Q()) {
                    try {
                        f10 f10Var = new f10(org.telegram.ui.ActionBar.j6.f20099p9, f6Var);
                        if (this.T) {
                            i11 = charSequence.length() + 2;
                        }
                        H.setSpan(f10Var, i11, H.length(), 33);
                        return H;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return H;
            } else if (message2.media != null && !messageObject2.isMediaEmpty()) {
                this.U = org.telegram.ui.ActionBar.j6.H0[this.B0];
                int i13 = org.telegram.ui.ActionBar.j6.f20081o9;
                MessageObject messageObject3 = this.f21563c1;
                TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.j6.F0[this.B0].getFontMetricsInt());
                        charSequence3 = zg.a.a(R.drawable.dialog_media_poll_20, spannableString2, true);
                    } else {
                        charSequence3 = zg.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.j6.F0[this.B0].getFontMetricsInt());
                        charSequence3 = zg.a.a(R.drawable.dialog_media_checklist_20, spannableString3, true);
                    } else {
                        charSequence3 = zg.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = zg.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (messageObject3.type == 14) {
                    charSequence3 = ai.k("🎧 \u2068", messageObject3.getMusicAuthor(), " - ", this.f21563c1.getMusicTitle(), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.P1) {
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
                    charSequence3 = lh.ja.Q0(LocaleController.formatString(R.string.AttachPaidMedia, string));
                    i13 = org.telegram.ui.ActionBar.j6.f20099p9;
                } else if (this.O1 > 1) {
                    if (this.P1) {
                        ArrayList arrayList2 = this.f21567d1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Media", size2, new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f21567d1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Photos", size, new Object[0]);
                    }
                    charSequence3 = formatPluralString;
                    i13 = org.telegram.ui.ActionBar.j6.f20099p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i13 = org.telegram.ui.ActionBar.j6.f20099p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z4) {
                    charSequence3 = s(charSequence3);
                }
                SpannableStringBuilder H2 = H(charSequence3, charSequence, i10);
                if (!Q()) {
                    try {
                        f10 f10Var2 = new f10(i13, f6Var);
                        if (this.T) {
                            i11 = charSequence.length() + 2;
                        }
                        H2.setSpan(f10Var2, i11, H2.length(), 33);
                        return H2;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                return H2;
            } else {
                MessageObject messageObject4 = this.f21563c1;
                String str3 = messageObject4.messageOwner.message;
                if (str3 != null) {
                    if (messageObject4.hasHighlightedWords()) {
                        CharSequence charSequence9 = this.f21563c1.messageTrimmedToHighlight;
                        replaceNewLines = str3;
                        if (charSequence9 != null) {
                            replaceNewLines = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(this.F + 33);
                        if (this.T) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.U.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.U.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.f21563c1.highlightedWords.get(0), measuredWidth2, this.U, 130);
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
                    MessageObject messageObject5 = this.f21563c1;
                    if (messageObject5 != null) {
                        messageObject5.spoilLoginCode();
                    }
                    MediaDataController.addTextStyleRuns(this.f21563c1, (Spannable) spannableString4, 264);
                    MessageObject messageObject6 = this.f21563c1;
                    if (messageObject6 != null && (message = messageObject6.messageOwner) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.U;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        MediaDataController.addAnimatedEmojiSpans(arrayList4, spannableString4, fontMetricsInt);
                    }
                    if (z4) {
                        spannableString4 = s(spannableString4);
                    }
                    return H(spannableString4, charSequence, i10);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean M() {
        fs fsVar = this.f21631q0;
        if (fsVar != null && !fsVar.f24963c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if (ChatObject.isCommunity(this.f21568d2)) {
            return !this.f21558b1;
        }
        if (this.M) {
            return this.X0;
        }
        TLRPC.Chat chat = this.f21568d2;
        if (chat != null && chat.forum && this.K == null) {
            if (!this.f21554a1) {
                return true;
            }
            return false;
        }
        return this.W0;
    }

    public final boolean O() {
        if (this.G0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if (this.G0 != 0) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        TLRPC.Chat chat;
        if (!O() && !this.M0 && (chat = this.f21568d2) != null) {
            if ((chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.C0, this.f21568d2))) && !this.M) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean R() {
        TLRPC.User user;
        if (!Q() && !this.f21637r0.f15418w && (user = this.f21564c2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i10 = this.C0;
            if (userStatus == null || userStatus.expires > 0 || !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.f21564c2.f19306id))) {
                TLRPC.UserStatus userStatus2 = this.f21564c2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean S(float f10) {
        if (!LocaleController.isRTL) {
            if (f10 >= 0.0f && f10 < AndroidUtilities.dp(60.0f)) {
                return true;
            }
            return false;
        } else if (f10 >= getMeasuredWidth() - AndroidUtilities.dp(60.0f) && f10 < getMeasuredWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public final void T(boolean z4, boolean z10) {
        if ((!getIsPinned() && z4) || this.f21661v3 == z4) {
            if (!getIsPinned()) {
                this.f21661v3 = false;
                return;
            }
            return;
        }
        this.f21661v3 = z4;
        float f10 = 1.0f;
        if (z10) {
            if (z4) {
                f10 = 0.0f;
            }
            this.f21656u3 = f10;
        } else {
            if (!z4) {
                f10 = 0.0f;
            }
            this.f21656u3 = f10;
        }
        invalidate();
    }

    public final void U() {
        float f10;
        boolean z4 = SharedConfig.archiveHidden;
        this.f21598j1 = z4;
        float f11 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.A1 = f10;
        this.X1.f31292o = f10;
        this.f21632q1 = 0.0f;
        this.f21654u1 = false;
        this.f21656u3 = (getIsPinned() && this.f21661v3) ? 0.0f : 0.0f;
        this.f21651t3 = true;
        this.l1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.j5 j5Var = this.f21586g4;
        if (j5Var != null && this.f21651t3) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f21591h4;
        if (j5Var2 != null && this.f21651t3) {
            j5Var2.a();
        }
    }

    public final void V(boolean z4, boolean z10) {
        j2 j2Var = this.f21618n2;
        if (j2Var == null && !z4) {
            return;
        }
        if (j2Var == null) {
            j2 j2Var2 = new j2(this, getContext(), this.C4, 0);
            this.f21618n2 = j2Var2;
            j2Var2.b(-1, org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.f20007k7);
            this.f21618n2.setDrawUnchecked(false);
            this.f21618n2.setDrawBackgroundAsArc(3);
            addView(this.f21618n2);
        }
        this.f21618n2.a(z4, z10);
        x();
    }

    public final void W(long j10, MessageObject messageObject, int i10, boolean z4, boolean z10) {
        int i11;
        boolean z11;
        if (this.E0 != j10) {
            this.f21635q4 = -1;
        }
        this.E0 = j10;
        this.f21657u4 = System.currentTimeMillis();
        this.f21563c1 = messageObject;
        this.f21639r2 = z4;
        this.K0 = false;
        this.O0 = i10;
        if (messageObject != null) {
            int i12 = messageObject.messageOwner.edit_date;
        }
        this.P0 = 0;
        this.Q0 = false;
        if (messageObject != null) {
            i11 = messageObject.getId();
        } else {
            i11 = 0;
        }
        this.f21593i1 = i11;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = 0;
        if (messageObject != null && messageObject.isUnread()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.U0 = z11;
        MessageObject messageObject2 = this.f21563c1;
        if (messageObject2 != null) {
            this.V0 = messageObject2.messageOwner.send_state;
        }
        b0(0, z10);
    }

    public final void X(TLRPC.Dialog dialog, int i10, int i11) {
        boolean z4;
        if (this.E0 != dialog.f19163id) {
            ValueAnimator valueAnimator = this.f21652t4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f21652t4.cancel();
            }
            this.f21647s4 = false;
            this.f21635q4 = -1;
        }
        this.E0 = dialog.f19163id;
        this.f21657u4 = System.currentTimeMillis();
        boolean z10 = true;
        this.K0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.H0 = dialog.community_id;
        } else {
            this.H0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.G0 = ((TLRPC.TL_dialogFolder) dialog).folder.f19210id;
            qi0 qi0Var = this.f21559b2;
            if (qi0Var != null) {
                qi0Var.H = this;
                qi0Var.i();
            }
        } else {
            this.G0 = 0;
        }
        this.f21583g1 = i10;
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        Runnable runnable = this.S4;
        if (runnable == null) {
            z10 = false;
        }
        if (z4 != z10) {
            if (!z4 && runnable != null) {
                runnable.run();
                this.S4 = null;
            } else if (z4) {
                this.S4 = NotificationCenter.getInstance(this.C0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new h2(this, 0));
            }
        }
        if (this.f21631q0 == null) {
            this.f21631q0 = new fs(this);
        }
        this.f21588h1 = i11;
        this.f21593i1 = 0;
        if (b0(0, false)) {
            requestLayout();
        }
        w();
        v();
        u();
        x();
    }

    public final void Y(TLRPC.TL_forumTopic tL_forumTopic, long j10, MessageObject messageObject, boolean z4, boolean z10) {
        boolean z11;
        qi0 qi0Var;
        this.K = tL_forumTopic;
        if (tL_forumTopic != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.M = z11;
        if (this.E0 != j10) {
            this.f21635q4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof ag.b) {
            ((ag.b) drawable).b(tL_forumTopic.icon_color);
        }
        this.E0 = j10;
        this.f21657u4 = System.currentTimeMillis();
        this.f21563c1 = messageObject;
        this.K0 = false;
        this.f21566d0 = z4;
        this.O0 = messageObject.messageOwner.date;
        this.Q0 = false;
        this.f21593i1 = messageObject.getId();
        this.U0 = messageObject.isUnread();
        MessageObject messageObject2 = this.f21563c1;
        if (messageObject2 != null) {
            this.V0 = messageObject2.messageOwner.send_state;
        }
        if (!z10) {
            this.f21635q4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f21567d1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.K;
        if (tL_forumTopic2 != null && tL_forumTopic2.f19211id == 1 && (qi0Var = this.f21559b2) != null) {
            qi0Var.H = this;
            qi0Var.i();
        }
        b0(0, z10);
    }

    public final void Z(MessageObject messageObject, int i10) {
        boolean z4;
        boolean z10;
        int i11;
        String str;
        float f10;
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
        if (photoSize == null || !DownloadController.getInstance(this.C0).canDownloadMedia(messageObject)) {
            photoSize = strippedPhotoSize;
        }
        if (strippedPhotoSize != null) {
            if (!this.P1 && !messageObject.isVideo() && !messageObject.isRoundVideo()) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.P1 = z4;
            int i12 = this.O1;
            if (i12 < 3) {
                this.O1 = i12 + 1;
                if ((messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.T1[i10] = z10;
                this.U1[i10] = messageObject.hasMediaSpoilers();
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
                ImageReceiver[] imageReceiverArr = this.S1;
                String str2 = str;
                imageReceiverArr[i10].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i11, null, messageObject, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i10];
                if (messageObject.isRoundVideo()) {
                    f10 = 18.0f;
                } else {
                    f10 = 2.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                this.S = false;
            }
        }
    }

    public final void a0() {
        qi0 qi0Var = this.f21559b2;
        if (qi0Var != null) {
            if (this.M) {
                qi0Var.K = AndroidUtilities.dp(24.0f);
                this.f21559b2.L = AndroidUtilities.dp(24.0f);
                this.f21559b2.M = 0.0f;
            } else {
                i2 i2Var = this.f21637r0;
                RectF rectF = i2Var.F;
                RectF rectF2 = i2Var.F;
                qi0Var.K = rectF.centerY();
                this.f21559b2.L = rectF2.centerX();
                this.f21559b2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.C0).getStoriesController().h.isEmpty()) {
                    this.f21559b2.M -= AndroidUtilities.dpf2(3.5f);
                }
                qi0 qi0Var2 = this.f21559b2;
                this.V1.getBitmapWidth();
                qi0Var2.getClass();
            }
            qi0 qi0Var3 = this.f21559b2;
            if (!qi0Var3.E && qi0Var3.I != null) {
                AnimatorSet animatorSet = qi0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    qi0Var3.B.cancel();
                }
                qi0Var3.E = true;
                qi0Var3.F = true;
                qi0Var3.D = 0.0f;
                qi0Var3.I.getTranslationY();
                AndroidUtilities.dp(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new oi0(qi0Var3, 5));
                ofFloat.setInterpolator(mr.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new oi0(qi0Var3, 6));
                mr mrVar = mr.f27125j;
                ofFloat2.setInterpolator(mrVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new oi0(qi0Var3, 7));
                ofFloat3.setInterpolator(mrVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                qi0Var3.B = animatorSet2;
                animatorSet2.addListener(new od0(qi0Var3, 4));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                qi0Var3.B.playTogether(ofFloat, animatorSet3);
                qi0Var3.B.start();
            }
        }
    }

    public final boolean b0(int r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.b0(int, boolean):boolean");
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.c0():void");
    }

    public final void d0(boolean z4) {
        TL_account.RequirementToContact requirementToContact;
        boolean z10;
        if (this.S4 != null && this.f21564c2 != null) {
            requirementToContact = MessagesController.getInstance(this.C0).isUserContactBlocked(this.f21564c2.f19306id);
        } else {
            requirementToContact = null;
        }
        if (this.f21604k2 == DialogObject.isPremiumBlocked(requirementToContact) && this.f21612m2 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.f21604k2 = DialogObject.isPremiumBlocked(requirementToContact);
        this.f21612m2 = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z4) {
            this.f21599j2.f(this.f21604k2, true);
            if (this.f21612m2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21608l2.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.M && !this.C && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f21637r0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0() {
        StaticLayout staticLayout;
        int i10;
        if (this.O1 > 0) {
            if (Q()) {
                staticLayout = this.f21574e3;
            } else {
                staticLayout = this.f21560b3;
            }
            if (Q()) {
                i10 = this.Z2;
            } else {
                i10 = this.Y2;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        o2[] o2VarArr = (o2[]) ((Spanned) text).getSpans(0, text.length(), o2.class);
                        boolean[] zArr = this.R1;
                        if (o2VarArr != null && o2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(o2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f21653u0 && !this.f21658v0) {
                                ceil += AndroidUtilities.dp(3.0f);
                            }
                            for (int i11 = 0; i11 < this.O1; i11++) {
                                this.S1[i11].setImageX(i10 + ceil + AndroidUtilities.dp((this.E4 + 2) * i11));
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
        return this.f21632q1;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentDialogFolderId() {
        return this.G0;
    }

    public long getDialogId() {
        return this.E0;
    }

    public boolean getHasUnread() {
        if (this.P0 == 0 && !this.Q0) {
            return false;
        }
        return true;
    }

    public boolean getIsMuted() {
        return this.W0;
    }

    public boolean getIsPinned() {
        if (!this.f21673x3 && !this.f21679y3) {
            return false;
        }
        return true;
    }

    public MessageObject getMessage() {
        return this.f21563c1;
    }

    public int getMessageId() {
        return this.f21593i1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f21612m2;
    }

    @Override
    public float getTranslationX() {
        return this.f21649t1;
    }

    @Override
    public final void invalidate() {
        if (nh.i9.f15422u1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f21659v1 && drawable != org.telegram.ui.ActionBar.j6.f20177u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V1.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.S1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onAttachedToWindow();
            i10++;
        }
        U();
        this.f21600j3 = org.telegram.ui.Components.u5.update(0, this, this.f21600j3, this.f21560b3);
        this.f21605k3 = org.telegram.ui.Components.u5.update(0, this, this.f21605k3, this.f21629p3);
        this.f21609l3 = org.telegram.ui.Components.u5.update(0, this, this.f21609l3, this.f21574e3);
        this.f21613m3 = org.telegram.ui.Components.u5.update(0, this, this.f21613m3, this.f21666w2);
        org.telegram.ui.Components.j5 j5Var = this.f21586g4;
        if (j5Var != null) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f21591h4;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f10;
        super.onDetachedFromWindow();
        this.f21654u1 = false;
        this.f21671x1 = false;
        this.f21677y1 = 0.0f;
        this.f21651t3 = false;
        if (getIsPinned() && this.f21661v3) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f21656u3 = f10;
        this.V1.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.S1;
            if (i10 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i10].onDetachedFromWindow();
            i10++;
        }
        gj0 gj0Var = this.f21659v1;
        if (gj0Var != null) {
            gj0Var.stop();
            this.f21659v1.Q(0.0f, true);
            this.f21659v1.setCallback(null);
            this.f21659v1 = null;
            this.f21665w1 = false;
        }
        tf.h hVar = this.f21610l4;
        if (hVar != null) {
            hVar.d.remove(Long.valueOf(this.E0));
        }
        org.telegram.ui.Components.j5 j5Var = this.f21586g4;
        if (j5Var != null) {
            j5Var.b();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f21591h4;
        if (j5Var2 != null) {
            j5Var2.b();
        }
        org.telegram.ui.Components.u5.release(this, this.f21600j3);
        org.telegram.ui.Components.u5.release(this, this.f21605k3);
        org.telegram.ui.Components.u5.release(this, this.f21609l3);
        org.telegram.ui.Components.u5.release(this, this.f21613m3);
        this.f21637r0.g();
        this.W = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        qi0 qi0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (P() && (qi0Var = this.f21559b2) != null && SharedConfig.archiveHidden && qi0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!P() && this.f21668w4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        j2 j2Var = this.f21618n2;
        if (j2Var != null && j2Var.f26377a.f22938q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f21577f0 == 0.0f && !this.M && !this.C && this.f21637r0.a(motionEvent, this)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int dp;
        int i16;
        if (this.E0 != 0 || this.D0 != null) {
            eg.h0 h0Var = this.f21581f4;
            if (h0Var != null) {
                h0Var.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            }
            if (this.f21618n2 != null) {
                int i17 = this.F;
                boolean z10 = this.f21623o2;
                if (!z10 && !SharedConfig.useThreeLinesLayout) {
                    i14 = 27;
                } else {
                    i14 = 29;
                }
                int dp2 = AndroidUtilities.dp(i17 - i14);
                if (this.f21587h0) {
                    i16 = AndroidUtilities.dp(8.0f);
                    dp = (getMeasuredHeight() - this.f21618n2.getMeasuredHeight()) >> 1;
                } else {
                    if (LocaleController.isRTL) {
                        dp2 = (i12 - i10) - dp2;
                    }
                    float f10 = this.R;
                    if (!z10 && !SharedConfig.useThreeLinesLayout) {
                        i15 = 0;
                    } else {
                        i15 = 6;
                    }
                    int i18 = dp2;
                    dp = AndroidUtilities.dp(f10 + i15);
                    i16 = i18;
                }
                j2 j2Var = this.f21618n2;
                j2Var.layout(i16, dp, j2Var.getMeasuredWidth() + i16, this.f21618n2.getMeasuredHeight() + dp);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.D4 && !this.f21670x0) {
                return;
            }
            this.f21670x0 = false;
            this.D4 = measuredWidth;
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
        eg.h0 h0Var = this.f21581f4;
        if (h0Var != null) {
            h0Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        }
        j2 j2Var = this.f21618n2;
        if (j2Var != null) {
            j2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.M) {
            int size = View.MeasureSpec.getSize(i10);
            boolean z4 = this.f21623o2;
            if (!z4 && !SharedConfig.useThreeLinesLayout) {
                i12 = this.G;
            } else {
                i12 = this.H;
            }
            if (M() && ((!z4 && !SharedConfig.useThreeLinesLayout) || Q())) {
                if (Q()) {
                    i13 = this.J;
                } else {
                    i13 = this.I;
                }
            } else {
                i13 = 0;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(i12 + i13) + (this.f21628p2 ? 1 : 0));
            this.N = false;
            if (this.M && !M()) {
                t();
                if (this.O) {
                    this.N = true;
                    t();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), y());
        this.f21638r1 = 0;
        this.f21644s1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        MessageObject captionMessage;
        TLRPC.User user;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb = new StringBuilder();
        String str = this.I0;
        if (str != null) {
            sb.append(str);
            sb.append(". ");
        } else if (this.G0 == 1) {
            org.telegram.ui.b.i(R.string.ArchivedChats, ". ", sb);
        } else {
            if (this.f21573e2 != null) {
                org.telegram.ui.b.i(R.string.AccDescrSecretChat, ". ", sb);
            }
            if (this.M && this.K != null) {
                org.telegram.ui.b.i(R.string.AccDescrTopic, ". ", sb);
                sb.append(this.K.title);
                sb.append(". ");
            } else {
                TLRPC.User user2 = this.f21564c2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.f21564c2)) {
                        sb.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.f21564c2.bot) {
                            org.telegram.ui.b.i(R.string.Bot, ". ", sb);
                        }
                        TLRPC.User user3 = this.f21564c2;
                        if (user3.self) {
                            sb.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb.append(". ");
                } else {
                    TLRPC.Chat chat = this.f21568d2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb.append(". ");
                        sb.append(this.f21568d2.title);
                        sb.append(". ");
                    }
                }
            }
        }
        if (this.f21565c4) {
            org.telegram.ui.b.i(R.string.AccDescrVerified, ". ", sb);
        }
        if (this.W0) {
            org.telegram.ui.b.i(R.string.AccDescrNotificationsMuted, ". ", sb);
        }
        if (R()) {
            org.telegram.ui.b.i(R.string.AccDescrUserOnline, ". ", sb);
        }
        int i10 = this.P0;
        if (i10 > 0) {
            sb.append(LocaleController.formatPluralString("NewMessages", i10, new Object[0]));
            sb.append(". ");
        }
        int i11 = this.R0;
        if (i11 > 0) {
            sb.append(LocaleController.formatPluralString("AccDescrMentionCount", i11, new Object[0]));
            sb.append(". ");
        }
        if (this.S0 > 0) {
            org.telegram.ui.b.i(R.string.AccDescrMentionReaction, ". ", sb);
        }
        MessageObject messageObject = this.f21563c1;
        if (messageObject != null && this.G0 == 0) {
            int i12 = this.O0;
            if (i12 == 0) {
                i12 = messageObject.messageOwner.date;
            }
            String formatDateAudio = LocaleController.formatDateAudio(i12, true);
            if (this.f21563c1.isOut()) {
                sb.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
            } else {
                sb.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
            }
            sb.append(". ");
            if (this.f21568d2 != null && !this.f21563c1.isOut() && this.f21563c1.isFromUser() && this.f21563c1.messageOwner.action == null && (user = MessagesController.getInstance(this.C0).getUser(Long.valueOf(this.f21563c1.messageOwner.from_id.user_id))) != null) {
                sb.append(ContactsController.formatName(user.first_name, user.last_name));
                sb.append(". ");
            }
            if (this.f21573e2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f21563c1.messageText);
                if (!this.f21563c1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                    if (sb2.length() > 0) {
                        sb2.append(". ");
                    }
                    sb2.append(captionMessage.caption);
                }
                StaticLayout staticLayout = this.f21560b3;
                if (staticLayout == null) {
                    length = -1;
                } else {
                    length = staticLayout.getText().length();
                }
                if (length > 0) {
                    int length2 = sb2.length();
                    int indexOf = sb2.indexOf("\n", length);
                    if (indexOf < length2 && indexOf >= 0) {
                        length2 = indexOf;
                    }
                    int indexOf2 = sb2.indexOf("\t", length);
                    if (indexOf2 < length2 && indexOf2 >= 0) {
                        length2 = indexOf2;
                    }
                    int indexOf3 = sb2.indexOf(" ", length);
                    if (indexOf3 < length2 && indexOf3 >= 0) {
                        length2 = indexOf3;
                    }
                    sb.append(sb2.substring(0, length2));
                } else {
                    sb.append((CharSequence) sb2);
                }
            }
            accessibilityEvent.setContentDescription(sb);
            setContentDescription(sb);
            return;
        }
        accessibilityEvent.setContentDescription(sb);
        setContentDescription(sb);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        qy qyVar;
        if (i10 == R.id.acc_action_chat_preview && (qyVar = this.f21668w4) != null) {
            qyVar.H4(this);
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
        if (this.O1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new o2(AndroidUtilities.dp(((this.E4 + 2) * this.O1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void setArchivedPullAnimation(qi0 qi0Var) {
        this.f21559b2 = qi0Var;
    }

    public void setBottomClip(int i10) {
        this.f21644s1 = i10;
    }

    public void setClipProgress(float f10) {
        this.f21632q1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.E0 = j10;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.F0, str)) {
            this.F0 = str;
            t();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.F0 = str;
    }

    public void setDialog(l2 l2Var) {
        this.D0 = l2Var;
        this.f21593i1 = 0;
        b0(0, true);
        w();
        v();
        u();
        x();
    }

    public void setDialogCellDelegate(m2 m2Var) {
        this.f21553a0 = m2Var;
    }

    public void setDialogSelected(boolean z4) {
        if (this.f21601j4 != z4) {
            invalidate();
        }
        this.f21601j4 = z4;
    }

    public void setIsTransitionSupport(boolean z4) {
        this.f21582g0 = z4;
    }

    public void setMoving(boolean z4) {
        this.f21636r = z4;
    }

    public void setOpenBotButton(boolean z4) {
        if (this.B1 == z4) {
            return;
        }
        if (this.F1 == null) {
            this.F1 = new k01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.B1 = z4;
        this.C1.c(false);
    }

    public void setPinForced(boolean z4) {
        this.f21679y3 = z4;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            t();
        }
        invalidate();
    }

    public void setPreloader(tf.h hVar) {
        this.f21610l4 = hVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.f21577f0 != f10) {
            this.f21577f0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z4) {
        this.f21654u1 = z4;
    }

    public void setTitleOverride(String str) {
        this.I0 = str;
    }

    public void setTopClip(int i10) {
        this.f21638r1 = i10;
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 == this.f21649t1) {
            return;
        }
        this.f21649t1 = f10;
        gj0 gj0Var = this.f21659v1;
        boolean z4 = true;
        if (gj0Var != null && f10 == 0.0f) {
            gj0Var.Q(0.0f, true);
            this.f21665w1 = false;
            this.f21598j1 = SharedConfig.archiveHidden;
            this.f21677y1 = 0.0f;
            this.f21654u1 = false;
        }
        float f11 = this.f21649t1;
        if (f11 != 0.0f) {
            this.f21654u1 = true;
        } else {
            this.f21682z1 = 0.0f;
            this.f21677y1 = 0.0f;
            this.f21671x1 = false;
        }
        if (this.f21654u1 && !this.f21663w) {
            boolean z10 = this.f21671x1;
            if (Math.abs(f11) < getMeasuredWidth() * 0.45f) {
                z4 = false;
            }
            this.f21671x1 = z4;
            if (z10 != z4 && this.f21598j1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z4) {
        if (this.f21664w0 != z4) {
            this.f21664w0 = z4;
            if (z4) {
                invalidate();
            }
        }
    }

    public void t() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.t():void");
    }

    public final void u() {
        TLRPC.Message message;
        MessageObject messageObject = this.f21563c1;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.U0) {
                ChatThemeController.getInstance(this.C0).setDialogTheme(this.E0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
    }

    public final void v() {
        boolean z4;
        float f10;
        TLRPC.Chat chat = this.f21568d2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f21645s2 = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f21617n1 = f10;
    }

    public final void w() {
        float f10;
        TLRPC.User user;
        if (this.f21564c2 != null && (user = MessagesController.getInstance(this.C0).getUser(Long.valueOf(this.f21564c2.f19306id))) != null) {
            this.f21564c2 = user;
        }
        if (R()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f21611m1 = f10;
    }

    public final void x() {
        boolean z4;
        float f10;
        j2 j2Var;
        if (this.f21592i0 > 0 && !this.f21645s2 && !R() && (((j2Var = this.f21618n2) == null || !j2Var.f26377a.f22938q) && !this.f21637r0.f15418w)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f21650t2 = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f21597j0 = f10;
    }

    public final int y() {
        float f10;
        if (Q() && !this.f21582g0 && !this.f21576f) {
            if (!this.f21623o2 && !SharedConfig.useThreeLinesLayout) {
                f10 = 91.0f;
            } else {
                f10 = 86.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (this.f21628p2) {
                dp++;
            }
            if (M()) {
                return AndroidUtilities.dp(this.J) + dp;
            }
            return dp;
        }
        return getCollapsedHeight();
    }

    public q2(qy qyVar, Context context, boolean z4, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f21669x = true;
        int i11 = 0;
        this.f21675y = false;
        this.E = 11;
        this.F = 72;
        this.G = 70;
        this.H = 76;
        this.I = 3;
        this.J = 11;
        this.R = 42.0f;
        i2 i2Var = new i2(this);
        this.f21637r0 = i2Var;
        this.f21664w0 = true;
        this.f21681z0 = 0.0f;
        this.f21554a1 = false;
        this.f21558b1 = false;
        this.C1 = new rc(this);
        this.D1 = new Paint(1);
        this.E1 = new RectF();
        this.I1 = false;
        this.R1 = new boolean[3];
        this.S1 = new ImageReceiver[3];
        this.T1 = new boolean[3];
        this.U1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.V1 = imageReceiver;
        this.X1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.a2 = new f2.a0(5);
        mr mrVar = mr.h;
        this.f21599j2 = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        this.f21608l2 = new org.telegram.ui.Components.z5(this, 0L, 350L, mrVar);
        this.f21580f3 = new Stack();
        this.f21585g3 = new ArrayList();
        this.f21590h3 = new Stack();
        this.f21595i3 = new ArrayList();
        this.E3 = true;
        this.L3 = new xd.a(this, mrVar, 320L);
        this.O3 = 1.0f;
        this.P3 = 1.0f;
        this.f21606k4 = new RectF();
        this.f21635q4 = -1;
        this.A4 = -1;
        this.B4 = new n2(this);
        i2Var.I = true;
        this.C4 = f6Var;
        this.f21668w4 = qyVar;
        org.telegram.ui.ActionBar.j6.R(context);
        this.f21675y = false;
        this.B = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.S1;
            if (i11 < imageReceiverArr.length) {
                imageReceiverArr[i11] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.S1[i11];
                imageReceiver2.ignoreNotifications = true;
                imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
                this.S1[i11].setAllowLoadingOnAttachedOnly(true);
                i11++;
            } else {
                this.f21623o2 = z4;
                this.C0 = i10;
                eg.h0 h0Var = new eg.h0(this, context, 6);
                this.f21581f4 = h0Var;
                addView(h0Var);
                this.f21586g4 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(22.0f), h0Var);
                this.f21591h4 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(17.0f), this);
                this.V1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (nh.i9.f15422u1) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }

    @Override
    public final void e() {
    }
}
