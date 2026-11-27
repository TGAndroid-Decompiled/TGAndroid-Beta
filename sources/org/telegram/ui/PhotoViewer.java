package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.Space;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PhotoViewer;
public class PhotoViewer implements fn7, qu4, pu4, s84 {
    public static Drawable[] d9;
    public static final Paint e9 = new Paint(2);
    public static final HashMap f9 = new HashMap();
    public static DecelerateInterpolator g9;
    public static Paint h9;
    public static final Property i9;
    public static volatile PhotoViewer j9;
    public static volatile PhotoViewer k9;
    public k8 A0;
    public rec A1;
    public View A2;
    public final int[] A3;
    public ImageReceiver A4;
    public boolean A5;
    public float A6;
    public boolean A7;
    public long A8;
    public s6 B0;
    public cz9 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public byte B5;
    public float B6;
    public boolean B7;
    public float B8;
    public s7 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public long C5;
    public float C6;
    public defpackage.c C7;
    public pc8 C8;
    public s7 D0;
    public k88 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public fi0 D4;
    public long D5;
    public float D6;
    public final float[] D7;
    public r47 D8;
    public Activity E;
    public s7 E0;
    public final u33 E1;
    public boolean E2;
    public ImageView E3;
    public fi0 E4;
    public w49 E5;
    public float E6;
    public final float[] E7;
    public boolean E8;
    public ContextThemeWrapper F;
    public s7 F0;
    public u33 F1;
    public zc8 F2;
    public boolean F3;
    public fi0 F4;
    public String F5;
    public float F6;
    public ObjectAnimator F7;
    public boolean F8;
    public y10 G;
    public b8 G0;
    public u33 G1;
    public kfc G2;
    public byte G3;
    public boolean G4;
    public boolean G5;
    public float G6;
    public byte G7;
    public boolean G8;
    public ImageView H;
    public p10 H0;
    public fo6 H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public long H5;
    public boolean H6;
    public u8a H7;
    public boolean H8;
    public Drawable I;
    public oob I0;
    public fo6 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public int I5;
    public boolean I6;
    public float I7;
    public String I8;
    public tk0 J;
    public oob J0;
    public c98 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public float J7;
    public final mm J8;
    public boolean K;
    public dh2 K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public final y98 K7;
    public mm[] K8;
    public boolean L;
    public final HashMap L0;
    public rx5 L1;
    public float L2;
    public boolean L3;
    public final Matrix L4;
    public boolean L5;
    public byte L6;
    public Path L7;
    public RectF L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public hc8 M1;
    public float M2;
    public boolean M3;
    public final Paint M4;
    public boolean M5;
    public byte M6;
    public Paint M7;
    public RectF M8;
    public dd8 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public Bitmap N4;
    public boolean N5;
    public boolean N6;
    public Paint N7;
    public Matrix N8;
    public cd8 O;
    public CheckBox O0;
    public gc8 O1;
    public float O2;
    public long O3;
    public int O4;
    public final boolean[] O5;
    public boolean O6;
    public LinearGradient O7;
    public float[] O8;
    public boolean P;
    public CounterView P0;
    public boolean P1;
    public float P2;
    public boolean P3;
    public int P4;
    public boolean P5;
    public boolean P6;
    public LinearGradient P7;
    public RenderNode P8;
    public boolean Q;
    public jo0 Q0;
    public id Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean Q4;
    public boolean Q5;
    public boolean Q6;
    public Matrix Q7;
    public RenderNode Q8;
    public kb8 R;
    public FrameLayout R0;
    public wc8 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public Matrix R7;
    public final qeb R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public kfc S2;
    public long S3;
    public r47 S4;
    public boolean S5;
    public byte S6;
    public final int[] S7;
    public final zh6 S8;
    public Paint T;
    public di3 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public VideoAds T4;
    public boolean T5;
    public VelocityTracker T6;
    public gd8 T7;
    public boolean T8;
    public int U;
    public n85 U0;
    public ic8 U1;
    public boolean U2;
    public fb8 U3;
    public ArrayList U4;
    public boolean U5;
    public Scroller U6;
    public pa2 U7;
    public me8 U8;
    public int V;
    public pa2 V0;
    public pb8 V1;
    public boolean V2;
    public int V3;
    public Uri V4;
    public float V5;
    public final ArrayList V6;
    public RadialProgressView V7;
    public float V8;
    public int W;
    public TextView W0;
    public qb8 W1;
    public boolean W2;
    public cv3 W3;
    public final xc8 W4;
    public float W5;
    public final SparseArray[] W6;
    public FrameLayout W7;
    public boolean W8;
    public float X;
    public final lb8[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public TLRPC.BotInlineResult X4;
    public float X5;
    public final ArrayList X6;
    public mb8 X7;
    public boolean X8;
    public wa8 Y;
    public ei1 Y0;
    public d26 Y1;
    public boolean Y2;
    public byte Y3;
    public jn5 Y4;
    public float Y5;
    public final SparseArray[] Y6;
    public TextView Y7;
    public final RectF Y8;
    public ll0 Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public jn5 Z4;
    public float Z5;
    public final ArrayList Z6;
    public AnimatorSet Z7;
    public boolean Z8;
    public final fm0 a = new fm0(0, this, k43.h, 380, false);
    public r89 a0;
    public ImageView a1;
    public FrameLayout a2;
    public float a3;
    public final ob2 a4;
    public oy9 a5;
    public float a6;
    public final ArrayList a7;
    public long a8;
    public boolean a9;
    public final boolean b;
    public r89 b0;
    public ImageView b1;
    public n12 b2;
    public String b3;
    public final VideoFramesRewinder b4;
    public final String[] b5;
    public float b6;
    public final ArrayList b7;
    public long b8;
    public final y98 b9;
    public int c;
    public tl0 c0;
    public ImageView c1;
    public e26 c2;
    public String c3;
    public final yb8 c4;
    public fd8 c5;
    public float c6;
    public final ArrayList c7;
    public long c8;
    public final hb8 c9;
    public ed8 d;
    public xl0 d0;
    public ImageView d1;
    public int d2;
    public long d3;
    public final w10 d4;
    public String d5;
    public float d6;
    public final ArrayList d7;
    public volatile int d8;
    public boolean e;
    public WindowManager.LayoutParams e0;
    public pb2 e1;
    public boolean e2;
    public float e3;
    public String e4;
    public long e5;
    public float e6;
    public final ArrayList e7;
    public volatile int e8;
    public boolean f;
    public ad8 f0;
    public d7 f1;
    public boolean f2;
    public boolean f3;
    public boolean f4;
    public String f5;
    public float f6;
    public final ArrayList f7;
    public int f8;
    public nc8 g0;
    public s96 g1;
    public boolean g2;
    public long g3;
    public boolean g4;
    public boolean g5;
    public float g6;
    public jn5 g7;
    public int g8;
    public int h;
    public z h0;
    public nb8 h1;
    public boolean h2;
    public boolean h3;
    public final ob8 h4;
    public TL_iv.PageBlock h5;
    public float h6;
    public a0 h7;
    public volatile int h8;
    public ClippingImageView i0;
    public ArrayList i1;
    public boolean i2;
    public kd8 i3;
    public final ob8 i4;
    public mn5 i5;
    public float i6;
    public bd8 i7;
    public volatile int i8;
    public b6 j0;
    public ArrayList j1;
    public boolean j2;
    public String j3;
    public final float[][] j4;
    public boolean j5;
    public float j6;
    public final Rect j7;
    public volatile int j8;
    public View k0;
    public iec k1;
    public lm k2;
    public ValueAnimator k3;
    public zu1 k4;
    public boolean k5;
    public float k6;
    public lfc k7;
    public volatile int k8;
    public int l0;
    public kg5 l1;
    public boolean l2;
    public boolean l3;
    public org.telegram.ui.ActionBar.e l4;
    public boolean l5;
    public float l6;
    public Uri l7;
    public volatile int l8;
    public TextView m0;
    public wd5 m1;
    public boolean m2;
    public final int[] m3;
    public byte m4;
    public boolean m5;
    public long m6;
    public long m7;
    public volatile int m8;
    public boolean n;
    public TextView n0;
    public kxb n1;
    public boolean n2;
    public final int[] n3;
    public long n4;
    public String n5;
    public int n6;
    public final y98 n7;
    public float n8;
    public TextView o0;
    public UndoView o1;
    public boolean o2;
    public ema o3;
    public Runnable o4;
    public k3b o5;
    public AnimatorSet o6;
    public b8 o7;
    public int o8;
    public s7 p0;
    public jd8 p1;
    public xn5 p2;
    public ImageView p3;
    public fd8 p4;
    public ld8 p5;
    public AnimatorSet p6;
    public v86 p7;
    public volatile boolean p8;
    public s7 q0;
    public t20 q1;
    public boolean q2;
    public sfc q3;
    public fd8 q4;
    public ArrayList q5;
    public ru4 q6;
    public final pn q7;
    public volatile boolean q8;
    public boolean r;
    public b8 r0;
    public ImageReceiver r1;
    public dc7 r2;
    public tb r3;
    public boolean r4;
    public vl4 r5;
    public boolean r6;
    public e26 r7;
    public long r8;
    public boolean s;
    public w7 s0;
    public boolean s1;
    public boolean s2;
    public zb8 s3;
    public boolean s4;
    public sc8 s5;
    public final DecelerateInterpolator s6;
    public v21 s7;
    public long s8;
    public b8 t0;
    public final y98 t1;
    public final Rect t2;
    public AnimatorSet t3;
    public byte t4;
    public LinearLayout t5;
    public float t6;
    public int t7;
    public float t8;
    public b8 u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public final y98 u4;
    public sc8 u5;
    public float u6;
    public boolean u7;
    public float u8;
    public k8 v0;
    public long v1;
    public boolean v2;
    public int v3;
    public byte v4;
    public sc8 v5;
    public float v6;
    public CharSequence v7;
    public long v8;
    public int w;
    public b8 w0;
    public final GradientDrawable[] w1;
    public vnb w2;
    public ne8 w3;
    public String w4;
    public sc8 w5;
    public float w6;
    public boolean w7;
    public long w8;
    public AnimatorSet x;
    public eh2 x0;
    public final boolean[] x1;
    public final ib8 x2;
    public ImageView x3;
    public qx7 x4;
    public sc8 x5;
    public float x6;
    public ValueAnimator x7;
    public long x8;
    public final y98 y;
    public LinearLayout y0;
    public final float[] y1;
    public final ob8 y2;
    public final ImageView[] y3;
    public qx7 y4;
    public long y5;
    public float y6;
    public TLRPC.Document y7;
    public long y8;
    public final ArrayList z0;
    public int z1;
    public dc8 z2;
    public boolean z3;
    public qx7 z4;
    public boolean z5;
    public float z6;
    public TLRPC.Document z7;
    public long z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int g = 0;
        public final RectF a;
        public final RectF b;
        public final Paint c;
        public a58 d;
        public boolean e;

        public BackgroundDrawable() {
            super(-16777216);
            this.a = new RectF();
            this.b = new RectF();
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z;
            PhotoViewer photoViewer = PhotoViewer.this;
            e26 e26Var = photoViewer.r7;
            if (e26Var != null) {
                e26Var.b(!this.e);
            }
            e26 e26Var2 = photoViewer.c2;
            if (e26Var2 != null) {
                e26Var2.b(!this.e);
            }
            n12 n12Var = photoViewer.b2;
            if (n12Var != null) {
                boolean z2 = this.e;
                n12Var.v2.m(n12Var.i4);
                if (n12Var.r4 != z2) {
                    n12Var.r4 = z2;
                    f12 f12Var = n12Var.v2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var.d2;
                    if (f12Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.j1) {
                        if (z2 && !n12Var.s4) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (chatAttachAlertPhotoLayout.n && !chatAttachAlertPhotoLayout.P0) {
                            if (z) {
                                r52 r52Var = chatAttachAlertPhotoLayout.Q;
                                if (r52Var != null) {
                                    chatAttachAlertPhotoLayout.p0 = Boolean.valueOf(r52Var.isFrontface());
                                    chatAttachAlertPhotoLayout.e0(true);
                                    return;
                                }
                                return;
                            }
                            chatAttachAlertPhotoLayout.u0();
                        }
                    }
                }
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            a58 a58Var;
            fd8 fd8Var;
            Drawable[] drawableArr = PhotoViewer.d9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.m4 != 0 && !hl.O1() && (fd8Var = photoViewer.c5) != null && fd8Var.m != null) {
                ClippingImageView clippingImageView = photoViewer.i0;
                float translationX = clippingImageView.getTranslationX();
                RectF rectF = this.b;
                rectF.left = translationX;
                rectF.top = clippingImageView.getTranslationY();
                rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                rectF.left += clippingImageView.b;
                rectF.top += clippingImageView.d;
                rectF.right -= clippingImageView.c;
                rectF.bottom = scaleY - clippingImageView.a;
                if (!rectF.isEmpty()) {
                    rectF.inset(hl.L(1.0f), hl.L(1.0f));
                    Rect bounds = getBounds();
                    float f = bounds.right;
                    float f2 = bounds.bottom;
                    for (int i = 0; i < 4; i++) {
                        RectF rectF2 = this.a;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        rectF2.set(0.0f, rectF.bottom, f, f2);
                                    }
                                } else {
                                    rectF2.set(rectF.right, rectF.top, f, rectF.bottom);
                                }
                            } else {
                                rectF2.set(0.0f, 0.0f, f, rectF.top);
                            }
                        } else {
                            rectF2.set(0.0f, rectF.top, rectF.left, rectF.bottom);
                        }
                        canvas.drawRect(rectF2, this.c);
                    }
                }
            } else {
                super.draw(canvas);
            }
            if (getAlpha() != 0 && (a58Var = this.d) != null) {
                hl.c3(a58Var);
                this.d = null;
            }
        }

        @Override
        public void setAlpha(int i) {
            boolean z;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.E instanceof LaunchActivity) {
                if (photoViewer.e && i == 255) {
                    z = false;
                } else {
                    z = true;
                }
                this.e = z;
                if (z) {
                    a();
                } else {
                    hl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            int i2 = PhotoViewer.BackgroundDrawable.g;
                            PhotoViewer.BackgroundDrawable.this.a();
                        }
                    }, 70L);
                }
            }
            super.setAlpha(i);
            this.c.setAlpha(i);
        }
    }

    public static class CounterView extends View {
        public StaticLayout a;
        public final TextPaint b;
        public final Paint c;
        public int d;
        public int e;
        public final RectF f;
        public int h;
        public float n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.b = textPaint;
            textPaint.setTextSize(hl.L(15.0f));
            textPaint.setTypeface(hl.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(hl.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f = new RectF();
            a(0);
        }

        public final void a(int i) {
            String valueOf = String.valueOf(Math.max(1, i));
            int L = hl.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.b;
            StaticLayout staticLayout = new StaticLayout(valueOf, textPaint, L, alignment, 1.0f, 0.0f, false);
            this.a = staticLayout;
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.e = this.a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.c;
            Property property = View.SCALE_X;
            Property property2 = View.SCALE_Y;
            if (i == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property2, 0.0f);
                qn qnVar = sn.b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, qnVar, 0), ObjectAnimator.ofInt(textPaint, qnVar, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.h;
                if (i2 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    qn qnVar2 = sn.b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, qnVar2, 0, 255), ObjectAnimator.ofInt(textPaint, qnVar2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i < i2) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, property, 1.1f, 1.0f), ObjectAnimator.ofFloat(this, property2, 1.1f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, property, 0.9f, 1.0f), ObjectAnimator.ofFloat(this, property2, 0.9f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                }
            }
            animatorSet.setDuration(180L);
            animatorSet.start();
            requestLayout();
            this.h = i;
        }

        @Override
        public final float getRotationX() {
            return this.n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.c;
            paint.setAlpha(255);
            float L = hl.L(14.0f) + measuredHeight;
            RectF rectF = this.f;
            rectF.set(hl.L(1.0f), measuredHeight - hl.L(14.0f), getMeasuredWidth() - hl.L(1.0f), L);
            canvas.drawRoundRect(rectF, hl.L(15.0f), hl.L(15.0f), paint);
            if (this.a != null) {
                this.b.setAlpha((int) ((1.0f - this.n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.n * hl.L(5.0f)) + hl.N(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.n * 255.0f));
                int centerX = (int) rectF.centerX();
                int B = (int) qu6.B(1.0f, this.n, hl.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(hl.L(5.0f) + centerX, B - hl.L(5.0f), centerX - hl.L(5.0f), hl.L(5.0f) + B, paint);
                canvas.drawLine(centerX - hl.L(5.0f), B - hl.L(5.0f), hl.L(5.0f) + centerX, hl.L(5.0f) + B, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i = this.h;
            if (i > 0) {
                accessibilityNodeInfo.setContentDescription(ob6.G(i, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(20.0f) + this.d, hl.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f) {
            this.n = f;
            invalidate();
        }

        @Override
        public void setScaleX(float f) {
            super.setScaleX(f);
            invalidate();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            i9 = new va8();
        } else {
            i9 = new px1(Float.class, "progress", (byte) 2);
        }
        j9 = null;
        k9 = null;
    }

    public PhotoViewer() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 30) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.h = -1;
        this.n = true;
        this.y = new y98(this, (byte) 20);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.a0 = new r89(0, false);
        this.z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new lb8[3];
        this.t1 = new y98(this, (byte) 21);
        this.w1 = new GradientDrawable[2];
        this.x1 = new boolean[2];
        this.y1 = new float[2];
        this.E1 = new Object();
        this.F1 = new Object();
        this.G1 = new Object();
        this.X1 = -8.0f;
        this.t2 = new Rect();
        this.x2 = new ib8(this);
        this.y2 = new ob8(this, (byte) 0);
        this.l3 = true;
        this.m3 = new int[2];
        this.n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.a4 = new ob2(this, (byte) 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.b4 = videoFramesRewinder;
        this.c4 = new yb8(this, videoFramesRewinder);
        this.d4 = new w10(this);
        this.h4 = new ob8(this, (byte) 1);
        this.i4 = new ob8(this, (byte) 2);
        this.j4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.u4 = new y98(this, (byte) 22);
        this.A4 = new ImageReceiver(null);
        this.B4 = new nl(this, (byte) 6);
        this.C4 = new ImageReceiver(null);
        this.D4 = new fi0(1, new y98(this, (byte) 23));
        this.E4 = new fi0(1, new y98(this, (byte) 23));
        this.F4 = new fi0(1, new y98(this, (byte) 23));
        this.K4 = false;
        this.L4 = new Matrix();
        Paint paint2 = new Paint();
        this.M4 = paint2;
        this.N4 = null;
        this.W4 = new Object();
        this.b5 = new String[3];
        this.O5 = new boolean[]{false, true};
        this.Z5 = 1.0f;
        this.a6 = 0.0f;
        this.n6 = -1;
        this.s6 = new DecelerateInterpolator(1.5f);
        this.v6 = 1.0f;
        this.w6 = 0.0f;
        this.H6 = true;
        this.P6 = true;
        this.V6 = new ArrayList();
        this.W6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X6 = new ArrayList();
        this.Y6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Z6 = new ArrayList();
        this.a7 = new ArrayList();
        this.b7 = new ArrayList();
        this.c7 = new ArrayList();
        this.d7 = new ArrayList();
        this.e7 = new ArrayList();
        this.f7 = new ArrayList();
        this.g7 = null;
        this.h7 = null;
        this.j7 = new Rect();
        this.n7 = new y98(this, (byte) 24);
        this.q7 = new pn(new int[]{jn7.r, jn7.s, jn7.W, jn7.V, jn7.g3});
        this.D7 = new float[]{1.0f};
        this.E7 = new float[]{1.0f};
        this.K7 = new y98(this, (byte) 25);
        this.S7 = new int[2];
        this.a8 = -1L;
        this.b8 = -1L;
        this.c8 = -1L;
        this.e8 = -1;
        this.J8 = new mm(new y98(this, (byte) 23), 180L, k43.g);
        this.R8 = new Object();
        this.S8 = new zh6();
        this.Y8 = new RectF();
        this.b9 = new y98(this, (byte) 26);
        this.c9 = new hb8(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.B4.T(3);
    }

    public static boolean C0() {
        if (j9 != null) {
            return true;
        }
        return false;
    }

    public static Bitmap D(Bitmap bitmap, fo6 fo6Var, int[] iArr, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            int i6 = fo6Var.k;
            int i7 = 0;
            if (iArr != null) {
                i = iArr[0];
            } else {
                i = 0;
            }
            int i8 = (i6 + i) % 360;
            if (iArr != null && iArr.length > 1) {
                i7 = iArr[1];
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i8 != 90 && i8 != 270) {
                i3 = width;
                i2 = height;
            } else {
                i2 = width;
                i3 = height;
            }
            float f = i3;
            float f2 = i2;
            Bitmap createBitmap = Bitmap.createBitmap((int) (fo6Var.e * f), (int) (fo6Var.f * f2), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z && fo6Var.l) {
                if (i8 != 90 && i8 != 270) {
                    matrix.postScale(-1.0f, 1.0f);
                } else {
                    matrix.postScale(1.0f, -1.0f);
                }
            }
            if (i7 == 1) {
                matrix.postScale(-1.0f, 1.0f);
            } else if (i7 == 2) {
                matrix.postScale(1.0f, -1.0f);
            }
            matrix.postRotate(fo6Var.d + i8);
            matrix.postTranslate(fo6Var.a * f, fo6Var.b * f2);
            float f3 = fo6Var.c;
            matrix.postScale(f3, f3);
            matrix.postTranslate(i4 / 2, i5 / 2);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            return createBitmap;
        } catch (Throwable th) {
            cc4.g(th, true);
            return null;
        }
    }

    public static boolean N0(r47 r47Var) {
        if (j9 != null && !j9.B3 && j9.e && r47Var != null && j9.S4 != null && j9.S4.e1() == r47Var.e1() && r47.B0(j9.S4.k) == r47.B0(r47Var.k)) {
            return true;
        }
        return false;
    }

    public static boolean O0(r47 r47Var) {
        if (k9 != null && r47Var != null && k9.S4 != null && k9.S4.e1() == r47Var.e1() && r47.B0(k9.S4.k) == r47.B0(r47Var.k)) {
            return true;
        }
        return false;
    }

    public static boolean P0(r47 r47Var) {
        boolean z;
        if (j9 != null && !j9.B3 && j9.e && !j9.r4 && r47Var != null) {
            r47 r47Var2 = j9.S4;
            if (r47Var2 == null && j9.d != null) {
                r47Var2 = j9.d.V();
            }
            if (r47Var2 != null && r47Var2.e1() == r47Var.e1() && r47.B0(r47Var2.k) == r47.B0(r47Var.k)) {
                z = true;
                if (z && k9 != null) {
                    if (k9.e && !k9.r4 && r47Var != null && k9.S4 != null && k9.S4.e1() == r47Var.e1() && r47.B0(k9.S4.k) == r47.B0(r47Var.k)) {
                        return true;
                    }
                    return false;
                }
                return z;
            }
        }
        z = false;
        if (z) {
        }
        return z;
    }

    public static boolean Q0(String str) {
        if (j9 != null && j9.e && !j9.r4 && str != null && str.equals(j9.d5)) {
            return true;
        }
        return false;
    }

    public static boolean R0(TLRPC.BotInlineResult botInlineResult) {
        if (j9 != null && j9.e && !j9.r4 && botInlineResult != null && j9.X4 != null && botInlineResult.id == j9.X4.id) {
            return true;
        }
        return false;
    }

    public static boolean S0(TLRPC.FileLocation fileLocation) {
        if (j9 != null && j9.e && !j9.r4 && fileLocation != null) {
            if (j9.Y4 == null || fileLocation.local_id != j9.Y4.f.local_id || fileLocation.volume_id != j9.Y4.f.volume_id || fileLocation.dc_id != j9.Y4.a) {
                if (j9.Z4 != null && fileLocation.local_id == j9.Z4.f.local_id && fileLocation.volume_id == j9.Z4.f.volume_id && fileLocation.dc_id == j9.Z4.a) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int T(go6 go6Var) {
        if (go6Var.d()) {
            return hl.Y0(false);
        }
        return 512;
    }

    public static String W(int i, int i2) {
        int i3;
        int i4;
        if (i >= 100) {
            i3 = 99;
        } else {
            i3 = i;
        }
        char c = (char) ((i3 / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        char c2 = (char) ((i % 10) + 48);
        if (i2 >= 100) {
            i4 = 99;
        } else {
            i4 = i2;
        }
        char c3 = (char) ((i4 / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        return new String(new char[]{c, c2, ':', c3, (char) ((i2 % 10) + 48)});
    }

    public static String X(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i >= 100) {
            i4 = 99;
        } else {
            i4 = i;
        }
        char c = (char) ((i4 / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        char c2 = (char) ((i % 10) + 48);
        if (i2 >= 100) {
            i5 = 99;
        } else {
            i5 = i2;
        }
        char c3 = (char) ((i5 / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        char c4 = (char) ((i2 % 10) + 48);
        if (i3 >= 100) {
            i6 = 99;
        } else {
            i6 = i3;
        }
        char c5 = (char) ((i6 / 10) + 48);
        if (i3 >= 100) {
            i3 = 99;
        }
        return new String(new char[]{c, c2, ':', c3, c4, ':', c5, (char) ((i3 % 10) + 48)});
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 31 && xea.X && xea.o() >= 2 && !hl.m0) {
            return true;
        }
        return false;
    }

    public static boolean a2(r47 r47Var) {
        if (r47Var != null && r47.K4(r47Var.k)) {
            if (r47Var.z0 || r47Var.y0 || r47Var.D2(true) || (r47Var.B() && xea.x0)) {
                boolean z = xea.a;
                if (i86.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String n0(jn5 jn5Var) {
        if (jn5Var != null && jn5Var.p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer q0() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = j9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                photoViewer = j9;
                if (photoViewer == null) {
                    photoViewer = new PhotoViewer();
                    j9 = photoViewer;
                }
            }
            return photoViewer;
        }
        return photoViewer2;
    }

    public static CharSequence s1(r47 r47Var) {
        if (r47Var.k == null) {
            return "";
        }
        Spannable A5 = r47.A5(pv3.m(new SpannableStringBuilder(r47Var.k.translatedText.text), aob.o2.getFontMetricsInt(), false, null, 0), r47Var.k.translatedText.entities, aob.o2.getFontMetricsInt(), false);
        if (r47.M(A5)) {
            try {
                hl.c(A5, 5, false, true);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        r47.h(r47Var.O3(), A5, true, 0, 0, true);
        r47.b(A5, r47Var.k.translatedText.entities, r47Var.O3(), true, true, true, 0);
        if (r47.K4(r47Var.k)) {
            r47.h(r47Var.O3(), A5, true, 3, (int) r47Var.L0(), false);
        } else if (r47Var.I3() || r47.Q4(r47Var.k)) {
            r47.h(r47Var.O3(), A5, true, 4, (int) r47Var.L0(), false);
        }
        return A5;
    }

    public static String x0() {
        File z = xb4.z(4);
        return new File(z, xea.p() + "_temp.jpg").getAbsolutePath();
    }

    public final void A(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A(boolean, boolean):void");
    }

    public final int A0() {
        int measuredHeight;
        int f0 = f0();
        ad8 ad8Var = this.f0;
        if (ad8Var != null && (measuredHeight = ad8Var.getMeasuredHeight()) > 0) {
            return Math.min(f0, measuredHeight);
        }
        return f0;
    }

    public final void A1() {
        if (!J0()) {
            r47 r47Var = this.S4;
            if (r47Var == null || !r47Var.q4()) {
                ob8 ob8Var = this.y2;
                hl.r(ob8Var);
                hl.d3(ob8Var, 3000L);
            }
        }
    }

    public final void A2(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (z != this.L) {
            if (z) {
                this.p1.setVisibility(0);
            }
            this.L = z;
            this.p1.setEnabled(z);
            float f5 = 1.0f;
            if (z2) {
                ArrayList arrayList = new ArrayList();
                jd8 jd8Var = this.p1;
                Property property = View.ALPHA;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(jd8Var, property, f3));
                jd8 jd8Var2 = this.p1;
                Property property2 = View.TRANSLATION_Y;
                if (z) {
                    f4 = 0.0f;
                } else {
                    f4 = -hl.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(jd8Var2, property2, f4));
                CounterView counterView = this.P0;
                Property property3 = View.ROTATION_X;
                if (!z) {
                    f5 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f5));
                AnimatorSet animatorSet = new AnimatorSet();
                this.C1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z) {
                    this.C1.addListener(new wb8(this, (byte) 4));
                }
                this.C1.setDuration(200L);
                this.C1.start();
                return;
            }
            jd8 jd8Var3 = this.p1;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            jd8Var3.setAlpha(f);
            jd8 jd8Var4 = this.p1;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -hl.L(10.0f);
            }
            jd8Var4.setTranslationY(f2);
            CounterView counterView2 = this.P0;
            if (!z) {
                f5 = 0.0f;
            }
            counterView2.setRotationX(f5);
            if (!z) {
                this.p1.setVisibility(8);
            }
        }
    }

    public final void B() {
        boolean z = this.E2;
        me8 me8Var = this.U8;
        if (z) {
            me8Var.a(new bm0((byte) 21));
            hl.c3(new y98(this, (byte) 14));
            return;
        }
        me8Var.a(new ea8(this, (byte) 3));
    }

    public final boolean B0() {
        if (a0(true) != 0) {
            return true;
        }
        return false;
    }

    public final void B1(long j) {
        b29 y;
        xc8 xc8Var = this.W4;
        ArrayList arrayList = xc8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mec mecVar = (mec) xc8Var.e.get(i);
                if (mecVar.a == 0 && (mecVar.b & 1) != 0) {
                    View view = mecVar.I;
                    if ((view instanceof de0) && (y = ((de0) view).getImageReceiver().y()) != null) {
                        long j2 = this.r8;
                        long j3 = 0;
                        if (j2 > 0) {
                            j3 = j2 / 1000;
                        }
                        y.P(j - j3);
                    }
                }
            }
        }
    }

    public final void B2() {
        boolean z;
        kfc kfcVar;
        kfc kfcVar2;
        if (this.G2 == null) {
            nc8 nc8Var = this.g0;
            if (nc8Var != null && nc8Var.y) {
                z = nc8Var.H;
            } else {
                return;
            }
        } else {
            z = this.P3;
        }
        m();
        hl.r(this.y2);
        if (z) {
            p1();
        } else {
            if (this.s1) {
                if (Math.abs(this.X7.getProgress() - this.X7.getRightProgress()) < 0.01f || ((kfcVar2 = this.G2) != null && kfcVar2.S() == this.G2.U())) {
                    D1(this.X7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.q3.c() - this.X7.getRightProgress()) < 0.01f || ((kfcVar = this.G2) != null && kfcVar.S() == this.G2.U())) {
                    D1(0.0f);
                }
                A1();
            }
            r1();
        }
        this.f0.invalidate();
    }

    public final void C() {
        if (this.D1 != null) {
            return;
        }
        k88 k88Var = new k88(this.F, this.w2);
        this.D1 = k88Var;
        k88Var.setVisibility(8);
        this.D1.a();
        this.f0.addView(this.D1, this.f0.indexOfChild(this.W7) - 1, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new ua8(this));
    }

    public final void C1(long j) {
        nc8 nc8Var = this.g0;
        if (nc8Var != null && nc8Var.y) {
            nc8Var.i(j);
        } else {
            kfc kfcVar = this.G2;
            if (kfcVar != null) {
                kfcVar.o0(j);
            }
        }
        Q2();
    }

    public final void C2() {
        View view = this.T3;
        if (view != null) {
            lb8 lb8Var = this.X0[0];
            int i = lb8Var.h;
            if (lb8Var.p && (i == 3 || i == 4 || i == 2 || i == 1)) {
                if (i == 3) {
                    view.setContentDescription(ob6.M0(2131754925, "AccActionPlay"));
                } else if (i == 2) {
                    view.setContentDescription(ob6.M0(2131754934, "AccActionDownload"));
                } else if (i == 1) {
                    view.setContentDescription(ob6.M0(2131754937, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(ob6.M0(2131754926, "AccActionPause"));
                }
                this.T3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void D0() {
        if (this.X8) {
            this.X8 = false;
            ImageView imageView = this.x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.x3.setImageDrawable(null);
            }
            Bitmap bitmap = this.C3;
            if (bitmap != null) {
                bitmap.recycle();
                this.C3 = null;
            }
        }
    }

    public final void D1(float f) {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.o0(f * ((float) kfcVar.U()));
            return;
        }
        nc8 nc8Var = this.g0;
        if (nc8Var != null) {
            nc8Var.i(f * nc8Var.getVideoDuration());
        }
    }

    public final void D2() {
        if (this.B0 != null && this.N != null) {
            float f = 0.0f;
            for (int i = 0; i < this.B0.getChildCount(); i++) {
                View childAt = this.B0.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f;
                }
            }
            CheckBox checkBox = this.O0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f = Math.max(f, hl.L(48.0f));
            }
            CounterView counterView = this.P0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f = Math.max(f, hl.L(100.0f));
            }
            dd8 dd8Var = this.N;
            ValueAnimator valueAnimator = dd8Var.n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                dd8Var.n = null;
            }
            dd8Var.r = f;
            dd8Var.c[0].setRightPadding((int) f);
            dd8Var.d.setRightPadding(f);
        }
    }

    public final void E() {
        fo6 fo6Var;
        int width;
        int width2;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            fo6Var = new fo6();
            fo6Var.k = this.E1.i;
        } else {
            fo6Var = this.W4.c;
        }
        fo6 fo6Var2 = fo6Var;
        int q = this.B4.q();
        int o = this.B4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q, o, config);
        k3b k3bVar = this.o5;
        if (k3bVar != null && k3bVar.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.o5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.o5.K);
            float width3 = createBitmap.getWidth();
            if ((this.o5.K / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f = width3 / width2;
            RectF rectF = hl.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f, ((-sourceBitmap.getHeight()) / 2.0f) * f, (sourceBitmap.getWidth() / 2.0f) * f, (sourceBitmap.getHeight() / 2.0f) * f);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.B4.q(), this.B4.o(), config);
        if (this.B4.n() != null) {
            Bitmap n = this.B4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.B4.V);
            float width4 = createBitmap2.getWidth();
            if ((this.B4.V / 90) % 2 != 0) {
                width = n.getHeight();
            } else {
                width = n.getWidth();
            }
            float f2 = width4 / width;
            RectF rectF2 = hl.P;
            rectF2.set(((-n.getWidth()) / 2.0f) * f2, ((-n.getHeight()) / 2.0f) * f2, (n.getWidth() / 2.0f) * f2, (n.getHeight() / 2.0f) * f2);
            canvas2.drawBitmap(n, (Rect) null, rectF2, new Paint(3));
        }
        gc8 gc8Var = new gc8(this, this.E, this.U, createBitmap2, createBitmap, this.B4.V, fo6Var2);
        this.O1 = gc8Var;
        gc8Var.s.setOnClickListener(new z98(this, (byte) 5));
        this.O1.w.setOnClickListener(new z98(this, (byte) 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f0.indexOfChild(this.t5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f0.getChildCount();
        }
        this.f0.addView(this.O1, indexOfChild, tre.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void E0() {
        boolean[] zArr = this.x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f0.invalidate();
    }

    public final int E1() {
        int i;
        if (this.z8 > 1048576000) {
            return this.e8 - 1;
        }
        SharedPreferences e1 = uc7.e1();
        int i2 = this.e8;
        while (i2 < 5) {
            Locale locale = Locale.US;
            int i3 = e1.getInt("compress_video_" + i2, -1);
            if (i3 >= 0) {
                return Math.min(i3, 2);
            }
            i2++;
        }
        lq3 q = lq3.q(this.U);
        int e = org.telegram.messenger.a.e();
        if (e == 1) {
            i = q.p().h;
        } else if (e == 2) {
            i = q.o().h;
        } else {
            i = q.n().h;
        }
        return Math.min(2, Math.round(i / (100.0f / i2)) - 1);
    }

    public final void E2(Object obj) {
        CharSequence charSequence;
        boolean z;
        TLRPC.EncryptedChat encryptedChat;
        if (this.u7) {
            charSequence = this.v7;
        } else if (obj instanceof no6) {
            charSequence = ((no6) obj).a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof ro6)) {
            charSequence = ((ro6) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0().setText("");
        } else {
            c0().setText(hm.cloneSpans(charSequence, 3));
        }
        xt3 editText = c0().f.getEditText();
        zu1 zu1Var = this.k4;
        if (zu1Var != null && ((encryptedChat = zu1Var.h) == null || hl.W0(encryptedChat.layer) >= 101)) {
            z = true;
        } else {
            z = false;
        }
        editText.setAllowTextEntitiesIntersection(z);
    }

    public final void F() {
        int q;
        int o;
        fo6 fo6Var;
        Bitmap n;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                kec kecVar = (kec) textureView;
                q = kecVar.getVideoWidth();
                o = kecVar.getVideoHeight();
                while (true) {
                    if (q <= 1280 && o <= 1280) {
                        break;
                    }
                    q /= 2;
                    o /= 2;
                }
            } else {
                q = this.B4.q();
                o = this.B4.o();
            }
            Bitmap bitmap = this.x4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q, o, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i = this.d2;
            xc8 xc8Var = this.W4;
            boolean z = true;
            if (i == 1) {
                fo6Var = new fo6();
                fo6Var.k = this.E1.i;
            } else {
                fo6Var = xc8Var.c;
            }
            fo6 fo6Var2 = fo6Var;
            rx5 rx5Var = new rx5(this.h0, false, new ea8(this, (byte) 2));
            rx5Var.f = true;
            rx5Var.g = true;
            this.L1 = rx5Var;
            if (this.t4 == 3) {
                z = false;
            }
            rx5Var.b(z);
            Activity activity = this.E;
            int i2 = this.U;
            if (this.s1) {
                n = null;
            } else {
                n = this.B4.n();
            }
            hc8 hc8Var = new hc8(this, activity, activity, i2, bitmap2, n, this.B4.V, xc8Var.e, fo6Var2, new y98(this, (byte) 11), this.w2);
            this.M1 = hc8Var;
            jl0 c = this.Z.c(hc8Var.M0, null, false);
            c.p(dtd.i(this.w2));
            hc8Var.setBlurredBackgroundDrawableForTools(c);
            this.f0.addView(this.M1.getView(), tre.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new y98(this, (byte) 12));
            this.M1.getCancelView().setOnClickListener(new z98(this, (byte) 9));
            this.M1.v0(hl.L(126.0f));
            this.M1.setOffsetTranslationX(-hl.L(12.0f));
        }
    }

    public final void F0() {
        k88 k88Var = this.D1;
        if (k88Var != null) {
            k88Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.b.a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            b43 b43Var = this.D1.b;
            b43Var.q();
            CropAreaView cropAreaView2 = b43Var.a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.u2 = true;
        }
    }

    public final void F1(final boolean z, final int i, final int i2, final boolean z2, final boolean z3, boolean z4) {
        byte b;
        float f;
        boolean z5;
        oec oecVar;
        String str;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        fo6 fo6Var;
        fo6 fo6Var2;
        TLRPC.Chat chat;
        int i3;
        zu1 zu1Var;
        xn5 xn5Var;
        String str2;
        long j;
        String M0;
        TextureView textureView;
        if (!K0() && this.d != null && !this.v2) {
            if (this.d2 == 1) {
                if (!z4 && (xn5Var = this.p2) != null) {
                    TLObject tLObject = xn5Var.a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j2 = user.id;
                        str2 = str3;
                        j = j2;
                    } else {
                        str2 = "";
                        j = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f0.getContext());
                    int L = hl.L(8.0f);
                    id idVar = alertDialog$Builder.a;
                    idVar.W0 = L;
                    Context context = this.f0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.b = imageReceiver2;
                    rb0 rb0Var = new rb0((vnb) null);
                    view.e = new Path();
                    rb0Var.q(yac.h(yac.t0).f());
                    imageReceiver.U(yac.h(yac.t0).f(), rb0Var, null);
                    imageReceiver2.U(yac.h(yac.t0).f(), rb0Var, null);
                    Drawable drawable = context.getDrawable(2131232061);
                    view.f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.p2.a;
                    ad8 ad8Var = this.f0;
                    k88 k88Var = this.D1;
                    rb0Var.k(tLObject2);
                    imageReceiver.U(tLObject2, rb0Var, null);
                    view.c = ad8Var;
                    view.d = k88Var;
                    idVar.W = view;
                    if (this.p2.c == 1) {
                        if (yac.h(this.U).n == j) {
                            idVar.U = hl.S2(ob6.M0(2131745227, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            idVar.U = hl.S2(ob6.a0(null, null, 2131745228, str2, str2));
                        }
                        if (this.H4) {
                            M0 = ob6.M0(2131745225, "SetVideo");
                        } else {
                            M0 = ob6.M0(2131745247, "SetPhoto");
                        }
                    } else {
                        if (this.H4) {
                            idVar.U = hl.S2(ob6.a0(null, null, 2131744049, str2));
                        } else {
                            idVar.U = hl.S2(ob6.a0(null, null, 2131744060, str2));
                        }
                        M0 = ob6.M0(2131744058, "SuggestPhotoShort");
                    }
                    String str4 = M0;
                    alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), new ku7((byte) 19));
                    alertDialog$Builder.j(str4, new fd() {
                        @Override
                        public final void w(id idVar2, int i4) {
                            Drawable[] drawableArr = PhotoViewer.d9;
                            PhotoViewer.this.F1(z, i, i2, z2, z3, true);
                        }
                    });
                    idVar.J = aob.gh;
                    idVar.U0 = true;
                    idVar.j(vm2.o(-15461356, 204));
                    idVar.show();
                    idVar.o(aob.w0(null, aob.eh, false));
                    idVar.setOnDismissListener(new rf3(this, (byte) 1));
                    if (this.s1 && (textureView = this.C2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.z2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.C2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.z2.addView(this.E3);
                            return;
                        } catch (Throwable th) {
                            Bitmap bitmap = this.C3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.C3 = null;
                            }
                            cc4.g(th, true);
                            return;
                        }
                    }
                    return;
                }
                e();
            }
            if (!z2 && (zu1Var = this.k4) != null) {
                TLRPC.Chat chat2 = zu1Var.e;
                if (zu1Var.h() != null || ((xc2.T(chat2) && chat2.megagroup) || !xc2.T(chat2))) {
                    uc7.s1(this.U).X3.edit().putBoolean("silent_" + this.k4.a(), !z).commit();
                }
            }
            oec k0 = k0();
            ArrayList arrayList = this.f7;
            if (!arrayList.isEmpty() && (i3 = this.O4) >= 0 && i3 < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof go6) {
                    ((go6) obj).s = k0;
                }
            }
            zu1 zu1Var2 = this.k4;
            if (zu1Var2 != null && (chat = zu1Var2.e) != null && this.d2 != 11) {
                if (!this.s1 && k0 == null) {
                    if (!xc2.p(chat)) {
                        xnb.x(null, 2131749313, new d31(this.f0, this.w2), null);
                        return;
                    }
                } else if (!xc2.u(chat)) {
                    xnb.x(null, 2131749309, new d31(this.f0, this.w2), null);
                    return;
                }
            }
            this.v2 = true;
            if (k0 != null) {
                long j3 = ((float) k0.q) * 0.9f;
                if ((j3 > 2097152000 && !yac.h(this.U).p()) || j3 > 4194304000L) {
                    if (this.b2 != null) {
                        n12 n12Var = this.b2;
                        new l46(6, yac.t0, null, n12Var.c.getContext(), n12Var.Z1).show();
                        return;
                    }
                    return;
                }
            }
            if (!z2) {
                if (this.d2 == 11) {
                    Object obj2 = arrayList.get(this.O4);
                    if (obj2 instanceof no6) {
                        no6 no6Var = (no6) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int h0 = h0(this.t4);
                        f0();
                        float L2 = h0 - hl.L(20.0f);
                        k3b k3bVar = this.o5;
                        if (k3bVar != null && k3bVar.j0 && k3bVar.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            g(canvas);
                            this.o5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            g(canvas);
                            this.B4.h(canvas, null);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            g(canvas);
                            this.o5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            g(canvas);
                            this.B4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.x4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            g(canvas);
                            ImageReceiver imageReceiver3 = this.B4;
                            canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                            f = 2.0f;
                            canvas.scale(this.B4.N0 / this.x4.getMeasuredWidth(), this.B4.O0 / this.x4.getMeasuredHeight());
                            this.x4.e = !B0();
                            this.x4.draw(canvas);
                            this.x4.e = true;
                            canvas.restore();
                        } else {
                            f = 2.0f;
                        }
                        if (B0()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f10 = L2 / f;
                            matrix.preTranslate(f10, f10);
                            if (this.o6 != null) {
                                f6 = hl.R1(0.0f, this.f6, this.k6);
                                c = 5;
                                f2 = hl.R1(this.Z5, this.d6, this.k6);
                                f3 = hl.R1(this.a6, this.e6, this.k6);
                                f4 = hl.R1(this.X5, this.c6, this.k6);
                                f5 = hl.R1(this.W5, this.b6, this.k6);
                            } else {
                                c = 5;
                                f2 = this.Z5;
                                f3 = this.a6;
                                f4 = this.X5;
                                f5 = this.W5;
                                if (this.m6 != 0) {
                                    f5 = this.b6;
                                    f4 = this.c6;
                                    f2 = this.d6;
                                }
                                f6 = 0.0f;
                            }
                            int h02 = h0(this.t4);
                            int f0 = f0();
                            matrix.preTranslate(f5, f4 + 0.0f);
                            matrix.preScale(f2, f2);
                            matrix.preRotate(f3);
                            int q = this.B4.q();
                            int o = this.B4.o();
                            float f11 = h02;
                            float f12 = f0;
                            float min = Math.min(f11 / q, f12 / o);
                            u33 u33Var = this.E1;
                            int i4 = u33Var.i;
                            if (i4 == 90 || i4 == 270) {
                                o = q;
                                q = o;
                            }
                            float f13 = u33Var.j;
                            float f14 = u33Var.k;
                            float f15 = q;
                            float f16 = o;
                            float f17 = f11 / ((int) ((((1.0f - f13) * 0.0f) + f13) * f15));
                            float f18 = (int) ((((1.0f - f14) * 0.0f) + f14) * f16);
                            if (f17 * f18 > f12) {
                                f17 = f12 / f18;
                            }
                            int i5 = this.d2;
                            xc8 xc8Var = this.W4;
                            if (i5 == 1 || u33Var.a) {
                                TextureView textureView2 = this.C2;
                                if (textureView2 != null) {
                                    fo6 fo6Var3 = xc8Var.c;
                                    if (fo6Var3 != null && fo6Var3.l) {
                                        f8 = -1.0f;
                                    } else {
                                        f8 = 1.0f;
                                    }
                                    textureView2.setScaleX(f8);
                                    zc8 zc8Var = this.F2;
                                    if (zc8Var != null) {
                                        zc8Var.setScaleX(this.C2.getScaleX());
                                    }
                                }
                                fo6 fo6Var4 = xc8Var.c;
                                if (fo6Var4 != null) {
                                    f7 = fo6Var4.c;
                                } else {
                                    f7 = 1.0f;
                                }
                                float A = ((f17 / min) / qd4.A(f7, 1.0f, 0.0f, 1.0f)) * f7;
                                matrix.preTranslate(u33Var.d * 1.0f, u33Var.e * 1.0f);
                                matrix.preScale(A, A);
                                matrix.preTranslate(xnb.C(u33Var.b, f15, min, 1.0f), xnb.C(u33Var.c, f16, min, 1.0f));
                                float f19 = u33Var.g + i4;
                                if (f19 > 180.0f) {
                                    f19 -= 360.0f;
                                }
                                matrix.preRotate(f19);
                            }
                            if (!arrayList.isEmpty() && (fo6Var2 = xc8Var.c) != null && fo6Var2.l) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f6 > 0.0f) {
                                matrix.preScale(1.0f - (f6 * f), 1.0f);
                                matrix.preSkew(0.0f, qd4.z(1.0f, f6, 4.0f * f6, 0.25f));
                            }
                            ImageReceiver imageReceiver4 = this.B4;
                            matrix.preTranslate((-imageReceiver4.N0) / f, (-imageReceiver4.O0) / f);
                            ImageReceiver imageReceiver5 = this.B4;
                            matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = no6Var.p;
                            int size = arrayList3.size();
                            int i6 = 0;
                            String str5 = null;
                            while (i6 < size) {
                                Object obj3 = arrayList3.get(i6);
                                i6++;
                                mec a = ((mec) obj3).a();
                                float f20 = a.c;
                                float f21 = a.d;
                                float f22 = a.f + f20;
                                float f23 = a.g + f21;
                                float[] fArr = new float[8];
                                fArr[0] = f20;
                                fArr[1] = f21;
                                fArr[2] = f22;
                                fArr[3] = f21;
                                fArr[4] = f22;
                                fArr[c] = f23;
                                fArr[6] = f20;
                                fArr[7] = f23;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                ArrayList arrayList4 = arrayList3;
                                int i7 = size;
                                a.f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / L2;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / L2;
                                a.g = sqrt;
                                a.c = (((fArr[0] + fArr[4]) / f) / L2) - (a.f / f);
                                a.d = (((fArr[1] + fArr[c]) / f) / L2) - (sqrt / f);
                                a.v = 1.0f;
                                a.A = true;
                                if (no6Var.w && (fo6Var = no6Var.A) != null) {
                                    a.e = (float) (a.e - ((fo6Var.k / 180.0f) * 3.141592653589793d));
                                }
                                a.e = (float) (a.e - ((this.a6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a);
                                TLRPC.Document document = a.B;
                                if (document != null && str5 == null) {
                                    str5 = r47.V(document, null, null);
                                }
                                arrayList3 = arrayList4;
                                matrix = matrix2;
                                size = i7;
                            }
                            oec oecVar2 = new oec();
                            oecVar2.I = true;
                            oecVar2.k = 512;
                            oecVar2.h = 512;
                            oecVar2.l = 512;
                            oecVar2.i = 512;
                            oecVar2.G = arrayList2;
                            long k = Utilities.k(no6Var.t, 2999L, 800L);
                            oecVar2.r = k;
                            oecVar2.v = k;
                            oecVar2.m = 200000;
                            oecVar2.n = 30;
                            z5 = true;
                            oecVar2.N = true;
                            oecVar2.q = 262144L;
                            oecVar = oecVar2;
                            str = str5;
                        } else {
                            z5 = true;
                            oecVar = null;
                            str = null;
                        }
                        TLRPC.PhotoSize V = in5.V(createBitmap, Bitmap.CompressFormat.WEBP, 512.0f, 512.0f, 100);
                        xb4.G(yac.t0);
                        String file = xb4.J(V, "webp", z5, z5).toString();
                        if (oecVar != null) {
                            oecVar.o = file;
                        }
                        ArrayList arrayList5 = this.q5;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            this.q5 = arrayList5;
                        }
                        if (arrayList5.isEmpty()) {
                            String str6 = this.o5.d0;
                            if (str6 != null && pv3.g(str6) != null) {
                                this.q5.add(this.o5.d0);
                            } else {
                                ArrayList arrayList6 = this.q5;
                                if (str != null) {
                                    arrayList6.add(str);
                                } else {
                                    arrayList6.add("👍");
                                }
                            }
                        }
                        this.v2 = false;
                        rw2 e = rw2.e();
                        k3b k3bVar2 = this.o5;
                        ArrayList arrayList7 = this.q5;
                        sb8 sb8Var = new sb8(this, file, oecVar, no6Var, z, i, i2, z3);
                        nw2 nw2Var = e.U;
                        Activity W = hl.W(k3bVar2.getContext());
                        if (W != null) {
                            e.l(W);
                            e.k(sb8Var);
                            ?? obj4 = new Object();
                            obj4.a = file;
                            obj4.g = oecVar;
                            e.o = arrayList7;
                            e.i(null, obj4, null, null, null, 3, false, null, new x53(), 0);
                            hl.r(nw2Var);
                            hl.d3(nw2Var, 16L);
                            return;
                        }
                        return;
                    }
                }
                b = 5;
                this.d.L(this.O4, k0, z, i, i2, z3);
            } else {
                b = 5;
                this.d.c(k0);
            }
            if (this.P) {
                if (this.Q) {
                    hl.d3(new na8(this, b), 200L);
                } else {
                    A(false, false);
                }
            }
        }
    }

    public final void F2() {
        int i;
        r47 r47Var;
        TLRPC.Message message;
        ArrayList arrayList = this.X6;
        if (!arrayList.isEmpty() && (i = this.P4) >= 0 && i < arrayList.size() && (r47Var = (r47) arrayList.get(this.P4)) != null) {
            if (this.m5 && (message = r47Var.k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, r3c.H0())) {
                J1(r47Var, s1(r47Var), false, true);
            } else {
                J1(r47Var, r47Var.z, this.m5, true);
            }
        }
    }

    public final void G() {
        kd8 kd8Var = new kd8(this.f0.getContext(), this);
        this.i3 = kd8Var;
        this.f0.addView(kd8Var, tre.e(-1, 48, 83));
        kj4 kj4Var = new kj4(this, (byte) 27);
        xb8 xb8Var = new xb8(this, kj4Var);
        tb tbVar = new tb((byte) 26, this.f0.getContext(), this);
        this.r3 = tbVar;
        tbVar.setAccessibilityDelegate(xb8Var);
        this.r3.setImportantForAccessibility(1);
        this.i3.addView(this.r3, tre.c(-1.0f, -1));
        sfc sfcVar = new sfc(this.r3);
        this.q3 = sfcVar;
        sfcVar.z = hl.L(2.0f);
        sfc sfcVar2 = this.q3;
        sfcVar2.k = 872415231;
        sfcVar2.l = 872415231;
        sfcVar2.m = -1;
        sfcVar2.n = -1;
        sfcVar2.A = 1509949439;
        sfcVar2.j = kj4Var;
        zb8 zb8Var = new zb8(this, this.f0.getContext(), new fa8(this));
        this.s3 = zb8Var;
        zb8Var.setAlpha(0.0f);
        this.f0.addView(this.s3, tre.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        ema emaVar = new ema(this.f0.getContext());
        this.o3 = emaVar;
        emaVar.setTextColor(-1);
        this.o3.setGravity(53);
        this.o3.setTextSize(14);
        this.o3.setImportantForAccessibility(2);
        this.i3.addView(this.o3, tre.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f0.getContext());
        this.p3 = imageView;
        imageView.setImageResource(2131232257);
        this.p3.setContentDescription(ob6.M0(2131754719, "AccExitFullscreen"));
        this.p3.setScaleType(ImageView.ScaleType.CENTER);
        this.p3.setBackground(aob.f0(1090519039, 1, -1));
        this.p3.setVisibility(4);
        this.i3.addView(this.p3, tre.e(48, 48, 53));
        this.p3.setOnClickListener(new ma8(this, (byte) 6));
    }

    public final void G0(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G0(int):void");
    }

    public final void G1(xn5 xn5Var) {
        String str;
        int i;
        TLRPC.User user;
        this.p2 = xn5Var;
        if (this.d2 == 1) {
            if (T2()) {
                this.o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.o0.setVisibility(8);
            }
            if (xn5Var != null && (user = xn5Var.b) != null && xn5Var.c == 1 && this.p2.d) {
                boolean z = xn5Var.e;
                k88 k88Var = this.D1;
                String str2 = user.first_name;
                if (z) {
                    k88Var.setSubtitle(ob6.a0(null, null, 2131745240, str2));
                } else {
                    k88Var.setSubtitle(ob6.a0(null, null, 2131745241, str2));
                }
            } else {
                this.D1.setSubtitle(null);
            }
        }
        if (xn5Var != null) {
            if (xn5Var.c == 2) {
                if (xn5Var.e) {
                    str = "SuggestVideo";
                    i = 2131744050;
                } else {
                    str = "SuggestPhoto";
                    i = 2131744061;
                }
                X1(ob6.M0(i, str));
            }
            if (xn5Var.e) {
                this.Y7.setText(ob6.M0(2131745263, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void G2() {
        int i = aob.qg;
        int y0 = y0(i);
        di3 di3Var = this.T0;
        if (di3Var != null) {
            di3Var.k();
            this.T0.invalidate();
        }
        CheckBox checkBox = this.O0;
        if (checkBox != null) {
            checkBox.c(y0(i), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(y0, mode);
        ImageView imageView = this.Z0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.a1;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.a1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.d1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.d1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.c1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.b1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.b1.setColorFilter(porterDuffColorFilter);
        }
        pa2 pa2Var = this.V0;
        if (pa2Var != null) {
            ((TextView) pa2Var.b).setTextColor(y0);
        }
        pa2 pa2Var2 = this.U7;
        if (pa2Var2 != null) {
            ((TextView) pa2Var2.b).setTextColor(y0);
        }
        hc8 hc8Var = this.M1;
        if (hc8Var != null) {
            hc8Var.updateColors();
        }
        c98 c98Var = this.J1;
        if (c98Var != null) {
            ImageView imageView6 = c98Var.C0;
            ImageView imageView7 = c98Var.B0;
            ImageView imageView8 = c98Var.A0;
            vnb vnbVar = c98Var.J0;
            TextView textView = c98Var.h0;
            if (textView != null) {
                textView.setTextColor(aob.v0(i, vnbVar));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), mode));
            }
            c98Var.f();
        }
        pb8 pb8Var = this.V1;
        if (pb8Var != null) {
            pb8Var.H(this.w2);
        }
        qb8 qb8Var = this.W1;
        if (qb8Var != null) {
            qb8Var.H(this.w2);
        }
        mb8 mb8Var = this.X7;
        if (mb8Var != null) {
            mb8Var.invalidate();
        }
        jd8 jd8Var = this.p1;
        if (jd8Var != null) {
            int childCount = jd8Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.p1.getChildAt(i2);
                if (childAt instanceof p98) {
                    ((p98) childAt).c.b(aob.W9, aob.X9, aob.V9);
                }
            }
        }
        fb8 fb8Var = this.U3;
        if (fb8Var != null) {
            fb8Var.S0(true);
        }
    }

    @Override
    public final void H() {
        E0();
    }

    public final void H0() {
        k3b k3bVar = this.o5;
        if (k3bVar == null || !k3bVar.W) {
            r89 r89Var = this.a0;
            if (r89Var != null) {
                Iterator it = r89Var.iterator();
                while (it.hasNext()) {
                    hl0 hl0Var = ((jl0) it.next()).h0;
                    if (hl0Var != null) {
                        hl0Var.h = true;
                    }
                }
            }
            r89 r89Var2 = this.b0;
            if (r89Var2 != null) {
                Iterator it2 = r89Var2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            pb8 pb8Var = this.V1;
            if (pb8Var != null) {
                pb8Var.m();
            }
            qb8 qb8Var = this.W1;
            if (qb8Var != null) {
                qb8Var.m();
            }
            sc8 sc8Var = this.s5;
            if (sc8Var != null) {
                sc8Var.invalidate();
            }
            sc8 sc8Var2 = this.u5;
            if (sc8Var2 != null) {
                sc8Var2.invalidate();
            }
            sc8 sc8Var3 = this.v5;
            if (sc8Var3 != null) {
                sc8Var3.invalidate();
            }
            sc8 sc8Var4 = this.w5;
            if (sc8Var4 != null) {
                sc8Var4.invalidate();
            }
            sc8 sc8Var5 = this.x5;
            if (sc8Var5 != null) {
                sc8Var5.invalidate();
            }
            mb8 mb8Var = this.X7;
            if (mb8Var != null && mb8Var.f0) {
                mb8Var.invalidate();
            }
            ad8 ad8Var = this.f0;
            if (ad8Var != null) {
                ad8Var.invalidate();
            }
        }
    }

    public final void H1(boolean z) {
        if (this.o2 != z) {
            this.o2 = z;
            this.R1.setLayerType(2, null);
            this.R1.getCurrentView().setLayerType(2, null);
            this.R1.getNextView().setLayerType(2, null);
        }
    }

    public final void H2(boolean z) {
        ad8 ad8Var;
        int i;
        if (this.d2 != 1 && (ad8Var = this.f0) != null) {
            if (!z) {
                if (ad8Var.getPaddingLeft() <= 0 && this.f0.getPaddingRight() <= 0) {
                    i = 1796;
                } else {
                    i = 5894;
                }
            } else {
                i = 1792;
            }
            this.f0.setSystemUiVisibility(i);
        }
    }

    public final void I(po6 po6Var) {
        yl0 yl0Var;
        if (this.C2 == null) {
            dc8 dc8Var = new dc8((byte) 0, this.E, this);
            this.z2 = dc8Var;
            dc8Var.setWillNotDraw(false);
            this.z2.setVisibility(4);
            this.f0.addView(this.z2, 0, tre.e(-1, -1, 17));
            this.E2 = false;
            if (this.f7.isEmpty()) {
                if (this.b && this.T2 == null) {
                    this.D2 = new SurfaceView(this.E);
                    this.E2 = true;
                } else {
                    this.C2 = new TextureView(this.E);
                }
            } else {
                kec kecVar = new kec(this.G2, this.E);
                this.c0.e();
                tl0 tl0Var = this.c0;
                kecVar.s = tl0Var;
                rf4 rf4Var = kecVar.b;
                if (rf4Var != null && (yl0Var = rf4Var.J) != null) {
                    tl0 tl0Var2 = yl0Var.t;
                    if (tl0Var2 != null && tl0Var2.m != null) {
                        tl0Var2.m = null;
                    }
                    yl0Var.t = tl0Var;
                    if (tl0Var != null && tl0Var.m != yl0Var) {
                        tl0Var.m = yl0Var;
                        tl0Var.d();
                    }
                }
                if (po6Var != null) {
                    kecVar.setDelegate(new ja8(po6Var, (byte) 0));
                }
                this.C2 = kecVar;
            }
            SurfaceTexture surfaceTexture = this.T2;
            if (surfaceTexture != null) {
                this.C2.setSurfaceTexture(surfaceTexture);
                this.H3 = true;
                this.I3 = true;
                this.T2 = null;
            }
            TextureView textureView = this.C2;
            if (textureView != null) {
                textureView.setPivotX(0.0f);
                this.C2.setPivotY(0.0f);
                this.C2.setOpaque(false);
                this.z2.addView(this.C2, tre.e(-1, -1, 17));
            } else {
                this.z2.addView(this.D2, tre.e(-1, -1, 17));
            }
            zc8 zc8Var = new zc8(this.E, this);
            this.F2 = zc8Var;
            zc8Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.z2.addView(this.F2, tre.e(-1, -1, 17));
            if (this.d2 == 1) {
                View view = new View(this.E);
                this.A2 = view;
                view.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.z2.addView(this.A2, tre.e(-1, -1, 17));
            }
        }
    }

    public final void I0() {
        me8 me8Var = this.U8;
        if (me8Var != null) {
            me8Var.e();
        }
    }

    public final void I1() {
        kec kecVar;
        kec kecVar2;
        if (!this.h2 && this.d2 == 1) {
            if (!this.s1 || ((kecVar2 = (kec) this.C2) != null && kecVar2.getVideoWidth() > 0 && kecVar2.getVideoHeight() > 0)) {
                this.h2 = true;
                Bitmap n = this.B4.n();
                int i = this.B4.V;
                if (n == null) {
                    n = this.i0.getBitmap();
                    i = this.i0.getOrientation();
                }
                Bitmap bitmap = n;
                int i2 = i;
                if (bitmap != null || this.C2 != null) {
                    k88 k88Var = this.D1;
                    if (this.s1) {
                        kecVar = (kec) this.C2;
                    } else {
                        kecVar = null;
                    }
                    k88Var.b(bitmap, i2, false, false, this.E1, kecVar, this.W4.c);
                }
            }
        }
    }

    public final void I2(float f) {
        int h0;
        int f0;
        boolean z;
        View view;
        dc8 dc8Var = this.z2;
        if (dc8Var != null && dc8Var.getVisibility() == 0 && this.H3) {
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            f *= Math.min(h0(this.t4) / view.getMeasuredWidth(), A0() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.B4;
        float f2 = imageReceiver.N0;
        float f3 = imageReceiver.O0;
        fo6 fo6Var = this.W4.c;
        if (fo6Var != null) {
            f2 *= fo6Var.e;
            f3 *= fo6Var.f;
        }
        if (this.d2 == 11) {
            h0 = (int) (f2 * f);
        } else {
            h0 = ((int) ((f2 * f) - h0(this.t4))) / 2;
        }
        if (this.d2 == 11) {
            f0 = (int) (f3 * f);
        } else {
            f0 = ((int) ((f3 * f) - f0())) / 2;
        }
        float f4 = 0.0f;
        if (h0 > 0) {
            this.D6 = -h0;
            this.E6 = h0;
        } else {
            this.E6 = 0.0f;
            this.D6 = 0.0f;
        }
        if (f0 > 0) {
            this.F6 = -f0;
            this.G6 = f0;
        } else {
            this.G6 = 0.0f;
            this.F6 = 0.0f;
        }
        hc8 hc8Var = this.M1;
        if (hc8Var != null) {
            if (f <= 1.1f) {
                z = true;
            } else {
                z = false;
            }
            LinearLayout linearLayout = hc8Var.h1;
            boolean z2 = !z;
            if (hc8Var.M1 != z2) {
                hc8Var.M1 = z2;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z) {
                    f4 = 1.0f;
                }
                ik8.t(animate.alpha(f4), k43.h, 240L);
            }
        }
    }

    public final boolean J() {
        boolean z = false;
        if (this.o6 != null || this.D1 == null) {
            return false;
        }
        this.f6 = 1.0f;
        this.m6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
        this.o6.setDuration(250L);
        this.o6.setInterpolator(k43.f);
        this.o6.addListener(new wb8(this, (byte) 0));
        this.o6.start();
        z33 z33Var = this.D1.b.M;
        if (z33Var != null) {
            z = z33Var.j;
        }
        return !z;
    }

    public final boolean J0() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.F.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    public final void J1(r47 r47Var, CharSequence charSequence, boolean z, boolean z2) {
        TextView currentView;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = hm.cloneSpans(charSequence, 3);
        f2(this.Q4, z2);
        if (!this.Q4) {
            boolean z8 = true;
            if (this.d2 != 1) {
                this.V1.setVisibility(8);
                this.W1.setVisibility(8);
                if (this.j2) {
                    if (this.R1.getParent() != this.Q0) {
                        FrameLayout frameLayout = this.a2;
                        if (frameLayout != null) {
                            frameLayout.removeView(this.R1);
                        }
                        this.R1.setMeasureAllChildren(false);
                        this.Q0.addView(this.R1, tre.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                    }
                } else {
                    if (this.U1 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f0.getContext());
                        this.a2 = frameLayout2;
                        this.R1.setContainer(frameLayout2);
                        ic8 ic8Var = new ic8(this, this.f0.getContext(), this.R1, this.a2, (byte) 0);
                        this.U1 = ic8Var;
                        this.R1.setScrollView(ic8Var);
                        this.a2.setClipChildren(false);
                        this.U1.addView(this.a2, new ViewGroup.LayoutParams(-1, -2));
                        this.f0.addView(this.U1, tre.e(-1, -1, 80));
                    }
                    if (this.R1.getParent() != this.a2) {
                        this.Q0.removeView(this.R1);
                        this.R1.setMeasureAllChildren(true);
                        this.a2.addView(this.R1, -1, -2);
                        this.s3.bringToFront();
                    }
                    if (r47Var != null && r47Var.q4()) {
                        if (this.S1 == null) {
                            FrameLayout frameLayout3 = new FrameLayout(this.F);
                            this.S1 = frameLayout3;
                            frameLayout3.setBackground(aob.Z(620756991, 369098751, 8, 8));
                            iye.b(this.S1, 0.05f, 1.25f);
                            TextView textView = new TextView(this.F);
                            this.T1 = textView;
                            textView.setTextSize(1, 14.0f);
                            this.T1.setTextColor(-1);
                            this.T1.setTypeface(hl.o());
                            this.S1.addView(this.T1, tre.e(-2, -2, 17));
                            this.S1.setOnClickListener(new z98(this, (byte) 4));
                        }
                        hl.B2(this.S1);
                        this.T1.setText(r47Var.Y0);
                        this.a2.addView(this.S1, tre.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                        this.R1.setPadding(0, 0, 0, hl.L(64.0f));
                        this.S1.bringToFront();
                    } else {
                        FrameLayout frameLayout4 = this.S1;
                        if (frameLayout4 != null) {
                            hl.B2(frameLayout4);
                            this.R1.setPadding(0, 0, 0, 0);
                        }
                    }
                }
                boolean isEmpty = TextUtils.isEmpty(cloneSpans);
                boolean isEmpty2 = TextUtils.isEmpty(this.R1.getCurrentView().getText());
                wc8 wc8Var = this.R1;
                if (z2) {
                    currentView = wc8Var.getNextView();
                } else {
                    currentView = wc8Var.getCurrentView();
                }
                if (this.s1) {
                    if (currentView.getMaxLines() != 1) {
                        this.R1.getCurrentView().setMaxLines(1);
                        this.R1.getNextView().setMaxLines(1);
                        this.R1.getCurrentView().setSingleLine(true);
                        this.R1.getNextView().setSingleLine(true);
                        TextView currentView2 = this.R1.getCurrentView();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        currentView2.setEllipsize(truncateAt);
                        this.R1.getNextView().setEllipsize(truncateAt);
                    }
                } else {
                    int maxLines = currentView.getMaxLines();
                    if (maxLines == 1) {
                        this.R1.getCurrentView().setSingleLine(false);
                        this.R1.getNextView().setSingleLine(false);
                    }
                    if (this.j2) {
                        Point point = hl.q;
                        if (point.x > point.y) {
                            i = 5;
                        } else {
                            i = 10;
                        }
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    if (maxLines != i) {
                        this.R1.getCurrentView().setMaxLines(i);
                        this.R1.getNextView().setMaxLines(i);
                        this.R1.getCurrentView().setEllipsize(null);
                        this.R1.getNextView().setEllipsize(null);
                    }
                }
                currentView.setScrollX(0);
                boolean z9 = this.j2;
                if (!z9 && z2 && isEmpty) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.n2 = z3;
                if (!z9) {
                    this.U1.l0 = false;
                }
                if (z2) {
                    if (z9) {
                        viewGroup = this.Q0;
                    } else {
                        viewGroup = this.U1;
                    }
                    TransitionManager.endTransitions(viewGroup);
                    if (this.j2) {
                        TransitionSet transitionSet = new TransitionSet();
                        transitionSet.setOrdering(0);
                        transitionSet.addTransition(new ChangeBounds());
                        transitionSet.addTransition(new Fade(2));
                        transitionSet.addTransition(new Fade(1));
                        transitionSet.setDuration(200L);
                        TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
                    } else {
                        TransitionSet duration = new TransitionSet().addTransition(new jc8(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new jc8(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
                        if (!isEmpty2) {
                            this.U1.l0 = true;
                            duration.addTransition(new lc8(this, (byte) 0));
                        } else if (!isEmpty) {
                            duration.addTarget((View) this.R1);
                        }
                        TransitionManager.beginDelayedTransition(this.U1, duration);
                    }
                    z4 = true;
                } else {
                    this.R1.getCurrentView().setText((CharSequence) null);
                    ic8 ic8Var2 = this.U1;
                    if (ic8Var2 != null) {
                        ic8Var2.scrollTo(0, 0);
                    }
                    z4 = false;
                }
                if (!isEmpty) {
                    aob.J(null, true);
                    if (r47Var == null || !this.m5 || (message = r47Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, r3c.H0())) {
                        if (r47Var != null && !r47Var.k.entities.isEmpty()) {
                            SpannableString spannableString = new SpannableString(cloneSpans);
                            r47Var.c(spannableString, true, false);
                            if (r47.K4(r47Var.k)) {
                                r47.h(r47Var.O3(), spannableString, false, 3, (int) r47Var.L0(), false);
                            }
                            cloneSpans = pv3.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                        } else {
                            cloneSpans = pv3.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                        }
                    }
                    if (r47Var != null && r47Var.q4()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (!TextUtils.isEmpty(r47Var.S0)) {
                            spannableStringBuilder.append((CharSequence) r47Var.S0);
                            spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.setSpan(new qc8((byte) 0), 0, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                        spannableStringBuilder.append(cloneSpans);
                        cloneSpans = spannableStringBuilder;
                    }
                    this.R1.setTag(cloneSpans);
                    try {
                        wc8 wc8Var2 = this.R1;
                        if (this.q2 != z) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        wc8Var2.a(cloneSpans, z2, z7);
                        ic8 ic8Var3 = this.U1;
                        if (ic8Var3 != null) {
                            ic8Var3.H(ic8Var3.getWidth(), ic8Var3.getHeight());
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    currentView.setScrollY(0);
                    currentView.setTextColor(-1);
                    if (this.K && (!this.s1 || this.Q0.getVisibility() == 0 || this.i7 != null)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    wc8 wc8Var3 = this.R1;
                    if (z6) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    wc8Var3.setVisibility(i2);
                } else {
                    boolean z10 = this.j2;
                    wc8 wc8Var4 = this.R1;
                    if (z10) {
                        wc8Var4.a(ob6.M0(2131754447, "AddCaption"), z2, false);
                        this.R1.getCurrentView().setTextColor(-1291845633);
                        this.R1.setTag("empty");
                        this.R1.setVisibility(0);
                    } else {
                        wc8Var4.a(null, z2, false);
                        this.R1.getCurrentView().setTextColor(-1);
                        wc8 wc8Var5 = this.R1;
                        if (z4 && !isEmpty2) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        wc8Var5.b(4, z5);
                        this.R1.setTag(null);
                    }
                }
                if (this.R1.getCurrentView() instanceof vc8) {
                    ((vc8) this.R1.getCurrentView()).setLoading(z);
                }
                if (isEmpty || !z) {
                    z8 = false;
                }
                this.q2 = z8;
                return;
            }
        }
        c0().setText(cloneSpans);
        this.R1.setVisibility(8);
    }

    public final void J2() {
        boolean z;
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            if (!go.w() && !this.r) {
                z = false;
            } else {
                z = true;
            }
            kfcVar.s0(z);
        }
        boolean z2 = this.p8;
        d7 d7Var = this.f1;
        if (!z2) {
            d7Var.setEnabled(false);
            this.f1.setClickable(false);
            this.f1.animate().alpha(0.5f).setDuration(180L).start();
            this.X7.setMode(0);
            return;
        }
        d7Var.setEnabled(true);
        this.f1.setClickable(true);
        this.f1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.r) {
            if (this.e4 == null) {
                this.N.a(ob6.M0(2131745007, "SoundMuted"), true);
            }
            pb2 pb2Var = this.e1;
            pb2Var.c = true;
            pb2Var.invalidateSelf();
            if (this.k1.getTag() != null) {
                this.k1.setAlpha(0.5f);
                this.k1.setEnabled(false);
            }
            int i = this.d2;
            mb8 mb8Var = this.X7;
            if (i == 1) {
                mb8Var.setMaxProgressDiff(9600.0f / this.n8);
                this.X7.setMode(1);
                P2();
                return;
            }
            mb8Var.setMaxProgressDiff(1.0f);
            this.X7.setMode(0);
            return;
        }
        this.N.a(this.I8, true);
        pb2 pb2Var2 = this.e1;
        pb2Var2.c = false;
        pb2Var2.invalidateSelf();
        if (this.k1.getTag() != null) {
            this.k1.setAlpha(1.0f);
            this.k1.setEnabled(true);
        }
        this.X7.setMaxProgressDiff(1.0f);
        this.X7.setMode(0);
    }

    public final boolean K(float f, boolean z, Runnable runnable) {
        k88 k88Var;
        float f2;
        if (this.o6 == null && (k88Var = this.D1) != null) {
            k88Var.b.i();
            this.a6 = 0.0f;
            this.e6 = 0.0f + f;
            if (z) {
                this.f6 = 1.0f;
            }
            this.m6 = System.currentTimeMillis();
            this.o6 = new AnimatorSet();
            if (this.d2 == 1) {
                this.d6 = 1.0f;
                this.Z5 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.B4;
                if (imageReceiver != null) {
                    int q = imageReceiver.q();
                    int o = this.B4.o();
                    if (Math.abs((((int) this.D1.b.getStateOrientation()) / 90) % 2) == 1) {
                        o = q;
                        q = o;
                    }
                    fo6 fo6Var = this.W4.c;
                    if (fo6Var != null) {
                        q = (int) (q * fo6Var.e);
                        o = (int) (o * fo6Var.f);
                    }
                    float f3 = q;
                    float f4 = o;
                    float min = Math.min(h0(1) / f3, e0(1, false) / f4);
                    if (Math.abs((f / 90.0f) % 2.0f) == 1.0f) {
                        f2 = Math.min(h0(1) / f4, e0(1, false) / f3);
                    } else {
                        f2 = min;
                    }
                    this.d6 = f2 / min;
                }
            }
            if (this.d2 == 11) {
                this.Z5 = z1(false) * this.Z5;
                this.d6 = z1(false) * this.d6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new gy1(this, f, this.D1.c.getRotation(), (byte) 4));
            this.o6.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f), ofFloat);
            this.o6.setDuration(250L);
            this.o6.setInterpolator(k43.f);
            this.o6.addListener(new ok4(this, f, runnable, (byte) 3));
            this.o6.start();
            if (Math.abs(this.D1.b.getStateOrientation() + f) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0() {
        ub1 c0 = c0();
        if (c0 != null) {
            if (c0.M.c() || c0.f.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K1(int i) {
        L1(true, false, false, i);
    }

    public final void K2(float f, float f2, float f3, float f4) {
        float f5 = f - (f3 / 2.0f);
        float f6 = f2 - (f4 / 2.0f);
        boolean z = this.Z8;
        RectF rectF = this.Y8;
        if (!z || Math.abs(rectF.left - f5) >= 1.0f || Math.abs(rectF.top - f6) >= 1.0f || Math.abs(rectF.width() - f3) >= 1.0f || Math.abs(rectF.height() - f4) >= 1.0f) {
            rectF.set(f5, f6, f3 + f5, f4 + f6);
            this.Z8 = true;
            if (this.U8 != null && !this.a9) {
                this.a9 = true;
                hl.d3(this.b9, 150L);
            }
        }
    }

    public final void L() {
        if (this.E != null && this.h0 != null) {
            me8 me8Var = this.U8;
            if (me8Var != null) {
                this.U8 = null;
                me8Var.b();
            }
            u8a u8aVar = this.H7;
            if (u8aVar != null) {
                u8aVar.a();
                this.H7 = null;
            }
            ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.c);
            w1(false);
            try {
                if (this.h0.getParent() != null) {
                    ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.h0);
                    a1();
                }
                this.h0 = null;
            } catch (Exception e) {
                cc4.g(e, true);
            }
            mn5 mn5Var = this.i5;
            if (mn5Var != null) {
                mn5Var.a();
                this.i5 = null;
            }
            this.i0.setImageBitmap(null);
            if (this == k9) {
                k9 = null;
            } else {
                j9 = null;
            }
            a1();
        }
    }

    public final boolean L0() {
        int i;
        if (this.g7 != null && (i = this.O4) >= 0) {
            ArrayList arrayList = this.e7;
            if (i < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.O4);
                jn5 jn5Var = (jn5) this.Z6.get(this.O4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i2).location;
                        if (fileLocation != null) {
                            int i3 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.g7.f;
                            if (i3 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (jn5Var != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jn5Var.f;
                    int i4 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.g7.f;
                    if (i4 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void L1(boolean r44, boolean r45, boolean r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.L1(boolean, boolean, boolean, int):void");
    }

    public final void L2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.L2():void");
    }

    public final void M() {
        if (this.B4.m() == null && !this.f7.isEmpty() && this.d2 != 1) {
            String str = this.B4.R;
            String str2 = this.w4;
            if (str2 == null || !str2.equals(str)) {
                this.v4 = (byte) 0;
                mn5 p = this.B4.p();
                int i = this.B4.V;
                if (str != null && p != null && p.c != null) {
                    Utilities.e.c(new y36(this, p, i, str, (byte) 19));
                }
            }
        }
    }

    public final boolean M0(bd8 bd8Var) {
        if (bd8Var != null) {
            Object g = bd8Var.g();
            if (g instanceof r47) {
                r47 r47Var = (r47) g;
                if (r47Var.k != null) {
                    if (uc7.s1(this.U).E2(r47.B0(r47Var.k)) || r47Var.k.noforwards || r47Var.y2()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void M1() {
        if (this.m4 == 0) {
            N1(this.B4, this.O4, null);
            O1(this.O4, this.x4);
            N1(this.C4, this.O4 + 1, this.G1);
            O1(this.O4 + 1, this.z4);
            N1(this.A4, this.O4 - 1, this.F1);
            O1(this.O4 - 1, this.y4);
        }
    }

    public final void M2(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.M2(int, boolean):void");
    }

    public final void N() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.e8)), this.d8);
        edit.commit();
        S2();
        P2();
    }

    public final void N1(org.telegram.messenger.ImageReceiver r22, int r23, defpackage.u33 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.N1(org.telegram.messenger.ImageReceiver, int, u33):void");
    }

    public final void N2() {
        hfc hfcVar;
        hfc hfcVar2;
        int i;
        int i2;
        String str;
        hfc hfcVar3;
        hfc Z;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        r47 r47Var;
        kfc kfcVar;
        hfc hfcVar4;
        int i3;
        hfc hfcVar5;
        String str8;
        String str9;
        boolean z2;
        String str10;
        String str11;
        if (this.l7 == null && this.V4 == null && this.U4 != null) {
            L2();
        }
        kfc kfcVar2 = this.G2;
        String str12 = "";
        if (kfcVar2 != null && kfcVar2.Y() > 1) {
            this.u0.setRightIcon(2131232064);
            this.J0.setVisibility(8);
            this.y0.setVisibility(0);
            kfc kfcVar3 = this.G2;
            int T = kfcVar3.T();
            if (T >= 0 && T < kfcVar3.Y()) {
                hfcVar = kfcVar3.Z(T);
            } else {
                hfcVar = null;
            }
            int T2 = this.G2.T();
            int Y = this.G2.Y() + 1;
            ArrayList arrayList2 = this.z0;
            String str13 = ", ";
            String str14 = "\n";
            String str15 = "x";
            if (Y != arrayList2.size()) {
                this.y0.removeAllViews();
                arrayList2.clear();
                TextView textView = new TextView(this.F);
                textView.setText(ob6.M0(2131746180, null));
                textView.setTypeface(hl.o());
                textView.setPadding(hl.L(16.0f), hl.L(9.0f), hl.L(16.0f), hl.L(8.0f));
                textView.setTextSize(1, 14.0f);
                int i4 = -1;
                textView.setTextColor(-1);
                this.y0.addView(textView, tre.o(-1, -2));
                final int i5 = -1;
                while (i5 < this.G2.Y()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i5 == i4) {
                        spannableStringBuilder.append((CharSequence) ob6.M0(2131746182, null));
                        if (i5 == this.G2.e0 && hfcVar != null) {
                            spannableStringBuilder.append((CharSequence) " ");
                            int length = spannableStringBuilder.length();
                            if (xea.N0) {
                                spannableStringBuilder.append((CharSequence) Integer.toString(hfcVar.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(hfcVar.c));
                            } else {
                                spannableStringBuilder.append((CharSequence) String.valueOf(hfcVar.b())).append((CharSequence) "p");
                            }
                            hfcVar4 = hfcVar;
                            i3 = T2;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length, spannableStringBuilder.length(), 33);
                            hfcVar5 = hfcVar4;
                        } else {
                            hfcVar4 = hfcVar;
                            i3 = T2;
                            hfcVar5 = null;
                        }
                    } else {
                        hfcVar4 = hfcVar;
                        i3 = T2;
                        hfc Z2 = this.G2.Z(i5);
                        if (Z2.a) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746179, null));
                        } else if (Z2.b() >= 2000) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746189, null));
                        } else if (Z2.b() >= 1400) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746191, null));
                        } else if (Z2.b() >= 1000) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746194, null));
                        } else if (Z2.b() >= 700) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746184, null));
                        } else if (Z2.b() >= 400) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746185, null));
                        } else if (Z2.b() >= 340) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746186, null));
                        } else if (Z2.b() >= 200) {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746187, null));
                        } else {
                            spannableStringBuilder.append((CharSequence) ob6.M0(2131746192, null));
                        }
                        spannableStringBuilder.append((CharSequence) " ");
                        int length2 = spannableStringBuilder.length();
                        if (xea.N0) {
                            spannableStringBuilder.append((CharSequence) Integer.toString(Z2.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z2.c));
                        } else {
                            spannableStringBuilder.append((CharSequence) String.valueOf(Z2.b())).append((CharSequence) "p");
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length2, spannableStringBuilder.length(), 33);
                        hfcVar5 = Z2;
                    }
                    b8 c = s7.c(false, false, this.y0, 0, spannableStringBuilder, true, null);
                    if (xea.N0 && hfcVar5 != null) {
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList3 = hfcVar5.d;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList3.get(i6);
                            int i7 = i6 + 1;
                            jfc jfcVar = (jfc) obj;
                            if (sb.length() > 0) {
                                sb.append(str14);
                            }
                            ArrayList arrayList4 = arrayList3;
                            if (!TextUtils.isEmpty(jfcVar.m)) {
                                sb.append(jfcVar.m);
                                sb.append(str13);
                            }
                            int i8 = size;
                            sb.append(hl.i0(jfcVar.k, false, false).replace(" ", ""));
                            sb.append("(");
                            StringBuilder sb2 = new StringBuilder();
                            String str16 = str13;
                            String str17 = str14;
                            sb2.append(hl.i0((long) jfcVar.l, false, false).replace(" ", ""));
                            sb2.append("/s)");
                            sb.append(sb2.toString());
                            if (jfcVar.c()) {
                                str10 = "!";
                            } else {
                                str10 = " ";
                            }
                            sb.append(str10);
                            if (jfcVar.b()) {
                                str11 = "!";
                            } else {
                                str11 = " ";
                            }
                            sb.append(str11);
                            str13 = str16;
                            arrayList3 = arrayList4;
                            i6 = i7;
                            size = i8;
                            str14 = str17;
                        }
                        str8 = str13;
                        str9 = str14;
                        c.setSubtext(sb.toString());
                    } else {
                        str8 = str13;
                        str9 = str14;
                        c.setSubtext("");
                    }
                    if (i5 == this.G2.e0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c.setChecked(z2);
                    c.d(-328966, -328966);
                    c.setVisibility(0);
                    c.setOnClickListener(new View.OnClickListener(this) {
                        public final PhotoViewer b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r3;
                            int i10 = i5;
                            PhotoViewer photoViewer = this.b;
                            switch (b) {
                                case 0:
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    photoViewer.w(i10);
                                    return;
                                default:
                                    Drawable[] drawableArr2 = PhotoViewer.d9;
                                    photoViewer.w(i10);
                                    return;
                            }
                        }
                    });
                    c.setSelectorColor(268435455);
                    arrayList2.add(c);
                    i5++;
                    str13 = str8;
                    T2 = i3;
                    str14 = str9;
                    hfcVar = hfcVar4;
                    i4 = -1;
                }
                hfcVar2 = hfcVar;
                i = T2;
                k8 k8Var = new k8(aob.H8, this.w2, this.F);
                k8Var.setTag(2131296439, 1);
                k8Var.setColor(-15198184);
                this.y0.addView(k8Var, tre.o(-1, 8));
            } else {
                hfcVar2 = hfcVar;
                i = T2;
                String str18 = ", ";
                String str19 = "\n";
                final int i10 = -1;
                while (i10 < this.G2.Y()) {
                    int i11 = i10 + 1;
                    b8 b8Var = (b8) arrayList2.get(i11);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i10 == -1) {
                        spannableStringBuilder2.append((CharSequence) ob6.M0(2131746182, null));
                        if (i10 == this.G2.e0 && hfcVar2 != null) {
                            spannableStringBuilder2.append((CharSequence) " ");
                            int length3 = spannableStringBuilder2.length();
                            if (xea.N0) {
                                hfcVar3 = hfcVar2;
                                spannableStringBuilder2.append((CharSequence) Integer.toString(hfcVar3.b)).append((CharSequence) str15).append((CharSequence) Integer.toString(hfcVar3.c));
                            } else {
                                hfcVar3 = hfcVar2;
                                spannableStringBuilder2.append((CharSequence) String.valueOf(hfcVar3.b())).append((CharSequence) "p");
                            }
                            i2 = i11;
                            str = str18;
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length3, spannableStringBuilder2.length(), 33);
                            str2 = str15;
                            Z = hfcVar3;
                        } else {
                            i2 = i11;
                            str = str18;
                            hfcVar3 = hfcVar2;
                            str2 = str15;
                            Z = null;
                        }
                    } else {
                        i2 = i11;
                        str = str18;
                        hfcVar3 = hfcVar2;
                        Z = this.G2.Z(i10);
                        if (Z.a) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746179, null));
                        } else if (Z.b() >= 2000) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746189, null));
                        } else if (Z.b() >= 1400) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746191, null));
                        } else if (Z.b() >= 1000) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746194, null));
                        } else if (Z.b() >= 700) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746184, null));
                        } else if (Z.b() >= 400) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746185, null));
                        } else if (Z.b() >= 340) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746186, null));
                        } else if (Z.b() >= 200) {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746187, null));
                        } else {
                            spannableStringBuilder2.append((CharSequence) ob6.M0(2131746192, null));
                        }
                        spannableStringBuilder2.append((CharSequence) " ");
                        int length4 = spannableStringBuilder2.length();
                        if (xea.N0) {
                            spannableStringBuilder2.append((CharSequence) Integer.toString(Z.b)).append((CharSequence) str15).append((CharSequence) Integer.toString(Z.c));
                        } else {
                            spannableStringBuilder2.append((CharSequence) String.valueOf(Z.b())).append((CharSequence) "p");
                        }
                        str2 = str15;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(aob.p1(0.5f, -1)), length4, spannableStringBuilder2.length(), 33);
                    }
                    b8Var.setText(spannableStringBuilder2);
                    b8Var.setVisibility(0);
                    if (xea.N0 && Z != null) {
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList5 = Z.d;
                        int size2 = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList5.get(i12);
                            int i13 = i12 + 1;
                            jfc jfcVar2 = (jfc) obj2;
                            String str20 = str19;
                            if (sb3.length() > 0) {
                                sb3.append(str20);
                            }
                            if (!TextUtils.isEmpty(jfcVar2.m)) {
                                sb3.append(jfcVar2.m);
                                str5 = str;
                                sb3.append(str5);
                            } else {
                                str5 = str;
                            }
                            int i14 = size2;
                            ArrayList arrayList6 = arrayList5;
                            sb3.append(hl.i0(jfcVar2.k, false, false).replace(" ", ""));
                            sb3.append(" (");
                            StringBuilder sb4 = new StringBuilder();
                            ArrayList arrayList7 = arrayList2;
                            sb4.append(hl.i0((long) jfcVar2.l, false, false).replace(" ", ""));
                            sb4.append("/s)");
                            sb3.append(sb4.toString());
                            if (jfcVar2.c()) {
                                str6 = "!";
                            } else {
                                str6 = " ";
                            }
                            sb3.append(str6);
                            if (jfcVar2.b()) {
                                str7 = "!";
                            } else {
                                str7 = " ";
                            }
                            sb3.append(str7);
                            arrayList2 = arrayList7;
                            size2 = i14;
                            i12 = i13;
                            arrayList5 = arrayList6;
                            str19 = str20;
                            str = str5;
                        }
                        arrayList = arrayList2;
                        str3 = str;
                        str4 = str19;
                        b8Var.setSubtext(sb3.toString());
                    } else {
                        arrayList = arrayList2;
                        str3 = str;
                        str4 = str19;
                        b8Var.setSubtext("");
                    }
                    if (i10 == this.G2.e0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b8Var.setChecked(z);
                    b8Var.setOnClickListener(new View.OnClickListener(this) {
                        public final PhotoViewer b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r3;
                            int i102 = i10;
                            PhotoViewer photoViewer = this.b;
                            switch (b) {
                                case 0:
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    photoViewer.w(i102);
                                    return;
                                default:
                                    Drawable[] drawableArr2 = PhotoViewer.d9;
                                    photoViewer.w(i102);
                                    return;
                            }
                        }
                    });
                    arrayList2 = arrayList;
                    hfcVar2 = hfcVar3;
                    str18 = str3;
                    i10 = i2;
                    str15 = str2;
                    str19 = str4;
                }
            }
            hfc hfcVar6 = hfcVar2;
            if (hfcVar6 != null) {
                if (hfcVar6.b() >= 2000) {
                    str12 = ob6.M0(2131746188, null);
                } else if (hfcVar6.b() >= 1000) {
                    str12 = ob6.M0(2131746193, null);
                } else if (hfcVar6.b() >= 700) {
                    str12 = ob6.M0(2131746183, null);
                } else {
                    str12 = hfcVar6.b() + "p";
                }
            }
            this.x0.g.t(str12, true, true);
            zb8 zb8Var = this.s3;
            if (zb8Var != null && (r47Var = this.S4) != null && (kfcVar = this.G2) != null) {
                zb8Var.c(r47Var, kfcVar);
            }
            if (this.t7 != i) {
                try {
                    go.b(0);
                    if (lh2.t().w()) {
                        lh2.t().T(j0());
                    }
                    kfc kfcVar4 = this.G2;
                    if (kfcVar4 != null) {
                        go.z(kfcVar4.c0());
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            return;
        }
        this.y0.setVisibility(8);
        this.J0.setVisibility(0);
        this.u0.setRightIcon(0);
        this.x0.g.t("", true, true);
        this.t7 = -1;
    }

    public final void O() {
        e26 e26Var = this.r7;
        if (e26Var != null) {
            e26Var.a();
            this.r7 = null;
        }
        e26 e26Var2 = this.c2;
        if (e26Var2 != null) {
            e26Var2.a();
            this.c2 = null;
        }
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.h0);
                a1();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void O1(int i, qx7 qx7Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        boolean z2;
        if (qx7Var != null) {
            qx7Var.a();
            qx7Var.setVisibility(8);
            ArrayList arrayList2 = this.f7;
            if (!arrayList2.isEmpty() && i >= 0 && i < arrayList2.size()) {
                Object obj = arrayList2.get(i);
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    z = no6Var.b;
                    str = no6Var.j;
                    arrayList = no6Var.p;
                } else {
                    if (obj instanceof ro6) {
                        ro6 ro6Var = (ro6) obj;
                        str = ro6Var.j;
                        arrayList = ro6Var.p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z = false;
                }
                qx7Var.setVisibility(0);
                if (this.d2 != 11) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qx7Var.b(arrayList, z, false, z2);
                if (str != null) {
                    qx7Var.a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(qx7Var.a);
                    qx7Var.d = bitmapDrawable;
                    qx7Var.setBackground(bitmapDrawable);
                    return;
                }
                qx7Var.a = null;
                qx7Var.d = null;
                qx7Var.setBackground(null);
            }
        }
    }

    public final void O2() {
        long j;
        int G;
        r47 r47Var;
        ed8 ed8Var = this.d;
        if (ed8Var != null) {
            int G2 = ed8Var.G();
            this.P0.a(G2);
            if (G2 == 0) {
                A2(false, true);
            }
            if (this.T0 != null) {
                ed8 ed8Var2 = this.d;
                long j2 = 0;
                if (ed8Var2 != null) {
                    j = ed8Var2.a();
                } else {
                    j = 0;
                }
                if (j == 0 && (r47Var = this.S4) != null) {
                    j = r47.B0(r47Var.k);
                }
                di3 di3Var = this.T0;
                ed8 ed8Var3 = this.d;
                if (ed8Var3 == null || !ed8Var3.p() || this.d.v()) {
                    j2 = uc7.s1(this.U).M1(j);
                }
                ed8 ed8Var4 = this.d;
                if (ed8Var4 == null) {
                    G = 1;
                } else {
                    G = ed8Var4.G();
                }
                di3Var.i(Math.max(1, G), j2, true);
            }
        }
    }

    public final void P(android.graphics.Canvas r52, defpackage.xl0 r53, int r54, int r55, boolean r56, boolean r57, boolean r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P(android.graphics.Canvas, xl0, int, int, boolean, boolean, boolean):void");
    }

    public final void P1(boolean r49, boolean r50, boolean r51, int r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P1(boolean, boolean, boolean, int):void");
    }

    public final void P2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P2():void");
    }

    public final void Q(android.graphics.Canvas r25, float r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Q(android.graphics.Canvas, float, float):void");
    }

    public final void Q1(float f, View view, boolean z, boolean z2) {
        float f2;
        HashMap hashMap = this.L0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        hashMap.put(view, Boolean.valueOf(z));
        view.animate().cancel();
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        float f3 = f2 * f;
        int i = 0;
        if (z2 && bool != null) {
            if (z) {
                view.setVisibility(0);
            }
            view.animate().alpha(f3).setDuration(100L).setUpdateListener(new w98(this, (byte) 4)).setInterpolator(new LinearInterpolator()).withEndAction(new yn6(this, z, view, (byte) 12)).start();
            return;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        view.setAlpha(f3);
        D2();
    }

    public final void Q2() {
        String W;
        String W2;
        int[] iArr = this.m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.n3;
        Arrays.fill(iArr2, 0);
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            long max = Math.max(0L, kfcVar.S());
            long max2 = Math.max(0L, this.G2.U());
            if (!this.G8 && this.W7.getVisibility() == 0) {
                max2 = (this.X7.getRightProgress() - this.X7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.X7.getLeftProgress() * ((float) max2));
                if (max > max2) {
                    max = max2;
                }
            }
            long j = max / 1000;
            long j2 = max2 / 1000;
            iArr[0] = (int) (j / 60);
            iArr[1] = (int) (j % 60);
            iArr2[0] = (int) (j2 / 60);
            iArr2[1] = (int) (j2 % 60);
        } else {
            nc8 nc8Var = this.g0;
            if (nc8Var != null && nc8Var.y) {
                long max3 = Math.max(0, nc8Var.getCurrentPosition());
                long max4 = Math.max(0, this.g0.getVideoDuration());
                if (!this.G8 && this.W7.getVisibility() == 0) {
                    max4 = (this.X7.getRightProgress() - this.X7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.X7.getLeftProgress() * ((float) max4));
                    if (max3 > max4) {
                        max3 = max4;
                    }
                }
                long j3 = max3 / 1000;
                long j4 = max4 / 1000;
                iArr[0] = (int) (j3 / 60);
                iArr[1] = (int) (j3 % 60);
                iArr2[0] = (int) (j4 / 60);
                iArr2[1] = (int) (j4 % 60);
            }
        }
        int i = iArr[0];
        if (i >= 60) {
            W = X(i / 60, i % 60, iArr[1]);
        } else {
            W = W(i, iArr[1]);
        }
        int i2 = iArr2[0];
        if (i2 >= 60) {
            W2 = X(i2 / 60, i2 % 60, iArr2[1]);
        } else {
            W2 = W(i2, iArr2[1]);
        }
        this.o3.l(W + " / " + W2, false);
        if (!Objects.equals(this.j3, W2)) {
            this.j3 = W2;
            this.i3.requestLayout();
        }
    }

    public final void R(Canvas canvas) {
        boolean z;
        float d;
        int i;
        if (this.R4) {
            if (!xea.Z) {
                d = 1.0f;
            } else {
                byte b = this.m4;
                if (b != 0 && b != 2 && b != 3) {
                    z = false;
                } else {
                    z = true;
                }
                d = this.J8.d(z);
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((int) (hl.m * 1.5f));
            int height = this.Q0.getHeight() + hl.n;
            if (this.V1.getVisibility() == 0) {
                i = hl.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i = 0;
            }
            int i2 = height + i;
            if (this.L7 == null) {
                this.L7 = new Path();
                Paint paint = new Paint(1);
                this.M7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.N7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.O7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.P7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.Q7 = new Matrix();
                this.R7 = new Matrix();
                this.M7.setShader(this.O7);
                this.N7.setShader(this.P7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f0.getWidth(), this.f0.getHeight() + hl.n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.L7.rewind();
            float f = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.L7.addRect(0.0f, 0.0f, this.f0.getWidth(), f, direction);
            this.L7.addRect(0.0f, (this.f0.getHeight() + hl.n) - i2, this.f0.getWidth(), this.f0.getHeight() + hl.n, direction);
            canvas.clipPath(this.L7);
            canvas.drawColor(-16777216);
            P(canvas, this.d0, 0, 0, true, true, false);
            canvas.save();
            this.Q7.reset();
            this.Q7.postScale(1.0f, f / 16.0f);
            this.O7.setLocalMatrix(this.Q7);
            this.M7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f0.getWidth(), f, this.M7);
            this.R7.reset();
            this.R7.postScale(1.0f, i2 / 16.0f);
            this.R7.postTranslate(0.0f, (this.f0.getHeight() - i2) + hl.n);
            this.P7.setLocalMatrix(this.R7);
            this.N7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f0.getHeight() + hl.n) - i2, this.f0.getWidth(), this.f0.getHeight() + hl.n, this.N7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void R1(View view, boolean z, boolean z2) {
        Q1(1.0f, view, z, z2);
    }

    public final void R2() {
        int i;
        sfc sfcVar = this.q3;
        if (sfcVar.f) {
            i = sfcVar.d;
        } else {
            i = sfcVar.b;
        }
        int L = (hl.L(2.0f) + ((sfc.S / 2) + i)) - (this.s3.getMeasuredWidth() / 2);
        int L2 = hl.L(10.0f);
        int measuredWidth = (this.i3.getMeasuredWidth() - hl.L(10.0f)) - (this.s3.getMeasuredWidth() / 2);
        zb8 zb8Var = this.s3;
        if (L < L2) {
            zb8Var.setPivotX(Utilities.i((zb8Var.getMeasuredWidth() / 2.0f) - (L2 - L), this.s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            zb8Var.setPivotX(Utilities.i((zb8Var.getMeasuredWidth() / 2.0f) + (L - measuredWidth), this.s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            zb8Var.setPivotX(zb8Var.getMeasuredWidth() / 2.0f);
        }
        this.s3.setTranslationX(L);
    }

    public final void S(float r10, float r11, float r12, float r13, android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.S(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void S1(boolean z, boolean z2) {
        if (this.s0.getVisibility() != 0) {
            this.x0.f.t("", z, true);
        } else {
            int i = (Math.abs(this.u1 - 1.0f) > 0.001f ? 1 : (Math.abs(this.u1 - 1.0f) == 0.001f ? 0 : -1));
            eh2 eh2Var = this.x0;
            if (i < 0) {
                eh2Var.f.t("", z, true);
            } else {
                eh2Var.f.t(zoa.a(this.u1).concat("x"), z, true);
            }
        }
        this.s0.e(z, this.u1);
        oob oobVar = this.J0;
        float f = this.u1;
        b8[] b8VarArr = (b8[]) oobVar.b;
        for (int i2 = 0; i2 < b8VarArr.length; i2++) {
            if (z2 && ((i2 == 0 && Math.abs(f - 0.2f) < 0.01f) || ((i2 == 1 && Math.abs(f - 0.5f) < 0.1f) || ((i2 == 2 && Math.abs(f - 1.0f) < 0.1f) || ((i2 == 3 && Math.abs(f - 1.5f) < 0.1f) || (i2 == 4 && Math.abs(f - 2.0f) < 0.1f)))))) {
                b8VarArr[i2].d(-9718023, -9718023);
            } else {
                b8VarArr[i2].d(-328966, -328966);
            }
        }
    }

    public final void S2() {
        int s;
        if (this.e8 > 0) {
            if (this.d8 >= this.e8) {
                this.d8 = this.e8 - 1;
            }
            if (this.d2 == 1) {
                float max = Math.max(800.0f / this.h8, 800.0f / this.i8);
                this.j8 = Math.round((this.h8 * max) / 2.0f) << 1;
                this.k8 = Math.round((this.i8 * max) / 2.0f) << 1;
            } else {
                Size h = h();
                this.j8 = h.getWidth();
                this.k8 = h.getHeight();
            }
            if (this.l8 != 0) {
                if (this.d2 == 1) {
                    this.l8 = 1560000;
                    s = this.l8;
                } else if (this.j8 == this.h8 && this.k8 == this.i8) {
                    this.l8 = this.m8;
                    s = MediaController.s(this.j8, this.k8, this.l8, false);
                } else {
                    this.l8 = MediaController.T(this.i8, this.h8, this.m8, this.k8, this.j8);
                    s = MediaController.s(this.j8, this.k8, this.l8, false);
                }
                this.w8 = ((s / 8) * this.n8) / 1000.0f;
            }
        }
    }

    public final boolean T0() {
        if (this.I4 && U0() && this.d2 != 1) {
            return true;
        }
        return false;
    }

    public final void T1(Activity activity, org.telegram.ui.ActionBar.e eVar, vnb vnbVar) {
        boolean z;
        ad8 ad8Var;
        e26 e26Var = this.r7;
        if (e26Var != null) {
            e26Var.a();
            this.r7 = null;
        }
        this.r7 = LaunchActivity.c0();
        Activity parentActivity = activity != null ? activity : eVar.getParentActivity();
        aob.J(parentActivity, false);
        this.w2 = vnbVar;
        this.l4 = eVar;
        int i = yac.t0;
        this.U = i;
        this.B4.d = i;
        this.A4.d = i;
        this.C4.d = i;
        pb8 pb8Var = this.V1;
        if (pb8Var != null) {
            pb8Var.setAccount(i);
            this.V1.f.k(false);
        }
        qb8 qb8Var = this.W1;
        if (qb8Var != null) {
            qb8Var.setAccount(this.U);
            this.W1.f.k(false);
        }
        k3b k3bVar = this.o5;
        if (k3bVar != null) {
            k3bVar.setCurrentAccount(this.U);
        }
        if (this.E != parentActivity && parentActivity != null) {
            this.s = parentActivity instanceof BubbleActivity;
            this.E = parentActivity;
            this.F = new ContextThemeWrapper(this.E, 2131755318);
            this.z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
            if (d9 == null) {
                d9 = new Drawable[]{this.E.getDrawable(2131231008), this.E.getDrawable(2131230931), this.E.getDrawable(2131231639)};
            }
            this.U6 = new Scroller(parentActivity);
            z zVar = new z(this, parentActivity);
            this.h0 = zVar;
            zVar.setBackground(this.M0);
            this.h0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.i0 = clippingImageView;
            clippingImageView.O = this.j4;
            clippingImageView.L = false;
            clippingImageView.N = false;
            this.h0.addView(clippingImageView, tre.c(40.0f, 40));
            ad8 ad8Var2 = new ad8(this, parentActivity, parentActivity);
            this.f0 = ad8Var2;
            ad8Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f0);
            }
            this.f0.setClipChildren(true);
            this.f0.setClipToPadding(true);
            this.h0.setClipChildren(false);
            this.h0.setClipToPadding(false);
            tl0 tl0Var = new tl0(this.f0);
            this.c0 = tl0Var;
            tl0Var.a = true;
            this.Y = new wa8(this);
            this.b0 = new r89();
            this.a0 = new r89();
            wa8 wa8Var = this.Y;
            ll0 ll0Var = new ll0(wa8Var, wa8Var, wa8Var);
            this.Z = ll0Var;
            ll0Var.e(new yic(this.f0), this.f0);
            this.Z.g = this.b0;
            this.d0 = new xl0(this.c0, this.f0);
            this.h0.addView(this.f0, tre.e(-1, -1, 51));
            ad8 ad8Var3 = this.f0;
            fa8 fa8Var = new fa8(this);
            WeakHashMap weakHashMap = ihc.a;
            ahc.i(ad8Var3, fa8Var);
            this.f0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            hl.m(layoutParams);
            this.e0.flags = -2147286784;
            qx7 qx7Var = new qx7(this.E);
            this.x4 = qx7Var;
            qx7Var.setVideoPosition(new fa8(this));
            this.f0.addView(this.x4, tre.c(-2.0f, -2));
            qx7 qx7Var2 = new qx7(this.E);
            this.y4 = qx7Var2;
            this.f0.addView(qx7Var2, tre.c(-2.0f, -2));
            qx7 qx7Var3 = new qx7(this.E);
            this.z4 = qx7Var3;
            this.f0.addView(qx7Var3, tre.c(-2.0f, -2));
            y10 y10Var = new y10((byte) 3, parentActivity, this);
            this.G = y10Var;
            y10Var.setOverlayTitleAnimation(true);
            this.G.setTitleColor(-1);
            this.G.setSubtitleColor(-1);
            this.G.setBackgroundColor(2130706432);
            this.G.setOccupyStatusBar(!this.s);
            this.G.G(1090519039, false);
            this.G.H(-1, false);
            this.G.setBackButtonImage(2131231243);
            ImageView backButton = this.G.getBackButton();
            this.H = backButton;
            this.I = backButton.getBackground();
            this.J = null;
            dd8 dd8Var = new dd8(parentActivity);
            this.N = dd8Var;
            this.G.addView(dd8Var, tre.e(-1, -1, 119));
            this.f0.addView(this.G, tre.c(-2.0f, -1));
            cd8 cd8Var = new cd8(parentActivity);
            this.O = cd8Var;
            this.f0.addView(cd8Var, tre.e(-1, -2, 55));
            this.G.setActionBarMenuOnItemClick(new gb8(this, vnbVar));
            s6 u = this.G.u();
            this.B0 = u;
            u.setOnLayoutListener(new y98(this, (byte) 19));
            s7 a = this.B0.a(26, 2131231789);
            this.F0 = a;
            a.setContentDescription(ob6.L0(2131751563));
            iye.a(this.F0);
            R1(this.F0, false, false);
            s7 a2 = this.B0.a(11, 2131232222);
            this.E0 = a2;
            a2.setContentDescription(ob6.L0(2131748433));
            s7 a3 = this.B0.a(18, 2131232185);
            this.D0 = a3;
            a3.setContentDescription(ob6.L0(2131754805));
            s7 a4 = this.B0.a(4, 2131232186);
            this.C0 = a4;
            a4.setContentDescription(ob6.L0(2131750547));
            s6 s6Var = this.B0;
            eh2 eh2Var = new eh2(this.F, 2131232821, new x53());
            this.x0 = eh2Var;
            s7 d = s6Var.d(1, eh2Var);
            this.q0 = d;
            this.x0.setCallback(d.getIconView());
            this.q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.q0.getPopupLayout().c = true;
            this.q0.getPopupLayout().setFitItems(true);
            this.q0.setMenuXOffset(hl.L(3.0f));
            w7 w7Var = new w7(this.F, vnbVar);
            this.s0 = w7Var;
            w7Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.s0.setMinimumWidth(hl.L(196.0f));
            this.s0.setDrawShadow(false);
            this.s0.setBackgroundColor(-14540254);
            this.s0.setTextColor(-1);
            this.s0.setLabel(ob6.L0(2131743239));
            this.s0.setOnValueChange(new ga8(this, (byte) 1));
            this.q0.getPopupLayout().a(this.s0, tre.o(-1, 44));
            k8 a5 = this.q0.a(-1);
            this.A0 = a5;
            a5.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.q0.getPopupLayout();
            oob oobVar = new oob(this.F, new fa8(this));
            this.J0 = oobVar;
            popupLayout.addView(oobVar);
            LinearLayout linearLayout = new LinearLayout(this.F);
            this.y0 = linearLayout;
            linearLayout.setOrientation(1);
            this.q0.getPopupLayout().addView(this.y0);
            b8 e = this.q0.e(22, 2131231917, ob6.L0(2131743240));
            this.t0 = e;
            e.setSelectorColor(268435455);
            p10 p10Var = new p10(this, this.F, (byte) 1);
            this.H0 = p10Var;
            try {
                p10Var.setRouteSelector(id1.c(this.F).a());
                z = true;
            } catch (Exception e2) {
                cc4.f(e2);
                z = false;
            }
            this.H0.setVisibility(4);
            if (z) {
                b8 e3 = this.q0.e(24, 2131231916, ob6.L0(2131743244));
                this.G0 = e3;
                e3.f(false);
                this.G0.setSelectorColor(268435455);
                this.G0.addView(this.H0, 0, tre.c(-1.0f, -1));
            }
            this.q0.I(-115203550);
            this.q0.setOnMenuDismiss(new ea8(this, (byte) 9));
            s7 a6 = this.B0.a(0, 2131231753);
            this.p0 = a6;
            a6.setContentDescription(ob6.L0(2131754834));
            this.p0.setOnClickListener(new ma8(this, (byte) 4));
            this.p0.setOnMenuDismiss(new ea8(this, (byte) 10));
            this.p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.p0.getPopupLayout().c = true;
            this.p0.getPopupLayout().setFitItems(true);
            this.K0 = new dh2(this.F, this.p0.getPopupLayout().getSwipeBack(), new fa8(this));
            b8 i2 = this.p0.i(2131232172, null, ob6.L0(2131745657), this.K0.a);
            i2.d(-328966, -328966);
            this.u0 = i2;
            i2.setOnClickListener(new ma8(this, (byte) 5));
            k8 a7 = this.p0.a(-1);
            this.v0 = a7;
            a7.setColor(-15198184);
            this.p0.e(10, 2131232270, ob6.L0(2131747523)).d(-328966, -328966);
            b8 e4 = this.p0.e(6, 2131231918, ob6.L0(2131746949));
            e4.d(-328966, -328966);
            this.w0 = e4;
            v86 v86Var = new v86(false);
            this.p7 = v86Var;
            b8 f = this.p0.f(v86Var, ob6.L0(2131743243), 126, true, 0);
            this.o7 = f;
            f.d(-328966, -328966);
            this.o7.setItemHeight(56);
            this.o7.setSelectorColor(268435455);
            this.o7.setRightIcon(2131232365);
            this.o7.setSubtext(ob6.L0(2131743242));
            this.o7.getRightIcon().setBackground(aob.e0(536870911, 1));
            int i3 = (ob6.a0 ? 3 : 5) | 16;
            ImageView rightIcon = this.o7.getRightIcon();
            boolean z2 = ob6.a0;
            rightIcon.setLayoutParams(tre.d(40, 40.0f, i3, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
            View view = new View(this.F);
            view.setBackgroundColor(536870911);
            boolean z3 = ob6.a0;
            FrameLayout.LayoutParams d2 = tre.d(-1, 28.0f, i3, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
            d2.width = 1;
            view.setLayoutParams(d2);
            this.o7.addView(view);
            View[] viewArr = {this.o7.getTextView(), this.o7.getSubtextView()};
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                View view2 = viewArr[i4];
                if (view2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams2.leftMargin = ob6.a0 ? hl.L(60.0f) : 0;
                    layoutParams2.rightMargin = ob6.a0 ? 0 : hl.L(60.0f);
                    view2.setLayoutParams(layoutParams2);
                }
                i4++;
            }
            this.o7.getRightIcon().setContentDescription(ob6.L0(2131744940));
            this.o7.getRightIcon().setOnClickListener(new ma8(this, (byte) 7));
            this.p0.u(126);
            b8 e5 = this.p0.e(3, 2131232224, ob6.L0(2131745075));
            this.r0 = e5;
            e5.d(-328966, -328966);
            this.p0.e(12, 2131232175, ob6.L0(2131745658)).d(-328966, -328966);
            this.p0.e(5, 2131232229, ob6.L0(2131745070)).d(-328966, -328966);
            this.p0.e(25, 2131232387, ob6.L0(2131751669)).d(-328966, -328966);
            this.p0.e(21, 2131231880, ob6.L0(2131745990)).d(-328966, -328966);
            this.p0.e(23, 2131232338, ob6.L0(2131745939)).d(-328966, -328966);
            this.p0.e(9, 2131232370, ob6.L0(2131745187)).d(-328966, -328966);
            this.p0.e(13, 2131232387, ob6.L0(2131745056)).d(-328966, -328966);
            this.p0.e(14, 2131232271, ob6.L0(2131745270)).d(-328966, -328966);
            this.p0.e(19, 2131232413, ob6.L0(2131743611)).d(-328966, -328966);
            this.p0.e(20, 2131232413, ob6.L0(2131749058)).d(-328966, -328966);
            this.p0.e(7, 2131232113, ob6.L0(2131751563)).d(-328966, -328966);
            this.p0.e(8, 2131232092, ob6.L0(2131744496)).d(-328966, -328966);
            this.p0.I(-115203550);
            this.p0.u(19);
            this.p0.u(20);
            S1(false, true);
            this.p0.setPopupItemsSelectorColor(268435455);
            this.p0.setSubMenuDelegate(new hb8(this));
            b6 b6Var = new b6(this.F, (byte) 24);
            this.j0 = b6Var;
            b6Var.setBackgroundColor(2130706432);
            this.f0.addView(this.j0, tre.e(-1, 48, 83));
            View view3 = new View(this.F);
            this.k0 = view3;
            view3.setBackgroundColor(this.d2 == 11 ? -16777216 : 2130706432);
            this.h0.addView(this.k0, tre.a(-1.0f, this.l0 / hl.p, 87));
            this.w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.w1[0].setShape(0);
            this.w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.w1[1].setShape(0);
            wd5 wd5Var = new wd5(this.F, hl.L(10.0f));
            this.m1 = wd5Var;
            this.f0.addView(wd5Var, tre.e(-1, 68, 83));
            this.m1.setDelegate(new jb8(this));
            for (int i6 = 0; i6 < 3; i6++) {
                this.y3[i6] = new ImageView(this.E);
                this.y3[i6].setImageResource(2131232223);
                this.y3[i6].setContentDescription(ob6.M0(2131754713, "AccSwitchToFullscreen"));
                this.y3[i6].setScaleType(ImageView.ScaleType.CENTER);
                this.y3[i6].setBackground(aob.f0(1090519039, 1, -1));
                this.y3[i6].setVisibility(4);
                this.y3[i6].setAlpha(1.0f);
                this.f0.addView(this.y3[i6], tre.c(48.0f, 48));
                this.y3[i6].setOnClickListener(new ma8(this, (byte) 8));
            }
            this.R = new kb8(null, new x53(), (byte) 0);
            wc8 wc8Var = new wc8(this.f0.getContext());
            this.R1 = wc8Var;
            wc8Var.setFactory(new qk3(this, (byte) 3));
            this.R1.setVisibility(4);
            H1(true);
            int i7 = 0;
            for (int i8 = 3; i7 < i8; i8 = 3) {
                this.X0[i7] = new lb8(this, this.f0);
                this.X0[i7].d(0, false, true);
                i7++;
            }
            ei1 ei1Var = new ei1(this, this.F, vnbVar);
            this.Y0 = ei1Var;
            ei1Var.setUseSelfAlpha(true);
            this.Y0.setProgressColor(-1);
            this.Y0.setSize(hl.L(54.0f));
            this.Y0.setBackgroundResource(2131231008);
            this.Y0.setVisibility(4);
            this.Y0.setAlpha(0.0f);
            this.f0.addView(this.Y0, tre.e(64, 64, 17));
            G();
            RadialProgressView radialProgressView = new RadialProgressView(this.E, vnbVar);
            this.V7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.V7.setBackgroundResource(2131231008);
            this.V7.setVisibility(4);
            this.f0.addView(this.V7, tre.e(54, 54, 17));
            pa2 pa2Var = new pa2(this.E, (byte) 3);
            this.U7 = pa2Var;
            pa2Var.setBackgroundColor(2130706432);
            this.U7.b();
            this.U7.setTranslationY(hl.L(120.0f));
            ((TextView) this.U7.b).setText(ob6.M0(2131751319, "Done").toUpperCase());
            int i10 = aob.qg;
            yob.X((TextView) this.U7.b, i10, vnbVar);
            this.f0.addView(this.U7, tre.e(-1, 48, 83));
            ((TextView) this.U7.d).setOnClickListener(new z98(this, (byte) 2));
            ((TextView) this.U7.b).setOnClickListener(new z98(this, (byte) 3));
            rec recVar = new rec(false);
            this.A1 = recVar;
            recVar.n = new v34(this, (byte) 24);
            ad8 ad8Var4 = this.f0;
            Objects.requireNonNull(ad8Var4);
            this.B1 = new cz9(new x38(ad8Var4, (byte) 9), false);
            gd8 gd8Var = new gd8(this.E, this);
            this.T7 = gd8Var;
            gd8Var.setTranslationY(hl.L(120.0f));
            this.T7.setVisibility(4);
            this.T7.setBackgroundColor(2130706432);
            this.f0.addView(this.T7, tre.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            jo0 jo0Var = new jo0(this, this.F);
            this.Q0 = jo0Var;
            this.f0.addView(jo0Var, tre.e(-1, -2, 83));
            TextView textView = new TextView(this.f0.getContext());
            this.m0 = textView;
            textView.setTextSize(1, 15.0f);
            this.m0.setTypeface(hl.o());
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            TextView textView2 = this.m0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.Q0.addView(this.m0, tre.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f0.getContext());
            this.n0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.n0.setSingleLine(true);
            this.n0.setMaxLines(1);
            this.n0.setEllipsize(truncateAt);
            this.n0.setTextColor(-1);
            this.n0.setGravity(3);
            this.Q0.addView(this.n0, tre.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f0.getContext());
            this.o0 = textView4;
            int i11 = aob.Fi;
            yob.R(textView4, rnb.e(y0(i11), 6.0f), yob.M(i11), yob.e(i11), vnbVar);
            TextView textView5 = this.o0;
            int i12 = aob.Ji;
            yob.X(textView5, i12, vnbVar);
            this.o0.setEllipsize(truncateAt);
            this.o0.setGravity(17);
            this.o0.setLines(1);
            this.o0.setSingleLine(true);
            this.o0.setText(ob6.M0(2131745269, "SetAsMyPhoto"));
            this.o0.setTextSize(1, 15.0f);
            this.o0.setTypeface(hl.o());
            this.o0.setOnClickListener(new z98(this, (byte) 7));
            this.o0.setVisibility(8);
            this.Q0.addView(this.o0, tre.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            mb8 mb8Var = new mb8(this.E, this);
            this.X7 = mb8Var;
            mb8Var.setDelegate(new vy0(this));
            FrameLayout frameLayout = new FrameLayout(this.E);
            this.W7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.W7.addView(this.X7, tre.e(-1, 54, 83));
            m2(false, false);
            this.f0.addView(this.W7, tre.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            s7 s7Var = this.F0;
            if (s7Var != null) {
                jl0 a8 = this.Z.a(s7Var);
                a8.p(dtd.i(vnbVar));
                a8.r(hl.L(20.0f));
                a8.q(hl.L(7.0f));
                s7Var.setBackground(uk0.d(a8, hl.L(54.0f), hl.L(54.0f)));
            }
            ?? kt3Var = new kt3(this.E, ob6.L0(2131751173));
            this.h1 = kt3Var;
            jl0 a9 = this.Z.a(kt3Var);
            a9.p(dtd.i(vnbVar));
            kt3Var.setBlurredBackgroundDrawable(a9);
            iye.a(this.h1);
            this.h1.setOnClickListener(new z98(this, (byte) 8));
            this.f0.addView(this.h1, tre.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            ld8 ld8Var = new ld8(this.E, vnbVar, this.c0);
            this.p5 = ld8Var;
            kt3 kt3Var2 = ld8Var.c;
            jl0 a10 = this.Z.a(kt3Var2);
            a10.p(dtd.i(vnbVar));
            kt3Var2.setBlurredBackgroundDrawable(a10);
            iye.a(this.p5.c);
            this.p5.setVisibility(8);
            this.p5.setAlpha(0.0f);
            this.p5.setOnClose(new y98(this, (byte) 13));
            this.f0.addView(this.p5, tre.e(-1, -1, 119));
            this.p5.b.setOnClickListener(new z98(this, (byte) 10));
            this.p5.setOnGalleryImage(new ea8(this, (byte) 4));
            d7 d7Var = new d7((byte) 3, this.E, this);
            this.f1 = d7Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            d7Var.setScaleType(scaleType);
            d7 d7Var2 = this.f1;
            pb2 pb2Var = new pb2(this.E);
            this.e1 = pb2Var;
            d7Var2.setImageDrawable(pb2Var);
            this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            d7 d7Var3 = this.f1;
            jl0 a11 = this.Z.a(d7Var3);
            a11.p(dtd.i(null));
            a11.q(hl.L(4.0f));
            a11.r(hl.L(16.0f));
            d7Var3.setBackground(a11);
            iye.a(this.f1);
            this.f0.addView(this.f1, tre.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f1.setOnClickListener(new z98(this, (byte) 11));
            s96 s96Var = new s96(this.f0.getContext());
            this.g1 = s96Var;
            s96Var.setOnClickListener(new z98(this, (byte) 12));
            this.f0.addView(this.g1, tre.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f0.getContext();
            z zVar2 = this.h0;
            ad8 ad8Var5 = this.f0;
            pb8 pb8Var2 = new pb8(this, context, zVar2, ad8Var5, ad8Var5, vnbVar, this.c0, new y98(this, (byte) 18));
            this.V1 = pb8Var2;
            pb8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.V1.setOnTimerChange(new ea8(this, (byte) 5));
            this.V1.setAccount(this.U);
            this.V1.setOnHeightUpdate(new ea8(this, (byte) 6));
            this.V1.setOnAddPhotoClick(new z98(this, (byte) 13));
            ContextThemeWrapper contextThemeWrapper = this.F;
            z zVar3 = this.h0;
            ad8 ad8Var6 = this.f0;
            qb8 qb8Var2 = new qb8(this, contextThemeWrapper, zVar3, ad8Var6, ad8Var6, vnbVar, this.c0, new y98(this, (byte) 18));
            this.W1 = qb8Var2;
            qb8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.W1.D(true, false);
            this.W1.setOnTimerChange(new ea8(this, (byte) 7));
            this.W1.setAccount(this.U);
            this.W1.setOnHeightUpdate(new ea8(this, (byte) 8));
            this.W1.setOnAddPhotoClick(new z98(this, (byte) 14));
            vl4 vl4Var = new vl4(this, this.F);
            this.r5 = vl4Var;
            vl4Var.setVisibility(8);
            this.f0.addView(this.r5, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            k3b k3bVar2 = new k3b(this.F, vnbVar);
            this.o5 = k3bVar2;
            k3bVar2.setCurrentAccount(this.U);
            this.f0.addView(this.o5, ad8Var.indexOfChild(this.G) - 1, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            sc8 sc8Var = new sc8(this);
            this.s5 = sc8Var;
            sc8Var.setRad(18);
            this.s5.l();
            this.o5.setStickerCutOutBtn(this.s5);
            this.s5.setOnClickListener(new z98(this, (byte) 15));
            this.s5.setCutOutState(false);
            this.f0.addView(this.s5, tre.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.E);
            this.t5 = linearLayout2;
            linearLayout2.setOrientation(0);
            sc8 sc8Var2 = new sc8(this);
            this.u5 = sc8Var2;
            sc8Var2.s0 = true;
            sc8Var2.setRad(18);
            this.u5.setEraseState(false);
            this.u5.setOnClickListener(new z98(this, (byte) 16));
            this.t5.addView(this.u5, tre.o(-2, 36));
            this.t5.addView(new Space(this.E), tre.o(12, -1));
            sc8 sc8Var3 = new sc8(this);
            this.v5 = sc8Var3;
            sc8Var3.s0 = true;
            sc8Var3.setRad(18);
            this.v5.setRestoreState(false);
            this.v5.setOnClickListener(new z98(this, (byte) 17));
            this.t5.addView(this.v5, tre.o(-2, 36));
            this.f0.addView(this.t5, tre.e(-2, 36, 17));
            sc8 sc8Var4 = new sc8(this);
            this.w5 = sc8Var4;
            sc8Var4.setUndoState(false);
            this.w5.setRad(18);
            sc8 sc8Var5 = this.w5;
            sc8Var5.s0 = true;
            sc8Var5.setOnClickListener(new z98(this, (byte) 18));
            this.f0.addView(this.w5, tre.e(-2, 36, 17));
            sc8 sc8Var6 = new sc8(this);
            this.x5 = sc8Var6;
            sc8Var6.setOutlineState(false);
            this.x5.setRad(18);
            sc8 sc8Var7 = this.x5;
            sc8Var7.s0 = true;
            sc8Var7.setOnClickListener(new z98(this, (byte) 19));
            this.f0.addView(this.x5, tre.e(-2, 36, 17));
            f2(false, false);
            k2(false, false);
            d26 d26Var = new d26((byte) 11, this.E, this);
            this.Y1 = d26Var;
            d26Var.addView(this.V1, tre.e(-1, -1, 83));
            this.f0.addView(this.Y1, tre.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.E);
            this.Z1 = frameLayout2;
            frameLayout2.addView(this.W1, tre.e(-1, -1, 51));
            this.f0.addView(this.Z1, tre.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.E);
            this.R0 = frameLayout3;
            this.f0.addView(frameLayout3, tre.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.E);
            this.S0 = frameLayout4;
            this.f0.addView(frameLayout4, tre.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.E);
            this.Y7 = textView6;
            textView6.setSingleLine(true);
            this.Y7.setVisibility(8);
            this.Y7.setText(ob6.M0(2131752098, "ChooseCover"));
            this.Y7.setGravity(1);
            this.Y7.setTextSize(1, 14.0f);
            this.Y7.setTextColor(-7566196);
            this.f0.addView(this.Y7, tre.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            di3 di3Var = new di3(this, this.E, vnbVar);
            this.T0 = di3Var;
            int L = hl.L(52.0f);
            int L2 = hl.L(38.0f);
            di3Var.L = L;
            di3Var.M = L2;
            di3 di3Var2 = this.T0;
            di3Var2.t0 = true;
            jl0 a12 = this.Z.a(di3Var2);
            a12.p(dtd.i(vnbVar));
            di3Var2.setBlurredBackgroundDrawable(a12);
            this.f0.addView(this.T0, tre.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.T0.setContentDescription(ob6.M0(2131745368, "Send"));
            iye.a(this.T0);
            this.T0.setOnClickListener(new z98(this, (byte) 20));
            this.T0.setOnLongClickListener(new zs(this, (byte) 10));
            n85 n85Var = new n85(this.E);
            this.U0 = n85Var;
            LinearLayout linearLayout3 = n85Var.b;
            jl0 a13 = this.Z.a(linearLayout3);
            a13.p(dtd.i(vnbVar));
            a13.r(hl.L(18.0f));
            a13.q(hl.L(7.0f));
            linearLayout3.setBackground(a13);
            LinearLayout linearLayout4 = this.U0.c;
            jl0 a14 = this.Z.a(linearLayout4);
            a14.p(dtd.i(vnbVar));
            a14.r(hl.L(18.0f));
            a14.q(hl.L(7.0f));
            linearLayout4.setBackground(a14);
            this.U0.setVisibility(8);
            this.U0.b.setOnClickListener(new z98(this, (byte) 21));
            this.U0.c.setOnClickListener(new z98(this, (byte) 22));
            this.f0.addView(this.U0, tre.e(-1, 56, 80));
            oob oobVar2 = new oob((byte) 9, this.E, this);
            this.I0 = oobVar2;
            oobVar2.setOrientation(0);
            this.I0.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
            oob oobVar3 = this.I0;
            jl0 a15 = this.Z.a(oobVar3);
            a15.p(dtd.i(vnbVar));
            a15.q(hl.L(2.0f));
            a15.r(hl.L(22.0f));
            oobVar3.setBackground(a15);
            this.Q0.addView(this.I0, tre.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.E);
            this.a1 = imageView;
            imageView.setScaleType(scaleType);
            this.a1.setImageResource(2131231733);
            ImageView imageView2 = this.a1;
            int L3 = hl.L(4.0f);
            int L4 = hl.L(6.0f);
            imageView2.setBackground(aob.W(hl.L(22.0f), 285212671, L3, L4, L3, L4));
            this.I0.addView(this.a1, tre.o(48, 48));
            this.a1.setOnClickListener(new z98(this, (byte) 23));
            this.a1.setContentDescription(ob6.M0(2131751663, "CropImage"));
            ImageView imageView3 = new ImageView(this.E);
            this.c1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.c1.setImageResource(2131232287);
            ImageView imageView4 = this.c1;
            int L5 = hl.L(4.0f);
            int L6 = hl.L(6.0f);
            imageView4.setBackground(aob.W(hl.L(22.0f), 285212671, L5, L6, L5, L6));
            this.I0.addView(this.c1, tre.o(48, 48));
            this.c1.setOnClickListener(new z98(this, (byte) 24));
            this.c1.setContentDescription(ob6.M0(2131754778, "AccDescrRotate"));
            ImageView imageView5 = new ImageView(this.E);
            this.b1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.b1.setImageResource(2131231746);
            ImageView imageView6 = this.b1;
            int L7 = hl.L(4.0f);
            int L8 = hl.L(6.0f);
            imageView6.setBackground(aob.W(hl.L(22.0f), 285212671, L7, L8, L7, L8));
            this.I0.addView(this.b1, tre.o(48, 48));
            this.b1.setOnClickListener(new z98(this, (byte) 25));
            this.b1.setContentDescription(ob6.M0(2131754835, "AccDescrMirror"));
            ImageView imageView7 = new ImageView(this.E);
            this.Z0 = imageView7;
            imageView7.setScaleType(scaleType);
            this.Z0.setImageResource(2131231743);
            ImageView imageView8 = this.Z0;
            int L9 = hl.L(4.0f);
            int L10 = hl.L(6.0f);
            imageView8.setBackground(aob.W(hl.L(22.0f), 285212671, L9, L10, L9, L10));
            this.I0.addView(this.Z0, tre.o(48, 48));
            this.Z0.setOnClickListener(new z98(this, (byte) 26));
            this.Z0.setContentDescription(ob6.M0(2131754805, "AccDescrPhotoEditor"));
            iec iecVar = new iec(this.E);
            this.k1 = iecVar;
            iecVar.setTag(1);
            iec iecVar2 = this.k1;
            int L11 = hl.L(4.0f);
            int L12 = hl.L(6.0f);
            iecVar2.setBackground(aob.W(hl.L(22.0f), 285212671, L11, L12, L11, L12));
            this.d8 = E1();
            this.k1.a(Math.min(this.j8, this.k8), this.p8 && this.e8 > 1, this.r);
            this.k1.setContentDescription(ob6.M0(2131754730, "AccDescrVideoQuality"));
            this.I0.addView(this.k1, tre.o(48, 48));
            this.k1.setOnClickListener(new uv5(this, parentActivity, (byte) 21));
            ImageView imageView9 = new ImageView(this.E);
            this.d1 = imageView9;
            imageView9.setScaleType(scaleType);
            this.d1.setImageResource(2131231760);
            ImageView imageView10 = this.d1;
            int L13 = hl.L(4.0f);
            int L14 = hl.L(6.0f);
            imageView10.setBackground(aob.W(hl.L(22.0f), 285212671, L13, L14, L13, L14));
            this.I0.addView(this.d1, tre.o(48, 48));
            this.d1.setOnClickListener(new z98(this, (byte) 27));
            this.d1.setContentDescription(ob6.M0(2131754806, "AccDescrPhotoAdjust"));
            pa2 pa2Var2 = new pa2(this.F, (byte) 3);
            this.V0 = pa2Var2;
            pa2Var2.setBackgroundColor(-872415232);
            this.V0.b();
            this.V0.setVisibility(8);
            this.f0.addView(this.V0, tre.e(-1, 48, 83));
            ((TextView) this.V0.d).setOnClickListener(new z98(this, (byte) 28));
            ((TextView) this.V0.b).setOnClickListener(new z98(this, (byte) 29));
            TextView textView7 = new TextView(this.F);
            this.W0 = textView7;
            textView7.setClickable(false);
            this.W0.setVisibility(8);
            this.W0.setTextSize(1, 14.0f);
            this.W0.setTextColor(-1);
            this.W0.setGravity(17);
            this.W0.setBackgroundDrawable(aob.e0(-12763843, 0));
            this.W0.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
            this.W0.setText(ob6.L0(2131751661).toUpperCase());
            this.W0.setTypeface(hl.o());
            this.V0.addView(this.W0, tre.e(-2, -1, 49));
            this.W0.setOnClickListener(new ma8(this, (byte) 0));
            ru4 ru4Var = new ru4(this.f0.getContext(), this);
            this.q6 = ru4Var;
            ru4Var.v = false;
            this.r6 = true;
            ru4Var.h = this;
            fa8 fa8Var2 = new fa8(this);
            this.B4.p0(this.f0);
            ImageReceiver imageReceiver = this.B4;
            imageReceiver.l1 = (byte) 2;
            imageReceiver.K0 = true;
            imageReceiver.h1 = fa8Var2;
            this.A4.p0(this.f0);
            ImageReceiver imageReceiver2 = this.A4;
            imageReceiver2.l1 = (byte) 2;
            imageReceiver2.K0 = true;
            imageReceiver2.h1 = fa8Var2;
            this.C4.p0(this.f0);
            ImageReceiver imageReceiver3 = this.C4;
            imageReceiver3.l1 = (byte) 2;
            imageReceiver3.K0 = true;
            imageReceiver3.h1 = fa8Var2;
            int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f0.getContext(), 2131232708);
            this.O0 = checkBox;
            checkBox.setDrawBackground(true);
            this.O0.setHasBorder(true);
            this.O0.setSize(34);
            this.O0.setCheckOffset(hl.L(1.0f));
            this.O0.c(y0(i10), -1);
            this.O0.setVisibility(8);
            this.f0.addView(this.O0, tre.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
            if (!this.s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += hl.m;
            }
            this.O0.setOnClickListener(new ma8(this, (byte) 1));
            CounterView counterView = new CounterView(this.E);
            this.P0 = counterView;
            this.f0.addView(counterView, tre.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
            if (!this.s) {
                ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += hl.m;
            }
            this.P0.setOnClickListener(new ma8(this, (byte) 2));
            jd8 jd8Var = new jd8(this.E);
            this.p1 = jd8Var;
            jd8Var.setVisibility(8);
            this.p1.setAlpha(0.0f);
            this.p1.setLayoutManager(new as((byte) 11, 0, true));
            jd8 jd8Var2 = this.p1;
            t20 t20Var = new t20(this, this.E, (byte) 13);
            this.q1 = t20Var;
            jd8Var2.setAdapter(t20Var);
            this.f0.addView(this.p1, tre.e(-1, 103, 51));
            this.p1.setOnItemClickListener(new zg4(this, (byte) 19));
            UndoView undoView = new UndoView(this.F, null, false, vnbVar);
            this.o1 = undoView;
            undoView.setAdditionalTranslationY(hl.L(112.0f));
            this.o1.h(-115203550, -1);
            this.f0.addView(this.o1, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (hl.A1()) {
                View view4 = new View(this.F);
                this.T3 = view4;
                view4.setContentDescription(ob6.M0(2131754925, "AccActionPlay"));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new ma8(this, (byte) 3));
                this.f0.addView(this.T3, tre.e(64, 64, 17));
            }
            yob.R(this.o0, rnb.e(y0(i11), 6.0f), yob.M(i11), yob.e(i11), vnbVar);
            yob.X(this.o0, i12, vnbVar);
            kb8 kb8Var = this.R;
            kb8Var.j0 = true;
            kb8Var.h0 = false;
            lmb m = kb8Var.m(this.h0.getContext());
            hl.B2(m);
            this.f0.addView(m);
            this.R.Q(this.f0);
            this.R.P();
            this.a.a(false, false);
            return;
        }
        G2();
    }

    public final boolean T2() {
        xn5 xn5Var = this.p2;
        if (xn5Var != null && xn5Var.d && !xn5Var.e) {
            return true;
        }
        return false;
    }

    public final void U(TLRPC.Document document, TLRPC.Document document2, boolean z, defpackage.c cVar) {
        float f;
        this.z7 = document;
        this.y7 = document2;
        this.A7 = z;
        this.B7 = false;
        this.C7 = cVar;
        this.a6 = 0.0f;
        this.e6 = 0.0f;
        if (this.o5 != null) {
            sc8 sc8Var = this.x5;
            if (sc8Var != null) {
                sc8Var.m(false, false);
            }
            this.o5.b();
            ArrayList arrayList = this.q5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.z7 != null) {
            ArrayList arrayList2 = this.q5;
            if (arrayList2 == null) {
                this.q5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.z7;
            int i = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet n0 = ls6.d0(i).n0(documentAttribute.stickerset, true);
                        if (n0 != null && n0.packs != null) {
                            for (int i3 = 0; i3 < n0.packs.size(); i3++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i3);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.id)) && pv3.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && pv3.g(documentAttribute.alt) != null) {
                                arrayList4.add(documentAttribute.alt);
                            }
                        }
                        arrayList3 = arrayList4;
                        break;
                    }
                }
            }
            if (arrayList3 != null) {
                this.q5.addAll(arrayList3);
            }
        }
        sc8 sc8Var2 = this.s5;
        if (sc8Var2 != null) {
            sc8Var2.setCutOutState(false);
        }
        k2(true, false);
        ImageView imageView = this.d1;
        if (imageView != null) {
            if (this.A7) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            imageView.setAlpha(f);
        }
    }

    public final boolean U0() {
        if (this.d2 != 11) {
            int i = this.O4;
            if (i >= 0) {
                ArrayList arrayList = this.f7;
                if (i < arrayList.size()) {
                    ed8 ed8Var = this.d;
                    if (ed8Var != null && !ed8Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.O4);
                    if (obj instanceof no6) {
                        return ((no6) obj).j();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void U1(n12 n12Var) {
        this.b2 = n12Var;
        e26 e26Var = this.c2;
        if (e26Var != null) {
            e26Var.a();
            this.c2 = null;
        }
        if (n12Var != null) {
            cdc cdcVar = n12Var.j1;
            if (cdcVar == null) {
                cdcVar = new cdc(n12Var.getWindow());
                n12Var.j1 = cdcVar;
            }
            this.c2 = new e26(cdcVar);
        }
    }

    public final void V() {
        me8 me8Var = this.U8;
        if (me8Var != null && me8Var.f()) {
            return;
        }
        this.U8 = fc3.b().k(this.c9);
    }

    public final boolean V0() {
        if (this.e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void V1() {
        zu1 zu1Var;
        TLRPC.Chat chat;
        ed8 ed8Var = this.d;
        if (ed8Var != null) {
            if (ed8Var.u() != null && this.h > 0 && this.d.u().size() >= this.h && !this.d.w(this.O4)) {
                if (this.n && (zu1Var = this.k4) != null && (chat = zu1Var.e) != null && !xc2.N(chat) && chat.slowmode_enabled) {
                    jj.K(this.E, ob6.M0(2131745038, "Slowmode"), ob6.M0(2131745031, "SlowmodeSelectSendError")).o();
                    return;
                }
                return;
            }
            int D = this.d.D(this.O4, k0());
            boolean w = this.d.w(this.O4);
            this.O0.b(w, true);
            if (D >= 0) {
                t20 t20Var = this.q1;
                if (w) {
                    t20Var.i(D);
                    this.p1.A0(D);
                } else {
                    t20Var.s(D);
                    if (D == 0) {
                        this.q1.g(0);
                    }
                }
            }
            O2();
        }
    }

    public final void W0() {
        WindowManager.LayoutParams layoutParams = this.e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.h0.setFocusable(true);
        this.f0.setFocusable(true);
    }

    public final void W1() {
        float q = this.B4.q();
        float o = this.B4.o();
        if (q != 0.0f && o != 0.0f) {
            float h0 = h0(this.t4);
            float f0 = f0();
            float min = Math.min(f0 / o, h0 / q);
            float max = Math.max(h0 / ((int) (q * min)), f0 / ((int) (o * min)));
            this.Z5 = max;
            I2(max);
        }
    }

    public final void X0(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        boolean z2;
        int i;
        Bitmap.CompressFormat d0 = d0();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z2 = true;
            } catch (Throwable th) {
                cc4.g(th, true);
                return;
            }
        } else {
            z2 = false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        if (f2 > f || height > f) {
            float max = Math.max(width, height) / f;
            height = (int) (height / max);
            width = (int) (f2 / max);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, width, height);
        Paint paint = e9;
        if (z) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f == 512.0f) {
            i = 83;
        } else {
            i = 87;
        }
        createBitmap.compress(d0, i, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (z2) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void X1(CharSequence charSequence) {
        dd8 dd8Var = this.N;
        this.e4 = (String) charSequence;
        dd8Var.c(charSequence);
        t2(true, false);
    }

    public final int Y(int i) {
        if (i != 1) {
            if (i == 0) {
                if (this.d2 != 1) {
                    return 0;
                }
            } else if (i != 5 && i != 4 && i != 3) {
                return hl.L(14.0f);
            } else {
                return 0;
            }
        }
        return hl.L(16.0f);
    }

    public final void Y0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y0(boolean):void");
    }

    public final void Y1(boolean z, boolean z2) {
        if (this.l3 != z) {
            b6 b6Var = this.j0;
            if (z) {
                b6Var.setTag(1);
            } else {
                b6Var.setTag(null);
            }
            ValueAnimator valueAnimator = this.k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.l3 = z;
            float f = 0.0f;
            int i = 0;
            if (z2) {
                if (z) {
                    this.i3.setVisibility(0);
                }
                float alpha = this.i3.getAlpha();
                if (z) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new w98(this, (byte) 0));
                ofFloat.addListener(new ec8(this, z, (byte) 0));
                this.k3 = ofFloat;
                ofFloat.start();
            } else {
                kd8 kd8Var = this.i3;
                if (!z) {
                    i = 8;
                }
                kd8Var.setVisibility(i);
                kd8 kd8Var2 = this.i3;
                if (z) {
                    f = 1.0f;
                }
                kd8Var2.setAlpha(f);
            }
            if (this.l2 && this.i7 == null) {
                s7 s7Var = this.p0;
                if (z) {
                    s7Var.S(9);
                } else {
                    s7Var.u(9);
                }
            }
        }
    }

    public final int Z(int i) {
        int L;
        int i2 = 0;
        if (i >= 0) {
            if (i != 1 && (i != 0 || this.d2 != 1)) {
                if (i == 3 && this.M1 != null) {
                    int L2 = hl.L(8.0f);
                    if (!this.s) {
                        i2 = hl.m;
                    }
                    return this.M1.getAdditionalTop() + L2 + i2;
                } else if (i != 0 && i != 4 && i != 5) {
                    L = hl.L(14.0f);
                    if (!this.s) {
                        i2 = hl.m;
                    }
                }
            } else {
                L = hl.L(16.0f);
                if (!this.s) {
                    i2 = hl.m;
                }
            }
            return L + i2;
        }
        return 0;
    }

    public final void Z0(android.graphics.Canvas r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z0(android.graphics.Canvas):void");
    }

    public final boolean Z1(int i) {
        bd8 bd8Var = this.i7;
        if (bd8Var != null) {
            if (bd8Var.a(i) || this.i7.e(i)) {
                boolean z = xea.a;
                if (i86.e(1024)) {
                    File b = this.i7.b(i);
                    if (b != null && b.exists()) {
                        return true;
                    }
                    if (xea.x0 && (this.i7.d(i) instanceof TLRPC.Document)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int a0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.a0(boolean):int");
    }

    public final void a1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).a1.remove(this.t1);
        }
        org.telegram.ui.ActionBar.e eVar = this.l4;
        if (eVar != null && eVar.getFragmentView() != null) {
            this.l6 = 1.0f;
            View fragmentView = this.l4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            n12 n12Var = this.b2;
            if (n12Var != null) {
                ex0 ex0Var = n12Var.c;
                ex0Var.setScaleX(1.0f);
                ex0Var.setScaleY(1.0f);
            }
        }
    }

    public final void b(float f, float f2, float f3, boolean z) {
        if (this.Z5 == f && this.W5 == f2 && this.X5 == f3) {
            return;
        }
        this.Q6 = z;
        this.d6 = f;
        this.b6 = f2;
        this.c6 = f3;
        this.m6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.o6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f));
        this.o6.setInterpolator(this.s6);
        this.o6.setDuration(250L);
        this.o6.addListener(new wb8(this, (byte) 7));
        this.o6.start();
    }

    public final ClippingImageView[] b0(fd8 fd8Var) {
        int i;
        if (!hl.O1() && fd8Var != null && fd8Var.m != null) {
            i = 1;
        } else {
            i = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i + 1];
        clippingImageViewArr[0] = this.i0;
        if (i != 0) {
            sga sgaVar = fd8Var.m;
            clippingImageViewArr[1] = sgaVar;
            sgaVar.setAdditionalTranslationY(fd8Var.n);
        }
        return clippingImageViewArr;
    }

    public final void b1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.G2 != null && this.S4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.G2.U() == -9223372036854775807L) {
                        this.a3 = intValue / ((float) this.S4.L0());
                        return;
                    }
                    long j = intValue * 1000;
                    this.G2.o0(j);
                    this.q3.h(true, ((float) j) / ((float) this.G2.U()));
                    this.r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.E instanceof LaunchActivity) {
                    uj3 uj3Var = new uj3(null);
                    uj3Var.p2 = url;
                    ((LaunchActivity) this.E).u0(uj3Var, false, true);
                    A(false, false);
                    return;
                }
                return;
            } else if (this.k4 != null && ((clickableSpan instanceof h8c) || hl.D3(url))) {
                jj.n0(this.k4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void b2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                id idVar = this.Q1;
                if (idVar != null) {
                    idVar.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                id o = alertDialog$Builder.o();
                this.Q1 = o;
                o.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new o1(this, (byte) 29));
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public final void c() {
        int i;
        boolean z;
        TLRPC.EncryptedChat encryptedChat;
        if (V0() && this.d != null && (i = this.O4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                CharSequence text = c0().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.u7 && !TextUtils.equals(this.v7, text) && this.d.S(this.O4) != 0 && this.d.G() > 0) {
                    this.u7 = false;
                }
                ls6 d0 = ls6.d0(this.U);
                zu1 zu1Var = this.k4;
                if (zu1Var != null && ((encryptedChat = zu1Var.h) == null || hl.W0(encryptedChat.layer) >= 101)) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList Y = d0.Y(charSequenceArr, z, true);
                CharSequence charSequence = charSequenceArr[0];
                this.v7 = charSequence;
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    no6Var.a = charSequence;
                    no6Var.n = Y;
                } else if (obj instanceof ro6) {
                    ro6 ro6Var = (ro6) obj;
                    ro6Var.I = charSequence;
                    ro6Var.n = Y;
                }
                if (text.length() != 0 && !this.d.w(this.O4)) {
                    V1();
                }
                ed8 ed8Var = this.d;
                if (ed8Var != null) {
                    ed8Var.f(text);
                }
            }
        }
    }

    public final ub1 c0() {
        ed8 ed8Var = this.d;
        if (ed8Var != null && ed8Var.z()) {
            return this.W1;
        }
        return this.V1;
    }

    public final void c1(fd8 fd8Var) {
        if (this.v2) {
            w1(true);
        }
        r47 r47Var = this.S4;
        if (r47Var != null && !r47Var.P) {
            xb4.G(this.U).f(this.S4.F0());
        }
        this.e = false;
        this.f = false;
        this.h2 = false;
        this.r4 = true;
        this.S4 = null;
        this.X4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.a5 = null;
        this.h5 = null;
        this.d5 = null;
        this.r2 = null;
        VideoAds videoAds = this.T4;
        if (videoAds != null) {
            videoAds.stop();
            this.T4 = null;
        }
        if (this.i3 != null) {
            Y1(false, false);
        }
        ic8 ic8Var = this.U1;
        if (ic8Var != null) {
            ic8Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.e2 = false;
        this.f2 = false;
        this.g2 = false;
        this.i2 = false;
        mn5 mn5Var = this.i5;
        if (mn5Var != null) {
            mn5Var.a();
            this.i5 = null;
        }
        this.b2 = null;
        e26 e26Var = this.c2;
        if (e26Var != null) {
            e26Var.a();
            this.c2 = null;
        }
        lm lmVar = this.k2;
        if (lmVar != null) {
            lmVar.w(this.f0);
            this.k2 = null;
        }
        for (int i = 0; i < 3; i++) {
            lb8 lb8Var = this.X0[i];
            if (lb8Var != null) {
                lb8Var.d(-1, false, true);
            }
        }
        x1(0);
        mb8 mb8Var = this.X7;
        if (mb8Var != null) {
            mb8Var.a();
        }
        this.o1.d(0, false);
        this.B4.g0(null);
        this.E4.a();
        this.A4.g0(null);
        this.D4.a();
        this.C4.g0(null);
        this.F4.a();
        this.f0.post(new ba8(this, fd8Var, (byte) 0));
        ed8 ed8Var = this.d;
        if (ed8Var != null) {
            ed8Var.F();
        }
        wd5 wd5Var = this.m1;
        wd5Var.d.clear();
        wd5Var.e.clear();
        wd5Var.c.clear();
        ed8 ed8Var2 = this.d;
        if (ed8Var2 != null) {
            ed8Var2.C();
        }
        this.d = null;
        this.q1.f();
        this.i7 = null;
        this.r4 = false;
        this.t8 = 0.0f;
        this.u8 = 1.0f;
        if (fd8Var != null) {
            fd8Var.a.v0(true, true);
        }
        zu1 zu1Var = this.k4;
        if (zu1Var != null) {
            zu1Var.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.N4;
        if (bitmap != null) {
            bitmap.recycle();
            this.N4 = null;
        }
    }

    public final boolean c2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.e eVar = this.l4;
        if ((eVar instanceof zu1) && xc2.V(((zu1) eVar).e)) {
            v21 f = new d31(frameLayout, this.w2).f(uc7.s1(this.U).l4.p1.f(), new na8(this, (byte) 3));
            f.w = new na8(this, (byte) 4);
            this.s7 = f.j();
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r25, int r26, int r27, int r28, int r29, float r30, defpackage.u33 r31, defpackage.fo6 r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d(android.graphics.Canvas, int, int, int, int, float, u33, fo6):void");
    }

    public final Bitmap.CompressFormat d0() {
        if (this.d2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void d1(defpackage.r47 r22, org.telegram.tgnet.TLRPC.FileLocation r23, defpackage.jn5 r24, defpackage.jn5 r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, defpackage.fd8 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d1(r47, org.telegram.tgnet.TLRPC$FileLocation, jn5, jn5, java.util.ArrayList, java.util.ArrayList, java.util.List, int, fd8):void");
    }

    public final void d2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.w2, this.E);
        String M0 = ob6.M0(2131689472, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
        r47 r47Var = this.S4;
        if (r47Var != null && r47.K4(r47Var.k) && xb4.G(this.S4.K1).S(this.b5[0])) {
            idVar.U = ob6.M0(2131746931, null);
        } else {
            idVar.U = ob6.M0(2131746945, null);
        }
        b2(alertDialog$Builder);
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.e():void");
    }

    public final int e0(int i, boolean z) {
        int measuredHeight;
        int additionalTop;
        boolean z2;
        if (!z && !(z2 = this.s)) {
            measuredHeight = (hl.n - this.t2.bottom) + hl.q.y;
            if ((i == 0 || i == 4 || i == 5) && this.d2 != 1 && !z2) {
                measuredHeight += hl.m;
            }
        } else {
            measuredHeight = this.f0.getMeasuredHeight();
        }
        if ((i == 0 && this.d2 == 1) || i == 1) {
            additionalTop = hl.L(144.0f);
        } else if (i == 2) {
            additionalTop = hl.L(214.0f);
        } else if (i == 3) {
            additionalTop = this.M1.getAdditionalTop() + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.M1.getAdditionalBottom() + hl.L(48.0f);
        } else {
            return measuredHeight;
        }
        return measuredHeight - additionalTop;
    }

    public final void e1() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z;
        if (this.E != null && this.l2) {
            try {
                r47 r47Var = this.S4;
                boolean z2 = false;
                File file = null;
                file = null;
                file = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
                if (r47Var != null) {
                    boolean K4 = r47.K4(r47Var.k);
                    if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                        File file2 = new File(this.S4.k.attachPath);
                        if (file2.exists()) {
                            file = file2;
                        }
                    }
                    if (file == null) {
                        xb4.G(this.U);
                        file = xb4.M(this.S4.k, false, true);
                    }
                    z2 = K4;
                } else if (this.Z4 != null) {
                    xb4.G(this.U);
                    jn5 jn5Var = this.Z4;
                    if (jn5Var == null) {
                        tL_fileLocationToBeDeprecated = null;
                    } else {
                        tL_fileLocationToBeDeprecated = jn5Var.f;
                    }
                    String n0 = n0(jn5Var);
                    if (this.y5 == 0 && !this.A5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    File J = xb4.J(tL_fileLocationToBeDeprecated, n0, z, true);
                    if (J != null && J.exists()) {
                        file = J;
                    } else {
                        xb4.G(this.U);
                        jn5 jn5Var2 = this.Z4;
                        if (jn5Var2 != null) {
                            tL_fileLocationToBeDeprecated2 = jn5Var2.f;
                        }
                        file = xb4.J(tL_fileLocationToBeDeprecated2, n0(jn5Var2), false, true);
                    }
                } else {
                    bd8 bd8Var = this.i7;
                    if (bd8Var != null) {
                        file = bd8Var.b(this.O4);
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(xb4.z(4), file.getName());
                }
                if (file != null && file.exists()) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (z2) {
                        intent.setType("video/mp4");
                    } else {
                        r47 r47Var2 = this.S4;
                        if (r47Var2 != null) {
                            intent.setType(r47Var2.t1());
                        } else {
                            intent.setType("image/jpeg");
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            Activity activity = this.E;
                            org.telegram.messenger.a.d();
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.c(activity, "org.telegram.messenger.beta.provider", file));
                            intent.setFlags(1);
                        } catch (Exception unused) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    this.E.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, "ShareFile")), 500);
                    return;
                }
                d2();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void e2(final ub1 ub1Var, boolean z, boolean z2, final float[] fArr) {
        float f;
        float f2;
        int i;
        ed8 ed8Var = this.d;
        if (ed8Var != null && ed8Var.l()) {
            f = 175.0f;
        } else {
            f = 58.0f;
        }
        float L = hl.L(f);
        float f3 = 1.0f;
        if (ub1Var == this.W1) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        float f4 = L * f2;
        Integer num = null;
        if (!z2) {
            ub1Var.animate().setListener(null).cancel();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            ub1Var.setVisibility(i);
            if (z) {
                f4 = 0.0f;
            }
            ub1Var.setTranslationY(f4);
            float alpha = this.Q0.getAlpha();
            if (!z) {
                f3 = 0.0f;
            }
            fArr[0] = f3;
            ub1Var.setAlpha(alpha * f3);
        } else if (z) {
            if (ub1Var.getTag() == null) {
                if (ub1Var.getVisibility() != 0) {
                    ub1Var.setVisibility(0);
                    ub1Var.setAlpha(this.Q0.getAlpha());
                    ub1Var.setTranslationY(f4);
                }
                ub1Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r4;
                        float[] fArr2 = fArr;
                        ub1 ub1Var2 = ub1Var;
                        PhotoViewer photoViewer = this.b;
                        switch (b) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.d9;
                                float alpha2 = photoViewer.Q0.getAlpha();
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction;
                                ub1Var2.setAlpha(alpha2 * animatedFraction);
                                if (ub1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout = photoViewer.W7;
                                    if (frameLayout != null) {
                                        frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                return;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                float alpha3 = photoViewer.Q0.getAlpha();
                                float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction2;
                                ub1Var2.setAlpha(alpha3 * animatedFraction2);
                                if (ub1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout2 = photoViewer.W7;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(k43.h).start();
            }
        } else if (ub1Var.getTag() != null) {
            ub1Var.animate().translationY(f4).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r4;
                    float[] fArr2 = fArr;
                    ub1 ub1Var2 = ub1Var;
                    PhotoViewer photoViewer = this.b;
                    switch (b) {
                        case 0:
                            Drawable[] drawableArr = PhotoViewer.d9;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction;
                            ub1Var2.setAlpha(alpha2 * animatedFraction);
                            if (ub1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.W7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            return;
                        default:
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            float alpha3 = photoViewer.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction2;
                            ub1Var2.setAlpha(alpha3 * animatedFraction2);
                            if (ub1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout2 = photoViewer.W7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-c00.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(k43.h).withEndAction(new rb1(ub1Var, (byte) 1)).start();
        }
        if (z) {
            num = 1;
        }
        ub1Var.setTag(num);
    }

    public final void f(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f(android.graphics.Bitmap):void");
    }

    public final int f0() {
        return e0(this.t4, false);
    }

    public final boolean f1(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f1(android.view.MotionEvent):boolean");
    }

    public final void f2(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ed8 ed8Var = this.d;
        boolean z5 = false;
        if (ed8Var != null && ed8Var.z()) {
            z3 = true;
        } else {
            z3 = false;
        }
        pb8 pb8Var = this.V1;
        if (z && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        e2(pb8Var, z4, z2, this.D7);
        qb8 qb8Var = this.W1;
        if (z && z3) {
            z5 = true;
        }
        e2(qb8Var, z5, z2, this.E7);
    }

    public final void g(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f10;
        fo6 fo6Var;
        if (this.o6 != null) {
            f5 = hl.R1(0.0f, this.f6, this.k6);
            f = hl.R1(this.Z5, this.d6, this.k6);
            f2 = hl.R1(this.a6, this.e6, this.k6);
            f3 = hl.R1(this.X5, this.c6, this.k6);
            f4 = hl.R1(this.W5, this.b6, this.k6);
        } else {
            f = this.Z5;
            f2 = this.a6;
            f3 = this.X5;
            f4 = this.W5;
            if (this.m6 != 0) {
                f4 = this.b6;
                f3 = this.c6;
                f = this.d6;
            }
            f5 = 0.0f;
        }
        int h0 = h0(this.t4);
        int f0 = f0();
        canvas.translate(Y(this.t4), Z(this.t4));
        canvas.translate(f4, f3 + 0.0f);
        canvas.scale(f, f);
        canvas.rotate(f2);
        int q = this.B4.q();
        int o = this.B4.o();
        float f11 = h0;
        float f12 = q;
        float f13 = f11 / f12;
        float f14 = f0;
        float f15 = o;
        float f16 = f14 / f15;
        float min = Math.min(f13, f16);
        u33 u33Var = this.E1;
        int i = u33Var.i;
        if (i == 90 || i == 270) {
            o = q;
            q = o;
        }
        float f17 = u33Var.j;
        float f18 = u33Var.k;
        float f19 = q;
        float f20 = o;
        float f21 = f;
        float f22 = (int) ((((1.0f - f17) * 0.0f) + f17) * f19);
        float f23 = f11 / f22;
        float f24 = (int) ((((1.0f - f18) * 0.0f) + f18) * f20);
        if (f23 * f24 > f14) {
            f23 = f14 / f24;
        }
        int i2 = this.d2;
        float f25 = f23;
        xc8 xc8Var = this.W4;
        if (i2 != 1 && ((this.t4 != 1 || this.n6 == 0) && xc8Var.c != null)) {
            float f26 = f22 * f25;
            float f27 = f24 * f25;
            if (f13 * f15 > f14) {
                f13 = f16;
            }
            float A = qd4.A((f12 * f13) / f21, f26, 0.0f, f26);
            float A2 = qd4.A((f15 * f13) / f21, f27, 0.0f, f27);
            canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
        }
        if (this.d2 == 1 || u33Var.a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                fo6 fo6Var2 = xc8Var.c;
                if (fo6Var2 != null && fo6Var2.l) {
                    f8 = -1.0f;
                } else {
                    f8 = 1.0f;
                }
                textureView.setScaleX(f8);
                zc8 zc8Var = this.F2;
                if (zc8Var != null) {
                    zc8Var.setScaleX(this.C2.getScaleX());
                }
            }
            fo6 fo6Var3 = xc8Var.c;
            if (fo6Var3 != null) {
                f6 = fo6Var3.c;
                f7 = 1.0f;
            } else {
                f6 = 1.0f;
                f7 = 1.0f;
            }
            float A3 = ((f25 / min) / qd4.A(f6, f7, 0.0f, f7)) * f6;
            canvas.translate(u33Var.d * f7, u33Var.e * f7);
            canvas.scale(A3, A3);
            canvas.translate(xnb.C(u33Var.b, f19, min, f7), xnb.C(u33Var.c, f20, min, f7));
            float f28 = u33Var.g + i;
            if (f28 > 180.0f) {
                f28 -= 360.0f;
            }
            canvas.rotate(f28);
        }
        if (!this.f7.isEmpty() && (fo6Var = xc8Var.c) != null && fo6Var.l) {
            f10 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f10 = 1.0f;
        }
        if (f5 > 0.0f) {
            canvas.scale(f10 - (2.0f * f5), f10);
            canvas.skew(0.0f, qd4.z(f10, f5, 4.0f * f5, 0.25f));
        }
    }

    public final int g0() {
        return h0(this.t4);
    }

    public final void g1() {
        Activity activity;
        if (!hl.F1(this.E)) {
            if (!hl.E && (Build.VERSION.SDK_INT < 24 || (activity = this.E) == null || !activity.isInMultiWindowMode())) {
                if (this.G2 != null) {
                    if (!this.P3) {
                        return;
                    }
                } else {
                    nc8 nc8Var = this.g0;
                    if (nc8Var == null || !nc8Var.y || !nc8Var.H) {
                        return;
                    }
                }
                p1();
                return;
            }
            cc4.b("PhotoViewer: onStop in multi-window mode, keep playing");
        }
    }

    public final void g2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g2(boolean, boolean):void");
    }

    public float getAnimationValue() {
        return this.k6;
    }

    public final Size h() {
        float f;
        int i;
        int round;
        int round2;
        if (this.e8 == 1) {
            return new Size(this.h8, this.i8);
        }
        int i2 = this.d8;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    f = 1920.0f;
                } else {
                    f = 1280.0f;
                }
            } else {
                f = 854.0f;
            }
        } else {
            f = 480.0f;
        }
        if (this.h8 > this.i8) {
            i = this.h8;
        } else {
            i = this.i8;
        }
        float f2 = f / i;
        if (this.d8 == this.e8 - 1 && f2 >= 1.0f) {
            round2 = this.h8;
            round = this.i8;
        } else {
            round = Math.round((this.i8 * f2) / 2.0f) << 1;
            round2 = Math.round((this.h8 * f2) / 2.0f) << 1;
        }
        int i3 = round2 % 4;
        if (i3 != 0 || round % 4 != 0) {
            round2 = (round2 - i3) - (round % 4);
        }
        return new Size(round2, round);
    }

    public final int h0(int i) {
        int L;
        int width = this.f0.getWidth();
        if (i != 1) {
            if (i == 0) {
                if (this.d2 != 1) {
                    return width;
                }
            } else if (i != 4 && i != 5 && i != 3) {
                L = hl.L(28.0f);
                return width - L;
            } else {
                return width;
            }
        }
        L = hl.L(32.0f);
        return width - L;
    }

    public final boolean h1(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.h1(android.view.MotionEvent):boolean");
    }

    public final void h2(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i;
        float f10;
        float f11;
        int i2;
        TextureView textureView;
        if (z && this.H3 && this.I3 && !this.F3 && (textureView = this.C2) != null) {
            this.N4 = textureView.getBitmap();
        }
        if (z) {
            this.f8 = this.d8;
        }
        AnimatorSet animatorSet = this.Z7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.Z7 = new AnimatorSet();
        float f12 = 0.0f;
        if (z) {
            if (this.R4) {
                this.k0.setVisibility(0);
                View view = this.k0;
                if (this.d2 == 11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                view.setAlpha(f11);
                View view2 = this.k0;
                if (this.d2 == 11) {
                    i2 = 1711276032;
                } else {
                    i2 = 2130706432;
                }
                view2.setBackgroundColor(i2);
            }
            this.T7.setTag(1);
            AnimatorSet animatorSet2 = this.Z7;
            jo0 jo0Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.V1.getEditTextHeight() + jo0Var.getHeight();
            if (this.s1) {
                i = hl.L(58.0f);
            } else {
                i = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jo0Var, property, 0.0f, editTextHeight + i);
            jo0 jo0Var2 = this.Q0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jo0Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T0, property, 0.0f, hl.L(158.0f));
            View view3 = this.k0;
            if (this.R4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f10, 1.0f));
        } else {
            this.T7.setTag(null);
            AnimatorSet animatorSet3 = this.Z7;
            gd8 gd8Var = this.T7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gd8Var, property3, 0.0f, hl.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.U7, property3, 0.0f, hl.L(166.0f));
            View view4 = this.k0;
            Property property4 = View.ALPHA;
            if (this.R4) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f));
        }
        this.Z7.addListener(new ec8(this, z, (byte) 3));
        this.Z7.setDuration(200L);
        this.Z7.setInterpolator(hl.G);
        this.Z7.start();
        float f13 = 0.25f;
        if (this.f1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f1.animate();
            if (z) {
                f6 = 0.25f;
            } else {
                f6 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f6);
            if (z) {
                f7 = 0.25f;
            } else {
                f7 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f7);
            if (z) {
                f8 = 0.0f;
            } else {
                f8 = 1.0f;
            }
            scaleY.alpha(f8).setDuration(200L);
        }
        if (this.g1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.g1.animate();
            if (z) {
                f3 = 0.25f;
            } else {
                f3 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f3);
            if (z) {
                f4 = 0.25f;
            } else {
                f4 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f4);
            if (z) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            scaleY2.alpha(f5).setDuration(200L);
        }
        if (this.h1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.h1.animate();
            if (z) {
                f2 = 0.25f;
            } else {
                f2 = 1.0f;
            }
            ViewPropertyAnimator scaleX3 = animate3.scaleX(f2);
            if (!z) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY3 = scaleX3.scaleY(f13);
            if (!z) {
                f12 = 1.0f;
            }
            scaleY3.alpha(f12).setDuration(200L);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        boolean z;
        nc8 nc8Var;
        if (this.G2 != null || ((nc8Var = this.g0) != null && nc8Var.y)) {
            if (motionEvent.getX() >= ((h0(this.t4) / 3) << 1)) {
                z = true;
            } else {
                z = false;
            }
            long l0 = l0();
            long z0 = z0();
            if (l0 != -9223372036854775807L && z0 > 15000 && (!z || z0 - l0 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final float i0(boolean z) {
        int q;
        int o;
        int i;
        ImageReceiver imageReceiver = this.B4;
        if (z) {
            q = imageReceiver.o();
            o = this.B4.q();
        } else {
            q = imageReceiver.q();
            o = this.B4.o();
        }
        if (!this.s) {
            i = hl.m;
        } else {
            i = 0;
        }
        float measuredHeight = this.D1.getMeasuredHeight() - hl.L(64.0f);
        float min = Math.min(this.D1.getMeasuredWidth(), measuredHeight - i) - (hl.L(16.0f) << 1);
        return Math.max(min / q, min / o);
    }

    public final void i1() {
        final File file;
        final r47 r47Var;
        final boolean z;
        final boolean z2;
        final boolean z3;
        boolean z4;
        boolean z5;
        if (!j()) {
            return;
        }
        r47 r47Var2 = this.S4;
        File file2 = null;
        if (r47Var2 != null) {
            if (r47Var2.t() && !this.S4.U2()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && this.S4.O3()) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean K4 = r47.K4(this.S4.k);
            if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                File file3 = new File(this.S4.k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                xb4.G(this.U);
                file2 = xb4.M(this.S4.k, false, true);
            }
            r47Var = r47Var2;
            file = file2;
            z2 = z4;
            z3 = z5;
            z = K4;
        } else {
            file = null;
            r47Var = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        if (file != null && file.exists()) {
            this.h7 = new a0(this, this.O4, new ArrayList(this.X6), this.d);
            rc8 rc8Var = new rc8();
            rc8Var.c = false;
            u2(false, true, rc8Var);
            hl.d3(new Runnable() {
                @Override
                public final void run() {
                    int intValue;
                    float f;
                    float f2;
                    y10 y10Var;
                    Drawable[] drawableArr = PhotoViewer.d9;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.getClass();
                    File file4 = file;
                    Pair L0 = hl.L0(file4);
                    int i = photoViewer.V3;
                    photoViewer.V3 = i - 1;
                    String absolutePath = file4.getAbsolutePath();
                    boolean z6 = z;
                    if (z6) {
                        intValue = 0;
                    } else {
                        intValue = ((Integer) L0.first).intValue();
                    }
                    no6 no6Var = new no6(i, absolutePath, intValue, z6, 0, 0);
                    no6Var.n(L0);
                    photoViewer.d2 = 2;
                    photoViewer.v2 = false;
                    photoViewer.d = new mc8(photoViewer, photoViewer.d, r47Var, no6Var, z2, z3);
                    photoViewer.q1.f();
                    if (photoViewer.T6 == null) {
                        photoViewer.T6 = VelocityTracker.obtain();
                    }
                    photoViewer.G7 = (byte) 3;
                    photoViewer.A2(false, false);
                    photoViewer.t2(true, false);
                    zu1 zu1Var = photoViewer.k4;
                    if (zu1Var != null && zu1Var.a0 != null && zu1Var.Y7()) {
                        photoViewer.k4.a0.U();
                    } else {
                        photoViewer.W0();
                    }
                    photoViewer.M0.setAlpha(255);
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(null, null, null, null, null, null, Collections.singletonList(no6Var), 0, null);
                    jo0 jo0Var = photoViewer.Q0;
                    float f3 = 96.0f;
                    if (photoViewer.s1) {
                        f = 154.0f;
                    } else {
                        f = 96.0f;
                    }
                    jo0Var.setTranslationY(hl.L(f));
                    di3 di3Var = photoViewer.T0;
                    if (photoViewer.s1) {
                        f2 = 154.0f;
                    } else {
                        f2 = 96.0f;
                    }
                    di3Var.setTranslationY(hl.L(f2));
                    photoViewer.G.setTranslationY(-y10Var.getHeight());
                    wc8 wc8Var = photoViewer.R1;
                    if (photoViewer.s1) {
                        f3 = 154.0f;
                    }
                    wc8Var.setTranslationY(hl.L(f3));
                    photoViewer.F();
                    photoViewer.q2();
                    photoViewer.G7 = (byte) 0;
                }
            }, rc8Var.a);
            return;
        }
        d2();
    }

    public final void i2() {
        long a;
        if (this.E != null) {
            zu1 zu1Var = this.k4;
            if (zu1Var != null) {
                a = zu1Var.a();
            } else {
                ed8 ed8Var = this.d;
                if (ed8Var != null) {
                    a = ed8Var.a();
                } else {
                    return;
                }
            }
            long j = a;
            jj.H(this.E, j, -1L, 0, false, new fa8(this), null, new gj(-1, -14342875, 520093695, -1, -115203550, 620756991, aob.w0(null, aob.Ji, false), aob.w0(null, aob.Fi, false), aob.w0(null, aob.Hi, false)), null);
        }
    }

    public final boolean j() {
        zu1 zu1Var = this.k4;
        if (zu1Var != null) {
            if (zu1Var.f == null) {
                TLRPC.Chat chat = zu1Var.e;
                if (chat != null && !xc2.r0(chat)) {
                    if (xc2.p(this.k4.e) || xc2.u(this.k4.e)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final defpackage.qh2 j0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j0():qh2");
    }

    public final void j1(ArrayList arrayList, int i, f08 f08Var) {
        m1(null, null, null, null, null, arrayList, null, i, f08Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void j2(ArrayList arrayList) {
        boolean z;
        Integer num;
        kfc kfcVar;
        r47 r47Var;
        boolean z2;
        ad8 ad8Var = this.f0;
        this.e0.softInputMode = 48;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        zu1 zu1Var = this.k4;
        if (zu1Var != null && zu1Var.a0 != null && zu1Var.getFragmentView() != null) {
            nr1 nr1Var = this.k4.a0;
            if (nr1Var.o3) {
                nr1Var.h2();
                z2 = true;
            } else {
                z2 = false;
            }
            hl.g3(this.k4.getParentActivity(), this.c);
            this.k4.getFragmentView().requestLayout();
            z = z2;
        } else {
            z = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (kfcVar = this.G2) != null && kfcVar.S() > 1500 && (r47Var = this.S4) != null && r47.K4(r47Var.k)) {
            num = Integer.valueOf((int) (this.G2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            r47 r47Var2 = (r47) arrayList.get(0);
            String K = xc2.K(uc7.s1(this.U).M0(Long.valueOf(-r47.B0(r47Var2.k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb = new StringBuilder("https://");
                qu6.u(sb, uc7.s1(this.U).N2, "/", K, "/");
                sb.append(r47Var2.e1());
                str = sb.toString();
            }
        }
        tb8 tb8Var = new tb8(this, this.E, this.k4, arrayList, str, num, ad8Var, z);
        tb8Var.w0(false);
        tb8Var.getWindow().setSoftInputMode(48);
        hl.d3(new a58(this, tb8Var, (byte) 4), 250L);
        tb8Var.show();
    }

    public final void k() {
        AnimatorSet animatorSet;
        View view = this.A2;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.A2.setAlpha(0.0f);
        }
        AnimatorSet animatorSet2 = this.B2;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.B2 = null;
        }
        k88 k88Var = this.D1;
        if (k88Var != null && (animatorSet = k88Var.s) != null) {
            animatorSet.cancel();
            k88Var.s = null;
            k88Var.f = false;
        }
    }

    public final defpackage.oec k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k0():oec");
    }

    public final void k1(TLRPC.FileLocation fileLocation, jn5 jn5Var, yc8 yc8Var) {
        m1(null, fileLocation, jn5Var, null, null, null, null, 0, yc8Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void k2(boolean z, boolean z2) {
        Integer num;
        boolean z3;
        Integer num2;
        boolean z4;
        boolean z5;
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        float f3;
        boolean z6 = true;
        Integer num3 = 1;
        k3b k3bVar = this.o5;
        int i4 = 8;
        float f4 = 0.0f;
        float f5 = 1.0f;
        if (!z2) {
            k3bVar.animate().setListener(null).cancel();
            k3b k3bVar2 = this.o5;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            k3bVar2.setVisibility(i2);
            this.o5.setAlpha(this.Q0.getAlpha());
            this.r5.animate().setListener(null).cancel();
            vl4 vl4Var = this.r5;
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            vl4Var.setVisibility(i3);
            vl4 vl4Var2 = this.r5;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            vl4Var2.setAlpha(f3);
        } else if (z) {
            if (k3bVar.getTag() == null) {
                this.o5.animate().setListener(null).cancel();
                this.r5.animate().setListener(null).cancel();
                if (this.o5.getVisibility() != 0) {
                    this.o5.setVisibility(0);
                    this.o5.animate().alpha(1.0f).start();
                    this.r5.setVisibility(0);
                    this.r5.animate().alpha(1.0f).start();
                }
            }
        } else if (k3bVar.getTag() != null) {
            this.o5.animate().setListener(null).cancel();
            this.o5.animate().alpha(0.0f).setListener(new gf4(this.o5)).start();
            this.r5.animate().setListener(null).cancel();
            this.r5.animate().alpha(0.0f).setListener(new gf4(this.r5)).start();
        }
        k3b k3bVar3 = this.o5;
        if (z) {
            num = num3;
        } else {
            num = null;
        }
        k3bVar3.setTag(num);
        if (z && this.s5.o0 != 1 && !this.A7) {
            z3 = true;
        } else {
            z3 = false;
        }
        sc8 sc8Var = this.s5;
        if (!z2) {
            sc8Var.animate().setListener(null).cancel();
            sc8 sc8Var2 = this.s5;
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            sc8Var2.setVisibility(i);
            sc8 sc8Var3 = this.s5;
            if (z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            sc8Var3.setAlpha(f2);
        } else if (z3) {
            if (sc8Var.getTag() == null) {
                this.s5.animate().setListener(null).cancel();
                if (this.s5.getVisibility() != 0) {
                    this.s5.setVisibility(0);
                }
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (sc8Var.getTag() != null) {
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new gf4(this.s5)).start();
        }
        sc8 sc8Var4 = this.s5;
        if (z3) {
            num2 = num3;
        } else {
            num2 = null;
        }
        sc8Var4.setTag(num2);
        if (z && this.s5.o0 == 1 && !this.A7) {
            z4 = true;
        } else {
            z4 = false;
        }
        g2(z4, z2);
        k3b k3bVar4 = this.o5;
        if (z && this.s5.o0 == 1 && this.x5.u0 && !this.u5.u0 && !this.v5.u0) {
            z5 = true;
        } else {
            z5 = false;
        }
        k3bVar4.setOutlineVisible(z5);
        if (!z || this.s5.o0 != 1 || this.u5.u0 || this.v5.u0) {
            z6 = false;
        }
        sc8 sc8Var5 = this.x5;
        if (!z2) {
            sc8Var5.animate().setListener(null).cancel();
            sc8 sc8Var6 = this.x5;
            if (z6) {
                i4 = 0;
            }
            sc8Var6.setVisibility(i4);
            sc8 sc8Var7 = this.x5;
            if (z6) {
                f4 = 1.0f;
            }
            sc8Var7.setAlpha(f4);
            sc8 sc8Var8 = this.x5;
            if (z6) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            sc8Var8.setScaleX(f);
            sc8 sc8Var9 = this.x5;
            if (!z6) {
                f5 = 0.8f;
            }
            sc8Var9.setScaleY(f5);
        } else if (z6) {
            if (sc8Var5.getTag() == null) {
                this.x5.animate().setListener(null).cancel();
                if (this.x5.getVisibility() != 0) {
                    this.x5.setVisibility(0);
                }
                ik8.t(this.x5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), k43.h, 400L);
            }
        } else if (sc8Var5.getTag() != null) {
            this.x5.animate().setListener(null).cancel();
            ik8.t(this.x5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new gf4(this.x5)), k43.h, 400L);
        }
        sc8 sc8Var10 = this.x5;
        if (!z6) {
            num3 = null;
        }
        sc8Var10.setTag(num3);
    }

    public final void l() {
        if (this.d2 == 11) {
            sc8 sc8Var = this.s5;
            if (sc8Var.o0 == 2) {
                sc8Var.setCutOutState(true);
                g2(true, true);
                this.o5.f();
                this.f0.invalidate();
            }
        }
    }

    public final long l0() {
        nc8 nc8Var = this.g0;
        if (nc8Var != null && nc8Var.y) {
            return nc8Var.getCurrentPosition();
        }
        kfc kfcVar = this.G2;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.S();
    }

    public final boolean l1(r47 r47Var, zu1 zu1Var, long j, long j2, long j3, yc8 yc8Var) {
        return m1(r47Var, null, null, null, null, null, null, 0, yc8Var, zu1Var, j, j2, j3, true, null, null);
    }

    public final void l2(boolean z) {
        Integer num;
        float f;
        float f2;
        nc8 nc8Var;
        Object tag = this.s3.getTag();
        if (z) {
            if (tag == null) {
                if (!this.s3.s && ((nc8Var = this.g0) == null || !nc8Var.y || nc8Var.w.isEmpty())) {
                    this.u3 = true;
                    return;
                }
            } else {
                return;
            }
        } else if (tag == null) {
            return;
        }
        AnimatorSet animatorSet = this.t3;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        zb8 zb8Var = this.s3;
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        zb8Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.t3 = animatorSet2;
        zb8 zb8Var2 = this.s3;
        Property property = View.ALPHA;
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zb8Var2, property, f);
        zb8 zb8Var3 = this.s3;
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zb8Var3, property2, f2);
        zb8 zb8Var4 = this.s3;
        Property property3 = View.SCALE_Y;
        if (!z) {
            f4 = 0.5f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zb8Var4, property3, f4);
        zb8 zb8Var5 = this.s3;
        Property property4 = View.TRANSLATION_Y;
        if (!z) {
            f3 = hl.L(12.0f);
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(zb8Var5, property4, f3));
        this.t3.setDuration(380L);
        this.t3.setInterpolator(k43.h);
        this.t3.addListener(new wb8(this, (byte) 1));
        this.t3.start();
    }

    public final void m() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            hl.r(runnable);
            this.I2 = null;
        }
    }

    public final TLObject m0(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.d7;
        if (!arrayList.isEmpty()) {
            if (i >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((oy9) arrayList.get(i)).b.size;
            }
            return (TLObject) arrayList.get(i);
        }
        ArrayList arrayList2 = this.Z6;
        if (!arrayList2.isEmpty()) {
            if (i >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.b7;
                if (arrayList3.get(i) != null) {
                    jArr[0] = ((Long) arrayList3.get(i)).longValue();
                }
            }
            ArrayList arrayList4 = this.a7;
            if (arrayList4.get(i) == null) {
                return null;
            }
            return ((jn5) arrayList4.get(i)).f;
        }
        ArrayList arrayList5 = this.X6;
        if (arrayList5.isEmpty() || i >= arrayList5.size()) {
            return null;
        }
        r47 r47Var = (r47) arrayList5.get(i);
        TLRPC.Message message = r47Var.k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
            if (w != null) {
                if (jArr != null) {
                    long j = w.size;
                    jArr[0] = j;
                    if (j == 0) {
                        jArr[0] = -1;
                    }
                }
                return w;
            } else if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = r47Var.a1;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j2 = w2.size;
                        jArr[0] = j2;
                        if (j2 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w2;
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w3 = xb4.w(photo.sizes, hl.Y0(false), false, null, true);
                    if (w3 != null) {
                        if (jArr != null) {
                            long j3 = w3.size;
                            jArr[0] = j3;
                            if (j3 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return w3;
                    } else if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && r47.n1(r47Var.k).photo != null) || ((r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var.k).webpage != null)) {
                TLRPC.PhotoSize w4 = xb4.w(r47Var.p0, hl.Y0(true), false, null, true);
                if (w4 != null) {
                    if (jArr != null) {
                        long j4 = w4.size;
                        jArr[0] = j4;
                        if (j4 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w4;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) r47.n1(r47Var.k)).photo;
            } else {
                if (r47Var.F0() != null && r47.W2(r47Var.F0())) {
                    TLRPC.PhotoSize w5 = xb4.w(r47Var.F0().thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j5 = w5.size;
                        jArr[0] = j5;
                        if (j5 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w5;
                }
            }
        }
        return null;
    }

    public final boolean m1(r47 r47Var, TLRPC.FileLocation fileLocation, jn5 jn5Var, jn5 jn5Var2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, ed8 ed8Var, zu1 zu1Var, long j, long j2, long j3, boolean z, bd8 bd8Var, Integer num) {
        TLRPC.Message message;
        ed8 ed8Var2;
        it1 it1Var;
        it1 it1Var2;
        it1 it1Var3;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        PhotoViewer photoViewer = this;
        if (photoViewer.E != null && !photoViewer.e && ((ed8Var != null || !photoViewer.p()) && (r47Var != null || fileLocation != null || arrayList != null || arrayList3 != null || arrayList2 != null || jn5Var != null || bd8Var != null))) {
            fd8 M = ed8Var.M(r47Var, fileLocation, i, true, false);
            WindowManager windowManager = (WindowManager) photoViewer.E.getSystemService("window");
            if (photoViewer.R5) {
                try {
                    windowManager.removeView(photoViewer.h0);
                    photoViewer.a1();
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = photoViewer.e0;
                layoutParams.type = 99;
                layoutParams.flags = -2147286784;
                if ((zu1Var != null && zu1Var.h != null) || ((photoViewer.y5 != 0 && uc7.s1(photoViewer.U).E2(photoViewer.y5)) || ((r47Var != null && (uc7.s1(photoViewer.U).E2(r47.B0(r47Var.k)) || ((message = r47Var.k) != null && message.noforwards))) || ((r47Var != null && r47Var.y2()) || photoViewer.M0(bd8Var))))) {
                    photoViewer.e0.flags |= 8192;
                    hl.f2();
                } else {
                    photoViewer.e0.flags &= -8193;
                    hl.f2();
                }
                photoViewer.e0.softInputMode = 272;
                photoViewer.h0.setFocusable(false);
                photoViewer.f0.setFocusable(false);
                windowManager.addView(photoViewer.h0, photoViewer.e0);
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).a1.add(photoViewer.t1);
                }
                if (Build.VERSION.SDK_INT >= 33 && (findOnBackInvokedDispatcher = photoViewer.h0.findOnBackInvokedDispatcher()) != null) {
                    findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new vo(photoViewer, (byte) 2));
                }
                photoViewer.u7 = false;
                photoViewer.v2 = false;
                photoViewer.P = true;
                photoViewer.Q = false;
                photoViewer.z3 = true;
                photoViewer.E2 = false;
                photoViewer.k4 = zu1Var;
                photoViewer.s4 = num != null;
                nb8 nb8Var = photoViewer.h1;
                if (nb8Var != null) {
                    nb8Var.setImage((Bitmap) null);
                }
                photoViewer.N.c("");
                photoViewer.N.a("", false);
                cd8 cd8Var = photoViewer.O;
                if (cd8Var != null) {
                    cd8Var.b(0, 0, false);
                    photoViewer.O.d(false, false);
                }
                photoViewer.G.setTitleScrollNonFitText(false);
                u8a u8aVar = photoViewer.H7;
                if (u8aVar != null) {
                    u8aVar.a();
                    photoViewer.H7 = null;
                }
                u8a u8aVar2 = (u8a) new ou0(jn7.f(photoViewer.U), photoViewer).b;
                u8aVar2.e(jn7.l4);
                u8aVar2.b(jn7.Z1);
                u8aVar2.b(jn7.Y1);
                u8aVar2.b(jn7.u3);
                u8aVar2.b(jn7.X1);
                u8aVar2.b(jn7.W);
                u8aVar2.b(jn7.V);
                u8aVar2.b(jn7.g3);
                u8aVar2.b(jn7.v);
                u8aVar2.b(jn7.c2);
                u8aVar2.b(jn7.b2);
                u8aVar2.b(jn7.m0);
                u8aVar2.b(jn7.y1);
                photoViewer.H7 = u8aVar2;
                photoViewer.d = ed8Var;
                photoViewer.H5 = j2;
                photoViewer.D5 = j;
                photoViewer.E5 = (zu1Var == null || (it1Var3 = zu1Var.D0) == null || !it1Var3.O) ? null : zu1Var.F3;
                photoViewer.F5 = (zu1Var == null || (it1Var2 = zu1Var.D0) == null || !it1Var2.O) ? null : zu1Var.I3;
                photoViewer.G5 = (zu1Var == null || (it1Var = zu1Var.D0) == null || !it1Var.O) ? false : true;
                photoViewer.C5 = j3;
                photoViewer.q1.f();
                photoViewer.i7 = bd8Var;
                photoViewer.p2 = null;
                if (photoViewer.T6 == null) {
                    photoViewer.T6 = VelocityTracker.obtain();
                }
                photoViewer.e = true;
                photoViewer.f = true;
                photoViewer.A2(false, false);
                photoViewer.m2 = !z;
                if (!z) {
                    photoViewer.t2(false, false);
                } else if (photoViewer.d2 == 1) {
                    photoViewer.C();
                    photoViewer.t2(false, false);
                } else {
                    photoViewer.t2(true, false);
                }
                photoViewer.h0.setClipChildren(false);
                photoViewer.k0.setVisibility(0);
                photoViewer.e3 = 0.0f;
                photoViewer.V2 = false;
                photoViewer.U2 = false;
                if (M != null) {
                    photoViewer.r4 = true;
                    photoViewer.m4 = (byte) 1;
                    if (r47Var != null) {
                        int i2 = r47Var.K1;
                        lm m = M.o ? M.a.m() : null;
                        photoViewer.k2 = m;
                        if (m != null) {
                            if (r47.K4(r47Var.k)) {
                                ImageReceiver imageReceiver = M.a;
                                imageReceiver.u0 = false;
                                imageReceiver.x0();
                                if (MediaController.z().H(r47Var)) {
                                    photoViewer.e3 = r47Var.b0;
                                }
                                photoViewer.V2 = photoViewer.S2 == null && !xb4.G(i2).T(r47Var.F0(), true) && (photoViewer.k2.s() || !xb4.G(i2).T(r47Var.F0(), false));
                                photoViewer.k2 = null;
                            } else if (r47Var.l2().size() > 1) {
                                photoViewer.k2 = null;
                            }
                        }
                    } else if (bd8Var != null) {
                        lm m2 = M.o ? M.a.m() : null;
                        photoViewer.k2 = m2;
                        if (m2 != null && bd8Var.a(i)) {
                            ImageReceiver imageReceiver2 = M.a;
                            imageReceiver2.u0 = false;
                            imageReceiver2.x0();
                            TLObject d = bd8Var.d(i);
                            TLRPC.Document document = d instanceof TLRPC.Document ? (TLRPC.Document) d : null;
                            photoViewer.V2 = photoViewer.S2 == null && document != null && !xb4.G(photoViewer.U).T(document, true) && (photoViewer.k2.s() || !xb4.G(photoViewer.U).T(document, false));
                            photoViewer.k2 = null;
                        }
                    }
                    photoViewer.d1(r47Var, fileLocation, jn5Var, jn5Var2, arrayList, arrayList2, arrayList3, i, M);
                    if (photoViewer.d2 == 1) {
                        photoViewer.D1.setVisibility(0);
                        photoViewer.D1.setAlpha(0.0f);
                        photoViewer.D1.setFreeform(false);
                    }
                    ImageReceiver imageReceiver3 = M.a;
                    RectF rectF = imageReceiver3.Q0;
                    float f = rectF.left;
                    float f2 = rectF.top;
                    int i3 = imageReceiver3.V;
                    lm m3 = imageReceiver3.m();
                    int i4 = m3 != null ? m3.d[2] : 0;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    ClippingImageView[] b0 = photoViewer.b0(M);
                    photoViewer.l6 = 1.0f;
                    for (int i5 = 0; i5 < b0.length; i5++) {
                        ClippingImageView clippingImageView = b0[i5];
                        boolean z2 = M.r;
                        clippingImageView.O = photoViewer.j4;
                        clippingImageView.L = true;
                        clippingImageView.N = z2;
                        clippingImageView.setVisibility(0);
                        b0[i5].setRadius(M.h);
                        ClippingImageView clippingImageView2 = b0[i5];
                        int i6 = M.a.W;
                        clippingImageView2.e = i3;
                        clippingImageView2.f = i6;
                        clippingImageView2.setImageBitmap(M.e);
                    }
                    photoViewer.F0();
                    if (photoViewer.d2 == 1) {
                        photoViewer.D1.setAspectRatio(1.0f);
                    }
                    ViewGroup.LayoutParams layoutParams2 = photoViewer.i0.getLayoutParams();
                    layoutParams2.width = (int) rectF.width();
                    int height = (int) rectF.height();
                    layoutParams2.height = height;
                    if (layoutParams2.width <= 0) {
                        layoutParams2.width = 100;
                    }
                    if (height <= 0) {
                        layoutParams2.height = 100;
                    }
                    for (int i7 = 0; i7 < b0.length; i7++) {
                        if (b0.length <= 1 && !M.r) {
                            b0[i7].setAlpha(1.0f);
                        } else {
                            b0[i7].setAlpha(0.0f);
                        }
                        b0[i7].setPivotX(0.0f);
                        b0[i7].setPivotY(0.0f);
                        b0[i7].setScaleX(M.k);
                        b0[i7].setScaleY(M.k);
                        b0[i7].setTranslationX((rectF.left * M.k) + M.b);
                        b0[i7].setTranslationY((rectF.top * M.k) + M.c);
                        b0[i7].setLayoutParams(layoutParams2);
                    }
                    photoViewer = this;
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new v(this, b0, layoutParams2, f, M, f2, ed8Var, arrayList3, num));
                } else {
                    if (arrayList3 != null && photoViewer.d2 != 3 && ((ed8Var2 = photoViewer.d) == null || !ed8Var2.P())) {
                        photoViewer.W0();
                    }
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(r47Var, fileLocation, jn5Var, jn5Var2, arrayList, arrayList2, arrayList3, i, M);
                    photoViewer.F0();
                    photoViewer.I1();
                    zu1 zu1Var2 = photoViewer.k4;
                    if (zu1Var2 != null) {
                        zu1Var2.i6();
                        UndoView undoView = zu1Var2.N3;
                        if (undoView != null) {
                            undoView.d(1, false);
                        }
                        photoViewer.k4.getFragmentView().invalidate();
                    }
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new x(photoViewer, ed8Var, num));
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) photoViewer.E.getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(16384);
                    obtain.getText().add(ob6.M0(2131754804, "AccDescrPhotoViewer"));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return true;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    public final void m2(boolean z, boolean z2) {
        int i;
        FrameLayout frameLayout = this.W7;
        Integer num = null;
        if (!z2) {
            frameLayout.animate().setListener(null).cancel();
            FrameLayout frameLayout2 = this.W7;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout2.setVisibility(i);
            this.X7.setTranslationY(0.0f);
            this.W7.setAlpha(this.Q0.getAlpha());
        } else if (z) {
            if (frameLayout.getTag() == null) {
                if (this.W7.getVisibility() != 0) {
                    this.W7.setVisibility(0);
                    this.W7.setAlpha(this.Q0.getAlpha());
                    this.X7.setTranslationY(hl.L(58.0f));
                }
                ObjectAnimator objectAnimator = this.F7;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.F7.cancel();
                }
                mb8 mb8Var = this.X7;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mb8Var, View.TRANSLATION_Y, mb8Var.getTranslationY(), 0.0f);
                this.F7 = ofFloat;
                ofFloat.setDuration(220L);
                this.F7.setInterpolator(k43.f);
                this.F7.start();
            }
        } else if (frameLayout.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.F7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.F7.cancel();
            }
            mb8 mb8Var2 = this.X7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mb8Var2, View.TRANSLATION_Y, mb8Var2.getTranslationY(), hl.L(58.0f));
            this.F7 = ofFloat2;
            ofFloat2.addListener(new gf4(this.W7));
            this.F7.setDuration(220L);
            this.F7.setInterpolator(k43.f);
            this.F7.start();
        }
        FrameLayout frameLayout3 = this.W7;
        if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
            this.W7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * c00.d(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout4 = this.W7;
        if (z) {
            num = 1;
        }
        frameLayout4.setTag(num);
    }

    public final void n() {
        TextureView textureView;
        if (this.a8 != -1 && (textureView = this.C2) != null) {
            this.a8 = -1L;
            this.A2.animate().alpha(1.0f).setInterpolator(k43.j).setDuration(85L).setListener(new v5(this, textureView.getBitmap(), (byte) 29)).start();
        }
    }

    public final boolean n1(ArrayList arrayList, int i, long j, long j2, long j3, ed8 ed8Var) {
        return m1((r47) arrayList.get(i), null, null, null, arrayList, null, null, i, ed8Var, null, j, j2, j3, true, null, null);
    }

    public final void n2() {
        kfc kfcVar;
        if (this.s1 && (kfcVar = this.G2) != null && !kfcVar.c0() && !T0()) {
            if (!this.r || this.d2 == 1) {
                this.G2.A0(0.0f);
            }
            this.H2 = false;
            B2();
        }
    }

    public final void o() {
        float f;
        s6 s6Var = this.B0;
        if (s6Var != null) {
            if (this.g2) {
                f = -hl.L(4.0f);
            } else {
                f = 0.0f;
            }
            s6Var.setTranslationX(f);
        }
        s7 s7Var = this.F0;
        if (s7Var != null) {
            R1(s7Var, this.g2, false);
        }
        boolean z = this.f2;
        if (z && this.J == null) {
            jl0 c = this.Z.c(this.H, null, false);
            c.p(dtd.i(this.w2));
            c.r(hl.L(20.0f));
            c.q(hl.L(7.0f));
            int L = hl.L(54.0f);
            int L2 = hl.L(54.0f);
            Matrix matrix = uk0.a;
            this.J = new tk0(L, L2, c);
        }
        ImageView imageView = this.H;
        if (z) {
            iye.a(imageView);
            this.H.setBackground(this.J);
            return;
        }
        imageView.setStateListAnimator(null);
        this.H.setBackground(this.I);
    }

    public final String o0(int i) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (!arrayList.isEmpty()) {
                if (i < arrayList.size()) {
                    oy9 oy9Var = (oy9) arrayList.get(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(oy9Var.b.dc_id);
                    sb.append("_");
                    return qu6.p(sb, oy9Var.b.id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.Z6;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.X6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f7;
                    if (!arrayList4.isEmpty()) {
                        if (i < arrayList4.size()) {
                            Object obj = arrayList4.get(i);
                            if (obj instanceof ro6) {
                                ro6 ro6Var = (ro6) obj;
                                TLRPC.PhotoSize photoSize = ro6Var.L;
                                if (photoSize != null) {
                                    return xb4.r(null, photoSize);
                                }
                                TLRPC.Document document = ro6Var.J;
                                if (document != null) {
                                    return xb4.r(null, document);
                                }
                                return Utilities.a(ro6Var.C) + "." + in5.x(ro6Var.C, "jpg");
                            } else if (obj instanceof TLRPC.BotInlineResult) {
                                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                                TLRPC.Document document2 = botInlineResult.document;
                                if (document2 != null) {
                                    return xb4.r(null, document2);
                                }
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    return xb4.r(null, xb4.w(photo.sizes, hl.Y0(false), false, null, false));
                                }
                                if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(Utilities.a(botInlineResult.content.url));
                                    sb2.append(".");
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    sb2.append(in5.x(webDocument2.url, xb4.H(webDocument2.mime_type)));
                                    return sb2.toString();
                                }
                            }
                        }
                    } else {
                        bd8 bd8Var = this.i7;
                        if (bd8Var != null) {
                            return bd8Var.c(i);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i < arrayList2.size()) {
                        jn5 jn5Var = (jn5) arrayList2.get(i);
                        jn5 jn5Var2 = (jn5) this.a7.get(i);
                        if (jn5Var != null) {
                            if (jn5Var2 != null && jn5Var2 != jn5Var) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(jn5Var2.f.volume_id);
                                sb3.append("_");
                                return uh9.l(sb3, jn5Var2.f.local_id, ".mp4");
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(jn5Var.f.volume_id);
                            sb4.append("_");
                            return uh9.l(sb4, jn5Var.f.local_id, ".jpg");
                        }
                    }
                } else if (i < arrayList3.size()) {
                    TLRPC.Message message = ((r47) arrayList3.get(i)).k;
                    Pattern pattern = xb4.J;
                    if (message != null) {
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 != null) {
                                ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                                if (arrayList5.size() > 0 && (w3 = xb4.w(arrayList5, hl.Y0(false), false, null, false)) != null) {
                                    return xb4.r(null, w3);
                                }
                                return "";
                            }
                            return "";
                        } else if (r47.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return xb4.r(null, r47.n1(message).document);
                        } else {
                            if (r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = r47.n1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w2 = xb4.w(arrayList6, hl.Y0(true), false, null, true)) != null) {
                                    return xb4.r(null, w2);
                                }
                                return "";
                            } else if (r47.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (r47.n1(message).webpage.document != null) {
                                    return xb4.r(null, r47.n1(message).webpage.document);
                                }
                                if (r47.n1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = r47.n1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w = xb4.w(arrayList7, hl.Y0(false), false, null, false)) != null) {
                                        return xb4.r(null, w);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((r47.n1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) r47.n1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + in5.x(webDocument.url, xb4.H(webDocument.mime_type));
                            } else {
                                return "";
                            }
                        }
                    }
                    return "";
                }
            }
        }
        return null;
    }

    public final void o1(ArrayList arrayList, int i, int i2, boolean z, ed8 ed8Var, zu1 zu1Var) {
        boolean z2;
        in inVar;
        int i3 = i2;
        this.i2 = z;
        di3 di3Var = this.T0;
        int i4 = 0;
        if (di3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) di3Var.getLayoutParams();
            if (i3 != 4 && i3 != 5) {
                if (i3 != 13 && i3 != 14 && i3 != 1 && i3 != 3 && i3 != 10 && i3 != 11) {
                    this.T0.setResourceId(2131232710);
                    layoutParams.bottomMargin = hl.L(1.0f);
                } else {
                    this.T0.setResourceId(2131231198);
                    this.T0.setPadding(0, hl.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = hl.L(1.0f);
                }
            } else {
                this.T0.setResourceId(2131232710);
                layoutParams.bottomMargin = hl.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i3 != 11 && this.o5 != null) {
            this.A7 = false;
            ImageView imageView = this.d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            sc8 sc8Var = this.x5;
            if (sc8Var != null) {
                sc8Var.m(false, false);
            }
            this.o5.b();
            ArrayList arrayList2 = this.q5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z3 = this.e;
        BackgroundDrawable backgroundDrawable = this.M0;
        if (z3 && this.d2 != i3 && i3 == 1) {
            this.d2 = i3;
            this.v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = ed8Var;
            this.H5 = 0L;
            this.D5 = 0L;
            this.q1.f();
            this.i7 = null;
            if (this.T6 == null) {
                this.T6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f = true;
            A2(false, false);
            this.m2 = false;
            C();
            t2(false, false);
            this.e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            W0();
            backgroundDrawable.setAlpha(255);
            this.f0.setAlpha(1.0f);
            d1(null, null, null, null, null, null, arrayList, i, null);
            F0();
            I1();
        } else if (z3 && this.d2 != i3 && i3 == 11) {
            this.d2 = i3;
            this.v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = ed8Var;
            this.H5 = 0L;
            this.D5 = 0L;
            this.q1.f();
            this.i7 = null;
            if (this.T6 == null) {
                this.T6 = VelocityTracker.obtain();
            }
            this.e = true;
            this.f = true;
            A2(false, false);
            this.e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            W0();
            backgroundDrawable.setAlpha(255);
            this.f0.setAlpha(1.0f);
            d1(null, null, null, null, null, null, arrayList, i, null);
        } else {
            this.d2 = i3;
            if (i3 == 12) {
                this.d2 = 0;
                this.e2 = true;
                i3 = 0;
            }
            if (i3 == 14) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.g2 = z2;
            if (i3 == 13 || z2) {
                this.d2 = 0;
                this.f2 = true;
            }
            this.a.a(z2, false);
            if (this.d2 == 11) {
                this.k0.setBackgroundColor(-16777216);
            }
            dd8 dd8Var = this.N;
            if (dd8Var != null && (inVar = dd8Var.d) != null) {
                if (this.f2) {
                    i4 = 8;
                }
                inVar.setVisibility(i4);
            }
            m1(null, null, null, null, null, null, arrayList, i, ed8Var, zu1Var, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void o2(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.o2(int):void");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.N6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.x1;
            if (!zArr[0] && !zArr[1]) {
                float x = motionEvent.getX();
                int min = Math.min(135, this.f0.getMeasuredWidth() / 8);
                if (x < min) {
                    if (this.A4.D()) {
                        zArr[0] = true;
                        this.f0.invalidate();
                        return false;
                    }
                } else if (x > this.f0.getMeasuredWidth() - min && this.C4.D()) {
                    zArr[1] = true;
                    this.f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.Z5 != 1.0f && this.d2 != 11) {
            this.U6.abortAnimation();
            this.U6.fling(Math.round(this.W5), Math.round(this.X5), Math.round(f), Math.round(f2), (int) this.D6, (int) this.E6, (int) this.F6, (int) this.G6);
            this.f0.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public final boolean onSingleTapUp(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final boolean p() {
        if (this.m4 != 0) {
            H0();
            if (Math.abs(this.n4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.o4;
                if (runnable != null) {
                    runnable.run();
                    this.o4 = null;
                }
                this.m4 = (byte) 0;
            }
        }
        if (this.m4 == 0) {
            return false;
        }
        return true;
    }

    public final jn5 p0(int i, long[] jArr) {
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (!arrayList.isEmpty()) {
                if (i < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((oy9) arrayList.get(i)).b.size;
                    }
                    oy9 oy9Var = (oy9) arrayList.get(i);
                    if (oy9Var == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = oy9Var;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.Z6;
                if (!arrayList2.isEmpty()) {
                    if (i < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.b7;
                            if (arrayList3.get(i) != null) {
                                jArr[0] = ((Long) arrayList3.get(i)).longValue();
                            }
                        }
                        return (jn5) this.a7.get(i);
                    }
                } else {
                    ArrayList arrayList4 = this.X6;
                    if (!arrayList4.isEmpty() && i < arrayList4.size()) {
                        r47 r47Var = (r47) arrayList4.get(i);
                        TLRPC.Message message = r47Var.k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
                                if (w != null) {
                                    if (jArr != null) {
                                        long j = w.size;
                                        jArr[0] = j;
                                        if (j == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return jn5.f(w, r47Var.n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = r47Var.a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return jn5.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w2 = xb4.w(photo.sizes, hl.Y0(false), false, null, true);
                                    if (w2 != null) {
                                        if (jArr != null) {
                                            long j2 = w2.size;
                                            jArr[0] = j2;
                                            if (j2 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return jn5.f(w2, r47Var.a1.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && r47.n1(r47Var.k).photo != null) || ((r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var.k).webpage != null)) {
                                if (r47.t3(r47Var.k)) {
                                    return jn5.b(r47Var.F0());
                                }
                                TLRPC.PhotoSize w3 = xb4.w(r47Var.p0, hl.Y0(true), false, null, true);
                                if (w3 != null) {
                                    if (jArr != null) {
                                        long j3 = w3.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return jn5.f(w3, r47Var.n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return jn5.p(jxc.c(((TLRPC.TL_messageMediaInvoice) r47.n1(r47Var.k)).webPhoto));
                            } else {
                                if (r47Var.F0() != null) {
                                    TLRPC.Document F0 = r47Var.F0();
                                    if (this.B5 == 5) {
                                        return jn5.b(F0);
                                    }
                                    if (r47.W2(r47Var.F0())) {
                                        TLRPC.PhotoSize w4 = xb4.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j4 = w4.size;
                                            jArr[0] = j4;
                                            if (j4 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return jn5.c(w4, F0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void p1() {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.f0();
            return;
        }
        nc8 nc8Var = this.g0;
        if (nc8Var != null) {
            nc8Var.e();
        }
    }

    public final void p2(int i, boolean z) {
        if (this.S4 != null) {
            w1(false);
            xb4.G(this.U).f(this.S4.F0());
        } else if (this.h5 != null) {
            TLObject d = this.i7.d(this.O4);
            if (d instanceof TLRPC.Document) {
                w1(false);
                xb4.G(this.U).f((TLRPC.Document) d);
            }
        }
        wd5 wd5Var = this.m1;
        if (wd5Var != null) {
            wd5Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        L1(z, true, false, this.O4 + i);
        if (a2(this.S4) || Z1(this.O4)) {
            this.Y2 = true;
            Y0(true);
            v(0, true);
        }
        s();
        try {
            go.b(0);
            if (lh2.t().w()) {
                lh2.t().T(j0());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void q(boolean z) {
        View view;
        float x;
        float y;
        float f;
        float f2;
        if (z) {
            ne8 ne8Var = this.w3;
            if (ne8Var != null) {
                ne8Var.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 9));
                this.w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.x3;
            if (imageView != null && !this.X8) {
                imageView.setVisibility(4);
                this.x3.setImageDrawable(null);
                Bitmap bitmap = this.C3;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.C3 = null;
                }
            }
            this.L3 = false;
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            dc8 dc8Var = this.z2;
            if (dc8Var != null) {
                int[] iArr = this.A3;
                dc8Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f0.getTranslationY());
                ImageView imageView2 = this.x3;
                Rect rect = this.t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.z2.getX());
                }
                zc8 zc8Var = this.F2;
                if (zc8Var != null) {
                    zc8Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new w98(this, (byte) 5));
                if (this.E2) {
                    x = 0.0f;
                } else {
                    x = iArr[0] - this.z2.getX();
                }
                if (this.E2) {
                    y = 0.0f;
                } else {
                    y = iArr[1] - this.z2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.x3;
                Property property3 = View.TRANSLATION_X;
                if (this.E2) {
                    f = 0.0f;
                } else {
                    f = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f));
                ImageView imageView6 = this.x3;
                Property property4 = View.TRANSLATION_Y;
                if (this.E2) {
                    f2 = 0.0f;
                } else {
                    f2 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f2));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y));
                arrayList.add(ObjectAnimator.ofInt(this.M0, sn.d, 255));
                zc8 zc8Var2 = this.F2;
                if (zc8Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(zc8Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property3, x));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property4, y));
                }
                t0(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new lk(this, view, (byte) 18));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new vb8(this, view, (byte) 1));
                animatorSet.start();
                rc8 rc8Var = new rc8();
                rc8Var.c = false;
                rc8Var.d = false;
                rc8Var.a = (short) 250;
                rc8Var.b = decelerateInterpolator;
                u2(true, true, rc8Var);
                this.G3 = (byte) 0;
            }
        }
    }

    public final void q1(boolean z) {
        b29 y;
        xc8 xc8Var = this.W4;
        ArrayList arrayList = xc8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mec mecVar = (mec) xc8Var.e.get(i);
                if (mecVar.a == 0 && (mecVar.b & 1) != 0) {
                    View view = mecVar.I;
                    if ((view instanceof de0) && (y = ((de0) view).getImageReceiver().y()) != null) {
                        if (z) {
                            y.start();
                        } else {
                            y.stop();
                        }
                    }
                }
            }
        }
    }

    public final void q2() {
        float f;
        boolean z;
        int i;
        hc8 hc8Var;
        int i2;
        hc8 hc8Var2;
        this.p6 = null;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.o0.setVisibility(8);
        this.f1.setVisibility(8);
        this.g1.setVisibility(8);
        this.h1.setVisibility(8);
        k88 k88Var = this.D1;
        if (k88Var != null) {
            k88Var.setVisibility(4);
        }
        this.p1.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setTranslationY(-hl.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.p1.setEnabled(false);
        this.L = false;
        if (this.j2) {
            this.R1.setVisibility(4);
        }
        int i3 = this.d2;
        if (i3 == 0 || i3 == 4 || ((i3 == 2 || i3 == 5) && this.f7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            D2();
        }
        f2(false, true);
        k2(false, true);
        Bitmap n = this.B4.n();
        float f2 = this.Z5;
        if (this.d2 == 11) {
            this.h6 = this.X5;
            this.g6 = this.W5;
            this.i6 = f2;
            this.j6 = this.a6;
            this.e6 = 0.0f;
        }
        xc8 xc8Var = this.W4;
        if (n != null) {
            int q = this.B4.q();
            int o = this.B4.o();
            if (this.d2 == 1) {
                float L = hl.L(12.0f);
                this.c6 = L;
                f = 0.0f;
                if (this.M1 != null) {
                    this.c6 = (hc8Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i4 = this.E1.i;
                if (i4 == 90 || i4 == 270) {
                    i2 = q;
                    q = o;
                    float f3 = q;
                    float f4 = i2;
                    this.d6 = z1(false) * (Math.min(h0(3) / f3, e0(3, false) / f4) / Math.min(h0(this.t4) / f3, f0() / f4));
                    Rect rect = this.t2;
                    this.b6 = (rect.left / 2) - (rect.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i2 = o;
                float f32 = q;
                float f42 = i2;
                this.d6 = z1(false) * (Math.min(h0(3) / f32, e0(3, false) / f42) / Math.min(h0(this.t4) / f32, f0() / f42));
                Rect rect2 = this.t2;
                this.b6 = (rect2.left / 2) - (rect2.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            } else {
                f = 0.0f;
                int i5 = -hl.L(44.0f);
                if (!this.s) {
                    i = hl.m / 2;
                } else {
                    i = 0;
                }
                float f5 = i5 + i;
                this.c6 = f5;
                if (this.M1 != null) {
                    float additionalTop = (hc8Var.getAdditionalTop() / 2.0f) + f5;
                    this.c6 = additionalTop;
                    this.c6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                fo6 fo6Var = xc8Var.c;
                if (fo6Var != null) {
                    int i6 = fo6Var.k;
                    if (i6 == 90 || i6 == 270) {
                        o = q;
                        q = o;
                    }
                    q = (int) (q * fo6Var.e);
                    i2 = (int) (o * fo6Var.f);
                    float f322 = q;
                    float f422 = i2;
                    this.d6 = z1(false) * (Math.min(h0(3) / f322, e0(3, false) / f422) / Math.min(h0(this.t4) / f322, f0() / f422));
                    Rect rect22 = this.t2;
                    this.b6 = (rect22.left / 2) - (rect22.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i2 = o;
                float f3222 = q;
                float f4222 = i2;
                this.d6 = z1(false) * (Math.min(h0(3) / f3222, e0(3, false) / f4222) / Math.min(h0(this.t4) / f3222, f0() / f4222));
                Rect rect222 = this.t2;
                this.b6 = (rect222.left / 2) - (rect222.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            }
        } else {
            f = 0.0f;
        }
        hc8 hc8Var3 = this.M1;
        if (hc8Var3 != null) {
            if (this.d2 == 11 && (xc8Var == null || xc8Var.c == null)) {
                z = true;
            } else {
                z = false;
            }
            hc8Var3.setDrawShadow(z);
        }
        this.h0.setClipChildren(true);
        this.k0.setVisibility(4);
        this.o6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(hl.L(126.0f), f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-hl.L(12.0f), f);
        ofFloat.addUpdateListener(new w98(this, (byte) 7));
        ofFloat2.addUpdateListener(new w98(this, (byte) 8));
        this.o6.playTogether(ObjectAnimator.ofFloat(this, sn.g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.o0(true);
        this.o6.setDuration(200L);
        this.o6.addListener(new wb8(this, (byte) 3));
        this.o6.start();
    }

    public final void r() {
        fd8 fd8Var = this.c5;
        if (fd8Var != null) {
            fd8Var.a.v0(true, true);
        }
        ed8 ed8Var = this.d;
        fd8 fd8Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (ed8Var != null) {
            r47 r47Var = this.S4;
            jn5 jn5Var = this.Y4;
            if (jn5Var != null) {
                tL_fileLocationToBeDeprecated = jn5Var.f;
            }
            fd8Var2 = ed8Var.M(r47Var, tL_fileLocationToBeDeprecated, this.O4, false, false);
        }
        this.c5 = fd8Var2;
        if (fd8Var2 != null && !fd8Var2.s) {
            fd8Var2.a.v0(false, true);
        }
    }

    public final int r0() {
        return this.t2.left;
    }

    public final void r1() {
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            kfcVar.g0();
            return;
        }
        nc8 nc8Var = this.g0;
        if (nc8Var != null) {
            nc8Var.f();
        }
    }

    public final void r2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.r2():void");
    }

    public final void s() {
        r47 r47Var;
        boolean z;
        int i;
        TextureView textureView;
        int i2;
        TextureView textureView2;
        r47 r47Var2;
        ArrayList arrayList = this.X6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (!isEmpty && ((r47Var = this.S4) == null || !r47Var.q4())) {
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = this.O4;
                if (i3 == 1) {
                    i4++;
                } else if (i3 == 2) {
                    i4--;
                }
                if (i4 >= 0 && i4 < arrayList.size()) {
                    r47 r47Var3 = (r47) arrayList.get(i4);
                    if (!r47.K4(r47Var3.k) && !r47Var3.d5()) {
                        imageViewArr[i3].setVisibility(4);
                    } else {
                        if (r47Var3.d5() && (r47Var2 = this.S4) != null && r47Var2.e1() == r47Var3.e1()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i = r47Var3.k.media.webpage.embed_width;
                        } else if (i3 == 0 && (textureView = this.C2) != null) {
                            i = textureView.getMeasuredWidth();
                        } else {
                            i = 0;
                        }
                        if (z) {
                            i2 = r47Var3.k.media.webpage.embed_height;
                        } else if (i3 == 0 && (textureView2 = this.C2) != null) {
                            i2 = textureView2.getMeasuredHeight();
                        } else {
                            i2 = 0;
                        }
                        TLRPC.Document F0 = r47Var3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i5);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i = documentAttribute.w;
                                    i2 = documentAttribute.h;
                                    break;
                                }
                                i5++;
                            }
                        }
                        Point point = hl.q;
                        if (point.y > point.x && i > i2) {
                            if (imageViewArr[i3].getVisibility() != 0) {
                                imageViewArr[i3].setVisibility(0);
                            }
                            if (this.K) {
                                imageViewArr[i3].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i3].getLayoutParams()).topMargin = ((this.f0.getMeasuredHeight() + ((int) (i2 / (i / this.f0.getMeasuredWidth())))) / 2) - hl.L(48.0f);
                        } else if (imageViewArr[i3].getVisibility() != 4) {
                            imageViewArr[i3].setVisibility(4);
                        }
                        AnimatorSet animatorSet = this.o6;
                        float f = this.W5;
                        if (animatorSet != null) {
                            f += (this.b6 - f) * this.k6;
                        }
                        float f2 = 0.0f;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                f2 = (f - this.E6) + ((-point.x) - hl.L(15.0f));
                            } else {
                                float f3 = this.D6;
                                if (f < f3) {
                                    f2 = f - f3;
                                }
                            }
                        }
                        imageViewArr[i3].setTranslationX((f2 + point.x) - hl.L(48.0f));
                    }
                } else {
                    imageViewArr[i3].setVisibility(4);
                }
            }
            return;
        }
        for (int i6 = 0; i6 < 3; i6++) {
            imageViewArr[i6].setVisibility(4);
        }
    }

    public final TLRPC.Document s0() {
        int i;
        if (this.W5 == 0.0f && this.X5 == 0.0f && (i = this.O4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof go6) {
                    go6 go6Var = (go6) obj;
                    if (!go6Var.v && !go6Var.w && !go6Var.u) {
                        return this.z7;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void s2() {
        AtomicInteger atomicInteger;
        long a;
        boolean m;
        j07 e;
        float f;
        int i;
        j07 e2;
        j07 e3;
        boolean z;
        if (!V0()) {
            return;
        }
        this.T8 = true;
        kfc kfcVar = this.G2;
        if (kfcVar != null) {
            if (!go.w() && !this.r) {
                z = false;
            } else {
                z = true;
            }
            kfcVar.s0(z);
        }
        if (this.G2 != null && go.w() && ((atomicInteger = go.b) == null || atomicInteger.get() <= 0)) {
            v99 e4 = go.e();
            if (e4 == null) {
                a = -1;
            } else {
                a = e4.a();
            }
            if (a >= 0 && Math.abs(this.G2.S() - a) > 1000) {
                this.G2.o0(a);
            }
            v99 e5 = go.e();
            if (e5 == null) {
                m = false;
            } else if (!go.a) {
                m = !e5.l();
            } else {
                m = e5.m();
            }
            kfc kfcVar2 = this.G2;
            if (m) {
                kfcVar2.g0();
            } else {
                kfcVar2.f0();
            }
            if (this.F != null) {
                float g = go.g();
                v99 e6 = go.e();
                float f2 = 0.5f;
                if (e6 == null || (e3 = e6.e()) == null) {
                    f = 0.5f;
                } else {
                    f = (float) e3.r;
                }
                if (Math.abs(g - f) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.F.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = audioManager.getStreamMinVolume(3);
                    } else {
                        i = 0;
                    }
                    float f3 = streamMaxVolume - i;
                    v99 e7 = go.e();
                    if (e7 != null && (e2 = e7.e()) != null) {
                        f2 = (float) e2.r;
                    }
                    int i2 = i + ((int) (f2 * f3));
                    if (i2 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i2, 1);
                    }
                }
            }
            v99 e8 = go.e();
            float f4 = 1.0f;
            if (e8 != null && (e = e8.e()) != null) {
                f4 = (float) e.d;
            }
            x(true, false, f4);
        }
        eh2 eh2Var = this.x0;
        if (eh2Var != null) {
            eh2Var.a(go.w());
        }
        this.T8 = false;
    }

    public void setAnimationValue(float f) {
        this.k6 = f;
        this.f0.invalidate();
        H0();
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        int i3;
        if (i == 0) {
            float f3 = 1.0f - f;
            this.U0.setTranslationY(hl.L(36.0f) * f3);
            this.U0.setAlpha(f);
            n85 n85Var = this.U0;
            int i4 = 8;
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            n85Var.setVisibility(i2);
            if (this.g2) {
                jo0 jo0Var = this.Q0;
                int i5 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i5 < 0) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                jo0Var.setVisibility(i3);
                this.Q0.setAlpha(f3);
                this.Q0.setTranslationY(hl.L(36.0f) * f);
                di3 di3Var = this.T0;
                if (i5 < 0) {
                    i4 = 0;
                }
                di3Var.setVisibility(i4);
                this.T0.setAlpha(f3);
                this.T0.setTranslationY(hl.L(36.0f) * f);
            }
        }
    }

    public final a69 t0(boolean z) {
        me8 me8Var;
        xl4 xl4Var;
        RectF rectF = new RectF();
        if (!z && (me8Var = this.U8) != null && (xl4Var = me8Var.e) != null) {
            xl4Var.g(rectF);
        } else {
            hb8 hb8Var = this.c9;
            xl4.k(rectF, hb8Var.U(), hb8Var.q0());
        }
        ?? obj = new Object();
        obj.a = rectF.left;
        obj.b = rectF.top;
        obj.c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final void t1(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, defpackage.po6 r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.t1(java.util.ArrayList, android.net.Uri, boolean, boolean, po6, boolean, long):void");
    }

    public final void t2(boolean z, boolean z2) {
        u2(z, z2, rc8.e);
    }

    public final void u(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.u(boolean):void");
    }

    public final RenderNode u0(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j;
        if (this.P8 == null) {
            renderNode = null;
        } else {
            renderNode = this.Q8;
            if (renderNode == null) {
                vk1.p();
                renderNode = new RenderNode("pv_s_blur_false");
                float a = tq3.a(hl.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a, a, Shader.TileMode.CLAMP));
                this.Q8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.P8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.P8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.P8.getWidth(), ceil2 / this.P8.getHeight());
                beginRecording.drawRenderNode(this.P8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        qeb qebVar = this.R8;
        qebVar.a = 0L;
        qebVar.b = false;
        for (float f : colorMatrix.getArray()) {
            qebVar.c(f);
        }
        qebVar.a(0L);
        if (qebVar.b) {
            j = -1;
        } else {
            j = qebVar.a;
        }
        RenderNode renderNode2 = (RenderNode) this.S8.f(j);
        if (renderNode2 == null) {
            vk1.p();
            RenderNode renderNode3 = new RenderNode("pv_mat_" + j + "_false");
            renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            renderNode2 = renderNode3;
        }
        if ((!renderNode2.hasDisplayList()) | renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight())) {
            renderNode2.beginRecording().drawRenderNode(renderNode);
            renderNode2.endRecording();
        }
        return renderNode2;
    }

    public final void u1() {
        k3b k3bVar = this.o5;
        if (k3bVar != null && this.d2 == 11) {
            if (this.A7) {
                k3bVar.b();
            } else {
                k3bVar.l(this.B4.n(), this.B4.V, h0(this.t4), f0(), new ea8(this, (byte) 0));
            }
        }
    }

    public final void u2(boolean r17, boolean r18, defpackage.rc8 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.u2(boolean, boolean, rc8):void");
    }

    public final void v(final int i, final boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        final boolean z4;
        final boolean z5;
        boolean z6;
        final File file;
        final m88 m88Var;
        final r47 r47Var;
        boolean z7;
        m88 m88Var2;
        File file2;
        File J;
        File J2;
        boolean z8;
        File file3;
        m88 m88Var3;
        boolean z9;
        lm lmVar;
        int i3 = this.O4;
        boolean z10 = true;
        if (i == 1) {
            i2 = i3 + 1;
        } else if (i == 2) {
            i2 = i3 - 1;
        } else {
            i2 = i3;
        }
        if (this.b5[i] != null) {
            if (i == 0 && i3 == 0 && (lmVar = this.k2) != null) {
                z2 = lmVar.s();
            } else {
                z2 = false;
            }
            File file4 = null;
            if (this.S4 != null) {
                if (i2 >= 0 && i2 < this.X6.size()) {
                    r47 r47Var2 = (r47) this.X6.get(i2);
                    z6 = a2(r47Var2);
                    if (this.B5 == 1 && !r47Var2.x()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r47Var2.k.attachPath)) {
                        file3 = new File(r47Var2.k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((r47.n1(r47Var2.k) instanceof TLRPC.TL_messageMediaWebPage) && r47.n1(r47Var2.k).webpage != null && r47.n1(r47Var2.k).webpage.document == null) {
                        m88Var3 = new m88(this, m0(i2, null), (byte) 2);
                    } else {
                        m88Var3 = new m88(this, r47Var2.k, (byte) 3);
                    }
                    if (r47.K4(r47Var2.k)) {
                        if ((xea.x0 && r47Var2.B() && !wf3.B(r47.B0(r47Var2.k))) || r47Var2.D2(true)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        file = null;
                        file4 = file3;
                        z4 = z9;
                        z3 = false;
                        m88Var = m88Var3;
                        r47Var = r47Var2;
                        z5 = true;
                    } else {
                        z3 = false;
                        file = null;
                        m88Var = m88Var3;
                        file4 = file3;
                        r47Var = r47Var2;
                        z4 = false;
                        z5 = false;
                    }
                } else {
                    this.X0[i].d(-1, z, true);
                    return;
                }
            } else {
                if (this.X4 != null) {
                    if (i2 >= 0 && i2 < this.f7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f7.get(i2);
                        if (!botInlineResult.type.equals("video") && !r47.J4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(xb4.z(3), this.b5[i]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(xb4.z(0), this.b5[i]);
                            } else {
                                z8 = false;
                                file2 = null;
                            }
                            z8 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                xb4.G(this.U);
                                file2 = xb4.I(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(xb4.z(4), Utilities.a(botInlineResult.content.url) + "." + in5.x(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z8 = true;
                        }
                        z5 = z8;
                        z4 = false;
                        z6 = false;
                        file = new File(xb4.z(4), this.b5[i]);
                    } else {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                } else {
                    if (this.Y4 != null) {
                        if (i2 >= 0 && i2 < this.a7.size()) {
                            jn5 jn5Var = (jn5) this.a7.get(i2);
                            if (jn5Var != null) {
                                xb4.G(this.U);
                                J = xb4.J(jn5Var.f, n0(jn5Var), false, true);
                                xb4.G(this.U);
                                J2 = xb4.J(jn5Var.f, n0(jn5Var), true, true);
                            } else {
                                J2 = null;
                                J = null;
                            }
                        } else {
                            this.X0[i].d(-1, z, true);
                            return;
                        }
                    } else if (this.a5 != null) {
                        if (i2 >= 0 && i2 < this.d7.size()) {
                            oy9 oy9Var = (oy9) this.d7.get(i2);
                            xb4.G(this.U);
                            J = xb4.J(oy9Var, null, true, true);
                            xb4.G(this.U);
                            J2 = xb4.J(oy9Var, null, false, true);
                        } else {
                            this.X0[i].d(-1, z, true);
                            return;
                        }
                    } else if (this.d5 != null) {
                        file2 = new File(xb4.z(3), this.b5[i]);
                        file = new File(xb4.z(4), this.b5[i]);
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    } else {
                        bd8 bd8Var = this.i7;
                        if (bd8Var != null) {
                            File b = bd8Var.b(i2);
                            if (!this.i7.a(i2) && !this.i7.e(i2)) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && xea.x0 && (this.i7.d(i2) instanceof TLRPC.Document)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z6 = Z1(i2);
                            z5 = z7;
                            file = null;
                            m88Var2 = null;
                            file4 = b;
                            z3 = false;
                            m88Var = m88Var2;
                            r47Var = m88Var2;
                        } else {
                            z3 = false;
                            z4 = false;
                            z5 = false;
                            z6 = false;
                            file = null;
                            m88Var = null;
                            r47Var = null;
                        }
                    }
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    r47Var = null;
                    file4 = J;
                    m88Var = null;
                    file = J2;
                    z3 = false;
                }
                m88Var2 = null;
                file4 = file2;
                z3 = z6;
                m88Var = m88Var2;
                r47Var = m88Var2;
            }
            if ((i == 0 && this.k5) || !z6) {
                z10 = z3;
            }
            final boolean z11 = z2;
            final File file5 = file4;
            final boolean z12 = z10;
            Utilities.e.c(new Runnable() {
                @Override
                public final void run() {
                    r47 r47Var3;
                    zu1 zu1Var;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.d9;
                    boolean z13 = z11;
                    final File file6 = file5;
                    if (!z13 && file6 != null) {
                        z13 = file6.exists();
                    }
                    File file7 = file;
                    m88 m88Var4 = m88Var;
                    File file8 = null;
                    if (file7 == null && m88Var4 != null) {
                        file7 = m88Var4.e();
                    } else if (m88Var4 != null) {
                        file8 = m88Var4.e();
                    }
                    final File file9 = file7;
                    if (!z13 && file9 != null) {
                        z13 = file9.exists();
                    }
                    if (!z13 && file8 != null) {
                        z13 = file8.exists();
                    }
                    final boolean z14 = z13;
                    final PhotoViewer photoViewer = PhotoViewer.this;
                    final int i4 = i;
                    final boolean z15 = z4;
                    if (!z14 && i4 != 0 && (r47Var3 = r47Var) != null && z15 && lq3.q(photoViewer.U).b(r47Var3.k) != 0 && (((zu1Var = photoViewer.k4) == null || zu1Var.h == null) && !r47.Q5(r47Var3.k) && (F0 = r47Var3.F0()) != null)) {
                        xb4.G(photoViewer.U).X(F0, r47Var3, 0, 10);
                    }
                    final boolean z16 = z5;
                    final boolean z17 = z12;
                    final boolean z18 = z;
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z19;
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.b5;
                            lb8[] lb8VarArr = photoViewer2.X0;
                            int i5 = i4;
                            File file10 = file6;
                            boolean z20 = z16;
                            boolean z21 = z18;
                            boolean z22 = true;
                            if ((file10 == null && file9 == null) || (!(z19 = z14) && !z15)) {
                                if (z20) {
                                    if (!xb4.G(photoViewer2.U).S(strArr[i5])) {
                                        lb8VarArr[i5].d(2, false, true);
                                    } else {
                                        lb8VarArr[i5].d(1, false, true);
                                    }
                                } else {
                                    lb8VarArr[i5].d(0, z21, true);
                                }
                                Float s = in5.z().s(strArr[i5]);
                                if (s == null) {
                                    s = Float.valueOf(0.0f);
                                }
                                lb8VarArr[i5].f(false, s.floatValue());
                            } else {
                                if (i5 != 0 || !photoViewer2.P3) {
                                    if (z20 && (!z17 || (i5 == 0 && photoViewer2.X2))) {
                                        lb8VarArr[i5].d(3, z21, true);
                                    } else {
                                        lb8VarArr[i5].d(-1, z21, true);
                                    }
                                }
                                if (i5 == 0 && !photoViewer2.p0.y()) {
                                    if (!z19) {
                                        boolean S = xb4.G(photoViewer2.U).S(strArr[i5]);
                                        s7 s7Var = photoViewer2.p0;
                                        if (!S) {
                                            s7Var.u(8);
                                        } else {
                                            s7Var.S(8);
                                        }
                                    } else {
                                        photoViewer2.p0.u(8);
                                    }
                                }
                            }
                            if (i5 == 0) {
                                if (photoViewer2.s4 || (photoViewer2.f7.isEmpty() && (strArr[0] == null || lb8VarArr[0].h == 0))) {
                                    z22 = false;
                                }
                                photoViewer2.H6 = z22;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.f7.isEmpty() && i2 >= 0 && i2 < this.f7.size()) {
            Object obj = this.f7.get(i2);
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                if (no6Var.b && (!no6Var.d() || (!no6Var.j() && this.d2 != 11))) {
                    this.X0[i].d(3, z, true);
                    return;
                }
            }
        }
        this.X0[i].d(-1, z, true);
    }

    public final void v1(String str, long j, boolean z, float f, float f2, int i, long j2) {
        boolean z2;
        int parseInt;
        if (this.C8 != null) {
            Utilities.e.a(this.C8);
            this.C8 = null;
        }
        mb8 mb8Var = this.X7;
        mb8Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mb8Var.E = mediaMetadataRetriever;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z3 = true;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        mb8Var.x = z2;
        mb8Var.d = f;
        mb8Var.e = f2;
        float f3 = mb8Var.s;
        if (f3 < f) {
            mb8Var.s = f;
        } else if (f3 > f2) {
            mb8Var.s = f2;
        }
        try {
            if (i2 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                mb8Var.y = open;
                mb8Var.E.setDataSource(open.getFileDescriptor(), j, file.length() - j);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = mb8Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                mb8Var.a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = mb8Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                mb8Var.b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = mb8Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                mb8Var.c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = mb8Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i3 = mb8Var.b;
                mb8Var.b = mb8Var.c;
                mb8Var.c = i3;
            }
            if (mb8Var.x) {
                mb8Var.f = (float) ((j2 / 1000.0d) / mb8Var.a);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        mb8Var.invalidate();
        this.D8 = null;
        if (!z && this.d2 != 1) {
            z3 = false;
        }
        this.r = z3;
        this.e8 = -1;
        this.g8 = 0;
        this.o8 = 25;
        this.z8 = new File(str).length();
        to3 to3Var = Utilities.e;
        pc8 pc8Var = new pc8(this, str, j, i);
        this.C8 = pc8Var;
        to3Var.c(pc8Var);
    }

    public final void v2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.v2():void");
    }

    public final void w(int i) {
        hfc hfcVar;
        kfc kfcVar = this.G2;
        if (kfcVar != null && kfcVar.d != null && i != kfcVar.e0) {
            kfcVar.e0 = i;
            ArrayList arrayList = kfcVar.O;
            if (arrayList != null && i >= 0 && i < arrayList.size()) {
                hfcVar = (hfc) kfcVar.O.get(i);
            } else {
                hfcVar = null;
            }
            kfcVar.v0(false, hfcVar);
        }
        if (i == -1) {
            kfc.n0(null, this.S4);
        } else {
            kfc kfcVar2 = this.G2;
            if (kfcVar2 != null) {
                kfc.n0(kfcVar2.Z(i), this.S4);
            }
        }
        N2();
        this.q0.U(null, null);
        try {
            go.b(0);
            if (lh2.t().w()) {
                lh2.t().T(j0());
            }
            kfc kfcVar3 = this.G2;
            if (kfcVar3 != null) {
                go.z(kfcVar3.c0());
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final int w0() {
        return this.t2.right;
    }

    public final void w1(boolean z) {
        this.l7 = null;
        hl.r(this.n7);
        lfc lfcVar = this.k7;
        if (lfcVar != null) {
            lfcVar.a(this.U, null);
        }
        D0();
        int i = 0;
        this.E2 = false;
        me8 me8Var = this.U8;
        if (me8Var != null && me8Var.c == 0) {
            this.U8 = null;
            me8Var.h();
        }
        kfc kfcVar = this.G2;
        HashMap hashMap = f9;
        ob8 ob8Var = this.y2;
        if (kfcVar != null) {
            m();
            hl.r(this.x2);
            hl.r(ob8Var);
            if (this.c3 != null) {
                float S = ((float) this.G2.S()) / ((float) this.G2.U());
                String str = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new hd8(S));
                r47 r47Var = this.S4;
                if (r47Var != null) {
                    r47Var.l3 = Float.valueOf(S);
                }
            }
            this.G2.l0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.g0 != null) {
            hl.r(ob8Var);
            if (this.c3 != null) {
                float l0 = ((float) l0()) / ((float) z0());
                String str2 = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new hd8(l0));
                r47 r47Var2 = this.S4;
                if (r47Var2 != null) {
                    r47Var2.l3 = Float.valueOf(l0);
                }
            }
        }
        cv3 cv3Var = this.W3;
        if (cv3Var != null) {
            cv3Var.disable();
            this.W3 = null;
        }
        this.s3.a();
        x2(false, false);
        this.s2 = false;
        this.U2 = false;
        if (this.w0.isEnabled()) {
            this.w0.setEnabled(false);
            this.w0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.h3) {
            try {
                this.E.getWindow().clearFlags(128);
                this.h3 = false;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        dc8 dc8Var = this.z2;
        if (dc8Var != null) {
            try {
                this.f0.removeView(dc8Var);
            } catch (Throwable unused) {
            }
            this.z2 = null;
        }
        k();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof kec) {
                kec kecVar = (kec) textureView;
                rf4 rf4Var = kecVar.b;
                if (rf4Var != null) {
                    rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
                }
                kecVar.a = null;
            }
            this.C2 = null;
        }
        this.c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            hl.r(this.h4);
        }
        if (!z && !this.G8 && !this.H8) {
            Y1(false, true);
        }
        lb8 lb8Var = this.X0[0];
        while (true) {
            float[] fArr = lb8Var.n;
            if (i < fArr.length) {
                lb8Var.m[i] = 1.0f;
                fArr[i] = 1.0f;
                i++;
            } else {
                lb8Var.a();
                return;
            }
        }
    }

    public final void w2(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = hl.N(24.0f);
        jo0 jo0Var = this.Q0;
        Property property = View.ALPHA;
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(jo0Var, property, f));
        jo0 jo0Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(jo0Var2, property2, f2));
        k3b k3bVar = this.o5;
        if (k3bVar != null) {
            if (z) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(k3bVar, property, f8));
        }
        if (this.o5 != null) {
            vl4 vl4Var = this.r5;
            if (z) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(vl4Var, property, f7));
        }
        di3 di3Var = this.T0;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(di3Var, property, f3));
        di3 di3Var2 = this.T0;
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(di3Var2, property2, f4));
        int i = this.d2;
        if (i == 0 || i == 4) {
            CheckBox checkBox = this.O0;
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f5));
            CheckBox checkBox2 = this.O0;
            if (z) {
                f6 = 0.0f;
            } else {
                f6 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f6));
            CounterView counterView = this.P0;
            if (!z) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f10));
            CounterView counterView2 = this.P0;
            if (!z) {
                f11 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f11));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z && K0()) {
            y(true);
            kb1 kb1Var = this.V1.f;
            if (kb1Var.e) {
                kb1Var.k(true);
            }
            kb1 kb1Var2 = this.W1.f;
            if (kb1Var2.e) {
                kb1Var2.k(true);
            }
            this.V1.f.d();
            this.W1.f.d();
        }
    }

    public final void x(boolean z, boolean z2, float f) {
        if (f != this.u1) {
            this.u1 = f;
            if (this.S4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.u1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + r47.B0(this.S4.k) + "_" + this.S4.e1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + r47.B0(this.S4.k) + "_" + this.S4.e1(), this.u1).commit();
                }
            }
            kfc kfcVar = this.G2;
            if (kfcVar != null) {
                kfcVar.u0(this.u1);
            }
            nc8 nc8Var = this.g0;
            if (nc8Var != null) {
                nc8Var.setPlaybackSpeed(this.u1);
            }
        }
        S1(true, z);
        if (z2) {
            this.q0.U(null, null);
        }
    }

    public final void x1(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.D8 != null) {
            MediaController.z().d(this.D8);
        }
        if (this.H8 && !this.E8) {
            z = true;
        } else {
            z = false;
        }
        this.H8 = false;
        this.F8 = false;
        this.V7.setVisibility(4);
        if (i == 1) {
            if (this.k8 == this.i8 && this.j8 == this.h8) {
                this.E8 = false;
                lb8 lb8Var = this.X0[0];
                if (lb8Var.h != 0 && lb8Var.k != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                lb8Var.f(z3, 0.0f);
                this.X0[0].d(3, false, true);
                if (!z) {
                    t1(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                    this.G2.o0(this.X7.getLeftProgress() * this.n8);
                } else {
                    this.F8 = true;
                }
            } else {
                w1(false);
                if (this.D8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.D5;
                    r47 r47Var = new r47(yac.t0, tL_message, false, false);
                    this.D8 = r47Var;
                    r47Var.k.attachPath = new File(xb4.z(4), "video_preview.mp4").getAbsolutePath();
                    this.D8.r0 = new oec();
                    oec oecVar = this.D8.r0;
                    oecVar.g = this.g8;
                    oecVar.h = this.h8;
                    this.D8.r0.i = this.i8;
                    oec oecVar2 = this.D8.r0;
                    oecVar2.n = this.o8;
                    Uri uri = this.V4;
                    if (uri == null) {
                        oecVar2.o = uri.getPath();
                    } else {
                        oecVar2.o = uri.getPath();
                    }
                }
                oec oecVar3 = this.D8.r0;
                long j = this.r8;
                oecVar3.a = j;
                long j2 = this.s8;
                oecVar3.b = j2;
                if (j == -1) {
                    j = 0;
                }
                if (j2 == -1) {
                    j2 = this.n8 * 1000.0f;
                }
                if (j2 - j > 5000000) {
                    oecVar3.b = j + 5000000;
                }
                oecVar3.m = this.l8;
                this.D8.r0.k = this.j8;
                this.D8.r0.l = this.k8;
                oec oecVar4 = this.D8.r0;
                oecVar4.X = true;
                oecVar4.v = this.n8 * 1000.0f;
                if (!MediaController.z().j0(this.D8, true, true, true)) {
                    this.E8 = true;
                }
                this.H8 = true;
                lb8 lb8Var2 = this.X0[0];
                if (lb8Var2.h != 0 && lb8Var2.k != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                lb8Var2.f(z2, 0.0f);
                this.X0[0].d(0, false, true);
            }
        } else {
            this.E8 = false;
            this.X0[0].d(3, false, true);
            if (i == 2) {
                t1(this.U4, this.V4, false, false, this.W4.d, false, 0L);
                this.G2.o0(this.X7.getLeftProgress() * this.n8);
            }
        }
        this.f0.invalidate();
    }

    public final void x2(boolean z, boolean z2) {
        float f;
        y98 y98Var = this.y;
        hl.r(y98Var);
        int i = 0;
        if (z2) {
            y2(z);
            AnimatorSet animatorSet = this.x;
            if (z) {
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.x = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    y2(true);
                    return;
                }
                hl.d3(y98Var, 500L);
                return;
            } else if (animatorSet != null) {
                animatorSet.cancel();
                y2(false);
                return;
            } else {
                return;
            }
        }
        AnimatorSet animatorSet2 = this.x;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.x = null;
        }
        ei1 ei1Var = this.Y0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ei1Var.setAlpha(f);
        ei1 ei1Var2 = this.Y0;
        if (!z) {
            i = 4;
        }
        ei1Var2.setVisibility(i);
    }

    public final void y(boolean z) {
        int i = this.O4;
        if (i >= 0 && i < this.f7.size() && K0()) {
            if (z) {
                c();
            }
            c0().p();
        }
    }

    public final int y0(int i) {
        vnb vnbVar = this.w2;
        if (vnbVar != null) {
            return vnbVar.h(i);
        }
        return aob.w0(null, i, false);
    }

    public final float y1() {
        return z1(true);
    }

    public final void y2(boolean z) {
        float f;
        if (z) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.x = animatorSet;
        ei1 ei1Var = this.Y0;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ei1Var, property, f));
        this.x.setDuration(200L);
        this.x.addListener(new ec8(this, z, (byte) 1));
        this.x.start();
    }

    public final void z() {
        hc8 hc8Var = this.M1;
        Activity activity = this.E;
        y98 y98Var = new y98(this, (byte) 1);
        if (hc8Var.v1) {
            hc8Var.y0(false);
        } else if (hc8Var.U1) {
            hc8Var.i0(true);
        } else if (hc8Var.D0 && hc8Var.C0 != null) {
            hc8Var.t0(null, true);
        } else if (hc8Var.p0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hc8Var.A1, activity);
            String M0 = ob6.M0(2131747005, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            idVar.S = ob6.M0(2131751370, null);
            alertDialog$Builder.j(ob6.M0(2131747307, null), new e05(y98Var, (byte) 17));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            b2(alertDialog$Builder);
        } else {
            y98Var.run();
        }
    }

    public final long z0() {
        nc8 nc8Var = this.g0;
        if (nc8Var != null && nc8Var.y) {
            return nc8Var.getVideoDuration();
        }
        kfc kfcVar = this.G2;
        if (kfcVar == null) {
            return 0L;
        }
        return kfcVar.U();
    }

    public final float z1(boolean z) {
        int i;
        if (this.d2 == 11) {
            int h0 = h0(this.t4);
            if (h0 == 0) {
                h0 = hl.q.x;
            }
            float A = c00.A(20.0f, h0, 1) / h0;
            if (z) {
                int q = this.B4.q();
                int o = this.B4.o();
                if ((q <= 1 || o <= 1) && (i = this.O4) >= 0) {
                    ArrayList arrayList = this.f7;
                    if (i < arrayList.size()) {
                        Object obj = arrayList.get(this.O4);
                        if (obj instanceof no6) {
                            no6 no6Var = (no6) obj;
                            q = no6Var.F;
                            o = no6Var.G;
                            if ((no6Var.J / 90) % 2 != 0) {
                                o = q;
                                q = o;
                            }
                        }
                    }
                }
                if (q > 1 && o > 1 && q > o) {
                    return (q / o) * A;
                }
            }
            return A;
        }
        return 1.0f;
    }

    public final void z2(boolean z) {
        float f;
        float f2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = hl.N(24.0f);
        int i = this.d2;
        if (i == 0 || i == 4) {
            CheckBox checkBox = this.O0;
            Property property = View.ALPHA;
            float f3 = 1.0f;
            float f4 = 0.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f));
            CheckBox checkBox2 = this.O0;
            Property property2 = View.TRANSLATION_Y;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f2));
            CounterView counterView = this.P0;
            if (!z) {
                f3 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f3));
            CounterView counterView2 = this.P0;
            if (!z) {
                f4 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f4));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
