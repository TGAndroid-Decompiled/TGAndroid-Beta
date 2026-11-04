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
import b8.kf;
import ci.wb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.uw;
public class t2 extends z implements ei.f7, org.telegram.ui.ActionBar.z5 {
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
    public jh.c E0;
    public float E1;
    public boolean E2;
    public int E3;
    public final uw E4;
    public boolean F;
    public int F0;
    public boolean F1;
    public Paint F2;
    public int F3;
    public StaticLayout F4;
    public boolean G;
    public final int G0;
    public final gc G1;
    public Paint G2;
    public float G3;
    public int G4;
    public b7 H;
    public o2 H0;
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
    public ly0 J1;
    public int J2;
    public int J3;
    public final q2 J4;
    public int K;
    public int K0;
    public boolean K1;
    public int K2;
    public LayerDrawable K3;
    public final org.telegram.ui.ActionBar.e6 K4;
    public int L;
    public long L0;
    public gi.j8 L1;
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
    public s2 O4;
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
    public ch0 R1;
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
    public final qe.a T3;
    public vg.x0 T4;
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
    public boolean f30465a0;
    public boolean f30466a1;
    public wc0 f30467a2;
    public int f30468a3;
    public StaticLayout f30469a4;
    public Runnable f30470a5;
    public TextPaint f30471b0;
    public boolean f30472b1;
    public final org.telegram.ui.Components.u8 f30473b2;
    public int f30474b3;
    public StaticLayout f30475b4;
    public Paint f30476c0;
    public boolean f30477c1;
    public boolean c2;
    public int f30478c3;
    public boolean f30479c4;
    public nc f30480d0;
    public float f30481d1;
    public float f30482d2;
    public int f30483d3;
    public boolean f30484d4;
    public p2 f30485e0;
    public boolean f30486e1;
    public final b5.c f30487e2;
    public int f30488e3;
    public boolean f30489e4;
    public boolean f30490f;
    public boolean f30491f0;
    public boolean f30492f1;
    public ng0 f30493f2;
    public StaticLayout f30494f3;
    public int f30495f4;
    public boolean f30496g0;
    public zi f30497g1;
    public TLRPC.User f30498g2;
    public StaticLayout f30499g3;
    public int f30500g4;
    public final boolean h;
    public boolean f30501h0;
    public ArrayList f30502h1;
    public TLRPC.Chat f30503h2;
    public int f30504h3;
    public int f30505h4;
    public Drawable[] f30506i0;
    public boolean f30507i1;
    public TLRPC.EncryptedChat f30508i2;
    public StaticLayout i3;
    public int f30509i4;
    public float f30510j0;
    public CharSequence f30511j1;
    public CharSequence f30512j2;
    public final Stack f30513j3;
    public StaticLayout f30514j4;
    public boolean f30515k0;
    public int k1;
    public int f30516k2;
    public final ArrayList f30517k3;
    public boolean f30518k4;
    public boolean f30519l0;
    public int f30520l1;
    public boolean f30521l2;
    public final Stack f30522l3;
    public boolean f30523l4;
    public int m0;
    public int m1;
    public TLRPC.DraftMessage f30524m2;
    public final ArrayList f30525m3;
    public boolean f30526m4;
    public float f30527n;
    public float f30528n0;
    public boolean f30529n1;
    public final org.telegram.ui.Components.u5 f30530n2;
    public org.telegram.ui.Components.l5 f30531n3;
    public final ai.x2 n4;
    public zz0 f30532o0;
    public boolean f30533o1;
    public boolean f30534o2;
    public org.telegram.ui.Components.l5 f30535o3;
    public final org.telegram.ui.Components.e5 f30536o4;
    public Paint f30537p0;
    public float f30538p1;
    public final org.telegram.ui.Components.u5 f30539p2;
    public org.telegram.ui.Components.l5 f30540p3;
    public final org.telegram.ui.Components.e5 f30541p4;
    public Paint f30542q0;
    public float f30543q1;
    public long f30544q2;
    public org.telegram.ui.Components.l5 f30545q3;
    public int f30546q4;
    public boolean f30547r;
    public boolean f30548r0;
    public float f30549r1;
    public gi.y2 f30550r2;
    public int f30551r3;
    public boolean f30552r4;
    public ch0 f30553s;
    public boolean f30554s0;
    public float f30555s1;
    public final boolean f30556s2;
    public int f30557s3;
    public final RectF f30558s4;
    public boolean f30559t0;
    public int f30560t1;
    public boolean f30561t2;
    public StaticLayout f30562t3;
    public kg.j f30563t4;
    public ui.f f30564u0;
    public float f30565u1;
    public boolean f30566u2;
    public boolean f30567u3;
    public Path f30568u4;
    public final m2 f30569v0;
    public int f30570v1;
    public boolean f30571v2;
    public int f30572v3;
    public RectF f30573v4;
    public int f30574w;
    public Path f30575w0;
    public int f30576w1;
    public boolean f30577w2;
    public int f30578w3;
    public int f30579w4;
    public boolean f30580x;
    public yh.f f30581x0;
    public float f30582x1;
    public boolean f30583x2;
    public boolean f30584x3;
    public int f30585x4;
    public boolean f30586y;
    public boolean f30587y0;
    public boolean f30588y1;
    public int f30589y2;
    public float f30590y3;
    public int f30591y4;
    public boolean f30592z0;
    public ch0 f30593z1;
    public int f30594z2;
    public boolean f30595z3;
    public float f30596z4;

    public t2(Context context, boolean z10) {
        this(null, context, z10, h10.f22829t0, null);
    }

    public static SpannableStringBuilder O(int i3, CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
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

    private zi getCaptionMessage() {
        CharSequence charSequence;
        if (this.f30502h1 == null) {
            zi ziVar = this.f30497g1;
            if (ziVar == null || ziVar.f26924z == null) {
                return null;
            }
            return ziVar;
        }
        int i3 = 0;
        zi ziVar2 = null;
        for (int i10 = 0; i10 < this.f30502h1.size(); i10++) {
            zi ziVar3 = (zi) this.f30502h1.get(i10);
            if (ziVar3 != null && (charSequence = ziVar3.f26924z) != null) {
                if (!TextUtils.isEmpty(charSequence)) {
                    i3++;
                }
                ziVar2 = ziVar3;
            }
        }
        if (i3 > 1) {
            return null;
        }
        return ziVar2;
    }

    private int getCollapsedHeight() {
        int i3;
        int i10;
        boolean z10 = this.f30556s2;
        if (!z10 && !az.f21654p1) {
            i3 = this.K;
        } else {
            i3 = this.L;
        }
        int L = org.telegram.messenger.g0.L(i3) + 1;
        if (this.R) {
            L += org.telegram.messenger.g0.L(20.0f);
        }
        if (S() && ((!z10 && !az.f21654p1) || W())) {
            if (W()) {
                i10 = this.N;
            } else {
                i10 = this.M;
            }
            return org.telegram.messenger.g0.L(i10) + L;
        }
        return L;
    }

    private Paint getPaintReorderGradient() {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.K4);
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
            if (T()) {
                return org.telegram.ui.ActionBar.k6.J0;
            }
            return org.telegram.ui.ActionBar.k6.K0;
        }
        return org.telegram.ui.ActionBar.k6.I0;
    }

    public int getTopicId() {
        TLRPC.TL_forumTopic tL_forumTopic = this.O;
        if (tL_forumTopic == null) {
            return 0;
        }
        return tL_forumTopic.f27053id;
    }

    public final void A() {
        float f10;
        TLRPC.User a22;
        if (this.f30498g2 != null && (a22 = hp.s1(this.G0).a2(Long.valueOf(this.f30498g2.f27150id))) != null) {
            this.f30498g2 = a22;
        }
        if (X()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30543q1 = f10;
    }

    public final void B() {
        boolean z10;
        float f10;
        gi.y2 y2Var;
        if (this.m0 > 0 && !this.f30577w2 && !X() && (((y2Var = this.f30550r2) == null || !y2Var.f40035a.f31334q) && !this.f30569v0.f10715w)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30583x2 = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30528n0 = f10;
    }

    public final int E() {
        float f10;
        if (W() && !this.f30515k0 && !this.f30490f) {
            if (!this.f30556s2 && !az.f21654p1) {
                f10 = 91.0f;
            } else {
                f10 = 86.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (this.f30561t2) {
                L++;
            }
            if (S()) {
                return org.telegram.messenger.g0.L(this.N) + L;
            }
            return L;
        }
        return getCollapsedHeight();
    }

    public final void G(int i3, int i10) {
        this.f30596z4 = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B4 = ofFloat;
        ofFloat.setDuration(220L);
        this.B4.setInterpolator(xq.f40452f);
        this.f30585x4 = i3;
        this.f30579w4 = i10;
        this.B4.addUpdateListener(new j2(this, 2));
        this.B4.addListener(new n2(this, 2));
        this.A4 = true;
        this.B4.start();
    }

    public final boolean H(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.H(android.graphics.Canvas):boolean");
    }

    public final void I(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13, float f10) {
        int i3 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i3 != 0 || z13) {
            float f11 = (f10 * 0.5f) + 0.5f;
            if (z10) {
                z.s(this.W2, this.X2, org.telegram.ui.ActionBar.k6.X0);
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
            } else if (z12) {
                if (z11) {
                    z.s(this.Y2, this.X2, org.telegram.ui.ActionBar.k6.W0);
                    if (z13) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                        org.telegram.ui.ActionBar.k6.W0.setAlpha((int) (f10 * 255.0f));
                    }
                    if (!z13 && i3 != 0) {
                        canvas.save();
                        canvas.scale(f11, f11, org.telegram.ui.ActionBar.k6.W0.getBounds().centerX(), org.telegram.ui.ActionBar.k6.W0.getBounds().centerY());
                        int i11 = (int) (255.0f * f10);
                        org.telegram.ui.ActionBar.k6.W0.setAlpha(i11);
                        org.telegram.ui.ActionBar.k6.V0.setAlpha(i11);
                    }
                    org.telegram.ui.ActionBar.k6.W0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        canvas.save();
                        canvas.translate((1.0f - f10) * org.telegram.messenger.g0.L(4.0f), 0.0f);
                    }
                    z.s(this.U2, this.X2, org.telegram.ui.ActionBar.k6.V0);
                    org.telegram.ui.ActionBar.k6.V0.draw(canvas);
                    if (z13) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.k6.W0.setAlpha(255);
                    }
                    if (!z13 && i3 != 0) {
                        canvas.restore();
                        org.telegram.ui.ActionBar.k6.W0.setAlpha(255);
                        org.telegram.ui.ActionBar.k6.V0.setAlpha(255);
                        return;
                    }
                    return;
                }
                z.s(this.V2, this.X2, org.telegram.ui.ActionBar.k6.T0);
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

    public final void J(Canvas canvas, boolean z10, int i3, int i10, int i11, float f10, boolean z11) {
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
        if (!W() && !V()) {
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
                this.U.setColor(i0.a.f(Color.alpha(x02) / 255.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false), i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28161s9, false), 255)));
            } else {
                f12 = 1.0f;
            }
            if (this.Q && this.O.read_inbox_max_id == 0) {
                if (this.T == null) {
                    this.T = new Paint();
                }
                paint = this.T;
                if (z10) {
                    i14 = org.telegram.ui.ActionBar.k6.Sk;
                } else {
                    i14 = org.telegram.ui.ActionBar.k6.Rk;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(i14, this.K4);
                paint.setColor(w02);
                org.telegram.ui.ActionBar.k6.M0.setColor(w02);
                if (z10) {
                    i15 = 30;
                } else {
                    i15 = 40;
                }
                i16 = i15;
                z13 = true;
            } else {
                if (!z10 && this.K0 == 0) {
                    paint = org.telegram.ui.ActionBar.k6.f28228w0;
                } else {
                    paint = org.telegram.ui.ActionBar.k6.f28267y0;
                }
                z13 = false;
            }
            StaticLayout staticLayout = this.Z3;
            RectF rectF3 = this.f30558s4;
            if (staticLayout != null && this.T0 != 0) {
                paint.setAlpha((int) ((f12 - this.f30590y3) * i16));
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f12 - this.f30590y3) * 255.0f));
                float f14 = f11 * 2.0f;
                if (f14 > f12) {
                    f13 = f12;
                } else {
                    f13 = f14;
                }
                float f15 = f12 - f13;
                float f16 = (i11 * f15) + (i10 * f13);
                float f17 = i3;
                rectF3.set(f16, f17, (this.Q3 * f15) + (this.P3 * f13) + f16 + org.telegram.messenger.g0.L(12.666f), org.telegram.messenger.g0.L(20.666f) + i3);
                if (f11 <= 0.5f) {
                    interpolation = xq.f40453g.getInterpolation(f14);
                } else {
                    interpolation = xq.f40454i.getInterpolation(f12 - ((f11 - 0.5f) * 2.0f));
                }
                float f18 = (interpolation * 0.1f) + f12;
                canvas.save();
                float f19 = f18 * f10;
                canvas.scale(f19, f19, rectF3.centerX(), rectF3.centerY());
                if (z12) {
                    if (this.f30568u4 == null || (rectF2 = this.f30573v4) == null || !rectF2.equals(rectF3)) {
                        RectF rectF4 = this.f30573v4;
                        if (rectF4 == null) {
                            this.f30573v4 = new RectF(rectF3);
                        } else {
                            rectF4.set(rectF3);
                        }
                        if (this.f30568u4 == null) {
                            this.f30568u4 = new Path();
                        }
                        kf.a(this.f30568u4, this.f30573v4, org.telegram.messenger.g0.L(10.33f));
                    }
                    canvas.drawPath(this.f30568u4, paint);
                    if (z11) {
                        canvas.drawPath(this.f30568u4, this.U);
                    }
                } else {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), paint);
                    if (z11) {
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(11.5f), org.telegram.messenger.g0.L(11.5f), this.U);
                    }
                }
                if (this.f30469a4 != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.N(6.333f) + f16, org.telegram.messenger.g0.N(3.0f) + f17);
                    this.f30469a4.draw(canvas);
                    canvas.restore();
                }
                int alpha = org.telegram.ui.ActionBar.k6.M0.getAlpha();
                float f20 = alpha;
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f13));
                if (this.f30475b4 != null) {
                    canvas.save();
                    float N = org.telegram.messenger.g0.N(6.333f) + f16;
                    if (this.S3) {
                        i13 = org.telegram.messenger.g0.L(17.0f);
                    } else {
                        i13 = -org.telegram.messenger.g0.L(17.0f);
                    }
                    canvas.translate(N, org.telegram.messenger.g0.N(3.0f) + (i13 * f15) + f17);
                    this.f30475b4.draw(canvas);
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
                    org.telegram.ui.ActionBar.k6.M0.setAlpha((int) (f20 * f15));
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
                org.telegram.ui.ActionBar.k6.M0.setAlpha(alpha);
                canvas.restore();
            } else {
                if (this.T0 != 0) {
                    staticLayout = this.Y3;
                }
                paint.setAlpha((int) ((f12 - this.f30590y3) * i16));
                org.telegram.ui.ActionBar.k6.M0.setAlpha((int) ((f12 - this.f30590y3) * 255.0f));
                float f21 = i3;
                rectF3.set(i10, f21, org.telegram.messenger.g0.L(12.666f) + this.P3 + i10, org.telegram.messenger.g0.L(20.666f) + i3);
                int save = canvas.save();
                if (f10 != f12) {
                    canvas.scale(f10, f10, rectF3.centerX(), rectF3.centerY());
                }
                if (f11 != f12) {
                    canvas.scale(f11, f11, rectF3.centerX(), rectF3.centerY());
                }
                if (z12) {
                    if (this.f30568u4 == null || (rectF = this.f30573v4) == null || !rectF.equals(rectF3)) {
                        RectF rectF5 = this.f30573v4;
                        if (rectF5 == null) {
                            this.f30573v4 = new RectF(rectF3);
                        } else {
                            rectF5.set(rectF3);
                        }
                        if (this.f30568u4 == null) {
                            this.f30568u4 = new Path();
                        }
                        kf.a(this.f30568u4, this.f30573v4, org.telegram.messenger.g0.L(10.33f));
                    }
                    canvas.drawPath(this.f30568u4, paint);
                    if (z11) {
                        canvas.drawPath(this.f30568u4, this.U);
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
                org.telegram.ui.ActionBar.k6.M0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.W8, false));
            }
        }
    }

    public boolean K() {
        return false;
    }

    public final java.lang.CharSequence L() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.L():java.lang.CharSequence");
    }

    public final java.lang.CharSequence N() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.N():java.lang.CharSequence");
    }

    public final CharSequence P() {
        if (this.O4 == null) {
            this.O4 = new s2(this);
        }
        s2.a(this.O4, this.G0, this.f30497g1, this.f30503h2);
        this.O4.getClass();
        s2 s2Var = this.O4;
        this.N4 = s2Var.f30331c;
        this.f30496g0 = s2Var.d;
        return s2Var.f30334g;
    }

    public final ColorFilter Q(int i3, int i10) {
        if (this.Y4 == null) {
            this.Z4 = new int[4];
            this.Y4 = new ColorFilter[4];
        }
        if (i10 != this.Z4[i3] || this.Y4[i3] == null) {
            ColorFilter[] colorFilterArr = this.Y4;
            this.Z4[i3] = i10;
            colorFilterArr[i3] = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.Y4[i3];
    }

    public final SpannableStringBuilder R(int i3, CharSequence charSequence, String str, boolean z10) {
        CharSequence charSequence2;
        CharSequence N2;
        TLRPC.Message message;
        CharSequence charSequence3;
        int size;
        String G;
        int size2;
        String M0;
        boolean z11;
        CharSequence charSequence4;
        String str2;
        SpannableStringBuilder valueOf;
        zi captionMessage = getCaptionMessage();
        zi ziVar = this.f30497g1;
        Paint.FontMetricsInt fontMetricsInt = null;
        if (ziVar != null) {
            charSequence2 = ziVar.v;
        } else {
            charSequence2 = null;
        }
        this.f30491f0 = true;
        if (!TextUtils.isEmpty(str)) {
            return O(i3, str, charSequence);
        }
        zi ziVar2 = this.f30497g1;
        TLRPC.Message message2 = ziVar2.f26868k;
        int i10 = 0;
        if (message2 instanceof TLRPC.TL_messageService) {
            CharSequence charSequence5 = ziVar2.f26912w;
            if (charSequence5 == null || ((message2.action instanceof TLRPC.TL_messageActionTopicCreate) && this.Q)) {
                charSequence5 = ziVar2.v;
            }
            if (zi.F4(ziVar2)) {
                valueOf = O(i3, charSequence5, charSequence);
                if (this.f30497g1.f26853g2[0] instanceof rg.a) {
                    int i11 = this.G0;
                    TLRPC.TL_forumTopic f10 = hp.s1(i11).f23102q7.f(-zi.B0(this.f30497g1.f26868k), zi.c2(i11, this.f30497g1.f26868k, true, false));
                    if (f10 != null) {
                        ((rg.a) this.f30497g1.f26853g2[0]).b(f10.icon_color);
                    }
                }
            } else {
                this.f30491f0 = false;
                valueOf = SpannableStringBuilder.valueOf(charSequence5);
            }
            if (z10) {
                w(valueOf);
            }
            return valueOf;
        } else if (captionMessage != null && (charSequence4 = captionMessage.f26924z) != null) {
            String charSequence6 = charSequence4.toString();
            if (!this.W) {
                str2 = "";
            } else if (zi.M4(captionMessage.f26868k)) {
                str2 = "📹 ";
            } else if (zi.S4(captionMessage.f26868k)) {
                str2 = "🎤 ";
            } else if (captionMessage.J3()) {
                str2 = "🎧 ";
            } else if (zi.T3(captionMessage.f26868k)) {
                str2 = "🖼 ";
            } else {
                str2 = "📎 ";
            }
            if (captionMessage.s2() && !TextUtils.isEmpty(captionMessage.f26868k.message)) {
                CharSequence charSequence7 = captionMessage.f26825a2;
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 47);
                if (this.f30465a0) {
                    if (!TextUtils.isEmpty(charSequence)) {
                        measuredWidth = (int) (measuredWidth - this.f30471b0.measureText(charSequence.toString()));
                    }
                    measuredWidth = (int) (measuredWidth - this.f30471b0.measureText(": "));
                }
                if (measuredWidth > 0 && captionMessage.Z1) {
                    charSequence7 = org.telegram.messenger.g0.Q(charSequence7, (String) captionMessage.Y1.get(0), measuredWidth, this.f30471b0);
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
            li.g(captionMessage.f26868k.entities, charSequence8, spannableString, 264);
            TLRPC.Message message3 = captionMessage.f26868k;
            if (message3 != null) {
                ArrayList<TLRPC.MessageEntity> arrayList = message3.entities;
                TextPaint textPaint = this.f30471b0;
                if (textPaint != null) {
                    fontMetricsInt = textPaint.getFontMetricsInt();
                }
                li.a(fontMetricsInt, spannableString, arrayList);
            }
            CharSequence append = new SpannableStringBuilder(str2).append(org.telegram.messenger.g0.N2(spannableString));
            if (z10) {
                append = w(append);
            }
            return O(i3, append, charSequence);
        } else {
            TL_iv.RichMessage richMessage = message2.rich_message;
            org.telegram.ui.ActionBar.e6 e6Var = this.K4;
            if (richMessage != null) {
                if (richMessage.blocks.size() == 1) {
                    z11 = zi.P2(this.f30497g1.f26868k.rich_message.blocks.get(0));
                } else {
                    z11 = false;
                }
                SpannableStringBuilder O = O(i3, this.f30497g1.v, charSequence);
                if (z11 && !W()) {
                    try {
                        tz tzVar = new tz(org.telegram.ui.ActionBar.k6.f28104p9, e6Var);
                        if (this.f30465a0) {
                            i10 = charSequence.length() + 2;
                        }
                        O.setSpan(tzVar, i10, O.length(), 33);
                        return O;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                return O;
            } else if (message2.media != null && !ziVar2.G3()) {
                this.f30471b0 = org.telegram.ui.ActionBar.k6.H0[this.F0];
                int i12 = org.telegram.ui.ActionBar.k6.f28084o9;
                zi ziVar3 = this.f30497g1;
                TLRPC.MessageMedia messageMedia = ziVar3.f26868k.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaPoll.poll.question;
                    if (tL_textWithEntities != null && tL_textWithEntities.entities != null) {
                        SpannableString spannableString2 = new SpannableString(tL_messageMediaPoll.poll.question.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageMediaPoll.poll.question;
                        li.g(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableString2, -1);
                        li.a(org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), spannableString2, tL_messageMediaPoll.poll.question.entities);
                        charSequence3 = ph.a.a(2131231053, spannableString2, true);
                    } else {
                        charSequence3 = ph.a.a(2131231053, tL_textWithEntities.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                    TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageMediaToDo.todo.title;
                    if (tL_textWithEntities3 != null && tL_textWithEntities3.entities != null) {
                        SpannableString spannableString3 = new SpannableString(tL_messageMediaToDo.todo.title.text.replace('\n', ' '));
                        TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_messageMediaToDo.todo.title;
                        li.g(tL_textWithEntities4.entities, tL_textWithEntities4.text, spannableString3, -1);
                        li.a(org.telegram.ui.ActionBar.k6.F0[this.F0].getFontMetricsInt(), spannableString3, tL_messageMediaToDo.todo.title.entities);
                        charSequence3 = ph.a.a(2131231047, spannableString3, true);
                    } else {
                        charSequence3 = ph.a.a(2131231047, tL_textWithEntities3.text, true);
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                    charSequence3 = ph.a.a(2131231048, messageMedia.game.title, true);
                } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                    charSequence3 = messageMedia.title;
                } else if (ziVar3.D == 14) {
                    charSequence3 = f1.q("🎧 \u2068", ziVar3.x1(true), " - ", this.f30497g1.z1(true), "\u2069");
                } else if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
                    int size3 = ((TLRPC.TL_messageMediaPaidMedia) messageMedia).extended_media.size();
                    if (this.T1) {
                        if (size3 > 1) {
                            M0 = bd.G(size3, "Media", new Object[0]);
                        } else {
                            M0 = bd.M0(2131753933, null);
                        }
                    } else if (size3 > 1) {
                        M0 = bd.G(size3, "Photos", new Object[0]);
                    } else {
                        M0 = bd.M0(2131753948, null);
                    }
                    charSequence3 = wb.T0(bd.a0(null, null, 2131753949, M0));
                    i12 = org.telegram.ui.ActionBar.k6.f28104p9;
                } else if (this.S1 > 1) {
                    if (this.T1) {
                        ArrayList arrayList2 = this.f30502h1;
                        if (arrayList2 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList2.size();
                        }
                        G = bd.G(size2, "Media", new Object[0]);
                    } else {
                        ArrayList arrayList3 = this.f30502h1;
                        if (arrayList3 == null) {
                            size = 0;
                        } else {
                            size = arrayList3.size();
                        }
                        G = bd.G(size, "Photos", new Object[0]);
                    }
                    charSequence3 = G;
                    i12 = org.telegram.ui.ActionBar.k6.f28104p9;
                } else {
                    charSequence3 = charSequence2.toString();
                    i12 = org.telegram.ui.ActionBar.k6.f28104p9;
                }
                if (charSequence3 instanceof String) {
                    charSequence3 = ((String) charSequence3).replace('\n', ' ');
                }
                if (z10) {
                    charSequence3 = w(charSequence3);
                }
                SpannableStringBuilder O2 = O(i3, charSequence3, charSequence);
                if (!W()) {
                    try {
                        tz tzVar2 = new tz(i12, e6Var);
                        if (this.f30465a0) {
                            i10 = charSequence.length() + 2;
                        }
                        O2.setSpan(tzVar2, i10, O2.length(), 33);
                        return O2;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                return O2;
            } else {
                zi ziVar4 = this.f30497g1;
                String str3 = ziVar4.f26868k.message;
                if (str3 != null) {
                    if (ziVar4.s2()) {
                        CharSequence charSequence9 = this.f30497g1.f26825a2;
                        N2 = str3;
                        if (charSequence9 != null) {
                            N2 = charSequence9;
                        }
                        int measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.g0.L(this.J + 33);
                        if (this.f30465a0) {
                            if (!TextUtils.isEmpty(charSequence)) {
                                measuredWidth2 = (int) (measuredWidth2 - this.f30471b0.measureText(charSequence.toString()));
                            }
                            measuredWidth2 = (int) (measuredWidth2 - this.f30471b0.measureText(": "));
                        }
                        if (measuredWidth2 > 0) {
                            N2 = org.telegram.messenger.g0.Q(N2, (String) this.f30497g1.Y1.get(0), measuredWidth2, this.f30471b0);
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
                    zi ziVar5 = this.f30497g1;
                    if (ziVar5 != null) {
                        ziVar5.V5();
                    }
                    zi ziVar6 = this.f30497g1;
                    Pattern pattern = li.S1;
                    li.g(ziVar6.f26868k.entities, ziVar6.v, spannableString4, 264);
                    zi ziVar7 = this.f30497g1;
                    if (ziVar7 != null && (message = ziVar7.f26868k) != null) {
                        ArrayList<TLRPC.MessageEntity> arrayList4 = message.entities;
                        TextPaint textPaint2 = this.f30471b0;
                        if (textPaint2 != null) {
                            fontMetricsInt = textPaint2.getFontMetricsInt();
                        }
                        li.a(fontMetricsInt, spannableString4, arrayList4);
                    }
                    if (z10) {
                        spannableString4 = w(spannableString4);
                    }
                    return O(i3, spannableString4, charSequence);
                }
                return new SpannableStringBuilder();
            }
        }
    }

    public final boolean S() {
        ui.f fVar = this.f30564u0;
        if (fVar != null && !((ArrayList) fVar.d).isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (org.telegram.messenger.t3.Y(this.f30503h2)) {
            return !this.f30492f1;
        }
        if (this.Q) {
            return this.f30472b1;
        }
        TLRPC.Chat chat = this.f30503h2;
        if (chat != null && chat.forum && this.O == null) {
            if (!this.f30486e1) {
                return true;
            }
            return false;
        }
        return this.f30466a1;
    }

    public final boolean U() {
        if (this.K0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if (this.K0 != 0) {
            return true;
        }
        return false;
    }

    public boolean W() {
        TLRPC.Chat chat;
        if (!U() && !this.Q0 && (chat = this.f30503h2) != null) {
            if (!chat.forum) {
                if (org.telegram.messenger.t3.p0(chat)) {
                    if (!org.telegram.messenger.t3.A(this.G0, this.f30503h2, 24)) {
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

    public final boolean X() {
        TLRPC.User user;
        if (!W() && !this.f30569v0.f10715w && (user = this.f30498g2) != null && !user.self) {
            TLRPC.UserStatus userStatus = user.status;
            int i3 = this.G0;
            if (userStatus == null || userStatus.expires > 0 || !hp.s1(i3).f22954a0.containsKey(Long.valueOf(this.f30498g2.f27150id))) {
                TLRPC.UserStatus userStatus2 = this.f30498g2.status;
                if (userStatus2 != null && userStatus2.expires > ConnectionsManager.getInstance(i3).getCurrentTime()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean Z(float f10) {
        if (!bd.f21784a0) {
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

    public final void a0(boolean z10, boolean z11) {
        if ((!getIsPinned() && z10) || this.f30595z3 == z10) {
            if (!getIsPinned()) {
                this.f30595z3 = false;
                return;
            }
            return;
        }
        this.f30595z3 = z10;
        float f10 = 1.0f;
        if (z11) {
            if (z10) {
                f10 = 0.0f;
            }
            this.f30590y3 = f10;
        } else {
            if (!z10) {
                f10 = 0.0f;
            }
            this.f30590y3 = f10;
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27975i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27939g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28084o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27992j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28104p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28010k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28008k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27881d9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27864c9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Y5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28161s9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28065n9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28046m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28029l9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27957h9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
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
        boolean z10 = az.f21657q1;
        this.f30529n1 = z10;
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        this.E1 = f10;
        this.f30473b2.f38690o = f10;
        this.f30565u1 = 0.0f;
        this.f30588y1 = false;
        if (!getIsPinned() || !this.f30595z3) {
            f11 = 0.0f;
        }
        this.f30590y3 = f11;
        this.f30584x3 = true;
        this.f30538p1 = 0.0f;
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        org.telegram.ui.Components.e5 e5Var = this.f30536o4;
        if (e5Var != null && this.f30584x3) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f30541p4;
        if (e5Var2 != null && this.f30584x3) {
            e5Var2.a();
        }
    }

    public final void c0(boolean z10, boolean z11) {
        gi.y2 y2Var = this.f30550r2;
        if (y2Var == null && !z10) {
            return;
        }
        if (y2Var == null) {
            gi.y2 y2Var2 = new gi.y2(this, getContext(), this.K4, 1);
            this.f30550r2 = y2Var2;
            y2Var2.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
            this.f30550r2.setDrawUnchecked(false);
            this.f30550r2.setDrawBackgroundAsArc(3);
            addView(this.f30550r2);
        }
        this.f30550r2.a(z10, z11);
        B();
    }

    public final void d0(long j10, zi ziVar, int i3, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        if (this.I0 != j10) {
            this.f30591y4 = -1;
        }
        this.I0 = j10;
        this.C4 = System.currentTimeMillis();
        this.f30497g1 = ziVar;
        this.f30571v2 = z10;
        this.O0 = false;
        this.S0 = i3;
        if (ziVar != null) {
            int i11 = ziVar.f26868k.edit_date;
        }
        this.T0 = 0;
        this.U0 = false;
        if (ziVar != null) {
            i10 = ziVar.f1();
        } else {
            i10 = 0;
        }
        this.m1 = i10;
        this.V0 = 0;
        this.W0 = 0;
        this.X0 = 0;
        if (ziVar != null && ziVar.G4()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.Y0 = z12;
        zi ziVar2 = this.f30497g1;
        if (ziVar2 != null) {
            this.Z0 = ziVar2.f26868k.send_state;
        }
        i0(0, z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if ((!this.Q && !this.G && motionEvent.getAction() == 1) || motionEvent.getAction() == 3) {
            this.f30569v0.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e0(TLRPC.Dialog dialog, int i3, int i10) {
        boolean z10;
        if (this.I0 != dialog.f27005id) {
            ValueAnimator valueAnimator = this.B4;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.B4.cancel();
            }
            this.A4 = false;
            this.f30591y4 = -1;
        }
        this.I0 = dialog.f27005id;
        this.C4 = System.currentTimeMillis();
        boolean z11 = true;
        this.O0 = true;
        if (dialog instanceof TLRPC.TL_dialogCommunity) {
            this.L0 = dialog.community_id;
        } else {
            this.L0 = 0L;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            this.K0 = ((TLRPC.TL_dialogFolder) dialog).folder.f27052id;
            ng0 ng0Var = this.f30493f2;
            if (ng0Var != null) {
                ng0Var.H = this;
                ng0Var.i();
            }
        } else {
            this.K0 = 0;
        }
        this.k1 = i3;
        if (i3 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Runnable runnable = this.f30470a5;
        if (runnable == null) {
            z11 = false;
        }
        if (z10 != z11) {
            if (!z10 && runnable != null) {
                runnable.run();
                this.f30470a5 = null;
            } else if (z10) {
                this.f30470a5 = hs.f(this.G0).h(this, hs.i3, new l2(this, 0));
            }
        }
        if (this.f30564u0 == null) {
            this.f30564u0 = new ui.f(this);
        }
        this.f30520l1 = i10;
        this.m1 = 0;
        if (i0(0, false)) {
            requestLayout();
        }
        A();
        z();
        y();
        B();
    }

    public final void f0(TLRPC.TL_forumTopic tL_forumTopic, long j10, zi ziVar, boolean z10, boolean z11) {
        boolean z12;
        ng0 ng0Var;
        this.O = tL_forumTopic;
        if (tL_forumTopic != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.Q = z12;
        if (this.I0 != j10) {
            this.f30591y4 = -1;
        }
        Drawable drawable = ziVar.f26853g2[0];
        if (drawable instanceof rg.a) {
            ((rg.a) drawable).b(tL_forumTopic.icon_color);
        }
        this.I0 = j10;
        this.C4 = System.currentTimeMillis();
        this.f30497g1 = ziVar;
        this.O0 = false;
        this.f30501h0 = z10;
        this.S0 = ziVar.f26868k.date;
        this.U0 = false;
        this.m1 = ziVar.f1();
        this.Y0 = ziVar.G4();
        zi ziVar2 = this.f30497g1;
        if (ziVar2 != null) {
            this.Z0 = ziVar2.f26868k.send_state;
        }
        if (!z11) {
            this.f30591y4 = -1;
        }
        if (tL_forumTopic != null) {
            this.f30502h1 = tL_forumTopic.groupedMessages;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.O;
        if (tL_forumTopic2 != null && tL_forumTopic2.f27053id == 1 && (ng0Var = this.f30493f2) != null) {
            ng0Var.H = this;
            ng0Var.i();
        }
        i0(0, z11);
    }

    public final void g0(int i3, zi ziVar) {
        boolean z10;
        boolean z11;
        int i10;
        String str;
        float f10;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.PhotoSize> arrayList = ziVar.f26878n0;
        TLObject tLObject = ziVar.f26872l0;
        if (ziVar.z4()) {
            TL_stories.StoryItem storyItem = ziVar.f26868k.media.storyItem;
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
        TLRPC.PhotoSize R = org.telegram.messenger.w7.R(arrayList);
        TLRPC.PhotoSize photoSize = null;
        if (R == null) {
            R = org.telegram.messenger.w7.w(arrayList, 40, false, null, false);
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, org.telegram.messenger.g0.Z0(false), false, null, true);
        if (R != w10) {
            photoSize = w10;
        }
        if (photoSize == null || !org.telegram.messenger.z5.q(this.G0).d(ziVar)) {
            photoSize = R;
        }
        if (R != null) {
            if (!this.T1 && !zi.M4(ziVar.f26868k) && !ziVar.i4()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.T1 = z10;
            int i11 = this.S1;
            if (i11 < 3) {
                this.S1 = i11 + 1;
                if ((zi.M4(ziVar.f26868k) || ziVar.i4()) && !ziVar.u2()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.X1[i3] = z11;
                this.Y1[i3] = ziVar.u2();
                if (ziVar.D == 1 && photoSize != null) {
                    i10 = photoSize.size;
                } else {
                    i10 = 0;
                }
                if (ziVar.u2()) {
                    str = "5_5_b";
                } else {
                    str = "20_20";
                }
                ImageReceiver[] imageReceiverArr = this.W1;
                imageReceiverArr[i3].r0(ac.f(photoSize, tLObject), str, ac.f(R, tLObject), str, null, i10, null, ziVar, 0);
                ImageReceiver imageReceiver = imageReceiverArr[i3];
                if (ziVar.i4()) {
                    f10 = 18.0f;
                } else {
                    f10 = 2.0f;
                }
                imageReceiver.J0(org.telegram.messenger.g0.L(f10));
                this.W = false;
            }
        }
    }

    public float getClipProgress() {
        return this.f30565u1;
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
        return this.f30466a1;
    }

    public boolean getIsPinned() {
        if (!this.B3 && !this.C3) {
            return false;
        }
        return true;
    }

    public zi getMessage() {
        return this.f30497g1;
    }

    public int getMessageId() {
        return this.m1;
    }

    public java.lang.String getMessageNameString() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.getMessageNameString():java.lang.String");
    }

    public long getStarsPrice() {
        return this.f30544q2;
    }

    @Override
    public float getTranslationX() {
        return this.f30582x1;
    }

    public final void h0() {
        ng0 ng0Var = this.f30493f2;
        if (ng0Var != null) {
            if (this.Q) {
                ng0Var.K = org.telegram.messenger.g0.L(24.0f);
                this.f30493f2.L = org.telegram.messenger.g0.L(24.0f);
                this.f30493f2.M = 0.0f;
            } else {
                m2 m2Var = this.f30569v0;
                RectF rectF = m2Var.F;
                RectF rectF2 = m2Var.F;
                ng0Var.K = rectF.centerY();
                this.f30493f2.L = rectF2.centerX();
                this.f30493f2.M = rectF2.width() / 2.0f;
                if (!hp.s1(this.G0).P1().h.isEmpty()) {
                    this.f30493f2.M -= org.telegram.messenger.g0.N(3.5f);
                }
                ng0 ng0Var2 = this.f30493f2;
                this.Z1.q();
                ng0Var2.getClass();
            }
            ng0 ng0Var3 = this.f30493f2;
            if (!ng0Var3.E && ng0Var3.I != null) {
                AnimatorSet animatorSet = ng0Var3.B;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    ng0Var3.B.cancel();
                }
                ng0Var3.E = true;
                ng0Var3.F = true;
                ng0Var3.D = 0.0f;
                ng0Var3.I.getTranslationY();
                org.telegram.messenger.g0.L(100.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new mg0(ng0Var3, 5));
                ofFloat.setInterpolator(xq.h);
                ofFloat.setDuration(250L);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new mg0(ng0Var3, 6));
                xq xqVar = xq.f40455j;
                ofFloat2.setInterpolator(xqVar);
                ofFloat2.setDuration(150L);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat3.addUpdateListener(new mg0(ng0Var3, 7));
                ofFloat3.setInterpolator(xqVar);
                ofFloat3.setDuration(135L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                ng0Var3.B = animatorSet2;
                animatorSet2.addListener(new a60(ng0Var3, 11));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playSequentially(ofFloat2, ofFloat3);
                animatorSet3.setStartDelay(180L);
                ng0Var3.B.playTogether(ofFloat, animatorSet3);
                ng0Var3.B.start();
            }
        }
    }

    public final boolean i0(int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.i0(int, boolean):boolean");
    }

    @Override
    public final void invalidate() {
        if (ei.r9.f10906y1) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable != this.f30593z1 && drawable != org.telegram.ui.ActionBar.k6.f28191u1) {
            super.invalidateDrawable(drawable);
        } else {
            invalidate(drawable.getBounds());
        }
    }

    public final void j0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.j0():void");
    }

    public final void k0(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f30470a5 != null && this.f30498g2 != null) {
            requirementToContact = hp.s1(this.G0).J2(this.f30498g2.f27150id);
        } else {
            requirementToContact = null;
        }
        boolean z12 = requirementToContact instanceof TL_account.requirementToContactPremium;
        if (this.f30534o2 == z12 && this.f30544q2 == org.telegram.messenger.m5.k(requirementToContact)) {
            return;
        }
        this.f30534o2 = z12;
        this.f30544q2 = org.telegram.messenger.m5.k(requirementToContact);
        if (!z10) {
            this.f30530n2.f(this.f30534o2, true);
            if (this.f30544q2 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f30539p2.f(z11, true);
        }
        invalidate();
    }

    public final void m0() {
        StaticLayout staticLayout;
        int i3;
        if (this.S1 > 0) {
            if (W()) {
                staticLayout = this.i3;
            } else {
                staticLayout = this.f30494f3;
            }
            if (W()) {
                i3 = this.f30483d3;
            } else {
                i3 = this.f30478c3;
            }
            if (staticLayout != null) {
                try {
                    CharSequence text = staticLayout.getText();
                    if (text instanceof Spanned) {
                        r2[] r2VarArr = (r2[]) ((Spanned) text).getSpans(0, text.length(), r2.class);
                        boolean[] zArr = this.V1;
                        if (r2VarArr != null && r2VarArr.length > 0) {
                            int spanStart = ((Spanned) text).getSpanStart(r2VarArr[0]);
                            if (spanStart < 0) {
                                spanStart = 0;
                            }
                            int ceil = (int) Math.ceil(Math.min(staticLayout.getPrimaryHorizontal(spanStart), staticLayout.getPrimaryHorizontal(spanStart + 1)));
                            if (ceil != 0 && !this.f30587y0 && !this.f30592z0) {
                                ceil += org.telegram.messenger.g0.L(3.0f);
                            }
                            for (int i10 = 0; i10 < this.S1; i10++) {
                                this.W1[i10].L0 = i3 + ceil + org.telegram.messenger.g0.L((this.M4 + 2) * i10);
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
        this.Z1.P();
        int i3 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i3 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i3].P();
            i3++;
        }
        b0();
        this.f30531n3 = org.telegram.ui.Components.p5.update(0, this, this.f30531n3, this.f30494f3);
        this.f30535o3 = org.telegram.ui.Components.p5.update(0, this, this.f30535o3, this.f30562t3);
        this.f30540p3 = org.telegram.ui.Components.p5.update(0, this, this.f30540p3, this.i3);
        this.f30545q3 = org.telegram.ui.Components.p5.update(0, this, this.f30545q3, this.A2);
        org.telegram.ui.Components.e5 e5Var = this.f30536o4;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f30541p4;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        float f10;
        super.onDetachedFromWindow();
        this.f30588y1 = false;
        this.B1 = false;
        this.C1 = 0.0f;
        this.f30584x3 = false;
        if (getIsPinned() && this.f30595z3) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30590y3 = f10;
        this.Z1.R();
        int i3 = 0;
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i3 >= imageReceiverArr.length) {
                break;
            }
            imageReceiverArr[i3].R();
            i3++;
        }
        ch0 ch0Var = this.f30593z1;
        if (ch0Var != null) {
            ch0Var.stop();
            this.f30593z1.T(true, 0.0f);
            this.f30593z1.setCallback(null);
            this.f30593z1 = null;
            this.A1 = false;
        }
        kg.j jVar = this.f30563t4;
        if (jVar != null) {
            jVar.d.remove(Long.valueOf(this.I0));
        }
        org.telegram.ui.Components.e5 e5Var = this.f30536o4;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f30541p4;
        if (e5Var2 != null) {
            e5Var2.b();
        }
        org.telegram.ui.Components.p5.release(this, this.f30531n3);
        org.telegram.ui.Components.p5.release(this, this.f30535o3);
        org.telegram.ui.Components.p5.release(this, this.f30540p3);
        org.telegram.ui.Components.p5.release(this, this.f30545q3);
        this.f30569v0.g();
        this.f30480d0 = null;
    }

    @Override
    public void onDraw(android.graphics.Canvas r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ng0 ng0Var;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (V() && (ng0Var = this.f30493f2) != null && az.f21657q1 && ng0Var.J == 0.0f) {
            accessibilityNodeInfo.setVisibleToUser(false);
        } else {
            accessibilityNodeInfo.addAction(16);
            accessibilityNodeInfo.addAction(32);
            if (!V() && this.E4 != null) {
                accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(2131296262, bd.M0(2131754940, null)));
            }
        }
        gi.y2 y2Var = this.f30550r2;
        if (y2Var != null && y2Var.f40035a.f31334q) {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30510j0 == 0.0f && !this.Q && !this.G && this.f30569v0.a(this, motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int L;
        int i15;
        if (this.I0 != 0 || this.H0 != null) {
            ai.x2 x2Var = this.n4;
            if (x2Var != null) {
                x2Var.layout(0, 0, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f));
            }
            if (this.f30550r2 != null) {
                int i16 = this.J;
                boolean z11 = this.f30556s2;
                if (!z11 && !az.f21654p1) {
                    i13 = 27;
                } else {
                    i13 = 29;
                }
                int L2 = org.telegram.messenger.g0.L(i16 - i13);
                if (this.f30519l0) {
                    i15 = org.telegram.messenger.g0.L(8.0f);
                    L = (getMeasuredHeight() - this.f30550r2.getMeasuredHeight()) >> 1;
                } else {
                    if (bd.f21784a0) {
                        L2 = (i11 - i3) - L2;
                    }
                    float f10 = this.V;
                    if (!z11 && !az.f21654p1) {
                        i14 = 0;
                    } else {
                        i14 = 6;
                    }
                    int i17 = L2;
                    L = org.telegram.messenger.g0.L(f10 + i14);
                    i15 = i17;
                }
                gi.y2 y2Var = this.f30550r2;
                y2Var.layout(i15, L, y2Var.getMeasuredWidth() + i15, this.f30550r2.getMeasuredHeight() + L);
            }
            int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
            if (measuredWidth == this.L4 && !this.B0) {
                return;
            }
            this.B0 = false;
            this.L4 = measuredWidth;
            try {
                x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        ai.x2 x2Var = this.n4;
        if (x2Var != null) {
            x2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), 1073741824));
        }
        gi.y2 y2Var = this.f30550r2;
        if (y2Var != null) {
            y2Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        if (this.Q) {
            int size = View.MeasureSpec.getSize(i3);
            boolean z10 = this.f30556s2;
            if (!z10 && !az.f21654p1) {
                i11 = this.K;
            } else {
                i11 = this.L;
            }
            if (S() && ((!z10 && !az.f21654p1) || W())) {
                if (W()) {
                    i12 = this.N;
                } else {
                    i12 = this.M;
                }
            } else {
                i12 = 0;
            }
            setMeasuredDimension(size, org.telegram.messenger.g0.L(i11 + i12) + (this.f30561t2 ? 1 : 0));
            this.R = false;
            if (this.Q && !S()) {
                x();
                if (this.S) {
                    this.R = true;
                    x();
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), E());
        this.f30570v1 = 0;
        this.f30576w1 = getMeasuredHeight();
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        zi captionMessage;
        TLRPC.User a22;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        StringBuilder sb2 = new StringBuilder();
        String str = this.M0;
        if (str != null) {
            sb2.append(str);
            sb2.append(". ");
        } else if (this.K0 == 1) {
            org.telegram.messenger.camera.q.q(null, 2131754136, sb2, ". ");
        } else {
            if (this.f30508i2 != null) {
                org.telegram.messenger.camera.q.q(null, 2131754777, sb2, ". ");
            }
            if (this.Q && this.O != null) {
                org.telegram.messenger.camera.q.q(null, 2131754746, sb2, ". ");
                sb2.append(this.O.title);
                sb2.append(". ");
            } else {
                TLRPC.User user = this.f30498g2;
                if (user != null) {
                    if (l10.z(user)) {
                        sb2.append(bd.M0(2131746274, null));
                    } else if (l10.s(this.f30498g2)) {
                        sb2.append(bd.M0(2131754252, null));
                    } else {
                        if (this.f30498g2.bot) {
                            org.telegram.messenger.camera.q.q(null, 2131753156, sb2, ". ");
                        }
                        TLRPC.User user2 = this.f30498g2;
                        if (user2.self) {
                            sb2.append(bd.M0(2131745911, null));
                        } else {
                            sb2.append(org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name));
                        }
                    }
                    sb2.append(". ");
                } else {
                    TLRPC.Chat chat = this.f30503h2;
                    if (chat != null) {
                        if (chat.broadcast) {
                            sb2.append(bd.M0(2131754904, null));
                        } else {
                            sb2.append(bd.M0(2131754876, null));
                        }
                        sb2.append(". ");
                        sb2.append(this.f30503h2.title);
                        sb2.append(". ");
                    }
                }
            }
        }
        if (this.f30518k4) {
            org.telegram.messenger.camera.q.q(null, 2131754739, sb2, ". ");
        }
        if (this.f30466a1) {
            org.telegram.messenger.camera.q.q(null, 2131754829, sb2, ". ");
        }
        if (X()) {
            org.telegram.messenger.camera.q.q(null, 2131754741, sb2, ". ");
        }
        int i3 = this.T0;
        if (i3 > 0) {
            sb2.append(bd.G(i3, "NewMessages", new Object[0]));
            sb2.append(". ");
        }
        int i10 = this.V0;
        if (i10 > 0) {
            sb2.append(bd.G(i10, "AccDescrMentionCount", new Object[0]));
            sb2.append(". ");
        }
        if (this.W0 > 0) {
            org.telegram.messenger.camera.q.q(null, 2131754841, sb2, ". ");
        }
        zi ziVar = this.f30497g1;
        if (ziVar != null && this.K0 == 0) {
            int i11 = this.S0;
            if (i11 == 0) {
                i11 = ziVar.f26868k.date;
            }
            String s6 = bd.s(i11, true);
            if (this.f30497g1.O3()) {
                sb2.append(bd.a0("AccDescrSentDate", null, 2131754765, s6));
            } else {
                sb2.append(bd.a0("AccDescrReceivedDate", null, 2131754789, s6));
            }
            sb2.append(". ");
            if (this.f30503h2 != null && !this.f30497g1.O3() && this.f30497g1.q3() && this.f30497g1.f26868k.action == null && (a22 = hp.s1(this.G0).a2(Long.valueOf(this.f30497g1.f26868k.from_id.user_id))) != null) {
                sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                sb2.append(". ");
            }
            if (this.f30508i2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f30497g1.v);
                if (!this.f30497g1.G3() && (captionMessage = getCaptionMessage()) != null && !TextUtils.isEmpty(captionMessage.f26924z)) {
                    if (sb3.length() > 0) {
                        sb3.append(". ");
                    }
                    sb3.append(captionMessage.f26924z);
                }
                StaticLayout staticLayout = this.f30494f3;
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
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        uw uwVar;
        if (i3 == 2131296262 && (uwVar = this.E4) != null) {
            uwVar.T4(this);
            return true;
        }
        return super.performAccessibilityAction(i3, bundle);
    }

    @Override
    public final void requestLayout() {
        if (getParent() != null && getParent().isLayoutRequested()) {
            getParent().requestLayout();
        }
        super.requestLayout();
    }

    public void setArchivedPullAnimation(ng0 ng0Var) {
        this.f30493f2 = ng0Var;
    }

    public void setBottomClip(int i3) {
        this.f30576w1 = i3;
    }

    public void setClipProgress(float f10) {
        this.f30565u1 = f10;
        invalidate();
    }

    public void setCurrentDialogId(long j10) {
        this.I0 = j10;
    }

    public void setCustomMessage(String str) {
        if (!TextUtils.equals(this.J0, str)) {
            this.J0 = str;
            x();
            requestLayout();
        }
    }

    public void setCustomMessageWithoutRebuild(String str) {
        this.J0 = str;
    }

    public void setDialog(o2 o2Var) {
        this.H0 = o2Var;
        this.m1 = 0;
        i0(0, true);
        A();
        z();
        y();
        B();
    }

    public void setDialogCellDelegate(p2 p2Var) {
        this.f30485e0 = p2Var;
    }

    public void setDialogSelected(boolean z10) {
        if (this.f30552r4 != z10) {
            invalidate();
        }
        this.f30552r4 = z10;
    }

    public void setIsTransitionSupport(boolean z10) {
        this.f30515k0 = z10;
    }

    public void setMoving(boolean z10) {
        this.f30547r = z10;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.F1 == z10) {
            return;
        }
        if (this.J1 == null) {
            this.J1 = new ly0(bd.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.F1 = z10;
        this.G1.c(false);
    }

    public void setPinForced(boolean z10) {
        this.C3 = z10;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            x();
        }
        invalidate();
    }

    public void setPreloader(kg.j jVar) {
        this.f30563t4 = jVar;
    }

    public void setRightFragmentOpenedProgress(float f10) {
        if (this.f30510j0 != f10) {
            this.f30510j0 = f10;
            invalidate();
        }
    }

    public void setSliding(boolean z10) {
        this.f30588y1 = z10;
    }

    public void setTitleOverride(String str) {
        this.M0 = str;
    }

    public void setTopClip(int i3) {
        this.f30570v1 = i3;
    }

    @Override
    public void setTranslationX(float f10) {
        if (f10 == this.f30582x1) {
            return;
        }
        this.f30582x1 = f10;
        ch0 ch0Var = this.f30593z1;
        boolean z10 = true;
        if (ch0Var != null && f10 == 0.0f) {
            ch0Var.T(true, 0.0f);
            this.A1 = false;
            this.f30529n1 = az.f21657q1;
            this.C1 = 0.0f;
            this.f30588y1 = false;
        }
        float f11 = this.f30582x1;
        if (f11 != 0.0f) {
            this.f30588y1 = true;
        } else {
            this.D1 = 0.0f;
            this.C1 = 0.0f;
            this.B1 = false;
        }
        if (this.f30588y1 && !this.f30580x) {
            boolean z11 = this.B1;
            if (Math.abs(f11) < getMeasuredWidth() * 0.45f) {
                z10 = false;
            }
            this.B1 = z10;
            if (z11 != z10 && this.f30529n1 == az.f21657q1) {
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
                    i0(0, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final CharSequence w(CharSequence charSequence) {
        if (this.S1 > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.insert(0, (CharSequence) " ");
            valueOf.setSpan(new r2(org.telegram.messenger.g0.L(((this.M4 + 2) * this.S1) + 3)), 0, 1, 33);
            return valueOf;
        }
        return charSequence;
    }

    public void x() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.x():void");
    }

    public final void y() {
        TLRPC.Message message;
        zi ziVar = this.f30497g1;
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && this.Y0) {
                org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.G0);
                long j10 = this.I0;
                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
                f10.s(j10, jg.b.c(chatTheme), chatTheme, false);
            }
        }
    }

    public final void z() {
        boolean z10;
        float f10;
        TLRPC.Chat chat = this.f30503h2;
        if (chat != null && chat.call_active && chat.call_not_empty) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30577w2 = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f30549r1 = f10;
    }

    public t2(uw uwVar, Context context, boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = true;
        this.f30586y = true;
        int i10 = 0;
        this.E = false;
        this.I = 11;
        this.J = 72;
        this.K = 70;
        this.L = 76;
        this.M = 3;
        this.N = 11;
        this.V = 42.0f;
        m2 m2Var = new m2(this);
        this.f30569v0 = m2Var;
        this.A0 = true;
        this.D0 = 0.0f;
        this.f30486e1 = false;
        this.f30492f1 = false;
        this.G1 = new gc(this);
        this.H1 = new Paint(1);
        this.I1 = new RectF();
        this.M1 = false;
        this.V1 = new boolean[3];
        this.W1 = new ImageReceiver[3];
        this.X1 = new boolean[3];
        this.Y1 = new boolean[3];
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Z1 = imageReceiver;
        this.f30473b2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f30487e2 = new b5.c(2);
        xq xqVar = xq.h;
        this.f30530n2 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.f30539p2 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.f30513j3 = new Stack();
        this.f30517k3 = new ArrayList();
        this.f30522l3 = new Stack();
        this.f30525m3 = new ArrayList();
        this.M3 = true;
        this.T3 = new qe.a(this, xqVar, 320L);
        this.W3 = 1.0f;
        this.X3 = 1.0f;
        this.f30558s4 = new RectF();
        this.f30591y4 = -1;
        this.I4 = -1;
        this.J4 = new q2(this);
        m2Var.I = true;
        this.K4 = e6Var;
        this.E4 = uwVar;
        org.telegram.ui.ActionBar.k6.T(context);
        this.E = false;
        this.F = false;
        imageReceiver.J0(org.telegram.messenger.g0.L(26.0f));
        while (true) {
            ImageReceiver[] imageReceiverArr = this.W1;
            if (i10 < imageReceiverArr.length) {
                imageReceiverArr[i10] = new ImageReceiver(this);
                ImageReceiver imageReceiver2 = this.W1[i10];
                imageReceiver2.f21282y = true;
                imageReceiver2.J0(org.telegram.messenger.g0.L(2.0f));
                this.W1[i10].A1 = true;
                i10++;
            } else {
                this.f30556s2 = z10;
                this.G0 = i3;
                ai.x2 x2Var = new ai.x2(13, context, this);
                this.n4 = x2Var;
                addView(x2Var);
                this.f30536o4 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(22.0f), x2Var);
                this.f30541p4 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), this);
                this.Z1.A1 = true;
                return;
            }
        }
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (ei.r9.f10906y1) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
