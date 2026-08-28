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
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yr;
import org.telegram.ui.dy;
public class r2 extends a0 implements ih.b7, org.telegram.ui.ActionBar.w5 {
    public boolean A;
    public int A0;
    public boolean A1;
    public Paint A2;
    public int A3;
    public final o2 A4;
    public boolean B;
    public final int B0;
    public final pc B1;
    public Paint B2;
    public float B3;
    public final org.telegram.ui.ActionBar.b6 B4;
    public d7 C;
    public m2 C0;
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
    public nz0 E1;
    public int E2;
    public int E3;
    public int E4;
    public int F;
    public int F0;
    public boolean F1;
    public int F2;
    public int F3;
    public q2 F4;
    public int G;
    public long G0;
    public kh.i9 G1;
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
    public final td.a K3;
    public zf.z0 K4;
    public boolean L;
    public boolean L0;
    public int L1;
    public boolean L2;
    public ValueAnimator L3;
    public Drawable L4;
    public boolean M;
    public boolean M0;
    public mi0 M1;
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
    public wc V;
    public boolean V0;
    public xd0 V1;
    public int V2;
    public boolean V3;
    public n2 W;
    public boolean W0;
    public final org.telegram.ui.Components.z8 W1;
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
    public final f2.c0 Z1;
    public int Z2;
    public int Z3;
    public boolean f24954a0;
    public boolean f24955a1;
    public uh0 a2;
    public StaticLayout a3;
    public StaticLayout f24956a4;
    public boolean f24957b0;
    public MessageObject f24958b1;
    public TLRPC.User f24959b2;
    public StaticLayout f24960b3;
    public boolean f24961b4;
    public boolean f24962c0;
    public ArrayList f24963c1;
    public TLRPC.Chat f24964c2;
    public int f24965c3;
    public boolean f24966c4;
    public Drawable[] f24967d0;
    public boolean f24968d1;
    public TLRPC.EncryptedChat f24969d2;
    public StaticLayout f24970d3;
    public boolean f24971d4;
    public float f24972e0;
    public CharSequence f24973e1;
    public CharSequence f24974e2;
    public final Stack f24975e3;
    public final fh.l2 f24976e4;
    public boolean f24977f;
    public boolean f24978f0;
    public int f24979f1;
    public int f24980f2;
    public final ArrayList f24981f3;
    public final org.telegram.ui.Components.i5 f24982f4;
    public boolean f24983g0;
    public int f24984g1;
    public boolean f24985g2;
    public final Stack f24986g3;
    public final org.telegram.ui.Components.i5 f24987g4;
    public final boolean h;
    public int f24988h0;
    public int f24989h1;
    public TLRPC.DraftMessage f24990h2;
    public final ArrayList f24991h3;
    public int f24992h4;
    public float f24993i0;
    public boolean f24994i1;
    public final org.telegram.ui.Components.y5 f24995i2;
    public org.telegram.ui.Components.p5 f24996i3;
    public boolean f24997i4;
    public b11 f24998j0;
    public boolean f24999j1;
    public boolean f25000j2;
    public org.telegram.ui.Components.p5 f25001j3;
    public final RectF f25002j4;
    public Paint f25003k0;
    public float f25004k1;
    public final org.telegram.ui.Components.y5 f25005k2;
    public org.telegram.ui.Components.p5 f25006k3;
    public of.j f25007k4;
    public Paint f25008l0;
    public float l1;
    public long f25009l2;
    public org.telegram.ui.Components.p5 f25010l3;
    public Path f25011l4;
    public boolean m0;
    public float f25012m1;
    public kh.k3 f25013m2;
    public int f25014m3;
    public RectF f25015m4;
    public float f25016n;
    public boolean f25017n0;
    public float f25018n1;
    public final boolean f25019n2;
    public int f25020n3;
    public int f25021n4;
    public boolean f25022o0;
    public int f25023o1;
    public boolean f25024o2;
    public StaticLayout f25025o3;
    public int f25026o4;
    public yr f25027p0;
    public float f25028p1;
    public boolean f25029p2;
    public boolean f25030p3;
    public int f25031p4;
    public final k2 f25032q0;
    public int f25033q1;
    public boolean f25034q2;
    public int f25035q3;
    public float f25036q4;
    public boolean f25037r;
    public Path f25038r0;
    public int f25039r1;
    public boolean f25040r2;
    public int f25041r3;
    public boolean f25042r4;
    public mi0 f25043s;
    public dh.l f25044s0;
    public float f25045s1;
    public boolean f25046s2;
    public boolean f25047s3;
    public ValueAnimator f25048s4;
    public boolean f25049t0;
    public boolean f25050t1;
    public int f25051t2;
    public float f25052t3;
    public long f25053t4;
    public boolean f25054u0;
    public mi0 f25055u1;
    public int f25056u2;
    public boolean f25057u3;
    public int f25058u4;
    public int v;
    public boolean f25059v0;
    public boolean f25060v1;
    public StaticLayout f25061v2;
    public boolean f25062v3;
    public final dy v4;
    public boolean f25063w;
    public boolean f25064w0;
    public boolean f25065w1;
    public boolean f25066w2;
    public boolean f25067w3;
    public StaticLayout f25068w4;
    public boolean f25069x;
    public boolean f25070x0;
    public float f25071x1;
    public float f25072x2;
    public boolean f25073x3;
    public int f25074x4;
    public boolean f25075y;
    public float f25076y0;
    public float f25077y1;
    public boolean f25078y2;
    public int f25079y3;
    public int f25080y4;
    public nh.a f25081z0;
    public float f25082z1;
    public boolean f25083z2;
    public int f25084z3;
    public int f25085z4;

    public r2(Context context, boolean z10) {
        this(null, context, z10, UserConfig.selectedAccount, null);
    }

    public static SpannableStringBuilder H(CharSequence charSequence, CharSequence charSequence2, int i9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
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
        if (this.f24963c1 == null) {
            MessageObject messageObject = this.f24958b1;
            if (messageObject == null || messageObject.caption == null) {
                return null;
            }
            return messageObject;
        }
        MessageObject messageObject2 = null;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f24963c1.size(); i10++) {
            MessageObject messageObject3 = (MessageObject) this.f24963c1.get(i10);
            if (messageObject3 != null && (charSequence = messageObject3.caption) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i9++;
                }
                messageObject2 = messageObject3;
            }
        }
        if (i9 > 1) {
            return null;
        }
        return messageObject2;
    }

    private int getCollapsedHeight() {
        int i9;
        int i10;
        boolean z10 = this.f25019n2;
        if (!z10 && !SharedConfig.useThreeLinesLayout) {
            i9 = this.F;
        } else {
            i9 = this.G;
        }
        int dp = AndroidUtilities.dp(i9) + 1;
        if (this.M) {
            dp += AndroidUtilities.dp(20.0f);
        }
        if (L() && ((!z10 && !SharedConfig.useThreeLinesLayout) || P())) {
            if (P()) {
                i10 = this.I;
            } else {
                i10 = this.H;
            }
            return AndroidUtilities.dp(i10) + dp;
        }
        return dp;
    }

    private Paint getPaintReorderGradient() {
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, this.B4);
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
                return org.telegram.ui.ActionBar.f6.J0;
            }
            return org.telegram.ui.ActionBar.f6.K0;
        }
        return org.telegram.ui.ActionBar.f6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.J;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f22432id;
    }

    public final boolean A(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.A(android.graphics.Canvas):boolean");
    }

    public final void C(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10) {
        int i9 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i9 != 0 || z13) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z10) {
                a0.o(this.R2, this.S2, org.telegram.ui.ActionBar.f6.X0);
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.f6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.f6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.f6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.f6.X0.draw(canvas);
                if (i10 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.f6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z12) {
                if (z11) {
                    a0.o(this.T2, this.S2, org.telegram.ui.ActionBar.f6.W0);
                    if (z13) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.f6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.f6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.f6.W0.setAlpha((int) (f10 * 255.0f));
                    }
                    if (!z13 && i9 != 0) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.f6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.f6.W0.getBounds().centerY());
                        int i11 = (int) (255.0f * f10);
                        org.telegram.ui.ActionBar.f6.W0.setAlpha(i11);
                        org.telegram.ui.ActionBar.f6.V0.setAlpha(i11);
                    }
                    org.telegram.ui.ActionBar.f6.W0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f10) * AndroidUtilities.dp(4.0f), 0.0f);
                    }
                    a0.o(this.P2, this.S2, org.telegram.ui.ActionBar.f6.V0);
                    org.telegram.ui.ActionBar.f6.V0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.f6.W0.setAlpha(255);
                    }
                    if (!z13 && i9 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.f6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.f6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                a0.o(this.Q2, this.S2, org.telegram.ui.ActionBar.f6.T0);
                int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i12 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.f6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.f6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.f6.T0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.f6.T0.draw(canvas);
                if (i12 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.f6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void D(Canvas canvas, boolean z10, int i9, int i10, int i11, float f10, boolean z11) {
        boolean z12;
        float f11;
        float f12;
        Paint paint;
        boolean z13;
        RectF rectF;
        float f13;
        float interpolation;
        int i12;
        int dp;
        int i13;
        RectF rectF2;
        int i14;
        int w02;
        if (!P() && !O()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ((this.C3 && this.D3) || this.N3 != 1.0f) {
            if (this.O0 == 0 && !this.P0) {
                f11 = 1.0f - this.N3;
            } else {
                f11 = this.N3;
            }
            int i15 = 255;
            if (z11) {
                if (this.P == null) {
                    Paint paint2 = new Paint();
                    this.P = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.P.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.P.setStrokeJoin(Paint.Join.ROUND);
                    this.P.setStrokeCap(Paint.Cap.ROUND);
                }
                f12 = 1.0f;
                this.P.setColor(i0.a.d(Color.alpha(w02) / 255.0f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23270s9, false), 255)));
            } else {
                f12 = 1.0f;
            }
            if (this.L && this.J.read_inbox_max_id == 0) {
                if (this.O == null) {
                    this.O = new Paint();
                }
                paint = this.O;
                if (z10) {
                    i14 = org.telegram.ui.ActionBar.f6.ek;
                } else {
                    i14 = org.telegram.ui.ActionBar.f6.dk;
                }
                int v02 = org.telegram.ui.ActionBar.f6.v0(i14, this.B4);
                paint.setColor(v02);
                org.telegram.ui.ActionBar.f6.M0.setColor(v02);
                if (z10) {
                    i15 = 30;
                } else {
                    i15 = 40;
                }
                z13 = true;
            } else {
                if (!z10 && this.F0 == 0) {
                    paint = org.telegram.ui.ActionBar.f6.f23328w0;
                } else {
                    paint = org.telegram.ui.ActionBar.f6.f23363y0;
                }
                z13 = false;
            }
            StaticLayout staticLayout = this.Q3;
            RectF rectF3 = this.f25002j4;
            if (staticLayout != null && this.O0 != 0) {
                paint.setAlpha((int) ((f12 - this.f25052t3) * i15));
                org.telegram.ui.ActionBar.f6.M0.setAlpha((int) ((f12 - this.f25052t3) * 255.0f));
                float f14 = f11 * 2.0f;
                if (f14 > f12) {
                    f13 = 1.0f;
                } else {
                    f13 = f14;
                }
                float f15 = f12 - f13;
                float f16 = (i11 * f15) + (i10 * f13);
                float f17 = i9;
                rectF3.set(f16, f17, (this.H3 * f15) + (this.G3 * f13) + f16 + AndroidUtilities.dp(12.666f), AndroidUtilities.dp(20.666f) + i9);
                if (f11 <= 0.5f) {
                    interpolation = gr.f28845g.getInterpolation(f14);
                } else {
                    interpolation = gr.f28846i.getInterpolation(f12 - ((f11 - 0.5f) * 2.0f));
                }
                float f18 = (interpolation * 0.1f) + f12;
                canvas.save();
                float f19 = f18 * f10;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                if (z12) {
                    if (this.f25011l4 == null || (rectF2 = this.f25015m4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f25015m4;
                        if (rectF4 == null) {
                            this.f25015m4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f25011l4 == null) {
                            this.f25011l4 = new Path();
                        }
                        g7.c6.a(this.f25011l4, this.f25015m4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f25011l4, paint);
                    if (z11) {
                        canvas.drawPath(this.f25011l4, this.P);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.P);
                    }
                }
                if (this.R3 != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(6.333f) + f16, AndroidUtilities.dpf2(3.0f) + f17);
                    this.R3.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.f6.M0.getAlpha();
                float f20 = alpha;
                org.telegram.ui.ActionBar.f6.M0.setAlpha((int) (f20 * f13));
                if (this.S3 != null) {
                    canvas.save();
                    float dpf2 = AndroidUtilities.dpf2(6.333f) + f16;
                    if (this.J3) {
                        i13 = AndroidUtilities.dp(17.0f);
                    } else {
                        i13 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf2, AndroidUtilities.dpf2(3.0f) + (i13 * f15) + f17);
                    this.S3.draw(canvas);
                    canvas.restore();
                } else if (this.P3 != null) {
                    canvas.save();
                    float dpf22 = AndroidUtilities.dpf2(6.333f) + f16;
                    if (this.J3) {
                        i12 = AndroidUtilities.dp(17.0f);
                    } else {
                        i12 = -AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf22, AndroidUtilities.dpf2(3.0f) + (i12 * f15) + f17);
                    this.P3.draw(canvas);
                    canvas.restore();
                }
                if (this.Q3 != null) {
                    org.telegram.ui.ActionBar.f6.M0.setAlpha((int) (f20 * f15));
                    canvas.save();
                    float dpf23 = AndroidUtilities.dpf2(6.333f) + f16;
                    if (this.J3) {
                        dp = -AndroidUtilities.dp(17.0f);
                    } else {
                        dp = AndroidUtilities.dp(17.0f);
                    }
                    canvas.translate(dpf23, AndroidUtilities.dpf2(3.0f) + (dp * f13) + f17);
                    this.Q3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.f6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.O0 != 0) {
                    staticLayout = this.P3;
                }
                paint.setAlpha((int) ((f12 - this.f25052t3) * i15));
                org.telegram.ui.ActionBar.f6.M0.setAlpha((int) ((f12 - this.f25052t3) * 255.0f));
                float f21 = i9;
                rectF3.set(i10, f21, AndroidUtilities.dp(12.666f) + this.G3 + i10, AndroidUtilities.dp(20.666f) + i9);
                int save = canvas.save();
                if (f10 != f12) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (f11 != f12) {
                    canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
                }
                if (z12) {
                    if (this.f25011l4 == null || (rectF = this.f25015m4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f25015m4;
                        if (rectF5 == null) {
                            this.f25015m4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f25011l4 == null) {
                            this.f25011l4 = new Path();
                        }
                        g7.c6.a(this.f25011l4, this.f25015m4, AndroidUtilities.dp(10.33f));
                    }
                    canvas.drawPath(this.f25011l4, paint);
                    if (z11) {
                        canvas.drawPath(this.f25011l4, this.P);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(11.5f), AndroidUtilities.dp(11.5f), this.P);
                    }
                }
                if (staticLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(6.333f) + i10, AndroidUtilities.dpf2(3.0f) + f21);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                canvas.restoreToCount(save);
            }
            if (z13) {
                org.telegram.ui.ActionBar.f6.M0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.W8, false));
            }
        }
    }

    public boolean E() {
        return false;
    }

    public final CharSequence F() {
        TLRPC.User user;
        String escape;
        int i9 = this.B0;
        MessagesController messagesController = MessagesController.getInstance(i9);
        ArrayList<TLRPC.Dialog> dialogs = messagesController.getDialogs(this.F0);
        this.I0 = dialogs.size();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogs.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Dialog dialog = dialogs.get(i10);
            if (!messagesController.isHiddenByUndo(dialog.f22384id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f22384id)) {
                    TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(messagesController, dialog.f22384id);
                    if (l10 != null) {
                        user = messagesController.getUser(Long.valueOf(l10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f22384id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f22384id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f22384id));
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
                    spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Y8, this.B4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        if (MessagesController.getInstance(i9).storiesController.C(true) > 0) {
            int max = Math.max(1, MessagesController.getInstance(i9).storiesController.C(true));
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Stories", max, new Object[0]));
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.f6.F0[this.A0].getFontMetricsInt(), false);
    }

    public final CharSequence G() {
        TLRPC.User user;
        String escape;
        MessagesController messagesController = MessagesController.getInstance(this.B0);
        ArrayList<TLRPC.Dialog> dialogsByCommunity = messagesController.getDialogsByCommunity(-this.D0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int size = dialogsByCommunity.size();
        for (int i9 = 0; i9 < size; i9++) {
            TLRPC.Dialog dialog = dialogsByCommunity.get(i9);
            if (!messagesController.isHiddenByUndo(dialog.f22384id)) {
                TLRPC.Chat chat = null;
                if (DialogObject.isEncryptedDialog(dialog.f22384id)) {
                    TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(messagesController, dialog.f22384id);
                    if (l10 != null) {
                        user = messagesController.getUser(Long.valueOf(l10.user_id));
                    } else {
                        user = null;
                    }
                } else if (DialogObject.isUserDialog(dialog.f22384id)) {
                    user = messagesController.getUser(Long.valueOf(dialog.f22384id));
                } else {
                    chat = messagesController.getChat(Long.valueOf(-dialog.f22384id));
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
                    spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Y8, this.B4)), length, length2, 33);
                }
                if (spannableStringBuilder.length() > 150) {
                    break;
                }
            }
        }
        return Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.f6.F0[this.A0].getFontMetricsInt(), false);
    }

    public final CharSequence I() {
        if (this.F4 == null) {
            this.F4 = new q2(this);
        }
        q2.a(this.F4, this.B0, this.f24958b1, this.f24964c2);
        this.F4.getClass();
        q2 q2Var = this.F4;
        this.E4 = q2Var.f24896c;
        this.f24957b0 = q2Var.d;
        return q2Var.f24899g;
    }

    public final ColorFilter J(int i9, int i10) {
        if (this.P4 == null) {
            this.Q4 = new int[4];
            this.P4 = new ColorFilter[4];
        }
        if (i10 != this.Q4[i9] || this.P4[i9] == null) {
            ColorFilter[] colorFilterArr = this.P4;
            this.Q4[i9] = i10;
            colorFilterArr[i9] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.P4[i9];
    }

    public final SpannableStringBuilder K(int i9, CharSequence charSequence, String str, boolean z10) {
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
        MessageObject messageObject = this.f24958b1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (messageObject != null) {
            charSequence2 = messageObject.messageText;
        } else {
            charSequence2 = null;
        }
        this.f24954a0 = true;
        if (!TextUtils.isEmpty(str)) {
            return H(str, charSequence, i9);
        }
        MessageObject messageObject2 = this.f24958b1;
        TLRPC.Message message2 = messageObject2.messageOwner;
        int i10 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = messageObject2.messageTextShort;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.L)) {
                charSequence5 = messageObject2.messageText;
            }
            if (MessageObject.isTopicActionMessage(messageObject2)) {
                valueOf = H(charSequence5, charSequence, i9);
                if (this.f24958b1.topicIconDrawable[0] instanceof vf.a) {
                    int i11 = this.B0;
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i11).getTopicsController().findTopic(-this.f24958b1.getDialogId(), MessageObject.getTopicId(i11, this.f24958b1.messageOwner, true));
                    if (findTopic != null) {
                        ((vf.a) this.f24958b1.topicIconDrawable[0]).b(findTopic.icon_color);
                    }
                }
            } else {
                this.f24954a0 = false;
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
            return H(append, charSequence, i9);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.b6 b6Var = this.B4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z11 = MessageObject.isBlueBlock(this.f24958b1.messageOwner.rich_message.blocks.get(0));
                } else {
                    z11 = false;
                }
                SpannableStringBuilder H = H(this.f24958b1.messageText, charSequence, i9);
                if (z11 && !P()) {
                    try {
                        p00 p00Var = new p00(org.telegram.ui.ActionBar.f6.p9, b6Var);
                        if (this.S) {
                            i10 = charSequence.length() + 2;
                        }
                        H.setSpan(p00Var, i10, H.length(), 33);
                        return H;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                return H;
            } else if (message2.media != null && !messageObject2.isMediaEmpty()) {
                this.T = org.telegram.ui.ActionBar.f6.H0[this.A0];
                int i12 = org.telegram.ui.ActionBar.f6.o9;
                MessageObject messageObject3 = this.f24958b1;
                TLRPC.MessageMedia messageMedia = messageObject3.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaPoll.poll.question.entities, spannableString2, org.telegram.ui.ActionBar.f6.F0[this.A0].getFontMetricsInt());
                        charSequence3 = ug.a.a(R.drawable.dialog_media_poll_20, spannableString2, true);
                    } else {
                        charSequence3 = ug.a.a(R.drawable.dialog_media_poll_20, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        MediaDataController.addTextStyleRuns(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3);
                        MediaDataController.addAnimatedEmojiSpans(tL_messageMediaToDo.todo.title.entities, spannableString3, org.telegram.ui.ActionBar.f6.F0[this.A0].getFontMetricsInt());
                        charSequence3 = ug.a.a(R.drawable.dialog_media_checklist_20, spannableString3, true);
                    } else {
                        charSequence3 = ug.a.a(R.drawable.dialog_media_checklist_20, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = ug.a.a(R.drawable.dialog_media_game_20, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (messageObject3.type == 14) {
                    charSequence3 = j2.h("🎧 \u2068", messageObject3.getMusicAuthor(), " - ", this.f24958b1.getMusicTitle(), "\u2069");
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
                    charSequence3 = gh.oa.Q0(LocaleController.formatString(R.string.AttachPaidMedia, string));
                    i12 = org.telegram.ui.ActionBar.f6.p9;
                } else if (this.N1 > 1) {
                    if (this.O1) {
                        ArrayList arrayList2 = this.f24963c1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Media", size2, new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f24963c1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        formatPluralString = LocaleController.formatPluralString("Photos", size, new Object[0]);
                    }
                    charSequence3 = formatPluralString;
                    i12 = org.telegram.ui.ActionBar.f6.p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i12 = org.telegram.ui.ActionBar.f6.p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z10) {
                    charSequence3 = s(charSequence3);
                }
                SpannableStringBuilder H2 = H(charSequence3, charSequence, i9);
                if (!P()) {
                    try {
                        p00 p00Var2 = new p00(i12, b6Var);
                        if (this.S) {
                            i10 = charSequence.length() + 2;
                        }
                        H2.setSpan(p00Var2, i10, H2.length(), 33);
                        return H2;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                return H2;
            } else {
                MessageObject messageObject4 = this.f24958b1;
                String str3 = messageObject4.messageOwner.message;
                if (str3 != null) {
                    if (messageObject4.hasHighlightedWords()) {
                        CharSequence charSequence9 = this.f24958b1.messageTrimmedToHighlight;
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
                            replaceNewLines = AndroidUtilities.ellipsizeCenterEnd(replaceNewLines, this.f24958b1.highlightedWords.get(0), measuredWidth2, this.T, 130);
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
                    MessageObject messageObject5 = this.f24958b1;
                    if (messageObject5 != null) {
                        messageObject5.spoilLoginCode();
                    }
                    MediaDataController.addTextStyleRuns(this.f24958b1, (Spannable) spannableString4, 264);
                    MessageObject messageObject6 = this.f24958b1;
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
                    return H(spannableString4, charSequence, i9);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean L() {
        yr yrVar = this.f25027p0;
        if (yrVar != null && !yrVar.f35056c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        if (ChatObject.isCommunity(this.f24964c2)) {
            return !this.f24955a1;
        }
        if (this.L) {
            return this.W0;
        }
        TLRPC.Chat chat = this.f24964c2;
        if (chat != null && chat.forum && this.J == null) {
            if (!this.Z0) {
                return true;
            }
            return false;
        }
        return this.V0;
    }

    public final boolean N() {
        if (this.F0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if (this.F0 != 0) {
            return true;
        }
        return false;
    }

    public boolean P() {
        TLRPC.Chat chat;
        if (!N() && !this.L0 && (chat = this.f24964c2) != null) {
            if ((chat.forum || (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.B0, this.f24964c2))) && !this.L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Q() {
        TLRPC.User user;
        if (!P() && !this.f25032q0.f11735w && (user = this.f24959b2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i9 = this.B0;
            if (userStatus == null || userStatus.expires > 0 || !MessagesController.getInstance(i9).onlinePrivacy.containsKey(Long.valueOf(this.f24959b2.f22527id))) {
                TLRPC.UserStatus userStatus2 = this.f24959b2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i9).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean R(float f10) {
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

    public final void S(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.f25057u3 == z10) {
            if (!getIsPinned()) {
                this.f25057u3 = false;
                return;
            }
            return;
        }
        this.f25057u3 = z10;
        float f10 = 1.0f;
        if (z11) {
            if (z10) {
                f10 = 0.0f;
            }
            this.f25052t3 = f10;
        } else {
            if (!z10) {
                f10 = 0.0f;
            }
            this.f25052t3 = f10;
        }
        invalidate();
    }

    public final void T() {
        float f10;
        boolean z10 = SharedConfig.archiveHidden;
        this.f24994i1 = z10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.f25082z1 = f10;
        this.W1.f35233o = f10;
        this.f25028p1 = 0.0f;
        this.f25050t1 = false;
        this.f25052t3 = (getIsPinned() && this.f25057u3) ? 0.0f : 0.0f;
        this.f25047s3 = true;
        this.f25004k1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.i5 i5Var = this.f24982f4;
        if (i5Var != null && this.f25047s3) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24987g4;
        if (i5Var2 != null && this.f25047s3) {
            i5Var2.a();
        }
    }

    public final void U(boolean z10, boolean z11) {
        kh.k3 k3Var = this.f25013m2;
        if (k3Var == null && !z10) {
            return;
        }
        if (k3Var == null) {
            kh.k3 k3Var2 = new kh.k3(this, getContext(), this.B4, 1);
            this.f25013m2 = k3Var2;
            k3Var2.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
            this.f25013m2.setDrawUnchecked(false);
            this.f25013m2.setDrawBackgroundAsArc(3);
            addView(this.f25013m2);
        }
        this.f25013m2.a(z10, z11);
        x();
    }

    public final void V(long j10, MessageObject messageObject, int i9, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        if (this.D0 != j10) {
            this.f25031p4 = -1;
        }
        this.D0 = j10;
        this.f25053t4 = System.currentTimeMillis();
        this.f24958b1 = messageObject;
        this.f25034q2 = z10;
        this.J0 = false;
        this.N0 = i9;
        if (messageObject != null) {
            int i11 = messageObject.messageOwner.edit_date;
        }
        this.O0 = 0;
        this.P0 = false;
        if (messageObject != null) {
            i10 = messageObject.getId();
        } else {
            i10 = 0;
        }
        this.f24989h1 = i10;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        if (messageObject != null && messageObject.isUnread()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.T0 = z12;
        MessageObject messageObject2 = this.f24958b1;
        if (messageObject2 != null) {
            this.U0 = messageObject2.messageOwner.send_state;
        }
        a0(0, z11);
    }

    public final void W(TLRPC.Dialog dialog, int i9, int i10) {
        boolean z10;
        if (this.D0 != dialog.f22384id) {
            ValueAnimator valueAnimator = this.f25048s4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f25048s4.cancel();
            }
            this.f25042r4 = false;
            this.f25031p4 = -1;
        }
        this.D0 = dialog.f22384id;
        this.f25053t4 = System.currentTimeMillis();
        boolean z11 = true;
        this.J0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.G0 = dialog.community_id;
        } else {
            this.G0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.F0 = ((TLRPC.TL_dialogFolder) dialog).folder.f22431id;
            uh0 uh0Var = this.a2;
            if (uh0Var != null) {
                uh0Var.H = this;
                uh0Var.i();
            }
        } else {
            this.F0 = 0;
        }
        this.f24979f1 = i9;
        if (i9 == 3) {
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
                this.R4 = NotificationCenter.getInstance(this.B0).listen(this, NotificationCenter.userIsPremiumBlockedUpadted, new i2(this, 0));
            }
        }
        if (this.f25027p0 == null) {
            this.f25027p0 = new yr(this);
        }
        this.f24984g1 = i10;
        this.f24989h1 = 0;
        if (a0(0, false)) {
            requestLayout();
        }
        w();
        v();
        u();
        x();
    }

    public final void X(TLRPC.TL_forumTopic tL_forumTopic, long j10, MessageObject messageObject, boolean z10, boolean z11) {
        boolean z12;
        uh0 uh0Var;
        this.J = tL_forumTopic;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.L = z12;
        if (this.D0 != j10) {
            this.f25031p4 = -1;
        }
        Drawable drawable = messageObject.topicIconDrawable[0];
        if (drawable instanceof vf.a) {
            ((vf.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.D0 = j10;
        this.f25053t4 = System.currentTimeMillis();
        this.f24958b1 = messageObject;
        this.J0 = false;
        this.f24962c0 = z10;
        this.N0 = messageObject.messageOwner.date;
        this.P0 = false;
        this.f24989h1 = messageObject.getId();
        this.T0 = messageObject.isUnread();
        MessageObject messageObject2 = this.f24958b1;
        if (messageObject2 != null) {
            this.U0 = messageObject2.messageOwner.send_state;
        }
        if (!z11) {
            this.f25031p4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f24963c1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.J;
        if (tL_forumTopic2 != null && tL_forumTopic2.f22432id == 1 && (uh0Var = this.a2) != null) {
            uh0Var.H = this;
            uh0Var.i();
        }
        a0(0, z11);
    }

    public final void Y(MessageObject messageObject, int i9) {
        boolean z10;
        boolean z11;
        int i10;
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
            int i11 = this.N1;
            if (i11 < 3) {
                this.N1 = i11 + 1;
                if ((messageObject.isVideo() || messageObject.isRoundVideo()) && !messageObject.hasMediaSpoilers()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.S1[i9] = z11;
                this.T1[i9] = messageObject.hasMediaSpoilers();
                if (messageObject.type == 1 && photoSize != null) {
                    i10 = photoSize.size;
                } else {
                    i10 = 0;
                }
                if (messageObject.hasMediaSpoilers()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.R1;
                String str2 = str;
                imageReceiverArr[i9].setImage(ImageLocation.getForObject(photoSize, tLObject), str2, ImageLocation.getForObject(strippedPhotoSize, tLObject), str2, i10, null, messageObject, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i9];
                if (messageObject.isRoundVideo()) {
                    f10 = 18.0f;
                } else {
                    f10 = 2.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                this.R = false;
            }
        }
    }

    public final void Z() {
        uh0 uh0Var = this.a2;
        if (uh0Var != null) {
            if (this.L) {
                uh0Var.K = AndroidUtilities.dp(24.0f);
                this.a2.L = AndroidUtilities.dp(24.0f);
                this.a2.M = 0.0f;
            } else {
                k2 k2Var = this.f25032q0;
                RectF rectF = k2Var.F;
                RectF rectF2 = k2Var.F;
                uh0Var.K = rectF.centerY();
                this.a2.L = rectF2.centerX();
                this.a2.M = rectF2.width() / 2.0f;
                if (!MessagesController.getInstance(this.B0).getStoriesController().h.isEmpty()) {
                    this.a2.M -= AndroidUtilities.dpf2(3.5f);
                }
                uh0 uh0Var2 = this.a2;
                this.U1.getBitmapWidth();
                uh0Var2.getClass();
            }
            uh0 uh0Var3 = this.a2;
            if (!uh0Var3.E && uh0Var3.I != null) {
                AnimatorSet animatorSet = uh0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    uh0Var3.B.cancel();
                }
                uh0Var3.E = true;
                uh0Var3.F = true;
                uh0Var3.D = 0.0f;
                uh0Var3.I.getTranslationY();
                AndroidUtilities.dp(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new sh0(uh0Var3, 5));
                ofFloat.setInterpolator(gr.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new sh0(uh0Var3, 6));
                gr grVar = gr.f28847j;
                ofFloat2.setInterpolator(grVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new sh0(uh0Var3, 7));
                ofFloat3.setInterpolator(grVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                uh0Var3.B = animatorSet2;
                animatorSet2.addListener(new r60(uh0Var3, 11));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                uh0Var3.B.playTogether(ofFloat, animatorSet3);
                uh0Var3.B.start();
            }
        }
    }

    public final boolean a0(int r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.a0(int, boolean):boolean");
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.b0():void");
    }

    public final void c0(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.R4 != null && this.f24959b2 != null) {
            requirementToContact = MessagesController.getInstance(this.B0).isUserContactBlocked(this.f24959b2.f22527id);
        } else {
            requirementToContact = null;
        }
        if (this.f25000j2 == DialogObject.isPremiumBlocked(requirementToContact) && this.f25009l2 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.f25000j2 = DialogObject.isPremiumBlocked(requirementToContact);
        this.f25009l2 = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f24995i2.f(this.f25000j2, true);
            if (this.f25009l2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f25005k2.f(z11, true);
        }
        invalidate();
    }

    public final void d0() {
        StaticLayout staticLayout;
        int i9;
        if (this.N1 > 0) {
            if (P()) {
                staticLayout = this.f24970d3;
            } else {
                staticLayout = this.a3;
            }
            if (P()) {
                i9 = this.Y2;
            } else {
                i9 = this.X2;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        p2[] p2VarArr = (p2[]) ((Spanned) text).getSpans(0, text.length(), p2.class);
                        boolean[] zArr = this.Q1;
                        if (p2VarArr != null && p2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(p2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f25049t0 && !this.f25054u0) {
                                ceil += AndroidUtilities.dp(3.0f);
                            }
                            for (int i10 = 0; i10 < this.N1; i10++) {
                                this.R1[i10].setImageX(i9 + ceil + AndroidUtilities.dp((this.D4 + 2) * i10));
                                zArr[i10] = true;
                            }
                            return;
                        }
                        for (int i11 = 0; i11 < 3; i11++) {
                            zArr[i11] = false;
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.L && !this.B && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f25032q0.a(motionEvent, this);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public float getClipProgress() {
        return this.f25028p1;
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
        if (!this.f25067w3 && !this.f25073x3) {
            return false;
        }
        return true;
    }

    public MessageObject getMessage() {
        return this.f24958b1;
    }

    public int getMessageId() {
        return this.f24989h1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f25009l2;
    }

    @Override
    public float getTranslationX() {
        return this.f25045s1;
    }

    @Override
    public final void invalidate() {
        if (ih.m9.f11776t1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f25055u1 && drawable != org.telegram.ui.ActionBar.f6.f23298u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U1.onAttachedToWindow();
        int i9 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i9 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i9].onAttachedToWindow();
            i9++;
        }
        T();
        this.f24996i3 = org.telegram.ui.Components.t5.update(0, this, this.f24996i3, this.a3);
        this.f25001j3 = org.telegram.ui.Components.t5.update(0, this, this.f25001j3, this.f25025o3);
        this.f25006k3 = org.telegram.ui.Components.t5.update(0, this, this.f25006k3, this.f24970d3);
        this.f25010l3 = org.telegram.ui.Components.t5.update(0, this, this.f25010l3, this.f25061v2);
        org.telegram.ui.Components.i5 i5Var = this.f24982f4;
        if (i5Var != null) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24987g4;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f10;
        super.onDetachedFromWindow();
        this.f25050t1 = false;
        this.f25065w1 = false;
        this.f25071x1 = 0.0f;
        this.f25047s3 = false;
        if (getIsPinned() && this.f25057u3) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f25052t3 = f10;
        this.U1.onDetachedFromWindow();
        int i9 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i9 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i9].onDetachedFromWindow();
            i9++;
        }
        mi0 mi0Var = this.f25055u1;
        if (mi0Var != null) {
            mi0Var.stop();
            this.f25055u1.Q(0.0f, true);
            this.f25055u1.setCallback(null);
            this.f25055u1 = null;
            this.f25060v1 = false;
        }
        of.j jVar = this.f25007k4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.D0));
        }
        org.telegram.ui.Components.i5 i5Var = this.f24982f4;
        if (i5Var != null) {
            i5Var.b();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24987g4;
        if (i5Var2 != null) {
            i5Var2.b();
        }
        org.telegram.ui.Components.t5.release(this, this.f24996i3);
        org.telegram.ui.Components.t5.release(this, this.f25001j3);
        org.telegram.ui.Components.t5.release(this, this.f25006k3);
        org.telegram.ui.Components.t5.release(this, this.f25010l3);
        this.f25032q0.g();
        this.V = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        uh0 uh0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (O() && (uh0Var = this.a2) != null && SharedConfig.archiveHidden && uh0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!O() && this.v4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.acc_action_chat_preview, LocaleController.getString(R.string.AccActionChatPreview)));
            }
        }
        kh.k3 k3Var = this.f25013m2;
        if (k3Var != null && k3Var.f27781a.f26313q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f24972e0 == 0.0f && !this.L && !this.B && this.f25032q0.a(motionEvent, this)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int dp;
        int i15;
        if (this.D0 != 0 || this.C0 != null) {
            fh.l2 l2Var = this.f24976e4;
            if (l2Var != null) {
                l2Var.layout(0, 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            }
            if (this.f25013m2 != null) {
                int i16 = this.E;
                boolean z11 = this.f25019n2;
                if (!z11 && !SharedConfig.useThreeLinesLayout) {
                    i13 = 27;
                } else {
                    i13 = 29;
                }
                int dp2 = AndroidUtilities.dp(i16 - i13);
                if (this.f24983g0) {
                    i15 = AndroidUtilities.dp(8.0f);
                    dp = (getMeasuredHeight() - this.f25013m2.getMeasuredHeight()) >> 1;
                } else {
                    if (LocaleController.isRTL) {
                        dp2 = (i11 - i9) - dp2;
                    }
                    float f10 = this.Q;
                    if (!z11 && !SharedConfig.useThreeLinesLayout) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    int i17 = dp2;
                    dp = AndroidUtilities.dp(f10 + i14);
                    i15 = i17;
                }
                kh.k3 k3Var = this.f25013m2;
                k3Var.layout(i15, dp, k3Var.getMeasuredWidth() + i15, this.f25013m2.getMeasuredHeight() + dp);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.C4 && !this.f25064w0) {
                return;
            }
            this.f25064w0 = false;
            this.C4 = measuredWidth;
            try {
                t();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        fh.l2 l2Var = this.f24976e4;
        if (l2Var != null) {
            l2Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), 1073741824));
        }
        kh.k3 k3Var = this.f25013m2;
        if (k3Var != null) {
            k3Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        if (this.L) {
            int size = View.MeasureSpec.getSize(i9);
            boolean z10 = this.f25019n2;
            if (!z10 && !SharedConfig.useThreeLinesLayout) {
                i11 = this.F;
            } else {
                i11 = this.G;
            }
            if (L() && ((!z10 && !SharedConfig.useThreeLinesLayout) || P())) {
                if (P()) {
                    i12 = this.I;
                } else {
                    i12 = this.H;
                }
            } else {
                i12 = 0;
            }
            setMeasuredDimension(size, AndroidUtilities.dp(i11 + i12) + (this.f25024o2 ? 1 : 0));
            this.M = false;
            if (this.L && !L()) {
                t();
                if (this.N) {
                    this.M = true;
                    t();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), y());
        this.f25033q1 = 0;
        this.f25039r1 = getMeasuredHeight();
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
            j2.k(R.string.ArchivedChats, ". ", sb2);
        } else {
            if (this.f24969d2 != null) {
                j2.k(R.string.AccDescrSecretChat, ". ", sb2);
            }
            if (this.L && this.J != null) {
                j2.k(R.string.AccDescrTopic, ". ", sb2);
                sb2.append(this.J.title);
                sb2.append(". ");
            } else {
                TLRPC.User user2 = this.f24959b2;
                if (user2 != null) {
                    if (UserObject.isReplyUser(user2)) {
                        sb2.append(LocaleController.getString(R.string.RepliesTitle));
                    } else if (UserObject.isAnonymous(this.f24959b2)) {
                        sb2.append(LocaleController.getString(R.string.AnonymousForward));
                    } else {
                        if (this.f24959b2.bot) {
                            j2.k(R.string.Bot, ". ", sb2);
                        }
                        TLRPC.User user3 = this.f24959b2;
                        if (user3.self) {
                            sb2.append(LocaleController.getString(R.string.SavedMessages));
                        } else {
                            sb2.append(ContactsController.formatName(user3.first_name, user3.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f24964c2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(LocaleController.getString(R.string.AccDescrChannel));
                        } else {
                            sb2.append(LocaleController.getString(R.string.AccDescrGroup));
                        }
                        sb2.append(". ");
                        sb2.append(this.f24964c2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f24961b4) {
            j2.k(R.string.AccDescrVerified, ". ", sb2);
        }
        if (this.V0) {
            j2.k(R.string.AccDescrNotificationsMuted, ". ", sb2);
        }
        if (Q()) {
            j2.k(R.string.AccDescrUserOnline, ". ", sb2);
        }
        int i9 = this.O0;
        if (i9 > 0) {
            sb2.append(LocaleController.formatPluralString("NewMessages", i9, new Object[0]));
            sb2.append(". ");
        }
        int i10 = this.Q0;
        if (i10 > 0) {
            sb2.append(LocaleController.formatPluralString("AccDescrMentionCount", i10, new Object[0]));
            sb2.append(". ");
        }
        if (this.R0 > 0) {
            j2.k(R.string.AccDescrMentionReaction, ". ", sb2);
        }
        MessageObject messageObject = this.f24958b1;
        if (messageObject != null && this.F0 == 0) {
            int i11 = this.N0;
            if (i11 == 0) {
                i11 = messageObject.messageOwner.date;
            }
            String formatDateAudio = LocaleController.formatDateAudio(i11, true);
            if (this.f24958b1.isOut()) {
                sb2.append(LocaleController.formatString("AccDescrSentDate", R.string.AccDescrSentDate, formatDateAudio));
            } else {
                sb2.append(LocaleController.formatString("AccDescrReceivedDate", R.string.AccDescrReceivedDate, formatDateAudio));
            }
            sb2.append(". ");
            if (this.f24964c2 != null && !this.f24958b1.isOut() && this.f24958b1.isFromUser() && this.f24958b1.messageOwner.action == null && (user = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.f24958b1.messageOwner.from_id.user_id))) != null) {
                sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                sb2.append(". ");
            }
            if (this.f24969d2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f24958b1.messageText);
                if (!this.f24958b1.isMediaEmpty() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.caption)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.caption);
                }
                StaticLayout staticLayout = this.a3;
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
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        dy dyVar;
        if (i9 == R.id.acc_action_chat_preview && (dyVar = this.v4) != null) {
            dyVar.H4(this);
            return true;
        }
        return super.performAccessibilityAction(i9, bundle);
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
            valueOf.setSpan(new p2(AndroidUtilities.dp(((this.D4 + 2) * this.N1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void setArchivedPullAnimation(uh0 uh0Var) {
        this.a2 = uh0Var;
    }

    public void setBottomClip(int i9) {
        this.f25039r1 = i9;
    }

    public void setClipProgress(float f10) {
        this.f25028p1 = f10;
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

    public void setDialog(m2 m2Var) {
        this.C0 = m2Var;
        this.f24989h1 = 0;
        a0(0, true);
        w();
        v();
        u();
        x();
    }

    public void setDialogCellDelegate(n2 n2Var) {
        this.W = n2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.f24997i4 != z10) {
            invalidate();
        }
        this.f24997i4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f24978f0 = z10;
    }

    public void setMoving(boolean z10) {
        this.f25037r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.A1 == z10) {
            return;
        }
        if (this.E1 == null) {
            this.E1 = new nz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        this.A1 = z10;
        this.B1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.f25073x3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            t();
        }
        invalidate();
    }

    public void setPreloader(of.j jVar) {
        this.f25007k4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.f24972e0 != f10) {
            this.f24972e0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.f25050t1 = z10;
    }

    public void setTitleOverride(String str) {
        this.H0 = str;
    }

    public void setTopClip(int i9) {
        this.f25033q1 = i9;
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 == this.f25045s1) {
            return;
        }
        this.f25045s1 = f10;
        mi0 mi0Var = this.f25055u1;
        boolean z10 = true;
        if (mi0Var != null && f10 == 0.0f) {
            mi0Var.Q(0.0f, true);
            this.f25060v1 = false;
            this.f24994i1 = SharedConfig.archiveHidden;
            this.f25071x1 = 0.0f;
            this.f25050t1 = false;
        }
        float f11 = this.f25045s1;
        if (f11 != 0.0f) {
            this.f25050t1 = true;
        } else {
            this.f25077y1 = 0.0f;
            this.f25071x1 = 0.0f;
            this.f25065w1 = false;
        }
        if (this.f25050t1 && !this.f25063w) {
            boolean z11 = this.f25065w1;
            if (Math.abs(f11) < getMeasuredWidth() * 0.45f) {
                z10 = false;
            }
            this.f25065w1 = z10;
            if (z11 != z10 && this.f24994i1 == SharedConfig.archiveHidden) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z10) {
        if (this.f25059v0 != z10) {
            this.f25059v0 = z10;
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
        MessageObject messageObject = this.f24958b1;
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.T0) {
                ChatThemeController.getInstance(this.B0).setDialogTheme(this.D0, ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme, false);
            }
        }
    }

    public final void v() {
        boolean z10;
        float f10;
        TLRPC.Chat chat = this.f24964c2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25040r2 = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f25012m1 = f10;
    }

    public final void w() {
        float f10;
        TLRPC.User user;
        if (this.f24959b2 != null && (user = MessagesController.getInstance(this.B0).getUser(Long.valueOf(this.f24959b2.f22527id))) != null) {
            this.f24959b2 = user;
        }
        if (Q()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.l1 = f10;
    }

    public final void x() {
        boolean z10;
        float f10;
        kh.k3 k3Var;
        if (this.f24988h0 > 0 && !this.f25040r2 && !Q() && (((k3Var = this.f25013m2) == null || !k3Var.f27781a.f26313q) && !this.f25032q0.f11735w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25046s2 = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f24993i0 = f10;
    }

    public final int y() {
        float f10;
        if (P() && !this.f24978f0 && !this.f24977f) {
            if (!this.f25019n2 && !SharedConfig.useThreeLinesLayout) {
                f10 = 91.0f;
            } else {
                f10 = 86.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (this.f25024o2) {
                dp++;
            }
            if (L()) {
                return AndroidUtilities.dp(this.I) + dp;
            }
            return dp;
        }
        return getCollapsedHeight();
    }

    public final void z(int i9, int i10) {
        this.f25036q4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f25048s4 = ofFloat;
        ofFloat.setDuration(220L);
        this.f25048s4.setInterpolator(gr.f28844f);
        this.f25026o4 = i9;
        this.f25021n4 = i10;
        this.f25048s4.addUpdateListener(new g2(this, 2));
        this.f25048s4.addListener(new l2(this, 2));
        this.f25042r4 = true;
        this.f25048s4.start();
    }

    public r2(dy dyVar, Context context, boolean z10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = true;
        this.f25069x = true;
        int i10 = 0;
        this.f25075y = false;
        this.D = 11;
        this.E = 72;
        this.F = 70;
        this.G = 76;
        this.H = 3;
        this.I = 11;
        this.Q = 42.0f;
        k2 k2Var = new k2(this);
        this.f25032q0 = k2Var;
        this.f25059v0 = true;
        this.f25076y0 = 0.0f;
        this.Z0 = false;
        this.f24955a1 = false;
        this.B1 = new pc(this);
        this.C1 = new Paint(1);
        this.D1 = new RectF();
        this.H1 = false;
        this.Q1 = new boolean[3];
        this.R1 = new ImageReceiver[3];
        this.S1 = new boolean[3];
        this.T1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U1 = imageReceiver;
        this.W1 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.Z1 = new f2.c0(5);
        gr grVar = gr.h;
        this.f24995i2 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.f25005k2 = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.f24975e3 = new Stack();
        this.f24981f3 = new ArrayList();
        this.f24986g3 = new Stack();
        this.f24991h3 = new ArrayList();
        this.D3 = true;
        this.K3 = new td.a(this, grVar, 320L);
        this.N3 = 1.0f;
        this.O3 = 1.0f;
        this.f25002j4 = new RectF();
        this.f25031p4 = -1;
        this.f25085z4 = -1;
        this.A4 = new o2(this);
        k2Var.I = true;
        this.B4 = b6Var;
        this.v4 = dyVar;
        org.telegram.ui.ActionBar.f6.R(context);
        this.f25075y = false;
        this.A = false;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.R1;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.R1[i10];
                imageReceiver2.ignoreNotifications = true;
                imageReceiver2.setRoundRadius(AndroidUtilities.dp(2.0f));
                this.R1[i10].setAllowLoadingOnAttachedOnly(true);
                i10++;
            } else {
                this.f25019n2 = z10;
                this.B0 = i9;
                fh.l2 l2Var = new fh.l2(this, context, 10);
                this.f24976e4 = l2Var;
                addView(l2Var);
                this.f24982f4 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(22.0f), l2Var);
                this.f24987g4 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(17.0f), this);
                this.U1.setAllowLoadingOnAttachedOnly(true);
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (ih.m9.f11776t1) {
            return;
        }
        super.invalidate(i9, i10, i11, i12);
    }

    @Override
    public final void d() {
    }
}
