package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import android.text.style.URLSpan;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
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
import android.view.Window;
import android.view.WindowManager;
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
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
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
public class PhotoViewer implements org.telegram.messenger.fs, org.telegram.ui.Components.j10, org.telegram.ui.Components.i10, te.b {
    public static Drawable[] Z8;
    public static final Paint f43152a9 = new Paint(2);
    public static final HashMap f43153b9 = new HashMap();
    public static DecelerateInterpolator f43154c9;
    public static Paint f43155d9;
    public static final Property f43156e9;
    public static volatile PhotoViewer f43157f9;
    public static volatile PhotoViewer f43158g9;
    public org.telegram.ui.ActionBar.e1 A0;
    public org.telegram.ui.Components.x51 A1;
    public View A2;
    public final int[] A3;
    public org.telegram.ui.Components.dc0 A4;
    public boolean A5;
    public float A6;
    public ObjectAnimator A7;
    public boolean A8;
    public org.telegram.ui.ActionBar.z B0;
    public org.telegram.ui.Components.cn0 B1;
    public AnimatorSet B2;
    public boolean B3;
    public ImageReceiver B4;
    public boolean B5;
    public float B6;
    public int B7;
    public boolean B8;
    public org.telegram.ui.ActionBar.r0 C0;
    public AnimatorSet C1;
    public TextureView C2;
    public Bitmap C3;
    public ImageReceiver C4;
    public int C5;
    public float C6;
    public xi.e C7;
    public boolean C8;
    public org.telegram.ui.ActionBar.r0 D0;
    public org.telegram.ui.Components.qd0 D1;
    public SurfaceView D2;
    public Bitmap D3;
    public ImageReceiver D4;
    public long D5;
    public float D6;
    public float D7;
    public String D8;
    public Activity E;
    public org.telegram.ui.ActionBar.r0 E0;
    public final og.g E1;
    public boolean E2;
    public ImageView E3;
    public h2.c E4;
    public long E5;
    public float E6;
    public float E7;
    public final org.telegram.ui.Components.c6 E8;
    public ContextThemeWrapper F;
    public org.telegram.ui.ActionBar.r0 F0;
    public og.g F1;
    public pq0 F2;
    public boolean F3;
    public h2.c F4;
    public ch.p0 F5;
    public float F6;
    public final hn0 F7;
    public org.telegram.ui.Components.c6[] F8;
    public org.telegram.ui.Components.v7 G;
    public org.telegram.ui.ActionBar.z0 G0;
    public og.g G1;
    public org.telegram.ui.Components.f61 G2;
    public int G3;
    public h2.c G4;
    public String G5;
    public float G6;
    public Path G7;
    public RectF G8;
    public ImageView H;
    public org.telegram.ui.Components.q7 H0;
    public org.telegram.messenger.we H1;
    public boolean H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public float H6;
    public Paint H7;
    public RectF H8;
    public Drawable I;
    public d61 I0;
    public org.telegram.messenger.we I1;
    public Runnable I2;
    public boolean I3;
    public boolean I4;
    public long I5;
    public boolean I6;
    public Paint I7;
    public Matrix I8;
    public ih.c J;
    public d61 J0;
    public org.telegram.ui.Components.de0 J1;
    public boolean J2;
    public boolean J3;
    public boolean J4;
    public int J5;
    public boolean J6;
    public LinearGradient J7;
    public float[] J8;
    public boolean K;
    public vq K0;
    public AnimatorSet K1;
    public float K2;
    public boolean K3;
    public boolean K4;
    public int K5;
    public boolean K6;
    public LinearGradient K7;
    public RenderNode K8;
    public boolean L;
    public final HashMap L0;
    public hi.p3 L1;
    public float L2;
    public boolean L3;
    public boolean L4;
    public int L5;
    public boolean L6;
    public Matrix L7;
    public RenderNode L8;
    public AnimatorSet M;
    public final BackgroundDrawable M0;
    public vp0 M1;
    public float M2;
    public boolean M3;
    public final Matrix M4;
    public boolean M5;
    public int M6;
    public Matrix M7;
    public final dh.a M8;
    public tq0 N;
    public final Paint N0;
    public boolean N1;
    public float N2;
    public float N3;
    public final Paint N4;
    public boolean N5;
    public int N6;
    public final int[] N7;
    public final a0.h N8;
    public sq0 O;
    public CheckBox O0;
    public up0 O1;
    public float O2;
    public long O3;
    public Bitmap O4;
    public boolean O5;
    public boolean O6;
    public xq0 O7;
    public boolean O8;
    public boolean P;
    public CounterView P0;
    public boolean P1;
    public float P2;
    public boolean P3;
    public int P4;
    public final boolean[] P5;
    public boolean P6;
    public org.telegram.ui.Cells.x0 P7;
    public wi.n P8;
    public boolean Q;
    public di.n4 Q0;
    public org.telegram.ui.ActionBar.u1 Q1;
    public boolean Q2;
    public boolean Q3;
    public int Q4;
    public boolean Q5;
    public boolean Q6;
    public RadialProgressView Q7;
    public wi.o Q8;
    public vo0 R;
    public FrameLayout R0;
    public mq0 R1;
    public int R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public boolean R6;
    public FrameLayout R7;
    public float R8;
    public boolean S;
    public FrameLayout S0;
    public FrameLayout S1;
    public org.telegram.ui.Components.f61 S2;
    public long S3;
    public boolean S4;
    public boolean S5;
    public boolean S6;
    public xo0 S7;
    public boolean S8;
    public Paint T;
    public oi.u1 T0;
    public TextView T1;
    public SurfaceTexture T2;
    public View T3;
    public org.telegram.messenger.fj T4;
    public boolean T5;
    public int T6;
    public TextView T7;
    public final RectF T8;
    public int U;
    public org.telegram.ui.Components.fe0 U0;
    public wp0 U1;
    public boolean U2;
    public qo0 U3;
    public VideoAds U4;
    public boolean U5;
    public VelocityTracker U6;
    public AnimatorSet U7;
    public boolean U8;
    public int V;
    public org.telegram.ui.Cells.x0 V0;
    public ap0 V1;
    public boolean V2;
    public int V3;
    public ArrayList V4;
    public boolean V5;
    public Scroller V6;
    public long V7;
    public boolean V8;
    public int W;
    public TextView W0;
    public bp0 W1;
    public boolean W2;
    public org.telegram.ui.Components.au W3;
    public Uri W4;
    public float W5;
    public final ArrayList W6;
    public long W7;
    public final hn0 W8;
    public float X;
    public final wo0[] X0;
    public float X1;
    public boolean X2;
    public int X3;
    public final nq0 X4;
    public float X5;
    public final SparseArray[] X6;
    public long X7;
    public final so0 X8;
    public ho0 Y;
    public yc Y0;
    public k0 Y1;
    public boolean Y2;
    public int Y3;
    public TLRPC.BotInlineResult Y4;
    public float Y5;
    public final ArrayList Y6;
    public volatile int Y7;
    public View Y8;
    public dh.c Z;
    public ImageView Z0;
    public FrameLayout Z1;
    public boolean Z2;
    public boolean Z3;
    public org.telegram.messenger.fc Z4;
    public float Z5;
    public final SparseArray[] Z6;
    public volatile int Z7;
    public final te.a f43159a = new te.a(0, this, org.telegram.ui.Components.lr.h, 380, false);
    public xe.b f43160a0;
    public ImageView f43161a1;
    public FrameLayout f43162a2;
    public float f43163a3;
    public final org.telegram.ui.Cells.k1 f43164a4;
    public org.telegram.messenger.fc f43165a5;
    public float f43166a6;
    public final ArrayList f43167a7;
    public int f43168a8;
    public final boolean f43169b;
    public xe.b f43170b0;
    public ImageView f43171b1;
    public org.telegram.ui.Components.si f43172b2;
    public String f43173b3;
    public final VideoFramesRewinder f43174b4;
    public org.telegram.messenger.yv f43175b5;
    public float f43176b6;
    public final ArrayList f43177b7;
    public int f43178b8;
    public int f43179c;
    public org.telegram.ui.Components.ca f43180c0;
    public ImageView f43181c1;
    public bg.v0 f43182c2;
    public String f43183c3;
    public final ip0 f43184c4;
    public final String[] f43185c5;
    public float f43186c6;
    public final ArrayList f43187c7;
    public volatile int f43188c8;
    public uq0 d;
    public org.telegram.ui.Components.ga f43189d0;
    public ImageView f43190d1;
    public int d2;
    public long f43191d3;
    public final org.telegram.ui.Cells.g2 f43192d4;
    public wq0 f43193d5;
    public float f43194d6;
    public final ArrayList f43195d7;
    public volatile int f43196d8;
    public boolean f43197e;
    public WindowManager.LayoutParams f43198e0;
    public org.telegram.ui.Components.h00 f43199e1;
    public boolean f43200e2;
    public float f43201e3;
    public CharSequence f43202e4;
    public String f43203e5;
    public float f43204e6;
    public final ArrayList f43205e7;
    public volatile int f43206e8;
    public boolean f43207f;
    public qq0 f43208f0;
    public org.telegram.ui.ActionBar.g0 f43209f1;
    public boolean f43210f2;
    public boolean f43211f3;
    public boolean f43212f4;
    public long f43213f5;
    public float f43214f6;
    public final ArrayList f43215f7;
    public volatile int f43216f8;
    public dq0 f43217g0;
    public org.telegram.ui.Components.m80 f43218g1;
    public boolean f43219g2;
    public long f43220g3;
    public boolean f43221g4;
    public String f43222g5;
    public float f43223g6;
    public final ArrayList f43224g7;
    public volatile int f43225g8;
    public int h;
    public vq0 f43226h0;
    public yo0 f43227h1;
    public boolean f43228h2;
    public boolean f43229h3;
    public final zo0 f43230h4;
    public boolean f43231h5;
    public float f43232h6;
    public org.telegram.messenger.fc h7;
    public volatile int f43233h8;
    public ClippingImageView f43234i0;
    public ArrayList f43235i1;
    public boolean f43236i2;
    public cr0 f43237i3;
    public final zo0 f43238i4;
    public TL_iv.PageBlock f43239i5;
    public float f43240i6;
    public yq0 i7;
    public float f43241i8;
    public ih0 f43242j0;
    public ArrayList f43243j1;
    public boolean f43244j2;
    public String j3;
    public final t50 f43245j4;
    public org.telegram.messenger.hc f43246j5;
    public float f43247j6;
    public rq0 f43248j7;
    public int f43249j8;
    public View f43250k0;
    public org.telegram.ui.Components.s51 f43251k1;
    public org.telegram.ui.Components.b6 f43252k2;
    public ValueAnimator f43253k3;
    public final float[][] f43254k4;
    public boolean f43255k5;
    public float f43256k6;
    public final Rect f43257k7;
    public volatile boolean f43258k8;
    public int f43259l0;
    public hi.m3 l1;
    public boolean f43260l2;
    public boolean f43261l3;
    public bn f43262l4;
    public boolean f43263l5;
    public float f43264l6;
    public final h2.f f43265l7;
    public volatile boolean f43266l8;
    public TextView m0;
    public org.telegram.ui.Components.w20 f43267m1;
    public boolean f43268m2;
    public final int[] f43269m3;
    public org.telegram.ui.ActionBar.h2 f43270m4;
    public boolean f43271m5;
    public float f43272m6;
    public bg.v0 f43273m7;
    public long f43274m8;
    public boolean f43275n;
    public TextView f43276n0;
    public org.telegram.ui.Components.n01 n1;
    public boolean f43277n2;
    public final int[] f43278n3;
    public int f43279n4;
    public boolean f43280n5;
    public long f43281n6;
    public org.telegram.ui.Components.gc f43282n7;
    public long f43283n8;
    public TextView f43284o0;
    public UndoView f43285o1;
    public boolean f43286o2;
    public org.telegram.ui.ActionBar.n5 f43287o3;
    public long o4;
    public String f43288o5;
    public int f43289o6;
    public int f43290o7;
    public float f43291o8;
    public org.telegram.ui.ActionBar.r0 f43292p0;
    public br0 f43293p1;
    public org.telegram.ui.Components.s30 f43294p2;
    public ImageView f43295p3;
    public Runnable f43296p4;
    public tg.e2 f43297p5;
    public AnimatorSet f43298p6;
    public boolean f43299p7;
    public float f43300p8;
    public org.telegram.ui.ActionBar.r0 f43301q0;
    public l4 f43302q1;
    public boolean f43303q2;
    public org.telegram.ui.Components.h61 f43304q3;
    public wq0 f43305q4;
    public org.telegram.ui.Components.ee0 f43306q5;
    public AnimatorSet f43307q6;
    public CharSequence f43308q7;
    public long f43309q8;
    public boolean f43310r;
    public org.telegram.ui.ActionBar.z0 f43311r0;
    public ImageReceiver f43312r1;
    public org.telegram.messenger.uo f43313r2;
    public uv f43314r3;
    public wq0 f43315r4;
    public ArrayList f43316r5;
    public org.telegram.ui.Components.k10 f43317r6;
    public boolean f43318r7;
    public long f43319r8;
    public boolean f43320s;
    public org.telegram.ui.ActionBar.v0 f43321s0;
    public boolean f43322s1;
    public boolean f43323s2;
    public kp0 f43324s3;
    public boolean f43325s4;
    public fi.u2 s5;
    public boolean f43326s6;
    public ValueAnimator f43327s7;
    public long f43328s8;
    public org.telegram.ui.ActionBar.z0 f43329t0;
    public final hn0 f43330t1;
    public final Rect f43331t2;
    public AnimatorSet f43332t3;
    public boolean f43333t4;
    public iq0 f43334t5;
    public final DecelerateInterpolator t6;
    public TLRPC.Document f43335t7;
    public long f43336t8;
    public org.telegram.ui.ActionBar.z0 f43337u0;
    public float f43338u1;
    public boolean f43339u2;
    public boolean f43340u3;
    public int f43341u4;
    public LinearLayout f43342u5;
    public float f43343u6;
    public TLRPC.Document f43344u7;
    public long f43345u8;
    public org.telegram.ui.ActionBar.e1 f43346v0;
    public long f43347v1;
    public boolean f43348v2;
    public int f43349v3;
    public final hn0 f43350v4;
    public iq0 f43351v5;
    public float f43352v6;
    public boolean f43353v7;
    public long f43354v8;
    public int f43355w;
    public org.telegram.ui.ActionBar.z0 f43356w0;
    public final GradientDrawable[] f43357w1;
    public org.telegram.ui.ActionBar.i6 f43358w2;
    public wi.o f43359w3;
    public int f43360w4;
    public iq0 f43361w5;
    public float f43362w6;
    public boolean f43363w7;
    public float f43364w8;
    public AnimatorSet f43365x;
    public xq f43366x0;
    public final boolean[] f43367x1;
    public final to0 f43368x2;
    public ImageView f43369x3;
    public String f43370x4;
    public iq0 f43371x5;
    public float f43372x6;
    public org.telegram.messenger.q10 f43373x7;
    public eq0 f43374x8;
    public final hn0 f43375y;
    public LinearLayout f43376y0;
    public final float[] f43377y1;
    public final zo0 f43378y2;
    public final ImageView[] f43379y3;
    public org.telegram.ui.Components.dc0 f43380y4;
    public iq0 f43381y5;
    public float f43382y6;
    public final float[] f43383y7;
    public org.telegram.messenger.fj f43384y8;
    public final ArrayList f43385z0;
    public int f43386z1;
    public org.telegram.ui.Components.se0 f43387z2;
    public boolean f43388z3;
    public org.telegram.ui.Components.dc0 f43389z4;
    public long f43390z5;
    public float f43391z6;
    public final float[] f43392z7;
    public boolean f43393z8;

    public class BackgroundDrawable extends ColorDrawable {
        public static final int f43394g = 0;
        public final RectF f43395a;
        public final RectF f43396b;
        public final Paint f43397c;
        public we0 d;
        public boolean f43398e;

        public BackgroundDrawable() {
            super(-16777216);
            this.f43395a = new RectF();
            this.f43396b = new RectF();
            Paint paint = new Paint(1);
            this.f43397c = paint;
            paint.setColor(-16777216);
        }

        public final void a() {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            bg.v0 v0Var = photoViewer.f43273m7;
            if (v0Var != null) {
                v0Var.b(!this.f43398e);
            }
            bg.v0 v0Var2 = photoViewer.f43182c2;
            if (v0Var2 != null) {
                v0Var2.b(!this.f43398e);
            }
            org.telegram.ui.Components.si siVar = photoViewer.f43172b2;
            if (siVar != null) {
                boolean z11 = this.f43398e;
                siVar.f39732w2.m(siVar.f39686j4);
                if (siVar.f39718s4 != z11) {
                    siVar.f39718s4 = z11;
                    org.telegram.ui.Components.ki kiVar = siVar.f39732w2;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
                    if (kiVar == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout != null && !chatAttachAlertPhotoLayout.f32786j1) {
                        if (z11 && !siVar.f39722t4) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (chatAttachAlertPhotoLayout.f32791n && !chatAttachAlertPhotoLayout.P0) {
                            if (z10) {
                                org.telegram.ui.Components.em emVar = chatAttachAlertPhotoLayout.Q;
                                if (emVar != null) {
                                    chatAttachAlertPhotoLayout.f32795p0 = Boolean.valueOf(emVar.isFrontface());
                                    chatAttachAlertPhotoLayout.g0(true);
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
            we0 we0Var;
            wq0 wq0Var;
            Drawable[] drawableArr = PhotoViewer.Z8;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.f43279n4 != 0 && !org.telegram.messenger.g0.Q1() && (wq0Var = photoViewer.f43193d5) != null && wq0Var.f53457m != null) {
                ClippingImageView clippingImageView = photoViewer.f43234i0;
                float translationX = clippingImageView.getTranslationX();
                RectF rectF = this.f43396b;
                rectF.left = translationX;
                rectF.top = clippingImageView.getTranslationY();
                rectF.right = (clippingImageView.getScaleX() * clippingImageView.getMeasuredWidth()) + rectF.left;
                float scaleY = (clippingImageView.getScaleY() * clippingImageView.getMeasuredHeight()) + rectF.top;
                rectF.left += clippingImageView.f32859b;
                rectF.top += clippingImageView.d;
                rectF.right -= clippingImageView.f32860c;
                rectF.bottom = scaleY - clippingImageView.f32858a;
                if (!rectF.isEmpty()) {
                    rectF.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    Rect bounds = getBounds();
                    float f10 = bounds.right;
                    float f11 = bounds.bottom;
                    for (int i7 = 0; i7 < 4; i7++) {
                        RectF rectF2 = this.f43395a;
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 == 3) {
                                        rectF2.set(0.0f, rectF.bottom, f10, f11);
                                    }
                                } else {
                                    rectF2.set(rectF.right, rectF.top, f10, rectF.bottom);
                                }
                            } else {
                                rectF2.set(0.0f, 0.0f, f10, rectF.top);
                            }
                        } else {
                            rectF2.set(0.0f, rectF.top, rectF.left, rectF.bottom);
                        }
                        canvas.drawRect(rectF2, this.f43397c);
                    }
                }
            } else {
                super.draw(canvas);
            }
            if (getAlpha() != 0 && (we0Var = this.d) != null) {
                org.telegram.messenger.g0.g3(we0Var);
                this.d = null;
            }
        }

        @Override
        public void setAlpha(int i7) {
            boolean z10;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (photoViewer.E instanceof LaunchActivity) {
                if (photoViewer.f43197e && i7 == 255) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.f43398e = z10;
                if (z10) {
                    a();
                } else {
                    org.telegram.messenger.g0.h3(new hq0(this, 0), 70L);
                }
            }
            super.setAlpha(i7);
            this.f43397c.setAlpha(i7);
        }
    }

    public static class CounterView extends View {
        public StaticLayout f43400a;
        public final TextPaint f43401b;
        public final Paint f43402c;
        public int d;
        public int f43403e;
        public final RectF f43404f;
        public int h;
        public float f43405n;

        public CounterView(Context context) {
            super(context);
            this.h = 0;
            TextPaint textPaint = new TextPaint(1);
            this.f43401b = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.f43402c = paint;
            paint.setColor(-1);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            this.f43404f = new RectF();
            a(0);
        }

        public final void a(int i7) {
            StaticLayout staticLayout;
            int L = org.telegram.messenger.g0.L(100.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f43401b;
            this.f43400a = new StaticLayout("" + Math.max(1, i7), textPaint, L, alignment, 1.0f, 0.0f, false);
            this.d = (int) Math.ceil(staticLayout.getLineWidth(0));
            this.f43403e = this.f43400a.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            Paint paint = this.f43402c;
            Property property = View.SCALE_Y;
            Property property2 = View.SCALE_X;
            if (i7 == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property2, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f);
                org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.f38712b;
                animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofInt(paint, o6Var, 0), ObjectAnimator.ofInt(textPaint, o6Var, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i10 = this.h;
                if (i10 == 0) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property2, 0.0f, 1.0f);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
                    org.telegram.ui.Components.o6 o6Var2 = org.telegram.ui.Components.q6.f38712b;
                    animatorSet.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofInt(paint, o6Var2, 0, 255), ObjectAnimator.ofInt(textPaint, o6Var2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i7 < i10) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 1.1f, 1.0f), ObjectAnimator.ofFloat(this, property, 1.1f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, property2, 0.9f, 1.0f), ObjectAnimator.ofFloat(this, property, 0.9f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                }
            }
            animatorSet.setDuration(180L);
            animatorSet.start();
            requestLayout();
            this.h = i7;
        }

        @Override
        public final float getRotationX() {
            return this.f43405n;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            Paint paint = this.f43402c;
            paint.setAlpha(255);
            float L = org.telegram.messenger.g0.L(14.0f) + measuredHeight;
            RectF rectF = this.f43404f;
            rectF.set(org.telegram.messenger.g0.L(1.0f), measuredHeight - org.telegram.messenger.g0.L(14.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), L);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), paint);
            if (this.f43400a != null) {
                this.f43401b.setAlpha((int) ((1.0f - this.f43405n) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.d) / 2, (this.f43405n * org.telegram.messenger.g0.L(5.0f)) + org.telegram.messenger.g0.N(0.2f) + ((getMeasuredHeight() - this.f43403e) / 2));
                this.f43400a.draw(canvas);
                canvas.restore();
                paint.setAlpha((int) (this.f43405n * 255.0f));
                int centerX = (int) rectF.centerX();
                int t6 = (int) com.google.android.gms.internal.vision.e2.t(1.0f, this.f43405n, org.telegram.messenger.g0.L(5.0f), (int) rectF.centerY());
                canvas.drawLine(org.telegram.messenger.g0.L(5.0f) + centerX, t6 - org.telegram.messenger.g0.L(5.0f), centerX - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + t6, paint);
                canvas.drawLine(centerX - org.telegram.messenger.g0.L(5.0f), t6 - org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f) + centerX, org.telegram.messenger.g0.L(5.0f) + t6, paint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i7 = this.h;
            if (i7 > 0) {
                accessibilityNodeInfo.setContentDescription(org.telegram.messenger.gd.G(i7, "PhotosSelected", new Object[0]));
            }
        }

        @Override
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(org.telegram.messenger.g0.L(20.0f) + this.d, org.telegram.messenger.g0.L(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }

        @Override
        public void setRotationX(float f10) {
            this.f43405n = f10;
            invalidate();
        }

        @Override
        public void setScaleX(float f10) {
            super.setScaleX(f10);
            invalidate();
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f43156e9 = new go0();
        } else {
            f43156e9 = new org.telegram.ui.Cells.h1(Float.class, "progress", 4);
        }
        f43157f9 = null;
        f43158g9 = null;
    }

    public PhotoViewer() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 30) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43169b = z10;
        this.h = -1;
        this.f43275n = true;
        this.f43375y = new hn0(this, 22);
        this.K = true;
        this.P = true;
        this.Q = false;
        this.f43160a0 = new xe.b();
        this.f43385z0 = new ArrayList();
        this.L0 = new HashMap(3);
        this.M0 = new BackgroundDrawable();
        Paint paint = new Paint();
        this.N0 = paint;
        this.X0 = new wo0[3];
        this.f43330t1 = new hn0(this, 23);
        this.f43357w1 = new GradientDrawable[2];
        this.f43367x1 = new boolean[2];
        this.f43377y1 = new float[2];
        this.E1 = new Object();
        this.F1 = new Object();
        this.G1 = new Object();
        this.X1 = -8.0f;
        this.f43331t2 = new Rect();
        this.f43368x2 = new to0(this);
        this.f43378y2 = new zo0(this, 0);
        this.f43261l3 = true;
        this.f43269m3 = new int[2];
        this.f43278n3 = new int[2];
        this.f43379y3 = new ImageView[3];
        this.A3 = new int[2];
        this.K3 = true;
        this.V3 = -1;
        this.X3 = -10;
        this.f43164a4 = new org.telegram.ui.Cells.k1(this, 1);
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.f43174b4 = videoFramesRewinder;
        this.f43184c4 = new ip0(this, videoFramesRewinder);
        this.f43192d4 = new org.telegram.ui.Cells.g2(this);
        this.f43230h4 = new zo0(this, 1);
        this.f43238i4 = new zo0(this, 2);
        this.f43245j4 = new t50(this, 1);
        this.f43254k4 = (float[][]) Array.newInstance(Float.TYPE, 2, 13);
        this.f43350v4 = new hn0(this, 24);
        this.B4 = new ImageReceiver(null);
        this.C4 = new fi.s2(this, 5);
        this.D4 = new ImageReceiver(null);
        this.E4 = new h2.c(1, new hn0(this, 25));
        this.F4 = new h2.c(1, new hn0(this, 25));
        this.G4 = new h2.c(1, new hn0(this, 25));
        this.L4 = false;
        this.M4 = new Matrix();
        Paint paint2 = new Paint();
        this.N4 = paint2;
        this.O4 = null;
        this.X4 = new Object();
        this.f43185c5 = new String[3];
        this.P5 = new boolean[]{false, true};
        this.f43166a6 = 1.0f;
        this.f43176b6 = 0.0f;
        this.f43289o6 = -1;
        this.t6 = new DecelerateInterpolator(1.5f);
        this.f43362w6 = 1.0f;
        this.f43372x6 = 0.0f;
        this.I6 = true;
        this.Q6 = true;
        this.W6 = new ArrayList();
        this.X6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y6 = new ArrayList();
        this.Z6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43167a7 = new ArrayList();
        this.f43177b7 = new ArrayList();
        this.f43187c7 = new ArrayList();
        this.f43195d7 = new ArrayList();
        this.f43205e7 = new ArrayList();
        this.f43215f7 = new ArrayList();
        this.f43224g7 = new ArrayList();
        this.h7 = null;
        this.i7 = null;
        this.f43257k7 = new Rect();
        this.f43265l7 = new h2.f(new int[]{org.telegram.messenger.ks.f25184s, org.telegram.messenger.ks.f25190t, org.telegram.messenger.ks.W, org.telegram.messenger.ks.V, org.telegram.messenger.ks.f25119g3});
        this.f43383y7 = new float[]{1.0f};
        this.f43392z7 = new float[]{1.0f};
        this.F7 = new hn0(this, 26);
        this.N7 = new int[2];
        this.V7 = -1L;
        this.W7 = -1L;
        this.X7 = -1L;
        this.Z7 = -1;
        this.E8 = new org.telegram.ui.Components.c6(new hn0(this, 25), 180L, org.telegram.ui.Components.lr.f37209g);
        this.M8 = new Object();
        this.N8 = new a0.h();
        this.T8 = new RectF();
        this.W8 = new hn0(this, 27);
        this.X8 = new so0(this);
        paint.setColor(-16777216);
        paint2.setColor(-1);
        this.C4.h0(3);
    }

    public static boolean A1() {
        if (f43157f9 != null) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap C0(android.graphics.Bitmap r16, org.telegram.messenger.we r17, int[] r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C0(android.graphics.Bitmap, org.telegram.messenger.we, int[], boolean):android.graphics.Bitmap");
    }

    public static boolean I1(org.telegram.messenger.fj fjVar) {
        if (f43157f9 != null && !f43157f9.B3 && f43157f9.f43197e && fjVar != null && f43157f9.T4 != null && f43157f9.T4.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(f43157f9.T4.f23965k) == org.telegram.messenger.fj.B0(fjVar.f23965k)) {
            return true;
        }
        return false;
    }

    public static boolean J1(org.telegram.messenger.fj fjVar) {
        if (f43158g9 != null && fjVar != null && f43158g9.T4 != null && f43158g9.T4.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(f43158g9.T4.f23965k) == org.telegram.messenger.fj.B0(fjVar.f23965k)) {
            return true;
        }
        return false;
    }

    public static boolean K1(String str) {
        if (f43157f9 != null && f43157f9.f43197e && !f43157f9.f43325s4 && str != null && str.equals(f43157f9.f43203e5)) {
            return true;
        }
        return false;
    }

    public static void L(PhotoViewer photoViewer) {
        int i7;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        ArrayList arrayList = photoViewer.Y6;
        if (!arrayList.isEmpty() && (i7 = photoViewer.Q4) >= 0 && i7 < arrayList.size() && (fjVar = (org.telegram.messenger.fj) arrayList.get(photoViewer.Q4)) != null) {
            if (photoViewer.f43280n5 && (message = fjVar.f23965k) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.y21.N0())) {
                photoViewer.y2(fjVar, i2(fjVar), false, true);
            } else {
                photoViewer.y2(fjVar, fjVar.f24023z, photoViewer.f43280n5, true);
            }
        }
    }

    public static boolean L1(org.telegram.messenger.fj fjVar) {
        boolean z10;
        if (f43157f9 != null && !f43157f9.B3 && f43157f9.f43197e && !f43157f9.f43325s4 && fjVar != null) {
            org.telegram.messenger.fj fjVar2 = f43157f9.T4;
            if (fjVar2 == null && f43157f9.d != null) {
                fjVar2 = f43157f9.d.V();
            }
            if (fjVar2 != null && fjVar2.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(fjVar2.f23965k) == org.telegram.messenger.fj.B0(fjVar.f23965k)) {
                z10 = true;
                if (z10 && f43158g9 != null) {
                    if (f43158g9.f43197e && !f43158g9.f43325s4 && fjVar != null && f43158g9.T4 != null && f43158g9.T4.e1() == fjVar.e1() && org.telegram.messenger.fj.B0(f43158g9.T4.f23965k) == org.telegram.messenger.fj.B0(fjVar.f23965k)) {
                        return true;
                    }
                    return false;
                }
                return z10;
            }
        }
        z10 = false;
        if (z10) {
        }
        return z10;
    }

    public static boolean M1(TLRPC.BotInlineResult botInlineResult) {
        if (f43157f9 != null && f43157f9.f43197e && !f43157f9.f43325s4 && botInlineResult != null && f43157f9.Y4 != null && botInlineResult.f28401id == f43157f9.Y4.f28401id) {
            return true;
        }
        return false;
    }

    public static boolean N1(TLRPC.FileLocation fileLocation) {
        if (f43157f9 != null && f43157f9.f43197e && !f43157f9.f43325s4 && fileLocation != null) {
            if (f43157f9.Z4 == null || fileLocation.local_id != f43157f9.Z4.f23868f.local_id || fileLocation.volume_id != f43157f9.Z4.f23868f.volume_id || fileLocation.dc_id != f43157f9.Z4.f23864a) {
                if (f43157f9.f43165a5 != null && fileLocation.local_id == f43157f9.f43165a5.f23868f.local_id && fileLocation.volume_id == f43157f9.f43165a5.f23868f.volume_id && fileLocation.dc_id == f43157f9.f43165a5.f23864a) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void O(PhotoViewer photoViewer) {
        TextureView textureView;
        if (photoViewer.V7 != -1 && (textureView = photoViewer.C2) != null) {
            photoViewer.V7 = -1L;
            photoViewer.A2.animate().alpha(1.0f).setInterpolator(org.telegram.ui.Components.lr.f37211j).setDuration(85L).setListener(new org.telegram.ui.Components.h60(11, photoViewer, textureView.getBitmap())).start();
        }
    }

    public static void P(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.P(org.telegram.ui.PhotoViewer):void");
    }

    public static boolean P2(org.telegram.messenger.fj fjVar) {
        if (fjVar != null && org.telegram.messenger.fj.L4(fjVar.f23965k)) {
            if (fjVar.f24024z0 || fjVar.f24020y0 || fjVar.D2(true) || (fjVar.B() && org.telegram.messenger.bz.B0)) {
                int i7 = org.telegram.messenger.bz.f23145a;
                if (org.telegram.messenger.pc.e(1024)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void Q(PhotoViewer photoViewer) {
        int i7;
        org.telegram.ui.Components.h61 h61Var = photoViewer.f43304q3;
        if (h61Var.f35764f) {
            i7 = h61Var.d;
        } else {
            i7 = h61Var.f35761b;
        }
        int L = (org.telegram.messenger.g0.L(2.0f) + ((org.telegram.ui.Components.h61.S / 2) + i7)) - (photoViewer.f43324s3.getMeasuredWidth() / 2);
        int L2 = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = (photoViewer.f43237i3.getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f)) - (photoViewer.f43324s3.getMeasuredWidth() / 2);
        if (L < L2) {
            kp0 kp0Var = photoViewer.f43324s3;
            kp0Var.setPivotX(Utilities.i((kp0Var.getMeasuredWidth() / 2.0f) - (L2 - L), photoViewer.f43324s3.getMeasuredWidth(), 0.0f));
            L = L2;
        } else if (L >= measuredWidth) {
            kp0 kp0Var2 = photoViewer.f43324s3;
            kp0Var2.setPivotX(Utilities.i((kp0Var2.getMeasuredWidth() / 2.0f) + (L - measuredWidth), photoViewer.f43324s3.getMeasuredWidth(), 0.0f));
            L = measuredWidth;
        } else {
            kp0 kp0Var3 = photoViewer.f43324s3;
            kp0Var3.setPivotX(kp0Var3.getMeasuredWidth() / 2.0f);
        }
        photoViewer.f43324s3.setTranslationX(L);
    }

    public static void R(PhotoViewer photoViewer, boolean z10) {
        org.telegram.ui.Components.mh0 B;
        nq0 nq0Var = photoViewer.X4;
        ArrayList arrayList = nq0Var.f50267e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) nq0Var.f50267e.get(i7);
                if (c20Var.f23229a == 0 && (c20Var.f23230b & 1) != 0) {
                    View view = c20Var.I;
                    if ((view instanceof org.telegram.ui.Components.q9) && (B = ((org.telegram.ui.Components.q9) view).getImageReceiver().B()) != null) {
                        if (z10) {
                            B.start();
                        } else {
                            B.stop();
                        }
                    }
                }
            }
        }
    }

    public static int R0(org.telegram.messenger.xe xeVar) {
        if (xeVar.d()) {
            return org.telegram.messenger.g0.Z0(false);
        }
        return 512;
    }

    public static void S(PhotoViewer photoViewer, long j3) {
        org.telegram.ui.Components.mh0 B;
        nq0 nq0Var = photoViewer.X4;
        ArrayList arrayList = nq0Var.f50267e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) nq0Var.f50267e.get(i7);
                if (c20Var.f23229a == 0 && (c20Var.f23230b & 1) != 0) {
                    View view = c20Var.I;
                    if ((view instanceof org.telegram.ui.Components.q9) && (B = ((org.telegram.ui.Components.q9) view).getImageReceiver().B()) != null) {
                        long j10 = photoViewer.f43274m8;
                        long j11 = 0;
                        if (j10 > 0) {
                            j11 = j10 / 1000;
                        }
                        B.U(j3 - j11);
                    }
                }
            }
        }
    }

    public static void T(org.telegram.ui.PhotoViewer r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T(org.telegram.ui.PhotoViewer, int):void");
    }

    public static String U0(int i7, int i10) {
        int i11;
        int i12;
        if (i7 >= 100) {
            i11 = 99;
        } else {
            i11 = i7;
        }
        char c10 = (char) ((i11 / 10) + 48);
        if (i7 >= 100) {
            i7 = 99;
        }
        char c11 = (char) ((i7 % 10) + 48);
        if (i10 >= 100) {
            i12 = 99;
        } else {
            i12 = i10;
        }
        char c12 = (char) ((i12 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        return new String(new char[]{c10, c11, ':', c12, (char) ((i10 % 10) + 48)});
    }

    public static String V0(int i7, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i7 >= 100) {
            i12 = 99;
        } else {
            i12 = i7;
        }
        char c10 = (char) ((i12 / 10) + 48);
        if (i7 >= 100) {
            i7 = 99;
        }
        char c11 = (char) ((i7 % 10) + 48);
        if (i10 >= 100) {
            i13 = 99;
        } else {
            i13 = i10;
        }
        char c12 = (char) ((i13 / 10) + 48);
        if (i10 >= 100) {
            i10 = 99;
        }
        char c13 = (char) ((i10 % 10) + 48);
        if (i11 >= 100) {
            i14 = 99;
        } else {
            i14 = i11;
        }
        char c14 = (char) ((i14 / 10) + 48);
        if (i11 >= 100) {
            i11 = 99;
        }
        return new String(new char[]{c10, c11, ':', c12, c13, ':', c14, (char) ((i11 % 10) + 48)});
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.bz.f23146a0 && org.telegram.messenger.bz.o() >= 2 && !org.telegram.messenger.g0.m0) {
            return true;
        }
        return false;
    }

    public static boolean c(org.telegram.ui.PhotoViewer r27, android.view.MotionEvent r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c(org.telegram.ui.PhotoViewer, android.view.MotionEvent):boolean");
    }

    public static CharSequence i2(org.telegram.messenger.fj fjVar) {
        if (fjVar.f23965k == null) {
            return "";
        }
        Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(fjVar.f23965k.translatedText.text), org.telegram.ui.ActionBar.n6.f29591o2.getFontMetricsInt(), false, null, 0), fjVar.f23965k.translatedText.entities, org.telegram.ui.ActionBar.n6.f29591o2.getFontMetricsInt(), false);
        if (org.telegram.messenger.fj.M(B5)) {
            try {
                org.telegram.messenger.g0.c(B5, 5, false, true);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.messenger.fj.h(fjVar.P3(), B5, true, 0, 0, true);
        org.telegram.messenger.fj.b(B5, fjVar.f23965k.translatedText.entities, fjVar.P3(), true, true, true, 0);
        if (org.telegram.messenger.fj.L4(fjVar.f23965k)) {
            org.telegram.messenger.fj.h(fjVar.P3(), B5, true, 3, (int) fjVar.L0(), false);
        } else if (fjVar.I3() || org.telegram.messenger.fj.R4(fjVar.f23965k)) {
            org.telegram.messenger.fj.h(fjVar.P3(), B5, true, 4, (int) fjVar.L0(), false);
        }
        return B5;
    }

    public static String m1(org.telegram.messenger.fc fcVar) {
        if (fcVar != null && fcVar.f23877p == 2) {
            return "mp4";
        }
        return null;
    }

    public static PhotoViewer p1() {
        PhotoViewer photoViewer;
        PhotoViewer photoViewer2 = f43157f9;
        if (photoViewer2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = f43157f9;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        f43157f9 = photoViewer;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return photoViewer;
        }
        return photoViewer2;
    }

    public static void u(PhotoViewer photoViewer, ArrayList arrayList) {
        boolean z10;
        Integer num;
        org.telegram.ui.Components.f61 f61Var;
        org.telegram.messenger.fj fjVar;
        boolean z11;
        qq0 qq0Var = photoViewer.f43208f0;
        photoViewer.f43198e0.softInputMode = 48;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.f43226h0, photoViewer.f43198e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bn bnVar = photoViewer.f43262l4;
        if (bnVar != null && bnVar.f45923a0 != null && bnVar.getFragmentView() != null) {
            rj rjVar = photoViewer.f43262l4.f45923a0;
            if (rjVar.f32645n3) {
                rjVar.S1();
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.k3(photoViewer.f43262l4.getParentActivity(), photoViewer.f43179c);
            photoViewer.f43262l4.getFragmentView().requestLayout();
            z10 = z11;
        } else {
            z10 = false;
        }
        String str = null;
        if (arrayList.size() == 1 && (f61Var = photoViewer.G2) != null && f61Var.S() > 1500 && (fjVar = photoViewer.T4) != null && org.telegram.messenger.fj.L4(fjVar.f23965k)) {
            num = Integer.valueOf((int) (photoViewer.G2.S() / 1000));
        } else {
            num = null;
        }
        if (arrayList.size() == 1) {
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get(0);
            String K = org.telegram.messenger.v3.K(org.telegram.messenger.mp.u1(photoViewer.U).O0(Long.valueOf(-org.telegram.messenger.fj.B0(fjVar2.f23965k))), false);
            if (!TextUtils.isEmpty(K)) {
                StringBuilder sb2 = new StringBuilder("https://");
                com.google.android.gms.internal.vision.e2.r(sb2, org.telegram.messenger.mp.u1(photoViewer.U).X2, "/", K, "/");
                sb2.append(fjVar2.e1());
                str = sb2.toString();
            }
        }
        fp0 fp0Var = new fp0(photoViewer, photoViewer.E, photoViewer.f43262l4, arrayList, str, num, qq0Var, z10);
        fp0Var.A0(false);
        fp0Var.getWindow().setSoftInputMode(48);
        org.telegram.messenger.g0.h3(new we0(19, photoViewer, fp0Var), 250L);
        fp0Var.show();
    }

    public static void v(PhotoViewer photoViewer) {
        File file;
        org.telegram.messenger.fj fjVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!photoViewer.k0()) {
            return;
        }
        org.telegram.messenger.fj fjVar2 = photoViewer.T4;
        File file2 = null;
        if (fjVar2 != null) {
            if (fjVar2.t() && !photoViewer.T4.U2()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && photoViewer.T4.P3()) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean L4 = org.telegram.messenger.fj.L4(photoViewer.T4.f23965k);
            if (!TextUtils.isEmpty(photoViewer.T4.f23965k.attachPath)) {
                File file3 = new File(photoViewer.T4.f23965k.attachPath);
                if (file3.exists()) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                org.telegram.messenger.w7.G(photoViewer.U);
                file2 = org.telegram.messenger.w7.M(photoViewer.T4.f23965k, false, true);
            }
            fjVar = fjVar2;
            file = file2;
            z11 = z13;
            z12 = z14;
            z10 = L4;
        } else {
            file = null;
            fjVar = null;
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (file != null && file.exists()) {
            photoViewer.i7 = new yq0(photoViewer, photoViewer.P4, new ArrayList(photoViewer.Y6), photoViewer.d);
            gq0 gq0Var = new gq0();
            gq0Var.f48082c = false;
            photoViewer.i3(false, true, gq0Var);
            org.telegram.messenger.g0.h3(new tn0(photoViewer, file, z10, fjVar, z11, z12), gq0Var.f48080a);
            return;
        }
        photoViewer.S2();
    }

    public static String v1() {
        File z10 = org.telegram.messenger.w7.z(4);
        return new File(z10, org.telegram.messenger.bz.p() + "_temp.jpg").getAbsolutePath();
    }

    public static void x(org.telegram.ui.PhotoViewer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.x(org.telegram.ui.PhotoViewer):void");
    }

    public final void A0() {
        if (this.E2) {
            this.P8.a(new fi.e(21));
            org.telegram.messenger.g0.g3(new hn0(this, 12));
            return;
        }
        this.P8.a(new on0(this, 1));
    }

    public final void A2(int r46, boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A2(int, boolean, boolean, boolean):void");
    }

    public final void A3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.A3():void");
    }

    public final void B0() {
        if (this.D1 != null) {
            return;
        }
        org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(this.F, this.f43358w2);
        this.D1 = qd0Var;
        qd0Var.setVisibility(8);
        this.D1.a();
        this.f43208f0.addView(this.D1, this.f43208f0.indexOfChild(this.R7) - 1, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.D1.setDelegate(new so0(this));
    }

    public final void B1() {
        boolean[] zArr = this.f43367x1;
        zArr[1] = false;
        zArr[0] = false;
        this.f43208f0.invalidate();
    }

    public final void B2() {
        if (this.f43279n4 == 0) {
            C2(this.C4, this.P4, null);
            D2(this.P4, this.f43380y4);
            C2(this.D4, this.P4 + 1, this.G1);
            D2(this.P4 + 1, this.A4);
            C2(this.B4, this.P4 - 1, this.F1);
            D2(this.P4 - 1, this.f43389z4);
        }
    }

    public final void B3() {
        String U0;
        String U02;
        int[] iArr = this.f43269m3;
        Arrays.fill(iArr, 0);
        int[] iArr2 = this.f43278n3;
        Arrays.fill(iArr2, 0);
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null) {
            long max = Math.max(0L, f61Var.S());
            long max2 = Math.max(0L, this.G2.U());
            if (!this.B8 && this.R7.getVisibility() == 0) {
                max2 = (this.S7.getRightProgress() - this.S7.getLeftProgress()) * ((float) max2);
                max = ((float) max) - (this.S7.getLeftProgress() * ((float) max2));
                if (max > max2) {
                    max = max2;
                }
            }
            long j3 = max / 1000;
            long j10 = max2 / 1000;
            iArr[0] = (int) (j3 / 60);
            iArr[1] = (int) (j3 % 60);
            iArr2[0] = (int) (j10 / 60);
            iArr2[1] = (int) (j10 % 60);
        } else {
            dq0 dq0Var = this.f43217g0;
            if (dq0Var != null && dq0Var.f36753y) {
                long max3 = Math.max(0, dq0Var.getCurrentPosition());
                long max4 = Math.max(0, this.f43217g0.getVideoDuration());
                if (!this.B8 && this.R7.getVisibility() == 0) {
                    max4 = (this.S7.getRightProgress() - this.S7.getLeftProgress()) * ((float) max4);
                    max3 = ((float) max3) - (this.S7.getLeftProgress() * ((float) max4));
                    if (max3 > max4) {
                        max3 = max4;
                    }
                }
                long j11 = max3 / 1000;
                long j12 = max4 / 1000;
                iArr[0] = (int) (j11 / 60);
                iArr[1] = (int) (j11 % 60);
                iArr2[0] = (int) (j12 / 60);
                iArr2[1] = (int) (j12 % 60);
            }
        }
        int i7 = iArr[0];
        if (i7 >= 60) {
            U0 = V0(i7 / 60, i7 % 60, iArr[1]);
        } else {
            U0 = U0(i7, iArr[1]);
        }
        int i10 = iArr2[0];
        if (i10 >= 60) {
            U02 = V0(i10 / 60, i10 % 60, iArr2[1]);
        } else {
            U02 = U0(i10, iArr2[1]);
        }
        this.f43287o3.l(U0 + " / " + U02, false);
        if (!Objects.equals(this.j3, U02)) {
            this.j3 = U02;
            this.f43237i3.requestLayout();
        }
    }

    public final void C1() {
        org.telegram.ui.Components.qd0 qd0Var = this.D1;
        if (qd0Var != null) {
            qd0Var.b(null, 0, false, false, null, null, null);
            if (this.d2 != 1) {
                return;
            }
            CropAreaView cropAreaView = this.D1.f38763b.f21893a;
            cropAreaView.f(true, false);
            cropAreaView.setDimVisibility(true);
            cropAreaView.invalidate();
            this.D1.setVisibility(0);
            this.D1.setAlpha(1.0f);
            og.o oVar = this.D1.f38763b;
            oVar.q();
            CropAreaView cropAreaView2 = oVar.f21893a;
            cropAreaView2.setDimVisibility(true);
            cropAreaView2.f(true, true);
            cropAreaView2.invalidate();
            this.f43339u2 = true;
        }
    }

    public final void C2(org.telegram.messenger.ImageReceiver r23, int r24, og.g r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.C2(org.telegram.messenger.ImageReceiver, int, og.g):void");
    }

    public final void C3() {
        int v;
        if (this.Z7 > 0) {
            if (this.Y7 >= this.Z7) {
                this.Y7 = this.Z7 - 1;
            }
            if (this.d2 == 1) {
                float max = Math.max(800.0f / this.f43188c8, 800.0f / this.f43196d8);
                this.f43206e8 = Math.round((this.f43188c8 * max) / 2.0f) * 2;
                this.f43216f8 = Math.round((this.f43196d8 * max) / 2.0f) * 2;
            } else {
                Size i02 = i0();
                this.f43206e8 = i02.getWidth();
                this.f43216f8 = i02.getHeight();
            }
            if (this.f43225g8 != 0) {
                if (this.d2 == 1) {
                    this.f43225g8 = 1560000;
                    v = this.f43225g8;
                } else if (this.f43206e8 == this.f43188c8 && this.f43216f8 == this.f43196d8) {
                    this.f43225g8 = this.f43233h8;
                    v = MediaController.v(this.f43206e8, this.f43216f8, this.f43225g8, false);
                } else {
                    this.f43225g8 = MediaController.Q(this.f43196d8, this.f43188c8, this.f43233h8, this.f43216f8, this.f43206e8);
                    v = MediaController.v(this.f43206e8, this.f43216f8, this.f43225g8, false);
                }
                this.f43319r8 = ((v / 8) * this.f43241i8) / 1000.0f;
            }
        }
    }

    public final void D0() {
        org.telegram.messenger.we weVar;
        int width;
        int width2;
        if (this.O1 != null) {
            return;
        }
        if (this.d2 == 1) {
            weVar = new org.telegram.messenger.we();
            weVar.f27681k = this.E1.f21856i;
        } else {
            weVar = this.X4.f50266c;
        }
        org.telegram.messenger.we weVar2 = weVar;
        int q10 = this.C4.q();
        int o4 = this.C4.o();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(q10, o4, config);
        tg.e2 e2Var = this.f43297p5;
        if (e2Var != null && e2Var.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.f43297p5.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.f43297p5.K);
            float width3 = createBitmap.getWidth();
            if ((this.f43297p5.K / 90) % 2 != 0) {
                width2 = sourceBitmap.getHeight();
            } else {
                width2 = sourceBitmap.getWidth();
            }
            float f10 = width3 / width2;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * f10, ((-sourceBitmap.getHeight()) / 2.0f) * f10, (sourceBitmap.getWidth() / 2.0f) * f10, (sourceBitmap.getHeight() / 2.0f) * f10);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.C4.q(), this.C4.o(), config);
        if (this.C4.n() != null) {
            Bitmap n10 = this.C4.n();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.C4.V);
            float width4 = createBitmap2.getWidth();
            if ((this.C4.V / 90) % 2 != 0) {
                width = n10.getHeight();
            } else {
                width = n10.getWidth();
            }
            float f11 = width4 / width;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(((-n10.getWidth()) / 2.0f) * f11, ((-n10.getHeight()) / 2.0f) * f11, (n10.getWidth() / 2.0f) * f11, (n10.getHeight() / 2.0f) * f11);
            canvas2.drawBitmap(n10, (Rect) null, rectF2, new Paint(3));
        }
        up0 up0Var = new up0(this, this.E, this.U, createBitmap2, createBitmap, this.C4.V, weVar2);
        this.O1 = up0Var;
        up0Var.f58067s.setOnClickListener(new in0(this, 5));
        this.O1.f58068w.setOnClickListener(new in0(this, 6));
        this.O1.setEraser(this.N1);
        int indexOfChild = this.f43208f0.indexOfChild(this.f43342u5) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.f43208f0.getChildCount();
        }
        this.f43208f0.addView(this.O1, indexOfChild, c8.ma.c(-1.0f, -1));
        this.P1 = false;
    }

    public final void D1() {
        tg.e2 e2Var = this.f43297p5;
        if (e2Var == null || !e2Var.W) {
            xe.b bVar = this.f43160a0;
            if (bVar != null) {
                Iterator it = bVar.iterator();
                while (it.hasNext()) {
                    fh.e eVar = ((fh.g) it.next()).f11667g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            xe.b bVar2 = this.f43170b0;
            if (bVar2 != null) {
                Iterator it2 = bVar2.iterator();
                while (it2.hasNext()) {
                    ((View) it2.next()).invalidate();
                }
            }
            ap0 ap0Var = this.V1;
            if (ap0Var != null) {
                ap0Var.m();
            }
            bp0 bp0Var = this.W1;
            if (bp0Var != null) {
                bp0Var.m();
            }
            iq0 iq0Var = this.f43334t5;
            if (iq0Var != null) {
                iq0Var.invalidate();
            }
            iq0 iq0Var2 = this.f43351v5;
            if (iq0Var2 != null) {
                iq0Var2.invalidate();
            }
            iq0 iq0Var3 = this.f43361w5;
            if (iq0Var3 != null) {
                iq0Var3.invalidate();
            }
            iq0 iq0Var4 = this.f43371x5;
            if (iq0Var4 != null) {
                iq0Var4.invalidate();
            }
            iq0 iq0Var5 = this.f43381y5;
            if (iq0Var5 != null) {
                iq0Var5.invalidate();
            }
            xo0 xo0Var = this.S7;
            if (xo0Var != null && xo0Var.f38291f0) {
                xo0Var.invalidate();
            }
            qq0 qq0Var = this.f43208f0;
            if (qq0Var != null) {
                qq0Var.invalidate();
            }
        }
    }

    public final void D2(int i7, org.telegram.ui.Components.dc0 dc0Var) {
        ArrayList arrayList;
        String str;
        boolean z10;
        boolean z11;
        if (dc0Var != null) {
            dc0Var.a();
            dc0Var.setVisibility(8);
            ArrayList arrayList2 = this.f43224g7;
            if (!arrayList2.isEmpty() && i7 >= 0 && i7 < arrayList2.size()) {
                Object obj = arrayList2.get(i7);
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    z10 = efVar.f27847b;
                    str = efVar.f27853j;
                    arrayList = efVar.f27859p;
                } else {
                    if (obj instanceof org.telegram.messenger.hf) {
                        org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                        str = hfVar.f27853j;
                        arrayList = hfVar.f27859p;
                    } else {
                        arrayList = null;
                        str = null;
                    }
                    z10 = false;
                }
                dc0Var.setVisibility(0);
                if (this.d2 != 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dc0Var.b(arrayList, z10, false, z11);
                if (str != null) {
                    dc0Var.f34373a = BitmapFactory.decodeFile(str);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(dc0Var.f34373a);
                    dc0Var.d = bitmapDrawable;
                    dc0Var.setBackground(bitmapDrawable);
                    return;
                }
                dc0Var.f34373a = null;
                dc0Var.d = null;
                dc0Var.setBackground(null);
            }
        }
    }

    public final boolean D3() {
        org.telegram.ui.Components.s30 s30Var = this.f43294p2;
        if (s30Var != null && s30Var.d && !s30Var.f39471e) {
            return true;
        }
        return false;
    }

    public final void E0() {
        int q10;
        int o4;
        org.telegram.messenger.we weVar;
        Bitmap n10;
        if (this.M1 == null) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) textureView;
                q10 = v51Var.getVideoWidth();
                o4 = v51Var.getVideoHeight();
                while (true) {
                    if (q10 <= 1280 && o4 <= 1280) {
                        break;
                    }
                    q10 /= 2;
                    o4 /= 2;
                }
            } else {
                q10 = this.C4.q();
                o4 = this.C4.o();
            }
            Bitmap bitmap = this.f43380y4.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(q10, o4, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            int i7 = this.d2;
            nq0 nq0Var = this.X4;
            boolean z10 = true;
            if (i7 == 1) {
                weVar = new org.telegram.messenger.we();
                weVar.f27681k = this.E1.f21856i;
            } else {
                weVar = nq0Var.f50266c;
            }
            org.telegram.messenger.we weVar2 = weVar;
            hi.p3 p3Var = new hi.p3(this.f43226h0, false, new on0(this, 3));
            p3Var.f15219f = true;
            p3Var.f15220g = true;
            this.L1 = p3Var;
            if (this.f43341u4 == 3) {
                z10 = false;
            }
            p3Var.b(z10);
            Activity activity = this.E;
            int i10 = this.U;
            if (this.f43322s1) {
                n10 = null;
            } else {
                n10 = this.C4.n();
            }
            vp0 vp0Var = new vp0(this, activity, activity, i10, bitmap2, n10, this.C4.V, nq0Var.f50267e, weVar2, new hn0(this, 15), this.f43358w2);
            this.M1 = vp0Var;
            fh.g c10 = this.Z.c(vp0Var.M0, null, false);
            c10.p(c8.i0.j(this.f43358w2));
            vp0Var.setBlurredBackgroundDrawableForTools(c10);
            this.f43208f0.addView(this.M1.getView(), c8.ma.c(-1.0f, -1));
            this.M1.setOnDoneButtonClickedListener(new hn0(this, 16));
            this.M1.getCancelView().setOnClickListener(new in0(this, 8));
            this.M1.t0(org.telegram.messenger.g0.L(126.0f));
            this.M1.setOffsetTranslationX(-org.telegram.messenger.g0.L(12.0f));
        }
    }

    public final boolean E1() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.F.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return false;
        }
    }

    public final void E2(int r49, boolean r50, boolean r51, boolean r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.E2(int, boolean, boolean, boolean):void");
    }

    public final void F0() {
        cr0 cr0Var = new cr0(this.f43208f0.getContext(), this);
        this.f43237i3 = cr0Var;
        this.f43208f0.addView(cr0Var, c8.ma.e(-1, 48, 83));
        so0 so0Var = new so0(this);
        jp0 jp0Var = new jp0(this, so0Var);
        uv uvVar = new uv(6, this.f43208f0.getContext(), this);
        this.f43314r3 = uvVar;
        uvVar.setAccessibilityDelegate(jp0Var);
        this.f43314r3.setImportantForAccessibility(1);
        this.f43237i3.addView(this.f43314r3, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(this.f43314r3);
        this.f43304q3 = h61Var;
        h61Var.f35782z = org.telegram.messenger.g0.L(2.0f);
        org.telegram.ui.Components.h61 h61Var2 = this.f43304q3;
        h61Var2.f35768k = 872415231;
        h61Var2.f35769l = 872415231;
        h61Var2.f35770m = -1;
        h61Var2.f35771n = -1;
        h61Var2.A = 1509949439;
        h61Var2.f35767j = so0Var;
        kp0 kp0Var = new kp0(this, this.f43208f0.getContext(), new qn0(this));
        this.f43324s3 = kp0Var;
        kp0Var.setAlpha(0.0f);
        this.f43208f0.addView(this.f43324s3, c8.ma.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(this.f43208f0.getContext());
        this.f43287o3 = n5Var;
        n5Var.setTextColor(-1);
        this.f43287o3.setGravity(53);
        this.f43287o3.setTextSize(14);
        this.f43287o3.setImportantForAccessibility(2);
        this.f43237i3.addView(this.f43287o3, c8.ma.d(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.f43208f0.getContext());
        this.f43295p3 = imageView;
        imageView.setImageResource(2131232254);
        this.f43295p3.setContentDescription(org.telegram.messenger.gd.M0(2131754724, "AccExitFullscreen"));
        this.f43295p3.setScaleType(ImageView.ScaleType.CENTER);
        this.f43295p3.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        this.f43295p3.setVisibility(4);
        this.f43237i3.addView(this.f43295p3, c8.ma.e(48, 48, 53));
        this.f43295p3.setOnClickListener(new vn0(this, 6));
    }

    public final boolean F1() {
        org.telegram.ui.Components.yc b12 = b1();
        if (b12 != null) {
            if (b12.M.c() || b12.f15048f.f41789e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void F2(float f10, View view, boolean z10, boolean z11) {
        float f11;
        HashMap hashMap = this.L0;
        Boolean bool = (Boolean) hashMap.get(view);
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        hashMap.put(view, Boolean.valueOf(z10));
        view.animate().cancel();
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float f12 = f11 * f10;
        int i7 = 0;
        if (z11 && bool != null) {
            if (z10) {
                view.setVisibility(0);
            }
            view.animate().alpha(f12).setDuration(100L).setUpdateListener(new gn0(this, 5)).setInterpolator(new LinearInterpolator()).withEndAction(new b80(this, z10, view, 5)).start();
            return;
        }
        if (!z10) {
            i7 = 8;
        }
        view.setVisibility(i7);
        view.setAlpha(f12);
        q3();
    }

    public final void G0(org.telegram.messenger.ff ffVar) {
        org.telegram.ui.Components.ha haVar;
        if (this.C2 == null) {
            org.telegram.ui.Components.se0 se0Var = new org.telegram.ui.Components.se0(2, this.E, this);
            this.f43387z2 = se0Var;
            se0Var.setWillNotDraw(false);
            this.f43387z2.setVisibility(4);
            this.f43208f0.addView(this.f43387z2, 0, c8.ma.e(-1, -1, 17));
            this.E2 = false;
            if (this.f43224g7.isEmpty()) {
                if (this.f43169b && this.T2 == null) {
                    this.D2 = new SurfaceView(this.E);
                    this.E2 = true;
                } else {
                    this.C2 = new TextureView(this.E);
                }
            } else {
                org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(this.E, this.G2);
                this.f43180c0.e();
                org.telegram.ui.Components.ca caVar = this.f43180c0;
                v51Var.f40507s = caVar;
                org.telegram.ui.Components.cz czVar = v51Var.f40501b;
                if (czVar != null && (haVar = czVar.J) != null) {
                    org.telegram.ui.Components.ca caVar2 = haVar.f35843t;
                    if (caVar2 != null && caVar2.f33951m != null) {
                        caVar2.f33951m = null;
                    }
                    haVar.f35843t = caVar;
                    if (caVar != null && caVar.f33951m != haVar) {
                        caVar.f33951m = haVar;
                        caVar.d();
                    }
                }
                if (ffVar != null) {
                    v51Var.setDelegate(new jn0(ffVar, 0));
                }
                this.C2 = v51Var;
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
                this.f43387z2.addView(this.C2, c8.ma.e(-1, -1, 17));
            } else {
                this.f43387z2.addView(this.D2, c8.ma.e(-1, -1, 17));
            }
            pq0 pq0Var = new pq0(this.E, this);
            this.F2 = pq0Var;
            pq0Var.setPivotX(0.0f);
            this.F2.setPivotY(0.0f);
            this.F2.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f43387z2.addView(this.F2, c8.ma.e(-1, -1, 17));
            View view = new View(this.E);
            this.Y8 = view;
            this.f43387z2.addView(view, c8.ma.c(-1.0f, -1));
            if (this.d2 == 1) {
                View view2 = new View(this.E);
                this.A2 = view2;
                view2.setBackgroundColor(-1);
                this.A2.setAlpha(0.0f);
                this.f43387z2.addView(this.A2, c8.ma.e(-1, -1, 17));
            }
        }
    }

    public final boolean G1() {
        int i7;
        if (this.h7 != null && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43215f7;
            if (i7 < arrayList.size()) {
                TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(this.P4);
                org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) this.f43167a7.get(this.P4);
                if (photo instanceof TLRPC.TL_photoEmpty) {
                    photo = null;
                }
                if (photo != null) {
                    int size = photo.sizes.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                        if (fileLocation != null) {
                            int i11 = fileLocation.local_id;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.h7.f23868f;
                            if (i11 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                return true;
                            }
                        }
                    }
                } else if (fcVar != null) {
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = fcVar.f23868f;
                    int i12 = tL_fileLocationToBeDeprecated2.local_id;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.h7.f23868f;
                    if (i12 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void G2(View view, boolean z10, boolean z11) {
        F2(1.0f, view, z10, z11);
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        int i11;
        if (i7 == 0) {
            float f12 = 1.0f - f10;
            this.U0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f12);
            this.U0.setAlpha(f10);
            org.telegram.ui.Components.fe0 fe0Var = this.U0;
            int i12 = 8;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fe0Var.setVisibility(i10);
            if (this.f43219g2) {
                di.n4 n4Var = this.Q0;
                int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i13 < 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                n4Var.setVisibility(i11);
                this.Q0.setAlpha(f12);
                this.Q0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
                oi.u1 u1Var = this.T0;
                if (i13 < 0) {
                    i12 = 0;
                }
                u1Var.setVisibility(i12);
                this.T0.setAlpha(f12);
                this.T0.setTranslationY(org.telegram.messenger.g0.L(36.0f) * f10);
            }
        }
    }

    public final boolean H0() {
        boolean z10 = false;
        if (this.f43298p6 != null || this.D1 == null) {
            return false;
        }
        this.f43223g6 = 1.0f;
        this.f43281n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43298p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38716g, 0.0f, 1.0f));
        this.f43298p6.setDuration(250L);
        this.f43298p6.setInterpolator(org.telegram.ui.Components.lr.f37208f);
        this.f43298p6.addListener(new hp0(this, 0));
        this.f43298p6.start();
        og.m mVar = this.D1.f38763b.M;
        if (mVar != null) {
            z10 = mVar.f21890j;
        }
        return !z10;
    }

    public final boolean H1(rq0 rq0Var) {
        if (rq0Var != null) {
            Object g10 = rq0Var.g();
            if (g10 instanceof org.telegram.messenger.fj) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) g10;
                if (fjVar.f23965k != null) {
                    if (org.telegram.messenger.mp.u1(this.U).G2(org.telegram.messenger.fj.B0(fjVar.f23965k)) || fjVar.f23965k.noforwards || fjVar.y2()) {
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

    public final void H2(boolean z10, boolean z11) {
        if (this.f43321s0.getVisibility() != 0) {
            this.f43366x0.f53876f.t("", z10, true);
        } else if (Math.abs(this.f43338u1 - 1.0f) < 0.001f) {
            this.f43366x0.f53876f.t("", z10, true);
        } else {
            org.telegram.ui.Components.m6 m6Var = this.f43366x0.f53876f;
            m6Var.t(org.telegram.ui.Components.mu0.a(this.f43338u1) + "x", z10, true);
        }
        this.f43321s0.e(z10, this.f43338u1);
        d61 d61Var = this.J0;
        float f10 = this.f43338u1;
        org.telegram.ui.ActionBar.z0[] z0VarArr = (org.telegram.ui.ActionBar.z0[]) d61Var.f46829b;
        for (int i7 = 0; i7 < z0VarArr.length; i7++) {
            if (z11 && ((i7 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i7 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i7 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i7 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i7 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                z0VarArr[i7].d(-9718023, -9718023);
            } else {
                z0VarArr[i7].d(-328966, -328966);
            }
        }
    }

    public final boolean I0(float f10, boolean z10, Runnable runnable) {
        org.telegram.ui.Components.qd0 qd0Var;
        float f11;
        if (this.f43298p6 == null && (qd0Var = this.D1) != null) {
            qd0Var.f38763b.i();
            this.f43176b6 = 0.0f;
            this.f43214f6 = 0.0f + f10;
            if (z10) {
                this.f43223g6 = 1.0f;
            }
            this.f43281n6 = System.currentTimeMillis();
            this.f43298p6 = new AnimatorSet();
            if (this.d2 == 1) {
                this.f43204e6 = 1.0f;
                this.f43166a6 = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.C4;
                if (imageReceiver != null) {
                    int q10 = imageReceiver.q();
                    int o4 = this.C4.o();
                    if (Math.abs((((int) this.D1.f38763b.getStateOrientation()) / 90) % 2) == 1) {
                        o4 = q10;
                        q10 = o4;
                    }
                    org.telegram.messenger.we weVar = this.X4.f50266c;
                    if (weVar != null) {
                        q10 = (int) (q10 * weVar.f27677e);
                        o4 = (int) (o4 * weVar.f27678f);
                    }
                    float f12 = q10;
                    float f13 = o4;
                    float min = Math.min(g1(1) / f12, d1(1, false) / f13);
                    if (Math.abs((f10 / 90.0f) % 2.0f) == 1.0f) {
                        f11 = Math.min(g1(1) / f13, d1(1, false) / f12);
                    } else {
                        f11 = min;
                    }
                    this.f43204e6 = f11 / min;
                }
            }
            if (this.d2 == 11) {
                this.f43166a6 = p2(false) * this.f43166a6;
                this.f43204e6 = p2(false) * this.f43204e6;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new hi.j9(this, f10, this.D1.f38764c.getRotation(), 3));
            this.f43298p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38716g, 0.0f, 1.0f), ofFloat);
            this.f43298p6.setDuration(250L);
            this.f43298p6.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            this.f43298p6.addListener(new di.j6(this, f10, runnable, 5));
            this.f43298p6.start();
            if (Math.abs(this.D1.f38763b.getStateOrientation() + f10) > 0.01f) {
                return true;
            }
        }
        return false;
    }

    public final void I2(Activity activity, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        bg.v0 v0Var;
        Activity parentActivity;
        boolean z10;
        int i7;
        qq0 qq0Var;
        boolean z11;
        float f10;
        float f11;
        bg.v0 v0Var2 = this.f43273m7;
        if (v0Var2 != null) {
            v0Var2.a();
            this.f43273m7 = null;
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            v0Var = new bg.v0(launchActivity, true);
        } else {
            v0Var = null;
        }
        this.f43273m7 = v0Var;
        if (activity != null) {
            parentActivity = activity;
        } else {
            parentActivity = h2Var.getParentActivity();
        }
        org.telegram.ui.ActionBar.n6.K(parentActivity, false);
        this.f43358w2 = i6Var;
        this.f43270m4 = h2Var;
        int i10 = org.telegram.messenger.j10.f24770t0;
        this.U = i10;
        this.C4.d = i10;
        this.B4.d = i10;
        this.D4.d = i10;
        ap0 ap0Var = this.V1;
        if (ap0Var != null) {
            ap0Var.setAccount(i10);
            this.V1.f15048f.k(false);
        }
        bp0 bp0Var = this.W1;
        if (bp0Var != null) {
            bp0Var.setAccount(this.U);
            this.W1.f15048f.k(false);
        }
        tg.e2 e2Var = this.f43297p5;
        if (e2Var != null) {
            e2Var.setCurrentAccount(this.U);
        }
        if (this.E != parentActivity && parentActivity != null) {
            this.f43320s = parentActivity instanceof BubbleActivity;
            this.E = parentActivity;
            this.F = new ContextThemeWrapper(this.E, 2131755318);
            this.f43386z1 = ViewConfiguration.get(this.E).getScaledTouchSlop();
            if (Z8 == null) {
                Z8 = new Drawable[]{f0.d.d(this.E, 2131231006), f0.d.d(this.E, 2131230931), f0.d.d(this.E, 2131231636)};
            }
            this.V6 = new Scroller(parentActivity);
            vq0 vq0Var = new vq0(this, parentActivity);
            this.f43226h0 = vq0Var;
            vq0Var.setBackground(this.M0);
            this.f43226h0.setFocusable(false);
            ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
            this.f43234i0 = clippingImageView;
            clippingImageView.O = this.f43254k4;
            clippingImageView.L = false;
            clippingImageView.N = false;
            this.f43226h0.addView(clippingImageView, c8.ma.c(40.0f, 40));
            qq0 qq0Var2 = new qq0(this, parentActivity, parentActivity);
            this.f43208f0 = qq0Var2;
            qq0Var2.setFocusable(false);
            VideoFramesRewinder videoFramesRewinder = this.f43174b4;
            if (videoFramesRewinder != null) {
                videoFramesRewinder.setParentView(this.f43208f0);
            }
            this.f43208f0.setClipChildren(true);
            this.f43208f0.setClipToPadding(true);
            this.f43226h0.setClipChildren(false);
            this.f43226h0.setClipToPadding(false);
            org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(this.f43208f0);
            this.f43180c0 = caVar;
            caVar.f33941a = 1;
            this.Y = new ho0(this);
            this.f43170b0 = new xe.b();
            this.f43160a0 = new xe.b();
            dh.c cVar = new dh.c(this.Y);
            this.Z = cVar;
            cVar.g(new jh.k(this.f43208f0), this.f43208f0);
            this.Z.f(this.f43170b0);
            this.f43189d0 = new org.telegram.ui.Components.ga(this.f43180c0, this.f43208f0);
            this.f43226h0.addView(this.f43208f0, c8.ma.e(-1, -1, 51));
            r0.i0.l(this.f43208f0, new qn0(this));
            this.f43208f0.setSystemUiVisibility(1792);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f43198e0 = layoutParams;
            layoutParams.height = -1;
            layoutParams.format = -3;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            layoutParams.type = 99;
            org.telegram.messenger.g0.m(layoutParams);
            this.f43198e0.flags = -2147286784;
            org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0(this.E);
            this.f43380y4 = dc0Var;
            this.f43208f0.addView(dc0Var, c8.ma.c(-2.0f, -2));
            org.telegram.ui.Components.dc0 dc0Var2 = new org.telegram.ui.Components.dc0(this.E);
            this.f43389z4 = dc0Var2;
            this.f43208f0.addView(dc0Var2, c8.ma.c(-2.0f, -2));
            org.telegram.ui.Components.dc0 dc0Var3 = new org.telegram.ui.Components.dc0(this.E);
            this.A4 = dc0Var3;
            this.f43208f0.addView(dc0Var3, c8.ma.c(-2.0f, -2));
            org.telegram.ui.Components.v7 v7Var = new org.telegram.ui.Components.v7(4, parentActivity, this);
            this.G = v7Var;
            v7Var.setOverlayTitleAnimation(true);
            this.G.setTitleColor(-1);
            this.G.setSubtitleColor(-1);
            this.G.setBackgroundColor(2130706432);
            this.G.setOccupyStatusBar(!this.f43320s);
            this.G.G(1090519039, false);
            this.G.I(-1, false);
            this.G.setBackButtonImage(2131231240);
            ImageView backButton = this.G.getBackButton();
            this.H = backButton;
            this.I = backButton.getBackground();
            this.J = null;
            tq0 tq0Var = new tq0(parentActivity);
            this.N = tq0Var;
            this.G.addView(tq0Var, c8.ma.e(-1, -1, 119));
            this.f43208f0.addView(this.G, c8.ma.c(-2.0f, -1));
            sq0 sq0Var = new sq0(parentActivity);
            this.O = sq0Var;
            this.f43208f0.addView(sq0Var, c8.ma.e(-1, -2, 55));
            this.G.setActionBarMenuOnItemClick(new ro0(this, i6Var));
            org.telegram.ui.ActionBar.z t6 = this.G.t();
            this.B0 = t6;
            t6.setOnLayoutListener(new hn0(this, 20));
            org.telegram.ui.ActionBar.r0 a10 = this.B0.a(26, 2131231786);
            this.F0 = a10;
            a10.setContentDescription(org.telegram.messenger.gd.L0(2131751587));
            c8.ra.a(this.F0);
            G2(this.F0, false, false);
            org.telegram.ui.ActionBar.r0 a11 = this.B0.a(11, 2131232219);
            this.E0 = a11;
            a11.setContentDescription(org.telegram.messenger.gd.L0(2131748487));
            org.telegram.ui.ActionBar.r0 a12 = this.B0.a(18, 2131232182);
            this.D0 = a12;
            a12.setContentDescription(org.telegram.messenger.gd.L0(2131754810));
            org.telegram.ui.ActionBar.r0 a13 = this.B0.a(4, 2131232183);
            this.C0 = a13;
            a13.setContentDescription(org.telegram.messenger.gd.L0(2131750571));
            org.telegram.ui.ActionBar.z zVar = this.B0;
            xq xqVar = new xq(2131232799, this.F, new fi.b());
            this.f43366x0 = xqVar;
            org.telegram.ui.ActionBar.r0 d = zVar.d(1, xqVar);
            this.f43301q0 = d;
            this.f43366x0.setCallback(d.getIconView());
            this.f43301q0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f43301q0.getPopupLayout().f28735c = true;
            this.f43301q0.getPopupLayout().setFitItems(true);
            this.f43301q0.setMenuXOffset(org.telegram.messenger.g0.L(3.0f));
            org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(this.F, i6Var);
            this.f43321s0 = v0Var3;
            v0Var3.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
            this.f43321s0.setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
            this.f43321s0.setDrawShadow(false);
            this.f43321s0.setBackgroundColor(-14540254);
            this.f43321s0.setTextColor(-1);
            this.f43321s0.setLabel(org.telegram.messenger.gd.L0(2131743350));
            this.f43321s0.setOnValueChange(new pn0(this, 1));
            this.f43301q0.getPopupLayout().a(this.f43321s0, c8.ma.o(-1, 44));
            org.telegram.ui.ActionBar.e1 a14 = this.f43301q0.a(-1);
            this.A0 = a14;
            a14.setColor(-15198184);
            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = this.f43301q0.getPopupLayout();
            d61 d61Var = new d61(this.F, new qn0(this));
            this.J0 = d61Var;
            popupLayout.addView(d61Var);
            LinearLayout linearLayout = new LinearLayout(this.F);
            this.f43376y0 = linearLayout;
            linearLayout.setOrientation(1);
            this.f43301q0.getPopupLayout().addView(this.f43376y0);
            org.telegram.ui.ActionBar.z0 e10 = this.f43301q0.e(22, 2131231914, org.telegram.messenger.gd.L0(2131743351));
            this.f43329t0 = e10;
            e10.setSelectorColor(268435455);
            org.telegram.ui.Components.q7 q7Var = new org.telegram.ui.Components.q7(this, this.F, 1);
            this.H0 = q7Var;
            try {
                q7Var.setRouteSelector(g6.a.c(this.F).a());
                z10 = true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.f(e11);
                z10 = false;
            }
            this.H0.setVisibility(4);
            if (z10) {
                org.telegram.ui.ActionBar.z0 e12 = this.f43301q0.e(24, 2131231913, org.telegram.messenger.gd.L0(2131743352));
                this.G0 = e12;
                e12.f(false);
                this.G0.setSelectorColor(268435455);
                this.G0.addView(this.H0, 0, c8.ma.c(-1.0f, -1));
            }
            this.f43301q0.I(-115203550);
            this.f43301q0.setOnMenuDismiss(new on0(this, 9));
            org.telegram.ui.ActionBar.r0 a15 = this.B0.a(0, 2131231750);
            this.f43292p0 = a15;
            a15.setContentDescription(org.telegram.messenger.gd.L0(2131754839));
            this.f43292p0.setOnClickListener(new vn0(this, 3));
            this.f43292p0.setOnMenuDismiss(new on0(this, 10));
            this.f43292p0.getPopupLayout().setSwipeBackForegroundColor(-14540254);
            this.f43292p0.getPopupLayout().f28735c = true;
            this.f43292p0.getPopupLayout().setFitItems(true);
            this.K0 = new vq(this.F, this.f43292p0.getPopupLayout().getSwipeBack(), new qn0(this));
            org.telegram.ui.ActionBar.z0 i11 = this.f43292p0.i(2131232169, null, org.telegram.messenger.gd.L0(2131745734), this.K0.f52828a);
            i11.d(-328966, -328966);
            this.f43337u0 = i11;
            i11.setOnClickListener(new vn0(this, 4));
            org.telegram.ui.ActionBar.e1 a16 = this.f43292p0.a(-1);
            this.f43346v0 = a16;
            a16.setColor(-15198184);
            this.f43292p0.e(10, 2131232267, org.telegram.messenger.gd.L0(2131747603)).d(-328966, -328966);
            org.telegram.ui.ActionBar.z0 e13 = this.f43292p0.e(6, 2131231915, org.telegram.messenger.gd.L0(2131747029));
            e13.d(-328966, -328966);
            this.f43356w0 = e13;
            org.telegram.ui.ActionBar.z0 e14 = this.f43292p0.e(3, 2131232221, org.telegram.messenger.gd.L0(2131745152));
            this.f43311r0 = e14;
            e14.d(-328966, -328966);
            this.f43292p0.e(12, 2131232172, org.telegram.messenger.gd.L0(2131745735)).d(-328966, -328966);
            this.f43292p0.e(5, 2131232226, org.telegram.messenger.gd.L0(2131745147)).d(-328966, -328966);
            this.f43292p0.e(25, 2131232384, org.telegram.messenger.gd.L0(2131751693)).d(-328966, -328966);
            this.f43292p0.e(21, 2131231877, org.telegram.messenger.gd.L0(2131746068)).d(-328966, -328966);
            this.f43292p0.e(23, 2131232335, org.telegram.messenger.gd.L0(2131746017)).d(-328966, -328966);
            this.f43292p0.e(9, 2131232367, org.telegram.messenger.gd.L0(2131745264)).d(-328966, -328966);
            this.f43292p0.e(13, 2131232384, org.telegram.messenger.gd.L0(2131745133)).d(-328966, -328966);
            this.f43292p0.e(14, 2131232268, org.telegram.messenger.gd.L0(2131745347)).d(-328966, -328966);
            this.f43292p0.e(19, 2131232410, org.telegram.messenger.gd.L0(2131743719)).d(-328966, -328966);
            this.f43292p0.e(20, 2131232410, org.telegram.messenger.gd.L0(2131749112)).d(-328966, -328966);
            this.f43292p0.e(7, 2131232110, org.telegram.messenger.gd.L0(2131751587)).d(-328966, -328966);
            this.f43292p0.e(8, 2131232089, org.telegram.messenger.gd.L0(2131744604)).d(-328966, -328966);
            this.f43292p0.I(-115203550);
            this.f43292p0.u(19);
            this.f43292p0.u(20);
            H2(false, true);
            this.f43292p0.setPopupItemsSelectorColor(268435455);
            this.f43292p0.setSubMenuDelegate(new so0(this));
            ih0 ih0Var = new ih0(this.F, 1);
            this.f43242j0 = ih0Var;
            ih0Var.setBackgroundColor(2130706432);
            this.f43208f0.addView(this.f43242j0, c8.ma.e(-1, 48, 83));
            View view = new View(this.F);
            this.f43250k0 = view;
            if (this.d2 == 11) {
                i7 = -16777216;
            } else {
                i7 = 2130706432;
            }
            view.setBackgroundColor(i7);
            this.f43226h0.addView(this.f43250k0, c8.ma.a(-1.0f, this.f43259l0 / org.telegram.messenger.g0.f24117p, 87));
            this.f43357w1[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
            this.f43357w1[0].setShape(0);
            this.f43357w1[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.f43357w1[1].setShape(0);
            org.telegram.ui.Components.w20 w20Var = new org.telegram.ui.Components.w20(this.F, org.telegram.messenger.g0.L(10.0f));
            this.f43267m1 = w20Var;
            this.f43208f0.addView(w20Var, c8.ma.e(-1, 68, 83));
            this.f43267m1.setDelegate(new uo0(this));
            for (int i12 = 0; i12 < 3; i12++) {
                this.f43379y3[i12] = new ImageView(this.E);
                this.f43379y3[i12].setImageResource(2131232220);
                this.f43379y3[i12].setContentDescription(org.telegram.messenger.gd.M0(2131754718, "AccSwitchToFullscreen"));
                this.f43379y3[i12].setScaleType(ImageView.ScaleType.CENTER);
                this.f43379y3[i12].setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
                this.f43379y3[i12].setVisibility(4);
                this.f43379y3[i12].setAlpha(1.0f);
                this.f43208f0.addView(this.f43379y3[i12], c8.ma.c(48.0f, 48));
                this.f43379y3[i12].setOnClickListener(new vn0(this, 5));
            }
            this.R = new vo0(new fi.b());
            mq0 mq0Var = new mq0(this.f43208f0.getContext());
            this.R1 = mq0Var;
            mq0Var.setFactory(new ae0(this, 2));
            this.R1.setVisibility(4);
            w2(true);
            for (int i13 = 0; i13 < 3; i13++) {
                this.X0[i13] = new wo0(this, this.f43208f0);
                this.X0[i13].d(0, false, true);
            }
            yc ycVar = new yc(this, this.F, i6Var);
            this.Y0 = ycVar;
            ycVar.setUseSelfAlpha(true);
            this.Y0.setProgressColor(-1);
            this.Y0.setSize(org.telegram.messenger.g0.L(54.0f));
            this.Y0.setBackgroundResource(2131231006);
            this.Y0.setVisibility(4);
            this.Y0.setAlpha(0.0f);
            this.f43208f0.addView(this.Y0, c8.ma.e(64, 64, 17));
            F0();
            RadialProgressView radialProgressView = new RadialProgressView(this.E, i6Var);
            this.Q7 = radialProgressView;
            radialProgressView.setProgressColor(-1);
            this.Q7.setBackgroundResource(2131231006);
            this.Q7.setVisibility(4);
            this.f43208f0.addView(this.Q7, c8.ma.e(54, 54, 17));
            org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this.E, 3);
            this.P7 = x0Var;
            x0Var.setBackgroundColor(2130706432);
            this.P7.b();
            this.P7.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            ((TextView) this.P7.f32281b).setText(org.telegram.messenger.gd.M0(2131751343, "Done").toUpperCase());
            int i14 = org.telegram.ui.ActionBar.n6.f29643qg;
            org.telegram.ui.ActionBar.u6.U((TextView) this.P7.f32281b, i14, i6Var);
            this.f43208f0.addView(this.P7, c8.ma.e(-1, 48, 83));
            ((TextView) this.P7.d).setOnClickListener(new in0(this, 2));
            ((TextView) this.P7.f32281b).setOnClickListener(new in0(this, 3));
            org.telegram.ui.Components.x51 x51Var = new org.telegram.ui.Components.x51(false);
            this.A1 = x51Var;
            x51Var.c(new so0(this));
            qq0 qq0Var3 = this.f43208f0;
            Objects.requireNonNull(qq0Var3);
            this.B1 = new org.telegram.ui.Components.cn0(new if0(qq0Var3, 17), false);
            xq0 xq0Var = new xq0(this.E, this);
            this.O7 = xq0Var;
            xq0Var.setTranslationY(org.telegram.messenger.g0.L(120.0f));
            this.O7.setVisibility(4);
            this.O7.setBackgroundColor(2130706432);
            this.f43208f0.addView(this.O7, c8.ma.d(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
            new Paint().setColor(2130706432);
            di.n4 n4Var = new di.n4(this, this.F);
            this.Q0 = n4Var;
            this.f43208f0.addView(n4Var, c8.ma.e(-1, -2, 83));
            TextView textView = new TextView(this.f43208f0.getContext());
            this.m0 = textView;
            textView.setTextSize(1, 15.0f);
            this.m0.setTypeface(org.telegram.messenger.g0.o());
            this.m0.setSingleLine(true);
            this.m0.setMaxLines(1);
            TextView textView2 = this.m0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            this.m0.setTextColor(-1);
            this.m0.setGravity(3);
            this.Q0.addView(this.m0, c8.ma.d(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
            TextView textView3 = new TextView(this.f43208f0.getContext());
            this.f43276n0 = textView3;
            textView3.setTextSize(1, 14.0f);
            this.f43276n0.setSingleLine(true);
            this.f43276n0.setMaxLines(1);
            this.f43276n0.setEllipsize(truncateAt);
            this.f43276n0.setTextColor(-1);
            this.f43276n0.setGravity(3);
            this.Q0.addView(this.f43276n0, c8.ma.d(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
            TextView textView4 = new TextView(this.f43208f0.getContext());
            this.f43284o0 = textView4;
            int i15 = org.telegram.ui.ActionBar.n6.Fi;
            org.telegram.ui.ActionBar.u6.Q(textView4, org.telegram.ui.ActionBar.b6.e(w1(i15), 6.0f), org.telegram.ui.ActionBar.u6.M(i15), org.telegram.ui.ActionBar.u6.e(i15), i6Var);
            TextView textView5 = this.f43284o0;
            int i16 = org.telegram.ui.ActionBar.n6.Ji;
            org.telegram.ui.ActionBar.u6.U(textView5, i16, i6Var);
            this.f43284o0.setEllipsize(truncateAt);
            this.f43284o0.setGravity(17);
            this.f43284o0.setLines(1);
            this.f43284o0.setSingleLine(true);
            this.f43284o0.setText(org.telegram.messenger.gd.M0(2131745346, "SetAsMyPhoto"));
            this.f43284o0.setTextSize(1, 15.0f);
            this.f43284o0.setTypeface(org.telegram.messenger.g0.o());
            this.f43284o0.setOnClickListener(new in0(this, 4));
            this.f43284o0.setVisibility(8);
            this.Q0.addView(this.f43284o0, c8.ma.d(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
            xo0 xo0Var = new xo0(this.E, this);
            this.S7 = xo0Var;
            xo0Var.setDelegate(new com.google.android.gms.common.api.internal.t(this));
            FrameLayout frameLayout = new FrameLayout(this.E);
            this.R7 = frameLayout;
            frameLayout.setClipChildren(false);
            this.R7.addView(this.S7, c8.ma.e(-1, 54, 83));
            a3(false, false);
            this.f43208f0.addView(this.R7, c8.ma.d(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            org.telegram.ui.ActionBar.r0 r0Var = this.F0;
            if (r0Var != null) {
                fh.g a17 = this.Z.a(r0Var);
                a17.p(c8.i0.j(i6Var));
                a17.r(org.telegram.messenger.g0.L(20.0f));
                a17.q(org.telegram.messenger.g0.L(7.0f));
                r0Var.setBackground(ih.d.d(a17, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(54.0f)));
            }
            yo0 yo0Var = new yo0(this.E, org.telegram.messenger.gd.L0(2131751197));
            this.f43227h1 = yo0Var;
            fh.g a18 = this.Z.a(yo0Var);
            a18.p(c8.i0.j(i6Var));
            yo0Var.setBlurredBackgroundDrawable(a18);
            c8.ra.a(this.f43227h1);
            this.f43227h1.setOnClickListener(new in0(this, 7));
            this.f43208f0.addView(this.f43227h1, c8.ma.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
            org.telegram.ui.Components.ee0 ee0Var = new org.telegram.ui.Components.ee0(this.E, i6Var, this.f43180c0);
            this.f43306q5 = ee0Var;
            org.telegram.ui.Components.ct ctVar = ee0Var.f34683c;
            fh.g a19 = this.Z.a(ctVar);
            a19.p(c8.i0.j(i6Var));
            ctVar.setBlurredBackgroundDrawable(a19);
            c8.ra.a(this.f43306q5.f34683c);
            this.f43306q5.setVisibility(8);
            this.f43306q5.setAlpha(0.0f);
            this.f43306q5.setOnClose(new hn0(this, 13));
            this.f43208f0.addView(this.f43306q5, c8.ma.e(-1, -1, 119));
            this.f43306q5.f34682b.setOnClickListener(new in0(this, 9));
            this.f43306q5.setOnGalleryImage(new on0(this, 4));
            org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(3, this.E, this);
            this.f43209f1 = g0Var;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            g0Var.setScaleType(scaleType);
            org.telegram.ui.ActionBar.g0 g0Var2 = this.f43209f1;
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(this.E);
            this.f43199e1 = h00Var;
            g0Var2.setImageDrawable(h00Var);
            this.f43209f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            org.telegram.ui.ActionBar.g0 g0Var3 = this.f43209f1;
            fh.g a20 = this.Z.a(g0Var3);
            a20.p(c8.i0.j(null));
            a20.q(org.telegram.messenger.g0.L(4.0f));
            a20.r(org.telegram.messenger.g0.L(16.0f));
            g0Var3.setBackground(a20);
            c8.ra.a(this.f43209f1);
            this.f43208f0.addView(this.f43209f1, c8.ma.d(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            this.f43209f1.setOnClickListener(new in0(this, 10));
            org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(this.f43208f0.getContext());
            this.f43218g1 = m80Var;
            m80Var.setOnClickListener(new in0(this, 11));
            this.f43208f0.addView(this.f43218g1, c8.ma.d(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
            Context context = this.f43208f0.getContext();
            vq0 vq0Var2 = this.f43226h0;
            qq0 qq0Var4 = this.f43208f0;
            ap0 ap0Var2 = new ap0(this, context, vq0Var2, qq0Var4, qq0Var4, i6Var, this.f43180c0, new hn0(this, 21));
            this.V1 = ap0Var2;
            ap0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.V1.setOnTimerChange(new on0(this, 5));
            this.V1.setAccount(this.U);
            this.V1.setOnHeightUpdate(new on0(this, 6));
            this.V1.setOnAddPhotoClick(new in0(this, 12));
            ContextThemeWrapper contextThemeWrapper = this.F;
            vq0 vq0Var3 = this.f43226h0;
            qq0 qq0Var5 = this.f43208f0;
            bp0 bp0Var2 = new bp0(this, contextThemeWrapper, vq0Var3, qq0Var5, qq0Var5, i6Var, this.f43180c0, new hn0(this, 21));
            this.W1 = bp0Var2;
            bp0Var2.setBlurredBackgroundDrawableForMentions(this.Z);
            this.W1.D(true, false);
            this.W1.setOnTimerChange(new on0(this, 7));
            this.W1.setAccount(this.U);
            this.W1.setOnHeightUpdate(new on0(this, 8));
            this.W1.setOnAddPhotoClick(new in0(this, 13));
            fi.u2 u2Var = new fi.u2(this, this.F);
            this.s5 = u2Var;
            u2Var.setVisibility(8);
            this.f43208f0.addView(this.s5, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            tg.e2 e2Var2 = new tg.e2(this.F, i6Var);
            this.f43297p5 = e2Var2;
            e2Var2.setCurrentAccount(this.U);
            this.f43208f0.addView(this.f43297p5, qq0Var.indexOfChild(this.G) - 1, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            iq0 iq0Var = new iq0(this);
            this.f43334t5 = iq0Var;
            iq0Var.setRad(18);
            this.f43334t5.l();
            this.f43297p5.setStickerCutOutBtn(this.f43334t5);
            this.f43334t5.setOnClickListener(new in0(this, 14));
            this.f43334t5.setCutOutState(false);
            this.f43208f0.addView(this.f43334t5, c8.ma.e(-1, 36, 17));
            LinearLayout linearLayout2 = new LinearLayout(this.E);
            this.f43342u5 = linearLayout2;
            linearLayout2.setOrientation(0);
            iq0 iq0Var2 = new iq0(this);
            this.f43351v5 = iq0Var2;
            iq0Var2.f58127s0 = true;
            iq0Var2.setRad(18);
            this.f43351v5.setEraseState(false);
            this.f43351v5.setOnClickListener(new in0(this, 15));
            this.f43342u5.addView(this.f43351v5, c8.ma.o(-2, 36));
            this.f43342u5.addView(new Space(this.E), c8.ma.o(12, -1));
            iq0 iq0Var3 = new iq0(this);
            this.f43361w5 = iq0Var3;
            iq0Var3.f58127s0 = true;
            iq0Var3.setRad(18);
            this.f43361w5.setRestoreState(false);
            this.f43361w5.setOnClickListener(new in0(this, 16));
            this.f43342u5.addView(this.f43361w5, c8.ma.o(-2, 36));
            this.f43208f0.addView(this.f43342u5, c8.ma.e(-2, 36, 17));
            iq0 iq0Var4 = new iq0(this);
            this.f43371x5 = iq0Var4;
            iq0Var4.setUndoState(false);
            this.f43371x5.setRad(18);
            iq0 iq0Var5 = this.f43371x5;
            iq0Var5.f58127s0 = true;
            iq0Var5.setOnClickListener(new in0(this, 17));
            this.f43208f0.addView(this.f43371x5, c8.ma.e(-2, 36, 17));
            iq0 iq0Var6 = new iq0(this);
            this.f43381y5 = iq0Var6;
            iq0Var6.setOutlineState(false);
            this.f43381y5.setRad(18);
            iq0 iq0Var7 = this.f43381y5;
            iq0Var7.f58127s0 = true;
            iq0Var7.setOnClickListener(new in0(this, 18));
            this.f43208f0.addView(this.f43381y5, c8.ma.e(-2, 36, 17));
            U2(false, false);
            Y2(false, false);
            k0 k0Var = new k0(19, this.E, this);
            this.Y1 = k0Var;
            k0Var.addView(this.V1, c8.ma.e(-1, -1, 83));
            this.f43208f0.addView(this.Y1, c8.ma.d(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(this.E);
            this.Z1 = frameLayout2;
            frameLayout2.addView(this.W1, c8.ma.e(-1, -1, 51));
            this.f43208f0.addView(this.Z1, c8.ma.d(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
            FrameLayout frameLayout3 = new FrameLayout(this.E);
            this.R0 = frameLayout3;
            this.f43208f0.addView(frameLayout3, c8.ma.d(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            FrameLayout frameLayout4 = new FrameLayout(this.E);
            this.S0 = frameLayout4;
            this.f43208f0.addView(frameLayout4, c8.ma.d(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView6 = new TextView(this.E);
            this.T7 = textView6;
            textView6.setSingleLine(true);
            this.T7.setVisibility(8);
            this.T7.setText(org.telegram.messenger.gd.M0(2131752122, "ChooseCover"));
            this.T7.setGravity(1);
            this.T7.setTextSize(1, 14.0f);
            this.T7.setTextColor(-7566196);
            this.f43208f0.addView(this.T7, c8.ma.d(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
            oi.u1 u1Var = new oi.u1(this, this.E, i6Var);
            this.T0 = u1Var;
            int L = org.telegram.messenger.g0.L(52.0f);
            int L2 = org.telegram.messenger.g0.L(38.0f);
            u1Var.L = L;
            u1Var.M = L2;
            oi.u1 u1Var2 = this.T0;
            u1Var2.f39643s0 = true;
            fh.g a21 = this.Z.a(u1Var2);
            a21.p(c8.i0.j(i6Var));
            u1Var2.setBlurredBackgroundDrawable(a21);
            this.f43208f0.addView(this.T0, c8.ma.d(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
            this.T0.setContentDescription(org.telegram.messenger.gd.M0(2131745445, "Send"));
            c8.ra.a(this.T0);
            this.T0.setOnClickListener(new in0(this, 19));
            this.T0.setOnLongClickListener(new t(this, 5));
            org.telegram.ui.Components.fe0 fe0Var = new org.telegram.ui.Components.fe0(this.E);
            this.U0 = fe0Var;
            LinearLayout linearLayout3 = fe0Var.f35072b;
            fh.g a22 = this.Z.a(linearLayout3);
            a22.p(c8.i0.j(i6Var));
            a22.r(org.telegram.messenger.g0.L(18.0f));
            a22.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout3.setBackground(a22);
            LinearLayout linearLayout4 = this.U0.f35073c;
            fh.g a23 = this.Z.a(linearLayout4);
            a23.p(c8.i0.j(i6Var));
            a23.r(org.telegram.messenger.g0.L(18.0f));
            a23.q(org.telegram.messenger.g0.L(7.0f));
            linearLayout4.setBackground(a23);
            this.U0.setVisibility(8);
            this.U0.f35072b.setOnClickListener(new in0(this, 20));
            this.U0.f35073c.setOnClickListener(new in0(this, 21));
            this.f43208f0.addView(this.U0, c8.ma.e(-1, 56, 80));
            d61 d61Var2 = new d61(20, this.E, this);
            this.I0 = d61Var2;
            d61Var2.setOrientation(0);
            this.I0.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
            d61 d61Var3 = this.I0;
            fh.g a24 = this.Z.a(d61Var3);
            a24.p(c8.i0.j(i6Var));
            a24.q(org.telegram.messenger.g0.L(2.0f));
            a24.r(org.telegram.messenger.g0.L(22.0f));
            d61Var3.setBackground(a24);
            this.Q0.addView(this.I0, c8.ma.d(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
            ImageView imageView = new ImageView(this.E);
            this.f43161a1 = imageView;
            imageView.setScaleType(scaleType);
            this.f43161a1.setImageResource(2131231730);
            this.f43161a1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43161a1, c8.ma.o(48, 48));
            this.f43161a1.setOnClickListener(new in0(this, 22));
            this.f43161a1.setContentDescription(org.telegram.messenger.gd.M0(2131751687, "CropImage"));
            ImageView imageView2 = new ImageView(this.E);
            this.f43181c1 = imageView2;
            imageView2.setScaleType(scaleType);
            this.f43181c1.setImageResource(2131232284);
            this.f43181c1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43181c1, c8.ma.o(48, 48));
            this.f43181c1.setOnClickListener(new in0(this, 23));
            this.f43181c1.setContentDescription(org.telegram.messenger.gd.M0(2131754783, "AccDescrRotate"));
            ImageView imageView3 = new ImageView(this.E);
            this.f43171b1 = imageView3;
            imageView3.setScaleType(scaleType);
            this.f43171b1.setImageResource(2131231743);
            this.f43171b1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43171b1, c8.ma.o(48, 48));
            this.f43171b1.setOnClickListener(new in0(this, 24));
            this.f43171b1.setContentDescription(org.telegram.messenger.gd.M0(2131754840, "AccDescrMirror"));
            ImageView imageView4 = new ImageView(this.E);
            this.Z0 = imageView4;
            imageView4.setScaleType(scaleType);
            this.Z0.setImageResource(2131231740);
            this.Z0.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.Z0, c8.ma.o(48, 48));
            this.Z0.setOnClickListener(new in0(this, 25));
            this.Z0.setContentDescription(org.telegram.messenger.gd.M0(2131754810, "AccDescrPhotoEditor"));
            org.telegram.ui.Components.s51 s51Var = new org.telegram.ui.Components.s51(this.E);
            this.f43251k1 = s51Var;
            s51Var.setTag(1);
            this.f43251k1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.Y7 = t2();
            org.telegram.ui.Components.s51 s51Var2 = this.f43251k1;
            if (this.f43258k8 && this.Z7 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            s51Var2.a(Math.min(this.f43206e8, this.f43216f8), z11, this.f43310r);
            this.f43251k1.setContentDescription(org.telegram.messenger.gd.M0(2131754735, "AccDescrVideoQuality"));
            this.I0.addView(this.f43251k1, c8.ma.o(48, 48));
            this.f43251k1.setOnClickListener(new cd0(6, this, parentActivity));
            ImageView imageView5 = new ImageView(this.E);
            this.f43190d1 = imageView5;
            imageView5.setScaleType(scaleType);
            this.f43190d1.setImageResource(2131231757);
            this.f43190d1.setBackground(org.telegram.ui.ActionBar.n6.X(org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f)));
            this.I0.addView(this.f43190d1, c8.ma.o(48, 48));
            this.f43190d1.setOnClickListener(new in0(this, 26));
            this.f43190d1.setContentDescription(org.telegram.messenger.gd.M0(2131754811, "AccDescrPhotoAdjust"));
            org.telegram.ui.Cells.x0 x0Var2 = new org.telegram.ui.Cells.x0(this.F, 3);
            this.V0 = x0Var2;
            x0Var2.setBackgroundColor(-872415232);
            this.V0.b();
            this.V0.setVisibility(8);
            this.f43208f0.addView(this.V0, c8.ma.e(-1, 48, 83));
            ((TextView) this.V0.d).setOnClickListener(new in0(this, 27));
            ((TextView) this.V0.f32281b).setOnClickListener(new in0(this, 28));
            TextView textView7 = new TextView(this.F);
            this.W0 = textView7;
            textView7.setClickable(false);
            this.W0.setVisibility(8);
            this.W0.setTextSize(1, 14.0f);
            this.W0.setTextColor(-1);
            this.W0.setGravity(17);
            this.W0.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.g0(-12763843, 0));
            this.W0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
            this.W0.setText(org.telegram.messenger.gd.L0(2131751685).toUpperCase());
            this.W0.setTypeface(org.telegram.messenger.g0.o());
            this.V0.addView(this.W0, c8.ma.e(-2, -1, 49));
            this.W0.setOnClickListener(new in0(this, 29));
            org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(this.f43208f0.getContext(), this);
            this.f43317r6 = k10Var;
            k10Var.b();
            this.f43326s6 = true;
            this.f43317r6.h = this;
            qn0 qn0Var = new qn0(this);
            this.C4.H0(this.f43208f0);
            ImageReceiver imageReceiver = this.C4;
            imageReceiver.l1 = (byte) 2;
            imageReceiver.K0 = true;
            imageReceiver.d0(qn0Var);
            this.B4.H0(this.f43208f0);
            ImageReceiver imageReceiver2 = this.B4;
            imageReceiver2.l1 = (byte) 2;
            imageReceiver2.K0 = true;
            imageReceiver2.d0(qn0Var);
            this.D4.H0(this.f43208f0);
            ImageReceiver imageReceiver3 = this.D4;
            imageReceiver3.l1 = (byte) 2;
            imageReceiver3.K0 = true;
            imageReceiver3.d0(qn0Var);
            int rotation = ((WindowManager) org.telegram.messenger.t0.f26913b.getSystemService("window")).getDefaultDisplay().getRotation();
            CheckBox checkBox = new CheckBox(this.f43208f0.getContext(), 2131232694);
            this.O0 = checkBox;
            checkBox.setDrawBackground(true);
            this.O0.setHasBorder(true);
            this.O0.setSize(34);
            this.O0.setCheckOffset(org.telegram.messenger.g0.L(1.0f));
            this.O0.c(w1(i14), -1);
            this.O0.setVisibility(8);
            qq0 qq0Var6 = this.f43208f0;
            CheckBox checkBox2 = this.O0;
            if (rotation != 3 && rotation != 1) {
                f10 = 71.0f;
            } else {
                f10 = 61.0f;
            }
            qq0Var6.addView(checkBox2, c8.ma.d(34, 34.0f, 53, 0.0f, f10, 11.0f, 0.0f));
            if (!this.f43320s) {
                ((FrameLayout.LayoutParams) this.O0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f24112m;
            }
            this.O0.setOnClickListener(new vn0(this, 0));
            CounterView counterView = new CounterView(this.E);
            this.P0 = counterView;
            qq0 qq0Var7 = this.f43208f0;
            if (rotation != 3 && rotation != 1) {
                f11 = 68.0f;
            } else {
                f11 = 58.0f;
            }
            qq0Var7.addView(counterView, c8.ma.d(40, 40.0f, 53, 0.0f, f11, 64.0f, 0.0f));
            if (!this.f43320s) {
                ((FrameLayout.LayoutParams) this.P0.getLayoutParams()).topMargin += org.telegram.messenger.g0.f24112m;
            }
            this.P0.setOnClickListener(new vn0(this, 1));
            br0 br0Var = new br0(this.E);
            this.f43293p1 = br0Var;
            br0Var.setVisibility(8);
            this.f43293p1.setAlpha(0.0f);
            this.f43293p1.setLayoutManager(new jg.b0());
            br0 br0Var2 = this.f43293p1;
            l4 l4Var = new l4(15, this, this.E);
            this.f43302q1 = l4Var;
            br0Var2.setAdapter(l4Var);
            this.f43208f0.addView(this.f43293p1, c8.ma.e(-1, 103, 51));
            this.f43293p1.setOnItemClickListener(new h(this, 22));
            UndoView undoView = new UndoView(this.F, null, false, i6Var);
            this.f43285o1 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(112.0f));
            this.f43285o1.h(-115203550, -1);
            this.f43208f0.addView(this.f43285o1, c8.ma.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            if (org.telegram.messenger.g0.C1()) {
                View view2 = new View(this.F);
                this.T3 = view2;
                view2.setContentDescription(org.telegram.messenger.gd.M0(2131754929, "AccActionPlay"));
                this.T3.setFocusable(true);
                this.T3.setOnClickListener(new vn0(this, 2));
                this.f43208f0.addView(this.T3, c8.ma.e(64, 64, 17));
            }
            org.telegram.ui.ActionBar.u6.Q(this.f43284o0, org.telegram.ui.ActionBar.b6.e(w1(i15), 6.0f), org.telegram.ui.ActionBar.u6.M(i15), org.telegram.ui.ActionBar.u6.e(i15), i6Var);
            org.telegram.ui.ActionBar.u6.U(this.f43284o0, i16, i6Var);
            vo0 vo0Var = this.R;
            vo0Var.f32254j0 = true;
            vo0Var.f32250h0 = false;
            org.telegram.ui.Cells.v9 n10 = vo0Var.n(this.f43226h0.getContext());
            if (n10 != null) {
                org.telegram.messenger.g0.E2(n10);
                this.f43208f0.addView(n10);
            }
            this.R.S(this.f43208f0);
            this.R.R();
            this.f43159a.a(false, false);
            return;
        }
        s3();
    }

    public final void J0() {
        if (this.E != null && this.f43226h0 != null) {
            wi.n nVar = this.P8;
            if (nVar != null) {
                this.P8 = null;
                nVar.b();
            }
            xi.e eVar = this.C7;
            if (eVar != null) {
                eVar.b();
                this.C7 = null;
            }
            ConnectionsManager.getInstance(this.U).cancelRequestsForGuid(this.f43179c);
            m2(false);
            try {
                if (this.f43226h0.getParent() != null) {
                    ((WindowManager) this.E.getSystemService("window")).removeViewImmediate(this.f43226h0);
                    U1();
                }
                this.f43226h0 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.hc hcVar = this.f43246j5;
            if (hcVar != null) {
                hcVar.a();
                this.f43246j5 = null;
            }
            this.f43234i0.setImageBitmap(null);
            if (this == f43158g9) {
                f43158g9 = null;
            } else {
                f43157f9 = null;
            }
            U1();
        }
    }

    public final void J2(org.telegram.ui.Components.si siVar) {
        this.f43172b2 = siVar;
        bg.v0 v0Var = this.f43182c2;
        if (v0Var != null) {
            v0Var.a();
            this.f43182c2 = null;
        }
        if (siVar != null) {
            if (siVar.f30213k1 == null) {
                Window window = siVar.getWindow();
                ?? obj = new Object();
                obj.f3356c = new a1.c(new WeakReference(window), 10);
                siVar.f30213k1 = obj;
            }
            bg.w0 w0Var = siVar.f30213k1;
            w0Var.getClass();
            this.f43182c2 = new bg.v0(w0Var);
        }
    }

    public final void K0() {
        if (this.C4.m() == null && !this.f43224g7.isEmpty() && this.d2 != 1) {
            String str = this.C4.R;
            String str2 = this.f43370x4;
            if (str2 == null || !str2.equals(str)) {
                this.f43360w4 = 0;
                org.telegram.messenger.hc p10 = this.C4.p();
                int i7 = this.C4.V;
                if (str != null && p10 != null && p10.f24423c != null) {
                    Utilities.f22779e.c(new org.telegram.ui.Components.kp0(this, p10, i7, str, 14));
                }
            }
        }
    }

    public final void K2() {
        bn bnVar;
        TLRPC.Chat chat;
        uq0 uq0Var = this.d;
        if (uq0Var != null) {
            if (uq0Var.v() != null && this.h > 0 && this.d.v().size() >= this.h && !this.d.x(this.P4)) {
                if (this.f43275n && (bnVar = this.f43262l4) != null && (chat = bnVar.f45978e) != null && !org.telegram.messenger.v3.N(chat) && chat.slowmode_enabled) {
                    org.telegram.ui.Components.b5.K(this.E, org.telegram.messenger.gd.M0(2131745115, "Slowmode"), org.telegram.messenger.gd.M0(2131745108, "SlowmodeSelectSendError")).p();
                    return;
                }
                return;
            }
            int k10 = this.d.k(this.P4, j1());
            boolean x10 = this.d.x(this.P4);
            this.O0.b(x10, true);
            if (k10 >= 0) {
                if (x10) {
                    this.f43302q1.i(k10);
                    this.f43293p1.y0(k10);
                } else {
                    this.f43302q1.s(k10);
                    if (k10 == 0) {
                        this.f43302q1.g(0);
                    }
                }
            }
            z3();
        }
    }

    public final void L0() {
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.Z7)), this.Y7);
        edit.commit();
        C3();
        A3();
    }

    public final void L2() {
        float q10 = this.C4.q();
        float o4 = this.C4.o();
        if (q10 != 0.0f && o4 != 0.0f) {
            float g12 = g1(this.f43341u4);
            float e12 = e1();
            float min = Math.min(e12 / o4, g12 / q10);
            float max = Math.max(g12 / ((int) (q10 * min)), e12 / ((int) (o4 * min)));
            this.f43166a6 = max;
            u3(max);
        }
    }

    public final void M0() {
        bg.v0 v0Var = this.f43273m7;
        if (v0Var != null) {
            v0Var.a();
            this.f43273m7 = null;
        }
        bg.v0 v0Var2 = this.f43182c2;
        if (v0Var2 != null) {
            v0Var2.a();
            this.f43182c2 = null;
        }
        try {
            if (this.f43226h0.getParent() != null) {
                ((WindowManager) this.E.getSystemService("window")).removeView(this.f43226h0);
                U1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void M2(CharSequence charSequence) {
        tq0 tq0Var = this.N;
        this.f43202e4 = charSequence;
        tq0Var.c(charSequence);
        h3(true, false);
    }

    public final void N0(android.graphics.Canvas r51, org.telegram.ui.Components.ga r52, int r53, int r54, boolean r55, boolean r56, boolean r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.N0(android.graphics.Canvas, org.telegram.ui.Components.ga, int, int, boolean, boolean, boolean):void");
    }

    public final void N2(boolean z10, boolean z11) {
        if (this.f43261l3 != z10) {
            if (z10) {
                this.f43242j0.setTag(1);
            } else {
                this.f43242j0.setTag(null);
            }
            ValueAnimator valueAnimator = this.f43253k3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f43261l3 = z10;
            float f10 = 0.0f;
            int i7 = 0;
            if (z11) {
                if (z10) {
                    this.f43237i3.setVisibility(0);
                }
                float alpha = this.f43237i3.getAlpha();
                if (z10) {
                    f10 = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new gn0(this, 0));
                ofFloat.addListener(new op0(this, z10, 0));
                this.f43253k3 = ofFloat;
                ofFloat.start();
            } else {
                cr0 cr0Var = this.f43237i3;
                if (!z10) {
                    i7 = 8;
                }
                cr0Var.setVisibility(i7);
                cr0 cr0Var2 = this.f43237i3;
                if (z10) {
                    f10 = 1.0f;
                }
                cr0Var2.setAlpha(f10);
            }
            if (this.f43260l2 && this.f43248j7 == null) {
                if (z10) {
                    this.f43292p0.T(9);
                } else {
                    this.f43292p0.u(9);
                }
            }
        }
    }

    public final void O0(android.graphics.Canvas r24, float r25, float r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.O0(android.graphics.Canvas, float, float):void");
    }

    public final boolean O1() {
        if (this.d2 != 11) {
            int i7 = this.P4;
            if (i7 >= 0) {
                ArrayList arrayList = this.f43224g7;
                if (i7 < arrayList.size()) {
                    uq0 uq0Var = this.d;
                    if (uq0Var != null && !uq0Var.O()) {
                        return true;
                    }
                    Object obj = arrayList.get(this.P4);
                    if (obj instanceof org.telegram.messenger.ef) {
                        return ((org.telegram.messenger.ef) obj).j();
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean O2(int i7) {
        rq0 rq0Var = this.f43248j7;
        if (rq0Var != null) {
            if (rq0Var.a(i7) || this.f43248j7.e(i7)) {
                int i10 = org.telegram.messenger.bz.f23145a;
                if (org.telegram.messenger.pc.e(1024)) {
                    File b10 = this.f43248j7.b(i7);
                    if (b10 != null && b10.exists()) {
                        return true;
                    }
                    if (org.telegram.messenger.bz.B0 && (this.f43248j7.d(i7) instanceof TLRPC.Document)) {
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

    public final void P0(Canvas canvas) {
        boolean z10;
        float d;
        int i7;
        if (this.S4) {
            if (!org.telegram.messenger.bz.f23152c0) {
                d = 1.0f;
            } else {
                int i10 = this.f43279n4;
                if (i10 != 0 && i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                d = this.E8.d(z10);
            }
            if (d <= 0.0f) {
                return;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) (org.telegram.messenger.g0.f24112m * 1.5f));
            int height = this.Q0.getHeight() + org.telegram.messenger.g0.f24113n;
            if (this.V1.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(20.0f) + (this.V1.getEditTextHeightClosedKeyboard() / 2);
            } else {
                i7 = 0;
            }
            int i11 = height + i7;
            if (this.G7 == null) {
                this.G7 = new Path();
                Paint paint = new Paint(1);
                this.H7 = paint;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.I7 = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.J7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.K7 = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.L7 = new Matrix();
                this.M7 = new Matrix();
                this.H7.setShader(this.J7);
                this.I7.setShader(this.K7);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.f43208f0.getWidth(), this.f43208f0.getHeight() + org.telegram.messenger.g0.f24113n, (int) (d * (this.M0.getAlpha() - 127) * 2.007874f), 31);
            this.G7.rewind();
            float f10 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            this.G7.addRect(0.0f, 0.0f, this.f43208f0.getWidth(), f10, direction);
            this.G7.addRect(0.0f, (this.f43208f0.getHeight() + org.telegram.messenger.g0.f24113n) - i11, this.f43208f0.getWidth(), this.f43208f0.getHeight() + org.telegram.messenger.g0.f24113n, direction);
            canvas.clipPath(this.G7);
            canvas.drawColor(-16777216);
            N0(canvas, this.f43189d0, 0, 0, true, true, false);
            canvas.save();
            this.L7.reset();
            this.L7.postScale(1.0f, f10 / 16.0f);
            this.J7.setLocalMatrix(this.L7);
            this.H7.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.f43208f0.getWidth(), f10, this.H7);
            this.M7.reset();
            this.M7.postScale(1.0f, i11 / 16.0f);
            this.M7.postTranslate(0.0f, (this.f43208f0.getHeight() - i11) + org.telegram.messenger.g0.f24113n);
            this.K7.setLocalMatrix(this.M7);
            this.I7.setAlpha(187);
            canvas.drawRect(0.0f, (this.f43208f0.getHeight() + org.telegram.messenger.g0.f24113n) - i11, this.f43208f0.getWidth(), this.f43208f0.getHeight() + org.telegram.messenger.g0.f24113n, this.I7);
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean P1() {
        if (this.f43197e && this.d != null) {
            return true;
        }
        return false;
    }

    public final void Q0(float r10, float r11, float r12, float r13, android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Q0(float, float, float, float, android.graphics.Canvas):void");
    }

    public final void Q1() {
        WindowManager.LayoutParams layoutParams = this.f43198e0;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.E.getSystemService("window")).updateViewLayout(this.f43226h0, this.f43198e0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f43226h0.setFocusable(true);
        this.f43208f0.setFocusable(true);
    }

    public final void Q2(AlertDialog$Builder alertDialog$Builder) {
        if (this.E != null) {
            try {
                org.telegram.ui.ActionBar.u1 u1Var = this.Q1;
                if (u1Var != null) {
                    u1Var.dismiss();
                    this.Q1 = null;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            try {
                org.telegram.ui.ActionBar.u1 p10 = alertDialog$Builder.p();
                this.Q1 = p10;
                p10.setCanceledOnTouchOutside(true);
                this.Q1.setOnDismissListener(new q5(this, 10));
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    public final void R1(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f10, boolean z10) {
        boolean z11;
        int i7;
        Bitmap.CompressFormat c12 = c1();
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z11 = true;
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                return;
            }
        } else {
            z11 = false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f11 = width;
        if (f11 > f10 || height > f10) {
            float max = Math.max(width, height) / f10;
            height = (int) (height / max);
            width = (int) (f11 / max);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, width, height);
        Paint paint = f43152a9;
        if (z10) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        if (f10 == 512.0f) {
            i7 = 83;
        } else {
            i7 = 87;
        }
        createBitmap.compress(c12, i7, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (z11) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public final boolean R2(FrameLayout frameLayout) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f43270m4;
        if ((h2Var instanceof bn) && org.telegram.messenger.v3.V(((bn) h2Var).f45978e)) {
            org.telegram.ui.Components.gc f10 = new org.telegram.ui.Components.lc(frameLayout, this.f43358w2).f(org.telegram.messenger.mp.u1(this.U).X4, new hn0(this, 29));
            f10.v = new zn0(this, 0);
            this.f43282n7 = f10.j();
            return true;
        }
        return false;
    }

    public final void S0(TLRPC.Document document, TLRPC.Document document2, boolean z10, org.telegram.messenger.q10 q10Var) {
        float f10;
        this.f43344u7 = document;
        this.f43335t7 = document2;
        this.f43353v7 = z10;
        this.f43363w7 = false;
        this.f43373x7 = q10Var;
        this.f43176b6 = 0.0f;
        this.f43214f6 = 0.0f;
        if (this.f43297p5 != null) {
            iq0 iq0Var = this.f43381y5;
            if (iq0Var != null) {
                iq0Var.m(false, false);
            }
            this.f43297p5.b();
            ArrayList arrayList = this.f43316r5;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.f43344u7 != null) {
            ArrayList arrayList2 = this.f43316r5;
            if (arrayList2 == null) {
                this.f43316r5 = new ArrayList();
            } else {
                arrayList2.clear();
            }
            TLRPC.Document document3 = this.f43344u7;
            int i7 = this.U;
            ArrayList arrayList3 = null;
            if (document3 != null) {
                ArrayList arrayList4 = new ArrayList();
                int size = document3.attributes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.DocumentAttribute documentAttribute = document3.attributes.get(i10);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(i7).o0(documentAttribute.stickerset, true);
                        if (o02 != null && o02.packs != null) {
                            for (int i11 = 0; i11 < o02.packs.size(); i11++) {
                                TLRPC.TL_stickerPack tL_stickerPack = o02.packs.get(i11);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document3.f28409id)) && org.telegram.messenger.j6.g(tL_stickerPack.emoticon) != null) {
                                    arrayList4.add(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (arrayList4.isEmpty()) {
                            if (!TextUtils.isEmpty(documentAttribute.alt) && org.telegram.messenger.j6.g(documentAttribute.alt) != null) {
                                arrayList4.add(documentAttribute.alt);
                            }
                        }
                        arrayList3 = arrayList4;
                        break;
                    }
                }
            }
            if (arrayList3 != null) {
                this.f43316r5.addAll(arrayList3);
            }
        }
        iq0 iq0Var2 = this.f43334t5;
        if (iq0Var2 != null) {
            iq0Var2.setCutOutState(false);
        }
        Y2(true, false);
        ImageView imageView = this.f43190d1;
        if (imageView != null) {
            if (this.f43353v7) {
                f10 = 0.4f;
            } else {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void S1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.S1(boolean):void");
    }

    public final void S2() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.E, this.f43358w2);
        String M0 = org.telegram.messenger.gd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
        u1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, "OK"), null);
        org.telegram.messenger.fj fjVar = this.T4;
        if (fjVar != null && org.telegram.messenger.fj.L4(fjVar.f23965k) && org.telegram.messenger.w7.G(this.T4.K1).S(this.f43185c5[0])) {
            u1Var.U = org.telegram.messenger.gd.M0(2131747011, null);
        } else {
            u1Var.U = org.telegram.messenger.gd.M0(2131747025, null);
        }
        Q2(alertDialog$Builder);
    }

    public final void T0() {
        wi.n nVar = this.P8;
        if (nVar != null && nVar.d()) {
            return;
        }
        this.P8 = l2.i.d().k(this.X8);
    }

    public final void T1(android.graphics.Canvas r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.T1(android.graphics.Canvas):void");
    }

    public final void T2(final org.telegram.ui.Components.yc ycVar, boolean z10, boolean z11, final float[] fArr) {
        float f10;
        float f11;
        int i7;
        uq0 uq0Var = this.d;
        if (uq0Var != null && uq0Var.l()) {
            f10 = 175.0f;
        } else {
            f10 = 58.0f;
        }
        float L = org.telegram.messenger.g0.L(f10);
        float f12 = 1.0f;
        if (ycVar == this.W1) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        float f13 = L * f11;
        Integer num = null;
        if (!z11) {
            ycVar.animate().setListener(null).cancel();
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            ycVar.setVisibility(i7);
            if (z10) {
                f13 = 0.0f;
            }
            ycVar.setTranslationY(f13);
            float alpha = this.Q0.getAlpha();
            if (!z10) {
                f12 = 0.0f;
            }
            fArr[0] = f12;
            ycVar.setAlpha(alpha * f12);
        } else if (z10 && ycVar.getTag() == null) {
            if (ycVar.getVisibility() != 0) {
                ycVar.setVisibility(0);
                ycVar.setAlpha(this.Q0.getAlpha());
                ycVar.setTranslationY(f13);
            }
            ycVar.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f46575b;

                {
                    this.f46575b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f46575b;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = ycVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f43209f1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43218g1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43227h1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f46575b;
                            float alpha3 = photoViewer2.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ycVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.V1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.Q0.getTranslationY() - (photoViewer2.V1.getAlpha() * i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f43209f1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43218g1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43227h1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).start();
        } else if (!z10 && ycVar.getTag() != null) {
            ycVar.animate().translationY(f13).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final PhotoViewer f46575b;

                {
                    this.f46575b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r4) {
                        case 0:
                            PhotoViewer photoViewer = this.f46575b;
                            float alpha2 = photoViewer.Q0.getAlpha();
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction;
                            float f14 = alpha2 * animatedFraction;
                            View view = ycVar;
                            view.setAlpha(f14);
                            if (view == photoViewer.V1) {
                                FrameLayout frameLayout = photoViewer.R7;
                                if (frameLayout != null) {
                                    frameLayout.setTranslationY(photoViewer.Q0.getTranslationY() - (photoViewer.V1.getAlpha() * i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer.f43209f1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43218g1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                                photoViewer.f43227h1.setTranslationY(photoViewer.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer.D1();
                            return;
                        default:
                            PhotoViewer photoViewer2 = this.f46575b;
                            float alpha3 = photoViewer2.Q0.getAlpha();
                            float animatedFraction2 = 1.0f - valueAnimator.getAnimatedFraction();
                            fArr[0] = animatedFraction2;
                            View view2 = ycVar;
                            view2.setAlpha(alpha3 * animatedFraction2);
                            if (view2 == photoViewer2.V1) {
                                FrameLayout frameLayout2 = photoViewer2.R7;
                                if (frameLayout2 != null) {
                                    frameLayout2.setTranslationY(photoViewer2.Q0.getTranslationY() - (photoViewer2.V1.getAlpha() * i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                }
                                photoViewer2.f43209f1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43218g1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                                photoViewer2.f43227h1.setTranslationY(photoViewer2.V1.getAlpha() * (-i5.c.d(46.0f, photoViewer2.V1.getEditTextHeight(), 0)));
                            }
                            photoViewer2.D1();
                            return;
                    }
                }
            }).setDuration(420L).setInterpolator(org.telegram.ui.Components.lr.h).withEndAction(new sg(3, ycVar)).start();
        }
        if (z10) {
            num = 1;
        }
        ycVar.setTag(num);
    }

    public final void U1() {
        Activity activity = this.E;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).f43068a1.remove(this.f43330t1);
        }
        org.telegram.ui.ActionBar.h2 h2Var = this.f43270m4;
        if (h2Var != null && h2Var.getFragmentView() != null) {
            this.f43272m6 = 1.0f;
            View fragmentView = this.f43270m4.getFragmentView();
            fragmentView.setScaleX(1.0f);
            fragmentView.setScaleY(1.0f);
            org.telegram.ui.Components.si siVar = this.f43172b2;
            if (siVar != null) {
                org.telegram.ui.ActionBar.n2 n2Var = siVar.f30193c;
                n2Var.setScaleX(1.0f);
                n2Var.setScaleY(1.0f);
            }
        }
    }

    public final void U2(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        uq0 uq0Var = this.d;
        boolean z14 = false;
        if (uq0Var != null && uq0Var.A()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ap0 ap0Var = this.V1;
        if (z10 && !z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        T2(ap0Var, z13, z11, this.f43383y7);
        bp0 bp0Var = this.W1;
        if (z10 && z12) {
            z14 = true;
        }
        T2(bp0Var, z14, z11, this.f43392z7);
    }

    public final void V1(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.G2 != null && this.T4 != null) {
                    int intValue = Utilities.z(url).intValue();
                    if (this.G2.U() == -9223372036854775807L) {
                        this.f43163a3 = intValue / ((float) this.T4.L0());
                        return;
                    }
                    long j3 = intValue * 1000;
                    this.G2.p0(j3);
                    this.f43304q3.h(true, ((float) j3) / ((float) this.G2.U()));
                    this.f43314r3.invalidate();
                    return;
                }
                return;
            } else if (url.startsWith("#")) {
                if (this.E instanceof LaunchActivity) {
                    cx cxVar = new cx(null);
                    cxVar.f46711p2 = url;
                    ((LaunchActivity) this.E).u0(cxVar, false, true);
                    z0(false, false);
                    return;
                }
                return;
            } else if (this.f43262l4 != null && ((clickableSpan instanceof org.telegram.ui.Components.r41) || org.telegram.messenger.g0.H3(url))) {
                org.telegram.ui.Components.b5.n0(this.f43262l4, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public final void V2(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.V2(boolean, boolean):void");
    }

    public final int W0(int i7) {
        if (i7 != 1 && (i7 != 0 || this.d2 != 1)) {
            if (i7 != 0 && i7 != 5 && i7 != 4 && i7 != 3) {
                return org.telegram.messenger.g0.L(14.0f);
            }
            return 0;
        }
        return org.telegram.messenger.g0.L(16.0f);
    }

    public final void W1(wq0 wq0Var) {
        if (this.f43348v2) {
            m2(true);
        }
        org.telegram.messenger.fj fjVar = this.T4;
        if (fjVar != null && !fjVar.P) {
            org.telegram.messenger.w7.G(this.U).f(this.T4.F0());
        }
        this.f43197e = false;
        this.f43207f = false;
        this.f43228h2 = false;
        this.f43325s4 = true;
        this.T4 = null;
        this.Y4 = null;
        this.Z4 = null;
        this.f43165a5 = null;
        this.f43175b5 = null;
        this.f43239i5 = null;
        this.f43203e5 = null;
        this.f43313r2 = null;
        VideoAds videoAds = this.U4;
        if (videoAds != null) {
            videoAds.stop();
            this.U4 = null;
        }
        if (this.f43237i3 != null) {
            N2(false, false);
        }
        wp0 wp0Var = this.U1;
        if (wp0Var != null) {
            wp0Var.scrollTo(0, 0);
        }
        this.d2 = 0;
        this.f43200e2 = false;
        this.f43210f2 = false;
        this.f43219g2 = false;
        this.f43236i2 = false;
        org.telegram.messenger.hc hcVar = this.f43246j5;
        if (hcVar != null) {
            hcVar.a();
            this.f43246j5 = null;
        }
        this.f43172b2 = null;
        bg.v0 v0Var = this.f43182c2;
        if (v0Var != null) {
            v0Var.a();
            this.f43182c2 = null;
        }
        org.telegram.ui.Components.b6 b6Var = this.f43252k2;
        if (b6Var != null) {
            b6Var.w(this.f43208f0);
            this.f43252k2 = null;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            wo0 wo0Var = this.X0[i7];
            if (wo0Var != null) {
                wo0Var.d(-1, false, true);
            }
        }
        n2(0);
        xo0 xo0Var = this.S7;
        if (xo0Var != null) {
            xo0Var.a();
        }
        this.f43285o1.d(0, false);
        this.C4.w0(null);
        this.F4.o();
        this.B4.w0(null);
        this.E4.o();
        this.D4.w0(null);
        this.G4.o();
        this.f43208f0.post(new kn0(this, wq0Var, 0));
        uq0 uq0Var = this.d;
        if (uq0Var != null) {
            uq0Var.G();
        }
        org.telegram.ui.Components.w20 w20Var = this.f43267m1;
        w20Var.d.clear();
        w20Var.f41535e.clear();
        w20Var.f41532c.clear();
        uq0 uq0Var2 = this.d;
        if (uq0Var2 != null) {
            uq0Var2.D();
        }
        this.d = null;
        this.f43302q1.f();
        this.f43248j7 = null;
        this.f43325s4 = false;
        this.f43291o8 = 0.0f;
        this.f43300p8 = 1.0f;
        if (wq0Var != null) {
            wq0Var.f53447a.O0(true, true);
        }
        bn bnVar = this.f43262l4;
        if (bnVar != null) {
            bnVar.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.O4;
        if (bitmap != null) {
            bitmap.recycle();
            this.O4 = null;
        }
    }

    public final void W2(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i7;
        float f18;
        float f19;
        int i10;
        TextureView textureView;
        if (z10 && this.H3 && this.I3 && !this.F3 && (textureView = this.C2) != null) {
            this.O4 = textureView.getBitmap();
        }
        if (z10) {
            this.f43168a8 = this.Y7;
        }
        AnimatorSet animatorSet = this.U7;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.U7 = new AnimatorSet();
        float f20 = 0.0f;
        if (z10) {
            if (this.S4) {
                this.f43250k0.setVisibility(0);
                View view = this.f43250k0;
                if (this.d2 == 11) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                view.setAlpha(f19);
                View view2 = this.f43250k0;
                if (this.d2 == 11) {
                    i10 = 1711276032;
                } else {
                    i10 = 2130706432;
                }
                view2.setBackgroundColor(i10);
            }
            this.O7.setTag(1);
            AnimatorSet animatorSet2 = this.U7;
            di.n4 n4Var = this.Q0;
            Property property = View.TRANSLATION_Y;
            int editTextHeight = this.V1.getEditTextHeight() + n4Var.getHeight();
            if (this.f43322s1) {
                i7 = org.telegram.messenger.g0.L(58.0f);
            } else {
                i7 = 0;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n4Var, property, 0.0f, editTextHeight + i7);
            di.n4 n4Var2 = this.Q0;
            Property property2 = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(n4Var2, property2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.T0, property, 0.0f, org.telegram.messenger.g0.L(158.0f));
            View view3 = this.f43250k0;
            if (this.S4) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(view3, property2, f18, 1.0f));
        } else {
            this.O7.setTag(null);
            AnimatorSet animatorSet3 = this.U7;
            xq0 xq0Var = this.O7;
            Property property3 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(xq0Var, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.P7, property3, 0.0f, org.telegram.messenger.g0.L(166.0f));
            View view4 = this.f43250k0;
            Property property4 = View.ALPHA;
            if (this.S4) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat4, ofFloat5, ObjectAnimator.ofFloat(view4, property4, 1.0f, f10));
        }
        this.U7.addListener(new op0(this, z10, 3));
        this.U7.setDuration(200L);
        this.U7.setInterpolator(org.telegram.messenger.g0.G);
        this.U7.start();
        float f21 = 0.25f;
        if (this.f43209f1.getVisibility() == 0) {
            ViewPropertyAnimator animate = this.f43209f1.animate();
            if (z10) {
                f15 = 0.25f;
            } else {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f15);
            if (z10) {
                f16 = 0.25f;
            } else {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z10) {
                f17 = 0.0f;
            } else {
                f17 = 1.0f;
            }
            scaleY.alpha(f17).setDuration(200L);
        }
        if (this.f43218g1.getVisibility() == 0) {
            ViewPropertyAnimator animate2 = this.f43218g1.animate();
            if (z10) {
                f12 = 0.25f;
            } else {
                f12 = 1.0f;
            }
            ViewPropertyAnimator scaleX2 = animate2.scaleX(f12);
            if (z10) {
                f13 = 0.25f;
            } else {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f13);
            if (z10) {
                f14 = 0.0f;
            } else {
                f14 = 1.0f;
            }
            scaleY2.alpha(f14).setDuration(200L);
        }
        if (this.f43227h1.getVisibility() == 0) {
            ViewPropertyAnimator animate3 = this.f43227h1.animate();
            if (z10) {
                f11 = 0.25f;
            } else {
                f11 = 1.0f;
            }
            ViewPropertyAnimator scaleX3 = animate3.scaleX(f11);
            if (!z10) {
                f21 = 1.0f;
            }
            ViewPropertyAnimator scaleY3 = scaleX3.scaleY(f21);
            if (!z10) {
                f20 = 1.0f;
            }
            scaleY3.alpha(f20).setDuration(200L);
        }
    }

    public final int X0(int i7) {
        int i10 = 0;
        if (i7 >= 0) {
            if (i7 != 1 && (i7 != 0 || this.d2 != 1)) {
                if (i7 == 3 && this.M1 != null) {
                    int L = org.telegram.messenger.g0.L(8.0f);
                    if (!this.f43320s) {
                        i10 = org.telegram.messenger.g0.f24112m;
                    }
                    return this.M1.getAdditionalTop() + L + i10;
                } else if (i7 != 0 && i7 != 4 && i7 != 5) {
                    int L2 = org.telegram.messenger.g0.L(14.0f);
                    if (!this.f43320s) {
                        i10 = org.telegram.messenger.g0.f24112m;
                    }
                    return L2 + i10;
                }
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f);
                if (!this.f43320s) {
                    i10 = org.telegram.messenger.g0.f24112m;
                }
                return L3 + i10;
            }
        }
        return 0;
    }

    public final void X1(org.telegram.messenger.fj r22, org.telegram.tgnet.TLRPC.FileLocation r23, org.telegram.messenger.fc r24, org.telegram.messenger.fc r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.List r28, int r29, org.telegram.ui.wq0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.X1(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.fc, org.telegram.messenger.fc, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.wq0):void");
    }

    public final void X2() {
        long a10;
        if (this.E != null) {
            bn bnVar = this.f43262l4;
            if (bnVar != null) {
                a10 = bnVar.a();
            } else {
                uq0 uq0Var = this.d;
                if (uq0Var != null) {
                    a10 = uq0Var.a();
                } else {
                    return;
                }
            }
            long j3 = a10;
            org.telegram.ui.Components.b5.H(this.E, j3, -1L, 0, false, new qn0(this), null, new org.telegram.ui.Components.y4(-1, -14342875, 520093695, -1, -115203550, 620756991, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Hi, false)), null);
        }
    }

    public final int Y0(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y0(boolean):int");
    }

    public final boolean Y1(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.Y1(android.view.MotionEvent):boolean");
    }

    public final void Y2(boolean z10, boolean z11) {
        Integer num;
        boolean z12;
        Integer num2;
        boolean z13;
        boolean z14;
        float f10;
        int i7;
        float f11;
        int i10;
        int i11;
        float f12;
        boolean z15 = true;
        Integer num3 = 1;
        int i12 = 8;
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (!z11) {
            this.f43297p5.animate().setListener(null).cancel();
            tg.e2 e2Var = this.f43297p5;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            e2Var.setVisibility(i10);
            this.f43297p5.setAlpha(this.Q0.getAlpha());
            this.s5.animate().setListener(null).cancel();
            fi.u2 u2Var = this.s5;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u2Var.setVisibility(i11);
            fi.u2 u2Var2 = this.s5;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            u2Var2.setAlpha(f12);
        } else if (z10 && this.f43297p5.getTag() == null) {
            this.f43297p5.animate().setListener(null).cancel();
            this.s5.animate().setListener(null).cancel();
            if (this.f43297p5.getVisibility() != 0) {
                this.f43297p5.setVisibility(0);
                this.f43297p5.animate().alpha(1.0f).start();
                this.s5.setVisibility(0);
                this.s5.animate().alpha(1.0f).start();
            }
        } else if (!z10 && this.f43297p5.getTag() != null) {
            this.f43297p5.animate().setListener(null).cancel();
            this.f43297p5.animate().alpha(0.0f).setListener(new on(this.f43297p5)).start();
            this.s5.animate().setListener(null).cancel();
            this.s5.animate().alpha(0.0f).setListener(new on(this.s5)).start();
        }
        tg.e2 e2Var2 = this.f43297p5;
        if (z10) {
            num = num3;
        } else {
            num = null;
        }
        e2Var2.setTag(num);
        if (z10 && this.f43334t5.f58123o0 != 1 && !this.f43353v7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11) {
            this.f43334t5.animate().setListener(null).cancel();
            iq0 iq0Var = this.f43334t5;
            if (z12) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            iq0Var.setVisibility(i7);
            iq0 iq0Var2 = this.f43334t5;
            if (z12) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            iq0Var2.setAlpha(f11);
        } else if (z12 && this.f43334t5.getTag() == null) {
            this.f43334t5.animate().setListener(null).cancel();
            if (this.f43334t5.getVisibility() != 0) {
                this.f43334t5.setVisibility(0);
            }
            this.f43334t5.animate().alpha(1.0f).start();
        } else if (!z12 && this.f43334t5.getTag() != null) {
            this.f43334t5.animate().setListener(null).cancel();
            this.f43334t5.animate().alpha(0.0f).setListener(new on(this.f43334t5)).start();
        }
        iq0 iq0Var3 = this.f43334t5;
        if (z12) {
            num2 = num3;
        } else {
            num2 = null;
        }
        iq0Var3.setTag(num2);
        if (z10 && this.f43334t5.f58123o0 == 1 && !this.f43353v7) {
            z13 = true;
        } else {
            z13 = false;
        }
        V2(z13, z11);
        tg.e2 e2Var3 = this.f43297p5;
        if (z10 && this.f43334t5.f58123o0 == 1 && this.f43381y5.f48781u0 && !this.f43351v5.f48781u0 && !this.f43361w5.f48781u0) {
            z14 = true;
        } else {
            z14 = false;
        }
        e2Var3.setOutlineVisible(z14);
        if (!z10 || this.f43334t5.f58123o0 != 1 || this.f43351v5.f48781u0 || this.f43361w5.f48781u0) {
            z15 = false;
        }
        if (!z11) {
            this.f43381y5.animate().setListener(null).cancel();
            iq0 iq0Var4 = this.f43381y5;
            if (z15) {
                i12 = 0;
            }
            iq0Var4.setVisibility(i12);
            iq0 iq0Var5 = this.f43381y5;
            if (z15) {
                f13 = 1.0f;
            }
            iq0Var5.setAlpha(f13);
            iq0 iq0Var6 = this.f43381y5;
            if (z15) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            iq0Var6.setScaleX(f10);
            iq0 iq0Var7 = this.f43381y5;
            if (!z15) {
                f14 = 0.8f;
            }
            iq0Var7.setScaleY(f14);
        } else if (z15 && this.f43381y5.getTag() == null) {
            this.f43381y5.animate().setListener(null).cancel();
            if (this.f43381y5.getVisibility() != 0) {
                this.f43381y5.setVisibility(0);
            }
            org.telegram.messenger.n10.o(this.f43381y5.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f), org.telegram.ui.Components.lr.h, 400L);
        } else if (!z15 && this.f43381y5.getTag() != null) {
            this.f43381y5.animate().setListener(null).cancel();
            org.telegram.messenger.n10.o(this.f43381y5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new on(this.f43381y5)), org.telegram.ui.Components.lr.h, 400L);
        }
        iq0 iq0Var8 = this.f43381y5;
        if (!z15) {
            num3 = null;
        }
        iq0Var8.setTag(num3);
    }

    public final ClippingImageView[] Z0(wq0 wq0Var) {
        int i7;
        if (!org.telegram.messenger.g0.Q1() && wq0Var != null && wq0Var.f53457m != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i7 + 1];
        clippingImageViewArr[0] = this.f43234i0;
        if (i7 != 0) {
            ClippingImageView clippingImageView = wq0Var.f53457m;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(wq0Var.f53458n);
        }
        return clippingImageViewArr;
    }

    public final void Z1() {
        Activity activity;
        if (!org.telegram.messenger.g0.H1(this.E)) {
            if (!org.telegram.messenger.g0.E && (Build.VERSION.SDK_INT < 24 || (activity = this.E) == null || !activity.isInMultiWindowMode())) {
                if (this.G2 != null) {
                    if (!this.P3) {
                        return;
                    }
                } else {
                    dq0 dq0Var = this.f43217g0;
                    if (dq0Var == null || !dq0Var.f36753y || !dq0Var.H) {
                        return;
                    }
                }
                g2();
                return;
            }
            org.telegram.messenger.a8.b("PhotoViewer: onStop in multi-window mode, keep playing");
        }
    }

    public final void Z2(boolean z10) {
        Integer num;
        float f10;
        float f11;
        dq0 dq0Var;
        if (!z10 || this.f43324s3.getTag() == null) {
            if (!z10 && this.f43324s3.getTag() == null) {
                return;
            }
            if (z10 && !this.f43324s3.f37055s && ((dq0Var = this.f43217g0) == null || !dq0Var.f36753y || dq0Var.f36751w.isEmpty())) {
                this.f43340u3 = true;
                return;
            }
            AnimatorSet animatorSet = this.f43332t3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            kp0 kp0Var = this.f43324s3;
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            kp0Var.setTag(num);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43332t3 = animatorSet2;
            kp0 kp0Var2 = this.f43324s3;
            Property property = View.ALPHA;
            float f12 = 0.0f;
            float f13 = 1.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kp0Var2, property, f10);
            kp0 kp0Var3 = this.f43324s3;
            Property property2 = View.SCALE_X;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(kp0Var3, property2, f11);
            kp0 kp0Var4 = this.f43324s3;
            Property property3 = View.SCALE_Y;
            if (!z10) {
                f13 = 0.5f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(kp0Var4, property3, f13);
            kp0 kp0Var5 = this.f43324s3;
            Property property4 = View.TRANSLATION_Y;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(12.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(kp0Var5, property4, f12));
            this.f43332t3.setDuration(380L);
            this.f43332t3.setInterpolator(org.telegram.ui.Components.lr.h);
            this.f43332t3.addListener(new hp0(this, 1));
            this.f43332t3.start();
        }
    }

    @Override
    public final void a1() {
        B1();
    }

    public final void a2(ArrayList arrayList, int i7, long j3, long j10, long j11, uq0 uq0Var) {
        d2((org.telegram.messenger.fj) arrayList.get(i7), null, null, null, arrayList, null, null, i7, uq0Var, null, j3, j10, j11, true, null, null);
    }

    public final void a3(boolean z10, boolean z11) {
        int i7;
        Integer num = null;
        if (!z11) {
            this.R7.animate().setListener(null).cancel();
            FrameLayout frameLayout = this.R7;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            frameLayout.setVisibility(i7);
            this.S7.setTranslationY(0.0f);
            this.R7.setAlpha(this.Q0.getAlpha());
        } else if (z10 && this.R7.getTag() == null) {
            if (this.R7.getVisibility() != 0) {
                this.R7.setVisibility(0);
                this.R7.setAlpha(this.Q0.getAlpha());
                this.S7.setTranslationY(org.telegram.messenger.g0.L(58.0f));
            }
            ObjectAnimator objectAnimator = this.A7;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.A7.cancel();
            }
            xo0 xo0Var = this.S7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xo0Var, View.TRANSLATION_Y, xo0Var.getTranslationY(), 0.0f);
            this.A7 = ofFloat;
            ofFloat.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            this.A7.start();
        } else if (!z10 && this.R7.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.A7;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.A7.cancel();
            }
            xo0 xo0Var2 = this.S7;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xo0Var2, View.TRANSLATION_Y, xo0Var2.getTranslationY(), org.telegram.messenger.g0.L(58.0f));
            this.A7 = ofFloat2;
            ofFloat2.addListener(new on(this.R7));
            this.A7.setDuration(220L);
            this.A7.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            this.A7.start();
        }
        FrameLayout frameLayout2 = this.R7;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
            this.R7.setTranslationY(this.Q0.getTranslationY() - (this.V1.getAlpha() * i5.c.d(46.0f, this.V1.getEditTextHeight(), 0)));
        }
        FrameLayout frameLayout3 = this.R7;
        if (z10) {
            num = 1;
        }
        frameLayout3.setTag(num);
    }

    public final org.telegram.ui.Components.yc b1() {
        uq0 uq0Var = this.d;
        if (uq0Var != null && uq0Var.A()) {
            return this.W1;
        }
        return this.V1;
    }

    public final void b2(ArrayList arrayList, int i7, uq0 uq0Var) {
        d2(null, null, null, null, null, arrayList, null, i7, uq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void b3() {
        org.telegram.ui.Components.f61 f61Var;
        if (this.f43322s1 && (f61Var = this.G2) != null && !f61Var.d0()) {
            if (!this.J4 || !O1() || this.d2 == 1) {
                if (!this.f43310r || this.d2 == 1) {
                    this.G2.B0(0.0f);
                }
                this.H2 = false;
                o3();
            }
        }
    }

    public final void c0(float f10, float f11, float f12, boolean z10) {
        if (this.f43166a6 == f10 && this.X5 == f11 && this.Y5 == f12) {
            return;
        }
        this.R6 = z10;
        this.f43204e6 = f10;
        this.f43186c6 = f11;
        this.f43194d6 = f12;
        this.f43281n6 = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43298p6 = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38716g, 0.0f, 1.0f));
        this.f43298p6.setInterpolator(this.t6);
        this.f43298p6.setDuration(250);
        this.f43298p6.addListener(new hp0(this, 7));
        this.f43298p6.start();
    }

    public final Bitmap.CompressFormat c1() {
        if (this.d2 == 11) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public final void c2(TLRPC.FileLocation fileLocation, org.telegram.messenger.fc fcVar, oq0 oq0Var) {
        d2(null, fileLocation, fcVar, null, null, null, null, 0, oq0Var, null, 0L, 0L, 0L, true, null, null);
    }

    public final void c3(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.c3(int):void");
    }

    public final CharSequence d0() {
        int i7;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (P1() && this.d != null && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43224g7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                CharSequence text = b1().getText();
                CharSequence[] charSequenceArr = {text};
                if (this.f43299p7 && !TextUtils.equals(this.f43308q7, text) && this.d.S(this.P4) != 0 && this.d.H() > 0) {
                    this.f43299p7 = false;
                }
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.U);
                bn bnVar = this.f43262l4;
                if (bnVar != null && ((encryptedChat = bnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList Y = d02.Y(charSequenceArr, z10, true);
                CharSequence charSequence = charSequenceArr[0];
                this.f43308q7 = charSequence;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    efVar.f27846a = charSequence;
                    efVar.f27857n = Y;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    hfVar.I = charSequence;
                    hfVar.f27857n = Y;
                }
                if (text.length() != 0 && !this.d.x(this.P4)) {
                    K2();
                }
                uq0 uq0Var = this.d;
                if (uq0Var != null) {
                    uq0Var.e(text);
                }
                return text;
            }
            return null;
        }
        return null;
    }

    public final int d1(int i7, boolean z10) {
        int measuredHeight;
        boolean z11;
        if (!z10 && !(z11 = this.f43320s)) {
            measuredHeight = (org.telegram.messenger.g0.f24113n - this.f43331t2.bottom) + org.telegram.messenger.g0.f24118q.y;
            if ((i7 == 0 || i7 == 4 || i7 == 5) && this.d2 != 1 && !z11) {
                measuredHeight += org.telegram.messenger.g0.f24112m;
            }
        } else {
            measuredHeight = this.f43208f0.getMeasuredHeight();
        }
        if ((i7 == 0 && this.d2 == 1) || i7 == 1) {
            return measuredHeight - org.telegram.messenger.g0.L(144.0f);
        }
        if (i7 == 2) {
            return measuredHeight - org.telegram.messenger.g0.L(214.0f);
        }
        if (i7 == 3) {
            return measuredHeight - (this.M1.getAdditionalTop() + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.M1.getAdditionalBottom() + org.telegram.messenger.g0.L(48.0f))));
        }
        return measuredHeight;
    }

    public final boolean d2(org.telegram.messenger.fj r17, org.telegram.tgnet.TLRPC.FileLocation r18, org.telegram.messenger.fc r19, org.telegram.messenger.fc r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24, org.telegram.ui.uq0 r25, org.telegram.ui.bn r26, long r27, long r29, long r31, boolean r33, org.telegram.ui.rq0 r34, java.lang.Integer r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.d2(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.fc, org.telegram.messenger.fc, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.uq0, org.telegram.ui.bn, long, long, long, boolean, org.telegram.ui.rq0, java.lang.Integer):boolean");
    }

    public final void d3(int i7, boolean z10) {
        if (this.T4 != null) {
            m2(false);
            org.telegram.messenger.w7.G(this.U).f(this.T4.F0());
        } else if (this.f43239i5 != null) {
            TLObject d = this.f43248j7.d(this.P4);
            if (d instanceof TLRPC.Document) {
                m2(false);
                org.telegram.messenger.w7.G(this.U).f((TLRPC.Document) d);
            }
        }
        org.telegram.ui.Components.w20 w20Var = this.f43267m1;
        if (w20Var != null) {
            w20Var.setAnimateBackground(true);
        }
        this.Y2 = false;
        A2(this.P4 + i7, z10, true, false);
        if (P2(this.T4) || O2(this.P4)) {
            this.Y2 = true;
            S1(true);
            u0(0, true);
        }
        s0();
        try {
            d1.f.b(0);
            if (wf.b.J().M()) {
                wf.b.J().Q(i1());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int r23, int r24, java.lang.Object... r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(Canvas canvas, int i7, int i10, int i11, int i12, float f10, og.g gVar, org.telegram.messenger.we weVar) {
        float f11;
        float f12;
        int i13;
        float f13;
        float f14;
        int i14;
        float f15;
        float f16;
        float f17 = i7;
        int i15 = i11;
        float f18 = i15;
        float f19 = f17 / f18;
        float f20 = i10;
        int i16 = i12;
        float f21 = i16;
        float f22 = f20 / f21;
        float min = Math.min(f19, f22);
        int i17 = gVar.f21856i;
        if (i17 != 90 && i17 != 270) {
            i16 = i15;
            i15 = i16;
        }
        int i18 = this.d2;
        if (i18 != 1 && (this.f43341u4 == 3 || this.f43289o6 == 3)) {
            f12 = 1.0f;
            f11 = f18;
        } else if (this.f43298p6 != null && (i13 = this.f43289o6) != -1) {
            int i19 = this.f43341u4;
            f11 = f18;
            if (i19 != 1 && i13 != 1 && ((i19 != 2 && i19 != 3) || i13 != -1)) {
                if (i13 == 0) {
                    f12 = this.f43264l6;
                } else {
                    f12 = 1.0f - this.f43264l6;
                }
            }
            f12 = 1.0f;
        } else {
            f11 = f18;
            int i20 = this.f43341u4;
            if (i20 == 2 || i20 == 3) {
                f12 = 0.0f;
            }
            f12 = 1.0f;
        }
        float f23 = gVar.f21857j;
        float f24 = gVar.f21858k;
        float f25 = i16;
        float f26 = 1.0f - f12;
        int B = (int) com.google.android.gms.internal.vision.e2.B(1.0f - f23, f26, f23, f25);
        float f27 = i15;
        int i21 = (int) ((((1.0f - f24) * f26) + f24) * f27);
        float f28 = B;
        float f29 = f17 / f28;
        float f30 = i21;
        if (f29 * f30 > f20) {
            f29 = f20 / f30;
        }
        if (i18 != 1 && ((this.f43341u4 != 1 || this.f43289o6 == 0) && weVar != null)) {
            float f31 = f28 * f29;
            float f32 = f30 * f29;
            if (f19 * f21 <= f20) {
                f22 = f19;
            }
            float z10 = com.google.android.gms.internal.vision.e2.z((f11 * f22) / f10, f31, f26, f31);
            float z11 = com.google.android.gms.internal.vision.e2.z((f21 * f22) / f10, f32, f26, f32);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        int i22 = this.d2;
        if (i22 == 1 || gVar.f21850a) {
            int i23 = this.f43341u4;
            if (i23 != 1 && i22 != 1) {
                if (weVar != null) {
                    f15 = weVar.f27676c;
                    f16 = 1.0f;
                } else {
                    f15 = 1.0f;
                    f16 = 1.0f;
                }
                f13 = ((f29 / min) / com.google.android.gms.internal.vision.e2.z(f15, f16, f26, f16)) * f15;
            } else {
                float z12 = gVar.f21854f / com.google.android.gms.internal.vision.e2.z(gVar.f21859l, 1.0f, f26, 1.0f);
                float f33 = f17 / f25;
                if (f33 * f27 > f20) {
                    f33 = f20 / f27;
                }
                float f34 = (f33 / min) * z12;
                if (i22 == 1) {
                    if (i23 != 3 && (i14 = this.f43289o6) != 3) {
                        if (i14 == 0) {
                            f14 = gVar.f21860m;
                        }
                    } else {
                        f14 = ((gVar.f21860m - 1.0f) * f26) + 1.0f;
                    }
                    f34 /= f14;
                }
                f13 = f34;
            }
            float f35 = f13;
            canvas.translate(gVar.d * f12, gVar.f21853e * f12);
            canvas.scale(f35, f35);
            canvas.translate(com.google.android.gms.internal.vision.e2.D(gVar.f21851b, f25, min, f12), com.google.android.gms.internal.vision.e2.D(gVar.f21852c, f27, min, f12));
            float f36 = gVar.f21855g + i17;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            if (this.d2 == 1 && (this.f43341u4 == 3 || this.f43289o6 == 3)) {
                canvas.rotate(f36);
            } else {
                canvas.rotate(f36 * f12);
            }
        }
        int[] iArr = this.N7;
        iArr[0] = B;
        iArr[1] = i21;
    }

    public final int e1() {
        return d1(this.f43341u4, false);
    }

    public final boolean e2(org.telegram.messenger.fj fjVar, bn bnVar, long j3, long j10, long j11, oq0 oq0Var) {
        return d2(fjVar, null, null, null, null, null, null, 0, oq0Var, bnVar, j3, j10, j11, true, null, null);
    }

    public final void e3() {
        float f10;
        boolean z10;
        int i7;
        vp0 vp0Var;
        int i10;
        vp0 vp0Var2;
        this.f43307q6 = null;
        this.Q0.setVisibility(8);
        this.T0.setVisibility(8);
        this.f43284o0.setVisibility(8);
        this.f43209f1.setVisibility(8);
        this.f43218g1.setVisibility(8);
        this.f43227h1.setVisibility(8);
        org.telegram.ui.Components.qd0 qd0Var = this.D1;
        if (qd0Var != null) {
            qd0Var.setVisibility(4);
        }
        this.f43293p1.setVisibility(8);
        this.f43293p1.setAlpha(0.0f);
        this.f43293p1.setTranslationY(-org.telegram.messenger.g0.L(10.0f));
        this.P0.setRotationX(0.0f);
        this.f43293p1.setEnabled(false);
        this.L = false;
        if (this.f43244j2) {
            this.R1.setVisibility(4);
        }
        int i11 = this.d2;
        if (i11 == 0 || i11 == 4 || ((i11 == 2 || i11 == 5) && this.f43224g7.size() > 1)) {
            this.O0.setVisibility(8);
            this.P0.setVisibility(8);
            q3();
        }
        U2(false, true);
        Y2(false, true);
        Bitmap n10 = this.C4.n();
        float f11 = this.f43166a6;
        if (this.d2 == 11) {
            this.f43240i6 = this.Y5;
            this.f43232h6 = this.X5;
            this.f43247j6 = f11;
            this.f43256k6 = this.f43176b6;
            this.f43214f6 = 0.0f;
        }
        nq0 nq0Var = this.X4;
        if (n10 != null) {
            int q10 = this.C4.q();
            int o4 = this.C4.o();
            if (this.d2 == 1) {
                float L = org.telegram.messenger.g0.L(12.0f);
                this.f43194d6 = L;
                f10 = 0.0f;
                if (this.M1 != null) {
                    this.f43194d6 = (vp0Var2.getAdditionalTop() / 2.0f) + L;
                }
                int i12 = this.E1.f21856i;
                if (i12 == 90 || i12 == 270) {
                    i10 = q10;
                    q10 = o4;
                    float f12 = q10;
                    float f13 = i10;
                    this.f43204e6 = p2(false) * (Math.min(g1(3) / f12, d1(3, false) / f13) / Math.min(g1(this.f43341u4) / f12, e1() / f13));
                    Rect rect = this.f43331t2;
                    this.f43186c6 = (rect.left / 2) - (rect.right / 2);
                    this.f43281n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i10 = o4;
                float f122 = q10;
                float f132 = i10;
                this.f43204e6 = p2(false) * (Math.min(g1(3) / f122, d1(3, false) / f132) / Math.min(g1(this.f43341u4) / f122, e1() / f132));
                Rect rect2 = this.f43331t2;
                this.f43186c6 = (rect2.left / 2) - (rect2.right / 2);
                this.f43281n6 = System.currentTimeMillis();
                this.R6 = true;
            } else {
                f10 = 0.0f;
                int i13 = -org.telegram.messenger.g0.L(44.0f);
                if (!this.f43320s) {
                    i7 = org.telegram.messenger.g0.f24112m / 2;
                } else {
                    i7 = 0;
                }
                float f14 = i13 + i7;
                this.f43194d6 = f14;
                if (this.M1 != null) {
                    float additionalTop = (vp0Var.getAdditionalTop() / 2.0f) + f14;
                    this.f43194d6 = additionalTop;
                    this.f43194d6 = additionalTop - (this.M1.getAdditionalBottom() / 2.0f);
                }
                org.telegram.messenger.we weVar = nq0Var.f50266c;
                if (weVar != null) {
                    int i14 = weVar.f27681k;
                    if (i14 == 90 || i14 == 270) {
                        o4 = q10;
                        q10 = o4;
                    }
                    q10 = (int) (q10 * weVar.f27677e);
                    i10 = (int) (o4 * weVar.f27678f);
                    float f1222 = q10;
                    float f1322 = i10;
                    this.f43204e6 = p2(false) * (Math.min(g1(3) / f1222, d1(3, false) / f1322) / Math.min(g1(this.f43341u4) / f1222, e1() / f1322));
                    Rect rect22 = this.f43331t2;
                    this.f43186c6 = (rect22.left / 2) - (rect22.right / 2);
                    this.f43281n6 = System.currentTimeMillis();
                    this.R6 = true;
                }
                i10 = o4;
                float f12222 = q10;
                float f13222 = i10;
                this.f43204e6 = p2(false) * (Math.min(g1(3) / f12222, d1(3, false) / f13222) / Math.min(g1(this.f43341u4) / f12222, e1() / f13222));
                Rect rect222 = this.f43331t2;
                this.f43186c6 = (rect222.left / 2) - (rect222.right / 2);
                this.f43281n6 = System.currentTimeMillis();
                this.R6 = true;
            }
        } else {
            f10 = 0.0f;
        }
        vp0 vp0Var3 = this.M1;
        if (vp0Var3 != null) {
            if (this.d2 == 11 && (nq0Var == null || nq0Var.f50266c == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            vp0Var3.setDrawShadow(z10);
        }
        this.f43226h0.setClipChildren(true);
        this.f43250k0.setVisibility(4);
        this.f43298p6 = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(org.telegram.messenger.g0.L(126.0f), f10);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-org.telegram.messenger.g0.L(12.0f), f10);
        ofFloat.addUpdateListener(new gn0(this, 6));
        ofFloat2.addUpdateListener(new gn0(this, 7));
        this.f43298p6.playTogether(ObjectAnimator.ofFloat(this, org.telegram.ui.Components.q6.f38716g, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.M1.m0(true);
        this.f43298p6.setDuration(200L);
        this.f43298p6.addListener(new hp0(this, 3));
        this.f43298p6.start();
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f0():void");
    }

    public final int f1() {
        return g1(this.f43341u4);
    }

    public final void f2(ArrayList arrayList, int i7, int i10, boolean z10, uq0 uq0Var, bn bnVar) {
        boolean z11;
        org.telegram.ui.Components.n6 n6Var;
        this.f43236i2 = z10;
        oi.u1 u1Var = this.T0;
        int i11 = 0;
        if (u1Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) u1Var.getLayoutParams();
            if (i10 != 4 && i10 != 5) {
                if (i10 != 13 && i10 != 14 && i10 != 1 && i10 != 3 && i10 != 10 && i10 != 11) {
                    this.T0.setResourceId(2131232696);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                } else {
                    this.T0.setResourceId(2131231195);
                    this.T0.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, 0);
                    layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
                }
            } else {
                this.T0.setResourceId(2131232696);
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(1.0f);
            }
            this.T0.setLayoutParams(layoutParams);
        }
        if (i10 != 11 && this.f43297p5 != null) {
            this.f43353v7 = false;
            ImageView imageView = this.f43190d1;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            iq0 iq0Var = this.f43381y5;
            if (iq0Var != null) {
                iq0Var.m(false, false);
            }
            this.f43297p5.b();
            ArrayList arrayList2 = this.f43316r5;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z12 = this.f43197e;
        BackgroundDrawable backgroundDrawable = this.M0;
        if (z12 && this.d2 != i10 && i10 == 1) {
            this.d2 = i10;
            this.f43348v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = uq0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f43302q1.f();
            this.f43248j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f43197e = true;
            this.f43207f = true;
            n3(false, false);
            this.f43268m2 = false;
            B0();
            h3(false, false);
            this.f43201e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            Q1();
            backgroundDrawable.setAlpha(255);
            this.f43208f0.setAlpha(1.0f);
            X1(null, null, null, null, null, null, arrayList, i7, null);
            C1();
            x2();
        } else if (z12 && this.d2 != i10 && i10 == 11) {
            this.d2 = i10;
            this.f43348v2 = false;
            this.N.c("");
            this.N.a("", false);
            this.d = uq0Var;
            this.I5 = 0L;
            this.E5 = 0L;
            this.f43302q1.f();
            this.f43248j7 = null;
            if (this.U6 == null) {
                this.U6 = VelocityTracker.obtain();
            }
            this.f43197e = true;
            this.f43207f = true;
            n3(false, false);
            this.f43201e3 = 0.0f;
            this.V2 = false;
            this.U2 = false;
            Q1();
            backgroundDrawable.setAlpha(255);
            this.f43208f0.setAlpha(1.0f);
            X1(null, null, null, null, null, null, arrayList, i7, null);
        } else {
            this.d2 = i10;
            if (i10 == 12) {
                this.d2 = 0;
                this.f43200e2 = true;
            }
            int i12 = this.d2;
            if (i12 == 14) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43219g2 = z11;
            if (i12 == 13 || z11) {
                this.d2 = 0;
                this.f43210f2 = true;
            }
            this.f43159a.a(z11, false);
            if (this.d2 == 11) {
                this.f43250k0.setBackgroundColor(-16777216);
            }
            tq0 tq0Var = this.N;
            if (tq0Var != null && (n6Var = tq0Var.d) != null) {
                if (this.f43210f2) {
                    i11 = 8;
                }
                n6Var.setVisibility(i11);
            }
            d2(null, null, null, null, null, null, arrayList, i7, uq0Var, bnVar, 0L, 0L, 0L, true, null, null);
        }
    }

    public final void f3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.f3():void");
    }

    public final void g0(android.graphics.Bitmap r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.g0(android.graphics.Bitmap):void");
    }

    public final int g1(int i7) {
        int L;
        int width = this.f43208f0.getWidth();
        if (i7 != 1 && (i7 != 0 || this.d2 != 1)) {
            if (i7 != 0 && i7 != 4 && i7 != 5 && i7 != 3) {
                L = org.telegram.messenger.g0.L(28.0f);
            } else {
                return width;
            }
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        return width - L;
    }

    public final void g2() {
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null) {
            f61Var.g0();
            return;
        }
        dq0 dq0Var = this.f43217g0;
        if (dq0Var != null) {
            dq0Var.f();
        }
    }

    public final void g3() {
        AtomicInteger atomicInteger;
        long a10;
        boolean m10;
        f6.q e10;
        f6.q e11;
        float f10;
        int i7;
        f6.q e12;
        boolean z10;
        if (!P1()) {
            return;
        }
        this.O8 = true;
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null) {
            if (!d1.f.u() && !this.f43310r) {
                z10 = false;
            } else {
                z10 = true;
            }
            f61Var.t0(z10);
        }
        if (this.G2 != null && d1.f.u() && ((atomicInteger = d1.f.f7615b) == null || atomicInteger.get() <= 0)) {
            h6.h e13 = d1.f.e();
            if (e13 == null) {
                a10 = -1;
            } else {
                a10 = e13.a();
            }
            if (a10 >= 0 && Math.abs(this.G2.S() - a10) > 1000) {
                this.G2.p0(a10);
            }
            h6.h e14 = d1.f.e();
            if (e14 == null) {
                m10 = false;
            } else if (d1.f.f7614a == 0) {
                m10 = !e14.l();
            } else {
                m10 = e14.m();
            }
            if (m10) {
                this.G2.h0();
            } else {
                this.G2.g0();
            }
            if (this.F != null) {
                float g10 = d1.f.g();
                h6.h e15 = d1.f.e();
                float f11 = 0.5f;
                if (e15 == null || (e11 = e15.e()) == null) {
                    f10 = 0.5f;
                } else {
                    f10 = (float) e11.f11446r;
                }
                if (Math.abs(g10 - f10) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.F.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    if (Build.VERSION.SDK_INT >= 28) {
                        i7 = audioManager.getStreamMinVolume(3);
                    } else {
                        i7 = 0;
                    }
                    float f12 = streamMaxVolume - i7;
                    h6.h e16 = d1.f.e();
                    if (e16 != null && (e12 = e16.e()) != null) {
                        f11 = (float) e12.f11446r;
                    }
                    int i10 = i7 + ((int) (f11 * f12));
                    if (i10 != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, i10, 1);
                    }
                }
            }
            h6.h e17 = d1.f.e();
            float f13 = 1.0f;
            if (e17 != null && (e10 = e17.e()) != null) {
                f13 = (float) e10.d;
            }
            w0(true, false, f13);
        }
        xq xqVar = this.f43366x0;
        if (xqVar != null) {
            xqVar.a(d1.f.u());
        }
        this.O8 = false;
    }

    public float getAnimationValue() {
        return this.f43264l6;
    }

    public final void h0(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        org.telegram.messenger.we weVar;
        if (this.f43298p6 != null) {
            f14 = org.telegram.messenger.g0.T1(0.0f, this.f43223g6, this.f43264l6);
            f10 = org.telegram.messenger.g0.T1(this.f43166a6, this.f43204e6, this.f43264l6);
            f11 = org.telegram.messenger.g0.T1(this.f43176b6, this.f43214f6, this.f43264l6);
            f12 = org.telegram.messenger.g0.T1(this.Y5, this.f43194d6, this.f43264l6);
            f13 = org.telegram.messenger.g0.T1(this.X5, this.f43186c6, this.f43264l6);
        } else {
            f10 = this.f43166a6;
            f11 = this.f43176b6;
            f12 = this.Y5;
            f13 = this.X5;
            if (this.f43281n6 != 0) {
                f13 = this.f43186c6;
                f12 = this.f43194d6;
                f10 = this.f43204e6;
            }
            f14 = 0.0f;
        }
        int g12 = g1(this.f43341u4);
        int e12 = e1();
        canvas.translate(W0(this.f43341u4), X0(this.f43341u4));
        canvas.translate(f13, f12 + 0.0f);
        canvas.scale(f10, f10);
        canvas.rotate(f11);
        int q10 = this.C4.q();
        int o4 = this.C4.o();
        float f19 = g12;
        float f20 = q10;
        float f21 = f19 / f20;
        float f22 = e12;
        float f23 = o4;
        float f24 = f22 / f23;
        float min = Math.min(f21, f24);
        og.g gVar = this.E1;
        int i7 = gVar.f21856i;
        if (i7 != 90 && i7 != 270) {
            o4 = q10;
            q10 = o4;
        }
        float f25 = gVar.f21857j;
        float f26 = gVar.f21858k;
        float f27 = o4;
        float f28 = q10;
        float f29 = f10;
        float f30 = (int) ((((1.0f - f25) * 0.0f) + f25) * f27);
        float f31 = f19 / f30;
        float f32 = (int) ((((1.0f - f26) * 0.0f) + f26) * f28);
        if (f31 * f32 > f22) {
            f31 = f22 / f32;
        }
        int i10 = this.d2;
        float f33 = f31;
        nq0 nq0Var = this.X4;
        if (i10 != 1 && ((this.f43341u4 != 1 || this.f43289o6 == 0) && nq0Var.f50266c != null)) {
            float f34 = f30 * f33;
            float f35 = f32 * f33;
            if (f21 * f23 > f22) {
                f21 = f24;
            }
            float z10 = com.google.android.gms.internal.vision.e2.z((f20 * f21) / f29, f34, 0.0f, f34);
            float z11 = com.google.android.gms.internal.vision.e2.z((f23 * f21) / f29, f35, 0.0f, f35);
            canvas.clipRect((-z10) / 2.0f, (-z11) / 2.0f, z10 / 2.0f, z11 / 2.0f);
        }
        if (this.d2 == 1 || gVar.f21850a) {
            TextureView textureView = this.C2;
            if (textureView != null) {
                org.telegram.messenger.we weVar2 = nq0Var.f50266c;
                if (weVar2 != null && weVar2.f27682l) {
                    f17 = -1.0f;
                } else {
                    f17 = 1.0f;
                }
                textureView.setScaleX(f17);
                pq0 pq0Var = this.F2;
                if (pq0Var != null) {
                    pq0Var.setScaleX(this.C2.getScaleX());
                }
            }
            org.telegram.messenger.we weVar3 = nq0Var.f50266c;
            if (weVar3 != null) {
                f15 = weVar3.f27676c;
                f16 = 1.0f;
            } else {
                f15 = 1.0f;
                f16 = 1.0f;
            }
            float z12 = ((f33 / min) / com.google.android.gms.internal.vision.e2.z(f15, f16, 0.0f, f16)) * f15;
            canvas.translate(gVar.d * f16, gVar.f21853e * f16);
            canvas.scale(z12, z12);
            canvas.translate(com.google.android.gms.internal.vision.e2.D(gVar.f21851b, f27, min, f16), com.google.android.gms.internal.vision.e2.D(gVar.f21852c, f28, min, f16));
            float f36 = gVar.f21855g + i7;
            if (f36 > 180.0f) {
                f36 -= 360.0f;
            }
            canvas.rotate(f36);
        }
        if (!this.f43224g7.isEmpty() && (weVar = nq0Var.f50266c) != null && weVar.f27682l) {
            f18 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        } else {
            f18 = 1.0f;
        }
        if (f14 > 0.0f) {
            canvas.scale(f18 - (2.0f * f14), f18);
            canvas.skew(0.0f, org.telegram.messenger.f3.A(f18, f14, 4.0f * f14, 0.25f));
        }
    }

    public final float h1(boolean z10) {
        int q10;
        int o4;
        int i7;
        ImageReceiver imageReceiver = this.C4;
        if (z10) {
            q10 = imageReceiver.o();
        } else {
            q10 = imageReceiver.q();
        }
        if (z10) {
            o4 = this.C4.q();
        } else {
            o4 = this.C4.o();
        }
        if (!this.f43320s) {
            i7 = org.telegram.messenger.g0.f24112m;
        } else {
            i7 = 0;
        }
        float min = Math.min(this.D1.getMeasuredWidth(), (this.D1.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - i7) - (org.telegram.messenger.g0.L(16.0f) * 2);
        return Math.max(min / q10, min / o4);
    }

    public final void h2() {
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null) {
            f61Var.h0();
            return;
        }
        dq0 dq0Var = this.f43217g0;
        if (dq0Var != null) {
            dq0Var.g();
        }
    }

    public final void h3(boolean z10, boolean z11) {
        i3(z10, z11, gq0.f48079e);
    }

    public final Size i0() {
        float f10;
        int i7;
        int round;
        int i10;
        if (this.Z7 == 1) {
            return new Size(this.f43188c8, this.f43196d8);
        }
        int i11 = this.Y7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    f10 = 1920.0f;
                } else {
                    f10 = 1280.0f;
                }
            } else {
                f10 = 854.0f;
            }
        } else {
            f10 = 480.0f;
        }
        if (this.f43188c8 > this.f43196d8) {
            i7 = this.f43188c8;
        } else {
            i7 = this.f43196d8;
        }
        float f11 = f10 / i7;
        if (this.Y7 == this.Z7 - 1 && f11 >= 1.0f) {
            i10 = this.f43188c8;
            round = this.f43196d8;
        } else {
            int round2 = Math.round((this.f43188c8 * f11) / 2.0f) * 2;
            round = Math.round((this.f43196d8 * f11) / 2.0f) * 2;
            i10 = round2;
        }
        int i12 = i10 % 4;
        if (i12 != 0 || round % 4 != 0) {
            i10 = (i10 - i12) - (round % 4);
        }
        return new Size(i10, round);
    }

    public final oi.y3 i1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.i1():oi.y3");
    }

    public final void i3(boolean r17, boolean r18, org.telegram.ui.gq0 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.i3(boolean, boolean, org.telegram.ui.gq0):void");
    }

    public final boolean j0(MotionEvent motionEvent) {
        boolean z10;
        dq0 dq0Var;
        if (this.G2 != null || ((dq0Var = this.f43217g0) != null && dq0Var.f36753y)) {
            if (motionEvent.getX() >= (g1(this.f43341u4) / 3) * 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            long k12 = k1();
            long x12 = x1();
            if (k12 != -9223372036854775807L && x12 > 15000 && (!z10 || x12 - k12 > 10000)) {
                return true;
            }
        }
        return false;
    }

    public final org.telegram.messenger.e20 j1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j1():org.telegram.messenger.e20");
    }

    public final void j2(java.util.ArrayList r18, android.net.Uri r19, boolean r20, boolean r21, org.telegram.messenger.ff r22, boolean r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.j2(java.util.ArrayList, android.net.Uri, boolean, boolean, org.telegram.messenger.ff, boolean, long):void");
    }

    public final void j3(boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = org.telegram.messenger.g0.N(24.0f);
        di.n4 n4Var = this.Q0;
        Property property = View.ALPHA;
        float f18 = 1.0f;
        float f19 = 0.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(n4Var, property, f10));
        di.n4 n4Var2 = this.Q0;
        Property property2 = View.TRANSLATION_Y;
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(n4Var2, property2, f11));
        tg.e2 e2Var = this.f43297p5;
        if (e2Var != null) {
            if (z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(e2Var, property, f17));
        }
        if (this.f43297p5 != null) {
            fi.u2 u2Var = this.s5;
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(u2Var, property, f16));
        }
        oi.u1 u1Var = this.T0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(u1Var, property, f12));
        oi.u1 u1Var2 = this.T0;
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = N;
        }
        arrayList.add(ObjectAnimator.ofFloat(u1Var2, property2, f13));
        int i7 = this.d2;
        if (i7 == 0 || i7 == 4) {
            CheckBox checkBox = this.O0;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f14));
            CheckBox checkBox2 = this.O0;
            if (z10) {
                f15 = 0.0f;
            } else {
                f15 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f15));
            CounterView counterView = this.P0;
            if (!z10) {
                f18 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f18));
            CounterView counterView2 = this.P0;
            if (!z10) {
                f19 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f19));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (!z10 && F1()) {
            x0(true);
            hi.g gVar = this.V1.f15048f;
            if (gVar.f41789e) {
                gVar.k(true);
            }
            hi.g gVar2 = this.W1.f15048f;
            if (gVar2.f41789e) {
                gVar2.k(true);
            }
            this.V1.f15048f.d();
            this.W1.f15048f.d();
        }
    }

    public final boolean k0() {
        bn bnVar = this.f43262l4;
        if (bnVar != null) {
            if (bnVar.f45992f == null) {
                TLRPC.Chat chat = bnVar.f45978e;
                if (chat != null && !org.telegram.messenger.v3.r0(chat)) {
                    if (org.telegram.messenger.v3.p(this.f43262l4.f45978e) || org.telegram.messenger.v3.u(this.f43262l4.f45978e)) {
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

    public final long k1() {
        dq0 dq0Var = this.f43217g0;
        if (dq0Var != null && dq0Var.f36753y) {
            return dq0Var.getCurrentPosition();
        }
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var == null) {
            return 0L;
        }
        return f61Var.S();
    }

    public final void k2() {
        tg.e2 e2Var = this.f43297p5;
        if (e2Var != null && this.d2 == 11) {
            if (this.f43353v7) {
                e2Var.b();
            } else {
                e2Var.m(this.C4.n(), this.C4.V, g1(this.f43341u4), e1(), new on0(this, 0));
            }
        }
    }

    public final void k3(boolean z10, boolean z11) {
        float f10;
        hn0 hn0Var = this.f43375y;
        org.telegram.messenger.g0.r(hn0Var);
        int i7 = 0;
        if (z11) {
            l3(z10);
            if (z10) {
                AnimatorSet animatorSet = this.f43365x;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f43365x = null;
                }
                if (this.R3) {
                    this.R3 = false;
                    l3(true);
                    return;
                }
                org.telegram.messenger.g0.h3(hn0Var, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.f43365x;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                l3(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.f43365x;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.f43365x = null;
        }
        yc ycVar = this.Y0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ycVar.setAlpha(f10);
        yc ycVar2 = this.Y0;
        if (!z10) {
            i7 = 4;
        }
        ycVar2.setVisibility(i7);
    }

    public final void l0() {
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
        org.telegram.ui.Components.qd0 qd0Var = this.D1;
        if (qd0Var != null && (animatorSet = qd0Var.f38769s) != null) {
            animatorSet.cancel();
            qd0Var.f38769s = null;
            qd0Var.f38766f = false;
        }
    }

    public final TLObject l1(int i7, long[] jArr) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.f43205e7;
        if (!arrayList.isEmpty()) {
            if (i7 >= arrayList.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((org.telegram.messenger.yv) arrayList.get(i7)).f28188b.size;
            }
            return (TLObject) arrayList.get(i7);
        }
        ArrayList arrayList2 = this.f43167a7;
        if (!arrayList2.isEmpty()) {
            if (i7 >= arrayList2.size()) {
                return null;
            }
            if (jArr != null) {
                ArrayList arrayList3 = this.f43187c7;
                if (arrayList3.get(i7) != null) {
                    jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                }
            }
            ArrayList arrayList4 = this.f43177b7;
            if (arrayList4.get(i7) == null) {
                return null;
            }
            return ((org.telegram.messenger.fc) arrayList4.get(i7)).f23868f;
        }
        ArrayList arrayList5 = this.Y6;
        if (arrayList5.isEmpty() || i7 >= arrayList5.size()) {
            return null;
        }
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList5.get(i7);
        TLRPC.Message message = fjVar.f23965k;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f23985p0, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w10 != null) {
                if (jArr != null) {
                    long j3 = w10.size;
                    jArr[0] = j3;
                    if (j3 == 0) {
                        jArr[0] = -1;
                    }
                }
                return w10;
            } else if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = fjVar.f23921a1;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j10 = w11.size;
                        jArr[0] = j10;
                        if (j10 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w11;
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, true);
                    if (w12 != null) {
                        if (jArr != null) {
                            long j11 = w12.size;
                            jArr[0] = j11;
                            if (j11 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return w12;
                    } else if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.fj.n1(fjVar.f23965k).photo != null) || ((org.telegram.messenger.fj.n1(fjVar.f23965k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(fjVar.f23965k).webpage != null)) {
                TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(fjVar.f23985p0, org.telegram.messenger.g0.Z0(true), false, null, true);
                if (w13 != null) {
                    if (jArr != null) {
                        long j12 = w13.size;
                        jArr[0] = j12;
                        if (j12 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w13;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (org.telegram.messenger.fj.n1(fjVar.f23965k) instanceof TLRPC.TL_messageMediaInvoice) {
                return ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.fj.n1(fjVar.f23965k)).photo;
            } else {
                if (fjVar.F0() != null && org.telegram.messenger.fj.W2(fjVar.F0())) {
                    TLRPC.PhotoSize w14 = org.telegram.messenger.w7.w(fjVar.F0().thumbs, 90, false, null, false);
                    if (jArr != null) {
                        long j13 = w14.size;
                        jArr[0] = j13;
                        if (j13 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return w14;
                }
            }
        }
        return null;
    }

    public final void l2(String str, long j3, boolean z10, float f10, float f11, int i7, long j10) {
        boolean z11;
        int parseInt;
        if (this.f43374x8 != null) {
            Utilities.f22779e.a(this.f43374x8);
            this.f43374x8 = null;
        }
        xo0 xo0Var = this.S7;
        xo0Var.a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        xo0Var.E = mediaMetadataRetriever;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        boolean z12 = true;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xo0Var.f38296x = z11;
        xo0Var.d = f10;
        xo0Var.f38288e = f11;
        float f12 = xo0Var.f38294s;
        if (f12 < f10) {
            xo0Var.f38294s = f10;
        } else if (f12 > f11) {
            xo0Var.f38294s = f11;
        }
        try {
            if (i10 > 0) {
                File file = new File(str);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                xo0Var.f38297y = open;
                xo0Var.E.setDataSource(open.getFileDescriptor(), j3, file.length() - j3);
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
            String extractMetadata = xo0Var.E.extractMetadata(9);
            if (extractMetadata != null) {
                xo0Var.f38281a = Long.parseLong(extractMetadata);
            }
            String extractMetadata2 = xo0Var.E.extractMetadata(18);
            if (extractMetadata2 != null) {
                xo0Var.f38283b = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = xo0Var.E.extractMetadata(19);
            if (extractMetadata3 != null) {
                xo0Var.f38285c = Integer.parseInt(extractMetadata3);
            }
            String extractMetadata4 = xo0Var.E.extractMetadata(24);
            if (extractMetadata4 != null && ((parseInt = Integer.parseInt(extractMetadata4)) == 90 || parseInt == 270)) {
                int i11 = xo0Var.f38283b;
                xo0Var.f38283b = xo0Var.f38285c;
                xo0Var.f38285c = i11;
            }
            if (xo0Var.f38296x) {
                xo0Var.f38290f = (float) ((j10 / 1000.0d) / xo0Var.f38281a);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        xo0Var.invalidate();
        this.f43384y8 = null;
        if (!z10 && this.d2 != 1) {
            z12 = false;
        }
        this.f43310r = z12;
        this.Z7 = -1;
        this.f43178b8 = 0;
        this.f43249j8 = 25;
        this.f43345u8 = new File(str).length();
        org.telegram.messenger.q5 q5Var = Utilities.f22779e;
        eq0 eq0Var = new eq0(this, str, j3, i7);
        this.f43374x8 = eq0Var;
        q5Var.c(eq0Var);
    }

    public final void l3(boolean z10) {
        float f10;
        if (z10) {
            this.Y0.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.f43365x = animatorSet;
        yc ycVar = this.Y0;
        Property property = View.ALPHA;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet.playTogether(ObjectAnimator.ofFloat(ycVar, property, f10));
        this.f43365x.setDuration(200L);
        this.f43365x.addListener(new op0(this, z10, 1));
        this.f43365x.start();
    }

    public final void m0() {
        if (this.d2 == 11) {
            iq0 iq0Var = this.f43334t5;
            if (iq0Var.f58123o0 == 2) {
                iq0Var.setCutOutState(true);
                V2(true, true);
                this.f43297p5.f();
                this.f43208f0.invalidate();
            }
        }
    }

    public final void m2(boolean z10) {
        int i7 = 0;
        this.E2 = false;
        wi.n nVar = this.P8;
        if (nVar != null && nVar.f59989c == 0) {
            this.P8 = null;
            nVar.f();
        }
        org.telegram.ui.Components.f61 f61Var = this.G2;
        HashMap hashMap = f43153b9;
        zo0 zo0Var = this.f43378y2;
        if (f61Var != null) {
            n0();
            org.telegram.messenger.g0.r(this.f43368x2);
            org.telegram.messenger.g0.r(zo0Var);
            if (this.f43183c3 != null) {
                float S = ((float) this.G2.S()) / ((float) this.G2.U());
                String str = this.f43183c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str, new zq0(S));
                org.telegram.messenger.fj fjVar = this.T4;
                if (fjVar != null) {
                    fjVar.f23973l3 = Float.valueOf(S);
                }
            }
            this.G2.m0();
            this.G2 = null;
        } else {
            this.X2 = false;
        }
        if (this.f43217g0 != null) {
            org.telegram.messenger.g0.r(zo0Var);
            if (this.f43183c3 != null) {
                float k12 = ((float) k1()) / ((float) x1());
                String str2 = this.f43183c3;
                SystemClock.elapsedRealtime();
                hashMap.put(str2, new zq0(k12));
                org.telegram.messenger.fj fjVar2 = this.T4;
                if (fjVar2 != null) {
                    fjVar2.f23973l3 = Float.valueOf(k12);
                }
            }
        }
        org.telegram.ui.Components.au auVar = this.W3;
        if (auVar != null) {
            auVar.disable();
            this.W3 = null;
        }
        this.f43324s3.a();
        k3(false, false);
        this.f43323s2 = false;
        this.U2 = false;
        if (this.f43356w0.isEnabled()) {
            this.f43356w0.setEnabled(false);
            this.f43356w0.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.f43229h3) {
            try {
                this.E.getWindow().clearFlags(128);
                this.f43229h3 = false;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        org.telegram.ui.Components.se0 se0Var = this.f43387z2;
        if (se0Var != null) {
            try {
                this.f43208f0.removeView(se0Var);
            } catch (Throwable unused) {
            }
            this.f43387z2 = null;
        }
        l0();
        this.A2 = null;
        TextureView textureView = this.C2;
        if (textureView != null) {
            if (textureView instanceof org.telegram.ui.Components.v51) {
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) textureView;
                org.telegram.ui.Components.cz czVar = v51Var.f40501b;
                if (czVar != null) {
                    czVar.postRunnable(new org.telegram.ui.Components.zy(czVar, 0));
                }
                v51Var.f40500a = null;
            }
            this.C2 = null;
        }
        this.f43180c0.e();
        if (this.D2 != null) {
            this.D2 = null;
        }
        if (this.P3) {
            this.P3 = false;
            org.telegram.messenger.g0.r(this.f43230h4);
        }
        if (!z10 && !this.B8 && !this.C8) {
            N2(false, true);
        }
        wo0 wo0Var = this.X0[0];
        while (true) {
            float[] fArr = wo0Var.f53430n;
            if (i7 < fArr.length) {
                wo0Var.f53429m[i7] = 1.0f;
                fArr[i7] = 1.0f;
                i7++;
            } else {
                wo0Var.a();
                return;
            }
        }
    }

    public final void m3(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float N = org.telegram.messenger.g0.N(24.0f);
        int i7 = this.d2;
        if (i7 == 0 || i7 == 4) {
            CheckBox checkBox = this.O0;
            Property property = View.ALPHA;
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property, f10));
            CheckBox checkBox2 = this.O0;
            Property property2 = View.TRANSLATION_Y;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property2, f11));
            CounterView counterView = this.P0;
            if (!z10) {
                f12 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView, property, f12));
            CounterView counterView2 = this.P0;
            if (!z10) {
                f13 = -N;
            }
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property2, f13));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void n0() {
        Runnable runnable = this.I2;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.I2 = null;
        }
    }

    public final String n1(int i7) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        TLRPC.PhotoSize w12;
        if (i7 >= 0) {
            ArrayList arrayList = this.f43205e7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) arrayList.get(i7);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(yvVar.f28188b.dc_id);
                    sb2.append("_");
                    return a8.p0.r(sb2, yvVar.f28188b.f28540id, ".jpg");
                }
            } else {
                ArrayList arrayList2 = this.f43167a7;
                boolean isEmpty = arrayList2.isEmpty();
                ArrayList arrayList3 = this.Y6;
                if (isEmpty && arrayList3.isEmpty()) {
                    ArrayList arrayList4 = this.f43224g7;
                    if (!arrayList4.isEmpty()) {
                        if (i7 < arrayList4.size()) {
                            Object obj = arrayList4.get(i7);
                            if (obj instanceof org.telegram.messenger.hf) {
                                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                                TLRPC.PhotoSize photoSize = hfVar.L;
                                if (photoSize != null) {
                                    return org.telegram.messenger.w7.r(null, photoSize);
                                }
                                TLRPC.Document document = hfVar.J;
                                if (document != null) {
                                    return org.telegram.messenger.w7.r(null, document);
                                }
                                return Utilities.a(hfVar.C) + "." + org.telegram.messenger.ec.B(hfVar.C, "jpg");
                            } else if (obj instanceof TLRPC.BotInlineResult) {
                                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                                TLRPC.Document document2 = botInlineResult.document;
                                if (document2 != null) {
                                    return org.telegram.messenger.w7.r(null, document2);
                                }
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    return org.telegram.messenger.w7.r(null, org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false));
                                }
                                if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(Utilities.a(botInlineResult.content.url));
                                    sb3.append(".");
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    sb3.append(org.telegram.messenger.ec.B(webDocument2.url, org.telegram.messenger.w7.H(webDocument2.mime_type)));
                                    return sb3.toString();
                                }
                            }
                        }
                    } else {
                        rq0 rq0Var = this.f43248j7;
                        if (rq0Var != null) {
                            return rq0Var.c(i7);
                        }
                    }
                } else if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) arrayList2.get(i7);
                        org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) this.f43177b7.get(i7);
                        if (fcVar != null) {
                            if (fcVar2 != null && fcVar2 != fcVar) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(fcVar2.f23868f.volume_id);
                                sb4.append("_");
                                return a8.p0.n(fcVar2.f23868f.local_id, ".mp4", sb4);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(fcVar.f23868f.volume_id);
                            sb5.append("_");
                            return a8.p0.n(fcVar.f23868f.local_id, ".jpg", sb5);
                        }
                    }
                } else if (i7 < arrayList3.size()) {
                    TLRPC.Message message = ((org.telegram.messenger.fj) arrayList3.get(i7)).f23965k;
                    Pattern pattern = org.telegram.messenger.w7.J;
                    if (message != null) {
                        if (message instanceof TLRPC.TL_messageService) {
                            TLRPC.Photo photo2 = message.action.photo;
                            if (photo2 != null) {
                                ArrayList<TLRPC.PhotoSize> arrayList5 = photo2.sizes;
                                if (arrayList5.size() > 0 && (w12 = org.telegram.messenger.w7.w(arrayList5, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                                    return org.telegram.messenger.w7.r(null, w12);
                                }
                                return "";
                            }
                            return "";
                        } else if (org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                            return org.telegram.messenger.w7.r(null, org.telegram.messenger.fj.n1(message).document);
                        } else {
                            if (org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                                ArrayList<TLRPC.PhotoSize> arrayList6 = org.telegram.messenger.fj.n1(message).photo.sizes;
                                if (arrayList6.size() > 0 && (w11 = org.telegram.messenger.w7.w(arrayList6, org.telegram.messenger.g0.Z0(true), false, null, true)) != null) {
                                    return org.telegram.messenger.w7.r(null, w11);
                                }
                                return "";
                            } else if (org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                                if (org.telegram.messenger.fj.n1(message).webpage.document != null) {
                                    return org.telegram.messenger.w7.r(null, org.telegram.messenger.fj.n1(message).webpage.document);
                                }
                                if (org.telegram.messenger.fj.n1(message).webpage.photo != null) {
                                    ArrayList<TLRPC.PhotoSize> arrayList7 = org.telegram.messenger.fj.n1(message).webpage.photo.sizes;
                                    if (arrayList7.size() > 0 && (w10 = org.telegram.messenger.w7.w(arrayList7, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                                        return org.telegram.messenger.w7.r(null, w10);
                                    }
                                    return "";
                                }
                                return "";
                            } else if ((org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.fj.n1(message)).webPhoto) != null) {
                                return Utilities.a(webDocument.url) + "." + org.telegram.messenger.ec.B(webDocument.url, org.telegram.messenger.w7.H(webDocument.mime_type));
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

    public final void n2(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f43384y8 != null) {
            MediaController.B().i(this.f43384y8);
        }
        if (this.C8 && !this.f43393z8) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.C8 = false;
        this.A8 = false;
        this.Q7.setVisibility(4);
        if (i7 == 1) {
            if (this.f43216f8 == this.f43196d8 && this.f43206e8 == this.f43188c8) {
                this.f43393z8 = false;
                wo0 wo0Var = this.X0[0];
                if (wo0Var.h != 0 && wo0Var.f53427k != 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                wo0Var.f(z12, 0.0f);
                this.X0[0].d(3, false, true);
                if (!z10) {
                    j2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                    this.G2.p0(this.S7.getLeftProgress() * this.f43241i8);
                } else {
                    this.A8 = true;
                }
            } else {
                m2(false);
                if (this.f43384y8 == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.f28424id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.E5;
                    org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(org.telegram.messenger.j10.f24770t0, tL_message, false, false);
                    this.f43384y8 = fjVar;
                    fjVar.f23965k.attachPath = new File(org.telegram.messenger.w7.z(4), "video_preview.mp4").getAbsolutePath();
                    this.f43384y8.f23993r0 = new org.telegram.messenger.e20();
                    org.telegram.messenger.e20 e20Var = this.f43384y8.f23993r0;
                    e20Var.f23641g = this.f43178b8;
                    e20Var.h = this.f43188c8;
                    this.f43384y8.f23993r0.f23642i = this.f43196d8;
                    org.telegram.messenger.e20 e20Var2 = this.f43384y8.f23993r0;
                    e20Var2.f23647n = this.f43249j8;
                    Uri uri = this.W4;
                    if (uri == null) {
                        e20Var2.f23648o = uri.getPath();
                    } else {
                        e20Var2.f23648o = uri.getPath();
                    }
                }
                org.telegram.messenger.e20 e20Var3 = this.f43384y8.f23993r0;
                long j3 = this.f43274m8;
                e20Var3.f23634a = j3;
                long j10 = this.f43283n8;
                e20Var3.f23636b = j10;
                if (j3 == -1) {
                    j3 = 0;
                }
                if (j10 == -1) {
                    j10 = this.f43241i8 * 1000.0f;
                }
                if (j10 - j3 > 5000000) {
                    e20Var3.f23636b = j3 + 5000000;
                }
                e20Var3.f23646m = this.f43225g8;
                this.f43384y8.f23993r0.f23644k = this.f43206e8;
                this.f43384y8.f23993r0.f23645l = this.f43216f8;
                org.telegram.messenger.e20 e20Var4 = this.f43384y8.f23993r0;
                e20Var4.Y = true;
                e20Var4.v = this.f43241i8 * 1000.0f;
                if (!MediaController.B().h0(this.f43384y8, true, true, true)) {
                    this.f43393z8 = true;
                }
                this.C8 = true;
                wo0 wo0Var2 = this.X0[0];
                if (wo0Var2.h != 0 && wo0Var2.f53427k != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                wo0Var2.f(z11, 0.0f);
                this.X0[0].d(0, false, true);
            }
        } else {
            this.f43393z8 = false;
            this.X0[0].d(3, false, true);
            if (i7 == 2) {
                j2(this.V4, this.W4, false, false, this.X4.d, false, 0L);
                this.G2.p0(this.S7.getLeftProgress() * this.f43241i8);
            }
        }
        this.f43208f0.invalidate();
    }

    public final void n3(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10 != this.L) {
            if (z10) {
                this.f43293p1.setVisibility(0);
            }
            this.L = z10;
            this.f43293p1.setEnabled(z10);
            float f14 = 1.0f;
            if (z11) {
                ArrayList arrayList = new ArrayList();
                br0 br0Var = this.f43293p1;
                Property property = View.ALPHA;
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(br0Var, property, f12));
                br0 br0Var2 = this.f43293p1;
                Property property2 = View.TRANSLATION_Y;
                if (z10) {
                    f13 = 0.0f;
                } else {
                    f13 = -org.telegram.messenger.g0.L(10.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(br0Var2, property2, f13));
                CounterView counterView = this.P0;
                Property property3 = View.ROTATION_X;
                if (!z10) {
                    f14 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, f14));
                AnimatorSet animatorSet = new AnimatorSet();
                this.C1 = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z10) {
                    this.C1.addListener(new hp0(this, 4));
                }
                this.C1.setDuration(200L);
                this.C1.start();
                return;
            }
            br0 br0Var3 = this.f43293p1;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            br0Var3.setAlpha(f10);
            br0 br0Var4 = this.f43293p1;
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(10.0f);
            }
            br0Var4.setTranslationY(f11);
            CounterView counterView2 = this.P0;
            if (!z10) {
                f14 = 0.0f;
            }
            counterView2.setRotationX(f14);
            if (!z10) {
                this.f43293p1.setVisibility(8);
            }
        }
    }

    public final void o0() {
        float f10;
        org.telegram.ui.ActionBar.z zVar = this.B0;
        if (zVar != null) {
            if (this.f43219g2) {
                f10 = -org.telegram.messenger.g0.L(4.0f);
            } else {
                f10 = 0.0f;
            }
            zVar.setTranslationX(f10);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.F0;
        if (r0Var != null) {
            G2(r0Var, this.f43219g2, false);
        }
        boolean z10 = this.f43210f2;
        if (z10 && this.J == null) {
            fh.g c10 = this.Z.c(this.H, null, false);
            c10.p(c8.i0.j(this.f43358w2));
            c10.r(org.telegram.messenger.g0.L(20.0f));
            c10.q(org.telegram.messenger.g0.L(7.0f));
            int L = org.telegram.messenger.g0.L(54.0f);
            int L2 = org.telegram.messenger.g0.L(54.0f);
            Matrix matrix = ih.d.f16254a;
            this.J = new ih.c(L, L2, c10);
        }
        if (z10) {
            c8.ra.a(this.H);
            this.H.setBackground(this.J);
            return;
        }
        this.H.setStateListAnimator(null);
        this.H.setBackground(this.I);
    }

    public final org.telegram.messenger.fc o1(int i7, long[] jArr) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f43205e7;
            if (!arrayList.isEmpty()) {
                if (i7 < arrayList.size()) {
                    if (jArr != null) {
                        jArr[0] = ((org.telegram.messenger.yv) arrayList.get(i7)).f28188b.size;
                    }
                    org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) arrayList.get(i7);
                    if (yvVar == null) {
                        return null;
                    }
                    ?? obj = new Object();
                    obj.h = yvVar;
                    return obj;
                }
            } else {
                ArrayList arrayList2 = this.f43167a7;
                if (!arrayList2.isEmpty()) {
                    if (i7 < arrayList2.size()) {
                        if (jArr != null) {
                            ArrayList arrayList3 = this.f43187c7;
                            if (arrayList3.get(i7) != null) {
                                jArr[0] = ((Long) arrayList3.get(i7)).longValue();
                            }
                        }
                        return (org.telegram.messenger.fc) this.f43177b7.get(i7);
                    }
                } else {
                    ArrayList arrayList4 = this.Y6;
                    if (!arrayList4.isEmpty() && i7 < arrayList4.size()) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList4.get(i7);
                        TLRPC.Message message = fjVar.f23965k;
                        if (message instanceof TLRPC.TL_messageService) {
                            if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(fjVar.f23985p0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                if (w10 != null) {
                                    if (jArr != null) {
                                        long j3 = w10.size;
                                        jArr[0] = j3;
                                        if (j3 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.fc.f(w10, fjVar.f23978n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            }
                        } else {
                            TLRPC.MessageMedia messageMedia = fjVar.f23921a1;
                            if (messageMedia != null) {
                                TLRPC.Document document = messageMedia.document;
                                if (document != null) {
                                    return org.telegram.messenger.fc.b(document);
                                }
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, true);
                                    if (w11 != null) {
                                        if (jArr != null) {
                                            long j10 = w11.size;
                                            jArr[0] = j10;
                                            if (j10 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.fc.f(w11, fjVar.f23921a1.photo);
                                    } else if (jArr != null) {
                                        jArr[0] = -1;
                                        return null;
                                    }
                                }
                            } else if (((org.telegram.messenger.fj.n1(message) instanceof TLRPC.TL_messageMediaPhoto) && org.telegram.messenger.fj.n1(fjVar.f23965k).photo != null) || ((org.telegram.messenger.fj.n1(fjVar.f23965k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(fjVar.f23965k).webpage != null)) {
                                if (org.telegram.messenger.fj.t3(fjVar.f23965k)) {
                                    return org.telegram.messenger.fc.b(fjVar.F0());
                                }
                                TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(fjVar.f23985p0, org.telegram.messenger.g0.Z0(true), false, null, true);
                                if (w12 != null) {
                                    if (jArr != null) {
                                        long j11 = w12.size;
                                        jArr[0] = j11;
                                        if (j11 == 0) {
                                            jArr[0] = -1;
                                        }
                                    }
                                    return org.telegram.messenger.fc.f(w12, fjVar.f23978n0);
                                } else if (jArr != null) {
                                    jArr[0] = -1;
                                    return null;
                                }
                            } else if (org.telegram.messenger.fj.n1(fjVar.f23965k) instanceof TLRPC.TL_messageMediaInvoice) {
                                return org.telegram.messenger.fc.p(org.telegram.messenger.h20.c(((TLRPC.TL_messageMediaInvoice) org.telegram.messenger.fj.n1(fjVar.f23965k)).webPhoto));
                            } else {
                                if (fjVar.F0() != null) {
                                    TLRPC.Document F0 = fjVar.F0();
                                    if (this.C5 == 5) {
                                        return org.telegram.messenger.fc.b(F0);
                                    }
                                    if (org.telegram.messenger.fj.W2(fjVar.F0())) {
                                        TLRPC.PhotoSize w13 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                        if (jArr != null) {
                                            long j12 = w13.size;
                                            jArr[0] = j12;
                                            if (j12 == 0) {
                                                jArr[0] = -1;
                                            }
                                        }
                                        return org.telegram.messenger.fc.c(w13, F0);
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

    public final float o2() {
        return p2(true);
    }

    public final void o3() {
        boolean z10;
        org.telegram.ui.Components.f61 f61Var;
        org.telegram.ui.Components.f61 f61Var2;
        dq0 dq0Var;
        org.telegram.ui.Components.f61 f61Var3 = this.G2;
        if (f61Var3 == null && ((dq0Var = this.f43217g0) == null || !dq0Var.f36753y)) {
            return;
        }
        if (f61Var3 != null) {
            z10 = this.P3;
        } else {
            z10 = this.f43217g0.H;
        }
        n0();
        org.telegram.messenger.g0.r(this.f43378y2);
        if (z10) {
            g2();
        } else {
            if (this.f43322s1) {
                if (Math.abs(this.S7.getProgress() - this.S7.getRightProgress()) < 0.01f || ((f61Var2 = this.G2) != null && f61Var2.S() == this.G2.U())) {
                    s2(this.S7.getLeftProgress());
                }
            } else {
                if (Math.abs(this.f43304q3.c() - this.S7.getRightProgress()) < 0.01f || ((f61Var = this.G2) != null && f61Var.S() == this.G2.U())) {
                    s2(0.0f);
                }
                q2();
            }
            h2();
        }
        this.f43208f0.invalidate();
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.O6 && this.O0.getVisibility() != 0) {
            boolean[] zArr = this.f43367x1;
            if (!zArr[0] && !zArr[1]) {
                float x10 = motionEvent.getX();
                int min = Math.min(135, this.f43208f0.getMeasuredWidth() / 8);
                if (x10 < min) {
                    if (this.B4.K()) {
                        zArr[0] = true;
                        this.f43208f0.invalidate();
                        return false;
                    }
                } else if (x10 > this.f43208f0.getMeasuredWidth() - min && this.D4.K()) {
                    zArr[1] = true;
                    this.f43208f0.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        if (this.f43166a6 != 1.0f && this.d2 != 11) {
            this.V6.abortAnimation();
            this.V6.fling(Math.round(this.X5), Math.round(this.Y5), Math.round(f10), Math.round(f11), (int) this.E6, (int) this.F6, (int) this.G6, (int) this.H6);
            this.f43208f0.postInvalidate();
            return false;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override
    public final boolean onSingleTapUp(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public final boolean p0() {
        if (this.f43279n4 != 0) {
            D1();
            if (Math.abs(this.o4 - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.f43296p4;
                if (runnable != null) {
                    runnable.run();
                    this.f43296p4 = null;
                }
                this.f43279n4 = 0;
            }
        }
        if (this.f43279n4 == 0) {
            return false;
        }
        return true;
    }

    public final float p2(boolean z10) {
        int i7;
        if (this.d2 == 11) {
            int g12 = g1(this.f43341u4);
            if (g12 == 0) {
                g12 = org.telegram.messenger.g0.f24118q.x;
            }
            float i10 = org.telegram.ui.Cells.c0.i(20.0f, g12, 1) / g12;
            if (z10) {
                int q10 = this.C4.q();
                int o4 = this.C4.o();
                if ((q10 <= 1 || o4 <= 1) && (i7 = this.P4) >= 0) {
                    ArrayList arrayList = this.f43224g7;
                    if (i7 < arrayList.size()) {
                        Object obj = arrayList.get(this.P4);
                        if (obj instanceof org.telegram.messenger.ef) {
                            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                            q10 = efVar.F;
                            o4 = efVar.G;
                            if ((efVar.J / 90) % 2 != 0) {
                                o4 = q10;
                                q10 = o4;
                            }
                        }
                    }
                }
                if (q10 > 1 && o4 > 1 && q10 > o4) {
                    return (q10 / o4) * i10;
                }
            }
            return i10;
        }
        return 1.0f;
    }

    public final void p3() {
        View view = this.T3;
        if (view != null) {
            wo0 wo0Var = this.X0[0];
            int i7 = wo0Var.h;
            if (wo0Var.f53432p && (i7 == 3 || i7 == 4 || i7 == 2 || i7 == 1)) {
                if (i7 == 3) {
                    view.setContentDescription(org.telegram.messenger.gd.M0(2131754929, "AccActionPlay"));
                } else if (i7 == 2) {
                    view.setContentDescription(org.telegram.messenger.gd.M0(2131754938, "AccActionDownload"));
                } else if (i7 == 1) {
                    view.setContentDescription(org.telegram.messenger.gd.M0(2131754941, "AccActionCancelDownload"));
                } else {
                    view.setContentDescription(org.telegram.messenger.gd.M0(2131754930, "AccActionPause"));
                }
                this.T3.setVisibility(0);
                return;
            }
            view.setVisibility(4);
        }
    }

    public final void q0(boolean z10) {
        View view;
        float x10;
        float y10;
        float f10;
        float f11;
        if (z10) {
            wi.o oVar = this.f43359w3;
            if (oVar != null) {
                oVar.getViewTreeObserver().addOnPreDrawListener(new d7(this, 4));
                this.f43359w3.invalidate();
            }
        } else if (this.G3 == 2) {
            ImageView imageView = this.f43369x3;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.f43369x3.setImageDrawable(null);
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
            org.telegram.ui.Components.se0 se0Var = this.f43387z2;
            if (se0Var != null) {
                int[] iArr = this.A3;
                se0Var.getLocationInWindow(iArr);
                iArr[1] = (int) (iArr[1] - this.f43208f0.getTranslationY());
                ImageView imageView2 = this.f43369x3;
                Rect rect = this.f43331t2;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + rect.left);
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + rect.left) - this.f43387z2.getX());
                }
                pq0 pq0Var = this.F2;
                if (pq0Var != null) {
                    pq0Var.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gn0(this, 4));
                if (this.E2) {
                    x10 = 0.0f;
                } else {
                    x10 = iArr[0] - this.f43387z2.getX();
                }
                if (this.E2) {
                    y10 = 0.0f;
                } else {
                    y10 = iArr[1] - this.f43387z2.getY();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                ImageView imageView3 = this.f43369x3;
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, 1.0f));
                ImageView imageView4 = this.f43369x3;
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, 1.0f));
                ImageView imageView5 = this.f43369x3;
                Property property3 = View.TRANSLATION_X;
                if (this.E2) {
                    f10 = 0.0f;
                } else {
                    f10 = iArr[0];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView5, property3, f10));
                ImageView imageView6 = this.f43369x3;
                Property property4 = View.TRANSLATION_Y;
                if (this.E2) {
                    f11 = 0.0f;
                } else {
                    f11 = iArr[1];
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView6, property4, f11));
                arrayList.add(ObjectAnimator.ofFloat(view, property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, property3, x10));
                arrayList.add(ObjectAnimator.ofFloat(view, property4, y10));
                arrayList.add(ObjectAnimator.ofInt(this.M0, org.telegram.ui.Components.q6.d, 255));
                pq0 pq0Var2 = this.F2;
                if (pq0Var2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(pq0Var2, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property3, x10));
                    arrayList.add(ObjectAnimator.ofFloat(this.F2, property4, y10));
                }
                s1(false);
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ch.w(22, this, view));
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new fo0(this, view, 0));
                animatorSet.start();
                gq0 gq0Var = new gq0();
                gq0Var.f48082c = false;
                gq0Var.d = false;
                gq0Var.f48080a = 250;
                gq0Var.f48081b = decelerateInterpolator;
                i3(true, true, gq0Var);
                this.G3 = 0;
            }
        }
    }

    public final int q1() {
        return this.f43331t2.left;
    }

    public final void q2() {
        if (!E1()) {
            org.telegram.messenger.fj fjVar = this.T4;
            if (fjVar == null || !fjVar.r4()) {
                zo0 zo0Var = this.f43378y2;
                org.telegram.messenger.g0.r(zo0Var);
                org.telegram.messenger.g0.h3(zo0Var, 3000);
            }
        }
    }

    public final void q3() {
        if (this.B0 != null && this.N != null) {
            float f10 = 0.0f;
            for (int i7 = 0; i7 < this.B0.getChildCount(); i7++) {
                View childAt = this.B0.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    f10 = (Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth()) + f10;
                }
            }
            CheckBox checkBox = this.O0;
            if (checkBox != null && checkBox.getVisibility() == 0) {
                f10 = Math.max(f10, org.telegram.messenger.g0.L(48.0f));
            }
            CounterView counterView = this.P0;
            if (counterView != null && counterView.getVisibility() == 0) {
                f10 = Math.max(f10, org.telegram.messenger.g0.L(100.0f));
            }
            tq0 tq0Var = this.N;
            ValueAnimator valueAnimator = tq0Var.f52333n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tq0Var.f52333n = null;
            }
            tq0Var.f52334r = f10;
            tq0Var.f52330c[0].setRightPadding((int) f10);
            tq0Var.d.setRightPadding(f10);
        }
    }

    public final void r0() {
        wq0 wq0Var = this.f43193d5;
        if (wq0Var != null) {
            wq0Var.f53447a.O0(true, true);
        }
        uq0 uq0Var = this.d;
        wq0 wq0Var2 = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
        if (uq0Var != null) {
            org.telegram.messenger.fj fjVar = this.T4;
            org.telegram.messenger.fc fcVar = this.Z4;
            if (fcVar != null) {
                tL_fileLocationToBeDeprecated = fcVar.f23868f;
            }
            wq0Var2 = uq0Var.E(fjVar, tL_fileLocationToBeDeprecated, this.P4, false, false);
        }
        this.f43193d5 = wq0Var2;
        if (wq0Var2 != null && !wq0Var2.f53463s) {
            wq0Var2.f53447a.O0(false, true);
        }
    }

    public final TLRPC.Document r1() {
        int i7;
        if (this.X5 == 0.0f && this.Y5 == 0.0f && (i7 = this.P4) >= 0) {
            ArrayList arrayList = this.f43224g7;
            if (i7 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) obj;
                    if (!xeVar.v && !xeVar.f27865w && !xeVar.f27864u) {
                        return this.f43344u7;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void r2(long j3) {
        dq0 dq0Var = this.f43217g0;
        if (dq0Var != null && dq0Var.f36753y) {
            dq0Var.i(j3);
        } else {
            org.telegram.ui.Components.f61 f61Var = this.G2;
            if (f61Var != null) {
                f61Var.p0(j3);
            }
        }
        B3();
    }

    public final void r3(Object obj) {
        CharSequence charSequence;
        boolean z10;
        TLRPC.EncryptedChat encryptedChat;
        if (this.f43299p7) {
            charSequence = this.f43308q7;
        } else if (obj instanceof org.telegram.messenger.ef) {
            charSequence = ((org.telegram.messenger.ef) obj).f27846a;
        } else if (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof org.telegram.messenger.hf)) {
            charSequence = ((org.telegram.messenger.hf) obj).I;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            b1().setText("");
        } else {
            b1().setText(org.telegram.ui.Components.x5.cloneSpans(charSequence, 3));
        }
        org.telegram.ui.Components.mt editText = b1().f15048f.getEditText();
        bn bnVar = this.f43262l4;
        if (bnVar != null && ((encryptedChat = bnVar.h) == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101)) {
            z10 = true;
        } else {
            z10 = false;
        }
        editText.setAllowTextEntitiesIntersection(z10);
    }

    public final void s0() {
        org.telegram.messenger.fj fjVar;
        boolean z10;
        int i7;
        TextureView textureView;
        int i10;
        TextureView textureView2;
        float f10;
        org.telegram.messenger.fj fjVar2;
        ArrayList arrayList = this.Y6;
        boolean isEmpty = arrayList.isEmpty();
        ImageView[] imageViewArr = this.f43379y3;
        if (!isEmpty && ((fjVar = this.T4) == null || !fjVar.r4())) {
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = this.P4;
                if (i11 == 1) {
                    i12++;
                } else if (i11 == 2) {
                    i12--;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList.get(i12);
                    if (!org.telegram.messenger.fj.L4(fjVar3.f23965k) && !fjVar3.e5()) {
                        imageViewArr[i11].setVisibility(4);
                    } else {
                        if (fjVar3.e5() && (fjVar2 = this.T4) != null && fjVar2.e1() == fjVar3.e1()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i7 = fjVar3.f23965k.media.webpage.embed_width;
                        } else if (i11 == 0 && (textureView = this.C2) != null) {
                            i7 = textureView.getMeasuredWidth();
                        } else {
                            i7 = 0;
                        }
                        if (z10) {
                            i10 = fjVar3.f23965k.media.webpage.embed_height;
                        } else if (i11 == 0 && (textureView2 = this.C2) != null) {
                            i10 = textureView2.getMeasuredHeight();
                        } else {
                            i10 = 0;
                        }
                        TLRPC.Document F0 = fjVar3.F0();
                        if (F0 != null) {
                            int size = F0.attributes.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i13);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    i7 = documentAttribute.f28410w;
                                    i10 = documentAttribute.h;
                                    break;
                                }
                                i13++;
                            }
                        }
                        Point point = org.telegram.messenger.g0.f24118q;
                        if (point.y > point.x && i7 > i10) {
                            if (imageViewArr[i11].getVisibility() != 0) {
                                imageViewArr[i11].setVisibility(0);
                            }
                            if (this.K) {
                                imageViewArr[i11].setAlpha(1.0f);
                            }
                            ((FrameLayout.LayoutParams) imageViewArr[i11].getLayoutParams()).topMargin = ((this.f43208f0.getMeasuredHeight() + ((int) (i10 / (i7 / this.f43208f0.getMeasuredWidth())))) / 2) - org.telegram.messenger.g0.L(48.0f);
                        } else if (imageViewArr[i11].getVisibility() != 4) {
                            imageViewArr[i11].setVisibility(4);
                        }
                        if (this.f43298p6 != null) {
                            float f11 = this.X5;
                            f10 = ((this.f43186c6 - f11) * this.f43264l6) + f11;
                        } else {
                            f10 = this.X5;
                        }
                        float f12 = 0.0f;
                        if (i11 != 1) {
                            if (i11 == 2) {
                                f12 = (f10 - this.F6) + ((-point.x) - org.telegram.messenger.g0.L(15.0f));
                            } else {
                                float f13 = this.E6;
                                if (f10 < f13) {
                                    f12 = f10 - f13;
                                }
                            }
                        }
                        imageViewArr[i11].setTranslationX((f12 + point.x) - org.telegram.messenger.g0.L(48.0f));
                    }
                } else {
                    imageViewArr[i11].setVisibility(4);
                }
            }
            return;
        }
        for (int i14 = 0; i14 < 3; i14++) {
            imageViewArr[i14].setVisibility(4);
        }
    }

    public final org.telegram.ui.Components.yi0 s1(boolean z10) {
        wi.n nVar;
        wi.h hVar;
        RectF rectF = new RectF();
        if (!z10 && (nVar = this.P8) != null && (hVar = nVar.f59990e) != null) {
            hVar.g(rectF);
        } else {
            so0 so0Var = this.X8;
            wi.h.j(rectF, so0Var.J(), so0Var.a0());
        }
        ?? obj = new Object();
        obj.f42503a = rectF.left;
        obj.f42504b = rectF.top;
        obj.f42505c = rectF.width();
        obj.d = rectF.height();
        return obj;
    }

    public final void s2(float f10) {
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null) {
            f61Var.p0(f10 * ((float) f61Var.U()));
            return;
        }
        dq0 dq0Var = this.f43217g0;
        if (dq0Var != null) {
            dq0Var.i(f10 * dq0Var.getVideoDuration());
        }
    }

    public final void s3() {
        int i7 = org.telegram.ui.ActionBar.n6.f29643qg;
        int w12 = w1(i7);
        oi.u1 u1Var = this.T0;
        if (u1Var != null) {
            u1Var.k();
            this.T0.invalidate();
        }
        CheckBox checkBox = this.O0;
        if (checkBox != null) {
            checkBox.c(w1(i7), -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w12, mode);
        ImageView imageView = this.Z0;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.Z0.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.f43161a1;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.f43161a1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.f43190d1;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.f43190d1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.f43181c1;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.f43181c1.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.f43171b1;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.f43171b1.setColorFilter(porterDuffColorFilter);
        }
        org.telegram.ui.Cells.x0 x0Var = this.V0;
        if (x0Var != null) {
            ((TextView) x0Var.f32281b).setTextColor(w12);
        }
        org.telegram.ui.Cells.x0 x0Var2 = this.P7;
        if (x0Var2 != null) {
            ((TextView) x0Var2.f32281b).setTextColor(w12);
        }
        vp0 vp0Var = this.M1;
        if (vp0Var != null) {
            vp0Var.updateColors();
        }
        org.telegram.ui.Components.de0 de0Var = this.J1;
        if (de0Var != null) {
            ImageView imageView6 = de0Var.C0;
            ImageView imageView7 = de0Var.B0;
            ImageView imageView8 = de0Var.A0;
            org.telegram.ui.ActionBar.i6 i6Var = de0Var.J0;
            TextView textView = de0Var.f34396h0;
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            if (imageView8 != null && imageView8.getColorFilter() != null) {
                imageView8.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
            }
            if (imageView7 != null && imageView7.getColorFilter() != null) {
                imageView7.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
            }
            if (imageView6 != null && imageView6.getColorFilter() != null) {
                imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), mode));
            }
            de0Var.e();
        }
        ap0 ap0Var = this.V1;
        if (ap0Var != null) {
            ap0Var.H(this.f43358w2);
        }
        bp0 bp0Var = this.W1;
        if (bp0Var != null) {
            bp0Var.H(this.f43358w2);
        }
        xo0 xo0Var = this.S7;
        if (xo0Var != null) {
            xo0Var.invalidate();
        }
        br0 br0Var = this.f43293p1;
        if (br0Var != null) {
            int childCount = br0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f43293p1.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.y5) {
                    ((org.telegram.ui.Cells.y5) childAt).f32467c.b(org.telegram.ui.ActionBar.n6.W9, org.telegram.ui.ActionBar.n6.X9, org.telegram.ui.ActionBar.n6.V9);
                }
            }
        }
        qo0 qo0Var = this.U3;
        if (qo0Var != null) {
            qo0Var.Y0(true);
        }
    }

    public void setAnimationValue(float f10) {
        this.f43264l6 = f10;
        this.f43208f0.invalidate();
        D1();
    }

    public final void t0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.t0(boolean):void");
    }

    public final RenderNode t1(ColorMatrix colorMatrix) {
        RenderNode renderNode;
        long j3;
        if (this.K8 == null) {
            renderNode = null;
        } else {
            renderNode = this.L8;
            if (renderNode == null) {
                renderNode = new RenderNode("pv_s_blur_false");
                float a10 = dh.g.a(org.telegram.messenger.g0.L(40.0f), 6.0f);
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(a10, a10, Shader.TileMode.CLAMP));
                this.L8 = renderNode;
            }
            int ceil = (int) Math.ceil(this.K8.getWidth() / 6.0f);
            int ceil2 = (int) Math.ceil(this.K8.getHeight() / 6.0f);
            if ((!renderNode.hasDisplayList()) | renderNode.setPosition(0, 0, ceil, ceil2)) {
                RecordingCanvas beginRecording = renderNode.beginRecording();
                beginRecording.save();
                beginRecording.scale(ceil / this.K8.getWidth(), ceil2 / this.K8.getHeight());
                beginRecording.drawRenderNode(this.K8);
                beginRecording.restore();
                renderNode.endRecording();
            }
        }
        if (renderNode == null) {
            return null;
        }
        dh.a aVar = this.M8;
        aVar.f8370b = 0L;
        aVar.f8369a = false;
        for (float f10 : colorMatrix.getArray()) {
            aVar.c(f10);
        }
        aVar.a(0L);
        if (aVar.f8369a) {
            j3 = -1;
        } else {
            j3 = aVar.f8370b;
        }
        RenderNode renderNode2 = (RenderNode) this.N8.f(j3);
        if (renderNode2 == null) {
            RenderNode renderNode3 = new RenderNode("pv_mat_" + j3 + "_false");
            renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            renderNode2 = renderNode3;
        }
        if ((!renderNode2.hasDisplayList()) | renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight())) {
            renderNode2.beginRecording().drawRenderNode(renderNode);
            renderNode2.endRecording();
        }
        return renderNode2;
    }

    public final int t2() {
        int i7;
        if (this.f43345u8 > 1048576000) {
            return this.Z7 - 1;
        }
        SharedPreferences g12 = org.telegram.messenger.mp.g1();
        int i10 = this.Z7;
        while (i10 < 5) {
            Locale locale = Locale.US;
            int i11 = g12.getInt("compress_video_" + i10, -1);
            if (i11 >= 0) {
                return Math.min(i11, 2);
            }
            i10++;
        }
        org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(this.U);
        int e10 = org.telegram.messenger.t0.e();
        if (e10 == 1) {
            i7 = q10.p().h;
        } else if (e10 == 2) {
            i7 = q10.o().h;
        } else {
            i7 = q10.n().h;
        }
        return Math.min(2, Math.round(i7 / (100.0f / i10)) - 1);
    }

    public final void t3(boolean z10) {
        qq0 qq0Var;
        int i7;
        if (this.d2 != 1 && (qq0Var = this.f43208f0) != null) {
            if (!z10) {
                if (qq0Var.getPaddingLeft() <= 0 && this.f43208f0.getPaddingRight() <= 0) {
                    i7 = 1796;
                } else {
                    i7 = 5894;
                }
            } else {
                i7 = 1792;
            }
            this.f43208f0.setSystemUiVisibility(i7);
        }
    }

    public final void u0(final int i7, final boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        final boolean z13;
        final boolean z14;
        aj0 aj0Var;
        final File file;
        final aj0 aj0Var2;
        boolean z15;
        boolean z16;
        File file2;
        File J;
        File J2;
        boolean z17;
        final boolean z18;
        File file3;
        aj0 aj0Var3;
        boolean z19;
        org.telegram.ui.Components.b6 b6Var;
        int i11 = this.P4;
        if (i7 == 1) {
            i10 = i11 + 1;
        } else if (i7 == 2) {
            i10 = i11 - 1;
        } else {
            i10 = i11;
        }
        if (this.f43185c5[i7] != null) {
            if (i7 == 0 && i11 == 0 && (b6Var = this.f43252k2) != null) {
                z11 = b6Var.s();
            } else {
                z11 = false;
            }
            File file4 = null;
            if (this.T4 != null) {
                if (i10 >= 0 && i10 < this.Y6.size()) {
                    ?? r42 = (org.telegram.messenger.fj) this.Y6.get(i10);
                    z12 = P2(r42);
                    if (this.C5 == 1 && !r42.x()) {
                        this.X0[i7].d(-1, z10, true);
                        return;
                    }
                    if (!TextUtils.isEmpty(r42.f23965k.attachPath)) {
                        file3 = new File(r42.f23965k.attachPath);
                    } else {
                        file3 = null;
                    }
                    if ((org.telegram.messenger.fj.n1(r42.f23965k) instanceof TLRPC.TL_messageMediaWebPage) && org.telegram.messenger.fj.n1(r42.f23965k).webpage != null && org.telegram.messenger.fj.n1(r42.f23965k).webpage.document == null) {
                        aj0Var3 = new aj0(4, this, l1(i10, null));
                    } else {
                        aj0Var3 = new aj0(5, this, r42.f23965k);
                    }
                    if (org.telegram.messenger.fj.L4(r42.f23965k)) {
                        if ((org.telegram.messenger.bz.B0 && r42.B() && !org.telegram.messenger.n5.C(org.telegram.messenger.fj.B0(r42.f23965k))) || r42.D2(true)) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        aj0 aj0Var4 = aj0Var3;
                        z13 = z19;
                        aj0Var = r42;
                        file = null;
                        file4 = file3;
                        aj0Var2 = aj0Var4;
                        z14 = true;
                    } else {
                        z14 = false;
                        aj0Var = r42;
                        file = null;
                        file4 = file3;
                        aj0Var2 = aj0Var3;
                        z13 = false;
                    }
                } else {
                    this.X0[i7].d(-1, z10, true);
                    return;
                }
            } else {
                if (this.Y4 != null) {
                    if (i10 >= 0 && i10 < this.f43224g7.size()) {
                        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f43224g7.get(i10);
                        if (!botInlineResult.type.equals("video") && !org.telegram.messenger.fj.K4(botInlineResult.document)) {
                            if (botInlineResult.document != null) {
                                file2 = new File(org.telegram.messenger.w7.z(3), this.f43185c5[i7]);
                            } else if (botInlineResult.photo != null) {
                                file2 = new File(org.telegram.messenger.w7.z(0), this.f43185c5[i7]);
                            } else {
                                z17 = false;
                                file2 = null;
                            }
                            z17 = false;
                        } else {
                            if (botInlineResult.document != null) {
                                org.telegram.messenger.w7.G(this.U);
                                file2 = org.telegram.messenger.w7.I(botInlineResult.document);
                            } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                                file2 = new File(org.telegram.messenger.w7.z(4), Utilities.a(botInlineResult.content.url) + "." + org.telegram.messenger.ec.B(botInlineResult.content.url, "mp4"));
                            } else {
                                file2 = null;
                            }
                            z17 = true;
                        }
                        z12 = false;
                        z13 = false;
                        z14 = z17;
                        file = new File(org.telegram.messenger.w7.z(4), this.f43185c5[i7]);
                    } else {
                        this.X0[i7].d(-1, z10, true);
                        return;
                    }
                } else {
                    if (this.Z4 != null) {
                        if (i10 >= 0 && i10 < this.f43177b7.size()) {
                            org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) this.f43177b7.get(i10);
                            if (fcVar != null) {
                                org.telegram.messenger.w7.G(this.U);
                                J = org.telegram.messenger.w7.J(fcVar.f23868f, m1(fcVar), false, true);
                                org.telegram.messenger.w7.G(this.U);
                                J2 = org.telegram.messenger.w7.J(fcVar.f23868f, m1(fcVar), true, true);
                            } else {
                                J2 = null;
                                J = null;
                            }
                        } else {
                            this.X0[i7].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f43175b5 != null) {
                        if (i10 >= 0 && i10 < this.f43205e7.size()) {
                            org.telegram.messenger.yv yvVar = (org.telegram.messenger.yv) this.f43205e7.get(i10);
                            org.telegram.messenger.w7.G(this.U);
                            J = org.telegram.messenger.w7.J(yvVar, null, true, true);
                            org.telegram.messenger.w7.G(this.U);
                            J2 = org.telegram.messenger.w7.J(yvVar, null, false, true);
                        } else {
                            this.X0[i7].d(-1, z10, true);
                            return;
                        }
                    } else if (this.f43203e5 != null) {
                        file2 = new File(org.telegram.messenger.w7.z(3), this.f43185c5[i7]);
                        file = new File(org.telegram.messenger.w7.z(4), this.f43185c5[i7]);
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    } else {
                        rq0 rq0Var = this.f43248j7;
                        if (rq0Var != null) {
                            File b10 = rq0Var.b(i10);
                            if (!this.f43248j7.a(i10) && !this.f43248j7.e(i10)) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            if (z15 && org.telegram.messenger.bz.B0 && (this.f43248j7.d(i10) instanceof TLRPC.Document)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z14 = z15;
                            z13 = z16;
                            aj0Var2 = null;
                            z12 = O2(i10);
                            file4 = b10;
                            aj0Var = null;
                            file = null;
                        } else {
                            z12 = false;
                            z13 = false;
                            z14 = false;
                            aj0Var = null;
                            file = null;
                            aj0Var2 = null;
                        }
                    }
                    z12 = false;
                    z13 = false;
                    z14 = false;
                    aj0Var2 = null;
                    file4 = J;
                    file = J2;
                    aj0Var = aj0Var2;
                }
                aj0Var2 = null;
                file4 = file2;
                aj0Var = aj0Var2;
            }
            if ((i7 != 0 || !this.f43263l5) && z12) {
                z18 = true;
            } else {
                z18 = false;
            }
            final File file5 = file4;
            final ?? r72 = aj0Var;
            final boolean z20 = z11;
            Utilities.f22779e.c(new Runnable() {
                @Override
                public final void run() {
                    org.telegram.messenger.fj fjVar;
                    bn bnVar;
                    TLRPC.Document F0;
                    Drawable[] drawableArr = PhotoViewer.Z8;
                    boolean z21 = z20;
                    final File file6 = file5;
                    if (!z21 && file6 != null) {
                        z21 = file6.exists();
                    }
                    File file7 = file;
                    aj0 aj0Var5 = aj0Var2;
                    File file8 = null;
                    if (file7 == null && aj0Var5 != null) {
                        file7 = aj0Var5.g();
                    } else if (aj0Var5 != null) {
                        file8 = aj0Var5.g();
                    }
                    final File file9 = file7;
                    if (!z21 && file9 != null) {
                        z21 = file9.exists();
                    }
                    if (!z21 && file8 != null) {
                        z21 = file8.exists();
                    }
                    final boolean z22 = z21;
                    final PhotoViewer photoViewer = PhotoViewer.this;
                    final int i12 = i7;
                    final boolean z23 = z13;
                    if (!z22 && i12 != 0 && (fjVar = r72) != null && z23 && org.telegram.messenger.a6.q(photoViewer.U).b(fjVar.f23965k) != 0 && (((bnVar = photoViewer.f43262l4) == null || bnVar.h == null) && !org.telegram.messenger.fj.R5(fjVar.f23965k) && (F0 = fjVar.F0()) != null)) {
                        org.telegram.messenger.w7.G(photoViewer.U).W(F0, fjVar, 0, 10);
                    }
                    final boolean z24 = z14;
                    final boolean z25 = z18;
                    final boolean z26 = z10;
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            boolean z27;
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            String[] strArr = photoViewer2.f43185c5;
                            wo0[] wo0VarArr = photoViewer2.X0;
                            int i13 = i12;
                            File file10 = file6;
                            boolean z28 = z24;
                            boolean z29 = z26;
                            boolean z30 = true;
                            if ((file10 == null && file9 == null) || (!(z27 = z22) && !z23)) {
                                if (z28) {
                                    if (!org.telegram.messenger.w7.G(photoViewer2.U).S(strArr[i13])) {
                                        wo0VarArr[i13].d(2, false, true);
                                    } else {
                                        wo0VarArr[i13].d(1, false, true);
                                    }
                                } else {
                                    wo0VarArr[i13].d(0, z29, true);
                                }
                                Float w10 = org.telegram.messenger.ec.D().w(strArr[i13]);
                                if (w10 == null) {
                                    w10 = Float.valueOf(0.0f);
                                }
                                wo0VarArr[i13].f(false, w10.floatValue());
                            } else {
                                if (i13 != 0 || !photoViewer2.P3) {
                                    if (z28 && (!z25 || (i13 == 0 && photoViewer2.X2))) {
                                        wo0VarArr[i13].d(3, z29, true);
                                    } else {
                                        wo0VarArr[i13].d(-1, z29, true);
                                    }
                                }
                                if (i13 == 0 && !photoViewer2.f43292p0.y()) {
                                    if (!z27) {
                                        if (!org.telegram.messenger.w7.G(photoViewer2.U).S(strArr[i13])) {
                                            photoViewer2.f43292p0.u(8);
                                        } else {
                                            photoViewer2.f43292p0.T(8);
                                        }
                                    } else {
                                        photoViewer2.f43292p0.u(8);
                                    }
                                }
                            }
                            if (i13 == 0) {
                                if (photoViewer2.f43333t4 || (photoViewer2.f43224g7.isEmpty() && (strArr[0] == null || wo0VarArr[0].h == 0))) {
                                    z30 = false;
                                }
                                photoViewer2.I6 = z30;
                            }
                        }
                    });
                }
            });
            return;
        }
        if (!this.f43224g7.isEmpty() && i10 >= 0 && i10 < this.f43224g7.size()) {
            Object obj = this.f43224g7.get(i10);
            if (obj instanceof org.telegram.messenger.ef) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                if (efVar.f27847b && (!efVar.d() || (!efVar.j() && this.d2 != 11))) {
                    this.X0[i7].d(3, z10, true);
                    return;
                }
            }
        }
        this.X0[i7].d(-1, z10, true);
    }

    public final int u1() {
        return this.f43331t2.right;
    }

    public final void u2(final boolean z10, final int i7, final int i10, final boolean z11, final boolean z12, boolean z13) {
        int i11;
        float f10;
        boolean z14;
        org.telegram.messenger.e20 e20Var;
        char c10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        org.telegram.messenger.we weVar;
        org.telegram.messenger.we weVar2;
        TLRPC.Chat chat;
        boolean z15;
        int i12;
        bn bnVar;
        org.telegram.ui.Components.s30 s30Var;
        String str;
        long j3;
        String M0;
        TextureView textureView;
        if (!F1() && this.d != null && !this.f43348v2) {
            String str2 = null;
            if (this.d2 == 1) {
                if (!z13 && (s30Var = this.f43294p2) != null) {
                    TLObject tLObject = s30Var.f39468a;
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        String str3 = user.first_name;
                        long j10 = user.f28552id;
                        str = str3;
                        j3 = j10;
                    } else {
                        str = "";
                        j3 = 0;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43208f0.getContext());
                    int L = org.telegram.messenger.g0.L(8.0f);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.W0 = L;
                    Context context = this.f43208f0.getContext();
                    ?? view = new View(context);
                    ImageReceiver imageReceiver = new ImageReceiver(view);
                    view.f49160a = imageReceiver;
                    ImageReceiver imageReceiver2 = new ImageReceiver(view);
                    view.f49161b = imageReceiver2;
                    org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                    view.f49163e = new Path();
                    b9Var.r(org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f());
                    imageReceiver.i0(org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f(), b9Var, null);
                    imageReceiver2.i0(org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24770t0).f(), b9Var, null);
                    Drawable drawable = context.getDrawable(2131232058);
                    view.f49164f = drawable;
                    drawable.setAlpha(100);
                    TLObject tLObject2 = this.f43294p2.f39468a;
                    qq0 qq0Var = this.f43208f0;
                    org.telegram.ui.Components.qd0 qd0Var = this.D1;
                    b9Var.l(tLObject2);
                    imageReceiver.i0(tLObject2, b9Var, null);
                    view.f49162c = qq0Var;
                    view.d = qd0Var;
                    u1Var.W = view;
                    if (this.f43294p2.f39470c == 1) {
                        if (org.telegram.messenger.j10.i(this.U).f24789n == j3) {
                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131745304, "SetUserPhotoSelfAlertMessage"));
                        } else {
                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131745305, str, str));
                        }
                        if (this.I4) {
                            M0 = org.telegram.messenger.gd.M0(2131745302, "SetVideo");
                        } else {
                            M0 = org.telegram.messenger.gd.M0(2131745324, "SetPhoto");
                        }
                    } else {
                        if (this.I4) {
                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744161, str));
                        } else {
                            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744172, str));
                        }
                        M0 = org.telegram.messenger.gd.M0(2131744170, "SuggestPhotoShort");
                    }
                    String str4 = M0;
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), new l60(6));
                    alertDialog$Builder.k(str4, new org.telegram.ui.ActionBar.r1() {
                        @Override
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                            Drawable[] drawableArr = PhotoViewer.Z8;
                            PhotoViewer.this.u2(z10, i7, i10, z11, z12, true);
                        }
                    });
                    u1Var.J = org.telegram.ui.ActionBar.n6.f29460gh;
                    u1Var.U0 = true;
                    u1Var.j(i0.a.o(-15461356, 204));
                    u1Var.show();
                    u1Var.p(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29423eh, false));
                    u1Var.setOnDismissListener(new dp0(this));
                    if (this.f43322s1 && (textureView = this.C2) != null) {
                        try {
                            this.D3 = textureView.getBitmap();
                            ImageView imageView = this.E3;
                            if (imageView != null) {
                                this.f43387z2.removeView(imageView);
                                this.E3 = null;
                            }
                            ImageView imageView2 = new ImageView(this.C2.getContext());
                            this.E3 = imageView2;
                            imageView2.setBackground(new BitmapDrawable(this.D3));
                            this.f43387z2.addView(this.E3);
                            return;
                        } catch (Throwable th2) {
                            Bitmap bitmap = this.C3;
                            if (bitmap != null) {
                                bitmap.recycle();
                                this.C3 = null;
                            }
                            org.telegram.messenger.a8.g(th2, true);
                            return;
                        }
                    }
                    return;
                }
                f0();
            }
            if (!z11 && (bnVar = this.f43262l4) != null) {
                TLRPC.Chat chat2 = bnVar.f45978e;
                if (bnVar.j() != null || ((org.telegram.messenger.v3.T(chat2) && chat2.megagroup) || !org.telegram.messenger.v3.T(chat2))) {
                    org.telegram.messenger.mp.u1(this.U).f25658g7.edit().putBoolean("silent_" + this.f43262l4.a(), !z10).commit();
                }
            }
            org.telegram.messenger.e20 j12 = j1();
            ArrayList arrayList = this.f43224g7;
            if (!arrayList.isEmpty() && (i12 = this.P4) >= 0 && i12 < arrayList.size()) {
                Object obj = arrayList.get(this.P4);
                if (obj instanceof org.telegram.messenger.xe) {
                    ((org.telegram.messenger.xe) obj).f27862s = j12;
                }
            }
            bn bnVar2 = this.f43262l4;
            if (bnVar2 != null && (chat = bnVar2.f45978e) != null && this.d2 != 11) {
                if (!this.f43322s1 && j12 == null) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z15 && !org.telegram.messenger.v3.u(chat)) {
                    org.telegram.messenger.f3.o(null, 2131749363, new org.telegram.ui.Components.lc(this.f43208f0, this.f43358w2), null);
                    return;
                } else if (!z15 && !org.telegram.messenger.v3.p(this.f43262l4.f45978e)) {
                    org.telegram.messenger.f3.o(null, 2131749367, new org.telegram.ui.Components.lc(this.f43208f0, this.f43358w2), null);
                    return;
                }
            }
            this.f43348v2 = true;
            if (j12 != null) {
                long j11 = ((float) j12.f23650q) * 0.9f;
                if ((j11 > 2097152000 && !org.telegram.messenger.j10.i(this.U).q()) || j11 > 4194304000L) {
                    if (this.f43172b2 != null) {
                        org.telegram.ui.Components.si siVar = this.f43172b2;
                        new ug.l0(6, org.telegram.messenger.j10.f24770t0, siVar.f30193c.getContext(), siVar.f39659a2, null).show();
                        return;
                    }
                    return;
                }
            }
            if (!z11) {
                if (this.d2 == 11) {
                    Object obj2 = arrayList.get(this.P4);
                    if (obj2 instanceof org.telegram.messenger.ef) {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj2;
                        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Path path = new Path();
                        RectF rectF = new RectF();
                        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                        float width = createBitmap.getWidth() / 8;
                        path.addRoundRect(rectF, width, width, Path.Direction.CW);
                        canvas.clipPath(path);
                        int g12 = g1(this.f43341u4);
                        e1();
                        float L2 = g12 - org.telegram.messenger.g0.L(20.0f);
                        tg.e2 e2Var = this.f43297p5;
                        if (e2Var != null && e2Var.f57815j0 && e2Var.getSourceBitmap() != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.f43297p5.g(canvas, false, null, false);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.C4.h(canvas, null);
                            canvas.restore();
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.f43297p5.g(canvas, true, null, false);
                            canvas.restore();
                        } else {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            this.C4.h(canvas, null);
                            canvas.restore();
                        }
                        if (this.f43380y4 != null) {
                            canvas.save();
                            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                            canvas.scale(createBitmap.getWidth() / L2, createBitmap.getHeight() / L2);
                            h0(canvas);
                            ImageReceiver imageReceiver3 = this.C4;
                            canvas.translate((-imageReceiver3.N0) / 2.0f, (-imageReceiver3.O0) / 2.0f);
                            f10 = 2.0f;
                            canvas.scale(this.C4.N0 / this.f43380y4.getMeasuredWidth(), this.C4.O0 / this.f43380y4.getMeasuredHeight());
                            this.f43380y4.f34376e = !z1();
                            this.f43380y4.draw(canvas);
                            this.f43380y4.f34376e = true;
                            canvas.restore();
                        } else {
                            f10 = 2.0f;
                        }
                        if (z1()) {
                            Matrix matrix = new Matrix();
                            matrix.reset();
                            float f18 = L2 / f10;
                            matrix.preTranslate(f18, f18);
                            if (this.f43298p6 != null) {
                                f15 = org.telegram.messenger.g0.T1(0.0f, this.f43223g6, this.f43264l6);
                                c10 = 3;
                                f11 = org.telegram.messenger.g0.T1(this.f43166a6, this.f43204e6, this.f43264l6);
                                f12 = org.telegram.messenger.g0.T1(this.f43176b6, this.f43214f6, this.f43264l6);
                                f13 = org.telegram.messenger.g0.T1(this.Y5, this.f43194d6, this.f43264l6);
                                f14 = org.telegram.messenger.g0.T1(this.X5, this.f43186c6, this.f43264l6);
                            } else {
                                c10 = 3;
                                f11 = this.f43166a6;
                                f12 = this.f43176b6;
                                f13 = this.Y5;
                                f14 = this.X5;
                                if (this.f43281n6 != 0) {
                                    f14 = this.f43186c6;
                                    f13 = this.f43194d6;
                                    f11 = this.f43204e6;
                                }
                                f15 = 0.0f;
                            }
                            int g13 = g1(this.f43341u4);
                            int e12 = e1();
                            matrix.preTranslate(f14, f13 + 0.0f);
                            matrix.preScale(f11, f11);
                            matrix.preRotate(f12);
                            int q10 = this.C4.q();
                            int o4 = this.C4.o();
                            float f19 = g13;
                            float f20 = e12;
                            float min = Math.min(f19 / q10, f20 / o4);
                            og.g gVar = this.E1;
                            int i13 = gVar.f21856i;
                            if (i13 != 90 && i13 != 270) {
                                o4 = q10;
                                q10 = o4;
                            }
                            float f21 = gVar.f21857j;
                            float f22 = gVar.f21858k;
                            float f23 = o4;
                            float f24 = q10;
                            float f25 = f19 / ((int) ((((1.0f - f21) * 0.0f) + f21) * f23));
                            float f26 = (int) ((((1.0f - f22) * 0.0f) + f22) * f24);
                            if (f25 * f26 > f20) {
                                f25 = f20 / f26;
                            }
                            int i14 = this.d2;
                            nq0 nq0Var = this.X4;
                            if (i14 == 1 || gVar.f21850a) {
                                TextureView textureView2 = this.C2;
                                if (textureView2 != null) {
                                    org.telegram.messenger.we weVar3 = nq0Var.f50266c;
                                    if (weVar3 != null && weVar3.f27682l) {
                                        f17 = -1.0f;
                                    } else {
                                        f17 = 1.0f;
                                    }
                                    textureView2.setScaleX(f17);
                                    pq0 pq0Var = this.F2;
                                    if (pq0Var != null) {
                                        pq0Var.setScaleX(this.C2.getScaleX());
                                    }
                                }
                                org.telegram.messenger.we weVar4 = nq0Var.f50266c;
                                if (weVar4 != null) {
                                    f16 = weVar4.f27676c;
                                } else {
                                    f16 = 1.0f;
                                }
                                float z16 = ((f25 / min) / com.google.android.gms.internal.vision.e2.z(f16, 1.0f, 0.0f, 1.0f)) * f16;
                                matrix.preTranslate(gVar.d * 1.0f, gVar.f21853e * 1.0f);
                                matrix.preScale(z16, z16);
                                matrix.preTranslate(com.google.android.gms.internal.vision.e2.D(gVar.f21851b, f23, min, 1.0f), com.google.android.gms.internal.vision.e2.D(gVar.f21852c, f24, min, 1.0f));
                                float f27 = gVar.f21855g + i13;
                                if (f27 > 180.0f) {
                                    f27 -= 360.0f;
                                }
                                matrix.preRotate(f27);
                            }
                            if (!arrayList.isEmpty() && (weVar2 = nq0Var.f50266c) != null && weVar2.f27682l) {
                                matrix.preScale(-1.0f, 1.0f);
                            }
                            if (f15 > 0.0f) {
                                matrix.preScale(1.0f - (f15 * f10), 1.0f);
                                matrix.preSkew(0.0f, org.telegram.messenger.f3.A(1.0f, f15, 4.0f * f15, 0.25f));
                            }
                            ImageReceiver imageReceiver4 = this.C4;
                            matrix.preTranslate((-imageReceiver4.N0) / f10, (-imageReceiver4.O0) / f10);
                            ImageReceiver imageReceiver5 = this.C4;
                            matrix.preScale(imageReceiver5.N0, imageReceiver5.O0);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = efVar.f27859p;
                            int size = arrayList3.size();
                            int i15 = 0;
                            String str5 = null;
                            while (i15 < size) {
                                Object obj3 = arrayList3.get(i15);
                                i15++;
                                org.telegram.messenger.c20 a10 = ((org.telegram.messenger.c20) obj3).a();
                                float f28 = a10.f23231c;
                                float f29 = a10.d;
                                float f30 = a10.f23233f + f28;
                                float f31 = a10.f23234g + f29;
                                float f32 = L2;
                                float[] fArr = new float[8];
                                fArr[0] = f28;
                                fArr[1] = f29;
                                fArr[2] = f30;
                                fArr[c10] = f29;
                                fArr[4] = f30;
                                fArr[5] = f31;
                                fArr[6] = f28;
                                fArr[7] = f31;
                                matrix.mapPoints(fArr);
                                Matrix matrix2 = matrix;
                                a10.f23233f = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[c10], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d))) / f32;
                                float sqrt = ((float) Math.sqrt(Math.pow(fArr[1] - fArr[7], 2.0d) + Math.pow(fArr[0] - fArr[6], 2.0d))) / f32;
                                a10.f23234g = sqrt;
                                a10.f23231c = (((fArr[0] + fArr[4]) / f10) / f32) - (a10.f23233f / f10);
                                a10.d = (((fArr[1] + fArr[5]) / f10) / f32) - (sqrt / f10);
                                a10.v = 1.0f;
                                a10.A = true;
                                if (efVar.f27865w && (weVar = efVar.A) != null) {
                                    a10.f23232e = (float) (a10.f23232e - ((weVar.f27681k / 180.0f) * 3.141592653589793d));
                                }
                                a10.f23232e = (float) (a10.f23232e - ((this.f43176b6 / 180.0f) * 3.141592653589793d));
                                arrayList2.add(a10);
                                TLRPC.Document document = a10.B;
                                if (document != null && str5 == null) {
                                    str5 = org.telegram.messenger.fj.V(document, null, null);
                                }
                                L2 = f32;
                                matrix = matrix2;
                            }
                            org.telegram.messenger.e20 e20Var2 = new org.telegram.messenger.e20();
                            e20Var2.I = true;
                            e20Var2.f23644k = 512;
                            e20Var2.h = 512;
                            e20Var2.f23645l = 512;
                            e20Var2.f23642i = 512;
                            e20Var2.G = arrayList2;
                            long k10 = Utilities.k(efVar.f27863t, 2999L, 800L);
                            e20Var2.f23651r = k10;
                            e20Var2.v = k10;
                            e20Var2.f23646m = 200000;
                            e20Var2.f23647n = 30;
                            z14 = true;
                            e20Var2.N = true;
                            e20Var2.f23650q = 262144L;
                            e20Var = e20Var2;
                            str2 = str5;
                        } else {
                            z14 = true;
                            e20Var = null;
                        }
                        float f33 = 512;
                        TLRPC.PhotoSize a02 = org.telegram.messenger.ec.a0(createBitmap, Bitmap.CompressFormat.WEBP, f33, f33, 100);
                        org.telegram.messenger.w7.G(org.telegram.messenger.j10.f24770t0);
                        String file = org.telegram.messenger.w7.J(a02, "webp", z14, z14).toString();
                        if (e20Var != null) {
                            e20Var.f23648o = file;
                        }
                        if (this.f43316r5 == null) {
                            this.f43316r5 = new ArrayList();
                        }
                        if (this.f43316r5.isEmpty()) {
                            String str6 = this.f43297p5.f57807d0;
                            if (str6 != null && org.telegram.messenger.j6.g(str6) != null) {
                                this.f43316r5.add(this.f43297p5.f57807d0);
                            } else if (str2 != null) {
                                this.f43316r5.add(str2);
                            } else {
                                this.f43316r5.add("👍");
                            }
                        }
                        this.f43348v2 = false;
                        ns p10 = ns.p();
                        tg.e2 e2Var2 = this.f43297p5;
                        ArrayList arrayList4 = this.f43316r5;
                        ep0 ep0Var = new ep0(this, file, e20Var, efVar, z10, i7, i10, z12);
                        js jsVar = p10.U;
                        Activity W = org.telegram.messenger.g0.W(e2Var2.getContext());
                        if (W != null) {
                            p10.v(W);
                            p10.u(ep0Var);
                            ?? obj4 = new Object();
                            obj4.f26900a = file;
                            obj4.f26905g = e20Var;
                            p10.f50290o = arrayList4;
                            p10.s(null, obj4, null, null, null, 3, false, null, new fi.b(), 0);
                            org.telegram.messenger.g0.r(jsVar);
                            org.telegram.messenger.g0.h3(jsVar, 16L);
                            return;
                        }
                        return;
                    }
                }
                i11 = 3;
                this.d.o(this.P4, j12, z10, i7, i10, z12);
            } else {
                i11 = 3;
                this.d.M(j12);
            }
            if (this.P) {
                if (this.Q) {
                    org.telegram.messenger.g0.h3(new zn0(this, i11), 200L);
                } else {
                    z0(false, false);
                }
            }
        }
    }

    public final void u3(float f10) {
        int g12;
        int e12;
        boolean z10;
        View view;
        org.telegram.ui.Components.se0 se0Var = this.f43387z2;
        if (se0Var != null && se0Var.getVisibility() == 0 && this.H3) {
            if (this.E2) {
                view = this.D2;
            } else {
                view = this.C2;
            }
            f10 *= Math.min(g1(this.f43341u4) / view.getMeasuredWidth(), y1() / view.getMeasuredHeight());
        }
        ImageReceiver imageReceiver = this.C4;
        float f11 = imageReceiver.N0;
        float f12 = imageReceiver.O0;
        org.telegram.messenger.we weVar = this.X4.f50266c;
        if (weVar != null) {
            f11 *= weVar.f27677e;
            f12 *= weVar.f27678f;
        }
        if (this.d2 == 11) {
            g12 = (int) (f11 * f10);
        } else {
            g12 = ((int) ((f11 * f10) - g1(this.f43341u4))) / 2;
        }
        if (this.d2 == 11) {
            e12 = (int) (f12 * f10);
        } else {
            e12 = ((int) ((f12 * f10) - e1())) / 2;
        }
        float f13 = 0.0f;
        if (g12 > 0) {
            this.E6 = -g12;
            this.F6 = g12;
        } else {
            this.F6 = 0.0f;
            this.E6 = 0.0f;
        }
        if (e12 > 0) {
            this.G6 = -e12;
            this.H6 = e12;
        } else {
            this.H6 = 0.0f;
            this.G6 = 0.0f;
        }
        vp0 vp0Var = this.M1;
        if (vp0Var != null) {
            if (f10 <= 1.1f) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinearLayout linearLayout = vp0Var.f57857h1;
            boolean z11 = !z10;
            if (vp0Var.I1 != z11) {
                vp0Var.I1 = z11;
                linearLayout.animate().cancel();
                ViewPropertyAnimator animate = linearLayout.animate();
                if (!z10) {
                    f13 = 1.0f;
                }
                org.telegram.messenger.n10.o(animate.alpha(f13), org.telegram.ui.Components.lr.h, 240L);
            }
        }
    }

    public final void v0(int i7) {
        org.telegram.ui.Components.c61 c61Var;
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null && f61Var.d != null && i7 != f61Var.f34969e0) {
            f61Var.f34969e0 = i7;
            ArrayList arrayList = f61Var.O;
            if (arrayList != null && i7 >= 0 && i7 < arrayList.size()) {
                c61Var = (org.telegram.ui.Components.c61) f61Var.O.get(i7);
            } else {
                c61Var = null;
            }
            f61Var.w0(false, c61Var);
        }
        if (i7 == -1) {
            org.telegram.ui.Components.f61.o0(null, this.T4);
        } else {
            org.telegram.ui.Components.f61 f61Var2 = this.G2;
            if (f61Var2 != null) {
                org.telegram.ui.Components.f61.o0(f61Var2.Z(i7), this.T4);
            }
        }
        y3();
        this.f43301q0.V(null, null);
        try {
            d1.f.b(0);
            if (wf.b.J().M()) {
                wf.b.J().Q(i1());
            }
            org.telegram.ui.Components.f61 f61Var3 = this.G2;
            if (f61Var3 != null) {
                d1.f.x(f61Var3.d0());
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v2(org.telegram.ui.Components.s30 s30Var) {
        String str;
        int i7;
        TLRPC.User user;
        this.f43294p2 = s30Var;
        if (this.d2 == 1) {
            if (D3()) {
                this.f43284o0.setVisibility(0);
                this.T0.setVisibility(8);
            } else {
                this.T0.setVisibility(0);
                this.f43284o0.setVisibility(8);
            }
            if (s30Var != null && (user = s30Var.f39469b) != null && s30Var.f39470c == 1 && this.f43294p2.d) {
                if (s30Var.f39471e) {
                    this.D1.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131745317, user.first_name));
                } else {
                    this.D1.setSubtitle(org.telegram.messenger.gd.a0(null, null, 2131745318, user.first_name));
                }
            } else {
                this.D1.setSubtitle(null);
            }
        }
        if (s30Var != null) {
            if (s30Var.f39470c == 2) {
                if (s30Var.f39471e) {
                    str = "SuggestVideo";
                    i7 = 2131744162;
                } else {
                    str = "SuggestPhoto";
                    i7 = 2131744173;
                }
                M2(org.telegram.messenger.gd.M0(i7, str));
            }
            if (s30Var.f39471e) {
                this.T7.setText(org.telegram.messenger.gd.M0(2131745340, "SetCover"));
            }
            this.G.setBackground(null);
            this.G.setElevation(2.0f);
        }
    }

    public final void v3() {
        boolean z10;
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var != null) {
            if (!d1.f.u() && !this.f43310r) {
                z10 = false;
            } else {
                z10 = true;
            }
            f61Var.t0(z10);
        }
        if (!this.f43258k8) {
            this.f43209f1.setEnabled(false);
            this.f43209f1.setClickable(false);
            this.f43209f1.animate().alpha(0.5f).setDuration(180L).start();
            this.S7.setMode(0);
            return;
        }
        this.f43209f1.setEnabled(true);
        this.f43209f1.setClickable(true);
        this.f43209f1.animate().alpha(1.0f).setDuration(180L).start();
        if (this.f43310r) {
            if (this.f43202e4 == null) {
                this.N.a(org.telegram.messenger.gd.M0(2131745084, "SoundMuted"), true);
            }
            org.telegram.ui.Components.h00 h00Var = this.f43199e1;
            h00Var.f35685e = true;
            h00Var.invalidateSelf();
            if (this.f43251k1.getTag() != null) {
                this.f43251k1.setAlpha(0.5f);
                this.f43251k1.setEnabled(false);
            }
            if (this.d2 == 1) {
                this.S7.setMaxProgressDiff(9600.0f / this.f43241i8);
                this.S7.setMode(1);
                A3();
                return;
            }
            this.S7.setMaxProgressDiff(1.0f);
            this.S7.setMode(0);
            return;
        }
        this.N.a(this.D8, true);
        org.telegram.ui.Components.h00 h00Var2 = this.f43199e1;
        h00Var2.f35685e = false;
        h00Var2.invalidateSelf();
        if (this.f43251k1.getTag() != null) {
            this.f43251k1.setAlpha(1.0f);
            this.f43251k1.setEnabled(true);
        }
        this.S7.setMaxProgressDiff(1.0f);
        this.S7.setMode(0);
    }

    public final void w0(boolean z10, boolean z11, float f10) {
        if (f10 != this.f43338u1) {
            this.f43338u1 = f10;
            if (this.T4 != null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.f43338u1 - 1.0f) < 0.001f) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("speed" + org.telegram.messenger.fj.B0(this.T4.f23965k) + "_" + this.T4.e1()).commit();
                } else {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putFloat("speed" + org.telegram.messenger.fj.B0(this.T4.f23965k) + "_" + this.T4.e1(), this.f43338u1).commit();
                }
            }
            org.telegram.ui.Components.f61 f61Var = this.G2;
            if (f61Var != null) {
                f61Var.v0(this.f43338u1);
            }
            dq0 dq0Var = this.f43217g0;
            if (dq0Var != null) {
                dq0Var.setPlaybackSpeed(this.f43338u1);
            }
        }
        H2(true, z10);
        if (z11) {
            this.f43301q0.V(null, null);
        }
    }

    public final int w1(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f43358w2;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public final void w2(boolean z10) {
        if (this.f43286o2 != z10) {
            this.f43286o2 = z10;
            this.R1.setLayerType(2, null);
            this.R1.getCurrentView().setLayerType(2, null);
            this.R1.getNextView().setLayerType(2, null);
        }
    }

    public final void w3(float f10, float f11, float f12, float f13) {
        float f14 = f10 - (f12 / 2.0f);
        float f15 = f11 - (f13 / 2.0f);
        boolean z10 = this.U8;
        RectF rectF = this.T8;
        if (!z10 || Math.abs(rectF.left - f14) >= 1.0f || Math.abs(rectF.top - f15) >= 1.0f || Math.abs(rectF.width() - f12) >= 1.0f || Math.abs(rectF.height() - f13) >= 1.0f) {
            rectF.set(f14, f15, f12 + f14, f13 + f15);
            this.U8 = true;
            if (this.P8 != null && !this.V8) {
                this.V8 = true;
                org.telegram.messenger.g0.h3(this.W8, 150L);
            }
        }
    }

    public final void x0(boolean z10) {
        int i7 = this.P4;
        if (i7 >= 0 && i7 < this.f43224g7.size() && F1()) {
            if (z10) {
                d0();
            }
            b1().p();
        }
    }

    public final long x1() {
        dq0 dq0Var = this.f43217g0;
        if (dq0Var != null && dq0Var.f36753y) {
            return dq0Var.getVideoDuration();
        }
        org.telegram.ui.Components.f61 f61Var = this.G2;
        if (f61Var == null) {
            return 0L;
        }
        return f61Var.U();
    }

    public final void x2() {
        org.telegram.ui.Components.v51 v51Var;
        org.telegram.ui.Components.v51 v51Var2;
        if (!this.f43228h2 && this.d2 == 1) {
            if (!this.f43322s1 || ((v51Var2 = (org.telegram.ui.Components.v51) this.C2) != null && v51Var2.getVideoWidth() > 0 && v51Var2.getVideoHeight() > 0)) {
                this.f43228h2 = true;
                Bitmap n10 = this.C4.n();
                int i7 = this.C4.V;
                if (n10 == null) {
                    n10 = this.f43234i0.getBitmap();
                    i7 = this.f43234i0.getOrientation();
                }
                Bitmap bitmap = n10;
                int i10 = i7;
                if (bitmap != null || this.C2 != null) {
                    org.telegram.ui.Components.qd0 qd0Var = this.D1;
                    if (this.f43322s1) {
                        v51Var = (org.telegram.ui.Components.v51) this.C2;
                    } else {
                        v51Var = null;
                    }
                    qd0Var.b(bitmap, i10, false, false, this.E1, v51Var, this.X4.f50266c);
                }
            }
        }
    }

    public final void x3(int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.x3(int, boolean):void");
    }

    public final void y0() {
        vp0 vp0Var = this.M1;
        Activity activity = this.E;
        hn0 hn0Var = new hn0(this, 1);
        if (vp0Var.f57880v1) {
            vp0Var.w0(false);
        } else if (vp0Var.Q1) {
            vp0Var.k0(true);
        } else if (vp0Var.D0 && vp0Var.C0 != null) {
            vp0Var.r0(null, true);
        } else if (vp0Var.f57867p0.a()) {
            if (activity == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, vp0Var.A1);
            String M0 = org.telegram.messenger.gd.M0(2131747085, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.U = M0;
            u1Var.S = org.telegram.messenger.gd.M0(2131751394, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747387, null), new org.telegram.ui.ActionBar.p(hn0Var, 27));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            Q2(alertDialog$Builder);
        } else {
            hn0Var.run();
        }
    }

    public final int y1() {
        int measuredHeight;
        int e12 = e1();
        qq0 qq0Var = this.f43208f0;
        if (qq0Var != null && (measuredHeight = qq0Var.getMeasuredHeight()) > 0) {
            return Math.min(e12, measuredHeight);
        }
        return e12;
    }

    public final void y2(org.telegram.messenger.fj fjVar, CharSequence charSequence, boolean z10, boolean z11) {
        TextView currentView;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i10;
        boolean z18;
        TLRPC.Message message;
        ViewGroup viewGroup;
        SpannableStringBuilder cloneSpans = org.telegram.ui.Components.x5.cloneSpans(charSequence, 3);
        U2(this.R4, z11);
        if (!this.R4 && this.d2 != 1) {
            this.V1.setVisibility(8);
            this.W1.setVisibility(8);
            if (this.f43244j2) {
                if (this.R1.getParent() != this.Q0) {
                    FrameLayout frameLayout = this.f43162a2;
                    if (frameLayout != null) {
                        frameLayout.removeView(this.R1);
                    }
                    this.R1.setMeasureAllChildren(false);
                    this.Q0.addView(this.R1, c8.ma.d(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
                }
            } else {
                if (this.U1 == null) {
                    FrameLayout frameLayout2 = new FrameLayout(this.f43208f0.getContext());
                    this.f43162a2 = frameLayout2;
                    this.R1.setContainer(frameLayout2);
                    wp0 wp0Var = new wp0(this, this.f43208f0.getContext(), this.R1, this.f43162a2, 0);
                    this.U1 = wp0Var;
                    this.R1.setScrollView(wp0Var);
                    this.f43162a2.setClipChildren(false);
                    this.U1.addView(this.f43162a2, new ViewGroup.LayoutParams(-1, -2));
                    this.f43208f0.addView(this.U1, c8.ma.e(-1, -1, 80));
                }
                if (this.R1.getParent() != this.f43162a2) {
                    this.Q0.removeView(this.R1);
                    this.R1.setMeasureAllChildren(true);
                    this.f43162a2.addView(this.R1, -1, -2);
                    this.f43324s3.bringToFront();
                }
                if (fjVar != null && fjVar.r4()) {
                    if (this.S1 == null) {
                        FrameLayout frameLayout3 = new FrameLayout(this.F);
                        this.S1 = frameLayout3;
                        frameLayout3.setBackground(org.telegram.ui.ActionBar.n6.b0(620756991, 369098751, 8, 8));
                        c8.ra.b(this.S1, 0.05f, 1.25f);
                        TextView textView = new TextView(this.F);
                        this.T1 = textView;
                        textView.setTextSize(1, 14.0f);
                        this.T1.setTextColor(-1);
                        this.T1.setTypeface(org.telegram.messenger.g0.o());
                        this.S1.addView(this.T1, c8.ma.e(-2, -2, 17));
                        this.S1.setOnClickListener(new vn0(this, 7));
                    }
                    org.telegram.messenger.g0.E2(this.S1);
                    this.T1.setText(fjVar.Y0);
                    this.f43162a2.addView(this.S1, c8.ma.d(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                    this.R1.setPadding(0, 0, 0, org.telegram.messenger.g0.L(64.0f));
                    this.S1.bringToFront();
                } else {
                    FrameLayout frameLayout4 = this.S1;
                    if (frameLayout4 != null) {
                        org.telegram.messenger.g0.E2(frameLayout4);
                        this.R1.setPadding(0, 0, 0, 0);
                    }
                }
            }
            boolean isEmpty = TextUtils.isEmpty(cloneSpans);
            boolean isEmpty2 = TextUtils.isEmpty(this.R1.getCurrentView().getText());
            mq0 mq0Var = this.R1;
            if (z11) {
                currentView = mq0Var.getNextView();
            } else {
                currentView = mq0Var.getCurrentView();
            }
            if (this.f43322s1) {
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
                if (this.f43244j2) {
                    Point point = org.telegram.messenger.g0.f24118q;
                    if (point.x > point.y) {
                        i7 = 5;
                    } else {
                        i7 = 10;
                    }
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                if (maxLines != i7) {
                    this.R1.getCurrentView().setMaxLines(i7);
                    this.R1.getNextView().setMaxLines(i7);
                    this.R1.getCurrentView().setEllipsize(null);
                    this.R1.getNextView().setEllipsize(null);
                }
            }
            currentView.setScrollX(0);
            boolean z19 = this.f43244j2;
            if (!z19 && z11 && isEmpty) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f43277n2 = z12;
            if (!z19) {
                this.U1.m0 = false;
            }
            if (z11) {
                if (z19) {
                    viewGroup = this.Q0;
                } else {
                    viewGroup = this.U1;
                }
                TransitionManager.endTransitions(viewGroup);
                if (this.f43244j2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.addTransition(new Fade(1));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.Q0, transitionSet);
                } else {
                    TransitionSet duration = new TransitionSet().addTransition(new xp0(this, isEmpty2, isEmpty, 1)).addTransition(new xp0(this, isEmpty2, isEmpty, 0)).setDuration(200L);
                    if (!isEmpty2) {
                        this.U1.m0 = true;
                        duration.addTransition(new org.telegram.ui.Components.al0(this, 2));
                    }
                    if (isEmpty2 && !isEmpty) {
                        duration.addTarget((View) this.R1);
                    }
                    TransitionManager.beginDelayedTransition(this.U1, duration);
                }
                z13 = true;
            } else {
                this.R1.getCurrentView().setText((CharSequence) null);
                wp0 wp0Var2 = this.U1;
                if (wp0Var2 != null) {
                    wp0Var2.scrollTo(0, 0);
                }
                z13 = false;
            }
            if (!isEmpty) {
                org.telegram.ui.ActionBar.n6.K(null, true);
                if (fjVar == null || !this.f43280n5 || (message = fjVar.f23965k) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, org.telegram.ui.Components.y21.N0())) {
                    if (fjVar != null && !fjVar.f23965k.entities.isEmpty()) {
                        SpannableString spannableString = new SpannableString(cloneSpans);
                        fjVar.c(spannableString, true, false);
                        if (org.telegram.messenger.fj.L4(fjVar.f23965k)) {
                            org.telegram.messenger.fj.h(fjVar.P3(), spannableString, false, 3, (int) fjVar.L0(), false);
                        }
                        cloneSpans = org.telegram.messenger.j6.m(spannableString, currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    } else {
                        cloneSpans = org.telegram.messenger.j6.m(new SpannableStringBuilder(cloneSpans), currentView.getPaint().getFontMetricsInt(), false, null, 0);
                    }
                }
                if (fjVar != null && fjVar.r4()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (!TextUtils.isEmpty(fjVar.S0)) {
                        spannableStringBuilder.append((CharSequence) fjVar.S0);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.setSpan(new fi.g8(1), 0, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    spannableStringBuilder.append(cloneSpans);
                    cloneSpans = spannableStringBuilder;
                }
                this.R1.setTag(cloneSpans);
                try {
                    mq0 mq0Var2 = this.R1;
                    if (this.f43303q2 != z10) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    mq0Var2.a(cloneSpans, z11, z18);
                    wp0 wp0Var3 = this.U1;
                    if (wp0Var3 != null) {
                        wp0Var3.H(wp0Var3.getWidth(), wp0Var3.getHeight());
                    }
                    z14 = true;
                } catch (Exception e10) {
                    z14 = true;
                    org.telegram.messenger.a8.g(e10, true);
                }
                currentView.setScrollY(0);
                currentView.setTextColor(-1);
                if (this.K && (!this.f43322s1 || this.Q0.getVisibility() == 0 || this.f43248j7 != null)) {
                    z17 = z14;
                } else {
                    z17 = false;
                }
                mq0 mq0Var3 = this.R1;
                if (z17) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                mq0Var3.setVisibility(i10);
            } else {
                z14 = true;
                if (this.f43244j2) {
                    this.R1.a(org.telegram.messenger.gd.M0(2131754452, "AddCaption"), z11, false);
                    this.R1.getCurrentView().setTextColor(-1291845633);
                    this.R1.setTag("empty");
                    this.R1.setVisibility(0);
                } else {
                    this.R1.a(null, z11, false);
                    this.R1.getCurrentView().setTextColor(-1);
                    mq0 mq0Var4 = this.R1;
                    if (z13 && !isEmpty2) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    mq0Var4.b(4, z15);
                    this.R1.setTag(null);
                }
            }
            if (this.R1.getCurrentView() instanceof lq0) {
                ((lq0) this.R1.getCurrentView()).setLoading(z10);
            }
            if (!isEmpty && z10) {
                z16 = z14;
            } else {
                z16 = false;
            }
            this.f43303q2 = z16;
            return;
        }
        b1().setText(cloneSpans);
        this.R1.setVisibility(8);
    }

    public final void y3() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.y3():void");
    }

    public final void z0(boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.z0(boolean, boolean):void");
    }

    public final boolean z1() {
        if (Y0(true) != 0) {
            return true;
        }
        return false;
    }

    public final void z2(int i7) {
        A2(i7, true, false, false);
    }

    public final void z3() {
        long j3;
        int H;
        org.telegram.messenger.fj fjVar;
        uq0 uq0Var = this.d;
        if (uq0Var != null) {
            int H2 = uq0Var.H();
            this.P0.a(H2);
            if (H2 == 0) {
                n3(false, true);
            }
            if (this.T0 != null) {
                uq0 uq0Var2 = this.d;
                long j10 = 0;
                if (uq0Var2 != null) {
                    j3 = uq0Var2.a();
                } else {
                    j3 = 0;
                }
                if (j3 == 0 && (fjVar = this.T4) != null) {
                    j3 = org.telegram.messenger.fj.B0(fjVar.f23965k);
                }
                oi.u1 u1Var = this.T0;
                uq0 uq0Var3 = this.d;
                if (uq0Var3 == null || !uq0Var3.q() || this.d.w()) {
                    j10 = org.telegram.messenger.mp.u1(this.U).P1(j3);
                }
                uq0 uq0Var4 = this.d;
                if (uq0Var4 == null) {
                    H = 1;
                } else {
                    H = uq0Var4.H();
                }
                u1Var.i(Math.max(1, H), j10, true);
            }
        }
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
