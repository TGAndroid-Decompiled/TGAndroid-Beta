package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_aicompose;
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
public class ChatActivityEnterView extends FrameLayout implements jm7, dla, u2b, ddb, g94, vlb {
    public static final int z7 = 0;
    public boolean A0;
    public float A1;
    public tx1 A2;
    public boolean A3;
    public final po A4;
    public p09 A5;
    public float A6;
    public boolean B0;
    public int B1;
    public boolean B2;
    public int B3;
    public final Paint B4;
    public ValueAnimator B5;
    public ValueAnimator B6;
    public final HashMap C0;
    public final SparseArray C1;
    public AnimatorSet C2;
    public boolean C3;
    public Drawable C4;
    public float C5;
    public ValueAnimator C6;
    public boolean D0;
    public boolean D1;
    public RecordCircle D2;
    public final int[] D3;
    public Drawable D4;
    public float D5;
    public boolean D6;
    public float E;
    public boolean E0;
    public boolean E1;
    public l E2;
    public final Activity E3;
    public Drawable E4;
    public lta E5;
    public p09 E6;
    public float F;
    public sy1 F0;
    public boolean F1;
    public final ay1 F2;
    public final yv1 F3;
    public Drawable F4;
    public Bitmap F5;
    public final float[] F6;
    public float G;
    public final yz1 G0;
    public long G1;
    public final Paint G2;
    public long G3;
    public Drawable G4;
    public float G5;
    public final float[] G6;
    public float H;
    public int H0;
    public d53 H1;
    public byte H2;
    public boolean H3;
    public final RectF H4;
    public float H5;
    public final int[] H6;
    public float I;
    public mw1 I0;
    public long I1;
    public mw1 I2;
    public byte I3;
    public final Rect I4;
    public float I5;
    public boolean I6;
    public float J;
    public final w2a J0;
    public boolean J1;
    public int J2;
    public k47 J3;
    public final Rect J4;
    public float J5;
    public mw1 J6;
    public boolean K;
    public final by1 K0;
    public boolean K1;
    public n99 K2;
    public k47 K3;
    public Drawable K4;
    public float K5;
    public tc K6;
    public TLRPC.UserFull L;
    public int L0;
    public km0 L1;
    public Editable L2;
    public nv1 L3;
    public final ylb L4;
    public float L5;
    public boolean L6;
    public hg5 M;
    public j67 M0;
    public im0 M1;
    public boolean M2;
    public k47 M3;
    public final boolean M4;
    public float M5;
    public final mw1 M6;
    public hg5 N;
    public long N0;
    public im0 N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final dy1 N4;
    public float N5;
    public final ln N6;
    public hg5 O;
    public my1 O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final ox1 O4;
    public boolean O5;
    public final ln O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public k47 P2;
    public uz1 P3;
    public final ox1 P4;
    public final Paint P5;
    public final cc P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public mz1 Q3;
    public final ox1 Q4;
    public boolean Q5;
    public boolean Q6;
    public int R;
    public final rx1 R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final ox1 R4;
    public float R5;
    public boolean R6;
    public j5 S;
    public final ImageView S0;
    public final int[] S1;
    public pz1 S2;
    public String S3;
    public final ox1 S4;
    public float S5;
    public final pn2[] S6;
    public boolean T;
    public tx1 T0;
    public olc T1;
    public TLRPC.ChatFull T2;
    public k47 T3;
    public boolean T4;
    public float T5;
    public byte T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public rcc U3;
    public long U4;
    public float U5;
    public byte U6;
    public gb V;
    public jz1 V0;
    public float V1;
    public int V2;
    public boolean V3;
    public float V4;
    public boolean V5;
    public boolean V6;
    public gx1 W;
    public AnimatorSet W0;
    public ValueAnimator W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public boolean W5;
    public long W6;
    public boolean X0;
    public final jd X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public boolean X5;
    public int X6;
    public boolean Y0;
    public long Y1;
    public boolean Y2;
    public k47 Y3;
    public float Y4;
    public boolean Y5;
    public int Y6;
    public zz1 Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public boolean Z6;
    public int a;
    public lx1 a0;
    public final a a1;
    public SlideTextView a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public final Paint a6;
    public boolean a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public wz1 b2;
    public boolean b3;
    public boolean b4;
    public float b5;
    public float b6;
    public pz b7;
    public a8 c;
    public NumberTextView c0;
    public final zx1 c1;
    public final ela c2;
    public k47 c3;
    public boolean c4;
    public float c5;
    public final Rect c6;
    public bu5 c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup d3;
    public boolean d4;
    public float d5;
    public boolean d6;
    public int d7;
    public CharSequence e;
    public int e0;
    public a6 e1;
    public int e2;
    public int e3;
    public int e4;
    public float e5;
    public final mw1 e6;
    public int e7;
    public String f;
    public v43 f0;
    public px1 f1;
    public final qmb f2;
    public boolean f3;
    public boolean f4;
    public float f5;
    public a8 f6;
    public vh6 f7;
    public Runnable g0;
    public tec g1;
    public ViewPropertyAnimator g2;
    public PowerManager.WakeLock g3;
    public boolean g4;
    public boolean g5;
    public ArrayList g6;
    public final Paint g7;
    public float h;
    public boolean h0;
    public s09 h1;
    public final tx1 h2;
    public AnimatorSet h3;
    public final dy1 h4;
    public boolean h5;
    public boolean h6;
    public final LinearGradient h7;
    public boolean i0;
    public l49 i1;
    public final hd i2;
    public AnimatorSet i3;
    public final eg0 i4;
    public int i5;
    public View i6;
    public final Matrix i7;
    public String j0;
    public un3 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final ny1 j4;
    public long j5;
    public boolean j6;
    public final ln j7;
    public String k0;
    public boolean k1;
    public final ImageView k2;
    public AnimatorSet k3;
    public final b k4;
    public boolean k5;
    public boolean k6;
    public final ln k7;
    public cw1 l0;
    public boolean l1;
    public float l2;
    public byte l3;
    public final f l4;
    public ValueAnimator l5;
    public boolean l6;
    public c0d l7;
    public eq0 m0;
    public boolean m1;
    public ImageView m2;
    public boolean m3;
    public final Paint m4;
    public final TextPaint m5;
    public dd m6;
    public q02 m7;
    public float n;
    public py1 n0;
    public boolean n1;
    public tx1 n2;
    public int n3;
    public boolean n4;
    public final Paint n5;
    public lo3 n6;
    public final h94 n7;
    public dq0 o0;
    public boolean o1;
    public final px1 o2;
    public int o3;
    public boolean o4;
    public final Paint o5;
    public int o6;
    public final fn0 o7;
    public boolean p0;
    public Drawable p1;
    public final px1 p2;
    public boolean p3;
    public boolean p4;
    public final Path p5;
    public boolean p6;
    public final fn0 p7;
    public m6a q0;
    public final mw1 q1;
    public final px1 q2;
    public int q3;
    public boolean q4;
    public final Path q5;
    public boolean q6;
    public final fn0 q7;
    public float r;
    public hy1 r0;
    public glc r1;
    public final ImageView r2;
    public final boolean r3;
    public AnimatorSet r4;
    public final RectF r5;
    public dy1 r6;
    public float r7;
    public float s;
    public mw1 s0;
    public boolean s1;
    public mi9 s2;
    public long s3;
    public float s4;
    public final int[] s5;
    public long s6;
    public float s7;
    public int t0;
    public boolean t1;
    public boolean t2;
    public float t3;
    public int t4;
    public final int[] t5;
    public long t6;
    public float t7;
    public int u0;
    public float u1;
    public TL_iv.RichMessage u2;
    public float u3;
    public boolean u4;
    public im0 u5;
    public zn3 u6;
    public final int[] u7;
    public mw1 v0;
    public float v1;
    public by1 v2;
    public boolean v3;
    public AnimatedArrowDrawable v4;
    public im0 v5;
    public final RectF v6;
    public final int[] v7;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public View w2;
    public int w3;
    public boolean w4;
    public final nf5 w5;
    public boolean w6;
    public boolean w7;
    public Runnable x;
    public float x0;
    public boolean x1;
    public gz1 x2;
    public boolean x3;
    public boolean x4;
    public boolean x5;
    public long x6;
    public int x7;
    public float y;
    public boolean y0;
    public float y1;
    public final ImageView y2;
    public boolean y3;
    public boolean y4;
    public lx1 y5;
    public cw3 y6;
    public int y7;
    public boolean z0;
    public float z1;
    public cy1 z2;
    public boolean z3;
    public final i z4;
    public p09 z5;
    public boolean z6;

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
        public float f;
        public final fl0 h;
        public final fl0 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final m y;

        public RecordCircle(Context context) {
            super(context);
            fl0 fl0Var = new fl0(11, 360928);
            this.h = fl0Var;
            fl0 fl0Var2 = new fl0(12, 360928);
            this.n = fl0Var2;
            this.r = gm.N(41.0f);
            this.s = gm.L(30.0f);
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
            m mVar = new m(this, this);
            this.y = mVar;
            kfc.k(this, mVar);
            fl0Var.a = gm.L(47.0f);
            fl0Var.b = gm.L(55.0f);
            fl0Var.b();
            fl0Var2.a = gm.L(47.0f);
            fl0Var2.b = gm.L(55.0f);
            fl0Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            h();
        }

        public static float d(float f) {
            float i = Utilities.i(f, 1.0f, 0.0f);
            if (i < 0.5f) {
                return mlb.C(i, 4.0f, i, i);
            }
            return 1.0f - (((float) Math.pow((i * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float e(float f) {
            float i = 1.0f - Utilities.i(f, 1.0f, 0.0f);
            return aq1.v(i, i, i, 1.0f);
        }

        public static float i(float f, float f2) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            return (float) (Math.sin(f * 3.141592653589793d * 2.0d * f2) * Math.exp((-f) * 8.5d));
        }

        public final void a() {
            ChatActivityEnterView.this.g5 = true;
        }

        public final void b() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            ylb ylbVar = chatActivityEnterView.L4;
            if (chatActivityEnterView.E4 != null) {
                return;
            }
            Drawable mutate = getResources().getDrawable(2131231512).mutate();
            chatActivityEnterView.E4 = mutate;
            int i = cmb.Sf;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.x(this, mutate, i, ylbVar, mode);
            Drawable mutate2 = getResources().getDrawable(2131231520).mutate();
            chatActivityEnterView.F4 = mutate2;
            anb.x(this, mutate2, i, ylbVar, mode);
            Drawable mutate3 = getResources().getDrawable(2131232711).mutate();
            chatActivityEnterView.G4 = mutate3;
            anb.x(this, mutate3, i, ylbVar, mode);
            Drawable mutate4 = getResources().getDrawable(2131231511).mutate();
            chatActivityEnterView.C4 = mutate4;
            int i2 = cmb.Ml;
            anb.x(this, mutate4, i2, ylbVar, mode);
            Drawable mutate5 = getResources().getDrawable(2131231519).mutate();
            chatActivityEnterView.D4 = mutate5;
            anb.x(this, mutate5, i2, ylbVar, mode);
        }

        public final void c(Canvas canvas, Drawable drawable, Drawable drawable2, float f, int i) {
            float f2;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (drawable == chatActivityEnterView.G4) {
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
                boolean z = chatActivityEnterView.g5;
                a aVar = chatActivityEnterView.a1;
                if (z) {
                    float f5 = chatActivityEnterView.Y4;
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

        public final void f(boolean z) {
            this.P = false;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            if (!z) {
                chatActivityEnterView.h5 = false;
                chatActivityEnterView.a5 = -1.0f;
                chatActivityEnterView.Z4 = -1.0f;
                chatActivityEnterView.Y4 = 1.0f;
                chatActivityEnterView.f5 = 1.0f;
                chatActivityEnterView.c5 = 0.0f;
                chatActivityEnterView.X4 = 0.0f;
            }
            invalidate();
            chatActivityEnterView.e5 = 0.0f;
            chatActivityEnterView.V0();
            chatActivityEnterView.b5 = 0.0f;
            chatActivityEnterView.W4 = 0.0f;
            chatActivityEnterView.V4 = 0.0f;
            chatActivityEnterView.T4 = false;
            this.f = 0.0f;
            chatActivityEnterView.g5 = false;
            l lVar = chatActivityEnterView.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public final void g() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.h5 = false;
            invalidate();
            l lVar = chatActivityEnterView.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public float getControlsScale() {
            return ChatActivityEnterView.this.X4;
        }

        public float getScale() {
            return ChatActivityEnterView.this.W4;
        }

        public float getTransformToSeekbarProgressStep3() {
            return this.e;
        }

        public final void h() {
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            Paint paint = chatActivityEnterView.B4;
            int i = cmb.Tf;
            paint.setColor(chatActivityEnterView.F0(i));
            this.h.d.setColor(on2.p(chatActivityEnterView.F0(i), 38));
            this.n.d.setColor(on2.p(chatActivityEnterView.F0(i), 76));
            this.E = paint.getAlpha();
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            l lVar = ChatActivityEnterView.this.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        @Override
        public final void onDraw(android.graphics.Canvas r65) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.RecordCircle.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public final void onMeasure(int i, int i2) {
            View.MeasureSpec.getSize(i);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > gm.L(140.0f)) {
                measuredWidth = gm.L(140.0f);
            }
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            chatActivityEnterView.i5 = (int) ((1.0f - chatActivityEnterView.Y4) * (-measuredWidth));
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
            chatActivityEnterView.X4 = f;
            l lVar = chatActivityEnterView.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
        }

        public void setScale(float f) {
            ChatActivityEnterView.this.W4 = f;
            invalidate();
        }

        public void setTransformToSeekbar(float f) {
            ChatActivityEnterView.this.e5 = f;
            invalidate();
        }
    }

    public class SlideTextView extends View {
        public StaticLayout E;
        public StaticLayout F;
        public boolean G;
        public boolean H;
        public final Rect I;
        public fg0 J;
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
            if (gm.q.x <= gm.L(320.0f)) {
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
            textPaint.setTextSize(gm.L(f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            hg9.o(textPaint2, gm.L(15.0f));
            int i = cmb.Ml;
            int i2 = ChatActivityEnterView.z7;
            paint.setColor(ChatActivityEnterView.this.F0(i));
            paint.setStyle(Paint.Style.STROKE);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 1.6f;
            }
            paint.setStrokeWidth(gm.N(f2));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = jb6.M0(2131745047, null);
            this.d = M0;
            String M02 = jb6.M0(2131752542, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i = cmb.dg;
            int i2 = ChatActivityEnterView.z7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int F0 = chatActivityEnterView.F0(i);
            TextPaint textPaint = this.a;
            textPaint.setColor(F0);
            int i3 = cmb.cg;
            int F02 = chatActivityEnterView.F0(i3);
            TextPaint textPaint2 = this.b;
            textPaint2.setColor(F02);
            textPaint.getAlpha();
            this.s = textPaint2.getAlpha();
            fg0 h0 = cmb.h0(gm.L(60.0f), 0, on2.p(chatActivityEnterView.F0(i3), 26));
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
            fg0 fg0Var = this.J;
            if (fg0Var != null) {
                fg0Var.jumpToCurrentState();
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            StaticLayout staticLayout;
            int F0;
            float f;
            boolean z;
            float f2;
            float f3;
            float f4;
            float L;
            float f5;
            float f6;
            float L2;
            float leftProperty;
            float f7;
            l lVar;
            if (this.E != null && (staticLayout = this.F) != null) {
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                if (chatActivityEnterView.D2 != null) {
                    int L3 = gm.L(16.0f) + staticLayout.getWidth();
                    if (gm.B(chatActivityEnterView.F0(cmb.c6)) < 0.5f && (lVar = chatActivityEnterView.E2) != null) {
                        F0 = lVar.s.getColor();
                    } else {
                        F0 = chatActivityEnterView.F0(cmb.dg);
                    }
                    TextPaint textPaint = this.a;
                    textPaint.setColor(F0);
                    textPaint.setAlpha((int) ((1.0f - this.n) * Color.alpha(F0) * this.r));
                    this.b.setAlpha((int) (this.s * this.n));
                    int color = textPaint.getColor();
                    Paint paint = this.c;
                    paint.setColor(color);
                    boolean z2 = this.L;
                    if (z2) {
                        this.w = gm.L(16.0f);
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
                            this.w = (-gm.L(6.0f)) * f;
                        }
                    }
                    int i = this.x;
                    if (i >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int L4 = gm.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
                    int measuredWidth = (int) ((getMeasuredWidth() - this.h) / 2.0f);
                    if (z) {
                        f3 = this.E.getPrimaryHorizontal(i);
                        f2 = 4.0f;
                        f4 = (L4 + f3) - measuredWidth;
                    } else {
                        f2 = 4.0f;
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    float f8 = L4;
                    float f9 = this.w;
                    float f10 = this.n;
                    float L5 = (((((1.0f - f10) * f9) * this.r) + f8) - (f4 * f10)) + gm.L(16.0f);
                    if (z) {
                        L = 0.0f;
                    } else {
                        L = this.n * gm.L(12.0f);
                    }
                    if (this.n != 1.0f) {
                        f5 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        zz1 zz1Var = chatActivityEnterView.Z0;
                        if (zz1Var == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = zz1Var.getLeftProperty();
                        }
                        f6 = 2.0f;
                        canvas.clipRect(leftProperty + gm.L(f2), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i2 = (int) L5;
                        if (z2) {
                            f7 = 7.0f;
                        } else {
                            f7 = 10.0f;
                        }
                        canvas.translate((i2 - gm.L(f7)) + translationX, L);
                        canvas.drawPath(this.y, paint);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(i2 + translationX, ((getMeasuredHeight() - this.E.getHeight()) / 2.0f) + L);
                        this.E.draw(canvas);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        f5 = 12.0f;
                        f6 = 2.0f;
                    }
                    float measuredHeight = (getMeasuredHeight() - this.F.getHeight()) / f6;
                    if (!z) {
                        measuredHeight -= gm.L(f5) - L;
                        L2 = measuredWidth;
                    } else {
                        L2 = (L5 + f3) - (gm.L(16.0f) * this.n);
                    }
                    Rect rect = this.I;
                    rect.set((int) L2, (int) measuredHeight, (int) (this.F.getWidth() + L2), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-gm.L(16.0f), -gm.L(16.0f));
                    if (this.n > 0.0f) {
                        this.J.setBounds((getMeasuredWidth() / 2) - L3, (getMeasuredHeight() / 2) - L3, (getMeasuredWidth() / 2) + L3, (getMeasuredHeight() / 2) + L3);
                        this.J.draw(canvas);
                        canvas.save();
                        canvas.translate(L2, measuredHeight);
                        this.F.draw(canvas);
                        canvas.restore();
                    } else {
                        setPressed(false);
                    }
                    if (this.n != 1.0f && !this.H) {
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
                    path.setLastPoint(gm.N(2.5f), f - gm.N(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(gm.N(2.5f), gm.N(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(gm.N(4.0f), f2 - gm.N(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(gm.N(4.0f), gm.N(5.0f) + f2);
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
                    if (chatActivityEnterView.U2 && chatActivityEnterView.d1) {
                        uz1 uz1Var = chatActivityEnterView.P3;
                        if (chatActivityEnterView.P) {
                            i = Integer.MAX_VALUE;
                        } else {
                            i = 0;
                        }
                        uz1Var.F1(5, 0, i, chatActivityEnterView.W6, 0L, true);
                        by1 by1Var = chatActivityEnterView.K0;
                        chatActivityEnterView.W6 = 0L;
                        by1Var.setEffect(0L);
                    } else {
                        chatActivityEnterView.P3.z0(0);
                        MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.R3 = null;
                    chatActivityEnterView.T3 = null;
                    chatActivityEnterView.U3 = null;
                    chatActivityEnterView.Y1 = 0L;
                    chatActivityEnterView.v3 = false;
                    hs6 d0 = hs6.d0(chatActivityEnterView.R);
                    long j2 = chatActivityEnterView.G3;
                    yv1 yv1Var = chatActivityEnterView.F3;
                    if (yv1Var != null && yv1Var.x4) {
                        j = yv1Var.d();
                    }
                    d0.D1(j2, j, null);
                    chatActivityEnterView.w2(2, true);
                    chatActivityEnterView.M(true);
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

    public ChatActivityEnterView(Activity activity, ela elaVar, yv1 yv1Var, boolean z, final ylb ylbVar) {
        super(activity);
        boolean z2;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        uz1 uz1Var;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i5 = z8c.t0;
        this.R = i5;
        this.S = j5.a(i5);
        this.U = 1;
        this.d0 = -1;
        this.x7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        this.D0 = false;
        this.E0 = false;
        this.q1 = new mw1(this, (byte) 21);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new jd(this, (byte) 19);
        this.l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.t3 = -1.0f;
        this.u3 = gm.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.e4 = -1;
        this.g4 = true;
        this.h4 = new dy1(this, (byte) 0);
        this.i4 = new eg0(this);
        this.j4 = new ny1(Integer.class, "translationY", (byte) 0);
        this.k4 = new Property(Float.class, "scale");
        this.l4 = new Property(Float.class, "controlsScale");
        this.m4 = new Paint(1);
        this.z4 = new i(this);
        this.A4 = new po(null);
        this.B4 = new Paint(1);
        this.H4 = new RectF();
        this.I4 = new Rect();
        this.J4 = new Rect();
        this.N4 = new dy1(this, (byte) 2);
        this.O4 = new ox1(this, (byte) 4);
        this.P4 = new ox1(this, (byte) 0);
        this.Q4 = new ox1(this, (byte) 1);
        this.R4 = new ox1(this, (byte) 2);
        this.S4 = new ox1(this, (byte) 3);
        this.m5 = new TextPaint(1);
        this.n5 = new Paint(1);
        this.o5 = new Paint(1);
        this.p5 = new Path();
        this.q5 = new Path();
        this.r5 = new RectF();
        this.s5 = new int[2];
        this.t5 = new int[2];
        this.w5 = new nf5((byte) 15);
        this.P5 = new Paint(2);
        this.T5 = 1.0f;
        this.U5 = 1.0f;
        this.W5 = true;
        this.X5 = true;
        this.a6 = new Paint();
        this.b6 = 1.0f;
        this.c6 = new Rect();
        this.e6 = new mw1(this, (byte) 4);
        this.h6 = true;
        this.o6 = -1;
        this.v6 = new RectF();
        this.F6 = new float[2];
        this.G6 = new float[2];
        this.H6 = new int[2];
        this.M6 = new mw1(this, (byte) 5);
        d53 d53Var = d53.h;
        this.N6 = new ln(this, 0L, 280L, d53Var);
        this.O6 = new ln(this, 0L, 280L, d53Var);
        this.P6 = new cc(this, (byte) 2);
        this.S6 = new pn2[1];
        this.y7 = 1;
        this.d7 = -1;
        Paint paint = new Paint(1);
        this.g7 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h7 = linearGradient;
        this.i7 = new Matrix();
        this.j7 = new ln(this, 0L, 280L, d53Var);
        this.k7 = new ln(this, 0L, 280L, d53Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        d53 d53Var2 = wb2.V;
        this.n7 = new h94(0, this, d53Var2, 250L);
        this.o7 = new fn0(1, this, d53Var2, 250L, false);
        this.p7 = new fn0(2, this, d53Var, 320L, false);
        this.q7 = new fn0(3, this, d53Var, 320L, false);
        this.u7 = new int[2];
        this.v7 = new int[2];
        this.L4 = ylbVar;
        this.M4 = z;
        if (z && !gm.E && (yv1Var == null || !yv1Var.isInBubbleMode())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Y2 = z2;
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(F0(cmb.Rf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        nm7.f(this.R).b(this, nm7.l2);
        nm7.f(this.R).b(this, nm7.o2);
        nm7.f(this.R).b(this, nm7.p2);
        nm7.f(this.R).b(this, nm7.m2);
        nm7.f(this.R).b(this, nm7.Y5);
        nm7.f(this.R).b(this, nm7.c4);
        nm7.f(this.R).b(this, nm7.n2);
        nm7.f(this.R).b(this, nm7.k2);
        nm7.f(this.R).b(this, nm7.s);
        nm7.f(this.R).b(this, nm7.s2);
        nm7.f(this.R).b(this, nm7.u2);
        nm7.f(this.R).b(this, nm7.e2);
        nm7.f(this.R).b(this, nm7.z0);
        nm7.f(this.R).b(this, nm7.K);
        nm7.f(this.R).b(this, nm7.n1);
        nm7.f(this.R).b(this, nm7.t2);
        nm7.f(this.R).b(this, nm7.T2);
        nm7.f(this.R).b(this, nm7.a3);
        nm7.f(this.R).b(this, nm7.j5);
        nm7.f(this.R).b(this, nm7.S3);
        nm7.e().b(this, nm7.m4);
        this.E3 = activity;
        this.F3 = yv1Var;
        if (yv1Var != null) {
            this.w3 = yv1Var.getClassGuid();
        }
        this.c2 = elaVar;
        this.d2 = elaVar;
        elaVar.setDelegate(this);
        this.r3 = oc7.d1().getBoolean("send_by_enter", false);
        px1 px1Var = new px1(this, activity, (byte) 0);
        this.p2 = px1Var;
        px1Var.setClipChildren(false);
        px1Var.setClipToPadding(false);
        px1Var.setPadding(0, gm.L(1.0f), 0, 0);
        addView(px1Var, qoe.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        px1 px1Var2 = new px1(this, activity, (byte) 1);
        this.o2 = px1Var2;
        px1Var2.setClipChildren(false);
        px1Var.addView(px1Var2, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        rx1 rx1Var = new rx1(this, activity);
        this.R0 = rx1Var;
        rx1Var.setContentDescription(jb6.M0(2131754884, null));
        rx1Var.setFocusable(true);
        int L = gm.L(7.5f);
        rx1Var.setPadding(L, L, L, L);
        int i6 = cmb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(rx1Var, i6, ylbVar, mode);
        int i7 = cmb.h6;
        int F0 = F0(i7);
        int L2 = gm.L(1.0f);
        int L3 = gm.L(3.0f);
        rx1Var.setBackground(cmb.W(gm.L(19.0f), F0, L2, L3, L2, L3));
        rx1Var.setOnClickListener(new rw1(this, (byte) 2));
        px1Var2.addView(rx1Var, qoe.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        H1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231790);
        anb.s(imageView, i6, ylbVar, mode);
        int F02 = F0(i7);
        int L4 = gm.L(1.0f);
        int L5 = gm.L(3.0f);
        imageView.setBackground(cmb.W(gm.L(19.0f), F02, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(jb6.M0(2131754003, null));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                long j;
                boolean z3 = false;
                switch (r3) {
                    case 0:
                        int i8 = ChatActivityEnterView.z7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, chatActivityEnterView.getContext());
                        String M0 = jb6.M0(2131754001, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131754002, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new dx1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i9 = ChatActivityEnterView.z7;
                        oc7.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        yv1 yv1Var2 = chatActivityEnterView2.F3;
                        if (yv1Var2 != null) {
                            j = yv1Var2.a();
                        } else {
                            j = chatActivityEnterView2.G3;
                        }
                        boolean z4 = chatActivityEnterView2.t2;
                        ylb ylbVar2 = ylbVar;
                        if (z4) {
                            if (chatActivityEnterView2.u2 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                                a1Var.n1(chatActivityEnterView2.u2);
                                a1Var.f2 = new ix1(chatActivityEnterView2, (byte) 1);
                                jx1 jx1Var = new jx1(chatActivityEnterView2, j, ylbVar2, (byte) 0);
                                a1Var.g2 = j;
                                a1Var.j2 = jx1Var;
                                a1Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                            a1Var2.o1(chatActivityEnterView2.F0.getText());
                            a1Var2.R2 = new gx1(chatActivityEnterView2, (byte) 10);
                            a1Var2.e2 = new ix1(chatActivityEnterView2, (byte) 2);
                            if (chatActivityEnterView2.P2 != null) {
                                z3 = true;
                            }
                            a1Var2.m1(j, z3, new jx1(chatActivityEnterView2, j, ylbVar2, (byte) 1));
                            a1Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        px1Var2.addView(imageView, qoe.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            if (yv1Var != null) {
                i2 = yv1Var.g4;
            } else {
                i2 = -1;
            }
            qmb qmbVar = new qmb((byte) 3, activity, this);
            this.f2 = qmbVar;
            qmbVar.setOrientation(0);
            qmbVar.setEnabled(false);
            qmbVar.setClipChildren(false);
            px1Var2.addView(qmbVar, qoe.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i2 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.y2 = imageView2;
                v43 v43Var = new v43(activity, 2131231514, i6);
                this.f0 = v43Var;
                imageView2.setImageDrawable(v43Var);
                this.f0.a(this.W2, false);
                if (this.W2) {
                    str = "AccDescrChanSilentOn";
                    i3 = 2131754906;
                } else {
                    str = "AccDescrChanSilentOff";
                    i3 = 2131754907;
                }
                imageView2.setContentDescription(jb6.M0(i3, str));
                anb.s(imageView2, i6, ylbVar, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                fg0 f0 = cmb.f0(F0(i7), 1, -1);
                wmb M = anb.M(i7);
                imageView2.setBackground(f0);
                anb.j(imageView2, f0, null, M, ylbVar);
                if (this.X2 && ((uz1Var = this.P3) == null || !uz1Var.b0())) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageView2.setVisibility(i4);
                qmbVar.addView(imageView2, qoe.o(44, 44));
                imageView2.setOnClickListener(new sx1(this, yv1Var, activity));
            }
            tx1 tx1Var = new tx1(this, activity, (byte) 0);
            this.h2 = tx1Var;
            tx1Var.setScaleType(scaleType);
            anb.s(tx1Var, i6, ylbVar, PorterDuff.Mode.MULTIPLY);
            tx1Var.setImageResource(2131232192);
            fg0 f02 = cmb.f0(F0(i7), 1, -1);
            wmb M2 = anb.M(i7);
            tx1Var.setBackground(f02);
            anb.j(tx1Var, f02, null, M2, ylbVar);
            px1Var2.addView(tx1Var, qoe.e(44, 44, 85));
            tx1Var.setOnClickListener(new rw1(this, (byte) 3));
            tx1Var.setContentDescription(jb6.M0(2131754921, null));
            s2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.j2 = imageView3;
        hd hdVar = new hd(activity);
        this.i2 = hdVar;
        imageView3.setImageDrawable(hdVar);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        anb.s(imageView3, i6, ylbVar, mode2);
        fg0 f03 = cmb.f0(F0(i7), 1, gm.L(16.0f));
        wmb M3 = anb.M(i7);
        imageView3.setBackground(f03);
        anb.j(imageView3, f03, null, M3, ylbVar);
        px1Var.addView(imageView3, qoe.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(jb6.M0(2131755006, null));
        rve.a(imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatActivityEnterView b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                long j;
                boolean z3 = false;
                switch (r3) {
                    case 0:
                        int i8 = ChatActivityEnterView.z7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, chatActivityEnterView.getContext());
                        String M0 = jb6.M0(2131754001, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131754002, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new dx1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i9 = ChatActivityEnterView.z7;
                        oc7.d1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        yv1 yv1Var2 = chatActivityEnterView2.F3;
                        if (yv1Var2 != null) {
                            j = yv1Var2.a();
                        } else {
                            j = chatActivityEnterView2.G3;
                        }
                        boolean z4 = chatActivityEnterView2.t2;
                        ylb ylbVar2 = ylbVar;
                        if (z4) {
                            if (chatActivityEnterView2.u2 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                                a1Var.n1(chatActivityEnterView2.u2);
                                a1Var.f2 = new ix1(chatActivityEnterView2, (byte) 1);
                                jx1 jx1Var = new jx1(chatActivityEnterView2, j, ylbVar2, (byte) 0);
                                a1Var.g2 = j;
                                a1Var.j2 = jx1Var;
                                a1Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), ylbVar2);
                            a1Var2.o1(chatActivityEnterView2.F0.getText());
                            a1Var2.R2 = new gx1(chatActivityEnterView2, (byte) 10);
                            a1Var2.e2 = new ix1(chatActivityEnterView2, (byte) 2);
                            if (chatActivityEnterView2.P2 != null) {
                                z3 = true;
                            }
                            a1Var2.m1(j, z3, new jx1(chatActivityEnterView2, j, ylbVar2, (byte) 1));
                            a1Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        imageView3.setVisibility(8);
        imageView3.setAlpha(0.0f);
        imageView3.setScaleX(0.6f);
        imageView3.setScaleY(0.6f);
        ImageView imageView4 = new ImageView(activity);
        this.k2 = imageView4;
        imageView4.setImageResource(2131231561);
        imageView4.setScaleType(scaleType);
        anb.s(imageView4, i6, ylbVar, mode2);
        fg0 f04 = cmb.f0(F0(i7), 1, gm.L(16.0f));
        wmb M4 = anb.M(i7);
        imageView4.setBackground(f04);
        anb.j(imageView4, f04, null, M4, ylbVar);
        px1Var.addView(imageView4, qoe.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(jb6.M0(2131753998, null));
        rve.a(imageView4);
        imageView4.setOnClickListener(new rw1(this, (byte) 4));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.R3 != null) {
            a0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.r2 = imageView5;
        imageView5.setImageResource(2131232710);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        anb.s(imageView5, cmb.Xl, ylbVar, mode);
        px1Var.addView(imageView5, qoe.e(44, 44, 85));
        px1 px1Var3 = new px1(this, activity, (byte) 2);
        this.q2 = px1Var3;
        px1Var3.setClipChildren(false);
        px1Var3.setClipToPadding(false);
        px1Var.addView(px1Var3, qoe.e(100, 44, 85));
        a aVar = new a(this, activity, ylbVar);
        this.a1 = aVar;
        aVar.setSoundEffectsEnabled(false);
        px1Var3.addView(aVar, qoe.e(44, 44, 85));
        aVar.setFocusable(true);
        aVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231511).mutate();
        this.C4 = mutate;
        anb.x(this, mutate, i6, ylbVar, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231519).mutate();
        this.D4 = mutate2;
        anb.x(this, mutate2, i6, ylbVar, mode2);
        zx1 zx1Var = new zx1(this, activity);
        this.c1 = zx1Var;
        zx1Var.setImportantForAccessibility(2);
        int L6 = gm.L(10.0f);
        zx1Var.setPadding(L6, L6, L6, L6);
        aVar.addView(zx1Var, qoe.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? kk2Var = new kk2();
        this.F2 = kk2Var;
        imageView6.setImageDrawable(kk2Var);
        imageView6.setContentDescription(jb6.M0(2131752542, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        fg0 f05 = cmb.f0(F0(i7), 1, -1);
        wmb M5 = anb.M(i7);
        imageView6.setBackground(f05);
        anb.j(imageView6, f05, null, M5, ylbVar);
        px1Var3.addView(imageView6, qoe.e(44, 44, 85));
        imageView6.setOnClickListener(new rw1(this, (byte) 9));
        if (c()) {
            i = 2131231516;
        } else {
            i = 2131232711;
        }
        by1 by1Var = new by1(this, activity, i, ylbVar);
        this.K0 = by1Var;
        by1Var.setVisibility(4);
        by1Var.setContentDescription(jb6.M0(2131745374, null));
        by1Var.setSoundEffectsEnabled(false);
        by1Var.setScaleX(0.1f);
        by1Var.setScaleY(0.1f);
        by1Var.setAlpha(0.0f);
        px1Var3.addView(by1Var, qoe.e(100, 44, 85));
        by1Var.setOnClickListener(new rw1(this, (byte) 12));
        by1Var.setOnLongClickListener(new hx1(this, (byte) 0));
        if (gm.A1()) {
            px1Var3.setOnLongClickListener(new hx1(this, (byte) 0));
        }
        w2a w2aVar = new w2a(activity, ylbVar);
        this.J0 = w2aVar;
        w2aVar.setVisibility(4);
        w2aVar.setOnClickListener(new rw1(this, (byte) 18));
        px1Var3.addView(w2aVar, qoe.e(44, 44, 85));
        yz1 yz1Var = new yz1(activity);
        lka lkaVar = (lka) yz1Var.c;
        this.G0 = yz1Var;
        lkaVar.setTextSize(16);
        yz1Var.invalidate();
        yz1Var.setVisibility(4);
        yz1Var.setSoundEffectsEnabled(false);
        yz1Var.setScaleX(0.1f);
        yz1Var.setScaleY(0.1f);
        yz1Var.setAlpha(0.0f);
        yz1Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        lkaVar.setGravity(21);
        yz1Var.invalidate();
        lkaVar.setTextColor(F0(i6));
        yz1Var.invalidate();
        px1Var3.addView(yz1Var, qoe.e(74, 44, 85));
        yz1Var.setOnClickListener(new rw1(this, (byte) 19));
        yz1Var.setOnLongClickListener(new hx1(this, (byte) 1));
        SharedPreferences c1 = oc7.c1();
        this.n3 = c1.getInt("kbd_height", gm.L(200.0f));
        this.o3 = c1.getInt("kbd_height_land3", gm.L(200.0f));
        P1(false, false);
        M(false);
        H();
        Z();
    }

    public static float I2(int i) {
        int i2 = i * 668265261;
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144789);
        return ((i3 ^ (i3 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static boolean J(int r20, long r21, org.telegram.ui.ActionBar.d r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.J(int, long, org.telegram.ui.ActionBar.d, java.lang.CharSequence):boolean");
    }

    public static int J2(int i) {
        int green = Color.green(i) * 6;
        return (Color.blue(i) + (green + (Color.red(i) * 3))) / 10;
    }

    public static float L2(float f, float f2, float f3) {
        float i = Utilities.i((f3 - f) / (f2 - f), 1.0f, 0.0f);
        return mlb.B(i, 2.0f, 3.0f, i * i);
    }

    public k47 getThreadMessage() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        k47 k47Var;
        yv1 yv1Var = this.F3;
        if (yv1Var != null && (k47Var = yv1Var.m4) != null) {
            return k47Var.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null && yv1Var.x4) {
            return this.G3 + "_" + yv1Var.d();
        }
        return String.valueOf(this.G3);
    }

    public static CharSequence q(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        gn gnVar;
        Collections.sort(arrayList, hs6.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jo4.a(charSequence, false));
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
                            j6c j6cVar = new j6c("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i5 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j6cVar, i5, messageEntity.length + i5, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            j6c j6cVar2 = new j6c("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i6 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j6cVar2, i6, messageEntity.length + i6, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.a |= 4;
                            xkb xkbVar = new xkb(obj2, 0);
                            int i7 = messageEntity.offset;
                            hs6.f(xkbVar, i7, messageEntity.length + i7, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.a |= 1;
                                xkb xkbVar2 = new xkb(obj3, 0);
                                int i8 = messageEntity.offset;
                                hs6.f(xkbVar2, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.a |= 2;
                                xkb xkbVar3 = new xkb(obj4, 0);
                                int i9 = messageEntity.offset;
                                hs6.f(xkbVar3, i9, messageEntity.length + i9, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.a |= 8;
                                xkb xkbVar4 = new xkb(obj5, 0);
                                int i10 = messageEntity.offset;
                                hs6.f(xkbVar4, i10, messageEntity.length + i10, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.a |= 16;
                                xkb xkbVar5 = new xkb(obj6, 0);
                                int i11 = messageEntity.offset;
                                hs6.f(xkbVar5, i11, messageEntity.length + i11, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                i6c i6cVar = new i6c(messageEntity.url, null);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i6cVar, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.a |= 128;
                                int i13 = messageEntity.offset;
                                obj7.b = i13;
                                obj7.c = i13 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i14 = messageEntity.offset;
                                jo4 jo4Var = new jo4(spannableStringBuilder.subSequence(i14, messageEntity.length + i14).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i15 = messageEntity.offset;
                                spannableStringBuilder.setSpan(jo4Var, i15, messageEntity.length + i15, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.a |= 256;
                                xkb xkbVar6 = new xkb(obj8, 0);
                                int i16 = messageEntity.offset;
                                hs6.f(xkbVar6, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    gnVar = new gn(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    gnVar = new gn(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(gnVar, i17, messageEntity.length + i17, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
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
                        f09.c(spannableStringBuilder, i21, i24, z4);
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
                f09.c(spannableStringBuilder, i21, spannableStringBuilder.length(), z4);
            }
        } else {
            z = true;
        }
        CharSequence m = gw3.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                fc4.g(e2, z);
            }
        }
        return m;
    }

    public void setHintGlass(hg5 hg5Var) {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            hg5Var.k(yv1Var.L);
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
        yz1 yz1Var = this.G0;
        yz1Var.setVisibility(i);
        if (z) {
            if (yz1Var.b) {
                f = 26.0f;
            } else {
                f = 16.0f;
            }
            i2 = gm.L(f);
        } else {
            i2 = 0;
        }
        sy1 sy1Var = this.F0;
        if (sy1Var != null && sy1Var.getPaddingRight() != i2) {
            this.F0.setPadding(0, gm.L(9.0f), i2, gm.L(10.0f));
        }
    }

    public final pz1 A() {
        CharSequence textToUse;
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            textToUse = "";
        } else {
            textToUse = sy1Var.getTextToUse();
        }
        CharSequence[] charSequenceArr = {gm.m1(textToUse)};
        ArrayList Y = hs6.d0(this.R).Y(charSequenceArr, true, true);
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

    public final glc A0() {
        glc glcVar = this.r1;
        if (glcVar == null) {
            glc glcVar2 = new glc(getContext(), new c(this));
            this.r1 = glcVar2;
            return glcVar2;
        }
        return glcVar;
    }

    public final void A1() {
        hg5 hg5Var = this.M;
        if (hg5Var == null) {
            return;
        }
        hg5Var.t(gw3.o(gm.S2(jb6.a0(null, null, 2131743449, m9c.k(this.F3.h(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new gx1(this, (byte) 16)));
        hg5 hg5Var2 = this.M;
        hg5Var2.h = hg5.a(hg5Var2.getText(), this.M.getTextPaint());
    }

    public void A2(boolean z) {
        B2(false, z);
    }

    public final float B(boolean z) {
        float f;
        float f2;
        int i;
        fn0 fn0Var = this.o7;
        h94 h94Var = this.n7;
        if (z) {
            if (h94Var.h) {
                f = h94Var.g;
            } else {
                f = h94Var.f;
            }
            f2 = fn0Var.f ? 1.0f : 0.0f;
        } else {
            f = h94Var.f;
            f2 = fn0Var.e;
        }
        View view = this.w2;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        return (i * f2) + f;
    }

    public final void B1(vh6 vh6Var, boolean z) {
        this.f7 = vh6Var;
        if (vh6Var.m() == 1 && ((TL_bots.BotInfo) vh6Var.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vh6Var.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.x7 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.x7 = 2;
            } else {
                this.x7 = 1;
            }
        } else {
            this.x7 = 1;
        }
        dq0 dq0Var = this.o0;
        if (dq0Var != null) {
            dq0Var.E(vh6Var);
        }
        m2(z);
        I(z);
    }

    public final void B2(boolean z, boolean z2) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z3;
        float f;
        float f2;
        float f3;
        ValueAnimator valueAnimator;
        sy1 sy1Var;
        m6a m6aVar;
        m6a m6aVar2;
        px1 px1Var;
        if (this.P3 != null) {
            Z();
            if (this.w7) {
                peer2 = this.P3.l();
                chat = null;
            } else {
                TLRPC.Chat L0 = oc7.r1(this.R).L0(Long.valueOf(-this.G3));
                TLRPC.ChatFull M0 = oc7.r1(this.R).M0(-this.G3);
                if (M0 != null) {
                    peer = M0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = L0;
                peer2 = peer3;
            }
            if (peer2 == null && this.P3.x() != null && !this.P3.x().peers.isEmpty()) {
                peer2 = this.P3.x().peers.get(0).peer;
            }
            yv1 yv1Var = this.F3;
            boolean z4 = true;
            if (!z && peer2 != null && ((this.P3.x() == null || this.P3.x().peers.size() > 1) && !Q0() && !U0() && (((px1Var = this.f1) == null || px1Var.getVisibility() != 0) && ((this.w7 || ((!sd2.V(chat) || sd2.k(chat)) && !sd2.p0(chat))) && (yv1Var == null || yv1Var.g4 != 9))))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f0();
            }
            if (peer2 != null) {
                int i = (peer2.channel_id > 0L ? 1 : (peer2.channel_id == 0L ? 0 : -1));
                int i2 = this.R;
                if (i != 0) {
                    TLRPC.Chat L02 = oc7.r1(i2).L0(Long.valueOf(peer2.channel_id));
                    if (L02 != null && (m6aVar2 = this.q0) != null) {
                        m6aVar2.setAvatar(L02);
                        this.q0.setContentDescription(jb6.a0(null, null, 2131754775, L02.title));
                    }
                } else {
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(peer2.user_id));
                    if (W1 != null && (m6aVar = this.q0) != null) {
                        m6aVar.setAvatar(W1);
                        this.q0.setContentDescription(jb6.a0(null, null, 2131754775, bw2.m(0, W1.first_name, W1.last_name)));
                    }
                }
            }
            m6a m6aVar3 = this.q0;
            if (m6aVar3 == null || m6aVar3.getVisibility() != 0) {
                z4 = false;
            }
            int L = gm.L(2.0f);
            float f4 = 1.0f;
            float f5 = 0.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f4 = 0.0f;
            }
            m6a m6aVar4 = this.q0;
            if (m6aVar4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m6aVar4.getLayoutParams();
                m6a m6aVar5 = this.q0;
                if (z3) {
                    f3 = ((-m6aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f2 = 0.0f;
                } else {
                    f2 = ((-m6aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (z4 != z3) {
                m6a m6aVar6 = this.q0;
                if (m6aVar6 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) m6aVar6.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.q0.setTag(null);
                }
                int i3 = 8;
                rx1 rx1Var = this.R0;
                if (!z3 && this.q0 != null && g0() && this.v3 && (sy1Var = this.F0) != null && z2) {
                    float translationX = this.F0.getTranslationX() + sy1Var.getLeft();
                    float translationX2 = rx1Var.getTranslationX() + rx1Var.getLeft();
                    this.q0.setVisibility(8);
                    this.q0.setTranslationX(0.0f);
                    this.q0.setAlpha(0.0f);
                    sy1 sy1Var2 = this.F0;
                    sy1Var2.getViewTreeObserver().addOnPreDrawListener(new ez1(this, sy1Var2, translationX, translationX2));
                } else if ((this.w7 || (yv1Var != null && yv1Var.b7() == 0 && yv1Var.g6)) && z2) {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    m6a m6aVar7 = this.q0;
                    if (m6aVar7 != null) {
                        m6aVar7.setTranslationX(f3);
                    }
                    this.H = f3;
                    u2();
                    float f6 = f2;
                    float f7 = f4;
                    float f8 = f3;
                    duration.addUpdateListener(new zm(this, f8, f6, f, f7, (byte) 2));
                    duration.addListener(new fz1(this, z3, f, f8, f7, f6));
                    duration.start();
                    m6a m6aVar8 = this.q0;
                    if (m6aVar8 != null) {
                        m6aVar8.setTag(duration);
                    }
                } else {
                    float f9 = f4;
                    boolean z5 = z3;
                    float f10 = f2;
                    if (z5) {
                        f0();
                    }
                    m6a m6aVar9 = this.q0;
                    if (m6aVar9 != null) {
                        if (z5) {
                            i3 = 0;
                        }
                        m6aVar9.setVisibility(i3);
                        this.q0.setTranslationX(f10);
                    }
                    if (z5) {
                        f5 = f10;
                    }
                    rx1Var.setTranslationX(f5);
                    this.H = f5;
                    u2();
                    m6a m6aVar10 = this.q0;
                    if (m6aVar10 != null) {
                        m6aVar10.setAlpha(f9);
                        this.q0.setTag(null);
                    }
                }
            }
        }
    }

    public final void C() {
        a6 a6Var = this.e1;
        if (a6Var != null) {
            a6Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        V0();
        if (this.f2 != null) {
            this.y = 0.0f;
            l2();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.a();
        A2(true);
    }

    public final va2 C0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof va2) {
                return (va2) parent;
            }
        }
        return null;
    }

    public final void C1(int i, boolean z, boolean z2) {
        this.e3 = i;
        if (this.f3 == z) {
            return;
        }
        this.f3 = z;
        m2(z2);
    }

    public final void C2() {
        int b;
        int i;
        int i2;
        long starsPrice = getStarsPrice();
        if (starsPrice > 0) {
            starsPrice *= getMessagesCount();
        }
        boolean z = true;
        if (this.j5 != starsPrice) {
            View sendButtonInternal = getSendButtonInternal();
            this.j5 = starsPrice;
            View sendButtonInternal2 = getSendButtonInternal();
            if (sendButtonInternal != sendButtonInternal2) {
                sendButtonInternal2.setVisibility(sendButtonInternal.getVisibility());
                sendButtonInternal2.setAlpha(sendButtonInternal.getAlpha());
                sendButtonInternal2.setScaleX(sendButtonInternal.getScaleX());
                sendButtonInternal2.setScaleY(sendButtonInternal.getScaleY());
                sendButtonInternal.setVisibility(8);
            }
            this.K0.i(1, starsPrice, true);
            s2(this.T6);
        }
        if (this.w7) {
            U();
            boolean v = v();
            int i3 = this.R;
            if (v) {
                int[] iArr = oc7.r1(i3).T3;
                if (iArr != null && iArr.length > 2) {
                    b = iArr[2];
                } else {
                    b = 400;
                }
            } else {
                b = bg5.b(i3, (int) starsPrice, 1);
            }
            if (this.d0 != b) {
                this.d0 = b;
                if (b > 0) {
                    int i4 = b - this.e0;
                    if (this.w7) {
                        i = 5;
                    } else {
                        i = 100;
                    }
                    if (i4 <= i) {
                        if (i4 < -9999) {
                            i4 = -9999;
                        }
                        U();
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
                            i2 = cmb.o7;
                        } else {
                            i2 = cmb.x6;
                        }
                        numberTextView2.setTextColor(F0(i2));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new nx1(this, (byte) 2));
                }
            }
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        px1 px1Var;
        float f3 = 0.0f;
        if (i == 0) {
            olc olcVar = this.T1;
            if (olcVar != null) {
                olcVar.setVisibleHeight(f);
            }
            if (this.E2 != null) {
                if (this.K1 && this.Q5 && (px1Var = this.f1) != null && px1Var.getVisibility() == 0) {
                    f3 = -Math.max(0.0f, f - gm.L(44.0f));
                }
                this.R5 = f3;
                this.E2.setTranslationY(f3 + this.S5 + this.t7);
            }
            O();
            P();
        } else if (i == 1) {
            O();
            P();
        } else {
            int i2 = 0;
            if (i == 2) {
                w2a w2aVar = this.J0;
                w2aVar.setAlpha(f);
                w2aVar.setScaleX(gm.R1(0.5f, 1.0f, f));
                w2aVar.setScaleY(gm.R1(0.5f, 1.0f, f));
                if (f <= 0.0f) {
                    i2 = 4;
                }
                w2aVar.setVisibility(i2);
            } else if (i == 3) {
                float R1 = gm.R1(1.0f, 0.79f, f);
                px1 px1Var2 = this.q2;
                px1Var2.setScaleX(R1);
                px1Var2.setScaleY(gm.R1(1.0f, 0.79f, f));
                float R12 = gm.R1(0.79f, 1.0f, f);
                ImageView imageView = this.r2;
                imageView.setScaleX(R12);
                imageView.setScaleY(gm.R1(0.79f, 1.0f, f));
                if (f <= 0.0f) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                imageView.setAlpha(f);
                by1 by1Var = this.K0;
                if (by1Var != null) {
                    by1Var.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
    }

    public final long D0() {
        if (this.G1 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.G1;
            if (uptimeMillis < j) {
                return Math.max(16L, j - SystemClock.uptimeMillis());
            }
            return 250L;
        }
        return 250L;
    }

    public final void D1(defpackage.k47 r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D1(k47, boolean, boolean):void");
    }

    public final void D2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D2():void");
    }

    public final void E() {
        int i;
        if (this.U2 && this.d1) {
            uz1 uz1Var = this.P3;
            if (this.P) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            uz1Var.F1(5, 0, i, this.W6, 0L, true);
            this.W6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.P3.z0(0);
            MediaController.w().A0(0, 0, false, false);
        }
        this.v3 = false;
        w2(2, true);
    }

    public final boolean E0(float[] fArr) {
        by1 by1Var = this.K0;
        if (by1Var != null && by1Var.o0) {
            by1Var.getLocationInWindow(r2);
            int[] iArr = {iArr[0] - Math.round(by1Var.getTranslationX()), iArr[1] - Math.round(by1Var.getTranslationY())};
            View rootView = by1Var.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + by1Var.j0) - by1Var.l0 <= rootView.getWidth() && iArr[0] + by1Var.j0 + by1Var.l0 >= 0.0f)) {
                int i = iArr[0];
                fArr[0] = i + by1Var.j0;
                int i2 = iArr[1];
                fArr[1] = i2 + by1Var.k0;
                fArr[2] = by1Var.l0;
                fArr[3] = i + by1Var.m0;
                fArr[4] = i2 + by1Var.n0;
                return true;
            }
        }
        return false;
    }

    public final void E1(k47 k47Var, String str, boolean z, boolean z2) {
        sy1 sy1Var;
        TLRPC.User user;
        y5a b;
        String str2;
        if (str != null && getVisibility() == 0 && (sy1Var = this.F0) != null) {
            l3a l3aVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z) {
                String obj = sy1Var.getText().toString();
                if (k47Var != null && pg3.y(this.G3)) {
                    user2 = oc7.r1(this.S.a).W1(Long.valueOf(k47Var.k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.e3 != 1 || z2) && user3 != null && user3.bot && !str.contains("@")) {
                    Locale locale = Locale.US;
                    str2 = kt6.o(str, "@", m9c.p(user3)) + " " + obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
                } else {
                    StringBuilder k = b10.k(str, " ");
                    k.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    str2 = k.toString();
                }
                this.H3 = true;
                this.F0.setText(str2);
                sy1 sy1Var2 = this.F0;
                sy1Var2.setSelection(sy1Var2.getText().length());
                this.H3 = false;
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    uz1Var.H0(this.F0.getText(), true, false);
                }
                if (!this.p3 && this.V2 == -1) {
                    j1();
                }
            } else if (this.H0 > 0 && !c()) {
                uz1 uz1Var2 = this.P3;
                if (uz1Var2 != null) {
                    yz1 yz1Var = this.G0;
                    uz1Var2.a1(yz1Var, ((lka) yz1Var.c).getText(), true);
                }
            } else {
                if (k47Var != null && pg3.y(this.G3)) {
                    user = oc7.r1(this.S.a).W1(Long.valueOf(k47Var.k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.e3 != 1 || z2) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b = y5a.b(kt6.o(str, "@", m9c.p(user)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b = y5a.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                yv1 yv1Var = this.F3;
                if (yv1Var != null) {
                    l3aVar = yv1Var.X6();
                }
                b.K = l3aVar;
                b.O = this.W6;
                this.W6 = 0L;
                this.K0.setEffect(0L);
                t(b);
                a6a.B(this.R).q0(b);
            }
        }
    }

    public final long E2(String str, Runnable runnable) {
        long j;
        RecordCircle recordCircle;
        if (!this.v3 && this.R3 != null) {
            t1();
            j = 420;
        } else {
            j = 0;
        }
        if (this.v3 || ((recordCircle = this.D2) != null && ChatActivityEnterView.this.h5)) {
            this.Y1 = 0L;
            this.D1 = true;
            try {
                E();
            } finally {
                this.D1 = false;
            }
        }
        gm.d3(new co1((byte) 9, this, runnable, str), j);
        return j;
    }

    public final void F() {
        tx1 tx1Var;
        yv1 yv1Var;
        if (this.M == null && (tx1Var = this.A2) != null && tx1Var.getRight() != 0 && (yv1Var = this.F3) != null && ok0.d(yv1Var.s8)) {
            SharedPreferences sharedPreferences = oc7.r1(this.R).X3;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + yv1Var.a(), true)) {
                SharedPreferences.Editor edit = oc7.r1(this.R).X3.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + yv1Var.a(), false).apply();
                hg5 hg5Var = new hg5(getContext(), 3);
                this.M = hg5Var;
                hg5Var.q(13.0f);
                setHintGlass(this.M);
                this.M.p(true);
                A1();
                this.M.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
                this.M.o(1.0f, -((getWidth() - gm.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f2.getX() + this.o2.getX())))));
                addView(this.M, qoe.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                hg5 hg5Var2 = this.M;
                hg5Var2.r0 = new mw1(this, (byte) 29);
                hg5Var2.d = 8000L;
                hg5Var2.v();
            }
        }
    }

    public final int F0(int i) {
        ylb ylbVar = this.L4;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
    }

    public final void F1(int i, long j) {
        this.G3 = j;
        gm.c3(new mw1(this, (byte) 26));
        if (this.R != i) {
            this.A4.e();
            nm7 f = nm7.f(this.R);
            int i2 = nm7.l2;
            f.n(this, i2);
            nm7 f2 = nm7.f(this.R);
            int i3 = nm7.o2;
            f2.n(this, i3);
            nm7 f3 = nm7.f(this.R);
            int i4 = nm7.p2;
            f3.n(this, i4);
            nm7 f4 = nm7.f(this.R);
            int i5 = nm7.m2;
            f4.n(this, i5);
            nm7 f5 = nm7.f(this.R);
            int i6 = nm7.Y5;
            f5.n(this, i6);
            nm7 f6 = nm7.f(this.R);
            int i7 = nm7.c4;
            f6.n(this, i7);
            nm7 f7 = nm7.f(this.R);
            int i8 = nm7.n2;
            f7.n(this, i8);
            nm7 f8 = nm7.f(this.R);
            int i9 = nm7.k2;
            f8.n(this, i9);
            nm7 f9 = nm7.f(this.R);
            int i10 = nm7.s;
            f9.n(this, i10);
            nm7 f10 = nm7.f(this.R);
            int i11 = nm7.s2;
            f10.n(this, i11);
            nm7 f11 = nm7.f(this.R);
            int i12 = nm7.u2;
            f11.n(this, i12);
            nm7 f12 = nm7.f(this.R);
            int i13 = nm7.e2;
            f12.n(this, i13);
            nm7 f13 = nm7.f(this.R);
            int i14 = nm7.z0;
            f13.n(this, i14);
            nm7 f14 = nm7.f(this.R);
            int i15 = nm7.K;
            f14.n(this, i15);
            nm7 f15 = nm7.f(this.R);
            int i16 = nm7.n1;
            f15.n(this, i16);
            nm7 f16 = nm7.f(this.R);
            int i17 = nm7.t2;
            f16.n(this, i17);
            nm7 f17 = nm7.f(this.R);
            int i18 = nm7.T2;
            f17.n(this, i18);
            nm7 f18 = nm7.f(this.R);
            int i19 = nm7.a3;
            f18.n(this, i19);
            nm7 f19 = nm7.f(this.R);
            int i20 = nm7.j5;
            f19.n(this, i20);
            nm7 f20 = nm7.f(this.R);
            int i21 = nm7.S3;
            f20.n(this, i21);
            this.R = i;
            this.S = j5.a(i);
            nm7.f(this.R).b(this, i2);
            nm7.f(this.R).b(this, i3);
            nm7.f(this.R).b(this, i4);
            nm7.f(this.R).b(this, i5);
            nm7.f(this.R).b(this, i6);
            nm7.f(this.R).b(this, i7);
            nm7.f(this.R).b(this, i8);
            nm7.f(this.R).b(this, i9);
            nm7.f(this.R).b(this, i10);
            nm7.f(this.R).b(this, i11);
            nm7.f(this.R).b(this, i12);
            nm7.f(this.R).b(this, i13);
            nm7.f(this.R).b(this, i14);
            nm7.f(this.R).b(this, i15);
            nm7.f(this.R).b(this, i16);
            nm7.f(this.R).b(this, i17);
            nm7.f(this.R).b(this, i18);
            nm7.f(this.R).b(this, i19);
            nm7.f(this.R).b(this, i20);
            nm7.f(this.R).b(this, i21);
        }
        boolean z = true;
        this.A0 = true;
        if (pg3.y(this.G3)) {
            this.A0 = sd2.q(oc7.r1(this.S.a).L0(Long.valueOf(-this.G3)));
        }
        z2(false);
        t2(false);
        i2();
        K();
        H();
        r2(false);
        if (this.F0 != null) {
            yv1 yv1Var = this.F3;
            if (yv1Var == null || !yv1Var.getFragmentBeginToShow()) {
                z = false;
            }
            A2(z);
        }
    }

    public final boolean F2() {
        sy1 sy1Var;
        if (this.s1 && ((sy1Var = this.F0) == null || sy1Var.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    public final void G() {
        boolean z;
        sy1 sy1Var = this.F0;
        if ((sy1Var == null || TextUtils.isEmpty(sy1Var.getText())) && !this.p3 && !this.a4 && !R0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            T();
        }
        eq0 eq0Var = this.m0;
        if (eq0Var != null) {
            boolean z2 = eq0Var.f;
            if (z2 != z) {
                eq0Var.f = z;
                eq0Var.requestLayout();
                eq0Var.invalidate();
            }
            if (z2 != this.m0.f) {
                rx1 rx1Var = this.R0;
                Float valueOf = Float.valueOf(rx1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(rx1Var, valueOf);
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    hashMap.put(sy1Var2, Float.valueOf(sy1Var2.getX()));
                }
            }
        }
    }

    public final boolean G0() {
        if (this.x7 == 3) {
            return true;
        }
        return false;
    }

    public final void G1(defpackage.k47 r19, defpackage.f47 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.G1(k47, f47, boolean):void");
    }

    public final void G2(int i) {
        byte b;
        if (!this.l1) {
            if (this.r1 != null || oc7.d1().getBoolean("asr_live_text", true)) {
                glc glcVar = this.r1;
                if (glcVar != null && glcVar.J && ((b = glcVar.c) == 2 || b == 4)) {
                    if (i != 1 && i != 2 && i != 4 && i != 5) {
                        gm.c3(new gx1(this, (byte) 13));
                        return;
                    }
                    glcVar.j("field: record state " + i, true);
                } else if (glcVar != null && glcVar.c == 3) {
                    if (i == 1 || i == 2 || i == 4 || i == 5 || i == 0) {
                        glcVar.j("review: record state " + i, true);
                    }
                } else if (i != 0) {
                    if (glcVar != null) {
                        glcVar.j("record state " + i, true);
                    }
                } else {
                    gm.c3(new gx1(this, (byte) 13));
                }
            }
        }
    }

    public final void H() {
        yv1 yv1Var = this.F3;
        if (yv1Var == null) {
            return;
        }
        v2(yv1Var.e, yv1Var.s8);
    }

    public final boolean H0() {
        sy1 sy1Var = this.F0;
        if (sy1Var != null && sy1Var.length() > 0) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z, boolean z2) {
        int currentPage;
        b02 b02Var;
        sy1 sy1Var;
        px1 px1Var;
        rx1 rx1Var = this.R0;
        if (rx1Var != null) {
            if (this.m3 || ((px1Var = this.f1) != null && px1Var.getVisibility() == 0)) {
                this.h = 0.0f;
                this.n = 0.0f;
                q2();
                z2 = false;
            }
            b02 b02Var2 = b02.f;
            b02 b02Var3 = b02.e;
            if (z && this.V2 == 0) {
                if (this.A0) {
                    b02Var = b02.d;
                } else {
                    return;
                }
            } else {
                jz1 jz1Var = this.V0;
                if (jz1Var == null) {
                    currentPage = oc7.c1().getInt("selected_page", 0);
                } else {
                    currentPage = jz1Var.getCurrentPage();
                }
                if (currentPage != 0 && ((this.z3 || this.A3) && ((sy1Var = this.F0) == null || TextUtils.isEmpty(sy1Var.getText())))) {
                    if (currentPage == 1) {
                        b02Var = b02.c;
                    } else {
                        b02Var = b02Var2;
                    }
                } else {
                    b02Var = b02Var3;
                }
            }
            if (!this.A0 && b02Var == b02Var3) {
                b02Var3 = b02Var2;
            } else if (this.b || b02Var == b02Var3) {
                b02Var3 = b02Var;
            }
            rx1Var.j(b02Var3, z2);
            if (b02Var3 == b02Var2 && this.V0 == null) {
                hs6.d0(this.R).X0(true, true, false, 0);
                ArrayList arrayList = oc7.r1(this.R).x3;
                int min = Math.min(10, arrayList.size());
                for (int i = 0; i < min; i++) {
                    gw3.k((CharSequence) arrayList.get(i));
                }
            }
        }
    }

    public final void H2() {
        if ((this.r1 != null || yze.a()) && !this.O2 && !this.l1) {
            A0().t();
        }
    }

    public final void I(boolean z) {
        String str;
        boolean z2;
        k47 k47Var;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z3 = false;
        if (this.G3 < 0 && this.M4 && this.P2 == null && (d54.g(this.R).e(str, this.f7) > 0 || ((k47Var = this.J3) != null && k47.c3(k47Var.k)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        fn0 fn0Var = this.q7;
        if (fn0Var.f != z2) {
            z3 = true;
        }
        fn0Var.a(z2, z);
        by1 by1Var = this.K0;
        if (by1Var != null) {
            by1Var.y = z2;
            by1Var.invalidate();
        }
        if (z3) {
            M(z);
        }
    }

    public final void I0() {
        hg5 hg5Var = this.O;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        hg5 hg5Var2 = this.M;
        if (hg5Var2 != null) {
            hg5Var2.f(true);
        }
    }

    public final void I1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void J0(boolean z) {
        K0(z, false, true);
    }

    public final void J1(CharSequence charSequence, boolean z) {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            this.H3 = true;
            sy1Var.setText(charSequence);
            this.F0.g(true);
            sy1 sy1Var2 = this.F0;
            sy1Var2.setSelection(sy1Var2.getText().length());
            this.H3 = false;
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                uz1Var.H0(this.F0.getText(), true, z);
            }
        }
    }

    public final void K() {
        boolean z;
        boolean z2;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f2 == null) {
            this.U2 = false;
            P1(false, false);
            return;
        }
        boolean z3 = true;
        this.U2 = true;
        this.y0 = true;
        this.z0 = true;
        if (pg3.y(this.G3)) {
            TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
            if (sd2.T(L0) && !L0.megagroup) {
                z = true;
            } else {
                z = false;
            }
            if (z && !L0.creator && ((tL_chatAdminRights = L0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.y0 = sd2.s(L0);
            this.z0 = sd2.v(L0);
        } else {
            z = false;
        }
        if (!gda.v0) {
            this.U2 = false;
        }
        if (this.U2) {
            if (gda.L0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences d1 = oc7.d1();
            if (z) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z2 = d1.getBoolean(str, z);
        } else {
            z2 = false;
        }
        if (!this.y0 && z2) {
            z2 = false;
        }
        if (!this.z0 && !z2) {
            if (!this.U2) {
                z3 = false;
            }
        } else {
            z3 = z2;
        }
        P1(z3, false);
    }

    public final boolean K0(boolean z, boolean z2, boolean z3) {
        boolean z4;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (R0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.d3) != null && z && this.c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    oc7.r1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
            }
            if ((z && this.H2 != 0) || z2) {
                R1(0, true);
                jz1 jz1Var = this.V0;
                if (jz1Var != null) {
                    jz1Var.r(true);
                }
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    sy1Var.requestFocus();
                }
                S1(false, true, false, true);
                if (this.o4) {
                    M(true);
                    return true;
                }
            } else if (this.H2 != 0) {
                R1(0, false);
                this.V0.r(false);
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    sy1Var2.requestFocus();
                }
            } else if (this.p4) {
                S1(false, true, false, true);
                return true;
            } else {
                if (z3 && !z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Z1(0, 0, true, z4);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void K1(boolean z, boolean z2) {
        this.x3 = z;
        M(z2);
    }

    public final AnimatorSet K2() {
        a aVar = this.a1;
        if (aVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(aVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(aVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(d53.g);
        return animatorSet;
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        k47 k47Var;
        sy1 sy1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z3;
        int i2;
        View view;
        int i3;
        int i4;
        c0d c0dVar;
        boolean z4 = false;
        if (this.H2 != 0) {
            this.B3 = i;
            this.C3 = z;
            if (i > 0) {
                z4 = true;
            }
            this.p3 = z4;
            G();
            return;
        }
        if (i > gm.L(50.0f) && this.p3 && !gm.E) {
            if (z) {
                this.o3 = i;
                oc7.c1().edit().putInt("kbd_height_land3", this.o3).commit();
            } else {
                this.n3 = i;
                oc7.c1().edit().putInt("kbd_height", this.n3).commit();
            }
        }
        if (this.p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean R0 = R0();
        ela elaVar = this.c2;
        yv1 yv1Var = this.F3;
        if (R0) {
            if (z) {
                i2 = this.o3;
            } else {
                i2 = this.n3;
            }
            if (yv1Var != null && yv1Var.getParentLayout() != null) {
                i2 -= ((ActionBarLayout) yv1Var.getParentLayout()).u(false);
            }
            if (this.V2 == 1) {
                gz1 gz1Var = this.x2;
                if (!gz1Var.f) {
                    i2 = Math.min(gz1Var.getKeyboardHeight(), i2);
                }
            }
            int i5 = this.V2;
            if (i5 == 0) {
                view = this.V0;
            } else if (i5 == 1) {
                view = this.x2;
            } else {
                view = null;
            }
            gz1 gz1Var2 = this.x2;
            if (gz1Var2 != null) {
                gz1Var2.setPanelHeight(i2);
                c0d c0dVar2 = this.l7;
                if (c0dVar2 != null && i2 > 0 && this.V2 == 1) {
                    ((g0d) c0dVar2).h(i2);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.q4 && !this.p4 && (((i3 = layoutParams.width) != (i4 = gm.q.x) || layoutParams.height != i2) && ((c0dVar = this.l7) == null || i3 != -1 || layoutParams.height != -1))) {
                    if (c0dVar == null) {
                        layoutParams.width = i4;
                        layoutParams.height = i2;
                        view.setLayoutParams(layoutParams);
                    }
                    if (elaVar != null) {
                        int i6 = this.q3;
                        this.q3 = layoutParams.height;
                        elaVar.requestLayout();
                        i1();
                        if (this.Y2 && !this.p3 && i6 != this.q3 && p1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.l7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.q3 - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.q3 - i6, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new nx1(this, (byte) 12));
                            gm.d3(this.N4, 50L);
                            this.A4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i && this.C3 == z) {
            i1();
            return;
        }
        this.B3 = i;
        this.C3 = z;
        boolean z5 = this.p3;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.p3 = z2;
        G();
        if (this.p3 && R0() && this.r4 == null) {
            Z1(0, this.V2, true, true);
        } else if (!this.p3 && !R0() && (k47Var = this.c3) != null && this.J3 != k47Var && !G0() && !y() && !org.telegram.ui.ActionBar.d.hasSheets(yv1Var) && (((sy1Var = this.F0) == null || TextUtils.isEmpty(sy1Var.getText())) && (tL_replyKeyboardMarkup = this.d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            gb gbVar = elaVar.I;
            if (gbVar.f) {
                gbVar.j();
            } else {
                gbVar.v = true;
            }
            Z1(1, 1, false, true);
        }
        if (this.q3 != 0 && !(z3 = this.p3) && z3 != z5 && !R0()) {
            this.q3 = 0;
            elaVar.requestLayout();
        }
        if (this.p3 && this.a4) {
            this.a4 = false;
            if (this.f4) {
                this.f4 = false;
                this.x2.setButtons(this.d3);
            }
            gm.r(this.h4);
        }
        i1();
    }

    public final void L0(boolean z) {
        long j;
        sy1 sy1Var;
        AnimatorSet animatorSet;
        float f;
        float f2;
        long j2;
        float f3;
        AnimatorSet animatorSet2 = this.k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            this.R6 = true;
            if (this.K1) {
                N1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            tec tecVar = this.g1;
            if (tecVar != null) {
                tecVar.a(true);
            }
            zx1 zx1Var = this.c1;
            if (zx1Var != null) {
                zx1Var.setVisibility(0);
            }
            ox1 ox1Var = this.S4;
            ox1 ox1Var2 = this.O4;
            ox1 ox1Var3 = this.Q4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            rx1 rx1Var = this.R0;
            Property property3 = View.ALPHA;
            tx1 tx1Var = this.h2;
            if (z) {
                if (tx1Var != null) {
                    this.l2 = 0.0f;
                    tx1Var.setAlpha(0.0f);
                    tx1Var.setScaleX(0.0f);
                    tx1Var.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                q2();
                this.k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(rx1Var, ox1Var3, f3));
                arrayList.add(ObjectAnimator.ofFloat(rx1Var, ox1Var2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, property3, 0.0f));
                if (tx1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(tx1Var, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(tx1Var, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(tx1Var, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, ox1Var, 0.0f));
                l lVar = this.E2;
                if (lVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property3, 0.0f));
                    this.E2.e();
                }
                this.k3.playTogether(arrayList);
                eq0 eq0Var = this.m0;
                if (eq0Var != null) {
                    eq0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.k3.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.k3.setDuration(150L);
                this.k3.addListener(new nx1(this, (byte) 3));
            } else {
                boolean z2 = this.x5;
                s09 s09Var = this.h1;
                if (s09Var != null && !z2) {
                    s09Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = this.d1;
                long j3 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z3) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, property4, -gm.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, ox1Var, 0.0f));
                    l lVar2 = this.E2;
                    if (lVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar2, property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                    int i = (this.s > 1.0f ? 1 : (this.s == 1.0f ? 0 : -1));
                    sy1 sy1Var2 = this.F0;
                    if (i == 0) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(sy1Var2, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sy1Var2, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    long j4 = 750;
                    sy1 sy1Var3 = this.F0;
                    if (sy1Var3 != null && this.s == 1.0f && !z2) {
                        sy1Var3.setAlpha(1.0f);
                        this.H = 0.0f;
                        u2();
                    } else {
                        this.H = 0.0f;
                        u2();
                        if (z2 && (sy1Var = this.F0) != null) {
                            sy1Var.setAlpha(0.0f);
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.F0, property3, 1.0f);
                        if (z2) {
                            j4 = 600;
                        }
                        ofFloat2.setStartDelay(j4);
                        if (z2) {
                            j = 360;
                        } else {
                            j = 200;
                        }
                        ofFloat2.setDuration(j);
                        if (z2) {
                            ofFloat2.setInterpolator(d53.g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    }
                    if (!z2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, property4, -gm.L(20.0f)));
                    }
                    l lVar3 = this.E2;
                    if (lVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar3, property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (tx1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 0.0f;
                    tx1Var.setAlpha(0.0f);
                    tx1Var.setScaleX(0.0f);
                    tx1Var.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(tx1Var, property3, 1.0f), ObjectAnimator.ofFloat(tx1Var, property2, 1.0f), ObjectAnimator.ofFloat(tx1Var, property, 1.0f));
                    animatorSet.setDuration(150L);
                } else {
                    animatorSet = null;
                }
                this.n = 0.0f;
                float f4 = 0.6f;
                if (z2) {
                    f = 0.6f;
                } else {
                    f = 0.0f;
                }
                this.h = f;
                q2();
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (!z2) {
                    f4 = 0.0f;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.h1, property3, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.h1, property2, f4);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.h1, property, f4);
                if (this.B0) {
                    f2 = 0.5f;
                } else {
                    f2 = 1.0f;
                }
                animatorSet4.playTogether(ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(rx1Var, ox1Var3, f2), ObjectAnimator.ofFloat(rx1Var, ox1Var2, 1.0f));
                eq0 eq0Var2 = this.m0;
                if (eq0Var2 != null) {
                    eq0Var2.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                if (z2) {
                    j2 = 220;
                } else {
                    j2 = 150;
                }
                animatorSet4.setDuration(j2);
                if (z2) {
                    animatorSet4.setInterpolator(d53.g);
                    j3 = 1040;
                }
                animatorSet4.setStartDelay(j3);
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.k3 = animatorSet5;
                if (animatorSet != null) {
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet4);
                } else {
                    animatorSet5.playTogether(animatorSet3, animatorSet4);
                }
                this.k3.addListener(new e(this));
            }
            AnimatorSet animatorSet6 = this.k3;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
            l lVar4 = this.E2;
            if (lVar4 != null) {
                lVar4.invalidate();
            }
        }
    }

    public void L1(float f, float f2, float f3, boolean z) {
        int i;
        int i2;
        sy1 sy1Var;
        float f4;
        float f5 = 1.0f - f3;
        float f6 = f * f5;
        float f7 = f2 * f5;
        this.r = (f3 * 0.5f) + 0.5f;
        this.s = f3;
        q2();
        float f8 = -f6;
        this.R0.setTranslationX(f8);
        if (this.F0 == null) {
            i2 = 0;
        } else {
            int L = gm.L(40.0f);
            m6a m6aVar = this.q0;
            if (m6aVar != null && m6aVar.getVisibility() == 0) {
                i = gm.L(18.0f);
            } else {
                i = 0;
            }
            i2 = L + i;
        }
        this.I = f8 - (i2 * f5);
        s09 s09Var = this.h1;
        if (s09Var != null) {
            s09Var.setTranslationX(f8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setTranslationX(f7);
        }
        l lVar = this.E2;
        if (lVar != null) {
            lVar.setTranslationX(f7);
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.setTranslationX(f8);
        }
        px1 px1Var = this.q2;
        px1Var.setTranslationX(f7);
        this.z1 = f3;
        px1Var.setAlpha((1.0f - this.y1) * f3);
        ImageView imageView = this.m2;
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
        l2();
        u2();
        float f9 = f6 * f5;
        if (this.J != f9) {
            this.J = f9;
            l49 l49Var = this.i1;
            if (l49Var != null) {
                l49Var.setTranslationX(f9);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float R1 = gm.R1(0.88f, 1.0f, f3);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(sy1Var.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(R1);
            this.F0.setScaleY(R1);
            this.F0.setHintRightOffset(gm.U1(f3, gm.L(60.0f), 0));
        }
    }

    public final void M(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.M(boolean):void");
    }

    public final void M0() {
        s1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        tec tecVar = this.g1;
        if (tecVar != null) {
            tecVar.a(true);
        }
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        tec tecVar2 = this.g1;
        if (tecVar2 != null) {
            tecVar2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setAlpha(1.0f);
            this.H = 0.0f;
            u2();
            this.F0.requestFocus();
        }
        px1 px1Var = this.f1;
        if (px1Var != null) {
            px1Var.setVisibility(8);
        }
        V0();
    }

    public final void M1(boolean z) {
        int i;
        int i2;
        if (this.w7 == z) {
            return;
        }
        this.w7 = z;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        this.h2.setVisibility(i);
        if (z) {
            gm.B2(this.y2);
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
            r1();
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        s2(this.T6);
        M(false);
    }

    public final void N() {
        int i;
        if (this.V0 != null) {
            Point point = gm.q;
            if (point.x > point.y) {
                i = this.o3;
            } else {
                i = this.n3;
            }
            int L = ((((this.e2 - gm.m) - gm.n) - gm.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
            if (this.H2 == 2) {
                L = Math.min(L, gm.L(175.0f) + i);
            }
            int i2 = this.V0.getLayoutParams().height;
            if (i2 != L) {
                AnimatorSet animatorSet = this.r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.r4 = null;
                }
                this.t4 = L;
                ny1 ny1Var = this.j4;
                if (i2 > L) {
                    mw1 mw1Var = new mw1(this, (byte) 20);
                    this.V0.setLayerType(2, null);
                    if (this.w) {
                        this.x = mw1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        c0d c0dVar = this.l7;
                        int i3 = this.t4 - i;
                        if (c0dVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i3), ValueAnimator.ofInt(-(this.t4 - i)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, ny1Var, -i3), ObjectAnimator.ofInt(this.V0, ny1Var, -(this.t4 - i)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new bx1(this, (byte) 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(d53.f);
                        animatorSet2.addListener(new u5(this, mw1Var, (byte) 13));
                        this.r4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.l7 == null) {
                        this.V0.getLayoutParams().height = this.t4;
                    }
                    this.c2.requestLayout();
                    sy1 sy1Var = this.F0;
                    if (sy1Var != null) {
                        int selectionStart = sy1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        sy1 sy1Var2 = this.F0;
                        sy1Var2.setText(sy1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    c0d c0dVar2 = this.l7;
                    int i4 = this.t4 - i;
                    if (c0dVar2 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-i4), ValueAnimator.ofInt(-(this.t4 - i)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, ny1Var, -i4), ObjectAnimator.ofInt(this.V0, ny1Var, -(this.t4 - i)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new bx1(this, (byte) 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(d53.f);
                    animatorSet3.addListener(new nx1(this, (byte) 0));
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                c0d c0dVar3 = this.l7;
                if (c0dVar3 != null) {
                    ((g0d) c0dVar3).h(L);
                }
            }
        }
    }

    public void N0(boolean z) {
        if (this.w2 != null && this.V3) {
            gx1 gx1Var = this.W;
            if (gx1Var != null) {
                gm.r(gx1Var);
            }
            this.V3 = false;
            this.W3 = false;
            if (this.X3) {
                this.o7.a(false, z);
            }
        }
    }

    public final void N1(boolean z) {
        ValueAnimator valueAnimator = this.Q1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q1 = null;
        }
        if (z) {
            float f = this.P1;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.Q1 = ofFloat;
                ofFloat.addUpdateListener(new bx1(this, (byte) 10));
                this.Q1.setDuration(200L);
                this.Q1.setInterpolator(d53.g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        va2 C0 = C0();
        if (C0 != null) {
            C0.setInputBubbleExtraAlpha(1.0f);
        }
        px1 px1Var = this.f1;
        if (px1Var != null) {
            px1Var.invalidate();
        }
    }

    public final void O() {
        this.s7 = B(true);
        p0();
        float B = B(false);
        if (this.r7 != B) {
            this.r7 = B;
            c1(B);
        }
    }

    public final boolean O0() {
        tc tcVar = this.K6;
        if (tcVar != null && tcVar.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void O1(CharSequence charSequence, boolean z) {
        this.e = charSequence;
        this.f = null;
        r2(z);
    }

    public final void P() {
        boolean z;
        int i;
        int i2;
        View view;
        int i3;
        float f = this.o7.e;
        if (this.w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.n7.f;
            this.w2.setTranslationY(measuredHeight - (view.getMeasuredHeight() * f));
            View view2 = this.w2;
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
        if (this.I6 != z) {
            px1 px1Var = this.p2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) px1Var.getLayoutParams();
            if (z) {
                i = this.w2.getLayoutParams().height;
            } else {
                i = 0;
            }
            layoutParams.topMargin = i;
            layoutParams.topMargin = gm.L(9.0f) + i;
            px1Var.setLayoutParams(layoutParams);
            this.I6 = z;
            int L = gm.L(44.0f);
            if (z) {
                i2 = this.w2.getLayoutParams().height;
            } else {
                i2 = 0;
            }
            setMinimumHeight(L + i2);
            if (this.p4) {
                if (this.H2 == 0) {
                    S1(false, true, false, true);
                } else {
                    N();
                }
            }
        }
    }

    public final boolean P0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.P0():boolean");
    }

    public final void P1(boolean z, boolean z2) {
        b02 b02Var;
        int i;
        String M0;
        String str;
        zx1 zx1Var = this.c1;
        if (zx1Var == null) {
            return;
        }
        this.d1 = z;
        if (z2) {
            SharedPreferences d1 = oc7.d1();
            boolean z3 = false;
            if (pg3.y(this.G3)) {
                TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
                if (sd2.T(L0) && !L0.megagroup) {
                    z3 = true;
                }
            }
            SharedPreferences.Editor edit = d1.edit();
            if (z3) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z).apply();
        }
        if (this.d1) {
            b02Var = b02.b;
        } else {
            b02Var = b02.a;
        }
        zx1Var.j(b02Var, z2);
        int i2 = 2131754733;
        if (this.d1) {
            i = 2131754735;
        } else {
            i = 2131754733;
        }
        zx1Var.setContentDescription(jb6.M0(i, null));
        if (g0()) {
            M0 = jb6.M0(2131754874, null);
        } else {
            if (this.d1) {
                i2 = 2131754735;
            }
            M0 = jb6.M0(i2, null);
        }
        this.a1.setContentDescription(M0);
        i0();
        wz1 wz1Var = this.b2;
        if (wz1Var != null) {
            wz1Var.d(g0());
        }
        zx1Var.sendAccessibilityEvent(8);
    }

    public final void Q() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            hs6.d0(this.R).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean Q0() {
        if (this.P2 != null) {
            return true;
        }
        return false;
    }

    public final void Q1(k47 k47Var, nv1 nv1Var, k47 k47Var2) {
        boolean z;
        k47 k47Var3;
        yv1 yv1Var = this.F3;
        if (yv1Var != null && yv1Var.V7() && this.K3 != k47Var2) {
            z = true;
        } else {
            z = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (k47Var != null) {
            if (this.M3 == null && (k47Var3 = this.c3) != this.J3) {
                this.M3 = k47Var3;
            }
            this.J3 = k47Var;
            this.L3 = nv1Var;
            this.K3 = k47Var2;
            if (yv1Var == null || !yv1Var.x4 || yv1Var.m4 != k47Var) {
                D1(k47Var, true, true);
            }
        } else if (this.J3 == this.c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            D1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        I(true);
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            storyItem = uz1Var.C0();
        }
        MediaController w = MediaController.w();
        k47 threadMessage = getThreadMessage();
        w.r1 = k47Var;
        w.s1 = threadMessage;
        w.t1 = storyItem;
        r2(z);
    }

    public final void R() {
        gm.t1(this.F0);
    }

    public final boolean R0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void R1(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.H2 != 0) {
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
                jz1 jz1Var = this.V0;
                if (jz1Var != null) {
                    jz1Var.Z();
                }
            } else {
                float f2 = this.x0;
                if (z2) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.w0 = ofFloat;
                ofFloat.addUpdateListener(new bx1(this, (byte) 4));
                this.w0.addListener(new ey1(this, z2, (byte) 4));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(d53.f);
                this.w0.start();
            }
        }
        this.H2 = i;
    }

    public final void S() {
        if (this.n2 != null) {
            return;
        }
        tx1 tx1Var = new tx1(this, getContext(), (byte) 2);
        this.n2 = tx1Var;
        n99 n99Var = new n99(getContext());
        this.K2 = n99Var;
        tx1Var.setImageDrawable(n99Var);
        n99 n99Var2 = this.K2;
        int i = cmb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ylb ylbVar = this.L4;
        anb.x(this, n99Var2, i, ylbVar, mode);
        this.K2.a(2131231501, false);
        this.n2.setScaleType(ImageView.ScaleType.CENTER);
        tx1 tx1Var2 = this.n2;
        int i2 = cmb.h6;
        anb.R(tx1Var2, cmb.f0(F0(i2), 1, -1), null, anb.M(i2), ylbVar);
        this.n2.setVisibility(8);
        gm.T3(this.n2, false, 0.1f, true, false);
        this.f2.addView(this.n2, 0, qoe.o(44, 44));
        this.n2.setOnClickListener(new rw1(this, (byte) 20));
    }

    public final boolean S0(View view) {
        if (view != this.x2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void S1(boolean z, boolean z2, boolean z3, boolean z4) {
        final int i;
        gb gbVar = this.V;
        if ((gbVar == null || !gbVar.f) && !this.b4 && this.V0 != null) {
            if (z3 || this.p4 != z) {
                this.p4 = z;
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    uz1Var.Y0();
                }
                Point point = gm.q;
                if (point.x > point.y) {
                    i = this.o3;
                } else {
                    i = this.n3;
                }
                AnimatorSet animatorSet = this.r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.r4 = null;
                }
                boolean z5 = this.p4;
                po poVar = this.A4;
                ny1 ny1Var = this.j4;
                ela elaVar = this.c2;
                if (z5) {
                    if (z4) {
                        nm7.e().k(nm7.j1, 1);
                    }
                    int height = elaVar.getHeight();
                    this.e2 = height;
                    int L = ((((height - gm.m) - gm.n) - gm.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
                    this.t4 = L;
                    if (this.H2 == 2) {
                        this.t4 = Math.min(L, gm.L(175.0f) + i);
                    }
                    if (this.l7 == null) {
                        this.V0.getLayoutParams().height = this.t4;
                    }
                    elaVar.requestLayout();
                    if (this.X5) {
                        elaVar.setForeground(new yb1(this));
                    }
                    sy1 sy1Var = this.F0;
                    if (sy1Var != null) {
                        int selectionStart = sy1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        sy1 sy1Var2 = this.F0;
                        sy1Var2.setText(sy1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z2) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        c0d c0dVar = this.l7;
                        int i2 = this.t4 - i;
                        if (c0dVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i2), ValueAnimator.ofInt(-(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, ny1Var, -i2), ObjectAnimator.ofInt(this.V0, ny1Var, -(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(d53.f);
                        if (this.l7 == null) {
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
                                            int i4 = ChatActivityEnterView.z7;
                                            chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                        default:
                                            int i5 = ChatActivityEnterView.z7;
                                            chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new nx1(this, (byte) 1));
                        this.r4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        poVar.d();
                        this.s4 = 0.0f;
                        elaVar.invalidate();
                        animatorSet2.start();
                    } else {
                        this.s4 = 1.0f;
                        if (this.l7 == null) {
                            setTranslationY(-(this.t4 - i));
                            this.V0.setTranslationY(-(this.t4 - i));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.v4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    c0d c0dVar2 = this.l7;
                    if (c0dVar2 != null) {
                        ((g0d) c0dVar2).h(this.t4);
                    }
                } else {
                    if (z4) {
                        nm7.e().k(nm7.k1, 1);
                    }
                    if (z2) {
                        this.q4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.l7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, ny1Var, 0), ObjectAnimator.ofInt(this.V0, ny1Var, 0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(d53.f);
                        if (this.l7 == null) {
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
                                            int i4 = ChatActivityEnterView.z7;
                                            chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                        default:
                                            int i5 = ChatActivityEnterView.z7;
                                            chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new co(this, i, (byte) 3));
                        this.s4 = 1.0f;
                        elaVar.invalidate();
                        this.r4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        poVar.d();
                        animatorSet3.start();
                    } else {
                        this.s4 = 0.0f;
                        if (this.l7 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i;
                        }
                        elaVar.requestLayout();
                        elaVar.setForeground(null);
                        elaVar.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.v4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    c0d c0dVar3 = this.l7;
                    if (c0dVar3 != null) {
                        ((g0d) c0dVar3).h(i);
                    }
                }
                tx1 tx1Var = this.T0;
                if (tx1Var != null) {
                    if (this.p4) {
                        tx1Var.setContentDescription(jb6.M0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        tx1Var.setContentDescription(jb6.M0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final void T() {
        if (this.m0 == null) {
            eq0 eq0Var = new eq0(getContext());
            this.m0 = eq0Var;
            eq0Var.setOnClickListener(new rw1(this, (byte) 11));
            this.o2.addView(this.m0, qoe.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            gm.T3(this.m0, false, 1.0f, true, false);
            eq0 eq0Var2 = this.m0;
            if (!eq0Var2.f) {
                eq0Var2.f = true;
                eq0Var2.h = 1.0f;
                eq0Var2.requestLayout();
                eq0Var2.invalidate();
            }
        }
    }

    public final boolean T0() {
        if (this.v3 && ChatActivityEnterView.this.h5) {
            return true;
        }
        return false;
    }

    public final void T1(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        if (this.k5 != z || !z2) {
            ImageView imageView = this.m2;
            int i = 0;
            if (imageView == null) {
                if (z || this.w7) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.m2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.m2;
                        int i2 = cmb.Ml;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        ylb ylbVar = this.L4;
                        anb.s(imageView3, i2, ylbVar, mode);
                        this.m2.setImageResource(2131231518);
                        ImageView imageView4 = this.m2;
                        int i3 = cmb.h6;
                        anb.R(imageView4, cmb.f0(F0(i3), 1, -1), null, anb.M(i3), ylbVar);
                        if (this.w7) {
                            this.m2.setTranslationX(gm.L(42.0f));
                            this.p2.addView(this.m2, qoe.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f2.addView(this.m2, 0, qoe.o(44, 44));
                        }
                        this.m2.setOnClickListener(new rw1(this, (byte) 0));
                        this.m2.setContentDescription(jb6.M0(2131754921, null));
                    }
                } else {
                    return;
                }
            }
            if (this.k5 != z) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.k5 = z;
            if (z) {
                f2 = 1.0f;
                f = 1.0f;
            } else {
                f = 0.6f;
                f2 = 0.0f;
            }
            this.m2.setEnabled(z);
            this.m2.setClickable(z);
            ValueAnimator valueAnimator = this.l5;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.l5 = null;
            }
            if (z2) {
                if (this.w7) {
                    this.m2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m2.getAlpha(), f2);
                this.l5 = ofFloat;
                ofFloat.addUpdateListener(new bx1(this, (byte) 11));
                this.l5.addListener(new ey1(this, z, (byte) 0));
                this.l5.setDuration(220L);
                this.l5.setInterpolator(d53.h);
                this.l5.start();
            } else {
                this.m2.setScaleX(f);
                this.m2.setScaleY(f);
                this.m2.setAlpha(f2);
                if (this.w7) {
                    ImageView imageView5 = this.m2;
                    if (!z) {
                        i = 8;
                    }
                    imageView5.setVisibility(i);
                }
            }
            s2(this.T6);
            if (z3) {
                M(true);
            }
        }
    }

    public final void U() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(F0(cmb.x6));
        this.c0.setTypeface(gm.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), qoe.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean U0() {
        if (!this.v3) {
            AnimatorSet animatorSet = this.j3;
            if (animatorSet == null || !animatorSet.isRunning() || this.a3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void U1(boolean z, boolean z2) {
        olc olcVar;
        boolean z3 = false;
        if (this.K1 && (olcVar = this.T1) != null) {
            if (this.U1 != z || !z2) {
                this.U1 = z;
                l49 l49Var = this.i1;
                float f = 1.0f;
                if (l49Var != null) {
                    olcVar.c(Math.round(Math.max(1.0f, (l49Var.w - l49Var.s) * l49Var.r)));
                }
                if (z) {
                    gm.r(this.X1);
                } else if (this.T1.c.hasFocus()) {
                    gm.t1(this.T1.c);
                    this.T1.c.clearFocus();
                }
                this.T1.setCollapsing(!z);
                this.T1.animate().cancel();
                this.T1.setAlpha(1.0f);
                this.T1.setVisibility(0);
                ValueAnimator valueAnimator = this.W1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.W1 = null;
                }
                if (!z) {
                    f = 0.0f;
                }
                if (!z2) {
                    u(f);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, f);
                    this.W1 = ofFloat;
                    ofFloat.addUpdateListener(new bx1(this, (byte) 7));
                    this.W1.setDuration(360L);
                    this.W1.setInterpolator(d53.h);
                    this.W1.start();
                }
                by1 by1Var = this.K0;
                if (by1Var != null) {
                    if (this.K1 && this.U1) {
                        z3 = true;
                    }
                    by1Var.setIconDimmed(z3);
                }
                l lVar = this.E2;
                if (lVar != null) {
                    lVar.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        this.U1 = false;
    }

    public final void V1(boolean z) {
        yv1 yv1Var;
        un3 un3Var;
        boolean z2;
        float f;
        float f2;
        if ((z || this.t2) && (yv1Var = this.F3) != null && !yv1Var.x() && (((un3Var = this.j1) == null || !un3Var.o()) && !O0())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.j6 != z2) {
            if (z2) {
                oc7.r1(this.R).P1().b();
            }
            this.j6 = z2;
            ImageView imageView = this.j2;
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
            scaleX.scaleY(f3).setInterpolator(d53.h).setDuration(420L).withEndAction(new cx1(this, z2, (byte) 0)).start();
            if (z2) {
                hd hdVar = this.i2;
                Objects.requireNonNull(hdVar);
                imageView.postDelayed(new gd(hdVar, (byte) 1), 220L);
                hg5 hg5Var = this.N;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    this.N = null;
                }
                if (oc7.d1().getInt("aihintshown", 0) < 3) {
                    hg5 hg5Var2 = new hg5(getContext(), 3);
                    this.N = hg5Var2;
                    hg5Var2.p(true);
                    this.N.t(jb6.M0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.o(0.0f, (imageView.getWidth() / 2.0f) + gm.L(4.0f));
                    addView(this.N, qoe.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    hg5 hg5Var3 = this.N;
                    hg5Var3.r0 = new uj1(this, hg5Var2, (byte) 27);
                    hg5Var3.d = 4000L;
                    hg5Var3.v();
                    oc7.d1().edit().putInt("aihintshown", oc7.d1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            hg5 hg5Var4 = this.N;
            if (hg5Var4 != null) {
                hg5Var4.f(true);
                this.N = null;
            }
        }
    }

    public final void W(boolean z) {
        if (this.v2 != null) {
            return;
        }
        by1 by1Var = new by1(this, getContext(), this.L4);
        this.v2 = by1Var;
        by1Var.setContentDescription(jb6.M0(2131751211, null));
        if (z) {
            rve.a(this.v2);
        }
        this.p2.addView(this.v2, qoe.e(44, 44, 85));
    }

    public final boolean W0(View view) {
        if (view != null && view.getVisibility() == 0) {
            if (view != this.h2) {
                if (view.getAlpha() > 0.01f && view.getScaleX() > 0.01f) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void W1() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null && sd2.V(yv1Var.e)) {
            c41.b0(yv1Var).f(oc7.r1(this.R).l4.h1.f(), new mw1(this, (byte) 11)).j();
        }
    }

    public final void X() {
        boolean z;
        jz1 jz1Var = this.V0;
        if (jz1Var != null && jz1Var.d1 != z8c.t0) {
            this.d2.removeView(jz1Var);
            jz1Var = null;
            this.V0 = null;
        }
        if (jz1Var != null) {
            return;
        }
        boolean z2 = this.y3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.T2;
        boolean z3 = this.X5;
        boolean z4 = this.U0;
        if (this.l7 != null) {
            z = true;
        } else {
            z = false;
        }
        jz1 jz1Var2 = new jz1(this, this.F3, z2, context, chatFull, this.c2, z3, this.L4, z4, z);
        this.V0 = jz1Var2;
        jz1Var2.w0 = true;
        if (!this.X5) {
            jz1Var2.updateColors();
        }
        this.V0.H(true, this.z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.l7 != null) {
            jz1 jz1Var3 = this.V0;
            jz1Var3.x0 = false;
            jz1Var3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new nz1(this));
        this.V0.setDragListener(new dbc(this));
        jz1 jz1Var4 = this.V0;
        if (jz1Var4 != null) {
            jz1Var4.J(-this.G3, !this.A0, !this.b);
        }
        w();
        H();
    }

    public final boolean X0() {
        if (!c() && !this.q7.f) {
            return false;
        }
        return true;
    }

    public boolean X1(Runnable runnable) {
        return false;
    }

    public final void Y() {
        if (this.T0 != null) {
            return;
        }
        tx1 tx1Var = new tx1(this, getContext(), (byte) 3);
        this.T0 = tx1Var;
        tx1Var.setScaleType(ImageView.ScaleType.CENTER);
        tx1 tx1Var2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(F0(cmb.Ml), false);
        this.v4 = animatedArrowDrawable;
        tx1Var2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        tx1 tx1Var3 = this.T0;
        int i = cmb.h6;
        anb.R(tx1Var3, cmb.f0(F0(i), 1, -1), null, anb.M(i), this.L4);
        this.q2.addView(this.T0, qoe.e(44, 44, 85));
        this.T0.setOnClickListener(new rw1(this, (byte) 7));
        this.T0.setContentDescription(jb6.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final boolean Y0() {
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void Y1() {
        Z1(1, 0, true, true);
    }

    public final void Z() {
        TLRPC.EncryptedChat encryptedChat;
        int i;
        float f;
        int i2;
        if (this.F0 != null) {
            return;
        }
        Context context = getContext();
        ylb ylbVar = this.L4;
        sy1 sy1Var = new sy1(this, context, ylbVar);
        this.F0 = sy1Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            sy1Var.setFallbackLineSpacing(false);
        }
        if (i3 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new dx1(this));
        yv1 yv1Var = this.F3;
        if (yv1Var != null && yv1Var.getParentLayout() != null && ((ActionBarLayout) yv1Var.getParentLayout()).b) {
            this.F0.setWindowView(yv1Var.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        }
        if (yv1Var != null) {
            encryptedChat = yv1Var.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(g2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i = 285212672;
        } else {
            i = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i);
        sy1 sy1Var2 = this.F0;
        int inputType = sy1Var2.getInputType() | 147456;
        this.a = inputType;
        sy1Var2.setInputType(inputType);
        r2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, gm.L(9.0f), 0, gm.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        anb.X(this.F0, cmb.Ke, ylbVar);
        anb.G(this.F0, cmb.Xc, ylbVar);
        anb.C(this.F0, cmb.kg, ylbVar);
        sy1 sy1Var3 = this.F0;
        int i4 = cmb.Le;
        anb.A(sy1Var3, i4, ylbVar);
        anb.D(this.F0, i4, ylbVar);
        anb.v(this.F0, cmb.Me, ylbVar);
        anb.y(this.F0, cmb.lg, ylbVar);
        sy1 sy1Var4 = this.F0;
        boolean z2 = this.M4;
        if (z2) {
            f = 50.0f;
        } else {
            f = 2.0f;
        }
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 80, 52.0f, 0.0f, f, 1.5f);
        px1 px1Var = this.o2;
        px1Var.addView(sy1Var4, 1, d);
        mi9 mi9Var = new mi9(this.R, ylbVar, getContext());
        this.s2 = mi9Var;
        mi9Var.setAllowActions(false);
        this.s2.setMaxHeight(gm.L(150.0f));
        this.s2.setMinHeight(gm.L(88.0f));
        this.s2.setVisibility(8);
        this.s2.setPadding(gm.L(8.0f), gm.L(9.0f), gm.L(8.0f), gm.L(10.0f));
        this.s2.setOnClickListener(new rw1(this, (byte) 14));
        mi9 mi9Var2 = this.s2;
        if (z2) {
            i2 = 50;
        } else {
            i2 = 2;
        }
        px1Var.addView(mi9Var2, 2, qoe.d(-1, -2.0f, 80, 44.0f, 0.0f, i2 - 8, 1.5f));
        i2();
        this.F0.setOnKeyListener(new ty1(this));
        this.F0.setOnEditorActionListener(new uy1(this, (byte) 0));
        this.F0.addTextChangedListener(new vy1(this));
        this.F0.addTextChangedListener(new fj());
        this.F0.setEnabled(this.h6);
        ArrayList arrayList = this.g6;
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                this.F0.addTextChangedListener((TextWatcher) obj);
            }
            this.g6.clear();
        }
        r2(false);
        if (yv1Var == null || !yv1Var.getFragmentBeginToShow()) {
            z = false;
        }
        A2(z);
        if (yv1Var != null) {
            yv1Var.H4(false, false);
        }
        s2(this.T6);
    }

    public final void Z0(TLRPC.Document document, String str, g47 g47Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        TL_stories.StoryItem storyItem;
        if (this.H0 > 0 && !c()) {
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                yz1 yz1Var = this.G0;
                uz1Var.a1(yz1Var, ((lka) yz1Var.c).getText(), true);
                return;
            }
            return;
        }
        if (this.H2 != 0) {
            R1(0, true);
            this.V0.r(true);
            this.V0.y();
        }
        S1(false, true, false, true);
        uz1 uz1Var2 = this.P3;
        l3a l3aVar = null;
        if (uz1Var2 != null) {
            storyItem = uz1Var2.C0();
        } else {
            storyItem = null;
        }
        a6a B = a6a.B(this.R);
        long j = this.G3;
        k47 k47Var = this.J3;
        k47 threadMessage = getThreadMessage();
        nv1 nv1Var = this.L3;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            l3aVar = yv1Var.X6();
        }
        B.t0(document, str, j, k47Var, threadMessage, storyItem, nv1Var, g47Var, z, i, i2, z3, obj, l3aVar, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        uz1 uz1Var3 = this.P3;
        if (uz1Var3 != null) {
            uz1Var3.w(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        hs6.d0(this.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void Z1(int i, int i2, boolean z, boolean z2) {
        byte b;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup;
        int i4;
        float f;
        if (i != 2) {
            po poVar = this.A4;
            dy1 dy1Var = this.N4;
            Property property = View.TRANSLATION_Y;
            boolean z5 = false;
            if (i == 1) {
                if (i2 == 0) {
                    if (this.E3 == null && this.V0 == null) {
                        return;
                    }
                    X();
                }
                if (i2 == 0) {
                    w();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    gz1 gz1Var = this.x2;
                    if (gz1Var != null && gz1Var.getVisibility() != 8) {
                        this.x2.setVisibility(8);
                        this.Y0 = false;
                        i3 = this.x2.getMeasuredHeight();
                    } else {
                        i3 = 0;
                    }
                    this.V0.setShowing(true);
                    viewGroup = this.V0;
                    this.e4 = 0;
                } else if (i2 == 1) {
                    if (this.Y0) {
                        this.x2.getVisibility();
                    }
                    this.Y0 = true;
                    jz1 jz1Var = this.V0;
                    if (jz1Var != null && jz1Var.getVisibility() != 8) {
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                        this.X0 = false;
                        i4 = this.V0.getMeasuredHeight();
                    } else {
                        i4 = 0;
                    }
                    this.x2.setVisibility(0);
                    ViewGroup viewGroup2 = this.x2;
                    this.e4 = 1;
                    oc7.r1(this.R).X3.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i3 = i4;
                    viewGroup = viewGroup2;
                } else {
                    i3 = 0;
                    viewGroup = null;
                }
                this.V2 = i2;
                if (this.n3 <= 0) {
                    f = 200.0f;
                    this.n3 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                } else {
                    f = 200.0f;
                }
                int i5 = this.o3;
                if (i5 <= 0) {
                    i5 = oc7.c1().getInt("kbd_height_land3", gm.L(f));
                    this.o3 = i5;
                }
                Point point = gm.q;
                if (point.x <= point.y) {
                    i5 = this.n3;
                }
                yv1 yv1Var = this.F3;
                if (yv1Var != null && yv1Var.getParentLayout() != null) {
                    i5 -= ((ActionBarLayout) yv1Var.getParentLayout()).u(false);
                }
                if (i2 == 1) {
                    i5 = Math.min(this.x2.getKeyboardHeight(), i5);
                }
                gz1 gz1Var2 = this.x2;
                if (gz1Var2 != null) {
                    gz1Var2.setPanelHeight(i5);
                }
                if (viewGroup != null && this.l7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i5;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!gm.E) {
                    gm.t1(this.F0);
                }
                ela elaVar = this.c2;
                if (elaVar != null) {
                    this.q3 = i5;
                    elaVar.requestLayout();
                    H1(true, true);
                    m2(true);
                    i1();
                    if (this.Y2 && !this.p3 && i5 != i3 && z) {
                        mw1 mw1Var = new mw1(this, (byte) 25);
                        if (this.w) {
                            this.x = mw1Var;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            float f2 = i5 - i3;
                            if (this.l7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(f2, 0.0f));
                            } else {
                                viewGroup.setTranslationY(f2);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f2, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new u5(this, mw1Var, (byte) 11));
                            gm.d3(dy1Var, 50L);
                            poVar.d();
                        }
                        requestLayout();
                    }
                }
                c0d c0dVar = this.l7;
                if (c0dVar != null) {
                    ((g0d) c0dVar).h(i5);
                }
            } else {
                if (this.R0 != null) {
                    H1(false, true);
                }
                this.V2 = -1;
                jz1 jz1Var2 = this.V0;
                if (jz1Var2 != null) {
                    if (i == 2 && !gm.D && !gm.E) {
                        this.w4 = false;
                        uz1 uz1Var = this.P3;
                        if (uz1Var != null) {
                            uz1Var.o(0.0f);
                        }
                        this.d2.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.Y2 && !this.p3 && !this.p4) {
                        this.X0 = true;
                        this.e4 = 0;
                        jz1Var2.setShowing(false);
                        ex1 ex1Var = new ex1(this, i, (byte) 0);
                        if (!this.w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            c0d c0dVar2 = this.l7;
                            jz1 jz1Var3 = this.V0;
                            if (c0dVar2 != null) {
                                z3 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(jz1Var3.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z3 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(jz1Var3, property, jz1Var3.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            poVar.d();
                            this.W0.addListener(new u5(this, ex1Var, (byte) 12));
                        } else {
                            z3 = false;
                            this.x = ex1Var;
                        }
                        gm.d3(dy1Var, 50L);
                        requestLayout();
                        z5 = z3;
                    } else {
                        uz1 uz1Var2 = this.P3;
                        if (uz1Var2 != null) {
                            uz1Var2.o(0.0f);
                        }
                        z5 = false;
                        this.q3 = 0;
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z5;
                }
                gz1 gz1Var3 = this.x2;
                if (gz1Var3 != null && gz1Var3.getVisibility() == 0) {
                    if (i != 2 || gm.D || gm.E) {
                        if (this.Y2 && !this.p3) {
                            if (this.Y0) {
                                this.e4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            c0d c0dVar3 = this.l7;
                            gz1 gz1Var4 = this.x2;
                            if (c0dVar3 != null) {
                                b = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(gz1Var4.getMeasuredHeight()));
                            } else {
                                b = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(gz1Var4, property, gz1Var4.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new oz1(this, i, b));
                            poVar.d();
                            gm.d3(dy1Var, 50L);
                            requestLayout();
                        } else if (!this.a4) {
                            this.x2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i2 == 1 && this.c3 != null) {
                    oc7.r1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
                m2(true);
                c0d c0dVar4 = this.l7;
                if (c0dVar4 != null) {
                    ((g0d) c0dVar4).i(z2);
                }
            }
            if (this.n4 || this.o4) {
                M(true);
            }
            if (this.p4 && i != 1) {
                z4 = false;
                S1(false, false, false, true);
            } else {
                z4 = false;
            }
            r2(z4);
            G();
        }
    }

    @Override
    public final boolean a() {
        un3 un3Var = this.j1;
        if (un3Var != null && un3Var.q()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        int i;
        if (this.f1 != null) {
            return;
        }
        px1 px1Var = new px1(this, getContext(), (byte) 3);
        this.f1 = px1Var;
        if (this.R3 == null) {
            i = 8;
        } else {
            i = 0;
        }
        px1Var.setVisibility(i);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.o2.addView(this.f1, qoe.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(2131623975, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.A5 = this.h1.getAnimatedDrawable();
        x2();
        this.h1.setContentDescription(jb6.M0(2131751535, "Delete"));
        s09 s09Var = this.h1;
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(F0(i2), 1, -1);
        wmb M = anb.M(i2);
        ylb ylbVar = this.L4;
        anb.R(s09Var, f0, null, M, ylbVar);
        this.f1.addView(this.h1, qoe.c(44.0f, 44));
        this.h1.setOnClickListener(new rw1(this, (byte) 10));
        tec tecVar = new tec(getContext());
        this.g1 = tecVar;
        tecVar.setVisibility(4);
        tec tecVar2 = this.g1;
        tecVar2.T = !this.X5;
        tecVar2.setRoundFrames(true);
        this.g1.setDelegate(new fy1(this));
        this.f1.addView(this.g1, qoe.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(gm.L(14.0f));
        view.b = context.getDrawable(2131232801);
        view.a = cmb.b0(gm.L(5.0f), cmb.w0(null, cmb.gg, false));
        view.b();
        view.setTime(0);
        this.g1.setTimeHintView(view);
        this.c2.addView((View) view, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        l49 l49Var = new l49(getContext(), ylbVar);
        this.i1 = l49Var;
        this.f1.addView(l49Var, qoe.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        s2(this.T6);
    }

    public final void a1(org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.a1(org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public final void a2() {
        uz1 uz1Var = this.P3;
        if ((uz1Var == null || !uz1Var.h()) && pg3.y(this.G3)) {
            TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
            c41 b0 = c41.b0(this.F3);
            StringBuilder sb = new StringBuilder();
            if (sd2.p(L0)) {
                sb.append(jb6.M0(2131745341, null));
            }
            if (sd2.u(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745338, null));
            }
            if (sd2.t(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745339, null));
            }
            if (sd2.o(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745342, null));
            }
            if (sd2.l(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745343, null));
            }
            if (sd2.v(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745337, null));
            }
            if (sd2.s(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745340, null));
            }
            if (sd2.m(L0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.M0(2131745344, null));
            }
            b0.G(2131624113, 3, jb6.a0("SendPlainTextRestrictionHint", null, 2131745326, sb.toString())).j();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ie));
        hashSet.add(Integer.valueOf(cmb.Uf));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.Sf));
        hashSet.add(Integer.valueOf(cmb.Rf));
        hashSet.add(Integer.valueOf(cmb.Oe));
    }

    @Override
    public final boolean b() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null && yv1Var.M4()) {
            return true;
        }
        return false;
    }

    public final ValueAnimator b0() {
        int[] iArr;
        int[] iArr2;
        float f;
        int[] iArr3;
        float f2;
        int i;
        int i2;
        float f3;
        int i3;
        int i4;
        float f4;
        float f5;
        int i5;
        short s;
        float f6;
        int i6;
        int i7;
        float f7;
        float f8;
        float f9;
        int i8;
        int i9;
        if (this.b2 != null && this.D2 != null && !this.D1 && e86.e(360928) && this.D2.isShown()) {
            RecordCircle recordCircle = this.D2;
            if (!recordCircle.O && recordCircle.getWidth() > 0) {
                if (this.b2.getVisibility() != 0) {
                    this.b2.setVisibility(0);
                }
                this.b2.animate().cancel();
                this.b2.setScaleX(1.0f);
                this.b2.setScaleY(1.0f);
                this.b2.getLocationInWindow(new int[2]);
                this.D2.getLocationInWindow(new int[2]);
                float width = (this.b2.getWidth() / 2.0f) + (iArr[0] - iArr2[0]);
                float measuredHeight = ((this.b2.getMeasuredHeight() / 2.0f) - gm.L(3.0f)) + (iArr[1] - iArr2[1]);
                RecordCircle recordCircle2 = this.D2;
                float f10 = recordCircle2.K;
                float f11 = recordCircle2.L;
                float max = (Math.max(recordCircle2.M, gm.L(10.0f)) * 1.5f) + gm.L(6.0f);
                int ceil = (int) Math.ceil(max * 2.0f);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
                    float f12 = f10 - max;
                    float f13 = f11 - max;
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(-f12, -f13);
                    this.D2.draw(canvas);
                    int[] iArr4 = new int[ceil * ceil];
                    createBitmap.getPixels(iArr4, 0, ceil, 0, 0, ceil, ceil);
                    int i10 = ceil;
                    int max2 = Math.max(1, Math.round(gm.p * 0.75f));
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12 += max2) {
                        for (int i13 = 0; i13 < i10; i13 += max2) {
                            if ((iArr4[(i12 * i10) + i13] >>> 24) > 24) {
                                i11++;
                            }
                        }
                    }
                    if (i11 == 0) {
                        createBitmap.recycle();
                        return null;
                    }
                    int F0 = F0(cmb.Tf) | (-16777216);
                    float[] fArr = {-0.24f, -0.17f, -0.11f, -0.06f, -0.02f, 0.03f, 0.08f, 0.13f};
                    int[] iArr5 = new int[8];
                    int i14 = 0;
                    for (int i15 = 8; i14 < i15; i15 = 8) {
                        float f14 = fArr[i14];
                        if (f14 < 0.0f) {
                            f14 = -f14;
                            i9 = -16777216;
                        } else {
                            i9 = -1;
                        }
                        iArr5[i14] = on2.f(f14, F0, i9);
                        i14++;
                    }
                    int[] iArr6 = new int[i11];
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < i10) {
                        int i18 = 0;
                        while (i18 < i10) {
                            int i19 = iArr4[(i16 * i10) + i18];
                            int[] iArr7 = iArr6;
                            int i20 = i16;
                            if ((i19 >>> 24) > 24) {
                                iArr7[i17] = J2(i19);
                                i17++;
                            }
                            i18 += max2;
                            iArr6 = iArr7;
                            i16 = i20;
                        }
                        i16 += max2;
                    }
                    int[] iArr8 = iArr6;
                    Arrays.sort(iArr8);
                    int[] iArr9 = new int[8];
                    int i21 = 0;
                    for (int i22 = 8; i21 < i22; i22 = i22) {
                        int i23 = i21 + 1;
                        iArr9[i21] = iArr8[Math.min(i11 - 1, (i23 * i11) / 8)];
                        i21 = i23;
                    }
                    lta ltaVar = this.E5;
                    if (ltaVar == null) {
                        ltaVar = new lta(2400);
                        this.E5 = ltaVar;
                    }
                    ltaVar.a();
                    this.E5.e(false);
                    lta ltaVar2 = this.E5;
                    ltaVar2.t = iArr5;
                    ltaVar2.s = true;
                    if (cmb.I.o()) {
                        f = 0.12f;
                    } else {
                        f = 0.0f;
                    }
                    ltaVar2.u = f;
                    lta ltaVar3 = this.E5;
                    ltaVar3.S = 0.0f;
                    ltaVar3.R = 0.0f;
                    float f15 = i11;
                    float min = Math.min(1.0f, 1400.0f / f15);
                    float f16 = gm.p;
                    this.I5 = f12;
                    this.J5 = i10 + f12;
                    float[] fArr2 = new float[2400];
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    while (true) {
                        iArr3 = iArr9;
                        if (i25 >= i10) {
                            break;
                        }
                        int i27 = 2400;
                        float f17 = 0.3f;
                        if (i24 >= 2400) {
                            break;
                        }
                        int i28 = i26;
                        float f18 = min;
                        int i29 = 0;
                        while (i29 < i10 && i24 < i27) {
                            int i30 = iArr4[(i25 * i10) + i29];
                            int i31 = i24;
                            int i32 = i30 >>> 24;
                            if (i32 > 24) {
                                i28++;
                                int i33 = i28 * 7;
                                if (I2(i33 + 3) <= (((i32 * 0.7f) / 255.0f) + f17) * f18) {
                                    float I2 = I2(i33 + 11);
                                    float I22 = I2(i33 + 12);
                                    float I23 = I2(i33 + 14);
                                    float f19 = i29 + f12;
                                    float f20 = I2 - 0.5f;
                                    i7 = i29;
                                    float f21 = max2;
                                    float f22 = (f20 * f21) + f19;
                                    f7 = f10;
                                    i6 = i25;
                                    float f23 = I22 - 0.5f;
                                    float f24 = (f23 * f21) + i25 + f13;
                                    f8 = f11;
                                    float f25 = this.I5;
                                    f6 = f13;
                                    f9 = f12;
                                    float i34 = Utilities.i((f22 - f25) / (this.J5 - f25), 1.0f, 0.0f);
                                    float f26 = (0.03f * I23) + (i34 * 0.2f) + 0.04f;
                                    float w = b10.w(f23, 3.0f, f16, width);
                                    float w2 = b10.w(f20, 2.0f, f16, measuredHeight);
                                    float A = mlb.A(i34, 0.16f, 0.92f, (I2(i33 + 15) * 0.16f) + 0.5f);
                                    float g = aq1.g(I2, 0.25f, f17, width - f22, f22);
                                    float min2 = Math.min(f24, measuredHeight) - (((I23 * 22.0f) + 8.0f) * f16);
                                    lta ltaVar4 = this.E5;
                                    int J2 = J2(i30);
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 < 7) {
                                            if (J2 <= iArr3[i35]) {
                                                i8 = i35;
                                                break;
                                            }
                                            i35++;
                                        } else {
                                            i8 = 7;
                                            break;
                                        }
                                    }
                                    ltaVar4.j(f22, f24, g, min2, w, w2, A, f26, i8);
                                    i24 = i31 + 1;
                                    fArr2[i31] = (A * 0.95f) + f26;
                                    i29 = i7 + max2;
                                    f11 = f8;
                                    f10 = f7;
                                    i25 = i6;
                                    f13 = f6;
                                    f12 = f9;
                                    i27 = 2400;
                                    f17 = 0.3f;
                                }
                            }
                            f6 = f13;
                            i6 = i25;
                            i7 = i29;
                            f7 = f10;
                            f8 = f11;
                            f9 = f12;
                            i24 = i31;
                            i29 = i7 + max2;
                            f11 = f8;
                            f10 = f7;
                            i25 = i6;
                            f13 = f6;
                            f12 = f9;
                            i27 = 2400;
                            f17 = 0.3f;
                        }
                        i25 += max2;
                        min = f18;
                        iArr9 = iArr3;
                        i26 = i28;
                        i24 = i24;
                        f11 = f11;
                        f10 = f10;
                        f13 = f13;
                        f12 = f12;
                    }
                    float f27 = f13;
                    float f28 = f10;
                    float f29 = f11;
                    float f30 = f12;
                    float min3 = Math.min(1.0f, 650.0f / f15);
                    int i36 = 0;
                    int i37 = 0;
                    while (i36 < i10) {
                        if (i24 >= 2400) {
                            break;
                        }
                        int i38 = 0;
                        for (int i39 = 2400; i38 < i10 && i24 < i39; i39 = 2400) {
                            int i40 = iArr4[(i36 * i10) + i38];
                            int i41 = i40 >>> 24;
                            if (i41 > 24) {
                                i37++;
                                int i42 = i37 * 13;
                                if (I2(i42 + 5) <= (((i41 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                    float I24 = I2(i42 + 6);
                                    float I25 = I2(i42 + 7);
                                    float I26 = I2(i42 + 8);
                                    i = i10;
                                    float f31 = I24 - 0.5f;
                                    int i43 = i24;
                                    float f32 = max2;
                                    i2 = max2;
                                    float f33 = (f31 * f32) + f30 + i38;
                                    float f34 = I25 - 0.5f;
                                    f3 = min3;
                                    float f35 = (f32 * f34) + f27 + i36;
                                    float f36 = f33 - f28;
                                    float f37 = f35 - f29;
                                    i3 = i36;
                                    i4 = i38;
                                    float sqrt = (float) Math.sqrt((f37 * f37) + (f36 * f36));
                                    if (sqrt < gm.L(1.0f)) {
                                        double d = I26 * 3.141592653589793d * 2.0d;
                                        f5 = (float) Math.cos(d);
                                        f4 = (float) Math.sin(d);
                                    } else {
                                        f4 = f37 / sqrt;
                                        f5 = f36 / sqrt;
                                    }
                                    float I27 = ((I2(i42 + 9) * 13.0f) + 7.0f) * f16;
                                    float f38 = I26 * 0.05f;
                                    float w3 = b10.w(f34, 3.0f, f16, width);
                                    float w4 = b10.w(f31, 2.0f, f16, measuredHeight);
                                    float I28 = (I2(i42 + 10) * 0.2f) + 0.56f;
                                    float g2 = aq1.g(I24, 0.25f, 0.3f, width - f33, f33);
                                    float min4 = Math.min(f35, measuredHeight) - (((I25 * 22.0f) + 8.0f) * f16);
                                    lta ltaVar5 = this.E5;
                                    int J22 = J2(i40);
                                    int i44 = 0;
                                    while (true) {
                                        if (i44 < 7) {
                                            if (J22 <= iArr3[i44]) {
                                                i5 = i44;
                                                break;
                                            }
                                            i44++;
                                        } else {
                                            i5 = 7;
                                            break;
                                        }
                                    }
                                    ltaVar5.j(f33, f35, g2, min4, w3, w4, I28, f38, i5);
                                    lta ltaVar6 = this.E5;
                                    int i45 = ltaVar6.C;
                                    int i46 = ((i45 + s) - 1) % ltaVar6.b;
                                    ltaVar6.w[i46] = f5 * I27;
                                    ltaVar6.x[i46] = f4 * I27;
                                    i24 = i43 + 1;
                                    fArr2[i43] = (I28 * 0.95f) + f38;
                                    i38 = i4 + i2;
                                    i10 = i;
                                    max2 = i2;
                                    min3 = f3;
                                    i36 = i3;
                                }
                            }
                            i = i10;
                            i2 = max2;
                            f3 = min3;
                            i3 = i36;
                            i4 = i38;
                            i38 = i4 + i2;
                            i10 = i;
                            max2 = i2;
                            min3 = f3;
                            i36 = i3;
                        }
                        int i47 = max2;
                        i36 += i47;
                        i10 = i10;
                        i24 = i24;
                        max2 = i47;
                        min3 = min3;
                    }
                    if (i24 == 0) {
                        createBitmap.recycle();
                        return null;
                    }
                    Arrays.sort(fArr2, 0, i24);
                    int i48 = i24 - 1;
                    float f39 = i24;
                    this.L5 = fArr2[Math.min(i48, (int) (0.72f * f39))] * 1000.0f;
                    float f40 = fArr2[Math.min(i48, (int) (f39 * 0.95f))] * 1000.0f;
                    this.M5 = f40;
                    float f41 = this.L5;
                    this.N5 = (Math.max(60.0f, f40 - f41) * 0.7f) + f41;
                    this.F5 = createBitmap;
                    this.G5 = f30;
                    this.H5 = f27;
                    this.K5 = 0.0f;
                    this.O5 = true;
                    RecordCircle recordCircle3 = this.D2;
                    recordCircle3.P = true;
                    recordCircle3.invalidate();
                    wz1 wz1Var = this.b2;
                    wz1Var.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (!wz1Var.c && !wz1Var.e) {
                        if (wz1Var.f) {
                            f2 = wz1Var.a;
                        } else {
                            long j = wz1Var.H;
                            if (j < 0) {
                                j = uptimeMillis;
                            }
                            f2 = wz1.a(uptimeMillis - j);
                        }
                    } else {
                        f2 = 1.0f;
                    }
                    wz1Var.s = gm.R1(0.85f, 1.0f, f2) * gm.L(5.0f);
                    wz1Var.n = true;
                    if (wz1Var.G) {
                        uptimeMillis -= 240;
                    }
                    wz1Var.r = uptimeMillis;
                    wz1Var.y = 0.0f;
                    wz1Var.x = 0.0f;
                    wz1Var.w = 0.0f;
                    wz1Var.c = false;
                    wz1Var.d.stop();
                    wz1Var.g().O(true, 0.0f);
                    wz1Var.invalidate();
                    this.n = 0.0f;
                    this.h = 0.55f;
                    q2();
                    float f42 = this.M5 + 260.0f + 16.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f42);
                    ofFloat.setDuration(f42);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new kx1(this, this.b2, gm.L(3.0f) + gm.L(12.0f), this.D2));
                    ofFloat.addListener(new ey1(this));
                    return ofFloat;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final float b1(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.n7.f;
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
        return frameLayout.getHeight() - gm.L(44.0f);
    }

    public final void b2(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.b2(boolean):void");
    }

    @Override
    public final boolean c() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null && yv1Var.X7()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        l lVar = this.E2;
        ela elaVar = this.c2;
        if (lVar == null) {
            l lVar2 = new l(this, getContext());
            this.E2 = lVar2;
            lVar2.setVisibility(8);
            elaVar.addView(this.E2, qoe.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        elaVar.addView(this.D2, qoe.e(-1, -2, 80));
    }

    public final boolean c2() {
        ImageView imageView;
        if (this.O != null || (imageView = this.m2) == null || imageView.getVisibility() != 0 || oc7.d1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        hg5 hg5Var = new hg5(getContext(), 3);
        this.O = hg5Var;
        hg5Var.q(13.0f);
        setHintGlass(this.O);
        this.O.p(true);
        this.O.t(jb6.a0(null, null, 2131744107, no4.i(this.R, this.G3)));
        this.O.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        this.O.o(1.0f, -((getWidth() - gm.L(12.0f)) - ((this.m2.getMeasuredWidth() / 2.0f) + (this.m2.getX() + (this.f2.getX() + this.o2.getX())))));
        addView(this.O, qoe.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        hg5 hg5Var2 = this.O;
        hg5Var2.r0 = new mw1(this, (byte) 27);
        hg5Var2.d = 8000L;
        hg5Var2.v();
        oc7.d1().edit().putInt("channelsuggesthint2", oc7.d1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.addTextChangedListener(textWatcher);
            return;
        }
        ArrayList arrayList = this.g6;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g6 = arrayList;
        }
        arrayList.add(textWatcher);
    }

    public final void d0() {
        if (this.e1 == null && getContext() != null) {
            a6 a6Var = new a6(getContext(), (byte) 5);
            this.e1 = a6Var;
            a6Var.setClipChildren(false);
            this.e1.setVisibility(8);
            this.o2.addView(this.e1, qoe.c(44.0f, -1));
            this.e1.setOnTouchListener(new p8((byte) 28));
            a6 a6Var2 = this.e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.a2 = slideTextView;
            a6Var2.addView(slideTextView, qoe.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(gm.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            wz1 wz1Var = new wz1(this, getContext());
            this.b2 = wz1Var;
            linearLayout2.addView(wz1Var, qoe.t(28, 28, 16, 0, 0, 0, 0));
            this.b2.d(g0());
            this.b2.setOnClickListener(new rw1(this, (byte) 8));
            LinearLayout linearLayout3 = this.d;
            zz1 zz1Var = new zz1(this, getContext());
            this.Z0 = zz1Var;
            linearLayout3.addView(zz1Var, qoe.t(-1, -1, 16, 6, 0, 0, 0));
            this.e1.addView(this.d, qoe.e(-1, -1, 16));
        }
    }

    public final void d1() {
        long j;
        float audioLeft;
        float audioRight;
        l(false);
        glc glcVar = this.r1;
        if (glcVar != null) {
            glcVar.j("destroy", true);
            jlc jlcVar = glcVar.h;
            if (jlcVar != null) {
                gm.B2(jlcVar);
                glcVar.h = null;
            }
            ykc ykcVar = glcVar.K;
            if (ykcVar != null) {
                gm.B2(ykcVar);
                glcVar.K = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.T(this.q1);
        }
        un3 un3Var = this.j1;
        if (un3Var != null) {
            DictationAsr.T(un3Var.m0);
            un3Var.m();
            ap3 ap3Var = un3Var.F;
            if (ap3Var != null) {
                ap3Var.a();
            }
            va2 va2Var = un3Var.a0;
            if (va2Var != null) {
                va2Var.f = null;
            }
            gm.B2(un3Var.s);
            gm.B2(un3Var.w);
            this.j1 = null;
        }
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.T = true;
            ndc ndcVar = l49Var.n;
            if (ndcVar != null) {
                ndcVar.t0(false);
                l49Var.n.l0();
                l49Var.n = null;
            }
        }
        if (this.i1 != null && this.R3 != null) {
            hs6 d0 = hs6.d0(this.R);
            long j2 = this.G3;
            yv1 yv1Var = this.F3;
            if (yv1Var != null && yv1Var.x4) {
                j = yv1Var.d();
            } else {
                j = 0;
            }
            l49 l49Var2 = this.i1;
            if (l49Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = l49Var2.getAudioLeft();
            }
            float f = audioLeft;
            l49 l49Var3 = this.i1;
            if (l49Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = l49Var3.getAudioRight();
            }
            d0.d2(j2, j, f, audioRight);
        }
        this.O2 = true;
        nm7.f(this.R).n(this, nm7.l2);
        nm7.f(this.R).n(this, nm7.o2);
        nm7.f(this.R).n(this, nm7.p2);
        nm7.f(this.R).n(this, nm7.m2);
        nm7.f(this.R).n(this, nm7.Y5);
        nm7.f(this.R).n(this, nm7.c4);
        nm7.f(this.R).n(this, nm7.n2);
        nm7.f(this.R).n(this, nm7.k2);
        nm7.f(this.R).n(this, nm7.s);
        nm7.f(this.R).n(this, nm7.s2);
        nm7.f(this.R).n(this, nm7.u2);
        nm7.f(this.R).n(this, nm7.e2);
        nm7.f(this.R).n(this, nm7.z0);
        nm7.f(this.R).n(this, nm7.K);
        nm7.f(this.R).n(this, nm7.n1);
        nm7.f(this.R).n(this, nm7.t2);
        nm7.f(this.R).n(this, nm7.T2);
        nm7.f(this.R).n(this, nm7.a3);
        nm7.f(this.R).n(this, nm7.j5);
        nm7.f(this.R).n(this, nm7.S3);
        nm7.e().n(this, nm7.m4);
        jz1 jz1Var = this.V0;
        if (jz1Var != null) {
            jz1Var.z();
        }
        mw1 mw1Var = this.I0;
        if (mw1Var != null) {
            gm.r(mw1Var);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.g3 = null;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (this.m3 && !this.d1) {
            gm.c3(new m9(this.E3, (byte) 1));
        }
        ela elaVar = this.c2;
        if (elaVar != null) {
            elaVar.setDelegate(null);
        }
        hy1 hy1Var = this.r0;
        if (hy1Var != null) {
            hy1Var.e = false;
            hy1Var.dismiss();
        }
    }

    public final void d2() {
        e2(true, false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        by1 by1Var;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat L0;
        boolean z;
        float f;
        float f2;
        double d;
        byte[] bArr;
        tx1 tx1Var;
        b02 b02Var;
        int i3;
        long j;
        if (i == nm7.c4) {
            if (i2 == this.R) {
                i2();
                return;
            }
            return;
        }
        int i4 = 0;
        if (i == nm7.Y5) {
            if (i2 == this.R && objArr.length > 0) {
                long longValue = ((Long) objArr[0]).longValue();
                yv1 yv1Var = this.F3;
                if (yv1Var != null) {
                    j = yv1Var.a();
                } else {
                    j = this.G3;
                }
                if (longValue == j) {
                    j2();
                }
            }
        } else if (i == nm7.m4) {
            jz1 jz1Var = this.V0;
            if (jz1Var != null) {
                jz1Var.Q.h1();
            }
            gz1 gz1Var = this.x2;
            if (gz1Var != null) {
                ArrayList arrayList = gz1Var.n;
                while (i4 < arrayList.size()) {
                    ((mr0) arrayList.get(i4)).invalidate();
                    i4++;
                }
            }
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                sy1Var.postInvalidate();
                this.F0.q();
            }
        } else if (i == nm7.k2) {
            if (((Integer) objArr[0]).intValue() == this.w3) {
                if (this.m3 && !this.c4 && !c()) {
                    this.c4 = true;
                    oc7 r1 = oc7.r1(this.S.a);
                    long j2 = this.G3;
                    long threadMessageId = getThreadMessageId();
                    if (this.d1) {
                        i3 = 7;
                    } else {
                        i3 = 1;
                    }
                    r1.J4(i3, 0, j2, threadMessageId, null);
                }
                RecordCircle recordCircle = this.D2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i == nm7.s) {
            sy1 sy1Var2 = this.F0;
            if (sy1Var2 != null && sy1Var2.isFocused()) {
                gm.t1(this.F0);
            }
        } else {
            int i5 = nm7.m2;
            int i6 = nm7.n2;
            int i7 = 5;
            if (i != i5 && i != i6) {
                if (i == nm7.l2) {
                    if (((Integer) objArr[0]).intValue() == this.w3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.d1 = !booleanValue;
                        zx1 zx1Var = this.c1;
                        if (zx1Var != null) {
                            if (booleanValue) {
                                b02Var = b02.a;
                            } else {
                                b02Var = b02.b;
                            }
                            zx1Var.j(b02Var, true);
                        }
                        if (!this.v3) {
                            this.v3 = true;
                            w2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.D2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        zz1 zz1Var = this.Z0;
                        if (zz1Var != null) {
                            zz1Var.a(this.Y1);
                        }
                        wz1 wz1Var = this.b2;
                        if (wz1Var != null) {
                            wz1Var.e = false;
                        }
                    }
                } else if (i == nm7.o2) {
                    this.v3 = false;
                    this.R3 = null;
                    this.U3 = null;
                } else if (i == nm7.p2) {
                    this.R3 = null;
                    this.U3 = null;
                    zz1 zz1Var2 = this.Z0;
                    if (zz1Var2 != null) {
                        zz1Var2.a(this.Y1);
                    }
                    M(true);
                    this.v3 = true;
                    w2(0, true);
                } else if (i == nm7.s2) {
                    if (((Integer) objArr[0]).intValue() == this.w3) {
                        this.Y1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof rcc) {
                            rcc rccVar = (rcc) obj;
                            this.U3 = rccVar;
                            String str = (String) objArr[2];
                            this.S3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.Y1 = rccVar.r;
                            tec tecVar = this.g1;
                            if (tecVar != null) {
                                tecVar.setVideoPath(str);
                                this.g1.setKeyframes(arrayList2);
                                this.g1.setVisibility(0);
                                this.g1.setMinProgressDiff(1000.0f / ((float) this.U3.r));
                                V0();
                            }
                            w2(3, true);
                            M(false);
                            return;
                        }
                        this.R3 = (TLRPC.TL_document) obj;
                        this.S3 = (String) objArr[2];
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
                        if (this.R3 != null) {
                            a0();
                            if (this.f1 != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                tL_message.id = 0;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = z8c.h(this.R).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                tL_message.attachPath = this.S3;
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = this.R3;
                                tL_message.flags |= 768;
                                this.T3 = new k47(z8c.t0, tL_message, false, true);
                                this.f1.setAlpha(1.0f);
                                this.f1.setVisibility(0);
                                this.h1.setVisibility(0);
                                this.h1.setAlpha(0.0f);
                                this.h1.setScaleY(0.0f);
                                this.h1.setScaleX(0.0f);
                                int i8 = 0;
                                while (true) {
                                    if (i8 < this.R3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute = this.R3.attributes.get(i8);
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
                                    if (i9 < this.R3.attributes.size()) {
                                        TLRPC.DocumentAttribute documentAttribute2 = this.R3.attributes.get(i9);
                                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                            bArr = documentAttribute2.waveform;
                                            if (bArr == null || bArr.length == 0) {
                                                bArr = MediaController.getWaveform(this.S3);
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
                                if (z && (tx1Var = this.h2) != null) {
                                    this.l2 = 0.0f;
                                    tx1Var.setAlpha(0.0f);
                                    tx1Var.setScaleX(0.0f);
                                    tx1Var.setScaleY(0.0f);
                                }
                                this.Y1 = (long) (1000.0d * d);
                                l49 l49Var = this.i1;
                                String str2 = this.S3;
                                if (!l49Var.T) {
                                    l49Var.r = (float) d;
                                    l49Var.s = f;
                                    l49Var.w = f2;
                                    l49Var.x = false;
                                    l49Var.h.t(gm.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    l49Var.f.a(false, false);
                                    ndc ndcVar = l49Var.n;
                                    if (ndcVar == null) {
                                        ndcVar = new ndc();
                                        l49Var.n = ndcVar;
                                        ndcVar.K = new et8(l49Var, (byte) 2);
                                    }
                                    ndcVar.i0(Uri.fromFile(new File(str2)), "other");
                                    l49Var.i(false);
                                    l49Var.L = 0;
                                    l49Var.M = bArr;
                                    Bitmap bitmap = l49Var.T0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        l49Var.T0 = null;
                                    }
                                    l49Var.W0 = null;
                                    l49Var.X0 = false;
                                    l49Var.Q0 = -1;
                                    l49Var.J0.a();
                                    l49Var.I0.a();
                                    l49Var.invalidate();
                                }
                                M(false);
                                if (z) {
                                    c0();
                                    d0();
                                    a0();
                                    this.m3 = true;
                                    this.D2.f(false);
                                    RecordCircle recordCircle3 = this.D2;
                                    this.l4.getClass();
                                    recordCircle3.setControlsScale(1.0f);
                                    l lVar = this.E2;
                                    if (lVar != null) {
                                        lVar.setVisibility(0);
                                        this.E2.setAlpha(1.0f);
                                    }
                                }
                                w2(3, !z);
                                if (z && oc7.d1().getBoolean("design_voice_live_field", true) && !this.O2 && this.R3 != null) {
                                    A0().t();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        uz1 uz1Var = this.P3;
                        if (uz1Var != null) {
                            uz1Var.w(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i == nm7.u2) {
                    Activity activity = this.E3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i4 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i4);
                    }
                } else if (i == nm7.e2) {
                    Integer num = (Integer) objArr[0];
                    if (this.T3 != null && MediaController.w().D(this.T3)) {
                        k47 k47Var = MediaController.w().v0;
                        k47 k47Var2 = this.T3;
                        k47Var2.b0 = k47Var.b0;
                        k47Var2.i0 = k47Var.i0;
                    }
                } else if (i == nm7.z0) {
                    rx1 rx1Var = this.R0;
                    if (rx1Var != null) {
                        rx1Var.invalidate();
                    }
                } else if (i == nm7.K) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue2 = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue2 == this.G3 && (chatFull = this.T2) != null && chatFull.slowmode_seconds != 0 && !k47.f3(num2.intValue()) && (L0 = oc7.r1(this.S.a).L0(Long.valueOf(this.T2.id))) != null && !sd2.N(L0) && !sd2.h0(L0)) {
                            TLRPC.ChatFull chatFull2 = this.T2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.T2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i == nm7.n1) {
                    if (this.T2 != null) {
                        D2();
                    }
                } else if (i == nm7.t2) {
                    this.R3 = null;
                    this.U3 = null;
                    w2(4, true);
                } else if (i == nm7.T2) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue3 == this.G3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.j0 = tL_botMenuButton.text;
                            this.k0 = tL_botMenuButton.url;
                            this.x7 = 3;
                        } else if (!this.f3) {
                            this.x7 = 1;
                        } else {
                            this.x7 = 2;
                        }
                        m2(false);
                    }
                } else if (i == nm7.a3) {
                    t2(true);
                } else if (i == nm7.j5) {
                    if (this.t2 && (by1Var = this.K0) != null) {
                        by1Var.setLocked(!z8c.h(this.R).p());
                    }
                    l0();
                } else if (i == nm7.S3) {
                    l0();
                }
            } else if (((Integer) objArr[0]).intValue() == this.w3 && this.v3) {
                this.v3 = false;
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
                        w2(i7, true);
                        return;
                    }
                    return;
                }
                w2(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l49 l49Var;
        jz1 jz1Var = this.V0;
        if (jz1Var != null && jz1Var.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, gm.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (this.K1 && (l49Var = this.i1) != null && l49Var.getTrimProgress() > 0.0f) {
            int[] iArr = this.t5;
            getLocationInWindow(iArr);
            float f = iArr[1];
            w0(this, canvas, iArr[0], f, f, 100000.0f);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2 = this.w2;
        px1 px1Var = this.p2;
        if (view != view2 && view != px1Var) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.n7.f;
            canvas.save();
            if (view == px1Var) {
                canvas.clipRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
            }
            if (view == this.w2) {
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
    public final void e(TLRPC.Document document, String str, Object obj, g47 g47Var, boolean z, boolean z2, int i, int i2) {
        if (this.w7) {
            return;
        }
        nv1 nv1Var = this.L3;
        yv1 yv1Var = this.F3;
        if (nv1Var != null && yv1Var != null && nv1Var.f) {
            yv1Var.uc();
        } else if (c() && i == 0) {
            ik.J(this.E3, yv1Var.a(), new mx1(this, document, str, obj, g47Var, z), this.L4);
        } else {
            ik.X(this.R, this.G3, 1, new lw1(this, document, str, g47Var, z2, i, i2, obj, z));
        }
    }

    public final void e0() {
        if (this.z2 == null && this.F3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231502).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231503).mutate();
            int i = cmb.Ml;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            ylb ylbVar = this.L4;
            anb.x(this, mutate, i, ylbVar, mode);
            anb.x(this, mutate2, cmb.Zf, ylbVar, mode);
            sn2 sn2Var = new sn2(mutate, mutate2);
            cy1 cy1Var = new cy1(this, getContext());
            this.z2 = cy1Var;
            cy1Var.setImageDrawable(sn2Var);
            this.z2.setVisibility(8);
            this.z2.setContentDescription(jb6.M0(2131745582, null));
            this.z2.setScaleType(ImageView.ScaleType.CENTER);
            cy1 cy1Var2 = this.z2;
            int i2 = cmb.h6;
            anb.R(cy1Var2, cmb.f0(F0(i2), 1, -1), null, anb.M(i2), ylbVar);
            this.o2.addView(this.z2, 2, qoe.e(44, 44, 85));
            this.z2.setOnClickListener(new rw1(this, (byte) 5));
            this.z2.setTranslationX(0.0f);
        }
    }

    public final void e2(boolean z, boolean z2) {
        boolean z3;
        if (this.w2 != null && !this.V3 && getVisibility() == 0) {
            px1 px1Var = this.f1;
            if ((px1Var == null || px1Var.getVisibility() != 0) && !this.x3 && this.L3 == null && (this.d3 == null || this.P2 != null)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && z && z3 && !this.p3 && !R0()) {
                j1();
                gx1 gx1Var = this.W;
                if (gx1Var != null) {
                    gm.r(gx1Var);
                }
                gx1 gx1Var2 = new gx1(this, (byte) 12);
                this.W = gx1Var2;
                gm.d3(gx1Var2, 200L);
                return;
            }
            this.W3 = true;
            this.V3 = true;
            if (this.X3) {
                this.o7.a(true, z);
                if (z3) {
                    sy1 sy1Var = this.F0;
                    if (sy1Var != null) {
                        sy1Var.requestFocus();
                    }
                    j1();
                    return;
                }
                return;
            }
            return;
        }
        px1 px1Var2 = this.f1;
        if ((px1Var2 == null || px1Var2.getVisibility() != 0) && !this.x3 && this.L3 == null && this.J3 == null) {
            j1();
        }
    }

    public final void f0() {
        if (this.q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.a = imageReceiver;
            view.b = new pc0((ylb) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.e = paint;
            imageReceiver.q0(gm.L(28.0f));
            paint.setStrokeWidth(gm.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(jb6.a0("AccDescrSendAsPeer", null, 2131754774, ""));
            this.q0 = view;
            view.setOnClickListener(new rw1(this, (byte) 1));
            this.q0.setVisibility(8);
            this.o2.addView(this.q0, qoe.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final void f1() {
        this.Z2 = true;
        glc glcVar = this.r1;
        if (glcVar != null) {
            glcVar.j("chat paused", true);
        }
        if (g0() && this.v3) {
            k0();
        }
        hy1 hy1Var = this.r0;
        if (hy1Var != null) {
            hy1Var.e = false;
            hy1Var.dismiss();
        }
        if (this.p3) {
            this.b3 = true;
        }
        mw1 mw1Var = new mw1(this, (byte) 22);
        this.J6 = mw1Var;
        gm.d3(mw1Var, 500L);
    }

    public final void f2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Z4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(d53.h);
        ofFloat2.setDuration(250L);
        boolean z = gda.a;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        H2();
    }

    public final boolean g0() {
        if (this.l1) {
            if (!this.U2 || !this.d1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g1() {
        sy1 sy1Var;
        this.Z2 = false;
        if (oc7.d1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i = 0; i < 3; i++) {
                gm.d3(new mw1(this, (byte) 28), jArr[i]);
            }
        }
        mw1 mw1Var = this.J6;
        if (mw1Var != null) {
            gm.r(mw1Var);
            this.J6 = null;
        }
        if (!G0() || !y()) {
            getVisibility();
            if (this.b3 && !org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
                this.b3 = false;
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    uz1Var.W0();
                }
                if (this.H2 == 0 && (sy1Var = this.F0) != null) {
                    sy1Var.requestFocus();
                }
                gm.E3(this.F0);
                if (!gm.D && !this.p3 && !gm.E) {
                    this.a4 = true;
                    dy1 dy1Var = this.h4;
                    gm.r(dy1Var);
                    gm.d3(dy1Var, 100L);
                }
            }
        }
    }

    public final boolean g2() {
        TLRPC.EncryptedChat encryptedChat;
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            encryptedChat = yv1Var.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && gm.W0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    public gb getAdjustPanLayoutHelper() {
        return this.V;
    }

    public int getAnimatedTop() {
        return this.J2;
    }

    public ImageView getAttachButton() {
        return this.h2;
    }

    public View getAudioVideoButtonContainer() {
        return this.a1;
    }

    public int getBackgroundTop() {
        int top = getTop();
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            return top + this.w2.getLayoutParams().height;
        }
        return top;
    }

    public cw1 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.a = new Path();
            frameLayout.c = cmb.w0(null, cmb.Ei, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(gm.o());
            frameLayout.addView(textView, qoe.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(gm.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, qoe.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i = cmb.Gi;
            fg0 f0 = cmb.f0(cmb.w0(null, i, false), 2, -1);
            wmb M = anb.M(i);
            view.setBackground(f0);
            anb.j(view, f0, null, M, null);
            frameLayout.addView(view, qoe.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.l0 = frameLayout;
            frameLayout.setVisibility(8);
            T();
            this.l0.setBotMenuButton(this.m0);
            this.o2.addView(this.l0, qoe.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return 0;
        }
        return sy1Var.getSelectionStart();
    }

    public CharSequence getDraftMessage() {
        if (this.P2 != null) {
            if (!TextUtils.isEmpty(this.L2)) {
                return this.L2;
            }
            return null;
        } else if (this.F0 != null && H0()) {
            return this.F0.getText();
        } else {
            return null;
        }
    }

    @Override
    public float getEditFieldBottomOffset() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) sy1Var.getLayoutParams()).bottomMargin - gm.L(1.5f);
    }

    @Override
    public Editable getEditText() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return null;
        }
        return sy1Var.getText();
    }

    public k47 getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.W6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.q3;
    }

    public e34 getEmojiView() {
        return this.V0;
    }

    public float getExitTransition() {
        return this.b5;
    }

    @Override
    public CharSequence getFieldText() {
        if (this.F0 != null && H0()) {
            return this.F0.getText();
        }
        return null;
    }

    public int getHeightWithTopView() {
        int measuredHeight = getMeasuredHeight();
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            return (int) (measuredHeight - ((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height));
        }
        return measuredHeight;
    }

    public long getLineAnimationDelay() {
        return 0L;
    }

    public float getLockAnimatedTranslation() {
        return this.a5;
    }

    public int getMessagesCount() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.getMessagesCount():int");
    }

    public RecordCircle getRecordCircle() {
        return this.D2;
    }

    public long getRecordTimerStartTime() {
        zz1 zz1Var = this.Z0;
        if (zz1Var != null && zz1Var.a) {
            return zz1Var.d;
        }
        return 0L;
    }

    public k47 getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return gm.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sy1Var.getLayoutParams();
        int paddingTop = this.F0.getPaddingTop();
        return Math.max(gm.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + paddingTop + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return 0;
        }
        try {
            return sy1Var.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e) {
            fc4.g(e, true);
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

    public v67 getSendMessageSuggestionParams() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.k7();
        }
        return 0L;
    }

    public m6a getSenderSelectView() {
        return this.q0;
    }

    public ela getSizeNotifierLayout() {
        return this.c2;
    }

    public float getSlideToCancelProgress() {
        return this.Y4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((lka) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            return yv1Var.getMessagesController().L1(yv1Var.a());
        }
        return oc7.r1(this.R).L1(this.G3);
    }

    public Drawable getStickersArrowDrawable() {
        return this.v4;
    }

    public int getStickersExpandedHeight() {
        return this.t4;
    }

    public ImageView getSuggestButton() {
        return this.m2;
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {new SpannableStringBuilder(getEditText())};
        tL_textWithEntities.entities = hs6.d0(z8c.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.o7.e;
    }

    public float getTopViewHeight() {
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            return this.w2.getLayoutParams().height;
        }
        return 0.0f;
    }

    public float getTopViewTranslation() {
        View view = this.w2;
        if (view != null && view.getVisibility() != 8) {
            return this.w2.getTranslationY();
        }
        return 0.0f;
    }

    public p3c getTrendingStickersAlert() {
        return this.Q3;
    }

    public int getVisibleEmojiPadding() {
        if (this.X0) {
            return this.q3;
        }
        return 0;
    }

    public float getVisualHeight() {
        float f = this.J2;
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            f += (1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height;
        }
        return getMeasuredHeight() - f;
    }

    public final boolean h0(View view, float[] fArr) {
        if (view == null || view.getWidth() <= 0 || !(view.getParent() instanceof View)) {
            return false;
        }
        int[] iArr = this.H6;
        ((View) view.getParent()).getLocationInWindow(iArr);
        fArr[0] = (view.getWidth() / 2.0f) + view.getX() + iArr[0];
        fArr[1] = (view.getHeight() / 2.0f) + view.getY() + iArr[1];
        return true;
    }

    public final boolean h1(android.view.View r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.h1(android.view.View):boolean");
    }

    public final void h2() {
        int i;
        if (this.F0 != null) {
            if (O0() && !this.Q6) {
                i = 38;
            } else {
                i = 0;
            }
            int L = gm.L(1.5f + i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
            if (layoutParams.bottomMargin != L) {
                layoutParams.bottomMargin = L;
                this.F0.setLayoutParams(layoutParams);
            }
            mi9 mi9Var = this.s2;
            if (mi9Var != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) mi9Var.getLayoutParams();
                if (layoutParams2.bottomMargin != L) {
                    layoutParams2.bottomMargin = L;
                    this.s2.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i0() {
        int i;
        a6 a6Var = this.e1;
        if (a6Var != null && (a6Var.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e1.getLayoutParams();
            if (g0()) {
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

    public final void i1() {
        int height = this.c2.getHeight();
        if (!this.p3) {
            height -= this.q3;
        }
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            uz1Var.v1(height);
        }
        if (this.w2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gm.L(72.0f);
            boolean z = this.X3;
            fn0 fn0Var = this.o7;
            if (height < currentActionBarHeight) {
                if (z) {
                    this.X3 = false;
                    if (this.W3) {
                        fn0Var.a(false, false);
                    }
                }
            } else if (!z) {
                this.X3 = true;
                if (this.W3) {
                    fn0Var.a(true, false);
                }
            }
        }
    }

    public final void i2() {
        px1 px1Var;
        boolean z;
        TL_agent.settings settingsVar;
        if (this.F0 != null && (px1Var = this.o2) != null) {
            mc c = mc.c(this.R);
            long j = this.G3;
            if (j > 0 && c.f(j) && !c.e) {
                c.h();
            }
            int i = this.R;
            long j2 = this.G3;
            int i2 = tc.h;
            mc c2 = mc.c(i);
            boolean z2 = true;
            if (j2 > 0 && c2.f(j2) && (settingsVar = c2.d) != null && !TextUtils.isEmpty(settingsVar.active_provider)) {
                z = true;
            } else {
                z = false;
            }
            int i3 = 8;
            if (z && this.K6 == null) {
                tc tcVar = new tc(getContext(), this.R, this.F3, this.L4);
                this.K6 = tcVar;
                tcVar.setVisibility(8);
                px1Var.addView(this.K6, qoe.d(-1, 44.0f, 83, 52.0f, 0.0f, 0.0f, 0.0f));
            }
            tc tcVar2 = this.K6;
            if (tcVar2 != null) {
                if (tcVar2.getVisibility() != 0) {
                    z2 = false;
                }
                if (z2 != z) {
                    tc tcVar3 = this.K6;
                    if (z) {
                        i3 = 0;
                    }
                    tcVar3.setVisibility(i3);
                    cc ccVar = this.P6;
                    if (z) {
                        V1(false);
                        b2(false);
                        getViewTreeObserver().addOnPreDrawListener(ccVar);
                    } else {
                        getViewTreeObserver().removeOnPreDrawListener(ccVar);
                    }
                    s2(this.T6);
                    requestLayout();
                }
            }
            h2();
        }
    }

    public final void j(TLRPC.Document document) {
        hs6.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        jz1 jz1Var = this.V0;
        if (jz1Var != null && document != null) {
            boolean isEmpty = jz1Var.j1.isEmpty();
            jz1Var.X();
            if (isEmpty) {
                jz1Var.Y(false);
            }
        }
    }

    public final void j0() {
        RecordCircle recordCircle;
        if (!this.v3 && ((recordCircle = this.D2) == null || !ChatActivityEnterView.this.h5)) {
            return;
        }
        this.v3 = false;
        this.Y1 = 0L;
        this.D1 = true;
        try {
            w2(2, true);
            this.D1 = false;
            gm.d3(new gx1(this, (byte) 11), 120L);
        } catch (Throwable th) {
            this.D1 = false;
            throw th;
        }
    }

    public void j1() {
        if ((!G0() || !y()) && !org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                uz1Var.W0();
            }
            sy1 sy1Var = this.F0;
            if (sy1Var != null && !gm.E3(sy1Var)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void j2() {
        long j;
        boolean z;
        by1 by1Var = this.K0;
        if (by1Var != null) {
            int i = this.R;
            yv1 yv1Var = this.F3;
            if (yv1Var != null) {
                j = yv1Var.a();
            } else {
                j = this.G3;
            }
            if (fd.b(i, j) != null) {
                z = true;
            } else {
                z = false;
            }
            dd ddVar = this.m6;
            if (ddVar == null) {
                if (z) {
                    ddVar = new dd(by1Var);
                    this.m6 = ddVar;
                    by1Var.h0 = ddVar;
                    by1Var.i0 = this;
                } else {
                    return;
                }
            }
            if (ddVar.b != z) {
                ddVar.b = z;
                ddVar.a.invalidate();
            }
            if (z) {
                y0();
            }
        }
    }

    public final void k(TLRPC.Document document) {
        X();
        jz1 jz1Var = this.V0;
        int i = jz1Var.d1;
        hs6.d0(i).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = jz1Var.k1.isEmpty();
        jz1Var.k1 = hs6.d0(i).j0(0, true);
        w24 w24Var = jz1Var.z0;
        if (w24Var != null) {
            w24Var.f();
        }
        if (isEmpty) {
            jz1Var.Y(false);
        }
    }

    public final void k0() {
        m0(false, false);
        un3 un3Var = this.j1;
        if (un3Var != null && un3Var.o0 && un3Var.r == 1) {
            un3Var.u();
        }
        sy1 sy1Var = this.F0;
        if (sy1Var != null && sy1Var.length() > 0) {
            ox1 ox1Var = this.O4;
            ox1Var.getClass();
            ChatActivityEnterView chatActivityEnterView = ox1Var.b;
            float f = 1.0f;
            chatActivityEnterView.h = 1.0f;
            chatActivityEnterView.q2();
            if (this.B0) {
                f = 0.5f;
            }
            ox1 ox1Var2 = this.Q4;
            ox1Var2.getClass();
            ChatActivityEnterView chatActivityEnterView2 = ox1Var2.b;
            chatActivityEnterView2.n = f;
            chatActivityEnterView2.q2();
        }
        j0();
        rx1 rx1Var = this.R0;
        if (rx1Var != null) {
            rx1Var.invalidate();
        }
    }

    public final void k1() {
        int i;
        if (!G0() || !y()) {
            yv1 yv1Var = this.F3;
            if (!org.telegram.ui.ActionBar.d.hasSheets(yv1Var)) {
                if (!gm.D && !gm.E && ((yv1Var == null || !yv1Var.isInBubbleMode()) && !this.Z2)) {
                    i = 2;
                } else {
                    i = 0;
                }
                Z1(i, 0, true, true);
                uz1 uz1Var = this.P3;
                if (uz1Var != null) {
                    uz1Var.W0();
                }
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    sy1Var.requestFocus();
                }
                gm.E3(this.F0);
                if (this.Z2) {
                    this.b3 = true;
                } else if (!gm.D && !this.p3 && !gm.E) {
                    if (yv1Var == null || !yv1Var.isInBubbleMode()) {
                        this.a4 = true;
                        jz1 jz1Var = this.V0;
                        if (jz1Var != null) {
                            jz1Var.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        dy1 dy1Var = this.h4;
                        gm.r(dy1Var);
                        gm.d3(dy1Var, 100L);
                    }
                }
            }
        }
    }

    public final void k2() {
        float f;
        tx1 tx1Var = this.h2;
        if (tx1Var == null) {
            return;
        }
        float f2 = this.E + this.y;
        by1 by1Var = this.K0;
        if (by1Var != null) {
            f = by1Var.getAlpha() * (-b10.c(56.0f, by1Var.l(), 0));
        } else {
            f = 0.0f;
        }
        tx1Var.setTranslationX(f2 + f);
    }

    public final void l(boolean z) {
        yv1 yv1Var;
        if (this.o6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.o6, true);
            this.o6 = -1;
        }
        dy1 dy1Var = this.r6;
        if (dy1Var != null) {
            gm.r(dy1Var);
            this.r6 = null;
        }
        this.p6 = false;
        dd ddVar = this.m6;
        if (ddVar != null) {
            ddVar.c(false);
        }
        m();
        if (z && (yv1Var = this.F3) != null) {
            c41.b0(yv1Var).Q(2131624012, 36, "Couldn't rewrite the message. It wasn't sent.").j();
        }
    }

    public final void l0() {
        boolean z;
        if (this.k1 && !this.O2 && !this.v3) {
            un3 un3Var = this.j1;
            if (un3Var == null || !un3Var.o()) {
                if (this.A0 && !this.w7 && zfe.a(getContext())) {
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

    public final void l1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.l1():void");
    }

    public final void l2() {
        int i;
        k2();
        qmb qmbVar = this.f2;
        if (qmbVar != null) {
            qmbVar.setTranslationX(this.E + this.y);
            qmbVar.setAlpha(this.F * this.G);
            if (qmbVar.getAlpha() > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            qmbVar.setVisibility(i);
            tx1 tx1Var = this.h2;
            if (tx1Var != null && this.Z5) {
                tx1Var.setAlpha(this.l2 * this.G);
            }
        }
        cy1 cy1Var = this.z2;
        if (cy1Var != null) {
            cy1Var.setTranslationX(cy1Var.a);
        }
    }

    public final void m() {
        dd ddVar = this.m6;
        if (ddVar != null && ddVar.d) {
            ddVar.d = false;
            ddVar.a.invalidate();
        }
        if (this.w6) {
            this.w6 = false;
            this.F1 = false;
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                sy1Var.invalidate();
            }
        }
    }

    public final void m0(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.B6;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B6 = null;
        }
        this.z6 = z;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null && this.v3 && z) {
            recordCircle.setAmplitude(0.0d);
        }
        float f = 0.0f;
        if (!z2) {
            if (z) {
                f = 1.0f;
            }
            this.A6 = f;
            l lVar = this.E2;
            if (lVar != null) {
                lVar.invalidate();
            }
            RecordCircle recordCircle2 = this.D2;
            if (recordCircle2 != null) {
                recordCircle2.invalidate();
                return;
            }
            return;
        }
        float f2 = this.A6;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.B6 = ofFloat;
        ofFloat.addUpdateListener(new bx1(this, (byte) 8));
        this.B6.setDuration(220L);
        this.B6.setInterpolator(d53.g);
        this.B6.start();
    }

    public final void m1(CharSequence charSequence, CharSequence charSequence2, String str) {
        yv1 yv1Var;
        if (this.F0 != null && (yv1Var = this.F3) != null) {
            oc7.r1(this.R);
            boolean z = e21.a;
            jf9 jf9Var = new jf9(str);
            jf9Var.h = charSequence;
            jf9Var.n = charSequence2;
            jf9Var.setResourceProvider(this.L4);
            jf9Var.K = yv1Var;
            jf9Var.s = yv1Var.U;
            jf9Var.w = yv1Var.a0;
            jf9Var.M = new mw1(this, (byte) 6);
            jf9Var.L = new mw1(this, (byte) 7);
            yv1Var.presentFragment(jf9Var);
        }
    }

    public final void m2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.m2(boolean):void");
    }

    public final ValueAnimator n(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z2.a, f);
        ofFloat.addUpdateListener(new bx1(this, (byte) 5));
        return ofFloat;
    }

    public final boolean n0() {
        un3 un3Var;
        sy1 sy1Var;
        if (!this.D6) {
            if (this.l1 && (un3Var = this.j1) != null && un3Var.p() && !this.v3) {
                if ((!this.j1.q() || this.j1.r == 2) && (sy1Var = this.F0) != null && sy1Var.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void n1() {
        mw1 mw1Var = new mw1(this, (byte) 2);
        if (!ewe.b(this.R, this.G3) && !oc7.r1(this.R).S3.contains(Long.valueOf(this.G3))) {
            ik.n(this.F3, oc7.r1(this.R).W1(Long.valueOf(this.G3)), new uj1(this, mw1Var, (byte) 25), new mw1(this, (byte) 3));
            return;
        }
        mw1Var.run();
    }

    public final void n2() {
        int c;
        u46 u46Var;
        int K0;
        View m;
        float f;
        py1 py1Var = this.n0;
        if (py1Var != null) {
            int childCount = py1Var.c.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n0.c.getChildAt(i2);
                if (i2 < 4) {
                    i += childAt.getMeasuredHeight();
                }
            }
            ela elaVar = this.c2;
            if (i > 0) {
                int measuredHeight = (elaVar.getMeasuredHeight() - i) - gm.L(8.0f);
                if (childCount > 4) {
                    f = 12.0f;
                } else {
                    f = 0.0f;
                }
                c = b10.c(f, measuredHeight, 0);
            } else if (this.o0.c.size() > 4) {
                c = b10.c(162.8f, elaVar.getMeasuredHeight(), 0);
            } else {
                c = b10.c((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, elaVar.getMeasuredHeight(), 0);
            }
            if (this.n0.c.getPaddingTop() != c) {
                this.n0.c.setTopGlowOffset(c);
                if (this.d7 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (K0 = (u46Var = (u46) this.n0.c.getLayoutManager()).K0()) >= 0 && (m = u46Var.m(K0)) != null) {
                    this.d7 = K0;
                    this.e7 = m.getTop() - this.n0.c.getPaddingTop();
                }
                this.n0.c.setPadding(0, c, 0, gm.L(8.0f));
            }
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
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof xz1) && SystemClock.uptimeMillis() > this.I1) {
            xz1 xz1Var = (xz1) getSendButtonInternal();
            xz1Var.p0.e(true, 0.0f);
            xz1Var.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ChatActivityEnterView.z7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getSendButtonInternal().setAlpha(gm.R1(alpha, f, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(gm.R1(scaleX, f2, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(gm.R1(scaleY, f3, floatValue));
            }
        });
        return ofFloat;
    }

    public final boolean o0() {
        un3 un3Var;
        if (this.l1 && (un3Var = this.j1) != null && un3Var.p()) {
            return true;
        }
        return false;
    }

    public final boolean o1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void o2(boolean z) {
        if (this.x7 != 1 && this.G3 > 0) {
            T();
        }
        eq0 eq0Var = this.m0;
        if (eq0Var != null) {
            eq0Var.setWebView(G0());
        }
        m2(z);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hy1 hy1Var = this.r0;
        if (hy1Var != null) {
            hy1Var.e = false;
            hy1Var.dismiss();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        u0(canvas, true);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View X;
        if (this.v3) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0 && (X = gm.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            I0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        py1 py1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (this.d7 != -1 && (py1Var = this.n0) != null) {
            u46 u46Var = (u46) py1Var.c.getLayoutManager();
            if (u46Var != null) {
                u46Var.g1(this.d7, this.e7);
            }
            this.d7 = -1;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        px1 px1Var = this.p2;
        int measuredHeight = px1Var.getMeasuredHeight();
        eq0 eq0Var = this.m0;
        ImageView imageView2 = this.S0;
        rx1 rx1Var = this.R0;
        if (eq0Var != null && eq0Var.getTag() != null) {
            this.m0.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams();
            int L = gm.L(10.0f);
            eq0 eq0Var2 = this.m0;
            if (eq0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = eq0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = gm.L(10.0f);
                eq0 eq0Var3 = this.m0;
                if (eq0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = eq0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) sy1Var.getLayoutParams();
                int L3 = gm.L(57.0f);
                eq0 eq0Var4 = this.m0;
                if (eq0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = eq0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            mi9 mi9Var = this.s2;
            if (mi9Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) mi9Var.getLayoutParams();
                int L4 = gm.L(57.0f);
                eq0 eq0Var5 = this.m0;
                if (eq0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = eq0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            m6a m6aVar = this.q0;
            if (m6aVar != null && m6aVar.getVisibility() == 0) {
                int i3 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams()).leftMargin = gm.L(7.0f) + i3;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = gm.L(7.0f) + i3;
                }
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) sy1Var2.getLayoutParams()).leftMargin = gm.L(54.0f) + i3;
                }
                mi9 mi9Var2 = this.s2;
                if (mi9Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) mi9Var2.getLayoutParams()).leftMargin = gm.L(54.0f) + i3;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams()).leftMargin = gm.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = gm.L(3.0f);
                }
                sy1 sy1Var3 = this.F0;
                if (sy1Var3 != null) {
                    ((ViewGroup.MarginLayoutParams) sy1Var3.getLayoutParams()).leftMargin = gm.L(50.0f);
                }
                mi9 mi9Var3 = this.s2;
                if (mi9Var3 != null) {
                    ((ViewGroup.MarginLayoutParams) mi9Var3.getLayoutParams()).leftMargin = gm.L(50.0f);
                }
            }
        }
        if (O0() && !this.Q6) {
            ((ViewGroup.MarginLayoutParams) this.K6.getLayoutParams()).leftMargin = gm.L(48.0f) + ((ViewGroup.MarginLayoutParams) rx1Var.getLayoutParams()).leftMargin;
            sy1 sy1Var4 = this.F0;
            if (sy1Var4 != null) {
                ((ViewGroup.MarginLayoutParams) sy1Var4.getLayoutParams()).leftMargin = gm.L(14.0f);
            }
            mi9 mi9Var4 = this.s2;
            if (mi9Var4 != null) {
                ((ViewGroup.MarginLayoutParams) mi9Var4.getLayoutParams()).leftMargin = gm.L(6.0f);
            }
        }
        n2();
        super.onMeasure(i, i2);
        cw1 cw1Var = this.l0;
        if (cw1Var != null) {
            eq0 eq0Var6 = this.m0;
            if (eq0Var6 != null) {
                cw1Var.setMeasuredButtonWidth(eq0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - gm.L(2.0f);
            measureChild(this.l0, i, i2);
        }
        O();
        P();
        if (measuredHeight > 0 && px1Var.getMeasuredHeight() != measuredHeight) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (i4 == 0) {
                    imageView = this.j2;
                } else {
                    imageView = this.k2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + px1Var.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(d53.h).setDuration(420L).start();
            }
            hg5 hg5Var = this.N;
            if (hg5Var != null) {
                hg5Var.setTranslationY((hg5Var.getTranslationY() + px1Var.getMeasuredHeight()) - measuredHeight);
                wi8.t(this.N.animate().translationY(0.0f), d53.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.p4) {
            R1(0, false);
            this.V0.r(false);
            S1(false, false, false, true);
        }
        tec tecVar = this.g1;
        if (tecVar != null) {
            ArrayList arrayList = tecVar.w;
            if (tecVar.O.isEmpty()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            qec qecVar = tecVar.x;
            if (qecVar != null) {
                qecVar.cancel(true);
                tecVar.x = null;
            }
            tecVar.invalidate();
        }
    }

    public final void p() {
        float min;
        float i;
        s09 s09Var;
        s09 s09Var2;
        s09 s09Var3 = this.h1;
        if (s09Var3 != null && s09Var3.getAnimatedDrawable() == this.z5) {
            float f = this.D5;
            if (f < 0.72f) {
                float f2 = this.C5;
                min = ((f / 0.72f) * 22.0f * f2) + (8.0f * f2);
            } else {
                min = (Math.min(1.0f, (f - 0.72f) / 0.22999996f) * 14.0f) + 30.0f;
            }
            this.h1.setProgress(min / 52.0f);
            if (this.h1 != null) {
                float f3 = this.D5;
                if (f3 < 0.72f) {
                    i = this.C5;
                } else {
                    i = 1.0f - Utilities.i((f3 - 0.72f) / 0.22999996f, 1.0f, 0.0f);
                }
                float f4 = (3.0f - (i * 2.0f)) * i * i * 12.0f;
                float L = gm.L(12.0f);
                this.h1.setPivotX(s09Var.getWidth() / 2.0f);
                this.h1.setPivotY((s09Var2.getHeight() / 2.0f) + L);
                this.h1.setRotation(f4);
                if (this.i1 != null) {
                    double radians = Math.toRadians(f4);
                    float L2 = L + gm.L(3.0f);
                    l49 l49Var = this.i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    lta ltaVar = l49Var.J0;
                    ltaVar.R = sin;
                    ltaVar.S = cos;
                    l49Var.invalidate();
                }
            }
        }
    }

    public final void p0() {
        float f;
        va2 C0;
        int[] iArr;
        int[] iArr2;
        if (this.E2 != null) {
            if (g0() && this.v3) {
                RectF rectF = this.H4;
                if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (C0 = C0()) != null) {
                    this.E2.getLocationInWindow(this.u7);
                    C0.getLocationInWindow(this.v7);
                    f = Math.min(0.0f, (((C0.getInputBubbleTop() + iArr2[1]) - gm.L(8.0f)) - gm.L(18.0f)) - (rectF.centerY() + (((iArr[1] - this.E2.getTranslationY()) + this.R5) + this.S5)));
                    if (Math.abs(f - this.t7) >= 0.5f && (f != 0.0f || this.t7 == 0.0f)) {
                        return;
                    }
                    this.t7 = f;
                    this.E2.setTranslationY(this.R5 + this.S5 + f);
                }
            }
            f = 0.0f;
            if (Math.abs(f - this.t7) >= 0.5f) {
            }
            this.t7 = f;
            this.E2.setTranslationY(this.R5 + this.S5 + f);
        }
    }

    public boolean p1() {
        return true;
    }

    public final void p2() {
        boolean z;
        sy1 sy1Var = this.F0;
        boolean z2 = false;
        if (sy1Var != null && sy1Var.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z = true;
        } else {
            z = false;
        }
        V1(z);
        sy1 sy1Var2 = this.F0;
        if (sy1Var2 != null && sy1Var2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z2 = true;
        }
        b2(z2);
    }

    public final boolean q0() {
        if (r0() && !this.l1) {
            if (!yze.a() || !oc7.d1().getBoolean("design_voice_live_field", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q1(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                gw3.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i + charSequence.length());
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q2() {
        float f;
        float f2 = (1.0f - this.A1) * this.y1;
        if (f2 > 0.0f) {
            f = gm.R1(1.0f, 0.6f, f2);
        } else {
            f = 1.0f;
        }
        rx1 rx1Var = this.R0;
        rx1Var.setScaleX(this.r * this.h * f);
        rx1Var.setScaleY(this.r * this.h * f);
        rx1Var.setAlpha((1.0f - f2) * this.s * this.n);
    }

    public final void r(boolean z) {
        boolean z2;
        int i;
        int i2;
        float f;
        float f2;
        int L;
        int i3;
        p09 p09Var;
        boolean z3;
        if (!this.d1 && this.i1 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Q5 = z2;
        boolean z4 = this.K1;
        jd jdVar = this.X1;
        if (z4 == z2) {
            if (z2) {
                if (this.T1 != null) {
                    U1(false, false);
                    N1(z);
                    gm.r(jdVar);
                    gm.d3(jdVar, 700L);
                    return;
                }
            } else {
                return;
            }
        }
        this.K1 = z2;
        this.i1.setNewStyle(z2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = gm.L(32.0f);
        int i4 = 83;
        if (z2) {
            i = 83;
        } else {
            i = 19;
        }
        layoutParams.gravity = i;
        if (z2) {
            i2 = gm.L(6.0f);
        } else {
            i2 = 0;
        }
        layoutParams.bottomMargin = i2;
        if (z2) {
            f = 45.0f;
        } else {
            f = 44.0f;
        }
        layoutParams.leftMargin = gm.L(f);
        if (z2) {
            f2 = 5.0f;
        } else {
            f2 = 4.0f;
        }
        layoutParams.rightMargin = gm.L(f2);
        this.i1.setLayoutParams(layoutParams);
        s09 s09Var = this.h1;
        if (s09Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) s09Var.getLayoutParams();
            if (!z2) {
                i4 = 51;
            }
            layoutParams2.gravity = i4;
            this.h1.setLayoutParams(layoutParams2);
            if (z2) {
                if (this.z5 == null) {
                    p09 p09Var2 = new p09(2131623977, gm.L(28.0f), gm.L(28.0f), false, null);
                    this.z5 = p09Var2;
                    p09Var2.E(true);
                }
                p09Var = this.z5;
            } else {
                p09Var = this.A5;
            }
            if (p09Var != null && this.h1.getAnimatedDrawable() != p09Var) {
                this.h1.setAnimation(p09Var);
                if (p09Var != this.z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                p09Var.p0 = z3;
                x2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        if (z2) {
            L = -2;
        } else {
            L = gm.L(44.0f);
        }
        layoutParams3.height = L;
        this.f1.setLayoutParams(layoutParams3);
        px1 px1Var = this.f1;
        if (z2) {
            i3 = gm.L(44.0f);
        } else {
            i3 = 0;
        }
        px1Var.setMinimumHeight(i3);
        if (z2) {
            this.i1.setNewStyleDelegate(new gy1(this));
            if (this.T1 == null) {
                olc olcVar = new olc(getContext(), this.L4, new vx1(this, (byte) 1));
                this.T1 = olcVar;
                this.f1.addView(olcVar, qoe.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            U1(false, false);
            N1(z);
            gm.r(jdVar);
            gm.d3(jdVar, 700L);
            return;
        }
        N1(false);
        this.i1.setNewStyleDelegate(null);
        olc olcVar2 = this.T1;
        if (olcVar2 != null) {
            this.f1.removeView(olcVar2);
            this.T1 = null;
        }
    }

    public final boolean r0() {
        if (DictationAsr.E() && this.F3 != null && this.F0 != null) {
            if ((!this.U2 || !this.d1) && this.z0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r1() {
        S1(false, true, false, true);
        Z1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.v3 = false;
        zx1 zx1Var = this.c1;
        if (zx1Var != null) {
            zx1Var.setVisibility(0);
        }
        this.a3 = true;
        V0();
        C();
        M0();
        l lVar = this.E2;
        if (lVar != null) {
            lVar.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }

    public final void r2(boolean z) {
        boolean z2;
        long j;
        int i;
        boolean z3;
        boolean z4;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        k47 k47Var;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a0;
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            CharSequence charSequence = this.e;
            boolean z5 = true;
            boolean z6 = false;
            if (charSequence != null) {
                sy1Var.r(charSequence, z);
                sy1 sy1Var2 = this.F0;
                String str3 = this.f;
                hu3 hu3Var = sy1Var2.v0;
                if (hu3Var != null) {
                    if (!jb6.a0 && z) {
                        z6 = true;
                    }
                    hu3Var.t(str3, z6, true);
                }
            } else if (!this.A0 && !Q0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d ".concat(jb6.M0(2131746954, "PlainTextRestrictedHint")));
                spannableStringBuilder.setSpan(new pn2(2131232249, 0), 1, 2, 0);
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
                C2();
                yv1 yv1Var = this.F3;
                if (yv1Var != null && yv1Var.g4 == 8 && yv1Var.i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (yv1Var != null) {
                    j = yv1Var.getMessagesController().L1(yv1Var.a());
                } else {
                    j = 0;
                }
                if (j > 0) {
                    j *= getMessagesCount();
                }
                if (yv1Var != null) {
                    i = yv1Var.g4;
                } else {
                    i = -1;
                }
                if (i == 9) {
                    this.F0.setHintText(jb6.M0(2131742558, null));
                } else if (i == 5) {
                    if ("hello".equalsIgnoreCase(yv1Var.f4)) {
                        this.F0.setHintText(jb6.M0(2131752720, null));
                        return;
                    }
                    boolean equalsIgnoreCase = "away".equalsIgnoreCase(yv1Var.f4);
                    sy1 sy1Var3 = this.F0;
                    if (equalsIgnoreCase) {
                        sy1Var3.setHintText(jb6.M0(2131752789, null));
                    } else {
                        sy1Var3.setHintText(jb6.M0(2131752625, null));
                    }
                } else {
                    pn2[] pn2VarArr = this.S6;
                    if (z2) {
                        if (j > 0) {
                            a0 = nxa.T0(jb6.a0(null, null, 2131744088, jb6.E((int) j, ','), pn2VarArr));
                        } else {
                            a0 = jb6.a0(null, null, 2131744089, new Object[0]);
                        }
                        this.F0.setHintText(a0);
                        pn2 pn2Var = pn2VarArr[0];
                        if (pn2Var != null) {
                            pn2Var.H = 0.9f;
                        }
                    } else if (this.R2 != null) {
                        this.F0.setHintText(jb6.M0(2131752659, null));
                    } else {
                        k47 k47Var2 = this.J3;
                        if (k47Var2 != null && (replyMarkup2 = k47Var2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.J3.k.reply_markup.placeholder, z);
                        } else if (this.P2 != null) {
                            sy1 sy1Var4 = this.F0;
                            if (this.Q2) {
                                M0 = jb6.M0(2131752514, null);
                            } else {
                                M0 = jb6.M0(2131743615, null);
                            }
                            sy1Var4.setHintText(M0);
                        } else if (j > 0) {
                            this.F0.setHintText(nxa.Z0(false, jb6.a0(null, null, 2131743613, jb6.E((int) j, ',')), pn2VarArr));
                            pn2 pn2Var2 = pn2VarArr[0];
                            if (pn2Var2 != null) {
                                pn2Var2.H = 0.9f;
                            }
                        } else if (this.Y0 && (k47Var = this.c3) != null && (replyMarkup = k47Var.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.c3.k.reply_markup.placeholder, z);
                        } else if (yv1Var != null && yv1Var.V7()) {
                            k47 k47Var3 = this.K3;
                            if (k47Var3 != null && (tL_forumTopic = k47Var3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(jb6.a0(null, null, 2131743612, str2), z);
                                return;
                            }
                            TLRPC.TL_forumTopic f = oc7.r1(this.R).g4.f(yv1Var.e.id, 1L);
                            if (f != null && (str = f.title) != null) {
                                this.F0.r(jb6.a0(null, null, 2131743612, str), z);
                            } else {
                                this.F0.r(jb6.M0(2131743615, null), z);
                            }
                        } else {
                            if (pg3.y(this.G3)) {
                                TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
                                TLRPC.ChatFull M02 = oc7.r1(this.S.a).M0(-this.G3);
                                z4 = sd2.V(L0);
                                if (!z4 && sd2.M(L0, M02, false) == (-this.G3)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                                z4 = false;
                            }
                            if (z3) {
                                this.F0.setHintText(jb6.M0(2131745372, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User W1 = oc7.r1(this.S.a).W1(Long.valueOf(this.G3));
                            if (W1 != null && W1.bot_forum_view && !W1.bot_forum_can_manage_topics && yv1Var != null && !yv1Var.x4) {
                                this.F0.setHintText(jb6.M0(2131745367, null));
                            } else if (yv1Var != null && yv1Var.j8() && !yv1Var.x4) {
                                if (yv1Var.m4 == null || !yv1Var.v4) {
                                    z5 = false;
                                }
                                sy1 sy1Var5 = this.F0;
                                if (z5) {
                                    sy1Var5.setHintText(jb6.M0(2131751942, null));
                                } else {
                                    sy1Var5.setHintText(jb6.M0(2131745996, "Reply"));
                                }
                            } else if (z4) {
                                boolean z8 = this.W2;
                                sy1 sy1Var6 = this.F0;
                                if (z8) {
                                    sy1Var6.r(jb6.M0(2131752229, "ChannelSilentBroadcast"), z);
                                } else {
                                    sy1Var6.r(jb6.M0(2131752393, "ChannelBroadcast"), z);
                                }
                            } else {
                                this.F0.setHintText(jb6.M0(2131743615, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void s(float f) {
        float f2;
        float i = Utilities.i((f - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        this.n = L2(0.12f, 0.6f, f) * f2;
        float i2 = Utilities.i(i, 1.0f, 0.0f) - 1.0f;
        this.h = gm.R1(0.55f, 1.0f, b10.w(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
        q2();
        this.R0.setRotation((1.0f - d53.h.getInterpolation(i)) * (-20.0f));
    }

    public final boolean s0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, k47 k47Var, k47 k47Var2, br1 br1Var) {
        yv1 yv1Var;
        int i;
        TLRPC.User W1;
        int i2 = 0;
        if (keyboardButtonProto != null && k47Var2 != null && ((yv1Var = this.F3) == null || yv1Var.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) kfb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            l3a l3aVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                gm.g(tL_inlineButtonTypeCopy.copy_text);
                c41.b0(yv1Var).i(jb6.a0(null, null, 2131750821, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    y5a b = y5a.b(tL_keyboardButton.text, this.G3, k47Var, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (yv1Var != null) {
                        l3aVar = yv1Var.X6();
                    }
                    b.K = l3aVar;
                    b.O = this.W6;
                    this.W6 = 0L;
                    this.K0.setEffect(0L);
                    a6a.B(this.R).q0(b);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (l11.A(tL_inlineButtonTypeUrl.url)) {
                    l11.s(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, br1Var);
                    return true;
                }
                ik.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, br1Var, null, this.L4);
                return true;
            } else if (kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                yv1Var.Rb(2, k47Var2);
                return true;
            } else if (kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) kfb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                yv1Var.ma();
                e51 e51Var = yv1Var.Y1;
                if (e51Var != null) {
                    e51Var.P2 = false;
                    e51Var.u3.setVisibility(8);
                    e51Var.C1(false, bool);
                    return false;
                }
            } else if (kfb.b(keyboardButtonProto)) {
                TLRPC.Message message = k47Var2.k;
                long j = message.via_bot_id;
                if (j == 0) {
                    j = message.from_id.user_id;
                }
                long j2 = j;
                hz1 hz1Var = new hz1(this, k47Var2, j2, keyboardButtonProto, k47Var, oc7.r1(this.R).W1(Long.valueOf(j)));
                if (!ewe.b(this.R, j2) && !oc7.r1(this.R).S3.contains(Long.valueOf(j2))) {
                    ik.n(yv1Var, oc7.r1(this.R).W1(Long.valueOf(this.G3)), new of2(this, hz1Var, j2, (byte) 16), null);
                    return true;
                }
                hz1Var.run();
                return true;
            } else if (kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = jb6.M0(2131745157, "ShareYouLocationTitle");
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131745159, "ShareYouLocationInfo");
                alertDialog$Builder.j(jb6.M0(2131747564, "OK"), new jf(this, k47Var2, keyboardButtonProto, (byte) 17));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                yv1Var.showDialog(heVar);
                return true;
            } else if (!kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!yv1Var.Ua(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = k47Var2.k;
                            long j3 = message2.from_id.user_id;
                            long j4 = message2.via_bot_id;
                            if (j4 != 0) {
                                j3 = j4;
                            }
                            TLRPC.User W12 = oc7.r1(this.S.a).W1(Long.valueOf(j3));
                            if (W12 != null) {
                                setFieldText("@" + m9c.p(W12) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle j5 = td4.j(1, "onlySelect", "dialogsType", true);
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
                            nk3 nk3Var = new nk3(j5);
                            nk3Var.E2 = new jf(this, k47Var2, tL_inlineButtonTypeSwitchInline, (byte) 18);
                            yv1Var.presentFragment(nk3Var);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (oc7.r1(this.R).W1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        yv1Var.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && k47Var2.k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                W1 = getParentFragment().h();
                            } else {
                                W1 = oc7.r1(this.R).W1(Long.valueOf(this.G3));
                            }
                            TLRPC.User user = W1;
                            if (user != null) {
                                l13.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new jv0(this, k47Var2, tL_buttonTypeRequestPeer, user), this.L4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            ow1 ow1Var = new ow1(this, k47Var2, tL_buttonTypeRequestPeer);
                            ji7 ji7Var = ji7.p2;
                            org.telegram.ui.ActionBar.d Q = LaunchActivity.Q();
                            if (Q == null || ji7.p2 != null) {
                                return false;
                            }
                            ji7 ji7Var2 = new ji7(Q, i, bool2, bool3, ow1Var);
                            ji7Var2.show();
                            ji7.p2 = ji7Var2;
                            return false;
                        } else {
                            Bundle j6 = td4.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = k47Var2.k;
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
                                fc4.g(e, true);
                            }
                            nk3 nk3Var2 = new nk3(j6);
                            nk3Var2.E2 = new ow1(this, k47Var2, tL_buttonTypeRequestPeer);
                            yv1Var.presentFragment(nk3Var2);
                            return false;
                        }
                    } else {
                        fc4.d("button.peer_type is null");
                    }
                }
                return true;
            } else {
                a6a.B(this.R).m0(true, k47Var2, keyboardButtonProto, null, null, yv1Var);
                return true;
            }
        }
        return false;
    }

    public final void s1() {
        if (this.K1 || this.T1 != null) {
            gm.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            olc olcVar = this.T1;
            if (olcVar != null) {
                if (olcVar.c.hasFocus()) {
                    gm.t1(this.T1.c);
                    this.T1.c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.Q5 = false;
            N1(false);
            u(0.0f);
            l49 l49Var = this.i1;
            if (l49Var != null) {
                l49Var.setVisibility(8);
            }
            s09 s09Var = this.h1;
            if (s09Var != null) {
                s09Var.setVisibility(0);
            }
            l lVar = this.E2;
            if (lVar != null) {
                this.R5 = 0.0f;
                lVar.setTranslationY(this.S5 + this.t7);
            }
            by1 by1Var = this.K0;
            if (by1Var != null) {
                by1Var.setIconDimmed(false);
            }
        }
    }

    public final void s2(int i) {
        ImageView imageView;
        cy1 cy1Var;
        int L;
        cy1 cy1Var2;
        tx1 tx1Var;
        View view;
        int L2;
        a aVar;
        int[] iArr;
        int[] iArr2;
        this.T6 = i;
        if (this.F0 != null) {
            k47 k47Var = this.P2;
            if (k47Var == null || k47Var.o5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.Z5;
                by1 by1Var = this.K0;
                float f = 50.0f;
                int i3 = 0;
                if (z && this.w7) {
                    if (!this.k5) {
                        f = 2.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, by1Var.l() - gm.L(44.0f)) + gm.L(f);
                } else if ((i == 1 || i == 2) && !o0()) {
                    tx1 tx1Var2 = this.n2;
                    if (tx1Var2 != null && tx1Var2.getVisibility() == 0 && (cy1Var2 = this.z2) != null && cy1Var2.getVisibility() == 0 && (tx1Var = this.h2) != null && tx1Var.getVisibility() == 0) {
                        L = gm.L(146.0f);
                        layoutParams.rightMargin = L;
                    } else {
                        tx1 tx1Var3 = this.n2;
                        if ((tx1Var3 != null && tx1Var3.getVisibility() == 0) || (((imageView = this.y2) != null && imageView.getVisibility() == 0) || ((cy1Var = this.z2) != null && cy1Var.getTag() != null))) {
                            L = gm.L(98.0f);
                            layoutParams.rightMargin = L;
                        } else {
                            L = gm.L(50.0f);
                            layoutParams.rightMargin = L;
                        }
                    }
                    if (this.k5) {
                        layoutParams.rightMargin = gm.L(48.0f) + L;
                    }
                } else {
                    cy1 cy1Var3 = this.z2;
                    if (cy1Var3 != null && cy1Var3.getTag() != null) {
                        layoutParams.rightMargin = gm.L(50.0f);
                    } else {
                        layoutParams.rightMargin = gm.L(2.0f);
                    }
                }
                if (o0() || (g0() && this.v3)) {
                    sy1 sy1Var = this.F0;
                    if (sy1Var == null) {
                        view = null;
                    } else {
                        view = (View) sy1Var.getParent();
                    }
                    if (view != null && view.getWidth() != 0 && (aVar = this.a1) != null && aVar.getWidth() != 0) {
                        view.getLocationInWindow(new int[2]);
                        aVar.getLocationInWindow(new int[2]);
                        L2 = Math.max(gm.L(2.0f), Math.round((view.getWidth() + iArr[0]) - ((((aVar.getWidth() / 2.0f) + (iArr2[0] - aVar.getTranslationX())) - gm.N(41.0f)) - gm.L(8.0f))));
                    } else {
                        L2 = gm.L(28.0f);
                    }
                    layoutParams.rightMargin = L2;
                }
                if (O0()) {
                    layoutParams.rightMargin = gm.L(14.0f) - gm.L(44.0f);
                } else {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, by1Var.l() - gm.L(44.0f)));
                    by1 by1Var2 = this.v2;
                    if (by1Var2 != null && by1Var2.getVisibility() == 0) {
                        layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.v2.l() - gm.L(44.0f)));
                    }
                }
                if (i2 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                px1 px1Var = this.f1;
                if (px1Var != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) px1Var.getLayoutParams();
                    if (this.P2 == null) {
                        i3 = b10.c(44.0f, by1Var.l(), 0);
                    }
                    layoutParams2.rightMargin = i3;
                    this.f1.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.V = gbVar;
    }

    public void setAnimatedTop(int i) {
        this.J2 = i;
    }

    public void setBotInfo(vh6 vh6Var) {
        B1(vh6Var, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.R0.setTranslationX(f);
        if (this.F0 != null) {
            this.H = f;
            u2();
        }
        this.h2.setTranslationX(this.E + this.y + f);
        this.c1.setTranslationX(f);
        tx1 tx1Var = this.n2;
        if (tx1Var != null) {
            tx1Var.setTranslationX(f);
        }
    }

    public void setButtons(k47 k47Var) {
        D1(k47Var, true, true);
    }

    public void setCaption(String str) {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setCaption(str);
            M(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z;
        this.T2 = chatFull;
        jz1 jz1Var = this.V0;
        if (jz1Var != null) {
            jz1Var.setChatInfo(chatFull);
        }
        yz1 yz1Var = this.G0;
        if (yz1Var != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z = true;
            } else {
                z = false;
            }
            yz1Var.b = z;
            yz1Var.invalidate();
        }
        if (sd2.i0(chatFull)) {
            return;
        }
        setSlowModeTimer(chatFull.slowmode_next_send_date);
    }

    public void setComposeShadowAlpha(float f) {
        this.b6 = f;
        invalidate();
    }

    public void setCustomWindowView(View view) {
        this.i6 = view;
        this.F0.setWindowView(view);
    }

    public void setDelegate(uz1 uz1Var) {
        this.P3 = uz1Var;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        r2(false);
        if (this.R2 != null) {
            W(true);
            this.v2.setOnClickListener(new rw1(this, (byte) 6));
            TextPaint textPaint = null;
            this.v2.setContentDescription(jb6.M0(2131751291, null));
            this.v2.setVisibility(0);
            this.v2.setScaleX(0.1f);
            this.v2.setScaleY(0.1f);
            this.v2.setAlpha(0.0f);
            this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(d53.f).start();
            this.d0 = oc7.r1(this.S.a).s1();
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                textPaint = sy1Var.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(gm.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.R2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(q(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.S2 = A();
            z1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            qmb qmbVar = this.f2;
            if (qmbVar != null) {
                qmbVar.setVisibility(8);
            }
            tx1 tx1Var = this.h2;
            if (tx1Var != null) {
                this.l2 = 0.0f;
                tx1Var.setAlpha(0.0f);
                tx1Var.setScaleX(0.5f);
                tx1Var.setScaleY(0.5f);
            }
            this.q2.setVisibility(8);
            cy1 cy1Var = this.z2;
            if (cy1Var != null) {
                cy1Var.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.W6 = j;
        by1 by1Var = this.K0;
        if (by1Var != null) {
            by1Var.setEffect(j);
        }
    }

    public void setExitTransition(float f) {
        this.b5 = f;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setFieldFocused(boolean z) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            if (z && org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
                z = false;
            }
            if (z) {
                if (this.H2 == 0 && !this.F0.isFocused()) {
                    mw1 mw1Var = new mw1(this, (byte) 19);
                    this.I2 = mw1Var;
                    gm.d3(mw1Var, 600L);
                    return;
                }
                return;
            }
            sy1 sy1Var = this.F0;
            if (sy1Var != null && sy1Var.isFocused()) {
                if (!this.p3 || this.Z2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        J1(charSequence, false);
    }

    public void setInAppInsetsController(c0d c0dVar) {
        this.l7 = c0dVar;
    }

    public void setLockAnimatedTranslation(float f) {
        this.a5 = f;
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setOnSendButtonLongClick(View.OnLongClickListener onLongClickListener) {
        if (onLongClickListener == null) {
            onLongClickListener = new hx1(this, (byte) 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        O1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.w = z;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.s2 == null) {
            return;
        }
        oc7.r1(this.R);
        boolean z = e21.a;
        this.u2 = richMessage;
        y2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z) {
        if (this.Z1 != z) {
            this.Z1 = z;
            zz1 zz1Var = this.Z0;
            if (zz1Var != null) {
                zz1Var.setExternalFrameClock(z);
            }
            wz1 wz1Var = this.b2;
            if (wz1Var != null) {
                wz1Var.f = z;
                System.currentTimeMillis();
                wz1Var.h = -1L;
                wz1Var.invalidate();
            }
            SlideTextView slideTextView = this.a2;
            if (slideTextView != null) {
                slideTextView.H = z;
                System.currentTimeMillis();
                slideTextView.invalidate();
            }
        }
    }

    public void setSelection(int i) {
        sy1 sy1Var = this.F0;
        if (sy1Var == null) {
            return;
        }
        sy1Var.setSelection(i, sy1Var.length());
    }

    public void setSideButtonsForAttach(q02 q02Var) {
        qmb qmbVar;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        q02 q02Var2 = this.m7;
        if (q02Var2 != q02Var) {
            if (q02Var2 != null) {
                q02Var2.e(0, false, true);
            }
            this.m7 = q02Var;
            tx1 tx1Var = this.h2;
            if (tx1Var != null && (qmbVar = this.f2) != null && qmbVar.getVisibility() != 0) {
                if (q02Var != null && P0()) {
                    z = true;
                } else {
                    z = false;
                }
                if (q02Var != null && !z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (q02Var != null) {
                    if (z && !F2()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    q02Var.e(0, z3, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = tx1Var.animate();
                float f3 = 1.0f;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.l2 = f;
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
                ViewPropertyAnimator duration = scaleX.scaleY(f3).setInterpolator(d53.h).setDuration(320L);
                this.g2 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f) {
        this.Y4 = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > gm.L(140.0f)) {
            measuredWidth = gm.L(140.0f);
        }
        this.i5 = (int) ((1.0f - this.Y4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i) {
        this.H0 = i;
        D2();
    }

    public void setSnapAnimationProgress(float f) {
        this.c5 = f;
        invalidate();
    }

    public void setTextTransitionIsRunning(boolean z) {
        this.i0 = z;
        this.q2.invalidate();
    }

    public void setViewParentForEmoji(ViewGroup viewGroup) {
        this.d2 = viewGroup;
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
        this.h6 = z;
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setEnabled(z);
        }
    }

    public void setVoiceDraft(cs6 cs6Var) {
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (cs6Var != null) {
            boolean z = cs6Var.g;
            this.P = z;
            l lVar = this.E2;
            if (lVar != null) {
                lVar.E.d(1, z, true);
            }
            uz1 uz1Var = this.P3;
            if (uz1Var != null) {
                storyItem = uz1Var.C0();
            } else {
                storyItem = null;
            }
            MediaController w = MediaController.w();
            int i = this.R;
            long j = this.G3;
            k47 k47Var = this.J3;
            k47 threadMessage = getThreadMessage();
            l3a l3aVar = null;
            int i2 = this.w3;
            yv1 yv1Var = this.F3;
            if (yv1Var != null) {
                l3aVar = yv1Var.X6();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            v67 sendMessageSuggestionParams = getSendMessageSuggestionParams();
            mp3 mp3Var = w.N1;
            if (w.I1) {
                u30 u30Var = w.G1;
                if (u30Var != null && u30Var.e() && w.g1 != null && (file = w.k1) != null && (str = cs6Var.a) != null && str.equals(file.getAbsolutePath())) {
                    w.h1 = i2;
                    w.r1 = k47Var;
                    w.s1 = threadMessage;
                    w.t1 = storyItem;
                    w.u1 = l3aVar;
                    w.p1 = sendMonoForumPeerId;
                    w.q1 = sendMessageSuggestionParams;
                    nm7.f(w.i1).k(nm7.o2, new Object[0]);
                    nm7.f(w.i1).k(nm7.s2, Integer.valueOf(w.h1), w.g1, w.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(cs6Var.h), Float.valueOf(cs6Var.i));
                    return;
                } else if (!w.W()) {
                    return;
                }
            }
            w.y0 = false;
            w.X(true);
            mp3Var.a(w.M1);
            mp3Var.c(new an6(w, i2, cs6Var, i, j, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, k47Var, storyItem));
        }
    }

    public final void t(y5a y5aVar) {
        uz1 uz1Var = this.P3;
        if (uz1Var != null) {
            y5aVar.H = uz1Var.C0();
            y5aVar.J = this.P3.J();
        }
    }

    public final void t0() {
        CharSequence textToUse;
        o47 o47Var;
        v67 b;
        TLRPC.Chat chat;
        int i;
        v67 b2;
        k47 k47Var = this.P2;
        if (k47Var != null) {
            boolean o5 = k47Var.o5();
            yv1 yv1Var = this.F3;
            if (o5 && !sd2.z(this.R, 24, k47.B0(this.P2.k))) {
                if (yv1Var == null || (b2 = yv1Var.y5) == null) {
                    b2 = v67.b(this.P2.k.suggested_post);
                }
                if (!jva.Q(this.R, b2.a)) {
                    if (yv1Var != null) {
                        yv1Var.wc(b2);
                        return;
                    }
                    return;
                }
            }
            if (this.d0 - this.e0 < 0) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    gm.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!oc7.r1(this.R).H3() && oc7.r1(this.R).l4.h1.f() > this.e0) {
                    W1();
                    return;
                }
                return;
            }
            if (this.H2 != 0) {
                R1(0, true);
                this.V0.r(false);
                if (this.p4) {
                    S1(false, true, false, true);
                    this.b4 = true;
                    gm.d3(new mw1(this, (byte) 0), 200L);
                }
            }
            sy1 sy1Var = this.F0;
            if (sy1Var == null) {
                textToUse = "";
            } else {
                textToUse = sy1Var.getTextToUse();
            }
            k47 k47Var2 = this.P2;
            if (k47Var2 == null || k47Var2.D != 19) {
                textToUse = gm.m1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.P2.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    gm.A3(-3.0f, this.F0, null);
                    xx0.APP_ERROR.a();
                    return;
                }
            }
            ArrayList Y = hs6.d0(this.R).Y(charSequenceArr, g2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.k.entities.isEmpty() || (this.P2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                k47 k47Var3 = this.P2;
                k47Var3.y1 = charSequenceArr[0];
                k47Var3.z1 = Y;
                k47Var3.A1 = this.O3;
                if (yv1Var != null && (chat = yv1Var.e) != null && (((i = k47Var3.D) == 0 || i == 19) && !sd2.m(chat))) {
                    k47 k47Var4 = this.P2;
                    k47Var4.A1 = false;
                    TLRPC.Message message = k47Var4.k;
                    message.flags &= -513;
                    message.media = null;
                } else if (yv1Var != null && (o47Var = yv1Var.x5) != null) {
                    if (yv1Var.Y5 instanceof TLRPC.TL_webPagePending) {
                        k47 k47Var5 = this.P2;
                        k47Var5.A1 = false;
                        int i2 = k47Var5.D;
                        if (i2 == 0 || i2 == 19) {
                            k47Var5.k.media = new TLRPC.TL_messageMediaEmpty();
                            this.P2.k.flags |= 512;
                        }
                    } else {
                        TLRPC.WebPage webPage = o47Var.v;
                        k47 k47Var6 = this.P2;
                        if (webPage != null) {
                            k47Var6.A1 = false;
                            TLRPC.Message message2 = k47Var6.k;
                            message2.flags |= 512;
                            message2.media = new TLRPC.TL_messageMediaWebPage();
                            this.P2.k.media.webpage = yv1Var.x5.v;
                        } else {
                            k47Var6.A1 = false;
                            int i3 = k47Var6.D;
                            if (i3 == 0 || i3 == 19) {
                                TLRPC.Message message3 = k47Var6.k;
                                message3.flags |= 512;
                                message3.media = new TLRPC.TL_messageMediaEmpty();
                            }
                        }
                    }
                    TLRPC.Message message4 = this.P2.k;
                    o47 o47Var2 = yv1Var.x5;
                    message4.invert_media = o47Var2.r;
                    if (o47Var2.o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = o47Var2.q;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = !z;
                        }
                    }
                } else {
                    k47 k47Var7 = this.P2;
                    k47Var7.A1 = false;
                    int i4 = k47Var7.D;
                    if (i4 == 0 || i4 == 19) {
                        TLRPC.Message message5 = k47Var7.k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.P2.o5()) {
                    y5a a = y5a.a(k47.B0(this.P2.k), this.P2.y1.toString());
                    if (yv1Var == null || (b = yv1Var.y5) == null) {
                        b = v67.b(this.P2.k.suggested_post);
                    }
                    a.T = b;
                    a.R = pg3.n(this.P2.k.saved_peer_id);
                    a.G = this.P2.t2();
                    k47 k47Var8 = this.P2;
                    a.r = k47Var8;
                    a.D = k47Var8;
                    boolean z2 = k47Var8.F0() instanceof TLRPC.TL_document;
                    k47 k47Var9 = this.P2;
                    if (z2) {
                        a.g = (TLRPC.TL_document) k47Var9.F0();
                        a.b = a.a;
                        a.a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = k47Var9.k.media;
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
                    a6a.B(this.R).q0(a);
                } else {
                    a6a B = a6a.B(this.R);
                    k47 k47Var10 = this.P2;
                    B.s(k47Var10, null, null, null, null, null, null, null, false, k47Var10.t2(), null);
                }
            }
            G1(null, null, false);
        }
    }

    public final void t1() {
        long j;
        int i;
        l49 l49Var = this.i1;
        if (l49Var != null) {
            l49Var.setPlaying(false);
        }
        if (this.U3 != null) {
            uz1 uz1Var = this.P3;
            if (this.P) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            uz1Var.F1(2, 0, i, this.W6, 0L, true);
            this.W6 = 0L;
            this.K0.setEffect(0L);
        } else {
            k47 k47Var = MediaController.w().v0;
            if (k47Var != null && k47Var == this.T3) {
                MediaController.w().l(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (e21.a) {
                hg9.r(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.w().i(true);
        hs6 d0 = hs6.d0(this.R);
        long j2 = this.G3;
        yv1 yv1Var = this.F3;
        if (yv1Var != null && yv1Var.x4) {
            j = yv1Var.d();
        } else {
            j = 0;
        }
        d0.D1(j2, j, null);
        MediaController.w().A0(0, 0, false, false);
        this.Y1 = 0L;
        L0(false);
        M(true);
    }

    public final void t2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.t2(boolean):void");
    }

    public final void u(float f) {
        l49 l49Var;
        int i;
        this.V1 = f;
        l49 l49Var2 = this.i1;
        int i2 = 0;
        if (l49Var2 != null) {
            l49Var2.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f)));
            float R1 = gm.R1(1.0f, 0.94f, f);
            this.i1.setPivotX(gm.L(17.0f));
            this.i1.setPivotY(l49Var.getHeight() / 2.0f);
            this.i1.setScaleX(R1);
            this.i1.setScaleY(R1);
            this.i1.setTranslationX((-gm.L(20.0f)) * f);
            l49 l49Var3 = this.i1;
            if (f >= 1.0f) {
                i = 4;
            } else {
                i = 0;
            }
            l49Var3.setVisibility(i);
        }
        olc olcVar = this.T1;
        if (olcVar != null) {
            olcVar.setModeProgress(f);
            olc olcVar2 = this.T1;
            if (f <= 0.0f) {
                i2 = 8;
            }
            olcVar2.setVisibility(i2);
        }
    }

    public final void u0(Canvas canvas, boolean z) {
        Paint paint;
        if (!this.X5) {
            return;
        }
        int A = (int) td4.A(1.0f, this.b6, cmb.h3.getIntrinsicHeight(), this.J2);
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            A = (int) (((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + A);
        }
        int intrinsicHeight = cmb.h3.getIntrinsicHeight() + A;
        if (z) {
            cmb.h3.setAlpha((int) (this.b6 * 255.0f));
            cmb.h3.setBounds(0, A, getMeasuredWidth(), intrinsicHeight);
            cmb.h3.draw(canvas);
        }
        if (this.W5) {
            int F0 = F0(cmb.Ie);
            Paint paint2 = this.a6;
            paint2.setColor(F0);
            if (gda.f() && this.c2 != null) {
                this.c6.set(0, intrinsicHeight, getWidth(), getHeight());
                this.c2.H(canvas, getTop(), this.c6, paint2, false);
                return;
            }
            canvas.drawRect(0.0f, intrinsicHeight, getWidth(), getHeight(), paint2);
            return;
        }
        float f = intrinsicHeight;
        float width = getWidth();
        float height = getHeight();
        ylb ylbVar = this.L4;
        if (ylbVar != null) {
            paint = ylbVar.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = cmb.T0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f, width, height, paint);
    }

    public final void u1(TL_iv.RichMessage richMessage) {
        yv1 yv1Var = this.F3;
        if (yv1Var != null) {
            hs6.d0(this.R).T1(yv1Var.a(), yv1Var.O5(yv1Var.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void u2() {
        sy1 sy1Var = this.F0;
        if (sy1Var != null) {
            sy1Var.setTranslationX(this.I + this.H);
        }
    }

    @Override
    public final void updateColors() {
        int i;
        TextPaint textPaint;
        int i2;
        ylb ylbVar = this.L4;
        try {
            sy1 sy1Var = this.F0;
            if (sy1Var != null) {
                anb.l(sy1Var, 34, cmb.Le, ylbVar);
                anb.v(this.F0, cmb.Me, ylbVar);
                anb.y(this.F0, cmb.lg, ylbVar);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(F0(cmb.Rf));
            }
            yz1 yz1Var = this.G0;
            if (yz1Var != null) {
                ((lka) yz1Var.c).setTextColor(F0(cmb.Ml));
                yz1Var.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(F0(cmb.Ml));
                animatedArrowDrawable.invalidateSelf();
            }
            by1 by1Var = this.K0;
            if (by1Var != null && this.L0 != 0 && by1Var.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !X0()) {
                    i2 = cmb.Ml;
                } else {
                    i2 = cmb.Oe;
                }
                int F0 = F0(i2);
                if (F0 != this.L0) {
                    this.L0 = F0;
                    cmb.F1(by1Var.getBackground(), Color.argb(24, Color.red(F0), Color.green(F0), Color.blue(F0)), true);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        un3 un3Var = this.j1;
        if (un3Var != null) {
            un3Var.L();
        }
        x2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        wz1 wz1Var = this.b2;
        if (wz1Var != null) {
            wz1Var.f();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        zz1 zz1Var = this.Z0;
        if (zz1Var != null && (textPaint = zz1Var.G) != null) {
            textPaint.setColor(zz1Var.J.F0(cmb.F6));
        }
        tec tecVar = this.g1;
        if (tecVar != null) {
            tecVar.e.setColor(cmb.w0(null, cmb.Z6, false));
            tecVar.M = 0;
            rec recVar = tecVar.Q;
            if (recVar != null) {
                recVar.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(F0(cmb.o7));
            } else {
                numberTextView.setTextColor(F0(cmb.x6));
            }
        }
        F0(cmb.Sf);
        py1 py1Var = this.n0;
        if (py1Var != null) {
            py1Var.d.setColor(cmb.w0(null, cmb.yj, false));
            im0 im0Var = py1Var.r;
            if (im0Var != null) {
                im0Var.updateColors();
            }
            py1Var.invalidate();
        }
        gz1 gz1Var = this.x2;
        if (gz1Var != null) {
            gz1Var.d();
        }
        if (this.b1) {
            i = F0(cmb.Ml);
        } else {
            i = -1;
        }
        zx1 zx1Var = this.c1;
        if (zx1Var != null && (!this.Z6 || i != this.X6)) {
            this.Z6 = true;
            this.X6 = i;
            zx1Var.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        int F02 = F0(cmb.h6);
        if (!this.a7 || F02 != this.Y6) {
            this.a7 = true;
            this.Y6 = F02;
            rx1 rx1Var = this.R0;
            if (rx1Var != null) {
                rx1Var.setBackground(cmb.f0(F02, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = gm.L(1.0f);
                int L2 = gm.L(3.0f);
                imageView.setBackground(cmb.W(gm.L(19.0f), F02, L, L2, L, L2));
            }
        }
    }

    public boolean v() {
        return false;
    }

    public final boolean v0(Canvas canvas, iac iacVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float d = this.j7.d(this.F0.canScrollVertically(-1));
        float d2 = this.k7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) iacVar.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gm.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + gm.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) iacVar.run()).booleanValue();
        canvas.save();
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.h7;
        Paint paint = this.g7;
        Matrix matrix = this.i7;
        if (i > 0) {
            RectF rectF = gm.P;
            f3 = 255.0f;
            f4 = 16.0f;
            f = 0.0f;
            f2 = 5.0f;
            rectF.set(this.F0.getX() - gm.L(5.0f), (this.F0.getY() + this.J2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gm.L(5.0f), this.F0.getY() + this.J2 + gm.L(13.0f));
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
            RectF rectF2 = gm.P;
            rectF2.set(this.F0.getX() - gm.L(f2), (this.F0.getY() + this.F0.getMeasuredHeight()) - gm.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + gm.L(f2), this.F0.getY() + this.F0.getMeasuredHeight() + gm.L(2.0f) + 1.0f);
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

    public final void v1(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        gw3.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        gn[] gnVarArr = (gn[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), gn.class);
        if (gnVarArr != null) {
            for (gn gnVar : gnVarArr) {
                gnVar.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), vm.f());
            }
        }
        f09.a(spannableStringBuilder2);
        Q();
        setFieldText(spannableStringBuilder2);
        x1(z, i, i2, 0L, true);
    }

    public final void v2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        float f;
        jz1 jz1Var;
        this.B0 = false;
        boolean z8 = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        float f2 = 1.0f;
        if (chat != null) {
            if (!sd2.v(chat) && (!sd2.s(chat) || !this.U2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.b1 = z5;
            this.b = sd2.t(chat);
            boolean q = sd2.q(chat);
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
            q2();
            if (!this.B0 && (jz1Var = this.V0) != null) {
                jz1Var.J(-this.G3, !this.A0, !this.b);
            }
            this.y0 = sd2.s(chat);
            this.z0 = sd2.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            if (chat != null) {
                if (!sd2.v(chat)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = userFull.voice_messages_forbidden;
            }
            this.k1 = z;
            if (chat != null && sd2.s(chat) && this.U2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.o1 = z2;
        }
        if (this.k1 && this.A0 && !this.w7 && zfe.a(getContext())) {
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
        i0();
        if (this.k1 && !this.m1) {
            this.m1 = true;
            DictationAsr.i(this.q1);
            if (!jo3.h()) {
                jo3.j();
            }
        }
        if (this.b1) {
            f2 = 0.5f;
        }
        a aVar = this.a1;
        aVar.setAlpha(f2);
        aVar.invalidate();
        if (this.b1) {
            i = F0(cmb.Ml);
        } else {
            i = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        zx1 zx1Var = this.c1;
        zx1Var.setColorFilter(porterDuffColorFilter);
        zx1Var.invalidate();
        r2(false);
        boolean z9 = this.d1;
        if (!this.y0 && z9) {
            z9 = false;
        }
        if (this.l1 && this.o1) {
            z9 = oc7.d1().getBoolean("currentModeVideo", false);
        }
        if (!this.z0 && !z9 && !this.l1) {
            if (!this.U2) {
                z8 = false;
            }
        } else {
            z8 = z9;
        }
        if (this.l1 && !this.o1) {
            z8 = false;
        }
        P1(z8, false);
        wz1 wz1Var = this.b2;
        if (wz1Var != null) {
            wz1Var.d(g0());
        }
        zx1Var.invalidate();
    }

    public final void w() {
        if (this.V0.getParent() == null) {
            c0d c0dVar = this.l7;
            ViewGroup viewGroup = this.d2;
            jz1 jz1Var = this.V0;
            if (c0dVar == null) {
                viewGroup.addView(jz1Var);
            } else {
                viewGroup.addView(jz1Var, qoe.c(-1.0f, -1));
            }
        }
    }

    public final void w0(FrameLayout frameLayout, Canvas canvas, float f, float f2, float f3, float f4) {
        float f5;
        int[] iArr;
        boolean z;
        im0 im0Var;
        im0 im0Var2;
        float f6;
        float f7;
        l49 l49Var = this.i1;
        if (l49Var != null && this.K1) {
            f5 = l49Var.getTrimProgress();
        } else {
            f5 = 0.0f;
        }
        if (f5 > 0.0f && this.i1.getVisibility() == 0) {
            l49 l49Var2 = this.i1;
            if (l49Var2.T0 == null && f4 > f3) {
                l49Var2.getLocationInWindow(this.s5);
                float trimHandleX = this.i1.getTrimHandleX() + iArr[0];
                float N = gm.N(6.0f);
                float N2 = gm.N(11.0f);
                float trimWindowTop = ((this.i1.getTrimWindowTop() + iArr[1]) - gm.N(4.0f)) - N;
                String trimBubbleText = this.i1.getTrimBubbleText();
                TextPaint textPaint = this.m5;
                textPaint.setTextSize(gm.L(13.0f));
                textPaint.setTypeface(gm.n1("fonts/rmedium.ttf"));
                textPaint.setColor(-1);
                float measureText = textPaint.measureText(trimBubbleText);
                float N3 = gm.N(23.0f) + measureText;
                float N4 = gm.N(29.0f);
                float max = Math.max(gm.L(8.0f), Math.min((gm.q.x - gm.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
                RectF rectF = this.r5;
                rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
                float i = Utilities.i(trimHandleX, rectF.right - gm.L(16.0f), rectF.left + gm.L(16.0f));
                Path path = this.p5;
                path.rewind();
                float f8 = N4 / 2.0f;
                path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
                Path path2 = this.q5;
                path2.rewind();
                float f9 = i - N2;
                path2.moveTo(f9, trimWindowTop - gm.N(2.0f));
                path2.lineTo(f9, trimWindowTop);
                float f10 = trimWindowTop + N;
                path2.cubicTo(i - gm.N(6.5f), trimWindowTop, i - gm.N(3.2f), f10, i, f10);
                float N5 = gm.N(3.2f) + i;
                float N6 = gm.N(6.5f) + i;
                float f11 = i + N2;
                path2.cubicTo(N5, f10, N6, trimWindowTop, f11, trimWindowTop);
                path2.lineTo(f11, trimWindowTop - gm.N(2.0f));
                path2.close();
                path.op(path2, Path.Op.UNION);
                canvas.save();
                canvas.translate(-f, -f2);
                canvas.clipRect(-100000.0f, f3, 100000.0f, f4);
                float R1 = gm.R1(0.8f, 1.0f, f5);
                canvas.scale(R1, R1, i, f10);
                canvas.translate(0.0f, (1.0f - f5) * gm.L(6.0f));
                km0 km0Var = this.L1;
                if (km0Var == null) {
                    im0Var2 = null;
                } else {
                    if (frameLayout != this) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        im0Var = this.u5;
                    } else {
                        im0Var = this.v5;
                    }
                    if (im0Var == null) {
                        im0Var2 = km0Var.c(frameLayout, this.w5, false);
                        im0Var2.r(0.0f);
                        im0Var2.X = 0.0f;
                        if (z) {
                            this.u5 = im0Var2;
                        } else {
                            this.v5 = im0Var2;
                        }
                    } else {
                        im0Var2 = im0Var;
                    }
                }
                if (im0Var2 != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(f, f2);
                    f6 = 255.0f;
                    im0Var2.setBounds((int) Math.floor(rectF.left - f), (int) Math.floor(rectF.top - f2), (int) Math.ceil(rectF.right - f), (int) Math.ceil(f10 - f2));
                    im0Var2.setAlpha((int) (f5 * 255.0f));
                    im0Var2.draw(canvas);
                    canvas.restore();
                } else {
                    f6 = 255.0f;
                }
                if (im0Var2 != null) {
                    f7 = 0.5f;
                } else {
                    f7 = 0.6f;
                }
                int p1 = cmb.p1(f7 * f5, -16777216);
                Paint paint = this.n5;
                paint.setColor(p1);
                canvas.drawPath(path, paint);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint2 = this.o5;
                paint2.setStyle(style);
                paint2.setStrokeWidth(gm.N(0.66f));
                paint2.setColor(cmb.p1(0.16f * f5, -1));
                canvas.drawPath(path, paint2);
                textPaint.setAlpha((int) (f5 * f6));
                canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
                canvas.restore();
            }
        }
    }

    public boolean w1() {
        long j;
        String obj;
        un3 un3Var = this.j1;
        if (un3Var != null && un3Var.r == 4) {
            return false;
        }
        boolean z = this.q6;
        yv1 yv1Var = this.F3;
        if (!z) {
            if (this.p6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.t2 && !c() && (yv1Var == null || !yv1Var.x())) {
                int i = this.R;
                if (yv1Var != null) {
                    j = yv1Var.a();
                } else {
                    j = this.G3;
                }
                ed b = fd.b(i, j);
                if (b != null) {
                    Editable text = this.F0.getText();
                    String str = "";
                    if (text == null) {
                        obj = "";
                    } else {
                        obj = text.toString();
                    }
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        j2();
                        this.p6 = true;
                        dd ddVar = this.m6;
                        if (ddVar != null) {
                            if (!ddVar.d) {
                                ddVar.d = true;
                                ddVar.a.invalidate();
                            }
                            this.m6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i2 = this.R;
                        lf2 lf2Var = new lf2(this, obj, (byte) 10);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = hs6.d0(i2).Y(charSequenceArr, true, true);
                        CharSequence charSequence = charSequenceArr[0];
                        if (charSequence != null) {
                            str = charSequence.toString();
                        }
                        tL_textWithEntities.text = str;
                        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                        tL_messages_composeMessageWithAI.proofread = b.a;
                        tL_messages_composeMessageWithAI.emojify = b.b;
                        tL_messages_composeMessageWithAI.translate_to_lang = b.c;
                        TL_aicompose.InputAiComposeTone inputAiComposeTone = b.d;
                        if (!(inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
                            inputAiComposeTone = fd.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.o6 = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_messages_composeMessageWithAI, new kc((byte) 0), new defpackage.f(lf2Var, (byte) 8));
                        return true;
                    }
                }
            }
        }
        boolean z2 = this.t2;
        ylb ylbVar = this.L4;
        if (z2 && !z8c.h(this.R).p()) {
            jf9.r0(ylbVar, getContext(), new gx1(this, (byte) 8), new gx1(this, (byte) 9));
            return true;
        } else if (c()) {
            ik.J(this.E3, yv1Var.a(), new vx1(this, (byte) 3), ylbVar);
            return true;
        } else {
            return x1(true, 0, 0, 0L, true);
        }
    }

    public void w2(int r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.w2(int, boolean):void");
    }

    public final boolean x(boolean z) {
        if (!z && this.R3 == null && !U0() && !F2()) {
            return false;
        }
        return true;
    }

    public final cz1 x0(k47 k47Var, boolean z) {
        CharSequence textToUse;
        ?? k47Var2 = new k47(k47Var.K1, k47Var.k, true, true);
        if (z) {
            sy1 sy1Var = this.F0;
            if (sy1Var == null) {
                textToUse = "";
            } else {
                textToUse = sy1Var.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList Y = hs6.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            k47.b(spannableStringBuilder, Y, true, true, false, true, 0);
            k47Var2.z = k47.A5(gw3.m(spannableStringBuilder, cmb.n2.getFontMetricsInt(), false, null, 0), Y, cmb.n2.getFontMetricsInt(), false);
        }
        return k47Var2;
    }

    public boolean x1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.x1(boolean, int, int, long, boolean):boolean");
    }

    public final void x2() {
        int F0 = F0(cmb.Zf);
        int F02 = F0(cmb.Ie);
        int F03 = F0(cmb.Uf);
        s09 s09Var = this.h1;
        if (s09Var != null) {
            s09Var.h(F0, "Cup Red");
            this.h1.h(F0, "Box Red");
            this.h1.h(F03, "Cup Grey");
            this.h1.h(F03, "Box Grey");
            this.h1.h(F03, "Box_Grey 2");
            this.h1.h(F03, "Line 1");
            this.h1.h(F03, "Line 2");
            this.h1.h(F03, "Line 3");
            this.h1.h(F02, "Line 1 Dup");
            this.h1.h(F02, "Line 2 Dup");
            this.h1.h(F02, "Line 3 Dup");
        }
    }

    public final boolean y() {
        eq0 eq0Var = this.m0;
        if (eq0Var != null && eq0Var.w) {
            return true;
        }
        return false;
    }

    public final void y0() {
        if (this.n6 == null && this.F0 != null) {
            lo3 lo3Var = new lo3(this.F0);
            this.n6 = lo3Var;
            lo3Var.C = true;
            lo3Var.D = true;
            lo3Var.F = 0.0f;
            lo3Var.E = gm.L(5.0f);
            va2 C0 = C0();
            if (C0 != null) {
                if (this.u6 == null) {
                    this.u6 = new zn3();
                }
                if (C0.h == null) {
                    C0.h = new g11(this, C0, (byte) 20);
                }
            }
            int max = Math.max(this.F0.getWidth(), gm.q.x);
            lo3 lo3Var2 = this.n6;
            int L = gm.L(160.0f);
            lo3Var2.getClass();
            lta ltaVar = lo3Var2.c;
            if (max > 0 && L > 0) {
                int L2 = (gm.L(4.0f) + max) * L;
                int[] iArr = lo3Var2.G;
                if (iArr == null || iArr.length < L2) {
                    try {
                        lo3Var2.G = new int[L2];
                    } catch (Throwable unused) {
                    }
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(gm.L(24.0f), gm.L(12.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    int i = lo3Var2.w;
                    int i2 = lo3Var2.x;
                    lo3Var2.w = 0;
                    lo3Var2.x = createBitmap.getHeight();
                    int f = lo3Var2.f(64, createBitmap, true);
                    for (int i3 = 0; i3 < f; i3++) {
                        float[] fArr = lo3Var2.i;
                        int i4 = i3 * 3;
                        ltaVar.g(fArr[i4], fArr[i4 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
                    }
                    ltaVar.b(canvas, 1.0f);
                    ltaVar.a();
                    lo3Var2.k = 0;
                    lo3Var2.w = i;
                    lo3Var2.x = i2;
                    createBitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void y1(boolean z, boolean z2) {
        z1(z, z2, false);
    }

    public final void y2() {
        boolean z;
        mi9 mi9Var = this.s2;
        if (mi9Var != null) {
            boolean z2 = this.t2;
            if (this.u2 != null && this.P2 == null) {
                z = true;
            } else {
                z = false;
            }
            this.t2 = z;
            by1 by1Var = this.K0;
            ImageView imageView = this.S0;
            rx1 rx1Var = this.R0;
            if (z) {
                mi9Var.setResourcesProvider(this.L4);
                this.s2.set(this.u2);
                this.s2.setVisibility(0);
                sy1 sy1Var = this.F0;
                if (sy1Var != null) {
                    sy1Var.setVisibility(8);
                }
                rx1Var.setVisibility(8);
                imageView.setVisibility(0);
                by1Var.setLocked(!z8c.h(this.R).p());
            } else {
                mi9Var.setVisibility(8);
                sy1 sy1Var2 = this.F0;
                if (sy1Var2 != null) {
                    sy1Var2.setVisibility(0);
                }
                rx1Var.setVisibility(0);
                imageView.setVisibility(8);
                by1Var.setLocked(false);
            }
            p2();
            if (z2 != this.t2) {
                M(true);
            }
        }
    }

    public final boolean z() {
        pz1 A = A();
        if (!TextUtils.equals(A.a, this.S2.a) || !hs6.M(this.S2.b, A.b)) {
            return true;
        }
        return false;
    }

    public final un3 z0() {
        un3 un3Var = this.j1;
        if (un3Var == null) {
            un3 un3Var2 = new un3(getContext(), new d(this));
            this.j1 = un3Var2;
            return un3Var2;
        }
        return un3Var;
    }

    public final void z1(boolean z, boolean z2, boolean z3) {
        if ((this.z3 != z || this.A3 != z2) && this.V0 != null) {
            if (this.X0 && !z3) {
                this.w4 = true;
                J0(false);
            } else if (z3) {
                k1();
            }
        }
        this.y3 = true;
        this.z3 = z;
        this.A3 = z2;
        jz1 jz1Var = this.V0;
        if (jz1Var != null) {
            jz1Var.H(true, z, z2, true);
        }
        H1(false, !this.Z2);
    }

    public final void z2(boolean z) {
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
        boolean y = pg3.y(this.G3);
        ImageView imageView = this.y2;
        int i4 = 0;
        if (y) {
            TLRPC.Chat L0 = oc7.r1(this.S.a).L0(Long.valueOf(-this.G3));
            this.W2 = oc7.r1(this.R).W3.getBoolean("silent_" + this.G3, false);
            if (sd2.T(L0) && ((L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !L0.megagroup)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.X2 = z2;
            if (imageView != null) {
                v43 v43Var = this.f0;
                if (v43Var == null) {
                    v43Var = new v43(getContext(), 2131231514, cmb.Ml);
                    this.f0 = v43Var;
                }
                v43Var.a(this.W2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z2 = false;
            }
            qmb qmbVar = this.f2;
            if (qmbVar != null) {
                if (qmbVar.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                s2(i3);
            }
        } else {
            z2 = false;
        }
        if (this.P3 != null && !c() && this.P3.b0()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.B2 && !this.v3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            e0();
        }
        cy1 cy1Var = this.z2;
        if (cy1Var != null) {
            if ((cy1Var.getTag() != null && z4) || (this.z2.getTag() == null && !z4)) {
                if (imageView != null) {
                    if (z3 || !z2 || this.z2.getVisibility() == 0) {
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
            cy1 cy1Var2 = this.z2;
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            cy1Var2.setTag(num);
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
        AnimatorSet animatorSet = this.C2;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.C2 = null;
        }
        float f4 = 0.0f;
        float f5 = 0.1f;
        if (z && !z2) {
            cy1 cy1Var3 = this.z2;
            if (cy1Var3 != null) {
                if (z4) {
                    cy1Var3.setVisibility(0);
                }
                this.z2.setPivotX(gm.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                cy1 cy1Var4 = this.z2;
                if (z4) {
                    f4 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cy1Var4, View.ALPHA, f4);
                cy1 cy1Var5 = this.z2;
                if (z4) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cy1Var5, View.SCALE_X, f3);
                cy1 cy1Var6 = this.z2;
                if (z4) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cy1Var6, View.SCALE_Y, f5));
                this.C2.setDuration(180L);
                this.C2.addListener(new ey1(this, z4, (byte) 3));
                this.C2.start();
                return;
            }
            return;
        }
        cy1 cy1Var7 = this.z2;
        if (cy1Var7 != null) {
            if (z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            cy1Var7.setVisibility(i2);
            cy1 cy1Var8 = this.z2;
            if (z4) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            cy1Var8.setAlpha(f);
            cy1 cy1Var9 = this.z2;
            if (z4) {
                f2 = 1.0f;
            } else {
                f2 = 0.1f;
            }
            cy1Var9.setScaleX(f2);
            cy1 cy1Var10 = this.z2;
            if (z4) {
                f5 = 1.0f;
            }
            cy1Var10.setScaleY(f5);
            if (imageView != null) {
                if (!z2 || this.z2.getVisibility() == 0) {
                    i4 = 8;
                }
                imageView.setVisibility(i4);
            }
            this.z2.setTranslationX(0.0f);
        } else if (imageView != null) {
            if (!z2) {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    @Override
    public qu3 getEditField() {
        return this.F0;
    }

    @Override
    public yv1 getParentFragment() {
        return this.F3;
    }

    public void B0(Menu menu) {
    }

    public void V0() {
    }

    public void c1(float f) {
    }

    @Override
    public final void V(float f, int i) {
    }

    public void e1(int i, int i2) {
    }
}
