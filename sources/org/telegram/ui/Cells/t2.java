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
import bi.dd;
import bi.ec;
import bi.sd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ww;
public class t2 extends z implements di.e7, org.telegram.ui.ActionBar.a6 {
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
    public ih.c D0;
    public float D1;
    public boolean D2;
    public int D3;
    public final ww D4;
    public boolean E;
    public int E0;
    public boolean E1;
    public Paint E2;
    public int E3;
    public StaticLayout E4;
    public boolean F;
    public final int F0;
    public final ic F1;
    public Paint F2;
    public float F3;
    public int F4;
    public c7 G;
    public o2 G0;
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
    public my0 I1;
    public int I2;
    public int I3;
    public final q2 I4;
    public int J;
    public int J0;
    public boolean J1;
    public int J2;
    public LayerDrawable J3;
    public final org.telegram.ui.ActionBar.f6 J4;
    public int K;
    public long K0;
    public ii.c K1;
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
    public s2 N4;
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
    public zg0 Q1;
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
    public final te.a S3;
    public ug.y0 S4;
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
    public bd0 Z1;
    public int Z2;
    public StaticLayout Z3;
    public Runnable Z4;
    public TextPaint f30390a0;
    public boolean f30391a1;
    public final org.telegram.ui.Components.w8 f30392a2;
    public int f30393a3;
    public StaticLayout f30394a4;
    public Paint f30395b0;
    public boolean f30396b1;
    public boolean f30397b2;
    public int f30398b3;
    public boolean f30399b4;
    public pc f30400c0;
    public float f30401c1;
    public float f30402c2;
    public int f30403c3;
    public boolean f30404c4;
    public p2 f30405d0;
    public boolean f30406d1;
    public final sd d2;
    public int f30407d3;
    public boolean f30408d4;
    public boolean f30409e0;
    public boolean f30410e1;
    public kg0 f30411e2;
    public StaticLayout f30412e3;
    public int f30413e4;
    public boolean f30414f;
    public boolean f30415f0;
    public ij f30416f1;
    public TLRPC.User f30417f2;
    public StaticLayout f30418f3;
    public int f30419f4;
    public boolean f30420g0;
    public ArrayList f30421g1;
    public TLRPC.Chat f30422g2;
    public int f30423g3;
    public int f30424g4;
    public final boolean h;
    public Drawable[] f30425h0;
    public boolean f30426h1;
    public TLRPC.EncryptedChat f30427h2;
    public StaticLayout f30428h3;
    public int f30429h4;
    public float f30430i0;
    public CharSequence f30431i1;
    public CharSequence f30432i2;
    public final Stack f30433i3;
    public StaticLayout f30434i4;
    public boolean f30435j0;
    public int f30436j1;
    public int f30437j2;
    public final ArrayList j3;
    public boolean f30438j4;
    public boolean f30439k0;
    public int f30440k1;
    public boolean f30441k2;
    public final Stack f30442k3;
    public boolean f30443k4;
    public int f30444l0;
    public int l1;
    public TLRPC.DraftMessage f30445l2;
    public final ArrayList f30446l3;
    public boolean f30447l4;
    public float m0;
    public boolean f30448m1;
    public final org.telegram.ui.Components.w5 f30449m2;
    public org.telegram.ui.Components.n5 f30450m3;
    public final ec f30451m4;
    public float f30452n;
    public a01 f30453n0;
    public boolean n1;
    public boolean f30454n2;
    public org.telegram.ui.Components.n5 f30455n3;
    public final org.telegram.ui.Components.g5 f30456n4;
    public Paint f30457o0;
    public float f30458o1;
    public final org.telegram.ui.Components.w5 f30459o2;
    public org.telegram.ui.Components.n5 f30460o3;
    public final org.telegram.ui.Components.g5 o4;
    public Paint f30461p0;
    public float f30462p1;
    public long f30463p2;
    public org.telegram.ui.Components.n5 f30464p3;
    public int f30465p4;
    public boolean f30466q0;
    public float f30467q1;
    public fi.a3 f30468q2;
    public int f30469q3;
    public boolean f30470q4;
    public boolean f30471r;
    public boolean f30472r0;
    public float f30473r1;
    public final boolean f30474r2;
    public int f30475r3;
    public final RectF f30476r4;
    public zg0 f30477s;
    public boolean f30478s0;
    public int f30479s1;
    public boolean f30480s2;
    public StaticLayout f30481s3;
    public jg.k f30482s4;
    public ui.e f30483t0;
    public float f30484t1;
    public boolean f30485t2;
    public boolean f30486t3;
    public Path f30487t4;
    public final m2 f30488u0;
    public int f30489u1;
    public boolean f30490u2;
    public int f30491u3;
    public RectF f30492u4;
    public Path f30493v0;
    public int f30494v1;
    public boolean f30495v2;
    public int f30496v3;
    public int f30497v4;
    public int f30498w;
    public xh.f f30499w0;
    public float f30500w1;
    public boolean f30501w2;
    public boolean f30502w3;
    public int f30503w4;
    public boolean f30504x;
    public boolean f30505x0;
    public boolean f30506x1;
    public int f30507x2;
    public float f30508x3;
    public int f30509x4;
    public boolean f30510y;
    public boolean f30511y0;
    public zg0 f30512y1;
    public int f30513y2;
    public boolean f30514y3;
    public float f30515y4;
    public boolean f30516z0;
    public boolean f30517z1;
    public StaticLayout f30518z2;
    public boolean f30519z3;
    public boolean f30520z4;

    public t2(Context context, boolean z9) {
        this(null, context, z9, p10.f24470s0, null);
    }

    public static SpannableStringBuilder N(int i7, CharSequence charSequence, CharSequence charSequence2) {
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

    private ij getCaptionMessage() {
        CharSequence charSequence;
        if (this.f30421g1 == null) {
            ij ijVar = this.f30416f1;
            if (ijVar == null || ijVar.f23318z == null) {
                return null;
            }
            return ijVar;
        }
        int i7 = 0;
        ij ijVar2 = null;
        for (int i10 = 0; i10 < this.f30421g1.size(); i10++) {
            ij ijVar3 = (ij) this.f30421g1.get(i10);
            if (ijVar3 != null && (charSequence = ijVar3.f23318z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i7++;
                }
                ijVar2 = ijVar3;
            }
        }
        if (i7 > 1) {
            return null;
        }
        return ijVar2;
    }

    private int getCollapsedHeight() {
        int i7;
        int i10;
        boolean z9 = this.f30474r2;
        if (!z9 && !iz.f23427p1) {
            i7 = this.J;
        } else {
            i7 = this.K;
        }
        int L = org.telegram.messenger.g0.L(i7) + 1;
        if (this.Q) {
            L += org.telegram.messenger.g0.L(20.0f);
        }
        if (S() && ((!z9 && !iz.f23427p1) || W())) {
            if (W()) {
                i10 = this.M;
            } else {
                i10 = this.L;
            }
            return org.telegram.messenger.g0.L(i10) + L;
        }
        return L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, this.J4);
        if (this.Q4 != w02 || this.R4 == null) {
            this.Q4 = w02;
            if (this.R4 == null) {
                this.R4 = new Paint(1);
            }
            this.R4.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(24.0f), 0.0f, new int[]{0, w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        return this.R4;
    }

    private TextPaint getTimeTextPaint() {
        if (this.G3) {
            if (T()) {
                return org.telegram.ui.ActionBar.k6.J0;
            }
            return org.telegram.ui.ActionBar.k6.K0;
        }
        return org.telegram.ui.ActionBar.k6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.N;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f27008id;
    }

    public final void A() {
        float f10;
        TLRPC.User a22;
        if (this.f30417f2 != null && (a22 = qp.s1(this.F0).a2(Long.valueOf(this.f30417f2.f27105id))) != null) {
            this.f30417f2 = a22;
        }
        if (X()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30462p1 = f10;
    }

    public final void B() {
        boolean z9;
        float f10;
        fi.a3 a3Var;
        if (this.f30444l0 > 0 && !this.f30495v2 && !X() && (((a3Var = this.f30468q2) == null || !a3Var.f40008a.f31263q) && !this.f30488u0.f9427w)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f30501w2 = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.m0 = f10;
    }

    public final int D() {
        float f10;
        if (W() && !this.f30435j0 && !this.f30414f) {
            if (!this.f30474r2 && !iz.f23427p1) {
                f10 = 91.0f;
            } else {
                f10 = 86.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f30480s2) {
                L++;
            }
            if (S()) {
                return org.telegram.messenger.g0.L(this.M) + L;
            }
            return L;
        }
        return getCollapsedHeight();
    }

    public final void E(int i7, int i10) {
        this.f30515y4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A4 = ofFloat;
        ofFloat.setDuration(220L);
        this.A4.setInterpolator(xq.f40366f);
        this.f30503w4 = i7;
        this.f30497v4 = i10;
        this.A4.addUpdateListener(new j2(this, 2));
        this.A4.addListener(new n2(this, 2));
        this.f30520z4 = true;
        this.A4.start();
    }

    public final boolean G(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.G(android.graphics.Canvas):boolean");
    }

    public final void H(Canvas canvas, boolean z9, boolean z10, boolean z11, boolean z12, float f10) {
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 != 0 || z12) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z9) {
                z.s(this.V2, this.W2, org.telegram.ui.ActionBar.k6.X0);
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.X0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.k6.X0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.k6.X0.draw(canvas);
                if (i10 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.k6.X0.setAlpha(255);
                }
                invalidate();
            } else if (z11) {
                if (z10) {
                    z.s(this.X2, this.W2, org.telegram.ui.ActionBar.k6.W0);
                    if (z12) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.k6.W0.setAlpha((int) (f10 * 255.0f));
                    }
                    if (!z12 && i7 != 0) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                        int i11 = (int) (255.0f * f10);
                        org.telegram.ui.ActionBar.k6.W0.setAlpha(i11);
                        org.telegram.ui.ActionBar.k6.V0.setAlpha(i11);
                    }
                    org.telegram.ui.ActionBar.k6.W0.draw(canvas);
                    if (z12) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f10) * org.telegram.messenger.g0.L(4.0f), 0.0f);
                    }
                    z.s(this.T2, this.W2, org.telegram.ui.ActionBar.k6.V0);
                    org.telegram.ui.ActionBar.k6.V0.draw(canvas);
                    if (z12) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.k6.W0.setAlpha(255);
                    }
                    if (!z12 && i7 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.k6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.k6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                z.s(this.U2, this.W2, org.telegram.ui.ActionBar.k6.T0);
                int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i12 != 0) {
                    canvas.save();
                    canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.T0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                    org.telegram.ui.ActionBar.k6.T0.setAlpha((int) (f10 * 255.0f));
                }
                org.telegram.ui.ActionBar.k6.T0.draw(canvas);
                if (i12 != 0) {
                    canvas.restore();
                    org.telegram.ui.ActionBar.k6.T0.setAlpha(255);
                }
            }
        }
    }

    public final void I(Canvas canvas, boolean z9, int i7, int i10, int i11, float f10, boolean z10) {
        boolean z11;
        float f11;
        float f12;
        Paint paint;
        boolean z12;
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
        if (!W() && !V()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((this.G3 && this.L3) || this.V3 != 1.0f) {
            if (this.S0 == 0 && !this.T0) {
                f11 = 1.0f - this.V3;
            } else {
                f11 = this.V3;
            }
            int i16 = 255;
            if (z10) {
                if (this.T == null) {
                    Paint paint2 = new Paint();
                    this.T = paint2;
                    paint2.setStyle(Paint.Style.STROKE);
                    this.T.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    this.T.setStrokeJoin(Paint.Join.ROUND);
                    this.T.setStrokeCap(Paint.Cap.ROUND);
                }
                f12 = 1.0f;
                this.T.setColor(i0.a.f(Color.alpha(x02) / 255.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false), i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s9, false), 255)));
            } else {
                f12 = 1.0f;
            }
            if (this.P && this.N.read_inbox_max_id == 0) {
                if (this.S == null) {
                    this.S = new Paint();
                }
                paint = this.S;
                if (z9) {
                    i14 = org.telegram.ui.ActionBar.k6.Sk;
                } else {
                    i14 = org.telegram.ui.ActionBar.k6.Rk;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i14, this.J4);
                paint.setColor(w02);
                org.telegram.ui.ActionBar.k6.M0.setColor(w02);
                if (z9) {
                    i15 = 30;
                } else {
                    i15 = 40;
                }
                i16 = i15;
                z12 = true;
            } else {
                if (!z9 && this.J0 == 0) {
                    paint = org.telegram.ui.ActionBar.k6.f28200w0;
                } else {
                    paint = org.telegram.ui.ActionBar.k6.f28238y0;
                }
                z12 = false;
            }
            StaticLayout staticLayout = this.Y3;
            RectF rectF3 = this.f30476r4;
            if (staticLayout != null && this.S0 != 0) {
                paint.setAlpha((int) ((f12 - this.f30508x3) * i16));
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f12 - this.f30508x3) * 255.0f));
                float f14 = f11 * 2.0f;
                if (f14 > f12) {
                    f13 = f12;
                } else {
                    f13 = f14;
                }
                float f15 = f12 - f13;
                float f16 = (i11 * f15) + (i10 * f13);
                float f17 = i7;
                rectF3.set(f16, f17, (this.P3 * f15) + (this.O3 * f13) + f16 + org.telegram.messenger.g0.L(12.666f), org.telegram.messenger.g0.L(20.666f) + i7);
                if (f11 <= 0.5f) {
                    interpolation = xq.f40367g.getInterpolation(f14);
                } else {
                    interpolation = xq.f40368i.getInterpolation(f12 - ((f11 - 0.5f) * 2.0f));
                }
                float f18 = (interpolation * 0.1f) + f12;
                canvas.save();
                float f19 = f18 * f10;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                if (z11) {
                    if (this.f30487t4 == null || (rectF2 = this.f30492u4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f30492u4;
                        if (rectF4 == null) {
                            this.f30492u4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f30487t4 == null) {
                            this.f30487t4 = new Path();
                        }
                        c8.fa.a(this.f30487t4, this.f30492u4, org.telegram.messenger.g0.L(10.33f));
                    }
                    canvas.drawPath(this.f30487t4, paint);
                    if (z10) {
                        canvas.drawPath(this.f30487t4, this.T);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                    if (z10) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.T);
                    }
                }
                if (this.Z3 != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.N(6.333f) + f16, org.telegram.messenger.g0.N(3.0f) + f17);
                    this.Z3.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.k6.M0.getAlpha();
                float f20 = alpha;
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f13));
                if (this.f30394a4 != null) {
                    canvas.save();
                    float N = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.R3) {
                        i13 = org.telegram.messenger.g0.L(17.0f);
                    } else {
                        i13 = -org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N, org.telegram.messenger.g0.N(3.0f) + (i13 * f15) + f17);
                    this.f30394a4.draw(canvas);
                    canvas.restore();
                } else if (this.X3 != null) {
                    canvas.save();
                    float N2 = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.R3) {
                        i12 = org.telegram.messenger.g0.L(17.0f);
                    } else {
                        i12 = -org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N2, org.telegram.messenger.g0.N(3.0f) + (i12 * f15) + f17);
                    this.X3.draw(canvas);
                    canvas.restore();
                }
                if (this.Y3 != null) {
                    org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f15));
                    canvas.save();
                    float N3 = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.R3) {
                        L = -org.telegram.messenger.g0.L(17.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N3, org.telegram.messenger.g0.N(3.0f) + (L * f13) + f17);
                    this.Y3.draw(canvas);
                    canvas.restore();
                }
                org.telegram.ui.ActionBar.k6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.S0 != 0) {
                    staticLayout = this.X3;
                }
                paint.setAlpha((int) ((f12 - this.f30508x3) * i16));
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f12 - this.f30508x3) * 255.0f));
                float f21 = i7;
                rectF3.set(i10, f21, org.telegram.messenger.g0.L(12.666f) + this.O3 + i10, org.telegram.messenger.g0.L(20.666f) + i7);
                int save = canvas.save();
                if (f10 != f12) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (f11 != f12) {
                    canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
                }
                if (z11) {
                    if (this.f30487t4 == null || (rectF = this.f30492u4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f30492u4;
                        if (rectF5 == null) {
                            this.f30492u4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f30487t4 == null) {
                            this.f30487t4 = new Path();
                        }
                        c8.fa.a(this.f30487t4, this.f30492u4, org.telegram.messenger.g0.L(10.33f));
                    }
                    canvas.drawPath(this.f30487t4, paint);
                    if (z10) {
                        canvas.drawPath(this.f30487t4, this.T);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                    if (z10) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.T);
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
            if (z12) {
                org.telegram.ui.ActionBar.k6.M0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.W8, false));
            }
        }
    }

    public boolean J() {
        return false;
    }

    public final java.lang.CharSequence K() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.K():java.lang.CharSequence");
    }

    public final java.lang.CharSequence L() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.L():java.lang.CharSequence");
    }

    public final CharSequence P() {
        if (this.N4 == null) {
            this.N4 = new s2(this);
        }
        s2.a(this.N4, this.F0, this.f30416f1, this.f30422g2);
        this.N4.getClass();
        s2 s2Var = this.N4;
        this.M4 = s2Var.f30258c;
        this.f30415f0 = s2Var.d;
        return s2Var.f30261g;
    }

    public final ColorFilter Q(int i7, int i10) {
        if (this.X4 == null) {
            this.Y4 = new int[4];
            this.X4 = new ColorFilter[4];
        }
        if (i10 != this.Y4[i7] || this.X4[i7] == null) {
            ColorFilter[] colorFilterArr = this.X4;
            this.Y4[i7] = i10;
            colorFilterArr[i7] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.X4[i7];
    }

    public final SpannableStringBuilder R(int i7, CharSequence charSequence, String str, boolean z9) {
        CharSequence charSequence2;
        CharSequence N2;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String G;
        int size2;
        String M0;
        boolean z10;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        ij captionMessage = getCaptionMessage();
        ij ijVar = this.f30416f1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (ijVar != null) {
            charSequence2 = ijVar.v;
        } else {
            charSequence2 = null;
        }
        this.f30409e0 = true;
        if (!TextUtils.isEmpty(str)) {
            return N(i7, str, charSequence);
        }
        ij ijVar2 = this.f30416f1;
        TLRPC.Message message2 = ijVar2.f23262k;
        int i10 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = ijVar2.f23306w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.P)) {
                charSequence5 = ijVar2.v;
            }
            if (ij.F4(ijVar2)) {
                valueOf = N(i7, charSequence5, charSequence);
                if (this.f30416f1.f23247g2[0] instanceof qg.a) {
                    int i11 = this.F0;
                    TLRPC.TL_forumTopic f10 = qp.s1(i11).f24877q7.f(-ij.B0(this.f30416f1.f23262k), ij.c2(i11, this.f30416f1.f23262k, true, false));
                    if (f10 != null) {
                        ((qg.a) this.f30416f1.f23247g2[0]).b(f10.icon_color);
                    }
                }
            } else {
                this.f30409e0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z9) {
                w(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.f23318z) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.V) {
                str2 = "";
            } else if (ij.M4(captionMessage.f23262k)) {
                str2 = "📹 ";
            } else if (ij.S4(captionMessage.f23262k)) {
                str2 = "🎤 ";
            } else if (captionMessage.J3()) {
                str2 = "🎧 ";
            } else if (ij.T3(captionMessage.f23262k)) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.s2() && !TextUtils.isEmpty(captionMessage.f23262k.message)) {
                CharSequence charSequence7 = captionMessage.f23219a2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 47);
                if (this.W) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.f30390a0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.f30390a0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.Z1) {
                    charSequence7 = org.telegram.messenger.g0.Q(charSequence7, (String) captionMessage.Y1.get(0), measuredWidth, this.f30390a0);
                }
                return new SpannableStringBuilder(str2).append(charSequence7);
            }
            int length = charSequence6.length();
            CharSequence charSequence8 = charSequence6;
            if (length > 150) {
                charSequence8 = charSequence6.subSequence(0, 150);
            }
            SpannableString spannableString = new SpannableString(charSequence8);
            captionMessage.V5();
            ui.g(captionMessage.f23262k.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.f23262k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.f30390a0;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                ui.a(fontMetricsInt, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.g0.N2(spannableString));
            if (z9) {
                append = w(append);
            }
            return N(i7, append, charSequence);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.f6 f6Var = this.J4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z10 = ij.P2(this.f30416f1.f23262k.rich_message.blocks.get(0));
                } else {
                    z10 = false;
                }
                SpannableStringBuilder N = N(i7, this.f30416f1.v, charSequence);
                if (z10 && !W()) {
                    try {
                        yz yzVar = new yz(org.telegram.ui.ActionBar.k6.f28075p9, f6Var);
                        if (this.W) {
                            i10 = charSequence.length() + 2;
                        }
                        N.setSpan(yzVar, i10, N.length(), 33);
                        return N;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                return N;
            } else if (message2.media != null && !ijVar2.G3()) {
                this.f30390a0 = org.telegram.ui.ActionBar.k6.H0[this.E0];
                int i12 = org.telegram.ui.ActionBar.k6.f28055o9;
                ij ijVar3 = this.f30416f1;
                TLRPC.MessageMedia messageMedia = ijVar3.f23262k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        ui.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2, -1);
                        ui.a(org.telegram.ui.ActionBar.k6.F0[this.E0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                        charSequence3 = oh.a.a(2131231053, spannableString2, true);
                    } else {
                        charSequence3 = oh.a.a(2131231053, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        ui.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3, -1);
                        ui.a(org.telegram.ui.ActionBar.k6.F0[this.E0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                        charSequence3 = oh.a.a(2131231047, spannableString3, true);
                    } else {
                        charSequence3 = oh.a.a(2131231047, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = oh.a.a(2131231048, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (ijVar3.D == 14) {
                    charSequence3 = f1.m("🎧 \u2068", ijVar3.x1(true), " - ", this.f30416f1.z1(true), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.S1) {
                        if (size3 > 1) {
                            M0 = id.G(size3, "Media", new Object[0]);
                        } else {
                            M0 = id.M0(2131753933, null);
                        }
                    } else if (size3 > 1) {
                        M0 = id.G(size3, "Photos", new Object[0]);
                    } else {
                        M0 = id.M0(2131753948, null);
                    }
                    charSequence3 = dd.T0(id.a0(null, null, 2131753949, M0));
                    i12 = org.telegram.ui.ActionBar.k6.f28075p9;
                } else if (this.R1 > 1) {
                    if (this.S1) {
                        ArrayList arrayList2 = this.f30421g1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        G = id.G(size2, "Media", new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f30421g1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        G = id.G(size, "Photos", new Object[0]);
                    }
                    charSequence3 = G;
                    i12 = org.telegram.ui.ActionBar.k6.f28075p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i12 = org.telegram.ui.ActionBar.k6.f28075p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z9) {
                    charSequence3 = w(charSequence3);
                }
                SpannableStringBuilder N3 = N(i7, charSequence3, charSequence);
                if (!W()) {
                    try {
                        yz yzVar2 = new yz(i12, f6Var);
                        if (this.W) {
                            i10 = charSequence.length() + 2;
                        }
                        N3.setSpan(yzVar2, i10, N3.length(), 33);
                        return N3;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                return N3;
            } else {
                ij ijVar4 = this.f30416f1;
                String str3 = ijVar4.f23262k.message;
                if (str3 != null) {
                    if (ijVar4.s2()) {
                        CharSequence charSequence9 = this.f30416f1.f23219a2;
                        N2 = str3;
                        if (charSequence9 != null) {
                            N2 = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.I + 33);
                        if (this.W) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.f30390a0.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.f30390a0.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            N2 = org.telegram.messenger.g0.Q(N2, (String) this.f30416f1.Y1.get(0), measuredWidth2, this.f30390a0);
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
                    ij ijVar5 = this.f30416f1;
                    if (ijVar5 != null) {
                        ijVar5.V5();
                    }
                    ij ijVar6 = this.f30416f1;
                    Pattern pattern = ui.R1;
                    ui.g(ijVar6.f23262k.entities, ijVar6.v, spannableString4, 264);
                    ij ijVar7 = this.f30416f1;
                    if (ijVar7 != null && (message = ijVar7.f23262k) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.f30390a0;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        ui.a(fontMetricsInt, spannableString4, arrayList4);
                    }
                    if (z9) {
                        spannableString4 = w(spannableString4);
                    }
                    return N(i7, spannableString4, charSequence);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean S() {
        ui.e eVar = this.f30483t0;
        if (eVar != null && !((ArrayList) eVar.d).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (org.telegram.messenger.t3.Y(this.f30422g2)) {
            return !this.f30410e1;
        }
        if (this.P) {
            return this.f30391a1;
        }
        TLRPC.Chat chat = this.f30422g2;
        if (chat != null && chat.forum && this.N == null) {
            if (!this.f30406d1) {
                return true;
            }
            return false;
        }
        return this.Z0;
    }

    public final boolean U() {
        if (this.J0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if (this.J0 != 0) {
            return true;
        }
        return false;
    }

    public boolean W() {
        TLRPC.Chat chat;
        if (!U() && !this.P0 && (chat = this.f30422g2) != null) {
            if (!chat.forum) {
                if (org.telegram.messenger.t3.p0(chat)) {
                    if (!org.telegram.messenger.t3.A(this.F0, this.f30422g2, 24)) {
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

    public final boolean X() {
        TLRPC.User user;
        if (!W() && !this.f30488u0.f9427w && (user = this.f30417f2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i7 = this.F0;
            if (userStatus == null || userStatus.expires > 0 || !qp.s1(i7).Z.containsKey(Long.valueOf(this.f30417f2.f27105id))) {
                TLRPC.UserStatus userStatus2 = this.f30417f2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(float f10) {
        if (!id.f23157a0) {
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

    public final void a0(boolean z9, boolean z10) {
        if ((!getIsPinned() && z9) || this.f30514y3 == z9) {
            if (!getIsPinned()) {
                this.f30514y3 = false;
                return;
            }
            return;
        }
        this.f30514y3 = z9;
        float f10 = 1.0f;
        if (z10) {
            if (z9) {
                f10 = 0.0f;
            }
            this.f30508x3 = f10;
        } else {
            if (!z9) {
                f10 = 0.0f;
            }
            this.f30508x3 = f10;
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27946i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28055o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27964j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28075p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27984k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28244y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27982k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27855d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27837c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28037n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28020m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28002l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27928h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ak));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.W8));
    }

    public final void b0() {
        float f10;
        boolean z9 = iz.f23430q1;
        this.f30448m1 = z9;
        float f11 = 1.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.D1 = f10;
        this.f30392a2.f39869o = f10;
        this.f30484t1 = 0.0f;
        this.f30506x1 = false;
        if (!getIsPinned() || !this.f30514y3) {
            f11 = 0.0f;
        }
        this.f30508x3 = f11;
        this.f30502w3 = true;
        this.f30458o1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.g5 g5Var = this.f30456n4;
        if (g5Var != null && this.f30502w3) {
            g5Var.a();
        }
        org.telegram.ui.Components.g5 g5Var2 = this.o4;
        if (g5Var2 != null && this.f30502w3) {
            g5Var2.a();
        }
    }

    public final void c0(boolean z9, boolean z10) {
        fi.a3 a3Var = this.f30468q2;
        if (a3Var == null && !z9) {
            return;
        }
        if (a3Var == null) {
            fi.a3 a3Var2 = new fi.a3(this, getContext(), this.J4, 1);
            this.f30468q2 = a3Var2;
            a3Var2.b(-1, org.telegram.ui.ActionBar.k6.f27852d6, org.telegram.ui.ActionBar.k6.f27982k7);
            this.f30468q2.setDrawUnchecked(false);
            this.f30468q2.setDrawBackgroundAsArc(3);
            addView(this.f30468q2);
        }
        this.f30468q2.a(z9, z10);
        B();
    }

    public final void d0(long j3, ij ijVar, int i7, boolean z9, boolean z10) {
        int i10;
        boolean z11;
        if (this.H0 != j3) {
            this.f30509x4 = -1;
        }
        this.H0 = j3;
        this.B4 = System.currentTimeMillis();
        this.f30416f1 = ijVar;
        this.f30490u2 = z9;
        this.N0 = false;
        this.R0 = i7;
        if (ijVar != null) {
            int i11 = ijVar.f23262k.edit_date;
        }
        this.S0 = 0;
        this.T0 = false;
        if (ijVar != null) {
            i10 = ijVar.f1();
        } else {
            i10 = 0;
        }
        this.l1 = i10;
        this.U0 = 0;
        this.V0 = 0;
        this.W0 = 0;
        if (ijVar != null && ijVar.G4()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.X0 = z11;
        ij ijVar2 = this.f30416f1;
        if (ijVar2 != null) {
            this.Y0 = ijVar2.f23262k.send_state;
        }
        j0(0, z10);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.P && !this.F && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f30488u0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(TLRPC.Dialog dialog, int i7, int i10) {
        boolean z9;
        if (this.H0 != dialog.f26960id) {
            ValueAnimator valueAnimator = this.A4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.A4.cancel();
            }
            this.f30520z4 = false;
            this.f30509x4 = -1;
        }
        this.H0 = dialog.f26960id;
        this.B4 = System.currentTimeMillis();
        boolean z10 = true;
        this.N0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.K0 = dialog.community_id;
        } else {
            this.K0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.J0 = ((TLRPC.TL_dialogFolder) dialog).folder.f27007id;
            kg0 kg0Var = this.f30411e2;
            if (kg0Var != null) {
                kg0Var.H = this;
                kg0Var.i();
            }
        } else {
            this.J0 = 0;
        }
        this.f30436j1 = i7;
        if (i7 == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        Runnable runnable = this.Z4;
        if (runnable == null) {
            z10 = false;
        }
        if (z9 != z10) {
            if (!z9 && runnable != null) {
                runnable.run();
                this.Z4 = null;
            } else if (z9) {
                this.Z4 = qs.f(this.F0).h(this, qs.f25017i3, new l2(this, 0));
            }
        }
        if (this.f30483t0 == null) {
            this.f30483t0 = new ui.e(this);
        }
        this.f30440k1 = i10;
        this.l1 = 0;
        if (j0(0, false)) {
            requestLayout();
        }
        A();
        z();
        y();
        B();
    }

    public final void g0(TLRPC.TL_forumTopic tL_forumTopic, long j3, ij ijVar, boolean z9, boolean z10) {
        boolean z11;
        kg0 kg0Var;
        this.N = tL_forumTopic;
        if (tL_forumTopic != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = z11;
        if (this.H0 != j3) {
            this.f30509x4 = -1;
        }
        Drawable drawable = ijVar.f23247g2[0];
        if (drawable instanceof qg.a) {
            ((qg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.H0 = j3;
        this.B4 = System.currentTimeMillis();
        this.f30416f1 = ijVar;
        this.N0 = false;
        this.f30420g0 = z9;
        this.R0 = ijVar.f23262k.date;
        this.T0 = false;
        this.l1 = ijVar.f1();
        this.X0 = ijVar.G4();
        ij ijVar2 = this.f30416f1;
        if (ijVar2 != null) {
            this.Y0 = ijVar2.f23262k.send_state;
        }
        if (!z10) {
            this.f30509x4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f30421g1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.N;
        if (tL_forumTopic2 != null && tL_forumTopic2.f27008id == 1 && (kg0Var = this.f30411e2) != null) {
            kg0Var.H = this;
            kg0Var.i();
        }
        j0(0, z10);
    }

    public float getClipProgress() {
        return this.f30484t1;
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

    public ij getMessage() {
        return this.f30416f1;
    }

    public int getMessageId() {
        return this.l1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f30463p2;
    }

    @Override
    public float getTranslationX() {
        return this.f30500w1;
    }

    public final void h0(int i7, ij ijVar) {
        boolean z9;
        boolean z10;
        int i10;
        String str;
        float f10;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = ijVar.f23273n0;
        TLObject tLObject = ijVar.f23267l0;
        if (ijVar.z4()) {
            TL_stories.StoryItem storyItem = ijVar.f23262k.media.storyItem;
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
        if (photoSize == null || !org.telegram.messenger.z5.q(this.F0).d(ijVar)) {
            photoSize = Q;
        }
        if (Q != null) {
            if (!this.S1 && !ij.M4(ijVar.f23262k) && !ijVar.i4()) {
                z9 = false;
            } else {
                z9 = true;
            }
            this.S1 = z9;
            int i11 = this.R1;
            if (i11 < 3) {
                this.R1 = i11 + 1;
                if ((ij.M4(ijVar.f23262k) || ijVar.i4()) && !ijVar.u2()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.W1[i7] = z10;
                this.X1[i7] = ijVar.u2();
                if (ijVar.D == 1 && photoSize != null) {
                    i10 = photoSize.size;
                } else {
                    i10 = 0;
                }
                if (ijVar.u2()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.V1;
                imageReceiverArr[i7].r0(hc.f(photoSize, tLObject), str, hc.f(Q, tLObject), str, null, i10, null, ijVar, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i7];
                if (ijVar.i4()) {
                    f10 = 18.0f;
                } else {
                    f10 = 2.0f;
                }
                imageReceiver.J0(org.telegram.messenger.g0.L(f10));
                this.V = false;
            }
        }
    }

    public final void i0() {
        kg0 kg0Var = this.f30411e2;
        if (kg0Var != null) {
            if (this.P) {
                kg0Var.K = org.telegram.messenger.g0.L(24.0f);
                this.f30411e2.L = org.telegram.messenger.g0.L(24.0f);
                this.f30411e2.M = 0.0f;
            } else {
                m2 m2Var = this.f30488u0;
                RectF rectF = m2Var.F;
                RectF rectF2 = m2Var.F;
                kg0Var.K = rectF.centerY();
                this.f30411e2.L = rectF2.centerX();
                this.f30411e2.M = rectF2.width() / 2.0f;
                if (!qp.s1(this.F0).P1().h.isEmpty()) {
                    this.f30411e2.M -= org.telegram.messenger.g0.N(3.5f);
                }
                kg0 kg0Var2 = this.f30411e2;
                this.Y1.q();
                kg0Var2.getClass();
            }
            kg0 kg0Var3 = this.f30411e2;
            if (!kg0Var3.E && kg0Var3.I != null) {
                AnimatorSet animatorSet = kg0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    kg0Var3.B.cancel();
                }
                kg0Var3.E = true;
                kg0Var3.F = true;
                kg0Var3.D = 0.0f;
                kg0Var3.I.getTranslationY();
                org.telegram.messenger.g0.L(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jg0(kg0Var3, 5));
                ofFloat.setInterpolator(xq.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new jg0(kg0Var3, 6));
                xq xqVar = xq.f40369j;
                ofFloat2.setInterpolator(xqVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new jg0(kg0Var3, 7));
                ofFloat3.setInterpolator(xqVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                kg0Var3.B = animatorSet2;
                animatorSet2.addListener(new e60(kg0Var3, 11));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                kg0Var3.B.playTogether(ofFloat, animatorSet3);
                kg0Var3.B.start();
            }
        }
    }

    @Override
    public final void invalidate() {
        if (di.p9.f9525w1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f30512y1 && drawable != org.telegram.ui.ActionBar.k6.f28163u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    public final boolean j0(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.j0(int, boolean):boolean");
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.k0():void");
    }

    public final void l0(boolean z9) {
        TL_account.RequirementToContact requirementToContact;
        boolean z10;
        if (this.Z4 != null && this.f30417f2 != null) {
            requirementToContact = qp.s1(this.F0).J2(this.f30417f2.f27105id);
        } else {
            requirementToContact = null;
        }
        boolean z11 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.f30454n2 == z11 && this.f30463p2 == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.f30454n2 = z11;
        this.f30463p2 = org.telegram.messenger.m5.k(requirementToContact);
        if (!z9) {
            this.f30449m2.f(this.f30454n2, true);
            if (this.f30463p2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30459o2.f(z10, true);
        }
        invalidate();
    }

    public final void m0() {
        StaticLayout staticLayout;
        int i7;
        if (this.R1 > 0) {
            if (W()) {
                staticLayout = this.f30428h3;
            } else {
                staticLayout = this.f30412e3;
            }
            if (W()) {
                i7 = this.f30403c3;
            } else {
                i7 = this.f30398b3;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        r2[] r2VarArr = (r2[]) ((Spanned) text).getSpans(0, text.length(), r2.class);
                        boolean[] zArr = this.U1;
                        if (r2VarArr != null && r2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(r2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f30505x0 && !this.f30511y0) {
                                ceil += org.telegram.messenger.g0.L(3.0f);
                            }
                            for (int i10 = 0; i10 < this.R1; i10++) {
                                this.V1[i10].K0 = i7 + ceil + org.telegram.messenger.g0.L((this.L4 + 2) * i10);
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
        this.Y1.P();
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i7 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i7].P();
            i7++;
        }
        b0();
        this.f30450m3 = org.telegram.ui.Components.r5.update(0, this, this.f30450m3, this.f30412e3);
        this.f30455n3 = org.telegram.ui.Components.r5.update(0, this, this.f30455n3, this.f30481s3);
        this.f30460o3 = org.telegram.ui.Components.r5.update(0, this, this.f30460o3, this.f30428h3);
        this.f30464p3 = org.telegram.ui.Components.r5.update(0, this, this.f30464p3, this.f30518z2);
        org.telegram.ui.Components.g5 g5Var = this.f30456n4;
        if (g5Var != null) {
            g5Var.a();
        }
        org.telegram.ui.Components.g5 g5Var2 = this.o4;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f10;
        super.onDetachedFromWindow();
        this.f30506x1 = false;
        this.A1 = false;
        this.B1 = 0.0f;
        this.f30502w3 = false;
        if (getIsPinned() && this.f30514y3) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30508x3 = f10;
        this.Y1.R();
        int i7 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i7 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i7].R();
            i7++;
        }
        zg0 zg0Var = this.f30512y1;
        if (zg0Var != null) {
            zg0Var.stop();
            this.f30512y1.T(true, 0.0f);
            this.f30512y1.setCallback(null);
            this.f30512y1 = null;
            this.f30517z1 = false;
        }
        jg.k kVar = this.f30482s4;
        if (kVar != null) {
            kVar.d.remove(Long.valueOf(this.H0));
        }
        org.telegram.ui.Components.g5 g5Var = this.f30456n4;
        if (g5Var != null) {
            g5Var.b();
        }
        org.telegram.ui.Components.g5 g5Var2 = this.o4;
        if (g5Var2 != null) {
            g5Var2.b();
        }
        org.telegram.ui.Components.r5.release(this, this.f30450m3);
        org.telegram.ui.Components.r5.release(this, this.f30455n3);
        org.telegram.ui.Components.r5.release(this, this.f30460o3);
        org.telegram.ui.Components.r5.release(this, this.f30464p3);
        this.f30488u0.g();
        this.f30400c0 = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        kg0 kg0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (V() && (kg0Var = this.f30411e2) != null && iz.f23430q1 && kg0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!V() && this.D4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296262, id.M0(2131754940, null)));
            }
        }
        fi.a3 a3Var = this.f30468q2;
        if (a3Var != null && a3Var.f40008a.f31263q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30430i0 == 0.0f && !this.P && !this.F && this.f30488u0.a(this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int L;
        int i15;
        if (this.H0 != 0 || this.G0 != null) {
            ec ecVar = this.f30451m4;
            if (ecVar != null) {
                ecVar.layout(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f30468q2 != null) {
                int i16 = this.I;
                boolean z10 = this.f30474r2;
                if (!z10 && !iz.f23427p1) {
                    i13 = 27;
                } else {
                    i13 = 29;
                }
                int L2 = org.telegram.messenger.g0.L(i16 - i13);
                if (this.f30439k0) {
                    i15 = org.telegram.messenger.g0.L(8.0f);
                    L = (getMeasuredHeight() - this.f30468q2.getMeasuredHeight()) >> 1;
                } else {
                    if (id.f23157a0) {
                        L2 = (i11 - i7) - L2;
                    }
                    float f10 = this.U;
                    if (!z10 && !iz.f23427p1) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    int i17 = L2;
                    L = org.telegram.messenger.g0.L(f10 + i14);
                    i15 = i17;
                }
                fi.a3 a3Var = this.f30468q2;
                a3Var.layout(i15, L, a3Var.getMeasuredWidth() + i15, this.f30468q2.getMeasuredHeight() + L);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.K4 && !this.A0) {
                return;
            }
            this.A0 = false;
            this.K4 = measuredWidth;
            try {
                x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        ec ecVar = this.f30451m4;
        if (ecVar != null) {
            ecVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        }
        fi.a3 a3Var = this.f30468q2;
        if (a3Var != null) {
            a3Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        if (this.P) {
            int size = View.MeasureSpec.getSize(i7);
            boolean z9 = this.f30474r2;
            if (!z9 && !iz.f23427p1) {
                i11 = this.J;
            } else {
                i11 = this.K;
            }
            if (S() && ((!z9 && !iz.f23427p1) || W())) {
                if (W()) {
                    i12 = this.M;
                } else {
                    i12 = this.L;
                }
            } else {
                i12 = 0;
            }
            setMeasuredDimension(size, org.telegram.messenger.g0.L(i11 + i12) + (this.f30480s2 ? 1 : 0));
            this.Q = false;
            if (this.P && !S()) {
                x();
                if (this.R) {
                    this.Q = true;
                    x();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), D());
        this.f30489u1 = 0;
        this.f30494v1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        ij captionMessage;
        TLRPC.User a22;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.L0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.J0 == 1) {
            org.telegram.messenger.camera.q.q(null, 2131754136, sb2, ". ");
        } else {
            if (this.f30427h2 != null) {
                org.telegram.messenger.camera.q.q(null, 2131754777, sb2, ". ");
            }
            if (this.P && this.N != null) {
                org.telegram.messenger.camera.q.q(null, 2131754746, sb2, ". ");
                sb2.append(this.N.title);
                sb2.append(". ");
            } else {
                TLRPC.User user = this.f30417f2;
                if (user != null) {
                    if (t10.z(user)) {
                        sb2.append(id.M0(2131746267, null));
                    } else if (t10.s(this.f30417f2)) {
                        sb2.append(id.M0(2131754252, null));
                    } else {
                        if (this.f30417f2.bot) {
                            org.telegram.messenger.camera.q.q(null, 2131753156, sb2, ". ");
                        }
                        TLRPC.User user2 = this.f30417f2;
                        if (user2.self) {
                            sb2.append(id.M0(2131745904, null));
                        } else {
                            sb2.append(org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f30422g2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(id.M0(2131754904, null));
                        } else {
                            sb2.append(id.M0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.f30422g2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f30438j4) {
            org.telegram.messenger.camera.q.q(null, 2131754739, sb2, ". ");
        }
        if (this.Z0) {
            org.telegram.messenger.camera.q.q(null, 2131754829, sb2, ". ");
        }
        if (X()) {
            org.telegram.messenger.camera.q.q(null, 2131754741, sb2, ". ");
        }
        int i7 = this.S0;
        if (i7 > 0) {
            sb2.append(id.G(i7, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i10 = this.U0;
        if (i10 > 0) {
            sb2.append(id.G(i10, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.V0 > 0) {
            org.telegram.messenger.camera.q.q(null, 2131754841, sb2, ". ");
        }
        ij ijVar = this.f30416f1;
        if (ijVar != null && this.J0 == 0) {
            int i11 = this.R0;
            if (i11 == 0) {
                i11 = ijVar.f23262k.date;
            }
            String s5 = id.s(i11, true);
            if (this.f30416f1.O3()) {
                sb2.append(id.a0("AccDescrSentDate", null, 2131754765, s5));
            } else {
                sb2.append(id.a0("AccDescrReceivedDate", null, 2131754789, s5));
            }
            sb2.append(". ");
            if (this.f30422g2 != null && !this.f30416f1.O3() && this.f30416f1.q3() && this.f30416f1.f23262k.action == null && (a22 = qp.s1(this.F0).a2(Long.valueOf(this.f30416f1.f23262k.from_id.user_id))) != null) {
                sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                sb2.append(". ");
            }
            if (this.f30427h2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f30416f1.v);
                if (!this.f30416f1.G3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.f23318z)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.f23318z);
                }
                StaticLayout staticLayout = this.f30412e3;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        ww wwVar;
        if (i7 == 2131296262 && (wwVar = this.D4) != null) {
            wwVar.T4(this);
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

    public void setArchivedPullAnimation(kg0 kg0Var) {
        this.f30411e2 = kg0Var;
    }

    public void setBottomClip(int i7) {
        this.f30494v1 = i7;
    }

    public void setClipProgress(float f10) {
        this.f30484t1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j3) {
        this.H0 = j3;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.I0, str)) {
            this.I0 = str;
            x();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.I0 = str;
    }

    public void setDialog(o2 o2Var) {
        this.G0 = o2Var;
        this.l1 = 0;
        j0(0, true);
        A();
        z();
        y();
        B();
    }

    public void setDialogCellDelegate(p2 p2Var) {
        this.f30405d0 = p2Var;
    }

    public void setDialogSelected(boolean z9) {
        if (this.f30470q4 != z9) {
            invalidate();
        }
        this.f30470q4 = z9;
    }

    public void setIsTransitionSupport(boolean z9) {
        this.f30435j0 = z9;
    }

    public void setMoving(boolean z9) {
        this.f30471r = z9;
    }

    public void setOpenBotButton(boolean z9) {
        if (this.E1 == z9) {
            return;
        }
        if (this.I1 == null) {
            this.I1 = new my0(id.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.E1 = z9;
        this.F1.c(false);
    }

    public void setPinForced(boolean z9) {
        this.B3 = z9;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            x();
        }
        invalidate();
    }

    public void setPreloader(jg.k kVar) {
        this.f30482s4 = kVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.f30430i0 != f10) {
            this.f30430i0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z9) {
        this.f30506x1 = z9;
    }

    public void setTitleOverride(String str) {
        this.L0 = str;
    }

    public void setTopClip(int i7) {
        this.f30489u1 = i7;
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 == this.f30500w1) {
            return;
        }
        this.f30500w1 = f10;
        zg0 zg0Var = this.f30512y1;
        boolean z9 = true;
        if (zg0Var != null && f10 == 0.0f) {
            zg0Var.T(true, 0.0f);
            this.f30517z1 = false;
            this.f30448m1 = iz.f23430q1;
            this.B1 = 0.0f;
            this.f30506x1 = false;
        }
        float f11 = this.f30500w1;
        if (f11 != 0.0f) {
            this.f30506x1 = true;
        } else {
            this.C1 = 0.0f;
            this.B1 = 0.0f;
            this.A1 = false;
        }
        if (this.f30506x1 && !this.f30504x) {
            boolean z10 = this.A1;
            if (Math.abs(f11) < getMeasuredWidth() * 0.45f) {
                z9 = false;
            }
            this.A1 = z9;
            if (z10 != z9 && this.f30448m1 == iz.f23430q1) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
        }
        invalidate();
    }

    public void setVisible(boolean z9) {
        if (this.f30516z0 != z9) {
            this.f30516z0 = z9;
            if (z9) {
                invalidate();
            }
        }
    }

    @Override
    public void updateColors() {
        try {
            if (isAttachedToWindow()) {
                if (this.H0 != 0 || this.G0 != null) {
                    j0(0, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final CharSequence w(CharSequence charSequence) {
        if (this.R1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new r2(org.telegram.messenger.g0.L(((this.L4 + 2) * this.R1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void x() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.x():void");
    }

    public final void y() {
        TLRPC.Message message;
        ij ijVar = this.f30416f1;
        if (ijVar != null && (message = ijVar.f23262k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.X0) {
                org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.F0);
                long j3 = this.H0;
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                f10.s(j3, ig.b.c(chatTheme), chatTheme, false);
            }
        }
    }

    public final void z() {
        boolean z9;
        float f10;
        TLRPC.Chat chat = this.f30422g2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f30495v2 = z9;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30467q1 = f10;
    }

    public t2(ww wwVar, Context context, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = true;
        this.f30510y = true;
        int i10 = 0;
        this.D = false;
        this.H = 11;
        this.I = 72;
        this.J = 70;
        this.K = 76;
        this.L = 3;
        this.M = 11;
        this.U = 42.0f;
        m2 m2Var = new m2(this);
        this.f30488u0 = m2Var;
        this.f30516z0 = true;
        this.C0 = 0.0f;
        this.f30406d1 = false;
        this.f30410e1 = false;
        this.F1 = new ic(this);
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.L1 = false;
        this.U1 = new boolean[3];
        this.V1 = new ImageReceiver[3];
        this.W1 = new boolean[3];
        this.X1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Y1 = imageReceiver;
        this.f30392a2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.d2 = new sd(2);
        xq xqVar = xq.h;
        this.f30449m2 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.f30459o2 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.f30433i3 = new Stack();
        this.j3 = new ArrayList();
        this.f30442k3 = new Stack();
        this.f30446l3 = new ArrayList();
        this.L3 = true;
        this.S3 = new te.a(this, xqVar, 320L);
        this.V3 = 1.0f;
        this.W3 = 1.0f;
        this.f30476r4 = new RectF();
        this.f30509x4 = -1;
        this.H4 = -1;
        this.I4 = new q2(this);
        m2Var.I = true;
        this.J4 = f6Var;
        this.D4 = wwVar;
        org.telegram.ui.ActionBar.k6.T(context);
        this.D = false;
        this.E = false;
        imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.V1;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.V1[i10];
                imageReceiver2.f21232y = true;
                imageReceiver2.J0(org.telegram.messenger.g0.L(2.0f));
                this.V1[i10].f21236z1 = true;
                i10++;
            } else {
                this.f30474r2 = z9;
                this.F0 = i7;
                ec ecVar = new ec(12, context, this);
                this.f30451m4 = ecVar;
                addView(ecVar);
                this.f30456n4 = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(22.0f), ecVar);
                this.o4 = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(17.0f), this);
                this.Y1.f21236z1 = true;
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (di.p9.f9525w1) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
