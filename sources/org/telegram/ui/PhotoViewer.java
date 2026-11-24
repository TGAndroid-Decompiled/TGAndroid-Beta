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
public class PhotoViewer implements jm7, nu4, mu4, g94 {
    public static Drawable[] d9;
    public static final Paint e9 = new Paint(2);
    public static final HashMap f9 = new HashMap();
    public static DecelerateInterpolator g9;
    public static Paint h9;
    public static final Property i9;
    public static volatile PhotoViewer j9;
    public static volatile PhotoViewer k9;
    public j8 A0;
    public ucc A1;
    public View A2;
    public final int[] A3;
    public ImageReceiver A4;
    public boolean A5;
    public float A6;
    public boolean A7;
    public long A8;
    public r6 B0;
    public lx9 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public byte B5;
    public float B6;
    public boolean B7;
    public float B8;
    public r7 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public long C5;
    public float C6;
    public defpackage.f C7;
    public ab8 C8;
    public r7 D0;
    public x68 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ej0 D4;
    public long D5;
    public float D6;
    public final float[] D7;
    public k47 D8;
    public Activity E;
    public r7 E0;
    public final n43 E1;
    public boolean E2;
    public ImageView E3;
    public ej0 E4;
    public k39 E5;
    public float E6;
    public final float[] E7;
    public boolean E8;
    public ContextThemeWrapper F;
    public r7 F0;
    public n43 F1;
    public kb8 F2;
    public boolean F3;
    public ej0 F4;
    public String F5;
    public float F6;
    public ObjectAnimator F7;
    public boolean F8;
    public x20 G;
    public a8 G0;
    public n43 G1;
    public ndc G2;
    public byte G3;
    public boolean G4;
    public boolean G5;
    public float G6;
    public byte G7;
    public boolean G8;
    public ImageView H;
    public o20 H0;
    public ao6 H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public long H5;
    public boolean H6;
    public e7a H7;
    public boolean H8;
    public Drawable I;
    public qmb I0;
    public ao6 I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public int I5;
    public boolean I6;
    public float I7;
    public String I8;
    public sl0 J;
    public qmb J0;
    public n78 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public float J7;
    public final ln J8;
    public boolean K;
    public zh2 K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public final n88 K7;
    public ln[] K8;
    public boolean L;
    public final HashMap L0;
    public mx5 L1;
    public float L2;
    public boolean L3;
    public final Matrix L4;
    public boolean L5;
    public byte L6;
    public Path L7;
    public RectF L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public sa8 M1;
    public float M2;
    public boolean M3;
    public final Paint M4;
    public boolean M5;
    public byte M6;
    public Paint M7;
    public RectF M8;
    public ob8 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public Bitmap N4;
    public boolean N5;
    public boolean N6;
    public Paint N7;
    public Matrix N8;
    public nb8 O;
    public CheckBox O0;
    public ra8 O1;
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
    public jp0 Q0;
    public he Q1;
    public boolean Q2;
    public boolean Q3;
    public boolean Q4;
    public boolean Q5;
    public boolean Q6;
    public Matrix Q7;
    public RenderNode Q8;
    public v98 R;
    public FrameLayout R0;
    public hb8 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public Matrix R7;
    public final ucb R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public ndc S2;
    public long S3;
    public k47 S4;
    public boolean S5;
    public byte S6;
    public final int[] S7;
    public final vh6 S8;
    public Paint T;
    public vi3 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public VideoAds T4;
    public boolean T5;
    public VelocityTracker T6;
    public rb8 T7;
    public boolean T8;
    public int U;
    public j85 U0;
    public ta8 U1;
    public boolean U2;
    public q98 U3;
    public ArrayList U4;
    public boolean U5;
    public Scroller U6;
    public kb2 U7;
    public ad8 U8;
    public int V;
    public kb2 V0;
    public aa8 V1;
    public boolean V2;
    public int V3;
    public Uri V4;
    public float V5;
    public final ArrayList V6;
    public RadialProgressView V7;
    public float V8;
    public int W;
    public TextView W0;
    public ba8 W1;
    public boolean W2;
    public tv3 W3;
    public final ib8 W4;
    public float W5;
    public final SparseArray[] W6;
    public FrameLayout W7;
    public boolean W8;
    public float X;
    public final w98[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public TLRPC.BotInlineResult X4;
    public float X5;
    public final ArrayList X6;
    public x98 X7;
    public boolean X8;
    public g98 Y;
    public dj1 Y0;
    public ne6 Y1;
    public boolean Y2;
    public byte Y3;
    public gn5 Y4;
    public float Y5;
    public final SparseArray[] Y6;
    public TextView Y7;
    public final RectF Y8;
    public km0 Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public gn5 Z4;
    public float Z5;
    public final ArrayList Z6;
    public AnimatorSet Z7;
    public boolean Z8;
    public final fn0 a = new fn0(0, this, d53.h, 380, false);
    public g79 a0;
    public ImageView a1;
    public FrameLayout a2;
    public float a3;
    public final jc2 a4;
    public xw9 a5;
    public float a6;
    public final ArrayList a7;
    public long a8;
    public boolean a9;
    public final boolean b;
    public g79 b0;
    public ImageView b1;
    public i22 b2;
    public String b3;
    public final VideoFramesRewinder b4;
    public final String[] b5;
    public float b6;
    public final ArrayList b7;
    public long b8;
    public final n88 b9;
    public int c;
    public sm0 c0;
    public ImageView c1;
    public a26 c2;
    public String c3;
    public final ja8 c4;
    public qb8 c5;
    public float c6;
    public final ArrayList c7;
    public long c8;
    public final s98 c9;
    public pb8 d;
    public wm0 d0;
    public ImageView d1;
    public int d2;
    public long d3;
    public final v20 d4;
    public String d5;
    public float d6;
    public final ArrayList d7;
    public volatile int d8;
    public boolean e;
    public WindowManager.LayoutParams e0;
    public kc2 e1;
    public boolean e2;
    public float e3;
    public String e4;
    public long e5;
    public float e6;
    public final ArrayList e7;
    public volatile int e8;
    public boolean f;
    public lb8 f0;
    public c7 f1;
    public boolean f2;
    public boolean f3;
    public boolean f4;
    public String f5;
    public float f6;
    public final ArrayList f7;
    public int f8;
    public ya8 g0;
    public o96 g1;
    public boolean g2;
    public long g3;
    public boolean g4;
    public boolean g5;
    public float g6;
    public gn5 g7;
    public int g8;
    public int h;
    public z h0;
    public y98 h1;
    public boolean h2;
    public boolean h3;
    public final z98 h4;
    public TL_iv.PageBlock h5;
    public float h6;
    public a0 h7;
    public volatile int h8;
    public ClippingImageView i0;
    public ArrayList i1;
    public boolean i2;
    public vb8 i3;
    public final z98 i4;
    public jn5 i5;
    public float i6;
    public mb8 i7;
    public volatile int i8;
    public a6 j0;
    public ArrayList j1;
    public boolean j2;
    public String j3;
    public final float[][] j4;
    public boolean j5;
    public float j6;
    public final Rect j7;
    public volatile int j8;
    public View k0;
    public kcc k1;
    public kn k2;
    public ValueAnimator k3;
    public yv1 k4;
    public boolean k5;
    public float k6;
    public odc k7;
    public volatile int k8;
    public int l0;
    public hg5 l1;
    public boolean l2;
    public boolean l3;
    public org.telegram.ui.ActionBar.d l4;
    public boolean l5;
    public float l6;
    public Uri l7;
    public volatile int l8;
    public TextView m0;
    public td5 m1;
    public boolean m2;
    public final int[] m3;
    public byte m4;
    public boolean m5;
    public long m6;
    public long m7;
    public volatile int m8;
    public boolean n;
    public TextView n0;
    public kvb n1;
    public boolean n2;
    public final int[] n3;
    public long n4;
    public String n5;
    public int n6;
    public final n88 n7;
    public float n8;
    public TextView o0;
    public UndoView o1;
    public boolean o2;
    public lka o3;
    public Runnable o4;
    public n1b o5;
    public AnimatorSet o6;
    public a8 o7;
    public int o8;
    public r7 p0;
    public ub8 p1;
    public un5 p2;
    public ImageView p3;
    public qb8 p4;
    public wb8 p5;
    public AnimatorSet p6;
    public r86 p7;
    public volatile boolean p8;
    public r7 q0;
    public s30 q1;
    public boolean q2;
    public vdc q3;
    public qb8 q4;
    public ArrayList q5;
    public ou4 q6;
    public final po q7;
    public volatile boolean q8;
    public boolean r;
    public a8 r0;
    public ImageReceiver r1;
    public xb7 r2;
    public sb r3;
    public boolean r4;
    public yc r5;
    public boolean r6;
    public a26 r7;
    public long r8;
    public boolean s;
    public v7 s0;
    public boolean s1;
    public boolean s2;
    public ka8 s3;
    public boolean s4;
    public db8 s5;
    public final DecelerateInterpolator s6;
    public u31 s7;
    public long s8;
    public a8 t0;
    public final n88 t1;
    public final Rect t2;
    public AnimatorSet t3;
    public byte t4;
    public LinearLayout t5;
    public float t6;
    public int t7;
    public float t8;
    public a8 u0;
    public float u1;
    public boolean u2;
    public boolean u3;
    public final n88 u4;
    public db8 u5;
    public float u6;
    public boolean u7;
    public float u8;
    public j8 v0;
    public long v1;
    public boolean v2;
    public int v3;
    public byte v4;
    public db8 v5;
    public float v6;
    public CharSequence v7;
    public long v8;
    public int w;
    public a8 w0;
    public final GradientDrawable[] w1;
    public ylb w2;
    public bd8 w3;
    public String w4;
    public db8 w5;
    public float w6;
    public boolean w7;
    public long w8;
    public AnimatorSet x;
    public ai2 x0;
    public final boolean[] x1;
    public final t98 x2;
    public ImageView x3;
    public kw7 x4;
    public db8 x5;
    public float x6;
    public ValueAnimator x7;
    public long x8;
    public final n88 y;
    public LinearLayout y0;
    public final float[] y1;
    public final z98 y2;
    public final ImageView[] y3;
    public kw7 y4;
    public long y5;
    public float y6;
    public TLRPC.Document y7;
    public long y8;
    public final ArrayList z0;
    public int z1;
    public oa8 z2;
    public boolean z3;
    public kw7 z4;
    public boolean z5;
    public float z6;
    public TLRPC.Document z7;
    public long z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int g = 0;
        public final RectF a;
        public final RectF b;
        public final Paint c;
        public a18 d;
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
            a26 a26Var = photoViewer.r7;
            if (a26Var != null) {
                a26Var.b(!this.e);
            }
            a26 a26Var2 = photoViewer.c2;
            if (a26Var2 != null) {
                a26Var2.b(!this.e);
            }
            i22 i22Var = photoViewer.b2;
            if (i22Var != null) {
                boolean z2 = this.e;
                i22Var.v2.m(i22Var.i4);
                if (i22Var.r4 != z2) {
                    i22Var.r4 = z2;
                    a22 a22Var = i22Var.v2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var.d2;
                    if (a22Var == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.j1) {
                        if (z2 && !i22Var.s4) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (chatAttachAlertPhotoLayout.n && !chatAttachAlertPhotoLayout.P0) {
                            if (z) {
                                m62 m62Var = chatAttachAlertPhotoLayout.Q;
                                if (m62Var != null) {
                                    chatAttachAlertPhotoLayout.p0 = Boolean.valueOf(m62Var.isFrontface());
                                    chatAttachAlertPhotoLayout.f0(true);
                                    return;
                                }
                                return;
                            }
                            chatAttachAlertPhotoLayout.v0();
                        }
                    }
                }
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            a18 a18Var;
            qb8 qb8Var;
            Drawable[] drawableArr = PhotoViewer.d9;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.m4 != 0 && !gm.O1() && (qb8Var = photoViewer.c5) != null && qb8Var.m != null) {
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
                    rectF.inset(gm.L(1.0f), gm.L(1.0f));
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
            if (getAlpha() != 0 && (a18Var = this.d) != null) {
                gm.c3(a18Var);
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
                    gm.d3(new Runnable() {
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
            textPaint.setTextSize(gm.L(15.0f));
            textPaint.setTypeface(gm.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(gm.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f = new RectF();
            a(0);
        }

        public final void a(int i) {
            String valueOf = String.valueOf(Math.max(1, i));
            int L = gm.L(100.0f);
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
                qo qoVar = so.b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, qoVar, 0), ObjectAnimator.ofInt(textPaint, qoVar, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.h;
                if (i2 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    qo qoVar2 = so.b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, qoVar2, 0, 255), ObjectAnimator.ofInt(textPaint, qoVar2, 0, 255));
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
            float L = gm.L(14.0f) + measuredHeight;
            RectF rectF = this.f;
            rectF.set(gm.L(1.0f), measuredHeight - gm.L(14.0f), getMeasuredWidth() - gm.L(1.0f), L);
            canvas.drawRoundRect(rectF, gm.L(15.0f), gm.L(15.0f), paint);
            if (this.a != null) {
                this.b.setAlpha((int) ((1.0f - this.n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.n * gm.L(5.0f)) + gm.N(0.2f) + ((getMeasuredHeight() - this.e) / 2));
                this.a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.n * 255.0f));
                int centerX = (int) rectF.centerX();
                int B = (int) kt6.B(1.0f, this.n, gm.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(gm.L(5.0f) + centerX, B - gm.L(5.0f), centerX - gm.L(5.0f), gm.L(5.0f) + B, paint);
                canvas.drawLine(centerX - gm.L(5.0f), B - gm.L(5.0f), gm.L(5.0f) + centerX, gm.L(5.0f) + B, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i = this.h;
            if (i > 0) {
                accessibilityNodeInfo.setContentDescription(jb6.G(i, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(20.0f) + this.d, gm.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(40.0f), 1073741824));
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
            i9 = new f98();
        } else {
            i9 = new ny1(Float.class, "progress", (byte) 2);
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
        this.y = new n88(this, (byte) 18);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.a0 = new g79(0, false);
        this.z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new w98[3];
        this.t1 = new n88(this, (byte) 19);
        this.w1 = new GradientDrawable[2];
        this.x1 = new boolean[2];
        this.y1 = new float[2];
        this.E1 = new Object();
        this.F1 = new Object();
        this.G1 = new Object();
        this.X1 = -8.0f;
        this.t2 = new Rect();
        this.x2 = new t98(this);
        this.y2 = new z98(this, (byte) 0);
        this.l3 = true;
        this.m3 = new int[2];
        this.n3 = new int[2];
        this.y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.a4 = new jc2(this, (byte) 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.b4 = videoFramesRewinder;
        this.c4 = new ja8(this, videoFramesRewinder);
        this.d4 = new v20(this);
        this.h4 = new z98(this, (byte) 1);
        this.i4 = new z98(this, (byte) 2);
        this.j4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.u4 = new n88(this, (byte) 20);
        this.A4 = new ImageReceiver(null);
        this.B4 = new mm(this, (byte) 6);
        this.C4 = new ImageReceiver(null);
        this.D4 = new ej0(1, new n88(this, (byte) 21));
        this.E4 = new ej0(1, new n88(this, (byte) 21));
        this.F4 = new ej0(1, new n88(this, (byte) 21));
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
        this.n7 = new n88(this, (byte) 22);
        this.q7 = new po(new int[]{nm7.r, nm7.s, nm7.W, nm7.V, nm7.g3});
        this.D7 = new float[]{1.0f};
        this.E7 = new float[]{1.0f};
        this.K7 = new n88(this, (byte) 23);
        this.S7 = new int[2];
        this.a8 = -1L;
        this.b8 = -1L;
        this.c8 = -1L;
        this.e8 = -1;
        this.J8 = new ln(new n88(this, (byte) 21), 180L, d53.g);
        this.R8 = new Object();
        this.S8 = new vh6();
        this.Y8 = new RectF();
        this.b9 = new n88(this, (byte) 24);
        this.c9 = new s98(this);
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

    public static Bitmap E(Bitmap bitmap, ao6 ao6Var, int[] iArr, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            int i6 = ao6Var.k;
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
            Bitmap createBitmap = Bitmap.createBitmap((int) (ao6Var.e * f), (int) (ao6Var.f * f2), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z && ao6Var.l) {
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
            matrix.postRotate(ao6Var.d + i8);
            matrix.postTranslate(ao6Var.a * f, ao6Var.b * f2);
            float f3 = ao6Var.c;
            matrix.postScale(f3, f3);
            matrix.postTranslate(i4 / 2, i5 / 2);
            new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            return createBitmap;
        } catch (Throwable th) {
            fc4.g(th, true);
            return null;
        }
    }

    public static boolean N0(k47 k47Var) {
        if (j9 != null && !j9.B3 && j9.e && k47Var != null && j9.S4 != null && j9.S4.e1() == k47Var.e1() && k47.B0(j9.S4.k) == k47.B0(k47Var.k)) {
            return true;
        }
        return false;
    }

    public static boolean O0(k47 k47Var) {
        if (k9 != null && k47Var != null && k9.S4 != null && k9.S4.e1() == k47Var.e1() && k47.B0(k9.S4.k) == k47.B0(k47Var.k)) {
            return true;
        }
        return false;
    }

    public static boolean P0(k47 k47Var) {
        boolean z;
        if (j9 != null && !j9.B3 && j9.e && !j9.r4 && k47Var != null) {
            k47 k47Var2 = j9.S4;
            if (k47Var2 == null && j9.d != null) {
                k47Var2 = j9.d.W();
            }
            if (k47Var2 != null && k47Var2.e1() == k47Var.e1() && k47.B0(k47Var2.k) == k47.B0(k47Var.k)) {
                z = true;
                if (z && k9 != null) {
                    if (k9.e && !k9.r4 && k47Var != null && k9.S4 != null && k9.S4.e1() == k47Var.e1() && k47.B0(k9.S4.k) == k47.B0(k47Var.k)) {
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

    public static int T(co6 co6Var) {
        if (co6Var.d()) {
            return gm.Y0(false);
        }
        return 512;
    }

    public static String X(int i, int i2) {
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

    public static String Y(int i, int i2, int i3) {
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
        if (Build.VERSION.SDK_INT >= 31 && gda.X && gda.o() >= 2 && !gm.m0) {
            return true;
        }
        return false;
    }

    public static boolean a2(k47 k47Var) {
        if (k47Var != null && k47.K4(k47Var.k)) {
            if (k47Var.z0 || k47Var.y0 || k47Var.D2(true) || (k47Var.B() && gda.x0)) {
                boolean z = gda.a;
                if (e86.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String o0(gn5 gn5Var) {
        if (gn5Var != null && gn5Var.p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer r0() {
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

    public static CharSequence s1(k47 k47Var) {
        if (k47Var.k == null) {
            return "";
        }
        Spannable A5 = k47.A5(gw3.m(new SpannableStringBuilder(k47Var.k.translatedText.text), cmb.n2.getFontMetricsInt(), false, null, 0), k47Var.k.translatedText.entities, cmb.n2.getFontMetricsInt(), false);
        if (k47.M(A5)) {
            try {
                gm.c(A5, 5, false, true);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        k47.h(k47Var.O3(), A5, true, 0, 0, true);
        k47.b(A5, k47Var.k.translatedText.entities, k47Var.O3(), true, true, true, 0);
        if (k47.K4(k47Var.k)) {
            k47.h(k47Var.O3(), A5, true, 3, (int) k47Var.L0(), false);
        } else if (k47Var.I3() || k47.Q4(k47Var.k)) {
            k47.h(k47Var.O3(), A5, true, 4, (int) k47Var.L0(), false);
        }
        return A5;
    }

    public static String x0() {
        File z = bc4.z(4);
        return new File(z, gda.p() + "_temp.jpg").getAbsolutePath();
    }

    public final void A(boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A(boolean, boolean):void");
    }

    public final int A0() {
        int measuredHeight;
        int g0 = g0();
        lb8 lb8Var = this.f0;
        if (lb8Var != null && (measuredHeight = lb8Var.getMeasuredHeight()) > 0) {
            return Math.min(g0, measuredHeight);
        }
        return g0;
    }

    public final void A1() {
        if (!J0()) {
            k47 k47Var = this.S4;
            if (k47Var == null || !k47Var.q4()) {
                z98 z98Var = this.y2;
                gm.r(z98Var);
                gm.d3(z98Var, 3000L);
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
                ub8 ub8Var = this.p1;
                Property property = View.ALPHA;
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ub8Var, property, f3));
                ub8 ub8Var2 = this.p1;
                Property property2 = View.TRANSLATION_Y;
                if (z) {
                    f4 = 0.0f;
                } else {
                    f4 = -gm.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(ub8Var2, property2, f4));
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
                    this.C1.addListener(new ha8(this, (byte) 4));
                }
                this.C1.setDuration(200L);
                this.C1.start();
                return;
            }
            ub8 ub8Var3 = this.p1;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ub8Var3.setAlpha(f);
            ub8 ub8Var4 = this.p1;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -gm.L(10.0f);
            }
            ub8Var4.setTranslationY(f2);
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
        ad8 ad8Var = this.U8;
        if (z) {
            ad8Var.a(new bn0((byte) 20));
            gm.c3(new n88(this, (byte) 8));
            return;
        }
        ad8Var.a(new t88(this, (byte) 1));
    }

    public final boolean B0() {
        if (b0(true) != 0) {
            return true;
        }
        return false;
    }

    public final void B1(long j) {
        p09 y;
        ib8 ib8Var = this.W4;
        ArrayList arrayList = ib8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pcc pccVar = (pcc) ib8Var.e.get(i);
                if (pccVar.a == 0 && (pccVar.b & 1) != 0) {
                    View view = pccVar.I;
                    if ((view instanceof bf0) && (y = ((bf0) view).getImageReceiver().y()) != null) {
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
        ndc ndcVar;
        ndc ndcVar2;
        if (this.G2 == null) {
            ya8 ya8Var = this.g0;
            if (ya8Var != null && ya8Var.y) {
                z = ya8Var.H;
            } else {
                return;
            }
        } else {
            z = this.P3;
        }
        m();
        gm.r(this.y2);
        if (z) {
            p1();
        } else {
            if (this.s1) {
                if (Math.abs(this.X7.getProgress() - this.X7.getRightProgress()) < 0.01f || ((ndcVar2 = this.G2) != null && ndcVar2.S() == this.G2.U())) {
                    D1(this.X7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.q3.c() - this.X7.getRightProgress()) < 0.01f || ((ndcVar = this.G2) != null && ndcVar.S() == this.G2.U())) {
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
        x68 x68Var = new x68(this.F, this.w2);
        this.D1 = x68Var;
        x68Var.setVisibility(8);
        this.D1.a();
        this.f0.addView(this.D1, this.f0.indexOfChild(this.W7) - 1, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new e98(this));
    }

    public final void C1(long j) {
        ya8 ya8Var = this.g0;
        if (ya8Var != null && ya8Var.y) {
            ya8Var.i(j);
        } else {
            ndc ndcVar = this.G2;
            if (ndcVar != null) {
                ndcVar.o0(j);
            }
        }
        Q2();
    }

    public final void C2() {
        View view = this.T3;
        if (view != null) {
            w98 w98Var = this.X0[0];
            int i = w98Var.h;
            if (w98Var.p && (i == 3 || i == 4 || i == 2 || i == 1)) {
                if (i == 3) {
                    view.setContentDescription(jb6.M0(2131754929, "AccActionPlay"));
                } else if (i == 2) {
                    view.setContentDescription(jb6.M0(2131754938, "AccActionDownload"));
                } else if (i == 1) {
                    view.setContentDescription(jb6.M0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(jb6.M0(2131754930, "AccActionPause"));
                }
                this.T3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        int i3;
        if (i == 0) {
            float f3 = 1.0f - f;
            this.U0.setTranslationY(gm.L(36.0f) * f3);
            this.U0.setAlpha(f);
            j85 j85Var = this.U0;
            int i4 = 8;
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            j85Var.setVisibility(i2);
            if (this.g2) {
                jp0 jp0Var = this.Q0;
                int i5 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                if (i5 < 0) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                jp0Var.setVisibility(i3);
                this.Q0.setAlpha(f3);
                this.Q0.setTranslationY(gm.L(36.0f) * f);
                vi3 vi3Var = this.T0;
                if (i5 < 0) {
                    i4 = 0;
                }
                vi3Var.setVisibility(i4);
                this.T0.setAlpha(f3);
                this.T0.setTranslationY(gm.L(36.0f) * f);
            }
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
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.o0(f * ((float) ndcVar.U()));
            return;
        }
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.i(f * ya8Var.getVideoDuration());
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
                f = Math.max(f, gm.L(48.0f));
            }
            CounterView counterView = this.P0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f = Math.max(f, gm.L(100.0f));
            }
            ob8 ob8Var = this.N;
            ValueAnimator valueAnimator = ob8Var.n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ob8Var.n = null;
            }
            ob8Var.r = f;
            ob8Var.c[0].setRightPadding((int) f);
            ob8Var.d.setRightPadding(f);
        }
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
        SharedPreferences d1 = oc7.d1();
        int i2 = this.e8;
        while (i2 < 5) {
            Locale locale = Locale.US;
            int i3 = d1.getInt("compress_video_" + i2, -1);
            if (i3 >= 0) {
                return Math.min(i3, 2);
            }
            i2++;
        }
        er3 q = er3.q(this.U);
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
        } else if (obj instanceof jo6) {
            charSequence = ((jo6) obj).a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof no6)) {
            charSequence = ((no6) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            d0().setText("");
        } else {
            d0().setText(gn.cloneSpans(charSequence, 3));
        }
        qu3 editText = d0().f.getEditText();
        yv1 yv1Var = this.k4;
        if (yv1Var != null && ((encryptedChat = yv1Var.h) == null || gm.W0(encryptedChat.layer) >= 101)) {
            z = true;
        } else {
            z = false;
        }
        editText.setAllowTextEntitiesIntersection(z);
    }

    public final void F() {
        ao6 ao6Var;
        int width;
        int width2;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            ao6Var = new ao6();
            ao6Var.k = this.E1.i;
        } else {
            ao6Var = this.W4.c;
        }
        ao6 ao6Var2 = ao6Var;
        int q = this.B4.q();
        int o = this.B4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q, o, config);
        n1b n1bVar = this.o5;
        if (n1bVar != null && n1bVar.getSourceBitmap() != null) {
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
            RectF rectF = gm.P;
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
            RectF rectF2 = gm.P;
            rectF2.set(((-n.getWidth()) / 2.0f) * f2, ((-n.getHeight()) / 2.0f) * f2, (n.getWidth() / 2.0f) * f2, (n.getHeight() / 2.0f) * f2);
            canvas2.drawBitmap(n, (Rect) null, rectF2, new Paint(3));
        }
        ra8 ra8Var = new ra8(this, this.E, this.U, createBitmap2, createBitmap, this.B4.V, ao6Var2);
        this.O1 = ra8Var;
        ra8Var.s.setOnClickListener(new m88(this, (byte) 5));
        this.O1.w.setOnClickListener(new m88(this, (byte) 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f0.indexOfChild(this.t5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f0.getChildCount();
        }
        this.f0.addView(this.O1, indexOfChild, qoe.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void F0() {
        x68 x68Var = this.D1;
        if (x68Var != null) {
            x68Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.b.a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            u43 u43Var = this.D1.b;
            u43Var.q();
            CropAreaView cropAreaView2 = u43Var.a;
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
        rcc rccVar;
        String str;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        ao6 ao6Var;
        ao6 ao6Var2;
        TLRPC.Chat chat;
        int i3;
        yv1 yv1Var;
        un5 un5Var;
        String str2;
        long j;
        String M0;
        TextureView textureView;
        if (!K0() && this.d != null && !this.v2) {
            if (this.d2 == 1) {
                if (!z4 && (un5Var = this.p2) != null) {
                    TLObject tLObject = un5Var.a;
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
                    int L = gm.L(8.0f);
                    he heVar = alertDialog$Builder.a;
                    heVar.W0 = L;
                    Context context = this.f0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.b = imageReceiver2;
                    pc0 pc0Var = new pc0((ylb) null);
                    view.e = new Path();
                    pc0Var.q(z8c.h(z8c.t0).f());
                    imageReceiver.U(z8c.h(z8c.t0).f(), pc0Var, null);
                    imageReceiver2.U(z8c.h(z8c.t0).f(), pc0Var, null);
                    Drawable drawable = context.getDrawable(2131232062);
                    view.f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.p2.a;
                    lb8 lb8Var = this.f0;
                    x68 x68Var = this.D1;
                    pc0Var.k(tLObject2);
                    imageReceiver.U(tLObject2, pc0Var, null);
                    view.c = lb8Var;
                    view.d = x68Var;
                    heVar.W = view;
                    if (this.p2.c == 1) {
                        if (z8c.h(this.U).n == j) {
                            heVar.U = gm.S2(jb6.M0(2131745233, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            heVar.U = gm.S2(jb6.a0(null, null, 2131745234, str2, str2));
                        }
                        if (this.H4) {
                            M0 = jb6.M0(2131745231, "SetVideo");
                        } else {
                            M0 = jb6.M0(2131745253, "SetPhoto");
                        }
                    } else {
                        if (this.H4) {
                            heVar.U = gm.S2(jb6.a0(null, null, 2131744081, str2));
                        } else {
                            heVar.U = gm.S2(jb6.a0(null, null, 2131744092, str2));
                        }
                        M0 = jb6.M0(2131744090, "SuggestPhotoShort");
                    }
                    String str4 = M0;
                    alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), new bh7((byte) 29));
                    alertDialog$Builder.j(str4, new ee() {
                        @Override
                        public final void r(he heVar2, int i4) {
                            Drawable[] drawableArr = PhotoViewer.d9;
                            PhotoViewer.this.F1(z, i, i2, z2, z3, true);
                        }
                    });
                    heVar.J = cmb.fh;
                    heVar.U0 = true;
                    heVar.j(on2.p(-15461356, 204));
                    heVar.show();
                    heVar.o(cmb.w0(null, cmb.dh, false));
                    heVar.setOnDismissListener(new kg3(this, (byte) 1));
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
                            fc4.g(th, true);
                            return;
                        }
                    }
                    return;
                }
                e();
            }
            if (!z2 && (yv1Var = this.k4) != null) {
                TLRPC.Chat chat2 = yv1Var.e;
                if (yv1Var.h() != null || ((sd2.T(chat2) && chat2.megagroup) || !sd2.T(chat2))) {
                    oc7.r1(this.U).W3.edit().putBoolean("silent_" + this.k4.a(), !z).commit();
                }
            }
            rcc l0 = l0();
            ArrayList arrayList = this.f7;
            if (!arrayList.isEmpty() && (i3 = this.O4) >= 0 && i3 < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof co6) {
                    ((co6) obj).s = l0;
                }
            }
            yv1 yv1Var2 = this.k4;
            if (yv1Var2 != null && (chat = yv1Var2.e) != null && this.d2 != 11) {
                if (!this.s1 && l0 == null) {
                    if (!sd2.p(chat)) {
                        mlb.y(null, 2131749316, new c41(this.f0, this.w2), null);
                        return;
                    }
                } else if (!sd2.u(chat)) {
                    mlb.y(null, 2131749312, new c41(this.f0, this.w2), null);
                    return;
                }
            }
            this.v2 = true;
            if (l0 != null) {
                long j3 = ((float) l0.q) * 0.9f;
                if ((j3 > 2097152000 && !z8c.h(this.U).p()) || j3 > 4194304000L) {
                    if (this.b2 != null) {
                        i22 i22Var = this.b2;
                        new i46(6, z8c.t0, null, i22Var.c.getContext(), i22Var.Z1).show();
                        return;
                    }
                    return;
                }
            }
            if (!z2) {
                if (this.d2 == 11) {
                    Object obj2 = arrayList.get(this.O4);
                    if (obj2 instanceof jo6) {
                        jo6 jo6Var = (jo6) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int i0 = i0(this.t4);
                        g0();
                        float L2 = i0 - gm.L(20.0f);
                        n1b n1bVar = this.o5;
                        if (n1bVar != null && n1bVar.j0 && n1bVar.getSourceBitmap() != null) {
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
                                f6 = gm.R1(0.0f, this.f6, this.k6);
                                c = 5;
                                f2 = gm.R1(this.Z5, this.d6, this.k6);
                                f3 = gm.R1(this.a6, this.e6, this.k6);
                                f4 = gm.R1(this.X5, this.c6, this.k6);
                                f5 = gm.R1(this.W5, this.b6, this.k6);
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
                            int i02 = i0(this.t4);
                            int g0 = g0();
                            matrix.preTranslate(f5, f4 + 0.0f);
                            matrix.preScale(f2, f2);
                            matrix.preRotate(f3);
                            int q = this.B4.q();
                            int o = this.B4.o();
                            float f11 = i02;
                            float f12 = g0;
                            float min = Math.min(f11 / q, f12 / o);
                            n43 n43Var = this.E1;
                            int i4 = n43Var.i;
                            if (i4 == 90 || i4 == 270) {
                                o = q;
                                q = o;
                            }
                            float f13 = n43Var.j;
                            float f14 = n43Var.k;
                            float f15 = q;
                            float f16 = o;
                            float f17 = f11 / ((int) ((((1.0f - f13) * 0.0f) + f13) * f15));
                            float f18 = (int) ((((1.0f - f14) * 0.0f) + f14) * f16);
                            if (f17 * f18 > f12) {
                                f17 = f12 / f18;
                            }
                            int i5 = this.d2;
                            ib8 ib8Var = this.W4;
                            if (i5 == 1 || n43Var.a) {
                                TextureView textureView2 = this.C2;
                                if (textureView2 != null) {
                                    ao6 ao6Var3 = ib8Var.c;
                                    if (ao6Var3 != null && ao6Var3.l) {
                                        f8 = -1.0f;
                                    } else {
                                        f8 = 1.0f;
                                    }
                                    textureView2.setScaleX(f8);
                                    kb8 kb8Var = this.F2;
                                    if (kb8Var != null) {
                                        kb8Var.setScaleX(this.C2.getScaleX());
                                    }
                                }
                                ao6 ao6Var4 = ib8Var.c;
                                if (ao6Var4 != null) {
                                    f7 = ao6Var4.c;
                                } else {
                                    f7 = 1.0f;
                                }
                                float A = ((f17 / min) / td4.A(f7, 1.0f, 0.0f, 1.0f)) * f7;
                                matrix.preTranslate(n43Var.d * 1.0f, n43Var.e * 1.0f);
                                matrix.preScale(A, A);
                                matrix.preTranslate(mlb.C(n43Var.b, f15, min, 1.0f), mlb.C(n43Var.c, f16, min, 1.0f));
                                float f19 = n43Var.g + i4;
                                if (f19 > 180.0f) {
                                    f19 -= 360.0f;
                                }
                                matrix.preRotate(f19);
                            }
                            if (!arrayList.isEmpty() && (ao6Var2 = ib8Var.c) != null && ao6Var2.l) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f6 > 0.0f) {
                                matrix.preScale(1.0f - (f6 * f), 1.0f);
                                matrix.preSkew(0.0f, td4.z(1.0f, f6, 4.0f * f6, 0.25f));
                            }
                            ImageReceiver imageReceiver4 = this.B4;
                            matrix.preTranslate((-imageReceiver4.N0) / f, (-imageReceiver4.O0) / f);
                            ImageReceiver imageReceiver5 = this.B4;
                            matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = jo6Var.p;
                            int size = arrayList3.size();
                            int i6 = 0;
                            String str5 = null;
                            while (i6 < size) {
                                Object obj3 = arrayList3.get(i6);
                                i6++;
                                pcc a = ((pcc) obj3).a();
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
                                if (jo6Var.w && (ao6Var = jo6Var.A) != null) {
                                    a.e = (float) (a.e - ((ao6Var.k / 180.0f) * 3.141592653589793d));
                                }
                                a.e = (float) (a.e - ((this.a6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a);
                                TLRPC.Document document = a.B;
                                if (document != null && str5 == null) {
                                    str5 = k47.V(document, null, null);
                                }
                                arrayList3 = arrayList4;
                                matrix = matrix2;
                                size = i7;
                            }
                            rcc rccVar2 = new rcc();
                            rccVar2.I = true;
                            rccVar2.k = 512;
                            rccVar2.h = 512;
                            rccVar2.l = 512;
                            rccVar2.i = 512;
                            rccVar2.G = arrayList2;
                            long k = Utilities.k(jo6Var.t, 2999L, 800L);
                            rccVar2.r = k;
                            rccVar2.v = k;
                            rccVar2.m = 200000;
                            rccVar2.n = 30;
                            z5 = true;
                            rccVar2.N = true;
                            rccVar2.q = 262144L;
                            rccVar = rccVar2;
                            str = str5;
                        } else {
                            z5 = true;
                            rccVar = null;
                            str = null;
                        }
                        TLRPC.PhotoSize V = fn5.V(createBitmap, Bitmap.CompressFormat.WEBP, 512.0f, 512.0f, 100);
                        bc4.G(z8c.t0);
                        String file = bc4.J(V, "webp", z5, z5).toString();
                        if (rccVar != null) {
                            rccVar.o = file;
                        }
                        ArrayList arrayList5 = this.q5;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            this.q5 = arrayList5;
                        }
                        if (arrayList5.isEmpty()) {
                            String str6 = this.o5.d0;
                            if (str6 != null && gw3.g(str6) != null) {
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
                        hx2 e = hx2.e();
                        n1b n1bVar2 = this.o5;
                        ArrayList arrayList7 = this.q5;
                        da8 da8Var = new da8(this, file, rccVar, jo6Var, z, i, i2, z3);
                        dx2 dx2Var = e.U;
                        Activity W = gm.W(n1bVar2.getContext());
                        if (W != null) {
                            e.l(W);
                            e.k(da8Var);
                            ?? obj4 = new Object();
                            obj4.a = file;
                            obj4.g = rccVar;
                            e.o = arrayList7;
                            e.i(null, obj4, null, null, null, 3, false, null, new r63(), 0);
                            gm.r(dx2Var);
                            gm.d3(dx2Var, 16L);
                            return;
                        }
                        return;
                    }
                }
                b = 5;
                this.d.M(this.O4, l0, z, i, i2, z3);
            } else {
                b = 5;
                this.d.c(l0);
            }
            if (this.P) {
                if (this.Q) {
                    gm.d3(new b98(this, b), 200L);
                } else {
                    A(false, false);
                }
            }
        }
    }

    public final void F2() {
        int i;
        k47 k47Var;
        TLRPC.Message message;
        ArrayList arrayList = this.X6;
        if (!arrayList.isEmpty() && (i = this.P4) >= 0 && i < arrayList.size() && (k47Var = (k47) arrayList.get(this.P4)) != null) {
            if (this.m5 && (message = k47Var.k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, s1c.G0())) {
                J1(k47Var, s1(k47Var), false, true);
            } else {
                J1(k47Var, k47Var.z, this.m5, true);
            }
        }
    }

    public final void G() {
        int q;
        int o;
        ao6 ao6Var;
        Bitmap n;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                ncc nccVar = (ncc) textureView;
                q = nccVar.getVideoWidth();
                o = nccVar.getVideoHeight();
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
            ib8 ib8Var = this.W4;
            boolean z = true;
            if (i == 1) {
                ao6Var = new ao6();
                ao6Var.k = this.E1.i;
            } else {
                ao6Var = ib8Var.c;
            }
            ao6 ao6Var2 = ao6Var;
            mx5 mx5Var = new mx5(this.h0, false, new t88(this, (byte) 3));
            mx5Var.f = true;
            mx5Var.g = true;
            this.L1 = mx5Var;
            if (this.t4 == 3) {
                z = false;
            }
            mx5Var.b(z);
            Activity activity = this.E;
            int i2 = this.U;
            if (this.s1) {
                n = null;
            } else {
                n = this.B4.n();
            }
            sa8 sa8Var = new sa8(this, activity, activity, i2, bitmap2, n, this.B4.V, ib8Var.e, ao6Var2, new n88(this, (byte) 10), this.w2);
            this.M1 = sa8Var;
            im0 c = this.Z.c(sa8Var.S0, null, false);
            c.p(qqd.i(this.w2));
            sa8Var.setBlurredBackgroundDrawableForTools(c);
            this.f0.addView(this.M1.getView(), qoe.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new n88(this, (byte) 11));
            this.M1.getCancelView().setOnClickListener(new m88(this, (byte) 9));
            this.M1.v0(gm.L(126.0f));
            this.M1.setOffsetTranslationX(-gm.L(12.0f));
        }
    }

    public final void G0(int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.G0(int):void");
    }

    public final void G1(un5 un5Var) {
        String str;
        int i;
        TLRPC.User user;
        this.p2 = un5Var;
        if (this.d2 == 1) {
            if (T2()) {
                this.o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.o0.setVisibility(8);
            }
            if (un5Var != null && (user = un5Var.b) != null && un5Var.c == 1 && this.p2.d) {
                boolean z = un5Var.e;
                x68 x68Var = this.D1;
                String str2 = user.first_name;
                if (z) {
                    x68Var.setSubtitle(jb6.a0(null, null, 2131745246, str2));
                } else {
                    x68Var.setSubtitle(jb6.a0(null, null, 2131745247, str2));
                }
            } else {
                this.D1.setSubtitle(null);
            }
        }
        if (un5Var != null) {
            if (un5Var.c == 2) {
                if (un5Var.e) {
                    str = "SuggestVideo";
                    i = 2131744082;
                } else {
                    str = "SuggestPhoto";
                    i = 2131744093;
                }
                X1(jb6.M0(i, str));
            }
            if (un5Var.e) {
                this.Y7.setText(jb6.M0(2131745269, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void G2() {
        int i = cmb.pg;
        int y0 = y0(i);
        vi3 vi3Var = this.T0;
        if (vi3Var != null) {
            vi3Var.k();
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
        kb2 kb2Var = this.V0;
        if (kb2Var != null) {
            ((TextView) kb2Var.b).setTextColor(y0);
        }
        kb2 kb2Var2 = this.U7;
        if (kb2Var2 != null) {
            ((TextView) kb2Var2.b).setTextColor(y0);
        }
        sa8 sa8Var = this.M1;
        if (sa8Var != null) {
            sa8Var.updateColors();
        }
        n78 n78Var = this.J1;
        if (n78Var != null) {
            ImageView imageView6 = n78Var.C0;
            ImageView imageView7 = n78Var.B0;
            ImageView imageView8 = n78Var.A0;
            ylb ylbVar = n78Var.J0;
            TextView textView = n78Var.h0;
            if (textView != null) {
                textView.setTextColor(cmb.v0(i, ylbVar));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), mode));
            }
            n78Var.i();
        }
        aa8 aa8Var = this.V1;
        if (aa8Var != null) {
            aa8Var.H(this.w2);
        }
        ba8 ba8Var = this.W1;
        if (ba8Var != null) {
            ba8Var.H(this.w2);
        }
        x98 x98Var = this.X7;
        if (x98Var != null) {
            x98Var.invalidate();
        }
        ub8 ub8Var = this.p1;
        if (ub8Var != null) {
            int childCount = ub8Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.p1.getChildAt(i2);
                if (childAt instanceof a88) {
                    ((a88) childAt).c.b(cmb.V9, cmb.W9, cmb.U9);
                }
            }
        }
        q98 q98Var = this.U3;
        if (q98Var != null) {
            q98Var.R0(true);
        }
    }

    public final void H() {
        vb8 vb8Var = new vb8(this.f0.getContext(), this);
        this.i3 = vb8Var;
        this.f0.addView(vb8Var, qoe.e(-1, 48, 83));
        k44 k44Var = new k44(this, (byte) 26);
        ia8 ia8Var = new ia8(this, k44Var);
        sb sbVar = new sb((byte) 26, this.f0.getContext(), this);
        this.r3 = sbVar;
        sbVar.setAccessibilityDelegate(ia8Var);
        this.r3.setImportantForAccessibility(1);
        this.i3.addView(this.r3, qoe.c(-1.0f, -1));
        vdc vdcVar = new vdc(this.r3);
        this.q3 = vdcVar;
        vdcVar.z = gm.L(2.0f);
        vdc vdcVar2 = this.q3;
        vdcVar2.k = 872415231;
        vdcVar2.l = 872415231;
        vdcVar2.m = -1;
        vdcVar2.n = -1;
        vdcVar2.A = 1509949439;
        vdcVar2.j = k44Var;
        ka8 ka8Var = new ka8(this, this.f0.getContext(), new u88(this));
        this.s3 = ka8Var;
        ka8Var.setAlpha(0.0f);
        this.f0.addView(this.s3, qoe.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        lka lkaVar = new lka(this.f0.getContext());
        this.o3 = lkaVar;
        lkaVar.setTextColor(-1);
        this.o3.setGravity(53);
        this.o3.setTextSize(14);
        this.o3.setImportantForAccessibility(2);
        this.i3.addView(this.o3, qoe.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f0.getContext());
        this.p3 = imageView;
        imageView.setImageResource(2131232258);
        this.p3.setContentDescription(jb6.M0(2131754723, "AccExitFullscreen"));
        this.p3.setScaleType(ImageView.ScaleType.CENTER);
        this.p3.setBackground(cmb.f0(1090519039, 1, -1));
        this.p3.setVisibility(4);
        this.i3.addView(this.p3, qoe.e(48, 48, 53));
        this.p3.setOnClickListener(new y88(this, (byte) 6));
    }

    public final void H0() {
        n1b n1bVar = this.o5;
        if (n1bVar == null || !n1bVar.W) {
            g79 g79Var = this.a0;
            if (g79Var != null) {
                Iterator it = g79Var.iterator();
                while (it.hasNext()) {
                    gm0 gm0Var = ((im0) it.next()).h0;
                    if (gm0Var != null) {
                        gm0Var.h = true;
                    }
                }
            }
            g79 g79Var2 = this.b0;
            if (g79Var2 != null) {
                Iterator it2 = g79Var2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            aa8 aa8Var = this.V1;
            if (aa8Var != null) {
                aa8Var.m();
            }
            ba8 ba8Var = this.W1;
            if (ba8Var != null) {
                ba8Var.m();
            }
            db8 db8Var = this.s5;
            if (db8Var != null) {
                db8Var.invalidate();
            }
            db8 db8Var2 = this.u5;
            if (db8Var2 != null) {
                db8Var2.invalidate();
            }
            db8 db8Var3 = this.v5;
            if (db8Var3 != null) {
                db8Var3.invalidate();
            }
            db8 db8Var4 = this.w5;
            if (db8Var4 != null) {
                db8Var4.invalidate();
            }
            db8 db8Var5 = this.x5;
            if (db8Var5 != null) {
                db8Var5.invalidate();
            }
            x98 x98Var = this.X7;
            if (x98Var != null && x98Var.f0) {
                x98Var.invalidate();
            }
            lb8 lb8Var = this.f0;
            if (lb8Var != null) {
                lb8Var.invalidate();
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
        lb8 lb8Var;
        int i;
        if (this.d2 != 1 && (lb8Var = this.f0) != null) {
            if (!z) {
                if (lb8Var.getPaddingLeft() <= 0 && this.f0.getPaddingRight() <= 0) {
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

    public final void I(lo6 lo6Var) {
        xm0 xm0Var;
        if (this.C2 == null) {
            oa8 oa8Var = new oa8((byte) 0, this.E, this);
            this.z2 = oa8Var;
            oa8Var.setWillNotDraw(false);
            this.z2.setVisibility(4);
            this.f0.addView(this.z2, 0, qoe.e(-1, -1, 17));
            this.E2 = false;
            if (this.f7.isEmpty()) {
                if (this.b && this.T2 == null) {
                    this.D2 = new SurfaceView(this.E);
                    this.E2 = true;
                } else {
                    this.C2 = new TextureView(this.E);
                }
            } else {
                ncc nccVar = new ncc(this.G2, this.E);
                this.c0.e();
                sm0 sm0Var = this.c0;
                nccVar.s = sm0Var;
                uf4 uf4Var = nccVar.b;
                if (uf4Var != null && (xm0Var = uf4Var.J) != null) {
                    sm0 sm0Var2 = xm0Var.t;
                    if (sm0Var2 != null && sm0Var2.m != null) {
                        sm0Var2.m = null;
                    }
                    xm0Var.t = sm0Var;
                    if (sm0Var != null && sm0Var.m != xm0Var) {
                        sm0Var.m = xm0Var;
                        sm0Var.d();
                    }
                }
                if (lo6Var != null) {
                    nccVar.setDelegate(new p88(lo6Var, (byte) 0));
                }
                this.C2 = nccVar;
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
                this.z2.addView(this.C2, qoe.e(-1, -1, 17));
            } else {
                this.z2.addView(this.D2, qoe.e(-1, -1, 17));
            }
            kb8 kb8Var = new kb8(this.E, this);
            this.F2 = kb8Var;
            kb8Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.z2.addView(this.F2, qoe.e(-1, -1, 17));
            if (this.d2 == 1) {
                View view = new View(this.E);
                this.A2 = view;
                view.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.z2.addView(this.A2, qoe.e(-1, -1, 17));
            }
        }
    }

    public final void I0() {
        ad8 ad8Var = this.U8;
        if (ad8Var != null) {
            ad8Var.d();
        }
    }

    public final void I1() {
        ncc nccVar;
        ncc nccVar2;
        if (!this.h2 && this.d2 == 1) {
            if (!this.s1 || ((nccVar2 = (ncc) this.C2) != null && nccVar2.getVideoWidth() > 0 && nccVar2.getVideoHeight() > 0)) {
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
                    x68 x68Var = this.D1;
                    if (this.s1) {
                        nccVar = (ncc) this.C2;
                    } else {
                        nccVar = null;
                    }
                    x68Var.b(bitmap, i2, false, false, this.E1, nccVar, this.W4.c);
                }
            }
        }
    }

    public final void I2(float f) {
        int i0;
        int g0;
        boolean z;
        View view;
        oa8 oa8Var = this.z2;
        if (oa8Var != null && oa8Var.getVisibility() == 0 && this.H3) {
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            f *= Math.min(i0(this.t4) / view.getMeasuredWidth(), A0() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.B4;
        float f2 = imageReceiver.N0;
        float f3 = imageReceiver.O0;
        ao6 ao6Var = this.W4.c;
        if (ao6Var != null) {
            f2 *= ao6Var.e;
            f3 *= ao6Var.f;
        }
        if (this.d2 == 11) {
            i0 = (int) (f2 * f);
        } else {
            i0 = ((int) ((f2 * f) - i0(this.t4))) / 2;
        }
        if (this.d2 == 11) {
            g0 = (int) (f3 * f);
        } else {
            g0 = ((int) ((f3 * f) - g0())) / 2;
        }
        float f4 = 0.0f;
        if (i0 > 0) {
            this.D6 = -i0;
            this.E6 = i0;
        } else {
            this.E6 = 0.0f;
            this.D6 = 0.0f;
        }
        if (g0 > 0) {
            this.F6 = -g0;
            this.G6 = g0;
        } else {
            this.G6 = 0.0f;
            this.F6 = 0.0f;
        }
        sa8 sa8Var = this.M1;
        if (sa8Var != null) {
            if (f <= 1.1f) {
                z = true;
            } else {
                z = false;
            }
            LinearLayout linearLayout = sa8Var.n1;
            boolean z2 = !z;
            if (sa8Var.S1 != z2) {
                sa8Var.S1 = z2;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z) {
                    f4 = 1.0f;
                }
                wi8.t(animate.alpha(f4), d53.h, 240L);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
        this.o6.setDuration(250L);
        this.o6.setInterpolator(d53.f);
        this.o6.addListener(new ha8(this, (byte) 0));
        this.o6.start();
        s43 s43Var = this.D1.b.M;
        if (s43Var != null) {
            z = s43Var.j;
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
            fc4.g(e, true);
            return false;
        }
    }

    public final void J1(k47 k47Var, CharSequence charSequence, boolean z, boolean z2) {
        TextView currentView;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        boolean z9;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = gn.cloneSpans(charSequence, 3);
        f2(this.Q4, z2);
        if (!this.Q4 && this.d2 != 1) {
            this.V1.setVisibility(8);
            this.W1.setVisibility(8);
            if (this.j2) {
                if (this.R1.getParent() != this.Q0) {
                    FrameLayout frameLayout = this.a2;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.R1);
                    }
                    this.R1.setMeasureAllChildren(false);
                    this.Q0.addView(this.R1, qoe.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.U1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f0.getContext());
                    this.a2 = frameLayout2;
                    this.R1.setContainer(frameLayout2);
                    ta8 ta8Var = new ta8(this, this.f0.getContext(), this.R1, this.a2, (byte) 0);
                    this.U1 = ta8Var;
                    this.R1.setScrollView(ta8Var);
                    this.a2.setClipChildren(false);
                    this.U1.addView(this.a2, new ViewGroup.LayoutParams(-1, -2));
                    this.f0.addView(this.U1, qoe.e(-1, -1, 80));
                }
                if (this.R1.getParent() != this.a2) {
                    this.Q0.removeView(this.R1);
                    this.R1.setMeasureAllChildren(true);
                    this.a2.addView(this.R1, -1, -2);
                    this.s3.bringToFront();
                }
                if (k47Var != null && k47Var.q4()) {
                    if (this.S1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.F);
                        this.S1 = frameLayout3;
                        frameLayout3.setBackground(cmb.Z(620756991, 369098751, 8, 8));
                        rve.b(this.S1, 0.05f, 1.25f);
                        TextView textView = new TextView(this.F);
                        this.T1 = textView;
                        textView.setTextSize(1, 14.0f);
                        this.T1.setTextColor(-1);
                        this.T1.setTypeface(gm.o());
                        this.S1.addView(this.T1, qoe.e(-2, -2, 17));
                        this.S1.setOnClickListener(new y88(this, (byte) 7));
                    }
                    gm.B2(this.S1);
                    this.T1.setText(k47Var.Y0);
                    this.a2.addView(this.S1, qoe.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                    this.R1.setPadding(0, 0, 0, gm.L(64.0f));
                    this.S1.bringToFront();
                } else {
                    FrameLayout frameLayout4 = this.S1;
                    if (frameLayout4 != null) {
                        gm.B2(frameLayout4);
                        this.R1.setPadding(0, 0, 0, 0);
                    }
                }
            }
            boolean isEmpty = TextUtils.isEmpty(cloneSpans);
            boolean isEmpty2 = TextUtils.isEmpty(this.R1.getCurrentView().getText());
            hb8 hb8Var = this.R1;
            if (z2) {
                currentView = hb8Var.getNextView();
            } else {
                currentView = hb8Var.getCurrentView();
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
                    Point point = gm.q;
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
            boolean z10 = this.j2;
            if (!z10 && z2 && isEmpty) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.n2 = z3;
            if (!z10) {
                this.U1.l0 = false;
            }
            if (z2) {
                if (z10) {
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
                    TransitionSet duration = new TransitionSet().addTransition(new ua8(this, isEmpty2, isEmpty, (byte) 1)).addTransition(new ua8(this, isEmpty2, isEmpty, (byte) 0)).setDuration(200L);
                    if (!isEmpty2) {
                        this.U1.l0 = true;
                        duration.addTransition(new wa8(this, (byte) 0));
                    } else if (!isEmpty) {
                        duration.addTarget((View) this.R1);
                    }
                    TransitionManager.beginDelayedTransition(this.U1, duration);
                }
                z4 = true;
            } else {
                this.R1.getCurrentView().setText((CharSequence) null);
                ta8 ta8Var2 = this.U1;
                if (ta8Var2 != null) {
                    ta8Var2.scrollTo(0, 0);
                }
                z4 = false;
            }
            if (!isEmpty) {
                cmb.J(null, true);
                if (k47Var == null || !this.m5 || (message = k47Var.k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, s1c.G0())) {
                    if (k47Var != null && !k47Var.k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        k47Var.c(spannableString, true, false);
                        if (k47.K4(k47Var.k)) {
                            k47.h(k47Var.O3(), spannableString, false, 3, (int) k47Var.L0(), false);
                        }
                        cloneSpans = gw3.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = gw3.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (k47Var != null && k47Var.q4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(k47Var.S0)) {
                        spannableStringBuilder.append((CharSequence) k47Var.S0);
                        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new bb8((byte) 0), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.R1.setTag(cloneSpans);
                try {
                    hb8 hb8Var2 = this.R1;
                    if (this.q2 != z) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    hb8Var2.a(cloneSpans, z2, z9);
                    ta8 ta8Var3 = this.U1;
                    if (ta8Var3 != null) {
                        ta8Var3.H(ta8Var3.getWidth(), ta8Var3.getHeight());
                    }
                    z5 = true;
                } catch (Exception e) {
                    z5 = true;
                    fc4.g(e, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.K && (!this.s1 || this.Q0.getVisibility() == 0 || this.i7 != null)) {
                    z8 = z5;
                } else {
                    z8 = false;
                }
                hb8 hb8Var3 = this.R1;
                if (z8) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                hb8Var3.setVisibility(i2);
            } else {
                z5 = true;
                boolean z11 = this.j2;
                hb8 hb8Var4 = this.R1;
                if (z11) {
                    hb8Var4.a(jb6.M0(2131754451, "AddCaption"), z2, false);
                    this.R1.getCurrentView().setTextColor(-1291845633);
                    this.R1.setTag("empty");
                    this.R1.setVisibility(0);
                } else {
                    hb8Var4.a(null, z2, false);
                    this.R1.getCurrentView().setTextColor(-1);
                    hb8 hb8Var5 = this.R1;
                    if (z4 && !isEmpty2) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    hb8Var5.b(4, z6);
                    this.R1.setTag(null);
                }
            }
            if (this.R1.getCurrentView() instanceof gb8) {
                ((gb8) this.R1.getCurrentView()).setLoading(z);
            }
            if (!isEmpty && z) {
                z7 = z5;
            } else {
                z7 = false;
            }
            this.q2 = z7;
            return;
        }
        d0().setText(cloneSpans);
        this.R1.setVisibility(8);
    }

    public final void J2() {
        boolean z;
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            if (!fp.w() && !this.r) {
                z = false;
            } else {
                z = true;
            }
            ndcVar.s0(z);
        }
        boolean z2 = this.p8;
        c7 c7Var = this.f1;
        if (!z2) {
            c7Var.setEnabled(false);
            this.f1.setClickable(false);
            this.f1.animate().alpha(0.5f).setDuration(180L).start();
            this.X7.setMode(0);
            return;
        }
        c7Var.setEnabled(true);
        this.f1.setClickable(true);
        this.f1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.r) {
            if (this.e4 == null) {
                this.N.a(jb6.M0(2131745013, "SoundMuted"), true);
            }
            kc2 kc2Var = this.e1;
            kc2Var.c = true;
            kc2Var.invalidateSelf();
            if (this.k1.getTag() != null) {
                this.k1.setAlpha(0.5f);
                this.k1.setEnabled(false);
            }
            int i = this.d2;
            x98 x98Var = this.X7;
            if (i == 1) {
                x98Var.setMaxProgressDiff(9600.0f / this.n8);
                this.X7.setMode(1);
                P2();
                return;
            }
            x98Var.setMaxProgressDiff(1.0f);
            this.X7.setMode(0);
            return;
        }
        this.N.a(this.I8, true);
        kc2 kc2Var2 = this.e1;
        kc2Var2.c = false;
        kc2Var2.invalidateSelf();
        if (this.k1.getTag() != null) {
            this.k1.setAlpha(1.0f);
            this.k1.setEnabled(true);
        }
        this.X7.setMaxProgressDiff(1.0f);
        this.X7.setMode(0);
    }

    public final boolean K(float f, boolean z, Runnable runnable) {
        x68 x68Var;
        float f2;
        if (this.o6 == null && (x68Var = this.D1) != null) {
            x68Var.b.i();
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
                    ao6 ao6Var = this.W4.c;
                    if (ao6Var != null) {
                        q = (int) (q * ao6Var.e);
                        o = (int) (o * ao6Var.f);
                    }
                    float f3 = q;
                    float f4 = o;
                    float min = Math.min(i0(1) / f3, f0(1, false) / f4);
                    if (Math.abs((f / 90.0f) % 2.0f) == 1.0f) {
                        f2 = Math.min(i0(1) / f4, f0(1, false) / f3);
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
            ofFloat.addUpdateListener(new dz1(this, f, this.D1.c.getRotation(), (byte) 4));
            this.o6.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f), ofFloat);
            this.o6.setDuration(250L);
            this.o6.setInterpolator(d53.f);
            this.o6.addListener(new ok4(this, f, runnable, (byte) 3));
            this.o6.start();
            if (Math.abs(this.D1.b.getStateOrientation() + f) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final boolean K0() {
        tc1 d0 = d0();
        if (d0 != null) {
            if (d0.M.c() || d0.f.e) {
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
                gm.d3(this.b9, 150L);
            }
        }
    }

    public final void L() {
        if (this.E != null && this.h0 != null) {
            ad8 ad8Var = this.U8;
            if (ad8Var != null) {
                this.U8 = null;
                ad8Var.b();
            }
            e7a e7aVar = this.H7;
            if (e7aVar != null) {
                e7aVar.a();
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
                fc4.g(e, true);
            }
            jn5 jn5Var = this.i5;
            if (jn5Var != null) {
                jn5Var.a();
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
                gn5 gn5Var = (gn5) this.Z6.get(this.O4);
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
                } else if (gn5Var != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var.f;
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

    public final void L1(boolean r47, boolean r48, boolean r49, int r50) {
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
                jn5 p = this.B4.p();
                int i = this.B4.V;
                if (str != null && p != null && p.c != null) {
                    Utilities.e.c(new v36(this, p, i, str, (byte) 18));
                }
            }
        }
    }

    public final boolean M0(mb8 mb8Var) {
        if (mb8Var != null) {
            Object g = mb8Var.g();
            if (g instanceof k47) {
                k47 k47Var = (k47) g;
                if (k47Var.k != null) {
                    if (oc7.r1(this.U).B2(k47.B0(k47Var.k)) || k47Var.k.noforwards || k47Var.y2()) {
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

    public final void M2(int r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.M2(int, boolean):void");
    }

    public final void N() {
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.e8)), this.d8);
        edit.commit();
        S2();
        P2();
    }

    public final void N1(org.telegram.messenger.ImageReceiver r22, int r23, defpackage.n43 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.N1(org.telegram.messenger.ImageReceiver, int, n43):void");
    }

    public final void N2() {
        kdc kdcVar;
        kdc kdcVar2;
        int i;
        int i2;
        String str;
        kdc kdcVar3;
        kdc Z;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        k47 k47Var;
        ndc ndcVar;
        kdc kdcVar4;
        int i3;
        kdc kdcVar5;
        String str8;
        String str9;
        boolean z2;
        String str10;
        String str11;
        if (this.l7 == null && this.V4 == null && this.U4 != null) {
            L2();
        }
        ndc ndcVar2 = this.G2;
        String str12 = "";
        if (ndcVar2 != null && ndcVar2.Y() > 1) {
            this.u0.setRightIcon(2131232065);
            this.J0.setVisibility(8);
            this.y0.setVisibility(0);
            ndc ndcVar3 = this.G2;
            int T = ndcVar3.T();
            if (T >= 0 && T < ndcVar3.Y()) {
                kdcVar = ndcVar3.Z(T);
            } else {
                kdcVar = null;
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
                textView.setText(jb6.M0(2131746186, null));
                textView.setTypeface(gm.o());
                textView.setPadding(gm.L(16.0f), gm.L(9.0f), gm.L(16.0f), gm.L(8.0f));
                textView.setTextSize(1, 14.0f);
                int i4 = -1;
                textView.setTextColor(-1);
                this.y0.addView(textView, qoe.o(-1, -2));
                final int i5 = -1;
                while (i5 < this.G2.Y()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i5 == i4) {
                        spannableStringBuilder.append((CharSequence) jb6.M0(2131746188, null));
                        if (i5 == this.G2.e0 && kdcVar != null) {
                            spannableStringBuilder.append((CharSequence) " ");
                            int length = spannableStringBuilder.length();
                            if (gda.N0) {
                                spannableStringBuilder.append((CharSequence) Integer.toString(kdcVar.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(kdcVar.c));
                            } else {
                                spannableStringBuilder.append((CharSequence) String.valueOf(kdcVar.b())).append((CharSequence) "p");
                            }
                            kdcVar4 = kdcVar;
                            i3 = T2;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length, spannableStringBuilder.length(), 33);
                            kdcVar5 = kdcVar4;
                        } else {
                            kdcVar4 = kdcVar;
                            i3 = T2;
                            kdcVar5 = null;
                        }
                    } else {
                        kdcVar4 = kdcVar;
                        i3 = T2;
                        kdc Z2 = this.G2.Z(i5);
                        if (Z2.a) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746185, null));
                        } else if (Z2.b() >= 2000) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746195, null));
                        } else if (Z2.b() >= 1400) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746197, null));
                        } else if (Z2.b() >= 1000) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746200, null));
                        } else if (Z2.b() >= 700) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746190, null));
                        } else if (Z2.b() >= 400) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746191, null));
                        } else if (Z2.b() >= 340) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746192, null));
                        } else if (Z2.b() >= 200) {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746193, null));
                        } else {
                            spannableStringBuilder.append((CharSequence) jb6.M0(2131746198, null));
                        }
                        spannableStringBuilder.append((CharSequence) " ");
                        int length2 = spannableStringBuilder.length();
                        if (gda.N0) {
                            spannableStringBuilder.append((CharSequence) Integer.toString(Z2.b)).append((CharSequence) "x").append((CharSequence) Integer.toString(Z2.c));
                        } else {
                            spannableStringBuilder.append((CharSequence) String.valueOf(Z2.b())).append((CharSequence) "p");
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length2, spannableStringBuilder.length(), 33);
                        kdcVar5 = Z2;
                    }
                    a8 c = r7.c(false, false, this.y0, 0, spannableStringBuilder, true, null);
                    if (gda.N0 && kdcVar5 != null) {
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList3 = kdcVar5.d;
                        int size = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = arrayList3.get(i6);
                            int i7 = i6 + 1;
                            mdc mdcVar = (mdc) obj;
                            if (sb.length() > 0) {
                                sb.append(str14);
                            }
                            ArrayList arrayList4 = arrayList3;
                            if (!TextUtils.isEmpty(mdcVar.m)) {
                                sb.append(mdcVar.m);
                                sb.append(str13);
                            }
                            int i8 = size;
                            sb.append(gm.i0(mdcVar.k, false, false).replace(" ", ""));
                            sb.append("(");
                            StringBuilder sb2 = new StringBuilder();
                            String str16 = str13;
                            String str17 = str14;
                            sb2.append(gm.i0((long) mdcVar.l, false, false).replace(" ", ""));
                            sb2.append("/s)");
                            sb.append(sb2.toString());
                            if (mdcVar.c()) {
                                str10 = "!";
                            } else {
                                str10 = " ";
                            }
                            sb.append(str10);
                            if (mdcVar.b()) {
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
                                    photoViewer.v(i10);
                                    return;
                                default:
                                    Drawable[] drawableArr2 = PhotoViewer.d9;
                                    photoViewer.v(i10);
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
                    kdcVar = kdcVar4;
                    i4 = -1;
                }
                kdcVar2 = kdcVar;
                i = T2;
                j8 j8Var = new j8(cmb.G8, this.w2, this.F);
                j8Var.setTag(2131296439, 1);
                j8Var.setColor(-15198184);
                this.y0.addView(j8Var, qoe.o(-1, 8));
            } else {
                kdcVar2 = kdcVar;
                i = T2;
                String str18 = ", ";
                String str19 = "\n";
                final int i10 = -1;
                while (i10 < this.G2.Y()) {
                    int i11 = i10 + 1;
                    a8 a8Var = (a8) arrayList2.get(i11);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (i10 == -1) {
                        spannableStringBuilder2.append((CharSequence) jb6.M0(2131746188, null));
                        if (i10 == this.G2.e0 && kdcVar2 != null) {
                            spannableStringBuilder2.append((CharSequence) " ");
                            int length3 = spannableStringBuilder2.length();
                            if (gda.N0) {
                                kdcVar3 = kdcVar2;
                                spannableStringBuilder2.append((CharSequence) Integer.toString(kdcVar3.b)).append((CharSequence) str15).append((CharSequence) Integer.toString(kdcVar3.c));
                            } else {
                                kdcVar3 = kdcVar2;
                                spannableStringBuilder2.append((CharSequence) String.valueOf(kdcVar3.b())).append((CharSequence) "p");
                            }
                            i2 = i11;
                            str = str18;
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length3, spannableStringBuilder2.length(), 33);
                            str2 = str15;
                            Z = kdcVar3;
                        } else {
                            i2 = i11;
                            str = str18;
                            kdcVar3 = kdcVar2;
                            str2 = str15;
                            Z = null;
                        }
                    } else {
                        i2 = i11;
                        str = str18;
                        kdcVar3 = kdcVar2;
                        Z = this.G2.Z(i10);
                        if (Z.a) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746185, null));
                        } else if (Z.b() >= 2000) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746195, null));
                        } else if (Z.b() >= 1400) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746197, null));
                        } else if (Z.b() >= 1000) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746200, null));
                        } else if (Z.b() >= 700) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746190, null));
                        } else if (Z.b() >= 400) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746191, null));
                        } else if (Z.b() >= 340) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746192, null));
                        } else if (Z.b() >= 200) {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746193, null));
                        } else {
                            spannableStringBuilder2.append((CharSequence) jb6.M0(2131746198, null));
                        }
                        spannableStringBuilder2.append((CharSequence) " ");
                        int length4 = spannableStringBuilder2.length();
                        if (gda.N0) {
                            spannableStringBuilder2.append((CharSequence) Integer.toString(Z.b)).append((CharSequence) str15).append((CharSequence) Integer.toString(Z.c));
                        } else {
                            spannableStringBuilder2.append((CharSequence) String.valueOf(Z.b())).append((CharSequence) "p");
                        }
                        str2 = str15;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(cmb.p1(0.5f, -1)), length4, spannableStringBuilder2.length(), 33);
                    }
                    a8Var.setText(spannableStringBuilder2);
                    a8Var.setVisibility(0);
                    if (gda.N0 && Z != null) {
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList5 = Z.d;
                        int size2 = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList5.get(i12);
                            int i13 = i12 + 1;
                            mdc mdcVar2 = (mdc) obj2;
                            String str20 = str19;
                            if (sb3.length() > 0) {
                                sb3.append(str20);
                            }
                            if (!TextUtils.isEmpty(mdcVar2.m)) {
                                sb3.append(mdcVar2.m);
                                str5 = str;
                                sb3.append(str5);
                            } else {
                                str5 = str;
                            }
                            int i14 = size2;
                            ArrayList arrayList6 = arrayList5;
                            sb3.append(gm.i0(mdcVar2.k, false, false).replace(" ", ""));
                            sb3.append(" (");
                            StringBuilder sb4 = new StringBuilder();
                            ArrayList arrayList7 = arrayList2;
                            sb4.append(gm.i0((long) mdcVar2.l, false, false).replace(" ", ""));
                            sb4.append("/s)");
                            sb3.append(sb4.toString());
                            if (mdcVar2.c()) {
                                str6 = "!";
                            } else {
                                str6 = " ";
                            }
                            sb3.append(str6);
                            if (mdcVar2.b()) {
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
                        a8Var.setSubtext(sb3.toString());
                    } else {
                        arrayList = arrayList2;
                        str3 = str;
                        str4 = str19;
                        a8Var.setSubtext("");
                    }
                    if (i10 == this.G2.e0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a8Var.setChecked(z);
                    a8Var.setOnClickListener(new View.OnClickListener(this) {
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
                                    photoViewer.v(i102);
                                    return;
                                default:
                                    Drawable[] drawableArr2 = PhotoViewer.d9;
                                    photoViewer.v(i102);
                                    return;
                            }
                        }
                    });
                    arrayList2 = arrayList;
                    kdcVar2 = kdcVar3;
                    str18 = str3;
                    i10 = i2;
                    str15 = str2;
                    str19 = str4;
                }
            }
            kdc kdcVar6 = kdcVar2;
            if (kdcVar6 != null) {
                if (kdcVar6.b() >= 2000) {
                    str12 = jb6.M0(2131746194, null);
                } else if (kdcVar6.b() >= 1000) {
                    str12 = jb6.M0(2131746199, null);
                } else if (kdcVar6.b() >= 700) {
                    str12 = jb6.M0(2131746189, null);
                } else {
                    str12 = kdcVar6.b() + "p";
                }
            }
            this.x0.g.t(str12, true, true);
            ka8 ka8Var = this.s3;
            if (ka8Var != null && (k47Var = this.S4) != null && (ndcVar = this.G2) != null) {
                ka8Var.c(k47Var, ndcVar);
            }
            if (this.t7 != i) {
                try {
                    fp.b(0);
                    if (hi2.v().D()) {
                        hi2.v().Q(k0());
                    }
                    ndc ndcVar4 = this.G2;
                    if (ndcVar4 != null) {
                        fp.z(ndcVar4.c0());
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
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
        a26 a26Var = this.r7;
        if (a26Var != null) {
            a26Var.a();
            this.r7 = null;
        }
        a26 a26Var2 = this.c2;
        if (a26Var2 != null) {
            a26Var2.a();
            this.c2 = null;
        }
        try {
            if (this.h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.h0);
                a1();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void O1(int i, kw7 kw7Var) {
        ArrayList arrayList;
        String str;
        boolean z;
        boolean z2;
        if (kw7Var != null) {
            kw7Var.a();
            kw7Var.setVisibility(8);
            ArrayList arrayList2 = this.f7;
            if (!arrayList2.isEmpty() && i >= 0 && i < arrayList2.size()) {
                Object obj = arrayList2.get(i);
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    z = jo6Var.b;
                    str = jo6Var.j;
                    arrayList = jo6Var.p;
                } else {
                    if (obj instanceof no6) {
                        no6 no6Var = (no6) obj;
                        str = no6Var.j;
                        arrayList = no6Var.p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z = false;
                }
                kw7Var.setVisibility(0);
                if (this.d2 != 11) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                kw7Var.b(arrayList, z, false, z2);
                if (str != null) {
                    kw7Var.a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(kw7Var.a);
                    kw7Var.d = bitmapDrawable;
                    kw7Var.setBackground(bitmapDrawable);
                    return;
                }
                kw7Var.a = null;
                kw7Var.d = null;
                kw7Var.setBackground(null);
            }
        }
    }

    public final void O2() {
        long j;
        int H;
        k47 k47Var;
        pb8 pb8Var = this.d;
        if (pb8Var != null) {
            int H2 = pb8Var.H();
            this.P0.a(H2);
            if (H2 == 0) {
                A2(false, true);
            }
            if (this.T0 != null) {
                pb8 pb8Var2 = this.d;
                long j2 = 0;
                if (pb8Var2 != null) {
                    j = pb8Var2.a();
                } else {
                    j = 0;
                }
                if (j == 0 && (k47Var = this.S4) != null) {
                    j = k47.B0(k47Var.k);
                }
                vi3 vi3Var = this.T0;
                pb8 pb8Var3 = this.d;
                if (pb8Var3 == null || !pb8Var3.p() || this.d.v()) {
                    j2 = oc7.r1(this.U).L1(j);
                }
                pb8 pb8Var4 = this.d;
                if (pb8Var4 == null) {
                    H = 1;
                } else {
                    H = pb8Var4.H();
                }
                vi3Var.i(Math.max(1, H), j2, true);
            }
        }
    }

    public final void P(android.graphics.Canvas r52, defpackage.wm0 r53, int r54, int r55, boolean r56, boolean r57, boolean r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P(android.graphics.Canvas, wm0, int, int, boolean, boolean, boolean):void");
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
            view.animate().alpha(f3).setDuration(100L).setUpdateListener(new h88(this, (byte) 6)).setInterpolator(new LinearInterpolator()).withEndAction(new yl6(this, z, view, (byte) 13)).start();
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
        String X;
        String X2;
        int[] iArr = this.m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.n3;
        Arrays.fill(iArr2, 0);
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            long max = Math.max(0L, ndcVar.S());
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
            ya8 ya8Var = this.g0;
            if (ya8Var != null && ya8Var.y) {
                long max3 = Math.max(0, ya8Var.getCurrentPosition());
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
            X = Y(i / 60, i % 60, iArr[1]);
        } else {
            X = X(i, iArr[1]);
        }
        int i2 = iArr2[0];
        if (i2 >= 60) {
            X2 = Y(i2 / 60, i2 % 60, iArr2[1]);
        } else {
            X2 = X(i2, iArr2[1]);
        }
        this.o3.l(X + " / " + X2, false);
        if (!Objects.equals(this.j3, X2)) {
            this.j3 = X2;
            this.i3.requestLayout();
        }
    }

    public final void R(Canvas canvas) {
        boolean z;
        float d;
        int i;
        if (this.R4) {
            if (!gda.Z) {
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + ((int) (gm.m * 1.5f));
            int height = this.Q0.getHeight() + gm.n;
            if (this.V1.getVisibility() == 0) {
                i = gm.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f0.getWidth(), this.f0.getHeight() + gm.n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.L7.rewind();
            float f = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.L7.addRect(0.0f, 0.0f, this.f0.getWidth(), f, direction);
            this.L7.addRect(0.0f, (this.f0.getHeight() + gm.n) - i2, this.f0.getWidth(), this.f0.getHeight() + gm.n, direction);
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
            this.R7.postTranslate(0.0f, (this.f0.getHeight() - i2) + gm.n);
            this.P7.setLocalMatrix(this.R7);
            this.N7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f0.getHeight() + gm.n) - i2, this.f0.getWidth(), this.f0.getHeight() + gm.n, this.N7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void R1(View view, boolean z, boolean z2) {
        Q1(1.0f, view, z, z2);
    }

    public final void R2() {
        int i;
        vdc vdcVar = this.q3;
        if (vdcVar.f) {
            i = vdcVar.d;
        } else {
            i = vdcVar.b;
        }
        int L = (gm.L(2.0f) + ((vdc.S / 2) + i)) - (this.s3.getMeasuredWidth() / 2);
        int L2 = gm.L(10.0f);
        int measuredWidth = (this.i3.getMeasuredWidth() - gm.L(10.0f)) - (this.s3.getMeasuredWidth() / 2);
        ka8 ka8Var = this.s3;
        if (L < L2) {
            ka8Var.setPivotX(Utilities.i((ka8Var.getMeasuredWidth() / 2.0f) - (L2 - L), this.s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            ka8Var.setPivotX(Utilities.i((ka8Var.getMeasuredWidth() / 2.0f) + (L - measuredWidth), this.s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            ka8Var.setPivotX(ka8Var.getMeasuredWidth() / 2.0f);
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
            ai2 ai2Var = this.x0;
            if (i < 0) {
                ai2Var.f.t("", z, true);
            } else {
                ai2Var.f.t(dna.a(this.u1).concat("x"), z, true);
            }
        }
        this.s0.e(z, this.u1);
        qmb qmbVar = this.J0;
        float f = this.u1;
        a8[] a8VarArr = (a8[]) qmbVar.b;
        for (int i2 = 0; i2 < a8VarArr.length; i2++) {
            if (z2 && ((i2 == 0 && Math.abs(f - 0.2f) < 0.01f) || ((i2 == 1 && Math.abs(f - 0.5f) < 0.1f) || ((i2 == 2 && Math.abs(f - 1.0f) < 0.1f) || ((i2 == 3 && Math.abs(f - 1.5f) < 0.1f) || (i2 == 4 && Math.abs(f - 2.0f) < 0.1f)))))) {
                a8VarArr[i2].d(-9718023, -9718023);
            } else {
                a8VarArr[i2].d(-328966, -328966);
            }
        }
    }

    public final void S2() {
        int q;
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
                    q = this.l8;
                } else if (this.j8 == this.h8 && this.k8 == this.i8) {
                    this.l8 = this.m8;
                    q = MediaController.q(this.j8, this.k8, this.l8, false);
                } else {
                    this.l8 = MediaController.P(this.i8, this.h8, this.m8, this.k8, this.j8);
                    q = MediaController.q(this.j8, this.k8, this.l8, false);
                }
                this.w8 = ((q / 8) * this.n8) / 1000.0f;
            }
        }
    }

    public final boolean T0() {
        if (this.I4 && U0() && this.d2 != 1) {
            return true;
        }
        return false;
    }

    public final void T1(Activity activity, org.telegram.ui.ActionBar.d dVar, ylb ylbVar) {
        boolean z;
        a26 a26Var = this.r7;
        if (a26Var != null) {
            a26Var.a();
            this.r7 = null;
        }
        this.r7 = LaunchActivity.c0();
        Activity parentActivity = activity != null ? activity : dVar.getParentActivity();
        cmb.J(parentActivity, false);
        this.w2 = ylbVar;
        this.l4 = dVar;
        int i = z8c.t0;
        this.U = i;
        this.B4.d = i;
        this.A4.d = i;
        this.C4.d = i;
        aa8 aa8Var = this.V1;
        if (aa8Var != null) {
            aa8Var.setAccount(i);
            this.V1.f.k(false);
        }
        ba8 ba8Var = this.W1;
        if (ba8Var != null) {
            ba8Var.setAccount(this.U);
            this.W1.f.k(false);
        }
        n1b n1bVar = this.o5;
        if (n1bVar != null) {
            n1bVar.setCurrentAccount(this.U);
        }
        if (this.E != parentActivity && parentActivity != null) {
            this.s = parentActivity instanceof BubbleActivity;
            this.E = parentActivity;
            this.F = new ContextThemeWrapper(this.E, 2131755318);
            this.z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
            if (d9 == null) {
                d9 = new Drawable[]{this.E.getDrawable(2131231009), this.E.getDrawable(2131230932), this.E.getDrawable(2131231640)};
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
            this.h0.addView(clippingImageView, qoe.c(40.0f, 40));
            lb8 lb8Var = new lb8(this, parentActivity, parentActivity);
            this.f0 = lb8Var;
            lb8Var.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f0);
            }
            this.f0.setClipChildren(true);
            this.f0.setClipToPadding(true);
            this.h0.setClipChildren(false);
            this.h0.setClipToPadding(false);
            sm0 sm0Var = new sm0(this.f0);
            this.c0 = sm0Var;
            sm0Var.a = true;
            this.Y = new g98(this);
            this.b0 = new g79();
            this.a0 = new g79();
            g98 g98Var = this.Y;
            km0 km0Var = new km0(g98Var, g98Var, g98Var);
            this.Z = km0Var;
            km0Var.e(new zgc(this.f0), this.f0);
            this.Z.g = this.b0;
            this.d0 = new wm0(this.c0, this.f0);
            this.h0.addView(this.f0, qoe.e(-1, -1, 51));
            lb8 lb8Var2 = this.f0;
            u88 u88Var = new u88(this);
            WeakHashMap weakHashMap = kfc.a;
            cfc.i(lb8Var2, u88Var);
            this.f0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            gm.m(layoutParams);
            this.e0.flags = -2147286784;
            kw7 kw7Var = new kw7(this.E);
            this.x4 = kw7Var;
            kw7Var.setVideoPosition(new u88(this));
            this.f0.addView(this.x4, qoe.c(-2.0f, -2));
            kw7 kw7Var2 = new kw7(this.E);
            this.y4 = kw7Var2;
            this.f0.addView(kw7Var2, qoe.c(-2.0f, -2));
            kw7 kw7Var3 = new kw7(this.E);
            this.z4 = kw7Var3;
            this.f0.addView(kw7Var3, qoe.c(-2.0f, -2));
            x20 x20Var = new x20((byte) 3, parentActivity, this);
            this.G = x20Var;
            x20Var.setOverlayTitleAnimation(true);
            this.G.setTitleColor(-1);
            this.G.setSubtitleColor(-1);
            this.G.setBackgroundColor(2130706432);
            this.G.setOccupyStatusBar(!this.s);
            this.G.G(1090519039, false);
            this.G.H(-1, false);
            this.G.setBackButtonImage(2131231244);
            ImageView backButton = this.G.getBackButton();
            this.H = backButton;
            this.I = backButton.getBackground();
            this.J = null;
            ob8 ob8Var = new ob8(parentActivity);
            this.N = ob8Var;
            this.G.addView(ob8Var, qoe.e(-1, -1, 119));
            this.f0.addView(this.G, qoe.c(-2.0f, -1));
            nb8 nb8Var = new nb8(parentActivity);
            this.O = nb8Var;
            this.f0.addView(nb8Var, qoe.e(-1, -2, 55));
            this.G.setActionBarMenuOnItemClick(new r98(this, ylbVar));
            r6 t = this.G.t();
            this.B0 = t;
            t.setOnLayoutListener(new n88(this, (byte) 17));
            r7 a = this.B0.a(26, 2131231790);
            this.F0 = a;
            a.setContentDescription(jb6.L0(2131751535));
            rve.a(this.F0);
            R1(this.F0, false, false);
            r7 a2 = this.B0.a(11, 2131232223);
            this.E0 = a2;
            a2.setContentDescription(jb6.L0(2131748436));
            r7 a3 = this.B0.a(18, 2131232186);
            this.D0 = a3;
            a3.setContentDescription(jb6.L0(2131754809));
            r7 a4 = this.B0.a(4, 2131232187);
            this.C0 = a4;
            a4.setContentDescription(jb6.L0(2131750519));
            r6 r6Var = this.B0;
            ai2 ai2Var = new ai2(this.F, 2131232815, new r63());
            this.x0 = ai2Var;
            r7 d = r6Var.d(1, ai2Var);
            this.q0 = d;
            this.x0.setCallback(d.getIconView());
            this.q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.q0.getPopupLayout().c = true;
            this.q0.getPopupLayout().setFitItems(true);
            this.q0.setMenuXOffset(gm.L(3.0f));
            v7 v7Var = new v7(this.F, ylbVar);
            this.s0 = v7Var;
            v7Var.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.s0.setMinimumWidth(gm.L(196.0f));
            this.s0.setDrawShadow(false);
            this.s0.setBackgroundColor(-14540254);
            this.s0.setTextColor(-1);
            this.s0.setLabel(jb6.L0(2131743271));
            this.s0.setOnValueChange(new v88(this, (byte) 1));
            this.q0.getPopupLayout().a(this.s0, qoe.o(-1, 44));
            j8 a5 = this.q0.a(-1);
            this.A0 = a5;
            a5.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.q0.getPopupLayout();
            qmb qmbVar = new qmb(this.F, new u88(this));
            this.J0 = qmbVar;
            popupLayout.addView(qmbVar);
            LinearLayout linearLayout = new LinearLayout(this.F);
            this.y0 = linearLayout;
            linearLayout.setOrientation(1);
            this.q0.getPopupLayout().addView(this.y0);
            a8 e = this.q0.e(22, 2131231918, jb6.L0(2131743272));
            this.t0 = e;
            e.setSelectorColor(268435455);
            o20 o20Var = new o20(this, this.F, (byte) 1);
            this.H0 = o20Var;
            try {
                o20Var.setRouteSelector(ie1.c(this.F).a());
                z = true;
            } catch (Exception e2) {
                fc4.f(e2);
                z = false;
            }
            this.H0.setVisibility(4);
            if (z) {
                a8 e3 = this.q0.e(24, 2131231917, jb6.L0(2131743276));
                this.G0 = e3;
                e3.f(false);
                this.G0.setSelectorColor(268435455);
                this.G0.addView(this.H0, 0, qoe.c(-1.0f, -1));
            }
            this.q0.I(-115203550);
            this.q0.setOnMenuDismiss(new t88(this, (byte) 9));
            r7 a6 = this.B0.a(0, 2131231754);
            this.p0 = a6;
            a6.setContentDescription(jb6.L0(2131754838));
            this.p0.setOnClickListener(new y88(this, (byte) 4));
            this.p0.setOnMenuDismiss(new t88(this, (byte) 10));
            this.p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.p0.getPopupLayout().c = true;
            this.p0.getPopupLayout().setFitItems(true);
            this.K0 = new zh2(this.F, this.p0.getPopupLayout().getSwipeBack(), new u88(this));
            a8 i2 = this.p0.i(2131232173, null, jb6.L0(2131745663), this.K0.a);
            i2.d(-328966, -328966);
            this.u0 = i2;
            i2.setOnClickListener(new y88(this, (byte) 5));
            j8 a7 = this.p0.a(-1);
            this.v0 = a7;
            a7.setColor(-15198184);
            this.p0.e(10, 2131232271, jb6.L0(2131747529)).d(-328966, -328966);
            a8 e4 = this.p0.e(6, 2131231919, jb6.L0(2131746955));
            e4.d(-328966, -328966);
            this.w0 = e4;
            r86 r86Var = new r86(false);
            this.p7 = r86Var;
            a8 f = this.p0.f(r86Var, jb6.L0(2131743275), 126, true, 0);
            this.o7 = f;
            f.d(-328966, -328966);
            this.o7.setItemHeight(56);
            this.o7.setSelectorColor(268435455);
            this.o7.setRightIcon(2131232366);
            this.o7.setSubtext(jb6.L0(2131743274));
            this.o7.getRightIcon().setBackground(cmb.e0(536870911, 1));
            int i3 = (jb6.a0 ? 3 : 5) | 16;
            ImageView rightIcon = this.o7.getRightIcon();
            boolean z2 = jb6.a0;
            rightIcon.setLayoutParams(qoe.d(40, 40.0f, i3, z2 ? 4.0f : 0.0f, 0.0f, z2 ? 0.0f : 4.0f, 0.0f));
            View view = new View(this.F);
            view.setBackgroundColor(536870911);
            boolean z3 = jb6.a0;
            FrameLayout.LayoutParams d2 = qoe.d(-1, 28.0f, i3, z3 ? 52.0f : 0.0f, 0.0f, z3 ? 0.0f : 52.0f, 0.0f);
            d2.width = 1;
            view.setLayoutParams(d2);
            this.o7.addView(view);
            View[] viewArr = {this.o7.getTextView(), this.o7.getSubtextView()};
            int i4 = 0;
            for (int i5 = 2; i4 < i5; i5 = 2) {
                View view2 = viewArr[i4];
                if (view2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    layoutParams2.leftMargin = jb6.a0 ? gm.L(60.0f) : 0;
                    layoutParams2.rightMargin = jb6.a0 ? 0 : gm.L(60.0f);
                    view2.setLayoutParams(layoutParams2);
                }
                i4++;
            }
            this.o7.getRightIcon().setContentDescription(jb6.L0(2131744967));
            this.o7.getRightIcon().setOnClickListener(new y88(this, (byte) 8));
            this.p0.u(126);
            a8 e5 = this.p0.e(3, 2131232225, jb6.L0(2131745081));
            this.r0 = e5;
            e5.d(-328966, -328966);
            this.p0.e(12, 2131232176, jb6.L0(2131745664)).d(-328966, -328966);
            this.p0.e(5, 2131232230, jb6.L0(2131745076)).d(-328966, -328966);
            this.p0.e(25, 2131232388, jb6.L0(2131751641)).d(-328966, -328966);
            this.p0.e(21, 2131231881, jb6.L0(2131745996)).d(-328966, -328966);
            this.p0.e(23, 2131232339, jb6.L0(2131745945)).d(-328966, -328966);
            this.p0.e(9, 2131232371, jb6.L0(2131745193)).d(-328966, -328966);
            this.p0.e(13, 2131232388, jb6.L0(2131745062)).d(-328966, -328966);
            this.p0.e(14, 2131232272, jb6.L0(2131745276)).d(-328966, -328966);
            this.p0.e(19, 2131232414, jb6.L0(2131743643)).d(-328966, -328966);
            this.p0.e(20, 2131232414, jb6.L0(2131749061)).d(-328966, -328966);
            this.p0.e(7, 2131232114, jb6.L0(2131751535)).d(-328966, -328966);
            this.p0.e(8, 2131232093, jb6.L0(2131744528)).d(-328966, -328966);
            this.p0.I(-115203550);
            this.p0.u(19);
            this.p0.u(20);
            S1(false, true);
            this.p0.setPopupItemsSelectorColor(268435455);
            this.p0.setSubMenuDelegate(new s98(this));
            a6 a6Var = new a6(this.F, (byte) 23);
            this.j0 = a6Var;
            a6Var.setBackgroundColor(2130706432);
            this.f0.addView(this.j0, qoe.e(-1, 48, 83));
            View view3 = new View(this.F);
            this.k0 = view3;
            view3.setBackgroundColor(this.d2 == 11 ? -16777216 : 2130706432);
            this.h0.addView(this.k0, qoe.a(-1.0f, this.l0 / gm.p, 87));
            this.w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.w1[0].setShape(0);
            this.w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.w1[1].setShape(0);
            td5 td5Var = new td5(this.F, gm.L(10.0f));
            this.m1 = td5Var;
            this.f0.addView(td5Var, qoe.e(-1, 68, 83));
            this.m1.setDelegate(new u98(this));
            for (int i6 = 0; i6 < 3; i6++) {
                this.y3[i6] = new ImageView(this.E);
                this.y3[i6].setImageResource(2131232224);
                this.y3[i6].setContentDescription(jb6.M0(2131754717, "AccSwitchToFullscreen"));
                this.y3[i6].setScaleType(ImageView.ScaleType.CENTER);
                this.y3[i6].setBackground(cmb.f0(1090519039, 1, -1));
                this.y3[i6].setVisibility(4);
                this.y3[i6].setAlpha(1.0f);
                this.f0.addView(this.y3[i6], qoe.c(48.0f, 48));
                this.y3[i6].setOnClickListener(new m88(this, (byte) 0));
            }
            this.R = new v98(null, new r63(), (byte) 0);
            hb8 hb8Var = new hb8(this.f0.getContext());
            this.R1 = hb8Var;
            hb8Var.setFactory(new jl3(this, (byte) 3));
            this.R1.setVisibility(4);
            H1(true);
            int i7 = 0;
            for (int i8 = 3; i7 < i8; i8 = 3) {
                this.X0[i7] = new w98(this, this.f0);
                this.X0[i7].d(0, false, true);
                i7++;
            }
            dj1 dj1Var = new dj1(this, this.F, ylbVar);
            this.Y0 = dj1Var;
            dj1Var.setUseSelfAlpha(true);
            this.Y0.setProgressColor(-1);
            this.Y0.setSize(gm.L(54.0f));
            this.Y0.setBackgroundResource(2131231009);
            this.Y0.setVisibility(4);
            this.Y0.setAlpha(0.0f);
            this.f0.addView(this.Y0, qoe.e(64, 64, 17));
            H();
            RadialProgressView radialProgressView = new RadialProgressView(this.E, ylbVar);
            this.V7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.V7.setBackgroundResource(2131231009);
            this.V7.setVisibility(4);
            this.f0.addView(this.V7, qoe.e(54, 54, 17));
            kb2 kb2Var = new kb2(this.E, (byte) 3);
            this.U7 = kb2Var;
            kb2Var.setBackgroundColor(2130706432);
            this.U7.b();
            this.U7.setTranslationY(gm.L(120.0f));
            ((TextView) this.U7.b).setText(jb6.M0(2131751291, "Done").toUpperCase());
            int i10 = cmb.pg;
            anb.X((TextView) this.U7.b, i10, ylbVar);
            this.f0.addView(this.U7, qoe.e(-1, 48, 83));
            ((TextView) this.U7.d).setOnClickListener(new m88(this, (byte) 3));
            ((TextView) this.U7.b).setOnClickListener(new m88(this, (byte) 4));
            ucc uccVar = new ucc(false);
            this.A1 = uccVar;
            uccVar.n = new fk3(this);
            lb8 lb8Var3 = this.f0;
            Objects.requireNonNull(lb8Var3);
            this.B1 = new lx9(new q78(lb8Var3, (byte) 1), false);
            rb8 rb8Var = new rb8(this.E, this);
            this.T7 = rb8Var;
            rb8Var.setTranslationY(gm.L(120.0f));
            this.T7.setVisibility(4);
            this.T7.setBackgroundColor(2130706432);
            this.f0.addView(this.T7, qoe.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            jp0 jp0Var = new jp0(this, this.F);
            this.Q0 = jp0Var;
            this.f0.addView(jp0Var, qoe.e(-1, -2, 83));
            TextView textView = new TextView(this.f0.getContext());
            this.m0 = textView;
            textView.setTextSize(1, 15.0f);
            this.m0.setTypeface(gm.o());
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            TextView textView2 = this.m0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.Q0.addView(this.m0, qoe.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f0.getContext());
            this.n0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.n0.setSingleLine(true);
            this.n0.setMaxLines(1);
            this.n0.setEllipsize(truncateAt);
            this.n0.setTextColor(-1);
            this.n0.setGravity(3);
            this.Q0.addView(this.n0, qoe.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f0.getContext());
            this.o0 = textView4;
            int i11 = cmb.Ei;
            anb.R(textView4, ulb.e(y0(i11), 6.0f), anb.M(i11), anb.e(i11), ylbVar);
            TextView textView5 = this.o0;
            int i12 = cmb.Ii;
            anb.X(textView5, i12, ylbVar);
            this.o0.setEllipsize(truncateAt);
            this.o0.setGravity(17);
            this.o0.setLines(1);
            this.o0.setSingleLine(true);
            this.o0.setText(jb6.M0(2131745275, "SetAsMyPhoto"));
            this.o0.setTextSize(1, 15.0f);
            this.o0.setTypeface(gm.o());
            this.o0.setOnClickListener(new m88(this, (byte) 7));
            this.o0.setVisibility(8);
            this.Q0.addView(this.o0, qoe.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            x98 x98Var = new x98(this.E, this);
            this.X7 = x98Var;
            x98Var.setDelegate(new uz0(this));
            FrameLayout frameLayout = new FrameLayout(this.E);
            this.W7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.W7.addView(this.X7, qoe.e(-1, 54, 83));
            m2(false, false);
            this.f0.addView(this.W7, qoe.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            r7 r7Var = this.F0;
            if (r7Var != null) {
                im0 a8 = this.Z.a(r7Var);
                a8.p(qqd.i(ylbVar));
                a8.r(gm.L(20.0f));
                a8.q(gm.L(7.0f));
                r7Var.setBackground(tl0.d(a8, gm.L(54.0f), gm.L(54.0f)));
            }
            ?? cu3Var = new cu3(this.E, jb6.L0(2131751145));
            this.h1 = cu3Var;
            im0 a9 = this.Z.a(cu3Var);
            a9.p(qqd.i(ylbVar));
            cu3Var.setBlurredBackgroundDrawable(a9);
            rve.a(this.h1);
            this.h1.setOnClickListener(new m88(this, (byte) 8));
            this.f0.addView(this.h1, qoe.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            wb8 wb8Var = new wb8(this.E, ylbVar, this.c0);
            this.p5 = wb8Var;
            cu3 cu3Var2 = wb8Var.c;
            im0 a10 = this.Z.a(cu3Var2);
            a10.p(qqd.i(ylbVar));
            cu3Var2.setBlurredBackgroundDrawable(a10);
            rve.a(this.p5.c);
            this.p5.setVisibility(8);
            this.p5.setAlpha(0.0f);
            this.p5.setOnClose(new n88(this, (byte) 12));
            this.f0.addView(this.p5, qoe.e(-1, -1, 119));
            this.p5.b.setOnClickListener(new m88(this, (byte) 10));
            this.p5.setOnGalleryImage(new t88(this, (byte) 4));
            c7 c7Var = new c7((byte) 3, this.E, this);
            this.f1 = c7Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            c7Var.setScaleType(scaleType);
            c7 c7Var2 = this.f1;
            kc2 kc2Var = new kc2(this.E);
            this.e1 = kc2Var;
            c7Var2.setImageDrawable(kc2Var);
            this.f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            c7 c7Var3 = this.f1;
            im0 a11 = this.Z.a(c7Var3);
            a11.p(qqd.i(null));
            a11.q(gm.L(4.0f));
            a11.r(gm.L(16.0f));
            c7Var3.setBackground(a11);
            rve.a(this.f1);
            this.f0.addView(this.f1, qoe.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f1.setOnClickListener(new m88(this, (byte) 11));
            o96 o96Var = new o96(this.f0.getContext());
            this.g1 = o96Var;
            o96Var.setOnClickListener(new m88(this, (byte) 12));
            this.f0.addView(this.g1, qoe.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f0.getContext();
            z zVar2 = this.h0;
            lb8 lb8Var4 = this.f0;
            aa8 aa8Var2 = new aa8(this, context, zVar2, lb8Var4, lb8Var4, ylbVar, this.c0, new n88(this, (byte) 16));
            this.V1 = aa8Var2;
            aa8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.V1.setOnTimerChange(new t88(this, (byte) 5));
            this.V1.setAccount(this.U);
            this.V1.setOnHeightUpdate(new t88(this, (byte) 6));
            this.V1.setOnAddPhotoClick(new m88(this, (byte) 13));
            ContextThemeWrapper contextThemeWrapper = this.F;
            z zVar3 = this.h0;
            lb8 lb8Var5 = this.f0;
            ba8 ba8Var2 = new ba8(this, contextThemeWrapper, zVar3, lb8Var5, lb8Var5, ylbVar, this.c0, new n88(this, (byte) 16));
            this.W1 = ba8Var2;
            ba8Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.W1.D(true, false);
            this.W1.setOnTimerChange(new t88(this, (byte) 7));
            this.W1.setAccount(this.U);
            this.W1.setOnHeightUpdate(new t88(this, (byte) 8));
            this.W1.setOnAddPhotoClick(new m88(this, (byte) 14));
            yc ycVar = new yc(this, this.F);
            this.r5 = ycVar;
            ycVar.setVisibility(8);
            this.f0.addView(this.r5, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            n1b n1bVar2 = new n1b(this.F, ylbVar);
            this.o5 = n1bVar2;
            n1bVar2.setCurrentAccount(this.U);
            lb8 lb8Var6 = this.f0;
            lb8Var6.addView(this.o5, lb8Var6.indexOfChild(this.G) - 1, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            db8 db8Var = new db8(this);
            this.s5 = db8Var;
            db8Var.setRad(18);
            this.s5.l();
            this.o5.setStickerCutOutBtn(this.s5);
            this.s5.setOnClickListener(new m88(this, (byte) 15));
            this.s5.setCutOutState(false);
            this.f0.addView(this.s5, qoe.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.E);
            this.t5 = linearLayout2;
            linearLayout2.setOrientation(0);
            db8 db8Var2 = new db8(this);
            this.u5 = db8Var2;
            db8Var2.s0 = true;
            db8Var2.setRad(18);
            this.u5.setEraseState(false);
            this.u5.setOnClickListener(new m88(this, (byte) 16));
            this.t5.addView(this.u5, qoe.o(-2, 36));
            this.t5.addView(new Space(this.E), qoe.o(12, -1));
            db8 db8Var3 = new db8(this);
            this.v5 = db8Var3;
            db8Var3.s0 = true;
            db8Var3.setRad(18);
            this.v5.setRestoreState(false);
            this.v5.setOnClickListener(new m88(this, (byte) 17));
            this.t5.addView(this.v5, qoe.o(-2, 36));
            this.f0.addView(this.t5, qoe.e(-2, 36, 17));
            db8 db8Var4 = new db8(this);
            this.w5 = db8Var4;
            db8Var4.setUndoState(false);
            this.w5.setRad(18);
            db8 db8Var5 = this.w5;
            db8Var5.s0 = true;
            db8Var5.setOnClickListener(new m88(this, (byte) 18));
            this.f0.addView(this.w5, qoe.e(-2, 36, 17));
            db8 db8Var6 = new db8(this);
            this.x5 = db8Var6;
            db8Var6.setOutlineState(false);
            this.x5.setRad(18);
            db8 db8Var7 = this.x5;
            db8Var7.s0 = true;
            db8Var7.setOnClickListener(new m88(this, (byte) 19));
            this.f0.addView(this.x5, qoe.e(-2, 36, 17));
            f2(false, false);
            k2(false, false);
            ne6 ne6Var = new ne6((byte) 9, this.E, this);
            this.Y1 = ne6Var;
            ne6Var.addView(this.V1, qoe.e(-1, -1, 83));
            this.f0.addView(this.Y1, qoe.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.E);
            this.Z1 = frameLayout2;
            frameLayout2.addView(this.W1, qoe.e(-1, -1, 51));
            this.f0.addView(this.Z1, qoe.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.E);
            this.R0 = frameLayout3;
            this.f0.addView(frameLayout3, qoe.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.E);
            this.S0 = frameLayout4;
            this.f0.addView(frameLayout4, qoe.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.E);
            this.Y7 = textView6;
            textView6.setSingleLine(true);
            this.Y7.setVisibility(8);
            this.Y7.setText(jb6.M0(2131752070, "ChooseCover"));
            this.Y7.setGravity(1);
            this.Y7.setTextSize(1, 14.0f);
            this.Y7.setTextColor(-7566196);
            this.f0.addView(this.Y7, qoe.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            vi3 vi3Var = new vi3(this, this.E, ylbVar);
            this.T0 = vi3Var;
            int L = gm.L(52.0f);
            int L2 = gm.L(38.0f);
            vi3Var.L = L;
            vi3Var.M = L2;
            vi3 vi3Var2 = this.T0;
            vi3Var2.s0 = true;
            im0 a12 = this.Z.a(vi3Var2);
            a12.p(qqd.i(ylbVar));
            vi3Var2.setBlurredBackgroundDrawable(a12);
            this.f0.addView(this.T0, qoe.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.T0.setContentDescription(jb6.M0(2131745374, "Send"));
            rve.a(this.T0);
            this.T0.setOnClickListener(new m88(this, (byte) 20));
            this.T0.setOnLongClickListener(new au(this, (byte) 10));
            j85 j85Var = new j85(this.E);
            this.U0 = j85Var;
            LinearLayout linearLayout3 = j85Var.b;
            im0 a13 = this.Z.a(linearLayout3);
            a13.p(qqd.i(ylbVar));
            a13.r(gm.L(18.0f));
            a13.q(gm.L(7.0f));
            linearLayout3.setBackground(a13);
            LinearLayout linearLayout4 = this.U0.c;
            im0 a14 = this.Z.a(linearLayout4);
            a14.p(qqd.i(ylbVar));
            a14.r(gm.L(18.0f));
            a14.q(gm.L(7.0f));
            linearLayout4.setBackground(a14);
            this.U0.setVisibility(8);
            this.U0.b.setOnClickListener(new m88(this, (byte) 21));
            this.U0.c.setOnClickListener(new m88(this, (byte) 22));
            this.f0.addView(this.U0, qoe.e(-1, 56, 80));
            qmb qmbVar2 = new qmb((byte) 9, this.E, this);
            this.I0 = qmbVar2;
            qmbVar2.setOrientation(0);
            this.I0.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
            qmb qmbVar3 = this.I0;
            im0 a15 = this.Z.a(qmbVar3);
            a15.p(qqd.i(ylbVar));
            a15.q(gm.L(2.0f));
            a15.r(gm.L(22.0f));
            qmbVar3.setBackground(a15);
            this.Q0.addView(this.I0, qoe.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.E);
            this.a1 = imageView;
            imageView.setScaleType(scaleType);
            this.a1.setImageResource(2131231734);
            ImageView imageView2 = this.a1;
            int L3 = gm.L(4.0f);
            int L4 = gm.L(6.0f);
            imageView2.setBackground(cmb.W(gm.L(22.0f), 285212671, L3, L4, L3, L4));
            this.I0.addView(this.a1, qoe.o(48, 48));
            this.a1.setOnClickListener(new m88(this, (byte) 23));
            this.a1.setContentDescription(jb6.M0(2131751635, "CropImage"));
            ImageView imageView3 = new ImageView(this.E);
            this.c1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.c1.setImageResource(2131232288);
            ImageView imageView4 = this.c1;
            int L5 = gm.L(4.0f);
            int L6 = gm.L(6.0f);
            imageView4.setBackground(cmb.W(gm.L(22.0f), 285212671, L5, L6, L5, L6));
            this.I0.addView(this.c1, qoe.o(48, 48));
            this.c1.setOnClickListener(new m88(this, (byte) 24));
            this.c1.setContentDescription(jb6.M0(2131754782, "AccDescrRotate"));
            ImageView imageView5 = new ImageView(this.E);
            this.b1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.b1.setImageResource(2131231747);
            ImageView imageView6 = this.b1;
            int L7 = gm.L(4.0f);
            int L8 = gm.L(6.0f);
            imageView6.setBackground(cmb.W(gm.L(22.0f), 285212671, L7, L8, L7, L8));
            this.I0.addView(this.b1, qoe.o(48, 48));
            this.b1.setOnClickListener(new m88(this, (byte) 25));
            this.b1.setContentDescription(jb6.M0(2131754839, "AccDescrMirror"));
            ImageView imageView7 = new ImageView(this.E);
            this.Z0 = imageView7;
            imageView7.setScaleType(scaleType);
            this.Z0.setImageResource(2131231744);
            ImageView imageView8 = this.Z0;
            int L9 = gm.L(4.0f);
            int L10 = gm.L(6.0f);
            imageView8.setBackground(cmb.W(gm.L(22.0f), 285212671, L9, L10, L9, L10));
            this.I0.addView(this.Z0, qoe.o(48, 48));
            this.Z0.setOnClickListener(new m88(this, (byte) 26));
            this.Z0.setContentDescription(jb6.M0(2131754809, "AccDescrPhotoEditor"));
            kcc kccVar = new kcc(this.E);
            this.k1 = kccVar;
            kccVar.setTag(1);
            kcc kccVar2 = this.k1;
            int L11 = gm.L(4.0f);
            int L12 = gm.L(6.0f);
            kccVar2.setBackground(cmb.W(gm.L(22.0f), 285212671, L11, L12, L11, L12));
            this.d8 = E1();
            this.k1.a(Math.min(this.j8, this.k8), this.p8 && this.e8 > 1, this.r);
            this.k1.setContentDescription(jb6.M0(2131754734, "AccDescrVideoQuality"));
            this.I0.addView(this.k1, qoe.o(48, 48));
            this.k1.setOnClickListener(new n06(this, parentActivity, (byte) 19));
            ImageView imageView9 = new ImageView(this.E);
            this.d1 = imageView9;
            imageView9.setScaleType(scaleType);
            this.d1.setImageResource(2131231761);
            ImageView imageView10 = this.d1;
            int L13 = gm.L(4.0f);
            int L14 = gm.L(6.0f);
            imageView10.setBackground(cmb.W(gm.L(22.0f), 285212671, L13, L14, L13, L14));
            this.I0.addView(this.d1, qoe.o(48, 48));
            this.d1.setOnClickListener(new m88(this, (byte) 27));
            this.d1.setContentDescription(jb6.M0(2131754810, "AccDescrPhotoAdjust"));
            kb2 kb2Var2 = new kb2(this.F, (byte) 3);
            this.V0 = kb2Var2;
            kb2Var2.setBackgroundColor(-872415232);
            this.V0.b();
            this.V0.setVisibility(8);
            this.f0.addView(this.V0, qoe.e(-1, 48, 83));
            ((TextView) this.V0.d).setOnClickListener(new m88(this, (byte) 28));
            ((TextView) this.V0.b).setOnClickListener(new m88(this, (byte) 29));
            TextView textView7 = new TextView(this.F);
            this.W0 = textView7;
            textView7.setClickable(false);
            this.W0.setVisibility(8);
            this.W0.setTextSize(1, 14.0f);
            this.W0.setTextColor(-1);
            this.W0.setGravity(17);
            this.W0.setBackgroundDrawable(cmb.e0(-12763843, 0));
            this.W0.setPadding(gm.L(20.0f), 0, gm.L(20.0f), 0);
            this.W0.setText(jb6.L0(2131751633).toUpperCase());
            this.W0.setTypeface(gm.o());
            this.V0.addView(this.W0, qoe.e(-2, -1, 49));
            this.W0.setOnClickListener(new y88(this, (byte) 0));
            ou4 ou4Var = new ou4(this.f0.getContext(), this);
            this.q6 = ou4Var;
            ou4Var.v = false;
            this.r6 = true;
            ou4Var.h = this;
            u88 u88Var2 = new u88(this);
            this.B4.p0(this.f0);
            ImageReceiver imageReceiver = this.B4;
            imageReceiver.l1 = (byte) 2;
            imageReceiver.K0 = true;
            imageReceiver.h1 = u88Var2;
            this.A4.p0(this.f0);
            ImageReceiver imageReceiver2 = this.A4;
            imageReceiver2.l1 = (byte) 2;
            imageReceiver2.K0 = true;
            imageReceiver2.h1 = u88Var2;
            this.C4.p0(this.f0);
            ImageReceiver imageReceiver3 = this.C4;
            imageReceiver3.l1 = (byte) 2;
            imageReceiver3.K0 = true;
            imageReceiver3.h1 = u88Var2;
            int rotation = ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f0.getContext(), 2131232709);
            this.O0 = checkBox;
            checkBox.setDrawBackground(true);
            this.O0.setHasBorder(true);
            this.O0.setSize(34);
            this.O0.setCheckOffset(gm.L(1.0f));
            this.O0.c(y0(i10), -1);
            this.O0.setVisibility(8);
            this.f0.addView(this.O0, qoe.d(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
            if (!this.s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += gm.m;
            }
            this.O0.setOnClickListener(new y88(this, (byte) 1));
            CounterView counterView = new CounterView(this.E);
            this.P0 = counterView;
            this.f0.addView(counterView, qoe.d(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
            if (!this.s) {
                ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += gm.m;
            }
            this.P0.setOnClickListener(new y88(this, (byte) 2));
            ub8 ub8Var = new ub8(this.E);
            this.p1 = ub8Var;
            ub8Var.setVisibility(8);
            this.p1.setAlpha(0.0f);
            this.p1.setLayoutManager(new zs((byte) 11, 0, true));
            ub8 ub8Var2 = this.p1;
            s30 s30Var = new s30(this, this.E, (byte) 13);
            this.q1 = s30Var;
            ub8Var2.setAdapter(s30Var);
            this.f0.addView(this.p1, qoe.e(-1, 103, 51));
            this.p1.setOnItemClickListener(new kg4(this, (byte) 20));
            UndoView undoView = new UndoView(this.F, null, false, ylbVar);
            this.o1 = undoView;
            undoView.setAdditionalTranslationY(gm.L(112.0f));
            this.o1.h(-115203550, -1);
            this.f0.addView(this.o1, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (gm.A1()) {
                View view4 = new View(this.F);
                this.T3 = view4;
                view4.setContentDescription(jb6.M0(2131754929, "AccActionPlay"));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new y88(this, (byte) 3));
                this.f0.addView(this.T3, qoe.e(64, 64, 17));
            }
            anb.R(this.o0, ulb.e(y0(i11), 6.0f), anb.M(i11), anb.e(i11), ylbVar);
            anb.X(this.o0, i12, ylbVar);
            v98 v98Var = this.R;
            v98Var.j0 = true;
            v98Var.h0 = false;
            rkb m = v98Var.m(this.h0.getContext());
            gm.B2(m);
            this.f0.addView(m);
            this.R.Q(this.f0);
            this.R.P();
            this.a.a(false, false);
            return;
        }
        G2();
    }

    public final boolean T2() {
        un5 un5Var = this.p2;
        if (un5Var != null && un5Var.d && !un5Var.e) {
            return true;
        }
        return false;
    }

    public final void U(TLRPC.Document document, TLRPC.Document document2, boolean z, defpackage.f fVar) {
        float f;
        this.z7 = document;
        this.y7 = document2;
        this.A7 = z;
        this.B7 = false;
        this.C7 = fVar;
        this.a6 = 0.0f;
        this.e6 = 0.0f;
        if (this.o5 != null) {
            db8 db8Var = this.x5;
            if (db8Var != null) {
                db8Var.m(false, false);
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
                        TLRPC.TL_messages_stickerSet n0 = hs6.d0(i).n0(documentAttribute.stickerset, true);
                        if (n0 != null && n0.packs != null) {
                            for (int i3 = 0; i3 < n0.packs.size(); i3++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i3);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.id)) && gw3.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && gw3.g(documentAttribute.alt) != null) {
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
        db8 db8Var2 = this.s5;
        if (db8Var2 != null) {
            db8Var2.setCutOutState(false);
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
                    pb8 pb8Var = this.d;
                    if (pb8Var != null && !pb8Var.P()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.O4);
                    if (obj instanceof jo6) {
                        return ((jo6) obj).j();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void U1(i22 i22Var) {
        this.b2 = i22Var;
        a26 a26Var = this.c2;
        if (a26Var != null) {
            a26Var.a();
            this.c2 = null;
        }
        if (i22Var != null) {
            dbc dbcVar = i22Var.j1;
            if (dbcVar == null) {
                dbcVar = new dbc(i22Var.getWindow());
                i22Var.j1 = dbcVar;
            }
            this.c2 = new a26(dbcVar);
        }
    }

    public final boolean V0() {
        if (this.e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void V1() {
        yv1 yv1Var;
        TLRPC.Chat chat;
        pb8 pb8Var = this.d;
        if (pb8Var != null) {
            if (pb8Var.u() != null && this.h > 0 && this.d.u().size() >= this.h && !this.d.w(this.O4)) {
                if (this.n && (yv1Var = this.k4) != null && (chat = yv1Var.e) != null && !sd2.N(chat) && chat.slowmode_enabled) {
                    ik.K(this.E, jb6.M0(2131745044, "Slowmode"), jb6.M0(2131745037, "SlowmodeSelectSendError")).o();
                    return;
                }
                return;
            }
            int E = this.d.E(this.O4, l0());
            boolean w = this.d.w(this.O4);
            this.O0.b(w, true);
            if (E >= 0) {
                s30 s30Var = this.q1;
                if (w) {
                    s30Var.i(E);
                    this.p1.z0(E);
                } else {
                    s30Var.s(E);
                    if (E == 0) {
                        this.q1.g(0);
                    }
                }
            }
            O2();
        }
    }

    public final void W() {
        ad8 ad8Var = this.U8;
        if (ad8Var != null && ad8Var.e()) {
            return;
        }
        this.U8 = yc3.c().k(this.c9);
    }

    public final void W0() {
        WindowManager.LayoutParams layoutParams = this.e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.h0.setFocusable(true);
        this.f0.setFocusable(true);
    }

    public final void W1() {
        float q = this.B4.q();
        float o = this.B4.o();
        if (q != 0.0f && o != 0.0f) {
            float i0 = i0(this.t4);
            float g0 = g0();
            float min = Math.min(g0 / o, i0 / q);
            float max = Math.max(i0 / ((int) (q * min)), g0 / ((int) (o * min)));
            this.Z5 = max;
            I2(max);
        }
    }

    public final void X0(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        boolean z2;
        int i;
        Bitmap.CompressFormat e0 = e0();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z2 = true;
            } catch (Throwable th) {
                fc4.g(th, true);
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
        createBitmap.compress(e0, i, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (z2) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final void X1(CharSequence charSequence) {
        ob8 ob8Var = this.N;
        this.e4 = (String) charSequence;
        ob8Var.c(charSequence);
        t2(true, false);
    }

    public final void Y0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y0(boolean):void");
    }

    public final void Y1(boolean z, boolean z2) {
        if (this.l3 != z) {
            a6 a6Var = this.j0;
            if (z) {
                a6Var.setTag(1);
            } else {
                a6Var.setTag(null);
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
                ofFloat.addUpdateListener(new h88(this, (byte) 0));
                ofFloat.addListener(new pa8(this, z, (byte) 0));
                this.k3 = ofFloat;
                ofFloat.start();
            } else {
                vb8 vb8Var = this.i3;
                if (!z) {
                    i = 8;
                }
                vb8Var.setVisibility(i);
                vb8 vb8Var2 = this.i3;
                if (z) {
                    f = 1.0f;
                }
                vb8Var2.setAlpha(f);
            }
            if (this.l2 && this.i7 == null) {
                r7 r7Var = this.p0;
                if (z) {
                    r7Var.S(9);
                } else {
                    r7Var.u(9);
                }
            }
        }
    }

    public final int Z(int i) {
        if (i != 1) {
            if (i == 0) {
                if (this.d2 != 1) {
                    return 0;
                }
            } else if (i != 5 && i != 4 && i != 3) {
                return gm.L(14.0f);
            } else {
                return 0;
            }
        }
        return gm.L(16.0f);
    }

    public final void Z0(android.graphics.Canvas r62) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Z0(android.graphics.Canvas):void");
    }

    public final boolean Z1(int i) {
        mb8 mb8Var = this.i7;
        if (mb8Var != null) {
            if (mb8Var.a(i) || this.i7.e(i)) {
                boolean z = gda.a;
                if (e86.e(1024)) {
                    File b = this.i7.b(i);
                    if (b != null && b.exists()) {
                        return true;
                    }
                    if (gda.x0 && (this.i7.d(i) instanceof TLRPC.Document)) {
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

    public final int a0(int i) {
        int L;
        int i2 = 0;
        if (i >= 0) {
            if (i != 1 && (i != 0 || this.d2 != 1)) {
                if (i == 3 && this.M1 != null) {
                    int L2 = gm.L(8.0f);
                    if (!this.s) {
                        i2 = gm.m;
                    }
                    return this.M1.getAdditionalTop() + L2 + i2;
                } else if (i != 0 && i != 4 && i != 5) {
                    L = gm.L(14.0f);
                    if (!this.s) {
                        i2 = gm.m;
                    }
                }
            } else {
                L = gm.L(16.0f);
                if (!this.s) {
                    i2 = gm.m;
                }
            }
            return L + i2;
        }
        return 0;
    }

    public final void a1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).a1.remove(this.t1);
        }
        org.telegram.ui.ActionBar.d dVar = this.l4;
        if (dVar != null && dVar.getFragmentView() != null) {
            this.l6 = 1.0f;
            View fragmentView = this.l4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            i22 i22Var = this.b2;
            if (i22Var != null) {
                dy0 dy0Var = i22Var.c;
                dy0Var.setScaleX(1.0f);
                dy0Var.setScaleY(1.0f);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f));
        this.o6.setInterpolator(this.s6);
        this.o6.setDuration(250L);
        this.o6.addListener(new ha8(this, (byte) 7));
        this.o6.start();
    }

    public final int b0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.b0(boolean):int");
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
                    nk3 nk3Var = new nk3(null);
                    nk3Var.p2 = url;
                    ((LaunchActivity) this.E).u0(nk3Var, false, true);
                    A(false, false);
                    return;
                }
                return;
            } else if (this.k4 != null && ((clickableSpan instanceof i6c) || gm.D3(url))) {
                ik.n0(this.k4, url, true, true);
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
                he heVar = this.Q1;
                if (heVar != null) {
                    heVar.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            try {
                he o = alertDialog$Builder.o();
                this.Q1 = o;
                o.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new n1(this, (byte) 29));
            } catch (Exception e2) {
                fc4.g(e2, true);
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
                CharSequence text = d0().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.u7 && !TextUtils.equals(this.v7, text) && this.d.T(this.O4) != 0 && this.d.H() > 0) {
                    this.u7 = false;
                }
                hs6 d0 = hs6.d0(this.U);
                yv1 yv1Var = this.k4;
                if (yv1Var != null && ((encryptedChat = yv1Var.h) == null || gm.W0(encryptedChat.layer) >= 101)) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList Y = d0.Y(charSequenceArr, z, true);
                CharSequence charSequence = charSequenceArr[0];
                this.v7 = charSequence;
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    jo6Var.a = charSequence;
                    jo6Var.n = Y;
                } else if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    no6Var.I = charSequence;
                    no6Var.n = Y;
                }
                if (text.length() != 0 && !this.d.w(this.O4)) {
                    V1();
                }
                pb8 pb8Var = this.d;
                if (pb8Var != null) {
                    pb8Var.f(text);
                }
            }
        }
    }

    public final ClippingImageView[] c0(qb8 qb8Var) {
        int i;
        if (!gm.O1() && qb8Var != null && qb8Var.m != null) {
            i = 1;
        } else {
            i = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i + 1];
        clippingImageViewArr[0] = this.i0;
        if (i != 0) {
            bfa bfaVar = qb8Var.m;
            clippingImageViewArr[1] = bfaVar;
            bfaVar.setAdditionalTranslationY(qb8Var.n);
        }
        return clippingImageViewArr;
    }

    public final void c1(qb8 qb8Var) {
        if (this.v2) {
            w1(true);
        }
        k47 k47Var = this.S4;
        if (k47Var != null && !k47Var.P) {
            bc4.G(this.U).f(this.S4.F0());
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
        ta8 ta8Var = this.U1;
        if (ta8Var != null) {
            ta8Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.e2 = false;
        this.f2 = false;
        this.g2 = false;
        this.i2 = false;
        jn5 jn5Var = this.i5;
        if (jn5Var != null) {
            jn5Var.a();
            this.i5 = null;
        }
        this.b2 = null;
        a26 a26Var = this.c2;
        if (a26Var != null) {
            a26Var.a();
            this.c2 = null;
        }
        kn knVar = this.k2;
        if (knVar != null) {
            knVar.w(this.f0);
            this.k2 = null;
        }
        for (int i = 0; i < 3; i++) {
            w98 w98Var = this.X0[i];
            if (w98Var != null) {
                w98Var.d(-1, false, true);
            }
        }
        x1(0);
        x98 x98Var = this.X7;
        if (x98Var != null) {
            x98Var.a();
        }
        this.o1.d(0, false);
        this.B4.g0(null);
        this.E4.a();
        this.A4.g0(null);
        this.D4.a();
        this.C4.g0(null);
        this.F4.a();
        this.f0.post(new q88(this, qb8Var, (byte) 0));
        pb8 pb8Var = this.d;
        if (pb8Var != null) {
            pb8Var.G();
        }
        td5 td5Var = this.m1;
        td5Var.d.clear();
        td5Var.e.clear();
        td5Var.c.clear();
        pb8 pb8Var2 = this.d;
        if (pb8Var2 != null) {
            pb8Var2.D();
        }
        this.d = null;
        this.q1.f();
        this.i7 = null;
        this.r4 = false;
        this.t8 = 0.0f;
        this.u8 = 1.0f;
        if (qb8Var != null) {
            qb8Var.a.v0(true, true);
        }
        yv1 yv1Var = this.k4;
        if (yv1Var != null) {
            yv1Var.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.N4;
        if (bitmap != null) {
            bitmap.recycle();
            this.N4 = null;
        }
    }

    public final boolean c2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.d dVar = this.l4;
        if ((dVar instanceof yv1) && sd2.V(((yv1) dVar).e)) {
            u31 f = new c41(frameLayout, this.w2).f(oc7.r1(this.U).l4.h1.f(), new b98(this, (byte) 3));
            f.w = new b98(this, (byte) 4);
            this.s7 = f.j();
            return true;
        }
        return false;
    }

    public final void d(android.graphics.Canvas r25, int r26, int r27, int r28, int r29, float r30, defpackage.n43 r31, defpackage.ao6 r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d(android.graphics.Canvas, int, int, int, int, float, n43, ao6):void");
    }

    public final tc1 d0() {
        pb8 pb8Var = this.d;
        if (pb8Var != null && pb8Var.z()) {
            return this.W1;
        }
        return this.V1;
    }

    public final void d1(defpackage.k47 r22, org.telegram.tgnet.TLRPC.FileLocation r23, defpackage.gn5 r24, defpackage.gn5 r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, defpackage.qb8 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d1(k47, org.telegram.tgnet.TLRPC$FileLocation, gn5, gn5, java.util.ArrayList, java.util.ArrayList, java.util.List, int, qb8):void");
    }

    public final void d2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.w2, this.E);
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
        k47 k47Var = this.S4;
        if (k47Var != null && k47.K4(k47Var.k) && bc4.G(this.S4.K1).S(this.b5[0])) {
            heVar.U = jb6.M0(2131746937, null);
        } else {
            heVar.U = jb6.M0(2131746951, null);
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

    public final Bitmap.CompressFormat e0() {
        if (this.d2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void e1() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        boolean z;
        if (this.E != null && this.l2) {
            try {
                k47 k47Var = this.S4;
                boolean z2 = false;
                File file = null;
                file = null;
                file = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = null;
                if (k47Var != null) {
                    boolean K4 = k47.K4(k47Var.k);
                    if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                        File file2 = new File(this.S4.k.attachPath);
                        if (file2.exists()) {
                            file = file2;
                        }
                    }
                    if (file == null) {
                        bc4.G(this.U);
                        file = bc4.M(this.S4.k, false, true);
                    }
                    z2 = K4;
                } else if (this.Z4 != null) {
                    bc4.G(this.U);
                    gn5 gn5Var = this.Z4;
                    if (gn5Var == null) {
                        tL_fileLocationToBeDeprecated = null;
                    } else {
                        tL_fileLocationToBeDeprecated = gn5Var.f;
                    }
                    String o0 = o0(gn5Var);
                    if (this.y5 == 0 && !this.A5) {
                        z = false;
                    } else {
                        z = true;
                    }
                    File J = bc4.J(tL_fileLocationToBeDeprecated, o0, z, true);
                    if (J != null && J.exists()) {
                        file = J;
                    } else {
                        bc4.G(this.U);
                        gn5 gn5Var2 = this.Z4;
                        if (gn5Var2 != null) {
                            tL_fileLocationToBeDeprecated2 = gn5Var2.f;
                        }
                        file = bc4.J(tL_fileLocationToBeDeprecated2, o0(gn5Var2), false, true);
                    }
                } else {
                    mb8 mb8Var = this.i7;
                    if (mb8Var != null) {
                        file = mb8Var.b(this.O4);
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(bc4.z(4), file.getName());
                }
                if (file != null && file.exists()) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (z2) {
                        intent.setType("video/mp4");
                    } else {
                        k47 k47Var2 = this.S4;
                        if (k47Var2 != null) {
                            intent.setType(k47Var2.t1());
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
                    this.E.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, "ShareFile")), 500);
                    return;
                }
                d2();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void e2(final tc1 tc1Var, boolean z, boolean z2, final float[] fArr) {
        float f;
        float f2;
        int i;
        pb8 pb8Var = this.d;
        if (pb8Var != null && pb8Var.l()) {
            f = 175.0f;
        } else {
            f = 58.0f;
        }
        float L = gm.L(f);
        float f3 = 1.0f;
        if (tc1Var == this.W1) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        float f4 = L * f2;
        Integer num = null;
        if (!z2) {
            tc1Var.animate().setListener(null).cancel();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tc1Var.setVisibility(i);
            if (z) {
                f4 = 0.0f;
            }
            tc1Var.setTranslationY(f4);
            float alpha = this.Q0.getAlpha();
            if (!z) {
                f3 = 0.0f;
            }
            fArr[0] = f3;
            tc1Var.setAlpha(alpha * f3);
        } else if (z) {
            if (tc1Var.getTag() == null) {
                if (tc1Var.getVisibility() != 0) {
                    tc1Var.setVisibility(0);
                    tc1Var.setAlpha(this.Q0.getAlpha());
                    tc1Var.setTranslationY(f4);
                }
                tc1Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final PhotoViewer b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b = r4;
                        float[] fArr2 = fArr;
                        tc1 tc1Var2 = tc1Var;
                        PhotoViewer photoViewer = this.b;
                        switch (b) {
                            case 0:
                                Drawable[] drawableArr = PhotoViewer.d9;
                                float alpha2 = photoViewer.Q0.getAlpha();
                                float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction;
                                tc1Var2.setAlpha(alpha2 * animatedFraction);
                                if (tc1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout = photoViewer.W7;
                                    if (frameLayout != null) {
                                        frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                return;
                            default:
                                Drawable[] drawableArr2 = PhotoViewer.d9;
                                float alpha3 = photoViewer.Q0.getAlpha();
                                float animatedFraction2 = valueAnimator.getAnimatedFraction();
                                fArr2[0] = animatedFraction2;
                                tc1Var2.setAlpha(alpha3 * animatedFraction2);
                                if (tc1Var2 == photoViewer.V1) {
                                    FrameLayout frameLayout2 = photoViewer.W7;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    }
                                    photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                    photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.H0();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(d53.h).start();
            }
        } else if (tc1Var.getTag() != null) {
            tc1Var.animate().translationY(f4).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r4;
                    float[] fArr2 = fArr;
                    tc1 tc1Var2 = tc1Var;
                    PhotoViewer photoViewer = this.b;
                    switch (b) {
                        case 0:
                            Drawable[] drawableArr = PhotoViewer.d9;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction;
                            tc1Var2.setAlpha(alpha2 * animatedFraction);
                            if (tc1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.W7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            return;
                        default:
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            float alpha3 = photoViewer.Q0.getAlpha();
                            float animatedFraction2 = valueAnimator.getAnimatedFraction();
                            fArr2[0] = animatedFraction2;
                            tc1Var2.setAlpha(alpha3 * animatedFraction2);
                            if (tc1Var2 == photoViewer.V1) {
                                FrameLayout frameLayout2 = photoViewer.W7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.g1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.h1.setTranslationY(photoViewer.V1.getAlpha() * (-b10.c(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.H0();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(d53.h).withEndAction(new qc1(tc1Var, (byte) 1)).start();
        }
        if (z) {
            num = 1;
        }
        tc1Var.setTag(num);
    }

    public final void f(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f(android.graphics.Bitmap):void");
    }

    public final int f0(int i, boolean z) {
        int measuredHeight;
        int additionalTop;
        boolean z2;
        if (!z && !(z2 = this.s)) {
            measuredHeight = (gm.n - this.t2.bottom) + gm.q.y;
            if ((i == 0 || i == 4 || i == 5) && this.d2 != 1 && !z2) {
                measuredHeight += gm.m;
            }
        } else {
            measuredHeight = this.f0.getMeasuredHeight();
        }
        if ((i == 0 && this.d2 == 1) || i == 1) {
            additionalTop = gm.L(144.0f);
        } else if (i == 2) {
            additionalTop = gm.L(214.0f);
        } else if (i == 3) {
            additionalTop = this.M1.getAdditionalTop() + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.M1.getAdditionalBottom() + gm.L(48.0f);
        } else {
            return measuredHeight;
        }
        return measuredHeight - additionalTop;
    }

    public final boolean f1(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f1(android.view.MotionEvent):boolean");
    }

    public final void f2(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        pb8 pb8Var = this.d;
        boolean z5 = false;
        if (pb8Var != null && pb8Var.z()) {
            z3 = true;
        } else {
            z3 = false;
        }
        aa8 aa8Var = this.V1;
        if (z && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        e2(aa8Var, z4, z2, this.D7);
        ba8 ba8Var = this.W1;
        if (z && z3) {
            z5 = true;
        }
        e2(ba8Var, z5, z2, this.E7);
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
        ao6 ao6Var;
        if (this.o6 != null) {
            f5 = gm.R1(0.0f, this.f6, this.k6);
            f = gm.R1(this.Z5, this.d6, this.k6);
            f2 = gm.R1(this.a6, this.e6, this.k6);
            f3 = gm.R1(this.X5, this.c6, this.k6);
            f4 = gm.R1(this.W5, this.b6, this.k6);
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
        int i0 = i0(this.t4);
        int g0 = g0();
        canvas.translate(Z(this.t4), a0(this.t4));
        canvas.translate(f4, f3 + 0.0f);
        canvas.scale(f, f);
        canvas.rotate(f2);
        int q = this.B4.q();
        int o = this.B4.o();
        float f11 = i0;
        float f12 = q;
        float f13 = f11 / f12;
        float f14 = g0;
        float f15 = o;
        float f16 = f14 / f15;
        float min = Math.min(f13, f16);
        n43 n43Var = this.E1;
        int i = n43Var.i;
        if (i == 90 || i == 270) {
            o = q;
            q = o;
        }
        float f17 = n43Var.j;
        float f18 = n43Var.k;
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
        ib8 ib8Var = this.W4;
        if (i2 != 1 && ((this.t4 != 1 || this.n6 == 0) && ib8Var.c != null)) {
            float f26 = f22 * f25;
            float f27 = f24 * f25;
            if (f13 * f15 > f14) {
                f13 = f16;
            }
            float A = td4.A((f12 * f13) / f21, f26, 0.0f, f26);
            float A2 = td4.A((f15 * f13) / f21, f27, 0.0f, f27);
            canvas.clipRect((-A) / 2.0f, (-A2) / 2.0f, A / 2.0f, A2 / 2.0f);
        }
        if (this.d2 == 1 || n43Var.a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                ao6 ao6Var2 = ib8Var.c;
                if (ao6Var2 != null && ao6Var2.l) {
                    f8 = -1.0f;
                } else {
                    f8 = 1.0f;
                }
                textureView.setScaleX(f8);
                kb8 kb8Var = this.F2;
                if (kb8Var != null) {
                    kb8Var.setScaleX(this.C2.getScaleX());
                }
            }
            ao6 ao6Var3 = ib8Var.c;
            if (ao6Var3 != null) {
                f6 = ao6Var3.c;
                f7 = 1.0f;
            } else {
                f6 = 1.0f;
                f7 = 1.0f;
            }
            float A3 = ((f25 / min) / td4.A(f6, f7, 0.0f, f7)) * f6;
            canvas.translate(n43Var.d * f7, n43Var.e * f7);
            canvas.scale(A3, A3);
            canvas.translate(mlb.C(n43Var.b, f19, min, f7), mlb.C(n43Var.c, f20, min, f7));
            float f28 = n43Var.g + i;
            if (f28 > 180.0f) {
                f28 -= 360.0f;
            }
            canvas.rotate(f28);
        }
        if (!this.f7.isEmpty() && (ao6Var = ib8Var.c) != null && ao6Var.l) {
            f10 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f10 = 1.0f;
        }
        if (f5 > 0.0f) {
            canvas.scale(f10 - (2.0f * f5), f10);
            canvas.skew(0.0f, td4.z(f10, f5, 4.0f * f5, 0.25f));
        }
    }

    public final int g0() {
        return f0(this.t4, false);
    }

    public final void g1() {
        Activity activity;
        if (!gm.F1(this.E)) {
            if (!gm.E && (Build.VERSION.SDK_INT < 24 || (activity = this.E) == null || !activity.isInMultiWindowMode())) {
                if (this.G2 != null) {
                    if (!this.P3) {
                        return;
                    }
                } else {
                    ya8 ya8Var = this.g0;
                    if (ya8Var == null || !ya8Var.y || !ya8Var.H) {
                        return;
                    }
                }
                p1();
                return;
            }
            fc4.b("PhotoViewer: onStop in multi-window mode, keep playing");
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

    public final int h0() {
        return i0(this.t4);
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
            jp0 jp0Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.V1.getEditTextHeight() + jp0Var.getHeight();
            if (this.s1) {
                i = gm.L(58.0f);
            } else {
                i = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jp0Var, property, 0.0f, editTextHeight + i);
            jp0 jp0Var2 = this.Q0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jp0Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T0, property, 0.0f, gm.L(158.0f));
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
            rb8 rb8Var = this.T7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rb8Var, property3, 0.0f, gm.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.U7, property3, 0.0f, gm.L(166.0f));
            View view4 = this.k0;
            Property property4 = View.ALPHA;
            if (this.R4) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f));
        }
        this.Z7.addListener(new pa8(this, z, (byte) 3));
        this.Z7.setDuration(200L);
        this.Z7.setInterpolator(gm.G);
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
        ya8 ya8Var;
        if (this.G2 != null || ((ya8Var = this.g0) != null && ya8Var.y)) {
            if (motionEvent.getX() >= ((i0(this.t4) / 3) << 1)) {
                z = true;
            } else {
                z = false;
            }
            long m0 = m0();
            long z0 = z0();
            if (m0 != -9223372036854775807L && z0 > 15000 && (!z || z0 - m0 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final int i0(int i) {
        int L;
        int width = this.f0.getWidth();
        if (i != 1) {
            if (i == 0) {
                if (this.d2 != 1) {
                    return width;
                }
            } else if (i != 4 && i != 5 && i != 3) {
                L = gm.L(28.0f);
                return width - L;
            } else {
                return width;
            }
        }
        L = gm.L(32.0f);
        return width - L;
    }

    public final void i1() {
        final File file;
        final k47 k47Var;
        final boolean z;
        final boolean z2;
        final boolean z3;
        boolean z4;
        boolean z5;
        if (!j()) {
            return;
        }
        k47 k47Var2 = this.S4;
        File file2 = null;
        if (k47Var2 != null) {
            if (k47Var2.t() && !this.S4.U2()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && this.S4.O3()) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean K4 = k47.K4(this.S4.k);
            if (!TextUtils.isEmpty(this.S4.k.attachPath)) {
                File file3 = new File(this.S4.k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                bc4.G(this.U);
                file2 = bc4.M(this.S4.k, false, true);
            }
            k47Var = k47Var2;
            file = file2;
            z2 = z4;
            z3 = z5;
            z = K4;
        } else {
            file = null;
            k47Var = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        if (file != null && file.exists()) {
            this.h7 = new a0(this, this.O4, new ArrayList(this.X6), this.d);
            cb8 cb8Var = new cb8();
            cb8Var.c = false;
            u2(false, true, cb8Var);
            gm.d3(new Runnable() {
                @Override
                public final void run() {
                    int intValue;
                    float f;
                    float f2;
                    x20 x20Var;
                    Drawable[] drawableArr = PhotoViewer.d9;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.getClass();
                    File file4 = file;
                    Pair L0 = gm.L0(file4);
                    int i = photoViewer.V3;
                    photoViewer.V3 = i - 1;
                    String absolutePath = file4.getAbsolutePath();
                    boolean z6 = z;
                    if (z6) {
                        intValue = 0;
                    } else {
                        intValue = ((Integer) L0.first).intValue();
                    }
                    jo6 jo6Var = new jo6(i, absolutePath, intValue, z6, 0, 0);
                    jo6Var.n(L0);
                    photoViewer.d2 = 2;
                    photoViewer.v2 = false;
                    photoViewer.d = new xa8(photoViewer, photoViewer.d, k47Var, jo6Var, z2, z3);
                    photoViewer.q1.f();
                    if (photoViewer.T6 == null) {
                        photoViewer.T6 = VelocityTracker.obtain();
                    }
                    photoViewer.G7 = (byte) 3;
                    photoViewer.A2(false, false);
                    photoViewer.t2(true, false);
                    yv1 yv1Var = photoViewer.k4;
                    if (yv1Var != null && yv1Var.a0 != null && yv1Var.Y7()) {
                        photoViewer.k4.a0.R();
                    } else {
                        photoViewer.W0();
                    }
                    photoViewer.M0.setAlpha(255);
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(null, null, null, null, null, null, Collections.singletonList(jo6Var), 0, null);
                    jp0 jp0Var = photoViewer.Q0;
                    float f3 = 96.0f;
                    if (photoViewer.s1) {
                        f = 154.0f;
                    } else {
                        f = 96.0f;
                    }
                    jp0Var.setTranslationY(gm.L(f));
                    vi3 vi3Var = photoViewer.T0;
                    if (photoViewer.s1) {
                        f2 = 154.0f;
                    } else {
                        f2 = 96.0f;
                    }
                    vi3Var.setTranslationY(gm.L(f2));
                    photoViewer.G.setTranslationY(-x20Var.getHeight());
                    hb8 hb8Var = photoViewer.R1;
                    if (photoViewer.s1) {
                        f3 = 154.0f;
                    }
                    hb8Var.setTranslationY(gm.L(f3));
                    photoViewer.G();
                    photoViewer.q2();
                    photoViewer.G7 = (byte) 0;
                }
            }, cb8Var.a);
            return;
        }
        d2();
    }

    public final void i2() {
        long a;
        if (this.E != null) {
            yv1 yv1Var = this.k4;
            if (yv1Var != null) {
                a = yv1Var.a();
            } else {
                pb8 pb8Var = this.d;
                if (pb8Var != null) {
                    a = pb8Var.a();
                } else {
                    return;
                }
            }
            long j = a;
            ik.H(this.E, j, -1L, 0, false, new u88(this), null, new fk(-1, -14342875, 520093695, -1, -115203550, 620756991, cmb.w0(null, cmb.Ii, false), cmb.w0(null, cmb.Ei, false), cmb.w0(null, cmb.Gi, false)), null);
        }
    }

    public final boolean j() {
        yv1 yv1Var = this.k4;
        if (yv1Var != null) {
            if (yv1Var.f == null) {
                TLRPC.Chat chat = yv1Var.e;
                if (chat != null && !sd2.r0(chat)) {
                    if (sd2.p(this.k4.e) || sd2.u(this.k4.e)) {
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

    public final float j0(boolean z) {
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
            i = gm.m;
        } else {
            i = 0;
        }
        float measuredHeight = this.D1.getMeasuredHeight() - gm.L(64.0f);
        float min = Math.min(this.D1.getMeasuredWidth(), measuredHeight - i) - (gm.L(16.0f) << 1);
        return Math.max(min / q, min / o);
    }

    public final void j1(ArrayList arrayList, int i, az7 az7Var) {
        m1(null, null, null, null, null, arrayList, null, i, az7Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void j2(ArrayList arrayList) {
        boolean z;
        Integer num;
        ndc ndcVar;
        k47 k47Var;
        boolean z2;
        lb8 lb8Var = this.f0;
        this.e0.softInputMode = 48;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.h0, this.e0);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        yv1 yv1Var = this.k4;
        if (yv1Var != null && yv1Var.a0 != null && yv1Var.getFragmentView() != null) {
            ms1 ms1Var = this.k4.a0;
            if (ms1Var.p3) {
                ms1Var.Y1();
                z2 = true;
            } else {
                z2 = false;
            }
            gm.g3(this.k4.getParentActivity(), this.c);
            this.k4.getFragmentView().requestLayout();
            z = z2;
        } else {
            z = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (ndcVar = this.G2) != null && ndcVar.S() > 1500 && (k47Var = this.S4) != null && k47.K4(k47Var.k)) {
            num = Integer.valueOf((int) (this.G2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            k47 k47Var2 = (k47) arrayList.get(0);
            String K = sd2.K(oc7.r1(this.U).L0(Long.valueOf(-k47.B0(k47Var2.k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb = new StringBuilder("https://");
                kt6.v(sb, oc7.r1(this.U).N2, "/", K, "/");
                sb.append(k47Var2.e1());
                str = sb.toString();
            }
        }
        ea8 ea8Var = new ea8(this, this.E, this.k4, arrayList, str, num, lb8Var, z);
        ea8Var.v0(false);
        ea8Var.getWindow().setSoftInputMode(48);
        gm.d3(new a18(this, ea8Var, (byte) 7), 250L);
        ea8Var.show();
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
        x68 x68Var = this.D1;
        if (x68Var != null && (animatorSet = x68Var.s) != null) {
            animatorSet.cancel();
            x68Var.s = null;
            x68Var.f = false;
        }
    }

    public final defpackage.mi2 k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.k0():mi2");
    }

    public final void k1(TLRPC.FileLocation fileLocation, gn5 gn5Var, jb8 jb8Var) {
        m1(null, fileLocation, gn5Var, null, null, null, null, 0, jb8Var, null, 0L, 0L, 0L, true, null, null);
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
        n1b n1bVar = this.o5;
        int i4 = 8;
        float f4 = 0.0f;
        float f5 = 1.0f;
        if (!z2) {
            n1bVar.animate().setListener(null).cancel();
            n1b n1bVar2 = this.o5;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            n1bVar2.setVisibility(i2);
            this.o5.setAlpha(this.Q0.getAlpha());
            this.r5.animate().setListener(null).cancel();
            yc ycVar = this.r5;
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            ycVar.setVisibility(i3);
            yc ycVar2 = this.r5;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            ycVar2.setAlpha(f3);
        } else if (z) {
            if (n1bVar.getTag() == null) {
                this.o5.animate().setListener(null).cancel();
                this.r5.animate().setListener(null).cancel();
                if (this.o5.getVisibility() != 0) {
                    this.o5.setVisibility(0);
                    this.o5.animate().alpha(1.0f).start();
                    this.r5.setVisibility(0);
                    this.r5.animate().alpha(1.0f).start();
                }
            }
        } else if (n1bVar.getTag() != null) {
            this.o5.animate().setListener(null).cancel();
            this.o5.animate().alpha(0.0f).setListener(new jf4(this.o5)).start();
            this.r5.animate().setListener(null).cancel();
            this.r5.animate().alpha(0.0f).setListener(new jf4(this.r5)).start();
        }
        n1b n1bVar3 = this.o5;
        if (z) {
            num = num3;
        } else {
            num = null;
        }
        n1bVar3.setTag(num);
        if (z && this.s5.o0 != 1 && !this.A7) {
            z3 = true;
        } else {
            z3 = false;
        }
        db8 db8Var = this.s5;
        if (!z2) {
            db8Var.animate().setListener(null).cancel();
            db8 db8Var2 = this.s5;
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            db8Var2.setVisibility(i);
            db8 db8Var3 = this.s5;
            if (z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            db8Var3.setAlpha(f2);
        } else if (z3) {
            if (db8Var.getTag() == null) {
                this.s5.animate().setListener(null).cancel();
                if (this.s5.getVisibility() != 0) {
                    this.s5.setVisibility(0);
                }
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (db8Var.getTag() != null) {
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new jf4(this.s5)).start();
        }
        db8 db8Var4 = this.s5;
        if (z3) {
            num2 = num3;
        } else {
            num2 = null;
        }
        db8Var4.setTag(num2);
        if (z && this.s5.o0 == 1 && !this.A7) {
            z4 = true;
        } else {
            z4 = false;
        }
        g2(z4, z2);
        n1b n1bVar4 = this.o5;
        if (z && this.s5.o0 == 1 && this.x5.u0 && !this.u5.u0 && !this.v5.u0) {
            z5 = true;
        } else {
            z5 = false;
        }
        n1bVar4.setOutlineVisible(z5);
        if (!z || this.s5.o0 != 1 || this.u5.u0 || this.v5.u0) {
            z6 = false;
        }
        db8 db8Var5 = this.x5;
        if (!z2) {
            db8Var5.animate().setListener(null).cancel();
            db8 db8Var6 = this.x5;
            if (z6) {
                i4 = 0;
            }
            db8Var6.setVisibility(i4);
            db8 db8Var7 = this.x5;
            if (z6) {
                f4 = 1.0f;
            }
            db8Var7.setAlpha(f4);
            db8 db8Var8 = this.x5;
            if (z6) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            db8Var8.setScaleX(f);
            db8 db8Var9 = this.x5;
            if (!z6) {
                f5 = 0.8f;
            }
            db8Var9.setScaleY(f5);
        } else if (z6) {
            if (db8Var5.getTag() == null) {
                this.x5.animate().setListener(null).cancel();
                if (this.x5.getVisibility() != 0) {
                    this.x5.setVisibility(0);
                }
                wi8.t(this.x5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), d53.h, 400L);
            }
        } else if (db8Var5.getTag() != null) {
            this.x5.animate().setListener(null).cancel();
            wi8.t(this.x5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new jf4(this.x5)), d53.h, 400L);
        }
        db8 db8Var10 = this.x5;
        if (!z6) {
            num3 = null;
        }
        db8Var10.setTag(num3);
    }

    public final void l() {
        if (this.d2 == 11) {
            db8 db8Var = this.s5;
            if (db8Var.o0 == 2) {
                db8Var.setCutOutState(true);
                g2(true, true);
                this.o5.f();
                this.f0.invalidate();
            }
        }
    }

    public final defpackage.rcc l0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.l0():rcc");
    }

    public final boolean l1(k47 k47Var, yv1 yv1Var, long j, long j2, long j3, jb8 jb8Var) {
        return m1(k47Var, null, null, null, null, null, null, 0, jb8Var, yv1Var, j, j2, j3, true, null, null);
    }

    public final void l2(boolean z) {
        Integer num;
        float f;
        float f2;
        ya8 ya8Var;
        Object tag = this.s3.getTag();
        if (z) {
            if (tag == null) {
                if (!this.s3.s && ((ya8Var = this.g0) == null || !ya8Var.y || ya8Var.w.isEmpty())) {
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
        ka8 ka8Var = this.s3;
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        ka8Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.t3 = animatorSet2;
        ka8 ka8Var2 = this.s3;
        Property property = View.ALPHA;
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ka8Var2, property, f);
        ka8 ka8Var3 = this.s3;
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.5f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ka8Var3, property2, f2);
        ka8 ka8Var4 = this.s3;
        Property property3 = View.SCALE_Y;
        if (!z) {
            f4 = 0.5f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ka8Var4, property3, f4);
        ka8 ka8Var5 = this.s3;
        Property property4 = View.TRANSLATION_Y;
        if (!z) {
            f3 = gm.L(12.0f);
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(ka8Var5, property4, f3));
        this.t3.setDuration(380L);
        this.t3.setInterpolator(d53.h);
        this.t3.addListener(new ha8(this, (byte) 1));
        this.t3.start();
    }

    public final void m() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            gm.r(runnable);
            this.I2 = null;
        }
    }

    public final long m0() {
        ya8 ya8Var = this.g0;
        if (ya8Var != null && ya8Var.y) {
            return ya8Var.getCurrentPosition();
        }
        ndc ndcVar = this.G2;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.S();
    }

    public final boolean m1(k47 k47Var, TLRPC.FileLocation fileLocation, gn5 gn5Var, gn5 gn5Var2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, pb8 pb8Var, yv1 yv1Var, long j, long j2, long j3, boolean z, mb8 mb8Var, Integer num) {
        TLRPC.Message message;
        pb8 pb8Var2;
        hu1 hu1Var;
        hu1 hu1Var2;
        hu1 hu1Var3;
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        PhotoViewer photoViewer = this;
        if (photoViewer.E != null && !photoViewer.e && ((pb8Var != null || !photoViewer.p()) && (k47Var != null || fileLocation != null || arrayList != null || arrayList3 != null || arrayList2 != null || gn5Var != null || mb8Var != null))) {
            qb8 N = pb8Var.N(k47Var, fileLocation, i, true, false);
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
                if ((yv1Var != null && yv1Var.h != null) || ((photoViewer.y5 != 0 && oc7.r1(photoViewer.U).B2(photoViewer.y5)) || ((k47Var != null && (oc7.r1(photoViewer.U).B2(k47.B0(k47Var.k)) || ((message = k47Var.k) != null && message.noforwards))) || ((k47Var != null && k47Var.y2()) || photoViewer.M0(mb8Var))))) {
                    photoViewer.e0.flags |= 8192;
                    gm.f2();
                } else {
                    photoViewer.e0.flags &= -8193;
                    gm.f2();
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
                    findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new up(photoViewer, (byte) 2));
                }
                photoViewer.u7 = false;
                photoViewer.v2 = false;
                photoViewer.P = true;
                photoViewer.Q = false;
                photoViewer.z3 = true;
                photoViewer.E2 = false;
                photoViewer.k4 = yv1Var;
                photoViewer.s4 = num != null;
                y98 y98Var = photoViewer.h1;
                if (y98Var != null) {
                    y98Var.setImage((Bitmap) null);
                }
                photoViewer.N.c("");
                photoViewer.N.a("", false);
                nb8 nb8Var = photoViewer.O;
                if (nb8Var != null) {
                    nb8Var.b(0, 0, false);
                    photoViewer.O.d(false, false);
                }
                photoViewer.G.setTitleScrollNonFitText(false);
                e7a e7aVar = photoViewer.H7;
                if (e7aVar != null) {
                    e7aVar.a();
                    photoViewer.H7 = null;
                }
                e7a e7aVar2 = (e7a) new ov0(nm7.f(photoViewer.U), photoViewer).b;
                e7aVar2.e(nm7.m4);
                e7aVar2.b(nm7.Z1);
                e7aVar2.b(nm7.Y1);
                e7aVar2.b(nm7.u3);
                e7aVar2.b(nm7.X1);
                e7aVar2.b(nm7.W);
                e7aVar2.b(nm7.V);
                e7aVar2.b(nm7.g3);
                e7aVar2.b(nm7.v);
                e7aVar2.b(nm7.c2);
                e7aVar2.b(nm7.b2);
                e7aVar2.b(nm7.m0);
                e7aVar2.b(nm7.y1);
                photoViewer.H7 = e7aVar2;
                photoViewer.d = pb8Var;
                photoViewer.H5 = j2;
                photoViewer.D5 = j;
                photoViewer.E5 = (yv1Var == null || (hu1Var3 = yv1Var.D0) == null || !hu1Var3.O) ? null : yv1Var.F3;
                photoViewer.F5 = (yv1Var == null || (hu1Var2 = yv1Var.D0) == null || !hu1Var2.O) ? null : yv1Var.I3;
                photoViewer.G5 = (yv1Var == null || (hu1Var = yv1Var.D0) == null || !hu1Var.O) ? false : true;
                photoViewer.C5 = j3;
                photoViewer.q1.f();
                photoViewer.i7 = mb8Var;
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
                if (N != null) {
                    photoViewer.r4 = true;
                    photoViewer.m4 = (byte) 1;
                    if (k47Var != null) {
                        int i2 = k47Var.K1;
                        kn m = N.o ? N.a.m() : null;
                        photoViewer.k2 = m;
                        if (m != null) {
                            if (k47.K4(k47Var.k)) {
                                ImageReceiver imageReceiver = N.a;
                                imageReceiver.u0 = false;
                                imageReceiver.x0();
                                if (MediaController.w().D(k47Var)) {
                                    photoViewer.e3 = k47Var.b0;
                                }
                                photoViewer.V2 = photoViewer.S2 == null && !bc4.G(i2).T(k47Var.F0(), true) && (photoViewer.k2.s() || !bc4.G(i2).T(k47Var.F0(), false));
                                photoViewer.k2 = null;
                            } else if (k47Var.l2().size() > 1) {
                                photoViewer.k2 = null;
                            }
                        }
                    } else if (mb8Var != null) {
                        kn m2 = N.o ? N.a.m() : null;
                        photoViewer.k2 = m2;
                        if (m2 != null && mb8Var.a(i)) {
                            ImageReceiver imageReceiver2 = N.a;
                            imageReceiver2.u0 = false;
                            imageReceiver2.x0();
                            TLObject d = mb8Var.d(i);
                            TLRPC.Document document = d instanceof TLRPC.Document ? (TLRPC.Document) d : null;
                            photoViewer.V2 = photoViewer.S2 == null && document != null && !bc4.G(photoViewer.U).T(document, true) && (photoViewer.k2.s() || !bc4.G(photoViewer.U).T(document, false));
                            photoViewer.k2 = null;
                        }
                    }
                    photoViewer.d1(k47Var, fileLocation, gn5Var, gn5Var2, arrayList, arrayList2, arrayList3, i, N);
                    if (photoViewer.d2 == 1) {
                        photoViewer.D1.setVisibility(0);
                        photoViewer.D1.setAlpha(0.0f);
                        photoViewer.D1.setFreeform(false);
                    }
                    ImageReceiver imageReceiver3 = N.a;
                    RectF rectF = imageReceiver3.Q0;
                    float f = rectF.left;
                    float f2 = rectF.top;
                    int i3 = imageReceiver3.V;
                    kn m3 = imageReceiver3.m();
                    int i4 = m3 != null ? m3.d[2] : 0;
                    if (i4 != 0) {
                        i3 = i4;
                    }
                    ClippingImageView[] c0 = photoViewer.c0(N);
                    photoViewer.l6 = 1.0f;
                    for (int i5 = 0; i5 < c0.length; i5++) {
                        ClippingImageView clippingImageView = c0[i5];
                        boolean z2 = N.r;
                        clippingImageView.O = photoViewer.j4;
                        clippingImageView.L = true;
                        clippingImageView.N = z2;
                        clippingImageView.setVisibility(0);
                        c0[i5].setRadius(N.h);
                        ClippingImageView clippingImageView2 = c0[i5];
                        int i6 = N.a.W;
                        clippingImageView2.e = i3;
                        clippingImageView2.f = i6;
                        clippingImageView2.setImageBitmap(N.e);
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
                    for (int i7 = 0; i7 < c0.length; i7++) {
                        if (c0.length <= 1 && !N.r) {
                            c0[i7].setAlpha(1.0f);
                        } else {
                            c0[i7].setAlpha(0.0f);
                        }
                        c0[i7].setPivotX(0.0f);
                        c0[i7].setPivotY(0.0f);
                        c0[i7].setScaleX(N.k);
                        c0[i7].setScaleY(N.k);
                        c0[i7].setTranslationX((rectF.left * N.k) + N.b);
                        c0[i7].setTranslationY((rectF.top * N.k) + N.c);
                        c0[i7].setLayoutParams(layoutParams2);
                    }
                    photoViewer = this;
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new v(this, c0, layoutParams2, f, N, f2, pb8Var, arrayList3, num));
                } else {
                    if (arrayList3 != null && photoViewer.d2 != 3 && ((pb8Var2 = photoViewer.d) == null || !pb8Var2.Q())) {
                        photoViewer.W0();
                    }
                    photoViewer.f0.setAlpha(1.0f);
                    photoViewer.d1(k47Var, fileLocation, gn5Var, gn5Var2, arrayList, arrayList2, arrayList3, i, N);
                    photoViewer.F0();
                    photoViewer.I1();
                    yv1 yv1Var2 = photoViewer.k4;
                    if (yv1Var2 != null) {
                        yv1Var2.i6();
                        UndoView undoView = yv1Var2.N3;
                        if (undoView != null) {
                            undoView.d(1, false);
                        }
                        photoViewer.k4.getFragmentView().invalidate();
                    }
                    photoViewer.h0.getViewTreeObserver().addOnPreDrawListener(new x(photoViewer, pb8Var, num));
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) photoViewer.E.getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(16384);
                    obtain.getText().add(jb6.M0(2131754808, "AccDescrPhotoViewer"));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return true;
            } catch (Exception e) {
                fc4.g(e, true);
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
                    this.X7.setTranslationY(gm.L(58.0f));
                }
                ObjectAnimator objectAnimator = this.F7;
                if (objectAnimator != null) {
                    objectAnimator.removeAllListeners();
                    this.F7.cancel();
                }
                x98 x98Var = this.X7;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x98Var, View.TRANSLATION_Y, x98Var.getTranslationY(), 0.0f);
                this.F7 = ofFloat;
                ofFloat.setDuration(220L);
                this.F7.setInterpolator(d53.f);
                this.F7.start();
            }
        } else if (frameLayout.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.F7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.F7.cancel();
            }
            x98 x98Var2 = this.X7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(x98Var2, View.TRANSLATION_Y, x98Var2.getTranslationY(), gm.L(58.0f));
            this.F7 = ofFloat2;
            ofFloat2.addListener(new jf4(this.W7));
            this.F7.setDuration(220L);
            this.F7.setInterpolator(d53.f);
            this.F7.start();
        }
        FrameLayout frameLayout3 = this.W7;
        if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
            this.W7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * b10.c(46.0f, this.V1.getEditTextHeight(), 0)));
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
            this.A2.animate().alpha(1.0f).setInterpolator(d53.j).setDuration(85L).setListener(new u5(this, textureView.getBitmap(), (byte) 29)).start();
        }
    }

    public final TLObject n0(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.d7;
        if (!arrayList.isEmpty()) {
            if (i >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((xw9) arrayList.get(i)).b.size;
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
            return ((gn5) arrayList4.get(i)).f;
        }
        ArrayList arrayList5 = this.X6;
        if (arrayList5.isEmpty() || i >= arrayList5.size()) {
            return null;
        }
        k47 k47Var = (k47) arrayList5.get(i);
        TLRPC.Message message = k47Var.k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
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
            TLRPC.MessageMedia messageMedia = k47Var.a1;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w2 = bc4.w(document.thumbs, 90, false, null, false);
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
                    TLRPC.PhotoSize w3 = bc4.w(photo.sizes, gm.Y0(false), false, null, true);
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
            } else if (((k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && k47.n1(k47Var.k).photo != null) || ((k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(k47Var.k).webpage != null)) {
                TLRPC.PhotoSize w4 = bc4.w(k47Var.p0, gm.Y0(true), false, null, true);
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
            } else if (k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) k47.n1(k47Var.k)).photo;
            } else {
                if (k47Var.F0() != null && k47.W2(k47Var.F0())) {
                    TLRPC.PhotoSize w5 = bc4.w(k47Var.F0().thumbs, 90, false, null, false);
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

    public final boolean n1(ArrayList arrayList, int i, long j, long j2, long j3, pb8 pb8Var) {
        return m1((k47) arrayList.get(i), null, null, null, arrayList, null, null, i, pb8Var, null, j, j2, j3, true, null, null);
    }

    public final void n2() {
        ndc ndcVar;
        if (this.s1 && (ndcVar = this.G2) != null && !ndcVar.c0() && !T0()) {
            if (!this.r || this.d2 == 1) {
                this.G2.A0(0.0f);
            }
            this.H2 = false;
            B2();
        }
    }

    public final void o() {
        float f;
        r6 r6Var = this.B0;
        if (r6Var != null) {
            if (this.g2) {
                f = -gm.L(4.0f);
            } else {
                f = 0.0f;
            }
            r6Var.setTranslationX(f);
        }
        r7 r7Var = this.F0;
        if (r7Var != null) {
            R1(r7Var, this.g2, false);
        }
        boolean z = this.f2;
        if (z && this.J == null) {
            im0 c = this.Z.c(this.H, null, false);
            c.p(qqd.i(this.w2));
            c.r(gm.L(20.0f));
            c.q(gm.L(7.0f));
            int L = gm.L(54.0f);
            int L2 = gm.L(54.0f);
            Matrix matrix = tl0.a;
            this.J = new sl0(L, L2, c);
        }
        ImageView imageView = this.H;
        if (z) {
            rve.a(imageView);
            this.H.setBackground(this.J);
            return;
        }
        imageView.setStateListAnimator(null);
        this.H.setBackground(this.I);
    }

    public final void o1(ArrayList arrayList, int i, int i2, boolean z, pb8 pb8Var, yv1 yv1Var) {
        boolean z2;
        io ioVar;
        int i3 = i2;
        this.i2 = z;
        vi3 vi3Var = this.T0;
        int i4 = 0;
        if (vi3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vi3Var.getLayoutParams();
            if (i3 != 4 && i3 != 5) {
                if (i3 != 13 && i3 != 14 && i3 != 1 && i3 != 3 && i3 != 10 && i3 != 11) {
                    this.T0.setResourceId(2131232711);
                    layoutParams.bottomMargin = gm.L(1.0f);
                } else {
                    this.T0.setResourceId(2131231199);
                    this.T0.setPadding(0, gm.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = gm.L(1.0f);
                }
            } else {
                this.T0.setResourceId(2131232711);
                layoutParams.bottomMargin = gm.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i3 != 11 && this.o5 != null) {
            this.A7 = false;
            ImageView imageView = this.d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            db8 db8Var = this.x5;
            if (db8Var != null) {
                db8Var.m(false, false);
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
            this.d = pb8Var;
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
            this.d = pb8Var;
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
            ob8 ob8Var = this.N;
            if (ob8Var != null && (ioVar = ob8Var.d) != null) {
                if (this.f2) {
                    i4 = 8;
                }
                ioVar.setVisibility(i4);
            }
            m1(null, null, null, null, null, null, arrayList, i, pb8Var, yv1Var, 0L, 0L, 0L, true, null, null);
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

    public final String p0(int i) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (!arrayList.isEmpty()) {
                if (i < arrayList.size()) {
                    xw9 xw9Var = (xw9) arrayList.get(i);
                    StringBuilder sb = new StringBuilder();
                    sb.append(xw9Var.b.dc_id);
                    sb.append("_");
                    return kt6.q(sb, xw9Var.b.id, ".jpg");
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
                            if (obj instanceof no6) {
                                no6 no6Var = (no6) obj;
                                TLRPC.PhotoSize photoSize = no6Var.L;
                                if (photoSize != null) {
                                    return bc4.r(null, photoSize);
                                }
                                TLRPC.Document document = no6Var.J;
                                if (document != null) {
                                    return bc4.r(null, document);
                                }
                                return Utilities.a(no6Var.C) + "." + fn5.x(no6Var.C, "jpg");
                            } else if (obj instanceof TLRPC.BotInlineResult) {
                                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                                TLRPC.Document document2 = botInlineResult.document;
                                if (document2 != null) {
                                    return bc4.r(null, document2);
                                }
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    return bc4.r(null, bc4.w(photo.sizes, gm.Y0(false), false, null, false));
                                }
                                if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(Utilities.a(botInlineResult.content.url));
                                    sb2.append(".");
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    sb2.append(fn5.x(webDocument2.url, bc4.H(webDocument2.mime_type)));
                                    return sb2.toString();
                                }
                            }
                        }
                    } else {
                        mb8 mb8Var = this.i7;
                        if (mb8Var != null) {
                            return mb8Var.c(i);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i < arrayList2.size()) {
                        gn5 gn5Var = (gn5) arrayList2.get(i);
                        gn5 gn5Var2 = (gn5) this.a7.get(i);
                        if (gn5Var != null) {
                            if (gn5Var2 != null && gn5Var2 != gn5Var) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(gn5Var2.f.volume_id);
                                sb3.append("_");
                                return hg9.k(sb3, gn5Var2.f.local_id, ".mp4");
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(gn5Var.f.volume_id);
                            sb4.append("_");
                            return hg9.k(sb4, gn5Var.f.local_id, ".jpg");
                        }
                    }
                } else if (i < arrayList3.size()) {
                    TLRPC.Message message = ((k47) arrayList3.get(i)).k;
                    Pattern pattern = bc4.J;
                    if (message != null) {
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 != null) {
                                ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                                if (arrayList5.size() > 0 && (w3 = bc4.w(arrayList5, gm.Y0(false), false, null, false)) != null) {
                                    return bc4.r(null, w3);
                                }
                                return "";
                            }
                            return "";
                        } else if (k47.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return bc4.r(null, k47.n1(message).document);
                        } else {
                            if (k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = k47.n1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w2 = bc4.w(arrayList6, gm.Y0(true), false, null, true)) != null) {
                                    return bc4.r(null, w2);
                                }
                                return "";
                            } else if (k47.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (k47.n1(message).webpage.document != null) {
                                    return bc4.r(null, k47.n1(message).webpage.document);
                                }
                                if (k47.n1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = k47.n1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w = bc4.w(arrayList7, gm.Y0(false), false, null, false)) != null) {
                                        return bc4.r(null, w);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((k47.n1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) k47.n1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + fn5.x(webDocument.url, bc4.H(webDocument.mime_type));
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

    public final void p1() {
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.f0();
            return;
        }
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.e();
        }
    }

    public final void p2(int i, boolean z) {
        if (this.S4 != null) {
            w1(false);
            bc4.G(this.U).f(this.S4.F0());
        } else if (this.h5 != null) {
            TLObject d = this.i7.d(this.O4);
            if (d instanceof TLRPC.Document) {
                w1(false);
                bc4.G(this.U).f((TLRPC.Document) d);
            }
        }
        td5 td5Var = this.m1;
        if (td5Var != null) {
            td5Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        L1(z, true, false, this.O4 + i);
        if (a2(this.S4) || Z1(this.O4)) {
            this.Y2 = true;
            Y0(true);
            u(0, true);
        }
        s();
        try {
            fp.b(0);
            if (hi2.v().D()) {
                hi2.v().Q(k0());
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q(boolean z) {
        View view;
        float x;
        float y;
        float f;
        float f2;
        if (z) {
            bd8 bd8Var = this.w3;
            if (bd8Var != null) {
                bd8Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 8));
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
            oa8 oa8Var = this.z2;
            if (oa8Var != null) {
                int[] iArr = this.A3;
                oa8Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f0.getTranslationY());
                ImageView imageView2 = this.x3;
                Rect rect = this.t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.z2.getX());
                }
                kb8 kb8Var = this.F2;
                if (kb8Var != null) {
                    kb8Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new h88(this, (byte) 5));
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
                arrayList.add(ObjectAnimator.ofInt(this.M0, so.d, 255));
                kb8 kb8Var2 = this.F2;
                if (kb8Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(kb8Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property3, x));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property4, y));
                }
                u0(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new pl(this, view, (byte) 18));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new ga8(this, view, (byte) 1));
                animatorSet.start();
                cb8 cb8Var = new cb8();
                cb8Var.c = false;
                cb8Var.d = false;
                cb8Var.a = (short) 250;
                cb8Var.b = decelerateInterpolator;
                u2(true, true, cb8Var);
                this.G3 = (byte) 0;
            }
        }
    }

    public final gn5 q0(int i, long[] jArr) {
        if (i >= 0) {
            ArrayList arrayList = this.d7;
            if (!arrayList.isEmpty()) {
                if (i < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((xw9) arrayList.get(i)).b.size;
                    }
                    xw9 xw9Var = (xw9) arrayList.get(i);
                    if (xw9Var == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = xw9Var;
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
                        return (gn5) this.a7.get(i);
                    }
                } else {
                    ArrayList arrayList4 = this.X6;
                    if (!arrayList4.isEmpty() && i < arrayList4.size()) {
                        k47 k47Var = (k47) arrayList4.get(i);
                        TLRPC.Message message = k47Var.k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
                                if (w != null) {
                                    if (jArr != null) {
                                        long j = w.size;
                                        jArr[0] = j;
                                        if (j == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return gn5.f(w, k47Var.n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = k47Var.a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return gn5.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w2 = bc4.w(photo.sizes, gm.Y0(false), false, null, true);
                                    if (w2 != null) {
                                        if (jArr != null) {
                                            long j2 = w2.size;
                                            jArr[0] = j2;
                                            if (j2 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return gn5.f(w2, k47Var.a1.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && k47.n1(k47Var.k).photo != null) || ((k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(k47Var.k).webpage != null)) {
                                if (k47.t3(k47Var.k)) {
                                    return gn5.b(k47Var.F0());
                                }
                                TLRPC.PhotoSize w3 = bc4.w(k47Var.p0, gm.Y0(true), false, null, true);
                                if (w3 != null) {
                                    if (jArr != null) {
                                        long j3 = w3.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return gn5.f(w3, k47Var.n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return gn5.p(vuc.c(((TLRPC.TL_messageMediaInvoice) k47.n1(k47Var.k)).webPhoto));
                            } else {
                                if (k47Var.F0() != null) {
                                    TLRPC.Document F0 = k47Var.F0();
                                    if (this.B5 == 5) {
                                        return gn5.b(F0);
                                    }
                                    if (k47.W2(k47Var.F0())) {
                                        TLRPC.PhotoSize w4 = bc4.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j4 = w4.size;
                                            jArr[0] = j4;
                                            if (j4 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return gn5.c(w4, F0);
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

    public final void q1(boolean z) {
        p09 y;
        ib8 ib8Var = this.W4;
        ArrayList arrayList = ib8Var.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pcc pccVar = (pcc) ib8Var.e.get(i);
                if (pccVar.a == 0 && (pccVar.b & 1) != 0) {
                    View view = pccVar.I;
                    if ((view instanceof bf0) && (y = ((bf0) view).getImageReceiver().y()) != null) {
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
        sa8 sa8Var;
        int i2;
        sa8 sa8Var2;
        this.p6 = null;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.o0.setVisibility(8);
        this.f1.setVisibility(8);
        this.g1.setVisibility(8);
        this.h1.setVisibility(8);
        x68 x68Var = this.D1;
        if (x68Var != null) {
            x68Var.setVisibility(4);
        }
        this.p1.setVisibility(8);
        this.p1.setAlpha(0.0f);
        this.p1.setTranslationY(-gm.L(10.0f));
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
        ib8 ib8Var = this.W4;
        if (n != null) {
            int q = this.B4.q();
            int o = this.B4.o();
            if (this.d2 == 1) {
                float L = gm.L(12.0f);
                this.c6 = L;
                f = 0.0f;
                if (this.M1 != null) {
                    this.c6 = (sa8Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i4 = this.E1.i;
                if (i4 == 90 || i4 == 270) {
                    i2 = q;
                    q = o;
                    float f3 = q;
                    float f4 = i2;
                    this.d6 = z1(false) * (Math.min(i0(3) / f3, f0(3, false) / f4) / Math.min(i0(this.t4) / f3, g0() / f4));
                    Rect rect = this.t2;
                    this.b6 = (rect.left / 2) - (rect.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i2 = o;
                float f32 = q;
                float f42 = i2;
                this.d6 = z1(false) * (Math.min(i0(3) / f32, f0(3, false) / f42) / Math.min(i0(this.t4) / f32, g0() / f42));
                Rect rect2 = this.t2;
                this.b6 = (rect2.left / 2) - (rect2.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            } else {
                f = 0.0f;
                int i5 = -gm.L(44.0f);
                if (!this.s) {
                    i = gm.m / 2;
                } else {
                    i = 0;
                }
                float f5 = i5 + i;
                this.c6 = f5;
                if (this.M1 != null) {
                    float additionalTop = (sa8Var.getAdditionalTop() / 2.0f) + f5;
                    this.c6 = additionalTop;
                    this.c6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                ao6 ao6Var = ib8Var.c;
                if (ao6Var != null) {
                    int i6 = ao6Var.k;
                    if (i6 == 90 || i6 == 270) {
                        o = q;
                        q = o;
                    }
                    q = (int) (q * ao6Var.e);
                    i2 = (int) (o * ao6Var.f);
                    float f322 = q;
                    float f422 = i2;
                    this.d6 = z1(false) * (Math.min(i0(3) / f322, f0(3, false) / f422) / Math.min(i0(this.t4) / f322, g0() / f422));
                    Rect rect22 = this.t2;
                    this.b6 = (rect22.left / 2) - (rect22.right / 2);
                    this.m6 = System.currentTimeMillis();
                    this.Q6 = true;
                }
                i2 = o;
                float f3222 = q;
                float f4222 = i2;
                this.d6 = z1(false) * (Math.min(i0(3) / f3222, f0(3, false) / f4222) / Math.min(i0(this.t4) / f3222, g0() / f4222));
                Rect rect222 = this.t2;
                this.b6 = (rect222.left / 2) - (rect222.right / 2);
                this.m6 = System.currentTimeMillis();
                this.Q6 = true;
            }
        } else {
            f = 0.0f;
        }
        sa8 sa8Var3 = this.M1;
        if (sa8Var3 != null) {
            if (this.d2 == 11 && (ib8Var == null || ib8Var.c == null)) {
                z = true;
            } else {
                z = false;
            }
            sa8Var3.setDrawShadow(z);
        }
        this.h0.setClipChildren(true);
        this.k0.setVisibility(4);
        this.o6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(gm.L(126.0f), f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-gm.L(12.0f), f);
        ofFloat.addUpdateListener(new h88(this, (byte) 7));
        ofFloat2.addUpdateListener(new h88(this, (byte) 8));
        this.o6.playTogether(ObjectAnimator.ofFloat(this, so.g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.o0(true);
        this.o6.setDuration(200L);
        this.o6.addListener(new ha8(this, (byte) 3));
        this.o6.start();
    }

    public final void r() {
        qb8 qb8Var = this.c5;
        if (qb8Var != null) {
            qb8Var.a.v0(true, true);
        }
        pb8 pb8Var = this.d;
        qb8 qb8Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (pb8Var != null) {
            k47 k47Var = this.S4;
            gn5 gn5Var = this.Y4;
            if (gn5Var != null) {
                tL_fileLocationToBeDeprecated = gn5Var.f;
            }
            qb8Var2 = pb8Var.N(k47Var, tL_fileLocationToBeDeprecated, this.O4, false, false);
        }
        this.c5 = qb8Var2;
        if (qb8Var2 != null && !qb8Var2.s) {
            qb8Var2.a.v0(false, true);
        }
    }

    public final void r1() {
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            ndcVar.g0();
            return;
        }
        ya8 ya8Var = this.g0;
        if (ya8Var != null) {
            ya8Var.f();
        }
    }

    public final void r2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.r2():void");
    }

    public final void s() {
        k47 k47Var;
        boolean z;
        int i;
        TextureView textureView;
        int i2;
        TextureView textureView2;
        k47 k47Var2;
        ArrayList arrayList = this.X6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.y3;
        if (!isEmpty && ((k47Var = this.S4) == null || !k47Var.q4())) {
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = this.O4;
                if (i3 == 1) {
                    i4++;
                } else if (i3 == 2) {
                    i4--;
                }
                if (i4 >= 0 && i4 < arrayList.size()) {
                    k47 k47Var3 = (k47) arrayList.get(i4);
                    if (!k47.K4(k47Var3.k) && !k47Var3.d5()) {
                        imageViewArr[i3].setVisibility(4);
                    } else {
                        if (k47Var3.d5() && (k47Var2 = this.S4) != null && k47Var2.e1() == k47Var3.e1()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i = k47Var3.k.media.webpage.embed_width;
                        } else if (i3 == 0 && (textureView = this.C2) != null) {
                            i = textureView.getMeasuredWidth();
                        } else {
                            i = 0;
                        }
                        if (z) {
                            i2 = k47Var3.k.media.webpage.embed_height;
                        } else if (i3 == 0 && (textureView2 = this.C2) != null) {
                            i2 = textureView2.getMeasuredHeight();
                        } else {
                            i2 = 0;
                        }
                        TLRPC.Document F0 = k47Var3.F0();
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
                        Point point = gm.q;
                        if (point.y > point.x && i > i2) {
                            if (imageViewArr[i3].getVisibility() != 0) {
                                imageViewArr[i3].setVisibility(0);
                            }
                            if (this.K) {
                                imageViewArr[i3].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i3].getLayoutParams()).topMargin = ((this.f0.getMeasuredHeight() + ((int) (i2 / (i / this.f0.getMeasuredWidth())))) / 2) - gm.L(48.0f);
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
                                f2 = (f - this.E6) + ((-point.x) - gm.L(15.0f));
                            } else {
                                float f3 = this.D6;
                                if (f < f3) {
                                    f2 = f - f3;
                                }
                            }
                        }
                        imageViewArr[i3].setTranslationX((f2 + point.x) - gm.L(48.0f));
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

    public final int s0() {
        return this.t2.left;
    }

    public final void s2() {
        AtomicInteger atomicInteger;
        long a;
        boolean m;
        f07 e;
        float f;
        int i;
        f07 e2;
        f07 e3;
        boolean z;
        if (!V0()) {
            return;
        }
        this.T8 = true;
        ndc ndcVar = this.G2;
        if (ndcVar != null) {
            if (!fp.w() && !this.r) {
                z = false;
            } else {
                z = true;
            }
            ndcVar.s0(z);
        }
        if (this.G2 != null && fp.w() && ((atomicInteger = fp.b) == null || atomicInteger.get() <= 0)) {
            k89 e4 = fp.e();
            if (e4 == null) {
                a = -1;
            } else {
                a = e4.a();
            }
            if (a >= 0 && Math.abs(this.G2.S() - a) > 1000) {
                this.G2.o0(a);
            }
            k89 e5 = fp.e();
            if (e5 == null) {
                m = false;
            } else if (!fp.a) {
                m = !e5.l();
            } else {
                m = e5.m();
            }
            ndc ndcVar2 = this.G2;
            if (m) {
                ndcVar2.g0();
            } else {
                ndcVar2.f0();
            }
            if (this.F != null) {
                float g = fp.g();
                k89 e6 = fp.e();
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
                    k89 e7 = fp.e();
                    if (e7 != null && (e2 = e7.e()) != null) {
                        f2 = (float) e2.r;
                    }
                    int i2 = i + ((int) (f2 * f3));
                    if (i2 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i2, 1);
                    }
                }
            }
            k89 e8 = fp.e();
            float f4 = 1.0f;
            if (e8 != null && (e = e8.e()) != null) {
                f4 = (float) e.d;
            }
            w(true, false, f4);
        }
        ai2 ai2Var = this.x0;
        if (ai2Var != null) {
            ai2Var.a(fp.w());
        }
        this.T8 = false;
    }

    public void setAnimationValue(float f) {
        this.k6 = f;
        this.f0.invalidate();
        H0();
    }

    public final void t(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.t(boolean):void");
    }

    public final TLRPC.Document t0() {
        int i;
        if (this.W5 == 0.0f && this.X5 == 0.0f && (i = this.O4) >= 0) {
            ArrayList arrayList = this.f7;
            if (i < arrayList.size()) {
                Object obj = arrayList.get(this.O4);
                if (obj instanceof co6) {
                    co6 co6Var = (co6) obj;
                    if (!co6Var.v && !co6Var.w && !co6Var.u) {
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

    public final void t1(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, defpackage.lo6 r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.t1(java.util.ArrayList, android.net.Uri, boolean, boolean, lo6, boolean, long):void");
    }

    public final void t2(boolean z, boolean z2) {
        u2(z, z2, cb8.e);
    }

    public final void u(final int i, final boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        final boolean z4;
        final boolean z5;
        cz6 cz6Var;
        final File file;
        final cz6 cz6Var2;
        boolean z6;
        boolean z7;
        File file2;
        File J;
        File J2;
        boolean z8;
        final boolean z9;
        File file3;
        cz6 cz6Var3;
        boolean z10;
        kn knVar;
        int i3 = this.O4;
        if (i == 1) {
            i2 = i3 + 1;
        } else if (i == 2) {
            i2 = i3 - 1;
        } else {
            i2 = i3;
        }
        if (this.b5[i] != null) {
            if (i == 0 && i3 == 0 && (knVar = this.k2) != null) {
                z2 = knVar.s();
            } else {
                z2 = false;
            }
            File file4 = null;
            if (this.S4 != null) {
                if (i2 >= 0 && i2 < this.X6.size()) {
                    ?? r4 = (k47) this.X6.get(i2);
                    z3 = a2(r4);
                    if (this.B5 == 1 && !r4.x()) {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r4.k.attachPath)) {
                        file3 = new File(r4.k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((k47.n1(r4.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(r4.k).webpage != null && k47.n1(r4.k).webpage.document == null) {
                        cz6Var3 = new cz6(this, n0(i2, null), (byte) 18);
                    } else {
                        cz6Var3 = new cz6(this, r4.k, (byte) 19);
                    }
                    if (k47.K4(r4.k)) {
                        if ((gda.x0 && r4.B() && !pg3.B(k47.B0(r4.k))) || r4.D2(true)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cz6 cz6Var4 = cz6Var3;
                        z4 = z10;
                        cz6Var = r4;
                        file = null;
                        file4 = file3;
                        cz6Var2 = cz6Var4;
                        z5 = true;
                    } else {
                        z5 = false;
                        cz6Var = r4;
                        file = null;
                        file4 = file3;
                        cz6Var2 = cz6Var3;
                        z4 = false;
                    }
                } else {
                    this.X0[i].d(-1, z, true);
                    return;
                }
            } else {
                if (this.X4 != null) {
                    if (i2 >= 0 && i2 < this.f7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f7.get(i2);
                        if (!botInlineResult.type.equals("video") && !k47.J4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(bc4.z(3), this.b5[i]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(bc4.z(0), this.b5[i]);
                            } else {
                                z8 = false;
                                file2 = null;
                            }
                            z8 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                bc4.G(this.U);
                                file2 = bc4.I(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(bc4.z(4), Utilities.a(botInlineResult.content.url) + "." + fn5.x(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z8 = true;
                        }
                        z3 = false;
                        z4 = false;
                        z5 = z8;
                        file = new File(bc4.z(4), this.b5[i]);
                    } else {
                        this.X0[i].d(-1, z, true);
                        return;
                    }
                } else {
                    if (this.Y4 != null) {
                        if (i2 >= 0 && i2 < this.a7.size()) {
                            gn5 gn5Var = (gn5) this.a7.get(i2);
                            if (gn5Var != null) {
                                bc4.G(this.U);
                                J = bc4.J(gn5Var.f, o0(gn5Var), false, true);
                                bc4.G(this.U);
                                J2 = bc4.J(gn5Var.f, o0(gn5Var), true, true);
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
                            xw9 xw9Var = (xw9) this.d7.get(i2);
                            bc4.G(this.U);
                            J = bc4.J(xw9Var, null, true, true);
                            bc4.G(this.U);
                            J2 = bc4.J(xw9Var, null, false, true);
                        } else {
                            this.X0[i].d(-1, z, true);
                            return;
                        }
                    } else if (this.d5 != null) {
                        file2 = new File(bc4.z(3), this.b5[i]);
                        file = new File(bc4.z(4), this.b5[i]);
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    } else {
                        mb8 mb8Var = this.i7;
                        if (mb8Var != null) {
                            File b = mb8Var.b(i2);
                            if (!this.i7.a(i2) && !this.i7.e(i2)) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (z6 && gda.x0 && (this.i7.d(i2) instanceof TLRPC.Document)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z5 = z6;
                            z4 = z7;
                            cz6Var2 = null;
                            z3 = Z1(i2);
                            file4 = b;
                            cz6Var = null;
                            file = null;
                        } else {
                            z3 = false;
                            z4 = false;
                            z5 = false;
                            cz6Var = null;
                            file = null;
                            cz6Var2 = null;
                        }
                    }
                    z3 = false;
                    z4 = false;
                    z5 = false;
                    cz6Var2 = null;
                    file4 = J;
                    file = J2;
                    cz6Var = cz6Var2;
                }
                cz6Var2 = null;
                file4 = file2;
                cz6Var = cz6Var2;
            }
            if ((i != 0 || !this.k5) && z3) {
                z9 = true;
            } else {
                z9 = false;
            }
            final File file5 = file4;
            final ?? r7 = cz6Var;
            final boolean z11 = z2;
            Utilities.e.c(new Runnable() {
                @Override
                public final void run() {
                    k47 k47Var;
                    yv1 yv1Var;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.d9;
                    boolean z12 = z11;
                    final File file6 = file5;
                    if (!z12 && file6 != null) {
                        z12 = file6.exists();
                    }
                    File file7 = file;
                    cz6 cz6Var5 = cz6Var2;
                    File file8 = null;
                    if (file7 == null && cz6Var5 != null) {
                        file7 = cz6Var5.a();
                    } else if (cz6Var5 != null) {
                        file8 = cz6Var5.a();
                    }
                    final File file9 = file7;
                    if (!z12 && file9 != null) {
                        z12 = file9.exists();
                    }
                    if (!z12 && file8 != null) {
                        z12 = file8.exists();
                    }
                    final boolean z13 = z12;
                    final PhotoViewer photoViewer = PhotoViewer.this;
                    final int i4 = i;
                    final boolean z14 = z4;
                    if (!z13 && i4 != 0 && (k47Var = r7) != null && z14 && er3.q(photoViewer.U).b(k47Var.k) != 0 && (((yv1Var = photoViewer.k4) == null || yv1Var.h == null) && !k47.Q5(k47Var.k) && (F0 = k47Var.F0()) != null)) {
                        bc4.G(photoViewer.U).X(F0, k47Var, 0, 10);
                    }
                    final boolean z15 = z5;
                    final boolean z16 = z9;
                    final boolean z17 = z;
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z18;
                            Drawable[] drawableArr2 = PhotoViewer.d9;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.b5;
                            w98[] w98VarArr = photoViewer2.X0;
                            int i5 = i4;
                            File file10 = file6;
                            boolean z19 = z15;
                            boolean z20 = z17;
                            boolean z21 = true;
                            if ((file10 == null && file9 == null) || (!(z18 = z13) && !z14)) {
                                if (z19) {
                                    if (!bc4.G(photoViewer2.U).S(strArr[i5])) {
                                        w98VarArr[i5].d(2, false, true);
                                    } else {
                                        w98VarArr[i5].d(1, false, true);
                                    }
                                } else {
                                    w98VarArr[i5].d(0, z20, true);
                                }
                                Float s = fn5.z().s(strArr[i5]);
                                if (s == null) {
                                    s = Float.valueOf(0.0f);
                                }
                                w98VarArr[i5].f(false, s.floatValue());
                            } else {
                                if (i5 != 0 || !photoViewer2.P3) {
                                    if (z19 && (!z16 || (i5 == 0 && photoViewer2.X2))) {
                                        w98VarArr[i5].d(3, z20, true);
                                    } else {
                                        w98VarArr[i5].d(-1, z20, true);
                                    }
                                }
                                if (i5 == 0 && !photoViewer2.p0.y()) {
                                    if (!z18) {
                                        boolean S = bc4.G(photoViewer2.U).S(strArr[i5]);
                                        r7 r7Var = photoViewer2.p0;
                                        if (!S) {
                                            r7Var.u(8);
                                        } else {
                                            r7Var.S(8);
                                        }
                                    } else {
                                        photoViewer2.p0.u(8);
                                    }
                                }
                            }
                            if (i5 == 0) {
                                if (photoViewer2.s4 || (photoViewer2.f7.isEmpty() && (strArr[0] == null || w98VarArr[0].h == 0))) {
                                    z21 = false;
                                }
                                photoViewer2.H6 = z21;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.f7.isEmpty() && i2 >= 0 && i2 < this.f7.size()) {
            Object obj = this.f7.get(i2);
            if (obj instanceof jo6) {
                jo6 jo6Var = (jo6) obj;
                if (jo6Var.b && (!jo6Var.d() || (!jo6Var.j() && this.d2 != 11))) {
                    this.X0[i].d(3, z, true);
                    return;
                }
            }
        }
        this.X0[i].d(-1, z, true);
    }

    public final o49 u0(boolean z) {
        ad8 ad8Var;
        tl4 tl4Var;
        RectF rectF = new RectF();
        if (!z && (ad8Var = this.U8) != null && (tl4Var = ad8Var.e) != null) {
            tl4Var.g(rectF);
        } else {
            s98 s98Var = this.c9;
            tl4.j(rectF, s98Var.S(), s98Var.o0());
        }
        ?? obj = new Object();
        obj.a = rectF.left;
        obj.b = rectF.top;
        obj.c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final void u1() {
        n1b n1bVar = this.o5;
        if (n1bVar != null && this.d2 == 11) {
            if (this.A7) {
                n1bVar.b();
            } else {
                n1bVar.l(this.B4.n(), this.B4.V, i0(this.t4), g0(), new t88(this, (byte) 0));
            }
        }
    }

    public final void u2(boolean r17, boolean r18, defpackage.cb8 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.u2(boolean, boolean, cb8):void");
    }

    public final void v(int i) {
        kdc kdcVar;
        ndc ndcVar = this.G2;
        if (ndcVar != null && ndcVar.d != null && i != ndcVar.e0) {
            ndcVar.e0 = i;
            ArrayList arrayList = ndcVar.O;
            if (arrayList != null && i >= 0 && i < arrayList.size()) {
                kdcVar = (kdc) ndcVar.O.get(i);
            } else {
                kdcVar = null;
            }
            ndcVar.v0(false, kdcVar);
        }
        if (i == -1) {
            ndc.n0(null, this.S4);
        } else {
            ndc ndcVar2 = this.G2;
            if (ndcVar2 != null) {
                ndc.n0(ndcVar2.Z(i), this.S4);
            }
        }
        N2();
        this.q0.U(null, null);
        try {
            fp.b(0);
            if (hi2.v().D()) {
                hi2.v().Q(k0());
            }
            ndc ndcVar3 = this.G2;
            if (ndcVar3 != null) {
                fp.z(ndcVar3.c0());
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final RenderNode v0(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j;
        if (this.P8 == null) {
            renderNode = null;
        } else {
            renderNode = this.Q8;
            if (renderNode == null) {
                ul1.p();
                renderNode = new RenderNode("pv_s_blur_false");
                float a = mr3.a(gm.L(40.0f), 6.0f);
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
        ucb ucbVar = this.R8;
        ucbVar.a = 0L;
        ucbVar.b = false;
        for (float f : colorMatrix.getArray()) {
            ucbVar.c(f);
        }
        ucbVar.a(0L);
        if (ucbVar.b) {
            j = -1;
        } else {
            j = ucbVar.a;
        }
        RenderNode renderNode2 = (RenderNode) this.S8.f(j);
        if (renderNode2 == null) {
            ul1.p();
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

    public final void v1(String str, long j, boolean z, float f, float f2, int i, long j2) {
        boolean z2;
        int parseInt;
        if (this.C8 != null) {
            Utilities.e.a(this.C8);
            this.C8 = null;
        }
        x98 x98Var = this.X7;
        x98Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        x98Var.E = mediaMetadataRetriever;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z3 = true;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x98Var.x = z2;
        x98Var.d = f;
        x98Var.e = f2;
        float f3 = x98Var.s;
        if (f3 < f) {
            x98Var.s = f;
        } else if (f3 > f2) {
            x98Var.s = f2;
        }
        try {
            if (i2 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                x98Var.y = open;
                x98Var.E.setDataSource(open.getFileDescriptor(), j, file.length() - j);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = x98Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                x98Var.a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = x98Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                x98Var.b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = x98Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                x98Var.c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = x98Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i3 = x98Var.b;
                x98Var.b = x98Var.c;
                x98Var.c = i3;
            }
            if (x98Var.x) {
                x98Var.f = (float) ((j2 / 1000.0d) / x98Var.a);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        x98Var.invalidate();
        this.D8 = null;
        if (!z && this.d2 != 1) {
            z3 = false;
        }
        this.r = z3;
        this.e8 = -1;
        this.g8 = 0;
        this.o8 = 25;
        this.z8 = new File(str).length();
        mp3 mp3Var = Utilities.e;
        ab8 ab8Var = new ab8(this, str, j, i);
        this.C8 = ab8Var;
        mp3Var.c(ab8Var);
    }

    public final void v2() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.v2():void");
    }

    public final void w(boolean z, boolean z2, float f) {
        if (f != this.u1) {
            this.u1 = f;
            if (this.S4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.u1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + k47.B0(this.S4.k) + "_" + this.S4.e1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + k47.B0(this.S4.k) + "_" + this.S4.e1(), this.u1).commit();
                }
            }
            ndc ndcVar = this.G2;
            if (ndcVar != null) {
                ndcVar.u0(this.u1);
            }
            ya8 ya8Var = this.g0;
            if (ya8Var != null) {
                ya8Var.setPlaybackSpeed(this.u1);
            }
        }
        S1(true, z);
        if (z2) {
            this.q0.U(null, null);
        }
    }

    public final int w0() {
        return this.t2.right;
    }

    public final void w1(boolean z) {
        this.l7 = null;
        gm.r(this.n7);
        odc odcVar = this.k7;
        if (odcVar != null) {
            odcVar.a(this.U, null);
        }
        D0();
        int i = 0;
        this.E2 = false;
        ad8 ad8Var = this.U8;
        if (ad8Var != null && ad8Var.c == 0) {
            this.U8 = null;
            ad8Var.g();
        }
        ndc ndcVar = this.G2;
        HashMap hashMap = f9;
        z98 z98Var = this.y2;
        if (ndcVar != null) {
            m();
            gm.r(this.x2);
            gm.r(z98Var);
            if (this.c3 != null) {
                float S = ((float) this.G2.S()) / ((float) this.G2.U());
                String str = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new sb8(S));
                k47 k47Var = this.S4;
                if (k47Var != null) {
                    k47Var.l3 = Float.valueOf(S);
                }
            }
            this.G2.l0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.g0 != null) {
            gm.r(z98Var);
            if (this.c3 != null) {
                float m0 = ((float) m0()) / ((float) z0());
                String str2 = this.c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new sb8(m0));
                k47 k47Var2 = this.S4;
                if (k47Var2 != null) {
                    k47Var2.l3 = Float.valueOf(m0);
                }
            }
        }
        tv3 tv3Var = this.W3;
        if (tv3Var != null) {
            tv3Var.disable();
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
                fc4.g(e, true);
            }
        }
        oa8 oa8Var = this.z2;
        if (oa8Var != null) {
            try {
                this.f0.removeView(oa8Var);
            } catch (Throwable unused) {
            }
            this.z2 = null;
        }
        k();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof ncc) {
                ncc nccVar = (ncc) textureView;
                uf4 uf4Var = nccVar.b;
                if (uf4Var != null) {
                    uf4Var.postRunnable(new sf4(uf4Var, (byte) 0));
                }
                nccVar.a = null;
            }
            this.C2 = null;
        }
        this.c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            gm.r(this.h4);
        }
        if (!z && !this.G8 && !this.H8) {
            Y1(false, true);
        }
        w98 w98Var = this.X0[0];
        while (true) {
            float[] fArr = w98Var.n;
            if (i < fArr.length) {
                w98Var.m[i] = 1.0f;
                fArr[i] = 1.0f;
                i++;
            } else {
                w98Var.a();
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
        float N = gm.N(24.0f);
        jp0 jp0Var = this.Q0;
        Property property = View.ALPHA;
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(jp0Var, property, f));
        jp0 jp0Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(jp0Var2, property2, f2));
        n1b n1bVar = this.o5;
        if (n1bVar != null) {
            if (z) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(n1bVar, property, f8));
        }
        if (this.o5 != null) {
            yc ycVar = this.r5;
            if (z) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ycVar, property, f7));
        }
        vi3 vi3Var = this.T0;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(vi3Var, property, f3));
        vi3 vi3Var2 = this.T0;
        if (z) {
            f4 = 0.0f;
        } else {
            f4 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(vi3Var2, property2, f4));
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
            x(true);
            jc1 jc1Var = this.V1.f;
            if (jc1Var.e) {
                jc1Var.k(true);
            }
            jc1 jc1Var2 = this.W1.f;
            if (jc1Var2.e) {
                jc1Var2.k(true);
            }
            this.V1.f.d();
            this.W1.f.d();
        }
    }

    public final void x(boolean z) {
        int i = this.O4;
        if (i >= 0 && i < this.f7.size() && K0()) {
            if (z) {
                c();
            }
            d0().p();
        }
    }

    public final void x1(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.D8 != null) {
            MediaController.w().d(this.D8);
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
                w98 w98Var = this.X0[0];
                if (w98Var.h != 0 && w98Var.k != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                w98Var.f(z3, 0.0f);
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
                    k47 k47Var = new k47(z8c.t0, tL_message, false, false);
                    this.D8 = k47Var;
                    k47Var.k.attachPath = new File(bc4.z(4), "video_preview.mp4").getAbsolutePath();
                    this.D8.r0 = new rcc();
                    rcc rccVar = this.D8.r0;
                    rccVar.g = this.g8;
                    rccVar.h = this.h8;
                    this.D8.r0.i = this.i8;
                    rcc rccVar2 = this.D8.r0;
                    rccVar2.n = this.o8;
                    Uri uri = this.V4;
                    if (uri == null) {
                        rccVar2.o = uri.getPath();
                    } else {
                        rccVar2.o = uri.getPath();
                    }
                }
                rcc rccVar3 = this.D8.r0;
                long j = this.r8;
                rccVar3.a = j;
                long j2 = this.s8;
                rccVar3.b = j2;
                if (j == -1) {
                    j = 0;
                }
                if (j2 == -1) {
                    j2 = this.n8 * 1000.0f;
                }
                if (j2 - j > 5000000) {
                    rccVar3.b = j + 5000000;
                }
                rccVar3.m = this.l8;
                this.D8.r0.k = this.j8;
                this.D8.r0.l = this.k8;
                rcc rccVar4 = this.D8.r0;
                rccVar4.X = true;
                rccVar4.v = this.n8 * 1000.0f;
                if (!MediaController.w().g0(this.D8, true, true, true)) {
                    this.E8 = true;
                }
                this.H8 = true;
                w98 w98Var2 = this.X0[0];
                if (w98Var2.h != 0 && w98Var2.k != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                w98Var2.f(z2, 0.0f);
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
        n88 n88Var = this.y;
        gm.r(n88Var);
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
                gm.d3(n88Var, 500L);
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
        dj1 dj1Var = this.Y0;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        dj1Var.setAlpha(f);
        dj1 dj1Var2 = this.Y0;
        if (!z) {
            i = 4;
        }
        dj1Var2.setVisibility(i);
    }

    @Override
    public final void y() {
        E0();
    }

    public final int y0(int i) {
        ylb ylbVar = this.w2;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
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
        dj1 dj1Var = this.Y0;
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(dj1Var, property, f));
        this.x.setDuration(200L);
        this.x.addListener(new pa8(this, z, (byte) 1));
        this.x.start();
    }

    public final void z() {
        sa8 sa8Var = this.M1;
        Activity activity = this.E;
        n88 n88Var = new n88(this, (byte) 2);
        if (sa8Var.B1) {
            sa8Var.y0(false);
        } else if (sa8Var.a2) {
            sa8Var.i0(true);
        } else if (sa8Var.J0 && sa8Var.I0 != null) {
            sa8Var.t0(null, true);
        } else if (sa8Var.v0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sa8Var.G1, activity);
            String M0 = jb6.M0(2131747011, null);
            he heVar = alertDialog$Builder.a;
            heVar.U = M0;
            heVar.S = jb6.M0(2131751342, null);
            alertDialog$Builder.j(jb6.M0(2131747313, null), new wx4(n88Var, (byte) 18));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            b2(alertDialog$Builder);
        } else {
            n88Var.run();
        }
    }

    public final long z0() {
        ya8 ya8Var = this.g0;
        if (ya8Var != null && ya8Var.y) {
            return ya8Var.getVideoDuration();
        }
        ndc ndcVar = this.G2;
        if (ndcVar == null) {
            return 0L;
        }
        return ndcVar.U();
    }

    public final float z1(boolean z) {
        int i;
        if (this.d2 == 11) {
            int i0 = i0(this.t4);
            if (i0 == 0) {
                i0 = gm.q.x;
            }
            float z2 = b10.z(20.0f, i0, 1) / i0;
            if (z) {
                int q = this.B4.q();
                int o = this.B4.o();
                if ((q <= 1 || o <= 1) && (i = this.O4) >= 0) {
                    ArrayList arrayList = this.f7;
                    if (i < arrayList.size()) {
                        Object obj = arrayList.get(this.O4);
                        if (obj instanceof jo6) {
                            jo6 jo6Var = (jo6) obj;
                            q = jo6Var.F;
                            o = jo6Var.G;
                            if ((jo6Var.J / 90) % 2 != 0) {
                                o = q;
                                q = o;
                            }
                        }
                    }
                }
                if (q > 1 && o > 1 && q > o) {
                    return (q / o) * z2;
                }
            }
            return z2;
        }
        return 1.0f;
    }

    public final void z2(boolean z) {
        float f;
        float f2;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = gm.N(24.0f);
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
    public final void V(float f, int i) {
    }
}
