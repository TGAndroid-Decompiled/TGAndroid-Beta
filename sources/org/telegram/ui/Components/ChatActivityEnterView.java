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
public class ChatActivityEnterView extends FrameLayout implements gk7, bja, r0b, bbb, x74, tjb {
    public static final int r7 = 0;
    public boolean A0;
    public float A1;
    public gw1 A2;
    public boolean A3;
    public final on A4;
    public oy8 A5;
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
    public kra E5;
    public oy8 E6;
    public float F;
    public ex1 F0;
    public boolean F1;
    public final nw1 F2;
    public final mu1 F3;
    public Drawable F4;
    public Bitmap F5;
    public final float[] F6;
    public float G;
    public final ly1 G0;
    public long G1;
    public final Paint G2;
    public long G3;
    public Drawable G4;
    public float G5;
    public final float[] G6;
    public float H;
    public int H0;
    public s33 H1;
    public byte H2;
    public boolean H3;
    public final RectF H4;
    public float H5;
    public final int[] H6;
    public float I;
    public av1 I0;
    public long I1;
    public av1 I2;
    public byte I3;
    public final Rect I4;
    public float I5;
    public boolean I6;
    public float J;
    public final u0a J0;
    public boolean J1;
    public int J2;
    public k27 J3;
    public final Rect J4;
    public float J5;
    public av1 J6;
    public boolean K;
    public final ow1 K0;
    public boolean K1;
    public l79 K2;
    public k27 K3;
    public Drawable K4;
    public float K5;
    public final cm2[] K6;
    public TLRPC.UserFull L;
    public int L0;
    public kl0 L1;
    public Editable L2;
    public bu1 L3;
    public final wjb L4;
    public float L5;
    public byte L6;
    public je5 M;
    public j47 M0;
    public il0 M1;
    public boolean M2;
    public k27 M3;
    public final boolean M4;
    public float M5;
    public byte M6;
    public je5 N;
    public long N0;
    public il0 N1;
    public boolean N2;
    public TLRPC.WebPage N3;
    public final qw1 N4;
    public float N5;
    public boolean N6;
    public je5 O;
    public zw1 O0;
    public final Paint O1;
    public boolean O2;
    public boolean O3;
    public final bw1 O4;
    public boolean O5;
    public long O6;
    public boolean P;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P0;
    public float P1;
    public k27 P2;
    public hy1 P3;
    public final bw1 P4;
    public final Paint P5;
    public int P6;
    public boolean Q;
    public final ImageView Q0;
    public ValueAnimator Q1;
    public boolean Q2;
    public zx1 Q3;
    public final bw1 Q4;
    public boolean Q5;
    public int Q6;
    public int R;
    public final ew1 R0;
    public final int[] R1;
    public TL_account.TL_businessChatLink R2;
    public TLRPC.TL_document R3;
    public final bw1 R4;
    public float R5;
    public boolean R6;
    public j5 S;
    public final ImageView S0;
    public final int[] S1;
    public cy1 S2;
    public String S3;
    public final bw1 S4;
    public float S5;
    public boolean S6;
    public boolean T;
    public gw1 T0;
    public ojc T1;
    public TLRPC.ChatFull T2;
    public k27 T3;
    public boolean T4;
    public float T5;
    public py T6;
    public int U;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public oac U3;
    public long U4;
    public float U5;
    public cs5 U6;
    public gb V;
    public wx1 V0;
    public float V1;
    public int V2;
    public boolean V3;
    public float V4;
    public boolean V5;
    public int V6;
    public uv1 W;
    public AnimatorSet W0;
    public ValueAnimator W1;
    public boolean W2;
    public boolean W3;
    public float W4;
    public boolean W5;
    public int W6;
    public boolean X0;
    public final jc X1;
    public boolean X2;
    public boolean X3;
    public float X4;
    public boolean X5;
    public vf6 X6;
    public boolean Y0;
    public long Y1;
    public boolean Y2;
    public k27 Y3;
    public float Y4;
    public boolean Y5;
    public final Paint Y6;
    public my1 Z0;
    public boolean Z1;
    public boolean Z2;
    public TL_keyboard.KeyboardButtonProto Z3;
    public float Z4;
    public boolean Z5;
    public final LinearGradient Z6;
    public int a;
    public aj1 a0;
    public final a a1;
    public SlideTextView a2;
    public boolean a3;
    public boolean a4;
    public float a5;
    public final Paint a6;
    public final Matrix a7;
    public boolean b;
    public boolean b0;
    public boolean b1;
    public jy1 b2;
    public boolean b3;
    public boolean b4;
    public float b5;
    public float b6;
    public final lm b7;
    public a8 c;
    public NumberTextView c0;
    public final mw1 c1;
    public final cja c2;
    public k27 c3;
    public boolean c4;
    public float c5;
    public final Rect c6;
    public final lm c7;
    public LinearLayout d;
    public int d0;
    public boolean d1;
    public ViewGroup d2;
    public TLRPC.TL_replyKeyboardMarkup d3;
    public boolean d4;
    public float d5;
    public boolean d6;
    public byc d7;
    public CharSequence e;
    public int e0;
    public a6 e1;
    public int e2;
    public int e3;
    public int e4;
    public float e5;
    public final uv1 e6;
    public dz1 e7;
    public String f;
    public k33 f0;
    public cw1 f1;
    public final pkb f2;
    public boolean f3;
    public boolean f4;
    public float f5;
    public a8 f6;
    public final y74 f7;
    public Runnable g0;
    public scc g1;
    public ViewPropertyAnimator g2;
    public PowerManager.WakeLock g3;
    public boolean g4;
    public boolean g5;
    public ArrayList g6;
    public final fm0 g7;
    public float h;
    public boolean h0;
    public ry8 h1;
    public final gw1 h2;
    public AnimatorSet h3;
    public final qw1 h4;
    public boolean h5;
    public boolean h6;
    public final fm0 h7;
    public boolean i0;
    public i29 i1;
    public final gc i2;
    public AnimatorSet i3;
    public final ef0 i4;
    public int i5;
    public View i6;
    public final fm0 i7;
    public String j0;
    public jm3 j1;
    public final ImageView j2;
    public AnimatorSet j3;
    public final ax1 j4;
    public long j5;
    public boolean j6;
    public float j7;
    public String k0;
    public boolean k1;
    public final ImageView k2;
    public AnimatorSet k3;
    public final b k4;
    public boolean k5;
    public boolean k6;
    public float k7;
    public qu1 l0;
    public boolean l1;
    public float l2;
    public byte l3;
    public final f l4;
    public ValueAnimator l5;
    public boolean l6;
    public float l7;
    public ep0 m0;
    public boolean m1;
    public ImageView m2;
    public boolean m3;
    public final Paint m4;
    public final TextPaint m5;
    public cc m6;
    public final int[] m7;
    public float n;
    public cx1 n0;
    public boolean n1;
    public gw1 n2;
    public int n3;
    public boolean n4;
    public final Paint n5;
    public bn3 n6;
    public final int[] n7;
    public dp0 o0;
    public boolean o1;
    public final cw1 o2;
    public int o3;
    public boolean o4;
    public final Paint o5;
    public int o6;
    public boolean o7;
    public boolean p0;
    public Drawable p1;
    public final cw1 p2;
    public boolean p3;
    public boolean p4;
    public final Path p5;
    public boolean p6;
    public int p7;
    public k4a q0;
    public final av1 q1;
    public final cw1 q2;
    public int q3;
    public boolean q4;
    public final Path q5;
    public boolean q6;
    public int q7;
    public float r;
    public uw1 r0;
    public gjc r1;
    public final ImageView r2;
    public final boolean r3;
    public AnimatorSet r4;
    public final RectF r5;
    public qw1 r6;
    public float s;
    public av1 s0;
    public boolean s1;
    public ig9 s2;
    public long s3;
    public float s4;
    public final int[] s5;
    public long s6;
    public int t0;
    public boolean t1;
    public boolean t2;
    public float t3;
    public int t4;
    public final int[] t5;
    public long t6;
    public int u0;
    public float u1;
    public TL_iv.RichMessage u2;
    public float u3;
    public boolean u4;
    public il0 u5;
    public om3 u6;
    public av1 v0;
    public float v1;
    public ow1 v2;
    public boolean v3;
    public AnimatedArrowDrawable v4;
    public il0 v5;
    public final RectF v6;
    public boolean w;
    public ValueAnimator w0;
    public float w1;
    public View w2;
    public int w3;
    public boolean w4;
    public final pd5 w5;
    public boolean w6;
    public Runnable x;
    public float x0;
    public boolean x1;
    public tx1 x2;
    public boolean x3;
    public boolean x4;
    public boolean x5;
    public long x6;
    public float y;
    public boolean y0;
    public float y1;
    public final ImageView y2;
    public boolean y3;
    public boolean y4;
    public kx1 y5;
    public ru3 y6;
    public boolean z0;
    public float z1;
    public pw1 z2;
    public boolean z3;
    public final i z4;
    public oy8 z5;
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
        public final fk0 h;
        public final fk0 n;
        public final float r;
        public final float s;
        public final RectF w;
        public boolean x;
        public final m y;

        public RecordCircle(Context context) {
            super(context);
            fk0 fk0Var = new fk0(11, 360928);
            this.h = fk0Var;
            fk0 fk0Var2 = new fk0(12, 360928);
            this.n = fk0Var2;
            this.r = gl.N(41.0f);
            this.s = gl.L(30.0f);
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
            jdc.k(this, mVar);
            fk0Var.a = gl.L(47.0f);
            fk0Var.b = gl.L(55.0f);
            fk0Var.b();
            fk0Var2.a = gl.L(47.0f);
            fk0Var2.b = gl.L(55.0f);
            fk0Var2.b();
            float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.F = scaledTouchSlop * scaledTouchSlop;
            h();
        }

        public static float d(float f) {
            float i = Utilities.i(f, 1.0f, 0.0f);
            if (i < 0.5f) {
                return yjb.C(i, 4.0f, i, i);
            }
            return 1.0f - (((float) Math.pow((i * (-2.0f)) + 2.0f, 3.0d)) / 2.0f);
        }

        public static float e(float f) {
            float i = 1.0f - Utilities.i(f, 1.0f, 0.0f);
            return oo1.v(i, i, i, 1.0f);
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
            wjb wjbVar = chatActivityEnterView.L4;
            if (chatActivityEnterView.E4 != null) {
                return;
            }
            Drawable mutate = getResources().getDrawable(2131231511).mutate();
            chatActivityEnterView.E4 = mutate;
            int i = bkb.Sf;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.x(this, mutate, i, wjbVar, mode);
            Drawable mutate2 = getResources().getDrawable(2131231519).mutate();
            chatActivityEnterView.F4 = mutate2;
            zkb.x(this, mutate2, i, wjbVar, mode);
            Drawable mutate3 = getResources().getDrawable(2131232699).mutate();
            chatActivityEnterView.G4 = mutate3;
            zkb.x(this, mutate3, i, wjbVar, mode);
            Drawable mutate4 = getResources().getDrawable(2131231510).mutate();
            chatActivityEnterView.C4 = mutate4;
            int i2 = bkb.Ml;
            zkb.x(this, mutate4, i2, wjbVar, mode);
            Drawable mutate5 = getResources().getDrawable(2131231518).mutate();
            chatActivityEnterView.D4 = mutate5;
            zkb.x(this, mutate5, i2, wjbVar, mode);
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
            chatActivityEnterView.U0();
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
            int i = bkb.Tf;
            paint.setColor(chatActivityEnterView.F0(i));
            this.h.d.setColor(bm2.o(chatActivityEnterView.F0(i), 38));
            this.n.d.setColor(bm2.o(chatActivityEnterView.F0(i), 76));
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
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(194.0f), 1073741824));
            float measuredWidth = getMeasuredWidth() * 0.35f;
            if (measuredWidth > gl.L(140.0f)) {
                measuredWidth = gl.L(140.0f);
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
        public ff0 J;
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
            if (gl.q.x <= gl.L(320.0f)) {
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
            textPaint.setTextSize(gl.L(f));
            TextPaint textPaint2 = new TextPaint(1);
            this.b = textPaint2;
            de9.p(textPaint2, gl.L(15.0f));
            int i = bkb.Ml;
            int i2 = ChatActivityEnterView.r7;
            paint.setColor(ChatActivityEnterView.this.F0(i));
            paint.setStyle(Paint.Style.STROKE);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 1.6f;
            }
            paint.setStrokeWidth(gl.N(f2));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            String M0 = k96.M0(2131745121, null);
            this.d = M0;
            String M02 = k96.M0(2131752577, "Cancel");
            this.e = M02;
            this.x = M0.toLowerCase().indexOf(M02.toLowerCase());
            b();
        }

        public final void a() {
            this.r = 1.0f;
        }

        public final void b() {
            int i = bkb.dg;
            int i2 = ChatActivityEnterView.r7;
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            int F0 = chatActivityEnterView.F0(i);
            TextPaint textPaint = this.a;
            textPaint.setColor(F0);
            int i3 = bkb.cg;
            int F02 = chatActivityEnterView.F0(i3);
            TextPaint textPaint2 = this.b;
            textPaint2.setColor(F02);
            textPaint.getAlpha();
            this.s = textPaint2.getAlpha();
            ff0 h0 = bkb.h0(gl.L(60.0f), 0, bm2.o(chatActivityEnterView.F0(i3), 26));
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
            ff0 ff0Var = this.J;
            if (ff0Var != null) {
                ff0Var.jumpToCurrentState();
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
                    int L3 = gl.L(16.0f) + staticLayout.getWidth();
                    if (gl.B(chatActivityEnterView.F0(bkb.c6)) < 0.5f && (lVar = chatActivityEnterView.E2) != null) {
                        F0 = lVar.s.getColor();
                    } else {
                        F0 = chatActivityEnterView.F0(bkb.dg);
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
                        this.w = gl.L(16.0f);
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
                            this.w = (-gl.L(6.0f)) * f;
                        }
                    }
                    int i = this.x;
                    if (i >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int L4 = gl.L(5.0f) + ((int) ((getMeasuredWidth() - this.f) / 2.0f));
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
                    float L5 = (((((1.0f - f10) * f9) * this.r) + f8) - (f4 * f10)) + gl.L(16.0f);
                    if (z) {
                        L = 0.0f;
                    } else {
                        L = this.n * gl.L(12.0f);
                    }
                    if (this.n != 1.0f) {
                        f5 = 12.0f;
                        int translationX = (int) ((chatActivityEnterView.D2.getTranslationX() * 0.3f) + ((1.0f - this.r) * ((-getMeasuredWidth()) / 4)));
                        canvas.save();
                        my1 my1Var = chatActivityEnterView.Z0;
                        if (my1Var == null) {
                            leftProperty = 0.0f;
                        } else {
                            leftProperty = my1Var.getLeftProperty();
                        }
                        f6 = 2.0f;
                        canvas.clipRect(leftProperty + gl.L(f2), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        canvas.save();
                        int i2 = (int) L5;
                        if (z2) {
                            f7 = 7.0f;
                        } else {
                            f7 = 10.0f;
                        }
                        canvas.translate((i2 - gl.L(f7)) + translationX, L);
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
                        measuredHeight -= gl.L(f5) - L;
                        L2 = measuredWidth;
                    } else {
                        L2 = (L5 + f3) - (gl.L(16.0f) * this.n);
                    }
                    Rect rect = this.I;
                    rect.set((int) L2, (int) measuredHeight, (int) (this.F.getWidth() + L2), (int) (this.F.getHeight() + measuredHeight));
                    rect.inset(-gl.L(16.0f), -gl.L(16.0f));
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
                    path.setLastPoint(gl.N(2.5f), f - gl.N(3.12f));
                    path.lineTo(0.0f, f);
                    path.lineTo(gl.N(2.5f), gl.N(3.12f) + f);
                } else {
                    float f2 = measuredHeight2;
                    path.setLastPoint(gl.N(4.0f), f2 - gl.N(5.0f));
                    path.lineTo(0.0f, f2);
                    path.lineTo(gl.N(4.0f), gl.N(5.0f) + f2);
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
                        hy1 hy1Var = chatActivityEnterView.P3;
                        if (chatActivityEnterView.P) {
                            i = Integer.MAX_VALUE;
                        } else {
                            i = 0;
                        }
                        hy1Var.k1(5, 0, i, chatActivityEnterView.O6, 0L, true);
                        ow1 ow1Var = chatActivityEnterView.K0;
                        chatActivityEnterView.O6 = 0L;
                        ow1Var.setEffect(0L);
                    } else {
                        chatActivityEnterView.P3.n0(0);
                        MediaController.w().A0(0, 0, false, chatActivityEnterView.P);
                    }
                    chatActivityEnterView.R3 = null;
                    chatActivityEnterView.T3 = null;
                    chatActivityEnterView.U3 = null;
                    chatActivityEnterView.Y1 = 0L;
                    chatActivityEnterView.v3 = false;
                    hq6 d0 = hq6.d0(chatActivityEnterView.R);
                    long j2 = chatActivityEnterView.G3;
                    mu1 mu1Var = chatActivityEnterView.F3;
                    if (mu1Var != null && mu1Var.x4) {
                        j = mu1Var.d();
                    }
                    d0.D1(j2, j, null);
                    chatActivityEnterView.r2(2, true);
                    chatActivityEnterView.N(true);
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

    public ChatActivityEnterView(Activity activity, cja cjaVar, mu1 mu1Var, boolean z, final wjb wjbVar) {
        super(activity);
        boolean z2;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        hy1 hy1Var;
        this.h = 1.0f;
        this.n = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.J = 0.0f;
        this.K = true;
        int i5 = y6c.t0;
        this.R = i5;
        this.S = j5.a(i5);
        this.U = 1;
        this.d0 = -1;
        this.p7 = 1;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.C0 = new HashMap();
        this.D0 = false;
        this.E0 = false;
        this.q1 = new av1(this, (byte) 18);
        this.z1 = 1.0f;
        this.C1 = new SparseArray();
        this.O1 = new Paint(1);
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.X1 = new jc(this, (byte) 19);
        this.l2 = 1.0f;
        this.V2 = -1;
        this.Z2 = true;
        this.t3 = -1.0f;
        this.u3 = gl.L(80.0f);
        this.D3 = new int[2];
        this.O3 = true;
        this.e4 = -1;
        this.g4 = true;
        this.h4 = new qw1(this, (byte) 0);
        this.i4 = new ef0(this);
        this.j4 = new ax1(Integer.class, "translationY", (byte) 0);
        this.k4 = new Property(Float.class, "scale");
        this.l4 = new Property(Float.class, "controlsScale");
        this.m4 = new Paint(1);
        this.z4 = new i(this);
        this.A4 = new on(null);
        this.B4 = new Paint(1);
        this.H4 = new RectF();
        this.I4 = new Rect();
        this.J4 = new Rect();
        this.N4 = new qw1(this, (byte) 2);
        this.O4 = new bw1(this, (byte) 4);
        this.P4 = new bw1(this, (byte) 0);
        this.Q4 = new bw1(this, (byte) 1);
        this.R4 = new bw1(this, (byte) 2);
        this.S4 = new bw1(this, (byte) 3);
        this.m5 = new TextPaint(1);
        this.n5 = new Paint(1);
        this.o5 = new Paint(1);
        this.p5 = new Path();
        this.q5 = new Path();
        this.r5 = new RectF();
        this.s5 = new int[2];
        this.t5 = new int[2];
        this.w5 = new pd5((byte) 15);
        this.P5 = new Paint(2);
        this.T5 = 1.0f;
        this.U5 = 1.0f;
        this.W5 = true;
        this.X5 = true;
        this.a6 = new Paint();
        this.b6 = 1.0f;
        this.c6 = new Rect();
        this.e6 = new uv1(this, (byte) 11);
        this.h6 = true;
        this.o6 = -1;
        this.v6 = new RectF();
        this.F6 = new float[2];
        this.G6 = new float[2];
        this.H6 = new int[2];
        this.K6 = new cm2[1];
        this.q7 = 1;
        this.V6 = -1;
        Paint paint = new Paint(1);
        this.Y6 = paint;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Z6 = linearGradient;
        this.a7 = new Matrix();
        s33 s33Var = s33.h;
        this.b7 = new lm(this, 0L, 280L, s33Var);
        this.c7 = new lm(this, 0L, 280L, s33Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(linearGradient);
        s33 s33Var2 = la2.V;
        this.f7 = new y74(0, this, s33Var2, 250L);
        this.g7 = new fm0(1, this, s33Var2, 250L, false);
        this.h7 = new fm0(2, this, s33Var, 320L, false);
        this.i7 = new fm0(3, this, s33Var, 320L, false);
        this.m7 = new int[2];
        this.n7 = new int[2];
        this.L4 = wjbVar;
        this.M4 = z;
        if (z && !gl.E && (mu1Var == null || !mu1Var.isInBubbleMode())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Y2 = z2;
        Paint paint2 = new Paint(1);
        this.G2 = paint2;
        paint2.setColor(F0(bkb.Rf));
        setFocusable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setClipChildren(false);
        kk7.f(this.R).b(this, kk7.k2);
        kk7.f(this.R).b(this, kk7.n2);
        kk7.f(this.R).b(this, kk7.o2);
        kk7.f(this.R).b(this, kk7.l2);
        kk7.f(this.R).b(this, kk7.W5);
        kk7.f(this.R).b(this, kk7.m2);
        kk7.f(this.R).b(this, kk7.j2);
        kk7.f(this.R).b(this, kk7.s);
        kk7.f(this.R).b(this, kk7.r2);
        kk7.f(this.R).b(this, kk7.t2);
        kk7.f(this.R).b(this, kk7.d2);
        kk7.f(this.R).b(this, kk7.y0);
        kk7.f(this.R).b(this, kk7.K);
        kk7.f(this.R).b(this, kk7.m1);
        kk7.f(this.R).b(this, kk7.s2);
        kk7.f(this.R).b(this, kk7.S2);
        kk7.f(this.R).b(this, kk7.Z2);
        kk7.f(this.R).b(this, kk7.h5);
        kk7.f(this.R).b(this, kk7.R3);
        kk7.e().b(this, kk7.k4);
        this.E3 = activity;
        this.F3 = mu1Var;
        if (mu1Var != null) {
            this.w3 = mu1Var.getClassGuid();
        }
        this.c2 = cjaVar;
        this.d2 = cjaVar;
        cjaVar.setDelegate(this);
        this.r3 = na7.c1().getBoolean("send_by_enter", false);
        cw1 cw1Var = new cw1(this, activity, (byte) 0);
        this.p2 = cw1Var;
        cw1Var.setClipChildren(false);
        cw1Var.setClipToPadding(false);
        cw1Var.setPadding(0, gl.L(1.0f), 0, 0);
        addView(cw1Var, nme.d(-1, -2.0f, 83, 0.0f, 1.0f, 0.0f, 0.0f));
        cw1 cw1Var2 = new cw1(this, activity, (byte) 1);
        this.o2 = cw1Var2;
        cw1Var2.setClipChildren(false);
        cw1Var.addView(cw1Var2, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 44.0f, 0.0f));
        ew1 ew1Var = new ew1(this, activity);
        this.R0 = ew1Var;
        ew1Var.setContentDescription(k96.M0(2131754884, null));
        ew1Var.setFocusable(true);
        int L = gl.L(7.5f);
        ew1Var.setPadding(L, L, L, L);
        int i6 = bkb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(ew1Var, i6, wjbVar, mode);
        int i7 = bkb.h6;
        int F0 = F0(i7);
        int L2 = gl.L(1.0f);
        int L3 = gl.L(3.0f);
        ew1Var.setBackground(bkb.W(gl.L(19.0f), F0, L2, L3, L2, L3));
        ew1Var.setOnClickListener(new fv1(this, (byte) 21));
        cw1Var2.addView(ew1Var, nme.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        E1(false, false);
        ImageView imageView = new ImageView(activity);
        this.S0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231789);
        zkb.s(imageView, i6, wjbVar, mode);
        int F02 = F0(i7);
        int L4 = gl.L(1.0f);
        int L5 = gl.L(3.0f);
        imageView.setBackground(bkb.W(gl.L(19.0f), F02, L4, L5, L4, L5));
        imageView.setVisibility(8);
        imageView.setContentDescription(k96.M0(2131754035, null));
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
                        int i8 = ChatActivityEnterView.r7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, chatActivityEnterView.getContext());
                        String M0 = k96.M0(2131754033, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131754034, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new qv1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i9 = ChatActivityEnterView.r7;
                        na7.c1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        mu1 mu1Var2 = chatActivityEnterView2.F3;
                        if (mu1Var2 != null) {
                            j = mu1Var2.a();
                        } else {
                            j = chatActivityEnterView2.G3;
                        }
                        boolean z4 = chatActivityEnterView2.t2;
                        wjb wjbVar2 = wjbVar;
                        if (z4) {
                            if (chatActivityEnterView2.u2 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                                a1Var.n1(chatActivityEnterView2.u2);
                                a1Var.f2 = new vv1(chatActivityEnterView2, (byte) 1);
                                wv1 wv1Var = new wv1(chatActivityEnterView2, j, wjbVar2, (byte) 0);
                                a1Var.g2 = j;
                                a1Var.j2 = wv1Var;
                                a1Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                            a1Var2.o1(chatActivityEnterView2.F0.getText());
                            a1Var2.R2 = new uv1(chatActivityEnterView2, (byte) 7);
                            a1Var2.e2 = new vv1(chatActivityEnterView2, (byte) 2);
                            if (chatActivityEnterView2.P2 != null) {
                                z3 = true;
                            }
                            a1Var2.m1(j, z3, new wv1(chatActivityEnterView2, j, wjbVar2, (byte) 1));
                            a1Var2.show();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        cw1Var2.addView(imageView, nme.d(44, 44.0f, 83, 2.0f, 0.0f, 0.0f, 0.0f));
        if (z) {
            if (mu1Var != null) {
                i2 = mu1Var.g4;
            } else {
                i2 = -1;
            }
            pkb pkbVar = new pkb((byte) 3, activity, this);
            this.f2 = pkbVar;
            pkbVar.setOrientation(0);
            pkbVar.setEnabled(false);
            pkbVar.setClipChildren(false);
            cw1Var2.addView(pkbVar, nme.d(-2, 44.0f, 85, 0.0f, 0.0f, 44.0f, 0.0f));
            if (i2 != 9) {
                ImageView imageView2 = new ImageView(activity);
                this.y2 = imageView2;
                k33 k33Var = new k33(activity, 2131231513, i6);
                this.f0 = k33Var;
                imageView2.setImageDrawable(k33Var);
                this.f0.a(this.W2, false);
                if (this.W2) {
                    str = "AccDescrChanSilentOn";
                    i3 = 2131754906;
                } else {
                    str = "AccDescrChanSilentOff";
                    i3 = 2131754907;
                }
                imageView2.setContentDescription(k96.M0(i3, str));
                zkb.s(imageView2, i6, wjbVar, PorterDuff.Mode.MULTIPLY);
                imageView2.setScaleType(scaleType);
                ff0 f0 = bkb.f0(F0(i7), 1, -1);
                vkb M = zkb.M(i7);
                imageView2.setBackground(f0);
                zkb.j(imageView2, f0, null, M, wjbVar);
                if (this.X2 && ((hy1Var = this.P3) == null || !hy1Var.M())) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageView2.setVisibility(i4);
                pkbVar.addView(imageView2, nme.o(44, 44));
                imageView2.setOnClickListener(new fw1(this, mu1Var, activity));
            }
            gw1 gw1Var = new gw1(this, activity, (byte) 0);
            this.h2 = gw1Var;
            gw1Var.setScaleType(scaleType);
            zkb.s(gw1Var, i6, wjbVar, PorterDuff.Mode.MULTIPLY);
            gw1Var.setImageResource(2131232191);
            ff0 f02 = bkb.f0(F0(i7), 1, -1);
            vkb M2 = zkb.M(i7);
            gw1Var.setBackground(f02);
            zkb.j(gw1Var, f02, null, M2, wjbVar);
            cw1Var2.addView(gw1Var, nme.e(44, 44, 85));
            gw1Var.setOnClickListener(new fv1(this, (byte) 1));
            gw1Var.setContentDescription(k96.M0(2131754921, null));
            n2(1);
        }
        ImageView imageView3 = new ImageView(activity);
        this.j2 = imageView3;
        gc gcVar = new gc(activity);
        this.i2 = gcVar;
        imageView3.setImageDrawable(gcVar);
        imageView3.setScaleType(scaleType);
        PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
        zkb.s(imageView3, i6, wjbVar, mode2);
        ff0 f03 = bkb.f0(F0(i7), 1, gl.L(16.0f));
        vkb M3 = zkb.M(i7);
        imageView3.setBackground(f03);
        zkb.j(imageView3, f03, null, M3, wjbVar);
        cw1Var.addView(imageView3, nme.d(44, 44.0f, 51, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView3.setContentDescription(k96.M0(2131755006, null));
        ote.a(imageView3);
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
                        int i8 = ChatActivityEnterView.r7;
                        ChatActivityEnterView chatActivityEnterView = this.b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, chatActivityEnterView.getContext());
                        String M0 = k96.M0(2131754033, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131754034, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new qv1(chatActivityEnterView));
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        return;
                    default:
                        int i9 = ChatActivityEnterView.r7;
                        na7.c1().edit().putInt("aihintshown", 3).apply();
                        ChatActivityEnterView chatActivityEnterView2 = this.b;
                        mu1 mu1Var2 = chatActivityEnterView2.F3;
                        if (mu1Var2 != null) {
                            j = mu1Var2.a();
                        } else {
                            j = chatActivityEnterView2.G3;
                        }
                        boolean z4 = chatActivityEnterView2.t2;
                        wjb wjbVar2 = wjbVar;
                        if (z4) {
                            if (chatActivityEnterView2.u2 != null) {
                                a1 a1Var = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                                a1Var.n1(chatActivityEnterView2.u2);
                                a1Var.f2 = new vv1(chatActivityEnterView2, (byte) 1);
                                wv1 wv1Var = new wv1(chatActivityEnterView2, j, wjbVar2, (byte) 0);
                                a1Var.g2 = j;
                                a1Var.j2 = wv1Var;
                                a1Var.show();
                                return;
                            }
                            return;
                        } else if (chatActivityEnterView2.F0 != null) {
                            a1 a1Var2 = new a1(chatActivityEnterView2.getContext(), wjbVar2);
                            a1Var2.o1(chatActivityEnterView2.F0.getText());
                            a1Var2.R2 = new uv1(chatActivityEnterView2, (byte) 7);
                            a1Var2.e2 = new vv1(chatActivityEnterView2, (byte) 2);
                            if (chatActivityEnterView2.P2 != null) {
                                z3 = true;
                            }
                            a1Var2.m1(j, z3, new wv1(chatActivityEnterView2, j, wjbVar2, (byte) 1));
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
        imageView4.setImageResource(2131231560);
        imageView4.setScaleType(scaleType);
        zkb.s(imageView4, i6, wjbVar, mode2);
        ff0 f04 = bkb.f0(F0(i7), 1, gl.L(16.0f));
        vkb M4 = zkb.M(i7);
        imageView4.setBackground(f04);
        zkb.j(imageView4, f04, null, M4, wjbVar);
        cw1Var.addView(imageView4, nme.d(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView4.setContentDescription(k96.M0(2131754030, null));
        ote.a(imageView4);
        imageView4.setOnClickListener(new fv1(this, (byte) 3));
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        if (this.R3 != null) {
            a0();
        }
        ImageView imageView5 = new ImageView(activity);
        this.r2 = imageView5;
        imageView5.setImageResource(2131232698);
        imageView5.setScaleType(scaleType);
        imageView5.setVisibility(8);
        zkb.s(imageView5, bkb.Xl, wjbVar, mode);
        cw1Var.addView(imageView5, nme.e(44, 44, 85));
        cw1 cw1Var3 = new cw1(this, activity, (byte) 2);
        this.q2 = cw1Var3;
        cw1Var3.setClipChildren(false);
        cw1Var3.setClipToPadding(false);
        cw1Var.addView(cw1Var3, nme.e(100, 44, 85));
        a aVar = new a(this, activity, wjbVar);
        this.a1 = aVar;
        aVar.setSoundEffectsEnabled(false);
        cw1Var3.addView(aVar, nme.e(44, 44, 85));
        aVar.setFocusable(true);
        aVar.setImportantForAccessibility(1);
        Drawable mutate = getResources().getDrawable(2131231510).mutate();
        this.C4 = mutate;
        zkb.x(this, mutate, i6, wjbVar, mode2);
        Drawable mutate2 = getResources().getDrawable(2131231518).mutate();
        this.D4 = mutate2;
        zkb.x(this, mutate2, i6, wjbVar, mode2);
        mw1 mw1Var = new mw1(this, activity);
        this.c1 = mw1Var;
        mw1Var.setImportantForAccessibility(2);
        int L6 = gl.L(10.0f);
        mw1Var.setPadding(L6, L6, L6, L6);
        aVar.addView(mw1Var, nme.c(44.0f, 44));
        ImageView imageView6 = new ImageView(activity);
        this.Q0 = imageView6;
        imageView6.setVisibility(4);
        imageView6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ?? wi2Var = new wi2();
        this.F2 = wi2Var;
        imageView6.setImageDrawable(wi2Var);
        imageView6.setContentDescription(k96.M0(2131752577, "Cancel"));
        imageView6.setSoundEffectsEnabled(false);
        imageView6.setScaleX(0.1f);
        imageView6.setScaleY(0.1f);
        imageView6.setAlpha(0.0f);
        ff0 f05 = bkb.f0(F0(i7), 1, -1);
        vkb M5 = zkb.M(i7);
        imageView6.setBackground(f05);
        zkb.j(imageView6, f05, null, M5, wjbVar);
        cw1Var3.addView(imageView6, nme.e(44, 44, 85));
        imageView6.setOnClickListener(new fv1(this, (byte) 4));
        if (c()) {
            i = 2131231515;
        } else {
            i = 2131232699;
        }
        ow1 ow1Var = new ow1(this, activity, i, wjbVar);
        this.K0 = ow1Var;
        ow1Var.setVisibility(4);
        ow1Var.setContentDescription(k96.M0(2131745448, null));
        ow1Var.setSoundEffectsEnabled(false);
        ow1Var.setScaleX(0.1f);
        ow1Var.setScaleY(0.1f);
        ow1Var.setAlpha(0.0f);
        cw1Var3.addView(ow1Var, nme.e(100, 44, 85));
        ow1Var.setOnClickListener(new fv1(this, (byte) 5));
        ow1Var.setOnLongClickListener(new rv1(this, (byte) 0));
        if (gl.A1()) {
            cw1Var3.setOnLongClickListener(new rv1(this, (byte) 0));
        }
        u0a u0aVar = new u0a(activity, wjbVar);
        this.J0 = u0aVar;
        u0aVar.setVisibility(4);
        u0aVar.setOnClickListener(new fv1(this, (byte) 12));
        cw1Var3.addView(u0aVar, nme.e(44, 44, 85));
        ly1 ly1Var = new ly1(activity);
        jia jiaVar = (jia) ly1Var.c;
        this.G0 = ly1Var;
        jiaVar.setTextSize(16);
        ly1Var.invalidate();
        ly1Var.setVisibility(4);
        ly1Var.setSoundEffectsEnabled(false);
        ly1Var.setScaleX(0.1f);
        ly1Var.setScaleY(0.1f);
        ly1Var.setAlpha(0.0f);
        ly1Var.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        jiaVar.setGravity(21);
        ly1Var.invalidate();
        jiaVar.setTextColor(F0(i6));
        ly1Var.invalidate();
        cw1Var3.addView(ly1Var, nme.e(74, 44, 85));
        ly1Var.setOnClickListener(new fv1(this, (byte) 15));
        ly1Var.setOnLongClickListener(new rv1(this, (byte) 1));
        SharedPreferences b1 = na7.b1();
        this.n3 = b1.getInt("kbd_height", gl.L(200.0f));
        this.o3 = b1.getInt("kbd_height_land3", gl.L(200.0f));
        M1(false, false);
        N(false);
        I();
        Z();
    }

    public static float D2(int i) {
        int i2 = i * 668265261;
        int i3 = (i2 ^ (i2 >>> 15)) * (-2048144789);
        return ((i3 ^ (i3 >>> 13)) >>> 8) / 1.6777216E7f;
    }

    public static int E2(int i) {
        int green = Color.green(i) * 6;
        return (Color.blue(i) + (green + (Color.red(i) * 3))) / 10;
    }

    public static float G2(float f, float f2, float f3) {
        float i = Utilities.i((f3 - f) / (f2 - f), 1.0f, 0.0f);
        return yjb.B(i, 2.0f, 3.0f, i * i);
    }

    public static boolean K(int r20, long r21, org.telegram.ui.ActionBar.d r23, java.lang.CharSequence r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.K(int, long, org.telegram.ui.ActionBar.d, java.lang.CharSequence):boolean");
    }

    public k27 getThreadMessage() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.m4;
        }
        return null;
    }

    public int getThreadMessageId() {
        k27 k27Var;
        mu1 mu1Var = this.F3;
        if (mu1Var != null && (k27Var = mu1Var.m4) != null) {
            return k27Var.e1();
        }
        return 0;
    }

    private String getTopicKeyString() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null && mu1Var.x4) {
            return this.G3 + "_" + mu1Var.d();
        }
        return String.valueOf(this.G3);
    }

    public static CharSequence r(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        gm gmVar;
        Collections.sort(arrayList, hq6.g2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(im4.a(charSequence, false));
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
                            j4c j4cVar = new j4c("" + ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id, 3, null);
                            int i5 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j4cVar, i5, messageEntity.length + i5, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                            if (messageEntity.offset + messageEntity.length < spannableStringBuilder.length() && spannableStringBuilder.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                messageEntity.length++;
                            }
                            j4c j4cVar2 = new j4c("" + ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id, 3, null);
                            int i6 = messageEntity.offset;
                            spannableStringBuilder.setSpan(j4cVar2, i6, messageEntity.length + i6, 33);
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            ?? obj2 = new Object();
                            obj2.a |= 4;
                            wib wibVar = new wib(obj2, 0);
                            int i7 = messageEntity.offset;
                            hq6.f(wibVar, i7, messageEntity.length + i7, spannableStringBuilder, true);
                        } else if (!(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                            if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                ?? obj3 = new Object();
                                obj3.a |= 1;
                                wib wibVar2 = new wib(obj3, 0);
                                int i8 = messageEntity.offset;
                                hq6.f(wibVar2, i8, messageEntity.length + i8, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                ?? obj4 = new Object();
                                obj4.a |= 2;
                                wib wibVar3 = new wib(obj4, 0);
                                int i9 = messageEntity.offset;
                                hq6.f(wibVar3, i9, messageEntity.length + i9, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                ?? obj5 = new Object();
                                obj5.a |= 8;
                                wib wibVar4 = new wib(obj5, 0);
                                int i10 = messageEntity.offset;
                                hq6.f(wibVar4, i10, messageEntity.length + i10, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                ?? obj6 = new Object();
                                obj6.a |= 16;
                                wib wibVar5 = new wib(obj6, 0);
                                int i11 = messageEntity.offset;
                                hq6.f(wibVar5, i11, messageEntity.length + i11, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                i4c i4cVar = new i4c(messageEntity.url, null);
                                int i12 = messageEntity.offset;
                                spannableStringBuilder.setSpan(i4cVar, i12, messageEntity.length + i12, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) {
                                ?? obj7 = new Object();
                                obj7.a |= 128;
                                int i13 = messageEntity.offset;
                                obj7.b = i13;
                                obj7.c = i13 + messageEntity.length;
                                obj7.d = messageEntity;
                                int i14 = messageEntity.offset;
                                im4 im4Var = new im4(spannableStringBuilder.subSequence(i14, messageEntity.length + i14).toString(), obj7, (TLRPC.TL_messageEntityFormattedDate) messageEntity);
                                int i15 = messageEntity.offset;
                                spannableStringBuilder.setSpan(im4Var, i15, messageEntity.length + i15, 33);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                ?? obj8 = new Object();
                                obj8.a |= 256;
                                wib wibVar6 = new wib(obj8, 0);
                                int i16 = messageEntity.offset;
                                hq6.f(wibVar6, i16, messageEntity.length + i16, spannableStringBuilder, true);
                            } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                if (tL_messageEntityCustomEmoji.document != null) {
                                    gmVar = new gm(tL_messageEntityCustomEmoji.document, fontMetricsInt);
                                } else {
                                    gmVar = new gm(tL_messageEntityCustomEmoji.document_id, fontMetricsInt);
                                }
                                int i17 = messageEntity.offset;
                                spannableStringBuilder.setSpan(gmVar, i17, messageEntity.length + i17, 33);
                            }
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
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
                        ey8.c(spannableStringBuilder, i21, i24, z4);
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
                ey8.c(spannableStringBuilder, i21, spannableStringBuilder.length(), z4);
            }
        } else {
            z = true;
        }
        CharSequence m = vu3.m(new SpannableStringBuilder(spannableStringBuilder), fontMetricsInt, false, null, 0);
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
                fa4.g(e2, z);
            }
        }
        return m;
    }

    public void setHintGlass(je5 je5Var) {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            je5Var.k(mu1Var.L);
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
        ly1 ly1Var = this.G0;
        ly1Var.setVisibility(i);
        if (z) {
            if (ly1Var.b) {
                f = 26.0f;
            } else {
                f = 16.0f;
            }
            i2 = gl.L(f);
        } else {
            i2 = 0;
        }
        ex1 ex1Var = this.F0;
        if (ex1Var != null && ex1Var.getPaddingRight() != i2) {
            this.F0.setPadding(0, gl.L(9.0f), i2, gl.L(10.0f));
        }
    }

    public final boolean A() {
        cy1 B = B();
        if (!TextUtils.equals(B.a, this.S2.a) || !hq6.M(this.S2.b, B.b)) {
            return true;
        }
        return false;
    }

    public final gjc A0() {
        gjc gjcVar = this.r1;
        if (gjcVar == null) {
            gjc gjcVar2 = new gjc(getContext(), new c(this));
            this.r1 = gjcVar2;
            return gjcVar2;
        }
        return gjcVar;
    }

    public final void A1(defpackage.k27 r5, boolean r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.A1(k27, boolean, boolean):void");
    }

    public final boolean A2() {
        ex1 ex1Var;
        if (this.s1 && ((ex1Var = this.F0) == null || ex1Var.length() == 0)) {
            this.s1 = false;
        }
        return this.s1;
    }

    public final cy1 B() {
        CharSequence textToUse;
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            textToUse = "";
        } else {
            textToUse = ex1Var.getTextToUse();
        }
        CharSequence[] charSequenceArr = {gl.m1(textToUse)};
        ArrayList Y = hq6.d0(this.R).Y(charSequenceArr, true, true);
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

    public final void B1(k27 k27Var, String str, boolean z, boolean z2) {
        ex1 ex1Var;
        TLRPC.User user;
        x3a b;
        String str2;
        if (str != null && getVisibility() == 0 && (ex1Var = this.F0) != null) {
            j1a j1aVar = null;
            r16 = null;
            TLRPC.User user2 = null;
            if (z) {
                String obj = ex1Var.getText().toString();
                if (k27Var != null && cf3.y(this.G3)) {
                    user2 = na7.q1(this.S.a).V1(Long.valueOf(k27Var.k.from_id.user_id));
                }
                TLRPC.User user3 = user2;
                if ((this.e3 != 1 || z2) && user3 != null && user3.bot && !str.contains("@")) {
                    Locale locale = Locale.US;
                    str2 = tb4.y(str, "@", l7c.p(user3)) + " " + obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", "");
                } else {
                    StringBuilder k = b00.k(str, " ");
                    k.append(obj.replaceFirst("^/[a-zA-Z@\\d_]{1,255}(\\s|$)", ""));
                    str2 = k.toString();
                }
                this.H3 = true;
                this.F0.setText(str2);
                ex1 ex1Var2 = this.F0;
                ex1Var2.setSelection(ex1Var2.getText().length());
                this.H3 = false;
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    hy1Var.C0(this.F0.getText(), true, false);
                }
                if (!this.p3 && this.V2 == -1) {
                    h1();
                }
            } else if (this.H0 > 0 && !c()) {
                hy1 hy1Var2 = this.P3;
                if (hy1Var2 != null) {
                    ly1 ly1Var = this.G0;
                    hy1Var2.O0(ly1Var, ((jia) ly1Var.c).getText(), true);
                }
            } else {
                if (k27Var != null && cf3.y(this.G3)) {
                    user = na7.q1(this.S.a).V1(Long.valueOf(k27Var.k.from_id.user_id));
                } else {
                    user = null;
                }
                if ((this.e3 != 1 || z2) && user != null && user.bot && !str.contains("@")) {
                    Locale locale2 = Locale.US;
                    b = x3a.b(tb4.y(str, "@", l7c.p(user)), this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                } else {
                    b = x3a.b(str, this.G3, this.J3, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                }
                mu1 mu1Var = this.F3;
                if (mu1Var != null) {
                    j1aVar = mu1Var.Q6();
                }
                b.K = j1aVar;
                b.O = this.O6;
                this.O6 = 0L;
                this.K0.setEffect(0L);
                u(b);
                z3a.B(this.R).q0(b);
            }
        }
    }

    public final void B2(int i) {
        byte b;
        if (!this.l1) {
            if (this.r1 != null || na7.c1().getBoolean("asr_live_text", true)) {
                gjc gjcVar = this.r1;
                if (gjcVar != null && gjcVar.J && ((b = gjcVar.c) == 2 || b == 4)) {
                    if (i != 1 && i != 2 && i != 4 && i != 5) {
                        gl.c3(new uv1(this, (byte) 10));
                        return;
                    }
                    gjcVar.j("field: record state " + i, true);
                } else if (gjcVar != null && gjcVar.c == 3) {
                    if (i == 1 || i == 2 || i == 4 || i == 5 || i == 0) {
                        gjcVar.j("review: record state " + i, true);
                    }
                } else if (i != 0) {
                    if (gjcVar != null) {
                        gjcVar.j("record state " + i, true);
                    }
                } else {
                    gl.c3(new uv1(this, (byte) 10));
                }
            }
        }
    }

    public final float C(boolean z) {
        float f;
        float f2;
        int i;
        fm0 fm0Var = this.g7;
        y74 y74Var = this.f7;
        if (z) {
            if (y74Var.h) {
                f = y74Var.g;
            } else {
                f = y74Var.f;
            }
            f2 = fm0Var.f ? 1.0f : 0.0f;
        } else {
            f = y74Var.f;
            f2 = fm0Var.e;
        }
        View view = this.w2;
        if (view != null) {
            i = view.getMeasuredHeight();
        } else {
            i = 0;
        }
        return (i * f2) + f;
    }

    public final j92 C0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof j92) {
                return (j92) parent;
            }
        }
        return null;
    }

    public final void C1(int i, long j) {
        this.G3 = j;
        gl.c3(new av1(this, (byte) 23));
        if (this.R != i) {
            this.A4.e();
            kk7 f = kk7.f(this.R);
            int i2 = kk7.k2;
            f.n(this, i2);
            kk7 f2 = kk7.f(this.R);
            int i3 = kk7.n2;
            f2.n(this, i3);
            kk7 f3 = kk7.f(this.R);
            int i4 = kk7.o2;
            f3.n(this, i4);
            kk7 f4 = kk7.f(this.R);
            int i5 = kk7.l2;
            f4.n(this, i5);
            kk7 f5 = kk7.f(this.R);
            int i6 = kk7.W5;
            f5.n(this, i6);
            kk7 f6 = kk7.f(this.R);
            int i7 = kk7.m2;
            f6.n(this, i7);
            kk7 f7 = kk7.f(this.R);
            int i8 = kk7.j2;
            f7.n(this, i8);
            kk7 f8 = kk7.f(this.R);
            int i9 = kk7.s;
            f8.n(this, i9);
            kk7 f9 = kk7.f(this.R);
            int i10 = kk7.r2;
            f9.n(this, i10);
            kk7 f10 = kk7.f(this.R);
            int i11 = kk7.t2;
            f10.n(this, i11);
            kk7 f11 = kk7.f(this.R);
            int i12 = kk7.d2;
            f11.n(this, i12);
            kk7 f12 = kk7.f(this.R);
            int i13 = kk7.y0;
            f12.n(this, i13);
            kk7 f13 = kk7.f(this.R);
            int i14 = kk7.K;
            f13.n(this, i14);
            kk7 f14 = kk7.f(this.R);
            int i15 = kk7.m1;
            f14.n(this, i15);
            kk7 f15 = kk7.f(this.R);
            int i16 = kk7.s2;
            f15.n(this, i16);
            kk7 f16 = kk7.f(this.R);
            int i17 = kk7.S2;
            f16.n(this, i17);
            kk7 f17 = kk7.f(this.R);
            int i18 = kk7.Z2;
            f17.n(this, i18);
            kk7 f18 = kk7.f(this.R);
            int i19 = kk7.h5;
            f18.n(this, i19);
            kk7 f19 = kk7.f(this.R);
            int i20 = kk7.R3;
            f19.n(this, i20);
            this.R = i;
            this.S = j5.a(i);
            kk7.f(this.R).b(this, i2);
            kk7.f(this.R).b(this, i3);
            kk7.f(this.R).b(this, i4);
            kk7.f(this.R).b(this, i5);
            kk7.f(this.R).b(this, i6);
            kk7.f(this.R).b(this, i7);
            kk7.f(this.R).b(this, i8);
            kk7.f(this.R).b(this, i9);
            kk7.f(this.R).b(this, i10);
            kk7.f(this.R).b(this, i11);
            kk7.f(this.R).b(this, i12);
            kk7.f(this.R).b(this, i13);
            kk7.f(this.R).b(this, i14);
            kk7.f(this.R).b(this, i15);
            kk7.f(this.R).b(this, i16);
            kk7.f(this.R).b(this, i17);
            kk7.f(this.R).b(this, i18);
            kk7.f(this.R).b(this, i19);
            kk7.f(this.R).b(this, i20);
        }
        boolean z = true;
        this.A0 = true;
        if (cf3.y(this.G3)) {
            this.A0 = hc2.q(na7.q1(this.S.a).K0(Long.valueOf(-this.G3)));
        }
        u2(false);
        o2(false);
        M();
        I();
        m2(false);
        if (this.F0 != null) {
            mu1 mu1Var = this.F3;
            if (mu1Var == null || !mu1Var.getFragmentBeginToShow()) {
                z = false;
            }
            v2(z);
        }
    }

    public final void C2() {
        if ((this.r1 != null || wxe.a()) && !this.O2 && !this.l1) {
            A0().t();
        }
    }

    public final void D() {
        a6 a6Var = this.e1;
        if (a6Var != null) {
            a6Var.setVisibility(8);
        }
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.setVisibility(8);
        }
        this.j3 = null;
        U0();
        if (this.f2 != null) {
            this.y = 0.0f;
            g2();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.setCancelToProgress(0.0f);
        }
        this.P3.a();
        v2(true);
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

    public final void D1(defpackage.k27 r19, defpackage.f27 r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.D1(k27, f27, boolean):void");
    }

    public final void E() {
        int i;
        if (this.U2 && this.d1) {
            hy1 hy1Var = this.P3;
            if (this.P) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            hy1Var.k1(5, 0, i, this.O6, 0L, true);
            this.O6 = 0L;
            this.K0.setEffect(0L);
        } else {
            this.P3.n0(0);
            MediaController.w().A0(0, 0, false, false);
        }
        this.v3 = false;
        r2(2, true);
    }

    public final boolean E0(float[] fArr) {
        ow1 ow1Var = this.K0;
        if (ow1Var != null && ow1Var.o0) {
            ow1Var.getLocationInWindow(r2);
            int[] iArr = {iArr[0] - Math.round(ow1Var.getTranslationX()), iArr[1] - Math.round(ow1Var.getTranslationY())};
            View rootView = ow1Var.getRootView();
            if (rootView == null || rootView.getWidth() <= 0 || ((iArr[0] + ow1Var.j0) - ow1Var.l0 <= rootView.getWidth() && iArr[0] + ow1Var.j0 + ow1Var.l0 >= 0.0f)) {
                int i = iArr[0];
                fArr[0] = i + ow1Var.j0;
                int i2 = iArr[1];
                fArr[1] = i2 + ow1Var.k0;
                fArr[2] = ow1Var.l0;
                fArr[3] = i + ow1Var.m0;
                fArr[4] = i2 + ow1Var.n0;
                return true;
            }
        }
        return false;
    }

    public final void E1(boolean z, boolean z2) {
        int currentPage;
        oy1 oy1Var;
        ex1 ex1Var;
        cw1 cw1Var;
        ew1 ew1Var = this.R0;
        if (ew1Var != null) {
            if (this.m3 || ((cw1Var = this.f1) != null && cw1Var.getVisibility() == 0)) {
                this.h = 0.0f;
                this.n = 0.0f;
                l2();
                z2 = false;
            }
            oy1 oy1Var2 = oy1.f;
            oy1 oy1Var3 = oy1.e;
            if (z && this.V2 == 0) {
                if (this.A0) {
                    oy1Var = oy1.d;
                } else {
                    return;
                }
            } else {
                wx1 wx1Var = this.V0;
                if (wx1Var == null) {
                    currentPage = na7.b1().getInt("selected_page", 0);
                } else {
                    currentPage = wx1Var.getCurrentPage();
                }
                if (currentPage != 0 && ((this.z3 || this.A3) && ((ex1Var = this.F0) == null || TextUtils.isEmpty(ex1Var.getText())))) {
                    if (currentPage == 1) {
                        oy1Var = oy1.c;
                    } else {
                        oy1Var = oy1Var2;
                    }
                } else {
                    oy1Var = oy1Var3;
                }
            }
            if (!this.A0 && oy1Var == oy1Var3) {
                oy1Var3 = oy1Var2;
            } else if (this.b || oy1Var == oy1Var3) {
                oy1Var3 = oy1Var;
            }
            ew1Var.j(oy1Var3, z2);
            if (oy1Var3 == oy1Var2 && this.V0 == null) {
                hq6.d0(this.R).X0(true, true, false, 0);
                ArrayList arrayList = na7.q1(this.R).x3;
                int min = Math.min(10, arrayList.size());
                for (int i = 0; i < min; i++) {
                    vu3.k((CharSequence) arrayList.get(i));
                }
            }
        }
    }

    public final int F0(int i) {
        wjb wjbVar = this.L4;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    public final void F1() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.E3.getSystemService("accessibility");
        if (this.F0 != null && !accessibilityManager.isTouchExplorationEnabled()) {
            try {
                this.F0.requestFocus();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final AnimatorSet F2() {
        a aVar = this.a1;
        if (aVar == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(aVar, View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(aVar, View.SCALE_Y, 0.6f, 1.0f));
        animatorSet.setStartDelay(60L);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(s33.g);
        return animatorSet;
    }

    public final void G() {
        gw1 gw1Var;
        mu1 mu1Var;
        if (this.M == null && (gw1Var = this.A2) != null && gw1Var.getRight() != 0 && (mu1Var = this.F3) != null && oj0.d(mu1Var.s8)) {
            SharedPreferences sharedPreferences = na7.q1(this.R).X3;
            if (sharedPreferences.getBoolean(Calendar.getInstance().get(1) + "bdayhint_" + mu1Var.a(), true)) {
                SharedPreferences.Editor edit = na7.q1(this.R).X3.edit();
                edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + mu1Var.a(), false).apply();
                je5 je5Var = new je5(getContext(), 3);
                this.M = je5Var;
                je5Var.q(13.0f);
                setHintGlass(this.M);
                this.M.p(true);
                x1();
                this.M.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
                this.M.o(1.0f, -((getWidth() - gl.L(12.0f)) - ((this.A2.getMeasuredWidth() / 2.0f) + (this.A2.getX() + (this.f2.getX() + this.o2.getX())))));
                addView(this.M, nme.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
                je5 je5Var2 = this.M;
                je5Var2.r0 = new av1(this, (byte) 26);
                je5Var2.d = 8000L;
                je5Var2.v();
            }
        }
    }

    public final boolean G0() {
        if (this.p7 == 3) {
            return true;
        }
        return false;
    }

    public final void G1(CharSequence charSequence, boolean z) {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            this.H3 = true;
            ex1Var.setText(charSequence);
            this.F0.g(true);
            ex1 ex1Var2 = this.F0;
            ex1Var2.setSelection(ex1Var2.getText().length());
            this.H3 = false;
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                hy1Var.C0(this.F0.getText(), true, z);
            }
        }
    }

    public final void H() {
        boolean z;
        ex1 ex1Var = this.F0;
        if ((ex1Var == null || TextUtils.isEmpty(ex1Var.getText())) && !this.p3 && !this.a4 && !Q0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            U();
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
                ew1 ew1Var = this.R0;
                Float valueOf = Float.valueOf(ew1Var.getX());
                HashMap hashMap = this.C0;
                hashMap.put(ew1Var, valueOf);
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    hashMap.put(ex1Var2, Float.valueOf(ex1Var2.getX()));
                }
            }
        }
    }

    public final boolean H0() {
        ex1 ex1Var = this.F0;
        if (ex1Var != null && ex1Var.length() > 0) {
            return true;
        }
        return false;
    }

    public final void H1(boolean z, boolean z2) {
        this.x3 = z;
        N(z2);
    }

    public final void I() {
        mu1 mu1Var = this.F3;
        if (mu1Var == null) {
            return;
        }
        q2(mu1Var.e, mu1Var.s8);
    }

    public final void I0() {
        je5 je5Var = this.O;
        if (je5Var != null) {
            je5Var.f(true);
        }
        je5 je5Var2 = this.M;
        if (je5Var2 != null) {
            je5Var2.f(true);
        }
    }

    public void I1(float f, float f2, float f3, boolean z) {
        int i;
        int i2;
        ex1 ex1Var;
        float f4;
        float f5 = 1.0f - f3;
        float f6 = f * f5;
        float f7 = f2 * f5;
        this.r = (f3 * 0.5f) + 0.5f;
        this.s = f3;
        l2();
        float f8 = -f6;
        this.R0.setTranslationX(f8);
        if (this.F0 == null) {
            i2 = 0;
        } else {
            int L = gl.L(40.0f);
            k4a k4aVar = this.q0;
            if (k4aVar != null && k4aVar.getVisibility() == 0) {
                i = gl.L(18.0f);
            } else {
                i = 0;
            }
            i2 = L + i;
        }
        this.I = f8 - (i2 * f5);
        ry8 ry8Var = this.h1;
        if (ry8Var != null) {
            ry8Var.setTranslationX(f8);
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
        cw1 cw1Var = this.q2;
        cw1Var.setTranslationX(f7);
        this.z1 = f3;
        cw1Var.setAlpha((1.0f - this.y1) * f3);
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
        g2();
        p2();
        float f9 = f6 * f5;
        if (this.J != f9) {
            this.J = f9;
            i29 i29Var = this.i1;
            if (i29Var != null) {
                i29Var.setTranslationX(f9);
                this.i1.invalidate();
            }
        }
        if (this.F0 != null) {
            float R1 = gl.R1(0.88f, 1.0f, f3);
            this.F0.setPivotX(0.0f);
            this.F0.setPivotY(ex1Var.getMeasuredHeight() / 2.0f);
            this.F0.setScaleX(R1);
            this.F0.setScaleY(R1);
            this.F0.setHintRightOffset(gl.U1(f3, gl.L(60.0f), 0));
        }
    }

    public final void J(boolean z) {
        String str;
        boolean z2;
        k27 k27Var;
        if (getEditText() != null) {
            str = getEditText().toString();
        } else {
            str = null;
        }
        boolean z3 = false;
        if (this.G3 < 0 && this.M4 && this.P2 == null && (t34.g(this.R).e(str, this.X6) > 0 || ((k27Var = this.J3) != null && k27.c3(k27Var.k)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        fm0 fm0Var = this.i7;
        if (fm0Var.f != z2) {
            z3 = true;
        }
        fm0Var.a(z2, z);
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            ow1Var.y = z2;
            ow1Var.invalidate();
        }
        if (z3) {
            N(z);
        }
    }

    public final void J0(boolean z) {
        K0(z, false, true);
    }

    public final void J1(boolean z) {
        int i;
        int i2;
        if (this.o7 == z) {
            return;
        }
        this.o7 = z;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        this.h2.setVisibility(i);
        if (z) {
            gl.B2(this.y2);
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
            p1();
            this.d0 = -1;
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setVisibility(8);
            }
        }
        n2(this.L6);
        N(false);
    }

    public final boolean K0(boolean z, boolean z2, boolean z3) {
        boolean z4;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        if (Q0()) {
            if (this.V2 == 1 && (tL_replyKeyboardMarkup = this.d3) != null && z && this.c3 != null) {
                if (!tL_replyKeyboardMarkup.is_persistent) {
                    na7.q1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
            }
            if ((z && this.H2 != 0) || z2) {
                O1(0, true);
                wx1 wx1Var = this.V0;
                if (wx1Var != null) {
                    wx1Var.s(true);
                }
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ex1Var.requestFocus();
                }
                P1(false, true, false, true);
                if (this.o4) {
                    N(true);
                    return true;
                }
            } else if (this.H2 != 0) {
                O1(0, false);
                this.V0.s(false);
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    ex1Var2.requestFocus();
                }
            } else if (this.p4) {
                P1(false, true, false, true);
                return true;
            } else {
                if (z3 && !z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                W1(0, 0, true, z4);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void K1(boolean z) {
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
                ofFloat.addUpdateListener(new pv1(this, (byte) 10));
                this.Q1.setDuration(200L);
                this.Q1.setInterpolator(s33.g);
                this.Q1.start();
                return;
            }
        }
        this.P1 = 0.0f;
        j92 C0 = C0();
        if (C0 != null) {
            C0.setInputBubbleExtraAlpha(1.0f);
        }
        cw1 cw1Var = this.f1;
        if (cw1Var != null) {
            cw1Var.invalidate();
        }
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        k27 k27Var;
        ex1 ex1Var;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        boolean z3;
        int i2;
        View view;
        int i3;
        int i4;
        byc bycVar;
        boolean z4 = false;
        if (this.H2 != 0) {
            this.B3 = i;
            this.C3 = z;
            if (i > 0) {
                z4 = true;
            }
            this.p3 = z4;
            H();
            return;
        }
        if (i > gl.L(50.0f) && this.p3 && !gl.E) {
            if (z) {
                this.o3 = i;
                na7.b1().edit().putInt("kbd_height_land3", this.o3).commit();
            } else {
                this.n3 = i;
                na7.b1().edit().putInt("kbd_height", this.n3).commit();
            }
        }
        if (this.p3 && this.X0 && this.V0 == null) {
            this.X0 = false;
        }
        boolean Q0 = Q0();
        cja cjaVar = this.c2;
        mu1 mu1Var = this.F3;
        if (Q0) {
            if (z) {
                i2 = this.o3;
            } else {
                i2 = this.n3;
            }
            if (mu1Var != null && mu1Var.getParentLayout() != null) {
                i2 -= ((ActionBarLayout) mu1Var.getParentLayout()).u(false);
            }
            if (this.V2 == 1) {
                tx1 tx1Var = this.x2;
                if (!tx1Var.f) {
                    i2 = Math.min(tx1Var.getKeyboardHeight(), i2);
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
            tx1 tx1Var2 = this.x2;
            if (tx1Var2 != null) {
                tx1Var2.setPanelHeight(i2);
                byc bycVar2 = this.d7;
                if (bycVar2 != null && i2 > 0 && this.V2 == 1) {
                    ((fyc) bycVar2).h(i2);
                }
            }
            if (view != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                if (!this.q4 && !this.p4 && (((i3 = layoutParams.width) != (i4 = gl.q.x) || layoutParams.height != i2) && ((bycVar = this.d7) == null || i3 != -1 || layoutParams.height != -1))) {
                    if (bycVar == null) {
                        layoutParams.width = i4;
                        layoutParams.height = i2;
                        view.setLayoutParams(layoutParams);
                    }
                    if (cjaVar != null) {
                        int i6 = this.q3;
                        this.q3 = layoutParams.height;
                        cjaVar.requestLayout();
                        g1();
                        if (this.Y2 && !this.p3 && i6 != this.q3 && n1()) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            if (this.d7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(this.q3 - i6, 0.0f));
                            } else {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, this.q3 - i6, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new aw1(this, (byte) 12));
                            gl.d3(this.N4, 50L);
                            this.A4.d();
                            requestLayout();
                        }
                    }
                }
            }
        }
        if (this.B3 == i && this.C3 == z) {
            g1();
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
        H();
        if (this.p3 && Q0() && this.r4 == null) {
            W1(0, this.V2, true, true);
        } else if (!this.p3 && !Q0() && (k27Var = this.c3) != null && this.J3 != k27Var && !G0() && !z() && !org.telegram.ui.ActionBar.d.hasSheets(mu1Var) && (((ex1Var = this.F0) == null || TextUtils.isEmpty(ex1Var.getText())) && (tL_replyKeyboardMarkup = this.d3) != null && !tL_replyKeyboardMarkup.rows.isEmpty())) {
            gb gbVar = cjaVar.I;
            if (gbVar.f) {
                gbVar.j();
            } else {
                gbVar.v = true;
            }
            W1(1, 1, false, true);
        }
        if (this.q3 != 0 && !(z3 = this.p3) && z3 != z5 && !Q0()) {
            this.q3 = 0;
            cjaVar.requestLayout();
        }
        if (this.p3 && this.a4) {
            this.a4 = false;
            if (this.f4) {
                this.f4 = false;
                this.x2.setButtons(this.d3);
            }
            gl.r(this.h4);
        }
        g1();
    }

    public final void L0(boolean z) {
        long j;
        ex1 ex1Var;
        AnimatorSet animatorSet;
        float f;
        float f2;
        long j2;
        float f3;
        AnimatorSet animatorSet2 = this.k3;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            if (this.K1) {
                K1(true);
            }
            this.S3 = null;
            this.R3 = null;
            this.T3 = null;
            this.U3 = null;
            scc sccVar = this.g1;
            if (sccVar != null) {
                sccVar.a(true);
            }
            mw1 mw1Var = this.c1;
            if (mw1Var != null) {
                mw1Var.setVisibility(0);
            }
            bw1 bw1Var = this.S4;
            bw1 bw1Var2 = this.O4;
            bw1 bw1Var3 = this.Q4;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            ew1 ew1Var = this.R0;
            Property property3 = View.ALPHA;
            gw1 gw1Var = this.h2;
            if (z) {
                if (gw1Var != null) {
                    this.l2 = 0.0f;
                    gw1Var.setAlpha(0.0f);
                    gw1Var.setScaleX(0.0f);
                    gw1Var.setScaleY(0.0f);
                }
                this.n = 0.0f;
                this.h = 0.0f;
                l2();
                this.k3 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (this.B0) {
                    f3 = 0.5f;
                } else {
                    f3 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ew1Var, bw1Var3, f3));
                arrayList.add(ObjectAnimator.ofFloat(ew1Var, bw1Var2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.h1, property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.f1, property3, 0.0f));
                if (gw1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator = this.g2;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(gw1Var, property3, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(gw1Var, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(gw1Var, property, 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.F0, property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.F0, bw1Var, 0.0f));
                l lVar = this.E2;
                if (lVar != null) {
                    arrayList.add(ObjectAnimator.ofFloat(lVar, property3, 0.0f));
                    this.E2.e();
                }
                this.k3.playTogether(arrayList);
                ep0 ep0Var = this.m0;
                if (ep0Var != null) {
                    ep0Var.setAlpha(0.0f);
                    this.m0.setScaleY(0.0f);
                    this.m0.setScaleX(0.0f);
                    this.k3.playTogether(ObjectAnimator.ofFloat(this.m0, property3, 1.0f), ObjectAnimator.ofFloat(this.m0, property2, 1.0f), ObjectAnimator.ofFloat(this.m0, property, 1.0f));
                }
                this.k3.setDuration(150L);
                this.k3.addListener(new aw1(this, (byte) 3));
            } else {
                boolean z2 = this.x5;
                ry8 ry8Var = this.h1;
                if (ry8Var != null && !z2) {
                    ry8Var.d();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = this.d1;
                long j3 = 600;
                Property property4 = View.TRANSLATION_X;
                if (z3) {
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, property3, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.g1, property4, -gl.L(20.0f)));
                    arrayList2.add(ObjectAnimator.ofFloat(this.F0, bw1Var, 0.0f));
                    l lVar2 = this.E2;
                    if (lVar2 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar2, property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                    int i = (this.s > 1.0f ? 1 : (this.s == 1.0f ? 0 : -1));
                    ex1 ex1Var2 = this.F0;
                    if (i == 0) {
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(ex1Var2, property3, 1.0f));
                    } else {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ex1Var2, property3, 1.0f);
                        ofFloat.setStartDelay(750L);
                        ofFloat.setDuration(200L);
                        animatorSet3.playTogether(ofFloat);
                    }
                } else {
                    long j4 = 750;
                    ex1 ex1Var3 = this.F0;
                    if (ex1Var3 != null && this.s == 1.0f && !z2) {
                        ex1Var3.setAlpha(1.0f);
                        this.H = 0.0f;
                        p2();
                    } else {
                        this.H = 0.0f;
                        p2();
                        if (z2 && (ex1Var = this.F0) != null) {
                            ex1Var.setAlpha(0.0f);
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
                            ofFloat2.setInterpolator(s33.g);
                        }
                        animatorSet3.playTogether(ofFloat2);
                    }
                    if (!z2) {
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, property3, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(this.i1, property4, -gl.L(20.0f)));
                    }
                    l lVar3 = this.E2;
                    if (lVar3 != null) {
                        arrayList2.add(ObjectAnimator.ofFloat(lVar3, property3, 0.0f));
                        this.E2.e();
                    }
                    animatorSet3.playTogether(arrayList2);
                }
                animatorSet3.setDuration(200L);
                if (gw1Var != null) {
                    ViewPropertyAnimator viewPropertyAnimator2 = this.g2;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.cancel();
                        this.g2 = null;
                    }
                    this.l2 = 0.0f;
                    gw1Var.setAlpha(0.0f);
                    gw1Var.setScaleX(0.0f);
                    gw1Var.setScaleY(0.0f);
                    animatorSet = new AnimatorSet();
                    this.l2 = 1.0f;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(gw1Var, property3, 1.0f), ObjectAnimator.ofFloat(gw1Var, property2, 1.0f), ObjectAnimator.ofFloat(gw1Var, property, 1.0f));
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
                l2();
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
                animatorSet4.playTogether(ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(ew1Var, bw1Var3, f2), ObjectAnimator.ofFloat(ew1Var, bw1Var2, 1.0f));
                ep0 ep0Var2 = this.m0;
                if (ep0Var2 != null) {
                    ep0Var2.setAlpha(0.0f);
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
                    animatorSet4.setInterpolator(s33.g);
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

    public final void L1(CharSequence charSequence, boolean z) {
        this.e = charSequence;
        this.f = null;
        m2(z);
    }

    public final void M() {
        boolean z;
        boolean z2;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        if (this.U2) {
            return;
        }
        if (this.f2 == null) {
            this.U2 = false;
            M1(false, false);
            return;
        }
        boolean z3 = true;
        this.U2 = true;
        this.y0 = true;
        this.z0 = true;
        if (cf3.y(this.G3)) {
            TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
            if (hc2.T(K0) && !K0.megagroup) {
                z = true;
            } else {
                z = false;
            }
            if (z && !K0.creator && ((tL_chatAdminRights = K0.admin_rights) == null || !tL_chatAdminRights.post_messages)) {
                this.U2 = false;
            }
            this.y0 = hc2.s(K0);
            this.z0 = hc2.v(K0);
        } else {
            z = false;
        }
        if (!gba.v0) {
            this.U2 = false;
        }
        if (this.U2) {
            if (gba.L0) {
                CameraController.getInstance().initCamera(null);
            }
            SharedPreferences c1 = na7.c1();
            if (z) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            z2 = c1.getBoolean(str, z);
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
        M1(z3, false);
    }

    public final void M0() {
        q1();
        this.S3 = null;
        this.R3 = null;
        this.T3 = null;
        this.U3 = null;
        scc sccVar = this.g1;
        if (sccVar != null) {
            sccVar.a(true);
        }
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.setAlpha(1.0f);
            this.i1.setTranslationX(0.0f);
        }
        scc sccVar2 = this.g1;
        if (sccVar2 != null) {
            sccVar2.setAlpha(1.0f);
            this.g1.setTranslationX(0.0f);
        }
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setAlpha(1.0f);
            this.H = 0.0f;
            p2();
            this.F0.requestFocus();
        }
        cw1 cw1Var = this.f1;
        if (cw1Var != null) {
            cw1Var.setVisibility(8);
        }
        U0();
    }

    public final void M1(boolean z, boolean z2) {
        oy1 oy1Var;
        int i;
        String M0;
        String str;
        mw1 mw1Var = this.c1;
        if (mw1Var == null) {
            return;
        }
        this.d1 = z;
        if (z2) {
            SharedPreferences c1 = na7.c1();
            boolean z3 = false;
            if (cf3.y(this.G3)) {
                TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
                if (hc2.T(K0) && !K0.megagroup) {
                    z3 = true;
                }
            }
            SharedPreferences.Editor edit = c1.edit();
            if (z3) {
                str = "currentModeVideoChannel";
            } else {
                str = "currentModeVideo";
            }
            edit.putBoolean(str, z).apply();
        }
        if (this.d1) {
            oy1Var = oy1.b;
        } else {
            oy1Var = oy1.a;
        }
        mw1Var.j(oy1Var, z2);
        int i2 = 2131754733;
        if (this.d1) {
            i = 2131754735;
        } else {
            i = 2131754733;
        }
        mw1Var.setContentDescription(k96.M0(i, null));
        if (g0()) {
            M0 = k96.M0(2131754874, null);
        } else {
            if (this.d1) {
                i2 = 2131754735;
            }
            M0 = k96.M0(i2, null);
        }
        this.a1.setContentDescription(M0);
        i0();
        jy1 jy1Var = this.b2;
        if (jy1Var != null) {
            jy1Var.d(g0());
        }
        mw1Var.sendAccessibilityEvent(8);
    }

    public final void N(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.N(boolean):void");
    }

    public void N0(boolean z) {
        if (this.w2 != null && this.V3) {
            uv1 uv1Var = this.W;
            if (uv1Var != null) {
                gl.r(uv1Var);
            }
            this.V3 = false;
            this.W3 = false;
            if (this.X3) {
                this.g7.a(false, z);
            }
        }
    }

    public final void N1(k27 k27Var, bu1 bu1Var, k27 k27Var2) {
        boolean z;
        k27 k27Var3;
        mu1 mu1Var = this.F3;
        if (mu1Var != null && mu1Var.N7() && this.K3 != k27Var2) {
            z = true;
        } else {
            z = false;
        }
        TL_stories.StoryItem storyItem = null;
        if (k27Var != null) {
            if (this.M3 == null && (k27Var3 = this.c3) != this.J3) {
                this.M3 = k27Var3;
            }
            this.J3 = k27Var;
            this.L3 = bu1Var;
            this.K3 = k27Var2;
            if (mu1Var == null || !mu1Var.x4 || mu1Var.m4 != k27Var) {
                A1(k27Var, true, true);
            }
        } else if (this.J3 == this.c3) {
            this.J3 = null;
            this.K3 = null;
            this.L3 = null;
            A1(this.M3, true, false);
            this.M3 = null;
        } else {
            this.J3 = null;
            this.L3 = null;
            this.K3 = null;
        }
        J(true);
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            storyItem = hy1Var.t0();
        }
        MediaController w = MediaController.w();
        k27 threadMessage = getThreadMessage();
        w.r1 = k27Var;
        w.s1 = threadMessage;
        w.t1 = storyItem;
        m2(z);
    }

    public final void O() {
        int i;
        if (this.V0 != null) {
            Point point = gl.q;
            if (point.x > point.y) {
                i = this.o3;
            } else {
                i = this.n3;
            }
            int L = ((((this.e2 - gl.m) - gl.n) - gl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
            if (this.H2 == 2) {
                L = Math.min(L, gl.L(175.0f) + i);
            }
            int i2 = this.V0.getLayoutParams().height;
            if (i2 != L) {
                AnimatorSet animatorSet = this.r4;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.r4 = null;
                }
                this.t4 = L;
                ax1 ax1Var = this.j4;
                if (i2 > L) {
                    av1 av1Var = new av1(this, (byte) 17);
                    this.V0.setLayerType(2, null);
                    if (this.w) {
                        this.x = av1Var;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        byc bycVar = this.d7;
                        int i3 = this.t4 - i;
                        if (bycVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i3), ValueAnimator.ofInt(-(this.t4 - i)));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, ax1Var, -i3), ObjectAnimator.ofInt(this.V0, ax1Var, -(this.t4 - i)));
                            ((ObjectAnimator) animatorSet2.getChildAnimations().get(0)).addUpdateListener(new pv1(this, (byte) 2));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(s33.f);
                        animatorSet2.addListener(new u5(this, av1Var, (byte) 13));
                        this.r4 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    if (this.d7 == null) {
                        this.V0.getLayoutParams().height = this.t4;
                    }
                    this.c2.requestLayout();
                    ex1 ex1Var = this.F0;
                    if (ex1Var != null) {
                        int selectionStart = ex1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        ex1 ex1Var2 = this.F0;
                        ex1Var2.setText(ex1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    byc bycVar2 = this.d7;
                    int i4 = this.t4 - i;
                    if (bycVar2 != null) {
                        animatorSet3.playTogether(ValueAnimator.ofInt(-i4), ValueAnimator.ofInt(-(this.t4 - i)));
                    } else {
                        animatorSet3.playTogether(ObjectAnimator.ofInt(this, ax1Var, -i4), ObjectAnimator.ofInt(this.V0, ax1Var, -(this.t4 - i)));
                        ((ObjectAnimator) animatorSet3.getChildAnimations().get(0)).addUpdateListener(new pv1(this, (byte) 3));
                    }
                    animatorSet3.setDuration(300L);
                    animatorSet3.setInterpolator(s33.f);
                    animatorSet3.addListener(new aw1(this, (byte) 0));
                    this.r4 = animatorSet3;
                    this.V0.setLayerType(2, null);
                    animatorSet3.start();
                }
                byc bycVar3 = this.d7;
                if (bycVar3 != null) {
                    ((fyc) bycVar3).h(L);
                }
            }
        }
    }

    public final boolean O0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.O0():boolean");
    }

    public final void O1(int i, boolean z) {
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
                wx1 wx1Var = this.V0;
                if (wx1Var != null) {
                    wx1Var.Z();
                }
            } else {
                float f2 = this.x0;
                if (z2) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.w0 = ofFloat;
                ofFloat.addUpdateListener(new pv1(this, (byte) 4));
                this.w0.addListener(new rw1(this, z2, (byte) 4));
                this.w0.setDuration(220L);
                this.w0.setInterpolator(s33.f);
                this.w0.start();
            }
        }
        this.H2 = i;
    }

    public final void P() {
        this.k7 = C(true);
        p0();
        float C = C(false);
        if (this.j7 != C) {
            this.j7 = C;
            a1(C);
        }
    }

    public final boolean P0() {
        if (this.P2 != null) {
            return true;
        }
        return false;
    }

    public final void P1(boolean z, boolean z2, boolean z3, boolean z4) {
        final int i;
        gb gbVar = this.V;
        if ((gbVar == null || !gbVar.f) && !this.b4 && this.V0 != null) {
            if (z3 || this.p4 != z) {
                this.p4 = z;
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    hy1Var.L0();
                }
                Point point = gl.q;
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
                on onVar = this.A4;
                ax1 ax1Var = this.j4;
                cja cjaVar = this.c2;
                if (z5) {
                    if (z4) {
                        kk7.e().k(kk7.i1, 1);
                    }
                    int height = cjaVar.getHeight();
                    this.e2 = height;
                    int L = ((((height - gl.m) - gl.n) - gl.L(6.0f)) - org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - getHeight();
                    this.t4 = L;
                    if (this.H2 == 2) {
                        this.t4 = Math.min(L, gl.L(175.0f) + i);
                    }
                    if (this.d7 == null) {
                        this.V0.getLayoutParams().height = this.t4;
                    }
                    cjaVar.requestLayout();
                    if (this.X5) {
                        cjaVar.setForeground(new qa1(this));
                    }
                    ex1 ex1Var = this.F0;
                    if (ex1Var != null) {
                        int selectionStart = ex1Var.getSelectionStart();
                        int selectionEnd = this.F0.getSelectionEnd();
                        ex1 ex1Var2 = this.F0;
                        ex1Var2.setText(ex1Var2.getText());
                        this.F0.setSelection(selectionStart, selectionEnd);
                    }
                    if (z2) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        byc bycVar = this.d7;
                        int i2 = this.t4 - i;
                        if (bycVar != null) {
                            animatorSet2.playTogether(ValueAnimator.ofInt(-i2), ValueAnimator.ofInt(-(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                        } else {
                            animatorSet2.playTogether(ObjectAnimator.ofInt(this, ax1Var, -i2), ObjectAnimator.ofInt(this.V0, ax1Var, -(this.t4 - i)), ObjectAnimator.ofFloat(this.v4, "animationProgress", 1.0f));
                        }
                        animatorSet2.setDuration(300L);
                        animatorSet2.setInterpolator(s33.f);
                        if (this.d7 == null) {
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
                                            int i4 = ChatActivityEnterView.r7;
                                            chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                        default:
                                            int i5 = ChatActivityEnterView.r7;
                                            chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet2.addListener(new aw1(this, (byte) 1));
                        this.r4 = animatorSet2;
                        this.V0.setLayerType(2, null);
                        onVar.d();
                        this.s4 = 0.0f;
                        cjaVar.invalidate();
                        animatorSet2.start();
                    } else {
                        this.s4 = 1.0f;
                        if (this.d7 == null) {
                            setTranslationY(-(this.t4 - i));
                            this.V0.setTranslationY(-(this.t4 - i));
                        }
                        AnimatedArrowDrawable animatedArrowDrawable = this.v4;
                        if (animatedArrowDrawable != null) {
                            animatedArrowDrawable.setAnimationProgress(1.0f);
                        }
                    }
                    byc bycVar2 = this.d7;
                    if (bycVar2 != null) {
                        ((fyc) bycVar2).h(this.t4);
                    }
                } else {
                    if (z4) {
                        kk7.e().k(kk7.j1, 1);
                    }
                    if (z2) {
                        this.q4 = true;
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        if (this.d7 != null) {
                            animatorSet3.playTogether(ValueAnimator.ofInt(0), ValueAnimator.ofInt(0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                        } else {
                            animatorSet3.playTogether(ObjectAnimator.ofInt(this, ax1Var, 0), ObjectAnimator.ofInt(this.V0, ax1Var, 0), ObjectAnimator.ofFloat(this.v4, "animationProgress", 0.0f));
                        }
                        animatorSet3.setDuration(300L);
                        animatorSet3.setInterpolator(s33.f);
                        if (this.d7 == null) {
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
                                            int i4 = ChatActivityEnterView.r7;
                                            chatActivityEnterView.s4 = Math.abs(chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3)));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                        default:
                                            int i5 = ChatActivityEnterView.r7;
                                            chatActivityEnterView.s4 = chatActivityEnterView.getTranslationY() / (-(chatActivityEnterView.t4 - i3));
                                            chatActivityEnterView.c2.invalidate();
                                            return;
                                    }
                                }
                            });
                        }
                        animatorSet3.addListener(new cn(this, i, (byte) 3));
                        this.s4 = 1.0f;
                        cjaVar.invalidate();
                        this.r4 = animatorSet3;
                        this.V0.setLayerType(2, null);
                        onVar.d();
                        animatorSet3.start();
                    } else {
                        this.s4 = 0.0f;
                        if (this.d7 == null) {
                            setTranslationY(0.0f);
                            this.V0.setTranslationY(0.0f);
                            this.V0.getLayoutParams().height = i;
                        }
                        cjaVar.requestLayout();
                        cjaVar.setForeground(null);
                        cjaVar.setWillNotDraw(false);
                        AnimatedArrowDrawable animatedArrowDrawable2 = this.v4;
                        if (animatedArrowDrawable2 != null) {
                            animatedArrowDrawable2.setAnimationProgress(0.0f);
                        }
                    }
                    byc bycVar3 = this.d7;
                    if (bycVar3 != null) {
                        ((fyc) bycVar3).h(i);
                    }
                }
                gw1 gw1Var = this.T0;
                if (gw1Var != null) {
                    if (this.p4) {
                        gw1Var.setContentDescription(k96.M0(2131754893, "AccDescrCollapsePanel"));
                    } else {
                        gw1Var.setContentDescription(k96.M0(2131754883, "AccDescrExpandPanel"));
                    }
                }
            }
        }
    }

    public final void Q() {
        boolean z;
        int i;
        int i2;
        View view;
        int i3;
        float f = this.g7.e;
        if (this.w2 != null) {
            float measuredHeight = getMeasuredHeight() - this.f7.f;
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
            cw1 cw1Var = this.p2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cw1Var.getLayoutParams();
            if (z) {
                i = this.w2.getLayoutParams().height;
            } else {
                i = 0;
            }
            layoutParams.topMargin = i;
            layoutParams.topMargin = gl.L(9.0f) + i;
            cw1Var.setLayoutParams(layoutParams);
            this.I6 = z;
            int L = gl.L(44.0f);
            if (z) {
                i2 = this.w2.getLayoutParams().height;
            } else {
                i2 = 0;
            }
            setMinimumHeight(L + i2);
            if (this.p4) {
                if (this.H2 == 0) {
                    P1(false, true, false, true);
                } else {
                    O();
                }
            }
        }
    }

    public final boolean Q0() {
        if (!this.X0 && !this.Y0) {
            return false;
        }
        return true;
    }

    public final void Q1(boolean z, boolean z2) {
        boolean z3;
        float f;
        float f2;
        if (this.k5 != z || !z2) {
            ImageView imageView = this.m2;
            int i = 0;
            if (imageView == null) {
                if (z || this.o7) {
                    if (imageView == null) {
                        ImageView imageView2 = new ImageView(getContext());
                        this.m2 = imageView2;
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        ImageView imageView3 = this.m2;
                        int i2 = bkb.Ml;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        wjb wjbVar = this.L4;
                        zkb.s(imageView3, i2, wjbVar, mode);
                        this.m2.setImageResource(2131231517);
                        ImageView imageView4 = this.m2;
                        int i3 = bkb.h6;
                        zkb.R(imageView4, bkb.f0(F0(i3), 1, -1), null, zkb.M(i3), wjbVar);
                        if (this.o7) {
                            this.m2.setTranslationX(gl.L(42.0f));
                            this.p2.addView(this.m2, nme.d(44, 44.0f, 85, 0.0f, 0.0f, 50.0f, 0.0f));
                        } else {
                            this.f2.addView(this.m2, 0, nme.o(44, 44));
                        }
                        this.m2.setOnClickListener(new fv1(this, (byte) 0));
                        this.m2.setContentDescription(k96.M0(2131754921, null));
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
                if (this.o7) {
                    this.m2.setVisibility(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m2.getAlpha(), f2);
                this.l5 = ofFloat;
                ofFloat.addUpdateListener(new pv1(this, (byte) 11));
                this.l5.addListener(new rw1(this, z, (byte) 0));
                this.l5.setDuration(220L);
                this.l5.setInterpolator(s33.h);
                this.l5.start();
            } else {
                this.m2.setScaleX(f);
                this.m2.setScaleY(f);
                this.m2.setAlpha(f2);
                if (this.o7) {
                    ImageView imageView5 = this.m2;
                    if (!z) {
                        i = 8;
                    }
                    imageView5.setVisibility(i);
                }
            }
            n2(this.L6);
            if (z3) {
                N(true);
            }
        }
    }

    public final void R() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            hq6.d0(this.R).T1(mu1Var.a(), mu1Var.H5(mu1Var.F5), "", null, null, null, null, 0L, false, true, null);
        }
        setRichDraftPreview(null);
    }

    public final boolean R0(View view) {
        if (view != this.x2 && view != this.V0) {
            return false;
        }
        return true;
    }

    public final void R1(boolean z, boolean z2) {
        ojc ojcVar;
        boolean z3 = false;
        if (this.K1 && (ojcVar = this.T1) != null) {
            if (this.U1 != z || !z2) {
                this.U1 = z;
                i29 i29Var = this.i1;
                float f = 1.0f;
                if (i29Var != null) {
                    ojcVar.c(Math.round(Math.max(1.0f, (i29Var.w - i29Var.s) * i29Var.r)));
                }
                if (z) {
                    gl.r(this.X1);
                } else if (this.T1.c.hasFocus()) {
                    gl.t1(this.T1.c);
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
                    v(f);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V1, f);
                    this.W1 = ofFloat;
                    ofFloat.addUpdateListener(new pv1(this, (byte) 7));
                    this.W1.setDuration(360L);
                    this.W1.setInterpolator(s33.h);
                    this.W1.start();
                }
                ow1 ow1Var = this.K0;
                if (ow1Var != null) {
                    if (this.K1 && this.U1) {
                        z3 = true;
                    }
                    ow1Var.setIconDimmed(z3);
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

    public final void S() {
        gl.t1(this.F0);
    }

    public final boolean S0() {
        if (this.v3 && ChatActivityEnterView.this.h5) {
            return true;
        }
        return false;
    }

    public final void S1(boolean z) {
        mu1 mu1Var;
        jm3 jm3Var;
        boolean z2;
        float f;
        float f2;
        if ((z || this.t2) && (mu1Var = this.F3) != null && !mu1Var.y() && ((jm3Var = this.j1) == null || !jm3Var.o())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.j6 != z2) {
            if (z2) {
                na7.q1(this.R).O1().b();
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
            scaleX.scaleY(f3).setInterpolator(s33.h).setDuration(420L).withEndAction(new ov1(this, z2, (byte) 0)).start();
            if (z2) {
                gc gcVar = this.i2;
                Objects.requireNonNull(gcVar);
                imageView.postDelayed(new fc(gcVar, (byte) 1), 220L);
                je5 je5Var = this.N;
                if (je5Var != null) {
                    je5Var.f(true);
                    this.N = null;
                }
                if (na7.c1().getInt("aihintshown", 0) < 3) {
                    je5 je5Var2 = new je5(getContext(), 3);
                    this.N = je5Var2;
                    je5Var2.p(true);
                    this.N.t(k96.M0(2131754992, null));
                    setHintGlass(this.N);
                    this.N.o(0.0f, (imageView.getWidth() / 2.0f) + gl.L(4.0f));
                    addView(this.N, nme.d(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                    je5 je5Var3 = this.N;
                    je5Var3.r0 = new aj1(this, je5Var2, (byte) 26);
                    je5Var3.d = 4000L;
                    je5Var3.v();
                    na7.c1().edit().putInt("aihintshown", na7.c1().getInt("aihintshown", 0) + 1).apply();
                    return;
                }
                return;
            }
            je5 je5Var4 = this.N;
            if (je5Var4 != null) {
                je5Var4.f(true);
                this.N = null;
            }
        }
    }

    public final void T() {
        if (this.n2 != null) {
            return;
        }
        gw1 gw1Var = new gw1(this, getContext(), (byte) 2);
        this.n2 = gw1Var;
        l79 l79Var = new l79(getContext());
        this.K2 = l79Var;
        gw1Var.setImageDrawable(l79Var);
        l79 l79Var2 = this.K2;
        int i = bkb.Ml;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        wjb wjbVar = this.L4;
        zkb.x(this, l79Var2, i, wjbVar, mode);
        this.K2.a(2131231500, false);
        this.n2.setScaleType(ImageView.ScaleType.CENTER);
        gw1 gw1Var2 = this.n2;
        int i2 = bkb.h6;
        zkb.R(gw1Var2, bkb.f0(F0(i2), 1, -1), null, zkb.M(i2), wjbVar);
        this.n2.setVisibility(8);
        gl.T3(this.n2, false, 0.1f, true, false);
        this.f2.addView(this.n2, 0, nme.o(44, 44));
        this.n2.setOnClickListener(new fv1(this, (byte) 19));
    }

    public final boolean T0() {
        if (!this.v3) {
            AnimatorSet animatorSet = this.j3;
            if (animatorSet == null || !animatorSet.isRunning() || this.a3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void T1() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null && hc2.V(mu1Var.e)) {
            u21.b0(mu1Var).f(na7.q1(this.R).k4.h1.f(), new av1(this, (byte) 8)).j();
        }
    }

    public final void U() {
        if (this.m0 == null) {
            ep0 ep0Var = new ep0(getContext());
            this.m0 = ep0Var;
            ep0Var.setOnClickListener(new fv1(this, (byte) 11));
            this.o2.addView(this.m0, nme.d(-2, 32.0f, 83, 8.0f, 6.0f, 8.0f, 6.0f));
            gl.T3(this.m0, false, 1.0f, true, false);
            ep0 ep0Var2 = this.m0;
            if (!ep0Var2.f) {
                ep0Var2.f = true;
                ep0Var2.h = 1.0f;
                ep0Var2.requestLayout();
                ep0Var2.invalidate();
            }
        }
    }

    public boolean U1(Runnable runnable) {
        return false;
    }

    public final void V() {
        if (this.c0 != null) {
            return;
        }
        NumberTextView numberTextView = new NumberTextView(getContext());
        this.c0 = numberTextView;
        numberTextView.setVisibility(8);
        this.c0.setTextSize(15);
        this.c0.setTextColor(F0(bkb.x6));
        this.c0.setTypeface(gl.o());
        this.c0.setCenterAlign(true);
        addView(this.c0, Math.min(2, getChildCount()), nme.d(44, 20.0f, 85, 3.0f, 0.0f, 0.0f, 44.0f));
    }

    public final boolean V0() {
        if (!c() && !this.i7.f) {
            return false;
        }
        return true;
    }

    public final void V1() {
        W1(1, 0, true, true);
    }

    public final void W(boolean z) {
        if (this.v2 != null) {
            return;
        }
        ow1 ow1Var = new ow1(this, getContext(), this.L4);
        this.v2 = ow1Var;
        ow1Var.setContentDescription(k96.M0(2131751262, null));
        if (z) {
            ote.a(this.v2);
        }
        this.p2.addView(this.v2, nme.e(44, 44, 85));
    }

    public final boolean W0() {
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void W1(int i, int i2, boolean z, boolean z2) {
        byte b;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup;
        int i4;
        float f;
        if (i != 2) {
            on onVar = this.A4;
            qw1 qw1Var = this.N4;
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
                    x();
                    if (this.X0) {
                        this.V0.getVisibility();
                    }
                    this.V0.setVisibility(0);
                    this.X0 = true;
                    tx1 tx1Var = this.x2;
                    if (tx1Var != null && tx1Var.getVisibility() != 8) {
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
                    wx1 wx1Var = this.V0;
                    if (wx1Var != null && wx1Var.getVisibility() != 8) {
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
                    na7.q1(this.R).X3.edit().remove("closed_botkeyboard_" + getTopicKeyString()).apply();
                    i3 = i4;
                    viewGroup = viewGroup2;
                } else {
                    i3 = 0;
                    viewGroup = null;
                }
                this.V2 = i2;
                if (this.n3 <= 0) {
                    f = 200.0f;
                    this.n3 = na7.b1().getInt("kbd_height", gl.L(200.0f));
                } else {
                    f = 200.0f;
                }
                int i5 = this.o3;
                if (i5 <= 0) {
                    i5 = na7.b1().getInt("kbd_height_land3", gl.L(f));
                    this.o3 = i5;
                }
                Point point = gl.q;
                if (point.x <= point.y) {
                    i5 = this.n3;
                }
                mu1 mu1Var = this.F3;
                if (mu1Var != null && mu1Var.getParentLayout() != null) {
                    i5 -= ((ActionBarLayout) mu1Var.getParentLayout()).u(false);
                }
                if (i2 == 1) {
                    i5 = Math.min(this.x2.getKeyboardHeight(), i5);
                }
                tx1 tx1Var2 = this.x2;
                if (tx1Var2 != null) {
                    tx1Var2.setPanelHeight(i5);
                }
                if (viewGroup != null && this.d7 == null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = i5;
                    viewGroup.setLayoutParams(layoutParams);
                }
                if (!gl.E) {
                    gl.t1(this.F0);
                }
                cja cjaVar = this.c2;
                if (cjaVar != null) {
                    this.q3 = i5;
                    cjaVar.requestLayout();
                    E1(true, true);
                    h2(true);
                    g1();
                    if (this.Y2 && !this.p3 && i5 != i3 && z) {
                        av1 av1Var = new av1(this, (byte) 22);
                        if (this.w) {
                            this.x = av1Var;
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.W0 = animatorSet;
                            float f2 = i5 - i3;
                            if (this.d7 != null) {
                                animatorSet.playTogether(ValueAnimator.ofFloat(f2, 0.0f));
                            } else {
                                viewGroup.setTranslationY(f2);
                                this.W0.playTogether(ObjectAnimator.ofFloat(viewGroup, property, f2, 0.0f));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new u5(this, av1Var, (byte) 11));
                            gl.d3(qw1Var, 50L);
                            onVar.d();
                        }
                        requestLayout();
                    }
                }
                byc bycVar = this.d7;
                if (bycVar != null) {
                    ((fyc) bycVar).h(i5);
                }
            } else {
                if (this.R0 != null) {
                    E1(false, true);
                }
                this.V2 = -1;
                wx1 wx1Var2 = this.V0;
                if (wx1Var2 != null) {
                    if (i == 2 && !gl.D && !gl.E) {
                        this.w4 = false;
                        hy1 hy1Var = this.P3;
                        if (hy1Var != null) {
                            hy1Var.k(0.0f);
                        }
                        this.d2.removeView(this.V0);
                        this.V0 = null;
                    } else if (this.Y2 && !this.p3 && !this.p4) {
                        this.X0 = true;
                        this.e4 = 0;
                        wx1Var2.setShowing(false);
                        sv1 sv1Var = new sv1(this, i, (byte) 0);
                        if (!this.w) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.W0 = animatorSet2;
                            byc bycVar2 = this.d7;
                            wx1 wx1Var3 = this.V0;
                            if (bycVar2 != null) {
                                z3 = false;
                                animatorSet2.playTogether(ValueAnimator.ofFloat(wx1Var3.getMeasuredHeight()), ValueAnimator.ofFloat(0.0f, 1.0f));
                            } else {
                                z3 = false;
                                animatorSet2.playTogether(ObjectAnimator.ofFloat(wx1Var3, property, wx1Var3.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            onVar.d();
                            this.W0.addListener(new u5(this, sv1Var, (byte) 12));
                        } else {
                            z3 = false;
                            this.x = sv1Var;
                        }
                        gl.d3(qw1Var, 50L);
                        requestLayout();
                        z5 = z3;
                    } else {
                        hy1 hy1Var2 = this.P3;
                        if (hy1Var2 != null) {
                            hy1Var2.k(0.0f);
                        }
                        z5 = false;
                        this.q3 = 0;
                        this.d2.removeView(this.V0);
                        this.V0.setVisibility(8);
                        this.V0.setShowing(false);
                    }
                    this.X0 = z5;
                }
                tx1 tx1Var3 = this.x2;
                if (tx1Var3 != null && tx1Var3.getVisibility() == 0) {
                    if (i != 2 || gl.D || gl.E) {
                        if (this.Y2 && !this.p3) {
                            if (this.Y0) {
                                this.e4 = 1;
                            }
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            this.W0 = animatorSet3;
                            byc bycVar3 = this.d7;
                            tx1 tx1Var4 = this.x2;
                            if (bycVar3 != null) {
                                b = 0;
                                animatorSet3.playTogether(ValueAnimator.ofFloat(tx1Var4.getMeasuredHeight()));
                            } else {
                                b = 0;
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(tx1Var4, property, tx1Var4.getMeasuredHeight()));
                            }
                            this.W0.setInterpolator(gb.w);
                            this.W0.setDuration(250L);
                            this.W0.addListener(new by1(this, i, b));
                            onVar.d();
                            gl.d3(qw1Var, 50L);
                            requestLayout();
                        } else if (!this.a4) {
                            this.x2.setVisibility(8);
                        }
                    }
                    this.Y0 = false;
                }
                if (i2 == 1 && this.c3 != null) {
                    na7.q1(this.R).X3.edit().putInt("closed_botkeyboard_" + getTopicKeyString(), this.c3.e1()).apply();
                }
                h2(true);
                byc bycVar4 = this.d7;
                if (bycVar4 != null) {
                    ((fyc) bycVar4).i(z2);
                }
            }
            if (this.n4 || this.o4) {
                N(true);
            }
            if (this.p4 && i != 1) {
                z4 = false;
                P1(false, false, false, true);
            } else {
                z4 = false;
            }
            m2(z4);
            H();
        }
    }

    public final void X() {
        boolean z;
        wx1 wx1Var = this.V0;
        if (wx1Var != null && wx1Var.d1 != y6c.t0) {
            this.d2.removeView(wx1Var);
            wx1Var = null;
            this.V0 = null;
        }
        if (wx1Var != null) {
            return;
        }
        boolean z2 = this.y3;
        Context context = getContext();
        TLRPC.ChatFull chatFull = this.T2;
        boolean z3 = this.X5;
        boolean z4 = this.U0;
        if (this.d7 != null) {
            z = true;
        } else {
            z = false;
        }
        wx1 wx1Var2 = new wx1(this, this.F3, z2, context, chatFull, this.c2, z3, this.L4, z4, z);
        this.V0 = wx1Var2;
        wx1Var2.w0 = true;
        if (!this.X5) {
            wx1Var2.updateColors();
        }
        this.V0.I(true, this.z3, this.A3, true);
        this.V0.setVisibility(8);
        this.V0.setShowing(false);
        if (this.d7 != null) {
            wx1 wx1Var3 = this.V0;
            wx1Var3.x0 = false;
            wx1Var3.setShouldDrawBackground(false);
            this.V0.W0 = true;
        }
        this.V0.setDelegate(new ay1(this));
        this.V0.setDragListener(new c9c(this));
        wx1 wx1Var4 = this.V0;
        if (wx1Var4 != null) {
            wx1Var4.K(-this.G3, !this.A0, !this.b);
        }
        x();
        I();
    }

    public final void X0(TLRPC.Document document, String str, g27 g27Var, boolean z, int i, int i2, Object obj, Long l, boolean z2) {
        TL_stories.StoryItem storyItem;
        if (this.H0 > 0 && !c()) {
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                ly1 ly1Var = this.G0;
                hy1Var.O0(ly1Var, ((jia) ly1Var.c).getText(), true);
                return;
            }
            return;
        }
        if (this.H2 != 0) {
            O1(0, true);
            this.V0.s(true);
            this.V0.z();
        }
        P1(false, true, false, true);
        hy1 hy1Var2 = this.P3;
        j1a j1aVar = null;
        if (hy1Var2 != null) {
            storyItem = hy1Var2.t0();
        } else {
            storyItem = null;
        }
        z3a B = z3a.B(this.R);
        long j = this.G3;
        k27 k27Var = this.J3;
        k27 threadMessage = getThreadMessage();
        bu1 bu1Var = this.L3;
        boolean z3 = obj instanceof TLRPC.TL_messages_stickerSet;
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            j1aVar = mu1Var.Q6();
        }
        B.t0(document, str, j, k27Var, threadMessage, storyItem, bu1Var, g27Var, z, i, i2, z3, obj, j1aVar, l.longValue(), getSendMonoForumPeerId(), getSendMessageSuggestionParams());
        hy1 hy1Var3 = this.P3;
        if (hy1Var3 != null) {
            hy1Var3.u(null, true, i, 0, 0L);
        }
        if (z2) {
            setFieldText("");
        }
        hq6.d0(this.R).d(0, obj, document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public final void X1() {
        hy1 hy1Var = this.P3;
        if ((hy1Var == null || !hy1Var.g()) && cf3.y(this.G3)) {
            TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
            u21 b0 = u21.b0(this.F3);
            StringBuilder sb = new StringBuilder();
            if (hc2.p(K0)) {
                sb.append(k96.M0(2131745415, null));
            }
            if (hc2.u(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745412, null));
            }
            if (hc2.t(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745413, null));
            }
            if (hc2.o(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745416, null));
            }
            if (hc2.l(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745417, null));
            }
            if (hc2.v(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745411, null));
            }
            if (hc2.s(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745414, null));
            }
            if (hc2.m(K0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745418, null));
            }
            b0.G(2131624113, 3, k96.a0("SendPlainTextRestrictionHint", null, 2131745400, sb.toString())).j();
        }
    }

    public final void Y() {
        if (this.T0 != null) {
            return;
        }
        gw1 gw1Var = new gw1(this, getContext(), (byte) 3);
        this.T0 = gw1Var;
        gw1Var.setScaleType(ImageView.ScaleType.CENTER);
        gw1 gw1Var2 = this.T0;
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(F0(bkb.Ml), false);
        this.v4 = animatedArrowDrawable;
        gw1Var2.setImageDrawable(animatedArrowDrawable);
        this.T0.setVisibility(8);
        this.T0.setScaleX(0.1f);
        this.T0.setScaleY(0.1f);
        this.T0.setAlpha(0.0f);
        gw1 gw1Var3 = this.T0;
        int i = bkb.h6;
        zkb.R(gw1Var3, bkb.f0(F0(i), 1, -1), null, zkb.M(i), this.L4);
        this.q2.addView(this.T0, nme.e(44, 44, 85));
        this.T0.setOnClickListener(new fv1(this, (byte) 8));
        this.T0.setContentDescription(k96.M0(2131754883, "AccDescrExpandPanel"));
    }

    public final void Y0(org.telegram.tgnet.tl.TL_keyboard.KeyboardButton r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.Y0(org.telegram.tgnet.tl.TL_keyboard$KeyboardButton):void");
    }

    public final void Y1(boolean z) {
        boolean z2;
        boolean z3;
        float f;
        float f2;
        long j;
        mu1 mu1Var;
        jm3 jm3Var = this.j1;
        if (jm3Var != null && jm3Var.o()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && ((this.t2 || z) && (mu1Var = this.F3) != null && !mu1Var.y() && this.P2 == null)) {
            na7.q1(this.R);
            boolean z4 = w01.a;
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.k6 == z3) {
            return;
        }
        this.k6 = z3;
        ImageView imageView = this.k2;
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
        ViewPropertyAnimator interpolator = scaleX.scaleY(f3).setInterpolator(s33.h);
        if (!z2 && !this.l6) {
            j = 420;
        } else {
            j = 150;
        }
        interpolator.setDuration(j).withEndAction(new ov1(this, z3, (byte) 1)).start();
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
        wjb wjbVar = this.L4;
        ex1 ex1Var = new ex1(this, context, wjbVar);
        this.F0 = ex1Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            ex1Var.setFallbackLineSpacing(false);
        }
        if (i3 >= 35) {
            this.F0.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        this.F0.setDelegate(new qv1(this));
        mu1 mu1Var = this.F3;
        if (mu1Var != null && mu1Var.getParentLayout() != null && ((ActionBarLayout) mu1Var.getParentLayout()).b) {
            this.F0.setWindowView(mu1Var.getParentLayout().getWindow().getDecorView());
        } else {
            this.F0.setWindowView(this.E3.getWindow().getDecorView());
        }
        if (mu1Var != null) {
            encryptedChat = mu1Var.h;
        } else {
            encryptedChat = null;
        }
        this.F0.setAllowTextEntitiesIntersection(d2());
        String string = Settings.Secure.getString(getContext().getContentResolver(), "default_input_method");
        if ((string == null || !string.startsWith("com.samsung")) && encryptedChat != null) {
            i = 285212672;
        } else {
            i = 268435456;
        }
        this.F0.setIncludeFontPadding(false);
        this.F0.setImeOptions(i);
        ex1 ex1Var2 = this.F0;
        int inputType = ex1Var2.getInputType() | 147456;
        this.a = inputType;
        ex1Var2.setInputType(inputType);
        m2(false);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(6);
        boolean z = true;
        this.F0.setTextSize(1, 18.0f);
        this.F0.setGravity(80);
        this.F0.setPadding(0, gl.L(9.0f), 0, gl.L(10.0f));
        this.F0.setBackgroundDrawable(null);
        zkb.X(this.F0, bkb.Ke, wjbVar);
        zkb.G(this.F0, bkb.Xc, wjbVar);
        zkb.C(this.F0, bkb.kg, wjbVar);
        ex1 ex1Var3 = this.F0;
        int i4 = bkb.Le;
        zkb.A(ex1Var3, i4, wjbVar);
        zkb.D(this.F0, i4, wjbVar);
        zkb.v(this.F0, bkb.Me, wjbVar);
        zkb.y(this.F0, bkb.lg, wjbVar);
        ex1 ex1Var4 = this.F0;
        boolean z2 = this.M4;
        if (z2) {
            f = 50.0f;
        } else {
            f = 2.0f;
        }
        FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 80, 52.0f, 0.0f, f, 1.5f);
        cw1 cw1Var = this.o2;
        cw1Var.addView(ex1Var4, 1, d);
        ig9 ig9Var = new ig9(this.R, wjbVar, getContext());
        this.s2 = ig9Var;
        ig9Var.setAllowActions(false);
        this.s2.setMaxHeight(gl.L(150.0f));
        this.s2.setMinHeight(gl.L(88.0f));
        this.s2.setVisibility(8);
        this.s2.setPadding(gl.L(8.0f), gl.L(9.0f), gl.L(8.0f), gl.L(10.0f));
        this.s2.setOnClickListener(new fv1(this, (byte) 14));
        ig9 ig9Var2 = this.s2;
        if (z2) {
            i2 = 50;
        } else {
            i2 = 2;
        }
        cw1Var.addView(ig9Var2, 2, nme.d(-1, -2.0f, 80, 44.0f, 0.0f, i2 - 8, 1.5f));
        this.F0.setOnKeyListener(new fx1(this));
        this.F0.setOnEditorActionListener(new gx1(this, (byte) 0));
        this.F0.addTextChangedListener(new hx1(this));
        this.F0.addTextChangedListener(new fi());
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
        m2(false);
        if (mu1Var == null || !mu1Var.getFragmentBeginToShow()) {
            z = false;
        }
        v2(z);
        if (mu1Var != null) {
            mu1Var.C4(false, false);
        }
        n2(this.L6);
    }

    public final float Z0(FrameLayout frameLayout) {
        float measuredHeight = getMeasuredHeight() - this.f7.f;
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
        return frameLayout.getHeight() - gl.L(44.0f);
    }

    public final boolean Z1() {
        ImageView imageView;
        if (this.O != null || (imageView = this.m2) == null || imageView.getVisibility() != 0 || na7.c1().getInt("channelsuggesthint2", 0) >= 2) {
            return false;
        }
        je5 je5Var = new je5(getContext(), 3);
        this.O = je5Var;
        je5Var.q(13.0f);
        setHintGlass(this.O);
        this.O.p(true);
        this.O.t(k96.a0(null, null, 2131744181, mm4.i(this.R, this.G3)));
        this.O.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        this.O.o(1.0f, -((getWidth() - gl.L(12.0f)) - ((this.m2.getMeasuredWidth() / 2.0f) + (this.m2.getX() + (this.f2.getX() + this.o2.getX())))));
        addView(this.O, nme.d(-1, 200.0f, 48, 0.0f, -192.0f, 0.0f, 0.0f));
        je5 je5Var2 = this.O;
        je5Var2.r0 = new av1(this, (byte) 24);
        je5Var2.d = 8000L;
        je5Var2.v();
        na7.c1().edit().putInt("channelsuggesthint2", na7.c1().getInt("channelsuggesthint2", 0) + 1).apply();
        return true;
    }

    @Override
    public final boolean a() {
        jm3 jm3Var = this.j1;
        if (jm3Var != null && jm3Var.q()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        int i;
        if (this.f1 != null) {
            return;
        }
        cw1 cw1Var = new cw1(this, getContext(), (byte) 3);
        this.f1 = cw1Var;
        if (this.R3 == null) {
            i = 8;
        } else {
            i = 0;
        }
        cw1Var.setVisibility(i);
        this.f1.setFocusable(true);
        this.f1.setFocusableInTouchMode(true);
        this.f1.setClickable(true);
        this.o2.addView(this.f1, nme.e(-1, 44, 80));
        ?? imageView = new ImageView(getContext());
        this.h1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.h1.f(2131623975, 28, 28, null);
        this.h1.getAnimatedDrawable().p0 = true;
        this.A5 = this.h1.getAnimatedDrawable();
        s2();
        this.h1.setContentDescription(k96.M0(2131751586, "Delete"));
        ry8 ry8Var = this.h1;
        int i2 = bkb.h6;
        ff0 f0 = bkb.f0(F0(i2), 1, -1);
        vkb M = zkb.M(i2);
        wjb wjbVar = this.L4;
        zkb.R(ry8Var, f0, null, M, wjbVar);
        this.f1.addView(this.h1, nme.c(44.0f, 44));
        this.h1.setOnClickListener(new fv1(this, (byte) 10));
        scc sccVar = new scc(getContext());
        this.g1 = sccVar;
        sccVar.setVisibility(4);
        scc sccVar2 = this.g1;
        sccVar2.T = !this.X5;
        sccVar2.setRoundFrames(true);
        this.g1.setDelegate(new sw1(this));
        this.f1.addView(this.g1, nme.d(-1, -1.0f, 19, 56.0f, 0.0f, 8.0f, 0.0f));
        Context context = getContext();
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.d = textPaint;
        view.e = -1L;
        textPaint.setTextSize(gl.L(14.0f));
        view.b = context.getDrawable(2131232788);
        view.a = bkb.b0(gl.L(5.0f), bkb.w0(null, bkb.gg, false));
        view.b();
        view.setTime(0);
        this.g1.setTimeHintView(view);
        this.c2.addView((View) view, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 52.0f));
        i29 i29Var = new i29(getContext(), wjbVar);
        this.i1 = i29Var;
        this.f1.addView(i29Var, nme.d(-1, 32.0f, 19, 44.0f, 0.0f, 4.0f, 0.0f));
        n2(this.L6);
    }

    public final void a2() {
        b2(true, false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ie));
        hashSet.add(Integer.valueOf(bkb.Uf));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.Sf));
        hashSet.add(Integer.valueOf(bkb.Rf));
        hashSet.add(Integer.valueOf(bkb.Oe));
    }

    @Override
    public final boolean b() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null && mu1Var.H4()) {
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
        if (this.b2 != null && this.D2 != null && !this.D1 && e66.e(360928) && this.D2.isShown()) {
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
                float measuredHeight = ((this.b2.getMeasuredHeight() / 2.0f) - gl.L(3.0f)) + (iArr[1] - iArr2[1]);
                RecordCircle recordCircle2 = this.D2;
                float f10 = recordCircle2.K;
                float f11 = recordCircle2.L;
                float max = (Math.max(recordCircle2.M, gl.L(10.0f)) * 1.5f) + gl.L(6.0f);
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
                    int max2 = Math.max(1, Math.round(gl.p * 0.75f));
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
                    int F0 = F0(bkb.Tf) | (-16777216);
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
                        iArr5[i14] = bm2.f(f14, F0, i9);
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
                                iArr7[i17] = E2(i19);
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
                    kra kraVar = this.E5;
                    if (kraVar == null) {
                        kraVar = new kra(2400);
                        this.E5 = kraVar;
                    }
                    kraVar.a();
                    this.E5.e(false);
                    kra kraVar2 = this.E5;
                    kraVar2.t = iArr5;
                    kraVar2.s = true;
                    if (bkb.I.o()) {
                        f = 0.12f;
                    } else {
                        f = 0.0f;
                    }
                    kraVar2.u = f;
                    kra kraVar3 = this.E5;
                    kraVar3.S = 0.0f;
                    kraVar3.R = 0.0f;
                    float f15 = i11;
                    float min = Math.min(1.0f, 1400.0f / f15);
                    float f16 = gl.p;
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
                                if (D2(i33 + 3) <= (((i32 * 0.7f) / 255.0f) + f17) * f18) {
                                    float D2 = D2(i33 + 11);
                                    float D22 = D2(i33 + 12);
                                    float D23 = D2(i33 + 14);
                                    float f19 = i29 + f12;
                                    float f20 = D2 - 0.5f;
                                    i7 = i29;
                                    float f21 = max2;
                                    float f22 = (f20 * f21) + f19;
                                    f7 = f10;
                                    i6 = i25;
                                    float f23 = D22 - 0.5f;
                                    float f24 = (f23 * f21) + i25 + f13;
                                    f8 = f11;
                                    float f25 = this.I5;
                                    f6 = f13;
                                    f9 = f12;
                                    float i34 = Utilities.i((f22 - f25) / (this.J5 - f25), 1.0f, 0.0f);
                                    float f26 = (0.03f * D23) + (i34 * 0.2f) + 0.04f;
                                    float w = b00.w(f23, 3.0f, f16, width);
                                    float w2 = b00.w(f20, 2.0f, f16, measuredHeight);
                                    float z = yjb.z(i34, 0.16f, 0.92f, (D2(i33 + 15) * 0.16f) + 0.5f);
                                    float g = oo1.g(D2, 0.25f, f17, width - f22, f22);
                                    float min2 = Math.min(f24, measuredHeight) - (((D23 * 22.0f) + 8.0f) * f16);
                                    kra kraVar4 = this.E5;
                                    int E2 = E2(i30);
                                    int i35 = 0;
                                    while (true) {
                                        if (i35 < 7) {
                                            if (E2 <= iArr3[i35]) {
                                                i8 = i35;
                                                break;
                                            }
                                            i35++;
                                        } else {
                                            i8 = 7;
                                            break;
                                        }
                                    }
                                    kraVar4.j(f22, f24, g, min2, w, w2, z, f26, i8);
                                    i24 = i31 + 1;
                                    fArr2[i31] = (z * 0.95f) + f26;
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
                                if (D2(i42 + 5) <= (((i41 * 0.7f) / 255.0f) + 0.3f) * min3) {
                                    float D24 = D2(i42 + 6);
                                    float D25 = D2(i42 + 7);
                                    float D26 = D2(i42 + 8);
                                    i = i10;
                                    float f31 = D24 - 0.5f;
                                    int i43 = i24;
                                    float f32 = max2;
                                    i2 = max2;
                                    float f33 = (f31 * f32) + f30 + i38;
                                    float f34 = D25 - 0.5f;
                                    f3 = min3;
                                    float f35 = (f32 * f34) + f27 + i36;
                                    float f36 = f33 - f28;
                                    float f37 = f35 - f29;
                                    i3 = i36;
                                    i4 = i38;
                                    float sqrt = (float) Math.sqrt((f37 * f37) + (f36 * f36));
                                    if (sqrt < gl.L(1.0f)) {
                                        double d = D26 * 3.141592653589793d * 2.0d;
                                        f5 = (float) Math.cos(d);
                                        f4 = (float) Math.sin(d);
                                    } else {
                                        f4 = f37 / sqrt;
                                        f5 = f36 / sqrt;
                                    }
                                    float D27 = ((D2(i42 + 9) * 13.0f) + 7.0f) * f16;
                                    float f38 = D26 * 0.05f;
                                    float w3 = b00.w(f34, 3.0f, f16, width);
                                    float w4 = b00.w(f31, 2.0f, f16, measuredHeight);
                                    float D28 = (D2(i42 + 10) * 0.2f) + 0.56f;
                                    float g2 = oo1.g(D24, 0.25f, 0.3f, width - f33, f33);
                                    float min4 = Math.min(f35, measuredHeight) - (((D25 * 22.0f) + 8.0f) * f16);
                                    kra kraVar5 = this.E5;
                                    int E22 = E2(i40);
                                    int i44 = 0;
                                    while (true) {
                                        if (i44 < 7) {
                                            if (E22 <= iArr3[i44]) {
                                                i5 = i44;
                                                break;
                                            }
                                            i44++;
                                        } else {
                                            i5 = 7;
                                            break;
                                        }
                                    }
                                    kraVar5.j(f33, f35, g2, min4, w3, w4, D28, f38, i5);
                                    kra kraVar6 = this.E5;
                                    int i45 = kraVar6.C;
                                    int i46 = ((i45 + s) - 1) % kraVar6.b;
                                    kraVar6.w[i46] = f5 * D27;
                                    kraVar6.x[i46] = f4 * D27;
                                    i24 = i43 + 1;
                                    fArr2[i43] = (D28 * 0.95f) + f38;
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
                    jy1 jy1Var = this.b2;
                    jy1Var.getClass();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (!jy1Var.c && !jy1Var.e) {
                        if (jy1Var.f) {
                            f2 = jy1Var.a;
                        } else {
                            long j = jy1Var.H;
                            if (j < 0) {
                                j = uptimeMillis;
                            }
                            f2 = jy1.a(uptimeMillis - j);
                        }
                    } else {
                        f2 = 1.0f;
                    }
                    jy1Var.s = gl.R1(0.85f, 1.0f, f2) * gl.L(5.0f);
                    jy1Var.n = true;
                    if (jy1Var.G) {
                        uptimeMillis -= 240;
                    }
                    jy1Var.r = uptimeMillis;
                    jy1Var.y = 0.0f;
                    jy1Var.x = 0.0f;
                    jy1Var.w = 0.0f;
                    jy1Var.c = false;
                    jy1Var.d.stop();
                    jy1Var.g().O(true, 0.0f);
                    jy1Var.invalidate();
                    this.n = 0.0f;
                    this.h = 0.55f;
                    l2();
                    float f42 = this.M5 + 260.0f + 16.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f42);
                    ofFloat.setDuration(f42);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new xv1(this, this.b2, gl.L(3.0f) + gl.L(12.0f), this.D2));
                    ofFloat.addListener(new rw1(this));
                    return ofFloat;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final void b1() {
        long j;
        float audioLeft;
        float audioRight;
        l(false);
        gjc gjcVar = this.r1;
        if (gjcVar != null) {
            gjcVar.j("destroy", true);
            jjc jjcVar = gjcVar.h;
            if (jjcVar != null) {
                gl.B2(jjcVar);
                gjcVar.h = null;
            }
            yic yicVar = gjcVar.K;
            if (yicVar != null) {
                gl.B2(yicVar);
                gjcVar.K = null;
            }
            this.r1 = null;
        }
        if (this.m1) {
            this.m1 = false;
            DictationAsr.T(this.q1);
        }
        jm3 jm3Var = this.j1;
        if (jm3Var != null) {
            DictationAsr.T(jm3Var.m0);
            jm3Var.m();
            qn3 qn3Var = jm3Var.F;
            if (qn3Var != null) {
                qn3Var.a();
            }
            j92 j92Var = jm3Var.a0;
            if (j92Var != null) {
                j92Var.f = null;
            }
            gl.B2(jm3Var.s);
            gl.B2(jm3Var.w);
            this.j1 = null;
        }
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.T = true;
            lbc lbcVar = i29Var.n;
            if (lbcVar != null) {
                lbcVar.t0(false);
                i29Var.n.l0();
                i29Var.n = null;
            }
        }
        if (this.i1 != null && this.R3 != null) {
            hq6 d0 = hq6.d0(this.R);
            long j2 = this.G3;
            mu1 mu1Var = this.F3;
            if (mu1Var != null && mu1Var.x4) {
                j = mu1Var.d();
            } else {
                j = 0;
            }
            i29 i29Var2 = this.i1;
            if (i29Var2 == null) {
                audioLeft = 0.0f;
            } else {
                audioLeft = i29Var2.getAudioLeft();
            }
            float f = audioLeft;
            i29 i29Var3 = this.i1;
            if (i29Var3 == null) {
                audioRight = 1.0f;
            } else {
                audioRight = i29Var3.getAudioRight();
            }
            d0.d2(j2, j, f, audioRight);
        }
        this.O2 = true;
        kk7.f(this.R).n(this, kk7.k2);
        kk7.f(this.R).n(this, kk7.n2);
        kk7.f(this.R).n(this, kk7.o2);
        kk7.f(this.R).n(this, kk7.l2);
        kk7.f(this.R).n(this, kk7.W5);
        kk7.f(this.R).n(this, kk7.m2);
        kk7.f(this.R).n(this, kk7.j2);
        kk7.f(this.R).n(this, kk7.s);
        kk7.f(this.R).n(this, kk7.r2);
        kk7.f(this.R).n(this, kk7.t2);
        kk7.f(this.R).n(this, kk7.d2);
        kk7.f(this.R).n(this, kk7.y0);
        kk7.f(this.R).n(this, kk7.K);
        kk7.f(this.R).n(this, kk7.m1);
        kk7.f(this.R).n(this, kk7.s2);
        kk7.f(this.R).n(this, kk7.S2);
        kk7.f(this.R).n(this, kk7.Z2);
        kk7.f(this.R).n(this, kk7.h5);
        kk7.f(this.R).n(this, kk7.R3);
        kk7.e().n(this, kk7.k4);
        wx1 wx1Var = this.V0;
        if (wx1Var != null) {
            wx1Var.A();
        }
        av1 av1Var = this.I0;
        if (av1Var != null) {
            gl.r(av1Var);
            this.I0 = null;
        }
        PowerManager.WakeLock wakeLock = this.g3;
        if (wakeLock != null) {
            try {
                wakeLock.release();
                this.g3 = null;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (this.m3 && !this.d1) {
            gl.c3(new m9(this.E3, (byte) 1));
        }
        cja cjaVar = this.c2;
        if (cjaVar != null) {
            cjaVar.setDelegate(null);
        }
        uw1 uw1Var = this.r0;
        if (uw1Var != null) {
            uw1Var.e = false;
            uw1Var.dismiss();
        }
    }

    public final void b2(boolean z, boolean z2) {
        boolean z3;
        if (this.w2 != null && !this.V3 && getVisibility() == 0) {
            cw1 cw1Var = this.f1;
            if ((cw1Var == null || cw1Var.getVisibility() != 0) && !this.x3 && this.L3 == null && (this.d3 == null || this.P2 != null)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && z && z3 && !this.p3 && !Q0()) {
                h1();
                uv1 uv1Var = this.W;
                if (uv1Var != null) {
                    gl.r(uv1Var);
                }
                uv1 uv1Var2 = new uv1(this, (byte) 9);
                this.W = uv1Var2;
                gl.d3(uv1Var2, 200L);
                return;
            }
            this.W3 = true;
            this.V3 = true;
            if (this.X3) {
                this.g7.a(true, z);
                if (z3) {
                    ex1 ex1Var = this.F0;
                    if (ex1Var != null) {
                        ex1Var.requestFocus();
                    }
                    h1();
                    return;
                }
                return;
            }
            return;
        }
        cw1 cw1Var2 = this.f1;
        if ((cw1Var2 == null || cw1Var2.getVisibility() != 0) && !this.x3 && this.L3 == null && this.J3 == null) {
            h1();
        }
    }

    @Override
    public final boolean c() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null && mu1Var.P7()) {
            return true;
        }
        return false;
    }

    public final void c0() {
        l lVar = this.E2;
        cja cjaVar = this.c2;
        if (lVar == null) {
            l lVar2 = new l(this, getContext());
            this.E2 = lVar2;
            lVar2.setVisibility(8);
            cjaVar.addView(this.E2, nme.e(-1, -2, 80));
        }
        if (this.D2 != null) {
            return;
        }
        RecordCircle recordCircle = new RecordCircle(getContext());
        this.D2 = recordCircle;
        recordCircle.setVisibility(8);
        cjaVar.addView(this.D2, nme.e(-1, -2, 80));
    }

    public final void c2() {
        AnimatorSet animatorSet = new AnimatorSet();
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "lockAnimatedTranslation", this.Z4);
        ofFloat.setStartDelay(100L);
        ofFloat.setDuration(350L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "snapAnimationProgress", 1.0f);
        ofFloat2.setInterpolator(s33.h);
        ofFloat2.setDuration(250L);
        boolean z = gba.a;
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putInt("lockRecordAudioVideoHint", 3);
        edit.apply();
        animatorSet.playTogether(ofFloat2, ofFloat, ObjectAnimator.ofFloat(this, "slideToCancelProgress", 1.0f).setDuration(200L), ObjectAnimator.ofFloat(this.a2, "cancelToProgress", 1.0f));
        animatorSet.start();
        C2();
    }

    @Override
    public final void d(TextWatcher textWatcher) {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.addTextChangedListener(textWatcher);
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
            this.o2.addView(this.e1, nme.c(44.0f, -1));
            this.e1.setOnTouchListener(new p8((byte) 28));
            a6 a6Var2 = this.e1;
            SlideTextView slideTextView = new SlideTextView(getContext());
            this.a2 = slideTextView;
            a6Var2.addView(slideTextView, nme.d(-1, -1.0f, 0, 45.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(0);
            this.d.setPadding(gl.L(13.0f), 0, 0, 0);
            this.d.setFocusable(false);
            LinearLayout linearLayout2 = this.d;
            jy1 jy1Var = new jy1(this, getContext());
            this.b2 = jy1Var;
            linearLayout2.addView(jy1Var, nme.t(28, 28, 16, 0, 0, 0, 0));
            this.b2.d(g0());
            this.b2.setOnClickListener(new fv1(this, (byte) 9));
            LinearLayout linearLayout3 = this.d;
            my1 my1Var = new my1(this, getContext());
            this.Z0 = my1Var;
            linearLayout3.addView(my1Var, nme.t(-1, -1, 16, 6, 0, 0, 0));
            this.e1.addView(this.d, nme.e(-1, -1, 16));
        }
    }

    public final void d1() {
        this.Z2 = true;
        gjc gjcVar = this.r1;
        if (gjcVar != null) {
            gjcVar.j("chat paused", true);
        }
        if (g0() && this.v3) {
            k0();
        }
        uw1 uw1Var = this.r0;
        if (uw1Var != null) {
            uw1Var.e = false;
            uw1Var.dismiss();
        }
        if (this.p3) {
            this.b3 = true;
        }
        av1 av1Var = new av1(this, (byte) 19);
        this.J6 = av1Var;
        gl.d3(av1Var, 500L);
    }

    public final boolean d2() {
        TLRPC.EncryptedChat encryptedChat;
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            encryptedChat = mu1Var.h;
        } else {
            encryptedChat = null;
        }
        if (encryptedChat != null && gl.W0(encryptedChat.layer) < 101) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ow1 ow1Var;
        TLRPC.ChatFull chatFull;
        TLRPC.Chat K0;
        boolean z;
        float f;
        float f2;
        double d;
        byte[] bArr;
        gw1 gw1Var;
        oy1 oy1Var;
        int i3;
        long j;
        int i4 = 0;
        if (i == kk7.W5) {
            if (i2 == this.R && objArr.length > 0) {
                long longValue = ((Long) objArr[0]).longValue();
                mu1 mu1Var = this.F3;
                if (mu1Var != null) {
                    j = mu1Var.a();
                } else {
                    j = this.G3;
                }
                if (longValue == j) {
                    e2();
                }
            }
        } else if (i == kk7.k4) {
            wx1 wx1Var = this.V0;
            if (wx1Var != null) {
                wx1Var.Q.h1();
            }
            tx1 tx1Var = this.x2;
            if (tx1Var != null) {
                ArrayList arrayList = tx1Var.n;
                while (i4 < arrayList.size()) {
                    ((mq0) arrayList.get(i4)).invalidate();
                    i4++;
                }
            }
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                ex1Var.postInvalidate();
                this.F0.q();
            }
        } else if (i == kk7.j2) {
            if (((Integer) objArr[0]).intValue() == this.w3) {
                if (this.m3 && !this.c4 && !c()) {
                    this.c4 = true;
                    na7 q1 = na7.q1(this.S.a);
                    long j2 = this.G3;
                    long threadMessageId = getThreadMessageId();
                    if (this.d1) {
                        i3 = 7;
                    } else {
                        i3 = 1;
                    }
                    q1.H4(i3, 0, j2, threadMessageId, null);
                }
                RecordCircle recordCircle = this.D2;
                if (recordCircle != null) {
                    recordCircle.setAmplitude(((Double) objArr[1]).doubleValue());
                }
            }
        } else if (i == kk7.s) {
            ex1 ex1Var2 = this.F0;
            if (ex1Var2 != null && ex1Var2.isFocused()) {
                gl.t1(this.F0);
            }
        } else {
            int i5 = kk7.l2;
            int i6 = kk7.m2;
            int i7 = 5;
            if (i != i5 && i != i6) {
                if (i == kk7.k2) {
                    if (((Integer) objArr[0]).intValue() == this.w3) {
                        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                        this.d1 = !booleanValue;
                        mw1 mw1Var = this.c1;
                        if (mw1Var != null) {
                            if (booleanValue) {
                                oy1Var = oy1.a;
                            } else {
                                oy1Var = oy1.b;
                            }
                            mw1Var.j(oy1Var, true);
                        }
                        if (!this.v3) {
                            this.v3 = true;
                            r2(0, true);
                        } else {
                            RecordCircle recordCircle2 = this.D2;
                            if (recordCircle2 != null) {
                                recordCircle2.J = true;
                            }
                        }
                        my1 my1Var = this.Z0;
                        if (my1Var != null) {
                            my1Var.a(this.Y1);
                        }
                        jy1 jy1Var = this.b2;
                        if (jy1Var != null) {
                            jy1Var.e = false;
                        }
                    }
                } else if (i == kk7.n2) {
                    this.v3 = false;
                    this.R3 = null;
                    this.U3 = null;
                } else if (i == kk7.o2) {
                    this.R3 = null;
                    this.U3 = null;
                    my1 my1Var2 = this.Z0;
                    if (my1Var2 != null) {
                        my1Var2.a(this.Y1);
                    }
                    N(true);
                    this.v3 = true;
                    r2(0, true);
                } else if (i == kk7.r2) {
                    if (((Integer) objArr[0]).intValue() == this.w3) {
                        this.Y1 = 0L;
                        Object obj = objArr[1];
                        if (obj instanceof oac) {
                            oac oacVar = (oac) obj;
                            this.U3 = oacVar;
                            String str = (String) objArr[2];
                            this.S3 = str;
                            ArrayList<Bitmap> arrayList2 = (ArrayList) objArr[3];
                            this.Y1 = oacVar.r;
                            scc sccVar = this.g1;
                            if (sccVar != null) {
                                sccVar.setVideoPath(str);
                                this.g1.setKeyframes(arrayList2);
                                this.g1.setVisibility(0);
                                this.g1.setMinProgressDiff(1000.0f / ((float) this.U3.r));
                                U0();
                            }
                            r2(3, true);
                            N(false);
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
                                long e = y6c.h(this.R).e();
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
                                this.T3 = new k27(y6c.t0, tL_message, false, true);
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
                                if (z && (gw1Var = this.h2) != null) {
                                    this.l2 = 0.0f;
                                    gw1Var.setAlpha(0.0f);
                                    gw1Var.setScaleX(0.0f);
                                    gw1Var.setScaleY(0.0f);
                                }
                                this.Y1 = (long) (1000.0d * d);
                                i29 i29Var = this.i1;
                                String str2 = this.S3;
                                if (!i29Var.T) {
                                    i29Var.r = (float) d;
                                    i29Var.s = f;
                                    i29Var.w = f2;
                                    i29Var.x = false;
                                    i29Var.h.t(gl.g0((int) Math.round(Math.max(1.0d, d)), false, false), false, true);
                                    i29Var.f.a(false, false);
                                    lbc lbcVar = i29Var.n;
                                    if (lbcVar == null) {
                                        lbcVar = new lbc();
                                        i29Var.n = lbcVar;
                                        lbcVar.K = new g29(i29Var, (byte) 0);
                                    }
                                    lbcVar.i0(Uri.fromFile(new File(str2)), "other");
                                    i29Var.i(false);
                                    i29Var.L = 0;
                                    i29Var.M = bArr;
                                    Bitmap bitmap = i29Var.T0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        i29Var.T0 = null;
                                    }
                                    i29Var.W0 = null;
                                    i29Var.X0 = false;
                                    i29Var.Q0 = -1;
                                    i29Var.J0.a();
                                    i29Var.I0.a();
                                    i29Var.invalidate();
                                }
                                N(false);
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
                                r2(3, !z);
                                if (z && na7.c1().getBoolean("design_voice_live_field", true) && !this.O2 && this.R3 != null) {
                                    A0().t();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        hy1 hy1Var = this.P3;
                        if (hy1Var != null) {
                            hy1Var.u(null, true, 0, 0, 0L);
                        }
                    }
                } else if (i == kk7.t2) {
                    Activity activity = this.E3;
                    if (activity != null) {
                        if (!((Boolean) objArr[0]).booleanValue()) {
                            i4 = Integer.MIN_VALUE;
                        }
                        activity.setVolumeControlStream(i4);
                    }
                } else if (i == kk7.d2) {
                    Integer num = (Integer) objArr[0];
                    if (this.T3 != null && MediaController.w().D(this.T3)) {
                        k27 k27Var = MediaController.w().v0;
                        k27 k27Var2 = this.T3;
                        k27Var2.b0 = k27Var.b0;
                        k27Var2.i0 = k27Var.i0;
                    }
                } else if (i == kk7.y0) {
                    ew1 ew1Var = this.R0;
                    if (ew1Var != null) {
                        ew1Var.invalidate();
                    }
                } else if (i == kk7.K) {
                    if (!((Boolean) objArr[6]).booleanValue()) {
                        long longValue2 = ((Long) objArr[3]).longValue();
                        Integer num2 = (Integer) objArr[1];
                        if (longValue2 == this.G3 && (chatFull = this.T2) != null && chatFull.slowmode_seconds != 0 && !k27.f3(num2.intValue()) && (K0 = na7.q1(this.S.a).K0(Long.valueOf(this.T2.id))) != null && !hc2.N(K0) && !hc2.h0(K0)) {
                            TLRPC.ChatFull chatFull2 = this.T2;
                            int currentTime = ConnectionsManager.getInstance(this.R).getCurrentTime();
                            TLRPC.ChatFull chatFull3 = this.T2;
                            chatFull2.slowmode_next_send_date = currentTime + chatFull3.slowmode_seconds;
                            chatFull3.flags |= 262144;
                            setSlowModeTimer(chatFull3.slowmode_next_send_date);
                        }
                    }
                } else if (i == kk7.m1) {
                    if (this.T2 != null) {
                        y2();
                    }
                } else if (i == kk7.s2) {
                    this.R3 = null;
                    this.U3 = null;
                    r2(4, true);
                } else if (i == kk7.S2) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TL_bots.BotMenuButton botMenuButton = (TL_bots.BotMenuButton) objArr[1];
                    if (longValue3 == this.G3) {
                        if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                            TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                            this.j0 = tL_botMenuButton.text;
                            this.k0 = tL_botMenuButton.url;
                            this.p7 = 3;
                        } else if (!this.f3) {
                            this.p7 = 1;
                        } else {
                            this.p7 = 2;
                        }
                        h2(false);
                    }
                } else if (i == kk7.Z2) {
                    o2(true);
                } else if (i == kk7.h5) {
                    if (this.t2 && (ow1Var = this.K0) != null) {
                        ow1Var.setLocked(!y6c.h(this.R).p());
                    }
                    l0();
                } else if (i == kk7.R3) {
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
                        r2(i7, true);
                        return;
                    }
                    return;
                }
                r2(2, true);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i29 i29Var;
        wx1 wx1Var = this.V0;
        if (wx1Var != null && wx1Var.getVisibility() == 0 && this.V0.getStickersExpandOffset() != 0.0f) {
            canvas.save();
            canvas.clipRect(0, gl.L(2.0f), getMeasuredWidth(), getMeasuredHeight());
            canvas.translate(0.0f, -this.V0.getStickersExpandOffset());
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
        if (this.K1 && (i29Var = this.i1) != null && i29Var.getTrimProgress() > 0.0f) {
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
        cw1 cw1Var = this.p2;
        if (view != view2 && view != cw1Var) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float measuredHeight = getMeasuredHeight() - this.f7.f;
            canvas.save();
            if (view == cw1Var) {
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
    public final void e(TLRPC.Document document, String str, Object obj, g27 g27Var, boolean z, boolean z2, int i, int i2) {
        if (this.o7) {
            return;
        }
        bu1 bu1Var = this.L3;
        mu1 mu1Var = this.F3;
        if (bu1Var != null && mu1Var != null && bu1Var.f) {
            mu1Var.ic();
        } else if (c() && i == 0) {
            ij.J(this.E3, mu1Var.a(), new yv1(this, document, str, obj, g27Var, z), this.L4);
        } else {
            ij.X(this.R, this.G3, 1, new zv1(this, document, str, g27Var, z2, i, i2, obj, z));
        }
    }

    public final void e0() {
        if (this.z2 == null && this.F3 != null) {
            Drawable mutate = getContext().getResources().getDrawable(2131231501).mutate();
            Drawable mutate2 = getContext().getResources().getDrawable(2131231502).mutate();
            int i = bkb.Ml;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            wjb wjbVar = this.L4;
            zkb.x(this, mutate, i, wjbVar, mode);
            zkb.x(this, mutate2, bkb.Zf, wjbVar, mode);
            fm2 fm2Var = new fm2(mutate, mutate2);
            pw1 pw1Var = new pw1(this, getContext());
            this.z2 = pw1Var;
            pw1Var.setImageDrawable(fm2Var);
            this.z2.setVisibility(8);
            this.z2.setContentDescription(k96.M0(2131745656, null));
            this.z2.setScaleType(ImageView.ScaleType.CENTER);
            pw1 pw1Var2 = this.z2;
            int i2 = bkb.h6;
            zkb.R(pw1Var2, bkb.f0(F0(i2), 1, -1), null, zkb.M(i2), wjbVar);
            this.o2.addView(this.z2, 2, nme.e(44, 44, 85));
            this.z2.setOnClickListener(new fv1(this, (byte) 6));
            this.z2.setTranslationX(0.0f);
        }
    }

    public final void e1() {
        ex1 ex1Var;
        this.Z2 = false;
        if (na7.c1().getBoolean("design_voice_live_field", true)) {
            long[] jArr = {150, 500, 1200};
            for (int i = 0; i < 3; i++) {
                gl.d3(new av1(this, (byte) 25), jArr[i]);
            }
        }
        av1 av1Var = this.J6;
        if (av1Var != null) {
            gl.r(av1Var);
            this.J6 = null;
        }
        if (!G0() || !z()) {
            getVisibility();
            if (this.b3 && !org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
                this.b3 = false;
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    hy1Var.K0();
                }
                if (this.H2 == 0 && (ex1Var = this.F0) != null) {
                    ex1Var.requestFocus();
                }
                gl.E3(this.F0);
                if (!gl.D && !this.p3 && !gl.E) {
                    this.a4 = true;
                    qw1 qw1Var = this.h4;
                    gl.r(qw1Var);
                    gl.d3(qw1Var, 100L);
                }
            }
        }
    }

    public final void e2() {
        long j;
        boolean z;
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            int i = this.R;
            mu1 mu1Var = this.F3;
            if (mu1Var != null) {
                j = mu1Var.a();
            } else {
                j = this.G3;
            }
            if (ec.b(i, j) != null) {
                z = true;
            } else {
                z = false;
            }
            cc ccVar = this.m6;
            if (ccVar == null) {
                if (z) {
                    ccVar = new cc(ow1Var);
                    this.m6 = ccVar;
                    ow1Var.h0 = ccVar;
                    ow1Var.i0 = this;
                } else {
                    return;
                }
            }
            if (ccVar.b != z) {
                ccVar.b = z;
                ccVar.a.invalidate();
            }
            if (z) {
                y0();
            }
        }
    }

    public final void f0() {
        if (this.q0 == null && getContext() != null) {
            ?? view = new View(getContext());
            ImageReceiver imageReceiver = new ImageReceiver(view);
            view.a = imageReceiver;
            view.b = new pb0((wjb) null);
            view.d = new Paint(1);
            Paint paint = new Paint(1);
            view.e = paint;
            imageReceiver.q0(gl.L(28.0f));
            paint.setStrokeWidth(gl.L(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            view.updateColors();
            view.setContentDescription(k96.a0("AccDescrSendAsPeer", null, 2131754774, ""));
            this.q0 = view;
            view.setOnClickListener(new fv1(this, (byte) 2));
            this.q0.setVisibility(8);
            this.o2.addView(this.q0, nme.d(36, 36.0f, 83, 4.66f, 4.0f, 4.66f, 4.0f));
        }
    }

    public final boolean f1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.f1(android.view.View):boolean");
    }

    public final void f2() {
        float f;
        gw1 gw1Var = this.h2;
        if (gw1Var == null) {
            return;
        }
        float f2 = this.E + this.y;
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            f = ow1Var.getAlpha() * (-b00.c(56.0f, ow1Var.l(), 0));
        } else {
            f = 0.0f;
        }
        gw1Var.setTranslationX(f2 + f);
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
        int height = this.c2.getHeight();
        if (!this.p3) {
            height -= this.q3;
        }
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            hy1Var.f1(height);
        }
        if (this.w2 != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + gl.L(72.0f);
            boolean z = this.X3;
            fm0 fm0Var = this.g7;
            if (height < currentActionBarHeight) {
                if (z) {
                    this.X3 = false;
                    if (this.W3) {
                        fm0Var.a(false, false);
                    }
                }
            } else if (!z) {
                this.X3 = true;
                if (this.W3) {
                    fm0Var.a(true, false);
                }
            }
        }
    }

    public final void g2() {
        int i;
        f2();
        pkb pkbVar = this.f2;
        if (pkbVar != null) {
            pkbVar.setTranslationX(this.E + this.y);
            pkbVar.setAlpha(this.F * this.G);
            if (pkbVar.getAlpha() > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            pkbVar.setVisibility(i);
            gw1 gw1Var = this.h2;
            if (gw1Var != null && this.Z5) {
                gw1Var.setAlpha(this.l2 * this.G);
            }
        }
        pw1 pw1Var = this.z2;
        if (pw1Var != null) {
            pw1Var.setTranslationX(pw1Var.a);
        }
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

    public qu1 getBotWebViewButton() {
        if (this.l0 == null) {
            Context context = getContext();
            ?? frameLayout = new FrameLayout(context);
            frameLayout.a = new Path();
            frameLayout.c = bkb.w0(null, bkb.Ei, false);
            frameLayout.d = true;
            TextView textView = new TextView(context);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setAlpha(0.0f);
            textView.setGravity(17);
            textView.setTypeface(gl.o());
            frameLayout.addView(textView, nme.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            radialProgressView.setSize(gl.L(18.0f));
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.0f);
            radialProgressView.setScaleY(0.0f);
            frameLayout.addView(radialProgressView, nme.d(28, 28.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            frameLayout.h = view;
            int i = bkb.Gi;
            ff0 f0 = bkb.f0(bkb.w0(null, i, false), 2, -1);
            vkb M = zkb.M(i);
            view.setBackground(f0);
            zkb.j(view, f0, null, M, null);
            frameLayout.addView(view, nme.d(-1, -1.0f, 3, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setWillNotDraw(false);
            this.l0 = frameLayout;
            frameLayout.setVisibility(8);
            U();
            this.l0.setBotMenuButton(this.m0);
            this.o2.addView(this.l0, nme.e(-1, -1, 80));
        }
        return this.l0;
    }

    public int getCursorPosition() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return 0;
        }
        return ex1Var.getSelectionStart();
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
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return 0.0f;
        }
        return ((FrameLayout.LayoutParams) ex1Var.getLayoutParams()).bottomMargin - gl.L(1.5f);
    }

    @Override
    public Editable getEditText() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return null;
        }
        return ex1Var.getText();
    }

    public k27 getEditingMessageObject() {
        return this.P2;
    }

    public long getEffectId() {
        return this.O6;
    }

    public View getEmojiButton() {
        return this.R0;
    }

    public int getEmojiPadding() {
        return this.q3;
    }

    public t14 getEmojiView() {
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
        my1 my1Var = this.Z0;
        if (my1Var != null && my1Var.a) {
            return my1Var.d;
        }
        return 0L;
    }

    public k27 getReplyingMessageObject() {
        return this.J3;
    }

    public int getRestingFieldHeight() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return gl.L(44.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ex1Var.getLayoutParams();
        int paddingTop = this.F0.getPaddingTop();
        return Math.max(gl.L(44.0f), this.F0.getLineHeight() + this.F0.getPaddingBottom() + paddingTop + layoutParams.topMargin + layoutParams.bottomMargin);
    }

    public int getSelectionLength() {
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return 0;
        }
        try {
            return ex1Var.getSelectionEnd() - this.F0.getSelectionStart();
        } catch (Exception e) {
            fa4.g(e, true);
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

    public u47 getSendMessageSuggestionParams() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.y5;
        }
        return null;
    }

    public long getSendMonoForumPeerId() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.c7();
        }
        return 0L;
    }

    public k4a getSenderSelectView() {
        return this.q0;
    }

    public cja getSizeNotifierLayout() {
        return this.c2;
    }

    public float getSlideToCancelProgress() {
        return this.Y4;
    }

    public CharSequence getSlowModeTimer() {
        if (this.H0 > 0) {
            return ((jia) this.G0.c).getText();
        }
        return null;
    }

    public long getStarsPrice() {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            return mu1Var.getMessagesController().K1(mu1Var.a());
        }
        return na7.q1(this.R).K1(this.G3);
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
        tL_textWithEntities.entities = hq6.d0(y6c.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public float getTopViewEnterProgress() {
        return this.g7.e;
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

    public p1c getTrendingStickersAlert() {
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

    public void h1() {
        if ((!G0() || !z()) && !org.telegram.ui.ActionBar.d.hasSheets(this.F3)) {
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                hy1Var.K0();
            }
            ex1 ex1Var = this.F0;
            if (ex1Var != null && !gl.E3(ex1Var)) {
                this.F0.clearFocus();
                this.F0.requestFocus();
            }
        }
    }

    public final void h2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.h2(boolean):void");
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
        int i;
        if (!G0() || !z()) {
            mu1 mu1Var = this.F3;
            if (!org.telegram.ui.ActionBar.d.hasSheets(mu1Var)) {
                if (!gl.D && !gl.E && ((mu1Var == null || !mu1Var.isInBubbleMode()) && !this.Z2)) {
                    i = 2;
                } else {
                    i = 0;
                }
                W1(i, 0, true, true);
                hy1 hy1Var = this.P3;
                if (hy1Var != null) {
                    hy1Var.K0();
                }
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ex1Var.requestFocus();
                }
                gl.E3(this.F0);
                if (this.Z2) {
                    this.b3 = true;
                } else if (!gl.D && !this.p3 && !gl.E) {
                    if (mu1Var == null || !mu1Var.isInBubbleMode()) {
                        this.a4 = true;
                        wx1 wx1Var = this.V0;
                        if (wx1Var != null) {
                            wx1Var.onTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                        }
                        qw1 qw1Var = this.h4;
                        gl.r(qw1Var);
                        gl.d3(qw1Var, 100L);
                    }
                }
            }
        }
    }

    public final void i2() {
        int c;
        t26 t26Var;
        int K0;
        View m;
        float f;
        cx1 cx1Var = this.n0;
        if (cx1Var != null) {
            int childCount = cx1Var.c.getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.n0.c.getChildAt(i2);
                if (i2 < 4) {
                    i += childAt.getMeasuredHeight();
                }
            }
            cja cjaVar = this.c2;
            if (i > 0) {
                int measuredHeight = (cjaVar.getMeasuredHeight() - i) - gl.L(8.0f);
                if (childCount > 4) {
                    f = 12.0f;
                } else {
                    f = 0.0f;
                }
                c = b00.c(f, measuredHeight, 0);
            } else if (this.o0.c.size() > 4) {
                c = b00.c(162.8f, cjaVar.getMeasuredHeight(), 0);
            } else {
                c = b00.c((Math.max(1, Math.min(4, this.o0.c.size())) * 36) + 8, cjaVar.getMeasuredHeight(), 0);
            }
            if (this.n0.c.getPaddingTop() != c) {
                this.n0.c.setTopGlowOffset(c);
                if (this.V6 == -1 && this.n0.getVisibility() == 0 && this.n0.c.getLayoutManager() != null && (K0 = (t26Var = (t26) this.n0.c.getLayoutManager()).K0()) >= 0 && (m = t26Var.m(K0)) != null) {
                    this.V6 = K0;
                    this.W6 = m.getTop() - this.n0.c.getPaddingTop();
                }
                this.n0.c.setPadding(0, c, 0, gl.L(8.0f));
            }
        }
    }

    public final void j(TLRPC.Document document) {
        hq6.d0(this.R).c(document, (int) (System.currentTimeMillis() / 1000), true);
        wx1 wx1Var = this.V0;
        if (wx1Var != null && document != null) {
            boolean isEmpty = wx1Var.j1.isEmpty();
            wx1Var.X();
            if (isEmpty) {
                wx1Var.Y(false);
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
            r2(2, true);
            this.D1 = false;
            gl.d3(new uv1(this, (byte) 8), 120L);
        } catch (Throwable th) {
            this.D1 = false;
            throw th;
        }
    }

    public final void j1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.j1():void");
    }

    public final void j2(boolean z) {
        if (this.p7 != 1 && this.G3 > 0) {
            U();
        }
        ep0 ep0Var = this.m0;
        if (ep0Var != null) {
            ep0Var.setWebView(G0());
        }
        h2(z);
    }

    public final void k(TLRPC.Document document) {
        X();
        wx1 wx1Var = this.V0;
        int i = wx1Var.d1;
        hq6.d0(i).d(0, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean isEmpty = wx1Var.k1.isEmpty();
        wx1Var.k1 = hq6.d0(i).j0(0, true);
        l14 l14Var = wx1Var.z0;
        if (l14Var != null) {
            l14Var.f();
        }
        if (isEmpty) {
            wx1Var.Y(false);
        }
    }

    public final void k0() {
        m0(false, false);
        jm3 jm3Var = this.j1;
        if (jm3Var != null && jm3Var.o0 && jm3Var.r == 1) {
            jm3Var.u();
        }
        ex1 ex1Var = this.F0;
        if (ex1Var != null && ex1Var.length() > 0) {
            bw1 bw1Var = this.O4;
            bw1Var.getClass();
            ChatActivityEnterView chatActivityEnterView = bw1Var.b;
            float f = 1.0f;
            chatActivityEnterView.h = 1.0f;
            chatActivityEnterView.l2();
            if (this.B0) {
                f = 0.5f;
            }
            bw1 bw1Var2 = this.Q4;
            bw1Var2.getClass();
            ChatActivityEnterView chatActivityEnterView2 = bw1Var2.b;
            chatActivityEnterView2.n = f;
            chatActivityEnterView2.l2();
        }
        j0();
        ew1 ew1Var = this.R0;
        if (ew1Var != null) {
            ew1Var.invalidate();
        }
    }

    public final void k1(CharSequence charSequence, CharSequence charSequence2, String str) {
        mu1 mu1Var;
        if (this.F0 != null && (mu1Var = this.F3) != null) {
            na7.q1(this.R);
            boolean z = w01.a;
            hd9 hd9Var = new hd9(str);
            hd9Var.h = charSequence;
            hd9Var.n = charSequence2;
            hd9Var.setResourceProvider(this.L4);
            hd9Var.K = mu1Var;
            hd9Var.s = mu1Var.U;
            hd9Var.w = mu1Var.a0;
            hd9Var.M = new av1(this, (byte) 3);
            hd9Var.L = new av1(this, (byte) 4);
            mu1Var.presentFragment(hd9Var);
        }
    }

    public final void k2() {
        boolean z;
        ex1 ex1Var = this.F0;
        boolean z2 = false;
        if (ex1Var != null && ex1Var.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z = true;
        } else {
            z = false;
        }
        S1(z);
        ex1 ex1Var2 = this.F0;
        if (ex1Var2 != null && ex1Var2.getLineCount() > 2 && this.F0.getText() != null && !TextUtils.isEmpty(this.F0.getText().toString().trim())) {
            z2 = true;
        }
        Y1(z2);
    }

    public final void l(boolean z) {
        mu1 mu1Var;
        if (this.o6 >= 0) {
            ConnectionsManager.getInstance(this.R).cancelRequest(this.o6, true);
            this.o6 = -1;
        }
        qw1 qw1Var = this.r6;
        if (qw1Var != null) {
            gl.r(qw1Var);
            this.r6 = null;
        }
        this.p6 = false;
        cc ccVar = this.m6;
        if (ccVar != null) {
            ccVar.c(false);
        }
        m();
        if (z && (mu1Var = this.F3) != null) {
            u21.b0(mu1Var).Q(2131624012, 36, "Couldn't rewrite the message. It wasn't sent.").j();
        }
    }

    public final void l0() {
        boolean z;
        if (this.k1 && !this.O2 && !this.v3) {
            jm3 jm3Var = this.j1;
            if (jm3Var == null || !jm3Var.o()) {
                if (this.A0 && !this.o7 && yde.a(getContext())) {
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
        av1 av1Var = new av1(this, (byte) 1);
        if (!bue.b(this.R, this.G3) && !na7.q1(this.R).S3.contains(Long.valueOf(this.G3))) {
            ij.n(this.F3, na7.q1(this.R).V1(Long.valueOf(this.G3)), new aj1(this, av1Var, (byte) 24), new av1(this, (byte) 2));
            return;
        }
        av1Var.run();
    }

    public final void l2() {
        float f;
        float f2 = (1.0f - this.A1) * this.y1;
        if (f2 > 0.0f) {
            f = gl.R1(1.0f, 0.6f, f2);
        } else {
            f = 1.0f;
        }
        ew1 ew1Var = this.R0;
        ew1Var.setScaleX(this.r * this.h * f);
        ew1Var.setScaleY(this.r * this.h * f);
        ew1Var.setAlpha((1.0f - f2) * this.s * this.n);
    }

    public final void m() {
        cc ccVar = this.m6;
        if (ccVar != null && ccVar.d) {
            ccVar.d = false;
            ccVar.a.invalidate();
        }
        if (this.w6) {
            this.w6 = false;
            this.F1 = false;
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                ex1Var.invalidate();
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
        ofFloat.addUpdateListener(new pv1(this, (byte) 8));
        this.B6.setDuration(220L);
        this.B6.setInterpolator(s33.g);
        this.B6.start();
    }

    public final boolean m1() {
        if (this.W0 != null) {
            return true;
        }
        return false;
    }

    public final void m2(boolean z) {
        boolean z2;
        long j;
        int i;
        boolean z3;
        boolean z4;
        String str;
        TLRPC.TL_forumTopic tL_forumTopic;
        String str2;
        k27 k27Var;
        TLRPC.ReplyMarkup replyMarkup;
        String M0;
        TLRPC.ReplyMarkup replyMarkup2;
        CharSequence a0;
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            CharSequence charSequence = this.e;
            boolean z5 = true;
            boolean z6 = false;
            if (charSequence != null) {
                ex1Var.r(charSequence, z);
                ex1 ex1Var2 = this.F0;
                String str3 = this.f;
                xs3 xs3Var = ex1Var2.v0;
                if (xs3Var != null) {
                    if (!k96.a0 && z) {
                        z6 = true;
                    }
                    xs3Var.t(str3, z6, true);
                }
            } else if (!this.A0 && !P0()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" d ".concat(k96.M0(2131747028, "PlainTextRestrictedHint")));
                spannableStringBuilder.setSpan(new cm2(2131232248, 0), 1, 2, 0);
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
                x2();
                mu1 mu1Var = this.F3;
                if (mu1Var != null && mu1Var.g4 == 8 && mu1Var.i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (mu1Var != null) {
                    j = mu1Var.getMessagesController().K1(mu1Var.a());
                } else {
                    j = 0;
                }
                if (j > 0) {
                    j *= getMessagesCount();
                }
                if (mu1Var != null) {
                    i = mu1Var.g4;
                } else {
                    i = -1;
                }
                if (i == 9) {
                    this.F0.setHintText(k96.M0(2131742632, null));
                } else if (i == 5) {
                    if ("hello".equalsIgnoreCase(mu1Var.f4)) {
                        this.F0.setHintText(k96.M0(2131752755, null));
                        return;
                    }
                    boolean equalsIgnoreCase = "away".equalsIgnoreCase(mu1Var.f4);
                    ex1 ex1Var3 = this.F0;
                    if (equalsIgnoreCase) {
                        ex1Var3.setHintText(k96.M0(2131752824, null));
                    } else {
                        ex1Var3.setHintText(k96.M0(2131752660, null));
                    }
                } else {
                    cm2[] cm2VarArr = this.K6;
                    if (z2) {
                        if (j > 0) {
                            a0 = jva.S0(k96.a0(null, null, 2131744162, k96.E((int) j, ','), cm2VarArr));
                        } else {
                            a0 = k96.a0(null, null, 2131744163, new Object[0]);
                        }
                        this.F0.setHintText(a0);
                        cm2 cm2Var = cm2VarArr[0];
                        if (cm2Var != null) {
                            cm2Var.H = 0.9f;
                        }
                    } else if (this.R2 != null) {
                        this.F0.setHintText(k96.M0(2131752694, null));
                    } else {
                        k27 k27Var2 = this.J3;
                        if (k27Var2 != null && (replyMarkup2 = k27Var2.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup2.placeholder)) {
                            this.F0.r(this.J3.k.reply_markup.placeholder, z);
                        } else if (this.P2 != null) {
                            ex1 ex1Var4 = this.F0;
                            if (this.Q2) {
                                M0 = k96.M0(2131752549, null);
                            } else {
                                M0 = k96.M0(2131743689, null);
                            }
                            ex1Var4.setHintText(M0);
                        } else if (j > 0) {
                            this.F0.setHintText(jva.Y0(false, k96.a0(null, null, 2131743687, k96.E((int) j, ',')), cm2VarArr));
                            cm2 cm2Var2 = cm2VarArr[0];
                            if (cm2Var2 != null) {
                                cm2Var2.H = 0.9f;
                            }
                        } else if (this.Y0 && (k27Var = this.c3) != null && (replyMarkup = k27Var.k.reply_markup) != null && !TextUtils.isEmpty(replyMarkup.placeholder)) {
                            this.F0.r(this.c3.k.reply_markup.placeholder, z);
                        } else if (mu1Var != null && mu1Var.N7()) {
                            k27 k27Var3 = this.K3;
                            if (k27Var3 != null && (tL_forumTopic = k27Var3.j1) != null && (str2 = tL_forumTopic.title) != null) {
                                this.F0.r(k96.a0(null, null, 2131743686, str2), z);
                                return;
                            }
                            TLRPC.TL_forumTopic f = na7.q1(this.R).g4.f(mu1Var.e.id, 1L);
                            if (f != null && (str = f.title) != null) {
                                this.F0.r(k96.a0(null, null, 2131743686, str), z);
                            } else {
                                this.F0.r(k96.M0(2131743689, null), z);
                            }
                        } else {
                            if (cf3.y(this.G3)) {
                                TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
                                TLRPC.ChatFull L0 = na7.q1(this.S.a).L0(-this.G3);
                                z4 = hc2.V(K0);
                                if (!z4 && hc2.M(K0, L0, false) == (-this.G3)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                                z4 = false;
                            }
                            if (z3) {
                                this.F0.setHintText(k96.M0(2131745446, "SendAnonymously"));
                                return;
                            }
                            TLRPC.User V1 = na7.q1(this.S.a).V1(Long.valueOf(this.G3));
                            if (V1 != null && V1.bot_forum_view && !V1.bot_forum_can_manage_topics && mu1Var != null && !mu1Var.x4) {
                                this.F0.setHintText(k96.M0(2131745441, null));
                            } else if (mu1Var != null && mu1Var.a8() && !mu1Var.x4) {
                                if (mu1Var.m4 == null || !mu1Var.v4) {
                                    z5 = false;
                                }
                                ex1 ex1Var5 = this.F0;
                                if (z5) {
                                    ex1Var5.setHintText(k96.M0(2131751993, null));
                                } else {
                                    ex1Var5.setHintText(k96.M0(2131746070, "Reply"));
                                }
                            } else if (z4) {
                                boolean z7 = this.W2;
                                ex1 ex1Var6 = this.F0;
                                if (z7) {
                                    ex1Var6.r(k96.M0(2131752279, "ChannelSilentBroadcast"), z);
                                } else {
                                    ex1Var6.r(k96.M0(2131752435, "ChannelBroadcast"), z);
                                }
                            } else {
                                this.F0.setHintText(k96.M0(2131743689, null));
                            }
                        }
                    }
                }
            }
        }
    }

    public final ValueAnimator n(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z2.a, f);
        ofFloat.addUpdateListener(new pv1(this, (byte) 5));
        return ofFloat;
    }

    public final boolean n0() {
        jm3 jm3Var;
        ex1 ex1Var;
        if (!this.D6) {
            if (this.l1 && (jm3Var = this.j1) != null && jm3Var.p() && !this.v3) {
                if ((!this.j1.q() || this.j1.r == 2) && (ex1Var = this.F0) != null && ex1Var.length() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public boolean n1() {
        return true;
    }

    public final void n2(int i) {
        ImageView imageView;
        pw1 pw1Var;
        int L;
        pw1 pw1Var2;
        gw1 gw1Var;
        View view;
        int L2;
        a aVar;
        int[] iArr;
        int[] iArr2;
        this.L6 = i;
        if (this.F0 != null) {
            k27 k27Var = this.P2;
            if (k27Var == null || k27Var.o5()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F0.getLayoutParams();
                int i2 = layoutParams.rightMargin;
                boolean z = this.Z5;
                ow1 ow1Var = this.K0;
                float f = 50.0f;
                int i3 = 0;
                if (z && this.o7) {
                    if (!this.k5) {
                        f = 2.0f;
                    }
                    layoutParams.rightMargin = Math.max(0, ow1Var.l() - gl.L(44.0f)) + gl.L(f);
                } else if ((i == 1 || i == 2) && !o0()) {
                    gw1 gw1Var2 = this.n2;
                    if (gw1Var2 != null && gw1Var2.getVisibility() == 0 && (pw1Var2 = this.z2) != null && pw1Var2.getVisibility() == 0 && (gw1Var = this.h2) != null && gw1Var.getVisibility() == 0) {
                        L = gl.L(146.0f);
                        layoutParams.rightMargin = L;
                    } else {
                        gw1 gw1Var3 = this.n2;
                        if ((gw1Var3 != null && gw1Var3.getVisibility() == 0) || (((imageView = this.y2) != null && imageView.getVisibility() == 0) || ((pw1Var = this.z2) != null && pw1Var.getTag() != null))) {
                            L = gl.L(98.0f);
                            layoutParams.rightMargin = L;
                        } else {
                            L = gl.L(50.0f);
                            layoutParams.rightMargin = L;
                        }
                    }
                    if (this.k5) {
                        layoutParams.rightMargin = gl.L(48.0f) + L;
                    }
                } else {
                    pw1 pw1Var3 = this.z2;
                    if (pw1Var3 != null && pw1Var3.getTag() != null) {
                        layoutParams.rightMargin = gl.L(50.0f);
                    } else {
                        layoutParams.rightMargin = gl.L(2.0f);
                    }
                }
                if (o0() || (g0() && this.v3)) {
                    ex1 ex1Var = this.F0;
                    if (ex1Var == null) {
                        view = null;
                    } else {
                        view = (View) ex1Var.getParent();
                    }
                    if (view != null && view.getWidth() != 0 && (aVar = this.a1) != null && aVar.getWidth() != 0) {
                        view.getLocationInWindow(new int[2]);
                        aVar.getLocationInWindow(new int[2]);
                        L2 = Math.max(gl.L(2.0f), Math.round((view.getWidth() + iArr[0]) - ((((aVar.getWidth() / 2.0f) + (iArr2[0] - aVar.getTranslationX())) - gl.N(41.0f)) - gl.L(8.0f))));
                    } else {
                        L2 = gl.L(28.0f);
                    }
                    layoutParams.rightMargin = L2;
                }
                layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, ow1Var.l() - gl.L(44.0f)));
                ow1 ow1Var2 = this.v2;
                if (ow1Var2 != null && ow1Var2.getVisibility() == 0) {
                    layoutParams.rightMargin = Math.max(layoutParams.rightMargin, Math.max(0, this.v2.l() - gl.L(44.0f)));
                }
                if (i2 != layoutParams.rightMargin) {
                    this.F0.setLayoutParams(layoutParams);
                }
                cw1 cw1Var = this.f1;
                if (cw1Var != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cw1Var.getLayoutParams();
                    if (this.P2 == null) {
                        i3 = b00.c(44.0f, ow1Var.l(), 0);
                    }
                    layoutParams2.rightMargin = i3;
                    this.f1.setLayoutParams(layoutParams2);
                }
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
        if (z && alpha < 0.25f && (getSendButtonInternal() instanceof ky1) && SystemClock.uptimeMillis() > this.I1) {
            ky1 ky1Var = (ky1) getSendButtonInternal();
            ky1Var.p0.e(true, 0.0f);
            ky1Var.invalidate();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = ChatActivityEnterView.r7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
                chatActivityEnterView.getSendButtonInternal().setAlpha(gl.R1(alpha, f, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleX(gl.R1(scaleX, f2, floatValue));
                chatActivityEnterView.getSendButtonInternal().setScaleY(gl.R1(scaleY, f3, floatValue));
            }
        });
        return ofFloat;
    }

    public final boolean o0() {
        jm3 jm3Var;
        if (this.l1 && (jm3Var = this.j1) != null && jm3Var.p()) {
            return true;
        }
        return false;
    }

    public final void o1(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.F0 == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.F0.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                vu3.m(spannableStringBuilder, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
            }
            this.F0.setText(spannableStringBuilder);
            this.F0.setSelection(i + charSequence.length());
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void o2(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.o2(boolean):void");
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uw1 uw1Var = this.r0;
        if (uw1Var != null) {
            uw1Var.e = false;
            uw1Var.dismiss();
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
        if (motionEvent.getAction() == 0 && (X = gl.X(this, motionEvent.getX(), motionEvent.getY())) != this.M && X != this.N) {
            I0();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cx1 cx1Var;
        super.onLayout(z, i, i2, i3, i4);
        if (this.V6 != -1 && (cx1Var = this.n0) != null) {
            t26 t26Var = (t26) cx1Var.c.getLayoutManager();
            if (t26Var != null) {
                t26Var.g1(this.V6, this.W6);
            }
            this.V6 = -1;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ImageView imageView;
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        cw1 cw1Var = this.p2;
        int measuredHeight = cw1Var.getMeasuredHeight();
        ep0 ep0Var = this.m0;
        ImageView imageView2 = this.S0;
        ew1 ew1Var = this.R0;
        if (ep0Var != null && ep0Var.getTag() != null) {
            this.m0.measure(i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ew1Var.getLayoutParams();
            int L = gl.L(10.0f);
            ep0 ep0Var2 = this.m0;
            if (ep0Var2 == null) {
                measuredWidth = 0;
            } else {
                measuredWidth = ep0Var2.getMeasuredWidth();
            }
            marginLayoutParams.leftMargin = L + measuredWidth;
            if (imageView2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
                int L2 = gl.L(10.0f);
                ep0 ep0Var3 = this.m0;
                if (ep0Var3 == null) {
                    measuredWidth4 = 0;
                } else {
                    measuredWidth4 = ep0Var3.getMeasuredWidth();
                }
                marginLayoutParams2.leftMargin = L2 + measuredWidth4;
            }
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) ex1Var.getLayoutParams();
                int L3 = gl.L(57.0f);
                ep0 ep0Var4 = this.m0;
                if (ep0Var4 == null) {
                    measuredWidth3 = 0;
                } else {
                    measuredWidth3 = ep0Var4.getMeasuredWidth();
                }
                marginLayoutParams3.leftMargin = L3 + measuredWidth3;
            }
            ig9 ig9Var = this.s2;
            if (ig9Var != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) ig9Var.getLayoutParams();
                int L4 = gl.L(57.0f);
                ep0 ep0Var5 = this.m0;
                if (ep0Var5 == null) {
                    measuredWidth2 = 0;
                } else {
                    measuredWidth2 = ep0Var5.getMeasuredWidth();
                }
                marginLayoutParams4.leftMargin = L4 + measuredWidth2;
            }
        } else {
            k4a k4aVar = this.q0;
            if (k4aVar != null && k4aVar.getVisibility() == 0) {
                int i3 = this.q0.getLayoutParams().width;
                this.q0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.q0.getLayoutParams().height, 1073741824));
                ((ViewGroup.MarginLayoutParams) ew1Var.getLayoutParams()).leftMargin = gl.L(7.0f) + i3;
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = gl.L(7.0f) + i3;
                }
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) ex1Var2.getLayoutParams()).leftMargin = gl.L(54.0f) + i3;
                }
                ig9 ig9Var2 = this.s2;
                if (ig9Var2 != null) {
                    ((ViewGroup.MarginLayoutParams) ig9Var2.getLayoutParams()).leftMargin = gl.L(54.0f) + i3;
                }
            } else {
                ((ViewGroup.MarginLayoutParams) ew1Var.getLayoutParams()).leftMargin = gl.L(3.0f);
                if (imageView2 != null) {
                    ((ViewGroup.MarginLayoutParams) imageView2.getLayoutParams()).leftMargin = gl.L(3.0f);
                }
                ex1 ex1Var3 = this.F0;
                if (ex1Var3 != null) {
                    ((ViewGroup.MarginLayoutParams) ex1Var3.getLayoutParams()).leftMargin = gl.L(50.0f);
                }
                ig9 ig9Var3 = this.s2;
                if (ig9Var3 != null) {
                    ((ViewGroup.MarginLayoutParams) ig9Var3.getLayoutParams()).leftMargin = gl.L(50.0f);
                }
            }
        }
        i2();
        super.onMeasure(i, i2);
        qu1 qu1Var = this.l0;
        if (qu1Var != null) {
            ep0 ep0Var6 = this.m0;
            if (ep0Var6 != null) {
                qu1Var.setMeasuredButtonWidth(ep0Var6.getMeasuredWidth());
            }
            this.l0.getLayoutParams().height = getMeasuredHeight() - gl.L(2.0f);
            measureChild(this.l0, i, i2);
        }
        P();
        Q();
        if (measuredHeight > 0 && cw1Var.getMeasuredHeight() != measuredHeight) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (i4 == 0) {
                    imageView = this.j2;
                } else {
                    imageView = this.k2;
                }
                imageView.setTranslationY((imageView.getTranslationY() + cw1Var.getMeasuredHeight()) - measuredHeight);
                imageView.animate().translationY(0.0f).setInterpolator(s33.h).setDuration(420L).start();
            }
            je5 je5Var = this.N;
            if (je5Var != null) {
                je5Var.setTranslationY((je5Var.getTranslationY() + cw1Var.getMeasuredHeight()) - measuredHeight);
                ug8.t(this.N.animate().translationY(0.0f), s33.h, 420L);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 && this.p4) {
            O1(0, false);
            this.V0.s(false);
            P1(false, false, false, true);
        }
        scc sccVar = this.g1;
        if (sccVar != null) {
            ArrayList arrayList = sccVar.w;
            if (sccVar.O.isEmpty()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i5);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
            arrayList.clear();
            pcc pccVar = sccVar.x;
            if (pccVar != null) {
                pccVar.cancel(true);
                sccVar.x = null;
            }
            sccVar.invalidate();
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        cw1 cw1Var;
        float f3 = 0.0f;
        if (i == 0) {
            ojc ojcVar = this.T1;
            if (ojcVar != null) {
                ojcVar.setVisibleHeight(f);
            }
            if (this.E2 != null) {
                if (this.K1 && this.Q5 && (cw1Var = this.f1) != null && cw1Var.getVisibility() == 0) {
                    f3 = -Math.max(0.0f, f - gl.L(44.0f));
                }
                this.R5 = f3;
                this.E2.setTranslationY(f3 + this.S5 + this.l7);
            }
            P();
            Q();
        } else if (i == 1) {
            P();
            Q();
        } else {
            int i2 = 0;
            if (i == 2) {
                u0a u0aVar = this.J0;
                u0aVar.setAlpha(f);
                u0aVar.setScaleX(gl.R1(0.5f, 1.0f, f));
                u0aVar.setScaleY(gl.R1(0.5f, 1.0f, f));
                if (f <= 0.0f) {
                    i2 = 4;
                }
                u0aVar.setVisibility(i2);
            } else if (i == 3) {
                float R1 = gl.R1(1.0f, 0.79f, f);
                cw1 cw1Var2 = this.q2;
                cw1Var2.setScaleX(R1);
                cw1Var2.setScaleY(gl.R1(1.0f, 0.79f, f));
                float R12 = gl.R1(0.79f, 1.0f, f);
                ImageView imageView = this.r2;
                imageView.setScaleX(R12);
                imageView.setScaleY(gl.R1(0.79f, 1.0f, f));
                if (f <= 0.0f) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                imageView.setAlpha(f);
                ow1 ow1Var = this.K0;
                if (ow1Var != null) {
                    ow1Var.setSameWidthFactor(f);
                }
            }
        }
        invalidate();
    }

    public final void p0() {
        float f;
        j92 C0;
        int[] iArr;
        int[] iArr2;
        if (this.E2 != null) {
            if (g0() && this.v3) {
                RectF rectF = this.H4;
                if (!rectF.isEmpty() && this.E2.getHeight() > 0 && (C0 = C0()) != null) {
                    this.E2.getLocationInWindow(this.m7);
                    C0.getLocationInWindow(this.n7);
                    f = Math.min(0.0f, (((C0.getInputBubbleTop() + iArr2[1]) - gl.L(8.0f)) - gl.L(18.0f)) - (rectF.centerY() + (((iArr[1] - this.E2.getTranslationY()) + this.R5) + this.S5)));
                    if (Math.abs(f - this.l7) >= 0.5f && (f != 0.0f || this.l7 == 0.0f)) {
                        return;
                    }
                    this.l7 = f;
                    this.E2.setTranslationY(this.R5 + this.S5 + f);
                }
            }
            f = 0.0f;
            if (Math.abs(f - this.l7) >= 0.5f) {
            }
            this.l7 = f;
            this.E2.setTranslationY(this.R5 + this.S5 + f);
        }
    }

    public final void p1() {
        P1(false, true, false, true);
        W1(0, 0, false, true);
        if (getEditField() != null && !TextUtils.isEmpty(getEditField().getText())) {
            getEditField().setText("");
        }
        this.v3 = false;
        mw1 mw1Var = this.c1;
        if (mw1Var != null) {
            mw1Var.setVisibility(0);
        }
        this.a3 = true;
        U0();
        D();
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

    public final void p2() {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setTranslationX(this.I + this.H);
        }
    }

    public final void q() {
        float min;
        float i;
        ry8 ry8Var;
        ry8 ry8Var2;
        ry8 ry8Var3 = this.h1;
        if (ry8Var3 != null && ry8Var3.getAnimatedDrawable() == this.z5) {
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
                float L = gl.L(12.0f);
                this.h1.setPivotX(ry8Var.getWidth() / 2.0f);
                this.h1.setPivotY((ry8Var2.getHeight() / 2.0f) + L);
                this.h1.setRotation(f4);
                if (this.i1 != null) {
                    double radians = Math.toRadians(f4);
                    float L2 = L + gl.L(3.0f);
                    i29 i29Var = this.i1;
                    float sin = ((float) Math.sin(radians)) * L2;
                    float cos = (1.0f - ((float) Math.cos(radians))) * L2;
                    kra kraVar = i29Var.J0;
                    kraVar.R = sin;
                    kraVar.S = cos;
                    i29Var.invalidate();
                }
            }
        }
    }

    public final boolean q0() {
        if (r0() && !this.l1) {
            if (!wxe.a() || !na7.c1().getBoolean("design_voice_live_field", true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q1() {
        if (this.K1 || this.T1 != null) {
            gl.r(this.X1);
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.W1 = null;
            }
            ojc ojcVar = this.T1;
            if (ojcVar != null) {
                if (ojcVar.c.hasFocus()) {
                    gl.t1(this.T1.c);
                    this.T1.c.clearFocus();
                }
                this.T1.setCollapsing(true);
            }
            this.U1 = false;
            this.Q5 = false;
            K1(false);
            v(0.0f);
            i29 i29Var = this.i1;
            if (i29Var != null) {
                i29Var.setVisibility(8);
            }
            ry8 ry8Var = this.h1;
            if (ry8Var != null) {
                ry8Var.setVisibility(0);
            }
            l lVar = this.E2;
            if (lVar != null) {
                this.R5 = 0.0f;
                lVar.setTranslationY(this.S5 + this.l7);
            }
            ow1 ow1Var = this.K0;
            if (ow1Var != null) {
                ow1Var.setIconDimmed(false);
            }
        }
    }

    public final void q2(TLRPC.Chat chat, TLRPC.UserFull userFull) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        float f;
        wx1 wx1Var;
        this.B0 = false;
        boolean z7 = true;
        this.b = true;
        this.A0 = true;
        this.y0 = true;
        this.z0 = true;
        float f2 = 1.0f;
        if (chat != null) {
            if (!hc2.v(chat) && (!hc2.s(chat) || !this.U2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.b1 = z5;
            this.b = hc2.t(chat);
            boolean q = hc2.q(chat);
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
            l2();
            if (!this.B0 && (wx1Var = this.V0) != null) {
                wx1Var.K(-this.G3, !this.A0, !this.b);
            }
            this.y0 = hc2.s(chat);
            this.z0 = hc2.v(chat);
        } else if (userFull != null) {
            this.b1 = userFull.voice_messages_forbidden;
            this.L = userFull;
        }
        if (chat != null || userFull != null) {
            this.n1 = this.b1;
            if (chat != null) {
                if (!hc2.v(chat)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = userFull.voice_messages_forbidden;
            }
            this.k1 = z;
            if (chat != null && hc2.s(chat) && this.U2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.o1 = z2;
        }
        if (this.k1 && this.A0 && !this.o7 && yde.a(getContext())) {
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
            if (!zm3.h()) {
                zm3.j();
            }
        }
        if (this.b1) {
            f2 = 0.5f;
        }
        a aVar = this.a1;
        aVar.setAlpha(f2);
        aVar.invalidate();
        if (this.b1) {
            i = F0(bkb.Ml);
        } else {
            i = -1;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        mw1 mw1Var = this.c1;
        mw1Var.setColorFilter(porterDuffColorFilter);
        mw1Var.invalidate();
        m2(false);
        boolean z8 = this.d1;
        if (!this.y0 && z8) {
            z8 = false;
        }
        if (this.l1 && this.o1) {
            z8 = na7.c1().getBoolean("currentModeVideo", false);
        }
        if (!this.z0 && !z8 && !this.l1) {
            if (!this.U2) {
                z7 = false;
            }
        } else {
            z7 = z8;
        }
        if (this.l1 && !this.o1) {
            z7 = false;
        }
        M1(z7, false);
        jy1 jy1Var = this.b2;
        if (jy1Var != null) {
            jy1Var.d(g0());
        }
        mw1Var.invalidate();
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
        long j;
        int i;
        i29 i29Var = this.i1;
        if (i29Var != null) {
            i29Var.setPlaying(false);
        }
        if (this.U3 != null) {
            hy1 hy1Var = this.P3;
            if (this.P) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            hy1Var.k1(2, 0, i, this.O6, 0L, true);
            this.O6 = 0L;
            this.K0.setEffect(0L);
        } else {
            k27 k27Var = MediaController.w().v0;
            if (k27Var != null && k27Var == this.T3) {
                MediaController.w().l(true, true, false, false);
            }
        }
        if (this.S3 != null) {
            if (w01.a) {
                de9.s(this.S3, new StringBuilder("delete file "));
            }
            new File(this.S3).delete();
        }
        MediaController.w().i(true);
        hq6 d0 = hq6.d0(this.R);
        long j2 = this.G3;
        mu1 mu1Var = this.F3;
        if (mu1Var != null && mu1Var.x4) {
            j = mu1Var.d();
        } else {
            j = 0;
        }
        d0.D1(j2, j, null);
        MediaController.w().A0(0, 0, false, false);
        this.Y1 = 0L;
        L0(false);
        N(true);
    }

    public void r2(int r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.r2(int, boolean):void");
    }

    public final void s(boolean z) {
        boolean z2;
        int i;
        int i2;
        float f;
        float f2;
        int L;
        int i3;
        oy8 oy8Var;
        boolean z3;
        if (!this.d1 && this.i1 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Q5 = z2;
        boolean z4 = this.K1;
        jc jcVar = this.X1;
        if (z4 == z2) {
            if (z2) {
                if (this.T1 != null) {
                    R1(false, false);
                    K1(z);
                    gl.r(jcVar);
                    gl.d3(jcVar, 700L);
                    return;
                }
            } else {
                return;
            }
        }
        this.K1 = z2;
        this.i1.setNewStyle(z2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i1.getLayoutParams();
        layoutParams.height = gl.L(32.0f);
        int i4 = 83;
        if (z2) {
            i = 83;
        } else {
            i = 19;
        }
        layoutParams.gravity = i;
        if (z2) {
            i2 = gl.L(6.0f);
        } else {
            i2 = 0;
        }
        layoutParams.bottomMargin = i2;
        if (z2) {
            f = 45.0f;
        } else {
            f = 44.0f;
        }
        layoutParams.leftMargin = gl.L(f);
        if (z2) {
            f2 = 5.0f;
        } else {
            f2 = 4.0f;
        }
        layoutParams.rightMargin = gl.L(f2);
        this.i1.setLayoutParams(layoutParams);
        ry8 ry8Var = this.h1;
        if (ry8Var != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ry8Var.getLayoutParams();
            if (!z2) {
                i4 = 51;
            }
            layoutParams2.gravity = i4;
            this.h1.setLayoutParams(layoutParams2);
            if (z2) {
                if (this.z5 == null) {
                    oy8 oy8Var2 = new oy8(2131623977, gl.L(28.0f), gl.L(28.0f), false, null);
                    this.z5 = oy8Var2;
                    oy8Var2.E(true);
                }
                oy8Var = this.z5;
            } else {
                oy8Var = this.A5;
            }
            if (oy8Var != null && this.h1.getAnimatedDrawable() != oy8Var) {
                this.h1.setAnimation(oy8Var);
                if (oy8Var != this.z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                oy8Var.p0 = z3;
                s2();
                this.h1.setProgress(0.0f);
            }
        }
        this.f1.setClipChildren(!z2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f1.getLayoutParams();
        if (z2) {
            L = -2;
        } else {
            L = gl.L(44.0f);
        }
        layoutParams3.height = L;
        this.f1.setLayoutParams(layoutParams3);
        cw1 cw1Var = this.f1;
        if (z2) {
            i3 = gl.L(44.0f);
        } else {
            i3 = 0;
        }
        cw1Var.setMinimumHeight(i3);
        if (z2) {
            this.i1.setNewStyleDelegate(new tw1(this));
            if (this.T1 == null) {
                ojc ojcVar = new ojc(getContext(), this.L4, new iw1(this, (byte) 1));
                this.T1 = ojcVar;
                this.f1.addView(ojcVar, nme.d(-1, -2.0f, 80, 48.0f, 0.0f, 0.0f, 0.0f));
            }
            R1(false, false);
            K1(z);
            gl.r(jcVar);
            gl.d3(jcVar, 700L);
            return;
        }
        K1(false);
        this.i1.setNewStyleDelegate(null);
        ojc ojcVar2 = this.T1;
        if (ojcVar2 != null) {
            this.f1.removeView(ojcVar2);
            this.T1 = null;
        }
    }

    public final boolean s0(TL_keyboard.KeyboardButtonProto keyboardButtonProto, k27 k27Var, k27 k27Var2, op1 op1Var) {
        mu1 mu1Var;
        int i;
        TLRPC.User V1;
        int i2 = 0;
        if (keyboardButtonProto != null && k27Var2 != null && ((mu1Var = this.F3) == null || mu1Var.g4 != 5)) {
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = (TL_keyboard.TL_inlineButtonTypeUserProfile) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class);
            TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) jdb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class);
            TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class);
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) jdb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            Boolean bool = null;
            j1a j1aVar = null;
            if (tL_inlineButtonTypeCopy != null) {
                gl.g(tL_inlineButtonTypeCopy.copy_text);
                u21.b0(mu1Var).i(k96.a0(null, null, 2131750872, tL_inlineButtonTypeCopy.copy_text)).k(true);
                return true;
            }
            if (keyboardButtonProto instanceof TL_keyboard.TL_keyboardButton) {
                TL_keyboard.TL_keyboardButton tL_keyboardButton = (TL_keyboard.TL_keyboardButton) keyboardButtonProto;
                if (tL_keyboardButton.type instanceof TL_keyboard.TL_buttonTypeDefault) {
                    x3a b = x3a.b(tL_keyboardButton.text, this.G3, k27Var, getThreadMessage(), null, false, null, null, null, true, 0, 0, null, false);
                    if (mu1Var != null) {
                        j1aVar = mu1Var.Q6();
                    }
                    b.K = j1aVar;
                    b.O = this.O6;
                    this.O6 = 0L;
                    this.K0.setEffect(0L);
                    z3a.B(this.R).q0(b);
                    return true;
                }
            }
            Activity activity = this.E3;
            if (tL_inlineButtonTypeUrl != null) {
                if (d01.z(tL_inlineButtonTypeUrl.url)) {
                    d01.r(activity, Uri.parse(tL_inlineButtonTypeUrl.url), true, true, op1Var);
                    return true;
                }
                ij.o0(this.F3, tL_inlineButtonTypeUrl.url, false, true, true, false, op1Var, null, this.L4);
                return true;
            } else if (jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPhone.class)) {
                mu1Var.Hb(2, k27Var2);
                return true;
            } else if (jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class)) {
                TL_keyboard.TL_buttonTypeRequestPoll tL_buttonTypeRequestPoll = (TL_keyboard.TL_buttonTypeRequestPoll) jdb.a(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPoll.class);
                if ((tL_buttonTypeRequestPoll.flags & 1) != 0) {
                    bool = Boolean.valueOf(tL_buttonTypeRequestPoll.quiz);
                }
                mu1Var.ca();
                x31 x31Var = mu1Var.Y1;
                if (x31Var != null) {
                    x31Var.P2 = false;
                    x31Var.u3.setVisibility(8);
                    x31Var.C1(false, bool);
                    return false;
                }
            } else if (jdb.b(keyboardButtonProto)) {
                TLRPC.Message message = k27Var2.k;
                long j = message.via_bot_id;
                if (j == 0) {
                    j = message.from_id.user_id;
                }
                long j2 = j;
                ux1 ux1Var = new ux1(this, k27Var2, j2, keyboardButtonProto, k27Var, na7.q1(this.R).V1(Long.valueOf(j)));
                if (!bue.b(this.R, j2) && !na7.q1(this.R).S3.contains(Long.valueOf(j2))) {
                    ij.n(mu1Var, na7.q1(this.R).V1(Long.valueOf(this.G3)), new de2(this, ux1Var, j2, (byte) 16), null);
                    return true;
                }
                ux1Var.run();
                return true;
            } else if (jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestGeoLocation.class)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                String M0 = k96.M0(2131745231, "ShareYouLocationTitle");
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131745233, "ShareYouLocationInfo");
                alertDialog$Builder.j(k96.M0(2131747638, "OK"), new ie(this, k27Var2, keyboardButtonProto, (byte) 17));
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                mu1Var.showDialog(hdVar);
                return true;
            } else if (!jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) && !jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) && !jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) && !jdb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                if (tL_inlineButtonTypeSwitchInline != null) {
                    if (!mu1Var.Ka(tL_inlineButtonTypeSwitchInline)) {
                        if (tL_inlineButtonTypeSwitchInline.same_peer) {
                            TLRPC.Message message2 = k27Var2.k;
                            long j3 = message2.from_id.user_id;
                            long j4 = message2.via_bot_id;
                            if (j4 != 0) {
                                j3 = j4;
                            }
                            TLRPC.User V12 = na7.q1(this.S.a).V1(Long.valueOf(j3));
                            if (V12 != null) {
                                setFieldText("@" + l7c.p(V12) + " " + tL_inlineButtonTypeSwitchInline.query);
                                return true;
                            }
                        } else {
                            Bundle j5 = tb4.j(1, "onlySelect", "dialogsType", true);
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
                            cj3 cj3Var = new cj3(j5);
                            cj3Var.E2 = new ie(this, k27Var2, tL_inlineButtonTypeSwitchInline, (byte) 18);
                            mu1Var.presentFragment(cj3Var);
                            return true;
                        }
                    }
                } else if (tL_inlineButtonTypeUserProfile != null) {
                    if (na7.q1(this.R).V1(Long.valueOf(tL_inlineButtonTypeUserProfile.user_id)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", tL_inlineButtonTypeUserProfile.user_id);
                        mu1Var.presentFragment(new ProfileActivity(bundle, null));
                        return true;
                    }
                } else if (tL_buttonTypeRequestPeer != null) {
                    TLRPC.RequestPeerType requestPeerType = tL_buttonTypeRequestPeer.peer_type;
                    if (requestPeerType != null && k27Var2.k != null) {
                        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeCreateBot) {
                            if (getParentFragment() != null) {
                                V1 = getParentFragment().h();
                            } else {
                                V1 = na7.q1(this.R).V1(Long.valueOf(this.G3));
                            }
                            TLRPC.User user = V1;
                            if (user != null) {
                                a03.e(getContext(), this.R, user, (TLRPC.TL_requestPeerTypeCreateBot) tL_buttonTypeRequestPeer.peer_type, false, new au0(this, k27Var2, tL_buttonTypeRequestPeer, user), this.L4, null);
                                return false;
                            }
                        } else if ((requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) && (i = tL_buttonTypeRequestPeer.max_quantity) > 1) {
                            TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) requestPeerType;
                            Boolean bool2 = tL_requestPeerTypeUser.bot;
                            Boolean bool3 = tL_requestPeerTypeUser.premium;
                            cv1 cv1Var = new cv1(this, k27Var2, tL_buttonTypeRequestPeer);
                            gg7 gg7Var = gg7.p2;
                            org.telegram.ui.ActionBar.d Q = LaunchActivity.Q();
                            if (Q == null || gg7.p2 != null) {
                                return false;
                            }
                            gg7 gg7Var2 = new gg7(Q, i, bool2, bool3, cv1Var);
                            gg7Var2.show();
                            gg7.p2 = gg7Var2;
                            return false;
                        } else {
                            Bundle j6 = tb4.j(15, "onlySelect", "dialogsType", true);
                            TLRPC.Message message3 = k27Var2.k;
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
                                fa4.g(e, true);
                            }
                            cj3 cj3Var2 = new cj3(j6);
                            cj3Var2.E2 = new cv1(this, k27Var2, tL_buttonTypeRequestPeer);
                            mu1Var.presentFragment(cj3Var2);
                            return false;
                        }
                    } else {
                        fa4.d("button.peer_type is null");
                    }
                }
                return true;
            } else {
                z3a.B(this.R).m0(true, k27Var2, keyboardButtonProto, null, null, mu1Var);
                return true;
            }
        }
        return false;
    }

    public final void s1(TL_iv.RichMessage richMessage) {
        mu1 mu1Var = this.F3;
        if (mu1Var != null) {
            hq6.d0(this.R).T1(mu1Var.a(), mu1Var.H5(mu1Var.F5), "", null, null, null, null, 0L, false, false, richMessage);
        }
        setRichDraftPreview(richMessage);
    }

    public final void s2() {
        int F0 = F0(bkb.Zf);
        int F02 = F0(bkb.Ie);
        int F03 = F0(bkb.Uf);
        ry8 ry8Var = this.h1;
        if (ry8Var != null) {
            ry8Var.h(F0, "Cup Red");
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

    public void setAdjustPanLayoutHelper(gb gbVar) {
        this.V = gbVar;
    }

    public void setAnimatedTop(int i) {
        this.J2 = i;
    }

    public void setBotInfo(vf6 vf6Var) {
        y1(vf6Var, true);
    }

    public void setBotWebViewButtonOffsetX(float f) {
        this.R0.setTranslationX(f);
        if (this.F0 != null) {
            this.H = f;
            p2();
        }
        this.h2.setTranslationX(this.E + this.y + f);
        this.c1.setTranslationX(f);
        gw1 gw1Var = this.n2;
        if (gw1Var != null) {
            gw1Var.setTranslationX(f);
        }
    }

    public void setButtons(k27 k27Var) {
        A1(k27Var, true, true);
    }

    public void setCaption(String str) {
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setCaption(str);
            N(true);
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z;
        this.T2 = chatFull;
        wx1 wx1Var = this.V0;
        if (wx1Var != null) {
            wx1Var.setChatInfo(chatFull);
        }
        ly1 ly1Var = this.G0;
        if (ly1Var != null) {
            if (chatFull != null && chatFull.boosts_unrestrict > 0) {
                z = true;
            } else {
                z = false;
            }
            ly1Var.b = z;
            ly1Var.invalidate();
        }
        if (hc2.i0(chatFull)) {
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

    public void setDelegate(hy1 hy1Var) {
        this.P3 = hy1Var;
    }

    public void setEditingBusinessLink(TL_account.TL_businessChatLink tL_businessChatLink) {
        String str;
        this.R2 = tL_businessChatLink;
        m2(false);
        if (this.R2 != null) {
            W(true);
            this.v2.setOnClickListener(new fv1(this, (byte) 7));
            TextPaint textPaint = null;
            this.v2.setContentDescription(k96.M0(2131751342, null));
            this.v2.setVisibility(0);
            this.v2.setScaleX(0.1f);
            this.v2.setScaleY(0.1f);
            this.v2.setAlpha(0.0f);
            this.v2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(s33.f).start();
            this.d0 = na7.q1(this.S.a).r1();
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                textPaint = ex1Var.getPaint();
            }
            if (textPaint == null) {
                textPaint = new TextPaint();
                textPaint.setTextSize(gl.L(18.0f));
            }
            Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
            ArrayList<TLRPC.MessageEntity> arrayList = this.R2.entities;
            if (arrayList != null && (str = tL_businessChatLink.message) != null) {
                setFieldText(r(fontMetricsInt, str, arrayList));
            } else {
                String str2 = tL_businessChatLink.message;
                if (str2 != null) {
                    setFieldText(str2);
                }
            }
            this.S2 = B();
            w1(false, false, false);
            getSendButtonInternal().setVisibility(8);
            setSlowModeButtonVisible(false);
            this.Q0.setVisibility(8);
            this.a1.setVisibility(8);
            pkb pkbVar = this.f2;
            if (pkbVar != null) {
                pkbVar.setVisibility(8);
            }
            gw1 gw1Var = this.h2;
            if (gw1Var != null) {
                this.l2 = 0.0f;
                gw1Var.setAlpha(0.0f);
                gw1Var.setScaleX(0.5f);
                gw1Var.setScaleY(0.5f);
            }
            this.q2.setVisibility(8);
            pw1 pw1Var = this.z2;
            if (pw1Var != null) {
                pw1Var.setVisibility(8);
            }
        }
    }

    public void setEffectId(long j) {
        this.O6 = j;
        ow1 ow1Var = this.K0;
        if (ow1Var != null) {
            ow1Var.setEffect(j);
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
                    av1 av1Var = new av1(this, (byte) 16);
                    this.I2 = av1Var;
                    gl.d3(av1Var, 600L);
                    return;
                }
                return;
            }
            ex1 ex1Var = this.F0;
            if (ex1Var != null && ex1Var.isFocused()) {
                if (!this.p3 || this.Z2) {
                    this.F0.clearFocus();
                }
            }
        }
    }

    @Override
    public void setFieldText(CharSequence charSequence) {
        G1(charSequence, false);
    }

    public void setInAppInsetsController(byc bycVar) {
        this.d7 = bycVar;
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
            onLongClickListener = new rv1(this, (byte) 0);
        }
        this.K0.setOnLongClickListener(onLongClickListener);
    }

    public void setOverrideHint(CharSequence charSequence) {
        L1(charSequence, false);
    }

    public void setOverrideKeyboardAnimation(boolean z) {
        this.w = z;
    }

    public void setRichDraftPreview(TL_iv.RichMessage richMessage) {
        if (this.s2 == null) {
            return;
        }
        na7.q1(this.R);
        boolean z = w01.a;
        this.u2 = richMessage;
        t2();
    }

    public void setRoundVideoUiFrameClockActive(boolean z) {
        if (this.Z1 != z) {
            this.Z1 = z;
            my1 my1Var = this.Z0;
            if (my1Var != null) {
                my1Var.setExternalFrameClock(z);
            }
            jy1 jy1Var = this.b2;
            if (jy1Var != null) {
                jy1Var.f = z;
                System.currentTimeMillis();
                jy1Var.h = -1L;
                jy1Var.invalidate();
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
        ex1 ex1Var = this.F0;
        if (ex1Var == null) {
            return;
        }
        ex1Var.setSelection(i, ex1Var.length());
    }

    public void setSideButtonsForAttach(dz1 dz1Var) {
        pkb pkbVar;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        dz1 dz1Var2 = this.e7;
        if (dz1Var2 != dz1Var) {
            if (dz1Var2 != null) {
                dz1Var2.e(0, false, true);
            }
            this.e7 = dz1Var;
            gw1 gw1Var = this.h2;
            if (gw1Var != null && (pkbVar = this.f2) != null && pkbVar.getVisibility() != 0) {
                if (dz1Var != null && O0()) {
                    z = true;
                } else {
                    z = false;
                }
                if (dz1Var != null && !z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (dz1Var != null) {
                    if (z && !A2()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    dz1Var.e(0, z3, true);
                }
                ViewPropertyAnimator viewPropertyAnimator = this.g2;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                ViewPropertyAnimator animate = gw1Var.animate();
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
                ViewPropertyAnimator duration = scaleX.scaleY(f3).setInterpolator(s33.h).setDuration(320L);
                this.g2 = duration;
                duration.start();
            }
        }
    }

    public void setSlideToCancelProgress(float f) {
        this.Y4 = f;
        float measuredWidth = getMeasuredWidth() * 0.35f;
        if (measuredWidth > gl.L(140.0f)) {
            measuredWidth = gl.L(140.0f);
        }
        this.i5 = (int) ((1.0f - this.Y4) * (-measuredWidth));
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.invalidate();
        }
    }

    public void setSlowModeTimer(int i) {
        this.H0 = i;
        y2();
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
        ex1 ex1Var = this.F0;
        if (ex1Var != null) {
            ex1Var.setEnabled(z);
        }
    }

    public void setVoiceDraft(cq6 cq6Var) {
        TL_stories.StoryItem storyItem;
        File file;
        String str;
        if (cq6Var != null) {
            boolean z = cq6Var.g;
            this.P = z;
            l lVar = this.E2;
            if (lVar != null) {
                lVar.E.d(1, z, true);
            }
            hy1 hy1Var = this.P3;
            if (hy1Var != null) {
                storyItem = hy1Var.t0();
            } else {
                storyItem = null;
            }
            MediaController w = MediaController.w();
            int i = this.R;
            long j = this.G3;
            k27 k27Var = this.J3;
            k27 threadMessage = getThreadMessage();
            j1a j1aVar = null;
            int i2 = this.w3;
            mu1 mu1Var = this.F3;
            if (mu1Var != null) {
                j1aVar = mu1Var.Q6();
            }
            long sendMonoForumPeerId = getSendMonoForumPeerId();
            u47 sendMessageSuggestionParams = getSendMessageSuggestionParams();
            co3 co3Var = w.N1;
            if (w.I1) {
                u20 u20Var = w.G1;
                if (u20Var != null && u20Var.e() && w.g1 != null && (file = w.k1) != null && (str = cq6Var.a) != null && str.equals(file.getAbsolutePath())) {
                    w.h1 = i2;
                    w.r1 = k27Var;
                    w.s1 = threadMessage;
                    w.t1 = storyItem;
                    w.u1 = j1aVar;
                    w.p1 = sendMonoForumPeerId;
                    w.q1 = sendMessageSuggestionParams;
                    kk7.f(w.i1).k(kk7.n2, new Object[0]);
                    kk7.f(w.i1).k(kk7.r2, Integer.valueOf(w.h1), w.g1, w.k1.getAbsolutePath(), Boolean.TRUE, Float.valueOf(cq6Var.h), Float.valueOf(cq6Var.i));
                    return;
                } else if (!w.W()) {
                    return;
                }
            }
            w.y0 = false;
            w.X(true);
            co3Var.a(w.M1);
            co3Var.c(new xk6(w, i2, cq6Var, i, j, sendMonoForumPeerId, sendMessageSuggestionParams, threadMessage, k27Var, storyItem));
        }
    }

    public final void t(float f) {
        float f2;
        float i = Utilities.i((f - 0.1f) / 0.9f, 1.0f, 0.0f);
        if (this.B0) {
            f2 = 0.5f;
        } else {
            f2 = 1.0f;
        }
        this.n = G2(0.12f, 0.6f, f) * f2;
        float i2 = Utilities.i(i, 1.0f, 0.0f) - 1.0f;
        this.h = gl.R1(0.55f, 1.0f, b00.w(i2, 1.1f, i2, (2.1f * i2 * i2 * i2) + 1.0f));
        l2();
        this.R0.setRotation((1.0f - s33.h.getInterpolation(i)) * (-20.0f));
    }

    public final void t0() {
        CharSequence textToUse;
        o27 o27Var;
        u47 b;
        TLRPC.Chat chat;
        int i;
        u47 b2;
        k27 k27Var = this.P2;
        if (k27Var != null) {
            boolean o5 = k27Var.o5();
            mu1 mu1Var = this.F3;
            if (o5 && !hc2.z(this.R, 24, k27.B0(this.P2.k))) {
                if (mu1Var == null || (b2 = mu1Var.y5) == null) {
                    b2 = u47.b(this.P2.k.suggested_post);
                }
                if (!gta.Q(this.R, b2.a)) {
                    if (mu1Var != null) {
                        mu1Var.kc(b2);
                        return;
                    }
                    return;
                }
            }
            if (this.d0 - this.e0 < 0) {
                NumberTextView numberTextView = this.c0;
                if (numberTextView != null) {
                    gl.A3(3.5f, numberTextView, null);
                    try {
                        this.c0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                if (!na7.q1(this.R).F3() && na7.q1(this.R).k4.h1.f() > this.e0) {
                    T1();
                    return;
                }
                return;
            }
            if (this.H2 != 0) {
                O1(0, true);
                this.V0.s(false);
                if (this.p4) {
                    P1(false, true, false, true);
                    this.b4 = true;
                    gl.d3(new uv1(this, (byte) 15), 200L);
                }
            }
            ex1 ex1Var = this.F0;
            if (ex1Var == null) {
                textToUse = "";
            } else {
                textToUse = ex1Var.getTextToUse();
            }
            k27 k27Var2 = this.P2;
            if (k27Var2 == null || k27Var2.D != 19) {
                textToUse = gl.m1(textToUse);
            }
            CharSequence[] charSequenceArr = {textToUse};
            if (TextUtils.isEmpty(charSequenceArr[0])) {
                TLRPC.MessageMedia messageMedia = this.P2.k.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (messageMedia instanceof TLRPC.TL_messageMediaEmpty) || messageMedia == null) {
                    gl.A3(-3.0f, this.F0, null);
                    pw0.APP_ERROR.a();
                    return;
                }
            }
            ArrayList Y = hq6.d0(this.R).Y(charSequenceArr, d2(), true);
            if (!TextUtils.equals(charSequenceArr[0], this.P2.v) || ((Y != null && !Y.isEmpty()) || !this.P2.k.entities.isEmpty() || (this.P2.k.media instanceof TLRPC.TL_messageMediaWebPage))) {
                k27 k27Var3 = this.P2;
                k27Var3.y1 = charSequenceArr[0];
                k27Var3.z1 = Y;
                k27Var3.A1 = this.O3;
                if (mu1Var != null && (chat = mu1Var.e) != null && (((i = k27Var3.D) == 0 || i == 19) && !hc2.m(chat))) {
                    k27 k27Var4 = this.P2;
                    k27Var4.A1 = false;
                    TLRPC.Message message = k27Var4.k;
                    message.flags &= -513;
                    message.media = null;
                } else if (mu1Var != null && (o27Var = mu1Var.x5) != null) {
                    if (mu1Var.Y5 instanceof TLRPC.TL_webPagePending) {
                        k27 k27Var5 = this.P2;
                        k27Var5.A1 = false;
                        int i2 = k27Var5.D;
                        if (i2 == 0 || i2 == 19) {
                            k27Var5.k.media = new TLRPC.TL_messageMediaEmpty();
                            this.P2.k.flags |= 512;
                        }
                    } else {
                        TLRPC.WebPage webPage = o27Var.v;
                        k27 k27Var6 = this.P2;
                        if (webPage != null) {
                            k27Var6.A1 = false;
                            TLRPC.Message message2 = k27Var6.k;
                            message2.flags |= 512;
                            message2.media = new TLRPC.TL_messageMediaWebPage();
                            this.P2.k.media.webpage = mu1Var.x5.v;
                        } else {
                            k27Var6.A1 = false;
                            int i3 = k27Var6.D;
                            if (i3 == 0 || i3 == 19) {
                                TLRPC.Message message3 = k27Var6.k;
                                message3.flags |= 512;
                                message3.media = new TLRPC.TL_messageMediaEmpty();
                            }
                        }
                    }
                    TLRPC.Message message4 = this.P2.k;
                    o27 o27Var2 = mu1Var.x5;
                    message4.invert_media = o27Var2.r;
                    if (o27Var2.o) {
                        TLRPC.MessageMedia messageMedia2 = message4.media;
                        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
                            boolean z = o27Var2.q;
                            messageMedia2.force_small_media = z;
                            messageMedia2.force_large_media = !z;
                        }
                    }
                } else {
                    k27 k27Var7 = this.P2;
                    k27Var7.A1 = false;
                    int i4 = k27Var7.D;
                    if (i4 == 0 || i4 == 19) {
                        TLRPC.Message message5 = k27Var7.k;
                        message5.flags |= 512;
                        message5.media = new TLRPC.TL_messageMediaEmpty();
                    }
                }
                if (this.P2.o5()) {
                    x3a a = x3a.a(k27.B0(this.P2.k), this.P2.y1.toString());
                    if (mu1Var == null || (b = mu1Var.y5) == null) {
                        b = u47.b(this.P2.k.suggested_post);
                    }
                    a.T = b;
                    a.R = cf3.n(this.P2.k.saved_peer_id);
                    a.G = this.P2.t2();
                    k27 k27Var8 = this.P2;
                    a.r = k27Var8;
                    a.D = k27Var8;
                    boolean z2 = k27Var8.F0() instanceof TLRPC.TL_document;
                    k27 k27Var9 = this.P2;
                    if (z2) {
                        a.g = (TLRPC.TL_document) k27Var9.F0();
                        a.b = a.a;
                        a.a = null;
                    } else {
                        TLRPC.MessageMedia messageMedia3 = k27Var9.k.media;
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
                    z3a.B(this.R).q0(a);
                } else {
                    z3a B = z3a.B(this.R);
                    k27 k27Var10 = this.P2;
                    B.s(k27Var10, null, null, null, null, null, null, null, false, k27Var10.t2(), null);
                }
            }
            D1(null, null, false);
        }
    }

    public final void t1(SpannableStringBuilder spannableStringBuilder, boolean z, int i, int i2) {
        if (this.F0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        vu3.m(spannableStringBuilder2, this.F0.getPaint().getFontMetricsInt(), false, null, 0);
        gm[] gmVarArr = (gm[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), gm.class);
        if (gmVarArr != null) {
            for (gm gmVar : gmVarArr) {
                gmVar.applyFontMetrics(this.F0.getPaint().getFontMetricsInt(), vl.f());
            }
        }
        ey8.a(spannableStringBuilder2);
        R();
        setFieldText(spannableStringBuilder2);
        v1(z, i, i2, 0L, true);
    }

    public final void t2() {
        boolean z;
        ig9 ig9Var = this.s2;
        if (ig9Var != null) {
            boolean z2 = this.t2;
            if (this.u2 != null && this.P2 == null) {
                z = true;
            } else {
                z = false;
            }
            this.t2 = z;
            ow1 ow1Var = this.K0;
            ImageView imageView = this.S0;
            ew1 ew1Var = this.R0;
            if (z) {
                ig9Var.setResourcesProvider(this.L4);
                this.s2.set(this.u2);
                this.s2.setVisibility(0);
                ex1 ex1Var = this.F0;
                if (ex1Var != null) {
                    ex1Var.setVisibility(8);
                }
                ew1Var.setVisibility(8);
                imageView.setVisibility(0);
                ow1Var.setLocked(!y6c.h(this.R).p());
            } else {
                ig9Var.setVisibility(8);
                ex1 ex1Var2 = this.F0;
                if (ex1Var2 != null) {
                    ex1Var2.setVisibility(0);
                }
                ew1Var.setVisibility(0);
                imageView.setVisibility(8);
                ow1Var.setLocked(false);
            }
            k2();
            if (z2 != this.t2) {
                N(true);
            }
        }
    }

    public final void u(x3a x3aVar) {
        hy1 hy1Var = this.P3;
        if (hy1Var != null) {
            x3aVar.H = hy1Var.t0();
            x3aVar.J = this.P3.D();
        }
    }

    public final void u0(Canvas canvas, boolean z) {
        Paint paint;
        if (!this.X5) {
            return;
        }
        int A = (int) tb4.A(1.0f, this.b6, bkb.h3.getIntrinsicHeight(), this.J2);
        View view = this.w2;
        if (view != null && view.getVisibility() == 0) {
            A = (int) (((1.0f - getTopViewEnterProgress()) * this.w2.getLayoutParams().height) + A);
        }
        int intrinsicHeight = bkb.h3.getIntrinsicHeight() + A;
        if (z) {
            bkb.h3.setAlpha((int) (this.b6 * 255.0f));
            bkb.h3.setBounds(0, A, getMeasuredWidth(), intrinsicHeight);
            bkb.h3.draw(canvas);
        }
        if (this.W5) {
            int F0 = F0(bkb.Ie);
            Paint paint2 = this.a6;
            paint2.setColor(F0);
            if (gba.f() && this.c2 != null) {
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
        wjb wjbVar = this.L4;
        if (wjbVar != null) {
            paint = wjbVar.d("paintChatComposeBackground");
        } else {
            paint = null;
        }
        if (paint == null) {
            paint = bkb.T0("paintChatComposeBackground");
        }
        canvas.drawRect(0.0f, f, width, height, paint);
    }

    public boolean u1() {
        long j;
        String obj;
        jm3 jm3Var = this.j1;
        if (jm3Var != null && jm3Var.r == 4) {
            return false;
        }
        boolean z = this.q6;
        mu1 mu1Var = this.F3;
        if (!z) {
            if (this.p6) {
                return true;
            }
            if (this.F0 != null && this.P2 == null && !this.t2 && !c() && (mu1Var == null || !mu1Var.y())) {
                int i = this.R;
                if (mu1Var != null) {
                    j = mu1Var.a();
                } else {
                    j = this.G3;
                }
                dc b = ec.b(i, j);
                if (b != null) {
                    Editable text = this.F0.getText();
                    String str = "";
                    if (text == null) {
                        obj = "";
                    } else {
                        obj = text.toString();
                    }
                    if (!TextUtils.isEmpty(obj.trim()) && !obj.trim().startsWith("/")) {
                        e2();
                        this.p6 = true;
                        cc ccVar = this.m6;
                        if (ccVar != null) {
                            if (!ccVar.d) {
                                ccVar.d = true;
                                ccVar.a.invalidate();
                            }
                            this.m6.c(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                        int i2 = this.R;
                        ae2 ae2Var = new ae2(this, obj, (byte) 8);
                        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                        CharSequence[] charSequenceArr = {spannableStringBuilder};
                        tL_textWithEntities.entities = hq6.d0(i2).Y(charSequenceArr, true, true);
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
                            inputAiComposeTone = ec.d(inputAiComposeTone);
                        }
                        tL_messages_composeMessageWithAI.tone = inputAiComposeTone;
                        this.o6 = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_messages_composeMessageWithAI, new hc((byte) 0), new defpackage.f(ae2Var, (byte) 8));
                        return true;
                    }
                }
            }
        }
        boolean z2 = this.t2;
        wjb wjbVar = this.L4;
        if (z2 && !y6c.h(this.R).p()) {
            hd9.q0(wjbVar, getContext(), new uv1(this, (byte) 5), new uv1(this, (byte) 6));
            return true;
        } else if (c()) {
            ij.J(this.E3, mu1Var.a(), new iw1(this, (byte) 3), wjbVar);
            return true;
        } else {
            return v1(true, 0, 0, 0L, true);
        }
    }

    public final void u2(boolean z) {
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
        boolean y = cf3.y(this.G3);
        ImageView imageView = this.y2;
        int i4 = 0;
        if (y) {
            TLRPC.Chat K0 = na7.q1(this.S.a).K0(Long.valueOf(-this.G3));
            this.W2 = na7.q1(this.R).W3.getBoolean("silent_" + this.G3, false);
            if (hc2.T(K0) && ((K0.creator || ((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_messages)) && !K0.megagroup)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.X2 = z2;
            if (imageView != null) {
                k33 k33Var = this.f0;
                if (k33Var == null) {
                    k33Var = new k33(getContext(), 2131231513, bkb.Ml);
                    this.f0 = k33Var;
                }
                k33Var.a(this.W2, false);
                imageView.setImageDrawable(this.f0);
            } else {
                z2 = false;
            }
            pkb pkbVar = this.f2;
            if (pkbVar != null) {
                if (pkbVar.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                n2(i3);
            }
        } else {
            z2 = false;
        }
        if (this.P3 != null && !c() && this.P3.M()) {
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
        pw1 pw1Var = this.z2;
        if (pw1Var != null) {
            if ((pw1Var.getTag() != null && z4) || (this.z2.getTag() == null && !z4)) {
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
            pw1 pw1Var2 = this.z2;
            if (z4) {
                num = 1;
            } else {
                num = null;
            }
            pw1Var2.setTag(num);
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
            pw1 pw1Var3 = this.z2;
            if (pw1Var3 != null) {
                if (z4) {
                    pw1Var3.setVisibility(0);
                }
                this.z2.setPivotX(gl.L(24.0f));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.C2 = animatorSet2;
                pw1 pw1Var4 = this.z2;
                if (z4) {
                    f4 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pw1Var4, View.ALPHA, f4);
                pw1 pw1Var5 = this.z2;
                if (z4) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.1f;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pw1Var5, View.SCALE_X, f3);
                pw1 pw1Var6 = this.z2;
                if (z4) {
                    f5 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(pw1Var6, View.SCALE_Y, f5));
                this.C2.setDuration(180L);
                this.C2.addListener(new rw1(this, z4, (byte) 3));
                this.C2.start();
                return;
            }
            return;
        }
        pw1 pw1Var7 = this.z2;
        if (pw1Var7 != null) {
            if (z4) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            pw1Var7.setVisibility(i2);
            pw1 pw1Var8 = this.z2;
            if (z4) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            pw1Var8.setAlpha(f);
            pw1 pw1Var9 = this.z2;
            if (z4) {
                f2 = 1.0f;
            } else {
                f2 = 0.1f;
            }
            pw1Var9.setScaleX(f2);
            pw1 pw1Var10 = this.z2;
            if (z4) {
                f5 = 1.0f;
            }
            pw1Var10.setScaleY(f5);
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
    public final void updateColors() {
        int i;
        TextPaint textPaint;
        int i2;
        wjb wjbVar = this.L4;
        try {
            ex1 ex1Var = this.F0;
            if (ex1Var != null) {
                zkb.l(ex1Var, 34, bkb.Le, wjbVar);
                zkb.v(this.F0, bkb.Me, wjbVar);
                zkb.y(this.F0, bkb.lg, wjbVar);
            }
            Paint paint = this.G2;
            if (paint != null) {
                paint.setColor(F0(bkb.Rf));
            }
            ly1 ly1Var = this.G0;
            if (ly1Var != null) {
                ((jia) ly1Var.c).setTextColor(F0(bkb.Ml));
                ly1Var.invalidate();
            }
            AnimatedArrowDrawable animatedArrowDrawable = this.v4;
            if (animatedArrowDrawable != null) {
                animatedArrowDrawable.a.setColor(F0(bkb.Ml));
                animatedArrowDrawable.invalidateSelf();
            }
            ow1 ow1Var = this.K0;
            if (ow1Var != null && this.L0 != 0 && ow1Var.getBackground() != null) {
                if (this.H0 == Integer.MAX_VALUE && !V0()) {
                    i2 = bkb.Ml;
                } else {
                    i2 = bkb.Oe;
                }
                int F0 = F0(i2);
                if (F0 != this.L0) {
                    this.L0 = F0;
                    bkb.F1(ow1Var.getBackground(), Color.argb(24, Color.red(F0), Color.green(F0), Color.blue(F0)), true);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        jm3 jm3Var = this.j1;
        if (jm3Var != null) {
            jm3Var.L();
        }
        s2();
        RecordCircle recordCircle = this.D2;
        if (recordCircle != null) {
            recordCircle.h();
        }
        jy1 jy1Var = this.b2;
        if (jy1Var != null) {
            jy1Var.f();
        }
        SlideTextView slideTextView = this.a2;
        if (slideTextView != null) {
            slideTextView.b();
        }
        my1 my1Var = this.Z0;
        if (my1Var != null && (textPaint = my1Var.G) != null) {
            textPaint.setColor(my1Var.J.F0(bkb.F6));
        }
        scc sccVar = this.g1;
        if (sccVar != null) {
            sccVar.e.setColor(bkb.w0(null, bkb.Z6, false));
            sccVar.M = 0;
            qcc qccVar = sccVar.Q;
            if (qccVar != null) {
                qccVar.b();
            }
        }
        NumberTextView numberTextView = this.c0;
        if (numberTextView != null && this.F0 != null) {
            if (this.e0 - this.d0 < 0) {
                numberTextView.setTextColor(F0(bkb.o7));
            } else {
                numberTextView.setTextColor(F0(bkb.x6));
            }
        }
        F0(bkb.Sf);
        cx1 cx1Var = this.n0;
        if (cx1Var != null) {
            cx1Var.d.setColor(bkb.w0(null, bkb.yj, false));
            il0 il0Var = cx1Var.r;
            if (il0Var != null) {
                il0Var.updateColors();
            }
            cx1Var.invalidate();
        }
        tx1 tx1Var = this.x2;
        if (tx1Var != null) {
            tx1Var.d();
        }
        if (this.b1) {
            i = F0(bkb.Ml);
        } else {
            i = -1;
        }
        mw1 mw1Var = this.c1;
        if (mw1Var != null && (!this.R6 || i != this.P6)) {
            this.R6 = true;
            this.P6 = i;
            mw1Var.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        int F02 = F0(bkb.h6);
        if (!this.S6 || F02 != this.Q6) {
            this.S6 = true;
            this.Q6 = F02;
            ew1 ew1Var = this.R0;
            if (ew1Var != null) {
                ew1Var.setBackground(bkb.f0(F02, 1, -1));
            }
            ImageView imageView = this.S0;
            if (imageView != null) {
                int L = gl.L(1.0f);
                int L2 = gl.L(3.0f);
                imageView.setBackground(bkb.W(gl.L(19.0f), F02, L, L2, L, L2));
            }
        }
    }

    public final void v(float f) {
        i29 i29Var;
        int i;
        this.V1 = f;
        i29 i29Var2 = this.i1;
        int i2 = 0;
        if (i29Var2 != null) {
            i29Var2.setNewContentAlpha(1.0f);
            this.i1.setAlpha(Math.max(0.0f, 1.0f - (1.8f * f)));
            float R1 = gl.R1(1.0f, 0.94f, f);
            this.i1.setPivotX(gl.L(17.0f));
            this.i1.setPivotY(i29Var.getHeight() / 2.0f);
            this.i1.setScaleX(R1);
            this.i1.setScaleY(R1);
            this.i1.setTranslationX((-gl.L(20.0f)) * f);
            i29 i29Var3 = this.i1;
            if (f >= 1.0f) {
                i = 4;
            } else {
                i = 0;
            }
            i29Var3.setVisibility(i);
        }
        ojc ojcVar = this.T1;
        if (ojcVar != null) {
            ojcVar.setModeProgress(f);
            ojc ojcVar2 = this.T1;
            if (f <= 0.0f) {
                i2 = 8;
            }
            ojcVar2.setVisibility(i2);
        }
    }

    public final boolean v0(Canvas canvas, h8c h8cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float d = this.b7.d(this.F0.canScrollVertically(-1));
        float d2 = this.c7.d(this.F0.canScrollVertically(1));
        if (d <= 0.0f && d2 <= 0.0f) {
            return ((Boolean) h8cVar.run()).booleanValue();
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gl.L(5.0f), this.F0.getY() + this.F0.getMeasuredHeight() + gl.L(2.0f), 255, 31);
        boolean booleanValue = ((Boolean) h8cVar.run()).booleanValue();
        canvas.save();
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        LinearGradient linearGradient = this.Z6;
        Paint paint = this.Y6;
        Matrix matrix = this.a7;
        if (i > 0) {
            RectF rectF = gl.P;
            f3 = 255.0f;
            f4 = 16.0f;
            f = 0.0f;
            f2 = 5.0f;
            rectF.set(this.F0.getX() - gl.L(5.0f), (this.F0.getY() + this.J2) - 1.0f, this.F0.getX() + this.F0.getMeasuredWidth() + gl.L(5.0f), this.F0.getY() + this.J2 + gl.L(13.0f));
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
            RectF rectF2 = gl.P;
            rectF2.set(this.F0.getX() - gl.L(f2), (this.F0.getY() + this.F0.getMeasuredHeight()) - gl.L(15.0f), this.F0.getX() + this.F0.getMeasuredWidth() + gl.L(f2), this.F0.getY() + this.F0.getMeasuredHeight() + gl.L(2.0f) + 1.0f);
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

    public boolean v1(final boolean r38, final int r39, final int r40, long r41, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.v1(boolean, int, int, long, boolean):boolean");
    }

    public void v2(boolean z) {
        w2(false, z);
    }

    public boolean w() {
        return false;
    }

    public final void w0(FrameLayout frameLayout, Canvas canvas, float f, float f2, float f3, float f4) {
        float f5;
        int[] iArr;
        boolean z;
        il0 il0Var;
        il0 il0Var2;
        float f6;
        float f7;
        i29 i29Var = this.i1;
        if (i29Var != null && this.K1) {
            f5 = i29Var.getTrimProgress();
        } else {
            f5 = 0.0f;
        }
        if (f5 > 0.0f && this.i1.getVisibility() == 0) {
            i29 i29Var2 = this.i1;
            if (i29Var2.T0 == null && f4 > f3) {
                i29Var2.getLocationInWindow(this.s5);
                float trimHandleX = this.i1.getTrimHandleX() + iArr[0];
                float N = gl.N(6.0f);
                float N2 = gl.N(11.0f);
                float trimWindowTop = ((this.i1.getTrimWindowTop() + iArr[1]) - gl.N(4.0f)) - N;
                String trimBubbleText = this.i1.getTrimBubbleText();
                TextPaint textPaint = this.m5;
                textPaint.setTextSize(gl.L(13.0f));
                textPaint.setTypeface(gl.n1("fonts/rmedium.ttf"));
                textPaint.setColor(-1);
                float measureText = textPaint.measureText(trimBubbleText);
                float N3 = gl.N(23.0f) + measureText;
                float N4 = gl.N(29.0f);
                float max = Math.max(gl.L(8.0f), Math.min((gl.q.x - gl.L(8.0f)) - N3, trimHandleX - (N3 / 2.0f)));
                RectF rectF = this.r5;
                rectF.set(max, trimWindowTop - N4, max + N3, trimWindowTop);
                float i = Utilities.i(trimHandleX, rectF.right - gl.L(16.0f), rectF.left + gl.L(16.0f));
                Path path = this.p5;
                path.rewind();
                float f8 = N4 / 2.0f;
                path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
                Path path2 = this.q5;
                path2.rewind();
                float f9 = i - N2;
                path2.moveTo(f9, trimWindowTop - gl.N(2.0f));
                path2.lineTo(f9, trimWindowTop);
                float f10 = trimWindowTop + N;
                path2.cubicTo(i - gl.N(6.5f), trimWindowTop, i - gl.N(3.2f), f10, i, f10);
                float N5 = gl.N(3.2f) + i;
                float N6 = gl.N(6.5f) + i;
                float f11 = i + N2;
                path2.cubicTo(N5, f10, N6, trimWindowTop, f11, trimWindowTop);
                path2.lineTo(f11, trimWindowTop - gl.N(2.0f));
                path2.close();
                path.op(path2, Path.Op.UNION);
                canvas.save();
                canvas.translate(-f, -f2);
                canvas.clipRect(-100000.0f, f3, 100000.0f, f4);
                float R1 = gl.R1(0.8f, 1.0f, f5);
                canvas.scale(R1, R1, i, f10);
                canvas.translate(0.0f, (1.0f - f5) * gl.L(6.0f));
                kl0 kl0Var = this.L1;
                if (kl0Var == null) {
                    il0Var2 = null;
                } else {
                    if (frameLayout != this) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        il0Var = this.u5;
                    } else {
                        il0Var = this.v5;
                    }
                    if (il0Var == null) {
                        il0Var2 = kl0Var.c(frameLayout, this.w5, false);
                        il0Var2.r(0.0f);
                        il0Var2.X = 0.0f;
                        if (z) {
                            this.u5 = il0Var2;
                        } else {
                            this.v5 = il0Var2;
                        }
                    } else {
                        il0Var2 = il0Var;
                    }
                }
                if (il0Var2 != null) {
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.translate(f, f2);
                    f6 = 255.0f;
                    il0Var2.setBounds((int) Math.floor(rectF.left - f), (int) Math.floor(rectF.top - f2), (int) Math.ceil(rectF.right - f), (int) Math.ceil(f10 - f2));
                    il0Var2.setAlpha((int) (f5 * 255.0f));
                    il0Var2.draw(canvas);
                    canvas.restore();
                } else {
                    f6 = 255.0f;
                }
                if (il0Var2 != null) {
                    f7 = 0.5f;
                } else {
                    f7 = 0.6f;
                }
                int p1 = bkb.p1(f7 * f5, -16777216);
                Paint paint = this.n5;
                paint.setColor(p1);
                canvas.drawPath(path, paint);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint2 = this.o5;
                paint2.setStyle(style);
                paint2.setStrokeWidth(gl.N(0.66f));
                paint2.setColor(bkb.p1(0.16f * f5, -1));
                canvas.drawPath(path, paint2);
                textPaint.setAlpha((int) (f5 * f6));
                canvas.drawText(trimBubbleText, rectF.centerX() - (measureText / 2.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
                canvas.restore();
            }
        }
    }

    public final void w1(boolean z, boolean z2, boolean z3) {
        if ((this.z3 != z || this.A3 != z2) && this.V0 != null) {
            if (this.X0 && !z3) {
                this.w4 = true;
                J0(false);
            } else if (z3) {
                i1();
            }
        }
        this.y3 = true;
        this.z3 = z;
        this.A3 = z2;
        wx1 wx1Var = this.V0;
        if (wx1Var != null) {
            wx1Var.I(true, z, z2, true);
        }
        E1(false, !this.Z2);
    }

    public final void w2(boolean z, boolean z2) {
        TLRPC.Peer peer;
        TLRPC.Chat chat;
        TLRPC.Peer peer2;
        boolean z3;
        float f;
        float f2;
        float f3;
        ValueAnimator valueAnimator;
        ex1 ex1Var;
        k4a k4aVar;
        k4a k4aVar2;
        cw1 cw1Var;
        if (this.P3 != null) {
            Z();
            if (this.o7) {
                peer2 = this.P3.i();
                chat = null;
            } else {
                TLRPC.Chat K0 = na7.q1(this.R).K0(Long.valueOf(-this.G3));
                TLRPC.ChatFull L0 = na7.q1(this.R).L0(-this.G3);
                if (L0 != null) {
                    peer = L0.default_send_as;
                } else {
                    peer = null;
                }
                TLRPC.Peer peer3 = peer;
                chat = K0;
                peer2 = peer3;
            }
            if (peer2 == null && this.P3.v() != null && !this.P3.v().peers.isEmpty()) {
                peer2 = this.P3.v().peers.get(0).peer;
            }
            mu1 mu1Var = this.F3;
            boolean z4 = true;
            if (!z && peer2 != null && ((this.P3.v() == null || this.P3.v().peers.size() > 1) && !P0() && !T0() && (((cw1Var = this.f1) == null || cw1Var.getVisibility() != 0) && ((this.o7 || ((!hc2.V(chat) || hc2.k(chat)) && !hc2.p0(chat))) && (mu1Var == null || mu1Var.g4 != 9))))) {
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
                    TLRPC.Chat K02 = na7.q1(i2).K0(Long.valueOf(peer2.channel_id));
                    if (K02 != null && (k4aVar2 = this.q0) != null) {
                        k4aVar2.setAvatar(K02);
                        this.q0.setContentDescription(k96.a0(null, null, 2131754775, K02.title));
                    }
                } else {
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(peer2.user_id));
                    if (V1 != null && (k4aVar = this.q0) != null) {
                        k4aVar.setAvatar(V1);
                        this.q0.setContentDescription(k96.a0(null, null, 2131754775, qu2.m(0, V1.first_name, V1.last_name)));
                    }
                }
            }
            k4a k4aVar3 = this.q0;
            if (k4aVar3 == null || k4aVar3.getVisibility() != 0) {
                z4 = false;
            }
            int L = gl.L(2.0f);
            float f4 = 1.0f;
            float f5 = 0.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
                f4 = 0.0f;
            }
            k4a k4aVar4 = this.q0;
            if (k4aVar4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) k4aVar4.getLayoutParams();
                k4a k4aVar5 = this.q0;
                if (z3) {
                    f3 = ((-k4aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f2 = 0.0f;
                } else {
                    f2 = ((-k4aVar5.getLayoutParams().width) - marginLayoutParams.leftMargin) - L;
                    f3 = 0.0f;
                }
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
            if (z4 != z3) {
                k4a k4aVar6 = this.q0;
                if (k4aVar6 == null) {
                    valueAnimator = null;
                } else {
                    valueAnimator = (ValueAnimator) k4aVar6.getTag();
                }
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.q0.setTag(null);
                }
                int i3 = 8;
                ew1 ew1Var = this.R0;
                if (!z3 && this.q0 != null && g0() && this.v3 && (ex1Var = this.F0) != null && z2) {
                    float translationX = this.F0.getTranslationX() + ex1Var.getLeft();
                    float translationX2 = ew1Var.getTranslationX() + ew1Var.getLeft();
                    this.q0.setVisibility(8);
                    this.q0.setTranslationX(0.0f);
                    this.q0.setAlpha(0.0f);
                    ex1 ex1Var2 = this.F0;
                    ex1Var2.getViewTreeObserver().addOnPreDrawListener(new rx1(this, ex1Var2, translationX, translationX2));
                } else if ((this.o7 || (mu1Var != null && mu1Var.T6() == 0 && mu1Var.g6)) && z2) {
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    k4a k4aVar7 = this.q0;
                    if (k4aVar7 != null) {
                        k4aVar7.setTranslationX(f3);
                    }
                    this.H = f3;
                    p2();
                    float f6 = f2;
                    float f7 = f4;
                    float f8 = f3;
                    duration.addUpdateListener(new zl(this, f8, f6, f, f7, (byte) 2));
                    duration.addListener(new sx1(this, z3, f, f8, f7, f6));
                    duration.start();
                    k4a k4aVar8 = this.q0;
                    if (k4aVar8 != null) {
                        k4aVar8.setTag(duration);
                    }
                } else {
                    float f9 = f4;
                    boolean z5 = z3;
                    float f10 = f2;
                    if (z5) {
                        f0();
                    }
                    k4a k4aVar9 = this.q0;
                    if (k4aVar9 != null) {
                        if (z5) {
                            i3 = 0;
                        }
                        k4aVar9.setVisibility(i3);
                        this.q0.setTranslationX(f10);
                    }
                    if (z5) {
                        f5 = f10;
                    }
                    ew1Var.setTranslationX(f5);
                    this.H = f5;
                    p2();
                    k4a k4aVar10 = this.q0;
                    if (k4aVar10 != null) {
                        k4aVar10.setAlpha(f9);
                        this.q0.setTag(null);
                    }
                }
            }
        }
    }

    public final void x() {
        if (this.V0.getParent() == null) {
            byc bycVar = this.d7;
            ViewGroup viewGroup = this.d2;
            wx1 wx1Var = this.V0;
            if (bycVar == null) {
                viewGroup.addView(wx1Var);
            } else {
                viewGroup.addView(wx1Var, nme.c(-1.0f, -1));
            }
        }
    }

    public final px1 x0(k27 k27Var, boolean z) {
        CharSequence textToUse;
        ?? k27Var2 = new k27(k27Var.K1, k27Var.k, true, true);
        if (z) {
            ex1 ex1Var = this.F0;
            if (ex1Var == null) {
                textToUse = "";
            } else {
                textToUse = ex1Var.getTextToUse();
            }
            CharSequence[] charSequenceArr = {textToUse};
            ArrayList Y = hq6.d0(this.R).Y(charSequenceArr, true, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceArr[0].toString());
            k27.b(spannableStringBuilder, Y, true, true, false, true, 0);
            k27Var2.z = k27.A5(vu3.m(spannableStringBuilder, bkb.n2.getFontMetricsInt(), false, null, 0), Y, bkb.n2.getFontMetricsInt(), false);
        }
        return k27Var2;
    }

    public final void x1() {
        je5 je5Var = this.M;
        if (je5Var == null) {
            return;
        }
        je5Var.t(vu3.o(gl.S2(k96.a0(null, null, 2131743523, l7c.k(this.F3.h(), true))), this.M.getTextPaint().getFontMetricsInt(), 20, new uv1(this, (byte) 14)));
        je5 je5Var2 = this.M;
        je5Var2.h = je5.a(je5Var2.getText(), this.M.getTextPaint());
    }

    public final void x2() {
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
            n2(this.L6);
        }
        if (this.o7) {
            V();
            boolean w = w();
            int i3 = this.R;
            if (w) {
                int[] iArr = na7.q1(i3).T3;
                if (iArr != null && iArr.length > 2) {
                    b = iArr[2];
                } else {
                    b = 400;
                }
            } else {
                b = de5.b(i3, (int) starsPrice, 1);
            }
            if (this.d0 != b) {
                this.d0 = b;
                if (b > 0) {
                    int i4 = b - this.e0;
                    if (this.o7) {
                        i = 5;
                    } else {
                        i = 100;
                    }
                    if (i4 <= i) {
                        if (i4 < -9999) {
                            i4 = -9999;
                        }
                        V();
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
                            i2 = bkb.o7;
                        } else {
                            i2 = bkb.x6;
                        }
                        numberTextView2.setTextColor(F0(i2));
                        return;
                    }
                }
                NumberTextView numberTextView3 = this.c0;
                if (numberTextView3 != null) {
                    numberTextView3.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new aw1(this, (byte) 2));
                }
            }
        }
    }

    public final boolean y(boolean z) {
        if (!z && this.R3 == null && !T0() && !A2()) {
            return false;
        }
        return true;
    }

    public final void y0() {
        if (this.n6 == null && this.F0 != null) {
            bn3 bn3Var = new bn3(this.F0);
            this.n6 = bn3Var;
            bn3Var.C = true;
            bn3Var.D = true;
            bn3Var.F = 0.0f;
            bn3Var.E = gl.L(5.0f);
            j92 C0 = C0();
            if (C0 != null) {
                if (this.u6 == null) {
                    this.u6 = new om3();
                }
                if (C0.h == null) {
                    C0.h = new q31(this, C0, (byte) 19);
                }
            }
            int max = Math.max(this.F0.getWidth(), gl.q.x);
            bn3 bn3Var2 = this.n6;
            int L = gl.L(160.0f);
            bn3Var2.getClass();
            kra kraVar = bn3Var2.c;
            if (max > 0 && L > 0) {
                int L2 = (gl.L(4.0f) + max) * L;
                int[] iArr = bn3Var2.G;
                if (iArr == null || iArr.length < L2) {
                    try {
                        bn3Var2.G = new int[L2];
                    } catch (Throwable unused) {
                    }
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(gl.L(24.0f), gl.L(12.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    int i = bn3Var2.w;
                    int i2 = bn3Var2.x;
                    bn3Var2.w = 0;
                    bn3Var2.x = createBitmap.getHeight();
                    int f = bn3Var2.f(64, createBitmap, true);
                    for (int i3 = 0; i3 < f; i3++) {
                        float[] fArr = bn3Var2.i;
                        int i4 = i3 * 3;
                        kraVar.g(fArr[i4], fArr[i4 + 1], 1.0f, -1.0f, 0.05f, 0.0f);
                    }
                    kraVar.b(canvas, 1.0f);
                    kraVar.a();
                    bn3Var2.k = 0;
                    bn3Var2.w = i;
                    bn3Var2.x = i2;
                    createBitmap.recycle();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void y1(vf6 vf6Var, boolean z) {
        this.X6 = vf6Var;
        if (vf6Var.m() == 1 && ((TL_bots.BotInfo) vf6Var.n(0)).user_id == this.G3) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vf6Var.n(0);
            TL_bots.BotMenuButton botMenuButton = botInfo.menu_button;
            if (botMenuButton instanceof TL_bots.TL_botMenuButton) {
                TL_bots.TL_botMenuButton tL_botMenuButton = (TL_bots.TL_botMenuButton) botMenuButton;
                this.j0 = tL_botMenuButton.text;
                this.k0 = tL_botMenuButton.url;
                this.p7 = 3;
            } else if (!botInfo.commands.isEmpty()) {
                this.p7 = 2;
            } else {
                this.p7 = 1;
            }
        } else {
            this.p7 = 1;
        }
        dp0 dp0Var = this.o0;
        if (dp0Var != null) {
            dp0Var.E(vf6Var);
        }
        h2(z);
        J(z);
    }

    public final void y2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatActivityEnterView.y2():void");
    }

    public final boolean z() {
        ep0 ep0Var = this.m0;
        if (ep0Var != null && ep0Var.w) {
            return true;
        }
        return false;
    }

    public final jm3 z0() {
        jm3 jm3Var = this.j1;
        if (jm3Var == null) {
            jm3 jm3Var2 = new jm3(getContext(), new d(this));
            this.j1 = jm3Var2;
            return jm3Var2;
        }
        return jm3Var;
    }

    public final void z1(int i, boolean z, boolean z2) {
        this.e3 = i;
        if (this.f3 == z) {
            return;
        }
        this.f3 = z;
        h2(z2);
    }

    public final long z2(String str, Runnable runnable) {
        long j;
        RecordCircle recordCircle;
        if (!this.v3 && this.R3 != null) {
            r1();
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
        gl.d3(new jn1(this, str, runnable, (byte) 7), j);
        return j;
    }

    @Override
    public gt3 getEditField() {
        return this.F0;
    }

    @Override
    public mu1 getParentFragment() {
        return this.F3;
    }

    public void U0() {
    }

    public void B0(Menu menu) {
    }

    public void a1(float f) {
    }

    @Override
    public final void F(float f, int i) {
    }

    public void c1(int i, int i2) {
    }
}
