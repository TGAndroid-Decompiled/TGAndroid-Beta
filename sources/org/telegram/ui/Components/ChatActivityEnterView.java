package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class ChatActivityEnterView extends FrameLayout implements fn7, vma, p4b, xeb, s84, snb {
    public static long W7;
    public static final int X7 = 0;
    public boolean A0;
    public float A1;
    public boolean A2;
    public int A3;
    public final Paint A4;
    public dy1 A5;
    public int A6;
    public zh6 A7;
    public boolean B0;
    public int B1;
    public AnimatorSet B2;
    public boolean B3;
    public Drawable B4;
    public AnimatorSet B5;
    public boolean B6;
    public long B7;
    public final HashMap C0;
    public final SparseArray C1;
    public RecordCircle C2;
    public final int[] C3;
    public Drawable C4;
    public boolean C5;
    public boolean C6;
    public float C7;
    public boolean D0;
    public boolean D1;
    public l D2;
    public final Activity D3;
    public Drawable D4;
    public b29 D5;
    public dx1 D6;
    public final Paint D7;
    public float E;
    public boolean E0;
    public boolean E1;
    public final ax1 E2;
    public final zu1 E3;
    public Drawable E4;
    public b29 E5;
    public long E6;
    public final LinearGradient E7;
    public float F;
    public tx1 F0;
    public long F1;
    public final Paint F2;
    public long F3;
    public Drawable F4;
    public ValueAnimator F5;
    public long F6;
    public final Matrix F7;
    public float G;
    public final cz1 G0;
    public k43 G1;
    public byte G2;
    public boolean G3;
    public final RectF G4;
    public float G5;
    public kg5 G6;
    public final mm G7;
    public float H;
    public int H0;
    public long H1;
    public mv1 H2;
    public byte H3;
    public final Rect H4;
    public float H5;
    public boolean H6;
    public final mm H7;
    public float I;
    public mv1 I0;
    public boolean I1;
    public int I2;
    public r47 I3;
    public final Rect I4;
    public long I5;
    public final int[] I6;
    public r2d I7;
    public float J;
    public final n4a J0;
    public boolean J1;
    public ya9 J2;
    public r47 J3;
    public Drawable J4;
    public int J5;
    public final int[] J6;
    public vz1 J7;
    public boolean K;
    public final bx1 K0;
    public ll0 K1;
    public Editable K2;
    public ou1 K3;
    public final vnb K4;
    public float K5;
    public final RectF K6;
    public final t84 K7;
    public TLRPC.UserFull L;
    public int L0;
    public jl0 L1;
    public boolean L2;
    public r47 L3;
    public final boolean L4;
    public mva L5;
    public gn3 L6;
    public final fm0 L7;
    public kg5 M;
    public q67 M0;
    public jl0 M1;
    public boolean M2;
    public TLRPC.WebPage M3;
    public final dx1 M4;
    public float M5;
    public final RectF M6;
    public final fm0 M7;
    public kg5 N;
    public long N0;
    public final Paint N1;
    public boolean N2;
    public boolean N3;
    public final qw1 N4;
    public long N5;
    public znc N6;
    public final fm0 N7;
    public kg5 O;
    public nx1 O0;
    public float O1;
    public r47 O2;
    public xy1 O3;
    public final qw1 O4;
    public Bitmap O5;
    public final RectF O6;
    public float O7;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public ValueAnimator P1;
    public boolean P2;
    public py1 P3;
    public final qw1 P4;
    public float P5;
    public String P6;
    public float P7;
    public boolean Q;
    public final ImageView Q0;
    public final int[] Q1;
    public TL_account.TL_businessChatLink Q2;
    public TLRPC.TL_document Q3;
    public final qw1 Q4;
    public float Q5;
    public long Q6;
    public float Q7;
    public int R;
    public final tw1 R0;
    public final int[] R1;
    public sy1 R2;
    public String R3;
    public final qw1 R4;
    public float R5;
    public lv3 R6;
    public final int[] R7;
    public k5 S;
    public final ImageView S0;
    public boc S1;
    public TLRPC.ChatFull S2;
    public r47 S3;
    public boolean S4;
    public float S5;
    public boolean S6;
    public final int[] S7;
    public boolean T;
    public vw1 T0;
    public boolean T1;
    public boolean T2;
    public oec T3;
    public long T4;
    public float T5;
    public boolean T6;
    public boolean T7;
    public int U;
    public boolean U0;
    public float U1;
    public int U2;
    public boolean U3;
    public float U4;
    public float U5;
    public float U6;
    public int U7;
    public hb V;
    public my1 V0;
    public ValueAnimator V1;
    public boolean V2;
    public boolean V3;
    public float V4;
    public float V5;
    public ValueAnimator V6;
    public int V7;
    public fw1 W;
    public AnimatorSet W0;
    public final kc W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public float W5;
    public byte W6;
    public boolean X0;
    public long X1;
    public boolean X2;
    public r47 X3;
    public float X4;
    public boolean X5;
    public boolean X6;
    public boolean Y0;
    public boolean Y1;
    public boolean Y2;
    public TL_keyboard.KeyboardButtonProto Y3;
    public float Y4;
    public final Paint Y5;
    public int Y6;
    public ez1 Z0;
    public SlideTextView Z1;
    public boolean Z2;
    public boolean Z3;
    public float Z4;
    public boolean Z5;
    public final mv1 Z6;
    public int a;
    public jj1 a0;
    public final a a1;
    public zy1 a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public final mv1 a6;
    public final dx1 a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public final wma b2;
    public r47 b3;
    public boolean b4;
    public float b5;
    public float b6;
    public ValueAnimator b7;
    public b8 c;
    public NumberTextView c0;
    public final zw1 c1;
    public ViewGroup c2;
    public TLRPC.TL_replyKeyboardMarkup c3;
    public boolean c4;
    public float c5;
    public float c6;
    public boolean c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public int d2;
    public int d3;
    public int d4;
    public float d5;
    public float d6;
    public b29 d7;
    public CharSequence e;
    public int e0;
    public b6 e1;
    public final oob e2;
    public boolean e3;
    public boolean e4;
    public float e5;
    public float e6;
    public final float[] e7;
    public String f;
    public c43 f0;
    public rw1 f1;
    public ViewPropertyAnimator f2;
    public PowerManager.WakeLock f3;
    public boolean f4;
    public float f5;
    public float f6;
    public final float[] f7;
    public Runnable g0;
    public qgc g1;
    public final vw1 g2;
    public AnimatorSet g3;
    public final dx1 g4;
    public boolean g5;
    public boolean g6;
    public final int[] g7;
    public float h;
    public boolean h0;
    public e29 h1;
    public final hc h2;
    public AnimatorSet h3;
    public final gf0 h4;
    public long h5;
    public boolean h6;
    public boolean h7;
    public boolean i0;
    public x59 i1;
    public final ImageView i2;
    public AnimatorSet i3;
    public final px1 i4;
    public boolean i5;
    public boolean i6;
    public fw1 i7;
    public String j0;
    public bn3 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final b j4;
    public boolean j5;
    public boolean j6;
    public final wm2[] j7;
    public String k0;
    public boolean k1;
    public float k2;
    public byte k3;
    public final e k4;
    public int k5;
    public boolean k6;
    public long k7;
    public dv1 l0;
    public boolean l1;
    public ImageView l2;
    public boolean l3;
    public final Paint l4;
    public long l5;
    public final Paint l6;
    public byte l7;
    public ep0 m0;
    public boolean m1;
    public vw1 m2;
    public int m3;
    public boolean m4;
    public boolean m5;
    public float m6;
    public byte m7;
    public float n;
    public qx1 n0;
    public boolean n1;
    public final rw1 n2;
    public int n3;
    public boolean n4;
    public ValueAnimator n5;
    public final Rect n6;
    public boolean n7;
    public dp0 o0;
    public boolean o1;
    public final rw1 o2;
    public boolean o3;
    public boolean o4;
    public final TextPaint o5;
    public boolean o6;
    public long o7;
    public boolean p0;
    public Drawable p1;
    public final rw1 p2;
    public int p3;
    public boolean p4;
    public final Paint p5;
    public final mv1 p6;
    public Paint p7;
    public c8a q0;
    public final mv1 q1;
    public final ImageView q2;
    public final boolean q3;
    public AnimatorSet q4;
    public final Paint q5;
    public b8 q6;
    public Paint q7;
    public float r;
    public ix1 r0;
    public snc r1;
    public zj9 r2;
    public long r3;
    public float r4;
    public final Path r5;
    public ArrayList r6;
    public boolean r7;
    public float s;
    public mv1 s0;
    public boolean s1;
    public boolean s2;
    public float s3;
    public int s4;
    public final Path s5;
    public boolean s6;
    public int s7;
    public int t0;
    public boolean t1;
    public TL_iv.RichMessage t2;
    public float t3;
    public boolean t4;
    public final RectF t5;
    public View t6;
    public int t7;
    public int u0;
    public float u1;
    public bx1 u2;
    public boolean u3;
    public AnimatedArrowDrawable u4;
    public final int[] u5;
    public boolean u6;
    public boolean u7;
    public mv1 v0;
    public float v1;
    public View v2;
    public int v3;
    public boolean v4;
    public final int[] v5;
    public boolean v6;
    public boolean v7;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public jy1 w2;
    public boolean w3;
    public boolean w4;
    public jl0 w5;
    public boolean w6;
    public qy w7;
    public Runnable x;
    public float x0;
    public boolean x1;
    public final ImageView x2;
    public boolean x3;
    public boolean x4;
    public jl0 x5;
    public zv4 x6;
    public fu5 x7;
    public float y;
    public boolean y0;
    public float y1;
    public cx1 y2;
    public boolean y3;
    public final g y4;
    public final qf5 y5;
    public dc y6;
    public int y7;
    public boolean z0;
    public float z1;
    public vw1 z2;
    public boolean z3;
    public final pn z4;
    public boolean z5;
    public sn3 z6;
    public int z7;

    public class RecordCircle extends View {
        public int E;
        public final float F;
        public float G;
        public float H;
        public float I;
        public boolean J;
        public float K;
        public float L;
        public float M;
        public boolean N;
        public boolean O;
        public boolean P;
        public float Q;
        public final Paint R;
        public final Path S;
        public final Paint T;
        public final RectF U;
        public final int[] V;
        public final int[] W;
        public float a;
        public final float[] a0;
        public float b;
        public final float[] b0;
        public float c;
        public final int[] c0;
        public long d;
        public float d0;
        public float e;
        public float e0;
        public float f;
        public long f0;
        public long g0;
        public final gk0 h;
        public float h0;
        public float i0;
        public final gk0 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final m y;

        public RecordCircle(Context context) {
            super(context);
            gk0 gk0Var = new gk0(11, 360928);
            this.h = gk0Var;
            gk0 gk0Var2 = new gk0(12, 360928);
            this.n = gk0Var2;
            this.r = hl.N(41.0f);
            this.s = hl.L(30.0f);
            this.w = new RectF();
            this.I = 0.0f;
            this.J = true;
            this.R = new Paint(1);
            this.S = new Path();
            this.T = new Paint(1);
            this.U = new RectF();
            this.V = new int[2];
            this.W = new int[2];
            this.a0 = new float[5];
            this.b0 = new float[5];
            this.c0 = new int[2];
            this.h0 = 1.0f;
            this.i0 = -1.0f;
            m mVar = new m(this, this);
            this.y = mVar;
            ihc.l(this, mVar);
            gk0Var.a = hl.L(47.0f);
            gk0Var.b = hl.L(55.0f);
            gk0Var.b();
            gk0Var2.a = hl.L(47.0f);
            gk0Var2.b = hl.L(55.0f);
            gk0Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            i();
        }

        public static float c(float f) {
            if (f < 0.0f) {
                return 0.0f;
            }
            if (f > 1.0f) {
                return 1.0f;
            }
            return f;
        }

        public static float e(float f) {
            float i = Utilities.i(f, 1.0f, 0.0f);
            if (i < 0.5f) {
                return xnb.C(i, 4.0f, i, i);
            }
            return 1.0f - (((float) Math.pow((i * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float f(float f) {
            float i = 1.0f - Utilities.i(f, 1.0f, 0.0f);
            return bp1.v(i, i, i, 1.0f);
        }

        public static float j(float f, float f2) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f * 3.141592653589793d * 2.0d * f2) * Math.exp((-f) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.i5 = true;
            this.i0 = -1.0f;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            vnb vnbVar = chatActivityEnterView.K4;
            if (chatActivityEnterView.D4 != null) {
                return;
            }
            Drawable mutate = getResources().getDrawable(2131231511).mutate();
            chatActivityEnterView.D4 = mutate;
            int i = aob.Tf;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.x(this, mutate, i, vnbVar, mode);
            Drawable mutate2 = getResources().getDrawable(2131231519).mutate();
            chatActivityEnterView.E4 = mutate2;
            yob.x(this, mutate2, i, vnbVar, mode);
            Drawable mutate3 = getResources().getDrawable(2131232710).mutate();
            chatActivityEnterView.F4 = mutate3;
            yob.x(this, mutate3, i, vnbVar, mode);
            Drawable mutate4 = getResources().getDrawable(2131231510).mutate();
            chatActivityEnterView.B4 = mutate4;
            int i2 = aob.Nl;
            yob.x(this, mutate4, i2, vnbVar, mode);
            Drawable mutate5 = getResources().getDrawable(2131231518).mutate();
            chatActivityEnterView.C4 = mutate5;
            yob.x(this, mutate5, i2, vnbVar, mode);
        }

        public final void d(Canvas canvas, Drawable drawable, Drawable drawable2, float f, int i) {
            float f2;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (drawable == chatActivityEnterView.F4) {
                f2 = (this.d0 * 0.1f) + 1.0f;
            } else {
                f2 = 1.0f;
            }
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            if (i2 != 0) {
                canvas.save();
                canvas.scale(f2, f2, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
            }
            b();
            if (f != 0.0f && f != 1.0f && drawable2 != null) {
                canvas.save();
                canvas.scale(f, f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                float f3 = i;
                drawable.setAlpha((int) (f3 * f));
                drawable.draw(canvas);
                canvas.restore();
                canvas.save();
                float f4 = 1.0f - f;
                canvas.scale(f4, f4, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                drawable2.setAlpha((int) (f3 * f4));
                drawable2.draw(canvas);
                canvas.restore();
            } else {
                boolean z = chatActivityEnterView.i5;
                a aVar = chatActivityEnterView.a1;
                if (z) {
                    float f5 = chatActivityEnterView.X4;
                    if (f5 == 1.0f) {
                        chatActivityEnterView.c1.setAlpha(1.0f);
                        if (aVar != null) {
                            aVar.setAlpha(1.0f);
                            aVar.setScaleX(1.0f);
                            aVar.setScaleY(1.0f);
                        }
                        setVisibility(8);
                    } else if (f5 < 1.0f) {
                        drawable.setAlpha(255);
                        drawable.draw(canvas);
                    }
                } else {
                    drawable.setAlpha(i);
                    drawable.draw(canvas);
                }
            }
            if (i2 != 0) {
                canvas.restore();
            }
        }

        @Override
        public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
            if (!super.dispatchHoverEvent(motionEvent) && !this.y.f(motionEvent)) {
                return false;
            }
            return true;
        }

        public final void g(boolean z) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z) {
                chatActivityEnterView.j5 = false;
                chatActivityEnterView.Z4 = -1.0f;
                chatActivityEnterView.Y4 = -1.0f;
                chatActivityEnterView.X4 = 1.0f;
                chatActivityEnterView.e5 = 1.0f;
                chatActivityEnterView.f5 = 1.0f;
                chatActivityEnterView.g5 = true;
                chatActivityEnterView.h5 = 0L;
                chatActivityEnterView.b5 = 0.0f;
                chatActivityEnterView.W4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.d5 = 0.0f;
            chatActivityEnterView.Y0();
            chatActivityEnterView.a5 = 0.0f;
            chatActivityEnterView.V4 = 0.0f;
            chatActivityEnterView.U4 = 0.0f;
            chatActivityEnterView.S4 = false;
            this.f = 0.0f;
            chatActivityEnterView.i5 = false;
            l lVar = chatActivityEnterView.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.W4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.V4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.j5 = false;
            invalidate();
            l lVar = chatActivityEnterView.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public final void i() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.A4;
            int i = aob.Uf;
            paint.setColor(chatActivityEnterView.J0(i));
            this.h.d.setColor(vm2.o(chatActivityEnterView.J0(i), 38));
            this.n.d.setColor(vm2.o(chatActivityEnterView.J0(i), 76));
            this.E = paint.getAlpha();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            l lVar = ChatActivityEnterView.this.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r66) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > hl.L(140.0f)) {
                measuredWidth = hl.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.k5 = (int) ((1.0f - chatActivityEnterView.X4) * (-measuredWidth));
        }

        public void setAmplitude(double d) {
            this.n.d(true, (float) (Math.min(1800.0d, d) / 1800.0d));
            this.h.d(false, (float) (Math.min(1800.0d, d) / 1800.0d));
            float min = (float) (Math.min(1800.0d, d) / 1800.0d);
            this.b = min;
            this.c = (min - this.a) / 375.0f;
            invalidate();
        }

        public void setControlsScale(float f) {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.W4 = f;
            l lVar = chatActivityEnterView.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public void setScale(float f) {
            ChatActivityEnterView.this.V4 = f;
            invalidate();
        }

        public void setTransformToSeekbar(float f) {
            ChatActivityEnterView.this.d5 = f;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public hf0 J;
        public int K;
        public final boolean L;
        public final TextPaint a;
        public final TextPaint b;
        public final Paint c;
        public final String d;
        public final String e;
        public float f;
        public float h;
        public float n;
        public float r;
        public float s;
        public float w;
        public final int x;
        public final Path y;

        public SlideTextView(Context context) {
            super(context);
            boolean z;
            float f;
            float f2;
            Paint paint = new Paint(1);
            this.c = paint;
            this.w = 0.0f;
            this.y = new Path();
            this.I = new Rect();
            if (hl.q.x <= hl.L(320.0f)) {
                z = true;
            } else {
                z = false;
            }
            this.L = z;
            TextPaint textPaint = new TextPaint(1);
            this.a = textPaint;
            if (z) {
                f = 13.0f;
            } else {
                f = 15.0f;
            }
            textPaint.setTextSize(hl.L(f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            uh9.p(textPaint2, hl.L(15.0f));
            int i = aob.Nl;
            int i2 = ChatActivityEnterView.X7;
            paint.setColor(ChatActivityEnterView.this.J0(i));
            paint.setStyle(Paint.Style.STROKE);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 1.6f;
            }
            paint.setStrokeWidth(hl.N(f2));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = ob6.M0(2131745041, null);
            this.d = M0;
            String M02 = ob6.M0(2131752570, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i = aob.eg;
            int i2 = ChatActivityEnterView.X7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int J0 = chatActivityEnterView.J0(i);
            TextPaint textPaint = this.a;
            textPaint.setColor(J0);
            int i3 = aob.dg;
            int J02 = chatActivityEnterView.J0(i3);
            TextPaint textPaint2 = this.b;
            textPaint2.setColor(J02);
            textPaint.getAlpha();
            this.s = textPaint2.getAlpha();
            hf0 h0 = aob.h0(hl.L(60.0f), 0, vm2.o(chatActivityEnterView.J0(i3), 26));
            this.J = h0;
            h0.setCallback(this);
        }

        @Override
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            this.J.setState(getDrawableState());
        }

        public float getSlideToCancelWidth() {
            return this.f;
        }

        @Override
        public final void jumpDrawablesToCurrentState() {
            super.jumpDrawablesToCurrentState();
            hf0 hf0Var = this.J;
            if (hf0Var != null) {
                hf0Var.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            int J0;
            float f;
            boolean z;
            float f2;
            float f3;
            float L;
            float f4;
            float f5;
            float f6;
            Canvas canvas2;
            int i;
            float f7;
            float L2;
            Paint paint;
            int i2;
            float f8;
            int i3;
            float leftProperty;
            float f9;
            l lVar;
            if (this.E != null && (staticLayout = this.F) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.C2 != null) {
                    int L3 = hl.L(16.0f) + staticLayout.getWidth();
                    if (hl.B(chatActivityEnterView.J0(aob.d6)) < 0.5f && (lVar = chatActivityEnterView.D2) != null) {
                        J0 = lVar.s.getColor();
                    } else {
                        J0 = chatActivityEnterView.J0(aob.eg);
                    }
                    TextPaint textPaint = this.a;
                    textPaint.setColor(J0);
                    textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(J0) * this.r));
                    this.b.setAlpha((int) (this.s * this.n));
                    int color = textPaint.getColor();
                    Paint paint2 = this.c;
                    paint2.setColor(color);
                    boolean z2 = this.L;
                    if (z2) {
                        this.w = hl.L(16.0f);
                    } else {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (this.n == 0.0f && this.r > 0.8f) {
                            float currentTimeMillis = ((float) (System.currentTimeMillis() % 2000)) / 2000.0f;
                            if (currentTimeMillis < 0.5f) {
                                f = (currentTimeMillis * 4.0f) - 1.0f;
                            } else {
                                f = 3.0f - (currentTimeMillis * 4.0f);
                            }
                            this.w = (-hl.L(6.0f)) * f;
                        }
                    }
                    int i4 = this.x;
                    if (i4 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int L4 = hl.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z) {
                        float primaryHorizontal = this.E.getPrimaryHorizontal(i4);
                        f2 = (L4 + primaryHorizontal) - measuredWidth;
                        f3 = primaryHorizontal;
                    } else {
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    float f10 = L4;
                    float f11 = this.w;
                    float f12 = this.n;
                    float L5 = (((((1.0f - f12) * f11) * this.r) + f10) - (f2 * f12)) + hl.L(16.0f);
                    if (z) {
                        L = 0.0f;
                    } else {
                        L = this.n * hl.L(12.0f);
                    }
                    if (this.n != 1.0f) {
                        int translationX = (int) ((chatActivityEnterView.C2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                        if (chatActivityEnterView.r7) {
                            paint = chatActivityEnterView.p7;
                        } else {
                            paint = null;
                        }
                        if (paint != null) {
                            f5 = 16.0f;
                            i = measuredWidth;
                            f6 = 1.0f;
                            f7 = L5;
                            i2 = translationX;
                            f8 = 4.0f;
                            f4 = L;
                            canvas2 = canvas;
                            i3 = canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
                        } else {
                            i2 = translationX;
                            f5 = 16.0f;
                            f6 = 1.0f;
                            f8 = 4.0f;
                            f4 = L;
                            i = measuredWidth;
                            f7 = L5;
                            canvas2 = canvas;
                            i3 = -1;
                        }
                        canvas2.save();
                        ez1 ez1Var = chatActivityEnterView.Z0;
                        if (ez1Var == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = ez1Var.getLeftProperty();
                        }
                        canvas2.clipRect(leftProperty + hl.L(f8), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas2.save();
                        int i5 = (int) f7;
                        if (z2) {
                            f9 = 7.0f;
                        } else {
                            f9 = 10.0f;
                        }
                        canvas2.translate((i5 - hl.L(f9)) + i2, f4);
                        canvas2.drawPath(this.y, paint2);
                        canvas2.restore();
                        canvas2.save();
                        canvas2.translate(i5 + i2, ((getMeasuredHeight() - this.E.getHeight()) / 2.0f) + f4);
                        this.E.draw(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                        if (i3 >= 0) {
                            canvas2.restoreToCount(i3);
                        }
                    } else {
                        f4 = L;
                        f5 = 16.0f;
                        f6 = 1.0f;
                        canvas2 = canvas;
                        i = measuredWidth;
                        f7 = L5;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.F.getHeight()) / 2.0f;
                    if (!z) {
                        measuredHeight -= hl.L(12.0f) - f4;
                        L2 = i;
                    } else {
                        L2 = (f7 + f3) - (hl.L(f5) * this.n);
                    }
                    Rect rect = this.I;
                    rect.set((int) L2, (int) measuredHeight, (int) (this.F.getWidth() + L2), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-hl.L(f5), -hl.L(f5));
                    if (this.n > 0.0f) {
                        this.J.setBounds((getMeasuredWidth() / 2) - L3, (getMeasuredHeight() / 2) - L3, (getMeasuredWidth() / 2) + L3, (getMeasuredHeight() / 2) + L3);
                        this.J.draw(canvas2);
                        canvas2.save();
                        canvas2.translate(L2, measuredHeight);
                        this.F.draw(canvas2);
                        canvas2.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.n != f6 && !this.H) {
                        invalidate();
                    }
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
            if (this.K != measuredHeight) {
                this.K = measuredHeight;
                String str = this.d;
                TextPaint textPaint = this.a;
                this.f = textPaint.measureText(str);
                String str2 = this.e;
                TextPaint textPaint2 = this.b;
                this.h = textPaint2.measureText(str2);
                System.currentTimeMillis();
                int measuredHeight2 = getMeasuredHeight() >> 1;
                Path path = this.y;
                path.reset();
                if (this.L) {
                    float f = measuredHeight2;
                    path.setLastPoint(hl.N(2.5f), f - hl.N(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(hl.N(2.5f), hl.N(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(hl.N(4.0f), f2 - hl.N(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(hl.N(4.0f), hl.N(5.0f) + f2);
                }
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.E = new StaticLayout(this.d, textPaint, (int) this.f, alignment, 1.0f, 0.0f, false);
                this.F = new StaticLayout(this.e, textPaint2, (int) this.h, alignment, 1.0f, 0.0f, false);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int i;
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                setPressed(false);
            }
            if (this.n == 0.0f || !isEnabled()) {
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            Rect rect = this.I;
            if (action == 0) {
                boolean contains = rect.contains(x, y);
                this.G = contains;
                if (contains) {
                    this.J.setHotspot(x, y);
                    setPressed(true);
                }
                return this.G;
            }
            boolean z = this.G;
            if (z) {
                if (motionEvent.getAction() == 2 && !rect.contains(x, y)) {
                    setPressed(false);
                    return false;
                }
                if (motionEvent.getAction() == 1 && rect.contains(x, y)) {
                    ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                    long j = 0;
                    if (chatActivityEnterView.T2 && chatActivityEnterView.d1) {
                        xy1 xy1Var = chatActivityEnterView.O3;
                        if (chatActivityEnterView.P) {
                            i = Integer.MAX_VALUE;
                        } else {
                            i = 0;
                        }
                        xy1Var.H1(5, 0, i, chatActivityEnterView.o7, 0L, true);
                        bx1 bx1Var = chatActivityEnterView.K0;
                        chatActivityEnterView.o7 = 0L;
                        bx1Var.setEffect(0L);
                    } else {
                        chatActivityEnterView.O3.z0(0);
                        MediaController.z().F0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.Q3 = null;
                    chatActivityEnterView.S3 = null;
                    chatActivityEnterView.T3 = null;
                    chatActivityEnterView.X1 = 0L;
                    chatActivityEnterView.u3 = false;
                    ls6 d0 = ls6.d0(chatActivityEnterView.R);
                    long j2 = chatActivityEnterView.F3;
                    zu1 zu1Var = chatActivityEnterView.E3;
                    if (zu1Var != null && zu1Var.x4) {
                        j = zu1Var.c();
                    }
                    d0.D1(j2, j, null);
                    chatActivityEnterView.D2(2, true);
                    chatActivityEnterView.P(true);
                }
                return true;
            }
            return z;
        }

        public void setCancelToProgress(float f) {
            this.n = f;
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            if (this.J != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
            return true;
        }
    }

    public ChatActivityEnterView(Activity activity, wma wmaVar, zu1 zu1Var, boolean z, vnb vnbVar) {
        super(activity);
        boolean z2;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        xy1 xy1Var;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i6 = yac.t0;
        this.R = i6;
        this.S = k5.a(i6);
        this.U = 1;
        this.d0 = -1;
        this.U7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        this.D0 = false;
        this.E0 = false;
        this.q1 = new mv1(this, (byte) 28);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.N1 = new Paint(1);
        this.Q1 = new int[2];
        this.R1 = new int[2];
        this.W1 = new kc(this, (byte) 19);
        this.k2 = 1.0f;
        this.U2 = -1;
        this.Y2 = true;
        this.s3 = -1.0f;
        this.t3 = hl.L(80.0f);
        this.C3 = new int[2];
        this.N3 = true;
        this.d4 = -1;
        this.f4 = true;
        this.g4 = new dx1(this, (byte) 0);
        this.h4 = new gf0(this);
        this.i4 = new px1(Integer.class, "translationY", (byte) 0);
        this.j4 = new Property(Float.class, "scale");
        this.k4 = new Property(Float.class, "controlsScale");
        this.l4 = new Paint(1);
        this.y4 = new g(this);
        this.z4 = new pn(null);
        this.A4 = new Paint(1);
        this.G4 = new RectF();
        this.H4 = new Rect();
        this.I4 = new Rect();
        this.M4 = new dx1(this, (byte) 3);
        this.N4 = new qw1(this, (byte) 4);
        this.O4 = new qw1(this, (byte) 0);
        this.P4 = new qw1(this, (byte) 1);
        this.Q4 = new qw1(this, (byte) 2);
        this.R4 = new qw1(this, (byte) 3);
        this.f5 = 1.0f;
        this.g5 = true;
        this.o5 = new TextPaint(1);
        this.p5 = new Paint(1);
        this.q5 = new Paint(1);
        this.r5 = new Path();
        this.s5 = new Path();
        this.t5 = new RectF();
        this.u5 = new int[2];
        this.v5 = new int[2];
        this.y5 = new qf5((byte) 15);
        this.Y5 = new Paint(2);
        this.a6 = new mv1(this, (byte) 5);
        this.d6 = 1.0f;
        this.e6 = 1.0f;
        this.f6 = 1.0f;
        this.h6 = true;
        this.i6 = true;
        this.l6 = new Paint();
        this.m6 = 1.0f;
        this.n6 = new Rect();
        this.p6 = new mv1(this, (byte) 7);
        this.s6 = true;
        this.A6 = -1;
        this.I6 = new int[2];
        this.J6 = new int[2];
        this.K6 = new RectF();
        this.M6 = new RectF();
        this.O6 = new RectF();
        this.Z6 = new mv1(this, (byte) 11);
        this.a7 = new dx1(this, (byte) 2);
        this.e7 = new float[2];
        this.f7 = new float[2];
        this.g7 = new int[2];
        this.j7 = new wm2[1];
        this.V7 = 1;
        this.y7 = -1;
        Paint paint = new Paint(1);
        this.D7 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E7 = linearGradient;
        this.F7 = new Matrix();
        k43 k43Var = k43.h;
        this.G7 = new mm(this, 0L, 280L, k43Var);
        this.H7 = new mm(this, 0L, 280L, k43Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        k43 k43Var2 = bb2.V;
        this.K7 = new t84(0, this, k43Var2, 250L);
        this.L7 = new fm0(1, this, k43Var2, 250L, false);
        this.M7 = new fm0(2, this, k43Var, 320L, false);
        this.N7 = new fm0(3, this, k43Var, 320L, false);
        this.R7 = new int[2];
        this.S7 = new int[2];
        this.K4 = vnbVar;
        this.L4 = z;
        if (z && !hl.E && (zu1Var == null || !zu1Var.isInBubbleMode())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.X2 = z2;
        Paint paint2 = new Paint(1);
        this.F2 = paint2;
        paint2.setColor(J0(aob.Sf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        jn7.f(this.R).b(this, jn7.l2);
        jn7.f(this.R).b(this, jn7.o2);
        jn7.f(this.R).b(this, jn7.p2);
        jn7.f(this.R).b(this, jn7.m2);
        jn7.f(this.R).b(this, jn7.X5);
        jn7.f(this.R).b(this, jn7.n2);
        jn7.f(this.R).b(this, jn7.k2);
        jn7.f(this.R).b(this, jn7.s);
        jn7.f(this.R).b(this, jn7.s2);
        jn7.f(this.R).b(this, jn7.u2);
        jn7.f(this.R).b(this, jn7.e2);
        jn7.f(this.R).b(this, jn7.z0);
        jn7.f(this.R).b(this, jn7.K);
        jn7.f(this.R).b(this, jn7.n1);
        jn7.f(this.R).b(this, jn7.t2);
        jn7.f(this.R).b(this, jn7.T2);
        jn7.f(this.R).b(this, jn7.a3);
        jn7.f(this.R).b(this, jn7.i5);
        jn7.f(this.R).b(this, jn7.S3);
        jn7.e().b(this, jn7.l4);
        this.D3 = activity;
        this.E3 = zu1Var;
        if (zu1Var != null) {
            this.v3 = zu1Var.getClassGuid();
        }
        this.b2 = wmaVar;
        this.c2 = wmaVar;
        wmaVar.setDelegate(this);
        this.q3 = uc7.e1().getBoolean("send_by_enter", false);
        rw1 rw1Var = new rw1(this, activity, (byte) 0);
        this.o2 = rw1Var;
        rw1Var.setClipChildren(false);
        rw1Var.setClipToPadding(false);
        rw1Var.setPadding(0, hl.L(1.0f), 0, 0);
        addView(rw1Var, tre.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        rw1 rw1Var2 = new rw1(this, activity, (byte) 1);
        this.n2 = rw1Var2;
        rw1Var2.setClipChildren(false);
        rw1Var.addView(rw1Var2, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        tw1 tw1Var = new tw1(this, activity);
        this.R0 = tw1Var;
        tw1Var.setContentDescription(ob6.M0(2131754880, null));
        tw1Var.setFocusable(true);
        int L = hl.L(7.5f);
        tw1Var.setPadding(L, L, L, L);
        int i7 = aob.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(tw1Var, i7, vnbVar, mode);
        int i8 = aob.i6;
        int J0 = J0(i8);
        int L2 = hl.L(1.0f);
        int L3 = hl.L(3.0f);
        tw1Var.setBackground(aob.W(hl.L(19.0f), J0, L2, L3, L2, L3));
        tw1Var.setOnClickListener(new pv1(this, (byte) 3));
        rw1Var2.addView(tw1Var, tre.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        O1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231789);
        yob.s(imageView, i7, vnbVar, mode);
        int J02 = J0(i8);
        int L4 = hl.L(1.0f);
        int L5 = hl.L(3.0f);
        imageView.setBackground(aob.W(hl.L(19.0f), J02, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(ob6.M0(2131754031, null));
        imageView.setOnClickListener(new sb1(this, vnbVar, (byte) 10));
        rw1Var2.addView(imageView, tre.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            if (zu1Var != null) {
                i3 = zu1Var.g4;
            } else {
                i3 = -1;
            }
            oob oobVar = new oob((byte) 3, activity, this);
            this.e2 = oobVar;
            oobVar.setOrientation(0);
            oobVar.setEnabled(false);
            oobVar.setClipChildren(false);
            rw1Var2.addView(oobVar, tre.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i3 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.x2 = imageView2;
                c43 c43Var = new c43(activity, 2131231513, i7);
                this.f0 = c43Var;
                imageView2.setImageDrawable(c43Var);
                this.f0.a(this.V2, false);
                if (this.V2) {
                    str = "AccDescrChanSilentOn";
                    i4 = 2131754902;
                } else {
                    str = "AccDescrChanSilentOff";
                    i4 = 2131754903;
                }
                imageView2.setContentDescription(ob6.M0(i4, str));
                yob.s(imageView2, i7, vnbVar, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                hf0 f0 = aob.f0(J0(i8), 1, -1);
                uob M = yob.M(i8);
                imageView2.setBackground(f0);
                yob.j(imageView2, f0, null, M, vnbVar);
                if (this.W2 && ((xy1Var = this.O3) == null || !xy1Var.e0())) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                imageView2.setVisibility(i5);
                oobVar.addView(imageView2, tre.o(44, 44));
                imageView2.setOnClickListener(new uw1(this, zu1Var, activity));
            }
            vw1 vw1Var = new vw1(this, activity, (byte) 0);
            this.g2 = vw1Var;
            vw1Var.setScaleType(scaleType);
            yob.s(vw1Var, i7, vnbVar, PorterDuff.Mode.MULTIPLY);
            vw1Var.setImageResource(2131232191);
            hf0 f02 = aob.f0(J0(i8), 1, -1);
            uob M2 = yob.M(i8);
            vw1Var.setBackground(f02);
            yob.j(vw1Var, f02, null, M2, vnbVar);
            rw1Var2.addView(vw1Var, tre.e(44, 44, 85));
            i = 4;
            vw1Var.setOnClickListener(new pv1(this, (byte) 4));
            vw1Var.setContentDescription(ob6.M0(2131754917, null));
            z2(1);
        } else {
            i = 4;
        }
        ImageView imageView3 = new ImageView(activity);
        this.i2 = imageView3;
        hc hcVar = new hc(activity);
        this.h2 = hcVar;
        imageView3.setImageDrawable(hcVar);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        yob.s(imageView3, i7, vnbVar, mode2);
        hf0 f03 = aob.f0(J0(i8), 1, hl.L(16.0f));
        uob M3 = yob.M(i8);
        imageView3.setBackground(f03);
        yob.j(imageView3, f03, null, M3, vnbVar);
        rw1Var.addView(imageView3, tre.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(ob6.M0(2131755003, null));
        iye.a(imageView3);
        imageView3.setOnClickListener(new pv1(this, (byte) 5));
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.j2 = imageView4;
        imageView4.setImageResource(2131231560);
        imageView4.setScaleType(scaleType);
        yob.s(imageView4, i7, vnbVar, mode2);
        hf0 f04 = aob.f0(J0(i8), 1, hl.L(16.0f));
        uob M4 = yob.M(i8);
        imageView4.setBackground(f04);
        yob.j(imageView4, f04, null, M4, vnbVar);
        rw1Var.addView(imageView4, tre.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(ob6.M0(2131754026, null));
        iye.a(imageView4);
        imageView4.setOnClickListener(new pv1(this, (byte) 6));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.Q3 != null) {
            c0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.q2 = imageView5;
        imageView5.setImageResource(2131232709);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        yob.s(imageView5, aob.Yl, vnbVar, mode);
        rw1Var.addView(imageView5, tre.e(44, 44, 85));
        rw1 rw1Var3 = new rw1(this, activity, (byte) 2);
        this.p2 = rw1Var3;
        rw1Var3.setClipChildren(false);
        rw1Var3.setClipToPadding(false);
        rw1Var.addView(rw1Var3, tre.e(100, 44, 85));
        a aVar = new a(this, activity, vnbVar);
        this.a1 = aVar;
        aVar.setSoundEffectsEnabled(false);
        rw1Var3.addView(aVar, tre.e(44, 44, 85));
        aVar.setFocusable(true);
        aVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231510).mutate();
        this.B4 = mutate;
        yob.x(this, mutate, i7, vnbVar, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231518).mutate();
        this.C4 = mutate2;
        yob.x(this, mutate2, i7, vnbVar, mode2);
        zw1 zw1Var = new zw1(this, activity);
        this.c1 = zw1Var;
        zw1Var.setImportantForAccessibility(2);
        int L6 = hl.L(10.0f);
        zw1Var.setPadding(L6, L6, L6, L6);
        aVar.addView(zw1Var, tre.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(i);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? sj2Var = new sj2();
        this.E2 = sj2Var;
        imageView6.setImageDrawable(sj2Var);
        imageView6.setContentDescription(ob6.M0(2131752570, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        hf0 f05 = aob.f0(J0(i8), 1, -1);
        uob M5 = yob.M(i8);
        imageView6.setBackground(f05);
        yob.j(imageView6, f05, null, M5, vnbVar);
        rw1Var3.addView(imageView6, tre.e(44, 44, 85));
        imageView6.setOnClickListener(new pv1(this, (byte) 11));
        if (c()) {
            i2 = 2131231515;
        } else {
            i2 = 2131232710;
        }
        bx1 bx1Var = new bx1(this, activity, i2, vnbVar);
        this.K0 = bx1Var;
        bx1Var.setVisibility(i);
        bx1Var.setContentDescription(ob6.M0(2131745368, null));
        bx1Var.setSoundEffectsEnabled(false);
        bx1Var.setScaleX(0.1f);
        bx1Var.setScaleY(0.1f);
        bx1Var.setAlpha(0.0f);
        rw1Var3.addView(bx1Var, tre.e(100, 44, 85));
        bx1Var.setOnClickListener(new pv1(this, (byte) 12));
        bx1Var.setOnLongClickListener(new iw1(this, (byte) 0));
        if (hl.A1()) {
            rw1Var3.setOnLongClickListener(new iw1(this, (byte) 0));
        }
        n4a n4aVar = new n4a(activity, vnbVar);
        this.J0 = n4aVar;
        n4aVar.setVisibility(i);
        n4aVar.setOnClickListener(new pv1(this, (byte) 17));
        rw1Var3.addView(n4aVar, tre.e(44, 44, 85));
        cz1 cz1Var = new cz1(activity);
        ema emaVar = (ema) cz1Var.c;
        this.G0 = cz1Var;
        emaVar.setTextSize(16);
        cz1Var.invalidate();
        cz1Var.setVisibility(i);
        cz1Var.setSoundEffectsEnabled(false);
        cz1Var.setScaleX(0.1f);
        cz1Var.setScaleY(0.1f);
        cz1Var.setAlpha(0.0f);
        cz1Var.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        emaVar.setGravity(21);
        cz1Var.invalidate();
        emaVar.setTextColor(J0(i7));
        cz1Var.invalidate();
        rw1Var3.addView(cz1Var, tre.e(74, 44, 85));
        cz1Var.setOnClickListener(new pv1(this, (byte) 20));
        cz1Var.setOnLongClickListener(new iw1(this, (byte) 1));
        SharedPreferences d1 = uc7.d1();
        this.m3 = d1.getInt("kbd_height", hl.L(200.0f));
        this.n3 = d1.getInt("kbd_height_land3", hl.L(200.0f));
        X1(false, false);
        P(false);
        J();
        b0();
    }

    public static boolean N(int r20, long r21, org.telegram.ui.ActionBar.e r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N(int, long, org.telegram.ui.ActionBar.e, java.lang.CharSequence):boolean");
    }

    public static int R2(int[] iArr, int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (i <= iArr[i2]) {
                return i2;
            }
        }
        return 7;
    }

    public static float S2(int i) {
        int i2 = i * 668265261;
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144789);
        return ((i3 ^ (i3 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static void T1(View view, boolean z, Paint paint) {
        if (view != null) {
            if (z) {
                view.setLayerType(2, paint);
            } else if (view.getLayerType() != 0) {
                view.setLayerType(0, null);
            }
        }
    }

    public static int T2(int i) {
        int green = Color.green(i) * 6;
        return (Color.blue(i) + (green + (Color.red(i) * 3))) / 10;
    }

    public static float V2(float f, float f2, float f3) {
        float i = Utilities.i((f3 - f) / (f2 - f), 1.0f, 0.0f);
        return xnb.B(i, 2.0f, 3.0f, i * i);
    }

    public static float W2(float f, float f2, float f3, float f4, float f5, float f6) {
        return xnb.z(f6, 0.2f, 0.9f, Utilities.i((((float) Math.hypot(f3 - f, f4 - f2)) / Math.max(1.0f, Math.abs(f5))) * 1.1f, 0.6f, 0.26f));
    }

    public r47 getThreadMessage() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        r47 r47Var;
        zu1 zu1Var = this.E3;
        if (zu1Var != null && (r47Var = zu1Var.m4) != null) {
            return r47Var.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null && zu1Var.x4) {
            return this.F3 + "_" + zu1Var.c();
        }
        return String.valueOf(this.F3);
    }

    public static CharSequence q(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        hm hmVar;
        Collections.sort(arrayList, ls6.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(no4.a(charSequence, false));
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
        boolean z3 = true;
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                try {
                    TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i4);
                    if (messageEntity.offset + messageEntity.length <= spannableStringBuilder.length()) {
                        if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i8c i8cVar = new i8c("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i5 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i8cVar, i5, messageEntity.length + i5, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            i8c i8cVar2 = new i8c("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i6 = messageEntity.offset;
                            spannableStringBuilder.setSpan(i8cVar2, i6, messageEntity.length + i6, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.a |= 4;
                            smb smbVar = new smb(obj2, 0);
                            int i7 = messageEntity.offset;
                            ls6.f(smbVar, i7, messageEntity.length + i7, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.a |= 1;
                                smb smbVar2 = new smb(obj3, 0);
                                int i8 = messageEntity.offset;
                                ls6.f(smbVar2, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.a |= 2;
                                smb smbVar3 = new smb(obj4, 0);
                                int i9 = messageEntity.offset;
                                ls6.f(smbVar3, i9, messageEntity.length + i9, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.a |= 8;
                                smb smbVar4 = new smb(obj5, 0);
                                int i10 = messageEntity.offset;
                                ls6.f(smbVar4, i10, messageEntity.length + i10, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.a |= 16;
                                smb smbVar5 = new smb(obj6, 0);
                                int i11 = messageEntity.offset;
                                ls6.f(smbVar5, i11, messageEntity.length + i11, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                h8c h8cVar = new h8c(messageEntity.url, null);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(h8cVar, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.a |= 128;
                                int i13 = messageEntity.offset;
                                obj7.b = i13;
                                obj7.c = i13 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i14 = messageEntity.offset;
                                no4 no4Var = new no4(spannableStringBuilder.subSequence(i14, messageEntity.length + i14).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i15 = messageEntity.offset;
                                spannableStringBuilder.setSpan(no4Var, i15, messageEntity.length + i15, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.a |= 256;
                                smb smbVar6 = new smb(obj8, 0);
                                int i16 = messageEntity.offset;
                                ls6.f(smbVar6, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    hmVar = new hm(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    hmVar = new hm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(hmVar, i17, messageEntity.length + i17, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        if (arrayList != null) {
            TreeSet treeSet = new TreeSet();
            HashMap hashMap = new HashMap();
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                TLRPC.MessageEntity messageEntity2 = (TLRPC.MessageEntity) arrayList.get(i18);
                if (messageEntity2.offset + messageEntity2.length <= spannableStringBuilder.length()) {
                    int i19 = messageEntity2.offset;
                    int i20 = messageEntity2.length + i19;
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityBlockquote) {
                        treeSet.add(Integer.valueOf(i19));
                        treeSet.add(Integer.valueOf(i20));
                        Integer valueOf = Integer.valueOf(i19);
                        if (hashMap.containsKey(Integer.valueOf(i19))) {
                            i = ((Integer) hashMap.get(Integer.valueOf(i19))).intValue();
                        } else {
                            i = 0;
                        }
                        if (messageEntity2.collapsed) {
                            i2 = 16;
                        } else {
                            i2 = 1;
                        }
                        hashMap.put(valueOf, Integer.valueOf(i | i2));
                        Integer valueOf2 = Integer.valueOf(i20);
                        if (hashMap.containsKey(Integer.valueOf(i20))) {
                            i3 = ((Integer) hashMap.get(Integer.valueOf(i20))).intValue();
                        } else {
                            i3 = 0;
                        }
                        hashMap.put(valueOf2, Integer.valueOf(i3 | 2));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            int i21 = 0;
            int i22 = 0;
            boolean z4 = false;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if (i21 != intValue) {
                    int i23 = intValue - 1;
                    z2 = z3;
                    int i24 = (i23 >= 0 && i23 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i23) == '\n') ? intValue - 1 : intValue;
                    if (i22 > 0) {
                        r19.c(spannableStringBuilder, i21, i24, z4);
                    }
                    i21 = intValue + 1;
                    if (i21 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                        i21 = intValue;
                    }
                } else {
                    z2 = z3;
                }
                if ((intValue2 & 2) != 0) {
                    i22--;
                }
                if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                    i22++;
                    if ((intValue2 & 16) != 0) {
                        z4 = z2;
                    } else {
                        z4 = false;
                    }
                }
                z3 = z2;
            }
            z = z3;
            if (i21 < spannableStringBuilder.length() && i22 > 0) {
                r19.c(spannableStringBuilder, i21, spannableStringBuilder.length(), z4);
            }
        } else {
            z = true;
        }
        CharSequence m = pv3.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
        if (arrayList != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TLRPC.MessageEntity messageEntity3 = (TLRPC.MessageEntity) arrayList.get(size);
                    if ((messageEntity3 instanceof TLRPC.TL_messageEntityPre) && messageEntity3.offset + messageEntity3.length <= m.length()) {
                        if (!(m instanceof Spannable)) {
                            m = new SpannableStringBuilder(m);
                        }
                        ((SpannableStringBuilder) m).insert(messageEntity3.offset + messageEntity3.length, (CharSequence) "```\n");
                        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) m;
                        int i25 = messageEntity3.offset;
                        StringBuilder sb = new StringBuilder();
                        sb.append("```");
                        String str = messageEntity3.language;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("\n");
                        spannableStringBuilder2.insert(i25, (CharSequence) sb.toString());
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, z);
            }
        }
        return m;
    }

    private void setHintGlass(kg5 kg5Var) {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            kg5Var.k(zu1Var.L);
        }
    }

    public void setSlowModeButtonVisible(boolean z) {
        int i;
        int i2;
        float f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        cz1 cz1Var = this.G0;
        cz1Var.setVisibility(i);
        if (z) {
            if (cz1Var.b) {
                f = 26.0f;
            } else {
                f = 16.0f;
            }
            i2 = hl.L(f);
        } else {
            i2 = 0;
        }
        tx1 tx1Var = this.F0;
        if (tx1Var != null && tx1Var.getPaddingRight() != i2) {
            this.F0.setPadding(0, hl.L(9.0f), i2, hl.L(10.0f));
        }
    }

    public final boolean A() {
        ep0 ep0Var = this.m0;
        if (ep0Var != null && ep0Var.w) {
            return true;
        }
        return false;
    }

    public final void A0(boolean z) {
        vw1 vw1Var = this.g2;
        if (vw1Var != null) {
            vw1Var.invalidate();
        }
        oob oobVar = this.e2;
        if (oobVar != null && !this.N2 && !this.u3 && !O2() && this.Q3 == null) {
            tx1 tx1Var = this.F0;
            if (tx1Var == null || tx1Var.length() <= 0) {
                this.B7 = 0L;
                if (z) {
                    this.F = 0.0f;
                    s2();
                }
                x1();
                this.y = 0.0f;
                this.C7 = hl.L(8.0f);
                s2();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(hl.L(8.0f), 0.0f);
                ofFloat.addUpdateListener(new qv1(this, (byte) 12));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(oobVar, this.O4, 1.0f), ofFloat, z());
                if (vw1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.f2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.f2 = null;
                    }
                    if (z || vw1Var.getAlpha() < 0.05f) {
                        this.k2 = 0.0f;
                        vw1Var.setAlpha(0.0f);
                        vw1Var.setScaleX(0.88f);
                        vw1Var.setScaleY(0.88f);
                    }
                    this.k2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(vw1Var, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(vw1Var, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(vw1Var, View.SCALE_Y, 1.0f));
                }
                animatorSet.setDuration(220L);
                animatorSet.setInterpolator(k43.h);
                animatorSet.start();
            }
        }
    }

    public final void A1() {
        if (this.J1 || this.S1 != null) {
            hl.r(this.W1);
            ValueAnimator valueAnimator = this.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V1 = null;
            }
            boc bocVar = this.S1;
            if (bocVar != null) {
                if (bocVar.c.hasFocus()) {
                    hl.t1(this.S1.c);
                    this.S1.c.clearFocus();
                }
                this.S1.setCollapsing(true);
            }
            this.T1 = false;
            this.Z5 = false;
            V1(false);
            v(0.0f);
            x59 x59Var = this.i1;
            if (x59Var != null) {
                x59Var.setVisibility(8);
            }
            e29 e29Var = this.h1;
            if (e29Var != null) {
                e29Var.setVisibility(0);
            }
            l lVar = this.D2;
            if (lVar != null) {
                this.b6 = 0.0f;
                lVar.setTranslationY(this.c6 + this.Q7);
            }
            bx1 bx1Var = this.K0;
            if (bx1Var != null) {
                hl.r(this.a6);
                bx1Var.setIconDimmed(false);
            }
        }
    }

    public final void A2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.A2(boolean):void");
    }

    public final boolean B() {
        sy1 C = C();
        if (!TextUtils.equals(C.a, this.R2.a) || !ls6.M(this.R2.b, C.b)) {
            return true;
        }
        return false;
    }

    public final fy1 B0(r47 r47Var, boolean z) {
        CharSequence textToUse;
        ?? r47Var2 = new r47(r47Var.K1, r47Var.k, true, true);
        if (z) {
            tx1 tx1Var = this.F0;
            if (tx1Var == null) {
                textToUse = "";
            } else {
                textToUse = tx1Var.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList Y = ls6.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            r47.b(spannableStringBuilder, Y, true, true, false, true, 0);
            r47Var2.z = r47.A5(pv3.m(spannableStringBuilder, aob.o2.getFontMetricsInt(), false, null, 0), Y, aob.o2.getFontMetricsInt(), false);
        }
        return r47Var2;
    }

    public final void B1() {
        long j;
        int i;
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.setPlaying(false);
        }
        if (this.T3 != null) {
            xy1 xy1Var = this.O3;
            if (this.P) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            xy1Var.H1(2, 0, i, this.o7, 0L, true);
            this.o7 = 0L;
            this.K0.setEffect(0L);
        } else {
            r47 r47Var = MediaController.z().v0;
            if (r47Var != null && r47Var == this.S3) {
                MediaController.z().m(true, true, false, false);
            }
        }
        if (this.R3 != null) {
            if (f11.a) {
                uh9.s(this.R3, new StringBuilder("delete file "));
            }
            new File(this.R3).delete();
        }
        MediaController.z().j(true);
        ls6 d0 = ls6.d0(this.R);
        long j2 = this.F3;
        zu1 zu1Var = this.E3;
        if (zu1Var != null && zu1Var.x4) {
            j = zu1Var.c();
        } else {
            j = 0;
        }
        d0.D1(j2, j, null);
        MediaController.z().F0(0, 0, false, false);
        this.X1 = 0L;
        P0(false);
        P(true);
    }

    public final void B2() {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setTranslationX(this.I + this.H);
        }
    }

    public final sy1 C() {
        CharSequence textToUse;
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            textToUse = "";
        } else {
            textToUse = tx1Var.getTextToUse();
        }
        CharSequence[] charSequenceArr = {hl.m1(textToUse)};
        ArrayList Y = ls6.d0(this.R).Y(charSequenceArr, true, true);
        CharSequence charSequence = charSequenceArr[0];
        int size = Y.size();
        for (int i = 0; i < size; i++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) Y.get(i);
            if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                messageEntity.length = charSequence.length() - messageEntity.offset;
            }
        }
        ?? obj = new Object();
        obj.a = charSequence.toString();
        obj.b = Y;
        return obj;
    }

    public final void C0() {
        if (this.z6 == null && this.F0 != null) {
            sn3 sn3Var = new sn3(this.F0);
            this.z6 = sn3Var;
            sn3Var.C = true;
            sn3Var.D = true;
            sn3Var.F = 0.0f;
            sn3Var.E = hl.L(5.0f);
            z92 G0 = G0();
            if (G0 != null) {
                if (this.L6 == null) {
                    this.L6 = new gn3();
                }
                if (G0.n == null) {
                    G0.n = new h01(this, G0, (byte) 20);
                }
            }
            int max = Math.max(this.F0.getWidth(), hl.q.x);
            sn3 sn3Var2 = this.z6;
            int L = hl.L(160.0f);
            sn3Var2.getClass();
            mva mvaVar = sn3Var2.c;
            if (max > 0 && L > 0) {
                int L2 = (hl.L(4.0f) + max) * L;
                int[] iArr = sn3Var2.G;
                if (iArr == null || iArr.length < L2) {
                    try {
                        sn3Var2.G = new int[L2];
                    } catch (Throwable unused) {
                    }
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(hl.L(24.0f), hl.L(12.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    int i = sn3Var2.w;
                    int i2 = sn3Var2.x;
                    sn3Var2.w = 0;
                    sn3Var2.x = createBitmap.getHeight();
                    int f = sn3Var2.f(64, createBitmap, true);
                    for (int i3 = 0; i3 < f; i3++) {
                        float[] fArr = sn3Var2.i;
                        int i4 = i3 * 3;
                        mvaVar.h(fArr[i4], fArr[i4 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
                    }
                    mvaVar.b(canvas, 1.0f);
                    mvaVar.a();
                    sn3Var2.k = 0;
                    sn3Var2.w = i;
                    sn3Var2.x = i2;
                    createBitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void C1(TL_iv.RichMessage richMessage) {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            ls6.d0(this.R).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void C2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        float f;
        my1 my1Var;
        this.B0 = false;
        boolean z7 = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        float f2 = 1.0f;
        if (chat != null) {
            if (!xc2.v(chat) && (!xc2.s(chat) || !this.T2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.b1 = z5;
            this.b = xc2.t(chat);
            boolean q = xc2.q(chat);
            this.A0 = q;
            if (!this.b && !q) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.B0 = z6;
            if (z6) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            this.n = f;
            x2();
            if (!this.B0 && (my1Var = this.V0) != null) {
                my1Var.J(-this.F3, !this.A0, !this.b);
            }
            this.y0 = xc2.s(chat);
            this.z0 = xc2.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            if (chat != null) {
                if (!xc2.v(chat)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = userFull.voice_messages_forbidden;
            }
            this.k1 = z;
            if (chat != null && xc2.s(chat) && this.T2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.o1 = z2;
        }
        if (this.k1 && this.A0 && !this.T7 && pie.a(getContext())) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.l1 = z3;
        if (this.n1 && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.b1 = z4;
        l0();
        if (this.k1 && !this.m1) {
            this.m1 = true;
            DictationAsr.i(this.q1);
            if (!qn3.h()) {
                qn3.j();
            }
        }
        if (this.b1) {
            f2 = 0.5f;
        }
        a aVar = this.a1;
        aVar.setAlpha(f2);
        aVar.invalidate();
        if (this.b1) {
            i = J0(aob.Nl);
        } else {
            i = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        zw1 zw1Var = this.c1;
        zw1Var.setColorFilter(porterDuffColorFilter);
        zw1Var.invalidate();
        y2(false);
        boolean z8 = this.d1;
        if (!this.y0 && z8) {
            z8 = false;
        }
        if (this.l1 && this.o1) {
            z8 = uc7.e1().getBoolean("currentModeVideo", false);
        }
        if (!this.z0 && !z8 && !this.l1) {
            if (!this.T2) {
                z7 = false;
            }
        } else {
            z7 = z8;
        }
        if (this.l1 && !this.o1) {
            z7 = false;
        }
        X1(z7, false);
        zy1 zy1Var = this.a2;
        if (zy1Var != null) {
            zy1Var.d(j0());
        }
        zw1Var.invalidate();
    }

    public final float D(boolean z) {
        float f;
        float f2;
        int i;
        fm0 fm0Var = this.L7;
        t84 t84Var = this.K7;
        if (z) {
            if (t84Var.h) {
                f = t84Var.g;
            } else {
                f = t84Var.f;
            }
            f2 = fm0Var.f ? 1.0f : 0.0f;
        } else {
            f = t84Var.f;
            f2 = fm0Var.e;
        }
        View view = this.v2;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        return (i * f2) + f;
    }

    public final bn3 D0() {
        bn3 bn3Var = this.j1;
        if (bn3Var == null) {
            bn3 bn3Var2 = new bn3(getContext(), new d(this));
            this.j1 = bn3Var2;
            return bn3Var2;
        }
        return bn3Var;
    }

    public final void D1(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        pv3.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        hm[] hmVarArr = (hm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), hm.class);
        if (hmVarArr != null) {
            for (hm hmVar : hmVarArr) {
                hmVar.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), wl.f());
            }
        }
        r19.a(spannableStringBuilder2);
        T();
        setFieldText(spannableStringBuilder2);
        F1(z, i, i2, 0L, true);
    }

    public void D2(int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D2(int, boolean):void");
    }

    public final boolean E() {
        tx1 tx1Var;
        Editable text;
        zu1 zu1Var = this.E3;
        if (zu1Var != null && !zu1Var.y() && !this.k6) {
            bn3 bn3Var = this.j1;
            if (bn3Var == null || !bn3Var.q()) {
                if (this.s2) {
                    if (this.t2 != null) {
                        return true;
                    }
                    return false;
                } else if (this.Q3 == null && (tx1Var = this.F0) != null && (text = tx1Var.getText()) != null && !TextUtils.isEmpty(text.toString().trim())) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final snc E0() {
        snc sncVar = this.r1;
        if (sncVar == null) {
            snc sncVar2 = new snc(getContext(), new c(this));
            this.r1 = sncVar2;
            return sncVar2;
        }
        return sncVar;
    }

    public boolean E1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.E1():boolean");
    }

    public final void E2() {
        int J0 = J0(aob.ag);
        int J02 = J0(aob.Je);
        int J03 = J0(aob.Vf);
        e29 e29Var = this.h1;
        if (e29Var != null) {
            e29Var.h(J0, "Cup Red");
            this.h1.h(J0, "Box Red");
            this.h1.h(J03, "Cup Grey");
            this.h1.h(J03, "Box Grey");
            this.h1.h(J03, "Box_Grey 2");
            this.h1.h(J03, "Line 1");
            this.h1.h(J03, "Line 2");
            this.h1.h(J03, "Line 3");
            this.h1.h(J02, "Line 1 Dup");
            this.h1.h(J02, "Line 2 Dup");
            this.h1.h(J02, "Line 3 Dup");
        }
    }

    public final void F() {
        b6 b6Var = this.e1;
        if (b6Var != null) {
            b6Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.i3 = null;
        Y0();
        if (this.e2 != null) {
            this.y = 0.0f;
            s2();
        }
        SlideTextView slideTextView = this.Z1;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.O3.a();
        I2(true);
    }

    public boolean F1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.F1(boolean, int, int, long, boolean):boolean");
    }

    public final void F2() {
        boolean z;
        zj9 zj9Var = this.r2;
        if (zj9Var != null) {
            boolean z2 = this.s2;
            if (this.t2 != null && this.O2 == null) {
                z = true;
            } else {
                z = false;
            }
            this.s2 = z;
            bx1 bx1Var = this.K0;
            ImageView imageView = this.S0;
            tw1 tw1Var = this.R0;
            if (z) {
                zj9Var.setResourcesProvider(this.K4);
                this.r2.set(this.t2);
                this.r2.setVisibility(0);
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    tx1Var.setVisibility(8);
                }
                tw1Var.setVisibility(8);
                imageView.setVisibility(0);
                bx1Var.setLocked(!yac.h(this.R).p());
            } else {
                zj9Var.setVisibility(8);
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    tx1Var2.setVisibility(0);
                }
                tw1Var.setVisibility(0);
                imageView.setVisibility(8);
                bx1Var.setLocked(false);
            }
            w2();
            if (z2 != this.s2) {
                P(true);
            }
        }
    }

    public final void G() {
        int i;
        if (this.T2 && this.d1) {
            xy1 xy1Var = this.O3;
            if (this.P) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            xy1Var.H1(5, 0, i, this.o7, 0L, true);
            this.o7 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.O3.z0(0);
            MediaController.z().F0(0, 0, false, false);
        }
        this.u3 = false;
        D2(2, true);
    }

    public final z92 G0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof z92) {
                return (z92) parent;
            }
        }
        return null;
    }

    public final void G1(boolean z, boolean z2, boolean z3) {
        if ((this.y3 != z || this.z3 != z2) && this.V0 != null) {
            if (this.X0 && !z3) {
                this.v4 = true;
                N0(false);
            } else if (z3) {
                p1();
            }
        }
        this.x3 = true;
        this.y3 = z;
        this.z3 = z2;
        my1 my1Var = this.V0;
        if (my1Var != null) {
            my1Var.H(true, z, z2, true);
        }
        O1(false, !this.Y2);
    }

    public final void G2(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        Integer num;
        int i3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean y = wf3.y(this.F3);
        ImageView imageView = this.x2;
        int i4 = 0;
        if (y) {
            TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
            this.V2 = uc7.s1(this.R).W3.getBoolean("silent_" + this.F3, false);
            if (xc2.T(M0) && ((M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !M0.megagroup)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.W2 = z2;
            if (imageView != null) {
                c43 c43Var = this.f0;
                if (c43Var == null) {
                    c43Var = new c43(getContext(), 2131231513, aob.Nl);
                    this.f0 = c43Var;
                }
                c43Var.a(this.V2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z2 = false;
            }
            oob oobVar = this.e2;
            if (oobVar != null) {
                if (oobVar.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                z2(i3);
            }
        } else {
            z2 = false;
        }
        if (this.O3 != null && !c() && this.O3.e0()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.A2 && !this.u3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            g0();
        }
        cx1 cx1Var = this.y2;
        if (cx1Var != null) {
            if ((cx1Var.getTag() != null && z4) || (this.y2.getTag() == null && !z4)) {
                if (imageView != null) {
                    if (z3 || !z2 || this.y2.getVisibility() == 0) {
                        i4 = 8;
                    }
                    if (i4 != imageView.getVisibility()) {
                        imageView.setVisibility(i4);
                        return;
                    }
                    return;
                }
                return;
            }
            cx1 cx1Var2 = this.y2;
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            cx1Var2.setTag(num);
        } else if (imageView != null) {
            if (!z3 && z2) {
                i = 0;
            } else {
                i = 8;
            }
            if (i != imageView.getVisibility()) {
                imageView.setVisibility(i);
            }
        }
        AnimatorSet animatorSet = this.B2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.B2 = null;
        }
        float f4 = 0.0f;
        float f5 = 0.1f;
        if (z && !z2) {
            cx1 cx1Var3 = this.y2;
            if (cx1Var3 != null) {
                if (z4) {
                    cx1Var3.setVisibility(0);
                }
                this.y2.setPivotX(hl.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.B2 = animatorSet2;
                cx1 cx1Var4 = this.y2;
                if (z4) {
                    f4 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cx1Var4, View.ALPHA, f4);
                cx1 cx1Var5 = this.y2;
                if (z4) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cx1Var5, View.SCALE_X, f3);
                cx1 cx1Var6 = this.y2;
                if (z4) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cx1Var6, View.SCALE_Y, f5));
                this.B2.setDuration(180L);
                this.B2.addListener(new ow1(this, z4, (byte) 4));
                this.B2.start();
                return;
            }
            return;
        }
        cx1 cx1Var7 = this.y2;
        if (cx1Var7 != null) {
            if (z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            cx1Var7.setVisibility(i2);
            cx1 cx1Var8 = this.y2;
            if (z4) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            cx1Var8.setAlpha(f);
            cx1 cx1Var9 = this.y2;
            if (z4) {
                f2 = 1.0f;
            } else {
                f2 = 0.1f;
            }
            cx1Var9.setScaleX(f2);
            cx1 cx1Var10 = this.y2;
            if (z4) {
                f5 = 1.0f;
            }
            cx1Var10.setScaleY(f5);
            if (imageView != null) {
                if (!z2 || this.y2.getVisibility() == 0) {
                    i4 = 8;
                }
                imageView.setVisibility(i4);
            }
            this.y2.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z2) {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    public final void H() {
        vw1 vw1Var;
        zu1 zu1Var;
        if (this.M == null && (vw1Var = this.z2) != null && vw1Var.getRight() != 0 && (zu1Var = this.E3) != null && pj0.d(zu1Var.s8)) {
            SharedPreferences sharedPreferences = uc7.s1(this.R).X3;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + zu1Var.a(), true)) {
                SharedPreferences.Editor edit = uc7.s1(this.R).X3.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + zu1Var.a(), false).apply();
                kg5 kg5Var = new kg5(getContext(), 3);
                this.M = kg5Var;
                kg5Var.q(13.0f);
                setHintGlass(this.M);
                this.M.p(true);
                H1();
                this.M.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
                this.M.o(1.0f, -((getWidth() - hl.L(12.0f)) - ((this.z2.getMeasuredWidth() / 2.0f) + (this.z2.getX() + (this.e2.getX() + this.n2.getX())))));
                addView(this.M, tre.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                kg5 kg5Var2 = this.M;
                kg5Var2.r0 = new fw1(this, (byte) 24);
                kg5Var2.d = 8000L;
                kg5Var2.v();
            }
        }
    }

    public final long H0() {
        if (this.F1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.F1;
            if (uptimeMillis < j) {
                return Math.max(16L, j - SystemClock.uptimeMillis());
            }
            return 250L;
        }
        return 250L;
    }

    public final void H1() {
        kg5 kg5Var = this.M;
        if (kg5Var == null) {
            return;
        }
        kg5Var.t(pv3.o(hl.S2(ob6.a0(null, null, 2131743417, lbc.k(this.E3.h(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new mv1(this, (byte) 10)));
        kg5 kg5Var2 = this.M;
        kg5Var2.h = kg5.a(kg5Var2.getText(), this.M.getTextPaint());
    }

    public final void H2() {
        I2(true);
    }

    public final void I() {
        boolean z;
        tx1 tx1Var = this.F0;
        if ((tx1Var == null || TextUtils.isEmpty(tx1Var.getText())) && !this.o3 && !this.Z3 && !U0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            W();
        }
        ep0 ep0Var = this.m0;
        if (ep0Var != null) {
            boolean z2 = ep0Var.f;
            if (z2 != z) {
                ep0Var.f = z;
                ep0Var.requestLayout();
                ep0Var.invalidate();
            }
            if (z2 != this.m0.f) {
                tw1 tw1Var = this.R0;
                Float valueOf = Float.valueOf(tw1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(tw1Var, valueOf);
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    hashMap.put(tx1Var2, Float.valueOf(tx1Var2.getX()));
                }
            }
        }
    }

    public final boolean I0(float[] fArr) {
        bx1 bx1Var = this.K0;
        if (bx1Var != null && bx1Var.p0) {
            bx1Var.getLocationInWindow(r2);
            int[] iArr = {iArr[0] - Math.round(bx1Var.getTranslationX()), iArr[1] - Math.round(bx1Var.getTranslationY())};
            View rootView = bx1Var.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + bx1Var.k0) - bx1Var.m0 <= rootView.getWidth() && iArr[0] + bx1Var.k0 + bx1Var.m0 >= 0.0f)) {
                int i = iArr[0];
                fArr[0] = i + bx1Var.k0;
                int i2 = iArr[1];
                fArr[1] = i2 + bx1Var.l0;
                fArr[2] = bx1Var.m0;
                fArr[3] = i + bx1Var.n0;
                fArr[4] = i2 + bx1Var.o0;
                return true;
            }
        }
        return false;
    }

    public final void I1(zh6 zh6Var, boolean z) {
        this.A7 = zh6Var;
        if (zh6Var.m() == 1 && ((TL_bots.BotInfo) zh6Var.n(0)).user_id == this.F3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) zh6Var.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.U7 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.U7 = 2;
            } else {
                this.U7 = 1;
            }
        } else {
            this.U7 = 1;
        }
        dp0 dp0Var = this.o0;
        if (dp0Var != null) {
            dp0Var.E(zh6Var);
        }
        t2(z);
        M(z);
    }

    public void I2(boolean z) {
        J2(false, z);
    }

    public final void J() {
        zu1 zu1Var = this.E3;
        if (zu1Var == null) {
            return;
        }
        C2(zu1Var.e, zu1Var.s8);
    }

    public final int J0(int i) {
        if (i == aob.Uf) {
            i = aob.Pe;
        }
        vnb vnbVar = this.K4;
        if (vnbVar != null) {
            return vnbVar.h(i);
        }
        return aob.w0(null, i, false);
    }

    public final void J1(int i, boolean z, boolean z2) {
        this.d3 = i;
        if (this.e3 == z) {
            return;
        }
        this.e3 = z;
        t2(z2);
    }

    public final void J2(boolean z, boolean z2) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z3;
        float f;
        float f2;
        float f3;
        ValueAnimator valueAnimator;
        tx1 tx1Var;
        c8a c8aVar;
        c8a c8aVar2;
        rw1 rw1Var;
        if (this.O3 != null) {
            b0();
            if (this.T7) {
                peer2 = this.O3.k();
                chat = null;
            } else {
                TLRPC.Chat M0 = uc7.s1(this.R).M0(Long.valueOf(-this.F3));
                TLRPC.ChatFull N0 = uc7.s1(this.R).N0(-this.F3);
                if (N0 != null) {
                    peer = N0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = M0;
                peer2 = peer3;
            }
            if (peer2 == null && this.O3.y() != null && !this.O3.y().peers.isEmpty()) {
                peer2 = this.O3.y().peers.get(0).peer;
            }
            zu1 zu1Var = this.E3;
            boolean z4 = true;
            if (!z && peer2 != null && ((this.O3.y() == null || this.O3.y().peers.size() > 1) && !T0() && !X0() && (((rw1Var = this.f1) == null || rw1Var.getVisibility() != 0) && ((this.T7 || ((!xc2.V(chat) || xc2.k(chat)) && !xc2.p0(chat))) && (zu1Var == null || zu1Var.g4 != 9))))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                h0();
            }
            if (peer2 != null) {
                int i = (peer2.channel_id > 0L ? 1 : (peer2.channel_id == 0L ? 0 : -1));
                int i2 = this.R;
                if (i != 0) {
                    TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(peer2.channel_id));
                    if (M02 != null && (c8aVar2 = this.q0) != null) {
                        c8aVar2.setAvatar(M02);
                        this.q0.setContentDescription(ob6.a0(null, null, 2131754771, M02.title));
                    }
                } else {
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(peer2.user_id));
                    if (X1 != null && (c8aVar = this.q0) != null) {
                        c8aVar.setAvatar(X1);
                        this.q0.setContentDescription(ob6.a0(null, null, 2131754771, lv2.m(0, X1.first_name, X1.last_name)));
                    }
                }
            }
            c8a c8aVar3 = this.q0;
            if (c8aVar3 == null || c8aVar3.getVisibility() != 0) {
                z4 = false;
            }
            int L = hl.L(2.0f);
            float f4 = 1.0f;
            float f5 = 0.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f4 = 0.0f;
            }
            c8a c8aVar4 = this.q0;
            if (c8aVar4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c8aVar4.getLayoutParams();
                c8a c8aVar5 = this.q0;
                if (z3) {
                    f3 = ((-c8aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f2 = 0.0f;
                } else {
                    f2 = ((-c8aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (z4 != z3) {
                c8a c8aVar6 = this.q0;
                if (c8aVar6 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) c8aVar6.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.q0.setTag(null);
                }
                int i3 = 8;
                tw1 tw1Var = this.R0;
                if (!z3 && this.q0 != null && j0() && this.u3 && (tx1Var = this.F0) != null && z2) {
                    float translationX = this.F0.getTranslationX() + tx1Var.getLeft();
                    float translationX2 = tw1Var.getTranslationX() + tw1Var.getLeft();
                    this.q0.setVisibility(8);
                    this.q0.setTranslationX(0.0f);
                    this.q0.setAlpha(0.0f);
                    tx1 tx1Var2 = this.F0;
                    tx1Var2.getViewTreeObserver().addOnPreDrawListener(new hy1(this, tx1Var2, translationX, translationX2));
                } else if ((this.T7 || (zu1Var != null && zu1Var.b7() == 0 && zu1Var.g6)) && z2) {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    c8a c8aVar7 = this.q0;
                    if (c8aVar7 != null) {
                        c8aVar7.setTranslationX(f3);
                    }
                    this.H = f3;
                    B2();
                    float f6 = f2;
                    float f7 = f4;
                    float f8 = f3;
                    duration.addUpdateListener(new am(this, f8, f6, f, f7, (byte) 2));
                    duration.addListener(new iy1(this, z3, f, f8, f7, f6));
                    duration.start();
                    c8a c8aVar8 = this.q0;
                    if (c8aVar8 != null) {
                        c8aVar8.setTag(duration);
                    }
                } else {
                    float f9 = f4;
                    boolean z5 = z3;
                    float f10 = f2;
                    if (z5) {
                        h0();
                    }
                    c8a c8aVar9 = this.q0;
                    if (c8aVar9 != null) {
                        if (z5) {
                            i3 = 0;
                        }
                        c8aVar9.setVisibility(i3);
                        this.q0.setTranslationX(f10);
                    }
                    if (z5) {
                        f5 = f10;
                    }
                    tw1Var.setTranslationX(f5);
                    this.H = f5;
                    B2();
                    c8a c8aVar10 = this.q0;
                    if (c8aVar10 != null) {
                        c8aVar10.setAlpha(f9);
                        this.q0.setTag(null);
                    }
                }
            }
        }
    }

    public final void K() {
        vnb vnbVar;
        BlendMode blendMode;
        int i = Build.VERSION.SDK_INT;
        vw1 vw1Var = this.g2;
        tw1 tw1Var = this.R0;
        boolean z = false;
        if (i >= 29 && ((vnbVar = this.K4) == null ? aob.I.o() : vnbVar.a())) {
            if (this.p7 == null) {
                this.p7 = new Paint();
            }
            Paint paint = this.q7;
            if (paint == null) {
                paint = new Paint();
                this.q7 = paint;
            }
            Paint[] paintArr = {this.p7, paint};
            for (int i2 = 0; i2 < 2; i2++) {
                Paint paint2 = paintArr[i2];
                blendMode = BlendMode.PLUS;
                paint2.setBlendMode(blendMode);
                paint2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.p7.setAlpha(179);
            this.p7.setColorFilter(new PorterDuffColorFilter(vm2.f(0.2f, -1, J0(aob.Pe) | (-16777216)), PorterDuff.Mode.SRC_IN));
            this.q7.setAlpha(138);
            this.r7 = true;
            T1(tw1Var, true, this.p7);
            T1(vw1Var, true, this.p7);
            tx1 tx1Var = this.F0;
            if (tx1Var != null && tx1Var.length() == 0) {
                z = true;
            }
            T1(tx1Var, z, this.q7);
        } else if (this.r7) {
            this.r7 = false;
            T1(tw1Var, false, null);
            T1(vw1Var, false, null);
            T1(this.F0, false, null);
        }
    }

    public final boolean K0() {
        if (this.U7 == 3) {
            return true;
        }
        return false;
    }

    public final void K1(defpackage.r47 r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.K1(r47, boolean, boolean):void");
    }

    public final void K2() {
        int b;
        int i;
        int i2;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z = true;
        if (this.l5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.l5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            z2(this.l7);
        }
        if (this.T7) {
            X();
            boolean w = w();
            int i3 = this.R;
            if (w) {
                int[] iArr = uc7.s1(i3).T3;
                if (iArr != null && iArr.length > 2) {
                    b = iArr[2];
                } else {
                    b = 400;
                }
            } else {
                b = eg5.b(i3, (int) starsPrice, 1);
            }
            if (this.d0 != b) {
                this.d0 = b;
                if (b > 0) {
                    int i4 = b - this.e0;
                    if (this.T7) {
                        i = 5;
                    } else {
                        i = 100;
                    }
                    if (i4 <= i) {
                        if (i4 < -9999) {
                            i4 = -9999;
                        }
                        X();
                        NumberTextView numberTextView = this.c0;
                        if (numberTextView.getVisibility() != 0) {
                            z = false;
                        }
                        numberTextView.a(i4, z);
                        if (this.c0.getVisibility() != 0) {
                            this.c0.setVisibility(0);
                            this.c0.setAlpha(0.0f);
                            this.c0.setScaleX(0.5f);
                            this.c0.setScaleY(0.5f);
                        }
                        this.c0.animate().setListener(null).cancel();
                        this.c0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                        NumberTextView numberTextView2 = this.c0;
                        if (i4 < 0) {
                            i2 = aob.p7;
                        } else {
                            i2 = aob.y6;
                        }
                        numberTextView2.setTextColor(J0(i2));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new pw1(this, (byte) 3));
                }
            }
        }
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        r47 r47Var;
        tx1 tx1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z3;
        int i2;
        View view;
        int i3;
        int i4;
        r2d r2dVar;
        boolean z4 = false;
        if (this.G2 != 0) {
            this.A3 = i;
            this.B3 = z;
            if (i > 0) {
                z4 = true;
            }
            this.o3 = z4;
            I();
            return;
        }
        if (i > hl.L(50.0f) && this.o3 && !hl.E) {
            if (z) {
                this.n3 = i;
                uc7.d1().edit().putInt("kbd_height_land3", this.n3).commit();
            } else {
                this.m3 = i;
                uc7.d1().edit().putInt("kbd_height", this.m3).commit();
            }
        }
        if (this.o3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean U0 = U0();
        wma wmaVar = this.b2;
        zu1 zu1Var = this.E3;
        if (U0) {
            if (z) {
                i2 = this.n3;
            } else {
                i2 = this.m3;
            }
            if (zu1Var != null && zu1Var.getParentLayout() != null) {
                i2 -= ((ActionBarLayout) zu1Var.getParentLayout()).u(false);
            }
            if (this.U2 == 1) {
                jy1 jy1Var = this.w2;
                if (!jy1Var.f) {
                    i2 = Math.min(jy1Var.getKeyboardHeight(), i2);
                }
            }
            int i5 = this.U2;
            if (i5 == 0) {
                view = this.V0;
            } else if (i5 == 1) {
                view = this.w2;
            } else {
                view = null;
            }
            jy1 jy1Var2 = this.w2;
            if (jy1Var2 != null) {
                jy1Var2.setPanelHeight(i2);
                r2d r2dVar2 = this.I7;
                if (r2dVar2 != null && i2 > 0 && this.U2 == 1) {
                    ((v2d) r2dVar2).h(i2);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.p4 && !this.o4 && (((i3 = layoutParams.width) != (i4 = hl.q.x) || layoutParams.height != i2) && ((r2dVar = this.I7) == null || i3 != -1 || layoutParams.height != -1))) {
                    if (r2dVar == null) {
                        layoutParams.width = i4;
                        layoutParams.height = i2;
                        view.setLayoutParams(layoutParams);
                    }
                    if (wmaVar != null) {
                        int i6 = this.p3;
                        this.p3 = layoutParams.height;
                        wmaVar.requestLayout();
                        l1();
                        if (this.X2 && !this.o3 && i6 != this.p3 && u1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.I7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.p3 - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.p3 - i6, 0.0f));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new pw1(this, (byte) 0));
                            hl.d3(this.M4, 50L);
                            this.z4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.A3 == i && this.B3 == z) {
            l1();
            return;
        }
        this.A3 = i;
        this.B3 = z;
        boolean z5 = this.o3;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.o3 = z2;
        I();
        if (this.o3 && U0() && this.q4 == null) {
            i2(0, this.U2, true, true);
        } else if (!this.o3 && !U0() && (r47Var = this.b3) != null && this.I3 != r47Var && !K0() && !A() && !org.telegram.ui.ActionBar.e.hasSheets(zu1Var) && (((tx1Var = this.F0) == null || TextUtils.isEmpty(tx1Var.getText())) && (tL_replyKeyboardMarkup = this.c3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            hb hbVar = wmaVar.I;
            if (hbVar.f) {
                hbVar.j();
            } else {
                hbVar.v = true;
            }
            i2(1, 1, false, true);
        }
        if (this.p3 != 0 && !(z3 = this.o3) && z3 != z5 && !U0()) {
            this.p3 = 0;
            wmaVar.requestLayout();
        }
        if (this.o3 && this.Z3) {
            this.Z3 = false;
            if (this.e4) {
                this.e4 = false;
                this.w2.setButtons(this.c3);
            }
            hl.r(this.g4);
        }
        l1();
    }

    public final boolean L0() {
        tx1 tx1Var = this.F0;
        if (tx1Var != null && tx1Var.length() > 0) {
            return true;
        }
        return false;
    }

    public final void L1(r47 r47Var, String str, boolean z, boolean z2) {
        tx1 tx1Var;
        TLRPC.User user;
        p7a b;
        String str2;
        if (str != null && getVisibility() == 0 && (tx1Var = this.F0) != null) {
            c5a c5aVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z) {
                String obj = tx1Var.getText().toString();
                if (r47Var != null && wf3.y(this.F3)) {
                    user2 = uc7.s1(this.S.a).X1(Long.valueOf(r47Var.k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.d3 != 1 || z2) && user3 != null && user3.bot && !str.contains("@")) {
                    Locale locale = Locale.US;
                    str2 = qd4.y(str, "@", lbc.p(user3)) + " " + obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
                } else {
                    StringBuilder l = c00.l(str, " ");
                    l.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    str2 = l.toString();
                }
                this.G3 = true;
                this.F0.setText(str2);
                tx1 tx1Var2 = this.F0;
                tx1Var2.setSelection(tx1Var2.getText().length());
                this.G3 = false;
                xy1 xy1Var = this.O3;
                if (xy1Var != null) {
                    xy1Var.R0(this.F0.getText(), true, false);
                }
                if (!this.o3 && this.U2 == -1) {
                    o1();
                }
            } else if (this.H0 > 0 && !c()) {
                xy1 xy1Var2 = this.O3;
                if (xy1Var2 != null) {
                    cz1 cz1Var = this.G0;
                    xy1Var2.b1(cz1Var, ((ema) cz1Var.c).getText(), true);
                }
            } else {
                if (r47Var != null && wf3.y(this.F3)) {
                    user = uc7.s1(this.S.a).X1(Long.valueOf(r47Var.k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.d3 != 1 || z2) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b = p7a.b(qd4.y(str, "@", lbc.p(user)), this.F3, this.I3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b = p7a.b(str, this.F3, this.I3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                zu1 zu1Var = this.E3;
                if (zu1Var != null) {
                    c5aVar = zu1Var.X6();
                }
                b.K = c5aVar;
                b.O = this.o7;
                this.o7 = 0L;
                this.K0.setEffect(0L);
                u(b);
                r7a.B(this.R).q0(b);
            }
        }
    }

    public final void L2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.L2():void");
    }

    public final void M(boolean z) {
        String str;
        boolean z2;
        r47 r47Var;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z3 = false;
        if (this.F3 < 0 && this.L4 && this.O2 == null && (o44.g(this.R).e(str, this.A7) > 0 || ((r47Var = this.I3) != null && r47.c3(r47Var.k)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        fm0 fm0Var = this.N7;
        if (fm0Var.f != z2) {
            z3 = true;
        }
        fm0Var.a(z2, z);
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.y = z2;
            bx1Var.invalidate();
        }
        if (z3) {
            P(z);
        }
    }

    public final void M0() {
        kg5 kg5Var = this.O;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        kg5 kg5Var2 = this.M;
        if (kg5Var2 != null) {
            kg5Var2.f(true);
        }
    }

    public final void M1(int i, long j) {
        boolean z;
        boolean z2;
        this.F3 = j;
        hl.c3(new fw1(this, (byte) 1));
        if (this.R != i) {
            this.z4.e();
            jn7 f = jn7.f(this.R);
            int i2 = jn7.l2;
            f.n(this, i2);
            jn7 f2 = jn7.f(this.R);
            int i3 = jn7.o2;
            f2.n(this, i3);
            jn7 f3 = jn7.f(this.R);
            int i4 = jn7.p2;
            f3.n(this, i4);
            jn7 f4 = jn7.f(this.R);
            int i5 = jn7.m2;
            f4.n(this, i5);
            jn7 f5 = jn7.f(this.R);
            int i6 = jn7.X5;
            f5.n(this, i6);
            jn7 f6 = jn7.f(this.R);
            int i7 = jn7.n2;
            f6.n(this, i7);
            jn7 f7 = jn7.f(this.R);
            int i8 = jn7.k2;
            f7.n(this, i8);
            jn7 f8 = jn7.f(this.R);
            int i9 = jn7.s;
            f8.n(this, i9);
            jn7 f9 = jn7.f(this.R);
            int i10 = jn7.s2;
            f9.n(this, i10);
            jn7 f10 = jn7.f(this.R);
            int i11 = jn7.u2;
            f10.n(this, i11);
            jn7 f11 = jn7.f(this.R);
            int i12 = jn7.e2;
            f11.n(this, i12);
            jn7 f12 = jn7.f(this.R);
            int i13 = jn7.z0;
            f12.n(this, i13);
            jn7 f13 = jn7.f(this.R);
            int i14 = jn7.K;
            f13.n(this, i14);
            jn7 f14 = jn7.f(this.R);
            int i15 = jn7.n1;
            f14.n(this, i15);
            jn7 f15 = jn7.f(this.R);
            int i16 = jn7.t2;
            f15.n(this, i16);
            jn7 f16 = jn7.f(this.R);
            int i17 = jn7.T2;
            f16.n(this, i17);
            jn7 f17 = jn7.f(this.R);
            int i18 = jn7.a3;
            f17.n(this, i18);
            jn7 f18 = jn7.f(this.R);
            int i19 = jn7.i5;
            f18.n(this, i19);
            jn7 f19 = jn7.f(this.R);
            int i20 = jn7.S3;
            f19.n(this, i20);
            this.R = i;
            this.S = k5.a(i);
            jn7.f(this.R).b(this, i2);
            jn7.f(this.R).b(this, i3);
            jn7.f(this.R).b(this, i4);
            jn7.f(this.R).b(this, i5);
            jn7.f(this.R).b(this, i6);
            jn7.f(this.R).b(this, i7);
            jn7.f(this.R).b(this, i8);
            jn7.f(this.R).b(this, i9);
            jn7.f(this.R).b(this, i10);
            jn7.f(this.R).b(this, i11);
            jn7.f(this.R).b(this, i12);
            jn7.f(this.R).b(this, i13);
            jn7.f(this.R).b(this, i14);
            jn7.f(this.R).b(this, i15);
            jn7.f(this.R).b(this, i16);
            jn7.f(this.R).b(this, i17);
            jn7.f(this.R).b(this, i18);
            jn7.f(this.R).b(this, i19);
            jn7.f(this.R).b(this, i20);
            z = true;
        } else {
            z = true;
        }
        this.A0 = z;
        if (wf3.y(this.F3)) {
            this.A0 = xc2.q(uc7.s1(this.S.a).M0(Long.valueOf(-this.F3)));
        }
        G2(false);
        A2(false);
        O();
        J();
        y2(false);
        if (this.F0 != null) {
            zu1 zu1Var = this.E3;
            if (zu1Var != null && zu1Var.getFragmentBeginToShow()) {
                z2 = z;
            } else {
                z2 = false;
            }
            I2(z2);
        }
    }

    public final void M2() {
        boolean z;
        bx1 bx1Var = this.K0;
        if (bx1Var == null) {
            return;
        }
        if (this.J1 && this.T1 && !this.u3 && !v1()) {
            z = true;
        } else {
            z = false;
        }
        mv1 mv1Var = this.a6;
        hl.r(mv1Var);
        if (z) {
            hl.d3(mv1Var, 250L);
        } else {
            bx1Var.setIconDimmed(false);
        }
    }

    public final void N0(boolean z) {
        O0(z, false, true);
    }

    public final void N1(defpackage.r47 r19, defpackage.m47 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N1(r47, m47, boolean):void");
    }

    public final long N2(String str, Runnable runnable) {
        long j;
        RecordCircle recordCircle;
        if (!TextUtils.isEmpty(str)) {
            this.S6 = true;
        }
        if (!this.u3 && this.Q3 != null) {
            B1();
            j = 420;
        } else {
            j = 0;
        }
        if (this.u3 || ((recordCircle = this.C2) != null && ChatActivityEnterView.this.j5)) {
            this.X1 = 0L;
            this.D1 = true;
            try {
                G();
            } finally {
                this.D1 = false;
            }
        }
        hl.d3(new on1(this, str, runnable, (byte) 9), j);
        return j;
    }

    public final void O() {
        boolean z;
        boolean z2;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.T2) {
            return;
        }
        if (this.e2 == null) {
            this.T2 = false;
            X1(false, false);
            return;
        }
        boolean z3 = true;
        this.T2 = true;
        this.y0 = true;
        this.z0 = true;
        if (wf3.y(this.F3)) {
            TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
            if (xc2.T(M0) && !M0.megagroup) {
                z = true;
            } else {
                z = false;
            }
            if (z && !M0.creator && ((tL_chatAdminRights = M0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.T2 = false;
            }
            this.y0 = xc2.s(M0);
            this.z0 = xc2.v(M0);
        } else {
            z = false;
        }
        if (!xea.v0) {
            this.T2 = false;
        }
        if (this.T2) {
            if (xea.L0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences e1 = uc7.e1();
            if (z) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z2 = e1.getBoolean(str, z);
        } else {
            z2 = false;
        }
        if (!this.y0 && z2) {
            z2 = false;
        }
        if (!this.z0 && !z2) {
            if (!this.T2) {
                z3 = false;
            }
        } else {
            z3 = z2;
        }
        X1(z3, false);
    }

    public final boolean O0(boolean z, boolean z2, boolean z3) {
        boolean z4;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (U0()) {
            if (this.U2 == 1 && (tL_replyKeyboardMarkup = this.c3) != null && z && this.b3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    uc7.s1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.b3.e1()).apply();
                }
            }
            if ((z && this.G2 != 0) || z2) {
                Z1(0, true);
                my1 my1Var = this.V0;
                if (my1Var != null) {
                    my1Var.r(true);
                }
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                }
                a2(false, true, false, true);
                if (this.n4) {
                    P(true);
                    return true;
                }
            } else if (this.G2 != 0) {
                Z1(0, false);
                this.V0.r(false);
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    tx1Var2.requestFocus();
                }
            } else if (this.o4) {
                a2(false, true, false, true);
                return true;
            } else {
                if (z3 && !z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i2(0, 0, true, z4);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void O1(boolean z, boolean z2) {
        int currentPage;
        gz1 gz1Var;
        tx1 tx1Var;
        rw1 rw1Var;
        tw1 tw1Var = this.R0;
        if (tw1Var != null) {
            if (this.l3 || ((rw1Var = this.f1) != null && rw1Var.getVisibility() == 0)) {
                this.h = 0.0f;
                this.n = 0.0f;
                x2();
                z2 = false;
            }
            gz1 gz1Var2 = gz1.f;
            gz1 gz1Var3 = gz1.e;
            if (z && this.U2 == 0) {
                if (this.A0) {
                    gz1Var = gz1.d;
                } else {
                    return;
                }
            } else {
                my1 my1Var = this.V0;
                if (my1Var == null) {
                    currentPage = uc7.d1().getInt("selected_page", 0);
                } else {
                    currentPage = my1Var.getCurrentPage();
                }
                if (currentPage != 0 && ((this.y3 || this.z3) && ((tx1Var = this.F0) == null || TextUtils.isEmpty(tx1Var.getText())))) {
                    if (currentPage == 1) {
                        gz1Var = gz1.c;
                    } else {
                        gz1Var = gz1Var2;
                    }
                } else {
                    gz1Var = gz1Var3;
                }
            }
            if (!this.A0 && gz1Var == gz1Var3) {
                gz1Var3 = gz1Var2;
            } else if (this.b || gz1Var == gz1Var3) {
                gz1Var3 = gz1Var;
            }
            tw1Var.j(gz1Var3, z2);
            if (gz1Var3 == gz1Var2 && this.V0 == null) {
                ls6.d0(this.R).X0(true, true, false, 0);
                ArrayList arrayList = uc7.s1(this.R).x3;
                int min = Math.min(10, arrayList.size());
                for (int i = 0; i < min; i++) {
                    pv3.k((CharSequence) arrayList.get(i));
                }
            }
        }
    }

    public final boolean O2() {
        tx1 tx1Var;
        if (this.S6) {
            return true;
        }
        if (this.s1 && ((tx1Var = this.F0) == null || tx1Var.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    public final void P(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P(boolean):void");
    }

    public final void P0(boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P0(boolean):void");
    }

    public final void P1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.D3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void P2(int i) {
        byte b;
        if (!this.l1) {
            if (this.r1 != null || uc7.e1().getBoolean("asr_live_text", true)) {
                snc sncVar = this.r1;
                if (sncVar != null && sncVar.K && ((b = sncVar.c) == 2 || b == 4)) {
                    if (i != 1 && i != 2 && i != 4 && i != 5) {
                        hl.c3(new mv1(this, (byte) 9));
                        return;
                    }
                    sncVar.k("field: record state " + i, true);
                } else if (sncVar != null && sncVar.c == 3) {
                    if (i == 1 || i == 2 || i == 4 || i == 5 || i == 0) {
                        sncVar.k("review: record state " + i, true);
                    }
                } else if (i != 0) {
                    if (sncVar != null) {
                        sncVar.k("record state " + i, true);
                    }
                } else {
                    hl.c3(new mv1(this, (byte) 9));
                }
            }
        }
    }

    public final void Q() {
        int i;
        if (this.V0 != null) {
            Point point = hl.q;
            if (point.x > point.y) {
                i = this.n3;
            } else {
                i = this.m3;
            }
            int L = ((((this.d2 - hl.m) - hl.n) - hl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
            if (this.G2 == 2) {
                L = Math.min(L, hl.L(175.0f) + i);
            }
            int i2 = this.V0.getLayoutParams().height;
            if (i2 != L) {
                AnimatorSet animatorSet = this.q4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.q4 = null;
                }
                this.s4 = L;
                px1 px1Var = this.i4;
                if (i2 > L) {
                    mv1 mv1Var = new mv1(this, (byte) 27);
                    this.V0.setLayerType(2, null);
                    if (this.w) {
                        this.x = mv1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        r2d r2dVar = this.I7;
                        int i3 = this.s4 - i;
                        if (r2dVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i3), ValueAnimator.ofInt(-(this.s4 - i)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, px1Var, -i3), ObjectAnimator.ofInt(this.V0, px1Var, -(this.s4 - i)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new qv1(this, (byte) 3));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(k43.f);
                        animatorSet2.addListener(new v5(this, mv1Var, (byte) 9));
                        this.q4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.I7 == null) {
                        this.V0.getLayoutParams().height = this.s4;
                    }
                    this.b2.requestLayout();
                    tx1 tx1Var = this.F0;
                    if (tx1Var != null) {
                        int selectionStart = tx1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        tx1 tx1Var2 = this.F0;
                        tx1Var2.setText(tx1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    r2d r2dVar2 = this.I7;
                    int i4 = this.s4 - i;
                    if (r2dVar2 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-i4), ValueAnimator.ofInt(-(this.s4 - i)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, px1Var, -i4), ObjectAnimator.ofInt(this.V0, px1Var, -(this.s4 - i)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new qv1(this, (byte) 4));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(k43.f);
                    animatorSet3.addListener(new pw1(this, (byte) 1));
                    this.q4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                r2d r2dVar3 = this.I7;
                if (r2dVar3 != null) {
                    ((v2d) r2dVar3).h(L);
                }
            }
        }
    }

    public final void Q0() {
        A1();
        this.R3 = null;
        this.Q3 = null;
        this.S3 = null;
        this.T3 = null;
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            qgcVar.a(true);
        }
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        qgc qgcVar2 = this.g1;
        if (qgcVar2 != null) {
            qgcVar2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setAlpha(1.0f);
            this.H = 0.0f;
            B2();
            this.F0.requestFocus();
        }
        rw1 rw1Var = this.f1;
        if (rw1Var != null) {
            rw1Var.setVisibility(8);
        }
        Y0();
    }

    public final void Q1(CharSequence charSequence, boolean z) {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            this.G3 = true;
            tx1Var.setText(charSequence);
            this.F0.g(true);
            tx1 tx1Var2 = this.F0;
            tx1Var2.setSelection(tx1Var2.getText().length());
            this.G3 = false;
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                xy1Var.R0(this.F0.getText(), true, z);
            }
        }
    }

    public final void Q2() {
        if ((this.r1 != null || o2f.a()) && !this.N2 && !this.l1) {
            E0().u();
        }
    }

    public final void R() {
        this.P7 = D(true);
        s0();
        float D = D(false);
        if (this.O7 != D) {
            this.O7 = D;
            f1(D);
        }
    }

    public void R0(boolean z) {
        if (this.v2 != null && this.U3) {
            fw1 fw1Var = this.W;
            if (fw1Var != null) {
                hl.r(fw1Var);
            }
            this.U3 = false;
            this.V3 = false;
            if (this.W3) {
                this.L7.a(false, z);
            }
        }
    }

    public final void R1(boolean z, boolean z2) {
        this.w3 = z;
        P(z2);
    }

    public final void S() {
        boolean z;
        int i;
        int i2;
        View view;
        int i3;
        float f = this.L7.e;
        if (this.v2 != null) {
            float measuredHeight = getMeasuredHeight() - this.K7.f;
            this.v2.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f));
            View view2 = this.v2;
            if (f > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.h7 != z) {
            rw1 rw1Var = this.o2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rw1Var.getLayoutParams();
            if (z) {
                i = this.v2.getLayoutParams().height;
            } else {
                i = 0;
            }
            layoutParams.topMargin = i;
            layoutParams.topMargin = hl.L(9.0f) + i;
            rw1Var.setLayoutParams(layoutParams);
            this.h7 = z;
            int L = hl.L(44.0f);
            if (z) {
                i2 = this.v2.getLayoutParams().height;
            } else {
                i2 = 0;
            }
            setMinimumHeight(L + i2);
            if (this.o4) {
                if (this.G2 == 0) {
                    a2(false, true, false, true);
                } else {
                    Q();
                }
            }
        }
    }

    public final boolean S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.S0():boolean");
    }

    public void S1(float f, float f2, float f3, boolean z) {
        int i;
        int i2;
        tx1 tx1Var;
        float f4;
        float f5 = 1.0f - f3;
        float f6 = f * f5;
        float f7 = f2 * f5;
        this.r = (f3 * 0.5f) + 0.5f;
        this.s = f3;
        x2();
        float f8 = -f6;
        this.R0.setTranslationX(f8);
        if (this.F0 == null) {
            i2 = 0;
        } else {
            int L = hl.L(40.0f);
            c8a c8aVar = this.q0;
            if (c8aVar != null && c8aVar.getVisibility() == 0) {
                i = hl.L(18.0f);
            } else {
                i = 0;
            }
            i2 = L + i;
        }
        this.I = f8 - (i2 * f5);
        e29 e29Var = this.h1;
        if (e29Var != null) {
            e29Var.setTranslationX(f8);
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f7);
        }
        l lVar = this.D2;
        if (lVar != null) {
            lVar.setTranslationX(f7);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f8);
        }
        rw1 rw1Var = this.p2;
        rw1Var.setTranslationX(f7);
        this.z1 = f3;
        rw1Var.setAlpha((1.0f - this.y1) * f3);
        ImageView imageView = this.l2;
        if (imageView != null) {
            if (imageView.getScaleX() > 0.7f) {
                f4 = f3;
            } else {
                f4 = 0.0f;
            }
            imageView.setAlpha(f4);
        }
        boolean z2 = true;
        if (z && f3 != 1.0f) {
            z2 = false;
        }
        this.K = z2;
        this.E = f7;
        this.G = f3;
        s2();
        B2();
        float f9 = f6 * f5;
        if (this.J != f9) {
            this.J = f9;
            x59 x59Var = this.i1;
            if (x59Var != null) {
                x59Var.setTranslationX(f9);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float R1 = hl.R1(0.88f, 1.0f, f3);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(tx1Var.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(R1);
            this.F0.setScaleY(R1);
            this.F0.setHintRightOffset(hl.U1(f3, hl.L(60.0f), 0));
        }
    }

    public final void T() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            ls6.d0(this.R).T1(zu1Var.a(), zu1Var.N5(zu1Var.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean T0() {
        if (this.O2 != null) {
            return true;
        }
        return false;
    }

    public final void U() {
        hl.t1(this.F0);
    }

    public final boolean U0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void U1(boolean z) {
        int i;
        int i2;
        if (this.T7 == z) {
            return;
        }
        this.T7 = z;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        this.g2.setVisibility(i);
        if (z) {
            hl.B2(this.x2);
            i2 = 4;
        } else {
            i2 = 1;
        }
        a aVar = this.a1;
        aVar.setImportantForAccessibility(i2);
        aVar.invalidate();
        if (z) {
            this.c1.setVisibility(8);
        } else {
            z1();
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        z2(this.l7);
        P(false);
    }

    public final AnimatorSet U2() {
        a aVar = this.a1;
        if (aVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(aVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(aVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(k43.g);
        return animatorSet;
    }

    public final void V() {
        if (this.m2 != null) {
            return;
        }
        vw1 vw1Var = new vw1(this, getContext(), (byte) 2);
        this.m2 = vw1Var;
        ya9 ya9Var = new ya9(getContext());
        this.J2 = ya9Var;
        vw1Var.setImageDrawable(ya9Var);
        ya9 ya9Var2 = this.J2;
        int i = aob.Nl;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        vnb vnbVar = this.K4;
        yob.x(this, ya9Var2, i, vnbVar, mode);
        this.J2.a(2131231500, false);
        this.m2.setScaleType(ImageView.ScaleType.CENTER);
        vw1 vw1Var2 = this.m2;
        int i2 = aob.i6;
        yob.R(vw1Var2, aob.f0(J0(i2), 1, -1), null, yob.M(i2), vnbVar);
        this.m2.setVisibility(8);
        hl.T3(this.m2, false, 0.1f, true, false);
        this.e2.addView(this.m2, 0, tre.o(44, 44));
        this.m2.setOnClickListener(new pv1(this, (byte) 19));
    }

    public final boolean V0(View view) {
        if (view != this.w2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void V1(boolean z) {
        ValueAnimator valueAnimator = this.P1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.P1 = null;
        }
        if (z) {
            float f = this.O1;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.P1 = ofFloat;
                ofFloat.addUpdateListener(new qv1(this, (byte) 1));
                this.P1.setDuration(200L);
                this.P1.setInterpolator(k43.g);
                this.P1.start();
                return;
            }
        }
        this.O1 = 0.0f;
        z92 G0 = G0();
        if (G0 != null) {
            G0.setInputBubbleExtraAlpha(1.0f);
        }
        rw1 rw1Var = this.f1;
        if (rw1Var != null) {
            rw1Var.invalidate();
        }
    }

    public final void W() {
        if (this.m0 == null) {
            ep0 ep0Var = new ep0(getContext());
            this.m0 = ep0Var;
            ep0Var.setOnClickListener(new pv1(this, (byte) 10));
            this.n2.addView(this.m0, tre.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            hl.T3(this.m0, false, 1.0f, true, false);
            ep0 ep0Var2 = this.m0;
            if (!ep0Var2.f) {
                ep0Var2.f = true;
                ep0Var2.h = 1.0f;
                ep0Var2.requestLayout();
                ep0Var2.invalidate();
            }
        }
    }

    public final boolean W0() {
        if (this.u3 && ChatActivityEnterView.this.j5) {
            return true;
        }
        return false;
    }

    public final void W1(CharSequence charSequence, boolean z) {
        this.e = charSequence;
        this.f = null;
        y2(z);
    }

    public final void X() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(J0(aob.y6));
        this.c0.setTypeface(hl.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), tre.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean X0() {
        if (!this.u3) {
            AnimatorSet animatorSet = this.i3;
            if (animatorSet == null || !animatorSet.isRunning() || this.Z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void X1(boolean z, boolean z2) {
        gz1 gz1Var;
        int i;
        String M0;
        String str;
        zw1 zw1Var = this.c1;
        if (zw1Var == null) {
            return;
        }
        this.d1 = z;
        if (z2) {
            SharedPreferences e1 = uc7.e1();
            boolean z3 = false;
            if (wf3.y(this.F3)) {
                TLRPC.Chat M02 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
                if (xc2.T(M02) && !M02.megagroup) {
                    z3 = true;
                }
            }
            SharedPreferences.Editor edit = e1.edit();
            if (z3) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z).apply();
        }
        if (this.d1) {
            gz1Var = gz1.b;
        } else {
            gz1Var = gz1.a;
        }
        zw1Var.j(gz1Var, z2);
        int i2 = 2131754729;
        if (this.d1) {
            i = 2131754731;
        } else {
            i = 2131754729;
        }
        zw1Var.setContentDescription(ob6.M0(i, null));
        if (j0()) {
            M0 = ob6.M0(2131754870, null);
        } else {
            if (this.d1) {
                i2 = 2131754731;
            }
            M0 = ob6.M0(i2, null);
        }
        this.a1.setContentDescription(M0);
        l0();
        zy1 zy1Var = this.a2;
        if (zy1Var != null) {
            zy1Var.d(j0());
        }
        zw1Var.sendAccessibilityEvent(8);
    }

    public final void Y(boolean z) {
        if (this.u2 != null) {
            return;
        }
        bx1 bx1Var = new bx1(this, getContext(), this.K4);
        this.u2 = bx1Var;
        bx1Var.setContentDescription(ob6.M0(2131751239, null));
        if (z) {
            iye.a(this.u2);
        }
        this.o2.addView(this.u2, tre.e(44, 44, 85));
    }

    public final void Y1(r47 r47Var, ou1 ou1Var, r47 r47Var2) {
        boolean z;
        r47 r47Var3;
        zu1 zu1Var = this.E3;
        if (zu1Var != null && zu1Var.V7() && this.J3 != r47Var2) {
            z = true;
        } else {
            z = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (r47Var != null) {
            if (this.L3 == null && (r47Var3 = this.b3) != this.I3) {
                this.L3 = r47Var3;
            }
            this.I3 = r47Var;
            this.K3 = ou1Var;
            this.J3 = r47Var2;
            if (zu1Var == null || !zu1Var.x4 || zu1Var.m4 != r47Var) {
                K1(r47Var, true, true);
            }
        } else if (this.I3 == this.b3) {
            this.I3 = null;
            this.J3 = null;
            this.K3 = null;
            K1(this.L3, true, false);
            this.L3 = null;
        } else {
            this.I3 = null;
            this.K3 = null;
            this.J3 = null;
        }
        M(true);
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            storyItem = xy1Var.F0();
        }
        MediaController z2 = MediaController.z();
        r47 threadMessage = getThreadMessage();
        z2.r1 = r47Var;
        z2.s1 = threadMessage;
        z2.t1 = storyItem;
        y2(z);
    }

    public final void Z() {
        boolean z;
        my1 my1Var = this.V0;
        if (my1Var != null && my1Var.d1 != yac.t0) {
            this.c2.removeView(my1Var);
            my1Var = null;
            this.V0 = null;
        }
        if (my1Var != null) {
            return;
        }
        boolean z2 = this.x3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.S2;
        boolean z3 = this.i6;
        boolean z4 = this.U0;
        if (this.I7 != null) {
            z = true;
        } else {
            z = false;
        }
        my1 my1Var2 = new my1(this, this.E3, z2, context, chatFull, this.b2, z3, this.K4, z4, z);
        this.V0 = my1Var2;
        my1Var2.w0 = true;
        if (!this.i6) {
            my1Var2.updateColors();
        }
        this.V0.H(true, this.y3, this.z3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.I7 != null) {
            my1 my1Var3 = this.V0;
            my1Var3.x0 = false;
            my1Var3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new qy1(this));
        this.V0.setDragListener(new cdc(this));
        my1 my1Var4 = this.V0;
        if (my1Var4 != null) {
            my1Var4.J(-this.F3, !this.A0, !this.b);
        }
        x();
        J();
    }

    public final boolean Z0() {
        if (!c() && !this.N7.f) {
            return false;
        }
        return true;
    }

    public final void Z1(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.G2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.w0.cancel();
            }
            float f = 0.0f;
            if (!z) {
                if (z2) {
                    f = 1.0f;
                }
                this.x0 = f;
                my1 my1Var = this.V0;
                if (my1Var != null) {
                    my1Var.Y();
                }
            } else {
                float f2 = this.x0;
                if (z2) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.w0 = ofFloat;
                ofFloat.addUpdateListener(new qv1(this, (byte) 5));
                this.w0.addListener(new ow1(this, z2, (byte) 0));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(k43.f);
                this.w0.start();
            }
        }
        this.G2 = i;
    }

    @Override
    public final boolean a() {
        bn3 bn3Var = this.j1;
        if (bn3Var != null && bn3Var.s()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        if (this.T0 != null) {
            return;
        }
        vw1 vw1Var = new vw1(this, getContext(), (byte) 3);
        this.T0 = vw1Var;
        vw1Var.setScaleType(ImageView.ScaleType.CENTER);
        vw1 vw1Var2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(J0(aob.Nl), false);
        this.u4 = animatedArrowDrawable;
        vw1Var2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        vw1 vw1Var3 = this.T0;
        int i = aob.i6;
        yob.R(vw1Var3, aob.f0(J0(i), 1, -1), null, yob.M(i), this.K4);
        this.p2.addView(this.T0, tre.e(44, 44, 85));
        this.T0.setOnClickListener(new pv1(this, (byte) 9));
        this.T0.setContentDescription(ob6.M0(2131754879, "AccDescrExpandPanel"));
    }

    public final boolean a1() {
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void a2(boolean z, boolean z2, boolean z3, boolean z4) {
        final int i;
        hb hbVar = this.V;
        if ((hbVar == null || !hbVar.f) && !this.a4 && this.V0 != null) {
            if (z3 || this.o4 != z) {
                this.o4 = z;
                xy1 xy1Var = this.O3;
                if (xy1Var != null) {
                    xy1Var.Z0();
                }
                Point point = hl.q;
                if (point.x > point.y) {
                    i = this.n3;
                } else {
                    i = this.m3;
                }
                AnimatorSet animatorSet = this.q4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.q4 = null;
                }
                boolean z5 = this.o4;
                pn pnVar = this.z4;
                px1 px1Var = this.i4;
                wma wmaVar = this.b2;
                if (z5) {
                    if (z4) {
                        jn7.e().k(jn7.j1, 1);
                    }
                    int height = wmaVar.getHeight();
                    this.d2 = height;
                    int L = ((((height - hl.m) - hl.n) - hl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
                    this.s4 = L;
                    if (this.G2 == 2) {
                        this.s4 = Math.min(L, hl.L(175.0f) + i);
                    }
                    if (this.I7 == null) {
                        this.V0.getLayoutParams().height = this.s4;
                    }
                    wmaVar.requestLayout();
                    if (this.i6) {
                        wmaVar.setForeground(new ya1(this));
                    }
                    tx1 tx1Var = this.F0;
                    if (tx1Var != null) {
                        int selectionStart = tx1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        tx1 tx1Var2 = this.F0;
                        tx1Var2.setText(tx1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z2) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        r2d r2dVar = this.I7;
                        int i2 = this.s4 - i;
                        if (r2dVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i2), ValueAnimator.ofInt(-(this.s4 - i)), ObjectAnimator.ofFloat(this.u4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, px1Var, -i2), ObjectAnimator.ofInt(this.V0, px1Var, -(this.s4 - i)), ObjectAnimator.ofFloat(this.u4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(k43.f);
                        if (this.I7 == null) {
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b = r3;
                                    int i3 = i;
                                    ChatActivityEnterView chatActivityEnterView = this.b;
                                    switch (b) {
                                        case 0:
                                            int i4 = ChatActivityEnterView.X7;
                                            chatActivityEnterView.r4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3)));
                                            chatActivityEnterView.b2.invalidate();
                                            return;
                                        default:
                                            int i5 = ChatActivityEnterView.X7;
                                            chatActivityEnterView.r4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3));
                                            chatActivityEnterView.b2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new pw1(this, (byte) 2));
                        this.q4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        pnVar.d();
                        this.r4 = 0.0f;
                        wmaVar.invalidate();
                        animatorSet2.start();
                    } else {
                        this.r4 = 1.0f;
                        if (this.I7 == null) {
                            setTranslationY(-(this.s4 - i));
                            this.V0.setTranslationY(-(this.s4 - i));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.u4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    r2d r2dVar2 = this.I7;
                    if (r2dVar2 != null) {
                        ((v2d) r2dVar2).h(this.s4);
                    }
                } else {
                    if (z4) {
                        jn7.e().k(jn7.k1, 1);
                    }
                    if (z2) {
                        this.p4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.I7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.u4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, px1Var, 0), ObjectAnimator.ofInt(this.V0, px1Var, 0), ObjectAnimator.ofFloat(this.u4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(k43.f);
                        if (this.I7 == null) {
                            ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ChatActivityEnterView b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b = r3;
                                    int i3 = i;
                                    ChatActivityEnterView chatActivityEnterView = this.b;
                                    switch (b) {
                                        case 0:
                                            int i4 = ChatActivityEnterView.X7;
                                            chatActivityEnterView.r4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3)));
                                            chatActivityEnterView.b2.invalidate();
                                            return;
                                        default:
                                            int i5 = ChatActivityEnterView.X7;
                                            chatActivityEnterView.r4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.s4 - i3));
                                            chatActivityEnterView.b2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new dn(this, i, (byte) 3));
                        this.r4 = 1.0f;
                        wmaVar.invalidate();
                        this.q4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        pnVar.d();
                        animatorSet3.start();
                    } else {
                        this.r4 = 0.0f;
                        if (this.I7 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i;
                        }
                        wmaVar.requestLayout();
                        wmaVar.setForeground(null);
                        wmaVar.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.u4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    r2d r2dVar3 = this.I7;
                    if (r2dVar3 != null) {
                        ((v2d) r2dVar3).h(i);
                    }
                }
                vw1 vw1Var = this.T0;
                if (vw1Var != null) {
                    if (this.o4) {
                        vw1Var.setContentDescription(ob6.M0(2131754889, "AccDescrCollapsePanel"));
                    } else {
                        vw1Var.setContentDescription(ob6.M0(2131754879, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Je));
        hashSet.add(Integer.valueOf(aob.Vf));
        hashSet.add(Integer.valueOf(aob.p7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.Tf));
        hashSet.add(Integer.valueOf(aob.Sf));
        hashSet.add(Integer.valueOf(aob.Pe));
    }

    @Override
    public final boolean b() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null && zu1Var.M4()) {
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.EncryptedChat encryptedChat;
        int i;
        float f;
        int i2;
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        vnb vnbVar = this.K4;
        tx1 tx1Var = new tx1(this, context, vnbVar);
        this.F0 = tx1Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tx1Var.setFallbackLineSpacing(false);
        }
        if (i3 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new ew1(this));
        zu1 zu1Var = this.E3;
        if (zu1Var != null && zu1Var.getParentLayout() != null && ((ActionBarLayout) zu1Var.getParentLayout()).b) {
            this.F0.setWindowView(zu1Var.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.D3.getWindow().getDecorView());
        }
        if (zu1Var != null) {
            encryptedChat = zu1Var.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(p2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i = 285212672;
        } else {
            i = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i);
        tx1 tx1Var2 = this.F0;
        int inputType = tx1Var2.getInputType() | 147456;
        this.a = inputType;
        tx1Var2.setInputType(inputType);
        y2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, hl.L(9.0f), 0, hl.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        yob.X(this.F0, aob.Le, vnbVar);
        yob.G(this.F0, aob.Yc, vnbVar);
        yob.C(this.F0, aob.lg, vnbVar);
        tx1 tx1Var3 = this.F0;
        int i4 = aob.Me;
        yob.A(tx1Var3, i4, vnbVar);
        yob.D(this.F0, i4, vnbVar);
        yob.v(this.F0, aob.Ne, vnbVar);
        yob.y(this.F0, aob.mg, vnbVar);
        tx1 tx1Var4 = this.F0;
        boolean z2 = this.L4;
        if (z2) {
            f = 50.0f;
        } else {
            f = 2.0f;
        }
        FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 80, 52.0f, 0.0f, f, 1.5f);
        rw1 rw1Var = this.n2;
        rw1Var.addView(tx1Var4, 1, d);
        zj9 zj9Var = new zj9(this.R, vnbVar, getContext());
        this.r2 = zj9Var;
        zj9Var.setAllowActions(false);
        this.r2.setMaxHeight(hl.L(150.0f));
        this.r2.setMinHeight(hl.L(88.0f));
        this.r2.setVisibility(8);
        this.r2.setPadding(hl.L(8.0f), hl.L(9.0f), hl.L(8.0f), hl.L(10.0f));
        this.r2.setOnClickListener(new pv1(this, (byte) 13));
        zj9 zj9Var2 = this.r2;
        if (z2) {
            i2 = 50;
        } else {
            i2 = 2;
        }
        rw1Var.addView(zj9Var2, 2, tre.d(-1, -2.0f, 80, 44.0f, 0.0f, i2 - 8, 1.5f));
        this.F0.setOnKeyListener(new ux1(this));
        this.F0.setOnEditorActionListener(new vx1(this, (byte) 0));
        this.F0.addTextChangedListener(new wx1(this));
        this.F0.addTextChangedListener(new xx1(this));
        this.F0.addTextChangedListener(new gi());
        this.F0.setEnabled(this.s6);
        ArrayList arrayList = this.r6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.r6.clear();
        }
        y2(false);
        if (zu1Var == null || !zu1Var.getFragmentBeginToShow()) {
            z = false;
        }
        I2(z);
        if (zu1Var != null) {
            zu1Var.H4(false, false);
        }
        z2(this.l7);
    }

    public final void b1(TLRPC.Document document, String str, n47 n47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        TL_stories.StoryItem storyItem;
        if (this.H0 > 0 && !c()) {
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                cz1 cz1Var = this.G0;
                xy1Var.b1(cz1Var, ((ema) cz1Var.c).getText(), true);
                return;
            }
            return;
        }
        if (this.G2 != 0) {
            Z1(0, true);
            this.V0.r(true);
            this.V0.z();
        }
        a2(false, true, false, true);
        xy1 xy1Var2 = this.O3;
        c5a c5aVar = null;
        if (xy1Var2 != null) {
            storyItem = xy1Var2.F0();
        } else {
            storyItem = null;
        }
        r7a B = r7a.B(this.R);
        long j = this.F3;
        r47 r47Var = this.I3;
        r47 threadMessage = getThreadMessage();
        ou1 ou1Var = this.K3;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            c5aVar = zu1Var.X6();
        }
        B.t0(document, str, j, r47Var, threadMessage, storyItem, ou1Var, n47Var, z, i, i2, z3, obj, c5aVar, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        xy1 xy1Var3 = this.O3;
        if (xy1Var3 != null) {
            xy1Var3.x(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        ls6.d0(this.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void b2(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        if (this.m5 != z || !z2) {
            ImageView imageView = this.l2;
            int i = 0;
            if (imageView == null) {
                if (z || this.T7) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.l2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.l2;
                        int i2 = aob.Nl;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        vnb vnbVar = this.K4;
                        yob.s(imageView3, i2, vnbVar, mode);
                        this.l2.setImageResource(2131231517);
                        ImageView imageView4 = this.l2;
                        int i3 = aob.i6;
                        yob.R(imageView4, aob.f0(J0(i3), 1, -1), null, yob.M(i3), vnbVar);
                        if (this.T7) {
                            this.l2.setTranslationX(hl.L(42.0f));
                            this.o2.addView(this.l2, tre.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.e2.addView(this.l2, 0, tre.o(44, 44));
                        }
                        this.l2.setOnClickListener(new pv1(this, (byte) 1));
                        this.l2.setContentDescription(ob6.M0(2131754917, null));
                    }
                } else {
                    return;
                }
            }
            if (this.m5 != z) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.m5 = z;
            if (z) {
                f2 = 1.0f;
                f = 1.0f;
            } else {
                f = 0.6f;
                f2 = 0.0f;
            }
            this.l2.setEnabled(z);
            this.l2.setClickable(z);
            ValueAnimator valueAnimator = this.n5;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n5 = null;
            }
            if (z2) {
                if (this.T7) {
                    this.l2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.l2.getAlpha(), f2);
                this.n5 = ofFloat;
                ofFloat.addUpdateListener(new qv1(this, (byte) 10));
                this.n5.addListener(new ow1(this, z, (byte) 1));
                this.n5.setDuration(220L);
                this.n5.setInterpolator(k43.h);
                this.n5.start();
            } else {
                this.l2.setScaleX(f);
                this.l2.setScaleY(f);
                this.l2.setAlpha(f2);
                if (this.T7) {
                    ImageView imageView5 = this.l2;
                    if (!z) {
                        i = 8;
                    }
                    imageView5.setVisibility(i);
                }
            }
            z2(this.l7);
            if (z3) {
                P(true);
            }
        }
    }

    @Override
    public final boolean c() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null && zu1Var.X7()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        int i;
        if (this.f1 != null) {
            return;
        }
        rw1 rw1Var = new rw1(this, getContext(), (byte) 3);
        this.f1 = rw1Var;
        if (this.Q3 == null) {
            i = 8;
        } else {
            i = 0;
        }
        rw1Var.setVisibility(i);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.n2.addView(this.f1, tre.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(2131623975, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.E5 = this.h1.getAnimatedDrawable();
        E2();
        this.h1.setContentDescription(ob6.M0(2131751563, "Delete"));
        e29 e29Var = this.h1;
        int i2 = aob.i6;
        hf0 f0 = aob.f0(J0(i2), 1, -1);
        uob M = yob.M(i2);
        vnb vnbVar = this.K4;
        yob.R(e29Var, f0, null, M, vnbVar);
        this.f1.addView(this.h1, tre.c(44.0f, 44));
        this.h1.setOnClickListener(new pv1(this, (byte) 18));
        qgc qgcVar = new qgc(getContext());
        this.g1 = qgcVar;
        qgcVar.setVisibility(4);
        qgc qgcVar2 = this.g1;
        qgcVar2.T = !this.i6;
        qgcVar2.setRoundFrames(true);
        this.g1.setDelegate(new ex1(this, (byte) 0));
        this.f1.addView(this.g1, tre.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(hl.L(14.0f));
        view.b = context.getDrawable(2131232807);
        view.a = aob.b0(hl.L(5.0f), aob.w0(null, aob.hg, false));
        view.b();
        view.setTime(0);
        this.g1.setTimeHintView(view);
        this.b2.addView((View) view, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        x59 x59Var = new x59(getContext(), vnbVar);
        this.i1 = x59Var;
        this.f1.addView(x59Var, tre.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        z2(this.l7);
    }

    public final void c1(org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.c1(org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public final void c2(boolean z, boolean z2) {
        boc bocVar;
        if (this.J1 && (bocVar = this.S1) != null) {
            if (this.T1 != z || !z2) {
                this.T1 = z;
                x59 x59Var = this.i1;
                float f = 1.0f;
                if (x59Var != null) {
                    bocVar.c(Math.round(Math.max(1.0f, (x59Var.w - x59Var.s) * x59Var.r)));
                }
                if (z) {
                    hl.r(this.W1);
                } else if (this.S1.c.hasFocus()) {
                    hl.t1(this.S1.c);
                    this.S1.c.clearFocus();
                }
                this.S1.setCollapsing(!z);
                this.S1.animate().cancel();
                this.S1.setAlpha(1.0f);
                this.S1.setVisibility(0);
                ValueAnimator valueAnimator = this.V1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.V1 = null;
                }
                if (!z) {
                    f = 0.0f;
                }
                if (!z2) {
                    v(f);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U1, f);
                    this.V1 = ofFloat;
                    ofFloat.addUpdateListener(new qv1(this, (byte) 11));
                    this.V1.setDuration(360L);
                    this.V1.setInterpolator(k43.h);
                    this.V1.start();
                }
                M2();
                l lVar = this.D2;
                if (lVar != null) {
                    lVar.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.T1 = false;
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.addTextChangedListener(textWatcher);
            return;
        }
        ArrayList arrayList = this.r6;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.r6 = arrayList;
        }
        arrayList.add(textWatcher);
    }

    public final ValueAnimator d0() {
        int[] iArr;
        int[] iArr2;
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        int i2;
        int i3;
        int i4;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float S2;
        short s;
        int i5;
        int i6;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float z2;
        int i7;
        if (this.a2 != null && this.C2 != null && !this.D1 && i86.e(360928) && this.C2.isShown()) {
            RecordCircle recordCircle = this.C2;
            if (!recordCircle.O && recordCircle.getWidth() > 0) {
                if (this.a2.getVisibility() != 0) {
                    this.a2.setVisibility(0);
                }
                this.a2.animate().cancel();
                this.a2.setScaleX(1.0f);
                this.a2.setScaleY(1.0f);
                this.a2.getLocationInWindow(new int[2]);
                this.C2.getLocationInWindow(new int[2]);
                float width = (this.a2.getWidth() / 2.0f) + (iArr[0] - iArr2[0]);
                float measuredHeight = ((this.a2.getMeasuredHeight() / 2.0f) - hl.L(3.0f)) + (iArr[1] - iArr2[1]);
                RecordCircle recordCircle2 = this.C2;
                float f18 = recordCircle2.K;
                float f19 = recordCircle2.L;
                float max = (Math.max(recordCircle2.M, hl.L(10.0f)) * 1.5f) + hl.L(6.0f);
                int ceil = (int) Math.ceil(max * 2.0f);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
                    float f20 = f18 - max;
                    float f21 = f19 - max;
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(-f20, -f21);
                    this.C2.draw(canvas);
                    int[] iArr3 = new int[ceil * ceil];
                    createBitmap.getPixels(iArr3, 0, ceil, 0, 0, ceil, ceil);
                    int i8 = ceil;
                    int max2 = Math.max(1, Math.round(hl.p * 0.75f));
                    int i9 = 0;
                    for (int i10 = 0; i10 < i8; i10 += max2) {
                        for (int i11 = 0; i11 < i8; i11 += max2) {
                            if ((iArr3[(i10 * i8) + i11] >>> 24) > 24) {
                                i9++;
                            }
                        }
                    }
                    if (i9 == 0) {
                        createBitmap.recycle();
                        return null;
                    }
                    int J0 = J0(aob.Uf) | (-16777216);
                    float[] fArr = {-0.24f, -0.17f, -0.11f, -0.06f, -0.02f, 0.03f, 0.08f, 0.13f};
                    int[] iArr4 = new int[8];
                    int i12 = 0;
                    for (int i13 = 8; i12 < i13; i13 = 8) {
                        float f22 = fArr[i12];
                        if (f22 < 0.0f) {
                            f22 = -f22;
                            i7 = -16777216;
                        } else {
                            i7 = -1;
                        }
                        iArr4[i12] = vm2.f(f22, J0, i7);
                        i12++;
                    }
                    int[] iArr5 = new int[i9];
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < i8) {
                        int i16 = 0;
                        while (i16 < i8) {
                            int i17 = iArr3[(i14 * i8) + i16];
                            int[] iArr6 = iArr5;
                            int i18 = i14;
                            if ((i17 >>> 24) > 24) {
                                iArr6[i15] = T2(i17);
                                i15++;
                            }
                            i16 += max2;
                            iArr5 = iArr6;
                            i14 = i18;
                        }
                        i14 += max2;
                    }
                    int[] iArr7 = iArr5;
                    Arrays.sort(iArr7);
                    int[] iArr8 = new int[8];
                    int i19 = 0;
                    for (int i20 = 8; i19 < i20; i20 = i20) {
                        int i21 = i19 + 1;
                        iArr8[i19] = iArr7[Math.min(i9 - 1, (i21 * i9) / 8)];
                        i19 = i21;
                    }
                    mva mvaVar = this.L5;
                    if (mvaVar == null) {
                        mvaVar = new mva(2400);
                        this.L5 = mvaVar;
                    }
                    mvaVar.a();
                    this.L5.e(false);
                    mva mvaVar2 = this.L5;
                    mvaVar2.u = iArr4;
                    mvaVar2.t = true;
                    float f23 = 0.12f;
                    if (aob.I.o()) {
                        f = 0.12f;
                    } else {
                        f = 0.0f;
                    }
                    mvaVar2.v = f;
                    float f24 = width;
                    this.L5.U = 0L;
                    float f25 = -hl.L(2400.0f);
                    if (SystemClock.uptimeMillis() - this.I5 < 80) {
                        f2 = this.K5;
                        f3 = 0.0f;
                    } else {
                        f2 = 0.0f;
                        f3 = 0.0f;
                    }
                    float max3 = Math.max(f25, Math.min(f3, f2));
                    if (max3 < (-hl.L(150.0f))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        f4 = max3;
                    } else {
                        f4 = 0.0f;
                    }
                    this.M5 = f4;
                    this.N5 = AnimationUtils.currentAnimationTimeMillis();
                    if (!z) {
                        f23 = 0.2f;
                    }
                    mva mvaVar3 = this.L5;
                    mvaVar3.T = 0.0f;
                    mvaVar3.S = 0.0f;
                    float f26 = i9;
                    float min = Math.min(1.0f, 1400.0f / f26);
                    float f27 = hl.p;
                    this.R5 = f20;
                    boolean z3 = z;
                    this.S5 = i8 + f20;
                    float[] fArr2 = new float[2400];
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        f5 = f24;
                        if (i22 >= i8) {
                            break;
                        }
                        int i25 = 2400;
                        float f28 = 0.3f;
                        if (i23 >= 2400) {
                            break;
                        }
                        float f29 = f18;
                        int i26 = 0;
                        while (i26 < i8 && i23 < i25) {
                            int i27 = iArr3[(i22 * i8) + i26];
                            int i28 = i23;
                            int i29 = i27 >>> 24;
                            if (i29 <= 24) {
                                i6 = i22;
                                f16 = f21;
                            } else {
                                int i30 = i24 + 1;
                                int i31 = i30 * 7;
                                if (S2(i31 + 3) > (((i29 * 0.7f) / 255.0f) + f28) * min) {
                                    i6 = i22;
                                    f16 = f21;
                                    i24 = i30;
                                } else {
                                    float S22 = S2(i31 + 11);
                                    float S23 = S2(i31 + 12);
                                    float S24 = S2(i31 + 14);
                                    float f30 = i26 + f20;
                                    float f31 = S22 - 0.5f;
                                    i5 = i26;
                                    float f32 = max2;
                                    float f33 = (f31 * f32) + f30;
                                    i6 = i22;
                                    float f34 = S23 - 0.5f;
                                    float f35 = (f34 * f32) + i22 + f21;
                                    float f36 = this.R5;
                                    f13 = f19;
                                    f14 = f23;
                                    float i32 = Utilities.i((f33 - f36) / (this.S5 - f36), 1.0f, 0.0f);
                                    float f37 = (0.03f * S24) + (i32 * f14) + 0.04f;
                                    float min2 = (Math.min(f37, 0.09f) * this.M5) + f33;
                                    f15 = f5;
                                    float x = c00.x(f34, 3.0f, f27, f15);
                                    float x2 = c00.x(f31, 2.0f, f27, measuredHeight);
                                    if (z3) {
                                        z2 = W2(min2, f35, x, x2, max3, S2(i31 + 15));
                                        f16 = f21;
                                        f17 = f20;
                                        this.L5.k(min2, f35, bp1.g(S22, 0.2f, 0.38f, min2 - x, x), Math.min(f35, measuredHeight) - (((S24 * 10.0f) + 6.0f) * f27), x, x2, z2, f37, R2(iArr8, T2(i27)));
                                        mva mvaVar4 = this.L5;
                                        float abs = (Math.abs(x - min2) * 1.35f) / z2;
                                        mvaVar4.f(Math.max(-abs, Math.min(abs, max3)));
                                    } else {
                                        f16 = f21;
                                        f17 = f20;
                                        z2 = xnb.z(i32, 0.16f, 0.92f, (S2(i31 + 15) * 0.16f) + 0.5f);
                                        this.L5.k(min2, f35, bp1.g(S22, 0.25f, f28, f15 - min2, min2), Math.min(f35, measuredHeight) - (((S24 * 22.0f) + 8.0f) * f27), x, x2, z2, f37, R2(iArr8, T2(i27)));
                                    }
                                    i23 = i28 + 1;
                                    fArr2[i28] = (z2 * 0.95f) + f37;
                                    i24 = i30;
                                    i26 = i5 + max2;
                                    f5 = f15;
                                    i22 = i6;
                                    f19 = f13;
                                    f23 = f14;
                                    f21 = f16;
                                    f20 = f17;
                                    i25 = 2400;
                                    f28 = 0.3f;
                                }
                            }
                            i5 = i26;
                            f13 = f19;
                            f14 = f23;
                            f17 = f20;
                            f15 = f5;
                            i23 = i28;
                            i26 = i5 + max2;
                            f5 = f15;
                            i22 = i6;
                            f19 = f13;
                            f23 = f14;
                            f21 = f16;
                            f20 = f17;
                            i25 = 2400;
                            f28 = 0.3f;
                        }
                        i22 += max2;
                        f24 = f5;
                        f18 = f29;
                        i23 = i23;
                        f19 = f19;
                        f23 = f23;
                        f21 = f21;
                        f20 = f20;
                    }
                    float f38 = f21;
                    float f39 = f18;
                    float f40 = f19;
                    float f41 = f20;
                    float min3 = Math.min(1.0f, 650.0f / f26);
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < i8) {
                        int i35 = 2400;
                        if (i23 >= 2400) {
                            break;
                        }
                        int i36 = 0;
                        while (i36 < i8 && i23 < i35) {
                            int i37 = iArr3[(i33 * i8) + i36];
                            int i38 = i37 >>> 24;
                            int i39 = i8;
                            if (i38 > 24) {
                                i34++;
                                int i40 = i34 * 13;
                                if (S2(i40 + 5) <= (((i38 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                    float S25 = S2(i40 + 6);
                                    float S26 = S2(i40 + 7);
                                    float S27 = S2(i40 + 8);
                                    f7 = min3;
                                    float f42 = S25 - 0.5f;
                                    int i41 = i23;
                                    float f43 = max2;
                                    float f44 = (f42 * f43) + f41 + i36;
                                    i = i33;
                                    float f45 = S26 - 0.5f;
                                    float f46 = (f43 * f45) + f38 + i33;
                                    float f47 = f44 - f39;
                                    float f48 = f46 - f40;
                                    i3 = max2;
                                    float sqrt = (float) Math.sqrt((f48 * f48) + (f47 * f47));
                                    if (sqrt < hl.L(1.0f)) {
                                        double d = S27 * 3.141592653589793d * 2.0d;
                                        float cos = (float) Math.cos(d);
                                        f9 = (float) Math.sin(d);
                                        f10 = cos;
                                    } else {
                                        f9 = f48 / sqrt;
                                        f10 = f47 / sqrt;
                                    }
                                    float S28 = ((S2(i40 + 9) * 13.0f) + 7.0f) * f27;
                                    if (z3) {
                                        f11 = 0.6f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    float f49 = S28 * f11;
                                    float f50 = S27 * 0.05f;
                                    float f51 = f10;
                                    float f52 = f9;
                                    float min4 = (Math.min(f50, 0.09f) * this.M5) + f44;
                                    float x3 = c00.x(f45, 3.0f, f27, f5);
                                    float x4 = c00.x(f42, 2.0f, f27, measuredHeight);
                                    if (z3) {
                                        f8 = max3;
                                        S2 = W2(min4, f46, x3, x4, max3, S2(i40 + 10)) * 1.08f;
                                        f12 = f50;
                                        i4 = i34;
                                        this.L5.k(min4, f46, bp1.g(S25, 0.2f, 0.38f, min4 - x3, x3), Math.min(f46, measuredHeight) - (((S26 * 10.0f) + 6.0f) * f27), x3, x4, S2, f12, R2(iArr8, T2(i37)));
                                        mva mvaVar5 = this.L5;
                                        float abs2 = (Math.abs(x3 - min4) * 1.35f) / S2;
                                        mvaVar5.f(Math.max(-abs2, Math.min(abs2, f8)));
                                    } else {
                                        f12 = f50;
                                        i4 = i34;
                                        f8 = max3;
                                        S2 = (S2(i40 + 10) * 0.2f) + 0.56f;
                                        this.L5.k(min4, f46, bp1.g(S25, 0.25f, 0.3f, f5 - min4, min4), Math.min(f46, measuredHeight) - (((S26 * 22.0f) + 8.0f) * f27), x3, x4, S2, f12, R2(iArr8, T2(i37)));
                                    }
                                    mva mvaVar6 = this.L5;
                                    int i42 = mvaVar6.D;
                                    int i43 = ((i42 + s) - 1) % mvaVar6.c;
                                    mvaVar6.x[i43] = f51 * f49;
                                    mvaVar6.y[i43] = f52 * f49;
                                    i2 = i41 + 1;
                                    fArr2[i41] = (S2 * 0.95f) + f12;
                                    i36 += i3;
                                    max3 = f8;
                                    i8 = i39;
                                    i34 = i4;
                                    i33 = i;
                                    max2 = i3;
                                    i35 = 2400;
                                    i23 = i2;
                                    min3 = f7;
                                }
                            }
                            f7 = min3;
                            i = i33;
                            i2 = i23;
                            i3 = max2;
                            i4 = i34;
                            f8 = max3;
                            i36 += i3;
                            max3 = f8;
                            i8 = i39;
                            i34 = i4;
                            i33 = i;
                            max2 = i3;
                            i35 = 2400;
                            i23 = i2;
                            min3 = f7;
                        }
                        int i44 = max2;
                        i33 += i44;
                        max3 = max3;
                        i8 = i8;
                        min3 = min3;
                        i23 = i23;
                        max2 = i44;
                    }
                    if (i23 == 0) {
                        createBitmap.recycle();
                        return null;
                    }
                    Arrays.sort(fArr2, 0, i23);
                    int i45 = i23 - 1;
                    float f53 = i23;
                    this.U5 = fArr2[Math.min(i45, (int) (0.72f * f53))] * 1000.0f;
                    float f54 = fArr2[Math.min(i45, (int) (f53 * 0.95f))] * 1000.0f;
                    this.V5 = f54;
                    float f55 = this.U5;
                    this.W5 = (Math.max(60.0f, f54 - f55) * 0.7f) + f55;
                    this.O5 = createBitmap;
                    this.P5 = f41;
                    this.Q5 = f38;
                    this.T5 = 0.0f;
                    if (z3) {
                        this.L5.U = this.N5;
                    }
                    this.X5 = true;
                    RecordCircle recordCircle3 = this.C2;
                    recordCircle3.P = true;
                    recordCircle3.invalidate();
                    zy1 zy1Var = this.a2;
                    zy1Var.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (!zy1Var.c && !zy1Var.e) {
                        if (zy1Var.f) {
                            f6 = zy1Var.a;
                        } else {
                            long j = zy1Var.H;
                            if (j < 0) {
                                j = uptimeMillis;
                            }
                            f6 = zy1.a(uptimeMillis - j);
                        }
                    } else {
                        f6 = 1.0f;
                    }
                    zy1Var.s = hl.R1(0.85f, 1.0f, f6) * hl.L(5.0f);
                    zy1Var.n = true;
                    if (zy1Var.G) {
                        uptimeMillis -= 240;
                    }
                    zy1Var.r = uptimeMillis;
                    zy1Var.y = 0.0f;
                    zy1Var.x = 0.0f;
                    zy1Var.w = 0.0f;
                    zy1Var.c = false;
                    zy1Var.d.stop();
                    zy1Var.g().O(true, 0.0f);
                    zy1Var.invalidate();
                    this.n = 0.0f;
                    this.h = 0.55f;
                    x2();
                    float f56 = this.V5 + 260.0f + 16.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f56);
                    ofFloat.setDuration(f56);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new rv1(this, this.a2, hl.L(3.0f) + hl.L(12.0f), this.C2));
                    ofFloat.addListener(new ow1(this));
                    return ofFloat;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final hc d1() {
        hc hcVar = new hc(getContext());
        Drawable drawable = (Drawable) hcVar.b;
        hcVar.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        hl.d3(new gc(hcVar, (byte) 2), 160L);
        return hcVar;
    }

    public final void d2(boolean z) {
        zu1 zu1Var;
        bn3 bn3Var;
        boolean z2;
        float f;
        float f2;
        if ((z || this.s2) && (zu1Var = this.E3) != null && !zu1Var.y() && ((bn3Var = this.j1) == null || !bn3Var.q())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.u6 != z2) {
            if (z2) {
                uc7.s1(this.R).Q1().b();
            }
            this.u6 = z2;
            ImageView imageView = this.i2;
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            float f3 = 1.0f;
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (z2) {
                f2 = 1.0f;
            } else {
                f2 = 0.6f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (!z2) {
                f3 = 0.6f;
            }
            scaleX.scaleY(f3).setInterpolator(k43.h).setDuration(420L).withEndAction(new vv1(this, z2, (byte) 1)).start();
            if (z2) {
                hc hcVar = this.h2;
                Objects.requireNonNull(hcVar);
                imageView.postDelayed(new gc(hcVar, (byte) 1), 220L);
                kg5 kg5Var = this.N;
                if (kg5Var != null) {
                    kg5Var.f(true);
                    this.N = null;
                }
                if (uc7.e1().getInt("aihintshown", 0) < 3) {
                    kg5 kg5Var2 = new kg5(getContext(), 3);
                    this.N = kg5Var2;
                    kg5Var2.p(true);
                    this.N.t(ob6.M0(2131754989, null));
                    setHintGlass(this.N);
                    this.N.o(0.0f, (imageView.getWidth() / 2.0f) + hl.L(4.0f));
                    addView(this.N, tre.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    kg5 kg5Var3 = this.N;
                    kg5Var3.r0 = new xv1(this, kg5Var2, (byte) 1);
                    kg5Var3.d = 4000L;
                    kg5Var3.v();
                    uc7.e1().edit().putInt("aihintshown", uc7.e1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            kg5 kg5Var4 = this.N;
            if (kg5Var4 != null) {
                kg5Var4.f(true);
                this.N = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        bx1 bx1Var;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat M0;
        boolean z;
        float f;
        float f2;
        double d;
        byte[] bArr;
        vw1 vw1Var;
        long j;
        gz1 gz1Var;
        int i3;
        int i4 = 0;
        if (i == jn7.X5) {
            if (i2 == this.R && objArr.length > 0 && ((Long) objArr[0]).longValue() == l()) {
                q2();
            }
        } else if (i == jn7.l4) {
            my1 my1Var = this.V0;
            if (my1Var != null) {
                my1Var.Q.i1();
            }
            jy1 jy1Var = this.w2;
            if (jy1Var != null) {
                ArrayList arrayList = jy1Var.n;
                while (i4 < arrayList.size()) {
                    ((mq0) arrayList.get(i4)).invalidate();
                    i4++;
                }
            }
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                tx1Var.postInvalidate();
                this.F0.q();
            }
        } else if (i == jn7.k2) {
            if (((Integer) objArr[0]).intValue() == this.v3) {
                if (this.l3 && !this.b4 && !c()) {
                    this.b4 = true;
                    uc7 s1 = uc7.s1(this.S.a);
                    long j2 = this.F3;
                    long threadMessageId = getThreadMessageId();
                    if (this.d1) {
                        i3 = 7;
                    } else {
                        i3 = 1;
                    }
                    s1.P4(i3, 0, j2, threadMessageId, null);
                }
                RecordCircle recordCircle = this.C2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i == jn7.s) {
            tx1 tx1Var2 = this.F0;
            if (tx1Var2 != null && tx1Var2.isFocused()) {
                hl.t1(this.F0);
            }
        } else {
            int i5 = jn7.m2;
            int i6 = jn7.n2;
            int i7 = 5;
            if (i != i5 && i != i6) {
                if (i == jn7.l2) {
                    if (((Integer) objArr[0]).intValue() == this.v3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.d1 = !booleanValue;
                        zw1 zw1Var = this.c1;
                        if (zw1Var != null) {
                            if (booleanValue) {
                                gz1Var = gz1.a;
                            } else {
                                gz1Var = gz1.b;
                            }
                            zw1Var.j(gz1Var, true);
                        }
                        if (!this.u3) {
                            this.u3 = true;
                            D2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.C2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        ez1 ez1Var = this.Z0;
                        if (ez1Var != null) {
                            ez1Var.a(this.X1);
                        }
                        zy1 zy1Var = this.a2;
                        if (zy1Var != null) {
                            zy1Var.e = false;
                        }
                    }
                } else if (i == jn7.o2) {
                    this.u3 = false;
                    this.Q3 = null;
                    this.T3 = null;
                    if (this.d1) {
                        j = 1500;
                    } else {
                        j = 800;
                    }
                    this.k7 = SystemClock.uptimeMillis() + j;
                    hl.d3(new fw1(this, (byte) 6), j + 16);
                } else if (i == jn7.p2) {
                    this.k7 = 0L;
                    this.Q3 = null;
                    this.T3 = null;
                    ez1 ez1Var2 = this.Z0;
                    if (ez1Var2 != null) {
                        ez1Var2.a(this.X1);
                    }
                    P(true);
                    this.u3 = true;
                    D2(0, true);
                } else if (i == jn7.s2) {
                    if (((Integer) objArr[0]).intValue() == this.v3) {
                        this.k7 = 0L;
                        this.X1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof oec) {
                            oec oecVar = (oec) obj;
                            this.T3 = oecVar;
                            String str = (String) objArr[2];
                            this.R3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.X1 = oecVar.r;
                            qgc qgcVar = this.g1;
                            if (qgcVar != null) {
                                qgcVar.setVideoPath(str);
                                this.g1.setKeyframes(arrayList2);
                                this.g1.setVisibility(0);
                                this.g1.setMinProgressDiff(1000.0f / ((float) this.T3.r));
                                Y0();
                            }
                            D2(3, true);
                            P(false);
                            return;
                        }
                        this.Q3 = (TLRPC.TL_document) obj;
                        this.R3 = (String) objArr[2];
                        if (objArr.length >= 4 && ((Boolean) objArr[3]).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (objArr.length >= 5) {
                            f = ((Float) objArr[4]).floatValue();
                        } else {
                            f = 0.0f;
                        }
                        if (objArr.length >= 6) {
                            f2 = ((Float) objArr[5]).floatValue();
                        } else {
                            f2 = 1.0f;
                        }
                        if (this.Q3 != null) {
                            c0();
                            if (this.f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = yac.h(this.R).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.R3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.Q3;
                                tL_message.flags |= 768;
                                this.S3 = new r47(yac.t0, tL_message, false, true);
                                this.f1.setAlpha(1.0f);
                                this.f1.setVisibility(0);
                                this.h1.setVisibility(0);
                                this.h1.setAlpha(0.0f);
                                this.h1.setScaleY(0.0f);
                                this.h1.setScaleX(0.0f);
                                int i8 = 0;
                                while (true) {
                                    if (i8 < this.Q3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.Q3.attributes.get(i8);
                                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                            d = documentAttribute.duration;
                                            break;
                                        }
                                        i8++;
                                    } else {
                                        d = 0.0d;
                                        break;
                                    }
                                }
                                int i9 = 0;
                                while (true) {
                                    if (i9 < this.Q3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = this.Q3.attributes.get(i9);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                            bArr = documentAttribute2.waveform;
                                            if (bArr == null || bArr.length == 0) {
                                                bArr = MediaController.getWaveform(this.R3);
                                                documentAttribute2.waveform = bArr;
                                            }
                                        } else {
                                            i9++;
                                        }
                                    } else {
                                        bArr = null;
                                        break;
                                    }
                                }
                                if (z && (vw1Var = this.g2) != null) {
                                    this.k2 = 0.0f;
                                    vw1Var.setAlpha(0.0f);
                                    vw1Var.setScaleX(0.0f);
                                    vw1Var.setScaleY(0.0f);
                                }
                                this.X1 = (long) (1000.0d * d);
                                x59 x59Var = this.i1;
                                String str2 = this.R3;
                                if (!x59Var.T) {
                                    x59Var.r = (float) d;
                                    x59Var.s = f;
                                    x59Var.w = f2;
                                    x59Var.x = false;
                                    x59Var.h.t(hl.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    x59Var.f.a(false, false);
                                    kfc kfcVar = x59Var.n;
                                    if (kfcVar == null) {
                                        kfcVar = new kfc();
                                        x59Var.n = kfcVar;
                                        kfcVar.K = new pq8(x59Var, (byte) 3);
                                    }
                                    kfcVar.i0(Uri.fromFile(new File(str2)), "other");
                                    x59Var.i(false);
                                    x59Var.L = 0;
                                    x59Var.M = bArr;
                                    Bitmap bitmap = x59Var.R0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        x59Var.R0 = null;
                                    }
                                    x59Var.U0 = null;
                                    x59Var.V0 = false;
                                    x59Var.O0 = -1;
                                    x59Var.H0.a();
                                    x59Var.G0.a();
                                    x59Var.invalidate();
                                }
                                P(false);
                                if (z) {
                                    e0();
                                    f0();
                                    c0();
                                    this.l3 = true;
                                    this.C2.g(false);
                                    RecordCircle recordCircle3 = this.C2;
                                    this.k4.getClass();
                                    recordCircle3.setControlsScale(1.0f);
                                    l lVar = this.D2;
                                    if (lVar != null) {
                                        lVar.setVisibility(0);
                                        this.D2.setAlpha(1.0f);
                                    }
                                }
                                D2(3, !z);
                                if (z && uc7.e1().getBoolean("design_voice_live_field", true) && !this.N2 && this.Q3 != null) {
                                    E0().u();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        xy1 xy1Var = this.O3;
                        if (xy1Var != null) {
                            xy1Var.x(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i == jn7.u2) {
                    Activity activity = this.D3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i4 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i4);
                    }
                } else if (i == jn7.e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.S3 != null && MediaController.z().H(this.S3)) {
                        r47 r47Var = MediaController.z().v0;
                        r47 r47Var2 = this.S3;
                        r47Var2.b0 = r47Var.b0;
                        r47Var2.i0 = r47Var.i0;
                    }
                } else if (i == jn7.z0) {
                    tw1 tw1Var = this.R0;
                    if (tw1Var != null) {
                        tw1Var.invalidate();
                    }
                } else if (i == jn7.K) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue == this.F3 && (chatFull = this.S2) != null && chatFull.slowmode_seconds != 0 && !r47.f3(num2.intValue()) && (M0 = uc7.s1(this.S.a).M0(Long.valueOf(this.S2.id))) != null && !xc2.N(M0) && !xc2.h0(M0)) {
                            TLRPC.ChatFull chatFull2 = this.S2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.S2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i == jn7.n1) {
                    if (this.S2 != null) {
                        L2();
                    }
                } else if (i == jn7.t2) {
                    this.Q3 = null;
                    this.T3 = null;
                    D2(4, true);
                } else if (i == jn7.T2) {
                    long longValue2 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue2 == this.F3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.j0 = tL_botMenuButton.text;
                            this.k0 = tL_botMenuButton.url;
                            this.U7 = 3;
                        } else if (!this.e3) {
                            this.U7 = 1;
                        } else {
                            this.U7 = 2;
                        }
                        t2(false);
                    }
                } else if (i == jn7.a3) {
                    A2(true);
                } else if (i == jn7.i5) {
                    if (this.s2 && (bx1Var = this.K0) != null) {
                        bx1Var.setLocked(!yac.h(this.R).p());
                    }
                    o0();
                } else if (i == jn7.S3) {
                    o0();
                }
            } else if (((Integer) objArr[0]).intValue() == this.v3) {
                this.k7 = 0L;
                if (this.u3) {
                    this.u3 = false;
                    if (i == i6) {
                        Integer num3 = (Integer) objArr[1];
                        if (num3.intValue() == 4) {
                            i7 = 4;
                        } else if (this.d1 && num3.intValue() == 5) {
                            i7 = 1;
                        } else if (num3.intValue() != 0) {
                            if (num3.intValue() == 6) {
                                i7 = 2;
                            } else {
                                i7 = 3;
                            }
                        }
                        if (i7 != 3) {
                            D2(i7, true);
                            return;
                        }
                        return;
                    }
                    D2(2, true);
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x59 x59Var;
        my1 my1Var = this.V0;
        if (my1Var != null && my1Var.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, hl.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (this.J1 && (x59Var = this.i1) != null && x59Var.getTrimProgress() > 0.0f) {
            int[] iArr = this.v5;
            getLocationInWindow(iArr);
            float f = iArr[1];
            z0(this, canvas, iArr[0], f, f, 100000.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2 = this.v2;
        rw1 rw1Var = this.o2;
        if (view != view2 && view != rw1Var) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.K7.f;
            canvas.save();
            if (view == rw1Var) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.v2) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public final void e(TLRPC.Document document, String str, Object obj, n47 n47Var, boolean z, boolean z2, int i, int i2) {
        if (this.T7) {
            return;
        }
        ou1 ou1Var = this.K3;
        zu1 zu1Var = this.E3;
        if (ou1Var != null && zu1Var != null && ou1Var.f) {
            zu1Var.uc();
        } else if (c() && i == 0) {
            jj.J(this.D3, zu1Var.a(), new mw1(this, document, str, obj, n47Var, z), this.K4);
        } else {
            jj.X(this.R, this.F3, 1, new nw1(this, document, str, n47Var, z2, i, i2, obj, z));
        }
    }

    public final void e0() {
        l lVar = this.D2;
        wma wmaVar = this.b2;
        if (lVar == null) {
            l lVar2 = new l(this, getContext());
            this.D2 = lVar2;
            lVar2.setVisibility(8);
            wmaVar.addView(this.D2, tre.e(-1, -2, 80));
        }
        if (this.C2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.C2 = recordCircle;
        recordCircle.setVisibility(8);
        wmaVar.addView(this.C2, tre.e(-1, -2, 80));
    }

    public final float e1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.K7.f;
        float f = 0.0f;
        ChatActivityEnterView chatActivityEnterView = frameLayout;
        while (chatActivityEnterView != null) {
            if (chatActivityEnterView != this) {
                f += chatActivityEnterView.getTranslationY() + chatActivityEnterView.getTop();
                if (chatActivityEnterView.getParent() instanceof View) {
                    chatActivityEnterView = (View) chatActivityEnterView.getParent();
                } else {
                    chatActivityEnterView = 0;
                }
            } else {
                return measuredHeight - f;
            }
        }
        return frameLayout.getHeight() - hl.L(44.0f);
    }

    public final void e2(boolean z) {
        Editable editable;
        String str;
        int i;
        if (!this.N2 && this.K0 != null && getWidth() != 0) {
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                editable = tx1Var.getText();
            } else {
                editable = null;
            }
            if (editable != null && !TextUtils.isEmpty(editable.toString().trim()) && this.Q3 == null && !X0()) {
                if (z) {
                    str = "airewritehint_on_";
                } else {
                    str = "airewritehint_off_";
                }
                StringBuilder sb = new StringBuilder(str);
                long j = W7;
                if (j == 0) {
                    try {
                        j = org.telegram.messenger.a.b.getPackageManager().getPackageInfo(org.telegram.messenger.a.b.getPackageName(), 0).lastUpdateTime;
                        W7 = j;
                    } catch (Exception unused) {
                        j = 1;
                        W7 = 1L;
                    }
                }
                sb.append(j);
                String sb2 = sb.toString();
                SharedPreferences e1 = uc7.e1();
                if (e1.getInt(sb2, 0) < 2) {
                    kg5 kg5Var = this.G6;
                    if (kg5Var == null || !kg5Var.W || this.H6 != z) {
                        e1.edit().putInt(sb2, e1.getInt(sb2, 0) + 1).apply();
                        this.H6 = z;
                        kg5 kg5Var2 = this.G6;
                        if (kg5Var2 != null) {
                            kg5Var2.f(true);
                            this.G6 = null;
                        }
                        kg5 kg5Var3 = new kg5(getContext(), 3);
                        this.G6 = kg5Var3;
                        kg5Var3.q(13.0f);
                        setHintGlass(kg5Var3);
                        kg5Var3.p(true);
                        if (z) {
                            i = 2131755005;
                        } else {
                            i = 2131755006;
                        }
                        kg5Var3.t(hl.S2(ob6.M0(i, null)));
                        addView(kg5Var3, tre.d(-1, 200.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
                        w1(kg5Var3);
                        getViewTreeObserver().addOnPreDrawListener(new defpackage.z(this, kg5Var3, (byte) 1));
                        kg5Var3.r0 = new xv1(this, kg5Var3, (byte) 0);
                        kg5Var3.d = 3500L;
                        kg5Var3.v();
                    }
                }
            }
        }
    }

    public final void f0() {
        if (this.e1 == null && getContext() != null) {
            b6 b6Var = new b6(getContext(), (byte) 5);
            this.e1 = b6Var;
            b6Var.setClipChildren(false);
            this.e1.setVisibility(8);
            this.n2.addView(this.e1, tre.c(44.0f, -1));
            this.e1.setOnTouchListener(new q8((byte) 28));
            b6 b6Var2 = this.e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.Z1 = slideTextView;
            b6Var2.addView(slideTextView, tre.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(hl.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            zy1 zy1Var = new zy1(this, getContext());
            this.a2 = zy1Var;
            linearLayout2.addView(zy1Var, tre.t(28, 28, 16, 0, 0, 0, 0));
            this.a2.d(j0());
            this.a2.setOnClickListener(new pv1(this, (byte) 0));
            LinearLayout linearLayout3 = this.d;
            ez1 ez1Var = new ez1(this, getContext());
            this.Z0 = ez1Var;
            linearLayout3.addView(ez1Var, tre.t(-1, -1, 16, 6, 0, 0, 0));
            this.e1.addView(this.d, tre.e(-1, -1, 16));
        }
    }

    public final void f2() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null && xc2.V(zu1Var.e)) {
            d31.b0(zu1Var).f(uc7.s1(this.R).k4.p1.f(), new mv1(this, (byte) 14)).j();
        }
    }

    public final void g0() {
        if (this.y2 == null && this.E3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231501).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231502).mutate();
            int i = aob.Nl;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            vnb vnbVar = this.K4;
            yob.x(this, mutate, i, vnbVar, mode);
            yob.x(this, mutate2, aob.ag, vnbVar, mode);
            zm2 zm2Var = new zm2(mutate, mutate2);
            cx1 cx1Var = new cx1(this, getContext());
            this.y2 = cx1Var;
            cx1Var.setImageDrawable(zm2Var);
            this.y2.setVisibility(8);
            this.y2.setContentDescription(ob6.M0(2131745576, null));
            this.y2.setScaleType(ImageView.ScaleType.CENTER);
            cx1 cx1Var2 = this.y2;
            int i2 = aob.i6;
            yob.R(cx1Var2, aob.f0(J0(i2), 1, -1), null, yob.M(i2), vnbVar);
            this.n2.addView(this.y2, 2, tre.e(44, 44, 85));
            this.y2.setOnClickListener(new pv1(this, (byte) 7));
            this.y2.setTranslationX(0.0f);
        }
    }

    public final void g1() {
        long j;
        float audioLeft;
        float audioRight;
        k(false);
        snc sncVar = this.r1;
        if (sncVar != null) {
            sncVar.k("destroy", true);
            vnc vncVar = sncVar.h;
            if (vncVar != null) {
                hl.B2(vncVar);
                sncVar.h = null;
            }
            knc kncVar = sncVar.L;
            if (kncVar != null) {
                hl.B2(kncVar);
                sncVar.L = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.V(this.q1);
        }
        bn3 bn3Var = this.j1;
        if (bn3Var != null) {
            DictationAsr.V(bn3Var.n0);
            bn3Var.o();
            ho3 ho3Var = bn3Var.F;
            if (ho3Var != null) {
                ho3Var.a();
            }
            z92 z92Var = bn3Var.b0;
            if (z92Var != null) {
                z92Var.f = null;
            }
            hl.B2(bn3Var.s);
            hl.B2(bn3Var.w);
            this.j1 = null;
        }
        x59 x59Var = this.i1;
        if (x59Var != null) {
            x59Var.T = true;
            kfc kfcVar = x59Var.n;
            if (kfcVar != null) {
                kfcVar.t0(false);
                x59Var.n.l0();
                x59Var.n = null;
            }
        }
        if (this.i1 != null && this.Q3 != null) {
            ls6 d0 = ls6.d0(this.R);
            long j2 = this.F3;
            zu1 zu1Var = this.E3;
            if (zu1Var != null && zu1Var.x4) {
                j = zu1Var.c();
            } else {
                j = 0;
            }
            x59 x59Var2 = this.i1;
            if (x59Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = x59Var2.getAudioLeft();
            }
            float f = audioLeft;
            x59 x59Var3 = this.i1;
            if (x59Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = x59Var3.getAudioRight();
            }
            d0.d2(j2, j, f, audioRight);
        }
        this.N2 = true;
        jn7.f(this.R).n(this, jn7.l2);
        jn7.f(this.R).n(this, jn7.o2);
        jn7.f(this.R).n(this, jn7.p2);
        jn7.f(this.R).n(this, jn7.m2);
        jn7.f(this.R).n(this, jn7.X5);
        jn7.f(this.R).n(this, jn7.n2);
        jn7.f(this.R).n(this, jn7.k2);
        jn7.f(this.R).n(this, jn7.s);
        jn7.f(this.R).n(this, jn7.s2);
        jn7.f(this.R).n(this, jn7.u2);
        jn7.f(this.R).n(this, jn7.e2);
        jn7.f(this.R).n(this, jn7.z0);
        jn7.f(this.R).n(this, jn7.K);
        jn7.f(this.R).n(this, jn7.n1);
        jn7.f(this.R).n(this, jn7.t2);
        jn7.f(this.R).n(this, jn7.T2);
        jn7.f(this.R).n(this, jn7.a3);
        jn7.f(this.R).n(this, jn7.i5);
        jn7.f(this.R).n(this, jn7.S3);
        jn7.e().n(this, jn7.l4);
        my1 my1Var = this.V0;
        if (my1Var != null) {
            my1Var.A();
        }
        mv1 mv1Var = this.I0;
        if (mv1Var != null) {
            hl.r(mv1Var);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.f3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.f3 = null;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (this.l3 && !this.d1) {
            hl.c3(new n9(this.D3, (byte) 1));
        }
        wma wmaVar = this.b2;
        if (wmaVar != null) {
            wmaVar.setDelegate(null);
        }
        ix1 ix1Var = this.r0;
        if (ix1Var != null) {
            ix1Var.e = false;
            ix1Var.dismiss();
        }
    }

    public boolean g2(Runnable runnable) {
        return false;
    }

    public hb getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.I2;
    }

    public ImageView getAttachButton() {
        return this.g2;
    }

    public View getAudioVideoButtonContainer() {
        return this.a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            return top + this.v2.getLayoutParams().height;
        }
        return top;
    }

    public dv1 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.a = new Path();
            frameLayout.c = aob.w0(null, aob.Fi, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(hl.o());
            frameLayout.addView(textView, tre.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(hl.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, tre.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i = aob.Hi;
            hf0 f0 = aob.f0(aob.w0(null, i, false), 2, -1);
            uob M = yob.M(i);
            view.setBackground(f0);
            yob.j(view, f0, null, M, null);
            frameLayout.addView(view, tre.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.l0 = frameLayout;
            frameLayout.setVisibility(8);
            W();
            this.l0.setBotMenuButton(this.m0);
            this.n2.addView(this.l0, tre.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return 0;
        }
        return tx1Var.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.O2 != null) {
            if (!TextUtils.isEmpty(this.K2)) {
                return this.K2;
            }
            return null;
        } else if (this.F0 != null && L0()) {
            return this.F0.getText();
        } else {
            return null;
        }
    }

    @Override
    public float getEditFieldBottomOffset() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) tx1Var.getLayoutParams()).bottomMargin - hl.L(1.5f);
    }

    @Override
    public Editable getEditText() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return null;
        }
        return tx1Var.getText();
    }

    public r47 getEditingMessageObject() {
        return this.O2;
    }

    public long getEffectId() {
        return this.o7;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.p3;
    }

    public o24 getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.a5;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.F0 != null && L0()) {
            return this.F0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.Z4;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.C2;
    }

    public long getRecordTimerStartTime() {
        ez1 ez1Var = this.Z0;
        if (ez1Var != null && ez1Var.a) {
            return ez1Var.d;
        }
        return 0L;
    }

    public r47 getReplyingMessageObject() {
        return this.I3;
    }

    public int getRestingFieldHeight() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return hl.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tx1Var.getLayoutParams();
        int paddingTop = this.F0.getPaddingTop();
        return Math.max(hl.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + paddingTop + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return 0;
        }
        try {
            return tx1Var.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e) {
            cc4.g(e, true);
            return 0;
        }
    }

    public View getSendButton() {
        if (getSendButtonInternal().getVisibility() == 0) {
            return getSendButtonInternal();
        }
        return this.a1;
    }

    public View getSendButtonInternal() {
        return this.K0;
    }

    public b77 getSendMessageSuggestionParams() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.k7();
        }
        return 0L;
    }

    public c8a getSenderSelectView() {
        return this.q0;
    }

    public wma getSizeNotifierLayout() {
        return this.b2;
    }

    public float getSlideToCancelProgress() {
        return this.X4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((ema) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.getMessagesController().M1(zu1Var.a());
        }
        return uc7.s1(this.R).M1(this.F3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.u4;
    }

    public int getStickersExpandedHeight() {
        return this.s4;
    }

    public ImageView getSuggestButton() {
        return this.l2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = ls6.d0(yac.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.L7.e;
    }

    public float getTopViewHeight() {
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            return this.v2.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.v2;
        if (view != null && view.getVisibility() != 8) {
            return this.v2.getTranslationY();
        }
        return 0.0f;
    }

    public o5c getTrendingStickersAlert() {
        return this.P3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.p3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f = this.I2;
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            f += (1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f;
    }

    public final void h0() {
        if (this.q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.a = imageReceiver;
            view.b = new rb0((vnb) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.e = paint;
            imageReceiver.q0(hl.L(28.0f));
            paint.setStrokeWidth(hl.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(ob6.a0("AccDescrSendAsPeer", null, 2131754770, ""));
            this.q0 = view;
            view.setOnClickListener(new pv1(this, (byte) 2));
            this.q0.setVisibility(8);
            this.n2.addView(this.q0, tre.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void h2() {
        i2(1, 0, true, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(TLRPC.Document document) {
        ls6.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        my1 my1Var = this.V0;
        if (my1Var != null && document != null) {
            boolean isEmpty = my1Var.j1.isEmpty();
            my1Var.W();
            if (isEmpty) {
                my1Var.X(false);
            }
        }
    }

    public final void i0() {
        ValueAnimator valueAnimator = this.V6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V6 = null;
        }
        if (!this.u3) {
            p0(false, false);
            return;
        }
        if (this.T6) {
            this.U6 = 1.0f;
            this.H1 = SystemClock.uptimeMillis() + 1500;
        }
        this.T6 = false;
    }

    public final void i1() {
        this.Y2 = true;
        snc sncVar = this.r1;
        if (sncVar != null) {
            sncVar.k("chat paused", true);
        }
        if (j0() && this.u3) {
            n0();
        }
        ix1 ix1Var = this.r0;
        if (ix1Var != null) {
            ix1Var.e = false;
            ix1Var.dismiss();
        }
        if (this.o3) {
            this.a3 = true;
        }
        fw1 fw1Var = new fw1(this, (byte) 9);
        this.i7 = fw1Var;
        hl.d3(fw1Var, 500L);
    }

    public final void i2(int i, int i2, boolean z, boolean z2) {
        byte b;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup;
        int i4;
        float f;
        if (i != 2) {
            pn pnVar = this.z4;
            dx1 dx1Var = this.M4;
            Property property = View.TRANSLATION_Y;
            boolean z5 = false;
            if (i == 1) {
                if (i2 == 0) {
                    if (this.D3 == null && this.V0 == null) {
                        return;
                    }
                    Z();
                }
                if (i2 == 0) {
                    x();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    jy1 jy1Var = this.w2;
                    if (jy1Var != null && jy1Var.getVisibility() != 8) {
                        this.w2.setVisibility(8);
                        this.Y0 = false;
                        i3 = this.w2.getMeasuredHeight();
                    } else {
                        i3 = 0;
                    }
                    this.V0.setShowing(true);
                    viewGroup = this.V0;
                    this.d4 = 0;
                } else if (i2 == 1) {
                    if (this.Y0) {
                        this.w2.getVisibility();
                    }
                    this.Y0 = true;
                    my1 my1Var = this.V0;
                    if (my1Var != null && my1Var.getVisibility() != 8) {
                        this.c2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i4 = this.V0.getMeasuredHeight();
                    } else {
                        i4 = 0;
                    }
                    this.w2.setVisibility(0);
                    ViewGroup viewGroup2 = this.w2;
                    this.d4 = 1;
                    uc7.s1(this.R).X3.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i3 = i4;
                    viewGroup = viewGroup2;
                } else {
                    i3 = 0;
                    viewGroup = null;
                }
                this.U2 = i2;
                if (this.m3 <= 0) {
                    f = 200.0f;
                    this.m3 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                } else {
                    f = 200.0f;
                }
                int i5 = this.n3;
                if (i5 <= 0) {
                    i5 = uc7.d1().getInt("kbd_height_land3", hl.L(f));
                    this.n3 = i5;
                }
                Point point = hl.q;
                if (point.x <= point.y) {
                    i5 = this.m3;
                }
                zu1 zu1Var = this.E3;
                if (zu1Var != null && zu1Var.getParentLayout() != null) {
                    i5 -= ((ActionBarLayout) zu1Var.getParentLayout()).u(false);
                }
                if (i2 == 1) {
                    i5 = Math.min(this.w2.getKeyboardHeight(), i5);
                }
                jy1 jy1Var2 = this.w2;
                if (jy1Var2 != null) {
                    jy1Var2.setPanelHeight(i5);
                }
                if (viewGroup != null && this.I7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i5;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!hl.E) {
                    hl.t1(this.F0);
                }
                wma wmaVar = this.b2;
                if (wmaVar != null) {
                    this.p3 = i5;
                    wmaVar.requestLayout();
                    O1(true, true);
                    t2(true);
                    l1();
                    if (this.X2 && !this.o3 && i5 != i3 && z) {
                        fw1 fw1Var = new fw1(this, (byte) 0);
                        if (this.w) {
                            this.x = fw1Var;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            float f2 = i5 - i3;
                            if (this.I7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(f2, 0.0f));
                            } else {
                                viewGroup.setTranslationY(f2);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f2, 0.0f));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new v5(this, fw1Var, (byte) 12));
                            hl.d3(dx1Var, 50L);
                            pnVar.d();
                        }
                        requestLayout();
                    }
                }
                r2d r2dVar = this.I7;
                if (r2dVar != null) {
                    ((v2d) r2dVar).h(i5);
                }
            } else {
                if (this.R0 != null) {
                    O1(false, true);
                }
                this.U2 = -1;
                my1 my1Var2 = this.V0;
                if (my1Var2 != null) {
                    if (i == 2 && !hl.D && !hl.E) {
                        this.v4 = false;
                        xy1 xy1Var = this.O3;
                        if (xy1Var != null) {
                            xy1Var.o(0.0f);
                        }
                        this.c2.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.X2 && !this.o3 && !this.o4) {
                        this.X0 = true;
                        this.d4 = 0;
                        my1Var2.setShowing(false);
                        gw1 gw1Var = new gw1(this, i, (byte) 0);
                        if (!this.w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            r2d r2dVar2 = this.I7;
                            my1 my1Var3 = this.V0;
                            if (r2dVar2 != null) {
                                z3 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(my1Var3.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z3 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(my1Var3, property, my1Var3.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            pnVar.d();
                            this.W0.addListener(new v5(this, gw1Var, (byte) 13));
                        } else {
                            z3 = false;
                            this.x = gw1Var;
                        }
                        hl.d3(dx1Var, 50L);
                        requestLayout();
                        z5 = z3;
                    } else {
                        xy1 xy1Var2 = this.O3;
                        if (xy1Var2 != null) {
                            xy1Var2.o(0.0f);
                        }
                        z5 = false;
                        this.p3 = 0;
                        this.c2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z5;
                }
                jy1 jy1Var3 = this.w2;
                if (jy1Var3 != null && jy1Var3.getVisibility() == 0) {
                    if (i != 2 || hl.D || hl.E) {
                        if (this.X2 && !this.o3) {
                            if (this.Y0) {
                                this.d4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            r2d r2dVar3 = this.I7;
                            jy1 jy1Var4 = this.w2;
                            if (r2dVar3 != null) {
                                b = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(jy1Var4.getMeasuredHeight()));
                            } else {
                                b = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(jy1Var4, property, jy1Var4.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(hb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new ry1(this, i, b));
                            pnVar.d();
                            hl.d3(dx1Var, 50L);
                            requestLayout();
                        } else if (!this.Z3) {
                            this.w2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i2 == 1 && this.b3 != null) {
                    uc7.s1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.b3.e1()).apply();
                }
                t2(true);
                r2d r2dVar4 = this.I7;
                if (r2dVar4 != null) {
                    ((v2d) r2dVar4).i(z2);
                }
            }
            if (this.m4 || this.n4) {
                P(true);
            }
            if (this.o4 && i != 1) {
                z4 = false;
                a2(false, false, false, true);
            } else {
                z4 = false;
            }
            y2(z4);
            I();
        }
    }

    public final void j(TLRPC.Document document) {
        Z();
        my1 my1Var = this.V0;
        int i = my1Var.d1;
        ls6.d0(i).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = my1Var.k1.isEmpty();
        my1Var.k1 = ls6.d0(i).j0(0, true);
        g24 g24Var = my1Var.z0;
        if (g24Var != null) {
            g24Var.f();
        }
        if (isEmpty) {
            my1Var.X(false);
        }
    }

    public final boolean j0() {
        if (this.l1) {
            if (!this.T2 || !this.d1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j1() {
        tx1 tx1Var;
        this.Y2 = false;
        if (uc7.e1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i = 0; i < 3; i++) {
                hl.d3(new fw1(this, (byte) 3), jArr[i]);
            }
        }
        fw1 fw1Var = this.i7;
        if (fw1Var != null) {
            hl.r(fw1Var);
            this.i7 = null;
        }
        if (!K0() || !A()) {
            getVisibility();
            if (this.a3 && !org.telegram.ui.ActionBar.e.hasSheets(this.E3)) {
                this.a3 = false;
                xy1 xy1Var = this.O3;
                if (xy1Var != null) {
                    xy1Var.X0();
                }
                if (this.G2 == 0 && (tx1Var = this.F0) != null) {
                    tx1Var.requestFocus();
                }
                hl.E3(this.F0);
                if (!hl.D && !this.o3 && !hl.E) {
                    this.Z3 = true;
                    dx1 dx1Var = this.g4;
                    hl.r(dx1Var);
                    hl.d3(dx1Var, 100L);
                }
            }
        }
    }

    public final void j2() {
        xy1 xy1Var = this.O3;
        if ((xy1Var == null || !xy1Var.g()) && wf3.y(this.F3)) {
            TLRPC.Chat M0 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
            d31 b0 = d31.b0(this.E3);
            StringBuilder sb = new StringBuilder();
            if (xc2.p(M0)) {
                sb.append(ob6.M0(2131745335, null));
            }
            if (xc2.u(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745332, null));
            }
            if (xc2.t(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745333, null));
            }
            if (xc2.o(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745336, null));
            }
            if (xc2.l(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745337, null));
            }
            if (xc2.v(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745331, null));
            }
            if (xc2.s(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745334, null));
            }
            if (xc2.m(M0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.M0(2131745338, null));
            }
            b0.G(2131624113, 3, ob6.a0("SendPlainTextRestrictionHint", null, 2131745320, sb.toString())).j();
        }
    }

    public final void k(boolean z) {
        zu1 zu1Var;
        if (this.A6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.A6, true);
            this.A6 = -1;
        }
        dx1 dx1Var = this.D6;
        if (dx1Var != null) {
            hl.r(dx1Var);
            this.D6 = null;
        }
        this.B6 = false;
        dc dcVar = this.y6;
        if (dcVar != null) {
            dcVar.d(false);
        }
        m();
        if (z && (zu1Var = this.E3) != null) {
            d31.b0(zu1Var).Q(2131624012, 36, "Couldn't rewrite the message. It wasn't sent.").j();
        }
    }

    public final boolean k0(View view, float[] fArr) {
        if (view == null || view.getWidth() <= 0 || !(view.getParent() instanceof View)) {
            return false;
        }
        int[] iArr = this.g7;
        ((View) view.getParent()).getLocationInWindow(iArr);
        fArr[0] = (view.getWidth() / 2.0f) + view.getX() + iArr[0];
        fArr[1] = (view.getHeight() / 2.0f) + view.getY() + iArr[1];
        return true;
    }

    public final boolean k1(android.view.View r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.k1(android.view.View):boolean");
    }

    public final void k2(boolean z) {
        boolean z2;
        float f;
        float f2;
        long j;
        zu1 zu1Var;
        bn3 bn3Var = this.j1;
        boolean z3 = true;
        if (bn3Var != null && bn3Var.q()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && ((this.s2 || z) && (zu1Var = this.E3) != null && !zu1Var.y() && this.O2 == null)) {
            uc7.s1(this.R);
            boolean z4 = f11.a;
        } else {
            z3 = false;
        }
        if (this.v6 == z3) {
            return;
        }
        this.v6 = z3;
        ImageView imageView = this.j2;
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        float f3 = 1.0f;
        if (z3) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (z3) {
            f2 = 1.0f;
        } else if (z2) {
            f2 = 0.85f;
        } else {
            f2 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f2);
        if (!z3) {
            if (z2) {
                f3 = 0.85f;
            } else {
                f3 = 0.6f;
            }
        }
        ViewPropertyAnimator interpolator = scaleX.scaleY(f3).setInterpolator(k43.h);
        if (!z2 && !this.w6) {
            j = 420;
        } else {
            j = 150;
        }
        interpolator.setDuration(j).withEndAction(new vv1(this, z3, (byte) 2)).start();
    }

    public final long l() {
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            return zu1Var.a();
        }
        return this.F3;
    }

    public final void l0() {
        int i;
        b6 b6Var = this.e1;
        if (b6Var != null && (b6Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e1.getLayoutParams();
            if (j0()) {
                i = 80;
            } else {
                i = 0;
            }
            if (layoutParams.gravity != i) {
                layoutParams.gravity = i;
                this.e1.setLayoutParams(layoutParams);
            }
        }
    }

    public final void l1() {
        int height = this.b2.getHeight();
        if (!this.o3) {
            height -= this.p3;
        }
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            xy1Var.C1(height);
        }
        if (this.v2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + hl.L(72.0f);
            boolean z = this.W3;
            fm0 fm0Var = this.L7;
            if (height < currentActionBarHeight) {
                if (z) {
                    this.W3 = false;
                    if (this.V3) {
                        fm0Var.a(false, false);
                    }
                }
            } else if (!z) {
                this.W3 = true;
                if (this.V3) {
                    fm0Var.a(true, false);
                }
            }
        }
    }

    public final boolean l2() {
        ImageView imageView;
        if (this.O != null || (imageView = this.l2) == null || imageView.getVisibility() != 0 || uc7.e1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        kg5 kg5Var = new kg5(getContext(), 3);
        this.O = kg5Var;
        kg5Var.q(13.0f);
        setHintGlass(this.O);
        this.O.p(true);
        this.O.t(ob6.a0(null, null, 2131744075, ro4.i(this.R, this.F3)));
        this.O.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        this.O.o(1.0f, -((getWidth() - hl.L(12.0f)) - ((this.l2.getMeasuredWidth() / 2.0f) + (this.l2.getX() + (this.e2.getX() + this.n2.getX())))));
        addView(this.O, tre.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        kg5 kg5Var2 = this.O;
        kg5Var2.r0 = new fw1(this, (byte) 2);
        kg5Var2.d = 8000L;
        kg5Var2.v();
        uc7.e1().edit().putInt("channelsuggesthint2", uc7.e1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    public final void m() {
        dc dcVar = this.y6;
        if (dcVar != null && dcVar.d) {
            dcVar.d = false;
            dcVar.c();
        }
    }

    public final void m0() {
        RecordCircle recordCircle;
        if (!this.u3 && ((recordCircle = this.C2) == null || !ChatActivityEnterView.this.j5)) {
            return;
        }
        this.u3 = false;
        this.X1 = 0L;
        this.D1 = true;
        try {
            D2(2, true);
            this.D1 = false;
            hl.d3(new fw1(this, (byte) 17), 120L);
        } catch (Throwable th) {
            this.D1 = false;
            throw th;
        }
    }

    public final void m1() {
        long j;
        uc7.e1().edit().putInt("aihintshown", 3).apply();
        uc7.s1(this.R).Q1().b();
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            j = zu1Var.a();
        } else {
            j = this.F3;
        }
        if (this.s2) {
            if (this.t2 != null) {
                b1 b1Var = new b1(getContext(), this.K4);
                b1Var.p1(this.t2);
                b1Var.f2 = new jw1(this, (byte) 1);
                kw1 kw1Var = new kw1(this, j, (byte) 0);
                b1Var.g2 = j;
                b1Var.j2 = kw1Var;
                b1Var.show();
                return;
            }
            return;
        }
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return;
        }
        n1(tx1Var.getText(), new jw1(this, (byte) 2));
    }

    public final void m2() {
        n2(true, false);
    }

    public final ValueAnimator n(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y2.a, f);
        ofFloat.addUpdateListener(new qv1(this, (byte) 6));
        return ofFloat;
    }

    public final void n0() {
        tx1 tx1Var;
        i0();
        bn3 bn3Var = this.j1;
        boolean z = true;
        if (bn3Var != null && bn3Var.p0 && bn3Var.r == 1) {
            bn3Var.w();
        }
        tx1 tx1Var2 = this.F0;
        if (tx1Var2 != null && tx1Var2.length() > 0) {
            qw1 qw1Var = this.N4;
            qw1Var.getClass();
            ChatActivityEnterView chatActivityEnterView = qw1Var.b;
            float f = 1.0f;
            chatActivityEnterView.h = 1.0f;
            chatActivityEnterView.x2();
            if (this.B0) {
                f = 0.5f;
            }
            qw1 qw1Var2 = this.P4;
            qw1Var2.getClass();
            ChatActivityEnterView chatActivityEnterView2 = qw1Var2.b;
            chatActivityEnterView2.n = f;
            chatActivityEnterView2.x2();
        }
        if (!this.u3 || (tx1Var = this.F0) == null || tx1Var.length() <= 0) {
            z = false;
        }
        this.X6 = z;
        try {
            m0();
            this.X6 = false;
            tw1 tw1Var = this.R0;
            if (tw1Var != null) {
                tw1Var.invalidate();
            }
        } catch (Throwable th) {
            this.X6 = false;
            throw th;
        }
    }

    public final void n1(CharSequence charSequence, pcc pccVar) {
        long j;
        boolean z;
        if (this.F0 == null) {
            return;
        }
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            j = zu1Var.a();
        } else {
            j = this.F3;
        }
        boolean z2 = false;
        if (fc.b(this.R, l()) != null) {
            z = true;
        } else {
            z = false;
        }
        b1 b1Var = new b1(getContext(), this.K4);
        b1Var.I0 = new lw1(this, z, (byte) 0);
        b1Var.q1(charSequence);
        b1Var.T2 = new fw1(this, (byte) 23);
        b1Var.e2 = new y0(this, pccVar, (byte) 29);
        if (this.O2 != null) {
            z2 = true;
        }
        b1Var.o1(j, z2, new kw1(this, j, (byte) 1));
        b1Var.show();
    }

    public final void n2(boolean z, boolean z2) {
        boolean z3;
        if (this.v2 != null && !this.U3 && getVisibility() == 0) {
            rw1 rw1Var = this.f1;
            if ((rw1Var == null || rw1Var.getVisibility() != 0) && !this.w3 && this.K3 == null && (this.c3 == null || this.O2 != null)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && z && z3 && !this.o3 && !U0()) {
                o1();
                fw1 fw1Var = this.W;
                if (fw1Var != null) {
                    hl.r(fw1Var);
                }
                fw1 fw1Var2 = new fw1(this, (byte) 18);
                this.W = fw1Var2;
                hl.d3(fw1Var2, 200L);
                return;
            }
            this.V3 = true;
            this.U3 = true;
            if (this.W3) {
                this.L7.a(true, z);
                if (z3) {
                    tx1 tx1Var = this.F0;
                    if (tx1Var != null) {
                        tx1Var.requestFocus();
                    }
                    o1();
                    return;
                }
                return;
            }
            return;
        }
        rw1 rw1Var2 = this.f1;
        if ((rw1Var2 == null || rw1Var2.getVisibility() != 0) && !this.w3 && this.K3 == null && this.I3 == null) {
            o1();
        }
    }

    public final ValueAnimator o(boolean z) {
        final float f;
        final float f2;
        final float f3;
        final float alpha = getSendButtonInternal().getAlpha();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        final float scaleX = getSendButtonInternal().getScaleX();
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.1f;
        }
        final float scaleY = getSendButtonInternal().getScaleY();
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.1f;
        }
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof bz1) && SystemClock.uptimeMillis() > this.H1) {
            bz1 bz1Var = (bz1) getSendButtonInternal();
            bz1Var.q0.e(true, 0.0f);
            bz1Var.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ChatActivityEnterView.X7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getSendButtonInternal().setAlpha(hl.R1(alpha, f, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(hl.R1(scaleX, f2, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(hl.R1(scaleY, f3, floatValue));
            }
        });
        return ofFloat;
    }

    public final void o0() {
        boolean z;
        if (this.k1 && !this.N2 && !this.u3) {
            bn3 bn3Var = this.j1;
            if (bn3Var == null || !bn3Var.q()) {
                if (this.A0 && !this.T7 && pie.a(getContext())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.l1) {
                    this.q1.run();
                }
            }
        }
    }

    public void o1() {
        if ((!K0() || !A()) && !org.telegram.ui.ActionBar.e.hasSheets(this.E3)) {
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                xy1Var.X0();
            }
            tx1 tx1Var = this.F0;
            if (tx1Var != null && !hl.E3(tx1Var)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void o2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Y4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(k43.h);
        ofFloat2.setDuration(250L);
        boolean z = xea.a;
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.Z1, "cancelToProgress", 1.0f));
        animatorSet.start();
        Q2();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ix1 ix1Var = this.r0;
        if (ix1Var != null) {
            ix1Var.e = false;
            ix1Var.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.u3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = hl.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            M0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        qx1 qx1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (this.y7 != -1 && (qx1Var = this.n0) != null) {
            x46 x46Var = (x46) qx1Var.c.getLayoutManager();
            if (x46Var != null) {
                x46Var.g1(this.y7, this.z7);
            }
            this.y7 = -1;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        rw1 rw1Var = this.o2;
        int measuredHeight = rw1Var.getMeasuredHeight();
        ep0 ep0Var = this.m0;
        ImageView imageView2 = this.S0;
        tw1 tw1Var = this.R0;
        if (ep0Var != null && ep0Var.getTag() != null) {
            this.m0.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw1Var.getLayoutParams();
            int L = hl.L(10.0f);
            ep0 ep0Var2 = this.m0;
            if (ep0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = ep0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = hl.L(10.0f);
                ep0 ep0Var3 = this.m0;
                if (ep0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = ep0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) tx1Var.getLayoutParams();
                int L3 = hl.L(57.0f);
                ep0 ep0Var4 = this.m0;
                if (ep0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = ep0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            zj9 zj9Var = this.r2;
            if (zj9Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) zj9Var.getLayoutParams();
                int L4 = hl.L(57.0f);
                ep0 ep0Var5 = this.m0;
                if (ep0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = ep0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            c8a c8aVar = this.q0;
            if (c8aVar != null && c8aVar.getVisibility() == 0) {
                int i3 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) tw1Var.getLayoutParams()).leftMargin = hl.L(7.0f) + i3;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = hl.L(7.0f) + i3;
                }
                tx1 tx1Var2 = this.F0;
                if (tx1Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) tx1Var2.getLayoutParams()).leftMargin = hl.L(54.0f) + i3;
                }
                zj9 zj9Var2 = this.r2;
                if (zj9Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) zj9Var2.getLayoutParams()).leftMargin = hl.L(54.0f) + i3;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) tw1Var.getLayoutParams()).leftMargin = hl.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = hl.L(3.0f);
                }
                tx1 tx1Var3 = this.F0;
                if (tx1Var3 != null) {
                    ((ViewGroup.MarginLayoutParams) tx1Var3.getLayoutParams()).leftMargin = hl.L(50.0f);
                }
                zj9 zj9Var3 = this.r2;
                if (zj9Var3 != null) {
                    ((ViewGroup.MarginLayoutParams) zj9Var3.getLayoutParams()).leftMargin = hl.L(50.0f);
                }
            }
        }
        u2();
        super.onMeasure(i, i2);
        dv1 dv1Var = this.l0;
        if (dv1Var != null) {
            ep0 ep0Var6 = this.m0;
            if (ep0Var6 != null) {
                dv1Var.setMeasuredButtonWidth(ep0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - hl.L(2.0f);
            measureChild(this.l0, i, i2);
        }
        R();
        S();
        if (measuredHeight > 0 && rw1Var.getMeasuredHeight() != measuredHeight) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (i4 == 0) {
                    imageView = this.i2;
                } else {
                    imageView = this.j2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + rw1Var.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(k43.h).setDuration(420L).start();
            }
            kg5 kg5Var = this.N;
            if (kg5Var != null) {
                kg5Var.setTranslationY((kg5Var.getTranslationY() + rw1Var.getMeasuredHeight()) - measuredHeight);
                ik8.t(this.N.animate().translationY(0.0f), k43.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.o4) {
            Z1(0, false);
            this.V0.r(false);
            a2(false, false, false, true);
        }
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            ArrayList arrayList = qgcVar.w;
            if (qgcVar.O.isEmpty()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            ngc ngcVar = qgcVar.x;
            if (ngcVar != null) {
                ngcVar.cancel(true);
                qgcVar.x = null;
            }
            qgcVar.invalidate();
        }
    }

    public final void p() {
        float min;
        float i;
        e29 e29Var;
        e29 e29Var2;
        e29 e29Var3 = this.h1;
        if (e29Var3 != null && e29Var3.getAnimatedDrawable() == this.D5) {
            float f = this.H5;
            if (f < 0.72f) {
                float f2 = this.G5;
                min = ((f / 0.72f) * 22.0f * f2) + (8.0f * f2);
            } else {
                min = (Math.min(1.0f, (f - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
            }
            this.h1.setProgress(min / 52.0f);
            if (this.h1 != null) {
                float f3 = this.H5;
                if (f3 < 0.72f) {
                    i = this.G5;
                } else {
                    i = 1.0f - Utilities.i((f3 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
                }
                float f4 = (3.0f - (i * 2.0f)) * i * i * 12.0f;
                float L = hl.L(12.0f);
                this.h1.setPivotX(e29Var.getWidth() / 2.0f);
                this.h1.setPivotY((e29Var2.getHeight() / 2.0f) + L);
                this.h1.setRotation(f4);
                if (this.i1 != null) {
                    double radians = Math.toRadians(f4);
                    float L2 = L + hl.L(3.0f);
                    x59 x59Var = this.i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    mva mvaVar = x59Var.H0;
                    mvaVar.S = sin;
                    mvaVar.T = cos;
                    x59Var.invalidate();
                }
            }
        }
    }

    public final void p0(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.V6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V6 = null;
        }
        this.T6 = z;
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null && this.u3 && z) {
            recordCircle.setAmplitude(0.0d);
        }
        float f = 0.0f;
        if (!z2) {
            if (z) {
                f = 1.0f;
            }
            this.U6 = f;
            l lVar = this.D2;
            if (lVar != null) {
                lVar.invalidate();
            }
            RecordCircle recordCircle2 = this.C2;
            if (recordCircle2 != null) {
                recordCircle2.invalidate();
                return;
            }
            return;
        }
        float f2 = this.U6;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.V6 = ofFloat;
        ofFloat.addUpdateListener(new qv1(this, (byte) 8));
        this.V6.setDuration(220L);
        this.V6.setInterpolator(k43.g);
        this.V6.start();
    }

    public final void p1() {
        int i;
        if (!K0() || !A()) {
            zu1 zu1Var = this.E3;
            if (!org.telegram.ui.ActionBar.e.hasSheets(zu1Var)) {
                if (!hl.D && !hl.E && ((zu1Var == null || !zu1Var.isInBubbleMode()) && !this.Y2)) {
                    i = 2;
                } else {
                    i = 0;
                }
                i2(i, 0, true, true);
                xy1 xy1Var = this.O3;
                if (xy1Var != null) {
                    xy1Var.X0();
                }
                tx1 tx1Var = this.F0;
                if (tx1Var != null) {
                    tx1Var.requestFocus();
                }
                hl.E3(this.F0);
                if (this.Y2) {
                    this.a3 = true;
                } else if (!hl.D && !this.o3 && !hl.E) {
                    if (zu1Var == null || !zu1Var.isInBubbleMode()) {
                        this.Z3 = true;
                        my1 my1Var = this.V0;
                        if (my1Var != null) {
                            my1Var.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        dx1 dx1Var = this.g4;
                        hl.r(dx1Var);
                        hl.d3(dx1Var, 100L);
                    }
                }
            }
        }
    }

    public final boolean p2() {
        TLRPC.EncryptedChat encryptedChat;
        zu1 zu1Var = this.E3;
        if (zu1Var != null) {
            encryptedChat = zu1Var.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && hl.W0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        bn3 bn3Var;
        tx1 tx1Var;
        if (!this.c7) {
            if (this.l1 && (bn3Var = this.j1) != null && bn3Var.r() && !this.u3) {
                if ((!this.j1.s() || this.j1.r == 2) && (tx1Var = this.F0) != null && tx1Var.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void q1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.q1():void");
    }

    public final void q2() {
        boolean z;
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            if (fc.b(this.R, l()) != null) {
                z = true;
            } else {
                z = false;
            }
            dc dcVar = this.y6;
            if (dcVar == null) {
                if (z) {
                    dcVar = new dc(bx1Var);
                    this.y6 = dcVar;
                    bx1Var.h0 = dcVar;
                    bx1Var.j0 = this;
                } else {
                    return;
                }
            }
            if (dcVar.b != z) {
                dcVar.b = z;
                dcVar.c();
            }
            if (z) {
                C0();
            }
        }
    }

    public final void r(boolean z) {
        boolean z2;
        int i;
        int i2;
        float f;
        float f2;
        int L;
        int i3;
        b29 b29Var;
        boolean z3 = true;
        if (!this.d1 && this.i1 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Z5 = z2;
        boolean z4 = this.J1;
        kc kcVar = this.W1;
        if (z4 == z2) {
            if (z2) {
                if (this.S1 != null) {
                    c2(false, false);
                    V1(z);
                    hl.r(kcVar);
                    hl.d3(kcVar, 700L);
                    return;
                }
            } else {
                return;
            }
        }
        this.J1 = z2;
        this.i1.setNewStyle(z2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = hl.L(32.0f);
        int i4 = 83;
        if (z2) {
            i = 83;
        } else {
            i = 19;
        }
        layoutParams.gravity = i;
        if (z2) {
            i2 = hl.L(6.0f);
        } else {
            i2 = 0;
        }
        layoutParams.bottomMargin = i2;
        float f3 = 45.0f;
        if (z2) {
            f = 45.0f;
        } else {
            f = 44.0f;
        }
        layoutParams.leftMargin = hl.L(f);
        float f4 = 5.0f;
        if (z2) {
            f2 = 5.0f;
        } else {
            f2 = 4.0f;
        }
        layoutParams.rightMargin = hl.L(f2);
        this.i1.setLayoutParams(layoutParams);
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qgcVar.getLayoutParams();
            if (!z2) {
                f3 = 56.0f;
            }
            layoutParams2.leftMargin = hl.L(f3);
            if (!z2) {
                f4 = 8.0f;
            }
            layoutParams2.rightMargin = hl.L(f4);
            this.g1.setLayoutParams(layoutParams2);
        }
        e29 e29Var = this.h1;
        if (e29Var != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) e29Var.getLayoutParams();
            if (!z2) {
                i4 = 51;
            }
            layoutParams3.gravity = i4;
            this.h1.setLayoutParams(layoutParams3);
            if (z2) {
                if (this.D5 == null) {
                    b29 b29Var2 = new b29(2131623977, hl.L(28.0f), hl.L(28.0f), false, null);
                    this.D5 = b29Var2;
                    b29Var2.E(true);
                }
                b29Var = this.D5;
            } else {
                b29Var = this.E5;
            }
            if (b29Var != null && this.h1.getAnimatedDrawable() != b29Var) {
                this.h1.setAnimation(b29Var);
                if (b29Var == this.D5) {
                    z3 = false;
                }
                b29Var.p0 = z3;
                E2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z2);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        if (z2) {
            L = -2;
        } else {
            L = hl.L(44.0f);
        }
        layoutParams4.height = L;
        this.f1.setLayoutParams(layoutParams4);
        rw1 rw1Var = this.f1;
        if (z2) {
            i3 = hl.L(44.0f);
        } else {
            i3 = 0;
        }
        rw1Var.setMinimumHeight(i3);
        if (z2) {
            this.i1.setNewStyleDelegate(new fx1(this));
            if (this.S1 == null) {
                boc bocVar = new boc(getContext(), this.K4, new gx1(this));
                this.S1 = bocVar;
                this.f1.addView(bocVar, tre.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            c2(false, false);
            V1(z);
            hl.r(kcVar);
            hl.d3(kcVar, 700L);
            return;
        }
        V1(false);
        this.i1.setNewStyleDelegate(null);
        boc bocVar2 = this.S1;
        if (bocVar2 != null) {
            this.f1.removeView(bocVar2);
            this.S1 = null;
        }
    }

    public final boolean r0() {
        bn3 bn3Var;
        if (this.l1 && (bn3Var = this.j1) != null && bn3Var.r()) {
            return true;
        }
        return false;
    }

    public final void r1(CharSequence charSequence, CharSequence charSequence2, String str) {
        zu1 zu1Var;
        if (this.F0 != null && (zu1Var = this.E3) != null) {
            uc7.s1(this.R);
            boolean z = f11.a;
            yg9 yg9Var = new yg9(str);
            yg9Var.h = charSequence;
            yg9Var.n = charSequence2;
            yg9Var.setResourceProvider(this.K4);
            yg9Var.K = zu1Var;
            yg9Var.s = zu1Var.U;
            yg9Var.w = zu1Var.a0;
            yg9Var.M = new mv1(this, (byte) 18);
            yg9Var.L = new mv1(this, (byte) 19);
            zu1Var.presentFragment(yg9Var);
        }
    }

    public final void r2() {
        float f;
        vw1 vw1Var = this.g2;
        if (vw1Var == null) {
            return;
        }
        float f2 = this.E + this.y + this.C7;
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            f = bx1Var.getAlpha() * (-c00.d(56.0f, bx1Var.l(), 0));
        } else {
            f = 0.0f;
        }
        vw1Var.setTranslationX(f2 + f);
    }

    public final void s(float f) {
        float f2;
        float i = Utilities.i((f - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        this.n = V2(0.12f, 0.6f, f) * f2;
        float i2 = Utilities.i(i, 1.0f, 0.0f) - 1.0f;
        this.h = hl.R1(0.55f, 1.0f, c00.x(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
        x2();
        this.R0.setRotation((1.0f - k43.h.getInterpolation(i)) * (-20.0f));
    }

    public final void s0() {
        float f;
        z92 G0;
        int[] iArr;
        int[] iArr2;
        if (this.D2 != null) {
            if (j0() && this.u3) {
                RectF rectF = this.G4;
                if (!rectF.isEmpty() && this.D2.getHeight() > 0 && (G0 = G0()) != null) {
                    this.D2.getLocationInWindow(this.R7);
                    G0.getLocationInWindow(this.S7);
                    f = Math.min(0.0f, (((G0.getInputBubbleTop() + iArr2[1]) - hl.L(8.0f)) - hl.L(18.0f)) - (rectF.centerY() + (((iArr[1] - this.D2.getTranslationY()) + this.b6) + this.c6)));
                    if (Math.abs(f - this.Q7) >= 0.5f && (f != 0.0f || this.Q7 == 0.0f)) {
                        return;
                    }
                    this.Q7 = f;
                    this.D2.setTranslationY(this.b6 + this.c6 + f);
                }
            }
            f = 0.0f;
            if (Math.abs(f - this.Q7) >= 0.5f) {
            }
            this.Q7 = f;
            this.D2.setTranslationY(this.b6 + this.c6 + f);
        }
    }

    public final void s1() {
        mv1 mv1Var = new mv1(this, (byte) 3);
        if (!vye.b(this.R, this.F3) && !uc7.s1(this.R).S3.contains(Long.valueOf(this.F3))) {
            jj.n(this.E3, uc7.s1(this.R).X1(Long.valueOf(this.F3)), new jj1(this, mv1Var, (byte) 24), new mv1(this, (byte) 4));
            return;
        }
        mv1Var.run();
    }

    public final void s2() {
        float f;
        int i;
        r2();
        oob oobVar = this.e2;
        if (oobVar != null) {
            oobVar.setTranslationX(this.E + this.y + this.C7);
            if (SystemClock.uptimeMillis() < this.B7) {
                f = 0.0f;
            } else {
                f = this.F * this.G;
            }
            oobVar.setAlpha(f);
            if (oobVar.getAlpha() > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            oobVar.setVisibility(i);
            vw1 vw1Var = this.g2;
            if (vw1Var != null && this.k6) {
                vw1Var.setAlpha(this.k2 * this.G);
            }
        }
        cx1 cx1Var = this.y2;
        if (cx1Var != null) {
            cx1Var.setTranslationX(cx1Var.a);
        }
    }

    public void setAdjustPanLayoutHelper(hb hbVar) {
        this.V = hbVar;
    }

    public void setAnimatedTop(int i) {
        this.I2 = i;
    }

    public void setBotInfo(zh6 zh6Var) {
        I1(zh6Var, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.R0.setTranslationX(f);
        if (this.F0 != null) {
            this.H = f;
            B2();
        }
        this.g2.setTranslationX(this.E + this.y + f);
        this.c1.setTranslationX(f);
        vw1 vw1Var = this.m2;
        if (vw1Var != null) {
            vw1Var.setTranslationX(f);
        }
    }

    public void setButtons(r47 r47Var) {
        K1(r47Var, true, true);
    }

    public void setCaption(String str) {
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setCaption(str);
            P(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z;
        this.S2 = chatFull;
        my1 my1Var = this.V0;
        if (my1Var != null) {
            my1Var.setChatInfo(chatFull);
        }
        cz1 cz1Var = this.G0;
        if (cz1Var != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z = true;
            } else {
                z = false;
            }
            cz1Var.b = z;
            cz1Var.invalidate();
        }
        if (xc2.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f) {
        this.m6 = f;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.t6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(xy1 xy1Var) {
        this.O3 = xy1Var;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.Q2 = tL_businessChatLink;
        y2(false);
        if (this.Q2 != null) {
            Y(true);
            this.u2.setOnClickListener(new pv1(this, (byte) 8));
            TextPaint textPaint = null;
            this.u2.setContentDescription(ob6.M0(2131751319, null));
            this.u2.setVisibility(0);
            this.u2.setScaleX(0.1f);
            this.u2.setScaleY(0.1f);
            this.u2.setAlpha(0.0f);
            this.u2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(k43.f).start();
            this.d0 = uc7.s1(this.S.a).t1();
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                textPaint = tx1Var.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(hl.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.Q2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(q(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.R2 = C();
            G1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            oob oobVar = this.e2;
            if (oobVar != null) {
                oobVar.setVisibility(8);
            }
            vw1 vw1Var = this.g2;
            if (vw1Var != null) {
                this.k2 = 0.0f;
                vw1Var.setAlpha(0.0f);
                vw1Var.setScaleX(0.5f);
                vw1Var.setScaleY(0.5f);
            }
            this.p2.setVisibility(8);
            cx1 cx1Var = this.y2;
            if (cx1Var != null) {
                cx1Var.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.o7 = j;
        bx1 bx1Var = this.K0;
        if (bx1Var != null) {
            bx1Var.setEffect(j);
        }
    }

    public void setExitTransition(float f) {
        this.a5 = f;
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.D3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z && org.telegram.ui.ActionBar.e.hasSheets(this.E3)) {
                z = false;
            }
            if (z) {
                if (this.G2 == 0 && !this.F0.isFocused()) {
                    mv1 mv1Var = new mv1(this, (byte) 26);
                    this.H2 = mv1Var;
                    hl.d3(mv1Var, 600L);
                    return;
                }
                return;
            }
            tx1 tx1Var = this.F0;
            if (tx1Var != null && tx1Var.isFocused()) {
                if (!this.o3 || this.Y2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        Q1(charSequence, false);
    }

    public void setInAppInsetsController(r2d r2dVar) {
        this.I7 = r2dVar;
    }

    public void setLockAnimatedTranslation(float f) {
        this.Z4 = f;
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new iw1(this, (byte) 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        W1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.w = z;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.r2 == null) {
            return;
        }
        uc7.s1(this.R);
        boolean z = f11.a;
        this.t2 = richMessage;
        F2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z) {
        if (this.Y1 != z) {
            this.Y1 = z;
            ez1 ez1Var = this.Z0;
            if (ez1Var != null) {
                ez1Var.setExternalFrameClock(z);
            }
            zy1 zy1Var = this.a2;
            if (zy1Var != null) {
                zy1Var.f = z;
                System.currentTimeMillis();
                zy1Var.h = -1L;
                zy1Var.invalidate();
            }
            SlideTextView slideTextView = this.Z1;
            if (slideTextView != null) {
                slideTextView.H = z;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i) {
        tx1 tx1Var = this.F0;
        if (tx1Var == null) {
            return;
        }
        tx1Var.setSelection(i, tx1Var.length());
    }

    public void setSideButtonsForAttach(vz1 vz1Var) {
        oob oobVar;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        vz1 vz1Var2 = this.J7;
        if (vz1Var2 != vz1Var) {
            if (vz1Var2 != null) {
                vz1Var2.e(0, false, true);
            }
            this.J7 = vz1Var;
            vw1 vw1Var = this.g2;
            if (vw1Var != null && (oobVar = this.e2) != null && oobVar.getVisibility() != 0) {
                if (vz1Var != null && S0()) {
                    z = true;
                } else {
                    z = false;
                }
                if (vz1Var != null && !z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (vz1Var != null) {
                    if (z && !O2()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    vz1Var.e(0, z3, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.f2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = vw1Var.animate();
                float f3 = 1.0f;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.k2 = f;
                ViewPropertyAnimator alpha = animate.alpha(f);
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.5f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                if (!z2) {
                    f3 = 0.5f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f3).setInterpolator(k43.h).setDuration(320L);
                this.f2 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.setSlideToCancelProgress(float):void");
    }

    public void setSlowModeTimer(int i) {
        this.H0 = i;
        L2();
    }

    public void setSnapAnimationProgress(float f) {
        this.b5 = f;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z) {
        this.i0 = z;
        this.p2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.c2 = viewGroup;
    }

    @Override
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.s6 = z;
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            tx1Var.setEnabled(z);
        }
    }

    public void setVoiceDraft(gs6 gs6Var) {
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (gs6Var != null) {
            boolean z = gs6Var.g;
            this.P = z;
            l lVar = this.D2;
            if (lVar != null) {
                lVar.E.f(1, z, true);
            }
            xy1 xy1Var = this.O3;
            if (xy1Var != null) {
                storyItem = xy1Var.F0();
            } else {
                storyItem = null;
            }
            MediaController z2 = MediaController.z();
            int i = this.R;
            long j = this.F3;
            r47 r47Var = this.I3;
            r47 threadMessage = getThreadMessage();
            c5a c5aVar = null;
            int i2 = this.v3;
            zu1 zu1Var = this.E3;
            if (zu1Var != null) {
                c5aVar = zu1Var.X6();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            b77 sendMessageSuggestionParams = getSendMessageSuggestionParams();
            to3 to3Var = z2.N1;
            if (z2.I1) {
                v20 v20Var = z2.G1;
                if (v20Var != null && v20Var.b() && z2.g1 != null && (file = z2.k1) != null && (str = gs6Var.a) != null && str.equals(file.getAbsolutePath())) {
                    z2.h1 = i2;
                    z2.r1 = r47Var;
                    z2.s1 = threadMessage;
                    z2.t1 = storyItem;
                    z2.u1 = c5aVar;
                    z2.p1 = sendMonoForumPeerId;
                    z2.q1 = sendMessageSuggestionParams;
                    jn7.f(z2.i1).k(jn7.o2, new Object[0]);
                    jn7.f(z2.i1).k(jn7.s2, Integer.valueOf(z2.h1), z2.g1, z2.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(gs6Var.h), Float.valueOf(gs6Var.i));
                    return;
                } else if (!z2.a0()) {
                    return;
                }
            }
            z2.y0 = false;
            z2.b0(true);
            to3Var.a(z2.M1);
            to3Var.c(new en6(z2, i2, gs6Var, i, j, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, r47Var, storyItem));
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        rw1 rw1Var;
        float f3 = 0.0f;
        if (i == 0) {
            boc bocVar = this.S1;
            if (bocVar != null) {
                bocVar.setVisibleHeight(f);
            }
            if (this.D2 != null) {
                if (this.J1 && this.Z5 && (rw1Var = this.f1) != null && rw1Var.getVisibility() == 0) {
                    f3 = -Math.max(0.0f, f - hl.L(44.0f));
                }
                this.b6 = f3;
                this.D2.setTranslationY(f3 + this.c6 + this.Q7);
            }
            R();
            S();
        } else if (i == 1) {
            R();
            S();
        } else {
            int i2 = 0;
            if (i == 2) {
                n4a n4aVar = this.J0;
                n4aVar.setAlpha(f);
                n4aVar.setScaleX(hl.R1(0.5f, 1.0f, f));
                n4aVar.setScaleY(hl.R1(0.5f, 1.0f, f));
                if (f <= 0.0f) {
                    i2 = 4;
                }
                n4aVar.setVisibility(i2);
            } else if (i == 3) {
                float R1 = hl.R1(1.0f, 0.79f, f);
                rw1 rw1Var2 = this.p2;
                rw1Var2.setScaleX(R1);
                rw1Var2.setScaleY(hl.R1(1.0f, 0.79f, f));
                float R12 = hl.R1(0.79f, 1.0f, f);
                ImageView imageView = this.q2;
                imageView.setScaleX(R12);
                imageView.setScaleY(hl.R1(0.79f, 1.0f, f));
                if (f <= 0.0f) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                imageView.setAlpha(f);
                bx1 bx1Var = this.K0;
                if (bx1Var != null) {
                    bx1Var.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
    }

    public final boolean t0() {
        if (DictationAsr.G() && this.E3 != null && this.F0 != null) {
            if ((!this.T2 || !this.d1) && this.z0 && !this.l1) {
                if (!o2f.a() || !uc7.e1().getBoolean("design_voice_live_field", true)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean t1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void t2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.t2(boolean):void");
    }

    public final void u(p7a p7aVar) {
        xy1 xy1Var = this.O3;
        if (xy1Var != null) {
            p7aVar.H = xy1Var.F0();
            p7aVar.J = this.O3.R();
        }
    }

    public final boolean u0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, r47 r47Var, r47 r47Var2, cq1 cq1Var) {
        zu1 zu1Var;
        int i;
        TLRPC.User X1;
        int i2 = 0;
        if (keyboardButtonProto != null && r47Var2 != null && ((zu1Var = this.E3) == null || zu1Var.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) ehb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            c5a c5aVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                hl.g(tL_inlineButtonTypeCopy.copy_text);
                d31.b0(zu1Var).i(ob6.a0(null, null, 2131750849, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    p7a b = p7a.b(tL_keyboardButton.text, this.F3, r47Var, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (zu1Var != null) {
                        c5aVar = zu1Var.X6();
                    }
                    b.K = c5aVar;
                    b.O = this.o7;
                    this.o7 = 0L;
                    this.K0.setEffect(0L);
                    r7a.B(this.R).q0(b);
                    return true;
                }
            }
            Activity activity = this.D3;
            if (tL_inlineButtonTypeUrl != null) {
                if (m01.A(tL_inlineButtonTypeUrl.url)) {
                    m01.s(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, cq1Var);
                    return true;
                }
                jj.o0(this.E3, tL_inlineButtonTypeUrl.url, false, true, true, false, cq1Var, null, this.K4);
                return true;
            } else if (ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                zu1Var.Sb(2, r47Var2);
                return true;
            } else if (ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) ehb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                zu1Var.na();
                f41 f41Var = zu1Var.Y1;
                if (f41Var != null) {
                    f41Var.P2 = false;
                    f41Var.u3.setVisibility(8);
                    f41Var.D1(false, bool);
                    return false;
                }
            } else if (ehb.b(keyboardButtonProto)) {
                TLRPC.Message message = r47Var2.k;
                long j = message.via_bot_id;
                if (j == 0) {
                    j = message.from_id.user_id;
                }
                long j2 = j;
                ky1 ky1Var = new ky1(this, r47Var2, j2, keyboardButtonProto, r47Var, uc7.s1(this.R).X1(Long.valueOf(j)));
                if (!vye.b(this.R, j2) && !uc7.s1(this.R).S3.contains(Long.valueOf(j2))) {
                    jj.n(zu1Var, uc7.s1(this.R).X1(Long.valueOf(this.F3)), new ue2(this, ky1Var, j2, (byte) 16), null);
                    return true;
                }
                ky1Var.run();
                return true;
            } else if (ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = ob6.M0(2131745151, "ShareYouLocationTitle");
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131745153, "ShareYouLocationInfo");
                alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new ie(this, r47Var2, keyboardButtonProto, (byte) 17));
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                zu1Var.showDialog(idVar);
                return true;
            } else if (!ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!zu1Var.Va(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = r47Var2.k;
                            long j3 = message2.from_id.user_id;
                            long j4 = message2.via_bot_id;
                            if (j4 != 0) {
                                j3 = j4;
                            }
                            TLRPC.User X12 = uc7.s1(this.S.a).X1(Long.valueOf(j3));
                            if (X12 != null) {
                                setFieldText("@" + lbc.p(X12) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle j5 = qd4.j(1, "onlySelect", "dialogsType", true);
                            if ((tL_inlineButtonTypeSwitchInline.flags & 2) != 0) {
                                j5.putBoolean("allowGroups", false);
                                j5.putBoolean("allowMegagroups", false);
                                j5.putBoolean("allowLegacyGroups", false);
                                j5.putBoolean("allowUsers", false);
                                j5.putBoolean("allowChannels", false);
                                j5.putBoolean("allowBots", false);
                                ArrayList<TLRPC.InlineQueryPeerType> arrayList = tL_inlineButtonTypeSwitchInline.peer_types;
                                int size = arrayList.size();
                                while (i2 < size) {
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType = arrayList.get(i2);
                                    i2++;
                                    TLRPC.InlineQueryPeerType inlineQueryPeerType2 = inlineQueryPeerType;
                                    if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypePM) {
                                        j5.putBoolean("allowUsers", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBotPM) {
                                        j5.putBoolean("allowBots", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeBroadcast) {
                                        j5.putBoolean("allowChannels", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeChat) {
                                        j5.putBoolean("allowLegacyGroups", true);
                                    } else if (inlineQueryPeerType2 instanceof TLRPC.TL_inlineQueryPeerTypeMegagroup) {
                                        j5.putBoolean("allowMegagroups", true);
                                    }
                                }
                            }
                            uj3 uj3Var = new uj3(j5);
                            uj3Var.E2 = new ie(this, r47Var2, tL_inlineButtonTypeSwitchInline, (byte) 18);
                            zu1Var.presentFragment(uj3Var);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (uc7.s1(this.R).X1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        zu1Var.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && r47Var2.k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                X1 = getParentFragment().h();
                            } else {
                                X1 = uc7.s1(this.R).X1(Long.valueOf(this.F3));
                            }
                            TLRPC.User user = X1;
                            if (user != null) {
                                t03.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new ku0(this, r47Var2, tL_buttonTypeRequestPeer, user), this.K4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ov1 ov1Var = new ov1(this, r47Var2, tL_buttonTypeRequestPeer);
                            pi7 pi7Var = pi7.p2;
                            org.telegram.ui.ActionBar.e Q = LaunchActivity.Q();
                            if (Q == null || pi7.p2 != null) {
                                return false;
                            }
                            pi7 pi7Var2 = new pi7(Q, i, bool2, bool3, ov1Var);
                            pi7Var2.show();
                            pi7.p2 = pi7Var2;
                            return false;
                        } else {
                            Bundle j6 = qd4.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = r47Var2.k;
                            if (message3 != null) {
                                TLRPC.Peer peer = message3.from_id;
                                if (peer instanceof TLRPC.TL_peerUser) {
                                    j6.putLong("requestPeerBotId", peer.user_id);
                                }
                            }
                            try {
                                SerializedData serializedData = new SerializedData(tL_buttonTypeRequestPeer.peer_type.getObjectSize());
                                tL_buttonTypeRequestPeer.peer_type.serializeToStream(serializedData);
                                j6.putByteArray("requestPeerType", serializedData.toByteArray());
                                serializedData.cleanup();
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            uj3 uj3Var2 = new uj3(j6);
                            uj3Var2.E2 = new ov1(this, r47Var2, tL_buttonTypeRequestPeer);
                            zu1Var.presentFragment(uj3Var2);
                            return false;
                        }
                    } else {
                        cc4.d("button.peer_type is null");
                    }
                }
                return true;
            } else {
                r7a.B(this.R).m0(true, r47Var2, keyboardButtonProto, null, null, zu1Var);
                return true;
            }
        }
        return false;
    }

    public boolean u1() {
        return true;
    }

    public final void u2() {
        int d;
        x46 x46Var;
        int K0;
        View m;
        float f;
        qx1 qx1Var = this.n0;
        if (qx1Var != null) {
            int childCount = qx1Var.c.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n0.c.getChildAt(i2);
                if (i2 < 4) {
                    i += childAt.getMeasuredHeight();
                }
            }
            wma wmaVar = this.b2;
            if (i > 0) {
                int measuredHeight = (wmaVar.getMeasuredHeight() - i) - hl.L(8.0f);
                if (childCount > 4) {
                    f = 12.0f;
                } else {
                    f = 0.0f;
                }
                d = c00.d(f, measuredHeight, 0);
            } else if (this.o0.c.size() > 4) {
                d = c00.d(162.8f, wmaVar.getMeasuredHeight(), 0);
            } else {
                d = c00.d((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, wmaVar.getMeasuredHeight(), 0);
            }
            if (this.n0.c.getPaddingTop() != d) {
                this.n0.c.setTopGlowOffset(d);
                if (this.y7 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (K0 = (x46Var = (x46) this.n0.c.getLayoutManager()).K0()) >= 0 && (m = x46Var.m(K0)) != null) {
                    this.y7 = K0;
                    this.z7 = m.getTop() - this.n0.c.getPaddingTop();
                }
                this.n0.c.setPadding(0, d, 0, hl.L(8.0f));
            }
        }
    }

    @Override
    public final void updateColors() {
        int i;
        TextPaint textPaint;
        int i2;
        vnb vnbVar = this.K4;
        try {
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                yob.l(tx1Var, 34, aob.Me, vnbVar);
                yob.v(this.F0, aob.Ne, vnbVar);
                yob.y(this.F0, aob.mg, vnbVar);
            }
            Paint paint = this.F2;
            if (paint != null) {
                paint.setColor(J0(aob.Sf));
            }
            cz1 cz1Var = this.G0;
            if (cz1Var != null) {
                ((ema) cz1Var.c).setTextColor(J0(aob.Nl));
                cz1Var.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.u4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(J0(aob.Nl));
                animatedArrowDrawable.invalidateSelf();
            }
            bx1 bx1Var = this.K0;
            if (bx1Var != null && this.L0 != 0 && bx1Var.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !Z0()) {
                    i2 = aob.Nl;
                } else {
                    i2 = aob.Pe;
                }
                int J0 = J0(i2);
                if (J0 != this.L0) {
                    this.L0 = J0;
                    aob.F1(bx1Var.getBackground(), Color.argb(24, Color.red(J0), Color.green(J0), Color.blue(J0)), true);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        K();
        bn3 bn3Var = this.j1;
        if (bn3Var != null) {
            bn3Var.P();
        }
        E2();
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.i();
        }
        zy1 zy1Var = this.a2;
        if (zy1Var != null) {
            zy1Var.f();
        }
        SlideTextView slideTextView = this.Z1;
        if (slideTextView != null) {
            slideTextView.b();
        }
        ez1 ez1Var = this.Z0;
        if (ez1Var != null && (textPaint = ez1Var.G) != null) {
            textPaint.setColor(ez1Var.J.J0(aob.G6));
        }
        qgc qgcVar = this.g1;
        if (qgcVar != null) {
            qgcVar.e.setColor(aob.w0(null, aob.a7, false));
            qgcVar.M = 0;
            ogc ogcVar = qgcVar.Q;
            if (ogcVar != null) {
                ogcVar.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(J0(aob.p7));
            } else {
                numberTextView.setTextColor(J0(aob.y6));
            }
        }
        J0(aob.Tf);
        qx1 qx1Var = this.n0;
        if (qx1Var != null) {
            qx1Var.d.setColor(aob.w0(null, aob.zj, false));
            jl0 jl0Var = qx1Var.r;
            if (jl0Var != null) {
                jl0Var.updateColors();
            }
            qx1Var.invalidate();
        }
        jy1 jy1Var = this.w2;
        if (jy1Var != null) {
            jy1Var.d();
        }
        if (this.b1) {
            i = J0(aob.Nl);
        } else {
            i = -1;
        }
        zw1 zw1Var = this.c1;
        if (zw1Var != null && (!this.u7 || i != this.s7)) {
            this.u7 = true;
            this.s7 = i;
            zw1Var.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        int J02 = J0(aob.i6);
        if (!this.v7 || J02 != this.t7) {
            this.v7 = true;
            this.t7 = J02;
            tw1 tw1Var = this.R0;
            if (tw1Var != null) {
                tw1Var.setBackground(aob.f0(J02, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = hl.L(1.0f);
                int L2 = hl.L(3.0f);
                imageView.setBackground(aob.W(hl.L(19.0f), J02, L, L2, L, L2));
            }
        }
    }

    public final void v(float f) {
        x59 x59Var;
        int i;
        this.U1 = f;
        x59 x59Var2 = this.i1;
        int i2 = 0;
        if (x59Var2 != null) {
            x59Var2.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f)));
            float R1 = hl.R1(1.0f, 0.94f, f);
            this.i1.setPivotX(hl.L(17.0f));
            this.i1.setPivotY(x59Var.getHeight() / 2.0f);
            this.i1.setScaleX(R1);
            this.i1.setScaleY(R1);
            this.i1.setTranslationX((-hl.L(20.0f)) * f);
            x59 x59Var3 = this.i1;
            if (f >= 1.0f) {
                i = 4;
            } else {
                i = 0;
            }
            x59Var3.setVisibility(i);
        }
        boc bocVar = this.S1;
        if (bocVar != null) {
            bocVar.setModeProgress(f);
            boc bocVar2 = this.S1;
            if (f <= 0.0f) {
                i2 = 8;
            }
            bocVar2.setVisibility(i2);
        }
    }

    public final boolean v1() {
        if (this.k7 == 0) {
            return false;
        }
        if (SystemClock.uptimeMillis() < this.k7) {
            return true;
        }
        this.k7 = 0L;
        return false;
    }

    public final void v2(boolean z) {
        if (this.U7 != 1 && this.F3 > 0) {
            W();
        }
        ep0 ep0Var = this.m0;
        if (ep0Var != null) {
            ep0Var.setWebView(K0());
        }
        t2(z);
    }

    public boolean w() {
        return false;
    }

    public final void w0() {
        CharSequence textToUse;
        v47 v47Var;
        b77 b;
        TLRPC.Chat chat;
        int i;
        b77 b2;
        r47 r47Var = this.O2;
        if (r47Var != null) {
            boolean o5 = r47Var.o5();
            zu1 zu1Var = this.E3;
            if (o5 && !xc2.z(this.R, 24, r47.B0(this.O2.k))) {
                if (zu1Var == null || (b2 = zu1Var.y5) == null) {
                    b2 = b77.b(this.O2.k.suggested_post);
                }
                if (!jxa.R(this.R, b2.a)) {
                    if (zu1Var != null) {
                        zu1Var.wc(b2);
                        return;
                    }
                    return;
                }
            }
            if (this.d0 - this.e0 < 0) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    hl.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!uc7.s1(this.R).M3() && uc7.s1(this.R).k4.p1.f() > this.e0) {
                    f2();
                    return;
                }
                return;
            }
            if (this.G2 != 0) {
                Z1(0, true);
                this.V0.r(false);
                if (this.o4) {
                    a2(false, true, false, true);
                    this.a4 = true;
                    hl.d3(new mv1(this, (byte) 0), 200L);
                }
            }
            tx1 tx1Var = this.F0;
            if (tx1Var == null) {
                textToUse = "";
            } else {
                textToUse = tx1Var.getTextToUse();
            }
            r47 r47Var2 = this.O2;
            if (r47Var2 == null || r47Var2.D != 19) {
                textToUse = hl.m1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.O2.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    hl.A3(-3.0f, this.F0, null);
                    yw0.APP_ERROR.a();
                    return;
                }
            }
            ArrayList Y = ls6.d0(this.R).Y(charSequenceArr, p2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.O2.v) || ((Y != null && !Y.isEmpty()) || !this.O2.k.entities.isEmpty() || (this.O2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                r47 r47Var3 = this.O2;
                r47Var3.y1 = charSequenceArr[0];
                r47Var3.z1 = Y;
                r47Var3.A1 = this.N3;
                if (zu1Var != null && (chat = zu1Var.e) != null && (((i = r47Var3.D) == 0 || i == 19) && !xc2.m(chat))) {
                    r47 r47Var4 = this.O2;
                    r47Var4.A1 = false;
                    TLRPC.Message message = r47Var4.k;
                    message.flags &= -513;
                    message.media = null;
                } else if (zu1Var != null && (v47Var = zu1Var.x5) != null) {
                    if (zu1Var.Y5 instanceof TLRPC.TL_webPagePending) {
                        r47 r47Var5 = this.O2;
                        r47Var5.A1 = false;
                        int i2 = r47Var5.D;
                        if (i2 == 0 || i2 == 19) {
                            r47Var5.k.media = new TLRPC.TL_messageMediaEmpty();
                            this.O2.k.flags |= 512;
                        }
                    } else {
                        TLRPC.WebPage webPage = v47Var.v;
                        r47 r47Var6 = this.O2;
                        if (webPage != null) {
                            r47Var6.A1 = false;
                            TLRPC.Message message2 = r47Var6.k;
                            message2.flags |= 512;
                            message2.media = new TLRPC.TL_messageMediaWebPage();
                            this.O2.k.media.webpage = zu1Var.x5.v;
                        } else {
                            r47Var6.A1 = false;
                            int i3 = r47Var6.D;
                            if (i3 == 0 || i3 == 19) {
                                TLRPC.Message message3 = r47Var6.k;
                                message3.flags |= 512;
                                message3.media = new TLRPC.TL_messageMediaEmpty();
                            }
                        }
                    }
                    TLRPC.Message message4 = this.O2.k;
                    v47 v47Var2 = zu1Var.x5;
                    message4.invert_media = v47Var2.r;
                    if (v47Var2.o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = v47Var2.q;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = !z;
                        }
                    }
                } else {
                    r47 r47Var7 = this.O2;
                    r47Var7.A1 = false;
                    int i4 = r47Var7.D;
                    if (i4 == 0 || i4 == 19) {
                        TLRPC.Message message5 = r47Var7.k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.O2.o5()) {
                    p7a a = p7a.a(r47.B0(this.O2.k), this.O2.y1.toString());
                    if (zu1Var == null || (b = zu1Var.y5) == null) {
                        b = b77.b(this.O2.k.suggested_post);
                    }
                    a.T = b;
                    a.R = wf3.n(this.O2.k.saved_peer_id);
                    a.G = this.O2.t2();
                    r47 r47Var8 = this.O2;
                    a.r = r47Var8;
                    a.D = r47Var8;
                    boolean z2 = r47Var8.F0() instanceof TLRPC.TL_document;
                    r47 r47Var9 = this.O2;
                    if (z2) {
                        a.g = (TLRPC.TL_document) r47Var9.F0();
                        a.b = a.a;
                        a.a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = r47Var9.k.media;
                        if (messageMedia3 != null && !(messageMedia3 instanceof TLRPC.TL_messageMediaEmpty)) {
                            TLRPC.Photo photo = messageMedia3.photo;
                            if (photo instanceof TLRPC.TL_photo) {
                                a.d = (TLRPC.TL_photo) photo;
                            } else {
                                a.c = messageMedia3;
                            }
                            a.b = a.a;
                            a.a = null;
                        }
                    }
                    r7a.B(this.R).q0(a);
                } else {
                    r7a B = r7a.B(this.R);
                    r47 r47Var10 = this.O2;
                    B.s(r47Var10, null, null, null, null, null, null, null, false, r47Var10.t2(), null);
                }
            }
            N1(null, null, false);
        }
    }

    public final void w1(kg5 kg5Var) {
        Editable editable;
        int[] iArr;
        float f;
        bx1 bx1Var = this.K0;
        if (bx1Var != null && getWidth() != 0) {
            tx1 tx1Var = this.F0;
            if (tx1Var != null) {
                editable = tx1Var.getText();
            } else {
                editable = null;
            }
            if (editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                getLocationInWindow(this.I6);
                boolean z = bx1Var.getParent() instanceof View;
                int[] iArr2 = this.J6;
                if (z) {
                    ((View) bx1Var.getParent()).getLocationInWindow(iArr2);
                    iArr2[0] = bx1Var.getLeft() + iArr2[0];
                    iArr2[1] = bx1Var.getTop() + iArr2[1];
                } else {
                    bx1Var.getLocationInWindow(iArr2);
                }
                float width = bx1Var.getWidth() / 2.0f;
                RectF rectF = this.K6;
                bx1Var.e(rectF);
                if (rectF.width() > 0.0f) {
                    float f2 = rectF.top;
                    float centerX = rectF.centerX();
                    f = f2;
                    width = centerX;
                } else {
                    f = 0.0f;
                }
                RectF rectF2 = bx1Var.y0;
                if (rectF2 != null && rectF2.width() > 0.0f && Math.abs(rectF2.width() - rectF2.height()) < 1.0f) {
                    width = rectF2.centerX();
                }
                float f3 = (iArr2[0] - iArr[0]) + width;
                float L = ((iArr2[1] - iArr[1]) + f) - hl.L(5.0f);
                int max = Math.max(0, Math.min(hl.L(8.0f), (int) Math.floor((getWidth() - f3) - hl.L(28.0f))));
                if (kg5Var.getPaddingRight() != max) {
                    kg5Var.setPadding(hl.L(8.0f), 0, max, 0);
                }
                kg5Var.o(1.0f, -((getWidth() - max) - f3));
                float L2 = L - hl.L(200.0f);
                if (Math.abs(kg5Var.getTranslationY() - L2) > 0.5f) {
                    kg5Var.setTranslationY(L2);
                }
            } else if (kg5Var.W) {
                kg5Var.f(true);
            }
        }
    }

    public final void w2() {
        boolean z;
        tx1 tx1Var = this.F0;
        boolean z2 = false;
        if (tx1Var != null && tx1Var.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z = true;
        } else {
            z = false;
        }
        d2(z);
        tx1 tx1Var2 = this.F0;
        if (tx1Var2 != null && tx1Var2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z2 = true;
        }
        k2(z2);
    }

    public final void x() {
        if (this.V0.getParent() == null) {
            r2d r2dVar = this.I7;
            ViewGroup viewGroup = this.c2;
            my1 my1Var = this.V0;
            if (r2dVar == null) {
                viewGroup.addView(my1Var);
            } else {
                viewGroup.addView(my1Var, tre.c(-1.0f, -1));
            }
        }
    }

    public final void x0(Canvas canvas, boolean z) {
        Paint paint;
        if (!this.i6) {
            return;
        }
        int A = (int) qd4.A(1.0f, this.m6, aob.i3.getIntrinsicHeight(), this.I2);
        View view = this.v2;
        if (view != null && view.getVisibility() == 0) {
            A = (int) (((1.0f - getTopViewEnterProgress()) * this.v2.getLayoutParams().height) + A);
        }
        int intrinsicHeight = aob.i3.getIntrinsicHeight() + A;
        if (z) {
            aob.i3.setAlpha((int) (this.m6 * 255.0f));
            aob.i3.setBounds(0, A, getMeasuredWidth(), intrinsicHeight);
            aob.i3.draw(canvas);
        }
        if (this.h6) {
            int J0 = J0(aob.Je);
            Paint paint2 = this.l6;
            paint2.setColor(J0);
            if (xea.f() && this.b2 != null) {
                this.n6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.b2.H(canvas, getTop(), this.n6, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        vnb vnbVar = this.K4;
        if (vnbVar != null) {
            paint = vnbVar.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = aob.T0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f, width, height, paint);
    }

    public final void x1() {
        boolean z;
        oob oobVar = this.e2;
        if (oobVar != null) {
            if (this.F >= 0.05f && oobVar.getVisibility() == 0 && oobVar.getAlpha() >= 0.05f) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.F >= 0.05f) {
                this.F = 0.0f;
                s2();
            }
            if (z && this.y > hl.L(8.0f)) {
                this.y = hl.L(8.0f);
                s2();
            }
            if (z) {
                oobVar.setPivotX(oobVar.getWidth());
                oobVar.setPivotY(oobVar.getHeight() / 2.0f);
                oobVar.setScaleX(0.88f);
                oobVar.setScaleY(0.88f);
            }
        }
    }

    public final void x2() {
        float f;
        float f2 = (1.0f - this.A1) * this.y1;
        if (f2 > 0.0f) {
            f = hl.R1(1.0f, 0.6f, f2);
        } else {
            f = 1.0f;
        }
        tw1 tw1Var = this.R0;
        tw1Var.setScaleX(this.r * this.h * f);
        tw1Var.setScaleY(this.r * this.h * f);
        tw1Var.setAlpha((1.0f - f2) * this.s * this.n);
    }

    public final boolean y(boolean z) {
        if (SystemClock.uptimeMillis() >= this.B7 && !z && this.Q3 == null && !X0() && !O2()) {
            return false;
        }
        return true;
    }

    public final boolean y0(Canvas canvas, hcc hccVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float d = this.G7.d(this.F0.canScrollVertically(-1));
        float d2 = this.H7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) hccVar.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + hl.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + hl.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) hccVar.run()).booleanValue();
        canvas.save();
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.E7;
        Paint paint = this.D7;
        Matrix matrix = this.F7;
        if (i > 0) {
            RectF rectF = hl.P;
            f3 = 255.0f;
            f4 = 16.0f;
            f = 0.0f;
            f2 = 5.0f;
            rectF.set(this.F0.getX() - hl.L(5.0f), (this.F0.getY() + this.I2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + hl.L(5.0f), this.F0.getY() + this.I2 + hl.L(13.0f));
            matrix.reset();
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRect(rectF, paint);
        } else {
            f = 0.0f;
            f2 = 5.0f;
            f3 = 255.0f;
            f4 = 16.0f;
        }
        if (d2 > f) {
            RectF rectF2 = hl.P;
            rectF2.set(this.F0.getX() - hl.L(f2), (this.F0.getY() + this.F0.getMeasuredHeight()) - hl.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + hl.L(f2), this.F0.getY() + this.F0.getMeasuredHeight() + hl.L(2.0f) + 1.0f);
            matrix.reset();
            matrix.postScale(1.0f, rectF2.height() / f4);
            matrix.postRotate(180.0f);
            matrix.postTranslate(rectF2.left, rectF2.bottom);
            linearGradient.setLocalMatrix(matrix);
            paint.setAlpha((int) (d2 * f3));
            canvas.drawRect(rectF2, paint);
        }
        canvas.restore();
        canvas.restore();
        return booleanValue;
    }

    public final void y1(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                pv3.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i + charSequence.length());
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void y2(boolean z) {
        boolean z2;
        long j;
        int i;
        boolean z3;
        boolean z4;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        r47 r47Var;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a0;
        tx1 tx1Var = this.F0;
        if (tx1Var != null) {
            CharSequence charSequence = this.e;
            boolean z5 = true;
            boolean z6 = false;
            if (charSequence != null) {
                tx1Var.r(charSequence, z);
                tx1 tx1Var2 = this.F0;
                String str3 = this.f;
                pt3 pt3Var = tx1Var2.v0;
                if (pt3Var != null) {
                    if (!ob6.a0 && z) {
                        z6 = true;
                    }
                    pt3Var.t(str3, z6, true);
                }
            } else if (!this.A0 && !T0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d ".concat(ob6.M0(2131746948, "PlainTextRestrictedHint")));
                spannableStringBuilder.setSpan(new wm2(2131232248, 0), 1, 2, 0);
                this.F0.r(spannableStringBuilder, z);
                this.F0.setText((CharSequence) null);
                this.F0.setEnabled(false);
                this.F0.setInputType(1);
            } else {
                this.F0.setEnabled(true);
                int inputType = this.F0.getInputType();
                int i2 = this.a;
                if (inputType != i2) {
                    this.F0.setInputType(i2);
                }
                K2();
                zu1 zu1Var = this.E3;
                if (zu1Var != null && zu1Var.g4 == 8 && zu1Var.i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (zu1Var != null) {
                    j = zu1Var.getMessagesController().M1(zu1Var.a());
                } else {
                    j = 0;
                }
                if (j > 0) {
                    j *= getMessagesCount();
                }
                if (zu1Var != null) {
                    i = zu1Var.g4;
                } else {
                    i = -1;
                }
                if (i == 9) {
                    this.F0.setHintText(ob6.M0(2131742526, null));
                } else if (i == 5) {
                    if ("hello".equalsIgnoreCase(zu1Var.f4)) {
                        this.F0.setHintText(ob6.M0(2131752748, null));
                        return;
                    }
                    boolean equalsIgnoreCase = "away".equalsIgnoreCase(zu1Var.f4);
                    tx1 tx1Var3 = this.F0;
                    if (equalsIgnoreCase) {
                        tx1Var3.setHintText(ob6.M0(2131752817, null));
                    } else {
                        tx1Var3.setHintText(ob6.M0(2131752653, null));
                    }
                } else {
                    wm2[] wm2VarArr = this.j7;
                    if (z2) {
                        if (j > 0) {
                            a0 = nza.T0(ob6.a0(null, null, 2131744056, ob6.E((int) j, ','), wm2VarArr));
                        } else {
                            a0 = ob6.a0(null, null, 2131744057, new Object[0]);
                        }
                        this.F0.setHintText(a0);
                        wm2 wm2Var = wm2VarArr[0];
                        if (wm2Var != null) {
                            wm2Var.H = 0.9f;
                        }
                    } else if (this.Q2 != null) {
                        this.F0.setHintText(ob6.M0(2131752687, null));
                    } else {
                        r47 r47Var2 = this.I3;
                        if (r47Var2 != null && (replyMarkup2 = r47Var2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.I3.k.reply_markup.placeholder, z);
                        } else if (this.O2 != null) {
                            tx1 tx1Var4 = this.F0;
                            if (this.P2) {
                                M0 = ob6.M0(2131752542, null);
                            } else {
                                M0 = ob6.M0(2131743583, null);
                            }
                            tx1Var4.setHintText(M0);
                        } else if (j > 0) {
                            this.F0.setHintText(nza.Z0(false, ob6.a0(null, null, 2131743581, ob6.E((int) j, ',')), wm2VarArr));
                            wm2 wm2Var2 = wm2VarArr[0];
                            if (wm2Var2 != null) {
                                wm2Var2.H = 0.9f;
                            }
                        } else if (this.Y0 && (r47Var = this.b3) != null && (replyMarkup = r47Var.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.b3.k.reply_markup.placeholder, z);
                        } else if (zu1Var != null && zu1Var.V7()) {
                            r47 r47Var3 = this.J3;
                            if (r47Var3 != null && (tL_forumTopic = r47Var3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(ob6.a0(null, null, 2131743580, str2), z);
                                return;
                            }
                            TLRPC.TL_forumTopic f = uc7.s1(this.R).g4.f(zu1Var.e.id, 1L);
                            if (f != null && (str = f.title) != null) {
                                this.F0.r(ob6.a0(null, null, 2131743580, str), z);
                            } else {
                                this.F0.r(ob6.M0(2131743583, null), z);
                            }
                        } else {
                            if (wf3.y(this.F3)) {
                                TLRPC.Chat M02 = uc7.s1(this.S.a).M0(Long.valueOf(-this.F3));
                                TLRPC.ChatFull N0 = uc7.s1(this.S.a).N0(-this.F3);
                                z4 = xc2.V(M02);
                                if (!z4 && xc2.M(M02, N0, false) == (-this.F3)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                                z4 = false;
                            }
                            if (z3) {
                                this.F0.setHintText(ob6.M0(2131745366, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User X1 = uc7.s1(this.S.a).X1(Long.valueOf(this.F3));
                            if (X1 != null && X1.bot_forum_view && !X1.bot_forum_can_manage_topics && zu1Var != null && !zu1Var.x4) {
                                this.F0.setHintText(ob6.M0(2131745361, null));
                            } else if (zu1Var != null && zu1Var.k8() && !zu1Var.x4) {
                                if (zu1Var.m4 == null || !zu1Var.v4) {
                                    z5 = false;
                                }
                                tx1 tx1Var5 = this.F0;
                                if (z5) {
                                    tx1Var5.setHintText(ob6.M0(2131751970, null));
                                } else {
                                    tx1Var5.setHintText(ob6.M0(2131745990, "Reply"));
                                }
                            } else if (z4) {
                                boolean z7 = this.V2;
                                tx1 tx1Var6 = this.F0;
                                if (z7) {
                                    tx1Var6.r(ob6.M0(2131752257, "ChannelSilentBroadcast"), z);
                                } else {
                                    tx1Var6.r(ob6.M0(2131752421, "ChannelBroadcast"), z);
                                }
                            } else {
                                this.F0.setHintText(ob6.M0(2131743583, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final AnimatorSet z() {
        AnimatorSet animatorSet = new AnimatorSet();
        oob oobVar = this.e2;
        animatorSet.playTogether(ObjectAnimator.ofFloat(oobVar, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(oobVar, View.SCALE_Y, 1.0f));
        return animatorSet;
    }

    public final void z0(android.widget.FrameLayout r31, android.graphics.Canvas r32, float r33, float r34, float r35, float r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.z0(android.widget.FrameLayout, android.graphics.Canvas, float, float, float, float):void");
    }

    public final void z1() {
        a2(false, true, false, true);
        i2(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.u3 = false;
        zw1 zw1Var = this.c1;
        if (zw1Var != null) {
            zw1Var.setVisibility(0);
        }
        this.Z2 = true;
        Y0();
        F();
        Q0();
        l lVar = this.D2;
        if (lVar != null) {
            lVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.C2;
        if (recordCircle != null) {
            recordCircle.h();
        }
    }

    public final void z2(int i) {
        ImageView imageView;
        cx1 cx1Var;
        int L;
        cx1 cx1Var2;
        vw1 vw1Var;
        View view;
        int L2;
        a aVar;
        int[] iArr;
        int[] iArr2;
        this.l7 = i;
        if (this.F0 != null) {
            r47 r47Var = this.O2;
            if (r47Var == null || r47Var.o5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.k6;
                bx1 bx1Var = this.K0;
                float f = 50.0f;
                int i3 = 0;
                if (z && this.T7) {
                    if (!this.m5) {
                        f = 2.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, bx1Var.l() - hl.L(44.0f)) + hl.L(f);
                } else if ((i == 1 || i == 2) && !r0()) {
                    vw1 vw1Var2 = this.m2;
                    if (vw1Var2 != null && vw1Var2.getVisibility() == 0 && (cx1Var2 = this.y2) != null && cx1Var2.getVisibility() == 0 && (vw1Var = this.g2) != null && vw1Var.getVisibility() == 0) {
                        L = hl.L(146.0f);
                        layoutParams.rightMargin = L;
                    } else {
                        vw1 vw1Var3 = this.m2;
                        if ((vw1Var3 != null && vw1Var3.getVisibility() == 0) || (((imageView = this.x2) != null && imageView.getVisibility() == 0) || ((cx1Var = this.y2) != null && cx1Var.getTag() != null))) {
                            L = hl.L(98.0f);
                            layoutParams.rightMargin = L;
                        } else {
                            L = hl.L(50.0f);
                            layoutParams.rightMargin = L;
                        }
                    }
                    if (this.m5) {
                        layoutParams.rightMargin = hl.L(48.0f) + L;
                    }
                } else {
                    cx1 cx1Var3 = this.y2;
                    if (cx1Var3 != null && cx1Var3.getTag() != null) {
                        layoutParams.rightMargin = hl.L(50.0f);
                    } else {
                        layoutParams.rightMargin = hl.L(2.0f);
                    }
                }
                if (r0() || (j0() && this.u3)) {
                    tx1 tx1Var = this.F0;
                    if (tx1Var == null) {
                        view = null;
                    } else {
                        view = (View) tx1Var.getParent();
                    }
                    if (view != null && view.getWidth() != 0 && (aVar = this.a1) != null && aVar.getWidth() != 0) {
                        view.getLocationInWindow(new int[2]);
                        aVar.getLocationInWindow(new int[2]);
                        L2 = Math.max(hl.L(2.0f), Math.round((view.getWidth() + iArr[0]) - ((((aVar.getWidth() / 2.0f) + (iArr2[0] - aVar.getTranslationX())) - hl.N(41.0f)) - hl.L(8.0f))));
                    } else {
                        L2 = hl.L(28.0f);
                    }
                    layoutParams.rightMargin = L2;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, bx1Var.l() - hl.L(44.0f)));
                bx1 bx1Var2 = this.u2;
                if (bx1Var2 != null && bx1Var2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.u2.l() - hl.L(44.0f)));
                }
                if (i2 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                rw1 rw1Var = this.f1;
                if (rw1Var != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) rw1Var.getLayoutParams();
                    if (this.O2 == null) {
                        i3 = c00.d(44.0f, bx1Var.l(), 0);
                    }
                    layoutParams2.rightMargin = i3;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override
    public xt3 getEditField() {
        return this.F0;
    }

    @Override
    public zu1 getParentFragment() {
        return this.E3;
    }

    public void Y0() {
    }

    public void F0(Menu menu) {
    }

    public void f1(float f) {
    }

    public void h1(int i, int i2) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
